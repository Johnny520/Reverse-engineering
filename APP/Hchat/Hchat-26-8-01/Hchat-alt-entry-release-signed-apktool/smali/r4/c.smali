.class public final Lr4/c;
.super Lr4/l0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public k:Lr4/b;


# virtual methods
.method public final a(Lr4/p;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lr4/p;->b:Lr4/k0;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/c;->k:Lr4/b;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lr4/k0;->l(Lr4/l0;)Lr4/l0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lr4/b;

    .line 10
    .line 11
    iput-object p1, p0, Lr4/c;->k:Lr4/b;

    .line 12
    .line 13
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->E:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/c;->k:Lr4/b;

    .line 2
    .line 3
    iget-object v0, v0, Lr4/b;->k:Lt4/b;

    .line 4
    .line 5
    invoke-virtual {v0}, Lt4/b;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final m(Lr4/p;Lz4/d;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lr4/c;->k:Lr4/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lr4/l0;->f()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, La/a;->Y0(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "  annotations_off: "

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x4

    .line 24
    invoke-virtual {p2, v1, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p2, p1}, Lz4/d;->k(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
