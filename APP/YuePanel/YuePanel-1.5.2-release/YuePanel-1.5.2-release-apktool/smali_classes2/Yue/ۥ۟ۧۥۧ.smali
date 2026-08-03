.class public LYue/ۥ۟ۧۥۧ;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# instance fields
.field public final ۥۣ۟۟۠:Ljava/io/BufferedInputStream;

.field public final ۥ۟۟۠ۤ:Z

.field public final ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:J

.field public ۥ۟۟۠ۧ:J

.field public ۥ۟۟۠ۨ:I

.field public ۥ۟۟ۡ:I

.field public ۥ۟۟ۡ۟:Z


# direct methods
.method public constructor <init>(Ljava/io/BufferedInputStream;I)V
    .locals 3

    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۧ:J

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    invoke-static {v2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۢ(Z)V

    iput-object p1, p0, LYue/ۥ۟ۧۥۧ;->ۥۣ۟۟۠:Ljava/io/BufferedInputStream;

    if-eqz p2, :cond_1

    move v0, v1

    :cond_1
    iput-boolean v0, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۤ:Z

    iput p2, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۥ:I

    iput p2, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۨ:I

    const/4 p1, -0x1

    iput p1, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟ۡ:I

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    iput-wide p1, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۦ:J

    return-void
.end method

.method public static ۥ۟۟۟(Ljava/io/InputStream;I)Ljava/nio/ByteBuffer;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "maxSize must be 0 (unlimited) or larger"

    invoke-static {v2, v3}, LYue/ۥۣۢۥ۠;->ۥۣ۟۟۟(ZLjava/lang/String;)V

    invoke-static {p0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const v2, 0x8000

    if-eqz v0, :cond_2

    if-ge p1, v2, :cond_2

    move v2, p1

    :cond_2
    new-array v3, v2, [B

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    :goto_2
    if-eqz v0, :cond_3

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result v5

    goto :goto_3

    :cond_3
    move v5, v2

    :goto_3
    invoke-virtual {p0, v3, v1, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_4

    goto :goto_4

    :cond_4
    if-eqz v0, :cond_6

    if-lt v5, p1, :cond_5

    invoke-virtual {v4, v3, v1, p1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    :goto_4
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0

    :cond_5
    sub-int/2addr p1, v5

    :cond_6
    invoke-virtual {v4, v3, v1, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_2
.end method

.method public static ۥ۟۟۟ۢ(Ljava/io/InputStream;II)LYue/ۥ۟ۧۥۧ;
    .locals 2

    instance-of v0, p0, LYue/ۥ۟ۧۥۧ;

    if-eqz v0, :cond_0

    check-cast p0, LYue/ۥ۟ۧۥۧ;

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_1

    new-instance p1, LYue/ۥ۟ۧۥۧ;

    check-cast p0, Ljava/io/BufferedInputStream;

    invoke-direct {p1, p0, p2}, LYue/ۥ۟ۧۥۧ;-><init>(Ljava/io/BufferedInputStream;I)V

    return-object p1

    :cond_1
    new-instance v0, LYue/ۥ۟ۧۥۧ;

    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-direct {v1, p0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-direct {v0, v1, p2}, LYue/ۥ۟ۧۥۧ;-><init>(Ljava/io/BufferedInputStream;I)V

    return-object v0
.end method


# virtual methods
.method public mark(I)V
    .locals 1

    invoke-super {p0, p1}, Ljava/io/FilterInputStream;->mark(I)V

    iget p1, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۥ:I

    iget v0, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۨ:I

    sub-int/2addr p1, v0

    iput p1, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟ۡ:I

    return-void
.end method

.method public read([BII)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟ۡ۟:Z

    const/4 v1, -0x1

    if-nez v0, :cond_4

    iget-boolean v0, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۤ:Z

    if-eqz v0, :cond_0

    iget v0, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۨ:I

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟ۡ۟:Z

    return v1

    :cond_1
    invoke-virtual {p0}, LYue/ۥ۟ۧۥۧ;->ۥ۟()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۤ:Z

    if-eqz v0, :cond_2

    iget v0, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۨ:I

    if-le p3, v0, :cond_2

    move p3, v0

    :cond_2
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1

    iget p2, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۨ:I

    sub-int/2addr p2, p1

    iput p2, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۨ:I
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1

    :cond_3
    new-instance p1, Ljava/net/SocketTimeoutException;

    const-string p2, "Read timeout"

    invoke-direct {p1, p2}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    return v1
.end method

.method public reset()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-super {p0}, Ljava/io/FilterInputStream;->reset()V

    iget v0, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۥ:I

    iget v1, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟ۡ:I

    sub-int/2addr v0, v1

    iput v0, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۨ:I

    return-void
.end method

.method public final ۥ۟()Z
    .locals 6

    iget-wide v0, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۧ:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iget-wide v4, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۦ:J

    sub-long/2addr v2, v4

    iget-wide v4, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۧ:J

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public ۥ۟۟()Ljava/io/BufferedInputStream;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۧۥۧ;->ۥۣ۟۟۠:Ljava/io/BufferedInputStream;

    return-object v0
.end method

.method public ۥ۟۟۟۟(JJ)LYue/ۥ۟ۧۥۧ;
    .locals 0

    iput-wide p1, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۦ:J

    const-wide/32 p1, 0xf4240

    mul-long/2addr p3, p1

    iput-wide p3, p0, LYue/ۥ۟ۧۥۧ;->ۥ۟۟۠ۧ:J

    return-object p0
.end method
