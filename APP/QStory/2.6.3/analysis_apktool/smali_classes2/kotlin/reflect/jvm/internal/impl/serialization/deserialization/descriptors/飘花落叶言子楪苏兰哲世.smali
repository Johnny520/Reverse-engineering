.class public final Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v0, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v2, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;

    .line 21
    .line 22
    iget-object v2, v2, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 23
    .line 24
    iget-object v0, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, [B

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_0
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v2, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;

    .line 42
    .line 43
    iget-object v0, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;

    .line 44
    .line 45
    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->parseDelimitedFrom(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪苏世兰哲;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    if-nez v11, :cond_1

    .line 50
    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_1
    iget-object v0, v2, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪兰苏哲世;

    .line 54
    .line 55
    iget-object v1, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 56
    .line 57
    iget-object v2, v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏世哲兰;

    .line 58
    .line 59
    iget-object v13, v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏哲兰世;

    .line 60
    .line 61
    invoke-virtual {v11}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getAnnotationList()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v5, Ljava/util/ArrayList;

    .line 69
    .line 70
    const/16 v6, 0xa

    .line 71
    .line 72
    invoke-static {v3, v6}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_2

    .line 88
    .line 89
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;

    .line 94
    .line 95
    iget-object v7, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪世兰苏哲;

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7, v6, v2}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏世哲兰;)L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_3

    .line 113
    .line 114
    sget-object v0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世兰哲苏;

    .line 115
    .line 116
    :goto_1
    move-object v8, v0

    .line 117
    goto :goto_2

    .line 118
    :cond_3
    new-instance v0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;

    .line 119
    .line 120
    invoke-direct {v0, v4, v5}, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;-><init>(ILjava/util/List;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :goto_2
    sget-object v0, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言世楪哲兰子苏/飘花落叶言子楪世哲苏兰;

    .line 125
    .line 126
    invoke-virtual {v11}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getFlags()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-virtual {v0, v3}, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Visibility;

    .line 135
    .line 136
    if-nez v0, :cond_4

    .line 137
    .line 138
    const/4 v0, -0x1

    .line 139
    goto :goto_3

    .line 140
    :cond_4
    sget-object v3, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:[I

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    aget v0, v3, v0

    .line 147
    .line 148
    :goto_3
    packed-switch v0, :pswitch_data_1

    .line 149
    .line 150
    .line 151
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世苏兰;

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    :goto_4
    move-object v10, v0

    .line 157
    goto :goto_5

    .line 158
    :pswitch_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世苏兰;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :pswitch_1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世苏兰;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    goto :goto_4

    .line 170
    :pswitch_2
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世苏兰;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :pswitch_3
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世苏兰;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :pswitch_4
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世苏兰;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :pswitch_5
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世苏兰;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :goto_5
    new-instance v5, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪兰世苏哲;

    .line 195
    .line 196
    iget-object v0, v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;

    .line 197
    .line 198
    iget-object v6, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;

    .line 199
    .line 200
    iget-object v7, v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪苏哲世兰;

    .line 201
    .line 202
    invoke-virtual {v11}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getName()I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    invoke-static {v2, v0}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世(L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏世哲兰;I)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    iget-object v12, v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏世哲兰;

    .line 211
    .line 212
    iget-object v14, v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲苏世兰;

    .line 213
    .line 214
    iget-object v15, v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪苏哲兰世;

    .line 215
    .line 216
    invoke-direct/range {v5 .. v15}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪兰世苏哲;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪苏哲世兰;L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世兰哲;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世苏兰;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏世哲兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏哲兰世;L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲苏世兰;Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪苏哲兰世;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v11}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getTypeParameterList()Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-static {v1, v5, v0}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;L飘花落叶言世楪子苏兰哲/飘花落叶言子楪哲世兰苏;Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    iget-object v0, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子世苏楪兰哲;

    .line 231
    .line 232
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏兰哲()Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-static {v11, v13}, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏哲兰世;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-virtual {v0, v2, v4}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;Z)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-static {v11, v13}, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏哲兰世;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    invoke-virtual {v0, v3, v4}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;Z)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v5, v1, v2, v0}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪兰世苏哲;->飘花落叶言子哲苏世楪兰(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;)V

    .line 253
    .line 254
    .line 255
    move-object v3, v5

    .line 256
    :goto_6
    return-object v3

    .line 257
    :pswitch_6
    move-object/from16 v1, p1

    .line 258
    .line 259
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    iget-object v3, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashMap;

    .line 265
    .line 266
    sget-object v5, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 267
    .line 268
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    iget-object v0, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;

    .line 272
    .line 273
    invoke-virtual {v3, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    check-cast v3, [B

    .line 278
    .line 279
    if-eqz v3, :cond_5

    .line 280
    .line 281
    new-instance v6, Ljava/io/ByteArrayInputStream;

    .line 282
    .line 283
    invoke-direct {v6, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 284
    .line 285
    .line 286
    new-instance v3, Lkotlin/reflect/jvm/internal/飘花落叶言子苏兰世哲楪;

    .line 287
    .line 288
    invoke-direct {v3, v5, v6, v0, v2}, Lkotlin/reflect/jvm/internal/飘花落叶言子苏兰世哲楪;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 289
    .line 290
    .line 291
    invoke-static {v3}, Lkotlin/sequences/飘花落叶言子楪哲世苏兰;->飘花落叶言子哲楪世苏兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-static {v2}, Lkotlin/sequences/飘花落叶言子楪哲世苏兰;->飘花落叶言子哲楪兰世苏(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    if-eqz v2, :cond_5

    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_5
    sget-object v2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 303
    .line 304
    :goto_7
    new-instance v3, Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 311
    .line 312
    .line 313
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-eqz v5, :cond_6

    .line 322
    .line 323
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    check-cast v5, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;

    .line 328
    .line 329
    iget-object v6, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 330
    .line 331
    iget-object v6, v6, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪兰苏哲世;

    .line 332
    .line 333
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v6, v5, v4}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;Z)Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲兰世苏;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_6
    invoke-virtual {v0, v3, v1}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏兰世哲(Ljava/util/ArrayList;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;)V

    .line 345
    .line 346
    .line 347
    invoke-static {v3}, L飘花落叶言世苏楪兰子哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏(Ljava/util/ArrayList;)Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    return-object v0

    .line 352
    :pswitch_7
    move-object/from16 v1, p1

    .line 353
    .line 354
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 355
    .line 356
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    iget-object v4, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 360
    .line 361
    sget-object v5, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;->PARSER:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪哲苏兰;

    .line 362
    .line 363
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    iget-object v0, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;

    .line 367
    .line 368
    invoke-virtual {v4, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    check-cast v4, [B

    .line 373
    .line 374
    if-eqz v4, :cond_7

    .line 375
    .line 376
    new-instance v6, Ljava/io/ByteArrayInputStream;

    .line 377
    .line 378
    invoke-direct {v6, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 379
    .line 380
    .line 381
    new-instance v4, Lkotlin/reflect/jvm/internal/飘花落叶言子苏兰世哲楪;

    .line 382
    .line 383
    invoke-direct {v4, v5, v6, v0, v2}, Lkotlin/reflect/jvm/internal/飘花落叶言子苏兰世哲楪;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 384
    .line 385
    .line 386
    invoke-static {v4}, Lkotlin/sequences/飘花落叶言子楪哲世苏兰;->飘花落叶言子哲楪世苏兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-static {v2}, Lkotlin/sequences/飘花落叶言子楪哲世苏兰;->飘花落叶言子哲楪兰世苏(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    if-eqz v2, :cond_7

    .line 395
    .line 396
    goto :goto_9

    .line 397
    :cond_7
    sget-object v2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 398
    .line 399
    :goto_9
    new-instance v4, Ljava/util/ArrayList;

    .line 400
    .line 401
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 402
    .line 403
    .line 404
    move-result v5

    .line 405
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 406
    .line 407
    .line 408
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    :cond_8
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 413
    .line 414
    .line 415
    move-result v5

    .line 416
    if-eqz v5, :cond_a

    .line 417
    .line 418
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v5

    .line 422
    check-cast v5, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;

    .line 423
    .line 424
    iget-object v6, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 425
    .line 426
    iget-object v6, v6, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪兰苏哲世;

    .line 427
    .line 428
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v6, v5}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;)Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲兰苏世;

    .line 432
    .line 433
    .line 434
    move-result-object v5

    .line 435
    invoke-virtual {v0, v5}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲兰苏世;)Z

    .line 436
    .line 437
    .line 438
    move-result v6

    .line 439
    if-eqz v6, :cond_9

    .line 440
    .line 441
    goto :goto_b

    .line 442
    :cond_9
    move-object v5, v3

    .line 443
    :goto_b
    if-eqz v5, :cond_8

    .line 444
    .line 445
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    goto :goto_a

    .line 449
    :cond_a
    invoke-virtual {v0, v4, v1}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲兰世(Ljava/util/ArrayList;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;)V

    .line 450
    .line 451
    .line 452
    invoke-static {v4}, L飘花落叶言世苏楪兰子哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏(Ljava/util/ArrayList;)Ljava/util/List;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    return-object v0

    .line 457
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
