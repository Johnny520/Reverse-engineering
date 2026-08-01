.class public final Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final synthetic 飘花落叶言子楪苏哲兰世:[Lkotlin/reflect/飘花落叶言子世楪苏哲兰;


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏哲兰世;

.field public final 飘花落叶言子楪世兰苏哲:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪世兰苏哲;

.field public final 飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪世兰苏哲;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪苏世兰哲:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏哲世兰;

.field public final 飘花落叶言子楪苏世哲兰:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏哲世兰;

.field public final synthetic 飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 2
    .line 3
    const-class v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;

    .line 4
    .line 5
    const-string v2, "functionNames"

    .line 6
    .line 7
    const-string v3, "getFunctionNames()Ljava/util/Set;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 14
    .line 15
    const-string v3, "variableNames"

    .line 16
    .line 17
    const-string v5, "getVariableNames()Ljava/util/Set;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [Lkotlin/reflect/飘花落叶言子世楪苏哲兰;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲兰世:[Lkotlin/reflect/飘花落叶言子世楪苏哲兰;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;

    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v2, v1

    .line 26
    check-cast v2, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 27
    .line 28
    iget-object v3, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 29
    .line 30
    iget-object v3, v3, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏世哲兰;

    .line 31
    .line 32
    check-cast v2, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;

    .line 33
    .line 34
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;->getName()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-static {v3, v2}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世(L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏世哲兰;I)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    new-instance v3, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_0
    check-cast v3, Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(Ljava/util/LinkedHashMap;)Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;

    .line 69
    .line 70
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 71
    .line 72
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    move-object v1, v0

    .line 90
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 91
    .line 92
    iget-object v2, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 93
    .line 94
    iget-object v2, v2, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏世哲兰;

    .line 95
    .line 96
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;

    .line 97
    .line 98
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;->getName()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-static {v2, v1}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世(L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏世哲兰;I)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {p2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-nez v2, :cond_2

    .line 111
    .line 112
    new-instance v2, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-interface {p2, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    :cond_2
    check-cast v2, Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    invoke-static {p2}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(Ljava/util/LinkedHashMap;)Ljava/util/LinkedHashMap;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashMap;

    .line 131
    .line 132
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;

    .line 133
    .line 134
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 135
    .line 136
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;

    .line 137
    .line 138
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世苏兰;

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;

    .line 144
    .line 145
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 146
    .line 147
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result p4

    .line 158
    if-eqz p4, :cond_5

    .line 159
    .line 160
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p4

    .line 164
    move-object v0, p4

    .line 165
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子世楪苏哲兰;

    .line 166
    .line 167
    iget-object v1, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 168
    .line 169
    iget-object v1, v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏世哲兰;

    .line 170
    .line 171
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;

    .line 172
    .line 173
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeAlias;->getName()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-static {v1, v0}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世(L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏世哲兰;I)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {p2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    if-nez v1, :cond_4

    .line 186
    .line 187
    new-instance v1, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    :cond_4
    check-cast v1, Ljava/util/List;

    .line 196
    .line 197
    invoke-interface {v1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_5
    invoke-static {p2}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(Ljava/util/LinkedHashMap;)Ljava/util/LinkedHashMap;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:Ljava/util/LinkedHashMap;

    .line 206
    .line 207
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;

    .line 208
    .line 209
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 210
    .line 211
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;

    .line 212
    .line 213
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;

    .line 214
    .line 215
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪苏兰哲世;

    .line 216
    .line 217
    const/4 p3, 0x0

    .line 218
    invoke-direct {p2, p0, p3}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪苏兰哲世;-><init>(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, p2}, Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪世兰苏哲;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪世兰苏哲;

    .line 226
    .line 227
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;

    .line 228
    .line 229
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 230
    .line 231
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;

    .line 232
    .line 233
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;

    .line 234
    .line 235
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪苏兰哲世;

    .line 236
    .line 237
    const/4 p4, 0x1

    .line 238
    invoke-direct {p2, p0, p4}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪苏兰哲世;-><init>(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, p2}, Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪世兰苏哲;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪世兰苏哲;

    .line 246
    .line 247
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;

    .line 248
    .line 249
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 250
    .line 251
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;

    .line 252
    .line 253
    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;

    .line 254
    .line 255
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪苏兰哲世;

    .line 256
    .line 257
    const/4 v0, 0x2

    .line 258
    invoke-direct {p2, p0, v0}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪苏兰哲世;-><init>(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1, p2}, Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏哲兰世;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏哲兰世;

    .line 266
    .line 267
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;

    .line 268
    .line 269
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 270
    .line 271
    iget-object p2, p2, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;

    .line 272
    .line 273
    iget-object p2, p2, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;

    .line 274
    .line 275
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世苏兰;

    .line 276
    .line 277
    invoke-direct {v0, p0, p1, p3}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世苏兰;-><init>(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏哲世兰;

    .line 284
    .line 285
    invoke-direct {p1, p2, v0}, Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏世兰哲;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 286
    .line 287
    .line 288
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏哲世兰;

    .line 289
    .line 290
    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;

    .line 291
    .line 292
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 293
    .line 294
    iget-object p2, p2, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;

    .line 295
    .line 296
    iget-object p2, p2, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;

    .line 297
    .line 298
    new-instance p3, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世苏兰;

    .line 299
    .line 300
    invoke-direct {p3, p0, p1, p4}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世苏兰;-><init>(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲苏世兰;I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏哲世兰;

    .line 307
    .line 308
    invoke-direct {p1, p2, p3}, Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏世兰哲;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 309
    .line 310
    .line 311
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏哲世兰;

    .line 312
    .line 313
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/util/LinkedHashMap;)Ljava/util/LinkedHashMap;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子苏兰世哲楪(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/lang/Iterable;

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/util/Map$Entry;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/Iterable;

    .line 50
    .line 51
    new-instance v4, Ljava/util/ArrayList;

    .line 52
    .line 53
    const/16 v5, 0xa

    .line 54
    .line 55
    invoke-static {v1, v5}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_0

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世苏哲兰;

    .line 77
    .line 78
    invoke-virtual {v5, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪世苏哲兰;->writeDelimitedTo(Ljava/io/OutputStream;)V

    .line 79
    .line 80
    .line 81
    sget-object v5, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 82
    .line 83
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_0
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    return-object v0
.end method
