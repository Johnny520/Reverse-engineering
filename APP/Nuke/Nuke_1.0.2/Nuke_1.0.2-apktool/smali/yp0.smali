.class public final Lyp0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Runnable;I)V
    .locals 0

    .line 12
    iput p3, p0, Lyp0;->h:I

    iput-object p1, p0, Lyp0;->j:Ljava/lang/Object;

    iput-object p2, p0, Lyp0;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ls51;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyp0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyp0;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lyp0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lyp0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :cond_0
    :try_start_0
    iget-object v1, p0, Lyp0;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Runnable;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    :try_start_1
    sget-object v2, Lzd0;->h:Lzd0;

    .line 17
    .line 18
    invoke-static {v2, v1}, Lse;->M(La20;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object v1, p0, Lyp0;->j:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lsa1;

    .line 24
    .line 25
    invoke-virtual {v1}, Lsa1;->G()Ljava/lang/Runnable;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iput-object v1, p0, Lyp0;->i:Ljava/lang/Object;

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    const/16 v1, 0x10

    .line 37
    .line 38
    if-lt v0, v1, :cond_0

    .line 39
    .line 40
    iget-object v1, p0, Lyp0;->j:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lsa1;

    .line 43
    .line 44
    iget-object v2, v1, Lsa1;->k:Lc20;

    .line 45
    .line 46
    invoke-static {v2, v1}, Lp40;->S(Lc20;La20;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    iget-object v0, p0, Lyp0;->j:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lsa1;

    .line 55
    .line 56
    iget-object v1, v0, Lsa1;->k:Lc20;

    .line 57
    .line 58
    invoke-static {v1, v0, p0}, Lp40;->R(Lc20;La20;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    .line 61
    :goto_1
    return-void

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    iget-object p0, p0, Lyp0;->j:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Lsa1;

    .line 66
    .line 67
    iget-object v1, p0, Lsa1;->n:Ljava/lang/Object;

    .line 68
    .line 69
    monitor-enter v1

    .line 70
    :try_start_2
    sget-object v2, Lsa1;->o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 71
    .line 72
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 73
    .line 74
    .line 75
    monitor-exit v1

    .line 76
    throw v0

    .line 77
    :catchall_2
    move-exception p0

    .line 78
    monitor-exit v1

    .line 79
    throw p0

    .line 80
    :pswitch_0
    iget-object v0, p0, Lyp0;->i:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Ls51;

    .line 83
    .line 84
    invoke-static {v0}, Lgf1;->z(Lt00;)Lt00;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object p0, p0, Lyp0;->j:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p0, Ljava/lang/Throwable;

    .line 91
    .line 92
    invoke-static {p0}, Lfg1;->s(Ljava/lang/Throwable;)Lx92;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-interface {v0, p0}, Lt00;->h(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_1
    iget-object v0, p0, Lyp0;->j:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Lzp0;

    .line 103
    .line 104
    iget-boolean v1, v0, Lzp0;->d:Z

    .line 105
    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    new-instance v1, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 109
    .line 110
    invoke-direct {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyDeath()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-static {v1}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 126
    .line 127
    .line 128
    :cond_2
    :try_start_3
    iget-object p0, p0, Lyp0;->i:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p0, Ljava/lang/Runnable;

    .line 131
    .line 132
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :catchall_3
    move-exception p0

    .line 137
    iget-object v0, v0, Lzp0;->c:Lgd3;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    const-string v0, "GlideExecutor"

    .line 143
    .line 144
    const/4 v1, 0x6

    .line 145
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_3

    .line 150
    .line 151
    const-string v1, "Request threw uncaught throwable"

    .line 152
    .line 153
    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 154
    .line 155
    .line 156
    :cond_3
    :goto_2
    return-void

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
