.class public abstract Lv93;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# direct methods
.method public static final a(Lar0;Lr93;)V
    .locals 7

    .line 1
    iget-object p1, p1, Lr93;->q:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_3

    .line 9
    .line 10
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lt93;

    .line 15
    .line 16
    instance-of v3, v2, Lw93;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    new-instance v3, Lwx1;

    .line 22
    .line 23
    invoke-direct {v3}, Lwx1;-><init>()V

    .line 24
    .line 25
    .line 26
    check-cast v2, Lw93;

    .line 27
    .line 28
    iget-object v5, v2, Lw93;->i:Ljava/util/List;

    .line 29
    .line 30
    iput-object v5, v3, Lwx1;->d:Ljava/util/List;

    .line 31
    .line 32
    iput-boolean v4, v3, Lwx1;->n:Z

    .line 33
    .line 34
    invoke-virtual {v3}, Li93;->c()V

    .line 35
    .line 36
    .line 37
    iget v5, v2, Lw93;->j:I

    .line 38
    .line 39
    iget-object v6, v3, Lwx1;->s:Ly9;

    .line 40
    .line 41
    iget-object v6, v6, Ly9;->a:Landroid/graphics/Path;

    .line 42
    .line 43
    if-ne v5, v4, :cond_0

    .line 44
    .line 45
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    sget-object v5, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 49
    .line 50
    :goto_1
    invoke-virtual {v6, v5}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Li93;->c()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Li93;->c()V

    .line 57
    .line 58
    .line 59
    iget-object v5, v2, Lw93;->k:Lan;

    .line 60
    .line 61
    iput-object v5, v3, Lwx1;->b:Lan;

    .line 62
    .line 63
    invoke-virtual {v3}, Li93;->c()V

    .line 64
    .line 65
    .line 66
    iget v5, v2, Lw93;->l:F

    .line 67
    .line 68
    iput v5, v3, Lwx1;->c:F

    .line 69
    .line 70
    invoke-virtual {v3}, Li93;->c()V

    .line 71
    .line 72
    .line 73
    iget-object v5, v2, Lw93;->m:Lan;

    .line 74
    .line 75
    iput-object v5, v3, Lwx1;->g:Lan;

    .line 76
    .line 77
    invoke-virtual {v3}, Li93;->c()V

    .line 78
    .line 79
    .line 80
    iget v5, v2, Lw93;->n:F

    .line 81
    .line 82
    iput v5, v3, Lwx1;->e:F

    .line 83
    .line 84
    invoke-virtual {v3}, Li93;->c()V

    .line 85
    .line 86
    .line 87
    iget v5, v2, Lw93;->o:F

    .line 88
    .line 89
    iput v5, v3, Lwx1;->f:F

    .line 90
    .line 91
    iput-boolean v4, v3, Lwx1;->o:Z

    .line 92
    .line 93
    invoke-virtual {v3}, Li93;->c()V

    .line 94
    .line 95
    .line 96
    iget v5, v2, Lw93;->p:I

    .line 97
    .line 98
    iput v5, v3, Lwx1;->h:I

    .line 99
    .line 100
    iput-boolean v4, v3, Lwx1;->o:Z

    .line 101
    .line 102
    invoke-virtual {v3}, Li93;->c()V

    .line 103
    .line 104
    .line 105
    iget v5, v2, Lw93;->q:I

    .line 106
    .line 107
    iput v5, v3, Lwx1;->i:I

    .line 108
    .line 109
    iput-boolean v4, v3, Lwx1;->o:Z

    .line 110
    .line 111
    invoke-virtual {v3}, Li93;->c()V

    .line 112
    .line 113
    .line 114
    iget v5, v2, Lw93;->r:F

    .line 115
    .line 116
    iput v5, v3, Lwx1;->j:F

    .line 117
    .line 118
    iput-boolean v4, v3, Lwx1;->o:Z

    .line 119
    .line 120
    invoke-virtual {v3}, Li93;->c()V

    .line 121
    .line 122
    .line 123
    iget v5, v2, Lw93;->s:F

    .line 124
    .line 125
    iput v5, v3, Lwx1;->k:F

    .line 126
    .line 127
    iput-boolean v4, v3, Lwx1;->p:Z

    .line 128
    .line 129
    invoke-virtual {v3}, Li93;->c()V

    .line 130
    .line 131
    .line 132
    iget v5, v2, Lw93;->t:F

    .line 133
    .line 134
    iput v5, v3, Lwx1;->l:F

    .line 135
    .line 136
    iput-boolean v4, v3, Lwx1;->p:Z

    .line 137
    .line 138
    invoke-virtual {v3}, Li93;->c()V

    .line 139
    .line 140
    .line 141
    iget v2, v2, Lw93;->u:F

    .line 142
    .line 143
    iput v2, v3, Lwx1;->m:F

    .line 144
    .line 145
    iput-boolean v4, v3, Lwx1;->p:Z

    .line 146
    .line 147
    invoke-virtual {v3}, Li93;->c()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v1, v3}, Lar0;->e(ILi93;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_1
    instance-of v3, v2, Lr93;

    .line 155
    .line 156
    if-eqz v3, :cond_2

    .line 157
    .line 158
    new-instance v3, Lar0;

    .line 159
    .line 160
    invoke-direct {v3}, Lar0;-><init>()V

    .line 161
    .line 162
    .line 163
    check-cast v2, Lr93;

    .line 164
    .line 165
    iget-object v5, v2, Lr93;->h:Ljava/lang/String;

    .line 166
    .line 167
    iput-object v5, v3, Lar0;->k:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v3}, Li93;->c()V

    .line 170
    .line 171
    .line 172
    iget v5, v2, Lr93;->i:F

    .line 173
    .line 174
    iput v5, v3, Lar0;->l:F

    .line 175
    .line 176
    iput-boolean v4, v3, Lar0;->s:Z

    .line 177
    .line 178
    invoke-virtual {v3}, Li93;->c()V

    .line 179
    .line 180
    .line 181
    iget v5, v2, Lr93;->l:F

    .line 182
    .line 183
    iput v5, v3, Lar0;->o:F

    .line 184
    .line 185
    iput-boolean v4, v3, Lar0;->s:Z

    .line 186
    .line 187
    invoke-virtual {v3}, Li93;->c()V

    .line 188
    .line 189
    .line 190
    iget v5, v2, Lr93;->m:F

    .line 191
    .line 192
    iput v5, v3, Lar0;->p:F

    .line 193
    .line 194
    iput-boolean v4, v3, Lar0;->s:Z

    .line 195
    .line 196
    invoke-virtual {v3}, Li93;->c()V

    .line 197
    .line 198
    .line 199
    iget v5, v2, Lr93;->n:F

    .line 200
    .line 201
    iput v5, v3, Lar0;->q:F

    .line 202
    .line 203
    iput-boolean v4, v3, Lar0;->s:Z

    .line 204
    .line 205
    invoke-virtual {v3}, Li93;->c()V

    .line 206
    .line 207
    .line 208
    iget v5, v2, Lr93;->o:F

    .line 209
    .line 210
    iput v5, v3, Lar0;->r:F

    .line 211
    .line 212
    iput-boolean v4, v3, Lar0;->s:Z

    .line 213
    .line 214
    invoke-virtual {v3}, Li93;->c()V

    .line 215
    .line 216
    .line 217
    iget v5, v2, Lr93;->j:F

    .line 218
    .line 219
    iput v5, v3, Lar0;->m:F

    .line 220
    .line 221
    iput-boolean v4, v3, Lar0;->s:Z

    .line 222
    .line 223
    invoke-virtual {v3}, Li93;->c()V

    .line 224
    .line 225
    .line 226
    iget v5, v2, Lr93;->k:F

    .line 227
    .line 228
    iput v5, v3, Lar0;->n:F

    .line 229
    .line 230
    iput-boolean v4, v3, Lar0;->s:Z

    .line 231
    .line 232
    invoke-virtual {v3}, Li93;->c()V

    .line 233
    .line 234
    .line 235
    iget-object v5, v2, Lr93;->p:Ljava/util/List;

    .line 236
    .line 237
    iput-object v5, v3, Lar0;->f:Ljava/util/List;

    .line 238
    .line 239
    iput-boolean v4, v3, Lar0;->g:Z

    .line 240
    .line 241
    invoke-virtual {v3}, Li93;->c()V

    .line 242
    .line 243
    .line 244
    invoke-static {v3, v2}, Lv93;->a(Lar0;Lr93;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, v1, v3}, Lar0;->e(ILi93;)V

    .line 248
    .line 249
    .line 250
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_3
    return-void
.end method

.method public static final b()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public static final c(Lsx0;Lpx;)Lu93;
    .locals 12

    .line 1
    sget-object v0, Lly;->h:Ltu2;

    .line 2
    .line 3
    check-cast p1, Lgo0;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Le70;

    .line 10
    .line 11
    iget v1, p0, Lsx0;->j:I

    .line 12
    .line 13
    int-to-float v1, v1

    .line 14
    invoke-interface {v0}, Le70;->b()F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-long v3, v1

    .line 23
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    int-to-long v1, v1

    .line 28
    const/16 v5, 0x20

    .line 29
    .line 30
    shl-long/2addr v3, v5

    .line 31
    const-wide v6, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v1, v6

    .line 37
    or-long/2addr v1, v3

    .line 38
    invoke-virtual {p1, v1, v2}, Lgo0;->e(J)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p1}, Lgo0;->L()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    sget-object v1, Lnx;->a:Leb;

    .line 49
    .line 50
    if-ne v2, v1, :cond_4

    .line 51
    .line 52
    :cond_0
    new-instance v1, Lar0;

    .line 53
    .line 54
    invoke-direct {v1}, Lar0;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-object v2, p0, Lsx0;->f:Lr93;

    .line 58
    .line 59
    invoke-static {v1, v2}, Lv93;->a(Lar0;Lr93;)V

    .line 60
    .line 61
    .line 62
    iget v2, p0, Lsx0;->b:F

    .line 63
    .line 64
    iget v3, p0, Lsx0;->c:F

    .line 65
    .line 66
    invoke-interface {v0, v2}, Le70;->A(F)F

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-interface {v0, v3}, Le70;->A(F)F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    int-to-long v2, v2

    .line 79
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    int-to-long v8, v0

    .line 84
    shl-long/2addr v2, v5

    .line 85
    and-long/2addr v8, v6

    .line 86
    or-long/2addr v2, v8

    .line 87
    iget v0, p0, Lsx0;->d:F

    .line 88
    .line 89
    iget v4, p0, Lsx0;->e:F

    .line 90
    .line 91
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_1

    .line 96
    .line 97
    shr-long v8, v2, v5

    .line 98
    .line 99
    long-to-int v0, v8

    .line 100
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    :cond_1
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    if-eqz v8, :cond_2

    .line 109
    .line 110
    and-long v8, v2, v6

    .line 111
    .line 112
    long-to-int v4, v8

    .line 113
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    :cond_2
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    int-to-long v8, v0

    .line 122
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    int-to-long v10, v0

    .line 127
    shl-long v4, v8, v5

    .line 128
    .line 129
    and-long/2addr v6, v10

    .line 130
    or-long/2addr v4, v6

    .line 131
    new-instance v0, Lu93;

    .line 132
    .line 133
    invoke-direct {v0, v1}, Lu93;-><init>(Lar0;)V

    .line 134
    .line 135
    .line 136
    iget-object v1, p0, Lsx0;->a:Ljava/lang/String;

    .line 137
    .line 138
    iget-wide v6, p0, Lsx0;->g:J

    .line 139
    .line 140
    iget v8, p0, Lsx0;->h:I

    .line 141
    .line 142
    const-wide/16 v9, 0x10

    .line 143
    .line 144
    cmp-long v9, v6, v9

    .line 145
    .line 146
    if-eqz v9, :cond_3

    .line 147
    .line 148
    new-instance v9, Lcl;

    .line 149
    .line 150
    invoke-direct {v9, v6, v7, v8}, Lcl;-><init>(JI)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_3
    const/4 v9, 0x0

    .line 155
    :goto_0
    iget-boolean p0, p0, Lsx0;->i:Z

    .line 156
    .line 157
    new-instance v6, Lgr2;

    .line 158
    .line 159
    invoke-direct {v6, v2, v3}, Lgr2;-><init>(J)V

    .line 160
    .line 161
    .line 162
    iget-object v2, v0, Lu93;->e:Lnx1;

    .line 163
    .line 164
    invoke-virtual {v2, v6}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    iget-object v2, v0, Lu93;->f:Lnx1;

    .line 168
    .line 169
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {v2, p0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iget-object p0, v0, Lu93;->g:Lq93;

    .line 177
    .line 178
    iget-object v2, p0, Lq93;->g:Lnx1;

    .line 179
    .line 180
    invoke-virtual {v2, v9}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    iget-object v2, p0, Lq93;->i:Lnx1;

    .line 184
    .line 185
    new-instance v3, Lgr2;

    .line 186
    .line 187
    invoke-direct {v3, v4, v5}, Lgr2;-><init>(J)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v3}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iput-object v1, p0, Lq93;->c:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {p1, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    move-object v2, v0

    .line 199
    :cond_4
    check-cast v2, Lu93;

    .line 200
    .line 201
    return-object v2
.end method
