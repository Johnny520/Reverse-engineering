.class public final Lvk1;
.super Lbg0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La00;


# instance fields
.field public final β:Lx22;

.field public final γ:Lzo1;

.field public final δ:Ljava/net/Socket;

.field public final ε:Ljava/net/Socket;

.field public final ζ:Lqc0;

.field public final η:Lzj1;

.field public final θ:Lm6;

.field public ι:Ldg0;

.field public κ:Z

.field public λ:Z

.field public μ:I

.field public ν:I

.field public ξ:I

.field public ο:I

.field public final π:Ljava/util/ArrayList;

.field public ρ:J


# direct methods
.method public constructor <init>(Lx22;Lxk1;Lzo1;Ljava/net/Socket;Ljava/net/Socket;Lqc0;Lzj1;Lm6;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lvk1;->β:Lx22;

    .line 26
    .line 27
    iput-object p3, p0, Lvk1;->γ:Lzo1;

    .line 28
    .line 29
    iput-object p4, p0, Lvk1;->δ:Ljava/net/Socket;

    .line 30
    .line 31
    iput-object p5, p0, Lvk1;->ε:Ljava/net/Socket;

    .line 32
    .line 33
    iput-object p6, p0, Lvk1;->ζ:Lqc0;

    .line 34
    .line 35
    iput-object p7, p0, Lvk1;->η:Lzj1;

    .line 36
    .line 37
    iput-object p8, p0, Lvk1;->θ:Lm6;

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    iput p1, p0, Lvk1;->ο:I

    .line 41
    .line 42
    new-instance p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lvk1;->π:Ljava/util/ArrayList;

    .line 48
    .line 49
    const-wide p1, 0x7fffffffffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    iput-wide p1, p0, Lvk1;->ρ:J

    .line 55
    .line 56
    return-void
.end method

.method public static δ(Lt41;Lzo1;Ljava/io/IOException;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Lzo1;->β:Ljava/net/Proxy;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    iget-object v0, p1, Lzo1;->α:Lp;

    .line 21
    .line 22
    iget-object v1, v0, Lp;->η:Ljava/net/ProxySelector;

    .line 23
    .line 24
    iget-object v0, v0, Lp;->θ:Log0;

    .line 25
    .line 26
    invoke-virtual {v0}, Log0;->η()Ljava/net/URI;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v2, p1, Lzo1;->β:Ljava/net/Proxy;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object p0, p0, Lt41;->Α:Lij0;

    .line 40
    .line 41
    monitor-enter p0

    .line 42
    :try_start_0
    iget-object p2, p0, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 43
    .line 44
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    monitor-exit p0

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw p1
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lvk1;->δ:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-static {p0}, Lud2;->γ(Ljava/net/Socket;)V

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
    iget-object v1, p0, Lvk1;->γ:Lzo1;

    .line 9
    .line 10
    iget-object v2, v1, Lzo1;->α:Lp;

    .line 11
    .line 12
    iget-object v2, v2, Lp;->θ:Log0;

    .line 13
    .line 14
    iget-object v2, v2, Log0;->δ:Ljava/lang/String;

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
    iget-object v2, v1, Lzo1;->α:Lp;

    .line 25
    .line 26
    iget-object v2, v2, Lp;->θ:Log0;

    .line 27
    .line 28
    iget v2, v2, Log0;->ε:I

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
    iget-object v2, v1, Lzo1;->β:Ljava/net/Proxy;

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
    iget-object v1, v1, Lzo1;->γ:Ljava/net/InetSocketAddress;

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
    iget-object v1, p0, Lvk1;->ζ:Lqc0;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget-object v1, v1, Lqc0;->β:Luf;

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
    iget-object p0, p0, Lvk1;->η:Lzj1;

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

.method public final α(Ldg0;Lxs1;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    iget p1, p2, Lxs1;->α:I

    .line 6
    .line 7
    and-int/lit8 p1, p1, 0x8

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p2, Lxs1;->β:[I

    .line 12
    .line 13
    const/4 p2, 0x3

    .line 14
    aget p1, p1, p2

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const p1, 0x7fffffff

    .line 18
    .line 19
    .line 20
    :goto_0
    iput p1, p0, Lvk1;->ο:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit p0

    .line 26
    throw p1
.end method

.method public final β(Luk1;Ljava/io/IOException;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    instance-of v0, p2, Lo02;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    move-object v0, p2

    .line 8
    check-cast v0, Lo02;

    .line 9
    .line 10
    iget-object v0, v0, Lo02;->ε:Lsz;

    .line 11
    .line 12
    sget-object v2, Lsz;->λ:Lsz;

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    iget p1, p0, Lvk1;->ξ:I

    .line 17
    .line 18
    add-int/2addr p1, v1

    .line 19
    iput p1, p0, Lvk1;->ξ:I

    .line 20
    .line 21
    if-le p1, v1, :cond_6

    .line 22
    .line 23
    iput-boolean v1, p0, Lvk1;->κ:Z

    .line 24
    .line 25
    iget p1, p0, Lvk1;->μ:I

    .line 26
    .line 27
    add-int/2addr p1, v1

    .line 28
    iput p1, p0, Lvk1;->μ:I

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
    check-cast p2, Lo02;

    .line 34
    .line 35
    iget-object p2, p2, Lo02;->ε:Lsz;

    .line 36
    .line 37
    sget-object v0, Lsz;->μ:Lsz;

    .line 38
    .line 39
    if-ne p2, v0, :cond_1

    .line 40
    .line 41
    iget-boolean p1, p1, Luk1;->υ:Z

    .line 42
    .line 43
    if-nez p1, :cond_6

    .line 44
    .line 45
    :cond_1
    iput-boolean v1, p0, Lvk1;->κ:Z

    .line 46
    .line 47
    iget p1, p0, Lvk1;->μ:I

    .line 48
    .line 49
    add-int/2addr p1, v1

    .line 50
    iput p1, p0, Lvk1;->μ:I

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iget-object v0, p0, Lvk1;->ι:Ldg0;

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
    instance-of v0, p2, Lno;

    .line 63
    .line 64
    if-eqz v0, :cond_6

    .line 65
    .line 66
    :cond_4
    iput-boolean v1, p0, Lvk1;->κ:Z

    .line 67
    .line 68
    iget v0, p0, Lvk1;->ν:I

    .line 69
    .line 70
    if-nez v0, :cond_6

    .line 71
    .line 72
    if-eqz p2, :cond_5

    .line 73
    .line 74
    iget-object p1, p1, Luk1;->ε:Lt41;

    .line 75
    .line 76
    iget-object v0, p0, Lvk1;->γ:Lzo1;

    .line 77
    .line 78
    invoke-static {p1, v0, p2}, Lvk1;->δ(Lt41;Lzo1;Ljava/io/IOException;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    iget p1, p0, Lvk1;->μ:I

    .line 82
    .line 83
    add-int/2addr p1, v1

    .line 84
    iput p1, p0, Lvk1;->μ:I
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

.method public final γ(Lkg0;)V
    .locals 1

    .line 1
    sget-object p0, Lsz;->λ:Lsz;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, p0, v0}, Lkg0;->δ(Lsz;Ljava/io/IOException;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final ε(Lp;Ljava/util/List;)Z
    .locals 8

    .line 1
    iget-object v0, p1, Lp;->θ:Log0;

    .line 2
    .line 3
    sget-object v1, Lud2;->α:Ljava/util/TimeZone;

    .line 4
    .line 5
    iget-object v1, p0, Lvk1;->π:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget v2, p0, Lvk1;->ο:I

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-ge v1, v2, :cond_a

    .line 15
    .line 16
    iget-boolean v1, p0, Lvk1;->κ:Z

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Lvk1;->γ:Lzo1;

    .line 23
    .line 24
    iget-object v2, v1, Lzo1;->α:Lp;

    .line 25
    .line 26
    iget-object v4, v1, Lzo1;->α:Lp;

    .line 27
    .line 28
    invoke-virtual {v2, p1}, Lp;->α(Lp;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_1
    iget-object v2, v0, Log0;->δ:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v5, v0, Log0;->δ:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v6, v4, Lp;->θ:Log0;

    .line 41
    .line 42
    iget-object v6, v6, Log0;->δ:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v2, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_2
    iget-object v2, p0, Lvk1;->ι:Ldg0;

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :cond_3
    if-eqz p2, :cond_a

    .line 59
    .line 60
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    goto/16 :goto_2

    .line 67
    .line 68
    :cond_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_a

    .line 77
    .line 78
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lzo1;

    .line 83
    .line 84
    iget-object v6, v2, Lzo1;->β:Ljava/net/Proxy;

    .line 85
    .line 86
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    sget-object v7, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 91
    .line 92
    if-ne v6, v7, :cond_5

    .line 93
    .line 94
    iget-object v6, v1, Lzo1;->β:Ljava/net/Proxy;

    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    if-ne v6, v7, :cond_5

    .line 101
    .line 102
    iget-object v6, v1, Lzo1;->γ:Ljava/net/InetSocketAddress;

    .line 103
    .line 104
    iget-object v2, v2, Lzo1;->γ:Ljava/net/InetSocketAddress;

    .line 105
    .line 106
    invoke-static {v6, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_5

    .line 111
    .line 112
    iget-object p2, p1, Lp;->δ:Ljavax/net/ssl/HostnameVerifier;

    .line 113
    .line 114
    sget-object v1, Lr41;->α:Lr41;

    .line 115
    .line 116
    if-eq p2, v1, :cond_6

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_6
    sget-object p2, Lud2;->α:Ljava/util/TimeZone;

    .line 120
    .line 121
    iget-object p2, v4, Lp;->θ:Log0;

    .line 122
    .line 123
    iget v0, v0, Log0;->ε:I

    .line 124
    .line 125
    iget v1, p2, Log0;->ε:I

    .line 126
    .line 127
    if-eq v0, v1, :cond_7

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_7
    iget-object p2, p2, Log0;->δ:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v5, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    iget-object v0, p0, Lvk1;->ζ:Lqc0;

    .line 137
    .line 138
    if-eqz p2, :cond_8

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_8
    iget-boolean p0, p0, Lvk1;->λ:Z

    .line 142
    .line 143
    if-nez p0, :cond_a

    .line 144
    .line 145
    if-eqz v0, :cond_a

    .line 146
    .line 147
    invoke-virtual {v0}, Lqc0;->α()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    if-nez p2, :cond_a

    .line 156
    .line 157
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    check-cast p0, Ljava/security/cert/X509Certificate;

    .line 165
    .line 166
    invoke-static {v5, p0}, Lr41;->γ(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    if-eqz p0, :cond_a

    .line 171
    .line 172
    :goto_0
    :try_start_0
    iget-object p0, p1, Lp;->ε:Lje;

    .line 173
    .line 174
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Lqc0;->α()Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    iget-object p0, p0, Lje;->α:Ljava/util/Set;

    .line 191
    .line 192
    check-cast p0, Ljava/lang/Iterable;

    .line 193
    .line 194
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    if-nez p1, :cond_9

    .line 203
    .line 204
    :goto_1
    const/4 p0, 0x1

    .line 205
    return p0

    .line 206
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-static {p0}, Llz1;->ψ(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    const/4 p0, 0x0

    .line 214
    throw p0
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 215
    :catch_0
    :cond_a
    :goto_2
    return v3
.end method

.method public final ζ()Lzo1;
    .locals 0

    .line 1
    iget-object p0, p0, Lvk1;->γ:Lzo1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final η(Z)Z
    .locals 7

    .line 1
    sget-object v0, Lud2;->α:Ljava/util/TimeZone;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lvk1;->δ:Ljava/net/Socket;

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
    iget-object v2, p0, Lvk1;->ε:Ljava/net/Socket;

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
    iget-object v2, p0, Lvk1;->ε:Ljava/net/Socket;

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
    iget-object v2, p0, Lvk1;->ε:Ljava/net/Socket;

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
    iget-object v2, p0, Lvk1;->ι:Ldg0;

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
    iget-boolean p0, v2, Ldg0;->κ:Z
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
    iget-wide p0, v2, Ldg0;->σ:J

    .line 54
    .line 55
    iget-wide v5, v2, Ldg0;->ρ:J

    .line 56
    .line 57
    cmp-long p0, p0, v5

    .line 58
    .line 59
    if-gez p0, :cond_2

    .line 60
    .line 61
    iget-wide p0, v2, Ldg0;->τ:J
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
    iget-wide v5, p0, Lvk1;->ρ:J
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
    iget-object p1, p0, Lvk1;->ε:Ljava/net/Socket;

    .line 92
    .line 93
    iget-object p0, p0, Lvk1;->θ:Lm6;

    .line 94
    .line 95
    iget-object p0, p0, Lm6;->η:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p0, Lrk1;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    :try_start_3
    invoke-virtual {p1}, Ljava/net/Socket;->getSoTimeout()I

    .line 106
    .line 107
    .line 108
    move-result v0
    :try_end_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 109
    :try_start_4
    invoke-virtual {p1, v4}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lrk1;->δ()Z

    .line 113
    .line 114
    .line 115
    move-result p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 116
    xor-int/2addr p0, v4

    .line 117
    :try_start_5
    invoke-virtual {p1, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 118
    .line 119
    .line 120
    return p0

    .line 121
    :catchall_1
    move-exception p0

    .line 122
    invoke-virtual {p1, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 123
    .line 124
    .line 125
    throw p0
    :try_end_5
    .catch Ljava/net/SocketTimeoutException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 126
    :catch_0
    move v3, v4

    .line 127
    :catch_1
    return v3

    .line 128
    :cond_4
    return v4

    .line 129
    :catchall_2
    move-exception p1

    .line 130
    monitor-exit p0

    .line 131
    throw p1

    .line 132
    :cond_5
    :goto_1
    return v3
.end method

.method public final θ()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lvk1;->κ:Z
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

.method public final ι()V
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lvk1;->ρ:J

    .line 6
    .line 7
    iget-object v0, p0, Lvk1;->η:Lzj1;

    .line 8
    .line 9
    sget-object v1, Lzj1;->κ:Lzj1;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    sget-object v1, Lzj1;->λ:Lzj1;

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
    iget-object v0, p0, Lvk1;->ε:Ljava/net/Socket;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lx;->ω:Lx;

    .line 26
    .line 27
    sget-object v0, Lh40;->α:Lh40;

    .line 28
    .line 29
    new-instance v2, Lb8;

    .line 30
    .line 31
    iget-object v3, p0, Lvk1;->β:Lx22;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v3, v2, Lb8;->α:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object v3, Lbg0;->α:Lag0;

    .line 42
    .line 43
    iput-object v3, v2, Lb8;->δ:Ljava/lang/Object;

    .line 44
    .line 45
    sget-object v3, Lh40;->α:Lh40;

    .line 46
    .line 47
    iput-object v3, v2, Lb8;->ε:Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v3, p0, Lvk1;->θ:Lm6;

    .line 50
    .line 51
    iget-object v4, p0, Lvk1;->γ:Lzo1;

    .line 52
    .line 53
    iget-object v4, v4, Lzo1;->α:Lp;

    .line 54
    .line 55
    iget-object v4, v4, Lp;->θ:Log0;

    .line 56
    .line 57
    iget-object v4, v4, Log0;->δ:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iput-object v3, v2, Lb8;->β:Ljava/lang/Object;

    .line 66
    .line 67
    new-instance v3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    sget-object v5, Lud2;->β:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const/16 v5, 0x20

    .line 78
    .line 79
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iput-object v3, v2, Lb8;->γ:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object p0, v2, Lb8;->δ:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v0, v2, Lb8;->ε:Ljava/lang/Object;

    .line 94
    .line 95
    new-instance v0, Ldg0;

    .line 96
    .line 97
    invoke-direct {v0, v2}, Ldg0;-><init>(Lb8;)V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, Lvk1;->ι:Ldg0;

    .line 101
    .line 102
    sget-object v2, Ldg0;->Ζ:Lxs1;

    .line 103
    .line 104
    iget v3, v2, Lxs1;->α:I

    .line 105
    .line 106
    and-int/lit8 v3, v3, 0x8

    .line 107
    .line 108
    if-eqz v3, :cond_2

    .line 109
    .line 110
    iget-object v2, v2, Lxs1;->β:[I

    .line 111
    .line 112
    const/4 v3, 0x3

    .line 113
    aget v2, v2, v3

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    const v2, 0x7fffffff

    .line 117
    .line 118
    .line 119
    :goto_1
    iput v2, p0, Lvk1;->ο:I

    .line 120
    .line 121
    iget-object p0, v0, Ldg0;->Γ:Llg0;

    .line 122
    .line 123
    const-string v2, ">> CONNECTION "

    .line 124
    .line 125
    monitor-enter p0

    .line 126
    :try_start_0
    iget-boolean v3, p0, Llg0;->θ:Z

    .line 127
    .line 128
    if-nez v3, :cond_9

    .line 129
    .line 130
    sget-object v3, Llg0;->κ:Ljava/util/logging/Logger;

    .line 131
    .line 132
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 133
    .line 134
    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_3

    .line 139
    .line 140
    new-instance v4, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    sget-object v2, Lvf0;->α:Ldd;

    .line 146
    .line 147
    invoke-virtual {v2}, Ldd;->β()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    new-array v4, v1, [Ljava/lang/Object;

    .line 159
    .line 160
    invoke-static {v2, v4}, Lud2;->δ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v3, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :catchall_0
    move-exception v0

    .line 169
    goto/16 :goto_7

    .line 170
    .line 171
    :cond_3
    :goto_2
    iget-object v2, p0, Llg0;->ε:Lzc;

    .line 172
    .line 173
    sget-object v3, Lvf0;->α:Ldd;

    .line 174
    .line 175
    invoke-interface {v2, v3}, Lzc;->ο(Ldd;)Lzc;

    .line 176
    .line 177
    .line 178
    iget-object v2, p0, Llg0;->ε:Lzc;

    .line 179
    .line 180
    invoke-interface {v2}, Lzc;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    .line 182
    .line 183
    monitor-exit p0

    .line 184
    iget-object p0, v0, Ldg0;->Γ:Llg0;

    .line 185
    .line 186
    iget-object v2, v0, Ldg0;->φ:Lxs1;

    .line 187
    .line 188
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    monitor-enter p0

    .line 195
    :try_start_1
    iget-boolean v3, p0, Llg0;->θ:Z

    .line 196
    .line 197
    if-nez v3, :cond_8

    .line 198
    .line 199
    iget v3, v2, Lxs1;->α:I

    .line 200
    .line 201
    invoke-static {v3}, Ljava/lang/Integer;->bitCount(I)I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    mul-int/lit8 v3, v3, 0x6

    .line 206
    .line 207
    const/4 v4, 0x4

    .line 208
    invoke-virtual {p0, v1, v3, v4, v1}, Llg0;->θ(IIII)V

    .line 209
    .line 210
    .line 211
    move v3, v1

    .line 212
    :goto_3
    const/16 v4, 0xa

    .line 213
    .line 214
    if-ge v3, v4, :cond_6

    .line 215
    .line 216
    const/4 v4, 0x1

    .line 217
    shl-int v5, v4, v3

    .line 218
    .line 219
    iget v6, v2, Lxs1;->α:I

    .line 220
    .line 221
    and-int/2addr v5, v6

    .line 222
    if-eqz v5, :cond_4

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_4
    move v4, v1

    .line 226
    :goto_4
    if-eqz v4, :cond_5

    .line 227
    .line 228
    iget-object v4, p0, Llg0;->ε:Lzc;

    .line 229
    .line 230
    invoke-interface {v4, v3}, Lzc;->writeShort(I)Lzc;

    .line 231
    .line 232
    .line 233
    iget-object v4, p0, Llg0;->ε:Lzc;

    .line 234
    .line 235
    iget-object v5, v2, Lxs1;->β:[I

    .line 236
    .line 237
    aget v5, v5, v3

    .line 238
    .line 239
    invoke-interface {v4, v5}, Lzc;->writeInt(I)Lzc;

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :catchall_1
    move-exception v0

    .line 244
    goto :goto_6

    .line 245
    :cond_5
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_6
    iget-object v2, p0, Llg0;->ε:Lzc;

    .line 249
    .line 250
    invoke-interface {v2}, Lzc;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 251
    .line 252
    .line 253
    monitor-exit p0

    .line 254
    iget-object p0, v0, Ldg0;->φ:Lxs1;

    .line 255
    .line 256
    invoke-virtual {p0}, Lxs1;->α()I

    .line 257
    .line 258
    .line 259
    move-result p0

    .line 260
    const v2, 0xffff

    .line 261
    .line 262
    .line 263
    if-eq p0, v2, :cond_7

    .line 264
    .line 265
    iget-object v3, v0, Ldg0;->Γ:Llg0;

    .line 266
    .line 267
    sub-int/2addr p0, v2

    .line 268
    int-to-long v4, p0

    .line 269
    invoke-virtual {v3, v1, v4, v5}, Llg0;->σ(IJ)V

    .line 270
    .line 271
    .line 272
    :cond_7
    iget-object p0, v0, Ldg0;->λ:Lx22;

    .line 273
    .line 274
    invoke-virtual {p0}, Lx22;->δ()Lw22;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    iget-object v1, v0, Ldg0;->η:Ljava/lang/String;

    .line 279
    .line 280
    iget-object v0, v0, Ldg0;->Δ:Lcg0;

    .line 281
    .line 282
    invoke-static {p0, v1, v0}, Lw22;->β(Lw22;Ljava/lang/String;Lp70;)V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_8
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    .line 287
    .line 288
    const-string v1, "closed"

    .line 289
    .line 290
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 294
    :goto_6
    monitor-exit p0

    .line 295
    throw v0

    .line 296
    :cond_9
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    .line 297
    .line 298
    const-string v1, "closed"

    .line 299
    .line 300
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 304
    :goto_7
    monitor-exit p0

    .line 305
    throw v0
.end method
