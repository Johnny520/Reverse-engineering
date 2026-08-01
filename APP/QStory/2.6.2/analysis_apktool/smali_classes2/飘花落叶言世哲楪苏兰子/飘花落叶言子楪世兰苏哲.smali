.class public final L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 7
    iput p2, p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    invoke-direct {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;I)V
    .locals 0

    .line 8
    iput p2, p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9

    .line 1
    iget v0, p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-class v2, Landroid/view/ViewGroup;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    array-length v0, p1

    .line 37
    move v6, v3

    .line 38
    :goto_0
    if-ge v6, v0, :cond_1

    .line 39
    .line 40
    aget-object v7, p1, v6

    .line 41
    .line 42
    invoke-virtual {v7, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    if-ne v8, v2, :cond_0

    .line 50
    .line 51
    move-object v5, v7

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    :goto_1
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Landroid/view/ViewGroup;

    .line 61
    .line 62
    move p1, v3

    .line 63
    :goto_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-ge p1, v0, :cond_3

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    instance-of v2, v0, Landroid/widget/FrameLayout;

    .line 74
    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    check-cast v0, Landroid/widget/FrameLayout;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-ne v2, v4, :cond_2

    .line 84
    .line 85
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    instance-of v5, v2, Landroid/widget/FrameLayout;

    .line 90
    .line 91
    if-eqz v5, :cond_2

    .line 92
    .line 93
    check-cast v2, Landroid/widget/FrameLayout;

    .line 94
    .line 95
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-ne v5, v1, :cond_2

    .line 100
    .line 101
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    instance-of v2, v2, Landroid/widget/ImageView;

    .line 106
    .line 107
    if-eqz v2, :cond_2

    .line 108
    .line 109
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    :goto_3
    return-void

    .line 117
    :pswitch_2
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    array-length v0, p1

    .line 138
    move v1, v3

    .line 139
    :goto_4
    if-ge v1, v0, :cond_5

    .line 140
    .line 141
    aget-object v6, p1, v1

    .line 142
    .line 143
    invoke-virtual {v6, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    if-ne v7, v2, :cond_4

    .line 151
    .line 152
    move-object v5, v6

    .line 153
    goto :goto_5

    .line 154
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_5
    :goto_5
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    check-cast p0, Landroid/view/ViewGroup;

    .line 162
    .line 163
    move p1, v3

    .line 164
    :goto_6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-ge p1, v0, :cond_7

    .line 169
    .line 170
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    instance-of v1, v0, Landroid/widget/FrameLayout;

    .line 175
    .line 176
    if-eqz v1, :cond_6

    .line 177
    .line 178
    check-cast v0, Landroid/widget/FrameLayout;

    .line 179
    .line 180
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-ne v1, v4, :cond_6

    .line 185
    .line 186
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    instance-of v1, v1, Landroid/widget/ImageView;

    .line 191
    .line 192
    if-eqz v1, :cond_6

    .line 193
    .line 194
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 195
    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_6
    add-int/lit8 p1, p1, 0x1

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_7
    :goto_7
    return-void

    .line 202
    :pswitch_3
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 203
    .line 204
    const-wide v2, -0x36a51e24051405a7L    # -2.3979779794682572E45

    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v5, v0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v5, v0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, Landroid/widget/EditText;

    .line 226
    .line 227
    const-wide v2, -0x36a51e26051405a7L    # -2.397975257209322E45

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-static {v5, v2, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    check-cast p1, Landroid/view/View;

    .line 241
    .line 242
    new-instance v2, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲苏楪兰;

    .line 243
    .line 244
    invoke-direct {v2, p0, v0, v1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲苏楪兰;-><init>(Ljava/lang/Object;Landroid/widget/EditText;I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :pswitch_4
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 252
    .line 253
    const-wide v0, -0x36a50b93051405a7L    # -2.404447427828158E45

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-static {p1, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    sput-object p1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 271
    .line 272
    const-wide v0, -0x36a5226f051405a7L    # -2.3964820981832728E45

    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-static {v0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    sput-object p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 298
    .line 299
    return-void

    .line 300
    :pswitch_5
    sget-object p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/Stack;

    .line 301
    .line 302
    invoke-virtual {p0}, Ljava/util/Stack;->empty()Z

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    if-nez p1, :cond_8

    .line 307
    .line 308
    invoke-virtual {p0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    :cond_8
    invoke-virtual {p0}, Ljava/util/Stack;->empty()Z

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    if-nez p1, :cond_9

    .line 316
    .line 317
    invoke-virtual {p0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    sput-object p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 322
    .line 323
    :cond_9
    return-void

    .line 324
    :pswitch_6
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 325
    .line 326
    const-wide v0, -0x36a522c9051405a7L    # -2.3963595965311812E45

    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    invoke-static {p1, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    const-wide v0, -0x36a522af051405a7L    # -2.396394985897341E45

    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    invoke-static {p1, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    const-wide v0, -0x36a5228f051405a7L    # -2.396438542040307E45

    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    invoke-static {p1, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object p0

    .line 377
    sget-object p1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/Stack;

    .line 378
    .line 379
    invoke-virtual {p1, p0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    sput-object p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 383
    .line 384
    return-void

    .line 385
    :pswitch_7
    sget-object p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 386
    .line 387
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 388
    .line 389
    .line 390
    move-result-object p0

    .line 391
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 392
    .line 393
    .line 394
    move-result p1

    .line 395
    if-eqz p1, :cond_a

    .line 396
    .line 397
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    check-cast p1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰哲苏;

    .line 402
    .line 403
    invoke-interface {p1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰哲苏;->hide()V

    .line 404
    .line 405
    .line 406
    goto :goto_8

    .line 407
    :cond_a
    return-void

    .line 408
    :pswitch_8
    sget-object p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 409
    .line 410
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result p1

    .line 418
    if-eqz p1, :cond_b

    .line 419
    .line 420
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    check-cast p1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰哲苏;

    .line 425
    .line 426
    invoke-interface {p1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰哲苏;->show()V

    .line 427
    .line 428
    .line 429
    goto :goto_9

    .line 430
    :cond_b
    return-void

    .line 431
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 6
    .line 7
    const v4, 0x9a2103

    .line 8
    .line 9
    .line 10
    const-class v5, Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    const/4 v8, 0x3

    .line 13
    const-wide v9, -0x36a593d2051405a7L    # -2.3569725931248164E45

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const v11, 0x9a2102

    .line 19
    .line 20
    .line 21
    const-wide v12, -0x36a59389051405a7L    # -2.3570719555759574E45

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    const-class v15, Ljava/lang/String;

    .line 29
    .line 30
    const/16 v16, 0x2

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    const-wide v17, -0x36a582e4051405a7L    # -2.3628717282377578E45

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    const-wide v19, -0x36a59380051405a7L    # -2.3570842057411665E45

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    packed-switch v2, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_1
    invoke-static/range {v17 .. v18}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 58
    .line 59
    aget-object v0, v0, v6

    .line 60
    .line 61
    invoke-static {v12, v13}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    check-cast v0, Landroid/view/View;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-ne v0, v11, :cond_0

    .line 78
    .line 79
    invoke-static {v1}, Llin/xposed/hook/javaplugin/JavaPluginLoad;->showPluginDialog(Landroid/content/Context;)V

    .line 80
    .line 81
    .line 82
    :cond_0
    return-void

    .line 83
    :pswitch_2
    invoke-static/range {v17 .. v18}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 90
    .line 91
    aget-object v0, v0, v3

    .line 92
    .line 93
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    check-cast v0, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    filled-new-array {v14, v15, v15, v14}, [Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    const-wide v6, -0x36a50e8e051405a7L    # -2.4034088860443154E45

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    const-wide v9, -0x36a59340051405a7L    # -2.3571713180270983E45

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    filled-new-array {v4, v6, v7, v8}, [Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-static {v4, v2, v1}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世兰楪苏哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    sget-object v2, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 148
    .line 149
    const v4, 0x24080168

    .line 150
    .line 151
    .line 152
    invoke-static {v2, v4}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static/range {v19 .. v20}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-static {v1, v4, v5, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :pswitch_3
    invoke-static/range {v17 .. v18}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 177
    .line 178
    aget-object v0, v0, v6

    .line 179
    .line 180
    invoke-static {v12, v13}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    check-cast v0, Landroid/view/View;

    .line 187
    .line 188
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-ne v0, v4, :cond_1

    .line 197
    .line 198
    new-instance v0, Landroid/content/Intent;

    .line 199
    .line 200
    const-class v2, Ltop/suzhelan/qstory/ui/activity/SettingActivity;

    .line 201
    .line 202
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 206
    .line 207
    .line 208
    :cond_1
    return-void

    .line 209
    :pswitch_4
    invoke-static/range {v17 .. v18}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 216
    .line 217
    aget-object v0, v0, v3

    .line 218
    .line 219
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    check-cast v0, Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    filled-new-array {v14, v15, v15, v14}, [Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    const-wide v9, -0x36a515e0051405a7L    # -2.400858129421876E45

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    const-wide v9, -0x36a5939f051405a7L    # -2.3570420107276683E45

    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    filled-new-array {v3, v4, v7, v8}, [Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-static {v3, v2, v1}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世兰楪苏哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    sget-object v2, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 274
    .line 275
    const/high16 v3, 0x240f0000

    .line 276
    .line 277
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-static/range {v19 .. v20}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    invoke-static {v1, v3, v5, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v6, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :pswitch_5
    const/4 v0, 0x0

    .line 296
    invoke-virtual {v1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :pswitch_6
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 301
    .line 302
    aget-object v0, v0, v16

    .line 303
    .line 304
    check-cast v0, Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-eqz v0, :cond_4

    .line 315
    .line 316
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    const-wide v2, -0x36a51930051405a7L    # -2.3997038916332802E45

    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    const-wide v3, -0x36a5144f051405a7L    # -2.4014039423384172E45

    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-static {v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    invoke-static {v3, v2, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    if-nez v0, :cond_3

    .line 347
    .line 348
    goto :goto_0

    .line 349
    :cond_3
    const-wide v2, -0x36a5193b051405a7L    # -2.3996889192091357E45

    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 359
    .line 360
    invoke-static {v3, v2, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    check-cast v2, Ljava/lang/Boolean;

    .line 365
    .line 366
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    const-wide v3, -0x36a5192c051405a7L    # -2.399709336151151E45

    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-static {v15, v3, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    check-cast v0, Ljava/lang/String;

    .line 384
    .line 385
    if-eqz v2, :cond_2

    .line 386
    .line 387
    if-eqz v0, :cond_2

    .line 388
    .line 389
    const-wide v2, -0x36a50776051405a7L    # -2.405880697157629E45

    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    :try_start_0
    new-instance v3, Landroid/media/ExifInterface;

    .line 403
    .line 404
    invoke-direct {v3, v0}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    const-wide v5, -0x36a5190b051405a7L    # -2.3997542534235845E45

    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {v3, v0, v4}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    const-wide v5, -0x36a518f8051405a7L    # -2.3997801148834705E45

    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-virtual {v3, v0, v2}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    const-wide v5, -0x36a518ec051405a7L    # -2.3997964484370827E45

    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-virtual {v3, v0, v4}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    const-wide v4, -0x36a518e9051405a7L    # -2.3998005318254858E45

    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-virtual {v3, v0, v2}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v3}, Landroid/media/ExifInterface;->saveAttributes()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 456
    .line 457
    .line 458
    goto/16 :goto_0

    .line 459
    .line 460
    :catch_0
    move-exception v0

    .line 461
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Exception;)V

    .line 462
    .line 463
    .line 464
    const-wide v2, -0x36a518d7051405a7L    # -2.399825032155904E45

    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    const-wide v3, -0x36a518dc051405a7L    # -2.3998182265085657E45

    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v3

    .line 482
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 483
    .line 484
    .line 485
    goto/16 :goto_0

    .line 486
    .line 487
    :cond_4
    return-void

    .line 488
    :pswitch_7
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 489
    .line 490
    .line 491
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 492
    .line 493
    aget-object v0, v0, v6

    .line 494
    .line 495
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 500
    .line 501
    aget-object v1, v1, v3

    .line 502
    .line 503
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    sget-object v2, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 508
    .line 509
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v2

    .line 513
    if-eqz v2, :cond_5

    .line 514
    .line 515
    sget-object v2, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 516
    .line 517
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    if-eqz v2, :cond_5

    .line 522
    .line 523
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 524
    .line 525
    .line 526
    move-result-wide v2

    .line 527
    sget-object v4, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 528
    .line 529
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 530
    .line 531
    .line 532
    move-result-wide v4

    .line 533
    sub-long/2addr v2, v4

    .line 534
    const-wide/16 v4, 0x3e8

    .line 535
    .line 536
    cmp-long v2, v2, v4

    .line 537
    .line 538
    if-ltz v2, :cond_6

    .line 539
    .line 540
    invoke-static {v0, v1}, Llin/xposed/hook/javaplugin/PluginCallback;->onTroopQuit(Ljava/lang/String;Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 544
    .line 545
    .line 546
    move-result-wide v2

    .line 547
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    sput-object v2, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 552
    .line 553
    sput-object v1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 554
    .line 555
    sput-object v0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 556
    .line 557
    goto :goto_1

    .line 558
    :cond_5
    invoke-static {v0, v1}, Llin/xposed/hook/javaplugin/PluginCallback;->onTroopQuit(Ljava/lang/String;Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 562
    .line 563
    .line 564
    move-result-wide v2

    .line 565
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    sput-object v2, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 570
    .line 571
    sput-object v1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 572
    .line 573
    sput-object v0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 574
    .line 575
    :cond_6
    :goto_1
    return-void

    .line 576
    :pswitch_8
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 577
    .line 578
    aget-object v0, v0, v16

    .line 579
    .line 580
    check-cast v0, Ljava/util/ArrayList;

    .line 581
    .line 582
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    if-ne v2, v3, :cond_9

    .line 587
    .line 588
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 589
    .line 590
    aget-object v1, v1, v3

    .line 591
    .line 592
    const-wide v4, -0x36a52339051405a7L    # -2.3962071500308007E45

    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    invoke-static {v15, v2, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    check-cast v2, Ljava/lang/String;

    .line 606
    .line 607
    const-wide v4, -0x36a50b3c051405a7L    # -2.4045658460918466E45

    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v4

    .line 616
    invoke-static {v14, v4, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    check-cast v1, Ljava/lang/Integer;

    .line 621
    .line 622
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 623
    .line 624
    .line 625
    move-result v1

    .line 626
    if-eq v1, v3, :cond_7

    .line 627
    .line 628
    const/16 v4, 0x64

    .line 629
    .line 630
    if-ne v1, v4, :cond_8

    .line 631
    .line 632
    :cond_7
    invoke-static {v2}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    :cond_8
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    const-wide v4, -0x36a50919051405a7L    # -2.4053103839106696E45

    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v4

    .line 649
    invoke-static {v14, v4, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v4

    .line 653
    check-cast v4, Ljava/lang/Integer;

    .line 654
    .line 655
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 656
    .line 657
    .line 658
    move-result v4

    .line 659
    if-ne v4, v3, :cond_9

    .line 660
    .line 661
    const-wide v3, -0x36a5090d051405a7L    # -2.4053267174642818E45

    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v3

    .line 670
    new-array v4, v6, [Ljava/lang/Object;

    .line 671
    .line 672
    invoke-static {v0, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    const-wide v3, -0x36a508fc051405a7L    # -2.4053498566652324E45

    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v3

    .line 685
    new-array v4, v6, [Ljava/lang/Object;

    .line 686
    .line 687
    invoke-static {v0, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v3

    .line 691
    check-cast v3, Ljava/lang/String;

    .line 692
    .line 693
    invoke-static {v3, v2, v1}, Llin/xposed/hook/javaplugin/PluginCallback;->onSendMsg(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 698
    .line 699
    .line 700
    move-result v2

    .line 701
    if-nez v2, :cond_9

    .line 702
    .line 703
    const-wide v2, -0x36a52321051405a7L    # -2.396239817138025E45

    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    invoke-static {v0, v2, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    :cond_9
    return-void

    .line 720
    :pswitch_9
    sget-object v0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 721
    .line 722
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 727
    .line 728
    .line 729
    move-result v1

    .line 730
    if-eqz v1, :cond_a

    .line 731
    .line 732
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    check-cast v1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰哲苏;

    .line 737
    .line 738
    invoke-interface {v1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰哲苏;->hide()V

    .line 739
    .line 740
    .line 741
    goto :goto_2

    .line 742
    :cond_a
    return-void

    .line 743
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
