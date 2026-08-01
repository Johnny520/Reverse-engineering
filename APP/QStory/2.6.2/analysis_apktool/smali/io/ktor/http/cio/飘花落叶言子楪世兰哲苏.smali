.class public abstract Lio/ktor/http/cio/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:[B

.field public static final 飘花落叶言子楪世苏兰哲:[B

.field public static final 飘花落叶言子楪世苏哲兰:Lio/ktor/http/cio/飘花落叶言子楪世兰苏哲;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/ktor/http/cio/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    const/16 v1, 0x800

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/ktor/http/cio/飘花落叶言子楪世兰苏哲;-><init>(II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/ktor/http/cio/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/http/cio/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    sget-object v0, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 12
    .line 13
    const-string v1, "\r\n"

    .line 14
    .line 15
    invoke-static {v1, v0}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sput-object v1, Lio/ktor/http/cio/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:[B

    .line 20
    .line 21
    const-string v1, "0\r\n\r\n"

    .line 22
    .line 23
    invoke-static {v1, v0}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lio/ktor/http/cio/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:[B

    .line 28
    .line 29
    return-void
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    instance-of v1, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;

    .line 9
    .line 10
    iget v2, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->label:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x5

    .line 35
    const/4 v6, 0x4

    .line 36
    const/4 v7, 0x3

    .line 37
    const/4 v8, 0x2

    .line 38
    const/4 v9, 0x1

    .line 39
    const/4 v10, 0x0

    .line 40
    if-eqz v3, :cond_6

    .line 41
    .line 42
    if-eq v3, v9, :cond_5

    .line 43
    .line 44
    if-eq v3, v8, :cond_4

    .line 45
    .line 46
    if-eq v3, v7, :cond_3

    .line 47
    .line 48
    if-eq v3, v6, :cond_2

    .line 49
    .line 50
    if-eq v3, v5, :cond_1

    .line 51
    .line 52
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v10

    .line 58
    :cond_1
    iget-object v1, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/lang/Throwable;

    .line 61
    .line 62
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_d

    .line 66
    .line 67
    :cond_2
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_a

    .line 71
    .line 72
    :cond_3
    iget-object v3, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$1:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 75
    .line 76
    iget-object v4, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 79
    .line 80
    :try_start_0
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    goto/16 :goto_9

    .line 84
    .line 85
    :catchall_0
    move-exception v0

    .line 86
    goto/16 :goto_b

    .line 87
    .line 88
    :cond_4
    iget-object v3, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$5:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v3, Lkotlin/jvm/internal/Ref$IntRef;

    .line 91
    .line 92
    iget-object v11, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$4:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v11, Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 95
    .line 96
    iget-object v12, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$3:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v12, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 99
    .line 100
    iget-object v13, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$2:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v13, Lkotlin/jvm/internal/Ref$IntRef;

    .line 103
    .line 104
    iget-object v14, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$1:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v14, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 107
    .line 108
    iget-object v15, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$0:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v15, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 111
    .line 112
    :try_start_1
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    .line 114
    .line 115
    goto/16 :goto_5

    .line 116
    .line 117
    :catchall_1
    move-exception v0

    .line 118
    move-object v3, v14

    .line 119
    move-object v4, v15

    .line 120
    goto/16 :goto_b

    .line 121
    .line 122
    :cond_5
    iget-object v3, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$2:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v3, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 125
    .line 126
    iget-object v11, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$1:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v11, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 129
    .line 130
    iget-object v12, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$0:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v12, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 133
    .line 134
    :try_start_2
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :catchall_2
    move-exception v0

    .line 139
    move-object v3, v11

    .line 140
    move-object v4, v12

    .line 141
    goto/16 :goto_b

    .line 142
    .line 143
    :cond_6
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    move-object/from16 v3, p1

    .line 147
    .line 148
    move-object v11, v1

    .line 149
    move-object/from16 v1, p0

    .line 150
    .line 151
    :cond_7
    :goto_1
    :try_start_3
    invoke-interface {v1}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_11

    .line 156
    .line 157
    invoke-interface {v1}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-nez v0, :cond_7

    .line 162
    .line 163
    invoke-interface {v1}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-interface {v0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_9

    .line 172
    .line 173
    iput-object v3, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$0:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v1, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$1:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v1, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$2:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v10, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$3:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v10, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$4:Ljava/lang/Object;

    .line 182
    .line 183
    iput-object v10, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$5:Ljava/lang/Object;

    .line 184
    .line 185
    iput v9, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->label:I

    .line 186
    .line 187
    invoke-interface {v1, v9, v11}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 191
    if-ne v0, v2, :cond_8

    .line 192
    .line 193
    goto/16 :goto_c

    .line 194
    .line 195
    :cond_8
    move-object v12, v3

    .line 196
    move-object v3, v1

    .line 197
    move-object v1, v11

    .line 198
    move-object v11, v3

    .line 199
    :goto_2
    move-object/from16 v16, v12

    .line 200
    .line 201
    move-object v12, v1

    .line 202
    move-object v1, v3

    .line 203
    move-object/from16 v3, v16

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :catchall_3
    move-exception v0

    .line 207
    move-object v4, v3

    .line 208
    move-object v3, v1

    .line 209
    move-object v1, v11

    .line 210
    goto/16 :goto_b

    .line 211
    .line 212
    :cond_9
    move-object v12, v11

    .line 213
    move-object v11, v1

    .line 214
    :goto_3
    :try_start_4
    invoke-interface {v1}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_10

    .line 219
    .line 220
    new-instance v0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 221
    .line 222
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-interface {v1}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-interface {v1}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v1}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏()Z

    .line 234
    .line 235
    .line 236
    move-result v13

    .line 237
    if-nez v13, :cond_f

    .line 238
    .line 239
    iget-object v13, v1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 240
    .line 241
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget-object v14, v13, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 245
    .line 246
    iget v15, v13, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 247
    .line 248
    iget v9, v13, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 249
    .line 250
    if-ne v9, v15, :cond_a

    .line 251
    .line 252
    new-instance v9, Ljava/lang/Integer;

    .line 253
    .line 254
    invoke-direct {v9, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 255
    .line 256
    .line 257
    move-object v14, v11

    .line 258
    move-object v11, v12

    .line 259
    move-object v12, v13

    .line 260
    move-object v13, v0

    .line 261
    goto :goto_6

    .line 262
    :goto_4
    move-object v4, v3

    .line 263
    move-object v3, v11

    .line 264
    move-object v1, v12

    .line 265
    goto/16 :goto_b

    .line 266
    .line 267
    :cond_a
    iput-object v3, v12, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$0:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v11, v12, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$1:Ljava/lang/Object;

    .line 270
    .line 271
    iput-object v0, v12, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$2:Ljava/lang/Object;

    .line 272
    .line 273
    iput-object v1, v12, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$3:Ljava/lang/Object;

    .line 274
    .line 275
    iput-object v13, v12, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$4:Ljava/lang/Object;

    .line 276
    .line 277
    iput-object v0, v12, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$5:Ljava/lang/Object;

    .line 278
    .line 279
    iput v8, v12, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->label:I

    .line 280
    .line 281
    invoke-static {v3, v14, v15, v9, v12}, Lio/ktor/http/cio/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;[BIILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 285
    if-ne v9, v2, :cond_b

    .line 286
    .line 287
    goto/16 :goto_c

    .line 288
    .line 289
    :cond_b
    move-object v14, v12

    .line 290
    move-object v12, v1

    .line 291
    move-object v1, v14

    .line 292
    move-object v15, v3

    .line 293
    move-object v14, v11

    .line 294
    move-object v11, v13

    .line 295
    move-object v3, v0

    .line 296
    move-object v13, v3

    .line 297
    move-object v0, v9

    .line 298
    :goto_5
    move-object v9, v11

    .line 299
    move-object v11, v1

    .line 300
    move-object v1, v12

    .line 301
    move-object v12, v9

    .line 302
    move-object v9, v0

    .line 303
    move-object v0, v3

    .line 304
    move-object v3, v15

    .line 305
    :goto_6
    :try_start_5
    check-cast v9, Ljava/lang/Number;

    .line 306
    .line 307
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 308
    .line 309
    .line 310
    move-result v9

    .line 311
    iput v9, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 312
    .line 313
    iget v0, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 314
    .line 315
    if-eqz v0, :cond_e

    .line 316
    .line 317
    if-ltz v0, :cond_d

    .line 318
    .line 319
    invoke-virtual {v12}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()I

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    if-gt v0, v9, :cond_c

    .line 324
    .line 325
    int-to-long v12, v0

    .line 326
    invoke-virtual {v1, v12, v13}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->skip(J)V

    .line 327
    .line 328
    .line 329
    goto :goto_7

    .line 330
    :catchall_4
    move-exception v0

    .line 331
    move-object v4, v3

    .line 332
    move-object v1, v11

    .line 333
    move-object v3, v14

    .line 334
    goto :goto_b

    .line 335
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 336
    .line 337
    const-string v1, "Returned too many bytes"

    .line 338
    .line 339
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    throw v0

    .line 343
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 344
    .line 345
    const-string v1, "Returned negative read bytes count"

    .line 346
    .line 347
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 351
    :cond_e
    :goto_7
    move-object v1, v14

    .line 352
    const/4 v9, 0x1

    .line 353
    goto/16 :goto_1

    .line 354
    .line 355
    :catchall_5
    move-exception v0

    .line 356
    goto :goto_4

    .line 357
    :cond_f
    :try_start_6
    const-string v0, "Buffer is empty"

    .line 358
    .line 359
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 360
    .line 361
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 365
    :cond_10
    move-object v1, v11

    .line 366
    move-object v11, v12

    .line 367
    goto/16 :goto_1

    .line 368
    .line 369
    :cond_11
    :try_start_7
    instance-of v0, v1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 370
    .line 371
    if-eqz v0, :cond_12

    .line 372
    .line 373
    move-object v0, v1

    .line 374
    check-cast v0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 375
    .line 376
    invoke-virtual {v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()Ljava/lang/Throwable;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    goto :goto_8

    .line 381
    :cond_12
    move-object v0, v10

    .line 382
    :goto_8
    if-nez v0, :cond_15

    .line 383
    .line 384
    sget-object v0, Lio/ktor/http/cio/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:[B

    .line 385
    .line 386
    iput-object v3, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$0:Ljava/lang/Object;

    .line 387
    .line 388
    iput-object v1, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$1:Ljava/lang/Object;

    .line 389
    .line 390
    iput-object v10, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$2:Ljava/lang/Object;

    .line 391
    .line 392
    iput-object v10, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$3:Ljava/lang/Object;

    .line 393
    .line 394
    iput-object v10, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$4:Ljava/lang/Object;

    .line 395
    .line 396
    iput-object v10, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$5:Ljava/lang/Object;

    .line 397
    .line 398
    iput v7, v11, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->label:I

    .line 399
    .line 400
    sget-object v7, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪哲兰世苏;

    .line 401
    .line 402
    array-length v7, v0

    .line 403
    invoke-static {v3, v0, v4, v7, v11}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;[BIILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 407
    if-ne v0, v2, :cond_13

    .line 408
    .line 409
    goto :goto_c

    .line 410
    :cond_13
    move-object v4, v3

    .line 411
    move-object v1, v11

    .line 412
    :goto_9
    iput-object v10, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$0:Ljava/lang/Object;

    .line 413
    .line 414
    iput-object v10, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$1:Ljava/lang/Object;

    .line 415
    .line 416
    iput v6, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->label:I

    .line 417
    .line 418
    check-cast v4, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 419
    .line 420
    invoke-virtual {v4, v1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    if-ne v0, v2, :cond_14

    .line 425
    .line 426
    goto :goto_c

    .line 427
    :cond_14
    :goto_a
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 428
    .line 429
    return-object v0

    .line 430
    :cond_15
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 431
    :goto_b
    :try_start_9
    invoke-static {v4, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/lang/Throwable;)V

    .line 432
    .line 433
    .line 434
    invoke-interface {v3, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 435
    .line 436
    .line 437
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 438
    :catchall_6
    move-exception v0

    .line 439
    iput-object v0, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$0:Ljava/lang/Object;

    .line 440
    .line 441
    iput-object v10, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$1:Ljava/lang/Object;

    .line 442
    .line 443
    iput-object v10, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$2:Ljava/lang/Object;

    .line 444
    .line 445
    iput-object v10, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$3:Ljava/lang/Object;

    .line 446
    .line 447
    iput-object v10, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$4:Ljava/lang/Object;

    .line 448
    .line 449
    iput-object v10, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->L$5:Ljava/lang/Object;

    .line 450
    .line 451
    iput v5, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$2;->label:I

    .line 452
    .line 453
    check-cast v4, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 454
    .line 455
    invoke-virtual {v4, v1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    if-ne v1, v2, :cond_16

    .line 460
    .line 461
    :goto_c
    return-object v2

    .line 462
    :cond_16
    move-object v1, v0

    .line 463
    :goto_d
    throw v1
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;
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
    new-instance v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, Lio/ktor/http/cio/ChunkedTransferEncodingKt$encodeChunked$1;-><init>(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {p0, v1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    sget-object v1, Lkotlinx/coroutines/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏楪世哲兰;

    .line 20
    .line 21
    invoke-static {v1, p1, p0, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    instance-of v1, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;

    .line 9
    .line 10
    iget v2, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->label:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    sget-object v7, Lio/ktor/http/cio/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/http/cio/飘花落叶言子楪世兰苏哲;

    .line 37
    .line 38
    const/4 v10, 0x0

    .line 39
    packed-switch v3, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v10

    .line 48
    :pswitch_0
    iget-object v1, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/lang/Throwable;

    .line 51
    .line 52
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_c

    .line 56
    .line 57
    :pswitch_1
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_9

    .line 61
    .line 62
    :pswitch_2
    iget-wide v11, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$1:J

    .line 63
    .line 64
    iget-wide v13, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$0:J

    .line 65
    .line 66
    iget-object v3, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$2:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    iget-object v15, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$1:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v15, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 73
    .line 74
    const-wide/16 v16, 0x0

    .line 75
    .line 76
    iget-object v8, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 79
    .line 80
    :try_start_0
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    :goto_1
    move-object v9, v3

    .line 84
    move-object v3, v1

    .line 85
    move-object v1, v15

    .line 86
    goto/16 :goto_8

    .line 87
    .line 88
    :catchall_0
    move-exception v0

    .line 89
    goto/16 :goto_a

    .line 90
    .line 91
    :pswitch_3
    const-wide/16 v16, 0x0

    .line 92
    .line 93
    iget-wide v8, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$1:J

    .line 94
    .line 95
    iget-wide v11, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$0:J

    .line 96
    .line 97
    iget-object v3, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$2:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    iget-object v13, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$1:Ljava/lang/Object;

    .line 102
    .line 103
    move-object v15, v13

    .line 104
    check-cast v15, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 105
    .line 106
    iget-object v13, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$0:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v13, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 109
    .line 110
    :try_start_1
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    .line 112
    .line 113
    goto/16 :goto_6

    .line 114
    .line 115
    :pswitch_4
    const-wide/16 v16, 0x0

    .line 116
    .line 117
    iget-wide v8, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$1:J

    .line 118
    .line 119
    iget-wide v11, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$0:J

    .line 120
    .line 121
    iget-object v3, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$2:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v3, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    iget-object v13, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$1:Ljava/lang/Object;

    .line 126
    .line 127
    move-object v15, v13

    .line 128
    check-cast v15, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 129
    .line 130
    iget-object v13, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$0:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v13, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 133
    .line 134
    :try_start_2
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    .line 136
    .line 137
    goto/16 :goto_5

    .line 138
    .line 139
    :pswitch_5
    const-wide/16 v16, 0x0

    .line 140
    .line 141
    iget-wide v8, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$0:J

    .line 142
    .line 143
    iget-object v3, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$2:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v3, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    iget-object v11, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$1:Ljava/lang/Object;

    .line 148
    .line 149
    move-object v15, v11

    .line 150
    check-cast v15, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 151
    .line 152
    iget-object v11, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$0:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v11, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 155
    .line 156
    :try_start_3
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :pswitch_6
    const-wide/16 v16, 0x0

    .line 161
    .line 162
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    move-object v8, v0

    .line 172
    move-object v3, v1

    .line 173
    move-wide/from16 v11, v16

    .line 174
    .line 175
    move-object/from16 v0, p0

    .line 176
    .line 177
    move-object/from16 v1, p1

    .line 178
    .line 179
    :goto_2
    :try_start_4
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 180
    .line 181
    .line 182
    iput-object v0, v3, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$0:Ljava/lang/Object;

    .line 183
    .line 184
    iput-object v1, v3, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$1:Ljava/lang/Object;

    .line 185
    .line 186
    iput-object v8, v3, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$2:Ljava/lang/Object;

    .line 187
    .line 188
    iput-wide v11, v3, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$0:J

    .line 189
    .line 190
    iput v6, v3, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->label:I

    .line 191
    .line 192
    const/16 v9, 0x80

    .line 193
    .line 194
    invoke-static {v0, v8, v9, v3}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/lang/Appendable;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 198
    if-ne v9, v2, :cond_1

    .line 199
    .line 200
    goto/16 :goto_b

    .line 201
    .line 202
    :cond_1
    move-object v15, v1

    .line 203
    move-object v1, v3

    .line 204
    move-object v3, v8

    .line 205
    move-wide/from16 v18, v11

    .line 206
    .line 207
    move-object v11, v0

    .line 208
    move-object v0, v9

    .line 209
    move-wide/from16 v8, v18

    .line 210
    .line 211
    :goto_3
    :try_start_5
    check-cast v0, Ljava/lang/Boolean;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_c

    .line 218
    .line 219
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_b

    .line 224
    .line 225
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-ne v0, v6, :cond_2

    .line 230
    .line 231
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    const/16 v12, 0x30

    .line 236
    .line 237
    if-ne v0, v12, :cond_2

    .line 238
    .line 239
    move-wide/from16 v12, v16

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_2
    invoke-static {v3}, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/StringBuilder;)J

    .line 243
    .line 244
    .line 245
    move-result-wide v12

    .line 246
    :goto_4
    cmp-long v0, v12, v16

    .line 247
    .line 248
    if-lez v0, :cond_5

    .line 249
    .line 250
    iput-object v11, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$0:Ljava/lang/Object;

    .line 251
    .line 252
    iput-object v15, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$1:Ljava/lang/Object;

    .line 253
    .line 254
    iput-object v3, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$2:Ljava/lang/Object;

    .line 255
    .line 256
    iput-wide v8, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$0:J

    .line 257
    .line 258
    iput-wide v12, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$1:J

    .line 259
    .line 260
    iput v5, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->label:I

    .line 261
    .line 262
    invoke-static {v11, v15, v12, v13, v1}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    if-ne v0, v2, :cond_3

    .line 267
    .line 268
    goto/16 :goto_b

    .line 269
    .line 270
    :cond_3
    move-wide/from16 v18, v12

    .line 271
    .line 272
    move-object v13, v11

    .line 273
    move-wide v11, v8

    .line 274
    move-wide/from16 v8, v18

    .line 275
    .line 276
    :goto_5
    iput-object v13, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$0:Ljava/lang/Object;

    .line 277
    .line 278
    iput-object v15, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$1:Ljava/lang/Object;

    .line 279
    .line 280
    iput-object v3, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$2:Ljava/lang/Object;

    .line 281
    .line 282
    iput-wide v11, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$0:J

    .line 283
    .line 284
    iput-wide v8, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$1:J

    .line 285
    .line 286
    const/4 v0, 0x3

    .line 287
    iput v0, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->label:I

    .line 288
    .line 289
    move-object v0, v15

    .line 290
    check-cast v0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 291
    .line 292
    invoke-virtual {v0, v1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v14

    .line 296
    if-ne v14, v2, :cond_4

    .line 297
    .line 298
    goto/16 :goto_b

    .line 299
    .line 300
    :cond_4
    move-object v15, v0

    .line 301
    :goto_6
    add-long/2addr v11, v8

    .line 302
    move-wide/from16 v18, v11

    .line 303
    .line 304
    move-object v11, v13

    .line 305
    move-wide/from16 v13, v18

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_5
    move-wide/from16 v18, v12

    .line 309
    .line 310
    move-wide v13, v8

    .line 311
    move-wide/from16 v8, v18

    .line 312
    .line 313
    :goto_7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 317
    .line 318
    .line 319
    iput-object v11, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$0:Ljava/lang/Object;

    .line 320
    .line 321
    iput-object v15, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$1:Ljava/lang/Object;

    .line 322
    .line 323
    iput-object v3, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$2:Ljava/lang/Object;

    .line 324
    .line 325
    iput-wide v13, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$0:J

    .line 326
    .line 327
    iput-wide v8, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->J$1:J

    .line 328
    .line 329
    const/4 v0, 0x4

    .line 330
    iput v0, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->label:I

    .line 331
    .line 332
    invoke-static {v11, v3, v5, v1}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/lang/Appendable;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 336
    if-ne v0, v2, :cond_6

    .line 337
    .line 338
    goto/16 :goto_b

    .line 339
    .line 340
    :cond_6
    move-wide/from16 v18, v8

    .line 341
    .line 342
    move-object v8, v11

    .line 343
    move-wide/from16 v11, v18

    .line 344
    .line 345
    goto/16 :goto_1

    .line 346
    .line 347
    :goto_8
    :try_start_6
    check-cast v0, Ljava/lang/Boolean;

    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    if-eqz v0, :cond_a

    .line 354
    .line 355
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 356
    .line 357
    .line 358
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 359
    if-gtz v0, :cond_9

    .line 360
    .line 361
    cmp-long v0, v11, v16

    .line 362
    .line 363
    if-nez v0, :cond_8

    .line 364
    .line 365
    invoke-virtual {v7, v9}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    iput-object v10, v3, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$0:Ljava/lang/Object;

    .line 369
    .line 370
    iput-object v10, v3, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$1:Ljava/lang/Object;

    .line 371
    .line 372
    iput-object v10, v3, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$2:Ljava/lang/Object;

    .line 373
    .line 374
    const/4 v0, 0x5

    .line 375
    iput v0, v3, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->label:I

    .line 376
    .line 377
    check-cast v1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 378
    .line 379
    invoke-virtual {v1, v3}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    if-ne v0, v2, :cond_7

    .line 384
    .line 385
    goto :goto_b

    .line 386
    :cond_7
    :goto_9
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 387
    .line 388
    return-object v0

    .line 389
    :cond_8
    move-object v0, v8

    .line 390
    move-object v8, v9

    .line 391
    move-wide v11, v13

    .line 392
    goto/16 :goto_2

    .line 393
    .line 394
    :cond_9
    :try_start_7
    new-instance v0, Ljava/io/EOFException;

    .line 395
    .line 396
    const-string v4, "Invalid chunk: content block should end with CR+LF"

    .line 397
    .line 398
    invoke-direct {v0, v4}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    throw v0

    .line 402
    :catchall_1
    move-exception v0

    .line 403
    move-object v15, v1

    .line 404
    move-object v1, v3

    .line 405
    move-object v3, v9

    .line 406
    goto :goto_a

    .line 407
    :cond_a
    new-instance v0, Ljava/io/EOFException;

    .line 408
    .line 409
    new-instance v4, Ljava/lang/StringBuilder;

    .line 410
    .line 411
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 412
    .line 413
    .line 414
    const-string v5, "Invalid chunk: content block of size "

    .line 415
    .line 416
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v4, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    const-string v5, " ended unexpectedly"

    .line 423
    .line 424
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    invoke-direct {v0, v4}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 435
    :cond_b
    :try_start_8
    new-instance v0, Ljava/io/EOFException;

    .line 436
    .line 437
    const-string v4, "Invalid chunk size: empty"

    .line 438
    .line 439
    invoke-direct {v0, v4}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    throw v0

    .line 443
    :cond_c
    new-instance v0, Ljava/io/EOFException;

    .line 444
    .line 445
    const-string v4, "Chunked stream has ended unexpectedly: no chunk size"

    .line 446
    .line 447
    invoke-direct {v0, v4}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 451
    :catchall_2
    move-exception v0

    .line 452
    move-object v15, v1

    .line 453
    move-object v1, v3

    .line 454
    move-object v3, v8

    .line 455
    :goto_a
    :try_start_9
    invoke-static {v15, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/lang/Throwable;)V

    .line 456
    .line 457
    .line 458
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 459
    :catchall_3
    move-exception v0

    .line 460
    invoke-virtual {v7, v3}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    iput-object v0, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$0:Ljava/lang/Object;

    .line 464
    .line 465
    iput-object v10, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$1:Ljava/lang/Object;

    .line 466
    .line 467
    iput-object v10, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->L$2:Ljava/lang/Object;

    .line 468
    .line 469
    const/4 v3, 0x6

    .line 470
    iput v3, v1, Lio/ktor/http/cio/ChunkedTransferEncodingKt$decodeChunked$2;->label:I

    .line 471
    .line 472
    check-cast v15, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 473
    .line 474
    invoke-virtual {v15, v1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    if-ne v1, v2, :cond_d

    .line 479
    .line 480
    :goto_b
    return-object v2

    .line 481
    :cond_d
    move-object v1, v0

    .line 482
    :goto_c
    throw v1

    .line 483
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;[BIILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->label:I

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
    iput v1, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x5

    .line 33
    const/4 v5, 0x4

    .line 34
    const/4 v6, 0x3

    .line 35
    const/4 v7, 0x2

    .line 36
    const/4 v8, 0x1

    .line 37
    if-eqz v2, :cond_6

    .line 38
    .line 39
    if-eq v2, v8, :cond_5

    .line 40
    .line 41
    if-eq v2, v7, :cond_4

    .line 42
    .line 43
    if-eq v2, v6, :cond_3

    .line 44
    .line 45
    if-eq v2, v5, :cond_2

    .line 46
    .line 47
    if-ne v2, v4, :cond_1

    .line 48
    .line 49
    iget p0, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$0:I

    .line 50
    .line 51
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v3

    .line 62
    :cond_2
    iget p0, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$0:I

    .line 63
    .line 64
    iget-object p1, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 67
    .line 68
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :cond_3
    iget p0, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$0:I

    .line 74
    .line 75
    iget-object p1, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 78
    .line 79
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_3

    .line 83
    .line 84
    :cond_4
    iget p0, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$2:I

    .line 85
    .line 86
    iget p1, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$1:I

    .line 87
    .line 88
    iget p2, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$0:I

    .line 89
    .line 90
    iget-object p3, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$1:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p3, [B

    .line 93
    .line 94
    iget-object v2, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 97
    .line 98
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    iget p0, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$2:I

    .line 103
    .line 104
    iget p3, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$1:I

    .line 105
    .line 106
    iget p2, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$0:I

    .line 107
    .line 108
    iget-object p1, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$1:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p1, [B

    .line 111
    .line 112
    iget-object v2, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$0:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 115
    .line 116
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    move p4, p0

    .line 120
    move-object p0, v2

    .line 121
    goto :goto_1

    .line 122
    :cond_6
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sub-int p4, p3, p2

    .line 126
    .line 127
    iput-object p0, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$0:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object p1, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$1:Ljava/lang/Object;

    .line 130
    .line 131
    iput p2, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$0:I

    .line 132
    .line 133
    iput p3, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$1:I

    .line 134
    .line 135
    iput p4, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$2:I

    .line 136
    .line 137
    iput v8, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->label:I

    .line 138
    .line 139
    invoke-static {p0, p4, v0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    if-ne v2, v1, :cond_7

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_7
    :goto_1
    iput-object p0, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$0:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object p1, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$1:Ljava/lang/Object;

    .line 149
    .line 150
    iput p2, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$0:I

    .line 151
    .line 152
    iput p3, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$1:I

    .line 153
    .line 154
    iput p4, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$2:I

    .line 155
    .line 156
    iput v7, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->label:I

    .line 157
    .line 158
    const/16 v2, 0xd0a

    .line 159
    .line 160
    invoke-static {p0, v2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;SLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    if-ne v2, v1, :cond_8

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_8
    move v2, p3

    .line 168
    move-object p3, p1

    .line 169
    move p1, v2

    .line 170
    move-object v2, p0

    .line 171
    move p0, p4

    .line 172
    :goto_2
    iput-object v2, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$0:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v3, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$1:Ljava/lang/Object;

    .line 175
    .line 176
    iput p0, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$0:I

    .line 177
    .line 178
    iput v6, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->label:I

    .line 179
    .line 180
    invoke-static {v2, p3, p2, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;[BIILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-ne p1, v1, :cond_9

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_9
    move-object p1, v2

    .line 188
    :goto_3
    iput-object p1, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$0:Ljava/lang/Object;

    .line 189
    .line 190
    iput p0, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$0:I

    .line 191
    .line 192
    iput v5, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->label:I

    .line 193
    .line 194
    sget-object p2, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪哲兰世苏;

    .line 195
    .line 196
    const/4 p2, 0x0

    .line 197
    sget-object p3, Lio/ktor/http/cio/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:[B

    .line 198
    .line 199
    array-length p4, p3

    .line 200
    invoke-static {p1, p3, p2, p4, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;[BIILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    if-ne p2, v1, :cond_a

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_a
    :goto_4
    iput-object v3, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->L$0:Ljava/lang/Object;

    .line 208
    .line 209
    iput p0, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->I$0:I

    .line 210
    .line 211
    iput v4, v0, Lio/ktor/http/cio/ChunkedTransferEncodingKt$writeChunk$1;->label:I

    .line 212
    .line 213
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 214
    .line 215
    invoke-virtual {p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    if-ne p1, v1, :cond_b

    .line 220
    .line 221
    :goto_5
    return-object v1

    .line 222
    :cond_b
    :goto_6
    new-instance p1, Ljava/lang/Integer;

    .line 223
    .line 224
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 225
    .line 226
    .line 227
    return-object p1
.end method
