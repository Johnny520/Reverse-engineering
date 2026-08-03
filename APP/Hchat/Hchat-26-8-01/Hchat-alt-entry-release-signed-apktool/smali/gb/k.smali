.class public abstract Lgb/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "info.prop"

    .line 2
    .line 3
    const-string v1, "README.md"

    .line 4
    .line 5
    const-string v2, "main.java"

    .line 6
    .line 7
    const-string v3, "main.java.bshs"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lgb/k;->a:Ljava/util/Set;

    .line 18
    .line 19
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "README.md"

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :try_start_0
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 9
    .line 10
    move-object/from16 v3, p0

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->listPlugins(Landroid/content/Context;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object v5, v3

    .line 32
    check-cast v5, Leb/c0;

    .line 33
    .line 34
    iget-object v5, v5, Leb/c0;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v3, v4

    .line 44
    :goto_0
    check-cast v3, Leb/c0;

    .line 45
    .line 46
    if-eqz v3, :cond_14

    .line 47
    .line 48
    iget-object v9, v3, Leb/c0;->f:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v8, v3, Leb/c0;->e:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v6, v3, Leb/c0;->a:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v0, v3, Leb/c0;->c:Ljava/io/File;

    .line 55
    .line 56
    new-instance v15, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v2, "main.java"

    .line 62
    .line 63
    const/4 v5, 0x1

    .line 64
    invoke-static {v0, v2, v5, v2}, Lgb/k;->p(Ljava/io/File;Ljava/lang/String;ZLjava/lang/String;)Lgb/g;

    .line 65
    .line 66
    .line 67
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    const-string v7, "Required value was null."

    .line 69
    .line 70
    if-eqz v2, :cond_13

    .line 71
    .line 72
    :try_start_1
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Lgb/k;->q(Ljava/io/File;)Lgb/g;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v2, :cond_2

    .line 80
    .line 81
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :cond_2
    const-string v2, "info.prop"

    .line 85
    .line 86
    const/4 v10, 0x0

    .line 87
    invoke-static {v0, v2, v10, v2}, Lgb/k;->p(Ljava/io/File;Ljava/lang/String;ZLjava/lang/String;)Lgb/g;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :cond_3
    new-instance v2, Ljava/io/File;

    .line 97
    .line 98
    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-eqz v11, :cond_4

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    move-object v2, v4

    .line 109
    :goto_1
    if-eqz v2, :cond_5

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    new-instance v2, Ljava/io/File;

    .line 113
    .line 114
    const-string v11, "readme.md"

    .line 115
    .line 116
    invoke-direct {v2, v0, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-eqz v11, :cond_6

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    move-object v2, v4

    .line 127
    :goto_2
    if-eqz v2, :cond_7

    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-static {v0, v2, v5, v1}, Lgb/k;->p(Ljava/io/File;Ljava/lang/String;ZLjava/lang/String;)Lgb/g;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    :cond_7
    move-object/from16 v0, p4

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 149
    .line 150
    invoke-direct {v0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v0

    .line 154
    :goto_3
    invoke-static {v15, v0}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v15, v10}, Lgb/k;->v(Ljava/util/List;Z)V

    .line 158
    .line 159
    .line 160
    if-eqz p2, :cond_9

    .line 161
    .line 162
    invoke-static/range {p2 .. p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    goto :goto_4

    .line 171
    :cond_9
    move-object v0, v4

    .line 172
    :goto_4
    if-eqz v0, :cond_b

    .line 173
    .line 174
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_a

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_a
    move v5, v10

    .line 182
    :cond_b
    :goto_5
    if-nez v5, :cond_c

    .line 183
    .line 184
    move-object v4, v0

    .line 185
    :cond_c
    if-eqz v4, :cond_d

    .line 186
    .line 187
    :goto_6
    move-object v7, v4

    .line 188
    goto :goto_7

    .line 189
    :cond_d
    iget-object v4, v3, Leb/c0;->b:Ljava/lang/String;

    .line 190
    .line 191
    goto :goto_6

    .line 192
    :goto_7
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    const/16 v1, 0x80

    .line 197
    .line 198
    if-gt v0, v1, :cond_12

    .line 199
    .line 200
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    const/16 v1, 0x64

    .line 205
    .line 206
    if-gt v0, v1, :cond_11

    .line 207
    .line 208
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-gt v0, v1, :cond_10

    .line 213
    .line 214
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    const/16 v1, 0x40

    .line 219
    .line 220
    if-gt v0, v1, :cond_f

    .line 221
    .line 222
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    const/16 v1, 0x1f4

    .line 227
    .line 228
    if-gt v0, v1, :cond_e

    .line 229
    .line 230
    invoke-static {}, Lgb/k;->d()Lgb/j;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    new-instance v5, Lgb/r;

    .line 235
    .line 236
    iget-object v10, v3, Leb/c0;->g:Ljava/lang/String;

    .line 237
    .line 238
    invoke-static/range {p3 .. p3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v11

    .line 246
    iget-object v12, v0, Lgb/j;->a:Ljava/lang/String;

    .line 247
    .line 248
    iget-object v13, v0, Lgb/j;->b:Ljava/lang/String;

    .line 249
    .line 250
    iget-object v14, v0, Lgb/j;->c:Ljava/lang/String;

    .line 251
    .line 252
    invoke-direct/range {v5 .. v15}, Lgb/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 253
    .line 254
    .line 255
    return-object v5

    .line 256
    :cond_e
    const-string v0, "\u66f4\u65b0\u8bf4\u660e\u4e0d\u80fd\u8d85\u8fc7 500 \u4e2a\u5b57\u7b26"

    .line 257
    .line 258
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 259
    .line 260
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v1

    .line 264
    :cond_f
    const-string v0, "\u63d2\u4ef6\u7248\u672c\u4e0d\u80fd\u8d85\u8fc7 64 \u4e2a\u5b57\u7b26"

    .line 265
    .line 266
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 267
    .line 268
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw v1

    .line 272
    :cond_10
    const-string v0, "\u63d2\u4ef6\u4f5c\u8005\u4e0d\u80fd\u8d85\u8fc7 100 \u4e2a\u5b57\u7b26"

    .line 273
    .line 274
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 275
    .line 276
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    throw v1

    .line 280
    :cond_11
    const-string v0, "\u4e0a\u4f20\u63d2\u4ef6\u540d\u4e0d\u80fd\u8d85\u8fc7 100 \u4e2a\u5b57\u7b26"

    .line 281
    .line 282
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 283
    .line 284
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v1

    .line 288
    :cond_12
    const-string v0, "\u672c\u5730\u63d2\u4ef6\u76ee\u5f55\u540d\u4e0d\u80fd\u8d85\u8fc7 128 \u4e2a\u5b57\u7b26"

    .line 289
    .line 290
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 291
    .line 292
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw v1

    .line 296
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 297
    .line 298
    invoke-direct {v0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    throw v0

    .line 302
    :cond_14
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 303
    .line 304
    new-instance v2, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 307
    .line 308
    .line 309
    const-string v3, "\u672a\u627e\u5230\u672c\u5730\u63d2\u4ef6: "

    .line 310
    .line 311
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 329
    :catchall_0
    move-exception v0

    .line 330
    new-instance v1, Lsf/f;

    .line 331
    .line 332
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 333
    .line 334
    .line 335
    return-object v1
.end method

.method public static b(Ljava/io/File;Ljava/io/File;)V
    .locals 5

    .line 1
    invoke-static {p0}, Lgb/k;->j(Ljava/io/File;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p0, "\u521b\u5efa\u63d2\u4ef6\u6682\u5b58\u76ee\u5f55\u5931\u8d25"

    .line 18
    .line 19
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    :goto_0
    new-instance v0, Ldg/j;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    sget-object v2, Ldg/k;->g:Ldg/k;

    .line 27
    .line 28
    invoke-direct {v0, p0, v2, v1}, Ldg/j;-><init>(Ljava/io/File;Ldg/k;Lc9/x;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Ldg/h;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Ldg/h;-><init>(Ldg/j;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ltf/b;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_7

    .line 41
    .line 42
    invoke-virtual {v1}, Ltf/b;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/io/File;

    .line 47
    .line 48
    invoke-static {v0, p0}, Ldg/l;->i0(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-instance v3, Ljava/io/File;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-direct {v3, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_2

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-string p1, "\u521b\u5efa\u76ee\u5f55\u5931\u8d25: "

    .line 85
    .line 86
    invoke-static {p1, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-eqz v2, :cond_6

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-nez v4, :cond_6

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_5

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    const-string p0, "\u521b\u5efa\u7236\u76ee\u5f55\u5931\u8d25"

    .line 114
    .line 115
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_6
    :goto_2
    new-instance v2, Ljava/io/FileInputStream;

    .line 120
    .line 121
    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 122
    .line 123
    .line 124
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    .line 125
    .line 126
    invoke-direct {v0, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    .line 128
    .line 129
    :try_start_1
    invoke-static {v2, v0}, Lg4/a;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 130
    .line 131
    .line 132
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :catchall_0
    move-exception p0

    .line 140
    goto :goto_3

    .line 141
    :catchall_1
    move-exception p0

    .line 142
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 143
    :catchall_2
    move-exception p1

    .line 144
    :try_start_4
    invoke-static {v0, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 148
    :goto_3
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 149
    :catchall_3
    move-exception p1

    .line 150
    invoke-static {v2, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    throw p1

    .line 154
    :cond_7
    return-void
.end method

.method public static c(Ljava/lang/String;[B)Lgb/g;
    .locals 7

    .line 1
    invoke-static {p0}, Lgb/k;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-static {v1}, Lgb/k;->n(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_8

    .line 10
    .line 11
    array-length p0, p1

    .line 12
    int-to-long v2, p0

    .line 13
    const-wide/32 v4, 0x1000000

    .line 14
    .line 15
    .line 16
    cmp-long p0, v2, v4

    .line 17
    .line 18
    if-gtz p0, :cond_7

    .line 19
    .line 20
    :try_start_0
    invoke-static {v1, p1}, Lgb/k;->e(Ljava/lang/String;[B)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    move-object p0, v0

    .line 27
    new-instance v0, Lsf/f;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p0, v0

    .line 33
    :goto_0
    nop

    .line 34
    instance-of v0, p0, Lsf/f;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    :cond_0
    check-cast p0, Ljava/lang/String;

    .line 40
    .line 41
    const-string v0, "utf8"

    .line 42
    .line 43
    if-eqz p0, :cond_4

    .line 44
    .line 45
    array-length v2, p1

    .line 46
    const/4 v3, 0x0

    .line 47
    move v4, v3

    .line 48
    :goto_1
    if-ge v4, v2, :cond_3

    .line 49
    .line 50
    aget-byte v5, p1, v4

    .line 51
    .line 52
    if-nez v5, :cond_1

    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    goto :goto_2

    .line 56
    :cond_1
    move v5, v3

    .line 57
    :goto_2
    if-eqz v5, :cond_2

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    move-object v4, v0

    .line 64
    goto :goto_4

    .line 65
    :cond_4
    :goto_3
    const-string v2, "base64"

    .line 66
    .line 67
    move-object v4, v2

    .line 68
    :goto_4
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    if-nez p0, :cond_5

    .line 75
    .line 76
    const-string p0, ""

    .line 77
    .line 78
    :cond_5
    :goto_5
    move-object v2, p0

    .line 79
    goto :goto_6

    .line 80
    :cond_6
    const/4 p0, 0x2

    .line 81
    invoke-static {p1, p0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    goto :goto_5

    .line 86
    :goto_6
    new-instance v0, Lgb/g;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Lgb/k;->t([B)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    array-length p0, p1

    .line 96
    int-to-long v5, p0

    .line 97
    invoke-direct/range {v0 .. v6}, Lgb/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_7
    const-string p0, " \u8d85\u8fc7 16384 KiB"

    .line 102
    .line 103
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :goto_7
    const/4 p0, 0x0

    .line 111
    return-object p0

    .line 112
    :cond_8
    const-string p0, "\u9644\u52a0\u6587\u4ef6\u4e0d\u80fd\u8986\u76d6\u9ed8\u8ba4\u63d2\u4ef6\u6587\u4ef6: "

    .line 113
    .line 114
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_7
.end method

.method public static d()Lgb/j;
    .locals 7

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    invoke-virtual {v0}, Lg8/a;->c()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_b

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v3, v1}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 36
    .line 37
    .line 38
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v3

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v3, v2

    .line 43
    goto :goto_1

    .line 44
    :goto_0
    new-instance v4, Lsf/f;

    .line 45
    .line 46
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object v3, v4

    .line 50
    :goto_1
    nop

    .line 51
    instance-of v4, v3, Lsf/f;

    .line 52
    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    move-object v3, v2

    .line 56
    :cond_1
    check-cast v3, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 57
    .line 58
    const/16 v4, 0x2a

    .line 59
    .line 60
    invoke-virtual {v0, v4}, Lg8/a;->b(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    const-string v6, ""

    .line 80
    .line 81
    if-eqz v5, :cond_4

    .line 82
    .line 83
    if-eqz v3, :cond_2

    .line 84
    .line 85
    iget-object v4, v3, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    move-object v4, v2

    .line 89
    :goto_2
    if-nez v4, :cond_3

    .line 90
    .line 91
    move-object v4, v6

    .line 92
    :cond_3
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    :cond_4
    const/4 v5, 0x4

    .line 101
    invoke-virtual {v0, v5}, Lg8/a;->b(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-eqz v5, :cond_7

    .line 121
    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    iget-object v2, v3, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 125
    .line 126
    :cond_5
    if-nez v2, :cond_6

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_6
    move-object v6, v2

    .line 130
    :goto_3
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    const/16 v3, 0x80

    .line 143
    .line 144
    if-gt v2, v3, :cond_a

    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-gt v2, v3, :cond_9

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    const/16 v3, 0x64

    .line 157
    .line 158
    if-gt v2, v3, :cond_8

    .line 159
    .line 160
    new-instance v2, Lgb/j;

    .line 161
    .line 162
    invoke-direct {v2, v1, v4, v0}, Lgb/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-object v2

    .line 166
    :cond_8
    const-string v0, "\u5f53\u524d\u8d26\u53f7\u5fae\u4fe1\u6635\u79f0\u8fc7\u957f"

    .line 167
    .line 168
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :goto_4
    const/4 v0, 0x0

    .line 172
    return-object v0

    .line 173
    :cond_9
    const-string v0, "\u5f53\u524d\u8d26\u53f7\u5fae\u4fe1\u53f7\u957f\u5ea6\u5f02\u5e38"

    .line 174
    .line 175
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_a
    const-string v0, "\u5f53\u524d\u8d26\u53f7 wxid \u957f\u5ea6\u5f02\u5e38"

    .line 180
    .line 181
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_b
    const-string v0, "\u65e0\u6cd5\u8bfb\u53d6\u5f53\u524d\u8d26\u53f7 wxid\uff0c\u8bf7\u91cd\u542f\u5fae\u4fe1\u540e\u91cd\u8bd5"

    .line 186
    .line 187
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_c
    const-string v0, "\u5f53\u524d\u5fae\u4fe1\u8d26\u53f7\u8d44\u6599\u5c1a\u672a\u5c31\u7eea\uff0c\u8bf7\u91cd\u542f\u5fae\u4fe1\u540e\u91cd\u8bd5"

    .line 192
    .line 193
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_4
.end method

.method public static e(Ljava/lang/String;[B)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance v0, Lsf/f;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, v0

    .line 37
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast p1, Ljava/lang/String;

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    const-string v1, " \u4e0d\u662f\u6709\u6548 UTF-8 \u6587\u672c"

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {p1, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public static f(Lgb/o;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lgb/o;->b:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lgb/o;->a:Ljava/lang/String;

    .line 13
    .line 14
    :cond_0
    invoke-static {v0}, Lgb/k;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static g(Ljava/io/File;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    array-length v1, v0

    .line 28
    const/4 v2, 0x0

    .line 29
    :goto_0
    if-ge v2, v1, :cond_0

    .line 30
    .line 31
    aget-object v3, v0, v2

    .line 32
    .line 33
    invoke-static {v3}, Lgb/k;->g(Ljava/io/File;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v0, "\u5220\u9664\u6587\u4ef6\u5931\u8d25: "

    .line 51
    .line 52
    invoke-static {v0, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string v0, "\u4e0d\u652f\u6301\u5220\u9664\u7b26\u53f7\u94fe\u63a5: "

    .line 65
    .line 66
    invoke-static {v0, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public static h(Ljava/io/File;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p0}, Lgb/k;->g(Ljava/io/File;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static i(Ljava/io/File;Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const-string p0, "\u63d2\u4ef6\u6587\u4ef6\u8def\u5f84\u8d8a\u754c"

    .line 35
    .line 36
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string p1, "\u63d2\u4ef6\u6587\u4ef6\u4e0d\u80fd\u662f\u7b26\u53f7\u94fe\u63a5: "

    .line 45
    .line 46
    invoke-static {p1, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static j(Ljava/io/File;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    new-instance v0, Ldg/j;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    sget-object v2, Ldg/k;->g:Ldg/k;

    .line 26
    .line 27
    invoke-direct {v0, p0, v2, v1}, Ldg/j;-><init>(Ljava/io/File;Ldg/k;Lc9/x;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Ldg/h;

    .line 31
    .line 32
    invoke-direct {p0, v0}, Ldg/h;-><init>(Ldg/j;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-virtual {p0}, Ltf/b;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Ltf/b;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/io/File;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-string v0, "\u63d2\u4ef6\u76ee\u5f55\u5305\u542b\u4e0d\u652f\u6301\u7684\u7b26\u53f7\u94fe\u63a5: "

    .line 67
    .line 68
    invoke-static {v0, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_1
    return-void

    .line 76
    :cond_3
    const-string p0, "\u63d2\u4ef6\u76ee\u5f55\u5305\u542b\u4e0d\u652f\u6301\u7684\u7b26\u53f7\u94fe\u63a5"

    .line 77
    .line 78
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public static k(Landroid/content/Context;Lgb/o;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptDir(Landroid/content/Context;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p1}, Lgb/k;->f(Lgb/o;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ljava/io/File;

    .line 15
    .line 16
    invoke-direct {v1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    iget-object p1, p1, Lgb/o;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p1}, Lgb/k;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    new-instance v0, Ljava/io/File;

    .line 39
    .line 40
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    const/4 p0, 0x1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 p0, 0x0

    .line 52
    :goto_0
    if-eqz p0, :cond_2

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_2
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method public static l(Ljava/lang/String;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :sswitch_0
    const-string v0, "README.md"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-wide/32 v0, 0x40000

    .line 19
    .line 20
    .line 21
    return-wide v0

    .line 22
    :sswitch_1
    const-string v0, "main.java.bshs"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :sswitch_2
    const-string v0, "info.prop"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-wide/32 v0, 0x10000

    .line 38
    .line 39
    .line 40
    return-wide v0

    .line 41
    :sswitch_3
    const-string v0, "main.java"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_2

    .line 48
    .line 49
    :goto_0
    const-wide/32 v0, 0x1000000

    .line 50
    .line 51
    .line 52
    return-wide v0

    .line 53
    :cond_2
    const-wide/32 v0, 0x80000

    .line 54
    .line 55
    .line 56
    return-wide v0

    .line 57
    :sswitch_data_0
    .sparse-switch
        -0x11ad76c9 -> :sswitch_3
        0x46b534a3 -> :sswitch_2
        0x5d6c2373 -> :sswitch_1
        0x647865d7 -> :sswitch_0
    .end sparse-switch
.end method

.method public static m(Landroid/content/Context;Lgb/o;Z)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "[Hchat:PluginMarket] \u6e05\u7406\u63d2\u4ef6\u5b89\u88c5\u6682\u5b58\u76ee\u5f55\u5931\u8d25: "

    .line 6
    .line 7
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    const-string v4, ".hchat-plugin-market-backup-"

    .line 10
    .line 11
    const-string v5, ".hchat-plugin-market-stage-"

    .line 12
    .line 13
    const-string v6, "\u672c\u5730\u63d2\u4ef6\u5df2\u5b58\u5728\uff0c\u9700\u8981\u786e\u8ba4\u8986\u76d6: "

    .line 14
    .line 15
    const-string v7, "\u63d2\u4ef6\u76ee\u6807\u4e0d\u662f\u76ee\u5f55: "

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v8, v0, Lgb/o;->l:Ljava/util/List;

    .line 21
    .line 22
    :try_start_0
    iget-object v9, v0, Lgb/o;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v9}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    if-nez v10, :cond_20

    .line 37
    .line 38
    const/4 v10, 0x1

    .line 39
    invoke-static {v8, v10}, Lgb/k;->v(Ljava/util/List;Z)V

    .line 40
    .line 41
    .line 42
    sget-object v11, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 43
    .line 44
    invoke-virtual {v11, v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->ensureDirs(Landroid/content/Context;)Ljava/io/File;

    .line 45
    .line 46
    .line 47
    move-result-object v12

    .line 48
    invoke-virtual {v12}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 49
    .line 50
    .line 51
    move-result-object v12

    .line 52
    invoke-static {v0}, Lgb/k;->f(Lgb/o;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, Lgb/k;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v13

    .line 60
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_1f

    .line 65
    .line 66
    new-instance v0, Ljava/io/File;

    .line 67
    .line 68
    invoke-direct {v0, v12, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 76
    .line 77
    .line 78
    move-result-object v14

    .line 79
    invoke-virtual {v14}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 80
    .line 81
    .line 82
    move-result-object v15

    .line 83
    invoke-static {v15, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v15

    .line 87
    if-eqz v15, :cond_1e

    .line 88
    .line 89
    invoke-virtual {v0, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_1e

    .line 94
    .line 95
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    invoke-virtual {v14}, Ljava/io/File;->isDirectory()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_0

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    invoke-virtual {v7, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :cond_1
    :goto_0
    invoke-static {v9}, Lgb/k;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    new-instance v7, Ljava/io/File;

    .line 127
    .line 128
    invoke-direct {v7, v12, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-virtual {v13, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-nez v0, :cond_2

    .line 140
    .line 141
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_2

    .line 146
    .line 147
    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_2

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_2
    move-object v7, v14

    .line 155
    :goto_1
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    .line 160
    .line 161
    .line 162
    move-result v15

    .line 163
    if-eqz v15, :cond_4

    .line 164
    .line 165
    if-eqz p2, :cond_3

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    invoke-virtual {v6, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v0

    .line 182
    :cond_4
    :goto_2
    if-eqz v15, :cond_5

    .line 183
    .line 184
    invoke-static {v7}, Lgb/k;->j(Ljava/io/File;)V

    .line 185
    .line 186
    .line 187
    :cond_5
    invoke-virtual {v12}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-eqz v0, :cond_1d

    .line 192
    .line 193
    new-instance v6, Ljava/io/File;

    .line 194
    .line 195
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    new-instance v10, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v10, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-direct {v6, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    new-instance v5, Ljava/io/File;

    .line 215
    .line 216
    invoke-direct {v5, v6, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    new-instance v10, Ljava/io/File;

    .line 220
    .line 221
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    move-object/from16 v16, v3

    .line 226
    .line 227
    new-instance v3, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-string v4, "-"

    .line 236
    .line 237
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-direct {v10, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v6}, Lgb/k;->h(Ljava/io/File;)V

    .line 251
    .line 252
    .line 253
    invoke-static {v10}, Lgb/k;->h(Ljava/io/File;)V

    .line 254
    .line 255
    .line 256
    if-eqz v15, :cond_6

    .line 257
    .line 258
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v11, v1, v9}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isPluginEnabled(Landroid/content/Context;Ljava/lang/String;)Z

    .line 262
    .line 263
    .line 264
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_d

    .line 265
    if-eqz v0, :cond_6

    .line 266
    .line 267
    const/4 v4, 0x1

    .line 268
    goto :goto_3

    .line 269
    :cond_6
    const/4 v4, 0x0

    .line 270
    :goto_3
    :try_start_1
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_14

    .line 275
    .line 276
    if-eqz v15, :cond_7

    .line 277
    .line 278
    invoke-static {v7, v5}, Lgb/k;->b(Ljava/io/File;Ljava/io/File;)V

    .line 279
    .line 280
    .line 281
    goto :goto_5

    .line 282
    :catchall_0
    move-exception v0

    .line 283
    const/4 v3, 0x0

    .line 284
    :goto_4
    const/4 v5, 0x0

    .line 285
    const/4 v8, 0x0

    .line 286
    goto/16 :goto_c

    .line 287
    .line 288
    :cond_7
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_13

    .line 293
    .line 294
    :goto_5
    invoke-static {v5, v8}, Lgb/k;->r(Ljava/io/File;Ljava/util/List;)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v8

    .line 305
    if-eqz v8, :cond_c

    .line 306
    .line 307
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    check-cast v8, Lgb/g;

    .line 312
    .line 313
    new-instance v11, Ljava/io/File;

    .line 314
    .line 315
    iget-object v12, v8, Lgb/g;->a:Ljava/lang/String;

    .line 316
    .line 317
    invoke-direct {v11, v5, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v11}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 321
    .line 322
    .line 323
    move-result-object v17

    .line 324
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    move-object/from16 p2, v0

    .line 329
    .line 330
    invoke-virtual {v5}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-static {v3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-eqz v0, :cond_b

    .line 339
    .line 340
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-static {v0}, Lgb/k;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-eqz v0, :cond_a

    .line 355
    .line 356
    invoke-virtual {v11}, Ljava/io/File;->isFile()Z

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    if-eqz v0, :cond_9

    .line 361
    .line 362
    invoke-virtual {v11}, Ljava/io/File;->delete()Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_8

    .line 367
    .line 368
    goto :goto_7

    .line 369
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 372
    .line 373
    .line 374
    const-string v3, "\u5220\u9664\u65e7\u63d2\u4ef6\u6587\u4ef6\u5931\u8d25: "

    .line 375
    .line 376
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    throw v3

    .line 396
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    const-string v3, "\u63d2\u4ef6\u6587\u4ef6\u76ee\u6807\u4e0e\u672c\u5730\u76ee\u5f55\u51b2\u7a81: "

    .line 402
    .line 403
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 414
    .line 415
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    throw v3

    .line 423
    :cond_a
    :goto_7
    invoke-virtual {v8}, Lgb/g;->a()[B

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-static {v11, v0}, Lgb/k;->x(Ljava/io/File;[B)V

    .line 428
    .line 429
    .line 430
    move-object/from16 v0, p2

    .line 431
    .line 432
    goto/16 :goto_6

    .line 433
    .line 434
    :cond_b
    const-string v0, "\u63d2\u4ef6\u6587\u4ef6\u8def\u5f84\u8d8a\u754c"

    .line 435
    .line 436
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 437
    .line 438
    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    throw v3

    .line 442
    :cond_c
    invoke-static {v5}, Lgb/k;->j(Ljava/io/File;)V

    .line 443
    .line 444
    .line 445
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 446
    .line 447
    const/4 v3, 0x0

    .line 448
    invoke-virtual {v0, v1, v13, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->setPluginEnabled-0E7RQCE(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v8

    .line 452
    invoke-static {v8}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    invoke-static {v9, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v8

    .line 459
    if-nez v8, :cond_d

    .line 460
    .line 461
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, v1, v9, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->setPluginEnabled-0E7RQCE(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v8

    .line 468
    invoke-static {v8}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 469
    .line 470
    .line 471
    :cond_d
    :try_start_2
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    if-eqz v3, :cond_f

    .line 476
    .line 477
    invoke-virtual {v7, v10}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    if-eqz v3, :cond_e

    .line 482
    .line 483
    const/4 v3, 0x1

    .line 484
    goto :goto_8

    .line 485
    :cond_e
    const-string v0, "\u5907\u4efd\u65e7\u63d2\u4ef6\u76ee\u5f55\u5931\u8d25"

    .line 486
    .line 487
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 488
    .line 489
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 493
    :catchall_1
    move-exception v0

    .line 494
    const/4 v3, 0x1

    .line 495
    goto/16 :goto_4

    .line 496
    .line 497
    :cond_f
    const/4 v3, 0x0

    .line 498
    :goto_8
    :try_start_3
    invoke-virtual {v5, v14}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 499
    .line 500
    .line 501
    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 502
    if-eqz v5, :cond_12

    .line 503
    .line 504
    :try_start_4
    invoke-virtual {v0, v1, v13}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshPluginObserver(Landroid/content/Context;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    invoke-static {v9, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    if-nez v5, :cond_10

    .line 512
    .line 513
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v0, v1, v9}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshPluginObserver(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 517
    .line 518
    .line 519
    goto :goto_9

    .line 520
    :catchall_2
    move-exception v0

    .line 521
    move v8, v3

    .line 522
    const/4 v3, 0x1

    .line 523
    const/4 v5, 0x1

    .line 524
    goto/16 :goto_c

    .line 525
    .line 526
    :cond_10
    :goto_9
    :try_start_5
    invoke-static {v10}, Lgb/k;->h(Ljava/io/File;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 527
    .line 528
    .line 529
    move-object/from16 v5, v16

    .line 530
    .line 531
    goto :goto_a

    .line 532
    :catchall_3
    move-exception v0

    .line 533
    :try_start_6
    new-instance v5, Lsf/f;

    .line 534
    .line 535
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 536
    .line 537
    .line 538
    :goto_a
    invoke-static {v5}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    if-eqz v0, :cond_11

    .line 543
    .line 544
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v5

    .line 548
    new-instance v8, Ljava/lang/StringBuilder;

    .line 549
    .line 550
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 551
    .line 552
    .line 553
    const-string v11, "[Hchat:PluginMarket] \u6e05\u7406\u63d2\u4ef6\u5b89\u88c5\u5907\u4efd\u5931\u8d25: "

    .line 554
    .line 555
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v5

    .line 565
    invoke-static {v5, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 566
    .line 567
    .line 568
    :cond_11
    new-instance v5, Lgb/i;

    .line 569
    .line 570
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    const/4 v8, 0x0

    .line 578
    invoke-direct {v5, v13, v0, v15, v8}, Lgb/i;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 579
    .line 580
    .line 581
    :try_start_7
    invoke-static {v6}, Lgb/k;->h(Ljava/io/File;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 582
    .line 583
    .line 584
    move-object/from16 v3, v16

    .line 585
    .line 586
    goto :goto_b

    .line 587
    :catchall_4
    move-exception v0

    .line 588
    :try_start_8
    new-instance v3, Lsf/f;

    .line 589
    .line 590
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 591
    .line 592
    .line 593
    :goto_b
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    if-eqz v0, :cond_21

    .line 598
    .line 599
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    new-instance v3, Ljava/lang/StringBuilder;

    .line 604
    .line 605
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-static {v1, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_d

    .line 619
    .line 620
    .line 621
    goto/16 :goto_11

    .line 622
    .line 623
    :cond_12
    :try_start_9
    const-string v0, "\u5b89\u88c5\u63d2\u4ef6\u76ee\u5f55\u5931\u8d25"

    .line 624
    .line 625
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 626
    .line 627
    invoke-direct {v5, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    throw v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 631
    :catchall_5
    move-exception v0

    .line 632
    move v8, v3

    .line 633
    const/4 v3, 0x1

    .line 634
    const/4 v5, 0x0

    .line 635
    goto :goto_c

    .line 636
    :cond_13
    :try_start_a
    const-string v0, "\u521b\u5efa\u63d2\u4ef6\u76ee\u5f55\u5931\u8d25"

    .line 637
    .line 638
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 639
    .line 640
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    throw v3

    .line 644
    :cond_14
    const-string v0, "\u521b\u5efa\u63d2\u4ef6\u6682\u5b58\u76ee\u5f55\u5931\u8d25"

    .line 645
    .line 646
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 647
    .line 648
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    throw v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 652
    :goto_c
    if-eqz v3, :cond_15

    .line 653
    .line 654
    :try_start_b
    sget-object v11, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 655
    .line 656
    const/4 v12, 0x0

    .line 657
    :try_start_c
    invoke-virtual {v11, v1, v13, v12}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->setPluginEnabled-0E7RQCE(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/Object;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 658
    .line 659
    .line 660
    goto :goto_d

    .line 661
    :catchall_6
    :cond_15
    const/4 v12, 0x0

    .line 662
    :catchall_7
    :goto_d
    if-eqz v5, :cond_16

    .line 663
    .line 664
    :try_start_d
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    .line 665
    .line 666
    .line 667
    move-result v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 668
    if-eqz v5, :cond_16

    .line 669
    .line 670
    :try_start_e
    invoke-static {v14}, Lgb/k;->h(Ljava/io/File;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 671
    .line 672
    .line 673
    goto :goto_e

    .line 674
    :catchall_8
    move-exception v0

    .line 675
    move-object v1, v0

    .line 676
    goto :goto_f

    .line 677
    :catchall_9
    :cond_16
    :goto_e
    if-eqz v8, :cond_17

    .line 678
    .line 679
    :try_start_f
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    .line 680
    .line 681
    .line 682
    move-result v5

    .line 683
    if-eqz v5, :cond_18

    .line 684
    .line 685
    invoke-virtual {v10, v7}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 686
    .line 687
    .line 688
    move-result v5
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 689
    if-eqz v5, :cond_18

    .line 690
    .line 691
    :cond_17
    const/4 v12, 0x1

    .line 692
    :cond_18
    if-eqz v12, :cond_1a

    .line 693
    .line 694
    if-eqz v8, :cond_19

    .line 695
    .line 696
    :try_start_10
    sget-object v5, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 697
    .line 698
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v5, v1, v9}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->refreshPluginObserver(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 702
    .line 703
    .line 704
    :catchall_a
    :cond_19
    if-eqz v3, :cond_1a

    .line 705
    .line 706
    if-eqz v4, :cond_1a

    .line 707
    .line 708
    :try_start_11
    sget-object v3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 709
    .line 710
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    const/4 v4, 0x1

    .line 714
    invoke-virtual {v3, v1, v9, v4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->setPluginEnabled-0E7RQCE(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    .line 715
    .line 716
    .line 717
    :catchall_b
    :cond_1a
    if-nez v12, :cond_1b

    .line 718
    .line 719
    :try_start_12
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 720
    .line 721
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v3

    .line 725
    new-instance v4, Ljava/lang/StringBuilder;

    .line 726
    .line 727
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 728
    .line 729
    .line 730
    const-string v5, "\u63d2\u4ef6\u5b89\u88c5\u5931\u8d25\u4e14\u65e7\u63d2\u4ef6\u6062\u590d\u5931\u8d25\uff0c\u5907\u4efd\u4fdd\u7559\u5728 "

    .line 731
    .line 732
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 733
    .line 734
    .line 735
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    invoke-direct {v1, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 743
    .line 744
    .line 745
    throw v1

    .line 746
    :cond_1b
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 747
    :goto_f
    :try_start_13
    invoke-static {v6}, Lgb/k;->h(Ljava/io/File;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_c

    .line 748
    .line 749
    .line 750
    move-object/from16 v3, v16

    .line 751
    .line 752
    goto :goto_10

    .line 753
    :catchall_c
    move-exception v0

    .line 754
    :try_start_14
    new-instance v3, Lsf/f;

    .line 755
    .line 756
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 757
    .line 758
    .line 759
    :goto_10
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    if-eqz v0, :cond_1c

    .line 764
    .line 765
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v3

    .line 769
    new-instance v4, Ljava/lang/StringBuilder;

    .line 770
    .line 771
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    invoke-static {v2, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 785
    .line 786
    .line 787
    :cond_1c
    throw v1

    .line 788
    :cond_1d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 789
    .line 790
    const-string v1, "\u63d2\u4ef6\u6839\u76ee\u5f55\u6ca1\u6709\u7236\u76ee\u5f55"

    .line 791
    .line 792
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 793
    .line 794
    .line 795
    throw v0

    .line 796
    :cond_1e
    const-string v0, "\u63d2\u4ef6\u5b89\u88c5\u76ee\u5f55\u4e0d\u5728\u811a\u672c\u63d2\u4ef6\u6839\u76ee\u5f55\u5185"

    .line 797
    .line 798
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 799
    .line 800
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 801
    .line 802
    .line 803
    throw v1

    .line 804
    :cond_1f
    const-string v0, "\u65e0\u6cd5\u751f\u6210\u672c\u5730\u63d2\u4ef6\u76ee\u5f55\u540d"

    .line 805
    .line 806
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 807
    .line 808
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    throw v1

    .line 812
    :cond_20
    const-string v0, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 813
    .line 814
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 815
    .line 816
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    throw v1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_d

    .line 820
    :catchall_d
    move-exception v0

    .line 821
    new-instance v5, Lsf/f;

    .line 822
    .line 823
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 824
    .line 825
    .line 826
    :cond_21
    :goto_11
    return-object v5
.end method

.method public static n(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Lgb/k;->a:Ljava/util/Set;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    instance-of v1, v0, Ljava/util/Collection;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Ljava/util/Collection;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, p0}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public static o([B)Z
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "\u63d2\u4ef6\u6587\u4ef6"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lgb/k;->e(Ljava/lang/String;[B)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    new-instance v0, Lsf/f;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    move-object p0, v0

    .line 16
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 17
    .line 18
    instance-of v1, p0, Lsf/f;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    move-object p0, v0

    .line 23
    :cond_0
    check-cast p0, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public static p(Ljava/io/File;Ljava/lang/String;ZLjava/lang/String;)Lgb/g;
    .locals 7

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string p2, "\u63d2\u4ef6\u7f3a\u5c11 "

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :cond_1
    invoke-static {v0, p0}, Lgb/k;->i(Ljava/io/File;Ljava/io/File;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string p1, "readme.md"

    .line 40
    .line 41
    invoke-static {p0, p1}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    const-string p0, "README.md"

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, Lgb/k;->l(Ljava/lang/String;)J

    .line 58
    .line 59
    .line 60
    move-result-wide p0

    .line 61
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 62
    .line 63
    .line 64
    move-result-wide v1

    .line 65
    cmp-long p2, v1, p0

    .line 66
    .line 67
    const/16 v1, 0x400

    .line 68
    .line 69
    if-gtz p2, :cond_4

    .line 70
    .line 71
    invoke-static {v0}, Ldg/l;->g0(Ljava/io/File;)[B

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    array-length v2, p2

    .line 76
    int-to-long v2, v2

    .line 77
    cmp-long v2, v2, p0

    .line 78
    .line 79
    if-gtz v2, :cond_3

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {p0, p2}, Lgb/k;->e(Ljava/lang/String;[B)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    new-instance v0, Lgb/g;

    .line 93
    .line 94
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, p0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {p1}, Lgb/k;->t([B)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v2, p0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    array-length p0, p0

    .line 118
    int-to-long v5, p0

    .line 119
    const-string v4, "utf8"

    .line 120
    .line 121
    move-object v1, p3

    .line 122
    invoke-direct/range {v0 .. v6}, Lgb/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 123
    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    int-to-long v0, v1

    .line 131
    div-long/2addr p0, v0

    .line 132
    invoke-static {p2, p0, p1}, Lg1/d;->d(Ljava/lang/Object;J)V

    .line 133
    .line 134
    .line 135
    :goto_1
    const/4 p0, 0x0

    .line 136
    return-object p0

    .line 137
    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    int-to-long v0, v1

    .line 142
    div-long/2addr p0, v0

    .line 143
    invoke-static {p2, p0, p1}, Lg1/d;->d(Ljava/lang/Object;J)V

    .line 144
    .line 145
    .line 146
    goto :goto_1
.end method

.method public static q(Ljava/io/File;)Lgb/g;
    .locals 11

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "main.java.bshs"

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    invoke-static {v0, p0}, Lgb/k;->i(Ljava/io/File;Ljava/io/File;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lgb/k;->l(Ljava/lang/String;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    cmp-long p0, v4, v1

    .line 28
    .line 29
    const-string v4, " KiB"

    .line 30
    .line 31
    const-string v5, "main.java.bshs \u8d85\u8fc7 "

    .line 32
    .line 33
    const/16 v6, 0x400

    .line 34
    .line 35
    if-gtz p0, :cond_3

    .line 36
    .line 37
    invoke-static {v0}, Ldg/l;->g0(Ljava/io/File;)[B

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    array-length v0, p0

    .line 42
    int-to-long v7, v0

    .line 43
    cmp-long v0, v7, v1

    .line 44
    .line 45
    if-gtz v0, :cond_2

    .line 46
    .line 47
    array-length v0, p0

    .line 48
    const/4 v1, 0x4

    .line 49
    if-lt v0, v1, :cond_1

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-static {p0, v0, v1}, Ltf/l;->t0([BII)[B

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-array v1, v1, [B

    .line 57
    .line 58
    fill-array-data v1, :array_0

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    new-instance v4, Lgb/g;

    .line 68
    .line 69
    const/4 v0, 0x2

    .line 70
    invoke-static {p0, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {p0}, Lgb/k;->t([B)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    array-length p0, p0

    .line 82
    int-to-long v9, p0

    .line 83
    const-string v8, "base64"

    .line 84
    .line 85
    const-string v5, "main.java.bshs"

    .line 86
    .line 87
    invoke-direct/range {v4 .. v10}, Lgb/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 88
    .line 89
    .line 90
    return-object v4

    .line 91
    :cond_1
    const-string p0, "main.java.bshs \u4e0d\u662f\u6709\u6548\u7684 BeanShell \u5feb\u7167"

    .line 92
    .line 93
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v3

    .line 97
    :cond_2
    int-to-long v6, v6

    .line 98
    div-long/2addr v1, v6

    .line 99
    invoke-static {v1, v2, v5, v4}, Lokio/a;->f(JLjava/lang/String;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-object v3

    .line 103
    :cond_3
    int-to-long v6, v6

    .line 104
    div-long/2addr v1, v6

    .line 105
    invoke-static {v1, v2, v5, v4}, Lokio/a;->f(JLjava/lang/String;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-object v3

    .line 109
    :array_0
    .array-data 1
        0x42t
        0x53t
        0x48t
        0x53t
    .end array-data
.end method

.method public static r(Ljava/io/File;Ljava/util/List;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lgb/g;

    .line 25
    .line 26
    iget-object v1, v1, Lgb/g;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v0, Lgb/k;->a:Ljava/util/Set;

    .line 37
    .line 38
    check-cast v0, Ljava/lang/Iterable;

    .line 39
    .line 40
    new-instance v1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    move-object v3, v2

    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_1

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ljava/lang/String;

    .line 87
    .line 88
    new-instance v1, Ljava/io/File;

    .line 89
    .line 90
    invoke-direct {v1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    invoke-static {v1}, Lgb/k;->h(Ljava/io/File;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    new-instance p1, Ljava/io/File;

    .line 104
    .line 105
    const-string v0, "readme.md"

    .line 106
    .line 107
    invoke-direct {p1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-eqz p0, :cond_5

    .line 115
    .line 116
    invoke-static {p1}, Lgb/k;->h(Ljava/io/File;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    return-void
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0, p0}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "[\\\\/:*?\"<>|\\u0000-\\u001f]"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "_"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v1, "\\s+"

    .line 31
    .line 32
    invoke-static {v1, p0, v0}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const/4 v0, 0x2

    .line 37
    new-array v0, v0, [C

    .line 38
    .line 39
    fill-array-data v0, :array_0

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v0}, Log/m;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const/16 v0, 0x40

    .line 47
    .line 48
    invoke-static {v0, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string v0, "."

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    const-string v0, ".."

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    const-string p0, "online_plugin"

    .line 75
    .line 76
    :cond_0
    return-object p0

    .line 77
    :cond_1
    const-string p0, "\u63d2\u4ef6\u76ee\u5f55\u540d\u65e0\u6548"

    .line 78
    .line 79
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/4 p0, 0x0

    .line 83
    return-object p0

    .line 84
    nop

    .line 85
    :array_0
    .array-data 2
        0x2es
        0x20s
    .end array-data
.end method

.method public static t([B)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "SHA-256"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lg0/o;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, v1}, Lg0/o;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0}, Ltf/l;->E0([BLfg/l;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static u(Lgb/o;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lgb/o;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lgb/o;->l:Ljava/util/List;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-static {p0, v0}, Lgb/k;->v(Ljava/util/List;Z)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string p0, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 19
    .line 20
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    new-instance v0, Lsf/f;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public static v(Ljava/util/List;Z)V
    .locals 13

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lgb/g;

    .line 25
    .line 26
    iget-object v2, v2, Lgb/g;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Ljava/lang/String;

    .line 56
    .line 57
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-static {v1}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {v2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-ne v2, v1, :cond_24

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_2

    .line 100
    .line 101
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v2}, Lgb/k;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    const/4 v2, 0x0

    .line 116
    if-eqz v1, :cond_3

    .line 117
    .line 118
    move v3, v2

    .line 119
    goto :goto_4

    .line 120
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    move v3, v2

    .line 125
    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-eqz v4, :cond_6

    .line 130
    .line 131
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    check-cast v4, Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v4}, Lgb/k;->n(Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-nez v4, :cond_4

    .line 142
    .line 143
    add-int/lit8 v3, v3, 0x1

    .line 144
    .line 145
    if-ltz v3, :cond_5

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_5
    invoke-static {}, La/a;->P0()V

    .line 149
    .line 150
    .line 151
    const/4 p0, 0x0

    .line 152
    throw p0

    .line 153
    :cond_6
    :goto_4
    const/16 v1, 0x20

    .line 154
    .line 155
    const/4 v4, 0x1

    .line 156
    if-gt v3, v1, :cond_7

    .line 157
    .line 158
    move v1, v4

    .line 159
    goto :goto_5

    .line 160
    :cond_7
    move v1, v2

    .line 161
    :goto_5
    if-eqz v1, :cond_23

    .line 162
    .line 163
    const-string v1, "main.java"

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_22

    .line 170
    .line 171
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_21

    .line 180
    .line 181
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, Lgb/g;

    .line 186
    .line 187
    iget-object v5, v3, Lgb/g;->a:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-eqz v5, :cond_8

    .line 194
    .line 195
    iget-object v0, v3, Lgb/g;->b:Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-nez v0, :cond_20

    .line 202
    .line 203
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    const-wide/16 v0, 0x0

    .line 208
    .line 209
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-eqz v3, :cond_1d

    .line 214
    .line 215
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    check-cast v3, Lgb/g;

    .line 220
    .line 221
    iget-object v5, v3, Lgb/g;->a:Ljava/lang/String;

    .line 222
    .line 223
    iget-object v6, v3, Lgb/g;->c:Ljava/lang/String;

    .line 224
    .line 225
    iget-object v7, v3, Lgb/g;->e:Ljava/lang/String;

    .line 226
    .line 227
    invoke-static {v5}, Lgb/k;->l(Ljava/lang/String;)J

    .line 228
    .line 229
    .line 230
    move-result-wide v8

    .line 231
    :try_start_0
    invoke-virtual {v3}, Lgb/g;->a()[B

    .line 232
    .line 233
    .line 234
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    goto :goto_7

    .line 236
    :catchall_0
    move-exception v10

    .line 237
    new-instance v11, Lsf/f;

    .line 238
    .line 239
    invoke-direct {v11, v10}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 240
    .line 241
    .line 242
    move-object v10, v11

    .line 243
    :goto_7
    invoke-static {v10}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    if-nez v11, :cond_1c

    .line 248
    .line 249
    check-cast v10, [B

    .line 250
    .line 251
    array-length v11, v10

    .line 252
    int-to-long v11, v11

    .line 253
    cmp-long v11, v11, v8

    .line 254
    .line 255
    if-gtz v11, :cond_9

    .line 256
    .line 257
    move v11, v4

    .line 258
    goto :goto_8

    .line 259
    :cond_9
    move v11, v2

    .line 260
    :goto_8
    if-eqz v11, :cond_1b

    .line 261
    .line 262
    const-string v8, "main.java.bshs"

    .line 263
    .line 264
    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v8

    .line 268
    const-string v9, "base64"

    .line 269
    .line 270
    if-eqz v8, :cond_d

    .line 271
    .line 272
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    if-eqz v7, :cond_c

    .line 277
    .line 278
    array-length v7, v10

    .line 279
    const/4 v8, 0x4

    .line 280
    if-lt v7, v8, :cond_a

    .line 281
    .line 282
    invoke-static {v10, v2, v8}, Ltf/l;->t0([BII)[B

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    new-array v8, v8, [B

    .line 287
    .line 288
    fill-array-data v8, :array_0

    .line 289
    .line 290
    .line 291
    invoke-static {v7, v8}, Ljava/util/Arrays;->equals([B[B)Z

    .line 292
    .line 293
    .line 294
    move-result v7

    .line 295
    if-eqz v7, :cond_a

    .line 296
    .line 297
    move v7, v4

    .line 298
    goto :goto_9

    .line 299
    :cond_a
    move v7, v2

    .line 300
    :goto_9
    if-eqz v7, :cond_b

    .line 301
    .line 302
    goto :goto_d

    .line 303
    :cond_b
    const-string p0, "main.java.bshs \u4e0d\u662f\u6709\u6548\u7684 BeanShell \u5feb\u7167"

    .line 304
    .line 305
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :cond_c
    const-string p0, "main.java.bshs \u5fc5\u987b\u4f7f\u7528 Base64 \u4f20\u8f93"

    .line 310
    .line 311
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :cond_d
    invoke-static {v5}, Lgb/k;->n(Ljava/lang/String;)Z

    .line 316
    .line 317
    .line 318
    move-result v8

    .line 319
    const-string v11, " \u4e0d\u662f\u6709\u6548 UTF-8 \u6587\u672c"

    .line 320
    .line 321
    const-string v12, "utf8"

    .line 322
    .line 323
    if-eqz v8, :cond_10

    .line 324
    .line 325
    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v7

    .line 329
    if-eqz v7, :cond_e

    .line 330
    .line 331
    invoke-static {v10}, Lgb/k;->o([B)Z

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    if-eqz v7, :cond_e

    .line 336
    .line 337
    move v7, v4

    .line 338
    goto :goto_a

    .line 339
    :cond_e
    move v7, v2

    .line 340
    :goto_a
    if-eqz v7, :cond_f

    .line 341
    .line 342
    goto :goto_d

    .line 343
    :cond_f
    invoke-virtual {v5, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :cond_10
    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v8

    .line 355
    if-nez v8, :cond_12

    .line 356
    .line 357
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v8

    .line 361
    if-eqz v8, :cond_11

    .line 362
    .line 363
    goto :goto_b

    .line 364
    :cond_11
    move v8, v2

    .line 365
    goto :goto_c

    .line 366
    :cond_12
    :goto_b
    move v8, v4

    .line 367
    :goto_c
    if-eqz v8, :cond_1a

    .line 368
    .line 369
    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v7

    .line 373
    if-eqz v7, :cond_14

    .line 374
    .line 375
    invoke-static {v10}, Lgb/k;->o([B)Z

    .line 376
    .line 377
    .line 378
    move-result v7

    .line 379
    if-eqz v7, :cond_13

    .line 380
    .line 381
    goto :goto_d

    .line 382
    :cond_13
    invoke-virtual {v5, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object p0

    .line 386
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    :cond_14
    :goto_d
    iget-wide v7, v3, Lgb/g;->d:J

    .line 391
    .line 392
    array-length v3, v10

    .line 393
    int-to-long v11, v3

    .line 394
    cmp-long v3, v7, v11

    .line 395
    .line 396
    if-nez v3, :cond_15

    .line 397
    .line 398
    move v3, v4

    .line 399
    goto :goto_e

    .line 400
    :cond_15
    move v3, v2

    .line 401
    :goto_e
    if-eqz v3, :cond_19

    .line 402
    .line 403
    if-eqz p1, :cond_18

    .line 404
    .line 405
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    if-nez v3, :cond_17

    .line 410
    .line 411
    invoke-static {v10}, Lgb/k;->t([B)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    if-eqz v3, :cond_16

    .line 420
    .line 421
    goto :goto_f

    .line 422
    :cond_16
    const-string p0, " sha256 \u6821\u9a8c\u5931\u8d25"

    .line 423
    .line 424
    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object p0

    .line 428
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    return-void

    .line 432
    :cond_17
    const-string p0, " \u7f3a\u5c11 sha256"

    .line 433
    .line 434
    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object p0

    .line 438
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    return-void

    .line 442
    :cond_18
    :goto_f
    array-length v3, v10

    .line 443
    int-to-long v5, v3

    .line 444
    add-long/2addr v0, v5

    .line 445
    goto/16 :goto_6

    .line 446
    .line 447
    :cond_19
    const-string p0, " \u6587\u4ef6\u5927\u5c0f\u6821\u9a8c\u5931\u8d25"

    .line 448
    .line 449
    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    return-void

    .line 457
    :cond_1a
    const-string p0, " \u4f7f\u7528\u4e86\u4e0d\u652f\u6301\u7684\u7f16\u7801"

    .line 458
    .line 459
    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object p0

    .line 463
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    return-void

    .line 467
    :cond_1b
    const/16 p0, 0x400

    .line 468
    .line 469
    int-to-long p0, p0

    .line 470
    div-long/2addr v8, p0

    .line 471
    invoke-static {v5, v8, v9}, Lg1/d;->d(Ljava/lang/Object;J)V

    .line 472
    .line 473
    .line 474
    return-void

    .line 475
    :cond_1c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 476
    .line 477
    const-string p1, " \u5185\u5bb9\u89e3\u7801\u5931\u8d25"

    .line 478
    .line 479
    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    invoke-direct {p0, p1, v11}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 484
    .line 485
    .line 486
    throw p0

    .line 487
    :cond_1d
    const-wide/32 p0, 0x2000000

    .line 488
    .line 489
    .line 490
    cmp-long p0, v0, p0

    .line 491
    .line 492
    if-gtz p0, :cond_1e

    .line 493
    .line 494
    move v2, v4

    .line 495
    :cond_1e
    if-eqz v2, :cond_1f

    .line 496
    .line 497
    return-void

    .line 498
    :cond_1f
    const-string p0, "\u63d2\u4ef6\u5305\u8d85\u8fc7 32768 KiB"

    .line 499
    .line 500
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    return-void

    .line 504
    :cond_20
    const-string p0, "main.java \u4e0d\u80fd\u4e3a\u7a7a"

    .line 505
    .line 506
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    return-void

    .line 510
    :cond_21
    const-string p0, "Collection contains no element matching the predicate."

    .line 511
    .line 512
    invoke-static {p0}, Lj8/o;->l(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    return-void

    .line 516
    :cond_22
    const-string p0, "\u63d2\u4ef6\u5305\u7f3a\u5c11 main.java"

    .line 517
    .line 518
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    return-void

    .line 522
    :cond_23
    const-string p0, "\u63d2\u4ef6\u5305\u9644\u52a0\u6587\u4ef6\u4e0d\u80fd\u8d85\u8fc7 32 \u4e2a"

    .line 523
    .line 524
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    return-void

    .line 528
    :cond_24
    const-string p0, "\u63d2\u4ef6\u5305\u5305\u542b\u91cd\u590d\u6587\u4ef6"

    .line 529
    .line 530
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    return-void

    .line 534
    nop

    .line 535
    :array_0
    .array-data 1
        0x42t
        0x53t
        0x48t
        0x53t
    .end array-data
.end method

.method public static w(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_7

    .line 14
    .line 15
    const-string v0, "."

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_7

    .line 22
    .line 23
    const-string v0, ".."

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_7

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/16 v1, 0x80

    .line 36
    .line 37
    if-gt v0, v1, :cond_6

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    move v1, v0

    .line 41
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-ge v1, v2, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/16 v3, 0x2f

    .line 52
    .line 53
    if-eq v2, v3, :cond_1

    .line 54
    .line 55
    const/16 v3, 0x5c

    .line 56
    .line 57
    if-eq v2, v3, :cond_1

    .line 58
    .line 59
    const/16 v3, 0x20

    .line 60
    .line 61
    if-lt v2, v3, :cond_1

    .line 62
    .line 63
    const/16 v3, 0x7f

    .line 64
    .line 65
    if-ne v2, v3, :cond_0

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_0
    move v2, v0

    .line 69
    goto :goto_2

    .line 70
    :cond_1
    :goto_1
    const/4 v2, 0x1

    .line 71
    :goto_2
    if-nez v2, :cond_2

    .line 72
    .line 73
    add-int/lit8 v1, v1, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    const-string v0, "\u63d2\u4ef6\u6587\u4ef6\u540d\u4e0d\u80fd\u5305\u542b\u8def\u5f84\u6216\u63a7\u5236\u5b57\u7b26: "

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :goto_3
    const/4 p0, 0x0

    .line 86
    return-object p0

    .line 87
    :cond_3
    invoke-static {p0}, Lgb/k;->n(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    sget-object v0, Lgb/k;->a:Ljava/util/Set;

    .line 94
    .line 95
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_4
    const-string v0, "\u9ed8\u8ba4\u63d2\u4ef6\u6587\u4ef6\u540d\u5fc5\u987b\u4f7f\u7528\u6807\u51c6\u5927\u5c0f\u5199: "

    .line 103
    .line 104
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    :goto_4
    return-object p0

    .line 113
    :cond_6
    const-string p0, "\u63d2\u4ef6\u6587\u4ef6\u540d\u4e0d\u80fd\u8d85\u8fc7 128 \u4e2a\u5b57\u7b26"

    .line 114
    .line 115
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_7
    const-string p0, "\u63d2\u4ef6\u6587\u4ef6\u540d\u65e0\u6548"

    .line 120
    .line 121
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_3
.end method

.method public static x(Ljava/io/File;[B)V
    .locals 6

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    new-instance v4, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v5, "."

    .line 18
    .line 19
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, ".market-"

    .line 26
    .line 27
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, ".tmp"

    .line 34
    .line 35
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Ljava/io/FileOutputStream;

    .line 46
    .line 47
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 48
    .line 49
    .line 50
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 61
    .line 62
    .line 63
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {p1, v1}, Landroid/system/Os;->rename(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 77
    .line 78
    .line 79
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const-string v1, "\u5199\u5165 "

    .line 86
    .line 87
    const-string v2, " \u5931\u8d25"

    .line 88
    .line 89
    invoke-static {v1, p0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-direct {v0, p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw v0

    .line 97
    :catchall_1
    move-exception p0

    .line 98
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 99
    :catchall_2
    move-exception p1

    .line 100
    invoke-static {v1, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw p1
.end method
