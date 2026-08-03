.class public final Lr4/t0;
.super Lr4/l0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Lw4/e;


# direct methods
.method public constructor <init>(Lw4/e;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lw4/e;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    add-int/2addr v0, v1

    .line 9
    invoke-direct {p0, v1, v0}, Lr4/l0;-><init>(II)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lr4/t0;->k:Lw4/e;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 4

    .line 1
    iget-object p1, p1, Lr4/p;->g:Lr4/h0;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/t0;->k:Lw4/e;

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/e;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v0, v2}, Lw4/e;->getType(I)Lw4/c;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {p1, v3}, Lr4/h0;->t(Lw4/c;)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->t:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Lr4/l0;)I
    .locals 8

    .line 1
    check-cast p1, Lr4/t0;

    .line 2
    .line 3
    iget-object p1, p1, Lr4/t0;->k:Lw4/e;

    .line 4
    .line 5
    sget-object v0, Lw4/b;->i:Lw4/b;

    .line 6
    .line 7
    iget-object v0, p0, Lr4/t0;->k:Lw4/e;

    .line 8
    .line 9
    invoke-interface {v0}, Lw4/e;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {p1}, Lw4/e;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    :goto_0
    if-ge v5, v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v0, v5}, Lw4/e;->getType(I)Lw4/c;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-interface {p1, v5}, Lw4/e;->getType(I)Lw4/c;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    iget-object v6, v6, Lw4/c;->g:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v7, v7, Lw4/c;->g:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v6, v7}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_0

    .line 42
    .line 43
    return v6

    .line 44
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    if-ne v1, v2, :cond_2

    .line 48
    .line 49
    return v4

    .line 50
    :cond_2
    if-ge v1, v2, :cond_3

    .line 51
    .line 52
    const/4 p1, -0x1

    .line 53
    return p1

    .line 54
    :cond_3
    const/4 p1, 0x1

    .line 55
    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    sget-object v0, Lw4/b;->i:Lw4/b;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/t0;->k:Lw4/e;

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/e;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v2, v1, :cond_0

    .line 12
    .line 13
    mul-int/lit8 v3, v3, 0x1f

    .line 14
    .line 15
    invoke-interface {v0, v2}, Lw4/e;->getType(I)Lw4/c;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-object v4, v4, Lw4/c;->g:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    add-int/2addr v3, v4

    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return v3
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string v1, "unsupported"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final m(Lr4/p;Lz4/d;)V
    .locals 8

    .line 1
    iget-object p1, p1, Lr4/p;->g:Lr4/h0;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/t0;->k:Lw4/e;

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/e;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lr4/l0;->g()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v4, " type_list"

    .line 21
    .line 22
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {p2, v3, v2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, La/a;->Y0(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v4, "  size: "

    .line 34
    .line 35
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v4, 0x4

    .line 40
    invoke-virtual {p2, v4, v2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    move v2, v3

    .line 44
    :goto_0
    if-ge v2, v1, :cond_0

    .line 45
    .line 46
    invoke-interface {v0, v2}, Lw4/e;->getType(I)Lw4/c;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {p1, v4}, Lr4/h0;->o(Lw4/c;)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    new-instance v6, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v7, "  "

    .line 57
    .line 58
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v5}, La/a;->X0(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v5, " // "

    .line 69
    .line 70
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Lw4/c;->a()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    const/4 v5, 0x2

    .line 85
    invoke-virtual {p2, v5, v4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    invoke-virtual {p2, v1}, Lz4/d;->k(I)V

    .line 92
    .line 93
    .line 94
    :goto_1
    if-ge v3, v1, :cond_1

    .line 95
    .line 96
    invoke-interface {v0, v3}, Lw4/e;->getType(I)Lw4/c;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {p1, v2}, Lr4/h0;->o(Lw4/c;)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-virtual {p2, v2}, Lz4/d;->l(I)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v3, v3, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    return-void
.end method
