.class public final LYue/ۥ۟ۧ۟;
.super Ljava/io/BufferedInputStream;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Z

.field public final ۥ۟۟۠ۤ:I

.field public ۥ۟۟۠ۥ:J

.field public ۥ۟۟۠ۦ:J

.field public ۥ۟۟۠ۧ:I

.field public ۥ۟۟۠ۨ:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;II)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    const-wide/16 p1, 0x0

    iput-wide p1, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۦ:J

    const/4 p1, 0x0

    const/4 p2, 0x1

    if-ltz p3, :cond_0

    move v0, p2

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    invoke-static {v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۢ(Z)V

    iput p3, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۤ:I

    iput p3, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۧ:I

    if-eqz p3, :cond_1

    move p1, p2

    :cond_1
    iput-boolean p1, p0, LYue/ۥ۟ۧ۟;->ۥۣ۟۟۠:Z

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    iput-wide p1, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۥ:J

    return-void
.end method

.method public static ۥ۟۟۟۟(Ljava/io/InputStream;II)LYue/ۥ۟ۧ۟;
    .locals 1

    instance-of v0, p0, LYue/ۥ۟ۧ۟;

    if-eqz v0, :cond_0

    check-cast p0, LYue/ۥ۟ۧ۟;

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۟ۧ۟;

    invoke-direct {v0, p0, p1, p2}, LYue/ۥ۟ۧ۟;-><init>(Ljava/io/InputStream;II)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public read([BII)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۨ:Z

    const/4 v1, -0x1

    if-nez v0, :cond_4

    iget-boolean v0, p0, LYue/ۥ۟ۧ۟;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_0

    iget v0, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۧ:I

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۨ:Z

    return v1

    :cond_1
    invoke-virtual {p0}, LYue/ۥ۟ۧ۟;->ۥ۟()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, LYue/ۥ۟ۧ۟;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_2

    iget v0, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۧ:I

    if-le p3, v0, :cond_2

    move p3, v0

    :cond_2
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ljava/io/BufferedInputStream;->read([BII)I

    move-result p1

    iget p2, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۧ:I

    sub-int/2addr p2, p1

    iput p2, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۧ:I
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

    invoke-super {p0}, Ljava/io/BufferedInputStream;->reset()V

    iget v0, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۤ:I

    iget v1, p0, Ljava/io/BufferedInputStream;->markpos:I

    sub-int/2addr v0, v1

    iput v0, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۧ:I

    return-void
.end method

.method public final ۥ۟()Z
    .locals 6

    iget-wide v0, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۦ:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iget-wide v4, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۥ:J

    sub-long/2addr v2, v4

    iget-wide v4, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۦ:J

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public ۥ۟۟(I)Ljava/nio/ByteBuffer;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۨۢۦ;->ۥ۟۟۟ۥ(Ljava/io/InputStream;I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟(JJ)LYue/ۥ۟ۧ۟;
    .locals 0

    iput-wide p1, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۥ:J

    const-wide/32 p1, 0xf4240

    mul-long/2addr p3, p1

    iput-wide p3, p0, LYue/ۥ۟ۧ۟;->ۥ۟۟۠ۦ:J

    return-object p0
.end method
