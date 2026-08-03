.class public final Lio/sentry/android/core/ScreenshotEventProcessor;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/C;


# instance fields
.field public final a:Lio/sentry/android/core/SentryAndroidOptions;

.field public final b:Lio/sentry/android/core/I;

.field public final c:Lio/sentry/android/core/internal/util/f;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/I;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SentryAndroidOptions is required"

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->a:Lio/sentry/android/core/SentryAndroidOptions;

    iput-object p2, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->b:Lio/sentry/android/core/I;

    new-instance p2, Lio/sentry/android/core/internal/util/f;

    const-wide/16 v0, 0x7d0

    const/4 v2, 0x3

    invoke-direct {p2, v2, v0, v1}, Lio/sentry/android/core/internal/util/f;-><init>(IJ)V

    iput-object p2, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->c:Lio/sentry/android/core/internal/util/f;

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Screenshot"

    invoke-static {p1}, Lio/sentry/config/a;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final f(Lio/sentry/protocol/A;Lio/sentry/H;)Lio/sentry/protocol/A;
    .locals 0

    return-object p1
.end method

.method public final i(Lio/sentry/R1;Lio/sentry/H;)Lio/sentry/R1;
    .locals 13

    invoke-virtual {p1}, Lio/sentry/R1;->d()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->a:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v1, "attachScreenshot is disabled."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p2, v0, v1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1

    :cond_1
    sget-object v1, Lio/sentry/android/core/I;->b:Lio/sentry/android/core/I;

    iget-object v1, v1, Lio/sentry/android/core/I;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/ref/WeakReference;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    goto :goto_0

    :cond_2
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_e

    invoke-static {p2}, Lio/sentry/config/a;->w(Lio/sentry/H;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_7

    :cond_3
    iget-object v4, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->c:Lio/sentry/android/core/internal/util/f;

    invoke-virtual {v4}, Lio/sentry/android/core/internal/util/f;->a()Z

    move-result v4

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->getBeforeScreenshotCaptureCallback()Lio/sentry/android/core/d0;

    if-eqz v4, :cond_4

    goto/16 :goto_7

    :cond_4
    invoke-virtual {v0}, Lio/sentry/v2;->getThreadChecker()Lio/sentry/util/thread/a;

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    iget-object v4, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->b:Lio/sentry/android/core/I;

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v5

    if-nez v5, :cond_c

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v5

    if-nez v5, :cond_c

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v5

    if-nez v5, :cond_5

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "Activity window is null, not taking screenshot."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v4, v5, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_5
    invoke-virtual {v5}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v6

    if-nez v6, :cond_6

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "DecorView is null, not taking screenshot."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v4, v5, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_6
    invoke-virtual {v6}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v6

    if-nez v6, :cond_7

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "Root view is null, not taking screenshot."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v4, v5, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_7
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v7

    if-lez v7, :cond_b

    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    move-result v7

    if-gtz v7, :cond_8

    goto/16 :goto_5

    :cond_8
    :try_start_0
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v7

    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    move-result v6

    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v7, v6, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    new-instance v7, Ljava/util/concurrent/CountDownLatch;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Landroid/os/HandlerThread;

    const-string v9, "SentryScreenshot"

    invoke-direct {v4, v9}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v9, Landroid/os/Handler;

    invoke-virtual {v4}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v10

    invoke-direct {v9, v10}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v10, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v10, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v11, Lio/sentry/android/core/internal/util/j;

    const/4 v12, 0x0

    invoke-direct {v11, v12, v10, v7}, Lio/sentry/android/core/internal/util/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v6, v11, v9}, Landroid/view/PixelCopy;->request(Landroid/view/Window;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v11, 0x3e8

    invoke-virtual {v7, v11, v12, v5}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v5, :cond_9

    move v2, v8

    goto :goto_1

    :catchall_0
    move-exception v5

    goto :goto_2

    :cond_9
    :goto_1
    :try_start_2
    invoke-virtual {v4}, Landroid/os/HandlerThread;->quit()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v2

    goto :goto_4

    :goto_2
    :try_start_3
    sget-object v7, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v8, "Taking screenshot using PixelCopy failed."

    invoke-interface {v0, v7, v8, v5}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :goto_3
    if-nez v2, :cond_a

    goto :goto_6

    :cond_a
    move-object v3, v6

    goto :goto_6

    :catchall_2
    move-exception v2

    :try_start_4
    invoke-virtual {v4}, Landroid/os/HandlerThread;->quit()Z

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v5, "Taking screenshot failed."

    invoke-interface {v0, v4, v5, v2}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    :goto_5
    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "View\'s width and height is zeroed, not taking screenshot."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v4, v5, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_6

    :cond_c
    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "Activity isn\'t valid, not taking screenshot."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v4, v5, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_6
    if-nez v3, :cond_d

    goto :goto_7

    :cond_d
    new-instance v0, Lio/sentry/K1;

    const/4 v2, 0x5

    invoke-direct {v0, v2, p0, v3}, Lio/sentry/K1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lio/sentry/a;

    invoke-direct {v2, v0}, Lio/sentry/a;-><init>(Lio/sentry/K1;)V

    iput-object v2, p2, Lio/sentry/H;->d:Lio/sentry/a;

    const-string v0, "android:activity"

    invoke-virtual {p2, v0, v1}, Lio/sentry/H;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_e
    :goto_7
    return-object p1
.end method
