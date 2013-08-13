package in.srid.serializer;

public interface Deserializer {
    <T> T deserialize( final byte[] bytes , final Class<T> clazz );
}
