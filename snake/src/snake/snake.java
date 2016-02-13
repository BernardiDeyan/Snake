package snake;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class snake {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			snake window = new snake();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		shell.setSize(641, 528);
		shell.setText("SWT Application");
		
		Canvas canvas = new Canvas(shell, SWT.NONE);
		canvas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		canvas.setBounds(10, 148, 605, 332);
		
		Button btnSu = new Button(shell, SWT.NONE);
		btnSu.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
			}
		});
		btnSu.setBounds(284, 86, 32, 25);
		btnSu.setText("^");
		
		Button btnGiu = new Button(shell, SWT.NONE);
		btnGiu.setText("v");
		btnGiu.setBounds(284, 117, 32, 25);
		
		Button btnDx = new Button(shell, SWT.NONE);
		btnDx.setText(">");
		btnDx.setBounds(322, 117, 32, 25);
		
		Button btnSx = new Button(shell, SWT.NONE);
		btnSx.setText("<");
		btnSx.setBounds(246, 117, 32, 25);
		
		Label lblSnake = new Label(shell, SWT.NONE);
		lblSnake.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		lblSnake.setFont(SWTResourceManager.getFont("Segoe UI Light", 30, SWT.BOLD));
		lblSnake.setBounds(246, 10, 120, 54);
		lblSnake.setText("Snake");

	}
}
