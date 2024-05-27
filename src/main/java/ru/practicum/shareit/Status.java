package ru.practicum.shareit;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
public enum Status {
    WAITING,//  — новое бронирование, ожидает одобрения,
    APPROVED, // - бронирование подтверждено владельцем,
    REJECTED, // — бронирование отклонено владельцем,
    CANCELED // - бронирование отменено создателем.

}
