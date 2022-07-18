package com.oreilly.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.*;

public class HelloControllerUnitTest {
    @Test
    public void sayHello() {
        HelloController controller = new HelloController();
        Model model = new BindingAwareModelMap(); // 오른쪽에서부터 읽어가며 해석
        String result = controller.sayHello("World", model);
        assertAll(
                () -> assertEquals("World", model.getAttribute("user")),
                () -> assertEquals("hello", result)
        );
    }
}
