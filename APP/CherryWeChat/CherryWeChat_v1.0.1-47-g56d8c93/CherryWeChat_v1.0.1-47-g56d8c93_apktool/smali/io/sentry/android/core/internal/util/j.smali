.class public final synthetic Lio/sentry/android/core/internal/util/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lio/sentry/android/core/internal/util/j;->a:I

    iput-object p2, p0, Lio/sentry/android/core/internal/util/j;->b:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/core/internal/util/j;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 6

    iget v0, p0, Lio/sentry/android/core/internal/util/j;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/core/internal/util/j;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/v;

    iget-object v1, v0, Lio/sentry/android/replay/v;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, v0, Lio/sentry/android/replay/v;->b:Lio/sentry/v2;

    iget-object v3, p0, Lio/sentry/android/core/internal/util/j;->c:Ljava/lang/Object;

    check-cast v3, Landroid/view/View;

    const/4 v4, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v3, "Failed to capture replay recording: %d"

    invoke-interface {v0, v2, v3, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, v0, Lio/sentry/android/replay/v;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v2, "Failed to determine view hierarchy, not capturing"

    new-array v3, v4, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    invoke-static {v3, p1, v2}, Lio/sentry/config/a;->j(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/f;Lio/sentry/v2;)Lio/sentry/android/replay/viewhierarchy/f;

    move-result-object p1

    invoke-static {v3, p1, v2}, Lio/sentry/config/a;->I(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/f;Lio/sentry/v2;)V

    iget-object v1, v0, Lio/sentry/android/replay/v;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v4, Ln3;

    const/16 v5, 0x1c

    invoke-direct {v4, v0, p1, v3, v5}, Ln3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string p1, "screenshot_recorder.mask"

    invoke-static {v1, v2, p1, v4}, Lio/sentry/config/a;->H(Ljava/util/concurrent/ExecutorService;Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/internal/util/j;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v1, p0, Lio/sentry/android/core/internal/util/j;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    if-nez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
