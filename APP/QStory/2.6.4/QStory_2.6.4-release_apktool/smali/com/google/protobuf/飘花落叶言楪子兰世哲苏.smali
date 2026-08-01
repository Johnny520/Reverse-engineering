.class public final Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;
.super Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public volatile 飘花落叶言子世楪苏哲兰:Z

.field public final 飘花落叶言子楪兰世哲苏:[Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;

.field public final 飘花落叶言子楪兰世苏哲:[Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

.field public final 飘花落叶言子楪兰哲世苏:[Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

.field public final 飘花落叶言子楪兰哲苏世:Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;

.field public final 飘花落叶言子楪兰苏世哲:[Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

.field public final 飘花落叶言子楪兰苏哲世:[Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

.field public final 飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

.field public final 飘花落叶言子楪哲兰苏世:[Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;[Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰哲苏世:Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 7
    .line 8
    invoke-virtual {p2}, [Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->clone()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, [Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰苏哲世:[Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子世楪苏哲兰:Z

    .line 18
    .line 19
    new-instance v1, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    array-length v2, p2

    .line 25
    move v3, v0

    .line 26
    :goto_0
    if-ge v3, v2, :cond_0

    .line 27
    .line 28
    aget-object v4, p2, v3

    .line 29
    .line 30
    iget-object v5, v4, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 31
    .line 32
    invoke-virtual {v5}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    move v2, v0

    .line 48
    :goto_1
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getPublicDependencyCount()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/4 v4, 0x0

    .line 53
    if-ge v2, v3, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getPublicDependency(I)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-ltz v3, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getDependencyCount()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-ge v3, v5, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1, v3}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getDependency(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 76
    .line 77
    if-nez v3, :cond_1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_1
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    new-instance p1, Lcom/google/protobuf/Descriptors$DescriptorValidationException;

    .line 87
    .line 88
    const-string p2, "Invalid public dependency index."

    .line 89
    .line 90
    invoke-direct {p1, p0, p2, v4}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子苏兰哲世;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_3
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    new-array v1, v1, [Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 99
    .line 100
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰哲世苏:[Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 101
    .line 102
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    iget-object p2, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 106
    .line 107
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getPackage()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p3, p0, p2}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getMessageTypeCount()I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-lez p2, :cond_4

    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getMessageTypeCount()I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    new-array p2, p2, [Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    sget-object p2, Lcom/google/protobuf/飘花落叶言楪世子哲苏兰;->飘花落叶言子楪世哲苏兰:[Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 128
    .line 129
    :goto_3
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰苏世:[Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 130
    .line 131
    move p2, v0

    .line 132
    :goto_4
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getMessageTypeCount()I

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    if-ge p2, p3, :cond_5

    .line 137
    .line 138
    iget-object p3, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰苏世:[Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 139
    .line 140
    new-instance v1, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 141
    .line 142
    invoke-virtual {p1, p2}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getMessageType(I)Lcom/google/protobuf/DescriptorProtos$DescriptorProto;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-direct {v1, v2, p0, v4}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;-><init>(Lcom/google/protobuf/DescriptorProtos$DescriptorProto;Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;)V

    .line 147
    .line 148
    .line 149
    aput-object v1, p3, p2

    .line 150
    .line 151
    add-int/lit8 p2, p2, 0x1

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getEnumTypeCount()I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    if-lez p2, :cond_6

    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getEnumTypeCount()I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    new-array p2, p2, [Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_6
    sget-object p2, Lcom/google/protobuf/飘花落叶言楪世子哲苏兰;->飘花落叶言子楪世兰苏哲:[Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 168
    .line 169
    :goto_5
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰世苏哲:[Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 170
    .line 171
    move p2, v0

    .line 172
    :goto_6
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getEnumTypeCount()I

    .line 173
    .line 174
    .line 175
    move-result p3

    .line 176
    if-ge p2, p3, :cond_7

    .line 177
    .line 178
    iget-object p3, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰世苏哲:[Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 179
    .line 180
    new-instance v1, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 181
    .line 182
    invoke-virtual {p1, p2}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getEnumType(I)Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-direct {v1, v2, p0, v4}, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;-><init>(Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;)V

    .line 187
    .line 188
    .line 189
    aput-object v1, p3, p2

    .line 190
    .line 191
    add-int/lit8 p2, p2, 0x1

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getServiceCount()I

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    if-lez p2, :cond_8

    .line 199
    .line 200
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getServiceCount()I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    new-array p2, p2, [Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_8
    sget-object p2, Lcom/google/protobuf/飘花落叶言楪世子哲苏兰;->飘花落叶言子楪世兰哲苏:[Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;

    .line 208
    .line 209
    :goto_7
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰世哲苏:[Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;

    .line 210
    .line 211
    move p2, v0

    .line 212
    :goto_8
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getServiceCount()I

    .line 213
    .line 214
    .line 215
    move-result p3

    .line 216
    if-ge p2, p3, :cond_9

    .line 217
    .line 218
    iget-object p3, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰世哲苏:[Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;

    .line 219
    .line 220
    new-instance v1, Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;

    .line 221
    .line 222
    invoke-virtual {p1, p2}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getService(I)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-direct {v1, v2, p0}, Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;-><init>(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;)V

    .line 227
    .line 228
    .line 229
    aput-object v1, p3, p2

    .line 230
    .line 231
    add-int/lit8 p2, p2, 0x1

    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_9
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getExtensionCount()I

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    if-lez p2, :cond_a

    .line 239
    .line 240
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getExtensionCount()I

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    new-array p2, p2, [Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 245
    .line 246
    goto :goto_9

    .line 247
    :cond_a
    sget-object p2, Lcom/google/protobuf/飘花落叶言楪世子哲苏兰;->飘花落叶言子楪世哲兰苏:[Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 248
    .line 249
    :goto_9
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰苏世哲:[Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 250
    .line 251
    move v5, v0

    .line 252
    :goto_a
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getExtensionCount()I

    .line 253
    .line 254
    .line 255
    move-result p2

    .line 256
    if-ge v5, p2, :cond_b

    .line 257
    .line 258
    iget-object p2, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰苏世哲:[Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 259
    .line 260
    new-instance v1, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 261
    .line 262
    invoke-virtual {p1, v5}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getExtension(I)Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    const/4 v4, 0x0

    .line 267
    const/4 v6, 0x1

    .line 268
    move-object v3, p0

    .line 269
    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;-><init>(Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;IZ)V

    .line 270
    .line 271
    .line 272
    aput-object v1, p2, v5

    .line 273
    .line 274
    add-int/lit8 v5, v5, 0x1

    .line 275
    .line 276
    goto :goto_a

    .line 277
    :cond_b
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;[Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)V
    .locals 3

    .line 278
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;

    const/4 v1, 0x0

    new-array v2, v1, [Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    invoke-direct {v0, v2}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;-><init>([Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;)V

    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰哲苏世:Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;

    .line 280
    iput-object p4, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 281
    new-array p4, v1, [Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    iput-object p4, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰苏哲世:[Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 282
    new-array p4, v1, [Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    iput-object p4, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰哲世苏:[Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 283
    iput-boolean v1, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子世楪苏哲兰:Z

    .line 284
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰苏世:[Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 285
    iput-object p3, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰世苏哲:[Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 286
    sget-object p2, Lcom/google/protobuf/飘花落叶言楪世子哲苏兰;->飘花落叶言子楪世兰哲苏:[Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;

    .line 287
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰世哲苏:[Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;

    .line 288
    sget-object p2, Lcom/google/protobuf/飘花落叶言楪世子哲苏兰;->飘花落叶言子楪世哲兰苏:[Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 289
    iput-object p2, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰苏世哲:[Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 290
    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Ljava/lang/String;)V

    return-void
.end method

.method public static 飘花落叶言子楪哲苏兰世([Ljava/lang/String;[Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;)Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    aget-object p0, p0, v2

    .line 7
    .line 8
    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    array-length v1, p0

    .line 21
    :goto_0
    if-ge v2, v1, :cond_1

    .line 22
    .line 23
    aget-object v3, p0, v2

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :goto_1
    :try_start_0
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->parseFrom([B)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 42
    .line 43
    .line 44
    move-result-object p0
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1

    .line 45
    :try_start_1
    invoke-static {p0, p1}, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪苏兰哲世(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;[Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;)Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_1
    .catch Lcom/google/protobuf/Descriptors$DescriptorValidationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 49
    return-object p0

    .line 50
    :catch_0
    move-exception p1

    .line 51
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v2, "Invalid embedded descriptor for \""

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p0, "\"."

    .line 68
    .line 69
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-direct {v0, p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :catch_1
    move-exception p0

    .line 81
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 82
    .line 83
    const-string v0, "Failed to parse protocol buffer descriptor for generated code."

    .line 84
    .line 85
    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    throw p1
.end method

.method public static 飘花落叶言子楪苏兰哲世(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;[Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;)Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;
    .locals 14

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;-><init>([Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1, v0}, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;-><init>(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;[Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, v1, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰苏世:[Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 12
    .line 13
    array-length p1, p0

    .line 14
    const/4 v0, 0x0

    .line 15
    move v2, v0

    .line 16
    :goto_0
    if-ge v2, p1, :cond_0

    .line 17
    .line 18
    aget-object v3, p0, v2

    .line 19
    .line 20
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪苏兰哲世()V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p0, v1, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰世哲苏:[Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;

    .line 27
    .line 28
    array-length p1, p0

    .line 29
    move v2, v0

    .line 30
    :goto_1
    if-ge v2, p1, :cond_4

    .line 31
    .line 32
    aget-object v3, p0, v2

    .line 33
    .line 34
    iget-object v3, v3, Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;->飘花落叶言子楪兰世哲苏:[Lcom/google/protobuf/飘花落叶言楪子兰哲苏世;

    .line 35
    .line 36
    array-length v4, v3

    .line 37
    move v5, v0

    .line 38
    :goto_2
    if-ge v5, v4, :cond_3

    .line 39
    .line 40
    aget-object v6, v3, v5

    .line 41
    .line 42
    iget-object v7, v6, Lcom/google/protobuf/飘花落叶言楪子兰哲苏世;->飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;

    .line 43
    .line 44
    iget-object v7, v7, Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;->飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 45
    .line 46
    iget-object v8, v7, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰哲苏世:Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;

    .line 47
    .line 48
    iget-object v9, v6, Lcom/google/protobuf/飘花落叶言楪子兰哲苏世;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 49
    .line 50
    invoke-virtual {v9}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getInputType()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    sget-object v11, Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;->TYPES_ONLY:Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;

    .line 55
    .line 56
    invoke-virtual {v8, v10, v6, v11, v0}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;Z)Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    instance-of v8, v8, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 61
    .line 62
    const/4 v10, 0x0

    .line 63
    const-string v12, "\" is not a message type."

    .line 64
    .line 65
    const-string v13, "\""

    .line 66
    .line 67
    if-eqz v8, :cond_2

    .line 68
    .line 69
    iget-object v7, v7, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰哲苏世:Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;

    .line 70
    .line 71
    invoke-virtual {v9}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getOutputType()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-virtual {v7, v8, v6, v11, v0}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;Z)Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    instance-of v7, v7, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 80
    .line 81
    if-eqz v7, :cond_1

    .line 82
    .line 83
    add-int/lit8 v5, v5, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_1
    new-instance p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;

    .line 87
    .line 88
    invoke-virtual {v9}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getOutputType()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-direct {p0, v6, p1, v10}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子苏兰哲世;)V

    .line 108
    .line 109
    .line 110
    throw p0

    .line 111
    :cond_2
    new-instance p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;

    .line 112
    .line 113
    invoke-virtual {v9}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getInputType()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-direct {p0, v6, p1, v10}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子苏兰哲世;)V

    .line 133
    .line 134
    .line 135
    throw p0

    .line 136
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    iget-object p0, v1, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰苏世哲:[Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 140
    .line 141
    array-length p1, p0

    .line 142
    :goto_3
    if-ge v0, p1, :cond_5

    .line 143
    .line 144
    aget-object v2, p0, v0

    .line 145
    .line 146
    invoke-static {v2}, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪苏兰哲世(Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;)V

    .line 147
    .line 148
    .line 149
    add-int/lit8 v0, v0, 0x1

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_5
    return-object v1
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏()Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final 飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/DescriptorProtos$Edition;
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getSyntax()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v1, "proto3"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string v1, "editions"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_PROTO2:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getEdition()Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_PROTO3:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 35
    .line 36
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰世苏()V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰苏世()V
    :try_end_0
    .catch Lcom/google/protobuf/Descriptors$DescriptorValidationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception v0

    .line 6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v3, "Invalid features for \""

    .line 17
    .line 18
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, "\"."

    .line 25
    .line 26
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v1, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v1
.end method

.method public final 飘花落叶言子楪哲兰苏世()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子世楪苏哲兰:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子世楪苏哲兰:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto/16 :goto_5

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰苏世:[Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 30
    .line 31
    array-length v1, v0

    .line 32
    const/4 v2, 0x0

    .line 33
    move v3, v2

    .line 34
    :goto_0
    if-ge v3, v1, :cond_2

    .line 35
    .line 36
    aget-object v4, v0, v3

    .line 37
    .line 38
    invoke-virtual {v4}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪兰世苏哲()V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰世苏哲:[Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 45
    .line 46
    array-length v1, v0

    .line 47
    move v3, v2

    .line 48
    :goto_1
    if-ge v3, v1, :cond_3

    .line 49
    .line 50
    aget-object v4, v0, v3

    .line 51
    .line 52
    invoke-static {v4}, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;->飘花落叶言子楪苏兰哲世(Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰世哲苏:[Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;

    .line 59
    .line 60
    array-length v1, v0

    .line 61
    move v3, v2

    .line 62
    :goto_2
    if-ge v3, v1, :cond_5

    .line 63
    .line 64
    aget-object v4, v0, v3

    .line 65
    .line 66
    iget-object v5, v4, Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    .line 67
    .line 68
    invoke-virtual {v5}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$ServiceOptions;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v5}, Lcom/google/protobuf/DescriptorProtos$ServiceOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v4, v5}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)V

    .line 77
    .line 78
    .line 79
    iget-object v4, v4, Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;->飘花落叶言子楪兰世哲苏:[Lcom/google/protobuf/飘花落叶言楪子兰哲苏世;

    .line 80
    .line 81
    array-length v5, v4

    .line 82
    move v6, v2

    .line 83
    :goto_3
    if-ge v6, v5, :cond_4

    .line 84
    .line 85
    aget-object v7, v4, v6

    .line 86
    .line 87
    iget-object v8, v7, Lcom/google/protobuf/飘花落叶言楪子兰哲苏世;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;

    .line 88
    .line 89
    invoke-virtual {v8}, Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$MethodOptions;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-virtual {v8}, Lcom/google/protobuf/DescriptorProtos$MethodOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-virtual {v7, v8}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)V

    .line 98
    .line 99
    .line 100
    add-int/lit8 v6, v6, 0x1

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰苏世哲:[Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 107
    .line 108
    array-length v1, v0

    .line 109
    :goto_4
    if-ge v2, v1, :cond_6

    .line 110
    .line 111
    aget-object v3, v0, v2

    .line 112
    .line 113
    iget-object v4, v3, Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 114
    .line 115
    invoke-virtual {v4}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v4}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v3, v4}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)V

    .line 124
    .line 125
    .line 126
    add-int/lit8 v2, v2, 0x1

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_6
    const/4 v0, 0x1

    .line 130
    iput-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子世楪苏哲兰:Z

    .line 131
    .line 132
    monitor-exit p0

    .line 133
    return-void

    .line 134
    :goto_5
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    throw v0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$Edition;->getNumber()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sget-object v1, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_2023:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/google/protobuf/DescriptorProtos$Edition;->getNumber()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-lt v0, v1, :cond_0

    .line 16
    .line 17
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_PROTO2:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 27
    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getJavaStringCheckUtf8()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->newBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object v0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;

    .line 47
    .line 48
    invoke-static {}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->newBuilder()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    sget-object v2, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;->VERIFY:Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->setUtf8Validation(Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$Utf8Validation;)Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;->setExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;Ljava/lang/Object;)Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const/4 p0, 0x0

    .line 67
    :goto_0
    if-eqz p0, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_2
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲世兰()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 2
    .line 3
    return-object p0
.end method
