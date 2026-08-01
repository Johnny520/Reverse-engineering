.class public final Lo71;
.super Lte0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lte0;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ls71;

.field public final c:Ljv;

.field public final d:I

.field public final e:Z

.field public final f:I

.field public final g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ls71;Ljv;IZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo71;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lo71;->b:Ls71;

    .line 7
    .line 8
    iput-object p3, p0, Lo71;->c:Ljv;

    .line 9
    .line 10
    iput p4, p0, Lo71;->d:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lo71;->e:Z

    .line 13
    .line 14
    iput p6, p0, Lo71;->f:I

    .line 15
    .line 16
    iput p7, p0, Lo71;->g:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final e()Loe0;
    .locals 2

    .line 1
    new-instance v0, Lr71;

    .line 2
    .line 3
    invoke-direct {v0}, Loe0;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lo71;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v1, v0, Lr71;->r:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Lo71;->b:Ls71;

    .line 11
    .line 12
    iput-object v1, v0, Lr71;->s:Ls71;

    .line 13
    .line 14
    iget-object v1, p0, Lo71;->c:Ljv;

    .line 15
    .line 16
    iput-object v1, v0, Lr71;->t:Ljv;

    .line 17
    .line 18
    iget v1, p0, Lo71;->d:I

    .line 19
    .line 20
    iput v1, v0, Lr71;->u:I

    .line 21
    .line 22
    iget-boolean v1, p0, Lo71;->e:Z

    .line 23
    .line 24
    iput-boolean v1, v0, Lr71;->v:Z

    .line 25
    .line 26
    iget v1, p0, Lo71;->f:I

    .line 27
    .line 28
    iput v1, v0, Lr71;->w:I

    .line 29
    .line 30
    iget p0, p0, Lo71;->g:I

    .line 31
    .line 32
    iput p0, v0, Lr71;->x:I

    .line 33
    .line 34
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lo71;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lo71;

    .line 10
    .line 11
    iget-object v0, p0, Lo71;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lo71;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-object v0, p0, Lo71;->b:Ls71;

    .line 23
    .line 24
    iget-object v1, p1, Lo71;->b:Ls71;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    iget-object v0, p0, Lo71;->c:Ljv;

    .line 34
    .line 35
    iget-object v1, p1, Lo71;->c:Ljv;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_4
    iget v0, p0, Lo71;->d:I

    .line 45
    .line 46
    iget v1, p1, Lo71;->d:I

    .line 47
    .line 48
    if-ne v0, v1, :cond_8

    .line 49
    .line 50
    iget-boolean v0, p0, Lo71;->e:Z

    .line 51
    .line 52
    iget-boolean v1, p1, Lo71;->e:Z

    .line 53
    .line 54
    if-eq v0, v1, :cond_5

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_5
    iget v0, p0, Lo71;->f:I

    .line 58
    .line 59
    iget v1, p1, Lo71;->f:I

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_6
    iget p0, p0, Lo71;->g:I

    .line 65
    .line 66
    iget p1, p1, Lo71;->g:I

    .line 67
    .line 68
    if-eq p0, p1, :cond_7

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_7
    :goto_0
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_8
    :goto_1
    const/4 p0, 0x0

    .line 74
    return p0
.end method

.method public final f(Loe0;)V
    .locals 10

    .line 1
    check-cast p1, Lr71;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lr71;->s:Ls71;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    iget-object v3, p0, Lo71;->b:Ls71;

    .line 11
    .line 12
    if-eq v3, v0, :cond_1

    .line 13
    .line 14
    iget-object v4, v3, Ls71;->a:Lj31;

    .line 15
    .line 16
    iget-object v0, v0, Ls71;->a:Lj31;

    .line 17
    .line 18
    invoke-virtual {v4, v0}, Lj31;->b(Lj31;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    :goto_0
    move v0, v1

    .line 31
    :goto_1
    iget-object v4, p1, Lr71;->r:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v5, p0, Lo71;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v4, v5}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    move v4, v1

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    iput-object v5, p1, Lr71;->r:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    iput-object v4, p1, Lr71;->B:Lq71;

    .line 47
    .line 48
    move v4, v2

    .line 49
    :goto_2
    iget-object v5, p1, Lr71;->s:Ls71;

    .line 50
    .line 51
    if-eq v5, v3, :cond_3

    .line 52
    .line 53
    iget-object v6, v5, Ls71;->b:Lap0;

    .line 54
    .line 55
    iget-object v7, v3, Ls71;->b:Lap0;

    .line 56
    .line 57
    invoke-static {v6, v7}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    iget-object v5, v5, Ls71;->a:Lj31;

    .line 64
    .line 65
    iget-object v6, v3, Ls71;->a:Lj31;

    .line 66
    .line 67
    invoke-virtual {v5, v6}, Lj31;->a(Lj31;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    :goto_3
    move v1, v2

    .line 78
    :cond_4
    xor-int/2addr v1, v2

    .line 79
    iput-object v3, p1, Lr71;->s:Ls71;

    .line 80
    .line 81
    iget v3, p1, Lr71;->x:I

    .line 82
    .line 83
    iget v5, p0, Lo71;->g:I

    .line 84
    .line 85
    if-eq v3, v5, :cond_5

    .line 86
    .line 87
    iput v5, p1, Lr71;->x:I

    .line 88
    .line 89
    move v1, v2

    .line 90
    :cond_5
    iget v3, p1, Lr71;->w:I

    .line 91
    .line 92
    iget v5, p0, Lo71;->f:I

    .line 93
    .line 94
    if-eq v3, v5, :cond_6

    .line 95
    .line 96
    iput v5, p1, Lr71;->w:I

    .line 97
    .line 98
    move v1, v2

    .line 99
    :cond_6
    iget-boolean v3, p1, Lr71;->v:Z

    .line 100
    .line 101
    iget-boolean v5, p0, Lo71;->e:Z

    .line 102
    .line 103
    if-eq v3, v5, :cond_7

    .line 104
    .line 105
    iput-boolean v5, p1, Lr71;->v:Z

    .line 106
    .line 107
    move v1, v2

    .line 108
    :cond_7
    iget-object v3, p1, Lr71;->t:Ljv;

    .line 109
    .line 110
    iget-object v5, p0, Lo71;->c:Ljv;

    .line 111
    .line 112
    invoke-static {v3, v5}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-nez v3, :cond_8

    .line 117
    .line 118
    iput-object v5, p1, Lr71;->t:Ljv;

    .line 119
    .line 120
    move v1, v2

    .line 121
    :cond_8
    iget v3, p1, Lr71;->u:I

    .line 122
    .line 123
    iget p0, p0, Lo71;->d:I

    .line 124
    .line 125
    if-ne v3, p0, :cond_9

    .line 126
    .line 127
    move v2, v1

    .line 128
    goto :goto_4

    .line 129
    :cond_9
    iput p0, p1, Lr71;->u:I

    .line 130
    .line 131
    :goto_4
    if-nez v4, :cond_a

    .line 132
    .line 133
    if-eqz v2, :cond_b

    .line 134
    .line 135
    :cond_a
    invoke-virtual {p1}, Lr71;->w0()Lzo0;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    iget-object v1, p1, Lr71;->r:Ljava/lang/String;

    .line 140
    .line 141
    iget-object v3, p1, Lr71;->s:Ls71;

    .line 142
    .line 143
    iget-object v5, p1, Lr71;->t:Ljv;

    .line 144
    .line 145
    iget v6, p1, Lr71;->u:I

    .line 146
    .line 147
    iget-boolean v7, p1, Lr71;->v:Z

    .line 148
    .line 149
    iget v8, p1, Lr71;->w:I

    .line 150
    .line 151
    iget v9, p1, Lr71;->x:I

    .line 152
    .line 153
    iput-object v1, p0, Lzo0;->a:Ljava/lang/String;

    .line 154
    .line 155
    iput-object v3, p0, Lzo0;->b:Ls71;

    .line 156
    .line 157
    iput-object v5, p0, Lzo0;->c:Ljv;

    .line 158
    .line 159
    iput v6, p0, Lzo0;->d:I

    .line 160
    .line 161
    iput-boolean v7, p0, Lzo0;->e:Z

    .line 162
    .line 163
    iput v8, p0, Lzo0;->f:I

    .line 164
    .line 165
    iput v9, p0, Lzo0;->g:I

    .line 166
    .line 167
    iget-wide v5, p0, Lzo0;->s:J

    .line 168
    .line 169
    const/4 v1, 0x2

    .line 170
    shl-long/2addr v5, v1

    .line 171
    const-wide/16 v7, 0x2

    .line 172
    .line 173
    or-long/2addr v5, v7

    .line 174
    iput-wide v5, p0, Lzo0;->s:J

    .line 175
    .line 176
    invoke-virtual {p0}, Lzo0;->c()V

    .line 177
    .line 178
    .line 179
    :cond_b
    iget-boolean p0, p1, Loe0;->q:Z

    .line 180
    .line 181
    if-nez p0, :cond_c

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_c
    if-nez v4, :cond_d

    .line 185
    .line 186
    if-eqz v0, :cond_e

    .line 187
    .line 188
    iget-object p0, p1, Lr71;->A:Lp71;

    .line 189
    .line 190
    if-eqz p0, :cond_e

    .line 191
    .line 192
    :cond_d
    invoke-static {p1}, Lz60;->D(Lvz0;)V

    .line 193
    .line 194
    .line 195
    :cond_e
    if-nez v4, :cond_f

    .line 196
    .line 197
    if-eqz v2, :cond_10

    .line 198
    .line 199
    :cond_f
    invoke-static {p1}, Lv50;->m(Lr50;)V

    .line 200
    .line 201
    .line 202
    invoke-static {p1}, Lkl;->r(Ltq;)V

    .line 203
    .line 204
    .line 205
    :cond_10
    if-eqz v0, :cond_11

    .line 206
    .line 207
    invoke-static {p1}, Lkl;->r(Ltq;)V

    .line 208
    .line 209
    .line 210
    :cond_11
    :goto_5
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lo71;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lo71;->b:Ls71;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lt1;->e(Ls71;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lo71;->c:Ljv;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget v0, p0, Lo71;->d:I

    .line 25
    .line 26
    invoke-static {v0, v2, v1}, Lt1;->b(III)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, Lo71;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Lt1;->c(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget v2, p0, Lo71;->f:I

    .line 37
    .line 38
    add-int/2addr v0, v2

    .line 39
    mul-int/2addr v0, v1

    .line 40
    iget p0, p0, Lo71;->g:I

    .line 41
    .line 42
    add-int/2addr v0, p0

    .line 43
    mul-int/2addr v0, v1

    .line 44
    return v0
.end method
