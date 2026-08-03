.class public final synthetic Lhb/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Lhb/c;

.field public final synthetic i:Lhb/b;

.field public final synthetic j:Ljava/util/ArrayList;

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:Lfg/q;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lhb/c;Lhb/b;Ljava/util/ArrayList;IILfg/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhb/a;->g:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lhb/a;->h:Lhb/c;

    .line 7
    .line 8
    iput-object p3, p0, Lhb/a;->i:Lhb/b;

    .line 9
    .line 10
    iput-object p4, p0, Lhb/a;->j:Ljava/util/ArrayList;

    .line 11
    .line 12
    iput p5, p0, Lhb/a;->k:I

    .line 13
    .line 14
    iput p6, p0, Lhb/a;->l:I

    .line 15
    .line 16
    iput-object p7, p0, Lhb/a;->m:Lfg/q;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v7, v1, Lhb/a;->i:Lhb/b;

    .line 4
    .line 5
    iget-object v2, v7, Lhb/b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    :goto_0
    move-object v3, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messages()Lk8/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    new-instance v5, Lgg/s;

    .line 25
    .line 26
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object v6, v1, Lhb/a;->g:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    const/4 v10, 0x0

    .line 36
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v11, v1, Lhb/a;->h:Lhb/c;

    .line 41
    .line 42
    iget-object v12, v1, Lhb/a;->j:Ljava/util/ArrayList;

    .line 43
    .line 44
    if-eqz v0, :cond_f

    .line 45
    .line 46
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    add-int/lit8 v13, v10, 0x1

    .line 51
    .line 52
    if-ltz v10, :cond_e

    .line 53
    .line 54
    move-object v15, v0

    .line 55
    check-cast v15, Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    move-object/from16 v18, v2

    .line 64
    .line 65
    move-object/from16 v21, v3

    .line 66
    .line 67
    move-object/from16 v22, v4

    .line 68
    .line 69
    move-object/from16 v20, v6

    .line 70
    .line 71
    move-object/from16 v23, v8

    .line 72
    .line 73
    goto/16 :goto_b

    .line 74
    .line 75
    :cond_1
    iget v9, v5, Lgg/s;->g:I

    .line 76
    .line 77
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->e()Lg8/i;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    invoke-virtual {v0, v15}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    goto :goto_3

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_2
    const/4 v0, 0x0

    .line 100
    :goto_3
    const/16 v16, 0x0

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :goto_4
    new-instance v14, Lsf/f;

    .line 104
    .line 105
    invoke-direct {v14, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    move-object v0, v14

    .line 109
    :goto_5
    nop

    .line 110
    instance-of v14, v0, Lsf/f;

    .line 111
    .line 112
    if-eqz v14, :cond_3

    .line 113
    .line 114
    move-object/from16 v0, v16

    .line 115
    .line 116
    :cond_3
    check-cast v0, Ljava/lang/String;

    .line 117
    .line 118
    if-nez v0, :cond_4

    .line 119
    .line 120
    const-string v0, ""

    .line 121
    .line 122
    :cond_4
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v14

    .line 126
    if-eqz v14, :cond_5

    .line 127
    .line 128
    move-object v14, v15

    .line 129
    goto :goto_6

    .line 130
    :cond_5
    move-object v14, v0

    .line 131
    :goto_6
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v17

    .line 135
    move-object/from16 v18, v2

    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    :goto_7
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_c

    .line 143
    .line 144
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    add-int/lit8 v19, v2, 0x1

    .line 149
    .line 150
    if-ltz v2, :cond_b

    .line 151
    .line 152
    move-object/from16 v20, v6

    .line 153
    .line 154
    move-object v6, v0

    .line 155
    check-cast v6, Ldb/a;

    .line 156
    .line 157
    invoke-virtual/range {v18 .. v18}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_6

    .line 162
    .line 163
    move-object/from16 v21, v3

    .line 164
    .line 165
    move-object/from16 v22, v4

    .line 166
    .line 167
    move-object/from16 v23, v8

    .line 168
    .line 169
    move/from16 v24, v9

    .line 170
    .line 171
    goto/16 :goto_a

    .line 172
    .line 173
    :cond_6
    :try_start_1
    invoke-static {v6, v15, v14, v3, v4}, Lhb/c;->y(Ldb/a;Ljava/lang/String;Ljava/lang/String;Lk8/g;Lj8/p;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 178
    .line 179
    .line 180
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 181
    move-object/from16 v21, v3

    .line 182
    .line 183
    goto :goto_8

    .line 184
    :catchall_1
    move-exception v0

    .line 185
    move-object/from16 v21, v3

    .line 186
    .line 187
    new-instance v3, Lsf/f;

    .line 188
    .line 189
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    move-object v0, v3

    .line 193
    :goto_8
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    move-object/from16 v22, v4

    .line 198
    .line 199
    if-eqz v3, :cond_7

    .line 200
    .line 201
    iget-object v4, v11, Lhb/c;->g:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v4, Lab/b;

    .line 204
    .line 205
    iget v6, v6, Ldb/a;->a:I

    .line 206
    .line 207
    move-object/from16 v23, v8

    .line 208
    .line 209
    new-instance v8, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    move/from16 v24, v9

    .line 212
    .line 213
    const-string v9, "\u81ea\u5b9a\u4e49\u7fa4\u53d1\u5931\u8d25: target="

    .line 214
    .line 215
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string v9, " type="

    .line 222
    .line 223
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-virtual {v4, v6, v3}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_7
    move-object/from16 v23, v8

    .line 238
    .line 239
    move/from16 v24, v9

    .line 240
    .line 241
    :goto_9
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 242
    .line 243
    instance-of v4, v0, Lsf/f;

    .line 244
    .line 245
    if-eqz v4, :cond_8

    .line 246
    .line 247
    move-object v0, v3

    .line 248
    :cond_8
    check-cast v0, Ljava/lang/Boolean;

    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-nez v0, :cond_9

    .line 255
    .line 256
    goto :goto_a

    .line 257
    :cond_9
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    add-int/lit8 v0, v0, -0x1

    .line 262
    .line 263
    if-ge v2, v0, :cond_a

    .line 264
    .line 265
    iget v0, v1, Lhb/a;->k:I

    .line 266
    .line 267
    invoke-static {v7, v0}, Lhb/c;->B(Lhb/b;I)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-eqz v0, :cond_a

    .line 272
    .line 273
    move/from16 v2, v19

    .line 274
    .line 275
    goto :goto_a

    .line 276
    :cond_a
    move/from16 v2, v19

    .line 277
    .line 278
    move-object/from16 v6, v20

    .line 279
    .line 280
    move-object/from16 v3, v21

    .line 281
    .line 282
    move-object/from16 v4, v22

    .line 283
    .line 284
    move-object/from16 v8, v23

    .line 285
    .line 286
    move/from16 v9, v24

    .line 287
    .line 288
    goto/16 :goto_7

    .line 289
    .line 290
    :cond_b
    invoke-static {}, La/a;->Q0()V

    .line 291
    .line 292
    .line 293
    throw v16

    .line 294
    :cond_c
    move-object/from16 v21, v3

    .line 295
    .line 296
    move-object/from16 v22, v4

    .line 297
    .line 298
    move-object/from16 v20, v6

    .line 299
    .line 300
    move-object/from16 v23, v8

    .line 301
    .line 302
    move/from16 v24, v9

    .line 303
    .line 304
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    :goto_a
    add-int v9, v24, v2

    .line 309
    .line 310
    iput v9, v5, Lgg/s;->g:I

    .line 311
    .line 312
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    add-int/lit8 v0, v0, -0x1

    .line 317
    .line 318
    if-ge v10, v0, :cond_d

    .line 319
    .line 320
    iget v0, v1, Lhb/a;->l:I

    .line 321
    .line 322
    invoke-static {v7, v0}, Lhb/c;->B(Lhb/b;I)Z

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    :cond_d
    :goto_b
    move v10, v13

    .line 327
    move-object/from16 v2, v18

    .line 328
    .line 329
    move-object/from16 v6, v20

    .line 330
    .line 331
    move-object/from16 v3, v21

    .line 332
    .line 333
    move-object/from16 v4, v22

    .line 334
    .line 335
    move-object/from16 v8, v23

    .line 336
    .line 337
    goto/16 :goto_2

    .line 338
    .line 339
    :cond_e
    const/16 v16, 0x0

    .line 340
    .line 341
    invoke-static {}, La/a;->Q0()V

    .line 342
    .line 343
    .line 344
    throw v16

    .line 345
    :cond_f
    move-object/from16 v20, v6

    .line 346
    .line 347
    iget-object v0, v11, Lhb/c;->j:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 350
    .line 351
    iget-object v2, v7, Lhb/b;->a:Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    iget-object v0, v11, Lhb/c;->h:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v0, Landroid/os/Handler;

    .line 359
    .line 360
    new-instance v2, Lca/x;

    .line 361
    .line 362
    const/4 v8, 0x5

    .line 363
    iget-object v3, v1, Lhb/a;->m:Lfg/q;

    .line 364
    .line 365
    move-object v4, v5

    .line 366
    move-object v5, v12

    .line 367
    invoke-direct/range {v2 .. v8}, Lca/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 371
    .line 372
    .line 373
    return-void
.end method
