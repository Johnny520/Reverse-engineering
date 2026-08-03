.class public final Lio/sentry/O2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lio/sentry/v2;


# direct methods
.method public constructor <init>(Lio/sentry/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/O2;->a:Lio/sentry/v2;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/l;)Lvx;
    .locals 11

    iget-object v0, p1, Lio/sentry/l;->c:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/Double;

    iget-object p1, p1, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast p1, Lio/sentry/P2;

    iget-object v0, p1, Lio/sentry/H2;->d:Lvx;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lio/sentry/config/a;->b(Lvx;)Lvx;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/sentry/O2;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getProfilesSampler()Lio/sentry/r2;

    invoke-virtual {v0}, Lio/sentry/v2;->getProfilesSampleRate()Ljava/lang/Double;

    move-result-object v6

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    cmpg-double v3, v7, v9

    if-ltz v3, :cond_1

    move v3, v2

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v0}, Lio/sentry/v2;->getTracesSampler()Lio/sentry/u2;

    iget-object p1, p1, Lio/sentry/P2;->p:Lvx;

    if-eqz p1, :cond_2

    invoke-static {p1}, Lio/sentry/config/a;->b(Lvx;)Lvx;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {v0}, Lio/sentry/v2;->getTracesSampleRate()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0}, Lio/sentry/v2;->getBackpressureMonitor()Lio/sentry/backpressure/b;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/backpressure/b;->a()I

    move-result v0

    int-to-double v7, v0

    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v7

    if-nez p1, :cond_3

    const/4 p1, 0x0

    :goto_1
    move-object v3, p1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    div-double/2addr v9, v7

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    goto :goto_1

    :goto_2
    if-eqz v3, :cond_5

    move p1, v1

    new-instance v1, Lvx;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    cmpg-double v0, v7, v9

    if-ltz v0, :cond_4

    move p1, v2

    :cond_4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct/range {v1 .. v6}, Lvx;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    return-object v1

    :cond_5
    new-instance v1, Lvx;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v5, v2

    invoke-direct/range {v1 .. v6}, Lvx;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    return-object v1
.end method
