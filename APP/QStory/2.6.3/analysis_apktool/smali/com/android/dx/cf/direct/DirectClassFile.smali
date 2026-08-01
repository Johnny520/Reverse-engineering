.class public Lcom/android/dx/cf/direct/DirectClassFile;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/cf/iface/ClassFile;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/cf/direct/DirectClassFile$DcfTypeList;
    }
.end annotation


# static fields
.field private static final CLASS_FILE_MAGIC:I = -0x35014542

.field private static final CLASS_FILE_MAX_MAJOR_VERSION:I = 0x35

.field private static final CLASS_FILE_MAX_MINOR_VERSION:I = 0x0

.field private static final CLASS_FILE_MIN_MAJOR_VERSION:I = 0x2d


# instance fields
.field private accessFlags:I

.field private attributeFactory:Lcom/android/dx/cf/direct/AttributeFactory;

.field private attributes:Lcom/android/dx/cf/iface/StdAttributeList;

.field private final bytes:Lcom/android/dx/util/ByteArray;

.field private fields:Lcom/android/dx/cf/iface/FieldList;

.field private final filePath:Ljava/lang/String;

.field private interfaces:Lcom/android/dx/rop/type/TypeList;

.field private methods:Lcom/android/dx/cf/iface/MethodList;

.field private observer:Lcom/android/dx/cf/iface/ParseObserver;

.field private pool:Lcom/android/dx/rop/cst/StdConstantPool;

.field private final strictParse:Z

.field private superClass:Lcom/android/dx/rop/cst/CstType;

.field private thisClass:Lcom/android/dx/rop/cst/CstType;


# direct methods
.method public constructor <init>(Lcom/android/dx/util/ByteArray;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iput-object p2, p0, Lcom/android/dx/cf/direct/DirectClassFile;->filePath:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 12
    .line 13
    iput-boolean p3, p0, Lcom/android/dx/cf/direct/DirectClassFile;->strictParse:Z

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    iput p1, p0, Lcom/android/dx/cf/direct/DirectClassFile;->accessFlags:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "filePath == null"

    .line 20
    .line 21
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    const-string p0, "bytes == null"

    .line 26
    .line 27
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public constructor <init>([BLjava/lang/String;Z)V
    .locals 1

    .line 31
    new-instance v0, Lcom/android/dx/util/ByteArray;

    invoke-direct {v0, p1}, Lcom/android/dx/util/ByteArray;-><init>([B)V

    invoke-direct {p0, v0, p2, p3}, Lcom/android/dx/cf/direct/DirectClassFile;-><init>(Lcom/android/dx/util/ByteArray;Ljava/lang/String;Z)V

    return-void
.end method

.method private isGoodMagic(I)Z
    .locals 0

    .line 1
    const p0, -0x35014542    # -8346975.0f

    .line 2
    .line 3
    .line 4
    if-ne p1, p0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method private isGoodVersion(II)Z
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    const/16 v0, 0x35

    .line 5
    .line 6
    if-ne p2, v0, :cond_0

    .line 7
    .line 8
    if-gtz p1, :cond_1

    .line 9
    .line 10
    return p0

    .line 11
    :cond_0
    if-ge p2, v0, :cond_1

    .line 12
    .line 13
    const/16 p1, 0x2d

    .line 14
    .line 15
    if-lt p2, p1, :cond_1

    .line 16
    .line 17
    return p0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method private parse()V
    .locals 3

    .line 1
    const-string v0, "...while parsing "

    .line 2
    .line 3
    :try_start_0
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parse0()V
    :try_end_0
    .catch Lcom/android/dx/cf/iface/ParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v1

    .line 8
    new-instance v2, Lcom/android/dx/cf/iface/ParseException;

    .line 9
    .line 10
    invoke-direct {v2, v1}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->filePath:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {v2, p0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v2

    .line 31
    :catch_1
    move-exception v1

    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->filePath:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v1, p0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v1
.end method

.method private parse0()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    if-lt v0, v1, :cond_9

    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 12
    .line 13
    const/4 v1, 0x6

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x2

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v4, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 19
    .line 20
    const-string v5, "begin classfile"

    .line 21
    .line 22
    invoke-interface {v0, v4, v2, v2, v5}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 26
    .line 27
    iget-object v4, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 28
    .line 29
    new-instance v5, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v6, "magic: "

    .line 32
    .line 33
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMagic0()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-static {v6}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const/4 v6, 0x4

    .line 52
    invoke-interface {v0, v4, v2, v6, v5}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 56
    .line 57
    iget-object v4, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 58
    .line 59
    new-instance v5, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v7, "minor_version: "

    .line 62
    .line 63
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMinorVersion0()I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    invoke-static {v7}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-interface {v0, v4, v6, v3, v5}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 85
    .line 86
    iget-object v4, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 87
    .line 88
    new-instance v5, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v6, "major_version: "

    .line 91
    .line 92
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMajorVersion0()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    invoke-static {v6}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-interface {v0, v4, v1, v3, v5}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_0
    iget-boolean v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->strictParse:Z

    .line 114
    .line 115
    const-string v4, ")"

    .line 116
    .line 117
    if-eqz v0, :cond_3

    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMagic0()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-direct {p0, v0}, Lcom/android/dx/cf/direct/DirectClassFile;->isGoodMagic(I)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_2

    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMinorVersion0()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMajorVersion0()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    invoke-direct {p0, v0, v5}, Lcom/android/dx/cf/direct/DirectClassFile;->isGoodVersion(II)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_1
    new-instance v0, Lcom/android/dx/cf/iface/ParseException;

    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMajorVersion0()I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMinorVersion0()I

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    new-instance v2, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string v3, "unsupported class file version "

    .line 157
    .line 158
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v1, "."

    .line 165
    .line 166
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-direct {v0, p0}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v0

    .line 180
    :cond_2
    new-instance v0, Lcom/android/dx/cf/iface/ParseException;

    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMagic0()I

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    new-instance v1, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v2, "bad class file magic ("

    .line 193
    .line 194
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-direct {v0, p0}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v0

    .line 211
    :cond_3
    :goto_0
    new-instance v0, Lcom/android/dx/cf/cst/ConstantPoolParser;

    .line 212
    .line 213
    iget-object v5, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 214
    .line 215
    invoke-direct {v0, v5}, Lcom/android/dx/cf/cst/ConstantPoolParser;-><init>(Lcom/android/dx/util/ByteArray;)V

    .line 216
    .line 217
    .line 218
    iget-object v5, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 219
    .line 220
    invoke-virtual {v0, v5}, Lcom/android/dx/cf/cst/ConstantPoolParser;->setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0}, Lcom/android/dx/cf/cst/ConstantPoolParser;->getPool()Lcom/android/dx/rop/cst/StdConstantPool;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    iput-object v5, p0, Lcom/android/dx/cf/direct/DirectClassFile;->pool:Lcom/android/dx/rop/cst/StdConstantPool;

    .line 228
    .line 229
    invoke-virtual {v5}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Lcom/android/dx/cf/cst/ConstantPoolParser;->getEndOffset()I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    iget-object v5, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 237
    .line 238
    invoke-virtual {v5, v0}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    iget-object v6, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 243
    .line 244
    add-int/lit8 v7, v0, 0x2

    .line 245
    .line 246
    invoke-virtual {v6, v7}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    iget-object v8, p0, Lcom/android/dx/cf/direct/DirectClassFile;->pool:Lcom/android/dx/rop/cst/StdConstantPool;

    .line 251
    .line 252
    invoke-virtual {v8, v6}, Lcom/android/dx/rop/cst/StdConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    check-cast v6, Lcom/android/dx/rop/cst/CstType;

    .line 257
    .line 258
    iput-object v6, p0, Lcom/android/dx/cf/direct/DirectClassFile;->thisClass:Lcom/android/dx/rop/cst/CstType;

    .line 259
    .line 260
    iget-object v6, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 261
    .line 262
    add-int/lit8 v8, v0, 0x4

    .line 263
    .line 264
    invoke-virtual {v6, v8}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    iget-object v9, p0, Lcom/android/dx/cf/direct/DirectClassFile;->pool:Lcom/android/dx/rop/cst/StdConstantPool;

    .line 269
    .line 270
    invoke-virtual {v9, v6}, Lcom/android/dx/rop/cst/StdConstantPool;->get0Ok(I)Lcom/android/dx/rop/cst/Constant;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    check-cast v6, Lcom/android/dx/rop/cst/CstType;

    .line 275
    .line 276
    iput-object v6, p0, Lcom/android/dx/cf/direct/DirectClassFile;->superClass:Lcom/android/dx/rop/cst/CstType;

    .line 277
    .line 278
    iget-object v6, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 279
    .line 280
    add-int/lit8 v9, v0, 0x6

    .line 281
    .line 282
    invoke-virtual {v6, v9}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    iget-object v10, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 287
    .line 288
    if-eqz v10, :cond_4

    .line 289
    .line 290
    iget-object v11, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 291
    .line 292
    new-instance v12, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    const-string v13, "access_flags: "

    .line 295
    .line 296
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-static {v5}, Lcom/android/dx/rop/code/AccessFlags;->classString(I)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v13

    .line 303
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v12

    .line 310
    invoke-interface {v10, v11, v0, v3, v12}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 311
    .line 312
    .line 313
    iget-object v10, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 314
    .line 315
    iget-object v11, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 316
    .line 317
    new-instance v12, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    const-string v13, "this_class: "

    .line 320
    .line 321
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    iget-object v13, p0, Lcom/android/dx/cf/direct/DirectClassFile;->thisClass:Lcom/android/dx/rop/cst/CstType;

    .line 325
    .line 326
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v12

    .line 333
    invoke-interface {v10, v11, v7, v3, v12}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 334
    .line 335
    .line 336
    iget-object v7, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 337
    .line 338
    iget-object v10, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 339
    .line 340
    new-instance v11, Ljava/lang/StringBuilder;

    .line 341
    .line 342
    const-string v12, "super_class: "

    .line 343
    .line 344
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    iget-object v12, p0, Lcom/android/dx/cf/direct/DirectClassFile;->superClass:Lcom/android/dx/rop/cst/CstType;

    .line 348
    .line 349
    invoke-static {v12}, Lcom/android/dx/cf/direct/DirectClassFile;->stringOrNone(Ljava/lang/Object;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v12

    .line 353
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v11

    .line 360
    invoke-interface {v7, v10, v8, v3, v11}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 361
    .line 362
    .line 363
    iget-object v7, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 364
    .line 365
    iget-object v8, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 366
    .line 367
    new-instance v10, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    const-string v11, "interfaces_count: "

    .line 370
    .line 371
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    invoke-static {v10, v6}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v10

    .line 378
    invoke-interface {v7, v8, v9, v3, v10}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 379
    .line 380
    .line 381
    if-eqz v6, :cond_4

    .line 382
    .line 383
    iget-object v7, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 384
    .line 385
    iget-object v8, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 386
    .line 387
    add-int/lit8 v9, v0, 0x8

    .line 388
    .line 389
    const-string v10, "interfaces:"

    .line 390
    .line 391
    invoke-interface {v7, v8, v9, v2, v10}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 392
    .line 393
    .line 394
    :cond_4
    add-int/lit8 v0, v0, 0x8

    .line 395
    .line 396
    invoke-virtual {p0, v0, v6}, Lcom/android/dx/cf/direct/DirectClassFile;->makeTypeList(II)Lcom/android/dx/rop/type/TypeList;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    iput-object v7, p0, Lcom/android/dx/cf/direct/DirectClassFile;->interfaces:Lcom/android/dx/rop/type/TypeList;

    .line 401
    .line 402
    mul-int/2addr v6, v3

    .line 403
    add-int/2addr v6, v0

    .line 404
    iget-boolean v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->strictParse:Z

    .line 405
    .line 406
    if-eqz v0, :cond_6

    .line 407
    .line 408
    iget-object v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->thisClass:Lcom/android/dx/rop/cst/CstType;

    .line 409
    .line 410
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->getClassName()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    iget-object v3, p0, Lcom/android/dx/cf/direct/DirectClassFile;->filePath:Ljava/lang/String;

    .line 419
    .line 420
    const-string v7, ".class"

    .line 421
    .line 422
    invoke-virtual {v3, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    if-eqz v3, :cond_5

    .line 427
    .line 428
    iget-object v3, p0, Lcom/android/dx/cf/direct/DirectClassFile;->filePath:Ljava/lang/String;

    .line 429
    .line 430
    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    if-eqz v3, :cond_5

    .line 435
    .line 436
    iget-object v3, p0, Lcom/android/dx/cf/direct/DirectClassFile;->filePath:Ljava/lang/String;

    .line 437
    .line 438
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 443
    .line 444
    .line 445
    move-result v7

    .line 446
    add-int/2addr v7, v1

    .line 447
    if-ne v3, v7, :cond_5

    .line 448
    .line 449
    goto :goto_1

    .line 450
    :cond_5
    new-instance v1, Lcom/android/dx/cf/iface/ParseException;

    .line 451
    .line 452
    const-string v2, "class name ("

    .line 453
    .line 454
    const-string v3, ") does not match path ("

    .line 455
    .line 456
    invoke-static {v2, v0, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->filePath:Ljava/lang/String;

    .line 461
    .line 462
    invoke-static {v0, p0, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object p0

    .line 466
    invoke-direct {v1, p0}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    throw v1

    .line 470
    :cond_6
    :goto_1
    iput v5, p0, Lcom/android/dx/cf/direct/DirectClassFile;->accessFlags:I

    .line 471
    .line 472
    new-instance v0, Lcom/android/dx/cf/direct/FieldListParser;

    .line 473
    .line 474
    iget-object v1, p0, Lcom/android/dx/cf/direct/DirectClassFile;->thisClass:Lcom/android/dx/rop/cst/CstType;

    .line 475
    .line 476
    iget-object v3, p0, Lcom/android/dx/cf/direct/DirectClassFile;->attributeFactory:Lcom/android/dx/cf/direct/AttributeFactory;

    .line 477
    .line 478
    invoke-direct {v0, p0, v1, v6, v3}, Lcom/android/dx/cf/direct/FieldListParser;-><init>(Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/cf/direct/AttributeFactory;)V

    .line 479
    .line 480
    .line 481
    iget-object v1, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 482
    .line 483
    invoke-virtual {v0, v1}, Lcom/android/dx/cf/direct/MemberListParser;->setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v0}, Lcom/android/dx/cf/direct/FieldListParser;->getList()Lcom/android/dx/cf/iface/StdFieldList;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    iput-object v1, p0, Lcom/android/dx/cf/direct/DirectClassFile;->fields:Lcom/android/dx/cf/iface/FieldList;

    .line 491
    .line 492
    invoke-virtual {v0}, Lcom/android/dx/cf/direct/MemberListParser;->getEndOffset()I

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    new-instance v1, Lcom/android/dx/cf/direct/MethodListParser;

    .line 497
    .line 498
    iget-object v3, p0, Lcom/android/dx/cf/direct/DirectClassFile;->thisClass:Lcom/android/dx/rop/cst/CstType;

    .line 499
    .line 500
    iget-object v4, p0, Lcom/android/dx/cf/direct/DirectClassFile;->attributeFactory:Lcom/android/dx/cf/direct/AttributeFactory;

    .line 501
    .line 502
    invoke-direct {v1, p0, v3, v0, v4}, Lcom/android/dx/cf/direct/MethodListParser;-><init>(Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/cf/direct/AttributeFactory;)V

    .line 503
    .line 504
    .line 505
    iget-object v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 506
    .line 507
    invoke-virtual {v1, v0}, Lcom/android/dx/cf/direct/MemberListParser;->setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/MethodListParser;->getList()Lcom/android/dx/cf/iface/StdMethodList;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    iput-object v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->methods:Lcom/android/dx/cf/iface/MethodList;

    .line 515
    .line 516
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/MemberListParser;->getEndOffset()I

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    new-instance v1, Lcom/android/dx/cf/direct/AttributeListParser;

    .line 521
    .line 522
    iget-object v3, p0, Lcom/android/dx/cf/direct/DirectClassFile;->attributeFactory:Lcom/android/dx/cf/direct/AttributeFactory;

    .line 523
    .line 524
    invoke-direct {v1, p0, v2, v0, v3}, Lcom/android/dx/cf/direct/AttributeListParser;-><init>(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/direct/AttributeFactory;)V

    .line 525
    .line 526
    .line 527
    iget-object v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 528
    .line 529
    invoke-virtual {v1, v0}, Lcom/android/dx/cf/direct/AttributeListParser;->setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/AttributeListParser;->getList()Lcom/android/dx/cf/iface/StdAttributeList;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    iput-object v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->attributes:Lcom/android/dx/cf/iface/StdAttributeList;

    .line 537
    .line 538
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/AttributeListParser;->getEndOffset()I

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    iget-object v1, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 546
    .line 547
    invoke-virtual {v1}, Lcom/android/dx/util/ByteArray;->size()I

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    if-ne v0, v1, :cond_8

    .line 552
    .line 553
    iget-object v1, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 554
    .line 555
    if-eqz v1, :cond_7

    .line 556
    .line 557
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 558
    .line 559
    const-string v3, "end classfile"

    .line 560
    .line 561
    invoke-interface {v1, p0, v0, v2, v3}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 562
    .line 563
    .line 564
    :cond_7
    return-void

    .line 565
    :cond_8
    new-instance p0, Lcom/android/dx/cf/iface/ParseException;

    .line 566
    .line 567
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    new-instance v1, Ljava/lang/StringBuilder;

    .line 572
    .line 573
    const-string v2, "extra bytes at end of class file, at offset "

    .line 574
    .line 575
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-direct {p0, v0}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    throw p0

    .line 589
    :cond_9
    new-instance p0, Lcom/android/dx/cf/iface/ParseException;

    .line 590
    .line 591
    const-string v0, "severely truncated class file"

    .line 592
    .line 593
    invoke-direct {p0, v0}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    throw p0
.end method

.method private parseToEndIfNecessary()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->attributes:Lcom/android/dx/cf/iface/StdAttributeList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parse()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private parseToInterfacesIfNecessary()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->accessFlags:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parse()V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public static stringOrNone(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "(none)"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public getAccessFlags()I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parseToInterfacesIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->accessFlags:I

    .line 5
    .line 6
    return p0
.end method

.method public getAttributes()Lcom/android/dx/cf/iface/AttributeList;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parseToEndIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->attributes:Lcom/android/dx/cf/iface/StdAttributeList;

    .line 5
    .line 6
    return-object p0
.end method

.method public getBootstrapMethods()Lcom/android/dx/cf/code/BootstrapMethodsList;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getAttributes()Lcom/android/dx/cf/iface/AttributeList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "BootstrapMethods"

    .line 6
    .line 7
    invoke-interface {p0, v0}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/android/dx/cf/attrib/AttBootstrapMethods;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/android/dx/cf/attrib/AttBootstrapMethods;->getBootstrapMethods()Lcom/android/dx/cf/code/BootstrapMethodsList;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Lcom/android/dx/cf/code/BootstrapMethodsList;->EMPTY:Lcom/android/dx/cf/code/BootstrapMethodsList;

    .line 21
    .line 22
    return-object p0
.end method

.method public getBytes()Lcom/android/dx/util/ByteArray;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parseToInterfacesIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->pool:Lcom/android/dx/rop/cst/StdConstantPool;

    .line 5
    .line 6
    return-object p0
.end method

.method public getFields()Lcom/android/dx/cf/iface/FieldList;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parseToEndIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->fields:Lcom/android/dx/cf/iface/FieldList;

    .line 5
    .line 6
    return-object p0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->filePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInterfaces()Lcom/android/dx/rop/type/TypeList;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parseToInterfacesIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->interfaces:Lcom/android/dx/rop/type/TypeList;

    .line 5
    .line 6
    return-object p0
.end method

.method public getMagic()I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parseToInterfacesIfNecessary()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMagic0()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public getMagic0()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public getMajorVersion()I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parseToInterfacesIfNecessary()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMajorVersion0()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public getMajorVersion0()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    invoke-virtual {p0, v0}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public getMethods()Lcom/android/dx/cf/iface/MethodList;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parseToEndIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->methods:Lcom/android/dx/cf/iface/MethodList;

    .line 5
    .line 6
    return-object p0
.end method

.method public getMinorVersion()I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parseToInterfacesIfNecessary()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMinorVersion0()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public getMinorVersion0()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    invoke-virtual {p0, v0}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public getSourceFile()Lcom/android/dx/rop/cst/CstString;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getAttributes()Lcom/android/dx/cf/iface/AttributeList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "SourceFile"

    .line 6
    .line 7
    invoke-interface {p0, v0}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    instance-of v0, p0, Lcom/android/dx/cf/attrib/AttSourceFile;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p0, Lcom/android/dx/cf/attrib/AttSourceFile;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/android/dx/cf/attrib/AttSourceFile;->getSourceFile()Lcom/android/dx/rop/cst/CstString;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public getSuperclass()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parseToInterfacesIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->superClass:Lcom/android/dx/rop/cst/CstType;

    .line 5
    .line 6
    return-object p0
.end method

.method public getThisClass()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->parseToInterfacesIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/cf/direct/DirectClassFile;->thisClass:Lcom/android/dx/rop/cst/CstType;

    .line 5
    .line 6
    return-object p0
.end method

.method public makeTypeList(II)Lcom/android/dx/rop/type/TypeList;
    .locals 6

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v4, p0, Lcom/android/dx/cf/direct/DirectClassFile;->pool:Lcom/android/dx/rop/cst/StdConstantPool;

    .line 7
    .line 8
    if-eqz v4, :cond_1

    .line 9
    .line 10
    new-instance v0, Lcom/android/dx/cf/direct/DirectClassFile$DcfTypeList;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/android/dx/cf/direct/DirectClassFile;->bytes:Lcom/android/dx/util/ByteArray;

    .line 13
    .line 14
    iget-object v5, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 15
    .line 16
    move v2, p1

    .line 17
    move v3, p2

    .line 18
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/cf/direct/DirectClassFile$DcfTypeList;-><init>(Lcom/android/dx/util/ByteArray;IILcom/android/dx/rop/cst/StdConstantPool;Lcom/android/dx/cf/iface/ParseObserver;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    const-string p0, "pool not yet initialized"

    .line 23
    .line 24
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public setAttributeFactory(Lcom/android/dx/cf/direct/AttributeFactory;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/android/dx/cf/direct/DirectClassFile;->attributeFactory:Lcom/android/dx/cf/direct/AttributeFactory;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "attributeFactory == null"

    .line 7
    .line 8
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/direct/DirectClassFile;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 2
    .line 3
    return-void
.end method
