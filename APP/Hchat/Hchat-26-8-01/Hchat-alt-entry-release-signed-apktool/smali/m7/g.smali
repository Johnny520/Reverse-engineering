.class public final Lm7/g;
.super Ll7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static s:Z


# instance fields
.field public final o:Lu7/a;

.field public final p:Lm7/n;

.field public final q:Ld7/b;

.field public r:Ll7/f;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    new-instance v0, Lp7/a;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lp7/a;-><init>(S)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Ll7/a;-><init>(Lp7/a;I)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lu7/a;

    .line 11
    .line 12
    new-instance v1, Lokio/a;

    .line 13
    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    invoke-direct {v1, v2}, Lokio/a;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v0, v2, v3, v1}, Lu7/c;-><init>(ZZLokio/a;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lm7/g;->o:Lu7/a;

    .line 25
    .line 26
    new-instance v1, Lm7/n;

    .line 27
    .line 28
    invoke-direct {v1}, Lm7/n;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lm7/g;->p:Lm7/n;

    .line 32
    .line 33
    new-instance v2, Ld7/b;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x2

    .line 37
    invoke-direct {v2, v3, v4}, Ld7/b;-><init>(Lk7/f;I)V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, Lm7/g;->q:Ld7/b;

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v2}, Lo7/d;->P(Lk7/a;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lp7/b;->T(Lq7/b;)Lp7/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_f

    .line 9
    .line 10
    iget-object v1, v0, Lp7/a;->o:Lr7/f;

    .line 11
    .line 12
    iget v1, v1, Lr7/f;->n:I

    .line 13
    .line 14
    if-ltz v1, :cond_e

    .line 15
    .line 16
    invoke-virtual {p1}, Lq7/b;->available()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-gt v1, v2, :cond_d

    .line 21
    .line 22
    iget-object v2, v0, Lp7/a;->n:Lr7/a;

    .line 23
    .line 24
    iget v2, v2, Lr7/a;->o:I

    .line 25
    .line 26
    if-lt v1, v2, :cond_c

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Lq7/b;->a(I)Lq7/b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, Ll7/a;->m:Lp7/a;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lk7/a;->G(Lq7/b;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v1, Lp7/a;->m:Lr7/a;

    .line 38
    .line 39
    const/4 v3, 0x3

    .line 40
    invoke-virtual {v2, v3}, Lr7/a;->k(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lm7/g;->U()Lm7/f;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Lm7/f;->R()Ld7/b;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Lo7/b;->N()V

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-virtual {v0}, Lq7/b;->b()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_b

    .line 59
    .line 60
    invoke-virtual {v0}, Lq7/b;->b()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const/4 v3, 0x0

    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :cond_1
    iget v2, v0, Lq7/b;->k:I

    .line 70
    .line 71
    invoke-static {v0}, Lp7/b;->T(Lq7/b;)Lp7/b;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    if-nez v4, :cond_2

    .line 76
    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :cond_2
    invoke-virtual {v4}, Lp7/a;->Q()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    const/4 v6, 0x2

    .line 84
    const/4 v7, 0x1

    .line 85
    if-ne v5, v6, :cond_3

    .line 86
    .line 87
    iget-object v6, p0, Lm7/g;->o:Lu7/a;

    .line 88
    .line 89
    invoke-virtual {v6}, Lu7/c;->size()I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-nez v8, :cond_3

    .line 94
    .line 95
    invoke-virtual {v6, v0}, Lk7/a;->G(Lq7/b;)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :cond_3
    const/16 v6, 0xb

    .line 101
    .line 102
    if-ne v5, v6, :cond_4

    .line 103
    .line 104
    iget-object v6, p0, Lm7/g;->p:Lm7/n;

    .line 105
    .line 106
    iget-object v8, v6, Lm7/n;->o:Ls7/f;

    .line 107
    .line 108
    iget-object v8, v8, Lo7/b;->k:Lz7/c;

    .line 109
    .line 110
    invoke-virtual {v8}, Lz7/c;->size()I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-nez v8, :cond_4

    .line 115
    .line 116
    invoke-virtual {v6, v0}, Lk7/a;->G(Lq7/b;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    const/16 v6, 0x9

    .line 121
    .line 122
    if-ne v5, v6, :cond_5

    .line 123
    .line 124
    invoke-virtual {p0}, Lm7/g;->U()Lm7/f;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    new-instance v3, Lm7/x;

    .line 132
    .line 133
    new-instance v4, Lm7/w;

    .line 134
    .line 135
    invoke-direct {v4}, Lm7/w;-><init>()V

    .line 136
    .line 137
    .line 138
    const/4 v5, 0x0

    .line 139
    invoke-direct {v3, v4, v5}, Lm7/x;-><init>(Lk7/c;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Lm7/f;->R()Ld7/b;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v2, v3}, Lo7/b;->M(Lk7/a;)Z

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v0}, Lk7/a;->G(Lq7/b;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Lq7/b;->b()Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    goto/16 :goto_2

    .line 157
    .line 158
    :cond_5
    const/4 v6, 0x4

    .line 159
    if-ne v5, v6, :cond_6

    .line 160
    .line 161
    invoke-virtual {p0}, Lm7/g;->U()Lm7/f;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v3, Lm7/f;

    .line 169
    .line 170
    invoke-direct {v3}, Lm7/f;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Lm7/f;->R()Ld7/b;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v2, v3}, Lo7/b;->M(Lk7/a;)Z

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, v0}, Lk7/a;->G(Lq7/b;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Lq7/b;->b()Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    goto :goto_2

    .line 188
    :cond_6
    const/4 v6, 0x7

    .line 189
    if-eq v5, v6, :cond_9

    .line 190
    .line 191
    const/4 v6, 0x5

    .line 192
    if-ne v5, v6, :cond_7

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_7
    sget-boolean v6, Lm7/g;->s:Z

    .line 196
    .line 197
    if-nez v6, :cond_8

    .line 198
    .line 199
    sput-boolean v7, Lm7/g;->s:Z

    .line 200
    .line 201
    sget-object v6, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 202
    .line 203
    new-instance v8, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    const-string v9, "Read unknown chunk: "

    .line 206
    .line 207
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v6, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :cond_8
    invoke-virtual {p0}, Lm7/g;->U()Lm7/f;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-virtual {v4, v5}, Lm7/i;->T(I)Lm7/x;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-virtual {v4, v0}, Lk7/a;->G(Lq7/b;)V

    .line 229
    .line 230
    .line 231
    :goto_0
    invoke-virtual {v0}, Lq7/b;->b()Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_a

    .line 236
    .line 237
    iget v4, v0, Lq7/b;->k:I

    .line 238
    .line 239
    if-eq v2, v4, :cond_a

    .line 240
    .line 241
    move v3, v7

    .line 242
    goto :goto_2

    .line 243
    :cond_9
    :goto_1
    invoke-virtual {p0}, Lm7/g;->U()Lm7/f;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    new-instance v3, Lm7/j;

    .line 251
    .line 252
    new-instance v4, Lm7/k;

    .line 253
    .line 254
    invoke-direct {v4}, Lm7/k;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-direct {v3, v4}, Lm7/q;-><init>(Lk7/c;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2}, Lm7/f;->R()Ld7/b;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v2, v3}, Lo7/b;->M(Lk7/a;)Z

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3, v0}, Lk7/a;->G(Lq7/b;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Lq7/b;->b()Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    :cond_a
    :goto_2
    if-nez v3, :cond_0

    .line 275
    .line 276
    :cond_b
    iget-object v1, v1, Lp7/a;->o:Lr7/f;

    .line 277
    .line 278
    iget v1, v1, Lr7/f;->n:I

    .line 279
    .line 280
    invoke-virtual {p1, v1}, Lq7/b;->c(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, Lq7/b;->close()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0}, Lm7/g;->R()V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :cond_c
    const-string p1, "Higher header size: "

    .line 291
    .line 292
    invoke-static {v0, p1}, Lj8/o;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_d
    new-instance v0, Ljava/io/IOException;

    .line 297
    .line 298
    const-string v2, "Higher chunk size: "

    .line 299
    .line 300
    const-string v3, ", available = "

    .line 301
    .line 302
    invoke-static {v1, v2, v3}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-virtual {p1}, Lq7/b;->available()I

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    throw v0

    .line 321
    :cond_e
    const-string p1, "Negative chunk size: "

    .line 322
    .line 323
    invoke-static {v1, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    return-void

    .line 331
    :cond_f
    const-string v0, "Not bin xml: "

    .line 332
    .line 333
    invoke-static {p1, v0}, Lj8/o;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    return-void
.end method

.method public final M()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lm7/g;->U()Lm7/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lce/n;

    .line 6
    .line 7
    const/16 v2, 0x11

    .line 8
    .line 9
    invoke-direct {v1, v2}, Lce/n;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v2, Lbe/i;

    .line 16
    .line 17
    const/16 v3, 0x10

    .line 18
    .line 19
    invoke-direct {v2, v1, v3}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lm7/f;->R()Ld7/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, v2}, Lo7/b;->removeIf(Ljava/util/function/Predicate;)Z

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lm7/g;->q:Ld7/b;

    .line 30
    .line 31
    invoke-virtual {v0}, Lo7/b;->c()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final R()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm7/g;->U()Lm7/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lm7/i;->M()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final S()V
    .locals 0

    .line 1
    return-void
.end method

.method public final U()Lm7/f;
    .locals 1

    .line 1
    const-class v0, Lm7/f;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lm7/f;

    .line 8
    .line 9
    return-object v0
.end method

.method public final r()[B
    .locals 2

    .line 1
    new-instance v0, Lx7/b;

    .line 2
    .line 3
    iget-object v1, p0, Ll7/a;->m:Lp7/a;

    .line 4
    .line 5
    iget-object v1, v1, Lp7/a;->o:Lr7/f;

    .line 6
    .line 7
    iget v1, v1, Lr7/f;->n:I

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lx7/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p0, v0}, Lk7/a;->K(Ljava/io/ByteArrayOutputStream;)I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lx7/b;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :catch_0
    invoke-virtual {v0}, Lx7/b;->toByteArray()[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
