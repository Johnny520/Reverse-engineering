.class public final synthetic Lb9/c;
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


# direct methods
.method public synthetic constructor <init>(Lbb/g;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 20
    const/4 v0, 0x1

    iput v0, p0, Lb9/c;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/c;->j:Ljava/lang/Object;

    iput-object p2, p0, Lb9/c;->h:Ljava/lang/Object;

    iput-object p3, p0, Lb9/c;->i:Ljava/lang/Object;

    iput-object p4, p0, Lb9/c;->k:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 17
    iput p5, p0, Lb9/c;->g:I

    iput-object p1, p0, Lb9/c;->h:Ljava/lang/Object;

    iput-object p2, p0, Lb9/c;->j:Ljava/lang/Object;

    iput-object p3, p0, Lb9/c;->k:Ljava/lang/Object;

    iput-object p4, p0, Lb9/c;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 18
    iput p5, p0, Lb9/c;->g:I

    iput-object p1, p0, Lb9/c;->h:Ljava/lang/Object;

    iput-object p2, p0, Lb9/c;->i:Ljava/lang/Object;

    iput-object p3, p0, Lb9/c;->j:Ljava/lang/Object;

    iput-object p4, p0, Lb9/c;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 19
    iput p5, p0, Lb9/c;->g:I

    iput-object p1, p0, Lb9/c;->i:Ljava/lang/Object;

    iput-object p2, p0, Lb9/c;->h:Ljava/lang/Object;

    iput-object p3, p0, Lb9/c;->j:Ljava/lang/Object;

    iput-object p4, p0, Lb9/c;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lob/n;Lob/k;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    iput v0, p0, Lb9/c;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lb9/c;->h:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lb9/c;->j:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Lb9/c;->i:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p4, p0, Lb9/c;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Lqg/t;Lg8/i;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 21
    const/16 p1, 0x16

    iput p1, p0, Lb9/c;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb9/c;->h:Ljava/lang/Object;

    iput-object p3, p0, Lb9/c;->j:Ljava/lang/Object;

    iput-object p4, p0, Lb9/c;->k:Ljava/lang/Object;

    iput-object p5, p0, Lb9/c;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lb9/c;->g:I

    .line 4
    .line 5
    const/16 v2, 0xf

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lwb/kv;

    .line 19
    .line 20
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lxa/m;

    .line 23
    .line 24
    iget-object v3, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Landroid/app/Activity;

    .line 27
    .line 28
    iget-object v4, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, Lxa/j;

    .line 31
    .line 32
    invoke-interface {v0}, Lwb/kv;->close()V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lwb/zh;

    .line 36
    .line 37
    const/16 v5, 0xe

    .line 38
    .line 39
    invoke-direct {v0, v2, v3, v4, v5}, Lwb/zh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    new-instance v5, Lwb/vu;

    .line 58
    .line 59
    invoke-direct {v5, v2, v3, v0}, Lwb/vu;-><init>(Lxa/m;Landroid/app/Activity;Lfg/a;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v5}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    return-void

    .line 66
    :pswitch_0
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lfg/a;

    .line 69
    .line 70
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v9, v2

    .line 73
    check-cast v9, Lxa/m;

    .line 74
    .line 75
    iget-object v2, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v8, v2

    .line 78
    check-cast v8, Lwb/kv;

    .line 79
    .line 80
    iget-object v2, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v10, v2

    .line 83
    check-cast v10, Landroid/app/Activity;

    .line 84
    .line 85
    :try_start_0
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    goto :goto_0

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    new-instance v2, Lsf/f;

    .line 92
    .line 93
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object v0, v2

    .line 97
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    if-nez v2, :cond_1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    iget-object v0, v9, Lxa/m;->b:Lia/t;

    .line 105
    .line 106
    const-string v3, "\u66f4\u65b0\u597d\u53cb\u8d44\u6599\u5931\u8d25"

    .line 107
    .line 108
    invoke-virtual {v0, v3, v2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    new-instance v0, Lxa/j;

    .line 112
    .line 113
    invoke-direct {v0, v6, v3}, Lxa/j;-><init>(ZLjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :goto_1
    move-object v11, v0

    .line 117
    check-cast v11, Lxa/j;

    .line 118
    .line 119
    iget-object v0, v9, Lxa/m;->d:Landroid/os/Handler;

    .line 120
    .line 121
    new-instance v7, Lb9/c;

    .line 122
    .line 123
    const/16 v12, 0x1c

    .line 124
    .line 125
    invoke-direct/range {v7 .. v12}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :pswitch_1
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 133
    .line 134
    move-object v4, v0

    .line 135
    check-cast v4, Lxa/m;

    .line 136
    .line 137
    iget-object v0, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 138
    .line 139
    move-object v3, v0

    .line 140
    check-cast v3, Lwb/kv;

    .line 141
    .line 142
    iget-object v0, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 143
    .line 144
    move-object v5, v0

    .line 145
    check-cast v5, Landroid/app/Activity;

    .line 146
    .line 147
    iget-object v0, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 148
    .line 149
    move-object v7, v0

    .line 150
    check-cast v7, Lxa/i;

    .line 151
    .line 152
    :try_start_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-eqz v0, :cond_8

    .line 157
    .line 158
    invoke-virtual {v0}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    new-instance v2, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-eqz v6, :cond_4

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    move-object v8, v6

    .line 182
    check-cast v8, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 183
    .line 184
    iget-object v9, v8, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 185
    .line 186
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    if-eqz v9, :cond_3

    .line 191
    .line 192
    iget-object v8, v8, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 193
    .line 194
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    if-nez v8, :cond_2

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :catchall_1
    move-exception v0

    .line 202
    goto :goto_5

    .line 203
    :cond_3
    :goto_3
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_4
    new-instance v0, Ljava/util/HashSet;

    .line 208
    .line 209
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 210
    .line 211
    .line 212
    new-instance v6, Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    :cond_5
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    if-eqz v8, :cond_7

    .line 226
    .line 227
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    move-object v9, v8

    .line 232
    check-cast v9, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 233
    .line 234
    iget-object v10, v9, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 235
    .line 236
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    if-eqz v11, :cond_6

    .line 241
    .line 242
    iget-object v10, v9, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 243
    .line 244
    :cond_6
    invoke-virtual {v0, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    if-eqz v9, :cond_5

    .line 249
    .line 250
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_7
    new-instance v0, Lxa/l;

    .line 255
    .line 256
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-static {v6, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    move-object v6, v0

    .line 264
    goto :goto_6

    .line 265
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 266
    .line 267
    const-string v2, "\u8054\u7cfb\u4eba\u6807\u7b7e\u4e0d\u53ef\u7528"

    .line 268
    .line 269
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 273
    :goto_5
    new-instance v2, Lsf/f;

    .line 274
    .line 275
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    move-object v6, v2

    .line 279
    :goto_6
    iget-object v0, v4, Lxa/m;->d:Landroid/os/Handler;

    .line 280
    .line 281
    new-instance v2, Lca/x;

    .line 282
    .line 283
    invoke-direct/range {v2 .. v7}, Lca/x;-><init>(Lwb/kv;Lxa/m;Landroid/app/Activity;Ljava/lang/Object;Lxa/i;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :pswitch_2
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, Landroid/content/Context;

    .line 293
    .line 294
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v2, Lx9/e;

    .line 297
    .line 298
    iget-object v3, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v3, Lk8/o;

    .line 301
    .line 302
    iget-object v4, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v4, Ljava/lang/String;

    .line 305
    .line 306
    :try_start_2
    invoke-static {v0, v2, v3, v4}, Lx9/d;->d(Landroid/content/Context;Lx9/e;Lk8/o;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :catchall_2
    move-exception v0

    .line 313
    new-instance v2, Lsf/f;

    .line 314
    .line 315
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    move-object v0, v2

    .line 319
    :goto_7
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    if-eqz v0, :cond_9

    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    const-string v3, "[Hchat:KeywordNotification] \u5904\u7406\u6d88\u606f\u5931\u8d25: "

    .line 330
    .line 331
    invoke-static {v3, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 332
    .line 333
    .line 334
    :cond_9
    return-void

    .line 335
    :pswitch_3
    iget-object v0, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, Ljava/lang/String;

    .line 338
    .line 339
    iget-object v2, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v2, Li0/a1;

    .line 342
    .line 343
    iget-object v3, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v3, Li0/a1;

    .line 346
    .line 347
    iget-object v4, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v4, Li0/a1;

    .line 350
    .line 351
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    check-cast v2, Ljava/lang/String;

    .line 356
    .line 357
    invoke-static {v2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-eqz v0, :cond_a

    .line 362
    .line 363
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 364
    .line 365
    invoke-interface {v3, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 369
    .line 370
    .line 371
    move-result-wide v2

    .line 372
    invoke-static {v4, v2, v3}, Lwb/y2;->L0(Li0/a1;J)V

    .line 373
    .line 374
    .line 375
    :cond_a
    return-void

    .line 376
    :pswitch_4
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v0, Ljava/io/Serializable;

    .line 379
    .line 380
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v2, Li0/a1;

    .line 383
    .line 384
    iget-object v3, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v3, Li0/a1;

    .line 387
    .line 388
    iget-object v6, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v6, Li0/a1;

    .line 391
    .line 392
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 393
    .line 394
    instance-of v8, v0, Lsf/f;

    .line 395
    .line 396
    if-eqz v8, :cond_b

    .line 397
    .line 398
    goto :goto_8

    .line 399
    :cond_b
    move-object v7, v0

    .line 400
    :goto_8
    check-cast v7, Ljava/lang/Iterable;

    .line 401
    .line 402
    new-instance v8, Ljava/util/ArrayList;

    .line 403
    .line 404
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    :cond_c
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 412
    .line 413
    .line 414
    move-result v9

    .line 415
    if-eqz v9, :cond_e

    .line 416
    .line 417
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v9

    .line 421
    move-object v10, v9

    .line 422
    check-cast v10, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 423
    .line 424
    iget-object v11, v10, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 425
    .line 426
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 427
    .line 428
    .line 429
    move-result v11

    .line 430
    if-eqz v11, :cond_d

    .line 431
    .line 432
    iget-object v10, v10, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 433
    .line 434
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    if-nez v10, :cond_c

    .line 439
    .line 440
    :cond_d
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    goto :goto_9

    .line 444
    :cond_e
    new-instance v7, Lwb/e2;

    .line 445
    .line 446
    const/4 v9, 0x2

    .line 447
    invoke-direct {v7, v9}, Lwb/e2;-><init>(I)V

    .line 448
    .line 449
    .line 450
    invoke-static {v8, v7}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 451
    .line 452
    .line 453
    move-result-object v7

    .line 454
    sget-object v8, Lwb/ho;->a:Log/k;

    .line 455
    .line 456
    invoke-interface {v2, v7}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    if-eqz v0, :cond_f

    .line 464
    .line 465
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    :cond_f
    if-nez v5, :cond_10

    .line 470
    .line 471
    goto :goto_a

    .line 472
    :cond_10
    move-object v4, v5

    .line 473
    :goto_a
    invoke-interface {v3, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 477
    .line 478
    invoke-interface {v6, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    return-void

    .line 482
    :pswitch_5
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v0, Lg8/i;

    .line 485
    .line 486
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 487
    .line 488
    move-object v5, v2

    .line 489
    check-cast v5, Li0/a1;

    .line 490
    .line 491
    iget-object v2, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 492
    .line 493
    move-object v6, v2

    .line 494
    check-cast v6, Li0/a1;

    .line 495
    .line 496
    iget-object v2, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 497
    .line 498
    move-object v7, v2

    .line 499
    check-cast v7, Li0/a1;

    .line 500
    .line 501
    :try_start_3
    invoke-virtual {v0}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 502
    .line 503
    .line 504
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 505
    move-object v4, v0

    .line 506
    goto :goto_b

    .line 507
    :catchall_3
    move-exception v0

    .line 508
    new-instance v2, Lsf/f;

    .line 509
    .line 510
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 511
    .line 512
    .line 513
    move-object v4, v2

    .line 514
    :goto_b
    new-instance v0, Landroid/os/Handler;

    .line 515
    .line 516
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 521
    .line 522
    .line 523
    new-instance v3, Lb9/c;

    .line 524
    .line 525
    const/16 v8, 0x17

    .line 526
    .line 527
    invoke-direct/range {v3 .. v8}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 531
    .line 532
    .line 533
    return-void

    .line 534
    :pswitch_6
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 535
    .line 536
    move-object v7, v0

    .line 537
    check-cast v7, Landroid/app/Activity;

    .line 538
    .line 539
    iget-object v0, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 540
    .line 541
    move-object v8, v0

    .line 542
    check-cast v8, Ljava/util/List;

    .line 543
    .line 544
    iget-object v0, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 545
    .line 546
    move-object v15, v0

    .line 547
    check-cast v15, Ljava/util/Set;

    .line 548
    .line 549
    iget-object v0, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v0, Lwb/me;

    .line 552
    .line 553
    invoke-virtual {v7}, Landroid/app/Activity;->isFinishing()Z

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    if-nez v3, :cond_16

    .line 558
    .line 559
    invoke-virtual {v7}, Landroid/app/Activity;->isDestroyed()Z

    .line 560
    .line 561
    .line 562
    move-result v3

    .line 563
    if-eqz v3, :cond_11

    .line 564
    .line 565
    goto :goto_e

    .line 566
    :cond_11
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 567
    .line 568
    .line 569
    move-result v3

    .line 570
    if-eqz v3, :cond_12

    .line 571
    .line 572
    const-string v0, "\u6ca1\u6709\u53ef\u9009\u62e9\u7684\u8054\u7cfb\u4eba"

    .line 573
    .line 574
    invoke-static {v7, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 579
    .line 580
    .line 581
    goto :goto_e

    .line 582
    :cond_12
    new-instance v3, Ljava/util/HashSet;

    .line 583
    .line 584
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 585
    .line 586
    .line 587
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 592
    .line 593
    .line 594
    move-result v5

    .line 595
    if-eqz v5, :cond_13

    .line 596
    .line 597
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v5

    .line 601
    check-cast v5, Lwb/jv;

    .line 602
    .line 603
    iget-object v5, v5, Lwb/jv;->a:Ljava/lang/String;

    .line 604
    .line 605
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    goto :goto_c

    .line 609
    :cond_13
    move-object v4, v15

    .line 610
    check-cast v4, Ljava/lang/Iterable;

    .line 611
    .line 612
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 613
    .line 614
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 615
    .line 616
    .line 617
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 618
    .line 619
    .line 620
    move-result-object v4

    .line 621
    :cond_14
    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 622
    .line 623
    .line 624
    move-result v6

    .line 625
    if-eqz v6, :cond_15

    .line 626
    .line 627
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v6

    .line 631
    move-object v9, v6

    .line 632
    check-cast v9, Ljava/lang/String;

    .line 633
    .line 634
    invoke-virtual {v3, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    move-result v9

    .line 638
    if-nez v9, :cond_14

    .line 639
    .line 640
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    goto :goto_d

    .line 644
    :cond_15
    new-instance v9, Lwb/l7;

    .line 645
    .line 646
    invoke-direct {v9, v0, v2, v5}, Lwb/l7;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    new-instance v10, Lk/s1;

    .line 650
    .line 651
    const/16 v0, 0x19

    .line 652
    .line 653
    invoke-direct {v10, v0}, Lk/s1;-><init>(I)V

    .line 654
    .line 655
    .line 656
    const/16 v16, 0x0

    .line 657
    .line 658
    const/16 v17, 0x480

    .line 659
    .line 660
    const-string v11, "\u8bbe\u7f6e\u6392\u9664\u540d\u5355"

    .line 661
    .line 662
    const-string v12, "\u4fdd\u5b58"

    .line 663
    .line 664
    const/4 v13, 0x0

    .line 665
    const/4 v14, 0x0

    .line 666
    invoke-static/range {v7 .. v17}, Lwb/y2;->U1(Landroid/app/Activity;Ljava/util/List;Lfg/l;Lfg/a;Ljava/lang/String;Ljava/lang/String;ZLc9/v;Ljava/util/Set;ZI)V

    .line 667
    .line 668
    .line 669
    :cond_16
    :goto_e
    return-void

    .line 670
    :pswitch_7
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v0, Lg8/i;

    .line 673
    .line 674
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v2, Lwb/s0;

    .line 677
    .line 678
    iget-object v4, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 679
    .line 680
    check-cast v4, Landroid/os/Handler;

    .line 681
    .line 682
    iget-object v6, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast v6, Lwb/la;

    .line 685
    .line 686
    :try_start_4
    iget-object v7, v2, Lwb/s0;->a:Ljava/lang/String;

    .line 687
    .line 688
    invoke-virtual {v0, v7}, Lg8/i;->w(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 689
    .line 690
    .line 691
    move-result-object v7

    .line 692
    iget-object v2, v2, Lwb/s0;->a:Ljava/lang/String;

    .line 693
    .line 694
    invoke-static {v2}, Lg8/i;->I(Ljava/lang/String;)Z

    .line 695
    .line 696
    .line 697
    move-result v8

    .line 698
    if-nez v8, :cond_17

    .line 699
    .line 700
    new-instance v0, Ljava/util/ArrayList;

    .line 701
    .line 702
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 703
    .line 704
    .line 705
    goto :goto_f

    .line 706
    :cond_17
    invoke-virtual {v0, v2}, Lg8/i;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    invoke-virtual {v0, v2}, Lg8/i;->q(Ljava/util/List;)Ljava/util/ArrayList;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    :goto_f
    new-instance v2, Ljava/util/ArrayList;

    .line 715
    .line 716
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 717
    .line 718
    .line 719
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    :cond_18
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 724
    .line 725
    .line 726
    move-result v8

    .line 727
    if-eqz v8, :cond_20

    .line 728
    .line 729
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v8

    .line 733
    check-cast v8, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 734
    .line 735
    iget-object v9, v8, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 736
    .line 737
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 738
    .line 739
    .line 740
    move-result v10

    .line 741
    if-nez v10, :cond_19

    .line 742
    .line 743
    move-object v12, v9

    .line 744
    goto :goto_11

    .line 745
    :cond_19
    move-object v12, v5

    .line 746
    :goto_11
    if-eqz v12, :cond_1f

    .line 747
    .line 748
    invoke-virtual {v7, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v9

    .line 752
    check-cast v9, Ljava/lang/String;

    .line 753
    .line 754
    if-eqz v9, :cond_1c

    .line 755
    .line 756
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 757
    .line 758
    .line 759
    move-result v10

    .line 760
    if-nez v10, :cond_1a

    .line 761
    .line 762
    goto :goto_12

    .line 763
    :cond_1a
    move-object v9, v5

    .line 764
    :goto_12
    if-eqz v9, :cond_1c

    .line 765
    .line 766
    :cond_1b
    :goto_13
    move-object v13, v9

    .line 767
    goto :goto_14

    .line 768
    :catchall_4
    move-exception v0

    .line 769
    goto/16 :goto_17

    .line 770
    .line 771
    :cond_1c
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v9

    .line 775
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 776
    .line 777
    .line 778
    move-result v10

    .line 779
    if-nez v10, :cond_1b

    .line 780
    .line 781
    move-object v9, v12

    .line 782
    goto :goto_13

    .line 783
    :goto_14
    iget-object v15, v8, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 784
    .line 785
    iget-object v9, v8, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 786
    .line 787
    iget-object v10, v8, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 788
    .line 789
    iget-object v11, v8, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 790
    .line 791
    iget-object v8, v8, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 792
    .line 793
    filled-new-array {v10, v11, v8}, [Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v8

    .line 797
    invoke-static {v8}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 798
    .line 799
    .line 800
    move-result-object v8

    .line 801
    new-instance v10, Ljava/util/ArrayList;

    .line 802
    .line 803
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 804
    .line 805
    .line 806
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 807
    .line 808
    .line 809
    move-result-object v8

    .line 810
    :cond_1d
    :goto_15
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 811
    .line 812
    .line 813
    move-result v11

    .line 814
    if-eqz v11, :cond_1e

    .line 815
    .line 816
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v11

    .line 820
    move-object v14, v11

    .line 821
    check-cast v14, Ljava/lang/String;

    .line 822
    .line 823
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 824
    .line 825
    .line 826
    move-result v14

    .line 827
    if-nez v14, :cond_1d

    .line 828
    .line 829
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    goto :goto_15

    .line 833
    :cond_1e
    invoke-static {v10}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 834
    .line 835
    .line 836
    move-result-object v8

    .line 837
    invoke-static {v8}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 838
    .line 839
    .line 840
    move-result-object v19

    .line 841
    new-instance v11, Lwb/s0;

    .line 842
    .line 843
    const/4 v14, 0x0

    .line 844
    const/16 v17, 0x0

    .line 845
    .line 846
    const/16 v18, 0x0

    .line 847
    .line 848
    const/16 v20, 0xe0

    .line 849
    .line 850
    move-object/from16 v16, v9

    .line 851
    .line 852
    invoke-direct/range {v11 .. v20}, Lwb/s0;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)V

    .line 853
    .line 854
    .line 855
    goto :goto_16

    .line 856
    :cond_1f
    move-object v11, v5

    .line 857
    :goto_16
    if-eqz v11, :cond_18

    .line 858
    .line 859
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    goto/16 :goto_10

    .line 863
    .line 864
    :cond_20
    new-instance v0, Lwb/e2;

    .line 865
    .line 866
    const/4 v5, 0x6

    .line 867
    invoke-direct {v0, v5}, Lwb/e2;-><init>(I)V

    .line 868
    .line 869
    .line 870
    invoke-static {v2, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    new-instance v2, Lrb/g;

    .line 875
    .line 876
    invoke-direct {v2, v6, v3, v0}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v4, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 880
    .line 881
    .line 882
    goto :goto_18

    .line 883
    :goto_17
    new-instance v2, Lrb/g;

    .line 884
    .line 885
    const/16 v3, 0x9

    .line 886
    .line 887
    invoke-direct {v2, v6, v3, v0}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {v4, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 891
    .line 892
    .line 893
    :goto_18
    return-void

    .line 894
    :pswitch_8
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 895
    .line 896
    check-cast v0, Lsf/e;

    .line 897
    .line 898
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 899
    .line 900
    check-cast v2, Li0/a1;

    .line 901
    .line 902
    iget-object v3, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v3, Landroid/content/Context;

    .line 905
    .line 906
    iget-object v4, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 907
    .line 908
    check-cast v4, Li0/a1;

    .line 909
    .line 910
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 911
    .line 912
    invoke-interface {v2, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 913
    .line 914
    .line 915
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 916
    .line 917
    check-cast v0, Ljava/lang/String;

    .line 918
    .line 919
    invoke-static {v3, v4, v0}, Lwb/ho;->h(Landroid/content/Context;Li0/a1;Ljava/lang/String;)V

    .line 920
    .line 921
    .line 922
    return-void

    .line 923
    :pswitch_9
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 924
    .line 925
    check-cast v0, Lv8/h;

    .line 926
    .line 927
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 928
    .line 929
    check-cast v2, Lv8/q;

    .line 930
    .line 931
    iget-object v3, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 932
    .line 933
    check-cast v3, Lfg/a;

    .line 934
    .line 935
    iget-object v4, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 936
    .line 937
    check-cast v4, Lfg/a;

    .line 938
    .line 939
    iget-boolean v5, v0, Lv8/h;->q:Z

    .line 940
    .line 941
    if-eqz v5, :cond_22

    .line 942
    .line 943
    iget-object v2, v2, Lv8/q;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 944
    .line 945
    iget-object v0, v0, Lv8/h;->a:Ljava/lang/String;

    .line 946
    .line 947
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 948
    .line 949
    .line 950
    move-result v0

    .line 951
    if-nez v0, :cond_21

    .line 952
    .line 953
    goto :goto_19

    .line 954
    :cond_21
    invoke-interface {v4}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    goto :goto_1a

    .line 958
    :cond_22
    :goto_19
    if-eqz v3, :cond_23

    .line 959
    .line 960
    invoke-interface {v3}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    :cond_23
    :goto_1a
    return-void

    .line 964
    :pswitch_a
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 965
    .line 966
    check-cast v0, Lra/c;

    .line 967
    .line 968
    iget-object v2, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 969
    .line 970
    check-cast v2, Ljava/lang/String;

    .line 971
    .line 972
    iget-object v3, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 973
    .line 974
    iget-object v4, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 975
    .line 976
    check-cast v4, Ljava/util/Map;

    .line 977
    .line 978
    iget-object v5, v0, Lra/c;->e:Ljava/lang/Object;

    .line 979
    .line 980
    check-cast v5, Lna/k;

    .line 981
    .line 982
    iget-object v7, v5, Lna/k;->p:Ljava/util/Set;

    .line 983
    .line 984
    invoke-interface {v7, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 985
    .line 986
    .line 987
    move-result v7

    .line 988
    if-eqz v7, :cond_26

    .line 989
    .line 990
    iget-object v5, v5, Lna/k;->q:Ljava/util/Set;

    .line 991
    .line 992
    invoke-interface {v5, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 993
    .line 994
    .line 995
    move-result v5

    .line 996
    if-eqz v5, :cond_24

    .line 997
    .line 998
    goto :goto_1b

    .line 999
    :cond_24
    iget-object v5, v0, Lra/c;->f:Ljava/lang/Object;

    .line 1000
    .line 1001
    check-cast v5, Lm8/c;

    .line 1002
    .line 1003
    invoke-virtual {v5, v3}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v3

    .line 1007
    if-eqz v3, :cond_25

    .line 1008
    .line 1009
    const-string v3, "redpacket_open_timeout:"

    .line 1010
    .line 1011
    invoke-static {v3, v2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v3

    .line 1015
    new-instance v4, Lra/a;

    .line 1016
    .line 1017
    invoke-direct {v4, v0, v2, v6}, Lra/a;-><init>(Lra/c;Ljava/lang/String;I)V

    .line 1018
    .line 1019
    .line 1020
    const-wide/16 v5, 0x1194

    .line 1021
    .line 1022
    invoke-static {v3, v5, v6, v4}, Lra/c;->t(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 1023
    .line 1024
    .line 1025
    goto :goto_1b

    .line 1026
    :cond_25
    const-string v3, "\u62c6\u7ea2\u5305\u91cd\u8bd5\u53d1\u5305\u5931\u8d25"

    .line 1027
    .line 1028
    invoke-virtual {v0, v4, v2, v3}, Lra/c;->p(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v5

    .line 1032
    if-nez v5, :cond_26

    .line 1033
    .line 1034
    invoke-virtual {v0, v3, v4}, Lra/c;->n(Ljava/lang/String;Ljava/util/Map;)V

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v0, v2}, Lra/c;->d(Ljava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    :cond_26
    :goto_1b
    return-void

    .line 1041
    :pswitch_b
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 1042
    .line 1043
    move-object v4, v0

    .line 1044
    check-cast v4, Lqb/k;

    .line 1045
    .line 1046
    iget-object v0, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 1047
    .line 1048
    move-object v8, v0

    .line 1049
    check-cast v8, Landroid/os/Handler;

    .line 1050
    .line 1051
    iget-object v0, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 1052
    .line 1053
    move-object v3, v0

    .line 1054
    check-cast v3, Landroid/app/Activity;

    .line 1055
    .line 1056
    iget-object v0, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 1057
    .line 1058
    move-object v6, v0

    .line 1059
    check-cast v6, Lqb/i;

    .line 1060
    .line 1061
    :try_start_5
    invoke-static {}, Lqb/k;->v()Ljava/util/List;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    new-instance v2, Lqb/f;

    .line 1066
    .line 1067
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1068
    .line 1069
    .line 1070
    move-result-wide v9

    .line 1071
    invoke-direct {v2, v0, v9, v10}, Lqb/f;-><init>(Ljava/util/List;J)V

    .line 1072
    .line 1073
    .line 1074
    iput-object v2, v4, Lqb/k;->r:Lqb/f;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1075
    .line 1076
    move-object v5, v0

    .line 1077
    goto :goto_1c

    .line 1078
    :catchall_5
    move-exception v0

    .line 1079
    new-instance v2, Lsf/f;

    .line 1080
    .line 1081
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1082
    .line 1083
    .line 1084
    move-object v5, v2

    .line 1085
    :goto_1c
    new-instance v2, Lb9/c;

    .line 1086
    .line 1087
    const/16 v7, 0xf

    .line 1088
    .line 1089
    invoke-direct/range {v2 .. v7}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v8, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1093
    .line 1094
    .line 1095
    return-void

    .line 1096
    :pswitch_c
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 1097
    .line 1098
    check-cast v0, Landroid/app/Activity;

    .line 1099
    .line 1100
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 1101
    .line 1102
    check-cast v2, Lqb/k;

    .line 1103
    .line 1104
    iget-object v3, v2, Lqb/k;->l:Ljava/util/Set;

    .line 1105
    .line 1106
    iget-object v4, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 1107
    .line 1108
    iget-object v5, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 1109
    .line 1110
    check-cast v5, Lqb/i;

    .line 1111
    .line 1112
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 1113
    .line 1114
    .line 1115
    move-result v6

    .line 1116
    if-eqz v6, :cond_27

    .line 1117
    .line 1118
    invoke-interface {v3, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1119
    .line 1120
    .line 1121
    goto :goto_1d

    .line 1122
    :cond_27
    instance-of v6, v4, Lsf/f;

    .line 1123
    .line 1124
    if-nez v6, :cond_28

    .line 1125
    .line 1126
    move-object v6, v4

    .line 1127
    check-cast v6, Ljava/util/List;

    .line 1128
    .line 1129
    invoke-virtual {v2, v0, v5, v6}, Lqb/k;->L(Landroid/app/Activity;Lqb/i;Ljava/util/List;)V

    .line 1130
    .line 1131
    .line 1132
    :cond_28
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v2

    .line 1136
    if-eqz v2, :cond_29

    .line 1137
    .line 1138
    invoke-interface {v3, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1139
    .line 1140
    .line 1141
    const-string v2, "\u8054\u7cfb\u4eba\u5217\u8868\u4e0d\u53ef\u7528"

    .line 1142
    .line 1143
    invoke-static {v0, v2}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1144
    .line 1145
    .line 1146
    :cond_29
    :goto_1d
    return-void

    .line 1147
    :pswitch_d
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 1148
    .line 1149
    move-object v2, v0

    .line 1150
    check-cast v2, Lob/n;

    .line 1151
    .line 1152
    iget-object v0, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 1153
    .line 1154
    check-cast v0, Lob/k;

    .line 1155
    .line 1156
    iget-object v3, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 1157
    .line 1158
    check-cast v3, Ljava/lang/String;

    .line 1159
    .line 1160
    iget-object v4, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 1161
    .line 1162
    check-cast v4, Ljava/lang/String;

    .line 1163
    .line 1164
    const-string v5, "\u6587\u5b57\u8f6c\u8bed\u97f3\u53d1\u9001\u5931\u8d25"

    .line 1165
    .line 1166
    const-string v6, ".part"

    .line 1167
    .line 1168
    invoke-virtual {v2, v0}, Lob/n;->c(Lob/k;)Ljava/io/File;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v7

    .line 1172
    iget-object v8, v2, Lob/n;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1173
    .line 1174
    :try_start_6
    invoke-virtual {v2, v3, v0, v7}, Lob/n;->k(Ljava/lang/String;Lob/k;Ljava/io/File;)V

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1178
    .line 1179
    .line 1180
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1181
    if-nez v0, :cond_2a

    .line 1182
    .line 1183
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 1184
    .line 1185
    .line 1186
    new-instance v0, Ljava/io/File;

    .line 1187
    .line 1188
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v2

    .line 1192
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v3

    .line 1196
    invoke-static {v3, v6}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v3

    .line 1200
    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1201
    .line 1202
    .line 1203
    :goto_1e
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 1204
    .line 1205
    .line 1206
    goto/16 :goto_21

    .line 1207
    .line 1208
    :cond_2a
    :try_start_7
    invoke-virtual {v2}, Lob/n;->i()Z

    .line 1209
    .line 1210
    .line 1211
    move-result v0

    .line 1212
    if-nez v0, :cond_2b

    .line 1213
    .line 1214
    sget-object v0, Leb/m0;->a:Leb/m0;

    .line 1215
    .line 1216
    invoke-static {v4, v3}, Leb/m0;->k(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 1220
    .line 1221
    .line 1222
    new-instance v0, Ljava/io/File;

    .line 1223
    .line 1224
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v2

    .line 1228
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v3

    .line 1232
    invoke-static {v3, v6}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v3

    .line 1236
    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1237
    .line 1238
    .line 1239
    goto :goto_1e

    .line 1240
    :catchall_6
    move-exception v0

    .line 1241
    goto :goto_1f

    .line 1242
    :cond_2b
    :try_start_8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v0

    .line 1246
    if-eqz v0, :cond_2c

    .line 1247
    .line 1248
    iget-object v0, v0, Lj8/p;->b:Lj8/y;

    .line 1249
    .line 1250
    if-eqz v0, :cond_2c

    .line 1251
    .line 1252
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v9

    .line 1256
    invoke-virtual {v0, v4, v9}, Lj8/y;->t(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1257
    .line 1258
    .line 1259
    move-result v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 1260
    const/4 v9, 0x1

    .line 1261
    if-ne v0, v9, :cond_2c

    .line 1262
    .line 1263
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 1264
    .line 1265
    .line 1266
    new-instance v0, Ljava/io/File;

    .line 1267
    .line 1268
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v2

    .line 1272
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v3

    .line 1276
    invoke-static {v3, v6}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v3

    .line 1280
    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1281
    .line 1282
    .line 1283
    goto :goto_1e

    .line 1284
    :cond_2c
    :try_start_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1285
    .line 1286
    const-string v9, "\u5fae\u4fe1\u8bed\u97f3\u53d1\u9001\u5931\u8d25"

    .line 1287
    .line 1288
    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1289
    .line 1290
    .line 1291
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 1292
    :goto_1f
    :try_start_a
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1293
    .line 1294
    .line 1295
    move-result v8

    .line 1296
    if-eqz v8, :cond_2d

    .line 1297
    .line 1298
    iget-object v8, v2, Lob/n;->b:Lia/t;

    .line 1299
    .line 1300
    invoke-virtual {v8, v5, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1301
    .line 1302
    .line 1303
    sget-object v8, Leb/m0;->a:Leb/m0;

    .line 1304
    .line 1305
    invoke-static {v4, v3}, Leb/m0;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 1306
    .line 1307
    .line 1308
    invoke-static {v5, v0}, Lob/n;->m(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v0

    .line 1312
    invoke-virtual {v2, v0}, Lob/n;->l(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 1313
    .line 1314
    .line 1315
    goto :goto_20

    .line 1316
    :catchall_7
    move-exception v0

    .line 1317
    goto :goto_22

    .line 1318
    :cond_2d
    :goto_20
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 1319
    .line 1320
    .line 1321
    new-instance v0, Ljava/io/File;

    .line 1322
    .line 1323
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v2

    .line 1327
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v3

    .line 1331
    invoke-static {v3, v6}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v3

    .line 1335
    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1336
    .line 1337
    .line 1338
    goto/16 :goto_1e

    .line 1339
    .line 1340
    :goto_21
    return-void

    .line 1341
    :goto_22
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 1342
    .line 1343
    .line 1344
    new-instance v2, Ljava/io/File;

    .line 1345
    .line 1346
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v3

    .line 1350
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v4

    .line 1354
    invoke-static {v4, v6}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v4

    .line 1358
    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 1362
    .line 1363
    .line 1364
    throw v0

    .line 1365
    :pswitch_e
    iget-object v0, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 1366
    .line 1367
    check-cast v0, Ljava/lang/String;

    .line 1368
    .line 1369
    iget-object v2, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 1370
    .line 1371
    check-cast v2, Lo8/j;

    .line 1372
    .line 1373
    iget-object v3, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 1374
    .line 1375
    check-cast v3, Lgg/u;

    .line 1376
    .line 1377
    iget-object v4, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 1378
    .line 1379
    check-cast v4, Ljava/lang/Runnable;

    .line 1380
    .line 1381
    if-eqz v0, :cond_2f

    .line 1382
    .line 1383
    iget-object v6, v2, Lo8/j;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1384
    .line 1385
    iget-object v3, v3, Lgg/u;->g:Ljava/lang/Object;

    .line 1386
    .line 1387
    if-eqz v3, :cond_2e

    .line 1388
    .line 1389
    check-cast v3, Ljava/lang/Runnable;

    .line 1390
    .line 1391
    invoke-virtual {v6, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1392
    .line 1393
    .line 1394
    goto :goto_23

    .line 1395
    :cond_2e
    const-string v0, "wrapped"

    .line 1396
    .line 1397
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 1398
    .line 1399
    .line 1400
    throw v5

    .line 1401
    :cond_2f
    :goto_23
    invoke-virtual {v2, v4}, Lo8/j;->g(Ljava/lang/Runnable;)V

    .line 1402
    .line 1403
    .line 1404
    return-void

    .line 1405
    :pswitch_f
    sget-object v0, Lm9/c;->i:Lm9/c;

    .line 1406
    .line 1407
    iget-object v2, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 1408
    .line 1409
    move-object v7, v2

    .line 1410
    check-cast v7, Landroid/app/Activity;

    .line 1411
    .line 1412
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 1413
    .line 1414
    check-cast v2, Lm9/e;

    .line 1415
    .line 1416
    iget-object v8, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 1417
    .line 1418
    move-object v14, v8

    .line 1419
    check-cast v14, Lm9/d;

    .line 1420
    .line 1421
    iget-object v8, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 1422
    .line 1423
    check-cast v8, Lm9/c;

    .line 1424
    .line 1425
    invoke-virtual {v7}, Landroid/app/Activity;->isFinishing()Z

    .line 1426
    .line 1427
    .line 1428
    move-result v9

    .line 1429
    if-nez v9, :cond_34

    .line 1430
    .line 1431
    invoke-virtual {v7}, Landroid/app/Activity;->isDestroyed()Z

    .line 1432
    .line 1433
    .line 1434
    move-result v9

    .line 1435
    if-eqz v9, :cond_30

    .line 1436
    .line 1437
    goto :goto_27

    .line 1438
    :cond_30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1439
    .line 1440
    .line 1441
    if-ne v8, v0, :cond_31

    .line 1442
    .line 1443
    sget-object v9, Lm9/e;->j:Ljava/util/List;

    .line 1444
    .line 1445
    goto :goto_24

    .line 1446
    :cond_31
    sget-object v9, Lm9/e;->i:Ljava/util/List;

    .line 1447
    .line 1448
    :goto_24
    new-instance v10, Ljava/util/ArrayList;

    .line 1449
    .line 1450
    invoke-static {v9}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1451
    .line 1452
    .line 1453
    move-result v11

    .line 1454
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 1455
    .line 1456
    .line 1457
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v9

    .line 1461
    :goto_25
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1462
    .line 1463
    .line 1464
    move-result v11

    .line 1465
    if-eqz v11, :cond_32

    .line 1466
    .line 1467
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v11

    .line 1471
    check-cast v11, Lm9/b;

    .line 1472
    .line 1473
    iget-object v11, v11, Lm9/b;->b:Ljava/lang/String;

    .line 1474
    .line 1475
    new-instance v12, Lsf/e;

    .line 1476
    .line 1477
    invoke-direct {v12, v11, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1478
    .line 1479
    .line 1480
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1481
    .line 1482
    .line 1483
    goto :goto_25

    .line 1484
    :cond_32
    if-ne v8, v0, :cond_33

    .line 1485
    .line 1486
    const-string v0, "\u9009\u62e9\u9ab0\u5b50\u70b9\u6570"

    .line 1487
    .line 1488
    goto :goto_26

    .line 1489
    :cond_33
    const-string v0, "\u9009\u62e9\u731c\u62f3\u7ed3\u679c"

    .line 1490
    .line 1491
    :goto_26
    new-instance v11, Lb0/s;

    .line 1492
    .line 1493
    const/16 v4, 0xb

    .line 1494
    .line 1495
    invoke-direct {v11, v2, v8, v14, v4}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1496
    .line 1497
    .line 1498
    new-instance v12, Li/e0;

    .line 1499
    .line 1500
    invoke-direct {v12, v2, v3}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 1501
    .line 1502
    .line 1503
    sget-object v13, Lwb/lv;->j:Lwb/lv;

    .line 1504
    .line 1505
    const-string v9, ""

    .line 1506
    .line 1507
    move-object v8, v0

    .line 1508
    invoke-static/range {v7 .. v13}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v0

    .line 1512
    invoke-interface {v0}, Lwb/kv;->a()Z

    .line 1513
    .line 1514
    .line 1515
    move-result v0

    .line 1516
    if-nez v0, :cond_35

    .line 1517
    .line 1518
    iget-object v0, v2, Lm9/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1519
    .line 1520
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v2, v14, v5}, Lm9/e;->c(Lm9/d;Lm9/b;)V

    .line 1524
    .line 1525
    .line 1526
    goto :goto_28

    .line 1527
    :cond_34
    :goto_27
    iget-object v0, v2, Lm9/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1528
    .line 1529
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1530
    .line 1531
    .line 1532
    invoke-virtual {v2, v14, v5}, Lm9/e;->c(Lm9/d;Lm9/b;)V

    .line 1533
    .line 1534
    .line 1535
    :cond_35
    :goto_28
    return-void

    .line 1536
    :pswitch_10
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 1537
    .line 1538
    check-cast v0, Landroid/widget/ScrollView;

    .line 1539
    .line 1540
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 1541
    .line 1542
    check-cast v2, Landroid/view/ViewGroup;

    .line 1543
    .line 1544
    iget-object v4, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 1545
    .line 1546
    check-cast v4, Landroid/app/Activity;

    .line 1547
    .line 1548
    iget-object v5, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 1549
    .line 1550
    check-cast v5, Landroid/widget/FrameLayout;

    .line 1551
    .line 1552
    sget-object v7, Lk9/r;->i:Ljava/lang/ref/WeakReference;

    .line 1553
    .line 1554
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v7

    .line 1558
    if-ne v7, v0, :cond_36

    .line 1559
    .line 1560
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v7

    .line 1564
    if-ne v7, v2, :cond_36

    .line 1565
    .line 1566
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v2

    .line 1570
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 1571
    .line 1572
    .line 1573
    const/4 v2, 0x0

    .line 1574
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 1575
    .line 1576
    .line 1577
    const v7, 0x3f6147ae    # 0.88f

    .line 1578
    .line 1579
    .line 1580
    invoke-virtual {v0, v7}, Landroid/view/View;->setScaleX(F)V

    .line 1581
    .line 1582
    .line 1583
    invoke-virtual {v0, v7}, Landroid/view/View;->setScaleY(F)V

    .line 1584
    .line 1585
    .line 1586
    sget-object v7, Lk9/r;->a:Lk9/r;

    .line 1587
    .line 1588
    invoke-static {v4, v3}, Lk9/r;->f(Landroid/content/Context;I)I

    .line 1589
    .line 1590
    .line 1591
    move-result v3

    .line 1592
    int-to-float v3, v3

    .line 1593
    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationY(F)V

    .line 1594
    .line 1595
    .line 1596
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 1600
    .line 1601
    .line 1602
    invoke-virtual {v5}, Landroid/view/View;->bringToFront()V

    .line 1603
    .line 1604
    .line 1605
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v0

    .line 1609
    const/high16 v3, 0x3f800000    # 1.0f

    .line 1610
    .line 1611
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v0

    .line 1615
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v0

    .line 1619
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v0

    .line 1623
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v0

    .line 1627
    const-wide/16 v2, 0xb4

    .line 1628
    .line 1629
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0

    .line 1633
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 1634
    .line 1635
    .line 1636
    :cond_36
    return-void

    .line 1637
    :pswitch_11
    iget-object v0, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 1638
    .line 1639
    check-cast v0, Ljava/lang/String;

    .line 1640
    .line 1641
    iget-object v2, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 1642
    .line 1643
    check-cast v2, Lk8/f;

    .line 1644
    .line 1645
    iget-object v3, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 1646
    .line 1647
    check-cast v3, Lf8/c;

    .line 1648
    .line 1649
    iget-object v4, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 1650
    .line 1651
    check-cast v4, Lf8/g;

    .line 1652
    .line 1653
    sget-object v5, Lk8/g;->t:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1654
    .line 1655
    invoke-virtual {v5, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v7

    .line 1659
    check-cast v7, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1660
    .line 1661
    if-nez v7, :cond_37

    .line 1662
    .line 1663
    goto :goto_29

    .line 1664
    :cond_37
    invoke-virtual {v7, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 1665
    .line 1666
    .line 1667
    move-result v6

    .line 1668
    invoke-virtual {v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 1669
    .line 1670
    .line 1671
    move-result v2

    .line 1672
    if-eqz v2, :cond_38

    .line 1673
    .line 1674
    invoke-virtual {v5, v0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1675
    .line 1676
    .line 1677
    :cond_38
    :goto_29
    if-nez v6, :cond_39

    .line 1678
    .line 1679
    goto :goto_2a

    .line 1680
    :cond_39
    :try_start_b
    invoke-virtual {v3, v4}, Lf8/c;->b(Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 1681
    .line 1682
    .line 1683
    :catchall_8
    :goto_2a
    return-void

    .line 1684
    :pswitch_12
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 1685
    .line 1686
    move-object v2, v0

    .line 1687
    check-cast v2, Lj8/y;

    .line 1688
    .line 1689
    iget-object v0, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 1690
    .line 1691
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1692
    .line 1693
    iget-object v3, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 1694
    .line 1695
    check-cast v3, Lj8/w;

    .line 1696
    .line 1697
    iget-object v4, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 1698
    .line 1699
    check-cast v4, Ljava/util/concurrent/CountDownLatch;

    .line 1700
    .line 1701
    const-string v5, "\u8bed\u97f3\u4e3b\u7ebf\u7a0b\u4efb\u52a1\u6267\u884c\u5f02\u5e38: "

    .line 1702
    .line 1703
    :try_start_c
    invoke-interface {v3}, Lj8/w;->run()Z

    .line 1704
    .line 1705
    .line 1706
    move-result v3

    .line 1707
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v3

    .line 1711
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 1712
    .line 1713
    .line 1714
    :goto_2b
    invoke-virtual {v4}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1715
    .line 1716
    .line 1717
    goto :goto_2c

    .line 1718
    :catchall_9
    move-exception v0

    .line 1719
    :try_start_d
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1720
    .line 1721
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1722
    .line 1723
    .line 1724
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v0

    .line 1728
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1729
    .line 1730
    .line 1731
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v0

    .line 1735
    invoke-virtual {v2, v0}, Lj8/y;->m(Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    .line 1736
    .line 1737
    .line 1738
    goto :goto_2b

    .line 1739
    :goto_2c
    return-void

    .line 1740
    :catchall_a
    move-exception v0

    .line 1741
    invoke-virtual {v4}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1742
    .line 1743
    .line 1744
    throw v0

    .line 1745
    :pswitch_13
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 1746
    .line 1747
    check-cast v0, Lj8/h;

    .line 1748
    .line 1749
    iget-object v2, v0, Lj8/h;->l:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 1750
    .line 1751
    iget-object v3, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 1752
    .line 1753
    check-cast v3, Ljava/lang/String;

    .line 1754
    .line 1755
    iget-object v4, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 1756
    .line 1757
    iget-object v5, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 1758
    .line 1759
    check-cast v5, Ljava/lang/String;

    .line 1760
    .line 1761
    :goto_2d
    const/16 v7, 0x78

    .line 1762
    .line 1763
    if-ge v6, v7, :cond_3c

    .line 1764
    .line 1765
    const-wide/16 v7, 0x1f4

    .line 1766
    .line 1767
    :try_start_e
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V

    .line 1768
    .line 1769
    .line 1770
    invoke-virtual {v0, v4}, Lj8/h;->y(Ljava/lang/Object;)Lj8/c;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v7

    .line 1774
    if-eqz v7, :cond_3b

    .line 1775
    .line 1776
    invoke-virtual {v0, v5, v7}, Lj8/h;->B(Ljava/lang/String;Lj8/c;)Z

    .line 1777
    .line 1778
    .line 1779
    move-result v0

    .line 1780
    if-nez v0, :cond_3a

    .line 1781
    .line 1782
    const-string v0, "\u53d1\u9001\u6536\u85cf\u8bed\u97f3\u5931\u8d25: \u4e0b\u8f7d\u5b8c\u6210\u540e\u8bed\u97f3\u53d1\u9001\u672a\u6210\u529f"

    .line 1783
    .line 1784
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    .line 1785
    .line 1786
    .line 1787
    goto :goto_2e

    .line 1788
    :catchall_b
    move-exception v0

    .line 1789
    goto :goto_30

    .line 1790
    :cond_3a
    :goto_2e
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 1791
    .line 1792
    .line 1793
    goto :goto_2f

    .line 1794
    :cond_3b
    add-int/lit8 v6, v6, 0x1

    .line 1795
    .line 1796
    goto :goto_2d

    .line 1797
    :cond_3c
    :try_start_f
    const-string v0, "\u53d1\u9001\u6536\u85cf\u8bed\u97f3\u5931\u8d25: \u7b49\u5f85\u6536\u85cf\u8bed\u97f3\u4e0b\u8f7d\u8d85\u65f6"

    .line 1798
    .line 1799
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    .line 1800
    .line 1801
    .line 1802
    goto :goto_2e

    .line 1803
    :goto_2f
    return-void

    .line 1804
    :goto_30
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 1805
    .line 1806
    .line 1807
    throw v0

    .line 1808
    :pswitch_14
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 1809
    .line 1810
    check-cast v0, Landroid/app/Activity;

    .line 1811
    .line 1812
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 1813
    .line 1814
    check-cast v2, Lia/a0;

    .line 1815
    .line 1816
    iget-object v3, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 1817
    .line 1818
    check-cast v3, Landroid/view/View;

    .line 1819
    .line 1820
    iget-object v4, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 1821
    .line 1822
    check-cast v4, Landroid/view/View;

    .line 1823
    .line 1824
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 1825
    .line 1826
    .line 1827
    move-result v5

    .line 1828
    if-nez v5, :cond_41

    .line 1829
    .line 1830
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 1831
    .line 1832
    .line 1833
    move-result v0

    .line 1834
    if-eqz v0, :cond_3d

    .line 1835
    .line 1836
    goto :goto_33

    .line 1837
    :cond_3d
    :goto_31
    instance-of v0, v3, Landroid/view/View;

    .line 1838
    .line 1839
    if-eqz v0, :cond_40

    .line 1840
    .line 1841
    move-object v0, v3

    .line 1842
    check-cast v0, Landroid/view/View;

    .line 1843
    .line 1844
    invoke-virtual {v2, v0}, Lia/a0;->l(Landroid/view/View;)Z

    .line 1845
    .line 1846
    .line 1847
    move-result v5

    .line 1848
    if-eqz v5, :cond_3e

    .line 1849
    .line 1850
    goto :goto_32

    .line 1851
    :cond_3e
    instance-of v5, v3, Landroid/widget/AbsListView;

    .line 1852
    .line 1853
    if-eqz v5, :cond_3f

    .line 1854
    .line 1855
    check-cast v3, Landroid/widget/AbsListView;

    .line 1856
    .line 1857
    invoke-virtual {v3}, Landroid/widget/AbsListView;->invalidateViews()V

    .line 1858
    .line 1859
    .line 1860
    goto :goto_32

    .line 1861
    :cond_3f
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v3

    .line 1865
    goto :goto_31

    .line 1866
    :cond_40
    invoke-virtual {v2, v4}, Lia/a0;->k(Landroid/view/View;)V

    .line 1867
    .line 1868
    .line 1869
    :goto_32
    invoke-virtual {v4}, Landroid/view/View;->requestLayout()V

    .line 1870
    .line 1871
    .line 1872
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 1873
    .line 1874
    .line 1875
    :cond_41
    :goto_33
    return-void

    .line 1876
    :pswitch_15
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 1877
    .line 1878
    check-cast v0, Lwb/kv;

    .line 1879
    .line 1880
    iget-object v3, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 1881
    .line 1882
    check-cast v3, Landroid/app/Activity;

    .line 1883
    .line 1884
    iget-object v4, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 1885
    .line 1886
    check-cast v4, Lc9/u;

    .line 1887
    .line 1888
    iget-object v5, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 1889
    .line 1890
    check-cast v5, Ljava/util/List;

    .line 1891
    .line 1892
    invoke-interface {v0}, Lwb/kv;->close()V

    .line 1893
    .line 1894
    .line 1895
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v0

    .line 1899
    if-eqz v0, :cond_42

    .line 1900
    .line 1901
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v0

    .line 1905
    if-eqz v0, :cond_42

    .line 1906
    .line 1907
    new-instance v6, Lac/l;

    .line 1908
    .line 1909
    invoke-direct {v6, v3, v4, v5, v2}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1910
    .line 1911
    .line 1912
    invoke-virtual {v0, v6}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1913
    .line 1914
    .line 1915
    :cond_42
    return-void

    .line 1916
    :pswitch_16
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 1917
    .line 1918
    check-cast v0, Lhb/k;

    .line 1919
    .line 1920
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 1921
    .line 1922
    iget-object v3, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 1923
    .line 1924
    check-cast v3, Lhb/j;

    .line 1925
    .line 1926
    iget-object v4, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 1927
    .line 1928
    check-cast v4, Lhb/i;

    .line 1929
    .line 1930
    iget-object v7, v0, Lhb/k;->h:Ljava/lang/Object;

    .line 1931
    .line 1932
    if-ne v7, v2, :cond_43

    .line 1933
    .line 1934
    iget-object v2, v0, Lhb/k;->b:Lab/b;

    .line 1935
    .line 1936
    iget-object v3, v3, Lhb/j;->a:Lhb/t;

    .line 1937
    .line 1938
    iget v3, v3, Lhb/t;->b:I

    .line 1939
    .line 1940
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1941
    .line 1942
    const-string v8, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u7b49\u5f85\u53d1\u9001\u5b8c\u6210\u8d85\u65f6: type="

    .line 1943
    .line 1944
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1945
    .line 1946
    .line 1947
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1948
    .line 1949
    .line 1950
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v3

    .line 1954
    invoke-virtual {v2, v3, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1955
    .line 1956
    .line 1957
    iput-object v5, v0, Lhb/k;->h:Ljava/lang/Object;

    .line 1958
    .line 1959
    invoke-virtual {v0, v4, v6}, Lhb/k;->a(Lhb/i;Z)V

    .line 1960
    .line 1961
    .line 1962
    :cond_43
    return-void

    .line 1963
    :pswitch_17
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 1964
    .line 1965
    check-cast v0, Landroid/app/Activity;

    .line 1966
    .line 1967
    iget-object v2, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 1968
    .line 1969
    check-cast v2, Ljava/lang/String;

    .line 1970
    .line 1971
    iget-object v3, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 1972
    .line 1973
    iget-object v5, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 1974
    .line 1975
    check-cast v5, Landroid/content/Context;

    .line 1976
    .line 1977
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 1978
    .line 1979
    .line 1980
    move-result v6

    .line 1981
    if-nez v6, :cond_45

    .line 1982
    .line 1983
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 1984
    .line 1985
    .line 1986
    move-result v6

    .line 1987
    if-nez v6, :cond_45

    .line 1988
    .line 1989
    sget-object v6, Lc9/j1;->a:Lc9/j1;

    .line 1990
    .line 1991
    if-nez v2, :cond_44

    .line 1992
    .line 1993
    goto :goto_34

    .line 1994
    :cond_44
    move-object v4, v2

    .line 1995
    :goto_34
    new-instance v2, Lab/e;

    .line 1996
    .line 1997
    const/4 v6, 0x4

    .line 1998
    invoke-direct {v2, v0, v3, v5, v6}, Lab/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1999
    .line 2000
    .line 2001
    invoke-static {v0, v4, v2}, Lc9/j1;->v(Landroid/app/Activity;Ljava/lang/String;Lfg/a;)V

    .line 2002
    .line 2003
    .line 2004
    :cond_45
    return-void

    .line 2005
    :pswitch_18
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 2006
    .line 2007
    check-cast v0, Lwb/kv;

    .line 2008
    .line 2009
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 2010
    .line 2011
    check-cast v2, Landroid/app/Activity;

    .line 2012
    .line 2013
    iget-object v3, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 2014
    .line 2015
    check-cast v3, Lfg/l;

    .line 2016
    .line 2017
    iget-object v4, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 2018
    .line 2019
    check-cast v4, Lc9/y;

    .line 2020
    .line 2021
    invoke-interface {v0}, Lwb/kv;->close()V

    .line 2022
    .line 2023
    .line 2024
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 2025
    .line 2026
    .line 2027
    move-result v0

    .line 2028
    if-nez v0, :cond_46

    .line 2029
    .line 2030
    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    .line 2031
    .line 2032
    .line 2033
    move-result v0

    .line 2034
    if-nez v0, :cond_46

    .line 2035
    .line 2036
    invoke-interface {v3, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2037
    .line 2038
    .line 2039
    :cond_46
    return-void

    .line 2040
    :pswitch_19
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 2041
    .line 2042
    check-cast v0, Lbb/k;

    .line 2043
    .line 2044
    iget-object v2, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 2045
    .line 2046
    check-cast v2, Ljava/lang/String;

    .line 2047
    .line 2048
    iget-object v3, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 2049
    .line 2050
    check-cast v3, Ljava/lang/String;

    .line 2051
    .line 2052
    iget-object v4, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 2053
    .line 2054
    check-cast v4, Ljava/lang/String;

    .line 2055
    .line 2056
    iget-object v5, v0, Lbb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2057
    .line 2058
    invoke-virtual {v5, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2059
    .line 2060
    .line 2061
    iget-object v2, v0, Lbb/k;->a:Lbb/l;

    .line 2062
    .line 2063
    invoke-virtual {v2, v3}, Lbb/l;->e(Ljava/lang/String;)Z

    .line 2064
    .line 2065
    .line 2066
    move-result v2

    .line 2067
    if-nez v2, :cond_47

    .line 2068
    .line 2069
    invoke-virtual {v0, v4, v3}, Lbb/k;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2070
    .line 2071
    .line 2072
    :cond_47
    return-void

    .line 2073
    :pswitch_1a
    iget-object v0, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 2074
    .line 2075
    check-cast v0, Lbb/g;

    .line 2076
    .line 2077
    iget-object v2, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 2078
    .line 2079
    check-cast v2, Landroid/widget/TextView;

    .line 2080
    .line 2081
    iget-object v3, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 2082
    .line 2083
    check-cast v3, Ljava/lang/String;

    .line 2084
    .line 2085
    iget-object v4, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 2086
    .line 2087
    check-cast v4, Ljava/lang/String;

    .line 2088
    .line 2089
    iget-object v5, v0, Lbb/g;->g:Ljava/util/Map;

    .line 2090
    .line 2091
    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v5

    .line 2095
    invoke-static {v5, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2096
    .line 2097
    .line 2098
    move-result v5

    .line 2099
    if-eqz v5, :cond_48

    .line 2100
    .line 2101
    invoke-virtual {v0, v2, v3, v4}, Lbb/g;->c(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)Z

    .line 2102
    .line 2103
    .line 2104
    iget-object v3, v0, Lbb/g;->c:Lib/b;

    .line 2105
    .line 2106
    iget-object v3, v3, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 2107
    .line 2108
    const-string v4, "enable"

    .line 2109
    .line 2110
    invoke-interface {v3, v4, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 2111
    .line 2112
    .line 2113
    move-result v3

    .line 2114
    if-eqz v3, :cond_48

    .line 2115
    .line 2116
    invoke-virtual {v0, v2}, Lbb/g;->b(Landroid/widget/TextView;)V

    .line 2117
    .line 2118
    .line 2119
    :cond_48
    return-void

    .line 2120
    :pswitch_1b
    iget-object v0, v1, Lb9/c;->h:Ljava/lang/Object;

    .line 2121
    .line 2122
    check-cast v0, Landroid/widget/TextView;

    .line 2123
    .line 2124
    iget-object v2, v1, Lb9/c;->j:Ljava/lang/Object;

    .line 2125
    .line 2126
    check-cast v2, Lb9/f;

    .line 2127
    .line 2128
    iget-object v3, v1, Lb9/c;->k:Ljava/lang/Object;

    .line 2129
    .line 2130
    check-cast v3, Lb9/d;

    .line 2131
    .line 2132
    iget-object v4, v1, Lb9/c;->i:Ljava/lang/Object;

    .line 2133
    .line 2134
    check-cast v4, Ljava/lang/String;

    .line 2135
    .line 2136
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v5

    .line 2140
    if-eqz v5, :cond_49

    .line 2141
    .line 2142
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2143
    .line 2144
    .line 2145
    invoke-virtual {v2, v0, v3, v4}, Lb9/f;->a(Landroid/widget/TextView;Lb9/d;Ljava/lang/String;)V

    .line 2146
    .line 2147
    .line 2148
    :cond_49
    return-void

    .line 2149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
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
