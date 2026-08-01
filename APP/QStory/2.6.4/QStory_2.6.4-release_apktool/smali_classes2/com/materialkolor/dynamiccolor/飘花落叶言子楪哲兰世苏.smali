.class public final synthetic Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget p0, p0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lio/ktor/server/routing/飘花落叶言子世楪兰苏哲;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object p0, Lio/ktor/server/routing/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    invoke-interface {p0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->isTraceEnabled()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_4

    .line 22
    .line 23
    iget-object v4, p1, Lio/ktor/server/routing/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v3, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lio/ktor/server/routing/飘花落叶言子世楪兰苏哲;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 v10, 0xa

    .line 38
    .line 39
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v5, p1, Lio/ktor/server/routing/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲苏兰:Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;

    .line 43
    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    invoke-virtual {v5, v3, v2}, Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/StringBuilder;I)V

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object v2, p1, Lio/ktor/server/routing/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲兰苏:Lio/ktor/server/routing/飘花落叶言子世楪哲兰苏;

    .line 50
    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const-string v2, "Matched routes:"

    .line 55
    .line 56
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    const-string v2, "  No results"

    .line 69
    .line 70
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    new-instance v8, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;

    .line 78
    .line 79
    const/16 v2, 0x1b

    .line 80
    .line 81
    invoke-direct {v8, v2}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;-><init>(I)V

    .line 82
    .line 83
    .line 84
    const/16 v9, 0x1e

    .line 85
    .line 86
    const-string v5, "\n"

    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    const/4 v7, 0x0

    .line 90
    invoke-static/range {v4 .. v9}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :goto_0
    const-string v2, "Routing resolve result:"

    .line 101
    .line 102
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    new-instance v2, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v4, "  "

    .line 111
    .line 112
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p1, Lio/ktor/server/routing/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲兰苏:Lio/ktor/server/routing/飘花落叶言子世楪哲兰苏;

    .line 116
    .line 117
    if-eqz p1, :cond_3

    .line 118
    .line 119
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    :goto_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-interface {p0, p1}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_3
    const-string p0, "finalResult"

    .line 138
    .line 139
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v1

    .line 143
    :cond_4
    :goto_2
    return-object v0

    .line 144
    :pswitch_0
    check-cast p1, Lio/ktor/server/routing/飘花落叶言子世楪哲苏兰;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    new-instance p0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v0, "\""

    .line 152
    .line 153
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p1, Lio/ktor/server/routing/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;

    .line 157
    .line 158
    iget-object p1, p1, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪哲兰:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

    .line 159
    .line 160
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const/16 p1, 0x22

    .line 164
    .line 165
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0

    .line 173
    :pswitch_1
    move-object v0, p1

    .line 174
    check-cast v0, Ljava/util/List;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-instance v4, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;

    .line 180
    .line 181
    const/16 p0, 0x1c

    .line 182
    .line 183
    invoke-direct {v4, p0}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;-><init>(I)V

    .line 184
    .line 185
    .line 186
    const/16 v5, 0x1c

    .line 187
    .line 188
    const-string v1, " -> "

    .line 189
    .line 190
    const-string v2, "  "

    .line 191
    .line 192
    const/4 v3, 0x0

    .line 193
    invoke-static/range {v0 .. v5}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0

    .line 198
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    const/16 p0, 0x7b

    .line 204
    .line 205
    invoke-static {p1, p0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世兰楪苏(Ljava/lang/CharSequence;C)Z

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    if-eqz p0, :cond_5

    .line 210
    .line 211
    const/16 p0, 0x7d

    .line 212
    .line 213
    invoke-static {p1, p0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世兰楪苏(Ljava/lang/CharSequence;C)Z

    .line 214
    .line 215
    .line 216
    move-result p0

    .line 217
    if-eqz p0, :cond_5

    .line 218
    .line 219
    new-instance p0, Lio/ktor/server/routing/飘花落叶言子楪兰苏哲世;

    .line 220
    .line 221
    sget-object v0, Lio/ktor/server/routing/RoutingPathSegmentKind;->Parameter:Lio/ktor/server/routing/RoutingPathSegmentKind;

    .line 222
    .line 223
    invoke-direct {p0, p1, v0}, Lio/ktor/server/routing/飘花落叶言子楪兰苏哲世;-><init>(Ljava/lang/String;Lio/ktor/server/routing/RoutingPathSegmentKind;)V

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_5
    new-instance p0, Lio/ktor/server/routing/飘花落叶言子楪兰苏哲世;

    .line 228
    .line 229
    const/4 v0, 0x7

    .line 230
    invoke-static {v2, v2, p1, v0}, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;I)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    sget-object v0, Lio/ktor/server/routing/RoutingPathSegmentKind;->Constant:Lio/ktor/server/routing/RoutingPathSegmentKind;

    .line 235
    .line 236
    invoke-direct {p0, p1, v0}, Lio/ktor/server/routing/飘花落叶言子楪兰苏哲世;-><init>(Ljava/lang/String;Lio/ktor/server/routing/RoutingPathSegmentKind;)V

    .line 237
    .line 238
    .line 239
    :goto_3
    return-object p0

    .line 240
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 246
    .line 247
    .line 248
    move-result p0

    .line 249
    if-lez p0, :cond_6

    .line 250
    .line 251
    const/4 v2, 0x1

    .line 252
    :cond_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    return-object p0

    .line 257
    :pswitch_4
    check-cast p1, Lio/ktor/server/routing/飘花落叶言子楪兰苏哲世;

    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    iget-object p0, p1, Lio/ktor/server/routing/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 263
    .line 264
    return-object p0

    .line 265
    :pswitch_5
    check-cast p1, Ljava/io/File;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 271
    .line 272
    return-object p0

    .line 273
    :pswitch_6
    check-cast p1, Ljava/io/File;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    sget-object p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪兰苏世子哲/飘花落叶言子楪苏世哲兰;

    .line 279
    .line 280
    invoke-static {p1}, Lkotlin/io/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪苏兰(Ljava/io/File;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    invoke-static {p0}, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    invoke-static {p0}, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰(Ljava/util/List;)L飘花落叶言楪兰苏世子哲/飘花落叶言子楪苏世哲兰;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    return-object p0

    .line 293
    :pswitch_7
    check-cast p1, Ljava/net/URL;

    .line 294
    .line 295
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 299
    .line 300
    return-object p0

    .line 301
    :pswitch_8
    check-cast p1, Ljava/net/URL;

    .line 302
    .line 303
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 307
    .line 308
    return-object p0

    .line 309
    :pswitch_9
    check-cast p1, Ljava/net/URL;

    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    sget-object p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪兰苏世子哲/飘花落叶言子楪苏世哲兰;

    .line 315
    .line 316
    invoke-virtual {p1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    sget-object p1, Lio/ktor/server/http/content/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 324
    .line 325
    const/16 p1, 0x2f

    .line 326
    .line 327
    const/4 v0, 0x6

    .line 328
    invoke-static {p0, p1, v2, v0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子兰楪世苏哲(Ljava/lang/String;CII)I

    .line 329
    .line 330
    .line 331
    move-result p1

    .line 332
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    const/4 v4, -0x1

    .line 337
    if-eq p1, v4, :cond_7

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :cond_7
    move-object v3, v1

    .line 341
    :goto_4
    if-eqz v3, :cond_8

    .line 342
    .line 343
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    goto :goto_5

    .line 348
    :cond_8
    const/16 p1, 0x5c

    .line 349
    .line 350
    invoke-static {p0, p1, v2, v0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子兰楪世苏哲(Ljava/lang/String;CII)I

    .line 351
    .line 352
    .line 353
    move-result p1

    .line 354
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    if-eq p1, v4, :cond_9

    .line 359
    .line 360
    move-object v1, v0

    .line 361
    :cond_9
    if-eqz v1, :cond_a

    .line 362
    .line 363
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    :cond_a
    :goto_5
    const/16 p1, 0x2e

    .line 368
    .line 369
    const/4 v0, 0x4

    .line 370
    invoke-static {p0, p1, v2, v0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰楪世苏(Ljava/lang/CharSequence;CII)I

    .line 371
    .line 372
    .line 373
    move-result p1

    .line 374
    if-ltz p1, :cond_b

    .line 375
    .line 376
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    goto :goto_6

    .line 381
    :cond_b
    const-string p0, ""

    .line 382
    .line 383
    :goto_6
    invoke-static {p0}, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/util/List;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    invoke-static {p0}, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰(Ljava/util/List;)L飘花落叶言楪兰苏世子哲/飘花落叶言子楪苏世哲兰;

    .line 388
    .line 389
    .line 390
    move-result-object p0

    .line 391
    return-object p0

    .line 392
    :pswitch_a
    check-cast p1, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;

    .line 393
    .line 394
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    return-object p0

    .line 402
    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    .line 403
    .line 404
    return-object v0

    .line 405
    :pswitch_c
    check-cast p1, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;

    .line 406
    .line 407
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    iget-object p0, p1, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 411
    .line 412
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 413
    .line 414
    .line 415
    move-result p0

    .line 416
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    return-object p0

    .line 421
    :pswitch_d
    check-cast p1, Ljava/lang/CharSequence;

    .line 422
    .line 423
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 427
    .line 428
    .line 429
    move-result p0

    .line 430
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    return-object p0

    .line 435
    :pswitch_e
    check-cast p1, Ljava/lang/Integer;

    .line 436
    .line 437
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 438
    .line 439
    .line 440
    move-result p0

    .line 441
    mul-int/lit8 p0, p0, 0x8

    .line 442
    .line 443
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 444
    .line 445
    .line 446
    move-result-object p0

    .line 447
    return-object p0

    .line 448
    :pswitch_f
    check-cast p1, Lkotlin/Pair;

    .line 449
    .line 450
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object p0

    .line 457
    check-cast p0, Ljava/lang/String;

    .line 458
    .line 459
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 460
    .line 461
    .line 462
    move-result p0

    .line 463
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    move-result-object p0

    .line 467
    return-object p0

    .line 468
    :pswitch_10
    check-cast p1, Ljava/lang/CharSequence;

    .line 469
    .line 470
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object p0

    .line 477
    return-object p0

    .line 478
    :pswitch_11
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    throw p0

    .line 483
    :pswitch_12
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 484
    .line 485
    .line 486
    move-result-object p0

    .line 487
    throw p0

    .line 488
    :pswitch_13
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    throw p0

    .line 493
    :pswitch_14
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    throw p0

    .line 498
    :pswitch_15
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 499
    .line 500
    .line 501
    move-result-object p0

    .line 502
    throw p0

    .line 503
    :pswitch_16
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 504
    .line 505
    .line 506
    move-result-object p0

    .line 507
    throw p0

    .line 508
    :pswitch_17
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 509
    .line 510
    .line 511
    move-result-object p0

    .line 512
    throw p0

    .line 513
    :pswitch_18
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    throw p0

    .line 518
    :pswitch_19
    check-cast p1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 519
    .line 520
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    const-wide/high16 p0, 0x4049000000000000L    # 50.0

    .line 524
    .line 525
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 526
    .line 527
    .line 528
    move-result-object p0

    .line 529
    return-object p0

    .line 530
    :pswitch_1a
    check-cast p1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 531
    .line 532
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    iget-object p0, p1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 536
    .line 537
    iget-boolean v0, p1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Z

    .line 538
    .line 539
    iget-object v1, p1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 540
    .line 541
    sget-object v2, Lcom/materialkolor/scheme/DynamicScheme$Platform;->WATCH:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 542
    .line 543
    iget-object p1, p1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lcom/materialkolor/scheme/Variant;

    .line 544
    .line 545
    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    .line 546
    .line 547
    const-wide/16 v5, 0x0

    .line 548
    .line 549
    if-ne v1, v2, :cond_d

    .line 550
    .line 551
    sget-object v0, Lcom/materialkolor/scheme/Variant;->TONAL_SPOT:Lcom/materialkolor/scheme/Variant;

    .line 552
    .line 553
    if-ne p1, v0, :cond_c

    .line 554
    .line 555
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    invoke-static {p0, v5, v6, v0, v1}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲兰苏(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 561
    .line 562
    .line 563
    move-result-wide p0

    .line 564
    goto :goto_8

    .line 565
    :cond_c
    invoke-static {p0, v5, v6, v3, v4}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲兰苏(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 566
    .line 567
    .line 568
    move-result-wide p0

    .line 569
    goto :goto_8

    .line 570
    :cond_d
    sget-object v1, Lcom/materialkolor/scheme/Variant;->NEUTRAL:Lcom/materialkolor/scheme/Variant;

    .line 571
    .line 572
    const-wide v7, 0x4057400000000000L    # 93.0

    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    if-ne p1, v1, :cond_f

    .line 578
    .line 579
    if-eqz v0, :cond_e

    .line 580
    .line 581
    invoke-static {p0, v5, v6, v7, v8}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲兰苏(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 582
    .line 583
    .line 584
    move-result-wide p0

    .line 585
    goto :goto_8

    .line 586
    :cond_e
    const-wide/high16 v0, 0x4058000000000000L    # 96.0

    .line 587
    .line 588
    invoke-static {p0, v5, v6, v0, v1}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲兰苏(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 589
    .line 590
    .line 591
    move-result-wide p0

    .line 592
    goto :goto_8

    .line 593
    :cond_f
    sget-object v1, Lcom/materialkolor/scheme/Variant;->TONAL_SPOT:Lcom/materialkolor/scheme/Variant;

    .line 594
    .line 595
    const/16 v2, 0x64

    .line 596
    .line 597
    const/16 v9, 0x5d

    .line 598
    .line 599
    if-ne p1, v1, :cond_11

    .line 600
    .line 601
    if-eqz v0, :cond_10

    .line 602
    .line 603
    move v2, v9

    .line 604
    :cond_10
    int-to-double v0, v2

    .line 605
    invoke-static {p0, v5, v6, v0, v1}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲兰苏(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 606
    .line 607
    .line 608
    move-result-wide p0

    .line 609
    goto :goto_8

    .line 610
    :cond_11
    sget-object v1, Lcom/materialkolor/scheme/Variant;->EXPRESSIVE:Lcom/materialkolor/scheme/Variant;

    .line 611
    .line 612
    if-ne p1, v1, :cond_14

    .line 613
    .line 614
    iget-object p1, p0, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 615
    .line 616
    invoke-virtual {p1}, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Z

    .line 617
    .line 618
    .line 619
    move-result p1

    .line 620
    if-eqz p1, :cond_12

    .line 621
    .line 622
    const/16 v2, 0x58

    .line 623
    .line 624
    goto :goto_7

    .line 625
    :cond_12
    if-eqz v0, :cond_13

    .line 626
    .line 627
    move v2, v9

    .line 628
    :cond_13
    :goto_7
    const-wide v0, 0x4052c00000000000L    # 75.0

    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    int-to-double v2, v2

    .line 634
    invoke-static {p0, v0, v1, v2, v3}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲兰苏(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 635
    .line 636
    .line 637
    move-result-wide p0

    .line 638
    goto :goto_8

    .line 639
    :cond_14
    if-eqz v0, :cond_15

    .line 640
    .line 641
    invoke-static {p0, v5, v6, v7, v8}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲兰苏(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 642
    .line 643
    .line 644
    move-result-wide p0

    .line 645
    goto :goto_8

    .line 646
    :cond_15
    const-wide/high16 v0, 0x4052000000000000L    # 72.0

    .line 647
    .line 648
    invoke-static {p0, v0, v1, v3, v4}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪哲兰苏(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;DD)D

    .line 649
    .line 650
    .line 651
    move-result-wide p0

    .line 652
    :goto_8
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 653
    .line 654
    .line 655
    move-result-object p0

    .line 656
    return-object p0

    .line 657
    :pswitch_1b
    check-cast p1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 658
    .line 659
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    iget-object p0, p1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 663
    .line 664
    return-object p0

    .line 665
    :pswitch_1c
    check-cast p1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;

    .line 666
    .line 667
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    iget-object p0, p1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 671
    .line 672
    sget-object p1, Lcom/materialkolor/scheme/DynamicScheme$Platform;->PHONE:Lcom/materialkolor/scheme/DynamicScheme$Platform;

    .line 673
    .line 674
    if-ne p0, p1, :cond_16

    .line 675
    .line 676
    const-wide/high16 p0, 0x4008000000000000L    # 3.0

    .line 677
    .line 678
    invoke-static {p0, p1}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏(D)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 679
    .line 680
    .line 681
    move-result-object p0

    .line 682
    goto :goto_9

    .line 683
    :cond_16
    const-wide/high16 p0, 0x4012000000000000L    # 4.5

    .line 684
    .line 685
    invoke-static {p0, p1}, L飘花落叶言楪哲子世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏(D)Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 686
    .line 687
    .line 688
    move-result-object p0

    .line 689
    :goto_9
    return-object p0

    .line 690
    nop

    .line 691
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
