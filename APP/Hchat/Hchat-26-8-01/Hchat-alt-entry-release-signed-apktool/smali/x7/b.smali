.class public final Lx7/b;
.super Ljava/io/ByteArrayOutputStream;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const-string v0, "Negative: "

    .line 8
    .line 9
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    invoke-super {p0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lx7/b;->toByteArray()[B

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final declared-synchronized toByteArray()[B
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Ljava/io/ByteArrayOutputStream;->count:I

    .line 3
    .line 4
    iget-object v1, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 5
    .line 6
    array-length v2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-object v1

    .line 11
    :cond_0
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :try_start_1
    new-array v0, v2, [B

    .line 15
    .line 16
    iput-object v0, p0, Ljava/io/ByteArrayOutputStream;->buf:[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-object v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :try_start_2
    new-array v3, v0, [B

    .line 23
    .line 24
    :goto_0
    if-ge v2, v0, :cond_2

    .line 25
    .line 26
    aget-byte v4, v1, v2

    .line 27
    .line 28
    aput-byte v4, v3, v2

    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    iput-object v3, p0, Ljava/io/ByteArrayOutputStream;->buf:[B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-object v3

    .line 37
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 38
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "pos = "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public final write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 77
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lx7/b;->write([BII)V

    return-void
.end method

.method public final declared-synchronized write([BII)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    if-nez p3, :cond_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    iget v0, p0, Ljava/io/ByteArrayOutputStream;->count:I

    .line 7
    .line 8
    add-int/2addr v0, p3

    .line 9
    iget-object v1, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    sub-int v2, v0, v2

    .line 13
    .line 14
    if-lez v2, :cond_5

    .line 15
    .line 16
    iget v2, p0, Lx7/b;->g:I

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    iput v2, p0, Lx7/b;->g:I

    .line 22
    .line 23
    :cond_1
    iget v2, p0, Lx7/b;->g:I

    .line 24
    .line 25
    shl-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    iput v2, p0, Lx7/b;->g:I

    .line 28
    .line 29
    const v3, 0xffff

    .line 30
    .line 31
    .line 32
    if-le v2, v3, :cond_2

    .line 33
    .line 34
    iput v3, p0, Lx7/b;->g:I

    .line 35
    .line 36
    :cond_2
    array-length v2, v1

    .line 37
    iget v3, p0, Lx7/b;->g:I

    .line 38
    .line 39
    add-int/2addr v3, v0

    .line 40
    sub-int v4, v3, v0

    .line 41
    .line 42
    if-gez v4, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    move v0, v3

    .line 46
    :goto_0
    new-array v0, v0, [B

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    :goto_1
    if-ge v3, v2, :cond_4

    .line 50
    .line 51
    aget-byte v4, v1, v3

    .line 52
    .line 53
    aput-byte v4, v0, v3

    .line 54
    .line 55
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_4
    iput-object v0, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 59
    .line 60
    :cond_5
    iget-object v0, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 61
    .line 62
    iget v1, p0, Ljava/io/ByteArrayOutputStream;->count:I

    .line 63
    .line 64
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 65
    .line 66
    .line 67
    iget p1, p0, Ljava/io/ByteArrayOutputStream;->count:I

    .line 68
    .line 69
    add-int/2addr p1, p3

    .line 70
    iput p1, p0, Ljava/io/ByteArrayOutputStream;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    monitor-exit p0

    .line 73
    return-void

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    throw p1
.end method
