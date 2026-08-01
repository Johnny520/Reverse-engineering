.class public final synthetic L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V
    .locals 0

    .line 10
    iput p2, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰哲苏;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    iput p1, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v1, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/HashMap;

    .line 13
    .line 14
    iget-object v1, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 15
    .line 16
    aget-object v1, v1, v2

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroid/app/Activity;

    .line 29
    .line 30
    invoke-static {v0, v3}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世(Landroid/app/Activity;Z)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :pswitch_0
    iget-object v1, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static {v4}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-wide v5, -0x36a50fe1051405a7L    # -2.4029474631547706E45

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    iget-object v6, v4, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 54
    .line 55
    iput-object v5, v6, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 56
    .line 57
    new-array v5, v2, [Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {v4, v1, v5}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Landroid/app/Activity;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    array-length v6, v5

    .line 74
    const/4 v7, 0x0

    .line 75
    move v9, v2

    .line 76
    move-object v8, v7

    .line 77
    :goto_0
    if-ge v9, v6, :cond_6

    .line 78
    .line 79
    aget-object v10, v5, v9

    .line 80
    .line 81
    invoke-virtual {v10, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    const-wide v13, -0x36a51132051405a7L    # -2.4024887625241612E45

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    if-eqz v12, :cond_4

    .line 106
    .line 107
    :try_start_0
    invoke-virtual {v10, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v12
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 111
    if-nez v12, :cond_1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    :try_start_1
    const-class v13, Ljava/lang/CharSequence;

    .line 115
    .line 116
    sget-object v14, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 117
    .line 118
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v14

    .line 122
    invoke-static {v14, v13}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 123
    .line 124
    .line 125
    move-result-object v13

    .line 126
    invoke-virtual {v13, v12}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v13

    .line 130
    check-cast v13, Ljava/lang/CharSequence;

    .line 131
    .line 132
    if-nez v13, :cond_2

    .line 133
    .line 134
    :goto_1
    move-object/from16 v16, v1

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_2
    const-wide v14, -0x36a511b3051405a7L    # -2.40231317682283E45

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    invoke-static {v14, v15}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v14

    .line 146
    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    if-eqz v13, :cond_4

    .line 151
    .line 152
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    invoke-virtual {v13}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v13

    .line 160
    invoke-virtual {v13}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 161
    .line 162
    .line 163
    move-result-object v13

    .line 164
    array-length v14, v13

    .line 165
    move v15, v2

    .line 166
    :goto_2
    if-ge v15, v14, :cond_4

    .line 167
    .line 168
    aget-object v2, v13, v15

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 174
    move-object/from16 v16, v1

    .line 175
    .line 176
    :try_start_2
    const-class v1, Landroid/view/View;

    .line 177
    .line 178
    if-ne v3, v1, :cond_3

    .line 179
    .line 180
    const/4 v1, 0x1

    .line 181
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v12}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, Landroid/widget/Button;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 189
    .line 190
    move-object v7, v1

    .line 191
    goto :goto_3

    .line 192
    :cond_3
    add-int/lit8 v15, v15, 0x1

    .line 193
    .line 194
    move-object/from16 v1, v16

    .line 195
    .line 196
    const/4 v2, 0x0

    .line 197
    const/4 v3, 0x1

    .line 198
    goto :goto_2

    .line 199
    :catch_0
    :cond_4
    move-object/from16 v16, v1

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :catch_1
    move-exception v0

    .line 203
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_5

    .line 207
    .line 208
    :catch_2
    :goto_3
    const-class v1, Ljava/lang/String;

    .line 209
    .line 210
    if-ne v11, v1, :cond_5

    .line 211
    .line 212
    :try_start_3
    iget-object v1, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 213
    .line 214
    invoke-virtual {v10, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3

    .line 219
    .line 220
    invoke-static {v1}, Llin/xposed/hook/util/qq/QQEnvTool;->checkQQ(Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_5

    .line 225
    .line 226
    move-object v8, v1

    .line 227
    goto :goto_4

    .line 228
    :catch_3
    move-exception v0

    .line 229
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_5
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 234
    .line 235
    move-object/from16 v1, v16

    .line 236
    .line 237
    const/4 v2, 0x0

    .line 238
    const/4 v3, 0x1

    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :cond_6
    if-nez v7, :cond_7

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_7
    if-nez v8, :cond_8

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_8
    const-wide v0, -0x36a511ba051405a7L    # -2.4023036489165562E45

    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 257
    .line 258
    .line 259
    new-instance v0, Landroid/widget/Button;

    .line 260
    .line 261
    invoke-direct {v0, v4}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 262
    .line 263
    .line 264
    const-wide v1, -0x36a511ac051405a7L    # -2.4023227047291038E45

    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v7}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v7}, Landroid/widget/TextView;->getTextSize()F

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    const/4 v2, 0x0

    .line 288
    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v7}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 296
    .line 297
    .line 298
    new-instance v1, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰哲苏;

    .line 299
    .line 300
    const/4 v2, 0x1

    .line 301
    invoke-direct {v1, v8, v4, v2}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰哲苏;-><init>(Ljava/lang/String;Landroid/app/Activity;I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Landroid/widget/LinearLayout;

    .line 312
    .line 313
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    add-int/lit8 v2, v2, -0x2

    .line 318
    .line 319
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    invoke-virtual {v1, v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 324
    .line 325
    .line 326
    :goto_5
    return-void

    .line 327
    :pswitch_1
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Landroid/app/Activity;

    .line 330
    .line 331
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子苏楪世哲兰(Landroid/content/Context;)V

    .line 332
    .line 333
    .line 334
    sget-object v1, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 335
    .line 336
    const/4 v2, 0x1

    .line 337
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-eqz v1, :cond_9

    .line 342
    .line 343
    goto :goto_6

    .line 344
    :cond_9
    new-instance v1, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏哲兰;

    .line 345
    .line 346
    invoke-direct {v1, v0}, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏哲兰;-><init>(Landroid/app/Activity;)V

    .line 347
    .line 348
    .line 349
    const-wide v2, -0x36a54d16051405a7L    # -2.381619925525634E45

    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    iget-object v2, v1, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;

    .line 359
    .line 360
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 361
    .line 362
    .line 363
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;

    .line 364
    .line 365
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-direct {v0, v2, v1}, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;-><init>(Landroid/os/Looper;L飘花落叶言世哲子苏兰楪/飘花落叶言子楪世苏哲兰;)V

    .line 370
    .line 371
    .line 372
    sput-object v0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;

    .line 373
    .line 374
    new-instance v0, Ljava/lang/Thread;

    .line 375
    .line 376
    new-instance v1, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 377
    .line 378
    const/16 v2, 0x8

    .line 379
    .line 380
    invoke-direct {v1, v2}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 381
    .line 382
    .line 383
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 387
    .line 388
    .line 389
    :goto_6
    return-void

    .line 390
    nop

    .line 391
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
