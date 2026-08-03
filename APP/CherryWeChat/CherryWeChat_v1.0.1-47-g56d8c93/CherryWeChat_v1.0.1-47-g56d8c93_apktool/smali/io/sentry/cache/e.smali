.class public final Lio/sentry/cache/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/T;


# instance fields
.field public final a:Lio/sentry/v2;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/cache/e;->a:Lio/sentry/v2;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/cache/e;->a:Lio/sentry/v2;

    const-string v1, ".options-cache"

    invoke-static {v0, v1, p1}, Lio/sentry/cache/a;->a(Lio/sentry/v2;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/cache/e;->a:Lio/sentry/v2;

    const-string v1, ".options-cache"

    invoke-static {v0, p2, v1, p1}, Lio/sentry/cache/a;->d(Lio/sentry/v2;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
