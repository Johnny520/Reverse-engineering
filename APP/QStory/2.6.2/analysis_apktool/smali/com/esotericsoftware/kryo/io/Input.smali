.class public Lcom/esotericsoftware/kryo/io/Input;
.super Ljava/io/InputStream;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/esotericsoftware/kryo/util/Pool$Poolable;


# instance fields
.field protected buffer:[B

.field protected capacity:I

.field protected chars:[C

.field protected inputStream:Ljava/io/InputStream;

.field protected limit:I

.field protected position:I

.field protected total:J

.field protected varEncoding:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/16 v0, 0x20

    .line 21
    new-array v0, v0, [C

    iput-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Input;->varEncoding:Z

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x20

    .line 5
    .line 6
    new-array v0, v0, [C

    .line 7
    .line 8
    iput-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Input;->varEncoding:Z

    .line 12
    .line 13
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 14
    .line 15
    new-array p1, p1, [B

    .line 16
    .line 17
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    const/16 v0, 0x1000

    .line 31
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;-><init>(I)V

    if-eqz p1, :cond_0

    .line 32
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Input;->inputStream:Ljava/io/InputStream;

    return-void

    .line 33
    :cond_0
    const-string p0, "inputStream cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .line 34
    invoke-direct {p0, p2}, Lcom/esotericsoftware/kryo/io/Input;-><init>(I)V

    if-eqz p1, :cond_0

    .line 35
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Input;->inputStream:Ljava/io/InputStream;

    return-void

    .line 36
    :cond_0
    const-string p0, "inputStream cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/16 v0, 0x20

    .line 24
    new-array v0, v0, [C

    iput-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Input;->varEncoding:Z

    const/4 v0, 0x0

    .line 26
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/esotericsoftware/kryo/io/Input;->setBuffer([BII)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/16 v0, 0x20

    .line 28
    new-array v0, v0, [C

    iput-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Input;->varEncoding:Z

    .line 30
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/io/Input;->setBuffer([BII)V

    return-void
.end method

.method private readAsciiString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 4
    .line 5
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 6
    .line 7
    array-length v3, v0

    .line 8
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 9
    .line 10
    sub-int/2addr v4, v2

    .line 11
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x0

    .line 16
    move v5, v4

    .line 17
    :goto_0
    if-ge v5, v3, :cond_1

    .line 18
    .line 19
    aget-byte v6, v1, v2

    .line 20
    .line 21
    and-int/lit16 v7, v6, 0x80

    .line 22
    .line 23
    const/16 v8, 0x80

    .line 24
    .line 25
    if-ne v7, v8, :cond_0

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 30
    .line 31
    and-int/lit8 p0, v6, 0x7f

    .line 32
    .line 33
    int-to-char p0, p0

    .line 34
    aput-char p0, v0, v5

    .line 35
    .line 36
    new-instance p0, Ljava/lang/String;

    .line 37
    .line 38
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    invoke-direct {p0, v0, v4, v5}, Ljava/lang/String;-><init>([CII)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_0
    int-to-char v6, v6

    .line 45
    aput-char v6, v0, v5

    .line 46
    .line 47
    add-int/lit8 v5, v5, 0x1

    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 53
    .line 54
    invoke-direct {p0, v5}, Lcom/esotericsoftware/kryo/io/Input;->readAscii_slow(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method private readAscii_slow(I)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 4
    .line 5
    :goto_0
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 6
    .line 7
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 16
    .line 17
    add-int/lit8 v3, v2, 0x1

    .line 18
    .line 19
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 20
    .line 21
    aget-byte v2, v1, v2

    .line 22
    .line 23
    array-length v3, v0

    .line 24
    const/4 v5, 0x0

    .line 25
    if-ne p1, v3, :cond_1

    .line 26
    .line 27
    mul-int/lit8 v3, p1, 0x2

    .line 28
    .line 29
    new-array v3, v3, [C

    .line 30
    .line 31
    invoke-static {v0, v5, v3, v5, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    iput-object v3, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 35
    .line 36
    move-object v0, v3

    .line 37
    :cond_1
    and-int/lit16 v3, v2, 0x80

    .line 38
    .line 39
    const/16 v6, 0x80

    .line 40
    .line 41
    if-ne v3, v6, :cond_2

    .line 42
    .line 43
    and-int/lit8 p0, v2, 0x7f

    .line 44
    .line 45
    int-to-char p0, p0

    .line 46
    aput-char p0, v0, p1

    .line 47
    .line 48
    new-instance p0, Ljava/lang/String;

    .line 49
    .line 50
    add-int/2addr p1, v4

    .line 51
    invoke-direct {p0, v0, v5, p1}, Ljava/lang/String;-><init>([CII)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    add-int/lit8 v3, p1, 0x1

    .line 56
    .line 57
    int-to-char v2, v2

    .line 58
    aput-char v2, v0, p1

    .line 59
    .line 60
    move p1, v3

    .line 61
    goto :goto_0
.end method

.method private readUtf8Chars(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    if-ge v0, p1, :cond_0

    .line 5
    .line 6
    new-array v0, p1, [C

    .line 7
    .line 8
    iput-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 11
    .line 12
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    :goto_0
    if-ge v4, v2, :cond_2

    .line 27
    .line 28
    add-int/lit8 v5, v3, 0x1

    .line 29
    .line 30
    aget-byte v6, v0, v3

    .line 31
    .line 32
    if-gez v6, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    add-int/lit8 v3, v4, 0x1

    .line 36
    .line 37
    int-to-char v6, v6

    .line 38
    aput-char v6, v1, v4

    .line 39
    .line 40
    move v4, v3

    .line 41
    move v3, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    :goto_1
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 44
    .line 45
    if-ge v4, p1, :cond_3

    .line 46
    .line 47
    invoke-direct {p0, p1, v4}, Lcom/esotericsoftware/kryo/io/Input;->readUtf8Chars_slow(II)V

    .line 48
    .line 49
    .line 50
    :cond_3
    return-void
.end method

.method private readUtf8Chars_slow(II)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 4
    .line 5
    :goto_0
    if-ge p2, p1, :cond_2

    .line 6
    .line 7
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 8
    .line 9
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 15
    .line 16
    .line 17
    :cond_0
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    add-int/lit8 v3, v2, 0x1

    .line 20
    .line 21
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 22
    .line 23
    aget-byte v2, v1, v2

    .line 24
    .line 25
    and-int/lit16 v5, v2, 0xff

    .line 26
    .line 27
    shr-int/lit8 v6, v5, 0x4

    .line 28
    .line 29
    packed-switch v6, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    :pswitch_0
    goto :goto_1

    .line 33
    :pswitch_1
    const/4 v3, 0x2

    .line 34
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 35
    .line 36
    .line 37
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 38
    .line 39
    add-int/lit8 v5, v3, 0x2

    .line 40
    .line 41
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 42
    .line 43
    and-int/lit8 v2, v2, 0xf

    .line 44
    .line 45
    shl-int/lit8 v2, v2, 0xc

    .line 46
    .line 47
    aget-byte v5, v1, v3

    .line 48
    .line 49
    and-int/lit8 v5, v5, 0x3f

    .line 50
    .line 51
    shl-int/lit8 v5, v5, 0x6

    .line 52
    .line 53
    or-int/2addr v2, v5

    .line 54
    add-int/2addr v3, v4

    .line 55
    aget-byte v3, v1, v3

    .line 56
    .line 57
    and-int/lit8 v3, v3, 0x3f

    .line 58
    .line 59
    or-int/2addr v2, v3

    .line 60
    int-to-char v2, v2

    .line 61
    aput-char v2, v0, p2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :pswitch_2
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 65
    .line 66
    if-ne v3, v5, :cond_1

    .line 67
    .line 68
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 69
    .line 70
    .line 71
    :cond_1
    and-int/lit8 v2, v2, 0x1f

    .line 72
    .line 73
    shl-int/lit8 v2, v2, 0x6

    .line 74
    .line 75
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 76
    .line 77
    add-int/lit8 v4, v3, 0x1

    .line 78
    .line 79
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 80
    .line 81
    aget-byte v3, v1, v3

    .line 82
    .line 83
    and-int/lit8 v3, v3, 0x3f

    .line 84
    .line 85
    or-int/2addr v2, v3

    .line 86
    int-to-char v2, v2

    .line 87
    aput-char v2, v0, p2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :pswitch_3
    int-to-char v2, v5

    .line 91
    aput-char v2, v0, p2

    .line 92
    .line 93
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private readVarIntFlag_slow(Z)I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 8
    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    and-int/lit8 v1, v0, 0x3f

    .line 12
    .line 13
    and-int/lit8 v0, v0, 0x40

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 19
    .line 20
    if-ne v2, v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 26
    .line 27
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 28
    .line 29
    add-int/lit8 v4, v2, 0x1

    .line 30
    .line 31
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 32
    .line 33
    aget-byte v2, v0, v2

    .line 34
    .line 35
    and-int/lit8 v5, v2, 0x7f

    .line 36
    .line 37
    shl-int/lit8 v5, v5, 0x6

    .line 38
    .line 39
    or-int/2addr v1, v5

    .line 40
    and-int/lit16 v2, v2, 0x80

    .line 41
    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 45
    .line 46
    if-ne v4, v2, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 49
    .line 50
    .line 51
    :cond_1
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 52
    .line 53
    add-int/lit8 v4, v2, 0x1

    .line 54
    .line 55
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 56
    .line 57
    aget-byte v2, v0, v2

    .line 58
    .line 59
    and-int/lit8 v5, v2, 0x7f

    .line 60
    .line 61
    shl-int/lit8 v5, v5, 0xd

    .line 62
    .line 63
    or-int/2addr v1, v5

    .line 64
    and-int/lit16 v2, v2, 0x80

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 69
    .line 70
    if-ne v4, v2, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 73
    .line 74
    .line 75
    :cond_2
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 76
    .line 77
    add-int/lit8 v4, v2, 0x1

    .line 78
    .line 79
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 80
    .line 81
    aget-byte v2, v0, v2

    .line 82
    .line 83
    and-int/lit8 v5, v2, 0x7f

    .line 84
    .line 85
    shl-int/lit8 v5, v5, 0x14

    .line 86
    .line 87
    or-int/2addr v1, v5

    .line 88
    and-int/lit16 v2, v2, 0x80

    .line 89
    .line 90
    if-eqz v2, :cond_4

    .line 91
    .line 92
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 93
    .line 94
    if-ne v4, v2, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 97
    .line 98
    .line 99
    :cond_3
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 100
    .line 101
    add-int/lit8 v4, v2, 0x1

    .line 102
    .line 103
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 104
    .line 105
    aget-byte p0, v0, v2

    .line 106
    .line 107
    and-int/lit8 p0, p0, 0x7f

    .line 108
    .line 109
    shl-int/lit8 p0, p0, 0x1b

    .line 110
    .line 111
    or-int/2addr v1, p0

    .line 112
    :cond_4
    if-eqz p1, :cond_5

    .line 113
    .line 114
    return v1

    .line 115
    :cond_5
    ushr-int/lit8 p0, v1, 0x1

    .line 116
    .line 117
    and-int/lit8 p1, v1, 0x1

    .line 118
    .line 119
    neg-int p1, p1

    .line 120
    xor-int/2addr p0, p1

    .line 121
    return p0
.end method

.method private readVarInt_slow(Z)I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 8
    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    and-int/lit8 v1, v0, 0x7f

    .line 12
    .line 13
    and-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 19
    .line 20
    if-ne v2, v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 26
    .line 27
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 28
    .line 29
    add-int/lit8 v4, v2, 0x1

    .line 30
    .line 31
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 32
    .line 33
    aget-byte v2, v0, v2

    .line 34
    .line 35
    and-int/lit8 v5, v2, 0x7f

    .line 36
    .line 37
    shl-int/lit8 v5, v5, 0x7

    .line 38
    .line 39
    or-int/2addr v1, v5

    .line 40
    and-int/lit16 v2, v2, 0x80

    .line 41
    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 45
    .line 46
    if-ne v4, v2, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 49
    .line 50
    .line 51
    :cond_1
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 52
    .line 53
    add-int/lit8 v4, v2, 0x1

    .line 54
    .line 55
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 56
    .line 57
    aget-byte v2, v0, v2

    .line 58
    .line 59
    and-int/lit8 v5, v2, 0x7f

    .line 60
    .line 61
    shl-int/lit8 v5, v5, 0xe

    .line 62
    .line 63
    or-int/2addr v1, v5

    .line 64
    and-int/lit16 v2, v2, 0x80

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 69
    .line 70
    if-ne v4, v2, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 73
    .line 74
    .line 75
    :cond_2
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 76
    .line 77
    add-int/lit8 v4, v2, 0x1

    .line 78
    .line 79
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 80
    .line 81
    aget-byte v2, v0, v2

    .line 82
    .line 83
    and-int/lit8 v5, v2, 0x7f

    .line 84
    .line 85
    shl-int/lit8 v5, v5, 0x15

    .line 86
    .line 87
    or-int/2addr v1, v5

    .line 88
    and-int/lit16 v2, v2, 0x80

    .line 89
    .line 90
    if-eqz v2, :cond_4

    .line 91
    .line 92
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 93
    .line 94
    if-ne v4, v2, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 97
    .line 98
    .line 99
    :cond_3
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 100
    .line 101
    add-int/lit8 v4, v2, 0x1

    .line 102
    .line 103
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 104
    .line 105
    aget-byte p0, v0, v2

    .line 106
    .line 107
    and-int/lit8 p0, p0, 0x7f

    .line 108
    .line 109
    shl-int/lit8 p0, p0, 0x1c

    .line 110
    .line 111
    or-int/2addr v1, p0

    .line 112
    :cond_4
    if-eqz p1, :cond_5

    .line 113
    .line 114
    return v1

    .line 115
    :cond_5
    ushr-int/lit8 p0, v1, 0x1

    .line 116
    .line 117
    and-int/lit8 p1, v1, 0x1

    .line 118
    .line 119
    neg-int p1, p1

    .line 120
    xor-int/2addr p0, p1

    .line 121
    return p0
.end method

.method private readVarLong_slow(Z)J
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 8
    .line 9
    aget-byte v0, v0, v1

    .line 10
    .line 11
    and-int/lit8 v1, v0, 0x7f

    .line 12
    .line 13
    int-to-long v3, v1

    .line 14
    and-int/lit16 v0, v0, 0x80

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-eqz v0, :cond_8

    .line 18
    .line 19
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 20
    .line 21
    if-ne v2, v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 27
    .line 28
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 29
    .line 30
    add-int/lit8 v5, v2, 0x1

    .line 31
    .line 32
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 33
    .line 34
    aget-byte v2, v0, v2

    .line 35
    .line 36
    and-int/lit8 v6, v2, 0x7f

    .line 37
    .line 38
    shl-int/lit8 v6, v6, 0x7

    .line 39
    .line 40
    int-to-long v6, v6

    .line 41
    or-long/2addr v3, v6

    .line 42
    and-int/lit16 v2, v2, 0x80

    .line 43
    .line 44
    if-eqz v2, :cond_8

    .line 45
    .line 46
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 47
    .line 48
    if-ne v5, v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 51
    .line 52
    .line 53
    :cond_1
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 54
    .line 55
    add-int/lit8 v5, v2, 0x1

    .line 56
    .line 57
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 58
    .line 59
    aget-byte v2, v0, v2

    .line 60
    .line 61
    and-int/lit8 v6, v2, 0x7f

    .line 62
    .line 63
    shl-int/lit8 v6, v6, 0xe

    .line 64
    .line 65
    int-to-long v6, v6

    .line 66
    or-long/2addr v3, v6

    .line 67
    and-int/lit16 v2, v2, 0x80

    .line 68
    .line 69
    if-eqz v2, :cond_8

    .line 70
    .line 71
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 72
    .line 73
    if-ne v5, v2, :cond_2

    .line 74
    .line 75
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 76
    .line 77
    .line 78
    :cond_2
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 79
    .line 80
    add-int/lit8 v5, v2, 0x1

    .line 81
    .line 82
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 83
    .line 84
    aget-byte v2, v0, v2

    .line 85
    .line 86
    and-int/lit8 v6, v2, 0x7f

    .line 87
    .line 88
    shl-int/lit8 v6, v6, 0x15

    .line 89
    .line 90
    int-to-long v6, v6

    .line 91
    or-long/2addr v3, v6

    .line 92
    and-int/lit16 v2, v2, 0x80

    .line 93
    .line 94
    if-eqz v2, :cond_8

    .line 95
    .line 96
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 97
    .line 98
    if-ne v5, v2, :cond_3

    .line 99
    .line 100
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 101
    .line 102
    .line 103
    :cond_3
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 104
    .line 105
    add-int/lit8 v5, v2, 0x1

    .line 106
    .line 107
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 108
    .line 109
    aget-byte v2, v0, v2

    .line 110
    .line 111
    and-int/lit8 v6, v2, 0x7f

    .line 112
    .line 113
    int-to-long v6, v6

    .line 114
    const/16 v8, 0x1c

    .line 115
    .line 116
    shl-long/2addr v6, v8

    .line 117
    or-long/2addr v3, v6

    .line 118
    and-int/lit16 v2, v2, 0x80

    .line 119
    .line 120
    if-eqz v2, :cond_8

    .line 121
    .line 122
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 123
    .line 124
    if-ne v5, v2, :cond_4

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 127
    .line 128
    .line 129
    :cond_4
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 130
    .line 131
    add-int/lit8 v5, v2, 0x1

    .line 132
    .line 133
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 134
    .line 135
    aget-byte v2, v0, v2

    .line 136
    .line 137
    and-int/lit8 v6, v2, 0x7f

    .line 138
    .line 139
    int-to-long v6, v6

    .line 140
    const/16 v8, 0x23

    .line 141
    .line 142
    shl-long/2addr v6, v8

    .line 143
    or-long/2addr v3, v6

    .line 144
    and-int/lit16 v2, v2, 0x80

    .line 145
    .line 146
    if-eqz v2, :cond_8

    .line 147
    .line 148
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 149
    .line 150
    if-ne v5, v2, :cond_5

    .line 151
    .line 152
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 153
    .line 154
    .line 155
    :cond_5
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 156
    .line 157
    add-int/lit8 v5, v2, 0x1

    .line 158
    .line 159
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 160
    .line 161
    aget-byte v2, v0, v2

    .line 162
    .line 163
    and-int/lit8 v6, v2, 0x7f

    .line 164
    .line 165
    int-to-long v6, v6

    .line 166
    const/16 v8, 0x2a

    .line 167
    .line 168
    shl-long/2addr v6, v8

    .line 169
    or-long/2addr v3, v6

    .line 170
    and-int/lit16 v2, v2, 0x80

    .line 171
    .line 172
    if-eqz v2, :cond_8

    .line 173
    .line 174
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 175
    .line 176
    if-ne v5, v2, :cond_6

    .line 177
    .line 178
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 179
    .line 180
    .line 181
    :cond_6
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 182
    .line 183
    add-int/lit8 v5, v2, 0x1

    .line 184
    .line 185
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 186
    .line 187
    aget-byte v2, v0, v2

    .line 188
    .line 189
    and-int/lit8 v6, v2, 0x7f

    .line 190
    .line 191
    int-to-long v6, v6

    .line 192
    const/16 v8, 0x31

    .line 193
    .line 194
    shl-long/2addr v6, v8

    .line 195
    or-long/2addr v3, v6

    .line 196
    and-int/lit16 v2, v2, 0x80

    .line 197
    .line 198
    if-eqz v2, :cond_8

    .line 199
    .line 200
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 201
    .line 202
    if-ne v5, v2, :cond_7

    .line 203
    .line 204
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 205
    .line 206
    .line 207
    :cond_7
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 208
    .line 209
    add-int/lit8 v5, v2, 0x1

    .line 210
    .line 211
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 212
    .line 213
    aget-byte p0, v0, v2

    .line 214
    .line 215
    int-to-long v5, p0

    .line 216
    const/16 p0, 0x38

    .line 217
    .line 218
    shl-long/2addr v5, p0

    .line 219
    or-long/2addr v3, v5

    .line 220
    :cond_8
    if-eqz p1, :cond_9

    .line 221
    .line 222
    return-wide v3

    .line 223
    :cond_9
    ushr-long p0, v3, v1

    .line 224
    .line 225
    const-wide/16 v0, 0x1

    .line 226
    .line 227
    and-long/2addr v0, v3

    .line 228
    neg-long v0, v0

    .line 229
    xor-long/2addr p0, v0

    .line 230
    return-wide p0
.end method


# virtual methods
.method public available()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->inputStream:Ljava/io/InputStream;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    add-int/2addr v0, p0

    .line 17
    return v0
.end method

.method public canReadInt()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Input;->varEncoding:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->canReadVarInt()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 11
    .line 12
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 13
    .line 14
    sub-int/2addr v0, v1

    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x4

    .line 17
    if-lt v0, v2, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-ne p0, v2, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public canReadLong()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Input;->varEncoding:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->canReadVarLong()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 11
    .line 12
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 13
    .line 14
    sub-int/2addr v0, v1

    .line 15
    const/4 v1, 0x1

    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    if-lt v0, v2, :cond_1

    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-ne p0, v2, :cond_2

    .line 26
    .line 27
    return v1

    .line 28
    :cond_2
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public canReadVarInt()Z
    .locals 6

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x5

    .line 8
    if-lt v0, v2, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x0

    .line 16
    if-gtz v0, :cond_1

    .line 17
    .line 18
    return v2

    .line 19
    :cond_1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 20
    .line 21
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 22
    .line 23
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 24
    .line 25
    add-int/lit8 v4, v0, 0x1

    .line 26
    .line 27
    aget-byte v5, p0, v0

    .line 28
    .line 29
    and-int/lit16 v5, v5, 0x80

    .line 30
    .line 31
    if-nez v5, :cond_2

    .line 32
    .line 33
    return v1

    .line 34
    :cond_2
    if-ne v4, v3, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_3
    add-int/lit8 v5, v0, 0x2

    .line 38
    .line 39
    aget-byte v4, p0, v4

    .line 40
    .line 41
    and-int/lit16 v4, v4, 0x80

    .line 42
    .line 43
    if-nez v4, :cond_4

    .line 44
    .line 45
    return v1

    .line 46
    :cond_4
    if-ne v5, v3, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    add-int/lit8 v4, v0, 0x3

    .line 50
    .line 51
    aget-byte v5, p0, v5

    .line 52
    .line 53
    and-int/lit16 v5, v5, 0x80

    .line 54
    .line 55
    if-nez v5, :cond_6

    .line 56
    .line 57
    return v1

    .line 58
    :cond_6
    if-ne v4, v3, :cond_7

    .line 59
    .line 60
    return v2

    .line 61
    :cond_7
    add-int/lit8 v0, v0, 0x4

    .line 62
    .line 63
    aget-byte p0, p0, v4

    .line 64
    .line 65
    and-int/lit16 p0, p0, 0x80

    .line 66
    .line 67
    if-nez p0, :cond_8

    .line 68
    .line 69
    return v1

    .line 70
    :cond_8
    if-ne v0, v3, :cond_9

    .line 71
    .line 72
    return v2

    .line 73
    :cond_9
    return v1
.end method

.method public canReadVarLong()Z
    .locals 6

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    const/16 v1, 0x9

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    return v2

    .line 12
    :cond_0
    const/4 v0, 0x5

    .line 13
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-gtz v0, :cond_1

    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 22
    .line 23
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 24
    .line 25
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 26
    .line 27
    add-int/lit8 v4, v0, 0x1

    .line 28
    .line 29
    aget-byte v5, p0, v0

    .line 30
    .line 31
    and-int/lit16 v5, v5, 0x80

    .line 32
    .line 33
    if-nez v5, :cond_2

    .line 34
    .line 35
    return v2

    .line 36
    :cond_2
    if-ne v4, v3, :cond_3

    .line 37
    .line 38
    return v1

    .line 39
    :cond_3
    add-int/lit8 v5, v0, 0x2

    .line 40
    .line 41
    aget-byte v4, p0, v4

    .line 42
    .line 43
    and-int/lit16 v4, v4, 0x80

    .line 44
    .line 45
    if-nez v4, :cond_4

    .line 46
    .line 47
    return v2

    .line 48
    :cond_4
    if-ne v5, v3, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    add-int/lit8 v4, v0, 0x3

    .line 52
    .line 53
    aget-byte v5, p0, v5

    .line 54
    .line 55
    and-int/lit16 v5, v5, 0x80

    .line 56
    .line 57
    if-nez v5, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    if-ne v4, v3, :cond_7

    .line 61
    .line 62
    return v1

    .line 63
    :cond_7
    add-int/lit8 v5, v0, 0x4

    .line 64
    .line 65
    aget-byte v4, p0, v4

    .line 66
    .line 67
    and-int/lit16 v4, v4, 0x80

    .line 68
    .line 69
    if-nez v4, :cond_8

    .line 70
    .line 71
    return v2

    .line 72
    :cond_8
    if-ne v5, v3, :cond_9

    .line 73
    .line 74
    return v1

    .line 75
    :cond_9
    add-int/lit8 v4, v0, 0x5

    .line 76
    .line 77
    aget-byte v5, p0, v5

    .line 78
    .line 79
    and-int/lit16 v5, v5, 0x80

    .line 80
    .line 81
    if-nez v5, :cond_a

    .line 82
    .line 83
    return v2

    .line 84
    :cond_a
    if-ne v4, v3, :cond_b

    .line 85
    .line 86
    return v1

    .line 87
    :cond_b
    add-int/lit8 v5, v0, 0x6

    .line 88
    .line 89
    aget-byte v4, p0, v4

    .line 90
    .line 91
    and-int/lit16 v4, v4, 0x80

    .line 92
    .line 93
    if-nez v4, :cond_c

    .line 94
    .line 95
    return v2

    .line 96
    :cond_c
    if-ne v5, v3, :cond_d

    .line 97
    .line 98
    return v1

    .line 99
    :cond_d
    add-int/lit8 v4, v0, 0x7

    .line 100
    .line 101
    aget-byte v5, p0, v5

    .line 102
    .line 103
    and-int/lit16 v5, v5, 0x80

    .line 104
    .line 105
    if-nez v5, :cond_e

    .line 106
    .line 107
    return v2

    .line 108
    :cond_e
    if-ne v4, v3, :cond_f

    .line 109
    .line 110
    return v1

    .line 111
    :cond_f
    add-int/lit8 v0, v0, 0x8

    .line 112
    .line 113
    aget-byte p0, p0, v4

    .line 114
    .line 115
    and-int/lit16 p0, p0, 0x80

    .line 116
    .line 117
    if-nez p0, :cond_10

    .line 118
    .line 119
    return v2

    .line 120
    :cond_10
    if-ne v0, v3, :cond_11

    .line 121
    .line 122
    return v1

    .line 123
    :cond_11
    return v2
.end method

.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->inputStream:Ljava/io/InputStream;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :cond_0
    return-void
.end method

.method public end()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    if-gtz p0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public fill([BII)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->inputStream:Ljava/io/InputStream;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 8
    .line 9
    .line 10
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return p0

    .line 12
    :catch_0
    move-exception p0

    .line 13
    new-instance p1, Lcom/esotericsoftware/kryo/KryoException;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

.method public getBuffer()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->inputStream:Ljava/io/InputStream;

    .line 2
    .line 3
    return-object p0
.end method

.method public getVariableLengthEncoding()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/io/Input;->varEncoding:Z

    .line 2
    .line 3
    return p0
.end method

.method public limit()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 2
    .line 3
    return p0
.end method

.method public optional(I)I
    .locals 9

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    if-lt v0, p1, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 10
    .line 11
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 16
    .line 17
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 18
    .line 19
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 20
    .line 21
    sub-int/2addr v3, v2

    .line 22
    invoke-virtual {p0, v1, v2, v3}, Lcom/esotericsoftware/kryo/io/Input;->fill([BII)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, -0x1

    .line 27
    if-ne v1, v2, :cond_2

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_2
    add-int/2addr v0, v1

    .line 38
    if-lt v0, p1, :cond_3

    .line 39
    .line 40
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 41
    .line 42
    add-int/2addr v0, v1

    .line 43
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 44
    .line 45
    return p1

    .line 46
    :cond_3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 47
    .line 48
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-static {v1, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    iget-wide v5, p0, Lcom/esotericsoftware/kryo/io/Input;->total:J

    .line 55
    .line 56
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 57
    .line 58
    int-to-long v7, v1

    .line 59
    add-long/2addr v5, v7

    .line 60
    iput-wide v5, p0, Lcom/esotericsoftware/kryo/io/Input;->total:J

    .line 61
    .line 62
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 63
    .line 64
    :cond_4
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 65
    .line 66
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 67
    .line 68
    sub-int/2addr v3, v0

    .line 69
    invoke-virtual {p0, v1, v0, v3}, Lcom/esotericsoftware/kryo/io/Input;->fill([BII)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-ne v1, v2, :cond_5

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    add-int/2addr v0, v1

    .line 77
    if-lt v0, p1, :cond_4

    .line 78
    .line 79
    :goto_0
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 80
    .line 81
    if-nez v0, :cond_6

    .line 82
    .line 83
    return v2

    .line 84
    :cond_6
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    return p0
.end method

.method public position()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 2
    .line 3
    return p0
.end method

.method public read()I
    .locals 3

    const/4 v0, 0x1

    .line 56
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 p0, -0x1

    return p0

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    aget-byte p0, v0, v1

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 55
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/esotericsoftware/kryo/io/Input;->read([BII)I

    move-result p0

    return p0
.end method

.method public read([BII)I
    .locals 4

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 4
    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

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
    move v1, p3

    .line 13
    :cond_0
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 14
    .line 15
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 16
    .line 17
    invoke-static {v2, v3, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    .line 20
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 21
    .line 22
    add-int/2addr v2, v0

    .line 23
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 24
    .line 25
    sub-int/2addr v1, v0

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    add-int/2addr p2, v0

    .line 30
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v2, -0x1

    .line 35
    if-ne v0, v2, :cond_2

    .line 36
    .line 37
    if-ne p3, v1, :cond_3

    .line 38
    .line 39
    return v2

    .line 40
    :cond_2
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 41
    .line 42
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 43
    .line 44
    if-ne v2, v3, :cond_0

    .line 45
    .line 46
    :cond_3
    :goto_0
    sub-int/2addr p3, v1

    .line 47
    return p3

    .line 48
    :cond_4
    const-string p0, "bytes cannot be null."

    .line 49
    .line 50
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return p0
.end method

.method public readBoolean()Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 12
    .line 13
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 14
    .line 15
    add-int/lit8 v3, v1, 0x1

    .line 16
    .line 17
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    aget-byte p0, v0, v1

    .line 20
    .line 21
    if-ne p0, v2, :cond_1

    .line 22
    .line 23
    return v2

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public readBooleans(I)[Z
    .locals 6

    .line 1
    new-array v0, p1, [Z

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v1, p1, :cond_2

    .line 9
    .line 10
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 11
    .line 12
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 13
    .line 14
    move v4, v2

    .line 15
    :goto_0
    if-ge v4, p1, :cond_1

    .line 16
    .line 17
    aget-byte v5, v1, v3

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move v5, v2

    .line 24
    :goto_1
    aput-boolean v5, v0, v4

    .line 25
    .line 26
    add-int/lit8 v4, v4, 0x1

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_2
    :goto_2
    if-ge v2, p1, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readBoolean()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    aput-boolean v1, v0, v2

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    return-object v0
.end method

.method public readByte()B
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 12
    .line 13
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 14
    .line 15
    add-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    aget-byte p0, v0, v1

    .line 20
    .line 21
    return p0
.end method

.method public readByteUnsigned()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 12
    .line 13
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 14
    .line 15
    add-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    aget-byte p0, v0, v1

    .line 20
    .line 21
    and-int/lit16 p0, p0, 0xff

    .line 22
    .line 23
    return p0
.end method

.method public readBytes([B)V
    .locals 2

    const/4 v0, 0x0

    .line 45
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/esotericsoftware/kryo/io/Input;->readBytes([BII)V

    return-void
.end method

.method public readBytes([BII)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 4
    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

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
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 13
    .line 14
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 15
    .line 16
    invoke-static {v1, v2, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 20
    .line 21
    add-int/2addr v1, v0

    .line 22
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

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
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 30
    .line 31
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-string p0, "bytes cannot be null."

    .line 40
    .line 41
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public readBytes(I)[B
    .locals 2

    .line 46
    new-array v0, p1, [B

    const/4 v1, 0x0

    .line 47
    invoke-virtual {p0, v0, v1, p1}, Lcom/esotericsoftware/kryo/io/Input;->readBytes([BII)V

    return-object v0
.end method

.method public readChar()C
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 3
    .line 4
    .line 5
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 6
    .line 7
    add-int/lit8 v1, v0, 0x2

    .line 8
    .line 9
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 10
    .line 11
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 12
    .line 13
    aget-byte v1, p0, v0

    .line 14
    .line 15
    and-int/lit16 v1, v1, 0xff

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    aget-byte p0, p0, v0

    .line 20
    .line 21
    and-int/lit16 p0, p0, 0xff

    .line 22
    .line 23
    shl-int/lit8 p0, p0, 0x8

    .line 24
    .line 25
    or-int/2addr p0, v1

    .line 26
    int-to-char p0, p0

    .line 27
    return p0
.end method

.method public readChars(I)[C
    .locals 6

    .line 1
    new-array v0, p1, [C

    .line 2
    .line 3
    shl-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-ne v2, v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 13
    .line 14
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 15
    .line 16
    :goto_0
    if-ge v3, p1, :cond_0

    .line 17
    .line 18
    aget-byte v4, v1, v2

    .line 19
    .line 20
    and-int/lit16 v4, v4, 0xff

    .line 21
    .line 22
    add-int/lit8 v5, v2, 0x1

    .line 23
    .line 24
    aget-byte v5, v1, v5

    .line 25
    .line 26
    and-int/lit16 v5, v5, 0xff

    .line 27
    .line 28
    shl-int/lit8 v5, v5, 0x8

    .line 29
    .line 30
    or-int/2addr v4, v5

    .line 31
    int-to-char v4, v4

    .line 32
    aput-char v4, v0, v3

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    :goto_1
    if-ge v3, p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readChar()C

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    aput-char v1, v0, v3

    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    return-object v0
.end method

.method public readDouble()D
    .locals 7

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 7
    .line 8
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 9
    .line 10
    add-int/lit8 v3, v2, 0x8

    .line 11
    .line 12
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 13
    .line 14
    aget-byte p0, v1, v2

    .line 15
    .line 16
    and-int/lit16 p0, p0, 0xff

    .line 17
    .line 18
    add-int/lit8 v3, v2, 0x1

    .line 19
    .line 20
    aget-byte v3, v1, v3

    .line 21
    .line 22
    and-int/lit16 v3, v3, 0xff

    .line 23
    .line 24
    shl-int/lit8 v0, v3, 0x8

    .line 25
    .line 26
    or-int/2addr p0, v0

    .line 27
    add-int/lit8 v0, v2, 0x2

    .line 28
    .line 29
    aget-byte v0, v1, v0

    .line 30
    .line 31
    and-int/lit16 v0, v0, 0xff

    .line 32
    .line 33
    shl-int/lit8 v0, v0, 0x10

    .line 34
    .line 35
    or-int/2addr p0, v0

    .line 36
    int-to-long v3, p0

    .line 37
    add-int/lit8 p0, v2, 0x3

    .line 38
    .line 39
    aget-byte p0, v1, p0

    .line 40
    .line 41
    and-int/lit16 p0, p0, 0xff

    .line 42
    .line 43
    int-to-long v5, p0

    .line 44
    const/16 p0, 0x18

    .line 45
    .line 46
    shl-long/2addr v5, p0

    .line 47
    or-long/2addr v3, v5

    .line 48
    add-int/lit8 p0, v2, 0x4

    .line 49
    .line 50
    aget-byte p0, v1, p0

    .line 51
    .line 52
    and-int/lit16 p0, p0, 0xff

    .line 53
    .line 54
    int-to-long v5, p0

    .line 55
    const/16 p0, 0x20

    .line 56
    .line 57
    shl-long/2addr v5, p0

    .line 58
    or-long/2addr v3, v5

    .line 59
    add-int/lit8 p0, v2, 0x5

    .line 60
    .line 61
    aget-byte p0, v1, p0

    .line 62
    .line 63
    and-int/lit16 p0, p0, 0xff

    .line 64
    .line 65
    int-to-long v5, p0

    .line 66
    const/16 p0, 0x28

    .line 67
    .line 68
    shl-long/2addr v5, p0

    .line 69
    or-long/2addr v3, v5

    .line 70
    add-int/lit8 p0, v2, 0x6

    .line 71
    .line 72
    aget-byte p0, v1, p0

    .line 73
    .line 74
    and-int/lit16 p0, p0, 0xff

    .line 75
    .line 76
    int-to-long v5, p0

    .line 77
    const/16 p0, 0x30

    .line 78
    .line 79
    shl-long/2addr v5, p0

    .line 80
    or-long/2addr v3, v5

    .line 81
    add-int/lit8 v2, v2, 0x7

    .line 82
    .line 83
    aget-byte p0, v1, v2

    .line 84
    .line 85
    int-to-long v0, p0

    .line 86
    const/16 p0, 0x38

    .line 87
    .line 88
    shl-long/2addr v0, p0

    .line 89
    or-long/2addr v0, v3

    .line 90
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 91
    .line 92
    .line 93
    move-result-wide v0

    .line 94
    return-wide v0
.end method

.method public readDoubles(I)[D
    .locals 9

    .line 1
    new-array v0, p1, [D

    .line 2
    .line 3
    shl-int/lit8 v1, p1, 0x3

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-ne v2, v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 13
    .line 14
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 15
    .line 16
    :goto_0
    if-ge v3, p1, :cond_0

    .line 17
    .line 18
    aget-byte v4, v1, v2

    .line 19
    .line 20
    and-int/lit16 v4, v4, 0xff

    .line 21
    .line 22
    add-int/lit8 v5, v2, 0x1

    .line 23
    .line 24
    aget-byte v5, v1, v5

    .line 25
    .line 26
    and-int/lit16 v5, v5, 0xff

    .line 27
    .line 28
    shl-int/lit8 v5, v5, 0x8

    .line 29
    .line 30
    or-int/2addr v4, v5

    .line 31
    add-int/lit8 v5, v2, 0x2

    .line 32
    .line 33
    aget-byte v5, v1, v5

    .line 34
    .line 35
    and-int/lit16 v5, v5, 0xff

    .line 36
    .line 37
    shl-int/lit8 v5, v5, 0x10

    .line 38
    .line 39
    or-int/2addr v4, v5

    .line 40
    int-to-long v4, v4

    .line 41
    add-int/lit8 v6, v2, 0x3

    .line 42
    .line 43
    aget-byte v6, v1, v6

    .line 44
    .line 45
    and-int/lit16 v6, v6, 0xff

    .line 46
    .line 47
    int-to-long v6, v6

    .line 48
    const/16 v8, 0x18

    .line 49
    .line 50
    shl-long/2addr v6, v8

    .line 51
    or-long/2addr v4, v6

    .line 52
    add-int/lit8 v6, v2, 0x4

    .line 53
    .line 54
    aget-byte v6, v1, v6

    .line 55
    .line 56
    and-int/lit16 v6, v6, 0xff

    .line 57
    .line 58
    int-to-long v6, v6

    .line 59
    const/16 v8, 0x20

    .line 60
    .line 61
    shl-long/2addr v6, v8

    .line 62
    or-long/2addr v4, v6

    .line 63
    add-int/lit8 v6, v2, 0x5

    .line 64
    .line 65
    aget-byte v6, v1, v6

    .line 66
    .line 67
    and-int/lit16 v6, v6, 0xff

    .line 68
    .line 69
    int-to-long v6, v6

    .line 70
    const/16 v8, 0x28

    .line 71
    .line 72
    shl-long/2addr v6, v8

    .line 73
    or-long/2addr v4, v6

    .line 74
    add-int/lit8 v6, v2, 0x6

    .line 75
    .line 76
    aget-byte v6, v1, v6

    .line 77
    .line 78
    and-int/lit16 v6, v6, 0xff

    .line 79
    .line 80
    int-to-long v6, v6

    .line 81
    const/16 v8, 0x30

    .line 82
    .line 83
    shl-long/2addr v6, v8

    .line 84
    or-long/2addr v4, v6

    .line 85
    add-int/lit8 v6, v2, 0x7

    .line 86
    .line 87
    aget-byte v6, v1, v6

    .line 88
    .line 89
    int-to-long v6, v6

    .line 90
    const/16 v8, 0x38

    .line 91
    .line 92
    shl-long/2addr v6, v8

    .line 93
    or-long/2addr v4, v6

    .line 94
    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    aput-wide v4, v0, v3

    .line 99
    .line 100
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    add-int/lit8 v2, v2, 0x8

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 106
    .line 107
    return-object v0

    .line 108
    :cond_1
    :goto_1
    if-ge v3, p1, :cond_2

    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readDouble()D

    .line 111
    .line 112
    .line 113
    move-result-wide v1

    .line 114
    aput-wide v1, v0, v3

    .line 115
    .line 116
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_2
    return-object v0
.end method

.method public readFloat()F
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 6
    .line 7
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0x4

    .line 10
    .line 11
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 12
    .line 13
    aget-byte p0, v0, v1

    .line 14
    .line 15
    and-int/lit16 p0, p0, 0xff

    .line 16
    .line 17
    add-int/lit8 v2, v1, 0x1

    .line 18
    .line 19
    aget-byte v2, v0, v2

    .line 20
    .line 21
    and-int/lit16 v2, v2, 0xff

    .line 22
    .line 23
    shl-int/lit8 v2, v2, 0x8

    .line 24
    .line 25
    or-int/2addr p0, v2

    .line 26
    add-int/lit8 v2, v1, 0x2

    .line 27
    .line 28
    aget-byte v2, v0, v2

    .line 29
    .line 30
    and-int/lit16 v2, v2, 0xff

    .line 31
    .line 32
    shl-int/lit8 v2, v2, 0x10

    .line 33
    .line 34
    or-int/2addr p0, v2

    .line 35
    add-int/lit8 v1, v1, 0x3

    .line 36
    .line 37
    aget-byte v0, v0, v1

    .line 38
    .line 39
    and-int/lit16 v0, v0, 0xff

    .line 40
    .line 41
    shl-int/lit8 v0, v0, 0x18

    .line 42
    .line 43
    or-int/2addr p0, v0

    .line 44
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    return p0
.end method

.method public readFloats(I)[F
    .locals 6

    .line 1
    new-array v0, p1, [F

    .line 2
    .line 3
    shl-int/lit8 v1, p1, 0x2

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-ne v2, v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 13
    .line 14
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 15
    .line 16
    :goto_0
    if-ge v3, p1, :cond_0

    .line 17
    .line 18
    aget-byte v4, v1, v2

    .line 19
    .line 20
    and-int/lit16 v4, v4, 0xff

    .line 21
    .line 22
    add-int/lit8 v5, v2, 0x1

    .line 23
    .line 24
    aget-byte v5, v1, v5

    .line 25
    .line 26
    and-int/lit16 v5, v5, 0xff

    .line 27
    .line 28
    shl-int/lit8 v5, v5, 0x8

    .line 29
    .line 30
    or-int/2addr v4, v5

    .line 31
    add-int/lit8 v5, v2, 0x2

    .line 32
    .line 33
    aget-byte v5, v1, v5

    .line 34
    .line 35
    and-int/lit16 v5, v5, 0xff

    .line 36
    .line 37
    shl-int/lit8 v5, v5, 0x10

    .line 38
    .line 39
    or-int/2addr v4, v5

    .line 40
    add-int/lit8 v5, v2, 0x3

    .line 41
    .line 42
    aget-byte v5, v1, v5

    .line 43
    .line 44
    and-int/lit16 v5, v5, 0xff

    .line 45
    .line 46
    shl-int/lit8 v5, v5, 0x18

    .line 47
    .line 48
    or-int/2addr v4, v5

    .line 49
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    aput v4, v0, v3

    .line 54
    .line 55
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x4

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_1
    :goto_1
    if-ge v3, p1, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readFloat()F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    aput v1, v0, v3

    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    return-object v0
.end method

.method public readInt()I
    .locals 3

    const/4 v0, 0x4

    .line 113
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 114
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 115
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    add-int/lit8 v2, v1, 0x4

    .line 116
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 117
    aget-byte p0, v0, v1

    and-int/lit16 p0, p0, 0xff

    add-int/lit8 v2, v1, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr p0, v2

    add-int/lit8 v2, v1, 0x2

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr p0, v2

    add-int/lit8 v1, v1, 0x3

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method public readInt(I)I
    .locals 4

    .line 1
    if-ltz p1, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-gt p1, v0, :cond_4

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 7
    .line 8
    .line 9
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 10
    .line 11
    add-int v2, v1, p1

    .line 12
    .line 13
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq p1, v2, :cond_3

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    if-eq p1, v3, :cond_2

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    if-eq p1, v2, :cond_1

    .line 23
    .line 24
    if-ne p1, v0, :cond_0

    .line 25
    .line 26
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 27
    .line 28
    aget-byte p1, p0, v1

    .line 29
    .line 30
    shl-int/lit8 p1, p1, 0x18

    .line 31
    .line 32
    add-int/lit8 v0, v1, 0x1

    .line 33
    .line 34
    aget-byte v0, p0, v0

    .line 35
    .line 36
    and-int/lit16 v0, v0, 0xff

    .line 37
    .line 38
    shl-int/lit8 v0, v0, 0x10

    .line 39
    .line 40
    or-int/2addr p1, v0

    .line 41
    add-int/lit8 v0, v1, 0x2

    .line 42
    .line 43
    aget-byte v0, p0, v0

    .line 44
    .line 45
    and-int/lit16 v0, v0, 0xff

    .line 46
    .line 47
    shl-int/lit8 v0, v0, 0x8

    .line 48
    .line 49
    or-int/2addr p1, v0

    .line 50
    add-int/2addr v1, v2

    .line 51
    aget-byte p0, p0, v1

    .line 52
    .line 53
    and-int/lit16 p0, p0, 0xff

    .line 54
    .line 55
    or-int/2addr p0, p1

    .line 56
    return p0

    .line 57
    :cond_0
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return p0

    .line 62
    :cond_1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 63
    .line 64
    aget-byte p1, p0, v1

    .line 65
    .line 66
    shl-int/lit8 p1, p1, 0x10

    .line 67
    .line 68
    add-int/lit8 v0, v1, 0x1

    .line 69
    .line 70
    aget-byte v0, p0, v0

    .line 71
    .line 72
    and-int/lit16 v0, v0, 0xff

    .line 73
    .line 74
    shl-int/lit8 v0, v0, 0x8

    .line 75
    .line 76
    or-int/2addr p1, v0

    .line 77
    add-int/2addr v1, v3

    .line 78
    aget-byte p0, p0, v1

    .line 79
    .line 80
    and-int/lit16 p0, p0, 0xff

    .line 81
    .line 82
    or-int/2addr p0, p1

    .line 83
    return p0

    .line 84
    :cond_2
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 85
    .line 86
    aget-byte p1, p0, v1

    .line 87
    .line 88
    shl-int/lit8 p1, p1, 0x8

    .line 89
    .line 90
    add-int/2addr v1, v2

    .line 91
    aget-byte p0, p0, v1

    .line 92
    .line 93
    and-int/lit16 p0, p0, 0xff

    .line 94
    .line 95
    or-int/2addr p0, p1

    .line 96
    return p0

    .line 97
    :cond_3
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 98
    .line 99
    aget-byte p0, p0, v1

    .line 100
    .line 101
    return p0

    .line 102
    :cond_4
    const-string p0, "count must be >= 0 and <= 4: "

    .line 103
    .line 104
    invoke-static {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const/4 p0, 0x0

    .line 112
    return p0
.end method

.method public readInt(Z)I
    .locals 1

    .line 118
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Input;->varEncoding:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    move-result p0

    return p0

    .line 119
    :cond_0
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readInt()I

    move-result p0

    return p0
.end method

.method public readInts(I)[I
    .locals 6

    .line 1
    new-array v0, p1, [I

    .line 2
    .line 3
    shl-int/lit8 v1, p1, 0x2

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-ne v2, v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 13
    .line 14
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 15
    .line 16
    :goto_0
    if-ge v3, p1, :cond_0

    .line 17
    .line 18
    aget-byte v4, v1, v2

    .line 19
    .line 20
    and-int/lit16 v4, v4, 0xff

    .line 21
    .line 22
    add-int/lit8 v5, v2, 0x1

    .line 23
    .line 24
    aget-byte v5, v1, v5

    .line 25
    .line 26
    and-int/lit16 v5, v5, 0xff

    .line 27
    .line 28
    shl-int/lit8 v5, v5, 0x8

    .line 29
    .line 30
    or-int/2addr v4, v5

    .line 31
    add-int/lit8 v5, v2, 0x2

    .line 32
    .line 33
    aget-byte v5, v1, v5

    .line 34
    .line 35
    and-int/lit16 v5, v5, 0xff

    .line 36
    .line 37
    shl-int/lit8 v5, v5, 0x10

    .line 38
    .line 39
    or-int/2addr v4, v5

    .line 40
    add-int/lit8 v5, v2, 0x3

    .line 41
    .line 42
    aget-byte v5, v1, v5

    .line 43
    .line 44
    and-int/lit16 v5, v5, 0xff

    .line 45
    .line 46
    shl-int/lit8 v5, v5, 0x18

    .line 47
    .line 48
    or-int/2addr v4, v5

    .line 49
    aput v4, v0, v3

    .line 50
    .line 51
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x4

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_1
    :goto_1
    if-ge v3, p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readInt()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    aput v1, v0, v3

    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    return-object v0
.end method

.method public readInts(IZ)[I
    .locals 3

    .line 71
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Input;->varEncoding:Z

    if-eqz v0, :cond_1

    .line 72
    new-array v0, p1, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 73
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 74
    :cond_1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->readInts(I)[I

    move-result-object p0

    return-object p0
.end method

.method public readLong()J
    .locals 7

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 7
    .line 8
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 9
    .line 10
    add-int/lit8 v3, v2, 0x8

    .line 11
    .line 12
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 13
    .line 14
    aget-byte p0, v1, v2

    .line 15
    .line 16
    and-int/lit16 p0, p0, 0xff

    .line 17
    .line 18
    add-int/lit8 v3, v2, 0x1

    .line 19
    .line 20
    aget-byte v3, v1, v3

    .line 21
    .line 22
    and-int/lit16 v3, v3, 0xff

    .line 23
    .line 24
    shl-int/lit8 v0, v3, 0x8

    .line 25
    .line 26
    or-int/2addr p0, v0

    .line 27
    add-int/lit8 v0, v2, 0x2

    .line 28
    .line 29
    aget-byte v0, v1, v0

    .line 30
    .line 31
    and-int/lit16 v0, v0, 0xff

    .line 32
    .line 33
    shl-int/lit8 v0, v0, 0x10

    .line 34
    .line 35
    or-int/2addr p0, v0

    .line 36
    int-to-long v3, p0

    .line 37
    add-int/lit8 p0, v2, 0x3

    .line 38
    .line 39
    aget-byte p0, v1, p0

    .line 40
    .line 41
    and-int/lit16 p0, p0, 0xff

    .line 42
    .line 43
    int-to-long v5, p0

    .line 44
    const/16 p0, 0x18

    .line 45
    .line 46
    shl-long/2addr v5, p0

    .line 47
    or-long/2addr v3, v5

    .line 48
    add-int/lit8 p0, v2, 0x4

    .line 49
    .line 50
    aget-byte p0, v1, p0

    .line 51
    .line 52
    and-int/lit16 p0, p0, 0xff

    .line 53
    .line 54
    int-to-long v5, p0

    .line 55
    const/16 p0, 0x20

    .line 56
    .line 57
    shl-long/2addr v5, p0

    .line 58
    or-long/2addr v3, v5

    .line 59
    add-int/lit8 p0, v2, 0x5

    .line 60
    .line 61
    aget-byte p0, v1, p0

    .line 62
    .line 63
    and-int/lit16 p0, p0, 0xff

    .line 64
    .line 65
    int-to-long v5, p0

    .line 66
    const/16 p0, 0x28

    .line 67
    .line 68
    shl-long/2addr v5, p0

    .line 69
    or-long/2addr v3, v5

    .line 70
    add-int/lit8 p0, v2, 0x6

    .line 71
    .line 72
    aget-byte p0, v1, p0

    .line 73
    .line 74
    and-int/lit16 p0, p0, 0xff

    .line 75
    .line 76
    int-to-long v5, p0

    .line 77
    const/16 p0, 0x30

    .line 78
    .line 79
    shl-long/2addr v5, p0

    .line 80
    or-long/2addr v3, v5

    .line 81
    add-int/lit8 v2, v2, 0x7

    .line 82
    .line 83
    aget-byte p0, v1, v2

    .line 84
    .line 85
    int-to-long v0, p0

    .line 86
    const/16 p0, 0x38

    .line 87
    .line 88
    shl-long/2addr v0, p0

    .line 89
    or-long/2addr v0, v3

    .line 90
    return-wide v0
.end method

.method public readLong(I)J
    .locals 5

    if-ltz p1, :cond_1

    const/16 v0, 0x8

    if-gt p1, v0, :cond_1

    const/4 v0, 0x4

    if-gt p1, v0, :cond_0

    .line 91
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->readInt(I)I

    move-result p0

    int-to-long p0, p0

    return-wide p0

    .line 92
    :cond_0
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    sub-int/2addr p1, v0

    .line 93
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->readInt(I)I

    move-result p1

    int-to-long v1, p1

    const/16 p1, 0x20

    shl-long/2addr v1, p1

    .line 94
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->readInt(I)I

    move-result p0

    int-to-long p0, p0

    const-wide v3, 0xffffffffL

    and-long/2addr p0, v3

    or-long/2addr p0, v1

    return-wide p0

    .line 95
    :cond_1
    const-string p0, "count must be >= 0 and <= 8: "

    .line 96
    invoke-static {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 97
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const-wide/16 p0, 0x0

    return-wide p0
.end method

.method public readLong(Z)J
    .locals 1

    .line 98
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Input;->varEncoding:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->readVarLong(Z)J

    move-result-wide p0

    return-wide p0

    .line 99
    :cond_0
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readLong()J

    move-result-wide p0

    return-wide p0
.end method

.method public readLongs(I)[J
    .locals 9

    .line 1
    new-array v0, p1, [J

    .line 2
    .line 3
    shl-int/lit8 v1, p1, 0x3

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-ne v2, v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 13
    .line 14
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 15
    .line 16
    :goto_0
    if-ge v3, p1, :cond_0

    .line 17
    .line 18
    aget-byte v4, v1, v2

    .line 19
    .line 20
    and-int/lit16 v4, v4, 0xff

    .line 21
    .line 22
    add-int/lit8 v5, v2, 0x1

    .line 23
    .line 24
    aget-byte v5, v1, v5

    .line 25
    .line 26
    and-int/lit16 v5, v5, 0xff

    .line 27
    .line 28
    shl-int/lit8 v5, v5, 0x8

    .line 29
    .line 30
    or-int/2addr v4, v5

    .line 31
    add-int/lit8 v5, v2, 0x2

    .line 32
    .line 33
    aget-byte v5, v1, v5

    .line 34
    .line 35
    and-int/lit16 v5, v5, 0xff

    .line 36
    .line 37
    shl-int/lit8 v5, v5, 0x10

    .line 38
    .line 39
    or-int/2addr v4, v5

    .line 40
    int-to-long v4, v4

    .line 41
    add-int/lit8 v6, v2, 0x3

    .line 42
    .line 43
    aget-byte v6, v1, v6

    .line 44
    .line 45
    and-int/lit16 v6, v6, 0xff

    .line 46
    .line 47
    int-to-long v6, v6

    .line 48
    const/16 v8, 0x18

    .line 49
    .line 50
    shl-long/2addr v6, v8

    .line 51
    or-long/2addr v4, v6

    .line 52
    add-int/lit8 v6, v2, 0x4

    .line 53
    .line 54
    aget-byte v6, v1, v6

    .line 55
    .line 56
    and-int/lit16 v6, v6, 0xff

    .line 57
    .line 58
    int-to-long v6, v6

    .line 59
    const/16 v8, 0x20

    .line 60
    .line 61
    shl-long/2addr v6, v8

    .line 62
    or-long/2addr v4, v6

    .line 63
    add-int/lit8 v6, v2, 0x5

    .line 64
    .line 65
    aget-byte v6, v1, v6

    .line 66
    .line 67
    and-int/lit16 v6, v6, 0xff

    .line 68
    .line 69
    int-to-long v6, v6

    .line 70
    const/16 v8, 0x28

    .line 71
    .line 72
    shl-long/2addr v6, v8

    .line 73
    or-long/2addr v4, v6

    .line 74
    add-int/lit8 v6, v2, 0x6

    .line 75
    .line 76
    aget-byte v6, v1, v6

    .line 77
    .line 78
    and-int/lit16 v6, v6, 0xff

    .line 79
    .line 80
    int-to-long v6, v6

    .line 81
    const/16 v8, 0x30

    .line 82
    .line 83
    shl-long/2addr v6, v8

    .line 84
    or-long/2addr v4, v6

    .line 85
    add-int/lit8 v6, v2, 0x7

    .line 86
    .line 87
    aget-byte v6, v1, v6

    .line 88
    .line 89
    int-to-long v6, v6

    .line 90
    const/16 v8, 0x38

    .line 91
    .line 92
    shl-long/2addr v6, v8

    .line 93
    or-long/2addr v4, v6

    .line 94
    aput-wide v4, v0, v3

    .line 95
    .line 96
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    add-int/lit8 v2, v2, 0x8

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 102
    .line 103
    return-object v0

    .line 104
    :cond_1
    :goto_1
    if-ge v3, p1, :cond_2

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readLong()J

    .line 107
    .line 108
    .line 109
    move-result-wide v1

    .line 110
    aput-wide v1, v0, v3

    .line 111
    .line 112
    add-int/lit8 v3, v3, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    return-object v0
.end method

.method public readLongs(IZ)[J
    .locals 4

    .line 116
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/io/Input;->varEncoding:Z

    if-eqz v0, :cond_1

    .line 117
    new-array v0, p1, [J

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 118
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/io/Input;->readVarLong(Z)J

    move-result-wide v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 119
    :cond_1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->readLongs(I)[J

    move-result-object p0

    return-object p0
.end method

.method public readShort()S
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 3
    .line 4
    .line 5
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 6
    .line 7
    add-int/lit8 v1, v0, 0x2

    .line 8
    .line 9
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 10
    .line 11
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 12
    .line 13
    aget-byte v1, p0, v0

    .line 14
    .line 15
    and-int/lit16 v1, v1, 0xff

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    aget-byte p0, p0, v0

    .line 20
    .line 21
    and-int/lit16 p0, p0, 0xff

    .line 22
    .line 23
    shl-int/lit8 p0, p0, 0x8

    .line 24
    .line 25
    or-int/2addr p0, v1

    .line 26
    int-to-short p0, p0

    .line 27
    return p0
.end method

.method public readShortUnsigned()I
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 3
    .line 4
    .line 5
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 6
    .line 7
    add-int/lit8 v1, v0, 0x2

    .line 8
    .line 9
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 10
    .line 11
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 12
    .line 13
    aget-byte v1, p0, v0

    .line 14
    .line 15
    and-int/lit16 v1, v1, 0xff

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    aget-byte p0, p0, v0

    .line 20
    .line 21
    and-int/lit16 p0, p0, 0xff

    .line 22
    .line 23
    shl-int/lit8 p0, p0, 0x8

    .line 24
    .line 25
    or-int/2addr p0, v1

    .line 26
    return p0
.end method

.method public readShorts(I)[S
    .locals 6

    .line 1
    new-array v0, p1, [S

    .line 2
    .line 3
    shl-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->optional(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-ne v2, v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 13
    .line 14
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 15
    .line 16
    :goto_0
    if-ge v3, p1, :cond_0

    .line 17
    .line 18
    aget-byte v4, v1, v2

    .line 19
    .line 20
    and-int/lit16 v4, v4, 0xff

    .line 21
    .line 22
    add-int/lit8 v5, v2, 0x1

    .line 23
    .line 24
    aget-byte v5, v1, v5

    .line 25
    .line 26
    and-int/lit16 v5, v5, 0xff

    .line 27
    .line 28
    shl-int/lit8 v5, v5, 0x8

    .line 29
    .line 30
    or-int/2addr v4, v5

    .line 31
    int-to-short v4, v4

    .line 32
    aput-short v4, v0, v3

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    :goto_1
    if-ge v3, p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readShort()S

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    aput-short v1, v0, v3

    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    return-object v0
.end method

.method public readString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readVarIntFlag()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Input;->readAsciiString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->readVarIntFlag(Z)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    if-eq v1, v0, :cond_1

    .line 20
    .line 21
    add-int/lit8 v1, v1, -0x1

    .line 22
    .line 23
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->readUtf8Chars(I)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Ljava/lang/String;

    .line 27
    .line 28
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v0, p0, v2, v1}, Ljava/lang/String;-><init>([CII)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    const-string p0, ""

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public readStringBuilder()Ljava/lang/StringBuilder;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->readVarIntFlag()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Input;->readAsciiString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->readVarIntFlag(Z)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-eq v1, v0, :cond_1

    .line 26
    .line 27
    add-int/lit8 v1, v1, -0x1

    .line 28
    .line 29
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/Input;->readUtf8Chars(I)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 38
    .line 39
    invoke-virtual {v0, p0, v2, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_2
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method

.method public readVarDouble(DZ)D
    .locals 2

    .line 1
    invoke-virtual {p0, p3}, Lcom/esotericsoftware/kryo/io/Input;->readVarLong(Z)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    long-to-double v0, v0

    .line 6
    div-double/2addr v0, p1

    .line 7
    return-wide v0
.end method

.method public readVarFloat(FZ)F
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-float p0, p0

    .line 6
    div-float/2addr p0, p1

    .line 7
    return p0
.end method

.method public readVarInt(Z)I
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x5

    .line 7
    if-ge v1, v2, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt_slow(Z)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 15
    .line 16
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 17
    .line 18
    add-int/lit8 v4, v3, 0x1

    .line 19
    .line 20
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 21
    .line 22
    aget-byte v5, v1, v3

    .line 23
    .line 24
    and-int/lit8 v6, v5, 0x7f

    .line 25
    .line 26
    and-int/lit16 v5, v5, 0x80

    .line 27
    .line 28
    if-eqz v5, :cond_3

    .line 29
    .line 30
    add-int/lit8 v5, v3, 0x2

    .line 31
    .line 32
    aget-byte v4, v1, v4

    .line 33
    .line 34
    and-int/lit8 v7, v4, 0x7f

    .line 35
    .line 36
    shl-int/lit8 v7, v7, 0x7

    .line 37
    .line 38
    or-int/2addr v6, v7

    .line 39
    and-int/lit16 v4, v4, 0x80

    .line 40
    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    add-int/lit8 v4, v3, 0x3

    .line 44
    .line 45
    aget-byte v5, v1, v5

    .line 46
    .line 47
    and-int/lit8 v7, v5, 0x7f

    .line 48
    .line 49
    shl-int/lit8 v7, v7, 0xe

    .line 50
    .line 51
    or-int/2addr v6, v7

    .line 52
    and-int/lit16 v5, v5, 0x80

    .line 53
    .line 54
    if-eqz v5, :cond_1

    .line 55
    .line 56
    add-int/lit8 v5, v3, 0x4

    .line 57
    .line 58
    aget-byte v4, v1, v4

    .line 59
    .line 60
    and-int/lit8 v7, v4, 0x7f

    .line 61
    .line 62
    shl-int/lit8 v7, v7, 0x15

    .line 63
    .line 64
    or-int/2addr v6, v7

    .line 65
    and-int/lit16 v4, v4, 0x80

    .line 66
    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    add-int/2addr v2, v3

    .line 70
    aget-byte v1, v1, v5

    .line 71
    .line 72
    and-int/lit8 v1, v1, 0x7f

    .line 73
    .line 74
    shl-int/lit8 v1, v1, 0x1c

    .line 75
    .line 76
    or-int/2addr v1, v6

    .line 77
    move v6, v1

    .line 78
    move v5, v2

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move v5, v4

    .line 81
    :cond_2
    :goto_0
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 82
    .line 83
    :cond_3
    if-eqz p1, :cond_4

    .line 84
    .line 85
    return v6

    .line 86
    :cond_4
    ushr-int/lit8 p0, v6, 0x1

    .line 87
    .line 88
    and-int/lit8 p1, v6, 0x1

    .line 89
    .line 90
    neg-int p1, p1

    .line 91
    xor-int/2addr p0, p1

    .line 92
    return p0
.end method

.method public readVarIntFlag(Z)I
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x5

    .line 7
    if-ge v1, v2, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->readVarIntFlag_slow(Z)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 15
    .line 16
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 17
    .line 18
    add-int/lit8 v4, v3, 0x1

    .line 19
    .line 20
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 21
    .line 22
    aget-byte v5, v1, v3

    .line 23
    .line 24
    and-int/lit8 v6, v5, 0x3f

    .line 25
    .line 26
    and-int/lit8 v5, v5, 0x40

    .line 27
    .line 28
    if-eqz v5, :cond_3

    .line 29
    .line 30
    add-int/lit8 v5, v3, 0x2

    .line 31
    .line 32
    aget-byte v4, v1, v4

    .line 33
    .line 34
    and-int/lit8 v7, v4, 0x7f

    .line 35
    .line 36
    shl-int/lit8 v7, v7, 0x6

    .line 37
    .line 38
    or-int/2addr v6, v7

    .line 39
    and-int/lit16 v4, v4, 0x80

    .line 40
    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    add-int/lit8 v4, v3, 0x3

    .line 44
    .line 45
    aget-byte v5, v1, v5

    .line 46
    .line 47
    and-int/lit8 v7, v5, 0x7f

    .line 48
    .line 49
    shl-int/lit8 v7, v7, 0xd

    .line 50
    .line 51
    or-int/2addr v6, v7

    .line 52
    and-int/lit16 v5, v5, 0x80

    .line 53
    .line 54
    if-eqz v5, :cond_1

    .line 55
    .line 56
    add-int/lit8 v5, v3, 0x4

    .line 57
    .line 58
    aget-byte v4, v1, v4

    .line 59
    .line 60
    and-int/lit8 v7, v4, 0x7f

    .line 61
    .line 62
    shl-int/lit8 v7, v7, 0x14

    .line 63
    .line 64
    or-int/2addr v6, v7

    .line 65
    and-int/lit16 v4, v4, 0x80

    .line 66
    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    add-int/2addr v2, v3

    .line 70
    aget-byte v1, v1, v5

    .line 71
    .line 72
    and-int/lit8 v1, v1, 0x7f

    .line 73
    .line 74
    shl-int/lit8 v1, v1, 0x1b

    .line 75
    .line 76
    or-int/2addr v1, v6

    .line 77
    move v6, v1

    .line 78
    move v5, v2

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move v5, v4

    .line 81
    :cond_2
    :goto_0
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 82
    .line 83
    :cond_3
    if-eqz p1, :cond_4

    .line 84
    .line 85
    return v6

    .line 86
    :cond_4
    ushr-int/lit8 p0, v6, 0x1

    .line 87
    .line 88
    and-int/lit8 p1, v6, 0x1

    .line 89
    .line 90
    neg-int p1, p1

    .line 91
    xor-int/2addr p0, p1

    .line 92
    return p0
.end method

.method public readVarIntFlag()Z
    .locals 3

    .line 93
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    iget p0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    aget-byte p0, v0, p0

    and-int/lit16 p0, p0, 0x80

    if-eqz p0, :cond_1

    return v2

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public readVarLong(Z)J
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/16 v2, 0x9

    .line 7
    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->readVarLong_slow(Z)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0

    .line 15
    :cond_0
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 16
    .line 17
    iget-object v3, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 18
    .line 19
    add-int/lit8 v4, v1, 0x1

    .line 20
    .line 21
    aget-byte v5, v3, v1

    .line 22
    .line 23
    and-int/lit8 v6, v5, 0x7f

    .line 24
    .line 25
    int-to-long v6, v6

    .line 26
    and-int/lit16 v5, v5, 0x80

    .line 27
    .line 28
    if-eqz v5, :cond_2

    .line 29
    .line 30
    add-int/lit8 v5, v1, 0x2

    .line 31
    .line 32
    aget-byte v4, v3, v4

    .line 33
    .line 34
    and-int/lit8 v8, v4, 0x7f

    .line 35
    .line 36
    shl-int/lit8 v8, v8, 0x7

    .line 37
    .line 38
    int-to-long v8, v8

    .line 39
    or-long/2addr v6, v8

    .line 40
    and-int/lit16 v4, v4, 0x80

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    add-int/lit8 v4, v1, 0x3

    .line 45
    .line 46
    aget-byte v5, v3, v5

    .line 47
    .line 48
    and-int/lit8 v8, v5, 0x7f

    .line 49
    .line 50
    shl-int/lit8 v8, v8, 0xe

    .line 51
    .line 52
    int-to-long v8, v8

    .line 53
    or-long/2addr v6, v8

    .line 54
    and-int/lit16 v5, v5, 0x80

    .line 55
    .line 56
    if-eqz v5, :cond_2

    .line 57
    .line 58
    add-int/lit8 v5, v1, 0x4

    .line 59
    .line 60
    aget-byte v4, v3, v4

    .line 61
    .line 62
    and-int/lit8 v8, v4, 0x7f

    .line 63
    .line 64
    shl-int/lit8 v8, v8, 0x15

    .line 65
    .line 66
    int-to-long v8, v8

    .line 67
    or-long/2addr v6, v8

    .line 68
    and-int/lit16 v4, v4, 0x80

    .line 69
    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    add-int/lit8 v4, v1, 0x5

    .line 73
    .line 74
    aget-byte v5, v3, v5

    .line 75
    .line 76
    and-int/lit8 v8, v5, 0x7f

    .line 77
    .line 78
    int-to-long v8, v8

    .line 79
    const/16 v10, 0x1c

    .line 80
    .line 81
    shl-long/2addr v8, v10

    .line 82
    or-long/2addr v6, v8

    .line 83
    and-int/lit16 v5, v5, 0x80

    .line 84
    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    add-int/lit8 v5, v1, 0x6

    .line 88
    .line 89
    aget-byte v4, v3, v4

    .line 90
    .line 91
    and-int/lit8 v8, v4, 0x7f

    .line 92
    .line 93
    int-to-long v8, v8

    .line 94
    const/16 v10, 0x23

    .line 95
    .line 96
    shl-long/2addr v8, v10

    .line 97
    or-long/2addr v6, v8

    .line 98
    and-int/lit16 v4, v4, 0x80

    .line 99
    .line 100
    if-eqz v4, :cond_1

    .line 101
    .line 102
    add-int/lit8 v4, v1, 0x7

    .line 103
    .line 104
    aget-byte v5, v3, v5

    .line 105
    .line 106
    and-int/lit8 v8, v5, 0x7f

    .line 107
    .line 108
    int-to-long v8, v8

    .line 109
    const/16 v10, 0x2a

    .line 110
    .line 111
    shl-long/2addr v8, v10

    .line 112
    or-long/2addr v6, v8

    .line 113
    and-int/lit16 v5, v5, 0x80

    .line 114
    .line 115
    if-eqz v5, :cond_2

    .line 116
    .line 117
    add-int/lit8 v5, v1, 0x8

    .line 118
    .line 119
    aget-byte v4, v3, v4

    .line 120
    .line 121
    and-int/lit8 v8, v4, 0x7f

    .line 122
    .line 123
    int-to-long v8, v8

    .line 124
    const/16 v10, 0x31

    .line 125
    .line 126
    shl-long/2addr v8, v10

    .line 127
    or-long/2addr v6, v8

    .line 128
    and-int/lit16 v4, v4, 0x80

    .line 129
    .line 130
    if-eqz v4, :cond_1

    .line 131
    .line 132
    add-int/lit8 v4, v1, 0x9

    .line 133
    .line 134
    aget-byte v1, v3, v5

    .line 135
    .line 136
    int-to-long v1, v1

    .line 137
    const/16 v3, 0x38

    .line 138
    .line 139
    shl-long/2addr v1, v3

    .line 140
    or-long/2addr v6, v1

    .line 141
    goto :goto_0

    .line 142
    :cond_1
    move v4, v5

    .line 143
    :cond_2
    :goto_0
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 144
    .line 145
    if-eqz p1, :cond_3

    .line 146
    .line 147
    return-wide v6

    .line 148
    :cond_3
    ushr-long p0, v6, v0

    .line 149
    .line 150
    const-wide/16 v0, 0x1

    .line 151
    .line 152
    and-long/2addr v0, v6

    .line 153
    neg-long v0, v0

    .line 154
    xor-long/2addr p0, v0

    .line 155
    return-wide p0
.end method

.method public require(I)I
    .locals 10

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 4
    .line 5
    sub-int v1, v0, v1

    .line 6
    .line 7
    if-lt v1, p1, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 11
    .line 12
    if-gt p1, v2, :cond_6

    .line 13
    .line 14
    const-string v3, "Buffer underflow."

    .line 15
    .line 16
    const/4 v4, -0x1

    .line 17
    if-lez v1, :cond_2

    .line 18
    .line 19
    iget-object v5, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 20
    .line 21
    sub-int/2addr v2, v0

    .line 22
    invoke-virtual {p0, v5, v0, v2}, Lcom/esotericsoftware/kryo/io/Input;->fill([BII)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eq v0, v4, :cond_1

    .line 27
    .line 28
    add-int/2addr v1, v0

    .line 29
    if-lt v1, p1, :cond_2

    .line 30
    .line 31
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 32
    .line 33
    add-int/2addr p1, v0

    .line 34
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 35
    .line 36
    return v1

    .line 37
    :cond_1
    new-instance p0, Lcom/esotericsoftware/kryo/io/KryoBufferUnderflowException;

    .line 38
    .line 39
    invoke-direct {p0, v3}, Lcom/esotericsoftware/kryo/io/KryoBufferUnderflowException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_2
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 44
    .line 45
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-static {v0, v2, v0, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 49
    .line 50
    .line 51
    iget-wide v6, p0, Lcom/esotericsoftware/kryo/io/Input;->total:J

    .line 52
    .line 53
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 54
    .line 55
    int-to-long v8, v0

    .line 56
    add-long/2addr v6, v8

    .line 57
    iput-wide v6, p0, Lcom/esotericsoftware/kryo/io/Input;->total:J

    .line 58
    .line 59
    iput v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 60
    .line 61
    :cond_3
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 62
    .line 63
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 64
    .line 65
    sub-int/2addr v2, v1

    .line 66
    invoke-virtual {p0, v0, v1, v2}, Lcom/esotericsoftware/kryo/io/Input;->fill([BII)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-ne v0, v4, :cond_5

    .line 71
    .line 72
    if-lt v1, p1, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    new-instance p0, Lcom/esotericsoftware/kryo/io/KryoBufferUnderflowException;

    .line 76
    .line 77
    invoke-direct {p0, v3}, Lcom/esotericsoftware/kryo/io/KryoBufferUnderflowException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p0

    .line 81
    :cond_5
    add-int/2addr v1, v0

    .line 82
    if-lt v1, p1, :cond_3

    .line 83
    .line 84
    :goto_0
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 85
    .line 86
    return v1

    .line 87
    :cond_6
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 88
    .line 89
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 90
    .line 91
    new-instance v1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v2, "Buffer too small: capacity: "

    .line 94
    .line 95
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p0, ", required: "

    .line 102
    .line 103
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0
.end method

.method public reset()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/esotericsoftware/kryo/io/Input;->total:J

    .line 7
    .line 8
    return-void
.end method

.method public setBuffer([B)V
    .locals 2

    const/4 v0, 0x0

    .line 27
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/esotericsoftware/kryo/io/Input;->setBuffer([BII)V

    return-void
.end method

.method public setBuffer([BII)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Input;->buffer:[B

    .line 4
    .line 5
    iput p2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 6
    .line 7
    add-int/2addr p2, p3

    .line 8
    iput p2, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 9
    .line 10
    array-length p1, p1

    .line 11
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 12
    .line 13
    const-wide/16 p1, 0x0

    .line 14
    .line 15
    iput-wide p1, p0, Lcom/esotericsoftware/kryo/io/Input;->total:J

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Input;->inputStream:Ljava/io/InputStream;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p0, "bytes cannot be null."

    .line 22
    .line 23
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public setInputStream(Ljava/io/InputStream;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Input;->inputStream:Ljava/io/InputStream;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->reset()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setLimit(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 2
    .line 3
    return-void
.end method

.method public setPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 2
    .line 3
    return-void
.end method

.method public setTotal(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/esotericsoftware/kryo/io/Input;->total:J

    .line 2
    .line 3
    return-void
.end method

.method public setVariableLengthEncoding(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/io/Input;->varEncoding:Z

    .line 2
    .line 3
    return-void
.end method

.method public skip(J)J
    .locals 4

    move-wide v0, p1

    :goto_0
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    const-wide/32 v2, 0x7ffffff7

    .line 29
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v2, v2

    .line 30
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/Input;->skip(I)V

    int-to-long v2, v2

    sub-long/2addr v0, v2

    goto :goto_0

    :cond_0
    return-wide p1
.end method

.method public skip(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 2
    .line 3
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :goto_0
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 11
    .line 12
    add-int/2addr v1, v0

    .line 13
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 14
    .line 15
    sub-int/2addr p1, v0

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 20
    .line 21
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->require(I)I

    .line 26
    .line 27
    .line 28
    goto :goto_0
.end method

.method public total()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/esotericsoftware/kryo/io/Input;->total:J

    .line 2
    .line 3
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 4
    .line 5
    int-to-long v2, p0

    .line 6
    add-long/2addr v0, v2

    .line 7
    return-wide v0
.end method
