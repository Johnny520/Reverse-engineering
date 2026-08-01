.class public final Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏兰哲;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Record"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;
    }
.end annotation


# static fields
.field public static PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u82cf\u5170;"
        }
    .end annotation
.end field

.field private static final defaultInstance:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;


# instance fields
.field private bitField0_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private operation_:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;

.field private predefinedIndex_:I

.field private range_:I

.field private replaceCharMemoizedSerializedSize:I

.field private replaceChar_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private string_:Ljava/lang/Object;

.field private substringIndexMemoizedSerializedSize:I

.field private substringIndex_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 7
    .line 8
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->defaultInstance:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;

    .line 15
    .line 16
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->initFields()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndexMemoizedSerializedSize:I

    .line 6
    .line 7
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceCharMemoizedSerializedSize:I

    .line 8
    .line 9
    iput-byte v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->memoizedIsInitialized:B

    .line 10
    .line 11
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->memoizedSerializedSize:I

    .line 12
    .line 13
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->initFields()V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;

    .line 17
    .line 18
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/io/OutputStream;I)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x0

    .line 27
    move v4, v3

    .line 28
    :cond_0
    :goto_0
    const/16 v5, 0x20

    .line 29
    .line 30
    const/16 v6, 0x10

    .line 31
    .line 32
    if-nez v3, :cond_13

    .line 33
    .line 34
    :try_start_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-eqz v7, :cond_1

    .line 39
    .line 40
    const/16 v8, 0x8

    .line 41
    .line 42
    if-eq v7, v8, :cond_10

    .line 43
    .line 44
    if-eq v7, v6, :cond_f

    .line 45
    .line 46
    const/16 v9, 0x18

    .line 47
    .line 48
    if-eq v7, v9, :cond_d

    .line 49
    .line 50
    if-eq v7, v5, :cond_b

    .line 51
    .line 52
    const/16 v8, 0x22

    .line 53
    .line 54
    if-eq v7, v8, :cond_8

    .line 55
    .line 56
    const/16 v8, 0x28

    .line 57
    .line 58
    if-eq v7, v8, :cond_6

    .line 59
    .line 60
    const/16 v8, 0x2a

    .line 61
    .line 62
    if-eq v7, v8, :cond_3

    .line 63
    .line 64
    const/16 v8, 0x32

    .line 65
    .line 66
    if-eq v7, v8, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0, p1, v2, p2, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;->parseUnknownField(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;I)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_0

    .line 73
    .line 74
    :cond_1
    move v3, v1

    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :catch_0
    move-exception p1

    .line 80
    goto/16 :goto_3

    .line 81
    .line 82
    :catch_1
    move-exception p1

    .line 83
    goto/16 :goto_4

    .line 84
    .line 85
    :cond_2
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    iget v8, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 90
    .line 91
    or-int/lit8 v8, v8, 0x4

    .line 92
    .line 93
    iput v8, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 94
    .line 95
    iput-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->string_:Ljava/lang/Object;

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    invoke-virtual {p1, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    and-int/lit8 v8, v4, 0x20

    .line 107
    .line 108
    if-eq v8, v5, :cond_4

    .line 109
    .line 110
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-lez v8, :cond_4

    .line 115
    .line 116
    new-instance v8, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    iput-object v8, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 122
    .line 123
    or-int/lit8 v4, v4, 0x20

    .line 124
    .line 125
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()I

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-lez v8, :cond_5

    .line 130
    .line 131
    iget-object v8, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 132
    .line 133
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    invoke-virtual {p1, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(I)V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_6
    and-int/lit8 v7, v4, 0x20

    .line 150
    .line 151
    if-eq v7, v5, :cond_7

    .line 152
    .line 153
    new-instance v7, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 159
    .line 160
    or-int/lit8 v4, v4, 0x20

    .line 161
    .line 162
    :cond_7
    iget-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 163
    .line 164
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_8
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    invoke-virtual {p1, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)I

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    and-int/lit8 v8, v4, 0x10

    .line 186
    .line 187
    if-eq v8, v6, :cond_9

    .line 188
    .line 189
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()I

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    if-lez v8, :cond_9

    .line 194
    .line 195
    new-instance v8, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 198
    .line 199
    .line 200
    iput-object v8, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 201
    .line 202
    or-int/lit8 v4, v4, 0x10

    .line 203
    .line 204
    :cond_9
    :goto_2
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()I

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    if-lez v8, :cond_a

    .line 209
    .line 210
    iget-object v8, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 211
    .line 212
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_a
    invoke-virtual {p1, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(I)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :cond_b
    and-int/lit8 v7, v4, 0x10

    .line 230
    .line 231
    if-eq v7, v6, :cond_c

    .line 232
    .line 233
    new-instance v7, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    iput-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 239
    .line 240
    or-int/lit8 v4, v4, 0x10

    .line 241
    .line 242
    :cond_c
    iget-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 243
    .line 244
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto/16 :goto_0

    .line 256
    .line 257
    :cond_d
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 258
    .line 259
    .line 260
    move-result v9

    .line 261
    invoke-static {v9}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;->valueOf(I)Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;

    .line 262
    .line 263
    .line 264
    move-result-object v10

    .line 265
    if-nez v10, :cond_e

    .line 266
    .line 267
    invoke-virtual {v2, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v9}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 271
    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :cond_e
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 276
    .line 277
    or-int/2addr v7, v8

    .line 278
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 279
    .line 280
    iput-object v10, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->operation_:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;

    .line 281
    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :cond_f
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 285
    .line 286
    or-int/lit8 v7, v7, 0x2

    .line 287
    .line 288
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 289
    .line 290
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 291
    .line 292
    .line 293
    move-result v7

    .line 294
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->predefinedIndex_:I

    .line 295
    .line 296
    goto/16 :goto_0

    .line 297
    .line 298
    :cond_10
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 299
    .line 300
    or-int/2addr v7, v1

    .line 301
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 302
    .line 303
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 304
    .line 305
    .line 306
    move-result v7

    .line 307
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->range_:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 308
    .line 309
    goto/16 :goto_0

    .line 310
    .line 311
    :goto_3
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p2, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    throw p1

    .line 325
    :goto_4
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 330
    :goto_5
    and-int/lit8 p2, v4, 0x10

    .line 331
    .line 332
    if-ne p2, v6, :cond_11

    .line 333
    .line 334
    iget-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 335
    .line 336
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object p2

    .line 340
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 341
    .line 342
    :cond_11
    and-int/lit8 p2, v4, 0x20

    .line 343
    .line 344
    if-ne p2, v5, :cond_12

    .line 345
    .line 346
    iget-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 347
    .line 348
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object p2

    .line 352
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 353
    .line 354
    :cond_12
    :try_start_2
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 355
    .line 356
    .line 357
    :catch_2
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 358
    .line 359
    .line 360
    move-result-object p2

    .line 361
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 362
    .line 363
    goto :goto_6

    .line 364
    :catchall_1
    move-exception p1

    .line 365
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 366
    .line 367
    .line 368
    move-result-object p2

    .line 369
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 370
    .line 371
    throw p1

    .line 372
    :goto_6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;->makeExtensionsImmutable()V

    .line 373
    .line 374
    .line 375
    throw p1

    .line 376
    :cond_13
    and-int/lit8 p1, v4, 0x10

    .line 377
    .line 378
    if-ne p1, v6, :cond_14

    .line 379
    .line 380
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 381
    .line 382
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 383
    .line 384
    .line 385
    move-result-object p1

    .line 386
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 387
    .line 388
    :cond_14
    and-int/lit8 p1, v4, 0x20

    .line 389
    .line 390
    if-ne p1, v5, :cond_15

    .line 391
    .line 392
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 393
    .line 394
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 399
    .line 400
    :cond_15
    :try_start_3
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 401
    .line 402
    .line 403
    :catch_3
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 408
    .line 409
    goto :goto_7

    .line 410
    :catchall_2
    move-exception p1

    .line 411
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 412
    .line 413
    .line 414
    move-result-object p2

    .line 415
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 416
    .line 417
    throw p1

    .line 418
    :goto_7
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;->makeExtensionsImmutable()V

    .line 419
    .line 420
    .line 421
    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;L飘花落叶言世楪哲兰苏子/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 436
    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;)V
    .locals 1

    .line 423
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;)V

    const/4 v0, -0x1

    .line 424
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndexMemoizedSerializedSize:I

    .line 425
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceCharMemoizedSerializedSize:I

    .line 426
    iput-byte v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->memoizedIsInitialized:B

    .line 427
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->memoizedSerializedSize:I

    .line 428
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 429
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;L飘花落叶言世楪哲兰苏子/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 422
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 430
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite;-><init>()V

    const/4 p1, -0x1

    .line 431
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndexMemoizedSerializedSize:I

    .line 432
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceCharMemoizedSerializedSize:I

    .line 433
    iput-byte p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->memoizedIsInitialized:B

    .line 434
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->memoizedSerializedSize:I

    .line 435
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    return-void
.end method

.method public static synthetic access$1002(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1100(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$402(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->range_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$502(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->predefinedIndex_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$600(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->string_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$602(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->string_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$702(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;)Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->operation_:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$800(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$802(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$900(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$902(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->defaultInstance:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;

    .line 2
    .line 3
    return-object v0
.end method

.method private initFields()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->range_:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->predefinedIndex_:I

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->string_:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;->NONE:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;

    .line 12
    .line 13
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->operation_:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;

    .line 14
    .line 15
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 16
    .line 17
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 18
    .line 19
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 20
    .line 21
    return-void
.end method

.method public static newBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 8
    .line 9
    const-string v1, ""

    .line 10
    .line 11
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 12
    .line 13
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;->NONE:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;

    .line 14
    .line 15
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;

    .line 16
    .line 17
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Ljava/util/List;

    .line 20
    .line 21
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:Ljava/util/List;

    .line 22
    .line 23
    return-object v0
.end method

.method public static newBuilder(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;)Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;
    .locals 1

    .line 24
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->newBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;

    move-result-object v0

    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;)V

    return-object v0
.end method


# virtual methods
.method public getDefaultInstanceForType()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;
    .locals 0

    .line 6
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->defaultInstance:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->getDefaultInstanceForType()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getOperation()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->operation_:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;

    .line 2
    .line 3
    return-object p0
.end method

.method public getParserForType()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u82cf\u5170;"
        }
    .end annotation

    .line 1
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPredefinedIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->predefinedIndex_:I

    .line 2
    .line 3
    return p0
.end method

.method public getRange()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->range_:I

    .line 2
    .line 3
    return p0
.end method

.method public getReplaceCharCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getReplaceCharList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 1
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->memoizedSerializedSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->range_:I

    .line 15
    .line 16
    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v2

    .line 22
    :goto_0
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    and-int/2addr v1, v3

    .line 26
    if-ne v1, v3, :cond_2

    .line 27
    .line 28
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->predefinedIndex_:I

    .line 29
    .line 30
    invoke-static {v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v0, v1

    .line 35
    :cond_2
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 36
    .line 37
    const/16 v3, 0x8

    .line 38
    .line 39
    and-int/2addr v1, v3

    .line 40
    if-ne v1, v3, :cond_3

    .line 41
    .line 42
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->operation_:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;

    .line 43
    .line 44
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;->getNumber()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/4 v3, 0x3

    .line 49
    invoke-static {v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(II)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v0, v1

    .line 54
    :cond_3
    move v1, v2

    .line 55
    move v3, v1

    .line 56
    :goto_1
    iget-object v4, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-ge v1, v4, :cond_4

    .line 63
    .line 64
    iget-object v4, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-static {v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    add-int/2addr v3, v4

    .line 81
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    add-int/2addr v0, v3

    .line 85
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->getSubstringIndexList()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_5

    .line 94
    .line 95
    add-int/lit8 v0, v0, 0x1

    .line 96
    .line 97
    invoke-static {v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    add-int/2addr v0, v1

    .line 102
    :cond_5
    iput v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndexMemoizedSerializedSize:I

    .line 103
    .line 104
    move v1, v2

    .line 105
    :goto_2
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-ge v2, v3, :cond_6

    .line 112
    .line 113
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-static {v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    add-int/2addr v1, v3

    .line 130
    add-int/lit8 v2, v2, 0x1

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_6
    add-int/2addr v0, v1

    .line 134
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->getReplaceCharList()Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-nez v2, :cond_7

    .line 143
    .line 144
    add-int/lit8 v0, v0, 0x1

    .line 145
    .line 146
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    add-int/2addr v0, v2

    .line 151
    :cond_7
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceCharMemoizedSerializedSize:I

    .line 152
    .line 153
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 154
    .line 155
    const/4 v2, 0x4

    .line 156
    and-int/2addr v1, v2

    .line 157
    if-ne v1, v2, :cond_8

    .line 158
    .line 159
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->getStringBytes()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    const/4 v2, 0x6

    .line 164
    invoke-static {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(I)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->size()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    invoke-static {v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(I)I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->size()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    add-int/2addr v1, v3

    .line 181
    add-int/2addr v1, v2

    .line 182
    add-int/2addr v0, v1

    .line 183
    :cond_8
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 184
    .line 185
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->size()I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    add-int/2addr v1, v0

    .line 190
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->memoizedSerializedSize:I

    .line 191
    .line 192
    return v1
.end method

.method public getString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->string_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 11
    .line 12
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iput-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->string_:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_1
    return-object v1
.end method

.method public getStringBytes()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 3

    .line 1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->string_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    :try_start_0
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;

    .line 10
    .line 11
    const-string v2, "UTF-8"

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;-><init>([B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->string_:Ljava/lang/Object;

    .line 21
    .line 22
    return-object v1

    .line 23
    :catch_0
    move-exception p0

    .line 24
    const-string v0, "UTF-8 not supported?"

    .line 25
    .line 26
    invoke-static {v0, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_0
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 32
    .line 33
    return-object v0
.end method

.method public getSubstringIndexCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getSubstringIndexList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public hasOperation()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    and-int/2addr p0, v0

    .line 6
    if-ne p0, v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public hasPredefinedIndex()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    and-int/2addr p0, v0

    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasRange()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    and-int/2addr p0, v0

    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public hasString()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    and-int/2addr p0, v0

    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->memoizedIsInitialized:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    iput-byte v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public newBuilderForType()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;
    .locals 0

    .line 6
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->newBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->newBuilderForType()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;
    .locals 0

    .line 6
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->newBuilder(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;)Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic toBuilder()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->toBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public writeTo(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->getSerializedSize()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->range_:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->predefinedIndex_:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 27
    .line 28
    const/16 v2, 0x8

    .line 29
    .line 30
    and-int/2addr v0, v2

    .line 31
    if-ne v0, v2, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->operation_:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;

    .line 34
    .line 35
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record$Operation;->getNumber()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v2, 0x3

    .line 40
    invoke-virtual {p1, v2, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(II)V

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->getSubstringIndexList()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-lez v0, :cond_3

    .line 52
    .line 53
    const/16 v0, 0x22

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 56
    .line 57
    .line 58
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndexMemoizedSerializedSize:I

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 61
    .line 62
    .line 63
    :cond_3
    const/4 v0, 0x0

    .line 64
    move v2, v0

    .line 65
    :goto_0
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-ge v2, v3, :cond_4

    .line 72
    .line 73
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->substringIndex_:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-virtual {p1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰(I)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->getReplaceCharList()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-lez v2, :cond_5

    .line 100
    .line 101
    const/16 v2, 0x2a

    .line 102
    .line 103
    invoke-virtual {p1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 104
    .line 105
    .line 106
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceCharMemoizedSerializedSize:I

    .line 107
    .line 108
    invoke-virtual {p1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 109
    .line 110
    .line 111
    :cond_5
    :goto_1
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-ge v0, v2, :cond_6

    .line 118
    .line 119
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->replaceChar_:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    invoke-virtual {p1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰(I)V

    .line 132
    .line 133
    .line 134
    add-int/lit8 v0, v0, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_6
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->bitField0_:I

    .line 138
    .line 139
    const/4 v2, 0x4

    .line 140
    and-int/2addr v0, v2

    .line 141
    if-ne v0, v2, :cond_7

    .line 142
    .line 143
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->getStringBytes()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const/4 v2, 0x6

    .line 148
    invoke-virtual {p1, v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世(II)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->size()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-virtual {p1, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;)V

    .line 159
    .line 160
    .line 161
    :cond_7
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$StringTableTypes$Record;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 162
    .line 163
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method
