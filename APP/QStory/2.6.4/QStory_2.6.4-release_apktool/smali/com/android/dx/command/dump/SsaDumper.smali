.class public Lcom/android/dx/command/dump/SsaDumper;
.super Lcom/android/dx/command/dump/BlockDumper;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method private constructor <init>([BLjava/io/PrintStream;Ljava/lang/String;Lcom/android/dx/command/dump/Args;)V
    .locals 6

    .line 1
    const/4 v4, 0x1

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v5, p4

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/command/dump/BlockDumper;-><init>([BLjava/io/PrintStream;Ljava/lang/String;ZLcom/android/dx/command/dump/Args;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static dump([BLjava/io/PrintStream;Ljava/lang/String;Lcom/android/dx/command/dump/Args;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/command/dump/SsaDumper;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/android/dx/command/dump/SsaDumper;-><init>([BLjava/io/PrintStream;Ljava/lang/String;Lcom/android/dx/command/dump/Args;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/android/dx/command/dump/BlockDumper;->dump()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public endParsingMember(Lcom/android/dx/util/ByteArray;ILjava/lang/String;Ljava/lang/String;Lcom/android/dx/cf/iface/Member;)V
    .locals 8

    .line 1
    instance-of p2, p5, Lcom/android/dx/cf/iface/Method;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0, p3}, Lcom/android/dx/command/dump/BlockDumper;->shouldDumpMethod(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    invoke-interface {p5}, Lcom/android/dx/cf/iface/Member;->getAccessFlags()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    and-int/lit16 p2, p2, 0x500

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_2
    new-instance p2, Lcom/android/dx/cf/code/ConcreteMethod;

    .line 23
    .line 24
    check-cast p5, Lcom/android/dx/cf/iface/Method;

    .line 25
    .line 26
    iget-object p3, p0, Lcom/android/dx/command/dump/BlockDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 27
    .line 28
    const/4 p4, 0x1

    .line 29
    invoke-direct {p2, p5, p3, p4, p4}, Lcom/android/dx/cf/code/ConcreteMethod;-><init>(Lcom/android/dx/cf/iface/Method;Lcom/android/dx/cf/iface/ClassFile;ZZ)V

    .line 30
    .line 31
    .line 32
    sget-object v4, Lcom/android/dx/rop/code/DexTranslationAdvice;->THE_ONE:Lcom/android/dx/rop/code/DexTranslationAdvice;

    .line 33
    .line 34
    iget-object p3, p0, Lcom/android/dx/command/dump/BlockDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 35
    .line 36
    invoke-virtual {p3}, Lcom/android/dx/cf/direct/DirectClassFile;->getMethods()Lcom/android/dx/cf/iface/MethodList;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    iget-object p5, p0, Lcom/android/dx/command/dump/BaseDumper;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 41
    .line 42
    invoke-static {p2, v4, p3, p5}, Lcom/android/dx/cf/code/Ropper;->convert(Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;Lcom/android/dx/dex/DexOptions;)Lcom/android/dx/rop/code/RopMethod;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p2}, Lcom/android/dx/cf/code/ConcreteMethod;->getAccessFlags()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    invoke-static {p3}, Lcom/android/dx/rop/code/AccessFlags;->isStatic(I)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-static {p2, v2}, Lcom/android/dx/command/dump/BaseDumper;->computeParamWidth(Lcom/android/dx/cf/code/ConcreteMethod;Z)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iget-object p2, p0, Lcom/android/dx/command/dump/BaseDumper;->args:Lcom/android/dx/command/dump/Args;

    .line 59
    .line 60
    iget-object p2, p2, Lcom/android/dx/command/dump/Args;->ssaStep:Ljava/lang/String;

    .line 61
    .line 62
    if-nez p2, :cond_3

    .line 63
    .line 64
    const-class p2, Lcom/android/dx/ssa/Optimizer$OptionalStep;

    .line 65
    .line 66
    invoke-static {p2}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    const/4 v3, 0x1

    .line 71
    invoke-static/range {v0 .. v5}, Lcom/android/dx/ssa/Optimizer;->debugNoRegisterAllocation(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;Ljava/util/EnumSet;)Lcom/android/dx/ssa/SsaMethod;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    const-string p3, "edge-split"

    .line 77
    .line 78
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-eqz p2, :cond_4

    .line 83
    .line 84
    invoke-static {v0, v1, v2, p4, v4}, Lcom/android/dx/ssa/Optimizer;->debugEdgeSplit(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;)Lcom/android/dx/ssa/SsaMethod;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    iget-object p2, p0, Lcom/android/dx/command/dump/BaseDumper;->args:Lcom/android/dx/command/dump/Args;

    .line 90
    .line 91
    iget-object p2, p2, Lcom/android/dx/command/dump/Args;->ssaStep:Ljava/lang/String;

    .line 92
    .line 93
    const-string p3, "phi-placement"

    .line 94
    .line 95
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_5

    .line 100
    .line 101
    invoke-static {v0, v1, v2, p4, v4}, Lcom/android/dx/ssa/Optimizer;->debugPhiPlacement(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;)Lcom/android/dx/ssa/SsaMethod;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    goto :goto_1

    .line 106
    :cond_5
    iget-object p2, p0, Lcom/android/dx/command/dump/BaseDumper;->args:Lcom/android/dx/command/dump/Args;

    .line 107
    .line 108
    iget-object p2, p2, Lcom/android/dx/command/dump/Args;->ssaStep:Ljava/lang/String;

    .line 109
    .line 110
    const-string p3, "renaming"

    .line 111
    .line 112
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-eqz p2, :cond_6

    .line 117
    .line 118
    invoke-static {v0, v1, v2, p4, v4}, Lcom/android/dx/ssa/Optimizer;->debugRenaming(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;)Lcom/android/dx/ssa/SsaMethod;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    goto :goto_1

    .line 123
    :cond_6
    iget-object p2, p0, Lcom/android/dx/command/dump/BaseDumper;->args:Lcom/android/dx/command/dump/Args;

    .line 124
    .line 125
    iget-object p2, p2, Lcom/android/dx/command/dump/Args;->ssaStep:Ljava/lang/String;

    .line 126
    .line 127
    const-string p3, "dead-code"

    .line 128
    .line 129
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-eqz p2, :cond_7

    .line 134
    .line 135
    invoke-static {v0, v1, v2, p4, v4}, Lcom/android/dx/ssa/Optimizer;->debugDeadCodeRemover(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;)Lcom/android/dx/ssa/SsaMethod;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    goto :goto_1

    .line 140
    :cond_7
    const/4 p2, 0x0

    .line 141
    :goto_1
    new-instance p3, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const/16 p5, 0x7d0

    .line 144
    .line 145
    invoke-direct {p3, p5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 146
    .line 147
    .line 148
    const-string p5, "first "

    .line 149
    .line 150
    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaMethod;->getEntryBlockIndex()I

    .line 154
    .line 155
    .line 156
    move-result p5

    .line 157
    invoke-virtual {p2, p5}, Lcom/android/dx/ssa/SsaMethod;->blockIndexToRopLabel(I)I

    .line 158
    .line 159
    .line 160
    move-result p5

    .line 161
    invoke-static {p5}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p5

    .line 165
    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const/16 p5, 0xa

    .line 169
    .line 170
    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    check-cast v0, Ljava/util/ArrayList;

    .line 182
    .line 183
    sget-object v1, Lcom/android/dx/ssa/SsaBasicBlock;->LABEL_COMPARATOR:Ljava/util/Comparator;

    .line 184
    .line 185
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    const/4 v2, 0x0

    .line 197
    if-eqz v1, :cond_d

    .line 198
    .line 199
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    check-cast v1, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 204
    .line 205
    const-string v3, "block "

    .line 206
    .line 207
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getRopLabel()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v3, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    :goto_3
    if-ltz v4, :cond_8

    .line 233
    .line 234
    const-string v5, "  pred "

    .line 235
    .line 236
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p2, v4}, Lcom/android/dx/ssa/SsaMethod;->blockIndexToRopLabel(I)I

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    invoke-static {v5}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    add-int/lit8 v4, v4, 0x1

    .line 254
    .line 255
    invoke-virtual {v3, v4}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    goto :goto_3

    .line 260
    :cond_8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    const-string v4, "  live in:"

    .line 263
    .line 264
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getLiveInRegs()Lcom/android/dx/util/IntSet;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    const-string v3, "\n"

    .line 282
    .line 283
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    if-eqz v5, :cond_9

    .line 299
    .line 300
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    check-cast v5, Lcom/android/dx/ssa/SsaInsn;

    .line 305
    .line 306
    const-string v6, "  "

    .line 307
    .line 308
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-interface {v5}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    goto :goto_4

    .line 322
    :cond_9
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    invoke-virtual {v4}, Ljava/util/BitSet;->cardinality()I

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    if-nez v4, :cond_a

    .line 331
    .line 332
    const-string v2, "  returns\n"

    .line 333
    .line 334
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    goto :goto_6

    .line 338
    :cond_a
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getPrimarySuccessorRopLabel()I

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getRopLabelSuccessorList()Lcom/android/dx/util/IntList;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    invoke-virtual {v5}, Lcom/android/dx/util/IntList;->size()I

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    :goto_5
    if-ge v2, v6, :cond_c

    .line 351
    .line 352
    const-string v7, "  next "

    .line 353
    .line 354
    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v5, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 358
    .line 359
    .line 360
    move-result v7

    .line 361
    invoke-static {v7}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    if-eq v6, p4, :cond_b

    .line 369
    .line 370
    invoke-virtual {v5, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 371
    .line 372
    .line 373
    move-result v7

    .line 374
    if-ne v4, v7, :cond_b

    .line 375
    .line 376
    const-string v7, " *"

    .line 377
    .line 378
    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    :cond_b
    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    add-int/lit8 v2, v2, 0x1

    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_c
    :goto_6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    const-string v4, "  live out:"

    .line 390
    .line 391
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getLiveOutRegs()Lcom/android/dx/util/IntSet;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    goto/16 :goto_2

    .line 412
    .line 413
    :cond_d
    iput-boolean v2, p0, Lcom/android/dx/command/dump/BlockDumper;->suppressDump:Z

    .line 414
    .line 415
    invoke-virtual {p1}, Lcom/android/dx/util/ByteArray;->size()I

    .line 416
    .line 417
    .line 418
    move-result p2

    .line 419
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object p3

    .line 423
    invoke-virtual {p0, p1, v2, p2, p3}, Lcom/android/dx/command/dump/BlockDumper;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 424
    .line 425
    .line 426
    iput-boolean p4, p0, Lcom/android/dx/command/dump/BlockDumper;->suppressDump:Z

    .line 427
    .line 428
    return-void
.end method
