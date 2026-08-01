.class public Lcom/android/dx/dex/file/DebugInfoDecoder;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;,
        Lcom/android/dx/dex/file/DebugInfoDecoder$PositionEntry;
    }
.end annotation


# instance fields
.field private address:I

.field private final codesize:I

.field private final desc:Lcom/android/dx/rop/type/Prototype;

.field private final encoded:[B

.field private final file:Lcom/android/dx/dex/file/DexFile;

.field private final isStatic:Z

.field private final lastEntryForReg:[Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

.field private line:I

.field private final locals:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final positions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/file/DebugInfoDecoder$PositionEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final regSize:I

.field private final thisStringIdx:I


# direct methods
.method public constructor <init>([BIIZLcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/dex/file/DexFile;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->line:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->address:I

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->encoded:[B

    .line 13
    .line 14
    iput-boolean p4, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->isStatic:Z

    .line 15
    .line 16
    invoke-virtual {p5}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->desc:Lcom/android/dx/rop/type/Prototype;

    .line 21
    .line 22
    iput-object p6, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->file:Lcom/android/dx/dex/file/DexFile;

    .line 23
    .line 24
    iput p3, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->regSize:I

    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->positions:Ljava/util/ArrayList;

    .line 32
    .line 33
    new-instance p1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    .line 39
    .line 40
    iput p2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->codesize:I

    .line 41
    .line 42
    new-array p1, p3, [Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 43
    .line 44
    iput-object p1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 45
    .line 46
    :try_start_0
    invoke-virtual {p6}, Lcom/android/dx/dex/file/DexFile;->getStringIds()Lcom/android/dx/dex/file/StringIdsSection;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance p2, Lcom/android/dx/rop/cst/CstString;

    .line 51
    .line 52
    const-string p3, "this"

    .line 53
    .line 54
    invoke-direct {p2, p3}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lcom/android/dx/dex/file/StringIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstString;)I

    .line 58
    .line 59
    .line 60
    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    goto :goto_0

    .line 62
    :catch_0
    const/4 p1, -0x1

    .line 63
    :goto_0
    iput p1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->thisStringIdx:I

    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    const-string p0, "encoded == null"

    .line 67
    .line 68
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    throw p0
.end method

.method private decode0()V
    .locals 12

    .line 1
    new-instance v0, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->encoded:[B

    .line 4
    .line 5
    invoke-direct {v0, v1}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;-><init>([B)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏哲兰楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iput v1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->line:I

    .line 13
    .line 14
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏哲兰楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->desc:Lcom/android/dx/rop/type/Prototype;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-direct {p0}, Lcom/android/dx/dex/file/DebugInfoDecoder;->getParamBase()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    invoke-virtual {v2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-ne v1, v3, :cond_6

    .line 33
    .line 34
    iget-boolean v3, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->isStatic:Z

    .line 35
    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    new-instance v3, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 39
    .line 40
    iget v7, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->thisStringIdx:I

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x1

    .line 46
    invoke-direct/range {v3 .. v9}, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V

    .line 47
    .line 48
    .line 49
    iget-object v4, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    iget-object v4, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 55
    .line 56
    aput-object v3, v4, v6

    .line 57
    .line 58
    add-int/lit8 v6, v6, 0x1

    .line 59
    .line 60
    :cond_0
    const/4 v3, 0x0

    .line 61
    move v7, v6

    .line 62
    :goto_0
    if-ge v3, v1, :cond_2

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Lcom/android/dx/rop/type/StdTypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    invoke-direct {p0, v0}, Lcom/android/dx/dex/file/DebugInfoDecoder;->readStringIndex(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    const/4 v4, -0x1

    .line 73
    if-ne v8, v4, :cond_1

    .line 74
    .line 75
    new-instance v4, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 76
    .line 77
    const/4 v9, 0x0

    .line 78
    const/4 v10, 0x0

    .line 79
    const/4 v5, 0x0

    .line 80
    const/4 v6, 0x1

    .line 81
    const/4 v8, -0x1

    .line 82
    invoke-direct/range {v4 .. v10}, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    new-instance v4, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 87
    .line 88
    const/4 v9, 0x0

    .line 89
    const/4 v10, 0x0

    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x1

    .line 92
    invoke-direct/range {v4 .. v10}, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V

    .line 93
    .line 94
    .line 95
    :goto_1
    iget-object v5, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    iget-object v5, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 101
    .line 102
    aput-object v4, v5, v7

    .line 103
    .line 104
    invoke-virtual {v11}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    add-int/2addr v7, v4

    .line 109
    add-int/lit8 v3, v3, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_2
    :goto_2
    :pswitch_0
    invoke-virtual {v0}, L飘花落叶言楪子世苏哲兰/飘花落叶言子楪世苏哲兰;->readByte()B

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    and-int/lit16 v1, v1, 0xff

    .line 117
    .line 118
    packed-switch v1, :pswitch_data_0

    .line 119
    .line 120
    .line 121
    const/16 v2, 0xa

    .line 122
    .line 123
    if-lt v1, v2, :cond_3

    .line 124
    .line 125
    add-int/lit8 v1, v1, -0xa

    .line 126
    .line 127
    iget v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->address:I

    .line 128
    .line 129
    div-int/lit8 v3, v1, 0xf

    .line 130
    .line 131
    add-int/2addr v3, v2

    .line 132
    iput v3, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->address:I

    .line 133
    .line 134
    iget v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->line:I

    .line 135
    .line 136
    rem-int/lit8 v1, v1, 0xf

    .line 137
    .line 138
    add-int/lit8 v1, v1, -0x4

    .line 139
    .line 140
    add-int/2addr v1, v2

    .line 141
    iput v1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->line:I

    .line 142
    .line 143
    iget-object v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->positions:Ljava/util/ArrayList;

    .line 144
    .line 145
    new-instance v4, Lcom/android/dx/dex/file/DebugInfoDecoder$PositionEntry;

    .line 146
    .line 147
    invoke-direct {v4, v3, v1}, Lcom/android/dx/dex/file/DebugInfoDecoder$PositionEntry;-><init>(II)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_3
    const-string p0, "Invalid extended opcode encountered "

    .line 155
    .line 156
    invoke-static {v1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :pswitch_1
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏哲兰楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    :try_start_0
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 169
    .line 170
    aget-object v1, v1, v4

    .line 171
    .line 172
    iget-boolean v2, v1, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->isStart:Z

    .line 173
    .line 174
    if-nez v2, :cond_4

    .line 175
    .line 176
    move-object v2, v1

    .line 177
    new-instance v1, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 178
    .line 179
    move-object v3, v2

    .line 180
    iget v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->address:I

    .line 181
    .line 182
    iget v5, v3, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->nameIndex:I

    .line 183
    .line 184
    iget v6, v3, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->typeIndex:I

    .line 185
    .line 186
    const/4 v7, 0x0

    .line 187
    const/4 v3, 0x1

    .line 188
    invoke-direct/range {v1 .. v7}, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    .line 190
    .line 191
    iget-object v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    iget-object v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 197
    .line 198
    aput-object v1, v2, v4

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_4
    :try_start_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 202
    .line 203
    new-instance v0, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 206
    .line 207
    .line 208
    const-string v1, "nonsensical RESTART_LOCAL on live register v"

    .line 209
    .line 210
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw p0
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 224
    :catch_0
    const-string p0, "Encountered RESTART_LOCAL on new v"

    .line 225
    .line 226
    invoke-static {v4, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :pswitch_2
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏哲兰楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    :try_start_2
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 239
    .line 240
    aget-object v1, v1, v4

    .line 241
    .line 242
    iget-boolean v2, v1, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->isStart:Z

    .line 243
    .line 244
    if-eqz v2, :cond_5

    .line 245
    .line 246
    move-object v2, v1

    .line 247
    new-instance v1, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 248
    .line 249
    move-object v3, v2

    .line 250
    iget v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->address:I

    .line 251
    .line 252
    iget v5, v3, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->nameIndex:I

    .line 253
    .line 254
    iget v6, v3, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->typeIndex:I

    .line 255
    .line 256
    iget v7, v3, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->signatureIndex:I

    .line 257
    .line 258
    const/4 v3, 0x0

    .line 259
    invoke-direct/range {v1 .. v7}, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1

    .line 260
    .line 261
    .line 262
    iget-object v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    iget-object v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 268
    .line 269
    aput-object v1, v2, v4

    .line 270
    .line 271
    goto/16 :goto_2

    .line 272
    .line 273
    :cond_5
    :try_start_3
    new-instance p0, Ljava/lang/RuntimeException;

    .line 274
    .line 275
    new-instance v0, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 278
    .line 279
    .line 280
    const-string v1, "nonsensical END_LOCAL on dead register v"

    .line 281
    .line 282
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw p0
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_1

    .line 296
    :catch_1
    const-string p0, "Encountered END_LOCAL on new v"

    .line 297
    .line 298
    invoke-static {v4, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :pswitch_3
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏哲兰楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    invoke-direct {p0, v0}, Lcom/android/dx/dex/file/DebugInfoDecoder;->readStringIndex(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 311
    .line 312
    .line 313
    move-result v5

    .line 314
    invoke-direct {p0, v0}, Lcom/android/dx/dex/file/DebugInfoDecoder;->readStringIndex(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    invoke-direct {p0, v0}, Lcom/android/dx/dex/file/DebugInfoDecoder;->readStringIndex(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 319
    .line 320
    .line 321
    move-result v7

    .line 322
    new-instance v1, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 323
    .line 324
    iget v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->address:I

    .line 325
    .line 326
    const/4 v3, 0x1

    .line 327
    invoke-direct/range {v1 .. v7}, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V

    .line 328
    .line 329
    .line 330
    iget-object v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    iget-object v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 336
    .line 337
    aput-object v1, v2, v4

    .line 338
    .line 339
    goto/16 :goto_2

    .line 340
    .line 341
    :pswitch_4
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏哲兰楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    invoke-direct {p0, v0}, Lcom/android/dx/dex/file/DebugInfoDecoder;->readStringIndex(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 346
    .line 347
    .line 348
    move-result v9

    .line 349
    invoke-direct {p0, v0}, Lcom/android/dx/dex/file/DebugInfoDecoder;->readStringIndex(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    new-instance v5, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 354
    .line 355
    iget v6, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->address:I

    .line 356
    .line 357
    const/4 v7, 0x1

    .line 358
    const/4 v11, 0x0

    .line 359
    invoke-direct/range {v5 .. v11}, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V

    .line 360
    .line 361
    .line 362
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    .line 363
    .line 364
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 368
    .line 369
    aput-object v5, v1, v8

    .line 370
    .line 371
    goto/16 :goto_2

    .line 372
    .line 373
    :pswitch_5
    iget v1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->line:I

    .line 374
    .line 375
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏哲楪兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    add-int/2addr v2, v1

    .line 380
    iput v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->line:I

    .line 381
    .line 382
    goto/16 :goto_2

    .line 383
    .line 384
    :pswitch_6
    iget v1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->address:I

    .line 385
    .line 386
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏哲兰楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    add-int/2addr v2, v1

    .line 391
    iput v2, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->address:I

    .line 392
    .line 393
    goto/16 :goto_2

    .line 394
    .line 395
    :pswitch_7
    return-void

    .line 396
    :cond_6
    const-string p0, "Mismatch between parameters_size and prototype"

    .line 397
    .line 398
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    return-void

    .line 402
    nop

    .line 403
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private getParamBase()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->regSize:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->desc:Lcom/android/dx/rop/type/Prototype;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/android/dx/rop/type/StdTypeList;->getWordCount()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-int/2addr v0, v1

    .line 14
    iget-boolean p0, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->isStatic:Z

    .line 15
    .line 16
    xor-int/lit8 p0, p0, 0x1

    .line 17
    .line 18
    sub-int/2addr v0, p0

    .line 19
    return v0
.end method

.method private readStringIndex(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏哲兰楪(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    add-int/lit8 p0, p0, -0x1

    .line 6
    .line 7
    return p0
.end method

.method public static validateEncode([BLcom/android/dx/dex/file/DexFile;Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/dex/code/DalvCode;Z)V
    .locals 8

    .line 1
    invoke-virtual {p3}, Lcom/android/dx/dex/code/DalvCode;->getPositions()Lcom/android/dx/dex/code/PositionList;

    .line 2
    .line 3
    .line 4
    move-result-object v6

    .line 5
    invoke-virtual {p3}, Lcom/android/dx/dex/code/DalvCode;->getLocals()Lcom/android/dx/dex/code/LocalList;

    .line 6
    .line 7
    .line 8
    move-result-object v7

    .line 9
    invoke-virtual {p3}, Lcom/android/dx/dex/code/DalvCode;->getInsns()Lcom/android/dx/dex/code/DalvInsnList;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p3}, Lcom/android/dx/dex/code/DalvInsnList;->codeSize()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p3}, Lcom/android/dx/dex/code/DalvInsnList;->getRegistersSize()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    move-object v0, p0

    .line 22
    move-object v5, p1

    .line 23
    move-object v4, p2

    .line 24
    move v3, p4

    .line 25
    :try_start_0
    invoke-static/range {v0 .. v7}, Lcom/android/dx/dex/file/DebugInfoDecoder;->validateEncode0([BIIZLcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/dex/code/PositionList;Lcom/android/dx/dex/code/LocalList;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception v0

    .line 30
    move-object p0, v0

    .line 31
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 32
    .line 33
    const-string p2, "instructions:"

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    const-string p4, "  "

    .line 42
    .line 43
    invoke-virtual {p3, p1, p4, p2}, Lcom/android/dx/dex/code/DalvInsnList;->debugPrint(Ljava/io/OutputStream;Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 47
    .line 48
    const-string p2, "local list:"

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 54
    .line 55
    invoke-virtual {v7, p1, p4}, Lcom/android/dx/dex/code/LocalList;->debugPrint(Ljava/io/PrintStream;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string p2, "while processing "

    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Lcom/android/dx/rop/cst/CstMemberRef;->toHuman()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p0, p1}, Lcom/android/dex/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/android/dex/util/ExceptionWithContext;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    throw p0
.end method

.method private static validateEncode0([BIIZLcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/dex/code/PositionList;Lcom/android/dx/dex/code/LocalList;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/android/dx/dex/file/DebugInfoDecoder;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move v2, p1

    .line 5
    move v3, p2

    .line 6
    move v4, p3

    .line 7
    move-object v5, p4

    .line 8
    move-object v6, p5

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/android/dx/dex/file/DebugInfoDecoder;-><init>([BIIZLcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/dex/file/DexFile;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/android/dx/dex/file/DebugInfoDecoder;->decode()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/android/dx/dex/file/DebugInfoDecoder;->getPositionList()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p6}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-ne p1, p2, :cond_10

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lcom/android/dx/dex/file/DebugInfoDecoder$PositionEntry;

    .line 44
    .line 45
    invoke-virtual {p6}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    add-int/lit8 p2, p2, -0x1

    .line 50
    .line 51
    :goto_1
    if-ltz p2, :cond_1

    .line 52
    .line 53
    invoke-virtual {p6, p2}, Lcom/android/dx/dex/code/PositionList;->get(I)Lcom/android/dx/dex/code/PositionList$Entry;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    iget p4, p1, Lcom/android/dx/dex/file/DebugInfoDecoder$PositionEntry;->line:I

    .line 58
    .line 59
    invoke-virtual {p3}, Lcom/android/dx/dex/code/PositionList$Entry;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 60
    .line 61
    .line 62
    move-result-object p5

    .line 63
    invoke-virtual {p5}, Lcom/android/dx/rop/code/SourcePosition;->getLine()I

    .line 64
    .line 65
    .line 66
    move-result p5

    .line 67
    if-ne p4, p5, :cond_0

    .line 68
    .line 69
    iget p4, p1, Lcom/android/dx/dex/file/DebugInfoDecoder$PositionEntry;->address:I

    .line 70
    .line 71
    invoke-virtual {p3}, Lcom/android/dx/dex/code/PositionList$Entry;->getAddress()I

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-ne p4, p3, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    iget p0, p1, Lcom/android/dx/dex/file/DebugInfoDecoder$PositionEntry;->address:I

    .line 82
    .line 83
    const-string p2, ", "

    .line 84
    .line 85
    iget p1, p1, Lcom/android/dx/dex/file/DebugInfoDecoder$PositionEntry;->line:I

    .line 86
    .line 87
    const-string p3, "Could not match position entry: "

    .line 88
    .line 89
    invoke-static {p3, p0, p2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;ILjava/lang/Object;I)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    invoke-virtual {v0}, Lcom/android/dx/dex/file/DebugInfoDecoder;->getLocals()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    iget p1, v0, Lcom/android/dx/dex/file/DebugInfoDecoder;->thisStringIdx:I

    .line 98
    .line 99
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    invoke-direct {v0}, Lcom/android/dx/dex/file/DebugInfoDecoder;->getParamBase()I

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    const/4 p4, 0x0

    .line 108
    move p5, p4

    .line 109
    :goto_2
    if-ge p5, p2, :cond_7

    .line 110
    .line 111
    invoke-interface {p0, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p6

    .line 115
    check-cast p6, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 116
    .line 117
    iget v0, p6, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->nameIndex:I

    .line 118
    .line 119
    if-ltz v0, :cond_3

    .line 120
    .line 121
    if-ne v0, p1, :cond_6

    .line 122
    .line 123
    :cond_3
    add-int/lit8 v0, p5, 0x1

    .line 124
    .line 125
    :goto_3
    if-ge v0, p2, :cond_6

    .line 126
    .line 127
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 132
    .line 133
    iget v2, v1, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->address:I

    .line 134
    .line 135
    if-eqz v2, :cond_4

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_4
    iget v2, p6, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->reg:I

    .line 139
    .line 140
    iget v3, v1, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->reg:I

    .line 141
    .line 142
    if-ne v2, v3, :cond_5

    .line 143
    .line 144
    iget-boolean v2, v1, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->isStart:Z

    .line 145
    .line 146
    if-eqz v2, :cond_5

    .line 147
    .line 148
    invoke-interface {p0, p5, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    invoke-interface {p0, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    add-int/lit8 p2, p2, -0x1

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_6
    :goto_4
    add-int/lit8 p5, p5, 0x1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_7
    invoke-virtual {p7}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    move p5, p4

    .line 168
    :goto_5
    if-ge p4, p1, :cond_f

    .line 169
    .line 170
    invoke-virtual {p7, p4}, Lcom/android/dx/dex/code/LocalList;->get(I)Lcom/android/dx/dex/code/LocalList$Entry;

    .line 171
    .line 172
    .line 173
    move-result-object p6

    .line 174
    invoke-virtual {p6}, Lcom/android/dx/dex/code/LocalList$Entry;->getDisposition()Lcom/android/dx/dex/code/LocalList$Disposition;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    sget-object v1, Lcom/android/dx/dex/code/LocalList$Disposition;->END_REPLACED:Lcom/android/dx/dex/code/LocalList$Disposition;

    .line 179
    .line 180
    if-ne v0, v1, :cond_8

    .line 181
    .line 182
    goto/16 :goto_9

    .line 183
    .line 184
    :cond_8
    invoke-interface {p0, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 189
    .line 190
    iget v1, v0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->nameIndex:I

    .line 191
    .line 192
    if-ltz v1, :cond_9

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_9
    add-int/lit8 p5, p5, 0x1

    .line 196
    .line 197
    if-lt p5, p2, :cond_8

    .line 198
    .line 199
    :goto_6
    iget v1, v0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->address:I

    .line 200
    .line 201
    iget v2, v0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->reg:I

    .line 202
    .line 203
    invoke-virtual {p6}, Lcom/android/dx/dex/code/LocalList$Entry;->getRegister()I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    const-string v4, " / decoded "

    .line 208
    .line 209
    if-eq v2, v3, :cond_a

    .line 210
    .line 211
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 212
    .line 213
    new-instance p2, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    const-string p3, "local register mismatch at orig "

    .line 216
    .line 217
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_a
    iget-boolean v2, v0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->isStart:Z

    .line 238
    .line 239
    invoke-virtual {p6}, Lcom/android/dx/dex/code/LocalList$Entry;->isStart()Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-eq v2, v3, :cond_b

    .line 244
    .line 245
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 246
    .line 247
    new-instance p2, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    const-string p3, "local start/end mismatch at orig "

    .line 250
    .line 251
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_b
    invoke-virtual {p6}, Lcom/android/dx/dex/code/LocalList$Entry;->getAddress()I

    .line 272
    .line 273
    .line 274
    move-result p6

    .line 275
    if-eq v1, p6, :cond_e

    .line 276
    .line 277
    if-nez v1, :cond_c

    .line 278
    .line 279
    iget p6, v0, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;->reg:I

    .line 280
    .line 281
    if-ge p6, p3, :cond_e

    .line 282
    .line 283
    :cond_c
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 284
    .line 285
    new-instance p2, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    const-string p3, "local address mismatch at orig "

    .line 288
    .line 289
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    :goto_7
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 309
    .line 310
    const-string p2, "decoded locals:"

    .line 311
    .line 312
    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result p1

    .line 323
    if-eqz p1, :cond_d

    .line 324
    .line 325
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    check-cast p1, Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 330
    .line 331
    sget-object p2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 332
    .line 333
    new-instance p3, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    const-string p4, "  "

    .line 336
    .line 337
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    goto :goto_8

    .line 351
    :cond_d
    const-string p0, "local table problem"

    .line 352
    .line 353
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    return-void

    .line 357
    :cond_e
    add-int/lit8 p5, p5, 0x1

    .line 358
    .line 359
    :goto_9
    add-int/lit8 p4, p4, 0x1

    .line 360
    .line 361
    goto/16 :goto_5

    .line 362
    .line 363
    :cond_f
    return-void

    .line 364
    :cond_10
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 365
    .line 366
    .line 367
    move-result p0

    .line 368
    const-string p1, " expected "

    .line 369
    .line 370
    invoke-virtual {p6}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 371
    .line 372
    .line 373
    move-result p2

    .line 374
    const-string p3, "Decoded positions table not same size was "

    .line 375
    .line 376
    invoke-static {p3, p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;ILjava/lang/Object;I)V

    .line 377
    .line 378
    .line 379
    return-void
.end method


# virtual methods
.method public decode()V
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/android/dx/dex/file/DebugInfoDecoder;->decode0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p0

    .line 6
    const-string v0, "...while decoding debug info"

    .line 7
    .line 8
    invoke-static {p0, v0}, Lcom/android/dex/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/android/dex/util/ExceptionWithContext;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    throw p0
.end method

.method public getLocals()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/dx/dex/file/DebugInfoDecoder$LocalEntry;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPositionList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/dx/dex/file/DebugInfoDecoder$PositionEntry;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DebugInfoDecoder;->positions:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method
