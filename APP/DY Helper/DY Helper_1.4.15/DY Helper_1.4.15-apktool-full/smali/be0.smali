.class public final Lbe0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lbe0;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final ζ:Lzb0;

.field public static final η:Lzb0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lbe0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbe0;->α:Lbe0;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lbe0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lbe0;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    new-instance v2, Lzd0;

    .line 26
    .line 27
    sget-object v3, Ljz;->ε:Ljz;

    .line 28
    .line 29
    invoke-static {v3}, Lh62;->Υ(Ljava/util/List;)Ln5;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const-string v5, ""

    .line 34
    .line 35
    invoke-direct {v2, v5, v1, v3, v4}, Lzd0;-><init>(Ljava/lang/String;ZLjava/util/List;Ln5;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lbe0;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 42
    .line 43
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    sget-object v1, Lhe0;->β:Lhe0;

    .line 46
    .line 47
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lbe0;->ε:Ljava/util/concurrent/atomic/AtomicReference;

    .line 51
    .line 52
    new-instance v0, Lzb0;

    .line 53
    .line 54
    const/16 v1, 0x10

    .line 55
    .line 56
    invoke-direct {v0, v1}, Lzb0;-><init>(I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lbe0;->ζ:Lzb0;

    .line 60
    .line 61
    new-instance v0, Lzb0;

    .line 62
    .line 63
    const/16 v1, 0x11

    .line 64
    .line 65
    invoke-direct {v0, v1}, Lzb0;-><init>(I)V

    .line 66
    .line 67
    .line 68
    sput-object v0, Lbe0;->η:Lzb0;

    .line 69
    .line 70
    return-void
.end method

.method public static β()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v1, "0"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    :goto_0
    const/4 v0, 0x0

    .line 29
    :cond_1
    if-nez v0, :cond_2

    .line 30
    .line 31
    const-string v0, ""

    .line 32
    .line 33
    :cond_2
    return-object v0
.end method

.method public static ι(Lzd0;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lzd0;->β:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lbe0;->ε:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lhe0;

    .line 12
    .line 13
    iget-object p0, p0, Lzd0;->α:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lhe0;->α(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public static λ(Lxd0;Lxd0;)Lxd0;
    .locals 9

    .line 1
    iget-object v0, p1, Lxd0;->α:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lxd0;->α:Ljava/lang/String;

    .line 10
    .line 11
    :cond_0
    move-object v4, v0

    .line 12
    iget-object v0, p1, Lxd0;->β:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lxd0;->β:Ljava/lang/String;

    .line 21
    .line 22
    :cond_1
    move-object v5, v0

    .line 23
    iget-object v0, p1, Lxd0;->γ:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lxd0;->γ:Ljava/lang/String;

    .line 32
    .line 33
    :cond_2
    move-object v6, v0

    .line 34
    iget-object v0, p1, Lxd0;->δ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    iget-object v0, p0, Lxd0;->δ:Ljava/lang/String;

    .line 43
    .line 44
    :cond_3
    move-object v7, v0

    .line 45
    iget-object p1, p1, Lxd0;->ε:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_4

    .line 52
    .line 53
    iget-object p1, p0, Lxd0;->ε:Ljava/lang/String;

    .line 54
    .line 55
    :cond_4
    move-object v8, p1

    .line 56
    iget-wide v2, p0, Lxd0;->ζ:J

    .line 57
    .line 58
    new-instance v1, Lxd0;

    .line 59
    .line 60
    invoke-direct/range {v1 .. v8}, Lxd0;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v1
.end method

.method public static μ(Ljava/lang/String;)V
    .locals 5

    .line 1
    sget-object v0, Lbe0;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lp70;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1}, Lp70;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object v1, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    new-instance v2, Leo1;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object v1, v2

    .line 32
    :goto_1
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "change listener failed reason="

    .line 43
    .line 44
    const-string v3, " err="

    .line 45
    .line 46
    const-string v4, "r62bda5d817332bb8"

    .line 47
    .line 48
    invoke-static {v2, p0, v3, v1, v4}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    return-void
.end method

.method public static π(Lxd0;Lxd0;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lxd0;->α:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lxd0;->β:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lxd0;->α:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, p1, Lxd0;->α:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-lez p0, :cond_2

    .line 26
    .line 27
    iget-object p0, p1, Lxd0;->β:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    :cond_1
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    const/4 p0, 0x0

    .line 38
    return p0
.end method


# virtual methods
.method public final declared-synchronized α(Lxd0;)Lyd0;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lbe0;->ε()V

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lbe0;->β()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    sget-object p1, Lyd0;->κ:Lyd0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :cond_0
    :try_start_1
    sget-object v1, Lyc0;->α:Lyc0;

    .line 23
    .line 24
    invoke-static {p1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v1, p1}, Lyc0;->α(Ljava/util/List;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lxd0;

    .line 37
    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    sget-object p1, Lyd0;->λ:Lyd0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    monitor-exit p0

    .line 43
    return-object p1

    .line 44
    :cond_1
    :try_start_2
    iget-object v1, p1, Lxd0;->α:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-lez v1, :cond_2

    .line 51
    .line 52
    iget-object v1, p1, Lxd0;->α:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    sget-object p1, Lyd0;->λ:Lyd0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    .line 62
    monitor-exit p0

    .line 63
    return-object p1

    .line 64
    :cond_2
    :try_start_3
    invoke-virtual {p0}, Lbe0;->ξ()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v1, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const/4 v2, 0x0

    .line 78
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_4

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Lxd0;

    .line 89
    .line 90
    invoke-static {v3, p1}, Lbe0;->π(Lxd0;Lxd0;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    const/4 v2, -0x1

    .line 101
    :goto_1
    if-ltz v2, :cond_6

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lxd0;

    .line 108
    .line 109
    invoke-static {v0, p1}, Lbe0;->λ(Lxd0;Lxd0;)Lxd0;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {p1, v0}, Lxd0;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_5

    .line 122
    .line 123
    sget-object p1, Lyd0;->ι:Lyd0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 124
    .line 125
    monitor-exit p0

    .line 126
    return-object p1

    .line 127
    :cond_5
    :try_start_4
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    sget-object p1, Lyd0;->ζ:Lyd0;

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    sget-object p1, Lyd0;->ε:Lyd0;

    .line 137
    .line 138
    :goto_2
    const-string v0, "add"

    .line 139
    .line 140
    invoke-virtual {p0, v0, v1}, Lbe0;->ν(Ljava/lang/String;Ljava/util/List;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_7

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    sget-object p1, Lyd0;->μ:Lyd0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 148
    .line 149
    :goto_3
    monitor-exit p0

    .line 150
    return-object p1

    .line 151
    :goto_4
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 152
    throw p1
.end method

.method public final γ()Lzd0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lbe0;->ε()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lbe0;->β()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v0, Lbe0;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lzd0;

    .line 22
    .line 23
    iget-object v1, v0, Lzd0;->α:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {}, Lbe0;->β()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public final δ()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-object v2, Lbe0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 12
    .line 13
    sget-object v0, Lbe0;->ζ:Lzb0;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object v1, Lui1;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    sget-object v0, Lbe0;->η:Lzb0;

    .line 24
    .line 25
    invoke-static {v0}, Lui1;->β(La80;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    const-string v0, "initialize"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lbe0;->ο(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final ε()V
    .locals 1

    .line 1
    sget-object v0, Lbe0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lbe0;->δ()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final ζ()Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->δ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lbe0;->γ()Lzd0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-boolean p0, p0, Lzd0;->β:Z

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    if-ne p0, v0, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final η()Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->δ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lbe0;->γ()Lzd0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-boolean v0, p0, Lzd0;->β:Z

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lzd0;->γ:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-static {p0}, Lbe0;->ι(Lzd0;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public final θ()Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->δ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lbe0;->γ()Lzd0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_1

    .line 13
    .line 14
    :goto_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    invoke-static {p0}, Lbe0;->ι(Lzd0;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final κ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {}, Lx9;->δ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Lbe0;->γ()Lzd0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    iget-boolean v0, p0, Lzd0;->β:Z

    .line 16
    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    iget-object v0, p0, Lzd0;->γ:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_4

    .line 26
    .line 27
    invoke-static {p0}, Lbe0;->ι(Lzd0;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    iget-object p0, p0, Lzd0;->δ:Ln5;

    .line 35
    .line 36
    const/16 v0, 0x40

    .line 37
    .line 38
    invoke-static {p1, v0}, Ls1;->υ(Ljava/lang/String;I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-lez v0, :cond_3

    .line 47
    .line 48
    iget-object v0, p0, Ln5;->ζ:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/util/Set;

    .line 51
    .line 52
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    const/16 p1, 0x100

    .line 60
    .line 61
    invoke-static {p2, p1}, Ls1;->υ(Ljava/lang/String;I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-lez p2, :cond_4

    .line 70
    .line 71
    iget-object p0, p0, Ln5;->η:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Ljava/util/Set;

    .line 74
    .line 75
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_4

    .line 80
    .line 81
    :goto_0
    const/4 p0, 0x1

    .line 82
    return p0

    .line 83
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 84
    return p0
.end method

.method public final ν(Ljava/lang/String;Ljava/util/List;)Z
    .locals 7

    .line 1
    sget-object v0, Lyc0;->α:Lyc0;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lyc0;->α(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    sget-object v1, Lui1;->α:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance v1, Lorg/json/JSONArray;

    .line 10
    .line 11
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p2}, Lyc0;->α(Ljava/util/List;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lxd0;

    .line 33
    .line 34
    new-instance v3, Lorg/json/JSONObject;

    .line 35
    .line 36
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v4, "uid"

    .line 40
    .line 41
    iget-object v5, v2, Lxd0;->α:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    const-string v4, "sec_uid"

    .line 47
    .line 48
    iget-object v5, v2, Lxd0;->β:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    const-string v4, "unique_id"

    .line 54
    .line 55
    iget-object v5, v2, Lxd0;->γ:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    const-string v4, "short_id"

    .line 61
    .line 62
    iget-object v5, v2, Lxd0;->δ:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    const-string v4, "display_name"

    .line 68
    .line 69
    iget-object v5, v2, Lxd0;->ε:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    const-string v4, "hidden_at"

    .line 75
    .line 76
    iget-wide v5, v2, Lxd0;->ζ:J

    .line 77
    .line 78
    invoke-virtual {v3, v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 86
    .line 87
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v2, "version"

    .line 91
    .line 92
    const/4 v3, 0x2

    .line 93
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-string v2, "contacts"

    .line 98
    .line 99
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    const-string v1, "hidden_contacts_v2"

    .line 111
    .line 112
    invoke-static {v1, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const-string v0, "persist_"

    .line 116
    .line 117
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p0, p1}, Lbe0;->ο(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {}, Lbe0;->β()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    sget-object p1, Lbe0;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, Lzd0;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-lez v0, :cond_1

    .line 141
    .line 142
    iget-object v0, p1, Lzd0;->α:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-eqz p0, :cond_1

    .line 149
    .line 150
    iget-object p0, p1, Lzd0;->γ:Ljava/util/List;

    .line 151
    .line 152
    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    if-eqz p0, :cond_1

    .line 157
    .line 158
    const/4 p0, 0x1

    .line 159
    return p0

    .line 160
    :cond_1
    const/4 p0, 0x0

    .line 161
    return p0
.end method

.method public final ξ()Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbe0;->γ()Lzd0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lzd0;->γ:Ljava/util/List;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Ljz;->ε:Ljz;

    .line 11
    .line 12
    return-object p0
.end method

.method public final ο(Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-static {}, Lbe0;->β()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lzd0;

    .line 13
    .line 14
    const-string v1, ""

    .line 15
    .line 16
    sget-object v3, Ljz;->ε:Ljz;

    .line 17
    .line 18
    invoke-static {v3}, Lh62;->Υ(Ljava/util/List;)Ln5;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-direct {v0, v1, v2, v3, v4}, Lzd0;-><init>(Ljava/lang/String;ZLjava/util/List;Ln5;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_7

    .line 26
    .line 27
    :cond_0
    sget-object v1, Lyc0;->α:Lyc0;

    .line 28
    .line 29
    const-string v3, "hidden_contacts_v2"

    .line 30
    .line 31
    const-string v4, ""

    .line 32
    .line 33
    invoke-static {v3, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    sget-object v4, Ljz;->ε:Ljz;

    .line 38
    .line 39
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    goto :goto_6

    .line 46
    :cond_1
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    .line 47
    .line 48
    invoke-direct {v5, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v3, "contacts"

    .line 52
    .line 53
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-nez v3, :cond_2

    .line 58
    .line 59
    move-object v1, v4

    .line 60
    goto :goto_4

    .line 61
    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    const/16 v7, 0x7d0

    .line 68
    .line 69
    if-le v6, v7, :cond_3

    .line 70
    .line 71
    move v6, v7

    .line 72
    :cond_3
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-le v6, v7, :cond_4

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    move v7, v6

    .line 83
    :goto_0
    move v6, v2

    .line 84
    :goto_1
    if-ge v6, v7, :cond_6

    .line 85
    .line 86
    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-static {v8}, Lyc0;->β(Lorg/json/JSONObject;)Lxd0;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    if-eqz v8, :cond_5

    .line 95
    .line 96
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :catchall_0
    move-exception v1

    .line 101
    goto :goto_3

    .line 102
    :cond_5
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_6
    invoke-virtual {v1, v5}, Lyc0;->α(Ljava/util/List;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    goto :goto_4

    .line 110
    :goto_3
    new-instance v3, Leo1;

    .line 111
    .line 112
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    move-object v1, v3

    .line 116
    :goto_4
    instance-of v3, v1, Leo1;

    .line 117
    .line 118
    if-eqz v3, :cond_7

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_7
    move-object v4, v1

    .line 122
    :goto_5
    check-cast v4, Ljava/util/List;

    .line 123
    .line 124
    :goto_6
    new-instance v1, Lzd0;

    .line 125
    .line 126
    const-string v3, "hidden_contact_enabled_v2"

    .line 127
    .line 128
    invoke-static {v3, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-static {v4}, Lh62;->Υ(Ljava/util/List;)Ln5;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-direct {v1, v0, v3, v4, v5}, Lzd0;-><init>(Ljava/lang/String;ZLjava/util/List;Ln5;)V

    .line 137
    .line 138
    .line 139
    move-object v0, v1

    .line 140
    :goto_7
    monitor-enter p0

    .line 141
    :try_start_1
    sget-object v1, Lbe0;->ε:Ljava/util/concurrent/atomic/AtomicReference;

    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Lhe0;

    .line 148
    .line 149
    sget-object v4, Lhe0;->β:Lhe0;

    .line 150
    .line 151
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-nez v5, :cond_9

    .line 156
    .line 157
    iget-boolean v5, v0, Lzd0;->β:Z

    .line 158
    .line 159
    if-eqz v5, :cond_8

    .line 160
    .line 161
    iget-object v5, v0, Lzd0;->α:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v3, v5}, Lhe0;->α(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eqz v5, :cond_8

    .line 168
    .line 169
    goto :goto_8

    .line 170
    :catchall_1
    move-exception p1

    .line 171
    goto :goto_c

    .line 172
    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 176
    .line 177
    .line 178
    monitor-exit p0

    .line 179
    const/4 v2, 0x1

    .line 180
    goto :goto_9

    .line 181
    :cond_9
    :goto_8
    monitor-exit p0

    .line 182
    :goto_9
    sget-object p0, Lbe0;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 183
    .line 184
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, Lzd0;

    .line 189
    .line 190
    iget-object v1, p0, Lzd0;->α:Ljava/lang/String;

    .line 191
    .line 192
    iget-object v3, v0, Lzd0;->α:Ljava/lang/String;

    .line 193
    .line 194
    iget-object v4, v0, Lzd0;->γ:Ljava/util/List;

    .line 195
    .line 196
    iget-boolean v0, v0, Lzd0;->β:Z

    .line 197
    .line 198
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_b

    .line 203
    .line 204
    iget-boolean v1, p0, Lzd0;->β:Z

    .line 205
    .line 206
    if-ne v1, v0, :cond_b

    .line 207
    .line 208
    iget-object p0, p0, Lzd0;->γ:Ljava/util/List;

    .line 209
    .line 210
    invoke-virtual {p0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    if-nez p0, :cond_a

    .line 215
    .line 216
    goto :goto_a

    .line 217
    :cond_a
    if-nez v2, :cond_b

    .line 218
    .line 219
    goto :goto_b

    .line 220
    :cond_b
    :goto_a
    const-string p0, "r62bda5d817332bb8"

    .line 221
    .line 222
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    new-instance v2, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    const-string v3, "state refreshed reason="

    .line 229
    .line 230
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string v3, " enabled="

    .line 237
    .line 238
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v0, " count="

    .line 245
    .line 246
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {p0, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-static {p1}, Lbe0;->μ(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :goto_b
    return-void

    .line 263
    :goto_c
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 264
    throw p1
.end method

.method public final declared-synchronized ρ()Lae0;
    .locals 7

    .line 1
    const-string v0, "temporary reveal changed revealed="

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lbe0;->ε()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lx9;->δ()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    sget-object v0, Lae0;->ι:Lae0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-object v0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lbe0;->γ()Lzd0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    sget-object v0, Lae0;->θ:Lae0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    monitor-exit p0

    .line 29
    return-object v0

    .line 30
    :cond_1
    :try_start_2
    iget-boolean v2, v1, Lzd0;->β:Z

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    sget-object v0, Lae0;->η:Lae0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return-object v0

    .line 38
    :cond_2
    :try_start_3
    sget-object v2, Lbe0;->ε:Ljava/util/concurrent/atomic/AtomicReference;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Lhe0;

    .line 45
    .line 46
    iget-object v4, v1, Lzd0;->α:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v5, Lhe0;->β:Lhe0;

    .line 52
    .line 53
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-nez v6, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const-string v6, "0"

    .line 69
    .line 70
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_4

    .line 75
    .line 76
    :goto_0
    move-object v3, v5

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    invoke-virtual {v3, v4}, Lhe0;->α(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    new-instance v3, Lhe0;

    .line 86
    .line 87
    invoke-direct {v3, v4}, Lhe0;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :goto_1
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lbe0;->β()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    iget-object v6, v1, Lzd0;->α:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_6

    .line 104
    .line 105
    invoke-virtual {v2, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object v0, Lae0;->θ:Lae0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 109
    .line 110
    monitor-exit p0

    .line 111
    return-object v0

    .line 112
    :cond_6
    :try_start_4
    iget-object v1, v1, Lzd0;->α:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v3, v1}, Lhe0;->α(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    const-string v2, "r62bda5d817332bb8"

    .line 119
    .line 120
    new-instance v3, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v2, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string v0, "temporary_reveal"

    .line 136
    .line 137
    invoke-static {v0}, Lbe0;->μ(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    if-eqz v1, :cond_7

    .line 141
    .line 142
    sget-object v0, Lae0;->ε:Lae0;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_7
    sget-object v0, Lae0;->ζ:Lae0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 146
    .line 147
    :goto_2
    monitor-exit p0

    .line 148
    return-object v0

    .line 149
    :goto_3
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 150
    throw v0
.end method
