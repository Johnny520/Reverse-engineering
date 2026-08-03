.class public final synthetic Lio/sentry/android/core/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/p1;


# instance fields
.field public final synthetic a:Lio/sentry/android/core/ActivityLifecycleIntegration;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/android/core/e;->a:Lio/sentry/android/core/ActivityLifecycleIntegration;

    iput-object p2, p0, Lio/sentry/android/core/e;->b:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/core/e;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lio/sentry/i0;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/e;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    iget-object v1, p0, Lio/sentry/android/core/e;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/i0;

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, Lio/sentry/X;->w(Lio/sentry/i0;)V

    return-void

    :cond_0
    iget-object p1, p0, Lio/sentry/android/core/e;->a:Lio/sentry/android/core/ActivityLifecycleIntegration;

    iget-object p1, p1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-interface {v1}, Lio/sentry/i0;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Transaction \'%s\' won\'t be bound to the Scope since there\'s one already in there."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
