package com.kit.cgv.jpa.domain.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@NoArgsConstructor
@SuperBuilder

@Getter
@MappedSuperclass // ①
@EntityListeners(AuditingEntityListener.class) // ②

public abstract class BaseTimeEntity {

    @CreatedDate // ③
    private LocalDateTime createdDate;

    @LastModifiedDate // ④
    private LocalDateTime modifiedDate;

}

// ① : JPA Entity 클래스들이 BaseTimeEntity을 상속할 경우 필드들(createdDate, modifiedDate)도 칼럼으로 인식하도록 한다.
// ② : BaseTimeEntity 클래스에 Auditing 기능을 포함
// ③ : Entity가 생성되어 저장될 때 시간이 자동 저장
// ④ : 조회한 Entity의 값을 변경할 때 시간이 자동 저장

