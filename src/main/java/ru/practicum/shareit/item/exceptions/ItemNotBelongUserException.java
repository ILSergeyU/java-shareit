package ru.practicum.shareit.item.exceptions;

public class ItemNotBelongUserException extends RuntimeException {
    public ItemNotBelongUserException(String message) {
        super(message);
    }
}