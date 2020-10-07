import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {
  public static void main(String[] args) {
//	Path filePath = Paths.get("F:/", "myFile.txt");
//	
//	try{
//		
//		Stream<String> line = Files.lines(filePath);
//		line.forEach(str->{
//			System.out.println(str);
//		});
//		line.close();
//	}catch (Exception e) {
//		// TODO: handle exception
//	}
	
	 Path filePath = Paths.get("F:/", "myFile.txt");
//	 try {
//		 Stream<String> lines = Files.lines(filePath);
//				 lines.filter(str ->str.equalsIgnoreCase("Ninad")).forEach(System.out::println);
//		
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
	 
//	 try {
//		BufferedWriter buff = Files.newBufferedWriter(filePath);
//		buff.append("My Name is Ninad");
//		buff.close();
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
//	 
//	 try {
//	 Stream<String> lines = Files.lines(filePath);
//	 lines.forEach(str->{
//		 System.out.println(str);
//	 });
//	 lines.close();
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
	 
	 try {
		String str = "String Data";
	    FileOutputStream fileOut = new FileOutputStream("F:/myFile.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
		objectOutputStream.writeObject(str);
		objectOutputStream.close();
	} catch (Exception e) {
		// TODO: handle exception
	}
	 
	 try {
		FileInputStream fileInputStream = new FileInputStream("F:/myFile.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		objectInputStream.read();
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
