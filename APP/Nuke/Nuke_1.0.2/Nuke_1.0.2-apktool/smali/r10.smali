.class public final Lr10;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ls12;Lkz2;Lb03;Lt00;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lr10;->l:I

    .line 17
    iput-object p1, p0, Lr10;->n:Ljava/lang/Object;

    iput-object p2, p0, Lr10;->o:Ljava/lang/Object;

    iput-object p3, p0, Lr10;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ltw2;-><init>(ILt00;)V

    return-void
.end method

.method public constructor <init>(Lt00;Ldq1;Lhg2;[BLdl2;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lr10;->l:I

    .line 3
    .line 4
    iput-object p2, p0, Lr10;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p3, p0, Lr10;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p4, p0, Lr10;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p5, p0, Lr10;->p:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p2, 0x2

    .line 13
    invoke-direct {p0, p2, p1}, Ltw2;-><init>(ILt00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lr10;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    check-cast p1, Lj20;

    .line 6
    .line 7
    check-cast p2, Lt00;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lr10;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lr10;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lr10;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lr10;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lr10;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lr10;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 10

    .line 1
    iget v0, p0, Lr10;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Lr10;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lr10;->o:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lr10;->n:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v4, Lr10;

    .line 13
    .line 14
    iget-object p0, p0, Lr10;->m:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v6, p0

    .line 17
    check-cast v6, Ldq1;

    .line 18
    .line 19
    move-object v7, v3

    .line 20
    check-cast v7, Lhg2;

    .line 21
    .line 22
    move-object v8, v2

    .line 23
    check-cast v8, [B

    .line 24
    .line 25
    move-object v9, v1

    .line 26
    check-cast v9, Ldl2;

    .line 27
    .line 28
    move-object v5, p1

    .line 29
    invoke-direct/range {v4 .. v9}, Lr10;-><init>(Lt00;Ldq1;Lhg2;[BLdl2;)V

    .line 30
    .line 31
    .line 32
    return-object v4

    .line 33
    :pswitch_0
    move-object v5, p1

    .line 34
    new-instance p0, Lr10;

    .line 35
    .line 36
    check-cast v3, Ls12;

    .line 37
    .line 38
    check-cast v2, Lkz2;

    .line 39
    .line 40
    check-cast v1, Lb03;

    .line 41
    .line 42
    invoke-direct {p0, v3, v2, v1, v5}, Lr10;-><init>(Ls12;Lkz2;Lb03;Lt00;)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, Lr10;->m:Ljava/lang/Object;

    .line 46
    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lr10;->l:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, Lr10;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, v0, Lr10;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, v0, Lr10;->p:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v5, Ldl2;

    .line 17
    .line 18
    check-cast v4, [B

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Lr10;->m:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ldq1;

    .line 26
    .line 27
    check-cast v3, Lhg2;

    .line 28
    .line 29
    invoke-static {v3}, Ldq1;->S(Lhg2;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, v3, Lhg2;->a:Lfg2;

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ldq1;->T(Lhg2;)Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    iget-object v8, v3, Lhg2;->b:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    if-eqz v9, :cond_c

    .line 45
    .line 46
    array-length v9, v4

    .line 47
    int-to-long v9, v9

    .line 48
    invoke-virtual {v0, v1}, Ldq1;->r(Lfg2;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v11

    .line 52
    cmp-long v9, v9, v11

    .line 53
    .line 54
    if-gtz v9, :cond_b

    .line 55
    .line 56
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    if-eqz v9, :cond_a

    .line 61
    .line 62
    iget-boolean v10, v5, Ldl2;->c:Z

    .line 63
    .line 64
    iget-boolean v11, v5, Ldl2;->a:Z

    .line 65
    .line 66
    if-eqz v10, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ldq1;->U(Lfg2;)Ljava/io/File;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-static {v0, v9, v8}, Ldq1;->n(Ldq1;Ljava/io/File;Ljava/io/File;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {v9}, Ljava/io/File;->isDirectory()Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-eqz v9, :cond_9

    .line 81
    .line 82
    :goto_0
    invoke-virtual {v0, v1}, Ldq1;->U(Lfg2;)Ljava/io/File;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    invoke-static {v8, v7, v9}, Ldq1;->C(Ljava/io/File;Ljava/io/File;Z)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-eqz v8, :cond_2

    .line 98
    .line 99
    if-eqz v11, :cond_1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    const/16 v16, 0x0

    .line 103
    .line 104
    const/16 v17, 0x1c

    .line 105
    .line 106
    const-string v12, "ALREADY_EXISTS"

    .line 107
    .line 108
    const-string v13, "Target already exists."

    .line 109
    .line 110
    const/4 v14, 0x0

    .line 111
    const/4 v15, 0x0

    .line 112
    invoke-static/range {v12 .. v17}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_6

    .line 116
    .line 117
    :cond_2
    :goto_1
    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-nez v8, :cond_8

    .line 122
    .line 123
    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    if-eqz v8, :cond_3

    .line 128
    .line 129
    move-object v8, v7

    .line 130
    goto :goto_2

    .line 131
    :cond_3
    move-object v8, v6

    .line 132
    :goto_2
    array-length v9, v4

    .line 133
    int-to-long v9, v9

    .line 134
    invoke-virtual {v0, v1}, Ldq1;->U(Lfg2;)Ljava/io/File;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    invoke-static {v12}, Ldq1;->s(Ljava/io/File;)J

    .line 139
    .line 140
    .line 141
    move-result-wide v12

    .line 142
    if-eqz v8, :cond_4

    .line 143
    .line 144
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 145
    .line 146
    .line 147
    move-result-wide v14

    .line 148
    goto :goto_3

    .line 149
    :cond_4
    const-wide/16 v14, 0x0

    .line 150
    .line 151
    :goto_3
    sub-long/2addr v12, v14

    .line 152
    add-long/2addr v12, v9

    .line 153
    invoke-virtual {v0, v1}, Ldq1;->r(Lfg2;)J

    .line 154
    .line 155
    .line 156
    move-result-wide v8

    .line 157
    cmp-long v1, v12, v8

    .line 158
    .line 159
    if-gtz v1, :cond_7

    .line 160
    .line 161
    iget-boolean v1, v5, Ldl2;->b:Z

    .line 162
    .line 163
    const/16 v5, 0x2000

    .line 164
    .line 165
    if-eqz v1, :cond_6

    .line 166
    .line 167
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    if-eqz v1, :cond_5

    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    const-string v6, ".tmp"

    .line 178
    .line 179
    new-array v2, v2, [Ljava/nio/file/attribute/FileAttribute;

    .line 180
    .line 181
    const-string v8, ".nuke-"

    .line 182
    .line 183
    invoke-static {v1, v8, v6, v2}, Ljava/nio/file/Files;->createTempFile(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-interface {v1}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 197
    .line 198
    .line 199
    new-instance v6, Ljava/io/BufferedOutputStream;

    .line 200
    .line 201
    invoke-direct {v6, v2, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    .line 203
    .line 204
    :try_start_1
    invoke-virtual {v6, v4}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 205
    .line 206
    .line 207
    :try_start_2
    invoke-interface {v6}, Ljava/io/Closeable;->close()V

    .line 208
    .line 209
    .line 210
    invoke-static {v1, v7, v11}, Ldq1;->J(Ljava/io/File;Ljava/io/File;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 214
    .line 215
    .line 216
    goto :goto_5

    .line 217
    :catchall_0
    move-exception v0

    .line 218
    goto :goto_4

    .line 219
    :catchall_1
    move-exception v0

    .line 220
    move-object v2, v0

    .line 221
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 222
    :catchall_2
    move-exception v0

    .line 223
    :try_start_4
    invoke-static {v6, v2}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 227
    :goto_4
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 228
    .line 229
    .line 230
    throw v0

    .line 231
    :cond_5
    const-string v0, "Target has no parent directory."

    .line 232
    .line 233
    invoke-static {v0}, Lc80;->v(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_6
    new-instance v1, Ljava/io/FileOutputStream;

    .line 238
    .line 239
    invoke-direct {v1, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 240
    .line 241
    .line 242
    new-instance v2, Ljava/io/BufferedOutputStream;

    .line 243
    .line 244
    invoke-direct {v2, v1, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 245
    .line 246
    .line 247
    :try_start_5
    invoke-virtual {v2, v4}, Ljava/io/OutputStream;->write([B)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 248
    .line 249
    .line 250
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 251
    .line 252
    .line 253
    :goto_5
    invoke-virtual {v0, v3, v7}, Ldq1;->W(Lhg2;Ljava/io/File;)Lgg2;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    goto :goto_6

    .line 258
    :catchall_3
    move-exception v0

    .line 259
    move-object v1, v0

    .line 260
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 261
    :catchall_4
    move-exception v0

    .line 262
    invoke-static {v2, v1}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 263
    .line 264
    .line 265
    throw v0

    .line 266
    :cond_7
    const/4 v11, 0x0

    .line 267
    const/16 v12, 0x1c

    .line 268
    .line 269
    const-string v7, "QUOTA_EXCEEDED"

    .line 270
    .line 271
    const-string v8, "Script storage quota has been exceeded."

    .line 272
    .line 273
    const/4 v9, 0x0

    .line 274
    const/4 v10, 0x0

    .line 275
    invoke-static/range {v7 .. v12}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 276
    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_8
    const/4 v4, 0x0

    .line 280
    const/16 v5, 0x1c

    .line 281
    .line 282
    const-string v0, "ALREADY_EXISTS"

    .line 283
    .line 284
    const-string v1, "Target is a directory."

    .line 285
    .line 286
    const/4 v2, 0x0

    .line 287
    const/4 v3, 0x0

    .line 288
    invoke-static/range {v0 .. v5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 289
    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_9
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 293
    .line 294
    const-string v1, "Parent directory does not exist: "

    .line 295
    .line 296
    invoke-virtual {v1, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v0

    .line 304
    :cond_a
    const/4 v11, 0x0

    .line 305
    const/16 v12, 0x1c

    .line 306
    .line 307
    const-string v7, "IO_ERROR"

    .line 308
    .line 309
    const-string v8, "File has no parent directory."

    .line 310
    .line 311
    const/4 v9, 0x0

    .line 312
    const/4 v10, 0x0

    .line 313
    invoke-static/range {v7 .. v12}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 314
    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_b
    const/4 v4, 0x0

    .line 318
    const/16 v5, 0x1c

    .line 319
    .line 320
    const-string v0, "QUOTA_EXCEEDED"

    .line 321
    .line 322
    const-string v1, "File exceeds the storage quota."

    .line 323
    .line 324
    const/4 v2, 0x0

    .line 325
    const/4 v3, 0x0

    .line 326
    invoke-static/range {v0 .. v5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 327
    .line 328
    .line 329
    goto :goto_6

    .line 330
    :cond_c
    const/4 v11, 0x0

    .line 331
    const/16 v12, 0x1c

    .line 332
    .line 333
    const-string v7, "INVALID_ARGUMENT"

    .line 334
    .line 335
    const-string v8, "Cannot write an area root as a file."

    .line 336
    .line 337
    const/4 v9, 0x0

    .line 338
    const/4 v10, 0x0

    .line 339
    invoke-static/range {v7 .. v12}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 340
    .line 341
    .line 342
    :goto_6
    return-object v6

    .line 343
    :pswitch_0
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    iget-object v0, v0, Lr10;->m:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v0, Lj20;

    .line 349
    .line 350
    new-instance v1, Lq10;

    .line 351
    .line 352
    check-cast v3, Ls12;

    .line 353
    .line 354
    check-cast v4, Lkz2;

    .line 355
    .line 356
    invoke-direct {v1, v3, v4, v6, v2}, Lq10;-><init>(Ls12;Lkz2;Lt00;I)V

    .line 357
    .line 358
    .line 359
    const/4 v2, 0x1

    .line 360
    invoke-static {v0, v6, v1, v2}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 361
    .line 362
    .line 363
    new-instance v1, La2;

    .line 364
    .line 365
    check-cast v5, Lb03;

    .line 366
    .line 367
    const/16 v4, 0xc

    .line 368
    .line 369
    invoke-direct {v1, v3, v5, v6, v4}, La2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 370
    .line 371
    .line 372
    invoke-static {v0, v6, v1, v2}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 373
    .line 374
    .line 375
    sget-object v0, La83;->a:La83;

    .line 376
    .line 377
    return-object v0

    .line 378
    nop

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
