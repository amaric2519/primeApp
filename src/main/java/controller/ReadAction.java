package controller;

import database.DatabaseImpl;
import gui.MainFrame;
import resource.data.Row;
import tree.TreeItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ReadAction extends AbstractAction implements MouseListener {

    private int row;

    public ReadAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
                KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("read"));
        putValue(NAME, "Read employee");
        putValue(SHORT_DESCRIPTION, "Read all employees data");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int row = MainFrame.getInstance().getjTable().getSelectedRow();
        TreeItem item = (TreeItem) MainFrame.getInstance().getjTree().getLastSelectedPathComponent();
        String id = MainFrame.getInstance().getjTable().getValueAt(row,1).toString();
        String query = "select * from " + item.getName() + " where employeeID = " + id;
        MainFrame.getInstance().getAppCore().fetchData(query);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
//        int row = MainFrame.getInstance().getjTable().getSelectedRow();
//        TreeItem item = (TreeItem) MainFrame.getInstance().getjTree().getLastSelectedPathComponent();
//        String id = MainFrame.getInstance().getjTable().getValueAt(row,1).toString();
//        String query = "select * from " + item.getName() + " where employeeID = " + id;
//        MainFrame.getInstance().getAppCore().fetchData(query);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
