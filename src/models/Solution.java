package models;

public class Solution {
    private String steps;
    private String answer;

    public void addStep(String stepDescription) {
        if (steps == null || steps.isEmpty()) {
            steps = stepDescription;
        } else {
            steps += "\n" + stepDescription;  // Add a newline before each new step.
        }
    }
}
