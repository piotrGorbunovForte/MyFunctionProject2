package com.example;

import java.util.List;

public class FunctionOutput {
  private final List<String> accounts;

  public FunctionOutput(List<String> accounts) {
    this.accounts = accounts;
  }

  public List<String> getAccounts() {
    return accounts;
  }
}
