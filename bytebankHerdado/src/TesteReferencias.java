
public class TesteReferencias {

	public static void main(String[] args) {
	
		Gerente g1 = new Gerente();
		g1.setSalario(5000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());

	}

}
