.class public final Lio/sentry/b1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/lang/Double;

.field public b:Ljava/lang/Long;

.field public c:Ljava/lang/Long;

.field public final d:J


# direct methods
.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/b1;->a:Ljava/lang/Double;

    iput-object v0, p0, Lio/sentry/b1;->b:Ljava/lang/Long;

    iput-object v0, p0, Lio/sentry/b1;->c:Ljava/lang/Long;

    iput-wide p1, p0, Lio/sentry/b1;->d:J

    return-void
.end method
