.class public Lcom/esotericsoftware/kryo/io/OutputChunked;
.super Lcom/esotericsoftware/kryo/io/Output;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/Output;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/io/Output;-><init>(Ljava/io/OutputStream;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/Output;-><init>(Ljava/io/OutputStream;I)V

    return-void
.end method

.method private writeChunkSize()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-boolean v1, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "Write chunk: "

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "kryo"

    .line 31
    .line 32
    invoke-static {v2, v1}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Output;->getOutputStream()Ljava/io/OutputStream;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    and-int/lit8 v1, v0, -0x80

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    and-int/lit8 v1, v0, 0x7f

    .line 48
    .line 49
    or-int/lit16 v1, v1, 0x80

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 52
    .line 53
    .line 54
    ushr-int/lit8 v1, v0, 0x7

    .line 55
    .line 56
    and-int/lit8 v2, v1, -0x80

    .line 57
    .line 58
    if-nez v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    and-int/lit8 v1, v1, 0x7f

    .line 65
    .line 66
    or-int/lit16 v1, v1, 0x80

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 69
    .line 70
    .line 71
    ushr-int/lit8 v1, v0, 0xe

    .line 72
    .line 73
    and-int/lit8 v2, v1, -0x80

    .line 74
    .line 75
    if-nez v2, :cond_3

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    and-int/lit8 v1, v1, 0x7f

    .line 82
    .line 83
    or-int/lit16 v1, v1, 0x80

    .line 84
    .line 85
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 86
    .line 87
    .line 88
    ushr-int/lit8 v1, v0, 0x15

    .line 89
    .line 90
    and-int/lit8 v2, v1, -0x80

    .line 91
    .line 92
    if-nez v2, :cond_4

    .line 93
    .line 94
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    and-int/lit8 v1, v1, 0x7f

    .line 99
    .line 100
    or-int/lit16 v1, v1, 0x80

    .line 101
    .line 102
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 103
    .line 104
    .line 105
    ushr-int/lit8 v0, v0, 0x1c

    .line 106
    .line 107
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 108
    .line 109
    .line 110
    return-void
.end method


# virtual methods
.method public endChunk()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/OutputChunked;->flush()V

    .line 2
    .line 3
    .line 4
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "kryo"

    .line 9
    .line 10
    const-string v1, "End chunk."

    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Output;->getOutputStream()Ljava/io/OutputStream;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception p0

    .line 25
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public flush()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/io/OutputChunked;->writeChunkSize()V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Lcom/esotericsoftware/kryo/io/Output;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p0

    .line 15
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    throw v0

    .line 21
    :cond_0
    invoke-super {p0}, Lcom/esotericsoftware/kryo/io/Output;->flush()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
