package dotori.guidely.domain.declaration.dto.response;

import dotori.guidely.domain.declaration.domain.Declaration;
import dotori.guidely.domain.declaration.domain.DeclarationCategory;
import dotori.guidely.domain.declaration.domain.RiskType;
import lombok.Builder;
import lombok.Data;

@Data
public class ListDclarationResponseDto {
    private DeclarationCategory category;
    private RiskType risk; // LOW,MEDIUM,HIGH
    private String contents;
    private String imgUrl;
    private String specification;

    @Builder
    public ListDclarationResponseDto(Declaration declaration) {
        this.category = declaration.getCategory();
        this.risk = declaration.getRisk();
        this.contents = declaration.getContents();
        this.imgUrl = declaration.getImgUrl();
        this.specification = declaration.getSpecification();
    }
}