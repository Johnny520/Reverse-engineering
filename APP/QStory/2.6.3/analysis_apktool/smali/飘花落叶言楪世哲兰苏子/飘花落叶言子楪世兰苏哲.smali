.class public final L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;
.super Ljava/io/InputStream;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪哲兰苏世:Ljava/util/ArrayDeque;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Ljava/io/IOException;

.field public 飘花落叶言子楪哲苏兰世:Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayDeque;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;->available()I

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
    iget-object p0, p0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final mark(I)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;->mark(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final markSupported()Z
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0
.end method

.method public final read()I
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;->read()I

    .line 4
    .line 5
    .line 6
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    iput-object v0, p0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/io/IOException;

    .line 10
    .line 11
    throw v0
.end method

.method public final read([B)I
    .locals 1

    .line 12
    :try_start_0
    iget-object v0, p0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p1

    .line 13
    iput-object p1, p0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/io/IOException;

    .line 14
    throw p1
.end method

.method public final read([BII)I
    .locals 1

    .line 15
    :try_start_0
    iget-object v0, p0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;

    invoke-virtual {v0, p1, p2, p3}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;->read([BII)I

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p1

    .line 16
    iput-object p1, p0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/io/IOException;

    .line 17
    throw p1
.end method

.method public final declared-synchronized reset()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;->reset()V
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
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪兰哲苏世;->skip(J)J

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
    iput-object p1, p0, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/io/IOException;

    .line 10
    .line 11
    throw p1
.end method
