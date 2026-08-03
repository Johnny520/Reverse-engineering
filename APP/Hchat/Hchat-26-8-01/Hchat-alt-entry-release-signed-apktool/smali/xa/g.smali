.class public final synthetic Lxa/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:Lxa/m;


# direct methods
.method public synthetic constructor <init>(Lxa/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxa/g;->a:Lxa/m;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lxa/g;->a:Lxa/m;

    .line 2
    .line 3
    iget-object v1, v0, Lxa/m;->i:Ljava/util/Map;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object v2, v0, Lxa/m;->i:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lxa/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit v1

    .line 18
    if-eqz v2, :cond_4

    .line 19
    .line 20
    invoke-virtual {v0}, Lxa/m;->b()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v3, 0x1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lxa/m;->h(Landroid/view/View;)Landroid/view/View$OnLongClickListener;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    invoke-interface {v0, p1}, Landroid/view/View$OnLongClickListener;->onLongClick(Landroid/view/View;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-ne p1, v3, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v1, v2, Lxa/h;->a:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Landroid/app/Activity;

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_1

    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    :cond_1
    const/4 v1, 0x0

    .line 66
    :cond_2
    if-eqz v1, :cond_4

    .line 67
    .line 68
    iget-object v4, v2, Lxa/h;->b:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v4}, Lxa/m;->f(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-nez v4, :cond_3

    .line 75
    .line 76
    iget-object v0, v2, Lxa/h;->c:Landroid/view/View$OnLongClickListener;

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    invoke-interface {v0, p1}, Landroid/view/View$OnLongClickListener;->onLongClick(Landroid/view/View;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-ne p1, v3, :cond_4

    .line 85
    .line 86
    :goto_0
    return v3

    .line 87
    :cond_3
    iget-object p1, v0, Lxa/m;->d:Landroid/os/Handler;

    .line 88
    .line 89
    new-instance v4, Lr8/b;

    .line 90
    .line 91
    const/16 v5, 0xc

    .line 92
    .line 93
    invoke-direct {v4, v0, v1, v2, v5}, Lr8/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 97
    .line 98
    .line 99
    return v3

    .line 100
    :cond_4
    const/4 p1, 0x0

    .line 101
    return p1

    .line 102
    :catchall_0
    move-exception p1

    .line 103
    monitor-exit v1

    .line 104
    throw p1
.end method
