.class public final Lio/sentry/p0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/W;


# instance fields
.field public final a:Ljava/lang/Runtime;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/p0;->a:Ljava/lang/Runtime;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/b1;)V
    .locals 5

    iget-object v0, p0, Lio/sentry/p0;->a:Ljava/lang/Runtime;

    invoke-virtual {v0}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p1, Lio/sentry/b1;->b:Ljava/lang/Long;

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method
