.class public Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BigDecimalSerializer;
.super Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/serializers/DefaultSerializers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BigDecimalSerializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer<",
        "Ljava/math/BigDecimal;",
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

.method private static newBigDecimalSubclass(Ljava/lang/Class;Ljava/math/BigInteger;I)Ljava/math/BigDecimal;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/math/BigDecimal;",
            ">;",
            "Ljava/math/BigInteger;",
            "I)",
            "Ljava/math/BigDecimal;"
        }
    .end annotation

    .line 1
    :try_start_0
    const-class v0, Ljava/math/BigInteger;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 14
    .line 15
    .line 16
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 21
    .line 22
    .line 23
    :catch_0
    :cond_0
    :try_start_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/math/BigDecimal;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 36
    .line 37
    return-object p0

    .line 38
    :catch_1
    move-exception p0

    .line 39
    new-instance p1, Lcom/esotericsoftware/kryo/KryoException;

    .line 40
    .line 41
    invoke-direct {p1, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method

.method private static writeUnscaledLong(Lcom/esotericsoftware/kryo/io/Output;J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    not-long v0, p1

    .line 13
    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    :goto_0
    rsub-int/lit8 v0, v0, 0x48

    .line 18
    .line 19
    shr-int/lit8 v0, v0, 0x3

    .line 20
    .line 21
    add-int/lit8 v1, v0, 0x1

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeLong(JI)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public bridge synthetic read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 87
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BigDecimalSerializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/math/BigDecimal;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Lcom/esotericsoftware/kryo/io/Input;",
            "Ljava/lang/Class<",
            "+",
            "Ljava/math/BigDecimal;",
            ">;)",
            "Ljava/math/BigDecimal;"
        }
    .end annotation

    .line 1
    const/4 p0, 0x1

    .line 2
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    const/4 p1, 0x0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    add-int/lit8 p0, p0, -0x1

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    if-le p0, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/io/Input;->readBytes(I)[B

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance p1, Ljava/math/BigInteger;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Ljava/math/BigInteger;-><init>([B)V

    .line 25
    .line 26
    .line 27
    move-wide v3, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/io/Input;->readLong(I)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    :goto_0
    const/4 p0, 0x0

    .line 34
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/io/Input;->readInt(Z)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    const-class p2, Ljava/math/BigDecimal;

    .line 39
    .line 40
    if-eq p3, p2, :cond_3

    .line 41
    .line 42
    if-eqz p3, :cond_3

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_1
    invoke-static {p3, p1, p0}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BigDecimalSerializer;->newBigDecimalSubclass(Ljava/lang/Class;Ljava/math/BigInteger;I)Ljava/math/BigDecimal;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_3
    if-eqz p1, :cond_4

    .line 57
    .line 58
    new-instance p2, Ljava/math/BigDecimal;

    .line 59
    .line 60
    invoke-direct {p2, p1, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 61
    .line 62
    .line 63
    return-object p2

    .line 64
    :cond_4
    if-nez p0, :cond_6

    .line 65
    .line 66
    cmp-long p1, v3, v1

    .line 67
    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    sget-object p0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_5
    const-wide/16 p1, 0x1

    .line 74
    .line 75
    cmp-long p1, v3, p1

    .line 76
    .line 77
    if-nez p1, :cond_6

    .line 78
    .line 79
    sget-object p0, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_6
    invoke-static {v3, v4, p0}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public bridge synthetic write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 0

    .line 109
    check-cast p3, Ljava/math/BigDecimal;

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BigDecimalSerializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/math/BigDecimal;)V

    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/math/BigDecimal;)V
    .locals 4

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
    sget-object p1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne p3, p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2, v0, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, p0, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeInt(IZ)I

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    sget-object p1, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 25
    .line 26
    if-ne p3, p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p2, v0, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p0, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeInt(IZ)I

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    invoke-virtual {p3}, Ljava/math/BigDecimal;->precision()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const/16 v0, 0x13

    .line 43
    .line 44
    if-ge p1, v0, :cond_3

    .line 45
    .line 46
    move p1, v1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    move p1, p0

    .line 49
    :goto_0
    if-nez p1, :cond_5

    .line 50
    .line 51
    invoke-virtual {p3}, Ljava/math/BigDecimal;->unscaledValue()Ljava/math/BigInteger;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    const/16 v2, 0x3f

    .line 60
    .line 61
    if-gt v0, v2, :cond_4

    .line 62
    .line 63
    move v0, v1

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    move v0, p0

    .line 66
    :goto_1
    move v3, v0

    .line 67
    move-object v0, p1

    .line 68
    move p1, v3

    .line 69
    goto :goto_2

    .line 70
    :cond_5
    const/4 v0, 0x0

    .line 71
    :goto_2
    if-nez p1, :cond_6

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    array-length v0, p1

    .line 78
    add-int/2addr v0, v1

    .line 79
    invoke-virtual {p2, v0, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeBytes([B)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    invoke-virtual {p3}, Ljava/math/BigDecimal;->scale()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-virtual {p3, p1}, Ljava/math/BigDecimal;->scaleByPowerOfTen(I)Ljava/math/BigDecimal;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, Ljava/math/BigDecimal;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    invoke-static {p2, v0, v1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BigDecimalSerializer;->writeUnscaledLong(Lcom/esotericsoftware/kryo/io/Output;J)V

    .line 99
    .line 100
    .line 101
    :goto_3
    invoke-virtual {p3}, Ljava/math/BigDecimal;->scale()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-virtual {p2, p1, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeInt(IZ)I

    .line 106
    .line 107
    .line 108
    return-void
.end method
