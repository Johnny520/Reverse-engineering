.class public final synthetic Lio/sentry/android/core/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LFu;

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(LFu;Landroid/app/Activity;I)V
    .locals 0

    iput p3, p0, Lio/sentry/android/core/b;->a:I

    iput-object p1, p0, Lio/sentry/android/core/b;->b:LFu;

    iput-object p2, p0, Lio/sentry/android/core/b;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget v0, p0, Lio/sentry/android/core/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/core/b;->b:LFu;

    iget-object v0, v0, LFu;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/core/app/FrameMetricsAggregator;

    iget-object v0, v0, Landroidx/core/app/FrameMetricsAggregator;->a:LNi;

    iget-object v1, v0, LNi;->c:Ljava/io/Serializable;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v4, p0, Lio/sentry/android/core/b;->c:Landroid/app/Activity;

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    iget-object v0, v0, LNi;->d:Ljava/lang/Object;

    check-cast v0, LMi;

    invoke-virtual {v1, v0}, Landroid/view/Window;->removeOnFrameMetricsAvailableListener(Landroid/view/Window$OnFrameMetricsAvailableListener;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/b;->b:LFu;

    iget-object v0, v0, LFu;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/core/app/FrameMetricsAggregator;

    iget-object v0, v0, Landroidx/core/app/FrameMetricsAggregator;->a:LNi;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, LNi;->e:Landroid/os/HandlerThread;

    if-nez v1, :cond_2

    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "FrameMetricsAggregator"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    sput-object v1, LNi;->e:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    new-instance v1, Landroid/os/Handler;

    sget-object v2, LNi;->e:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, LNi;->f:Landroid/os/Handler;

    :cond_2
    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x8

    if-gt v1, v2, :cond_4

    iget-object v2, v0, LNi;->b:Ljava/lang/Object;

    check-cast v2, [Landroid/util/SparseIntArray;

    aget-object v3, v2, v1

    if-nez v3, :cond_3

    iget v3, v0, LNi;->a:I

    const/4 v4, 0x1

    shl-int/2addr v4, v1

    and-int/2addr v3, v4

    if-eqz v3, :cond_3

    new-instance v3, Landroid/util/SparseIntArray;

    invoke-direct {v3}, Landroid/util/SparseIntArray;-><init>()V

    aput-object v3, v2, v1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lio/sentry/android/core/b;->c:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    iget-object v3, v0, LNi;->d:Ljava/lang/Object;

    check-cast v3, LMi;

    sget-object v4, LNi;->f:Landroid/os/Handler;

    invoke-virtual {v2, v3, v4}, Landroid/view/Window;->addOnFrameMetricsAvailableListener(Landroid/view/Window$OnFrameMetricsAvailableListener;Landroid/os/Handler;)V

    iget-object v0, v0, LNi;->c:Ljava/io/Serializable;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
