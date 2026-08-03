.class public final Lio/sentry/android/core/D;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final a:Lio/sentry/android/core/C;

.field public final synthetic b:Lio/sentry/android/core/E;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/E;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/D;->b:Lio/sentry/android/core/E;

    new-instance p1, Lio/sentry/android/core/C;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p0}, Lio/sentry/android/core/C;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/android/core/D;->a:Lio/sentry/android/core/C;

    return-void
.end method


# virtual methods
.method public final onStart(LYn;)V
    .locals 1

    iget-object p1, p0, Lio/sentry/android/core/D;->b:Lio/sentry/android/core/E;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p1, Lio/sentry/android/core/E;->d:Ljava/lang/Boolean;

    iget-object p1, p0, Lio/sentry/android/core/D;->a:Lio/sentry/android/core/C;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/android/core/B;

    invoke-interface {v0}, Lio/sentry/android/core/B;->d()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final onStop(LYn;)V
    .locals 1

    iget-object p1, p0, Lio/sentry/android/core/D;->b:Lio/sentry/android/core/E;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p1, Lio/sentry/android/core/E;->d:Ljava/lang/Boolean;

    iget-object p1, p0, Lio/sentry/android/core/D;->a:Lio/sentry/android/core/C;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/android/core/B;

    invoke-interface {v0}, Lio/sentry/android/core/B;->f()V

    goto :goto_0

    :cond_0
    return-void
.end method
