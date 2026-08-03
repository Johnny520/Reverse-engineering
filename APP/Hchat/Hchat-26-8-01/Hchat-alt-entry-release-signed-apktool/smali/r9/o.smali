.class public final synthetic Lr9/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic g:Landroid/view/ViewTreeObserver;

.field public final synthetic h:Lgg/u;

.field public final synthetic i:Ljava/util/WeakHashMap;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewTreeObserver;Lgg/u;Ljava/util/WeakHashMap;Lfg/a;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/o;->g:Landroid/view/ViewTreeObserver;

    .line 5
    .line 6
    iput-object p2, p0, Lr9/o;->h:Lgg/u;

    .line 7
    .line 8
    iput-object p3, p0, Lr9/o;->i:Ljava/util/WeakHashMap;

    .line 9
    .line 10
    iput-object p4, p0, Lr9/o;->j:Lfg/a;

    .line 11
    .line 12
    iput-object p5, p0, Lr9/o;->k:Landroid/view/View;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lr9/o;->g:Landroid/view/ViewTreeObserver;

    .line 2
    .line 3
    iget-object v1, p0, Lr9/o;->h:Lgg/u;

    .line 4
    .line 5
    iget-object v2, p0, Lr9/o;->i:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    iget-object v3, p0, Lr9/o;->j:Lfg/a;

    .line 8
    .line 9
    iget-object v4, p0, Lr9/o;->k:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    const/4 v6, 0x0

    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    iget-object v5, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    check-cast v5, Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 23
    .line 24
    invoke-virtual {v0, v5}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string v0, "listener"

    .line 29
    .line 30
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v6

    .line 34
    :cond_1
    :goto_0
    monitor-enter v2

    .line 35
    :try_start_0
    invoke-virtual {v2, v4}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lr9/a0;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, v0, Lr9/a0;->b:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move-object v0, v6

    .line 49
    :goto_1
    iget-object v1, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    check-cast v1, Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 54
    .line 55
    if-ne v0, v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {v2, v4}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    :cond_3
    monitor-exit v2

    .line 61
    invoke-interface {v3}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    return v0

    .line 66
    :cond_4
    :try_start_1
    const-string v0, "listener"

    .line 67
    .line 68
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    :goto_2
    monitor-exit v2

    .line 73
    throw v0
.end method
