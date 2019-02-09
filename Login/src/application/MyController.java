package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MyController implements Initializable {

	@FXML
	private Button BtnCheck;
	
	@FXML
	private TextField TextFL;
	
	@FXML
	private TextField TextFP;
	
	@FXML
	private Text TextT;
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		
	}

	
	public void CheckForTroubles () {
		String password = TextFP.getText();
		String login = TextFL.getText();
		String passwordR = "qwerty14228";
		String loginR = "asdfgh567";
		String s;
		if (password.contentEquals(passwordR) && login.contentEquals(loginR)) {
			s = "Поздравляем, Вы успешно авторизировались!";
		} else {
			s = "Нам очень жаль, но в вашем пароле или логине содержится ошибка.";
		}
		TextT.setText(s);
	}
}
