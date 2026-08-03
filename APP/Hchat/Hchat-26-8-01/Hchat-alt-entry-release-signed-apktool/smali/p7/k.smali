.class public final Lp7/k;
.super Lp7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final r:Lr7/c;

.field public final s:Lr7/c;

.field public final t:Lr7/f;

.field public final u:Lr7/f;

.field public final v:Lv7/y;

.field public w:Ls7/a;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v0, 0x201

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lp7/a;-><init>(S)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lr7/c;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v0, v2, v1}, Lr7/c;-><init>(II)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lp7/k;->r:Lr7/c;

    .line 14
    .line 15
    new-instance v1, Lr7/c;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v1, v2, v3}, Lr7/c;-><init>(II)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lp7/k;->s:Lr7/c;

    .line 22
    .line 23
    new-instance v2, Lr7/a;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-direct {v2, v3, v4}, Lr7/a;-><init>(IZ)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Lr7/f;

    .line 30
    .line 31
    invoke-direct {v3, v4}, Lr7/f;-><init>(Z)V

    .line 32
    .line 33
    .line 34
    iput-object v3, p0, Lp7/k;->t:Lr7/f;

    .line 35
    .line 36
    new-instance v5, Lr7/f;

    .line 37
    .line 38
    invoke-direct {v5, v4}, Lr7/f;-><init>(Z)V

    .line 39
    .line 40
    .line 41
    iput-object v5, p0, Lp7/k;->u:Lr7/f;

    .line 42
    .line 43
    new-instance v4, Lv7/y;

    .line 44
    .line 45
    const/16 v6, 0x40

    .line 46
    .line 47
    invoke-direct {v4, v6}, Lv7/y;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object v4, p0, Lp7/k;->v:Lv7/y;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v2}, Lo7/d;->P(Lk7/a;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v3}, Lo7/d;->P(Lk7/a;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v5}, Lo7/d;->P(Lk7/a;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v4}, Lo7/d;->P(Lk7/a;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static U(Lq7/b;)Lp7/k;
    .locals 5

    .line 1
    new-instance v0, Lp7/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lp7/k;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lp7/k;->s:Lr7/c;

    .line 7
    .line 8
    invoke-virtual {v1}, Lr7/c;->get()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    and-int/lit8 v2, v2, 0x3

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    const/4 v4, 0x0

    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v4}, Lp7/k;->V(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {v1}, Lr7/c;->get()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    and-int/lit8 v1, v1, 0x3

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    if-ne v1, v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Lp7/k;->V(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Lq7/b;->available()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/16 v2, 0x24

    .line 38
    .line 39
    if-lt v1, v2, :cond_2

    .line 40
    .line 41
    iget v1, p0, Lq7/b;->k:I

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Lk7/a;->G(Lq7/b;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lq7/b;->g(I)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    const-string v0, "Too few bytes to read type header, available = "

    .line 51
    .line 52
    invoke-virtual {p0}, Lq7/b;->available()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-static {p0, v0}, Lj8/o;->u(ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lp7/a;->B(Lq7/b;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lp7/k;->T()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final T()V
    .locals 10

    .line 1
    iget-object v0, p0, Lp7/k;->w:Ls7/a;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-object v1, p0, Lp7/k;->s:Lr7/c;

    .line 6
    .line 7
    invoke-virtual {v1}, Lr7/c;->get()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    and-int/lit8 v1, v1, 0x3

    .line 12
    .line 13
    iget-object v0, v0, Ls7/a;->g:Ls7/b;

    .line 14
    .line 15
    iget-object v2, v0, Ls7/d;->n:Lo7/c;

    .line 16
    .line 17
    check-cast v2, Ls7/c;

    .line 18
    .line 19
    iget-object v3, v2, Lo7/b;->l:Lk7/f;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x2

    .line 24
    sget-object v7, Lr7/k;->p:Lokio/a;

    .line 25
    .line 26
    sget-object v8, Lr7/k;->n:Lokio/a;

    .line 27
    .line 28
    if-ne v3, v8, :cond_0

    .line 29
    .line 30
    move v9, v6

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-ne v3, v7, :cond_1

    .line 33
    .line 34
    move v9, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v9, v5

    .line 37
    :goto_0
    if-eq v1, v9, :cond_9

    .line 38
    .line 39
    if-ne v1, v4, :cond_4

    .line 40
    .line 41
    invoke-virtual {v0}, Ls7/d;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v2, v7}, Lo7/b;->b0(Lk7/f;)V

    .line 48
    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_2
    invoke-static {v0}, Ls7/c;->l0(Ls7/b;)Lz7/c;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget v3, v1, Lz7/c;->i:I

    .line 56
    .line 57
    invoke-virtual {v2}, Lo7/b;->N()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v7}, Lo7/b;->b0(Lk7/f;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lo7/c;->c0(I)V

    .line 64
    .line 65
    .line 66
    :goto_1
    if-ge v5, v3, :cond_3

    .line 67
    .line 68
    iget-object v6, v1, Lz7/c;->g:[Ljava/lang/Object;

    .line 69
    .line 70
    aget-object v6, v6, v5

    .line 71
    .line 72
    check-cast v6, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {v2, v5}, Lo7/b;->Q(I)Lk7/a;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    check-cast v7, Lr7/k;

    .line 79
    .line 80
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-virtual {v7, v6}, Lr7/k;->Q(I)V

    .line 85
    .line 86
    .line 87
    add-int/lit8 v5, v5, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    new-instance v1, Lce/n;

    .line 91
    .line 92
    const/16 v2, 0x1b

    .line 93
    .line 94
    invoke-direct {v1, v2}, Lce/n;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Lo7/b;->removeIf(Ljava/util/function/Predicate;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    sget-object v5, Lr7/k;->o:Lokio/a;

    .line 102
    .line 103
    if-ne v3, v7, :cond_6

    .line 104
    .line 105
    if-ne v1, v6, :cond_5

    .line 106
    .line 107
    invoke-virtual {v2, v0, v8}, Ls7/c;->k0(Ls7/b;Lk7/f;)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_5
    invoke-virtual {v2, v0, v5}, Ls7/c;->k0(Ls7/b;Lk7/f;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    if-ne v1, v6, :cond_7

    .line 116
    .line 117
    invoke-virtual {v2, v8}, Lo7/b;->b0(Lk7/f;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    invoke-virtual {v2, v5}, Lo7/b;->b0(Lk7/f;)V

    .line 122
    .line 123
    .line 124
    :goto_2
    invoke-virtual {v0}, Ls7/d;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-nez v1, :cond_8

    .line 129
    .line 130
    invoke-virtual {v2}, Lo7/b;->N()V

    .line 131
    .line 132
    .line 133
    :cond_8
    :goto_3
    invoke-virtual {v0}, Ls7/d;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    xor-int/lit8 v5, v1, 0x1

    .line 138
    .line 139
    :cond_9
    if-eqz v5, :cond_a

    .line 140
    .line 141
    invoke-virtual {v0}, Ls7/d;->j0()I

    .line 142
    .line 143
    .line 144
    :cond_a
    return-void
.end method

.method public final V(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp7/k;->s:Lr7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr7/c;->get()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    and-int/lit8 v1, v1, 0x3

    .line 8
    .line 9
    if-eq p1, v1, :cond_2

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-eq p1, v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne p1, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v0, "Invalid offset type: "

    .line 21
    .line 22
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lr7/c;->get()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    and-int/lit16 v1, v1, 0xfc

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    int-to-byte p1, p1

    .line 38
    invoke-virtual {v0, p1}, Lr7/c;->P(B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lp7/k;->T()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lp7/a;->Q()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xd

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    invoke-super {p0}, Lp7/a;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-class v1, Lp7/k;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, " {id="

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lp7/k;->r:Lr7/c;

    .line 34
    .line 35
    iget-object v1, v1, Lr7/b;->k:[B

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    aget-byte v1, v1, v2

    .line 39
    .line 40
    invoke-static {v1}, Ly7/a;->n(B)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", flags="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lp7/k;->s:Lr7/c;

    .line 53
    .line 54
    iget-object v1, v1, Lr7/b;->k:[B

    .line 55
    .line 56
    aget-byte v1, v1, v2

    .line 57
    .line 58
    invoke-static {v1}, Ly7/a;->n(B)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", count="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lp7/k;->t:Lr7/f;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", entriesStart="

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lp7/k;->u:Lr7/f;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", config="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Lp7/k;->v:Lv7/y;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const/16 v1, 0x7d

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0
.end method
