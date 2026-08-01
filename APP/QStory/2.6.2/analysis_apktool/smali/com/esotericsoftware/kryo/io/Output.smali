.class public Lcom/esotericsoftware/kryo/io/Output;
.super Ljava/io/OutputStream;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/AutoCloseable;
.implements Lcom/esotericsoftware/kryo/util/Pool$Poolable;


# instance fields
.field protected buffer:[B

.field protected capacity:I

.field protected maxCapacity:I

.field protected outputStream:Ljava/io/OutputStream;

.field protected position:I

.field protected total:J

.field protected varEncoding:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Output;->varEncoding:Z

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p1}, Lcom/esotericsoftware/kryo/io/Output;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Output;->varEncoding:Z

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-le p1, p2, :cond_1

    .line 9
    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "bufferSize: "

    .line 14
    .line 15
    const-string v0, " cannot be greater than maxBufferSize: "

    .line 16
    .line 17
    invoke-static {p1, p2, p0, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏哲兰世(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_0
    if-lt p2, v0, :cond_3

    .line 27
    .line 28
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 29
    .line 30
    if-ne p2, v0, :cond_2

    .line 31
    .line 32
    const p2, 0x7ffffff7

    .line 33
    .line 34
    .line 35
    :cond_2
    iput p2, p0, Lcom/esotericsoftware/kryo/io/Output;->maxCapacity:I

    .line 36
    .line 37
    new-array p1, p1, [B

    .line 38
    .line 39
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 40
    .line 41
    return-void

    .line 42
    :cond_3
    const-string p0, "maxBufferSize cannot be < -1: "

    .line 43
    .line 44
    invoke-static {p2, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    throw p0
.end method

.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1

    const/16 v0, 0x1000

    .line 61
    invoke-direct {p0, v0, v0}, Lcom/esotericsoftware/kryo/io/Output;-><init>(II)V

    if-eqz p1, :cond_0

    .line 62
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    return-void

    .line 63
    :cond_0
    const-string p0, "outputStream cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 0

    .line 64
    invoke-direct {p0, p2, p2}, Lcom/esotericsoftware/kryo/io/Output;-><init>(II)V

    if-eqz p1, :cond_0

    .line 65
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    return-void

    .line 66
    :cond_0
    const-string p0, "outputStream cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 56
    array-length v0, p1

    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/io/Output;-><init>([BI)V

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x1

    .line 58
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Output;->varEncoding:Z

    if-eqz p1, :cond_0

    .line 59
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/Output;->setBuffer([BI)V

    return-void

    .line 60
    :cond_0
    const-string p0, "buffer cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static varIntLength(IZ)I
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    shl-int/lit8 p1, p0, 0x1

    .line 4
    .line 5
    shr-int/lit8 p0, p0, 0x1f

    .line 6
    .line 7
    xor-int/2addr p0, p1

    .line 8
    :cond_0
    ushr-int/lit8 p1, p0, 0x7

    .line 9
    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_1
    ushr-int/lit8 p1, p0, 0xe

    .line 15
    .line 16
    if-nez p1, :cond_2

    .line 17
    .line 18
    const/4 p0, 0x2

    .line 19
    return p0

    .line 20
    :cond_2
    ushr-int/lit8 p1, p0, 0x15

    .line 21
    .line 22
    if-nez p1, :cond_3

    .line 23
    .line 24
    const/4 p0, 0x3

    .line 25
    return p0

    .line 26
    :cond_3
    ushr-int/lit8 p0, p0, 0x1c

    .line 27
    .line 28
    if-nez p0, :cond_4

    .line 29
    .line 30
    const/4 p0, 0x4

    .line 31
    return p0

    .line 32
    :cond_4
    const/4 p0, 0x5

    .line 33
    return p0
.end method

.method public static varLongLength(JZ)I
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    shl-long v1, p0, v0

    .line 5
    .line 6
    const/16 p2, 0x3f

    .line 7
    .line 8
    shr-long/2addr p0, p2

    .line 9
    xor-long/2addr p0, v1

    .line 10
    :cond_0
    const/4 p2, 0x7

    .line 11
    ushr-long v1, p0, p2

    .line 12
    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    cmp-long v1, v1, v3

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    const/16 v0, 0xe

    .line 21
    .line 22
    ushr-long v0, p0, v0

    .line 23
    .line 24
    cmp-long v0, v0, v3

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    const/4 p0, 0x2

    .line 29
    return p0

    .line 30
    :cond_2
    const/16 v0, 0x15

    .line 31
    .line 32
    ushr-long v0, p0, v0

    .line 33
    .line 34
    cmp-long v0, v0, v3

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    const/4 p0, 0x3

    .line 39
    return p0

    .line 40
    :cond_3
    const/16 v0, 0x1c

    .line 41
    .line 42
    ushr-long v0, p0, v0

    .line 43
    .line 44
    cmp-long v0, v0, v3

    .line 45
    .line 46
    if-nez v0, :cond_4

    .line 47
    .line 48
    const/4 p0, 0x4

    .line 49
    return p0

    .line 50
    :cond_4
    const/16 v0, 0x23

    .line 51
    .line 52
    ushr-long v0, p0, v0

    .line 53
    .line 54
    cmp-long v0, v0, v3

    .line 55
    .line 56
    if-nez v0, :cond_5

    .line 57
    .line 58
    const/4 p0, 0x5

    .line 59
    return p0

    .line 60
    :cond_5
    const/16 v0, 0x2a

    .line 61
    .line 62
    ushr-long v0, p0, v0

    .line 63
    .line 64
    cmp-long v0, v0, v3

    .line 65
    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    const/4 p0, 0x6

    .line 69
    return p0

    .line 70
    :cond_6
    const/16 v0, 0x31

    .line 71
    .line 72
    ushr-long v0, p0, v0

    .line 73
    .line 74
    cmp-long v0, v0, v3

    .line 75
    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    return p2

    .line 79
    :cond_7
    const/16 p2, 0x38

    .line 80
    .line 81
    ushr-long/2addr p0, p2

    .line 82
    cmp-long p0, p0, v3

    .line 83
    .line 84
    if-nez p0, :cond_8

    .line 85
    .line 86
    const/16 p0, 0x8

    .line 87
    .line 88
    return p0

    .line 89
    :cond_8
    const/16 p0, 0x9

    .line 90
    .line 91
    return p0
.end method

.method private writeAscii_slow(Ljava/lang/String;I)V
    .locals 5

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 5
    .line 6
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 7
    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 12
    .line 13
    .line 14
    :cond_1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 15
    .line 16
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 17
    .line 18
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 19
    .line 20
    sub-int/2addr v1, v2

    .line 21
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, p2, :cond_3

    .line 27
    .line 28
    add-int v3, v2, v1

    .line 29
    .line 30
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 31
    .line 32
    invoke-virtual {p1, v2, v3, v0, v4}, Ljava/lang/String;->getBytes(II[BI)V

    .line 33
    .line 34
    .line 35
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 36
    .line 37
    add-int/2addr v2, v1

    .line 38
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 39
    .line 40
    sub-int v1, p2, v3

    .line 41
    .line 42
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 43
    .line 44
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 55
    .line 56
    :cond_2
    move v2, v3

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    :goto_1
    return-void
.end method

.method private writeUtf8_slow(Ljava/lang/String;II)V
    .locals 6

    .line 1
    :goto_0
    if-ge p3, p2, :cond_4

    .line 2
    .line 3
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 4
    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    sub-int v0, p2, p3

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p1, p3}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v1, 0x7f

    .line 23
    .line 24
    if-gt v0, v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 27
    .line 28
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 29
    .line 30
    add-int/lit8 v3, v2, 0x1

    .line 31
    .line 32
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 33
    .line 34
    int-to-byte v0, v0

    .line 35
    aput-byte v0, v1, v2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 39
    .line 40
    const/16 v2, 0x7ff

    .line 41
    .line 42
    if-le v0, v2, :cond_2

    .line 43
    .line 44
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 45
    .line 46
    add-int/lit8 v3, v2, 0x1

    .line 47
    .line 48
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 49
    .line 50
    shr-int/lit8 v3, v0, 0xc

    .line 51
    .line 52
    and-int/lit8 v3, v3, 0xf

    .line 53
    .line 54
    or-int/lit16 v3, v3, 0xe0

    .line 55
    .line 56
    int-to-byte v3, v3

    .line 57
    aput-byte v3, v1, v2

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 64
    .line 65
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 66
    .line 67
    add-int/lit8 v4, v3, 0x1

    .line 68
    .line 69
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 70
    .line 71
    shr-int/lit8 v5, v0, 0x6

    .line 72
    .line 73
    and-int/lit8 v5, v5, 0x3f

    .line 74
    .line 75
    or-int/lit16 v5, v5, 0x80

    .line 76
    .line 77
    int-to-byte v5, v5

    .line 78
    aput-byte v5, v2, v3

    .line 79
    .line 80
    add-int/2addr v3, v1

    .line 81
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 82
    .line 83
    and-int/lit8 v0, v0, 0x3f

    .line 84
    .line 85
    or-int/lit16 v0, v0, 0x80

    .line 86
    .line 87
    int-to-byte v0, v0

    .line 88
    aput-byte v0, v2, v4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 92
    .line 93
    add-int/lit8 v3, v2, 0x1

    .line 94
    .line 95
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 96
    .line 97
    shr-int/lit8 v4, v0, 0x6

    .line 98
    .line 99
    and-int/lit8 v4, v4, 0x1f

    .line 100
    .line 101
    or-int/lit16 v4, v4, 0xc0

    .line 102
    .line 103
    int-to-byte v4, v4

    .line 104
    aput-byte v4, v1, v2

    .line 105
    .line 106
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 107
    .line 108
    if-ne v3, v1, :cond_3

    .line 109
    .line 110
    const/4 v1, 0x1

    .line 111
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 112
    .line 113
    .line 114
    :cond_3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 115
    .line 116
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 117
    .line 118
    add-int/lit8 v3, v2, 0x1

    .line 119
    .line 120
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 121
    .line 122
    and-int/lit8 v0, v0, 0x3f

    .line 123
    .line 124
    or-int/lit16 v0, v0, 0x80

    .line 125
    .line 126
    int-to-byte v0, v0

    .line 127
    aput-byte v0, v1, v2

    .line 128
    .line 129
    :goto_1
    add-int/lit8 p3, p3, 0x1

    .line 130
    .line 131
    goto/16 :goto_0

    .line 132
    .line 133
    :cond_4
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Output;->flush()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    :catch_0
    :cond_0
    return-void
.end method

.method public flush()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 7
    .line 8
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    iget-wide v0, p0, Lcom/esotericsoftware/kryo/io/Output;->total:J

    .line 20
    .line 21
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 22
    .line 23
    int-to-long v4, v2

    .line 24
    add-long/2addr v0, v4

    .line 25
    iput-wide v0, p0, Lcom/esotericsoftware/kryo/io/Output;->total:J

    .line 26
    .line 27
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception p0

    .line 31
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method

.method public getBuffer()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public getMaxCapacity()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Output;->maxCapacity:I

    .line 2
    .line 3
    return p0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    .line 2
    .line 3
    return-object p0
.end method

.method public getVariableLengthEncoding()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/io/Output;->varEncoding:Z

    .line 2
    .line 3
    return p0
.end method

.method public intLength(IZ)I
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/io/Output;->varEncoding:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, p2}, Lcom/esotericsoftware/kryo/io/Output;->varIntLength(IZ)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x4

    .line 11
    return p0
.end method

.method public longLength(IZ)I
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/io/Output;->varEncoding:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    int-to-long p0, p1

    .line 6
    invoke-static {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/Output;->varLongLength(JZ)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 p0, 0x8

    .line 12
    .line 13
    return p0
.end method

.method public position()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    return p0
.end method

.method public require(I)Z
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    const/4 v1, 0x0

    .line 7
    if-lt v0, p1, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Output;->flush()V

    .line 11
    .line 12
    .line 13
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 14
    .line 15
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 16
    .line 17
    sub-int v3, v0, v2

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    if-lt v3, p1, :cond_1

    .line 21
    .line 22
    return v4

    .line 23
    :cond_1
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->maxCapacity:I

    .line 24
    .line 25
    sub-int v2, v3, v2

    .line 26
    .line 27
    if-le p1, v2, :cond_3

    .line 28
    .line 29
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->maxCapacity:I

    .line 30
    .line 31
    const-string v1, ", required: "

    .line 32
    .line 33
    if-le p1, v3, :cond_2

    .line 34
    .line 35
    new-instance p0, Lcom/esotericsoftware/kryo/io/KryoBufferOverflowException;

    .line 36
    .line 37
    const-string v2, "Buffer overflow. Max capacity: "

    .line 38
    .line 39
    invoke-static {v0, p1, v2, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏哲兰世(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/KryoBufferOverflowException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_2
    new-instance v2, Lcom/esotericsoftware/kryo/io/KryoBufferOverflowException;

    .line 48
    .line 49
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 50
    .line 51
    sub-int/2addr v0, p0

    .line 52
    new-instance p0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v3, "Buffer overflow. Available: "

    .line 55
    .line 56
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {v2, p0}, Lcom/esotericsoftware/kryo/io/KryoBufferOverflowException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v2

    .line 76
    :cond_3
    if-nez v0, :cond_4

    .line 77
    .line 78
    const/16 v0, 0x10

    .line 79
    .line 80
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 81
    .line 82
    :cond_4
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 83
    .line 84
    mul-int/lit8 v0, v0, 0x2

    .line 85
    .line 86
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->maxCapacity:I

    .line 87
    .line 88
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 93
    .line 94
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 95
    .line 96
    sub-int v3, v0, v2

    .line 97
    .line 98
    if-lt v3, p1, :cond_4

    .line 99
    .line 100
    new-array p1, v0, [B

    .line 101
    .line 102
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 103
    .line 104
    invoke-static {v0, v1, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 105
    .line 106
    .line 107
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 108
    .line 109
    return v4
.end method

.method public reset()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/esotericsoftware/kryo/io/Output;->total:J

    .line 7
    .line 8
    return-void
.end method

.method public setBuffer([B)V
    .locals 1

    .line 80
    array-length v0, p1

    invoke-virtual {p0, p1, v0}, Lcom/esotericsoftware/kryo/io/Output;->setBuffer([BI)V

    return-void
.end method

.method public setBuffer([BI)V
    .locals 2

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    const/4 v1, -0x1

    .line 5
    if-le v0, p2, :cond_1

    .line 6
    .line 7
    if-ne p2, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    array-length p1, p1

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "buffer has length: "

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, " cannot be greater than maxBufferSize: "

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p0

    .line 39
    :cond_1
    :goto_0
    if-lt p2, v1, :cond_3

    .line 40
    .line 41
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 42
    .line 43
    if-ne p2, v1, :cond_2

    .line 44
    .line 45
    const p2, 0x7ffffff7

    .line 46
    .line 47
    .line 48
    :cond_2
    iput p2, p0, Lcom/esotericsoftware/kryo/io/Output;->maxCapacity:I

    .line 49
    .line 50
    array-length p1, p1

    .line 51
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 55
    .line 56
    const-wide/16 p1, 0x0

    .line 57
    .line 58
    iput-wide p1, p0, Lcom/esotericsoftware/kryo/io/Output;->total:J

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    const-string p0, "maxBufferSize cannot be < -1: "

    .line 65
    .line 66
    invoke-static {p2, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    const-string p0, "buffer cannot be null."

    .line 75
    .line 76
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public setOutputStream(Ljava/io/OutputStream;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Output;->outputStream:Ljava/io/OutputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Output;->reset()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    return-void
.end method

.method public setVariableLengthEncoding(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/io/Output;->varEncoding:Z

    .line 2
    .line 3
    return-void
.end method

.method public toBytes()[B
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p0, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    return-object v1
.end method

.method public total()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/esotericsoftware/kryo/io/Output;->total:J

    .line 2
    .line 3
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 4
    .line 5
    int-to-long v2, p0

    .line 6
    add-long/2addr v0, v2

    .line 7
    return-wide v0
.end method

.method public write(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 12
    .line 13
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 14
    .line 15
    add-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    int-to-byte p0, p1

    .line 20
    aput-byte p0, v0, v1

    .line 21
    .line 22
    return-void
.end method

.method public write([B)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 23
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeBytes([BII)V

    return-void

    .line 24
    :cond_0
    const-string p0, "bytes cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void
.end method

.method public write([BII)V
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/io/Output;->writeBytes([BII)V

    return-void
.end method

.method public writeAscii(Ljava/lang/String;)V
    .locals 6

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 20
    .line 21
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 22
    .line 23
    sub-int/2addr v4, v5

    .line 24
    if-ge v4, v1, :cond_1

    .line 25
    .line 26
    invoke-direct {p0, p1, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeAscii_slow(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v4, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 31
    .line 32
    invoke-virtual {p1, v2, v1, v4, v5}, Ljava/lang/String;->getBytes(II[BI)V

    .line 33
    .line 34
    .line 35
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 36
    .line 37
    add-int/2addr p1, v1

    .line 38
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 39
    .line 40
    :goto_0
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 41
    .line 42
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 43
    .line 44
    sub-int/2addr p0, v3

    .line 45
    aget-byte v1, p1, p0

    .line 46
    .line 47
    or-int/2addr v0, v1

    .line 48
    int-to-byte v0, v0

    .line 49
    aput-byte v0, p1, p0

    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    const/4 v0, 0x2

    .line 53
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 57
    .line 58
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 59
    .line 60
    add-int/lit8 v4, v3, 0x1

    .line 61
    .line 62
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 63
    .line 64
    const/16 v5, -0x7e

    .line 65
    .line 66
    aput-byte v5, v1, v3

    .line 67
    .line 68
    add-int/2addr v3, v0

    .line 69
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 70
    .line 71
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    int-to-byte p0, p0

    .line 76
    aput-byte p0, v1, v4

    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    const/16 p1, 0x81

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public writeBoolean(Z)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 12
    .line 13
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 14
    .line 15
    add-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    aput-byte p1, v0, v1

    .line 20
    .line 21
    return-void
.end method

.method public writeBooleans([ZII)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    if-lt v0, p3, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0, p3}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 9
    .line 10
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 11
    .line 12
    add-int/2addr p3, p2

    .line 13
    :goto_0
    if-ge p2, p3, :cond_0

    .line 14
    .line 15
    aget-boolean v2, p1, p2

    .line 16
    .line 17
    aput-byte v2, v0, v1

    .line 18
    .line 19
    add-int/lit8 p2, p2, 0x1

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    add-int/2addr p3, p2

    .line 28
    :goto_1
    if-ge p2, p3, :cond_2

    .line 29
    .line 30
    aget-boolean v0, p1, p2

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeBoolean(Z)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 p2, p2, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    return-void
.end method

.method public writeByte(B)V
    .locals 3

    .line 23
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    aput-byte p1, v0, v1

    return-void
.end method

.method public writeByte(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 12
    .line 13
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 14
    .line 15
    add-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 18
    .line 19
    int-to-byte p0, p1

    .line 20
    aput-byte p0, v0, v1

    .line 21
    .line 22
    return-void
.end method

.method public writeBytes([B)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 50
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeBytes([BII)V

    return-void

    .line 51
    :cond_0
    const-string p0, "bytes cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void
.end method

.method public writeBytes([BII)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 4
    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 6
    .line 7
    sub-int/2addr v0, v1

    .line 8
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 13
    .line 14
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 15
    .line 16
    invoke-static {p1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 20
    .line 21
    add-int/2addr v1, v0

    .line 22
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 23
    .line 24
    sub-int/2addr p3, v0

    .line 25
    if-nez p3, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    add-int/2addr p2, v0

    .line 29
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const-string p0, "bytes cannot be null."

    .line 45
    .line 46
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public writeChar(C)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 3
    .line 4
    .line 5
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 6
    .line 7
    add-int/lit8 v1, v0, 0x2

    .line 8
    .line 9
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 10
    .line 11
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 12
    .line 13
    int-to-byte v1, p1

    .line 14
    aput-byte v1, p0, v0

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    ushr-int/lit8 p1, p1, 0x8

    .line 19
    .line 20
    int-to-byte p1, p1

    .line 21
    aput-byte p1, p0, v0

    .line 22
    .line 23
    return-void
.end method

.method public writeChars([CII)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    shl-int/lit8 v1, p3, 0x1

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 11
    .line 12
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 13
    .line 14
    add-int/2addr p3, p2

    .line 15
    :goto_0
    if-ge p2, p3, :cond_0

    .line 16
    .line 17
    aget-char v2, p1, p2

    .line 18
    .line 19
    int-to-byte v3, v2

    .line 20
    aput-byte v3, v0, v1

    .line 21
    .line 22
    add-int/lit8 v3, v1, 0x1

    .line 23
    .line 24
    ushr-int/lit8 v2, v2, 0x8

    .line 25
    .line 26
    int-to-byte v2, v2

    .line 27
    aput-byte v2, v0, v3

    .line 28
    .line 29
    add-int/lit8 p2, p2, 0x1

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    add-int/2addr p3, p2

    .line 38
    :goto_1
    if-ge p2, p3, :cond_2

    .line 39
    .line 40
    aget-char v0, p1, p2

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeChar(C)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 p2, p2, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    return-void
.end method

.method public writeDouble(D)V
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 7
    .line 8
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 9
    .line 10
    add-int/lit8 v3, v2, 0x8

    .line 11
    .line 12
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 13
    .line 14
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    long-to-int p2, p0

    .line 19
    int-to-byte p2, p2

    .line 20
    aput-byte p2, v1, v2

    .line 21
    .line 22
    add-int/lit8 p2, v2, 0x1

    .line 23
    .line 24
    ushr-long v3, p0, v0

    .line 25
    .line 26
    long-to-int v0, v3

    .line 27
    int-to-byte v0, v0

    .line 28
    aput-byte v0, v1, p2

    .line 29
    .line 30
    add-int/lit8 p2, v2, 0x2

    .line 31
    .line 32
    const/16 v0, 0x10

    .line 33
    .line 34
    ushr-long v3, p0, v0

    .line 35
    .line 36
    long-to-int v0, v3

    .line 37
    int-to-byte v0, v0

    .line 38
    aput-byte v0, v1, p2

    .line 39
    .line 40
    add-int/lit8 p2, v2, 0x3

    .line 41
    .line 42
    const/16 v0, 0x18

    .line 43
    .line 44
    ushr-long v3, p0, v0

    .line 45
    .line 46
    long-to-int v0, v3

    .line 47
    int-to-byte v0, v0

    .line 48
    aput-byte v0, v1, p2

    .line 49
    .line 50
    add-int/lit8 p2, v2, 0x4

    .line 51
    .line 52
    const/16 v0, 0x20

    .line 53
    .line 54
    ushr-long v3, p0, v0

    .line 55
    .line 56
    long-to-int v0, v3

    .line 57
    int-to-byte v0, v0

    .line 58
    aput-byte v0, v1, p2

    .line 59
    .line 60
    add-int/lit8 p2, v2, 0x5

    .line 61
    .line 62
    const/16 v0, 0x28

    .line 63
    .line 64
    ushr-long v3, p0, v0

    .line 65
    .line 66
    long-to-int v0, v3

    .line 67
    int-to-byte v0, v0

    .line 68
    aput-byte v0, v1, p2

    .line 69
    .line 70
    add-int/lit8 p2, v2, 0x6

    .line 71
    .line 72
    const/16 v0, 0x30

    .line 73
    .line 74
    ushr-long v3, p0, v0

    .line 75
    .line 76
    long-to-int v0, v3

    .line 77
    int-to-byte v0, v0

    .line 78
    aput-byte v0, v1, p2

    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x7

    .line 81
    .line 82
    const/16 p2, 0x38

    .line 83
    .line 84
    ushr-long/2addr p0, p2

    .line 85
    long-to-int p0, p0

    .line 86
    int-to-byte p0, p0

    .line 87
    aput-byte p0, v1, v2

    .line 88
    .line 89
    return-void
.end method

.method public writeDoubles([DII)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    shl-int/lit8 v1, p3, 0x3

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 11
    .line 12
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 13
    .line 14
    add-int/2addr p3, p2

    .line 15
    :goto_0
    if-ge p2, p3, :cond_0

    .line 16
    .line 17
    aget-wide v2, p1, p2

    .line 18
    .line 19
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    long-to-int v4, v2

    .line 24
    int-to-byte v4, v4

    .line 25
    aput-byte v4, v0, v1

    .line 26
    .line 27
    add-int/lit8 v4, v1, 0x1

    .line 28
    .line 29
    const/16 v5, 0x8

    .line 30
    .line 31
    ushr-long v5, v2, v5

    .line 32
    .line 33
    long-to-int v5, v5

    .line 34
    int-to-byte v5, v5

    .line 35
    aput-byte v5, v0, v4

    .line 36
    .line 37
    add-int/lit8 v4, v1, 0x2

    .line 38
    .line 39
    const/16 v5, 0x10

    .line 40
    .line 41
    ushr-long v5, v2, v5

    .line 42
    .line 43
    long-to-int v5, v5

    .line 44
    int-to-byte v5, v5

    .line 45
    aput-byte v5, v0, v4

    .line 46
    .line 47
    add-int/lit8 v4, v1, 0x3

    .line 48
    .line 49
    const/16 v5, 0x18

    .line 50
    .line 51
    ushr-long v5, v2, v5

    .line 52
    .line 53
    long-to-int v5, v5

    .line 54
    int-to-byte v5, v5

    .line 55
    aput-byte v5, v0, v4

    .line 56
    .line 57
    add-int/lit8 v4, v1, 0x4

    .line 58
    .line 59
    const/16 v5, 0x20

    .line 60
    .line 61
    ushr-long v5, v2, v5

    .line 62
    .line 63
    long-to-int v5, v5

    .line 64
    int-to-byte v5, v5

    .line 65
    aput-byte v5, v0, v4

    .line 66
    .line 67
    add-int/lit8 v4, v1, 0x5

    .line 68
    .line 69
    const/16 v5, 0x28

    .line 70
    .line 71
    ushr-long v5, v2, v5

    .line 72
    .line 73
    long-to-int v5, v5

    .line 74
    int-to-byte v5, v5

    .line 75
    aput-byte v5, v0, v4

    .line 76
    .line 77
    add-int/lit8 v4, v1, 0x6

    .line 78
    .line 79
    const/16 v5, 0x30

    .line 80
    .line 81
    ushr-long v5, v2, v5

    .line 82
    .line 83
    long-to-int v5, v5

    .line 84
    int-to-byte v5, v5

    .line 85
    aput-byte v5, v0, v4

    .line 86
    .line 87
    add-int/lit8 v4, v1, 0x7

    .line 88
    .line 89
    const/16 v5, 0x38

    .line 90
    .line 91
    ushr-long/2addr v2, v5

    .line 92
    long-to-int v2, v2

    .line 93
    int-to-byte v2, v2

    .line 94
    aput-byte v2, v0, v4

    .line 95
    .line 96
    add-int/lit8 p2, p2, 0x1

    .line 97
    .line 98
    add-int/lit8 v1, v1, 0x8

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 102
    .line 103
    return-void

    .line 104
    :cond_1
    add-int/2addr p3, p2

    .line 105
    :goto_1
    if-ge p2, p3, :cond_2

    .line 106
    .line 107
    aget-wide v0, p1, p2

    .line 108
    .line 109
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeDouble(D)V

    .line 110
    .line 111
    .line 112
    add-int/lit8 p2, p2, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    return-void
.end method

.method public writeFloat(F)V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 6
    .line 7
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0x4

    .line 10
    .line 11
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    int-to-byte p1, p0

    .line 18
    aput-byte p1, v0, v1

    .line 19
    .line 20
    add-int/lit8 p1, v1, 0x1

    .line 21
    .line 22
    shr-int/lit8 v2, p0, 0x8

    .line 23
    .line 24
    int-to-byte v2, v2

    .line 25
    aput-byte v2, v0, p1

    .line 26
    .line 27
    add-int/lit8 p1, v1, 0x2

    .line 28
    .line 29
    shr-int/lit8 v2, p0, 0x10

    .line 30
    .line 31
    int-to-byte v2, v2

    .line 32
    aput-byte v2, v0, p1

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x3

    .line 35
    .line 36
    shr-int/lit8 p0, p0, 0x18

    .line 37
    .line 38
    int-to-byte p0, p0

    .line 39
    aput-byte p0, v0, v1

    .line 40
    .line 41
    return-void
.end method

.method public writeFloats([FII)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    shl-int/lit8 v1, p3, 0x2

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 11
    .line 12
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 13
    .line 14
    add-int/2addr p3, p2

    .line 15
    :goto_0
    if-ge p2, p3, :cond_0

    .line 16
    .line 17
    aget v2, p1, p2

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    int-to-byte v3, v2

    .line 24
    aput-byte v3, v0, v1

    .line 25
    .line 26
    add-int/lit8 v3, v1, 0x1

    .line 27
    .line 28
    shr-int/lit8 v4, v2, 0x8

    .line 29
    .line 30
    int-to-byte v4, v4

    .line 31
    aput-byte v4, v0, v3

    .line 32
    .line 33
    add-int/lit8 v3, v1, 0x2

    .line 34
    .line 35
    shr-int/lit8 v4, v2, 0x10

    .line 36
    .line 37
    int-to-byte v4, v4

    .line 38
    aput-byte v4, v0, v3

    .line 39
    .line 40
    add-int/lit8 v3, v1, 0x3

    .line 41
    .line 42
    shr-int/lit8 v2, v2, 0x18

    .line 43
    .line 44
    int-to-byte v2, v2

    .line 45
    aput-byte v2, v0, v3

    .line 46
    .line 47
    add-int/lit8 p2, p2, 0x1

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x4

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    add-int/2addr p3, p2

    .line 56
    :goto_1
    if-ge p2, p3, :cond_2

    .line 57
    .line 58
    aget v0, p1, p2

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeFloat(F)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 p2, p2, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    return-void
.end method

.method public writeInt(IZ)I
    .locals 1

    .line 108
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Output;->varEncoding:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    move-result p0

    return p0

    .line 109
    :cond_0
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeInt(I)V

    const/4 p0, 0x4

    return p0
.end method

.method public writeInt(I)V
    .locals 3

    const/4 v0, 0x4

    .line 100
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 101
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 102
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    add-int/lit8 v2, v1, 0x4

    .line 103
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    int-to-byte p0, p1

    .line 104
    aput-byte p0, v0, v1

    add-int/lit8 p0, v1, 0x1

    shr-int/lit8 v2, p1, 0x8

    int-to-byte v2, v2

    .line 105
    aput-byte v2, v0, p0

    add-int/lit8 p0, v1, 0x2

    shr-int/lit8 v2, p1, 0x10

    int-to-byte v2, v2

    .line 106
    aput-byte v2, v0, p0

    add-int/lit8 v1, v1, 0x3

    shr-int/lit8 p0, p1, 0x18

    int-to-byte p0, p0

    .line 107
    aput-byte p0, v0, v1

    return-void
.end method

.method public writeInt(II)V
    .locals 4

    .line 1
    if-ltz p2, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-gt p2, v0, :cond_4

    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 7
    .line 8
    .line 9
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 10
    .line 11
    add-int v2, v1, p2

    .line 12
    .line 13
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq p2, v2, :cond_3

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    if-eq p2, v3, :cond_2

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    if-eq p2, v2, :cond_1

    .line 23
    .line 24
    if-eq p2, v0, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 28
    .line 29
    shr-int/lit8 p2, p1, 0x18

    .line 30
    .line 31
    int-to-byte p2, p2

    .line 32
    aput-byte p2, p0, v1

    .line 33
    .line 34
    add-int/lit8 p2, v1, 0x1

    .line 35
    .line 36
    shr-int/lit8 v0, p1, 0x10

    .line 37
    .line 38
    int-to-byte v0, v0

    .line 39
    aput-byte v0, p0, p2

    .line 40
    .line 41
    add-int/lit8 p2, v1, 0x2

    .line 42
    .line 43
    shr-int/lit8 v0, p1, 0x8

    .line 44
    .line 45
    int-to-byte v0, v0

    .line 46
    aput-byte v0, p0, p2

    .line 47
    .line 48
    add-int/2addr v1, v2

    .line 49
    int-to-byte p1, p1

    .line 50
    aput-byte p1, p0, v1

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 54
    .line 55
    shr-int/lit8 p2, p1, 0x10

    .line 56
    .line 57
    int-to-byte p2, p2

    .line 58
    aput-byte p2, p0, v1

    .line 59
    .line 60
    add-int/lit8 p2, v1, 0x1

    .line 61
    .line 62
    shr-int/lit8 v0, p1, 0x8

    .line 63
    .line 64
    int-to-byte v0, v0

    .line 65
    aput-byte v0, p0, p2

    .line 66
    .line 67
    add-int/2addr v1, v3

    .line 68
    int-to-byte p1, p1

    .line 69
    aput-byte p1, p0, v1

    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 73
    .line 74
    shr-int/lit8 p2, p1, 0x8

    .line 75
    .line 76
    int-to-byte p2, p2

    .line 77
    aput-byte p2, p0, v1

    .line 78
    .line 79
    add-int/2addr v1, v2

    .line 80
    int-to-byte p1, p1

    .line 81
    aput-byte p1, p0, v1

    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 85
    .line 86
    int-to-byte p1, p1

    .line 87
    aput-byte p1, p0, v1

    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    const-string p0, "count must be >= 0 and <= 4: "

    .line 91
    .line 92
    invoke-static {p2, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public writeInts([III)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    shl-int/lit8 v1, p3, 0x2

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 11
    .line 12
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 13
    .line 14
    add-int/2addr p3, p2

    .line 15
    :goto_0
    if-ge p2, p3, :cond_0

    .line 16
    .line 17
    aget v2, p1, p2

    .line 18
    .line 19
    int-to-byte v3, v2

    .line 20
    aput-byte v3, v0, v1

    .line 21
    .line 22
    add-int/lit8 v3, v1, 0x1

    .line 23
    .line 24
    shr-int/lit8 v4, v2, 0x8

    .line 25
    .line 26
    int-to-byte v4, v4

    .line 27
    aput-byte v4, v0, v3

    .line 28
    .line 29
    add-int/lit8 v3, v1, 0x2

    .line 30
    .line 31
    shr-int/lit8 v4, v2, 0x10

    .line 32
    .line 33
    int-to-byte v4, v4

    .line 34
    aput-byte v4, v0, v3

    .line 35
    .line 36
    add-int/lit8 v3, v1, 0x3

    .line 37
    .line 38
    shr-int/lit8 v2, v2, 0x18

    .line 39
    .line 40
    int-to-byte v2, v2

    .line 41
    aput-byte v2, v0, v3

    .line 42
    .line 43
    add-int/lit8 p2, p2, 0x1

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x4

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    add-int/2addr p3, p2

    .line 52
    :goto_1
    if-ge p2, p3, :cond_2

    .line 53
    .line 54
    aget v0, p1, p2

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeInt(I)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 p2, p2, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    return-void
.end method

.method public writeInts([IIIZ)V
    .locals 1

    .line 63
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Output;->varEncoding:Z

    if-eqz v0, :cond_1

    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_0

    .line 64
    aget v0, p1, p2

    invoke-virtual {p0, v0, p4}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 65
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/io/Output;->writeInts([III)V

    return-void
.end method

.method public writeLong(JZ)I
    .locals 1

    .line 94
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Output;->varEncoding:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/io/Output;->writeVarLong(JZ)I

    move-result p0

    return p0

    .line 95
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/Output;->writeLong(J)V

    const/16 p0, 0x8

    return p0
.end method

.method public writeLong(J)V
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 7
    .line 8
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 9
    .line 10
    add-int/lit8 v3, v2, 0x8

    .line 11
    .line 12
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 13
    .line 14
    long-to-int p0, p1

    .line 15
    int-to-byte p0, p0

    .line 16
    aput-byte p0, v1, v2

    .line 17
    .line 18
    add-int/lit8 p0, v2, 0x1

    .line 19
    .line 20
    ushr-long v3, p1, v0

    .line 21
    .line 22
    long-to-int v0, v3

    .line 23
    int-to-byte v0, v0

    .line 24
    aput-byte v0, v1, p0

    .line 25
    .line 26
    add-int/lit8 p0, v2, 0x2

    .line 27
    .line 28
    const/16 v0, 0x10

    .line 29
    .line 30
    ushr-long v3, p1, v0

    .line 31
    .line 32
    long-to-int v0, v3

    .line 33
    int-to-byte v0, v0

    .line 34
    aput-byte v0, v1, p0

    .line 35
    .line 36
    add-int/lit8 p0, v2, 0x3

    .line 37
    .line 38
    const/16 v0, 0x18

    .line 39
    .line 40
    ushr-long v3, p1, v0

    .line 41
    .line 42
    long-to-int v0, v3

    .line 43
    int-to-byte v0, v0

    .line 44
    aput-byte v0, v1, p0

    .line 45
    .line 46
    add-int/lit8 p0, v2, 0x4

    .line 47
    .line 48
    const/16 v0, 0x20

    .line 49
    .line 50
    ushr-long v3, p1, v0

    .line 51
    .line 52
    long-to-int v0, v3

    .line 53
    int-to-byte v0, v0

    .line 54
    aput-byte v0, v1, p0

    .line 55
    .line 56
    add-int/lit8 p0, v2, 0x5

    .line 57
    .line 58
    const/16 v0, 0x28

    .line 59
    .line 60
    ushr-long v3, p1, v0

    .line 61
    .line 62
    long-to-int v0, v3

    .line 63
    int-to-byte v0, v0

    .line 64
    aput-byte v0, v1, p0

    .line 65
    .line 66
    add-int/lit8 p0, v2, 0x6

    .line 67
    .line 68
    const/16 v0, 0x30

    .line 69
    .line 70
    ushr-long v3, p1, v0

    .line 71
    .line 72
    long-to-int v0, v3

    .line 73
    int-to-byte v0, v0

    .line 74
    aput-byte v0, v1, p0

    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x7

    .line 77
    .line 78
    const/16 p0, 0x38

    .line 79
    .line 80
    ushr-long p0, p1, p0

    .line 81
    .line 82
    long-to-int p0, p0

    .line 83
    int-to-byte p0, p0

    .line 84
    aput-byte p0, v1, v2

    .line 85
    .line 86
    return-void
.end method

.method public writeLong(JI)V
    .locals 3

    if-ltz p3, :cond_1

    const/16 v0, 0x8

    if-gt p3, v0, :cond_1

    const/4 v0, 0x4

    if-gt p3, v0, :cond_0

    long-to-int p1, p1

    .line 87
    invoke-virtual {p0, p1, p3}, Lcom/esotericsoftware/kryo/io/Output;->writeInt(II)V

    return-void

    .line 88
    :cond_0
    invoke-virtual {p0, p3}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    const/16 v1, 0x20

    shr-long v1, p1, v1

    long-to-int v1, v1

    sub-int/2addr p3, v0

    .line 89
    invoke-virtual {p0, v1, p3}, Lcom/esotericsoftware/kryo/io/Output;->writeInt(II)V

    long-to-int p1, p1

    .line 90
    invoke-virtual {p0, p1, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeInt(II)V

    return-void

    .line 91
    :cond_1
    const-string p0, "count must be >= 0 and <= 8: "

    .line 92
    invoke-static {p3, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 93
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void
.end method

.method public writeLongs([JII)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    shl-int/lit8 v1, p3, 0x3

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 11
    .line 12
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 13
    .line 14
    add-int/2addr p3, p2

    .line 15
    :goto_0
    if-ge p2, p3, :cond_0

    .line 16
    .line 17
    aget-wide v2, p1, p2

    .line 18
    .line 19
    long-to-int v4, v2

    .line 20
    int-to-byte v4, v4

    .line 21
    aput-byte v4, v0, v1

    .line 22
    .line 23
    add-int/lit8 v4, v1, 0x1

    .line 24
    .line 25
    const/16 v5, 0x8

    .line 26
    .line 27
    ushr-long v5, v2, v5

    .line 28
    .line 29
    long-to-int v5, v5

    .line 30
    int-to-byte v5, v5

    .line 31
    aput-byte v5, v0, v4

    .line 32
    .line 33
    add-int/lit8 v4, v1, 0x2

    .line 34
    .line 35
    const/16 v5, 0x10

    .line 36
    .line 37
    ushr-long v5, v2, v5

    .line 38
    .line 39
    long-to-int v5, v5

    .line 40
    int-to-byte v5, v5

    .line 41
    aput-byte v5, v0, v4

    .line 42
    .line 43
    add-int/lit8 v4, v1, 0x3

    .line 44
    .line 45
    const/16 v5, 0x18

    .line 46
    .line 47
    ushr-long v5, v2, v5

    .line 48
    .line 49
    long-to-int v5, v5

    .line 50
    int-to-byte v5, v5

    .line 51
    aput-byte v5, v0, v4

    .line 52
    .line 53
    add-int/lit8 v4, v1, 0x4

    .line 54
    .line 55
    const/16 v5, 0x20

    .line 56
    .line 57
    ushr-long v5, v2, v5

    .line 58
    .line 59
    long-to-int v5, v5

    .line 60
    int-to-byte v5, v5

    .line 61
    aput-byte v5, v0, v4

    .line 62
    .line 63
    add-int/lit8 v4, v1, 0x5

    .line 64
    .line 65
    const/16 v5, 0x28

    .line 66
    .line 67
    ushr-long v5, v2, v5

    .line 68
    .line 69
    long-to-int v5, v5

    .line 70
    int-to-byte v5, v5

    .line 71
    aput-byte v5, v0, v4

    .line 72
    .line 73
    add-int/lit8 v4, v1, 0x6

    .line 74
    .line 75
    const/16 v5, 0x30

    .line 76
    .line 77
    ushr-long v5, v2, v5

    .line 78
    .line 79
    long-to-int v5, v5

    .line 80
    int-to-byte v5, v5

    .line 81
    aput-byte v5, v0, v4

    .line 82
    .line 83
    add-int/lit8 v4, v1, 0x7

    .line 84
    .line 85
    const/16 v5, 0x38

    .line 86
    .line 87
    ushr-long/2addr v2, v5

    .line 88
    long-to-int v2, v2

    .line 89
    int-to-byte v2, v2

    .line 90
    aput-byte v2, v0, v4

    .line 91
    .line 92
    add-int/lit8 p2, p2, 0x1

    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x8

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 98
    .line 99
    return-void

    .line 100
    :cond_1
    add-int/2addr p3, p2

    .line 101
    :goto_1
    if-ge p2, p3, :cond_2

    .line 102
    .line 103
    aget-wide v0, p1, p2

    .line 104
    .line 105
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeLong(J)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 p2, p2, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    return-void
.end method

.method public writeLongs([JIIZ)V
    .locals 2

    .line 112
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Output;->varEncoding:Z

    if-eqz v0, :cond_1

    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_0

    .line 113
    aget-wide v0, p1, p2

    invoke-virtual {p0, v0, v1, p4}, Lcom/esotericsoftware/kryo/io/Output;->writeVarLong(JZ)I

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 114
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/io/Output;->writeLongs([JII)V

    return-void
.end method

.method public writeShort(I)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 3
    .line 4
    .line 5
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 6
    .line 7
    add-int/lit8 v1, v0, 0x2

    .line 8
    .line 9
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 10
    .line 11
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 12
    .line 13
    int-to-byte v1, p1

    .line 14
    aput-byte v1, p0, v0

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    ushr-int/lit8 p1, p1, 0x8

    .line 19
    .line 20
    int-to-byte p1, p1

    .line 21
    aput-byte p1, p0, v0

    .line 22
    .line 23
    return-void
.end method

.method public writeShorts([SII)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 2
    .line 3
    shl-int/lit8 v1, p3, 0x1

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 11
    .line 12
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 13
    .line 14
    add-int/2addr p3, p2

    .line 15
    :goto_0
    if-ge p2, p3, :cond_0

    .line 16
    .line 17
    aget-short v2, p1, p2

    .line 18
    .line 19
    int-to-byte v3, v2

    .line 20
    aput-byte v3, v0, v1

    .line 21
    .line 22
    add-int/lit8 v3, v1, 0x1

    .line 23
    .line 24
    ushr-int/lit8 v2, v2, 0x8

    .line 25
    .line 26
    int-to-byte v2, v2

    .line 27
    aput-byte v2, v0, v3

    .line 28
    .line 29
    add-int/lit8 p2, p2, 0x1

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    add-int/2addr p3, p2

    .line 38
    :goto_1
    if-ge p2, p3, :cond_2

    .line 39
    .line 40
    aget-short v0, p1, p2

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeShort(I)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 p2, p2, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    return-void
.end method

.method public writeString(Ljava/lang/String;)V
    .locals 7

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    const/16 p1, 0x81

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    const/16 v2, 0x7f

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x1

    .line 25
    if-le v1, v4, :cond_5

    .line 26
    .line 27
    const/16 v5, 0x20

    .line 28
    .line 29
    if-gt v1, v5, :cond_5

    .line 30
    .line 31
    move v5, v3

    .line 32
    :goto_0
    if-ge v5, v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-le v6, v2, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 45
    .line 46
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 47
    .line 48
    sub-int/2addr v2, v5

    .line 49
    if-ge v2, v1, :cond_4

    .line 50
    .line 51
    invoke-direct {p0, p1, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeAscii_slow(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_4
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 56
    .line 57
    invoke-virtual {p1, v3, v1, v2, v5}, Ljava/lang/String;->getBytes(II[BI)V

    .line 58
    .line 59
    .line 60
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 61
    .line 62
    add-int/2addr p1, v1

    .line 63
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 64
    .line 65
    :goto_1
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 66
    .line 67
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 68
    .line 69
    sub-int/2addr p0, v4

    .line 70
    aget-byte v1, p1, p0

    .line 71
    .line 72
    or-int/2addr v0, v1

    .line 73
    int-to-byte v0, v0

    .line 74
    aput-byte v0, p1, p0

    .line 75
    .line 76
    return-void

    .line 77
    :cond_5
    :goto_2
    add-int/lit8 v0, v1, 0x1

    .line 78
    .line 79
    invoke-virtual {p0, v4, v0, v4}, Lcom/esotericsoftware/kryo/io/Output;->writeVarIntFlag(ZIZ)I

    .line 80
    .line 81
    .line 82
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 83
    .line 84
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 85
    .line 86
    sub-int/2addr v0, v4

    .line 87
    if-lt v0, v1, :cond_8

    .line 88
    .line 89
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 90
    .line 91
    :goto_3
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-le v5, v2, :cond_6

    .line 96
    .line 97
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_6
    add-int/lit8 v6, v4, 0x1

    .line 101
    .line 102
    int-to-byte v5, v5

    .line 103
    aput-byte v5, v0, v4

    .line 104
    .line 105
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    if-ne v3, v1, :cond_7

    .line 108
    .line 109
    iput v6, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 110
    .line 111
    return-void

    .line 112
    :cond_7
    move v4, v6

    .line 113
    goto :goto_3

    .line 114
    :cond_8
    :goto_4
    if-ge v3, v1, :cond_9

    .line 115
    .line 116
    invoke-direct {p0, p1, v1, v3}, Lcom/esotericsoftware/kryo/io/Output;->writeUtf8_slow(Ljava/lang/String;II)V

    .line 117
    .line 118
    .line 119
    :cond_9
    return-void
.end method

.method public writeVarDouble(DDZ)I
    .locals 0

    .line 1
    mul-double/2addr p1, p3

    .line 2
    double-to-long p1, p1

    .line 3
    invoke-virtual {p0, p1, p2, p5}, Lcom/esotericsoftware/kryo/io/Output;->writeVarLong(JZ)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public writeVarFloat(FFZ)I
    .locals 0

    .line 1
    mul-float/2addr p1, p2

    .line 2
    float-to-int p1, p1

    .line 3
    invoke-virtual {p0, p1, p3}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public writeVarInt(IZ)I
    .locals 7

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    shl-int/lit8 p2, p1, 0x1

    .line 4
    .line 5
    shr-int/lit8 p1, p1, 0x1f

    .line 6
    .line 7
    xor-int/2addr p1, p2

    .line 8
    :cond_0
    ushr-int/lit8 p2, p1, 0x7

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-nez p2, :cond_2

    .line 12
    .line 13
    iget p2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 14
    .line 15
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 16
    .line 17
    if-ne p2, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p2, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 23
    .line 24
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 25
    .line 26
    add-int/lit8 v2, v1, 0x1

    .line 27
    .line 28
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 29
    .line 30
    int-to-byte p0, p1

    .line 31
    aput-byte p0, p2, v1

    .line 32
    .line 33
    return v0

    .line 34
    :cond_2
    ushr-int/lit8 v1, p1, 0xe

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    if-nez v1, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 40
    .line 41
    .line 42
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 43
    .line 44
    add-int/lit8 v3, v1, 0x2

    .line 45
    .line 46
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 47
    .line 48
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 49
    .line 50
    and-int/lit8 p1, p1, 0x7f

    .line 51
    .line 52
    or-int/lit16 p1, p1, 0x80

    .line 53
    .line 54
    int-to-byte p1, p1

    .line 55
    aput-byte p1, p0, v1

    .line 56
    .line 57
    add-int/2addr v1, v0

    .line 58
    int-to-byte p1, p2

    .line 59
    aput-byte p1, p0, v1

    .line 60
    .line 61
    return v2

    .line 62
    :cond_3
    ushr-int/lit8 v0, p1, 0x15

    .line 63
    .line 64
    const/4 v3, 0x3

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 68
    .line 69
    .line 70
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 71
    .line 72
    add-int/lit8 v4, v0, 0x3

    .line 73
    .line 74
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 75
    .line 76
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 77
    .line 78
    and-int/lit8 p1, p1, 0x7f

    .line 79
    .line 80
    or-int/lit16 p1, p1, 0x80

    .line 81
    .line 82
    int-to-byte p1, p1

    .line 83
    aput-byte p1, p0, v0

    .line 84
    .line 85
    add-int/lit8 p1, v0, 0x1

    .line 86
    .line 87
    or-int/lit16 p2, p2, 0x80

    .line 88
    .line 89
    int-to-byte p2, p2

    .line 90
    aput-byte p2, p0, p1

    .line 91
    .line 92
    add-int/2addr v0, v2

    .line 93
    int-to-byte p1, v1

    .line 94
    aput-byte p1, p0, v0

    .line 95
    .line 96
    return v3

    .line 97
    :cond_4
    ushr-int/lit8 v2, p1, 0x1c

    .line 98
    .line 99
    const/4 v4, 0x4

    .line 100
    if-nez v2, :cond_5

    .line 101
    .line 102
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 103
    .line 104
    .line 105
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 106
    .line 107
    add-int/lit8 v5, v2, 0x4

    .line 108
    .line 109
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 110
    .line 111
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 112
    .line 113
    and-int/lit8 p1, p1, 0x7f

    .line 114
    .line 115
    or-int/lit16 p1, p1, 0x80

    .line 116
    .line 117
    int-to-byte p1, p1

    .line 118
    aput-byte p1, p0, v2

    .line 119
    .line 120
    add-int/lit8 p1, v2, 0x1

    .line 121
    .line 122
    or-int/lit16 p2, p2, 0x80

    .line 123
    .line 124
    int-to-byte p2, p2

    .line 125
    aput-byte p2, p0, p1

    .line 126
    .line 127
    add-int/lit8 p1, v2, 0x2

    .line 128
    .line 129
    or-int/lit16 p2, v1, 0x80

    .line 130
    .line 131
    int-to-byte p2, p2

    .line 132
    aput-byte p2, p0, p1

    .line 133
    .line 134
    add-int/2addr v2, v3

    .line 135
    int-to-byte p1, v0

    .line 136
    aput-byte p1, p0, v2

    .line 137
    .line 138
    return v4

    .line 139
    :cond_5
    const/4 v3, 0x5

    .line 140
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 141
    .line 142
    .line 143
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 144
    .line 145
    add-int/lit8 v6, v5, 0x5

    .line 146
    .line 147
    iput v6, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 148
    .line 149
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 150
    .line 151
    and-int/lit8 p1, p1, 0x7f

    .line 152
    .line 153
    or-int/lit16 p1, p1, 0x80

    .line 154
    .line 155
    int-to-byte p1, p1

    .line 156
    aput-byte p1, p0, v5

    .line 157
    .line 158
    add-int/lit8 p1, v5, 0x1

    .line 159
    .line 160
    or-int/lit16 p2, p2, 0x80

    .line 161
    .line 162
    int-to-byte p2, p2

    .line 163
    aput-byte p2, p0, p1

    .line 164
    .line 165
    add-int/lit8 p1, v5, 0x2

    .line 166
    .line 167
    or-int/lit16 p2, v1, 0x80

    .line 168
    .line 169
    int-to-byte p2, p2

    .line 170
    aput-byte p2, p0, p1

    .line 171
    .line 172
    add-int/lit8 p1, v5, 0x3

    .line 173
    .line 174
    or-int/lit16 p2, v0, 0x80

    .line 175
    .line 176
    int-to-byte p2, p2

    .line 177
    aput-byte p2, p0, p1

    .line 178
    .line 179
    add-int/2addr v5, v4

    .line 180
    int-to-byte p1, v2

    .line 181
    aput-byte p1, p0, v5

    .line 182
    .line 183
    return v3
.end method

.method public writeVarIntFlag(ZIZ)I
    .locals 8

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    shl-int/lit8 p3, p2, 0x1

    .line 4
    .line 5
    shr-int/lit8 p2, p2, 0x1f

    .line 6
    .line 7
    xor-int/2addr p2, p3

    .line 8
    :cond_0
    and-int/lit8 p3, p2, 0x3f

    .line 9
    .line 10
    const/16 v0, 0x80

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    move p1, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p1, 0x0

    .line 17
    :goto_0
    or-int/2addr p1, p3

    .line 18
    ushr-int/lit8 p3, p2, 0x6

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    if-nez p3, :cond_3

    .line 22
    .line 23
    iget p2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 24
    .line 25
    iget p3, p0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 26
    .line 27
    if-ne p2, p3, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 30
    .line 31
    .line 32
    :cond_2
    iget-object p2, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 33
    .line 34
    iget p3, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 35
    .line 36
    add-int/lit8 v0, p3, 0x1

    .line 37
    .line 38
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 39
    .line 40
    int-to-byte p0, p1

    .line 41
    aput-byte p0, p2, p3

    .line 42
    .line 43
    return v1

    .line 44
    :cond_3
    ushr-int/lit8 v2, p2, 0xd

    .line 45
    .line 46
    const/4 v3, 0x2

    .line 47
    if-nez v2, :cond_4

    .line 48
    .line 49
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 50
    .line 51
    .line 52
    iget p2, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 53
    .line 54
    add-int/lit8 v0, p2, 0x2

    .line 55
    .line 56
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 57
    .line 58
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 59
    .line 60
    or-int/lit8 p1, p1, 0x40

    .line 61
    .line 62
    int-to-byte p1, p1

    .line 63
    aput-byte p1, p0, p2

    .line 64
    .line 65
    add-int/2addr p2, v1

    .line 66
    int-to-byte p1, p3

    .line 67
    aput-byte p1, p0, p2

    .line 68
    .line 69
    return v3

    .line 70
    :cond_4
    ushr-int/lit8 v1, p2, 0x14

    .line 71
    .line 72
    const/4 v4, 0x3

    .line 73
    if-nez v1, :cond_5

    .line 74
    .line 75
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 76
    .line 77
    .line 78
    iget-object p2, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 79
    .line 80
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 81
    .line 82
    add-int/lit8 v5, v1, 0x3

    .line 83
    .line 84
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 85
    .line 86
    or-int/lit8 p0, p1, 0x40

    .line 87
    .line 88
    int-to-byte p0, p0

    .line 89
    aput-byte p0, p2, v1

    .line 90
    .line 91
    add-int/lit8 p0, v1, 0x1

    .line 92
    .line 93
    or-int/lit16 p1, p3, 0x80

    .line 94
    .line 95
    int-to-byte p1, p1

    .line 96
    aput-byte p1, p2, p0

    .line 97
    .line 98
    add-int/2addr v1, v3

    .line 99
    int-to-byte p0, v2

    .line 100
    aput-byte p0, p2, v1

    .line 101
    .line 102
    return v4

    .line 103
    :cond_5
    ushr-int/lit8 p2, p2, 0x1b

    .line 104
    .line 105
    const/4 v3, 0x4

    .line 106
    if-nez p2, :cond_6

    .line 107
    .line 108
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 109
    .line 110
    .line 111
    iget-object p2, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 112
    .line 113
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 114
    .line 115
    add-int/lit8 v6, v5, 0x4

    .line 116
    .line 117
    iput v6, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 118
    .line 119
    or-int/lit8 p0, p1, 0x40

    .line 120
    .line 121
    int-to-byte p0, p0

    .line 122
    aput-byte p0, p2, v5

    .line 123
    .line 124
    add-int/lit8 p0, v5, 0x1

    .line 125
    .line 126
    or-int/lit16 p1, p3, 0x80

    .line 127
    .line 128
    int-to-byte p1, p1

    .line 129
    aput-byte p1, p2, p0

    .line 130
    .line 131
    add-int/lit8 p0, v5, 0x2

    .line 132
    .line 133
    or-int/lit16 p1, v2, 0x80

    .line 134
    .line 135
    int-to-byte p1, p1

    .line 136
    aput-byte p1, p2, p0

    .line 137
    .line 138
    add-int/2addr v5, v4

    .line 139
    int-to-byte p0, v1

    .line 140
    aput-byte p0, p2, v5

    .line 141
    .line 142
    return v3

    .line 143
    :cond_6
    const/4 v4, 0x5

    .line 144
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 145
    .line 146
    .line 147
    iget-object v5, p0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 148
    .line 149
    iget v6, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 150
    .line 151
    add-int/lit8 v7, v6, 0x5

    .line 152
    .line 153
    iput v7, p0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 154
    .line 155
    or-int/lit8 p0, p1, 0x40

    .line 156
    .line 157
    int-to-byte p0, p0

    .line 158
    aput-byte p0, v5, v6

    .line 159
    .line 160
    add-int/lit8 p0, v6, 0x1

    .line 161
    .line 162
    or-int/lit16 p1, p3, 0x80

    .line 163
    .line 164
    int-to-byte p1, p1

    .line 165
    aput-byte p1, v5, p0

    .line 166
    .line 167
    add-int/lit8 p0, v6, 0x2

    .line 168
    .line 169
    or-int/lit16 p1, v2, 0x80

    .line 170
    .line 171
    int-to-byte p1, p1

    .line 172
    aput-byte p1, v5, p0

    .line 173
    .line 174
    add-int/lit8 p0, v6, 0x3

    .line 175
    .line 176
    or-int/lit16 p1, v1, 0x80

    .line 177
    .line 178
    int-to-byte p1, p1

    .line 179
    aput-byte p1, v5, p0

    .line 180
    .line 181
    add-int/2addr v6, v3

    .line 182
    int-to-byte p0, p2

    .line 183
    aput-byte p0, v5, v6

    .line 184
    .line 185
    return v4
.end method

.method public writeVarLong(JZ)I
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    shl-long v2, p1, v1

    .line 7
    .line 8
    const/16 v4, 0x3f

    .line 9
    .line 10
    shr-long v4, p1, v4

    .line 11
    .line 12
    xor-long/2addr v2, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide/from16 v2, p1

    .line 15
    .line 16
    :goto_0
    const/4 v4, 0x7

    .line 17
    ushr-long v5, v2, v4

    .line 18
    .line 19
    const-wide/16 v7, 0x0

    .line 20
    .line 21
    cmp-long v9, v5, v7

    .line 22
    .line 23
    if-nez v9, :cond_2

    .line 24
    .line 25
    iget v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 26
    .line 27
    iget v5, v0, Lcom/esotericsoftware/kryo/io/Output;->capacity:I

    .line 28
    .line 29
    if-ne v4, v5, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v4, v0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 35
    .line 36
    iget v5, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 37
    .line 38
    add-int/lit8 v6, v5, 0x1

    .line 39
    .line 40
    iput v6, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 41
    .line 42
    long-to-int v0, v2

    .line 43
    int-to-byte v0, v0

    .line 44
    aput-byte v0, v4, v5

    .line 45
    .line 46
    return v1

    .line 47
    :cond_2
    const/16 v9, 0xe

    .line 48
    .line 49
    ushr-long v9, v2, v9

    .line 50
    .line 51
    cmp-long v11, v9, v7

    .line 52
    .line 53
    const-wide/16 v12, 0x7f

    .line 54
    .line 55
    const/4 v14, 0x2

    .line 56
    const-wide/16 v15, 0x80

    .line 57
    .line 58
    if-nez v11, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0, v14}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 61
    .line 62
    .line 63
    iget v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 64
    .line 65
    add-int/lit8 v7, v4, 0x2

    .line 66
    .line 67
    iput v7, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 68
    .line 69
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 70
    .line 71
    and-long/2addr v2, v12

    .line 72
    or-long/2addr v2, v15

    .line 73
    long-to-int v2, v2

    .line 74
    int-to-byte v2, v2

    .line 75
    aput-byte v2, v0, v4

    .line 76
    .line 77
    add-int/2addr v4, v1

    .line 78
    long-to-int v1, v5

    .line 79
    int-to-byte v1, v1

    .line 80
    aput-byte v1, v0, v4

    .line 81
    .line 82
    return v14

    .line 83
    :cond_3
    const/16 v1, 0x15

    .line 84
    .line 85
    move-wide/from16 p1, v7

    .line 86
    .line 87
    ushr-long v7, v2, v1

    .line 88
    .line 89
    cmp-long v1, v7, p1

    .line 90
    .line 91
    const/4 v11, 0x3

    .line 92
    if-nez v1, :cond_4

    .line 93
    .line 94
    invoke-virtual {v0, v11}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 95
    .line 96
    .line 97
    iget v1, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 98
    .line 99
    add-int/lit8 v4, v1, 0x3

    .line 100
    .line 101
    iput v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 102
    .line 103
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 104
    .line 105
    and-long/2addr v2, v12

    .line 106
    or-long/2addr v2, v15

    .line 107
    long-to-int v2, v2

    .line 108
    int-to-byte v2, v2

    .line 109
    aput-byte v2, v0, v1

    .line 110
    .line 111
    add-int/lit8 v2, v1, 0x1

    .line 112
    .line 113
    or-long v3, v5, v15

    .line 114
    .line 115
    long-to-int v3, v3

    .line 116
    int-to-byte v3, v3

    .line 117
    aput-byte v3, v0, v2

    .line 118
    .line 119
    add-int/2addr v1, v14

    .line 120
    long-to-int v2, v9

    .line 121
    int-to-byte v2, v2

    .line 122
    aput-byte v2, v0, v1

    .line 123
    .line 124
    return v11

    .line 125
    :cond_4
    const/16 v1, 0x1c

    .line 126
    .line 127
    move/from16 p3, v11

    .line 128
    .line 129
    move-wide/from16 v17, v12

    .line 130
    .line 131
    ushr-long v11, v2, v1

    .line 132
    .line 133
    cmp-long v1, v11, p1

    .line 134
    .line 135
    const/4 v13, 0x4

    .line 136
    if-nez v1, :cond_5

    .line 137
    .line 138
    invoke-virtual {v0, v13}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 139
    .line 140
    .line 141
    iget v1, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 142
    .line 143
    add-int/lit8 v4, v1, 0x4

    .line 144
    .line 145
    iput v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 146
    .line 147
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 148
    .line 149
    and-long v2, v2, v17

    .line 150
    .line 151
    or-long/2addr v2, v15

    .line 152
    long-to-int v2, v2

    .line 153
    int-to-byte v2, v2

    .line 154
    aput-byte v2, v0, v1

    .line 155
    .line 156
    add-int/lit8 v2, v1, 0x1

    .line 157
    .line 158
    or-long v3, v5, v15

    .line 159
    .line 160
    long-to-int v3, v3

    .line 161
    int-to-byte v3, v3

    .line 162
    aput-byte v3, v0, v2

    .line 163
    .line 164
    add-int/lit8 v2, v1, 0x2

    .line 165
    .line 166
    or-long v3, v9, v15

    .line 167
    .line 168
    long-to-int v3, v3

    .line 169
    int-to-byte v3, v3

    .line 170
    aput-byte v3, v0, v2

    .line 171
    .line 172
    add-int/lit8 v1, v1, 0x3

    .line 173
    .line 174
    long-to-int v2, v7

    .line 175
    int-to-byte v2, v2

    .line 176
    aput-byte v2, v0, v1

    .line 177
    .line 178
    return v13

    .line 179
    :cond_5
    const/16 v1, 0x23

    .line 180
    .line 181
    move/from16 p3, v13

    .line 182
    .line 183
    ushr-long v13, v2, v1

    .line 184
    .line 185
    cmp-long v1, v13, p1

    .line 186
    .line 187
    move-wide/from16 v19, v15

    .line 188
    .line 189
    const/4 v15, 0x5

    .line 190
    if-nez v1, :cond_6

    .line 191
    .line 192
    invoke-virtual {v0, v15}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 193
    .line 194
    .line 195
    iget v1, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 196
    .line 197
    add-int/lit8 v4, v1, 0x5

    .line 198
    .line 199
    iput v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 200
    .line 201
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 202
    .line 203
    and-long v2, v2, v17

    .line 204
    .line 205
    or-long v2, v2, v19

    .line 206
    .line 207
    long-to-int v2, v2

    .line 208
    int-to-byte v2, v2

    .line 209
    aput-byte v2, v0, v1

    .line 210
    .line 211
    add-int/lit8 v2, v1, 0x1

    .line 212
    .line 213
    or-long v3, v5, v19

    .line 214
    .line 215
    long-to-int v3, v3

    .line 216
    int-to-byte v3, v3

    .line 217
    aput-byte v3, v0, v2

    .line 218
    .line 219
    add-int/lit8 v2, v1, 0x2

    .line 220
    .line 221
    or-long v3, v9, v19

    .line 222
    .line 223
    long-to-int v3, v3

    .line 224
    int-to-byte v3, v3

    .line 225
    aput-byte v3, v0, v2

    .line 226
    .line 227
    add-int/lit8 v2, v1, 0x3

    .line 228
    .line 229
    or-long v3, v7, v19

    .line 230
    .line 231
    long-to-int v3, v3

    .line 232
    int-to-byte v3, v3

    .line 233
    aput-byte v3, v0, v2

    .line 234
    .line 235
    add-int/lit8 v1, v1, 0x4

    .line 236
    .line 237
    long-to-int v2, v11

    .line 238
    int-to-byte v2, v2

    .line 239
    aput-byte v2, v0, v1

    .line 240
    .line 241
    return v15

    .line 242
    :cond_6
    const/16 v1, 0x2a

    .line 243
    .line 244
    move-wide/from16 v21, v5

    .line 245
    .line 246
    ushr-long v4, v2, v1

    .line 247
    .line 248
    cmp-long v1, v4, p1

    .line 249
    .line 250
    const/4 v6, 0x6

    .line 251
    if-nez v1, :cond_7

    .line 252
    .line 253
    invoke-virtual {v0, v6}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 254
    .line 255
    .line 256
    iget v1, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 257
    .line 258
    add-int/lit8 v4, v1, 0x6

    .line 259
    .line 260
    iput v4, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 261
    .line 262
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 263
    .line 264
    and-long v2, v2, v17

    .line 265
    .line 266
    or-long v2, v2, v19

    .line 267
    .line 268
    long-to-int v2, v2

    .line 269
    int-to-byte v2, v2

    .line 270
    aput-byte v2, v0, v1

    .line 271
    .line 272
    add-int/lit8 v2, v1, 0x1

    .line 273
    .line 274
    or-long v3, v21, v19

    .line 275
    .line 276
    long-to-int v3, v3

    .line 277
    int-to-byte v3, v3

    .line 278
    aput-byte v3, v0, v2

    .line 279
    .line 280
    add-int/lit8 v2, v1, 0x2

    .line 281
    .line 282
    or-long v3, v9, v19

    .line 283
    .line 284
    long-to-int v3, v3

    .line 285
    int-to-byte v3, v3

    .line 286
    aput-byte v3, v0, v2

    .line 287
    .line 288
    add-int/lit8 v2, v1, 0x3

    .line 289
    .line 290
    or-long v3, v7, v19

    .line 291
    .line 292
    long-to-int v3, v3

    .line 293
    int-to-byte v3, v3

    .line 294
    aput-byte v3, v0, v2

    .line 295
    .line 296
    add-int/lit8 v2, v1, 0x4

    .line 297
    .line 298
    or-long v3, v11, v19

    .line 299
    .line 300
    long-to-int v3, v3

    .line 301
    int-to-byte v3, v3

    .line 302
    aput-byte v3, v0, v2

    .line 303
    .line 304
    add-int/2addr v1, v15

    .line 305
    long-to-int v2, v13

    .line 306
    int-to-byte v2, v2

    .line 307
    aput-byte v2, v0, v1

    .line 308
    .line 309
    return v6

    .line 310
    :cond_7
    const/16 v1, 0x31

    .line 311
    .line 312
    move v15, v6

    .line 313
    move-wide/from16 v23, v7

    .line 314
    .line 315
    ushr-long v6, v2, v1

    .line 316
    .line 317
    cmp-long v1, v6, p1

    .line 318
    .line 319
    if-nez v1, :cond_8

    .line 320
    .line 321
    const/4 v1, 0x7

    .line 322
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 323
    .line 324
    .line 325
    iget v1, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 326
    .line 327
    add-int/lit8 v6, v1, 0x7

    .line 328
    .line 329
    iput v6, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 330
    .line 331
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 332
    .line 333
    and-long v2, v2, v17

    .line 334
    .line 335
    or-long v2, v2, v19

    .line 336
    .line 337
    long-to-int v2, v2

    .line 338
    int-to-byte v2, v2

    .line 339
    aput-byte v2, v0, v1

    .line 340
    .line 341
    add-int/lit8 v2, v1, 0x1

    .line 342
    .line 343
    or-long v6, v21, v19

    .line 344
    .line 345
    long-to-int v3, v6

    .line 346
    int-to-byte v3, v3

    .line 347
    aput-byte v3, v0, v2

    .line 348
    .line 349
    add-int/lit8 v2, v1, 0x2

    .line 350
    .line 351
    or-long v6, v9, v19

    .line 352
    .line 353
    long-to-int v3, v6

    .line 354
    int-to-byte v3, v3

    .line 355
    aput-byte v3, v0, v2

    .line 356
    .line 357
    add-int/lit8 v2, v1, 0x3

    .line 358
    .line 359
    or-long v6, v23, v19

    .line 360
    .line 361
    long-to-int v3, v6

    .line 362
    int-to-byte v3, v3

    .line 363
    aput-byte v3, v0, v2

    .line 364
    .line 365
    add-int/lit8 v2, v1, 0x4

    .line 366
    .line 367
    or-long v6, v11, v19

    .line 368
    .line 369
    long-to-int v3, v6

    .line 370
    int-to-byte v3, v3

    .line 371
    aput-byte v3, v0, v2

    .line 372
    .line 373
    add-int/lit8 v2, v1, 0x5

    .line 374
    .line 375
    or-long v6, v13, v19

    .line 376
    .line 377
    long-to-int v3, v6

    .line 378
    int-to-byte v3, v3

    .line 379
    aput-byte v3, v0, v2

    .line 380
    .line 381
    add-int/2addr v1, v15

    .line 382
    long-to-int v2, v4

    .line 383
    int-to-byte v2, v2

    .line 384
    aput-byte v2, v0, v1

    .line 385
    .line 386
    const/4 v1, 0x7

    .line 387
    return v1

    .line 388
    :cond_8
    const/16 v1, 0x38

    .line 389
    .line 390
    move-wide v15, v2

    .line 391
    ushr-long v1, v15, v1

    .line 392
    .line 393
    cmp-long v3, v1, p1

    .line 394
    .line 395
    const/16 v8, 0x8

    .line 396
    .line 397
    if-nez v3, :cond_9

    .line 398
    .line 399
    invoke-virtual {v0, v8}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 400
    .line 401
    .line 402
    iget v1, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 403
    .line 404
    add-int/lit8 v2, v1, 0x8

    .line 405
    .line 406
    iput v2, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 407
    .line 408
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 409
    .line 410
    and-long v2, v15, v17

    .line 411
    .line 412
    or-long v2, v2, v19

    .line 413
    .line 414
    long-to-int v2, v2

    .line 415
    int-to-byte v2, v2

    .line 416
    aput-byte v2, v0, v1

    .line 417
    .line 418
    add-int/lit8 v2, v1, 0x1

    .line 419
    .line 420
    move v3, v8

    .line 421
    move-wide/from16 p1, v9

    .line 422
    .line 423
    or-long v8, v21, v19

    .line 424
    .line 425
    long-to-int v8, v8

    .line 426
    int-to-byte v8, v8

    .line 427
    aput-byte v8, v0, v2

    .line 428
    .line 429
    add-int/lit8 v2, v1, 0x2

    .line 430
    .line 431
    or-long v8, p1, v19

    .line 432
    .line 433
    long-to-int v8, v8

    .line 434
    int-to-byte v8, v8

    .line 435
    aput-byte v8, v0, v2

    .line 436
    .line 437
    add-int/lit8 v2, v1, 0x3

    .line 438
    .line 439
    or-long v8, v23, v19

    .line 440
    .line 441
    long-to-int v8, v8

    .line 442
    int-to-byte v8, v8

    .line 443
    aput-byte v8, v0, v2

    .line 444
    .line 445
    add-int/lit8 v2, v1, 0x4

    .line 446
    .line 447
    or-long v8, v11, v19

    .line 448
    .line 449
    long-to-int v8, v8

    .line 450
    int-to-byte v8, v8

    .line 451
    aput-byte v8, v0, v2

    .line 452
    .line 453
    add-int/lit8 v2, v1, 0x5

    .line 454
    .line 455
    or-long v8, v13, v19

    .line 456
    .line 457
    long-to-int v8, v8

    .line 458
    int-to-byte v8, v8

    .line 459
    aput-byte v8, v0, v2

    .line 460
    .line 461
    add-int/lit8 v2, v1, 0x6

    .line 462
    .line 463
    or-long v4, v4, v19

    .line 464
    .line 465
    long-to-int v4, v4

    .line 466
    int-to-byte v4, v4

    .line 467
    aput-byte v4, v0, v2

    .line 468
    .line 469
    const/4 v2, 0x7

    .line 470
    add-int/2addr v1, v2

    .line 471
    long-to-int v2, v6

    .line 472
    int-to-byte v2, v2

    .line 473
    aput-byte v2, v0, v1

    .line 474
    .line 475
    return v3

    .line 476
    :cond_9
    move v3, v8

    .line 477
    move-wide/from16 p1, v9

    .line 478
    .line 479
    const/16 v8, 0x9

    .line 480
    .line 481
    invoke-virtual {v0, v8}, Lcom/esotericsoftware/kryo/io/Output;->require(I)Z

    .line 482
    .line 483
    .line 484
    iget v9, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 485
    .line 486
    add-int/lit8 v10, v9, 0x9

    .line 487
    .line 488
    iput v10, v0, Lcom/esotericsoftware/kryo/io/Output;->position:I

    .line 489
    .line 490
    iget-object v0, v0, Lcom/esotericsoftware/kryo/io/Output;->buffer:[B

    .line 491
    .line 492
    and-long v15, v15, v17

    .line 493
    .line 494
    move/from16 p3, v3

    .line 495
    .line 496
    move-wide/from16 v17, v4

    .line 497
    .line 498
    or-long v3, v15, v19

    .line 499
    .line 500
    long-to-int v3, v3

    .line 501
    int-to-byte v3, v3

    .line 502
    aput-byte v3, v0, v9

    .line 503
    .line 504
    add-int/lit8 v3, v9, 0x1

    .line 505
    .line 506
    or-long v4, v21, v19

    .line 507
    .line 508
    long-to-int v4, v4

    .line 509
    int-to-byte v4, v4

    .line 510
    aput-byte v4, v0, v3

    .line 511
    .line 512
    add-int/lit8 v3, v9, 0x2

    .line 513
    .line 514
    or-long v4, p1, v19

    .line 515
    .line 516
    long-to-int v4, v4

    .line 517
    int-to-byte v4, v4

    .line 518
    aput-byte v4, v0, v3

    .line 519
    .line 520
    add-int/lit8 v3, v9, 0x3

    .line 521
    .line 522
    or-long v4, v23, v19

    .line 523
    .line 524
    long-to-int v4, v4

    .line 525
    int-to-byte v4, v4

    .line 526
    aput-byte v4, v0, v3

    .line 527
    .line 528
    add-int/lit8 v3, v9, 0x4

    .line 529
    .line 530
    or-long v4, v11, v19

    .line 531
    .line 532
    long-to-int v4, v4

    .line 533
    int-to-byte v4, v4

    .line 534
    aput-byte v4, v0, v3

    .line 535
    .line 536
    add-int/lit8 v3, v9, 0x5

    .line 537
    .line 538
    or-long v4, v13, v19

    .line 539
    .line 540
    long-to-int v4, v4

    .line 541
    int-to-byte v4, v4

    .line 542
    aput-byte v4, v0, v3

    .line 543
    .line 544
    add-int/lit8 v3, v9, 0x6

    .line 545
    .line 546
    or-long v4, v17, v19

    .line 547
    .line 548
    long-to-int v4, v4

    .line 549
    int-to-byte v4, v4

    .line 550
    aput-byte v4, v0, v3

    .line 551
    .line 552
    add-int/lit8 v3, v9, 0x7

    .line 553
    .line 554
    or-long v4, v6, v19

    .line 555
    .line 556
    long-to-int v4, v4

    .line 557
    int-to-byte v4, v4

    .line 558
    aput-byte v4, v0, v3

    .line 559
    .line 560
    add-int/lit8 v9, v9, 0x8

    .line 561
    .line 562
    long-to-int v1, v1

    .line 563
    int-to-byte v1, v1

    .line 564
    aput-byte v1, v0, v9

    .line 565
    .line 566
    return v8
.end method
