.class public final Lio/sentry/android/core/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/hints/a;
.implements Lio/sentry/hints/k;


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/sentry/android/core/t;->a:Z

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Long;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/t;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "anr_background"

    return-object v0

    :cond_0
    const-string v0, "anr_foreground"

    return-object v0
.end method
