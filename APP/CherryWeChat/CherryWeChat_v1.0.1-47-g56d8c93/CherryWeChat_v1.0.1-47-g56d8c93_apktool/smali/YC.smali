.class public final LYC;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/lang/Object;)LXC;
    .locals 2

    check-cast p0, Lvj;

    iget-object v0, p0, Lvj;->unknownFields:LXC;

    sget-object v1, LXC;->f:LXC;

    if-ne v0, v1, :cond_0

    invoke-static {}, LXC;->c()LXC;

    move-result-object v0

    iput-object v0, p0, Lvj;->unknownFields:LXC;

    :cond_0
    return-object v0
.end method

.method public static b(Ljava/lang/Object;Lla;)Z
    .locals 8

    iget v0, p1, Lla;->b:I

    iget-object v1, p1, Lla;->a:Lka;

    ushr-int/lit8 v2, v0, 0x3

    and-int/lit8 v0, v0, 0x7

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x3

    if-eqz v0, :cond_8

    if-eq v0, v4, :cond_7

    const/4 v6, 0x2

    if-eq v0, v6, :cond_6

    if-eq v0, v5, :cond_2

    const/4 v6, 0x4

    if-eq v0, v6, :cond_1

    const/4 v3, 0x5

    if-ne v0, v3, :cond_0

    invoke-virtual {p1, v3}, Lla;->v(I)V

    invoke-virtual {v1}, Lka;->q()I

    move-result p1

    check-cast p0, LXC;

    shl-int/lit8 v0, v2, 0x3

    or-int/2addr v0, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LXC;->d(ILjava/lang/Object;)V

    return v4

    :cond_0
    invoke-static {}, LPl;->c()LOl;

    move-result-object p0

    throw p0

    :cond_1
    return v3

    :cond_2
    invoke-static {}, LXC;->c()LXC;

    move-result-object v0

    shl-int/lit8 v1, v2, 0x3

    or-int/lit8 v2, v1, 0x4

    :cond_3
    invoke-virtual {p1}, Lla;->a()I

    move-result v6

    const v7, 0x7fffffff

    if-eq v6, v7, :cond_4

    invoke-static {v0, p1}, LYC;->b(Ljava/lang/Object;Lla;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_4
    iget p1, p1, Lla;->b:I

    if-ne v2, p1, :cond_5

    iput-boolean v3, v0, LXC;->e:Z

    check-cast p0, LXC;

    or-int/lit8 p1, v1, 0x3

    invoke-virtual {p0, p1, v0}, LXC;->d(ILjava/lang/Object;)V

    return v4

    :cond_5
    new-instance p0, LPl;

    const-string p1, "Protocol message end-group tag did not match expected tag."

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p1}, Lla;->e()Ly6;

    move-result-object p1

    check-cast p0, LXC;

    shl-int/lit8 v0, v2, 0x3

    or-int/2addr v0, v6

    invoke-virtual {p0, v0, p1}, LXC;->d(ILjava/lang/Object;)V

    return v4

    :cond_7
    invoke-virtual {p1, v4}, Lla;->v(I)V

    invoke-virtual {v1}, Lka;->r()J

    move-result-wide v0

    check-cast p0, LXC;

    shl-int/lit8 p1, v2, 0x3

    or-int/2addr p1, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LXC;->d(ILjava/lang/Object;)V

    return v4

    :cond_8
    invoke-virtual {p1, v3}, Lla;->v(I)V

    invoke-virtual {v1}, Lka;->u()J

    move-result-wide v0

    check-cast p0, LXC;

    shl-int/lit8 p1, v2, 0x3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LXC;->d(ILjava/lang/Object;)V

    return v4
.end method
