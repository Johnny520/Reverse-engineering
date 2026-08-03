.class public final Lj7/e;
.super Lk7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public m:B


# virtual methods
.method public final B(Lq7/b;)V
    .locals 2

    .line 1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lp7/b;->T(Lq7/b;)Lp7/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {v0}, Lp7/a;->Q()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v1, 0xd

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-static {p1}, Lp7/k;->U(Lq7/b;)Lp7/k;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0}, Lj7/e;->k0()B

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    iget-object v0, v0, Lp7/k;->r:Lr7/c;

    .line 31
    .line 32
    invoke-virtual {v0}, Lr7/c;->get()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eq v0, v1, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget v0, p1, Lq7/b;->k:I

    .line 40
    .line 41
    invoke-virtual {p0}, Lo7/b;->P()Lk7/a;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ll7/m;

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Lk7/a;->G(Lq7/b;)V

    .line 48
    .line 49
    .line 50
    iget v1, p1, Lq7/b;->k:I

    .line 51
    .line 52
    if-le v1, v0, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    :goto_1
    return-void
.end method

.method public final X()V
    .locals 0

    .line 1
    return-void
.end method

.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ll7/m;

    .line 2
    .line 3
    check-cast p2, Ll7/m;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Ll7/m;->U(Ll7/m;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final k0()B
    .locals 6

    .line 1
    const-class v0, Lo7/j;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lo7/j;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v1, Lo7/j;->l:Ll7/j;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, v2

    .line 16
    :goto_0
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1}, Ll7/j;->V()B

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    return v3

    .line 25
    :cond_1
    iget-byte v3, p0, Lj7/e;->m:B

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    return v3

    .line 30
    :cond_2
    iget-object v3, p0, Lo7/b;->k:Lz7/c;

    .line 31
    .line 32
    invoke-virtual {v3}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x0

    .line 41
    if-eqz v4, :cond_7

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Ll7/m;

    .line 48
    .line 49
    if-nez v4, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    iget-object v4, v4, Ll7/a;->m:Lp7/a;

    .line 53
    .line 54
    check-cast v4, Lp7/k;

    .line 55
    .line 56
    iget-object v4, v4, Lp7/k;->r:Lr7/c;

    .line 57
    .line 58
    iget-object v4, v4, Lr7/b;->k:[B

    .line 59
    .line 60
    aget-byte v4, v4, v5

    .line 61
    .line 62
    if-nez v4, :cond_4

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    if-eqz v1, :cond_6

    .line 66
    .line 67
    iget-object v3, v1, Ll7/a;->m:Lp7/a;

    .line 68
    .line 69
    check-cast v3, Lp7/g;

    .line 70
    .line 71
    iget-object v3, v3, Lp7/g;->r:Lr7/c;

    .line 72
    .line 73
    invoke-virtual {v3, v4}, Lr7/c;->P(B)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Lo7/j;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    iget-object v2, v0, Lo7/j;->m:Lj7/e;

    .line 85
    .line 86
    :cond_5
    iput-byte v4, v2, Lj7/e;->m:B

    .line 87
    .line 88
    iget-object v0, v2, Lo7/b;->k:Lz7/c;

    .line 89
    .line 90
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Ll7/m;

    .line 105
    .line 106
    iget-object v1, v1, Ll7/a;->m:Lp7/a;

    .line 107
    .line 108
    check-cast v1, Lp7/k;

    .line 109
    .line 110
    iget-object v1, v1, Lp7/k;->r:Lr7/c;

    .line 111
    .line 112
    invoke-virtual {v1, v4}, Lr7/c;->P(B)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    iput-byte v4, p0, Lj7/e;->m:B

    .line 117
    .line 118
    return v4

    .line 119
    :cond_7
    return v5
.end method

.method public final n()Lk7/a;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lj7/e;->k0()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ll7/m;

    .line 6
    .line 7
    invoke-direct {v1}, Ll7/m;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v2, v1, Ll7/a;->m:Lp7/a;

    .line 11
    .line 12
    check-cast v2, Lp7/k;

    .line 13
    .line 14
    iget-object v2, v2, Lp7/k;->r:Lr7/c;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Lr7/c;->P(B)V

    .line 17
    .line 18
    .line 19
    return-object v1
.end method
