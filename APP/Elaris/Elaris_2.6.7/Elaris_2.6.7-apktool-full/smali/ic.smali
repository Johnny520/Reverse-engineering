.class public final Lic;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;

.field public final b:Ljava/lang/String;

.field public final c:Ln0;

.field public final d:Ljc;

.field public final e:Lhc;

.field public volatile f:Z

.field public g:Lq;


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/String;Ln0;Ljc;Lhc;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lic;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    iput-object p2, p0, Lic;->b:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Lic;->c:Ln0;

    .line 14
    .line 15
    iput-object p4, p0, Lic;->d:Ljc;

    .line 16
    .line 17
    iput-object p5, p0, Lic;->e:Lhc;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lic;->f:Z

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
    iput-boolean v0, p0, Lic;->f:Z

    .line 8
    .line 9
    iget-object v1, p0, Lic;->c:Ln0;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    iput-boolean v0, v1, Ln0;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v1

    .line 15
    iget-object v0, p0, Lic;->g:Lq;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, p0, Lic;->g:Lq;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lkc;->a()Landroid/os/Handler;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0, p1}, Lic;->b(Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p0
.end method

.method public final b(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lic;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
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
    const-string v2, "repeater"

    .line 17
    .line 18
    const-string v3, "token-detach-listener"

    .line 19
    .line 20
    invoke-static {v2, v3, v1}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    if-eqz p1, :cond_1

    .line 24
    .line 25
    sget-object p1, Lkc;->a:Ljava/util/WeakHashMap;

    .line 26
    .line 27
    monitor-enter p1

    .line 28
    :try_start_1
    invoke-virtual {p1, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/util/Map;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    iget-object v2, p0, Lic;->b:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-ne v2, p0, :cond_0

    .line 43
    .line 44
    iget-object p0, p0, Lic;->b:Ljava/lang/String;

    .line 45
    .line 46
    invoke-interface {v1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_1
    move-exception p0

    .line 60
    goto :goto_2

    .line 61
    :cond_0
    :goto_1
    monitor-exit p1

    .line 62
    goto :goto_3

    .line 63
    :goto_2
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    throw p0

    .line 65
    :cond_1
    :goto_3
    return-void
.end method

.method public final c()V
    .locals 8

    .line 1
    iget-object v0, p0, Lic;->c:Ln0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, v0, Ln0;->b:Z

    .line 5
    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    iget v1, v0, Ln0;->a:I

    .line 9
    .line 10
    iget-object v2, v0, Ln0;->c:Ljava/io/Serializable;

    .line 11
    .line 12
    check-cast v2, [J

    .line 13
    .line 14
    array-length v3, v2

    .line 15
    if-lt v1, v3, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    add-int/lit8 v3, v1, 0x1

    .line 19
    .line 20
    iput v3, v0, Ln0;->a:I

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    add-int/lit8 v3, v1, -0x1

    .line 28
    .line 29
    aget-wide v3, v2, v3

    .line 30
    .line 31
    :goto_0
    new-instance v5, Lb0;

    .line 32
    .line 33
    aget-wide v6, v2, v1

    .line 34
    .line 35
    sub-long/2addr v6, v3

    .line 36
    invoke-direct {v5, v1, v6, v7}, Lb0;-><init>(IJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit v0

    .line 40
    goto :goto_2

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_3

    .line 43
    :cond_2
    :goto_1
    monitor-exit v0

    .line 44
    const/4 v5, 0x0

    .line 45
    :goto_2
    const/4 v0, 0x1

    .line 46
    if-nez v5, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lic;->b(Z)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    new-instance v1, Lq;

    .line 53
    .line 54
    const/16 v2, 0x8

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {v1, p0, v5, v2, v3}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 58
    .line 59
    .line 60
    iput-object v1, p0, Lic;->g:Lq;

    .line 61
    .line 62
    :try_start_1
    invoke-static {}, Lkc;->a()Landroid/os/Handler;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v2, p0, Lic;->g:Lq;

    .line 67
    .line 68
    iget-wide v3, v5, Lb0;->b:J

    .line 69
    .line 70
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :catchall_1
    move-exception v1

    .line 75
    const-string v2, "repeater"

    .line 76
    .line 77
    new-instance v3, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    iget-object v4, p0, Lic;->b:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v4, "-schedule"

    .line 88
    .line 89
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v2, v3, v1}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0}, Lic;->a(Z)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :goto_3
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 104
    throw p0
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lic;->a(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
