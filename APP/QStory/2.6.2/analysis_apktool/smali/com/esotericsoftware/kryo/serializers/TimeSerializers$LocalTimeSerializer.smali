.class public Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalTimeSerializer;
.super Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/serializers/TimeSerializers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LocalTimeSerializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer<",
        "Ljava/time/LocalTime;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static read(Lcom/esotericsoftware/kryo/io/Input;)Ljava/time/LocalTime;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-gez v0, :cond_0

    .line 7
    .line 8
    not-int v0, v0

    .line 9
    move p0, v1

    .line 10
    move v2, p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readByte()B

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-gez v2, :cond_1

    .line 17
    .line 18
    not-int p0, v2

    .line 19
    move v2, v1

    .line 20
    move v1, p0

    .line 21
    move p0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readByte()B

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-gez v3, :cond_2

    .line 28
    .line 29
    not-int p0, v3

    .line 30
    move v4, v2

    .line 31
    move v2, v1

    .line 32
    move v1, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 v1, 0x1

    .line 35
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->readInt(Z)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    move p0, v2

    .line 40
    move v2, v1

    .line 41
    move v1, p0

    .line 42
    move p0, v3

    .line 43
    :goto_0
    invoke-static {v0, v1, p0, v2}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public static write(Lcom/esotericsoftware/kryo/io/Output;Ljava/time/LocalTime;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/time/LocalTime;->getNano()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/time/LocalTime;->getSecond()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/time/LocalTime;->getMinute()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/time/LocalTime;->getHour()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    not-int p1, p1

    .line 24
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {p1}, Ljava/time/LocalTime;->getHour()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/time/LocalTime;->getMinute()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    not-int p1, p1

    .line 40
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-virtual {p1}, Ljava/time/LocalTime;->getHour()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/time/LocalTime;->getMinute()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/time/LocalTime;->getSecond()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    not-int p1, p1

    .line 63
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    invoke-virtual {p1}, Ljava/time/LocalTime;->getHour()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/time/LocalTime;->getMinute()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/time/LocalTime;->getSecond()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/time/LocalTime;->getNano()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    const/4 v0, 0x1

    .line 93
    invoke-virtual {p0, p1, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeInt(IZ)I

    .line 94
    .line 95
    .line 96
    return-void
.end method


# virtual methods
.method public bridge synthetic read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 49
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalTimeSerializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/time/LocalTime;

    move-result-object p0

    return-object p0
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/time/LocalTime;
    .locals 0

    .line 48
    invoke-static {p2}, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalTimeSerializer;->read(Lcom/esotericsoftware/kryo/io/Input;)Ljava/time/LocalTime;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 0

    .line 98
    check-cast p3, Ljava/time/LocalTime;

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalTimeSerializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/time/LocalTime;)V

    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/time/LocalTime;)V
    .locals 0

    .line 97
    invoke-static {p2, p3}, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalTimeSerializer;->write(Lcom/esotericsoftware/kryo/io/Output;Ljava/time/LocalTime;)V

    return-void
.end method
