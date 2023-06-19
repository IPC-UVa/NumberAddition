
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author macoa
 */
public class NumberAddition extends javax.swing.JFrame {

    private ArrayList<String> historial = new ArrayList<>();

    /**
     * Creates new form NumberAddition
     */
    public NumberAddition() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        primerNumeroTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        segundoNumeroTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        resultadoTextField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        errorLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historialTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(5, 0));

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("Primer número");
        jPanel2.add(jLabel1);

        primerNumeroTextField.setColumns(5);
        jPanel2.add(primerNumeroTextField);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel2.setText("Segundo número");
        jPanel3.add(jLabel2);

        segundoNumeroTextField.setColumns(5);
        jPanel3.add(segundoNumeroTextField);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel3.setText("Resultado");
        jPanel4.add(jLabel3);

        resultadoTextField.setColumns(5);
        jPanel4.add(resultadoTextField);

        jPanel1.add(jPanel4);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        errorLabel.setForeground(new java.awt.Color(204, 51, 0));
        jPanel6.add(errorLabel);

        jPanel1.add(jPanel6);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel5.add(addButton);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel5.add(clearButton);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel5.add(exitButton);

        jPanel1.add(jPanel5);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        historialTextArea.setEditable(false);
        historialTextArea.setColumns(20);
        historialTextArea.setRows(5);
        jScrollPane1.setViewportView(historialTextArea);

        jPanel7.add(jScrollPane1);

        getContentPane().add(jPanel7, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        double num1, num2, result;
        /*
        num1 = Float.parseFloat(primerNumeroTextField.getText());
        num2 = Float.parseFloat(segundoNumeroTextField.getText());*/
        try {
            num1 = Double.parseDouble(primerNumeroTextField.getText());
        } catch (NumberFormatException e) {
            errorLabel.setText("El primer número debe ser un número decimal");
            return;
        }
        try {
            num2 = Double.parseDouble(segundoNumeroTextField.getText());
        } catch (NumberFormatException e) {
            errorLabel.setText("El segundo número debe ser un número decimal");
            return;
        }
        result = num1 + num2;
        resultadoTextField.setText(String.valueOf(result));
        historial.add(num1 + "+" + num2);
        errorLabel.setText("");
        actualizarHistorial();
    }//GEN-LAST:event_addButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        primerNumeroTextField.setText("");
        segundoNumeroTextField.setText("");
        resultadoTextField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void actualizarHistorial() {
        String historialText = "";
        for (String elem : this.historial) {
            historialText += elem + "\n";
        }
        historialTextArea.setText(historialText);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NumberAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberAddition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextArea historialTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField primerNumeroTextField;
    private javax.swing.JTextField resultadoTextField;
    private javax.swing.JTextField segundoNumeroTextField;
    // End of variables declaration//GEN-END:variables
}
