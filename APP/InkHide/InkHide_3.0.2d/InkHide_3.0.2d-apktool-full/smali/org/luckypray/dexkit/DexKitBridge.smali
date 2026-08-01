.class public final Lorg/luckypray/dexkit/DexKitBridge;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field private token:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeInitDexKit(Ljava/lang/String;)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 9
    .line 10
    return-void
.end method

.method public static final synthetic a(J[J)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassByIds(J[J)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(J[J)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetFieldByIds(J[J)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(JJ)[B
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetMethodUsingFields(JJ)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final native nativeBatchFindClassUsingStrings(J[B)[B
.end method

.method private static final native nativeBatchFindMethodUsingStrings(J[B)[B
.end method

.method private static final native nativeExportDexFile(JLjava/lang/String;)V
.end method

.method private static final native nativeFieldGetMethods(JJ)[B
.end method

.method private static final native nativeFieldPutMethods(JJ)[B
.end method

.method private static final native nativeFindClass(J[B)[B
.end method

.method private static final native nativeFindField(J[B)[B
.end method

.method private static final native nativeFindMethod(J[B)[B
.end method

.method private static final native nativeGetCallMethods(JJ)[B
.end method

.method private static final native nativeGetClassAnnotations(JJ)[B
.end method

.method private static final native nativeGetClassByIds(J[J)[B
.end method

.method private static final native nativeGetClassData(JLjava/lang/String;)[B
.end method

.method private static final native nativeGetDexNum(J)I
.end method

.method private static final native nativeGetFieldAnnotations(JJ)[B
.end method

.method private static final native nativeGetFieldByIds(J[J)[B
.end method

.method private static final native nativeGetFieldData(JLjava/lang/String;)[B
.end method

.method private static final native nativeGetInvokeMethods(JJ)[B
.end method

.method private static final native nativeGetMethodAnnotations(JJ)[B
.end method

.method private static final native nativeGetMethodByIds(J[J)[B
.end method

.method private static final native nativeGetMethodData(JLjava/lang/String;)[B
.end method

.method private static final native nativeGetMethodOpCodes(JJ)[I
.end method

.method private static final native nativeGetMethodUsingFields(JJ)[B
.end method

.method private static final native nativeGetMethodUsingStrings(JJ)[Ljava/lang/String;
.end method

.method private static final native nativeGetParameterAnnotations(JJ)[B
.end method

.method private static final native nativeGetParameterNames(JJ)[Ljava/lang/String;
.end method

.method private static final native nativeInitDexKit(Ljava/lang/String;)J
.end method

.method private static final native nativeInitDexKitByBytesArray([[B)J
.end method

.method private static final native nativeInitDexKitByClassLoader(Ljava/lang/ClassLoader;Z)J
.end method

.method private static final native nativeInitFullCache(J)V
.end method

.method private static final native nativeRelease(J)V
.end method

.method private static final native nativeSetThreadNum(JI)V
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v4, v0, v2

    .line 7
    .line 8
    if-eqz v4, :cond_0

    .line 9
    .line 10
    invoke-static {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeRelease(J)V

    .line 11
    .line 12
    .line 13
    iput-wide v2, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v0
.end method

.method public final d(LW0/a;)Lb1/e;
    .locals 4

    .line 1
    new-instance v0, LS/b;

    .line 2
    .line 3
    invoke-direct {v0}, LS/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, LW0/a;->Y(LS/b;)I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitBridge;->g()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual {v0}, LS/b;->i()[B

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {v1, v2, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindClass(J[B)[B

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "wrap(res)"

    .line 26
    .line 27
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Ld1/a;

    .line 31
    .line 32
    invoke-direct {v0}, Ld1/a;-><init>()V

    .line 33
    .line 34
    .line 35
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 36
    .line 37
    invoke-static {p1, v1}, LL/d;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/2addr v2, v1

    .line 46
    invoke-virtual {v0, v2, p1}, Ld1/a;->c(ILjava/nio/ByteBuffer;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lb1/e;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ld1/a;->h()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v2, 0x0

    .line 59
    :goto_0
    if-ge v2, v1, :cond_0

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ld1/a;->g(I)Ld1/a;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p0, v3}, LD/h;->m(Lorg/luckypray/dexkit/DexKitBridge;Ld1/a;)Lb1/d;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    const/4 v1, 0x1

    .line 83
    if-le v0, v1, :cond_1

    .line 84
    .line 85
    new-instance v0, LV/k;

    .line 86
    .line 87
    const/4 v1, 0x1

    .line 88
    invoke-direct {v0, v1}, LV/k;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1, v0}, LF0/p;->d0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    return-object p1
.end method

.method public final e(LW0/a;)Lb1/k;
    .locals 18

    .line 1
    new-instance v0, LS/b;

    .line 2
    .line 3
    invoke-direct {v0}, LS/b;-><init>()V

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p1

    .line 7
    .line 8
    invoke-virtual {v1, v0}, LW0/a;->Y(LS/b;)I

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p0 .. p0}, Lorg/luckypray/dexkit/DexKitBridge;->g()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {v0}, LS/b;->i()[B

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v1, v2, v0}, Lorg/luckypray/dexkit/DexKitBridge;->nativeFindMethod(J[B)[B

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "wrap(res)"

    .line 28
    .line 29
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Ld1/a;

    .line 33
    .line 34
    invoke-direct {v1}, Ld1/a;-><init>()V

    .line 35
    .line 36
    .line 37
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 38
    .line 39
    invoke-static {v0, v2}, LL/d;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    add-int/2addr v3, v2

    .line 48
    invoke-virtual {v1, v3, v0}, Ld1/a;->c(ILjava/nio/ByteBuffer;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lb1/k;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    const/4 v2, 0x4

    .line 57
    invoke-virtual {v1, v2}, Ld1/a;->b(I)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ld1/a;->f(I)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/4 v2, 0x0

    .line 69
    :goto_0
    const/4 v3, 0x0

    .line 70
    :goto_1
    if-ge v3, v2, :cond_d

    .line 71
    .line 72
    new-instance v4, Ld1/a;

    .line 73
    .line 74
    invoke-direct {v4}, Ld1/a;-><init>()V

    .line 75
    .line 76
    .line 77
    const/4 v5, 0x4

    .line 78
    invoke-virtual {v1, v5}, Ld1/a;->b(I)I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_1

    .line 83
    .line 84
    invoke-virtual {v1, v6}, Ld1/a;->e(I)I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    mul-int/2addr v5, v3

    .line 89
    add-int/2addr v5, v6

    .line 90
    invoke-virtual {v1, v5}, Ld1/a;->a(I)I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    iget-object v6, v1, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    const-string v7, "bb"

    .line 97
    .line 98
    invoke-static {v6, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v5, v6}, Ld1/a;->c(ILjava/nio/ByteBuffer;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_1
    const/4 v4, 0x0

    .line 106
    :goto_2
    invoke-static {v4}, LN0/g;->b(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    const-string v5, "bridge"

    .line 110
    .line 111
    move-object/from16 v7, p0

    .line 112
    .line 113
    invoke-static {v7, v5}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const/16 v5, 0xa

    .line 117
    .line 118
    invoke-virtual {v4, v5}, Ld1/a;->b(I)I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_2

    .line 123
    .line 124
    iget-object v8, v4, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 125
    .line 126
    iget v9, v4, Ld1/a;->a:I

    .line 127
    .line 128
    add-int/2addr v5, v9

    .line 129
    invoke-virtual {v8, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    goto :goto_3

    .line 134
    :cond_2
    const/4 v5, 0x0

    .line 135
    :goto_3
    const/high16 v8, 0x20000

    .line 136
    .line 137
    and-int v9, v5, v8

    .line 138
    .line 139
    if-lez v9, :cond_3

    .line 140
    .line 141
    xor-int/2addr v5, v8

    .line 142
    or-int/lit8 v5, v5, 0x20

    .line 143
    .line 144
    :cond_3
    move v11, v5

    .line 145
    const/4 v5, 0x4

    .line 146
    invoke-virtual {v4, v5}, Ld1/a;->b(I)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-eqz v5, :cond_4

    .line 151
    .line 152
    iget-object v8, v4, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 153
    .line 154
    iget v9, v4, Ld1/a;->a:I

    .line 155
    .line 156
    add-int/2addr v5, v9

    .line 157
    invoke-virtual {v8, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    move v8, v5

    .line 162
    goto :goto_4

    .line 163
    :cond_4
    const/4 v8, 0x0

    .line 164
    :goto_4
    const/4 v5, 0x6

    .line 165
    invoke-virtual {v4, v5}, Ld1/a;->b(I)I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_5

    .line 170
    .line 171
    iget-object v9, v4, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 172
    .line 173
    iget v10, v4, Ld1/a;->a:I

    .line 174
    .line 175
    add-int/2addr v5, v10

    .line 176
    invoke-virtual {v9, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    move v9, v5

    .line 181
    goto :goto_5

    .line 182
    :cond_5
    const/4 v9, 0x0

    .line 183
    :goto_5
    const/16 v5, 0x8

    .line 184
    .line 185
    invoke-virtual {v4, v5}, Ld1/a;->b(I)I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-eqz v5, :cond_6

    .line 190
    .line 191
    iget-object v10, v4, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 192
    .line 193
    iget v12, v4, Ld1/a;->a:I

    .line 194
    .line 195
    add-int/2addr v5, v12

    .line 196
    invoke-virtual {v10, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    move v10, v5

    .line 201
    goto :goto_6

    .line 202
    :cond_6
    const/4 v10, 0x0

    .line 203
    :goto_6
    const/16 v5, 0xc

    .line 204
    .line 205
    invoke-virtual {v4, v5}, Ld1/a;->b(I)I

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_7

    .line 210
    .line 211
    iget v12, v4, Ld1/a;->a:I

    .line 212
    .line 213
    add-int/2addr v5, v12

    .line 214
    invoke-virtual {v4, v5}, Ld1/a;->d(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    goto :goto_7

    .line 219
    :cond_7
    const/4 v5, 0x0

    .line 220
    :goto_7
    if-nez v5, :cond_8

    .line 221
    .line 222
    const-string v5, ""

    .line 223
    .line 224
    :cond_8
    move-object v12, v5

    .line 225
    const/16 v5, 0xe

    .line 226
    .line 227
    invoke-virtual {v4, v5}, Ld1/a;->b(I)I

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    if-eqz v5, :cond_9

    .line 232
    .line 233
    iget-object v13, v4, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 234
    .line 235
    iget v14, v4, Ld1/a;->a:I

    .line 236
    .line 237
    add-int/2addr v5, v14

    .line 238
    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    move v13, v5

    .line 243
    goto :goto_8

    .line 244
    :cond_9
    const/4 v13, 0x0

    .line 245
    :goto_8
    new-instance v14, Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 248
    .line 249
    .line 250
    const/16 v5, 0x10

    .line 251
    .line 252
    invoke-virtual {v4, v5}, Ld1/a;->b(I)I

    .line 253
    .line 254
    .line 255
    move-result v15

    .line 256
    if-eqz v15, :cond_a

    .line 257
    .line 258
    invoke-virtual {v4, v15}, Ld1/a;->f(I)I

    .line 259
    .line 260
    .line 261
    move-result v15

    .line 262
    goto :goto_9

    .line 263
    :cond_a
    const/4 v15, 0x0

    .line 264
    :goto_9
    const/4 v6, 0x0

    .line 265
    :goto_a
    if-ge v6, v15, :cond_c

    .line 266
    .line 267
    move-object/from16 v16, v1

    .line 268
    .line 269
    invoke-virtual {v4, v5}, Ld1/a;->b(I)I

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_b

    .line 274
    .line 275
    iget-object v5, v4, Ld1/a;->b:Ljava/nio/ByteBuffer;

    .line 276
    .line 277
    invoke-virtual {v4, v1}, Ld1/a;->e(I)I

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    mul-int/lit8 v17, v6, 0x4

    .line 282
    .line 283
    add-int v1, v17, v1

    .line 284
    .line 285
    invoke-virtual {v5, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    goto :goto_b

    .line 290
    :cond_b
    const/4 v1, 0x0

    .line 291
    :goto_b
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    add-int/lit8 v6, v6, 0x1

    .line 299
    .line 300
    move-object/from16 v1, v16

    .line 301
    .line 302
    const/16 v5, 0x10

    .line 303
    .line 304
    goto :goto_a

    .line 305
    :cond_c
    move-object/from16 v16, v1

    .line 306
    .line 307
    new-instance v6, Lb1/j;

    .line 308
    .line 309
    invoke-direct/range {v6 .. v14}, Lb1/j;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/ArrayList;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    add-int/lit8 v3, v3, 0x1

    .line 316
    .line 317
    move-object/from16 v1, v16

    .line 318
    .line 319
    goto/16 :goto_1

    .line 320
    .line 321
    :cond_d
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    const/4 v2, 0x1

    .line 326
    if-le v1, v2, :cond_e

    .line 327
    .line 328
    new-instance v1, LV/k;

    .line 329
    .line 330
    const/4 v2, 0x2

    .line 331
    invoke-direct {v1, v2}, LV/k;-><init>(I)V

    .line 332
    .line 333
    .line 334
    invoke-static {v0, v1}, LF0/p;->d0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 335
    .line 336
    .line 337
    :cond_e
    return-object v0
.end method

.method public final f(Ljava/lang/String;)Lb1/d;
    .locals 3

    .line 1
    const-string v0, "identifier"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-string v1, "Char sequence is empty."

    .line 11
    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v2, 0x4c

    .line 20
    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, LU0/i;->m0(Ljava/lang/CharSequence;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/16 v1, 0x3b

    .line 38
    .line 39
    if-ne v0, v1, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 43
    .line 44
    invoke-direct {p1, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    const/16 v0, 0x2e

    .line 49
    .line 50
    const/16 v1, 0x2f

    .line 51
    .line 52
    invoke-static {p1, v0, v1}, LU0/q;->f0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string v0, "L"

    .line 57
    .line 58
    const-string v1, ";"

    .line 59
    .line 60
    invoke-static {v0, p1, v1}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_0
    const-string v0, "descriptor"

    .line 65
    .line 66
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Le1/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitBridge;->g()J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    invoke-static {v0, v1, p1}, Lorg/luckypray/dexkit/DexKitBridge;->nativeGetClassData(JLjava/lang/String;)[B

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_2

    .line 81
    .line 82
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const-string v0, "wrap(it)"

    .line 87
    .line 88
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance v0, Ld1/a;

    .line 92
    .line 93
    invoke-direct {v0}, Ld1/a;-><init>()V

    .line 94
    .line 95
    .line 96
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 97
    .line 98
    invoke-static {p1, v1}, LL/d;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    add-int/2addr v2, v1

    .line 107
    invoke-virtual {v0, v2, p1}, Ld1/a;->c(ILjava/nio/ByteBuffer;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p0, v0}, LD/h;->m(Lorg/luckypray/dexkit/DexKitBridge;Ld1/a;)Lb1/d;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :cond_2
    const/4 p1, 0x0

    .line 116
    return-object p1

    .line 117
    :cond_3
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 118
    .line 119
    invoke-direct {p1, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p1
.end method

.method public final finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/luckypray/dexkit/DexKitBridge;->token:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v1, "DexKitBridge is not valid"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method
