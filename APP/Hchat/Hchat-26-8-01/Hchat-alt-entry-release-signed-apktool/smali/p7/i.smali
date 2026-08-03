.class public final Lp7/i;
.super Lp7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final r:Lr7/f;

.field public final s:Lr7/f;

.field public final t:Lr7/c;

.field public final u:Lr7/c;

.field public final v:Lr7/a;

.field public final w:Lr7/f;

.field public final x:Lr7/f;

.field public y:Lq9/a;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lp7/a;-><init>(S)V

    .line 3
    .line 4
    .line 5
    new-instance v1, Lr7/f;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v2}, Lr7/f;-><init>(Z)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lp7/i;->r:Lr7/f;

    .line 12
    .line 13
    new-instance v3, Lr7/f;

    .line 14
    .line 15
    invoke-direct {v3, v2}, Lr7/f;-><init>(Z)V

    .line 16
    .line 17
    .line 18
    iput-object v3, p0, Lp7/i;->s:Lr7/f;

    .line 19
    .line 20
    new-instance v4, Lr7/c;

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    invoke-direct {v4, v0, v5}, Lr7/c;-><init>(II)V

    .line 24
    .line 25
    .line 26
    iput-object v4, p0, Lp7/i;->t:Lr7/c;

    .line 27
    .line 28
    new-instance v5, Lr7/c;

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    invoke-direct {v5, v0, v6}, Lr7/c;-><init>(II)V

    .line 32
    .line 33
    .line 34
    iput-object v5, p0, Lp7/i;->u:Lr7/c;

    .line 35
    .line 36
    new-instance v0, Lr7/a;

    .line 37
    .line 38
    invoke-direct {v0, v6, v2}, Lr7/a;-><init>(IZ)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lp7/i;->v:Lr7/a;

    .line 42
    .line 43
    new-instance v6, Lr7/f;

    .line 44
    .line 45
    invoke-direct {v6, v2}, Lr7/f;-><init>(Z)V

    .line 46
    .line 47
    .line 48
    iput-object v6, p0, Lp7/i;->w:Lr7/f;

    .line 49
    .line 50
    new-instance v7, Lr7/f;

    .line 51
    .line 52
    invoke-direct {v7, v2}, Lr7/f;-><init>(Z)V

    .line 53
    .line 54
    .line 55
    iput-object v7, p0, Lp7/i;->x:Lr7/f;

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v3}, Lo7/d;->P(Lk7/a;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v4}, Lo7/d;->P(Lk7/a;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v5}, Lo7/d;->P(Lk7/a;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v6}, Lo7/d;->P(Lk7/a;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v7}, Lo7/d;->P(Lk7/a;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public final T(Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lp7/i;->u:Lr7/c;

    .line 2
    .line 3
    iget-object v1, v0, Lr7/b;->k:[B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-byte v1, v1, v2

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    and-int/2addr v1, v3

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    move v1, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v1, v2

    .line 15
    :goto_0
    if-eq v1, p1, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move v3, v2

    .line 19
    :goto_1
    int-to-byte v1, p1

    .line 20
    invoke-virtual {v0, v1}, Lr7/c;->P(B)V

    .line 21
    .line 22
    .line 23
    if-eqz v3, :cond_7

    .line 24
    .line 25
    iget-object v0, p0, Lp7/i;->y:Lq9/a;

    .line 26
    .line 27
    if-eqz v0, :cond_7

    .line 28
    .line 29
    iget-object v0, v0, Lq9/a;->h:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Ls7/g;

    .line 32
    .line 33
    iget-object v1, v0, Lo7/b;->k:Lz7/c;

    .line 34
    .line 35
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    move v3, v2

    .line 40
    :goto_2
    if-ge v3, v1, :cond_6

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Lo7/b;->Q(I)Lk7/a;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lr7/s;

    .line 47
    .line 48
    iget-boolean v5, v4, Lr7/s;->o:Z

    .line 49
    .line 50
    if-eq p1, v5, :cond_5

    .line 51
    .line 52
    iput-boolean p1, v4, Lr7/s;->o:Z

    .line 53
    .line 54
    invoke-virtual {v4}, Lr7/b;->p()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_5

    .line 59
    .line 60
    iget-object v5, v4, Lr7/r;->m:Ljava/lang/String;

    .line 61
    .line 62
    iput-object v5, v4, Lr7/r;->m:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Lr7/s;->V(Ljava/lang/String;)[B

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    array-length v6, v5

    .line 71
    if-nez v6, :cond_3

    .line 72
    .line 73
    :cond_2
    sget-object v5, Lr7/b;->l:[B

    .line 74
    .line 75
    :cond_3
    iget-object v6, v4, Lr7/b;->k:[B

    .line 76
    .line 77
    if-ne v5, v6, :cond_4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    iput-object v5, v4, Lr7/b;->k:[B

    .line 81
    .line 82
    :cond_5
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_6
    iput v2, v0, Ls7/g;->p:I

    .line 86
    .line 87
    :cond_7
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lp7/a;->Q()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    invoke-super {p0}, Lp7/a;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-class v1, Lp7/i;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, " {strings="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lp7/i;->r:Lr7/f;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", styles="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lp7/i;->s:Lr7/f;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", utf8="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lp7/i;->u:Lr7/c;

    .line 53
    .line 54
    iget-object v1, v1, Lr7/b;->k:[B

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    aget-byte v1, v1, v2

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    and-int/2addr v1, v3

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    move v1, v3

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move v1, v2

    .line 66
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, ", sorted="

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lp7/i;->t:Lr7/c;

    .line 75
    .line 76
    iget-object v1, v1, Lr7/b;->k:[B

    .line 77
    .line 78
    aget-byte v1, v1, v2

    .line 79
    .line 80
    and-int/2addr v1, v3

    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    move v2, v3

    .line 84
    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, ", flagExtra="

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Lp7/i;->v:Lr7/a;

    .line 93
    .line 94
    iget v1, v1, Lr7/a;->o:I

    .line 95
    .line 96
    int-to-short v1, v1

    .line 97
    invoke-static {v1}, Ly7/a;->o(S)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ", offset-strings="

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lp7/i;->w:Lr7/f;

    .line 110
    .line 111
    iget v1, v1, Lr7/f;->n:I

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ", offset-styles="

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Lp7/i;->x:Lr7/f;

    .line 122
    .line 123
    iget v1, v1, Lr7/f;->n:I

    .line 124
    .line 125
    const/16 v2, 0x7d

    .line 126
    .line 127
    invoke-static {v0, v1, v2}, Lp/a;->n(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    return-object v0
.end method
