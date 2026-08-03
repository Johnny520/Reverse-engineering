.class public final synthetic Ln3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ln3;->a:I

    iput-object p2, p0, Ln3;->b:Ljava/lang/Object;

    iput-object p3, p0, Ln3;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/g0;Lio/sentry/g0;)V
    .locals 0

    .line 2
    const/16 p1, 0x16

    iput p1, p0, Ln3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ln3;->b:Ljava/lang/Object;

    iput-object p3, p0, Ln3;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Ln3;->a:I

    iput-object p1, p0, Ln3;->b:Ljava/lang/Object;

    iput-object p2, p0, Ln3;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    iget v0, p0, Ln3;->a:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    iget-object v5, p0, Ln3;->c:Ljava/lang/Object;

    iget-object v6, p0, Ln3;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v6, Ljava/io/File;

    check-cast v5, Lio/sentry/android/replay/capture/h;

    invoke-static {v6}, Lio/sentry/config/a;->f(Ljava/io/File;)Z

    invoke-virtual {v5, v1}, Lio/sentry/android/replay/capture/e;->l(I)V

    return-void

    :pswitch_0
    check-cast v6, Lio/sentry/android/replay/v;

    check-cast v5, Lio/sentry/android/replay/viewhierarchy/f;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroid/graphics/Canvas;

    iget-object v2, v6, Lio/sentry/android/replay/v;->i:Landroid/graphics/Bitmap;

    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget-object v7, v6, Lio/sentry/android/replay/v;->k:Ljava/lang/Object;

    invoke-interface {v7}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/graphics/Matrix;

    invoke-virtual {v1, v7}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    new-instance v7, Lio/sentry/android/replay/t;

    invoke-direct {v7, v6, v0, v1}, Lio/sentry/android/replay/t;-><init>(Lio/sentry/android/replay/v;Ljava/util/ArrayList;Landroid/graphics/Canvas;)V

    invoke-virtual {v5, v7}, Lio/sentry/android/replay/viewhierarchy/f;->a(Lio/sentry/android/replay/t;)V

    iget-object v0, v6, Lio/sentry/android/replay/v;->b:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getReplayController()Lio/sentry/k1;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v6, Lio/sentry/android/replay/v;->e:Lio/sentry/android/replay/ReplayIntegration;

    invoke-virtual {v0, v2}, Lio/sentry/android/replay/ReplayIntegration;->s(Landroid/graphics/Bitmap;)V

    iget-object v0, v6, Lio/sentry/android/replay/v;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, v6, Lio/sentry/android/replay/v;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :pswitch_1
    check-cast v6, Lio/sentry/android/ndk/b;

    check-cast v5, Lio/sentry/H2;

    iget-object v0, v6, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    iget-object v1, v5, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    invoke-virtual {v1}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v5, Lio/sentry/H2;->b:Lio/sentry/K2;

    invoke-virtual {v2}, Lio/sentry/K2;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Lio/sentry/ndk/NativeScope;->nativeSetTrace(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_2
    check-cast v6, Lio/sentry/android/ndk/b;

    check-cast v5, Lio/sentry/f;

    iget-object v1, v6, Lio/sentry/android/ndk/b;->a:Lio/sentry/v2;

    iget-object v0, v5, Lio/sentry/f;->i:Lio/sentry/a2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :cond_0
    move-object v7, v2

    :goto_0
    invoke-virtual {v5}, Lio/sentry/f;->a()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/config/a;->t(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v11

    :try_start_0
    iget-object v0, v5, Lio/sentry/f;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v3

    invoke-interface {v3, v0}, Lio/sentry/e0;->b(Ljava/util/concurrent/ConcurrentHashMap;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    move-object v12, v2

    goto :goto_3

    :goto_2
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v8, "Breadcrumb data is not serializable."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v1, v3, v0, v8, v4}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :goto_3
    iget-object v0, v6, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    iget-object v8, v5, Lio/sentry/f;->d:Ljava/lang/String;

    iget-object v9, v5, Lio/sentry/f;->g:Ljava/lang/String;

    iget-object v10, v5, Lio/sentry/f;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {v7 .. v12}, Lio/sentry/ndk/NativeScope;->nativeAddBreadcrumb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_3
    check-cast v6, Lio/sentry/android/core/internal/util/o;

    check-cast v5, Lio/sentry/ILogger;

    :try_start_1
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    iput-object v0, v6, Lio/sentry/android/core/internal/util/o;->j:Landroid/view/Choreographer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported."

    invoke-interface {v5, v1, v2, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    return-void

    :pswitch_4
    check-cast v6, Lio/sentry/android/core/E;

    check-cast v5, Lio/sentry/ILogger;

    invoke-virtual {v6, v5}, Lio/sentry/android/core/E;->f(Lio/sentry/ILogger;)V

    return-void

    :pswitch_5
    check-cast v6, Lio/sentry/android/core/AnrIntegration;

    check-cast v5, Lio/sentry/android/core/SentryAndroidOptions;

    iget-object v0, v6, Lio/sentry/android/core/AnrIntegration;->c:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    :try_start_2
    iget-boolean v0, v6, Lio/sentry/android/core/AnrIntegration;->b:Z

    if-nez v0, :cond_2

    invoke-virtual {v6, v5}, Lio/sentry/android/core/AnrIntegration;->d(Lio/sentry/android/core/SentryAndroidOptions;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v2, v0

    goto :goto_6

    :cond_2
    :goto_5
    invoke-virtual {v1}, Lio/sentry/r;->close()V

    return-void

    :goto_6
    :try_start_3
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v2

    :pswitch_6
    check-cast v6, Lio/sentry/g0;

    check-cast v5, Lio/sentry/g0;

    invoke-static {v6, v5}, Lio/sentry/android/core/ActivityLifecycleIntegration;->f(Lio/sentry/g0;Lio/sentry/g0;)V

    return-void

    :pswitch_7
    check-cast v6, Lio/sentry/SpotlightIntegration;

    check-cast v5, Lio/sentry/internal/debugmeta/c;

    const-string v1, "Envelope sent to spotlight: %d"

    :try_start_4
    iget-object v0, v6, Lio/sentry/SpotlightIntegration;->a:Lio/sentry/v2;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lio/sentry/v2;->getSpotlightConnectionUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, v6, Lio/sentry/SpotlightIntegration;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getSpotlightConnectionUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_8

    :cond_3
    sget-boolean v0, Lio/sentry/util/f;->a:Z

    if-eqz v0, :cond_4

    const-string v0, "http://10.0.2.2:8969/stream"

    goto :goto_8

    :cond_4
    const-string v0, "http://localhost:8969/stream"

    :goto_8
    invoke-static {v0}, Lio/sentry/SpotlightIntegration;->f(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    new-instance v4, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v4, v3}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :try_start_7
    iget-object v0, v6, Lio/sentry/SpotlightIntegration;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v0

    invoke-interface {v0, v5, v4}, Lio/sentry/e0;->e(Lio/sentry/internal/debugmeta/c;Ljava/io/OutputStream;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :try_start_8
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    if-eqz v3, :cond_5

    :try_start_9
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    goto :goto_9

    :catchall_4
    move-exception v0

    goto :goto_e

    :cond_5
    :goto_9
    :try_start_a
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    iget-object v3, v6, Lio/sentry/SpotlightIntegration;->b:Lio/sentry/ILogger;

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v4, v1, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_a
    invoke-static {v2}, Lio/sentry/SpotlightIntegration;->d(Ljava/net/HttpURLConnection;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    goto :goto_10

    :catch_0
    move-exception v0

    goto :goto_f

    :catchall_5
    move-exception v0

    move-object v4, v0

    goto :goto_c

    :catchall_6
    move-exception v0

    move-object v5, v0

    :try_start_b
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    goto :goto_b

    :catchall_7
    move-exception v0

    :try_start_c
    invoke-virtual {v5, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v5
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :goto_c
    if-eqz v3, :cond_6

    :try_start_d
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    goto :goto_d

    :catchall_8
    move-exception v0

    :try_start_e
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_d
    throw v4
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    :goto_e
    :try_start_f
    iget-object v3, v6, Lio/sentry/SpotlightIntegration;->b:Lio/sentry/ILogger;

    sget-object v4, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v5, "An exception occurred while submitting the envelope to the Sentry server."

    invoke-interface {v3, v4, v5, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    :try_start_10
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    iget-object v3, v6, Lio/sentry/SpotlightIntegration;->b:Lio/sentry/ILogger;

    sget-object v4, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v4, v1, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_a

    :catchall_9
    move-exception v0

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    iget-object v4, v6, Lio/sentry/SpotlightIntegration;->b:Lio/sentry/ILogger;

    sget-object v5, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v5, v1, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v2}, Lio/sentry/SpotlightIntegration;->d(Ljava/net/HttpURLConnection;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SentryOptions are required to send envelopes."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_0

    :goto_f
    iget-object v1, v6, Lio/sentry/SpotlightIntegration;->b:Lio/sentry/ILogger;

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "An exception occurred while creating the connection to spotlight."

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_10
    return-void

    :pswitch_8
    check-cast v6, Lio/sentry/v1;

    check-cast v5, Lio/sentry/c0;

    invoke-virtual {v6}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getShutdownTimeoutMillis()J

    move-result-wide v0

    invoke-interface {v5, v0, v1}, Lio/sentry/c0;->g(J)V

    return-void

    :pswitch_9
    check-cast v6, Lio/sentry/q;

    check-cast v5, Lio/sentry/D2;

    invoke-virtual {v6, v5}, Lio/sentry/q;->e(Lio/sentry/i0;)Ljava/util/List;

    return-void

    :pswitch_a
    check-cast v6, Landroid/widget/TextView;

    check-cast v5, LHv;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x20f51fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v5, LHv;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v1, LcG;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_b
    check-cast v6, Landroid/widget/TextView;

    check-cast v5, LbG;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x20f44fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v5, LbG;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x20f4efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_c
    check-cast v6, Landroid/view/View;

    check-cast v5, La9;

    invoke-virtual {v6}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, LN2;

    const/16 v2, 0x1b

    invoke-direct {v1, v2, v5}, LN2;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void

    :pswitch_d
    check-cast v6, LNj;

    check-cast v5, Landroid/graphics/Typeface;

    invoke-virtual {v6, v5}, LNj;->J(Landroid/graphics/Typeface;)V

    return-void

    :pswitch_e
    check-cast v6, Landroid/view/ViewGroup;

    check-cast v5, LhG;

    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v0, -0x2dbbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    const-wide v7, -0x2c58fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lhw;->a(ILjava/lang/String;)I

    move-result v1

    invoke-static {v6, v0, v1, v3}, Lgf;->M(Landroid/view/ViewGroup;IIZ)V

    if-eqz v0, :cond_b

    iget-object v1, v5, LhG;->a:Lqs;

    iget-object v1, v1, Lqs;->b:Ljava/lang/Object;

    new-instance v4, Lvx;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    instance-of v5, v1, Ljava/lang/Class;

    if-eqz v5, :cond_8

    check-cast v1, Ljava/lang/Class;

    iput-object v1, v4, Lvx;->b:Ljava/io/Serializable;

    goto :goto_12

    :cond_8
    iput-object v1, v4, Lvx;->c:Ljava/lang/Object;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_11

    :cond_9
    move-object v1, v2

    :goto_11
    iput-object v1, v4, Lvx;->b:Ljava/io/Serializable;

    :goto_12
    const-wide v5, -0x2c74fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lvx;->e(Ljava/lang/String;)V

    invoke-virtual {v4}, Lvx;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    :cond_a
    const-wide v4, -0x2c1efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-wide v4, -0x2cdafffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    const-wide v4, -0x2c98fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-wide v4, -0x20dfbfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    return-void

    :pswitch_f
    check-cast v6, Landroid/animation/ValueAnimator;

    check-cast v5, Landroid/widget/LinearLayout;

    invoke-virtual {v6}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/view/View;->setElevation(F)V

    return-void

    :pswitch_10
    check-cast v6, LUi;

    check-cast v5, Ljava/util/concurrent/CountDownLatch;

    invoke-static {v6, v5}, Lio/github/cherrywechat/lua/LuaUiScheduler;->a(LUi;Ljava/util/concurrent/CountDownLatch;)V

    return-void

    :pswitch_11
    check-cast v6, LRp;

    check-cast v5, Landroid/app/Activity;

    const/16 v1, 0xa

    :try_start_11
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v0, v4}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->setCurrentContext(Landroid/content/Context;)V

    invoke-virtual {v0, v5}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->setCurrentActivity(Landroid/app/Activity;)V

    sget-boolean v0, LgG;->h:Z

    if-eqz v0, :cond_d

    sget-object v0, LgG;->d:Ljava/lang/String;

    if-eqz v0, :cond_c

    goto :goto_13

    :cond_c
    const-wide v7, -0x20e21fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v2

    :goto_13
    sget-object v4, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    invoke-virtual {v4, v0}, Lio/github/cherrywechat/lua/LuaEngine;->setModuleApkPath(Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v7, -0x18f05fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, LRp;->a(Ljava/lang/String;)V

    goto :goto_14

    :catch_1
    move-exception v0

    goto/16 :goto_16

    :cond_d
    :goto_14
    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/LuaEngine;->isInitialized()Z

    move-result v4

    if-nez v4, :cond_e

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    const-wide v7, -0x18f20fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    const/4 v5, 0x2

    invoke-static {v0, v4, v2, v5, v2}, Lio/github/cherrywechat/lua/LuaEngine;->init$default(Lio/github/cherrywechat/lua/LuaEngine;Landroid/content/Context;Ljava/lang/ClassLoader;ILjava/lang/Object;)V

    const-wide v4, -0x18f3bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, LRp;->a(Ljava/lang/String;)V

    goto :goto_15

    :cond_e
    const-wide v4, -0x18fcdfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, LRp;->a(Ljava/lang/String;)V

    :goto_15
    iget-object v0, v6, LRp;->d:Landroid/widget/TextView;

    if-nez v0, :cond_f

    const-wide v4, -0x18fddfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v2

    :cond_f
    const-wide v4, -0x18fedfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v6, LRp;->d:Landroid/widget/TextView;

    if-nez v0, :cond_10

    const-wide v4, -0x18ff2fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v2

    :cond_10
    iget-object v4, v6, LRp;->g:Landroid/app/Activity;

    if-nez v4, :cond_11

    const-wide v4, -0x18f82fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-object v4, v2

    :cond_11
    const v5, 0x5506004b

    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_1

    goto :goto_18

    :goto_16
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v7, -0x18f92fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, LRp;->a(Ljava/lang/String;)V

    iget-object v0, v6, LRp;->d:Landroid/widget/TextView;

    if-nez v0, :cond_12

    const-wide v0, -0x18fa5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v2

    :cond_12
    const-wide v4, -0x18fb5fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v6, LRp;->d:Landroid/widget/TextView;

    if-nez v0, :cond_13

    const-wide v0, -0x18fbafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v2

    :cond_13
    iget-object v1, v6, LRp;->g:Landroid/app/Activity;

    if-nez v1, :cond_14

    const-wide v4, -0x18e4afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    goto :goto_17

    :cond_14
    move-object v2, v1

    :goto_17
    const v1, 0x55060042

    invoke-virtual {v2, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_18
    invoke-virtual {v6}, LRp;->g()V

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-virtual {v6, v3}, LRp;->h(Z)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, v6, LRp;->n:Landroid/os/Handler;

    new-instance v1, LK0;

    const/16 v2, 0xb

    invoke-direct {v1, v2, v6}, LK0;-><init>(ILjava/lang/Object;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_15
    return-void

    :pswitch_12
    check-cast v6, Ljava/lang/String;

    check-cast v5, Lfj;

    invoke-static {v6, v5}, Lio/github/cherrywechat/lua/LuaEngine;->d(Ljava/lang/String;Lfj;)V

    return-void

    :pswitch_13
    check-cast v6, Landroid/widget/TextView;

    check-cast v5, Landroid/widget/TextView;

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_16

    invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_19

    :cond_16
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    const-wide v0, -0x3be2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_19
    return-void

    :pswitch_14
    check-cast v6, LM6;

    check-cast v5, Lnk;

    invoke-virtual {v6, v5}, LM6;->r(Lbc;)V

    return-void

    :pswitch_15
    check-cast v6, Ljava/util/ArrayList;

    check-cast v5, LMy;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v5, LMy;->c:Lhi;

    iget-object v0, v0, Lhi;->E:Landroid/view/View;

    iget v1, v5, LMy;->a:I

    invoke-static {v0, v1}, Lph;->a(Landroid/view/View;I)V

    :cond_17
    return-void

    :pswitch_16
    check-cast v6, Lki;

    check-cast v5, Lot;

    invoke-static {v6, v5}, LTa;->access$addObserverForBackInvoker(LTa;Lot;)V

    return-void

    :pswitch_17
    check-cast v6, Ljava/lang/String;

    check-cast v5, Landroid/widget/ImageView;

    invoke-static {v6, v5}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->D0(Ljava/lang/String;Landroid/widget/ImageView;)V

    return-void

    :pswitch_18
    check-cast v6, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;

    check-cast v5, [B

    invoke-static {v6, v5}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->e(Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;[B)V

    return-void

    :pswitch_19
    check-cast v6, Ljava/lang/String;

    check-cast v5, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;

    invoke-static {v6, v5}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->h(Ljava/lang/String;Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;)V

    return-void

    :pswitch_1a
    check-cast v6, Landroid/widget/ImageView;

    check-cast v5, Landroid/graphics/Bitmap;

    invoke-virtual {v6, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void

    :pswitch_1b
    check-cast v6, Landroid/view/ViewGroup;

    check-cast v5, Landroid/graphics/drawable/Drawable;

    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setClickable(Z)V

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v0, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    :pswitch_1c
    check-cast v6, Lo3;

    check-cast v5, Ljava/lang/Runnable;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_12
    invoke-interface {v5}, Ljava/lang/Runnable;->run()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    invoke-virtual {v6}, Lo3;->a()V

    return-void

    :catchall_a
    move-exception v0

    invoke-virtual {v6}, Lo3;->a()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
