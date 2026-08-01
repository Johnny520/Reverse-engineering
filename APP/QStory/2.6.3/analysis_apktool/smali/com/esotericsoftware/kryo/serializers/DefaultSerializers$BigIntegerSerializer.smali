.class public Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BigIntegerSerializer;
.super Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/serializers/DefaultSerializers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BigIntegerSerializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer<",
        "Ljava/math/BigInteger;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/Serializer;->setAcceptsNull(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static newBigIntegerSubclass(Ljava/lang/Class;[B)Ljava/math/BigInteger;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/math/BigInteger;",
            ">;[B)",
            "Ljava/math/BigInteger;"
        }
    .end annotation

    .line 1
    :try_start_0
    const-class v0, [B

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 12
    .line 13
    .line 14
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 19
    .line 20
    .line 21
    :catch_0
    :cond_0
    :try_start_2
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/math/BigInteger;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 30
    .line 31
    return-object p0

    .line 32
    :catch_1
    move-exception p0

    .line 33
    new-instance p1, Lcom/esotericsoftware/kryo/KryoException;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method


# virtual methods
.method public bridge synthetic read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 57
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BigIntegerSerializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/math/BigInteger;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Lcom/esotericsoftware/kryo/io/Input;",
            "Ljava/lang/Class<",
            "+",
            "Ljava/math/BigInteger;",
            ">;)",
            "Ljava/math/BigInteger;"
        }
    .end annotation

    .line 1
    const/4 p0, 0x1

    .line 2
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    :cond_0
    add-int/lit8 v0, p1, -0x1

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Lcom/esotericsoftware/kryo/io/Input;->readBytes(I)[B

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const-class v0, Ljava/math/BigInteger;

    .line 17
    .line 18
    if-eq p3, v0, :cond_1

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    invoke-static {p3, p2}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BigIntegerSerializer;->newBigIntegerSubclass(Ljava/lang/Class;[B)Ljava/math/BigInteger;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    const/4 p3, 0x2

    .line 28
    if-ne p1, p3, :cond_5

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    aget-byte p1, p2, p1

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    if-eq p1, p0, :cond_3

    .line 36
    .line 37
    const/16 p0, 0xa

    .line 38
    .line 39
    if-eq p1, p0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    sget-object p0, Ljava/math/BigInteger;->TEN:Ljava/math/BigInteger;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    sget-object p0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_4
    sget-object p0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_5
    :goto_0
    new-instance p0, Ljava/math/BigInteger;

    .line 52
    .line 53
    invoke-direct {p0, p2}, Ljava/math/BigInteger;-><init>([B)V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method

.method public bridge synthetic write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 0

    .line 34
    check-cast p3, Ljava/math/BigInteger;

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BigIntegerSerializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/math/BigInteger;)V

    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/math/BigInteger;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    if-nez p3, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object p1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 9
    .line 10
    if-ne p3, p1, :cond_1

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-virtual {p2, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-virtual {p3}, Ljava/math/BigInteger;->toByteArray()[B

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    array-length p1, p0

    .line 25
    const/4 p3, 0x1

    .line 26
    add-int/2addr p1, p3

    .line 27
    invoke-virtual {p2, p1, p3}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeBytes([B)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
