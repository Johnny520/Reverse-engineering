.class public final Lokio/internal/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲世苏;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Lokio/internal/飘花落叶言子楪世兰苏哲;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokio/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 5
    .line 6
    iget-object p1, p1, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

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
    iput-object v0, p0, Lokio/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;

    .line 15
    .line 16
    new-instance v0, Lokio/internal/飘花落叶言子楪世兰苏哲;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lokio/internal/飘花落叶言子楪世兰苏哲;-><init>(Ljava/net/Socket;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lokio/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Lokio/internal/飘花落叶言子楪世兰苏哲;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lokio/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 2
    .line 3
    iget-object v1, p0, Lokio/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Lokio/internal/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v2, v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/net/Socket;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    and-int/lit8 v4, v3, 0x2

    .line 24
    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    or-int/lit8 v4, v3, 0x2

    .line 30
    .line 31
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    move v2, v4

    .line 38
    :goto_0
    if-eqz v2, :cond_6

    .line 39
    .line 40
    const/4 v3, 0x3

    .line 41
    if-eq v2, v3, :cond_4

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    .line 50
    .line 51
    .line 52
    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :try_start_1
    invoke-virtual {v0}, Ljava/net/Socket;->shutdownInput()V
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    goto :goto_5

    .line 62
    :catch_0
    move-exception p0

    .line 63
    goto :goto_3

    .line 64
    :catch_1
    :try_start_2
    iget-object p0, p0, Lokio/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
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
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()Z

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    :try_start_3
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 75
    .line 76
    .line 77
    :goto_2
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-nez p0, :cond_5

    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    const/4 p0, 0x0

    .line 85
    invoke-virtual {v1, p0}, Lokio/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(Ljava/io/IOException;)Ljava/io/IOException;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    throw p0

    .line 90
    :cond_6
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()Z

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :goto_3
    :try_start_4
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_7

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_7
    invoke-virtual {v1, p0}, Lokio/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(Ljava/io/IOException;)Ljava/io/IOException;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :goto_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 106
    :goto_5
    invoke-virtual {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()Z

    .line 107
    .line 108
    .line 109
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
    iget-object p0, p0, Lokio/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

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

.method public final 飘花落叶言子哲苏兰楪世(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;J)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lokio/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Lokio/internal/飘花落叶言子楪世兰苏哲;

    .line 5
    .line 6
    invoke-virtual {p2}, L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰哲苏()V

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x1

    .line 10
    invoke-virtual {p1, p3}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏楪哲世兰(I)L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    iget v0, p3, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 15
    .line 16
    rsub-int v0, v0, 0x2000

    .line 17
    .line 18
    int-to-long v0, v0

    .line 19
    const-wide/16 v2, 0x2000

    .line 20
    .line 21
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    long-to-int v0, v0

    .line 26
    :try_start_0
    invoke-virtual {p2}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲()V
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1

    .line 27
    .line 28
    .line 29
    :try_start_1
    iget-object p0, p0, Lokio/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/io/InputStream;

    .line 30
    .line 31
    iget-object v1, p3, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:[B

    .line 32
    .line 33
    iget v2, p3, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 34
    .line 35
    invoke-virtual {p0, v1, v2, v0}, Ljava/io/InputStream;->read([BII)I

    .line 36
    .line 37
    .line 38
    move-result p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    :try_start_2
    invoke-virtual {p2}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()Z

    .line 40
    .line 41
    .line 42
    move-result v0
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_1

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    const/4 p2, -0x1

    .line 46
    if-ne p0, p2, :cond_1

    .line 47
    .line 48
    iget p0, p3, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 49
    .line 50
    iget p2, p3, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 51
    .line 52
    if-ne p0, p2, :cond_0

    .line 53
    .line 54
    invoke-virtual {p3}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    iput-object p0, p1, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;

    .line 59
    .line 60
    invoke-static {p3}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    const-wide/16 p0, -0x1

    .line 64
    .line 65
    return-wide p0

    .line 66
    :cond_1
    iget p2, p3, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 67
    .line 68
    add-int/2addr p2, p0

    .line 69
    iput p2, p3, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 70
    .line 71
    iget-wide p2, p1, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:J

    .line 72
    .line 73
    int-to-long v0, p0

    .line 74
    add-long/2addr p2, v0

    .line 75
    iput-wide p2, p1, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:J

    .line 76
    .line 77
    return-wide v0

    .line 78
    :cond_2
    const/4 p0, 0x0

    .line 79
    :try_start_3
    invoke-virtual {p2, p0}, Lokio/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(Ljava/io/IOException;)Ljava/io/IOException;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    throw p0
    :try_end_3
    .catch Ljava/lang/AssertionError; {:try_start_3 .. :try_end_3} :catch_1

    .line 84
    :catchall_0
    move-exception p0

    .line 85
    goto :goto_1

    .line 86
    :catch_0
    move-exception p0

    .line 87
    :try_start_4
    invoke-virtual {p2}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_3

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    invoke-virtual {p2, p0}, Lokio/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(Ljava/io/IOException;)Ljava/io/IOException;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 99
    :goto_1
    :try_start_5
    invoke-virtual {p2}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()Z

    .line 100
    .line 101
    .line 102
    throw p0
    :try_end_5
    .catch Ljava/lang/AssertionError; {:try_start_5 .. :try_end_5} :catch_1

    .line 103
    :catch_1
    move-exception p0

    .line 104
    invoke-static {p0}, Lokio/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/AssertionError;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_4

    .line 109
    .line 110
    new-instance p1, Ljava/io/IOException;

    .line 111
    .line 112
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_4
    throw p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lokio/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Lokio/internal/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    return-object p0
.end method
