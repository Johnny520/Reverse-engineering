.class public abstract Lcom/esotericsoftware/reflectasm/MethodAccess;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private methodNames:[Ljava/lang/String;

.field private parameterTypes:[[Ljava/lang/Class;

.field private returnTypes:[Ljava/lang/Class;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static addDeclaredMethodsToList(Ljava/lang/Class;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/reflect/Method;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-void
.end method

.method public static get(Ljava/lang/Class;)Lcom/esotericsoftware/reflectasm/MethodAccess;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    const-class v3, Ljava/lang/Object;

    .line 17
    .line 18
    if-ne v0, v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v0, "The type must not be an interface, a primitive type, or void."

    .line 22
    .line 23
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_1
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    move-object v4, v0

    .line 35
    :goto_1
    const-class v5, Ljava/lang/Object;

    .line 36
    .line 37
    if-eq v4, v5, :cond_3

    .line 38
    .line 39
    invoke-static {v4, v3}, Lcom/esotericsoftware/reflectasm/MethodAccess;->addDeclaredMethodsToList(Ljava/lang/Class;Ljava/util/ArrayList;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-static {v0, v3}, Lcom/esotericsoftware/reflectasm/MethodAccess;->recursiveAddInterfaceMethodsToList(Ljava/lang/Class;Ljava/util/ArrayList;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    new-array v5, v4, [Ljava/lang/String;

    .line 55
    .line 56
    new-array v6, v4, [[Ljava/lang/Class;

    .line 57
    .line 58
    new-array v7, v4, [Ljava/lang/Class;

    .line 59
    .line 60
    const/4 v8, 0x0

    .line 61
    move v9, v8

    .line 62
    :goto_2
    if-ge v9, v4, :cond_4

    .line 63
    .line 64
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    check-cast v10, Ljava/lang/reflect/Method;

    .line 69
    .line 70
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    aput-object v11, v5, v9

    .line 75
    .line 76
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    aput-object v11, v6, v9

    .line 81
    .line 82
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    aput-object v10, v7, v9

    .line 87
    .line 88
    add-int/lit8 v9, v9, 0x1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    const-string v10, "MethodAccess"

    .line 96
    .line 97
    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    const-string v11, "java."

    .line 102
    .line 103
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    if-eqz v11, :cond_5

    .line 108
    .line 109
    const-string v11, "reflectasm."

    .line 110
    .line 111
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    :cond_5
    invoke-static {v0}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->get(Ljava/lang/Class;)Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    monitor-enter v11

    .line 120
    :try_start_0
    invoke-virtual {v11, v10}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->loadAccessClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-nez v0, :cond_d

    .line 125
    .line 126
    const/16 v0, 0x2f

    .line 127
    .line 128
    const/16 v12, 0x2e

    .line 129
    .line 130
    invoke-virtual {v10, v12, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v16

    .line 134
    invoke-virtual {v9, v12, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    new-instance v13, Lcom/esotericsoftware/asm/ClassWriter;

    .line 139
    .line 140
    const/4 v9, 0x1

    .line 141
    invoke-direct {v13, v9}, Lcom/esotericsoftware/asm/ClassWriter;-><init>(I)V

    .line 142
    .line 143
    .line 144
    const-string v18, "com/esotericsoftware/reflectasm/MethodAccess"

    .line 145
    .line 146
    const/16 v19, 0x0

    .line 147
    .line 148
    const v14, 0x3002d

    .line 149
    .line 150
    .line 151
    const/16 v15, 0x21

    .line 152
    .line 153
    const/16 v17, 0x0

    .line 154
    .line 155
    invoke-virtual/range {v13 .. v19}, Lcom/esotericsoftware/asm/ClassWriter;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    move-object/from16 v17, v13

    .line 159
    .line 160
    const-string v19, "<init>"

    .line 161
    .line 162
    const-string v20, "()V"

    .line 163
    .line 164
    const/16 v21, 0x0

    .line 165
    .line 166
    const/16 v22, 0x0

    .line 167
    .line 168
    const/16 v18, 0x1

    .line 169
    .line 170
    invoke-virtual/range {v17 .. v22}, Lcom/esotericsoftware/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 171
    .line 172
    .line 173
    move-result-object v12

    .line 174
    invoke-virtual {v12}, Lcom/esotericsoftware/asm/MethodVisitor;->visitCode()V

    .line 175
    .line 176
    .line 177
    const/16 v13, 0x19

    .line 178
    .line 179
    invoke-virtual {v12, v13, v8}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 180
    .line 181
    .line 182
    const-string v14, "com/esotericsoftware/reflectasm/MethodAccess"

    .line 183
    .line 184
    const-string v15, "<init>"

    .line 185
    .line 186
    move-object/from16 v16, v2

    .line 187
    .line 188
    const-string v2, "()V"

    .line 189
    .line 190
    const/16 v9, 0xb7

    .line 191
    .line 192
    invoke-virtual {v12, v9, v14, v15, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const/16 v2, 0xb1

    .line 196
    .line 197
    invoke-virtual {v12, v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v8, v8}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12}, Lcom/esotericsoftware/asm/MethodVisitor;->visitEnd()V

    .line 204
    .line 205
    .line 206
    const-string v19, "invoke"

    .line 207
    .line 208
    const-string v20, "(Ljava/lang/Object;I[Ljava/lang/Object;)Ljava/lang/Object;"

    .line 209
    .line 210
    const/16 v21, 0x0

    .line 211
    .line 212
    const/16 v22, 0x0

    .line 213
    .line 214
    const/16 v18, 0x81

    .line 215
    .line 216
    invoke-virtual/range {v17 .. v22}, Lcom/esotericsoftware/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/esotericsoftware/asm/MethodVisitor;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitCode()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v12

    .line 227
    const/4 v14, 0x2

    .line 228
    const/16 v15, 0x15

    .line 229
    .line 230
    if-nez v12, :cond_c

    .line 231
    .line 232
    const/4 v12, 0x1

    .line 233
    invoke-virtual {v2, v13, v12}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 234
    .line 235
    .line 236
    const/16 v12, 0xc0

    .line 237
    .line 238
    invoke-virtual {v2, v12, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 239
    .line 240
    .line 241
    const/16 v9, 0x3a

    .line 242
    .line 243
    const/4 v12, 0x4

    .line 244
    invoke-virtual {v2, v9, v12}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v15, v14}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 248
    .line 249
    .line 250
    new-array v9, v4, [Lcom/esotericsoftware/asm/Label;

    .line 251
    .line 252
    move v14, v8

    .line 253
    :goto_3
    if-ge v14, v4, :cond_6

    .line 254
    .line 255
    new-instance v22, Lcom/esotericsoftware/asm/Label;

    .line 256
    .line 257
    invoke-direct/range {v22 .. v22}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 258
    .line 259
    .line 260
    aput-object v22, v9, v14

    .line 261
    .line 262
    add-int/lit8 v14, v14, 0x1

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :catchall_0
    move-exception v0

    .line 266
    goto/16 :goto_e

    .line 267
    .line 268
    :cond_6
    new-instance v14, Lcom/esotericsoftware/asm/Label;

    .line 269
    .line 270
    invoke-direct {v14}, Lcom/esotericsoftware/asm/Label;-><init>()V

    .line 271
    .line 272
    .line 273
    add-int/lit8 v15, v4, -0x1

    .line 274
    .line 275
    invoke-virtual {v2, v8, v15, v14, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTableSwitchInsn(IILcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;)V

    .line 276
    .line 277
    .line 278
    new-instance v15, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    const/16 v8, 0x80

    .line 281
    .line 282
    invoke-direct {v15, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 283
    .line 284
    .line 285
    const/4 v8, 0x0

    .line 286
    :goto_4
    if-ge v8, v4, :cond_b

    .line 287
    .line 288
    aget-object v12, v9, v8

    .line 289
    .line 290
    invoke-virtual {v2, v12}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 291
    .line 292
    .line 293
    if-nez v8, :cond_7

    .line 294
    .line 295
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v26

    .line 299
    const/16 v27, 0x0

    .line 300
    .line 301
    const/16 v28, 0x0

    .line 302
    .line 303
    const/16 v24, 0x1

    .line 304
    .line 305
    const/16 v25, 0x1

    .line 306
    .line 307
    move-object/from16 v23, v2

    .line 308
    .line 309
    invoke-virtual/range {v23 .. v28}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    move-object/from16 v2, v23

    .line 313
    .line 314
    :goto_5
    const/4 v12, 0x4

    .line 315
    goto :goto_6

    .line 316
    :cond_7
    move-object/from16 v23, v2

    .line 317
    .line 318
    const/16 v27, 0x0

    .line 319
    .line 320
    const/16 v28, 0x0

    .line 321
    .line 322
    const/16 v24, 0x3

    .line 323
    .line 324
    const/16 v25, 0x0

    .line 325
    .line 326
    const/16 v26, 0x0

    .line 327
    .line 328
    invoke-virtual/range {v23 .. v28}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    goto :goto_5

    .line 332
    :goto_6
    invoke-virtual {v2, v13, v12}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 333
    .line 334
    .line 335
    const/4 v12, 0x0

    .line 336
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 337
    .line 338
    .line 339
    const/16 v12, 0x28

    .line 340
    .line 341
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    aget-object v12, v6, v8

    .line 345
    .line 346
    aget-object v23, v7, v8

    .line 347
    .line 348
    move/from16 v25, v1

    .line 349
    .line 350
    const/4 v13, 0x0

    .line 351
    :goto_7
    array-length v1, v12

    .line 352
    if-ge v13, v1, :cond_8

    .line 353
    .line 354
    const/4 v1, 0x3

    .line 355
    move/from16 v26, v4

    .line 356
    .line 357
    const/16 v4, 0x19

    .line 358
    .line 359
    invoke-virtual {v2, v4, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 360
    .line 361
    .line 362
    const/16 v1, 0x10

    .line 363
    .line 364
    invoke-virtual {v2, v1, v13}, Lcom/esotericsoftware/asm/MethodVisitor;->visitIntInsn(II)V

    .line 365
    .line 366
    .line 367
    const/16 v1, 0x32

    .line 368
    .line 369
    invoke-virtual {v2, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 370
    .line 371
    .line 372
    aget-object v1, v12, v13

    .line 373
    .line 374
    invoke-static {v1}, Lcom/esotericsoftware/asm/Type;->getType(Ljava/lang/Class;)Lcom/esotericsoftware/asm/Type;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-virtual {v1}, Lcom/esotericsoftware/asm/Type;->getSort()I

    .line 379
    .line 380
    .line 381
    move-result v24

    .line 382
    packed-switch v24, :pswitch_data_0

    .line 383
    .line 384
    .line 385
    move-object/from16 v27, v1

    .line 386
    .line 387
    :goto_8
    move-object/from16 v28, v9

    .line 388
    .line 389
    move-object/from16 v29, v12

    .line 390
    .line 391
    goto/16 :goto_9

    .line 392
    .line 393
    :pswitch_0
    invoke-virtual {v1}, Lcom/esotericsoftware/asm/Type;->getInternalName()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    move-object/from16 v27, v1

    .line 398
    .line 399
    const/16 v1, 0xc0

    .line 400
    .line 401
    invoke-virtual {v2, v1, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 402
    .line 403
    .line 404
    goto :goto_8

    .line 405
    :pswitch_1
    move-object/from16 v27, v1

    .line 406
    .line 407
    const/16 v1, 0xc0

    .line 408
    .line 409
    invoke-virtual/range {v27 .. v27}, Lcom/esotericsoftware/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    invoke-virtual {v2, v1, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 414
    .line 415
    .line 416
    goto :goto_8

    .line 417
    :pswitch_2
    move-object/from16 v27, v1

    .line 418
    .line 419
    const/16 v1, 0xc0

    .line 420
    .line 421
    const-string v4, "java/lang/Double"

    .line 422
    .line 423
    invoke-virtual {v2, v1, v4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 424
    .line 425
    .line 426
    const-string v1, "java/lang/Double"

    .line 427
    .line 428
    const-string v4, "doubleValue"

    .line 429
    .line 430
    move-object/from16 v28, v9

    .line 431
    .line 432
    const-string v9, "()D"

    .line 433
    .line 434
    move-object/from16 v29, v12

    .line 435
    .line 436
    const/16 v12, 0xb6

    .line 437
    .line 438
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    goto/16 :goto_9

    .line 442
    .line 443
    :pswitch_3
    move-object/from16 v27, v1

    .line 444
    .line 445
    move-object/from16 v28, v9

    .line 446
    .line 447
    move-object/from16 v29, v12

    .line 448
    .line 449
    const-string v1, "java/lang/Long"

    .line 450
    .line 451
    const/16 v4, 0xc0

    .line 452
    .line 453
    invoke-virtual {v2, v4, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 454
    .line 455
    .line 456
    const-string v1, "java/lang/Long"

    .line 457
    .line 458
    const-string v4, "longValue"

    .line 459
    .line 460
    const-string v9, "()J"

    .line 461
    .line 462
    const/16 v12, 0xb6

    .line 463
    .line 464
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    goto/16 :goto_9

    .line 468
    .line 469
    :pswitch_4
    move-object/from16 v27, v1

    .line 470
    .line 471
    move-object/from16 v28, v9

    .line 472
    .line 473
    move-object/from16 v29, v12

    .line 474
    .line 475
    const-string v1, "java/lang/Float"

    .line 476
    .line 477
    const/16 v4, 0xc0

    .line 478
    .line 479
    invoke-virtual {v2, v4, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 480
    .line 481
    .line 482
    const-string v1, "java/lang/Float"

    .line 483
    .line 484
    const-string v4, "floatValue"

    .line 485
    .line 486
    const-string v9, "()F"

    .line 487
    .line 488
    const/16 v12, 0xb6

    .line 489
    .line 490
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    goto/16 :goto_9

    .line 494
    .line 495
    :pswitch_5
    move-object/from16 v27, v1

    .line 496
    .line 497
    move-object/from16 v28, v9

    .line 498
    .line 499
    move-object/from16 v29, v12

    .line 500
    .line 501
    const-string v1, "java/lang/Integer"

    .line 502
    .line 503
    const/16 v4, 0xc0

    .line 504
    .line 505
    invoke-virtual {v2, v4, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 506
    .line 507
    .line 508
    const-string v1, "java/lang/Integer"

    .line 509
    .line 510
    const-string v4, "intValue"

    .line 511
    .line 512
    const-string v9, "()I"

    .line 513
    .line 514
    const/16 v12, 0xb6

    .line 515
    .line 516
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    goto :goto_9

    .line 520
    :pswitch_6
    move-object/from16 v27, v1

    .line 521
    .line 522
    move-object/from16 v28, v9

    .line 523
    .line 524
    move-object/from16 v29, v12

    .line 525
    .line 526
    const-string v1, "java/lang/Short"

    .line 527
    .line 528
    const/16 v4, 0xc0

    .line 529
    .line 530
    invoke-virtual {v2, v4, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 531
    .line 532
    .line 533
    const-string v1, "java/lang/Short"

    .line 534
    .line 535
    const-string v4, "shortValue"

    .line 536
    .line 537
    const-string v9, "()S"

    .line 538
    .line 539
    const/16 v12, 0xb6

    .line 540
    .line 541
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    goto :goto_9

    .line 545
    :pswitch_7
    move-object/from16 v27, v1

    .line 546
    .line 547
    move-object/from16 v28, v9

    .line 548
    .line 549
    move-object/from16 v29, v12

    .line 550
    .line 551
    const-string v1, "java/lang/Byte"

    .line 552
    .line 553
    const/16 v4, 0xc0

    .line 554
    .line 555
    invoke-virtual {v2, v4, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 556
    .line 557
    .line 558
    const-string v1, "java/lang/Byte"

    .line 559
    .line 560
    const-string v4, "byteValue"

    .line 561
    .line 562
    const-string v9, "()B"

    .line 563
    .line 564
    const/16 v12, 0xb6

    .line 565
    .line 566
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    goto :goto_9

    .line 570
    :pswitch_8
    move-object/from16 v27, v1

    .line 571
    .line 572
    move-object/from16 v28, v9

    .line 573
    .line 574
    move-object/from16 v29, v12

    .line 575
    .line 576
    const-string v1, "java/lang/Character"

    .line 577
    .line 578
    const/16 v4, 0xc0

    .line 579
    .line 580
    invoke-virtual {v2, v4, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 581
    .line 582
    .line 583
    const-string v1, "java/lang/Character"

    .line 584
    .line 585
    const-string v4, "charValue"

    .line 586
    .line 587
    const-string v9, "()C"

    .line 588
    .line 589
    const/16 v12, 0xb6

    .line 590
    .line 591
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    goto :goto_9

    .line 595
    :pswitch_9
    move-object/from16 v27, v1

    .line 596
    .line 597
    move-object/from16 v28, v9

    .line 598
    .line 599
    move-object/from16 v29, v12

    .line 600
    .line 601
    const-string v1, "java/lang/Boolean"

    .line 602
    .line 603
    const/16 v4, 0xc0

    .line 604
    .line 605
    invoke-virtual {v2, v4, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 606
    .line 607
    .line 608
    const-string v1, "java/lang/Boolean"

    .line 609
    .line 610
    const-string v9, "booleanValue"

    .line 611
    .line 612
    const-string v12, "()Z"

    .line 613
    .line 614
    const/16 v4, 0xb6

    .line 615
    .line 616
    invoke-virtual {v2, v4, v1, v9, v12}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    :goto_9
    invoke-virtual/range {v27 .. v27}, Lcom/esotericsoftware/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    add-int/lit8 v13, v13, 0x1

    .line 627
    .line 628
    move/from16 v4, v26

    .line 629
    .line 630
    move-object/from16 v9, v28

    .line 631
    .line 632
    move-object/from16 v12, v29

    .line 633
    .line 634
    goto/16 :goto_7

    .line 635
    .line 636
    :cond_8
    move/from16 v26, v4

    .line 637
    .line 638
    move-object/from16 v28, v9

    .line 639
    .line 640
    const/16 v1, 0x29

    .line 641
    .line 642
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    invoke-static/range {v23 .. v23}, Lcom/esotericsoftware/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    const/16 v12, 0xb8

    .line 653
    .line 654
    if-eqz v25, :cond_9

    .line 655
    .line 656
    const/16 v1, 0xb9

    .line 657
    .line 658
    goto :goto_a

    .line 659
    :cond_9
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    check-cast v1, Ljava/lang/reflect/Method;

    .line 664
    .line 665
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 670
    .line 671
    .line 672
    move-result v1

    .line 673
    if-eqz v1, :cond_a

    .line 674
    .line 675
    move v1, v12

    .line 676
    goto :goto_a

    .line 677
    :cond_a
    const/16 v1, 0xb6

    .line 678
    .line 679
    :goto_a
    aget-object v4, v5, v8

    .line 680
    .line 681
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v9

    .line 685
    invoke-virtual {v2, v1, v0, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    invoke-static/range {v23 .. v23}, Lcom/esotericsoftware/asm/Type;->getType(Ljava/lang/Class;)Lcom/esotericsoftware/asm/Type;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    invoke-virtual {v1}, Lcom/esotericsoftware/asm/Type;->getSort()I

    .line 693
    .line 694
    .line 695
    move-result v1

    .line 696
    packed-switch v1, :pswitch_data_1

    .line 697
    .line 698
    .line 699
    :goto_b
    const/4 v12, 0x1

    .line 700
    goto :goto_c

    .line 701
    :pswitch_a
    const-string v1, "java/lang/Double"

    .line 702
    .line 703
    const-string v4, "valueOf"

    .line 704
    .line 705
    const-string v9, "(D)Ljava/lang/Double;"

    .line 706
    .line 707
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    goto :goto_b

    .line 711
    :pswitch_b
    const-string v1, "java/lang/Long"

    .line 712
    .line 713
    const-string v4, "valueOf"

    .line 714
    .line 715
    const-string v9, "(J)Ljava/lang/Long;"

    .line 716
    .line 717
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    goto :goto_b

    .line 721
    :pswitch_c
    const-string v1, "java/lang/Float"

    .line 722
    .line 723
    const-string v4, "valueOf"

    .line 724
    .line 725
    const-string v9, "(F)Ljava/lang/Float;"

    .line 726
    .line 727
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    goto :goto_b

    .line 731
    :pswitch_d
    const-string v1, "java/lang/Integer"

    .line 732
    .line 733
    const-string v4, "valueOf"

    .line 734
    .line 735
    const-string v9, "(I)Ljava/lang/Integer;"

    .line 736
    .line 737
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    goto :goto_b

    .line 741
    :pswitch_e
    const-string v1, "java/lang/Short"

    .line 742
    .line 743
    const-string v4, "valueOf"

    .line 744
    .line 745
    const-string v9, "(S)Ljava/lang/Short;"

    .line 746
    .line 747
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    goto :goto_b

    .line 751
    :pswitch_f
    const-string v1, "java/lang/Byte"

    .line 752
    .line 753
    const-string v4, "valueOf"

    .line 754
    .line 755
    const-string v9, "(B)Ljava/lang/Byte;"

    .line 756
    .line 757
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    goto :goto_b

    .line 761
    :pswitch_10
    const-string v1, "java/lang/Character"

    .line 762
    .line 763
    const-string v4, "valueOf"

    .line 764
    .line 765
    const-string v9, "(C)Ljava/lang/Character;"

    .line 766
    .line 767
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    goto :goto_b

    .line 771
    :pswitch_11
    const-string v1, "java/lang/Boolean"

    .line 772
    .line 773
    const-string v4, "valueOf"

    .line 774
    .line 775
    const-string v9, "(Z)Ljava/lang/Boolean;"

    .line 776
    .line 777
    invoke-virtual {v2, v12, v1, v4, v9}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 778
    .line 779
    .line 780
    goto :goto_b

    .line 781
    :pswitch_12
    const/4 v12, 0x1

    .line 782
    invoke-virtual {v2, v12}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 783
    .line 784
    .line 785
    :goto_c
    const/16 v1, 0xb0

    .line 786
    .line 787
    invoke-virtual {v2, v1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 788
    .line 789
    .line 790
    add-int/lit8 v8, v8, 0x1

    .line 791
    .line 792
    move/from16 v1, v25

    .line 793
    .line 794
    move/from16 v4, v26

    .line 795
    .line 796
    move-object/from16 v9, v28

    .line 797
    .line 798
    const/4 v12, 0x4

    .line 799
    const/16 v13, 0x19

    .line 800
    .line 801
    goto/16 :goto_4

    .line 802
    .line 803
    :cond_b
    invoke-virtual {v2, v14}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 804
    .line 805
    .line 806
    const/16 v27, 0x0

    .line 807
    .line 808
    const/16 v28, 0x0

    .line 809
    .line 810
    const/16 v24, 0x3

    .line 811
    .line 812
    const/16 v25, 0x0

    .line 813
    .line 814
    const/16 v26, 0x0

    .line 815
    .line 816
    move-object/from16 v23, v2

    .line 817
    .line 818
    invoke-virtual/range {v23 .. v28}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 819
    .line 820
    .line 821
    :cond_c
    const-string v0, "java/lang/IllegalArgumentException"

    .line 822
    .line 823
    const/16 v1, 0xbb

    .line 824
    .line 825
    invoke-virtual {v2, v1, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 826
    .line 827
    .line 828
    const/16 v0, 0x59

    .line 829
    .line 830
    invoke-virtual {v2, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 831
    .line 832
    .line 833
    const-string v3, "java/lang/StringBuilder"

    .line 834
    .line 835
    invoke-virtual {v2, v1, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v2, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 839
    .line 840
    .line 841
    const-string v0, "Method not found: "

    .line 842
    .line 843
    invoke-virtual {v2, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 844
    .line 845
    .line 846
    const-string v0, "java/lang/StringBuilder"

    .line 847
    .line 848
    const-string v1, "<init>"

    .line 849
    .line 850
    const-string v3, "(Ljava/lang/String;)V"

    .line 851
    .line 852
    const/16 v4, 0xb7

    .line 853
    .line 854
    invoke-virtual {v2, v4, v0, v1, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    const/4 v0, 0x2

    .line 858
    const/16 v1, 0x15

    .line 859
    .line 860
    invoke-virtual {v2, v1, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 861
    .line 862
    .line 863
    const-string v0, "java/lang/StringBuilder"

    .line 864
    .line 865
    const-string v1, "append"

    .line 866
    .line 867
    const-string v3, "(I)Ljava/lang/StringBuilder;"

    .line 868
    .line 869
    const/16 v12, 0xb6

    .line 870
    .line 871
    invoke-virtual {v2, v12, v0, v1, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    const-string v0, "java/lang/StringBuilder"

    .line 875
    .line 876
    const-string v1, "toString"

    .line 877
    .line 878
    const-string v3, "()Ljava/lang/String;"

    .line 879
    .line 880
    invoke-virtual {v2, v12, v0, v1, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    const-string v0, "java/lang/IllegalArgumentException"

    .line 884
    .line 885
    const-string v1, "<init>"

    .line 886
    .line 887
    const-string v3, "(Ljava/lang/String;)V"

    .line 888
    .line 889
    const/16 v4, 0xb7

    .line 890
    .line 891
    invoke-virtual {v2, v4, v0, v1, v3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    const/16 v0, 0xbf

    .line 895
    .line 896
    invoke-virtual {v2, v0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 897
    .line 898
    .line 899
    const/4 v12, 0x0

    .line 900
    invoke-virtual {v2, v12, v12}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitEnd()V

    .line 904
    .line 905
    .line 906
    invoke-virtual/range {v17 .. v17}, Lcom/esotericsoftware/asm/ClassWriter;->visitEnd()V

    .line 907
    .line 908
    .line 909
    invoke-virtual/range {v17 .. v17}, Lcom/esotericsoftware/asm/ClassWriter;->toByteArray()[B

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    invoke-virtual {v11, v10, v0}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->defineAccessClass(Ljava/lang/String;[B)Ljava/lang/Class;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    goto :goto_d

    .line 918
    :cond_d
    move-object/from16 v16, v2

    .line 919
    .line 920
    :goto_d
    monitor-exit v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 921
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    check-cast v0, Lcom/esotericsoftware/reflectasm/MethodAccess;

    .line 926
    .line 927
    iput-object v5, v0, Lcom/esotericsoftware/reflectasm/MethodAccess;->methodNames:[Ljava/lang/String;

    .line 928
    .line 929
    iput-object v6, v0, Lcom/esotericsoftware/reflectasm/MethodAccess;->parameterTypes:[[Ljava/lang/Class;

    .line 930
    .line 931
    iput-object v7, v0, Lcom/esotericsoftware/reflectasm/MethodAccess;->returnTypes:[Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 932
    .line 933
    return-object v0

    .line 934
    :catchall_1
    move-exception v0

    .line 935
    const-string v1, "Error constructing method access class: "

    .line 936
    .line 937
    invoke-virtual {v1, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v1

    .line 941
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 942
    .line 943
    .line 944
    return-object v16

    .line 945
    :goto_e
    :try_start_2
    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 946
    throw v0

    .line 947
    :pswitch_data_0
    .packed-switch 0x1
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

    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method private static recursiveAddInterfaceMethodsToList(Ljava/lang/Class;Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/reflect/Method;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lcom/esotericsoftware/reflectasm/MethodAccess;->addDeclaredMethodsToList(Ljava/lang/Class;Ljava/util/ArrayList;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    array-length v0, p0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, v0, :cond_0

    .line 11
    .line 12
    aget-object v2, p0, v1

    .line 13
    .line 14
    invoke-static {v2, p1}, Lcom/esotericsoftware/reflectasm/MethodAccess;->recursiveAddInterfaceMethodsToList(Ljava/lang/Class;Ljava/util/ArrayList;)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method


# virtual methods
.method public getIndex(Ljava/lang/String;)I
    .locals 3

    .line 66
    iget-object v0, p0, Lcom/esotericsoftware/reflectasm/MethodAccess;->methodNames:[Ljava/lang/String;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 67
    iget-object v2, p0, Lcom/esotericsoftware/reflectasm/MethodAccess;->methodNames:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 68
    :cond_1
    const-string p0, "Unable to find non-private method: "

    .line 69
    invoke-static {p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 70
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public getIndex(Ljava/lang/String;I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/reflectasm/MethodAccess;->methodNames:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lcom/esotericsoftware/reflectasm/MethodAccess;->methodNames:[Ljava/lang/String;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lcom/esotericsoftware/reflectasm/MethodAccess;->parameterTypes:[[Ljava/lang/Class;

    .line 18
    .line 19
    aget-object v2, v2, v1

    .line 20
    .line 21
    array-length v2, v2

    .line 22
    if-ne v2, p2, :cond_0

    .line 23
    .line 24
    return v1

    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "Unable to find non-private method: "

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, " with "

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p1, " params."

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0
.end method

.method public varargs getIndex(Ljava/lang/String;[Ljava/lang/Class;)I
    .locals 3

    .line 61
    iget-object v0, p0, Lcom/esotericsoftware/reflectasm/MethodAccess;->methodNames:[Ljava/lang/String;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 62
    iget-object v2, p0, Lcom/esotericsoftware/reflectasm/MethodAccess;->methodNames:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/esotericsoftware/reflectasm/MethodAccess;->parameterTypes:[[Ljava/lang/Class;

    aget-object v2, v2, v1

    invoke-static {p2, v2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 63
    :cond_1
    const-string p0, "Unable to find non-private method: "

    const-string v0, " "

    .line 64
    invoke-static {p0, p1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 65
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    const/4 p0, 0x0

    return p0
.end method

.method public getMethodNames()[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/reflectasm/MethodAccess;->methodNames:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getParameterTypes()[[Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/reflectasm/MethodAccess;->parameterTypes:[[Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReturnTypes()[Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/reflectasm/MethodAccess;->returnTypes:[Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public varargs abstract invoke(Ljava/lang/Object;I[Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public varargs invoke(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 15
    invoke-virtual {p0, p2, p3}, Lcom/esotericsoftware/reflectasm/MethodAccess;->getIndex(Ljava/lang/String;[Ljava/lang/Class;)I

    move-result p2

    invoke-virtual {p0, p1, p2, p4}, Lcom/esotericsoftware/reflectasm/MethodAccess;->invoke(Ljava/lang/Object;I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public varargs invoke(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    array-length v0, p3

    .line 6
    :goto_0
    invoke-virtual {p0, p2, v0}, Lcom/esotericsoftware/reflectasm/MethodAccess;->getIndex(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/reflectasm/MethodAccess;->invoke(Ljava/lang/Object;I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
