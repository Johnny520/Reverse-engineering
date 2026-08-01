.class public final Lcom/android/dx/dex/file/DexFile;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/dex/file/DexFile$Storage;
    }
.end annotation


# instance fields
.field private final byteData:Lcom/android/dx/dex/file/MixedItemSection;

.field private final callSiteIds:Lcom/android/dx/dex/file/CallSiteIdsSection;

.field private final classData:Lcom/android/dx/dex/file/MixedItemSection;

.field private final classDefs:Lcom/android/dx/dex/file/ClassDefsSection;

.field private final dexOptions:Lcom/android/dx/dex/DexOptions;

.field private dumpWidth:I

.field private final fieldIds:Lcom/android/dx/dex/file/FieldIdsSection;

.field private fileSize:I

.field private final header:Lcom/android/dx/dex/file/HeaderSection;

.field private final map:Lcom/android/dx/dex/file/MixedItemSection;

.field private final methodHandles:Lcom/android/dx/dex/file/MethodHandlesSection;

.field private final methodIds:Lcom/android/dx/dex/file/MethodIdsSection;

.field private final protoIds:Lcom/android/dx/dex/file/ProtoIdsSection;

.field private final sections:[Lcom/android/dx/dex/file/Section;

.field private final stringData:Lcom/android/dx/dex/file/MixedItemSection;

.field private final stringIds:Lcom/android/dx/dex/file/StringIdsSection;

.field private final typeIds:Lcom/android/dx/dex/file/TypeIdsSection;

.field private final typeLists:Lcom/android/dx/dex/file/MixedItemSection;

.field private final wordData:Lcom/android/dx/dex/file/MixedItemSection;


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/DexOptions;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lcom/android/dx/dex/file/DexFile;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 9
    .line 10
    new-instance v2, Lcom/android/dx/dex/file/HeaderSection;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Lcom/android/dx/dex/file/HeaderSection;-><init>(Lcom/android/dx/dex/file/DexFile;)V

    .line 13
    .line 14
    .line 15
    iput-object v2, v0, Lcom/android/dx/dex/file/DexFile;->header:Lcom/android/dx/dex/file/HeaderSection;

    .line 16
    .line 17
    new-instance v3, Lcom/android/dx/dex/file/MixedItemSection;

    .line 18
    .line 19
    sget-object v4, Lcom/android/dx/dex/file/MixedItemSection$SortType;->NONE:Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x4

    .line 23
    invoke-direct {v3, v5, v0, v6, v4}, Lcom/android/dx/dex/file/MixedItemSection;-><init>(Ljava/lang/String;Lcom/android/dx/dex/file/DexFile;ILcom/android/dx/dex/file/MixedItemSection$SortType;)V

    .line 24
    .line 25
    .line 26
    iput-object v3, v0, Lcom/android/dx/dex/file/DexFile;->typeLists:Lcom/android/dx/dex/file/MixedItemSection;

    .line 27
    .line 28
    new-instance v7, Lcom/android/dx/dex/file/MixedItemSection;

    .line 29
    .line 30
    sget-object v8, Lcom/android/dx/dex/file/MixedItemSection$SortType;->TYPE:Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 31
    .line 32
    const-string v9, "word_data"

    .line 33
    .line 34
    invoke-direct {v7, v9, v0, v6, v8}, Lcom/android/dx/dex/file/MixedItemSection;-><init>(Ljava/lang/String;Lcom/android/dx/dex/file/DexFile;ILcom/android/dx/dex/file/MixedItemSection$SortType;)V

    .line 35
    .line 36
    .line 37
    iput-object v7, v0, Lcom/android/dx/dex/file/DexFile;->wordData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 38
    .line 39
    new-instance v9, Lcom/android/dx/dex/file/MixedItemSection;

    .line 40
    .line 41
    sget-object v10, Lcom/android/dx/dex/file/MixedItemSection$SortType;->INSTANCE:Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 42
    .line 43
    const-string v11, "string_data"

    .line 44
    .line 45
    const/4 v12, 0x1

    .line 46
    invoke-direct {v9, v11, v0, v12, v10}, Lcom/android/dx/dex/file/MixedItemSection;-><init>(Ljava/lang/String;Lcom/android/dx/dex/file/DexFile;ILcom/android/dx/dex/file/MixedItemSection$SortType;)V

    .line 47
    .line 48
    .line 49
    iput-object v9, v0, Lcom/android/dx/dex/file/DexFile;->stringData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 50
    .line 51
    new-instance v10, Lcom/android/dx/dex/file/MixedItemSection;

    .line 52
    .line 53
    invoke-direct {v10, v5, v0, v12, v4}, Lcom/android/dx/dex/file/MixedItemSection;-><init>(Ljava/lang/String;Lcom/android/dx/dex/file/DexFile;ILcom/android/dx/dex/file/MixedItemSection$SortType;)V

    .line 54
    .line 55
    .line 56
    iput-object v10, v0, Lcom/android/dx/dex/file/DexFile;->classData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 57
    .line 58
    new-instance v11, Lcom/android/dx/dex/file/MixedItemSection;

    .line 59
    .line 60
    const-string v13, "byte_data"

    .line 61
    .line 62
    invoke-direct {v11, v13, v0, v12, v8}, Lcom/android/dx/dex/file/MixedItemSection;-><init>(Ljava/lang/String;Lcom/android/dx/dex/file/DexFile;ILcom/android/dx/dex/file/MixedItemSection$SortType;)V

    .line 63
    .line 64
    .line 65
    iput-object v11, v0, Lcom/android/dx/dex/file/DexFile;->byteData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 66
    .line 67
    new-instance v8, Lcom/android/dx/dex/file/StringIdsSection;

    .line 68
    .line 69
    invoke-direct {v8, v0}, Lcom/android/dx/dex/file/StringIdsSection;-><init>(Lcom/android/dx/dex/file/DexFile;)V

    .line 70
    .line 71
    .line 72
    iput-object v8, v0, Lcom/android/dx/dex/file/DexFile;->stringIds:Lcom/android/dx/dex/file/StringIdsSection;

    .line 73
    .line 74
    new-instance v13, Lcom/android/dx/dex/file/TypeIdsSection;

    .line 75
    .line 76
    invoke-direct {v13, v0}, Lcom/android/dx/dex/file/TypeIdsSection;-><init>(Lcom/android/dx/dex/file/DexFile;)V

    .line 77
    .line 78
    .line 79
    iput-object v13, v0, Lcom/android/dx/dex/file/DexFile;->typeIds:Lcom/android/dx/dex/file/TypeIdsSection;

    .line 80
    .line 81
    new-instance v14, Lcom/android/dx/dex/file/ProtoIdsSection;

    .line 82
    .line 83
    invoke-direct {v14, v0}, Lcom/android/dx/dex/file/ProtoIdsSection;-><init>(Lcom/android/dx/dex/file/DexFile;)V

    .line 84
    .line 85
    .line 86
    iput-object v14, v0, Lcom/android/dx/dex/file/DexFile;->protoIds:Lcom/android/dx/dex/file/ProtoIdsSection;

    .line 87
    .line 88
    new-instance v15, Lcom/android/dx/dex/file/FieldIdsSection;

    .line 89
    .line 90
    invoke-direct {v15, v0}, Lcom/android/dx/dex/file/FieldIdsSection;-><init>(Lcom/android/dx/dex/file/DexFile;)V

    .line 91
    .line 92
    .line 93
    iput-object v15, v0, Lcom/android/dx/dex/file/DexFile;->fieldIds:Lcom/android/dx/dex/file/FieldIdsSection;

    .line 94
    .line 95
    move/from16 v16, v12

    .line 96
    .line 97
    new-instance v12, Lcom/android/dx/dex/file/MethodIdsSection;

    .line 98
    .line 99
    invoke-direct {v12, v0}, Lcom/android/dx/dex/file/MethodIdsSection;-><init>(Lcom/android/dx/dex/file/DexFile;)V

    .line 100
    .line 101
    .line 102
    iput-object v12, v0, Lcom/android/dx/dex/file/DexFile;->methodIds:Lcom/android/dx/dex/file/MethodIdsSection;

    .line 103
    .line 104
    new-instance v5, Lcom/android/dx/dex/file/ClassDefsSection;

    .line 105
    .line 106
    invoke-direct {v5, v0}, Lcom/android/dx/dex/file/ClassDefsSection;-><init>(Lcom/android/dx/dex/file/DexFile;)V

    .line 107
    .line 108
    .line 109
    iput-object v5, v0, Lcom/android/dx/dex/file/DexFile;->classDefs:Lcom/android/dx/dex/file/ClassDefsSection;

    .line 110
    .line 111
    move-object/from16 v18, v2

    .line 112
    .line 113
    new-instance v2, Lcom/android/dx/dex/file/MixedItemSection;

    .line 114
    .line 115
    move-object/from16 v19, v3

    .line 116
    .line 117
    const-string v3, "map"

    .line 118
    .line 119
    invoke-direct {v2, v3, v0, v6, v4}, Lcom/android/dx/dex/file/MixedItemSection;-><init>(Ljava/lang/String;Lcom/android/dx/dex/file/DexFile;ILcom/android/dx/dex/file/MixedItemSection$SortType;)V

    .line 120
    .line 121
    .line 122
    iput-object v2, v0, Lcom/android/dx/dex/file/DexFile;->map:Lcom/android/dx/dex/file/MixedItemSection;

    .line 123
    .line 124
    const/16 v3, 0x1a

    .line 125
    .line 126
    invoke-virtual {v1, v3}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    const/16 v3, 0xd

    .line 131
    .line 132
    const/16 v20, 0xb

    .line 133
    .line 134
    const/16 v21, 0xa

    .line 135
    .line 136
    const/16 v22, 0x9

    .line 137
    .line 138
    const/16 v23, 0x8

    .line 139
    .line 140
    const/16 v24, 0x7

    .line 141
    .line 142
    const/16 v25, 0x6

    .line 143
    .line 144
    const/16 v26, 0x5

    .line 145
    .line 146
    const/16 v27, 0x3

    .line 147
    .line 148
    const/16 v28, 0x2

    .line 149
    .line 150
    const/16 v29, 0x0

    .line 151
    .line 152
    if-eqz v1, :cond_0

    .line 153
    .line 154
    new-instance v1, Lcom/android/dx/dex/file/CallSiteIdsSection;

    .line 155
    .line 156
    invoke-direct {v1, v0}, Lcom/android/dx/dex/file/CallSiteIdsSection;-><init>(Lcom/android/dx/dex/file/DexFile;)V

    .line 157
    .line 158
    .line 159
    iput-object v1, v0, Lcom/android/dx/dex/file/DexFile;->callSiteIds:Lcom/android/dx/dex/file/CallSiteIdsSection;

    .line 160
    .line 161
    const/16 p1, 0xc

    .line 162
    .line 163
    new-instance v4, Lcom/android/dx/dex/file/MethodHandlesSection;

    .line 164
    .line 165
    invoke-direct {v4, v0}, Lcom/android/dx/dex/file/MethodHandlesSection;-><init>(Lcom/android/dx/dex/file/DexFile;)V

    .line 166
    .line 167
    .line 168
    iput-object v4, v0, Lcom/android/dx/dex/file/DexFile;->methodHandles:Lcom/android/dx/dex/file/MethodHandlesSection;

    .line 169
    .line 170
    move/from16 v17, v6

    .line 171
    .line 172
    const/16 v6, 0xf

    .line 173
    .line 174
    new-array v6, v6, [Lcom/android/dx/dex/file/Section;

    .line 175
    .line 176
    aput-object v18, v6, v29

    .line 177
    .line 178
    aput-object v8, v6, v16

    .line 179
    .line 180
    aput-object v13, v6, v28

    .line 181
    .line 182
    aput-object v14, v6, v27

    .line 183
    .line 184
    aput-object v15, v6, v17

    .line 185
    .line 186
    aput-object v12, v6, v26

    .line 187
    .line 188
    aput-object v5, v6, v25

    .line 189
    .line 190
    aput-object v1, v6, v24

    .line 191
    .line 192
    aput-object v4, v6, v23

    .line 193
    .line 194
    aput-object v7, v6, v22

    .line 195
    .line 196
    aput-object v19, v6, v21

    .line 197
    .line 198
    aput-object v9, v6, v20

    .line 199
    .line 200
    aput-object v11, v6, p1

    .line 201
    .line 202
    aput-object v10, v6, v3

    .line 203
    .line 204
    const/16 v1, 0xe

    .line 205
    .line 206
    aput-object v2, v6, v1

    .line 207
    .line 208
    iput-object v6, v0, Lcom/android/dx/dex/file/DexFile;->sections:[Lcom/android/dx/dex/file/Section;

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_0
    move/from16 v17, v6

    .line 212
    .line 213
    const/16 p1, 0xc

    .line 214
    .line 215
    const/4 v1, 0x0

    .line 216
    iput-object v1, v0, Lcom/android/dx/dex/file/DexFile;->callSiteIds:Lcom/android/dx/dex/file/CallSiteIdsSection;

    .line 217
    .line 218
    iput-object v1, v0, Lcom/android/dx/dex/file/DexFile;->methodHandles:Lcom/android/dx/dex/file/MethodHandlesSection;

    .line 219
    .line 220
    new-array v1, v3, [Lcom/android/dx/dex/file/Section;

    .line 221
    .line 222
    aput-object v18, v1, v29

    .line 223
    .line 224
    aput-object v8, v1, v16

    .line 225
    .line 226
    aput-object v13, v1, v28

    .line 227
    .line 228
    aput-object v14, v1, v27

    .line 229
    .line 230
    aput-object v15, v1, v17

    .line 231
    .line 232
    aput-object v12, v1, v26

    .line 233
    .line 234
    aput-object v5, v1, v25

    .line 235
    .line 236
    aput-object v7, v1, v24

    .line 237
    .line 238
    aput-object v19, v1, v23

    .line 239
    .line 240
    aput-object v9, v1, v22

    .line 241
    .line 242
    aput-object v11, v1, v21

    .line 243
    .line 244
    aput-object v10, v1, v20

    .line 245
    .line 246
    aput-object v2, v1, p1

    .line 247
    .line 248
    iput-object v1, v0, Lcom/android/dx/dex/file/DexFile;->sections:[Lcom/android/dx/dex/file/Section;

    .line 249
    .line 250
    :goto_0
    const/4 v1, -0x1

    .line 251
    iput v1, v0, Lcom/android/dx/dex/file/DexFile;->fileSize:I

    .line 252
    .line 253
    const/16 v1, 0x4f

    .line 254
    .line 255
    iput v1, v0, Lcom/android/dx/dex/file/DexFile;->dumpWidth:I

    .line 256
    .line 257
    return-void
.end method

.method private static calcChecksum([BI)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/zip/Adler32;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/zip/Adler32;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xc

    .line 7
    .line 8
    sub-int/2addr p1, v1

    .line 9
    invoke-virtual {v0, p0, v1, p1}, Ljava/util/zip/Adler32;->update([BII)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/zip/Adler32;->getValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    long-to-int p1, v0

    .line 17
    const/16 v0, 0x8

    .line 18
    .line 19
    int-to-byte v1, p1

    .line 20
    aput-byte v1, p0, v0

    .line 21
    .line 22
    shr-int/lit8 v0, p1, 0x8

    .line 23
    .line 24
    int-to-byte v0, v0

    .line 25
    const/16 v1, 0x9

    .line 26
    .line 27
    aput-byte v0, p0, v1

    .line 28
    .line 29
    shr-int/lit8 v0, p1, 0x10

    .line 30
    .line 31
    int-to-byte v0, v0

    .line 32
    const/16 v1, 0xa

    .line 33
    .line 34
    aput-byte v0, p0, v1

    .line 35
    .line 36
    shr-int/lit8 p1, p1, 0x18

    .line 37
    .line 38
    int-to-byte p1, p1

    .line 39
    const/16 v0, 0xb

    .line 40
    .line 41
    aput-byte p1, p0, v0

    .line 42
    .line 43
    return-void
.end method

.method private static calcSignature([BI)V
    .locals 3

    .line 1
    const-string v0, "unexpected digest write: "

    .line 2
    .line 3
    :try_start_0
    const-string v1, "SHA-1"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 6
    .line 7
    .line 8
    move-result-object v1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    .line 9
    const/16 v2, 0x20

    .line 10
    .line 11
    sub-int/2addr p1, v2

    .line 12
    invoke-virtual {v1, p0, v2, p1}, Ljava/security/MessageDigest;->update([BII)V

    .line 13
    .line 14
    .line 15
    const/16 p1, 0xc

    .line 16
    .line 17
    const/16 v2, 0x14

    .line 18
    .line 19
    :try_start_1
    invoke-virtual {v1, p0, p1, v2}, Ljava/security/MessageDigest;->digest([BII)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-ne p0, v2, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p0, " bytes"

    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1
    :try_end_1
    .catch Ljava/security/DigestException; {:try_start_1 .. :try_end_1} :catch_0

    .line 49
    :catch_0
    move-exception p0

    .line 50
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catch_1
    move-exception p0

    .line 55
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method private toDex0(ZZLcom/android/dx/dex/file/DexFile$Storage;)Lcom/android/dx/util/ByteArrayAnnotatedOutput;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->classDefs:Lcom/android/dx/dex/file/ClassDefsSection;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->classData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->wordData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 17
    .line 18
    const/16 v1, 0x1a

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->callSiteIds:Lcom/android/dx/dex/file/CallSiteIdsSection;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->byteData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/android/dx/dex/DexOptions;->apiIsSupported(I)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->methodHandles:Lcom/android/dx/dex/file/MethodHandlesSection;

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->methodIds:Lcom/android/dx/dex/file/MethodIdsSection;

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->fieldIds:Lcom/android/dx/dex/file/FieldIdsSection;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->protoIds:Lcom/android/dx/dex/file/ProtoIdsSection;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->typeLists:Lcom/android/dx/dex/file/MixedItemSection;

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->typeIds:Lcom/android/dx/dex/file/TypeIdsSection;

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->stringIds:Lcom/android/dx/dex/file/StringIdsSection;

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->stringData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->header:Lcom/android/dx/dex/file/HeaderSection;

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lcom/android/dx/dex/file/DexFile;->sections:[Lcom/android/dx/dex/file/Section;

    .line 90
    .line 91
    array-length v0, v0

    .line 92
    const/4 v1, 0x0

    .line 93
    move v2, v1

    .line 94
    move v3, v2

    .line 95
    :goto_0
    const/4 v4, 0x0

    .line 96
    const-string v5, "...while writing section "

    .line 97
    .line 98
    if-ge v2, v0, :cond_7

    .line 99
    .line 100
    iget-object v6, p0, Lcom/android/dx/dex/file/DexFile;->sections:[Lcom/android/dx/dex/file/Section;

    .line 101
    .line 102
    aget-object v6, v6, v2

    .line 103
    .line 104
    iget-object v7, p0, Lcom/android/dx/dex/file/DexFile;->callSiteIds:Lcom/android/dx/dex/file/CallSiteIdsSection;

    .line 105
    .line 106
    if-eq v6, v7, :cond_2

    .line 107
    .line 108
    iget-object v7, p0, Lcom/android/dx/dex/file/DexFile;->methodHandles:Lcom/android/dx/dex/file/MethodHandlesSection;

    .line 109
    .line 110
    if-ne v6, v7, :cond_3

    .line 111
    .line 112
    :cond_2
    invoke-virtual {v6}, Lcom/android/dx/dex/file/Section;->items()Ljava/util/Collection;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_3

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    invoke-virtual {v6, v3}, Lcom/android/dx/dex/file/Section;->setFileOffset(I)I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-lt v7, v3, :cond_6

    .line 128
    .line 129
    :try_start_0
    iget-object v3, p0, Lcom/android/dx/dex/file/DexFile;->map:Lcom/android/dx/dex/file/MixedItemSection;

    .line 130
    .line 131
    if-ne v6, v3, :cond_4

    .line 132
    .line 133
    iget-object v4, p0, Lcom/android/dx/dex/file/DexFile;->sections:[Lcom/android/dx/dex/file/Section;

    .line 134
    .line 135
    invoke-static {v4, v3}, Lcom/android/dx/dex/file/MapItem;->addMap([Lcom/android/dx/dex/file/Section;Lcom/android/dx/dex/file/MixedItemSection;)V

    .line 136
    .line 137
    .line 138
    iget-object v3, p0, Lcom/android/dx/dex/file/DexFile;->map:Lcom/android/dx/dex/file/MixedItemSection;

    .line 139
    .line 140
    invoke-virtual {v3}, Lcom/android/dx/dex/file/Section;->prepare()V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :catch_0
    move-exception p0

    .line 145
    goto :goto_3

    .line 146
    :cond_4
    :goto_1
    instance-of v3, v6, Lcom/android/dx/dex/file/MixedItemSection;

    .line 147
    .line 148
    if-eqz v3, :cond_5

    .line 149
    .line 150
    move-object v3, v6

    .line 151
    check-cast v3, Lcom/android/dx/dex/file/MixedItemSection;

    .line 152
    .line 153
    invoke-virtual {v3}, Lcom/android/dx/dex/file/MixedItemSection;->placeItems()V

    .line 154
    .line 155
    .line 156
    :cond_5
    invoke-virtual {v6}, Lcom/android/dx/dex/file/Section;->writeSize()I

    .line 157
    .line 158
    .line 159
    move-result v3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    add-int/2addr v3, v7

    .line 161
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {p0, p1}, Lcom/android/dex/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/android/dex/util/ExceptionWithContext;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    throw p0

    .line 181
    :cond_6
    const-string p0, "bogus placement for section "

    .line 182
    .line 183
    invoke-static {v2, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    return-object v4

    .line 191
    :cond_7
    iput v3, p0, Lcom/android/dx/dex/file/DexFile;->fileSize:I

    .line 192
    .line 193
    if-nez p3, :cond_8

    .line 194
    .line 195
    new-array p3, v3, [B

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_8
    invoke-virtual {p3, v3}, Lcom/android/dx/dex/file/DexFile$Storage;->getStorage(I)[B

    .line 199
    .line 200
    .line 201
    move-result-object p3

    .line 202
    :goto_4
    new-instance v2, Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 203
    .line 204
    invoke-direct {v2, p3}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;-><init>([B)V

    .line 205
    .line 206
    .line 207
    if-eqz p1, :cond_9

    .line 208
    .line 209
    iget v3, p0, Lcom/android/dx/dex/file/DexFile;->dumpWidth:I

    .line 210
    .line 211
    invoke-virtual {v2, v3, p2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->enableAnnotations(IZ)V

    .line 212
    .line 213
    .line 214
    :cond_9
    :goto_5
    if-ge v1, v0, :cond_e

    .line 215
    .line 216
    :try_start_1
    iget-object p2, p0, Lcom/android/dx/dex/file/DexFile;->sections:[Lcom/android/dx/dex/file/Section;

    .line 217
    .line 218
    aget-object p2, p2, v1

    .line 219
    .line 220
    iget-object v3, p0, Lcom/android/dx/dex/file/DexFile;->callSiteIds:Lcom/android/dx/dex/file/CallSiteIdsSection;

    .line 221
    .line 222
    if-eq p2, v3, :cond_a

    .line 223
    .line 224
    iget-object v3, p0, Lcom/android/dx/dex/file/DexFile;->methodHandles:Lcom/android/dx/dex/file/MethodHandlesSection;

    .line 225
    .line 226
    if-ne p2, v3, :cond_b

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :catch_1
    move-exception p0

    .line 230
    goto :goto_8

    .line 231
    :cond_a
    :goto_6
    invoke-virtual {p2}, Lcom/android/dx/dex/file/Section;->items()Ljava/util/Collection;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    if-eqz v3, :cond_b

    .line 240
    .line 241
    goto :goto_7

    .line 242
    :cond_b
    invoke-virtual {p2}, Lcom/android/dx/dex/file/Section;->getFileOffset()I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    invoke-virtual {v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    sub-int/2addr v3, v6

    .line 251
    if-ltz v3, :cond_c

    .line 252
    .line 253
    invoke-virtual {v2, v3}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeZeroes(I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p2, v2}, Lcom/android/dx/dex/file/Section;->writeTo(Lcom/android/dx/util/AnnotatedOutput;)V

    .line 257
    .line 258
    .line 259
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_c
    new-instance p0, Lcom/android/dex/util/ExceptionWithContext;

    .line 263
    .line 264
    new-instance p1, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    const-string p2, "excess write of "

    .line 270
    .line 271
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    neg-int p2, v3

    .line 275
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-direct {p0, p1}, Lcom/android/dex/util/ExceptionWithContext;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw p0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 286
    :goto_8
    instance-of p1, p0, Lcom/android/dex/util/ExceptionWithContext;

    .line 287
    .line 288
    if-eqz p1, :cond_d

    .line 289
    .line 290
    check-cast p0, Lcom/android/dex/util/ExceptionWithContext;

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_d
    new-instance p1, Lcom/android/dex/util/ExceptionWithContext;

    .line 294
    .line 295
    invoke-direct {p1, p0}, Lcom/android/dex/util/ExceptionWithContext;-><init>(Ljava/lang/Throwable;)V

    .line 296
    .line 297
    .line 298
    move-object p0, p1

    .line 299
    :goto_9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    invoke-virtual {p0, p1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw p0

    .line 315
    :cond_e
    invoke-virtual {v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 316
    .line 317
    .line 318
    move-result p2

    .line 319
    iget v0, p0, Lcom/android/dx/dex/file/DexFile;->fileSize:I

    .line 320
    .line 321
    if-ne p2, v0, :cond_10

    .line 322
    .line 323
    invoke-virtual {v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 324
    .line 325
    .line 326
    move-result p2

    .line 327
    invoke-static {p3, p2}, Lcom/android/dx/dex/file/DexFile;->calcSignature([BI)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getCursor()I

    .line 331
    .line 332
    .line 333
    move-result p2

    .line 334
    invoke-static {p3, p2}, Lcom/android/dx/dex/file/DexFile;->calcChecksum([BI)V

    .line 335
    .line 336
    .line 337
    if-eqz p1, :cond_f

    .line 338
    .line 339
    iget-object p1, p0, Lcom/android/dx/dex/file/DexFile;->wordData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 340
    .line 341
    sget-object p2, Lcom/android/dx/dex/file/ItemType;->TYPE_CODE_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 342
    .line 343
    const-string p3, "\nmethod code index:\n\n"

    .line 344
    .line 345
    invoke-virtual {p1, v2, p2, p3}, Lcom/android/dx/dex/file/MixedItemSection;->writeIndexAnnotation(Lcom/android/dx/util/AnnotatedOutput;Lcom/android/dx/dex/file/ItemType;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {p0}, Lcom/android/dx/dex/file/DexFile;->getStatistics()Lcom/android/dx/dex/file/Statistics;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    invoke-virtual {p0, v2}, Lcom/android/dx/dex/file/Statistics;->writeAnnotation(Lcom/android/dx/util/AnnotatedOutput;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->finishAnnotating()V

    .line 356
    .line 357
    .line 358
    :cond_f
    return-object v2

    .line 359
    :cond_10
    const-string p0, "foreshortened write"

    .line 360
    .line 361
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    return-object v4
.end method


# virtual methods
.method public add(Lcom/android/dx/dex/file/ClassDefItem;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->classDefs:Lcom/android/dx/dex/file/ClassDefsSection;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/ClassDefsSection;->add(Lcom/android/dx/dex/file/ClassDefItem;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public findItemOrNull(Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/dex/file/IndexedItem;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->stringIds:Lcom/android/dx/dex/file/StringIdsSection;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/StringIdsSection;->get(Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/dex/file/IndexedItem;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstType;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->typeIds:Lcom/android/dx/dex/file/TypeIdsSection;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/TypeIdsSection;->get(Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/dex/file/IndexedItem;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstBaseMethodRef;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->methodIds:Lcom/android/dx/dex/file/MethodIdsSection;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/MethodIdsSection;->get(Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/dex/file/IndexedItem;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_2
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->fieldIds:Lcom/android/dx/dex/file/FieldIdsSection;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/FieldIdsSection;->get(Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/dex/file/IndexedItem;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_3
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstEnumRef;

    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->fieldIds:Lcom/android/dx/dex/file/FieldIdsSection;

    .line 50
    .line 51
    check-cast p1, Lcom/android/dx/rop/cst/CstEnumRef;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstEnumRef;->getFieldRef()Lcom/android/dx/rop/cst/CstFieldRef;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/FieldIdsSection;->intern(Lcom/android/dx/rop/cst/CstFieldRef;)Lcom/android/dx/dex/file/FieldIdItem;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_4
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 63
    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->protoIds:Lcom/android/dx/dex/file/ProtoIdsSection;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/ProtoIdsSection;->get(Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/dex/file/IndexedItem;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :cond_5
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->methodHandles:Lcom/android/dx/dex/file/MethodHandlesSection;

    .line 78
    .line 79
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/MethodHandlesSection;->get(Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/dex/file/IndexedItem;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_6
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 85
    .line 86
    if-eqz v0, :cond_7

    .line 87
    .line 88
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->callSiteIds:Lcom/android/dx/dex/file/CallSiteIdsSection;

    .line 89
    .line 90
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/CallSiteIdsSection;->get(Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/dex/file/IndexedItem;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :cond_7
    const/4 p0, 0x0

    .line 96
    return-object p0
.end method

.method public getByteData()Lcom/android/dx/dex/file/MixedItemSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->byteData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCallSiteIds()Lcom/android/dx/dex/file/CallSiteIdsSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->callSiteIds:Lcom/android/dx/dex/file/CallSiteIdsSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getClassData()Lcom/android/dx/dex/file/MixedItemSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->classData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getClassDefs()Lcom/android/dx/dex/file/ClassDefsSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->classDefs:Lcom/android/dx/dex/file/ClassDefsSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getClassOrNull(Ljava/lang/String;)Lcom/android/dx/dex/file/ClassDefItem;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Lcom/android/dx/rop/type/Type;->internClassName(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->classDefs:Lcom/android/dx/dex/file/ClassDefsSection;

    .line 6
    .line 7
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/android/dx/dex/file/ClassDefsSection;->get(Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/dex/file/IndexedItem;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lcom/android/dx/dex/file/ClassDefItem;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    return-object p0

    .line 19
    :catch_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public getDexOptions()Lcom/android/dx/dex/DexOptions;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFieldIds()Lcom/android/dx/dex/file/FieldIdsSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->fieldIds:Lcom/android/dx/dex/file/FieldIdsSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFileSize()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/file/DexFile;->fileSize:I

    .line 2
    .line 3
    if-ltz p0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const-string p0, "file size not yet known"

    .line 7
    .line 8
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public getFirstDataSection()Lcom/android/dx/dex/file/Section;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->wordData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLastDataSection()Lcom/android/dx/dex/file/Section;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->map:Lcom/android/dx/dex/file/MixedItemSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMap()Lcom/android/dx/dex/file/MixedItemSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->map:Lcom/android/dx/dex/file/MixedItemSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMethodHandles()Lcom/android/dx/dex/file/MethodHandlesSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->methodHandles:Lcom/android/dx/dex/file/MethodHandlesSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMethodIds()Lcom/android/dx/dex/file/MethodIdsSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->methodIds:Lcom/android/dx/dex/file/MethodIdsSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getProtoIds()Lcom/android/dx/dex/file/ProtoIdsSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->protoIds:Lcom/android/dx/dex/file/ProtoIdsSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getStatistics()Lcom/android/dx/dex/file/Statistics;
    .locals 4

    .line 1
    new-instance v0, Lcom/android/dx/dex/file/Statistics;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/dex/file/Statistics;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->sections:[Lcom/android/dx/dex/file/Section;

    .line 7
    .line 8
    array-length v1, p0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget-object v3, p0, v2

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Lcom/android/dx/dex/file/Statistics;->addAll(Lcom/android/dx/dex/file/Section;)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-object v0
.end method

.method public getStringData()Lcom/android/dx/dex/file/MixedItemSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->stringData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getStringIds()Lcom/android/dx/dex/file/StringIdsSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->stringIds:Lcom/android/dx/dex/file/StringIdsSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->typeIds:Lcom/android/dx/dex/file/TypeIdsSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeLists()Lcom/android/dx/dex/file/MixedItemSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->typeLists:Lcom/android/dx/dex/file/MixedItemSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getWordData()Lcom/android/dx/dex/file/MixedItemSection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->wordData:Lcom/android/dx/dex/file/MixedItemSection;

    .line 2
    .line 3
    return-object p0
.end method

.method public internIfAppropriate(Lcom/android/dx/rop/cst/Constant;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstString;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->stringIds:Lcom/android/dx/dex/file/StringIdsSection;

    .line 8
    .line 9
    check-cast p1, Lcom/android/dx/rop/cst/CstString;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/StringIdsSection;->intern(Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/dex/file/StringIdItem;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstType;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->typeIds:Lcom/android/dx/dex/file/TypeIdsSection;

    .line 20
    .line 21
    check-cast p1, Lcom/android/dx/rop/cst/CstType;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/TypeIdsSection;->intern(Lcom/android/dx/rop/cst/CstType;)Lcom/android/dx/dex/file/TypeIdItem;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstBaseMethodRef;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->methodIds:Lcom/android/dx/dex/file/MethodIdsSection;

    .line 32
    .line 33
    check-cast p1, Lcom/android/dx/rop/cst/CstBaseMethodRef;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/MethodIdsSection;->intern(Lcom/android/dx/rop/cst/CstBaseMethodRef;)Lcom/android/dx/dex/file/MethodIdItem;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->fieldIds:Lcom/android/dx/dex/file/FieldIdsSection;

    .line 44
    .line 45
    check-cast p1, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/FieldIdsSection;->intern(Lcom/android/dx/rop/cst/CstFieldRef;)Lcom/android/dx/dex/file/FieldIdItem;

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstEnumRef;

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->fieldIds:Lcom/android/dx/dex/file/FieldIdsSection;

    .line 56
    .line 57
    check-cast p1, Lcom/android/dx/rop/cst/CstEnumRef;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstEnumRef;->getFieldRef()Lcom/android/dx/rop/cst/CstFieldRef;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/FieldIdsSection;->intern(Lcom/android/dx/rop/cst/CstFieldRef;)Lcom/android/dx/dex/file/FieldIdItem;

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_4
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 68
    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->protoIds:Lcom/android/dx/dex/file/ProtoIdsSection;

    .line 72
    .line 73
    check-cast p1, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstProtoRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/ProtoIdsSection;->intern(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/dex/file/ProtoIdItem;

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_5
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 84
    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->methodHandles:Lcom/android/dx/dex/file/MethodHandlesSection;

    .line 88
    .line 89
    check-cast p1, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/MethodHandlesSection;->intern(Lcom/android/dx/rop/cst/CstMethodHandle;)V

    .line 92
    .line 93
    .line 94
    :cond_6
    return-void

    .line 95
    :cond_7
    const-string p0, "cst == null"

    .line 96
    .line 97
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/DexFile;->classDefs:Lcom/android/dx/dex/file/ClassDefsSection;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/file/ClassDefsSection;->items()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public setDumpWidth(I)V
    .locals 1

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/android/dx/dex/file/DexFile;->dumpWidth:I

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "dumpWidth < 40"

    .line 9
    .line 10
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public toDex(Ljava/io/Writer;Z)[B
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    const/4 v1, 0x0

    .line 7
    invoke-direct {p0, v0, p2, v1}, Lcom/android/dx/dex/file/DexFile;->toDex0(ZZLcom/android/dx/dex/file/DexFile$Storage;)Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeAnnotationsTo(Ljava/io/Writer;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-virtual {p0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getArray()[B

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public writeTo(Lcom/android/dx/dex/file/DexFile$Storage;)Lcom/android/dx/util/ByteArrayAnnotatedOutput;
    .locals 1

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, v0, v0, p1}, Lcom/android/dx/dex/file/DexFile;->toDex0(ZZLcom/android/dx/dex/file/DexFile$Storage;)Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    move-result-object p0

    return-object p0
.end method

.method public writeTo(Ljava/io/OutputStream;Lcom/android/dx/dex/file/DexFile$Storage;Ljava/io/Writer;Z)V
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-direct {p0, v0, p4, p2}, Lcom/android/dx/dex/file/DexFile;->toDex0(ZZLcom/android/dx/dex/file/DexFile$Storage;)Lcom/android/dx/util/ByteArrayAnnotatedOutput;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getArray()[B

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 17
    .line 18
    .line 19
    :cond_1
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, p3}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->writeAnnotationsTo(Ljava/io/Writer;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    return-void
.end method

.method public writeTo(Ljava/io/OutputStream;Ljava/io/Writer;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 25
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/android/dx/dex/file/DexFile;->writeTo(Ljava/io/OutputStream;Lcom/android/dx/dex/file/DexFile$Storage;Ljava/io/Writer;Z)V

    return-void
.end method
