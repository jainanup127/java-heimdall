package dev.heimz.heimdall.model.definition;

public class ModelDefinitionException extends IllegalArgumentException {

  public ModelDefinitionException(String message) {
    super(message);
  }

  public ModelDefinitionException(String message, Throwable exception) {
    super(message, exception);
  }
}
