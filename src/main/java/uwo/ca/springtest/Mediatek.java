package uwo.ca.springtest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mediatek")
@Primary
public class Mediatek implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Mediatek");
	}

}
