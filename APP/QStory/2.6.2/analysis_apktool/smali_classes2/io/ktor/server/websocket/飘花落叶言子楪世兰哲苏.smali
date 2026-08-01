.class public final Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;
.super Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰苏哲世;

.field public final 飘花落叶言子楪世哲苏兰:Lio/ktor/server/websocket/飘花落叶言子楪苏世兰哲;

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    const-string v1, "raw-ws-handler"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;Ljava/lang/String;ZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 5
    .line 6
    invoke-virtual {p1}, Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    .line 9
    move-result-object p4

    .line 10
    sget-object v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "Sec-WebSocket-Key"

    .line 13
    .line 14
    invoke-static {p4, v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏(Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p4

    .line 18
    iget-object v0, p1, Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世哲苏:Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    sget-object v1, Lio/ktor/server/websocket/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Lio/ktor/server/websocket/飘花落叶言子楪苏世哲兰;

    .line 21
    .line 22
    invoke-static {v0}, Lio/ktor/server/application/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lio/ktor/server/websocket/飘花落叶言子楪苏世兰哲;

    .line 27
    .line 28
    iput-object v0, p0, Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Lio/ktor/server/websocket/飘花落叶言子楪苏世兰哲;

    .line 29
    .line 30
    sget-object v1, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰世苏哲;

    .line 31
    .line 32
    new-instance v1, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰苏世哲;

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-direct {v1, v2}, Landroidx/compose/runtime/飘花落叶言子哲世苏楪兰;-><init>(I)V

    .line 36
    .line 37
    .line 38
    const-string v2, "websocket"

    .line 39
    .line 40
    const-string v3, "Upgrade"

    .line 41
    .line 42
    invoke-virtual {v1, v3, v2}, Landroidx/compose/runtime/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世兰哲楪(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v2, "Connection"

    .line 46
    .line 47
    invoke-virtual {v1, v2, v3}, Landroidx/compose/runtime/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世兰哲楪(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    if-eqz p4, :cond_0

    .line 51
    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-static {p4}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲苏楪兰世(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p4

    .line 65
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p4, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"

    .line 69
    .line 70
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p4

    .line 77
    sget-object v2, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/nio/charset/Charset;

    .line 78
    .line 79
    invoke-static {p4, v2}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    .line 80
    .line 81
    .line 82
    move-result-object p4

    .line 83
    const-string v2, "SHA1"

    .line 84
    .line 85
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2, p4}, Ljava/security/MessageDigest;->digest([B)[B

    .line 90
    .line 91
    .line 92
    move-result-object p4

    .line 93
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {p4}, Lio/ktor/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([B)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    const-string v2, "Sec-WebSocket-Accept"

    .line 101
    .line 102
    invoke-virtual {v1, v2, p4}, Landroidx/compose/runtime/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世兰哲楪(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_0
    if-eqz p2, :cond_1

    .line 106
    .line 107
    const-string p4, "Sec-WebSocket-Protocol"

    .line 108
    .line 109
    invoke-virtual {v1, p4, p2}, Landroidx/compose/runtime/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世兰哲楪(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    if-nez p3, :cond_2

    .line 113
    .line 114
    sget-object p2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 115
    .line 116
    goto/16 :goto_3

    .line 117
    .line 118
    :cond_2
    invoke-virtual {p1}, Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    const-string p3, "Sec-WebSocket-Extensions"

    .line 123
    .line 124
    invoke-static {p2, p3}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏(Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    const/16 p4, 0xa

    .line 129
    .line 130
    if-eqz p2, :cond_4

    .line 131
    .line 132
    const-string v2, ","

    .line 133
    .line 134
    filled-new-array {v2}, [Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    const/4 v3, 0x6

    .line 139
    invoke-static {p2, v2, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲楪苏兰世(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    new-instance v2, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-static {p2, p4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_5

    .line 161
    .line 162
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    check-cast v4, Ljava/lang/String;

    .line 167
    .line 168
    const-string v5, ";"

    .line 169
    .line 170
    filled-new-array {v5}, [Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-static {v4, v5, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲楪苏兰世(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-static {v4}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏楪世哲兰(Ljava/util/List;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    check-cast v5, Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {v5}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲苏楪兰世(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    const/4 v6, 0x1

    .line 193
    invoke-static {v6, v4}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子世兰苏楪哲(ILjava/util/List;)Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    new-instance v6, Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-static {v4, p4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-eqz v7, :cond_3

    .line 215
    .line 216
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    check-cast v7, Ljava/lang/String;

    .line 221
    .line 222
    invoke-static {v7}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲苏楪兰世(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_3
    new-instance v4, Lio/ktor/websocket/飘花落叶言子楪兰苏哲世;

    .line 235
    .line 236
    invoke-direct {v4, v5, v6}, Lio/ktor/websocket/飘花落叶言子楪兰苏哲世;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    goto :goto_0

    .line 243
    :cond_4
    sget-object p2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 244
    .line 245
    :cond_5
    iget-object p2, v0, Lio/ktor/server/websocket/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    .line 246
    .line 247
    iget-object p2, p2, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 248
    .line 249
    new-instance v0, Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-static {p2, p4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 252
    .line 253
    .line 254
    move-result p4

    .line 255
    invoke-direct {v0, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result p4

    .line 266
    if-eqz p4, :cond_7

    .line 267
    .line 268
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p4

    .line 272
    check-cast p4, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 273
    .line 274
    invoke-interface {p4}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p4

    .line 278
    const/4 v2, 0x0

    .line 279
    if-nez p4, :cond_6

    .line 280
    .line 281
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_6
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 286
    .line 287
    .line 288
    throw v2

    .line 289
    :cond_7
    new-instance v3, Ljava/util/ArrayList;

    .line 290
    .line 291
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 292
    .line 293
    .line 294
    new-instance p2, Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 300
    .line 301
    .line 302
    move-result-object p4

    .line 303
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-nez v0, :cond_9

    .line 308
    .line 309
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 310
    .line 311
    .line 312
    move-result p4

    .line 313
    if-nez p4, :cond_8

    .line 314
    .line 315
    const/4 v7, 0x0

    .line 316
    const/16 v8, 0x3e

    .line 317
    .line 318
    const-string v4, ";"

    .line 319
    .line 320
    const/4 v5, 0x0

    .line 321
    const/4 v6, 0x0

    .line 322
    invoke-static/range {v3 .. v8}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p4

    .line 326
    invoke-virtual {v1, p3, p4}, Landroidx/compose/runtime/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世兰哲楪(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    :cond_8
    :goto_3
    iget-object p1, p1, Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:Lio/ktor/util/飘花落叶言子楪世兰哲苏;

    .line 330
    .line 331
    sget-object p3, Lio/ktor/server/websocket/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 332
    .line 333
    invoke-virtual {p1, p3, p2}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Lio/ktor/util/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子哲世苏兰楪()L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰苏哲世;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    iput-object p1, p0, Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰苏哲世;

    .line 341
    .line 342
    return-void

    .line 343
    :cond_9
    invoke-static {p4}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    throw p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲()L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    sget-object p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世苏哲:L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;

    .line 4
    .line 5
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰世哲苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;
    .locals 8

    .line 1
    iget-object v0, p0, Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Lio/ktor/server/websocket/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    iget-wide v4, v0, Lio/ktor/server/websocket/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:J

    .line 4
    .line 5
    invoke-interface {p4}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;

    .line 10
    .line 11
    invoke-interface {p4, v0}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    check-cast p4, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 16
    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object p4, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 21
    .line 22
    :goto_0
    invoke-interface {p3, p4}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v1, Lio/ktor/websocket/飘花落叶言子楪兰世哲苏;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    move-object v2, p1

    .line 39
    move-object v3, p2

    .line 40
    invoke-direct/range {v1 .. v7}, Lio/ktor/websocket/飘花落叶言子楪兰世哲苏;-><init>(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;JZLkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;

    .line 44
    .line 45
    const/4 p2, 0x0

    .line 46
    invoke-direct {p1, p0, v1, p2}, Lio/ktor/server/websocket/WebSocketUpgrade$upgrade$2;-><init>(Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x2

    .line 50
    sget-object p3, Lio/ktor/server/websocket/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 51
    .line 52
    invoke-static {v1, p3, p2, p1, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 53
    .line 54
    .line 55
    iget-object p0, v1, Lio/ktor/websocket/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 56
    .line 57
    invoke-interface {p0, v0}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    return-object p0
.end method
