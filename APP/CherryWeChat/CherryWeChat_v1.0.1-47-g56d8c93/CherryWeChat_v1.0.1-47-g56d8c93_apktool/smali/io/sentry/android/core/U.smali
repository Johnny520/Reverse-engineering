.class public final Lio/sentry/android/core/U;
.super Ljava/util/TimerTask;
.source ""


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lio/sentry/android/core/U;->a:I

    iput-object p2, p0, Lio/sentry/android/core/U;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lio/sentry/android/core/U;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/core/U;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/transport/p;

    iget-object v1, v0, Lio/sentry/transport/p;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/transport/o;

    invoke-interface {v2, v0}, Lio/sentry/transport/o;->m(Lio/sentry/transport/p;)V

    goto :goto_0

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/U;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/V;

    iget-object v1, v0, Lio/sentry/android/core/V;->f:Lio/sentry/w1;

    iget-boolean v0, v0, Lio/sentry/android/core/V;->g:Z

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lio/sentry/w1;->i()V

    :cond_1
    invoke-virtual {v1}, Lio/sentry/w1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getReplayController()Lio/sentry/k1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/k1;->stop()V

    invoke-virtual {v1}, Lio/sentry/w1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getContinuousProfiler()Lio/sentry/P;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lio/sentry/P;->a(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
