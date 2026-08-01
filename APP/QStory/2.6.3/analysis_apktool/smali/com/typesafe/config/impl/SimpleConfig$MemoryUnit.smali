.class final enum Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/typesafe/config/impl/SimpleConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MemoryUnit"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum BYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum EXABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum EXBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum GIBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum GIGABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum KIBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum KILOBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum MEBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum MEGABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum PEBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum PETABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum TEBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum TERABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum YOBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum YOTTABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum ZEBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field public static final enum ZETTABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

.field private static unitsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final bytes:Ljava/math/BigInteger;

.field final power:I

.field final powerOf:I

.field final prefix:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 2
    .line 3
    const/16 v4, 0x400

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const-string v1, "BYTES"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const-string v3, ""

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->BYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 15
    .line 16
    new-instance v1, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 17
    .line 18
    const/16 v5, 0x3e8

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    const-string v2, "KILOBYTES"

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    const-string v4, "kilo"

    .line 25
    .line 26
    invoke-direct/range {v1 .. v6}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->KILOBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 30
    .line 31
    new-instance v2, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 32
    .line 33
    const/16 v6, 0x3e8

    .line 34
    .line 35
    const/4 v7, 0x2

    .line 36
    const-string v3, "MEGABYTES"

    .line 37
    .line 38
    const/4 v4, 0x2

    .line 39
    const-string v5, "mega"

    .line 40
    .line 41
    invoke-direct/range {v2 .. v7}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 42
    .line 43
    .line 44
    sput-object v2, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->MEGABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 45
    .line 46
    new-instance v3, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 47
    .line 48
    const/16 v7, 0x3e8

    .line 49
    .line 50
    const/4 v8, 0x3

    .line 51
    const-string v4, "GIGABYTES"

    .line 52
    .line 53
    const/4 v5, 0x3

    .line 54
    const-string v6, "giga"

    .line 55
    .line 56
    invoke-direct/range {v3 .. v8}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v3, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->GIGABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 60
    .line 61
    new-instance v4, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 62
    .line 63
    const/16 v8, 0x3e8

    .line 64
    .line 65
    const/4 v9, 0x4

    .line 66
    const-string v5, "TERABYTES"

    .line 67
    .line 68
    const/4 v6, 0x4

    .line 69
    const-string v7, "tera"

    .line 70
    .line 71
    invoke-direct/range {v4 .. v9}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 72
    .line 73
    .line 74
    sput-object v4, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->TERABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 75
    .line 76
    new-instance v5, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 77
    .line 78
    const/16 v9, 0x3e8

    .line 79
    .line 80
    const/4 v10, 0x5

    .line 81
    const-string v6, "PETABYTES"

    .line 82
    .line 83
    const/4 v7, 0x5

    .line 84
    const-string v8, "peta"

    .line 85
    .line 86
    invoke-direct/range {v5 .. v10}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 87
    .line 88
    .line 89
    sput-object v5, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->PETABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 90
    .line 91
    new-instance v6, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 92
    .line 93
    const/16 v10, 0x3e8

    .line 94
    .line 95
    const/4 v11, 0x6

    .line 96
    const-string v7, "EXABYTES"

    .line 97
    .line 98
    const/4 v8, 0x6

    .line 99
    const-string v9, "exa"

    .line 100
    .line 101
    invoke-direct/range {v6 .. v11}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 102
    .line 103
    .line 104
    sput-object v6, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->EXABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 105
    .line 106
    new-instance v7, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 107
    .line 108
    const/16 v11, 0x3e8

    .line 109
    .line 110
    const/4 v12, 0x7

    .line 111
    const-string v8, "ZETTABYTES"

    .line 112
    .line 113
    const/4 v9, 0x7

    .line 114
    const-string v10, "zetta"

    .line 115
    .line 116
    invoke-direct/range {v7 .. v12}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 117
    .line 118
    .line 119
    sput-object v7, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->ZETTABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 120
    .line 121
    new-instance v8, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 122
    .line 123
    const/16 v12, 0x3e8

    .line 124
    .line 125
    const/16 v13, 0x8

    .line 126
    .line 127
    const-string v9, "YOTTABYTES"

    .line 128
    .line 129
    const/16 v10, 0x8

    .line 130
    .line 131
    const-string v11, "yotta"

    .line 132
    .line 133
    invoke-direct/range {v8 .. v13}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 134
    .line 135
    .line 136
    sput-object v8, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->YOTTABYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 137
    .line 138
    new-instance v9, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 139
    .line 140
    const/16 v13, 0x400

    .line 141
    .line 142
    const/4 v14, 0x1

    .line 143
    const-string v10, "KIBIBYTES"

    .line 144
    .line 145
    const/16 v11, 0x9

    .line 146
    .line 147
    const-string v12, "kibi"

    .line 148
    .line 149
    invoke-direct/range {v9 .. v14}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 150
    .line 151
    .line 152
    sput-object v9, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->KIBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 153
    .line 154
    new-instance v10, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 155
    .line 156
    const/16 v14, 0x400

    .line 157
    .line 158
    const/4 v15, 0x2

    .line 159
    const-string v11, "MEBIBYTES"

    .line 160
    .line 161
    const/16 v12, 0xa

    .line 162
    .line 163
    const-string v13, "mebi"

    .line 164
    .line 165
    invoke-direct/range {v10 .. v15}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 166
    .line 167
    .line 168
    sput-object v10, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->MEBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 169
    .line 170
    new-instance v11, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 171
    .line 172
    const/16 v15, 0x400

    .line 173
    .line 174
    const/16 v16, 0x3

    .line 175
    .line 176
    const-string v12, "GIBIBYTES"

    .line 177
    .line 178
    const/16 v13, 0xb

    .line 179
    .line 180
    const-string v14, "gibi"

    .line 181
    .line 182
    invoke-direct/range {v11 .. v16}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 183
    .line 184
    .line 185
    sput-object v11, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->GIBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 186
    .line 187
    new-instance v12, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 188
    .line 189
    const/16 v16, 0x400

    .line 190
    .line 191
    const/16 v17, 0x4

    .line 192
    .line 193
    const-string v13, "TEBIBYTES"

    .line 194
    .line 195
    const/16 v14, 0xc

    .line 196
    .line 197
    const-string v15, "tebi"

    .line 198
    .line 199
    invoke-direct/range {v12 .. v17}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 200
    .line 201
    .line 202
    sput-object v12, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->TEBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 203
    .line 204
    new-instance v13, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 205
    .line 206
    const/16 v17, 0x400

    .line 207
    .line 208
    const/16 v18, 0x5

    .line 209
    .line 210
    const-string v14, "PEBIBYTES"

    .line 211
    .line 212
    const/16 v15, 0xd

    .line 213
    .line 214
    const-string v16, "pebi"

    .line 215
    .line 216
    invoke-direct/range {v13 .. v18}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 217
    .line 218
    .line 219
    sput-object v13, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->PEBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 220
    .line 221
    new-instance v14, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 222
    .line 223
    const/16 v18, 0x400

    .line 224
    .line 225
    const/16 v19, 0x6

    .line 226
    .line 227
    const-string v15, "EXBIBYTES"

    .line 228
    .line 229
    const/16 v16, 0xe

    .line 230
    .line 231
    const-string v17, "exbi"

    .line 232
    .line 233
    invoke-direct/range {v14 .. v19}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 234
    .line 235
    .line 236
    sput-object v14, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->EXBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 237
    .line 238
    new-instance v16, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 239
    .line 240
    const/16 v19, 0x400

    .line 241
    .line 242
    const/16 v20, 0x7

    .line 243
    .line 244
    move-object/from16 v15, v16

    .line 245
    .line 246
    const-string v16, "ZEBIBYTES"

    .line 247
    .line 248
    const/16 v17, 0xf

    .line 249
    .line 250
    const-string v18, "zebi"

    .line 251
    .line 252
    invoke-direct/range {v15 .. v20}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 253
    .line 254
    .line 255
    sput-object v15, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->ZEBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 256
    .line 257
    new-instance v16, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 258
    .line 259
    const/16 v20, 0x400

    .line 260
    .line 261
    const/16 v21, 0x8

    .line 262
    .line 263
    const-string v17, "YOBIBYTES"

    .line 264
    .line 265
    const/16 v18, 0x10

    .line 266
    .line 267
    const-string v19, "yobi"

    .line 268
    .line 269
    invoke-direct/range {v16 .. v21}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    .line 270
    .line 271
    .line 272
    sput-object v16, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->YOBIBYTES:Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 273
    .line 274
    move-object/from16 v17, v16

    .line 275
    .line 276
    move-object/from16 v16, v15

    .line 277
    .line 278
    move-object v15, v14

    .line 279
    move-object v14, v13

    .line 280
    move-object v13, v12

    .line 281
    move-object v12, v11

    .line 282
    move-object v11, v10

    .line 283
    move-object v10, v9

    .line 284
    move-object v9, v8

    .line 285
    move-object v8, v7

    .line 286
    move-object v7, v6

    .line 287
    move-object v6, v5

    .line 288
    move-object v5, v4

    .line 289
    move-object v4, v3

    .line 290
    move-object v3, v2

    .line 291
    move-object v2, v1

    .line 292
    move-object v1, v0

    .line 293
    filled-new-array/range {v1 .. v17}, [Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    sput-object v0, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->$VALUES:[Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 298
    .line 299
    invoke-static {}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->makeUnitsMap()Ljava/util/Map;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    sput-object v0, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->unitsMap:Ljava/util/Map;

    .line 304
    .line 305
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->prefix:Ljava/lang/String;

    .line 5
    .line 6
    iput p4, p0, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->powerOf:I

    .line 7
    .line 8
    iput p5, p0, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->power:I

    .line 9
    .line 10
    int-to-long p1, p4

    .line 11
    invoke-static {p1, p2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p5}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->bytes:Ljava/math/BigInteger;

    .line 20
    .line 21
    return-void
.end method

.method private static makeUnitsMap()Ljava/util/Map;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->values()[Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    array-length v2, v1

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v2, :cond_4

    .line 14
    .line 15
    aget-object v5, v1, v4

    .line 16
    .line 17
    new-instance v6, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v7, v5, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->prefix:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v7, "byte"

    .line 28
    .line 29
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    new-instance v6, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v7, v5, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->prefix:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v7, "bytes"

    .line 50
    .line 51
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    iget-object v6, v5, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->prefix:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    const-string v7, "B"

    .line 68
    .line 69
    if-nez v6, :cond_0

    .line 70
    .line 71
    const-string v6, "b"

    .line 72
    .line 73
    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    const-string v6, ""

    .line 80
    .line 81
    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_0
    iget-object v6, v5, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->prefix:Ljava/lang/String;

    .line 86
    .line 87
    const/4 v8, 0x1

    .line 88
    invoke-virtual {v6, v3, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v6}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    iget v10, v5, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->powerOf:I

    .line 97
    .line 98
    const/16 v11, 0x400

    .line 99
    .line 100
    if-ne v10, v11, :cond_1

    .line 101
    .line 102
    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v9, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    new-instance v6, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v7, "i"

    .line 117
    .line 118
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    new-instance v6, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v7, "iB"

    .line 137
    .line 138
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_1
    const/16 v11, 0x3e8

    .line 150
    .line 151
    if-ne v10, v11, :cond_3

    .line 152
    .line 153
    iget v10, v5, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->power:I

    .line 154
    .line 155
    if-ne v10, v8, :cond_2

    .line 156
    .line 157
    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 184
    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_3
    const-string v0, "broken MemoryUnit enum"

    .line 188
    .line 189
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    const/4 v0, 0x0

    .line 193
    :cond_4
    return-object v0
.end method

.method public static parseUnit(Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;
    .locals 1

    .line 1
    sget-object v0, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->unitsMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 8
    .line 9
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;
    .locals 1

    .line 1
    const-class v0, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;
    .locals 1

    .line 1
    sget-object v0, Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->$VALUES:[Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/typesafe/config/impl/SimpleConfig$MemoryUnit;

    .line 8
    .line 9
    return-object v0
.end method
