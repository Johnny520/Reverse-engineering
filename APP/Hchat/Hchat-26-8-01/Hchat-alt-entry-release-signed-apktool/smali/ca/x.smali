.class public final synthetic Lca/x;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Activity;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 20
    iput p1, p0, Lca/x;->g:I

    iput-object p2, p0, Lca/x;->i:Ljava/lang/Object;

    iput-object p3, p0, Lca/x;->h:Ljava/lang/Object;

    iput-object p4, p0, Lca/x;->j:Ljava/lang/Object;

    iput-object p5, p0, Lca/x;->k:Ljava/lang/Object;

    iput-object p6, p0, Lca/x;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 19
    iput p6, p0, Lca/x;->g:I

    iput-object p1, p0, Lca/x;->h:Ljava/lang/Object;

    iput-object p2, p0, Lca/x;->i:Ljava/lang/Object;

    iput-object p3, p0, Lca/x;->j:Ljava/lang/Object;

    iput-object p4, p0, Lca/x;->k:Ljava/lang/Object;

    iput-object p5, p0, Lca/x;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/util/Map;Landroid/content/Context;Leb/c0;Li0/a1;)V
    .locals 1

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    iput v0, p0, Lca/x;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lca/x;->j:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lca/x;->h:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Lca/x;->i:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p4, p0, Lca/x;->k:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p5, p0, Lca/x;->l:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/app/Activity;I)V
    .locals 0

    .line 21
    iput p6, p0, Lca/x;->g:I

    iput-object p1, p0, Lca/x;->h:Ljava/lang/Object;

    iput-object p2, p0, Lca/x;->j:Ljava/lang/Object;

    iput-object p3, p0, Lca/x;->k:Ljava/lang/Object;

    iput-object p4, p0, Lca/x;->l:Ljava/lang/Object;

    iput-object p5, p0, Lca/x;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lwb/kv;Lxa/m;Landroid/app/Activity;Ljava/lang/Object;Lxa/i;)V
    .locals 1

    .line 22
    const/16 v0, 0x14

    iput v0, p0, Lca/x;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca/x;->h:Ljava/lang/Object;

    iput-object p2, p0, Lca/x;->k:Ljava/lang/Object;

    iput-object p3, p0, Lca/x;->i:Ljava/lang/Object;

    iput-object p4, p0, Lca/x;->j:Ljava/lang/Object;

    iput-object p5, p0, Lca/x;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lca/x;->g:I

    .line 4
    .line 5
    const-string v2, "\u8054\u7cfb\u4eba\u5217\u8868\u4e0d\u53ef\u7528"

    .line 6
    .line 7
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    const-string v7, ""

    .line 10
    .line 11
    sget-object v8, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    const/4 v10, 0x1

    .line 14
    const/4 v11, 0x0

    .line 15
    iget-object v12, v1, Lca/x;->j:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v13, v1, Lca/x;->l:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v14, v1, Lca/x;->k:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v15, v1, Lca/x;->i:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v3, v1, Lca/x;->h:Ljava/lang/Object;

    .line 24
    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    check-cast v3, Ly9/e;

    .line 29
    .line 30
    check-cast v15, Landroid/widget/TextView;

    .line 31
    .line 32
    check-cast v12, Ly9/d;

    .line 33
    .line 34
    check-cast v14, Ljava/lang/String;

    .line 35
    .line 36
    check-cast v13, Ljava/lang/String;

    .line 37
    .line 38
    iget-object v0, v3, Ly9/e;->e:Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {v3, v15, v14, v13}, Ly9/e;->a(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void

    .line 54
    :pswitch_0
    check-cast v3, Lwb/kv;

    .line 55
    .line 56
    move-object v6, v14

    .line 57
    check-cast v6, Lxa/m;

    .line 58
    .line 59
    move-object v7, v15

    .line 60
    check-cast v7, Landroid/app/Activity;

    .line 61
    .line 62
    move-object v8, v13

    .line 63
    check-cast v8, Lxa/i;

    .line 64
    .line 65
    invoke-interface {v3}, Lwb/kv;->close()V

    .line 66
    .line 67
    .line 68
    new-instance v4, Lxa/f;

    .line 69
    .line 70
    const/4 v9, 0x0

    .line 71
    iget-object v5, v1, Lca/x;->j:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-direct/range {v4 .. v9}, Lxa/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v7}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_1

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-eqz v0, :cond_1

    .line 90
    .line 91
    new-instance v2, Lwb/vu;

    .line 92
    .line 93
    invoke-direct {v2, v6, v7, v4}, Lwb/vu;-><init>(Lxa/m;Landroid/app/Activity;Lfg/a;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 97
    .line 98
    .line 99
    :cond_1
    return-void

    .line 100
    :pswitch_1
    check-cast v3, Lfb/d1;

    .line 101
    .line 102
    check-cast v15, Ljava/lang/String;

    .line 103
    .line 104
    check-cast v12, Landroid/content/Context;

    .line 105
    .line 106
    check-cast v14, Ljava/util/List;

    .line 107
    .line 108
    check-cast v13, Ljava/lang/String;

    .line 109
    .line 110
    :try_start_0
    sget-object v0, Lfb/g1;->a:Lfb/g1;

    .line 111
    .line 112
    iget-object v0, v3, Lfb/d1;->e:Ljava/util/List;

    .line 113
    .line 114
    invoke-static {v0}, Lfb/g1;->h(Ljava/util/List;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_2

    .line 119
    .line 120
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    sget-object v0, Lfb/g1;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 124
    .line 125
    invoke-static {v15}, Lfb/g1;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    invoke-static {v12, v3}, Lfb/g1;->n(Landroid/content/Context;Lfb/d1;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :catchall_0
    move-exception v0

    .line 137
    goto :goto_1

    .line 138
    :cond_2
    invoke-static {v12, v15}, Lfb/g1;->e(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    :goto_0
    move-object v2, v8

    .line 142
    goto :goto_2

    .line 143
    :goto_1
    new-instance v2, Lsf/f;

    .line 144
    .line 145
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    :goto_2
    instance-of v0, v2, Lsf/f;

    .line 149
    .line 150
    const-string v3, "[Hchat:ScriptAgent] "

    .line 151
    .line 152
    if-nez v0, :cond_4

    .line 153
    .line 154
    move-object v0, v2

    .line 155
    check-cast v0, Lsf/n;

    .line 156
    .line 157
    :try_start_1
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-nez v0, :cond_3

    .line 162
    .line 163
    invoke-static {v12, v14}, Lwb/y2;->E0(Landroid/content/Context;Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :catchall_1
    move-exception v0

    .line 168
    new-instance v8, Lsf/f;

    .line 169
    .line 170
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    :cond_3
    :goto_3
    invoke-static {v8}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-eqz v0, :cond_4

    .line 178
    .line 179
    new-instance v4, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v5, "\u6e05\u7406\u5de5\u5177\u7ed3\u679c\u5931\u8d25"

    .line 188
    .line 189
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-static {v4, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    :cond_4
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    if-eqz v0, :cond_5

    .line 204
    .line 205
    new-instance v2, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v3, "\u4fdd\u5b58\u4f1a\u8bdd\u5931\u8d25"

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-static {v2, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    new-instance v0, Landroid/os/Handler;

    .line 226
    .line 227
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 232
    .line 233
    .line 234
    new-instance v2, Leb/w;

    .line 235
    .line 236
    const/4 v3, 0x5

    .line 237
    invoke-direct {v2, v12, v13, v3}, Leb/w;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 241
    .line 242
    .line 243
    :cond_5
    return-void

    .line 244
    :pswitch_2
    check-cast v3, Ljava/lang/String;

    .line 245
    .line 246
    check-cast v15, Lwb/au;

    .line 247
    .line 248
    check-cast v12, Li0/a1;

    .line 249
    .line 250
    check-cast v14, Li0/a1;

    .line 251
    .line 252
    check-cast v13, Li0/a1;

    .line 253
    .line 254
    invoke-interface {v12}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    check-cast v0, Ljava/lang/String;

    .line 259
    .line 260
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_6

    .line 265
    .line 266
    invoke-interface {v14, v15}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-static {v13, v10}, Lwb/y2;->S0(Li0/a1;Z)V

    .line 270
    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_6
    sget-object v0, Lfb/u2;->g:Lfb/u2;

    .line 274
    .line 275
    invoke-virtual {v15, v0}, Lwb/au;->a(Lfb/u2;)V

    .line 276
    .line 277
    .line 278
    :goto_4
    return-void

    .line 279
    :pswitch_3
    check-cast v3, Ljava/util/List;

    .line 280
    .line 281
    check-cast v15, Landroid/app/Activity;

    .line 282
    .line 283
    check-cast v12, Ljava/io/File;

    .line 284
    .line 285
    check-cast v14, Ljava/util/HashSet;

    .line 286
    .line 287
    check-cast v13, Lwb/gr;

    .line 288
    .line 289
    new-instance v2, Ljava/util/ArrayList;

    .line 290
    .line 291
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 292
    .line 293
    .line 294
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_15

    .line 303
    .line 304
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    check-cast v0, Landroid/net/Uri;

    .line 309
    .line 310
    sget-object v4, Lwb/hr;->a:Lwb/hr;

    .line 311
    .line 312
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    invoke-virtual {v14, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    const-string v5, "_"

    .line 321
    .line 322
    :try_start_2
    invoke-static {v15, v0}, Lwb/ho;->C6(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    .line 326
    const-string v10, "attachment"

    .line 327
    .line 328
    if-eqz v8, :cond_7

    .line 329
    .line 330
    goto :goto_6

    .line 331
    :cond_7
    :try_start_3
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    if-eqz v8, :cond_8

    .line 336
    .line 337
    goto :goto_6

    .line 338
    :cond_8
    move-object v8, v10

    .line 339
    :goto_6
    const-string v16, "[\\\\/:*?\"<>|]"

    .line 340
    .line 341
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 342
    .line 343
    .line 344
    move-result-object v9

    .line 345
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v9, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    invoke-virtual {v9, v5}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v9

    .line 356
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 360
    .line 361
    .line 362
    move-result v16

    .line 363
    if-eqz v16, :cond_9

    .line 364
    .line 365
    goto :goto_7

    .line 366
    :cond_9
    move-object v10, v9

    .line 367
    :goto_7
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 368
    .line 369
    .line 370
    move-result-object v9

    .line 371
    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v9

    .line 375
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    const/16 v6, 0x8

    .line 379
    .line 380
    invoke-virtual {v9, v11, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    new-instance v9, Ljava/io/File;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 385
    .line 386
    move-object/from16 v24, v12

    .line 387
    .line 388
    :try_start_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 389
    .line 390
    .line 391
    move-result-wide v11

    .line 392
    new-instance v1, Ljava/lang/StringBuilder;

    .line 393
    .line 394
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    .line 416
    move-object/from16 v12, v24

    .line 417
    .line 418
    :try_start_5
    invoke-direct {v9, v12, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 419
    .line 420
    .line 421
    :try_start_6
    invoke-virtual {v15}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    invoke-virtual {v1, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 426
    .line 427
    .line 428
    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 429
    if-eqz v1, :cond_11

    .line 430
    .line 431
    :try_start_7
    new-instance v5, Ljava/io/FileOutputStream;

    .line 432
    .line 433
    invoke-direct {v5, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 434
    .line 435
    .line 436
    const v6, 0x8000

    .line 437
    .line 438
    .line 439
    :try_start_8
    new-array v6, v6, [B

    .line 440
    .line 441
    :goto_8
    invoke-virtual {v1, v6}, Ljava/io/InputStream;->read([B)I

    .line 442
    .line 443
    .line 444
    move-result v10
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 445
    if-gez v10, :cond_10

    .line 446
    .line 447
    :try_start_9
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 448
    .line 449
    .line 450
    :try_start_a
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v18

    .line 457
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v15}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    invoke-virtual {v1, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    if-nez v1, :cond_a

    .line 469
    .line 470
    move-object v1, v7

    .line 471
    :cond_a
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 472
    .line 473
    .line 474
    move-result v5

    .line 475
    if-eqz v5, :cond_b

    .line 476
    .line 477
    const-string v1, "application/octet-stream"

    .line 478
    .line 479
    :cond_b
    move-object/from16 v19, v1

    .line 480
    .line 481
    goto :goto_9

    .line 482
    :catchall_2
    move-exception v0

    .line 483
    goto :goto_f

    .line 484
    :goto_9
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 485
    .line 486
    .line 487
    move-result-wide v21

    .line 488
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    if-eqz v4, :cond_c

    .line 493
    .line 494
    goto :goto_a

    .line 495
    :cond_c
    const/4 v0, 0x0

    .line 496
    :goto_a
    if-nez v0, :cond_d

    .line 497
    .line 498
    move-object/from16 v20, v7

    .line 499
    .line 500
    goto :goto_b

    .line 501
    :cond_d
    move-object/from16 v20, v0

    .line 502
    .line 503
    :goto_b
    new-instance v16, Lfb/a;

    .line 504
    .line 505
    move-object/from16 v17, v8

    .line 506
    .line 507
    invoke-direct/range {v16 .. v22}, Lfb/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    if-eqz v0, :cond_e

    .line 515
    .line 516
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 517
    .line 518
    .line 519
    move-result-wide v0

    .line 520
    const-wide/16 v4, 0x0

    .line 521
    .line 522
    cmp-long v0, v0, v4

    .line 523
    .line 524
    if-lez v0, :cond_e

    .line 525
    .line 526
    goto :goto_c

    .line 527
    :cond_e
    const/16 v16, 0x0

    .line 528
    .line 529
    :goto_c
    if-eqz v16, :cond_f

    .line 530
    .line 531
    goto :goto_10

    .line 532
    :cond_f
    invoke-virtual {v9}, Ljava/io/File;->delete()Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 533
    .line 534
    .line 535
    const/16 v16, 0x0

    .line 536
    .line 537
    goto :goto_10

    .line 538
    :catchall_3
    move-exception v0

    .line 539
    move-object v4, v0

    .line 540
    goto :goto_d

    .line 541
    :cond_10
    move-object/from16 v17, v8

    .line 542
    .line 543
    const/4 v8, 0x0

    .line 544
    :try_start_b
    invoke-virtual {v5, v6, v8, v10}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 545
    .line 546
    .line 547
    move-object/from16 v8, v17

    .line 548
    .line 549
    goto :goto_8

    .line 550
    :catchall_4
    move-exception v0

    .line 551
    move-object v4, v0

    .line 552
    :try_start_c
    throw v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 553
    :catchall_5
    move-exception v0

    .line 554
    :try_start_d
    invoke-static {v5, v4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 555
    .line 556
    .line 557
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 558
    :goto_d
    :try_start_e
    throw v4
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 559
    :catchall_6
    move-exception v0

    .line 560
    :try_start_f
    invoke-static {v1, v4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 561
    .line 562
    .line 563
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 564
    :cond_11
    const/4 v0, 0x0

    .line 565
    goto :goto_12

    .line 566
    :catchall_7
    move-exception v0

    .line 567
    :goto_e
    const/4 v9, 0x0

    .line 568
    goto :goto_f

    .line 569
    :catchall_8
    move-exception v0

    .line 570
    move-object/from16 v12, v24

    .line 571
    .line 572
    goto :goto_e

    .line 573
    :goto_f
    new-instance v1, Lsf/f;

    .line 574
    .line 575
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 576
    .line 577
    .line 578
    move-object/from16 v16, v1

    .line 579
    .line 580
    :goto_10
    invoke-static/range {v16 .. v16}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    if-nez v0, :cond_12

    .line 585
    .line 586
    goto :goto_11

    .line 587
    :cond_12
    if-eqz v9, :cond_13

    .line 588
    .line 589
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 590
    .line 591
    .line 592
    :cond_13
    new-instance v1, Landroid/os/Handler;

    .line 593
    .line 594
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    invoke-direct {v1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 599
    .line 600
    .line 601
    new-instance v4, Lrb/g;

    .line 602
    .line 603
    const/16 v5, 0xf

    .line 604
    .line 605
    invoke-direct {v4, v15, v5, v0}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 609
    .line 610
    .line 611
    const/16 v16, 0x0

    .line 612
    .line 613
    :goto_11
    move-object/from16 v0, v16

    .line 614
    .line 615
    check-cast v0, Lfb/a;

    .line 616
    .line 617
    :goto_12
    if-eqz v0, :cond_14

    .line 618
    .line 619
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    :cond_14
    move-object/from16 v1, p0

    .line 623
    .line 624
    const/4 v11, 0x0

    .line 625
    goto/16 :goto_5

    .line 626
    .line 627
    :cond_15
    new-instance v0, Ljava/util/HashSet;

    .line 628
    .line 629
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 630
    .line 631
    .line 632
    new-instance v1, Ljava/util/ArrayList;

    .line 633
    .line 634
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    :cond_16
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    if-eqz v3, :cond_18

    .line 646
    .line 647
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    move-object v4, v3

    .line 652
    check-cast v4, Lfb/a;

    .line 653
    .line 654
    iget-object v5, v4, Lfb/a;->e:Ljava/lang/String;

    .line 655
    .line 656
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 657
    .line 658
    .line 659
    move-result v6

    .line 660
    if-eqz v6, :cond_17

    .line 661
    .line 662
    iget-object v5, v4, Lfb/a;->b:Ljava/lang/String;

    .line 663
    .line 664
    :cond_17
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    move-result v4

    .line 668
    if-eqz v4, :cond_16

    .line 669
    .line 670
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    goto :goto_13

    .line 674
    :cond_18
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    if-nez v0, :cond_19

    .line 679
    .line 680
    new-instance v0, Landroid/os/Handler;

    .line 681
    .line 682
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 687
    .line 688
    .line 689
    new-instance v2, Lrb/g;

    .line 690
    .line 691
    const/16 v3, 0x10

    .line 692
    .line 693
    invoke-direct {v2, v13, v3, v1}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 697
    .line 698
    .line 699
    :cond_19
    return-void

    .line 700
    :pswitch_4
    check-cast v3, Lwb/kv;

    .line 701
    .line 702
    move-object v5, v15

    .line 703
    check-cast v5, Landroid/app/Activity;

    .line 704
    .line 705
    move-object v6, v12

    .line 706
    check-cast v6, Ljava/util/List;

    .line 707
    .line 708
    move-object v7, v14

    .line 709
    check-cast v7, Ljava/util/Set;

    .line 710
    .line 711
    move-object v8, v13

    .line 712
    check-cast v8, Lwb/me;

    .line 713
    .line 714
    invoke-interface {v3}, Lwb/kv;->close()V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    if-eqz v0, :cond_1a

    .line 722
    .line 723
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    if-eqz v0, :cond_1a

    .line 728
    .line 729
    new-instance v4, Lb9/c;

    .line 730
    .line 731
    const/16 v9, 0x15

    .line 732
    .line 733
    invoke-direct/range {v4 .. v9}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v0, v4}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 737
    .line 738
    .line 739
    :cond_1a
    return-void

    .line 740
    :pswitch_5
    check-cast v3, Ljava/util/Map;

    .line 741
    .line 742
    check-cast v15, Landroid/content/Context;

    .line 743
    .line 744
    check-cast v14, Leb/c0;

    .line 745
    .line 746
    check-cast v13, Li0/a1;

    .line 747
    .line 748
    instance-of v0, v12, Lsf/f;

    .line 749
    .line 750
    if-eqz v0, :cond_1c

    .line 751
    .line 752
    invoke-interface {v13, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    iget-object v0, v14, Leb/c0;->h:Ljava/lang/String;

    .line 756
    .line 757
    if-eqz v0, :cond_1b

    .line 758
    .line 759
    goto :goto_14

    .line 760
    :cond_1b
    const-string v0, "\u672a\u77e5"

    .line 761
    .line 762
    :goto_14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 763
    .line 764
    const-string v2, "\u52a0\u8f7d["

    .line 765
    .line 766
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 770
    .line 771
    .line 772
    const-string v0, "]\u5931\u8d25\uff0c\u5df2\u81ea\u52a8\u5173\u95ed"

    .line 773
    .line 774
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    const/4 v8, 0x0

    .line 782
    invoke-static {v15, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 787
    .line 788
    .line 789
    :cond_1c
    return-void

    .line 790
    :pswitch_6
    check-cast v3, Landroid/content/Context;

    .line 791
    .line 792
    check-cast v15, Landroid/content/SharedPreferences;

    .line 793
    .line 794
    check-cast v12, Li0/a1;

    .line 795
    .line 796
    check-cast v14, Li0/a1;

    .line 797
    .line 798
    check-cast v13, Li0/a1;

    .line 799
    .line 800
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 801
    .line 802
    invoke-virtual {v0, v3}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->listPlugins(Landroid/content/Context;)Ljava/util/List;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 807
    .line 808
    .line 809
    move-result v1

    .line 810
    invoke-static {v1}, Ltf/y;->a0(I)I

    .line 811
    .line 812
    .line 813
    move-result v1

    .line 814
    const/16 v2, 0x10

    .line 815
    .line 816
    if-ge v1, v2, :cond_1d

    .line 817
    .line 818
    move v6, v2

    .line 819
    goto :goto_15

    .line 820
    :cond_1d
    move v6, v1

    .line 821
    :goto_15
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 822
    .line 823
    invoke-direct {v1, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 824
    .line 825
    .line 826
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 831
    .line 832
    .line 833
    move-result v2

    .line 834
    if-eqz v2, :cond_1e

    .line 835
    .line 836
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    check-cast v2, Leb/c0;

    .line 841
    .line 842
    iget-object v2, v2, Leb/c0;->a:Ljava/lang/String;

    .line 843
    .line 844
    sget-object v4, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 845
    .line 846
    invoke-virtual {v4, v3, v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->isPluginEnabled(Landroid/content/Context;Ljava/lang/String;)Z

    .line 847
    .line 848
    .line 849
    move-result v4

    .line 850
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 851
    .line 852
    .line 853
    move-result-object v4

    .line 854
    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    goto :goto_16

    .line 858
    :cond_1e
    invoke-interface {v12, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 859
    .line 860
    .line 861
    const-string v0, "script_plugin_enable"

    .line 862
    .line 863
    const/4 v8, 0x0

    .line 864
    invoke-interface {v15, v0, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 865
    .line 866
    .line 867
    move-result v0

    .line 868
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    invoke-interface {v14, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 873
    .line 874
    .line 875
    invoke-interface {v13}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    check-cast v0, Ljava/lang/Number;

    .line 880
    .line 881
    invoke-static {v0, v10, v13}, Lp/a;->u(Ljava/lang/Number;ILi0/a1;)V

    .line 882
    .line 883
    .line 884
    return-void

    .line 885
    :pswitch_7
    check-cast v3, Li2/n0;

    .line 886
    .line 887
    check-cast v15, Lu2/m;

    .line 888
    .line 889
    move-object v5, v12

    .line 890
    check-cast v5, Ljava/lang/String;

    .line 891
    .line 892
    move-object v10, v14

    .line 893
    check-cast v10, Lu2/c;

    .line 894
    .line 895
    move-object v9, v13

    .line 896
    check-cast v9, Lm2/d;

    .line 897
    .line 898
    const-string v0, "BackgroundTextMeasurement"

    .line 899
    .line 900
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    :try_start_10
    invoke-static {}, Lw0/m;->j()Lw0/f;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    instance-of v1, v0, Lw0/b;

    .line 908
    .line 909
    if-eqz v1, :cond_1f

    .line 910
    .line 911
    check-cast v0, Lw0/b;

    .line 912
    .line 913
    goto :goto_17

    .line 914
    :cond_1f
    const/4 v0, 0x0

    .line 915
    :goto_17
    if-eqz v0, :cond_20

    .line 916
    .line 917
    const/4 v1, 0x0

    .line 918
    invoke-virtual {v0, v1, v1}, Lw0/b;->C(Lfg/l;Lfg/l;)Lw0/b;

    .line 919
    .line 920
    .line 921
    move-result-object v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 922
    if-eqz v1, :cond_20

    .line 923
    .line 924
    :try_start_11
    invoke-virtual {v1}, Lw0/f;->j()Lw0/f;

    .line 925
    .line 926
    .line 927
    move-result-object v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 928
    :try_start_12
    invoke-static {v3, v15}, Li2/e0;->h(Li2/n0;Lu2/m;)Li2/n0;

    .line 929
    .line 930
    .line 931
    move-result-object v6

    .line 932
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 933
    .line 934
    new-instance v4, Lq2/d;

    .line 935
    .line 936
    move-object v8, v7

    .line 937
    invoke-direct/range {v4 .. v10}, Lq2/d;-><init>(Ljava/lang/String;Li2/n0;Ljava/util/List;Ljava/util/List;Lm2/d;Lu2/c;)V

    .line 938
    .line 939
    .line 940
    invoke-virtual {v4}, Lq2/d;->c()F

    .line 941
    .line 942
    .line 943
    invoke-virtual {v4}, Lq2/d;->b()F
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    .line 944
    .line 945
    .line 946
    :try_start_13
    invoke-static {v2}, Lw0/f;->q(Lw0/f;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    .line 947
    .line 948
    .line 949
    :try_start_14
    invoke-virtual {v1}, Lw0/b;->w()Lw0/q;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    invoke-virtual {v0}, Lw0/q;->d()V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v1}, Lw0/b;->c()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    .line 957
    .line 958
    .line 959
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 960
    .line 961
    .line 962
    return-void

    .line 963
    :catchall_9
    move-exception v0

    .line 964
    goto :goto_19

    .line 965
    :catchall_a
    move-exception v0

    .line 966
    goto :goto_18

    .line 967
    :catchall_b
    move-exception v0

    .line 968
    :try_start_15
    invoke-static {v2}, Lw0/f;->q(Lw0/f;)V

    .line 969
    .line 970
    .line 971
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 972
    :goto_18
    :try_start_16
    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    .line 973
    :catchall_c
    move-exception v0

    .line 974
    :try_start_17
    invoke-virtual {v1}, Lw0/b;->c()V

    .line 975
    .line 976
    .line 977
    throw v0

    .line 978
    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 979
    .line 980
    const-string v1, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 981
    .line 982
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 983
    .line 984
    .line 985
    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_9

    .line 986
    :goto_19
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 987
    .line 988
    .line 989
    throw v0

    .line 990
    :pswitch_8
    check-cast v3, Ljava/util/List;

    .line 991
    .line 992
    check-cast v12, Ljava/util/List;

    .line 993
    .line 994
    check-cast v14, Landroid/os/Handler;

    .line 995
    .line 996
    check-cast v13, Lqb/k;

    .line 997
    .line 998
    check-cast v15, Landroid/app/Activity;

    .line 999
    .line 1000
    :try_start_18
    new-instance v0, Lgg/s;

    .line 1001
    .line 1002
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1003
    .line 1004
    .line 1005
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1006
    .line 1007
    .line 1008
    move-result v1

    .line 1009
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 1010
    .line 1011
    .line 1012
    move-result v2

    .line 1013
    mul-int/2addr v1, v2

    .line 1014
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v2

    .line 1018
    const/4 v8, 0x0

    .line 1019
    :cond_21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1020
    .line 1021
    .line 1022
    move-result v3

    .line 1023
    if-eqz v3, :cond_24

    .line 1024
    .line 1025
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v3

    .line 1029
    check-cast v3, Lwb/jv;

    .line 1030
    .line 1031
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v4

    .line 1035
    :cond_22
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1036
    .line 1037
    .line 1038
    move-result v6

    .line 1039
    if-eqz v6, :cond_21

    .line 1040
    .line 1041
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v6

    .line 1045
    check-cast v6, Lqb/i;

    .line 1046
    .line 1047
    iget-object v7, v3, Lwb/jv;->a:Ljava/lang/String;

    .line 1048
    .line 1049
    invoke-virtual {v13, v6, v7}, Lqb/k;->G(Lqb/i;Ljava/lang/String;)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v6

    .line 1053
    if-eqz v6, :cond_23

    .line 1054
    .line 1055
    iget v6, v0, Lgg/s;->g:I

    .line 1056
    .line 1057
    add-int/2addr v6, v10

    .line 1058
    iput v6, v0, Lgg/s;->g:I
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_d

    .line 1059
    .line 1060
    goto :goto_1a

    .line 1061
    :catchall_d
    move-exception v0

    .line 1062
    goto :goto_1e

    .line 1063
    :cond_23
    :goto_1a
    add-int/lit8 v8, v8, 0x1

    .line 1064
    .line 1065
    if-ge v8, v1, :cond_22

    .line 1066
    .line 1067
    const-wide/16 v6, 0x1f4

    .line 1068
    .line 1069
    :try_start_19
    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->sleep(J)V
    :try_end_19
    .catch Ljava/lang/InterruptedException; {:try_start_19 .. :try_end_19} :catch_0
    .catchall {:try_start_19 .. :try_end_19} :catchall_d

    .line 1070
    .line 1071
    .line 1072
    move v6, v10

    .line 1073
    goto :goto_1b

    .line 1074
    :catch_0
    :try_start_1a
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v6

    .line 1078
    invoke-virtual {v6}, Ljava/lang/Thread;->interrupt()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_d

    .line 1079
    .line 1080
    .line 1081
    const/4 v6, 0x0

    .line 1082
    :goto_1b
    if-nez v6, :cond_22

    .line 1083
    .line 1084
    :goto_1c
    invoke-static {v12}, Lqb/k;->e(Ljava/util/Collection;)V

    .line 1085
    .line 1086
    .line 1087
    goto :goto_1d

    .line 1088
    :cond_24
    :try_start_1b
    new-instance v2, Lqb/d;

    .line 1089
    .line 1090
    invoke-direct {v2, v15, v13, v0, v1}, Lqb/d;-><init>(Landroid/app/Activity;Lqb/k;Lgg/s;I)V

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v14, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_d

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1097
    .line 1098
    .line 1099
    goto :goto_1c

    .line 1100
    :goto_1d
    return-void

    .line 1101
    :goto_1e
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1102
    .line 1103
    .line 1104
    invoke-static {v12}, Lqb/k;->e(Ljava/util/Collection;)V

    .line 1105
    .line 1106
    .line 1107
    throw v0

    .line 1108
    :pswitch_9
    check-cast v3, Ljava/util/List;

    .line 1109
    .line 1110
    check-cast v12, Landroid/os/Handler;

    .line 1111
    .line 1112
    check-cast v14, Lqb/k;

    .line 1113
    .line 1114
    check-cast v13, Lqb/i;

    .line 1115
    .line 1116
    check-cast v15, Landroid/app/Activity;

    .line 1117
    .line 1118
    new-instance v0, Lgg/s;

    .line 1119
    .line 1120
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1121
    .line 1122
    .line 1123
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v1

    .line 1127
    const/4 v11, 0x0

    .line 1128
    :goto_1f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1129
    .line 1130
    .line 1131
    move-result v2

    .line 1132
    if-eqz v2, :cond_28

    .line 1133
    .line 1134
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v2

    .line 1138
    add-int/lit8 v4, v11, 0x1

    .line 1139
    .line 1140
    if-ltz v11, :cond_27

    .line 1141
    .line 1142
    check-cast v2, Lwb/jv;

    .line 1143
    .line 1144
    iget-object v2, v2, Lwb/jv;->a:Ljava/lang/String;

    .line 1145
    .line 1146
    invoke-virtual {v14, v13, v2}, Lqb/k;->G(Lqb/i;Ljava/lang/String;)Z

    .line 1147
    .line 1148
    .line 1149
    move-result v2

    .line 1150
    if-eqz v2, :cond_25

    .line 1151
    .line 1152
    iget v2, v0, Lgg/s;->g:I

    .line 1153
    .line 1154
    add-int/2addr v2, v10

    .line 1155
    iput v2, v0, Lgg/s;->g:I

    .line 1156
    .line 1157
    :cond_25
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1158
    .line 1159
    .line 1160
    move-result v2

    .line 1161
    sub-int/2addr v2, v10

    .line 1162
    if-ge v11, v2, :cond_26

    .line 1163
    .line 1164
    const-wide/16 v6, 0x1f4

    .line 1165
    .line 1166
    :try_start_1c
    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->sleep(J)V
    :try_end_1c
    .catch Ljava/lang/InterruptedException; {:try_start_1c .. :try_end_1c} :catch_1

    .line 1167
    .line 1168
    .line 1169
    goto :goto_20

    .line 1170
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v0

    .line 1174
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 1175
    .line 1176
    .line 1177
    goto :goto_21

    .line 1178
    :cond_26
    const-wide/16 v6, 0x1f4

    .line 1179
    .line 1180
    :goto_20
    move v11, v4

    .line 1181
    goto :goto_1f

    .line 1182
    :cond_27
    invoke-static {}, La/a;->Q0()V

    .line 1183
    .line 1184
    .line 1185
    const/16 v23, 0x0

    .line 1186
    .line 1187
    throw v23

    .line 1188
    :cond_28
    new-instance v1, Lac/l;

    .line 1189
    .line 1190
    invoke-direct {v1, v15, v3, v0, v14}, Lac/l;-><init>(Landroid/app/Activity;Ljava/util/List;Lgg/s;Lqb/k;)V

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v12, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1194
    .line 1195
    .line 1196
    :goto_21
    return-void

    .line 1197
    :pswitch_a
    const/16 v23, 0x0

    .line 1198
    .line 1199
    check-cast v3, Lo9/p;

    .line 1200
    .line 1201
    check-cast v15, Ljava/lang/String;

    .line 1202
    .line 1203
    check-cast v12, Ljava/lang/String;

    .line 1204
    .line 1205
    check-cast v14, Ljava/lang/String;

    .line 1206
    .line 1207
    check-cast v13, Lo9/q;

    .line 1208
    .line 1209
    :try_start_1d
    iget-object v0, v3, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 1210
    .line 1211
    iget-object v1, v3, Lo9/p;->c:Lbb/l;

    .line 1212
    .line 1213
    const-string v2, "group_member_reply_delay_seconds"

    .line 1214
    .line 1215
    const/4 v4, 0x0

    .line 1216
    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1217
    .line 1218
    .line 1219
    move-result v0

    .line 1220
    const/16 v2, 0x258

    .line 1221
    .line 1222
    invoke-static {v0, v4, v2}, Lr9/e0;->r(III)I

    .line 1223
    .line 1224
    .line 1225
    move-result v0

    .line 1226
    int-to-long v5, v0

    .line 1227
    const-wide/16 v9, 0x3e8

    .line 1228
    .line 1229
    mul-long/2addr v5, v9

    .line 1230
    invoke-static {v5, v6}, Lo9/p;->F(J)V

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v3, v15, v12}, Lo9/p;->u(Ljava/lang/String;Ljava/lang/String;)Lo9/j;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v0

    .line 1237
    iget-object v2, v0, Lo9/j;->b:Ljava/lang/String;

    .line 1238
    .line 1239
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1240
    .line 1241
    .line 1242
    move-result v5

    .line 1243
    if-eqz v5, :cond_29

    .line 1244
    .line 1245
    iget-object v2, v0, Lo9/j;->c:Ljava/lang/String;

    .line 1246
    .line 1247
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1248
    .line 1249
    .line 1250
    move-result v5

    .line 1251
    if-eqz v5, :cond_29

    .line 1252
    .line 1253
    iget-object v2, v0, Lo9/j;->d:Ljava/lang/String;

    .line 1254
    .line 1255
    goto :goto_22

    .line 1256
    :catchall_e
    move-exception v0

    .line 1257
    goto/16 :goto_26

    .line 1258
    .line 1259
    :cond_29
    :goto_22
    move-object/from16 v26, v2

    .line 1260
    .line 1261
    invoke-virtual {v0}, Lo9/j;->b()Ljava/lang/String;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v27

    .line 1265
    invoke-virtual {v1, v12}, Lbb/l;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v28

    .line 1269
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v0

    .line 1273
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1274
    .line 1275
    .line 1276
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->e()Lg8/i;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v0

    .line 1280
    if-eqz v0, :cond_2a

    .line 1281
    .line 1282
    invoke-virtual {v0, v12}, Lg8/i;->s(Ljava/lang/String;)I

    .line 1283
    .line 1284
    .line 1285
    move-result v11

    .line 1286
    goto :goto_23

    .line 1287
    :cond_2a
    move v11, v4

    .line 1288
    :goto_23
    invoke-virtual {v1, v11}, Lbb/l;->d(I)Ljava/lang/String;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v29

    .line 1292
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v0

    .line 1296
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1297
    .line 1298
    .line 1299
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->e()Lg8/i;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v0

    .line 1303
    if-eqz v0, :cond_2b

    .line 1304
    .line 1305
    invoke-virtual {v0, v12}, Lg8/i;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    if-eqz v0, :cond_2b

    .line 1310
    .line 1311
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    if-eqz v0, :cond_2b

    .line 1320
    .line 1321
    const-string v1, "\\s+"

    .line 1322
    .line 1323
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v1

    .line 1327
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1328
    .line 1329
    .line 1330
    const-string v2, " "

    .line 1331
    .line 1332
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v0

    .line 1336
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v9

    .line 1340
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1341
    .line 1342
    .line 1343
    goto :goto_24

    .line 1344
    :cond_2b
    move-object/from16 v9, v23

    .line 1345
    .line 1346
    :goto_24
    if-nez v9, :cond_2c

    .line 1347
    .line 1348
    move-object/from16 v30, v7

    .line 1349
    .line 1350
    goto :goto_25

    .line 1351
    :cond_2c
    move-object/from16 v30, v9

    .line 1352
    .line 1353
    :goto_25
    invoke-static {v15}, Lo9/p;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v31

    .line 1357
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 1358
    .line 1359
    const-string v1, "yyyy-MM-dd HH:mm:ss"

    .line 1360
    .line 1361
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v2

    .line 1365
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1366
    .line 1367
    .line 1368
    new-instance v1, Ljava/util/Date;

    .line 1369
    .line 1370
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v32

    .line 1377
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1378
    .line 1379
    .line 1380
    new-instance v24, Lo9/n;
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_e

    .line 1381
    .line 1382
    move-object/from16 v25, v12

    .line 1383
    .line 1384
    :try_start_1e
    invoke-direct/range {v24 .. v32}, Lo9/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_f

    .line 1385
    .line 1386
    .line 1387
    move-object/from16 v0, v24

    .line 1388
    .line 1389
    move-object/from16 v12, v25

    .line 1390
    .line 1391
    :try_start_1f
    invoke-virtual {v3, v14, v15, v0, v13}, Lo9/p;->l(Ljava/lang/String;Ljava/lang/String;Lo9/n;Lo9/q;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_e

    .line 1392
    .line 1393
    .line 1394
    goto :goto_27

    .line 1395
    :catchall_f
    move-exception v0

    .line 1396
    move-object/from16 v12, v25

    .line 1397
    .line 1398
    :goto_26
    new-instance v8, Lsf/f;

    .line 1399
    .line 1400
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1401
    .line 1402
    .line 1403
    :goto_27
    invoke-static {v8}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v0

    .line 1407
    if-eqz v0, :cond_2d

    .line 1408
    .line 1409
    iget-object v1, v3, Lo9/p;->a:Lia/t;

    .line 1410
    .line 1411
    const-string v2, "\u8fdb\u9000\u7fa4\u81ea\u52a8\u56de\u590d\u5f02\u5e38: "

    .line 1412
    .line 1413
    const-string v3, "/"

    .line 1414
    .line 1415
    invoke-static {v2, v15, v3, v12, v3}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v2

    .line 1419
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v2

    .line 1426
    invoke-virtual {v1, v2, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1427
    .line 1428
    .line 1429
    :cond_2d
    return-void

    .line 1430
    :pswitch_b
    move-object v6, v15

    .line 1431
    check-cast v6, Landroid/app/Activity;

    .line 1432
    .line 1433
    move-object v5, v3

    .line 1434
    check-cast v5, Landroid/view/ViewGroup;

    .line 1435
    .line 1436
    move-object v7, v12

    .line 1437
    check-cast v7, Landroid/widget/FrameLayout;

    .line 1438
    .line 1439
    move-object v4, v14

    .line 1440
    check-cast v4, Landroid/widget/ScrollView;

    .line 1441
    .line 1442
    check-cast v13, Landroid/widget/LinearLayout;

    .line 1443
    .line 1444
    sget-object v0, Lk9/r;->a:Lk9/r;

    .line 1445
    .line 1446
    invoke-static {v6, v5, v7, v4, v13}, Lk9/r;->m(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;)V

    .line 1447
    .line 1448
    .line 1449
    new-instance v3, Lb9/c;

    .line 1450
    .line 1451
    const/16 v8, 0xb

    .line 1452
    .line 1453
    invoke-direct/range {v3 .. v8}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1454
    .line 1455
    .line 1456
    invoke-virtual {v4, v3}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1457
    .line 1458
    .line 1459
    return-void

    .line 1460
    :pswitch_c
    check-cast v3, Lwb/kv;

    .line 1461
    .line 1462
    check-cast v15, Landroid/app/Activity;

    .line 1463
    .line 1464
    check-cast v12, Ljava/util/List;

    .line 1465
    .line 1466
    check-cast v14, Lia/q;

    .line 1467
    .line 1468
    check-cast v13, Lia/j;

    .line 1469
    .line 1470
    invoke-interface {v3}, Lwb/kv;->close()V

    .line 1471
    .line 1472
    .line 1473
    invoke-virtual {v15}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v0

    .line 1477
    if-eqz v0, :cond_2e

    .line 1478
    .line 1479
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v0

    .line 1483
    if-eqz v0, :cond_2e

    .line 1484
    .line 1485
    new-instance v1, Lac/l;

    .line 1486
    .line 1487
    invoke-direct {v1, v15, v12, v14, v13}, Lac/l;-><init>(Landroid/app/Activity;Ljava/util/List;Lia/q;Lia/j;)V

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1491
    .line 1492
    .line 1493
    :cond_2e
    return-void

    .line 1494
    :pswitch_d
    move-object v2, v15

    .line 1495
    check-cast v2, Landroid/app/Activity;

    .line 1496
    .line 1497
    check-cast v3, Lhb/g0;

    .line 1498
    .line 1499
    move-object v6, v12

    .line 1500
    check-cast v6, Lhb/i0;

    .line 1501
    .line 1502
    move-object v7, v14

    .line 1503
    check-cast v7, Ljava/util/List;

    .line 1504
    .line 1505
    move-object v5, v13

    .line 1506
    check-cast v5, Lb/e;

    .line 1507
    .line 1508
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 1509
    .line 1510
    .line 1511
    move-result v0

    .line 1512
    if-eqz v0, :cond_2f

    .line 1513
    .line 1514
    goto/16 :goto_28

    .line 1515
    .line 1516
    :cond_2f
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1517
    .line 1518
    .line 1519
    move-result v0

    .line 1520
    const/4 v1, 0x7

    .line 1521
    sget-object v8, Lwb/lv;->j:Lwb/lv;

    .line 1522
    .line 1523
    const-string v3, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b"

    .line 1524
    .line 1525
    const-string v4, "\u6a21\u5757\u901a\u9053"

    .line 1526
    .line 1527
    const-string v9, " \u6761\u6d88\u606f"

    .line 1528
    .line 1529
    const-string v11, "\u5df2\u9009 "

    .line 1530
    .line 1531
    if-eqz v0, :cond_31

    .line 1532
    .line 1533
    if-ne v0, v10, :cond_30

    .line 1534
    .line 1535
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1536
    .line 1537
    .line 1538
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1539
    .line 1540
    .line 1541
    move-result v0

    .line 1542
    invoke-static {v0, v11, v9}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v0

    .line 1546
    new-instance v9, Lsf/e;

    .line 1547
    .line 1548
    const-string v10, "\u652f\u6301\u597d\u53cb\u3001\u7fa4\u804a\u3001\u516c\u4f17\u53f7\u548c\u6807\u7b7e"

    .line 1549
    .line 1550
    invoke-direct {v9, v4, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1551
    .line 1552
    .line 1553
    new-instance v4, Lsf/e;

    .line 1554
    .line 1555
    const-string v10, "\u4ec5\u9009\u62e9\u597d\u53cb\u5e76\u6309\u539f\u751f\u961f\u5217\u53d1\u9001"

    .line 1556
    .line 1557
    invoke-direct {v4, v3, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1558
    .line 1559
    .line 1560
    filled-new-array {v9, v4}, [Lsf/e;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v3

    .line 1564
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v3

    .line 1568
    new-instance v4, Lhb/f0;

    .line 1569
    .line 1570
    invoke-direct {v4, v2, v7, v6, v5}, Lhb/f0;-><init>(Landroid/app/Activity;Ljava/util/List;Lhb/i0;Lb/e;)V

    .line 1571
    .line 1572
    .line 1573
    new-instance v7, Lk/s1;

    .line 1574
    .line 1575
    invoke-direct {v7, v1}, Lk/s1;-><init>(I)V

    .line 1576
    .line 1577
    .line 1578
    move-object v5, v3

    .line 1579
    const-string v3, "\u9009\u62e9\u5b9a\u65f6\u8f6c\u53d1\u901a\u9053"

    .line 1580
    .line 1581
    move-object v6, v4

    .line 1582
    move-object v4, v0

    .line 1583
    invoke-static/range {v2 .. v8}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 1584
    .line 1585
    .line 1586
    goto :goto_28

    .line 1587
    :cond_30
    invoke-static {}, Lokio/a;->k()V

    .line 1588
    .line 1589
    .line 1590
    goto :goto_28

    .line 1591
    :cond_31
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1592
    .line 1593
    .line 1594
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1595
    .line 1596
    .line 1597
    move-result v0

    .line 1598
    invoke-static {v0, v11, v9}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v0

    .line 1602
    new-instance v9, Lsf/e;

    .line 1603
    .line 1604
    const-string v10, "\u652f\u6301\u597d\u53cb\u3001\u7fa4\u804a\u3001\u516c\u4f17\u53f7\u548c\u597d\u53cb\u6807\u7b7e"

    .line 1605
    .line 1606
    invoke-direct {v9, v4, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1607
    .line 1608
    .line 1609
    new-instance v4, Lsf/e;

    .line 1610
    .line 1611
    const-string v10, "\u6309\u5fae\u4fe1\u5f53\u524d\u4eba\u6570\u4e0a\u9650\u81ea\u52a8\u5206\u6279"

    .line 1612
    .line 1613
    invoke-direct {v4, v3, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1614
    .line 1615
    .line 1616
    filled-new-array {v9, v4}, [Lsf/e;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v3

    .line 1620
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v9

    .line 1624
    move-object v4, v2

    .line 1625
    new-instance v2, Lhb/f0;

    .line 1626
    .line 1627
    const/4 v3, 0x0

    .line 1628
    invoke-direct/range {v2 .. v7}, Lhb/f0;-><init>(ILandroid/app/Activity;Lb/e;Lhb/i0;Ljava/util/List;)V

    .line 1629
    .line 1630
    .line 1631
    move-object v6, v2

    .line 1632
    move-object v2, v4

    .line 1633
    new-instance v7, Lk/s1;

    .line 1634
    .line 1635
    invoke-direct {v7, v1}, Lk/s1;-><init>(I)V

    .line 1636
    .line 1637
    .line 1638
    const-string v3, "\u9009\u62e9\u7fa4\u53d1\u901a\u9053"

    .line 1639
    .line 1640
    move-object v4, v0

    .line 1641
    move-object v5, v9

    .line 1642
    invoke-static/range {v2 .. v8}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 1643
    .line 1644
    .line 1645
    :goto_28
    return-void

    .line 1646
    :pswitch_e
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1647
    .line 1648
    check-cast v15, Landroid/app/Activity;

    .line 1649
    .line 1650
    check-cast v14, Lhb/x;

    .line 1651
    .line 1652
    check-cast v13, Lhb/i0;

    .line 1653
    .line 1654
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1655
    .line 1656
    .line 1657
    move-result v0

    .line 1658
    if-nez v0, :cond_34

    .line 1659
    .line 1660
    invoke-virtual {v15}, Landroid/app/Activity;->isFinishing()Z

    .line 1661
    .line 1662
    .line 1663
    move-result v0

    .line 1664
    if-nez v0, :cond_34

    .line 1665
    .line 1666
    invoke-virtual {v15}, Landroid/app/Activity;->isDestroyed()Z

    .line 1667
    .line 1668
    .line 1669
    move-result v0

    .line 1670
    if-eqz v0, :cond_32

    .line 1671
    .line 1672
    goto :goto_29

    .line 1673
    :cond_32
    instance-of v0, v12, Lsf/f;

    .line 1674
    .line 1675
    if-nez v0, :cond_33

    .line 1676
    .line 1677
    move-object v0, v12

    .line 1678
    check-cast v0, Ljava/util/List;

    .line 1679
    .line 1680
    invoke-virtual {v14, v0}, Lhb/x;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1681
    .line 1682
    .line 1683
    :cond_33
    invoke-static {v12}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v0

    .line 1687
    if-eqz v0, :cond_34

    .line 1688
    .line 1689
    iget-object v1, v13, Lhb/i0;->b:Lab/b;

    .line 1690
    .line 1691
    const-string v3, "\u7fa4\u53d1\u52a9\u624b\u8bfb\u53d6\u8054\u7cfb\u4eba\u5931\u8d25"

    .line 1692
    .line 1693
    invoke-virtual {v1, v3, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1694
    .line 1695
    .line 1696
    invoke-virtual {v13, v15, v2}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1697
    .line 1698
    .line 1699
    :cond_34
    :goto_29
    return-void

    .line 1700
    :pswitch_f
    check-cast v3, Lfg/q;

    .line 1701
    .line 1702
    check-cast v15, Lgg/s;

    .line 1703
    .line 1704
    check-cast v12, Ljava/util/ArrayList;

    .line 1705
    .line 1706
    check-cast v14, Ljava/util/List;

    .line 1707
    .line 1708
    check-cast v13, Lhb/b;

    .line 1709
    .line 1710
    if-eqz v3, :cond_35

    .line 1711
    .line 1712
    iget v0, v15, Lgg/s;->g:I

    .line 1713
    .line 1714
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v0

    .line 1718
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1719
    .line 1720
    .line 1721
    move-result v1

    .line 1722
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 1723
    .line 1724
    .line 1725
    move-result v2

    .line 1726
    mul-int/2addr v2, v1

    .line 1727
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v1

    .line 1731
    iget-object v2, v13, Lhb/b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1732
    .line 1733
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1734
    .line 1735
    .line 1736
    move-result v2

    .line 1737
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v2

    .line 1741
    invoke-interface {v3, v0, v1, v2}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1742
    .line 1743
    .line 1744
    :cond_35
    return-void

    .line 1745
    :pswitch_10
    check-cast v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1746
    .line 1747
    check-cast v15, Ljava/util/concurrent/CountDownLatch;

    .line 1748
    .line 1749
    check-cast v12, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1750
    .line 1751
    check-cast v14, Lfg/a;

    .line 1752
    .line 1753
    check-cast v13, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1754
    .line 1755
    invoke-static {v3, v15, v12, v14, v13}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->d(Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/CountDownLatch;Ljava/util/concurrent/atomic/AtomicReference;Lfg/a;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 1756
    .line 1757
    .line 1758
    return-void

    .line 1759
    :pswitch_11
    check-cast v3, Landroid/view/View;

    .line 1760
    .line 1761
    check-cast v15, Lda/b;

    .line 1762
    .line 1763
    check-cast v12, Lda/h;

    .line 1764
    .line 1765
    check-cast v14, Landroid/widget/TextView;

    .line 1766
    .line 1767
    check-cast v13, Lda/c;

    .line 1768
    .line 1769
    const v0, 0x7f060040

    .line 1770
    .line 1771
    .line 1772
    invoke-virtual {v3, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v0

    .line 1776
    if-ne v0, v15, :cond_36

    .line 1777
    .line 1778
    invoke-virtual {v12, v3, v14, v13, v15}, Lda/h;->B(Landroid/view/View;Landroid/widget/TextView;Lda/c;Lda/b;)V

    .line 1779
    .line 1780
    .line 1781
    :cond_36
    return-void

    .line 1782
    :pswitch_12
    check-cast v3, Lh/Hchat/ModuleEntry;

    .line 1783
    .line 1784
    check-cast v15, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 1785
    .line 1786
    check-cast v12, Landroid/content/Context;

    .line 1787
    .line 1788
    check-cast v14, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 1789
    .line 1790
    check-cast v13, Ljava/lang/String;

    .line 1791
    .line 1792
    invoke-static {v3, v15, v12, v14, v13}, Lh/Hchat/ModuleEntry;->d(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Ljava/lang/String;)V

    .line 1793
    .line 1794
    .line 1795
    return-void

    .line 1796
    :pswitch_13
    check-cast v3, Lh/Hchat/ModuleEntry;

    .line 1797
    .line 1798
    check-cast v15, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    .line 1799
    .line 1800
    check-cast v12, Landroid/content/Context;

    .line 1801
    .line 1802
    check-cast v14, Landroid/content/Context;

    .line 1803
    .line 1804
    check-cast v13, Lub/a;

    .line 1805
    .line 1806
    invoke-static {v3, v15, v12, v14, v13}, Lh/Hchat/ModuleEntry;->c(Lh/Hchat/ModuleEntry;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/content/Context;Landroid/content/Context;Lub/a;)V

    .line 1807
    .line 1808
    .line 1809
    return-void

    .line 1810
    :pswitch_14
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1811
    .line 1812
    check-cast v15, Landroid/app/Activity;

    .line 1813
    .line 1814
    check-cast v14, Lca/l;

    .line 1815
    .line 1816
    check-cast v13, Lca/e0;

    .line 1817
    .line 1818
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1819
    .line 1820
    .line 1821
    move-result v0

    .line 1822
    if-nez v0, :cond_39

    .line 1823
    .line 1824
    invoke-virtual {v15}, Landroid/app/Activity;->isFinishing()Z

    .line 1825
    .line 1826
    .line 1827
    move-result v0

    .line 1828
    if-nez v0, :cond_39

    .line 1829
    .line 1830
    invoke-virtual {v15}, Landroid/app/Activity;->isDestroyed()Z

    .line 1831
    .line 1832
    .line 1833
    move-result v0

    .line 1834
    if-eqz v0, :cond_37

    .line 1835
    .line 1836
    goto :goto_2a

    .line 1837
    :cond_37
    instance-of v0, v12, Lsf/f;

    .line 1838
    .line 1839
    if-nez v0, :cond_38

    .line 1840
    .line 1841
    invoke-virtual {v14, v12}, Lca/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1842
    .line 1843
    .line 1844
    :cond_38
    invoke-static {v12}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v0

    .line 1848
    if-eqz v0, :cond_39

    .line 1849
    .line 1850
    iget-object v1, v13, Lca/e0;->c:Lab/b;

    .line 1851
    .line 1852
    const-string v3, "\u8f6c\u53d1\u8bfb\u53d6\u8054\u7cfb\u4eba\u5931\u8d25"

    .line 1853
    .line 1854
    invoke-virtual {v1, v3, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1855
    .line 1856
    .line 1857
    invoke-virtual {v13, v15, v2}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1858
    .line 1859
    .line 1860
    :cond_39
    :goto_2a
    return-void

    .line 1861
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
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
