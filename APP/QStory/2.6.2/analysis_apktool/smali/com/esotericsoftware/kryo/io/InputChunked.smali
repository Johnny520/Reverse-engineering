.class public Lcom/esotericsoftware/kryo/io/InputChunked;
.super Lcom/esotericsoftware/kryo/io/Input;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private chunkSize:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Input;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;-><init>(I)V

    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;-><init>(Ljava/io/InputStream;)V

    const/4 p1, -0x1

    .line 11
    iput p1, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/Input;-><init>(Ljava/io/InputStream;I)V

    const/4 p1, -0x1

    .line 13
    iput p1, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    return-void
.end method

.method private readChunkSize()Z
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->getInputStream()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    :goto_0
    const/16 v4, 0x20

    .line 9
    .line 10
    if-ge v2, v4, :cond_3

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/4 v5, -0x1

    .line 17
    if-ne v4, v5, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    and-int/lit8 v5, v4, 0x7f

    .line 21
    .line 22
    shl-int/2addr v5, v2

    .line 23
    or-int/2addr v3, v5

    .line 24
    and-int/lit16 v4, v4, 0x80

    .line 25
    .line 26
    if-nez v4, :cond_2

    .line 27
    .line 28
    iput v3, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    .line 29
    .line 30
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    if-lez v3, :cond_1

    .line 35
    .line 36
    const-string v0, "kryo"

    .line 37
    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v2, "Read chunk: "

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget p0, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    .line 49
    .line 50
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {v0, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    :cond_1
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :cond_2
    add-int/lit8 v2, v2, 0x7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 66
    .line 67
    const-string v0, "Unable to read chunk size: malformed integer"

    .line 68
    .line 69
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0

    .line 73
    :catch_0
    move-exception p0

    .line 74
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 75
    .line 76
    const-string v1, "Unable to read chunk size."

    .line 77
    .line 78
    invoke-direct {v0, v1, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw v0
.end method


# virtual methods
.method public fill([BII)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/InputChunked;->readChunkSize()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    .line 17
    .line 18
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    invoke-super {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/io/Input;->fill([BII)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iget p2, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    .line 27
    .line 28
    sub-int/2addr p2, p1

    .line 29
    iput p2, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    .line 30
    .line 31
    if-nez p2, :cond_2

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/InputChunked;->readChunkSize()Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_2

    .line 38
    .line 39
    return v1

    .line 40
    :cond_2
    return p1
.end method

.method public nextChunk()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/io/Input;->limit:I

    .line 2
    .line 3
    iput v0, p0, Lcom/esotericsoftware/kryo/io/Input;->position:I

    .line 4
    .line 5
    iget v0, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/InputChunked;->readChunkSize()Z

    .line 11
    .line 12
    .line 13
    :cond_0
    :goto_0
    iget v0, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    .line 14
    .line 15
    if-lez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/io/Input;->skip(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iput v1, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    .line 22
    .line 23
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const-string p0, "kryo"

    .line 28
    .line 29
    const-string v0, "Next chunk."

    .line 30
    .line 31
    invoke-static {p0, v0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/esotericsoftware/kryo/io/Input;->reset()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    .line 6
    .line 7
    return-void
.end method

.method public setBuffer([BII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/io/Input;->setBuffer([BII)V

    .line 2
    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    .line 6
    .line 7
    return-void
.end method

.method public setInputStream(Ljava/io/InputStream;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->setInputStream(Ljava/io/InputStream;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lcom/esotericsoftware/kryo/io/InputChunked;->chunkSize:I

    .line 6
    .line 7
    return-void
.end method
