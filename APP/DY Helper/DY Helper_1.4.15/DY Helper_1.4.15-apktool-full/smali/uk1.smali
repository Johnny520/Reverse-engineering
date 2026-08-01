.class public final Luk1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final ε:Lt41;

.field public final ζ:Li5;

.field public final η:Lxk1;

.field public final θ:Ltk1;

.field public final ι:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public κ:Landroid/util/CloseGuard;

.field public λ:Lc00;

.field public μ:Lvk1;

.field public ν:Z

.field public ξ:Lzz;

.field public ο:Z

.field public π:Z

.field public ρ:Z

.field public σ:Z

.field public τ:Z

.field public volatile υ:Z

.field public volatile φ:Lzz;

.field public final χ:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>(Lt41;Li5;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Luk1;->ε:Lt41;

    .line 8
    .line 9
    iput-object p2, p0, Luk1;->ζ:Li5;

    .line 10
    .line 11
    iget-object v0, p1, Lt41;->Γ:Ln;

    .line 12
    .line 13
    iget-object v0, v0, Ln;->ζ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lxk1;

    .line 16
    .line 17
    iput-object v0, p0, Luk1;->η:Lxk1;

    .line 18
    .line 19
    iget-object p1, p1, Lt41;->δ:Lql1;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance p1, Ltk1;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Ltk1;-><init>(Luk1;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    int-to-long v0, v0

    .line 31
    invoke-virtual {p1, v0, v1}, Lm42;->η(J)Lm42;

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Luk1;->θ:Ltk1;

    .line 35
    .line 36
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Luk1;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Luk1;->τ:Z

    .line 45
    .line 46
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Luk1;->χ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 52
    .line 53
    new-instance p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 54
    .line 55
    iget-object p1, p2, Li5;->ζ:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lx;

    .line 58
    .line 59
    invoke-direct {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Luk1;

    .line 2
    .line 3
    iget-object v1, p0, Luk1;->ε:Lt41;

    .line 4
    .line 5
    iget-object p0, p0, Luk1;->ζ:Li5;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Luk1;-><init>(Lt41;Li5;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final α(Lvk1;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lud2;->α:Ljava/util/TimeZone;

    .line 5
    .line 6
    iget-object v0, p0, Luk1;->μ:Lvk1;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Luk1;->μ:Lvk1;

    .line 11
    .line 12
    iget-object p1, p1, Lvk1;->π:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance v0, Lsk1;

    .line 15
    .line 16
    iget-object v1, p0, Luk1;->κ:Landroid/util/CloseGuard;

    .line 17
    .line 18
    invoke-direct {v0, p0, v1}, Lsk1;-><init>(Luk1;Landroid/util/CloseGuard;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string p0, "Check failed."

    .line 26
    .line 27
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final β(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    sget-object v0, Lud2;->α:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v0, p0, Luk1;->μ:Lvk1;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    invoke-virtual {p0}, Luk1;->ι()Ljava/net/Socket;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    iget-object v0, p0, Luk1;->μ:Lvk1;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-static {v1}, Lud2;->γ(Ljava/net/Socket;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const-string p0, "Check failed."

    .line 27
    .line 28
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    monitor-exit v0

    .line 35
    throw p0

    .line 36
    :cond_2
    :goto_0
    iget-boolean v0, p0, Luk1;->ν:Z

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    iget-object p0, p0, Luk1;->θ:Ltk1;

    .line 42
    .line 43
    invoke-virtual {p0}, Li7;->ι()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_4

    .line 48
    .line 49
    :goto_1
    move-object p0, p1

    .line 50
    goto :goto_2

    .line 51
    :cond_4
    new-instance p0, Ljava/io/InterruptedIOException;

    .line 52
    .line 53
    const-string v0, "timeout"

    .line 54
    .line 55
    invoke-direct {p0, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    if-eqz p1, :cond_5

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 61
    .line 62
    .line 63
    :cond_5
    :goto_2
    if-eqz p1, :cond_6

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    :cond_6
    return-object p0
.end method

.method public final γ()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Luk1;->υ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Luk1;->υ:Z

    .line 8
    .line 9
    iget-object v0, p0, Luk1;->φ:Lzz;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, Lzz;->δ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lb00;

    .line 16
    .line 17
    invoke-interface {v0}, Lb00;->cancel()V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object p0, p0, Luk1;->χ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lbp1;

    .line 40
    .line 41
    invoke-interface {v0}, Lbp1;->cancel()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return-void
.end method

.method public final δ()Lzn1;
    .locals 3

    .line 1
    iget-object v0, p0, Luk1;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Luk1;->θ:Ltk1;

    .line 12
    .line 13
    invoke-virtual {v0}, Li7;->θ()V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lgh1;->α:Lf0;

    .line 17
    .line 18
    sget-object v0, Lgh1;->α:Lf0;

    .line 19
    .line 20
    const-string v1, "response.body().close()"

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v0, Landroid/util/CloseGuard;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/util/CloseGuard;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/util/CloseGuard;->open(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Luk1;->κ:Landroid/util/CloseGuard;

    .line 34
    .line 35
    :try_start_0
    iget-object v0, p0, Luk1;->ε:Lt41;

    .line 36
    .line 37
    iget-object v0, v0, Lt41;->α:Li0;

    .line 38
    .line 39
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :try_start_1
    iget-object v1, v0, Li0;->ι:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Ljava/util/ArrayDeque;

    .line 43
    .line 44
    invoke-virtual {v1, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    .line 46
    .line 47
    :try_start_2
    monitor-exit v0

    .line 48
    invoke-virtual {p0}, Luk1;->ζ()Lzn1;

    .line 49
    .line 50
    .line 51
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    iget-object v1, p0, Luk1;->ε:Lt41;

    .line 53
    .line 54
    iget-object v1, v1, Lt41;->α:Li0;

    .line 55
    .line 56
    invoke-virtual {v1, p0}, Li0;->σ(Luk1;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    goto :goto_0

    .line 62
    :catchall_1
    move-exception v1

    .line 63
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 64
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 65
    :goto_0
    iget-object v1, p0, Luk1;->ε:Lt41;

    .line 66
    .line 67
    iget-object v1, v1, Lt41;->α:Li0;

    .line 68
    .line 69
    invoke-virtual {v1, p0}, Li0;->σ(Luk1;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_0
    const-string p0, "Already Executed"

    .line 74
    .line 75
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    return-object p0
.end method

.method public final ε(Z)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Luk1;->τ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Luk1;->φ:Lzz;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget-object p1, v2, Lzz;->δ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lb00;

    .line 16
    .line 17
    invoke-interface {p1}, Lb00;->cancel()V

    .line 18
    .line 19
    .line 20
    iget-object p1, v2, Lzz;->β:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v1, p1

    .line 23
    check-cast v1, Luk1;

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v3, 0x1

    .line 28
    const/4 v4, 0x1

    .line 29
    const/4 v5, 0x1

    .line 30
    invoke-virtual/range {v1 .. v7}, Luk1;->η(Lzz;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    iput-object p1, p0, Luk1;->ξ:Lzz;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    :try_start_1
    const-string p1, "released"

    .line 38
    .line 39
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    monitor-exit p0

    .line 48
    throw p1
.end method

.method public final ζ()Lzn1;
    .locals 9

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Luk1;->ε:Lt41;

    .line 7
    .line 8
    iget-object v0, v0, Lt41;->β:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {v2, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Llc;

    .line 14
    .line 15
    iget-object v1, p0, Luk1;->ε:Lt41;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Llc;-><init>(Lt41;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    new-instance v0, Llc;

    .line 24
    .line 25
    iget-object v1, p0, Luk1;->ε:Lt41;

    .line 26
    .line 27
    iget-object v1, v1, Lt41;->κ:Lx;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Llc;-><init>(Lx;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    new-instance v0, Lkd;

    .line 36
    .line 37
    iget-object v1, p0, Luk1;->ε:Lt41;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x2

    .line 43
    invoke-direct {v0, v1}, Lkd;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    sget-object v0, Lkd;->γ:Lkd;

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Luk1;->ε:Lt41;

    .line 55
    .line 56
    iget-object v0, v0, Lt41;->γ:Ljava/util/List;

    .line 57
    .line 58
    invoke-static {v2, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lkd;->β:Lkd;

    .line 62
    .line 63
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    new-instance v0, Lyk1;

    .line 67
    .line 68
    iget-object v5, p0, Luk1;->ζ:Li5;

    .line 69
    .line 70
    iget-object v1, p0, Luk1;->ε:Lt41;

    .line 71
    .line 72
    iget v6, v1, Lt41;->χ:I

    .line 73
    .line 74
    iget v7, v1, Lt41;->ψ:I

    .line 75
    .line 76
    iget v8, v1, Lt41;->ω:I

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    const/4 v4, 0x0

    .line 80
    move-object v1, p0

    .line 81
    invoke-direct/range {v0 .. v8}, Lyk1;-><init>(Luk1;Ljava/util/ArrayList;ILzz;Li5;III)V

    .line 82
    .line 83
    .line 84
    const/4 p0, 0x0

    .line 85
    const/4 v2, 0x0

    .line 86
    :try_start_0
    invoke-virtual {v0, v5}, Lyk1;->β(Li5;)Lzn1;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget-boolean v3, v1, Luk1;->υ:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    if-nez v3, :cond_0

    .line 93
    .line 94
    invoke-virtual {v1, p0}, Luk1;->θ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_0
    :try_start_1
    invoke-static {v0}, Lsd2;->β(Ljava/io/Closeable;)V

    .line 99
    .line 100
    .line 101
    new-instance v0, Ljava/io/IOException;

    .line 102
    .line 103
    const-string v3, "Canceled"

    .line 104
    .line 105
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    :catchall_0
    move-exception v0

    .line 110
    goto :goto_0

    .line 111
    :catch_0
    move-exception v0

    .line 112
    const/4 v2, 0x1

    .line 113
    :try_start_2
    invoke-virtual {v1, v0}, Luk1;->θ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 121
    :goto_0
    if-nez v2, :cond_1

    .line 122
    .line 123
    invoke-virtual {v1, p0}, Luk1;->θ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 124
    .line 125
    .line 126
    :cond_1
    throw v0
.end method

.method public final η(Lzz;ZZZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Luk1;->φ:Lzz;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_0
    monitor-enter p0

    .line 15
    const/4 p1, 0x1

    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    :try_start_0
    iget-boolean v1, p0, Luk1;->ο:Z

    .line 20
    .line 21
    if-nez v1, :cond_4

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_2

    .line 26
    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    .line 27
    .line 28
    iget-boolean v1, p0, Luk1;->π:Z

    .line 29
    .line 30
    if-nez v1, :cond_4

    .line 31
    .line 32
    :cond_2
    if-eqz p5, :cond_3

    .line 33
    .line 34
    iget-boolean v1, p0, Luk1;->ρ:Z

    .line 35
    .line 36
    if-nez v1, :cond_4

    .line 37
    .line 38
    :cond_3
    if-eqz p4, :cond_b

    .line 39
    .line 40
    iget-boolean v1, p0, Luk1;->σ:Z

    .line 41
    .line 42
    if-eqz v1, :cond_b

    .line 43
    .line 44
    :cond_4
    if-eqz p2, :cond_5

    .line 45
    .line 46
    iput-boolean v0, p0, Luk1;->ο:Z

    .line 47
    .line 48
    :cond_5
    if-eqz p3, :cond_6

    .line 49
    .line 50
    iput-boolean v0, p0, Luk1;->π:Z

    .line 51
    .line 52
    :cond_6
    if-eqz p5, :cond_7

    .line 53
    .line 54
    iput-boolean v0, p0, Luk1;->ρ:Z

    .line 55
    .line 56
    :cond_7
    if-eqz p4, :cond_8

    .line 57
    .line 58
    iput-boolean v0, p0, Luk1;->σ:Z

    .line 59
    .line 60
    :cond_8
    iget-boolean p2, p0, Luk1;->ο:Z

    .line 61
    .line 62
    if-nez p2, :cond_9

    .line 63
    .line 64
    iget-boolean p2, p0, Luk1;->π:Z

    .line 65
    .line 66
    if-nez p2, :cond_9

    .line 67
    .line 68
    iget-boolean p2, p0, Luk1;->ρ:Z

    .line 69
    .line 70
    if-nez p2, :cond_9

    .line 71
    .line 72
    iget-boolean p2, p0, Luk1;->σ:Z

    .line 73
    .line 74
    if-nez p2, :cond_9

    .line 75
    .line 76
    move p2, p1

    .line 77
    goto :goto_1

    .line 78
    :cond_9
    move p2, v0

    .line 79
    :goto_1
    if-eqz p2, :cond_a

    .line 80
    .line 81
    iget-boolean p3, p0, Luk1;->τ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    if-nez p3, :cond_a

    .line 84
    .line 85
    move v0, p1

    .line 86
    :cond_a
    move v2, v0

    .line 87
    move v0, p2

    .line 88
    move p2, v2

    .line 89
    goto :goto_3

    .line 90
    :goto_2
    monitor-exit p0

    .line 91
    throw p1

    .line 92
    :cond_b
    move p2, v0

    .line 93
    :goto_3
    monitor-exit p0

    .line 94
    if-eqz v0, :cond_c

    .line 95
    .line 96
    const/4 p3, 0x0

    .line 97
    iput-object p3, p0, Luk1;->φ:Lzz;

    .line 98
    .line 99
    iget-object p3, p0, Luk1;->μ:Lvk1;

    .line 100
    .line 101
    if-eqz p3, :cond_c

    .line 102
    .line 103
    monitor-enter p3

    .line 104
    :try_start_1
    iget p4, p3, Lvk1;->ν:I

    .line 105
    .line 106
    add-int/2addr p4, p1

    .line 107
    iput p4, p3, Lvk1;->ν:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    .line 109
    monitor-exit p3

    .line 110
    goto :goto_4

    .line 111
    :catchall_1
    move-exception p0

    .line 112
    monitor-exit p3

    .line 113
    throw p0

    .line 114
    :cond_c
    :goto_4
    if-eqz p2, :cond_d

    .line 115
    .line 116
    invoke-virtual {p0, p6}, Luk1;->β(Ljava/io/IOException;)Ljava/io/IOException;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :cond_d
    :goto_5
    return-object p6
.end method

.method public final θ(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Luk1;->τ:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, Luk1;->τ:Z

    .line 8
    .line 9
    iget-boolean v0, p0, Luk1;->ο:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Luk1;->π:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-boolean v0, p0, Luk1;->ρ:Z

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Luk1;->σ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    monitor-exit p0

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Luk1;->β(Ljava/io/IOException;)Ljava/io/IOException;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    return-object p1

    .line 38
    :goto_1
    monitor-exit p0

    .line 39
    throw p1
.end method

.method public final ι()Ljava/net/Socket;
    .locals 6

    .line 1
    iget-object v0, p0, Luk1;->μ:Lvk1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Lud2;->α:Ljava/util/TimeZone;

    .line 7
    .line 8
    iget-object v1, v0, Lvk1;->π:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v5, -0x1

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Ljava/lang/ref/Reference;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-static {v4, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v3, v5

    .line 43
    :goto_1
    const/4 v2, 0x0

    .line 44
    if-eq v3, v5, :cond_6

    .line 45
    .line 46
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Luk1;->μ:Lvk1;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    iput-wide v3, v0, Lvk1;->ρ:J

    .line 62
    .line 63
    iget-object p0, p0, Luk1;->η:Lxk1;

    .line 64
    .line 65
    iget-object v1, p0, Lxk1;->δ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 66
    .line 67
    sget-object v3, Lud2;->α:Ljava/util/TimeZone;

    .line 68
    .line 69
    iget-boolean v3, v0, Lvk1;->κ:Z

    .line 70
    .line 71
    if-nez v3, :cond_2

    .line 72
    .line 73
    iget-object v0, p0, Lxk1;->β:Lw22;

    .line 74
    .line 75
    iget-object p0, p0, Lxk1;->γ:Lwk1;

    .line 76
    .line 77
    const-wide/16 v3, 0x0

    .line 78
    .line 79
    invoke-virtual {v0, p0, v3, v4}, Lw22;->γ(Lt22;J)V

    .line 80
    .line 81
    .line 82
    return-object v2

    .line 83
    :cond_2
    const/4 v2, 0x1

    .line 84
    iput-boolean v2, v0, Lvk1;->κ:Z

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    iget-object p0, p0, Lxk1;->β:Lw22;

    .line 96
    .line 97
    iget-object v1, p0, Lw22;->α:Lx22;

    .line 98
    .line 99
    monitor-enter v1

    .line 100
    :try_start_0
    invoke-virtual {p0}, Lw22;->α()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_3

    .line 105
    .line 106
    iget-object v2, p0, Lw22;->α:Lx22;

    .line 107
    .line 108
    invoke-virtual {v2, p0}, Lx22;->γ(Lw22;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    goto :goto_3

    .line 114
    :cond_3
    :goto_2
    monitor-exit v1

    .line 115
    goto :goto_4

    .line 116
    :goto_3
    monitor-exit v1

    .line 117
    throw p0

    .line 118
    :cond_4
    :goto_4
    iget-object p0, v0, Lvk1;->ε:Ljava/net/Socket;

    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_5
    return-object v2

    .line 122
    :cond_6
    const-string p0, "Check failed."

    .line 123
    .line 124
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-object v2
.end method
