.class public final synthetic Lwb/ya;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lsh/x;

.field public final synthetic h:Lr/z;

.field public final synthetic i:Lvb/a;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Landroid/content/SharedPreferences;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Z

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Landroid/content/Context;

.field public final synthetic u:Li0/a1;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Li0/a1;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lsh/x;Lr/z;Lvb/a;Li0/a1;Landroid/content/SharedPreferences;Ljava/lang/String;ZLi0/a1;Ljava/lang/String;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Landroid/content/Context;Li0/a1;Ljava/lang/String;Li0/a1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/ya;->g:Lsh/x;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/ya;->h:Lr/z;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/ya;->i:Lvb/a;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/ya;->j:Li0/a1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/ya;->k:Landroid/content/SharedPreferences;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/ya;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p7, p0, Lwb/ya;->m:Z

    .line 17
    .line 18
    iput-object p8, p0, Lwb/ya;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/ya;->o:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/ya;->p:Li0/a1;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/ya;->q:Li0/a1;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/ya;->r:Li0/a1;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/ya;->s:Li0/a1;

    .line 29
    .line 30
    iput-object p14, p0, Lwb/ya;->t:Landroid/content/Context;

    .line 31
    .line 32
    iput-object p15, p0, Lwb/ya;->u:Li0/a1;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lwb/ya;->v:Ljava/lang/String;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lwb/ya;->w:Li0/a1;

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, Lwb/ya;->x:Ljava/lang/String;

    .line 45
    .line 46
    move-object/from16 p1, p19

    .line 47
    .line 48
    iput-object p1, p0, Lwb/ya;->y:Ljava/lang/String;

    .line 49
    .line 50
    move-object/from16 p1, p20

    .line 51
    .line 52
    iput-object p1, p0, Lwb/ya;->z:Ljava/lang/String;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lp/x0;

    .line 6
    .line 7
    move-object/from16 v11, p2

    .line 8
    .line 9
    check-cast v11, Li0/h0;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v3, v2, 0x6

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v3, 0x2

    .line 35
    :goto_0
    or-int/2addr v2, v3

    .line 36
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 37
    .line 38
    const/16 v4, 0x12

    .line 39
    .line 40
    const/4 v6, 0x1

    .line 41
    if-eq v3, v4, :cond_2

    .line 42
    .line 43
    move v3, v6

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const/4 v3, 0x0

    .line 46
    :goto_1
    and-int/2addr v2, v6

    .line 47
    invoke-virtual {v11, v2, v3}, Li0/h0;->S(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_5

    .line 52
    .line 53
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 54
    .line 55
    iget-object v3, v0, Lwb/ya;->g:Lsh/x;

    .line 56
    .line 57
    iget-object v3, v3, Lsh/x;->e:Lm/a;

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-static {v2, v3, v4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v1}, Lp/x0;->c()F

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    const/16 v4, 0x8

    .line 69
    .line 70
    int-to-float v4, v4

    .line 71
    add-float/2addr v3, v4

    .line 72
    invoke-interface {v1}, Lp/x0;->a()F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/16 v4, 0x54

    .line 77
    .line 78
    int-to-float v4, v4

    .line 79
    add-float/2addr v1, v4

    .line 80
    const/4 v4, 0x5

    .line 81
    invoke-static {v3, v1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    iget-object v14, v0, Lwb/ya;->i:Lvb/a;

    .line 86
    .line 87
    invoke-virtual {v11, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    iget-object v15, v0, Lwb/ya;->j:Li0/a1;

    .line 92
    .line 93
    invoke-virtual {v11, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    or-int/2addr v1, v3

    .line 98
    iget-object v3, v0, Lwb/ya;->k:Landroid/content/SharedPreferences;

    .line 99
    .line 100
    invoke-virtual {v11, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    or-int/2addr v1, v6

    .line 105
    iget-object v6, v0, Lwb/ya;->l:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v11, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    or-int/2addr v1, v7

    .line 112
    iget-boolean v13, v0, Lwb/ya;->m:Z

    .line 113
    .line 114
    invoke-virtual {v11, v13}, Li0/h0;->g(Z)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    or-int/2addr v1, v7

    .line 119
    iget-object v7, v0, Lwb/ya;->n:Li0/a1;

    .line 120
    .line 121
    invoke-virtual {v11, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    or-int/2addr v1, v8

    .line 126
    iget-object v8, v0, Lwb/ya;->o:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v11, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    or-int/2addr v1, v9

    .line 133
    iget-object v9, v0, Lwb/ya;->p:Li0/a1;

    .line 134
    .line 135
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    or-int/2addr v1, v10

    .line 140
    iget-object v10, v0, Lwb/ya;->q:Li0/a1;

    .line 141
    .line 142
    invoke-virtual {v11, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    or-int/2addr v1, v12

    .line 147
    iget-object v12, v0, Lwb/ya;->r:Li0/a1;

    .line 148
    .line 149
    invoke-virtual {v11, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v16

    .line 153
    or-int v1, v1, v16

    .line 154
    .line 155
    iget-object v5, v0, Lwb/ya;->s:Li0/a1;

    .line 156
    .line 157
    invoke-virtual {v11, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v16

    .line 161
    or-int v1, v1, v16

    .line 162
    .line 163
    move/from16 p2, v1

    .line 164
    .line 165
    iget-object v1, v0, Lwb/ya;->t:Landroid/content/Context;

    .line 166
    .line 167
    invoke-virtual {v11, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v16

    .line 171
    or-int v16, p2, v16

    .line 172
    .line 173
    move-object/from16 v23, v1

    .line 174
    .line 175
    iget-object v1, v0, Lwb/ya;->u:Li0/a1;

    .line 176
    .line 177
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v17

    .line 181
    or-int v16, v16, v17

    .line 182
    .line 183
    move-object/from16 v25, v1

    .line 184
    .line 185
    iget-object v1, v0, Lwb/ya;->v:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v17

    .line 191
    or-int v16, v16, v17

    .line 192
    .line 193
    move-object/from16 v26, v1

    .line 194
    .line 195
    iget-object v1, v0, Lwb/ya;->w:Li0/a1;

    .line 196
    .line 197
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v17

    .line 201
    or-int v16, v16, v17

    .line 202
    .line 203
    move-object/from16 v27, v1

    .line 204
    .line 205
    iget-object v1, v0, Lwb/ya;->x:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v17

    .line 211
    or-int v16, v16, v17

    .line 212
    .line 213
    move-object/from16 v28, v1

    .line 214
    .line 215
    const/4 v1, 0x0

    .line 216
    invoke-virtual {v11, v1}, Li0/h0;->g(Z)Z

    .line 217
    .line 218
    .line 219
    move-result v17

    .line 220
    or-int v16, v16, v17

    .line 221
    .line 222
    iget-object v1, v0, Lwb/ya;->y:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v17

    .line 228
    or-int v16, v16, v17

    .line 229
    .line 230
    move-object/from16 v29, v1

    .line 231
    .line 232
    const/4 v1, 0x0

    .line 233
    invoke-virtual {v11, v1}, Li0/h0;->g(Z)Z

    .line 234
    .line 235
    .line 236
    move-result v17

    .line 237
    or-int v16, v16, v17

    .line 238
    .line 239
    iget-object v1, v0, Lwb/ya;->z:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v17

    .line 245
    or-int v16, v16, v17

    .line 246
    .line 247
    move-object/from16 v30, v1

    .line 248
    .line 249
    const/4 v1, 0x0

    .line 250
    invoke-virtual {v11, v1}, Li0/h0;->g(Z)Z

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    or-int v1, v16, v1

    .line 255
    .line 256
    move/from16 p1, v1

    .line 257
    .line 258
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    if-nez p1, :cond_3

    .line 263
    .line 264
    move-object/from16 p1, v2

    .line 265
    .line 266
    sget-object v2, Li0/l;->a:Li0/e;

    .line 267
    .line 268
    if-ne v1, v2, :cond_4

    .line 269
    .line 270
    :goto_2
    move-object/from16 v22, v12

    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_3
    move-object/from16 p1, v2

    .line 274
    .line 275
    goto :goto_2

    .line 276
    :goto_3
    new-instance v12, Lwb/xj;

    .line 277
    .line 278
    move-object/from16 v16, v3

    .line 279
    .line 280
    move-object/from16 v24, v5

    .line 281
    .line 282
    move-object/from16 v17, v6

    .line 283
    .line 284
    move-object/from16 v18, v7

    .line 285
    .line 286
    move-object/from16 v19, v8

    .line 287
    .line 288
    move-object/from16 v20, v9

    .line 289
    .line 290
    move-object/from16 v21, v10

    .line 291
    .line 292
    invoke-direct/range {v12 .. v30}, Lwb/xj;-><init>(ZLvb/a;Li0/a1;Landroid/content/SharedPreferences;Ljava/lang/String;Li0/a1;Ljava/lang/String;Li0/a1;Li0/a1;Li0/a1;Landroid/content/Context;Li0/a1;Li0/a1;Ljava/lang/String;Li0/a1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    move-object v1, v12

    .line 299
    :cond_4
    move-object v10, v1

    .line 300
    check-cast v10, Lfg/l;

    .line 301
    .line 302
    const/4 v12, 0x0

    .line 303
    const/16 v13, 0x1f8

    .line 304
    .line 305
    iget-object v3, v0, Lwb/ya;->h:Lr/z;

    .line 306
    .line 307
    const/4 v5, 0x0

    .line 308
    const/4 v6, 0x0

    .line 309
    const/4 v7, 0x0

    .line 310
    const/4 v8, 0x0

    .line 311
    const/4 v9, 0x0

    .line 312
    move-object/from16 v2, p1

    .line 313
    .line 314
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 315
    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_5
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 319
    .line 320
    .line 321
    :goto_4
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 322
    .line 323
    return-object v1
.end method
