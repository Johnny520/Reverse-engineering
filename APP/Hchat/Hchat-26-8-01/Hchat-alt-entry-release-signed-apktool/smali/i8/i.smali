.class public final Li8/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lr8/f;


# direct methods
.method public static e(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p1

    .line 6
    const-string v0, " API\u5b89\u88c5\u5931\u8d25: "

    .line 7
    .line 8
    invoke-static {p0, v0}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Li8/i;->f(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static f(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "\u5931\u8d25"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    const-string v0, "\u5f02\u5e38"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    const-string v0, "\u672a\u627e\u5230"

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    const-string v0, "\u4e3a\u7a7a"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    const-string v0, "\u4e0d\u53ef\u7528"

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    const-string v0, "\u672a\u5c31\u7eea"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    const-string v0, "\u672a\u89e3\u6790"

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    const-string v0, "\u7f3a\u5931"

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    const-string v0, "\u65e0\u5408\u9002"

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_2

    .line 75
    .line 76
    const-string v0, "ERROR"

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_2

    .line 83
    .line 84
    const-string v0, "error"

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    :goto_0
    return-void

    .line 94
    :cond_2
    :goto_1
    const-string v0, "[Hchat:WechatApi] "

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "wechat_api"

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Lr8/g;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public final c(Lr8/g;)V
    .locals 45

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    new-instance v5, Lm8/c;

    .line 6
    .line 7
    new-instance v0, Lg1/d;

    .line 8
    .line 9
    const/16 v3, 0x13

    .line 10
    .line 11
    invoke-direct {v0, v1, v3}, Lg1/d;-><init>(Li8/i;I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v5, v0}, Lm8/c;-><init>(Lm8/b;)V

    .line 15
    .line 16
    .line 17
    new-instance v13, Lo8/a;

    .line 18
    .line 19
    iget-object v0, v2, Lr8/g;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-direct {v13, v0}, Lo8/a;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    new-instance v14, Lm8/a;

    .line 25
    .line 26
    new-instance v0, Lg1/d;

    .line 27
    .line 28
    const/16 v3, 0x1b

    .line 29
    .line 30
    invoke-direct {v0, v1, v3}, Lg1/d;-><init>(Li8/i;I)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v14, v5, v0}, Lm8/a;-><init>(Lm8/c;Lg1/d;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 37
    .line 38
    iget-object v4, v2, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 39
    .line 40
    new-instance v3, Li8/f;

    .line 41
    .line 42
    const/4 v6, 0x2

    .line 43
    invoke-direct {v3, v1, v6}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v4, v3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;-><init>(Lh/Hchat/dexkit/DexFinder;Lo8/b;)V

    .line 47
    .line 48
    .line 49
    new-instance v8, Lg8/a;

    .line 50
    .line 51
    iget-object v12, v2, Lr8/g;->a:Landroid/content/Context;

    .line 52
    .line 53
    iget-object v15, v2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 54
    .line 55
    new-instance v3, Li8/f;

    .line 56
    .line 57
    const/4 v6, 0x4

    .line 58
    invoke-direct {v3, v1, v6}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v8, v12, v15, v0, v3}, Lg8/a;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Li8/f;)V

    .line 62
    .line 63
    .line 64
    new-instance v9, Lg8/i;

    .line 65
    .line 66
    new-instance v3, Li8/f;

    .line 67
    .line 68
    const/4 v6, 0x5

    .line 69
    invoke-direct {v3, v1, v6}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v9, v0, v4, v5, v3}, Lg8/i;-><init>(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Lh/Hchat/dexkit/DexFinder;Lm8/c;Li8/f;)V

    .line 73
    .line 74
    .line 75
    new-instance v11, Lq8/r;

    .line 76
    .line 77
    new-instance v3, Li8/f;

    .line 78
    .line 79
    const/4 v6, 0x6

    .line 80
    invoke-direct {v3, v1, v6}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 81
    .line 82
    .line 83
    invoke-direct {v11, v12, v3}, Lq8/r;-><init>(Landroid/content/Context;Li8/f;)V

    .line 84
    .line 85
    .line 86
    new-instance v3, Lq8/s;

    .line 87
    .line 88
    invoke-direct {v3, v12}, Lq8/s;-><init>(Landroid/content/Context;)V

    .line 89
    .line 90
    .line 91
    new-instance v10, Lk8/s;

    .line 92
    .line 93
    new-instance v6, Li8/f;

    .line 94
    .line 95
    const/4 v7, 0x7

    .line 96
    invoke-direct {v6, v1, v7}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v10, v0, v8, v4, v6}, Lk8/s;-><init>(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Lg8/a;Lh/Hchat/dexkit/DexFinder;Li8/f;)V

    .line 100
    .line 101
    .line 102
    new-instance v6, Lk8/g;

    .line 103
    .line 104
    move-object v7, v9

    .line 105
    iget-object v9, v2, Lr8/g;->f:Lf8/c;

    .line 106
    .line 107
    move-object/from16 v21, v3

    .line 108
    .line 109
    move-object v3, v6

    .line 110
    move-object v6, v8

    .line 111
    move-object v8, v10

    .line 112
    new-instance v10, Li8/f;

    .line 113
    .line 114
    move-object/from16 v16, v0

    .line 115
    .line 116
    const/16 v0, 0x8

    .line 117
    .line 118
    invoke-direct {v10, v1, v0}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 119
    .line 120
    .line 121
    invoke-direct/range {v3 .. v10}, Lk8/g;-><init>(Lh/Hchat/dexkit/DexFinder;Lm8/c;Lg8/a;Lg8/i;Lk8/s;Lf8/c;Li8/f;)V

    .line 122
    .line 123
    .line 124
    move-object/from16 v17, v3

    .line 125
    .line 126
    move-object v0, v6

    .line 127
    move-object v3, v8

    .line 128
    new-instance v6, Lk8/e;

    .line 129
    .line 130
    new-instance v8, Li8/f;

    .line 131
    .line 132
    const/4 v9, 0x0

    .line 133
    invoke-direct {v8, v1, v9}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 134
    .line 135
    .line 136
    invoke-direct {v6, v4, v8}, Lk8/e;-><init>(Lh/Hchat/dexkit/DexFinder;Li8/f;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6}, Lk8/e;->g()Z

    .line 140
    .line 141
    .line 142
    move-object/from16 v20, v6

    .line 143
    .line 144
    new-instance v6, Lh8/a;

    .line 145
    .line 146
    move-object v9, v11

    .line 147
    new-instance v11, Li8/f;

    .line 148
    .line 149
    const/4 v8, 0x3

    .line 150
    invoke-direct {v11, v1, v8}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 151
    .line 152
    .line 153
    move-object v10, v4

    .line 154
    move-object v8, v7

    .line 155
    move-object/from16 v7, v16

    .line 156
    .line 157
    invoke-direct/range {v6 .. v11}, Lh8/a;-><init>(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Lg8/i;Lq8/r;Lh/Hchat/dexkit/DexFinder;Li8/f;)V

    .line 158
    .line 159
    .line 160
    move-object v11, v6

    .line 161
    move-object/from16 v16, v9

    .line 162
    .line 163
    move-object v9, v8

    .line 164
    new-instance v10, Lg8/k;

    .line 165
    .line 166
    invoke-direct {v10, v0, v9}, Lg8/k;-><init>(Lg8/a;Lg8/i;)V

    .line 167
    .line 168
    .line 169
    move-object v8, v3

    .line 170
    new-instance v3, Lg8/d;

    .line 171
    .line 172
    move-object v6, v8

    .line 173
    new-instance v8, Li8/f;

    .line 174
    .line 175
    move-object/from16 v18, v0

    .line 176
    .line 177
    const/16 v0, 0x9

    .line 178
    .line 179
    invoke-direct {v8, v1, v0}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 180
    .line 181
    .line 182
    move-object v0, v6

    .line 183
    move-object v6, v4

    .line 184
    move-object v4, v7

    .line 185
    move-object v7, v5

    .line 186
    move-object v5, v9

    .line 187
    invoke-direct/range {v3 .. v8}, Lg8/d;-><init>(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Lg8/i;Lh/Hchat/dexkit/DexFinder;Lm8/c;Li8/f;)V

    .line 188
    .line 189
    .line 190
    move-object/from16 v44, v6

    .line 191
    .line 192
    move-object v6, v3

    .line 193
    move-object v3, v4

    .line 194
    move-object/from16 v4, v44

    .line 195
    .line 196
    move-object/from16 v44, v7

    .line 197
    .line 198
    move-object v7, v5

    .line 199
    move-object/from16 v5, v44

    .line 200
    .line 201
    new-instance v8, Lo8/g;

    .line 202
    .line 203
    invoke-direct {v8, v3}, Lo8/g;-><init>(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;)V

    .line 204
    .line 205
    .line 206
    new-instance v9, Lk8/q;

    .line 207
    .line 208
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 209
    .line 210
    .line 211
    new-instance v19, Lk8/k;

    .line 212
    .line 213
    move-object/from16 v22, v10

    .line 214
    .line 215
    iget-object v10, v2, Lr8/g;->f:Lf8/c;

    .line 216
    .line 217
    move-object/from16 v23, v11

    .line 218
    .line 219
    new-instance v11, Li8/f;

    .line 220
    .line 221
    move-object/from16 v24, v3

    .line 222
    .line 223
    const/16 v3, 0xa

    .line 224
    .line 225
    invoke-direct {v11, v1, v3}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 226
    .line 227
    .line 228
    move-object v3, v13

    .line 229
    move-object v13, v6

    .line 230
    move-object/from16 v6, v19

    .line 231
    .line 232
    move-object/from16 v19, v17

    .line 233
    .line 234
    move-object/from16 v17, v8

    .line 235
    .line 236
    move-object/from16 v8, v18

    .line 237
    .line 238
    move-object/from16 v18, v3

    .line 239
    .line 240
    move-object v3, v7

    .line 241
    move-object v7, v4

    .line 242
    move-object/from16 v4, v23

    .line 243
    .line 244
    invoke-direct/range {v6 .. v11}, Lk8/k;-><init>(Lh/Hchat/dexkit/DexFinder;Lg8/a;Lk8/q;Lf8/c;Li8/f;)V

    .line 245
    .line 246
    .line 247
    move-object/from16 v25, v6

    .line 248
    .line 249
    move-object/from16 v23, v9

    .line 250
    .line 251
    new-instance v26, Lo8/f;

    .line 252
    .line 253
    invoke-direct/range {v26 .. v26}, Ljava/lang/Object;-><init>()V

    .line 254
    .line 255
    .line 256
    new-instance v6, Lo8/d;

    .line 257
    .line 258
    new-instance v9, Li8/f;

    .line 259
    .line 260
    const/16 v10, 0xb

    .line 261
    .line 262
    invoke-direct {v9, v1, v10}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 263
    .line 264
    .line 265
    invoke-direct {v6, v7, v15, v9}, Lo8/d;-><init>(Lh/Hchat/dexkit/DexFinder;Ljava/lang/ClassLoader;Li8/f;)V

    .line 266
    .line 267
    .line 268
    new-instance v11, Lq8/o;

    .line 269
    .line 270
    new-instance v9, Li8/f;

    .line 271
    .line 272
    const/16 v10, 0xc

    .line 273
    .line 274
    invoke-direct {v9, v1, v10}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 275
    .line 276
    .line 277
    invoke-direct {v11, v9}, Lq8/o;-><init>(Li8/f;)V

    .line 278
    .line 279
    .line 280
    move-object v9, v6

    .line 281
    new-instance v6, Lj8/p;

    .line 282
    .line 283
    move-object v10, v9

    .line 284
    iget-object v9, v2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 285
    .line 286
    move-object/from16 v27, v10

    .line 287
    .line 288
    iget-object v10, v2, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 289
    .line 290
    move-object/from16 v28, v8

    .line 291
    .line 292
    move-object v8, v7

    .line 293
    move-object v7, v12

    .line 294
    new-instance v12, Li8/f;

    .line 295
    .line 296
    move-object/from16 v29, v6

    .line 297
    .line 298
    const/16 v6, 0xd

    .line 299
    .line 300
    invoke-direct {v12, v1, v6}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 301
    .line 302
    .line 303
    move-object/from16 v30, v14

    .line 304
    .line 305
    move-object/from16 v2, v27

    .line 306
    .line 307
    move-object/from16 v14, v28

    .line 308
    .line 309
    move-object/from16 v6, v29

    .line 310
    .line 311
    invoke-direct/range {v6 .. v12}, Lj8/p;-><init>(Landroid/content/Context;Lh/Hchat/dexkit/DexFinder;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Lq8/o;Li8/f;)V

    .line 312
    .line 313
    .line 314
    move-object v6, v8

    .line 315
    move-object/from16 v27, v11

    .line 316
    .line 317
    new-instance v8, Lq8/i;

    .line 318
    .line 319
    new-instance v9, Li8/f;

    .line 320
    .line 321
    const/16 v10, 0xe

    .line 322
    .line 323
    invoke-direct {v9, v1, v10}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 324
    .line 325
    .line 326
    invoke-direct {v8, v9}, Lq8/i;-><init>(Li8/f;)V

    .line 327
    .line 328
    .line 329
    new-instance v9, Lk8/i;

    .line 330
    .line 331
    new-instance v10, Li8/f;

    .line 332
    .line 333
    const/16 v11, 0xf

    .line 334
    .line 335
    invoke-direct {v10, v1, v11}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 336
    .line 337
    .line 338
    invoke-direct {v9, v2, v0, v14, v10}, Lk8/i;-><init>(Lo8/d;Lk8/s;Lg8/a;Li8/f;)V

    .line 339
    .line 340
    .line 341
    new-instance v10, Lh8/b;

    .line 342
    .line 343
    new-instance v11, Lg1/d;

    .line 344
    .line 345
    const/16 v12, 0x14

    .line 346
    .line 347
    invoke-direct {v11, v1, v12}, Lg1/d;-><init>(Li8/i;I)V

    .line 348
    .line 349
    .line 350
    invoke-direct {v10, v2, v4, v11}, Lh8/b;-><init>(Lo8/d;Lh8/a;Lg1/d;)V

    .line 351
    .line 352
    .line 353
    new-instance v11, Lg8/j;

    .line 354
    .line 355
    new-instance v12, Lg1/d;

    .line 356
    .line 357
    move-object/from16 v28, v0

    .line 358
    .line 359
    const/16 v0, 0x15

    .line 360
    .line 361
    invoke-direct {v12, v1, v0}, Lg1/d;-><init>(Li8/i;I)V

    .line 362
    .line 363
    .line 364
    invoke-direct {v11, v2, v3, v12}, Lg8/j;-><init>(Lo8/d;Lg8/i;Lg1/d;)V

    .line 365
    .line 366
    .line 367
    new-instance v0, Lg8/g;

    .line 368
    .line 369
    new-instance v12, Lg1/d;

    .line 370
    .line 371
    move-object/from16 v31, v3

    .line 372
    .line 373
    const/16 v3, 0x16

    .line 374
    .line 375
    invoke-direct {v12, v1, v3}, Lg1/d;-><init>(Li8/i;I)V

    .line 376
    .line 377
    .line 378
    invoke-direct {v0, v2, v13, v12}, Lg8/g;-><init>(Lo8/d;Lg8/d;Lg1/d;)V

    .line 379
    .line 380
    .line 381
    new-instance v3, Lq8/q;

    .line 382
    .line 383
    new-instance v12, Lg1/d;

    .line 384
    .line 385
    move-object/from16 v32, v2

    .line 386
    .line 387
    const/16 v2, 0x17

    .line 388
    .line 389
    invoke-direct {v12, v1, v2}, Lg1/d;-><init>(Li8/i;I)V

    .line 390
    .line 391
    .line 392
    invoke-direct {v3, v12}, Lq8/q;-><init>(Lg1/d;)V

    .line 393
    .line 394
    .line 395
    move-object/from16 v2, v32

    .line 396
    .line 397
    new-instance v32, Lo8/e;

    .line 398
    .line 399
    invoke-direct/range {v32 .. v32}, Ljava/lang/Object;-><init>()V

    .line 400
    .line 401
    .line 402
    new-instance v12, Lo8/j;

    .line 403
    .line 404
    move-object/from16 v33, v2

    .line 405
    .line 406
    new-instance v2, Lg1/d;

    .line 407
    .line 408
    move-object/from16 v34, v3

    .line 409
    .line 410
    const/16 v3, 0x18

    .line 411
    .line 412
    invoke-direct {v2, v1, v3}, Lg1/d;-><init>(Li8/i;I)V

    .line 413
    .line 414
    .line 415
    invoke-direct {v12, v7, v2}, Lo8/j;-><init>(Landroid/content/Context;Lg1/d;)V

    .line 416
    .line 417
    .line 418
    new-instance v2, Lo8/k;

    .line 419
    .line 420
    invoke-direct {v2, v7, v15}, Lo8/k;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;)V

    .line 421
    .line 422
    .line 423
    move-object v3, v7

    .line 424
    new-instance v7, Lk8/p;

    .line 425
    .line 426
    move-object v15, v12

    .line 427
    new-instance v12, Lg1/d;

    .line 428
    .line 429
    move-object/from16 v36, v2

    .line 430
    .line 431
    const/16 v2, 0x19

    .line 432
    .line 433
    invoke-direct {v12, v1, v2}, Lg1/d;-><init>(Li8/i;I)V

    .line 434
    .line 435
    .line 436
    move-object v2, v14

    .line 437
    move-object v14, v10

    .line 438
    move-object/from16 v10, v23

    .line 439
    .line 440
    move-object/from16 v23, v33

    .line 441
    .line 442
    move-object/from16 v33, v15

    .line 443
    .line 444
    move-object v15, v11

    .line 445
    move-object v11, v2

    .line 446
    move-object v2, v8

    .line 447
    move-object/from16 v8, v25

    .line 448
    .line 449
    invoke-direct/range {v7 .. v12}, Lk8/p;-><init>(Lk8/k;Lk8/i;Lk8/q;Lg8/a;Lg1/d;)V

    .line 450
    .line 451
    .line 452
    move-object/from16 v25, v11

    .line 453
    .line 454
    move-object/from16 v35, v16

    .line 455
    .line 456
    move-object/from16 v37, v19

    .line 457
    .line 458
    move-object v11, v7

    .line 459
    move-object/from16 v19, v8

    .line 460
    .line 461
    move-object v7, v9

    .line 462
    move-object/from16 v16, v13

    .line 463
    .line 464
    move-object/from16 v13, v18

    .line 465
    .line 466
    move-object/from16 v18, v10

    .line 467
    .line 468
    new-instance v12, Lq8/m;

    .line 469
    .line 470
    move-object v8, v6

    .line 471
    move-object v6, v12

    .line 472
    new-instance v12, Lg1/d;

    .line 473
    .line 474
    const/16 v9, 0x1a

    .line 475
    .line 476
    invoke-direct {v12, v1, v9}, Lg1/d;-><init>(Li8/i;I)V

    .line 477
    .line 478
    .line 479
    move-object/from16 v9, v27

    .line 480
    .line 481
    move-object/from16 v27, v7

    .line 482
    .line 483
    move-object v7, v8

    .line 484
    move-object v8, v9

    .line 485
    move-object v10, v2

    .line 486
    move-object/from16 v9, v34

    .line 487
    .line 488
    move-object/from16 v34, v11

    .line 489
    .line 490
    move-object/from16 v11, v31

    .line 491
    .line 492
    invoke-direct/range {v6 .. v12}, Lq8/m;-><init>(Lh/Hchat/dexkit/DexFinder;Lq8/o;Lq8/q;Lq8/i;Lg8/i;Lg1/d;)V

    .line 493
    .line 494
    .line 495
    move-object v12, v8

    .line 496
    move-object/from16 v31, v9

    .line 497
    .line 498
    move-object v9, v11

    .line 499
    new-instance v8, Ln8/c;

    .line 500
    .line 501
    new-instance v10, Lg1/d;

    .line 502
    .line 503
    const/16 v11, 0x1c

    .line 504
    .line 505
    invoke-direct {v10, v1, v11}, Lg1/d;-><init>(Li8/i;I)V

    .line 506
    .line 507
    .line 508
    invoke-direct {v8, v7, v5, v10}, Ln8/c;-><init>(Lh/Hchat/dexkit/DexFinder;Lm8/c;Lg1/d;)V

    .line 509
    .line 510
    .line 511
    new-instance v10, Lg8/l;

    .line 512
    .line 513
    new-instance v11, Lg1/d;

    .line 514
    .line 515
    move-object/from16 v38, v2

    .line 516
    .line 517
    const/16 v2, 0x1d

    .line 518
    .line 519
    invoke-direct {v11, v1, v2}, Lg1/d;-><init>(Li8/i;I)V

    .line 520
    .line 521
    .line 522
    invoke-direct {v10, v7, v5, v11}, Lg8/l;-><init>(Lh/Hchat/dexkit/DexFinder;Lm8/c;Lg1/d;)V

    .line 523
    .line 524
    .line 525
    new-instance v2, Lp8/d0;

    .line 526
    .line 527
    move-object/from16 v5, p1

    .line 528
    .line 529
    iget-object v11, v5, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 530
    .line 531
    move-object/from16 v39, v6

    .line 532
    .line 533
    iget-object v6, v5, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 534
    .line 535
    move-object v5, v11

    .line 536
    new-instance v11, Li8/f;

    .line 537
    .line 538
    move-object/from16 v40, v2

    .line 539
    .line 540
    const/4 v2, 0x1

    .line 541
    invoke-direct {v11, v1, v2}, Li8/f;-><init>(Ljava/lang/Object;I)V

    .line 542
    .line 543
    .line 544
    move-object/from16 v1, v37

    .line 545
    .line 546
    move-object/from16 v37, v8

    .line 547
    .line 548
    move-object/from16 v8, v25

    .line 549
    .line 550
    move-object/from16 v25, v13

    .line 551
    .line 552
    move-object/from16 v13, v27

    .line 553
    .line 554
    move-object/from16 v27, v1

    .line 555
    .line 556
    move-object/from16 v1, v23

    .line 557
    .line 558
    move-object/from16 v41, v31

    .line 559
    .line 560
    move-object/from16 v42, v34

    .line 561
    .line 562
    move-object/from16 v43, v39

    .line 563
    .line 564
    move-object/from16 v2, v40

    .line 565
    .line 566
    move-object/from16 v23, v4

    .line 567
    .line 568
    move-object v4, v7

    .line 569
    move-object/from16 v7, v30

    .line 570
    .line 571
    move-object/from16 v30, v10

    .line 572
    .line 573
    move-object/from16 v10, p1

    .line 574
    .line 575
    invoke-direct/range {v2 .. v11}, Lp8/d0;-><init>(Landroid/content/Context;Lh/Hchat/dexkit/DexFinder;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Lm8/a;Lg8/a;Lg8/i;Lr8/g;Li8/f;)V

    .line 576
    .line 577
    .line 578
    move-object v3, v7

    .line 579
    move-object v7, v9

    .line 580
    invoke-virtual {v3, v4}, Lm8/a;->a(Lh/Hchat/dexkit/DexFinder;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v19 .. v19}, Lk8/k;->a()V

    .line 584
    .line 585
    .line 586
    new-instance v4, La1/a;

    .line 587
    .line 588
    const/16 v5, 0xc

    .line 589
    .line 590
    invoke-direct {v4, v1, v5}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 591
    .line 592
    .line 593
    const-string v5, "databaseChanges"

    .line 594
    .line 595
    invoke-static {v5, v4}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 596
    .line 597
    .line 598
    new-instance v4, La1/a;

    .line 599
    .line 600
    const/16 v5, 0xd

    .line 601
    .line 602
    invoke-direct {v4, v13, v5}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 603
    .line 604
    .line 605
    const-string v5, "messageChanges"

    .line 606
    .line 607
    invoke-static {v5, v4}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 608
    .line 609
    .line 610
    new-instance v4, La1/a;

    .line 611
    .line 612
    const/16 v5, 0xe

    .line 613
    .line 614
    invoke-direct {v4, v14, v5}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 615
    .line 616
    .line 617
    const-string v5, "conversationChanges"

    .line 618
    .line 619
    invoke-static {v5, v4}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 620
    .line 621
    .line 622
    new-instance v4, La1/a;

    .line 623
    .line 624
    const/16 v5, 0xf

    .line 625
    .line 626
    invoke-direct {v4, v15, v5}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 627
    .line 628
    .line 629
    const-string v5, "contactChanges"

    .line 630
    .line 631
    invoke-static {v5, v4}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 632
    .line 633
    .line 634
    new-instance v4, La1/a;

    .line 635
    .line 636
    const/16 v5, 0x10

    .line 637
    .line 638
    invoke-direct {v4, v0, v5}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 639
    .line 640
    .line 641
    const-string v5, "chatroomChanges"

    .line 642
    .line 643
    invoke-static {v5, v4}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 644
    .line 645
    .line 646
    new-instance v4, La1/a;

    .line 647
    .line 648
    const/16 v5, 0x11

    .line 649
    .line 650
    invoke-direct {v4, v12, v5}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 651
    .line 652
    .line 653
    const-string v5, "currentActivity"

    .line 654
    .line 655
    invoke-static {v5, v4}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 656
    .line 657
    .line 658
    new-instance v4, La1/a;

    .line 659
    .line 660
    const/16 v5, 0x12

    .line 661
    .line 662
    move-object/from16 v10, v38

    .line 663
    .line 664
    invoke-direct {v4, v10, v5}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 665
    .line 666
    .line 667
    const-string v5, "activityStart"

    .line 668
    .line 669
    invoke-static {v5, v4}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 670
    .line 671
    .line 672
    new-instance v4, La1/a;

    .line 673
    .line 674
    const/16 v5, 0x13

    .line 675
    .line 676
    move-object/from16 v9, v41

    .line 677
    .line 678
    invoke-direct {v4, v9, v5}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 679
    .line 680
    .line 681
    const-string v5, "lifecycle"

    .line 682
    .line 683
    invoke-static {v5, v4}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 684
    .line 685
    .line 686
    new-instance v4, La1/a;

    .line 687
    .line 688
    const/16 v5, 0x14

    .line 689
    .line 690
    move-object/from16 v11, v42

    .line 691
    .line 692
    invoke-direct {v4, v11, v5}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 693
    .line 694
    .line 695
    const-string v5, "messageObserve"

    .line 696
    .line 697
    invoke-static {v5, v4}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 698
    .line 699
    .line 700
    new-instance v4, La1/a;

    .line 701
    .line 702
    const/16 v5, 0x15

    .line 703
    .line 704
    move-object/from16 v6, v43

    .line 705
    .line 706
    invoke-direct {v4, v6, v5}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 707
    .line 708
    .line 709
    const-string v5, "chatPage"

    .line 710
    .line 711
    invoke-static {v5, v4}, Li8/i;->e(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 712
    .line 713
    .line 714
    move-object/from16 v31, v35

    .line 715
    .line 716
    move-object/from16 v35, v6

    .line 717
    .line 718
    move-object/from16 v6, v27

    .line 719
    .line 720
    move-object/from16 v27, v13

    .line 721
    .line 722
    move-object/from16 v13, v25

    .line 723
    .line 724
    move-object/from16 v25, v12

    .line 725
    .line 726
    move-object/from16 v12, v31

    .line 727
    .line 728
    move-object/from16 v31, v29

    .line 729
    .line 730
    move-object/from16 v29, v15

    .line 731
    .line 732
    move-object/from16 v15, v22

    .line 733
    .line 734
    move-object/from16 v22, v31

    .line 735
    .line 736
    move-object/from16 v39, v2

    .line 737
    .line 738
    move-object/from16 v31, v9

    .line 739
    .line 740
    move-object/from16 v34, v11

    .line 741
    .line 742
    move-object/from16 v11, v23

    .line 743
    .line 744
    move-object/from16 v23, v26

    .line 745
    .line 746
    move-object/from16 v38, v30

    .line 747
    .line 748
    move-object/from16 v30, v0

    .line 749
    .line 750
    move-object v9, v7

    .line 751
    move-object/from16 v26, v10

    .line 752
    .line 753
    move-object/from16 v7, v24

    .line 754
    .line 755
    move-object/from16 v10, v28

    .line 756
    .line 757
    move-object/from16 v24, v1

    .line 758
    .line 759
    move-object/from16 v28, v14

    .line 760
    .line 761
    move-object v14, v3

    .line 762
    invoke-static/range {v6 .. v39}, Lh/Hchat/hooks/api/core/WeChatApis;->init(Lk8/g;Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Lg8/a;Lg8/i;Lk8/s;Lh8/a;Lq8/r;Lo8/a;Lm8/a;Lg8/k;Lg8/d;Lo8/g;Lk8/q;Lk8/k;Lk8/e;Lq8/s;Lj8/p;Lo8/f;Lo8/d;Lq8/o;Lq8/i;Lk8/i;Lh8/b;Lg8/j;Lg8/g;Lq8/q;Lo8/e;Lo8/j;Lk8/p;Lq8/m;Lo8/k;Ln8/c;Lg8/l;Lp8/d0;)V

    .line 763
    .line 764
    .line 765
    move-object/from16 v2, v24

    .line 766
    .line 767
    move-object/from16 v7, v27

    .line 768
    .line 769
    move-object/from16 v14, v28

    .line 770
    .line 771
    move-object/from16 v15, v29

    .line 772
    .line 773
    move-object/from16 v11, v34

    .line 774
    .line 775
    move-object/from16 v6, v35

    .line 776
    .line 777
    move-object/from16 v4, v39

    .line 778
    .line 779
    new-instance v0, Li8/g;

    .line 780
    .line 781
    move-object/from16 v1, p0

    .line 782
    .line 783
    move-object v12, v6

    .line 784
    move-object v8, v14

    .line 785
    move-object v9, v15

    .line 786
    move-object/from16 v5, v19

    .line 787
    .line 788
    move-object/from16 v10, v30

    .line 789
    .line 790
    move-object v6, v2

    .line 791
    move-object/from16 v2, p1

    .line 792
    .line 793
    invoke-direct/range {v0 .. v12}, Li8/g;-><init>(Li8/i;Lr8/g;Lm8/a;Lp8/d0;Lk8/k;Lo8/d;Lk8/i;Lh8/b;Lg8/j;Lg8/g;Lk8/p;Lq8/m;)V

    .line 794
    .line 795
    .line 796
    new-instance v1, Li/e0;

    .line 797
    .line 798
    const/16 v3, 0xe

    .line 799
    .line 800
    invoke-direct {v1, v0, v3}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 801
    .line 802
    .line 803
    const/16 v0, 0x3e8

    .line 804
    .line 805
    const-string v3, "wechat_api:warmup"

    .line 806
    .line 807
    const-string v4, "\u5fae\u4fe1\u516c\u5171API\u9884\u70ed"

    .line 808
    .line 809
    sget-object v5, Lr8/c;->i:Lr8/c;

    .line 810
    .line 811
    invoke-static {v0, v1, v3, v4, v5}, Lr8/e;->e(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 812
    .line 813
    .line 814
    new-instance v0, Lfd/b;

    .line 815
    .line 816
    const/4 v1, 0x2

    .line 817
    invoke-direct {v0, v2, v1}, Lfd/b;-><init>(Ljava/lang/Object;I)V

    .line 818
    .line 819
    .line 820
    new-instance v1, Li/e0;

    .line 821
    .line 822
    const/16 v2, 0xe

    .line 823
    .line 824
    invoke-direct {v1, v0, v2}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 825
    .line 826
    .line 827
    const/4 v0, 0x0

    .line 828
    const-string v2, "wechat_api:private_conversation_mute"

    .line 829
    .line 830
    const-string v3, "\u79c1\u804a\u514d\u6253\u6270API\u8865\u5b9a\u4f4d"

    .line 831
    .line 832
    sget-object v4, Lr8/c;->j:Lr8/c;

    .line 833
    .line 834
    invoke-static {v0, v1, v2, v3, v4}, Lr8/e;->e(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 835
    .line 836
    .line 837
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u5fae\u4fe1\u516c\u5171API"

    .line 2
    .line 3
    return-object v0
.end method
