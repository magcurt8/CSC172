/*
 *InfixPostfixCalculator
 *Version 1.0
 *Copyright Margaret M. Curtis
 *CSC 172 Spring 2015
 *Margaret M. Curtis
 *MW 2-3:15PM
 *Partners: Scott Onestak, Elias Davis
 *Last Revised: March 7, 2015
 */
public class Node<AnyType> {
	public AnyType data;
	public Node<AnyType> next;
	public Node(AnyType x) {data=x;}
}