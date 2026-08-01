.class public final Lpd;
.super Lod;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# virtual methods
.method public final a(Lpk;ILtb;)Lod;
    .locals 1

    .line 1
    new-instance v0, Lpd;

    .line 2
    .line 3
    iget-object p0, p0, Lod;->g:Lhu;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, Lod;-><init>(Lhu;Lpk;ILtb;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final d()Lhu;
    .locals 0

    .line 1
    iget-object p0, p0, Lod;->g:Lhu;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(Liu;Lik;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lod;->g:Lhu;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lhu;->b(Liu;Lik;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lzk;->d:Lzk;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lna1;->a:Lna1;

    .line 13
    .line 14
    return-object p0
.end method
