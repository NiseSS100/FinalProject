package store;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree extends JFrame {
    JFrame frame;

    Tree(){
        frame=new JFrame();
        DefaultMutableTreeNode store=new DefaultMutableTreeNode("Книжарница");
        DefaultMutableTreeNode romance=new DefaultMutableTreeNode("Художествена проза");
        DefaultMutableTreeNode horror=new DefaultMutableTreeNode("Фантастика и фентъзи");
        DefaultMutableTreeNode learning=new DefaultMutableTreeNode("Криминални и трилъри");
        store.add(romance);
        store.add(horror);
        store.add(learning);
        DefaultMutableTreeNode prideAndPrejudicendPrejudice=new DefaultMutableTreeNode("Pride and Prejudice");
        DefaultMutableTreeNode theNotebook=new DefaultMutableTreeNode("The Notebook");
        DefaultMutableTreeNode it=new DefaultMutableTreeNode("It");
        DefaultMutableTreeNode doctorSleep=new DefaultMutableTreeNode("Doctor Sleep");
        DefaultMutableTreeNode javaForDummies=new DefaultMutableTreeNode("Java For Dummies");
        DefaultMutableTreeNode beginningProgrammingForDummies=new DefaultMutableTreeNode("Beginning Programming For Dummies");

        romance.add(prideAndPrejudicendPrejudice);
        romance.add(theNotebook);
        horror.add(it);
        horror.add(doctorSleep);
        learning.add(javaForDummies);
        learning.add(beginningProgrammingForDummies);

        JTree jt=new JTree(store);
        frame.add(jt);
        frame.setSize(200,200);
        frame.setVisible(true);

        JPanel title = new JPanel();

        //title.add(welcomeTitle);
       /* public void welcomeTitle(); {
            String welcomeTitle =("<html>Добре дошли !</html>");
        }*/
    }
}
