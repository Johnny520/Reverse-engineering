.class public final Lyyds/ᛲᛶᛱᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛷᛳᛷ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲇᲈ;

.field public final ᲀᛲᛳᲀ:Ljava/io/InputStream;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛶᲇᛳᛵ;


# direct methods
.method public constructor <init>(Lyyds/ᛲᛲᲇᲈ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛲᛶᛱᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲇᲈ;

    .line 5
    .line 6
    iget-object p1, p1, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljava/net/Socket;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lyyds/ᛲᛶᛱᛲ;->ᲀᛲᛳᲀ:Ljava/io/InputStream;

    .line 15
    .line 16
    new-instance v0, Lyyds/ᛶᲇᛳᛵ;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lyyds/ᛶᲇᛳᛵ;-><init>(Ljava/net/Socket;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lyyds/ᛲᛶᛱᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲇᛳᛵ;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛶᛱᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲇᲈ;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛲᛶᛱᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲇᛳᛵ;

    .line 4
    .line 5
    invoke-virtual {v1}, Lyyds/ᛲᛳᛶᲈ;->ᛱᲈᲁ()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v2, v0, Lyyds/ᛲᛲᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    iget-object v0, v0, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/net/Socket;

    .line 15
    .line 16
    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    and-int/lit8 v4, v3, 0x2

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    or-int/lit8 v4, v3, 0x2

    .line 27
    .line 28
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    move v2, v4

    .line 35
    :goto_0
    if-eqz v2, :cond_6

    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    if-eq v2, v3, :cond_4

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    .line 47
    .line 48
    .line 49
    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :try_start_1
    invoke-virtual {v0}, Ljava/net/Socket;->shutdownInput()V
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_5

    .line 59
    :catch_0
    move-exception p0

    .line 60
    goto :goto_3

    .line 61
    :catch_1
    :try_start_2
    iget-object p0, p0, Lyyds/ᛲᛶᛱᛲ;->ᲀᛲᛳᲀ:Ljava/io/InputStream;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    :goto_1
    invoke-virtual {v1}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    :try_start_3
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 72
    .line 73
    .line 74
    :goto_2
    invoke-virtual {v1}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-nez p0, :cond_5

    .line 79
    .line 80
    return-void

    .line 81
    :cond_5
    const/4 p0, 0x0

    .line 82
    invoke-virtual {v1, p0}, Lyyds/ᛶᲇᛳᛵ;->ᛷᛲᲈᛱ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    throw p0

    .line 87
    :cond_6
    invoke-virtual {v1}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :goto_3
    :try_start_4
    invoke-virtual {v1}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_7

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_7
    invoke-virtual {v1, p0}, Lyyds/ᛶᲇᛳᛵ;->ᛷᛲᲈᛱ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    :goto_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 103
    :goto_5
    invoke-virtual {v1}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 104
    .line 105
    .line 106
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "source("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛲᛶᛱᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᲇᲈ;

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

.method public final ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J
    .locals 4

    .line 1
    iget-object p1, p0, Lyyds/ᛲᛶᛱᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲇᛳᛵ;

    .line 2
    .line 3
    invoke-virtual {p1}, Lyyds/ᲈᲁᛴᛲ;->ᲇᲇᲇᛱ()V

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    invoke-virtual {p3, p2}, Lyyds/ᛷᛲᲈᛲ;->ᲈᛷᲈᛶ(I)Lyyds/ᛲᲈᲈᛶ;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget v0, p2, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 12
    .line 13
    rsub-int v0, v0, 0x2000

    .line 14
    .line 15
    int-to-long v0, v0

    .line 16
    const-wide/16 v2, 0x2000

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    long-to-int v0, v0

    .line 23
    :try_start_0
    invoke-virtual {p1}, Lyyds/ᛲᛳᛶᲈ;->ᛱᲈᲁ()V
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1

    .line 24
    .line 25
    .line 26
    :try_start_1
    iget-object p0, p0, Lyyds/ᛲᛶᛱᛲ;->ᲀᛲᛳᲀ:Ljava/io/InputStream;

    .line 27
    .line 28
    iget-object v1, p2, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ:[B

    .line 29
    .line 30
    iget v2, p2, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 31
    .line 32
    invoke-virtual {p0, v1, v2, v0}, Ljava/io/InputStream;->read([BII)I

    .line 33
    .line 34
    .line 35
    move-result p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :try_start_2
    invoke-virtual {p1}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 37
    .line 38
    .line 39
    move-result v0
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_1

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    const/4 p1, -0x1

    .line 43
    if-ne p0, p1, :cond_1

    .line 44
    .line 45
    iget p0, p2, Lyyds/ᛲᲈᲈᛶ;->ᛵᛸᛸᛷ:I

    .line 46
    .line 47
    iget p1, p2, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 48
    .line 49
    if-ne p0, p1, :cond_0

    .line 50
    .line 51
    invoke-virtual {p2}, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ()Lyyds/ᛲᲈᲈᛶ;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iput-object p0, p3, Lyyds/ᛷᛲᲈᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲈᲈᛶ;

    .line 56
    .line 57
    invoke-static {p2}, Lyyds/ᛷᛱᛵᛵ;->ᛲᲈᲁ(Lyyds/ᛲᲈᲈᛶ;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    const-wide/16 p0, -0x1

    .line 61
    .line 62
    return-wide p0

    .line 63
    :cond_1
    iget p1, p2, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 64
    .line 65
    add-int/2addr p1, p0

    .line 66
    iput p1, p2, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 67
    .line 68
    iget-wide p1, p3, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 69
    .line 70
    int-to-long v0, p0

    .line 71
    add-long/2addr p1, v0

    .line 72
    iput-wide p1, p3, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 73
    .line 74
    return-wide v0

    .line 75
    :cond_2
    const/4 p0, 0x0

    .line 76
    :try_start_3
    invoke-virtual {p1, p0}, Lyyds/ᛶᲇᛳᛵ;->ᛷᛲᲈᛱ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    throw p0
    :try_end_3
    .catch Ljava/lang/AssertionError; {:try_start_3 .. :try_end_3} :catch_1

    .line 81
    :catchall_0
    move-exception p0

    .line 82
    goto :goto_1

    .line 83
    :catch_0
    move-exception p0

    .line 84
    :try_start_4
    invoke-virtual {p1}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-nez p2, :cond_3

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    invoke-virtual {p1, p0}, Lyyds/ᛶᲇᛳᛵ;->ᛷᛲᲈᛱ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 96
    :goto_1
    :try_start_5
    invoke-virtual {p1}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 97
    .line 98
    .line 99
    throw p0
    :try_end_5
    .catch Ljava/lang/AssertionError; {:try_start_5 .. :try_end_5} :catch_1

    .line 100
    :catch_1
    move-exception p0

    .line 101
    invoke-static {p0}, Lyyds/ᛵᛶᲀᛱ;->ᛲᲈᲁ(Ljava/lang/AssertionError;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_4

    .line 106
    .line 107
    new-instance p1, Ljava/io/IOException;

    .line 108
    .line 109
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    throw p1

    .line 113
    :cond_4
    throw p0
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᛶᛱᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲇᛳᛵ;

    .line 2
    .line 3
    return-object p0
.end method
