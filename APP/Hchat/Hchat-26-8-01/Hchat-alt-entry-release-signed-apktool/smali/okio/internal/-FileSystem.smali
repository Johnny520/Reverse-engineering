.class public final Lokio/internal/-FileSystem;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static final collectRecursively(Lng/l;Lokio/FileSystem;Ltf/k;Lokio/Path;ZZLwf/c;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lng/l;",
            "Lokio/FileSystem;",
            "Ltf/k;",
            "Lokio/Path;",
            "ZZ",
            "Lwf/c;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p5

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    instance-of v4, v3, Lokio/internal/-FileSystem$collectRecursively$1;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lokio/internal/-FileSystem$collectRecursively$1;

    .line 15
    .line 16
    iget v5, v4, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lokio/internal/-FileSystem$collectRecursively$1;

    .line 29
    .line 30
    invoke-direct {v4, v3}, Lokio/internal/-FileSystem$collectRecursively$1;-><init>(Lwf/c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, Lokio/internal/-FileSystem$collectRecursively$1;->result:Ljava/lang/Object;

    .line 34
    .line 35
    iget v5, v4, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 36
    .line 37
    sget-object v6, Lsf/n;->a:Lsf/n;

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x1

    .line 42
    sget-object v10, Lxf/a;->g:Lxf/a;

    .line 43
    .line 44
    if-eqz v5, :cond_4

    .line 45
    .line 46
    if-eq v5, v9, :cond_3

    .line 47
    .line 48
    if-eq v5, v8, :cond_2

    .line 49
    .line 50
    if-ne v5, v7, :cond_1

    .line 51
    .line 52
    invoke-static {v3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object v6

    .line 56
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    const/4 v0, 0x0

    .line 62
    return-object v0

    .line 63
    :cond_2
    iget-boolean v0, v4, Lokio/internal/-FileSystem$collectRecursively$1;->Z$1:Z

    .line 64
    .line 65
    iget-boolean v1, v4, Lokio/internal/-FileSystem$collectRecursively$1;->Z$0:Z

    .line 66
    .line 67
    iget-object v2, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$4:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Ljava/util/Iterator;

    .line 70
    .line 71
    iget-object v5, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v5, Lokio/Path;

    .line 74
    .line 75
    iget-object v9, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v9, Ltf/k;

    .line 78
    .line 79
    iget-object v11, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v11, Lokio/FileSystem;

    .line 82
    .line 83
    iget-object v12, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v12, Lng/l;

    .line 86
    .line 87
    :try_start_0
    invoke-static {v3}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    move v3, v1

    .line 91
    move v1, v0

    .line 92
    move v0, v3

    .line 93
    move-object v3, v5

    .line 94
    :goto_2
    move-object v5, v9

    .line 95
    move-object v9, v11

    .line 96
    move-object v11, v12

    .line 97
    goto/16 :goto_6

    .line 98
    .line 99
    :catchall_0
    move-exception v0

    .line 100
    goto/16 :goto_7

    .line 101
    .line 102
    :cond_3
    iget-boolean v0, v4, Lokio/internal/-FileSystem$collectRecursively$1;->Z$1:Z

    .line 103
    .line 104
    iget-boolean v1, v4, Lokio/internal/-FileSystem$collectRecursively$1;->Z$0:Z

    .line 105
    .line 106
    iget-object v2, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Lokio/Path;

    .line 109
    .line 110
    iget-object v5, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v5, Ltf/k;

    .line 113
    .line 114
    iget-object v9, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v9, Lokio/FileSystem;

    .line 117
    .line 118
    iget-object v11, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v11, Lng/l;

    .line 121
    .line 122
    invoke-static {v3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    move-object v15, v2

    .line 126
    move v2, v0

    .line 127
    move v0, v1

    .line 128
    move-object v1, v15

    .line 129
    goto :goto_3

    .line 130
    :cond_4
    invoke-static {v3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    if-nez v2, :cond_5

    .line 134
    .line 135
    iput-object v0, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 136
    .line 137
    move-object/from16 v3, p1

    .line 138
    .line 139
    iput-object v3, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 140
    .line 141
    move-object/from16 v5, p2

    .line 142
    .line 143
    iput-object v5, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object v1, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 146
    .line 147
    move/from16 v11, p4

    .line 148
    .line 149
    iput-boolean v11, v4, Lokio/internal/-FileSystem$collectRecursively$1;->Z$0:Z

    .line 150
    .line 151
    iput-boolean v2, v4, Lokio/internal/-FileSystem$collectRecursively$1;->Z$1:Z

    .line 152
    .line 153
    iput v9, v4, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 154
    .line 155
    invoke-virtual {v0, v1, v4}, Lng/l;->a(Ljava/lang/Object;Lwf/c;)V

    .line 156
    .line 157
    .line 158
    return-object v10

    .line 159
    :cond_5
    move-object/from16 v3, p1

    .line 160
    .line 161
    move-object/from16 v5, p2

    .line 162
    .line 163
    move/from16 v11, p4

    .line 164
    .line 165
    move v9, v11

    .line 166
    move-object v11, v0

    .line 167
    move v0, v9

    .line 168
    move-object v9, v3

    .line 169
    :goto_3
    invoke-virtual {v9, v1}, Lokio/FileSystem;->listOrNull(Lokio/Path;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    if-nez v3, :cond_6

    .line 174
    .line 175
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 176
    .line 177
    :cond_6
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v12

    .line 181
    if-nez v12, :cond_d

    .line 182
    .line 183
    const/4 v12, 0x0

    .line 184
    move-object v13, v1

    .line 185
    :goto_4
    if-eqz v0, :cond_8

    .line 186
    .line 187
    invoke-virtual {v5, v13}, Ltf/k;->contains(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v14

    .line 191
    if-nez v14, :cond_7

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_7
    const-string v0, "symlink cycle at "

    .line 195
    .line 196
    invoke-static {v1, v0}, Lj8/b;->m(Lokio/Path;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :cond_8
    :goto_5
    invoke-static {v9, v13}, Lokio/internal/-FileSystem;->symlinkTarget(Lokio/FileSystem;Lokio/Path;)Lokio/Path;

    .line 206
    .line 207
    .line 208
    move-result-object v14

    .line 209
    if-nez v14, :cond_c

    .line 210
    .line 211
    if-nez v0, :cond_9

    .line 212
    .line 213
    if-nez v12, :cond_d

    .line 214
    .line 215
    :cond_9
    invoke-virtual {v5, v13}, Ltf/k;->addLast(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :try_start_1
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    move-object v15, v3

    .line 223
    move-object v3, v1

    .line 224
    move v1, v2

    .line 225
    move-object v2, v15

    .line 226
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    if-eqz v12, :cond_b

    .line 231
    .line 232
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v12

    .line 236
    check-cast v12, Lokio/Path;

    .line 237
    .line 238
    iput-object v11, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v9, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 241
    .line 242
    iput-object v5, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 243
    .line 244
    iput-object v3, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 245
    .line 246
    iput-object v2, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$4:Ljava/lang/Object;

    .line 247
    .line 248
    iput-boolean v0, v4, Lokio/internal/-FileSystem$collectRecursively$1;->Z$0:Z

    .line 249
    .line 250
    iput-boolean v1, v4, Lokio/internal/-FileSystem$collectRecursively$1;->Z$1:Z

    .line 251
    .line 252
    iput v8, v4, Lokio/internal/-FileSystem$collectRecursively$1;->label:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 253
    .line 254
    move/from16 p4, v0

    .line 255
    .line 256
    move/from16 p5, v1

    .line 257
    .line 258
    move-object/from16 p6, v4

    .line 259
    .line 260
    move-object/from16 p2, v5

    .line 261
    .line 262
    move-object/from16 p1, v9

    .line 263
    .line 264
    move-object/from16 p0, v11

    .line 265
    .line 266
    move-object/from16 p3, v12

    .line 267
    .line 268
    :try_start_2
    invoke-static/range {p0 .. p6}, Lokio/internal/-FileSystem;->collectRecursively(Lng/l;Lokio/FileSystem;Ltf/k;Lokio/Path;ZZLwf/c;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 272
    move-object/from16 v12, p0

    .line 273
    .line 274
    move-object/from16 v11, p1

    .line 275
    .line 276
    move-object/from16 v9, p2

    .line 277
    .line 278
    move/from16 v4, p4

    .line 279
    .line 280
    move/from16 v1, p5

    .line 281
    .line 282
    move-object/from16 v5, p6

    .line 283
    .line 284
    if-ne v0, v10, :cond_a

    .line 285
    .line 286
    return-object v10

    .line 287
    :cond_a
    move v0, v4

    .line 288
    move-object v4, v5

    .line 289
    goto/16 :goto_2

    .line 290
    .line 291
    :catchall_1
    move-exception v0

    .line 292
    move-object/from16 v9, p2

    .line 293
    .line 294
    goto :goto_7

    .line 295
    :catchall_2
    move-exception v0

    .line 296
    move-object v9, v5

    .line 297
    goto :goto_7

    .line 298
    :cond_b
    move-object v9, v5

    .line 299
    move-object v12, v11

    .line 300
    move-object v5, v4

    .line 301
    invoke-virtual {v9}, Ltf/k;->removeLast()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move v2, v1

    .line 305
    move-object v1, v3

    .line 306
    goto :goto_8

    .line 307
    :goto_7
    invoke-virtual {v9}, Ltf/k;->removeLast()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    throw v0

    .line 311
    :cond_c
    add-int/lit8 v12, v12, 0x1

    .line 312
    .line 313
    move-object v13, v14

    .line 314
    goto/16 :goto_4

    .line 315
    .line 316
    :cond_d
    :goto_8
    if-eqz v2, :cond_e

    .line 317
    .line 318
    const/4 v0, 0x0

    .line 319
    iput-object v0, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 320
    .line 321
    iput-object v0, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 322
    .line 323
    iput-object v0, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 324
    .line 325
    iput-object v0, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 326
    .line 327
    iput-object v0, v4, Lokio/internal/-FileSystem$collectRecursively$1;->L$4:Ljava/lang/Object;

    .line 328
    .line 329
    iput v7, v4, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 330
    .line 331
    invoke-virtual {v11, v1, v4}, Lng/l;->a(Ljava/lang/Object;Lwf/c;)V

    .line 332
    .line 333
    .line 334
    return-object v10

    .line 335
    :cond_e
    return-object v6
.end method

.method public static final commonCopy(Lokio/FileSystem;Lokio/Path;Lokio/Path;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lokio/FileSystem;->source(Lokio/Path;)Lokio/Source;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v0, 0x0

    .line 15
    :try_start_0
    invoke-virtual {p0, p2}, Lokio/FileSystem;->sink(Lokio/Path;)Lokio/Sink;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 23
    :try_start_1
    invoke-interface {p0, p1}, Lokio/BufferedSink;->writeAll(Lokio/Source;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto :goto_2

    .line 39
    :cond_0
    :goto_0
    move-object p0, v0

    .line 40
    goto :goto_2

    .line 41
    :catchall_1
    move-exception p2

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    :try_start_3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_2
    move-exception p0

    .line 49
    :try_start_4
    invoke-static {p2, p0}, Lac/p;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catchall_3
    move-exception p0

    .line 54
    goto :goto_3

    .line 55
    :cond_1
    :goto_1
    move-object p0, p2

    .line 56
    move-object p2, v0

    .line 57
    :goto_2
    if-nez p0, :cond_2

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    :try_start_5
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 73
    .line 74
    .line 75
    goto :goto_5

    .line 76
    :catchall_4
    move-exception v0

    .line 77
    goto :goto_5

    .line 78
    :cond_2
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 79
    :goto_3
    if-eqz p1, :cond_3

    .line 80
    .line 81
    :try_start_7
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 82
    .line 83
    .line 84
    goto :goto_4

    .line 85
    :catchall_5
    move-exception p1

    .line 86
    invoke-static {p0, p1}, Lac/p;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    :goto_4
    move-object v3, v0

    .line 90
    move-object v0, p0

    .line 91
    move-object p0, v3

    .line 92
    :cond_4
    :goto_5
    if-nez v0, :cond_5

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_5
    throw v0
.end method

.method public static final commonCreateDirectories(Lokio/FileSystem;Lokio/Path;Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ltf/k;

    .line 8
    .line 9
    invoke-direct {v0}, Ltf/k;-><init>()V

    .line 10
    .line 11
    .line 12
    move-object v1, p1

    .line 13
    :goto_0
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lokio/FileSystem;->exists(Lokio/Path;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ltf/k;->addFirst(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lokio/Path;->parent()Lokio/Path;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-eqz p2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Ltf/k;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-nez p2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, " already exists."

    .line 39
    .line 40
    invoke-static {p1, p0}, Lj8/o;->h(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_3

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    check-cast p2, Lokio/Path;

    .line 59
    .line 60
    invoke-virtual {p0, p2}, Lokio/FileSystem;->createDirectory(Lokio/Path;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    return-void
.end method

.method public static final commonDeleteRecursively(Lokio/FileSystem;Lokio/Path;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, p1, v1}, Lokio/internal/-FileSystem$commonDeleteRecursively$sequence$1;-><init>(Lokio/FileSystem;Lokio/Path;Lwf/c;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lfb/v0;->B(Lfg/p;)Lng/k;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-virtual {p1}, Lng/k;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Lng/k;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lokio/Path;

    .line 28
    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Lng/k;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const/4 v1, 0x0

    .line 40
    :goto_1
    invoke-virtual {p0, v0, v1}, Lokio/FileSystem;->delete(Lokio/Path;Z)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-void
.end method

.method public static final commonExists(Lokio/FileSystem;Lokio/Path;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lokio/FileSystem;->metadataOrNull(Lokio/Path;)Lokio/FileMetadata;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static final commonListRecursively(Lokio/FileSystem;Lokio/Path;Z)Lng/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/FileSystem;",
            "Lokio/Path;",
            "Z)",
            "Lng/j;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lokio/internal/-FileSystem$commonListRecursively$1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p1, p0, p2, v1}, Lokio/internal/-FileSystem$commonListRecursively$1;-><init>(Lokio/Path;Lokio/FileSystem;ZLwf/c;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Ldg/n;

    .line 14
    .line 15
    invoke-direct {p0, v0}, Ldg/n;-><init>(Lfg/p;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public static final commonMetadata(Lokio/FileSystem;Lokio/Path;)Lokio/FileMetadata;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lokio/FileSystem;->metadataOrNull(Lokio/Path;)Lokio/FileMetadata;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p0, Ljava/io/FileNotFoundException;

    .line 15
    .line 16
    const-string v0, "no such file: "

    .line 17
    .line 18
    invoke-static {p1, v0}, Lj8/b;->m(Lokio/Path;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static final symlinkTarget(Lokio/FileSystem;Lokio/Path;)Lokio/Path;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lokio/FileSystem;->metadata(Lokio/Path;)Lokio/FileMetadata;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lokio/FileMetadata;->getSymlinkTarget()Lokio/Path;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p1}, Lokio/Path;->parent()Lokio/Path;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Lokio/Path;->resolve(Lokio/Path;)Lokio/Path;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method
