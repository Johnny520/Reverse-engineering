.class public final Lyyds/ᲈᛸᲀᛸ;
.super Lyyds/ᲁᛱᲀᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛷᲈᛸ;


# instance fields
.field public ᛱᛳᲇ:I

.field public final ᛱᲈᲁ:Lyyds/ᛳᛷᲀᛴ;

.field public ᛲᛲᲈᲈ:I

.field public ᛲᛳᛶᲁ:Lyyds/ᛴᲀᛷᛷ;

.field public final ᛲᛴᛳᛲ:Ljava/net/Socket;

.field public ᛳᲁᲁᲇ:I

.field public final ᛵᛸᛸᛷ:Lyyds/ᛱᛴᛳᛱ;

.field public ᛶᛳᛶᛵ:J

.field public final ᛶᛷᛲᲁ:Lyyds/ᛴᲀᲁᛲ;

.field public ᛷᛲᲈᛱ:Z

.field public ᛷᛵᲇᲀ:I

.field public ᛷᲈᲈᲁ:Z

.field public final ᲀᛲᛳᲀ:Lyyds/ᛶᛶᲈᛷ;

.field public final ᲇᛱᛲ:Ljava/util/ArrayList;

.field public final ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛴᛴ;

.field public final ᲇᲈᛵᛷ:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Lyyds/ᛱᛴᛳᛱ;Lyyds/ᛶᛶᲈᛷ;Ljava/net/Socket;Ljava/net/Socket;Lyyds/ᲀᲈᛴᛴ;Lyyds/ᛴᲀᲁᛲ;Lyyds/ᛳᛷᲀᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛴᛳᛱ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲈᛸᲀᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᲈᛷ;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲈᛸᲀᛸ;->ᲇᲈᛵᛷ:Ljava/net/Socket;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛴᛳᛲ:Ljava/net/Socket;

    .line 11
    .line 12
    iput-object p5, p0, Lyyds/ᲈᛸᲀᛸ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛴᛴ;

    .line 13
    .line 14
    iput-object p6, p0, Lyyds/ᲈᛸᲀᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲀᲁᛲ;

    .line 15
    .line 16
    iput-object p7, p0, Lyyds/ᲈᛸᲀᛸ;->ᛱᲈᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛳᲁᲁᲇ:I

    .line 20
    .line 21
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᲇᛱᛲ:Ljava/util/ArrayList;

    .line 27
    .line 28
    const-wide p1, 0x7fffffffffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛶᛳᛶᛵ:J

    .line 34
    .line 35
    return-void
.end method

.method public static ᲀᛲᛳᲀ(Lyyds/ᛶᛲᛷ;Lyyds/ᛶᛶᲈᛷ;Ljava/io/IOException;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lyyds/ᛶᛶᲈᛷ;->ᛵᛸᛸᛷ:Ljava/net/Proxy;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p1, Lyyds/ᛶᛶᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛷᛸᲇᛴ;

    .line 12
    .line 13
    iget-object v1, v0, Lyyds/ᛷᛸᲇᛴ;->ᛶᛷᛲᲁ:Ljava/net/ProxySelector;

    .line 14
    .line 15
    iget-object v0, v0, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 16
    .line 17
    invoke-virtual {v0}, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ()Ljava/net/URI;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v2, p1, Lyyds/ᛶᛶᲈᛷ;->ᛵᛸᛸᛷ:Ljava/net/Proxy;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p0, p0, Lyyds/ᛶᛲᛷ;->ᛲᛳᛴᛸ:Lyyds/ᲀᛵᲁᛴ;

    .line 31
    .line 32
    monitor-enter p0

    .line 33
    :try_start_0
    iget-object p2, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p2, Ljava/util/LinkedHashSet;

    .line 36
    .line 37
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    throw p1
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛸᲀᛸ;->ᲇᲈᛵᛷ:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-static {p0}, Lyyds/ᛴᛲᛲᲇ;->ᲀᛲᛳᲀ(Ljava/net/Socket;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Connection{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lyyds/ᲈᛸᲀᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᲈᛷ;

    .line 9
    .line 10
    iget-object v2, v1, Lyyds/ᛶᛶᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛷᛸᲇᛴ;

    .line 11
    .line 12
    iget-object v2, v2, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 13
    .line 14
    iget-object v2, v2, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x3a

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, Lyyds/ᛶᛶᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛷᛸᲇᛴ;

    .line 25
    .line 26
    iget-object v2, v2, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 27
    .line 28
    iget v2, v2, Lyyds/ᛱᛲᲀᛶ;->ᛲᛴᛳᛲ:I

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, ", proxy="

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, v1, Lyyds/ᛶᛶᲈᛷ;->ᛵᛸᛸᛷ:Ljava/net/Proxy;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, " hostAddress="

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, v1, Lyyds/ᛶᛶᲈᛷ;->ᲀᛲᛳᲀ:Ljava/net/InetSocketAddress;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, " cipherSuite="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lyyds/ᲈᛸᲀᛸ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛴᛴ;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget-object v1, v1, Lyyds/ᲀᲈᛴᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲈᲀᛳ;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const-string v1, "none"

    .line 66
    .line 67
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, " protocol="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, Lyyds/ᲈᛸᲀᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲀᲁᛲ;

    .line 76
    .line 77
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const/16 p0, 0x7d

    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method

.method public final ᛱᲈᲁ()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lyyds/ᲈᛸᲀᛸ;->ᛷᲈᲈᲁ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    monitor-exit p0

    .line 9
    throw v0
.end method

.method public final ᛲᛳᛶᲁ()V
    .locals 11

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lyyds/ᲈᛸᲀᛸ;->ᛶᛳᛶᛵ:J

    .line 6
    .line 7
    iget-object v0, p0, Lyyds/ᲈᛸᲀᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲀᲁᛲ;

    .line 8
    .line 9
    sget-object v1, Lyyds/ᛴᲀᲁᛲ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲀᲁᛲ;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    sget-object v1, Lyyds/ᛴᲀᲁᛲ;->ᛱᲈᲁ:Lyyds/ᛴᲀᲁᛲ;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛴᛳᛲ:Ljava/net/Socket;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lyyds/ᛷᛶᲇᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛶᲇᲁ;

    .line 26
    .line 27
    sget-object v0, Lyyds/ᛷᛷᲁᛲ;->ᛲᲈᲁ:Lyyds/ᛷᛷᲁᛲ;

    .line 28
    .line 29
    new-instance v2, Lyyds/ᛷᲀᲇᲈ;

    .line 30
    .line 31
    iget-object v3, p0, Lyyds/ᲈᛸᲀᛸ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛴᛳᛱ;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v3, v2, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object v3, Lyyds/ᲁᛱᲀᛳ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛶᛸ;

    .line 39
    .line 40
    iput-object v3, v2, Lyyds/ᛷᲀᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object v3, Lyyds/ᛷᛷᲁᛲ;->ᛲᲈᲁ:Lyyds/ᛷᛷᲁᛲ;

    .line 43
    .line 44
    iput-object v3, v2, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object v3, p0, Lyyds/ᲈᛸᲀᛸ;->ᛱᲈᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 47
    .line 48
    iget-object v4, p0, Lyyds/ᲈᛸᲀᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᲈᛷ;

    .line 49
    .line 50
    iget-object v4, v4, Lyyds/ᛶᛶᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛷᛸᲇᛴ;

    .line 51
    .line 52
    iget-object v4, v4, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 53
    .line 54
    iget-object v4, v4, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 55
    .line 56
    iput-object v3, v2, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 57
    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    sget-object v5, Lyyds/ᛴᛲᛲᲇ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const/16 v5, 0x20

    .line 69
    .line 70
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    iput-object v3, v2, Lyyds/ᛷᲀᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p0, v2, Lyyds/ᛷᲀᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object v0, v2, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 85
    .line 86
    new-instance v0, Lyyds/ᛴᲀᛷᛷ;

    .line 87
    .line 88
    invoke-direct {v0, v2}, Lyyds/ᛴᲀᛷᛷ;-><init>(Lyyds/ᛷᲀᲇᲈ;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛳᛶᲁ:Lyyds/ᛴᲀᛷᛷ;

    .line 92
    .line 93
    sget-object v2, Lyyds/ᛴᲀᛷᛷ;->ᛷᛸᲇᛶ:Lyyds/ᛷᲇᲁᛴ;

    .line 94
    .line 95
    iget v3, v2, Lyyds/ᛷᲇᲁᛴ;->ᛲᲈᲁ:I

    .line 96
    .line 97
    and-int/lit8 v3, v3, 0x8

    .line 98
    .line 99
    if-eqz v3, :cond_2

    .line 100
    .line 101
    iget-object v2, v2, Lyyds/ᛷᲇᲁᛴ;->ᛵᛸᛸᛷ:[I

    .line 102
    .line 103
    const/4 v3, 0x3

    .line 104
    aget v2, v2, v3

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    const v2, 0x7fffffff

    .line 108
    .line 109
    .line 110
    :goto_1
    iput v2, p0, Lyyds/ᲈᛸᲀᛸ;->ᛳᲁᲁᲇ:I

    .line 111
    .line 112
    iget-object p0, v0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 113
    .line 114
    const-string v2, ">> CONNECTION "

    .line 115
    .line 116
    monitor-enter p0

    .line 117
    :try_start_0
    iget-boolean v3, p0, Lyyds/ᛲᛱᛷᲀ;->ᲇᲇᲇᛱ:Z

    .line 118
    .line 119
    if-nez v3, :cond_a

    .line 120
    .line 121
    sget-object v3, Lyyds/ᛲᛱᛷᲀ;->ᛱᲈᲁ:Ljava/util/logging/Logger;

    .line 122
    .line 123
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 124
    .line 125
    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-eqz v4, :cond_3

    .line 130
    .line 131
    new-instance v4, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    sget-object v2, Lyyds/ᛳᛲᲈᛷ;->ᛲᲈᲁ:Lyyds/ᲇᲁᲀᲁ;

    .line 137
    .line 138
    invoke-virtual {v2}, Lyyds/ᲇᲁᲀᲁ;->ᲀᛲᛳᲀ()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    new-array v4, v1, [Ljava/lang/Object;

    .line 150
    .line 151
    invoke-static {v2, v4}, Lyyds/ᛴᛲᛲᲇ;->ᲇᲈᛵᛷ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v3, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :catchall_0
    move-exception v0

    .line 160
    goto/16 :goto_7

    .line 161
    .line 162
    :cond_3
    :goto_2
    iget-object v2, p0, Lyyds/ᛲᛱᛷᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲈᲇᛲᛴ;

    .line 163
    .line 164
    sget-object v3, Lyyds/ᛳᛲᲈᛷ;->ᛲᲈᲁ:Lyyds/ᲇᲁᲀᲁ;

    .line 165
    .line 166
    invoke-virtual {v2, v3}, Lyyds/ᲈᲇᛲᛴ;->ᲇᲇᲇᛱ(Lyyds/ᲇᲁᲀᲁ;)Lyyds/ᛴᛴᛱᛴ;

    .line 167
    .line 168
    .line 169
    iget-object v2, p0, Lyyds/ᛲᛱᛷᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲈᲇᛲᛴ;

    .line 170
    .line 171
    invoke-virtual {v2}, Lyyds/ᲈᲇᛲᛴ;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    .line 173
    .line 174
    monitor-exit p0

    .line 175
    iget-object p0, v0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 176
    .line 177
    iget-object v2, v0, Lyyds/ᛴᲀᛷᛷ;->ᲀᛲᛲᲇ:Lyyds/ᛷᲇᲁᛴ;

    .line 178
    .line 179
    monitor-enter p0

    .line 180
    :try_start_1
    iget-boolean v3, p0, Lyyds/ᛲᛱᛷᲀ;->ᲇᲇᲇᛱ:Z

    .line 181
    .line 182
    if-nez v3, :cond_9

    .line 183
    .line 184
    iget v3, v2, Lyyds/ᛷᲇᲁᛴ;->ᛲᲈᲁ:I

    .line 185
    .line 186
    invoke-static {v3}, Ljava/lang/Integer;->bitCount(I)I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    mul-int/lit8 v3, v3, 0x6

    .line 191
    .line 192
    const/4 v4, 0x4

    .line 193
    invoke-virtual {p0, v1, v3, v4, v1}, Lyyds/ᛲᛱᛷᲀ;->ᛶᛷᛲᲁ(IIII)V

    .line 194
    .line 195
    .line 196
    move v3, v1

    .line 197
    :goto_3
    const/16 v4, 0xa

    .line 198
    .line 199
    if-ge v3, v4, :cond_7

    .line 200
    .line 201
    const/4 v4, 0x1

    .line 202
    shl-int v5, v4, v3

    .line 203
    .line 204
    iget v6, v2, Lyyds/ᛷᲇᲁᛴ;->ᛲᲈᲁ:I

    .line 205
    .line 206
    and-int/2addr v5, v6

    .line 207
    if-eqz v5, :cond_4

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_4
    move v4, v1

    .line 211
    :goto_4
    if-eqz v4, :cond_6

    .line 212
    .line 213
    iget-object v4, p0, Lyyds/ᛲᛱᛷᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲈᲇᛲᛴ;

    .line 214
    .line 215
    iget-boolean v5, v4, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 216
    .line 217
    if-nez v5, :cond_5

    .line 218
    .line 219
    iget-object v5, v4, Lyyds/ᲈᲇᛲᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 220
    .line 221
    const/4 v6, 0x2

    .line 222
    invoke-virtual {v5, v6}, Lyyds/ᛷᛲᲈᛲ;->ᲈᛷᲈᛶ(I)Lyyds/ᛲᲈᲈᛶ;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    iget-object v7, v6, Lyyds/ᛲᲈᲈᛶ;->ᛲᲈᲁ:[B

    .line 227
    .line 228
    iget v8, v6, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 229
    .line 230
    add-int/lit8 v9, v8, 0x1

    .line 231
    .line 232
    ushr-int/lit8 v10, v3, 0x8

    .line 233
    .line 234
    and-int/lit16 v10, v10, 0xff

    .line 235
    .line 236
    int-to-byte v10, v10

    .line 237
    aput-byte v10, v7, v8

    .line 238
    .line 239
    add-int/lit8 v8, v8, 0x2

    .line 240
    .line 241
    and-int/lit16 v10, v3, 0xff

    .line 242
    .line 243
    int-to-byte v10, v10

    .line 244
    aput-byte v10, v7, v9

    .line 245
    .line 246
    iput v8, v6, Lyyds/ᛲᲈᲈᛶ;->ᲀᛲᛳᲀ:I

    .line 247
    .line 248
    iget-wide v6, v5, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 249
    .line 250
    const-wide/16 v8, 0x2

    .line 251
    .line 252
    add-long/2addr v6, v8

    .line 253
    iput-wide v6, v5, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 254
    .line 255
    invoke-virtual {v4}, Lyyds/ᲈᲇᛲᛴ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛱᛴ;

    .line 256
    .line 257
    .line 258
    iget-object v4, p0, Lyyds/ᛲᛱᛷᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲈᲇᛲᛴ;

    .line 259
    .line 260
    iget-object v5, v2, Lyyds/ᛷᲇᲁᛴ;->ᛵᛸᛸᛷ:[I

    .line 261
    .line 262
    aget v5, v5, v3

    .line 263
    .line 264
    invoke-virtual {v4, v5}, Lyyds/ᲈᲇᛲᛴ;->ᛷᲈᲈᲁ(I)Lyyds/ᛴᛴᛱᛴ;

    .line 265
    .line 266
    .line 267
    goto :goto_5

    .line 268
    :catchall_1
    move-exception v0

    .line 269
    goto :goto_6

    .line 270
    :cond_5
    const-string v0, "closed"

    .line 271
    .line 272
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 273
    .line 274
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw v1

    .line 278
    :cond_6
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_7
    iget-object v2, p0, Lyyds/ᛲᛱᛷᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲈᲇᛲᛴ;

    .line 282
    .line 283
    invoke-virtual {v2}, Lyyds/ᲈᲇᛲᛴ;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 284
    .line 285
    .line 286
    monitor-exit p0

    .line 287
    iget-object p0, v0, Lyyds/ᛴᲀᛷᛷ;->ᲀᛲᛲᲇ:Lyyds/ᛷᲇᲁᛴ;

    .line 288
    .line 289
    invoke-virtual {p0}, Lyyds/ᛷᲇᲁᛴ;->ᛲᲈᲁ()I

    .line 290
    .line 291
    .line 292
    move-result p0

    .line 293
    const v2, 0xffff

    .line 294
    .line 295
    .line 296
    if-eq p0, v2, :cond_8

    .line 297
    .line 298
    iget-object v3, v0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 299
    .line 300
    sub-int/2addr p0, v2

    .line 301
    int-to-long v4, p0

    .line 302
    invoke-virtual {v3, v1, v4, v5}, Lyyds/ᛲᛱᛷᲀ;->ᛳᛸᛴᛶ(IJ)V

    .line 303
    .line 304
    .line 305
    :cond_8
    iget-object p0, v0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 306
    .line 307
    invoke-virtual {p0}, Lyyds/ᛱᛴᛳᛱ;->ᲇᲈᛵᛷ()Lyyds/ᛱᛷᛱᛳ;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    iget-object v1, v0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 312
    .line 313
    iget-object v0, v0, Lyyds/ᛴᲀᛷᛷ;->ᛵᲀᛵᛸ:Lyyds/ᲀᛶᲁ;

    .line 314
    .line 315
    invoke-static {p0, v1, v0}, Lyyds/ᛱᛷᛱᛳ;->ᛵᛸᛸᛷ(Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

    .line 316
    .line 317
    .line 318
    return-void

    .line 319
    :cond_9
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    .line 320
    .line 321
    const-string v1, "closed"

    .line 322
    .line 323
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 327
    :goto_6
    monitor-exit p0

    .line 328
    throw v0

    .line 329
    :cond_a
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    .line 330
    .line 331
    const-string v1, "closed"

    .line 332
    .line 333
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 337
    :goto_7
    monitor-exit p0

    .line 338
    throw v0
.end method

.method public final ᛲᛴᛳᛲ(Lyyds/ᛷᛸᲇᛴ;Ljava/util/List;)Z
    .locals 8

    .line 1
    iget-object v0, p1, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 4
    .line 5
    sget-object v2, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 6
    .line 7
    iget-object v2, p0, Lyyds/ᲈᛸᲀᛸ;->ᲇᛱᛲ:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget v3, p0, Lyyds/ᲈᛸᲀᛸ;->ᛳᲁᲁᲇ:I

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-ge v2, v3, :cond_a

    .line 17
    .line 18
    iget-boolean v2, p0, Lyyds/ᲈᛸᲀᛸ;->ᛷᲈᲈᲁ:Z

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    iget-object v2, p0, Lyyds/ᲈᛸᲀᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᲈᛷ;

    .line 25
    .line 26
    iget-object v3, v2, Lyyds/ᛶᛶᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛷᛸᲇᛴ;

    .line 27
    .line 28
    iget-object v5, v2, Lyyds/ᛶᛶᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛷᛸᲇᛴ;

    .line 29
    .line 30
    invoke-virtual {v3, p1}, Lyyds/ᛷᛸᲇᛴ;->ᛲᲈᲁ(Lyyds/ᛷᛸᲇᛴ;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_1
    iget-object v3, v5, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 39
    .line 40
    iget-object v3, v3, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    :cond_2
    iget-object v3, p0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛳᛶᲁ:Lyyds/ᛴᲀᛷᛷ;

    .line 51
    .line 52
    if-nez v3, :cond_3

    .line 53
    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :cond_3
    if-eqz p2, :cond_a

    .line 57
    .line 58
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    :cond_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_a

    .line 75
    .line 76
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Lyyds/ᛶᛶᲈᛷ;

    .line 81
    .line 82
    iget-object v6, v3, Lyyds/ᛶᛶᲈᛷ;->ᛵᛸᛸᛷ:Ljava/net/Proxy;

    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    sget-object v7, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 89
    .line 90
    if-ne v6, v7, :cond_5

    .line 91
    .line 92
    iget-object v6, v2, Lyyds/ᛶᛶᲈᛷ;->ᛵᛸᛸᛷ:Ljava/net/Proxy;

    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    if-ne v6, v7, :cond_5

    .line 99
    .line 100
    iget-object v6, v2, Lyyds/ᛶᛶᲈᛷ;->ᲀᛲᛳᲀ:Ljava/net/InetSocketAddress;

    .line 101
    .line 102
    iget-object v3, v3, Lyyds/ᛶᛶᲈᛷ;->ᲀᛲᛳᲀ:Ljava/net/InetSocketAddress;

    .line 103
    .line 104
    invoke-static {v6, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_5

    .line 109
    .line 110
    iget-object p2, p1, Lyyds/ᛷᛸᲇᛴ;->ᲇᲈᛵᛷ:Ljavax/net/ssl/HostnameVerifier;

    .line 111
    .line 112
    sget-object v2, Lyyds/ᲈᲀᛷᲈ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛷᲈ;

    .line 113
    .line 114
    if-eq p2, v2, :cond_6

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_6
    sget-object p2, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 118
    .line 119
    iget-object p2, v5, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 120
    .line 121
    iget v0, v0, Lyyds/ᛱᛲᲀᛶ;->ᛲᛴᛳᛲ:I

    .line 122
    .line 123
    iget v2, p2, Lyyds/ᛱᛲᲀᛶ;->ᛲᛴᛳᛲ:I

    .line 124
    .line 125
    if-eq v0, v2, :cond_7

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_7
    iget-object p2, p2, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v1, p2}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    iget-object v0, p0, Lyyds/ᲈᛸᲀᛸ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛴᛴ;

    .line 135
    .line 136
    if-eqz p2, :cond_8

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_8
    iget-boolean p0, p0, Lyyds/ᲈᛸᲀᛸ;->ᛷᛲᲈᛱ:Z

    .line 140
    .line 141
    if-nez p0, :cond_a

    .line 142
    .line 143
    if-eqz v0, :cond_a

    .line 144
    .line 145
    invoke-virtual {v0}, Lyyds/ᲀᲈᛴᛴ;->ᛲᲈᲁ()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-nez p2, :cond_a

    .line 154
    .line 155
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    check-cast p0, Ljava/security/cert/X509Certificate;

    .line 160
    .line 161
    invoke-static {v1, p0}, Lyyds/ᲈᲀᛷᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-eqz p0, :cond_a

    .line 166
    .line 167
    :goto_0
    :try_start_0
    iget-object p0, p1, Lyyds/ᛷᛸᲇᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲁᲈᛵ;

    .line 168
    .line 169
    invoke-virtual {v0}, Lyyds/ᲀᲈᛴᛴ;->ᛲᲈᲁ()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    iget-object p0, p0, Lyyds/ᲁᲁᲈᛵ;->ᛲᲈᲁ:Ljava/util/Set;

    .line 173
    .line 174
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-nez p1, :cond_9

    .line 183
    .line 184
    :goto_1
    const/4 p0, 0x1

    .line 185
    return p0

    .line 186
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {p0}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛳᛶᛵ(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    const/4 p0, 0x0

    .line 194
    throw p0
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    :catch_0
    :cond_a
    :goto_2
    return v4
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛷᲇᲁᛴ;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p1, Lyyds/ᛷᲇᲁᛴ;->ᛲᲈᲁ:I

    .line 3
    .line 4
    and-int/lit8 v0, v0, 0x8

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p1, p1, Lyyds/ᛷᲇᲁᛴ;->ᛵᛸᛸᛷ:[I

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    aget p1, p1, v0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const p1, 0x7fffffff

    .line 15
    .line 16
    .line 17
    :goto_0
    iput p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛳᲁᲁᲇ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit p0

    .line 23
    throw p1
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᲇᲀᲁᛵ;)V
    .locals 1

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, p0, v0}, Lyyds/ᲇᲀᲁᛵ;->ᲇᲈᛵᛷ(ILjava/io/IOException;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final ᛶᛷᛲᲁ(Z)Z
    .locals 7

    .line 1
    sget-object v0, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lyyds/ᲈᛸᲀᛸ;->ᲇᲈᛵᛷ:Ljava/net/Socket;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v2, :cond_5

    .line 15
    .line 16
    iget-object v2, p0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛴᛳᛲ:Ljava/net/Socket;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_5

    .line 23
    .line 24
    iget-object v2, p0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛴᛳᛲ:Ljava/net/Socket;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/net/Socket;->isInputShutdown()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_5

    .line 31
    .line 32
    iget-object v2, p0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛴᛳᛲ:Ljava/net/Socket;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/net/Socket;->isOutputShutdown()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    iget-object v2, p0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛳᛶᲁ:Lyyds/ᛴᲀᛷᛷ;

    .line 42
    .line 43
    const/4 v4, 0x1

    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    monitor-enter v2

    .line 47
    :try_start_0
    iget-boolean p0, v2, Lyyds/ᛴᲀᛷᛷ;->ᛱᲈᲁ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    monitor-exit v2

    .line 52
    return v3

    .line 53
    :cond_1
    :try_start_1
    iget-wide p0, v2, Lyyds/ᛴᲀᛷᛷ;->ᲇᛱᛲ:J

    .line 54
    .line 55
    iget-wide v5, v2, Lyyds/ᛴᲀᛷᛷ;->ᛳᲁᲁᲇ:J

    .line 56
    .line 57
    cmp-long p0, p0, v5

    .line 58
    .line 59
    if-gez p0, :cond_2

    .line 60
    .line 61
    iget-wide p0, v2, Lyyds/ᛴᲀᛷᛷ;->ᛶᛳᛶᛵ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    cmp-long p0, v0, p0

    .line 64
    .line 65
    if-ltz p0, :cond_2

    .line 66
    .line 67
    monitor-exit v2

    .line 68
    return v3

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    monitor-exit v2

    .line 72
    return v4

    .line 73
    :goto_0
    monitor-exit v2

    .line 74
    throw p0

    .line 75
    :cond_3
    monitor-enter p0

    .line 76
    :try_start_2
    iget-wide v5, p0, Lyyds/ᲈᛸᲀᛸ;->ᛶᛳᛶᛵ:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 77
    .line 78
    sub-long/2addr v0, v5

    .line 79
    monitor-exit p0

    .line 80
    const-wide v5, 0x2540be400L

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    cmp-long v0, v0, v5

    .line 86
    .line 87
    if-ltz v0, :cond_4

    .line 88
    .line 89
    if-eqz p1, :cond_4

    .line 90
    .line 91
    iget-object p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛴᛳᛲ:Ljava/net/Socket;

    .line 92
    .line 93
    iget-object p0, p0, Lyyds/ᲈᛸᲀᛸ;->ᛱᲈᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 94
    .line 95
    iget-object p0, p0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p0, Lyyds/ᲀᲀᛵᲈ;

    .line 98
    .line 99
    :try_start_3
    invoke-virtual {p1}, Ljava/net/Socket;->getSoTimeout()I

    .line 100
    .line 101
    .line 102
    move-result v0
    :try_end_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 103
    :try_start_4
    invoke-virtual {p1, v4}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lyyds/ᲀᲀᛵᲈ;->ᛲᲈᲁ()Z

    .line 107
    .line 108
    .line 109
    move-result p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 110
    xor-int/2addr p0, v4

    .line 111
    :try_start_5
    invoke-virtual {p1, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 112
    .line 113
    .line 114
    return p0

    .line 115
    :catchall_1
    move-exception p0

    .line 116
    invoke-virtual {p1, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 117
    .line 118
    .line 119
    throw p0
    :try_end_5
    .catch Ljava/net/SocketTimeoutException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 120
    :catch_0
    move v3, v4

    .line 121
    :catch_1
    return v3

    .line 122
    :cond_4
    return v4

    .line 123
    :catchall_2
    move-exception p1

    .line 124
    monitor-exit p0

    .line 125
    throw p1

    .line 126
    :cond_5
    :goto_1
    return v3
.end method

.method public final ᲇᲇᲇᛱ()Lyyds/ᛶᛶᲈᛷ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛸᲀᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᲈᛷ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᲈᲀᛱᛷ;Ljava/io/IOException;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    instance-of v0, p2, Lyyds/ᲈᛱᲈᲈ;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    move-object v0, p2

    .line 8
    check-cast v0, Lyyds/ᲈᛱᲈᲈ;

    .line 9
    .line 10
    iget v0, v0, Lyyds/ᲈᛱᲈᲈ;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    iget p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛱᛳᲇ:I

    .line 17
    .line 18
    add-int/2addr p1, v1

    .line 19
    iput p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛱᛳᲇ:I

    .line 20
    .line 21
    if-le p1, v1, :cond_6

    .line 22
    .line 23
    iput-boolean v1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛷᲈᲈᲁ:Z

    .line 24
    .line 25
    iget p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛷᛵᲇᲀ:I

    .line 26
    .line 27
    add-int/2addr p1, v1

    .line 28
    iput p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛷᛵᲇᲀ:I

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    check-cast p2, Lyyds/ᲈᛱᲈᲈ;

    .line 34
    .line 35
    iget p2, p2, Lyyds/ᲈᛱᲈᲈ;->ᲀᛲᛳᲀ:I

    .line 36
    .line 37
    const/16 v0, 0x9

    .line 38
    .line 39
    if-ne p2, v0, :cond_1

    .line 40
    .line 41
    iget-boolean p1, p1, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛲᲇ:Z

    .line 42
    .line 43
    if-nez p1, :cond_6

    .line 44
    .line 45
    :cond_1
    iput-boolean v1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛷᲈᲈᲁ:Z

    .line 46
    .line 47
    iget p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛷᛵᲇᲀ:I

    .line 48
    .line 49
    add-int/2addr p1, v1

    .line 50
    iput p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛷᛵᲇᲀ:I

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iget-object v0, p0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛳᛶᲁ:Lyyds/ᛴᲀᛷᛷ;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    move v0, v1

    .line 58
    goto :goto_0

    .line 59
    :cond_3
    const/4 v0, 0x0

    .line 60
    :goto_0
    if-eqz v0, :cond_4

    .line 61
    .line 62
    instance-of v0, p2, Lyyds/ᛷᛲᛷᲀ;

    .line 63
    .line 64
    if-eqz v0, :cond_6

    .line 65
    .line 66
    :cond_4
    iput-boolean v1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛷᲈᲈᲁ:Z

    .line 67
    .line 68
    iget v0, p0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛲᲈᲈ:I

    .line 69
    .line 70
    if-nez v0, :cond_6

    .line 71
    .line 72
    if-eqz p2, :cond_5

    .line 73
    .line 74
    iget-object p1, p1, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 75
    .line 76
    iget-object v0, p0, Lyyds/ᲈᛸᲀᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᲈᛷ;

    .line 77
    .line 78
    invoke-static {p1, v0, p2}, Lyyds/ᲈᛸᲀᛸ;->ᲀᛲᛳᲀ(Lyyds/ᛶᛲᛷ;Lyyds/ᛶᛶᲈᛷ;Ljava/io/IOException;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    iget p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛷᛵᲇᲀ:I

    .line 82
    .line 83
    add-int/2addr p1, v1

    .line 84
    iput p1, p0, Lyyds/ᲈᛸᲀᛸ;->ᛷᛵᲇᲀ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    :cond_6
    :goto_1
    monitor-exit p0

    .line 87
    return-void

    .line 88
    :goto_2
    monitor-exit p0

    .line 89
    throw p1
.end method
