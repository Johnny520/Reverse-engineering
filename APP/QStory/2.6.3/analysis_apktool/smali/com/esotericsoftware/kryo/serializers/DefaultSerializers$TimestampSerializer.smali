.class public Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimestampSerializer;
.super Lcom/esotericsoftware/kryo/Serializer;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/serializers/DefaultSerializers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TimestampSerializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/esotericsoftware/kryo/Serializer<",
        "Ljava/sql/Timestamp;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Serializer;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private create(JI)Ljava/sql/Timestamp;
    .locals 0

    .line 1
    new-instance p0, Ljava/sql/Timestamp;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/sql/Timestamp;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p3}, Ljava/sql/Timestamp;->setNanos(I)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method private integralTimeComponent(Ljava/sql/Timestamp;)J
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/sql/Timestamp;->getTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1}, Ljava/sql/Timestamp;->getNanos()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const p1, 0xf4240

    .line 10
    .line 11
    .line 12
    div-int/2addr p0, p1

    .line 13
    int-to-long p0, p0

    .line 14
    sub-long/2addr v0, p0

    .line 15
    return-wide v0
.end method


# virtual methods
.method public bridge synthetic copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p2, Ljava/sql/Timestamp;

    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimestampSerializer;->copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/sql/Timestamp;)Ljava/sql/Timestamp;

    move-result-object p0

    return-object p0
.end method

.method public copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/sql/Timestamp;)Ljava/sql/Timestamp;
    .locals 2

    .line 1
    invoke-direct {p0, p2}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimestampSerializer;->integralTimeComponent(Ljava/sql/Timestamp;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p2}, Ljava/sql/Timestamp;->getNanos()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-direct {p0, v0, v1, p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimestampSerializer;->create(JI)Ljava/sql/Timestamp;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public bridge synthetic read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 15
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimestampSerializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/sql/Timestamp;

    move-result-object p0

    return-object p0
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/sql/Timestamp;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Lcom/esotericsoftware/kryo/io/Input;",
            "Ljava/lang/Class<",
            "+",
            "Ljava/sql/Timestamp;",
            ">;)",
            "Ljava/sql/Timestamp;"
        }
    .end annotation

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p2, p1}, Lcom/esotericsoftware/kryo/io/Input;->readVarLong(Z)J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    invoke-virtual {p2, p1}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-direct {p0, v0, v1, p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimestampSerializer;->create(JI)Ljava/sql/Timestamp;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public bridge synthetic write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 0

    .line 17
    check-cast p3, Ljava/sql/Timestamp;

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimestampSerializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/sql/Timestamp;)V

    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/sql/Timestamp;)V
    .locals 1

    .line 1
    invoke-direct {p0, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimestampSerializer;->integralTimeComponent(Ljava/sql/Timestamp;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p2, p0, p1, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeVarLong(JZ)I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/sql/Timestamp;->getNanos()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {p2, p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 14
    .line 15
    .line 16
    return-void
.end method
