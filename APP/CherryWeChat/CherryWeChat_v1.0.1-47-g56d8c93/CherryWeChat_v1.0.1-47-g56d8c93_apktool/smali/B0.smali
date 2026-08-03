.class public final LB0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LB0;->a:I

    iput-object p2, p0, LB0;->c:Ljava/lang/Object;

    iput-object p3, p0, LB0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LWl;LSl;I)V
    .locals 0

    const/4 p3, 0x4

    iput p3, p0, LB0;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0;->c:Ljava/lang/Object;

    iput-object p2, p0, LB0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 0

    const/4 p3, 0x7

    iput p3, p0, LB0;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0;->c:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LB0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, LB0;->a:I

    iput-object p1, p0, LB0;->b:Ljava/lang/Object;

    iput-object p2, p0, LB0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, LB0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LB0;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget-object v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:LmE;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LmE;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LB0;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, LB0;->b:Ljava/lang/Object;

    check-cast v0, LRh;

    iget-object v1, p0, LB0;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, LRh;->accept(Ljava/lang/Object;)V

    return-void

    :pswitch_1
    const/4 v0, 0x0

    :cond_1
    :try_start_0
    iget-object v1, p0, LB0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_1
    sget-object v2, LIf;->a:LIf;

    invoke-static {v2, v1}, LOj;->B(Lac;Ljava/lang/Throwable;)V

    :goto_0
    iget-object v1, p0, LB0;->c:Ljava/lang/Object;

    check-cast v1, Leo;

    invoke-virtual {v1}, Leo;->w()Ljava/lang/Runnable;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    iput-object v1, p0, LB0;->b:Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    iget-object v1, p0, LB0;->c:Ljava/lang/Object;

    check-cast v1, Leo;

    iget-object v2, v1, Leo;->c:Lbc;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2, v1}, Lbc;->u(Lac;)Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v1, :cond_1

    :try_start_3
    iget-object v0, p0, LB0;->c:Ljava/lang/Object;

    check-cast v0, Leo;

    iget-object v1, v0, Leo;->c:Lbc;

    invoke-static {v1, v0, p0}, LfG;->m0(Lbc;Lac;Ljava/lang/Runnable;)V

    :goto_1
    return-void

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    new-instance v3, Lde;

    invoke-direct {v3, v0, v2, v1}, Lde;-><init>(Ljava/lang/Throwable;Lbc;Lac;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    iget-object v1, p0, LB0;->c:Ljava/lang/Object;

    check-cast v1, Leo;

    iget-object v2, v1, Leo;->f:Ljava/lang/Object;

    monitor-enter v2

    :try_start_4
    sget-object v3, Leo;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    monitor-exit v2

    throw v0

    :catchall_3
    move-exception v0

    monitor-exit v2

    throw v0

    :pswitch_2
    iget-object v0, p0, LB0;->b:Ljava/lang/Object;

    check-cast v0, LSl;

    iget-object v1, p0, LB0;->c:Ljava/lang/Object;

    check-cast v1, LWl;

    iget-object v2, v1, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->isAttachedToWindow()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-boolean v2, v0, LSl;->k:Z

    if-nez v2, :cond_7

    iget-object v0, v0, LSl;->e:Landroidx/recyclerview/widget/o;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/o;->getAbsoluteAdapterPosition()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_7

    iget-object v0, v1, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/h;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/recyclerview/widget/h;->f()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    iget-object v0, v1, LWl;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v2, :cond_6

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LSl;

    iget-boolean v4, v4, LSl;->l:Z

    if-nez v4, :cond_5

    :cond_4
    iget-object v0, v1, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_4

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_6
    iget-object v0, v1, LWl;->m:LUl;

    invoke-virtual {v0}, LUl;->n()V

    :cond_7
    :goto_4
    return-void

    :pswitch_3
    iget-object v0, p0, LB0;->c:Ljava/lang/Object;

    check-cast v0, LVj;

    iget-boolean v1, v0, LVj;->d:Z

    if-eqz v1, :cond_8

    new-instance v1, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyDeath()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v1

    invoke-static {v1}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    :cond_8
    :try_start_5
    iget-object v1, p0, LB0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_5

    :catchall_4
    iget-object v0, v0, LVj;->c:Lgf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_5
    return-void

    :pswitch_4
    invoke-static {}, Lpk;->a()Lpk;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LvD;->a()V

    iget-object v0, v0, Lpk;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, LB0;->c:Ljava/lang/Object;

    check-cast v0, Lxh;

    iget-object v0, v0, Lxh;->b:Lyh;

    iput-boolean v1, v0, Lyh;->b:Z

    iget-object v0, p0, LB0;->c:Ljava/lang/Object;

    check-cast v0, Lxh;

    iget-object v0, v0, Lxh;->a:Landroid/view/View;

    iget-object v1, p0, LB0;->b:Ljava/lang/Object;

    check-cast v1, Lxh;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    iget-object v0, p0, LB0;->c:Ljava/lang/Object;

    check-cast v0, Lxh;

    iget-object v0, v0, Lxh;->b:Lyh;

    iget-object v0, v0, Lyh;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void

    :pswitch_5
    iget-object v0, p0, LB0;->b:Ljava/lang/Object;

    check-cast v0, LXm;

    iget-object v1, p0, LB0;->c:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Typeface;

    iget-object v0, v0, LXm;->b:Ljava/lang/Object;

    check-cast v0, LNj;

    if-eqz v0, :cond_9

    invoke-virtual {v0, v1}, LNj;->J(Landroid/graphics/Typeface;)V

    :cond_9
    return-void

    :pswitch_6
    iget-object v0, p0, LB0;->b:Ljava/lang/Object;

    check-cast v0, Lz0;

    iget-object v1, p0, LB0;->c:Ljava/lang/Object;

    check-cast v1, LD0;

    iget-object v2, v1, LD0;->c:Llr;

    if-eqz v2, :cond_a

    iget-object v3, v2, Llr;->e:Ljr;

    if-eqz v3, :cond_a

    invoke-interface {v3, v2}, Ljr;->n(Llr;)V

    :cond_a
    iget-object v2, v1, LD0;->h:LGr;

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Lxr;->b()Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_6

    :cond_b
    iget-object v2, v0, Lxr;->e:Landroid/view/View;

    if-nez v2, :cond_c

    goto :goto_7

    :cond_c
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v2, v2}, Lxr;->d(IIZZ)V

    :goto_6
    iput-object v0, v1, LD0;->s:Lz0;

    :cond_d
    :goto_7
    const/4 v0, 0x0

    iput-object v0, v1, LD0;->u:LB0;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
