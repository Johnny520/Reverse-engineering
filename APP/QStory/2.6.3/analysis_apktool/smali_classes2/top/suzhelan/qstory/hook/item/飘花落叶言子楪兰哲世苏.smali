.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;)V
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

.method public constructor <init>(Ljava/lang/reflect/Field;Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲兰楪;Ljava/lang/ClassLoader;)V
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
    const-string v2, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    check-cast v6, Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    invoke-virtual {v6, v4}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    .line 30
    .line 31
    .line 32
    check-cast v5, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪世哲兰苏;

    .line 33
    .line 34
    invoke-virtual {v5, p1}, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    :pswitch_2
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    :try_start_0
    check-cast v6, Ljava/lang/reflect/Method;

    .line 45
    .line 46
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v6, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    instance-of p1, p0, Landroid/widget/TextView;

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    check-cast p0, Landroid/widget/TextView;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-object p0, v4

    .line 60
    :goto_0
    if-nez p0, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast v5, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰苏哲世;

    .line 72
    .line 73
    iget-object v0, v5, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_7

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {p1, v1, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪兰哲世(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-eqz p0, :cond_5

    .line 111
    .line 112
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    goto :goto_1

    .line 117
    :cond_5
    move-object p0, v4

    .line 118
    :goto_1
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 119
    .line 120
    if-eqz p1, :cond_6

    .line 121
    .line 122
    move-object v4, p0

    .line 123
    check-cast v4, Landroid/view/ViewGroup;

    .line 124
    .line 125
    :cond_6
    if-eqz v4, :cond_7

    .line 126
    .line 127
    new-instance p0, Landroid/view/ViewGroup$LayoutParams;

    .line 128
    .line 129
    invoke-direct {p0, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    .line 134
    .line 135
    :catch_0
    :cond_7
    :goto_2
    return-void

    .line 136
    :pswitch_3
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    check-cast v6, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世哲兰苏;

    .line 143
    .line 144
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-nez p0, :cond_8

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_8
    check-cast v5, Ljava/lang/Class;

    .line 154
    .line 155
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    array-length v0, p0

    .line 163
    add-int/lit8 v0, v0, -0x1

    .line 164
    .line 165
    if-ltz v0, :cond_c

    .line 166
    .line 167
    :goto_3
    add-int/lit8 v2, v0, -0x1

    .line 168
    .line 169
    aget-object v0, p0, v0

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    array-length v5, v5

    .line 176
    if-ne v5, v1, :cond_a

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    aget-object v5, v5, v3

    .line 183
    .line 184
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 185
    .line 186
    invoke-static {v5, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-nez v5, :cond_9

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    aget-object v5, v5, v3

    .line 197
    .line 198
    invoke-static {v5, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-eqz v5, :cond_a

    .line 203
    .line 204
    :cond_9
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 209
    .line 210
    invoke-static {v5, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    if-eqz v5, :cond_a

    .line 215
    .line 216
    move-object v4, v0

    .line 217
    goto :goto_4

    .line 218
    :cond_a
    if-gez v2, :cond_b

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_b
    move v0, v2

    .line 222
    goto :goto_3

    .line 223
    :cond_c
    :goto_4
    if-eqz v4, :cond_d

    .line 224
    .line 225
    invoke-virtual {v4, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 226
    .line 227
    .line 228
    :cond_d
    if-eqz v4, :cond_e

    .line 229
    .line 230
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 231
    .line 232
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 233
    .line 234
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-virtual {v4, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    :cond_e
    :goto_5
    return-void

    .line 242
    :pswitch_4
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v5, Ljava/lang/Class;

    .line 251
    .line 252
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    array-length v0, p1

    .line 260
    move-object v2, v4

    .line 261
    :goto_6
    if-ge v3, v0, :cond_11

    .line 262
    .line 263
    aget-object v5, p1, v3

    .line 264
    .line 265
    const-class v7, Landroid/widget/LinearLayout;

    .line 266
    .line 267
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    if-eqz v7, :cond_10

    .line 276
    .line 277
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    instance-of v5, v2, Landroid/widget/LinearLayout;

    .line 285
    .line 286
    if-eqz v5, :cond_f

    .line 287
    .line 288
    check-cast v2, Landroid/widget/LinearLayout;

    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_f
    move-object v2, v4

    .line 292
    :goto_7
    if-nez v2, :cond_11

    .line 293
    .line 294
    :cond_10
    add-int/lit8 v3, v3, 0x1

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_11
    if-eqz v2, :cond_12

    .line 298
    .line 299
    check-cast v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;

    .line 300
    .line 301
    new-instance p0, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 302
    .line 303
    const/4 p1, 0x7

    .line 304
    invoke-direct {p0, v6, p1, v2}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 308
    .line 309
    .line 310
    :cond_12
    return-void

    .line 311
    :pswitch_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    check-cast v5, Ljava/lang/Class;

    .line 316
    .line 317
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    check-cast v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲苏世;

    .line 324
    .line 325
    iget-object v0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 326
    .line 327
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-eqz v0, :cond_13

    .line 332
    .line 333
    :try_start_1
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 334
    .line 335
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-virtual {v5, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    const/16 v2, 0x714

    .line 344
    .line 345
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-virtual {v5, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 357
    .line 358
    .line 359
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 360
    .line 361
    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 365
    .line 366
    invoke-virtual {v2, p1, p0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 367
    .line 368
    .line 369
    :catch_1
    :cond_13
    return-void

    .line 370
    nop

    .line 371
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
    .locals 3

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
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 11
    .line 12
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/lang/reflect/Field;

    .line 21
    .line 22
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    instance-of v1, v0, Landroid/os/Bundle;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    check-cast v0, Landroid/os/Bundle;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    :goto_0
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/16 v1, 0x7c6

    .line 40
    .line 41
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u545c\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 50
    .line 51
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v1, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    sget-object v1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 62
    .line 63
    if-nez v1, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {p1, v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲兰楪;

    .line 74
    .line 75
    new-instance p1, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 76
    .line 77
    invoke-direct {p1, v0, p0}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;-><init>(Landroid/os/Bundle;Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲兰楪;)V

    .line 78
    .line 79
    .line 80
    new-instance p0, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏哲兰;

    .line 81
    .line 82
    invoke-direct {p0, p1}, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 86
    .line 87
    .line 88
    :cond_3
    :goto_1
    return-void

    .line 89
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
