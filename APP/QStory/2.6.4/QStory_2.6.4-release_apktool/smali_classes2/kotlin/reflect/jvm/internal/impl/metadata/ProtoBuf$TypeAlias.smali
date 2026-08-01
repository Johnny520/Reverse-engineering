.class public final Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage<",
        "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;",
        ">;"
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

.field private static final defaultInstance:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;


# instance fields
.field private annotation_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;",
            ">;"
        }
    .end annotation
.end field

.field private bitField0_:I

.field private compilerPluginData_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;",
            ">;"
        }
    .end annotation
.end field

.field private expandedTypeId_:I

.field private expandedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

.field private flags_:I

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private name_:I

.field private typeParameter_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;",
            ">;"
        }
    .end annotation
.end field

.field private underlyingTypeId_:I

.field private underlyingType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

.field private final unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

.field private versionRequirement_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 9
    .line 10
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->defaultInstance:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;

    .line 17
    .line 18
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->initFields()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput-byte v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedIsInitialized:B

    .line 6
    .line 7
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedSerializedSize:I

    .line 8
    .line 9
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->initFields()V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;

    .line 13
    .line 14
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/io/OutputStream;I)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    move v4, v3

    .line 24
    :cond_0
    :goto_0
    const/16 v5, 0x80

    .line 25
    .line 26
    const/16 v6, 0x200

    .line 27
    .line 28
    const/4 v7, 0x4

    .line 29
    const/16 v8, 0x100

    .line 30
    .line 31
    if-nez v3, :cond_f

    .line 32
    .line 33
    :try_start_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    const/4 v10, 0x0

    .line 38
    sparse-switch v9, :sswitch_data_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1, v2, p2, v9}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;->parseUnknownField(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;I)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-nez v5, :cond_0

    .line 46
    .line 47
    :sswitch_0
    move v3, v1

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :catch_0
    move-exception p1

    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    :catch_1
    move-exception p1

    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :sswitch_1
    and-int/lit16 v9, v4, 0x200

    .line 59
    .line 60
    if-eq v9, v6, :cond_1

    .line 61
    .line 62
    new-instance v9, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 68
    .line 69
    or-int/lit16 v4, v4, 0x200

    .line 70
    .line 71
    :cond_1
    iget-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 72
    .line 73
    sget-object v10, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 74
    .line 75
    invoke-virtual {p1, v10, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :sswitch_2
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    invoke-virtual {p1, v9}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    and-int/lit16 v10, v4, 0x100

    .line 92
    .line 93
    if-eq v10, v8, :cond_2

    .line 94
    .line 95
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()I

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-lez v10, :cond_2

    .line 100
    .line 101
    new-instance v10, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v10, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 107
    .line 108
    or-int/lit16 v4, v4, 0x100

    .line 109
    .line 110
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    if-lez v10, :cond_3

    .line 115
    .line 116
    iget-object v10, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 117
    .line 118
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_3
    invoke-virtual {p1, v9}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(I)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :sswitch_3
    and-int/lit16 v9, v4, 0x100

    .line 135
    .line 136
    if-eq v9, v8, :cond_4

    .line 137
    .line 138
    new-instance v9, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    iput-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 144
    .line 145
    or-int/lit16 v4, v4, 0x100

    .line 146
    .line 147
    :cond_4
    iget-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 148
    .line 149
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :sswitch_4
    and-int/lit16 v9, v4, 0x80

    .line 163
    .line 164
    if-eq v9, v5, :cond_5

    .line 165
    .line 166
    new-instance v9, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    iput-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 172
    .line 173
    or-int/lit16 v4, v4, 0x80

    .line 174
    .line 175
    :cond_5
    iget-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 176
    .line 177
    sget-object v10, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 178
    .line 179
    invoke-virtual {p1, v10, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :sswitch_5
    iget v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 189
    .line 190
    or-int/lit8 v9, v9, 0x20

    .line 191
    .line 192
    iput v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 193
    .line 194
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    iput v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedTypeId_:I

    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :sswitch_6
    iget v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 203
    .line 204
    const/16 v11, 0x10

    .line 205
    .line 206
    and-int/2addr v9, v11

    .line 207
    if-ne v9, v11, :cond_6

    .line 208
    .line 209
    iget-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 210
    .line 211
    invoke-virtual {v9}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->toBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    :cond_6
    sget-object v9, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 216
    .line 217
    invoke-virtual {p1, v9, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    check-cast v9, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 222
    .line 223
    iput-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 224
    .line 225
    if-eqz v10, :cond_7

    .line 226
    .line 227
    invoke-virtual {v10, v9}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v10}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    iput-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 235
    .line 236
    :cond_7
    iget v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 237
    .line 238
    or-int/2addr v9, v11

    .line 239
    iput v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :sswitch_7
    iget v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 244
    .line 245
    or-int/lit8 v9, v9, 0x8

    .line 246
    .line 247
    iput v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 248
    .line 249
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 250
    .line 251
    .line 252
    move-result v9

    .line 253
    iput v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingTypeId_:I

    .line 254
    .line 255
    goto/16 :goto_0

    .line 256
    .line 257
    :sswitch_8
    iget v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 258
    .line 259
    and-int/2addr v9, v7

    .line 260
    if-ne v9, v7, :cond_8

    .line 261
    .line 262
    iget-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 263
    .line 264
    invoke-virtual {v9}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->toBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    :cond_8
    sget-object v9, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 269
    .line 270
    invoke-virtual {p1, v9, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    check-cast v9, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 275
    .line 276
    iput-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 277
    .line 278
    if-eqz v10, :cond_9

    .line 279
    .line 280
    invoke-virtual {v10, v9}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v10}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 284
    .line 285
    .line 286
    move-result-object v9

    .line 287
    iput-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 288
    .line 289
    :cond_9
    iget v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 290
    .line 291
    or-int/2addr v9, v7

    .line 292
    iput v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_9
    and-int/lit8 v9, v4, 0x4

    .line 297
    .line 298
    if-eq v9, v7, :cond_a

    .line 299
    .line 300
    new-instance v9, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 303
    .line 304
    .line 305
    iput-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 306
    .line 307
    or-int/lit8 v4, v4, 0x4

    .line 308
    .line 309
    :cond_a
    iget-object v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 310
    .line 311
    sget-object v10, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 312
    .line 313
    invoke-virtual {p1, v10, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    goto/16 :goto_0

    .line 321
    .line 322
    :sswitch_a
    iget v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 323
    .line 324
    or-int/lit8 v9, v9, 0x2

    .line 325
    .line 326
    iput v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 327
    .line 328
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 329
    .line 330
    .line 331
    move-result v9

    .line 332
    iput v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->name_:I

    .line 333
    .line 334
    goto/16 :goto_0

    .line 335
    .line 336
    :sswitch_b
    iget v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 337
    .line 338
    or-int/2addr v9, v1

    .line 339
    iput v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 340
    .line 341
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 342
    .line 343
    .line 344
    move-result v9

    .line 345
    iput v9, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->flags_:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 346
    .line 347
    goto/16 :goto_0

    .line 348
    .line 349
    :goto_2
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {p2, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    throw p1

    .line 363
    :goto_3
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 368
    :goto_4
    and-int/lit8 p2, v4, 0x4

    .line 369
    .line 370
    if-ne p2, v7, :cond_b

    .line 371
    .line 372
    iget-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 373
    .line 374
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 375
    .line 376
    .line 377
    move-result-object p2

    .line 378
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 379
    .line 380
    :cond_b
    and-int/lit16 p2, v4, 0x80

    .line 381
    .line 382
    if-ne p2, v5, :cond_c

    .line 383
    .line 384
    iget-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 385
    .line 386
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 387
    .line 388
    .line 389
    move-result-object p2

    .line 390
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 391
    .line 392
    :cond_c
    and-int/lit16 p2, v4, 0x100

    .line 393
    .line 394
    if-ne p2, v8, :cond_d

    .line 395
    .line 396
    iget-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 397
    .line 398
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 399
    .line 400
    .line 401
    move-result-object p2

    .line 402
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 403
    .line 404
    :cond_d
    and-int/lit16 p2, v4, 0x200

    .line 405
    .line 406
    if-ne p2, v6, :cond_e

    .line 407
    .line 408
    iget-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 409
    .line 410
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 411
    .line 412
    .line 413
    move-result-object p2

    .line 414
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 415
    .line 416
    :cond_e
    :try_start_2
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 417
    .line 418
    .line 419
    :catch_2
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 420
    .line 421
    .line 422
    move-result-object p2

    .line 423
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 424
    .line 425
    goto :goto_5

    .line 426
    :catchall_1
    move-exception p1

    .line 427
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 428
    .line 429
    .line 430
    move-result-object p2

    .line 431
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 432
    .line 433
    throw p1

    .line 434
    :goto_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;->makeExtensionsImmutable()V

    .line 435
    .line 436
    .line 437
    throw p1

    .line 438
    :cond_f
    and-int/lit8 p1, v4, 0x4

    .line 439
    .line 440
    if-ne p1, v7, :cond_10

    .line 441
    .line 442
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 443
    .line 444
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 449
    .line 450
    :cond_10
    and-int/lit16 p1, v4, 0x80

    .line 451
    .line 452
    if-ne p1, v5, :cond_11

    .line 453
    .line 454
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 455
    .line 456
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 461
    .line 462
    :cond_11
    and-int/lit16 p1, v4, 0x100

    .line 463
    .line 464
    if-ne p1, v8, :cond_12

    .line 465
    .line 466
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 467
    .line 468
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 473
    .line 474
    :cond_12
    and-int/lit16 p1, v4, 0x200

    .line 475
    .line 476
    if-ne p1, v6, :cond_13

    .line 477
    .line 478
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 479
    .line 480
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object p1

    .line 484
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 485
    .line 486
    :cond_13
    :try_start_3
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 487
    .line 488
    .line 489
    :catch_3
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 490
    .line 491
    .line 492
    move-result-object p1

    .line 493
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 494
    .line 495
    goto :goto_6

    .line 496
    :catchall_2
    move-exception p1

    .line 497
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 498
    .line 499
    .line 500
    move-result-object p2

    .line 501
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 502
    .line 503
    throw p1

    .line 504
    :goto_6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;->makeExtensionsImmutable()V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    nop

    .line 509
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_b
        0x10 -> :sswitch_a
        0x1a -> :sswitch_9
        0x22 -> :sswitch_8
        0x28 -> :sswitch_7
        0x32 -> :sswitch_6
        0x38 -> :sswitch_5
        0x42 -> :sswitch_4
        0xf8 -> :sswitch_3
        0xfa -> :sswitch_2
        0x102 -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 519
    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲世苏兰;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;",
            ")V"
        }
    .end annotation

    .line 510
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲世苏兰;)V

    const/4 v0, -0x1

    .line 511
    iput-byte v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedIsInitialized:B

    .line 512
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedSerializedSize:I

    .line 513
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 514
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲世苏兰;L飘花落叶言世楪兰子苏哲/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 509
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲世苏兰;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 515
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;-><init>()V

    const/4 p1, -0x1

    .line 516
    iput-byte p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedIsInitialized:B

    .line 517
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedSerializedSize:I

    .line 518
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    return-void
.end method

.method public static synthetic access$21102(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->flags_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$21202(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->name_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$21300(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$21302(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$21402(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$21502(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingTypeId_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$21602(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$21702(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedTypeId_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$21800(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$21802(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$21900(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$21902(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$22000(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$22002(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$22102(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$22200(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public static getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->defaultInstance:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;

    .line 2
    .line 3
    return-object v0
.end method

.method private initFields()V
    .locals 3

    .line 1
    const/4 v0, 0x6

    .line 2
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->flags_:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->name_:I

    .line 6
    .line 7
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    iput-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iput-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 16
    .line 17
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingTypeId_:I

    .line 18
    .line 19
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iput-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 24
    .line 25
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedTypeId_:I

    .line 26
    .line 27
    iput-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 28
    .line 29
    iput-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 30
    .line 31
    iput-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 32
    .line 33
    return-void
.end method

.method public static newBuilder()L飘花落叶言世楪兰子苏哲/飘花落叶言子楪哲世苏兰;
    .locals 1

    .line 9
    invoke-static {}, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏()L飘花落叶言世楪兰子苏哲/飘花落叶言子楪哲世苏兰;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;)L飘花落叶言世楪兰子苏哲/飘花落叶言子楪哲世苏兰;
    .locals 1

    .line 1
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->newBuilder()L飘花落叶言世楪兰子苏哲/飘花落叶言子楪哲世苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, L飘花落叶言世楪兰子苏哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;

    .line 10
    .line 11
    return-object p0
.end method


# virtual methods
.method public getAnnotation(I)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;

    .line 8
    .line 9
    return-object p0
.end method

.method public getAnnotationCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

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

.method public getAnnotationList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCompilerPluginData(I)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;

    .line 8
    .line 9
    return-object p0
.end method

.method public getCompilerPluginDataCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

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

.method public getDefaultInstanceForType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;
    .locals 0

    .line 6
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->defaultInstance:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getDefaultInstanceForType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getExpandedType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public getExpandedTypeId()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedTypeId_:I

    .line 2
    .line 3
    return p0
.end method

.method public getFlags()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->flags_:I

    .line 2
    .line 3
    return p0
.end method

.method public getName()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->name_:I

    .line 2
    .line 3
    return p0
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
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSerializedSize()I
    .locals 7

    .line 1
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedSerializedSize:I

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
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

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
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->flags_:I

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
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    and-int/2addr v1, v3

    .line 26
    if-ne v1, v3, :cond_2

    .line 27
    .line 28
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->name_:I

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
    move v1, v2

    .line 36
    :goto_1
    iget-object v4, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-ge v1, v4, :cond_3

    .line 43
    .line 44
    iget-object v4, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 51
    .line 52
    const/4 v5, 0x3

    .line 53
    invoke-static {v5, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    add-int/2addr v0, v4

    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 62
    .line 63
    const/4 v4, 0x4

    .line 64
    and-int/2addr v1, v4

    .line 65
    if-ne v1, v4, :cond_4

    .line 66
    .line 67
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 68
    .line 69
    invoke-static {v4, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    add-int/2addr v0, v1

    .line 74
    :cond_4
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 75
    .line 76
    const/16 v4, 0x8

    .line 77
    .line 78
    and-int/2addr v1, v4

    .line 79
    if-ne v1, v4, :cond_5

    .line 80
    .line 81
    const/4 v1, 0x5

    .line 82
    iget v5, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingTypeId_:I

    .line 83
    .line 84
    invoke-static {v1, v5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    add-int/2addr v0, v1

    .line 89
    :cond_5
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 90
    .line 91
    const/16 v5, 0x10

    .line 92
    .line 93
    and-int/2addr v1, v5

    .line 94
    if-ne v1, v5, :cond_6

    .line 95
    .line 96
    const/4 v1, 0x6

    .line 97
    iget-object v5, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 98
    .line 99
    invoke-static {v1, v5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    add-int/2addr v0, v1

    .line 104
    :cond_6
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 105
    .line 106
    const/16 v5, 0x20

    .line 107
    .line 108
    and-int/2addr v1, v5

    .line 109
    if-ne v1, v5, :cond_7

    .line 110
    .line 111
    const/4 v1, 0x7

    .line 112
    iget v6, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedTypeId_:I

    .line 113
    .line 114
    invoke-static {v1, v6}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    add-int/2addr v0, v1

    .line 119
    :cond_7
    move v1, v2

    .line 120
    :goto_2
    iget-object v6, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-ge v1, v6, :cond_8

    .line 127
    .line 128
    iget-object v6, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    check-cast v6, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 135
    .line 136
    invoke-static {v4, v6}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    add-int/2addr v0, v6

    .line 141
    add-int/lit8 v1, v1, 0x1

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_8
    move v1, v2

    .line 145
    move v4, v1

    .line 146
    :goto_3
    iget-object v6, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 147
    .line 148
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-ge v1, v6, :cond_9

    .line 153
    .line 154
    iget-object v6, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    check-cast v6, Ljava/lang/Integer;

    .line 161
    .line 162
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    invoke-static {v6}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)I

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    add-int/2addr v4, v6

    .line 171
    add-int/lit8 v1, v1, 0x1

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_9
    add-int/2addr v0, v4

    .line 175
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getVersionRequirementList()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    mul-int/2addr v1, v3

    .line 184
    add-int/2addr v1, v0

    .line 185
    :goto_4
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-ge v2, v0, :cond_a

    .line 192
    .line 193
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 200
    .line 201
    invoke-static {v5, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    add-int/2addr v1, v0

    .line 206
    add-int/lit8 v2, v2, 0x1

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_a
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;->extensionsSerializedSize()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    add-int/2addr v0, v1

    .line 214
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 215
    .line 216
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->size()I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    add-int/2addr v1, v0

    .line 221
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedSerializedSize:I

    .line 222
    .line 223
    return v1
.end method

.method public getTypeParameter(I)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;

    .line 8
    .line 9
    return-object p0
.end method

.method public getTypeParameterCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

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

.method public getTypeParameterList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUnderlyingType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUnderlyingTypeId()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingTypeId_:I

    .line 2
    .line 3
    return p0
.end method

.method public getVersionRequirementList()Ljava/util/List;
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
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public hasExpandedType()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 2
    .line 3
    const/16 v0, 0x10

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

.method public hasExpandedTypeId()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 2
    .line 3
    const/16 v0, 0x20

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

.method public hasFlags()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

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

.method public hasName()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

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

.method public hasUnderlyingType()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

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

.method public hasUnderlyingTypeId()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

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

.method public final isInitialized()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedIsInitialized:B

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
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->hasName()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedIsInitialized:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    move v0, v2

    .line 21
    :goto_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getTypeParameterCount()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-ge v0, v3, :cond_4

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getTypeParameter(I)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;->isInitialized()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    iput-byte v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedIsInitialized:B

    .line 38
    .line 39
    return v2

    .line 40
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->hasUnderlyingType()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_5

    .line 48
    .line 49
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getUnderlyingType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->isInitialized()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    iput-byte v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedIsInitialized:B

    .line 60
    .line 61
    return v2

    .line 62
    :cond_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->hasExpandedType()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getExpandedType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->isInitialized()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_6

    .line 77
    .line 78
    iput-byte v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedIsInitialized:B

    .line 79
    .line 80
    return v2

    .line 81
    :cond_6
    move v0, v2

    .line 82
    :goto_1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getAnnotationCount()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-ge v0, v3, :cond_8

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getAnnotation(I)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;->isInitialized()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-nez v3, :cond_7

    .line 97
    .line 98
    iput-byte v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedIsInitialized:B

    .line 99
    .line 100
    return v2

    .line 101
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_8
    move v0, v2

    .line 105
    :goto_2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getCompilerPluginDataCount()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-ge v0, v3, :cond_a

    .line 110
    .line 111
    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getCompilerPluginData(I)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$CompilerPluginData;->isInitialized()Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-nez v3, :cond_9

    .line 120
    .line 121
    iput-byte v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedIsInitialized:B

    .line 122
    .line 123
    return v2

    .line 124
    :cond_9
    add-int/lit8 v0, v0, 0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_a
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;->extensionsAreInitialized()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_b

    .line 132
    .line 133
    iput-byte v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedIsInitialized:B

    .line 134
    .line 135
    return v2

    .line 136
    :cond_b
    iput-byte v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->memoizedIsInitialized:B

    .line 137
    .line 138
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->newBuilderForType()L飘花落叶言世楪兰子苏哲/飘花落叶言子楪哲世苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public newBuilderForType()L飘花落叶言世楪兰子苏哲/飘花落叶言子楪哲世苏兰;
    .locals 0

    .line 6
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->newBuilder()L飘花落叶言世楪兰子苏哲/飘花落叶言子楪哲世苏兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic toBuilder()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->toBuilder()L飘花落叶言世楪兰子苏哲/飘花落叶言子楪哲世苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toBuilder()L飘花落叶言世楪兰子苏哲/飘花落叶言子楪哲世苏兰;
    .locals 0

    .line 6
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->newBuilder(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;)L飘花落叶言世楪兰子苏哲/飘花落叶言子楪哲世苏兰;

    move-result-object p0

    return-object p0
.end method

.method public writeTo(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getSerializedSize()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;->newExtensionWriter()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲世兰苏;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    and-int/2addr v1, v2

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->flags_:I

    .line 15
    .line 16
    invoke-virtual {p1, v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    and-int/2addr v1, v2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->name_:I

    .line 26
    .line 27
    invoke-virtual {p1, v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 28
    .line 29
    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    move v2, v1

    .line 32
    :goto_0
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-ge v2, v3, :cond_2

    .line 39
    .line 40
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->typeParameter_:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 47
    .line 48
    const/4 v4, 0x3

    .line 49
    invoke-virtual {p1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 56
    .line 57
    const/4 v3, 0x4

    .line 58
    and-int/2addr v2, v3

    .line 59
    if-ne v2, v3, :cond_3

    .line 60
    .line 61
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 62
    .line 63
    invoke-virtual {p1, v3, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 67
    .line 68
    const/16 v3, 0x8

    .line 69
    .line 70
    and-int/2addr v2, v3

    .line 71
    if-ne v2, v3, :cond_4

    .line 72
    .line 73
    const/4 v2, 0x5

    .line 74
    iget v4, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->underlyingTypeId_:I

    .line 75
    .line 76
    invoke-virtual {p1, v2, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 77
    .line 78
    .line 79
    :cond_4
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 80
    .line 81
    const/16 v4, 0x10

    .line 82
    .line 83
    and-int/2addr v2, v4

    .line 84
    if-ne v2, v4, :cond_5

    .line 85
    .line 86
    const/4 v2, 0x6

    .line 87
    iget-object v4, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 88
    .line 89
    invoke-virtual {p1, v2, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 90
    .line 91
    .line 92
    :cond_5
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->bitField0_:I

    .line 93
    .line 94
    const/16 v4, 0x20

    .line 95
    .line 96
    and-int/2addr v2, v4

    .line 97
    if-ne v2, v4, :cond_6

    .line 98
    .line 99
    const/4 v2, 0x7

    .line 100
    iget v5, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->expandedTypeId_:I

    .line 101
    .line 102
    invoke-virtual {p1, v2, v5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 103
    .line 104
    .line 105
    :cond_6
    move v2, v1

    .line 106
    :goto_1
    iget-object v5, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-ge v2, v5, :cond_7

    .line 113
    .line 114
    iget-object v5, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->annotation_:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    check-cast v5, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 121
    .line 122
    invoke-virtual {p1, v3, v5}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 123
    .line 124
    .line 125
    add-int/lit8 v2, v2, 0x1

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_7
    move v2, v1

    .line 129
    :goto_2
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-ge v2, v3, :cond_8

    .line 136
    .line 137
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->versionRequirement_:Ljava/util/List;

    .line 138
    .line 139
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    check-cast v3, Ljava/lang/Integer;

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    const/16 v5, 0x1f

    .line 150
    .line 151
    invoke-virtual {p1, v5, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 152
    .line 153
    .line 154
    add-int/lit8 v2, v2, 0x1

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_8
    :goto_3
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 158
    .line 159
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-ge v1, v2, :cond_9

    .line 164
    .line 165
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->compilerPluginData_:Ljava/util/List;

    .line 166
    .line 167
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 172
    .line 173
    invoke-virtual {p1, v4, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 174
    .line 175
    .line 176
    add-int/lit8 v1, v1, 0x1

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_9
    const/16 v1, 0xc8

    .line 180
    .line 181
    invoke-virtual {v0, v1, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;)V

    .line 182
    .line 183
    .line 184
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 185
    .line 186
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;)V

    .line 187
    .line 188
    .line 189
    return-void
.end method
