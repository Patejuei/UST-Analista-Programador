package Logic;
import Data.vAlumno;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;


public class fCliente {
    private conexion mysql=new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";


    public DefaultTableModel mostrar(String buscar)
    {
        DefaultTableModel modelo;
        String [] titulos={"id","Nombre","Codigo","N1", "N2", "N3", "Promedio", "Condicion"};
        String [] registro=new String [8];

        modelo=new DefaultTableModel(null,titulos);

        sSQL="select * from alumnos where nombre like '%"+buscar+"%' order by id";
        try{
            //Declaro variable de tipo Statement
            Statement st= (Statement) cn.createStatement();
            //crear variable tipo resultset ejecuta la consulta de arriba
            ResultSet rs=st.executeQuery(sSQL);

            while(rs.next())
            {
                registro [0]=rs.getString("Id");
                registro [1]=rs.getString("Nombre");
                registro [2]=rs.getString("Codigo");
                registro [3]=rs.getString("N1");
                registro [4]=rs.getString("N2");
                registro [5]=rs.getString("N3");
                registro [6]=rs.getString("Promedio");
                registro [7]=rs.getString("Condicion");

                modelo.addRow(registro);
            }
            return modelo;
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar (vAlumno dts){
        sSQL="insert into alumnos (nombre,N1, N2, N3, Promedio, Condicion, Codigo)" +
                "values (?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getN1());
            pst.setString(3, dts.getN2());
            pst.setString(4, dts.getN3());
            pst.setString(5, dts.getPromedio());
            pst.setString(6, dts.getCondicion());
            pst.setString(7, dts.getCodigo());





            int n=pst.executeUpdate();

            if (n!=0){
                return true;
            }
            else {
                return false;
            }



        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar (vAlumno dts){
        sSQL="update alumnos set nombre=?, N1=?, N2=?, N3=?, Promedio = ?, Condicion = ? "+
                " where id=?";


        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getN1());
            pst.setString(3, dts.getN2());
            pst.setString(4, dts.getN3());
            pst.setString(5, dts.getPromedio());
            pst.setString(6, dts.getCondicion());
            pst.setInt(7, dts.getId());



            int n=pst.executeUpdate();

            if (n!=0){
                return true;
            }
            else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar (vAlumno dts){
        sSQL="delete from alumnos where id=?";

        try {

            PreparedStatement pst=cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getId());

            int n=pst.executeUpdate();

            if (n!=0){
                return true;
            }
            else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

}
