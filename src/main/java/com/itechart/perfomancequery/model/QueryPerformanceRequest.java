package com.itechart.perfomancequery.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

public class QueryPerformanceRequest {

  @NotNull
  @NotEmpty
  private List<String> queries;

  private Set<String> database;

  public List<String> getQueries() {
    return queries;
  }

  public void setQueries(List<String> queries) {
    this.queries = queries;
  }

  public Set<String> getDatabase() {
    return database;
  }

  public void setDatabase(Set<String> database) {
    this.database = database;
  }
}
