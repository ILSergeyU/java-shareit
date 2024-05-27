package ru.practicum.shareit.item.dto;

import lombok.Data;
import ru.practicum.shareit.request.ItemRequest;

/**
 * TODO Sprint add-controllers.
 */
@Data
public class ItemDto {
    private String id;
    private String name;
    private String description;
    private String available;
    private ItemRequest request;

    public ItemDto( String name, String description, String available, ItemRequest request) {

        this.name = name;
        this.description = description;
        this.available = available;
        this.request = request;
    }
}
