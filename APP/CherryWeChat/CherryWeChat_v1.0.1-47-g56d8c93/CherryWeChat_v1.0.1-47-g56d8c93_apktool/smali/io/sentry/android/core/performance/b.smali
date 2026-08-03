.class public final Lio/sentry/android/core/performance/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lio/sentry/H1;

.field public c:Lio/sentry/H1;

.field public d:Lio/sentry/g0;

.field public e:Lio/sentry/g0;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/android/core/performance/b;->b:Lio/sentry/H1;

    iput-object v0, p0, Lio/sentry/android/core/performance/b;->c:Lio/sentry/H1;

    iput-object v0, p0, Lio/sentry/android/core/performance/b;->d:Lio/sentry/g0;

    iput-object v0, p0, Lio/sentry/android/core/performance/b;->e:Lio/sentry/g0;

    iput-object p1, p0, Lio/sentry/android/core/performance/b;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Lio/sentry/g0;Ljava/lang/String;Lio/sentry/H1;)Lio/sentry/g0;
    .locals 1

    sget-object v0, Lio/sentry/n0;->SENTRY:Lio/sentry/n0;

    invoke-interface {p0, p1, p2, v0}, Lio/sentry/g0;->e(Ljava/lang/String;Lio/sentry/H1;Lio/sentry/n0;)Lio/sentry/g0;

    move-result-object p0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "thread.id"

    invoke-interface {p0, p2, p1}, Lio/sentry/g0;->d(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "thread.name"

    const-string p2, "main"

    invoke-interface {p0, p1, p2}, Lio/sentry/g0;->d(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string p2, "ui.contributes_to_ttid"

    invoke-interface {p0, p2, p1}, Lio/sentry/g0;->d(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p2, "ui.contributes_to_ttfd"

    invoke-interface {p0, p2, p1}, Lio/sentry/g0;->d(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method
