.class public Lcom/esotericsoftware/kryo/io/ByteBufferInput;
.super Lcom/esotericsoftware/kryo/io/Input;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static final nativeOrder:Ljava/nio/ByteOrder;


# instance fields
.field protected byteBuffer:Ljava/nio/ByteBuffer;

.field private tempBuffer:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->nativeOrder:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Input;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Input;-><init>()V

    .line 29
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 30
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    const/16 v0, 0x1000

    .line 35
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;-><init>(I)V

    if-eqz p1, :cond_0

    .line 36
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Input;->inputStream:Ljava/io/InputStream;

    return-void

    .line 37
    :cond_0
    const-string p0, "inputStream cannot be null."

    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .line 38
    invoke-direct {p0, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;-><init>(I)V

    if-eqz p1, :cond_0

    .line 39
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Input;->inputStream:Ljava/io/InputStream;

    return-void

    .line 40
    :cond_0
    const-string p0, "inputStream cannot be null."

    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Input;-><init>()V

    .line 34
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->setBuffer(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    const/4 v0, 0x0

    .line 31
    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;-><init>([BII)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Input;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    array-length p2, p1

    .line 7
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->flipBuffer(Ljava/nio/Buffer;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->setBuffer(Ljava/nio/ByteBuffer;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p0, "bytes cannot be null."

    .line 22
    .line 23
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    throw p0
.end method

.method private flipBuffer(Ljava/nio/Buffer;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->flip()Ljava/nio/Buffer;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getBufferPosition(Ljava/nio/Buffer;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private readAsciiString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 7
    .line 8
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 9
    .line 10
    sub-int/2addr v3, v4

    .line 11
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v4, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    and-int/lit16 v6, v5, 0x80

    .line 24
    .line 25
    const/16 v7, 0x80

    .line 26
    .line 27
    if-ne v6, v7, :cond_0

    .line 28
    .line 29
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 34
    .line 35
    and-int/lit8 p0, v5, 0x7f

    .line 36
    .line 37
    int-to-char p0, p0

    .line 38
    aput-char p0, v0, v4

    .line 39
    .line 40
    new-instance p0, Ljava/lang/String;

    .line 41
    .line 42
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    invoke-direct {p0, v0, v3, v4}, Ljava/lang/String;-><init>([CII)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_0
    int-to-char v5, v5

    .line 49
    aput-char v5, v0, v4

    .line 50
    .line 51
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 59
    .line 60
    invoke-direct {p0, v4}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readAscii_slow(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method private readAscii_slow(I)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

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
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 16
    .line 17
    add-int/2addr v2, v4

    .line 18
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    array-length v3, v0

    .line 25
    const/4 v5, 0x0

    .line 26
    if-ne p1, v3, :cond_1

    .line 27
    .line 28
    mul-int/lit8 v3, p1, 0x2

    .line 29
    .line 30
    new-array v3, v3, [C

    .line 31
    .line 32
    invoke-static {v0, v5, v3, v5, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    iput-object v3, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 36
    .line 37
    move-object v0, v3

    .line 38
    :cond_1
    and-int/lit16 v3, v2, 0x80

    .line 39
    .line 40
    const/16 v6, 0x80

    .line 41
    .line 42
    if-ne v3, v6, :cond_2

    .line 43
    .line 44
    and-int/lit8 p0, v2, 0x7f

    .line 45
    .line 46
    int-to-char p0, p0

    .line 47
    aput-char p0, v0, p1

    .line 48
    .line 49
    new-instance p0, Ljava/lang/String;

    .line 50
    .line 51
    add-int/2addr p1, v4

    .line 52
    invoke-direct {p0, v0, v5, p1}, Ljava/lang/String;-><init>([CII)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_2
    add-int/lit8 v3, p1, 0x1

    .line 57
    .line 58
    int-to-char v2, v2

    .line 59
    aput-char v2, v0, p1

    .line 60
    .line 61
    move p1, v3

    .line 62
    goto :goto_0
.end method

.method private readUtf8Chars(I)V
    .locals 6

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
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 11
    .line 12
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

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
    const/4 v3, 0x0

    .line 24
    :goto_0
    if-ge v3, v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-gez v4, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    add-int/lit8 v5, v3, 0x1

    .line 34
    .line 35
    int-to-char v4, v4

    .line 36
    aput-char v4, v0, v3

    .line 37
    .line 38
    move v3, v5

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    :goto_1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 41
    .line 42
    add-int/2addr v0, v3

    .line 43
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 44
    .line 45
    if-ge v3, p1, :cond_3

    .line 46
    .line 47
    invoke-direct {p0, v1, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, p1, v3}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readUtf8Chars_slow(II)V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method private readUtf8Chars_slow(II)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

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
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 15
    .line 16
    .line 17
    :cond_0
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    add-int/2addr v2, v4

    .line 20
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    and-int/lit16 v3, v2, 0xff

    .line 27
    .line 28
    shr-int/lit8 v5, v3, 0x4

    .line 29
    .line 30
    packed-switch v5, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    :pswitch_0
    goto :goto_1

    .line 34
    :pswitch_1
    const/4 v3, 0x2

    .line 35
    invoke-virtual {p0, v3}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 36
    .line 37
    .line 38
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 39
    .line 40
    add-int/2addr v4, v3

    .line 41
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    and-int/lit8 v2, v2, 0xf

    .line 52
    .line 53
    shl-int/lit8 v2, v2, 0xc

    .line 54
    .line 55
    and-int/lit8 v3, v3, 0x3f

    .line 56
    .line 57
    shl-int/lit8 v3, v3, 0x6

    .line 58
    .line 59
    or-int/2addr v2, v3

    .line 60
    and-int/lit8 v3, v4, 0x3f

    .line 61
    .line 62
    or-int/2addr v2, v3

    .line 63
    int-to-char v2, v2

    .line 64
    aput-char v2, v1, p2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :pswitch_2
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 68
    .line 69
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 70
    .line 71
    if-ne v3, v5, :cond_1

    .line 72
    .line 73
    invoke-virtual {p0, v4}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 74
    .line 75
    .line 76
    :cond_1
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 77
    .line 78
    add-int/2addr v3, v4

    .line 79
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 80
    .line 81
    and-int/lit8 v2, v2, 0x1f

    .line 82
    .line 83
    shl-int/lit8 v2, v2, 0x6

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    and-int/lit8 v3, v3, 0x3f

    .line 90
    .line 91
    or-int/2addr v2, v3

    .line 92
    int-to-char v2, v2

    .line 93
    aput-char v2, v1, p2

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :pswitch_3
    int-to-char v2, v3

    .line 97
    aput-char v2, v1, p2

    .line 98
    .line 99
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    return-void

    .line 103
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
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit8 v2, v0, 0x3f

    .line 14
    .line 15
    and-int/lit8 v0, v0, 0x40

    .line 16
    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 20
    .line 21
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 22
    .line 23
    if-ne v0, v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 26
    .line 27
    .line 28
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 29
    .line 30
    add-int/2addr v0, v1

    .line 31
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 32
    .line 33
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    and-int/lit8 v4, v3, 0x7f

    .line 40
    .line 41
    shl-int/lit8 v4, v4, 0x6

    .line 42
    .line 43
    or-int/2addr v2, v4

    .line 44
    and-int/lit16 v3, v3, 0x80

    .line 45
    .line 46
    if-eqz v3, :cond_4

    .line 47
    .line 48
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 49
    .line 50
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 51
    .line 52
    if-ne v3, v4, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 55
    .line 56
    .line 57
    :cond_1
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 58
    .line 59
    add-int/2addr v3, v1

    .line 60
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    and-int/lit8 v4, v3, 0x7f

    .line 67
    .line 68
    shl-int/lit8 v4, v4, 0xd

    .line 69
    .line 70
    or-int/2addr v2, v4

    .line 71
    and-int/lit16 v3, v3, 0x80

    .line 72
    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 76
    .line 77
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 78
    .line 79
    if-ne v3, v4, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 82
    .line 83
    .line 84
    :cond_2
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 85
    .line 86
    add-int/2addr v3, v1

    .line 87
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    and-int/lit8 v4, v3, 0x7f

    .line 94
    .line 95
    shl-int/lit8 v4, v4, 0x14

    .line 96
    .line 97
    or-int/2addr v2, v4

    .line 98
    and-int/lit16 v3, v3, 0x80

    .line 99
    .line 100
    if-eqz v3, :cond_4

    .line 101
    .line 102
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 103
    .line 104
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 105
    .line 106
    if-ne v3, v4, :cond_3

    .line 107
    .line 108
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 109
    .line 110
    .line 111
    :cond_3
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 112
    .line 113
    add-int/2addr v3, v1

    .line 114
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    and-int/lit8 p0, p0, 0x7f

    .line 121
    .line 122
    shl-int/lit8 p0, p0, 0x1b

    .line 123
    .line 124
    or-int/2addr v2, p0

    .line 125
    :cond_4
    if-eqz p1, :cond_5

    .line 126
    .line 127
    return v2

    .line 128
    :cond_5
    ushr-int/lit8 p0, v2, 0x1

    .line 129
    .line 130
    and-int/lit8 p1, v2, 0x1

    .line 131
    .line 132
    neg-int p1, p1

    .line 133
    xor-int/2addr p0, p1

    .line 134
    return p0
.end method

.method private readVarInt_slow(Z)I
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit8 v2, v0, 0x7f

    .line 14
    .line 15
    and-int/lit16 v0, v0, 0x80

    .line 16
    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 20
    .line 21
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 22
    .line 23
    if-ne v0, v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 31
    .line 32
    add-int/2addr v3, v1

    .line 33
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    and-int/lit8 v4, v3, 0x7f

    .line 40
    .line 41
    shl-int/lit8 v4, v4, 0x7

    .line 42
    .line 43
    or-int/2addr v2, v4

    .line 44
    and-int/lit16 v3, v3, 0x80

    .line 45
    .line 46
    if-eqz v3, :cond_4

    .line 47
    .line 48
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 49
    .line 50
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 51
    .line 52
    if-ne v3, v4, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 55
    .line 56
    .line 57
    :cond_1
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 58
    .line 59
    add-int/2addr v3, v1

    .line 60
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    and-int/lit8 v4, v3, 0x7f

    .line 67
    .line 68
    shl-int/lit8 v4, v4, 0xe

    .line 69
    .line 70
    or-int/2addr v2, v4

    .line 71
    and-int/lit16 v3, v3, 0x80

    .line 72
    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 76
    .line 77
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 78
    .line 79
    if-ne v3, v4, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 82
    .line 83
    .line 84
    :cond_2
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 85
    .line 86
    add-int/2addr v3, v1

    .line 87
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    and-int/lit8 v4, v3, 0x7f

    .line 94
    .line 95
    shl-int/lit8 v4, v4, 0x15

    .line 96
    .line 97
    or-int/2addr v2, v4

    .line 98
    and-int/lit16 v3, v3, 0x80

    .line 99
    .line 100
    if-eqz v3, :cond_4

    .line 101
    .line 102
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 103
    .line 104
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 105
    .line 106
    if-ne v3, v4, :cond_3

    .line 107
    .line 108
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 109
    .line 110
    .line 111
    :cond_3
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 112
    .line 113
    add-int/2addr v3, v1

    .line 114
    iput v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    and-int/lit8 p0, p0, 0x7f

    .line 121
    .line 122
    shl-int/lit8 p0, p0, 0x1c

    .line 123
    .line 124
    or-int/2addr v2, p0

    .line 125
    :cond_4
    if-eqz p1, :cond_5

    .line 126
    .line 127
    return v2

    .line 128
    :cond_5
    ushr-int/lit8 p0, v2, 0x1

    .line 129
    .line 130
    and-int/lit8 p1, v2, 0x1

    .line 131
    .line 132
    neg-int p1, p1

    .line 133
    xor-int/2addr p0, p1

    .line 134
    return p0
.end method

.method private readVarLong_slow(Z)J
    .locals 8

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit8 v2, v0, 0x7f

    .line 14
    .line 15
    int-to-long v2, v2

    .line 16
    and-int/lit16 v0, v0, 0x80

    .line 17
    .line 18
    if-eqz v0, :cond_8

    .line 19
    .line 20
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 21
    .line 22
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 23
    .line 24
    if-ne v0, v4, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 32
    .line 33
    add-int/2addr v4, v1

    .line 34
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    and-int/lit8 v5, v4, 0x7f

    .line 41
    .line 42
    shl-int/lit8 v5, v5, 0x7

    .line 43
    .line 44
    int-to-long v5, v5

    .line 45
    or-long/2addr v2, v5

    .line 46
    and-int/lit16 v4, v4, 0x80

    .line 47
    .line 48
    if-eqz v4, :cond_8

    .line 49
    .line 50
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 51
    .line 52
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 53
    .line 54
    if-ne v4, v5, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 57
    .line 58
    .line 59
    :cond_1
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 60
    .line 61
    add-int/2addr v4, v1

    .line 62
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    and-int/lit8 v5, v4, 0x7f

    .line 69
    .line 70
    shl-int/lit8 v5, v5, 0xe

    .line 71
    .line 72
    int-to-long v5, v5

    .line 73
    or-long/2addr v2, v5

    .line 74
    and-int/lit16 v4, v4, 0x80

    .line 75
    .line 76
    if-eqz v4, :cond_8

    .line 77
    .line 78
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 79
    .line 80
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 81
    .line 82
    if-ne v4, v5, :cond_2

    .line 83
    .line 84
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 85
    .line 86
    .line 87
    :cond_2
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 88
    .line 89
    add-int/2addr v4, v1

    .line 90
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    and-int/lit8 v5, v4, 0x7f

    .line 97
    .line 98
    shl-int/lit8 v5, v5, 0x15

    .line 99
    .line 100
    int-to-long v5, v5

    .line 101
    or-long/2addr v2, v5

    .line 102
    and-int/lit16 v4, v4, 0x80

    .line 103
    .line 104
    if-eqz v4, :cond_8

    .line 105
    .line 106
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 107
    .line 108
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 109
    .line 110
    if-ne v4, v5, :cond_3

    .line 111
    .line 112
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 113
    .line 114
    .line 115
    :cond_3
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 116
    .line 117
    add-int/2addr v4, v1

    .line 118
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    and-int/lit8 v5, v4, 0x7f

    .line 125
    .line 126
    int-to-long v5, v5

    .line 127
    const/16 v7, 0x1c

    .line 128
    .line 129
    shl-long/2addr v5, v7

    .line 130
    or-long/2addr v2, v5

    .line 131
    and-int/lit16 v4, v4, 0x80

    .line 132
    .line 133
    if-eqz v4, :cond_8

    .line 134
    .line 135
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 136
    .line 137
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 138
    .line 139
    if-ne v4, v5, :cond_4

    .line 140
    .line 141
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 142
    .line 143
    .line 144
    :cond_4
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 145
    .line 146
    add-int/2addr v4, v1

    .line 147
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    and-int/lit8 v5, v4, 0x7f

    .line 154
    .line 155
    int-to-long v5, v5

    .line 156
    const/16 v7, 0x23

    .line 157
    .line 158
    shl-long/2addr v5, v7

    .line 159
    or-long/2addr v2, v5

    .line 160
    and-int/lit16 v4, v4, 0x80

    .line 161
    .line 162
    if-eqz v4, :cond_8

    .line 163
    .line 164
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 165
    .line 166
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 167
    .line 168
    if-ne v4, v5, :cond_5

    .line 169
    .line 170
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 171
    .line 172
    .line 173
    :cond_5
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 174
    .line 175
    add-int/2addr v4, v1

    .line 176
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    and-int/lit8 v5, v4, 0x7f

    .line 183
    .line 184
    int-to-long v5, v5

    .line 185
    const/16 v7, 0x2a

    .line 186
    .line 187
    shl-long/2addr v5, v7

    .line 188
    or-long/2addr v2, v5

    .line 189
    and-int/lit16 v4, v4, 0x80

    .line 190
    .line 191
    if-eqz v4, :cond_8

    .line 192
    .line 193
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 194
    .line 195
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 196
    .line 197
    if-ne v4, v5, :cond_6

    .line 198
    .line 199
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 200
    .line 201
    .line 202
    :cond_6
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 203
    .line 204
    add-int/2addr v4, v1

    .line 205
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    and-int/lit8 v5, v4, 0x7f

    .line 212
    .line 213
    int-to-long v5, v5

    .line 214
    const/16 v7, 0x31

    .line 215
    .line 216
    shl-long/2addr v5, v7

    .line 217
    or-long/2addr v2, v5

    .line 218
    and-int/lit16 v4, v4, 0x80

    .line 219
    .line 220
    if-eqz v4, :cond_8

    .line 221
    .line 222
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 223
    .line 224
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 225
    .line 226
    if-ne v4, v5, :cond_7

    .line 227
    .line 228
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 229
    .line 230
    .line 231
    :cond_7
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 232
    .line 233
    add-int/2addr v4, v1

    .line 234
    iput v4, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 237
    .line 238
    .line 239
    move-result p0

    .line 240
    int-to-long v4, p0

    .line 241
    const/16 p0, 0x38

    .line 242
    .line 243
    shl-long/2addr v4, p0

    .line 244
    or-long/2addr v2, v4

    .line 245
    :cond_8
    if-eqz p1, :cond_9

    .line 246
    .line 247
    return-wide v2

    .line 248
    :cond_9
    ushr-long p0, v2, v1

    .line 249
    .line 250
    const-wide/16 v0, 0x1

    .line 251
    .line 252
    and-long/2addr v0, v2

    .line 253
    neg-long v0, v0

    .line 254
    xor-long/2addr p0, v0

    .line 255
    return-wide p0
.end method

.method private setBufferLimit(Ljava/nio/Buffer;I)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private setBufferPosition(Ljava/nio/Buffer;I)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
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
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->optional(I)I

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
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    add-int/lit8 v4, v0, 0x1

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    and-int/lit16 v5, v5, 0x80

    .line 32
    .line 33
    if-nez v5, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    if-ne v4, v3, :cond_3

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    add-int/lit8 v5, v0, 0x2

    .line 40
    .line 41
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    and-int/lit16 v4, v4, 0x80

    .line 46
    .line 47
    if-nez v4, :cond_4

    .line 48
    .line 49
    return v1

    .line 50
    :cond_4
    if-ne v5, v3, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    add-int/lit8 v4, v0, 0x3

    .line 54
    .line 55
    invoke-virtual {p0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    and-int/lit16 v5, v5, 0x80

    .line 60
    .line 61
    if-nez v5, :cond_6

    .line 62
    .line 63
    return v1

    .line 64
    :cond_6
    if-ne v4, v3, :cond_7

    .line 65
    .line 66
    return v2

    .line 67
    :cond_7
    add-int/lit8 v0, v0, 0x4

    .line 68
    .line 69
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    and-int/lit16 p0, p0, 0x80

    .line 74
    .line 75
    if-nez p0, :cond_8

    .line 76
    .line 77
    return v1

    .line 78
    :cond_8
    if-ne v0, v3, :cond_9

    .line 79
    .line 80
    return v2

    .line 81
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
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->optional(I)I

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
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    add-int/lit8 v4, v0, 0x1

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    and-int/lit16 v5, v5, 0x80

    .line 34
    .line 35
    if-nez v5, :cond_2

    .line 36
    .line 37
    return v2

    .line 38
    :cond_2
    if-ne v4, v3, :cond_3

    .line 39
    .line 40
    return v1

    .line 41
    :cond_3
    add-int/lit8 v5, v0, 0x2

    .line 42
    .line 43
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    and-int/lit16 v4, v4, 0x80

    .line 48
    .line 49
    if-nez v4, :cond_4

    .line 50
    .line 51
    return v2

    .line 52
    :cond_4
    if-ne v5, v3, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    add-int/lit8 v4, v0, 0x3

    .line 56
    .line 57
    invoke-virtual {p0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    and-int/lit16 v5, v5, 0x80

    .line 62
    .line 63
    if-nez v5, :cond_6

    .line 64
    .line 65
    return v2

    .line 66
    :cond_6
    if-ne v4, v3, :cond_7

    .line 67
    .line 68
    return v1

    .line 69
    :cond_7
    add-int/lit8 v5, v0, 0x4

    .line 70
    .line 71
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    and-int/lit16 v4, v4, 0x80

    .line 76
    .line 77
    if-nez v4, :cond_8

    .line 78
    .line 79
    return v2

    .line 80
    :cond_8
    if-ne v5, v3, :cond_9

    .line 81
    .line 82
    return v1

    .line 83
    :cond_9
    add-int/lit8 v4, v0, 0x5

    .line 84
    .line 85
    invoke-virtual {p0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    and-int/lit16 v5, v5, 0x80

    .line 90
    .line 91
    if-nez v5, :cond_a

    .line 92
    .line 93
    return v2

    .line 94
    :cond_a
    if-ne v4, v3, :cond_b

    .line 95
    .line 96
    return v1

    .line 97
    :cond_b
    add-int/lit8 v5, v0, 0x6

    .line 98
    .line 99
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    and-int/lit16 v4, v4, 0x80

    .line 104
    .line 105
    if-nez v4, :cond_c

    .line 106
    .line 107
    return v2

    .line 108
    :cond_c
    if-ne v5, v3, :cond_d

    .line 109
    .line 110
    return v1

    .line 111
    :cond_d
    add-int/lit8 v4, v0, 0x7

    .line 112
    .line 113
    invoke-virtual {p0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    and-int/lit16 v5, v5, 0x80

    .line 118
    .line 119
    if-nez v5, :cond_e

    .line 120
    .line 121
    return v2

    .line 122
    :cond_e
    if-ne v4, v3, :cond_f

    .line 123
    .line 124
    return v1

    .line 125
    :cond_f
    add-int/lit8 v0, v0, 0x8

    .line 126
    .line 127
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    and-int/lit16 p0, p0, 0x80

    .line 132
    .line 133
    if-nez p0, :cond_10

    .line 134
    .line 135
    return v2

    .line 136
    :cond_10
    if-ne v0, v3, :cond_11

    .line 137
    .line 138
    return v1

    .line 139
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

.method public fill(Ljava/nio/ByteBuffer;II)I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/Input;->inputStream:Ljava/io/InputStream;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->tempBuffer:[B

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const/16 v0, 0x800

    .line 12
    .line 13
    new-array v0, v0, [B

    .line 14
    .line 15
    iput-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->tempBuffer:[B

    .line 16
    .line 17
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    move v0, p2

    .line 22
    :goto_0
    if-lez p3, :cond_3

    .line 23
    .line 24
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/Input;->inputStream:Ljava/io/InputStream;

    .line 25
    .line 26
    iget-object v3, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->tempBuffer:[B

    .line 27
    .line 28
    array-length v4, v3

    .line 29
    invoke-static {v4, p3}, Ljava/lang/Math;->min(II)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {v2, v3, p2, v4}, Ljava/io/InputStream;->read([BII)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-ne v2, v1, :cond_2

    .line 38
    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    return v1

    .line 42
    :cond_2
    iget-object v3, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->tempBuffer:[B

    .line 43
    .line 44
    invoke-virtual {p1, v3, p2, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    sub-int/2addr p3, v2

    .line 48
    add-int/2addr v0, v2

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    return v0

    .line 51
    :catch_0
    move-exception p0

    .line 52
    new-instance p1, Lcom/esotericsoftware/kryo/KryoException;

    .line 53
    .line 54
    invoke-direct {p1, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    throw p1
.end method

.method public getBuffer()[B
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "This input does not used a byte[], see #getByteBuffer()."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public getByteBuffer()Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    return-object p0
.end method

.method public optional(I)I
    .locals 7

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
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

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
    invoke-virtual {p0, v1, v2, v3}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->fill(Ljava/nio/ByteBuffer;II)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 29
    .line 30
    invoke-direct {p0, v2, v3}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 31
    .line 32
    .line 33
    const/4 v2, -0x1

    .line 34
    if-ne v1, v2, :cond_2

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    return v2

    .line 39
    :cond_1
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    :cond_2
    add-int/2addr v0, v1

    .line 45
    if-lt v0, p1, :cond_3

    .line 46
    .line 47
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 48
    .line 49
    add-int/2addr v0, v1

    .line 50
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 51
    .line 52
    return p1

    .line 53
    :cond_3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    .line 58
    iget-wide v3, p0, Lcom/esotericsoftware/kryo/io/Input;->total:J

    .line 59
    .line 60
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 61
    .line 62
    int-to-long v5, v1

    .line 63
    add-long/2addr v3, v5

    .line 64
    iput-wide v3, p0, Lcom/esotericsoftware/kryo/io/Input;->total:J

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 68
    .line 69
    :cond_4
    iget-object v3, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    iget v4, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 72
    .line 73
    sub-int/2addr v4, v0

    .line 74
    invoke-virtual {p0, v3, v0, v4}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->fill(Ljava/nio/ByteBuffer;II)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-ne v3, v2, :cond_5

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    add-int/2addr v0, v3

    .line 82
    if-lt v0, p1, :cond_4

    .line 83
    .line 84
    :goto_0
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 85
    .line 86
    iget-object v3, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    invoke-direct {p0, v3, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 89
    .line 90
    .line 91
    if-nez v0, :cond_6

    .line 92
    .line 93
    return v2

    .line 94
    :cond_6
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    return p0
.end method

.method public read()I
    .locals 2

    const/4 v0, 0x1

    .line 54
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->optional(I)I

    move-result v1

    if-gtz v1, :cond_0

    const/4 p0, -0x1

    return p0

    .line 55
    :cond_0
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 56
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 53
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->read([BII)I

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
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    invoke-virtual {v2, p1, p2, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 19
    .line 20
    add-int/2addr v2, v0

    .line 21
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 22
    .line 23
    sub-int/2addr v1, v0

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    add-int/2addr p2, v0

    .line 28
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->optional(I)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v2, -0x1

    .line 33
    if-ne v0, v2, :cond_2

    .line 34
    .line 35
    if-ne p3, v1, :cond_3

    .line 36
    .line 37
    return v2

    .line 38
    :cond_2
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 39
    .line 40
    iget v3, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 41
    .line 42
    if-ne v2, v3, :cond_0

    .line 43
    .line 44
    :cond_3
    :goto_0
    sub-int/2addr p3, v1

    .line 45
    return p3

    .line 46
    :cond_4
    const-string p0, "bytes cannot be null."

    .line 47
    .line 48
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public readBoolean()Z
    .locals 3

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
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 9
    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 12
    .line 13
    add-int/2addr v0, v2

    .line 14
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 15
    .line 16
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-ne p0, v2, :cond_1

    .line 23
    .line 24
    return v2

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public readBooleans(I)[Z
    .locals 5

    .line 1
    new-array v0, p1, [Z

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->optional(I)I

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
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move v4, v2

    .line 24
    :goto_1
    aput-boolean v4, v0, v3

    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_2
    :goto_2
    if-ge v2, p1, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readBoolean()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    aput-boolean v1, v0, v2

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_2

    .line 47
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
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 9
    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 12
    .line 13
    add-int/2addr v0, v2

    .line 14
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 15
    .line 16
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
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
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 9
    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 12
    .line 13
    add-int/2addr v0, v2

    .line 14
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 15
    .line 16
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    and-int/lit16 p0, p0, 0xff

    .line 23
    .line 24
    return p0
.end method

.method public readBytes([BII)V
    .locals 2

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
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    invoke-virtual {v1, p1, p2, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 18
    .line 19
    add-int/2addr v1, v0

    .line 20
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 21
    .line 22
    sub-int/2addr p3, v0

    .line 23
    if-nez p3, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    add-int/2addr p2, v0

    .line 27
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 28
    .line 29
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string p0, "bytes cannot be null."

    .line 38
    .line 39
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public readBytes(I)[B
    .locals 2

    .line 43
    new-array v0, p1, [B

    const/4 v1, 0x0

    .line 44
    invoke-virtual {p0, v0, v1, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readBytes([BII)V

    return-object v0
.end method

.method public readChar()C
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 3
    .line 4
    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 6
    .line 7
    add-int/2addr v1, v0

    .line 8
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    and-int/lit16 v0, v0, 0xff

    .line 17
    .line 18
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    and-int/lit16 p0, p0, 0xff

    .line 25
    .line 26
    shl-int/lit8 p0, p0, 0x8

    .line 27
    .line 28
    or-int/2addr p0, v0

    .line 29
    int-to-char p0, p0

    .line 30
    return p0
.end method

.method public readChars(I)[C
    .locals 5

    .line 1
    new-array v0, p1, [C

    .line 2
    .line 3
    shl-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->optional(I)I

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
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    :goto_0
    if-ge v3, p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    and-int/lit16 v2, v2, 0xff

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    and-int/lit16 v4, v4, 0xff

    .line 27
    .line 28
    shl-int/lit8 v4, v4, 0x8

    .line 29
    .line 30
    or-int/2addr v2, v4

    .line 31
    int-to-char v2, v2

    .line 32
    aput-char v2, v0, v3

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_1
    :goto_1
    if-ge v3, p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readChar()C

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    aput-char v1, v0, v3

    .line 51
    .line 52
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    return-object v0
.end method

.method public readDouble()D
    .locals 6

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 9
    .line 10
    add-int/2addr v2, v0

    .line 11
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    and-int/lit16 p0, p0, 0xff

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    and-int/lit16 v2, v2, 0xff

    .line 24
    .line 25
    shl-int/lit8 v0, v2, 0x8

    .line 26
    .line 27
    or-int/2addr p0, v0

    .line 28
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    and-int/lit16 v0, v0, 0xff

    .line 33
    .line 34
    shl-int/lit8 v0, v0, 0x10

    .line 35
    .line 36
    or-int/2addr p0, v0

    .line 37
    int-to-long v2, p0

    .line 38
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    and-int/lit16 p0, p0, 0xff

    .line 43
    .line 44
    int-to-long v4, p0

    .line 45
    const/16 p0, 0x18

    .line 46
    .line 47
    shl-long/2addr v4, p0

    .line 48
    or-long/2addr v2, v4

    .line 49
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    and-int/lit16 p0, p0, 0xff

    .line 54
    .line 55
    int-to-long v4, p0

    .line 56
    const/16 p0, 0x20

    .line 57
    .line 58
    shl-long/2addr v4, p0

    .line 59
    or-long/2addr v2, v4

    .line 60
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    and-int/lit16 p0, p0, 0xff

    .line 65
    .line 66
    int-to-long v4, p0

    .line 67
    const/16 p0, 0x28

    .line 68
    .line 69
    shl-long/2addr v4, p0

    .line 70
    or-long/2addr v2, v4

    .line 71
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    and-int/lit16 p0, p0, 0xff

    .line 76
    .line 77
    int-to-long v4, p0

    .line 78
    const/16 p0, 0x30

    .line 79
    .line 80
    shl-long/2addr v4, p0

    .line 81
    or-long/2addr v2, v4

    .line 82
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    int-to-long v0, p0

    .line 87
    const/16 p0, 0x38

    .line 88
    .line 89
    shl-long/2addr v0, p0

    .line 90
    or-long/2addr v0, v2

    .line 91
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    return-wide v0
.end method

.method public readDoubles(I)[D
    .locals 8

    .line 1
    new-array v0, p1, [D

    .line 2
    .line 3
    shl-int/lit8 v1, p1, 0x3

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->optional(I)I

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
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    :goto_0
    if-ge v3, p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    and-int/lit16 v2, v2, 0xff

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    and-int/lit16 v4, v4, 0xff

    .line 27
    .line 28
    shl-int/lit8 v4, v4, 0x8

    .line 29
    .line 30
    or-int/2addr v2, v4

    .line 31
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    and-int/lit16 v4, v4, 0xff

    .line 36
    .line 37
    shl-int/lit8 v4, v4, 0x10

    .line 38
    .line 39
    or-int/2addr v2, v4

    .line 40
    int-to-long v4, v2

    .line 41
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    and-int/lit16 v2, v2, 0xff

    .line 46
    .line 47
    int-to-long v6, v2

    .line 48
    const/16 v2, 0x18

    .line 49
    .line 50
    shl-long/2addr v6, v2

    .line 51
    or-long/2addr v4, v6

    .line 52
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    and-int/lit16 v2, v2, 0xff

    .line 57
    .line 58
    int-to-long v6, v2

    .line 59
    const/16 v2, 0x20

    .line 60
    .line 61
    shl-long/2addr v6, v2

    .line 62
    or-long/2addr v4, v6

    .line 63
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    and-int/lit16 v2, v2, 0xff

    .line 68
    .line 69
    int-to-long v6, v2

    .line 70
    const/16 v2, 0x28

    .line 71
    .line 72
    shl-long/2addr v6, v2

    .line 73
    or-long/2addr v4, v6

    .line 74
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    and-int/lit16 v2, v2, 0xff

    .line 79
    .line 80
    int-to-long v6, v2

    .line 81
    const/16 v2, 0x30

    .line 82
    .line 83
    shl-long/2addr v6, v2

    .line 84
    or-long/2addr v4, v6

    .line 85
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    int-to-long v6, v2

    .line 90
    const/16 v2, 0x38

    .line 91
    .line 92
    shl-long/2addr v6, v2

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
    goto :goto_0

    .line 103
    :cond_0
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_1
    :goto_1
    if-ge v3, p1, :cond_2

    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readDouble()D

    .line 113
    .line 114
    .line 115
    move-result-wide v1

    .line 116
    aput-wide v1, v0, v3

    .line 117
    .line 118
    add-int/lit8 v3, v3, 0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    return-object v0
.end method

.method public readFloat()F
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 8
    .line 9
    add-int/2addr v2, v0

    .line 10
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    and-int/lit16 p0, p0, 0xff

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    and-int/lit16 v0, v0, 0xff

    .line 23
    .line 24
    shl-int/lit8 v0, v0, 0x8

    .line 25
    .line 26
    or-int/2addr p0, v0

    .line 27
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    and-int/lit16 v0, v0, 0xff

    .line 32
    .line 33
    shl-int/lit8 v0, v0, 0x10

    .line 34
    .line 35
    or-int/2addr p0, v0

    .line 36
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    and-int/lit16 v0, v0, 0xff

    .line 41
    .line 42
    shl-int/lit8 v0, v0, 0x18

    .line 43
    .line 44
    or-int/2addr p0, v0

    .line 45
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0
.end method

.method public readFloats(I)[F
    .locals 5

    .line 1
    new-array v0, p1, [F

    .line 2
    .line 3
    shl-int/lit8 v1, p1, 0x2

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->optional(I)I

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
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    :goto_0
    if-ge v3, p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    and-int/lit16 v2, v2, 0xff

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    and-int/lit16 v4, v4, 0xff

    .line 27
    .line 28
    shl-int/lit8 v4, v4, 0x8

    .line 29
    .line 30
    or-int/2addr v2, v4

    .line 31
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    and-int/lit16 v4, v4, 0xff

    .line 36
    .line 37
    shl-int/lit8 v4, v4, 0x10

    .line 38
    .line 39
    or-int/2addr v2, v4

    .line 40
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    and-int/lit16 v4, v4, 0xff

    .line 45
    .line 46
    shl-int/lit8 v4, v4, 0x18

    .line 47
    .line 48
    or-int/2addr v2, v4

    .line 49
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    aput v2, v0, v3

    .line 54
    .line 55
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_1
    :goto_1
    if-ge v3, p1, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readFloat()F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    aput v1, v0, v3

    .line 72
    .line 73
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    return-object v0
.end method

.method public readInt()I
    .locals 2

    const/4 v0, 0x4

    .line 110
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 111
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 112
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 113
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 114
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    .line 115
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    .line 116
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method public readInt(I)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_4

    .line 3
    .line 4
    const/4 v1, 0x4

    .line 5
    if-gt p1, v1, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 8
    .line 9
    .line 10
    iget v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 11
    .line 12
    add-int/2addr v2, p1

    .line 13
    iput v2, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 14
    .line 15
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq p1, v2, :cond_3

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    if-eq p1, v2, :cond_2

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    if-eq p1, v2, :cond_1

    .line 25
    .line 26
    if-ne p1, v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    shl-int/lit8 p1, p1, 0x18

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    and-int/lit16 v0, v0, 0xff

    .line 39
    .line 40
    shl-int/lit8 v0, v0, 0x10

    .line 41
    .line 42
    or-int/2addr p1, v0

    .line 43
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    and-int/lit16 v0, v0, 0xff

    .line 48
    .line 49
    shl-int/lit8 v0, v0, 0x8

    .line 50
    .line 51
    or-int/2addr p1, v0

    .line 52
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    :goto_0
    and-int/lit16 p0, p0, 0xff

    .line 57
    .line 58
    or-int/2addr p0, p1

    .line 59
    return p0

    .line 60
    :cond_0
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 61
    .line 62
    .line 63
    return v0

    .line 64
    :cond_1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    shl-int/lit8 p1, p1, 0x10

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    and-int/lit16 v0, v0, 0xff

    .line 75
    .line 76
    shl-int/lit8 v0, v0, 0x8

    .line 77
    .line 78
    or-int/2addr p1, v0

    .line 79
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    shl-int/lit8 p1, p1, 0x8

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    goto :goto_0

    .line 95
    :cond_3
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    return p0

    .line 100
    :cond_4
    const-string p0, "count must be >= 0 and <= 4: "

    .line 101
    .line 102
    invoke-static {p1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return v0
.end method

.method public readInts(I)[I
    .locals 5

    .line 1
    new-array v0, p1, [I

    .line 2
    .line 3
    shl-int/lit8 v1, p1, 0x2

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->optional(I)I

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
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    :goto_0
    if-ge v3, p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    and-int/lit16 v2, v2, 0xff

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    and-int/lit16 v4, v4, 0xff

    .line 27
    .line 28
    shl-int/lit8 v4, v4, 0x8

    .line 29
    .line 30
    or-int/2addr v2, v4

    .line 31
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    and-int/lit16 v4, v4, 0xff

    .line 36
    .line 37
    shl-int/lit8 v4, v4, 0x10

    .line 38
    .line 39
    or-int/2addr v2, v4

    .line 40
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    and-int/lit16 v4, v4, 0xff

    .line 45
    .line 46
    shl-int/lit8 v4, v4, 0x18

    .line 47
    .line 48
    or-int/2addr v2, v4

    .line 49
    aput v2, v0, v3

    .line 50
    .line 51
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_1
    :goto_1
    if-ge v3, p1, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readInt()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    aput v1, v0, v3

    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    return-object v0
.end method

.method public readLong()J
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 7
    .line 8
    add-int/2addr v1, v0

    .line 9
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 10
    .line 11
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    and-int/lit16 v1, v1, 0xff

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    and-int/lit16 v2, v2, 0xff

    .line 24
    .line 25
    shl-int/lit8 v0, v2, 0x8

    .line 26
    .line 27
    or-int/2addr v0, v1

    .line 28
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    and-int/lit16 v1, v1, 0xff

    .line 33
    .line 34
    shl-int/lit8 v1, v1, 0x10

    .line 35
    .line 36
    or-int/2addr v0, v1

    .line 37
    int-to-long v0, v0

    .line 38
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    and-int/lit16 v2, v2, 0xff

    .line 43
    .line 44
    int-to-long v2, v2

    .line 45
    const/16 v4, 0x18

    .line 46
    .line 47
    shl-long/2addr v2, v4

    .line 48
    or-long/2addr v0, v2

    .line 49
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    and-int/lit16 v2, v2, 0xff

    .line 54
    .line 55
    int-to-long v2, v2

    .line 56
    const/16 v4, 0x20

    .line 57
    .line 58
    shl-long/2addr v2, v4

    .line 59
    or-long/2addr v0, v2

    .line 60
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    and-int/lit16 v2, v2, 0xff

    .line 65
    .line 66
    int-to-long v2, v2

    .line 67
    const/16 v4, 0x28

    .line 68
    .line 69
    shl-long/2addr v2, v4

    .line 70
    or-long/2addr v0, v2

    .line 71
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    and-int/lit16 v2, v2, 0xff

    .line 76
    .line 77
    int-to-long v2, v2

    .line 78
    const/16 v4, 0x30

    .line 79
    .line 80
    shl-long/2addr v2, v4

    .line 81
    or-long/2addr v0, v2

    .line 82
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    int-to-long v2, p0

    .line 87
    const/16 p0, 0x38

    .line 88
    .line 89
    shl-long/2addr v2, p0

    .line 90
    or-long/2addr v0, v2

    .line 91
    return-wide v0
.end method

.method public readLongs(I)[J
    .locals 8

    .line 1
    new-array v0, p1, [J

    .line 2
    .line 3
    shl-int/lit8 v1, p1, 0x3

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->optional(I)I

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
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    :goto_0
    if-ge v3, p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    and-int/lit16 v2, v2, 0xff

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    and-int/lit16 v4, v4, 0xff

    .line 27
    .line 28
    shl-int/lit8 v4, v4, 0x8

    .line 29
    .line 30
    or-int/2addr v2, v4

    .line 31
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    and-int/lit16 v4, v4, 0xff

    .line 36
    .line 37
    shl-int/lit8 v4, v4, 0x10

    .line 38
    .line 39
    or-int/2addr v2, v4

    .line 40
    int-to-long v4, v2

    .line 41
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    and-int/lit16 v2, v2, 0xff

    .line 46
    .line 47
    int-to-long v6, v2

    .line 48
    const/16 v2, 0x18

    .line 49
    .line 50
    shl-long/2addr v6, v2

    .line 51
    or-long/2addr v4, v6

    .line 52
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    and-int/lit16 v2, v2, 0xff

    .line 57
    .line 58
    int-to-long v6, v2

    .line 59
    const/16 v2, 0x20

    .line 60
    .line 61
    shl-long/2addr v6, v2

    .line 62
    or-long/2addr v4, v6

    .line 63
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    and-int/lit16 v2, v2, 0xff

    .line 68
    .line 69
    int-to-long v6, v2

    .line 70
    const/16 v2, 0x28

    .line 71
    .line 72
    shl-long/2addr v6, v2

    .line 73
    or-long/2addr v4, v6

    .line 74
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    and-int/lit16 v2, v2, 0xff

    .line 79
    .line 80
    int-to-long v6, v2

    .line 81
    const/16 v2, 0x30

    .line 82
    .line 83
    shl-long/2addr v6, v2

    .line 84
    or-long/2addr v4, v6

    .line 85
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    int-to-long v6, v2

    .line 90
    const/16 v2, 0x38

    .line 91
    .line 92
    shl-long/2addr v6, v2

    .line 93
    or-long/2addr v4, v6

    .line 94
    aput-wide v4, v0, v3

    .line 95
    .line 96
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_1
    :goto_1
    if-ge v3, p1, :cond_2

    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readLong()J

    .line 109
    .line 110
    .line 111
    move-result-wide v1

    .line 112
    aput-wide v1, v0, v3

    .line 113
    .line 114
    add-int/lit8 v3, v3, 0x1

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_2
    return-object v0
.end method

.method public readShort()S
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 3
    .line 4
    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 6
    .line 7
    add-int/2addr v1, v0

    .line 8
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    and-int/lit16 v0, v0, 0xff

    .line 17
    .line 18
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    and-int/lit16 p0, p0, 0xff

    .line 25
    .line 26
    shl-int/lit8 p0, p0, 0x8

    .line 27
    .line 28
    or-int/2addr p0, v0

    .line 29
    int-to-short p0, p0

    .line 30
    return p0
.end method

.method public readShortUnsigned()I
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 3
    .line 4
    .line 5
    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 6
    .line 7
    add-int/2addr v1, v0

    .line 8
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    and-int/lit16 v0, v0, 0xff

    .line 17
    .line 18
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    and-int/lit16 p0, p0, 0xff

    .line 25
    .line 26
    shl-int/lit8 p0, p0, 0x8

    .line 27
    .line 28
    or-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public readShorts(I)[S
    .locals 5

    .line 1
    new-array v0, p1, [S

    .line 2
    .line 3
    shl-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->optional(I)I

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
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    :goto_0
    if-ge v3, p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    and-int/lit16 v2, v2, 0xff

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    and-int/lit16 v4, v4, 0xff

    .line 27
    .line 28
    shl-int/lit8 v4, v4, 0x8

    .line 29
    .line 30
    or-int/2addr v2, v4

    .line 31
    int-to-short v2, v2

    .line 32
    aput-short v2, v0, v3

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_1
    :goto_1
    if-ge v3, p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readShort()S

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    aput-short v1, v0, v3

    .line 51
    .line 52
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    return-object v0
.end method

.method public readString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readVarIntFlag()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readAsciiString()Ljava/lang/String;

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
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readVarIntFlag(Z)I

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
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readUtf8Chars(I)V

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
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readVarIntFlag()Z

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
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readAsciiString()Ljava/lang/String;

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
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readVarIntFlag(Z)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    if-eq v1, v0, :cond_1

    .line 25
    .line 26
    add-int/lit8 v1, v1, -0x1

    .line 27
    .line 28
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readUtf8Chars(I)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/Input;->chars:[C

    .line 37
    .line 38
    const/4 v2, 0x0

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
    const-string v0, ""

    .line 46
    .line 47
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    const/4 p0, 0x0

    .line 52
    return-object p0
.end method

.method public readVarInt(Z)I
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

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
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readVarInt_slow(Z)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    and-int/lit8 v2, v1, 0x7f

    .line 21
    .line 22
    and-int/lit16 v1, v1, 0x80

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    and-int/lit8 v4, v3, 0x7f

    .line 33
    .line 34
    shl-int/lit8 v4, v4, 0x7

    .line 35
    .line 36
    or-int/2addr v2, v4

    .line 37
    and-int/lit16 v3, v3, 0x80

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    and-int/lit8 v4, v3, 0x7f

    .line 46
    .line 47
    shl-int/lit8 v4, v4, 0xe

    .line 48
    .line 49
    or-int/2addr v2, v4

    .line 50
    and-int/lit16 v3, v3, 0x80

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    and-int/lit8 v4, v3, 0x7f

    .line 59
    .line 60
    shl-int/lit8 v4, v4, 0x15

    .line 61
    .line 62
    or-int/2addr v2, v4

    .line 63
    and-int/lit16 v3, v3, 0x80

    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    and-int/lit8 v1, v1, 0x7f

    .line 72
    .line 73
    shl-int/lit8 v1, v1, 0x1c

    .line 74
    .line 75
    or-int/2addr v2, v1

    .line 76
    :cond_1
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 77
    .line 78
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 83
    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    return v2

    .line 87
    :cond_2
    ushr-int/lit8 p0, v2, 0x1

    .line 88
    .line 89
    and-int/lit8 p1, v2, 0x1

    .line 90
    .line 91
    neg-int p1, p1

    .line 92
    xor-int/2addr p0, p1

    .line 93
    return p0
.end method

.method public readVarIntFlag(Z)I
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

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
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readVarIntFlag_slow(Z)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    and-int/lit8 v2, v1, 0x3f

    .line 21
    .line 22
    and-int/lit8 v1, v1, 0x40

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    and-int/lit8 v4, v3, 0x7f

    .line 33
    .line 34
    shl-int/lit8 v4, v4, 0x6

    .line 35
    .line 36
    or-int/2addr v2, v4

    .line 37
    and-int/lit16 v3, v3, 0x80

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    and-int/lit8 v4, v3, 0x7f

    .line 46
    .line 47
    shl-int/lit8 v4, v4, 0xd

    .line 48
    .line 49
    or-int/2addr v2, v4

    .line 50
    and-int/lit16 v3, v3, 0x80

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    and-int/lit8 v4, v3, 0x7f

    .line 59
    .line 60
    shl-int/lit8 v4, v4, 0x14

    .line 61
    .line 62
    or-int/2addr v2, v4

    .line 63
    and-int/lit16 v3, v3, 0x80

    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    and-int/lit8 v1, v1, 0x7f

    .line 72
    .line 73
    shl-int/lit8 v1, v1, 0x1b

    .line 74
    .line 75
    or-int/2addr v2, v1

    .line 76
    :cond_1
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 77
    .line 78
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 83
    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    return v2

    .line 87
    :cond_2
    ushr-int/lit8 p0, v2, 0x1

    .line 88
    .line 89
    and-int/lit8 p1, v2, 0x1

    .line 90
    .line 91
    neg-int p1, p1

    .line 92
    xor-int/2addr p0, p1

    .line 93
    return p0
.end method

.method public readVarIntFlag()Z
    .locals 3

    .line 94
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    iget v1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    iget p0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p0

    and-int/lit16 p0, p0, 0x80

    if-eqz p0, :cond_1

    return v2

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public readVarLong(Z)J
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->require(I)I

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
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->readVarLong_slow(Z)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit8 v2, v1, 0x7f

    .line 22
    .line 23
    int-to-long v2, v2

    .line 24
    and-int/lit16 v1, v1, 0x80

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    and-int/lit8 v5, v4, 0x7f

    .line 35
    .line 36
    shl-int/lit8 v5, v5, 0x7

    .line 37
    .line 38
    int-to-long v5, v5

    .line 39
    or-long/2addr v2, v5

    .line 40
    and-int/lit16 v4, v4, 0x80

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    and-int/lit8 v5, v4, 0x7f

    .line 49
    .line 50
    shl-int/lit8 v5, v5, 0xe

    .line 51
    .line 52
    int-to-long v5, v5

    .line 53
    or-long/2addr v2, v5

    .line 54
    and-int/lit16 v4, v4, 0x80

    .line 55
    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    and-int/lit8 v5, v4, 0x7f

    .line 63
    .line 64
    shl-int/lit8 v5, v5, 0x15

    .line 65
    .line 66
    int-to-long v5, v5

    .line 67
    or-long/2addr v2, v5

    .line 68
    and-int/lit16 v4, v4, 0x80

    .line 69
    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    and-int/lit8 v5, v4, 0x7f

    .line 77
    .line 78
    int-to-long v5, v5

    .line 79
    const/16 v7, 0x1c

    .line 80
    .line 81
    shl-long/2addr v5, v7

    .line 82
    or-long/2addr v2, v5

    .line 83
    and-int/lit16 v4, v4, 0x80

    .line 84
    .line 85
    if-eqz v4, :cond_1

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    and-int/lit8 v5, v4, 0x7f

    .line 92
    .line 93
    int-to-long v5, v5

    .line 94
    const/16 v7, 0x23

    .line 95
    .line 96
    shl-long/2addr v5, v7

    .line 97
    or-long/2addr v2, v5

    .line 98
    and-int/lit16 v4, v4, 0x80

    .line 99
    .line 100
    if-eqz v4, :cond_1

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    and-int/lit8 v5, v4, 0x7f

    .line 107
    .line 108
    int-to-long v5, v5

    .line 109
    const/16 v7, 0x2a

    .line 110
    .line 111
    shl-long/2addr v5, v7

    .line 112
    or-long/2addr v2, v5

    .line 113
    and-int/lit16 v4, v4, 0x80

    .line 114
    .line 115
    if-eqz v4, :cond_1

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    and-int/lit8 v5, v4, 0x7f

    .line 122
    .line 123
    int-to-long v5, v5

    .line 124
    const/16 v7, 0x31

    .line 125
    .line 126
    shl-long/2addr v5, v7

    .line 127
    or-long/2addr v2, v5

    .line 128
    and-int/lit16 v4, v4, 0x80

    .line 129
    .line 130
    if-eqz v4, :cond_1

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    int-to-long v4, v1

    .line 137
    const/16 v1, 0x38

    .line 138
    .line 139
    shl-long/2addr v4, v1

    .line 140
    or-long/2addr v2, v4

    .line 141
    :cond_1
    iget-object v1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 142
    .line 143
    invoke-direct {p0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->getBufferPosition(Ljava/nio/Buffer;)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 148
    .line 149
    if-eqz p1, :cond_2

    .line 150
    .line 151
    return-wide v2

    .line 152
    :cond_2
    ushr-long p0, v2, v0

    .line 153
    .line 154
    const-wide/16 v0, 0x1

    .line 155
    .line 156
    and-long/2addr v0, v2

    .line 157
    neg-long v0, v0

    .line 158
    xor-long/2addr p0, v0

    .line 159
    return-wide p0
.end method

.method public require(I)I
    .locals 9

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
    iget-object v5, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    sub-int/2addr v2, v0

    .line 22
    invoke-virtual {p0, v5, v0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->fill(Ljava/nio/ByteBuffer;II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eq v0, v4, :cond_1

    .line 27
    .line 28
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 31
    .line 32
    invoke-direct {p0, v2, v5}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 33
    .line 34
    .line 35
    add-int/2addr v1, v0

    .line 36
    if-lt v1, p1, :cond_2

    .line 37
    .line 38
    iget p1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 39
    .line 40
    add-int/2addr p1, v0

    .line 41
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 42
    .line 43
    return v1

    .line 44
    :cond_1
    new-instance p0, Lcom/esotericsoftware/kryo/io/KryoBufferUnderflowException;

    .line 45
    .line 46
    invoke-direct {p0, v3}, Lcom/esotericsoftware/kryo/io/KryoBufferUnderflowException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    .line 55
    iget-wide v5, p0, Lcom/esotericsoftware/kryo/io/Input;->total:J

    .line 56
    .line 57
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 58
    .line 59
    int-to-long v7, v0

    .line 60
    add-long/2addr v5, v7

    .line 61
    iput-wide v5, p0, Lcom/esotericsoftware/kryo/io/Input;->total:J

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 65
    .line 66
    :cond_3
    iget-object v2, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    iget v5, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 69
    .line 70
    sub-int/2addr v5, v1

    .line 71
    invoke-virtual {p0, v2, v1, v5}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->fill(Ljava/nio/ByteBuffer;II)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-ne v2, v4, :cond_5

    .line 76
    .line 77
    if-lt v1, p1, :cond_4

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    new-instance p0, Lcom/esotericsoftware/kryo/io/KryoBufferUnderflowException;

    .line 81
    .line 82
    invoke-direct {p0, v3}, Lcom/esotericsoftware/kryo/io/KryoBufferUnderflowException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p0

    .line 86
    :cond_5
    add-int/2addr v1, v2

    .line 87
    if-lt v1, p1, :cond_3

    .line 88
    .line 89
    :goto_0
    iput v1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 90
    .line 91
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 92
    .line 93
    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 94
    .line 95
    .line 96
    return v1

    .line 97
    :cond_6
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 98
    .line 99
    iget p0, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 100
    .line 101
    new-instance v1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v2, "Buffer too small: capacity: "

    .line 104
    .line 105
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string p0, ", required: "

    .line 112
    .line 113
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v0
.end method

.method public reset()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/esotericsoftware/kryo/io/Input;->reset()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setBuffer(Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->capacity:I

    .line 22
    .line 23
    const-wide/16 v0, 0x0

    .line 24
    .line 25
    iput-wide v0, p0, Lcom/esotericsoftware/kryo/io/Input;->total:J

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/Input;->inputStream:Ljava/io/InputStream;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string p0, "buffer cannot be null."

    .line 32
    .line 33
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public setBuffer([B)V
    .locals 0

    .line 38
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "This input does not used a byte[], see #setByteBuffer(ByteBuffer)."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setBuffer([BII)V
    .locals 0

    .line 37
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "This input does not used a byte[], see #setByteBufferByteBuffer()."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
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
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->reset()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setLimit(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-direct {p0, v0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->setBufferLimit(Ljava/nio/Buffer;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setPosition(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-direct {p0, v0, p1}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public skip(J)J
    .locals 4

    .line 1
    move-wide v0, p1

    .line 2
    :goto_0
    const-wide/16 v2, 0x0

    .line 3
    .line 4
    cmp-long v2, v0, v2

    .line 5
    .line 6
    if-lez v2, :cond_0

    .line 7
    .line 8
    const-wide/32 v2, 0x7ffffff7

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    long-to-int v2, v2

    .line 16
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->skip(I)V

    .line 17
    .line 18
    .line 19
    int-to-long v2, v2

    .line 20
    sub-long/2addr v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-wide p1
.end method

.method public skip(I)V
    .locals 1

    .line 23
    invoke-super {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->skip(I)V

    .line 24
    iget-object p1, p0, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->byteBuffer:Ljava/nio/ByteBuffer;

    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/io/ByteBufferInput;->setBufferPosition(Ljava/nio/Buffer;I)V

    return-void
.end method
