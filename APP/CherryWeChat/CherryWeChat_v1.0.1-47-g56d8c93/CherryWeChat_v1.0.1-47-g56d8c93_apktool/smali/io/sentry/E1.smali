.class public final Lio/sentry/E1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lio/sentry/f;

    check-cast p2, Lio/sentry/f;

    invoke-virtual {p1}, Lio/sentry/f;->a()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p2}, Lio/sentry/f;->a()Ljava/util/Date;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result p1

    return p1
.end method
