.class public Lcom/esotericsoftware/kryo/SerializerFactory$FieldSerializerFactory;
.super Lcom/esotericsoftware/kryo/SerializerFactory$BaseSerializerFactory;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/SerializerFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FieldSerializerFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/esotericsoftware/kryo/SerializerFactory$BaseSerializerFactory<",
        "Lcom/esotericsoftware/kryo/serializers/FieldSerializer;",
        ">;"
    }
.end annotation


# instance fields
.field private final config:Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/SerializerFactory$BaseSerializerFactory;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/esotericsoftware/kryo/SerializerFactory$FieldSerializerFactory;->config:Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/SerializerFactory$BaseSerializerFactory;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/esotericsoftware/kryo/SerializerFactory$FieldSerializerFactory;->config:Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;

    return-void
.end method


# virtual methods
.method public getConfig()Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/SerializerFactory$FieldSerializerFactory;->config:Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic newSerializer(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;
    .locals 0

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/SerializerFactory$FieldSerializerFactory;->newSerializer(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    move-result-object p0

    return-object p0
.end method

.method public newSerializer(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/serializers/FieldSerializer;
    .locals 1

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/esotericsoftware/kryo/SerializerFactory$FieldSerializerFactory;->config:Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->clone()Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p1, p2, p0}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;-><init>(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
