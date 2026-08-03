.class public abstract Lp4/c0;
.super Lp4/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final i(Lp4/j;)Lp4/h;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string v0, "unsupported"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public j(I)Lp4/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/h;->d:Lu4/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu4/p;->s(I)Lu4/p;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lp4/h;->k(Lu4/p;)Lp4/h;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final l(Lz4/d;)V
    .locals 0

    .line 1
    return-void
.end method
