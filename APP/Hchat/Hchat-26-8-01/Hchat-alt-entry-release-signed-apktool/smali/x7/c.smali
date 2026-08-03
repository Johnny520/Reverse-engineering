.class public final Lx7/c;
.super Ljava/io/InputStream;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Ljava/nio/channels/FileChannel;

.field public final h:J

.field public i:J

.field public j:J

.field public final k:[B

.field public l:I

.field public m:I


# direct methods
.method public constructor <init>(Ljava/nio/channels/FileChannel;J)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx7/c;->g:Ljava/nio/channels/FileChannel;

    .line 5
    .line 6
    iput-wide p2, p0, Lx7/c;->h:J

    .line 7
    .line 8
    const v0, 0x19000

    .line 9
    .line 10
    .line 11
    int-to-long v1, v0

    .line 12
    cmp-long v1, p2, v1

    .line 13
    .line 14
    if-gez v1, :cond_0

    .line 15
    .line 16
    long-to-int v0, p2

    .line 17
    :cond_0
    new-array p2, v0, [B

    .line 18
    .line 19
    iput-object p2, p0, Lx7/c;->k:[B

    .line 20
    .line 21
    iput v0, p0, Lx7/c;->m:I

    .line 22
    .line 23
    iput v0, p0, Lx7/c;->l:I

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->position()J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    iput-wide p1, p0, Lx7/c;->i:J

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget v0, p0, Lx7/c;->l:I

    .line 2
    .line 3
    iget v1, p0, Lx7/c;->m:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lx7/c;->k:[B

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    iget-wide v2, p0, Lx7/c;->h:J

    .line 12
    .line 13
    iget-wide v4, p0, Lx7/c;->j:J

    .line 14
    .line 15
    sub-long/2addr v2, v4

    .line 16
    int-to-long v4, v1

    .line 17
    cmp-long v4, v4, v2

    .line 18
    .line 19
    if-lez v4, :cond_1

    .line 20
    .line 21
    long-to-int v1, v2

    .line 22
    :cond_1
    const/4 v2, 0x0

    .line 23
    invoke-static {v0, v2, v1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Lx7/c;->g:Ljava/nio/channels/FileChannel;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lx7/c;->m:I

    .line 34
    .line 35
    iput v2, p0, Lx7/c;->l:I

    .line 36
    .line 37
    return-void
.end method

.method public final available()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lx7/c;->h:J

    .line 2
    .line 3
    iget-wide v2, p0, Lx7/c;->j:J

    .line 4
    .line 5
    sub-long/2addr v0, v2

    .line 6
    long-to-int v0, v0

    .line 7
    return v0
.end method

.method public final b([BII)I
    .locals 2

    .line 1
    iget v0, p0, Lx7/c;->m:I

    .line 2
    .line 3
    iget v1, p0, Lx7/c;->l:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return p1

    .line 10
    :cond_0
    if-le p3, v0, :cond_1

    .line 11
    .line 12
    move p3, v0

    .line 13
    :cond_1
    iget-object v0, p0, Lx7/c;->k:[B

    .line 14
    .line 15
    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Lx7/c;->l:I

    .line 19
    .line 20
    add-int/2addr p1, p3

    .line 21
    iput p1, p0, Lx7/c;->l:I

    .line 22
    .line 23
    iget-wide p1, p0, Lx7/c;->j:J

    .line 24
    .line 25
    int-to-long v0, p3

    .line 26
    add-long/2addr p1, v0

    .line 27
    iput-wide p1, p0, Lx7/c;->j:J

    .line 28
    .line 29
    return p3
.end method

.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final declared-synchronized mark(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    :cond_0
    int-to-long v0, p1

    .line 6
    :try_start_0
    iput-wide v0, p0, Lx7/c;->i:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
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

    const/4 v0, 0x1

    .line 46
    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 47
    invoke-virtual {p0, v1, v2, v0}, Lx7/c;->read([BII)I

    move-result v0

    if-gez v0, :cond_0

    return v0

    .line 48
    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 45
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lx7/c;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 6

    .line 1
    iget-wide v0, p0, Lx7/c;->j:J

    .line 2
    .line 3
    iget-wide v2, p0, Lx7/c;->h:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_0
    if-nez p3, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_1
    invoke-virtual {p0}, Lx7/c;->a()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, p3}, Lx7/c;->b([BII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sub-int/2addr p3, v0

    .line 23
    add-int/2addr p2, v0

    .line 24
    :goto_0
    if-lez p3, :cond_3

    .line 25
    .line 26
    iget-wide v4, p0, Lx7/c;->j:J

    .line 27
    .line 28
    cmp-long v1, v4, v2

    .line 29
    .line 30
    if-ltz v1, :cond_2

    .line 31
    .line 32
    return v0

    .line 33
    :cond_2
    invoke-virtual {p0}, Lx7/c;->a()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1, p2, p3}, Lx7/c;->b([BII)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v0, v1

    .line 41
    sub-int/2addr p3, v1

    .line 42
    add-int/2addr p2, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    return v0
.end method

.method public final reset()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lx7/c;->j:J

    .line 4
    .line 5
    iget v0, p0, Lx7/c;->m:I

    .line 6
    .line 7
    iput v0, p0, Lx7/c;->l:I

    .line 8
    .line 9
    iget-object v0, p0, Lx7/c;->g:Ljava/nio/channels/FileChannel;

    .line 10
    .line 11
    iget-wide v1, p0, Lx7/c;->i:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final skip(J)J
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gtz v2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v2, p0, Lx7/c;->m:I

    .line 9
    .line 10
    iget v3, p0, Lx7/c;->l:I

    .line 11
    .line 12
    sub-int/2addr v2, v3

    .line 13
    int-to-long v4, v2

    .line 14
    cmp-long v4, v4, p1

    .line 15
    .line 16
    if-lez v4, :cond_1

    .line 17
    .line 18
    long-to-int v2, p1

    .line 19
    :cond_1
    add-int/2addr v3, v2

    .line 20
    iput v3, p0, Lx7/c;->l:I

    .line 21
    .line 22
    iget-wide v3, p0, Lx7/c;->j:J

    .line 23
    .line 24
    int-to-long v5, v2

    .line 25
    add-long/2addr v3, v5

    .line 26
    iput-wide v3, p0, Lx7/c;->j:J

    .line 27
    .line 28
    sub-long v5, p1, v5

    .line 29
    .line 30
    cmp-long v0, v5, v0

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    :goto_0
    return-wide p1

    .line 35
    :cond_2
    iget-wide v0, p0, Lx7/c;->h:J

    .line 36
    .line 37
    sub-long/2addr v0, v3

    .line 38
    cmp-long v2, v0, v5

    .line 39
    .line 40
    if-lez v2, :cond_3

    .line 41
    .line 42
    move-wide v0, v5

    .line 43
    :cond_3
    add-long/2addr v3, v0

    .line 44
    iput-wide v3, p0, Lx7/c;->j:J

    .line 45
    .line 46
    sub-long/2addr v5, v0

    .line 47
    sub-long/2addr p1, v5

    .line 48
    iget-object v2, p0, Lx7/c;->g:Ljava/nio/channels/FileChannel;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->position()J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    add-long/2addr v3, v0

    .line 55
    invoke-virtual {v2, v3, v4}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 56
    .line 57
    .line 58
    return-wide p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lx7/c;->j:J

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " / "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-wide v1, p0, Lx7/c;->h:J

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public final transferTo(Ljava/io/OutputStream;)J
    .locals 8

    .line 1
    iget-wide v0, p0, Lx7/c;->j:J

    .line 2
    .line 3
    iget-wide v2, p0, Lx7/c;->h:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    return-wide v4

    .line 12
    :cond_0
    :goto_0
    iget-wide v0, p0, Lx7/c;->j:J

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    if-ltz v0, :cond_1

    .line 17
    .line 18
    return-wide v4

    .line 19
    :cond_1
    invoke-virtual {p0}, Lx7/c;->a()V

    .line 20
    .line 21
    .line 22
    iget v0, p0, Lx7/c;->l:I

    .line 23
    .line 24
    iget v1, p0, Lx7/c;->m:I

    .line 25
    .line 26
    sub-int/2addr v1, v0

    .line 27
    if-gtz v1, :cond_2

    .line 28
    .line 29
    return-wide v4

    .line 30
    :cond_2
    iget-object v6, p0, Lx7/c;->k:[B

    .line 31
    .line 32
    invoke-virtual {p1, v6, v0, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 33
    .line 34
    .line 35
    iget v0, p0, Lx7/c;->l:I

    .line 36
    .line 37
    add-int/2addr v0, v1

    .line 38
    iput v0, p0, Lx7/c;->l:I

    .line 39
    .line 40
    iget-wide v6, p0, Lx7/c;->j:J

    .line 41
    .line 42
    int-to-long v0, v1

    .line 43
    add-long/2addr v6, v0

    .line 44
    iput-wide v6, p0, Lx7/c;->j:J

    .line 45
    .line 46
    add-long/2addr v4, v0

    .line 47
    goto :goto_0
.end method
