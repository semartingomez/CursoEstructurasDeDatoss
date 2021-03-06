/*
# Queues based on Lists.
#
# Created by Msc. Carlos Andres Sierra on April 2018.
# Copyright (c) 2018  Msc. Carlos Andres Sierra. Research Group on Artificial Life - ALIFE. All rights reserved.
#
# This file is part of DataStructuresTemplates.
#
# DataStructuresTemplates is free software: you can redistribute it and/or modify it under the terms of the
# GNU General Public License as published by the Free Software Foundation, version 3.
*/

/**
 * This class represents the behavior of Queues
 * @author MSc. Carlos Andres Sierra, PhD. student
 */
public class Queue {
	
	Node head = null; //
	
	public Queue() {}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return head == null ? true : false;
	}
	
	
	/**
	 * 
	 * @param newNode
	 */
	public void enqueue(Node newNode)
	{
		Node rec = head;
		if(!this.isEmpty()) 
			while(rec.getNext()!=null) 
				rec=rec.getNext();
			
			rec.setNext(newNode);
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Node dequeue()
	{
		Node temp = head;
		head = temp.getNext();
		temp.setNext(null);
		
		return temp;
	}
}