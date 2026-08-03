.class public final Lpf/b;
.super Ljava/io/FilterInputStream;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:J

.field public h:J

.field public i:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, Lpf/b;->g:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lpf/b;->h:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iput-wide v0, p0, Lpf/b;->h:J

    .line 5
    .line 6
    iget-wide p1, p0, Lpf/b;->g:J

    .line 7
    .line 8
    cmp-long p1, v0, p1

    .line 9
    .line 10
    if-gtz p1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p1, "Read limit exceeded"

    .line 14
    .line 15
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final mark(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Ljava/io/FilterInputStream;->mark(I)V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lpf/b;->h:J

    .line 5
    .line 6
    iput-wide v0, p0, Lpf/b;->i:J

    .line 7
    .line 8
    return-void
.end method

.method public final read()I
    .locals 3

    .line 1
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const-wide/16 v1, 0x1

    .line 9
    .line 10
    invoke-virtual {p0, v1, v2}, Lpf/b;->a(J)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return v0
.end method

.method public final read([BII)I
    .locals 0

    .line 14
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1

    if-lez p1, :cond_0

    int-to-long p2, p1

    .line 15
    invoke-virtual {p0, p2, p3}, Lpf/b;->a(J)V

    :cond_0
    return p1
.end method

.method public final reset()V
    .locals 2

    .line 1
    invoke-super {p0}, Ljava/io/FilterInputStream;->reset()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lpf/b;->i:J

    .line 5
    .line 6
    iput-wide v0, p0, Lpf/b;->h:J

    .line 7
    .line 8
    return-void
.end method

.method public final skip(J)J
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Ljava/io/FilterInputStream;->skip(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v0, p1, v0

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lpf/b;->a(J)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-wide p1
.end method
