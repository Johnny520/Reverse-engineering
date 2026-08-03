.class public final Lpd/s;
.super Lpd/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final o:I

.field public final p:Z

.field public q:Lpd/r;

.field public r:I

.field public s:[Ljava/lang/Object;

.field public t:[Lud/a;

.field public u:Lud/a;


# direct methods
.method public constructor <init>(Lqd/l;IZ)V
    .locals 2

    .line 1
    sget-object v0, Lpd/k;->w:Lpd/k;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, v0, v1}, Lud/p;-><init>(Lpd/k;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lud/p;->I(Lqd/l;)V

    .line 8
    .line 9
    .line 10
    iput p2, p0, Lpd/s;->o:I

    .line 11
    .line 12
    iput-boolean p3, p0, Lpd/s;->p:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final O()Lud/p;
    .locals 4

    .line 1
    new-instance v0, Lpd/s;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v1}, Lud/p;->S(I)Lqd/l;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget v2, p0, Lpd/s;->o:I

    .line 9
    .line 10
    iget-boolean v3, p0, Lpd/s;->p:Z

    .line 11
    .line 12
    invoke-direct {v0, v1, v2, v3}, Lpd/s;-><init>(Lqd/l;IZ)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lpd/s;->q:Lpd/r;

    .line 16
    .line 17
    iput-object v1, v0, Lpd/s;->q:Lpd/r;

    .line 18
    .line 19
    iget v1, p0, Lpd/s;->r:I

    .line 20
    .line 21
    iput v1, v0, Lpd/s;->r:I

    .line 22
    .line 23
    iget-object v1, p0, Lpd/s;->t:[Lud/a;

    .line 24
    .line 25
    iput-object v1, v0, Lpd/s;->t:[Lud/a;

    .line 26
    .line 27
    iget-object v1, p0, Lpd/s;->u:Lud/a;

    .line 28
    .line 29
    iput-object v1, v0, Lpd/s;->u:Lud/a;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public final Y(Lud/p;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lpd/s;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-super {p0, p1}, Lud/p;->Y(Lud/p;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, Lpd/s;

    .line 16
    .line 17
    iget v0, p0, Lpd/s;->o:I

    .line 18
    .line 19
    iget v1, p1, Lpd/s;->o:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    iget-boolean v0, p0, Lpd/s;->p:Z

    .line 24
    .line 25
    iget-boolean p1, p1, Lpd/s;->p:Z

    .line 26
    .line 27
    if-ne v0, p1, :cond_2

    .line 28
    .line 29
    :goto_0
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 32
    return p1
.end method

.method public final i0(Lud/a;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lpd/s;->q:Lpd/r;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p1, p1, Lud/a;->n:Ljava/util/List;

    .line 6
    .line 7
    iget-object v0, v0, Lpd/r;->q:[I

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    new-array v2, v1, [Lud/a;

    .line 11
    .line 12
    iput-object v2, p0, Lpd/s;->t:[Lud/a;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    iget-object v3, p0, Lpd/s;->t:[Lud/a;

    .line 18
    .line 19
    aget v4, v0, v2

    .line 20
    .line 21
    invoke-static {v4, p1}, La/a;->T(ILjava/lang/Iterable;)Lud/a;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    aput-object v4, v3, v2

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget v0, p0, Lpd/s;->r:I

    .line 31
    .line 32
    invoke-static {v0, p1}, La/a;->T(ILjava/lang/Iterable;)Lud/a;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lpd/s;->u:Lud/a;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    const-string p1, "Switch data not yet attached"

    .line 40
    .line 41
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final j0(Lud/a;Lud/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lpd/s;->t:[Lud/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    array-length v0, v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_2

    .line 9
    .line 10
    iget-object v2, p0, Lpd/s;->t:[Lud/a;

    .line 11
    .line 12
    aget-object v3, v2, v1

    .line 13
    .line 14
    if-ne v3, p1, :cond_1

    .line 15
    .line 16
    aput-object p2, v2, v1

    .line 17
    .line 18
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget-object v0, p0, Lpd/s;->u:Lud/a;

    .line 22
    .line 23
    if-ne v0, p1, :cond_3

    .line 24
    .line 25
    iput-object p2, p0, Lpd/s;->u:Lud/a;

    .line 26
    .line 27
    :cond_3
    :goto_1
    return-void
.end method

.method public final k0(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lpd/s;->s:[Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    aget-object p1, v0, p1

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    invoke-virtual {p0}, Lpd/s;->l0()Lpd/r;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Lpd/r;->p:[I

    .line 13
    .line 14
    aget p1, v0, p1

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final l0()Lpd/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lpd/s;->q:Lpd/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "Switch data not yet attached"

    .line 7
    .line 8
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final m0(ILjava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lpd/s;->s:[Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lpd/s;->l0()Lpd/r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lpd/r;->p:[I

    .line 10
    .line 11
    array-length v1, v0

    .line 12
    new-array v2, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-ge v3, v1, :cond_0

    .line 16
    .line 17
    aget v4, v0, v3

    .line 18
    .line 19
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    aput-object v4, v2, v3

    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-object v2, p0, Lpd/s;->s:[Ljava/lang/Object;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lpd/s;->s:[Ljava/lang/Object;

    .line 31
    .line 32
    aput-object p2, v0, p1

    .line 33
    .line 34
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lud/p;->k()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lpd/s;->q:Lpd/r;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "no payload"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    iget v2, v1, Lpd/r;->o:I

    .line 24
    .line 25
    iget-object v3, v1, Lpd/r;->p:[I

    .line 26
    .line 27
    iget-object v4, p0, Lpd/s;->t:[Lud/a;

    .line 28
    .line 29
    const-string v5, "\n default: goto "

    .line 30
    .line 31
    const/4 v6, -0x1

    .line 32
    const-string v7, ": goto "

    .line 33
    .line 34
    const-string v8, "\n case "

    .line 35
    .line 36
    const/4 v9, 0x0

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    :goto_0
    if-ge v9, v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    aget v1, v3, v9

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lpd/s;->t:[Lud/a;

    .line 53
    .line 54
    aget-object v1, v1, v9

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    add-int/lit8 v9, v9, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget v1, p0, Lpd/s;->r:I

    .line 63
    .line 64
    if-eq v1, v6, :cond_4

    .line 65
    .line 66
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lpd/s;->u:Lud/a;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    iget-object v1, v1, Lpd/r;->q:[I

    .line 76
    .line 77
    :goto_1
    if-ge v9, v2, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    aget v4, v3, v9

    .line 83
    .line 84
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    aget v4, v1, v9

    .line 91
    .line 92
    invoke-static {v4}, Lxe/m;->d(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    add-int/lit8 v9, v9, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    iget v1, p0, Lpd/s;->r:I

    .line 103
    .line 104
    if-eq v1, v6, :cond_4

    .line 105
    .line 106
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget v1, p0, Lpd/s;->r:I

    .line 110
    .line 111
    invoke-static {v1}, Lxe/m;->d(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    :cond_4
    :goto_2
    invoke-virtual {p0, v0}, Lud/p;->K(Ljava/lang/StringBuilder;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0
.end method
