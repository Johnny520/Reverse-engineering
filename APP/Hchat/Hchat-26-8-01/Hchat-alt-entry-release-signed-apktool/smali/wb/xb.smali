.class public final synthetic Lwb/xb;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILandroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V
    .locals 0

    .line 16
    iput p1, p0, Lwb/xb;->g:I

    iput-object p3, p0, Lwb/xb;->i:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/xb;->h:Landroid/content/Context;

    iput-object p4, p0, Lwb/xb;->j:Li0/a1;

    iput-object p5, p0, Lwb/xb;->k:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/xb;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/xb;->h:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/xb;->i:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/xb;->j:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/xb;->k:Li0/a1;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;Li0/a1;Landroid/content/SharedPreferences;)V
    .locals 1

    .line 17
    const/4 v0, 0x0

    iput v0, p0, Lwb/xb;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/xb;->h:Landroid/content/Context;

    iput-object p2, p0, Lwb/xb;->j:Li0/a1;

    iput-object p3, p0, Lwb/xb;->k:Li0/a1;

    iput-object p4, p0, Lwb/xb;->i:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/xb;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lwb/xb;->i:Landroid/content/SharedPreferences;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/xb;->h:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v3, p0, Lwb/xb;->j:Li0/a1;

    .line 13
    .line 14
    iget-object v4, p0, Lwb/xb;->k:Li0/a1;

    .line 15
    .line 16
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    check-cast v5, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v5}, Lr9/e0;->Y(Ljava/lang/String;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    move-object v6, v5

    .line 27
    check-cast v6, Ljava/lang/Iterable;

    .line 28
    .line 29
    const-string v7, ","

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    const/16 v11, 0x3e

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    invoke-static/range {v6 .. v11}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-interface {v3, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v3, "hide_chat_menu_enable"

    .line 48
    .line 49
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v3, "hide_chat_menu_titles"

    .line 64
    .line 65
    invoke-interface {v0, v3, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 70
    .line 71
    .line 72
    const-string v0, "\u8bbe\u7f6e\u5df2\u4fdd\u5b58"

    .line 73
    .line 74
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 79
    .line 80
    .line 81
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_0
    iget-object v0, p0, Lwb/xb;->i:Landroid/content/SharedPreferences;

    .line 85
    .line 86
    iget-object v1, p0, Lwb/xb;->h:Landroid/content/Context;

    .line 87
    .line 88
    iget-object v3, p0, Lwb/xb;->j:Li0/a1;

    .line 89
    .line 90
    iget-object v4, p0, Lwb/xb;->k:Li0/a1;

    .line 91
    .line 92
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const-string v5, "nickname_color"

    .line 97
    .line 98
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Ljava/lang/String;

    .line 103
    .line 104
    sget-object v6, Lbb/l;->c:Log/k;

    .line 105
    .line 106
    invoke-static {v3}, La7/a;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-interface {v0, v5, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v3, "nickname_weight"

    .line 115
    .line 116
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v4}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    if-eqz v4, :cond_0

    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    goto :goto_1

    .line 133
    :cond_0
    const/16 v4, 0x190

    .line 134
    .line 135
    :goto_1
    invoke-static {v4}, Lfb/v0;->h(I)I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 144
    .line 145
    .line 146
    const-string v0, "\u8bbe\u7f6e\u5df2\u4fdd\u5b58"

    .line 147
    .line 148
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :pswitch_1
    iget-object v5, p0, Lwb/xb;->h:Landroid/content/Context;

    .line 157
    .line 158
    iget-object v6, p0, Lwb/xb;->i:Landroid/content/SharedPreferences;

    .line 159
    .line 160
    iget-object v7, p0, Lwb/xb;->j:Li0/a1;

    .line 161
    .line 162
    iget-object v8, p0, Lwb/xb;->k:Li0/a1;

    .line 163
    .line 164
    instance-of v0, v5, Landroid/app/Activity;

    .line 165
    .line 166
    if-eqz v0, :cond_1

    .line 167
    .line 168
    move-object v0, v5

    .line 169
    check-cast v0, Landroid/app/Activity;

    .line 170
    .line 171
    move-object v9, v0

    .line 172
    goto :goto_2

    .line 173
    :cond_1
    move-object v9, v1

    .line 174
    :goto_2
    if-nez v9, :cond_2

    .line 175
    .line 176
    const-string v0, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u5fae\u4fe1\u5730\u56fe"

    .line 177
    .line 178
    invoke-static {v5, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_6

    .line 186
    .line 187
    :cond_2
    sget-object v10, Lwb/zo;->a:Lwb/zo;

    .line 188
    .line 189
    new-instance v3, Lwb/sc;

    .line 190
    .line 191
    const/4 v4, 0x1

    .line 192
    invoke-direct/range {v3 .. v8}, Lwb/sc;-><init>(ILandroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V

    .line 193
    .line 194
    .line 195
    const-string v4, "\u542f\u52a8\u5fae\u4fe1\u5730\u56fe\u5931\u8d25: "

    .line 196
    .line 197
    monitor-enter v10

    .line 198
    :try_start_0
    new-instance v0, Lwb/xo;

    .line 199
    .line 200
    invoke-direct {v0, v9, v3}, Lwb/xo;-><init>(Landroid/app/Activity;Lwb/sc;)V

    .line 201
    .line 202
    .line 203
    sput-object v0, Lwb/zo;->c:Lwb/xo;

    .line 204
    .line 205
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v10, v0}, Lwb/zo;->a(Ljava/lang/Class;)V

    .line 210
    .line 211
    .line 212
    const-class v0, Landroid/app/Activity;

    .line 213
    .line 214
    invoke-virtual {v10, v0}, Lwb/zo;->a(Ljava/lang/Class;)V

    .line 215
    .line 216
    .line 217
    new-instance v0, Landroid/content/Intent;

    .line 218
    .line 219
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    new-instance v6, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string v5, ".plugin.location.ui.RedirectUI"

    .line 239
    .line 240
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-virtual {v0, v3, v5}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 248
    .line 249
    .line 250
    const-string v3, "map_view_type"

    .line 251
    .line 252
    const/16 v5, 0x8

    .line 253
    .line 254
    invoke-virtual {v0, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 255
    .line 256
    .line 257
    const v3, 0x4843525d    # 200009.45f

    .line 258
    .line 259
    .line 260
    :try_start_1
    invoke-virtual {v9, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 261
    .line 262
    .line 263
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 264
    .line 265
    goto :goto_3

    .line 266
    :catchall_0
    move-exception v0

    .line 267
    :try_start_2
    new-instance v3, Lsf/f;

    .line 268
    .line 269
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    move-object v0, v3

    .line 273
    :goto_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    if-eqz v0, :cond_4

    .line 278
    .line 279
    sget-object v3, Lwb/zo;->a:Lwb/zo;

    .line 280
    .line 281
    monitor-enter v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 282
    :try_start_3
    sput-object v1, Lwb/zo;->c:Lwb/xo;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 283
    .line 284
    :try_start_4
    monitor-exit v3

    .line 285
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    if-nez v0, :cond_3

    .line 290
    .line 291
    const-string v0, ""

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :catchall_1
    move-exception v0

    .line 295
    goto :goto_7

    .line 296
    :cond_3
    :goto_4
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v9, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 305
    .line 306
    .line 307
    goto :goto_5

    .line 308
    :catchall_2
    move-exception v0

    .line 309
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 310
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 311
    :cond_4
    :goto_5
    monitor-exit v10

    .line 312
    :goto_6
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 313
    .line 314
    return-object v0

    .line 315
    :goto_7
    :try_start_7
    monitor-exit v10
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 316
    throw v0

    .line 317
    :pswitch_2
    iget-object v0, p0, Lwb/xb;->h:Landroid/content/Context;

    .line 318
    .line 319
    iget-object v2, p0, Lwb/xb;->j:Li0/a1;

    .line 320
    .line 321
    iget-object v3, p0, Lwb/xb;->k:Li0/a1;

    .line 322
    .line 323
    iget-object v4, p0, Lwb/xb;->i:Landroid/content/SharedPreferences;

    .line 324
    .line 325
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    check-cast v2, Ljava/lang/Boolean;

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    move-object v9, v2

    .line 340
    check-cast v9, Ljava/util/Set;

    .line 341
    .line 342
    new-instance v10, Lwb/me;

    .line 343
    .line 344
    const/16 v2, 0x17

    .line 345
    .line 346
    invoke-direct {v10, v4, v3, v2}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 347
    .line 348
    .line 349
    instance-of v2, v0, Landroid/app/Activity;

    .line 350
    .line 351
    if-eqz v2, :cond_5

    .line 352
    .line 353
    check-cast v0, Landroid/app/Activity;

    .line 354
    .line 355
    goto :goto_8

    .line 356
    :cond_5
    move-object v0, v1

    .line 357
    :goto_8
    if-eqz v0, :cond_6

    .line 358
    .line 359
    move-object v6, v0

    .line 360
    goto :goto_a

    .line 361
    :cond_6
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    if-eqz v0, :cond_7

    .line 366
    .line 367
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    goto :goto_9

    .line 372
    :cond_7
    move-object v0, v1

    .line 373
    :goto_9
    if-eqz v0, :cond_8

    .line 374
    .line 375
    move-object v1, v0

    .line 376
    :cond_8
    if-eqz v1, :cond_a

    .line 377
    .line 378
    move-object v6, v1

    .line 379
    :goto_a
    if-eqz v7, :cond_9

    .line 380
    .line 381
    const-string v0, "\u6b63\u5728\u8f7d\u5165\u597d\u53cb\u548c\u975e\u597d\u53cb..."

    .line 382
    .line 383
    goto :goto_b

    .line 384
    :cond_9
    const-string v0, "\u6b63\u5728\u8f7d\u5165\u597d\u53cb\u5217\u8868..."

    .line 385
    .line 386
    :goto_b
    new-instance v1, Lk/s1;

    .line 387
    .line 388
    const/16 v2, 0x19

    .line 389
    .line 390
    invoke-direct {v1, v2}, Lk/s1;-><init>(I)V

    .line 391
    .line 392
    .line 393
    const-string v2, "\u8bbe\u7f6e\u6392\u9664\u540d\u5355"

    .line 394
    .line 395
    invoke-static {v6, v1, v2, v0}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 396
    .line 397
    .line 398
    move-result-object v8

    .line 399
    new-instance v0, Ljava/lang/Thread;

    .line 400
    .line 401
    new-instance v5, Lia/l;

    .line 402
    .line 403
    invoke-direct/range {v5 .. v10}, Lia/l;-><init>(Landroid/app/Activity;ZLwb/kv;Ljava/util/Set;Lwb/me;)V

    .line 404
    .line 405
    .line 406
    const-string v1, "Hchat-MomentsFakeLikeExclude"

    .line 407
    .line 408
    invoke-direct {v0, v5, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    const/4 v1, 0x1

    .line 412
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 416
    .line 417
    .line 418
    :cond_a
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 419
    .line 420
    return-object v0

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
