.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰哲苏楪;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:I

    .line 3
    .line 4
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:I

    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    iput-object p3, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Field;Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;Ljava/lang/ClassLoader;)V
    .locals 0

    const/4 p3, 0x2

    iput p3, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:I

    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    iput-object p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 13
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-wide v2, -0x36a582e4051405a7L    # -2.3628717282377578E45

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    check-cast v7, Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    invoke-virtual {v7, v5}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    .line 33
    .line 34
    .line 35
    check-cast v6, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲兰苏;

    .line 36
    .line 37
    invoke-virtual {v6, p1}, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :pswitch_2
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    :try_start_0
    check-cast v7, Ljava/lang/reflect/Method;

    .line 48
    .line 49
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-virtual {v7, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    instance-of p1, p0, Landroid/widget/TextView;

    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    check-cast p0, Landroid/widget/TextView;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object p0, v5

    .line 63
    :goto_0
    if-nez p0, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast v6, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰苏哲世;

    .line 75
    .line 76
    iget-object v0, v6, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_7

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {p1, v1, v4}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    if-eqz p0, :cond_5

    .line 114
    .line 115
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    goto :goto_1

    .line 120
    :cond_5
    move-object p0, v5

    .line 121
    :goto_1
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 122
    .line 123
    if-eqz p1, :cond_6

    .line 124
    .line 125
    move-object v5, p0

    .line 126
    check-cast v5, Landroid/view/ViewGroup;

    .line 127
    .line 128
    :cond_6
    if-eqz v5, :cond_7

    .line 129
    .line 130
    new-instance p0, Landroid/view/ViewGroup$LayoutParams;

    .line 131
    .line 132
    invoke-direct {p0, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    .line 137
    .line 138
    :catch_0
    :cond_7
    :goto_2
    return-void

    .line 139
    :pswitch_3
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    check-cast v7, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世哲兰苏;

    .line 146
    .line 147
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    if-nez p0, :cond_8

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_8
    check-cast v6, Ljava/lang/Class;

    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    array-length v0, p0

    .line 166
    add-int/lit8 v0, v0, -0x1

    .line 167
    .line 168
    if-ltz v0, :cond_c

    .line 169
    .line 170
    :goto_3
    add-int/lit8 v2, v0, -0x1

    .line 171
    .line 172
    aget-object v0, p0, v0

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    array-length v3, v3

    .line 179
    if-ne v3, v1, :cond_a

    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    aget-object v3, v3, v4

    .line 186
    .line 187
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 188
    .line 189
    invoke-static {v3, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-nez v3, :cond_9

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    aget-object v3, v3, v4

    .line 200
    .line 201
    invoke-static {v3, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-eqz v3, :cond_a

    .line 206
    .line 207
    :cond_9
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 212
    .line 213
    invoke-static {v3, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-eqz v3, :cond_a

    .line 218
    .line 219
    move-object v5, v0

    .line 220
    goto :goto_4

    .line 221
    :cond_a
    if-gez v2, :cond_b

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_b
    move v0, v2

    .line 225
    goto :goto_3

    .line 226
    :cond_c
    :goto_4
    if-eqz v5, :cond_d

    .line 227
    .line 228
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 229
    .line 230
    .line 231
    :cond_d
    if-eqz v5, :cond_e

    .line 232
    .line 233
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 234
    .line 235
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 236
    .line 237
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-virtual {v5, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    :cond_e
    :goto_5
    return-void

    .line 245
    :pswitch_4
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v6, Ljava/lang/Class;

    .line 254
    .line 255
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    array-length v0, p1

    .line 263
    move-object v2, v5

    .line 264
    :goto_6
    if-ge v4, v0, :cond_11

    .line 265
    .line 266
    aget-object v3, p1, v4

    .line 267
    .line 268
    const-class v6, Landroid/widget/LinearLayout;

    .line 269
    .line 270
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    invoke-virtual {v6, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    if-eqz v6, :cond_10

    .line 279
    .line 280
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    instance-of v3, v2, Landroid/widget/LinearLayout;

    .line 288
    .line 289
    if-eqz v3, :cond_f

    .line 290
    .line 291
    check-cast v2, Landroid/widget/LinearLayout;

    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_f
    move-object v2, v5

    .line 295
    :goto_7
    if-nez v2, :cond_11

    .line 296
    .line 297
    :cond_10
    add-int/lit8 v4, v4, 0x1

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_11
    if-eqz v2, :cond_12

    .line 301
    .line 302
    check-cast v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰哲苏楪;

    .line 303
    .line 304
    new-instance p0, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 305
    .line 306
    const/4 p1, 0x7

    .line 307
    invoke-direct {p0, v7, p1, v2}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 311
    .line 312
    .line 313
    :cond_12
    return-void

    .line 314
    :pswitch_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    check-cast v6, Ljava/lang/Class;

    .line 319
    .line 320
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    check-cast v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲苏世;

    .line 327
    .line 328
    iget-object v0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_13

    .line 335
    .line 336
    const-wide v2, -0x36a5ac65051405a7L    # -2.348409727643618E45

    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    :try_start_1
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {v6, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    const-wide v2, -0x36a5ac6c051405a7L    # -2.3484001997373442E45

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
    invoke-virtual {v6, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 366
    .line 367
    .line 368
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 369
    .line 370
    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 374
    .line 375
    invoke-virtual {v2, p1, p0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 376
    .line 377
    .line 378
    :catch_1
    :cond_13
    return-void

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const-wide v0, -0x36a582e4051405a7L    # -2.3628717282377578E45

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/lang/reflect/Field;

    .line 24
    .line 25
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    instance-of v1, v0, Landroid/os/Bundle;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    check-cast v0, Landroid/os/Bundle;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    :goto_0
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-wide v1, -0x36a5c796051405a7L    # -2.3389349054190713E45

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-wide v2, -0x36a5c79a051405a7L    # -2.3389294609012006E45

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v1, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    sget-object v1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 71
    .line 72
    if-nez v1, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {p1, v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;

    .line 83
    .line 84
    new-instance p1, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 85
    .line 86
    invoke-direct {p1, v0, p0}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;-><init>(Landroid/os/Bundle;Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;)V

    .line 87
    .line 88
    .line 89
    new-instance p0, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏哲兰;

    .line 90
    .line 91
    invoke-direct {p0, p1}, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 95
    .line 96
    .line 97
    :cond_3
    :goto_1
    return-void

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
