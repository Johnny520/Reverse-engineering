.class public final Lk4/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lg8/b;

.field public final c:Z

.field public d:Lv4/e0;

.field public e:I

.field public f:Lv4/d0;

.field public g:Lv4/d0;

.field public h:Lw4/e;

.field public i:Lh4/u;

.field public j:Lh4/u;

.field public k:Lh4/u;

.field public l:Lk4/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;[B)V
    .locals 3

    .line 1
    new-instance v0, Lg8/b;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p2, v1, v2}, Lg8/b;-><init>([BIB)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lk4/b;->a:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v0, p0, Lk4/b;->b:Lg8/b;

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lk4/b;->c:Z

    .line 19
    .line 20
    const/4 p1, -0x1

    .line 21
    iput p1, p0, Lk4/b;->e:I

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p1, "filePath == null"

    .line 25
    .line 26
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lk4/b;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "...while parsing "

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, Lk4/b;->b()V
    :try_end_0
    .catch Ll4/c; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v2

    .line 10
    new-instance v3, Ll4/c;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-direct {v3, v4, v2}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v3, v0}, Lf4/a;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v3

    .line 32
    :catch_1
    move-exception v2

    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v2, v0}, Lf4/a;->a(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v2
.end method

.method public final b()V
    .locals 12

    .line 1
    iget-object v6, p0, Lk4/b;->b:Lg8/b;

    .line 2
    .line 3
    iget v0, v6, Lg8/b;->c:I

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    if-lt v0, v2, :cond_a

    .line 9
    .line 10
    const/4 v0, 0x6

    .line 11
    const-string v2, ")"

    .line 12
    .line 13
    iget-boolean v3, p0, Lk4/b;->c:Z

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    if-eqz v3, :cond_3

    .line 17
    .line 18
    invoke-virtual {v6, v8}, Lg8/b;->b(I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const v5, -0x35014542    # -8346975.0f

    .line 23
    .line 24
    .line 25
    if-ne v4, v5, :cond_2

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    invoke-virtual {v6, v4}, Lg8/b;->g(I)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-virtual {v6, v0}, Lg8/b;->g(I)I

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    if-ltz v5, :cond_1

    .line 37
    .line 38
    const/16 v10, 0x35

    .line 39
    .line 40
    if-ne v9, v10, :cond_0

    .line 41
    .line 42
    if-gtz v5, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    if-ge v9, v10, :cond_1

    .line 46
    .line 47
    const/16 v5, 0x2d

    .line 48
    .line 49
    if-lt v9, v5, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance v2, Ll4/c;

    .line 53
    .line 54
    invoke-virtual {v6, v0}, Lg8/b;->g(I)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-virtual {v6, v4}, Lg8/b;->g(I)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    new-instance v4, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v5, "unsupported class file version "

    .line 65
    .line 66
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, "."

    .line 73
    .line 74
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {v2, v0, v7}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 85
    .line 86
    .line 87
    throw v2

    .line 88
    :cond_2
    new-instance v0, Ll4/c;

    .line 89
    .line 90
    invoke-virtual {v6, v8}, Lg8/b;->b(I)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-static {v3}, La/a;->Y0(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    new-instance v4, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v5, "bad class file magic ("

    .line 101
    .line 102
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-direct {v0, v2, v7}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 116
    .line 117
    .line 118
    throw v0

    .line 119
    :cond_3
    :goto_0
    new-instance v4, Lf1/h;

    .line 120
    .line 121
    invoke-direct {v4, v6}, Lf1/h;-><init>(Lg8/b;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4}, Lf1/h;->s()V

    .line 125
    .line 126
    .line 127
    iget-object v5, v4, Lf1/h;->j:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v5, Lv4/e0;

    .line 130
    .line 131
    iput-object v5, p0, Lk4/b;->d:Lv4/e0;

    .line 132
    .line 133
    iput-boolean v8, v5, Lz4/j;->g:Z

    .line 134
    .line 135
    invoke-virtual {v4}, Lf1/h;->s()V

    .line 136
    .line 137
    .line 138
    iget v4, v4, Lf1/h;->h:I

    .line 139
    .line 140
    invoke-virtual {v6, v4}, Lg8/b;->g(I)I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    add-int/lit8 v9, v4, 0x2

    .line 145
    .line 146
    invoke-virtual {v6, v9}, Lg8/b;->g(I)I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    iget-object v10, p0, Lk4/b;->d:Lv4/e0;

    .line 151
    .line 152
    invoke-virtual {v10, v9}, Lv4/e0;->l(I)Lv4/a;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    check-cast v9, Lv4/d0;

    .line 157
    .line 158
    iput-object v9, p0, Lk4/b;->f:Lv4/d0;

    .line 159
    .line 160
    add-int/lit8 v9, v4, 0x4

    .line 161
    .line 162
    invoke-virtual {v6, v9}, Lg8/b;->g(I)I

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    iget-object v10, p0, Lk4/b;->d:Lv4/e0;

    .line 167
    .line 168
    if-nez v9, :cond_4

    .line 169
    .line 170
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-object v9, v7

    .line 174
    goto :goto_1

    .line 175
    :cond_4
    invoke-virtual {v10, v9}, Lv4/e0;->l(I)Lv4/a;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    :goto_1
    check-cast v9, Lv4/d0;

    .line 180
    .line 181
    iput-object v9, p0, Lk4/b;->g:Lv4/d0;

    .line 182
    .line 183
    add-int/lit8 v9, v4, 0x6

    .line 184
    .line 185
    invoke-virtual {v6, v9}, Lg8/b;->g(I)I

    .line 186
    .line 187
    .line 188
    move-result v9

    .line 189
    add-int/lit8 v4, v4, 0x8

    .line 190
    .line 191
    if-nez v9, :cond_5

    .line 192
    .line 193
    sget-object v10, Lw4/b;->i:Lw4/b;

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_5
    iget-object v10, p0, Lk4/b;->d:Lv4/e0;

    .line 197
    .line 198
    if-eqz v10, :cond_9

    .line 199
    .line 200
    new-instance v11, Lac/k;

    .line 201
    .line 202
    invoke-direct {v11, v6, v4, v9, v10}, Lac/k;-><init>(Lg8/b;IILv4/e0;)V

    .line 203
    .line 204
    .line 205
    move-object v10, v11

    .line 206
    :goto_2
    iput-object v10, p0, Lk4/b;->h:Lw4/e;

    .line 207
    .line 208
    mul-int/lit8 v9, v9, 0x2

    .line 209
    .line 210
    add-int/2addr v9, v4

    .line 211
    if-eqz v3, :cond_7

    .line 212
    .line 213
    iget-object v3, p0, Lk4/b;->f:Lv4/d0;

    .line 214
    .line 215
    iget-object v3, v3, Lv4/d0;->g:Lw4/c;

    .line 216
    .line 217
    invoke-virtual {v3}, Lw4/c;->j()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    const-string v4, ".class"

    .line 222
    .line 223
    iget-object v10, p0, Lk4/b;->a:Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {v10, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-eqz v4, :cond_6

    .line 230
    .line 231
    invoke-virtual {v10, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_6

    .line 236
    .line 237
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 242
    .line 243
    .line 244
    move-result v11

    .line 245
    add-int/2addr v11, v0

    .line 246
    if-ne v4, v11, :cond_6

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_6
    new-instance v0, Ll4/c;

    .line 250
    .line 251
    const-string v4, "class name ("

    .line 252
    .line 253
    const-string v5, ") does not match path ("

    .line 254
    .line 255
    invoke-static {v4, v3, v5, v10, v2}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-direct {v0, v2, v7}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 260
    .line 261
    .line 262
    throw v0

    .line 263
    :cond_7
    :goto_3
    iput v5, p0, Lk4/b;->e:I

    .line 264
    .line 265
    new-instance v0, Lk4/c;

    .line 266
    .line 267
    iget-object v2, p0, Lk4/b;->f:Lv4/d0;

    .line 268
    .line 269
    iget-object v4, p0, Lk4/b;->l:Lk4/d;

    .line 270
    .line 271
    const/4 v5, 0x0

    .line 272
    move-object v1, p0

    .line 273
    move v3, v9

    .line 274
    invoke-direct/range {v0 .. v5}, Lk4/c;-><init>(Lk4/b;Lv4/d0;ILk4/d;I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0}, Lk4/c;->b()V

    .line 278
    .line 279
    .line 280
    iget-object v2, v0, Lk4/c;->g:Lz4/e;

    .line 281
    .line 282
    check-cast v2, Lh4/u;

    .line 283
    .line 284
    iput-object v2, p0, Lk4/b;->i:Lh4/u;

    .line 285
    .line 286
    invoke-virtual {v0}, Lk4/c;->b()V

    .line 287
    .line 288
    .line 289
    iget v3, v0, Lk4/c;->e:I

    .line 290
    .line 291
    new-instance v0, Lk4/c;

    .line 292
    .line 293
    iget-object v2, p0, Lk4/b;->f:Lv4/d0;

    .line 294
    .line 295
    iget-object v4, p0, Lk4/b;->l:Lk4/d;

    .line 296
    .line 297
    const/4 v5, 0x1

    .line 298
    invoke-direct/range {v0 .. v5}, Lk4/c;-><init>(Lk4/b;Lv4/d0;ILk4/d;I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0}, Lk4/c;->b()V

    .line 302
    .line 303
    .line 304
    iget-object v2, v0, Lk4/c;->g:Lz4/e;

    .line 305
    .line 306
    check-cast v2, Lh4/u;

    .line 307
    .line 308
    iput-object v2, p0, Lk4/b;->j:Lh4/u;

    .line 309
    .line 310
    invoke-virtual {v0}, Lk4/c;->b()V

    .line 311
    .line 312
    .line 313
    iget v0, v0, Lk4/c;->e:I

    .line 314
    .line 315
    new-instance v2, Lk4/a;

    .line 316
    .line 317
    iget-object v3, p0, Lk4/b;->l:Lk4/d;

    .line 318
    .line 319
    invoke-direct {v2, p0, v8, v0, v3}, Lk4/a;-><init>(Lk4/b;IILk4/d;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2}, Lk4/a;->a()V

    .line 323
    .line 324
    .line 325
    iget-object v0, v2, Lk4/a;->f:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, Lh4/u;

    .line 328
    .line 329
    iput-object v0, p0, Lk4/b;->k:Lh4/u;

    .line 330
    .line 331
    iput-boolean v8, v0, Lz4/j;->g:Z

    .line 332
    .line 333
    invoke-virtual {v2}, Lk4/a;->a()V

    .line 334
    .line 335
    .line 336
    iget v0, v2, Lk4/a;->c:I

    .line 337
    .line 338
    iget v2, v6, Lg8/b;->c:I

    .line 339
    .line 340
    if-ne v0, v2, :cond_8

    .line 341
    .line 342
    return-void

    .line 343
    :cond_8
    new-instance v2, Ll4/c;

    .line 344
    .line 345
    invoke-static {v0}, La/a;->Y0(I)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    const-string v3, "extra bytes at end of class file, at offset "

    .line 350
    .line 351
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-direct {v2, v0, v7}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 356
    .line 357
    .line 358
    throw v2

    .line 359
    :cond_9
    const-string v0, "pool not yet initialized"

    .line 360
    .line 361
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :cond_a
    new-instance v0, Ll4/c;

    .line 366
    .line 367
    const-string v2, "severely truncated class file"

    .line 368
    .line 369
    invoke-direct {v0, v2, v7}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 370
    .line 371
    .line 372
    throw v0
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk4/b;->k:Lh4/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lk4/b;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    iget v0, p0, Lk4/b;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lk4/b;->a()V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method
