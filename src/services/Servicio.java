package services;


@Path("pbft")

public class Servicio {
    public String  [] urls = new String[6];
    public Proceso [] procesos = new String[6]; // en vez de 6 usar una constante


    @Path("fallo")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String fallo(@QueryParam("id") int id)
    {
        return "";
    }


    @Path("propuesta")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String propuesta(@QueryParam("valor") int v)
    {
        return "";
    }

    @Path("compromiso")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String compromiso(@QueryParam("valor") int v)
    {
        return "";
    }

    @Path("comision")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String comision(@QueryParam("valor") int v)
    {
        return "";
    }

    @Path("estado")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String estado()
    {
        return "";
    }

}
