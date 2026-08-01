.class public final synthetic L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V
    .locals 0

    .line 10
    iput p2, p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    iput p1, p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

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
    iget v1, v0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v1, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/HashMap;

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
    invoke-static {v0, v3}, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(Landroid/app/Activity;Z)V

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
    invoke-static {v4}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/16 v5, 0x49

    .line 45
    .line 46
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iget-object v6, v4, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 51
    .line 52
    iput-object v5, v6, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 53
    .line 54
    new-array v5, v2, [Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {v4, v1, v5}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Landroid/app/Activity;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    array-length v6, v5

    .line 71
    const/4 v7, 0x0

    .line 72
    move v9, v2

    .line 73
    move-object v8, v7

    .line 74
    :goto_0
    if-ge v9, v6, :cond_6

    .line 75
    .line 76
    aget-object v10, v5, v9

    .line 77
    .line 78
    invoke-virtual {v10, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    const/16 v13, 0xc3

    .line 90
    .line 91
    invoke-static {v13}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    if-eqz v12, :cond_4

    .line 100
    .line 101
    :try_start_0
    invoke-virtual {v10, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v12
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 105
    if-nez v12, :cond_1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    :try_start_1
    const-class v13, Ljava/lang/CharSequence;

    .line 109
    .line 110
    sget-object v14, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 111
    .line 112
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    invoke-static {v14, v13}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    invoke-virtual {v13, v12}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    check-cast v13, Ljava/lang/CharSequence;

    .line 125
    .line 126
    if-nez v13, :cond_2

    .line 127
    .line 128
    :goto_1
    move-object/from16 v16, v1

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_2
    const/16 v14, 0xbe

    .line 132
    .line 133
    invoke-static {v14}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v14

    .line 137
    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    if-eqz v13, :cond_4

    .line 142
    .line 143
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    invoke-virtual {v13}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    invoke-virtual {v13}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 152
    .line 153
    .line 154
    move-result-object v13

    .line 155
    array-length v14, v13

    .line 156
    move v15, v2

    .line 157
    :goto_2
    if-ge v15, v14, :cond_4

    .line 158
    .line 159
    aget-object v2, v13, v15

    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 165
    move-object/from16 v16, v1

    .line 166
    .line 167
    :try_start_2
    const-class v1, Landroid/view/View;

    .line 168
    .line 169
    if-ne v3, v1, :cond_3

    .line 170
    .line 171
    const/4 v1, 0x1

    .line 172
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v12}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    check-cast v1, Landroid/widget/Button;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 180
    .line 181
    move-object v7, v1

    .line 182
    goto :goto_3

    .line 183
    :cond_3
    add-int/lit8 v15, v15, 0x1

    .line 184
    .line 185
    move-object/from16 v1, v16

    .line 186
    .line 187
    const/4 v2, 0x0

    .line 188
    const/4 v3, 0x1

    .line 189
    goto :goto_2

    .line 190
    :catch_0
    :cond_4
    move-object/from16 v16, v1

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :catch_1
    move-exception v0

    .line 194
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_5

    .line 198
    .line 199
    :catch_2
    :goto_3
    const-class v1, Ljava/lang/String;

    .line 200
    .line 201
    if-ne v11, v1, :cond_5

    .line 202
    .line 203
    :try_start_3
    iget-object v1, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 204
    .line 205
    invoke-virtual {v10, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    check-cast v1, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3

    .line 210
    .line 211
    invoke-static {v1}, Llin/xposed/hook/util/qq/QQEnvTool;->checkQQ(Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_5

    .line 216
    .line 217
    move-object v8, v1

    .line 218
    goto :goto_4

    .line 219
    :catch_3
    move-exception v0

    .line 220
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_5
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 225
    .line 226
    move-object/from16 v1, v16

    .line 227
    .line 228
    const/4 v2, 0x0

    .line 229
    const/4 v3, 0x1

    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :cond_6
    if-nez v7, :cond_7

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_7
    if-nez v8, :cond_8

    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_8
    const/16 v0, 0xbf

    .line 239
    .line 240
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 245
    .line 246
    .line 247
    new-instance v0, Landroid/widget/Button;

    .line 248
    .line 249
    invoke-direct {v0, v4}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 250
    .line 251
    .line 252
    const/16 v1, 0xc0

    .line 253
    .line 254
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v7}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v7}, Landroid/widget/TextView;->getTextSize()F

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    const/4 v2, 0x0

    .line 273
    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v7}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 281
    .line 282
    .line 283
    new-instance v1, L飘花落叶言世哲苏子楪兰/飘花落叶言子世楪苏兰哲;

    .line 284
    .line 285
    const/4 v2, 0x1

    .line 286
    invoke-direct {v1, v8, v4, v2}, L飘花落叶言世哲苏子楪兰/飘花落叶言子世楪苏兰哲;-><init>(Ljava/lang/String;Landroid/app/Activity;I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    check-cast v1, Landroid/widget/LinearLayout;

    .line 297
    .line 298
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    add-int/lit8 v2, v2, -0x2

    .line 303
    .line 304
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-virtual {v1, v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 309
    .line 310
    .line 311
    :goto_5
    return-void

    .line 312
    :pswitch_1
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v0, Landroid/app/Activity;

    .line 315
    .line 316
    invoke-static {v0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲(Landroid/content/Context;)V

    .line 317
    .line 318
    .line 319
    sget-object v1, L飘花落叶言世兰子楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 320
    .line 321
    const/4 v2, 0x1

    .line 322
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eqz v1, :cond_9

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_9
    new-instance v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;

    .line 330
    .line 331
    invoke-direct {v1, v0}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;-><init>(Landroid/app/Activity;)V

    .line 332
    .line 333
    .line 334
    const/16 v0, 0x2ef

    .line 335
    .line 336
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    iget-object v2, v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;

    .line 341
    .line 342
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 343
    .line 344
    .line 345
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;

    .line 346
    .line 347
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-direct {v0, v2, v1}, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;-><init>(Landroid/os/Looper;L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 352
    .line 353
    .line 354
    sput-object v0, L飘花落叶言世兰子楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;

    .line 355
    .line 356
    new-instance v0, Ljava/lang/Thread;

    .line 357
    .line 358
    new-instance v1, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 359
    .line 360
    const/4 v2, 0x6

    .line 361
    invoke-direct {v1, v2}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 362
    .line 363
    .line 364
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 368
    .line 369
    .line 370
    :goto_6
    return-void

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
