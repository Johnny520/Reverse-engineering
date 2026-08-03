.class public final synthetic Lrl;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/youth/banner/listener/OnBannerListener;
.implements LN6;
.implements LUz;
.implements Lio/sentry/I2;
.implements Lio/sentry/s1;
.implements Lio/sentry/util/c;
.implements Lio/sentry/n1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lrl;->a:I

    iput-object p2, p0, Lrl;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LQC;Landroid/app/Activity;)V
    .locals 0

    .line 2
    const/4 p2, 0x5

    iput p2, p0, Lrl;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrl;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/i0;)V
    .locals 0

    .line 3
    const/4 p1, 0x7

    iput p1, p0, Lrl;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lrl;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public OnBannerClick(Ljava/lang/Object;I)V
    .locals 3

    iget-object p2, p0, Lrl;->b:Ljava/lang/Object;

    check-cast p2, Ljq;

    check-cast p1, Ld1;

    const-wide v0, -0x2eb21fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-wide v1, -0x2ee51fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ld1;->c:Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/high16 p1, 0x10000000

    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x2ee6cfffff835L

    const/4 p2, 0x0

    invoke-static {v0, v1, p1, p2}, LEy;->k(JLandroid/content/Context;I)V

    return-void
.end method

.method public a()V
    .locals 6

    iget-object v0, p0, Lrl;->b:Ljava/lang/Object;

    check-cast v0, LQC;

    iget-object v1, v0, LQC;->k:LDC;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    const/4 v4, 0x1

    if-ne v1, v4, :cond_0

    sget-object v1, Lhe;->a:Lhd;

    sget-object v1, LZp;->a:Lnk;

    invoke-static {v1}, LPj;->a(Lac;)LCb;

    move-result-object v1

    new-instance v5, LOC;

    invoke-direct {v5, v0, v3, v4}, LOC;-><init>(LQC;LEb;I)V

    invoke-static {v1, v5, v2}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    return-void

    :cond_0
    new-instance v0, LFa;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_1
    sget-object v1, Lhe;->a:Lhd;

    sget-object v1, LZp;->a:Lnk;

    invoke-static {v1}, LPj;->a(Lac;)LCb;

    move-result-object v1

    new-instance v4, LMC;

    const/4 v5, 0x2

    invoke-direct {v4, v0, v3, v5}, LMC;-><init>(LQC;LEb;I)V

    invoke-static {v1, v4, v2}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    return-void
.end method

.method public b(Lio/sentry/X;)V
    .locals 5

    iget v0, p0, Lrl;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrl;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/capture/q;

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/e;->i()Lio/sentry/protocol/t;

    move-result-object v1

    invoke-interface {p1, v1}, Lio/sentry/X;->k(Lio/sentry/protocol/t;)V

    invoke-interface {p1}, Lio/sentry/X;->s()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/16 v1, 0x2e

    invoke-static {p1, v1}, Ltz;->c0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, v0, Lio/sentry/android/replay/capture/e;->l:Lio/sentry/android/replay/capture/c;

    sget-object v1, Lio/sentry/android/replay/capture/e;->q:[LPm;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    iget-object v1, v0, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v2, Lio/sentry/android/replay/capture/b;

    iget-object v3, v0, Lio/sentry/android/replay/capture/c;->c:Lio/sentry/android/replay/capture/e;

    const/4 v4, 0x3

    invoke-direct {v2, v1, p1, v3, v4}, Lio/sentry/android/replay/capture/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/e;I)V

    iget-object p1, v0, Lio/sentry/android/replay/capture/c;->b:Lio/sentry/android/replay/capture/e;

    iget-object v0, p1, Lio/sentry/android/replay/capture/e;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/util/thread/a;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p1, Lio/sentry/android/replay/capture/e;->e:LcA;

    invoke-virtual {p1}, LcA;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lio/sentry/H0;

    const/4 v3, 0x6

    invoke-direct {v1, v3, v2}, Lio/sentry/H0;-><init>(ILjava/lang/Object;)V

    const-string v2, "CaptureStrategy.runInBackground"

    invoke-static {p1, v0, v2, v1}, Lio/sentry/config/a;->H(Ljava/util/concurrent/ExecutorService;Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    :try_start_0
    invoke-virtual {v2}, Lio/sentry/android/replay/capture/b;->a()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Failed to execute task CaptureStrategy.runInBackground"

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    return-void

    :pswitch_0
    iget-object v0, p0, Lrl;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/capture/h;

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/e;->i()Lio/sentry/protocol/t;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/sentry/X;->k(Lio/sentry/protocol/t;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lrl;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/gestures/f;

    new-instance v1, LQ9;

    const/16 v2, 0xb

    invoke-direct {v1, v2, v0, p1}, LQ9;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Lio/sentry/X;->u(Lio/sentry/p1;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lrl;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-interface {p1}, Lio/sentry/X;->y()Lio/sentry/F2;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p1, Lio/sentry/F2;->a:Ljava/util/Date;

    if-nez p1, :cond_3

    const/4 p1, 0x0

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ljava/util/Date;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    :goto_2
    if-eqz p1, :cond_4

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_4
    return-void

    :pswitch_3
    iget-object v0, p0, Lrl;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/V;

    iget-object v0, v0, Lio/sentry/android/core/V;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_7

    invoke-interface {p1}, Lio/sentry/X;->y()Lio/sentry/F2;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p1, p1, Lio/sentry/F2;->a:Ljava/util/Date;

    const/4 v1, 0x0

    if-nez p1, :cond_5

    move-object v2, v1

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Ljava/util/Date;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Date;

    :goto_3
    if-eqz v2, :cond_7

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Ljava/util/Date;->clone()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/util/Date;

    :goto_4
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    :cond_7
    return-void

    :pswitch_4
    iget-object v0, p0, Lrl;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/i0;

    new-instance v1, LQ9;

    const/4 v2, 0x5

    invoke-direct {v1, v2, v0, p1}, LQ9;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Lio/sentry/X;->u(Lio/sentry/p1;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lrl;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrl;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    iget-object v1, v0, Lio/sentry/cache/f;->a:Lio/sentry/v2;

    const-string v2, ".scope-cache"

    invoke-static {v1, v2}, Lio/sentry/cache/a;->b(Lio/sentry/v2;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Cache dir is not set, cannot store in scope cache"

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lio/sentry/cache/tape/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_1

    :cond_0
    new-instance v3, Ljava/io/File;

    const-string v4, "breadcrumbs.json"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v1}, Lio/sentry/v2;->getMaxBreadcrumbs()I

    move-result v2

    invoke-static {v3}, Lio/sentry/cache/tape/h;->q(Ljava/io/File;)Ljava/io/RandomAccessFile;

    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v5, Lio/sentry/cache/tape/h;

    invoke-direct {v5, v3, v4, v2}, Lio/sentry/cache/tape/h;-><init>(Ljava/io/File;Ljava/io/RandomAccessFile;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    :try_start_2
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    throw v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :try_start_3
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    invoke-virtual {v1}, Lio/sentry/v2;->getMaxBreadcrumbs()I

    move-result v2

    invoke-static {v3}, Lio/sentry/cache/tape/h;->q(Ljava/io/File;)Ljava/io/RandomAccessFile;

    move-result-object v4
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    new-instance v5, Lio/sentry/cache/tape/h;

    invoke-direct {v5, v3, v4, v2}, Lio/sentry/cache/tape/h;-><init>(Ljava/io/File;Ljava/io/RandomAccessFile;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_0
    new-instance v1, Lio/sentry/B0;

    invoke-direct {v1, v0}, Lio/sentry/B0;-><init>(Ljava/lang/Object;)V

    new-instance v0, Lio/sentry/cache/tape/d;

    invoke-direct {v0, v5, v1}, Lio/sentry/cache/tape/d;-><init>(Lio/sentry/cache/tape/h;Lio/sentry/B0;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    move-exception v0

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "Failed to create breadcrumbs queue"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Lio/sentry/cache/tape/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_1
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lrl;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/c;

    iget-object v0, v0, Lio/sentry/cache/c;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lio/sentry/G2;)V
    .locals 3

    iget-object v0, p0, Lrl;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/D2;

    iget-object v1, v0, Lio/sentry/D2;->q:Lio/sentry/m;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lio/sentry/m;->d(Lio/sentry/G2;)V

    :cond_0
    iget-object p1, v0, Lio/sentry/D2;->f:Lio/sentry/C2;

    iget-object v1, v0, Lio/sentry/D2;->r:Lio/sentry/Q2;

    iget-object v2, v1, Lio/sentry/Q2;->g:Ljava/lang/Long;

    if-eqz v2, :cond_3

    iget-boolean p1, v1, Lio/sentry/Q2;->f:Z

    if-eqz p1, :cond_2

    iget-object p1, v0, Lio/sentry/D2;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->listIterator()Ljava/util/ListIterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/G2;

    iget-boolean v2, v1, Lio/sentry/G2;->f:Z

    if-nez v2, :cond_1

    iget-object v1, v1, Lio/sentry/G2;->b:Lio/sentry/H1;

    if-nez v1, :cond_1

    return-void

    :cond_2
    invoke-virtual {v0}, Lio/sentry/D2;->k()V

    return-void

    :cond_3
    iget-boolean v1, p1, Lio/sentry/C2;->a:Z

    if-eqz v1, :cond_4

    iget-object p1, p1, Lio/sentry/C2;->b:Lio/sentry/L2;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lio/sentry/D2;->q(Lio/sentry/L2;Lio/sentry/H1;)V

    :cond_4
    return-void
.end method

.method public e(Lio/sentry/l;)V
    .locals 1

    iget-object p1, p0, Lrl;->b:Ljava/lang/Object;

    check-cast p1, Lio/sentry/X;

    new-instance v0, Lio/sentry/l;

    invoke-direct {v0}, Lio/sentry/l;-><init>()V

    invoke-interface {p1, v0}, Lio/sentry/X;->B(Lio/sentry/l;)V

    return-void
.end method

.method public onCancel()V
    .locals 1

    iget-object v0, p0, Lrl;->b:Ljava/lang/Object;

    check-cast v0, LMy;

    invoke-virtual {v0}, LMy;->a()V

    return-void
.end method
