.class public final Lio/sentry/android/replay/gestures/c;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lio/sentry/transport/f;

.field public final b:Ljava/util/LinkedHashMap;

.field public c:J

.field public d:J


# direct methods
.method public constructor <init>(Lio/sentry/transport/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/gestures/c;->a:Lio/sentry/transport/f;

    new-instance p1, Ljava/util/LinkedHashMap;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    iput-object p1, p0, Lio/sentry/android/replay/gestures/c;->b:Ljava/util/LinkedHashMap;

    return-void
.end method
