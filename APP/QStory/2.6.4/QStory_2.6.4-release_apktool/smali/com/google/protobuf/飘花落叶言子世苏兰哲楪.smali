.class public abstract Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/CodedInputStream$VarintExperiment;


# instance fields
.field public 飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言子世哲楪兰苏;

.field public 飘花落叶言子楪世苏兰哲:I

.field public 飘花落叶言子楪世苏哲兰:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/CodedInputStream$VarintExperiment;->CONTROL:Lcom/google/protobuf/CodedInputStream$VarintExperiment;

    .line 2
    .line 3
    sput-object v0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/CodedInputStream$VarintExperiment;

    .line 4
    .line 5
    return-void
.end method

.method public static 飘花落叶言子世楪哲苏兰(Ljava/io/InputStream;I)I
    .locals 3

    .line 1
    and-int/lit16 v0, p1, 0x80

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    and-int/lit8 p1, p1, 0x7f

    .line 7
    .line 8
    const/4 v0, 0x7

    .line 9
    :goto_0
    const/16 v1, 0x20

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    if-ge v0, v1, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eq v1, v2, :cond_2

    .line 19
    .line 20
    and-int/lit8 v2, v1, 0x7f

    .line 21
    .line 22
    shl-int/2addr v2, v0

    .line 23
    or-int/2addr p1, v2

    .line 24
    and-int/lit16 v1, v1, 0x80

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    return p1

    .line 29
    :cond_1
    add-int/lit8 v0, v0, 0x7

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    throw p0

    .line 37
    :cond_3
    :goto_1
    const/16 v1, 0x40

    .line 38
    .line 39
    if-ge v0, v1, :cond_6

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eq v1, v2, :cond_5

    .line 46
    .line 47
    and-int/lit16 v1, v1, 0x80

    .line 48
    .line 49
    if-nez v1, :cond_4

    .line 50
    .line 51
    return p1

    .line 52
    :cond_4
    add-int/lit8 v0, v0, 0x7

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_5
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->truncatedMessage()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    throw p0

    .line 60
    :cond_6
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->malformedVarint()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    throw p0
.end method

.method public static 飘花落叶言子楪世哲兰苏(J)J
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    ushr-long v0, p0, v0

    .line 3
    .line 4
    const-wide/16 v2, 0x1

    .line 5
    .line 6
    and-long/2addr p0, v2

    .line 7
    neg-long p0, p0

    .line 8
    xor-long/2addr p0, v0

    .line 9
    return-wide p0
.end method

.method public static 飘花落叶言子楪世哲苏兰(I)I
    .locals 1

    .line 1
    ushr-int/lit8 v0, p0, 0x1

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    neg-int p0, p0

    .line 6
    xor-int/2addr p0, v0

    .line 7
    return p0
.end method

.method public static 飘花落叶言子楪苏世兰哲(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    add-int/2addr v3, v2

    .line 21
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {v0, v3, p0, v1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰([BIIZ)Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    new-array v2, v0, [B

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    invoke-static {v2, v1, v0, p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰([BIIZ)Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static 飘花落叶言子楪苏哲世兰([BIIZ)Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;
    .locals 9

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/CodedInputStream$VarintExperiment;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    new-instance v2, Lcom/google/protobuf/飘花落叶言子世苏哲兰楪;

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    move-object v3, p0

    .line 17
    move v4, p1

    .line 18
    move v5, p2

    .line 19
    move v6, p3

    .line 20
    invoke-direct/range {v2 .. v7}, Lcom/google/protobuf/飘花落叶言子世苏哲兰楪;-><init>([BIIZI)V

    .line 21
    .line 22
    .line 23
    move v6, v5

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move-object v4, p0

    .line 26
    move v5, p1

    .line 27
    move v6, p2

    .line 28
    move v7, p3

    .line 29
    new-instance v3, Lcom/google/protobuf/飘花落叶言子世苏哲兰楪;

    .line 30
    .line 31
    const/4 v8, 0x1

    .line 32
    invoke-direct/range {v3 .. v8}, Lcom/google/protobuf/飘花落叶言子世苏哲兰楪;-><init>([BIIZI)V

    .line 33
    .line 34
    .line 35
    :goto_0
    move-object v2, v3

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object v4, p0

    .line 38
    move v5, p1

    .line 39
    move v6, p2

    .line 40
    move v7, p3

    .line 41
    new-instance v3, Lcom/google/protobuf/飘花落叶言子世苏哲兰楪;

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    invoke-direct/range {v3 .. v8}, Lcom/google/protobuf/飘花落叶言子世苏哲兰楪;-><init>([BIIZI)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :goto_1
    :try_start_0
    invoke-virtual {v2, v6}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏兰哲世(I)I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :catch_0
    move-exception v0

    .line 53
    move-object p0, v0

    .line 54
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 55
    .line 56
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method

.method public static 飘花落叶言子楪苏哲兰世(Ljava/io/InputStream;)Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世苏哲兰:[B

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p0, v0, v0, v0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰([BIIZ)Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Lcom/google/protobuf/飘花落叶言子世苏兰楪哲;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/google/protobuf/飘花落叶言子世苏兰楪哲;-><init>(Ljava/io/InputStream;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method


# virtual methods
.method public final 飘花落叶言子世哲楪兰苏()V
    .locals 2

    .line 1
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲兰楪()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲()V

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世哲楪苏兰(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget v1, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, -0x1

    .line 24
    .line 25
    iput v1, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    :goto_0
    return-void
.end method

.method public abstract 飘花落叶言子世哲楪苏兰(I)Z
.end method

.method public abstract 飘花落叶言子世楪兰哲苏()I
.end method

.method public abstract 飘花落叶言子世楪兰苏哲()J
.end method

.method public abstract 飘花落叶言子世楪哲兰苏()I
.end method

.method public abstract 飘花落叶言子世楪苏兰哲()I
.end method

.method public final 飘花落叶言子世楪苏哲兰(Lcom/google/protobuf/WireFormat$FieldType;Lcom/google/protobuf/WireFormat$Utf8Validation;)Ljava/io/Serializable;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏兰哲:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const-string p0, "Unknown field type: "

    .line 14
    .line 15
    invoke-static {p1, p0}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :pswitch_0
    const-string p0, "readPrimitiveField() cannot handle enums."

    .line 20
    .line 21
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :pswitch_1
    const-string p0, "readPrimitiveField() cannot handle embedded messages."

    .line 26
    .line 27
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_2
    const-string p0, "readPrimitiveField() cannot handle nested groups."

    .line 32
    .line 33
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_3
    sget-object p1, Lcom/google/protobuf/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:[I

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    aget p1, p1, v0

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    if-eq p1, v0, :cond_2

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    if-eq p1, v0, :cond_1

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    if-ne p1, v0, :cond_0

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_0
    const-string p0, "Unknown UTF8 validation: "

    .line 60
    .line 61
    invoke-static {p2, p0}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲楪兰()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏楪兰哲()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏楪哲兰()J

    .line 76
    .line 77
    .line 78
    move-result-wide p0

    .line 79
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :pswitch_5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪兰哲苏()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_6
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪兰苏哲()J

    .line 94
    .line 95
    .line 96
    move-result-wide p0

    .line 97
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :pswitch_7
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪哲兰苏()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_8
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏兰楪哲()I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0

    .line 120
    :pswitch_9
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_a
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :pswitch_b
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰世苏()I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :pswitch_c
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰苏世()J

    .line 144
    .line 145
    .line 146
    move-result-wide p0

    .line 147
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :pswitch_d
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰苏世哲()I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :pswitch_e
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏兰哲楪()J

    .line 162
    .line 163
    .line 164
    move-result-wide p0

    .line 165
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    return-object p0

    .line 170
    :pswitch_f
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰苏哲世()J

    .line 171
    .line 172
    .line 173
    move-result-wide p0

    .line 174
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    return-object p0

    .line 179
    :pswitch_10
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰世苏哲()F

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0

    .line 188
    :pswitch_11
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏世兰()D

    .line 189
    .line 190
    .line 191
    move-result-wide p0

    .line 192
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    return-object p0

    .line 197
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract 飘花落叶言子世苏兰哲楪()J
.end method

.method public abstract 飘花落叶言子世苏兰楪哲()I
.end method

.method public abstract 飘花落叶言子世苏哲兰楪()I
.end method

.method public abstract 飘花落叶言子世苏哲楪兰()Ljava/lang/String;
.end method

.method public abstract 飘花落叶言子世苏楪兰哲()Ljava/lang/String;
.end method

.method public abstract 飘花落叶言子世苏楪哲兰()J
.end method

.method public abstract 飘花落叶言子楪世兰哲苏()I
.end method

.method public abstract 飘花落叶言子楪世兰苏哲()I
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget p0, p0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 4
    .line 5
    add-int/2addr v0, p0

    .line 6
    const/16 p0, 0x64

    .line 7
    .line 8
    if-ge v0, p0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->recursionLimitExceeded()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    throw p0
.end method

.method public abstract 飘花落叶言子楪世苏哲兰(I)V
.end method

.method public abstract 飘花落叶言子楪兰世哲苏(ILcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V
.end method

.method public abstract 飘花落叶言子楪兰世苏哲()F
.end method

.method public abstract 飘花落叶言子楪兰哲世苏(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
.end method

.method public abstract 飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V
.end method

.method public abstract 飘花落叶言子楪兰苏世哲()I
.end method

.method public abstract 飘花落叶言子楪兰苏哲世()J
.end method

.method public abstract 飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;
.end method

.method public abstract 飘花落叶言子楪哲世苏兰()Z
.end method

.method public abstract 飘花落叶言子楪哲兰世苏()I
.end method

.method public abstract 飘花落叶言子楪哲兰苏世()J
.end method

.method public abstract 飘花落叶言子楪哲苏世兰()D
.end method

.method public abstract 飘花落叶言子楪哲苏兰世()I
.end method

.method public abstract 飘花落叶言子楪苏世哲兰()Z
.end method

.method public abstract 飘花落叶言子楪苏兰世哲(I)V
.end method

.method public abstract 飘花落叶言子楪苏兰哲世(I)I
.end method
