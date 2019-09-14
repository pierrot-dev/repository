import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

@Mapper(
        withIgnoreMissing = IgnoreMissing.ALL)
public interface RecetteMapper {
    Recette asRecette (RecetteDto recetteDto);
    RecetteDto asRecetteDto(Recette recette);
}
