package bsTreeNode;

public class BsTreeNode {
	private Integer data; //for the data in the node
	private BsTreeNode left; //for left child
	private BsTreeNode right; //for right child
	
	
	BsTreeNode(Integer element, BsTreeNode left,BsTreeNode right){
		this.data=element;
		this.left=left;
		this.right=right;
	}
	
	
}
