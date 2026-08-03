.class public final Lr4/v;
.super Lr4/d0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a(Lr4/p;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lr4/p;->g:Lr4/h0;

    .line 2
    .line 3
    iget-object v1, p0, Lr4/y;->h:Lv4/d0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lr4/h0;->p(Lv4/d0;)Lr4/s0;

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Lr4/p;->f:Lr4/h0;

    .line 9
    .line 10
    iget-object v1, p0, Lr4/d0;->i:Lv4/w;

    .line 11
    .line 12
    iget-object v2, v1, Lv4/w;->h:Lv4/z;

    .line 13
    .line 14
    iget-object v2, v2, Lv4/z;->g:Lv4/c0;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lr4/h0;->r(Lv4/c0;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p1, Lr4/p;->g:Lr4/h0;

    .line 20
    .line 21
    check-cast v1, Lv4/m;

    .line 22
    .line 23
    iget-object v0, v1, Lv4/w;->h:Lv4/z;

    .line 24
    .line 25
    invoke-virtual {v0}, Lv4/z;->k()Lw4/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Lr4/h0;->t(Lw4/c;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->n:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Lr4/p;)I
    .locals 1

    .line 1
    iget-object p1, p1, Lr4/p;->g:Lr4/h0;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/d0;->i:Lv4/w;

    .line 4
    .line 5
    check-cast v0, Lv4/m;

    .line 6
    .line 7
    iget-object v0, v0, Lv4/w;->h:Lv4/z;

    .line 8
    .line 9
    invoke-virtual {v0}, Lv4/z;->k()Lw4/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lr4/h0;->o(Lw4/c;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "type_idx"

    .line 2
    .line 3
    return-object v0
.end method
