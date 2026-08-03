.class public final synthetic Lwb/p8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lwb/z2;

.field public final synthetic h:Li0/a1;

.field public final synthetic i:F

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lwb/z2;Li0/a1;FLfg/a;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/p8;->g:Lwb/z2;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/p8;->h:Li0/a1;

    .line 7
    .line 8
    iput p3, p0, Lwb/p8;->i:F

    .line 9
    .line 10
    iput-object p4, p0, Lwb/p8;->j:Lfg/a;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/p8;->k:Li0/a1;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    check-cast v4, Li0/h0;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v13, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v13

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v8

    .line 25
    :goto_0
    and-int/2addr v1, v13

    .line 26
    invoke-virtual {v4, v1, v2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_6

    .line 31
    .line 32
    sget-object v9, Ly0/l;->a:Ly0/l;

    .line 33
    .line 34
    const/high16 v10, 0x3f800000    # 1.0f

    .line 35
    .line 36
    invoke-static {v9, v10}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget-object v2, Lp/j;->c:Lp/e;

    .line 41
    .line 42
    sget-object v3, Ly0/b;->s:Ly0/e;

    .line 43
    .line 44
    invoke-static {v2, v3, v4, v8}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-wide v5, v4, Li0/h0;->T:J

    .line 49
    .line 50
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-virtual {v4}, Li0/h0;->l()Ls0/h;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-static {v4, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget-object v6, Lx1/g;->f:Lx1/f;

    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    sget-object v6, Lx1/f;->b:Lx1/y;

    .line 68
    .line 69
    invoke-virtual {v4}, Li0/h0;->d0()V

    .line 70
    .line 71
    .line 72
    iget-boolean v7, v4, Li0/h0;->S:Z

    .line 73
    .line 74
    if-eqz v7, :cond_1

    .line 75
    .line 76
    invoke-virtual {v4, v6}, Li0/h0;->k(Lfg/a;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-virtual {v4}, Li0/h0;->n0()V

    .line 81
    .line 82
    .line 83
    :goto_1
    sget-object v6, Lx1/f;->e:Lx1/e;

    .line 84
    .line 85
    invoke-static {v6, v4, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object v2, Lx1/f;->d:Lx1/e;

    .line 89
    .line 90
    invoke-static {v2, v4, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    sget-object v3, Lx1/f;->f:Lx1/e;

    .line 98
    .line 99
    invoke-static {v3, v4, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    sget-object v2, Lx1/f;->g:Lx1/d;

    .line 103
    .line 104
    invoke-static {v2, v4}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 105
    .line 106
    .line 107
    sget-object v2, Lx1/f;->c:Lx1/e;

    .line 108
    .line 109
    invoke-static {v2, v4, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, v0, Lwb/p8;->g:Lwb/z2;

    .line 113
    .line 114
    iget-object v2, v1, Lwb/z2;->a:Lj8/i;

    .line 115
    .line 116
    iget v2, v2, Lj8/i;->b:I

    .line 117
    .line 118
    const/4 v3, 0x4

    .line 119
    iget v5, v0, Lwb/p8;->i:F

    .line 120
    .line 121
    if-ne v2, v3, :cond_4

    .line 122
    .line 123
    const v2, -0x1ecfea8

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v2}, Li0/h0;->a0(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    iget-object v3, v0, Lwb/p8;->h:Li0/a1;

    .line 134
    .line 135
    invoke-virtual {v4, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    or-int/2addr v2, v6

    .line 140
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    if-nez v2, :cond_2

    .line 145
    .line 146
    sget-object v2, Li0/l;->a:Li0/e;

    .line 147
    .line 148
    if-ne v6, v2, :cond_3

    .line 149
    .line 150
    :cond_2
    new-instance v6, Lwb/l7;

    .line 151
    .line 152
    const/4 v2, 0x4

    .line 153
    invoke-direct {v6, v1, v2, v3}, Lwb/l7;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_3
    move-object v1, v6

    .line 160
    check-cast v1, Lfg/l;

    .line 161
    .line 162
    invoke-static {v9, v10}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    const/16 v3, 0xf0

    .line 167
    .line 168
    int-to-float v3, v3

    .line 169
    invoke-static {v2, v3, v5}, Lp/h1;->f(Ly0/o;FF)Ly0/o;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const/4 v5, 0x0

    .line 174
    const/4 v6, 0x4

    .line 175
    const/4 v3, 0x0

    .line 176
    invoke-static/range {v1 .. v6}, Lx2/i;->b(Lfg/l;Ly0/o;Lfg/l;Li0/h0;II)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4, v8}, Li0/h0;->p(Z)V

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_4
    const v1, -0x1e1e0b6

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4, v1}, Li0/h0;->a0(I)V

    .line 187
    .line 188
    .line 189
    iget-object v1, v0, Lwb/p8;->k:Li0/a1;

    .line 190
    .line 191
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    check-cast v1, Lf1/g;

    .line 196
    .line 197
    if-nez v1, :cond_5

    .line 198
    .line 199
    const v1, -0x1e0ddef

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4, v1}, Li0/h0;->a0(I)V

    .line 203
    .line 204
    .line 205
    const-string v1, "\u6b63\u5728\u8f7d\u5165\u9884\u89c8..."

    .line 206
    .line 207
    const/4 v2, 0x6

    .line 208
    invoke-static {v1, v4, v2}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v4, v8}, Li0/h0;->p(Z)V

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_5
    const v2, -0x1df3697

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v2}, Li0/h0;->a0(I)V

    .line 219
    .line 220
    .line 221
    invoke-static {v9, v10}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    const/16 v3, 0xdc

    .line 226
    .line 227
    int-to-float v3, v3

    .line 228
    invoke-static {v2, v3, v5}, Lp/h1;->f(Ly0/o;FF)Ly0/o;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    const/16 v6, 0x6030

    .line 233
    .line 234
    const/16 v7, 0xe8

    .line 235
    .line 236
    const-string v2, "\u56fe\u7247\u9884\u89c8"

    .line 237
    .line 238
    move-object v5, v4

    .line 239
    sget-object v4, Lv1/g;->b:Lv1/s0;

    .line 240
    .line 241
    invoke-static/range {v1 .. v7}, Lk/n;->d(Lf1/g;Ljava/lang/String;Ly0/o;Lv1/s0;Li0/h0;II)V

    .line 242
    .line 243
    .line 244
    move-object v4, v5

    .line 245
    invoke-virtual {v4, v8}, Li0/h0;->p(Z)V

    .line 246
    .line 247
    .line 248
    :goto_2
    invoke-virtual {v4, v8}, Li0/h0;->p(Z)V

    .line 249
    .line 250
    .line 251
    :goto_3
    invoke-static {v9, v10}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 252
    .line 253
    .line 254
    move-result-object v14

    .line 255
    const/16 v1, 0xc

    .line 256
    .line 257
    int-to-float v1, v1

    .line 258
    const/16 v18, 0x0

    .line 259
    .line 260
    const/16 v19, 0xd

    .line 261
    .line 262
    const/4 v15, 0x0

    .line 263
    const/16 v17, 0x0

    .line 264
    .line 265
    move/from16 v16, v1

    .line 266
    .line 267
    invoke-static/range {v14 .. v19}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-static {v4}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    const/16 v11, 0x186

    .line 276
    .line 277
    const/16 v12, 0x778

    .line 278
    .line 279
    const-string v1, "\u5173\u95ed"

    .line 280
    .line 281
    iget-object v2, v0, Lwb/p8;->j:Lfg/a;

    .line 282
    .line 283
    move-object v5, v4

    .line 284
    const/4 v4, 0x0

    .line 285
    move-object v10, v5

    .line 286
    const/4 v5, 0x0

    .line 287
    const/4 v6, 0x0

    .line 288
    const/4 v7, 0x0

    .line 289
    const/4 v9, 0x0

    .line 290
    invoke-static/range {v1 .. v12}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 291
    .line 292
    .line 293
    move-object v4, v10

    .line 294
    invoke-virtual {v4, v13}, Li0/h0;->p(Z)V

    .line 295
    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_6
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 299
    .line 300
    .line 301
    :goto_4
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 302
    .line 303
    return-object v1
.end method
