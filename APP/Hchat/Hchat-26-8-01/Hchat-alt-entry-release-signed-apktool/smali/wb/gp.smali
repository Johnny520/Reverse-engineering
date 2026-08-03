.class public final synthetic Lwb/gp;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/r;


# instance fields
.field public final synthetic g:Ljava/util/ArrayList;

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/gp;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/gp;->h:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/gp;->i:Li0/a1;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/gp;->j:Li0/a1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/gp;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/gp;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/gp;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/gp;->n:Li0/a1;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lr/d;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v3, p3

    .line 16
    .line 17
    check-cast v3, Li0/h0;

    .line 18
    .line 19
    move-object/from16 v4, p4

    .line 20
    .line 21
    check-cast v4, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    and-int/lit8 v1, v4, 0x30

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Li0/h0;->d(I)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    const/16 v1, 0x20

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/16 v1, 0x10

    .line 44
    .line 45
    :goto_0
    or-int/2addr v4, v1

    .line 46
    :cond_1
    and-int/lit16 v1, v4, 0x91

    .line 47
    .line 48
    const/16 v5, 0x90

    .line 49
    .line 50
    const/4 v6, 0x1

    .line 51
    const/4 v7, 0x0

    .line 52
    if-eq v1, v5, :cond_2

    .line 53
    .line 54
    move v1, v6

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v1, v7

    .line 57
    :goto_1
    and-int/2addr v4, v6

    .line 58
    invoke-virtual {v3, v4, v1}, Li0/h0;->S(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_11

    .line 63
    .line 64
    iget-object v1, v0, Lwb/gp;->g:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    move-object v4, v1

    .line 71
    check-cast v4, Leb/c0;

    .line 72
    .line 73
    if-lez v2, :cond_3

    .line 74
    .line 75
    const v1, -0x7081b33f

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v1}, Li0/h0;->a0(I)V

    .line 79
    .line 80
    .line 81
    int-to-float v1, v7

    .line 82
    const/4 v2, 0x6

    .line 83
    invoke-static {v1, v3, v2, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 84
    .line 85
    .line 86
    :goto_2
    invoke-virtual {v3, v7}, Li0/h0;->p(Z)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    const v1, 0x604bacfb

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v1}, Li0/h0;->a0(I)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :goto_3
    sget-object v1, Lwb/y2;->m:Lwb/y2;

    .line 98
    .line 99
    iget-object v2, v0, Lwb/gp;->i:Li0/a1;

    .line 100
    .line 101
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, Ljava/util/Set;

    .line 106
    .line 107
    iget-object v7, v4, Leb/c0;->a:Ljava/lang/String;

    .line 108
    .line 109
    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    iget-object v8, v0, Lwb/gp;->j:Li0/a1;

    .line 114
    .line 115
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    check-cast v9, Ljava/util/Map;

    .line 120
    .line 121
    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    check-cast v9, Ljava/lang/String;

    .line 126
    .line 127
    const-string v10, ""

    .line 128
    .line 129
    if-nez v9, :cond_4

    .line 130
    .line 131
    move-object v9, v10

    .line 132
    :cond_4
    iget-object v11, v0, Lwb/gp;->k:Li0/a1;

    .line 133
    .line 134
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    check-cast v12, Ljava/util/Map;

    .line 139
    .line 140
    invoke-interface {v12, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    check-cast v12, Ljava/lang/String;

    .line 145
    .line 146
    if-nez v12, :cond_5

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_5
    move-object v10, v12

    .line 150
    :goto_4
    iget-object v12, v0, Lwb/gp;->l:Li0/a1;

    .line 151
    .line 152
    invoke-interface {v12}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    check-cast v13, Ljava/util/Map;

    .line 157
    .line 158
    invoke-interface {v13, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    check-cast v13, Ljava/util/List;

    .line 163
    .line 164
    if-nez v13, :cond_6

    .line 165
    .line 166
    sget-object v13, Ltf/t;->g:Ltf/t;

    .line 167
    .line 168
    :cond_6
    iget-object v14, v0, Lwb/gp;->m:Li0/a1;

    .line 169
    .line 170
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v14

    .line 174
    check-cast v14, Ljava/util/Map;

    .line 175
    .line 176
    invoke-interface {v14, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    check-cast v7, Lwb/tp;

    .line 181
    .line 182
    iget-object v14, v0, Lwb/gp;->n:Li0/a1;

    .line 183
    .line 184
    invoke-static {v14}, Lwb/y2;->H(Li0/a1;)Z

    .line 185
    .line 186
    .line 187
    move-result v14

    .line 188
    xor-int/2addr v6, v14

    .line 189
    invoke-virtual {v3, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v14

    .line 193
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v15

    .line 197
    move-object/from16 p1, v1

    .line 198
    .line 199
    sget-object v1, Li0/l;->a:Li0/e;

    .line 200
    .line 201
    if-nez v14, :cond_7

    .line 202
    .line 203
    if-ne v15, v1, :cond_8

    .line 204
    .line 205
    :cond_7
    new-instance v15, Lwb/kp;

    .line 206
    .line 207
    const/4 v14, 0x0

    .line 208
    invoke-direct {v15, v4, v2, v14}, Lwb/kp;-><init>(Leb/c0;Li0/a1;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3, v15}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_8
    check-cast v15, Lfg/l;

    .line 215
    .line 216
    invoke-virtual {v3, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v14

    .line 224
    if-nez v2, :cond_9

    .line 225
    .line 226
    if-ne v14, v1, :cond_a

    .line 227
    .line 228
    :cond_9
    new-instance v14, Lwb/kp;

    .line 229
    .line 230
    const/4 v2, 0x1

    .line 231
    invoke-direct {v14, v4, v8, v2}, Lwb/kp;-><init>(Leb/c0;Li0/a1;I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    :cond_a
    check-cast v14, Lfg/l;

    .line 238
    .line 239
    invoke-virtual {v3, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    if-nez v2, :cond_b

    .line 248
    .line 249
    if-ne v8, v1, :cond_c

    .line 250
    .line 251
    :cond_b
    new-instance v8, Lwb/kp;

    .line 252
    .line 253
    const/4 v2, 0x2

    .line 254
    invoke-direct {v8, v4, v11, v2}, Lwb/kp;-><init>(Leb/c0;Li0/a1;I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_c
    check-cast v8, Lfg/l;

    .line 261
    .line 262
    iget-object v2, v0, Lwb/gp;->h:Landroid/content/Context;

    .line 263
    .line 264
    invoke-virtual {v3, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v11

    .line 268
    invoke-virtual {v3, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v16

    .line 272
    or-int v11, v11, v16

    .line 273
    .line 274
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    if-nez v11, :cond_d

    .line 279
    .line 280
    if-ne v0, v1, :cond_e

    .line 281
    .line 282
    :cond_d
    new-instance v0, Lwb/zh;

    .line 283
    .line 284
    const/4 v11, 0x7

    .line 285
    invoke-direct {v0, v11, v2, v4, v12}, Lwb/zh;-><init>(ILandroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    :cond_e
    check-cast v0, Lfg/a;

    .line 292
    .line 293
    invoke-virtual {v3, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    if-nez v2, :cond_f

    .line 302
    .line 303
    if-ne v11, v1, :cond_10

    .line 304
    .line 305
    :cond_f
    new-instance v11, Lwb/xi;

    .line 306
    .line 307
    const/16 v1, 0xa

    .line 308
    .line 309
    invoke-direct {v11, v4, v1, v12}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v3, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    :cond_10
    check-cast v11, Lfg/a;

    .line 316
    .line 317
    const/16 v17, 0x8

    .line 318
    .line 319
    move-object v12, v10

    .line 320
    move v10, v6

    .line 321
    move-object v6, v9

    .line 322
    move-object v9, v7

    .line 323
    move-object v7, v12

    .line 324
    move-object v12, v13

    .line 325
    move-object v13, v8

    .line 326
    move-object v8, v12

    .line 327
    move-object v12, v15

    .line 328
    move-object v15, v11

    .line 329
    move-object v11, v12

    .line 330
    move-object/from16 v16, v3

    .line 331
    .line 332
    move-object v12, v14

    .line 333
    move-object/from16 v3, p1

    .line 334
    .line 335
    move-object v14, v0

    .line 336
    invoke-virtual/range {v3 .. v17}, Lwb/y2;->I(Leb/c0;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lwb/tp;ZLfg/l;Lfg/l;Lfg/l;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 337
    .line 338
    .line 339
    goto :goto_5

    .line 340
    :cond_11
    move-object/from16 v16, v3

    .line 341
    .line 342
    invoke-virtual/range {v16 .. v16}, Li0/h0;->V()V

    .line 343
    .line 344
    .line 345
    :goto_5
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 346
    .line 347
    return-object v0
.end method
