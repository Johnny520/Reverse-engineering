.class public final synthetic Lr8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Landroid/app/AlertDialog;Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x7

    iput v0, p0, Lr8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr8;->d:Ljava/lang/Object;

    iput-object p2, p0, Lr8;->b:Ljava/lang/Object;

    iput-object p3, p0, Lr8;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/String;Lfj;)V
    .locals 1

    .line 2
    const/4 v0, 0x5

    iput v0, p0, Lr8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr8;->c:Ljava/lang/Object;

    iput-object p2, p0, Lr8;->b:Ljava/lang/Object;

    iput-object p3, p0, Lr8;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Lr8;->a:I

    iput-object p1, p0, Lr8;->c:Ljava/lang/Object;

    iput-object p2, p0, Lr8;->d:Ljava/lang/Object;

    iput-object p3, p0, Lr8;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LIv;Ljava/util/concurrent/CountDownLatch;)V
    .locals 1

    .line 4
    const/4 v0, 0x1

    iput v0, p0, Lr8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr8;->b:Ljava/lang/Object;

    iput-object p2, p0, Lr8;->c:Ljava/lang/Object;

    iput-object p3, p0, Lr8;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget v0, p0, Lr8;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, ".scope-cache"

    iget-object v1, p0, Lr8;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/cache/f;

    iget-object v1, v1, Lio/sentry/cache/f;->a:Lio/sentry/v2;

    iget-object v2, p0, Lr8;->d:Ljava/lang/Object;

    check-cast v2, Lio/sentry/H2;

    iget-object v3, p0, Lr8;->b:Ljava/lang/Object;

    check-cast v3, Lio/sentry/q1;

    const-string v4, "trace.json"

    if-nez v2, :cond_0

    iget-object v2, v3, Lio/sentry/q1;->r:Lio/sentry/l;

    new-instance v3, Lio/sentry/H2;

    iget-object v5, v2, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v5, Lio/sentry/protocol/t;

    iget-object v2, v2, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v2, Lio/sentry/K2;

    const-string v6, "default"

    const/4 v7, 0x0

    invoke-direct {v3, v5, v2, v6, v7}, Lio/sentry/H2;-><init>(Lio/sentry/protocol/t;Lio/sentry/K2;Ljava/lang/String;Lio/sentry/K2;)V

    const-string v2, "auto"

    iput-object v2, v3, Lio/sentry/H2;->i:Ljava/lang/String;

    invoke-static {v1, v3, v0, v4}, Lio/sentry/cache/a;->d(Lio/sentry/v2;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {v1, v2, v0, v4}, Lio/sentry/cache/a;->d(Lio/sentry/v2;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lr8;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    iget-object v1, p0, Lr8;->d:Ljava/lang/Object;

    check-cast v1, Lio/sentry/v2;

    iget-object v2, p0, Lr8;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    :try_start_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to execute task "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v2, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    :pswitch_1
    iget-object v0, p0, Lr8;->d:Ljava/lang/Object;

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lr8;->b:Ljava/lang/Object;

    check-cast v1, Landroid/app/AlertDialog;

    iget-object v2, p0, Lr8;->c:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    const-wide v3, -0x20f60fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, -0x1

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    if-eqz v0, :cond_1

    const-wide v3, -0x20f6bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v3, Ll5;

    const/16 v4, 0x18

    invoke-direct {v3, v4, v1, v2}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void

    :pswitch_2
    iget-object v0, p0, Lr8;->c:Ljava/lang/Object;

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lr8;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v2, p0, Lr8;->b:Ljava/lang/Object;

    check-cast v2, Landroid/app/AlertDialog;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x20f57fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    if-eqz v0, :cond_2

    const-wide v3, -0x20f5dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v1, Lh;

    const/16 v3, 0xc

    invoke-direct {v1, v3, v2}, Lh;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void

    :pswitch_3
    iget-object v0, p0, Lr8;->c:Ljava/lang/Object;

    check-cast v0, Lio/github/cherrywechat/lua/loader/LoadedScript;

    iget-object v1, p0, Lr8;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lr8;->d:Ljava/lang/Object;

    check-cast v2, Lfj;

    invoke-static {v0, v1, v2}, Lio/github/cherrywechat/lua/loader/ScriptManager;->b(Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/String;Lfj;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lr8;->c:Ljava/lang/Object;

    check-cast v0, Lio/github/cherrywechat/lua/loader/LoadedScript;

    iget-object v1, p0, Lr8;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Exception;

    iget-object v2, p0, Lr8;->b:Ljava/lang/Object;

    check-cast v2, Lfj;

    invoke-static {v0, v1, v2}, Lio/github/cherrywechat/lua/loader/ScriptManager;->c(Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/Exception;Lfj;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lr8;->c:Ljava/lang/Object;

    check-cast v0, LSd;

    iget-object v1, p0, Lr8;->d:Ljava/lang/Object;

    check-cast v1, Lcr;

    iget-object v2, p0, Lr8;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    :try_start_1
    iget-object v0, v0, LSd;->b:Landroid/content/Context;

    invoke-static {v0}, LQj;->l(Landroid/content/Context;)LPh;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v3, v0, LPh;->a:Lof;

    check-cast v3, LOh;

    iget-object v4, v3, LOh;->d:Ljava/lang/Object;

    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iput-object v2, v3, LOh;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-object v0, v0, LPh;->a:Lof;

    new-instance v3, Lrf;

    invoke-direct {v3, v1, v2}, Lrf;-><init>(Lcr;Ljava/util/concurrent/ThreadPoolExecutor;)V

    invoke-interface {v0, v3}, Lof;->a(Lcr;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    throw v0

    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v3, "EmojiCompat font provider not available on this device."

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_2
    invoke-virtual {v1, v0}, Lcr;->H(Ljava/lang/Throwable;)V

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :goto_3
    return-void

    :pswitch_6
    iget-object v0, p0, Lr8;->c:Ljava/lang/Object;

    check-cast v0, Lnd;

    iget-object v1, p0, Lr8;->d:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    iget-object v2, p0, Lr8;->b:Ljava/lang/Object;

    check-cast v2, Ljd;

    iget-object v0, v0, Lnd;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    invoke-virtual {v2}, LB3;->d()V

    return-void

    :pswitch_7
    iget-object v0, p0, Lr8;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lr8;->c:Ljava/lang/Object;

    check-cast v1, LIv;

    iget-object v2, p0, Lr8;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->d(Ljava/lang/String;LIv;Ljava/util/concurrent/CountDownLatch;)V

    return-void

    :pswitch_8
    iget-object v0, p0, Lr8;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lr8;->d:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    iget-object v2, p0, Lr8;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->f(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
