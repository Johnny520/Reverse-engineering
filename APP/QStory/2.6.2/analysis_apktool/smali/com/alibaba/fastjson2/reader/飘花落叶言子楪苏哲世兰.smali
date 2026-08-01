.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏哲世兰;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子世哲楪苏兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;I)V
    .locals 0

    .line 1
    iput p13, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲楪苏兰:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p12}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲楪苏兰:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 5
    .line 6
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    const-string v4, " error"

    .line 9
    .line 10
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 11
    .line 12
    const-string v6, "set "

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/Object;)B

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    int-to-long p0, p0

    .line 25
    invoke-virtual {v2, p0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲兰苏(J)V

    .line 26
    .line 27
    .line 28
    :cond_0
    throw v7

    .line 29
    :pswitch_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世兰楪哲苏(Ljava/lang/Object;)S

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    int-to-long p0, p0

    .line 36
    invoke-virtual {v2, p0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲兰苏(J)V

    .line 37
    .line 38
    .line 39
    :cond_1
    throw v7

    .line 40
    :pswitch_1
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世哲楪苏兰(Ljava/lang/Object;)F

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    float-to-double p0, p0

    .line 47
    invoke-virtual {v2, p0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲苏兰(D)V

    .line 48
    .line 49
    .line 50
    :cond_2
    throw v7

    .line 51
    :pswitch_2
    instance-of p0, p2, Ljava/lang/String;

    .line 52
    .line 53
    if-nez p0, :cond_4

    .line 54
    .line 55
    instance-of p0, p2, Ljava/lang/Character;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 61
    .line 62
    const-string p1, "cast to char error"

    .line 63
    .line 64
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :cond_4
    check-cast p2, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    :goto_0
    throw v7

    .line 74
    :pswitch_3
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    throw v7

    .line 78
    :pswitch_4
    if-nez p2, :cond_5

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    :try_start_0
    invoke-virtual {v3, p1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 90
    .line 91
    .line 92
    move-result-wide p1

    .line 93
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catch_0
    move-exception p0

    .line 98
    new-instance p1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p1, v5, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    :goto_1
    return-void

    .line 111
    :pswitch_5
    if-nez p2, :cond_6

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_6
    :try_start_1
    invoke-virtual {v3, p1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 119
    .line 120
    instance-of p1, p2, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 121
    .line 122
    if-eqz p1, :cond_7

    .line 123
    .line 124
    check-cast p2, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 125
    .line 126
    :goto_2
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLongArray;->length()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-ge v1, p1, :cond_8

    .line 131
    .line 132
    invoke-virtual {p2, v1}, Ljava/util/concurrent/atomic/AtomicLongArray;->get(I)J

    .line 133
    .line 134
    .line 135
    move-result-wide v2

    .line 136
    invoke-virtual {p0, v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLongArray;->set(IJ)V

    .line 137
    .line 138
    .line 139
    add-int/lit8 v1, v1, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :catch_1
    move-exception p0

    .line 143
    goto :goto_4

    .line 144
    :cond_7
    check-cast p2, Ljava/util/List;

    .line 145
    .line 146
    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-ge v1, p1, :cond_8

    .line 151
    .line 152
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世哲苏楪兰(Ljava/lang/Object;)I

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    int-to-long v2, p1

    .line 161
    invoke-virtual {p0, v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLongArray;->set(IJ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 162
    .line 163
    .line 164
    add-int/lit8 v1, v1, 0x1

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :goto_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {p1, v5, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    :cond_8
    :goto_5
    return-void

    .line 180
    :pswitch_6
    if-nez p2, :cond_9

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_9
    :try_start_2
    invoke-virtual {v3, p1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    check-cast p0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 188
    .line 189
    check-cast p2, Ljava/lang/Number;

    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 196
    .line 197
    .line 198
    goto :goto_6

    .line 199
    :catch_2
    move-exception p0

    .line 200
    new-instance p1, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-static {p1, v5, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    :goto_6
    return-void

    .line 213
    :pswitch_7
    if-nez p2, :cond_a

    .line 214
    .line 215
    goto :goto_a

    .line 216
    :cond_a
    :try_start_3
    invoke-virtual {v3, p1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    check-cast p0, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 221
    .line 222
    instance-of p1, p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 223
    .line 224
    if-eqz p1, :cond_b

    .line 225
    .line 226
    check-cast p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 227
    .line 228
    :goto_7
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-ge v1, p1, :cond_c

    .line 233
    .line 234
    invoke-virtual {p2, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    invoke-virtual {p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->set(II)V

    .line 239
    .line 240
    .line 241
    add-int/lit8 v1, v1, 0x1

    .line 242
    .line 243
    goto :goto_7

    .line 244
    :catch_3
    move-exception p0

    .line 245
    goto :goto_9

    .line 246
    :cond_b
    check-cast p2, Ljava/util/List;

    .line 247
    .line 248
    :goto_8
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    if-ge v1, p1, :cond_c

    .line 253
    .line 254
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世哲苏楪兰(Ljava/lang/Object;)I

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    invoke-virtual {p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->set(II)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 263
    .line 264
    .line 265
    add-int/lit8 v1, v1, 0x1

    .line 266
    .line 267
    goto :goto_8

    .line 268
    :goto_9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-static {p1, v5, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 278
    .line 279
    .line 280
    :cond_c
    :goto_a
    return-void

    .line 281
    :pswitch_8
    if-nez p2, :cond_d

    .line 282
    .line 283
    goto :goto_d

    .line 284
    :cond_d
    :try_start_4
    invoke-virtual {v3, p1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 289
    .line 290
    instance-of p1, p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 291
    .line 292
    if-eqz p1, :cond_e

    .line 293
    .line 294
    check-cast p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 295
    .line 296
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 301
    .line 302
    .line 303
    move-result-object p2

    .line 304
    goto :goto_b

    .line 305
    :catch_4
    move-exception p0

    .line 306
    goto :goto_c

    .line 307
    :cond_e
    :goto_b
    check-cast p2, Ljava/lang/Boolean;

    .line 308
    .line 309
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 310
    .line 311
    .line 312
    move-result p1

    .line 313
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 314
    .line 315
    .line 316
    goto :goto_d

    .line 317
    :goto_c
    new-instance p1, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-static {p1, v5, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    .line 328
    .line 329
    :goto_d
    return-void

    .line 330
    :pswitch_9
    if-nez p2, :cond_f

    .line 331
    .line 332
    goto :goto_10

    .line 333
    :cond_f
    :try_start_5
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 334
    .line 335
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 340
    .line 341
    instance-of p1, p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 342
    .line 343
    if-eqz p1, :cond_10

    .line 344
    .line 345
    check-cast p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 346
    .line 347
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 348
    .line 349
    .line 350
    move-result p1

    .line 351
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 352
    .line 353
    .line 354
    move-result-object p2

    .line 355
    goto :goto_e

    .line 356
    :catch_5
    move-exception p0

    .line 357
    goto :goto_f

    .line 358
    :cond_10
    :goto_e
    check-cast p2, Ljava/lang/Boolean;

    .line 359
    .line 360
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 361
    .line 362
    .line 363
    move-result p1

    .line 364
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 365
    .line 366
    .line 367
    goto :goto_10

    .line 368
    :goto_f
    new-instance p1, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    invoke-static {p1, v5, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 378
    .line 379
    .line 380
    :goto_10
    return-void

    .line 381
    :pswitch_data_0
    .packed-switch 0x0
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

.method public 飘花落叶言子楪兰世苏哲()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲楪苏兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :pswitch_1
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :pswitch_2
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :pswitch_3
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :pswitch_4
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :pswitch_5
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲楪苏兰:I

    .line 2
    .line 3
    const-string v1, " error"

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 6
    .line 7
    const-string v3, "set "

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

    .line 11
    .line 12
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    int-to-byte p0, p0

    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    int-to-long p0, p0

    .line 26
    invoke-virtual {v6, p0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲兰苏(J)V

    .line 27
    .line 28
    .line 29
    :cond_0
    throw v7

    .line 30
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    int-to-short p0, p0

    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    int-to-long p0, p0

    .line 38
    invoke-virtual {v6, p0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲兰苏(J)V

    .line 39
    .line 40
    .line 41
    :cond_1
    throw v7

    .line 42
    :pswitch_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世楪苏()F

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    float-to-double p0, p0

    .line 49
    invoke-virtual {v6, p0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲苏兰(D)V

    .line 50
    .line 51
    .line 52
    :cond_2
    throw v7

    .line 53
    :pswitch_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲苏楪()C

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_3

    .line 58
    .line 59
    iget-boolean p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 60
    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    throw v7

    .line 65
    :pswitch_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 66
    .line 67
    .line 68
    throw v7

    .line 69
    :pswitch_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世哲兰苏()Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏楪世()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    :try_start_0
    invoke-virtual {v5, p2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, Ljava/util/concurrent/atomic/AtomicLongArray;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世兰苏()Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-eqz p2, :cond_7

    .line 95
    .line 96
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-eqz p2, :cond_5

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    if-eqz p0, :cond_6

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLongArray;->length()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-ge v4, p2, :cond_6

    .line 114
    .line 115
    invoke-virtual {p0, v4, v0, v1}, Ljava/util/concurrent/atomic/AtomicLongArray;->set(IJ)V

    .line 116
    .line 117
    .line 118
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :catch_0
    move-exception p0

    .line 122
    new-instance p2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p2, v2, v1, p1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    :cond_7
    :goto_1
    return-void

    .line 135
    :pswitch_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏楪世()Z

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    if-eqz p0, :cond_8

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_8
    :try_start_1
    invoke-virtual {v5, p2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    check-cast p0, Ljava/util/concurrent/atomic/AtomicIntegerArray;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 155
    .line 156
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世兰苏()Z

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    if-eqz p2, :cond_b

    .line 161
    .line 162
    :goto_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    if-eqz p2, :cond_9

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    if-eqz p0, :cond_a

    .line 174
    .line 175
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-ge v4, v0, :cond_a

    .line 180
    .line 181
    invoke-virtual {p0, v4, p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->set(II)V

    .line 182
    .line 183
    .line 184
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :catch_1
    move-exception p0

    .line 188
    new-instance p2, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-static {p2, v2, v1, p1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    :cond_b
    :goto_3
    return-void

    .line 201
    :pswitch_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()Ljava/lang/Boolean;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :pswitch_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()Ljava/lang/Boolean;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final 飘花落叶言子楪兰苏哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲楪苏兰:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    int-to-byte p0, p0

    .line 12
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    int-to-short p0, p0

    .line 22
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世楪苏()F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    iget-boolean p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 51
    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 56
    .line 57
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 58
    .line 59
    .line 60
    :goto_0
    return-object v0

    .line 61
    :pswitch_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世兰苏楪()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    const-class p0, Ljava/lang/Long;

    .line 69
    .line 70
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪哲世苏(Ljava/lang/reflect/Type;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_1
    return-object v0

    .line 75
    :pswitch_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    iget-boolean p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 80
    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 85
    .line 86
    invoke-direct {v0, p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 87
    .line 88
    .line 89
    :goto_2
    return-object v0

    .line 90
    :pswitch_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世兰苏楪()Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_3

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    const-class p0, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪哲世苏(Ljava/lang/reflect/Type;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :goto_3
    return-object v0

    .line 104
    :pswitch_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :pswitch_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
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
