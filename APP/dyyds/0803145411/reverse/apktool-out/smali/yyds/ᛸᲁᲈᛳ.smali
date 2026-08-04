.class public final Lyyds/ᛸᲁᲈᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲀᛳᲇᲁ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲇᲈ;

.field public final ᲀᛲᛳᲀ:Ljava/io/OutputStream;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛶᲇᛳᛵ;


# direct methods
.method public constructor <init>(Lyyds/ᛲᛲᲇᲈ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᲁᲈᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲇᲈ;

    .line 5
    .line 6
    iget-object p1, p1, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljava/net/Socket;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lyyds/ᛸᲁᲈᛳ;->ᲀᛲᛳᲀ:Ljava/io/OutputStream;

    .line 15
    .line 16
    new-instance v0, Lyyds/ᛶᲇᛳᛵ;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lyyds/ᛶᲇᛳᛵ;-><init>(Ljava/net/Socket;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lyyds/ᛸᲁᲈᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲇᛳᛵ;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛸᲁᲈᛳ;->ᲀᛲᛳᲀ:Ljava/io/OutputStream;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛸᲁᲈᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲇᲈ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛸᲁᲈᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲇᛳᛵ;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᛲᛳᛶᲈ;->ᛱᲈᲁ()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object v2, v1, Lyyds/ᛲᛲᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    iget-object v1, v1, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/net/Socket;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    and-int/lit8 v4, v3, 0x1

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    or-int/lit8 v4, v3, 0x1

    .line 29
    .line 30
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    move v2, v4

    .line 37
    :goto_0
    if-eqz v2, :cond_6

    .line 38
    .line 39
    const/4 v3, 0x3

    .line 40
    if-eq v2, v3, :cond_4

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/net/Socket;->isClosed()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_3

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/net/Socket;->isOutputShutdown()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    :try_start_1
    invoke-virtual {v1}, Ljava/net/Socket;->shutdownOutput()V
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto :goto_5

    .line 64
    :catch_0
    move-exception v0

    .line 65
    goto :goto_3

    .line 66
    :catch_1
    :try_start_2
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    :try_start_3
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 75
    .line 76
    .line 77
    :goto_2
    invoke-virtual {p0}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_5

    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    const/4 v0, 0x0

    .line 85
    invoke-virtual {p0, v0}, Lyyds/ᛶᲇᛳᛵ;->ᛷᛲᲈᛱ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    throw p0

    .line 90
    :cond_6
    invoke-virtual {p0}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :goto_3
    :try_start_4
    invoke-virtual {p0}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_7

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_7
    invoke-virtual {p0, v0}, Lyyds/ᛶᲇᛳᛵ;->ᛷᛲᲈᛱ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :goto_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 106
    :goto_5
    invoke-virtual {p0}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 107
    .line 108
    .line 109
    throw v0
.end method

.method public final flush()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛸᲁᲈᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲇᛳᛵ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᛲᛳᛶᲈ;->ᛱᲈᲁ()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p0, p0, Lyyds/ᛸᲁᲈᛳ;->ᲀᛲᛳᲀ:Ljava/io/OutputStream;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    invoke-virtual {v0, p0}, Lyyds/ᛶᲇᛳᛵ;->ᛷᛲᲈᛱ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    throw p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :catch_0
    move-exception p0

    .line 27
    :try_start_1
    invoke-virtual {v0}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v0, p0}, Lyyds/ᛶᲇᛳᛵ;->ᛷᛲᲈᛱ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :goto_0
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    :goto_1
    invoke-virtual {v0}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "sink("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛸᲁᲈᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲇᲈ;

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/net/Socket;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 p0, 0x29

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final ᛱᛳᲇ(JLyyds/ᛷᛲᲈᛲ;)V
    .locals 6

    .line 1
    iget-wide v0, p3, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    move-wide v4, p1

    .line 6
    invoke-static/range {v0 .. v5}, Lyyds/ᲁᛴᛵᛱ;->ᛵᛸᛸᛷ(JJJ)V

    .line 7
    .line 8
    .line 9
    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    cmp-long v0, p1, v0

    .line 12
    .line 13
    if-lez v0, :cond_3

    .line 14
    .line 15
    iget-object v1, p0, Lyyds/ᛸᲁᲈᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲇᛳᛵ;

    .line 16
    .line 17
    invoke-virtual {v1}, Lyyds/ᲈᲁᛴᛲ;->ᲇᲇᲇᛱ()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p3, Lyyds/ᛷᛲᲈᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲈᲈᛶ;

    .line 21
    .line 22
    iget v2, v0, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 23
    .line 24
    iget v3, v0, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 25
    .line 26
    sub-int/2addr v2, v3

    .line 27
    int-to-long v2, v2

    .line 28
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    long-to-int v2, v2

    .line 33
    invoke-virtual {v1}, Lyyds/ᛲᛳᛶᲈ;->ᛱᲈᲁ()V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object v3, p0, Lyyds/ᛸᲁᲈᛳ;->ᲀᛲᛳᲀ:Ljava/io/OutputStream;

    .line 37
    .line 38
    iget-object v4, v0, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ:[B

    .line 39
    .line 40
    iget v5, v0, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 41
    .line 42
    invoke-virtual {v3, v4, v5, v2}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    iget v1, v0, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 52
    .line 53
    add-int/2addr v1, v2

    .line 54
    iput v1, v0, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 55
    .line 56
    int-to-long v2, v2

    .line 57
    sub-long/2addr p1, v2

    .line 58
    iget-wide v4, p3, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 59
    .line 60
    sub-long/2addr v4, v2

    .line 61
    iput-wide v4, p3, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 62
    .line 63
    iget v2, v0, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 64
    .line 65
    if-ne v1, v2, :cond_0

    .line 66
    .line 67
    invoke-virtual {v0}, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ()Lyyds/ᛲᲈᲈᛶ;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iput-object v1, p3, Lyyds/ᛷᛲᲈᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲈᲈᛶ;

    .line 72
    .line 73
    invoke-static {v0}, Lyyds/ᛷᛱᛵᛵ;->ᛲᲈᲁ(Lyyds/ᛲᲈᲈᛶ;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    const/4 p0, 0x0

    .line 78
    invoke-virtual {v1, p0}, Lyyds/ᛶᲇᛳᛵ;->ᛷᛲᲈᛱ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    throw p0

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    move-object p0, v0

    .line 85
    goto :goto_2

    .line 86
    :catch_0
    move-exception v0

    .line 87
    move-object p0, v0

    .line 88
    :try_start_1
    invoke-virtual {v1}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    invoke-virtual {v1, p0}, Lyyds/ᛶᲇᛳᛵ;->ᛷᛲᲈᛱ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :goto_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    :goto_2
    invoke-virtual {v1}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 101
    .line 102
    .line 103
    throw p0

    .line 104
    :cond_3
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᲁᲈᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲇᛳᛵ;

    .line 2
    .line 3
    return-object p0
.end method
