package org.dea.packlab1;

import java.util.*;


public class Graph2 {
      HashMap<String, Integer> th;
      String[] keys;
      ArrayList<Integer>[] adjList;
	
	public void grafoaSortu(ArrayList<Aktore> lAktoreak){
		// Post: aktoreen zerrendatik grafoa sortzen du
		//       Adabegiak aktoreen izenak eta pelikulen izenburuak dira 
		
		// 1. pausoa: th bete
	 	int kont = 0;
		for (Aktore a: lAktoreak){
			th.put(a.getIzena(), kont);
			kont++;
			for(Pelikula p: a.getListaP()){
				if (!th.containsKey(p.getIzenburua())){
					th.put(p.getIzenburua(), kont);
					kont++;
				}
			}

            // 2. pausoa: keys bete
			keys = new String[th.size()];
			for (String k: th.keySet()) keys[th.get(k)] = k;

            // 3. pausoa: adjLista bete
			adjList = (ArrayList<Integer>[])new ArrayList[4];
		}
	}
	
	public void print(){
	   for (int i = 0; i < adjList.length; i++){
		System.out.print("Element: " + i + " " + keys[i] + " --> ");
		for (int k: adjList[i])  System.out.print(keys[k] + " ### ");
		
		System.out.println();
	   }
	}
	
	public boolean estanConectados(String a1, String a2){
		Queue<Integer> aztertuGabeak = new LinkedList<Integer>();
		
		int pos1 = th.get(a1);
		int pos2 = th.get(a2);
		boolean aurkitua = false;
		boolean[] aztertuak = new boolean[th.size()];

                 // KODEA OSATU
		
		return aurkitua;

	}
}