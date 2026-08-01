.class abstract Lcom/android/dx/cf/direct/MemberListParser;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final attributeFactory:Lcom/android/dx/cf/direct/AttributeFactory;

.field private final cf:Lcom/android/dx/cf/direct/DirectClassFile;

.field private final definer:Lcom/android/dx/rop/cst/CstType;

.field private endOffset:I

.field private observer:Lcom/android/dx/cf/iface/ParseObserver;

.field private final offset:I


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/cf/direct/AttributeFactory;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    if-ltz p3, :cond_1

    .line 8
    .line 9
    if-eqz p4, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/cf/direct/MemberListParser;->cf:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/android/dx/cf/direct/MemberListParser;->definer:Lcom/android/dx/rop/cst/CstType;

    .line 14
    .line 15
    iput p3, p0, Lcom/android/dx/cf/direct/MemberListParser;->offset:I

    .line 16
    .line 17
    iput-object p4, p0, Lcom/android/dx/cf/direct/MemberListParser;->attributeFactory:Lcom/android/dx/cf/direct/AttributeFactory;

    .line 18
    .line 19
    const/4 p1, -0x1

    .line 20
    iput p1, p0, Lcom/android/dx/cf/direct/MemberListParser;->endOffset:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "attributeFactory == null"

    .line 24
    .line 25
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_1
    const-string p0, "offset < 0"

    .line 30
    .line 31
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_2
    const-string p0, "cf == null"

    .line 36
    .line 37
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0
.end method

.method private parse()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "]"

    .line 4
    .line 5
    const-string v3, "...while parsing "

    .line 6
    .line 7
    const-string v4, "s["

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/MemberListParser;->getAttributeContext()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/MemberListParser;->getCount()I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget v6, v1, Lcom/android/dx/cf/direct/MemberListParser;->offset:I

    .line 18
    .line 19
    const/4 v7, 0x2

    .line 20
    add-int/2addr v6, v7

    .line 21
    iget-object v8, v1, Lcom/android/dx/cf/direct/MemberListParser;->cf:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 22
    .line 23
    invoke-virtual {v8}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 24
    .line 25
    .line 26
    move-result-object v10

    .line 27
    iget-object v8, v1, Lcom/android/dx/cf/direct/MemberListParser;->cf:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 28
    .line 29
    invoke-virtual {v8}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    iget-object v9, v1, Lcom/android/dx/cf/direct/MemberListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 34
    .line 35
    if-eqz v9, :cond_0

    .line 36
    .line 37
    iget v11, v1, Lcom/android/dx/cf/direct/MemberListParser;->offset:I

    .line 38
    .line 39
    new-instance v12, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/MemberListParser;->humanName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v13

    .line 48
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v13, "s_count: "

    .line 52
    .line 53
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-static {v5}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v13

    .line 60
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    invoke-interface {v9, v10, v11, v7, v12}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    const/4 v9, 0x0

    .line 71
    :goto_0
    if-ge v9, v5, :cond_3

    .line 72
    .line 73
    :try_start_0
    invoke-virtual {v10, v6}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    add-int/lit8 v12, v6, 0x2

    .line 78
    .line 79
    invoke-virtual {v10, v12}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    add-int/lit8 v14, v6, 0x4

    .line 84
    .line 85
    invoke-virtual {v10, v14}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    invoke-interface {v8, v13}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 90
    .line 91
    .line 92
    move-result-object v13

    .line 93
    check-cast v13, Lcom/android/dx/rop/cst/CstString;

    .line 94
    .line 95
    invoke-interface {v8, v7}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    check-cast v7, Lcom/android/dx/rop/cst/CstString;

    .line 100
    .line 101
    iget-object v15, v1, Lcom/android/dx/cf/direct/MemberListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 102
    .line 103
    if-eqz v15, :cond_1

    .line 104
    .line 105
    move/from16 v17, v5

    .line 106
    .line 107
    invoke-virtual {v13}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    move-object/from16 v18, v8

    .line 112
    .line 113
    invoke-virtual {v7}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-interface {v15, v10, v6, v5, v8}, Lcom/android/dx/cf/iface/ParseObserver;->startParsingMember(Lcom/android/dx/util/ByteArray;ILjava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object v5, v1, Lcom/android/dx/cf/direct/MemberListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 121
    .line 122
    new-instance v8, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v15, "\n"

    .line 128
    .line 129
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/MemberListParser;->humanName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v15

    .line 136
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v15, "]:\n"

    .line 146
    .line 147
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    const/4 v15, 0x0

    .line 155
    invoke-interface {v5, v10, v6, v15, v8}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget-object v5, v1, Lcom/android/dx/cf/direct/MemberListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 159
    .line 160
    const/4 v8, 0x1

    .line 161
    invoke-interface {v5, v8}, Lcom/android/dx/cf/iface/ParseObserver;->changeIndent(I)V

    .line 162
    .line 163
    .line 164
    iget-object v5, v1, Lcom/android/dx/cf/direct/MemberListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 165
    .line 166
    new-instance v8, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    const-string v15, "access_flags: "

    .line 172
    .line 173
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v11}, Lcom/android/dx/cf/direct/MemberListParser;->humanAccessFlags(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v15

    .line 180
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    const/4 v15, 0x2

    .line 188
    invoke-interface {v5, v10, v6, v15, v8}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 189
    .line 190
    .line 191
    iget-object v5, v1, Lcom/android/dx/cf/direct/MemberListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 192
    .line 193
    new-instance v8, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    const-string v15, "name: "

    .line 199
    .line 200
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v13}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v15

    .line 207
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    const/4 v15, 0x2

    .line 215
    invoke-interface {v5, v10, v12, v15, v8}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 216
    .line 217
    .line 218
    iget-object v5, v1, Lcom/android/dx/cf/direct/MemberListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 219
    .line 220
    new-instance v8, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 223
    .line 224
    .line 225
    const-string v12, "descriptor: "

    .line 226
    .line 227
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v7}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    const/4 v15, 0x2

    .line 242
    invoke-interface {v5, v10, v14, v15, v8}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 243
    .line 244
    .line 245
    goto :goto_1

    .line 246
    :catch_0
    move-exception v0

    .line 247
    move v5, v9

    .line 248
    goto/16 :goto_3

    .line 249
    .line 250
    :catch_1
    move-exception v0

    .line 251
    move v5, v9

    .line 252
    goto/16 :goto_4

    .line 253
    .line 254
    :cond_1
    move/from16 v17, v5

    .line 255
    .line 256
    move-object/from16 v18, v8

    .line 257
    .line 258
    const/4 v15, 0x2

    .line 259
    :goto_1
    add-int/lit8 v6, v6, 0x6

    .line 260
    .line 261
    new-instance v5, Lcom/android/dx/cf/direct/AttributeListParser;

    .line 262
    .line 263
    iget-object v8, v1, Lcom/android/dx/cf/direct/MemberListParser;->cf:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 264
    .line 265
    iget-object v12, v1, Lcom/android/dx/cf/direct/MemberListParser;->attributeFactory:Lcom/android/dx/cf/direct/AttributeFactory;

    .line 266
    .line 267
    invoke-direct {v5, v8, v0, v6, v12}, Lcom/android/dx/cf/direct/AttributeListParser;-><init>(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/direct/AttributeFactory;)V

    .line 268
    .line 269
    .line 270
    iget-object v6, v1, Lcom/android/dx/cf/direct/MemberListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 271
    .line 272
    invoke-virtual {v5, v6}, Lcom/android/dx/cf/direct/AttributeListParser;->setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v5}, Lcom/android/dx/cf/direct/AttributeListParser;->getEndOffset()I

    .line 276
    .line 277
    .line 278
    move-result v6

    .line 279
    invoke-virtual {v5}, Lcom/android/dx/cf/direct/AttributeListParser;->getList()Lcom/android/dx/cf/iface/StdAttributeList;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-virtual {v5}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 284
    .line 285
    .line 286
    new-instance v8, Lcom/android/dx/rop/cst/CstNat;

    .line 287
    .line 288
    invoke-direct {v8, v13, v7}, Lcom/android/dx/rop/cst/CstNat;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1, v9, v11, v8, v5}, Lcom/android/dx/cf/direct/MemberListParser;->set(IILcom/android/dx/rop/cst/CstNat;Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/cf/iface/Member;

    .line 292
    .line 293
    .line 294
    move-result-object v14

    .line 295
    iget-object v5, v1, Lcom/android/dx/cf/direct/MemberListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 296
    .line 297
    if-eqz v5, :cond_2

    .line 298
    .line 299
    const/4 v8, -0x1

    .line 300
    invoke-interface {v5, v8}, Lcom/android/dx/cf/iface/ParseObserver;->changeIndent(I)V

    .line 301
    .line 302
    .line 303
    iget-object v5, v1, Lcom/android/dx/cf/direct/MemberListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 304
    .line 305
    new-instance v8, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 308
    .line 309
    .line 310
    const-string v11, "end "

    .line 311
    .line 312
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/MemberListParser;->humanName()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v11

    .line 319
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    const-string v11, "]\n"

    .line 329
    .line 330
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    const/4 v11, 0x0

    .line 338
    invoke-interface {v5, v10, v6, v11, v8}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V
    :try_end_0
    .catch Lcom/android/dx/cf/iface/ParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 339
    .line 340
    .line 341
    move v5, v9

    .line 342
    :try_start_1
    iget-object v9, v1, Lcom/android/dx/cf/direct/MemberListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 343
    .line 344
    invoke-virtual {v13}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v12

    .line 348
    invoke-virtual {v7}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v13

    .line 352
    move/from16 v16, v11

    .line 353
    .line 354
    move v11, v6

    .line 355
    invoke-interface/range {v9 .. v14}, Lcom/android/dx/cf/iface/ParseObserver;->endParsingMember(Lcom/android/dx/util/ByteArray;ILjava/lang/String;Ljava/lang/String;Lcom/android/dx/cf/iface/Member;)V
    :try_end_1
    .catch Lcom/android/dx/cf/iface/ParseException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 356
    .line 357
    .line 358
    goto :goto_2

    .line 359
    :catch_2
    move-exception v0

    .line 360
    goto :goto_3

    .line 361
    :catch_3
    move-exception v0

    .line 362
    goto :goto_4

    .line 363
    :cond_2
    move v11, v6

    .line 364
    move v5, v9

    .line 365
    const/16 v16, 0x0

    .line 366
    .line 367
    :goto_2
    add-int/lit8 v9, v5, 0x1

    .line 368
    .line 369
    move v6, v11

    .line 370
    move v7, v15

    .line 371
    move/from16 v5, v17

    .line 372
    .line 373
    move-object/from16 v8, v18

    .line 374
    .line 375
    goto/16 :goto_0

    .line 376
    .line 377
    :goto_3
    new-instance v6, Lcom/android/dx/cf/iface/ParseException;

    .line 378
    .line 379
    invoke-direct {v6, v0}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/Throwable;)V

    .line 380
    .line 381
    .line 382
    new-instance v0, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/MemberListParser;->humanName()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-virtual {v6, v0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v6

    .line 411
    :goto_4
    new-instance v6, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/MemberListParser;->humanName()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    throw v0

    .line 440
    :cond_3
    iput v6, v1, Lcom/android/dx/cf/direct/MemberListParser;->endOffset:I

    .line 441
    .line 442
    return-void
.end method


# virtual methods
.method public abstract getAttributeContext()I
.end method

.method public final getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/direct/MemberListParser;->cf:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget p0, p0, Lcom/android/dx/cf/direct/MemberListParser;->offset:I

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final getDefiner()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/direct/MemberListParser;->definer:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEndOffset()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/MemberListParser;->parseIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget p0, p0, Lcom/android/dx/cf/direct/MemberListParser;->endOffset:I

    .line 5
    .line 6
    return p0
.end method

.method public abstract humanAccessFlags(I)Ljava/lang/String;
.end method

.method public abstract humanName()Ljava/lang/String;
.end method

.method public final parseIfNecessary()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/cf/direct/MemberListParser;->endOffset:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/android/dx/cf/direct/MemberListParser;->parse()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public abstract set(IILcom/android/dx/rop/cst/CstNat;Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/cf/iface/Member;
.end method

.method public final setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/direct/MemberListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 2
    .line 3
    return-void
.end method
