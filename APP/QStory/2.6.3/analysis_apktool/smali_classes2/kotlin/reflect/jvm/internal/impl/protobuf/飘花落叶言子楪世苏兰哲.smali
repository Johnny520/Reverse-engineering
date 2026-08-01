.class public abstract Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏兰哲;->isInitialized()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世苏哲兰;

    .line 15
    .line 16
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世苏哲兰;->newUninitializedMessageException()Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;->asInvalidProtocolBufferException()Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    throw p0

    .line 35
    :cond_1
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    goto :goto_3

    .line 10
    :cond_0
    and-int/lit16 v2, v0, 0x80

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_1
    and-int/lit8 v0, v0, 0x7f

    .line 16
    .line 17
    const/4 v2, 0x7

    .line 18
    :goto_0
    const/16 v3, 0x20

    .line 19
    .line 20
    if-ge v2, v3, :cond_4

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eq v3, v1, :cond_3

    .line 27
    .line 28
    and-int/lit8 v4, v3, 0x7f

    .line 29
    .line 30
    shl-int/2addr v4, v2

    .line 31
    or-int/2addr v0, v4

    .line 32
    and-int/lit16 v3, v3, 0x80

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    add-int/lit8 v2, v2, 0x7

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    throw p0

    .line 45
    :cond_4
    :goto_1
    const/16 v3, 0x40

    .line 46
    .line 47
    if-ge v2, v3, :cond_8

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 50
    .line 51
    .line 52
    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 53
    if-eq v3, v1, :cond_7

    .line 54
    .line 55
    and-int/lit16 v3, v3, 0x80

    .line 56
    .line 57
    if-nez v3, :cond_6

    .line 58
    .line 59
    :goto_2
    new-instance v1, Lcom/google/protobuf/飘花落叶言子楪世哲苏兰;

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    invoke-direct {v1, p1, v0, v2}, Lcom/google/protobuf/飘花落叶言子楪世哲苏兰;-><init>(Ljava/io/InputStream;II)V

    .line 63
    .line 64
    .line 65
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;

    .line 66
    .line 67
    invoke-direct {p1, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;-><init>(Ljava/io/InputStream;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 75
    .line 76
    :try_start_1
    iget p1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:I
    :try_end_1
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_0

    .line 77
    .line 78
    if-nez p1, :cond_5

    .line 79
    .line 80
    :goto_3
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 81
    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_5
    :try_start_2
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->invalidEndTag()Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    throw p1
    :try_end_2
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_0

    .line 89
    :catch_0
    move-exception p1

    .line 90
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    throw p0

    .line 95
    :cond_6
    add-int/lit8 v2, v2, 0x7

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_7
    :try_start_3
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    throw p0

    .line 103
    :cond_8
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->malformedVarint()Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    throw p0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 108
    :catch_1
    move-exception p0

    .line 109
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p1
.end method
