.class public abstract Lio/ktor/server/http/content/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/room/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/room/飘花落叶言子楪苏世兰哲;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lio/ktor/server/http/content/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 13
    .line 14
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlin/Pair;
    .locals 10

    .line 1
    iget-object v0, p0, Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    check-cast v0, Lio/ktor/server/engine/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    iget-object v0, v0, Lio/ktor/server/engine/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-string p0, "/"

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    const/4 v1, 0x0

    .line 26
    if-nez p0, :cond_c

    .line 27
    .line 28
    const-string p0, "\\"

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_0
    const/4 p0, 0x2

    .line 39
    new-array v2, p0, [C

    .line 40
    .line 41
    fill-array-data v2, :array_0

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子兰世苏哲楪(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v3, ".."

    .line 49
    .line 50
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_b

    .line 55
    .line 56
    if-nez p2, :cond_1

    .line 57
    .line 58
    const-string p2, ""

    .line 59
    .line 60
    :cond_1
    const/4 p0, 0x3

    .line 61
    new-array p1, p0, [C

    .line 62
    .line 63
    fill-array-data p1, :array_1

    .line 64
    .line 65
    .line 66
    invoke-static {p2, p1}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子兰世苏哲楪(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {v2, p1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object p2, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[Z

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    const/4 v2, 0x0

    .line 81
    move v3, v2

    .line 82
    :goto_0
    if-ge v3, p2, :cond_6

    .line 83
    .line 84
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v4}, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_5

    .line 95
    .line 96
    new-instance p2, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-direct {p2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    if-lez v3, :cond_2

    .line 106
    .line 107
    invoke-virtual {p1, v2, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 112
    .line 113
    .line 114
    :cond_2
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    check-cast v2, Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v2, p2}, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 121
    .line 122
    .line 123
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    :goto_1
    if-ge v3, v2, :cond_4

    .line 130
    .line 131
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    check-cast v4, Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v4}, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_3

    .line 142
    .line 143
    invoke-static {v4, p2}, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_3
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    move-object v4, p2

    .line 154
    goto :goto_3

    .line 155
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_6
    move-object v4, p1

    .line 159
    :goto_3
    const/4 v8, 0x0

    .line 160
    const/16 v9, 0x3e

    .line 161
    .line 162
    const-string v5, "/"

    .line 163
    .line 164
    const/4 v6, 0x0

    .line 165
    const/4 v7, 0x0

    .line 166
    invoke-static/range {v4 .. v9}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    new-instance p2, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const/16 v2, 0x2f

    .line 183
    .line 184
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    new-instance v2, Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;

    .line 195
    .line 196
    const/16 v3, 0x14

    .line 197
    .line 198
    invoke-direct {v2, p1, v3, p3}, Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    sget-object p3, Lio/ktor/server/http/content/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 202
    .line 203
    invoke-interface {p3}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 208
    .line 209
    invoke-virtual {v3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    check-cast v3, Ljava/net/URL;

    .line 214
    .line 215
    if-eqz v3, :cond_8

    .line 216
    .line 217
    invoke-virtual {v2, v3}, Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    check-cast v3, Lkotlin/Pair;

    .line 222
    .line 223
    if-nez v3, :cond_7

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_7
    return-object v3

    .line 227
    :cond_8
    :goto_4
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    new-instance v0, Landroidx/compose/ui/graphics/vector/飘花落叶言子世苏楪兰哲;

    .line 235
    .line 236
    invoke-direct {v0, p1}, Landroidx/compose/ui/graphics/vector/飘花落叶言子世苏楪兰哲;-><init>(Ljava/util/Enumeration;)V

    .line 237
    .line 238
    .line 239
    new-instance p1, Lkotlin/collections/飘花落叶言子楪哲苏兰世;

    .line 240
    .line 241
    invoke-direct {p1, v0, p0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/Object;I)V

    .line 242
    .line 243
    .line 244
    new-instance p0, Lkotlin/sequences/飘花落叶言子楪世苏哲兰;

    .line 245
    .line 246
    invoke-direct {p0, p1}, Lkotlin/sequences/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0}, Lkotlin/sequences/飘花落叶言子楪世苏哲兰;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    if-eqz p1, :cond_a

    .line 258
    .line 259
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-virtual {v2, p1}, Landroidx/activity/compose/飘花落叶言子楪世哲兰苏;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    if-eqz p1, :cond_9

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_a
    move-object p1, v1

    .line 271
    :goto_5
    check-cast p1, Lkotlin/Pair;

    .line 272
    .line 273
    if-eqz p1, :cond_c

    .line 274
    .line 275
    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    check-cast p0, Ljava/net/URL;

    .line 280
    .line 281
    invoke-interface {p3}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p3

    .line 285
    check-cast p3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 286
    .line 287
    invoke-interface {p3, p2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    return-object p1

    .line 291
    :cond_b
    new-instance p2, Lio/ktor/server/plugins/BadRequestException;

    .line 292
    .line 293
    const-string p3, "Relative path should not contain path traversing characters: "

    .line 294
    .line 295
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-direct {p2, p1, v1, p0, v1}, Lio/ktor/server/plugins/BadRequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 300
    .line 301
    .line 302
    throw p2

    .line 303
    :cond_c
    :goto_6
    return-object v1

    .line 304
    nop

    .line 305
    :array_0
    .array-data 2
        0x2fs
        0x5cs
    .end array-data

    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    :array_1
    .array-data 2
        0x2es
        0x2fs
        0x5cs
    .end array-data
.end method
