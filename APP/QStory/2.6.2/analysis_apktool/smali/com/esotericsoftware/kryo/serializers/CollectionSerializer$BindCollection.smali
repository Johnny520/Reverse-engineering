.class public interface abstract annotation Lcom/esotericsoftware/kryo/serializers/CollectionSerializer$BindCollection;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/esotericsoftware/kryo/serializers/CollectionSerializer$BindCollection;
        elementClass = Ljava/lang/Object;
        elementSerializer = Lcom/esotericsoftware/kryo/Serializer;
        elementSerializerFactory = Lcom/esotericsoftware/kryo/SerializerFactory;
        elementsCanBeNull = true
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2609
    name = "BindCollection"
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract elementClass()Ljava/lang/Class;
.end method

.method public abstract elementSerializer()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/esotericsoftware/kryo/Serializer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract elementSerializerFactory()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/esotericsoftware/kryo/SerializerFactory;",
            ">;"
        }
    .end annotation
.end method

.method public abstract elementsCanBeNull()Z
.end method
