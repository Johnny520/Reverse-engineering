.class public final synthetic Lk10;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lt91;

.field public final synthetic i:Lm13;

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Ltz2;

.field public final synthetic m:Lk03;

.field public final synthetic n:Lwb3;

.field public final synthetic o:Luh1;

.field public final synthetic p:Luh1;

.field public final synthetic q:Luh1;

.field public final synthetic r:Luh1;

.field public final synthetic s:Lom;

.field public final synthetic t:Lb03;

.field public final synthetic u:Z

.field public final synthetic v:Z

.field public final synthetic w:Lin0;

.field public final synthetic x:Lus1;

.field public final synthetic y:Le70;


# direct methods
.method public synthetic constructor <init>(Lt91;Lm13;IILtz2;Lk03;Lwb3;Luh1;Luh1;Luh1;Luh1;Lom;Lb03;ZZLin0;Lus1;Le70;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk10;->h:Lt91;

    iput-object p2, p0, Lk10;->i:Lm13;

    iput p3, p0, Lk10;->j:I

    iput p4, p0, Lk10;->k:I

    iput-object p5, p0, Lk10;->l:Ltz2;

    iput-object p6, p0, Lk10;->m:Lk03;

    iput-object p7, p0, Lk10;->n:Lwb3;

    iput-object p8, p0, Lk10;->o:Luh1;

    iput-object p9, p0, Lk10;->p:Luh1;

    iput-object p10, p0, Lk10;->q:Luh1;

    iput-object p11, p0, Lk10;->r:Luh1;

    iput-object p12, p0, Lk10;->s:Lom;

    iput-object p13, p0, Lk10;->t:Lb03;

    iput-boolean p14, p0, Lk10;->u:Z

    iput-boolean p15, p0, Lk10;->v:Z

    move-object/from16 p1, p16

    iput-object p1, p0, Lk10;->w:Lin0;

    move-object/from16 p1, p17

    iput-object p1, p0, Lk10;->x:Lus1;

    move-object/from16 p1, p18

    iput-object p1, p0, Lk10;->y:Le70;

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v6, v0, Lk10;->m:Lk03;

    .line 4
    .line 5
    iget-wide v1, v6, Lk03;->b:J

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    check-cast v3, Lpx;

    .line 10
    .line 11
    move-object/from16 v4, p2

    .line 12
    .line 13
    check-cast v4, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    and-int/lit8 v5, v4, 0x3

    .line 20
    .line 21
    const/4 v7, 0x1

    .line 22
    const/4 v8, 0x2

    .line 23
    if-eq v5, v8, :cond_0

    .line 24
    .line 25
    move v5, v7

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v5, 0x0

    .line 28
    :goto_0
    and-int/2addr v4, v7

    .line 29
    move-object v10, v3

    .line 30
    check-cast v10, Lgo0;

    .line 31
    .line 32
    invoke-virtual {v10, v4, v5}, Lgo0;->O(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_8

    .line 37
    .line 38
    iget-object v3, v0, Lk10;->h:Lt91;

    .line 39
    .line 40
    iget-object v4, v3, Lt91;->g:Lnx1;

    .line 41
    .line 42
    invoke-virtual {v4}, Lnx1;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lza0;

    .line 47
    .line 48
    iget v4, v4, Lza0;->h:F

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    sget-object v9, Lrh1;->a:Lrh1;

    .line 52
    .line 53
    invoke-static {v9, v4, v5, v8}, Lte;->P(Luh1;FFI)Luh1;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iget v5, v0, Lk10;->j:I

    .line 58
    .line 59
    iget v9, v0, Lk10;->k:I

    .line 60
    .line 61
    invoke-static {v5, v9}, Lop0;->C(II)V

    .line 62
    .line 63
    .line 64
    iget-object v8, v0, Lk10;->i:Lm13;

    .line 65
    .line 66
    if-ne v5, v7, :cond_1

    .line 67
    .line 68
    const v11, 0x7fffffff

    .line 69
    .line 70
    .line 71
    if-ne v9, v11, :cond_1

    .line 72
    .line 73
    :goto_1
    move-object v11, v4

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    new-instance v11, Los0;

    .line 76
    .line 77
    invoke-direct {v11, v8, v5, v9}, Los0;-><init>(Lm13;II)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v4, v11}, Luh1;->c(Luh1;)Luh1;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    goto :goto_1

    .line 85
    :goto_2
    invoke-virtual {v10, v3}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-virtual {v10}, Lgo0;->L()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    if-nez v4, :cond_2

    .line 94
    .line 95
    sget-object v4, Lnx;->a:Leb;

    .line 96
    .line 97
    if-ne v5, v4, :cond_3

    .line 98
    .line 99
    :cond_2
    new-instance v5, Lta;

    .line 100
    .line 101
    const/4 v4, 0x5

    .line 102
    invoke-direct {v5, v4, v3}, Lta;-><init>(ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v10, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    check-cast v5, Lxm0;

    .line 109
    .line 110
    iget-object v4, v0, Lk10;->l:Ltz2;

    .line 111
    .line 112
    iget-object v12, v4, Ltz2;->f:Lnx1;

    .line 113
    .line 114
    invoke-virtual {v12}, Lnx1;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v12

    .line 118
    check-cast v12, Lqv1;

    .line 119
    .line 120
    sget v13, Lf13;->c:I

    .line 121
    .line 122
    const/16 v13, 0x20

    .line 123
    .line 124
    shr-long v14, v1, v13

    .line 125
    .line 126
    long-to-int v14, v14

    .line 127
    move-object/from16 p2, v8

    .line 128
    .line 129
    iget-wide v7, v4, Ltz2;->e:J

    .line 130
    .line 131
    move-wide v15, v7

    .line 132
    shr-long v7, v15, v13

    .line 133
    .line 134
    long-to-int v7, v7

    .line 135
    if-eq v14, v7, :cond_4

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_4
    const-wide v7, 0xffffffffL

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    and-long v13, v1, v7

    .line 144
    .line 145
    long-to-int v14, v13

    .line 146
    and-long/2addr v7, v15

    .line 147
    long-to-int v7, v7

    .line 148
    if-eq v14, v7, :cond_5

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    invoke-static {v1, v2}, Lf13;->f(J)I

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    :goto_3
    iput-wide v1, v4, Ltz2;->e:J

    .line 156
    .line 157
    iget-object v1, v6, Lk03;->a:Lsd;

    .line 158
    .line 159
    iget-object v2, v0, Lk10;->n:Lwb3;

    .line 160
    .line 161
    invoke-static {v2, v1}, Ll93;->a(Lwb3;Lsd;)Lq33;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_7

    .line 170
    .line 171
    const/4 v7, 0x1

    .line 172
    if-ne v2, v7, :cond_6

    .line 173
    .line 174
    new-instance v2, Lhu0;

    .line 175
    .line 176
    invoke-direct {v2, v4, v14, v1, v5}, Lhu0;-><init>(Ltz2;ILq33;Lxm0;)V

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_6
    invoke-static {}, Lc80;->s()V

    .line 181
    .line 182
    .line 183
    const/4 v0, 0x0

    .line 184
    return-object v0

    .line 185
    :cond_7
    new-instance v2, Lma3;

    .line 186
    .line 187
    invoke-direct {v2, v4, v14, v1, v5}, Lma3;-><init>(Ltz2;ILq33;Lxm0;)V

    .line 188
    .line 189
    .line 190
    :goto_4
    const/4 v15, 0x0

    .line 191
    const v16, 0x7efff

    .line 192
    .line 193
    .line 194
    const/4 v12, 0x0

    .line 195
    const/4 v13, 0x0

    .line 196
    const/4 v14, 0x0

    .line 197
    invoke-static/range {v11 .. v16}, Lte;->N(Luh1;FFFLeq2;I)Luh1;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-interface {v1, v2}, Luh1;->c(Luh1;)Luh1;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    iget-object v2, v0, Lk10;->o:Luh1;

    .line 206
    .line 207
    invoke-interface {v1, v2}, Luh1;->c(Luh1;)Luh1;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    iget-object v2, v0, Lk10;->p:Luh1;

    .line 212
    .line 213
    invoke-interface {v1, v2}, Luh1;->c(Luh1;)Luh1;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    new-instance v2, Li03;

    .line 218
    .line 219
    move-object/from16 v4, p2

    .line 220
    .line 221
    invoke-direct {v2, v4}, Li03;-><init>(Lm13;)V

    .line 222
    .line 223
    .line 224
    invoke-interface {v1, v2}, Luh1;->c(Luh1;)Luh1;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    iget-object v2, v0, Lk10;->q:Luh1;

    .line 229
    .line 230
    invoke-interface {v1, v2}, Luh1;->c(Luh1;)Luh1;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    iget-object v2, v0, Lk10;->r:Luh1;

    .line 235
    .line 236
    invoke-interface {v1, v2}, Luh1;->c(Luh1;)Luh1;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    iget-object v2, v0, Lk10;->s:Lom;

    .line 241
    .line 242
    invoke-static {v1, v2}, Lfg1;->n(Luh1;Lom;)Luh1;

    .line 243
    .line 244
    .line 245
    move-result-object v11

    .line 246
    new-instance v1, Ll10;

    .line 247
    .line 248
    move-object v2, v1

    .line 249
    iget-object v1, v0, Lk10;->t:Lb03;

    .line 250
    .line 251
    move-object v4, v2

    .line 252
    move-object v2, v3

    .line 253
    iget-boolean v3, v0, Lk10;->u:Z

    .line 254
    .line 255
    move-object v5, v4

    .line 256
    iget-boolean v4, v0, Lk10;->v:Z

    .line 257
    .line 258
    move-object v7, v5

    .line 259
    iget-object v5, v0, Lk10;->w:Lin0;

    .line 260
    .line 261
    move-object v8, v7

    .line 262
    iget-object v7, v0, Lk10;->x:Lus1;

    .line 263
    .line 264
    iget-object v0, v0, Lk10;->y:Le70;

    .line 265
    .line 266
    move-object/from16 v17, v8

    .line 267
    .line 268
    move-object v8, v0

    .line 269
    move-object/from16 v0, v17

    .line 270
    .line 271
    invoke-direct/range {v0 .. v9}, Ll10;-><init>(Lb03;Lt91;ZZLin0;Lk03;Lus1;Le70;I)V

    .line 272
    .line 273
    .line 274
    const v1, 0x54340ce8

    .line 275
    .line 276
    .line 277
    invoke-static {v1, v0, v10}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    const/16 v1, 0x30

    .line 282
    .line 283
    invoke-static {v11, v0, v10, v1}, Lrg3;->h(Luh1;Lkw;Lpx;I)V

    .line 284
    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_8
    invoke-virtual {v10}, Lgo0;->R()V

    .line 288
    .line 289
    .line 290
    :goto_5
    sget-object v0, La83;->a:La83;

    .line 291
    .line 292
    return-object v0
.end method
