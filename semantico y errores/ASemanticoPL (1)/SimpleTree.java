import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.util.Vector;



public class SimpleTree extends JFrame {

	public SimpleTree(Red red) {
		super("Red social");

		Container content = getContentPane();

		DefaultMutableTreeNode root = processHierarchy(red);
		JTree tree = new JTree(root);
		content.add(new JScrollPane(tree), BorderLayout.CENTER);
		setSize(275, 300);
		setVisible(true);
	}



	private DefaultMutableTreeNode processHierarchy(Red red) {
		DefaultMutableTreeNode node = new DefaultMutableTreeNode(red.getNombre());
		DefaultMutableTreeNode child;
		DefaultMutableTreeNode password;
		DefaultMutableTreeNode fecha;
		DefaultMutableTreeNode amigos;
		for (int i = 0; i < red.getMiembros().size(); i++) {
			Usuario nodeSpecifier =red.getMiembros().elementAt(i);
			password = new DefaultMutableTreeNode("PASSWORD: "
					+ nodeSpecifier.getPassword());
			fecha = new DefaultMutableTreeNode("FECHA DE ALTA: "
					+ nodeSpecifier.getFecha());
			child = new DefaultMutableTreeNode(nodeSpecifier.getNombre()); // Ie Leaf
			amigos = new DefaultMutableTreeNode("Amistades");
			child.add(password);
			child.add(fecha);

			for (int j = 0; j < red.getAmistades().size(); j++) {
				if (red.getAmistades().elementAt(j).getOrigen().equals(nodeSpecifier.getNombre()))
					amigos.add(new DefaultMutableTreeNode(red.getAmistades()
							.elementAt(j).getDestino()));
				if (red.getAmistades().elementAt(j).getDestino().equals(nodeSpecifier.getNombre()))
					amigos.add(new DefaultMutableTreeNode(red.getAmistades()
							.elementAt(j).getOrigen()));
			}
			child.add(amigos);
			node.add(child);
		}
		return (node);
	}
}
