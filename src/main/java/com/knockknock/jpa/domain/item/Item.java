package com.knockknock.jpa.domain.item;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal initialPrice;

    @Future
    private LocalDateTime auctionEnd;

//    @ElementCollection
//    @CollectionTable(name = "image", joinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id"))
//    @MapKeyJoinColumn(name = "title")
//    private Map<String, String> images;
}
