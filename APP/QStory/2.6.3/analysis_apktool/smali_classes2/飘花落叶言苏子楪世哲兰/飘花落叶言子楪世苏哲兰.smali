.class public abstract L飘花落叶言苏子楪世哲兰/飘花落叶言子楪世苏哲兰;
.super Ljava/io/FilterInputStream;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪哲兰世苏:J

.field public final 飘花落叶言子楪哲苏兰世:[B


# direct methods
.method public constructor <init>(Ljava/io/BufferedInputStream;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget v0, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    new-array p1, p1, [B

    .line 19
    .line 20
    iput-object p1, p0, L飘花落叶言苏子楪世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:[B

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method


# virtual methods
.method public final declared-synchronized mark(I)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    monitor-exit p0

    .line 3
    return-void
.end method

.method public final markSupported()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final read()I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, L飘花落叶言苏子楪世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:[B

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {p0, v1, v2, v0}, Ljava/io/InputStream;->read([BII)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v0, -0x1

    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    aget-byte p0, v1, v2

    .line 14
    .line 15
    and-int/lit16 p0, p0, 0xff

    .line 16
    .line 17
    return p0
.end method

.method public final declared-synchronized reset()V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    monitor-exit p0

    .line 3
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(J)V
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, L飘花落叶言苏子楪世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:J

    .line 8
    .line 9
    add-long/2addr v0, p1

    .line 10
    iput-wide v0, p0, L飘花落叶言苏子楪世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:J

    .line 11
    .line 12
    :cond_0
    return-void
.end method
