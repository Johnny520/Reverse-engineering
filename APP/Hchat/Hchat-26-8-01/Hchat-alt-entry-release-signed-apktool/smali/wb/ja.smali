.class public final synthetic Lwb/ja;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/os/Handler;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Ltb/c;

.field public final synthetic l:Landroid/net/Uri;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;Landroid/os/Handler;Li0/a1;Ltb/c;Landroid/net/Uri;Ljava/lang/String;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/ja;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/ja;->h:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/ja;->i:Landroid/os/Handler;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/ja;->j:Li0/a1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/ja;->k:Ltb/c;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/ja;->l:Landroid/net/Uri;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/ja;->m:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/ja;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/ja;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/ja;->p:Li0/a1;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lwb/ja;->l:Landroid/net/Uri;

    .line 4
    .line 5
    iget-object v2, v1, Lwb/ja;->m:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v1, Lwb/ja;->n:Li0/a1;

    .line 8
    .line 9
    const-string v4, "\u5df2\u4fdd\u5b58\u4e3a "

    .line 10
    .line 11
    const-string v5, "\u8f6c\u6362\u5931\u8d25\uff1a"

    .line 12
    .line 13
    new-instance v6, Ljava/io/File;

    .line 14
    .line 15
    iget-object v7, v1, Lwb/ja;->g:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v8, Ljava/io/File;

    .line 21
    .line 22
    iget-object v12, v1, Lwb/ja;->h:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v12}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    const-string v10, "audio_transform_output"

    .line 29
    .line 30
    invoke-direct {v8, v9, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 34
    .line 35
    .line 36
    new-instance v9, Ljava/io/File;

    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v10

    .line 42
    iget-object v13, v1, Lwb/ja;->j:Li0/a1;

    .line 43
    .line 44
    invoke-static {v13}, Lwb/ho;->g(Li0/a1;)I

    .line 45
    .line 46
    .line 47
    move-result v14

    .line 48
    const/4 v15, 0x3

    .line 49
    move-object/from16 v16, v2

    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    if-eq v14, v2, :cond_1

    .line 53
    .line 54
    if-eq v14, v15, :cond_0

    .line 55
    .line 56
    const-string v14, ".silk"

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const-string v14, ".m4a"

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const-string v14, ".mp3"

    .line 63
    .line 64
    :goto_0
    new-instance v15, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v2, "audio_"

    .line 67
    .line 68
    invoke-direct {v15, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v15, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {v9, v8, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :try_start_0
    invoke-interface {v13}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    iget-object v8, v1, Lwb/ja;->k:Ltb/c;

    .line 95
    .line 96
    const/16 v10, 0x5dc0

    .line 97
    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    const/4 v11, 0x2

    .line 101
    if-eq v2, v11, :cond_3

    .line 102
    .line 103
    const/4 v6, 0x3

    .line 104
    if-eq v2, v6, :cond_2

    .line 105
    .line 106
    const/4 v2, -0x2

    .line 107
    goto :goto_1

    .line 108
    :cond_2
    :try_start_1
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v8, v7, v2, v10}, Ltb/c;->silkToM4a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    goto :goto_1

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    goto/16 :goto_4

    .line 119
    .line 120
    :cond_3
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v8, v7, v2, v10}, Ltb/c;->silkToMp3(Ljava/lang/String;Ljava/lang/String;I)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    goto :goto_1

    .line 129
    :cond_4
    invoke-virtual {v8, v7}, Ltb/c;->getFileType(Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    const/4 v11, 0x1

    .line 134
    if-ne v2, v11, :cond_5

    .line 135
    .line 136
    invoke-static {v6, v9}, Ldg/l;->a0(Ljava/io/File;Ljava/io/File;)V

    .line 137
    .line 138
    .line 139
    const/4 v2, 0x0

    .line 140
    goto :goto_1

    .line 141
    :cond_5
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v8, v7, v2, v10}, Ltb/c;->autoToSilk(Ljava/lang/String;Ljava/lang/String;I)I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    :goto_1
    if-eqz v2, :cond_6

    .line 150
    .line 151
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 152
    .line 153
    invoke-virtual {v8, v2}, Ltb/c;->getErrorMessage(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    new-instance v3, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    new-instance v3, Lsf/e;

    .line 170
    .line 171
    invoke-direct {v3, v0, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_6
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_a

    .line 180
    .line 181
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 182
    .line 183
    .line 184
    move-result-wide v5

    .line 185
    const-wide/16 v7, 0x0

    .line 186
    .line 187
    cmp-long v2, v5, v7

    .line 188
    .line 189
    if-gtz v2, :cond_7

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_7
    invoke-static {v12, v9, v0}, Lwb/ho;->c5(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-nez v0, :cond_8

    .line 197
    .line 198
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 199
    .line 200
    const-string v2, "\u4fdd\u5b58\u5931\u8d25\uff1a\u65e0\u6cd5\u5199\u5165\u76ee\u6807\u6587\u4ef6"

    .line 201
    .line 202
    new-instance v3, Lsf/e;

    .line 203
    .line 204
    invoke-direct {v3, v0, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_8
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 209
    .line 210
    invoke-static/range {v16 .. v16}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v2, :cond_9

    .line 215
    .line 216
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast v2, Ljava/lang/String;

    .line 221
    .line 222
    invoke-interface {v13}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    check-cast v3, Ljava/lang/Number;

    .line 227
    .line 228
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    invoke-static {v3, v2}, Lwb/ho;->D4(ILjava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    goto :goto_2

    .line 237
    :cond_9
    move-object/from16 v2, v16

    .line 238
    .line 239
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    new-instance v3, Lsf/e;

    .line 252
    .line 253
    invoke-direct {v3, v0, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_a
    :goto_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 258
    .line 259
    const-string v2, "\u8f6c\u6362\u5931\u8d25\uff1a\u8f93\u51fa\u6587\u4ef6\u4e3a\u7a7a"

    .line 260
    .line 261
    new-instance v3, Lsf/e;

    .line 262
    .line 263
    invoke-direct {v3, v0, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 264
    .line 265
    .line 266
    goto :goto_5

    .line 267
    :goto_4
    new-instance v3, Lsf/f;

    .line 268
    .line 269
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    :goto_5
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    if-nez v0, :cond_b

    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_b
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    if-eqz v0, :cond_c

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_c
    const-string v0, "\u672a\u77e5\u9519\u8bef"

    .line 289
    .line 290
    :goto_6
    const-string v3, "\u8f6c\u6362\u5f02\u5e38\uff1a"

    .line 291
    .line 292
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    new-instance v3, Lsf/e;

    .line 297
    .line 298
    invoke-direct {v3, v2, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    :goto_7
    move-object v10, v3

    .line 302
    check-cast v10, Lsf/e;

    .line 303
    .line 304
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eqz v0, :cond_d

    .line 309
    .line 310
    :try_start_2
    invoke-virtual {v9}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 311
    .line 312
    .line 313
    :catchall_1
    :cond_d
    new-instance v9, Lb9/c;

    .line 314
    .line 315
    const/16 v14, 0x13

    .line 316
    .line 317
    iget-object v11, v1, Lwb/ja;->o:Li0/a1;

    .line 318
    .line 319
    iget-object v13, v1, Lwb/ja;->p:Li0/a1;

    .line 320
    .line 321
    invoke-direct/range {v9 .. v14}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 322
    .line 323
    .line 324
    iget-object v0, v1, Lwb/ja;->i:Landroid/os/Handler;

    .line 325
    .line 326
    invoke-virtual {v0, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 327
    .line 328
    .line 329
    return-void
.end method
