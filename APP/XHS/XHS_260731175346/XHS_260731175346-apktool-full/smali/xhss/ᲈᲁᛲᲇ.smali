.class public final Lxhss/ᲈᲁᛲᲇ;
.super Lxhss/ᲇᛸᲈᛷ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲀᲀᲁᛱ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛸᛱᛴᛳ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛱᛷᲁᛶ;

.field public ᛳᲈᲈᛲ:I

.field public final ᛶᲇᲈᛸ:Ljava/util/ArrayList;

.field public final ᛷᛴᛷᛱ:Ljava/net/Socket;

.field public ᛷᲁᲁ:I

.field public ᛸᛲᲀᛵ:Lxhss/ᲁᛲᛵ;

.field public final ᛸᛴᛶᛳ:Lxhss/ᛷᛱᛳᲁ;

.field public ᛸᛶᛴᲈ:J

.field public ᛸᛶᲈᛶ:I

.field public ᛸᛷᲈᲈ:Z

.field public final ᲀᲇᛳᲁ:Lxhss/ᲈᛲᛵᛴ;

.field public final ᲇᛴᲇᛵ:Ljava/net/Socket;

.field public final ᲇᛶᛴᲀ:Lxhss/ᛵᛲᛸᛲ;

.field public ᲇᛸᛳᲁ:I

.field public ᲈᛳᲀ:Z


# direct methods
.method public constructor <init>(Lxhss/ᛸᛱᛴᛳ;Lxhss/ᛱᛷᲁᛶ;Ljava/net/Socket;Ljava/net/Socket;Lxhss/ᛵᛲᛸᛲ;Lxhss/ᲈᛲᛵᛴ;Lxhss/ᛷᛱᛳᲁ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛱᛴᛳ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᲈᲁᛲᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᲁᛶ;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᲈᲁᛲᲇ;->ᲇᛴᲇᛵ:Ljava/net/Socket;

    .line 9
    .line 10
    iput-object p4, p0, Lxhss/ᲈᲁᛲᲇ;->ᛷᛴᛷᛱ:Ljava/net/Socket;

    .line 11
    .line 12
    iput-object p5, p0, Lxhss/ᲈᲁᛲᲇ;->ᲇᛶᛴᲀ:Lxhss/ᛵᛲᛸᛲ;

    .line 13
    .line 14
    iput-object p6, p0, Lxhss/ᲈᲁᛲᲇ;->ᲀᲇᛳᲁ:Lxhss/ᲈᛲᛵᛴ;

    .line 15
    .line 16
    iput-object p7, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛱᛳᲁ;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛳᲈᲈᛲ:I

    .line 20
    .line 21
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛶᲇᲈᛸ:Ljava/util/ArrayList;

    .line 27
    .line 28
    const-wide p1, 0x7fffffffffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛶᛴᲈ:J

    .line 34
    .line 35
    return-void
.end method

.method public static ᛳᲁᲇᛸ(Lxhss/ᛵᛸᛷᛲ;Lxhss/ᛱᛷᲁᛶ;Ljava/io/IOException;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lxhss/ᛱᛷᲁᛶ;->ᛱᛱᛲᲇ:Ljava/net/Proxy;

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
    iget-object v0, p1, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 12
    .line 13
    iget-object v1, v0, Lxhss/ᛵᲈᛱᛳ;->ᲀᲇᛳᲁ:Ljava/net/ProxySelector;

    .line 14
    .line 15
    iget-object v0, v0, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 16
    .line 17
    invoke-virtual {v0}, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ()Ljava/net/URI;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v2, p1, Lxhss/ᛱᛷᲁᛶ;->ᛱᛱᛲᲇ:Ljava/net/Proxy;

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
    iget-object p0, p0, Lxhss/ᛵᛸᛷᛲ;->ᛱᛳᲁᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 31
    .line 32
    monitor-enter p0

    .line 33
    :try_start_0
    iget-object p2, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

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
    iget-object p0, p0, Lxhss/ᲈᲁᛲᲇ;->ᲇᛴᲇᛵ:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-static {p0}, Lxhss/ᛶᛴᲀᛲ;->ᛳᲁᲇᛸ(Ljava/net/Socket;)V

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
    iget-object v1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᲁᛶ;

    .line 9
    .line 10
    iget-object v2, v1, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 11
    .line 12
    iget-object v2, v2, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 13
    .line 14
    iget-object v2, v2, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

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
    iget-object v2, v1, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 25
    .line 26
    iget-object v2, v2, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 27
    .line 28
    iget v2, v2, Lxhss/ᛷᛶᲁᛵ;->ᛷᛴᛷᛱ:I

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
    iget-object v2, v1, Lxhss/ᛱᛷᲁᛶ;->ᛱᛱᛲᲇ:Ljava/net/Proxy;

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
    iget-object v1, v1, Lxhss/ᛱᛷᲁᛶ;->ᛳᲁᲇᛸ:Ljava/net/InetSocketAddress;

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
    iget-object v1, p0, Lxhss/ᲈᲁᛲᲇ;->ᲇᛶᛴᲀ:Lxhss/ᛵᛲᛸᛲ;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget-object v1, v1, Lxhss/ᛵᛲᛸᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛳᲁᲇᲀ;

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
    iget-object p0, p0, Lxhss/ᲈᲁᛲᲇ;->ᲀᲇᛳᲁ:Lxhss/ᲈᛲᛵᛴ;

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

.method public final ᛱᛱᛲᲇ(Lxhss/ᛸᛳᛴ;)V
    .locals 1

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, p0, v0}, Lxhss/ᛸᛳᛴ;->ᛳᲁᲇᛸ(ILjava/io/IOException;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final ᛷᛴᛷᛱ()Lxhss/ᛱᛷᲁᛶ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲈᲁᛲᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᲁᛶ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᛴᲇᛳᲇ;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p1, Lxhss/ᛴᲇᛳᲇ;->ᛷᛵᛵᲈ:I

    .line 3
    .line 4
    and-int/lit8 v0, v0, 0x8

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p1, p1, Lxhss/ᛴᲇᛳᲇ;->ᛱᛱᛲᲇ:[I

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
    iput p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛳᲈᲈᛲ:I
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

.method public final ᛸᛲᲀᛵ()V
    .locals 11

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛶᛴᲈ:J

    .line 6
    .line 7
    iget-object v0, p0, Lxhss/ᲈᲁᛲᲇ;->ᲀᲇᛳᲁ:Lxhss/ᲈᛲᛵᛴ;

    .line 8
    .line 9
    sget-object v1, Lxhss/ᲈᛲᛵᛴ;->ᲇᛶᛴᲀ:Lxhss/ᲈᛲᛵᛴ;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    sget-object v1, Lxhss/ᲈᛲᛵᛴ;->ᲀᲇᛳᲁ:Lxhss/ᲈᛲᛵᛴ;

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
    iget-object v0, p0, Lxhss/ᲈᲁᛲᲇ;->ᛷᛴᛷᛱ:Ljava/net/Socket;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lxhss/ᛳᛴᲀᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛳᛴᲀᲁ;

    .line 26
    .line 27
    sget-object v0, Lxhss/ᛵᛷᛷᲀ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᛷᲀ;

    .line 28
    .line 29
    new-instance v2, Lxhss/ᛴᛴᛴᛵ;

    .line 30
    .line 31
    iget-object v3, p0, Lxhss/ᲈᲁᛲᲇ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛱᛴᛳ;

    .line 32
    .line 33
    invoke-direct {v2, v3}, Lxhss/ᛴᛴᛴᛵ;-><init>(Lxhss/ᛸᛱᛴᛳ;)V

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛱᛳᲁ;

    .line 37
    .line 38
    iget-object v4, p0, Lxhss/ᲈᲁᛲᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᲁᛶ;

    .line 39
    .line 40
    iget-object v4, v4, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 41
    .line 42
    iget-object v4, v4, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 43
    .line 44
    iget-object v4, v4, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 45
    .line 46
    iput-object v3, v2, Lxhss/ᛴᛴᛴᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 47
    .line 48
    new-instance v3, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v5, Lxhss/ᛶᛴᲀᛲ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const/16 v5, 0x20

    .line 59
    .line 60
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iput-object v3, v2, Lxhss/ᛴᛴᛴᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object p0, v2, Lxhss/ᛴᛴᛴᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v0, v2, Lxhss/ᛴᛴᛴᛵ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 75
    .line 76
    new-instance v0, Lxhss/ᲁᛲᛵ;

    .line 77
    .line 78
    invoke-direct {v0, v2}, Lxhss/ᲁᛲᛵ;-><init>(Lxhss/ᛴᛴᛴᛵ;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛲᲀᛵ:Lxhss/ᲁᛲᛵ;

    .line 82
    .line 83
    sget-object v2, Lxhss/ᲁᛲᛵ;->ᛲᛴᲇᛲ:Lxhss/ᛴᲇᛳᲇ;

    .line 84
    .line 85
    iget v3, v2, Lxhss/ᛴᲇᛳᲇ;->ᛷᛵᛵᲈ:I

    .line 86
    .line 87
    and-int/lit8 v3, v3, 0x8

    .line 88
    .line 89
    if-eqz v3, :cond_2

    .line 90
    .line 91
    iget-object v2, v2, Lxhss/ᛴᲇᛳᲇ;->ᛱᛱᛲᲇ:[I

    .line 92
    .line 93
    const/4 v3, 0x3

    .line 94
    aget v2, v2, v3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    const v2, 0x7fffffff

    .line 98
    .line 99
    .line 100
    :goto_1
    iput v2, p0, Lxhss/ᲈᲁᛲᲇ;->ᛳᲈᲈᛲ:I

    .line 101
    .line 102
    iget-object p0, v0, Lxhss/ᲁᛲᛵ;->ᲀᛷᲁᲀ:Lxhss/ᲀᛱᛶᛳ;

    .line 103
    .line 104
    const-string v2, ">> CONNECTION "

    .line 105
    .line 106
    monitor-enter p0

    .line 107
    :try_start_0
    iget-boolean v3, p0, Lxhss/ᲀᛱᛶᛳ;->ᛷᛴᛷᛱ:Z

    .line 108
    .line 109
    if-nez v3, :cond_b

    .line 110
    .line 111
    sget-object v3, Lxhss/ᲀᛱᛶᛳ;->ᲀᲇᛳᲁ:Ljava/util/logging/Logger;

    .line 112
    .line 113
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 114
    .line 115
    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_3

    .line 120
    .line 121
    new-instance v4, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    sget-object v2, Lxhss/ᲁᛱᛱᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛶᲈᲈ;

    .line 127
    .line 128
    invoke-virtual {v2}, Lxhss/ᛳᛶᲈᲈ;->ᛱᛱᛲᲇ()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    new-array v4, v1, [Ljava/lang/Object;

    .line 140
    .line 141
    invoke-static {v2, v4}, Lxhss/ᛶᛴᲀᛲ;->ᲇᛴᲇᛵ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v3, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :catchall_0
    move-exception v0

    .line 150
    goto/16 :goto_7

    .line 151
    .line 152
    :cond_3
    :goto_2
    iget-object v2, p0, Lxhss/ᲀᛱᛶᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛸᛵᛱ;

    .line 153
    .line 154
    sget-object v3, Lxhss/ᲁᛱᛱᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛶᲈᲈ;

    .line 155
    .line 156
    iget-boolean v4, v2, Lxhss/ᛱᛸᛵᛱ;->ᲇᛴᲇᛵ:Z

    .line 157
    .line 158
    if-nez v4, :cond_a

    .line 159
    .line 160
    iget-object v4, v2, Lxhss/ᛱᛸᛵᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 161
    .line 162
    invoke-virtual {v4, v3}, Lxhss/ᛴᛲᛴᛶ;->ᛳᛶᛷᲀ(Lxhss/ᛳᛶᲈᲈ;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Lxhss/ᛱᛸᛵᛱ;->ᛱᛱᛲᲇ()Lxhss/ᲈᛳᲈᲀ;

    .line 166
    .line 167
    .line 168
    iget-object v2, p0, Lxhss/ᲀᛱᛶᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛸᛵᛱ;

    .line 169
    .line 170
    invoke-virtual {v2}, Lxhss/ᛱᛸᛵᛱ;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    .line 172
    .line 173
    monitor-exit p0

    .line 174
    iget-object p0, v0, Lxhss/ᲁᛲᛵ;->ᲀᛷᲁᲀ:Lxhss/ᲀᛱᛶᛳ;

    .line 175
    .line 176
    iget-object v2, v0, Lxhss/ᲁᛲᛵ;->ᛸᛲᛷᛱ:Lxhss/ᛴᲇᛳᲇ;

    .line 177
    .line 178
    monitor-enter p0

    .line 179
    :try_start_1
    iget-boolean v3, p0, Lxhss/ᲀᛱᛶᛳ;->ᛷᛴᛷᛱ:Z

    .line 180
    .line 181
    if-nez v3, :cond_9

    .line 182
    .line 183
    iget v3, v2, Lxhss/ᛴᲇᛳᲇ;->ᛷᛵᛵᲈ:I

    .line 184
    .line 185
    invoke-static {v3}, Ljava/lang/Integer;->bitCount(I)I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    mul-int/lit8 v3, v3, 0x6

    .line 190
    .line 191
    const/4 v4, 0x4

    .line 192
    invoke-virtual {p0, v1, v3, v4, v1}, Lxhss/ᲀᛱᛶᛳ;->ᲇᛴᲇᛵ(IIII)V

    .line 193
    .line 194
    .line 195
    move v3, v1

    .line 196
    :goto_3
    const/16 v4, 0xa

    .line 197
    .line 198
    if-ge v3, v4, :cond_7

    .line 199
    .line 200
    const/4 v4, 0x1

    .line 201
    shl-int v5, v4, v3

    .line 202
    .line 203
    iget v6, v2, Lxhss/ᛴᲇᛳᲇ;->ᛷᛵᛵᲈ:I

    .line 204
    .line 205
    and-int/2addr v5, v6

    .line 206
    if-eqz v5, :cond_4

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_4
    move v4, v1

    .line 210
    :goto_4
    if-eqz v4, :cond_6

    .line 211
    .line 212
    iget-object v4, p0, Lxhss/ᲀᛱᛶᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛸᛵᛱ;

    .line 213
    .line 214
    iget-boolean v5, v4, Lxhss/ᛱᛸᛵᛱ;->ᲇᛴᲇᛵ:Z

    .line 215
    .line 216
    if-nez v5, :cond_5

    .line 217
    .line 218
    iget-object v5, v4, Lxhss/ᛱᛸᛵᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 219
    .line 220
    const/4 v6, 0x2

    .line 221
    invoke-virtual {v5, v6}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    iget-object v7, v6, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 226
    .line 227
    iget v8, v6, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 228
    .line 229
    add-int/lit8 v9, v8, 0x1

    .line 230
    .line 231
    ushr-int/lit8 v10, v3, 0x8

    .line 232
    .line 233
    and-int/lit16 v10, v10, 0xff

    .line 234
    .line 235
    int-to-byte v10, v10

    .line 236
    aput-byte v10, v7, v8

    .line 237
    .line 238
    add-int/lit8 v8, v8, 0x2

    .line 239
    .line 240
    and-int/lit16 v10, v3, 0xff

    .line 241
    .line 242
    int-to-byte v10, v10

    .line 243
    aput-byte v10, v7, v9

    .line 244
    .line 245
    iput v8, v6, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 246
    .line 247
    iget-wide v6, v5, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 248
    .line 249
    const-wide/16 v8, 0x2

    .line 250
    .line 251
    add-long/2addr v6, v8

    .line 252
    iput-wide v6, v5, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 253
    .line 254
    invoke-virtual {v4}, Lxhss/ᛱᛸᛵᛱ;->ᛱᛱᛲᲇ()Lxhss/ᲈᛳᲈᲀ;

    .line 255
    .line 256
    .line 257
    iget-object v4, p0, Lxhss/ᲀᛱᛶᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛸᛵᛱ;

    .line 258
    .line 259
    iget-object v5, v2, Lxhss/ᛴᲇᛳᲇ;->ᛱᛱᛲᲇ:[I

    .line 260
    .line 261
    aget v5, v5, v3

    .line 262
    .line 263
    invoke-virtual {v4, v5}, Lxhss/ᛱᛸᛵᛱ;->ᲇᛴᲇᛵ(I)Lxhss/ᲈᛳᲈᲀ;

    .line 264
    .line 265
    .line 266
    goto :goto_5

    .line 267
    :catchall_1
    move-exception v0

    .line 268
    goto :goto_6

    .line 269
    :cond_5
    const-string v0, "closed"

    .line 270
    .line 271
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 272
    .line 273
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw v1

    .line 277
    :cond_6
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_7
    iget-object v2, p0, Lxhss/ᲀᛱᛶᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛸᛵᛱ;

    .line 281
    .line 282
    invoke-virtual {v2}, Lxhss/ᛱᛸᛵᛱ;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 283
    .line 284
    .line 285
    monitor-exit p0

    .line 286
    iget-object p0, v0, Lxhss/ᲁᛲᛵ;->ᛸᛲᛷᛱ:Lxhss/ᛴᲇᛳᲇ;

    .line 287
    .line 288
    invoke-virtual {p0}, Lxhss/ᛴᲇᛳᲇ;->ᛷᛵᛵᲈ()I

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    const v2, 0xffff

    .line 293
    .line 294
    .line 295
    if-eq p0, v2, :cond_8

    .line 296
    .line 297
    iget-object v3, v0, Lxhss/ᲁᛲᛵ;->ᲀᛷᲁᲀ:Lxhss/ᲀᛱᛶᛳ;

    .line 298
    .line 299
    sub-int/2addr p0, v2

    .line 300
    int-to-long v4, p0

    .line 301
    invoke-virtual {v3, v4, v5, v1}, Lxhss/ᲀᛱᛶᛳ;->ᲇᛸᛳᲁ(JI)V

    .line 302
    .line 303
    .line 304
    :cond_8
    iget-object p0, v0, Lxhss/ᲁᛲᛵ;->ᛸᛴᛶᛳ:Lxhss/ᛸᛱᛴᛳ;

    .line 305
    .line 306
    invoke-virtual {p0}, Lxhss/ᛸᛱᛴᛳ;->ᲇᛴᲇᛵ()Lxhss/ᲇᲀᲀᛷ;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    iget-object v1, v0, Lxhss/ᲁᛲᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 311
    .line 312
    iget-object v0, v0, Lxhss/ᲁᛲᛵ;->ᛱᛳᲁᲈ:Lxhss/ᛸᛵᛸᛶ;

    .line 313
    .line 314
    invoke-static {p0, v1, v0}, Lxhss/ᲇᲀᲀᛷ;->ᛱᛱᛲᲇ(Lxhss/ᲇᲀᲀᛷ;Ljava/lang/String;Lxhss/ᛱᛳᲇᛶ;)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :cond_9
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    .line 319
    .line 320
    const-string v1, "closed"

    .line 321
    .line 322
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 326
    :goto_6
    monitor-exit p0

    .line 327
    throw v0

    .line 328
    :cond_a
    :try_start_3
    const-string v0, "closed"

    .line 329
    .line 330
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 331
    .line 332
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v1

    .line 336
    :cond_b
    new-instance v0, Ljava/io/IOException;

    .line 337
    .line 338
    const-string v1, "closed"

    .line 339
    .line 340
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 344
    :goto_7
    monitor-exit p0

    .line 345
    throw v0
.end method

.method public final ᛸᛴᛶᛳ()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛷᲈᲈ:Z
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

.method public final ᲀᲇᛳᲁ(Z)Z
    .locals 7

    .line 1
    sget-object v0, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lxhss/ᲈᲁᛲᲇ;->ᲇᛴᲇᛵ:Ljava/net/Socket;

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
    iget-object v2, p0, Lxhss/ᲈᲁᛲᲇ;->ᛷᛴᛷᛱ:Ljava/net/Socket;

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
    iget-object v2, p0, Lxhss/ᲈᲁᛲᲇ;->ᛷᛴᛷᛱ:Ljava/net/Socket;

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
    iget-object v2, p0, Lxhss/ᲈᲁᛲᲇ;->ᛷᛴᛷᛱ:Ljava/net/Socket;

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
    iget-object v2, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛲᲀᛵ:Lxhss/ᲁᛲᛵ;

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
    iget-boolean p0, v2, Lxhss/ᲁᛲᛵ;->ᲀᲇᛳᲁ:Z
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
    iget-wide p0, v2, Lxhss/ᲁᛲᛵ;->ᛳᲈᲈᛲ:J

    .line 54
    .line 55
    iget-wide v5, v2, Lxhss/ᲁᛲᛵ;->ᲇᛸᛳᲁ:J

    .line 56
    .line 57
    cmp-long p0, p0, v5

    .line 58
    .line 59
    if-gez p0, :cond_2

    .line 60
    .line 61
    iget-wide p0, v2, Lxhss/ᲁᛲᛵ;->ᛶᲇᲈᛸ:J
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
    iget-wide v5, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛶᛴᲈ:J
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
    iget-object p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛷᛴᛷᛱ:Ljava/net/Socket;

    .line 92
    .line 93
    iget-object p0, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛱᛳᲁ;

    .line 94
    .line 95
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p0, Lxhss/ᲁᛸᛵᛳ;

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
    invoke-virtual {p0}, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ()Z

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

.method public final ᲇᛴᲇᛵ(Lxhss/ᛵᲈᛱᛳ;Ljava/util/List;)Z
    .locals 8

    .line 1
    iget-object v0, p1, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 2
    .line 3
    iget-object v1, v0, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 4
    .line 5
    sget-object v2, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 6
    .line 7
    iget-object v2, p0, Lxhss/ᲈᲁᛲᲇ;->ᛶᲇᲈᛸ:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget v3, p0, Lxhss/ᲈᲁᛲᲇ;->ᛳᲈᲈᛲ:I

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-ge v2, v3, :cond_a

    .line 17
    .line 18
    iget-boolean v2, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛷᲈᲈ:Z

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    iget-object v2, p0, Lxhss/ᲈᲁᛲᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᲁᛶ;

    .line 25
    .line 26
    iget-object v3, v2, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 27
    .line 28
    iget-object v5, v2, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 29
    .line 30
    invoke-virtual {v3, p1}, Lxhss/ᛵᲈᛱᛳ;->ᛷᛵᛵᲈ(Lxhss/ᛵᲈᛱᛳ;)Z

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
    iget-object v3, v5, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 39
    .line 40
    iget-object v3, v3, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v3, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛲᲀᛵ:Lxhss/ᲁᛲᛵ;

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
    check-cast v3, Lxhss/ᛱᛷᲁᛶ;

    .line 81
    .line 82
    iget-object v6, v3, Lxhss/ᛱᛷᲁᛶ;->ᛱᛱᛲᲇ:Ljava/net/Proxy;

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
    iget-object v6, v2, Lxhss/ᛱᛷᲁᛶ;->ᛱᛱᛲᲇ:Ljava/net/Proxy;

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
    iget-object v6, v2, Lxhss/ᛱᛷᲁᛶ;->ᛳᲁᲇᛸ:Ljava/net/InetSocketAddress;

    .line 101
    .line 102
    iget-object v3, v3, Lxhss/ᛱᛷᲁᛶ;->ᛳᲁᲇᛸ:Ljava/net/InetSocketAddress;

    .line 103
    .line 104
    invoke-static {v6, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_5

    .line 109
    .line 110
    iget-object p2, p1, Lxhss/ᛵᲈᛱᛳ;->ᲇᛴᲇᛵ:Ljavax/net/ssl/HostnameVerifier;

    .line 111
    .line 112
    sget-object v2, Lxhss/ᲈᛷᛴ;->ᛷᛵᛵᲈ:Lxhss/ᲈᛷᛴ;

    .line 113
    .line 114
    if-eq p2, v2, :cond_6

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_6
    sget-object p2, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 118
    .line 119
    iget-object p2, v5, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 120
    .line 121
    iget v0, v0, Lxhss/ᛷᛶᲁᛵ;->ᛷᛴᛷᛱ:I

    .line 122
    .line 123
    iget v2, p2, Lxhss/ᛷᛶᲁᛵ;->ᛷᛴᛷᛱ:I

    .line 124
    .line 125
    if-eq v0, v2, :cond_7

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_7
    iget-object p2, p2, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v1, p2}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    iget-object v0, p0, Lxhss/ᲈᲁᛲᲇ;->ᲇᛶᛴᲀ:Lxhss/ᛵᛲᛸᛲ;

    .line 135
    .line 136
    if-eqz p2, :cond_8

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_8
    iget-boolean p0, p0, Lxhss/ᲈᲁᛲᲇ;->ᲈᛳᲀ:Z

    .line 140
    .line 141
    if-nez p0, :cond_a

    .line 142
    .line 143
    if-eqz v0, :cond_a

    .line 144
    .line 145
    invoke-virtual {v0}, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ()Ljava/util/List;

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
    invoke-static {v1, p0}, Lxhss/ᲈᛷᛴ;->ᛳᲁᲇᛸ(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

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
    iget-object p0, p1, Lxhss/ᛵᲈᛱᛳ;->ᛷᛴᛷᛱ:Lxhss/ᛲᛷᲀᲇ;

    .line 168
    .line 169
    invoke-virtual {v0}, Lxhss/ᛵᛲᛸᛲ;->ᛷᛵᛵᲈ()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    iget-object p0, p0, Lxhss/ᛲᛷᲀᲇ;->ᛷᛵᛵᲈ:Ljava/util/Set;

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
    invoke-static {p0}, Lxhss/ᛴᛸᛲᛳ;->ᲁᛲᛴᛴ(Ljava/lang/Object;)V

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

.method public final ᲇᛶᛴᲀ(Lxhss/ᛸᲇᲇᛶ;Ljava/io/IOException;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    instance-of v0, p2, Lxhss/ᛱᲁᛲᛱ;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    move-object v0, p2

    .line 8
    check-cast v0, Lxhss/ᛱᲁᛲᛱ;

    .line 9
    .line 10
    iget v0, v0, Lxhss/ᛱᲁᛲᛱ;->ᛱᛱᛲᲇ:I

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    iget p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᲇᛸᛳᲁ:I

    .line 17
    .line 18
    add-int/2addr p1, v1

    .line 19
    iput p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᲇᛸᛳᲁ:I

    .line 20
    .line 21
    if-le p1, v1, :cond_6

    .line 22
    .line 23
    iput-boolean v1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛷᲈᲈ:Z

    .line 24
    .line 25
    iget p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛷᲁᲁ:I

    .line 26
    .line 27
    add-int/2addr p1, v1

    .line 28
    iput p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛷᲁᲁ:I

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
    check-cast p2, Lxhss/ᛱᲁᛲᛱ;

    .line 34
    .line 35
    iget p2, p2, Lxhss/ᛱᲁᛲᛱ;->ᛱᛱᛲᲇ:I

    .line 36
    .line 37
    const/16 v0, 0x9

    .line 38
    .line 39
    if-ne p2, v0, :cond_1

    .line 40
    .line 41
    iget-boolean p1, p1, Lxhss/ᛸᲇᲇᛶ;->ᛸᛲᛷᛱ:Z

    .line 42
    .line 43
    if-nez p1, :cond_6

    .line 44
    .line 45
    :cond_1
    iput-boolean v1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛷᲈᲈ:Z

    .line 46
    .line 47
    iget p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛷᲁᲁ:I

    .line 48
    .line 49
    add-int/2addr p1, v1

    .line 50
    iput p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛷᲁᲁ:I

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iget-object v0, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛲᲀᛵ:Lxhss/ᲁᛲᛵ;

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
    instance-of v0, p2, Lxhss/ᲇᛷᛴᛴ;

    .line 63
    .line 64
    if-eqz v0, :cond_6

    .line 65
    .line 66
    :cond_4
    iput-boolean v1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛷᲈᲈ:Z

    .line 67
    .line 68
    iget v0, p0, Lxhss/ᲈᲁᛲᲇ;->ᛸᛶᲈᛶ:I

    .line 69
    .line 70
    if-nez v0, :cond_6

    .line 71
    .line 72
    if-eqz p2, :cond_5

    .line 73
    .line 74
    iget-object p1, p1, Lxhss/ᛸᲇᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛸᛷᛲ;

    .line 75
    .line 76
    iget-object v0, p0, Lxhss/ᲈᲁᛲᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᲁᛶ;

    .line 77
    .line 78
    invoke-static {p1, v0, p2}, Lxhss/ᲈᲁᛲᲇ;->ᛳᲁᲇᛸ(Lxhss/ᛵᛸᛷᛲ;Lxhss/ᛱᛷᲁᛶ;Ljava/io/IOException;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    iget p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛷᲁᲁ:I

    .line 82
    .line 83
    add-int/2addr p1, v1

    .line 84
    iput p1, p0, Lxhss/ᲈᲁᛲᲇ;->ᛷᲁᲁ:I
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
