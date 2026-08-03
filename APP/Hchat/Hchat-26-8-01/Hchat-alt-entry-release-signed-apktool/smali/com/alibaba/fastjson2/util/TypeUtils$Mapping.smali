.class final Lcom/alibaba/fastjson2/util/TypeUtils$Mapping;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/util/TypeUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapping"
.end annotation


# static fields
.field static final NAME_MAPPINGS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field static final TYPE_MAPPINGS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 78

    .line 1
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    const/16 v1, 0xc0

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/alibaba/fastjson2/util/TypeUtils$Mapping;->NAME_MAPPINGS:Ljava/util/Map;

    .line 9
    .line 10
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    const/16 v2, 0x100

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/alibaba/fastjson2/util/TypeUtils$Mapping;->TYPE_MAPPINGS:Ljava/util/Map;

    .line 18
    .line 19
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    const-string v3, "B"

    .line 22
    .line 23
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    const-string v3, "S"

    .line 29
    .line 30
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    const-string v3, "I"

    .line 36
    .line 37
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    const-string v3, "J"

    .line 43
    .line 44
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    const-string v3, "F"

    .line 50
    .line 51
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 55
    .line 56
    const-string v3, "D"

    .line 57
    .line 58
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    const-string v3, "C"

    .line 64
    .line 65
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    const-string v3, "Z"

    .line 71
    .line 72
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    const-class v2, [Ljava/lang/Object;

    .line 76
    .line 77
    const-string v3, "[O"

    .line 78
    .line 79
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    const-class v4, [[Ljava/lang/Object;

    .line 83
    .line 84
    const-string v5, "[[O"

    .line 85
    .line 86
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    const-class v4, [B

    .line 90
    .line 91
    const-string v5, "[B"

    .line 92
    .line 93
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    const-class v4, [[B

    .line 97
    .line 98
    const-string v5, "[[B"

    .line 99
    .line 100
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    const-class v4, [S

    .line 104
    .line 105
    const-string v5, "[S"

    .line 106
    .line 107
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    const-class v4, [[S

    .line 111
    .line 112
    const-string v5, "[[S"

    .line 113
    .line 114
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    const-class v4, [I

    .line 118
    .line 119
    const-string v5, "[I"

    .line 120
    .line 121
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    const-class v4, [[I

    .line 125
    .line 126
    const-string v5, "[[I"

    .line 127
    .line 128
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    const-class v4, [J

    .line 132
    .line 133
    const-string v5, "[J"

    .line 134
    .line 135
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    const-class v4, [[J

    .line 139
    .line 140
    const-string v5, "[[J"

    .line 141
    .line 142
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    const-class v4, [F

    .line 146
    .line 147
    const-string v5, "[F"

    .line 148
    .line 149
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    const-class v4, [[F

    .line 153
    .line 154
    const-string v5, "[[F"

    .line 155
    .line 156
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    const-class v4, [D

    .line 160
    .line 161
    const-string v5, "[D"

    .line 162
    .line 163
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    const-class v4, [[D

    .line 167
    .line 168
    const-string v5, "[[D"

    .line 169
    .line 170
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    const-class v4, [C

    .line 174
    .line 175
    const-string v5, "[C"

    .line 176
    .line 177
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    const-class v4, [[C

    .line 181
    .line 182
    const-string v5, "[[C"

    .line 183
    .line 184
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    const-class v4, [Z

    .line 188
    .line 189
    const-string v5, "[Z"

    .line 190
    .line 191
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    const-class v4, [[Z

    .line 195
    .line 196
    const-string v5, "[[Z"

    .line 197
    .line 198
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    const-class v4, [Ljava/lang/Byte;

    .line 202
    .line 203
    const-string v5, "[Byte"

    .line 204
    .line 205
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    const-class v4, [[Ljava/lang/Byte;

    .line 209
    .line 210
    const-string v5, "[[Byte"

    .line 211
    .line 212
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    const-class v4, [Ljava/lang/Short;

    .line 216
    .line 217
    const-string v5, "[Short"

    .line 218
    .line 219
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    const-class v4, [[Ljava/lang/Short;

    .line 223
    .line 224
    const-string v5, "[[Short"

    .line 225
    .line 226
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    const-class v4, [Ljava/lang/Integer;

    .line 230
    .line 231
    const-string v5, "[Integer"

    .line 232
    .line 233
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    const-class v4, [[Ljava/lang/Integer;

    .line 237
    .line 238
    const-string v5, "[[Integer"

    .line 239
    .line 240
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    const-class v4, [Ljava/lang/Long;

    .line 244
    .line 245
    const-string v5, "[Long"

    .line 246
    .line 247
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    const-class v4, [[Ljava/lang/Long;

    .line 251
    .line 252
    const-string v5, "[[Long"

    .line 253
    .line 254
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    const-class v4, [Ljava/lang/Float;

    .line 258
    .line 259
    const-string v5, "[Float"

    .line 260
    .line 261
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    const-class v4, [[Ljava/lang/Float;

    .line 265
    .line 266
    const-string v5, "[[Float"

    .line 267
    .line 268
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    const-class v4, [Ljava/lang/Double;

    .line 272
    .line 273
    const-string v5, "[Double"

    .line 274
    .line 275
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    const-class v4, [[Ljava/lang/Double;

    .line 279
    .line 280
    const-string v5, "[[Double"

    .line 281
    .line 282
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    const-class v4, [Ljava/lang/Character;

    .line 286
    .line 287
    const-string v5, "[Character"

    .line 288
    .line 289
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    const-class v4, [[Ljava/lang/Character;

    .line 293
    .line 294
    const-string v5, "[[Character"

    .line 295
    .line 296
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    const-class v4, [Ljava/lang/Boolean;

    .line 300
    .line 301
    const-string v5, "[Boolean"

    .line 302
    .line 303
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    const-class v4, [[Ljava/lang/Boolean;

    .line 307
    .line 308
    const-string v5, "[[Boolean"

    .line 309
    .line 310
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    const-class v4, [Ljava/lang/String;

    .line 314
    .line 315
    const-string v5, "[String"

    .line 316
    .line 317
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    const-class v4, [[Ljava/lang/String;

    .line 321
    .line 322
    const-string v5, "[[String"

    .line 323
    .line 324
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    const-class v4, [Ljava/math/BigDecimal;

    .line 328
    .line 329
    const-string v5, "[BigDecimal"

    .line 330
    .line 331
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    const-class v4, [[Ljava/math/BigDecimal;

    .line 335
    .line 336
    const-string v5, "[[BigDecimal"

    .line 337
    .line 338
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    const-class v4, [Ljava/math/BigInteger;

    .line 342
    .line 343
    const-string v5, "[BigInteger"

    .line 344
    .line 345
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    const-class v4, [[Ljava/math/BigInteger;

    .line 349
    .line 350
    const-string v5, "[[BigInteger"

    .line 351
    .line 352
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    const-class v4, [Ljava/util/UUID;

    .line 356
    .line 357
    const-string v5, "[UUID"

    .line 358
    .line 359
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    const-class v4, [[Ljava/util/UUID;

    .line 363
    .line 364
    const-string v5, "[[UUID"

    .line 365
    .line 366
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    const-class v4, Ljava/lang/Object;

    .line 370
    .line 371
    const-string v5, "Object"

    .line 372
    .line 373
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    const-string v4, "M"

    .line 377
    .line 378
    const-class v5, Ljava/util/HashMap;

    .line 379
    .line 380
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    const-string v4, "HashMap"

    .line 384
    .line 385
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    const-string v4, "java.util.HashMap"

    .line 389
    .line 390
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    const-string v4, "LM"

    .line 394
    .line 395
    const-class v6, Ljava/util/LinkedHashMap;

    .line 396
    .line 397
    invoke-interface {v0, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    const-string v4, "LinkedHashMap"

    .line 401
    .line 402
    invoke-interface {v1, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    const-string v4, "java.util.LinkedHashMap"

    .line 406
    .line 407
    invoke-interface {v1, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    const-string v4, "TM"

    .line 411
    .line 412
    const-class v7, Ljava/util/TreeMap;

    .line 413
    .line 414
    invoke-interface {v0, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    const-string v4, "TreeMap"

    .line 418
    .line 419
    invoke-interface {v1, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    const-string v4, "A"

    .line 423
    .line 424
    const-class v7, Ljava/util/ArrayList;

    .line 425
    .line 426
    invoke-interface {v0, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    const-string v4, "ArrayList"

    .line 430
    .line 431
    invoke-interface {v1, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    const-string v4, "java.util.ArrayList"

    .line 435
    .line 436
    invoke-interface {v1, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    const-class v4, Ljava/util/LinkedList;

    .line 440
    .line 441
    const-string v8, "LA"

    .line 442
    .line 443
    invoke-interface {v0, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    invoke-interface {v1, v8, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    const-string v8, "LinkedList"

    .line 450
    .line 451
    invoke-interface {v1, v8, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    const-string v8, "java.util.LinkedList"

    .line 455
    .line 456
    invoke-interface {v1, v8, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    const-string v4, "java.util.concurrent.ConcurrentLinkedQueue"

    .line 460
    .line 461
    const-class v8, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 462
    .line 463
    invoke-interface {v1, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    const-string v1, "HashSet"

    .line 467
    .line 468
    const-class v4, Ljava/util/HashSet;

    .line 469
    .line 470
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    const-class v1, Ljava/util/TreeSet;

    .line 474
    .line 475
    const-string v9, "TreeSet"

    .line 476
    .line 477
    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    const-string v1, "LinkedHashSet"

    .line 481
    .line 482
    const-class v9, Ljava/util/LinkedHashSet;

    .line 483
    .line 484
    invoke-interface {v0, v9, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    const-class v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 488
    .line 489
    const-string v10, "ConcurrentHashMap"

    .line 490
    .line 491
    invoke-interface {v0, v1, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    const-string v1, "ConcurrentLinkedQueue"

    .line 495
    .line 496
    invoke-interface {v0, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    const-class v1, Lcom/alibaba/fastjson2/JSONObject;

    .line 500
    .line 501
    const-string v8, "JSONObject"

    .line 502
    .line 503
    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    const-class v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 507
    .line 508
    const-string v8, "JSONArray"

    .line 509
    .line 510
    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    const-class v1, Ljava/util/Currency;

    .line 514
    .line 515
    const-string v8, "Currency"

    .line 516
    .line 517
    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    const-class v1, Ljava/util/concurrent/TimeUnit;

    .line 521
    .line 522
    const-string v8, "TimeUnit"

    .line 523
    .line 524
    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 528
    .line 529
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    move-result-object v54

    .line 533
    const-class v76, Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 534
    .line 535
    const-class v77, Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 536
    .line 537
    const-class v10, Ljava/lang/Object;

    .line 538
    .line 539
    const-class v11, Ljava/lang/Cloneable;

    .line 540
    .line 541
    const-class v12, Ljava/lang/AutoCloseable;

    .line 542
    .line 543
    const-class v13, Ljava/lang/Exception;

    .line 544
    .line 545
    const-class v14, Ljava/lang/RuntimeException;

    .line 546
    .line 547
    const-class v15, Ljava/lang/IllegalAccessError;

    .line 548
    .line 549
    const-class v16, Ljava/lang/IllegalAccessException;

    .line 550
    .line 551
    const-class v17, Ljava/lang/IllegalArgumentException;

    .line 552
    .line 553
    const-class v18, Ljava/lang/IllegalMonitorStateException;

    .line 554
    .line 555
    const-class v19, Ljava/lang/IllegalStateException;

    .line 556
    .line 557
    const-class v20, Ljava/lang/IllegalThreadStateException;

    .line 558
    .line 559
    const-class v21, Ljava/lang/IndexOutOfBoundsException;

    .line 560
    .line 561
    const-class v22, Ljava/lang/InstantiationError;

    .line 562
    .line 563
    const-class v23, Ljava/lang/InstantiationException;

    .line 564
    .line 565
    const-class v24, Ljava/lang/InternalError;

    .line 566
    .line 567
    const-class v25, Ljava/lang/InterruptedException;

    .line 568
    .line 569
    const-class v26, Ljava/lang/LinkageError;

    .line 570
    .line 571
    const-class v27, Ljava/lang/NegativeArraySizeException;

    .line 572
    .line 573
    const-class v28, Ljava/lang/NoClassDefFoundError;

    .line 574
    .line 575
    const-class v29, Ljava/lang/NoSuchFieldError;

    .line 576
    .line 577
    const-class v30, Ljava/lang/NoSuchFieldException;

    .line 578
    .line 579
    const-class v31, Ljava/lang/NoSuchMethodError;

    .line 580
    .line 581
    const-class v32, Ljava/lang/NoSuchMethodException;

    .line 582
    .line 583
    const-class v33, Ljava/lang/NullPointerException;

    .line 584
    .line 585
    const-class v34, Ljava/lang/NumberFormatException;

    .line 586
    .line 587
    const-class v35, Ljava/lang/OutOfMemoryError;

    .line 588
    .line 589
    const-class v36, Ljava/lang/SecurityException;

    .line 590
    .line 591
    const-class v37, Ljava/lang/StackOverflowError;

    .line 592
    .line 593
    const-class v38, Ljava/lang/StringIndexOutOfBoundsException;

    .line 594
    .line 595
    const-class v39, Ljava/lang/TypeNotPresentException;

    .line 596
    .line 597
    const-class v40, Ljava/lang/VerifyError;

    .line 598
    .line 599
    const-class v41, Ljava/lang/StackTraceElement;

    .line 600
    .line 601
    const-class v42, Ljava/util/Hashtable;

    .line 602
    .line 603
    const-class v43, Ljava/util/TreeMap;

    .line 604
    .line 605
    const-class v44, Ljava/util/IdentityHashMap;

    .line 606
    .line 607
    const-class v45, Ljava/util/WeakHashMap;

    .line 608
    .line 609
    const-class v46, Ljava/util/HashSet;

    .line 610
    .line 611
    const-class v47, Ljava/util/LinkedHashSet;

    .line 612
    .line 613
    const-class v48, Ljava/util/TreeSet;

    .line 614
    .line 615
    const-class v49, Ljava/util/LinkedList;

    .line 616
    .line 617
    const-class v50, Ljava/util/concurrent/TimeUnit;

    .line 618
    .line 619
    const-class v51, Ljava/util/concurrent/ConcurrentHashMap;

    .line 620
    .line 621
    const-class v52, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 622
    .line 623
    const-class v53, Ljava/util/concurrent/atomic/AtomicLong;

    .line 624
    .line 625
    const-class v55, Ljava/lang/Boolean;

    .line 626
    .line 627
    const-class v56, Ljava/lang/Character;

    .line 628
    .line 629
    const-class v57, Ljava/lang/Byte;

    .line 630
    .line 631
    const-class v58, Ljava/lang/Short;

    .line 632
    .line 633
    const-class v59, Ljava/lang/Integer;

    .line 634
    .line 635
    const-class v60, Ljava/lang/Long;

    .line 636
    .line 637
    const-class v61, Ljava/lang/Float;

    .line 638
    .line 639
    const-class v62, Ljava/lang/Double;

    .line 640
    .line 641
    const-class v63, Ljava/lang/Number;

    .line 642
    .line 643
    const-class v64, Ljava/lang/String;

    .line 644
    .line 645
    const-class v65, Ljava/math/BigDecimal;

    .line 646
    .line 647
    const-class v66, Ljava/math/BigInteger;

    .line 648
    .line 649
    const-class v67, Ljava/util/BitSet;

    .line 650
    .line 651
    const-class v68, Ljava/util/Calendar;

    .line 652
    .line 653
    const-class v69, Ljava/util/Date;

    .line 654
    .line 655
    const-class v70, Ljava/util/Locale;

    .line 656
    .line 657
    const-class v71, Ljava/util/UUID;

    .line 658
    .line 659
    const-class v72, Ljava/util/Currency;

    .line 660
    .line 661
    const-class v73, Ljava/text/SimpleDateFormat;

    .line 662
    .line 663
    const-class v74, Lcom/alibaba/fastjson2/JSONObject;

    .line 664
    .line 665
    const-class v75, Lcom/alibaba/fastjson2/JSONArray;

    .line 666
    .line 667
    filled-new-array/range {v10 .. v77}, [Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    const/4 v1, 0x0

    .line 672
    :goto_0
    const/16 v8, 0x44

    .line 673
    .line 674
    if-ge v1, v8, :cond_0

    .line 675
    .line 676
    aget-object v8, v0, v1

    .line 677
    .line 678
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v10

    .line 682
    sget-object v11, Lcom/alibaba/fastjson2/util/TypeUtils$Mapping;->TYPE_MAPPINGS:Ljava/util/Map;

    .line 683
    .line 684
    invoke-interface {v11, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v12

    .line 691
    invoke-interface {v11, v12, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    sget-object v11, Lcom/alibaba/fastjson2/util/TypeUtils$Mapping;->NAME_MAPPINGS:Ljava/util/Map;

    .line 695
    .line 696
    invoke-interface {v11, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    add-int/lit8 v1, v1, 0x1

    .line 700
    .line 701
    goto :goto_0

    .line 702
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/util/TypeUtils$Mapping;->TYPE_MAPPINGS:Ljava/util/Map;

    .line 703
    .line 704
    const-string v1, "JO10"

    .line 705
    .line 706
    const-class v8, Lcom/alibaba/fastjson2/util/JSONObject1O;

    .line 707
    .line 708
    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    const-string v1, "[Ljava.lang.Object;"

    .line 715
    .line 716
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    const-string v1, "[java.lang.Object"

    .line 720
    .line 721
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    const-string v1, "[Object"

    .line 725
    .line 726
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    const-string v1, "StackTraceElement"

    .line 730
    .line 731
    const-class v2, Ljava/lang/StackTraceElement;

    .line 732
    .line 733
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    const-string v1, "[StackTraceElement"

    .line 737
    .line 738
    const-class v2, [Ljava/lang/StackTraceElement;

    .line 739
    .line 740
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 744
    .line 745
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 746
    .line 747
    .line 748
    move-result-object v1

    .line 749
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    move-result-object v1

    .line 753
    const-string v2, "java.util.Collections$UnmodifiableMap"

    .line 754
    .line 755
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 759
    .line 760
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 761
    .line 762
    .line 763
    move-result-object v1

    .line 764
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    move-result-object v1

    .line 768
    const-string v2, "java.util.Collections$UnmodifiableCollection"

    .line 769
    .line 770
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONObject1x()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    if-eqz v1, :cond_1

    .line 778
    .line 779
    const-string v2, "JO1"

    .line 780
    .line 781
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    :cond_1
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONArray1x()Ljava/lang/Class;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    if-eqz v1, :cond_2

    .line 796
    .line 797
    const-string v2, "JA1"

    .line 798
    .line 799
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    :cond_2
    sget-object v1, Lcom/alibaba/fastjson2/util/TypeUtils$Mapping;->NAME_MAPPINGS:Ljava/util/Map;

    .line 810
    .line 811
    new-instance v2, Ljava/util/HashMap;

    .line 812
    .line 813
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 817
    .line 818
    .line 819
    move-result-object v2

    .line 820
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    move-result-object v2

    .line 824
    const-string v3, "Set"

    .line 825
    .line 826
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 830
    .line 831
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    new-instance v2, Ljava/util/TreeMap;

    .line 846
    .line 847
    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v2}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 851
    .line 852
    .line 853
    move-result-object v2

    .line 854
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    move-result-object v2

    .line 858
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 862
    .line 863
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 867
    .line 868
    .line 869
    move-result-object v2

    .line 870
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    move-result-object v2

    .line 874
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    new-instance v2, Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 878
    .line 879
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentSkipListMap;-><init>()V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentSkipListMap;->keySet()Ljava/util/Set;

    .line 883
    .line 884
    .line 885
    move-result-object v2

    .line 886
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    new-instance v2, Ljava/util/HashMap;

    .line 897
    .line 898
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 902
    .line 903
    .line 904
    move-result-object v2

    .line 905
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    .line 907
    .line 908
    move-result-object v2

    .line 909
    const-string v3, "List"

    .line 910
    .line 911
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 915
    .line 916
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 917
    .line 918
    .line 919
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 920
    .line 921
    .line 922
    move-result-object v2

    .line 923
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    new-instance v2, Ljava/util/TreeMap;

    .line 931
    .line 932
    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v2}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 936
    .line 937
    .line 938
    move-result-object v2

    .line 939
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 940
    .line 941
    .line 942
    move-result-object v2

    .line 943
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 947
    .line 948
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 949
    .line 950
    .line 951
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 952
    .line 953
    .line 954
    move-result-object v2

    .line 955
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 956
    .line 957
    .line 958
    move-result-object v2

    .line 959
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    new-instance v2, Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 963
    .line 964
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentSkipListMap;-><init>()V

    .line 965
    .line 966
    .line 967
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentSkipListMap;->values()Ljava/util/Collection;

    .line 968
    .line 969
    .line 970
    move-result-object v2

    .line 971
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 972
    .line 973
    .line 974
    move-result-object v2

    .line 975
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    invoke-interface {v0, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    const-string v2, "java.util.ImmutableCollections$Map1"

    .line 982
    .line 983
    invoke-interface {v0, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    const-string v2, "java.util.ImmutableCollections$MapN"

    .line 987
    .line 988
    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    const-string v2, "java.util.ImmutableCollections$Set12"

    .line 992
    .line 993
    invoke-interface {v0, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 994
    .line 995
    .line 996
    const-string v2, "java.util.ImmutableCollections$SetN"

    .line 997
    .line 998
    invoke-interface {v0, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    const-string v2, "java.util.ImmutableCollections$List12"

    .line 1002
    .line 1003
    invoke-interface {v0, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    const-string v2, "java.util.ImmutableCollections$ListN"

    .line 1007
    .line 1008
    invoke-interface {v0, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    const-string v2, "java.util.ImmutableCollections$SubList"

    .line 1012
    .line 1013
    invoke-interface {v0, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1025
    .line 1026
    .line 1027
    move-result v1

    .line 1028
    if-eqz v1, :cond_4

    .line 1029
    .line 1030
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v1

    .line 1034
    check-cast v1, Ljava/util/Map$Entry;

    .line 1035
    .line 1036
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v2

    .line 1040
    check-cast v2, Ljava/lang/String;

    .line 1041
    .line 1042
    sget-object v3, Lcom/alibaba/fastjson2/util/TypeUtils$Mapping;->TYPE_MAPPINGS:Ljava/util/Map;

    .line 1043
    .line 1044
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v4

    .line 1048
    check-cast v4, Ljava/lang/Class;

    .line 1049
    .line 1050
    if-nez v4, :cond_3

    .line 1051
    .line 1052
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v1

    .line 1056
    check-cast v1, Ljava/lang/Class;

    .line 1057
    .line 1058
    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1059
    .line 1060
    .line 1061
    goto :goto_1

    .line 1062
    :cond_4
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
