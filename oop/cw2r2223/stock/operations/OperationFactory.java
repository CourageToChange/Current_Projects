/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.operations;

import oop.cw2r2223.stock.model.Operation;
import oop.cw2r2223.stock.operations.add.AddOperation;
import oop.cw2r2223.stock.operations.delete.DeleteOperation;

/**
 *
 * @author childm
 */
public class OperationFactory {

    public enum OpID {
        ADD, DELETE
    };

    public Operation createOperation(OpID operation) {
        switch (operation) {
            case ADD:
                return new AddOperation();
            case DELETE:
                return new DeleteOperation();
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }

}
