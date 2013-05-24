package org.henri;

import org.henri.cocktailfactory.ws.Cocktail;
import org.henri.cocktailfactory.ws.CocktailService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Henri Tremblay
 */
public class App {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/root-context.xml");
        CocktailService service = beanFactory.getBean(CocktailService.class);
        List<Cocktail> l = service.list();
        System.out.println(l);
    }
}
