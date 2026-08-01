.class public final Landroidx/activity/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayDeque;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/activity/i;->b:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/activity/i;->a:Ljava/lang/Runnable;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/s;Landroidx/fragment/app/u;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Landroidx/lifecycle/s;->c()Landroidx/lifecycle/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 6
    .line 7
    sget-object v1, Landroidx/lifecycle/n;->a:Landroidx/lifecycle/n;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1, p2}, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;-><init>(Landroidx/activity/i;Landroidx/lifecycle/u;Landroidx/fragment/app/u;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p2, Landroidx/fragment/app/u;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/activity/i;->b:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->descendingIterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/fragment/app/u;

    .line 18
    .line 19
    iget-boolean v2, v1, Landroidx/fragment/app/u;->a:Z

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget v0, v1, Landroidx/fragment/app/u;->c:I

    .line 24
    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    iget-object v0, v1, Landroidx/fragment/app/u;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lf0/b;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    iput-boolean v2, v1, Landroidx/fragment/app/u;->a:Z

    .line 37
    .line 38
    iget-object v0, v0, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/o;->d:Le/i;

    .line 45
    .line 46
    :goto_0
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Landroidx/activity/g;->onBackPressed()V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :pswitch_0
    iget-object v0, v1, Landroidx/fragment/app/u;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Landroidx/fragment/app/z;

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    invoke-virtual {v0, v1}, Landroidx/fragment/app/z;->v(Z)Z

    .line 58
    .line 59
    .line 60
    iget-object v1, v0, Landroidx/fragment/app/z;->h:Landroidx/fragment/app/u;

    .line 61
    .line 62
    iget-boolean v1, v1, Landroidx/fragment/app/u;->a:Z

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0}, Landroidx/fragment/app/z;->K()Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget-object v0, v0, Landroidx/fragment/app/z;->g:Landroidx/activity/i;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroidx/activity/i;->b()V

    .line 73
    .line 74
    .line 75
    :cond_3
    :goto_1
    return-void

    .line 76
    :cond_4
    iget-object v0, p0, Landroidx/activity/i;->a:Ljava/lang/Runnable;

    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 81
    .line 82
    .line 83
    :cond_5
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
