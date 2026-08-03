.class public final synthetic Lwb/ek;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lsh/x;

.field public final synthetic i:Lr/z;

.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Landroid/content/SharedPreferences;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lsh/x;Lr/z;Landroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/ek;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ek;->h:Lsh/x;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ek;->i:Lr/z;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/ek;->j:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/ek;->k:Landroid/content/SharedPreferences;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/ek;->l:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/ek;->m:Li0/a1;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/ek;->n:Li0/a1;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/ek;->o:Li0/a1;

    .line 22
    .line 23
    iput-object p9, p0, Lwb/ek;->p:Li0/a1;

    .line 24
    .line 25
    iput-object p10, p0, Lwb/ek;->q:Li0/a1;

    .line 26
    .line 27
    iput-object p11, p0, Lwb/ek;->r:Li0/a1;

    .line 28
    .line 29
    iput-object p12, p0, Lwb/ek;->s:Li0/a1;

    .line 30
    .line 31
    return-void
.end method

.method public synthetic constructor <init>(Lsh/x;Lr/z;Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lwb/ek;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/ek;->h:Lsh/x;

    iput-object p2, p0, Lwb/ek;->i:Lr/z;

    iput-object p3, p0, Lwb/ek;->k:Landroid/content/SharedPreferences;

    iput-object p4, p0, Lwb/ek;->j:Landroid/content/Context;

    iput-object p5, p0, Lwb/ek;->l:Li0/a1;

    iput-object p6, p0, Lwb/ek;->m:Li0/a1;

    iput-object p7, p0, Lwb/ek;->n:Li0/a1;

    iput-object p8, p0, Lwb/ek;->o:Li0/a1;

    iput-object p9, p0, Lwb/ek;->p:Li0/a1;

    iput-object p10, p0, Lwb/ek;->q:Li0/a1;

    iput-object p11, p0, Lwb/ek;->r:Li0/a1;

    iput-object p12, p0, Lwb/ek;->s:Li0/a1;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/ek;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lp/x0;

    .line 11
    .line 12
    move-object/from16 v11, p2

    .line 13
    .line 14
    check-cast v11, Li0/h0;

    .line 15
    .line 16
    move-object/from16 v2, p3

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v3, v2, 0x6

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v3, 0x2

    .line 40
    :goto_0
    or-int/2addr v2, v3

    .line 41
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 42
    .line 43
    const/16 v4, 0x12

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    if-eq v3, v4, :cond_2

    .line 47
    .line 48
    move v3, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 v3, 0x0

    .line 51
    :goto_1
    and-int/2addr v2, v5

    .line 52
    invoke-virtual {v11, v2, v3}, Li0/h0;->S(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 59
    .line 60
    iget-object v3, v0, Lwb/ek;->h:Lsh/x;

    .line 61
    .line 62
    iget-object v3, v3, Lsh/x;->e:Lm/a;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-static {v2, v3, v4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v1}, Lp/x0;->c()F

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    const/16 v4, 0x8

    .line 74
    .line 75
    int-to-float v4, v4

    .line 76
    add-float/2addr v3, v4

    .line 77
    invoke-interface {v1}, Lp/x0;->a()F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const/16 v4, 0x54

    .line 82
    .line 83
    int-to-float v4, v4

    .line 84
    add-float/2addr v1, v4

    .line 85
    const/4 v4, 0x5

    .line 86
    invoke-static {v3, v1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iget-object v13, v0, Lwb/ek;->j:Landroid/content/Context;

    .line 91
    .line 92
    invoke-virtual {v11, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    iget-object v15, v0, Lwb/ek;->k:Landroid/content/SharedPreferences;

    .line 97
    .line 98
    invoke-virtual {v11, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    or-int/2addr v1, v3

    .line 103
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    if-nez v1, :cond_3

    .line 108
    .line 109
    sget-object v1, Li0/l;->a:Li0/e;

    .line 110
    .line 111
    if-ne v3, v1, :cond_4

    .line 112
    .line 113
    :cond_3
    new-instance v12, Lwb/bl;

    .line 114
    .line 115
    iget-object v14, v0, Lwb/ek;->l:Li0/a1;

    .line 116
    .line 117
    iget-object v1, v0, Lwb/ek;->m:Li0/a1;

    .line 118
    .line 119
    iget-object v3, v0, Lwb/ek;->n:Li0/a1;

    .line 120
    .line 121
    iget-object v5, v0, Lwb/ek;->o:Li0/a1;

    .line 122
    .line 123
    iget-object v6, v0, Lwb/ek;->p:Li0/a1;

    .line 124
    .line 125
    iget-object v7, v0, Lwb/ek;->q:Li0/a1;

    .line 126
    .line 127
    iget-object v8, v0, Lwb/ek;->r:Li0/a1;

    .line 128
    .line 129
    iget-object v9, v0, Lwb/ek;->s:Li0/a1;

    .line 130
    .line 131
    move-object/from16 v16, v1

    .line 132
    .line 133
    move-object/from16 v17, v3

    .line 134
    .line 135
    move-object/from16 v18, v5

    .line 136
    .line 137
    move-object/from16 v19, v6

    .line 138
    .line 139
    move-object/from16 v20, v7

    .line 140
    .line 141
    move-object/from16 v21, v8

    .line 142
    .line 143
    move-object/from16 v22, v9

    .line 144
    .line 145
    invoke-direct/range {v12 .. v22}, Lwb/bl;-><init>(Landroid/content/Context;Li0/a1;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    move-object v3, v12

    .line 152
    :cond_4
    move-object v10, v3

    .line 153
    check-cast v10, Lfg/l;

    .line 154
    .line 155
    const/4 v12, 0x0

    .line 156
    const/16 v13, 0x1f8

    .line 157
    .line 158
    iget-object v3, v0, Lwb/ek;->i:Lr/z;

    .line 159
    .line 160
    const/4 v5, 0x0

    .line 161
    const/4 v6, 0x0

    .line 162
    const/4 v7, 0x0

    .line 163
    const/4 v8, 0x0

    .line 164
    const/4 v9, 0x0

    .line 165
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_5
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 170
    .line 171
    .line 172
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 173
    .line 174
    return-object v1

    .line 175
    :pswitch_0
    move-object/from16 v1, p1

    .line 176
    .line 177
    check-cast v1, Lp/x0;

    .line 178
    .line 179
    move-object/from16 v11, p2

    .line 180
    .line 181
    check-cast v11, Li0/h0;

    .line 182
    .line 183
    move-object/from16 v2, p3

    .line 184
    .line 185
    check-cast v2, Ljava/lang/Integer;

    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    and-int/lit8 v3, v2, 0x6

    .line 195
    .line 196
    if-nez v3, :cond_7

    .line 197
    .line 198
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_6

    .line 203
    .line 204
    const/4 v3, 0x4

    .line 205
    goto :goto_3

    .line 206
    :cond_6
    const/4 v3, 0x2

    .line 207
    :goto_3
    or-int/2addr v2, v3

    .line 208
    :cond_7
    and-int/lit8 v3, v2, 0x13

    .line 209
    .line 210
    const/16 v4, 0x12

    .line 211
    .line 212
    const/4 v5, 0x1

    .line 213
    if-eq v3, v4, :cond_8

    .line 214
    .line 215
    move v3, v5

    .line 216
    goto :goto_4

    .line 217
    :cond_8
    const/4 v3, 0x0

    .line 218
    :goto_4
    and-int/2addr v2, v5

    .line 219
    invoke-virtual {v11, v2, v3}, Li0/h0;->S(IZ)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-eqz v2, :cond_b

    .line 224
    .line 225
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 226
    .line 227
    iget-object v3, v0, Lwb/ek;->h:Lsh/x;

    .line 228
    .line 229
    iget-object v3, v3, Lsh/x;->e:Lm/a;

    .line 230
    .line 231
    const/4 v4, 0x0

    .line 232
    invoke-static {v2, v3, v4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-interface {v1}, Lp/x0;->c()F

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    const/16 v4, 0x8

    .line 241
    .line 242
    int-to-float v4, v4

    .line 243
    add-float/2addr v3, v4

    .line 244
    invoke-interface {v1}, Lp/x0;->a()F

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    const/16 v4, 0x54

    .line 249
    .line 250
    int-to-float v4, v4

    .line 251
    add-float/2addr v1, v4

    .line 252
    const/4 v4, 0x5

    .line 253
    invoke-static {v3, v1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    iget-object v13, v0, Lwb/ek;->k:Landroid/content/SharedPreferences;

    .line 258
    .line 259
    invoke-virtual {v11, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    iget-object v14, v0, Lwb/ek;->j:Landroid/content/Context;

    .line 264
    .line 265
    invoke-virtual {v11, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    or-int/2addr v1, v3

    .line 270
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    if-nez v1, :cond_9

    .line 275
    .line 276
    sget-object v1, Li0/l;->a:Li0/e;

    .line 277
    .line 278
    if-ne v3, v1, :cond_a

    .line 279
    .line 280
    :cond_9
    new-instance v12, Lwb/bl;

    .line 281
    .line 282
    iget-object v15, v0, Lwb/ek;->l:Li0/a1;

    .line 283
    .line 284
    iget-object v1, v0, Lwb/ek;->m:Li0/a1;

    .line 285
    .line 286
    iget-object v3, v0, Lwb/ek;->n:Li0/a1;

    .line 287
    .line 288
    iget-object v5, v0, Lwb/ek;->o:Li0/a1;

    .line 289
    .line 290
    iget-object v6, v0, Lwb/ek;->p:Li0/a1;

    .line 291
    .line 292
    iget-object v7, v0, Lwb/ek;->q:Li0/a1;

    .line 293
    .line 294
    iget-object v8, v0, Lwb/ek;->r:Li0/a1;

    .line 295
    .line 296
    iget-object v9, v0, Lwb/ek;->s:Li0/a1;

    .line 297
    .line 298
    move-object/from16 v16, v1

    .line 299
    .line 300
    move-object/from16 v17, v3

    .line 301
    .line 302
    move-object/from16 v18, v5

    .line 303
    .line 304
    move-object/from16 v19, v6

    .line 305
    .line 306
    move-object/from16 v20, v7

    .line 307
    .line 308
    move-object/from16 v21, v8

    .line 309
    .line 310
    move-object/from16 v22, v9

    .line 311
    .line 312
    invoke-direct/range {v12 .. v22}, Lwb/bl;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    move-object v3, v12

    .line 319
    :cond_a
    move-object v10, v3

    .line 320
    check-cast v10, Lfg/l;

    .line 321
    .line 322
    const/4 v12, 0x0

    .line 323
    const/16 v13, 0x1f8

    .line 324
    .line 325
    iget-object v3, v0, Lwb/ek;->i:Lr/z;

    .line 326
    .line 327
    const/4 v5, 0x0

    .line 328
    const/4 v6, 0x0

    .line 329
    const/4 v7, 0x0

    .line 330
    const/4 v8, 0x0

    .line 331
    const/4 v9, 0x0

    .line 332
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 333
    .line 334
    .line 335
    goto :goto_5

    .line 336
    :cond_b
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 337
    .line 338
    .line 339
    :goto_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 340
    .line 341
    return-object v1

    .line 342
    nop

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
