Meta:
    @layout desktop tablet phone

Scenario: Healthcheck
Given I am on page with URL `${vividus-test-site-url}`
Then number of elements found by `name(vividus-logo)` is = `1`
