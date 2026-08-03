.class public final Liq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LHv;Landroid/widget/Button;Landroid/os/Handler;Landroid/app/AlertDialog;Lf;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Liq;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Liq;->b:Ljava/lang/Object;

    iput-object p2, p0, Liq;->c:Ljava/lang/Object;

    iput-object p3, p0, Liq;->d:Ljava/lang/Object;

    iput-object p4, p0, Liq;->e:Ljava/lang/Object;

    iput-object p5, p0, Liq;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/v2;Lio/sentry/B0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Liq;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Liq;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Liq;->c:Ljava/lang/Object;

    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Liq;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget v0, p0, Liq;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liq;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/v2;

    iget-object v1, p0, Liq;->f:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v1

    iget-boolean v1, v1, Lio/sentry/z2;->l:Z

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v3, "Not capturing frames, recording is not running."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v1

    iget-boolean v1, v1, Lio/sentry/z2;->l:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v4, "Capturing a frame."

    new-array v5, v2, [Ljava/lang/Object;

    invoke-interface {v1, v3, v4, v5}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v1, p0, Liq;->d:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/replay/v;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/sentry/android/replay/v;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v5, "Failed to capture a frame"

    invoke-interface {v3, v4, v5, v1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_2
    invoke-virtual {v0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v1

    iget-boolean v1, v1, Lio/sentry/z2;->l:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Posting the capture runnable again, frame rate is "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, p0, Liq;->e:Ljava/lang/Object;

    check-cast v6, Lio/sentry/android/replay/w;

    if-eqz v6, :cond_3

    iget v6, v6, Lio/sentry/android/replay/w;->e:I

    goto :goto_3

    :cond_3
    move v6, v3

    :goto_3
    const-string v7, " fps."

    invoke-static {v5, v6, v7}, LEy;->g(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-array v6, v2, [Ljava/lang/Object;

    invoke-interface {v1, v4, v5, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    iget-object v1, p0, Liq;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/B0;

    iget-object v4, p0, Liq;->e:Ljava/lang/Object;

    check-cast v4, Lio/sentry/android/replay/w;

    if-eqz v4, :cond_5

    iget v3, v4, Lio/sentry/android/replay/w;->e:I

    :cond_5
    int-to-long v3, v3

    const-wide/16 v5, 0x3e8

    div-long/2addr v5, v3

    iget-object v1, v1, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    invoke-virtual {v1, p0, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v3, "Failed to post the capture runnable, main looper is shutting down."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_6
    :goto_4
    return-void

    :pswitch_0
    iget-object v0, p0, Liq;->c:Ljava/lang/Object;

    check-cast v0, Landroid/widget/Button;

    iget-object v1, p0, Liq;->b:Ljava/lang/Object;

    check-cast v1, LHv;

    iget v2, v1, LHv;->a:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, LHv;->a:I

    if-lez v2, :cond_7

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x2ef56fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v1, LHv;->a:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Liq;->d:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_5

    :cond_7
    const-wide v1, -0x2ef5bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v1, p0, Liq;->e:Ljava/lang/Object;

    check-cast v1, Landroid/app/AlertDialog;

    iget-object v2, p0, Liq;->f:Ljava/lang/Object;

    check-cast v2, Lf;

    new-instance v3, Ll5;

    const/16 v4, 0x12

    invoke-direct {v3, v4, v1, v2}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_5
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
