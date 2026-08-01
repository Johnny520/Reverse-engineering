.class public abstract L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;
.super Ljava/io/FilterInputStream;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:L飘花落叶言苏子哲世楪兰/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子楪哲兰苏世:L飘花落叶言苏子哲世楪兰/飘花落叶言子楪世哲兰苏;

.field public volatile 飘花落叶言子楪哲苏兰世:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 18
    new-instance p1, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;-><init>(I)V

    iput-object p1, p0, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏子哲世楪兰/飘花落叶言子楪世苏兰哲;

    .line 19
    sget-object p1, L飘花落叶言苏子哲世楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏子哲世楪兰/飘花落叶言子楪世哲兰苏;

    iput-object p1, p0, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言苏子哲世楪兰/飘花落叶言子楪世哲兰苏;

    return-void
.end method

.method public constructor <init>(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪兰哲苏;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    invoke-direct {p1, v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏子哲世楪兰/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    sget-object p1, L飘花落叶言苏子哲世楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏子哲世楪兰/飘花落叶言子楪世哲兰苏;

    .line 13
    .line 14
    iput-object p1, p0, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言苏子哲世楪兰/飘花落叶言子楪世哲兰苏;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public available()I
    .locals 1

    .line 1
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 12
    .line 13
    .line 14
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return p0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    invoke-virtual {p0, v0}, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 2
    .line 3
    sget-object v1, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    new-instance v1, Ljava/io/IOException;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_1
    move-exception v0

    .line 22
    invoke-virtual {p0, v0}, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Z

    .line 27
    .line 28
    return-void
.end method

.method public declared-synchronized mark(I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw p1
.end method

.method public markSupported()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/InputStream;->markSupported()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public read()I
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    :try_start_0
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eq v1, v0, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v2, v0

    .line 13
    :goto_0
    invoke-virtual {p0, v2}, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return v1

    .line 17
    :catch_0
    move-exception v1

    .line 18
    invoke-virtual {p0, v1}, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)V

    .line 19
    .line 20
    .line 21
    return v0
.end method

.method public read([B)I
    .locals 1

    .line 22
    :try_start_0
    sget-object v0, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 23
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result p1

    .line 24
    invoke-virtual {p0, p1}, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 25
    invoke-virtual {p0, p1}, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)V

    const/4 p0, -0x1

    return p0
.end method

.method public read([BII)I
    .locals 1

    .line 26
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    .line 27
    invoke-virtual {p0, p1}, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 28
    invoke-virtual {p0, p1}, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)V

    const/4 p0, -0x1

    return p0
.end method

.method public declared-synchronized reset()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    goto :goto_1

    .line 10
    :catch_0
    move-exception v0

    .line 11
    :try_start_1
    invoke-virtual {p0, v0}, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    .line 14
    :goto_0
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 17
    throw v0
.end method

.method public skip(J)J
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-wide p0

    .line 8
    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p0, p1}, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)V

    .line 10
    .line 11
    .line 12
    const-wide/16 p0, 0x0

    .line 13
    .line 14
    return-wide p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/io/IOException;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏子哲世楪兰/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-interface {p0, p1}, L飘花落叶言苏子哲世楪兰/飘花落叶言子楪世苏兰哲;->accept(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public 飘花落叶言子楪世苏兰哲(I)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏子哲世兰楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言苏子哲世楪兰/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method
