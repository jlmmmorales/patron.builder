package org.curso.accenture.patron.builder;

public class AlgorithmBuilder {
  private String name;
  private int maximunNumberOfEvaluations;
  private int maximumComputingTime;
  private int memoryRequirement;
  private String operator;
  
  public AlgorithmBuilder() {
    
  }
  
  public AlgorithmBuilder setName(String name) {
    this.name = name;
    return this;
  }
  
  public AlgorithmBuilder setMaximunNumberOfEvaluations(int maximunNumberOfEvaluations) {
    this.maximunNumberOfEvaluations = maximunNumberOfEvaluations;
    return this;
  }
  
  public AlgorithmBuilder setMaximumComputingTime(int maximumComputingTime) {
    this.maximumComputingTime = maximumComputingTime;
    return this;
  }
  
  public AlgorithmBuilder setMemoryRequirement(int memoryRequirement) {
    this.memoryRequirement = memoryRequirement;
    return this;
  }
  
  public AlgorithmBuilder setOperator(String operator) {
    this.operator = operator;
    return this;
  }
  
  public Algorithm build() {
    return new Algorithm(name, maximunNumberOfEvaluations, maximumComputingTime, memoryRequirement, operator);
  }
}
