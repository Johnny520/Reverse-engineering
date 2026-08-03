.class public final Lx7/a;
.super Ljava/io/InputStream;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:[B

.field public final h:I

.field public final i:I

.field public j:I

.field public k:I


# direct methods
.method public constructor <init>([BII)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    if-lt p2, v0, :cond_0

    .line 6
    .line 7
    array-length p2, p1

    .line 8
    add-int/lit8 p2, p2, -0x1

    .line 9
    .line 10
    :cond_0
    if-gez p2, :cond_1

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    :cond_1
    array-length v0, p1

    .line 14
    sub-int/2addr v0, p2

    .line 15
    if-le p3, v0, :cond_2

    .line 16
    .line 17
    move p3, v0

    .line 18
    :cond_2
    iput-object p1, p0, Lx7/a;->g:[B

    .line 19
    .line 20
    iput p2, p0, Lx7/a;->h:I

    .line 21
    .line 22
    iput p3, p0, Lx7/a;->i:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 1
    iget v0, p0, Lx7/a;->i:I

    .line 2
    .line 3
    iget v1, p0, Lx7/a;->j:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    return v0
.end method

.method public final close()V
    .locals 1

    .line 1
    iget v0, p0, Lx7/a;->i:I

    .line 2
    .line 3
    iput v0, p0, Lx7/a;->j:I

    .line 4
    .line 5
    return-void
.end method

.method public final declared-synchronized mark(I)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, Lx7/a;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final markSupported()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final read()I
    .locals 3

    .line 33
    invoke-virtual {p0}, Lx7/a;->available()I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 34
    :cond_0
    iget v0, p0, Lx7/a;->j:I

    iget v1, p0, Lx7/a;->h:I

    add-int/2addr v1, v0

    iget-object v2, p0, Lx7/a;->g:[B

    aget-byte v1, v2, v1

    add-int/lit8 v0, v0, 0x1

    .line 35
    iput v0, p0, Lx7/a;->j:I

    and-int/lit16 v0, v1, 0xff

    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 32
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lx7/a;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    invoke-virtual {p0}, Lx7/a;->available()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-gtz v0, :cond_1

    .line 10
    .line 11
    const/4 p1, -0x1

    .line 12
    return p1

    .line 13
    :cond_1
    if-le p3, v0, :cond_2

    .line 14
    .line 15
    move p3, v0

    .line 16
    :cond_2
    iget v0, p0, Lx7/a;->h:I

    .line 17
    .line 18
    iget v1, p0, Lx7/a;->j:I

    .line 19
    .line 20
    add-int/2addr v0, v1

    .line 21
    iget-object v1, p0, Lx7/a;->g:[B

    .line 22
    .line 23
    invoke-static {v1, v0, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget p1, p0, Lx7/a;->j:I

    .line 27
    .line 28
    add-int/2addr p1, p3

    .line 29
    iput p1, p0, Lx7/a;->j:I

    .line 30
    .line 31
    return p3
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget v0, p0, Lx7/a;->k:I

    .line 2
    .line 3
    iput v0, p0, Lx7/a;->j:I

    .line 4
    .line 5
    return-void
.end method

.method public final skip(J)J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    return-wide p1

    .line 8
    :cond_0
    long-to-int p1, p1

    .line 9
    invoke-virtual {p0}, Lx7/a;->available()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-le p1, p2, :cond_1

    .line 14
    .line 15
    move p1, p2

    .line 16
    :cond_1
    iget p2, p0, Lx7/a;->j:I

    .line 17
    .line 18
    add-int/2addr p2, p1

    .line 19
    iput p2, p0, Lx7/a;->j:I

    .line 20
    .line 21
    int-to-long p1, p1

    .line 22
    return-wide p1
.end method
