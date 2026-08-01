.class public Lcom/android/dx/cf/direct/StdAttributeFactory;
.super Lcom/android/dx/cf/direct/AttributeFactory;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final THE_ONE:Lcom/android/dx/cf/direct/StdAttributeFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/cf/direct/StdAttributeFactory;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/cf/direct/StdAttributeFactory;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/android/dx/cf/direct/StdAttributeFactory;->THE_ONE:Lcom/android/dx/cf/direct/StdAttributeFactory;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AttributeFactory;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private annotationDefault(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    if-ge p3, p0, :cond_0

    .line 3
    .line 4
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwSeverelyTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    :cond_0
    new-instance p0, Lcom/android/dx/cf/direct/AnnotationParser;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/cf/direct/AnnotationParser;-><init>(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/AnnotationParser;->parseValueAttribute()Lcom/android/dx/rop/cst/Constant;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance p1, Lcom/android/dx/cf/attrib/AttAnnotationDefault;

    .line 17
    .line 18
    invoke-direct {p1, p0, p3}, Lcom/android/dx/cf/attrib/AttAnnotationDefault;-><init>(Lcom/android/dx/rop/cst/Constant;I)V

    .line 19
    .line 20
    .line 21
    return-object p1
.end method

.method private bootstrapMethods(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ge p3, v0, :cond_0

    .line 3
    .line 4
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwSeverelyTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz p4, :cond_1

    .line 18
    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v3, "num_boostrap_methods: "

    .line 22
    .line 23
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v4}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {p4, v1, p2, v0, v2}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    add-int/lit8 v5, p2, 0x2

    .line 34
    .line 35
    add-int/lit8 v6, p3, -0x2

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getThisClass()Lcom/android/dx/rop/cst/CstType;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    move-object v0, p0

    .line 46
    move-object v7, p4

    .line 47
    invoke-direct/range {v0 .. v7}, Lcom/android/dx/cf/direct/StdAttributeFactory;->parseBootstrapMethods(Lcom/android/dx/util/ByteArray;Lcom/android/dx/rop/cst/ConstantPool;Lcom/android/dx/rop/cst/CstType;IIILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/code/BootstrapMethodsList;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-instance p1, Lcom/android/dx/cf/attrib/AttBootstrapMethods;

    .line 52
    .line 53
    invoke-direct {p1, p0}, Lcom/android/dx/cf/attrib/AttBootstrapMethods;-><init>(Lcom/android/dx/cf/code/BootstrapMethodsList;)V

    .line 54
    .line 55
    .line 56
    return-object p1
.end method

.method private code(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 18

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const/16 v3, 0xc

    .line 8
    .line 9
    if-ge v1, v3, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwSeverelyTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v3, v0}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    add-int/lit8 v5, v0, 0x2

    .line 29
    .line 30
    invoke-virtual {v3, v5}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    add-int/lit8 v8, v0, 0x4

    .line 35
    .line 36
    invoke-virtual {v3, v8}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    const/4 v10, 0x2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    new-instance v11, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v12, "max_stack: "

    .line 46
    .line 47
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v11, v6}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    invoke-interface {v2, v3, v0, v10, v11}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v11, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v12, "max_locals: "

    .line 60
    .line 61
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v11, v7}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    invoke-interface {v2, v3, v5, v10, v11}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v5, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v11, "code_length: "

    .line 74
    .line 75
    invoke-direct {v5, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v9}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    const/4 v11, 0x4

    .line 90
    invoke-interface {v2, v3, v8, v11, v5}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    add-int/lit8 v5, v0, 0x8

    .line 94
    .line 95
    add-int/lit8 v1, v1, -0x8

    .line 96
    .line 97
    add-int/lit8 v8, v9, 0x4

    .line 98
    .line 99
    if-ge v1, v8, :cond_2

    .line 100
    .line 101
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0

    .line 106
    :cond_2
    add-int v8, v5, v9

    .line 107
    .line 108
    sub-int/2addr v1, v9

    .line 109
    new-instance v9, Lcom/android/dx/cf/code/BytecodeArray;

    .line 110
    .line 111
    invoke-virtual {v3, v5, v8}, Lcom/android/dx/util/ByteArray;->slice(II)Lcom/android/dx/util/ByteArray;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-direct {v9, v5, v4}, Lcom/android/dx/cf/code/BytecodeArray;-><init>(Lcom/android/dx/util/ByteArray;Lcom/android/dx/rop/cst/ConstantPool;)V

    .line 116
    .line 117
    .line 118
    if-eqz v2, :cond_3

    .line 119
    .line 120
    new-instance v5, Lcom/android/dx/cf/direct/CodeObserver;

    .line 121
    .line 122
    invoke-virtual {v9}, Lcom/android/dx/cf/code/BytecodeArray;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    invoke-direct {v5, v11, v2}, Lcom/android/dx/cf/direct/CodeObserver;-><init>(Lcom/android/dx/util/ByteArray;Lcom/android/dx/cf/iface/ParseObserver;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v9, v5}, Lcom/android/dx/cf/code/BytecodeArray;->forEach(Lcom/android/dx/cf/code/BytecodeArray$Visitor;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    invoke-virtual {v3, v8}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-nez v5, :cond_4

    .line 137
    .line 138
    sget-object v11, Lcom/android/dx/cf/code/ByteCatchList;->EMPTY:Lcom/android/dx/cf/code/ByteCatchList;

    .line 139
    .line 140
    :goto_0
    move-object v12, v11

    .line 141
    goto :goto_1

    .line 142
    :cond_4
    new-instance v11, Lcom/android/dx/cf/code/ByteCatchList;

    .line 143
    .line 144
    invoke-direct {v11, v5}, Lcom/android/dx/cf/code/ByteCatchList;-><init>(I)V

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :goto_1
    if-eqz v2, :cond_5

    .line 149
    .line 150
    new-instance v11, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    const-string v13, "exception_table_length: "

    .line 153
    .line 154
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v11, v5}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-interface {v2, v3, v8, v10, v11}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_5
    add-int/2addr v8, v10

    .line 165
    add-int/lit8 v1, v1, -0x2

    .line 166
    .line 167
    mul-int/lit8 v11, v5, 0x8

    .line 168
    .line 169
    add-int/2addr v11, v10

    .line 170
    if-ge v1, v11, :cond_6

    .line 171
    .line 172
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    return-object v0

    .line 177
    :cond_6
    const/4 v10, 0x0

    .line 178
    move v13, v10

    .line 179
    :goto_2
    if-ge v13, v5, :cond_b

    .line 180
    .line 181
    if-eqz v2, :cond_7

    .line 182
    .line 183
    const/4 v10, 0x1

    .line 184
    invoke-interface {v2, v10}, Lcom/android/dx/cf/iface/ParseObserver;->changeIndent(I)V

    .line 185
    .line 186
    .line 187
    :cond_7
    invoke-virtual {v3, v8}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 188
    .line 189
    .line 190
    move-result v14

    .line 191
    add-int/lit8 v10, v8, 0x2

    .line 192
    .line 193
    invoke-virtual {v3, v10}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 194
    .line 195
    .line 196
    move-result v15

    .line 197
    add-int/lit8 v10, v8, 0x4

    .line 198
    .line 199
    invoke-virtual {v3, v10}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 200
    .line 201
    .line 202
    move-result v16

    .line 203
    add-int/lit8 v10, v8, 0x6

    .line 204
    .line 205
    invoke-virtual {v3, v10}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    invoke-interface {v4, v10}, Lcom/android/dx/rop/cst/ConstantPool;->get0Ok(I)Lcom/android/dx/rop/cst/Constant;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    move-object/from16 v17, v10

    .line 214
    .line 215
    check-cast v17, Lcom/android/dx/rop/cst/CstType;

    .line 216
    .line 217
    invoke-virtual/range {v12 .. v17}, Lcom/android/dx/cf/code/ByteCatchList;->set(IIIILcom/android/dx/rop/cst/CstType;)V

    .line 218
    .line 219
    .line 220
    if-eqz v2, :cond_9

    .line 221
    .line 222
    new-instance v10, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-static {v14}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v11

    .line 231
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v11, ".."

    .line 235
    .line 236
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-static {v15}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v11

    .line 243
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    const-string v11, " -> "

    .line 247
    .line 248
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-static/range {v16 .. v16}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    const-string v11, " "

    .line 259
    .line 260
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    if-nez v17, :cond_8

    .line 264
    .line 265
    const-string v11, "<any>"

    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_8
    invoke-virtual/range {v17 .. v17}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v11

    .line 272
    :goto_3
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v10

    .line 279
    const/16 v11, 0x8

    .line 280
    .line 281
    invoke-interface {v2, v3, v8, v11, v10}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 282
    .line 283
    .line 284
    :cond_9
    add-int/lit8 v8, v8, 0x8

    .line 285
    .line 286
    add-int/lit8 v1, v1, -0x8

    .line 287
    .line 288
    if-eqz v2, :cond_a

    .line 289
    .line 290
    const/4 v10, -0x1

    .line 291
    invoke-interface {v2, v10}, Lcom/android/dx/cf/iface/ParseObserver;->changeIndent(I)V

    .line 292
    .line 293
    .line 294
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 295
    .line 296
    goto :goto_2

    .line 297
    :cond_b
    invoke-virtual {v12}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 298
    .line 299
    .line 300
    new-instance v3, Lcom/android/dx/cf/direct/AttributeListParser;

    .line 301
    .line 302
    const/4 v4, 0x3

    .line 303
    move-object/from16 v5, p0

    .line 304
    .line 305
    move-object/from16 v10, p1

    .line 306
    .line 307
    invoke-direct {v3, v10, v4, v8, v5}, Lcom/android/dx/cf/direct/AttributeListParser;-><init>(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/direct/AttributeFactory;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3, v2}, Lcom/android/dx/cf/direct/AttributeListParser;->setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3}, Lcom/android/dx/cf/direct/AttributeListParser;->getList()Lcom/android/dx/cf/iface/StdAttributeList;

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    invoke-virtual {v10}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3}, Lcom/android/dx/cf/direct/AttributeListParser;->getEndOffset()I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    sub-int/2addr v2, v8

    .line 325
    if-eq v2, v1, :cond_c

    .line 326
    .line 327
    sub-int/2addr v8, v0

    .line 328
    add-int/2addr v8, v2

    .line 329
    invoke-static {v8}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwBadLength(I)Lcom/android/dx/cf/iface/Attribute;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    return-object v0

    .line 334
    :cond_c
    new-instance v5, Lcom/android/dx/cf/attrib/AttCode;

    .line 335
    .line 336
    move-object v8, v9

    .line 337
    move-object v9, v12

    .line 338
    invoke-direct/range {v5 .. v10}, Lcom/android/dx/cf/attrib/AttCode;-><init>(IILcom/android/dx/cf/code/BytecodeArray;Lcom/android/dx/cf/code/ByteCatchList;Lcom/android/dx/cf/iface/AttributeList;)V

    .line 339
    .line 340
    .line 341
    return-object v5
.end method

.method private constantValue(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 3

    .line 1
    const/4 p0, 0x2

    .line 2
    if-eq p3, p0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwBadLength(I)Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p3, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-interface {p1, v0}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/android/dx/rop/cst/TypedConstant;

    .line 26
    .line 27
    new-instance v0, Lcom/android/dx/cf/attrib/AttConstantValue;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Lcom/android/dx/cf/attrib/AttConstantValue;-><init>(Lcom/android/dx/rop/cst/TypedConstant;)V

    .line 30
    .line 31
    .line 32
    if-eqz p4, :cond_1

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v2, "value: "

    .line 37
    .line 38
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p4, p3, p2, p0, p1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-object v0
.end method

.method private deprecated(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    invoke-static {p0}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwBadLength(I)Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance p0, Lcom/android/dx/cf/attrib/AttDeprecated;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/android/dx/cf/attrib/AttDeprecated;-><init>()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method private enclosingMethod(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 4

    .line 1
    const/4 p0, 0x4

    .line 2
    if-eq p3, p0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwBadLength(I)Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    invoke-interface {p1, p3}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    check-cast p3, Lcom/android/dx/rop/cst/CstType;

    .line 24
    .line 25
    add-int/lit8 v0, p2, 0x2

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-interface {p1, v1}, Lcom/android/dx/rop/cst/ConstantPool;->get0Ok(I)Lcom/android/dx/rop/cst/Constant;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/android/dx/rop/cst/CstNat;

    .line 36
    .line 37
    new-instance v1, Lcom/android/dx/cf/attrib/AttEnclosingMethod;

    .line 38
    .line 39
    invoke-direct {v1, p3, p1}, Lcom/android/dx/cf/attrib/AttEnclosingMethod;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 40
    .line 41
    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "class: "

    .line 47
    .line 48
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    const/4 v2, 0x2

    .line 59
    invoke-interface {p4, p0, p2, v2, p3}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance p2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string p3, "method: "

    .line 65
    .line 66
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->stringOrNone(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {p4, p0, v0, v2, p1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    return-object v1
.end method

.method private exceptions(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 4

    .line 1
    const/4 p0, 0x2

    .line 2
    if-ge p3, p0, :cond_0

    .line 3
    .line 4
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwSeverelyTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz p4, :cond_1

    .line 18
    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v3, "number_of_exceptions: "

    .line 22
    .line 23
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {p4, v0, p2, p0, v2}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    add-int/2addr p2, p0

    .line 34
    add-int/lit8 p3, p3, -0x2

    .line 35
    .line 36
    mul-int/lit8 p4, v1, 0x2

    .line 37
    .line 38
    if-eq p3, p4, :cond_2

    .line 39
    .line 40
    add-int/2addr p4, p0

    .line 41
    invoke-static {p4}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwBadLength(I)Lcom/android/dx/cf/iface/Attribute;

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-virtual {p1, p2, v1}, Lcom/android/dx/cf/direct/DirectClassFile;->makeTypeList(II)Lcom/android/dx/rop/type/TypeList;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance p1, Lcom/android/dx/cf/attrib/AttExceptions;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lcom/android/dx/cf/attrib/AttExceptions;-><init>(Lcom/android/dx/rop/type/TypeList;)V

    .line 51
    .line 52
    .line 53
    return-object p1
.end method

.method private innerClasses(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 16

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    if-ge v1, v3, :cond_0

    .line 9
    .line 10
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwSeverelyTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-virtual {v4, v0}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    new-instance v7, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v8, "number_of_classes: "

    .line 32
    .line 33
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v7, v6}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-interface {v2, v4, v0, v3, v7}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    add-int/2addr v0, v3

    .line 44
    add-int/lit8 v1, v1, -0x2

    .line 45
    .line 46
    mul-int/lit8 v7, v6, 0x8

    .line 47
    .line 48
    if-eq v1, v7, :cond_2

    .line 49
    .line 50
    add-int/2addr v7, v3

    .line 51
    invoke-static {v7}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwBadLength(I)Lcom/android/dx/cf/iface/Attribute;

    .line 52
    .line 53
    .line 54
    :cond_2
    new-instance v8, Lcom/android/dx/cf/attrib/InnerClassList;

    .line 55
    .line 56
    invoke-direct {v8, v6}, Lcom/android/dx/cf/attrib/InnerClassList;-><init>(I)V

    .line 57
    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    move v9, v1

    .line 61
    :goto_0
    if-ge v9, v6, :cond_4

    .line 62
    .line 63
    invoke-virtual {v4, v0}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/lit8 v7, v0, 0x2

    .line 68
    .line 69
    invoke-virtual {v4, v7}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    add-int/lit8 v14, v0, 0x4

    .line 74
    .line 75
    invoke-virtual {v4, v14}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    add-int/lit8 v15, v0, 0x6

    .line 80
    .line 81
    invoke-virtual {v4, v15}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    invoke-interface {v5, v1}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Lcom/android/dx/rop/cst/CstType;

    .line 90
    .line 91
    invoke-interface {v5, v10}, Lcom/android/dx/rop/cst/ConstantPool;->get0Ok(I)Lcom/android/dx/rop/cst/Constant;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    check-cast v10, Lcom/android/dx/rop/cst/CstType;

    .line 96
    .line 97
    invoke-interface {v5, v11}, Lcom/android/dx/rop/cst/ConstantPool;->get0Ok(I)Lcom/android/dx/rop/cst/Constant;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    move-object v12, v11

    .line 102
    check-cast v12, Lcom/android/dx/rop/cst/CstString;

    .line 103
    .line 104
    move-object v11, v10

    .line 105
    move-object v10, v1

    .line 106
    invoke-virtual/range {v8 .. v13}, Lcom/android/dx/cf/attrib/InnerClassList;->set(ILcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstString;I)V

    .line 107
    .line 108
    .line 109
    if-eqz v2, :cond_3

    .line 110
    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v3, "inner_class: "

    .line 114
    .line 115
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v10}, Lcom/android/dx/cf/direct/DirectClassFile;->stringOrNone(Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    const/4 v3, 0x2

    .line 130
    invoke-interface {v2, v4, v0, v3, v1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    new-instance v1, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v10, "  outer_class: "

    .line 136
    .line 137
    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v11}, Lcom/android/dx/cf/direct/DirectClassFile;->stringOrNone(Ljava/lang/Object;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-interface {v2, v4, v7, v3, v1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 152
    .line 153
    .line 154
    new-instance v1, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string v7, "  name: "

    .line 157
    .line 158
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v12}, Lcom/android/dx/cf/direct/DirectClassFile;->stringOrNone(Ljava/lang/Object;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-interface {v2, v4, v14, v3, v1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 173
    .line 174
    .line 175
    new-instance v1, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v7, "  access_flags: "

    .line 178
    .line 179
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v13}, Lcom/android/dx/rop/code/AccessFlags;->innerClassString(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-interface {v2, v4, v15, v3, v1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :cond_3
    add-int/lit8 v0, v0, 0x8

    .line 197
    .line 198
    add-int/lit8 v9, v9, 0x1

    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_4
    invoke-virtual {v8}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 203
    .line 204
    .line 205
    new-instance v0, Lcom/android/dx/cf/attrib/AttInnerClasses;

    .line 206
    .line 207
    invoke-direct {v0, v8}, Lcom/android/dx/cf/attrib/AttInnerClasses;-><init>(Lcom/android/dx/cf/attrib/InnerClassList;)V

    .line 208
    .line 209
    .line 210
    return-object v0
.end method

.method private lineNumberTable(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 4

    .line 1
    const/4 p0, 0x2

    .line 2
    if-ge p3, p0, :cond_0

    .line 3
    .line 4
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwSeverelyTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz p4, :cond_1

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "line_number_table_length: "

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {p4, p1, p2, p0, v1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    add-int/2addr p2, p0

    .line 34
    add-int/lit8 p3, p3, -0x2

    .line 35
    .line 36
    mul-int/lit8 v1, v0, 0x4

    .line 37
    .line 38
    if-eq p3, v1, :cond_2

    .line 39
    .line 40
    add-int/2addr v1, p0

    .line 41
    invoke-static {v1}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwBadLength(I)Lcom/android/dx/cf/iface/Attribute;

    .line 42
    .line 43
    .line 44
    :cond_2
    new-instance p0, Lcom/android/dx/cf/code/LineNumberList;

    .line 45
    .line 46
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/LineNumberList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    const/4 p3, 0x0

    .line 50
    :goto_0
    if-ge p3, v0, :cond_4

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/lit8 v2, p2, 0x2

    .line 57
    .line 58
    invoke-virtual {p1, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {p0, p3, v1, v2}, Lcom/android/dx/cf/code/LineNumberList;->set(III)V

    .line 63
    .line 64
    .line 65
    if-eqz p4, :cond_3

    .line 66
    .line 67
    new-instance v3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, " "

    .line 80
    .line 81
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const/4 v2, 0x4

    .line 92
    invoke-interface {p4, p1, p2, v2, v1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    add-int/lit8 p2, p2, 0x4

    .line 96
    .line 97
    add-int/lit8 p3, p3, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 101
    .line 102
    .line 103
    new-instance p1, Lcom/android/dx/cf/attrib/AttLineNumberTable;

    .line 104
    .line 105
    invoke-direct {p1, p0}, Lcom/android/dx/cf/attrib/AttLineNumberTable;-><init>(Lcom/android/dx/cf/code/LineNumberList;)V

    .line 106
    .line 107
    .line 108
    return-object p1
.end method

.method private localVariableTable(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ge p3, v0, :cond_0

    .line 3
    .line 4
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwSeverelyTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    if-eqz p4, :cond_1

    .line 18
    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v3, "local_variable_table_length: "

    .line 22
    .line 23
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v6}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {p4, v1, p2, v0, v2}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    add-int/lit8 v0, p2, 0x2

    .line 34
    .line 35
    add-int/2addr p2, p3

    .line 36
    invoke-virtual {v1, v0, p2}, Lcom/android/dx/util/ByteArray;->slice(II)Lcom/android/dx/util/ByteArray;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v7, 0x0

    .line 45
    move-object v2, p0

    .line 46
    move-object v5, p4

    .line 47
    invoke-direct/range {v2 .. v7}, Lcom/android/dx/cf/direct/StdAttributeFactory;->parseLocalVariables(Lcom/android/dx/util/ByteArray;Lcom/android/dx/rop/cst/ConstantPool;Lcom/android/dx/cf/iface/ParseObserver;IZ)Lcom/android/dx/cf/code/LocalVariableList;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-instance p1, Lcom/android/dx/cf/attrib/AttLocalVariableTable;

    .line 52
    .line 53
    invoke-direct {p1, p0}, Lcom/android/dx/cf/attrib/AttLocalVariableTable;-><init>(Lcom/android/dx/cf/code/LocalVariableList;)V

    .line 54
    .line 55
    .line 56
    return-object p1
.end method

.method private localVariableTypeTable(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ge p3, v0, :cond_0

    .line 3
    .line 4
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwSeverelyTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    if-eqz p4, :cond_1

    .line 18
    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v3, "local_variable_type_table_length: "

    .line 22
    .line 23
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v6}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {p4, v1, p2, v0, v2}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    add-int/lit8 v0, p2, 0x2

    .line 34
    .line 35
    add-int/2addr p2, p3

    .line 36
    invoke-virtual {v1, v0, p2}, Lcom/android/dx/util/ByteArray;->slice(II)Lcom/android/dx/util/ByteArray;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v7, 0x1

    .line 45
    move-object v2, p0

    .line 46
    move-object v5, p4

    .line 47
    invoke-direct/range {v2 .. v7}, Lcom/android/dx/cf/direct/StdAttributeFactory;->parseLocalVariables(Lcom/android/dx/util/ByteArray;Lcom/android/dx/rop/cst/ConstantPool;Lcom/android/dx/cf/iface/ParseObserver;IZ)Lcom/android/dx/cf/code/LocalVariableList;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-instance p1, Lcom/android/dx/cf/attrib/AttLocalVariableTypeTable;

    .line 52
    .line 53
    invoke-direct {p1, p0}, Lcom/android/dx/cf/attrib/AttLocalVariableTypeTable;-><init>(Lcom/android/dx/cf/code/LocalVariableList;)V

    .line 54
    .line 55
    .line 56
    return-object p1
.end method

.method private parseBootstrapMethods(Lcom/android/dx/util/ByteArray;Lcom/android/dx/rop/cst/ConstantPool;Lcom/android/dx/rop/cst/CstType;IIILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/code/BootstrapMethodsList;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p7

    .line 8
    .line 9
    new-instance v4, Lcom/android/dx/cf/code/BootstrapMethodsList;

    .line 10
    .line 11
    invoke-direct {v4, v2}, Lcom/android/dx/cf/code/BootstrapMethodsList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    move/from16 v6, p5

    .line 15
    .line 16
    move/from16 v7, p6

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    :goto_0
    if-ge v8, v2, :cond_5

    .line 20
    .line 21
    const/4 v9, 0x4

    .line 22
    if-ge v7, v9, :cond_0

    .line 23
    .line 24
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0, v6}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 28
    .line 29
    .line 30
    move-result v9

    .line 31
    add-int/lit8 v10, v6, 0x2

    .line 32
    .line 33
    invoke-virtual {v0, v10}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 34
    .line 35
    .line 36
    move-result v11

    .line 37
    const/4 v12, 0x2

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    new-instance v13, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v14, "bootstrap_method_ref: "

    .line 43
    .line 44
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v13, v9}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v13

    .line 51
    invoke-interface {v3, v0, v6, v12, v13}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v13, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v14, "num_bootstrap_arguments: "

    .line 57
    .line 58
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v13, v11}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    invoke-interface {v3, v0, v10, v12, v13}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    add-int/lit8 v6, v6, 0x4

    .line 69
    .line 70
    add-int/lit8 v7, v7, -0x4

    .line 71
    .line 72
    mul-int/lit8 v10, v11, 0x2

    .line 73
    .line 74
    if-ge v7, v10, :cond_2

    .line 75
    .line 76
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 77
    .line 78
    .line 79
    :cond_2
    new-instance v10, Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;

    .line 80
    .line 81
    invoke-direct {v10, v11}, Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    :goto_1
    if-ge v13, v11, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0, v6}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 88
    .line 89
    .line 90
    move-result v14

    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    const-string v15, "bootstrap_arguments["

    .line 94
    .line 95
    const-string v5, "]"

    .line 96
    .line 97
    invoke-static {v13, v15, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-static {v5, v14}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-interface {v3, v0, v6, v12, v5}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    invoke-interface {v1, v14}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v10, v13, v5}, Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;->set(ILcom/android/dx/rop/cst/Constant;)V

    .line 113
    .line 114
    .line 115
    add-int/lit8 v13, v13, 0x1

    .line 116
    .line 117
    add-int/lit8 v6, v6, 0x2

    .line 118
    .line 119
    add-int/lit8 v7, v7, -0x2

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    invoke-virtual {v10}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v1, v9}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    check-cast v5, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 130
    .line 131
    move-object/from16 v9, p3

    .line 132
    .line 133
    invoke-virtual {v4, v8, v9, v5, v10}, Lcom/android/dx/cf/code/BootstrapMethodsList;->set(ILcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstMethodHandle;Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;)V

    .line 134
    .line 135
    .line 136
    add-int/lit8 v8, v8, 0x1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_5
    invoke-virtual {v4}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 140
    .line 141
    .line 142
    if-eqz v7, :cond_6

    .line 143
    .line 144
    invoke-static {v7}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwBadLength(I)Lcom/android/dx/cf/iface/Attribute;

    .line 145
    .line 146
    .line 147
    :cond_6
    return-object v4
.end method

.method private parseLocalVariables(Lcom/android/dx/util/ByteArray;Lcom/android/dx/rop/cst/ConstantPool;Lcom/android/dx/cf/iface/ParseObserver;IZ)Lcom/android/dx/cf/code/LocalVariableList;
    .locals 16

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    const-string v3, " "

    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/util/ByteArray;->size()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    mul-int/lit8 v5, v2, 0xa

    .line 14
    .line 15
    if-eq v4, v5, :cond_0

    .line 16
    .line 17
    add-int/lit8 v5, v5, 0x2

    .line 18
    .line 19
    invoke-static {v5}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwBadLength(I)Lcom/android/dx/cf/iface/Attribute;

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/util/ByteArray;->makeDataInputStream()Lcom/android/dx/util/ByteArray$MyDataInputStream;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    new-instance v5, Lcom/android/dx/cf/code/LocalVariableList;

    .line 27
    .line 28
    invoke-direct {v5, v2}, Lcom/android/dx/cf/code/LocalVariableList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    :goto_0
    if-ge v6, v2, :cond_3

    .line 33
    .line 34
    const/4 v13, 0x0

    .line 35
    :try_start_0
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 52
    .line 53
    .line 54
    move-result v12

    .line 55
    invoke-interface {v0, v9}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    check-cast v9, Lcom/android/dx/rop/cst/CstString;

    .line 60
    .line 61
    invoke-interface {v0, v10}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    move-object v14, v10

    .line 66
    check-cast v14, Lcom/android/dx/rop/cst/CstString;

    .line 67
    .line 68
    if-eqz p5, :cond_1

    .line 69
    .line 70
    move-object v10, v13

    .line 71
    move-object v11, v14

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move-object v11, v13

    .line 74
    move-object v10, v14

    .line 75
    :goto_1
    invoke-virtual/range {v5 .. v12}, Lcom/android/dx/cf/code/LocalVariableList;->set(IIILcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;I)V

    .line 76
    .line 77
    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    mul-int/lit8 v10, v6, 0xa

    .line 81
    .line 82
    new-instance v11, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-static {v7}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v15

    .line 91
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v15, ".."

    .line 95
    .line 96
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    add-int/2addr v7, v8

    .line 100
    invoke-static {v7}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-static {v12}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v14}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    const/16 v8, 0xa

    .line 142
    .line 143
    move-object/from16 v9, p1

    .line 144
    .line 145
    invoke-interface {v1, v9, v10, v8, v7}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :catch_0
    move-exception v0

    .line 150
    goto :goto_3

    .line 151
    :cond_2
    move-object/from16 v9, p1

    .line 152
    .line 153
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :goto_3
    const-string v1, "shouldn\'t happen"

    .line 157
    .line 158
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    return-object v13

    .line 162
    :cond_3
    invoke-virtual {v5}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 163
    .line 164
    .line 165
    return-object v5
.end method

.method private runtimeInvisibleAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    if-ge p3, p0, :cond_0

    .line 3
    .line 4
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwSeverelyTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    :cond_0
    new-instance p0, Lcom/android/dx/cf/direct/AnnotationParser;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/cf/direct/AnnotationParser;-><init>(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, Lcom/android/dx/rop/annotation/AnnotationVisibility;->BUILD:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/android/dx/cf/direct/AnnotationParser;->parseAnnotationAttribute(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/Annotations;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance p1, Lcom/android/dx/cf/attrib/AttRuntimeInvisibleAnnotations;

    .line 19
    .line 20
    invoke-direct {p1, p0, p3}, Lcom/android/dx/cf/attrib/AttRuntimeInvisibleAnnotations;-><init>(Lcom/android/dx/rop/annotation/Annotations;I)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method private runtimeInvisibleParameterAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    if-ge p3, p0, :cond_0

    .line 3
    .line 4
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwSeverelyTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    :cond_0
    new-instance p0, Lcom/android/dx/cf/direct/AnnotationParser;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/cf/direct/AnnotationParser;-><init>(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, Lcom/android/dx/rop/annotation/AnnotationVisibility;->BUILD:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/android/dx/cf/direct/AnnotationParser;->parseParameterAttribute(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance p1, Lcom/android/dx/cf/attrib/AttRuntimeInvisibleParameterAnnotations;

    .line 19
    .line 20
    invoke-direct {p1, p0, p3}, Lcom/android/dx/cf/attrib/AttRuntimeInvisibleParameterAnnotations;-><init>(Lcom/android/dx/rop/annotation/AnnotationsList;I)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method private runtimeVisibleAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    if-ge p3, p0, :cond_0

    .line 3
    .line 4
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwSeverelyTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    :cond_0
    new-instance p0, Lcom/android/dx/cf/direct/AnnotationParser;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/cf/direct/AnnotationParser;-><init>(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, Lcom/android/dx/rop/annotation/AnnotationVisibility;->RUNTIME:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/android/dx/cf/direct/AnnotationParser;->parseAnnotationAttribute(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/Annotations;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance p1, Lcom/android/dx/cf/attrib/AttRuntimeVisibleAnnotations;

    .line 19
    .line 20
    invoke-direct {p1, p0, p3}, Lcom/android/dx/cf/attrib/AttRuntimeVisibleAnnotations;-><init>(Lcom/android/dx/rop/annotation/Annotations;I)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method private runtimeVisibleParameterAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    if-ge p3, p0, :cond_0

    .line 3
    .line 4
    invoke-static {}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwSeverelyTruncated()Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    :cond_0
    new-instance p0, Lcom/android/dx/cf/direct/AnnotationParser;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/cf/direct/AnnotationParser;-><init>(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, Lcom/android/dx/rop/annotation/AnnotationVisibility;->RUNTIME:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/android/dx/cf/direct/AnnotationParser;->parseParameterAttribute(Lcom/android/dx/rop/annotation/AnnotationVisibility;)Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance p1, Lcom/android/dx/cf/attrib/AttRuntimeVisibleParameterAnnotations;

    .line 19
    .line 20
    invoke-direct {p1, p0, p3}, Lcom/android/dx/cf/attrib/AttRuntimeVisibleParameterAnnotations;-><init>(Lcom/android/dx/rop/annotation/AnnotationsList;I)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method private signature(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 3

    .line 1
    const/4 p0, 0x2

    .line 2
    if-eq p3, p0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwBadLength(I)Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p3, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-interface {p1, v0}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/android/dx/rop/cst/CstString;

    .line 24
    .line 25
    new-instance v0, Lcom/android/dx/cf/attrib/AttSignature;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lcom/android/dx/cf/attrib/AttSignature;-><init>(Lcom/android/dx/rop/cst/CstString;)V

    .line 28
    .line 29
    .line 30
    if-eqz p4, :cond_1

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v2, "signature: "

    .line 35
    .line 36
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p4, p3, p2, p0, p1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-object v0
.end method

.method private sourceDebugExtension(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    add-int p1, p2, p3

    .line 6
    .line 7
    invoke-virtual {p0, p2, p1}, Lcom/android/dx/util/ByteArray;->slice(II)Lcom/android/dx/util/ByteArray;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance p1, Lcom/android/dx/rop/cst/CstString;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lcom/android/dx/rop/cst/CstString;-><init>(Lcom/android/dx/util/ByteArray;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/android/dx/cf/attrib/AttSourceDebugExtension;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lcom/android/dx/cf/attrib/AttSourceDebugExtension;-><init>(Lcom/android/dx/rop/cst/CstString;)V

    .line 19
    .line 20
    .line 21
    if-eqz p4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v1, "sourceDebugExtension: "

    .line 28
    .line 29
    invoke-static {v1, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p4, p0, p2, p3, p1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object v0
.end method

.method private sourceFile(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 3

    .line 1
    const/4 p0, 0x2

    .line 2
    if-eq p3, p0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwBadLength(I)Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p3, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-interface {p1, v0}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/android/dx/rop/cst/CstString;

    .line 24
    .line 25
    new-instance v0, Lcom/android/dx/cf/attrib/AttSourceFile;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lcom/android/dx/cf/attrib/AttSourceFile;-><init>(Lcom/android/dx/rop/cst/CstString;)V

    .line 28
    .line 29
    .line 30
    if-eqz p4, :cond_1

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v2, "source: "

    .line 35
    .line 36
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p4, p3, p2, p0, p1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-object v0
.end method

.method private synthetic(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    invoke-static {p0}, Lcom/android/dx/cf/direct/StdAttributeFactory;->throwBadLength(I)Lcom/android/dx/cf/iface/Attribute;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance p0, Lcom/android/dx/cf/attrib/AttSynthetic;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/android/dx/cf/attrib/AttSynthetic;-><init>()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method private static throwBadLength(I)Lcom/android/dx/cf/iface/Attribute;
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/cf/iface/ParseException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "bad attribute length; expected length "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p0}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method private static throwSeverelyTruncated()Lcom/android/dx/cf/iface/Attribute;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/cf/iface/ParseException;

    .line 2
    .line 3
    const-string v1, "severely truncated attribute"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method private static throwTruncated()Lcom/android/dx/cf/iface/Attribute;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/cf/iface/ParseException;

    .line 2
    .line 3
    const-string v1, "truncated attribute"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method


# virtual methods
.method public parse0(Lcom/android/dx/cf/direct/DirectClassFile;ILjava/lang/String;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 7

    .line 1
    const-string v0, "Synthetic"

    .line 2
    .line 3
    const-string v1, "Signature"

    .line 4
    .line 5
    const-string v2, "RuntimeVisibleAnnotations"

    .line 6
    .line 7
    const-string v3, "RuntimeInvisibleAnnotations"

    .line 8
    .line 9
    const-string v4, "Deprecated"

    .line 10
    .line 11
    if-eqz p2, :cond_14

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    if-eq p2, v5, :cond_e

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    if-eq p2, v5, :cond_4

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    if-eq p2, v0, :cond_1

    .line 21
    .line 22
    :cond_0
    move-object v0, p0

    .line 23
    move-object v1, p1

    .line 24
    move v2, p2

    .line 25
    move-object v3, p3

    .line 26
    move v4, p4

    .line 27
    move v5, p5

    .line 28
    move-object v6, p6

    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_1
    const-string v0, "LineNumberTable"

    .line 32
    .line 33
    if-ne p3, v0, :cond_2

    .line 34
    .line 35
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->lineNumberTable(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_2
    const-string v0, "LocalVariableTable"

    .line 41
    .line 42
    if-ne p3, v0, :cond_3

    .line 43
    .line 44
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->localVariableTable(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_3
    const-string v0, "LocalVariableTypeTable"

    .line 50
    .line 51
    if-ne p3, v0, :cond_0

    .line 52
    .line 53
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->localVariableTypeTable(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_4
    const-string v5, "AnnotationDefault"

    .line 59
    .line 60
    if-ne p3, v5, :cond_5

    .line 61
    .line 62
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->annotationDefault(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_5
    const-string v5, "Code"

    .line 68
    .line 69
    if-ne p3, v5, :cond_6

    .line 70
    .line 71
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->code(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_6
    if-ne p3, v4, :cond_7

    .line 77
    .line 78
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->deprecated(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_7
    const-string v4, "Exceptions"

    .line 84
    .line 85
    if-ne p3, v4, :cond_8

    .line 86
    .line 87
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->exceptions(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :cond_8
    if-ne p3, v3, :cond_9

    .line 93
    .line 94
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->runtimeInvisibleAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :cond_9
    if-ne p3, v2, :cond_a

    .line 100
    .line 101
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->runtimeVisibleAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_a
    const-string v2, "RuntimeInvisibleParameterAnnotations"

    .line 107
    .line 108
    if-ne p3, v2, :cond_b

    .line 109
    .line 110
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->runtimeInvisibleParameterAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_b
    const-string v2, "RuntimeVisibleParameterAnnotations"

    .line 116
    .line 117
    if-ne p3, v2, :cond_c

    .line 118
    .line 119
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->runtimeVisibleParameterAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :cond_c
    if-ne p3, v1, :cond_d

    .line 125
    .line 126
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->signature(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    return-object p0

    .line 131
    :cond_d
    if-ne p3, v0, :cond_0

    .line 132
    .line 133
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->synthetic(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :cond_e
    const-string v5, "ConstantValue"

    .line 139
    .line 140
    if-ne p3, v5, :cond_f

    .line 141
    .line 142
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->constantValue(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0

    .line 147
    :cond_f
    if-ne p3, v4, :cond_10

    .line 148
    .line 149
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->deprecated(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :cond_10
    if-ne p3, v3, :cond_11

    .line 155
    .line 156
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->runtimeInvisibleAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :cond_11
    if-ne p3, v2, :cond_12

    .line 162
    .line 163
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->runtimeVisibleAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :cond_12
    if-ne p3, v1, :cond_13

    .line 169
    .line 170
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->signature(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :cond_13
    if-ne p3, v0, :cond_0

    .line 176
    .line 177
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->synthetic(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0

    .line 182
    :cond_14
    const-string v5, "BootstrapMethods"

    .line 183
    .line 184
    if-ne p3, v5, :cond_15

    .line 185
    .line 186
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->bootstrapMethods(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    return-object p0

    .line 191
    :cond_15
    if-ne p3, v4, :cond_16

    .line 192
    .line 193
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->deprecated(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0

    .line 198
    :cond_16
    const-string v4, "EnclosingMethod"

    .line 199
    .line 200
    if-ne p3, v4, :cond_17

    .line 201
    .line 202
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->enclosingMethod(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    return-object p0

    .line 207
    :cond_17
    const-string v4, "InnerClasses"

    .line 208
    .line 209
    if-ne p3, v4, :cond_18

    .line 210
    .line 211
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->innerClasses(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    :cond_18
    if-ne p3, v3, :cond_19

    .line 217
    .line 218
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->runtimeInvisibleAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    return-object p0

    .line 223
    :cond_19
    if-ne p3, v2, :cond_1a

    .line 224
    .line 225
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->runtimeVisibleAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    return-object p0

    .line 230
    :cond_1a
    if-ne p3, v0, :cond_1b

    .line 231
    .line 232
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->synthetic(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    return-object p0

    .line 237
    :cond_1b
    if-ne p3, v1, :cond_1c

    .line 238
    .line 239
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->signature(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    return-object p0

    .line 244
    :cond_1c
    const-string v0, "SourceDebugExtension"

    .line 245
    .line 246
    if-ne p3, v0, :cond_1d

    .line 247
    .line 248
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->sourceDebugExtension(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    return-object p0

    .line 253
    :cond_1d
    const-string v0, "SourceFile"

    .line 254
    .line 255
    if-ne p3, v0, :cond_0

    .line 256
    .line 257
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/android/dx/cf/direct/StdAttributeFactory;->sourceFile(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    return-object p0

    .line 262
    :goto_0
    invoke-super/range {v0 .. v6}, Lcom/android/dx/cf/direct/AttributeFactory;->parse0(Lcom/android/dx/cf/direct/DirectClassFile;ILjava/lang/String;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    return-object p0
.end method
