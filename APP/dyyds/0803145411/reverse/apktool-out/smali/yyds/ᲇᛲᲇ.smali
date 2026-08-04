.class public final synthetic Lyyds/ᲇᛲᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛲᛳ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛴᛸᛲᛳ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲇᛲᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲇᛲᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛲᛳ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lyyds/ᲇᛲᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const-class v1, Lyyds/ᛲᛶᛱᛵ;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object p0, p0, Lyyds/ᲇᛲᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛲᛳ;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p2, Ljava/lang/reflect/Field;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const-string v0, "Field: type"

    .line 20
    .line 21
    invoke-static {p1, p0, v0}, Lyyds/ᛲᛶᲇ;->ᛳᛸᛴᛶ(Ljava/lang/Object;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p2, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast p1, Ljava/util/Set;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/reflect/Member;

    .line 37
    .line 38
    invoke-static {p2}, Lyyds/ᛲᛶᲇ;->ᛶᛳᛶᛵ(Ljava/lang/reflect/Member;)[Ljava/lang/annotation/Annotation;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    array-length v1, p2

    .line 45
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    array-length v1, p2

    .line 49
    :goto_1
    if-ge v3, v1, :cond_0

    .line 50
    .line 51
    aget-object v2, p2, v3

    .line 52
    .line 53
    invoke-static {v2}, Lyyds/ᛳᛴᲁᲇ;->ᲀᛲᛳᲀ(Ljava/lang/annotation/Annotation;)Lyyds/ᲁᛵᛴᲀ;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v2}, Lyyds/ᲈᲇᛶᛷ;->ᛲᲈᲁ()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_0
    invoke-static {p1, v0, p0}, Lyyds/ᛲᛶᲇ;->ᛲᛴᛳᛲ(Ljava/util/Collection;Ljava/util/List;Lyyds/ᛴᛸᛲᛳ;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    xor-int/2addr p0, v4

    .line 72
    goto :goto_0

    .line 73
    :pswitch_1
    check-cast p1, Ljava/util/Set;

    .line 74
    .line 75
    check-cast p2, Ljava/lang/reflect/Member;

    .line 76
    .line 77
    invoke-static {p2}, Lyyds/ᛲᛶᲇ;->ᛶᛳᛶᛵ(Ljava/lang/reflect/Member;)[Ljava/lang/annotation/Annotation;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    .line 82
    .line 83
    array-length v1, p2

    .line 84
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    array-length v1, p2

    .line 88
    :goto_2
    if-ge v3, v1, :cond_1

    .line 89
    .line 90
    aget-object v2, p2, v3

    .line 91
    .line 92
    invoke-static {v2}, Lyyds/ᛳᛴᲁᲇ;->ᲀᛲᛳᲀ(Ljava/lang/annotation/Annotation;)Lyyds/ᲁᛵᛴᲀ;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-interface {v2}, Lyyds/ᲈᲇᛶᛷ;->ᛲᲈᲁ()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    add-int/lit8 v3, v3, 0x1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_1
    invoke-static {p1, v0, p0}, Lyyds/ᛲᛶᲇ;->ᛲᛴᛳᛲ(Ljava/util/Collection;Ljava/util/List;Lyyds/ᛴᛸᛲᛳ;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    goto :goto_0

    .line 111
    :pswitch_2
    check-cast p1, Ljava/util/Set;

    .line 112
    .line 113
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getExceptionTypes()[Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-static {p2}, Lyyds/ᲀᲀᛷᛸ;->ᛷᛶᛷᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-eq v0, v5, :cond_2

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    move v0, v3

    .line 139
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-eqz v5, :cond_5

    .line 144
    .line 145
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    add-int/lit8 v6, v0, 0x1

    .line 150
    .line 151
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Ljava/lang/Class;

    .line 156
    .line 157
    invoke-static {v5, p0, v2}, Lyyds/ᛲᛶᲇ;->ᛳᛸᛴᛶ(Ljava/lang/Object;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;)Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-static {v1}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-static {v7}, Lyyds/ᛳᛴᲁᲇ;->ᛲᛴᛳᛲ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    if-nez v7, :cond_3

    .line 170
    .line 171
    move-object v7, v1

    .line 172
    :cond_3
    invoke-static {v5, v7}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    if-nez v7, :cond_4

    .line 177
    .line 178
    invoke-static {v0, v5}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_4

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_4
    move v0, v6

    .line 186
    goto :goto_3

    .line 187
    :cond_5
    move v3, v4

    .line 188
    :goto_4
    xor-int/lit8 p0, v3, 0x1

    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :pswitch_3
    check-cast p1, Ljava/util/Set;

    .line 193
    .line 194
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 195
    .line 196
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getExceptionTypes()[Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    invoke-static {p2}, Lyyds/ᲀᲀᛷᛸ;->ᛷᛶᛷᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eq v0, v5, :cond_6

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    move v0, v3

    .line 220
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_9

    .line 225
    .line 226
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    add-int/lit8 v6, v0, 0x1

    .line 231
    .line 232
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    check-cast v0, Ljava/lang/Class;

    .line 237
    .line 238
    invoke-static {v5, p0, v2}, Lyyds/ᛲᛶᲇ;->ᛳᛸᛴᛶ(Ljava/lang/Object;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;)Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    invoke-static {v1}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    invoke-static {v7}, Lyyds/ᛳᛴᲁᲇ;->ᛲᛴᛳᛲ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    if-nez v7, :cond_7

    .line 251
    .line 252
    move-object v7, v1

    .line 253
    :cond_7
    invoke-static {v5, v7}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    if-nez v7, :cond_8

    .line 258
    .line 259
    invoke-static {v0, v5}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-nez v0, :cond_8

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_8
    move v0, v6

    .line 267
    goto :goto_5

    .line 268
    :cond_9
    move v3, v4

    .line 269
    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    return-object p0

    .line 274
    :pswitch_4
    check-cast p1, Ljava/util/Set;

    .line 275
    .line 276
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 277
    .line 278
    invoke-static {p0, p1, p2}, Lyyds/ᛲᛶᲇ;->ᛳᲁᲁᲇ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z

    .line 279
    .line 280
    .line 281
    move-result p0

    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :pswitch_5
    check-cast p1, Ljava/util/Set;

    .line 285
    .line 286
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 287
    .line 288
    invoke-static {p0, p1, p2}, Lyyds/ᛲᛶᲇ;->ᛱᛳᲇ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    goto/16 :goto_0

    .line 293
    .line 294
    :pswitch_6
    check-cast p1, Ljava/util/Set;

    .line 295
    .line 296
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 297
    .line 298
    invoke-static {p0, p1, p2}, Lyyds/ᛲᛶᲇ;->ᛲᛲᲈᲈ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z

    .line 299
    .line 300
    .line 301
    move-result p0

    .line 302
    goto/16 :goto_0

    .line 303
    .line 304
    :pswitch_7
    check-cast p1, Ljava/util/Set;

    .line 305
    .line 306
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 307
    .line 308
    invoke-static {p0, p1, p2}, Lyyds/ᛲᛶᲇ;->ᛷᛵᲇᲀ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z

    .line 309
    .line 310
    .line 311
    move-result p0

    .line 312
    goto/16 :goto_0

    .line 313
    .line 314
    :pswitch_8
    check-cast p1, Ljava/util/Set;

    .line 315
    .line 316
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 317
    .line 318
    invoke-static {p0, p1, p2}, Lyyds/ᛲᛶᲇ;->ᛷᛲᲈᛱ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z

    .line 319
    .line 320
    .line 321
    move-result p0

    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :pswitch_9
    check-cast p1, Ljava/util/List;

    .line 325
    .line 326
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 327
    .line 328
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterTypes()[Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    move-result-object p2

    .line 332
    invoke-static {p2}, Lyyds/ᲀᲀᛷᛸ;->ᛷᛶᛷᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object p2

    .line 336
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    if-eq v0, v5, :cond_a

    .line 345
    .line 346
    goto/16 :goto_4

    .line 347
    .line 348
    :cond_a
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    move v0, v3

    .line 353
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 354
    .line 355
    .line 356
    move-result v5

    .line 357
    if-eqz v5, :cond_5

    .line 358
    .line 359
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    add-int/lit8 v6, v0, 0x1

    .line 364
    .line 365
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    check-cast v0, Ljava/lang/Class;

    .line 370
    .line 371
    invoke-static {v5, p0, v2}, Lyyds/ᛲᛶᲇ;->ᛳᛸᛴᛶ(Ljava/lang/Object;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;)Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    invoke-static {v1}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    invoke-static {v7}, Lyyds/ᛳᛴᲁᲇ;->ᛲᛴᛳᛲ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    move-result-object v7

    .line 383
    if-nez v7, :cond_b

    .line 384
    .line 385
    move-object v7, v1

    .line 386
    :cond_b
    invoke-static {v5, v7}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    if-nez v7, :cond_c

    .line 391
    .line 392
    invoke-static {v0, v5}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-nez v0, :cond_c

    .line 397
    .line 398
    goto/16 :goto_4

    .line 399
    .line 400
    :cond_c
    move v0, v6

    .line 401
    goto :goto_7

    .line 402
    :pswitch_a
    check-cast p1, Ljava/util/Set;

    .line 403
    .line 404
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 405
    .line 406
    invoke-static {p0, p1, p2}, Lyyds/ᛲᛶᲇ;->ᛷᲈᲈᲁ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z

    .line 407
    .line 408
    .line 409
    move-result p0

    .line 410
    goto/16 :goto_0

    .line 411
    .line 412
    :pswitch_b
    check-cast p1, Ljava/util/Set;

    .line 413
    .line 414
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 415
    .line 416
    invoke-static {p0, p1, p2}, Lyyds/ᛲᛶᲇ;->ᛲᛳᛶᲁ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z

    .line 417
    .line 418
    .line 419
    move-result p0

    .line 420
    goto/16 :goto_0

    .line 421
    .line 422
    :pswitch_c
    check-cast p1, Ljava/util/Set;

    .line 423
    .line 424
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 425
    .line 426
    invoke-static {p0, p1, p2}, Lyyds/ᛲᛶᲇ;->ᛱᲈᲁ(Lyyds/ᛴᛸᛲᛳ;Ljava/util/Set;Ljava/lang/reflect/Executable;)Z

    .line 427
    .line 428
    .line 429
    move-result p0

    .line 430
    goto/16 :goto_0

    .line 431
    .line 432
    :pswitch_d
    check-cast p1, Ljava/util/List;

    .line 433
    .line 434
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 435
    .line 436
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 437
    .line 438
    .line 439
    move-result-object p2

    .line 440
    new-instance v0, Ljava/util/ArrayList;

    .line 441
    .line 442
    array-length v1, p2

    .line 443
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 444
    .line 445
    .line 446
    array-length v1, p2

    .line 447
    move v2, v3

    .line 448
    :goto_8
    if-ge v2, v1, :cond_e

    .line 449
    .line 450
    aget-object v5, p2, v2

    .line 451
    .line 452
    check-cast v5, [Ljava/lang/annotation/Annotation;

    .line 453
    .line 454
    new-instance v6, Ljava/util/ArrayList;

    .line 455
    .line 456
    array-length v7, v5

    .line 457
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 458
    .line 459
    .line 460
    array-length v7, v5

    .line 461
    move v8, v3

    .line 462
    :goto_9
    if-ge v8, v7, :cond_d

    .line 463
    .line 464
    aget-object v9, v5, v8

    .line 465
    .line 466
    invoke-static {v9}, Lyyds/ᛳᛴᲁᲇ;->ᲀᛲᛳᲀ(Ljava/lang/annotation/Annotation;)Lyyds/ᲁᛵᛴᲀ;

    .line 467
    .line 468
    .line 469
    move-result-object v9

    .line 470
    invoke-interface {v9}, Lyyds/ᲈᲇᛶᛷ;->ᛲᲈᲁ()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    move-result-object v9

    .line 474
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    add-int/lit8 v8, v8, 0x1

    .line 478
    .line 479
    goto :goto_9

    .line 480
    :cond_d
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    add-int/lit8 v2, v2, 0x1

    .line 484
    .line 485
    goto :goto_8

    .line 486
    :cond_e
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 487
    .line 488
    .line 489
    move-result p2

    .line 490
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    if-eq p2, v1, :cond_f

    .line 495
    .line 496
    goto/16 :goto_4

    .line 497
    .line 498
    :cond_f
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    move p2, v3

    .line 503
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    if-eqz v1, :cond_5

    .line 508
    .line 509
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    check-cast v1, Ljava/util/Collection;

    .line 514
    .line 515
    add-int/lit8 v2, p2, 0x1

    .line 516
    .line 517
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object p2

    .line 521
    check-cast p2, Ljava/util/List;

    .line 522
    .line 523
    invoke-static {v1, p2, p0}, Lyyds/ᛲᛶᲇ;->ᛲᛴᛳᛲ(Ljava/util/Collection;Ljava/util/List;Lyyds/ᛴᛸᛲᛳ;)Z

    .line 524
    .line 525
    .line 526
    move-result p2

    .line 527
    if-nez p2, :cond_10

    .line 528
    .line 529
    goto/16 :goto_4

    .line 530
    .line 531
    :cond_10
    move p2, v2

    .line 532
    goto :goto_a

    .line 533
    :pswitch_e
    check-cast p2, Ljava/lang/reflect/Method;

    .line 534
    .line 535
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    move-result-object p2

    .line 539
    const-string v0, "Method: returnType"

    .line 540
    .line 541
    invoke-static {p1, p0, v0}, Lyyds/ᛲᛶᲇ;->ᛳᛸᛴᛶ(Ljava/lang/Object;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;)Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    move-result-object p0

    .line 545
    invoke-static {p2, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result p0

    .line 549
    goto/16 :goto_0

    .line 550
    .line 551
    :pswitch_f
    check-cast p1, Ljava/util/List;

    .line 552
    .line 553
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 554
    .line 555
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 556
    .line 557
    .line 558
    move-result-object p2

    .line 559
    new-instance v0, Ljava/util/ArrayList;

    .line 560
    .line 561
    array-length v1, p2

    .line 562
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 563
    .line 564
    .line 565
    array-length v1, p2

    .line 566
    move v2, v3

    .line 567
    :goto_b
    if-ge v2, v1, :cond_12

    .line 568
    .line 569
    aget-object v5, p2, v2

    .line 570
    .line 571
    check-cast v5, [Ljava/lang/annotation/Annotation;

    .line 572
    .line 573
    new-instance v6, Ljava/util/ArrayList;

    .line 574
    .line 575
    array-length v7, v5

    .line 576
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 577
    .line 578
    .line 579
    array-length v7, v5

    .line 580
    move v8, v3

    .line 581
    :goto_c
    if-ge v8, v7, :cond_11

    .line 582
    .line 583
    aget-object v9, v5, v8

    .line 584
    .line 585
    invoke-static {v9}, Lyyds/ᛳᛴᲁᲇ;->ᲀᛲᛳᲀ(Ljava/lang/annotation/Annotation;)Lyyds/ᲁᛵᛴᲀ;

    .line 586
    .line 587
    .line 588
    move-result-object v9

    .line 589
    invoke-interface {v9}, Lyyds/ᲈᲇᛶᛷ;->ᛲᲈᲁ()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    move-result-object v9

    .line 593
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    add-int/lit8 v8, v8, 0x1

    .line 597
    .line 598
    goto :goto_c

    .line 599
    :cond_11
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    add-int/lit8 v2, v2, 0x1

    .line 603
    .line 604
    goto :goto_b

    .line 605
    :cond_12
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 606
    .line 607
    .line 608
    move-result p2

    .line 609
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 610
    .line 611
    .line 612
    move-result v1

    .line 613
    if-eq p2, v1, :cond_13

    .line 614
    .line 615
    goto :goto_e

    .line 616
    :cond_13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 617
    .line 618
    .line 619
    move-result-object p1

    .line 620
    move p2, v3

    .line 621
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    if-eqz v1, :cond_15

    .line 626
    .line 627
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    check-cast v1, Ljava/util/Collection;

    .line 632
    .line 633
    add-int/lit8 v2, p2, 0x1

    .line 634
    .line 635
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object p2

    .line 639
    check-cast p2, Ljava/util/List;

    .line 640
    .line 641
    invoke-static {v1, p2, p0}, Lyyds/ᛲᛶᲇ;->ᛲᛴᛳᛲ(Ljava/util/Collection;Ljava/util/List;Lyyds/ᛴᛸᛲᛳ;)Z

    .line 642
    .line 643
    .line 644
    move-result p2

    .line 645
    if-nez p2, :cond_14

    .line 646
    .line 647
    goto :goto_e

    .line 648
    :cond_14
    move p2, v2

    .line 649
    goto :goto_d

    .line 650
    :cond_15
    move v3, v4

    .line 651
    :goto_e
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 652
    .line 653
    .line 654
    move-result-object p0

    .line 655
    return-object p0

    .line 656
    :pswitch_10
    check-cast p1, Ljava/util/List;

    .line 657
    .line 658
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 659
    .line 660
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterTypes()[Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    move-result-object p2

    .line 664
    invoke-static {p2}, Lyyds/ᲀᲀᛷᛸ;->ᛷᛶᛷᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 665
    .line 666
    .line 667
    move-result-object p2

    .line 668
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 669
    .line 670
    .line 671
    move-result v0

    .line 672
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 673
    .line 674
    .line 675
    move-result v5

    .line 676
    if-eq v0, v5, :cond_16

    .line 677
    .line 678
    goto :goto_10

    .line 679
    :cond_16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 680
    .line 681
    .line 682
    move-result-object p1

    .line 683
    move v0, v3

    .line 684
    :goto_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 685
    .line 686
    .line 687
    move-result v5

    .line 688
    if-eqz v5, :cond_19

    .line 689
    .line 690
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v5

    .line 694
    add-int/lit8 v6, v0, 0x1

    .line 695
    .line 696
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    check-cast v0, Ljava/lang/Class;

    .line 701
    .line 702
    invoke-static {v5, p0, v2}, Lyyds/ᛲᛶᲇ;->ᛳᛸᛴᛶ(Ljava/lang/Object;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/String;)Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    move-result-object v5

    .line 706
    invoke-static {v1}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 707
    .line 708
    .line 709
    move-result-object v7

    .line 710
    invoke-static {v7}, Lyyds/ᛳᛴᲁᲇ;->ᛲᛴᛳᛲ(Lyyds/ᲁᛵᛴᲀ;)Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    move-result-object v7

    .line 714
    if-nez v7, :cond_17

    .line 715
    .line 716
    move-object v7, v1

    .line 717
    :cond_17
    invoke-static {v5, v7}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 718
    .line 719
    .line 720
    move-result v7

    .line 721
    if-nez v7, :cond_18

    .line 722
    .line 723
    invoke-static {v0, v5}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    if-nez v0, :cond_18

    .line 728
    .line 729
    goto :goto_10

    .line 730
    :cond_18
    move v0, v6

    .line 731
    goto :goto_f

    .line 732
    :cond_19
    move v3, v4

    .line 733
    :goto_10
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 734
    .line 735
    .line 736
    move-result-object p0

    .line 737
    return-object p0

    .line 738
    nop

    .line 739
    :pswitch_data_0
    .packed-switch 0x0
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
