.class public final Lv80;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lyd0;


# instance fields
.field public final a:Lw80;

.field public final b:I

.field public final c:Z

.field public final d:F

.field public final e:Lyd0;

.field public final f:F

.field public final g:Z

.field public final h:Lyk;

.field public final i:Lym;

.field public final j:J

.field public final k:Ljava/util/List;

.field public final l:I

.field public final m:I

.field public final n:I

.field public final o:Lum0;

.field public final p:I

.field public final q:I


# direct methods
.method public constructor <init>(Lw80;IZFLyd0;FZLyk;Lym;JLjava/util/List;IIILum0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv80;->a:Lw80;

    .line 5
    .line 6
    iput p2, p0, Lv80;->b:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lv80;->c:Z

    .line 9
    .line 10
    iput p4, p0, Lv80;->d:F

    .line 11
    .line 12
    iput-object p5, p0, Lv80;->e:Lyd0;

    .line 13
    .line 14
    iput p6, p0, Lv80;->f:F

    .line 15
    .line 16
    iput-boolean p7, p0, Lv80;->g:Z

    .line 17
    .line 18
    iput-object p8, p0, Lv80;->h:Lyk;

    .line 19
    .line 20
    iput-object p9, p0, Lv80;->i:Lym;

    .line 21
    .line 22
    iput-wide p10, p0, Lv80;->j:J

    .line 23
    .line 24
    iput-object p12, p0, Lv80;->k:Ljava/util/List;

    .line 25
    .line 26
    iput p13, p0, Lv80;->l:I

    .line 27
    .line 28
    iput p14, p0, Lv80;->m:I

    .line 29
    .line 30
    iput p15, p0, Lv80;->n:I

    .line 31
    .line 32
    move-object/from16 p1, p16

    .line 33
    .line 34
    iput-object p1, p0, Lv80;->o:Lum0;

    .line 35
    .line 36
    move/from16 p1, p17

    .line 37
    .line 38
    iput p1, p0, Lv80;->p:I

    .line 39
    .line 40
    move/from16 p1, p18

    .line 41
    .line 42
    iput p1, p0, Lv80;->q:I

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lv80;->e:Lyd0;

    .line 2
    .line 3
    invoke-interface {p0}, Lyd0;->a()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final b()V
    .locals 0

    .line 1
    iget-object p0, p0, Lv80;->e:Lyd0;

    .line 2
    .line 3
    invoke-interface {p0}, Lyd0;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c()I
    .locals 0

    .line 1
    iget-object p0, p0, Lv80;->e:Lyd0;

    .line 2
    .line 3
    invoke-interface {p0}, Lyd0;->c()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final d()Lsw;
    .locals 0

    .line 1
    iget-object p0, p0, Lv80;->e:Lyd0;

    .line 2
    .line 3
    invoke-interface {p0}, Lyd0;->d()Lsw;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final e()I
    .locals 0

    .line 1
    iget-object p0, p0, Lv80;->e:Lyd0;

    .line 2
    .line 3
    invoke-interface {p0}, Lyd0;->e()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final f(IZ)Lv80;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Lv80;->g:Z

    .line 6
    .line 7
    if-nez v2, :cond_9

    .line 8
    .line 9
    iget-object v15, v0, Lv80;->k:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_9

    .line 16
    .line 17
    iget-object v2, v0, Lv80;->a:Lw80;

    .line 18
    .line 19
    if-eqz v2, :cond_9

    .line 20
    .line 21
    iget v2, v2, Lw80;->k:I

    .line 22
    .line 23
    iget v3, v0, Lv80;->b:I

    .line 24
    .line 25
    sub-int v5, v3, v1

    .line 26
    .line 27
    if-ltz v5, :cond_9

    .line 28
    .line 29
    if-ge v5, v2, :cond_9

    .line 30
    .line 31
    invoke-static {v15}, Lye;->J(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lw80;

    .line 36
    .line 37
    invoke-static {v15}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lw80;

    .line 42
    .line 43
    iget-boolean v4, v2, Lw80;->m:Z

    .line 44
    .line 45
    if-nez v4, :cond_9

    .line 46
    .line 47
    iget-boolean v4, v3, Lw80;->m:Z

    .line 48
    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    goto/16 :goto_8

    .line 52
    .line 53
    :cond_0
    iget v4, v2, Lw80;->i:I

    .line 54
    .line 55
    iget v6, v0, Lv80;->m:I

    .line 56
    .line 57
    iget v7, v0, Lv80;->l:I

    .line 58
    .line 59
    if-gez v1, :cond_1

    .line 60
    .line 61
    iget v2, v2, Lw80;->k:I

    .line 62
    .line 63
    add-int/2addr v4, v2

    .line 64
    sub-int/2addr v4, v7

    .line 65
    iget v2, v3, Lw80;->i:I

    .line 66
    .line 67
    iget v3, v3, Lw80;->k:I

    .line 68
    .line 69
    add-int/2addr v2, v3

    .line 70
    sub-int/2addr v2, v6

    .line 71
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    neg-int v3, v1

    .line 76
    if-le v2, v3, :cond_9

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    sub-int/2addr v7, v4

    .line 80
    iget v2, v3, Lw80;->i:I

    .line 81
    .line 82
    sub-int/2addr v6, v2

    .line 83
    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-le v2, v1, :cond_9

    .line 88
    .line 89
    :goto_0
    invoke-interface {v15}, Ljava/util/Collection;->size()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    const/4 v3, 0x0

    .line 94
    move v4, v3

    .line 95
    :goto_1
    if-ge v4, v2, :cond_6

    .line 96
    .line 97
    invoke-interface {v15, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, Lw80;

    .line 102
    .line 103
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v7, v6, Lw80;->o:[I

    .line 107
    .line 108
    iget-boolean v8, v6, Lw80;->m:Z

    .line 109
    .line 110
    if-eqz v8, :cond_2

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_2
    iget v8, v6, Lw80;->i:I

    .line 114
    .line 115
    add-int/2addr v8, v1

    .line 116
    iput v8, v6, Lw80;->i:I

    .line 117
    .line 118
    array-length v8, v7

    .line 119
    move v9, v3

    .line 120
    :goto_2
    if-ge v9, v8, :cond_4

    .line 121
    .line 122
    and-int/lit8 v10, v9, 0x1

    .line 123
    .line 124
    if-nez v10, :cond_3

    .line 125
    .line 126
    aget v10, v7, v9

    .line 127
    .line 128
    add-int/2addr v10, v1

    .line 129
    aput v10, v7, v9

    .line 130
    .line 131
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    if-eqz p2, :cond_5

    .line 135
    .line 136
    iget-object v7, v6, Lw80;->b:Ljava/util/List;

    .line 137
    .line 138
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    move v8, v3

    .line 143
    :goto_3
    if-ge v8, v7, :cond_5

    .line 144
    .line 145
    iget-object v9, v6, Lw80;->h:Ll70;

    .line 146
    .line 147
    iget-object v10, v6, Lw80;->f:Ljava/lang/Object;

    .line 148
    .line 149
    iget-object v9, v9, Ll70;->a:Ljh0;

    .line 150
    .line 151
    invoke-virtual {v9, v10}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    invoke-static {v9}, Lt1;->r(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    add-int/lit8 v8, v8, 0x1

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_5
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_6
    new-instance v2, Lv80;

    .line 165
    .line 166
    iget-boolean v4, v0, Lv80;->c:Z

    .line 167
    .line 168
    if-nez v4, :cond_8

    .line 169
    .line 170
    if-lez v1, :cond_7

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_7
    :goto_5
    move v6, v3

    .line 174
    goto :goto_7

    .line 175
    :cond_8
    :goto_6
    const/4 v3, 0x1

    .line 176
    goto :goto_5

    .line 177
    :goto_7
    int-to-float v7, v1

    .line 178
    iget v1, v0, Lv80;->p:I

    .line 179
    .line 180
    iget v3, v0, Lv80;->q:I

    .line 181
    .line 182
    iget-object v4, v0, Lv80;->a:Lw80;

    .line 183
    .line 184
    iget-object v8, v0, Lv80;->e:Lyd0;

    .line 185
    .line 186
    iget v9, v0, Lv80;->f:F

    .line 187
    .line 188
    iget-boolean v10, v0, Lv80;->g:Z

    .line 189
    .line 190
    iget-object v11, v0, Lv80;->h:Lyk;

    .line 191
    .line 192
    iget-object v12, v0, Lv80;->i:Lym;

    .line 193
    .line 194
    iget-wide v13, v0, Lv80;->j:J

    .line 195
    .line 196
    move/from16 v20, v1

    .line 197
    .line 198
    iget v1, v0, Lv80;->l:I

    .line 199
    .line 200
    move/from16 v16, v1

    .line 201
    .line 202
    iget v1, v0, Lv80;->m:I

    .line 203
    .line 204
    move/from16 v17, v1

    .line 205
    .line 206
    iget v1, v0, Lv80;->n:I

    .line 207
    .line 208
    iget-object v0, v0, Lv80;->o:Lum0;

    .line 209
    .line 210
    move-object/from16 v19, v0

    .line 211
    .line 212
    move/from16 v18, v1

    .line 213
    .line 214
    move/from16 v21, v3

    .line 215
    .line 216
    move-object v3, v2

    .line 217
    invoke-direct/range {v3 .. v21}, Lv80;-><init>(Lw80;IZFLyd0;FZLyk;Lym;JLjava/util/List;IIILum0;II)V

    .line 218
    .line 219
    .line 220
    return-object v3

    .line 221
    :cond_9
    :goto_8
    const/4 v0, 0x0

    .line 222
    return-object v0
.end method

.method public final g()J
    .locals 6

    .line 1
    iget-object p0, p0, Lv80;->e:Lyd0;

    .line 2
    .line 3
    invoke-interface {p0}, Lyd0;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, Lyd0;->c()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    int-to-long v0, v0

    .line 12
    const/16 v2, 0x20

    .line 13
    .line 14
    shl-long/2addr v0, v2

    .line 15
    int-to-long v2, p0

    .line 16
    const-wide v4, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr v2, v4

    .line 22
    or-long/2addr v0, v2

    .line 23
    return-wide v0
.end method
