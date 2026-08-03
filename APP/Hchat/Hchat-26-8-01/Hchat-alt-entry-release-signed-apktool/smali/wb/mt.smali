.class public final Lwb/mt;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public g:Ls1/t;

.field public h:F

.field public i:F

.field public j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:F

.field public final synthetic n:Lfg/a;

.field public final synthetic o:Lfg/a;

.field public final synthetic p:Li0/a1;


# direct methods
.method public constructor <init>(FLfg/a;Lfg/a;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/mt;->m:F

    .line 2
    .line 3
    iput-object p2, p0, Lwb/mt;->n:Lfg/a;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/mt;->o:Lfg/a;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/mt;->p:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0, p5}, Lyf/h;-><init>(Lwf/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 6

    .line 1
    new-instance v0, Lwb/mt;

    .line 2
    .line 3
    iget-object v3, p0, Lwb/mt;->o:Lfg/a;

    .line 4
    .line 5
    iget-object v4, p0, Lwb/mt;->p:Li0/a1;

    .line 6
    .line 7
    iget v1, p0, Lwb/mt;->m:F

    .line 8
    .line 9
    iget-object v2, p0, Lwb/mt;->n:Lfg/a;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lwb/mt;-><init>(FLfg/a;Lfg/a;Li0/a1;Lwf/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lwb/mt;->l:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ls1/k0;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lwb/mt;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lwb/mt;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lwb/mt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lwb/mt;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ls1/k0;

    .line 6
    .line 7
    iget v2, v0, Lwb/mt;->k:I

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v6, 0x1

    .line 11
    sget-object v7, Lxf/a;->g:Lxf/a;

    .line 12
    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eq v2, v6, :cond_1

    .line 16
    .line 17
    if-ne v2, v4, :cond_0

    .line 18
    .line 19
    iget v2, v0, Lwb/mt;->j:I

    .line 20
    .line 21
    iget v8, v0, Lwb/mt;->i:F

    .line 22
    .line 23
    iget v9, v0, Lwb/mt;->h:F

    .line 24
    .line 25
    iget-object v10, v0, Lwb/mt;->g:Ls1/t;

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object/from16 v11, p1

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_0
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    return-object v1

    .line 40
    :cond_1
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object/from16 v2, p1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iput-object v1, v0, Lwb/mt;->l:Ljava/lang/Object;

    .line 50
    .line 51
    iput v6, v0, Lwb/mt;->k:I

    .line 52
    .line 53
    invoke-static {v1, v0, v4}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-ne v2, v7, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    :goto_0
    check-cast v2, Ls1/t;

    .line 61
    .line 62
    move-object v10, v2

    .line 63
    const/4 v2, 0x0

    .line 64
    const/4 v8, 0x0

    .line 65
    const/4 v9, 0x0

    .line 66
    :goto_1
    iput-object v1, v0, Lwb/mt;->l:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object v10, v0, Lwb/mt;->g:Ls1/t;

    .line 69
    .line 70
    iput v9, v0, Lwb/mt;->h:F

    .line 71
    .line 72
    iput v8, v0, Lwb/mt;->i:F

    .line 73
    .line 74
    iput v2, v0, Lwb/mt;->j:I

    .line 75
    .line 76
    iput v4, v0, Lwb/mt;->k:I

    .line 77
    .line 78
    sget-object v11, Ls1/l;->h:Ls1/l;

    .line 79
    .line 80
    invoke-virtual {v1, v11, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    if-ne v11, v7, :cond_4

    .line 85
    .line 86
    :goto_2
    return-object v7

    .line 87
    :cond_4
    :goto_3
    check-cast v11, Ls1/k;

    .line 88
    .line 89
    iget-object v11, v11, Ls1/k;->a:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    if-eqz v12, :cond_6

    .line 100
    .line 101
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    move-object v13, v12

    .line 106
    check-cast v13, Ls1/t;

    .line 107
    .line 108
    iget-wide v13, v13, Ls1/t;->a:J

    .line 109
    .line 110
    iget-wide v3, v10, Ls1/t;->a:J

    .line 111
    .line 112
    invoke-static {v13, v14, v3, v4}, Ls1/s;->e(JJ)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_5

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_5
    const/4 v4, 0x2

    .line 120
    goto :goto_4

    .line 121
    :cond_6
    const/4 v12, 0x0

    .line 122
    :goto_5
    check-cast v12, Ls1/t;

    .line 123
    .line 124
    iget v3, v0, Lwb/mt;->m:F

    .line 125
    .line 126
    iget-object v4, v0, Lwb/mt;->p:Li0/a1;

    .line 127
    .line 128
    if-eqz v12, :cond_a

    .line 129
    .line 130
    iget-wide v13, v12, Ls1/t;->g:J

    .line 131
    .line 132
    const/4 v11, 0x0

    .line 133
    iget-wide v5, v12, Ls1/t;->c:J

    .line 134
    .line 135
    const/16 v15, 0x20

    .line 136
    .line 137
    move/from16 v16, v11

    .line 138
    .line 139
    move-object/from16 p1, v12

    .line 140
    .line 141
    shr-long v11, v5, v15

    .line 142
    .line 143
    long-to-int v11, v11

    .line 144
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    move-object v12, v1

    .line 149
    move/from16 v17, v2

    .line 150
    .line 151
    shr-long v1, v13, v15

    .line 152
    .line 153
    long-to-int v1, v1

    .line 154
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    sub-float/2addr v11, v1

    .line 159
    add-float/2addr v9, v11

    .line 160
    const-wide v1, 0xffffffffL

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    and-long/2addr v5, v1

    .line 166
    long-to-int v5, v5

    .line 167
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    and-long/2addr v1, v13

    .line 172
    long-to-int v1, v1

    .line 173
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    sub-float/2addr v5, v1

    .line 178
    add-float/2addr v8, v5

    .line 179
    if-nez v17, :cond_7

    .line 180
    .line 181
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    invoke-virtual {v12}, Ls1/k0;->B()Ly1/l2;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-interface {v2}, Ly1/l2;->f()F

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    cmpl-float v1, v1, v2

    .line 194
    .line 195
    if-lez v1, :cond_7

    .line 196
    .line 197
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    const/high16 v5, 0x3fa00000    # 1.25f

    .line 206
    .line 207
    mul-float/2addr v2, v5

    .line 208
    cmpl-float v1, v1, v2

    .line 209
    .line 210
    if-lez v1, :cond_7

    .line 211
    .line 212
    const/4 v2, 0x1

    .line 213
    goto :goto_6

    .line 214
    :cond_7
    move/from16 v2, v17

    .line 215
    .line 216
    :goto_6
    if-eqz v2, :cond_8

    .line 217
    .line 218
    neg-float v1, v3

    .line 219
    invoke-static {v9, v1, v3}, Lr9/e0;->q(FFF)F

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-interface {v4, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {p1 .. p1}, Ls1/t;->a()V

    .line 231
    .line 232
    .line 233
    :cond_8
    move-object/from16 v1, p1

    .line 234
    .line 235
    iget-boolean v1, v1, Ls1/t;->d:Z

    .line 236
    .line 237
    if-nez v1, :cond_9

    .line 238
    .line 239
    goto :goto_7

    .line 240
    :cond_9
    move-object v1, v12

    .line 241
    const/4 v4, 0x2

    .line 242
    const/4 v6, 0x1

    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :cond_a
    const/16 v16, 0x0

    .line 246
    .line 247
    :goto_7
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    check-cast v1, Ljava/lang/Number;

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    const v2, 0x3f147ae1    # 0.58f

    .line 258
    .line 259
    .line 260
    mul-float v5, v3, v2

    .line 261
    .line 262
    cmpl-float v1, v1, v5

    .line 263
    .line 264
    if-ltz v1, :cond_b

    .line 265
    .line 266
    const/4 v3, 0x1

    .line 267
    goto :goto_8

    .line 268
    :cond_b
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    check-cast v1, Ljava/lang/Number;

    .line 273
    .line 274
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    neg-float v3, v3

    .line 279
    mul-float/2addr v3, v2

    .line 280
    cmpg-float v1, v1, v3

    .line 281
    .line 282
    if-gtz v1, :cond_c

    .line 283
    .line 284
    const/4 v3, -0x1

    .line 285
    goto :goto_8

    .line 286
    :cond_c
    const/4 v3, 0x0

    .line 287
    :goto_8
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-interface {v4, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    if-lez v3, :cond_d

    .line 295
    .line 296
    iget-object v1, v0, Lwb/mt;->n:Lfg/a;

    .line 297
    .line 298
    :goto_9
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    goto :goto_a

    .line 302
    :cond_d
    if-gez v3, :cond_e

    .line 303
    .line 304
    iget-object v1, v0, Lwb/mt;->o:Lfg/a;

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_e
    :goto_a
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 308
    .line 309
    return-object v1
.end method
