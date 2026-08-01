.class public Lcom/android/dx/command/dump/BlockDumper;
.super Lcom/android/dx/command/dump/BaseDumper;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field protected classFile:Lcom/android/dx/cf/direct/DirectClassFile;

.field private first:Z

.field private final optimize:Z

.field private final rop:Z

.field protected suppressDump:Z


# direct methods
.method public constructor <init>([BLjava/io/PrintStream;Ljava/lang/String;ZLcom/android/dx/command/dump/Args;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p5}, Lcom/android/dx/command/dump/BaseDumper;-><init>([BLjava/io/PrintStream;Ljava/lang/String;Lcom/android/dx/command/dump/Args;)V

    .line 2
    .line 3
    .line 4
    iput-boolean p4, p0, Lcom/android/dx/command/dump/BlockDumper;->rop:Z

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/android/dx/command/dump/BlockDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/android/dx/command/dump/BlockDumper;->suppressDump:Z

    .line 11
    .line 12
    iput-boolean p1, p0, Lcom/android/dx/command/dump/BlockDumper;->first:Z

    .line 13
    .line 14
    iget-boolean p1, p5, Lcom/android/dx/command/dump/Args;->optimize:Z

    .line 15
    .line 16
    iput-boolean p1, p0, Lcom/android/dx/command/dump/BlockDumper;->optimize:Z

    .line 17
    .line 18
    return-void
.end method

.method public static dump([BLjava/io/PrintStream;Ljava/lang/String;ZLcom/android/dx/command/dump/Args;)V
    .locals 6

    .line 58
    new-instance v0, Lcom/android/dx/command/dump/BlockDumper;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/android/dx/command/dump/BlockDumper;-><init>([BLjava/io/PrintStream;Ljava/lang/String;ZLcom/android/dx/command/dump/Args;)V

    .line 59
    invoke-virtual {v0}, Lcom/android/dx/command/dump/BlockDumper;->dump()V

    return-void
.end method

.method private regularDump(Lcom/android/dx/cf/code/ConcreteMethod;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/code/ConcreteMethod;->getCode()Lcom/android/dx/cf/code/BytecodeArray;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/android/dx/cf/code/BytecodeArray;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static/range {p1 .. p1}, Lcom/android/dx/cf/code/BasicBlocker;->identifyBlocks(Lcom/android/dx/cf/code/ConcreteMethod;)Lcom/android/dx/cf/code/ByteBlockList;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    new-instance v5, Lcom/android/dx/cf/direct/CodeObserver;

    .line 20
    .line 21
    invoke-direct {v5, v2, v0}, Lcom/android/dx/cf/direct/CodeObserver;-><init>(Lcom/android/dx/util/ByteArray;Lcom/android/dx/cf/iface/ParseObserver;)V

    .line 22
    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    iput-boolean v6, v0, Lcom/android/dx/command/dump/BlockDumper;->suppressDump:Z

    .line 26
    .line 27
    move v7, v6

    .line 28
    move v8, v7

    .line 29
    :goto_0
    const-string v9, "dead code "

    .line 30
    .line 31
    const-string v10, ".."

    .line 32
    .line 33
    if-ge v7, v4, :cond_6

    .line 34
    .line 35
    invoke-virtual {v3, v7}, Lcom/android/dx/cf/code/ByteBlockList;->get(I)Lcom/android/dx/cf/code/ByteBlock;

    .line 36
    .line 37
    .line 38
    move-result-object v12

    .line 39
    invoke-virtual {v12}, Lcom/android/dx/cf/code/ByteBlock;->getStart()I

    .line 40
    .line 41
    .line 42
    move-result v13

    .line 43
    invoke-virtual {v12}, Lcom/android/dx/cf/code/ByteBlock;->getEnd()I

    .line 44
    .line 45
    .line 46
    move-result v14

    .line 47
    if-ge v8, v13, :cond_0

    .line 48
    .line 49
    sub-int v15, v13, v8

    .line 50
    .line 51
    new-instance v11, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v11, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v8}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-static {v13}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    invoke-virtual {v0, v2, v8, v15, v9}, Lcom/android/dx/command/dump/BlockDumper;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_0
    new-instance v8, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v9, "block "

    .line 83
    .line 84
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v12}, Lcom/android/dx/cf/code/ByteBlock;->getLabel()I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    invoke-static {v9}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v9, ": "

    .line 99
    .line 100
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-static {v13}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-static {v8, v14}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-virtual {v0, v2, v13, v6, v8}, Lcom/android/dx/command/dump/BlockDumper;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/4 v8, 0x1

    .line 121
    invoke-virtual {v0, v8}, Lcom/android/dx/command/dump/BlockDumper;->changeIndent(I)V

    .line 122
    .line 123
    .line 124
    :goto_1
    if-ge v13, v14, :cond_1

    .line 125
    .line 126
    invoke-virtual {v1, v13, v5}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    invoke-virtual {v5, v13}, Lcom/android/dx/cf/direct/CodeObserver;->setPreviousOffset(I)V

    .line 131
    .line 132
    .line 133
    add-int/2addr v13, v8

    .line 134
    goto :goto_1

    .line 135
    :cond_1
    invoke-virtual {v12}, Lcom/android/dx/cf/code/ByteBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    invoke-virtual {v8}, Lcom/android/dx/util/IntList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    if-nez v9, :cond_2

    .line 144
    .line 145
    const-string v8, "returns"

    .line 146
    .line 147
    invoke-virtual {v0, v2, v14, v6, v8}, Lcom/android/dx/command/dump/BlockDumper;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_2
    move v10, v6

    .line 152
    :goto_2
    if-ge v10, v9, :cond_3

    .line 153
    .line 154
    invoke-virtual {v8, v10}, Lcom/android/dx/util/IntList;->get(I)I

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    new-instance v13, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    const-string v15, "next "

    .line 161
    .line 162
    invoke-direct {v13, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v13, v11}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    invoke-virtual {v0, v2, v14, v6, v11}, Lcom/android/dx/command/dump/BlockDumper;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 170
    .line 171
    .line 172
    add-int/lit8 v10, v10, 0x1

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_3
    :goto_3
    invoke-virtual {v12}, Lcom/android/dx/cf/code/ByteBlock;->getCatches()Lcom/android/dx/cf/code/ByteCatchList;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    invoke-virtual {v8}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    move v10, v6

    .line 184
    :goto_4
    if-ge v10, v9, :cond_5

    .line 185
    .line 186
    invoke-virtual {v8, v10}, Lcom/android/dx/cf/code/ByteCatchList;->get(I)Lcom/android/dx/cf/code/ByteCatchList$Item;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    invoke-virtual {v11}, Lcom/android/dx/cf/code/ByteCatchList$Item;->getExceptionClass()Lcom/android/dx/rop/cst/CstType;

    .line 191
    .line 192
    .line 193
    move-result-object v12

    .line 194
    new-instance v13, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    const-string v15, "catch "

    .line 197
    .line 198
    invoke-direct {v13, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    sget-object v15, Lcom/android/dx/rop/cst/CstType;->OBJECT:Lcom/android/dx/rop/cst/CstType;

    .line 202
    .line 203
    if-ne v12, v15, :cond_4

    .line 204
    .line 205
    const-string v12, "<any>"

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_4
    invoke-virtual {v12}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    :goto_5
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v12, " -> "

    .line 216
    .line 217
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v11}, Lcom/android/dx/cf/code/ByteCatchList$Item;->getHandlerPc()I

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    invoke-static {v11}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    invoke-virtual {v0, v2, v14, v6, v11}, Lcom/android/dx/command/dump/BlockDumper;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 236
    .line 237
    .line 238
    add-int/lit8 v10, v10, 0x1

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_5
    const/4 v8, -0x1

    .line 242
    invoke-virtual {v0, v8}, Lcom/android/dx/command/dump/BlockDumper;->changeIndent(I)V

    .line 243
    .line 244
    .line 245
    add-int/lit8 v7, v7, 0x1

    .line 246
    .line 247
    move v8, v14

    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_6
    invoke-virtual {v2}, Lcom/android/dx/util/ByteArray;->size()I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    if-ge v8, v1, :cond_7

    .line 255
    .line 256
    sub-int v3, v1, v8

    .line 257
    .line 258
    new-instance v4, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-static {v8}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-virtual {v0, v2, v8, v3, v1}, Lcom/android/dx/command/dump/BlockDumper;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 285
    .line 286
    .line 287
    :cond_7
    const/4 v8, 0x1

    .line 288
    iput-boolean v8, v0, Lcom/android/dx/command/dump/BlockDumper;->suppressDump:Z

    .line 289
    .line 290
    return-void
.end method

.method private ropDump(Lcom/android/dx/cf/code/ConcreteMethod;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lcom/android/dx/rop/code/DexTranslationAdvice;->THE_ONE:Lcom/android/dx/rop/code/DexTranslationAdvice;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/android/dx/cf/code/ConcreteMethod;->getCode()Lcom/android/dx/cf/code/BytecodeArray;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3}, Lcom/android/dx/cf/code/BytecodeArray;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v4, v0, Lcom/android/dx/command/dump/BlockDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 16
    .line 17
    invoke-virtual {v4}, Lcom/android/dx/cf/direct/DirectClassFile;->getMethods()Lcom/android/dx/cf/iface/MethodList;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v5, v0, Lcom/android/dx/command/dump/BaseDumper;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 22
    .line 23
    invoke-static {v1, v2, v4, v5}, Lcom/android/dx/cf/code/Ropper;->convert(Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;Lcom/android/dx/dex/DexOptions;)Lcom/android/dx/rop/code/RopMethod;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    new-instance v5, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const/16 v6, 0x7d0

    .line 30
    .line 31
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iget-boolean v6, v0, Lcom/android/dx/command/dump/BlockDumper;->optimize:Z

    .line 35
    .line 36
    const/4 v7, 0x1

    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/android/dx/cf/code/ConcreteMethod;->getAccessFlags()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    invoke-static {v6}, Lcom/android/dx/rop/code/AccessFlags;->isStatic(I)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-static {v1, v6}, Lcom/android/dx/command/dump/BaseDumper;->computeParamWidth(Lcom/android/dx/cf/code/ConcreteMethod;Z)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v4, v1, v6, v7, v2}, Lcom/android/dx/ssa/Optimizer;->optimize(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;)Lcom/android/dx/rop/code/RopMethod;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    :cond_0
    invoke-virtual {v4}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Lcom/android/dx/util/LabeledList;->getLabelsInOrder()[I

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    new-instance v6, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v8, "first "

    .line 66
    .line 67
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Lcom/android/dx/rop/code/RopMethod;->getFirstLabel()I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    invoke-static {v8}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v8, "\n"

    .line 82
    .line 83
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    array-length v6, v2

    .line 94
    const/4 v10, 0x0

    .line 95
    :goto_0
    if-ge v10, v6, :cond_6

    .line 96
    .line 97
    aget v11, v2, v10

    .line 98
    .line 99
    invoke-virtual {v1, v11}, Lcom/android/dx/util/LabeledList;->indexOfLabel(I)I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    invoke-virtual {v1, v12}, Lcom/android/dx/rop/code/BasicBlockList;->get(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    const-string v13, "block "

    .line 108
    .line 109
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-static {v11}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v11}, Lcom/android/dx/rop/code/RopMethod;->labelToPredecessors(I)Lcom/android/dx/util/IntList;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    invoke-virtual {v11}, Lcom/android/dx/util/IntList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v13

    .line 130
    const/4 v14, 0x0

    .line 131
    :goto_1
    if-ge v14, v13, :cond_1

    .line 132
    .line 133
    const-string v15, "  pred "

    .line 134
    .line 135
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v11, v14}, Lcom/android/dx/util/IntList;->get(I)I

    .line 139
    .line 140
    .line 141
    move-result v15

    .line 142
    invoke-static {v15}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    add-int/lit8 v14, v14, 0x1

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_1
    invoke-virtual {v12}, Lcom/android/dx/rop/code/BasicBlock;->getInsns()Lcom/android/dx/rop/code/InsnList;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    invoke-virtual {v11}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 160
    .line 161
    .line 162
    move-result v13

    .line 163
    const/4 v14, 0x0

    .line 164
    :goto_2
    if-ge v14, v13, :cond_2

    .line 165
    .line 166
    invoke-virtual {v11, v14}, Lcom/android/dx/rop/code/InsnList;->get(I)Lcom/android/dx/rop/code/Insn;

    .line 167
    .line 168
    .line 169
    const-string v15, "  "

    .line 170
    .line 171
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v11, v14}, Lcom/android/dx/rop/code/InsnList;->get(I)Lcom/android/dx/rop/code/Insn;

    .line 175
    .line 176
    .line 177
    move-result-object v15

    .line 178
    invoke-virtual {v15}, Lcom/android/dx/rop/code/Insn;->toHuman()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v15

    .line 182
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    add-int/lit8 v14, v14, 0x1

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_2
    invoke-virtual {v12}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-virtual {v11}, Lcom/android/dx/util/IntList;->size()I

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    if-nez v13, :cond_3

    .line 200
    .line 201
    const-string v11, "  returns\n"

    .line 202
    .line 203
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_3
    invoke-virtual {v12}, Lcom/android/dx/rop/code/BasicBlock;->getPrimarySuccessor()I

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    const/4 v14, 0x0

    .line 212
    :goto_3
    if-ge v14, v13, :cond_5

    .line 213
    .line 214
    invoke-virtual {v11, v14}, Lcom/android/dx/util/IntList;->get(I)I

    .line 215
    .line 216
    .line 217
    move-result v15

    .line 218
    const-string v9, "  next "

    .line 219
    .line 220
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-static {v15}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    if-eq v13, v7, :cond_4

    .line 231
    .line 232
    if-ne v15, v12, :cond_4

    .line 233
    .line 234
    const-string v9, " *"

    .line 235
    .line 236
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    :cond_4
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    add-int/lit8 v14, v14, 0x1

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_5
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_6
    const/4 v9, 0x0

    .line 250
    iput-boolean v9, v0, Lcom/android/dx/command/dump/BlockDumper;->suppressDump:Z

    .line 251
    .line 252
    invoke-virtual {v3}, Lcom/android/dx/util/ByteArray;->size()I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {v0, v3, v9, v1, v2}, Lcom/android/dx/command/dump/BlockDumper;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 261
    .line 262
    .line 263
    iput-boolean v7, v0, Lcom/android/dx/command/dump/BlockDumper;->suppressDump:Z

    .line 264
    .line 265
    return-void
.end method


# virtual methods
.method public changeIndent(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/command/dump/BlockDumper;->suppressDump:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lcom/android/dx/command/dump/BaseDumper;->changeIndent(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public dump()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getBytes()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/android/dx/util/ByteArray;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/android/dx/util/ByteArray;-><init>([B)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lcom/android/dx/cf/direct/DirectClassFile;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getFilePath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getStrictParse()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-direct {v0, v1, v2, v3}, Lcom/android/dx/cf/direct/DirectClassFile;-><init>(Lcom/android/dx/util/ByteArray;Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/android/dx/command/dump/BlockDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 24
    .line 25
    sget-object v2, Lcom/android/dx/cf/direct/StdAttributeFactory;->THE_ONE:Lcom/android/dx/cf/direct/StdAttributeFactory;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lcom/android/dx/cf/direct/DirectClassFile;->setAttributeFactory(Lcom/android/dx/cf/direct/AttributeFactory;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/android/dx/command/dump/BlockDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMagic()I

    .line 33
    .line 34
    .line 35
    new-instance v0, Lcom/android/dx/cf/direct/DirectClassFile;

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getFilePath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getStrictParse()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-direct {v0, v1, v3, v4}, Lcom/android/dx/cf/direct/DirectClassFile;-><init>(Lcom/android/dx/util/ByteArray;Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Lcom/android/dx/cf/direct/DirectClassFile;->setAttributeFactory(Lcom/android/dx/cf/direct/AttributeFactory;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0}, Lcom/android/dx/cf/direct/DirectClassFile;->setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMagic()I

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public endParsingMember(Lcom/android/dx/util/ByteArray;ILjava/lang/String;Ljava/lang/String;Lcom/android/dx/cf/iface/Member;)V
    .locals 0

    .line 1
    instance-of p1, p5, Lcom/android/dx/cf/iface/Method;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0, p3}, Lcom/android/dx/command/dump/BlockDumper;->shouldDumpMethod(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    invoke-interface {p5}, Lcom/android/dx/cf/iface/Member;->getAccessFlags()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    and-int/lit16 p1, p1, 0x500

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_2
    new-instance p1, Lcom/android/dx/cf/code/ConcreteMethod;

    .line 23
    .line 24
    check-cast p5, Lcom/android/dx/cf/iface/Method;

    .line 25
    .line 26
    iget-object p2, p0, Lcom/android/dx/command/dump/BlockDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 27
    .line 28
    const/4 p3, 0x1

    .line 29
    invoke-direct {p1, p5, p2, p3, p3}, Lcom/android/dx/cf/code/ConcreteMethod;-><init>(Lcom/android/dx/cf/iface/Method;Lcom/android/dx/cf/iface/ClassFile;ZZ)V

    .line 30
    .line 31
    .line 32
    iget-boolean p2, p0, Lcom/android/dx/command/dump/BlockDumper;->rop:Z

    .line 33
    .line 34
    if-eqz p2, :cond_3

    .line 35
    .line 36
    invoke-direct {p0, p1}, Lcom/android/dx/command/dump/BlockDumper;->ropDump(Lcom/android/dx/cf/code/ConcreteMethod;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    invoke-direct {p0, p1}, Lcom/android/dx/command/dump/BlockDumper;->regularDump(Lcom/android/dx/cf/code/ConcreteMethod;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/command/dump/BlockDumper;->suppressDump:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1, p2, p3, p4}, Lcom/android/dx/command/dump/BaseDumper;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public shouldDumpMethod(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dump/BaseDumper;->args:Lcom/android/dx/command/dump/Args;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/command/dump/Args;->method:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public startParsingMember(Lcom/android/dx/util/ByteArray;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    invoke-virtual {p4, v0}, Ljava/lang/String;->indexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, p3}, Lcom/android/dx/command/dump/BlockDumper;->shouldDumpMethod(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lcom/android/dx/command/dump/BlockDumper;->suppressDump:Z

    .line 19
    .line 20
    iget-boolean v1, p0, Lcom/android/dx/command/dump/BlockDumper;->first:Z

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/android/dx/command/dump/BlockDumper;->first:Z

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    const-string v1, "\n"

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/android/dx/command/dump/BlockDumper;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_1
    const-string v1, "method "

    .line 33
    .line 34
    const-string v2, " "

    .line 35
    .line 36
    invoke-static {v1, p3, v2, p4}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/android/dx/command/dump/BlockDumper;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Lcom/android/dx/command/dump/BlockDumper;->suppressDump:Z

    .line 45
    .line 46
    return-void
.end method
