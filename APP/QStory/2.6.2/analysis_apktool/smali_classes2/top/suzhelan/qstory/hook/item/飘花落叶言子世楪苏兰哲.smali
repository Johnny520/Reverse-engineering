.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪苏兰哲;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲苏兰;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲苏兰;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲苏兰;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

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
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲苏兰;

    .line 22
    .line 23
    iget-object p0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 32
    .line 33
    instance-of p1, p0, Landroid/widget/FrameLayout;

    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    check-cast p0, Landroid/widget/FrameLayout;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    :goto_0
    if-nez p0, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/16 p1, 0x8

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-direct {p1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_1
    return-void

    .line 59
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲苏兰;

    .line 5
    .line 6
    const-wide v3, -0x36a582e4051405a7L    # -2.3628717282377578E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p0, v2, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 33
    .line 34
    instance-of v0, p0, Landroid/app/Activity;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    move-object v1, p0

    .line 39
    check-cast v1, Landroid/app/Activity;

    .line 40
    .line 41
    :cond_0
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void

    .line 52
    :pswitch_1
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object p0, v2, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    return-void

    .line 70
    :pswitch_2
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object p0, v2, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-nez p0, :cond_4

    .line 83
    .line 84
    goto/16 :goto_5

    .line 85
    .line 86
    :cond_4
    :try_start_0
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    aget-object p0, p0, v0

    .line 90
    .line 91
    instance-of v3, p0, Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v3, :cond_5

    .line 94
    .line 95
    check-cast p0, Ljava/lang/String;

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    move-object p0, v1

    .line 99
    :goto_0
    const-wide v3, -0x36a5aab2051405a7L    # -2.3490018189620604E45

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-static {p0, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-nez p0, :cond_6

    .line 113
    .line 114
    goto/16 :goto_5

    .line 115
    .line 116
    :cond_6
    sget-object p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 117
    .line 118
    const-wide v3, -0x36a50b93051405a7L    # -2.404447427828158E45

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    const/4 p0, 0x1

    .line 124
    :try_start_1
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-static {v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    const-wide v4, -0x36a5a948051405a7L    # -2.349494547829362E45

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-virtual {v3, v4, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-virtual {v3, p0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    instance-of v4, v3, Ljava/lang/String;

    .line 153
    .line 154
    if-eqz v4, :cond_7

    .line 155
    .line 156
    check-cast v3, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :catch_0
    :cond_7
    move-object v3, v1

    .line 160
    :goto_1
    if-nez v3, :cond_8

    .line 161
    .line 162
    goto/16 :goto_5

    .line 163
    .line 164
    :cond_8
    :try_start_2
    sget-object v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 165
    .line 166
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    check-cast v4, Ljava/lang/Boolean;

    .line 171
    .line 172
    if-eqz v4, :cond_9

    .line 173
    .line 174
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    :cond_9
    if-eqz v0, :cond_a

    .line 179
    .line 180
    invoke-virtual {p1, v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_a
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 185
    .line 186
    aget-object v0, v0, p0

    .line 187
    .line 188
    instance-of v4, v0, [B

    .line 189
    .line 190
    if-eqz v4, :cond_b

    .line 191
    .line 192
    check-cast v0, [B

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_b
    move-object v0, v1

    .line 196
    :goto_2
    if-nez v0, :cond_c

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_c
    new-instance v4, Ljava/lang/String;

    .line 200
    .line 201
    sget-object v5, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 202
    .line 203
    invoke-direct {v4, v0, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 204
    .line 205
    .line 206
    const-wide v5, -0x36a5a991051405a7L    # -2.349395185378221E45

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    :try_start_3
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    const-wide v5, -0x36a5a975051405a7L    # -2.349433297003316E45

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-virtual {v0, v5, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    instance-of v5, v0, Ljava/util/List;

    .line 237
    .line 238
    if-eqz v5, :cond_d

    .line 239
    .line 240
    check-cast v0, Ljava/util/List;

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_d
    move-object v0, v1

    .line 244
    :goto_3
    if-nez v0, :cond_e

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_e
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 251
    if-nez v0, :cond_f

    .line 252
    .line 253
    :goto_4
    :try_start_4
    invoke-virtual {p1, v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    goto :goto_5

    .line 257
    :catch_1
    :cond_f
    invoke-static {v2, v4}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪苏哲兰世(Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲苏兰;Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 262
    .line 263
    sget-object v1, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 264
    .line 265
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    const-wide v1, -0x36a5aaa6051405a7L    # -2.3490181525156726E45

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    aput-object v0, p1, p0

    .line 281
    .line 282
    sget-object p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 283
    .line 284
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 285
    .line 286
    invoke-virtual {p0, v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 287
    .line 288
    .line 289
    :catch_2
    :goto_5
    return-void

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
