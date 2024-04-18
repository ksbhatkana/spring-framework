package com.ksbhat.spring.springframework;

import com.ksbhat.spring.springframework.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ksbhat.spring.springframework.game")
public class AppGamingBasic {
    public static void main(String[] args) {
//        var marioGame = new MarioGame();
//        var superContraGame = new SuperContraGame();
//        var game = new SuperContraGame();
////        var gameRunner = new GameRunner(marioGame);
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();
        var gamingContext = new AnnotationConfigApplicationContext(AppGamingBasic.class);
        gamingContext.getBean(GamingConsole.class).up();
        gamingContext.getBean(GameRunner.class).run();
    }
}
