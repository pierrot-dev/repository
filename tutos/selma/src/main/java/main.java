import fr.xebia.extras.selma.Selma;

public class main {
    public static void main(String[] args) {
        RecetteMapper mapper = Selma.builder(RecetteMapper.class).build();

        Recette recette = new Recette();
        recette.setId("id");
        recette.setName("recette");

        RecetteDto recetteDto = mapper.asRecetteDto(recette);
        System.out.println(recetteDto);
    }
}
