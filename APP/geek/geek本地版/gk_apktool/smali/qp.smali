.class public final Lqp;
.super Landroid/os/AsyncTask;


# instance fields
.field public final synthetic a:Landroidx/core/app/JobIntentService;


# direct methods
.method public constructor <init>(Landroidx/core/app/JobIntentService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqp;->a:Landroidx/core/app/JobIntentService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    :goto_0
    iget-object p1, p0, Lqp;->a:Landroidx/core/app/JobIntentService;

    .line 4
    .line 5
    iget-object v0, p1, Landroidx/core/app/JobIntentService;->a:Lrp;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Landroidx/core/app/JobIntentService;->a:Lrp;

    .line 11
    .line 12
    iget-object v0, p1, Lrp;->b:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    iget-object v1, p1, Lrp;->c:Landroid/app/job/JobParameters;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    :cond_0
    move-object v0, v2

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_4

    .line 25
    :cond_1
    invoke-virtual {v1}, Landroid/app/job/JobParameters;->dequeueWork()Landroid/app/job/JobWorkItem;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/app/job/JobWorkItem;->getIntent()Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v3, p1, Lrp;->a:Landroidx/core/app/JobIntentService;

    .line 37
    .line 38
    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Ld4;

    .line 46
    .line 47
    const/16 v3, 0xe

    .line 48
    .line 49
    invoke-direct {v0, p1, v3, v1}, Ld4;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iget-object p1, p0, Lqp;->a:Landroidx/core/app/JobIntentService;

    .line 55
    .line 56
    iget-object v1, v0, Ld4;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Landroid/app/job/JobWorkItem;

    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/app/job/JobWorkItem;->getIntent()Landroid/content/Intent;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroidx/core/app/JobIntentService;->a()V

    .line 64
    .line 65
    .line 66
    iget-object p1, v0, Ld4;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Lrp;

    .line 69
    .line 70
    iget-object p1, p1, Lrp;->b:Ljava/lang/Object;

    .line 71
    .line 72
    monitor-enter p1

    .line 73
    :try_start_1
    iget-object v1, v0, Ld4;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Lrp;

    .line 76
    .line 77
    iget-object v1, v1, Lrp;->c:Landroid/app/job/JobParameters;

    .line 78
    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    iget-object v0, v0, Ld4;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Landroid/app/job/JobWorkItem;

    .line 84
    .line 85
    invoke-virtual {v1, v0}, Landroid/app/job/JobParameters;->completeWork(Landroid/app/job/JobWorkItem;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :catchall_1
    move-exception v0

    .line 90
    goto :goto_3

    .line 91
    :cond_2
    :goto_2
    monitor-exit p1

    .line 92
    goto :goto_0

    .line 93
    :goto_3
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 94
    throw v0

    .line 95
    :cond_3
    return-object v2

    .line 96
    :goto_4
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    throw p1
.end method

.method public final onCancelled(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object p1, p0, Lqp;->a:Landroidx/core/app/JobIntentService;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object p1, p0, Lqp;->a:Landroidx/core/app/JobIntentService;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-void
.end method
