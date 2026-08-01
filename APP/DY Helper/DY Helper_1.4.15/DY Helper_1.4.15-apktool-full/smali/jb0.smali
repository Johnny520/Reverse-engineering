.class public abstract Ljb0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/concurrent/ScheduledExecutorService;

.field public static volatile ζ:Ljava/lang/ClassLoader;

.field public static η:I

.field public static θ:I

.field public static ι:Ljava/util/concurrent/ScheduledFuture;

.field public static final κ:Ls20;

.field public static final λ:Lib0;

.field public static final μ:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ljb0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ljb0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ljb0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Ljb0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    new-instance v0, Laj;

    .line 31
    .line 32
    const/4 v1, 0x6

    .line 33
    invoke-direct {v0, v1}, Laj;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Ljb0;->ε:Ljava/util/concurrent/ScheduledExecutorService;

    .line 41
    .line 42
    new-instance v0, Ls20;

    .line 43
    .line 44
    const/16 v1, 0x19

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ls20;-><init>(I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Ljb0;->κ:Ls20;

    .line 50
    .line 51
    new-instance v0, Lib0;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    sput-object v0, Ljb0;->λ:Lib0;

    .line 57
    .line 58
    const-string v0, "group_apply_auto_approval_polling_enabled"

    .line 59
    .line 60
    const-string v1, "group_apply_auto_approval_interval_seconds"

    .line 61
    .line 62
    const-string v2, "group_apply_auto_approval_cold_start_enabled"

    .line 63
    .line 64
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Ljb0;->μ:Ljava/util/Set;

    .line 73
    .line 74
    return-void
.end method

.method public static α(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Ljb0;->ζ:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    :cond_0
    sput-object p0, Ljb0;->ζ:Ljava/lang/ClassLoader;

    .line 14
    .line 15
    sget-object p0, Ljb0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Ljb0;->ε:Ljava/util/concurrent/ScheduledExecutorService;

    .line 22
    .line 23
    new-instance v0, Ls0;

    .line 24
    .line 25
    const/16 v1, 0x1c

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ls0;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static β()Z
    .locals 1

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lx9;->γ()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Ljb0;->ζ:Ljava/lang/ClassLoader;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public static γ(Lhb0;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    const-string p0, "group_apply_auto_approval_polling_enabled"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    const-string p0, "group_apply_auto_approval_cold_start_enabled"

    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x0

    .line 21
    :try_start_0
    invoke-static {p0, v0}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    new-instance v0, Leo1;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p0, v0

    .line 37
    :goto_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 38
    .line 39
    instance-of v1, p0, Leo1;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    move-object p0, v0

    .line 44
    :cond_2
    check-cast p0, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0
.end method

.method public static δ(Lhb0;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    const-string p0, "\u8f6e\u8be2"

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_1
    const-string p0, "\u51b7\u542f\u52a8"

    .line 19
    .line 20
    return-object p0
.end method

.method public static ε(Lhb0;)Z
    .locals 4

    .line 1
    invoke-static {}, Ljb0;->β()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-static {p0}, Ljb0;->γ(Lhb0;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Ljb0;->ζ:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    sget-object v1, Lui1;->α:Ljava/lang/Object;

    .line 20
    .line 21
    sget-wide v1, Lui1;->θ:J

    .line 22
    .line 23
    new-instance v3, Lgx;

    .line 24
    .line 25
    invoke-direct {v3, v0, p0, v1, v2}, Lgx;-><init>(Ljava/lang/ClassLoader;Lhb0;J)V

    .line 26
    .line 27
    .line 28
    invoke-static {v3}, Ljc0;->α(Lp70;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    invoke-static {p0}, Ljb0;->δ(Lhb0;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string v1, "\u5ba1\u6279\u8df3\u8fc7\uff1a\u7fa4\u7533\u8bf7\u4efb\u52a1\u6b63\u5728\u5176\u4ed6\u5165\u53e3\u6267\u884c"

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string v1, "rb22c2f83ae9ef877"

    .line 45
    .line 46
    invoke-static {v1, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return v0

    .line 50
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 51
    return p0
.end method

.method public static ζ(J)V
    .locals 4

    .line 1
    sget-object v0, Lhb0;->ε:Lhb0;

    .line 2
    .line 3
    invoke-static {v0}, Ljb0;->γ(Lhb0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    sget-object v0, Ljb0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    const/4 v1, 0x1

    .line 20
    sget-object v2, Ljb0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-instance v0, Ls0;

    .line 30
    .line 31
    const/16 v1, 0x1d

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ls0;-><init>(I)V

    .line 34
    .line 35
    .line 36
    const-wide/16 v1, 0x0

    .line 37
    .line 38
    cmp-long v3, p0, v1

    .line 39
    .line 40
    if-gez v3, :cond_2

    .line 41
    .line 42
    move-wide p0, v1

    .line 43
    :cond_2
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 44
    .line 45
    sget-object v2, Ljb0;->ε:Ljava/util/concurrent/ScheduledExecutorService;

    .line 46
    .line 47
    invoke-interface {v2, v0, p0, p1, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_0
    return-void
.end method

.method public static η()V
    .locals 11

    .line 1
    sget-object v0, Lhb0;->ζ:Lhb0;

    .line 2
    .line 3
    invoke-static {v0}, Ljb0;->γ(Lhb0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    sget-object v0, Ljb0;->ι:Ljava/util/concurrent/ScheduledFuture;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    sput-object v2, Ljb0;->ι:Ljava/util/concurrent/ScheduledFuture;

    .line 19
    .line 20
    sput v1, Ljb0;->θ:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    const/16 v3, 0x3c

    .line 24
    .line 25
    :try_start_0
    const-string v0, "group_apply_auto_approval_interval_seconds"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    .line 27
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-interface {v4, v0, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 32
    .line 33
    .line 34
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move v0, v3

    .line 37
    :goto_0
    :try_start_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 41
    goto :goto_1

    .line 42
    :catchall_1
    move-exception v0

    .line 43
    new-instance v4, Leo1;

    .line 44
    .line 45
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    move-object v0, v4

    .line 49
    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    instance-of v4, v0, Leo1;

    .line 54
    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    move-object v0, v3

    .line 58
    :cond_2
    check-cast v0, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/16 v3, 0xa

    .line 65
    .line 66
    const/16 v4, 0xe10

    .line 67
    .line 68
    invoke-static {v0, v3, v4}, Lj81;->μ(III)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    sget-object v3, Ljb0;->ι:Ljava/util/concurrent/ScheduledFuture;

    .line 73
    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    invoke-interface {v3}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_3

    .line 81
    .line 82
    sget v3, Ljb0;->θ:I

    .line 83
    .line 84
    if-ne v3, v0, :cond_3

    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    sget-object v3, Ljb0;->ι:Ljava/util/concurrent/ScheduledFuture;

    .line 88
    .line 89
    if-eqz v3, :cond_4

    .line 90
    .line 91
    invoke-interface {v3, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 92
    .line 93
    .line 94
    :cond_4
    sput-object v2, Ljb0;->ι:Ljava/util/concurrent/ScheduledFuture;

    .line 95
    .line 96
    sput v0, Ljb0;->θ:I

    .line 97
    .line 98
    new-instance v5, Lfb0;

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    invoke-direct {v5, v1}, Lfb0;-><init>(I)V

    .line 102
    .line 103
    .line 104
    int-to-long v6, v0

    .line 105
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 106
    .line 107
    sget-object v4, Ljb0;->ε:Ljava/util/concurrent/ScheduledExecutorService;

    .line 108
    .line 109
    move-wide v8, v6

    .line 110
    invoke-interface/range {v4 .. v10}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    sput-object v1, Ljb0;->ι:Ljava/util/concurrent/ScheduledFuture;

    .line 115
    .line 116
    const-string v1, "\u8f6e\u8be2\u81ea\u52a8\u5ba1\u6279\u5df2\u542f\u7528\uff0c\u95f4\u9694="

    .line 117
    .line 118
    const-string v3, "s"

    .line 119
    .line 120
    invoke-static {v1, v0, v3}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const/4 v1, 0x4

    .line 125
    const-string v3, "rb22c2f83ae9ef877"

    .line 126
    .line 127
    invoke-static {v3, v0, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method
