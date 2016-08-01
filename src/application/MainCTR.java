package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class MainCTR  implements Initializable {

	@FXML
	private javafx.scene.control.TextField txtUsuario;
	
	@FXML
	private PasswordField txtSenha;
	
	@FXML
	private Button btnSair, btnEntrar;
	
	@FXML
	private Label lblStatus;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
				
		btnEntrar.setOnAction(b -> {
			
			
				//JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
				
				Task<Void> task =	new Task<Void>() {

					@Override
					protected Void call() throws Exception {
						
						updateMessage("...");
						
						try {
							Thread.sleep(1000);	
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						if(  txtUsuario.getText().equals("admin") && txtSenha.getText().equals("1234")  ){
							updateMessage("ACESSO PERMITIDO");
						}else{
							updateMessage("ACESSO NEGADO");
						}
							
						
						return null;
					}
				};
				
			new Thread(task).start();
			
			lblStatus.textProperty().bind(task.messageProperty());
				
			
		});
		
		btnSair.setOnAction(b-> System.exit(0) );
		
	}

}
