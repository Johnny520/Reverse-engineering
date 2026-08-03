.class public final Lv7/b0;
.super Lv7/g0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final L(Lu7/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv7/g0;->l:Lk7/a;

    .line 2
    .line 3
    check-cast v0, Lv7/d0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lv7/j0;->T()Lv7/k0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lv7/k0;->u:Lv7/k0;

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lv7/j0;->U(Lu7/c;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final N()V
    .locals 5

    .line 1
    iget-object v0, p0, Lv7/g0;->k:Lv7/i0;

    .line 2
    .line 3
    check-cast v0, Lv7/e;

    .line 4
    .line 5
    iget-object v1, v0, Lv7/i0;->m:Lv7/h0;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    iput-object v2, v0, Lv7/i0;->m:Lv7/h0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lv7/i0;->N()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-gez v3, :cond_1

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_1
    iget-object v0, v0, Lk7/a;->h:Lk7/a;

    .line 21
    .line 22
    :goto_0
    if-eqz v0, :cond_3

    .line 23
    .line 24
    instance-of v4, v0, Ll7/g;

    .line 25
    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    check-cast v0, Ll7/g;

    .line 29
    .line 30
    invoke-interface {v0}, Ll7/g;->a()Lu7/c;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    iget-object v0, v0, Lk7/a;->h:Lk7/a;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    move-object v0, v2

    .line 39
    :goto_1
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_4
    invoke-virtual {v0, v3}, Lu7/c;->V(I)Lr7/s;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :goto_2
    if-nez v2, :cond_5

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_5
    invoke-virtual {v2, v1}, Lr7/s;->a0(Lr7/m;)V

    .line 50
    .line 51
    .line 52
    :goto_3
    iget-object v0, p0, Lv7/g0;->l:Lk7/a;

    .line 53
    .line 54
    check-cast v0, Lv7/d0;

    .line 55
    .line 56
    invoke-virtual {v0}, Lv7/j0;->W()V

    .line 57
    .line 58
    .line 59
    return-void
.end method
