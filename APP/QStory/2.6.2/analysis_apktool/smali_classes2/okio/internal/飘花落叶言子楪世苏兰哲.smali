.class public abstract Lokio/internal/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lokio/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Lokio/SegmentedByteString;I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getDirectory$okio()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    invoke-virtual {p0}, Lokio/SegmentedByteString;->getSegments$okio()[[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    array-length p0, p0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    add-int/lit8 p0, p0, -0x1

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-gt v1, p0, :cond_1

    .line 19
    .line 20
    add-int v2, v1, p0

    .line 21
    .line 22
    ushr-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    aget v3, v0, v2

    .line 25
    .line 26
    if-ge v3, p1, :cond_0

    .line 27
    .line 28
    add-int/lit8 v1, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    if-le v3, p1, :cond_2

    .line 32
    .line 33
    add-int/lit8 p0, v2, -0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    neg-int p0, v1

    .line 37
    add-int/lit8 v2, p0, -0x1

    .line 38
    .line 39
    :cond_2
    if-ltz v2, :cond_3

    .line 40
    .line 41
    return v2

    .line 42
    :cond_3
    not-int p0, v2

    .line 43
    return p0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;Lkotlin/collections/飘花落叶言子楪苏兰哲世;ZZLkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p4, Lokio/internal/-FileSystem$collectRecursively$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lokio/internal/-FileSystem$collectRecursively$1;

    .line 7
    .line 8
    iget v1, v0, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

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
    iput v1, v0, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lokio/internal/-FileSystem$collectRecursively$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lokio/internal/-FileSystem$collectRecursively$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lokio/internal/-FileSystem$collectRecursively$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_10

    .line 34
    .line 35
    if-eq v2, v4, :cond_d

    .line 36
    .line 37
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 38
    .line 39
    const/4 p1, 0x3

    .line 40
    const/4 p2, 0x2

    .line 41
    if-eq v2, p2, :cond_4

    .line 42
    .line 43
    if-ne v2, p1, :cond_3

    .line 44
    .line 45
    iget-object p1, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$4:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/util/List;

    .line 48
    .line 49
    iget-object p1, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 50
    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    iget-object p1, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 56
    .line 57
    iget-object p1, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 58
    .line 59
    if-nez p1, :cond_1

    .line 60
    .line 61
    iget-object p1, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;

    .line 64
    .line 65
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 70
    .line 71
    .line 72
    return-object v3

    .line 73
    :cond_2
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 74
    .line 75
    .line 76
    return-object v3

    .line 77
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v3

    .line 83
    :cond_4
    iget p3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->I$0:I

    .line 84
    .line 85
    iget-boolean v2, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$1:Z

    .line 86
    .line 87
    iget-boolean v4, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$0:Z

    .line 88
    .line 89
    iget-object v5, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$7:Ljava/lang/Object;

    .line 90
    .line 91
    if-nez v5, :cond_c

    .line 92
    .line 93
    iget-object v5, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$6:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v5, Ljava/util/Iterator;

    .line 96
    .line 97
    iget-object v6, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$5:Ljava/lang/Object;

    .line 98
    .line 99
    if-nez v6, :cond_b

    .line 100
    .line 101
    iget-object v6, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$4:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v6, Ljava/util/List;

    .line 104
    .line 105
    iget-object v6, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 106
    .line 107
    if-nez v6, :cond_a

    .line 108
    .line 109
    iget-object v6, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v6, Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 112
    .line 113
    iget-object v7, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 114
    .line 115
    if-nez v7, :cond_9

    .line 116
    .line 117
    iget-object v7, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v7, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;

    .line 120
    .line 121
    :try_start_0
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result p4

    .line 128
    if-eqz p4, :cond_7

    .line 129
    .line 130
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p4

    .line 134
    if-nez p4, :cond_6

    .line 135
    .line 136
    iput-object v7, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 137
    .line 138
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 139
    .line 140
    iput-object v6, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$4:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$5:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object v5, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$6:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$7:Ljava/lang/Object;

    .line 151
    .line 152
    iput-boolean v4, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$0:Z

    .line 153
    .line 154
    iput-boolean v2, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$1:Z

    .line 155
    .line 156
    iput p3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->I$0:I

    .line 157
    .line 158
    iput p2, v0, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 159
    .line 160
    invoke-static {v7, v6, v4, v2, v0}, Lokio/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;Lkotlin/collections/飘花落叶言子楪苏兰哲世;ZZLkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p4

    .line 164
    if-ne p4, v1, :cond_5

    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :catchall_0
    move-exception p0

    .line 169
    goto :goto_1

    .line 170
    :cond_6
    new-instance p0, Ljava/lang/ClassCastException;

    .line 171
    .line 172
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 173
    .line 174
    .line 175
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    :cond_7
    invoke-virtual {v6}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->removeLast()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    if-eqz v2, :cond_8

    .line 180
    .line 181
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 182
    .line 183
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$4:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$5:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$6:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$7:Ljava/lang/Object;

    .line 196
    .line 197
    iput-boolean v4, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$0:Z

    .line 198
    .line 199
    iput-boolean v2, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$1:Z

    .line 200
    .line 201
    iput p1, v0, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 202
    .line 203
    invoke-virtual {v7, v3, v0}, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    if-ne p1, v1, :cond_8

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_8
    return-object p0

    .line 211
    :goto_1
    invoke-virtual {v6}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->removeLast()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    throw p0

    .line 215
    :cond_9
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 216
    .line 217
    .line 218
    return-object v3

    .line 219
    :cond_a
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 220
    .line 221
    .line 222
    return-object v3

    .line 223
    :cond_b
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 224
    .line 225
    .line 226
    return-object v3

    .line 227
    :cond_c
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 228
    .line 229
    .line 230
    return-object v3

    .line 231
    :cond_d
    iget-object p0, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 232
    .line 233
    if-nez p0, :cond_f

    .line 234
    .line 235
    iget-object p0, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast p0, Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 238
    .line 239
    iget-object p0, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 240
    .line 241
    if-eqz p0, :cond_e

    .line 242
    .line 243
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 244
    .line 245
    .line 246
    return-object v3

    .line 247
    :cond_e
    iget-object p0, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p0, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;

    .line 250
    .line 251
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_f
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 256
    .line 257
    .line 258
    return-object v3

    .line 259
    :cond_10
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    if-nez p3, :cond_11

    .line 263
    .line 264
    iput-object p0, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$0:Ljava/lang/Object;

    .line 265
    .line 266
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$1:Ljava/lang/Object;

    .line 267
    .line 268
    iput-object p1, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$2:Ljava/lang/Object;

    .line 269
    .line 270
    iput-object v3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->L$3:Ljava/lang/Object;

    .line 271
    .line 272
    iput-boolean p2, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$0:Z

    .line 273
    .line 274
    iput-boolean p3, v0, Lokio/internal/-FileSystem$collectRecursively$1;->Z$1:Z

    .line 275
    .line 276
    iput v4, v0, Lokio/internal/-FileSystem$collectRecursively$1;->label:I

    .line 277
    .line 278
    invoke-virtual {p0, v3, v0}, Lkotlin/sequences/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    if-ne p0, v1, :cond_11

    .line 283
    .line 284
    :goto_2
    return-object v1

    .line 285
    :cond_11
    :goto_3
    throw v3
.end method

.method public static final 飘花落叶言子楪世苏哲兰(C)I
    .locals 2

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x3a

    .line 6
    .line 7
    if-ge p0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr p0, v0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 v0, 0x61

    .line 12
    .line 13
    if-gt v0, p0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x67

    .line 16
    .line 17
    if-ge p0, v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 p0, p0, -0x57

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    const/16 v0, 0x41

    .line 23
    .line 24
    if-gt v0, p0, :cond_2

    .line 25
    .line 26
    const/16 v0, 0x47

    .line 27
    .line 28
    if-ge p0, v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 p0, p0, -0x37

    .line 31
    .line 32
    return p0

    .line 33
    :cond_2
    const-string v0, "Unexpected hex digit: "

    .line 34
    .line 35
    invoke-static {p0, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return p0
.end method
