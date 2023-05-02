package com.greatlearning.GroupAssignment_ques2.main;

import com.greatlearning.GroupAssignment_ques2.model.Node;

class BSTMain
{
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	
	static void Skewed(Node root)
	{
	
		// Base Case
		if(root == null)
		{
			return;
		}
	
			Skewed(root.left);
		
		Node rightNode = root.right;
		Node leftNode = root.left;
	
		
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
	
	
	
		
			Skewed(rightNode);
		
	}


	static void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);	
	}


	public static void main (String[] args)
	{

		BSTMain tree = new BSTMain();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
	 
		System.out.println("The resultant skewed tree is : \n ");
	
		Skewed(node);
		traverseRightSkewed(headNode);
	}
}
