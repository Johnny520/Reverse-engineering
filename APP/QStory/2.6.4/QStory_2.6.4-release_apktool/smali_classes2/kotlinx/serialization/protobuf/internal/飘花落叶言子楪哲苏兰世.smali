.class public final Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰苏哲:I

.field public 飘花落叶言子楪世哲兰苏:Z

.field public 飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

.field public 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:I

    .line 8
    .line 9
    sget-object p1, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->INVALID:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 10
    .line 11
    iput-object p1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 12
    .line 13
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(I)V
    .locals 3

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    .line 5
    .line 6
    const-string v1, "Unexpected negative length: "

    .line 7
    .line 8
    invoke-static {p0, v1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v1, 0x2

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, p0, v2, v1, v2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏()[B
    .locals 4

    .line 1
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->SIZE_DELIMITED:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰()[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    .line 13
    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v3, "Expected wire type "

    .line 17
    .line 18
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 25
    .line 26
    const-string v0, ", but found "

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-direct {v1, p0, v2, v0, v2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 41
    .line 42
    .line 43
    throw v1
.end method

.method public final 飘花落叶言子楪世兰苏哲()Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;
    .locals 4

    .line 1
    sget-object v0, Lkotlinx/serialization/protobuf/ProtoIntegerType;->DEFAULT:Lkotlinx/serialization/protobuf/ProtoIntegerType;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Lkotlinx/serialization/protobuf/ProtoIntegerType;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(I)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    iget-object v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[B

    .line 18
    .line 19
    iget v3, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 20
    .line 21
    add-int/2addr v3, v0

    .line 22
    invoke-direct {v1, v2, v3}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;-><init>([BI)V

    .line 23
    .line 24
    .line 25
    iget v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 26
    .line 27
    iput v2, v1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 28
    .line 29
    iget v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 30
    .line 31
    add-int/2addr v2, v0

    .line 32
    iput v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 33
    .line 34
    return-object v1
.end method

.method public final 飘花落叶言子楪世哲兰苏()Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;
    .locals 4

    .line 1
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->SIZE_DELIMITED:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲()Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    .line 13
    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v3, "Expected wire type "

    .line 17
    .line 18
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 25
    .line 26
    const-string v0, ", but found "

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-direct {v1, p0, v2, v0, v2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 41
    .line 42
    .line 43
    throw v1
.end method

.method public final 飘花落叶言子楪世哲苏兰(Lkotlinx/serialization/protobuf/ProtoIntegerType;)J
    .locals 5

    .line 1
    sget-object v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iget-object v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq p1, v2, :cond_2

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    if-eq p1, v3, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x3

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰()J

    .line 22
    .line 23
    .line 24
    move-result-wide p0

    .line 25
    return-wide p0

    .line 26
    :cond_0
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()V

    .line 27
    .line 28
    .line 29
    const-wide/16 p0, 0x0

    .line 30
    .line 31
    return-wide p0

    .line 32
    :cond_1
    invoke-virtual {v1, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Z)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    const/16 v0, 0x3f

    .line 37
    .line 38
    shl-long v3, p0, v0

    .line 39
    .line 40
    shr-long v0, v3, v0

    .line 41
    .line 42
    xor-long/2addr v0, p0

    .line 43
    shr-long/2addr v0, v2

    .line 44
    const-wide/high16 v2, -0x8000000000000000L

    .line 45
    .line 46
    and-long/2addr p0, v2

    .line 47
    xor-long/2addr p0, v0

    .line 48
    return-wide p0

    .line 49
    :cond_2
    invoke-virtual {v1, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Z)J

    .line 50
    .line 51
    .line 52
    move-result-wide p0

    .line 53
    return-wide p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lkotlinx/serialization/protobuf/ProtoIntegerType;)I
    .locals 7

    .line 1
    sget-object v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iget-object v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq p1, v2, :cond_7

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    if-eq p1, v3, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    if-ne p1, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()V

    .line 27
    .line 28
    .line 29
    return v0

    .line 30
    :cond_1
    iget p0, v1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 31
    .line 32
    iget p1, v1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 33
    .line 34
    if-eq p0, p1, :cond_6

    .line 35
    .line 36
    iget-object v4, v1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[B

    .line 37
    .line 38
    add-int/lit8 v5, p0, 0x1

    .line 39
    .line 40
    aget-byte v6, v4, p0

    .line 41
    .line 42
    if-ltz v6, :cond_2

    .line 43
    .line 44
    iput v5, v1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    sub-int/2addr p1, p0

    .line 48
    if-le p1, v2, :cond_3

    .line 49
    .line 50
    add-int/2addr p0, v3

    .line 51
    aget-byte p1, v4, v5

    .line 52
    .line 53
    shl-int/lit8 p1, p1, 0x7

    .line 54
    .line 55
    xor-int/2addr p1, v6

    .line 56
    if-gez p1, :cond_3

    .line 57
    .line 58
    iput p0, v1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 59
    .line 60
    xor-int/lit8 v6, p1, -0x80

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    move p0, v0

    .line 64
    :goto_0
    const/16 p1, 0x20

    .line 65
    .line 66
    if-ge v0, p1, :cond_5

    .line 67
    .line 68
    invoke-virtual {v1}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    and-int/lit8 v3, p1, 0x7f

    .line 73
    .line 74
    shl-int/2addr v3, v0

    .line 75
    or-int/2addr p0, v3

    .line 76
    and-int/lit16 p1, p1, 0x80

    .line 77
    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    move v6, p0

    .line 81
    :goto_1
    shl-int/lit8 p0, v6, 0x1f

    .line 82
    .line 83
    shr-int/lit8 p0, p0, 0x1f

    .line 84
    .line 85
    xor-int/2addr p0, v6

    .line 86
    shr-int/2addr p0, v2

    .line 87
    const/high16 p1, -0x80000000

    .line 88
    .line 89
    and-int/2addr p1, v6

    .line 90
    xor-int/2addr p0, p1

    .line 91
    return p0

    .line 92
    :cond_4
    add-int/lit8 v0, v0, 0x7

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_5
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 96
    .line 97
    const-string p1, "Input stream is malformed: Varint too long (exceeded 32 bits)"

    .line 98
    .line 99
    invoke-direct {p0, p1}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p0

    .line 103
    :cond_6
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 104
    .line 105
    const-string p1, "Unexpected EOF"

    .line 106
    .line 107
    invoke-direct {p0, p1}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p0

    .line 111
    :cond_7
    invoke-virtual {v1, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Z)J

    .line 112
    .line 113
    .line 114
    move-result-wide p0

    .line 115
    long-to-int p0, p0

    .line 116
    return p0
.end method

.method public final 飘花落叶言子楪哲世兰苏()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->SIZE_DELIMITED:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lkotlinx/serialization/protobuf/ProtoIntegerType;->DEFAULT:Lkotlinx/serialization/protobuf/ProtoIntegerType;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Lkotlinx/serialization/protobuf/ProtoIntegerType;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(I)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    iget-object v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[B

    .line 19
    .line 20
    iget v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 21
    .line 22
    add-int v3, v2, v0

    .line 23
    .line 24
    invoke-static {v2, v1, v3}, Lkotlin/text/飘花落叶言子楪兰哲世苏;->飘花落叶言子苏兰世哲楪(I[BI)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 29
    .line 30
    add-int/2addr v2, v0

    .line 31
    iput v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_0
    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v3, "Expected wire type "

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 47
    .line 48
    const-string v0, ", but found "

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const/4 v0, 0x2

    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-direct {v1, p0, v2, v0, v2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 63
    .line 64
    .line 65
    throw v1
.end method

.method public final 飘花落叶言子楪哲世苏兰()J
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    const/16 v3, 0x8

    .line 5
    .line 6
    if-ge v2, v3, :cond_0

    .line 7
    .line 8
    iget-object v3, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    invoke-virtual {v3}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    and-int/lit16 v3, v3, 0xff

    .line 15
    .line 16
    int-to-long v3, v3

    .line 17
    mul-int/lit8 v5, v2, 0x8

    .line 18
    .line 19
    shl-long/2addr v3, v5

    .line 20
    or-long/2addr v0, v3

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-wide v0
.end method

.method public final 飘花落叶言子楪哲兰世苏(I)I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iput v0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:I

    .line 5
    .line 6
    sget-object p1, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->INVALID:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 7
    .line 8
    iput-object p1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    ushr-int/lit8 v0, p1, 0x3

    .line 12
    .line 13
    iput v0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:I

    .line 14
    .line 15
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->Companion:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪苏兰哲世;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->access$getEntryArray$cp()[Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    and-int/lit8 p1, p1, 0x7

    .line 25
    .line 26
    aget-object p1, v0, p1

    .line 27
    .line 28
    iput-object p1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 29
    .line 30
    iget p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:I

    .line 31
    .line 32
    return p0
.end method

.method public final 飘花落叶言子楪哲苏世兰()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏:Z

    .line 7
    .line 8
    iget v0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:I

    .line 9
    .line 10
    shl-int/lit8 v0, v0, 0x3

    .line 11
    .line 12
    iget-object v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 13
    .line 14
    invoke-virtual {v1}, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->getTypeId()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    or-int/2addr v0, v1

    .line 19
    iget v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲:I

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iput v0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲:I

    .line 26
    .line 27
    return v1

    .line 28
    :cond_0
    iget v0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:I

    .line 29
    .line 30
    shl-int/lit8 v0, v0, 0x3

    .line 31
    .line 32
    iget-object v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 33
    .line 34
    invoke-virtual {v1}, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->getTypeId()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    or-int/2addr v0, v1

    .line 39
    iput v0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲:I

    .line 40
    .line 41
    iget-object v0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-virtual {v0, v1}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Z)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    long-to-int v0, v0

    .line 49
    invoke-virtual {p0, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(I)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method

.method public final 飘花落叶言子楪哲苏兰世()V
    .locals 6

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 2
    .line 3
    sget-object v1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_4

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_3

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    if-ne v0, v2, :cond_0

    .line 23
    .line 24
    sget-object v0, Lkotlinx/serialization/protobuf/ProtoIntegerType;->FIXED:Lkotlinx/serialization/protobuf/ProtoIntegerType;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲兰世(Lkotlinx/serialization/protobuf/ProtoIntegerType;)I

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance v0, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    .line 31
    .line 32
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 33
    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v4, "Unsupported start group or end group wire type: "

    .line 37
    .line 38
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-direct {v0, p0, v3, v1, v3}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_1
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->SIZE_DELIMITED:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 53
    .line 54
    iget-object v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 55
    .line 56
    if-ne v2, v0, :cond_2

    .line 57
    .line 58
    sget-object v0, Lkotlinx/serialization/protobuf/ProtoIntegerType;->DEFAULT:Lkotlinx/serialization/protobuf/ProtoIntegerType;

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Lkotlinx/serialization/protobuf/ProtoIntegerType;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-static {v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(I)V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 70
    .line 71
    .line 72
    iget v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 73
    .line 74
    add-int/2addr v1, v0

    .line 75
    iput v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    new-instance v2, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    .line 79
    .line 80
    new-instance v4, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v5, "Expected wire type "

    .line 83
    .line 84
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 91
    .line 92
    const-string v0, ", but found "

    .line 93
    .line 94
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-direct {v2, p0, v3, v1, v3}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 105
    .line 106
    .line 107
    throw v2

    .line 108
    :cond_3
    sget-object v0, Lkotlinx/serialization/protobuf/ProtoIntegerType;->FIXED:Lkotlinx/serialization/protobuf/ProtoIntegerType;

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(Lkotlinx/serialization/protobuf/ProtoIntegerType;)J

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_4
    sget-object v0, Lkotlinx/serialization/protobuf/ProtoIntegerType;->DEFAULT:Lkotlinx/serialization/protobuf/ProtoIntegerType;

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲兰世(Lkotlinx/serialization/protobuf/ProtoIntegerType;)I

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲()D
    .locals 4

    .line 1
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->i64:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v3, "Expected wire type "

    .line 21
    .line 22
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 29
    .line 30
    const-string v0, ", but found "

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const/4 v0, 0x2

    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-direct {v1, p0, v2, v0, v2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 45
    .line 46
    .line 47
    throw v1
.end method

.method public final 飘花落叶言子楪苏世哲兰()[B
    .locals 6

    .line 1
    sget-object v0, Lkotlinx/serialization/protobuf/ProtoIntegerType;->DEFAULT:Lkotlinx/serialization/protobuf/ProtoIntegerType;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Lkotlinx/serialization/protobuf/ProtoIntegerType;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(I)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 13
    .line 14
    .line 15
    new-array v1, v0, [B

    .line 16
    .line 17
    iget v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 18
    .line 19
    iget v3, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 20
    .line 21
    sub-int/2addr v2, v3

    .line 22
    if-ge v2, v0, :cond_0

    .line 23
    .line 24
    move v0, v2

    .line 25
    :cond_0
    iget-object v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[B

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    add-int v5, v3, v0

    .line 29
    .line 30
    invoke-static {v2, v4, v1, v3, v5}, Lkotlin/collections/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲楪兰苏([BI[BII)V

    .line 31
    .line 32
    .line 33
    iget v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 34
    .line 35
    add-int/2addr v2, v0

    .line 36
    iput v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 37
    .line 38
    return-object v1
.end method

.method public final 飘花落叶言子楪苏兰世哲()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, 0x4

    .line 4
    if-ge v0, v2, :cond_0

    .line 5
    .line 6
    iget-object v2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-virtual {v2}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    and-int/lit16 v2, v2, 0xff

    .line 13
    .line 14
    mul-int/lit8 v3, v0, 0x8

    .line 15
    .line 16
    shl-int/2addr v2, v3

    .line 17
    or-int/2addr v1, v2

    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return v1
.end method

.method public final 飘花落叶言子楪苏兰哲世(Lkotlinx/serialization/protobuf/ProtoIntegerType;)J
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlinx/serialization/protobuf/ProtoIntegerType;->FIXED:Lkotlinx/serialization/protobuf/ProtoIntegerType;

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->i64:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->VARINT:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 12
    .line 13
    :goto_0
    iget-object v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 14
    .line 15
    if-ne v1, v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Lkotlinx/serialization/protobuf/ProtoIntegerType;)J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    return-wide p0

    .line 22
    :cond_1
    new-instance p1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "Expected wire type "

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 35
    .line 36
    const-string v0, ", but found "

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const/4 v0, 0x2

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {p1, p0, v1, v0, v1}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method

.method public final 飘花落叶言子楪苏哲世兰()F
    .locals 4

    .line 1
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->i32:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v3, "Expected wire type "

    .line 21
    .line 22
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 29
    .line 30
    const-string v0, ", but found "

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const/4 v0, 0x2

    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-direct {v1, p0, v2, v0, v2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 45
    .line 46
    .line 47
    throw v1
.end method

.method public final 飘花落叶言子楪苏哲兰世(Lkotlinx/serialization/protobuf/ProtoIntegerType;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlinx/serialization/protobuf/ProtoIntegerType;->FIXED:Lkotlinx/serialization/protobuf/ProtoIntegerType;

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->i32:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object v0, Lkotlinx/serialization/protobuf/internal/ProtoWireType;->VARINT:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 12
    .line 13
    :goto_0
    iget-object v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 14
    .line 15
    if-ne v1, v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Lkotlinx/serialization/protobuf/ProtoIntegerType;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_1
    new-instance p1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "Expected wire type "

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:Lkotlinx/serialization/protobuf/internal/ProtoWireType;

    .line 35
    .line 36
    const-string v0, ", but found "

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const/4 v0, 0x2

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {p1, p0, v1, v0, v1}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method
