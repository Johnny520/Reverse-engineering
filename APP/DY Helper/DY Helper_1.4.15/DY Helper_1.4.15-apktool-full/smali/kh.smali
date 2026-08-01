.class public final Lkh;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lkh;

.field public static final β:Ljava/util/List;

.field public static final γ:Ljava/util/List;

.field public static volatile δ:Z

.field public static final ε:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static volatile η:Lhh;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lkh;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkh;->α:Lkh;

    .line 7
    .line 8
    const-string v7, "getPlayHost"

    .line 9
    .line 10
    const-string v8, "setPlayHost"

    .line 11
    .line 12
    const-string v1, "tryResumePlay"

    .line 13
    .line 14
    const-string v2, "tryPlay"

    .line 15
    .line 16
    const-string v3, "tryPlay PlayDataWrapper"

    .line 17
    .line 18
    const-string v4, "tryPlayWithInitialStart"

    .line 19
    .line 20
    const-string v5, "tryPrepareNext"

    .line 21
    .line 22
    const-string v6, "isPrepared = "

    .line 23
    .line 24
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lkh;->β:Ljava/util/List;

    .line 33
    .line 34
    const-string v5, "tryPlayWithInitialStart 3"

    .line 35
    .line 36
    const-string v6, "tryPlayWithInitialStart1"

    .line 37
    .line 38
    const-string v1, "tryResumePlay"

    .line 39
    .line 40
    const-string v2, "tryPlay"

    .line 41
    .line 42
    const-string v3, "tryPlay PlayDataWrapper"

    .line 43
    .line 44
    const-string v4, "tryPlayWithInitialStart"

    .line 45
    .line 46
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lkh;->γ:Ljava/util/List;

    .line 55
    .line 56
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sput-object v0, Lkh;->ε:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 61
    .line 62
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 63
    .line 64
    .line 65
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 66
    .line 67
    .line 68
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lkh;->ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 73
    .line 74
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static α(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {v0, p0}, Lus1;->Δ(Lss1;Lss1;)Lc40;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance v0, Ls9;

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    invoke-direct {v0, p1, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Ly30;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {p1, p0, v1, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 37
    .line 38
    .line 39
    new-instance p0, Lgh;

    .line 40
    .line 41
    const/4 v0, 0x3

    .line 42
    invoke-direct {p0, v0}, Lgh;-><init>(I)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lbu;

    .line 46
    .line 47
    invoke-interface {p1}, Lss1;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {v0, p1, p0}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lσ;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    const/4 p1, 0x0

    .line 59
    if-nez p0, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v0}, Lσ;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v0}, Lσ;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    :goto_0
    move-object p0, p1

    .line 73
    :cond_1
    check-cast p0, Ljava/lang/reflect/Method;

    .line 74
    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 78
    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_2
    return-object p1
.end method

.method public static β(Ljava/util/List;)V
    .locals 6

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/reflect/Method;

    .line 16
    .line 17
    invoke-static {v0}, Lkh;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Lkh;->ε:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    :try_start_0
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    sget-object v3, Lxq0;->α:Lxq0;

    .line 34
    .line 35
    new-instance v4, Lh;

    .line 36
    .line 37
    const/16 v5, 0xb

    .line 38
    .line 39
    invoke-direct {v4, v5}, Lh;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v0, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 43
    .line 44
    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v3, "r2aa3ccfd32411e22"

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    new-instance v3, Leo1;

    .line 70
    .line 71
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object v0, v3

    .line 75
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eqz v0, :cond_0

    .line 80
    .line 81
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v2, "r34c597cd38fc5889"

    .line 89
    .line 90
    invoke-static {v2, v1, v0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    return-void
.end method

.method public static ζ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 2

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sget-object v1, Ljz;->ε:Ljz;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    move-object p1, v1

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    new-instance v0, Leo1;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p1, v0

    .line 29
    :cond_1
    :goto_0
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    move-object v1, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    iget-object p0, p0, Lkx;->ε:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v0, "rda9cf57d154274ea"

    .line 44
    .line 45
    invoke-static {v0, p0, p1}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    check-cast v1, Ljava/util/List;

    .line 49
    .line 50
    return-object v1
.end method

.method public static η()Lih;
    .locals 9

    .line 1
    sget-object v0, Lkh;->η:Lhh;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v2, v0, Lhh;->α:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v3, v0, Lhh;->γ:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    if-nez v3, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget-object v0, v0, Lhh;->δ:Ljava/lang/reflect/Method;

    .line 22
    .line 23
    if-nez v0, :cond_3

    .line 24
    .line 25
    :goto_0
    return-object v1

    .line 26
    :cond_3
    :try_start_0
    invoke-virtual {v3, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    instance-of v4, v3, Ljava/lang/Number;

    .line 31
    .line 32
    if-eqz v4, :cond_4

    .line 33
    .line 34
    check-cast v3, Ljava/lang/Number;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto :goto_4

    .line 39
    :cond_4
    move-object v3, v1

    .line 40
    :goto_1
    if-eqz v3, :cond_7

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    instance-of v2, v0, Ljava/lang/Number;

    .line 51
    .line 52
    if-eqz v2, :cond_5

    .line 53
    .line 54
    check-cast v0, Ljava/lang/Number;

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_5
    move-object v0, v1

    .line 58
    :goto_2
    if-eqz v0, :cond_7

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 61
    .line 62
    .line 63
    move-result-wide v5

    .line 64
    const-wide/16 v7, 0x0

    .line 65
    .line 66
    cmp-long v0, v3, v7

    .line 67
    .line 68
    if-ltz v0, :cond_7

    .line 69
    .line 70
    cmp-long v0, v5, v7

    .line 71
    .line 72
    if-gtz v0, :cond_6

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_6
    new-instance v0, Lih;

    .line 76
    .line 77
    invoke-direct {v0, v3, v4, v5, v6}, Lih;-><init>(JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_7
    :goto_3
    move-object v0, v1

    .line 82
    goto :goto_5

    .line 83
    :goto_4
    new-instance v2, Leo1;

    .line 84
    .line 85
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    move-object v0, v2

    .line 89
    :goto_5
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    if-eqz v2, :cond_8

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const-string v3, "r18067f9ea08da666"

    .line 100
    .line 101
    const-string v4, "rc90e47ff78acb49f"

    .line 102
    .line 103
    invoke-static {v3, v2, v4}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_8
    instance-of v2, v0, Leo1;

    .line 107
    .line 108
    if-eqz v2, :cond_9

    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_9
    move-object v1, v0

    .line 112
    :goto_6
    check-cast v1, Lih;

    .line 113
    .line 114
    return-object v1
.end method

.method public static θ(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 9

    .line 1
    :try_start_0
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v0, "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB94312851DBF90DE22E29AC5FA85873739BB209E3F8E8F8E"

    .line 4
    .line 5
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    new-instance v0, Leo1;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    move-object p0, v0

    .line 21
    :goto_0
    instance-of v0, p0, Leo1;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    :cond_0
    check-cast p0, Ljava/lang/Class;

    .line 27
    .line 28
    sget-object v0, Ljz;->ε:Ljz;

    .line 29
    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    array-length v2, p0

    .line 46
    const/4 v3, 0x0

    .line 47
    move v4, v3

    .line 48
    :goto_1
    const/4 v5, 0x1

    .line 49
    if-ge v4, v2, :cond_3

    .line 50
    .line 51
    aget-object v6, p0, v4

    .line 52
    .line 53
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    const-string v8, "post"

    .line 58
    .line 59
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_2

    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 80
    .line 81
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eqz v7, :cond_2

    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    array-length v7, v7

    .line 92
    if-ne v7, v5, :cond_2

    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    aget-object v5, v5, v3

    .line 99
    .line 100
    const-class v7, Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {v5, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_2

    .line 107
    .line 108
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :catchall_1
    move-exception p0

    .line 113
    goto :goto_5

    .line 114
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_4

    .line 126
    .line 127
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, Ljava/lang/reflect/Method;

    .line 132
    .line 133
    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_4
    new-instance p0, Ljava/util/HashSet;

    .line 138
    .line 139
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 140
    .line 141
    .line 142
    new-instance v2, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    :cond_5
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_6

    .line 156
    .line 157
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    move-object v4, v3

    .line 162
    check-cast v4, Ljava/lang/reflect/Method;

    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {v4}, Lkh;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-virtual {p0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_5

    .line 176
    .line 177
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :goto_5
    new-instance v2, Leo1;

    .line 182
    .line 183
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    :cond_6
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    if-nez p0, :cond_7

    .line 191
    .line 192
    move-object v0, v2

    .line 193
    goto :goto_6

    .line 194
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    const-string v1, "rd0a8709765132844"

    .line 199
    .line 200
    invoke-static {v1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :goto_6
    check-cast v0, Ljava/util/List;

    .line 204
    .line 205
    return-object v0
.end method

.method public static ι(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    invoke-static {p0}, Lkh;->κ(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/Class;

    .line 25
    .line 26
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    array-length v3, v2

    .line 34
    const/4 v4, 0x0

    .line 35
    :goto_1
    if-ge v4, v3, :cond_3

    .line 36
    .line 37
    aget-object v5, v2, v4

    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 47
    .line 48
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    array-length v7, v7

    .line 63
    if-nez v7, :cond_2

    .line 64
    .line 65
    const-string v7, "resume"

    .line 66
    .line 67
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-nez v7, :cond_1

    .line 72
    .line 73
    const-string v7, "resumeplay"

    .line 74
    .line 75
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-nez v7, :cond_1

    .line 80
    .line 81
    const-string v7, "play"

    .line 82
    .line 83
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-nez v7, :cond_1

    .line 88
    .line 89
    const-string v7, "startplay"

    .line 90
    .line 91
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-nez v7, :cond_1

    .line 96
    .line 97
    const-string v7, "restartplay"

    .line 98
    .line 99
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_2

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catchall_0
    move-exception v2

    .line 107
    goto :goto_3

    .line 108
    :cond_1
    :goto_2
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-nez v6, :cond_2

    .line 117
    .line 118
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-nez v6, :cond_2

    .line 127
    .line 128
    const/4 v6, 0x1

    .line 129
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_3
    sget-object v2, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :goto_3
    new-instance v3, Leo1;

    .line 142
    .line 143
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    move-object v2, v3

    .line 147
    :goto_4
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    if-eqz v2, :cond_0

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const-string v3, "rea3e065ae01ffb29"

    .line 162
    .line 163
    invoke-static {v3, v1, v2}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_4
    new-instance p0, Ljava/util/HashSet;

    .line 169
    .line 170
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 171
    .line 172
    .line 173
    new-instance v1, Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    :cond_5
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_6

    .line 187
    .line 188
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    move-object v3, v2

    .line 193
    check-cast v3, Ljava/lang/reflect/Method;

    .line 194
    .line 195
    invoke-static {v3}, Lkh;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-eqz v3, :cond_5

    .line 204
    .line 205
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_6
    return-object v1
.end method

.method public static κ(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v1, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"

    .line 9
    .line 10
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {p0, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    goto :goto_1

    .line 33
    :goto_0
    new-instance v2, Leo1;

    .line 34
    .line 35
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object v1, v2

    .line 39
    :goto_1
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "r9234c76795e87c7c"

    .line 50
    .line 51
    invoke-static {v2, v1}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :try_start_1
    invoke-static {p0}, Luh1;->ι(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Ljava/lang/Class;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :catchall_1
    move-exception p0

    .line 79
    goto :goto_3

    .line 80
    :cond_2
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :goto_3
    new-instance v1, Leo1;

    .line 84
    .line 85
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    move-object p0, v1

    .line 89
    :goto_4
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-eqz p0, :cond_3

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    const-string v1, "r3d0421893c10d7ed"

    .line 100
    .line 101
    invoke-static {v1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :cond_4
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_5

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    move-object v2, v1

    .line 124
    check-cast v2, Ljava/lang/Class;

    .line 125
    .line 126
    invoke-static {v2}, Lkh;->π(Ljava/lang/Class;)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    const/16 v3, 0x1f4

    .line 131
    .line 132
    if-lt v2, v3, :cond_4

    .line 133
    .line 134
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_5
    new-instance v0, Ltf;

    .line 139
    .line 140
    const/4 v1, 0x3

    .line 141
    invoke-direct {v0, v1}, Ltf;-><init>(I)V

    .line 142
    .line 143
    .line 144
    invoke-static {p0, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    new-instance v0, Ljava/util/HashSet;

    .line 149
    .line 150
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 151
    .line 152
    .line 153
    new-instance v1, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    :cond_6
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-eqz v2, :cond_7

    .line 167
    .line 168
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    move-object v3, v2

    .line 173
    check-cast v3, Ljava/lang/Class;

    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_6

    .line 184
    .line 185
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_7
    return-object v1
.end method

.method public static ξ(Lkx;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v0, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    new-instance v0, Leo1;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object p1, v0

    .line 31
    :goto_0
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object p0, p0, Lkx;->ε:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v0, "rcf859c7511d447ef"

    .line 44
    .line 45
    invoke-static {v0, p0, p1}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_1
    return-void
.end method

.method public static ο(Ljava/lang/Class;)I
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"

    .line 6
    .line 7
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/16 v1, 0x7d0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    const-string v3, ".feed.controller."

    .line 23
    .line 24
    invoke-static {v0, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    add-int/lit16 v1, v1, 0x12c

    .line 31
    .line 32
    :cond_1
    const-string v3, "FeedPlayerWrapper"

    .line 33
    .line 34
    invoke-static {v0, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    add-int/lit16 v1, v1, 0x1f4

    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    array-length v3, v0

    .line 50
    move v4, v2

    .line 51
    :goto_1
    if-ge v4, v3, :cond_5

    .line 52
    .line 53
    aget-object v5, v0, v4

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const-string v7, "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A6499963AF392C9B2B9E9BAA7A7377F1B689B86E188"

    .line 60
    .line 61
    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_3

    .line 70
    .line 71
    add-int/lit16 v1, v1, 0x5dc

    .line 72
    .line 73
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    const-string v6, "IPlayerManager"

    .line 78
    .line 79
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_4

    .line 84
    .line 85
    add-int/lit16 v1, v1, 0x1f4

    .line 86
    .line 87
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance v0, Ljava/util/ArrayList;

    .line 98
    .line 99
    array-length v3, p0

    .line 100
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    array-length v3, p0

    .line 104
    :goto_2
    if-ge v2, v3, :cond_6

    .line 105
    .line 106
    aget-object v4, p0, v2

    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    add-int/lit8 v2, v2, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :catchall_0
    move-exception p0

    .line 119
    goto :goto_3

    .line 120
    :cond_6
    invoke-static {v0}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    goto :goto_4

    .line 125
    :goto_3
    new-instance v0, Leo1;

    .line 126
    .line 127
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    move-object p0, v0

    .line 131
    :goto_4
    instance-of v0, p0, Leo1;

    .line 132
    .line 133
    if-eqz v0, :cond_7

    .line 134
    .line 135
    sget-object p0, Lnz;->ε:Lnz;

    .line 136
    .line 137
    :cond_7
    check-cast p0, Ljava/util/Set;

    .line 138
    .line 139
    const-string v0, "isPlaying"

    .line 140
    .line 141
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_8

    .line 146
    .line 147
    add-int/lit16 v1, v1, 0x12c

    .line 148
    .line 149
    :cond_8
    const-string v0, "resumePlay"

    .line 150
    .line 151
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_9

    .line 156
    .line 157
    add-int/lit16 v1, v1, 0x12c

    .line 158
    .line 159
    :cond_9
    const-string v0, "stopPlay"

    .line 160
    .line 161
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_a

    .line 166
    .line 167
    add-int/lit16 v1, v1, 0xc8

    .line 168
    .line 169
    :cond_a
    const-string v0, "getCurrentPosition"

    .line 170
    .line 171
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_b

    .line 176
    .line 177
    add-int/lit16 v1, v1, 0x96

    .line 178
    .line 179
    :cond_b
    const-string v0, "getDuration"

    .line 180
    .line 181
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_c

    .line 186
    .line 187
    add-int/lit16 v1, v1, 0x96

    .line 188
    .line 189
    :cond_c
    const-string v0, "setOnUIPlayListener"

    .line 190
    .line 191
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    if-eqz p0, :cond_d

    .line 196
    .line 197
    add-int/lit16 v1, v1, 0x96

    .line 198
    .line 199
    :cond_d
    return v1
.end method

.method public static π(Ljava/lang/Class;)I
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Lkh;->ο(Ljava/lang/Class;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    new-instance v0, Leo1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object p0, v0

    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    instance-of v1, p0, Leo1;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    move-object p0, v0

    .line 27
    :cond_0
    check-cast p0, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
.end method

.method public static ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v3, Lgh;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-direct {v3, v4}, Lgh;-><init>(I)V

    .line 24
    .line 25
    .line 26
    const/16 v4, 0x1e

    .line 27
    .line 28
    const-string v5, ","

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    invoke-static {v2, v5, v6, v3, v4}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v3, "#"

    .line 44
    .line 45
    const-string v4, "("

    .line 46
    .line 47
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "):"

    .line 52
    .line 53
    invoke-static {v0, v1, p0}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method


# virtual methods
.method public final γ(Ljava/lang/reflect/Method;ZLjava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "r320d77a27e522e3c"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-static {p1}, Lkh;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object v2, Lkh;->ε:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 v3, 0x1

    .line 39
    :try_start_0
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 40
    .line 41
    .line 42
    sget-object v3, Lxq0;->α:Lxq0;

    .line 43
    .line 44
    new-instance v4, Ljh;

    .line 45
    .line 46
    invoke-direct {v4, p0, p2, p3, v1}, Ljh;-><init>(Lkh;ZLjava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, p1, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 50
    .line 51
    .line 52
    new-instance p0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    new-instance p1, Leo1;

    .line 75
    .line 76
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    move-object p0, p1

    .line 80
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-eqz p0, :cond_3

    .line 85
    .line 86
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const-string p1, "r432cb82eaad5bec3"

    .line 94
    .line 95
    invoke-static {p1, v1, p0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    :goto_1
    return-void
.end method

.method public final δ(Ljava/lang/Class;)V
    .locals 8

    .line 1
    sget-object v0, Ls62;->α:Ls62;

    .line 2
    .line 3
    sget-object v1, Lkh;->ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    array-length v3, v2

    .line 21
    move v4, v1

    .line 22
    :goto_0
    if-ge v4, v3, :cond_2

    .line 23
    .line 24
    aget-object v5, v2, v4

    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    const-string v7, "pause"

    .line 31
    .line 32
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    array-length v6, v6

    .line 46
    if-nez v6, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception v2

    .line 50
    goto :goto_2

    .line 51
    :cond_0
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    const-string v7, "pausePlay"

    .line 56
    .line 57
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    array-length v6, v6

    .line 71
    if-nez v6, :cond_1

    .line 72
    .line 73
    :goto_1
    const-string v6, "wrapper-current-known-pause"

    .line 74
    .line 75
    const/4 v7, 0x1

    .line 76
    invoke-virtual {p0, v5, v7, v6}, Lkh;->γ(Ljava/lang/reflect/Method;ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    move-object v3, v0

    .line 83
    goto :goto_3

    .line 84
    :goto_2
    new-instance v3, Leo1;

    .line 85
    .line 86
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    :goto_3
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    if-eqz v2, :cond_3

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    const-string v4, "rbc0beb26e2996b06"

    .line 104
    .line 105
    invoke-static {v4, v3, v2}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    array-length v3, v2

    .line 116
    move v4, v1

    .line 117
    :goto_4
    if-ge v4, v3, :cond_5

    .line 118
    .line 119
    aget-object v5, v2, v4

    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    const-string v7, "resumePlay"

    .line 126
    .line 127
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_4

    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    array-length v6, v6

    .line 141
    if-nez v6, :cond_4

    .line 142
    .line 143
    const-string v6, "wrapper-current-known-play"

    .line 144
    .line 145
    invoke-virtual {p0, v5, v1, v6}, Lkh;->γ(Ljava/lang/reflect/Method;ZLjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 146
    .line 147
    .line 148
    goto :goto_5

    .line 149
    :catchall_1
    move-exception p0

    .line 150
    goto :goto_6

    .line 151
    :cond_4
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :goto_6
    new-instance v0, Leo1;

    .line 155
    .line 156
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    :cond_5
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    if-eqz p0, :cond_6

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    const-string v0, "r7886db979930b2d0"

    .line 174
    .line 175
    invoke-static {v0, p1, p0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :cond_6
    return-void
.end method

.method public final ε(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lkh;->ν(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/Class;

    .line 24
    .line 25
    sget-object v4, Lkh;->ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v3}, Lkh;->δ(Ljava/lang/Class;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0, p1, v0}, Lkh;->λ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v2}, Lkh;->β(Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, v0}, Lkh;->μ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string p1, "dexkit-play-method"

    .line 50
    .line 51
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Ljava/lang/reflect/Method;

    .line 66
    .line 67
    sget-object v5, Lkh;->α:Lkh;

    .line 68
    .line 69
    invoke-virtual {v5, v4, v0, p1}, Lkh;->γ(Ljava/lang/reflect/Method;ZLjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 74
    .line 75
    const/16 v0, 0xa

    .line 76
    .line 77
    invoke-static {v1, v0}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Ljava/lang/Class;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    new-instance v1, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v2, "r10c386e7c649a115"

    .line 122
    .line 123
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :catchall_0
    move-exception p0

    .line 146
    new-instance p1, Leo1;

    .line 147
    .line 148
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    move-object p0, p1

    .line 152
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    if-eqz p0, :cond_3

    .line 157
    .line 158
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    const-string p1, "r9ea6606899eff01"

    .line 163
    .line 164
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_3
    return-void
.end method

.method public final λ(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 5

    .line 1
    sget-object v0, Lkx;->Ｖ:Lkx;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkh;->ζ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/lang/reflect/Method;

    .line 29
    .line 30
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p0, Ljava/util/HashSet;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance p1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object v1, v0

    .line 59
    check-cast v1, Ljava/lang/reflect/Method;

    .line 60
    .line 61
    invoke-static {v1}, Lkh;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    return-object p1

    .line 76
    :cond_3
    invoke-static {p1}, Lkh;->θ(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_4

    .line 85
    .line 86
    invoke-static {v0, v1}, Lkh;->ξ(Lkx;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_4
    sget-object v1, Ljz;->ε:Ljz;

    .line 91
    .line 92
    if-eqz p2, :cond_a

    .line 93
    .line 94
    sget-object p2, Lox;->α:Ljava/lang/Object;

    .line 95
    .line 96
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-nez p2, :cond_5

    .line 103
    .line 104
    goto :goto_6

    .line 105
    :cond_5
    :try_start_0
    const-string p2, "\u5b9a\u4f4d\u6e05\u723d\u6a21\u5f0f\u64ad\u653e\u6682\u505c\u4e8b\u4ef6\u5206\u53d1\u65b9\u6cd5"

    .line 106
    .line 107
    new-instance v2, Lbb;

    .line 108
    .line 109
    const/16 v4, 0x9

    .line 110
    .line 111
    invoke-direct {v2, p1, p0, v4}, Lbb;-><init>(Ljava/lang/ClassLoader;Ljava/lang/Object;I)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0, p1, p2, v2}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    goto :goto_2

    .line 119
    :catchall_0
    move-exception p0

    .line 120
    new-instance p1, Leo1;

    .line 121
    .line 122
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    move-object p0, p1

    .line 126
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-nez p1, :cond_6

    .line 131
    .line 132
    move-object v1, p0

    .line 133
    goto :goto_3

    .line 134
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    const-string p1, "rb9739b67638cb29f"

    .line 139
    .line 140
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :goto_3
    check-cast v1, Ljava/lang/Iterable;

    .line 144
    .line 145
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_7

    .line 154
    .line 155
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    check-cast p1, Ljava/lang/reflect/Method;

    .line 160
    .line 161
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 162
    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_7
    new-instance p0, Ljava/util/HashSet;

    .line 166
    .line 167
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 168
    .line 169
    .line 170
    new-instance p1, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    :cond_8
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_9

    .line 184
    .line 185
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    move-object v1, v0

    .line 190
    check-cast v1, Ljava/lang/reflect/Method;

    .line 191
    .line 192
    invoke-static {v1}, Lkh;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_8

    .line 201
    .line 202
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_9
    return-object p1

    .line 207
    :cond_a
    :goto_6
    return-object v1
.end method

.method public final μ(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 5

    .line 1
    sget-object v0, Lkx;->Ｗ:Lkx;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkh;->ζ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/lang/reflect/Method;

    .line 29
    .line 30
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p0, Ljava/util/HashSet;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance p1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object v1, v0

    .line 59
    check-cast v1, Ljava/lang/reflect/Method;

    .line 60
    .line 61
    invoke-static {v1}, Lkh;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    return-object p1

    .line 76
    :cond_3
    invoke-static {p1}, Lkh;->ι(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_4

    .line 85
    .line 86
    invoke-static {v0, v1}, Lkh;->ξ(Lkx;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_4
    sget-object v1, Ljz;->ε:Ljz;

    .line 91
    .line 92
    if-eqz p2, :cond_a

    .line 93
    .line 94
    sget-object p2, Lox;->α:Ljava/lang/Object;

    .line 95
    .line 96
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-nez p2, :cond_5

    .line 103
    .line 104
    goto :goto_6

    .line 105
    :cond_5
    :try_start_0
    const-string p2, "\u5b9a\u4f4d\u6e05\u723d\u6a21\u5f0f\u64ad\u653e\u6062\u590d\u65b9\u6cd5"

    .line 106
    .line 107
    new-instance v2, Lwa;

    .line 108
    .line 109
    const/4 v4, 0x4

    .line 110
    invoke-direct {v2, p0, v4, p1}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v0, p1, p2, v2}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    goto :goto_2

    .line 118
    :catchall_0
    move-exception p0

    .line 119
    new-instance p1, Leo1;

    .line 120
    .line 121
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    move-object p0, p1

    .line 125
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-nez p1, :cond_6

    .line 130
    .line 131
    move-object v1, p0

    .line 132
    goto :goto_3

    .line 133
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    const-string p1, "rd8a83d4d65199fe1"

    .line 138
    .line 139
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :goto_3
    check-cast v1, Ljava/lang/Iterable;

    .line 143
    .line 144
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_7

    .line 153
    .line 154
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Ljava/lang/reflect/Method;

    .line 159
    .line 160
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_7
    new-instance p0, Ljava/util/HashSet;

    .line 165
    .line 166
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 167
    .line 168
    .line 169
    new-instance p1, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    :cond_8
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_9

    .line 183
    .line 184
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    move-object v1, v0

    .line 189
    check-cast v1, Ljava/lang/reflect/Method;

    .line 190
    .line 191
    invoke-static {v1}, Lkh;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_8

    .line 200
    .line 201
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_9
    return-object p1

    .line 206
    :cond_a
    :goto_6
    return-object v1
.end method

.method public final ν(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 5

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sget-object v1, Lkx;->Ｕ:Lkx;

    .line 10
    .line 11
    sget-object v2, Ljz;->ε:Ljz;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    move-object v0, v2

    .line 16
    goto :goto_2

    .line 17
    :cond_0
    :try_start_0
    invoke-static {v1, p1}, Lox;->π(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    move-object v0, v2

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    new-instance v3, Leo1;

    .line 27
    .line 28
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object v0, v3

    .line 32
    :cond_1
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v3, "red6fb7ef6039f68clean_mode_feed_player_wrapper_classes"

    .line 44
    .line 45
    invoke-static {v3, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    move-object v0, v2

    .line 49
    :goto_1
    check-cast v0, Ljava/util/List;

    .line 50
    .line 51
    :goto_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/16 v4, 0x1f4

    .line 56
    .line 57
    if-nez v3, :cond_7

    .line 58
    .line 59
    new-instance p0, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    :cond_3
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_4

    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    move-object v0, p2

    .line 79
    check-cast v0, Ljava/lang/Class;

    .line 80
    .line 81
    invoke-static {v0}, Lkh;->π(Ljava/lang/Class;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-lt v0, v4, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    new-instance p1, Ltf;

    .line 92
    .line 93
    const/4 p2, 0x4

    .line 94
    invoke-direct {p1, p2}, Ltf;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-static {p0, p1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    new-instance p1, Ljava/util/HashSet;

    .line 102
    .line 103
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 104
    .line 105
    .line 106
    new-instance p2, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    :cond_5
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_6

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    move-object v1, v0

    .line 126
    check-cast v1, Ljava/lang/Class;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_5

    .line 137
    .line 138
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_6
    return-object p2

    .line 143
    :cond_7
    invoke-static {p1}, Lkh;->κ(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-nez v3, :cond_a

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-nez p0, :cond_9

    .line 158
    .line 159
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 160
    .line 161
    sget-object p0, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 162
    .line 163
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-nez p0, :cond_8

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_8
    :try_start_1
    invoke-static {v1, v0}, Lox;->υ(Lkx;Ljava/util/List;)V

    .line 171
    .line 172
    .line 173
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :catchall_1
    move-exception p0

    .line 177
    new-instance p1, Leo1;

    .line 178
    .line 179
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    move-object p0, p1

    .line 183
    :goto_5
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    if-eqz p0, :cond_9

    .line 188
    .line 189
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    const-string p1, "rc2ebd6802e2b99adclean_mode_feed_player_wrapper_classes"

    .line 194
    .line 195
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    :cond_9
    :goto_6
    return-object v0

    .line 199
    :cond_a
    if-eqz p2, :cond_11

    .line 200
    .line 201
    sget-object p2, Lox;->α:Ljava/lang/Object;

    .line 202
    .line 203
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 204
    .line 205
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 206
    .line 207
    .line 208
    move-result p2

    .line 209
    if-nez p2, :cond_b

    .line 210
    .line 211
    goto/16 :goto_b

    .line 212
    .line 213
    :cond_b
    :try_start_2
    const-string p2, "\u5b9a\u4f4d\u6e05\u723d\u6a21\u5f0f\u64ad\u653e\u63a7\u5236\u5668"

    .line 214
    .line 215
    new-instance v0, Lbb;

    .line 216
    .line 217
    const/16 v3, 0xa

    .line 218
    .line 219
    invoke-direct {v0, p1, p0, v3}, Lbb;-><init>(Ljava/lang/ClassLoader;Ljava/lang/Object;I)V

    .line 220
    .line 221
    .line 222
    invoke-static {v1, p1, p2, v0}, Lox;->ι(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 226
    goto :goto_7

    .line 227
    :catchall_2
    move-exception p0

    .line 228
    new-instance p1, Leo1;

    .line 229
    .line 230
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    move-object p0, p1

    .line 234
    :goto_7
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    if-nez p1, :cond_c

    .line 239
    .line 240
    move-object v2, p0

    .line 241
    goto :goto_8

    .line 242
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    const-string p1, "r89f247f5e3e34ef8"

    .line 247
    .line 248
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    :goto_8
    check-cast v2, Ljava/lang/Iterable;

    .line 252
    .line 253
    new-instance p0, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    :cond_d
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result p2

    .line 266
    if-eqz p2, :cond_e

    .line 267
    .line 268
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    move-object v0, p2

    .line 273
    check-cast v0, Ljava/lang/Class;

    .line 274
    .line 275
    invoke-static {v0}, Lkh;->π(Ljava/lang/Class;)I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-lt v0, v4, :cond_d

    .line 280
    .line 281
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    goto :goto_9

    .line 285
    :cond_e
    new-instance p1, Ltf;

    .line 286
    .line 287
    const/4 p2, 0x5

    .line 288
    invoke-direct {p1, p2}, Ltf;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-static {p0, p1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    new-instance p1, Ljava/util/HashSet;

    .line 296
    .line 297
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 298
    .line 299
    .line 300
    new-instance p2, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 303
    .line 304
    .line 305
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    :cond_f
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-eqz v0, :cond_10

    .line 314
    .line 315
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    move-object v1, v0

    .line 320
    check-cast v1, Ljava/lang/Class;

    .line 321
    .line 322
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_f

    .line 331
    .line 332
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    goto :goto_a

    .line 336
    :cond_10
    return-object p2

    .line 337
    :cond_11
    :goto_b
    return-object v2
.end method
