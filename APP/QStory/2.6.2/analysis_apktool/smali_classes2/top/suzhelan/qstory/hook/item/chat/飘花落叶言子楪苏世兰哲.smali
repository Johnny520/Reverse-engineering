.class public final Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏世兰哲;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/chat/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
        "<init>",
        "()V",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 13

    .line 1
    const-wide v0, -0x36a57f99051405a7L    # -2.3640191603790152E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-wide v0, -0x36a5d6a6051405a7L    # -2.3336863901916828E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    goto/16 :goto_8

    .line 28
    .line 29
    :cond_0
    const-wide v0, -0x36a5a13b051405a7L    # -2.352299835662258E45

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const-wide v2, -0x36a5924c051405a7L    # -2.357503433617213E45

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v6, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    array-length v7, v5

    .line 56
    move v8, v4

    .line 57
    :goto_0
    if-ge v8, v7, :cond_2

    .line 58
    .line 59
    aget-object v9, v5, v8

    .line 60
    .line 61
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    const-wide v11, -0x36a5ab52051405a7L    # -2.348784038247231E45

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    const-wide v11, -0x36a5369e051405a7L    # -2.3894491422237508E45

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    invoke-static {v10, v11, v4}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰哲苏楪(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    if-eqz v10, :cond_1

    .line 90
    .line 91
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    array-length v10, v10

    .line 102
    if-nez v10, :cond_1

    .line 103
    .line 104
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    const-class v11, Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v10, v11}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    if-eqz v10, :cond_1

    .line 115
    .line 116
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :catch_0
    move-exception v5

    .line 121
    goto :goto_3

    .line 122
    :cond_1
    :goto_1
    add-int/lit8 v8, v8, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_3

    .line 134
    .line 135
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    check-cast v6, Ljava/lang/reflect/Method;

    .line 140
    .line 141
    new-instance v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;

    .line 142
    .line 143
    const/16 v8, 0x18

    .line 144
    .line 145
    invoke-direct {v7, v8}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-static {v6, v7}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :goto_3
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    .line 153
    .line 154
    .line 155
    :cond_3
    const-wide v5, -0x36a5d677051405a7L    # -2.333750363276664E45

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    :try_start_1
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-static {v7}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    if-eqz v7, :cond_6

    .line 169
    .line 170
    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    new-instance v2, Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 183
    .line 184
    .line 185
    array-length v3, v7

    .line 186
    move v8, v4

    .line 187
    :goto_4
    if-ge v8, v3, :cond_5

    .line 188
    .line 189
    aget-object v9, v7, v8

    .line 190
    .line 191
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-static {p1, v10}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世哲苏楪兰(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    if-eqz v10, :cond_4

    .line 206
    .line 207
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_5

    .line 211
    :catch_1
    move-exception v0

    .line 212
    goto :goto_7

    .line 213
    :cond_4
    :goto_5
    add-int/lit8 v8, v8, 0x1

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-eqz v1, :cond_6

    .line 225
    .line 226
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    check-cast v1, Ljava/lang/reflect/Method;

    .line 231
    .line 232
    new-instance v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏世哲兰;

    .line 233
    .line 234
    invoke-direct {v2, p1, v4}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Class;I)V

    .line 235
    .line 236
    .line 237
    invoke-static {v1, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 238
    .line 239
    .line 240
    goto :goto_6

    .line 241
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 242
    .line 243
    .line 244
    :cond_6
    const-wide v0, -0x36a554cd051405a7L    # -2.3789316948269584E45

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    :try_start_2
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-static {v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-static {v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    if-eqz v0, :cond_7

    .line 266
    .line 267
    if-eqz v1, :cond_7

    .line 268
    .line 269
    invoke-static {v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    const-wide v2, -0x36a5d643051405a7L    # -2.3338211420089835E45

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    iput-object v2, v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 283
    .line 284
    const-class v2, Ljava/util/List;

    .line 285
    .line 286
    iput-object v2, v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 287
    .line 288
    invoke-virtual {v0}, L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    const-wide v2, -0x36a592ed051405a7L    # -2.357284291772916E45

    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    check-cast v0, Ljava/lang/reflect/Method;

    .line 304
    .line 305
    new-instance v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世兰哲苏;

    .line 306
    .line 307
    invoke-direct {v2, v1, p1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0, v0, v2}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 311
    .line 312
    .line 313
    goto :goto_8

    .line 314
    :catch_2
    move-exception p0

    .line 315
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 316
    .line 317
    .line 318
    :cond_7
    :goto_8
    return-void
.end method
