.class public final Lct1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lwo;


# instance fields
.field public final h:Lv82;

.field public final i:Ljava/lang/Object;

.field public final j:[Ljava/lang/Object;

.field public final k:Let1;

.field public final l:Lx00;

.field public volatile m:Z

.field public n:Ls52;

.field public o:Ljava/lang/Throwable;

.field public p:Z


# direct methods
.method public constructor <init>(Lv82;Ljava/lang/Object;[Ljava/lang/Object;Let1;Lx00;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lct1;->h:Lv82;

    .line 5
    .line 6
    iput-object p2, p0, Lct1;->i:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lct1;->j:[Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lct1;->k:Let1;

    .line 11
    .line 12
    iput-object p5, p0, Lct1;->l:Lx00;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Ls52;
    .locals 14

    .line 1
    iget-object v0, p0, Lct1;->h:Lv82;

    .line 2
    .line 3
    iget-object v1, v0, Lv82;->j:[Lop0;

    .line 4
    .line 5
    iget-object v2, p0, Lct1;->j:[Ljava/lang/Object;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    array-length v4, v1

    .line 9
    if-ne v3, v4, :cond_b

    .line 10
    .line 11
    new-instance v5, Lr82;

    .line 12
    .line 13
    iget-object v6, v0, Lv82;->c:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, v0, Lv82;->b:Lyw0;

    .line 16
    .line 17
    iget-object v8, v0, Lv82;->d:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v9, v0, Lv82;->e:Ljs0;

    .line 20
    .line 21
    iget-object v10, v0, Lv82;->f:Lvf1;

    .line 22
    .line 23
    iget-boolean v11, v0, Lv82;->g:Z

    .line 24
    .line 25
    iget-boolean v12, v0, Lv82;->h:Z

    .line 26
    .line 27
    iget-boolean v13, v0, Lv82;->i:Z

    .line 28
    .line 29
    invoke-direct/range {v5 .. v13}, Lr82;-><init>(Ljava/lang/String;Lyw0;Ljava/lang/String;Ljs0;Lvf1;ZZZ)V

    .line 30
    .line 31
    .line 32
    iget-boolean v4, v0, Lv82;->k:Z

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    add-int/lit8 v3, v3, -0x1

    .line 37
    .line 38
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    move v7, v6

    .line 45
    :goto_0
    if-ge v7, v3, :cond_1

    .line 46
    .line 47
    aget-object v8, v2, v7

    .line 48
    .line 49
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    aget-object v8, v1, v7

    .line 53
    .line 54
    aget-object v9, v2, v7

    .line 55
    .line 56
    invoke-virtual {v8, v5, v9}, Lop0;->j(Lr82;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v7, v7, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-object v1, v5, Lr82;->d:Lxw0;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    invoke-virtual {v1}, Lxw0;->b()Lyw0;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_3

    .line 72
    :cond_2
    iget-object v1, v5, Lr82;->c:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v3, v5, Lr82;->b:Lyw0;

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    :try_start_0
    new-instance v7, Lxw0;

    .line 83
    .line 84
    invoke-direct {v7}, Lxw0;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v7, v3, v1}, Lxw0;->e(Lyw0;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :catch_0
    move-object v7, v2

    .line 92
    :goto_1
    if-eqz v7, :cond_3

    .line 93
    .line 94
    invoke-virtual {v7}, Lxw0;->b()Lyw0;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    move-object v1, v2

    .line 100
    :goto_2
    if-eqz v1, :cond_a

    .line 101
    .line 102
    :goto_3
    iget-object v3, v5, Lr82;->k:Lo82;

    .line 103
    .line 104
    if-nez v3, :cond_7

    .line 105
    .line 106
    iget-object v7, v5, Lr82;->j:Lsz0;

    .line 107
    .line 108
    if-eqz v7, :cond_4

    .line 109
    .line 110
    new-instance v3, Lpm0;

    .line 111
    .line 112
    iget-object v2, v7, Lsz0;->i:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, Ljava/util/ArrayList;

    .line 115
    .line 116
    iget-object v6, v7, Lsz0;->j:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v6, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v3, v2, v6}, Lpm0;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_4
    iget-object v7, v5, Lr82;->i:Lb5;

    .line 125
    .line 126
    if-eqz v7, :cond_6

    .line 127
    .line 128
    iget-object v3, v7, Lb5;->k:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v3, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-nez v6, :cond_5

    .line 137
    .line 138
    new-instance v2, Luj1;

    .line 139
    .line 140
    iget-object v6, v7, Lb5;->i:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v6, Lno;

    .line 143
    .line 144
    iget-object v7, v7, Lb5;->j:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v7, Lvf1;

    .line 147
    .line 148
    invoke-static {v3}, Lwg3;->i(Ljava/util/List;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-direct {v2, v6, v7, v3}, Luj1;-><init>(Lno;Lvf1;Ljava/util/List;)V

    .line 153
    .line 154
    .line 155
    move-object v3, v2

    .line 156
    goto :goto_4

    .line 157
    :cond_5
    const-string p0, "Multipart body must have at least one part."

    .line 158
    .line 159
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-object v2

    .line 163
    :cond_6
    iget-boolean v7, v5, Lr82;->h:Z

    .line 164
    .line 165
    if-eqz v7, :cond_7

    .line 166
    .line 167
    new-array v3, v6, [B

    .line 168
    .line 169
    sget v7, Lo82;->a:I

    .line 170
    .line 171
    const-wide/16 v8, 0x0

    .line 172
    .line 173
    const-wide/16 v10, 0x0

    .line 174
    .line 175
    move-wide v12, v8

    .line 176
    invoke-static/range {v8 .. v13}, Lug3;->a(JJJ)V

    .line 177
    .line 178
    .line 179
    new-instance v7, Ln82;

    .line 180
    .line 181
    invoke-direct {v7, v2, v6, v3}, Ln82;-><init>(Lvf1;I[B)V

    .line 182
    .line 183
    .line 184
    move-object v3, v7

    .line 185
    :cond_7
    :goto_4
    iget-object v2, v5, Lr82;->g:Lvf1;

    .line 186
    .line 187
    iget-object v6, v5, Lr82;->f:Lye0;

    .line 188
    .line 189
    if-eqz v2, :cond_9

    .line 190
    .line 191
    if-eqz v3, :cond_8

    .line 192
    .line 193
    new-instance v7, Lq82;

    .line 194
    .line 195
    invoke-direct {v7, v3, v2}, Lq82;-><init>(Lo82;Lvf1;)V

    .line 196
    .line 197
    .line 198
    move-object v3, v7

    .line 199
    goto :goto_5

    .line 200
    :cond_8
    const-string v7, "Content-Type"

    .line 201
    .line 202
    iget-object v2, v2, Lvf1;->a:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v6, v7, v2}, Lye0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :cond_9
    :goto_5
    iget-object v2, v5, Lr82;->e:Lcj;

    .line 208
    .line 209
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    iput-object v1, v2, Lcj;->a:Ljava/lang/Object;

    .line 213
    .line 214
    invoke-virtual {v6}, Lye0;->b()Ljs0;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v1}, Ljs0;->c()Lye0;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    iput-object v1, v2, Lcj;->c:Ljava/lang/Object;

    .line 223
    .line 224
    iget-object v1, v5, Lr82;->a:Ljava/lang/String;

    .line 225
    .line 226
    invoke-virtual {v2, v1, v3}, Lcj;->n(Ljava/lang/String;Lo82;)V

    .line 227
    .line 228
    .line 229
    new-instance v1, Ld21;

    .line 230
    .line 231
    iget-object v0, v0, Lv82;->a:Ljava/lang/reflect/Method;

    .line 232
    .line 233
    iget-object v3, p0, Lct1;->i:Ljava/lang/Object;

    .line 234
    .line 235
    invoke-direct {v1, v3, v0, v4}, Ld21;-><init>(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/ArrayList;)V

    .line 236
    .line 237
    .line 238
    const-class v0, Ld21;

    .line 239
    .line 240
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    iget-object v3, v2, Lcj;->e:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v3, Lp40;

    .line 247
    .line 248
    invoke-virtual {v3, v0, v1}, Lp40;->P(Lbt;Ljava/lang/Object;)Lp40;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    iput-object v0, v2, Lcj;->e:Ljava/lang/Object;

    .line 253
    .line 254
    new-instance v0, Lk82;

    .line 255
    .line 256
    invoke-direct {v0, v2}, Lk82;-><init>(Lcj;)V

    .line 257
    .line 258
    .line 259
    iget-object p0, p0, Lct1;->k:Let1;

    .line 260
    .line 261
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    new-instance v1, Ls52;

    .line 265
    .line 266
    invoke-direct {v1, p0, v0}, Ls52;-><init>(Let1;Lk82;)V

    .line 267
    .line 268
    .line 269
    return-object v1

    .line 270
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 271
    .line 272
    new-instance v0, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    const-string v1, "Malformed URL. Base: "

    .line 275
    .line 276
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    iget-object v1, v5, Lr82;->c:Ljava/lang/String;

    .line 283
    .line 284
    const-string v2, ", Relative: "

    .line 285
    .line 286
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw p0

    .line 300
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 301
    .line 302
    const-string v0, "Argument count ("

    .line 303
    .line 304
    const-string v2, ") doesn\'t match expected count ("

    .line 305
    .line 306
    invoke-static {v3, v0, v2}, Lvi0;->n(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    array-length v1, v1

    .line 311
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    const-string v1, ")"

    .line 315
    .line 316
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw p0
.end method

.method public final b(Lcp;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lct1;->p:Z

    .line 3
    .line 4
    if-nez v0, :cond_3

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lct1;->p:Z

    .line 8
    .line 9
    iget-object v1, p0, Lct1;->n:Ls52;

    .line 10
    .line 11
    iget-object v2, p0, Lct1;->o:Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    :try_start_1
    invoke-virtual {p0}, Lct1;->a()Ls52;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iput-object v3, p0, Lct1;->n:Ls52;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    move-object v1, v3

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v2

    .line 26
    :try_start_2
    invoke-static {v2}, Lxe1;->m0(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lct1;->o:Ljava/lang/Throwable;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_1
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-interface {p1, p0, v2}, Lcp;->d(Lwo;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget-boolean v2, p0, Lct1;->m:Z

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1}, Ls52;->cancel()V

    .line 46
    .line 47
    .line 48
    :cond_2
    new-instance v2, Ldq1;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v2, v0, p0, p1, v3}, Ldq1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ls52;->g(Ldp;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v0, "Already executed."

    .line 61
    .line 62
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :goto_1
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 67
    throw p1
.end method

.method public final declared-synchronized c()Lk82;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lct1;->d()Ls52;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v0, v0, Ls52;->i:Lk82;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-object v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception v0

    .line 13
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 14
    .line 15
    const-string v2, "Unable to create request."

    .line 16
    .line 17
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    throw v1

    .line 21
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw v0
.end method

.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lct1;->m:Z

    .line 3
    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p0, Lct1;->n:Ls52;

    .line 6
    .line 7
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Ls52;->cancel()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 6

    .line 17
    new-instance v0, Lct1;

    iget-object v4, p0, Lct1;->k:Let1;

    iget-object v5, p0, Lct1;->l:Lx00;

    iget-object v1, p0, Lct1;->h:Lv82;

    iget-object v2, p0, Lct1;->i:Ljava/lang/Object;

    iget-object v3, p0, Lct1;->j:[Ljava/lang/Object;

    invoke-direct/range {v0 .. v5}, Lct1;-><init>(Lv82;Ljava/lang/Object;[Ljava/lang/Object;Let1;Lx00;)V

    return-object v0
.end method

.method public final clone()Lwo;
    .locals 6

    .line 1
    new-instance v0, Lct1;

    .line 2
    .line 3
    iget-object v4, p0, Lct1;->k:Let1;

    .line 4
    .line 5
    iget-object v5, p0, Lct1;->l:Lx00;

    .line 6
    .line 7
    iget-object v1, p0, Lct1;->h:Lv82;

    .line 8
    .line 9
    iget-object v2, p0, Lct1;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v3, p0, Lct1;->j:[Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lct1;-><init>(Lv82;Ljava/lang/Object;[Ljava/lang/Object;Let1;Lx00;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final d()Ls52;
    .locals 1

    .line 1
    iget-object v0, p0, Lct1;->n:Ls52;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lct1;->o:Ljava/lang/Throwable;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    instance-of p0, v0, Ljava/io/IOException;

    .line 11
    .line 12
    if-nez p0, :cond_2

    .line 13
    .line 14
    instance-of p0, v0, Ljava/lang/RuntimeException;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    check-cast v0, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    throw v0

    .line 21
    :cond_1
    check-cast v0, Ljava/lang/Error;

    .line 22
    .line 23
    throw v0

    .line 24
    :cond_2
    check-cast v0, Ljava/io/IOException;

    .line 25
    .line 26
    throw v0

    .line 27
    :cond_3
    :try_start_0
    invoke-virtual {p0}, Lct1;->a()Ls52;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lct1;->n:Ls52;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    return-object v0

    .line 34
    :catch_0
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    :catch_1
    move-exception v0

    .line 37
    goto :goto_0

    .line 38
    :catch_2
    move-exception v0

    .line 39
    :goto_0
    invoke-static {v0}, Lxe1;->m0(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lct1;->o:Ljava/lang/Throwable;

    .line 43
    .line 44
    throw v0
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lct1;->m:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v0, p0, Lct1;->n:Ls52;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-boolean v0, v0, Ls52;->x:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const/4 v1, 0x0

    .line 20
    :goto_0
    monitor-exit p0

    .line 21
    return v1

    .line 22
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v0
.end method

.method public final f(Lr92;)Lq92;
    .locals 6

    .line 1
    iget-object v0, p1, Lr92;->n:Lu92;

    .line 2
    .line 3
    invoke-virtual {p1}, Lr92;->b()Lp92;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lbt1;

    .line 8
    .line 9
    invoke-virtual {v0}, Lu92;->e()Lvf1;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0}, Lu92;->c()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    invoke-direct {v1, v2, v3, v4}, Lbt1;-><init>(Lvf1;J)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p1, Lp92;->g:Lu92;

    .line 21
    .line 22
    invoke-virtual {p1}, Lp92;->a()Lr92;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-boolean v1, p1, Lr92;->w:Z

    .line 27
    .line 28
    iget v2, p1, Lr92;->k:I

    .line 29
    .line 30
    const/16 v3, 0xc8

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    if-lt v2, v3, :cond_6

    .line 34
    .line 35
    const/16 v3, 0x12c

    .line 36
    .line 37
    if-lt v2, v3, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    const/16 v3, 0xcc

    .line 41
    .line 42
    const-string v5, "rawResponse must be successful response"

    .line 43
    .line 44
    if-eq v2, v3, :cond_4

    .line 45
    .line 46
    const/16 v3, 0xcd

    .line 47
    .line 48
    if-ne v2, v3, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    new-instance v2, Lat1;

    .line 52
    .line 53
    invoke-direct {v2, v0}, Lat1;-><init>(Lu92;)V

    .line 54
    .line 55
    .line 56
    :try_start_0
    iget-object p0, p0, Lct1;->l:Lx00;

    .line 57
    .line 58
    invoke-interface {p0, v2}, Lx00;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    new-instance v0, Lq92;

    .line 65
    .line 66
    invoke-direct {v0, p1, p0}, Lq92;-><init>(Lr92;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 71
    .line 72
    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    :catch_0
    move-exception p0

    .line 77
    iget-object p1, v2, Lat1;->l:Ljava/io/IOException;

    .line 78
    .line 79
    if-nez p1, :cond_3

    .line 80
    .line 81
    throw p0

    .line 82
    :cond_3
    throw p1

    .line 83
    :cond_4
    :goto_0
    invoke-virtual {v0}, Lu92;->close()V

    .line 84
    .line 85
    .line 86
    if-eqz v1, :cond_5

    .line 87
    .line 88
    new-instance p0, Lq92;

    .line 89
    .line 90
    invoke-direct {p0, p1, v4}, Lq92;-><init>(Lr92;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_5
    invoke-static {v5}, Ls;->j(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-object v4

    .line 98
    :cond_6
    :goto_1
    :try_start_1
    new-instance p0, Lfn;

    .line 99
    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lu92;->g()Lon;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-interface {v2, p0}, Lon;->i(Lfn;)J

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Lu92;->e()Lvf1;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Lu92;->c()J

    .line 114
    .line 115
    .line 116
    new-instance p0, Lt92;

    .line 117
    .line 118
    if-nez v1, :cond_7

    .line 119
    .line 120
    new-instance p0, Lq92;

    .line 121
    .line 122
    invoke-direct {p0, p1, v4}, Lq92;-><init>(Lr92;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lu92;->close()V

    .line 126
    .line 127
    .line 128
    return-object p0

    .line 129
    :cond_7
    :try_start_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 130
    .line 131
    const-string p1, "rawResponse should not be successful response"

    .line 132
    .line 133
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 137
    :catchall_0
    move-exception p0

    .line 138
    invoke-virtual {v0}, Lu92;->close()V

    .line 139
    .line 140
    .line 141
    throw p0
.end method
