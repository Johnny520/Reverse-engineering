.class public final synthetic Lna/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lsa/d;
.implements Lm8/b;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lna/e;


# direct methods
.method public synthetic constructor <init>(Lna/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Lna/b;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lna/b;->h:Lna/e;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lna/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    iget-object v0, p0, Lna/b;->h:Lna/e;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lna/e;->d(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lna/b;->h:Lna/e;

    .line 2
    .line 3
    iget-object v1, v0, Lna/e;->f:Lna/k;

    .line 4
    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iget-object v2, v1, Lna/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    :goto_0
    iget-object v3, v0, Lna/e;->h:Lbe/k;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lna/e;->g(Ljava/lang/String;)Lna/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v4, "\u624b\u6162\u4e86\u6216\u7ea2\u5305\u5df2\u9886\u5b8c"

    .line 28
    .line 29
    invoke-virtual {v3, v2, p1, v4, v0}, Lbe/k;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lna/a;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    iget-object v0, v1, Lna/k;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    iget-object v0, v1, Lna/k;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    iget-object v0, v1, Lna/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object v0, v1, Lna/k;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    iget-object v5, v3, Lna/b;->h:Lna/e;

    .line 12
    .line 13
    invoke-virtual {v5, v2}, Lna/e;->g(Ljava/lang/String;)Lna/a;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    iget-object v7, v5, Lna/e;->h:Lbe/k;

    .line 18
    .line 19
    invoke-virtual {v7, v0, v1, v2, v6}, Lbe/k;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lna/a;)V

    .line 20
    .line 21
    .line 22
    iget-object v7, v5, Lna/e;->r:Lra/c;

    .line 23
    .line 24
    invoke-virtual {v7, v0, v1, v2, v6}, Lra/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lna/a;)V

    .line 25
    .line 26
    .line 27
    iget-object v6, v5, Lna/e;->p:Lta/c;

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    invoke-virtual {v6, v2, v1, v0, v7}, Lta/c;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v5, Lna/e;->q:Lhb/c;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, Lhb/c;->j:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lna/b;

    .line 41
    .line 42
    const-string v2, "sendId"

    .line 43
    .line 44
    invoke-static {v4, v2}, Lhb/c;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    const-string v2, "sendid"

    .line 55
    .line 56
    invoke-static {v4, v2}, Lhb/c;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :cond_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    move-object/from16 v2, p4

    .line 67
    .line 68
    :cond_1
    const-string v5, "receiveId"

    .line 69
    .line 70
    invoke-static {v4, v5}, Lhb/c;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_2

    .line 79
    .line 80
    const-string v5, "receiveid"

    .line 81
    .line 82
    invoke-static {v4, v5}, Lhb/c;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    :cond_2
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_3

    .line 91
    .line 92
    const-string v5, "receive_id"

    .line 93
    .line 94
    invoke-static {v4, v5}, Lhb/c;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    :cond_3
    const-string v6, "ver"

    .line 99
    .line 100
    invoke-static {v4, v6}, Lhb/c;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    if-eqz v8, :cond_4

    .line 109
    .line 110
    const-string v6, "hbVer"

    .line 111
    .line 112
    invoke-static {v4, v6}, Lhb/c;->r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    :cond_4
    iget-object v4, v0, Lhb/c;->i:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v4, Lm8/c;

    .line 119
    .line 120
    iget-object v8, v0, Lhb/c;->g:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v8, Lh/Hchat/dexkit/DexFinder;

    .line 123
    .line 124
    const-string v9, "\u795d\u798f\u529f\u80fd\u4e0d\u53ef\u7528: class="

    .line 125
    .line 126
    const-string v10, "\u81ea\u52a8\u795d\u798f\u5df2\u53d1\u9001: "

    .line 127
    .line 128
    iget-object v0, v0, Lhb/c;->h:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Ll3/l;

    .line 131
    .line 132
    const-string v11, "hb_wish_enable"

    .line 133
    .line 134
    :try_start_0
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    invoke-interface {v12, v11, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 139
    .line 140
    .line 141
    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    goto :goto_0

    .line 143
    :catchall_0
    move v11, v7

    .line 144
    :goto_0
    if-nez v11, :cond_5

    .line 145
    .line 146
    goto/16 :goto_8

    .line 147
    .line 148
    :cond_5
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    if-eqz v11, :cond_6

    .line 153
    .line 154
    goto/16 :goto_8

    .line 155
    .line 156
    :cond_6
    const-string v11, "hb_wish_text"

    .line 157
    .line 158
    const-string v12, "\u8c22\u8c22\u8001\u677f"

    .line 159
    .line 160
    invoke-virtual {v0, v11, v12}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    const-string v12, "hb_wish_random"

    .line 165
    .line 166
    :try_start_1
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 167
    .line 168
    .line 169
    move-result-object v13

    .line 170
    invoke-interface {v13, v12, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 171
    .line 172
    .line 173
    move-result v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 174
    goto :goto_1

    .line 175
    :catchall_1
    move v12, v7

    .line 176
    :goto_1
    const-string v13, ""

    .line 177
    .line 178
    if-nez v12, :cond_7

    .line 179
    .line 180
    :goto_2
    move-object/from16 p1, v8

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_7
    const-string v12, "hb_wish_templates"

    .line 184
    .line 185
    invoke-virtual {v0, v12, v13}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    if-eqz v12, :cond_8

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_8
    const-string v12, "\\|"

    .line 197
    .line 198
    invoke-virtual {v0, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    array-length v12, v0

    .line 203
    if-nez v12, :cond_9

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_9
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 207
    .line 208
    .line 209
    move-result-wide v14

    .line 210
    array-length v12, v0

    .line 211
    move-object/from16 p1, v8

    .line 212
    .line 213
    int-to-double v7, v12

    .line 214
    mul-double/2addr v14, v7

    .line 215
    double-to-int v7, v14

    .line 216
    aget-object v0, v0, v7

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    if-eqz v7, :cond_a

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_a
    move-object v11, v0

    .line 230
    :goto_3
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_b

    .line 235
    .line 236
    goto/16 :goto_8

    .line 237
    .line 238
    :cond_b
    move-object/from16 v8, p1

    .line 239
    .line 240
    :try_start_2
    iget-object v0, v8, Lh/Hchat/dexkit/DexFinder;->wishWxHbClass:Ljava/lang/Class;

    .line 241
    .line 242
    if-eqz v0, :cond_f

    .line 243
    .line 244
    iget-object v0, v8, Lh/Hchat/dexkit/DexFinder;->wishWxHbCtor:Ljava/lang/reflect/Constructor;

    .line 245
    .line 246
    if-eqz v0, :cond_f

    .line 247
    .line 248
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-eqz v7, :cond_c

    .line 253
    .line 254
    move-object v5, v13

    .line 255
    :cond_c
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 256
    .line 257
    .line 258
    move-result v7

    .line 259
    if-eqz v7, :cond_d

    .line 260
    .line 261
    const-string v6, "v1.0"

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :catchall_2
    move-exception v0

    .line 265
    goto :goto_9

    .line 266
    :cond_d
    :goto_4
    filled-new-array {v2, v11, v5, v6}, [Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-static {v0, v2}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {v4, v0}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-eqz v0, :cond_e

    .line 279
    .line 280
    new-instance v0, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    iget-object v2, v1, Lna/b;->h:Lna/e;

    .line 293
    .line 294
    invoke-virtual {v2, v0}, Lna/e;->d(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    goto :goto_8

    .line 298
    :cond_e
    const-string v0, "\u81ea\u52a8\u795d\u798f\u53d1\u9001\u5931\u8d25"

    .line 299
    .line 300
    iget-object v2, v1, Lna/b;->h:Lna/e;

    .line 301
    .line 302
    invoke-virtual {v2, v0}, Lna/e;->d(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    iget-object v2, v8, Lh/Hchat/dexkit/DexFinder;->wishWxHbClass:Ljava/lang/Class;

    .line 312
    .line 313
    const/4 v5, 0x1

    .line 314
    if-eqz v2, :cond_10

    .line 315
    .line 316
    move v2, v5

    .line 317
    goto :goto_5

    .line 318
    :cond_10
    const/4 v2, 0x0

    .line 319
    :goto_5
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    const-string v2, " ctor="

    .line 323
    .line 324
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    iget-object v2, v8, Lh/Hchat/dexkit/DexFinder;->wishWxHbCtor:Ljava/lang/reflect/Constructor;

    .line 328
    .line 329
    if-eqz v2, :cond_11

    .line 330
    .line 331
    move v2, v5

    .line 332
    goto :goto_6

    .line 333
    :cond_11
    const/4 v2, 0x0

    .line 334
    :goto_6
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    const-string v2, " dispatcher="

    .line 338
    .line 339
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    iget-object v2, v4, Lm8/c;->c:Ljava/lang/Object;

    .line 343
    .line 344
    if-eqz v2, :cond_12

    .line 345
    .line 346
    iget-object v2, v4, Lm8/c;->d:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v2, Ljava/lang/reflect/Method;

    .line 349
    .line 350
    if-eqz v2, :cond_12

    .line 351
    .line 352
    move v7, v5

    .line 353
    goto :goto_7

    .line 354
    :cond_12
    const/4 v7, 0x0

    .line 355
    :goto_7
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    iget-object v2, v1, Lna/b;->h:Lna/e;

    .line 363
    .line 364
    invoke-virtual {v2, v0}, Lna/e;->d(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 365
    .line 366
    .line 367
    :goto_8
    return-void

    .line 368
    :goto_9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    const-string v4, "ERROR sendWish: "

    .line 371
    .line 372
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    iget-object v1, v1, Lna/b;->h:Lna/e;

    .line 387
    .line 388
    invoke-virtual {v1, v0}, Lna/e;->d(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lna/b;->h:Lna/e;

    .line 2
    .line 3
    iget-object v1, v0, Lna/e;->f:Lna/k;

    .line 4
    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iget-object v2, v0, Lna/e;->g:Lb5/c;

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lb5/c;->y(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    iget-object v2, v1, Lna/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/String;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v2, 0x0

    .line 36
    :goto_0
    invoke-virtual {v0, p1}, Lna/e;->g(Ljava/lang/String;)Lna/a;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object v4, v0, Lna/e;->h:Lbe/k;

    .line 41
    .line 42
    invoke-virtual {v4, p2, v2, p1, v3}, Lbe/k;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lna/a;)V

    .line 43
    .line 44
    .line 45
    iget-object v4, v0, Lna/e;->r:Lra/c;

    .line 46
    .line 47
    invoke-virtual {v4, p2, v2, p1, v3}, Lra/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lna/a;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, Lna/e;->p:Lta/c;

    .line 51
    .line 52
    invoke-virtual {v0, p1, v2, p2, p3}, Lta/c;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-nez p2, :cond_2

    .line 60
    .line 61
    iget-object p2, v1, Lna/k;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    iget-object p2, v1, Lna/k;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 67
    .line 68
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    iget-object p2, v1, Lna/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 72
    .line 73
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    iget-object p2, v1, Lna/k;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 77
    .line 78
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_2
    :goto_1
    return-void
.end method
