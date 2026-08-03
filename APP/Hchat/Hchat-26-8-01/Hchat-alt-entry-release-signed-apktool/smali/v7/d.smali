.class public final Lv7/d;
.super Lk7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final l:Lokio/a;


# instance fields
.field public k:Lv7/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokio/a;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lokio/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lv7/d;->l:Lokio/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 7

    .line 1
    iget v0, p1, Lq7/b;->k:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {p1, v1}, Lq7/b;->c(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lq7/b;->readShort()S

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    and-int/2addr v2, v3

    .line 13
    const/4 v4, 0x0

    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    move v2, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v2, v4

    .line 19
    :goto_0
    invoke-virtual {p1, v0}, Lq7/b;->g(I)V

    .line 20
    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    new-instance v0, Lv7/c0;

    .line 25
    .line 26
    new-instance v2, Lj7/c;

    .line 27
    .line 28
    invoke-direct {v2}, Lk7/b;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lv7/f;

    .line 32
    .line 33
    const/16 v5, 0x10

    .line 34
    .line 35
    invoke-direct {v4, v5}, Lv7/i0;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iget-object v5, v4, Lr7/b;->k:[B

    .line 39
    .line 40
    aget-byte v6, v5, v1

    .line 41
    .line 42
    and-int/lit16 v6, v6, 0xfe

    .line 43
    .line 44
    or-int/2addr v3, v6

    .line 45
    int-to-byte v3, v3

    .line 46
    aput-byte v3, v5, v1

    .line 47
    .line 48
    invoke-direct {v0, v2, v4}, Lv7/g0;-><init>(Lk7/a;Lv7/i0;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance v0, Lv7/b0;

    .line 53
    .line 54
    new-instance v1, Lv7/e;

    .line 55
    .line 56
    const/16 v2, 0x8

    .line 57
    .line 58
    invoke-direct {v1, v2}, Lv7/i0;-><init>(I)V

    .line 59
    .line 60
    .line 61
    new-instance v3, Lv7/d0;

    .line 62
    .line 63
    invoke-direct {v3, v2, v4}, Lv7/j0;-><init>(II)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, v3, v1}, Lv7/g0;-><init>(Lk7/a;Lv7/i0;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-virtual {p0, v0}, Lv7/d;->N(Lv7/g0;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final C(Ljava/io/ByteArrayOutputStream;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv7/d;->y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Lv7/d;->k:Lv7/g0;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lk7/a;->K(Ljava/io/ByteArrayOutputStream;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final I(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Lv7/d;->N(Lv7/g0;)V

    .line 5
    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public final L()I
    .locals 4

    .line 1
    iget v0, p0, Lk7/a;->g:I

    .line 2
    .line 3
    const-class v1, Ls7/b;

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ls7/b;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v1, Ls7/d;->n:Lo7/c;

    .line 14
    .line 15
    move-object v2, v1

    .line 16
    check-cast v2, Ls7/c;

    .line 17
    .line 18
    iget-object v2, v2, Lo7/b;->l:Lk7/f;

    .line 19
    .line 20
    sget-object v3, Lr7/k;->p:Lokio/a;

    .line 21
    .line 22
    if-ne v2, v3, :cond_0

    .line 23
    .line 24
    check-cast v1, Ls7/c;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lo7/b;->Q(I)Lk7/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lr7/k;

    .line 31
    .line 32
    invoke-virtual {v0}, Lr7/k;->N()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    :cond_0
    return v0
.end method

.method public final M()I
    .locals 3

    .line 1
    const-class v0, Ll7/m;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ll7/m;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const-class v1, Lo7/j;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lo7/j;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const-class v2, Ll7/f;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ll7/f;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_0
    if-nez v1, :cond_2

    .line 33
    .line 34
    :goto_1
    const/4 v0, 0x0

    .line 35
    return v0

    .line 36
    :cond_2
    invoke-virtual {v1}, Ll7/f;->U()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    shl-int/lit8 v1, v1, 0x18

    .line 41
    .line 42
    iget-object v0, v0, Ll7/a;->m:Lp7/a;

    .line 43
    .line 44
    check-cast v0, Lp7/k;

    .line 45
    .line 46
    iget-object v0, v0, Lp7/k;->r:Lr7/c;

    .line 47
    .line 48
    invoke-virtual {v0}, Lr7/c;->get()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    shl-int/lit8 v0, v0, 0x10

    .line 53
    .line 54
    or-int/2addr v0, v1

    .line 55
    invoke-virtual {p0}, Lv7/d;->L()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    or-int/2addr v0, v1

    .line 60
    return v0
.end method

.method public final N(Lv7/g0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv7/d;->k:Lv7/g0;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {v0}, Lv7/g0;->N()V

    .line 10
    .line 11
    .line 12
    const/4 v1, -0x1

    .line 13
    invoke-virtual {v0, v1}, Lk7/a;->H(I)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Lk7/a;->J(Lk7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lv7/d;->k:Lv7/g0;

    .line 21
    .line 22
    :goto_0
    if-nez p1, :cond_2

    .line 23
    .line 24
    :goto_1
    return-void

    .line 25
    :cond_2
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p1, v0}, Lk7/a;->H(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p0}, Lk7/a;->J(Lk7/a;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lv7/d;->k:Lv7/g0;

    .line 33
    .line 34
    return-void
.end method

.method public final p()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv7/d;->y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lv7/d;->k:Lv7/g0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lv7/g0;->p()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public final r()[B
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv7/d;->y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    iget-object v0, p0, Lv7/d;->k:Lv7/g0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lv7/g0;->r()[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lv7/d;->M()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    invoke-static {v1, v2}, Ly7/a;->k(II)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 v1, 0x20

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-class v2, Ll7/m;

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ll7/m;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    iget-object v3, v3, Ll7/a;->m:Lp7/a;

    .line 36
    .line 37
    check-cast v3, Lp7/k;

    .line 38
    .line 39
    iget-object v3, v3, Lp7/k;->v:Lv7/y;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v3, v4

    .line 43
    :goto_0
    if-eqz v3, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {p0, v2}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Ll7/m;

    .line 56
    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    const-class v5, Lo7/j;

    .line 60
    .line 61
    invoke-virtual {v3, v5}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lo7/j;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move-object v3, v4

    .line 69
    :goto_1
    if-eqz v3, :cond_3

    .line 70
    .line 71
    iget-object v3, v3, Lo7/j;->l:Ll7/j;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move-object v3, v4

    .line 75
    :goto_2
    if-nez v3, :cond_4

    .line 76
    .line 77
    :goto_3
    move-object v6, v4

    .line 78
    goto :goto_4

    .line 79
    :cond_4
    invoke-virtual {p0}, Lv7/d;->L()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    iget-object v3, v3, Ll7/j;->p:Lr7/b;

    .line 84
    .line 85
    check-cast v3, Lr7/p;

    .line 86
    .line 87
    const v6, 0xffff

    .line 88
    .line 89
    .line 90
    and-int/2addr v5, v6

    .line 91
    iget-object v6, v3, Lr7/b;->k:[B

    .line 92
    .line 93
    array-length v6, v6

    .line 94
    div-int/lit8 v6, v6, 0x4

    .line 95
    .line 96
    if-lt v5, v6, :cond_5

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    mul-int/lit8 v5, v5, 0x4

    .line 100
    .line 101
    new-instance v6, Lr7/e;

    .line 102
    .line 103
    const/4 v7, 0x1

    .line 104
    invoke-direct {v6, v3, v5, v7}, Lr7/e;-><init>(Lr7/b;II)V

    .line 105
    .line 106
    .line 107
    :goto_4
    if-eqz v6, :cond_6

    .line 108
    .line 109
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    :cond_6
    invoke-virtual {p0}, Lv7/d;->y()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_7

    .line 120
    .line 121
    const-string v1, "NULL "

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    :cond_7
    const/16 v1, 0x40

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v2}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    check-cast v1, Ll7/m;

    .line 136
    .line 137
    if-eqz v1, :cond_8

    .line 138
    .line 139
    invoke-virtual {v1}, Ll7/m;->V()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    goto :goto_5

    .line 144
    :cond_8
    move-object v1, v4

    .line 145
    :goto_5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const/16 v1, 0x2f

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    iget-object v1, p0, Lv7/d;->k:Lv7/g0;

    .line 154
    .line 155
    if-eqz v1, :cond_9

    .line 156
    .line 157
    iget-object v1, v1, Lv7/g0;->k:Lv7/i0;

    .line 158
    .line 159
    invoke-virtual {v1}, Lv7/i0;->N()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    goto :goto_6

    .line 164
    :cond_9
    const/4 v1, -0x1

    .line 165
    :goto_6
    if-gez v1, :cond_a

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_a
    const-class v2, Ll7/f;

    .line 169
    .line 170
    invoke-virtual {p0, v2}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    check-cast v2, Ll7/f;

    .line 175
    .line 176
    if-nez v2, :cond_b

    .line 177
    .line 178
    :goto_7
    move-object v1, v4

    .line 179
    goto :goto_8

    .line 180
    :cond_b
    iget-object v2, v2, Ll7/f;->p:Lu7/b;

    .line 181
    .line 182
    invoke-virtual {v2, v1}, Lu7/c;->V(I)Lr7/s;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    check-cast v1, Lr7/q;

    .line 187
    .line 188
    :goto_8
    if-eqz v1, :cond_c

    .line 189
    .line 190
    iget-object v4, v1, Lr7/r;->m:Ljava/lang/String;

    .line 191
    .line 192
    :cond_c
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    return-object v0
.end method

.method public final y()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/d;->k:Lv7/g0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final z(Lf6/b;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lf6/b;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p1, Lf6/b;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lk7/a;

    .line 9
    .line 10
    if-ne v0, p0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p1, Lf6/b;->b:Z

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    invoke-virtual {p0}, Lv7/d;->y()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :cond_2
    iget-object v0, p0, Lv7/d;->k:Lv7/g0;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lv7/g0;->z(Lf6/b;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
