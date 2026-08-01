.class public final L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

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
    iput p2, p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

    invoke-direct {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;I)V
    .locals 0

    .line 8
    iput p2, p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9

    .line 1
    iget v0, p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

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
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5"

    .line 205
    .line 206
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-static {v5, v2, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {v5, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, Landroid/widget/EditText;

    .line 223
    .line 224
    const-string v2, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c"

    .line 225
    .line 226
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-static {v5, v2, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    check-cast p1, Landroid/view/View;

    .line 235
    .line 236
    new-instance v2, L飘花落叶言世哲苏子楪兰/飘花落叶言子世苏兰楪哲;

    .line 237
    .line 238
    invoke-direct {v2, p0, v0, v1}, L飘花落叶言世哲苏子楪兰/飘花落叶言子世苏兰楪哲;-><init>(Ljava/lang/Object;Landroid/widget/EditText;I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :pswitch_4
    sget-object p0, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    if-eqz p1, :cond_8

    .line 256
    .line 257
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    check-cast p1, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世兰苏哲;

    .line 262
    .line 263
    invoke-interface {p1}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世兰苏哲;->hide()V

    .line 264
    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_8
    return-void

    .line 268
    :pswitch_5
    sget-object p0, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result p1

    .line 278
    if-eqz p1, :cond_9

    .line 279
    .line 280
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    check-cast p1, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世兰苏哲;

    .line 285
    .line 286
    invoke-interface {p1}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世兰苏哲;->show()V

    .line 287
    .line 288
    .line 289
    goto :goto_9

    .line 290
    :cond_9
    return-void

    .line 291
    :pswitch_6
    new-instance p0, Landroid/os/Handler;

    .line 292
    .line 293
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 298
    .line 299
    .line 300
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 301
    .line 302
    const/16 v1, 0x11

    .line 303
    .line 304
    invoke-direct {v0, p1, v1}, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;-><init>(Ljava/lang/Object;I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 14

    .line 1
    iget v0, p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const v2, 0x9a2103

    .line 5
    .line 6
    .line 7
    const-class v3, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    const/16 v4, 0x66f

    .line 10
    .line 11
    const/4 v5, 0x3

    .line 12
    const/16 v6, 0x66d

    .line 13
    .line 14
    const v7, 0x9a2102

    .line 15
    .line 16
    .line 17
    const/16 v8, 0x670

    .line 18
    .line 19
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    const/4 v10, 0x1

    .line 22
    const-string v11, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 23
    .line 24
    const-class v12, Ljava/lang/String;

    .line 25
    .line 26
    const/4 v13, 0x0

    .line 27
    packed-switch v0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    invoke-static {v11}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 41
    .line 42
    aget-object p0, p0, v13

    .line 43
    .line 44
    invoke-static {v8}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    check-cast p0, Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-ne p0, v7, :cond_0

    .line 61
    .line 62
    invoke-static {p1}, Llin/xposed/hook/javaplugin/JavaPluginLoad;->showPluginDialog(Landroid/content/Context;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    return-void

    .line 66
    :pswitch_2
    invoke-static {v11}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 73
    .line 74
    aget-object p0, p0, v10

    .line 75
    .line 76
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    check-cast p0, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {p0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    filled-new-array {v9, v12, v12, v9}, [Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const/16 v2, 0x56

    .line 101
    .line 102
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const/16 v6, 0x671

    .line 107
    .line 108
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    filled-new-array {v1, v2, v6, v5}, [Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v1, v0, p1}, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏世兰楪哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    sget-object v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 125
    .line 126
    const v1, 0x24080168

    .line 127
    .line 128
    .line 129
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-static {p1, v1, v3, v0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, v10, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_3
    invoke-static {v11}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 154
    .line 155
    aget-object p0, p0, v13

    .line 156
    .line 157
    invoke-static {v8}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    check-cast p0, Landroid/view/View;

    .line 164
    .line 165
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    if-ne p0, v2, :cond_1

    .line 174
    .line 175
    new-instance p0, Landroid/content/Intent;

    .line 176
    .line 177
    const-class v0, Ltop/suzhelan/qstory/ui/activity/SettingActivity;

    .line 178
    .line 179
    invoke-direct {p0, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 183
    .line 184
    .line 185
    :cond_1
    return-void

    .line 186
    :pswitch_4
    invoke-static {v11}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 193
    .line 194
    aget-object p0, p0, v10

    .line 195
    .line 196
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    check-cast p0, Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-virtual {p0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    filled-new-array {v9, v12, v12, v9}, [Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    const-string v2, "\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 221
    .line 222
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    const/16 v6, 0x66e

    .line 227
    .line 228
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    filled-new-array {v1, v2, v6, v5}, [Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-static {v1, v0, p1}, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏世兰楪哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    sget-object v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 245
    .line 246
    const/high16 v1, 0x240f0000

    .line 247
    .line 248
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-static {p1, v1, v3, v0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0, v13, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :pswitch_5
    const/4 p0, 0x0

    .line 267
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :pswitch_6
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 272
    .line 273
    aget-object p0, p0, v1

    .line 274
    .line 275
    check-cast p0, Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    if-eqz p1, :cond_4

    .line 286
    .line 287
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    const/16 v0, 0x112

    .line 292
    .line 293
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    const/16 v1, 0xa9

    .line 298
    .line 299
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-static {v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-static {v1, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    if-nez p1, :cond_3

    .line 312
    .line 313
    goto :goto_0

    .line 314
    :cond_3
    const/16 v0, 0x113

    .line 315
    .line 316
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 321
    .line 322
    invoke-static {v1, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    check-cast v0, Ljava/lang/Boolean;

    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    const/16 v1, 0x114

    .line 333
    .line 334
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-static {v12, v1, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    check-cast p1, Ljava/lang/String;

    .line 343
    .line 344
    if-eqz v0, :cond_2

    .line 345
    .line 346
    if-eqz p1, :cond_2

    .line 347
    .line 348
    const-string v0, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c\u545c"

    .line 349
    .line 350
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    :try_start_0
    new-instance v2, Landroid/media/ExifInterface;

    .line 359
    .line 360
    invoke-direct {v2, p1}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    const/16 p1, 0x116

    .line 364
    .line 365
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    invoke-virtual {v2, p1, v1}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    const/16 p1, 0x117

    .line 373
    .line 374
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    invoke-virtual {v2, p1, v0}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    const-string p1, "\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c"

    .line 382
    .line 383
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    invoke-virtual {v2, p1, v1}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    const-string p1, "\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 391
    .line 392
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    invoke-virtual {v2, p1, v0}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2}, Landroid/media/ExifInterface;->saveAttributes()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 400
    .line 401
    .line 402
    goto :goto_0

    .line 403
    :catch_0
    move-exception p1

    .line 404
    invoke-static {p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Exception;)V

    .line 405
    .line 406
    .line 407
    const-string v0, "\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c"

    .line 408
    .line 409
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    const/16 v1, 0x118

    .line 414
    .line 415
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 420
    .line 421
    .line 422
    goto/16 :goto_0

    .line 423
    .line 424
    :cond_4
    return-void

    .line 425
    :pswitch_7
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 426
    .line 427
    .line 428
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 429
    .line 430
    aget-object p0, p0, v13

    .line 431
    .line 432
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 437
    .line 438
    aget-object p1, p1, v10

    .line 439
    .line 440
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    sget-object v0, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 445
    .line 446
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    if-eqz v0, :cond_5

    .line 451
    .line 452
    sget-object v0, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 453
    .line 454
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    if-eqz v0, :cond_5

    .line 459
    .line 460
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 461
    .line 462
    .line 463
    move-result-wide v0

    .line 464
    sget-object v2, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 465
    .line 466
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 467
    .line 468
    .line 469
    move-result-wide v2

    .line 470
    sub-long/2addr v0, v2

    .line 471
    const-wide/16 v2, 0x3e8

    .line 472
    .line 473
    cmp-long v0, v0, v2

    .line 474
    .line 475
    if-ltz v0, :cond_6

    .line 476
    .line 477
    invoke-static {p0, p1}, Llin/xposed/hook/javaplugin/PluginCallback;->onTroopQuit(Ljava/lang/String;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 481
    .line 482
    .line 483
    move-result-wide v0

    .line 484
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    sput-object v0, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 489
    .line 490
    sput-object p1, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 491
    .line 492
    sput-object p0, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 493
    .line 494
    goto :goto_1

    .line 495
    :cond_5
    invoke-static {p0, p1}, Llin/xposed/hook/javaplugin/PluginCallback;->onTroopQuit(Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 499
    .line 500
    .line 501
    move-result-wide v0

    .line 502
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    sput-object v0, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/Long;

    .line 507
    .line 508
    sput-object p1, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 509
    .line 510
    sput-object p0, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 511
    .line 512
    :cond_6
    :goto_1
    return-void

    .line 513
    :pswitch_8
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 514
    .line 515
    aget-object p0, p0, v1

    .line 516
    .line 517
    check-cast p0, Ljava/util/ArrayList;

    .line 518
    .line 519
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 520
    .line 521
    .line 522
    move-result v0

    .line 523
    if-ne v0, v10, :cond_9

    .line 524
    .line 525
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 526
    .line 527
    aget-object p1, p1, v10

    .line 528
    .line 529
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 530
    .line 531
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    invoke-static {v12, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    check-cast v0, Ljava/lang/String;

    .line 540
    .line 541
    const/16 v1, 0x74

    .line 542
    .line 543
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-static {v9, v1, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object p1

    .line 551
    check-cast p1, Ljava/lang/Integer;

    .line 552
    .line 553
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 554
    .line 555
    .line 556
    move-result p1

    .line 557
    if-eq p1, v10, :cond_7

    .line 558
    .line 559
    const/16 v1, 0x64

    .line 560
    .line 561
    if-ne p1, v1, :cond_8

    .line 562
    .line 563
    :cond_7
    invoke-static {v0}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    :cond_8
    invoke-virtual {p0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object p0

    .line 571
    const/16 v1, 0x14a

    .line 572
    .line 573
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    invoke-static {v9, v1, p0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    check-cast v1, Ljava/lang/Integer;

    .line 582
    .line 583
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 584
    .line 585
    .line 586
    move-result v1

    .line 587
    if-ne v1, v10, :cond_9

    .line 588
    .line 589
    const/16 v1, 0xef

    .line 590
    .line 591
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    new-array v2, v13, [Ljava/lang/Object;

    .line 596
    .line 597
    invoke-static {p0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object p0

    .line 601
    const/16 v1, 0x14b

    .line 602
    .line 603
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    new-array v2, v13, [Ljava/lang/Object;

    .line 608
    .line 609
    invoke-static {p0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    check-cast v1, Ljava/lang/String;

    .line 614
    .line 615
    invoke-static {v1, v0, p1}, Llin/xposed/hook/javaplugin/PluginCallback;->onSendMsg(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object p1

    .line 619
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    if-nez v0, :cond_9

    .line 624
    .line 625
    const/16 v0, 0x14c

    .line 626
    .line 627
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object p1

    .line 635
    invoke-static {p0, v0, p1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    :cond_9
    return-void

    .line 639
    :pswitch_9
    sget-object p0, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 640
    .line 641
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 642
    .line 643
    .line 644
    move-result-object p0

    .line 645
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 646
    .line 647
    .line 648
    move-result p1

    .line 649
    if-eqz p1, :cond_a

    .line 650
    .line 651
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object p1

    .line 655
    check-cast p1, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世兰苏哲;

    .line 656
    .line 657
    invoke-interface {p1}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世兰苏哲;->hide()V

    .line 658
    .line 659
    .line 660
    goto :goto_2

    .line 661
    :cond_a
    return-void

    .line 662
    :pswitch_a
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 663
    .line 664
    aget-object p0, p0, v13

    .line 665
    .line 666
    const/16 p1, 0x12e

    .line 667
    .line 668
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object p1

    .line 672
    invoke-static {v12, p1, p0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object p1

    .line 676
    check-cast p1, Ljava/lang/String;

    .line 677
    .line 678
    const/16 v0, 0x12f

    .line 679
    .line 680
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result p1

    .line 688
    if-eqz p1, :cond_b

    .line 689
    .line 690
    new-instance p1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;

    .line 691
    .line 692
    invoke-direct {p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 693
    .line 694
    .line 695
    const/16 v0, 0x130

    .line 696
    .line 697
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    const-class v1, [B

    .line 702
    .line 703
    invoke-static {v1, v0, p0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object p0

    .line 707
    check-cast p0, [B

    .line 708
    .line 709
    invoke-static {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏([B)[B

    .line 710
    .line 711
    .line 712
    move-result-object p0

    .line 713
    invoke-virtual {p1, p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲([B)V

    .line 714
    .line 715
    .line 716
    invoke-virtual {p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰()Lcom/alibaba/fastjson2/JSONObject;

    .line 717
    .line 718
    .line 719
    move-result-object p0

    .line 720
    const-string p1, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c\u55b5"

    .line 721
    .line 722
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    const-string v1, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 731
    .line 732
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;)I

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    const/16 v3, 0x2dc

    .line 749
    .line 750
    if-ne v2, v3, :cond_b

    .line 751
    .line 752
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;)I

    .line 757
    .line 758
    .line 759
    move-result v0

    .line 760
    const/16 v2, 0xc

    .line 761
    .line 762
    if-ne v0, v2, :cond_b

    .line 763
    .line 764
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 769
    .line 770
    .line 771
    move-result-object p0

    .line 772
    const-string v0, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5"

    .line 773
    .line 774
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v2

    .line 778
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 779
    .line 780
    .line 781
    move-result-object p0

    .line 782
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v2

    .line 786
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 787
    .line 788
    .line 789
    move-result-object p0

    .line 790
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;)I

    .line 795
    .line 796
    .line 797
    move-result v2

    .line 798
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v2

    .line 802
    const-string v3, "\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c"

    .line 803
    .line 804
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v3

    .line 808
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v3

    .line 812
    const-string v4, "\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 813
    .line 814
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v4

    .line 818
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 819
    .line 820
    .line 821
    move-result-object p0

    .line 822
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 827
    .line 828
    .line 829
    move-result-object p0

    .line 830
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 831
    .line 832
    .line 833
    move-result-object p1

    .line 834
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object p1

    .line 838
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->getLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 843
    .line 844
    .line 845
    move-result-object p0

    .line 846
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 847
    .line 848
    .line 849
    move-result-wide v0

    .line 850
    invoke-static {p1}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object p0

    .line 854
    invoke-static {v3}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object p1

    .line 858
    invoke-static {v2, p0, p1, v0, v1}, Llin/xposed/hook/javaplugin/PluginCallback;->onTroopBanInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 859
    .line 860
    .line 861
    :cond_b
    return-void

    .line 862
    nop

    .line 863
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_8
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
