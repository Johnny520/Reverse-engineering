.class public final Ldj0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final γ:Ljava/util/concurrent/ScheduledExecutorService;


# instance fields
.field public final α:Lhi0;

.field public final β:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Laj;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Laj;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Ldj0;->γ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lhi0;)V
    .locals 1

    .line 1
    sget-object v0, Ldj0;->γ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldj0;->α:Lhi0;

    .line 10
    .line 11
    iput-object v0, p0, Ldj0;->β:Ljava/util/concurrent/ScheduledExecutorService;

    .line 12
    .line 13
    return-void
.end method

.method public static α(Lcj0;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcj0;->ζ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcj0;->ζ:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcj0;->θ:Ljava/util/concurrent/ScheduledFuture;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 15
    .line 16
    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcj0;->θ:Ljava/util/concurrent/ScheduledFuture;

    .line 19
    .line 20
    :try_start_0
    iget-object v1, p0, Lcj0;->ι:Lhi0;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget-object v1, v1, Lhi0;->ε:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    sget-object v2, Lwi0;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    :catchall_0
    :cond_2
    iput-object v0, p0, Lcj0;->ι:Lhi0;

    .line 34
    .line 35
    iput-object v0, p0, Lcj0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    :try_start_1
    iget-object v0, p0, Lcj0;->β:Lji0;

    .line 38
    .line 39
    iget-object p0, p0, Lcj0;->γ:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object v1, Lmi0;->β:Ljava/util/concurrent/ExecutorService;

    .line 46
    .line 47
    iget-object v2, v0, Lji0;->α:Lli0;

    .line 48
    .line 49
    new-instance v3, Lfi0;

    .line 50
    .line 51
    invoke-direct {v3, v0, v2}, Lfi0;-><init>(Lji0;Lli0;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    new-instance v0, Lp3;

    .line 58
    .line 59
    const/16 v1, 0x18

    .line 60
    .line 61
    invoke-direct {v0, v2, v1, p0}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v0}, Lli0;->δ(Lp70;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    .line 66
    .line 67
    :catchall_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final β(Lcj0;Ljava/util/concurrent/atomic/AtomicBoolean;Lhj0;)V
    .locals 4

    .line 1
    iget-boolean v0, p1, Lcj0;->ζ:Z

    .line 2
    .line 3
    iget-object v1, p1, Lcj0;->γ:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p1, Lcj0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    if-eq v0, p2, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 v0, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {p2, v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_2

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_2
    iget-object p2, p1, Lcj0;->θ:Ljava/util/concurrent/ScheduledFuture;

    .line 23
    .line 24
    if-eqz p2, :cond_3

    .line 25
    .line 26
    invoke-interface {p2, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 27
    .line 28
    .line 29
    :cond_3
    const/4 p2, 0x0

    .line 30
    iput-object p2, p1, Lcj0;->θ:Ljava/util/concurrent/ScheduledFuture;

    .line 31
    .line 32
    :try_start_0
    iget-object v0, p1, Lcj0;->ι:Lhi0;

    .line 33
    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    iget-object v0, v0, Lhi0;->ε:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljava/lang/String;

    .line 39
    .line 40
    sget-object v3, Lwi0;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    :catchall_0
    :cond_4
    iput-object p2, p1, Lcj0;->ι:Lhi0;

    .line 46
    .line 47
    iput-object p2, p1, Lcj0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    .line 49
    iget p2, p1, Lcj0;->δ:I

    .line 50
    .line 51
    add-int/2addr p2, v2

    .line 52
    iput p2, p1, Lcj0;->δ:I

    .line 53
    .line 54
    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :try_start_1
    iget-object p2, p1, Lcj0;->β:Lji0;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v1, p1, Lcj0;->α:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {p2, v0, v1, p3}, Lji0;->α(IILhj0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    .line 71
    .line 72
    :catchall_1
    invoke-virtual {p0, p1}, Ldj0;->γ(Lcj0;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final γ(Lcj0;)V
    .locals 9

    .line 1
    iget-boolean v0, p1, Lcj0;->ζ:Z

    .line 2
    .line 3
    iget-object v1, p1, Lcj0;->α:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    iget-object v0, p1, Lcj0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_0
    iget-boolean v0, p1, Lcj0;->ε:Z

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    :catchall_0
    :goto_0
    iget p0, p1, Lcj0;->δ:I

    .line 18
    .line 19
    iget-object v0, p1, Lcj0;->γ:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-ge p0, v2, :cond_1

    .line 26
    .line 27
    iget p0, p1, Lcj0;->δ:I

    .line 28
    .line 29
    add-int/lit8 v2, p0, 0x1

    .line 30
    .line 31
    iput v2, p1, Lcj0;->δ:I

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lxi0;

    .line 38
    .line 39
    new-instance v2, Lhj0;

    .line 40
    .line 41
    sget-object v3, Lyi0;->θ:Lyi0;

    .line 42
    .line 43
    const-string v4, "\u7528\u6237\u505c\u6b62\u4e86\u540e\u7eed\u5220\u9664"

    .line 44
    .line 45
    invoke-direct {v2, p0, v3, v4}, Lhj0;-><init>(Lxi0;Lyi0;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :try_start_0
    iget-object p0, p1, Lcj0;->β:Lji0;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-virtual {p0, v0, v3, v2}, Lji0;->α(IILhj0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-static {p1}, Ldj0;->α(Lcj0;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    iget v0, p1, Lcj0;->δ:I

    .line 70
    .line 71
    invoke-static {v0, v1}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    move-object v5, v0

    .line 76
    check-cast v5, Lxi0;

    .line 77
    .line 78
    if-nez v5, :cond_3

    .line 79
    .line 80
    invoke-static {p1}, Ldj0;->α(Lcj0;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    invoke-direct {v4, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 88
    .line 89
    .line 90
    iput-object v4, p1, Lcj0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 91
    .line 92
    new-instance v1, Laj0;

    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    move-object v2, p0

    .line 96
    move-object v3, p1

    .line 97
    invoke-direct/range {v1 .. v6}, Laj0;-><init>(Ldj0;Lcj0;Ljava/util/concurrent/atomic/AtomicBoolean;Lxi0;I)V

    .line 98
    .line 99
    .line 100
    const-wide/16 p0, 0x4e20

    .line 101
    .line 102
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 103
    .line 104
    iget-object v8, v2, Ldj0;->β:Ljava/util/concurrent/ScheduledExecutorService;

    .line 105
    .line 106
    invoke-interface {v8, v1, p0, p1, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    iput-object p0, v3, Lcj0;->θ:Ljava/util/concurrent/ScheduledFuture;

    .line 111
    .line 112
    new-instance p0, Li0;

    .line 113
    .line 114
    invoke-direct {p0, v2, v3, v4, v5}, Li0;-><init>(Ldj0;Lcj0;Ljava/util/concurrent/atomic/AtomicBoolean;Lxi0;)V

    .line 115
    .line 116
    .line 117
    :try_start_1
    iget-object p1, v2, Ldj0;->α:Lhi0;

    .line 118
    .line 119
    iget-object v0, v5, Lxi0;->α:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {p1, v0, p0}, Lhi0;->α(Ljava/lang/String;Li0;)Lhi0;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    iput-object p0, v3, Lcj0;->ι:Lhi0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 126
    .line 127
    return-void

    .line 128
    :catchall_1
    move-exception v0

    .line 129
    move-object p0, v0

    .line 130
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-nez p1, :cond_4

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :cond_4
    move-object v6, p1

    .line 145
    new-instance v1, Lbj0;

    .line 146
    .line 147
    const/4 v7, 0x0

    .line 148
    invoke-direct/range {v1 .. v7}, Lbj0;-><init>(Ldj0;Lcj0;Ljava/util/concurrent/atomic/AtomicBoolean;Lxi0;Ljava/lang/String;I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v8, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 152
    .line 153
    .line 154
    :cond_5
    :goto_1
    return-void
.end method
