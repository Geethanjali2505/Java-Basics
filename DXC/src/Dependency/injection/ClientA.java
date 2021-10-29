package Dependency.injection;

public class ClientA  implements Client{
	Service service;       //clientA is dependent on an object of ServiceB [dependency]
	//service = new ServiceB()  im not going to create this object

	public ClientA(Service serviceb) {
		service = serviceb;
	}


	@Override
	public void doSomething() {    
		String info = service.getInfo();
		System.out.println(info);
	}

}
