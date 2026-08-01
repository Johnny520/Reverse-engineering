.class public final Lcom/android/dx/dex/file/ProtoIdItem;
.super Lcom/android/dx/dex/file/IndexedItem;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private parameterTypes:Lcom/android/dx/dex/file/TypeListItem;

.field private final prototype:Lcom/android/dx/rop/type/Prototype;

.field private final shortForm:Lcom/android/dx/rop/cst/CstString;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/type/Prototype;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/file/IndexedItem;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iput-object p1, p0, Lcom/android/dx/dex/file/ProtoIdItem;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/android/dx/dex/file/ProtoIdItem;->makeShortForm(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/rop/cst/CstString;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lcom/android/dx/dex/file/ProtoIdItem;->shortForm:Lcom/android/dx/rop/cst/CstString;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Lcom/android/dx/dex/file/TypeListItem;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Lcom/android/dx/dex/file/TypeListItem;-><init>(Lcom/android/dx/rop/type/TypeList;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iput-object v0, p0, Lcom/android/dx/dex/file/ProtoIdItem;->parameterTypes:Lcom/android/dx/dex/file/TypeListItem;

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    const-string p0, "prototype == null"

    .line 35
    .line 36
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0
.end method

.method private static makeShortForm(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/rop/cst/CstString;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    add-int/lit8 v3, v1, 0x1

    .line 12
    .line 13
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Prototype;->getReturnType()Lcom/android/dx/rop/type/Type;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lcom/android/dx/dex/file/ProtoIdItem;->shortFormCharFor(Lcom/android/dx/rop/type/Type;)C

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    :goto_0
    if-ge p0, v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Lcom/android/dx/rop/type/StdTypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3}, Lcom/android/dx/dex/file/ProtoIdItem;->shortFormCharFor(Lcom/android/dx/rop/type/Type;)C

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    add-int/lit8 p0, p0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance p0, Lcom/android/dx/rop/cst/CstString;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {p0, v0}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object p0
.end method

.method private static shortFormCharFor(Lcom/android/dx/rop/type/Type;)C
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/16 v0, 0x5b

    .line 11
    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    const/16 p0, 0x4c

    .line 15
    .line 16
    :cond_0
    return p0
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getStringIds()Lcom/android/dx/dex/file/StringIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getTypeLists()Lcom/android/dx/dex/file/MixedItemSection;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v2, p0, Lcom/android/dx/dex/file/ProtoIdItem;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/android/dx/rop/type/Prototype;->getReturnType()Lcom/android/dx/rop/type/Type;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2}, Lcom/android/dx/dex/file/TypeIdsSection;->intern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/dex/file/TypeIdItem;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/android/dx/dex/file/ProtoIdItem;->shortForm:Lcom/android/dx/rop/cst/CstString;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/android/dx/dex/file/StringIdsSection;->intern(Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/dex/file/StringIdItem;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/android/dx/dex/file/ProtoIdItem;->parameterTypes:Lcom/android/dx/dex/file/TypeListItem;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lcom/android/dx/dex/file/MixedItemSection;->intern(Lcom/android/dx/dex/file/OffsettedItem;)Lcom/android/dx/dex/file/OffsettedItem;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/android/dx/dex/file/TypeListItem;

    .line 36
    .line 37
    iput-object p1, p0, Lcom/android/dx/dex/file/ProtoIdItem;->parameterTypes:Lcom/android/dx/dex/file/TypeListItem;

    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_PROTO_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method

.method public writeSize()I
    .locals 0

    .line 1
    const/16 p0, 0xc

    .line 2
    .line 3
    return p0
.end method

.method public writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getStringIds()Lcom/android/dx/dex/file/StringIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/dex/file/ProtoIdItem;->shortForm:Lcom/android/dx/rop/cst/CstString;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/android/dx/dex/file/StringIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstString;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v1, p0, Lcom/android/dx/dex/file/ProtoIdItem;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Prototype;->getReturnType()Lcom/android/dx/rop/type/Type;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p1, v1}, Lcom/android/dx/dex/file/TypeIdsSection;->indexOf(Lcom/android/dx/rop/type/Type;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v1, p0, Lcom/android/dx/dex/file/ProtoIdItem;->parameterTypes:Lcom/android/dx/dex/file/TypeListItem;

    .line 26
    .line 27
    invoke-static {v1}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffsetOr0(Lcom/android/dx/dex/file/OffsettedItem;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, Lcom/android/dx/dex/file/ProtoIdItem;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 43
    .line 44
    invoke-virtual {v3}, Lcom/android/dx/rop/type/Prototype;->getReturnType()Lcom/android/dx/rop/type/Type;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v3, " proto("

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v3, p0, Lcom/android/dx/dex/file/ProtoIdItem;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 61
    .line 62
    invoke-virtual {v3}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    const/4 v5, 0x0

    .line 71
    move v6, v5

    .line 72
    :goto_0
    if-ge v6, v4, :cond_1

    .line 73
    .line 74
    if-eqz v6, :cond_0

    .line 75
    .line 76
    const-string v7, ", "

    .line 77
    .line 78
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :cond_0
    invoke-virtual {v3, v6}, Lcom/android/dx/rop/type/StdTypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-virtual {v7}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    add-int/lit8 v6, v6, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    const-string v3, ")"

    .line 96
    .line 97
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    new-instance v3, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/android/dx/dex/file/IndexedItem;->indexString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const/16 v4, 0x20

    .line 113
    .line 114
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-interface {p2, v5, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    new-instance v2, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v3, "  shorty_idx:      "

    .line 134
    .line 135
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v3, " // "

    .line 146
    .line 147
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    iget-object v4, p0, Lcom/android/dx/dex/file/ProtoIdItem;->shortForm:Lcom/android/dx/rop/cst/CstString;

    .line 151
    .line 152
    invoke-virtual {v4}, Lcom/android/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const/4 v4, 0x4

    .line 164
    invoke-interface {p2, v4, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 165
    .line 166
    .line 167
    new-instance v2, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    const-string v5, "  return_type_idx: "

    .line 170
    .line 171
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    iget-object p0, p0, Lcom/android/dx/dex/file/ProtoIdItem;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 185
    .line 186
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Prototype;->getReturnType()Lcom/android/dx/rop/type/Type;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-interface {p2, v4, p0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 202
    .line 203
    .line 204
    new-instance p0, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v2, "  parameters_off:  "

    .line 207
    .line 208
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v1, p0, p2, v4}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 212
    .line 213
    .line 214
    :cond_2
    invoke-interface {p2, v0}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 215
    .line 216
    .line 217
    invoke-interface {p2, p1}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {p2, v1}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 221
    .line 222
    .line 223
    return-void
.end method
