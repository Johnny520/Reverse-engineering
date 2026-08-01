.class public final Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage<",
        "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;",
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

.field private static final defaultInstance:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;


# instance fields
.field private abbreviatedTypeId_:I

.field private abbreviatedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

.field private annotation_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;",
            ">;"
        }
    .end annotation
.end field

.field private argument_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;",
            ">;"
        }
    .end annotation
.end field

.field private bitField0_:I

.field private className_:I

.field private flags_:I

.field private flexibleTypeCapabilitiesId_:I

.field private flexibleUpperBoundId_:I

.field private flexibleUpperBound_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

.field private memoizedIsInitialized:B

.field private memoizedSerializedSize:I

.field private nullable_:Z

.field private outerTypeId_:I

.field private outerType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

.field private typeAliasName_:I

.field private typeParameterName_:I

.field private typeParameter_:I

.field private final unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言世楪哲兰苏子/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, L飘花落叶言世楪哲兰苏子/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 9
    .line 10
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->defaultInstance:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 17
    .line 18
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->initFields()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput-byte v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedIsInitialized:B

    .line 6
    .line 7
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedSerializedSize:I

    .line 8
    .line 9
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->initFields()V

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
    move v5, v4

    .line 25
    :cond_0
    :goto_0
    const/16 v6, 0x4000

    .line 26
    .line 27
    if-nez v4, :cond_c

    .line 28
    .line 29
    :try_start_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    const/4 v8, 0x0

    .line 34
    sparse-switch v7, :sswitch_data_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1, v2, p2, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;->parseUnknownField(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;I)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-nez v6, :cond_0

    .line 42
    .line 43
    :sswitch_0
    move v4, v1

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :catch_0
    move-exception p1

    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :catch_1
    move-exception p1

    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :sswitch_1
    and-int/lit16 v7, v5, 0x4000

    .line 55
    .line 56
    if-eq v7, v6, :cond_1

    .line 57
    .line 58
    new-instance v7, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 64
    .line 65
    or-int/lit16 v5, v5, 0x4000

    .line 66
    .line 67
    :cond_1
    iget-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 68
    .line 69
    sget-object v8, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 70
    .line 71
    invoke-virtual {p1, v8, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :sswitch_2
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 80
    .line 81
    or-int/lit16 v7, v7, 0x800

    .line 82
    .line 83
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 84
    .line 85
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedTypeId_:I

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :sswitch_3
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 93
    .line 94
    const/16 v9, 0x400

    .line 95
    .line 96
    and-int/2addr v7, v9

    .line 97
    if-ne v7, v9, :cond_2

    .line 98
    .line 99
    iget-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 100
    .line 101
    invoke-virtual {v7}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->toBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    :cond_2
    sget-object v7, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 106
    .line 107
    invoke-virtual {p1, v7, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    check-cast v7, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 112
    .line 113
    iput-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 114
    .line 115
    if-eqz v8, :cond_3

    .line 116
    .line 117
    invoke-virtual {v8, v7}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v8}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    iput-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 125
    .line 126
    :cond_3
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 127
    .line 128
    or-int/2addr v7, v9

    .line 129
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :sswitch_4
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 133
    .line 134
    or-int/lit16 v7, v7, 0x80

    .line 135
    .line 136
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 137
    .line 138
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeAliasName_:I

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :sswitch_5
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 146
    .line 147
    or-int/lit16 v7, v7, 0x200

    .line 148
    .line 149
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 150
    .line 151
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerTypeId_:I

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :sswitch_6
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 160
    .line 161
    const/16 v9, 0x100

    .line 162
    .line 163
    and-int/2addr v7, v9

    .line 164
    if-ne v7, v9, :cond_4

    .line 165
    .line 166
    iget-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 167
    .line 168
    invoke-virtual {v7}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->toBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    :cond_4
    sget-object v7, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 173
    .line 174
    invoke-virtual {p1, v7, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    check-cast v7, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 179
    .line 180
    iput-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 181
    .line 182
    if-eqz v8, :cond_5

    .line 183
    .line 184
    invoke-virtual {v8, v7}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v8}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    iput-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 192
    .line 193
    :cond_5
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 194
    .line 195
    or-int/2addr v7, v9

    .line 196
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :sswitch_7
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 201
    .line 202
    or-int/lit8 v7, v7, 0x40

    .line 203
    .line 204
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 205
    .line 206
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeParameterName_:I

    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :sswitch_8
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 215
    .line 216
    or-int/lit8 v7, v7, 0x8

    .line 217
    .line 218
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 219
    .line 220
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBoundId_:I

    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :sswitch_9
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 229
    .line 230
    or-int/lit8 v7, v7, 0x20

    .line 231
    .line 232
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 233
    .line 234
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeParameter_:I

    .line 239
    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :sswitch_a
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 243
    .line 244
    or-int/lit8 v7, v7, 0x10

    .line 245
    .line 246
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 247
    .line 248
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->className_:I

    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :sswitch_b
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 257
    .line 258
    const/4 v9, 0x4

    .line 259
    and-int/2addr v7, v9

    .line 260
    if-ne v7, v9, :cond_6

    .line 261
    .line 262
    iget-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBound_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 263
    .line 264
    invoke-virtual {v7}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->toBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    :cond_6
    sget-object v7, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 269
    .line 270
    invoke-virtual {p1, v7, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    check-cast v7, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 275
    .line 276
    iput-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBound_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 277
    .line 278
    if-eqz v8, :cond_7

    .line 279
    .line 280
    invoke-virtual {v8, v7}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v8}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    iput-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBound_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 288
    .line 289
    :cond_7
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 290
    .line 291
    or-int/2addr v7, v9

    .line 292
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_c
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 297
    .line 298
    or-int/lit8 v7, v7, 0x2

    .line 299
    .line 300
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 301
    .line 302
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 303
    .line 304
    .line 305
    move-result v7

    .line 306
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleTypeCapabilitiesId_:I

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_d
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 311
    .line 312
    or-int/2addr v7, v1

    .line 313
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 314
    .line 315
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲()J

    .line 316
    .line 317
    .line 318
    move-result-wide v7

    .line 319
    const-wide/16 v9, 0x0

    .line 320
    .line 321
    cmp-long v7, v7, v9

    .line 322
    .line 323
    if-eqz v7, :cond_8

    .line 324
    .line 325
    move v7, v1

    .line 326
    goto :goto_1

    .line 327
    :cond_8
    move v7, v3

    .line 328
    :goto_1
    iput-boolean v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->nullable_:Z

    .line 329
    .line 330
    goto/16 :goto_0

    .line 331
    .line 332
    :sswitch_e
    and-int/lit8 v7, v5, 0x1

    .line 333
    .line 334
    if-eq v7, v1, :cond_9

    .line 335
    .line 336
    new-instance v7, Ljava/util/ArrayList;

    .line 337
    .line 338
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 339
    .line 340
    .line 341
    iput-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 342
    .line 343
    or-int/lit8 v5, v5, 0x1

    .line 344
    .line 345
    :cond_9
    iget-object v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 346
    .line 347
    sget-object v8, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 348
    .line 349
    invoke-virtual {p1, v8, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    goto/16 :goto_0

    .line 357
    .line 358
    :sswitch_f
    iget v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 359
    .line 360
    or-int/lit16 v7, v7, 0x1000

    .line 361
    .line 362
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 363
    .line 364
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()I

    .line 365
    .line 366
    .line 367
    move-result v7

    .line 368
    iput v7, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flags_:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 369
    .line 370
    goto/16 :goto_0

    .line 371
    .line 372
    :goto_2
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 373
    .line 374
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {p2, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    throw p1

    .line 386
    :goto_3
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 391
    :goto_4
    and-int/lit8 p2, v5, 0x1

    .line 392
    .line 393
    if-ne p2, v1, :cond_a

    .line 394
    .line 395
    iget-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 396
    .line 397
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 398
    .line 399
    .line 400
    move-result-object p2

    .line 401
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 402
    .line 403
    :cond_a
    and-int/lit16 p2, v5, 0x4000

    .line 404
    .line 405
    if-ne p2, v6, :cond_b

    .line 406
    .line 407
    iget-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 408
    .line 409
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 410
    .line 411
    .line 412
    move-result-object p2

    .line 413
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 414
    .line 415
    :cond_b
    :try_start_2
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 416
    .line 417
    .line 418
    :catch_2
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 419
    .line 420
    .line 421
    move-result-object p2

    .line 422
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 423
    .line 424
    goto :goto_5

    .line 425
    :catchall_1
    move-exception p1

    .line 426
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 427
    .line 428
    .line 429
    move-result-object p2

    .line 430
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 431
    .line 432
    throw p1

    .line 433
    :goto_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;->makeExtensionsImmutable()V

    .line 434
    .line 435
    .line 436
    throw p1

    .line 437
    :cond_c
    and-int/lit8 p1, v5, 0x1

    .line 438
    .line 439
    if-ne p1, v1, :cond_d

    .line 440
    .line 441
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 442
    .line 443
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 448
    .line 449
    :cond_d
    and-int/lit16 p1, v5, 0x4000

    .line 450
    .line 451
    if-ne p1, v6, :cond_e

    .line 452
    .line 453
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 454
    .line 455
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 460
    .line 461
    :cond_e
    :try_start_3
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 462
    .line 463
    .line 464
    :catch_3
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 469
    .line 470
    goto :goto_6

    .line 471
    :catchall_2
    move-exception p1

    .line 472
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 473
    .line 474
    .line 475
    move-result-object p2

    .line 476
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 477
    .line 478
    throw p1

    .line 479
    :goto_6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;->makeExtensionsImmutable()V

    .line 480
    .line 481
    .line 482
    return-void

    .line 483
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_f
        0x12 -> :sswitch_e
        0x18 -> :sswitch_d
        0x20 -> :sswitch_c
        0x2a -> :sswitch_b
        0x30 -> :sswitch_a
        0x38 -> :sswitch_9
        0x40 -> :sswitch_8
        0x48 -> :sswitch_7
        0x52 -> :sswitch_6
        0x58 -> :sswitch_5
        0x60 -> :sswitch_4
        0x6a -> :sswitch_3
        0x70 -> :sswitch_2
        0x322 -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;L飘花落叶言世楪哲苏子兰/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 493
    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)V

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

    .line 484
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲世苏兰;)V

    const/4 v0, -0x1

    .line 485
    iput-byte v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedIsInitialized:B

    .line 486
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedSerializedSize:I

    .line 487
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 488
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲世苏兰;L飘花落叶言世楪哲苏子兰/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 483
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲世苏兰;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 489
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;-><init>()V

    const/4 p1, -0x1

    .line 490
    iput-byte p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedIsInitialized:B

    .line 491
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedSerializedSize:I

    .line 492
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲世苏;

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    return-void
.end method

.method public static synthetic access$5900(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$5902(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$6002(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->nullable_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$6102(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleTypeCapabilitiesId_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$6202(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBound_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$6302(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBoundId_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$6402(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->className_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$6502(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeParameter_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$6602(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeParameterName_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$6702(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeAliasName_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$6802(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$6902(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerTypeId_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$7002(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$7102(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedTypeId_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$7202(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flags_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$7300(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$7302(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$7402(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;I)I
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$7500(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public static getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->defaultInstance:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 2
    .line 3
    return-object v0
.end method

.method private initFields()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->nullable_:Z

    .line 7
    .line 8
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleTypeCapabilitiesId_:I

    .line 9
    .line 10
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iput-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBound_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 15
    .line 16
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBoundId_:I

    .line 17
    .line 18
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->className_:I

    .line 19
    .line 20
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeParameter_:I

    .line 21
    .line 22
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeParameterName_:I

    .line 23
    .line 24
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeAliasName_:I

    .line 25
    .line 26
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iput-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 31
    .line 32
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerTypeId_:I

    .line 33
    .line 34
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iput-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 39
    .line 40
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedTypeId_:I

    .line 41
    .line 42
    iput v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flags_:I

    .line 43
    .line 44
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 45
    .line 46
    return-void
.end method

.method public static newBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;
    .locals 3

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲世苏兰;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世哲苏:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iput-object v2, v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰哲世苏:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 15
    .line 16
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪兰苏哲:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 21
    .line 22
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getDefaultInstance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iput-object v2, v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子世苏楪哲兰:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 27
    .line 28
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子世苏哲兰楪:Ljava/util/List;

    .line 29
    .line 30
    return-object v0
.end method

.method public static newBuilder(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;
    .locals 1

    .line 31
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->newBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    move-result-object v0

    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    return-object v0
.end method


# virtual methods
.method public getAbbreviatedType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public getAbbreviatedTypeId()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedTypeId_:I

    .line 2
    .line 3
    return p0
.end method

.method public getAnnotation(I)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

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
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

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
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getArgument(I)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;

    .line 8
    .line 9
    return-object p0
.end method

.method public getArgumentCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

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

.method public getArgumentList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getClassName()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->className_:I

    .line 2
    .line 3
    return p0
.end method

.method public getDefaultInstanceForType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;
    .locals 0

    .line 6
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->defaultInstance:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getDefaultInstanceForType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getFlags()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flags_:I

    .line 2
    .line 3
    return p0
.end method

.method public getFlexibleTypeCapabilitiesId()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleTypeCapabilitiesId_:I

    .line 2
    .line 3
    return p0
.end method

.method public getFlexibleUpperBound()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBound_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFlexibleUpperBoundId()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBoundId_:I

    .line 2
    .line 3
    return p0
.end method

.method public getNullable()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->nullable_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getOuterType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOuterTypeId()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerTypeId_:I

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
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSerializedSize()I
    .locals 6

    .line 1
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedSerializedSize:I

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
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 8
    .line 9
    const/16 v1, 0x1000

    .line 10
    .line 11
    and-int/2addr v0, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flags_:I

    .line 17
    .line 18
    invoke-static {v3, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v0, v2

    .line 24
    :goto_0
    move v1, v2

    .line 25
    :goto_1
    iget-object v4, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v5, 0x2

    .line 32
    if-ge v1, v4, :cond_2

    .line 33
    .line 34
    iget-object v4, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 41
    .line 42
    invoke-static {v5, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    add-int/2addr v0, v4

    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 51
    .line 52
    and-int/2addr v1, v3

    .line 53
    if-ne v1, v3, :cond_3

    .line 54
    .line 55
    const/4 v1, 0x3

    .line 56
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, v3

    .line 61
    add-int/2addr v0, v1

    .line 62
    :cond_3
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 63
    .line 64
    and-int/2addr v1, v5

    .line 65
    const/4 v3, 0x4

    .line 66
    if-ne v1, v5, :cond_4

    .line 67
    .line 68
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleTypeCapabilitiesId_:I

    .line 69
    .line 70
    invoke-static {v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    add-int/2addr v0, v1

    .line 75
    :cond_4
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 76
    .line 77
    and-int/2addr v1, v3

    .line 78
    if-ne v1, v3, :cond_5

    .line 79
    .line 80
    const/4 v1, 0x5

    .line 81
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBound_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    add-int/2addr v0, v1

    .line 88
    :cond_5
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 89
    .line 90
    const/16 v3, 0x10

    .line 91
    .line 92
    and-int/2addr v1, v3

    .line 93
    if-ne v1, v3, :cond_6

    .line 94
    .line 95
    const/4 v1, 0x6

    .line 96
    iget v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->className_:I

    .line 97
    .line 98
    invoke-static {v1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    add-int/2addr v0, v1

    .line 103
    :cond_6
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 104
    .line 105
    const/16 v3, 0x20

    .line 106
    .line 107
    and-int/2addr v1, v3

    .line 108
    if-ne v1, v3, :cond_7

    .line 109
    .line 110
    const/4 v1, 0x7

    .line 111
    iget v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeParameter_:I

    .line 112
    .line 113
    invoke-static {v1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    add-int/2addr v0, v1

    .line 118
    :cond_7
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 119
    .line 120
    const/16 v3, 0x8

    .line 121
    .line 122
    and-int/2addr v1, v3

    .line 123
    if-ne v1, v3, :cond_8

    .line 124
    .line 125
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBoundId_:I

    .line 126
    .line 127
    invoke-static {v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    add-int/2addr v0, v1

    .line 132
    :cond_8
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 133
    .line 134
    const/16 v3, 0x40

    .line 135
    .line 136
    and-int/2addr v1, v3

    .line 137
    if-ne v1, v3, :cond_9

    .line 138
    .line 139
    const/16 v1, 0x9

    .line 140
    .line 141
    iget v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeParameterName_:I

    .line 142
    .line 143
    invoke-static {v1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    add-int/2addr v0, v1

    .line 148
    :cond_9
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 149
    .line 150
    const/16 v3, 0x100

    .line 151
    .line 152
    and-int/2addr v1, v3

    .line 153
    if-ne v1, v3, :cond_a

    .line 154
    .line 155
    const/16 v1, 0xa

    .line 156
    .line 157
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 158
    .line 159
    invoke-static {v1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    add-int/2addr v0, v1

    .line 164
    :cond_a
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 165
    .line 166
    const/16 v3, 0x200

    .line 167
    .line 168
    and-int/2addr v1, v3

    .line 169
    if-ne v1, v3, :cond_b

    .line 170
    .line 171
    const/16 v1, 0xb

    .line 172
    .line 173
    iget v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerTypeId_:I

    .line 174
    .line 175
    invoke-static {v1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    add-int/2addr v0, v1

    .line 180
    :cond_b
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 181
    .line 182
    const/16 v3, 0x80

    .line 183
    .line 184
    and-int/2addr v1, v3

    .line 185
    if-ne v1, v3, :cond_c

    .line 186
    .line 187
    const/16 v1, 0xc

    .line 188
    .line 189
    iget v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeAliasName_:I

    .line 190
    .line 191
    invoke-static {v1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    add-int/2addr v0, v1

    .line 196
    :cond_c
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 197
    .line 198
    const/16 v3, 0x400

    .line 199
    .line 200
    and-int/2addr v1, v3

    .line 201
    if-ne v1, v3, :cond_d

    .line 202
    .line 203
    const/16 v1, 0xd

    .line 204
    .line 205
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 206
    .line 207
    invoke-static {v1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    add-int/2addr v0, v1

    .line 212
    :cond_d
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 213
    .line 214
    const/16 v3, 0x800

    .line 215
    .line 216
    and-int/2addr v1, v3

    .line 217
    if-ne v1, v3, :cond_e

    .line 218
    .line 219
    const/16 v1, 0xe

    .line 220
    .line 221
    iget v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedTypeId_:I

    .line 222
    .line 223
    invoke-static {v1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    add-int/2addr v0, v1

    .line 228
    :cond_e
    :goto_2
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 229
    .line 230
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-ge v2, v1, :cond_f

    .line 235
    .line 236
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 237
    .line 238
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 243
    .line 244
    const/16 v3, 0x64

    .line 245
    .line 246
    invoke-static {v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    add-int/2addr v0, v1

    .line 251
    add-int/lit8 v2, v2, 0x1

    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_f
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;->extensionsSerializedSize()I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    add-int/2addr v1, v0

    .line 259
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 260
    .line 261
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;->size()I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    add-int/2addr v0, v1

    .line 266
    iput v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedSerializedSize:I

    .line 267
    .line 268
    return v0
.end method

.method public getTypeAliasName()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeAliasName_:I

    .line 2
    .line 3
    return p0
.end method

.method public getTypeParameter()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeParameter_:I

    .line 2
    .line 3
    return p0
.end method

.method public getTypeParameterName()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeParameterName_:I

    .line 2
    .line 3
    return p0
.end method

.method public hasAbbreviatedType()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 2
    .line 3
    const/16 v0, 0x400

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

.method public hasAbbreviatedTypeId()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 2
    .line 3
    const/16 v0, 0x800

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

.method public hasClassName()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

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

.method public hasFlags()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 2
    .line 3
    const/16 v0, 0x1000

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

.method public hasFlexibleTypeCapabilitiesId()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

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

.method public hasFlexibleUpperBound()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

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

.method public hasFlexibleUpperBoundId()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

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

.method public hasNullable()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

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

.method public hasOuterType()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 2
    .line 3
    const/16 v0, 0x100

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

.method public hasOuterTypeId()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 2
    .line 3
    const/16 v0, 0x200

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

.method public hasTypeAliasName()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 2
    .line 3
    const/16 v0, 0x80

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

.method public hasTypeParameter()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

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

.method public hasTypeParameterName()Z
    .locals 1

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 2
    .line 3
    const/16 v0, 0x40

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
    iget-byte v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedIsInitialized:B

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
    move v0, v2

    .line 12
    :goto_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getArgumentCount()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v0, v3, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getArgument(I)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type$Argument;->isInitialized()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    iput-byte v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedIsInitialized:B

    .line 29
    .line 30
    return v2

    .line 31
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->hasFlexibleUpperBound()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getFlexibleUpperBound()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->isInitialized()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    iput-byte v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedIsInitialized:B

    .line 51
    .line 52
    return v2

    .line 53
    :cond_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->hasOuterType()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getOuterType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->isInitialized()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    iput-byte v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedIsInitialized:B

    .line 70
    .line 71
    return v2

    .line 72
    :cond_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->hasAbbreviatedType()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_6

    .line 77
    .line 78
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getAbbreviatedType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->isInitialized()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_6

    .line 87
    .line 88
    iput-byte v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedIsInitialized:B

    .line 89
    .line 90
    return v2

    .line 91
    :cond_6
    move v0, v2

    .line 92
    :goto_1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getAnnotationCount()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-ge v0, v3, :cond_8

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getAnnotation(I)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;->isInitialized()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v3, :cond_7

    .line 107
    .line 108
    iput-byte v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedIsInitialized:B

    .line 109
    .line 110
    return v2

    .line 111
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_8
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;->extensionsAreInitialized()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_9

    .line 119
    .line 120
    iput-byte v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedIsInitialized:B

    .line 121
    .line 122
    return v2

    .line 123
    :cond_9
    iput-byte v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->memoizedIsInitialized:B

    .line 124
    .line 125
    return v1
.end method

.method public newBuilderForType()Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;
    .locals 0

    .line 6
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->newBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newBuilderForType()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->newBuilderForType()Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;
    .locals 0

    .line 6
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->newBuilder(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic toBuilder()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪兰哲苏世;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->toBuilder()Lkotlin/reflect/jvm/internal/impl/metadata/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public writeTo(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->getSerializedSize()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$ExtendableMessage;->newExtensionWriter()Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲世兰苏;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 9
    .line 10
    const/16 v2, 0x1000

    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flags_:I

    .line 17
    .line 18
    invoke-virtual {p1, v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    move v2, v1

    .line 23
    :goto_0
    iget-object v4, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/4 v5, 0x2

    .line 30
    if-ge v2, v4, :cond_1

    .line 31
    .line 32
    iget-object v4, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->argument_:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 39
    .line 40
    invoke-virtual {p1, v5, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 47
    .line 48
    and-int/2addr v2, v3

    .line 49
    if-ne v2, v3, :cond_2

    .line 50
    .line 51
    iget-boolean v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->nullable_:Z

    .line 52
    .line 53
    const/4 v3, 0x3

    .line 54
    invoke-virtual {p1, v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世(II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(I)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 61
    .line 62
    and-int/2addr v2, v5

    .line 63
    const/4 v3, 0x4

    .line 64
    if-ne v2, v5, :cond_3

    .line 65
    .line 66
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleTypeCapabilitiesId_:I

    .line 67
    .line 68
    invoke-virtual {p1, v3, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 69
    .line 70
    .line 71
    :cond_3
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 72
    .line 73
    and-int/2addr v2, v3

    .line 74
    if-ne v2, v3, :cond_4

    .line 75
    .line 76
    const/4 v2, 0x5

    .line 77
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBound_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 78
    .line 79
    invoke-virtual {p1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 83
    .line 84
    const/16 v3, 0x10

    .line 85
    .line 86
    and-int/2addr v2, v3

    .line 87
    if-ne v2, v3, :cond_5

    .line 88
    .line 89
    const/4 v2, 0x6

    .line 90
    iget v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->className_:I

    .line 91
    .line 92
    invoke-virtual {p1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 93
    .line 94
    .line 95
    :cond_5
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 96
    .line 97
    const/16 v3, 0x20

    .line 98
    .line 99
    and-int/2addr v2, v3

    .line 100
    if-ne v2, v3, :cond_6

    .line 101
    .line 102
    const/4 v2, 0x7

    .line 103
    iget v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeParameter_:I

    .line 104
    .line 105
    invoke-virtual {p1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 106
    .line 107
    .line 108
    :cond_6
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 109
    .line 110
    const/16 v3, 0x8

    .line 111
    .line 112
    and-int/2addr v2, v3

    .line 113
    if-ne v2, v3, :cond_7

    .line 114
    .line 115
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->flexibleUpperBoundId_:I

    .line 116
    .line 117
    invoke-virtual {p1, v3, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 118
    .line 119
    .line 120
    :cond_7
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 121
    .line 122
    const/16 v3, 0x40

    .line 123
    .line 124
    and-int/2addr v2, v3

    .line 125
    if-ne v2, v3, :cond_8

    .line 126
    .line 127
    const/16 v2, 0x9

    .line 128
    .line 129
    iget v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeParameterName_:I

    .line 130
    .line 131
    invoke-virtual {p1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 132
    .line 133
    .line 134
    :cond_8
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 135
    .line 136
    const/16 v3, 0x100

    .line 137
    .line 138
    and-int/2addr v2, v3

    .line 139
    if-ne v2, v3, :cond_9

    .line 140
    .line 141
    const/16 v2, 0xa

    .line 142
    .line 143
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 144
    .line 145
    invoke-virtual {p1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 146
    .line 147
    .line 148
    :cond_9
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 149
    .line 150
    const/16 v3, 0x200

    .line 151
    .line 152
    and-int/2addr v2, v3

    .line 153
    if-ne v2, v3, :cond_a

    .line 154
    .line 155
    const/16 v2, 0xb

    .line 156
    .line 157
    iget v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->outerTypeId_:I

    .line 158
    .line 159
    invoke-virtual {p1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 160
    .line 161
    .line 162
    :cond_a
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 163
    .line 164
    const/16 v3, 0x80

    .line 165
    .line 166
    and-int/2addr v2, v3

    .line 167
    if-ne v2, v3, :cond_b

    .line 168
    .line 169
    const/16 v2, 0xc

    .line 170
    .line 171
    iget v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->typeAliasName_:I

    .line 172
    .line 173
    invoke-virtual {p1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 174
    .line 175
    .line 176
    :cond_b
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 177
    .line 178
    const/16 v3, 0x400

    .line 179
    .line 180
    and-int/2addr v2, v3

    .line 181
    if-ne v2, v3, :cond_c

    .line 182
    .line 183
    const/16 v2, 0xd

    .line 184
    .line 185
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedType_:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 186
    .line 187
    invoke-virtual {p1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 188
    .line 189
    .line 190
    :cond_c
    iget v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->bitField0_:I

    .line 191
    .line 192
    const/16 v3, 0x800

    .line 193
    .line 194
    and-int/2addr v2, v3

    .line 195
    if-ne v2, v3, :cond_d

    .line 196
    .line 197
    const/16 v2, 0xe

    .line 198
    .line 199
    iget v3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->abbreviatedTypeId_:I

    .line 200
    .line 201
    invoke-virtual {p1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(II)V

    .line 202
    .line 203
    .line 204
    :cond_d
    :goto_1
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 205
    .line 206
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-ge v1, v2, :cond_e

    .line 211
    .line 212
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->annotation_:Ljava/util/List;

    .line 213
    .line 214
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    check-cast v2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 219
    .line 220
    const/16 v3, 0x64

    .line 221
    .line 222
    invoke-virtual {p1, v3, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世兰苏(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;)V

    .line 223
    .line 224
    .line 225
    add-int/lit8 v1, v1, 0x1

    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_e
    const/16 v1, 0xc8

    .line 229
    .line 230
    invoke-virtual {v0, v1, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(ILkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;)V

    .line 231
    .line 232
    .line 233
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;->unknownFields:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;

    .line 234
    .line 235
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世(Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世哲兰苏;)V

    .line 236
    .line 237
    .line 238
    return-void
.end method
