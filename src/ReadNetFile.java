import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class ReadNetFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			URL url = new URL("https://api.yieldmanager.com/api-1.37/entity.php?wsdl");
			InputStream in = url.openStream();
			BufferedInputStream buf = new BufferedInputStream(in);
			
			StringBuilder sb = new StringBuilder();
			
			while (true) {
				int data = buf.read();
				if (data != -1){
					sb.append((char)data);
				}else{
					break;
				}
			}
			
			System.out.println(sb);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
