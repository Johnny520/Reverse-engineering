.class public final Lr4/s0;
.super Lr4/y;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a(Lr4/p;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lr4/p;->f:Lr4/h0;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/y;->h:Lv4/d0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lv4/d0;->k()Lv4/c0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Lr4/h0;->r(Lv4/c0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->l:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    return v0
.end method

.method public final d(Lr4/p;Lz4/d;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr4/y;->h:Lv4/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/d0;->k()Lv4/c0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p1, p1, Lr4/p;->f:Lr4/h0;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lr4/h0;->l(Lv4/c0;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lr4/z;->f()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/16 v2, 0x20

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lv4/c0;->a()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-virtual {p2, v1, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, La/a;->Y0(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "  descriptor_idx: "

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/4 v1, 0x4

    .line 62
    invoke-virtual {p2, v1, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {p2, p1}, Lz4/d;->k(I)V

    .line 66
    .line 67
    .line 68
    return-void
.end method
