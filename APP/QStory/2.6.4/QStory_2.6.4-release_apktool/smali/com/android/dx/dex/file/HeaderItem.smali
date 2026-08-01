.class public final Lcom/android/dx/dex/file/HeaderItem;
.super Lcom/android/dx/dex/file/IndexedItem;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/file/IndexedItem;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 0

    .line 1
    return-void
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_HEADER_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method

.method public writeSize()I
    .locals 0

    .line 1
    const/16 p0, 0x70

    .line 2
    .line 3
    return p0
.end method

.method public writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getMap()Lcom/android/dx/dex/file/MixedItemSection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->getFileOffset()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getFirstDataSection()Lcom/android/dx/dex/file/Section;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getLastDataSection()Lcom/android/dx/dex/file/Section;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0}, Lcom/android/dx/dex/file/Section;->getFileOffset()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {v1}, Lcom/android/dx/dex/file/Section;->getFileOffset()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v1}, Lcom/android/dx/dex/file/Section;->writeSize()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/2addr v1, v2

    .line 30
    sub-int/2addr v1, v0

    .line 31
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getDexOptions()Lcom/android/dx/dex/DexOptions;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Lcom/android/dx/dex/DexOptions;->getMagic()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const v4, 0x12345678

    .line 44
    .line 45
    .line 46
    const/16 v5, 0x70

    .line 47
    .line 48
    const/16 v6, 0x8

    .line 49
    .line 50
    const/4 v7, 0x4

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v8, "magic: "

    .line 56
    .line 57
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v8, Lcom/android/dx/rop/cst/CstString;

    .line 61
    .line 62
    invoke-direct {v8, v2}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v8}, Lcom/android/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-interface {p2, v6, v3}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v3, "checksum"

    .line 80
    .line 81
    invoke-interface {p2, v7, v3}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/16 v3, 0x14

    .line 85
    .line 86
    const-string v8, "signature"

    .line 87
    .line 88
    invoke-interface {p2, v3, v8}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance v3, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v8, "file_size:       "

    .line 94
    .line 95
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getFileSize()I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    invoke-static {v8}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-interface {p2, v7, v3}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    new-instance v3, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v8, "header_size:     "

    .line 119
    .line 120
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v5}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-interface {p2, v7, v3}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v3, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v8, "endian_tag:      "

    .line 140
    .line 141
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v4, v3, p2, v7}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 145
    .line 146
    .line 147
    const-string v3, "link_size:       0"

    .line 148
    .line 149
    invoke-interface {p2, v7, v3}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const-string v3, "link_off:        0"

    .line 153
    .line 154
    invoke-interface {p2, v7, v3}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    new-instance v3, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const-string v8, "map_off:         "

    .line 160
    .line 161
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-static {p0, v3, p2, v7}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 165
    .line 166
    .line 167
    :cond_0
    const/4 v3, 0x0

    .line 168
    :goto_0
    if-ge v3, v6, :cond_1

    .line 169
    .line 170
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    invoke-interface {p2, v8}, Lcom/android/dx/util/Output;->writeByte(I)V

    .line 175
    .line 176
    .line 177
    add-int/lit8 v3, v3, 0x1

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_1
    const/16 v2, 0x18

    .line 181
    .line 182
    invoke-interface {p2, v2}, Lcom/android/dx/util/Output;->writeZeroes(I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getFileSize()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    invoke-interface {p2, v2}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 190
    .line 191
    .line 192
    invoke-interface {p2, v5}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 193
    .line 194
    .line 195
    invoke-interface {p2, v4}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {p2, v6}, Lcom/android/dx/util/Output;->writeZeroes(I)V

    .line 199
    .line 200
    .line 201
    invoke-interface {p2, p0}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getStringIds()Lcom/android/dx/dex/file/StringIdsSection;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-virtual {p0, p2}, Lcom/android/dx/dex/file/StringIdsSection;->writeHeaderPart(Lcom/android/dx/util/AnnotatedOutput;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-virtual {p0, p2}, Lcom/android/dx/dex/file/TypeIdsSection;->writeHeaderPart(Lcom/android/dx/util/AnnotatedOutput;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getProtoIds()Lcom/android/dx/dex/file/ProtoIdsSection;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-virtual {p0, p2}, Lcom/android/dx/dex/file/ProtoIdsSection;->writeHeaderPart(Lcom/android/dx/util/AnnotatedOutput;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getFieldIds()Lcom/android/dx/dex/file/FieldIdsSection;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-virtual {p0, p2}, Lcom/android/dx/dex/file/FieldIdsSection;->writeHeaderPart(Lcom/android/dx/util/AnnotatedOutput;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getMethodIds()Lcom/android/dx/dex/file/MethodIdsSection;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-virtual {p0, p2}, Lcom/android/dx/dex/file/MethodIdsSection;->writeHeaderPart(Lcom/android/dx/util/AnnotatedOutput;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getClassDefs()Lcom/android/dx/dex/file/ClassDefsSection;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-virtual {p0, p2}, Lcom/android/dx/dex/file/ClassDefsSection;->writeHeaderPart(Lcom/android/dx/util/AnnotatedOutput;)V

    .line 244
    .line 245
    .line 246
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 247
    .line 248
    .line 249
    move-result p0

    .line 250
    if-eqz p0, :cond_2

    .line 251
    .line 252
    new-instance p0, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    const-string p1, "data_size:       "

    .line 255
    .line 256
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    invoke-interface {p2, v7, p0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 271
    .line 272
    .line 273
    new-instance p0, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    const-string p1, "data_off:        "

    .line 276
    .line 277
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v0, p0, p2, v7}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 281
    .line 282
    .line 283
    :cond_2
    invoke-interface {p2, v1}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 284
    .line 285
    .line 286
    invoke-interface {p2, v0}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 287
    .line 288
    .line 289
    return-void
.end method
