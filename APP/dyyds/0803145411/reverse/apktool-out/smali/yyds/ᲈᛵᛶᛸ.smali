.class public final synthetic Lyyds/ᲈᛵᛶᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lyyds/ᲈᛵᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲈᛵᛶᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᲈᛵᛶᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᲈᛵᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lyyds/ᲈᛵᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 7
    .line 8
    iget-object v5, p0, Lyyds/ᲈᛵᛶᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, p0, Lyyds/ᲈᛵᛶᛸ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Lyyds/ᲈᛵᛶᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Landroid/content/res/AssetManager;

    .line 18
    .line 19
    check-cast v6, Ljava/lang/String;

    .line 20
    .line 21
    check-cast v5, Landroid/content/res/Resources;

    .line 22
    .line 23
    const-wide v7, -0x2a6c0e68a836eL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-class v4, Ljava/lang/String;

    .line 33
    .line 34
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const-class v7, Landroid/content/res/AssetManager;

    .line 39
    .line 40
    invoke-virtual {v7, v0, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 45
    .line 46
    .line 47
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    instance-of v0, p0, Ljava/lang/Integer;

    .line 56
    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    check-cast p0, Ljava/lang/Integer;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move-object p0, v3

    .line 63
    :goto_0
    if-eqz p0, :cond_1

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move p0, v1

    .line 71
    :goto_1
    if-eqz p0, :cond_3

    .line 72
    .line 73
    const p0, 0x660c005f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const-wide v2, -0x2a6ece68a836eL

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {p0, v0, v1}, Lyyds/ᛳᲀᲈᛷ;->ᲀᛲᛲᲇ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    new-instance v0, Landroid/content/res/Resources$NotFoundException;

    .line 99
    .line 100
    const-wide v1, -0x2a70ae68a836eL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-direct {v0, p0}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0

    .line 117
    :cond_3
    const-wide v0, -0x2a6cde68a836eL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :goto_2
    return-object v3

    .line 130
    :pswitch_0
    check-cast p0, Lyyds/ᲀᲈᛶᲈ;

    .line 131
    .line 132
    check-cast v6, Lcom/ss/android/ugc/aweme/profile/model/User;

    .line 133
    .line 134
    check-cast v5, Lyyds/ᛳᛷᲀᛴ;

    .line 135
    .line 136
    iget-object v0, v6, Lcom/ss/android/ugc/aweme/profile/model/User;->uid:Ljava/lang/String;

    .line 137
    .line 138
    if-nez v0, :cond_4

    .line 139
    .line 140
    const-wide v0, -0x338b4e68a836eL

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :cond_4
    const-wide v1, -0x338b7e68a836eL

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {p0, v0, v1}, Lyyds/ᲀᲈᛶᲈ;->ᛳᛸᛴᛶ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    iget-object v0, v5, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Landroid/widget/TextView;

    .line 165
    .line 166
    if-eqz p0, :cond_5

    .line 167
    .line 168
    const-wide v1, -0x338bae68a836eL

    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_5
    const-wide v1, -0x338c1e68a836eL

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 191
    .line 192
    .line 193
    :goto_3
    return-object v4

    .line 194
    :pswitch_1
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 195
    .line 196
    check-cast v6, Ljava/lang/ref/WeakReference;

    .line 197
    .line 198
    check-cast v5, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    check-cast p0, Landroid/view/View;

    .line 205
    .line 206
    if-eqz p0, :cond_7

    .line 207
    .line 208
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    instance-of v7, v0, Landroid/view/ViewGroup;

    .line 213
    .line 214
    if-eqz v7, :cond_6

    .line 215
    .line 216
    check-cast v0, Landroid/view/ViewGroup;

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_6
    move-object v0, v3

    .line 220
    :goto_4
    if-eqz v0, :cond_7

    .line 221
    .line 222
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 223
    .line 224
    .line 225
    :cond_7
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    check-cast p0, Landroid/widget/LinearLayout;

    .line 230
    .line 231
    if-eqz p0, :cond_9

    .line 232
    .line 233
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    instance-of v6, v0, Landroid/view/ViewGroup;

    .line 238
    .line 239
    if-eqz v6, :cond_8

    .line 240
    .line 241
    move-object v3, v0

    .line 242
    check-cast v3, Landroid/view/ViewGroup;

    .line 243
    .line 244
    :cond_8
    if-eqz v3, :cond_9

    .line 245
    .line 246
    invoke-virtual {v3, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 247
    .line 248
    .line 249
    :cond_9
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    :cond_a
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-eqz v0, :cond_b

    .line 258
    .line 259
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Lkotlin/Pair;

    .line 264
    .line 265
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 270
    .line 271
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    check-cast v0, [I

    .line 276
    .line 277
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    check-cast v3, Landroid/widget/LinearLayout;

    .line 282
    .line 283
    if-eqz v3, :cond_a

    .line 284
    .line 285
    aget v5, v0, v1

    .line 286
    .line 287
    aget v6, v0, v2

    .line 288
    .line 289
    const/4 v7, 0x2

    .line 290
    aget v7, v0, v7

    .line 291
    .line 292
    const/4 v8, 0x3

    .line 293
    aget v0, v0, v8

    .line 294
    .line 295
    invoke-virtual {v3, v5, v6, v7, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 296
    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_b
    return-object v4

    .line 300
    :pswitch_2
    check-cast p0, Lyyds/ᲈᲈᛴᲀ;

    .line 301
    .line 302
    check-cast v6, Landroid/content/Context;

    .line 303
    .line 304
    check-cast v5, Ljava/lang/String;

    .line 305
    .line 306
    invoke-static {p0, v6, v5}, Lyyds/ᛸᛵᛵᲀ;->ᲇᲇᲇᛱ(Lyyds/ᲈᲈᛴᲀ;Landroid/content/Context;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    return-object v4

    .line 310
    :pswitch_3
    check-cast p0, Lyyds/ᲈᲈᛴᲀ;

    .line 311
    .line 312
    check-cast v6, Landroid/content/Context;

    .line 313
    .line 314
    check-cast v5, Ljava/lang/String;

    .line 315
    .line 316
    invoke-static {p0, v6, v5}, Lyyds/ᲇᛳᛵᛱ;->ᛱᛳᛶᛳ(Lyyds/ᲈᲈᛴᲀ;Landroid/content/Context;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    return-object v4

    .line 320
    :pswitch_4
    check-cast p0, Lyyds/ᲁᲁᲈᛵ;

    .line 321
    .line 322
    check-cast v6, Lyyds/ᲀᲈᛴᛴ;

    .line 323
    .line 324
    check-cast v5, Lyyds/ᛷᛸᲇᛴ;

    .line 325
    .line 326
    iget-object p0, p0, Lyyds/ᲁᲁᲈᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛷᲈᛲ;

    .line 327
    .line 328
    invoke-virtual {v6}, Lyyds/ᲀᲈᛴᛴ;->ᛲᲈᲁ()Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    iget-object v1, v5, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 333
    .line 334
    iget-object v1, v1, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 335
    .line 336
    invoke-virtual {p0, v1, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛲᛴᛳᛲ(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    return-object p0

    .line 341
    :pswitch_5
    check-cast p0, Landroid/app/Activity;

    .line 342
    .line 343
    check-cast v6, Lyyds/ᛱᛷᛸᲈ;

    .line 344
    .line 345
    check-cast v5, Landroid/app/AlertDialog;

    .line 346
    .line 347
    sget-object v0, Lyyds/ᲈᛲᛴᛸ;->ᛲᲈᲁ:Lyyds/ᛱᛲᛶᛱ;

    .line 348
    .line 349
    const-wide v0, -0xbc79e68a836eL

    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-static {p0, v0}, Lyyds/ᲈᛲᛴᛸ;->ᛲᲈᲁ(Landroid/content/Context;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    sget-object p0, Lyyds/ᛱᛷᲀᲈ;->ᛲᲈᲁ:Lyyds/ᛱᛷᲀᲈ;

    .line 362
    .line 363
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    invoke-static {}, Lyyds/ᛱᛷᲀᲈ;->ᛵᛸᛸᛷ()V

    .line 367
    .line 368
    .line 369
    iget-object p0, v6, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast p0, Lyyds/ᲈᲇᲈᲇ;

    .line 372
    .line 373
    if-eqz p0, :cond_c

    .line 374
    .line 375
    invoke-interface {p0, v3}, Lyyds/ᲈᲇᲈᲇ;->ᛵᲀᲈᛴ(Ljava/util/concurrent/CancellationException;)V

    .line 376
    .line 377
    .line 378
    :cond_c
    invoke-virtual {v5}, Landroid/app/Dialog;->dismiss()V

    .line 379
    .line 380
    .line 381
    invoke-static {}, Lyyds/ᲀᛸ;->ᛲᲈᲁ()Lcom/tencent/mmkv/MMKV;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    const-wide v0, -0xbc80e68a836eL

    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {p0, v0, v2}, Lcom/tencent/mmkv/MMKV;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 395
    .line 396
    .line 397
    return-object v4

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
