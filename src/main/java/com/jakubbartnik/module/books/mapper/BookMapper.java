package com.jakubbartnik.module.books.mapper;

import com.jakubbartnik.module.books.dto.BookDto;
import com.jakubbartnik.module.books.entity.BooksEntity;

import java.util.List;
import java.util.stream.Collectors;

public class BookMapper {

    public static BookDto map(BooksEntity entity){
        return new BookDto()
                .setAuthor(entity.getAuthor())
                .setTitle(entity.getTitle())
                .setDetails(BookDetailsMapper.map(entity.getDetails()))
                .setTags(BooksTagsMapper.map(entity.getTags()));
    }

    public static List<BookDto> map(List<BooksEntity> entities){
        return entities
                .stream()
                .map(BookMapper::map)
                .collect(Collectors.toList());
    }
}
