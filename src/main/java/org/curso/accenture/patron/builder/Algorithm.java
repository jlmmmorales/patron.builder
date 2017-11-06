package org.curso.accenture.patron.builder;

public class Algorithm {
  private String name;
  private int maximunNumberOfEvaluations;
  private int maximumComputingTime;
  private int memoryRequirement;
  private String operator;
  
  public Algorithm(String name, int maximunNumberOfEvaluations, int maximumComputingTime, int memoryRequirement, String operator) {
    this.name = name;
    this.maximunNumberOfEvaluations = maximunNumberOfEvaluations;
    this.maximumComputingTime = maximumComputingTime;
    this.memoryRequirement = memoryRequirement;
    this.operator = operator;
  }
  
}
