.class public final Lq7/b;
.super Ljava/io/InputStream;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Ljava/lang/Object;

.field public h:[B

.field public final i:I

.field public final j:I

.field public k:I

.field public l:Z

.field public m:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    const v1, 0xa000

    .line 7
    .line 8
    .line 9
    new-array v1, v1, [B

    .line 10
    .line 11
    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-lez v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    instance-of v1, p1, Ljava/io/FileInputStream;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    array-length v0, p1

    .line 37
    invoke-direct {p0, p1, v3, v0}, Lq7/b;-><init>([BII)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>([BII)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 42
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lq7/b;->g:Ljava/lang/Object;

    .line 43
    iput-object p1, p0, Lq7/b;->h:[B

    .line 44
    iput p2, p0, Lq7/b;->i:I

    .line 45
    iput p3, p0, Lq7/b;->j:I

    const/4 p1, 0x0

    .line 46
    iput p1, p0, Lq7/b;->k:I

    return-void
.end method


# virtual methods
.method public final a(I)Lq7/b;
    .locals 3

    .line 1
    iget v0, p0, Lq7/b;->k:I

    .line 2
    .line 3
    add-int v1, v0, p1

    .line 4
    .line 5
    iget v2, p0, Lq7/b;->j:I

    .line 6
    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    if-le v1, v2, :cond_1

    .line 10
    .line 11
    :cond_0
    sub-int p1, v2, v0

    .line 12
    .line 13
    :cond_1
    iget v1, p0, Lq7/b;->i:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    new-instance v1, Lq7/b;

    .line 17
    .line 18
    iget-object v2, p0, Lq7/b;->h:[B

    .line 19
    .line 20
    invoke-direct {v1, v2, v0, p1}, Lq7/b;-><init>([BII)V

    .line 21
    .line 22
    .line 23
    return-object v1
.end method

.method public final available()I
    .locals 2

    .line 1
    iget v0, p0, Lq7/b;->j:I

    .line 2
    .line 3
    iget v1, p0, Lq7/b;->k:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    return v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq7/b;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lq7/b;->available()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public final c(I)V
    .locals 1

    .line 1
    iget v0, p0, Lq7/b;->k:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    invoke-virtual {p0, v0}, Lq7/b;->g(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final close()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lq7/b;->l:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lq7/b;->h:[B

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lq7/b;->m:I

    .line 9
    .line 10
    return-void
.end method

.method public final e([BI)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-boolean v1, p0, Lq7/b;->l:Z

    .line 6
    .line 7
    if-nez v1, :cond_5

    .line 8
    .line 9
    iget v1, p0, Lq7/b;->k:I

    .line 10
    .line 11
    iget v2, p0, Lq7/b;->j:I

    .line 12
    .line 13
    if-ge v1, v2, :cond_4

    .line 14
    .line 15
    array-length v1, p1

    .line 16
    if-le p2, v1, :cond_1

    .line 17
    .line 18
    array-length p2, p1

    .line 19
    :cond_1
    iget-object v1, p0, Lq7/b;->g:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v1

    .line 22
    :try_start_0
    iget v2, p0, Lq7/b;->i:I

    .line 23
    .line 24
    iget v3, p0, Lq7/b;->k:I

    .line 25
    .line 26
    add-int/2addr v2, v3

    .line 27
    :goto_0
    if-ge v0, p2, :cond_3

    .line 28
    .line 29
    iget-object v3, p0, Lq7/b;->h:[B

    .line 30
    .line 31
    add-int v4, v2, v0

    .line 32
    .line 33
    aget-byte v3, v3, v4

    .line 34
    .line 35
    aput-byte v3, p1, v0

    .line 36
    .line 37
    iget v3, p0, Lq7/b;->k:I

    .line 38
    .line 39
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    iput v3, p0, Lq7/b;->k:I

    .line 42
    .line 43
    iget v4, p0, Lq7/b;->j:I

    .line 44
    .line 45
    if-lt v3, v4, :cond_2

    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    :goto_1
    monitor-exit v1

    .line 56
    return v0

    .line 57
    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw p1

    .line 59
    :cond_4
    new-instance p1, Ljava/io/EOFException;

    .line 60
    .line 61
    const-string p2, "Finished reading: "

    .line 62
    .line 63
    iget v0, p0, Lq7/b;->k:I

    .line 64
    .line 65
    new-instance v1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_5
    const-string p1, "Stream is closed"

    .line 82
    .line 83
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    return p1
.end method

.method public final g(I)V
    .locals 1

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget v0, p0, Lq7/b;->j:I

    .line 6
    .line 7
    if-le p1, v0, :cond_1

    .line 8
    .line 9
    move p1, v0

    .line 10
    :cond_1
    :goto_0
    iget-object v0, p0, Lq7/b;->g:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iput p1, p0, Lq7/b;->k:I

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p1
.end method

.method public final mark(I)V
    .locals 0

    .line 1
    iput p1, p0, Lq7/b;->m:I

    .line 2
    .line 3
    return-void
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

    .line 1
    iget-boolean v0, p0, Lq7/b;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lq7/b;->k:I

    .line 6
    .line 7
    iget v1, p0, Lq7/b;->j:I

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lq7/b;->g:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iget v2, p0, Lq7/b;->i:I

    .line 15
    .line 16
    add-int/2addr v2, v0

    .line 17
    iget-object v0, p0, Lq7/b;->h:[B

    .line 18
    .line 19
    aget-byte v0, v0, v2

    .line 20
    .line 21
    and-int/lit16 v0, v0, 0xff

    .line 22
    .line 23
    iget v2, p0, Lq7/b;->k:I

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    iput v2, p0, Lq7/b;->k:I

    .line 28
    .line 29
    monitor-exit v1

    .line 30
    return v0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    throw v0

    .line 34
    :cond_0
    new-instance v1, Ljava/io/EOFException;

    .line 35
    .line 36
    const-string v2, "Finished reading: "

    .line 37
    .line 38
    invoke-static {v0, v2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {v1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v1

    .line 46
    :cond_1
    const-string v0, "Stream is closed"

    .line 47
    .line 48
    invoke-static {v0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    return v0
.end method

.method public final readShort()S
    .locals 3

    .line 1
    iget v0, p0, Lq7/b;->k:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v2, v1, [B

    .line 5
    .line 6
    invoke-virtual {p0, v2, v1}, Lq7/b;->e([BI)I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lq7/b;->g(I)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    aget-byte v0, v2, v0

    .line 14
    .line 15
    and-int/lit16 v0, v0, 0xff

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aget-byte v1, v2, v1

    .line 19
    .line 20
    and-int/lit16 v1, v1, 0xff

    .line 21
    .line 22
    shl-int/lit8 v1, v1, 0x8

    .line 23
    .line 24
    or-int/2addr v0, v1

    .line 25
    int-to-short v0, v0

    .line 26
    return v0
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq7/b;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lq7/b;->m:I

    .line 6
    .line 7
    iput v0, p0, Lq7/b;->k:I

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v0, "Can not reset stream is closed"

    .line 11
    .line 12
    invoke-static {v0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Lq7/b;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ": "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-boolean v1, p0, Lq7/b;->l:Z

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const-string v1, "Closed"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Lq7/b;->available()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    const-string v1, "Finished: "

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget v1, p0, Lq7/b;->k:I

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget v2, p0, Lq7/b;->i:I

    .line 48
    .line 49
    if-lez v2, :cond_2

    .line 50
    .line 51
    const-string v3, "START="

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v3, ", ACTUAL="

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget v3, p0, Lq7/b;->k:I

    .line 65
    .line 66
    add-int/2addr v2, v3

    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v2, ", "

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    :cond_2
    const-string v2, "POS="

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget v2, p0, Lq7/b;->k:I

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v2, ", available="

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0
.end method
