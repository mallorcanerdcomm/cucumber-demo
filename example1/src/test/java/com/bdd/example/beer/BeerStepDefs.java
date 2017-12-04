package com.bdd.example.beer;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static junit.framework.Assert.assertEquals;

public class BeerStepDefs {

    private BeerFridge fridge;
    private int consumed;

    @And("^I drink one beer from the fridge$")
    public void I_pop_from_the_fridge() {
         consumed = fridge.drink(1);
    }

    @And("^I push another beer on the fridge$")
    public void I_push_another_item_into_the_fridge() {
        I_push_an_item_into_the_fridge();
    }

    @Given("^an empty fridge$")
    public void an_empty_fridge() {
        fridge = new BeerFridge();
    }

    @Then("^I get the same beer back$")
    public void I_get_the_same_item_back() {
        assertEquals(fridge.size(), consumed);
    }

    @Then("^the fridge contains one item$")
    public void the_fridge_contains_one_item() {
        assertEquals(1, fridge.size());
    }

    @Then("^the fridge contains two beers$")
    public void the_fridge_contains_two_items() {
        assertEquals(2, fridge.size());
    }

    @When("^I push a beer on the fridge$")
    public void I_push_an_item_into_the_fridge() {
        fridge.pushBeer(1);
    }

    @When("^We push some beers on the fridge$")
    public void wePushSomeBeersOnTheFridge(final DataTable dataTable) throws Throwable {
        int beers = dataTable.raw().stream().mapToInt(row -> Integer.valueOf(row.get(0))).sum();
        fridge.pushBeer(beers);
    }

    @And("^We drink some beers with my friends$")
    public void weDrinkSomeBeersWithMyFriendsOnTheBddMeeting(final DataTable dataTable) throws Throwable {
        int beers = dataTable.raw().stream().mapToInt(row -> Integer.valueOf(row.get(0))).sum();
        fridge.drink(beers);
    }

    @Then("^Inyaki has got (\\d+) beers on the fridge and he'll be able to survive$")
    public void inyakiHasGotBeersOnTheFridgeAndHeLlBeAbleToSurvive(final int beers) throws Throwable {
        assertEquals(fridge.size(), beers);
    }

    @When("^one beer fddsfdsf$")
    public void oneBeerFddsfdsf() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^dsafdsgfds$")
    public void dsafdsgfds() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
