.class public final enum Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum AES256SHA256:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum BCJ_ARM_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum BCJ_ARM_THUMB_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum BCJ_IA64_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum BCJ_PPC_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum BCJ_SPARC_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum BCJ_X86_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum BZIP2:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum COPY:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum DEFLATE:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum DEFLATE64:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum DELTA_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum LZMA:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

.field public static final enum LZMA2:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;


# instance fields
.field private final id:[B


# direct methods
.method private static synthetic $values()[Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;
    .locals 14

    .line 1
    sget-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->COPY:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->LZMA:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 4
    .line 5
    sget-object v2, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->LZMA2:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 6
    .line 7
    sget-object v3, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->DEFLATE:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 8
    .line 9
    sget-object v4, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->DEFLATE64:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 10
    .line 11
    sget-object v5, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BZIP2:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 12
    .line 13
    sget-object v6, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->AES256SHA256:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 14
    .line 15
    sget-object v7, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BCJ_X86_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 16
    .line 17
    sget-object v8, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BCJ_PPC_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 18
    .line 19
    sget-object v9, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BCJ_IA64_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 20
    .line 21
    sget-object v10, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BCJ_ARM_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 22
    .line 23
    sget-object v11, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BCJ_ARM_THUMB_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 24
    .line 25
    sget-object v12, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BCJ_SPARC_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 26
    .line 27
    sget-object v13, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->DELTA_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 28
    .line 29
    filled-new-array/range {v0 .. v13}, [Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v2, v1, [B

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-byte v3, v2, v3

    .line 8
    .line 9
    const-string v4, "COPY"

    .line 10
    .line 11
    invoke-direct {v0, v4, v3, v2}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->COPY:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 15
    .line 16
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    new-array v4, v2, [B

    .line 20
    .line 21
    fill-array-data v4, :array_0

    .line 22
    .line 23
    .line 24
    const-string v5, "LZMA"

    .line 25
    .line 26
    invoke-direct {v0, v5, v1, v4}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->LZMA:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 30
    .line 31
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 32
    .line 33
    new-array v4, v1, [B

    .line 34
    .line 35
    const/16 v5, 0x21

    .line 36
    .line 37
    aput-byte v5, v4, v3

    .line 38
    .line 39
    const-string v5, "LZMA2"

    .line 40
    .line 41
    const/4 v6, 0x2

    .line 42
    invoke-direct {v0, v5, v6, v4}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->LZMA2:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 46
    .line 47
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 48
    .line 49
    new-array v4, v2, [B

    .line 50
    .line 51
    fill-array-data v4, :array_1

    .line 52
    .line 53
    .line 54
    const-string v5, "DEFLATE"

    .line 55
    .line 56
    invoke-direct {v0, v5, v2, v4}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->DEFLATE:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 60
    .line 61
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 62
    .line 63
    new-array v4, v2, [B

    .line 64
    .line 65
    fill-array-data v4, :array_2

    .line 66
    .line 67
    .line 68
    const-string v5, "DEFLATE64"

    .line 69
    .line 70
    const/4 v6, 0x4

    .line 71
    invoke-direct {v0, v5, v6, v4}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->DEFLATE64:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 75
    .line 76
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 77
    .line 78
    new-array v4, v2, [B

    .line 79
    .line 80
    fill-array-data v4, :array_3

    .line 81
    .line 82
    .line 83
    const-string v5, "BZIP2"

    .line 84
    .line 85
    const/4 v7, 0x5

    .line 86
    invoke-direct {v0, v5, v7, v4}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BZIP2:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 90
    .line 91
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 92
    .line 93
    new-array v4, v6, [B

    .line 94
    .line 95
    fill-array-data v4, :array_4

    .line 96
    .line 97
    .line 98
    const-string v5, "AES256SHA256"

    .line 99
    .line 100
    const/4 v7, 0x6

    .line 101
    invoke-direct {v0, v5, v7, v4}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 102
    .line 103
    .line 104
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->AES256SHA256:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 105
    .line 106
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 107
    .line 108
    new-array v4, v6, [B

    .line 109
    .line 110
    fill-array-data v4, :array_5

    .line 111
    .line 112
    .line 113
    const-string v5, "BCJ_X86_FILTER"

    .line 114
    .line 115
    const/4 v7, 0x7

    .line 116
    invoke-direct {v0, v5, v7, v4}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 117
    .line 118
    .line 119
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BCJ_X86_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 120
    .line 121
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 122
    .line 123
    new-array v4, v6, [B

    .line 124
    .line 125
    fill-array-data v4, :array_6

    .line 126
    .line 127
    .line 128
    const-string v5, "BCJ_PPC_FILTER"

    .line 129
    .line 130
    const/16 v7, 0x8

    .line 131
    .line 132
    invoke-direct {v0, v5, v7, v4}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 133
    .line 134
    .line 135
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BCJ_PPC_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 136
    .line 137
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 138
    .line 139
    new-array v4, v6, [B

    .line 140
    .line 141
    fill-array-data v4, :array_7

    .line 142
    .line 143
    .line 144
    const-string v5, "BCJ_IA64_FILTER"

    .line 145
    .line 146
    const/16 v7, 0x9

    .line 147
    .line 148
    invoke-direct {v0, v5, v7, v4}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 149
    .line 150
    .line 151
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BCJ_IA64_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 152
    .line 153
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 154
    .line 155
    new-array v4, v6, [B

    .line 156
    .line 157
    fill-array-data v4, :array_8

    .line 158
    .line 159
    .line 160
    const-string v5, "BCJ_ARM_FILTER"

    .line 161
    .line 162
    const/16 v7, 0xa

    .line 163
    .line 164
    invoke-direct {v0, v5, v7, v4}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 165
    .line 166
    .line 167
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BCJ_ARM_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 168
    .line 169
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 170
    .line 171
    new-array v4, v6, [B

    .line 172
    .line 173
    fill-array-data v4, :array_9

    .line 174
    .line 175
    .line 176
    const-string v5, "BCJ_ARM_THUMB_FILTER"

    .line 177
    .line 178
    const/16 v7, 0xb

    .line 179
    .line 180
    invoke-direct {v0, v5, v7, v4}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 181
    .line 182
    .line 183
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BCJ_ARM_THUMB_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 184
    .line 185
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 186
    .line 187
    new-array v4, v6, [B

    .line 188
    .line 189
    fill-array-data v4, :array_a

    .line 190
    .line 191
    .line 192
    const-string v5, "BCJ_SPARC_FILTER"

    .line 193
    .line 194
    const/16 v6, 0xc

    .line 195
    .line 196
    invoke-direct {v0, v5, v6, v4}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 197
    .line 198
    .line 199
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->BCJ_SPARC_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 200
    .line 201
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 202
    .line 203
    new-array v1, v1, [B

    .line 204
    .line 205
    aput-byte v2, v1, v3

    .line 206
    .line 207
    const-string v2, "DELTA_FILTER"

    .line 208
    .line 209
    const/16 v3, 0xd

    .line 210
    .line 211
    invoke-direct {v0, v2, v3, v1}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;-><init>(Ljava/lang/String;I[B)V

    .line 212
    .line 213
    .line 214
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->DELTA_FILTER:Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 215
    .line 216
    invoke-static {}, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->$values()[Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->$VALUES:[Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 221
    .line 222
    return-void

    .line 223
    :array_0
    .array-data 1
        0x3t
        0x1t
        0x1t
    .end array-data

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    :array_1
    .array-data 1
        0x4t
        0x1t
        0x8t
    .end array-data

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    :array_2
    .array-data 1
        0x4t
        0x1t
        0x9t
    .end array-data

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    :array_3
    .array-data 1
        0x4t
        0x2t
        0x2t
    .end array-data

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    :array_4
    .array-data 1
        0x6t
        -0xft
        0x7t
        0x1t
    .end array-data

    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    :array_5
    .array-data 1
        0x3t
        0x3t
        0x1t
        0x3t
    .end array-data

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    :array_6
    .array-data 1
        0x3t
        0x3t
        0x2t
        0x5t
    .end array-data

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    :array_7
    .array-data 1
        0x3t
        0x3t
        0x4t
        0x1t
    .end array-data

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    :array_8
    .array-data 1
        0x3t
        0x3t
        0x5t
        0x1t
    .end array-data

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    :array_9
    .array-data 1
        0x3t
        0x3t
        0x7t
        0x1t
    .end array-data

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    :array_a
    .array-data 1
        0x3t
        0x3t
        0x8t
        0x5t
    .end array-data
.end method

.method private constructor <init>(Ljava/lang/String;I[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->id:[B

    .line 5
    .line 6
    return-void
.end method

.method public static byId([B)Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;
    .locals 5

    .line 1
    const-class v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_1

    .line 12
    .line 13
    aget-object v3, v0, v2

    .line 14
    .line 15
    iget-object v4, v3, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->id:[B

    .line 16
    .line 17
    invoke-static {v4, p0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    return-object v3

    .line 24
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;
    .locals 1

    .line 1
    const-class v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->$VALUES:[Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getId()[B
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/sevenz/SevenZMethod;->id:[B

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method
