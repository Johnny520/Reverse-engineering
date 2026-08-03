.class public final synthetic Lio/sentry/android/core/i0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic e:Lio/sentry/ILogger;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Landroid/view/View;Ljava/util/List;Ljava/util/concurrent/CountDownLatch;Lio/sentry/ILogger;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/i0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lio/sentry/android/core/i0;->b:Landroid/view/View;

    iput-object p3, p0, Lio/sentry/android/core/i0;->c:Ljava/util/List;

    iput-object p4, p0, Lio/sentry/android/core/i0;->d:Ljava/util/concurrent/CountDownLatch;

    iput-object p5, p0, Lio/sentry/android/core/i0;->e:Lio/sentry/ILogger;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lio/sentry/android/core/i0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lio/sentry/android/core/i0;->b:Landroid/view/View;

    iget-object v2, p0, Lio/sentry/android/core/i0;->c:Ljava/util/List;

    iget-object v3, p0, Lio/sentry/android/core/i0;->d:Ljava/util/concurrent/CountDownLatch;

    :try_start_0
    new-instance v4, Ljava/util/ArrayList;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v5, Lio/sentry/protocol/F;

    const-string v6, "android_view_system"

    invoke-direct {v5, v6, v4}, Lio/sentry/protocol/F;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-static {v1}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->b(Landroid/view/View;)Lio/sentry/protocol/G;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1, v6, v2}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->a(Landroid/view/View;Lio/sentry/protocol/G;Ljava/util/List;)V

    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Failed to process view hierarchy."

    iget-object v3, p0, Lio/sentry/android/core/i0;->e:Lio/sentry/ILogger;

    invoke-interface {v3, v1, v2, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
