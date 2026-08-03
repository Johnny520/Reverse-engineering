.class public final Lra/b;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lra/c;


# direct methods
.method public synthetic constructor <init>(Lra/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lra/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lra/b;->b:Lra/c;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 14

    .line 1
    iget v0, p0, Lra/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const-string v0, ""

    .line 11
    .line 12
    const-string v1, "\u62c6\u7ea2\u5305\u5b8c\u6210: sendid="

    .line 13
    .line 14
    const-string v2, "\u62c6\u7ea2\u5305\u5b8c\u6210\u4f46\u672a\u53d6\u5230\u672c\u4eba\u5b9e\u6536\u91d1\u989d: sendid="

    .line 15
    .line 16
    iget-object v3, p0, Lra/b;->b:Lra/c;

    .line 17
    .line 18
    iget-object v4, v3, Lra/c;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Lna/k;

    .line 21
    .line 22
    iget-object v5, v3, Lra/c;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v5, Ll3/l;

    .line 25
    .line 26
    invoke-virtual {v5}, Ll3/l;->f()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-nez v5, :cond_0

    .line 31
    .line 32
    goto/16 :goto_7

    .line 33
    .line 34
    :cond_0
    :try_start_0
    iget-object v5, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    array-length v7, v5

    .line 40
    const/4 v8, 0x2

    .line 41
    if-le v7, v8, :cond_1

    .line 42
    .line 43
    aget-object v5, v5, v8

    .line 44
    .line 45
    move-object v9, v5

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object p1, v0

    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :cond_1
    move-object v9, v6

    .line 52
    :goto_0
    if-eqz v9, :cond_2

    .line 53
    .line 54
    const-string v5, "sendId"

    .line 55
    .line 56
    invoke-static {v9, v5}, Lx6/d;->a0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_3

    .line 65
    .line 66
    const-string v5, "sendid"

    .line 67
    .line 68
    invoke-static {v9, v5}, Lx6/d;->a0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move-object v5, v6

    .line 74
    :cond_3
    :goto_1
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_4

    .line 79
    .line 80
    iget-object v7, v4, Lna/k;->p:Ljava/util/Set;

    .line 81
    .line 82
    invoke-interface {v7}, Ljava/util/Set;->size()I

    .line 83
    .line 84
    .line 85
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    const/4 v8, 0x1

    .line 87
    if-ne v7, v8, :cond_4

    .line 88
    .line 89
    :try_start_1
    iget-object v7, v4, Lna/k;->p:Ljava/util/Set;

    .line 90
    .line 91
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    check-cast v7, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    .line 101
    move-object v8, v7

    .line 102
    goto :goto_2

    .line 103
    :catchall_1
    :cond_4
    move-object v8, v5

    .line 104
    :goto_2
    :try_start_2
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-nez v5, :cond_d

    .line 109
    .line 110
    iget-object v5, v4, Lna/k;->p:Ljava/util/Set;

    .line 111
    .line 112
    invoke-interface {v5, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-nez v5, :cond_5

    .line 117
    .line 118
    goto/16 :goto_7

    .line 119
    .line 120
    :cond_5
    new-instance v5, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v7, "redpacket_open_timeout:"

    .line 123
    .line 124
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-static {v5}, Lra/c;->c(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    :try_start_3
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 139
    .line 140
    if-eqz p1, :cond_6

    .line 141
    .line 142
    array-length v7, p1

    .line 143
    if-lez v7, :cond_6

    .line 144
    .line 145
    aget-object p1, p1, v5

    .line 146
    .line 147
    instance-of v7, p1, Ljava/lang/Number;

    .line 148
    .line 149
    if-eqz v7, :cond_6

    .line 150
    .line 151
    check-cast p1, Ljava/lang/Number;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 157
    :catchall_2
    :cond_6
    :try_start_4
    invoke-static {v5, v9}, Lx6/d;->w(ILjava/lang/Object;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    iget-object p1, v4, Lna/k;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 162
    .line 163
    invoke-virtual {p1, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Ljava/util/Map;

    .line 168
    .line 169
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 170
    .line 171
    .line 172
    move-result v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 173
    if-eqz v7, :cond_7

    .line 174
    .line 175
    goto/16 :goto_5

    .line 176
    .line 177
    :cond_7
    :try_start_5
    const-string v7, "[^0-9.\\-]"

    .line 178
    .line 179
    invoke-virtual {v5, v7, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 184
    .line 185
    .line 186
    move-result v10

    .line 187
    if-nez v10, :cond_c

    .line 188
    .line 189
    invoke-static {v7}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 190
    .line 191
    .line 192
    move-result-wide v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 193
    const-wide v12, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    cmpl-double v7, v10, v12

    .line 199
    .line 200
    if-lez v7, :cond_c

    .line 201
    .line 202
    if-eqz p1, :cond_8

    .line 203
    .line 204
    :try_start_6
    const-string v2, "talker"

    .line 205
    .line 206
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    check-cast v2, Ljava/lang/String;

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_8
    move-object v2, v6

    .line 214
    :goto_3
    iget-object v7, v4, Lna/k;->p:Ljava/util/Set;

    .line 215
    .line 216
    invoke-interface {v7, v8}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    iget-object v4, v4, Lna/k;->q:Ljava/util/Set;

    .line 220
    .line 221
    invoke-interface {v4, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    new-instance v4, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    const-string v1, " amount="

    .line 233
    .line 234
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string v1, " talker="

    .line 241
    .line 242
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {v3, v1}, Lra/c;->j(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    if-eqz p1, :cond_9

    .line 256
    .line 257
    const-string v1, "nativeurl"

    .line 258
    .line 259
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    move-object v6, p1

    .line 264
    check-cast v6, Ljava/lang/String;

    .line 265
    .line 266
    :cond_9
    move-object v7, v6

    .line 267
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    if-nez p1, :cond_a

    .line 272
    .line 273
    iget-object p1, v3, Lra/c;->g:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast p1, Lke/h;

    .line 276
    .line 277
    iget-object p1, p1, Lke/h;->h:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast p1, Lb5/c;

    .line 280
    .line 281
    invoke-virtual {p1, v7}, Lb5/c;->y(Ljava/lang/String;)Z

    .line 282
    .line 283
    .line 284
    :cond_a
    iget-object p1, v3, Lra/c;->h:Ljava/lang/Object;

    .line 285
    .line 286
    move-object v4, p1

    .line 287
    check-cast v4, Lna/b;

    .line 288
    .line 289
    if-eqz v2, :cond_b

    .line 290
    .line 291
    move-object v6, v2

    .line 292
    goto :goto_4

    .line 293
    :cond_b
    move-object v6, v0

    .line 294
    :goto_4
    invoke-virtual/range {v4 .. v9}, Lna/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    goto :goto_7

    .line 298
    :catchall_3
    :cond_c
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const-string v1, " json="

    .line 307
    .line 308
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v3, v0}, Lra/c;->j(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    const-string v0, "\u672a\u62a2\u5230\u672c\u4eba\u5b9e\u6536\u91d1\u989d"

    .line 326
    .line 327
    invoke-virtual {v3, v0, p1}, Lra/c;->n(Ljava/lang/String;Ljava/util/Map;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v3, v8}, Lra/c;->d(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 331
    .line 332
    .line 333
    goto :goto_7

    .line 334
    :goto_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 335
    .line 336
    const-string v1, "ERROR openCallback: "

    .line 337
    .line 338
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-virtual {v3, p1}, Lra/c;->j(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    :cond_d
    :goto_7
    return-void

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lra/b;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    const-string v2, "\u62c6\u7ea2\u5305\u53d1\u5305\u5931\u8d25"

    .line 15
    .line 16
    const-string v3, "\u62c6\u7ea2\u5305\u8bf7\u6c42\u6784\u9020\u5931\u8d25"

    .line 17
    .line 18
    const-string v4, "nickname"

    .line 19
    .line 20
    const-string v5, "headimg"

    .line 21
    .line 22
    const-string v6, "channelid"

    .line 23
    .line 24
    const-string v7, "msgtype"

    .line 25
    .line 26
    const-string v8, "\u62c6\u7ea2\u5305\u53d1\u5305\u5931\u8d25: "

    .line 27
    .line 28
    const-string v9, "\u62c6\u7ea2\u5305\u8bf7\u6c42\u5df2\u53d1\u9001: "

    .line 29
    .line 30
    const-string v10, "\u6536\u7ea2\u5305\u54cd\u5e94: sendid="

    .line 31
    .line 32
    iget-object v11, v1, Lra/b;->b:Lra/c;

    .line 33
    .line 34
    iget-object v12, v11, Lra/c;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v12, Lna/k;

    .line 37
    .line 38
    iget-object v13, v11, Lra/c;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v13, Lh/Hchat/dexkit/DexFinder;

    .line 41
    .line 42
    iget-object v14, v11, Lra/c;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v14, Ll3/l;

    .line 45
    .line 46
    invoke-virtual {v14}, Ll3/l;->f()Z

    .line 47
    .line 48
    .line 49
    move-result v14

    .line 50
    if-nez v14, :cond_0

    .line 51
    .line 52
    goto/16 :goto_c

    .line 53
    .line 54
    :cond_0
    :try_start_0
    iget-object v14, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 55
    .line 56
    const/4 v15, 0x2

    .line 57
    aget-object v14, v14, v15

    .line 58
    .line 59
    if-nez v14, :cond_1

    .line 60
    .line 61
    goto/16 :goto_c

    .line 62
    .line 63
    :cond_1
    const-string v15, "sendId"

    .line 64
    .line 65
    invoke-static {v14, v15}, Lx6/d;->a0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v15

    .line 69
    const-string v1, "timingIdentifier"

    .line 70
    .line 71
    invoke-static {v14, v1}, Lx6/d;->a0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    new-instance v14, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v14, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v10, " timingId="

    .line 84
    .line 85
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    invoke-virtual {v11, v10}, Lra/c;->j(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-nez v10, :cond_18

    .line 103
    .line 104
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 108
    if-eqz v10, :cond_2

    .line 109
    .line 110
    goto/16 :goto_c

    .line 111
    .line 112
    :cond_2
    :try_start_1
    iget-object v14, v12, Lna/k;->l:Ljava/util/Map;

    .line 113
    .line 114
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-interface {v14, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :catchall_0
    const/4 v0, 0x0

    .line 124
    :goto_0
    if-eqz v0, :cond_3

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    :try_start_2
    iget-object v0, v12, Lna/k;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 128
    .line 129
    invoke-virtual {v0, v15}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Ljava/util/Map;

    .line 134
    .line 135
    :goto_1
    if-eqz v0, :cond_18

    .line 136
    .line 137
    iget-object v14, v12, Lna/k;->o:Ljava/util/Set;

    .line 138
    .line 139
    invoke-interface {v14, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v14

    .line 143
    if-nez v14, :cond_4

    .line 144
    .line 145
    goto/16 :goto_c

    .line 146
    .line 147
    :cond_4
    iget-object v14, v12, Lna/k;->p:Ljava/util/Set;

    .line 148
    .line 149
    invoke-interface {v14, v15}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    if-nez v14, :cond_5

    .line 154
    .line 155
    goto/16 :goto_c

    .line 156
    .line 157
    :cond_5
    iget-object v12, v12, Lna/k;->o:Ljava/util/Set;

    .line 158
    .line 159
    invoke-interface {v12, v15}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    new-instance v12, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v14, "redpacket_receive_timeout:"

    .line 165
    .line 166
    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    invoke-static {v12}, Lra/c;->c(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    const-string v12, "requestNativeUrl"

    .line 180
    .line 181
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v12

    .line 185
    check-cast v12, Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 188
    .line 189
    .line 190
    move-result v14

    .line 191
    if-eqz v14, :cond_6

    .line 192
    .line 193
    const-string v12, "nativeurl"

    .line 194
    .line 195
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    check-cast v12, Ljava/lang/String;

    .line 200
    .line 201
    :cond_6
    move-object/from16 v19, v12

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :catchall_1
    move-exception v0

    .line 205
    goto/16 :goto_b

    .line 206
    .line 207
    :goto_2
    const-string v12, "requestTalker"

    .line 208
    .line 209
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v12

    .line 213
    check-cast v12, Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 216
    .line 217
    .line 218
    move-result v14

    .line 219
    if-eqz v14, :cond_7

    .line 220
    .line 221
    const-string v12, "talker"

    .line 222
    .line 223
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    check-cast v12, Ljava/lang/String;

    .line 228
    .line 229
    :cond_7
    move-object/from16 v22, v12

    .line 230
    .line 231
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 232
    .line 233
    const-string v14, "isUnion"

    .line 234
    .line 235
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v14

    .line 239
    invoke-virtual {v12, v14}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v12

    .line 243
    const/4 v14, 0x1

    .line 244
    if-eqz v12, :cond_8

    .line 245
    .line 246
    iget-object v12, v13, Lh/Hchat/dexkit/DexFinder;->openLuckyMoneyUnionClass:Ljava/lang/Class;

    .line 247
    .line 248
    if-eqz v12, :cond_8

    .line 249
    .line 250
    move v12, v14

    .line 251
    goto :goto_3

    .line 252
    :cond_8
    const/4 v12, 0x0

    .line 253
    :goto_3
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    instance-of v10, v10, Ljava/lang/Integer;

    .line 258
    .line 259
    if-eqz v10, :cond_9

    .line 260
    .line 261
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    check-cast v7, Ljava/lang/Integer;

    .line 266
    .line 267
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 268
    .line 269
    .line 270
    move-result v7

    .line 271
    goto :goto_4

    .line 272
    :cond_9
    move v7, v14

    .line 273
    :goto_4
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    instance-of v10, v10, Ljava/lang/Integer;

    .line 278
    .line 279
    if-eqz v10, :cond_a

    .line 280
    .line 281
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    check-cast v6, Ljava/lang/Integer;

    .line 286
    .line 287
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 288
    .line 289
    .line 290
    move-result v14

    .line 291
    :cond_a
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 295
    const-string v10, ""

    .line 296
    .line 297
    if-eqz v6, :cond_b

    .line 298
    .line 299
    :try_start_3
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    move-object/from16 v20, v5

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_b
    move-object/from16 v20, v10

    .line 311
    .line 312
    :goto_5
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    if-eqz v5, :cond_c

    .line 317
    .line 318
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v10

    .line 326
    :cond_c
    move-object/from16 v21, v10

    .line 327
    .line 328
    if-eqz v12, :cond_d

    .line 329
    .line 330
    iget-object v4, v13, Lh/Hchat/dexkit/DexFinder;->unionOpenCtor10:Ljava/lang/reflect/Constructor;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 331
    .line 332
    if-eqz v4, :cond_d

    .line 333
    .line 334
    :try_start_4
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object v16

    .line 338
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v17

    .line 342
    const-string v23, "v1.0"

    .line 343
    .line 344
    const-string v25, ""
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 345
    .line 346
    move-object/from16 v24, v1

    .line 347
    .line 348
    move-object/from16 v18, v15

    .line 349
    .line 350
    :try_start_5
    filled-new-array/range {v16 .. v25}, [Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    invoke-static {v4, v1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 358
    goto :goto_6

    .line 359
    :catchall_2
    :cond_d
    move-object/from16 v24, v1

    .line 360
    .line 361
    move-object/from16 v18, v15

    .line 362
    .line 363
    :catchall_3
    const/4 v1, 0x0

    .line 364
    :goto_6
    if-nez v1, :cond_e

    .line 365
    .line 366
    if-eqz v12, :cond_e

    .line 367
    .line 368
    :try_start_6
    iget-object v4, v13, Lh/Hchat/dexkit/DexFinder;->unionOpenCtor9:Ljava/lang/reflect/Constructor;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 369
    .line 370
    if-eqz v4, :cond_e

    .line 371
    .line 372
    :try_start_7
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 373
    .line 374
    .line 375
    move-result-object v16

    .line 376
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object v17

    .line 380
    const-string v23, "v1.0"

    .line 381
    .line 382
    filled-new-array/range {v16 .. v24}, [Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    invoke-static {v4, v5}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 390
    :catchall_4
    :cond_e
    if-nez v1, :cond_10

    .line 391
    .line 392
    if-eqz v12, :cond_10

    .line 393
    .line 394
    :try_start_8
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 395
    .line 396
    .line 397
    move-result-object v16

    .line 398
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 399
    .line 400
    .line 401
    move-result-object v17

    .line 402
    const-string v23, "v1.0"

    .line 403
    .line 404
    const-string v25, ""

    .line 405
    .line 406
    filled-new-array/range {v16 .. v25}, [Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    iget-object v4, v13, Lh/Hchat/dexkit/DexFinder;->openLuckyMoneyUnionClass:Ljava/lang/Class;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 411
    .line 412
    if-nez v4, :cond_f

    .line 413
    .line 414
    :catchall_5
    const/4 v1, 0x0

    .line 415
    goto :goto_7

    .line 416
    :cond_f
    :try_start_9
    invoke-static {v4, v1}, Lh/Hchat/utils/KavaReflector;->newInstanceByArgs(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 420
    :cond_10
    :goto_7
    if-nez v1, :cond_11

    .line 421
    .line 422
    :try_start_a
    iget-object v4, v13, Lh/Hchat/dexkit/DexFinder;->openCtor10:Ljava/lang/reflect/Constructor;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 423
    .line 424
    if-eqz v4, :cond_11

    .line 425
    .line 426
    :try_start_b
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 427
    .line 428
    .line 429
    move-result-object v16

    .line 430
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 431
    .line 432
    .line 433
    move-result-object v17

    .line 434
    const-string v23, "v1.0"

    .line 435
    .line 436
    const-string v25, ""

    .line 437
    .line 438
    filled-new-array/range {v16 .. v25}, [Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    invoke-static {v4, v5}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 446
    :catchall_6
    :cond_11
    if-nez v1, :cond_12

    .line 447
    .line 448
    :try_start_c
    iget-object v4, v13, Lh/Hchat/dexkit/DexFinder;->openCtor8:Ljava/lang/reflect/Constructor;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 449
    .line 450
    if-eqz v4, :cond_12

    .line 451
    .line 452
    :try_start_d
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 453
    .line 454
    .line 455
    move-result-object v16

    .line 456
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v17
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 460
    move-object/from16 v23, v24

    .line 461
    .line 462
    :try_start_e
    filled-new-array/range {v16 .. v23}, [Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v5
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 466
    move-object/from16 v24, v23

    .line 467
    .line 468
    :try_start_f
    invoke-static {v4, v5}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 472
    goto :goto_8

    .line 473
    :catchall_7
    move-object/from16 v24, v23

    .line 474
    .line 475
    :catchall_8
    :cond_12
    :goto_8
    if-nez v1, :cond_13

    .line 476
    .line 477
    :try_start_10
    iget-object v4, v13, Lh/Hchat/dexkit/DexFinder;->openCtor9:Ljava/lang/reflect/Constructor;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 478
    .line 479
    if-eqz v4, :cond_13

    .line 480
    .line 481
    :try_start_11
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 482
    .line 483
    .line 484
    move-result-object v16

    .line 485
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 486
    .line 487
    .line 488
    move-result-object v17

    .line 489
    const-string v23, "v1.0"

    .line 490
    .line 491
    filled-new-array/range {v16 .. v24}, [Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v5

    .line 495
    invoke-static {v4, v5}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 499
    :catchall_9
    :cond_13
    if-nez v1, :cond_15

    .line 500
    .line 501
    :try_start_12
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 502
    .line 503
    .line 504
    move-result-object v16

    .line 505
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 506
    .line 507
    .line 508
    move-result-object v17

    .line 509
    const-string v23, "v1.0"

    .line 510
    .line 511
    const-string v25, ""

    .line 512
    .line 513
    filled-new-array/range {v16 .. v25}, [Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    move-object/from16 v4, v18

    .line 518
    .line 519
    iget-object v5, v13, Lh/Hchat/dexkit/DexFinder;->openLuckyMoneyClass:Ljava/lang/Class;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 520
    .line 521
    if-nez v5, :cond_14

    .line 522
    .line 523
    :catchall_a
    const/4 v10, 0x0

    .line 524
    goto :goto_9

    .line 525
    :cond_14
    :try_start_13
    invoke-static {v5, v1}, Lh/Hchat/utils/KavaReflector;->newInstanceByArgs(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v10
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    .line 529
    :goto_9
    move-object v1, v10

    .line 530
    goto :goto_a

    .line 531
    :cond_15
    move-object/from16 v4, v18

    .line 532
    .line 533
    :goto_a
    if-nez v1, :cond_16

    .line 534
    .line 535
    :try_start_14
    invoke-virtual {v11, v3}, Lra/c;->j(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v11, v3, v0}, Lra/c;->n(Ljava/lang/String;Ljava/util/Map;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v11, v4}, Lra/c;->d(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    goto :goto_c

    .line 545
    :cond_16
    const-string v3, "openReq"

    .line 546
    .line 547
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    iget-object v3, v11, Lra/c;->f:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v3, Lm8/c;

    .line 553
    .line 554
    invoke-virtual {v3, v1}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v1

    .line 558
    if-eqz v1, :cond_17

    .line 559
    .line 560
    new-instance v0, Ljava/lang/StringBuilder;

    .line 561
    .line 562
    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-virtual {v11, v0}, Lra/c;->j(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    new-instance v0, Ljava/lang/StringBuilder;

    .line 576
    .line 577
    const-string v1, "redpacket_open_timeout:"

    .line 578
    .line 579
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    new-instance v1, Lra/a;

    .line 590
    .line 591
    const/4 v2, 0x0

    .line 592
    invoke-direct {v1, v11, v4, v2}, Lra/a;-><init>(Lra/c;Ljava/lang/String;I)V

    .line 593
    .line 594
    .line 595
    const-wide/16 v2, 0x1194

    .line 596
    .line 597
    invoke-static {v0, v2, v3, v1}, Lra/c;->t(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 598
    .line 599
    .line 600
    goto :goto_c

    .line 601
    :cond_17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 602
    .line 603
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    invoke-virtual {v11, v1}, Lra/c;->j(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v11, v0, v4, v2}, Lra/c;->p(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Z

    .line 617
    .line 618
    .line 619
    move-result v1

    .line 620
    if-nez v1, :cond_18

    .line 621
    .line 622
    invoke-virtual {v11, v2, v0}, Lra/c;->n(Ljava/lang/String;Ljava/util/Map;)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v11, v4}, Lra/c;->d(Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    .line 626
    .line 627
    .line 628
    goto :goto_c

    .line 629
    :goto_b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 630
    .line 631
    const-string v2, "ERROR receiveCallback: "

    .line 632
    .line 633
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-virtual {v11, v0}, Lra/c;->j(Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    :cond_18
    :goto_c
    return-void

    .line 651
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
