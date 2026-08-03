.class public final Lf1/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf1/e;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lf1/e;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 4

    .line 1
    iget v0, p0, Lf1/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lf1/e;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lu9/h;

    .line 13
    .line 14
    iget-object v0, v0, Lu9/h;->i:Ljava/util/Map;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lf1/e;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lu9/h;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    iget-object v1, v1, Lu9/h;->i:Ljava/util/Map;

    .line 25
    .line 26
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lu9/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    monitor-exit v0

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iput-object v0, v1, Lu9/a;->a:Landroid/view/View;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    iget-object v2, v1, Lu9/a;->b:Lu9/e;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    iget-object v0, p0, Lf1/e;->h:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lu9/h;

    .line 62
    .line 63
    iget-object v0, v0, Lu9/h;->e:Landroid/content/SharedPreferences;

    .line 64
    .line 65
    const-string v2, "hide_wechat_bottom_bar_enable"

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    iget-object v0, p0, Lf1/e;->h:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lu9/h;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Lu9/h;->e(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lf1/e;->h:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, Lu9/h;

    .line 84
    .line 85
    iget-object v0, v1, Lu9/a;->a:Landroid/view/View;

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Lu9/h;->b(Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    return-void

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    monitor-exit v0

    .line 93
    throw p1

    .line 94
    :pswitch_1
    iget-object v0, p0, Lf1/e;->h:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lf1/f;

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iget-boolean v1, v0, Lf1/f;->d:Z

    .line 103
    .line 104
    if-nez v1, :cond_2

    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object v1, v0, Lf1/f;->f:Lf1/d;

    .line 111
    .line 112
    invoke-virtual {p1, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 113
    .line 114
    .line 115
    const/4 p1, 0x1

    .line 116
    iput-boolean p1, v0, Lf1/f;->d:Z

    .line 117
    .line 118
    :cond_2
    return-void

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lf1/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lf1/e;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lqg/e1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Lqg/y0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lf1/e;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lu9/h;

    .line 24
    .line 25
    iget-object v0, v0, Lu9/h;->i:Ljava/util/Map;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lf1/e;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lu9/h;

    .line 33
    .line 34
    monitor-enter v0

    .line 35
    :try_start_0
    iget-object v1, v1, Lu9/h;->i:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lu9/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    monitor-exit v0

    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    iget-object v0, p1, Lu9/a;->a:Landroid/view/View;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    iget-object p1, p1, Lu9/a;->b:Lu9/e;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    monitor-exit v0

    .line 66
    throw p1

    .line 67
    :pswitch_1
    iget-object v0, p0, Lf1/e;->h:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lf1/f;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-boolean v1, v0, Lf1/f;->d:Z

    .line 76
    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object v1, v0, Lf1/f;->f:Lf1/d;

    .line 84
    .line 85
    invoke-virtual {p1, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 86
    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    iput-boolean p1, v0, Lf1/f;->d:Z

    .line 90
    .line 91
    :cond_1
    iget-object p1, v0, Lf1/f;->e:Lb/e;

    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    monitor-enter p1

    .line 97
    :try_start_1
    iget-object v2, p1, Lb/e;->h:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, Lf/k0;

    .line 100
    .line 101
    if-eqz v2, :cond_2

    .line 102
    .line 103
    invoke-virtual {v2}, Lf/k0;->a()V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catchall_1
    move-exception v0

    .line 108
    goto :goto_1

    .line 109
    :cond_2
    :goto_0
    iput-object v1, p1, Lb/e;->i:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 110
    .line 111
    monitor-exit p1

    .line 112
    goto :goto_2

    .line 113
    :goto_1
    monitor-exit p1

    .line 114
    throw v0

    .line 115
    :cond_3
    :goto_2
    iput-object v1, v0, Lf1/f;->e:Lb/e;

    .line 116
    .line 117
    return-void

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
