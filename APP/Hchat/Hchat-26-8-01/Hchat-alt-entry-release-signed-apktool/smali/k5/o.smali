.class public final Lk5/o;
.super Li5/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final j:Lk5/u;

.field public final k:I

.field public final l:Lk5/n;

.field public final m:I

.field public n:I

.field public o:I

.field public p:I

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:I

.field public u:Lo5/e;


# direct methods
.method public constructor <init>(Lk5/u;II)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lk5/o;->n:I

    .line 6
    .line 7
    iput v0, p0, Lk5/o;->o:I

    .line 8
    .line 9
    iput v0, p0, Lk5/o;->p:I

    .line 10
    .line 11
    iput-object p1, p0, Lk5/o;->j:Lk5/u;

    .line 12
    .line 13
    iput p2, p0, Lk5/o;->k:I

    .line 14
    .line 15
    iget-object v1, p1, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 16
    .line 17
    add-int/lit8 p2, p2, 0x18

    .line 18
    .line 19
    invoke-virtual {v1, p2}, Landroidx/lifecycle/x;->N(I)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    const/4 p1, -0x1

    .line 26
    iput p1, p0, Lk5/o;->m:I

    .line 27
    .line 28
    iput v0, p0, Lk5/o;->q:I

    .line 29
    .line 30
    iput v0, p0, Lk5/o;->r:I

    .line 31
    .line 32
    iput v0, p0, Lk5/o;->s:I

    .line 33
    .line 34
    iput v0, p0, Lk5/o;->t:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object p1, p1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v1, La5/a;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {v1, p2, v2, p1}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, La5/a;->o(Z)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, p0, Lk5/o;->q:I

    .line 53
    .line 54
    invoke-virtual {v1, v0}, La5/a;->o(Z)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iput p1, p0, Lk5/o;->r:I

    .line 59
    .line 60
    invoke-virtual {v1, v0}, La5/a;->o(Z)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iput p1, p0, Lk5/o;->s:I

    .line 65
    .line 66
    invoke-virtual {v1, v0}, La5/a;->o(Z)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iput p1, p0, Lk5/o;->t:I

    .line 71
    .line 72
    iget p1, v1, La5/a;->h:I

    .line 73
    .line 74
    iput p1, p0, Lk5/o;->m:I

    .line 75
    .line 76
    :goto_0
    if-eqz p3, :cond_1

    .line 77
    .line 78
    new-instance p1, Lk5/n;

    .line 79
    .line 80
    invoke-direct {p1, p0, p3}, Lk5/n;-><init>(Lk5/o;I)V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Lk5/o;->l:Lk5/n;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_1
    const/4 p1, 0x0

    .line 87
    iput-object p1, p0, Lk5/o;->l:Lk5/n;

    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public final e1()Lo5/e;
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/o;->u:Lo5/e;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lk5/o;->j:Lk5/u;

    .line 6
    .line 7
    iget-object v1, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 8
    .line 9
    iget v2, p0, Lk5/o;->k:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, 0x14

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroidx/lifecycle/x;->N(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    sget-object v0, Lo5/e;->a:Lo5/a;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v2, Lo5/d;

    .line 23
    .line 24
    invoke-direct {v2, v0, v1}, Lo5/d;-><init>(Lk5/u;I)V

    .line 25
    .line 26
    .line 27
    move-object v0, v2

    .line 28
    :goto_0
    iput-object v0, p0, Lk5/o;->u:Lo5/e;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lk5/o;->u:Lo5/e;

    .line 31
    .line 32
    return-object v0
.end method

.method public final f1(Z)Ljava/lang/Iterable;
    .locals 11

    .line 1
    iget v0, p0, Lk5/o;->s:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lk5/o;->j:Lk5/u;

    .line 6
    .line 7
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 8
    .line 9
    invoke-virtual {p0}, Lk5/o;->g1()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lk5/o;->e1()Lo5/e;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v6, p0, Lk5/o;->l:Lk5/n;

    .line 21
    .line 22
    if-nez v6, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    move-object v5, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v5, Lk5/l;

    .line 28
    .line 29
    iget-object v0, v6, Lk5/n;->l:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lk5/o;

    .line 32
    .line 33
    iget-object v1, v0, Lk5/o;->j:Lk5/u;

    .line 34
    .line 35
    iget-object v7, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 36
    .line 37
    invoke-virtual {v6}, Lk5/n;->d()I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    iget v9, v0, Lk5/o;->s:I

    .line 42
    .line 43
    const/4 v10, 0x2

    .line 44
    invoke-direct/range {v5 .. v10}, Lk5/l;-><init>(Ljava/lang/Object;Landroidx/lifecycle/x;III)V

    .line 45
    .line 46
    .line 47
    :goto_0
    new-instance v1, Lk5/i;

    .line 48
    .line 49
    const/4 v7, 0x1

    .line 50
    move-object v2, p0

    .line 51
    move v6, p1

    .line 52
    invoke-direct/range {v1 .. v7}, Lk5/i;-><init>(Lk5/o;Lo5/e;ILo5/s;ZI)V

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :cond_1
    move-object v2, p0

    .line 57
    iget p1, v2, Lk5/o;->o:I

    .line 58
    .line 59
    if-lez p1, :cond_2

    .line 60
    .line 61
    iput p1, v2, Lk5/o;->p:I

    .line 62
    .line 63
    :cond_2
    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 64
    .line 65
    return-object p1
.end method

.method public final g1()I
    .locals 4

    .line 1
    iget v0, p0, Lk5/o;->o:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    iget-object v0, p0, Lk5/o;->j:Lk5/u;

    .line 7
    .line 8
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 9
    .line 10
    invoke-virtual {p0}, Lk5/o;->h1()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v2, La5/a;

    .line 18
    .line 19
    const/4 v3, 0x5

    .line 20
    invoke-direct {v2, v1, v3, v0}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    :goto_0
    iget v1, p0, Lk5/o;->r:I

    .line 25
    .line 26
    if-ge v0, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2}, La5/a;->q()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, La5/a;->q()V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget v0, v2, La5/a;->h:I

    .line 38
    .line 39
    iput v0, p0, Lk5/o;->o:I

    .line 40
    .line 41
    return v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/o;->j:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->s:Lk5/s;

    .line 4
    .line 5
    iget-object v0, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 6
    .line 7
    iget v2, p0, Lk5/o;->k:I

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Landroidx/lifecycle/x;->N(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {v1, v0}, Lk5/s;->b(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final h1()I
    .locals 4

    .line 1
    iget v0, p0, Lk5/o;->n:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    iget-object v0, p0, Lk5/o;->j:Lk5/u;

    .line 7
    .line 8
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v1, La5/a;

    .line 14
    .line 15
    const/4 v2, 0x5

    .line 16
    iget v3, p0, Lk5/o;->m:I

    .line 17
    .line 18
    invoke-direct {v1, v3, v2, v0}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    iget v2, p0, Lk5/o;->q:I

    .line 23
    .line 24
    if-ge v0, v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, La5/a;->q()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, La5/a;->q()V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget v0, v1, La5/a;->h:I

    .line 36
    .line 37
    iput v0, p0, Lk5/o;->n:I

    .line 38
    .line 39
    return v0
.end method

.method public final i1(Z)Ljava/lang/Iterable;
    .locals 10

    .line 1
    iget v0, p0, Lk5/o;->t:I

    .line 2
    .line 3
    if-lez v0, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Lk5/o;->j:Lk5/u;

    .line 6
    .line 7
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 8
    .line 9
    iget v1, p0, Lk5/o;->p:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    :goto_0
    move v6, v1

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    invoke-virtual {p0}, Lk5/o;->g1()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v3, La5/a;

    .line 24
    .line 25
    const/4 v4, 0x5

    .line 26
    invoke-direct {v3, v1, v4, v0}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move v1, v2

    .line 30
    :goto_1
    iget v4, p0, Lk5/o;->s:I

    .line 31
    .line 32
    if-ge v1, v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v3}, La5/a;->q()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, La5/a;->q()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, La5/a;->q()V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget v1, v3, La5/a;->h:I

    .line 47
    .line 48
    iput v1, p0, Lk5/o;->p:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lk5/o;->e1()Lo5/e;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    iget-object v0, p0, Lk5/o;->l:Lk5/n;

    .line 59
    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    move-object v7, v0

    .line 64
    goto :goto_4

    .line 65
    :cond_2
    new-instance v1, Lk5/m;

    .line 66
    .line 67
    iget-object v3, v0, Lk5/n;->l:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, Lk5/o;

    .line 70
    .line 71
    iget-object v4, v3, Lk5/o;->j:Lk5/u;

    .line 72
    .line 73
    iget-object v4, v4, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 74
    .line 75
    iget v7, v0, Lk5/n;->k:I

    .line 76
    .line 77
    if-nez v7, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0}, Lk5/n;->d()I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v8, La5/a;

    .line 87
    .line 88
    const/4 v9, 0x5

    .line 89
    invoke-direct {v8, v7, v9, v4}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    move v7, v2

    .line 93
    :goto_3
    iget v9, v3, Lk5/o;->s:I

    .line 94
    .line 95
    if-ge v7, v9, :cond_3

    .line 96
    .line 97
    invoke-virtual {v8, v2}, La5/a;->o(Z)I

    .line 98
    .line 99
    .line 100
    add-int/lit8 v7, v7, 0x1

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    iget v2, v8, La5/a;->h:I

    .line 104
    .line 105
    iput v2, v0, Lk5/n;->k:I

    .line 106
    .line 107
    :cond_4
    iget v0, v0, Lk5/n;->k:I

    .line 108
    .line 109
    iget v2, v3, Lk5/o;->t:I

    .line 110
    .line 111
    invoke-direct {v1, v4, v0, v2}, Lo5/s;-><init>(Landroidx/lifecycle/x;II)V

    .line 112
    .line 113
    .line 114
    move-object v7, v1

    .line 115
    :goto_4
    new-instance v3, Lk5/k;

    .line 116
    .line 117
    move-object v4, p0

    .line 118
    move v8, p1

    .line 119
    invoke-direct/range {v3 .. v8}, Lk5/k;-><init>(Lk5/o;Lo5/e;ILk5/m;Z)V

    .line 120
    .line 121
    .line 122
    return-object v3

    .line 123
    :cond_5
    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 124
    .line 125
    return-object p1
.end method
