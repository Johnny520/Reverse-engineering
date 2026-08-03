.class public abstract Lio/sentry/H1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# virtual methods
.method public a(Lio/sentry/H1;)I
    .locals 3

    invoke-virtual {p0}, Lio/sentry/H1;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1}, Lio/sentry/H1;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method

.method public b(Lio/sentry/H1;)J
    .locals 4

    invoke-virtual {p0}, Lio/sentry/H1;->d()J

    move-result-wide v0

    invoke-virtual {p1}, Lio/sentry/H1;->d()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public c(Lio/sentry/H1;)J
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lio/sentry/H1;->a(Lio/sentry/H1;)I

    move-result v0

    if-gez v0, :cond_0

    invoke-virtual {p1}, Lio/sentry/H1;->d()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lio/sentry/H1;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lio/sentry/H1;

    invoke-virtual {p0, p1}, Lio/sentry/H1;->a(Lio/sentry/H1;)I

    move-result p1

    return p1
.end method

.method public abstract d()J
.end method
