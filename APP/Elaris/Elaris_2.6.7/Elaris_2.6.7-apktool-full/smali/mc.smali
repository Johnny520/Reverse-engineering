.class public final Lmc;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:J

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:I


# direct methods
.method public constructor <init>(JLjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lmc;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Lmc;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p4, p0, Lmc;->c:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    sget-object v0, Loc;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-wide v1, p0, Lmc;->a:J

    .line 5
    .line 6
    sget-wide v3, Loc;->h:J

    .line 7
    .line 8
    cmp-long v1, v1, v3

    .line 9
    .line 10
    if-nez v1, :cond_5

    .line 11
    .line 12
    sget-object v1, Loc;->g:Lmc;

    .line 13
    .line 14
    if-eq v1, p0, :cond_0

    .line 15
    .line 16
    goto :goto_4

    .line 17
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 18
    :try_start_1
    iget-object v0, p0, Lmc;->b:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v1, p0, Lmc;->c:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v2, 0x5

    .line 23
    invoke-static {v2, v0}, Loc;->d(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v1}, Loc;->d(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    const-string v1, "reply-no-at"

    .line 32
    .line 33
    const-string v2, "delayed-scrub-stage"

    .line 34
    .line 35
    invoke-static {v1, v2, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    sget-object v1, Loc;->a:Ljava/lang/Object;

    .line 39
    .line 40
    monitor-enter v1

    .line 41
    :try_start_2
    iget-wide v2, p0, Lmc;->a:J

    .line 42
    .line 43
    sget-wide v4, Loc;->h:J

    .line 44
    .line 45
    cmp-long v0, v2, v4

    .line 46
    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    sget-object v0, Loc;->g:Lmc;

    .line 50
    .line 51
    if-eq v0, p0, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    iget v0, p0, Lmc;->d:I

    .line 55
    .line 56
    add-int/lit8 v2, v0, 0x1

    .line 57
    .line 58
    iput v2, p0, Lmc;->d:I

    .line 59
    .line 60
    sget-object v3, Loc;->b:[J

    .line 61
    .line 62
    const/4 v4, 0x3

    .line 63
    if-lt v2, v4, :cond_2

    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    sput-object p0, Loc;->g:Lmc;

    .line 67
    .line 68
    monitor-exit v1

    .line 69
    goto :goto_2

    .line 70
    :catchall_1
    move-exception p0

    .line 71
    goto :goto_3

    .line 72
    :cond_2
    aget-wide v4, v3, v2

    .line 73
    .line 74
    aget-wide v2, v3, v0

    .line 75
    .line 76
    sub-long/2addr v4, v2

    .line 77
    sget-object v0, Loc;->f:Landroid/os/Handler;

    .line 78
    .line 79
    if-nez v0, :cond_3

    .line 80
    .line 81
    new-instance v0, Landroid/os/Handler;

    .line 82
    .line 83
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Loc;->f:Landroid/os/Handler;

    .line 91
    .line 92
    :cond_3
    sget-object v0, Loc;->f:Landroid/os/Handler;

    .line 93
    .line 94
    invoke-virtual {v0, p0, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 95
    .line 96
    .line 97
    monitor-exit v1

    .line 98
    goto :goto_2

    .line 99
    :cond_4
    :goto_1
    monitor-exit v1

    .line 100
    :goto_2
    return-void

    .line 101
    :goto_3
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 102
    throw p0

    .line 103
    :catchall_2
    move-exception p0

    .line 104
    goto :goto_5

    .line 105
    :cond_5
    :goto_4
    :try_start_3
    monitor-exit v0

    .line 106
    return-void

    .line 107
    :goto_5
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 108
    throw p0
.end method
