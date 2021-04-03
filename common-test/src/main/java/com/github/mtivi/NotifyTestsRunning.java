package com.github.mtivi;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Used so other modules can have common notification
 * that their tests have run.
 */
@Slf4j
public abstract class NotifyTestsRunning {

    public abstract String getModuleName();

    @Test
    @DisplayName("Default test")
    public void test(){
        log.info("Running tests for module [{}]", getModuleName());
    }
}
