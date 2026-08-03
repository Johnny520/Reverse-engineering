.class public final synthetic Leb/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lo8/c;


# virtual methods
.method public final a(Ll8/a;)V
    .locals 9

    .line 1
    sget-object v0, Leb/k;->a:Leb/k;

    .line 2
    .line 3
    const-string v0, "insert"

    .line 4
    .line 5
    iget-object v1, p1, Ll8/a;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_6

    .line 14
    .line 15
    :cond_0
    iget-object v0, p1, Ll8/a;->b:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "fmessage_msginfo"

    .line 18
    .line 19
    invoke-static {v0, v1}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    goto/16 :goto_6

    .line 26
    .line 27
    :cond_1
    iget-object p1, p1, Ll8/a;->d:Landroid/content/ContentValues;

    .line 28
    .line 29
    if-eqz p1, :cond_9

    .line 30
    .line 31
    const-string v1, "isSend"

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v2, 0x0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_2
    :try_start_0
    invoke-virtual {p1, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    move v0, v2

    .line 55
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    goto :goto_2

    .line 60
    :goto_1
    new-instance v3, Lsf/f;

    .line 61
    .line 62
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object v0, v3

    .line 66
    :goto_2
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-nez v3, :cond_4

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    invoke-virtual {p1, v1}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    const/16 v1, 0xa

    .line 86
    .line 87
    invoke-static {v1, v0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :goto_3
    check-cast v0, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    :goto_4
    if-eqz v2, :cond_6

    .line 108
    .line 109
    goto/16 :goto_6

    .line 110
    .line 111
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v1, "msgContent"

    .line 117
    .line 118
    invoke-static {p1, v1}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {v0, v1}, Leb/k;->b(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v1, "fmsgContent"

    .line 126
    .line 127
    invoke-static {p1, v1}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-static {v0, v1}, Leb/k;->b(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const-string v1, "content"

    .line 135
    .line 136
    invoke-static {p1, v1}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-static {v0, v1}, Leb/k;->b(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const-string v1, "msgSource"

    .line 144
    .line 145
    invoke-static {p1, v1}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v0, v1}, Leb/k;->b(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    const-string v0, "talker"

    .line 157
    .line 158
    invoke-static {p1, v0}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    const-string v1, "fromusername"

    .line 163
    .line 164
    invoke-static {p1, v1}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    const-string v3, "fromUserName"

    .line 169
    .line 170
    invoke-static {p1, v3}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    const-string v5, "encryptusername"

    .line 175
    .line 176
    invoke-static {p1, v5}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    const-string v6, "encryptTalker"

    .line 181
    .line 182
    invoke-static {p1, v6}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    invoke-static {p1, v0}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    filled-new-array {v1, v3, v5, v6, v0}, [Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Leb/k;->h([Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    const-string v0, "ticket"

    .line 199
    .line 200
    invoke-static {p1, v0}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    const-string v1, "antispamticket"

    .line 205
    .line 206
    invoke-static {p1, v1}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    const-string v3, "antispam_ticket"

    .line 211
    .line 212
    invoke-static {p1, v3}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    const-string v5, "verifyticket"

    .line 217
    .line 218
    invoke-static {p1, v5}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    const-string v7, "verify_ticket"

    .line 223
    .line 224
    invoke-static {p1, v7}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    filled-new-array {v0, v1, v3, v5, v7}, [Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-static {v0}, Leb/k;->h([Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    const-string v0, "scene"

    .line 237
    .line 238
    invoke-static {p1, v0}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    const-string v1, "scence"

    .line 243
    .line 244
    invoke-static {p1, v1}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    const-string v3, "sceneid"

    .line 249
    .line 250
    invoke-static {p1, v3}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    const-string v5, "scene_id"

    .line 255
    .line 256
    invoke-static {p1, v5}, Leb/k;->f(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    filled-new-array {v0, v1, v3, p1}, [Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-static {p1}, Leb/k;->h([Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    const/4 v3, 0x0

    .line 269
    const/4 v5, 0x1

    .line 270
    invoke-static/range {v2 .. v8}, Leb/k;->m(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Leb/i;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    if-eqz p1, :cond_9

    .line 275
    .line 276
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 277
    .line 278
    .line 279
    move-result-wide v0

    .line 280
    invoke-static {v0, v1}, Leb/k;->e(J)V

    .line 281
    .line 282
    .line 283
    invoke-static {p1, v0, v1}, Leb/k;->o(Leb/i;J)V

    .line 284
    .line 285
    .line 286
    invoke-static {p1}, Leb/k;->g(Leb/i;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    sget-object v3, Leb/k;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 291
    .line 292
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    check-cast v4, Ljava/lang/Long;

    .line 297
    .line 298
    if-eqz v4, :cond_7

    .line 299
    .line 300
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 301
    .line 302
    .line 303
    move-result-wide v4

    .line 304
    sub-long v4, v0, v4

    .line 305
    .line 306
    const-wide/16 v6, 0xbb8

    .line 307
    .line 308
    cmp-long v4, v4, v6

    .line 309
    .line 310
    if-gez v4, :cond_7

    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_7
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {v3, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    sget-object v0, Leb/k;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 321
    .line 322
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    :catchall_1
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_8

    .line 331
    .line 332
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    check-cast v1, Lfg/l;

    .line 337
    .line 338
    :try_start_1
    invoke-interface {v1, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 339
    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_8
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 343
    .line 344
    iget-object v1, p1, Leb/i;->a:Ljava/lang/String;

    .line 345
    .line 346
    iget-object v2, p1, Leb/i;->c:Ljava/lang/String;

    .line 347
    .line 348
    iget p1, p1, Leb/i;->d:I

    .line 349
    .line 350
    invoke-virtual {v0, v1, v2, p1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnNewFriend(Ljava/lang/String;Ljava/lang/String;I)V

    .line 351
    .line 352
    .line 353
    :cond_9
    :goto_6
    return-void
.end method
