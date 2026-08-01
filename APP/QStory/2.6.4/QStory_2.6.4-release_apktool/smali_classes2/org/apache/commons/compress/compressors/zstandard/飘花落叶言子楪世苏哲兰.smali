.class public final Lorg/apache/commons/compress/compressors/zstandard/飘花落叶言子楪世苏哲兰;
.super L飘花落叶言苏子世楪哲兰/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Lcom/github/luben/zstd/ZstdInputStream;


# direct methods
.method public constructor <init>(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪兰哲苏;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/github/luben/zstd/ZstdInputStream;

    .line 5
    .line 6
    invoke-static {}, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, L飘花落叶言苏子世兰楪哲/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    invoke-direct {v2, p1}, L飘花落叶言苏子世兰楪哲/飘花落叶言子楪世苏哲兰;-><init>(Ljava/io/InputStream;)V

    .line 13
    .line 14
    .line 15
    iput-object v2, v1, L飘花落叶言苏子世兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏子世兰楪哲/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    new-instance p1, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世苏兰哲;

    .line 18
    .line 19
    invoke-direct {p1, v1}, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世苏哲兰;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p1}, Lcom/github/luben/zstd/ZstdInputStream;-><init>(Ljava/io/InputStream;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lorg/apache/commons/compress/compressors/zstandard/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lcom/github/luben/zstd/ZstdInputStream;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/compressors/zstandard/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lcom/github/luben/zstd/ZstdInputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdInputStream;->available()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/compressors/zstandard/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lcom/github/luben/zstd/ZstdInputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdInputStream;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final declared-synchronized mark(I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/compress/compressors/zstandard/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lcom/github/luben/zstd/ZstdInputStream;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdInputStream;->mark(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw p1
.end method

.method public final markSupported()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/compressors/zstandard/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lcom/github/luben/zstd/ZstdInputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdInputStream;->markSupported()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final read()I
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/apache/commons/compress/compressors/zstandard/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lcom/github/luben/zstd/ZstdInputStream;

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdInputStream;->read()I

    move-result p0

    return p0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 12
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lorg/apache/commons/compress/compressors/zstandard/飘花落叶言子楪世苏哲兰;->read([BII)I

    move-result p0

    return p0
.end method

.method public final read([BII)I
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    iget-object p0, p0, Lorg/apache/commons/compress/compressors/zstandard/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lcom/github/luben/zstd/ZstdInputStream;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lcom/github/luben/zstd/ZstdInputStream;->read([BII)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final declared-synchronized reset()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/compress/compressors/zstandard/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lcom/github/luben/zstd/ZstdInputStream;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdInputStream;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw v0
.end method

.method public final skip(J)J
    .locals 8

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/compressors/zstandard/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lcom/github/luben/zstd/ZstdInputStream;

    .line 2
    .line 3
    sget-object v0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v2, p1, v0

    .line 8
    .line 9
    if-ltz v2, :cond_2

    .line 10
    .line 11
    move-wide v2, p1

    .line 12
    :goto_0
    cmp-long v4, v2, v0

    .line 13
    .line 14
    if-lez v4, :cond_1

    .line 15
    .line 16
    sget-object v4, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:[B

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-static {v4, v5}, Ljava/util/Arrays;->fill([BB)V

    .line 20
    .line 21
    .line 22
    array-length v6, v4

    .line 23
    int-to-long v6, v6

    .line 24
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v6

    .line 28
    long-to-int v6, v6

    .line 29
    invoke-virtual {p0, v4, v5, v6}, Ljava/io/InputStream;->read([BII)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    int-to-long v4, v4

    .line 34
    cmp-long v6, v4, v0

    .line 35
    .line 36
    if-gez v6, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    sub-long/2addr v2, v4

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    :goto_1
    sub-long/2addr p1, v2

    .line 42
    return-wide p1

    .line 43
    :cond_2
    const-string p0, "Skip count must be non-negative, actual: "

    .line 44
    .line 45
    invoke-static {p1, p2, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/compressors/zstandard/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lcom/github/luben/zstd/ZstdInputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
