.class public final Lcom/android/dx/dex/file/CatchStructs;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static final TRY_ITEM_WRITE_SIZE:I = 0x8


# instance fields
.field private final code:Lcom/android/dx/dex/code/DalvCode;

.field private encodedHandlerHeaderSize:I

.field private encodedHandlers:[B

.field private handlerOffsets:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Lcom/android/dx/dex/code/CatchHandlerList;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private table:Lcom/android/dx/dex/code/CatchTable;


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/code/DalvCode;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/dex/file/CatchStructs;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/android/dx/dex/file/CatchStructs;->table:Lcom/android/dx/dex/code/CatchTable;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/dex/file/CatchStructs;->encodedHandlers:[B

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/android/dx/dex/file/CatchStructs;->encodedHandlerHeaderSize:I

    .line 13
    .line 14
    iput-object p1, p0, Lcom/android/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    .line 15
    .line 16
    return-void
.end method

.method private static annotateAndConsumeHandlers(Lcom/android/dx/dex/code/CatchHandlerList;IILjava/lang/String;Ljava/io/PrintWriter;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p1, ": "

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p3, p1}, Lcom/android/dx/dex/code/CatchHandlerList;->toHuman(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p4, :cond_0

    .line 27
    .line 28
    invoke-virtual {p4, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-interface {p5, p2, p0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private annotateEntries(Ljava/lang/String;Ljava/io/PrintWriter;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/file/CatchStructs;->finishProcessingIfNecessary()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    move v2, v0

    .line 15
    :goto_1
    if-eqz v1, :cond_2

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    goto :goto_2

    .line 19
    :cond_2
    move v3, v0

    .line 20
    :goto_2
    iget-object v4, p0, Lcom/android/dx/dex/file/CatchStructs;->table:Lcom/android/dx/dex/code/CatchTable;

    .line 21
    .line 22
    invoke-virtual {v4}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const-string v5, "  "

    .line 27
    .line 28
    invoke-static {p1, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    const-string v5, "tries:"

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    new-instance v6, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-interface {p3, v0, v5}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_3
    new-instance v6, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :goto_3
    move v5, v0

    .line 74
    :goto_4
    if-ge v5, v4, :cond_5

    .line 75
    .line 76
    iget-object v6, p0, Lcom/android/dx/dex/file/CatchStructs;->table:Lcom/android/dx/dex/code/CatchTable;

    .line 77
    .line 78
    invoke-virtual {v6, v5}, Lcom/android/dx/dex/code/CatchTable;->get(I)Lcom/android/dx/dex/code/CatchTable$Entry;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v6}, Lcom/android/dx/dex/code/CatchTable$Entry;->getHandlers()Lcom/android/dx/dex/code/CatchHandlerList;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    const-string v8, "try "

    .line 87
    .line 88
    invoke-static {v9, v8}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-virtual {v6}, Lcom/android/dx/dex/code/CatchTable$Entry;->getStart()I

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    invoke-static {v10}, Lcom/android/dx/util/Hex;->u2or4(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v10, ".."

    .line 104
    .line 105
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6}, Lcom/android/dx/dex/code/CatchTable$Entry;->getEnd()I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    invoke-static {v6}, Lcom/android/dx/util/Hex;->u2or4(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    const-string v8, ""

    .line 124
    .line 125
    invoke-virtual {v7, v9, v8}, Lcom/android/dx/dex/code/CatchHandlerList;->toHuman(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    if-eqz v1, :cond_4

    .line 130
    .line 131
    invoke-interface {p3, v2, v6}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {p3, v3, v7}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_4
    invoke-virtual {p2, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_5
    if-nez v1, :cond_6

    .line 148
    .line 149
    return-void

    .line 150
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string p1, "handlers:"

    .line 159
    .line 160
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-interface {p3, v0, p1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 168
    .line 169
    .line 170
    iget p1, p0, Lcom/android/dx/dex/file/CatchStructs;->encodedHandlerHeaderSize:I

    .line 171
    .line 172
    const-string v1, "size: "

    .line 173
    .line 174
    invoke-static {v9, v1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    iget-object v2, p0, Lcom/android/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/util/TreeMap;->size()I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-interface {p3, p1, v1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 196
    .line 197
    .line 198
    iget-object p1, p0, Lcom/android/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    const/4 v1, 0x0

    .line 209
    :goto_6
    move v7, v0

    .line 210
    move-object v6, v1

    .line 211
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_8

    .line 216
    .line 217
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    check-cast v0, Ljava/util/Map$Entry;

    .line 222
    .line 223
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    check-cast v1, Lcom/android/dx/dex/code/CatchHandlerList;

    .line 228
    .line 229
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    check-cast v0, Ljava/lang/Integer;

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-eqz v6, :cond_7

    .line 240
    .line 241
    sub-int v8, v0, v7

    .line 242
    .line 243
    move-object v10, p2

    .line 244
    move-object v11, p3

    .line 245
    invoke-static/range {v6 .. v11}, Lcom/android/dx/dex/file/CatchStructs;->annotateAndConsumeHandlers(Lcom/android/dx/dex/code/CatchHandlerList;IILjava/lang/String;Ljava/io/PrintWriter;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 246
    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_7
    move-object v10, p2

    .line 250
    move-object v11, p3

    .line 251
    :goto_7
    move-object p2, v10

    .line 252
    move-object p3, v11

    .line 253
    goto :goto_6

    .line 254
    :cond_8
    move-object v10, p2

    .line 255
    move-object v11, p3

    .line 256
    iget-object p0, p0, Lcom/android/dx/dex/file/CatchStructs;->encodedHandlers:[B

    .line 257
    .line 258
    array-length p0, p0

    .line 259
    sub-int v8, p0, v7

    .line 260
    .line 261
    invoke-static/range {v6 .. v11}, Lcom/android/dx/dex/file/CatchStructs;->annotateAndConsumeHandlers(Lcom/android/dx/dex/code/CatchHandlerList;IILjava/lang/String;Ljava/io/PrintWriter;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 262
    .line 263
    .line 264
    return-void
.end method

.method private finishProcessingIfNecessary()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/CatchStructs;->table:Lcom/android/dx/dex/code/CatchTable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/CatchStructs;->code:Lcom/android/dx/dex/code/DalvCode;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/android/dx/dex/code/DalvCode;->getCatches()Lcom/android/dx/dex/code/CatchTable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/android/dx/dex/file/CatchStructs;->table:Lcom/android/dx/dex/code/CatchTable;

    .line 12
    .line 13
    :cond_0
    return-void
.end method


# virtual methods
.method public debugPrint(Ljava/io/PrintWriter;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, p1, v0}, Lcom/android/dx/dex/file/CatchStructs;->annotateEntries(Ljava/lang/String;Ljava/io/PrintWriter;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public encode(Lcom/android/dx/dex/file/DexFile;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/file/CatchStructs;->finishProcessingIfNecessary()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, Lcom/android/dx/dex/file/CatchStructs;->table:Lcom/android/dx/dex/code/CatchTable;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    new-instance v1, Ljava/util/TreeMap;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/android/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    move v2, v1

    .line 23
    :goto_0
    iget-object v3, p0, Lcom/android/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    .line 24
    .line 25
    if-ge v2, v0, :cond_0

    .line 26
    .line 27
    iget-object v4, p0, Lcom/android/dx/dex/file/CatchStructs;->table:Lcom/android/dx/dex/code/CatchTable;

    .line 28
    .line 29
    invoke-virtual {v4, v2}, Lcom/android/dx/dex/code/CatchTable;->get(I)Lcom/android/dx/dex/code/CatchTable$Entry;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4}, Lcom/android/dx/dex/code/CatchTable$Entry;->getHandlers()Lcom/android/dx/dex/code/CatchHandlerList;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-virtual {v3, v4, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v3}, Ljava/util/TreeMap;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const v2, 0xffff

    .line 49
    .line 50
    .line 51
    if-gt v0, v2, :cond_5

    .line 52
    .line 53
    new-instance v0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 54
    .line 55
    invoke-direct {v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, Lcom/android/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/util/TreeMap;->size()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-virtual {v0, v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iput v2, p0, Lcom/android/dx/dex/file/CatchStructs;->encodedHandlerHeaderSize:I

    .line 69
    .line 70
    iget-object v2, p0, Lcom/android/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_4

    .line 85
    .line 86
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Ljava/util/Map$Entry;

    .line 91
    .line 92
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, Lcom/android/dx/dex/code/CatchHandlerList;

    .line 97
    .line 98
    invoke-virtual {v4}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    invoke-virtual {v4}, Lcom/android/dx/dex/code/CatchHandlerList;->catchesAll()Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-interface {v3, v7}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    if-eqz v6, :cond_2

    .line 118
    .line 119
    add-int/lit8 v3, v5, -0x1

    .line 120
    .line 121
    neg-int v3, v3

    .line 122
    invoke-virtual {v0, v3}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeSleb128(I)I

    .line 123
    .line 124
    .line 125
    add-int/lit8 v5, v5, -0x1

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_2
    invoke-virtual {v0, v5}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeSleb128(I)I

    .line 129
    .line 130
    .line 131
    :goto_2
    move v3, v1

    .line 132
    :goto_3
    if-ge v3, v5, :cond_3

    .line 133
    .line 134
    invoke-virtual {v4, v3}, Lcom/android/dx/dex/code/CatchHandlerList;->get(I)Lcom/android/dx/dex/code/CatchHandlerList$Entry;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-virtual {v7}, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->getExceptionType()Lcom/android/dx/rop/cst/CstType;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-virtual {p1, v8}, Lcom/android/dx/dex/file/TypeIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstType;)I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    invoke-virtual {v0, v8}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7}, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->getHandler()I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    invoke-virtual {v0, v7}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 154
    .line 155
    .line 156
    add-int/lit8 v3, v3, 0x1

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_3
    if-eqz v6, :cond_1

    .line 160
    .line 161
    invoke-virtual {v4, v5}, Lcom/android/dx/dex/code/CatchHandlerList;->get(I)Lcom/android/dx/dex/code/CatchHandlerList$Entry;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v3}, Lcom/android/dx/dex/code/CatchHandlerList$Entry;->getHandler()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    invoke-virtual {v0, v3}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeUleb128(I)I

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->toByteArray()[B

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iput-object p1, p0, Lcom/android/dx/dex/file/CatchStructs;->encodedHandlers:[B

    .line 178
    .line 179
    return-void

    .line 180
    :cond_5
    const-string p0, "too many catch handlers"

    .line 181
    .line 182
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method public triesSize()I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/file/CatchStructs;->finishProcessingIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/dex/file/CatchStructs;->table:Lcom/android/dx/dex/code/CatchTable;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public writeSize()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/CatchStructs;->triesSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x8

    .line 6
    .line 7
    iget-object p0, p0, Lcom/android/dx/dex/file/CatchStructs;->encodedHandlers:[B

    .line 8
    .line 9
    array-length p0, p0

    .line 10
    add-int/2addr v0, p0

    .line 11
    return v0
.end method

.method public writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/file/CatchStructs;->finishProcessingIfNecessary()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string p1, "  "

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, p1, v0, p2}, Lcom/android/dx/dex/file/CatchStructs;->annotateEntries(Ljava/lang/String;Ljava/io/PrintWriter;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Lcom/android/dx/dex/file/CatchStructs;->table:Lcom/android/dx/dex/code/CatchTable;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 v0, 0x0

    .line 23
    :goto_0
    if-ge v0, p1, :cond_2

    .line 24
    .line 25
    iget-object v1, p0, Lcom/android/dx/dex/file/CatchStructs;->table:Lcom/android/dx/dex/code/CatchTable;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lcom/android/dx/dex/code/CatchTable;->get(I)Lcom/android/dx/dex/code/CatchTable$Entry;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Lcom/android/dx/dex/code/CatchTable$Entry;->getStart()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {v1}, Lcom/android/dx/dex/code/CatchTable$Entry;->getEnd()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    sub-int v4, v3, v2

    .line 40
    .line 41
    const/high16 v5, 0x10000

    .line 42
    .line 43
    if-ge v4, v5, :cond_1

    .line 44
    .line 45
    invoke-interface {p2, v2}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p2, v4}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lcom/android/dx/dex/file/CatchStructs;->handlerOffsets:Ljava/util/TreeMap;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/android/dx/dex/code/CatchTable$Entry;->getHandlers()Lcom/android/dx/dex/code/CatchHandlerList;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v2, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-interface {p2, v1}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 74
    .line 75
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v1, "bogus exception range: "

    .line 86
    .line 87
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string p1, ".."

    .line 94
    .line 95
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0

    .line 109
    :cond_2
    iget-object p0, p0, Lcom/android/dx/dex/file/CatchStructs;->encodedHandlers:[B

    .line 110
    .line 111
    invoke-interface {p2, p0}, Lcom/android/dx/util/Output;->write([B)V

    .line 112
    .line 113
    .line 114
    return-void
.end method
