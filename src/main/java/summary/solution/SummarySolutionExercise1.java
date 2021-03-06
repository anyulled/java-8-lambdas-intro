package summary.solution;

import org.junit.Test;

import summary.Exercise;

import java.io.File;
import java.util.Arrays;

/**
 * Using the listFiles(FileFilter) and isDirectory methods of the java.io.File
 * class, write a method that returns all subdirectories of a given directory.
 * Use a lambda expression instead of a FileFilter object. Repeat with a method
 * expression.
 * 
 * @author aohz
 *
 */
public class SummarySolutionExercise1 implements Exercise {

	@Test
	@Override
	public void perform() {
		Arrays.asList(getChildDirsWithLambda(".")).forEach(System.out::println);
		System.out.println("---------------------------------------------");
		Arrays.asList(getChildDirsWithMethodReference(".")).forEach(System.out::println);
	}

	private static File[] getChildDirsWithLambda(String dir) {
		File dirFile = new File(dir);
		return dirFile.listFiles(d -> d.isDirectory());
	}

	private static File[] getChildDirsWithMethodReference(String dir) {
		File dirFile = new File(dir);
		return dirFile.listFiles(File::isDirectory);
	}

}
