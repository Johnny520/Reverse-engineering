.class public interface abstract Lcom/esotericsoftware/kryo/SerializerFactory;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/SerializerFactory$CompatibleFieldSerializerFactory;,
        Lcom/esotericsoftware/kryo/SerializerFactory$VersionFieldSerializerFactory;,
        Lcom/esotericsoftware/kryo/SerializerFactory$TaggedFieldSerializerFactory;,
        Lcom/esotericsoftware/kryo/SerializerFactory$FieldSerializerFactory;,
        Lcom/esotericsoftware/kryo/SerializerFactory$SingletonSerializerFactory;,
        Lcom/esotericsoftware/kryo/SerializerFactory$ReflectionSerializerFactory;,
        Lcom/esotericsoftware/kryo/SerializerFactory$BaseSerializerFactory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/esotericsoftware/kryo/Serializer;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract isSupported(Ljava/lang/Class;)Z
.end method

.method public abstract newSerializer(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Ljava/lang/Class;",
            ")TT;"
        }
    .end annotation
.end method
