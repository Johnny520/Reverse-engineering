.class public final synthetic Lio/ktor/util/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
    .locals 11

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
    const/16 v2, 0x826

    .line 8
    .line 9
    const/16 v3, 0x14

    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/16 v5, 0x3a

    .line 13
    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v7, 0x0

    .line 16
    sget-object v8, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x1

    .line 20
    packed-switch p0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast p1, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世哲兰苏楪(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    new-instance v7, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲苏兰;

    .line 45
    .line 46
    invoke-direct {v7, p1}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲苏兰;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move-object v7, p0

    .line 51
    :cond_1
    :goto_0
    return-object v7

    .line 52
    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

    .line 68
    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-static {v0, p0}, Lkotlinx/serialization/json/internal/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_1
    check-cast p1, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子世苏哲兰楪;

    .line 94
    .line 95
    const/16 v0, 0x1d

    .line 96
    .line 97
    invoke-direct {p0, v0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子世苏哲兰楪;-><init>(I)V

    .line 98
    .line 99
    .line 100
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;

    .line 101
    .line 102
    invoke-direct {v0, p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 103
    .line 104
    .line 105
    const-string p0, "JsonPrimitive"

    .line 106
    .line 107
    invoke-static {p1, p0, v0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 108
    .line 109
    .line 110
    new-instance p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;

    .line 111
    .line 112
    invoke-direct {p0, v9}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 113
    .line 114
    .line 115
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;

    .line 116
    .line 117
    invoke-direct {v0, p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 118
    .line 119
    .line 120
    const-string p0, "JsonNull"

    .line 121
    .line 122
    invoke-static {p1, p0, v0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 123
    .line 124
    .line 125
    new-instance p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;

    .line 126
    .line 127
    invoke-direct {p0, v10}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 128
    .line 129
    .line 130
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;

    .line 131
    .line 132
    invoke-direct {v0, p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 133
    .line 134
    .line 135
    const-string p0, "JsonLiteral"

    .line 136
    .line 137
    invoke-static {p1, p0, v0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 138
    .line 139
    .line 140
    new-instance p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;

    .line 141
    .line 142
    invoke-direct {p0, v6}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 143
    .line 144
    .line 145
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;

    .line 146
    .line 147
    invoke-direct {v0, p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 148
    .line 149
    .line 150
    const-string p0, "JsonObject"

    .line 151
    .line 152
    invoke-static {p1, p0, v0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 153
    .line 154
    .line 155
    new-instance p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;

    .line 156
    .line 157
    invoke-direct {p0, v4}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 158
    .line 159
    .line 160
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;

    .line 161
    .line 162
    invoke-direct {v0, p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 163
    .line 164
    .line 165
    const-string p0, "JsonArray"

    .line 166
    .line 167
    invoke-static {p1, p0, v0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 168
    .line 169
    .line 170
    return-object v8

    .line 171
    :pswitch_2
    check-cast p1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance p0, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    iget-object v0, p1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 182
    .line 183
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const/16 v0, 0x3d

    .line 187
    .line 188
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    iget-object p1, p1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 192
    .line 193
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0

    .line 201
    :pswitch_3
    check-cast p1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    iget-object p0, p1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;

    .line 207
    .line 208
    instance-of p1, p0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;

    .line 209
    .line 210
    if-eqz p1, :cond_2

    .line 211
    .line 212
    move-object v7, p0

    .line 213
    check-cast v7, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;

    .line 214
    .line 215
    :cond_2
    return-object v7

    .line 216
    :pswitch_4
    check-cast p1, Ljava/lang/Byte;

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 219
    .line 220
    .line 221
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    invoke-static {p0, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    const-string p1, "%02x"

    .line 230
    .line 231
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    return-object p0

    .line 236
    :pswitch_5
    check-cast p1, Landroid/content/Context;

    .line 237
    .line 238
    const-string p0, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 239
    .line 240
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    new-instance p0, Landroid/widget/ImageView;

    .line 247
    .line 248
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 249
    .line 250
    .line 251
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 252
    .line 253
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 254
    .line 255
    .line 256
    return-object p0

    .line 257
    :pswitch_6
    check-cast p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏世兰哲;

    .line 258
    .line 259
    const/16 p0, 0xb96

    .line 260
    .line 261
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    iget-object p0, p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲楪苏;

    .line 268
    .line 269
    new-instance p1, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 270
    .line 271
    new-instance v0, Landroidx/activity/飘花落叶言子世兰苏哲楪;

    .line 272
    .line 273
    invoke-direct {v0, v3}, Landroidx/activity/飘花落叶言子世兰苏哲楪;-><init>(I)V

    .line 274
    .line 275
    .line 276
    new-instance v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏世哲兰;

    .line 277
    .line 278
    invoke-direct {v1, v9}, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏世哲兰;-><init>(I)V

    .line 279
    .line 280
    .line 281
    new-instance v2, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 282
    .line 283
    const v3, -0x331bf287

    .line 284
    .line 285
    .line 286
    invoke-direct {v2, v3, v10, v1}, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;-><init>(IZLkotlin/飘花落叶言子楪世兰苏哲;)V

    .line 287
    .line 288
    .line 289
    invoke-direct {p1, v7, v0, v2, v6}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0, v10, p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰(ILandroidx/appcompat/app/飘花落叶言子苏楪世兰哲;)V

    .line 293
    .line 294
    .line 295
    return-object v8

    .line 296
    :pswitch_7
    check-cast p1, Ljava/lang/Integer;

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result p0

    .line 302
    div-int/lit8 p0, p0, 0x4

    .line 303
    .line 304
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    return-object p0

    .line 309
    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 312
    .line 313
    .line 314
    move-result p0

    .line 315
    neg-int p0, p0

    .line 316
    div-int/lit8 p0, p0, 0x4

    .line 317
    .line 318
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    return-object p0

    .line 323
    :pswitch_9
    check-cast p1, Ljava/lang/Integer;

    .line 324
    .line 325
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result p0

    .line 329
    neg-int p0, p0

    .line 330
    div-int/2addr p0, v6

    .line 331
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    return-object p0

    .line 336
    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    .line 337
    .line 338
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 339
    .line 340
    .line 341
    move-result p0

    .line 342
    div-int/2addr p0, v6

    .line 343
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    return-object p0

    .line 348
    :pswitch_b
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;

    .line 349
    .line 350
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    new-instance p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 357
    .line 358
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 359
    .line 360
    .line 361
    const-class v0, Ljava/util/Map;

    .line 362
    .line 363
    invoke-static {v0}, Lorg/luckypray/dexkit/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-static {p0, v0}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪哲苏(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    iput-object p0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 371
    .line 372
    new-instance p0, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;

    .line 373
    .line 374
    invoke-direct {p0, v10, v1, v10}, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;-><init>(III)V

    .line 375
    .line 376
    .line 377
    new-instance v0, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;

    .line 378
    .line 379
    const/16 v1, 0x18

    .line 380
    .line 381
    invoke-direct {v0, v3, v1, v10}, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;-><init>(III)V

    .line 382
    .line 383
    .line 384
    invoke-static {p0, v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪世苏哲(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    new-instance v0, Ljava/util/ArrayList;

    .line 389
    .line 390
    const/16 v1, 0xa

    .line 391
    .line 392
    invoke-static {p0, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    if-eqz v1, :cond_3

    .line 408
    .line 409
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    check-cast v1, Ljava/lang/Number;

    .line 414
    .line 415
    new-instance v2, L飘花落叶言苏子兰世哲楪/飘花落叶言子楪世哲苏兰;

    .line 416
    .line 417
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v1}, L飘花落叶言苏子兰世哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Number;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    goto :goto_1

    .line 427
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 428
    .line 429
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 430
    .line 431
    .line 432
    iput-object p0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/util/List;

    .line 433
    .line 434
    return-object v8

    .line 435
    :pswitch_c
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;

    .line 436
    .line 437
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    const p0, 0x3fffff

    .line 444
    .line 445
    .line 446
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 447
    .line 448
    .line 449
    move-result-object p0

    .line 450
    new-array v0, v10, [Ljava/lang/Number;

    .line 451
    .line 452
    aput-object p0, v0, v9

    .line 453
    .line 454
    new-instance p0, Ljava/util/ArrayList;

    .line 455
    .line 456
    invoke-direct {p0, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 457
    .line 458
    .line 459
    aget-object v0, v0, v9

    .line 460
    .line 461
    new-instance v1, L飘花落叶言苏子兰世哲楪/飘花落叶言子楪世哲苏兰;

    .line 462
    .line 463
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v1, v0}, L飘花落叶言苏子兰世哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Number;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    new-instance v0, Ljava/util/ArrayList;

    .line 473
    .line 474
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 475
    .line 476
    .line 477
    iput-object v0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/util/List;

    .line 478
    .line 479
    return-object v8

    .line 480
    :pswitch_d
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 481
    .line 482
    const/16 p0, 0x828

    .line 483
    .line 484
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    const-string p0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 491
    .line 492
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object p0

    .line 496
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 497
    .line 498
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    filled-new-array {p0, v0}, [Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    new-instance v0, Ljava/util/ArrayList;

    .line 507
    .line 508
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 509
    .line 510
    .line 511
    move v2, v9

    .line 512
    :goto_2
    if-ge v2, v6, :cond_4

    .line 513
    .line 514
    aget-object v3, p0, v2

    .line 515
    .line 516
    new-instance v4, L飘花落叶言苏子兰世哲楪/飘花落叶言子楪世哲兰苏;

    .line 517
    .line 518
    sget-object v5, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 519
    .line 520
    invoke-direct {v4, v3, v5, v9}, L飘花落叶言苏子兰世哲楪/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    add-int/lit8 v2, v2, 0x1

    .line 527
    .line 528
    goto :goto_2

    .line 529
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 530
    .line 531
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 532
    .line 533
    .line 534
    iput-object p0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:Ljava/util/ArrayList;

    .line 535
    .line 536
    new-instance p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;

    .line 537
    .line 538
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;-><init>()V

    .line 539
    .line 540
    .line 541
    const/16 v0, 0x827

    .line 542
    .line 543
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    new-instance v0, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 547
    .line 548
    const/16 v2, 0x10

    .line 549
    .line 550
    invoke-direct {v0, v2}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 551
    .line 552
    .line 553
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;

    .line 554
    .line 555
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v0, v2}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰楪苏哲(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;)V

    .line 562
    .line 563
    .line 564
    new-instance v0, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 565
    .line 566
    invoke-direct {v0, v1}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 567
    .line 568
    .line 569
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;

    .line 570
    .line 571
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v0, v1}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰楪苏哲(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;)V

    .line 578
    .line 579
    .line 580
    iput-object p0, p1, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;

    .line 581
    .line 582
    return-object v8

    .line 583
    :pswitch_e
    check-cast p1, Ljava/lang/String;

    .line 584
    .line 585
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    return-object v8

    .line 589
    :pswitch_f
    check-cast p1, Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 590
    .line 591
    instance-of p0, p1, Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 592
    .line 593
    if-eqz p0, :cond_5

    .line 594
    .line 595
    move-object v7, p1

    .line 596
    check-cast v7, Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 597
    .line 598
    :cond_5
    return-object v7

    .line 599
    :pswitch_10
    check-cast p1, Ljava/lang/Character;

    .line 600
    .line 601
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 602
    .line 603
    .line 604
    move-result p0

    .line 605
    const/16 p1, 0x30

    .line 606
    .line 607
    if-gt p1, p0, :cond_6

    .line 608
    .line 609
    if-ge p0, v5, :cond_6

    .line 610
    .line 611
    move v9, v10

    .line 612
    :cond_6
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 613
    .line 614
    .line 615
    move-result-object p0

    .line 616
    return-object p0

    .line 617
    :pswitch_11
    check-cast p1, Ljava/lang/Character;

    .line 618
    .line 619
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 620
    .line 621
    .line 622
    move-result p0

    .line 623
    if-ne p0, v5, :cond_7

    .line 624
    .line 625
    move v9, v10

    .line 626
    :cond_7
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 627
    .line 628
    .line 629
    move-result-object p0

    .line 630
    return-object p0

    .line 631
    :pswitch_12
    check-cast p1, Ljava/lang/Character;

    .line 632
    .line 633
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 634
    .line 635
    .line 636
    move-result p0

    .line 637
    if-ne p0, v5, :cond_8

    .line 638
    .line 639
    move v9, v10

    .line 640
    :cond_8
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 641
    .line 642
    .line 643
    move-result-object p0

    .line 644
    return-object p0

    .line 645
    :pswitch_13
    check-cast p1, Ljava/lang/Character;

    .line 646
    .line 647
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 648
    .line 649
    .line 650
    move-result p0

    .line 651
    const/16 p1, 0x54

    .line 652
    .line 653
    if-eq p0, p1, :cond_9

    .line 654
    .line 655
    const/16 p1, 0x74

    .line 656
    .line 657
    if-ne p0, p1, :cond_a

    .line 658
    .line 659
    :cond_9
    move v9, v10

    .line 660
    :cond_a
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 661
    .line 662
    .line 663
    move-result-object p0

    .line 664
    return-object p0

    .line 665
    :pswitch_14
    check-cast p1, Ljava/lang/Character;

    .line 666
    .line 667
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 668
    .line 669
    .line 670
    move-result p0

    .line 671
    if-ne p0, v0, :cond_b

    .line 672
    .line 673
    move v9, v10

    .line 674
    :cond_b
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 675
    .line 676
    .line 677
    move-result-object p0

    .line 678
    return-object p0

    .line 679
    :pswitch_15
    check-cast p1, Ljava/lang/Character;

    .line 680
    .line 681
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 682
    .line 683
    .line 684
    move-result p0

    .line 685
    if-ne p0, v0, :cond_c

    .line 686
    .line 687
    move v9, v10

    .line 688
    :cond_c
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 689
    .line 690
    .line 691
    move-result-object p0

    .line 692
    return-object p0

    .line 693
    :pswitch_16
    if-nez p1, :cond_d

    .line 694
    .line 695
    move v9, v10

    .line 696
    :cond_d
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 697
    .line 698
    .line 699
    move-result-object p0

    .line 700
    return-object p0

    .line 701
    :pswitch_17
    check-cast p1, Lkotlin/sequences/飘花落叶言子楪苏哲世兰;

    .line 702
    .line 703
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    invoke-interface {p1}, Lkotlin/sequences/飘花落叶言子楪苏哲世兰;->iterator()Ljava/util/Iterator;

    .line 707
    .line 708
    .line 709
    move-result-object p0

    .line 710
    return-object p0

    .line 711
    :pswitch_18
    check-cast p1, Lkotlin/reflect/飘花落叶言子世楪哲兰苏;

    .line 712
    .line 713
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    iget-object p0, p1, Lkotlin/reflect/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/KVariance;

    .line 717
    .line 718
    if-nez p0, :cond_e

    .line 719
    .line 720
    const-string v7, "*"

    .line 721
    .line 722
    goto :goto_5

    .line 723
    :cond_e
    iget-object p1, p1, Lkotlin/reflect/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 724
    .line 725
    instance-of v0, p1, Lkotlin/jvm/internal/飘花落叶言子楪哲兰苏世;

    .line 726
    .line 727
    if-eqz v0, :cond_f

    .line 728
    .line 729
    move-object v0, p1

    .line 730
    check-cast v0, Lkotlin/jvm/internal/飘花落叶言子楪哲兰苏世;

    .line 731
    .line 732
    goto :goto_3

    .line 733
    :cond_f
    move-object v0, v7

    .line 734
    :goto_3
    if-eqz v0, :cond_10

    .line 735
    .line 736
    invoke-virtual {v0, v10}, Lkotlin/jvm/internal/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(Z)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object p1

    .line 740
    goto :goto_4

    .line 741
    :cond_10
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object p1

    .line 745
    :goto_4
    sget-object v0, Lkotlin/jvm/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:[I

    .line 746
    .line 747
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 748
    .line 749
    .line 750
    move-result p0

    .line 751
    aget p0, v0, p0

    .line 752
    .line 753
    if-eq p0, v10, :cond_13

    .line 754
    .line 755
    if-eq p0, v6, :cond_12

    .line 756
    .line 757
    if-ne p0, v4, :cond_11

    .line 758
    .line 759
    const-string p0, "out "

    .line 760
    .line 761
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v7

    .line 765
    goto :goto_5

    .line 766
    :cond_11
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 767
    .line 768
    .line 769
    goto :goto_5

    .line 770
    :cond_12
    const-string p0, "in "

    .line 771
    .line 772
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v7

    .line 776
    goto :goto_5

    .line 777
    :cond_13
    move-object v7, p1

    .line 778
    :goto_5
    return-object v7

    .line 779
    :pswitch_19
    check-cast p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏世哲兰;

    .line 780
    .line 781
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    iput-boolean v10, p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Z

    .line 785
    .line 786
    iput-boolean v10, p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Z

    .line 787
    .line 788
    iput-boolean v10, p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Z

    .line 789
    .line 790
    sget-object p0, Lkotlinx/serialization/json/ClassDiscriminatorMode;->NONE:Lkotlinx/serialization/json/ClassDiscriminatorMode;

    .line 791
    .line 792
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    iput-object p0, p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:Lkotlinx/serialization/json/ClassDiscriminatorMode;

    .line 796
    .line 797
    iput-boolean v9, p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 798
    .line 799
    return-object v8

    .line 800
    :pswitch_1a
    check-cast p1, Ljava/lang/Throwable;

    .line 801
    .line 802
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    return-object v8

    .line 806
    :pswitch_1b
    check-cast p1, Ljava/lang/Throwable;

    .line 807
    .line 808
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    return-object v8

    .line 812
    :pswitch_1c
    check-cast p1, Ljava/lang/String;

    .line 813
    .line 814
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    new-instance p0, Lio/ktor/util/飘花落叶言子楪世兰苏哲;

    .line 818
    .line 819
    invoke-direct {p0, p1}, Lio/ktor/util/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    return-object p0

    .line 823
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
