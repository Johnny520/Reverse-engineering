.class public Lcom/esotericsoftware/kryo/SerializerFactory$CompatibleFieldSerializerFactory;
.super Lcom/esotericsoftware/kryo/SerializerFactory$BaseSerializerFactory;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/SerializerFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CompatibleFieldSerializerFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/esotericsoftware/kryo/SerializerFactory$BaseSerializerFactory<",
        "Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;",
        ">;"
    }
.end annotation


# instance fields
.field private final config:Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/SerializerFactory$BaseSerializerFactory;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/esotericsoftware/kryo/SerializerFactory$CompatibleFieldSerializerFactory;->config:Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/SerializerFactory$BaseSerializerFactory;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/esotericsoftware/kryo/SerializerFactory$CompatibleFieldSerializerFactory;->config:Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;

    return-void
.end method


# virtual methods
.method public getConfig()Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/SerializerFactory$CompatibleFieldSerializerFactory;->config:Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic newSerializer(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;
    .locals 0

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/SerializerFactory$CompatibleFieldSerializerFactory;->newSerializer(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;

    move-result-object p0

    return-object p0
.end method

.method public newSerializer(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;
    .locals 1

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/esotericsoftware/kryo/SerializerFactory$CompatibleFieldSerializerFactory;->config:Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;->clone()Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p1, p2, p0}, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;-><init>(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
