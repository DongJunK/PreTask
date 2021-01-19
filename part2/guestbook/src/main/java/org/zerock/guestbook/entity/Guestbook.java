package org.zerock.guestbook.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Guestbook extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gno;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 1500, nullable = false)
    private String content;

    @Column
    private String writer;

    public void changeTitle(String title){
        this.title = title;
    }

    public void changeContent(String content){
        this.content = content;
    }
}
