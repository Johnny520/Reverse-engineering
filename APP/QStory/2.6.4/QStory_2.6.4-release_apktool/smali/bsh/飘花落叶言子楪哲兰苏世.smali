.class public final Lbsh/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static 飘花落叶言子楪世苏哲兰:Lbsh/飘花落叶言子楪哲兰苏世;


# direct methods
.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;Lbsh/Modifiers;[Ljava/lang/Class;Ljava/lang/Class;Lbsh/BSHBlock;Lbsh/ClassGenerator$Type;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;
    .locals 36

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move-object/from16 v12, p6

    .line 4
    .line 5
    move-object/from16 v13, p7

    .line 6
    .line 7
    invoke-virtual {v12}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 8
    .line 9
    .line 10
    move-result-object v14

    .line 11
    invoke-virtual {v14}, Lbsh/NameSpace;->getPackage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v15

    .line 15
    iget-boolean v1, v14, Lbsh/NameSpace;->isClass:Z

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v14}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, "$"

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-object/from16 v2, p0

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object/from16 v2, p0

    .line 47
    .line 48
    move-object v1, v2

    .line 49
    :goto_0
    if-nez v15, :cond_1

    .line 50
    .line 51
    move-object v2, v1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v3, "."

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    :goto_1
    invoke-virtual {v13}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    new-instance v4, Lbsh/NameSpace;

    .line 78
    .line 79
    invoke-direct {v4, v14, v1}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/4 v5, 0x1

    .line 83
    iput-boolean v5, v4, Lbsh/NameSpace;->isClass:Z

    .line 84
    .line 85
    invoke-virtual {v12, v4}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 86
    .line 87
    .line 88
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 89
    .line 90
    sget-object v7, Lbsh/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰:Lbsh/飘花落叶言子楪哲兰世苏;

    .line 91
    .line 92
    invoke-virtual {v0, v12, v13, v6, v7}, Lbsh/BSHBlock;->evalBlock(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/Boolean;Lbsh/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    new-instance v6, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    const/4 v8, 0x0

    .line 101
    :goto_2
    invoke-virtual {v0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    const/4 v10, 0x0

    .line 106
    if-ge v8, v9, :cond_4

    .line 107
    .line 108
    invoke-virtual {v0, v8}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    instance-of v11, v9, Lbsh/BSHEnumConstant;

    .line 113
    .line 114
    if-eqz v11, :cond_3

    .line 115
    .line 116
    check-cast v9, Lbsh/BSHEnumConstant;

    .line 117
    .line 118
    :try_start_0
    new-instance v11, Lbsh/Variable;

    .line 119
    .line 120
    invoke-virtual {v9}, Lbsh/BSHEnumConstant;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v9}, Lbsh/BSHEnumConstant;->getType()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    iget-object v9, v9, Lbsh/BSHEnumConstant;->mods:Lbsh/Modifiers;

    .line 129
    .line 130
    invoke-direct {v11, v5, v7, v10, v9}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    .line 136
    :catch_0
    :cond_2
    move-object/from16 v17, v1

    .line 137
    .line 138
    move-object/from16 v18, v2

    .line 139
    .line 140
    move-object/from16 v19, v3

    .line 141
    .line 142
    move-object/from16 v20, v4

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_3
    instance-of v5, v9, Lbsh/BSHTypedVariableDeclaration;

    .line 146
    .line 147
    if-eqz v5, :cond_2

    .line 148
    .line 149
    check-cast v9, Lbsh/BSHTypedVariableDeclaration;

    .line 150
    .line 151
    iget-object v5, v9, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 152
    .line 153
    invoke-virtual {v9}, Lbsh/BSHTypedVariableDeclaration;->getDeclarators()[Lbsh/BSHVariableDeclarator;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    array-length v11, v7

    .line 158
    const/4 v10, 0x0

    .line 159
    :goto_3
    if-ge v10, v11, :cond_2

    .line 160
    .line 161
    move-object/from16 v17, v1

    .line 162
    .line 163
    aget-object v1, v7, v10

    .line 164
    .line 165
    iget-object v1, v1, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 166
    .line 167
    move-object/from16 v18, v2

    .line 168
    .line 169
    :try_start_1
    invoke-virtual {v9, v12, v13}, Lbsh/BSHTypedVariableDeclaration;->evalType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v2
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lbsh/EvalError; {:try_start_1 .. :try_end_1} :catch_2

    .line 173
    move-object/from16 v19, v3

    .line 174
    .line 175
    :try_start_2
    new-instance v3, Lbsh/Variable;
    :try_end_2
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lbsh/EvalError; {:try_start_2 .. :try_end_2} :catch_1

    .line 176
    .line 177
    move-object/from16 v20, v4

    .line 178
    .line 179
    const/4 v4, 0x0

    .line 180
    :try_start_3
    invoke-direct {v3, v1, v2, v4, v5}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lbsh/UtilEvalError; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lbsh/EvalError; {:try_start_3 .. :try_end_3} :catch_3

    .line 184
    .line 185
    .line 186
    goto :goto_5

    .line 187
    :catch_1
    :goto_4
    move-object/from16 v20, v4

    .line 188
    .line 189
    const/4 v4, 0x0

    .line 190
    goto :goto_5

    .line 191
    :catch_2
    move-object/from16 v19, v3

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :catch_3
    :goto_5
    add-int/lit8 v10, v10, 0x1

    .line 195
    .line 196
    move-object/from16 v1, v17

    .line 197
    .line 198
    move-object/from16 v2, v18

    .line 199
    .line 200
    move-object/from16 v3, v19

    .line 201
    .line 202
    move-object/from16 v4, v20

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 206
    .line 207
    move-object/from16 v1, v17

    .line 208
    .line 209
    move-object/from16 v2, v18

    .line 210
    .line 211
    move-object/from16 v3, v19

    .line 212
    .line 213
    move-object/from16 v4, v20

    .line 214
    .line 215
    const/4 v5, 0x1

    .line 216
    goto :goto_2

    .line 217
    :cond_4
    move-object/from16 v17, v1

    .line 218
    .line 219
    move-object/from16 v18, v2

    .line 220
    .line 221
    move-object/from16 v19, v3

    .line 222
    .line 223
    move-object/from16 v20, v4

    .line 224
    .line 225
    move-object v4, v10

    .line 226
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    new-array v1, v1, [Lbsh/Variable;

    .line 231
    .line 232
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    move-object/from16 v16, v1

    .line 237
    .line 238
    check-cast v16, [Lbsh/Variable;

    .line 239
    .line 240
    new-instance v1, Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v2}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    const-string v3, "$anon"

    .line 254
    .line 255
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    const/4 v3, -0x1

    .line 260
    if-le v2, v3, :cond_5

    .line 261
    .line 262
    invoke-virtual {v12}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-virtual {v2}, Lbsh/NameSpace;->getName()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-static {v2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    sget-object v5, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子苏世兰哲/飘花落叶言子楪世苏哲兰;

    .line 275
    .line 276
    move-object/from16 v6, p3

    .line 277
    .line 278
    invoke-virtual {v5, v6}, L飘花落叶言楪子苏世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    check-cast v5, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 283
    .line 284
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    sget-object v8, Lbsh/This;->CONTEXT_ARGS:Ljava/lang/ThreadLocal;

    .line 289
    .line 290
    invoke-virtual {v8}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    check-cast v8, Ljava/util/Map;

    .line 295
    .line 296
    invoke-interface {v8, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    check-cast v8, [Ljava/lang/Object;

    .line 301
    .line 302
    invoke-static {v8}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    invoke-virtual {v5, v7, v8}, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    new-instance v7, Lbsh/DelayedEvalBshMethod;

    .line 311
    .line 312
    invoke-virtual {v12}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 313
    .line 314
    .line 315
    move-result-object v8

    .line 316
    invoke-direct {v7, v2, v5, v8}, Lbsh/DelayedEvalBshMethod;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世哲苏楪兰;Lbsh/NameSpace;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_5
    move-object/from16 v6, p3

    .line 324
    .line 325
    :goto_7
    const/4 v2, 0x0

    .line 326
    :goto_8
    invoke-virtual {v0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    if-ge v2, v5, :cond_8

    .line 331
    .line 332
    invoke-virtual {v0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    instance-of v7, v5, Lbsh/BSHMethodDeclaration;

    .line 337
    .line 338
    if-eqz v7, :cond_7

    .line 339
    .line 340
    check-cast v5, Lbsh/BSHMethodDeclaration;

    .line 341
    .line 342
    invoke-virtual {v5}, Lbsh/BSHMethodDeclaration;->insureNodesParsed()V

    .line 343
    .line 344
    .line 345
    iget-object v10, v5, Lbsh/BSHMethodDeclaration;->modifiers:Lbsh/Modifiers;

    .line 346
    .line 347
    move v7, v2

    .line 348
    iget-object v2, v5, Lbsh/BSHMethodDeclaration;->name:Ljava/lang/String;

    .line 349
    .line 350
    move v8, v3

    .line 351
    invoke-virtual {v5, v12, v13, v15}, Lbsh/BSHMethodDeclaration;->getReturnTypeDescriptor(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    move-object v9, v4

    .line 356
    invoke-virtual {v5}, Lbsh/BSHMethodDeclaration;->getReturnTypeNode()Lbsh/BSHReturnType;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    move v11, v7

    .line 361
    iget-object v7, v5, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 362
    .line 363
    invoke-virtual {v7, v12, v13, v15}, Lbsh/BSHFormalParameters;->getTypeDescriptors(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;)[Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    move-object/from16 v21, v1

    .line 368
    .line 369
    new-instance v1, Lbsh/DelayedEvalBshMethod;

    .line 370
    .line 371
    iget-object v8, v5, Lbsh/BSHMethodDeclaration;->paramsNode:Lbsh/BSHFormalParameters;

    .line 372
    .line 373
    invoke-virtual {v8}, Lbsh/BSHFormalParameters;->getParamNames()[Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v8

    .line 377
    move-object/from16 v23, v8

    .line 378
    .line 379
    iget-object v8, v5, Lbsh/BSHMethodDeclaration;->blockNode:Lbsh/BSHBlock;

    .line 380
    .line 381
    move-object/from16 v24, v9

    .line 382
    .line 383
    const/4 v9, 0x0

    .line 384
    move/from16 v25, v11

    .line 385
    .line 386
    iget-boolean v11, v5, Lbsh/BSHMethodDeclaration;->isVarArgs:Z

    .line 387
    .line 388
    move-object v0, v5

    .line 389
    move-object/from16 v26, v15

    .line 390
    .line 391
    move-object/from16 v28, v18

    .line 392
    .line 393
    move-object/from16 v29, v19

    .line 394
    .line 395
    move-object/from16 v15, v20

    .line 396
    .line 397
    move-object/from16 v5, v23

    .line 398
    .line 399
    const/16 p0, 0x1

    .line 400
    .line 401
    move-object/from16 v18, v14

    .line 402
    .line 403
    move-object/from16 v14, v21

    .line 404
    .line 405
    invoke-direct/range {v1 .. v13}, Lbsh/DelayedEvalBshMethod;-><init>(Ljava/lang/String;Ljava/lang/String;Lbsh/BSHReturnType;[Ljava/lang/String;[Ljava/lang/String;Lbsh/BSHFormalParameters;Lbsh/BSHBlock;Lbsh/NameSpace;Lbsh/Modifiers;ZLbsh/CallStack;Lbsh/Interpreter;)V

    .line 406
    .line 407
    .line 408
    iget-boolean v2, v0, Lbsh/BSHMethodDeclaration;->isExtension:Z

    .line 409
    .line 410
    iput-boolean v2, v1, Lbsh/BshMethod;->isExtension:Z

    .line 411
    .line 412
    if-eqz v2, :cond_6

    .line 413
    .line 414
    invoke-virtual {v0, v12, v13}, Lbsh/BSHMethodDeclaration;->evalReceiverType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    iput-object v0, v1, Lbsh/BshMethod;->receiverType:Ljava/lang/Class;

    .line 419
    .line 420
    :cond_6
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    goto :goto_9

    .line 424
    :cond_7
    move/from16 v25, v2

    .line 425
    .line 426
    move-object/from16 v26, v15

    .line 427
    .line 428
    move-object/from16 v28, v18

    .line 429
    .line 430
    move-object/from16 v29, v19

    .line 431
    .line 432
    move-object/from16 v15, v20

    .line 433
    .line 434
    const/16 p0, 0x1

    .line 435
    .line 436
    move-object/from16 v18, v14

    .line 437
    .line 438
    move-object v14, v1

    .line 439
    :goto_9
    add-int/lit8 v2, v25, 0x1

    .line 440
    .line 441
    move-object/from16 v6, p3

    .line 442
    .line 443
    move-object/from16 v0, p4

    .line 444
    .line 445
    move-object v1, v14

    .line 446
    move-object/from16 v20, v15

    .line 447
    .line 448
    move-object/from16 v14, v18

    .line 449
    .line 450
    move-object/from16 v15, v26

    .line 451
    .line 452
    move-object/from16 v18, v28

    .line 453
    .line 454
    move-object/from16 v19, v29

    .line 455
    .line 456
    const/4 v3, -0x1

    .line 457
    const/4 v4, 0x0

    .line 458
    goto/16 :goto_8

    .line 459
    .line 460
    :cond_8
    move-object/from16 v26, v15

    .line 461
    .line 462
    move-object/from16 v28, v18

    .line 463
    .line 464
    move-object/from16 v29, v19

    .line 465
    .line 466
    move-object/from16 v15, v20

    .line 467
    .line 468
    const/16 p0, 0x1

    .line 469
    .line 470
    move-object/from16 v18, v14

    .line 471
    .line 472
    move-object v14, v1

    .line 473
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    new-array v0, v0, [Lbsh/DelayedEvalBshMethod;

    .line 478
    .line 479
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    move-object v8, v0

    .line 484
    check-cast v8, [Lbsh/DelayedEvalBshMethod;

    .line 485
    .line 486
    invoke-virtual {v12}, Lbsh/CallStack;->pop()Lbsh/NameSpace;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v15, v13}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 490
    .line 491
    .line 492
    new-instance v1, Lbsh/飘花落叶言子楪兰苏哲世;

    .line 493
    .line 494
    move-object/from16 v2, p1

    .line 495
    .line 496
    move-object/from16 v6, p2

    .line 497
    .line 498
    move-object/from16 v5, p3

    .line 499
    .line 500
    move-object/from16 v10, p5

    .line 501
    .line 502
    move-object v9, v15

    .line 503
    move-object/from16 v7, v16

    .line 504
    .line 505
    move-object/from16 v3, v17

    .line 506
    .line 507
    move-object/from16 v4, v26

    .line 508
    .line 509
    invoke-direct/range {v1 .. v10}, Lbsh/飘花落叶言子楪兰苏哲世;-><init>(Lbsh/Modifiers;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;[Lbsh/Variable;[Lbsh/DelayedEvalBshMethod;Lbsh/NameSpace;Lbsh/ClassGenerator$Type;)V

    .line 510
    .line 511
    .line 512
    iget-object v0, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲世兰:[Lbsh/DelayedEvalBshMethod;

    .line 513
    .line 514
    const-string v2, ""

    .line 515
    .line 516
    :try_start_4
    new-instance v4, Ljava/lang/StringBuilder;

    .line 517
    .line 518
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    sget-object v5, Lbsh/This$Keys;->BSHCLASSMODIFIERS:Lbsh/This$Keys;

    .line 522
    .line 523
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v4

    .line 530
    move-object/from16 v5, p1

    .line 531
    .line 532
    const/4 v6, 0x0

    .line 533
    invoke-virtual {v9, v4, v5, v6}, Lbsh/NameSpace;->setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;

    .line 534
    .line 535
    .line 536
    new-instance v4, Ljava/lang/StringBuilder;

    .line 537
    .line 538
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    sget-object v6, Lbsh/This$Keys;->BSHCONSTRUCTORS:Lbsh/This$Keys;

    .line 542
    .line 543
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v4

    .line 550
    const/4 v6, 0x0

    .line 551
    invoke-virtual {v9, v4, v0, v6}, Lbsh/NameSpace;->setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;

    .line 552
    .line 553
    .line 554
    new-instance v4, Ljava/lang/StringBuilder;

    .line 555
    .line 556
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    sget-object v2, Lbsh/This$Keys;->BSHINIT:Lbsh/This$Keys;

    .line 560
    .line 561
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    move-object/from16 v4, p4

    .line 569
    .line 570
    const/4 v6, 0x0

    .line 571
    invoke-virtual {v9, v2, v4, v6}, Lbsh/NameSpace;->setLocalVariable(Ljava/lang/String;Ljava/lang/Object;Z)Lbsh/Variable;
    :try_end_4
    .catch Lbsh/UtilEvalError; {:try_start_4 .. :try_end_4} :catch_5

    .line 572
    .line 573
    .line 574
    move-object/from16 v2, v29

    .line 575
    .line 576
    iget-object v4, v2, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 577
    .line 578
    move-object/from16 v6, v28

    .line 579
    .line 580
    invoke-virtual {v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    check-cast v4, Ljava/lang/Class;

    .line 585
    .line 586
    const/16 v8, 0x2e

    .line 587
    .line 588
    if-nez v4, :cond_3e

    .line 589
    .line 590
    sget-object v4, Lbsh/This;->contextStore:Ljava/util/Map;

    .line 591
    .line 592
    iget-object v11, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 593
    .line 594
    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    check-cast v4, Lbsh/NameSpace;

    .line 599
    .line 600
    invoke-static {v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰(Lbsh/Modifiers;)I

    .line 601
    .line 602
    .line 603
    move-result v5

    .line 604
    sget-object v12, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 605
    .line 606
    if-ne v10, v12, :cond_a

    .line 607
    .line 608
    or-int/lit16 v5, v5, 0x601

    .line 609
    .line 610
    :cond_9
    :goto_a
    move/from16 v20, v5

    .line 611
    .line 612
    goto :goto_b

    .line 613
    :cond_a
    sget-object v12, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 614
    .line 615
    if-ne v10, v12, :cond_b

    .line 616
    .line 617
    or-int/lit16 v5, v5, 0x4031

    .line 618
    .line 619
    goto :goto_a

    .line 620
    :cond_b
    or-int/lit8 v5, v5, 0x21

    .line 621
    .line 622
    and-int/lit16 v12, v5, 0x400

    .line 623
    .line 624
    if-lez v12, :cond_9

    .line 625
    .line 626
    add-int/lit16 v5, v5, -0x400

    .line 627
    .line 628
    goto :goto_a

    .line 629
    :goto_b
    iget-object v5, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰:[Ljava/lang/Class;

    .line 630
    .line 631
    array-length v12, v5

    .line 632
    add-int/lit8 v12, v12, 0x1

    .line 633
    .line 634
    new-array v12, v12, [Ljava/lang/String;

    .line 635
    .line 636
    const/4 v14, 0x0

    .line 637
    :goto_c
    array-length v15, v5

    .line 638
    const/16 v7, 0x2f

    .line 639
    .line 640
    if-ge v14, v15, :cond_d

    .line 641
    .line 642
    aget-object v15, v5, v14

    .line 643
    .line 644
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v15

    .line 648
    invoke-virtual {v15, v8, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v7

    .line 652
    aput-object v7, v12, v14

    .line 653
    .line 654
    aget-object v7, v5, v14

    .line 655
    .line 656
    invoke-static {v7}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 657
    .line 658
    .line 659
    move-result v7

    .line 660
    if-eqz v7, :cond_c

    .line 661
    .line 662
    aget-object v7, v5, v14

    .line 663
    .line 664
    invoke-static {v7}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;)Lbsh/NameSpace;

    .line 665
    .line 666
    .line 667
    move-result-object v7

    .line 668
    invoke-static {v7}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰苏世哲(Lbsh/NameSpace;)[Lbsh/Variable;

    .line 669
    .line 670
    .line 671
    move-result-object v7

    .line 672
    array-length v15, v7

    .line 673
    const/4 v8, 0x0

    .line 674
    :goto_d
    if-ge v8, v15, :cond_c

    .line 675
    .line 676
    move-object/from16 p1, v7

    .line 677
    .line 678
    aget-object v7, p1, v8

    .line 679
    .line 680
    invoke-virtual {v4, v7}, Lbsh/NameSpace;->setVariableImpl(Lbsh/Variable;)V

    .line 681
    .line 682
    .line 683
    add-int/lit8 v8, v8, 0x1

    .line 684
    .line 685
    move-object/from16 v7, p1

    .line 686
    .line 687
    goto :goto_d

    .line 688
    :cond_c
    add-int/lit8 v14, v14, 0x1

    .line 689
    .line 690
    const/16 v8, 0x2e

    .line 691
    .line 692
    goto :goto_c

    .line 693
    :cond_d
    array-length v5, v5

    .line 694
    const-class v8, Lbsh/GeneratedClass;

    .line 695
    .line 696
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v8

    .line 700
    const/16 v14, 0x2e

    .line 701
    .line 702
    invoke-virtual {v8, v14, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v7

    .line 706
    aput-object v7, v12, v5

    .line 707
    .line 708
    new-instance v19, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;

    .line 709
    .line 710
    invoke-direct/range {v19 .. v19}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 711
    .line 712
    .line 713
    sget-object v5, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 714
    .line 715
    iget-object v7, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 716
    .line 717
    if-ne v10, v5, :cond_e

    .line 718
    .line 719
    const-string v5, "Ljava/lang/Enum<"

    .line 720
    .line 721
    const-string v8, ">;"

    .line 722
    .line 723
    invoke-static {v5, v7, v8}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v5

    .line 727
    move-object/from16 v22, v5

    .line 728
    .line 729
    goto :goto_e

    .line 730
    :cond_e
    const/16 v22, 0x0

    .line 731
    .line 732
    :goto_e
    iget-object v5, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 733
    .line 734
    iget-object v8, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 735
    .line 736
    move-object/from16 v21, v5

    .line 737
    .line 738
    move-object/from16 v23, v8

    .line 739
    .line 740
    move-object/from16 v24, v12

    .line 741
    .line 742
    invoke-virtual/range {v19 .. v24}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    move-object/from16 v5, v19

    .line 746
    .line 747
    sget-object v8, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 748
    .line 749
    const-string v12, "Lbsh/This;"

    .line 750
    .line 751
    if-eq v10, v8, :cond_f

    .line 752
    .line 753
    new-instance v8, Ljava/lang/StringBuilder;

    .line 754
    .line 755
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 756
    .line 757
    .line 758
    sget-object v14, Lbsh/This$Keys;->BSHTHIS:Lbsh/This$Keys;

    .line 759
    .line 760
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 764
    .line 765
    .line 766
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v8

    .line 770
    const/4 v14, 0x0

    .line 771
    move/from16 v15, p0

    .line 772
    .line 773
    invoke-static {v8, v12, v15, v14, v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;)V

    .line 774
    .line 775
    .line 776
    goto :goto_f

    .line 777
    :cond_f
    const/4 v14, 0x0

    .line 778
    :goto_f
    new-instance v8, Ljava/lang/StringBuilder;

    .line 779
    .line 780
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 781
    .line 782
    .line 783
    sget-object v15, Lbsh/This$Keys;->BSHSTATIC:Lbsh/This$Keys;

    .line 784
    .line 785
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v8

    .line 795
    const/16 v15, 0x19

    .line 796
    .line 797
    invoke-static {v8, v12, v15, v14, v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;)V

    .line 798
    .line 799
    .line 800
    const-string v8, "UUID"

    .line 801
    .line 802
    const-string v14, "Ljava/lang/String;"

    .line 803
    .line 804
    invoke-static {v8, v14, v15, v11, v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;)V

    .line 805
    .line 806
    .line 807
    iget-object v11, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲:[Lbsh/Variable;

    .line 808
    .line 809
    array-length v15, v11

    .line 810
    move-object/from16 v20, v9

    .line 811
    .line 812
    const/4 v13, 0x0

    .line 813
    :goto_10
    const-string v9, "enum"

    .line 814
    .line 815
    move-object/from16 v19, v2

    .line 816
    .line 817
    const-string v2, "private"

    .line 818
    .line 819
    if-ge v13, v15, :cond_13

    .line 820
    .line 821
    move/from16 v17, v13

    .line 822
    .line 823
    aget-object v13, v11, v17

    .line 824
    .line 825
    invoke-virtual {v13, v2}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 826
    .line 827
    .line 828
    move-result v2

    .line 829
    if-eqz v2, :cond_10

    .line 830
    .line 831
    move/from16 v21, v15

    .line 832
    .line 833
    goto :goto_12

    .line 834
    :cond_10
    invoke-virtual {v13}, Lbsh/Variable;->getTypeDescriptor()Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    invoke-virtual {v13}, Lbsh/Variable;->getModifiers()Lbsh/Modifiers;

    .line 839
    .line 840
    .line 841
    move-result-object v21

    .line 842
    move-object/from16 p4, v2

    .line 843
    .line 844
    invoke-static/range {v21 .. v21}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰(Lbsh/Modifiers;)I

    .line 845
    .line 846
    .line 847
    move-result v2

    .line 848
    move/from16 v21, v15

    .line 849
    .line 850
    sget-object v15, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 851
    .line 852
    if-ne v10, v15, :cond_11

    .line 853
    .line 854
    invoke-virtual {v13}, Lbsh/Variable;->setConstant()V

    .line 855
    .line 856
    .line 857
    invoke-virtual {v4, v13}, Lbsh/NameSpace;->setVariableImpl(Lbsh/Variable;)V

    .line 858
    .line 859
    .line 860
    goto :goto_12

    .line 861
    :cond_11
    sget-object v15, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 862
    .line 863
    if-ne v10, v15, :cond_12

    .line 864
    .line 865
    invoke-virtual {v13, v9}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 866
    .line 867
    .line 868
    move-result v9

    .line 869
    if-eqz v9, :cond_12

    .line 870
    .line 871
    or-int/lit16 v2, v2, 0x4010

    .line 872
    .line 873
    move v9, v2

    .line 874
    move-object v2, v7

    .line 875
    goto :goto_11

    .line 876
    :cond_12
    move v9, v2

    .line 877
    move-object/from16 v2, p4

    .line 878
    .line 879
    :goto_11
    invoke-virtual {v13}, Lbsh/Variable;->getName()Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v13

    .line 883
    const/4 v15, 0x0

    .line 884
    invoke-static {v13, v2, v9, v15, v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;)V

    .line 885
    .line 886
    .line 887
    :goto_12
    add-int/lit8 v13, v17, 0x1

    .line 888
    .line 889
    move-object/from16 v2, v19

    .line 890
    .line 891
    move/from16 v15, v21

    .line 892
    .line 893
    goto :goto_10

    .line 894
    :cond_13
    sget-object v4, Lbsh/ClassGenerator$Type;->ENUM:Lbsh/ClassGenerator$Type;

    .line 895
    .line 896
    const-string v15, "(Ljava/lang/String;I)V"

    .line 897
    .line 898
    const-string v13, "<init>"

    .line 899
    .line 900
    move-object/from16 v28, v6

    .line 901
    .line 902
    const-string v6, "bsh/This"

    .line 903
    .line 904
    move-object/from16 v22, v2

    .line 905
    .line 906
    iget-object v2, v1, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 907
    .line 908
    if-ne v10, v4, :cond_14

    .line 909
    .line 910
    move-object/from16 v25, v1

    .line 911
    .line 912
    new-instance v1, Ljava/lang/StringBuilder;

    .line 913
    .line 914
    move-object/from16 v26, v0

    .line 915
    .line 916
    const-string v0, "()["

    .line 917
    .line 918
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 919
    .line 920
    .line 921
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 922
    .line 923
    .line 924
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    const/16 v1, 0x9

    .line 929
    .line 930
    move-object/from16 v27, v9

    .line 931
    .line 932
    const-string v9, "values"

    .line 933
    .line 934
    invoke-virtual {v5, v1, v9, v0}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    invoke-static {v2, v3, v0}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/String;L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;)V

    .line 939
    .line 940
    .line 941
    const-string v9, "enumValues"

    .line 942
    .line 943
    const-string v1, "()[Ljava/lang/Object;"

    .line 944
    .line 945
    move-object/from16 v31, v11

    .line 946
    .line 947
    const/16 v11, 0xb6

    .line 948
    .line 949
    invoke-virtual {v0, v11, v6, v9, v1}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    new-instance v1, Ljava/lang/StringBuilder;

    .line 953
    .line 954
    const-string v9, "["

    .line 955
    .line 956
    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 960
    .line 961
    .line 962
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v1

    .line 966
    invoke-static {v1, v0}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {v0}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世()V

    .line 970
    .line 971
    .line 972
    new-instance v0, Ljava/lang/StringBuilder;

    .line 973
    .line 974
    const-string v1, "(Ljava/lang/String;)"

    .line 975
    .line 976
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 980
    .line 981
    .line 982
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v0

    .line 986
    const-string v1, "valueOf"

    .line 987
    .line 988
    const/16 v9, 0x9

    .line 989
    .line 990
    invoke-virtual {v5, v9, v1, v0}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;

    .line 991
    .line 992
    .line 993
    move-result-object v0

    .line 994
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 995
    .line 996
    .line 997
    move-result v9

    .line 998
    const/4 v11, 0x0

    .line 999
    invoke-static {v11, v9, v7}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)L飘花落叶言楪子世兰苏哲/飘花落叶言子楪苏世兰哲;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v9

    .line 1003
    invoke-virtual {v0, v9}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 1004
    .line 1005
    .line 1006
    const/16 v9, 0x19

    .line 1007
    .line 1008
    invoke-virtual {v0, v9, v11}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 1009
    .line 1010
    .line 1011
    const-string v9, "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;"

    .line 1012
    .line 1013
    const-string v11, "java/lang/Enum"

    .line 1014
    .line 1015
    move-object/from16 v29, v4

    .line 1016
    .line 1017
    const/16 v4, 0xb8

    .line 1018
    .line 1019
    invoke-virtual {v0, v4, v11, v1, v9}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    invoke-static {v7, v0}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;)V

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v0}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世()V

    .line 1026
    .line 1027
    .line 1028
    const/4 v0, 0x2

    .line 1029
    invoke-virtual {v5, v0, v13, v15}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v1

    .line 1033
    const/4 v4, 0x0

    .line 1034
    const/16 v9, 0x19

    .line 1035
    .line 1036
    invoke-virtual {v1, v9, v4}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 1037
    .line 1038
    .line 1039
    const/4 v4, 0x1

    .line 1040
    invoke-virtual {v1, v9, v4}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 1041
    .line 1042
    .line 1043
    const/16 v4, 0x15

    .line 1044
    .line 1045
    invoke-virtual {v1, v4, v0}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 1046
    .line 1047
    .line 1048
    const/16 v4, 0xb7

    .line 1049
    .line 1050
    invoke-virtual {v1, v4, v11, v13, v15}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1051
    .line 1052
    .line 1053
    const/4 v11, 0x0

    .line 1054
    invoke-virtual {v1, v9, v11}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v1, v3}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 1058
    .line 1059
    .line 1060
    new-array v4, v11, [Ljava/lang/String;

    .line 1061
    .line 1062
    invoke-static {v4, v11, v1}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲([Ljava/lang/String;ZL飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;)V

    .line 1063
    .line 1064
    .line 1065
    const-string v4, "initInstance"

    .line 1066
    .line 1067
    const-string v9, "(Lbsh/GeneratedClass;Ljava/lang/String;[Ljava/lang/Object;)V"

    .line 1068
    .line 1069
    const/16 v11, 0xb8

    .line 1070
    .line 1071
    invoke-virtual {v1, v11, v6, v4, v9}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1072
    .line 1073
    .line 1074
    const/16 v4, 0xb1

    .line 1075
    .line 1076
    invoke-virtual {v1, v4}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v1}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世()V

    .line 1080
    .line 1081
    .line 1082
    goto :goto_13

    .line 1083
    :cond_14
    move-object/from16 v26, v0

    .line 1084
    .line 1085
    move-object/from16 v25, v1

    .line 1086
    .line 1087
    move-object/from16 v29, v4

    .line 1088
    .line 1089
    move-object/from16 v27, v9

    .line 1090
    .line 1091
    move-object/from16 v31, v11

    .line 1092
    .line 1093
    const/4 v0, 0x2

    .line 1094
    :goto_13
    const-string v1, "<clinit>"

    .line 1095
    .line 1096
    const-string v4, "()V"

    .line 1097
    .line 1098
    const/16 v9, 0x8

    .line 1099
    .line 1100
    invoke-virtual {v5, v9, v1, v4}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    const/16 v4, 0xb2

    .line 1105
    .line 1106
    invoke-virtual {v1, v4, v2, v8, v14}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1107
    .line 1108
    .line 1109
    const-string v4, "pullBshStatic"

    .line 1110
    .line 1111
    const-string v8, "(Ljava/lang/String;)Lbsh/This;"

    .line 1112
    .line 1113
    const/16 v11, 0xb8

    .line 1114
    .line 1115
    invoke-virtual {v1, v11, v6, v4, v8}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1116
    .line 1117
    .line 1118
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1119
    .line 1120
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1121
    .line 1122
    .line 1123
    sget-object v8, Lbsh/This$Keys;->BSHSTATIC:Lbsh/This$Keys;

    .line 1124
    .line 1125
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v4

    .line 1135
    const/16 v8, 0xb3

    .line 1136
    .line 1137
    invoke-virtual {v1, v8, v2, v4, v12}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1138
    .line 1139
    .line 1140
    move-object/from16 v4, v29

    .line 1141
    .line 1142
    if-ne v10, v4, :cond_17

    .line 1143
    .line 1144
    move-object/from16 v4, v31

    .line 1145
    .line 1146
    array-length v11, v4

    .line 1147
    const/4 v0, 0x3

    .line 1148
    const/4 v14, 0x0

    .line 1149
    :goto_14
    if-ge v14, v11, :cond_17

    .line 1150
    .line 1151
    aget-object v8, v4, v14

    .line 1152
    .line 1153
    move-object/from16 v9, v27

    .line 1154
    .line 1155
    invoke-virtual {v8, v9}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 1156
    .line 1157
    .line 1158
    move-result v27

    .line 1159
    if-eqz v27, :cond_16

    .line 1160
    .line 1161
    move-object/from16 v27, v4

    .line 1162
    .line 1163
    const/16 v4, 0xbb

    .line 1164
    .line 1165
    invoke-virtual {v1, v4, v2}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(ILjava/lang/String;)V

    .line 1166
    .line 1167
    .line 1168
    const/16 v4, 0x59

    .line 1169
    .line 1170
    invoke-virtual {v1, v4}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {v8}, Lbsh/Variable;->getName()Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v4

    .line 1177
    invoke-virtual {v1, v4}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 1178
    .line 1179
    .line 1180
    const/16 v4, 0x8

    .line 1181
    .line 1182
    if-lt v4, v0, :cond_15

    .line 1183
    .line 1184
    add-int/lit8 v31, v0, 0x1

    .line 1185
    .line 1186
    invoke-virtual {v1, v0}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 1187
    .line 1188
    .line 1189
    :goto_15
    move/from16 v0, v31

    .line 1190
    .line 1191
    const/16 v4, 0xb7

    .line 1192
    .line 1193
    goto :goto_16

    .line 1194
    :cond_15
    add-int/lit8 v31, v0, 0x1

    .line 1195
    .line 1196
    add-int/lit8 v0, v0, -0x3

    .line 1197
    .line 1198
    const/16 v4, 0x10

    .line 1199
    .line 1200
    invoke-virtual {v1, v4, v0}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(II)V

    .line 1201
    .line 1202
    .line 1203
    goto :goto_15

    .line 1204
    :goto_16
    invoke-virtual {v1, v4, v2, v13, v15}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual {v8}, Lbsh/Variable;->getName()Ljava/lang/String;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v4

    .line 1211
    const/16 v8, 0xb3

    .line 1212
    .line 1213
    invoke-virtual {v1, v8, v2, v4, v7}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1214
    .line 1215
    .line 1216
    goto :goto_17

    .line 1217
    :cond_16
    move-object/from16 v27, v4

    .line 1218
    .line 1219
    const/16 v8, 0xb3

    .line 1220
    .line 1221
    :goto_17
    add-int/lit8 v14, v14, 0x1

    .line 1222
    .line 1223
    move-object/from16 v4, v27

    .line 1224
    .line 1225
    move-object/from16 v27, v9

    .line 1226
    .line 1227
    const/16 v9, 0x8

    .line 1228
    .line 1229
    goto :goto_14

    .line 1230
    :cond_17
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1231
    .line 1232
    .line 1233
    move-result v0

    .line 1234
    const/4 v11, 0x0

    .line 1235
    invoke-static {v11, v0, v7}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)L飘花落叶言楪子世兰苏哲/飘花落叶言子楪苏世兰哲;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v0

    .line 1239
    invoke-virtual {v1, v0}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 1240
    .line 1241
    .line 1242
    const-string v0, "initStatic"

    .line 1243
    .line 1244
    const-string v4, "(Ljava/lang/Class;)V"

    .line 1245
    .line 1246
    const/16 v11, 0xb8

    .line 1247
    .line 1248
    invoke-virtual {v1, v11, v6, v0, v4}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1249
    .line 1250
    .line 1251
    const/16 v4, 0xb1

    .line 1252
    .line 1253
    invoke-virtual {v1, v4}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v1}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世()V

    .line 1257
    .line 1258
    .line 1259
    move-object/from16 v1, v26

    .line 1260
    .line 1261
    const/4 v0, 0x0

    .line 1262
    const/4 v7, 0x0

    .line 1263
    :goto_18
    array-length v4, v1

    .line 1264
    if-ge v7, v4, :cond_1a

    .line 1265
    .line 1266
    aget-object v4, v1, v7

    .line 1267
    .line 1268
    move-object/from16 v8, v22

    .line 1269
    .line 1270
    invoke-virtual {v4, v8}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 1271
    .line 1272
    .line 1273
    move-result v4

    .line 1274
    if-eqz v4, :cond_18

    .line 1275
    .line 1276
    move-object/from16 v9, v25

    .line 1277
    .line 1278
    goto :goto_19

    .line 1279
    :cond_18
    aget-object v0, v1, v7

    .line 1280
    .line 1281
    invoke-virtual {v0}, Lbsh/BshMethod;->getModifiers()Lbsh/Modifiers;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    invoke-static {v0}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰(Lbsh/Modifiers;)I

    .line 1286
    .line 1287
    .line 1288
    move-result v0

    .line 1289
    aget-object v4, v1, v7

    .line 1290
    .line 1291
    invoke-virtual {v4}, Lbsh/BshMethod;->isVarArgs()Z

    .line 1292
    .line 1293
    .line 1294
    move-result v4

    .line 1295
    if-eqz v4, :cond_19

    .line 1296
    .line 1297
    or-int/lit16 v0, v0, 0x80

    .line 1298
    .line 1299
    :cond_19
    aget-object v4, v1, v7

    .line 1300
    .line 1301
    invoke-virtual {v4}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v4

    .line 1305
    move-object/from16 v9, v25

    .line 1306
    .line 1307
    invoke-virtual {v9, v7, v4, v0, v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰(I[Ljava/lang/String;IL飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;)V

    .line 1308
    .line 1309
    .line 1310
    const/4 v0, 0x1

    .line 1311
    :goto_19
    add-int/lit8 v7, v7, 0x1

    .line 1312
    .line 1313
    move-object/from16 v22, v8

    .line 1314
    .line 1315
    move-object/from16 v25, v9

    .line 1316
    .line 1317
    goto :goto_18

    .line 1318
    :cond_1a
    move-object/from16 v8, v22

    .line 1319
    .line 1320
    move-object/from16 v9, v25

    .line 1321
    .line 1322
    sget-object v1, Lbsh/ClassGenerator$Type;->CLASS:Lbsh/ClassGenerator$Type;

    .line 1323
    .line 1324
    if-ne v10, v1, :cond_1b

    .line 1325
    .line 1326
    if-nez v0, :cond_1b

    .line 1327
    .line 1328
    const/4 v11, 0x0

    .line 1329
    new-array v0, v11, [Ljava/lang/String;

    .line 1330
    .line 1331
    const/4 v1, -0x1

    .line 1332
    const/4 v15, 0x1

    .line 1333
    invoke-virtual {v9, v1, v0, v15, v5}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰(I[Ljava/lang/String;IL飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;)V

    .line 1334
    .line 1335
    .line 1336
    :cond_1b
    iget-object v0, v9, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲兰世:[Lbsh/DelayedEvalBshMethod;

    .line 1337
    .line 1338
    array-length v1, v0

    .line 1339
    const/4 v7, 0x0

    .line 1340
    :goto_1a
    if-ge v7, v1, :cond_3c

    .line 1341
    .line 1342
    aget-object v4, v0, v7

    .line 1343
    .line 1344
    iget-boolean v11, v4, Lbsh/BshMethod;->isExtension:Z

    .line 1345
    .line 1346
    if-eqz v11, :cond_1c

    .line 1347
    .line 1348
    :goto_1b
    move-object/from16 v21, v0

    .line 1349
    .line 1350
    move/from16 v25, v1

    .line 1351
    .line 1352
    move-object/from16 v26, v2

    .line 1353
    .line 1354
    move-object/from16 v30, v5

    .line 1355
    .line 1356
    move/from16 v22, v7

    .line 1357
    .line 1358
    move-object/from16 v29, v8

    .line 1359
    .line 1360
    const/16 v4, 0x19

    .line 1361
    .line 1362
    const/4 v5, 0x1

    .line 1363
    const/16 v8, 0xb7

    .line 1364
    .line 1365
    const/16 v17, 0xb6

    .line 1366
    .line 1367
    goto/16 :goto_30

    .line 1368
    .line 1369
    :cond_1c
    invoke-virtual {v4, v8}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 1370
    .line 1371
    .line 1372
    move-result v11

    .line 1373
    if-eqz v11, :cond_1d

    .line 1374
    .line 1375
    goto :goto_1b

    .line 1376
    :cond_1d
    sget-object v11, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 1377
    .line 1378
    if-ne v10, v11, :cond_1e

    .line 1379
    .line 1380
    const-string v13, "static"

    .line 1381
    .line 1382
    invoke-virtual {v4, v13}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 1383
    .line 1384
    .line 1385
    move-result v13

    .line 1386
    if-nez v13, :cond_1e

    .line 1387
    .line 1388
    const-string v13, "default"

    .line 1389
    .line 1390
    invoke-virtual {v4, v13}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 1391
    .line 1392
    .line 1393
    move-result v13

    .line 1394
    if-nez v13, :cond_1e

    .line 1395
    .line 1396
    const-string v13, "abstract"

    .line 1397
    .line 1398
    invoke-virtual {v4, v13}, Lbsh/BshMethod;->hasModifier(Ljava/lang/String;)Z

    .line 1399
    .line 1400
    .line 1401
    move-result v14

    .line 1402
    if-nez v14, :cond_1e

    .line 1403
    .line 1404
    invoke-virtual {v4}, Lbsh/BshMethod;->getModifiers()Lbsh/Modifiers;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v14

    .line 1408
    invoke-virtual {v14, v13}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 1409
    .line 1410
    .line 1411
    :cond_1e
    invoke-virtual {v4}, Lbsh/BshMethod;->getModifiers()Lbsh/Modifiers;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v13

    .line 1415
    invoke-static {v13}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰(Lbsh/Modifiers;)I

    .line 1416
    .line 1417
    .line 1418
    move-result v13

    .line 1419
    invoke-virtual {v4}, Lbsh/BshMethod;->isVarArgs()Z

    .line 1420
    .line 1421
    .line 1422
    move-result v14

    .line 1423
    if-eqz v14, :cond_1f

    .line 1424
    .line 1425
    or-int/lit16 v13, v13, 0x80

    .line 1426
    .line 1427
    :cond_1f
    and-int/lit8 v14, v13, 0x8

    .line 1428
    .line 1429
    if-lez v14, :cond_20

    .line 1430
    .line 1431
    const/4 v15, 0x1

    .line 1432
    :goto_1c
    move-object/from16 v21, v0

    .line 1433
    .line 1434
    goto :goto_1d

    .line 1435
    :cond_20
    const/4 v15, 0x0

    .line 1436
    goto :goto_1c

    .line 1437
    :goto_1d
    invoke-virtual {v4}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v0

    .line 1441
    invoke-virtual {v4}, Lbsh/DelayedEvalBshMethod;->getReturnTypeDescriptor()Ljava/lang/String;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v22

    .line 1445
    move/from16 v25, v1

    .line 1446
    .line 1447
    invoke-virtual {v4}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v1

    .line 1451
    if-eqz v14, :cond_21

    .line 1452
    .line 1453
    const/4 v14, 0x1

    .line 1454
    goto :goto_1e

    .line 1455
    :cond_21
    const/4 v14, 0x0

    .line 1456
    :goto_1e
    const-string v26, "Ljava/lang/Object;"

    .line 1457
    .line 1458
    move-object/from16 v27, v4

    .line 1459
    .line 1460
    if-nez v22, :cond_22

    .line 1461
    .line 1462
    move-object/from16 v4, v26

    .line 1463
    .line 1464
    :goto_1f
    move/from16 v22, v7

    .line 1465
    .line 1466
    goto :goto_20

    .line 1467
    :cond_22
    move-object/from16 v4, v22

    .line 1468
    .line 1469
    goto :goto_1f

    .line 1470
    :goto_20
    invoke-static {v4, v1}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v7

    .line 1474
    invoke-virtual {v5, v13, v0, v7}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v7

    .line 1478
    and-int/lit16 v13, v13, 0x400

    .line 1479
    .line 1480
    move-object/from16 v29, v8

    .line 1481
    .line 1482
    const-string v8, "D"

    .line 1483
    .line 1484
    move/from16 v30, v13

    .line 1485
    .line 1486
    const-string v13, "J"

    .line 1487
    .line 1488
    if-eqz v30, :cond_23

    .line 1489
    .line 1490
    const/16 v0, 0xb1

    .line 1491
    .line 1492
    const/16 v17, 0xb6

    .line 1493
    .line 1494
    goto/16 :goto_25

    .line 1495
    .line 1496
    :cond_23
    if-nez v14, :cond_25

    .line 1497
    .line 1498
    if-ne v10, v11, :cond_24

    .line 1499
    .line 1500
    goto :goto_21

    .line 1501
    :cond_24
    const/16 v10, 0x19

    .line 1502
    .line 1503
    const/4 v11, 0x0

    .line 1504
    invoke-virtual {v7, v10, v11}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 1505
    .line 1506
    .line 1507
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1508
    .line 1509
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1510
    .line 1511
    .line 1512
    sget-object v11, Lbsh/This$Keys;->BSHTHIS:Lbsh/This$Keys;

    .line 1513
    .line 1514
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1515
    .line 1516
    .line 1517
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1518
    .line 1519
    .line 1520
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v10

    .line 1524
    const/16 v11, 0xb4

    .line 1525
    .line 1526
    invoke-virtual {v7, v11, v2, v10, v12}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1527
    .line 1528
    .line 1529
    goto :goto_22

    .line 1530
    :cond_25
    :goto_21
    invoke-static {v2, v3, v7}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/String;L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;)V

    .line 1531
    .line 1532
    .line 1533
    :goto_22
    invoke-virtual {v7, v0}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 1534
    .line 1535
    .line 1536
    invoke-static {v1, v14, v7}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲([Ljava/lang/String;ZL飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;)V

    .line 1537
    .line 1538
    .line 1539
    const/4 v0, 0x4

    .line 1540
    invoke-virtual {v7, v0}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 1541
    .line 1542
    .line 1543
    const-string v0, "invokeMethod"

    .line 1544
    .line 1545
    const-string v1, "(Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/Object;"

    .line 1546
    .line 1547
    const/16 v11, 0xb6

    .line 1548
    .line 1549
    invoke-virtual {v7, v11, v6, v0, v1}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1550
    .line 1551
    .line 1552
    const-string v0, "V"

    .line 1553
    .line 1554
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1555
    .line 1556
    .line 1557
    move-result v0

    .line 1558
    if-eqz v0, :cond_26

    .line 1559
    .line 1560
    const/16 v0, 0x57

    .line 1561
    .line 1562
    invoke-virtual {v7, v0}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 1563
    .line 1564
    .line 1565
    const/16 v0, 0xb1

    .line 1566
    .line 1567
    invoke-virtual {v7, v0}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 1568
    .line 1569
    .line 1570
    const/16 v17, 0xb6

    .line 1571
    .line 1572
    goto/16 :goto_24

    .line 1573
    .line 1574
    :cond_26
    const/16 v0, 0xb1

    .line 1575
    .line 1576
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1577
    .line 1578
    .line 1579
    move-result v1

    .line 1580
    const/16 v10, 0xc0

    .line 1581
    .line 1582
    const/4 v11, 0x1

    .line 1583
    if-ne v1, v11, :cond_2e

    .line 1584
    .line 1585
    const-string v1, "Z"

    .line 1586
    .line 1587
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1588
    .line 1589
    .line 1590
    move-result v1

    .line 1591
    const/16 v11, 0xac

    .line 1592
    .line 1593
    if-eqz v1, :cond_27

    .line 1594
    .line 1595
    const-string v1, "java/lang/Boolean"

    .line 1596
    .line 1597
    const-string v14, "booleanValue"

    .line 1598
    .line 1599
    goto :goto_23

    .line 1600
    :cond_27
    const-string v1, "C"

    .line 1601
    .line 1602
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1603
    .line 1604
    .line 1605
    move-result v1

    .line 1606
    if-eqz v1, :cond_28

    .line 1607
    .line 1608
    const-string v1, "java/lang/Character"

    .line 1609
    .line 1610
    const-string v14, "charValue"

    .line 1611
    .line 1612
    goto :goto_23

    .line 1613
    :cond_28
    const-string v1, "B"

    .line 1614
    .line 1615
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1616
    .line 1617
    .line 1618
    move-result v1

    .line 1619
    if-eqz v1, :cond_29

    .line 1620
    .line 1621
    const-string v1, "java/lang/Byte"

    .line 1622
    .line 1623
    const-string v14, "byteValue"

    .line 1624
    .line 1625
    goto :goto_23

    .line 1626
    :cond_29
    const-string v1, "S"

    .line 1627
    .line 1628
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1629
    .line 1630
    .line 1631
    move-result v1

    .line 1632
    if-eqz v1, :cond_2a

    .line 1633
    .line 1634
    const-string v1, "java/lang/Short"

    .line 1635
    .line 1636
    const-string v14, "shortValue"

    .line 1637
    .line 1638
    goto :goto_23

    .line 1639
    :cond_2a
    const-string v1, "F"

    .line 1640
    .line 1641
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1642
    .line 1643
    .line 1644
    move-result v1

    .line 1645
    if-eqz v1, :cond_2b

    .line 1646
    .line 1647
    const/16 v11, 0xae

    .line 1648
    .line 1649
    const-string v1, "java/lang/Float"

    .line 1650
    .line 1651
    const-string v14, "floatValue"

    .line 1652
    .line 1653
    goto :goto_23

    .line 1654
    :cond_2b
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1655
    .line 1656
    .line 1657
    move-result v1

    .line 1658
    if-eqz v1, :cond_2c

    .line 1659
    .line 1660
    const/16 v11, 0xad

    .line 1661
    .line 1662
    const-string v1, "java/lang/Long"

    .line 1663
    .line 1664
    const-string v14, "longValue"

    .line 1665
    .line 1666
    goto :goto_23

    .line 1667
    :cond_2c
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1668
    .line 1669
    .line 1670
    move-result v1

    .line 1671
    if-eqz v1, :cond_2d

    .line 1672
    .line 1673
    const/16 v11, 0xaf

    .line 1674
    .line 1675
    const-string v1, "java/lang/Double"

    .line 1676
    .line 1677
    const-string v14, "doubleValue"

    .line 1678
    .line 1679
    goto :goto_23

    .line 1680
    :cond_2d
    const-string v1, "java/lang/Integer"

    .line 1681
    .line 1682
    const-string v14, "intValue"

    .line 1683
    .line 1684
    :goto_23
    invoke-virtual {v7, v10, v1}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(ILjava/lang/String;)V

    .line 1685
    .line 1686
    .line 1687
    const-string v10, "()"

    .line 1688
    .line 1689
    invoke-virtual {v10, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v4

    .line 1693
    const/16 v10, 0xb6

    .line 1694
    .line 1695
    invoke-virtual {v7, v10, v1, v14, v4}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1696
    .line 1697
    .line 1698
    invoke-virtual {v7, v11}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 1699
    .line 1700
    .line 1701
    move/from16 v17, v10

    .line 1702
    .line 1703
    goto :goto_24

    .line 1704
    :cond_2e
    const/16 v17, 0xb6

    .line 1705
    .line 1706
    invoke-static {v4}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v1

    .line 1710
    invoke-virtual {v7, v10, v1}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏(ILjava/lang/String;)V

    .line 1711
    .line 1712
    .line 1713
    const/16 v1, 0xb0

    .line 1714
    .line 1715
    invoke-virtual {v7, v1}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)V

    .line 1716
    .line 1717
    .line 1718
    :goto_24
    invoke-virtual {v7}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世()V

    .line 1719
    .line 1720
    .line 1721
    :goto_25
    invoke-virtual/range {v27 .. v27}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v1

    .line 1725
    invoke-virtual/range {v27 .. v27}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v4

    .line 1729
    iget-object v7, v9, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    .line 1730
    .line 1731
    move-object v10, v7

    .line 1732
    :goto_26
    if-eqz v10, :cond_35

    .line 1733
    .line 1734
    invoke-virtual {v10}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v11

    .line 1738
    array-length v14, v11

    .line 1739
    const/4 v0, 0x0

    .line 1740
    :goto_27
    if-ge v0, v14, :cond_34

    .line 1741
    .line 1742
    aget-object v30, v11, v0

    .line 1743
    .line 1744
    move/from16 v31, v0

    .line 1745
    .line 1746
    invoke-virtual/range {v30 .. v30}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v0

    .line 1750
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1751
    .line 1752
    .line 1753
    move-result v0

    .line 1754
    if-eqz v0, :cond_32

    .line 1755
    .line 1756
    array-length v0, v4

    .line 1757
    move-object/from16 v32, v1

    .line 1758
    .line 1759
    invoke-virtual/range {v30 .. v30}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 1760
    .line 1761
    .line 1762
    move-result v1

    .line 1763
    if-ne v0, v1, :cond_33

    .line 1764
    .line 1765
    invoke-virtual/range {v30 .. v30}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v0

    .line 1769
    array-length v1, v0

    .line 1770
    move-object/from16 v33, v0

    .line 1771
    .line 1772
    new-array v0, v1, [Ljava/lang/String;

    .line 1773
    .line 1774
    move-object/from16 v34, v0

    .line 1775
    .line 1776
    const/4 v0, 0x0

    .line 1777
    :goto_28
    if-ge v0, v1, :cond_2f

    .line 1778
    .line 1779
    aget-object v35, v33, v0

    .line 1780
    .line 1781
    invoke-static/range {v35 .. v35}, Lbsh/BSHType;->getTypeDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v35

    .line 1785
    aput-object v35, v34, v0

    .line 1786
    .line 1787
    add-int/lit8 v0, v0, 0x1

    .line 1788
    .line 1789
    goto :goto_28

    .line 1790
    :cond_2f
    const/4 v1, 0x0

    .line 1791
    const/16 v33, 0x1

    .line 1792
    .line 1793
    :goto_29
    array-length v0, v4

    .line 1794
    if-ge v1, v0, :cond_30

    .line 1795
    .line 1796
    aget-object v0, v4, v1

    .line 1797
    .line 1798
    move/from16 v35, v1

    .line 1799
    .line 1800
    aget-object v1, v34, v35

    .line 1801
    .line 1802
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1803
    .line 1804
    .line 1805
    move-result v33

    .line 1806
    if-nez v33, :cond_31

    .line 1807
    .line 1808
    :cond_30
    move/from16 v0, v33

    .line 1809
    .line 1810
    goto :goto_2a

    .line 1811
    :cond_31
    add-int/lit8 v1, v35, 0x1

    .line 1812
    .line 1813
    goto :goto_29

    .line 1814
    :goto_2a
    if-eqz v0, :cond_33

    .line 1815
    .line 1816
    move-object/from16 v10, v30

    .line 1817
    .line 1818
    goto :goto_2b

    .line 1819
    :cond_32
    move-object/from16 v32, v1

    .line 1820
    .line 1821
    :cond_33
    add-int/lit8 v0, v31, 0x1

    .line 1822
    .line 1823
    move-object/from16 v1, v32

    .line 1824
    .line 1825
    goto :goto_27

    .line 1826
    :cond_34
    move-object/from16 v32, v1

    .line 1827
    .line 1828
    invoke-virtual {v10}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v10

    .line 1832
    const/16 v0, 0xb1

    .line 1833
    .line 1834
    goto :goto_26

    .line 1835
    :cond_35
    const/4 v10, 0x0

    .line 1836
    :goto_2b
    if-eqz v10, :cond_3b

    .line 1837
    .line 1838
    if-nez v15, :cond_3b

    .line 1839
    .line 1840
    invoke-virtual/range {v27 .. v27}, Lbsh/BshMethod;->getName()Ljava/lang/String;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v0

    .line 1844
    invoke-virtual/range {v27 .. v27}, Lbsh/DelayedEvalBshMethod;->getReturnTypeDescriptor()Ljava/lang/String;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v1

    .line 1848
    invoke-virtual/range {v27 .. v27}, Lbsh/DelayedEvalBshMethod;->getParamTypeDescriptors()[Ljava/lang/String;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v4

    .line 1852
    if-nez v1, :cond_36

    .line 1853
    .line 1854
    move-object/from16 v1, v26

    .line 1855
    .line 1856
    :cond_36
    invoke-static {v1, v4}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v10

    .line 1860
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1861
    .line 1862
    const-string v14, "_bshSuper"

    .line 1863
    .line 1864
    invoke-direct {v11, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1865
    .line 1866
    .line 1867
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v7

    .line 1871
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1872
    .line 1873
    .line 1874
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1875
    .line 1876
    .line 1877
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v7

    .line 1881
    const/4 v15, 0x1

    .line 1882
    invoke-virtual {v5, v15, v7, v10}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;Ljava/lang/String;)L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v7

    .line 1886
    const/4 v11, 0x0

    .line 1887
    const/16 v14, 0x19

    .line 1888
    .line 1889
    invoke-virtual {v7, v14, v11}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 1890
    .line 1891
    .line 1892
    array-length v11, v4

    .line 1893
    move v14, v15

    .line 1894
    const/4 v15, 0x0

    .line 1895
    :goto_2c
    if-ge v15, v11, :cond_3a

    .line 1896
    .line 1897
    move-object/from16 v26, v2

    .line 1898
    .line 1899
    aget-object v2, v4, v15

    .line 1900
    .line 1901
    move-object/from16 v27, v4

    .line 1902
    .line 1903
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1904
    .line 1905
    .line 1906
    move-result v4

    .line 1907
    move-object/from16 v30, v5

    .line 1908
    .line 1909
    const/4 v5, 0x1

    .line 1910
    if-ne v4, v5, :cond_37

    .line 1911
    .line 1912
    const/16 v4, 0x15

    .line 1913
    .line 1914
    invoke-virtual {v7, v4, v14}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 1915
    .line 1916
    .line 1917
    const/16 v4, 0x19

    .line 1918
    .line 1919
    goto :goto_2d

    .line 1920
    :cond_37
    const/16 v4, 0x19

    .line 1921
    .line 1922
    invoke-virtual {v7, v4, v14}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(II)V

    .line 1923
    .line 1924
    .line 1925
    :goto_2d
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1926
    .line 1927
    .line 1928
    move-result v31

    .line 1929
    if-nez v31, :cond_39

    .line 1930
    .line 1931
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1932
    .line 1933
    .line 1934
    move-result v2

    .line 1935
    if-eqz v2, :cond_38

    .line 1936
    .line 1937
    goto :goto_2e

    .line 1938
    :cond_38
    move v2, v5

    .line 1939
    goto :goto_2f

    .line 1940
    :cond_39
    :goto_2e
    const/4 v2, 0x2

    .line 1941
    :goto_2f
    add-int/2addr v14, v2

    .line 1942
    add-int/lit8 v15, v15, 0x1

    .line 1943
    .line 1944
    move-object/from16 v2, v26

    .line 1945
    .line 1946
    move-object/from16 v4, v27

    .line 1947
    .line 1948
    move-object/from16 v5, v30

    .line 1949
    .line 1950
    goto :goto_2c

    .line 1951
    :cond_3a
    move-object/from16 v26, v2

    .line 1952
    .line 1953
    move-object/from16 v30, v5

    .line 1954
    .line 1955
    const/16 v4, 0x19

    .line 1956
    .line 1957
    const/4 v5, 0x1

    .line 1958
    iget-object v2, v9, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 1959
    .line 1960
    const/16 v8, 0xb7

    .line 1961
    .line 1962
    invoke-virtual {v7, v8, v2, v0, v10}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1963
    .line 1964
    .line 1965
    invoke-static {v1, v7}, Lbsh/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;)V

    .line 1966
    .line 1967
    .line 1968
    invoke-virtual {v7}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世()V

    .line 1969
    .line 1970
    .line 1971
    goto :goto_30

    .line 1972
    :cond_3b
    move-object/from16 v26, v2

    .line 1973
    .line 1974
    move-object/from16 v30, v5

    .line 1975
    .line 1976
    const/16 v4, 0x19

    .line 1977
    .line 1978
    const/4 v5, 0x1

    .line 1979
    const/16 v8, 0xb7

    .line 1980
    .line 1981
    :goto_30
    add-int/lit8 v7, v22, 0x1

    .line 1982
    .line 1983
    move-object/from16 v10, p5

    .line 1984
    .line 1985
    move-object/from16 v0, v21

    .line 1986
    .line 1987
    move/from16 v1, v25

    .line 1988
    .line 1989
    move-object/from16 v2, v26

    .line 1990
    .line 1991
    move-object/from16 v8, v29

    .line 1992
    .line 1993
    move-object/from16 v5, v30

    .line 1994
    .line 1995
    goto/16 :goto_1a

    .line 1996
    .line 1997
    :cond_3c
    move-object/from16 v30, v5

    .line 1998
    .line 1999
    invoke-virtual/range {v30 .. v30}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()[B

    .line 2000
    .line 2001
    .line 2002
    move-result-object v1

    .line 2003
    invoke-static {}, Lbsh/Interpreter;->getSaveClasses()Z

    .line 2004
    .line 2005
    .line 2006
    move-result v0

    .line 2007
    if-eqz v0, :cond_3d

    .line 2008
    .line 2009
    invoke-static {}, Lbsh/Interpreter;->getSaveClassesDir()Ljava/lang/String;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v0

    .line 2013
    if-eqz v0, :cond_3d

    .line 2014
    .line 2015
    :try_start_5
    new-instance v2, Ljava/io/FileOutputStream;

    .line 2016
    .line 2017
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2018
    .line 2019
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 2020
    .line 2021
    .line 2022
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2023
    .line 2024
    .line 2025
    const-string v0, "/"

    .line 2026
    .line 2027
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2028
    .line 2029
    .line 2030
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2031
    .line 2032
    .line 2033
    const-string v0, ".class"

    .line 2034
    .line 2035
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2036
    .line 2037
    .line 2038
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2039
    .line 2040
    .line 2041
    move-result-object v0

    .line 2042
    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 2043
    .line 2044
    .line 2045
    :try_start_6
    invoke-virtual {v2, v1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 2046
    .line 2047
    .line 2048
    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 2049
    .line 2050
    .line 2051
    goto :goto_33

    .line 2052
    :catch_4
    move-exception v0

    .line 2053
    goto :goto_32

    .line 2054
    :catchall_0
    move-exception v0

    .line 2055
    move-object v3, v0

    .line 2056
    :try_start_8
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 2057
    .line 2058
    .line 2059
    goto :goto_31

    .line 2060
    :catchall_1
    move-exception v0

    .line 2061
    :try_start_9
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 2062
    .line 2063
    .line 2064
    :goto_31
    throw v3
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 2065
    :goto_32
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 2066
    .line 2067
    .line 2068
    :cond_3d
    :goto_33
    move-object/from16 v2, v19

    .line 2069
    .line 2070
    move-object/from16 v6, v28

    .line 2071
    .line 2072
    invoke-virtual {v2, v6, v1}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;[B)Ljava/lang/Class;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v4

    .line 2076
    const-string v0, "Define "

    .line 2077
    .line 2078
    const-string v1, " as "

    .line 2079
    .line 2080
    filled-new-array {v0, v6, v1, v4}, [Ljava/lang/Object;

    .line 2081
    .line 2082
    .line 2083
    move-result-object v0

    .line 2084
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 2085
    .line 2086
    .line 2087
    goto :goto_34

    .line 2088
    :cond_3e
    move-object/from16 v20, v9

    .line 2089
    .line 2090
    :goto_34
    const/16 v0, 0x24

    .line 2091
    .line 2092
    const/16 v14, 0x2e

    .line 2093
    .line 2094
    invoke-virtual {v6, v0, v14}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 2095
    .line 2096
    .line 2097
    move-result-object v0

    .line 2098
    move-object/from16 v1, v18

    .line 2099
    .line 2100
    invoke-virtual {v1, v0}, Lbsh/NameSpace;->importClass(Ljava/lang/String;)V

    .line 2101
    .line 2102
    .line 2103
    move-object/from16 v9, v20

    .line 2104
    .line 2105
    invoke-virtual {v9, v4}, Lbsh/NameSpace;->setClassStatic(Ljava/lang/Class;)V

    .line 2106
    .line 2107
    .line 2108
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 2109
    .line 2110
    .line 2111
    move-result-object v0

    .line 2112
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 2113
    .line 2114
    .line 2115
    invoke-virtual/range {p7 .. p7}, Lbsh/Interpreter;->getStrictJava()Z

    .line 2116
    .line 2117
    .line 2118
    move-result v0

    .line 2119
    if-eqz v0, :cond_3f

    .line 2120
    .line 2121
    new-instance v0, Ljava/util/ArrayList;

    .line 2122
    .line 2123
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2124
    .line 2125
    .line 2126
    new-instance v1, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    .line 2127
    .line 2128
    invoke-direct {v1, v0}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;-><init>(Ljava/util/ArrayList;)V

    .line 2129
    .line 2130
    .line 2131
    invoke-virtual {v1, v4}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;)V

    .line 2132
    .line 2133
    .line 2134
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v1

    .line 2138
    new-instance v2, Lbsh/飘花落叶言子楪世苏兰哲;

    .line 2139
    .line 2140
    const/4 v3, 0x3

    .line 2141
    invoke-direct {v2, v3}, Lbsh/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 2142
    .line 2143
    .line 2144
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v1

    .line 2148
    new-instance v2, Lbsh/飘花落叶言子楪兰世苏哲;

    .line 2149
    .line 2150
    invoke-direct {v2, v0, v4}, Lbsh/飘花落叶言子楪兰世苏哲;-><init>(Ljava/util/ArrayList;Ljava/lang/Class;)V

    .line 2151
    .line 2152
    .line 2153
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->forEach(Ljava/util/function/Consumer;)V

    .line 2154
    .line 2155
    .line 2156
    :cond_3f
    return-object v4

    .line 2157
    :catch_5
    move-exception v0

    .line 2158
    const-string v1, "Unable to init class static block: "

    .line 2159
    .line 2160
    invoke-static {v1, v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2161
    .line 2162
    .line 2163
    const/16 v16, 0x0

    .line 2164
    .line 2165
    return-object v16
.end method
