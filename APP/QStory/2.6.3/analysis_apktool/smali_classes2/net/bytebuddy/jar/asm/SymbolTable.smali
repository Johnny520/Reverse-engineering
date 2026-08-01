.class final Lnet/bytebuddy/jar/asm/SymbolTable;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/jar/asm/SymbolTable$Entry;,
        Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;
    }
.end annotation


# instance fields
.field private bootstrapMethodCount:I

.field private bootstrapMethods:Lnet/bytebuddy/jar/asm/ByteVector;

.field private className:Ljava/lang/String;

.field final classWriter:Lnet/bytebuddy/jar/asm/ClassWriter;

.field private constantPool:Lnet/bytebuddy/jar/asm/ByteVector;

.field private constantPoolCount:I

.field private entries:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

.field private entryCount:I

.field private labelCount:I

.field private labelEntries:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

.field private labelTable:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

.field private majorVersion:I

.field private final sourceClassReader:Lnet/bytebuddy/jar/asm/ClassReader;

.field private typeCount:I

.field private typeTable:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/ClassWriter;)V
    .locals 0

    .line 267
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 268
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->classWriter:Lnet/bytebuddy/jar/asm/ClassWriter;

    const/4 p1, 0x0

    .line 269
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->sourceClassReader:Lnet/bytebuddy/jar/asm/ClassReader;

    const/16 p1, 0x100

    .line 270
    new-array p1, p1, [Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    iput-object p1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->entries:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    const/4 p1, 0x1

    .line 271
    iput p1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 272
    new-instance p1, Lnet/bytebuddy/jar/asm/ByteVector;

    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPool:Lnet/bytebuddy/jar/asm/ByteVector;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/jar/asm/ClassWriter;Lnet/bytebuddy/jar/asm/ClassReader;)V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->classWriter:Lnet/bytebuddy/jar/asm/ClassWriter;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->sourceClassReader:Lnet/bytebuddy/jar/asm/ClassReader;

    .line 7
    .line 8
    iget-object p1, p2, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p2, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->getItem(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sub-int/2addr v1, v0

    .line 16
    iget v2, p2, Lnet/bytebuddy/jar/asm/ClassReader;->header:I

    .line 17
    .line 18
    sub-int/2addr v2, v1

    .line 19
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/ClassReader;->getItemCount()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iput v3, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 24
    .line 25
    new-instance v3, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 26
    .line 27
    invoke-direct {v3, v2}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object v3, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPool:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 31
    .line 32
    invoke-virtual {v3, p1, v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 33
    .line 34
    .line 35
    iget v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 36
    .line 37
    const/4 v2, 0x2

    .line 38
    mul-int/2addr v1, v2

    .line 39
    new-array v1, v1, [Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 40
    .line 41
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->entries:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 42
    .line 43
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/ClassReader;->getMaxStringLength()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    new-array v1, v1, [C

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    move v5, v0

    .line 51
    move v11, v3

    .line 52
    :goto_0
    iget v4, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 53
    .line 54
    if-ge v5, v4, :cond_3

    .line 55
    .line 56
    invoke-virtual {p2, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->getItem(I)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    add-int/lit8 v6, v4, -0x1

    .line 61
    .line 62
    aget-byte v6, p1, v6

    .line 63
    .line 64
    packed-switch v6, :pswitch_data_0

    .line 65
    .line 66
    .line 67
    :pswitch_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    throw p0

    .line 72
    :pswitch_1
    add-int/lit8 v7, v4, 0x2

    .line 73
    .line 74
    invoke-virtual {p2, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    invoke-virtual {p2, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->getItem(I)I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    move v8, v7

    .line 83
    invoke-virtual {p2, v8, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    add-int/2addr v8, v2

    .line 88
    invoke-virtual {p2, v8, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-virtual {p2, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    move v4, v6

    .line 97
    move v6, v5

    .line 98
    move v5, v4

    .line 99
    move-object v4, p0

    .line 100
    invoke-direct/range {v4 .. v9}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantDynamicOrInvokeDynamicReference(IILjava/lang/String;Ljava/lang/String;I)V

    .line 101
    .line 102
    .line 103
    move p0, v6

    .line 104
    move v6, v5

    .line 105
    move v5, p0

    .line 106
    move v11, v0

    .line 107
    move-object p0, v4

    .line 108
    goto/16 :goto_4

    .line 109
    .line 110
    :pswitch_2
    move v12, v6

    .line 111
    add-int/lit8 v6, v4, 0x1

    .line 112
    .line 113
    invoke-virtual {p2, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    invoke-virtual {p2, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->getItem(I)I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    add-int/lit8 v7, v6, 0x2

    .line 122
    .line 123
    invoke-virtual {p2, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    invoke-virtual {p2, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->getItem(I)I

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    move v8, v6

    .line 132
    invoke-virtual {p2, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readByte(I)I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    move v4, v7

    .line 137
    invoke-virtual {p2, v8, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    move v9, v8

    .line 142
    invoke-virtual {p2, v4, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    add-int/2addr v4, v2

    .line 147
    invoke-virtual {p2, v4, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    sub-int/2addr v9, v0

    .line 152
    invoke-virtual {p2, v9}, Lnet/bytebuddy/jar/asm/ClassReader;->readByte(I)I

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    const/16 v10, 0xb

    .line 157
    .line 158
    if-ne v9, v10, :cond_0

    .line 159
    .line 160
    move v10, v0

    .line 161
    :goto_1
    move-object v9, v4

    .line 162
    move-object v4, p0

    .line 163
    goto :goto_2

    .line 164
    :cond_0
    move v10, v3

    .line 165
    goto :goto_1

    .line 166
    :goto_2
    invoke-direct/range {v4 .. v10}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantMethodHandle(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 167
    .line 168
    .line 169
    move-object p0, v4

    .line 170
    :goto_3
    move v6, v12

    .line 171
    goto :goto_4

    .line 172
    :pswitch_3
    move v12, v6

    .line 173
    invoke-virtual {p2, v4, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    add-int/lit8 v4, v4, 0x2

    .line 178
    .line 179
    invoke-virtual {p2, v4, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-direct {p0, v5, v6, v4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantNameAndType(ILjava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :pswitch_4
    move v12, v6

    .line 188
    add-int/lit8 v6, v4, 0x2

    .line 189
    .line 190
    invoke-virtual {p2, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    invoke-virtual {p2, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->getItem(I)I

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    invoke-virtual {p2, v4, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    invoke-virtual {p2, v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    add-int/2addr v6, v2

    .line 207
    invoke-virtual {p2, v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    move-object v4, p0

    .line 212
    move v6, v12

    .line 213
    invoke-direct/range {v4 .. v9}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantMemberReference(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :pswitch_5
    invoke-virtual {p2, v4, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-direct {p0, v5, v6, v4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8Reference(IILjava/lang/String;)V

    .line 222
    .line 223
    .line 224
    goto :goto_4

    .line 225
    :pswitch_6
    invoke-virtual {p2, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readLong(I)J

    .line 226
    .line 227
    .line 228
    move-result-wide v7

    .line 229
    invoke-direct {p0, v5, v6, v7, v8}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantLongOrDouble(IIJ)V

    .line 230
    .line 231
    .line 232
    goto :goto_4

    .line 233
    :pswitch_7
    invoke-virtual {p2, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    invoke-direct {p0, v5, v6, v4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantIntegerOrFloat(III)V

    .line 238
    .line 239
    .line 240
    goto :goto_4

    .line 241
    :pswitch_8
    invoke-virtual {p2, v5, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUtf(I[C)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    invoke-direct {p0, v5, v4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(ILjava/lang/String;)V

    .line 246
    .line 247
    .line 248
    :goto_4
    const/4 v4, 0x5

    .line 249
    if-eq v6, v4, :cond_2

    .line 250
    .line 251
    const/4 v4, 0x6

    .line 252
    if-ne v6, v4, :cond_1

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_1
    move v4, v0

    .line 256
    goto :goto_6

    .line 257
    :cond_2
    :goto_5
    move v4, v2

    .line 258
    :goto_6
    add-int/2addr v5, v4

    .line 259
    goto/16 :goto_0

    .line 260
    .line 261
    :cond_3
    if-eqz v11, :cond_4

    .line 262
    .line 263
    invoke-direct {p0, p2, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->copyBootstrapMethods(Lnet/bytebuddy/jar/asm/ClassReader;[C)V

    .line 264
    .line 265
    .line 266
    :cond_4
    return-void

    .line 267
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_5
        :pswitch_1
        :pswitch_1
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method

.method private add(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)V
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->entryCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->entryCount:I

    .line 6
    .line 7
    iget v0, p1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->entries:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 10
    .line 11
    array-length v1, p0

    .line 12
    rem-int/2addr v0, v1

    .line 13
    aget-object v1, p0, v0

    .line 14
    .line 15
    iput-object v1, p1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 16
    .line 17
    aput-object p1, p0, v0

    .line 18
    .line 19
    return-void
.end method

.method private addBootstrapMethod(III)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 8

    .line 107
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethods:Lnet/bytebuddy/jar/asm/ByteVector;

    iget-object v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 108
    invoke-direct {p0, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_3

    .line 109
    iget v2, v1, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    const/16 v3, 0x40

    if-ne v2, v3, :cond_2

    iget v2, v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    if-ne v2, p3, :cond_2

    .line 110
    iget-wide v2, v1, Lnet/bytebuddy/jar/asm/Symbol;->data:J

    long-to-int v2, v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, p2, :cond_1

    add-int v4, p1, v3

    .line 111
    aget-byte v4, v0, v4

    add-int v5, v2, v3

    aget-byte v5, v0, v5

    if-eq v4, v5, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 112
    :cond_1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethods:Lnet/bytebuddy/jar/asm/ByteVector;

    iput p1, p0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    return-object v1

    .line 113
    :cond_2
    :goto_2
    iget-object v1, v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    goto :goto_0

    .line 114
    :cond_3
    new-instance v2, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    iget v3, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethodCount:I

    add-int/lit8 p2, v3, 0x1

    iput p2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethodCount:I

    const/16 v4, 0x40

    int-to-long v5, p1

    move v7, p3

    invoke-direct/range {v2 .. v7}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IIJI)V

    invoke-direct {p0, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->put(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    move-result-object p0

    return-object p0
.end method

.method private addConstantDynamicOrInvokeDynamicReference(ILjava/lang/String;Ljava/lang/String;I)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 9

    .line 1
    invoke-static {p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;I)I

    .line 2
    .line 3
    .line 4
    move-result v8

    .line 5
    invoke-direct {p0, v8}, Lnet/bytebuddy/jar/asm/SymbolTable;->get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 12
    .line 13
    if-ne v1, p1, :cond_0

    .line 14
    .line 15
    iget v1, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 16
    .line 17
    if-ne v1, v8, :cond_0

    .line 18
    .line 19
    iget-wide v1, v0, Lnet/bytebuddy/jar/asm/Symbol;->data:J

    .line 20
    .line 21
    int-to-long v3, p4

    .line 22
    cmp-long v1, v1, v3

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/Symbol;->name:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_0
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPool:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 47
    .line 48
    invoke-virtual {p0, p2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantNameAndType(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v0, p1, p4, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->put122(III)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 53
    .line 54
    .line 55
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 56
    .line 57
    iget v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 58
    .line 59
    add-int/lit8 v2, v1, 0x1

    .line 60
    .line 61
    iput v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    int-to-long v6, p4

    .line 65
    move v2, p1

    .line 66
    move-object v4, p2

    .line 67
    move-object v5, p3

    .line 68
    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->put(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method private addConstantDynamicOrInvokeDynamicReference(IILjava/lang/String;Ljava/lang/String;I)V
    .locals 9

    .line 76
    invoke-static {p1, p3, p4, p5}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;I)I

    move-result v8

    .line 77
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    const/4 v3, 0x0

    int-to-long v6, p5

    move v2, p1

    move v1, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->add(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantIntegerOrFloat(II)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 6

    .line 1
    invoke-static {p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(II)I

    .line 2
    .line 3
    .line 4
    move-result v5

    .line 5
    invoke-direct {p0, v5}, Lnet/bytebuddy/jar/asm/SymbolTable;->get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 12
    .line 13
    if-ne v1, p1, :cond_0

    .line 14
    .line 15
    iget v1, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 16
    .line 17
    if-ne v1, v5, :cond_0

    .line 18
    .line 19
    iget-wide v1, v0, Lnet/bytebuddy/jar/asm/Symbol;->data:J

    .line 20
    .line 21
    int-to-long v3, p2

    .line 22
    cmp-long v1, v1, v3

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPool:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 37
    .line 38
    .line 39
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 40
    .line 41
    iget v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 42
    .line 43
    add-int/lit8 v2, v1, 0x1

    .line 44
    .line 45
    iput v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 46
    .line 47
    int-to-long v3, p2

    .line 48
    move v2, p1

    .line 49
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IIJI)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->put(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

.method private addConstantIntegerOrFloat(III)V
    .locals 6

    .line 57
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    int-to-long v3, p3

    invoke-static {p2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(II)I

    move-result v5

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IIJI)V

    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->add(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantLongOrDouble(IJ)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 6

    .line 1
    invoke-static {p1, p2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(IJ)I

    .line 2
    .line 3
    .line 4
    move-result v5

    .line 5
    invoke-direct {p0, v5}, Lnet/bytebuddy/jar/asm/SymbolTable;->get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 12
    .line 13
    if-ne v1, p1, :cond_0

    .line 14
    .line 15
    iget v1, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 16
    .line 17
    if-ne v1, v5, :cond_0

    .line 18
    .line 19
    iget-wide v1, v0, Lnet/bytebuddy/jar/asm/Symbol;->data:J

    .line 20
    .line 21
    cmp-long v1, v1, p2

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 30
    .line 31
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPool:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, p2, p3}, Lnet/bytebuddy/jar/asm/ByteVector;->putLong(J)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 38
    .line 39
    .line 40
    iget v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x2

    .line 43
    .line 44
    iput v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 45
    .line 46
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 47
    .line 48
    move v2, p1

    .line 49
    move-wide v3, p2

    .line 50
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IIJI)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->put(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method private addConstantLongOrDouble(IIJ)V
    .locals 6

    .line 58
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    invoke-static {p2, p3, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(IJ)I

    move-result v5

    move v1, p1

    move v2, p2

    move-wide v3, p3

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IIJI)V

    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->add(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantMemberReference(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;
    .locals 9

    .line 1
    invoke-static {p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v8

    .line 5
    invoke-direct {p0, v8}, Lnet/bytebuddy/jar/asm/SymbolTable;->get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 12
    .line 13
    if-ne v1, p1, :cond_0

    .line 14
    .line 15
    iget v1, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 16
    .line 17
    if-ne v1, v8, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/Symbol;->owner:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/Symbol;->name:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_0
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPool:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 48
    .line 49
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget v1, v1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 54
    .line 55
    invoke-virtual {p0, p3, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantNameAndType(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {v0, p1, v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->put122(III)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 60
    .line 61
    .line 62
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 63
    .line 64
    iget v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 65
    .line 66
    add-int/lit8 v2, v1, 0x1

    .line 67
    .line 68
    iput v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 69
    .line 70
    const-wide/16 v6, 0x0

    .line 71
    .line 72
    move v2, p1

    .line 73
    move-object v3, p2

    .line 74
    move-object v4, p3

    .line 75
    move-object v5, p4

    .line 76
    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->put(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method

.method private addConstantMemberReference(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 84
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    const-wide/16 v6, 0x0

    invoke-static {p2, p3, p4, p5}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v8

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->add(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantMethodHandle(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    .line 111
    invoke-static {p2, p6}, Lnet/bytebuddy/jar/asm/SymbolTable;->getConstantMethodHandleSymbolData(IZ)I

    move-result p2

    const/16 p6, 0xf

    .line 112
    invoke-static {p6, p3, p4, p5, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I

    move-result v8

    .line 113
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    const/16 v2, 0xf

    int-to-long v6, p2

    move v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->add(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantNameAndType(ILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 78
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    const/16 v1, 0xc

    invoke-static {v1, p2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;)I

    move-result v5

    const/16 v2, 0xc

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;I)V

    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->add(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantUtf8(ILjava/lang/String;)V
    .locals 3

    .line 61
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    const/4 v1, 0x1

    invoke-static {v1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;)I

    move-result v2

    invoke-direct {v0, p1, v1, p2, v2}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;I)V

    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->add(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addConstantUtf8Reference(ILjava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :goto_0
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iget v2, v1, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 12
    .line 13
    if-ne v2, p1, :cond_0

    .line 14
    .line 15
    iget v2, v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 16
    .line 17
    if-ne v2, v0, :cond_0

    .line 18
    .line 19
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_0
    iget-object v1, v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPool:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 32
    .line 33
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v1, p1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->put12(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 38
    .line 39
    .line 40
    new-instance v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 41
    .line 42
    iget v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 43
    .line 44
    add-int/lit8 v3, v2, 0x1

    .line 45
    .line 46
    iput v3, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 47
    .line 48
    invoke-direct {v1, v2, p1, p2, v0}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->put(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method private addConstantUtf8Reference(IILjava/lang/String;)V
    .locals 2

    .line 56
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    invoke-static {p2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;)I

    move-result v1

    invoke-direct {v0, p1, p2, p3, v1}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;I)V

    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->add(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)V

    return-void
.end method

.method private addTypeInternal(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeTable:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x10

    .line 6
    .line 7
    new-array v0, v0, [Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 8
    .line 9
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeTable:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeCount:I

    .line 12
    .line 13
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeTable:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    array-length v0, v1

    .line 19
    mul-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    new-array v0, v0, [Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 22
    .line 23
    array-length v2, v1

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeTable:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeTable:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 31
    .line 32
    iget v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeCount:I

    .line 33
    .line 34
    add-int/lit8 v2, v1, 0x1

    .line 35
    .line 36
    iput v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeCount:I

    .line 37
    .line 38
    aput-object p1, v0, v1

    .line 39
    .line 40
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->put(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 45
    .line 46
    return p0
.end method

.method private copyBootstrapMethods(Lnet/bytebuddy/jar/asm/ClassReader;[C)V
    .locals 9

    .line 1
    iget-object v0, p1, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 2
    .line 3
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/ClassReader;->getFirstAttributeOffset()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v2, v1, -0x2

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    :goto_0
    if-lez v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, v1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const-string v4, "BootstrapMethods"

    .line 20
    .line 21
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    add-int/lit8 v2, v1, 0x6

    .line 28
    .line 29
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iput v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethodCount:I

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v3, v1, 0x2

    .line 37
    .line 38
    invoke-virtual {p1, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    add-int/lit8 v3, v3, 0x6

    .line 43
    .line 44
    add-int/2addr v1, v3

    .line 45
    add-int/lit8 v2, v2, -0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    :goto_1
    iget v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethodCount:I

    .line 49
    .line 50
    if-lez v2, :cond_3

    .line 51
    .line 52
    add-int/lit8 v2, v1, 0x8

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x2

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/lit8 v1, v1, -0x2

    .line 61
    .line 62
    new-instance v3, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 63
    .line 64
    invoke-direct {v3, v1}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iput-object v3, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethods:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 68
    .line 69
    invoke-virtual {v3, v0, v2, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 70
    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    move v4, v0

    .line 74
    move v0, v2

    .line 75
    :goto_2
    iget v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethodCount:I

    .line 76
    .line 77
    if-ge v4, v1, :cond_3

    .line 78
    .line 79
    sub-int v1, v0, v2

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    add-int/lit8 v5, v0, 0x2

    .line 86
    .line 87
    invoke-virtual {p1, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    add-int/lit8 v0, v0, 0x4

    .line 92
    .line 93
    invoke-virtual {p1, v3, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    :goto_3
    add-int/lit8 v6, v5, -0x1

    .line 102
    .line 103
    if-lez v5, :cond_2

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    add-int/lit8 v0, v0, 0x2

    .line 110
    .line 111
    invoke-virtual {p1, v5, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    xor-int/2addr v3, v5

    .line 120
    move v5, v6

    .line 121
    goto :goto_3

    .line 122
    :cond_2
    move v5, v3

    .line 123
    new-instance v3, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 124
    .line 125
    int-to-long v6, v1

    .line 126
    const v1, 0x7fffffff

    .line 127
    .line 128
    .line 129
    and-int v8, v5, v1

    .line 130
    .line 131
    const/16 v5, 0x40

    .line 132
    .line 133
    invoke-direct/range {v3 .. v8}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IIJI)V

    .line 134
    .line 135
    .line 136
    invoke-direct {p0, v3}, Lnet/bytebuddy/jar/asm/SymbolTable;->add(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)V

    .line 137
    .line 138
    .line 139
    add-int/lit8 v4, v4, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    return-void
.end method

.method private get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->entries:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    rem-int/2addr p1, v0

    .line 5
    aget-object p0, p0, p1

    .line 6
    .line 7
    return-object p0
.end method

.method private static getConstantMethodHandleSymbolData(IZ)I
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    if-le p0, v0, :cond_0

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    shl-int/lit8 p0, p0, 0x8

    .line 7
    .line 8
    :cond_0
    return p0
.end method

.method private getOrAddLabelEntry(Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;
    .locals 8

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelEntries:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x10

    .line 6
    .line 7
    new-array v1, v0, [Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 8
    .line 9
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelEntries:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 10
    .line 11
    new-array v0, v0, [Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 12
    .line 13
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelTable:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 14
    .line 15
    :cond_0
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelEntries:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 20
    .line 21
    array-length v2, v1

    .line 22
    rem-int v2, v0, v2

    .line 23
    .line 24
    aget-object v1, v1, v2

    .line 25
    .line 26
    :goto_0
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;->label:Lnet/bytebuddy/jar/asm/Label;

    .line 29
    .line 30
    if-eq v2, p1, :cond_1

    .line 31
    .line 32
    iget-object v1, v1, Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    if-eqz v1, :cond_2

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_2
    iget v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelCount:I

    .line 39
    .line 40
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelEntries:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 41
    .line 42
    array-length v3, v2

    .line 43
    mul-int/lit8 v3, v3, 0x3

    .line 44
    .line 45
    div-int/lit8 v3, v3, 0x4

    .line 46
    .line 47
    if-le v1, v3, :cond_5

    .line 48
    .line 49
    array-length v1, v2

    .line 50
    mul-int/lit8 v2, v1, 0x2

    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    new-array v3, v2, [Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 55
    .line 56
    add-int/lit8 v1, v1, -0x1

    .line 57
    .line 58
    :goto_1
    if-ltz v1, :cond_4

    .line 59
    .line 60
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelEntries:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 61
    .line 62
    aget-object v4, v4, v1

    .line 63
    .line 64
    :goto_2
    if-eqz v4, :cond_3

    .line 65
    .line 66
    iget-object v5, v4, Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;->label:Lnet/bytebuddy/jar/asm/Label;

    .line 67
    .line 68
    invoke-static {v5}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    rem-int/2addr v5, v2

    .line 73
    iget-object v6, v4, Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 74
    .line 75
    aget-object v7, v3, v5

    .line 76
    .line 77
    iput-object v7, v4, Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 78
    .line 79
    aput-object v4, v3, v5

    .line 80
    .line 81
    move-object v4, v6

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    add-int/lit8 v1, v1, -0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    iput-object v3, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelEntries:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 87
    .line 88
    :cond_5
    iget v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelCount:I

    .line 89
    .line 90
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelTable:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 91
    .line 92
    array-length v3, v2

    .line 93
    if-ne v1, v3, :cond_6

    .line 94
    .line 95
    array-length v1, v2

    .line 96
    mul-int/lit8 v1, v1, 0x2

    .line 97
    .line 98
    new-array v1, v1, [Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 99
    .line 100
    array-length v3, v2

    .line 101
    const/4 v4, 0x0

    .line 102
    invoke-static {v2, v4, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 103
    .line 104
    .line 105
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelTable:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 106
    .line 107
    :cond_6
    new-instance v1, Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 108
    .line 109
    iget v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelCount:I

    .line 110
    .line 111
    invoke-direct {v1, v2, p1}, Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;-><init>(ILnet/bytebuddy/jar/asm/Label;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelEntries:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 115
    .line 116
    array-length v2, p1

    .line 117
    rem-int/2addr v0, v2

    .line 118
    aget-object v2, p1, v0

    .line 119
    .line 120
    iput-object v2, v1, Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 121
    .line 122
    aput-object v1, p1, v0

    .line 123
    .line 124
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelTable:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 125
    .line 126
    iget v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelCount:I

    .line 127
    .line 128
    add-int/lit8 v2, v0, 0x1

    .line 129
    .line 130
    iput v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelCount:I

    .line 131
    .line 132
    aput-object v1, p1, v0

    .line 133
    .line 134
    return-object v1
.end method

.method private static hash(II)I
    .locals 1

    .line 28
    const v0, 0x7fffffff

    add-int/2addr p0, p1

    and-int/2addr p0, v0

    return p0
.end method

.method private static hash(IJ)I
    .locals 1

    .line 22
    long-to-int v0, p1

    add-int/2addr p0, v0

    const/16 v0, 0x20

    ushr-long/2addr p1, v0

    long-to-int p1, p1

    add-int/2addr p0, p1

    const p1, 0x7fffffff

    and-int/2addr p0, p1

    return p0
.end method

.method private static hash(ILjava/lang/String;)I
    .locals 0

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    add-int/2addr p1, p0

    const p0, 0x7fffffff

    and-int/2addr p0, p1

    return p0
.end method

.method private static hash(ILjava/lang/String;I)I
    .locals 0

    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    add-int/2addr p1, p0

    add-int/2addr p1, p2

    const p0, 0x7fffffff

    and-int/2addr p0, p1

    return p0
.end method

.method private static hash(ILjava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    mul-int/2addr p2, p1

    add-int/2addr p2, p0

    const p0, 0x7fffffff

    and-int/2addr p0, p2

    return p0
.end method

.method private static hash(ILjava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 26
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    mul-int/2addr p2, p1

    add-int/lit8 p3, p3, 0x1

    mul-int/2addr p3, p2

    add-int/2addr p3, p0

    const p0, 0x7fffffff

    and-int/2addr p0, p3

    return p0
.end method

.method private static hash(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 27
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    mul-int/2addr p2, p1

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result p1

    mul-int/2addr p1, p2

    add-int/2addr p1, p0

    const p0, 0x7fffffff

    and-int/2addr p0, p1

    return p0
.end method

.method private static hash(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    mul-int/2addr p2, p1

    .line 10
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    mul-int/2addr p1, p2

    .line 15
    mul-int/2addr p1, p4

    .line 16
    add-int/2addr p1, p0

    .line 17
    const p0, 0x7fffffff

    .line 18
    .line 19
    .line 20
    and-int/2addr p0, p1

    .line 21
    return p0
.end method

.method private put(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;
    .locals 7

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->entryCount:I

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->entries:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    mul-int/lit8 v2, v2, 0x3

    .line 7
    .line 8
    div-int/lit8 v2, v2, 0x4

    .line 9
    .line 10
    if-le v0, v2, :cond_2

    .line 11
    .line 12
    array-length v0, v1

    .line 13
    mul-int/lit8 v1, v0, 0x2

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    new-array v2, v1, [Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    :goto_0
    if-ltz v0, :cond_1

    .line 22
    .line 23
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->entries:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 24
    .line 25
    aget-object v3, v3, v0

    .line 26
    .line 27
    :goto_1
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget v4, v3, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 30
    .line 31
    rem-int/2addr v4, v1

    .line 32
    iget-object v5, v3, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 33
    .line 34
    aget-object v6, v2, v4

    .line 35
    .line 36
    iput-object v6, v3, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 37
    .line 38
    aput-object v3, v2, v4

    .line 39
    .line 40
    move-object v3, v5

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iput-object v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->entries:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 46
    .line 47
    :cond_2
    iget v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->entryCount:I

    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    iput v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->entryCount:I

    .line 52
    .line 53
    iget v0, p1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 54
    .line 55
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->entries:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 56
    .line 57
    array-length v1, p0

    .line 58
    rem-int/2addr v0, v1

    .line 59
    aget-object v1, p0, v0

    .line 60
    .line 61
    iput-object v1, p1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 62
    .line 63
    aput-object p1, p0, v0

    .line 64
    .line 65
    return-object p1
.end method

.method private static synthetic stringConcat$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "value "

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public varargs addBootstrapMethod(Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 11

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethods:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 6
    .line 7
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethods:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 11
    .line 12
    :cond_0
    array-length v1, p2

    .line 13
    new-array v2, v1, [I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v4, v1, :cond_1

    .line 18
    .line 19
    aget-object v5, p2, v4

    .line 20
    .line 21
    invoke-virtual {p0, v5}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstant(Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget v5, v5, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 26
    .line 27
    aput v5, v2, v4

    .line 28
    .line 29
    add-int/lit8 v4, v4, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget v4, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 33
    .line 34
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Handle;->getTag()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Handle;->getOwner()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Handle;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Handle;->getDesc()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Handle;->isInterface()Z

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    move-object v5, p0

    .line 55
    invoke-virtual/range {v5 .. v10}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantMethodHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/Symbol;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 60
    .line 61
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 65
    .line 66
    .line 67
    move p0, v3

    .line 68
    :goto_1
    if-ge p0, v1, :cond_2

    .line 69
    .line 70
    aget v6, v2, p0

    .line 71
    .line 72
    invoke-virtual {v0, v6}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 73
    .line 74
    .line 75
    add-int/lit8 p0, p0, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    iget p0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 79
    .line 80
    sub-int/2addr p0, v4

    .line 81
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Handle;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    array-length v0, p2

    .line 86
    :goto_2
    if-ge v3, v0, :cond_3

    .line 87
    .line 88
    aget-object v1, p2, v3

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    xor-int/2addr p1, v1

    .line 95
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    const p2, 0x7fffffff

    .line 99
    .line 100
    .line 101
    and-int/2addr p1, p2

    .line 102
    invoke-direct {v5, v4, p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addBootstrapMethod(III)Lnet/bytebuddy/jar/asm/Symbol;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0
.end method

.method public addConstant(Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 6

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantInteger(I)Lnet/bytebuddy/jar/asm/Symbol;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p1, Ljava/lang/Byte;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p1, Ljava/lang/Byte;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Byte;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantInteger(I)Lnet/bytebuddy/jar/asm/Symbol;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    instance-of v0, p1, Ljava/lang/Character;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    check-cast p1, Ljava/lang/Character;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantInteger(I)Lnet/bytebuddy/jar/asm/Symbol;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_2
    instance-of v0, p1, Ljava/lang/Short;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    check-cast p1, Ljava/lang/Short;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Short;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantInteger(I)Lnet/bytebuddy/jar/asm/Symbol;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_3
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    check-cast p1, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantInteger(I)Lnet/bytebuddy/jar/asm/Symbol;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_4
    instance-of v0, p1, Ljava/lang/Float;

    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    check-cast p1, Ljava/lang/Float;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantFloat(F)Lnet/bytebuddy/jar/asm/Symbol;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_5
    instance-of v0, p1, Ljava/lang/Long;

    .line 92
    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    check-cast p1, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    invoke-virtual {p0, v0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantLong(J)Lnet/bytebuddy/jar/asm/Symbol;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_6
    instance-of v0, p1, Ljava/lang/Double;

    .line 107
    .line 108
    if-eqz v0, :cond_7

    .line 109
    .line 110
    check-cast p1, Ljava/lang/Double;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 113
    .line 114
    .line 115
    move-result-wide v0

    .line 116
    invoke-virtual {p0, v0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantDouble(D)Lnet/bytebuddy/jar/asm/Symbol;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :cond_7
    instance-of v0, p1, Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    check-cast p1, Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantString(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :cond_8
    instance-of v0, p1, Lnet/bytebuddy/jar/asm/Type;

    .line 133
    .line 134
    if-eqz v0, :cond_b

    .line 135
    .line 136
    check-cast p1, Lnet/bytebuddy/jar/asm/Type;

    .line 137
    .line 138
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    const/16 v1, 0xa

    .line 143
    .line 144
    if-ne v0, v1, :cond_9

    .line 145
    .line 146
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0

    .line 155
    :cond_9
    const/16 v1, 0xb

    .line 156
    .line 157
    if-ne v0, v1, :cond_a

    .line 158
    .line 159
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantMethodType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :cond_a
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0

    .line 177
    :cond_b
    instance-of v0, p1, Lnet/bytebuddy/jar/asm/Handle;

    .line 178
    .line 179
    if-eqz v0, :cond_c

    .line 180
    .line 181
    check-cast p1, Lnet/bytebuddy/jar/asm/Handle;

    .line 182
    .line 183
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Handle;->getTag()I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Handle;->getOwner()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Handle;->getName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Handle;->getDesc()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Handle;->isInterface()Z

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    move-object v0, p0

    .line 204
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantMethodHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/Symbol;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0

    .line 209
    :cond_c
    move-object v0, p0

    .line 210
    instance-of p0, p1, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 211
    .line 212
    if-eqz p0, :cond_d

    .line 213
    .line 214
    check-cast p1, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 215
    .line 216
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/ConstantDynamic;->getName()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/ConstantDynamic;->getDescriptor()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/ConstantDynamic;->getBootstrapMethod()Lnet/bytebuddy/jar/asm/Handle;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/ConstantDynamic;->getBootstrapMethodArgumentsUnsafe()[Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {v0, p0, v1, v2, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantDynamic(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    return-object p0

    .line 237
    :cond_d
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/SymbolTable;->stringConcat$0(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    const/4 p0, 0x0

    .line 249
    return-object p0
.end method

.method public addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8Reference(ILjava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public addConstantDouble(D)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 3
    .line 4
    .line 5
    move-result-wide p1

    .line 6
    invoke-direct {p0, v0, p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantLongOrDouble(IJ)Lnet/bytebuddy/jar/asm/Symbol;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public varargs addConstantDynamic(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addBootstrapMethod(Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    const/16 p4, 0x11

    .line 6
    .line 7
    iget p3, p3, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    invoke-direct {p0, p4, p1, p2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantDynamicOrInvokeDynamicReference(ILjava/lang/String;Ljava/lang/String;I)Lnet/bytebuddy/jar/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public addConstantFieldref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantMemberReference(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public addConstantFloat(F)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantIntegerOrFloat(II)Lnet/bytebuddy/jar/asm/Symbol;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public addConstantInteger(I)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantIntegerOrFloat(II)Lnet/bytebuddy/jar/asm/Symbol;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public varargs addConstantInvokeDynamic(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addBootstrapMethod(Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    const/16 p4, 0x12

    .line 6
    .line 7
    iget p3, p3, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    invoke-direct {p0, p4, p1, p2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantDynamicOrInvokeDynamicReference(ILjava/lang/String;Ljava/lang/String;I)Lnet/bytebuddy/jar/asm/Symbol;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public addConstantLong(J)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, v0, p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantLongOrDouble(IJ)Lnet/bytebuddy/jar/asm/Symbol;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public addConstantMethodHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 13

    .line 1
    move-object/from16 v4, p3

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    move/from16 v0, p5

    .line 6
    .line 7
    invoke-static {p1, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->getConstantMethodHandleSymbolData(IZ)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0xf

    .line 12
    .line 13
    invoke-static {v2, p2, v4, v5, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    invoke-direct {p0, v8}, Lnet/bytebuddy/jar/asm/SymbolTable;->get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    :goto_0
    if-eqz v6, :cond_1

    .line 22
    .line 23
    iget v7, v6, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 24
    .line 25
    if-ne v7, v2, :cond_0

    .line 26
    .line 27
    iget v7, v6, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 28
    .line 29
    if-ne v7, v8, :cond_0

    .line 30
    .line 31
    iget-wide v9, v6, Lnet/bytebuddy/jar/asm/Symbol;->data:J

    .line 32
    .line 33
    int-to-long v11, v1

    .line 34
    cmp-long v7, v9, v11

    .line 35
    .line 36
    if-nez v7, :cond_0

    .line 37
    .line 38
    iget-object v7, v6, Lnet/bytebuddy/jar/asm/Symbol;->owner:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v7, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    iget-object v7, v6, Lnet/bytebuddy/jar/asm/Symbol;->name:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-eqz v7, :cond_0

    .line 53
    .line 54
    iget-object v7, v6, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_0

    .line 61
    .line 62
    return-object v6

    .line 63
    :cond_0
    iget-object v6, v6, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iget-object v6, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPool:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 67
    .line 68
    const/4 v7, 0x4

    .line 69
    if-gt p1, v7, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0, p2, v4, v5}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantFieldref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget v0, v0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 76
    .line 77
    invoke-virtual {v6, v2, p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->put112(III)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-virtual {p0, p2, v4, v5, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantMethodref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/Symbol;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget v0, v0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 86
    .line 87
    invoke-virtual {v6, v2, p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->put112(III)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 88
    .line 89
    .line 90
    :goto_1
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 91
    .line 92
    iget p1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 93
    .line 94
    add-int/lit8 v2, p1, 0x1

    .line 95
    .line 96
    iput v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 97
    .line 98
    const/16 v2, 0xf

    .line 99
    .line 100
    int-to-long v6, v1

    .line 101
    move v1, p1

    .line 102
    move-object v3, p2

    .line 103
    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    .line 104
    .line 105
    .line 106
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->put(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0
.end method

.method public addConstantMethodType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8Reference(ILjava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public addConstantMethodref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 0

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    const/16 p4, 0xb

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/16 p4, 0xa

    .line 7
    .line 8
    :goto_0
    invoke-direct {p0, p4, p1, p2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantMemberReference(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public addConstantModule(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 1

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8Reference(ILjava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public addConstantNameAndType(Ljava/lang/String;Ljava/lang/String;)I
    .locals 7

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v6

    .line 7
    invoke-direct {p0, v6}, Lnet/bytebuddy/jar/asm/SymbolTable;->get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget v2, v1, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 14
    .line 15
    if-ne v2, v0, :cond_0

    .line 16
    .line 17
    iget v2, v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 18
    .line 19
    if-ne v2, v6, :cond_0

    .line 20
    .line 21
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/Symbol;->name:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    iget p0, v1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 38
    .line 39
    return p0

    .line 40
    :cond_0
    iget-object v1, v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPool:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {v1, v0, v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->put122(III)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 54
    .line 55
    .line 56
    new-instance v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 57
    .line 58
    iget v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 59
    .line 60
    add-int/lit8 v0, v2, 0x1

    .line 61
    .line 62
    iput v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 63
    .line 64
    const/16 v3, 0xc

    .line 65
    .line 66
    move-object v4, p1

    .line 67
    move-object v5, p2

    .line 68
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;Ljava/lang/String;I)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->put(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 76
    .line 77
    return p0
.end method

.method public addConstantPackage(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8Reference(ILjava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public addConstantString(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8Reference(ILjava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public addConstantUtf8(Ljava/lang/String;)I
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-direct {p0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    :goto_0
    if-eqz v2, :cond_1

    .line 11
    .line 12
    iget v3, v2, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 13
    .line 14
    if-ne v3, v0, :cond_0

    .line 15
    .line 16
    iget v3, v2, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 17
    .line 18
    if-ne v3, v1, :cond_0

    .line 19
    .line 20
    iget-object v3, v2, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    iget p0, v2, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 29
    .line 30
    return p0

    .line 31
    :cond_0
    iget-object v2, v2, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPool:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putUTF8(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 41
    .line 42
    .line 43
    new-instance v2, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 44
    .line 45
    iget v3, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 46
    .line 47
    add-int/lit8 v4, v3, 0x1

    .line 48
    .line 49
    iput v4, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 50
    .line 51
    invoke-direct {v2, v3, v0, p1, v1}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->put(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 59
    .line 60
    return p0
.end method

.method public addForwardUninitializedType(Ljava/lang/String;Lnet/bytebuddy/jar/asm/Label;)I
    .locals 8

    .line 1
    invoke-direct {p0, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->getOrAddLabelEntry(Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p2, p2, Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;->index:I

    .line 6
    .line 7
    const/16 v0, 0x82

    .line 8
    .line 9
    invoke-static {v0, p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v7

    .line 13
    invoke-direct {p0, v7}, Lnet/bytebuddy/jar/asm/SymbolTable;->get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget v2, v1, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 20
    .line 21
    if-ne v2, v0, :cond_0

    .line 22
    .line 23
    iget v2, v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 24
    .line 25
    if-ne v2, v7, :cond_0

    .line 26
    .line 27
    iget-wide v2, v1, Lnet/bytebuddy/jar/asm/Symbol;->data:J

    .line 28
    .line 29
    int-to-long v4, p2

    .line 30
    cmp-long v2, v2, v4

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    iget p0, v1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 43
    .line 44
    return p0

    .line 45
    :cond_0
    iget-object v1, v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 49
    .line 50
    iget v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeCount:I

    .line 51
    .line 52
    const/16 v3, 0x82

    .line 53
    .line 54
    int-to-long v5, p2

    .line 55
    move-object v4, p1

    .line 56
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;JI)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addTypeInternal(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0
.end method

.method public addMergedType(II)I
    .locals 8

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    if-ge p1, p2, :cond_0

    .line 4
    .line 5
    int-to-long v1, p1

    .line 6
    int-to-long v3, p2

    .line 7
    :goto_0
    shl-long/2addr v3, v0

    .line 8
    or-long v0, v1, v3

    .line 9
    .line 10
    move-wide v5, v0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    int-to-long v1, p2

    .line 13
    int-to-long v3, p1

    .line 14
    goto :goto_0

    .line 15
    :goto_1
    add-int v0, p1, p2

    .line 16
    .line 17
    const/16 v1, 0x83

    .line 18
    .line 19
    invoke-static {v1, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(II)I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    invoke-direct {p0, v7}, Lnet/bytebuddy/jar/asm/SymbolTable;->get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_2
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget v2, v0, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 30
    .line 31
    if-ne v2, v1, :cond_1

    .line 32
    .line 33
    iget v2, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 34
    .line 35
    if-ne v2, v7, :cond_1

    .line 36
    .line 37
    iget-wide v2, v0, Lnet/bytebuddy/jar/asm/Symbol;->data:J

    .line 38
    .line 39
    cmp-long v2, v2, v5

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    iget p0, v0, Lnet/bytebuddy/jar/asm/Symbol;->info:I

    .line 44
    .line 45
    return p0

    .line 46
    :cond_1
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeTable:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 50
    .line 51
    aget-object p1, v0, p1

    .line 52
    .line 53
    iget-object p1, p1, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 54
    .line 55
    aget-object p2, v0, p2

    .line 56
    .line 57
    iget-object p2, p2, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->classWriter:Lnet/bytebuddy/jar/asm/ClassWriter;

    .line 60
    .line 61
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassWriter;->getCommonSuperClass(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    new-instance v2, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 70
    .line 71
    iget v3, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeCount:I

    .line 72
    .line 73
    const/16 v4, 0x83

    .line 74
    .line 75
    invoke-direct/range {v2 .. v7}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IIJI)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p0, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->put(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iput p1, p0, Lnet/bytebuddy/jar/asm/Symbol;->info:I

    .line 83
    .line 84
    return p1
.end method

.method public addType(Ljava/lang/String;)I
    .locals 4

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {p0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    :goto_0
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget v3, v2, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 14
    .line 15
    if-ne v3, v0, :cond_0

    .line 16
    .line 17
    iget v3, v2, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 18
    .line 19
    if-ne v3, v1, :cond_0

    .line 20
    .line 21
    iget-object v3, v2, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget p0, v2, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 30
    .line 31
    return p0

    .line 32
    :cond_0
    iget-object v2, v2, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance v2, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 36
    .line 37
    iget v3, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeCount:I

    .line 38
    .line 39
    invoke-direct {v2, v3, v0, p1, v1}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addTypeInternal(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0
.end method

.method public addUninitializedType(Ljava/lang/String;I)I
    .locals 8

    .line 1
    const/16 v0, 0x81

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->hash(ILjava/lang/String;I)I

    .line 4
    .line 5
    .line 6
    move-result v7

    .line 7
    invoke-direct {p0, v7}, Lnet/bytebuddy/jar/asm/SymbolTable;->get(I)Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget v2, v1, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 14
    .line 15
    if-ne v2, v0, :cond_0

    .line 16
    .line 17
    iget v2, v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 18
    .line 19
    if-ne v2, v7, :cond_0

    .line 20
    .line 21
    iget-wide v2, v1, Lnet/bytebuddy/jar/asm/Symbol;->data:J

    .line 22
    .line 23
    int-to-long v4, p2

    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget p0, v1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 37
    .line 38
    return p0

    .line 39
    :cond_0
    iget-object v1, v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    new-instance v1, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 43
    .line 44
    iget v2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeCount:I

    .line 45
    .line 46
    const/16 v3, 0x81

    .line 47
    .line 48
    int-to-long v5, p2

    .line 49
    move-object v4, p1

    .line 50
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;-><init>(IILjava/lang/String;JI)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addTypeInternal(Lnet/bytebuddy/jar/asm/SymbolTable$Entry;)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    return p0
.end method

.method public computeBootstrapMethodsSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethods:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "BootstrapMethods"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethods:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 11
    .line 12
    iget p0, p0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 13
    .line 14
    add-int/lit8 p0, p0, 0x8

    .line 15
    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public getClassName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->className:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getConstantPoolCount()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 2
    .line 3
    return p0
.end method

.method public getConstantPoolLength()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPool:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget p0, p0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    return p0
.end method

.method public getForwardUninitializedLabel(I)Lnet/bytebuddy/jar/asm/Label;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->labelTable:[Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeTable:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 4
    .line 5
    aget-object p0, p0, p1

    .line 6
    .line 7
    iget-wide p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->data:J

    .line 8
    .line 9
    long-to-int p0, p0

    .line 10
    aget-object p0, v0, p0

    .line 11
    .line 12
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;->label:Lnet/bytebuddy/jar/asm/Label;

    .line 13
    .line 14
    return-object p0
.end method

.method public getMajorVersion()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->majorVersion:I

    .line 2
    .line 3
    return p0
.end method

.method public getSource()Lnet/bytebuddy/jar/asm/ClassReader;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->sourceClassReader:Lnet/bytebuddy/jar/asm/ClassReader;

    .line 2
    .line 3
    return-object p0
.end method

.method public getType(I)Lnet/bytebuddy/jar/asm/Symbol;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->typeTable:[Lnet/bytebuddy/jar/asm/SymbolTable$Entry;

    .line 2
    .line 3
    aget-object p0, p0, p1

    .line 4
    .line 5
    return-object p0
.end method

.method public putBootstrapMethods(Lnet/bytebuddy/jar/asm/ByteVector;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethods:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "BootstrapMethods"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethods:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 16
    .line 17
    iget v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethodCount:I

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->bootstrapMethods:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 32
    .line 33
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    iget p0, p0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 37
    .line 38
    invoke-virtual {p1, v0, v1, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public putConstantPool(Lnet/bytebuddy/jar/asm/ByteVector;)V
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPoolCount:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->constantPool:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 8
    .line 9
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget p0, p0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setMajorVersionAndClassName(ILjava/lang/String;)I
    .locals 0

    .line 1
    iput p1, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->majorVersion:I

    .line 2
    .line 3
    iput-object p2, p0, Lnet/bytebuddy/jar/asm/SymbolTable;->className:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 10
    .line 11
    return p0
.end method
