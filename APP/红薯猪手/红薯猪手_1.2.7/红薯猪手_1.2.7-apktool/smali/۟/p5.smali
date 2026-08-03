.class public final L۟/p5;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final ۥ:Ljava/io/InputStream;

.field public ۥ۟:J

.field public ۥ۟۟:J

.field public ۥ۟۠:J

.field public ۥ۟ۡ:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, L۟/p5;->ۥ۟ۡ:J

    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/BufferedInputStream;

    const/16 v1, 0x1000

    invoke-direct {v0, p1, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object p1, v0

    :cond_0
    iput-object p1, p0, L۟/p5;->ۥ:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    iget-object v0, p0, L۟/p5;->ۥ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, L۟/p5;->ۥ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final mark(I)V
    .locals 2

    invoke-virtual {p0, p1}, L۟/p5;->ۥ۟ۦ(I)J

    move-result-wide v0

    iput-wide v0, p0, L۟/p5;->ۥ۟ۡ:J

    return-void
.end method

.method public final markSupported()Z
    .locals 1

    iget-object v0, p0, L۟/p5;->ۥ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0
.end method

.method public final read()I
    .locals 5

    iget-object v0, p0, L۟/p5;->ۥ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-wide v1, p0, L۟/p5;->ۥ۟:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, L۟/p5;->ۥ۟:J

    :cond_0
    return v0
.end method

.method public final read([B)I
    .locals 4

    iget-object v0, p0, L۟/p5;->ۥ:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-wide v0, p0, L۟/p5;->ۥ۟:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, L۟/p5;->ۥ۟:J

    :cond_0
    return p1
.end method

.method public final read([BII)I
    .locals 2

    iget-object v0, p0, L۟/p5;->ۥ:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    iget-wide p2, p0, L۟/p5;->ۥ۟:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, L۟/p5;->ۥ۟:J

    :cond_0
    return p1
.end method

.method public final reset()V
    .locals 2

    iget-wide v0, p0, L۟/p5;->ۥ۟ۡ:J

    invoke-virtual {p0, v0, v1}, L۟/p5;->ۥ۟۟(J)V

    return-void
.end method

.method public final skip(J)J
    .locals 2

    iget-object v0, p0, L۟/p5;->ۥ:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    iget-wide v0, p0, L۟/p5;->ۥ۟:J

    add-long/2addr v0, p1

    iput-wide v0, p0, L۟/p5;->ۥ۟:J

    return-wide p1
.end method

.method public final ۥ۟۟(J)V
    .locals 4

    iget-wide v0, p0, L۟/p5;->ۥ۟:J

    iget-wide v2, p0, L۟/p5;->ۥ۟۠:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    iget-wide v0, p0, L۟/p5;->ۥ۟۟:J

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, L۟/p5;->ۥ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    iget-wide v0, p0, L۟/p5;->ۥ۟۟:J

    invoke-virtual {p0, v0, v1, p1, p2}, L۟/p5;->ۥۣ۠(JJ)V

    iput-wide p1, p0, L۟/p5;->ۥ۟:J

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Cannot reset"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟ۦ(I)J
    .locals 8

    .line 1
    iget-wide v0, p0, L۟/p5;->ۥ۟:J

    .line 2
    .line 3
    int-to-long v2, p1

    .line 4
    add-long/2addr v2, v0

    .line 5
    iget-wide v4, p0, L۟/p5;->ۥ۟۠:J

    .line 6
    .line 7
    cmp-long p1, v4, v2

    .line 8
    .line 9
    if-gez p1, :cond_1

    .line 10
    .line 11
    :try_start_0
    iget-wide v6, p0, L۟/p5;->ۥ۟۟:J

    .line 12
    .line 13
    cmp-long p1, v6, v0

    .line 14
    .line 15
    if-gez p1, :cond_0

    .line 16
    .line 17
    cmp-long p1, v0, v4

    .line 18
    .line 19
    if-gtz p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, L۟/p5;->ۥ:Ljava/io/InputStream;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, L۟/p5;->ۥ:Ljava/io/InputStream;

    .line 27
    .line 28
    iget-wide v0, p0, L۟/p5;->ۥ۟۟:J

    .line 29
    .line 30
    sub-long v0, v2, v0

    .line 31
    .line 32
    long-to-int v0, v0

    .line 33
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->mark(I)V

    .line 34
    .line 35
    .line 36
    iget-wide v0, p0, L۟/p5;->ۥ۟۟:J

    .line 37
    .line 38
    iget-wide v4, p0, L۟/p5;->ۥ۟:J

    .line 39
    .line 40
    invoke-virtual {p0, v0, v1, v4, v5}, L۟/p5;->ۥۣ۠(JJ)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iput-wide v0, p0, L۟/p5;->ۥ۟۟:J

    .line 45
    .line 46
    iget-object p1, p0, L۟/p5;->ۥ:Ljava/io/InputStream;

    .line 47
    .line 48
    sub-long v0, v2, v0

    .line 49
    .line 50
    long-to-int v0, v0

    .line 51
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->mark(I)V

    .line 52
    .line 53
    .line 54
    :goto_0
    iput-wide v2, p0, L۟/p5;->ۥ۟۠:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catch_0
    move-exception p1

    .line 58
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v2, "Unable to mark: "

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :cond_1
    :goto_1
    iget-wide v0, p0, L۟/p5;->ۥ۟:J

    .line 82
    .line 83
    return-wide v0
.end method

.method public final ۥۣ۠(JJ)V
    .locals 4

    :goto_0
    cmp-long v0, p1, p3

    if-gez v0, :cond_2

    iget-object v0, p0, L۟/p5;->ۥ:Ljava/io/InputStream;

    sub-long v1, p3, p1

    invoke-virtual {v0, v1, v2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, L۟/p5;->read()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x1

    :cond_1
    add-long/2addr p1, v0

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
