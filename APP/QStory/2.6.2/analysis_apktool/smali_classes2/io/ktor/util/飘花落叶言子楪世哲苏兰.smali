.class public final synthetic Lio/ktor/util/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lio/ktor/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 7
    iput p2, p0, Lio/ktor/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget p0, p0, Lio/ktor/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/16 v0, 0x2d

    .line 4
    .line 5
    const/16 v1, 0x11

    .line 6
    .line 7
    const-wide v2, -0x36a5cdef051405a7L    # -2.3367230700340852E45

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/16 v4, 0x14

    .line 13
    .line 14
    const/4 v5, 0x3

    .line 15
    const/16 v6, 0x3a

    .line 16
    .line 17
    const/4 v7, 0x2

    .line 18
    const/4 v8, 0x0

    .line 19
    sget-object v9, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    const/4 v11, 0x1

    .line 23
    packed-switch p0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast p1, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子苏世楪哲兰(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-nez p0, :cond_0

    .line 36
    .line 37
    invoke-static {p1}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    new-instance v8, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲苏兰;

    .line 48
    .line 49
    invoke-direct {v8, p1}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲苏兰;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move-object v8, p0

    .line 54
    :cond_1
    :goto_0
    return-object v8

    .line 55
    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Ljava/lang/String;

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

    .line 71
    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-static {v0, p0}, Lkotlinx/serialization/json/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_1
    check-cast p1, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子世苏哲兰楪;

    .line 97
    .line 98
    const/16 v0, 0x1d

    .line 99
    .line 100
    invoke-direct {p0, v0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子世苏哲兰楪;-><init>(I)V

    .line 101
    .line 102
    .line 103
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;

    .line 104
    .line 105
    invoke-direct {v0, p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 106
    .line 107
    .line 108
    const-string p0, "JsonPrimitive"

    .line 109
    .line 110
    invoke-static {p1, p0, v0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 111
    .line 112
    .line 113
    new-instance p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;

    .line 114
    .line 115
    invoke-direct {p0, v10}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 116
    .line 117
    .line 118
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;

    .line 119
    .line 120
    invoke-direct {v0, p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 121
    .line 122
    .line 123
    const-string p0, "JsonNull"

    .line 124
    .line 125
    invoke-static {p1, p0, v0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 126
    .line 127
    .line 128
    new-instance p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;

    .line 129
    .line 130
    invoke-direct {p0, v11}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 131
    .line 132
    .line 133
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;

    .line 134
    .line 135
    invoke-direct {v0, p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 136
    .line 137
    .line 138
    const-string p0, "JsonLiteral"

    .line 139
    .line 140
    invoke-static {p1, p0, v0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 141
    .line 142
    .line 143
    new-instance p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;

    .line 144
    .line 145
    invoke-direct {p0, v7}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 146
    .line 147
    .line 148
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;

    .line 149
    .line 150
    invoke-direct {v0, p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 151
    .line 152
    .line 153
    const-string p0, "JsonObject"

    .line 154
    .line 155
    invoke-static {p1, p0, v0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 156
    .line 157
    .line 158
    new-instance p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;

    .line 159
    .line 160
    invoke-direct {p0, v5}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 161
    .line 162
    .line 163
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;

    .line 164
    .line 165
    invoke-direct {v0, p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 166
    .line 167
    .line 168
    const-string p0, "JsonArray"

    .line 169
    .line 170
    invoke-static {p1, p0, v0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 171
    .line 172
    .line 173
    return-object v9

    .line 174
    :pswitch_2
    check-cast p1, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪世苏兰哲;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-instance p0, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    iget-object v0, p1, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 185
    .line 186
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const/16 v0, 0x3d

    .line 190
    .line 191
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    iget-object p1, p1, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 195
    .line 196
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    return-object p0

    .line 204
    :pswitch_3
    check-cast p1, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪世苏兰哲;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    iget-object p0, p1, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;

    .line 210
    .line 211
    instance-of p1, p0, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪世苏兰哲;

    .line 212
    .line 213
    if-eqz p1, :cond_2

    .line 214
    .line 215
    move-object v8, p0

    .line 216
    check-cast v8, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪世苏兰哲;

    .line 217
    .line 218
    :cond_2
    return-object v8

    .line 219
    :pswitch_4
    check-cast p1, Ljava/lang/Byte;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 222
    .line 223
    .line 224
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-static {p0, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    const-string p1, "%02x"

    .line 233
    .line 234
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    return-object p0

    .line 239
    :pswitch_5
    check-cast p1, Landroid/content/Context;

    .line 240
    .line 241
    const-wide v0, -0x36a5fae6051405a7L    # -2.3210551087315776E45

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    new-instance p0, Landroid/widget/ImageView;

    .line 253
    .line 254
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 255
    .line 256
    .line 257
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 258
    .line 259
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 260
    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_6
    check-cast p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏世兰哲;

    .line 264
    .line 265
    const-wide v0, -0x36a41f90051405a7L    # -2.4866855091361428E45

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    iget-object p0, p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲楪苏;

    .line 277
    .line 278
    new-instance p1, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 279
    .line 280
    new-instance v0, Landroidx/activity/飘花落叶言子世兰苏哲楪;

    .line 281
    .line 282
    invoke-direct {v0, v4}, Landroidx/activity/飘花落叶言子世兰苏哲楪;-><init>(I)V

    .line 283
    .line 284
    .line 285
    new-instance v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏世哲兰;

    .line 286
    .line 287
    invoke-direct {v1, v10}, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏世哲兰;-><init>(I)V

    .line 288
    .line 289
    .line 290
    new-instance v2, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 291
    .line 292
    const v3, -0x331bf287

    .line 293
    .line 294
    .line 295
    invoke-direct {v2, v3, v11, v1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;-><init>(IZLkotlin/飘花落叶言子楪世兰苏哲;)V

    .line 296
    .line 297
    .line 298
    invoke-direct {p1, v8, v0, v2, v7}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0, v11, p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰(ILandroidx/appcompat/app/飘花落叶言子苏楪世兰哲;)V

    .line 302
    .line 303
    .line 304
    return-object v9

    .line 305
    :pswitch_7
    check-cast p1, Ljava/lang/Integer;

    .line 306
    .line 307
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 308
    .line 309
    .line 310
    move-result p0

    .line 311
    div-int/2addr p0, v7

    .line 312
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    return-object p0

    .line 317
    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    .line 318
    .line 319
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 320
    .line 321
    .line 322
    move-result p0

    .line 323
    div-int/lit8 p0, p0, 0x4

    .line 324
    .line 325
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    return-object p0

    .line 330
    :pswitch_9
    check-cast p1, Ljava/lang/Integer;

    .line 331
    .line 332
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 333
    .line 334
    .line 335
    move-result p0

    .line 336
    neg-int p0, p0

    .line 337
    div-int/lit8 p0, p0, 0x4

    .line 338
    .line 339
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    return-object p0

    .line 344
    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    .line 345
    .line 346
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 347
    .line 348
    .line 349
    move-result p0

    .line 350
    neg-int p0, p0

    .line 351
    div-int/2addr p0, v7

    .line 352
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    return-object p0

    .line 357
    :pswitch_b
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;

    .line 358
    .line 359
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    new-instance p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 366
    .line 367
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 368
    .line 369
    .line 370
    const-class v0, Ljava/util/Map;

    .line 371
    .line 372
    invoke-static {v0}, Lorg/luckypray/dexkit/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-static {p0, v0}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰楪哲(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    iput-object p0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 380
    .line 381
    new-instance p0, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;

    .line 382
    .line 383
    invoke-direct {p0, v11, v1, v11}, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;-><init>(III)V

    .line 384
    .line 385
    .line 386
    new-instance v0, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;

    .line 387
    .line 388
    const/16 v1, 0x18

    .line 389
    .line 390
    invoke-direct {v0, v4, v1, v11}, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;-><init>(III)V

    .line 391
    .line 392
    .line 393
    invoke-static {p0, v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    new-instance v0, Ljava/util/ArrayList;

    .line 398
    .line 399
    const/16 v1, 0xa

    .line 400
    .line 401
    invoke-static {p0, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    if-eqz v1, :cond_3

    .line 417
    .line 418
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    check-cast v1, Ljava/lang/Number;

    .line 423
    .line 424
    new-instance v2, L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世哲苏兰;

    .line 425
    .line 426
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2, v1}, L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Number;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    goto :goto_1

    .line 436
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 437
    .line 438
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 439
    .line 440
    .line 441
    iput-object p0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲:Ljava/util/List;

    .line 442
    .line 443
    return-object v9

    .line 444
    :pswitch_c
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;

    .line 445
    .line 446
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    const p0, 0x3fffff

    .line 453
    .line 454
    .line 455
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    new-array v0, v11, [Ljava/lang/Number;

    .line 460
    .line 461
    aput-object p0, v0, v10

    .line 462
    .line 463
    new-instance p0, Ljava/util/ArrayList;

    .line 464
    .line 465
    invoke-direct {p0, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 466
    .line 467
    .line 468
    aget-object v0, v0, v10

    .line 469
    .line 470
    new-instance v1, L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世哲苏兰;

    .line 471
    .line 472
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v1, v0}, L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Number;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    new-instance v0, Ljava/util/ArrayList;

    .line 482
    .line 483
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 484
    .line 485
    .line 486
    iput-object v0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲:Ljava/util/List;

    .line 487
    .line 488
    return-object v9

    .line 489
    :pswitch_d
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 490
    .line 491
    const-wide v2, -0x36a5cdc7051405a7L    # -2.3367775152127926E45

    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    const-wide v2, -0x36a5cdb5051405a7L    # -2.336802015543211E45

    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object p0

    .line 511
    const-wide v2, -0x36a52cce051405a7L    # -2.3928682994465724E45

    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    filled-new-array {p0, v0}, [Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object p0

    .line 524
    new-instance v0, Ljava/util/ArrayList;

    .line 525
    .line 526
    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 527
    .line 528
    .line 529
    move v2, v10

    .line 530
    :goto_2
    if-ge v2, v7, :cond_4

    .line 531
    .line 532
    aget-object v3, p0, v2

    .line 533
    .line 534
    new-instance v4, L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世哲兰苏;

    .line 535
    .line 536
    sget-object v5, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 537
    .line 538
    invoke-direct {v4, v3, v5, v10}, L飘花落叶言苏子兰哲楪世/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    add-int/lit8 v2, v2, 0x1

    .line 545
    .line 546
    goto :goto_2

    .line 547
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 548
    .line 549
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 550
    .line 551
    .line 552
    iput-object p0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 553
    .line 554
    new-instance p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;

    .line 555
    .line 556
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;-><init>()V

    .line 557
    .line 558
    .line 559
    const-wide v2, -0x36a5cdd1051405a7L    # -2.3367639039181158E45

    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    new-instance v0, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 568
    .line 569
    const/16 v2, 0x10

    .line 570
    .line 571
    invoke-direct {v0, v2}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 572
    .line 573
    .line 574
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;

    .line 575
    .line 576
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v0, v2}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲兰楪(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;)V

    .line 583
    .line 584
    .line 585
    new-instance v0, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 586
    .line 587
    invoke-direct {v0, v1}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 588
    .line 589
    .line 590
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;

    .line 591
    .line 592
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0, v1}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲兰楪(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;)V

    .line 599
    .line 600
    .line 601
    iput-object p0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;

    .line 602
    .line 603
    return-object v9

    .line 604
    :pswitch_e
    check-cast p1, Ljava/lang/String;

    .line 605
    .line 606
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    return-object v9

    .line 610
    :pswitch_f
    check-cast p1, Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 611
    .line 612
    instance-of p0, p1, Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 613
    .line 614
    if-eqz p0, :cond_5

    .line 615
    .line 616
    move-object v8, p1

    .line 617
    check-cast v8, Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 618
    .line 619
    :cond_5
    return-object v8

    .line 620
    :pswitch_10
    check-cast p1, Ljava/lang/Character;

    .line 621
    .line 622
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 623
    .line 624
    .line 625
    move-result p0

    .line 626
    const/16 p1, 0x30

    .line 627
    .line 628
    if-gt p1, p0, :cond_6

    .line 629
    .line 630
    if-ge p0, v6, :cond_6

    .line 631
    .line 632
    move v10, v11

    .line 633
    :cond_6
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 634
    .line 635
    .line 636
    move-result-object p0

    .line 637
    return-object p0

    .line 638
    :pswitch_11
    check-cast p1, Ljava/lang/Character;

    .line 639
    .line 640
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 641
    .line 642
    .line 643
    move-result p0

    .line 644
    if-ne p0, v6, :cond_7

    .line 645
    .line 646
    move v10, v11

    .line 647
    :cond_7
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 648
    .line 649
    .line 650
    move-result-object p0

    .line 651
    return-object p0

    .line 652
    :pswitch_12
    check-cast p1, Ljava/lang/Character;

    .line 653
    .line 654
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 655
    .line 656
    .line 657
    move-result p0

    .line 658
    if-ne p0, v6, :cond_8

    .line 659
    .line 660
    move v10, v11

    .line 661
    :cond_8
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 662
    .line 663
    .line 664
    move-result-object p0

    .line 665
    return-object p0

    .line 666
    :pswitch_13
    check-cast p1, Ljava/lang/Character;

    .line 667
    .line 668
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 669
    .line 670
    .line 671
    move-result p0

    .line 672
    const/16 p1, 0x54

    .line 673
    .line 674
    if-eq p0, p1, :cond_9

    .line 675
    .line 676
    const/16 p1, 0x74

    .line 677
    .line 678
    if-ne p0, p1, :cond_a

    .line 679
    .line 680
    :cond_9
    move v10, v11

    .line 681
    :cond_a
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 682
    .line 683
    .line 684
    move-result-object p0

    .line 685
    return-object p0

    .line 686
    :pswitch_14
    check-cast p1, Ljava/lang/Character;

    .line 687
    .line 688
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 689
    .line 690
    .line 691
    move-result p0

    .line 692
    if-ne p0, v0, :cond_b

    .line 693
    .line 694
    move v10, v11

    .line 695
    :cond_b
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 696
    .line 697
    .line 698
    move-result-object p0

    .line 699
    return-object p0

    .line 700
    :pswitch_15
    check-cast p1, Ljava/lang/Character;

    .line 701
    .line 702
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 703
    .line 704
    .line 705
    move-result p0

    .line 706
    if-ne p0, v0, :cond_c

    .line 707
    .line 708
    move v10, v11

    .line 709
    :cond_c
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 710
    .line 711
    .line 712
    move-result-object p0

    .line 713
    return-object p0

    .line 714
    :pswitch_16
    if-nez p1, :cond_d

    .line 715
    .line 716
    move v10, v11

    .line 717
    :cond_d
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 718
    .line 719
    .line 720
    move-result-object p0

    .line 721
    return-object p0

    .line 722
    :pswitch_17
    check-cast p1, Lkotlin/sequences/飘花落叶言子楪苏哲世兰;

    .line 723
    .line 724
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    invoke-interface {p1}, Lkotlin/sequences/飘花落叶言子楪苏哲世兰;->iterator()Ljava/util/Iterator;

    .line 728
    .line 729
    .line 730
    move-result-object p0

    .line 731
    return-object p0

    .line 732
    :pswitch_18
    check-cast p1, Lkotlin/reflect/飘花落叶言子世楪哲兰苏;

    .line 733
    .line 734
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    iget-object p0, p1, Lkotlin/reflect/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/KVariance;

    .line 738
    .line 739
    if-nez p0, :cond_e

    .line 740
    .line 741
    const-string v8, "*"

    .line 742
    .line 743
    goto :goto_5

    .line 744
    :cond_e
    iget-object p1, p1, Lkotlin/reflect/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 745
    .line 746
    instance-of v0, p1, Lkotlin/jvm/internal/飘花落叶言子楪哲兰苏世;

    .line 747
    .line 748
    if-eqz v0, :cond_f

    .line 749
    .line 750
    move-object v0, p1

    .line 751
    check-cast v0, Lkotlin/jvm/internal/飘花落叶言子楪哲兰苏世;

    .line 752
    .line 753
    goto :goto_3

    .line 754
    :cond_f
    move-object v0, v8

    .line 755
    :goto_3
    if-eqz v0, :cond_10

    .line 756
    .line 757
    invoke-virtual {v0, v11}, Lkotlin/jvm/internal/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(Z)Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object p1

    .line 761
    goto :goto_4

    .line 762
    :cond_10
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object p1

    .line 766
    :goto_4
    sget-object v0, Lkotlin/jvm/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:[I

    .line 767
    .line 768
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 769
    .line 770
    .line 771
    move-result p0

    .line 772
    aget p0, v0, p0

    .line 773
    .line 774
    if-eq p0, v11, :cond_13

    .line 775
    .line 776
    if-eq p0, v7, :cond_12

    .line 777
    .line 778
    if-ne p0, v5, :cond_11

    .line 779
    .line 780
    const-string p0, "out "

    .line 781
    .line 782
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v8

    .line 786
    goto :goto_5

    .line 787
    :cond_11
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 788
    .line 789
    .line 790
    goto :goto_5

    .line 791
    :cond_12
    const-string p0, "in "

    .line 792
    .line 793
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v8

    .line 797
    goto :goto_5

    .line 798
    :cond_13
    move-object v8, p1

    .line 799
    :goto_5
    return-object v8

    .line 800
    :pswitch_19
    check-cast p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏世哲兰;

    .line 801
    .line 802
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    iput-boolean v11, p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Z

    .line 806
    .line 807
    iput-boolean v11, p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Z

    .line 808
    .line 809
    iput-boolean v11, p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Z

    .line 810
    .line 811
    sget-object p0, Lkotlinx/serialization/json/ClassDiscriminatorMode;->NONE:Lkotlinx/serialization/json/ClassDiscriminatorMode;

    .line 812
    .line 813
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    iput-object p0, p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:Lkotlinx/serialization/json/ClassDiscriminatorMode;

    .line 817
    .line 818
    iput-boolean v10, p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 819
    .line 820
    return-object v9

    .line 821
    :pswitch_1a
    check-cast p1, Ljava/lang/Throwable;

    .line 822
    .line 823
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 824
    .line 825
    .line 826
    return-object v9

    .line 827
    :pswitch_1b
    check-cast p1, Ljava/lang/Throwable;

    .line 828
    .line 829
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    return-object v9

    .line 833
    :pswitch_1c
    check-cast p1, Ljava/lang/String;

    .line 834
    .line 835
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    new-instance p0, Lio/ktor/util/飘花落叶言子楪世兰苏哲;

    .line 839
    .line 840
    invoke-direct {p0, p1}, Lio/ktor/util/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    return-object p0

    .line 844
    nop

    .line 845
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
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
