.class public final Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;
.super L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;

.field public final 飘花落叶言子楪哲兰苏世:[B

.field public 飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;-><init>(Ljava/io/InputStream;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    new-array v1, v1, [B

    .line 11
    .line 12
    iput-object v1, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:[B

    .line 13
    .line 14
    iput-object v0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;

    .line 15
    .line 16
    iput-object p1, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public final close()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;

    .line 3
    .line 4
    sget-object v2, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    :try_start_1
    invoke-virtual {v1}, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    .line 10
    .line 11
    :catch_0
    :cond_0
    :try_start_2
    iput-object v0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 12
    .line 13
    iget-object v1, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 18
    .line 19
    .line 20
    :cond_1
    iput-object v0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;

    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    iget-object v2, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;

    .line 25
    .line 26
    sget-object v3, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 31
    .line 32
    .line 33
    :cond_2
    iput-object v0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;

    .line 34
    .line 35
    throw v1
.end method

.method public final read()I
    .locals 3

    .line 48
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:[B

    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    if-ne v1, p0, :cond_1

    const/4 p0, 0x0

    .line 49
    aget-byte p0, v0, p0

    and-int/lit16 p0, p0, 0xff

    return p0

    .line 50
    :cond_1
    const-string p0, "Invalid return value from read: "

    .line 51
    invoke-static {v1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 52
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    :cond_2
    return v2
.end method

.method public final read([BII)I
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {v0, p2, p1, p3}, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I[BI)I

    .line 11
    .line 12
    .line 13
    move-result p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 14
    iget-object p2, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;

    .line 15
    .line 16
    iget-object p2, p2, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    iget-object p2, p2, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子世兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    invoke-virtual {p2}, L飘花落叶言苏子世兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()J

    .line 21
    .line 22
    .line 23
    if-ne p1, v1, :cond_2

    .line 24
    .line 25
    iget-object p2, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;

    .line 26
    .line 27
    sget-object p3, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    :try_start_1
    invoke-virtual {p2}, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 32
    .line 33
    .line 34
    :catch_0
    :cond_1
    const/4 p2, 0x0

    .line 35
    iput-object p2, p0, Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/compress/compressors/deflate64/飘花落叶言子楪世兰苏哲;

    .line 36
    .line 37
    :cond_2
    return p1

    .line 38
    :catch_1
    move-exception p0

    .line 39
    new-instance p1, Ljava/io/IOException;

    .line 40
    .line 41
    const-string p2, "Invalid Deflate64 input"

    .line 42
    .line 43
    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_3
    return v1
.end method
