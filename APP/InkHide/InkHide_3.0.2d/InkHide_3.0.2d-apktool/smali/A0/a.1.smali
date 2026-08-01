.class public final synthetic LA0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/l;
.implements Ld0/c;
.implements LM0/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA0/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/AccessibleObject;)Z
    .locals 2

    .line 1
    iget v0, p0, LA0/a;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/reflect/Field;

    .line 7
    .line 8
    const-string v0, "com.tencent.mm.contact.d"

    .line 9
    .line 10
    invoke-static {v0}, Lm0/c;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :sswitch_0
    check-cast p1, Ljava/lang/reflect/Method;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "rawQueryWithFactory"

    .line 30
    .line 31
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    array-length v0, v0

    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    array-length p1, p1

    .line 58
    const/4 v0, 0x4

    .line 59
    if-ne p1, v0, :cond_0

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/4 p1, 0x0

    .line 64
    :goto_0
    return p1

    .line 65
    :sswitch_1
    check-cast p1, Ljava/lang/reflect/Method;

    .line 66
    .line 67
    sget-object v0, LC0/e;->a:LC0/e;

    .line 68
    .line 69
    invoke-static {p1}, LC0/e;->a(Ljava/lang/reflect/Method;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    return p1

    .line 74
    nop

    .line 75
    :sswitch_data_0
    .sparse-switch
        0x14 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public b()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LA0/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LU0/g;

    .line 7
    .line 8
    const-string v1, "^SELECT (FTS5MetaContact|FTS5MetaTopHits|FTS5MetaKefuContact|FTS5MetaFeature|FTS5MetaWeApp|FTS5MetaFinderFollow|FTS5MetaFavorite)\\.docid, type, subtype, entity_id, aux_index,.*"

    .line 9
    .line 10
    invoke-direct {v0, v1}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    invoke-static {}, Lcom/lu/wxmask/config/AppConfigUtil;->a()Lz0/x;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LA0/a;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    const-string v2, "it"

    .line 13
    .line 14
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v3, "\""

    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    return-object v1

    .line 35
    :pswitch_0
    move-object/from16 v1, p1

    .line 36
    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    const-string v2, "it"

    .line 40
    .line 41
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string v2, "com.tencent.mm"

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-static {v1, v3, v2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_0

    .line 52
    .line 53
    const-string v2, "[a-z]{2,4}\\d?\\.[a-zA-Z_$][\\w$]*"

    .line 54
    .line 55
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const-string v4, "compile(...)"

    .line 60
    .line 61
    invoke-static {v2, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    :cond_0
    const/4 v3, 0x1

    .line 75
    :cond_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    return-object v1

    .line 80
    :pswitch_1
    move-object/from16 v1, p1

    .line 81
    .line 82
    check-cast v1, LU0/d;

    .line 83
    .line 84
    const-string v2, "it"

    .line 85
    .line 86
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, v1, LU0/d;->a:Ljava/util/regex/Matcher;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const-string v2, "group(...)"

    .line 96
    .line 97
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :pswitch_2
    move-object/from16 v1, p1

    .line 102
    .line 103
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 104
    .line 105
    const-string v2, "bridge"

    .line 106
    .line 107
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    new-instance v2, LW0/a;

    .line 111
    .line 112
    const/4 v3, 0x1

    .line 113
    invoke-direct {v2, v3}, LW0/a;-><init>(I)V

    .line 114
    .line 115
    .line 116
    const-string v3, "com.tencent.mm.pluginsdk.ui.chat"

    .line 117
    .line 118
    filled-new-array {v3}, [Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-static {v3}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    iput-object v3, v2, LW0/a;->e:Ljava/util/List;

    .line 127
    .line 128
    new-instance v3, LZ0/b;

    .line 129
    .line 130
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string v4, "MicroMsg.ChatFooter"

    .line 134
    .line 135
    const-string v5, "send msg onClick"

    .line 136
    .line 137
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-virtual {v3, v4}, LZ0/b;->d0([Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iput-object v3, v2, LW0/a;->f:LD/h;

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->e(LW0/a;)Lb1/k;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    const/4 v5, 0x1

    .line 159
    const-string v6, "#"

    .line 160
    .line 161
    if-nez v4, :cond_2

    .line 162
    .line 163
    const/4 v4, 0x0

    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-nez v8, :cond_3

    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_3
    move-object v8, v4

    .line 179
    check-cast v8, Lb1/j;

    .line 180
    .line 181
    invoke-virtual {v8}, Lb1/j;->b()Lf1/d;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    iget-object v9, v9, Lf1/d;->b:Ljava/lang/String;

    .line 186
    .line 187
    const-string v10, "onClick"

    .line 188
    .line 189
    invoke-static {v9, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v9

    .line 193
    xor-int/2addr v9, v5

    .line 194
    invoke-virtual {v8}, Lb1/j;->b()Lf1/d;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    iget-object v11, v11, Lf1/d;->a:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v8}, Lb1/j;->b()Lf1/d;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    iget-object v12, v12, Lf1/d;->b:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v8}, Lb1/j;->c()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    new-instance v13, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v9, ":"

    .line 219
    .line 220
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v11

    .line 243
    move-object v12, v11

    .line 244
    check-cast v12, Lb1/j;

    .line 245
    .line 246
    invoke-virtual {v12}, Lb1/j;->b()Lf1/d;

    .line 247
    .line 248
    .line 249
    move-result-object v13

    .line 250
    iget-object v13, v13, Lf1/d;->b:Ljava/lang/String;

    .line 251
    .line 252
    invoke-static {v13, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    xor-int/2addr v13, v5

    .line 257
    invoke-virtual {v12}, Lb1/j;->b()Lf1/d;

    .line 258
    .line 259
    .line 260
    move-result-object v14

    .line 261
    iget-object v14, v14, Lf1/d;->a:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {v12}, Lb1/j;->b()Lf1/d;

    .line 264
    .line 265
    .line 266
    move-result-object v15

    .line 267
    iget-object v15, v15, Lf1/d;->b:Ljava/lang/String;

    .line 268
    .line 269
    invoke-virtual {v12}, Lb1/j;->c()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v12

    .line 273
    new-instance v7, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    invoke-virtual {v8, v7}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 301
    .line 302
    .line 303
    move-result v12

    .line 304
    if-lez v12, :cond_5

    .line 305
    .line 306
    move-object v8, v7

    .line 307
    move-object v4, v11

    .line 308
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v7

    .line 312
    if-nez v7, :cond_4

    .line 313
    .line 314
    :goto_0
    move-object v7, v4

    .line 315
    check-cast v7, Lb1/j;

    .line 316
    .line 317
    if-nez v7, :cond_6

    .line 318
    .line 319
    const-string v1, "read trace send click method not found"

    .line 320
    .line 321
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    :goto_1
    const/4 v7, 0x0

    .line 329
    goto/16 :goto_7

    .line 330
    .line 331
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-static {v2}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    if-eqz v4, :cond_7

    .line 349
    .line 350
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    check-cast v4, Lb1/j;

    .line 355
    .line 356
    new-instance v8, LA0/T;

    .line 357
    .line 358
    invoke-virtual {v4}, Lb1/j;->b()Lf1/d;

    .line 359
    .line 360
    .line 361
    move-result-object v9

    .line 362
    iget-object v9, v9, Lf1/d;->a:Ljava/lang/String;

    .line 363
    .line 364
    invoke-virtual {v4}, Lb1/j;->b()Lf1/d;

    .line 365
    .line 366
    .line 367
    move-result-object v10

    .line 368
    iget-object v10, v10, Lf1/d;->b:Ljava/lang/String;

    .line 369
    .line 370
    invoke-virtual {v4}, Lb1/j;->c()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-direct {v8, v9, v10, v4}, LA0/T;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    goto :goto_2

    .line 381
    :cond_7
    invoke-static {v3}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v20

    .line 389
    new-instance v2, LW0/a;

    .line 390
    .line 391
    const/4 v3, 0x0

    .line 392
    invoke-direct {v2, v3}, LW0/a;-><init>(I)V

    .line 393
    .line 394
    .line 395
    new-instance v3, LZ0/a;

    .line 396
    .line 397
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 398
    .line 399
    .line 400
    const-string v4, "<appmsg appid=\""

    .line 401
    .line 402
    const-string v8, "parse amessage xml failed"

    .line 403
    .line 404
    filled-new-array {v4, v8}, [Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    invoke-virtual {v3, v4}, LZ0/a;->a0([Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    iput-object v3, v2, LW0/a;->f:LD/h;

    .line 412
    .line 413
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 418
    .line 419
    .line 420
    move-result-object v11

    .line 421
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-nez v2, :cond_8

    .line 426
    .line 427
    const/4 v2, 0x0

    .line 428
    goto :goto_3

    .line 429
    :cond_8
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    if-nez v3, :cond_9

    .line 438
    .line 439
    goto :goto_3

    .line 440
    :cond_9
    move-object v3, v2

    .line 441
    check-cast v3, Lb1/d;

    .line 442
    .line 443
    invoke-virtual {v3}, Lb1/d;->b()Lf1/a;

    .line 444
    .line 445
    .line 446
    move-result-object v3

    .line 447
    iget-object v3, v3, Lf1/a;->a:Ljava/lang/String;

    .line 448
    .line 449
    :cond_a
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    move-object v8, v4

    .line 454
    check-cast v8, Lb1/d;

    .line 455
    .line 456
    invoke-virtual {v8}, Lb1/d;->b()Lf1/a;

    .line 457
    .line 458
    .line 459
    move-result-object v8

    .line 460
    iget-object v8, v8, Lf1/a;->a:Ljava/lang/String;

    .line 461
    .line 462
    invoke-virtual {v3, v8}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 463
    .line 464
    .line 465
    move-result v9

    .line 466
    if-lez v9, :cond_b

    .line 467
    .line 468
    move-object v2, v4

    .line 469
    move-object v3, v8

    .line 470
    :cond_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 471
    .line 472
    .line 473
    move-result v4

    .line 474
    if-nez v4, :cond_a

    .line 475
    .line 476
    :goto_3
    move-object v4, v2

    .line 477
    check-cast v4, Lb1/d;

    .line 478
    .line 479
    if-nez v4, :cond_c

    .line 480
    .line 481
    const-string v1, "read trace appmsg content class not found"

    .line 482
    .line 483
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    goto/16 :goto_1

    .line 491
    .line 492
    :cond_c
    new-instance v2, LW0/a;

    .line 493
    .line 494
    const/4 v3, 0x0

    .line 495
    invoke-direct {v2, v3}, LW0/a;-><init>(I)V

    .line 496
    .line 497
    .line 498
    new-instance v3, LZ0/a;

    .line 499
    .line 500
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 501
    .line 502
    .line 503
    const-string v8, "MicroMsg.AppMsgLogic"

    .line 504
    .line 505
    const-string v9, "summerbig sendAppMsg attachFilePath"

    .line 506
    .line 507
    filled-new-array {v8, v9}, [Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v8

    .line 511
    invoke-virtual {v3, v8}, LZ0/a;->a0([Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    iput-object v3, v2, LW0/a;->f:LD/h;

    .line 515
    .line 516
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->d(LW0/a;)Lb1/e;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 521
    .line 522
    .line 523
    move-result-object v8

    .line 524
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 525
    .line 526
    .line 527
    move-result v2

    .line 528
    if-nez v2, :cond_d

    .line 529
    .line 530
    const/4 v2, 0x0

    .line 531
    goto :goto_4

    .line 532
    :cond_d
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    if-nez v3, :cond_e

    .line 541
    .line 542
    goto :goto_4

    .line 543
    :cond_e
    move-object v3, v2

    .line 544
    check-cast v3, Lb1/d;

    .line 545
    .line 546
    invoke-virtual {v3}, Lb1/d;->b()Lf1/a;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    iget-object v3, v3, Lf1/a;->a:Ljava/lang/String;

    .line 551
    .line 552
    :cond_f
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v9

    .line 556
    move-object v10, v9

    .line 557
    check-cast v10, Lb1/d;

    .line 558
    .line 559
    invoke-virtual {v10}, Lb1/d;->b()Lf1/a;

    .line 560
    .line 561
    .line 562
    move-result-object v10

    .line 563
    iget-object v10, v10, Lf1/a;->a:Ljava/lang/String;

    .line 564
    .line 565
    invoke-virtual {v3, v10}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 566
    .line 567
    .line 568
    move-result v11

    .line 569
    if-lez v11, :cond_10

    .line 570
    .line 571
    move-object v2, v9

    .line 572
    move-object v3, v10

    .line 573
    :cond_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 574
    .line 575
    .line 576
    move-result v9

    .line 577
    if-nez v9, :cond_f

    .line 578
    .line 579
    :goto_4
    move-object v9, v2

    .line 580
    check-cast v9, Lb1/d;

    .line 581
    .line 582
    if-nez v9, :cond_11

    .line 583
    .line 584
    const-string v1, "read trace appmsg logic class not found"

    .line 585
    .line 586
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    goto/16 :goto_1

    .line 594
    .line 595
    :cond_11
    new-instance v2, LW0/a;

    .line 596
    .line 597
    const/4 v3, 0x1

    .line 598
    invoke-direct {v2, v3}, LW0/a;-><init>(I)V

    .line 599
    .line 600
    .line 601
    new-instance v3, LZ0/b;

    .line 602
    .line 603
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v4}, Lb1/d;->b()Lf1/a;

    .line 607
    .line 608
    .line 609
    move-result-object v8

    .line 610
    iget-object v8, v8, Lf1/a;->a:Ljava/lang/String;

    .line 611
    .line 612
    invoke-static {v3, v8}, LZ0/b;->Y(LZ0/b;Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    const/16 v8, 0x9

    .line 616
    .line 617
    invoke-static {v3, v8}, LZ0/b;->a0(LZ0/b;I)V

    .line 618
    .line 619
    .line 620
    const-class v10, Ljava/lang/String;

    .line 621
    .line 622
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v8

    .line 626
    filled-new-array {v8}, [Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v8

    .line 630
    invoke-virtual {v3, v8}, LZ0/b;->c0([Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v4}, Lb1/d;->b()Lf1/a;

    .line 634
    .line 635
    .line 636
    move-result-object v8

    .line 637
    iget-object v8, v8, Lf1/a;->a:Ljava/lang/String;

    .line 638
    .line 639
    const-string v11, "typeName"

    .line 640
    .line 641
    invoke-static {v8, v11}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    new-instance v11, LZ0/a;

    .line 645
    .line 646
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 647
    .line 648
    .line 649
    const/4 v12, 0x5

    .line 650
    const/4 v13, 0x0

    .line 651
    invoke-virtual {v11, v8, v12, v13}, LZ0/a;->Y(Ljava/lang/String;IZ)V

    .line 652
    .line 653
    .line 654
    iput-object v11, v3, LZ0/b;->g:LZ0/a;

    .line 655
    .line 656
    const-string v8, "parse msg failed"

    .line 657
    .line 658
    filled-new-array {v8}, [Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v8

    .line 662
    new-instance v11, Ljava/util/ArrayList;

    .line 663
    .line 664
    invoke-direct {v11, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 665
    .line 666
    .line 667
    aget-object v5, v8, v13

    .line 668
    .line 669
    new-instance v8, La1/b;

    .line 670
    .line 671
    invoke-direct {v8, v5}, La1/b;-><init>(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    invoke-static {v11}, LF0/k;->y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 678
    .line 679
    .line 680
    move-result-object v5

    .line 681
    iput-object v5, v3, LZ0/b;->i:Ljava/util/ArrayList;

    .line 682
    .line 683
    iput-object v3, v2, LW0/a;->f:LD/h;

    .line 684
    .line 685
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->e(LW0/a;)Lb1/k;

    .line 686
    .line 687
    .line 688
    move-result-object v2

    .line 689
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 690
    .line 691
    .line 692
    move-result-object v11

    .line 693
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 694
    .line 695
    .line 696
    move-result v2

    .line 697
    if-nez v2, :cond_12

    .line 698
    .line 699
    const/4 v2, 0x0

    .line 700
    goto :goto_5

    .line 701
    :cond_12
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 706
    .line 707
    .line 708
    move-result v3

    .line 709
    if-nez v3, :cond_13

    .line 710
    .line 711
    goto :goto_5

    .line 712
    :cond_13
    move-object v3, v2

    .line 713
    check-cast v3, Lb1/j;

    .line 714
    .line 715
    invoke-virtual {v3}, Lb1/j;->b()Lf1/d;

    .line 716
    .line 717
    .line 718
    move-result-object v5

    .line 719
    iget-object v5, v5, Lf1/d;->a:Ljava/lang/String;

    .line 720
    .line 721
    invoke-virtual {v3}, Lb1/j;->b()Lf1/d;

    .line 722
    .line 723
    .line 724
    move-result-object v8

    .line 725
    iget-object v8, v8, Lf1/d;->b:Ljava/lang/String;

    .line 726
    .line 727
    invoke-virtual {v3}, Lb1/j;->c()Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v3

    .line 731
    new-instance v12, Ljava/lang/StringBuilder;

    .line 732
    .line 733
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v3

    .line 752
    :cond_14
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v5

    .line 756
    move-object v8, v5

    .line 757
    check-cast v8, Lb1/j;

    .line 758
    .line 759
    invoke-virtual {v8}, Lb1/j;->b()Lf1/d;

    .line 760
    .line 761
    .line 762
    move-result-object v12

    .line 763
    iget-object v12, v12, Lf1/d;->a:Ljava/lang/String;

    .line 764
    .line 765
    invoke-virtual {v8}, Lb1/j;->b()Lf1/d;

    .line 766
    .line 767
    .line 768
    move-result-object v13

    .line 769
    iget-object v13, v13, Lf1/d;->b:Ljava/lang/String;

    .line 770
    .line 771
    invoke-virtual {v8}, Lb1/j;->c()Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v8

    .line 775
    new-instance v14, Ljava/lang/StringBuilder;

    .line 776
    .line 777
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 784
    .line 785
    .line 786
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v8

    .line 796
    invoke-virtual {v3, v8}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 797
    .line 798
    .line 799
    move-result v12

    .line 800
    if-lez v12, :cond_15

    .line 801
    .line 802
    move-object v2, v5

    .line 803
    move-object v3, v8

    .line 804
    :cond_15
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 805
    .line 806
    .line 807
    move-result v5

    .line 808
    if-nez v5, :cond_14

    .line 809
    .line 810
    :goto_5
    move-object v5, v2

    .line 811
    check-cast v5, Lb1/j;

    .line 812
    .line 813
    if-nez v5, :cond_16

    .line 814
    .line 815
    const-string v1, "read trace parse xml method not found"

    .line 816
    .line 817
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 822
    .line 823
    .line 824
    goto/16 :goto_1

    .line 825
    .line 826
    :cond_16
    new-instance v2, LW0/a;

    .line 827
    .line 828
    const/4 v3, 0x1

    .line 829
    invoke-direct {v2, v3}, LW0/a;-><init>(I)V

    .line 830
    .line 831
    .line 832
    new-instance v3, LZ0/b;

    .line 833
    .line 834
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v9}, Lb1/d;->b()Lf1/a;

    .line 838
    .line 839
    .line 840
    move-result-object v8

    .line 841
    iget-object v8, v8, Lf1/a;->a:Ljava/lang/String;

    .line 842
    .line 843
    invoke-static {v3, v8}, LZ0/b;->Y(LZ0/b;Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    const/16 v8, 0x8

    .line 847
    .line 848
    invoke-static {v3, v8}, LZ0/b;->a0(LZ0/b;I)V

    .line 849
    .line 850
    .line 851
    iget-object v8, v3, LZ0/b;->h:LW0/a;

    .line 852
    .line 853
    if-nez v8, :cond_17

    .line 854
    .line 855
    new-instance v8, LW0/a;

    .line 856
    .line 857
    const/4 v11, 0x2

    .line 858
    invoke-direct {v8, v11}, LW0/a;-><init>(I)V

    .line 859
    .line 860
    .line 861
    iput-object v8, v3, LZ0/b;->h:LW0/a;

    .line 862
    .line 863
    :cond_17
    iget-object v8, v3, LZ0/b;->h:LW0/a;

    .line 864
    .line 865
    invoke-static {v8}, LN0/g;->b(Ljava/lang/Object;)V

    .line 866
    .line 867
    .line 868
    new-instance v11, La1/a;

    .line 869
    .line 870
    const/4 v12, 0x1

    .line 871
    invoke-direct {v11, v12}, La1/a;-><init>(I)V

    .line 872
    .line 873
    .line 874
    const/4 v12, 0x6

    .line 875
    iput v12, v11, La1/a;->e:I

    .line 876
    .line 877
    iput v12, v11, La1/a;->f:I

    .line 878
    .line 879
    iput-object v11, v8, LW0/a;->f:LD/h;

    .line 880
    .line 881
    invoke-virtual {v4}, Lb1/d;->b()Lf1/a;

    .line 882
    .line 883
    .line 884
    move-result-object v8

    .line 885
    iget-object v8, v8, Lf1/a;->a:Ljava/lang/String;

    .line 886
    .line 887
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v22

    .line 891
    const/16 v25, 0x0

    .line 892
    .line 893
    const/16 v26, 0x0

    .line 894
    .line 895
    const/16 v23, 0x0

    .line 896
    .line 897
    const/16 v24, 0x0

    .line 898
    .line 899
    move-object/from16 v21, v8

    .line 900
    .line 901
    filled-new-array/range {v21 .. v26}, [Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v8

    .line 905
    invoke-virtual {v3, v8}, LZ0/b;->c0([Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    iput-object v3, v2, LW0/a;->f:LD/h;

    .line 909
    .line 910
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->e(LW0/a;)Lb1/k;

    .line 911
    .line 912
    .line 913
    move-result-object v1

    .line 914
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 915
    .line 916
    .line 917
    move-result-object v8

    .line 918
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 919
    .line 920
    .line 921
    move-result v1

    .line 922
    if-nez v1, :cond_18

    .line 923
    .line 924
    const/4 v1, 0x0

    .line 925
    goto :goto_6

    .line 926
    :cond_18
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v1

    .line 930
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 931
    .line 932
    .line 933
    move-result v2

    .line 934
    if-nez v2, :cond_19

    .line 935
    .line 936
    goto :goto_6

    .line 937
    :cond_19
    move-object v2, v1

    .line 938
    check-cast v2, Lb1/j;

    .line 939
    .line 940
    invoke-virtual {v2}, Lb1/j;->b()Lf1/d;

    .line 941
    .line 942
    .line 943
    move-result-object v3

    .line 944
    iget-object v3, v3, Lf1/d;->a:Ljava/lang/String;

    .line 945
    .line 946
    invoke-virtual {v2}, Lb1/j;->b()Lf1/d;

    .line 947
    .line 948
    .line 949
    move-result-object v10

    .line 950
    iget-object v10, v10, Lf1/d;->b:Ljava/lang/String;

    .line 951
    .line 952
    invoke-virtual {v2}, Lb1/j;->c()Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v2

    .line 956
    new-instance v11, Ljava/lang/StringBuilder;

    .line 957
    .line 958
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 962
    .line 963
    .line 964
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 965
    .line 966
    .line 967
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 968
    .line 969
    .line 970
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 971
    .line 972
    .line 973
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object v2

    .line 977
    :cond_1a
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v3

    .line 981
    move-object v10, v3

    .line 982
    check-cast v10, Lb1/j;

    .line 983
    .line 984
    invoke-virtual {v10}, Lb1/j;->b()Lf1/d;

    .line 985
    .line 986
    .line 987
    move-result-object v11

    .line 988
    iget-object v11, v11, Lf1/d;->a:Ljava/lang/String;

    .line 989
    .line 990
    invoke-virtual {v10}, Lb1/j;->b()Lf1/d;

    .line 991
    .line 992
    .line 993
    move-result-object v12

    .line 994
    iget-object v12, v12, Lf1/d;->b:Ljava/lang/String;

    .line 995
    .line 996
    invoke-virtual {v10}, Lb1/j;->c()Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v10

    .line 1000
    new-instance v13, Ljava/lang/StringBuilder;

    .line 1001
    .line 1002
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v10

    .line 1021
    invoke-virtual {v2, v10}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 1022
    .line 1023
    .line 1024
    move-result v11

    .line 1025
    if-lez v11, :cond_1b

    .line 1026
    .line 1027
    move-object v1, v3

    .line 1028
    move-object v2, v10

    .line 1029
    :cond_1b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1030
    .line 1031
    .line 1032
    move-result v3

    .line 1033
    if-nez v3, :cond_1a

    .line 1034
    .line 1035
    :goto_6
    check-cast v1, Lb1/j;

    .line 1036
    .line 1037
    if-nez v1, :cond_1c

    .line 1038
    .line 1039
    const-string v1, "read trace send appmsg method not found"

    .line 1040
    .line 1041
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v1

    .line 1045
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1046
    .line 1047
    .line 1048
    goto/16 :goto_1

    .line 1049
    .line 1050
    :cond_1c
    new-instance v16, LA0/S;

    .line 1051
    .line 1052
    invoke-virtual {v7}, Lb1/j;->b()Lf1/d;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    iget-object v2, v2, Lf1/d;->a:Ljava/lang/String;

    .line 1057
    .line 1058
    invoke-virtual {v7}, Lb1/j;->b()Lf1/d;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v3

    .line 1062
    iget-object v3, v3, Lf1/d;->b:Ljava/lang/String;

    .line 1063
    .line 1064
    invoke-virtual {v7}, Lb1/j;->c()Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v19

    .line 1068
    invoke-virtual {v4}, Lb1/d;->b()Lf1/a;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v4

    .line 1072
    iget-object v4, v4, Lf1/a;->a:Ljava/lang/String;

    .line 1073
    .line 1074
    invoke-virtual {v5}, Lb1/j;->b()Lf1/d;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v6

    .line 1078
    iget-object v6, v6, Lf1/d;->b:Ljava/lang/String;

    .line 1079
    .line 1080
    invoke-virtual {v5}, Lb1/j;->c()Ljava/lang/String;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v23

    .line 1084
    invoke-virtual {v9}, Lb1/d;->b()Lf1/a;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v5

    .line 1088
    iget-object v5, v5, Lf1/a;->a:Ljava/lang/String;

    .line 1089
    .line 1090
    invoke-virtual {v1}, Lb1/j;->b()Lf1/d;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v7

    .line 1094
    iget-object v7, v7, Lf1/d;->b:Ljava/lang/String;

    .line 1095
    .line 1096
    invoke-virtual {v1}, Lb1/j;->c()Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v26

    .line 1100
    move-object/from16 v17, v2

    .line 1101
    .line 1102
    move-object/from16 v18, v3

    .line 1103
    .line 1104
    move-object/from16 v21, v4

    .line 1105
    .line 1106
    move-object/from16 v24, v5

    .line 1107
    .line 1108
    move-object/from16 v22, v6

    .line 1109
    .line 1110
    move-object/from16 v25, v7

    .line 1111
    .line 1112
    invoke-direct/range {v16 .. v26}, LA0/S;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1113
    .line 1114
    .line 1115
    move-object/from16 v7, v16

    .line 1116
    .line 1117
    :goto_7
    return-object v7

    .line 1118
    :pswitch_3
    move-object/from16 v1, p1

    .line 1119
    .line 1120
    check-cast v1, Landroid/content/Context;

    .line 1121
    .line 1122
    const-string v2, "it"

    .line 1123
    .line 1124
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1125
    .line 1126
    .line 1127
    sget-object v1, LE0/i;->a:LE0/i;

    .line 1128
    .line 1129
    return-object v1

    .line 1130
    :pswitch_4
    move-object/from16 v1, p1

    .line 1131
    .line 1132
    check-cast v1, Ljava/lang/Class;

    .line 1133
    .line 1134
    const-string v2, "it"

    .line 1135
    .line 1136
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v1

    .line 1143
    return-object v1

    .line 1144
    :pswitch_5
    move-object/from16 v1, p1

    .line 1145
    .line 1146
    check-cast v1, Ljava/lang/Class;

    .line 1147
    .line 1148
    const-string v2, "it"

    .line 1149
    .line 1150
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    return-object v1

    .line 1158
    :pswitch_6
    move-object/from16 v1, p1

    .line 1159
    .line 1160
    check-cast v1, Ljava/lang/Class;

    .line 1161
    .line 1162
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v1

    .line 1166
    return-object v1

    .line 1167
    :pswitch_7
    move-object/from16 v1, p1

    .line 1168
    .line 1169
    check-cast v1, Ljava/lang/Class;

    .line 1170
    .line 1171
    const-string v2, "clazz"

    .line 1172
    .line 1173
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v1

    .line 1180
    return-object v1

    .line 1181
    :pswitch_8
    move-object/from16 v1, p1

    .line 1182
    .line 1183
    check-cast v1, Ljava/lang/Class;

    .line 1184
    .line 1185
    const-string v2, "clazz"

    .line 1186
    .line 1187
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v1

    .line 1194
    return-object v1

    .line 1195
    :pswitch_9
    move-object/from16 v1, p1

    .line 1196
    .line 1197
    check-cast v1, Ljava/lang/Class;

    .line 1198
    .line 1199
    const-string v2, "clazz"

    .line 1200
    .line 1201
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    return-object v1

    .line 1209
    :pswitch_a
    move-object/from16 v1, p1

    .line 1210
    .line 1211
    check-cast v1, Ljava/lang/Class;

    .line 1212
    .line 1213
    const-string v2, "it"

    .line 1214
    .line 1215
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v1

    .line 1222
    return-object v1

    .line 1223
    :pswitch_b
    move-object/from16 v1, p1

    .line 1224
    .line 1225
    check-cast v1, Ljava/lang/Class;

    .line 1226
    .line 1227
    const-string v2, "it"

    .line 1228
    .line 1229
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v1

    .line 1236
    return-object v1

    .line 1237
    :pswitch_c
    move-object/from16 v1, p1

    .line 1238
    .line 1239
    check-cast v1, Ljava/lang/Class;

    .line 1240
    .line 1241
    const-string v2, "it"

    .line 1242
    .line 1243
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v1

    .line 1250
    return-object v1

    .line 1251
    :pswitch_d
    move-object/from16 v1, p1

    .line 1252
    .line 1253
    check-cast v1, Ljava/lang/Class;

    .line 1254
    .line 1255
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v1

    .line 1259
    return-object v1

    .line 1260
    :pswitch_e
    move-object/from16 v1, p1

    .line 1261
    .line 1262
    check-cast v1, LE0/c;

    .line 1263
    .line 1264
    const-string v2, "it"

    .line 1265
    .line 1266
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1267
    .line 1268
    .line 1269
    iget-object v2, v1, LE0/c;->a:Ljava/lang/Object;

    .line 1270
    .line 1271
    check-cast v2, Lb1/j;

    .line 1272
    .line 1273
    invoke-virtual {v2}, Lb1/j;->b()Lf1/d;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v3

    .line 1277
    iget-object v3, v3, Lf1/d;->a:Ljava/lang/String;

    .line 1278
    .line 1279
    invoke-virtual {v2}, Lb1/j;->b()Lf1/d;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v4

    .line 1283
    iget-object v4, v4, Lf1/d;->b:Ljava/lang/String;

    .line 1284
    .line 1285
    invoke-virtual {v2}, Lb1/j;->c()Ljava/lang/String;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v2

    .line 1289
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1290
    .line 1291
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1292
    .line 1293
    .line 1294
    iget-object v1, v1, LE0/c;->b:Ljava/lang/Object;

    .line 1295
    .line 1296
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1297
    .line 1298
    .line 1299
    const-string v1, ":"

    .line 1300
    .line 1301
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1305
    .line 1306
    .line 1307
    const-string v1, "#"

    .line 1308
    .line 1309
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1310
    .line 1311
    .line 1312
    invoke-static {v5, v4, v2}, LL/d;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v1

    .line 1316
    return-object v1

    .line 1317
    :pswitch_f
    move-object/from16 v1, p1

    .line 1318
    .line 1319
    check-cast v1, Lb1/j;

    .line 1320
    .line 1321
    const-string v2, "it"

    .line 1322
    .line 1323
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {v1}, Lb1/j;->b()Lf1/d;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v2

    .line 1330
    iget-object v2, v2, Lf1/d;->a:Ljava/lang/String;

    .line 1331
    .line 1332
    invoke-virtual {v1}, Lb1/j;->b()Lf1/d;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v3

    .line 1336
    iget-object v3, v3, Lf1/d;->b:Ljava/lang/String;

    .line 1337
    .line 1338
    invoke-virtual {v1}, Lb1/j;->c()Ljava/lang/String;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v1

    .line 1342
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1343
    .line 1344
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1348
    .line 1349
    .line 1350
    const-string v2, "#"

    .line 1351
    .line 1352
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v1

    .line 1365
    return-object v1

    .line 1366
    :pswitch_10
    move-object/from16 v1, p1

    .line 1367
    .line 1368
    check-cast v1, Lb1/j;

    .line 1369
    .line 1370
    const-string v2, "it"

    .line 1371
    .line 1372
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1373
    .line 1374
    .line 1375
    invoke-virtual {v1}, Lb1/j;->b()Lf1/d;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v2

    .line 1379
    iget-object v2, v2, Lf1/d;->a:Ljava/lang/String;

    .line 1380
    .line 1381
    invoke-virtual {v1}, Lb1/j;->b()Lf1/d;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v3

    .line 1385
    iget-object v3, v3, Lf1/d;->b:Ljava/lang/String;

    .line 1386
    .line 1387
    invoke-virtual {v1}, Lb1/j;->c()Ljava/lang/String;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v1

    .line 1391
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1392
    .line 1393
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1397
    .line 1398
    .line 1399
    const-string v2, "#"

    .line 1400
    .line 1401
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v1

    .line 1414
    return-object v1

    .line 1415
    :pswitch_11
    move-object/from16 v1, p1

    .line 1416
    .line 1417
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1418
    .line 1419
    const-string v2, "bridge"

    .line 1420
    .line 1421
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1422
    .line 1423
    .line 1424
    new-instance v2, LW0/a;

    .line 1425
    .line 1426
    const/4 v3, 0x1

    .line 1427
    invoke-direct {v2, v3}, LW0/a;-><init>(I)V

    .line 1428
    .line 1429
    .line 1430
    const-string v3, "com.tencent.mm.sdk.platformtools"

    .line 1431
    .line 1432
    filled-new-array {v3}, [Ljava/lang/String;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v3

    .line 1436
    invoke-static {v3}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v3

    .line 1440
    iput-object v3, v2, LW0/a;->e:Ljava/util/List;

    .line 1441
    .line 1442
    new-instance v3, LZ0/b;

    .line 1443
    .line 1444
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1445
    .line 1446
    .line 1447
    const-string v4, "MicroMsg.SDK.XmlParser"

    .line 1448
    .line 1449
    const-string v5, "[ %s ]"

    .line 1450
    .line 1451
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v4

    .line 1455
    invoke-virtual {v3, v4}, LZ0/b;->d0([Ljava/lang/String;)V

    .line 1456
    .line 1457
    .line 1458
    iput-object v3, v2, LW0/a;->f:LD/h;

    .line 1459
    .line 1460
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->e(LW0/a;)Lb1/k;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v1

    .line 1464
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v1

    .line 1468
    new-instance v2, Ljava/util/ArrayList;

    .line 1469
    .line 1470
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1471
    .line 1472
    .line 1473
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v1

    .line 1477
    :cond_1d
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1478
    .line 1479
    .line 1480
    move-result v3

    .line 1481
    if-eqz v3, :cond_1e

    .line 1482
    .line 1483
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v3

    .line 1487
    move-object v4, v3

    .line 1488
    check-cast v4, Lb1/j;

    .line 1489
    .line 1490
    invoke-virtual {v4}, Lb1/j;->c()Ljava/lang/String;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v5

    .line 1494
    const-string v6, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)"

    .line 1495
    .line 1496
    const/4 v7, 0x0

    .line 1497
    invoke-static {v5, v7, v6}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1498
    .line 1499
    .line 1500
    move-result v5

    .line 1501
    if-eqz v5, :cond_1d

    .line 1502
    .line 1503
    invoke-virtual {v4}, Lb1/j;->c()Ljava/lang/String;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v4

    .line 1507
    const-string v5, "Ljava/util/"

    .line 1508
    .line 1509
    invoke-static {v4, v5, v7}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1510
    .line 1511
    .line 1512
    move-result v4

    .line 1513
    if-eqz v4, :cond_1d

    .line 1514
    .line 1515
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1516
    .line 1517
    .line 1518
    goto :goto_8

    .line 1519
    :cond_1e
    new-instance v1, LA0/e;

    .line 1520
    .line 1521
    const/4 v3, 0x2

    .line 1522
    invoke-direct {v1, v3}, LA0/e;-><init>(I)V

    .line 1523
    .line 1524
    .line 1525
    new-instance v3, LA0/f;

    .line 1526
    .line 1527
    const/4 v4, 0x3

    .line 1528
    invoke-direct {v3, v4, v1}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 1529
    .line 1530
    .line 1531
    new-instance v1, LA0/f;

    .line 1532
    .line 1533
    const/4 v4, 0x4

    .line 1534
    invoke-direct {v1, v4, v3}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 1535
    .line 1536
    .line 1537
    invoke-static {v2, v1}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v1

    .line 1541
    invoke-static {v1}, LF0/k;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v1

    .line 1545
    check-cast v1, Lb1/j;

    .line 1546
    .line 1547
    if-eqz v1, :cond_1f

    .line 1548
    .line 1549
    new-instance v2, LA0/d;

    .line 1550
    .line 1551
    invoke-virtual {v1}, Lb1/j;->b()Lf1/d;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v3

    .line 1555
    iget-object v3, v3, Lf1/d;->a:Ljava/lang/String;

    .line 1556
    .line 1557
    invoke-virtual {v1}, Lb1/j;->b()Lf1/d;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v4

    .line 1561
    iget-object v4, v4, Lf1/d;->b:Ljava/lang/String;

    .line 1562
    .line 1563
    invoke-virtual {v1}, Lb1/j;->c()Ljava/lang/String;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v1

    .line 1567
    invoke-direct {v2, v3, v4, v1}, LA0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1568
    .line 1569
    .line 1570
    goto :goto_9

    .line 1571
    :cond_1f
    const/4 v2, 0x0

    .line 1572
    :goto_9
    return-object v2

    .line 1573
    :pswitch_12
    move-object/from16 v1, p1

    .line 1574
    .line 1575
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1576
    .line 1577
    const-string v2, "bridge"

    .line 1578
    .line 1579
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1580
    .line 1581
    .line 1582
    new-instance v2, LW0/a;

    .line 1583
    .line 1584
    const/4 v3, 0x1

    .line 1585
    invoke-direct {v2, v3}, LW0/a;-><init>(I)V

    .line 1586
    .line 1587
    .line 1588
    new-instance v3, LZ0/b;

    .line 1589
    .line 1590
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1591
    .line 1592
    .line 1593
    const-string v4, "doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s"

    .line 1594
    .line 1595
    filled-new-array {v4}, [Ljava/lang/String;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v4

    .line 1599
    invoke-virtual {v3, v4}, LZ0/b;->d0([Ljava/lang/String;)V

    .line 1600
    .line 1601
    .line 1602
    iput-object v3, v2, LW0/a;->f:LD/h;

    .line 1603
    .line 1604
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->e(LW0/a;)Lb1/k;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v1

    .line 1608
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v2

    .line 1612
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 1613
    .line 1614
    .line 1615
    move-result v1

    .line 1616
    const/4 v8, 0x0

    .line 1617
    if-eqz v1, :cond_20

    .line 1618
    .line 1619
    goto/16 :goto_f

    .line 1620
    .line 1621
    :cond_20
    new-instance v1, Ljava/util/ArrayList;

    .line 1622
    .line 1623
    invoke-static {v2}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 1624
    .line 1625
    .line 1626
    move-result v3

    .line 1627
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1628
    .line 1629
    .line 1630
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v3

    .line 1634
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1635
    .line 1636
    .line 1637
    move-result v4

    .line 1638
    const/4 v5, 0x1

    .line 1639
    if-eqz v4, :cond_2b

    .line 1640
    .line 1641
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v4

    .line 1645
    check-cast v4, Lb1/j;

    .line 1646
    .line 1647
    invoke-virtual {v4}, Lb1/j;->c()Ljava/lang/String;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v6

    .line 1651
    const-string v7, "(Ljava/lang/String;JLcom/tencent/mm/modelbase/p0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"

    .line 1652
    .line 1653
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1654
    .line 1655
    .line 1656
    move-result v6

    .line 1657
    const/4 v7, 0x0

    .line 1658
    if-eqz v6, :cond_21

    .line 1659
    .line 1660
    const/16 v6, 0x64

    .line 1661
    .line 1662
    goto :goto_b

    .line 1663
    :cond_21
    move v6, v7

    .line 1664
    :goto_b
    invoke-virtual {v4}, Lb1/j;->c()Ljava/lang/String;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v9

    .line 1668
    const-string v10, "Lcom/tencent/mm/modelbase/p0;"

    .line 1669
    .line 1670
    invoke-static {v9, v10, v7}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1671
    .line 1672
    .line 1673
    move-result v9

    .line 1674
    if-eqz v9, :cond_22

    .line 1675
    .line 1676
    add-int/lit8 v6, v6, 0x1e

    .line 1677
    .line 1678
    :cond_22
    invoke-virtual {v4}, Lb1/j;->c()Ljava/lang/String;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v9

    .line 1682
    const-string v10, "(Ljava/lang/String;J"

    .line 1683
    .line 1684
    invoke-static {v9, v7, v10}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1685
    .line 1686
    .line 1687
    move-result v9

    .line 1688
    if-eqz v9, :cond_23

    .line 1689
    .line 1690
    add-int/lit8 v6, v6, 0x14

    .line 1691
    .line 1692
    :cond_23
    invoke-virtual {v4}, Lb1/j;->c()Ljava/lang/String;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v9

    .line 1696
    const-string v10, ";)V"

    .line 1697
    .line 1698
    invoke-static {v9, v10}, LU0/q;->b0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1699
    .line 1700
    .line 1701
    move-result v9

    .line 1702
    if-eqz v9, :cond_24

    .line 1703
    .line 1704
    add-int/lit8 v6, v6, 0xa

    .line 1705
    .line 1706
    :cond_24
    new-instance v9, LU0/g;

    .line 1707
    .line 1708
    const-string v10, "Ljava/lang/String;"

    .line 1709
    .line 1710
    invoke-direct {v9, v10}, LU0/g;-><init>(Ljava/lang/String;)V

    .line 1711
    .line 1712
    .line 1713
    invoke-virtual {v4}, Lb1/j;->c()Ljava/lang/String;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v10

    .line 1717
    invoke-static {v9, v10}, LU0/g;->c(LU0/g;Ljava/lang/String;)LK0/h;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v9

    .line 1721
    new-instance v10, LT0/g;

    .line 1722
    .line 1723
    invoke-direct {v10, v9}, LT0/g;-><init>(LK0/h;)V

    .line 1724
    .line 1725
    .line 1726
    move v9, v7

    .line 1727
    :goto_c
    invoke-virtual {v10}, LT0/g;->hasNext()Z

    .line 1728
    .line 1729
    .line 1730
    move-result v11

    .line 1731
    if-eqz v11, :cond_26

    .line 1732
    .line 1733
    invoke-virtual {v10}, LT0/g;->next()Ljava/lang/Object;

    .line 1734
    .line 1735
    .line 1736
    add-int/lit8 v9, v9, 0x1

    .line 1737
    .line 1738
    if-ltz v9, :cond_25

    .line 1739
    .line 1740
    goto :goto_c

    .line 1741
    :cond_25
    invoke-static {}, LF0/l;->a0()V

    .line 1742
    .line 1743
    .line 1744
    throw v8

    .line 1745
    :cond_26
    const/4 v10, 0x4

    .line 1746
    if-lt v9, v10, :cond_27

    .line 1747
    .line 1748
    add-int/lit8 v6, v6, 0xa

    .line 1749
    .line 1750
    :cond_27
    invoke-virtual {v4}, Lb1/j;->b()Lf1/d;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v9

    .line 1754
    iget-object v9, v9, Lf1/d;->a:Ljava/lang/String;

    .line 1755
    .line 1756
    const-string v10, "com.tencent.mm"

    .line 1757
    .line 1758
    invoke-static {v9, v7, v10}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 1759
    .line 1760
    .line 1761
    move-result v7

    .line 1762
    if-eqz v7, :cond_28

    .line 1763
    .line 1764
    add-int/lit8 v6, v6, 0x5

    .line 1765
    .line 1766
    :cond_28
    invoke-virtual {v4}, Lb1/j;->b()Lf1/d;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v7

    .line 1770
    iget-object v7, v7, Lf1/d;->a:Ljava/lang/String;

    .line 1771
    .line 1772
    const-string v9, "revoke"

    .line 1773
    .line 1774
    invoke-static {v7, v9, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1775
    .line 1776
    .line 1777
    move-result v7

    .line 1778
    if-nez v7, :cond_29

    .line 1779
    .line 1780
    invoke-virtual {v4}, Lb1/j;->b()Lf1/d;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v7

    .line 1784
    iget-object v7, v7, Lf1/d;->b:Ljava/lang/String;

    .line 1785
    .line 1786
    invoke-static {v7, v9, v5}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1787
    .line 1788
    .line 1789
    move-result v5

    .line 1790
    if-eqz v5, :cond_2a

    .line 1791
    .line 1792
    :cond_29
    add-int/lit8 v6, v6, 0x5

    .line 1793
    .line 1794
    :cond_2a
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v5

    .line 1798
    new-instance v6, LE0/c;

    .line 1799
    .line 1800
    invoke-direct {v6, v4, v5}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1801
    .line 1802
    .line 1803
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1804
    .line 1805
    .line 1806
    goto/16 :goto_a

    .line 1807
    .line 1808
    :cond_2b
    new-instance v3, LA0/e;

    .line 1809
    .line 1810
    const/4 v4, 0x0

    .line 1811
    invoke-direct {v3, v4}, LA0/e;-><init>(I)V

    .line 1812
    .line 1813
    .line 1814
    new-instance v4, LA0/f;

    .line 1815
    .line 1816
    const/4 v6, 0x0

    .line 1817
    invoke-direct {v4, v6, v3}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 1818
    .line 1819
    .line 1820
    invoke-static {v1, v4}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v1

    .line 1824
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v3

    .line 1828
    :cond_2c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1829
    .line 1830
    .line 1831
    move-result v4

    .line 1832
    if-eqz v4, :cond_2d

    .line 1833
    .line 1834
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v4

    .line 1838
    move-object v6, v4

    .line 1839
    check-cast v6, LE0/c;

    .line 1840
    .line 1841
    iget-object v6, v6, LE0/c;->b:Ljava/lang/Object;

    .line 1842
    .line 1843
    check-cast v6, Ljava/lang/Number;

    .line 1844
    .line 1845
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1846
    .line 1847
    .line 1848
    move-result v6

    .line 1849
    if-lez v6, :cond_2c

    .line 1850
    .line 1851
    goto :goto_d

    .line 1852
    :cond_2d
    move-object v4, v8

    .line 1853
    :goto_d
    check-cast v4, LE0/c;

    .line 1854
    .line 1855
    if-eqz v4, :cond_30

    .line 1856
    .line 1857
    iget-object v3, v4, LE0/c;->a:Ljava/lang/Object;

    .line 1858
    .line 1859
    check-cast v3, Lb1/j;

    .line 1860
    .line 1861
    if-nez v3, :cond_2e

    .line 1862
    .line 1863
    goto :goto_e

    .line 1864
    :cond_2e
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1865
    .line 1866
    .line 1867
    move-result v2

    .line 1868
    if-le v2, v5, :cond_2f

    .line 1869
    .line 1870
    const/16 v2, 0x8

    .line 1871
    .line 1872
    invoke-static {v1, v2}, LF0/k;->s0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v4

    .line 1876
    new-instance v8, LA0/a;

    .line 1877
    .line 1878
    const/4 v1, 0x5

    .line 1879
    invoke-direct {v8, v1}, LA0/a;-><init>(I)V

    .line 1880
    .line 1881
    .line 1882
    const/4 v6, 0x0

    .line 1883
    const/4 v7, 0x0

    .line 1884
    const-string v5, ";"

    .line 1885
    .line 1886
    const/16 v9, 0x1e

    .line 1887
    .line 1888
    invoke-static/range {v4 .. v9}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v1

    .line 1892
    const-string v2, "anti revoke dexkit candidates"

    .line 1893
    .line 1894
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v1

    .line 1898
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1899
    .line 1900
    .line 1901
    :cond_2f
    new-instance v8, LA0/b;

    .line 1902
    .line 1903
    invoke-virtual {v3}, Lb1/j;->b()Lf1/d;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v1

    .line 1907
    iget-object v1, v1, Lf1/d;->a:Ljava/lang/String;

    .line 1908
    .line 1909
    invoke-virtual {v3}, Lb1/j;->b()Lf1/d;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v2

    .line 1913
    iget-object v2, v2, Lf1/d;->b:Ljava/lang/String;

    .line 1914
    .line 1915
    invoke-virtual {v3}, Lb1/j;->c()Ljava/lang/String;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v3

    .line 1919
    invoke-direct {v8, v1, v2, v3}, LA0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1920
    .line 1921
    .line 1922
    goto :goto_f

    .line 1923
    :cond_30
    :goto_e
    new-instance v6, LA0/a;

    .line 1924
    .line 1925
    const/4 v1, 0x4

    .line 1926
    invoke-direct {v6, v1}, LA0/a;-><init>(I)V

    .line 1927
    .line 1928
    .line 1929
    const/4 v4, 0x0

    .line 1930
    const/4 v5, 0x0

    .line 1931
    const-string v3, ";"

    .line 1932
    .line 1933
    const/16 v7, 0x1e

    .line 1934
    .line 1935
    invoke-static/range {v2 .. v7}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 1936
    .line 1937
    .line 1938
    move-result-object v1

    .line 1939
    const-string v2, "anti revoke dexkit no valid candidate"

    .line 1940
    .line 1941
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 1942
    .line 1943
    .line 1944
    move-result-object v1

    .line 1945
    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 1946
    .line 1947
    .line 1948
    :goto_f
    return-object v8

    .line 1949
    :pswitch_13
    move-object/from16 v1, p1

    .line 1950
    .line 1951
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1952
    .line 1953
    const-string v2, "bridge"

    .line 1954
    .line 1955
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1956
    .line 1957
    .line 1958
    new-instance v2, LW0/a;

    .line 1959
    .line 1960
    const/4 v3, 0x1

    .line 1961
    invoke-direct {v2, v3}, LW0/a;-><init>(I)V

    .line 1962
    .line 1963
    .line 1964
    new-instance v3, LZ0/b;

    .line 1965
    .line 1966
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1967
    .line 1968
    .line 1969
    const-string v4, "MsgInfo processAddMsg insert db error"

    .line 1970
    .line 1971
    filled-new-array {v4}, [Ljava/lang/String;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v4

    .line 1975
    invoke-virtual {v3, v4}, LZ0/b;->d0([Ljava/lang/String;)V

    .line 1976
    .line 1977
    .line 1978
    iput-object v3, v2, LW0/a;->f:LD/h;

    .line 1979
    .line 1980
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->e(LW0/a;)Lb1/k;

    .line 1981
    .line 1982
    .line 1983
    move-result-object v1

    .line 1984
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v2

    .line 1988
    new-instance v1, Ljava/util/ArrayList;

    .line 1989
    .line 1990
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1991
    .line 1992
    .line 1993
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v3

    .line 1997
    :cond_31
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1998
    .line 1999
    .line 2000
    move-result v4

    .line 2001
    if-eqz v4, :cond_35

    .line 2002
    .line 2003
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v4

    .line 2007
    move-object v5, v4

    .line 2008
    check-cast v5, Lb1/j;

    .line 2009
    .line 2010
    invoke-virtual {v5}, Lb1/j;->c()Ljava/lang/String;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v5

    .line 2014
    const/16 v6, 0x29

    .line 2015
    .line 2016
    const/4 v7, 0x6

    .line 2017
    const/4 v8, 0x0

    .line 2018
    invoke-static {v5, v6, v8, v7}, LU0/i;->o0(Ljava/lang/CharSequence;CII)I

    .line 2019
    .line 2020
    .line 2021
    move-result v6

    .line 2022
    const/4 v7, 0x2

    .line 2023
    if-le v6, v7, :cond_31

    .line 2024
    .line 2025
    const-string v7, "(L"

    .line 2026
    .line 2027
    invoke-static {v5, v8, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 2028
    .line 2029
    .line 2030
    move-result v7

    .line 2031
    if-nez v7, :cond_32

    .line 2032
    .line 2033
    goto :goto_10

    .line 2034
    :cond_32
    const/4 v7, 0x1

    .line 2035
    invoke-virtual {v5, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v5

    .line 2039
    const-string v6, "substring(...)"

    .line 2040
    .line 2041
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2042
    .line 2043
    .line 2044
    move v6, v8

    .line 2045
    :goto_11
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 2046
    .line 2047
    .line 2048
    move-result v9

    .line 2049
    if-ge v8, v9, :cond_34

    .line 2050
    .line 2051
    invoke-virtual {v5, v8}, Ljava/lang/String;->charAt(I)C

    .line 2052
    .line 2053
    .line 2054
    move-result v9

    .line 2055
    const/16 v10, 0x3b

    .line 2056
    .line 2057
    if-ne v9, v10, :cond_33

    .line 2058
    .line 2059
    add-int/lit8 v6, v6, 0x1

    .line 2060
    .line 2061
    :cond_33
    add-int/lit8 v8, v8, 0x1

    .line 2062
    .line 2063
    goto :goto_11

    .line 2064
    :cond_34
    if-ne v6, v7, :cond_31

    .line 2065
    .line 2066
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2067
    .line 2068
    .line 2069
    goto :goto_10

    .line 2070
    :cond_35
    new-instance v3, LA0/e;

    .line 2071
    .line 2072
    const/4 v4, 0x1

    .line 2073
    invoke-direct {v3, v4}, LA0/e;-><init>(I)V

    .line 2074
    .line 2075
    .line 2076
    new-instance v4, LA0/f;

    .line 2077
    .line 2078
    const/4 v5, 0x1

    .line 2079
    invoke-direct {v4, v5, v3}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 2080
    .line 2081
    .line 2082
    new-instance v3, LA0/f;

    .line 2083
    .line 2084
    const/4 v5, 0x2

    .line 2085
    invoke-direct {v3, v5, v4}, LA0/f;-><init>(ILjava/lang/Object;)V

    .line 2086
    .line 2087
    .line 2088
    invoke-static {v1, v3}, LF0/k;->r0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v1

    .line 2092
    invoke-static {v1}, LF0/k;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 2093
    .line 2094
    .line 2095
    move-result-object v1

    .line 2096
    check-cast v1, Lb1/j;

    .line 2097
    .line 2098
    if-eqz v1, :cond_36

    .line 2099
    .line 2100
    new-instance v3, LA0/c;

    .line 2101
    .line 2102
    invoke-virtual {v1}, Lb1/j;->b()Lf1/d;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v4

    .line 2106
    iget-object v4, v4, Lf1/d;->a:Ljava/lang/String;

    .line 2107
    .line 2108
    invoke-virtual {v1}, Lb1/j;->b()Lf1/d;

    .line 2109
    .line 2110
    .line 2111
    move-result-object v5

    .line 2112
    iget-object v5, v5, Lf1/d;->b:Ljava/lang/String;

    .line 2113
    .line 2114
    invoke-virtual {v1}, Lb1/j;->c()Ljava/lang/String;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v1

    .line 2118
    invoke-direct {v3, v4, v5, v1}, LA0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2119
    .line 2120
    .line 2121
    :goto_12
    move-object v1, v3

    .line 2122
    goto :goto_13

    .line 2123
    :cond_36
    const/4 v3, 0x0

    .line 2124
    goto :goto_12

    .line 2125
    :goto_13
    if-nez v1, :cond_37

    .line 2126
    .line 2127
    new-instance v6, LA0/a;

    .line 2128
    .line 2129
    const/4 v3, 0x3

    .line 2130
    invoke-direct {v6, v3}, LA0/a;-><init>(I)V

    .line 2131
    .line 2132
    .line 2133
    const/4 v4, 0x0

    .line 2134
    const/4 v5, 0x0

    .line 2135
    const-string v3, ";"

    .line 2136
    .line 2137
    const/16 v7, 0x1e

    .line 2138
    .line 2139
    invoke-static/range {v2 .. v7}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 2140
    .line 2141
    .line 2142
    move-result-object v2

    .line 2143
    const-string v3, "anti revoke storage dexkit no valid candidate"

    .line 2144
    .line 2145
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v2

    .line 2149
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 2150
    .line 2151
    .line 2152
    :cond_37
    return-object v1

    .line 2153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget v0, p0, LA0/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lcom/lu/wxmask/MainHook;->b(Ljava/lang/Throwable;)V

    return-void

    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch
.end method
