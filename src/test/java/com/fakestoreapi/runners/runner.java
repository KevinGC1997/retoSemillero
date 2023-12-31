package com.fakestoreapi.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/FakeStoreApi.feature",
        glue = "com.fakestoreapi.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@PostUser or @PutUser or @DeleteUser"
)
public class runner {
}
