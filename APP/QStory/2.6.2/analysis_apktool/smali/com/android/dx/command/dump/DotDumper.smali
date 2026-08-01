.class public Lcom/android/dx/command/dump/DotDumper;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/cf/iface/ParseObserver;


# instance fields
.field private final args:Lcom/android/dx/command/dump/Args;

.field private final bytes:[B

.field private classFile:Lcom/android/dx/cf/direct/DirectClassFile;

.field private final dexOptions:Lcom/android/dx/dex/DexOptions;

.field private final filePath:Ljava/lang/String;

.field private final optimize:Z

.field private final strictParse:Z


# direct methods
.method public constructor <init>([BLjava/lang/String;Lcom/android/dx/command/dump/Args;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/command/dump/DotDumper;->bytes:[B

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/command/dump/DotDumper;->filePath:Ljava/lang/String;

    .line 7
    .line 8
    iget-boolean p1, p3, Lcom/android/dx/command/dump/Args;->strictParse:Z

    .line 9
    .line 10
    iput-boolean p1, p0, Lcom/android/dx/command/dump/DotDumper;->strictParse:Z

    .line 11
    .line 12
    iget-boolean p1, p3, Lcom/android/dx/command/dump/Args;->optimize:Z

    .line 13
    .line 14
    iput-boolean p1, p0, Lcom/android/dx/command/dump/DotDumper;->optimize:Z

    .line 15
    .line 16
    iput-object p3, p0, Lcom/android/dx/command/dump/DotDumper;->args:Lcom/android/dx/command/dump/Args;

    .line 17
    .line 18
    new-instance p1, Lcom/android/dx/dex/DexOptions;

    .line 19
    .line 20
    invoke-direct {p1}, Lcom/android/dx/dex/DexOptions;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/android/dx/command/dump/DotDumper;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 24
    .line 25
    return-void
.end method

.method public static dump([BLjava/lang/String;Lcom/android/dx/command/dump/Args;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/command/dump/DotDumper;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/android/dx/command/dump/DotDumper;-><init>([BLjava/lang/String;Lcom/android/dx/command/dump/Args;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/command/dump/DotDumper;->run()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private run()V
    .locals 5

    .line 1
    new-instance v0, Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/command/dump/DotDumper;->bytes:[B

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/android/dx/util/ByteArray;-><init>([B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/android/dx/cf/direct/DirectClassFile;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/android/dx/command/dump/DotDumper;->filePath:Ljava/lang/String;

    .line 11
    .line 12
    iget-boolean v3, p0, Lcom/android/dx/command/dump/DotDumper;->strictParse:Z

    .line 13
    .line 14
    invoke-direct {v1, v0, v2, v3}, Lcom/android/dx/cf/direct/DirectClassFile;-><init>(Lcom/android/dx/util/ByteArray;Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/android/dx/command/dump/DotDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 18
    .line 19
    sget-object v2, Lcom/android/dx/cf/direct/StdAttributeFactory;->THE_ONE:Lcom/android/dx/cf/direct/StdAttributeFactory;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/android/dx/cf/direct/DirectClassFile;->setAttributeFactory(Lcom/android/dx/cf/direct/AttributeFactory;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/android/dx/command/dump/DotDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/DirectClassFile;->getMagic()I

    .line 27
    .line 28
    .line 29
    new-instance v1, Lcom/android/dx/cf/direct/DirectClassFile;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/android/dx/command/dump/DotDumper;->filePath:Ljava/lang/String;

    .line 32
    .line 33
    iget-boolean v4, p0, Lcom/android/dx/command/dump/DotDumper;->strictParse:Z

    .line 34
    .line 35
    invoke-direct {v1, v0, v3, v4}, Lcom/android/dx/cf/direct/DirectClassFile;-><init>(Lcom/android/dx/util/ByteArray;Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Lcom/android/dx/cf/direct/DirectClassFile;->setAttributeFactory(Lcom/android/dx/cf/direct/AttributeFactory;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p0}, Lcom/android/dx/cf/direct/DirectClassFile;->setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/DirectClassFile;->getMagic()I

    .line 45
    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public changeIndent(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public endParsingMember(Lcom/android/dx/util/ByteArray;ILjava/lang/String;Ljava/lang/String;Lcom/android/dx/cf/iface/Member;)V
    .locals 10

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
    invoke-virtual {p0, p3}, Lcom/android/dx/command/dump/DotDumper;->shouldDumpMethod(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    new-instance p1, Lcom/android/dx/cf/code/ConcreteMethod;

    .line 14
    .line 15
    check-cast p5, Lcom/android/dx/cf/iface/Method;

    .line 16
    .line 17
    iget-object p2, p0, Lcom/android/dx/command/dump/DotDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 18
    .line 19
    const/4 p4, 0x1

    .line 20
    invoke-direct {p1, p5, p2, p4, p4}, Lcom/android/dx/cf/code/ConcreteMethod;-><init>(Lcom/android/dx/cf/iface/Method;Lcom/android/dx/cf/iface/ClassFile;ZZ)V

    .line 21
    .line 22
    .line 23
    sget-object p2, Lcom/android/dx/rop/code/DexTranslationAdvice;->THE_ONE:Lcom/android/dx/rop/code/DexTranslationAdvice;

    .line 24
    .line 25
    iget-object p5, p0, Lcom/android/dx/command/dump/DotDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 26
    .line 27
    invoke-virtual {p5}, Lcom/android/dx/cf/direct/DirectClassFile;->getMethods()Lcom/android/dx/cf/iface/MethodList;

    .line 28
    .line 29
    .line 30
    move-result-object p5

    .line 31
    iget-object v0, p0, Lcom/android/dx/command/dump/DotDumper;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 32
    .line 33
    invoke-static {p1, p2, p5, v0}, Lcom/android/dx/cf/code/Ropper;->convert(Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;Lcom/android/dx/dex/DexOptions;)Lcom/android/dx/rop/code/RopMethod;

    .line 34
    .line 35
    .line 36
    move-result-object p5

    .line 37
    iget-boolean p0, p0, Lcom/android/dx/command/dump/DotDumper;->optimize:Z

    .line 38
    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ConcreteMethod;->getAccessFlags()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-static {p0}, Lcom/android/dx/rop/code/AccessFlags;->isStatic(I)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-static {p1, p0}, Lcom/android/dx/command/dump/BaseDumper;->computeParamWidth(Lcom/android/dx/cf/code/ConcreteMethod;Z)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-static {p5, p1, p0, p4, p2}, Lcom/android/dx/ssa/Optimizer;->optimize(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;)Lcom/android/dx/rop/code/RopMethod;

    .line 54
    .line 55
    .line 56
    move-result-object p5

    .line 57
    :cond_2
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 58
    .line 59
    new-instance p1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string p2, "digraph "

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p2, "{"

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 82
    .line 83
    new-instance p1, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string p2, "\tfirst -> n"

    .line 86
    .line 87
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p5}, Lcom/android/dx/rop/code/RopMethod;->getFirstLabel()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-static {p2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p2, ";"

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p5}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    const/4 p3, 0x0

    .line 122
    move p5, p3

    .line 123
    :goto_1
    if-ge p5, p1, :cond_7

    .line 124
    .line 125
    invoke-virtual {p0, p5}, Lcom/android/dx/rop/code/BasicBlockList;->get(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    invoke-virtual {v0}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2}, Lcom/android/dx/util/IntList;->size()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    const-string v4, "\tn"

    .line 142
    .line 143
    if-nez v3, :cond_3

    .line 144
    .line 145
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 146
    .line 147
    new-instance v2, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v1, " -> returns;"

    .line 160
    .line 161
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_3

    .line 172
    .line 173
    :cond_3
    invoke-virtual {v2}, Lcom/android/dx/util/IntList;->size()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    const-string v5, " -> n"

    .line 178
    .line 179
    if-ne v3, p4, :cond_4

    .line 180
    .line 181
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 182
    .line 183
    new-instance v3, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, p3}, Lcom/android/dx/util/IntList;->get(I)I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_3

    .line 220
    .line 221
    :cond_4
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 222
    .line 223
    new-instance v6, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-string v7, " -> {"

    .line 236
    .line 237
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    invoke-virtual {v3, v6}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    move v3, p3

    .line 248
    :goto_2
    invoke-virtual {v2}, Lcom/android/dx/util/IntList;->size()I

    .line 249
    .line 250
    .line 251
    move-result v6

    .line 252
    if-ge v3, v6, :cond_6

    .line 253
    .line 254
    invoke-virtual {v2, v3}, Lcom/android/dx/util/IntList;->get(I)I

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    invoke-virtual {v0}, Lcom/android/dx/rop/code/BasicBlock;->getPrimarySuccessor()I

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    if-eq v6, v7, :cond_5

    .line 263
    .line 264
    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 265
    .line 266
    new-instance v8, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v9, " n"

    .line 269
    .line 270
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v6}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string v6, " "

    .line 281
    .line 282
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    invoke-virtual {v7, v6}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 293
    .line 294
    goto :goto_2

    .line 295
    :cond_6
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 296
    .line 297
    const-string v3, "};"

    .line 298
    .line 299
    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 303
    .line 304
    new-instance v3, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0}, Lcom/android/dx/rop/code/BasicBlock;->getPrimarySuccessor()I

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const-string v0, " [label=\"primary\"];"

    .line 331
    .line 332
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    :goto_3
    add-int/lit8 p5, p5, 0x1

    .line 343
    .line 344
    goto/16 :goto_1

    .line 345
    .line 346
    :cond_7
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 347
    .line 348
    const-string p1, "}"

    .line 349
    .line 350
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    return-void
.end method

.method public parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public shouldDumpMethod(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/command/dump/DotDumper;->args:Lcom/android/dx/command/dump/Args;

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
    .locals 0

    .line 1
    return-void
.end method
