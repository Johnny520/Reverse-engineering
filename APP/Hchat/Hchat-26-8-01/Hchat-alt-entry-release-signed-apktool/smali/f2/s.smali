.class public final Lf2/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lx1/f0;

.field public final b:Lf2/f;

.field public final c:Lf/k;

.field public final d:Lf/f0;


# direct methods
.method public constructor <init>(Lx1/f0;Lf2/f;Lf/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf2/s;->a:Lx1/f0;

    .line 5
    .line 6
    iput-object p2, p0, Lf2/s;->b:Lf2/f;

    .line 7
    .line 8
    iput-object p3, p0, Lf2/s;->c:Lf/k;

    .line 9
    .line 10
    new-instance p1, Lf/f0;

    .line 11
    .line 12
    const/4 p2, 0x2

    .line 13
    invoke-direct {p1, p2}, Lf/f0;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lf2/s;->d:Lf/f0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Lf2/q;
    .locals 5

    .line 1
    new-instance v0, Lf2/m;

    .line 2
    .line 3
    invoke-direct {v0}, Lf2/m;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lf2/q;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iget-object v3, p0, Lf2/s;->b:Lf2/f;

    .line 10
    .line 11
    iget-object v4, p0, Lf2/s;->a:Lx1/f0;

    .line 12
    .line 13
    invoke-direct {v1, v3, v2, v4, v0}, Lf2/q;-><init>(Ly0/n;ZLx1/f0;Lf2/m;)V

    .line 14
    .line 15
    .line 16
    return-object v1
.end method

.method public final b(Lx1/f0;Lf2/m;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lf2/s;->d:Lf/f0;

    .line 6
    .line 7
    iget-object v3, v2, Lf/f0;->a:[Ljava/lang/Object;

    .line 8
    .line 9
    iget v2, v2, Lf/f0;->b:I

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v4

    .line 13
    :goto_0
    if-ge v5, v2, :cond_1d

    .line 14
    .line 15
    aget-object v6, v3, v5

    .line 16
    .line 17
    check-cast v6, Lz0/c;

    .line 18
    .line 19
    iget-object v7, v6, Lz0/c;->g:Lxe/e;

    .line 20
    .line 21
    iget-object v8, v7, Lxe/e;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v8, Landroid/view/autofill/AutofillManager;

    .line 24
    .line 25
    iget-object v9, v6, Lz0/c;->i:Ly1/t;

    .line 26
    .line 27
    invoke-virtual/range {p1 .. p1}, Lx1/f0;->w()Lf2/m;

    .line 28
    .line 29
    .line 30
    move-result-object v10

    .line 31
    move-object/from16 v11, p1

    .line 32
    .line 33
    iget v12, v11, Lx1/f0;->h:I

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    sget-object v14, Lf2/u;->E:Lf2/x;

    .line 38
    .line 39
    iget-object v15, v1, Lf2/m;->g:Lf/k0;

    .line 40
    .line 41
    invoke-virtual {v15, v14}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v14

    .line 45
    if-nez v14, :cond_0

    .line 46
    .line 47
    const/4 v14, 0x0

    .line 48
    :cond_0
    check-cast v14, Li2/g;

    .line 49
    .line 50
    if-eqz v14, :cond_1

    .line 51
    .line 52
    iget-object v14, v14, Li2/g;->h:Ljava/lang/String;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const/4 v14, 0x0

    .line 56
    :goto_1
    if-eqz v10, :cond_3

    .line 57
    .line 58
    sget-object v15, Lf2/u;->E:Lf2/x;

    .line 59
    .line 60
    iget-object v13, v10, Lf2/m;->g:Lf/k0;

    .line 61
    .line 62
    invoke-virtual {v13, v15}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v13

    .line 66
    if-nez v13, :cond_2

    .line 67
    .line 68
    const/4 v13, 0x0

    .line 69
    :cond_2
    check-cast v13, Li2/g;

    .line 70
    .line 71
    if-eqz v13, :cond_3

    .line 72
    .line 73
    iget-object v13, v13, Li2/g;->h:Ljava/lang/String;

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    const/4 v13, 0x0

    .line 77
    :goto_2
    const/4 v15, 0x1

    .line 78
    if-eq v14, v13, :cond_8

    .line 79
    .line 80
    if-nez v14, :cond_4

    .line 81
    .line 82
    invoke-virtual {v7, v9, v12, v15}, Lxe/e;->b(Landroid/view/View;IZ)V

    .line 83
    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    if-nez v13, :cond_5

    .line 87
    .line 88
    invoke-virtual {v7, v9, v12, v4}, Lxe/e;->b(Landroid/view/View;IZ)V

    .line 89
    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_5
    sget-object v14, Lf2/u;->r:Lf2/x;

    .line 93
    .line 94
    invoke-static {v10, v14}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v14

    .line 98
    check-cast v14, Lz0/d;

    .line 99
    .line 100
    sget-object v4, Lz0/k;->a:Lz0/d;

    .line 101
    .line 102
    invoke-static {v14, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_8

    .line 107
    .line 108
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    const/16 v14, 0x1388

    .line 113
    .line 114
    if-ge v4, v14, :cond_6

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_6
    const/16 v4, 0x1387

    .line 118
    .line 119
    invoke-virtual {v13, v4}, Ljava/lang/String;->charAt(I)C

    .line 120
    .line 121
    .line 122
    move-result v16

    .line 123
    invoke-static/range {v16 .. v16}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 124
    .line 125
    .line 126
    move-result v16

    .line 127
    if-eqz v16, :cond_7

    .line 128
    .line 129
    invoke-virtual {v13, v14}, Ljava/lang/String;->charAt(I)C

    .line 130
    .line 131
    .line 132
    move-result v16

    .line 133
    invoke-static/range {v16 .. v16}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 134
    .line 135
    .line 136
    move-result v16

    .line 137
    if-eqz v16, :cond_7

    .line 138
    .line 139
    invoke-static {v4, v13}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    goto :goto_3

    .line 144
    :cond_7
    invoke-static {v14, v13}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    :goto_3
    invoke-static {v13}, Landroid/view/autofill/AutofillValue;->forText(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v8, v9, v12, v4}, Landroid/view/autofill/AutofillManager;->notifyValueChanged(Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V

    .line 153
    .line 154
    .line 155
    :cond_8
    :goto_4
    if-eqz v1, :cond_a

    .line 156
    .line 157
    sget-object v4, Lf2/u;->J:Lf2/x;

    .line 158
    .line 159
    iget-object v13, v1, Lf2/m;->g:Lf/k0;

    .line 160
    .line 161
    invoke-virtual {v13, v4}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    if-nez v4, :cond_9

    .line 166
    .line 167
    const/4 v4, 0x0

    .line 168
    :cond_9
    check-cast v4, Lh2/a;

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_a
    const/4 v4, 0x0

    .line 172
    :goto_5
    if-eqz v10, :cond_c

    .line 173
    .line 174
    sget-object v13, Lf2/u;->J:Lf2/x;

    .line 175
    .line 176
    iget-object v14, v10, Lf2/m;->g:Lf/k0;

    .line 177
    .line 178
    invoke-virtual {v14, v13}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    if-nez v13, :cond_b

    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    :cond_b
    check-cast v13, Lh2/a;

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_c
    const/4 v13, 0x0

    .line 189
    :goto_6
    if-eq v4, v13, :cond_11

    .line 190
    .line 191
    if-nez v4, :cond_d

    .line 192
    .line 193
    invoke-virtual {v7, v9, v12, v15}, Lxe/e;->b(Landroid/view/View;IZ)V

    .line 194
    .line 195
    .line 196
    goto :goto_8

    .line 197
    :cond_d
    if-nez v13, :cond_e

    .line 198
    .line 199
    const/4 v4, 0x0

    .line 200
    invoke-virtual {v7, v9, v12, v4}, Lxe/e;->b(Landroid/view/View;IZ)V

    .line 201
    .line 202
    .line 203
    goto :goto_8

    .line 204
    :cond_e
    sget-object v4, Lf2/u;->r:Lf2/x;

    .line 205
    .line 206
    invoke-static {v10, v4}, Lf2/t;->f(Lf2/m;Lf2/x;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    check-cast v4, Lz0/d;

    .line 211
    .line 212
    sget-object v14, Lz0/k;->b:Lz0/d;

    .line 213
    .line 214
    invoke-static {v4, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    if-eqz v4, :cond_11

    .line 219
    .line 220
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-eqz v4, :cond_10

    .line 225
    .line 226
    if-eq v4, v15, :cond_f

    .line 227
    .line 228
    const/4 v4, 0x0

    .line 229
    goto :goto_7

    .line 230
    :cond_f
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_10
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 234
    .line 235
    :goto_7
    if-eqz v4, :cond_11

    .line 236
    .line 237
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    invoke-static {v4}, Landroid/view/autofill/AutofillValue;->forToggle(Z)Landroid/view/autofill/AutofillValue;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    invoke-virtual {v8, v9, v12, v4}, Landroid/view/autofill/AutofillManager;->notifyValueChanged(Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V

    .line 246
    .line 247
    .line 248
    :cond_11
    :goto_8
    if-eqz v1, :cond_13

    .line 249
    .line 250
    sget-object v4, Lf2/u;->s:Lf2/x;

    .line 251
    .line 252
    iget-object v13, v1, Lf2/m;->g:Lf/k0;

    .line 253
    .line 254
    invoke-virtual {v13, v4}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    if-nez v4, :cond_12

    .line 259
    .line 260
    const/4 v4, 0x0

    .line 261
    :cond_12
    check-cast v4, Lz0/f;

    .line 262
    .line 263
    goto :goto_9

    .line 264
    :cond_13
    const/4 v4, 0x0

    .line 265
    :goto_9
    if-eqz v10, :cond_15

    .line 266
    .line 267
    sget-object v13, Lf2/u;->s:Lf2/x;

    .line 268
    .line 269
    iget-object v14, v10, Lf2/m;->g:Lf/k0;

    .line 270
    .line 271
    invoke-virtual {v14, v13}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v13

    .line 275
    if-nez v13, :cond_14

    .line 276
    .line 277
    const/4 v13, 0x0

    .line 278
    :cond_14
    check-cast v13, Lz0/f;

    .line 279
    .line 280
    goto :goto_a

    .line 281
    :cond_15
    const/4 v13, 0x0

    .line 282
    :goto_a
    invoke-static {v4, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v14

    .line 286
    if-nez v14, :cond_16

    .line 287
    .line 288
    if-nez v4, :cond_17

    .line 289
    .line 290
    invoke-virtual {v7, v9, v12, v15}, Lxe/e;->b(Landroid/view/View;IZ)V

    .line 291
    .line 292
    .line 293
    :cond_16
    const/4 v4, 0x0

    .line 294
    goto :goto_b

    .line 295
    :cond_17
    if-nez v13, :cond_18

    .line 296
    .line 297
    const/4 v4, 0x0

    .line 298
    invoke-virtual {v7, v9, v12, v4}, Lxe/e;->b(Landroid/view/View;IZ)V

    .line 299
    .line 300
    .line 301
    goto :goto_b

    .line 302
    :cond_18
    const/4 v4, 0x0

    .line 303
    iget-object v7, v13, Lz0/f;->a:Landroid/view/autofill/AutofillValue;

    .line 304
    .line 305
    invoke-virtual {v8, v9, v12, v7}, Landroid/view/autofill/AutofillManager;->notifyValueChanged(Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V

    .line 306
    .line 307
    .line 308
    :goto_b
    if-eqz v1, :cond_19

    .line 309
    .line 310
    iget-object v7, v1, Lf2/m;->g:Lf/k0;

    .line 311
    .line 312
    sget-object v8, Lf2/u;->q:Lf2/x;

    .line 313
    .line 314
    invoke-virtual {v7, v8}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v7

    .line 318
    if-ne v7, v15, :cond_19

    .line 319
    .line 320
    move v7, v15

    .line 321
    goto :goto_c

    .line 322
    :cond_19
    move v7, v4

    .line 323
    :goto_c
    if-eqz v10, :cond_1a

    .line 324
    .line 325
    iget-object v8, v10, Lf2/m;->g:Lf/k0;

    .line 326
    .line 327
    sget-object v9, Lf2/u;->q:Lf2/x;

    .line 328
    .line 329
    invoke-virtual {v8, v9}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v8

    .line 333
    if-ne v8, v15, :cond_1a

    .line 334
    .line 335
    goto :goto_d

    .line 336
    :cond_1a
    move v15, v4

    .line 337
    :goto_d
    if-eq v7, v15, :cond_1c

    .line 338
    .line 339
    iget-object v6, v6, Lz0/c;->n:Lf/x;

    .line 340
    .line 341
    if-eqz v15, :cond_1b

    .line 342
    .line 343
    invoke-virtual {v6, v12}, Lf/x;->a(I)Z

    .line 344
    .line 345
    .line 346
    goto :goto_e

    .line 347
    :cond_1b
    invoke-virtual {v6, v12}, Lf/x;->e(I)Z

    .line 348
    .line 349
    .line 350
    :cond_1c
    :goto_e
    add-int/lit8 v5, v5, 0x1

    .line 351
    .line 352
    goto/16 :goto_0

    .line 353
    .line 354
    :cond_1d
    return-void
.end method
