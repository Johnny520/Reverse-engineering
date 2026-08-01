.class public final Lzz;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Z

.field public final β:Ljava/lang/Object;

.field public γ:Ljava/lang/Object;

.field public δ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lzz;->β:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lzz;->γ:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lzz;->δ:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lzz;->α:Z

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Luk1;Lc00;Lb00;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lzz;->β:Ljava/lang/Object;

    .line 31
    iput-object p2, p0, Lzz;->γ:Ljava/lang/Object;

    .line 32
    iput-object p3, p0, Lzz;->δ:Ljava/lang/Object;

    return-void
.end method

.method public static α(Lzz;ZLjava/io/IOException;I)Ljava/io/IOException;
    .locals 11

    .line 1
    and-int/lit8 v0, p3, 0x4

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    and-int/lit8 p3, p3, 0x8

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    move p3, v2

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move p3, v1

    .line 17
    :goto_1
    if-eqz p2, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, p2}, Lzz;->δ(Ljava/io/IOException;)V

    .line 20
    .line 21
    .line 22
    :cond_2
    iget-object v3, p0, Lzz;->β:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v4, v3

    .line 25
    check-cast v4, Luk1;

    .line 26
    .line 27
    if-eqz p3, :cond_3

    .line 28
    .line 29
    if-nez p1, :cond_3

    .line 30
    .line 31
    move v6, v1

    .line 32
    goto :goto_2

    .line 33
    :cond_3
    move v6, v2

    .line 34
    :goto_2
    if-eqz v0, :cond_4

    .line 35
    .line 36
    if-nez p1, :cond_4

    .line 37
    .line 38
    move v7, v1

    .line 39
    goto :goto_3

    .line 40
    :cond_4
    move v7, v2

    .line 41
    :goto_3
    if-eqz p3, :cond_5

    .line 42
    .line 43
    if-eqz p1, :cond_5

    .line 44
    .line 45
    move v9, v1

    .line 46
    goto :goto_4

    .line 47
    :cond_5
    move v9, v2

    .line 48
    :goto_4
    if-eqz v0, :cond_6

    .line 49
    .line 50
    if-eqz p1, :cond_6

    .line 51
    .line 52
    move v8, v1

    .line 53
    :goto_5
    move-object v5, p0

    .line 54
    move-object v10, p2

    .line 55
    goto :goto_6

    .line 56
    :cond_6
    move v8, v2

    .line 57
    goto :goto_5

    .line 58
    :goto_6
    invoke-virtual/range {v4 .. v10}, Luk1;->η(Lzz;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method


# virtual methods
.method public β()Lvk1;
    .locals 1

    .line 1
    iget-object p0, p0, Lzz;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lb00;

    .line 4
    .line 5
    invoke-interface {p0}, Lb00;->η()La00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Lvk1;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Lvk1;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    const-string p0, "no connection for CONNECT tunnels"

    .line 21
    .line 22
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public γ(Z)Lyn1;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lzz;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb00;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lb00;->κ(Z)Lyn1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iput-object p0, p1, Lyn1;->ξ:Lzz;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :catch_0
    move-exception p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object p1

    .line 17
    :goto_0
    invoke-virtual {p0, p1}, Lzz;->δ(Ljava/io/IOException;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public δ(Ljava/io/IOException;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lzz;->α:Z

    .line 3
    .line 4
    iget-object v0, p0, Lzz;->δ:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lb00;

    .line 7
    .line 8
    invoke-interface {v0}, Lb00;->η()La00;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object p0, p0, Lzz;->β:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Luk1;

    .line 15
    .line 16
    invoke-interface {v0, p0, p1}, La00;->β(Luk1;Ljava/io/IOException;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public ε()Ln5;
    .locals 3

    .line 1
    iget-object v0, p0, Lzz;->β:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Luk1;

    .line 4
    .line 5
    iget-boolean v1, v0, Luk1;->ν:Z

    .line 6
    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, v0, Luk1;->ν:Z

    .line 11
    .line 12
    iget-object v2, v0, Luk1;->θ:Ltk1;

    .line 13
    .line 14
    invoke-virtual {v2}, Li7;->ι()Z

    .line 15
    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v2, v0, Luk1;->φ:Lzz;

    .line 19
    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    iget-boolean v2, v0, Luk1;->ρ:Z

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    iget-boolean v2, v0, Luk1;->σ:Z

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    iget-boolean v2, v0, Luk1;->ο:Z

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    iget-boolean v2, v0, Luk1;->π:Z

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    iput-boolean v2, v0, Luk1;->π:Z

    .line 40
    .line 41
    iput-boolean v1, v0, Luk1;->ρ:Z

    .line 42
    .line 43
    iput-boolean v1, v0, Luk1;->σ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    iget-object v0, p0, Lzz;->δ:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lb00;

    .line 49
    .line 50
    invoke-interface {v0}, Lb00;->η()La00;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    check-cast v0, Lvk1;

    .line 58
    .line 59
    iget-object v1, v0, Lvk1;->ε:Ljava/net/Socket;

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lvk1;->θ()V

    .line 65
    .line 66
    .line 67
    new-instance v0, Ln5;

    .line 68
    .line 69
    invoke-direct {v0, p0}, Ln5;-><init>(Lzz;)V

    .line 70
    .line 71
    .line 72
    return-object v0

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string v1, "Check failed."

    .line 78
    .line 79
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0

    .line 83
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    const-string v1, "Check failed."

    .line 86
    .line 87
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p0

    .line 91
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    const-string v1, "Check failed."

    .line 94
    .line 95
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p0

    .line 99
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    const-string v1, "Check failed."

    .line 102
    .line 103
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    :goto_0
    monitor-exit v0

    .line 108
    throw p0

    .line 109
    :cond_4
    const-string p0, "Check failed."

    .line 110
    .line 111
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const/4 p0, 0x0

    .line 115
    return-object p0
.end method
