.class public final Lo8/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Ljava/util/concurrent/ExecutorService;

.field public final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public final f:Landroid/content/Context;

.field public final g:Landroid/app/AlarmManager;

.field public final h:Ljava/util/concurrent/atomic/AtomicLong;

.field public final i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg1/d;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p2, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lo8/j;->a:Landroid/os/Handler;

    .line 14
    .line 15
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p2, p0, Lo8/j;->b:Ljava/util/concurrent/ExecutorService;

    .line 20
    .line 21
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lo8/j;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lo8/j;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, Lo8/j;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    if-eqz p2, :cond_0

    .line 47
    .line 48
    move-object p1, p2

    .line 49
    :cond_0
    iput-object p1, p0, Lo8/j;->f:Landroid/content/Context;

    .line 50
    .line 51
    const-class p2, Landroid/app/AlarmManager;

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, Landroid/app/AlarmManager;

    .line 58
    .line 59
    iput-object p2, p0, Lo8/j;->g:Landroid/app/AlarmManager;

    .line 60
    .line 61
    new-instance p2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 62
    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    invoke-direct {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 68
    .line 69
    .line 70
    iput-object p2, p0, Lo8/j;->h:Ljava/util/concurrent/atomic/AtomicLong;

    .line 71
    .line 72
    new-instance p2, Lnb/u;

    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    invoke-direct {p2, p0, v0}, Lnb/u;-><init>(Ljava/lang/Object;I)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Landroid/content/IntentFilter;

    .line 79
    .line 80
    const-string v1, "h.Hchat.action.EXACT_TASK"

    .line 81
    .line 82
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v1, "hchat-scheduled-task"

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 91
    .line 92
    const/16 v2, 0x21

    .line 93
    .line 94
    if-lt v1, v2, :cond_1

    .line 95
    .line 96
    const/4 v1, 0x4

    .line 97
    invoke-virtual {p1, p2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :catchall_0
    move-exception p1

    .line 102
    goto :goto_1

    .line 103
    :cond_1
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 104
    .line 105
    .line 106
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :goto_1
    new-instance p2, Lsf/f;

    .line 110
    .line 111
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    move-object p1, p2

    .line 115
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    if-nez p2, :cond_2

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    new-instance p2, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v0, "\u7cbe\u786e\u5b9a\u65f6\u5e7f\u64ad\u6ce8\u518c\u5931\u8d25: "

    .line 129
    .line 130
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p0, p1}, Lo8/j;->c(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 144
    .line 145
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    iput-boolean p1, p0, Lo8/j;->i:Z

    .line 152
    .line 153
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lo8/j;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-static {v0}, Lgg/x;->b(Ljava/lang/Object;)Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Runnable;

    .line 19
    .line 20
    iget-object v1, p0, Lo8/j;->a:Landroid/os/Handler;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lo8/j;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-static {v0}, Lgg/x;->b(Ljava/lang/Object;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lo8/i;

    .line 38
    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    iget-object v0, p1, Lo8/i;->c:Lca/r;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    :try_start_0
    iget-object v0, p0, Lo8/j;->g:Landroid/app/AlarmManager;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object p1, p1, Lo8/i;->b:Landroid/app/PendingIntent;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method public final b(JLjava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo8/j;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lo8/i;

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-wide v2, v1, Lo8/i;->a:J

    .line 12
    .line 13
    cmp-long p1, v2, p1

    .line 14
    .line 15
    if-nez p1, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0, p3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p1, p0, Lo8/j;->a:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object p2, v1, Lo8/i;->c:Lca/r;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    :try_start_0
    iget-object p1, p0, Lo8/j;->g:Landroid/app/AlarmManager;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object p2, v1, Lo8/i;->b:Landroid/app/PendingIntent;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :catchall_0
    :cond_1
    iget-object p1, v1, Lo8/i;->d:Ldb/d;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lo8/j;->g(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_0
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "[WeChatTaskApi] "

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final d(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    new-instance v0, Lo8/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lo8/h;-><init>(Lo8/j;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lo8/j;->b:Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final e(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lo8/j;->g(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Lo8/h;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p0, p1, v1}, Lo8/h;-><init>(Lo8/j;Ljava/lang/Runnable;I)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lo8/j;->a:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final f(Ljava/lang/String;JLjava/lang/Runnable;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-eqz v1, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move-object p1, v0

    .line 17
    :goto_1
    move-object v2, p1

    .line 18
    goto :goto_2

    .line 19
    :cond_2
    move-object v2, v0

    .line 20
    :goto_2
    new-instance v4, Lgg/u;

    .line 21
    .line 22
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lb9/c;

    .line 26
    .line 27
    const/16 v6, 0xd

    .line 28
    .line 29
    move-object v3, p0

    .line 30
    move-object v5, p4

    .line 31
    invoke-direct/range {v1 .. v6}, Lb9/c;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    iput-object v1, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 35
    .line 36
    const-string p1, "wrapped"

    .line 37
    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Lo8/j;->a(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p4, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 44
    .line 45
    if-eqz p4, :cond_3

    .line 46
    .line 47
    check-cast p4, Ljava/lang/Runnable;

    .line 48
    .line 49
    iget-object v1, v3, Lo8/j;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    invoke-virtual {v1, v2, p4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_3
    invoke-static {p1}, Lgg/l;->g(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :cond_4
    :goto_3
    iget-object p4, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 60
    .line 61
    if-eqz p4, :cond_6

    .line 62
    .line 63
    check-cast p4, Ljava/lang/Runnable;

    .line 64
    .line 65
    const-wide/16 v0, 0x0

    .line 66
    .line 67
    cmp-long p1, p2, v0

    .line 68
    .line 69
    if-gez p1, :cond_5

    .line 70
    .line 71
    move-wide p2, v0

    .line 72
    :cond_5
    iget-object p1, v3, Lo8/j;->a:Landroid/os/Handler;

    .line 73
    .line 74
    invoke-virtual {p1, p4, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_6
    invoke-static {p1}, Lgg/l;->g(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0
.end method

.method public final g(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "\u4efb\u52a1\u6267\u884c\u5931\u8d25: "

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Lo8/j;->c(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
