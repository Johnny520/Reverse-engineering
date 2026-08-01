.class public abstract Lio/ktor/util/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:[B

    .line 5
    .line 6
    return-void
.end method

.method public static final 飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p4, Lio/ktor/util/DeflaterKt$deflateWhile$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lio/ktor/util/DeflaterKt$deflateWhile$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;->L$3:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 39
    .line 40
    iget-object p1, v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;->L$2:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    iget-object p2, v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p2, Ljava/util/zip/Deflater;

    .line 47
    .line 48
    iget-object p3, v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p3, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 51
    .line 52
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object v5, p3

    .line 56
    move-object p3, p0

    .line 57
    move-object p0, v5

    .line 58
    move-object v5, p2

    .line 59
    move-object p2, p1

    .line 60
    move-object p1, v5

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    return-object p0

    .line 69
    :cond_2
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    invoke-interface {p3}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p4

    .line 76
    check-cast p4, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result p4

    .line 82
    if-eqz p4, :cond_5

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 88
    .line 89
    .line 90
    move-result p4

    .line 91
    if-eqz p4, :cond_4

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 94
    .line 95
    .line 96
    move-result-object p4

    .line 97
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    add-int/2addr v4, v2

    .line 106
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-virtual {p1, p4, v4, v2}, Ljava/util/zip/Deflater;->deflate([BII)I

    .line 111
    .line 112
    .line 113
    move-result p4

    .line 114
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    add-int/2addr v2, p4

    .line 119
    invoke-virtual {p2, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 120
    .line 121
    .line 122
    :cond_4
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 123
    .line 124
    .line 125
    iput-object p0, v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;->L$0:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object p1, v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;->L$1:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object p2, v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;->L$2:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object p3, v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;->L$3:Ljava/lang/Object;

    .line 132
    .line 133
    iput v3, v0, Lio/ktor/util/DeflaterKt$deflateWhile$1;->label:I

    .line 134
    .line 135
    invoke-static {p0, p2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p4

    .line 139
    if-ne p4, v1, :cond_3

    .line 140
    .line 141
    return-object v1

    .line 142
    :cond_5
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 143
    .line 144
    return-object p0
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/File;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/io/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏兰楪哲(Ljava/io/File;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/16 v2, 0x2f

    .line 25
    .line 26
    const/16 v3, 0x5c

    .line 27
    .line 28
    const-string v4, ""

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    if-lez v1, :cond_4

    .line 32
    .line 33
    move-object v1, p1

    .line 34
    :goto_0
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    if-nez v6, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-static {v1, p1}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    move v6, v5

    .line 64
    :goto_1
    if-ge v6, v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eq v7, v3, :cond_1

    .line 71
    .line 72
    if-ne v7, v2, :cond_0

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_0
    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    goto :goto_3

    .line 80
    :cond_1
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object p1, v4

    .line 84
    :goto_3
    new-instance v1, Ljava/io/File;

    .line 85
    .line 86
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    move-object p1, v1

    .line 90
    goto :goto_4

    .line 91
    :cond_3
    move-object v1, v6

    .line 92
    goto :goto_0

    .line 93
    :cond_4
    :goto_4
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-nez v1, :cond_5

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_5
    move-object v4, v1

    .line 101
    :goto_5
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    add-int/lit8 v1, v1, -0x1

    .line 106
    .line 107
    move v6, v5

    .line 108
    :goto_6
    if-gt v6, v1, :cond_e

    .line 109
    .line 110
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eq v7, v3, :cond_d

    .line 115
    .line 116
    if-ne v7, v2, :cond_6

    .line 117
    .line 118
    goto :goto_8

    .line 119
    :cond_6
    const/16 v8, 0x2e

    .line 120
    .line 121
    if-eq v7, v8, :cond_7

    .line 122
    .line 123
    goto :goto_9

    .line 124
    :cond_7
    if-ne v6, v1, :cond_8

    .line 125
    .line 126
    add-int/lit8 v6, v6, 0x1

    .line 127
    .line 128
    goto :goto_9

    .line 129
    :cond_8
    add-int/lit8 v7, v6, 0x1

    .line 130
    .line 131
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    const/4 v9, 0x2

    .line 136
    if-eq v7, v3, :cond_c

    .line 137
    .line 138
    if-ne v7, v2, :cond_9

    .line 139
    .line 140
    goto :goto_7

    .line 141
    :cond_9
    if-ne v7, v8, :cond_e

    .line 142
    .line 143
    add-int/lit8 v7, v6, 0x2

    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    if-ne v7, v8, :cond_a

    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_a
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-eq v7, v3, :cond_b

    .line 157
    .line 158
    if-ne v7, v2, :cond_e

    .line 159
    .line 160
    :cond_b
    const/4 v9, 0x3

    .line 161
    :cond_c
    :goto_7
    add-int/2addr v6, v9

    .line 162
    goto :goto_6

    .line 163
    :cond_d
    :goto_8
    add-int/lit8 v6, v6, 0x1

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_e
    :goto_9
    if-nez v6, :cond_f

    .line 167
    .line 168
    goto :goto_a

    .line 169
    :cond_f
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-lt v6, v1, :cond_10

    .line 178
    .line 179
    new-instance p1, Ljava/io/File;

    .line 180
    .line 181
    const-string v1, "."

    .line 182
    .line 183
    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    goto :goto_a

    .line 187
    :cond_10
    new-instance v1, Ljava/io/File;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    move-object p1, v1

    .line 204
    :goto_a
    new-instance v1, Ljava/io/File;

    .line 205
    .line 206
    const-string v2, ".."

    .line 207
    .line 208
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪哲兰苏(Ljava/io/File;)Lkotlin/io/飘花落叶言子楪世苏哲兰;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    iget-object v3, v2, Lkotlin/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 216
    .line 217
    invoke-static {v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪哲兰苏(Ljava/io/File;)Lkotlin/io/飘花落叶言子楪世苏哲兰;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    iget-object v4, v1, Lkotlin/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 222
    .line 223
    iget-object v2, v2, Lkotlin/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/io/File;

    .line 224
    .line 225
    iget-object v1, v1, Lkotlin/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/io/File;

    .line 226
    .line 227
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-nez v1, :cond_11

    .line 232
    .line 233
    goto :goto_b

    .line 234
    :cond_11
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-ge v1, v2, :cond_12

    .line 243
    .line 244
    goto :goto_b

    .line 245
    :cond_12
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    invoke-interface {v3, v5, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    :goto_b
    const/4 v1, 0x0

    .line 258
    const-string v2, "Bad relative path "

    .line 259
    .line 260
    if-nez v5, :cond_14

    .line 261
    .line 262
    invoke-virtual {p1}, Ljava/io/File;->isAbsolute()Z

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    if-nez v3, :cond_13

    .line 267
    .line 268
    new-instance v0, Ljava/io/File;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    return-object v0

    .line 278
    :cond_13
    invoke-static {v0, v2}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    return-object v1

    .line 282
    :cond_14
    invoke-static {v0, v2}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    return-object v1
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Lio/ktor/util/飘花落叶言子楪哲苏兰世;Lio/ktor/util/飘花落叶言子楪哲苏兰世;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Lio/ktor/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/util/Map$Entry;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {p0, v1, v0}, Lio/ktor/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏兰哲(Ljava/lang/String;Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Ljava/util/zip/Inflater;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/ByteBuffer;Ljava/util/zip/CRC32;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p4, Lio/ktor/util/EncodersJvmKt$inflateTo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lio/ktor/util/EncodersJvmKt$inflateTo$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/util/EncodersJvmKt$inflateTo$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/util/EncodersJvmKt$inflateTo$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/util/EncodersJvmKt$inflateTo$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lio/ktor/util/EncodersJvmKt$inflateTo$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lio/ktor/util/EncodersJvmKt$inflateTo$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/util/EncodersJvmKt$inflateTo$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget p0, v0, Lio/ktor/util/EncodersJvmKt$inflateTo$1;->I$0:I

    .line 37
    .line 38
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-virtual {p0, p4, v2, v4}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 72
    .line 73
    .line 74
    move-result p4

    .line 75
    add-int/2addr p4, p0

    .line 76
    invoke-virtual {p2, p4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 80
    .line 81
    .line 82
    invoke-static {p3, p2}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏(Ljava/util/zip/Checksum;Ljava/nio/ByteBuffer;)V

    .line 83
    .line 84
    .line 85
    iput p0, v0, Lio/ktor/util/EncodersJvmKt$inflateTo$1;->I$0:I

    .line 86
    .line 87
    iput v3, v0, Lio/ktor/util/EncodersJvmKt$inflateTo$1;->label:I

    .line 88
    .line 89
    invoke-static {p1, p2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, v1, :cond_3

    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_3
    :goto_1
    new-instance p1, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 99
    .line 100
    .line 101
    return-object p1
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;ZL飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    instance-of v3, v2, Lio/ktor/util/DeflaterKt$deflateTo$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lio/ktor/util/DeflaterKt$deflateTo$1;

    .line 13
    .line 14
    iget v4, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lio/ktor/util/DeflaterKt$deflateTo$1;

    .line 27
    .line 28
    invoke-direct {v3, v2}, Lio/ktor/util/DeflaterKt$deflateTo$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v5, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x5

    .line 38
    const/4 v7, 0x4

    .line 39
    const/4 v8, 0x3

    .line 40
    const/4 v9, 0x2

    .line 41
    const/4 v10, 0x0

    .line 42
    const/4 v11, 0x1

    .line 43
    if-eqz v5, :cond_6

    .line 44
    .line 45
    if-eq v5, v11, :cond_5

    .line 46
    .line 47
    if-eq v5, v9, :cond_4

    .line 48
    .line 49
    if-eq v5, v8, :cond_3

    .line 50
    .line 51
    if-eq v5, v7, :cond_2

    .line 52
    .line 53
    if-ne v5, v6, :cond_1

    .line 54
    .line 55
    iget-object v0, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$3:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v1, v0

    .line 58
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    iget-object v0, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$2:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v4, v0

    .line 63
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 64
    .line 65
    iget-object v0, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$1:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v5, v0

    .line 68
    check-cast v5, Ljava/util/zip/Deflater;

    .line 69
    .line 70
    iget-object v0, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$0:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v3, v0

    .line 73
    check-cast v3, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 74
    .line 75
    :try_start_0
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    goto/16 :goto_9

    .line 79
    .line 80
    :catchall_0
    move-exception v0

    .line 81
    move-object v6, v1

    .line 82
    move-object v1, v3

    .line 83
    goto/16 :goto_a

    .line 84
    .line 85
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 86
    .line 87
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v10

    .line 91
    :cond_2
    iget-boolean v0, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->Z$0:Z

    .line 92
    .line 93
    iget-object v1, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$5:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 96
    .line 97
    iget-object v5, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$4:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 100
    .line 101
    iget-object v7, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$3:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v7, Ljava/util/zip/Deflater;

    .line 104
    .line 105
    iget-object v8, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$2:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v8, Ljava/util/zip/CRC32;

    .line 108
    .line 109
    iget-object v9, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$1:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v9, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 112
    .line 113
    iget-object v11, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v11, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 116
    .line 117
    :try_start_1
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 118
    .line 119
    .line 120
    move-object v6, v1

    .line 121
    move-object v2, v5

    .line 122
    move-object v5, v7

    .line 123
    move-object v1, v9

    .line 124
    goto/16 :goto_7

    .line 125
    .line 126
    :catchall_1
    move-exception v0

    .line 127
    move-object v6, v1

    .line 128
    move-object v4, v5

    .line 129
    move-object v5, v7

    .line 130
    move-object v1, v9

    .line 131
    goto/16 :goto_a

    .line 132
    .line 133
    :cond_3
    iget-boolean v0, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->Z$0:Z

    .line 134
    .line 135
    iget-object v1, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$6:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 138
    .line 139
    iget-object v5, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$5:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 142
    .line 143
    iget-object v12, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$4:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v12, Ljava/util/zip/Deflater;

    .line 146
    .line 147
    iget-object v13, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$3:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v13, Ljava/util/zip/CRC32;

    .line 150
    .line 151
    iget-object v14, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$2:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v14, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 154
    .line 155
    iget-object v15, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$1:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v15, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 158
    .line 159
    iget-object v6, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$0:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v6, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 162
    .line 163
    :try_start_2
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 164
    .line 165
    .line 166
    move-object v2, v5

    .line 167
    move-object v5, v12

    .line 168
    move-object v12, v13

    .line 169
    move-object v13, v6

    .line 170
    move-object v6, v1

    .line 171
    move-object v1, v14

    .line 172
    move-object v14, v15

    .line 173
    goto/16 :goto_6

    .line 174
    .line 175
    :catchall_2
    move-exception v0

    .line 176
    move-object v6, v1

    .line 177
    move-object v4, v5

    .line 178
    move-object v5, v12

    .line 179
    :goto_1
    move-object v1, v14

    .line 180
    goto/16 :goto_a

    .line 181
    .line 182
    :cond_4
    iget-boolean v0, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->Z$0:Z

    .line 183
    .line 184
    iget-object v1, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$6:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 187
    .line 188
    iget-object v5, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$5:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 191
    .line 192
    iget-object v6, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$4:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v6, Ljava/util/zip/Deflater;

    .line 195
    .line 196
    iget-object v12, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$3:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v12, Ljava/util/zip/CRC32;

    .line 199
    .line 200
    iget-object v13, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$2:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v13, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 203
    .line 204
    iget-object v14, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$1:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v14, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 207
    .line 208
    iget-object v15, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$0:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v15, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 211
    .line 212
    :try_start_3
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 213
    .line 214
    .line 215
    move-object/from16 v18, v12

    .line 216
    .line 217
    move-object v12, v1

    .line 218
    move-object v1, v13

    .line 219
    move-object/from16 v13, v18

    .line 220
    .line 221
    goto/16 :goto_5

    .line 222
    .line 223
    :catchall_3
    move-exception v0

    .line 224
    move-object v4, v5

    .line 225
    move-object v5, v6

    .line 226
    move-object v6, v1

    .line 227
    move-object v1, v13

    .line 228
    goto/16 :goto_a

    .line 229
    .line 230
    :cond_5
    iget-boolean v0, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->Z$0:Z

    .line 231
    .line 232
    iget-object v1, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$6:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 235
    .line 236
    iget-object v5, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$5:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 239
    .line 240
    iget-object v6, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$4:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v6, Ljava/util/zip/Deflater;

    .line 243
    .line 244
    iget-object v12, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$3:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v12, Ljava/util/zip/CRC32;

    .line 247
    .line 248
    iget-object v13, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$2:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v13, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 251
    .line 252
    iget-object v14, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$1:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v14, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 255
    .line 256
    iget-object v15, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$0:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v15, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 259
    .line 260
    :try_start_4
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 261
    .line 262
    .line 263
    move-object v2, v6

    .line 264
    move-object v6, v1

    .line 265
    move-object v1, v13

    .line 266
    move-object v13, v15

    .line 267
    goto :goto_2

    .line 268
    :cond_6
    invoke-static {v2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    new-instance v12, Ljava/util/zip/CRC32;

    .line 272
    .line 273
    invoke-direct {v12}, Ljava/util/zip/CRC32;-><init>()V

    .line 274
    .line 275
    .line 276
    new-instance v5, Ljava/util/zip/Deflater;

    .line 277
    .line 278
    const/4 v2, -0x1

    .line 279
    invoke-direct {v5, v2, v11}, Ljava/util/zip/Deflater;-><init>(IZ)V

    .line 280
    .line 281
    .line 282
    invoke-interface/range {p3 .. p3}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 287
    .line 288
    invoke-interface/range {p3 .. p3}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 293
    .line 294
    if-eqz v1, :cond_8

    .line 295
    .line 296
    move-object/from16 v13, p0

    .line 297
    .line 298
    :try_start_5
    iput-object v13, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$0:Ljava/lang/Object;

    .line 299
    .line 300
    iput-object v0, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$1:Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 301
    .line 302
    move-object/from16 v14, p3

    .line 303
    .line 304
    :try_start_6
    iput-object v14, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$2:Ljava/lang/Object;

    .line 305
    .line 306
    iput-object v12, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$3:Ljava/lang/Object;

    .line 307
    .line 308
    iput-object v5, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$4:Ljava/lang/Object;

    .line 309
    .line 310
    iput-object v2, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$5:Ljava/lang/Object;

    .line 311
    .line 312
    iput-object v6, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$6:Ljava/lang/Object;

    .line 313
    .line 314
    iput-boolean v1, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->Z$0:Z

    .line 315
    .line 316
    iput v11, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->label:I

    .line 317
    .line 318
    invoke-static {v0, v3}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v15
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 322
    if-ne v15, v4, :cond_7

    .line 323
    .line 324
    goto/16 :goto_8

    .line 325
    .line 326
    :cond_7
    move-object/from16 v18, v14

    .line 327
    .line 328
    move-object v14, v0

    .line 329
    move v0, v1

    .line 330
    move-object/from16 v1, v18

    .line 331
    .line 332
    move-object/from16 v18, v5

    .line 333
    .line 334
    move-object v5, v2

    .line 335
    move-object/from16 v2, v18

    .line 336
    .line 337
    :goto_2
    move-object/from16 v18, v5

    .line 338
    .line 339
    move-object v5, v2

    .line 340
    move-object/from16 v2, v18

    .line 341
    .line 342
    goto :goto_4

    .line 343
    :catchall_4
    move-exception v0

    .line 344
    :goto_3
    move-object v4, v2

    .line 345
    goto/16 :goto_1

    .line 346
    .line 347
    :catchall_5
    move-exception v0

    .line 348
    move-object/from16 v14, p3

    .line 349
    .line 350
    goto :goto_3

    .line 351
    :cond_8
    move-object/from16 v13, p0

    .line 352
    .line 353
    move-object/from16 v14, p3

    .line 354
    .line 355
    move-object/from16 v18, v14

    .line 356
    .line 357
    move-object v14, v0

    .line 358
    move v0, v1

    .line 359
    move-object/from16 v1, v18

    .line 360
    .line 361
    :goto_4
    :try_start_7
    invoke-interface {v13}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 362
    .line 363
    .line 364
    move-result v15

    .line 365
    if-nez v15, :cond_d

    .line 366
    .line 367
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 368
    .line 369
    .line 370
    iput-object v13, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$0:Ljava/lang/Object;

    .line 371
    .line 372
    iput-object v14, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$1:Ljava/lang/Object;

    .line 373
    .line 374
    iput-object v1, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$2:Ljava/lang/Object;

    .line 375
    .line 376
    iput-object v12, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$3:Ljava/lang/Object;

    .line 377
    .line 378
    iput-object v5, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$4:Ljava/lang/Object;

    .line 379
    .line 380
    iput-object v2, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$5:Ljava/lang/Object;

    .line 381
    .line 382
    iput-object v6, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$6:Ljava/lang/Object;

    .line 383
    .line 384
    iput-boolean v0, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->Z$0:Z

    .line 385
    .line 386
    iput v9, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->label:I

    .line 387
    .line 388
    invoke-static {v13, v2, v3}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v15
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 392
    if-ne v15, v4, :cond_9

    .line 393
    .line 394
    goto/16 :goto_8

    .line 395
    .line 396
    :cond_9
    move-object/from16 v18, v5

    .line 397
    .line 398
    move-object v5, v2

    .line 399
    move-object v2, v15

    .line 400
    move-object v15, v13

    .line 401
    move-object v13, v12

    .line 402
    move-object v12, v6

    .line 403
    move-object/from16 v6, v18

    .line 404
    .line 405
    :goto_5
    :try_start_8
    check-cast v2, Ljava/lang/Number;

    .line 406
    .line 407
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    if-lez v2, :cond_c

    .line 412
    .line 413
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 414
    .line 415
    .line 416
    invoke-static {v13, v5}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏(Ljava/util/zip/Checksum;Ljava/nio/ByteBuffer;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    if-eqz v2, :cond_b

    .line 424
    .line 425
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 430
    .line 431
    .line 432
    move-result v16

    .line 433
    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    .line 434
    .line 435
    .line 436
    move-result v17

    .line 437
    add-int v9, v17, v16

    .line 438
    .line 439
    invoke-virtual {v5}, Ljava/nio/Buffer;->remaining()I

    .line 440
    .line 441
    .line 442
    move-result v7

    .line 443
    invoke-virtual {v6, v2, v9, v7}, Ljava/util/zip/Deflater;->setInput([BII)V

    .line 444
    .line 445
    .line 446
    new-instance v2, Lio/ktor/util/飘花落叶言子楪苏哲世兰;

    .line 447
    .line 448
    const/4 v7, 0x0

    .line 449
    invoke-direct {v2, v6, v7}, Lio/ktor/util/飘花落叶言子楪苏哲世兰;-><init>(Ljava/util/zip/Deflater;I)V

    .line 450
    .line 451
    .line 452
    iput-object v15, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$0:Ljava/lang/Object;

    .line 453
    .line 454
    iput-object v14, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$1:Ljava/lang/Object;

    .line 455
    .line 456
    iput-object v1, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$2:Ljava/lang/Object;

    .line 457
    .line 458
    iput-object v13, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$3:Ljava/lang/Object;

    .line 459
    .line 460
    iput-object v6, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$4:Ljava/lang/Object;

    .line 461
    .line 462
    iput-object v5, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$5:Ljava/lang/Object;

    .line 463
    .line 464
    iput-object v12, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$6:Ljava/lang/Object;

    .line 465
    .line 466
    iput-boolean v0, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->Z$0:Z

    .line 467
    .line 468
    iput v8, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->label:I

    .line 469
    .line 470
    invoke-static {v14, v6, v12, v2, v3}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    if-ne v2, v4, :cond_a

    .line 475
    .line 476
    goto/16 :goto_8

    .line 477
    .line 478
    :cond_a
    move-object v2, v5

    .line 479
    move-object v5, v6

    .line 480
    move-object v6, v12

    .line 481
    move-object v12, v13

    .line 482
    move-object v13, v15

    .line 483
    :goto_6
    const/4 v7, 0x4

    .line 484
    const/4 v9, 0x2

    .line 485
    goto :goto_4

    .line 486
    :catchall_6
    move-exception v0

    .line 487
    move-object v4, v5

    .line 488
    move-object v5, v6

    .line 489
    move-object v6, v12

    .line 490
    goto/16 :goto_a

    .line 491
    .line 492
    :cond_b
    const-string v0, "buffer need to be array-backed"

    .line 493
    .line 494
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 495
    .line 496
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 500
    :cond_c
    move-object v2, v5

    .line 501
    move-object v5, v6

    .line 502
    move-object v6, v12

    .line 503
    move-object v12, v13

    .line 504
    move-object v13, v15

    .line 505
    goto/16 :goto_4

    .line 506
    .line 507
    :catchall_7
    move-exception v0

    .line 508
    move-object v4, v2

    .line 509
    goto :goto_a

    .line 510
    :cond_d
    :try_start_9
    invoke-interface {v13}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Throwable;

    .line 511
    .line 512
    .line 513
    move-result-object v7

    .line 514
    if-nez v7, :cond_11

    .line 515
    .line 516
    invoke-virtual {v5}, Ljava/util/zip/Deflater;->finish()V

    .line 517
    .line 518
    .line 519
    new-instance v7, Lio/ktor/util/飘花落叶言子楪苏哲世兰;

    .line 520
    .line 521
    invoke-direct {v7, v5, v11}, Lio/ktor/util/飘花落叶言子楪苏哲世兰;-><init>(Ljava/util/zip/Deflater;I)V

    .line 522
    .line 523
    .line 524
    iput-object v14, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$0:Ljava/lang/Object;

    .line 525
    .line 526
    iput-object v1, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$1:Ljava/lang/Object;

    .line 527
    .line 528
    iput-object v12, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$2:Ljava/lang/Object;

    .line 529
    .line 530
    iput-object v5, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$3:Ljava/lang/Object;

    .line 531
    .line 532
    iput-object v2, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$4:Ljava/lang/Object;

    .line 533
    .line 534
    iput-object v6, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$5:Ljava/lang/Object;

    .line 535
    .line 536
    iput-object v10, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$6:Ljava/lang/Object;

    .line 537
    .line 538
    iput-boolean v0, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->Z$0:Z

    .line 539
    .line 540
    const/4 v8, 0x4

    .line 541
    iput v8, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->label:I

    .line 542
    .line 543
    invoke-static {v14, v5, v6, v7, v3}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v7

    .line 547
    if-ne v7, v4, :cond_e

    .line 548
    .line 549
    goto :goto_8

    .line 550
    :cond_e
    move-object v8, v12

    .line 551
    move-object v11, v14

    .line 552
    :goto_7
    if-eqz v0, :cond_10

    .line 553
    .line 554
    iput-object v1, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$0:Ljava/lang/Object;

    .line 555
    .line 556
    iput-object v5, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$1:Ljava/lang/Object;

    .line 557
    .line 558
    iput-object v2, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$2:Ljava/lang/Object;

    .line 559
    .line 560
    iput-object v6, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$3:Ljava/lang/Object;

    .line 561
    .line 562
    iput-object v10, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$4:Ljava/lang/Object;

    .line 563
    .line 564
    iput-object v10, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->L$5:Ljava/lang/Object;

    .line 565
    .line 566
    const/4 v0, 0x5

    .line 567
    iput v0, v3, Lio/ktor/util/DeflaterKt$deflateTo$1;->label:I

    .line 568
    .line 569
    invoke-static {v11, v8, v5, v3}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/util/zip/CRC32;Ljava/util/zip/Deflater;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 573
    if-ne v0, v4, :cond_f

    .line 574
    .line 575
    :goto_8
    return-object v4

    .line 576
    :cond_f
    move-object v3, v1

    .line 577
    move-object v4, v2

    .line 578
    move-object v1, v6

    .line 579
    :goto_9
    move-object v6, v1

    .line 580
    move-object v1, v3

    .line 581
    move-object v2, v4

    .line 582
    :cond_10
    invoke-virtual {v5}, Ljava/util/zip/Deflater;->end()V

    .line 583
    .line 584
    .line 585
    invoke-interface {v1, v2}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子世兰哲楪苏(Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    invoke-interface {v1, v6}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子世兰哲楪苏(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 592
    .line 593
    return-object v0

    .line 594
    :cond_11
    :try_start_a
    throw v7
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 595
    :goto_a
    invoke-virtual {v5}, Ljava/util/zip/Deflater;->end()V

    .line 596
    .line 597
    .line 598
    invoke-interface {v1, v4}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子世兰哲楪苏(Ljava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    invoke-interface {v1, v6}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子世兰哲楪苏(Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    throw v0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Z)Lio/ktor/util/飘花落叶言子楪世兰哲苏;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance p0, Lio/ktor/util/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, v0}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance p0, Lio/ktor/util/飘花落叶言子楪世兰哲苏;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, v0}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public static final 飘花落叶言子楪哲世兰苏(Ljava/lang/String;)[C
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [C

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    aput-char v3, v1, v2

    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-object v1
.end method

.method public static final 飘花落叶言子楪哲世苏兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/util/zip/CRC32;Ljava/util/zip/Deflater;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    iget-object p0, v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;->L$1:Ljava/lang/Object;

    .line 51
    .line 52
    move-object p2, p0

    .line 53
    check-cast p2, Ljava/util/zip/Deflater;

    .line 54
    .line 55
    iget-object p0, v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 58
    .line 59
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/zip/Checksum;->getValue()J

    .line 67
    .line 68
    .line 69
    move-result-wide v6

    .line 70
    long-to-int p1, v6

    .line 71
    invoke-static {p1}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iput-object p0, v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p2, v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    iput v5, v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;->label:I

    .line 80
    .line 81
    invoke-static {p0, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v1, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_1
    invoke-virtual {p2}, Ljava/util/zip/Deflater;->getTotalIn()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    invoke-static {p1}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    iput-object v3, v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;->L$0:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object v3, v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;->L$1:Ljava/lang/Object;

    .line 99
    .line 100
    iput v4, v0, Lio/ktor/util/DeflaterKt$putGzipTrailer$1;->label:I

    .line 101
    .line 102
    invoke-static {p0, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-ne p0, v1, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v1

    .line 109
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 110
    .line 111
    return-object p0
.end method

.method public static final 飘花落叶言子楪哲兰世苏(Ljava/util/zip/Checksum;Ljava/nio/ByteBuffer;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr v2, v1

    .line 26
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-interface {p0, v0, v2, p1}, Ljava/util/zip/Checksum;->update([BII)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const-string p0, "buffer need to be array-backed"

    .line 35
    .line 36
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static final 飘花落叶言子楪哲苏世兰(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    const/16 v3, 0x80

    .line 8
    .line 9
    const/16 v4, 0x5b

    .line 10
    .line 11
    const/16 v5, 0x41

    .line 12
    .line 13
    const/4 v6, -0x1

    .line 14
    if-ge v2, v0, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    if-gt v5, v7, :cond_0

    .line 21
    .line 22
    if-ge v7, v4, :cond_0

    .line 23
    .line 24
    add-int/lit8 v8, v7, 0x20

    .line 25
    .line 26
    int-to-char v8, v8

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    if-ltz v7, :cond_1

    .line 29
    .line 30
    if-ge v7, v3, :cond_1

    .line 31
    .line 32
    move v8, v7

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {v7}, Ljava/lang/Character;->toLowerCase(C)C

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    :goto_1
    if-eq v8, v7, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    move v2, v6

    .line 45
    :goto_2
    if-ne v2, v6, :cond_4

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    new-instance v6, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, p0, v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    add-int/lit8 v0, v0, -0x1

    .line 65
    .line 66
    if-gt v2, v0, :cond_7

    .line 67
    .line 68
    :goto_3
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-gt v5, v1, :cond_5

    .line 73
    .line 74
    if-ge v1, v4, :cond_5

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x20

    .line 77
    .line 78
    int-to-char v1, v1

    .line 79
    goto :goto_4

    .line 80
    :cond_5
    if-ltz v1, :cond_6

    .line 81
    .line 82
    if-ge v1, v3, :cond_6

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    :goto_4
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    if-eq v2, v0, :cond_7

    .line 93
    .line 94
    add-int/lit8 v2, v2, 0x1

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_7
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0
.end method

.method public static final 飘花落叶言子楪哲苏兰世(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    const/16 v3, 0x80

    .line 11
    .line 12
    const/16 v4, 0x7b

    .line 13
    .line 14
    const/16 v5, 0x61

    .line 15
    .line 16
    const/4 v6, -0x1

    .line 17
    if-ge v2, v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    if-gt v5, v7, :cond_0

    .line 24
    .line 25
    if-ge v7, v4, :cond_0

    .line 26
    .line 27
    add-int/lit8 v8, v7, -0x20

    .line 28
    .line 29
    int-to-char v8, v8

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    if-ltz v7, :cond_1

    .line 32
    .line 33
    if-ge v7, v3, :cond_1

    .line 34
    .line 35
    move v8, v7

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {v7}, Ljava/lang/Character;->toLowerCase(C)C

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    :goto_1
    if-eq v8, v7, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    move v2, v6

    .line 48
    :goto_2
    if-ne v2, v6, :cond_4

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    new-instance v6, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, p0, v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    add-int/lit8 v0, v0, -0x1

    .line 68
    .line 69
    if-gt v2, v0, :cond_7

    .line 70
    .line 71
    :goto_3
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-gt v5, v1, :cond_5

    .line 76
    .line 77
    if-ge v1, v4, :cond_5

    .line 78
    .line 79
    add-int/lit8 v1, v1, -0x20

    .line 80
    .line 81
    int-to-char v1, v1

    .line 82
    goto :goto_4

    .line 83
    :cond_5
    if-ltz v1, :cond_6

    .line 84
    .line 85
    if-ge v1, v3, :cond_6

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    :goto_4
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    if-eq v2, v0, :cond_7

    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_7
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏世兰哲(I)[B
    .locals 4

    .line 1
    sget-object v0, Lio/ktor/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[C

    .line 2
    .line 3
    new-instance v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    :goto_0
    iget-wide v1, v0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 9
    .line 10
    long-to-int v1, v1

    .line 11
    if-ge v1, p0, :cond_1

    .line 12
    .line 13
    sget-object v1, Lio/ktor/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 14
    .line 15
    invoke-virtual {v1}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    sget-object v1, Lio/ktor/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 29
    .line 30
    invoke-virtual {v1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->start()Z

    .line 31
    .line 32
    .line 33
    new-instance v1, Lio/ktor/util/CryptoKt__CryptoJvmKt$generateNonceBlocking$1;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, v2}, Lio/ktor/util/CryptoKt__CryptoJvmKt$generateNonceBlocking$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 37
    .line 38
    .line 39
    sget-object v2, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 40
    .line 41
    invoke-static {v2, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏楪哲兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    :goto_1
    const/4 v2, 0x0

    .line 48
    const/16 v3, 0xe

    .line 49
    .line 50
    invoke-static {v0, v1, v2, v3}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lkotlinx/io/飘花落叶言子楪世苏哲兰;Ljava/lang/CharSequence;II)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-static {v0, p0}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲兰世(Lkotlinx/io/飘花落叶言子楪苏兰世哲;I)[B

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static 飘花落叶言子楪苏世哲兰(Lio/ktor/util/飘花落叶言子楪哲苏世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Lio/ktor/util/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {p1, v1, v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method

.method public static final 飘花落叶言子楪苏兰世哲(Lio/ktor/util/飘花落叶言子楪世兰哲苏;Lio/ktor/util/飘花落叶言子楪世兰哲苏;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰苏哲世楪(Ljava/lang/Iterable;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v1}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Lio/ktor/util/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p0, v1, v2}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Lio/ktor/util/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-void
.end method

.method public static final 飘花落叶言子楪苏兰哲世(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lio/ktor/util/DeflaterKt$putGzipHeader$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/util/DeflaterKt$putGzipHeader$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v6, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    iget-object p0, v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    iget-object p0, v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 64
    .line 65
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const/16 p1, -0x74e1

    .line 73
    .line 74
    invoke-static {p1}, Ljava/lang/Short;->reverseBytes(S)S

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    iput-object p0, v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    iput v6, v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;->label:I

    .line 81
    .line 82
    invoke-static {p0, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;SLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v1, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    :goto_1
    iput-object p0, v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;->L$0:Ljava/lang/Object;

    .line 90
    .line 91
    iput v5, v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;->label:I

    .line 92
    .line 93
    const/16 p1, 0x8

    .line 94
    .line 95
    invoke-static {p0, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;BLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-ne p1, v1, :cond_6

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    :goto_2
    iput-object v3, v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;->L$0:Ljava/lang/Object;

    .line 103
    .line 104
    iput v4, v0, Lio/ktor/util/DeflaterKt$putGzipHeader$1;->label:I

    .line 105
    .line 106
    const/4 p1, 0x0

    .line 107
    const/4 v2, 0x7

    .line 108
    sget-object v3, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:[B

    .line 109
    .line 110
    invoke-static {p0, v3, p1, v2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;[BIILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-ne p0, v1, :cond_7

    .line 115
    .line 116
    :goto_3
    return-object v1

    .line 117
    :cond_7
    :goto_4
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 118
    .line 119
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏哲世兰([B)Ljava/lang/String;
    .locals 8

    .line 1
    sget-object v0, Lio/ktor/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[C

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    array-length v0, p0

    .line 7
    mul-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    new-array v0, v0, [C

    .line 10
    .line 11
    sget-object v1, Lio/ktor/util/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[C

    .line 12
    .line 13
    array-length v2, p0

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v3, v2, :cond_0

    .line 17
    .line 18
    aget-byte v5, p0, v3

    .line 19
    .line 20
    and-int/lit16 v6, v5, 0xff

    .line 21
    .line 22
    add-int/lit8 v7, v4, 0x1

    .line 23
    .line 24
    shr-int/lit8 v6, v6, 0x4

    .line 25
    .line 26
    aget-char v6, v1, v6

    .line 27
    .line 28
    aput-char v6, v0, v4

    .line 29
    .line 30
    add-int/lit8 v4, v4, 0x2

    .line 31
    .line 32
    and-int/lit8 v5, v5, 0xf

    .line 33
    .line 34
    aget-char v5, v1, v5

    .line 35
    .line 36
    aput-char v5, v0, v7

    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 44
    .line 45
    .line 46
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏哲兰世(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ne p2, v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    return p2

    .line 33
    :cond_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v1, p2

    .line 42
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 49
    .line 50
    .line 51
    return p2
.end method
