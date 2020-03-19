package kg.megacom.basicauth.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Currency {

   @NonNull
    private String id;

   @NonNull
    private String currency;

   @NonNull
    private String active;

}

