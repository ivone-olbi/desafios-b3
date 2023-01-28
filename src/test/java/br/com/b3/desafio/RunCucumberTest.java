package br.com.b3.desafio;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber",
                 plugin = { "json:target/cucumber.json", "pretty", "html:target/cucumber-reports.html" })
public class RunCucumberTest {}