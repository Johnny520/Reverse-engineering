.class public abstract Lnet/bytebuddy/description/module/ModuleDescription$AbstractBase;
.super Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/description/module/ModuleDescription;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/module/ModuleDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractBase"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public accept(Lnet/bytebuddy/jar/asm/ClassVisitor;)V
    .locals 9

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement;->getActualName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p0}, Lnet/bytebuddy/description/module/ModuleDescription;->getVersion()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1, v0, v1, v2}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitModule(Ljava/lang/String;ILjava/lang/String;)Lnet/bytebuddy/jar/asm/ModuleVisitor;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_b

    .line 18
    .line 19
    invoke-interface {p0}, Lnet/bytebuddy/description/module/ModuleDescription;->getMainClass()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/16 v1, 0x2f

    .line 24
    .line 25
    const/16 v2, 0x2e

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitMainClass(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {p0}, Lnet/bytebuddy/description/module/ModuleDescription;->getPackages()Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v3, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {p1, v3}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitPackage(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-interface {p0}, Lnet/bytebuddy/description/module/ModuleDescription;->getRequires()Ljava/util/Map;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_2

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Ljava/util/Map$Entry;

    .line 87
    .line 88
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    check-cast v4, Ljava/lang/String;

    .line 93
    .line 94
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Lnet/bytebuddy/description/module/ModuleDescription$Requires;

    .line 99
    .line 100
    invoke-interface {v5}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Lnet/bytebuddy/description/module/ModuleDescription$Requires;

    .line 109
    .line 110
    invoke-interface {v3}, Lnet/bytebuddy/description/module/ModuleDescription$Requires;->getVersion()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {p1, v4, v5, v3}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitRequire(Ljava/lang/String;ILjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    invoke-interface {p0}, Lnet/bytebuddy/description/module/ModuleDescription;->getExports()Ljava/util/Map;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    const/4 v4, 0x0

    .line 135
    const/4 v5, 0x0

    .line 136
    if-eqz v3, :cond_4

    .line 137
    .line 138
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    check-cast v3, Ljava/util/Map$Entry;

    .line 143
    .line 144
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    check-cast v6, Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v6, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    check-cast v7, Lnet/bytebuddy/description/module/ModuleDescription$Exports;

    .line 159
    .line 160
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    check-cast v8, Lnet/bytebuddy/description/module/ModuleDescription$Exports;

    .line 169
    .line 170
    invoke-interface {v8}, Lnet/bytebuddy/description/module/ModuleDescription$Exports;->getTargets()Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    invoke-interface {v8}, Ljava/util/Set;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-eqz v8, :cond_3

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_3
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, Lnet/bytebuddy/description/module/ModuleDescription$Exports;

    .line 186
    .line 187
    invoke-interface {v3}, Lnet/bytebuddy/description/module/ModuleDescription$Exports;->getTargets()Ljava/util/Set;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    new-array v4, v4, [Ljava/lang/String;

    .line 192
    .line 193
    invoke-interface {v3, v4}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    move-object v5, v3

    .line 198
    check-cast v5, [Ljava/lang/String;

    .line 199
    .line 200
    :goto_3
    invoke-virtual {p1, v6, v7, v5}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitExport(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_4
    invoke-interface {p0}, Lnet/bytebuddy/description/module/ModuleDescription;->getOpens()Ljava/util/Map;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    if-eqz v3, :cond_6

    .line 221
    .line 222
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    check-cast v3, Ljava/util/Map$Entry;

    .line 227
    .line 228
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    check-cast v6, Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {v6, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    check-cast v7, Lnet/bytebuddy/description/module/ModuleDescription$Opens;

    .line 243
    .line 244
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    check-cast v8, Lnet/bytebuddy/description/module/ModuleDescription$Opens;

    .line 253
    .line 254
    invoke-interface {v8}, Lnet/bytebuddy/description/module/ModuleDescription$Opens;->getTargets()Ljava/util/Set;

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    invoke-interface {v8}, Ljava/util/Set;->isEmpty()Z

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    if-eqz v8, :cond_5

    .line 263
    .line 264
    move-object v3, v5

    .line 265
    goto :goto_5

    .line 266
    :cond_5
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    check-cast v3, Lnet/bytebuddy/description/module/ModuleDescription$Opens;

    .line 271
    .line 272
    invoke-interface {v3}, Lnet/bytebuddy/description/module/ModuleDescription$Opens;->getTargets()Ljava/util/Set;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    new-array v8, v4, [Ljava/lang/String;

    .line 277
    .line 278
    invoke-interface {v3, v8}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    check-cast v3, [Ljava/lang/String;

    .line 283
    .line 284
    :goto_5
    invoke-virtual {p1, v6, v7, v3}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitOpen(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_6
    invoke-interface {p0}, Lnet/bytebuddy/description/module/ModuleDescription;->getUses()Ljava/util/Set;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-eqz v3, :cond_7

    .line 301
    .line 302
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    check-cast v3, Ljava/lang/String;

    .line 307
    .line 308
    invoke-virtual {v3, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    invoke-virtual {p1, v3}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitUse(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_7
    invoke-interface {p0}, Lnet/bytebuddy/description/module/ModuleDescription;->getProvides()Ljava/util/Map;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_a

    .line 333
    .line 334
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v0, Ljava/util/Map$Entry;

    .line 339
    .line 340
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    check-cast v3, Lnet/bytebuddy/description/module/ModuleDescription$Provides;

    .line 345
    .line 346
    invoke-interface {v3}, Lnet/bytebuddy/description/module/ModuleDescription$Provides;->getProviders()Ljava/util/Set;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    if-eqz v3, :cond_8

    .line 355
    .line 356
    move-object v3, v5

    .line 357
    goto :goto_8

    .line 358
    :cond_8
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    check-cast v3, Lnet/bytebuddy/description/module/ModuleDescription$Provides;

    .line 363
    .line 364
    invoke-interface {v3}, Lnet/bytebuddy/description/module/ModuleDescription$Provides;->getProviders()Ljava/util/Set;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    new-array v3, v3, [Ljava/lang/String;

    .line 373
    .line 374
    :goto_8
    if-eqz v3, :cond_9

    .line 375
    .line 376
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    check-cast v6, Lnet/bytebuddy/description/module/ModuleDescription$Provides;

    .line 381
    .line 382
    invoke-interface {v6}, Lnet/bytebuddy/description/module/ModuleDescription$Provides;->getProviders()Ljava/util/Set;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    move v7, v4

    .line 391
    :goto_9
    array-length v8, v3

    .line 392
    if-ge v7, v8, :cond_9

    .line 393
    .line 394
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    check-cast v8, Ljava/lang/String;

    .line 399
    .line 400
    invoke-virtual {v8, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v8

    .line 404
    aput-object v8, v3, v7

    .line 405
    .line 406
    add-int/lit8 v7, v7, 0x1

    .line 407
    .line 408
    goto :goto_9

    .line 409
    :cond_9
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    check-cast v0, Ljava/lang/String;

    .line 414
    .line 415
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-virtual {p1, v0, v3}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitProvide(Ljava/lang/String;[Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_a
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitEnd()V

    .line 424
    .line 425
    .line 426
    :cond_b
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lnet/bytebuddy/description/module/ModuleDescription;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lnet/bytebuddy/description/module/ModuleDescription;

    .line 8
    .line 9
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement;->getActualName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement;->getActualName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement;->getActualName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    mul-int/lit8 p0, p0, 0x11

    .line 10
    .line 11
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "module "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement;->getActualName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
