.class public final Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪哲兰世苏;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪哲兰世苏;

    .line 7
    .line 8
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/util/AbstractCollection;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 47
    .line 48
    if-eq v3, v1, :cond_2

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, v3, v1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    return-object v0
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x1

    .line 18
    const/16 v4, 0xa

    .line 19
    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 27
    .line 28
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏兰哲;->飘花落叶言子世楪兰哲苏()Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲兰苏楪;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    instance-of v5, v5, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏哲兰;

    .line 33
    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏兰哲;->飘花落叶言子世楪兰哲苏()Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲兰苏楪;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-interface {v5}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世兰哲()Ljava/util/Collection;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    check-cast v5, Ljava/lang/Iterable;

    .line 48
    .line 49
    new-instance v6, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-static {v5, v4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_1

    .line 67
    .line 68
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏兰哲;

    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {v5}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪世哲苏兰;->飘花落叶言子世苏楪兰哲(Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏兰哲;)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏兰哲;->飘花落叶言子世苏楪哲兰()Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eqz v7, :cond_0

    .line 86
    .line 87
    invoke-virtual {v5, v3}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏世兰楪哲(Z)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    :cond_0
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeIntersector$ResultNullability;->START:Lkotlin/reflect/jvm/internal/impl/types/checker/TypeIntersector$ResultNullability;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_4

    .line 114
    .line 115
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    check-cast v5, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子苏世楪哲兰;

    .line 120
    .line 121
    invoke-virtual {v1, v5}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeIntersector$ResultNullability;->combine(Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子苏世楪哲兰;)Lkotlin/reflect/jvm/internal/impl/types/checker/TypeIntersector$ResultNullability;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    goto :goto_2

    .line 126
    :cond_4
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 127
    .line 128
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_9

    .line 140
    .line 141
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    check-cast v5, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 146
    .line 147
    sget-object v6, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeIntersector$ResultNullability;->NOT_NULL:Lkotlin/reflect/jvm/internal/impl/types/checker/TypeIntersector$ResultNullability;

    .line 148
    .line 149
    if-ne v1, v6, :cond_8

    .line 150
    .line 151
    instance-of v6, v5, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏哲世兰;

    .line 152
    .line 153
    if-eqz v6, :cond_5

    .line 154
    .line 155
    check-cast v5, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏哲世兰;

    .line 156
    .line 157
    new-instance v6, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏哲世兰;

    .line 158
    .line 159
    iget-object v7, v5, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/model/CaptureStatus;

    .line 160
    .line 161
    iget-object v8, v5, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏兰世哲;

    .line 162
    .line 163
    iget-object v9, v5, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子苏世楪哲兰;

    .line 164
    .line 165
    iget-object v10, v5, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;

    .line 166
    .line 167
    iget-boolean v11, v5, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:Z

    .line 168
    .line 169
    const/4 v12, 0x1

    .line 170
    invoke-direct/range {v6 .. v12}, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏哲世兰;-><init>(Lkotlin/reflect/jvm/internal/impl/types/model/CaptureStatus;Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏兰世哲;Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子苏世楪哲兰;Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;ZZ)V

    .line 171
    .line 172
    .line 173
    move-object v5, v6

    .line 174
    :cond_5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    const/4 v6, 0x0

    .line 178
    invoke-static {v5, v6}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世(Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子苏世楪哲兰;Z)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪哲苏世兰;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    if-eqz v7, :cond_7

    .line 183
    .line 184
    :cond_6
    move-object v5, v7

    .line 185
    goto :goto_4

    .line 186
    :cond_7
    invoke-static {v5}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰(Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子苏世楪哲兰;)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    if-nez v7, :cond_6

    .line 191
    .line 192
    invoke-virtual {v5, v6}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏世兰楪哲(Z)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    :cond_8
    :goto_4
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-static {p1, v4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_a

    .line 218
    .line 219
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 224
    .line 225
    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏兰哲;->飘花落叶言子世楪苏兰哲()Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    const/4 v1, 0x0

    .line 242
    if-eqz v0, :cond_15

    .line 243
    .line 244
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    if-eqz v4, :cond_11

    .line 253
    .line 254
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    check-cast v4, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;

    .line 259
    .line 260
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;

    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    sget-object v5, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;

    .line 266
    .line 267
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->isEmpty()Z

    .line 271
    .line 272
    .line 273
    move-result v6

    .line 274
    if-eqz v6, :cond_b

    .line 275
    .line 276
    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->isEmpty()Z

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    if-eqz v6, :cond_b

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_b
    new-instance v6, Ljava/util/ArrayList;

    .line 284
    .line 285
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 286
    .line 287
    .line 288
    iget-object v5, v5, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 289
    .line 290
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    :cond_c
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v7

    .line 305
    if-eqz v7, :cond_10

    .line 306
    .line 307
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    check-cast v7, Ljava/lang/Number;

    .line 312
    .line 313
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    iget-object v8, v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 318
    .line 319
    invoke-virtual {v8, v7}, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    check-cast v8, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏哲兰世;

    .line 324
    .line 325
    iget-object v9, v4, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 326
    .line 327
    invoke-virtual {v9, v7}, L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世苏哲兰;->get(I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    check-cast v7, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏哲兰世;

    .line 332
    .line 333
    if-nez v8, :cond_e

    .line 334
    .line 335
    if-eqz v7, :cond_d

    .line 336
    .line 337
    invoke-static {v8, v7}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    if-eqz v8, :cond_d

    .line 342
    .line 343
    goto :goto_9

    .line 344
    :cond_d
    move-object v7, v1

    .line 345
    goto :goto_9

    .line 346
    :cond_e
    invoke-static {v7, v8}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v7

    .line 350
    if-eqz v7, :cond_f

    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_f
    move-object v8, v1

    .line 354
    :goto_8
    move-object v7, v8

    .line 355
    :goto_9
    if-eqz v7, :cond_c

    .line 356
    .line 357
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_10
    invoke-static {v6}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    goto :goto_6

    .line 366
    :cond_11
    check-cast v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;

    .line 367
    .line 368
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 369
    .line 370
    .line 371
    move-result p1

    .line 372
    if-ne p1, v3, :cond_12

    .line 373
    .line 374
    invoke-static {v2}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏哲兰世楪(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 379
    .line 380
    goto :goto_a

    .line 381
    :cond_12
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1;

    .line 382
    .line 383
    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1;-><init>(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v2, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰(Ljava/util/AbstractCollection;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Ljava/util/ArrayList;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 391
    .line 392
    .line 393
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/constants/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(Ljava/util/ArrayList;)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    if-eqz p1, :cond_13

    .line 398
    .line 399
    move-object p0, p1

    .line 400
    goto :goto_a

    .line 401
    :cond_13
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1;

    .line 402
    .line 403
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏兰哲世;

    .line 404
    .line 405
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪哲世兰苏;

    .line 409
    .line 410
    invoke-direct {p1, v1}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1;-><init>(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰(Ljava/util/AbstractCollection;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Ljava/util/ArrayList;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 418
    .line 419
    .line 420
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 421
    .line 422
    .line 423
    move-result p1

    .line 424
    const/4 v1, 0x2

    .line 425
    if-ge p1, v1, :cond_14

    .line 426
    .line 427
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏哲兰世楪(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object p0

    .line 431
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 432
    .line 433
    goto :goto_a

    .line 434
    :cond_14
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏哲兰;

    .line 435
    .line 436
    invoke-direct {p0, v2}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏哲兰;-><init>(Ljava/util/AbstractCollection;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰()Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 440
    .line 441
    .line 442
    move-result-object p0

    .line 443
    :goto_a
    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏世兰哲楪(Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪兰苏;)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 444
    .line 445
    .line 446
    move-result-object p0

    .line 447
    return-object p0

    .line 448
    :cond_15
    const-string p0, "Empty collection can\'t be reduced."

    .line 449
    .line 450
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    return-object v1
.end method
