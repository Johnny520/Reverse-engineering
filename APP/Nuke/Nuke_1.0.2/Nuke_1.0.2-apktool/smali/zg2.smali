.class public final Lzg2;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:Ldq1;

.field public final synthetic m:Lhg2;

.field public final synthetic n:J

.field public final synthetic o:Z

.field public final synthetic p:Z

.field public final synthetic q:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Lt00;Ldq1;Lhg2;JZZLjava/io/InputStream;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lzg2;->l:Ldq1;

    .line 2
    .line 3
    iput-object p3, p0, Lzg2;->m:Lhg2;

    .line 4
    .line 5
    iput-wide p4, p0, Lzg2;->n:J

    .line 6
    .line 7
    iput-boolean p6, p0, Lzg2;->o:Z

    .line 8
    .line 9
    iput-boolean p7, p0, Lzg2;->p:Z

    .line 10
    .line 11
    iput-object p8, p0, Lzg2;->q:Ljava/io/InputStream;

    .line 12
    .line 13
    const/4 p2, 0x2

    .line 14
    invoke-direct {p0, p2, p1}, Ltw2;-><init>(ILt00;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lj20;

    .line 2
    .line 3
    check-cast p2, Lt00;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lzg2;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lzg2;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lzg2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 9

    .line 1
    new-instance v0, Lzg2;

    .line 2
    .line 3
    iget-boolean v7, p0, Lzg2;->p:Z

    .line 4
    .line 5
    iget-object v8, p0, Lzg2;->q:Ljava/io/InputStream;

    .line 6
    .line 7
    iget-object v2, p0, Lzg2;->l:Ldq1;

    .line 8
    .line 9
    iget-object v3, p0, Lzg2;->m:Lhg2;

    .line 10
    .line 11
    iget-wide v4, p0, Lzg2;->n:J

    .line 12
    .line 13
    iget-boolean v6, p0, Lzg2;->o:Z

    .line 14
    .line 15
    move-object v1, p1

    .line 16
    invoke-direct/range {v0 .. v8}, Lzg2;-><init>(Lt00;Ldq1;Lhg2;JZZLjava/io/InputStream;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lzg2;->m:Lhg2;

    .line 7
    .line 8
    invoke-static {v1}, Ldq1;->S(Lhg2;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, v1, Lhg2;->a:Lfg2;

    .line 12
    .line 13
    iget-object v3, v1, Lhg2;->b:Ljava/lang/String;

    .line 14
    .line 15
    iget-wide v4, v0, Lzg2;->n:J

    .line 16
    .line 17
    const-wide/16 v6, 0x0

    .line 18
    .line 19
    cmp-long v8, v4, v6

    .line 20
    .line 21
    const/4 v9, 0x0

    .line 22
    if-lez v8, :cond_e

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    if-eqz v8, :cond_d

    .line 29
    .line 30
    iget-object v8, v0, Lzg2;->l:Ldq1;

    .line 31
    .line 32
    invoke-virtual {v8, v1}, Ldq1;->T(Lhg2;)Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    invoke-virtual {v8, v2}, Ldq1;->U(Lfg2;)Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object v11

    .line 40
    invoke-virtual {v10}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    if-eqz v12, :cond_c

    .line 45
    .line 46
    iget-boolean v13, v0, Lzg2;->o:Z

    .line 47
    .line 48
    if-eqz v13, :cond_0

    .line 49
    .line 50
    invoke-static {v8, v12, v11}, Ldq1;->n(Ldq1;Ljava/io/File;Ljava/io/File;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v12}, Ljava/io/File;->isDirectory()Z

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    if-eqz v13, :cond_b

    .line 59
    .line 60
    :goto_0
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-static {v11, v10, v3}, Ldq1;->C(Ljava/io/File;Ljava/io/File;Z)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    iget-boolean v13, v0, Lzg2;->p:Z

    .line 72
    .line 73
    if-eqz v3, :cond_2

    .line 74
    .line 75
    if-eqz v13, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    const/16 v18, 0x0

    .line 79
    .line 80
    const/16 v19, 0x1c

    .line 81
    .line 82
    const-string v14, "ALREADY_EXISTS"

    .line 83
    .line 84
    const-string v15, "Target already exists."

    .line 85
    .line 86
    const/16 v16, 0x0

    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    invoke-static/range {v14 .. v19}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 91
    .line 92
    .line 93
    return-object v9

    .line 94
    :cond_2
    :goto_1
    invoke-virtual {v10}, Ljava/io/File;->isDirectory()Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-nez v3, :cond_a

    .line 99
    .line 100
    invoke-static {v11}, Ldq1;->s(Ljava/io/File;)J

    .line 101
    .line 102
    .line 103
    move-result-wide v14

    .line 104
    invoke-virtual {v10}, Ljava/io/File;->isFile()Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_3

    .line 109
    .line 110
    move-object v3, v10

    .line 111
    goto :goto_2

    .line 112
    :cond_3
    move-object v3, v9

    .line 113
    :goto_2
    if-eqz v3, :cond_4

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 116
    .line 117
    .line 118
    move-result-wide v16

    .line 119
    goto :goto_3

    .line 120
    :cond_4
    move-wide/from16 v16, v6

    .line 121
    .line 122
    :goto_3
    invoke-virtual {v8, v2}, Ldq1;->r(Lfg2;)J

    .line 123
    .line 124
    .line 125
    move-result-wide v2

    .line 126
    sub-long v14, v14, v16

    .line 127
    .line 128
    sub-long/2addr v2, v14

    .line 129
    cmp-long v11, v2, v6

    .line 130
    .line 131
    if-lez v11, :cond_9

    .line 132
    .line 133
    invoke-virtual {v12}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    const-string v11, ".download"

    .line 138
    .line 139
    const/4 v12, 0x0

    .line 140
    new-array v14, v12, [Ljava/nio/file/attribute/FileAttribute;

    .line 141
    .line 142
    const-string v15, ".nuke-"

    .line 143
    .line 144
    invoke-static {v9, v15, v11, v14}, Ljava/nio/file/Files;->createTempFile(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    invoke-interface {v9}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    :try_start_0
    new-instance v11, Ljava/io/FileOutputStream;

    .line 153
    .line 154
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-direct {v11, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 158
    .line 159
    .line 160
    const/16 v14, 0x2000

    .line 161
    .line 162
    new-instance v15, Ljava/io/BufferedOutputStream;

    .line 163
    .line 164
    invoke-direct {v15, v11, v14}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    .line 166
    .line 167
    :try_start_1
    new-array v11, v14, [B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 168
    .line 169
    :goto_4
    :try_start_2
    iget-object v14, v0, Lzg2;->q:Ljava/io/InputStream;

    .line 170
    .line 171
    invoke-virtual {v14, v11}, Ljava/io/InputStream;->read([B)I

    .line 172
    .line 173
    .line 174
    move-result v14
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 175
    if-gez v14, :cond_5

    .line 176
    .line 177
    :try_start_3
    invoke-interface {v15}, Ljava/io/Closeable;->close()V

    .line 178
    .line 179
    .line 180
    invoke-static {v9, v10, v13}, Ldq1;->J(Ljava/io/File;Ljava/io/File;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 184
    .line 185
    .line 186
    invoke-virtual {v8, v1, v10}, Ldq1;->W(Lhg2;Ljava/io/File;)Lgg2;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0

    .line 191
    :catchall_0
    move-exception v0

    .line 192
    goto :goto_6

    .line 193
    :cond_5
    if-nez v14, :cond_6

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_6
    move/from16 v16, v13

    .line 197
    .line 198
    int-to-long v12, v14

    .line 199
    :try_start_4
    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->addExact(JJ)J

    .line 200
    .line 201
    .line 202
    move-result-wide v6

    .line 203
    cmp-long v12, v6, v4

    .line 204
    .line 205
    if-gtz v12, :cond_8

    .line 206
    .line 207
    cmp-long v12, v6, v2

    .line 208
    .line 209
    if-gtz v12, :cond_7

    .line 210
    .line 211
    const/4 v12, 0x0

    .line 212
    invoke-virtual {v15, v11, v12, v14}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 213
    .line 214
    .line 215
    move/from16 v13, v16

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :catchall_1
    move-exception v0

    .line 219
    move-object v1, v0

    .line 220
    goto :goto_5

    .line 221
    :cond_7
    new-instance v1, Lsd2;

    .line 222
    .line 223
    const-string v2, "QUOTA_EXCEEDED"

    .line 224
    .line 225
    const-string v3, "Script storage quota has been exceeded."

    .line 226
    .line 227
    const/4 v6, 0x0

    .line 228
    const/16 v7, 0x1c

    .line 229
    .line 230
    const/4 v4, 0x0

    .line 231
    const/4 v5, 0x0

    .line 232
    invoke-direct/range {v1 .. v7}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 233
    .line 234
    .line 235
    throw v1

    .line 236
    :cond_8
    new-instance v1, Lsd2;

    .line 237
    .line 238
    const-string v2, "QUOTA_EXCEEDED"

    .line 239
    .line 240
    const-string v3, "Download exceeds the size limit."

    .line 241
    .line 242
    const/4 v6, 0x0

    .line 243
    const/16 v7, 0x1c

    .line 244
    .line 245
    const/4 v4, 0x0

    .line 246
    const/4 v5, 0x0

    .line 247
    invoke-direct/range {v1 .. v7}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 248
    .line 249
    .line 250
    throw v1

    .line 251
    :catch_0
    move-exception v0

    .line 252
    new-instance v1, Lcg2;

    .line 253
    .line 254
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 258
    :goto_5
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 259
    :catchall_2
    move-exception v0

    .line 260
    :try_start_6
    invoke-static {v15, v1}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 264
    :goto_6
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 265
    .line 266
    .line 267
    throw v0

    .line 268
    :cond_9
    const/4 v5, 0x0

    .line 269
    const/16 v6, 0x1c

    .line 270
    .line 271
    const-string v1, "QUOTA_EXCEEDED"

    .line 272
    .line 273
    const-string v2, "Script storage quota has been exceeded."

    .line 274
    .line 275
    const/4 v3, 0x0

    .line 276
    const/4 v4, 0x0

    .line 277
    invoke-static/range {v1 .. v6}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 278
    .line 279
    .line 280
    return-object v9

    .line 281
    :cond_a
    const/4 v14, 0x0

    .line 282
    const/16 v15, 0x1c

    .line 283
    .line 284
    const-string v10, "ALREADY_EXISTS"

    .line 285
    .line 286
    const-string v11, "Target is a directory."

    .line 287
    .line 288
    const/4 v12, 0x0

    .line 289
    const/4 v13, 0x0

    .line 290
    invoke-static/range {v10 .. v15}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 291
    .line 292
    .line 293
    return-object v9

    .line 294
    :cond_b
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 295
    .line 296
    const-string v1, "Parent directory does not exist: "

    .line 297
    .line 298
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw v0

    .line 306
    :cond_c
    const/4 v6, 0x0

    .line 307
    const/16 v7, 0x1c

    .line 308
    .line 309
    const-string v2, "IO_ERROR"

    .line 310
    .line 311
    const-string v3, "File has no parent directory."

    .line 312
    .line 313
    const/4 v4, 0x0

    .line 314
    const/4 v5, 0x0

    .line 315
    invoke-static/range {v2 .. v7}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 316
    .line 317
    .line 318
    return-object v9

    .line 319
    :cond_d
    const/4 v14, 0x0

    .line 320
    const/16 v15, 0x1c

    .line 321
    .line 322
    const-string v10, "INVALID_ARGUMENT"

    .line 323
    .line 324
    const-string v11, "Cannot write an area root as a file."

    .line 325
    .line 326
    const/4 v12, 0x0

    .line 327
    const/4 v13, 0x0

    .line 328
    invoke-static/range {v10 .. v15}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 329
    .line 330
    .line 331
    return-object v9

    .line 332
    :cond_e
    const-string v0, "maxBytes must be positive."

    .line 333
    .line 334
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    return-object v9
.end method
