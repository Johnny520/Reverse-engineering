.class public final Lio/sentry/android/core/x;
.super Lio/sentry/hints/c;
.source ""

# interfaces
.implements Lio/sentry/hints/b;
.implements Lio/sentry/hints/a;


# instance fields
.field public final d:J

.field public final e:Z

.field public final f:Z


# direct methods
.method public constructor <init>(JLio/sentry/ILogger;JZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/sentry/hints/c;-><init>(JLio/sentry/ILogger;)V

    iput-wide p4, p0, Lio/sentry/android/core/x;->d:J

    iput-boolean p6, p0, Lio/sentry/android/core/x;->e:Z

    iput-boolean p7, p0, Lio/sentry/android/core/x;->f:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/x;->e:Z

    return v0
.end method

.method public final b()Ljava/lang/Long;
    .locals 2

    iget-wide v0, p0, Lio/sentry/android/core/x;->d:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/x;->f:Z

    if-eqz v0, :cond_0

    const-string v0, "anr_background"

    return-object v0

    :cond_0
    const-string v0, "anr_foreground"

    return-object v0
.end method

.method public final f(Lio/sentry/protocol/t;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final g(Lio/sentry/protocol/t;)V
    .locals 0

    return-void
.end method
