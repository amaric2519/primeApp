package controller;

import gui.MainFrame;
import tree.TreeItem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class DeleteEmployeeAction extends AbstractAction{

    public DeleteEmployeeAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
                KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("delete"));
        putValue(NAME, "Delete employee");
        putValue(SHORT_DESCRIPTION, "Delete employee");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int row = MainFrame.getInstance().getjTable().getSelectedRow();

        TreeItem item = (TreeItem) MainFrame.getInstance().getjTree().getLastSelectedPathComponent();

        String table = item.getName();
        String id = MainFrame.getInstance().getjTable().getValueAt(row,1).toString();
        MainFrame.getInstance().getAppCore().deleteEmployee(table,Integer.parseInt(id));

    }
}
