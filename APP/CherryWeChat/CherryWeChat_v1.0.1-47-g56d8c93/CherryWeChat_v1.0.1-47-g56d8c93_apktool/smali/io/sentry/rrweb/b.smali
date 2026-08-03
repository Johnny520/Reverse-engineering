.class public abstract Lio/sentry/rrweb/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lio/sentry/rrweb/c;

.field public b:J


# direct methods
.method public constructor <init>(Lio/sentry/rrweb/c;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/rrweb/b;->a:Lio/sentry/rrweb/c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lio/sentry/rrweb/b;->b:J

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/sentry/rrweb/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/sentry/rrweb/b;

    iget-wide v3, p0, Lio/sentry/rrweb/b;->b:J

    iget-wide v5, p1, Lio/sentry/rrweb/b;->b:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-object v1, p0, Lio/sentry/rrweb/b;->a:Lio/sentry/rrweb/c;

    iget-object p1, p1, Lio/sentry/rrweb/b;->a:Lio/sentry/rrweb/c;

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/sentry/rrweb/b;->a:Lio/sentry/rrweb/c;

    iget-wide v1, p0, Lio/sentry/rrweb/b;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
