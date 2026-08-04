.class public final Lyyds/ᲁᲀᛷᛴ;
.super Lyyds/ᛱᛷᛸᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public ᛱᲈᲁ:I

.field public synthetic ᛲᛳᛶᲁ:Ljava/lang/Object;

.field public ᛲᛴᛳᛲ:Ljava/util/Iterator;

.field public ᛶᛷᛲᲁ:I

.field public final synthetic ᛷᲈᲈᲁ:Ljava/util/Iterator;

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᲁᲀᛷᛴ;->ᛷᲈᲈᲁ:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lyyds/ᛱᛷᛸᛲ;-><init>(Lyyds/ᛲᛱᛶᛸ;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lyyds/ᛸᛲᲇᛶ;

    .line 6
    .line 7
    iget v2, v0, Lyyds/ᲁᲀᛷᛴ;->ᛱᲈᲁ:I

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    sget-object v6, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 13
    .line 14
    if-eqz v2, :cond_c

    .line 15
    .line 16
    if-eq v2, v4, :cond_b

    .line 17
    .line 18
    if-eq v2, v3, :cond_a

    .line 19
    .line 20
    const/4 v7, 0x5

    .line 21
    const/4 v8, 0x4

    .line 22
    const/4 v9, 0x3

    .line 23
    if-eq v2, v9, :cond_2

    .line 24
    .line 25
    if-eq v2, v8, :cond_1

    .line 26
    .line 27
    if-ne v2, v7, :cond_0

    .line 28
    .line 29
    iget-object v0, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lyyds/ᛳᛵᲇᛴ;

    .line 32
    .line 33
    :goto_0
    invoke-static/range {p1 .. p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v5

    .line 44
    :cond_1
    iget v2, v0, Lyyds/ᲁᲀᛷᛴ;->ᛶᛷᛲᲁ:I

    .line 45
    .line 46
    iget v4, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲇᲇᛱ:I

    .line 47
    .line 48
    iget-object v9, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v9, Lyyds/ᛳᛵᲇᛴ;

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v9}, Lyyds/ᛳᛵᲇᛴ;->ᛵᛸᛸᛷ()V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :cond_2
    iget v2, v0, Lyyds/ᲁᲀᛷᛴ;->ᛶᛷᛲᲁ:I

    .line 61
    .line 62
    iget v10, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲇᲇᛱ:I

    .line 63
    .line 64
    iget-object v11, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛴᛳᛲ:Ljava/util/Iterator;

    .line 65
    .line 66
    iget-object v12, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v12, Lyyds/ᛳᛵᲇᛴ;

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12}, Lyyds/ᛳᛵᲇᛴ;->ᛵᛸᛸᛷ()V

    .line 74
    .line 75
    .line 76
    :goto_1
    iget v13, v12, Lyyds/ᛳᛵᲇᛴ;->ᲇᲈᛵᛷ:I

    .line 77
    .line 78
    iget-object v14, v12, Lyyds/ᛳᛵᲇᛴ;->ᲀᛲᛳᲀ:[Ljava/lang/Object;

    .line 79
    .line 80
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v15

    .line 84
    if-eqz v15, :cond_8

    .line 85
    .line 86
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v15

    .line 90
    move/from16 v16, v4

    .line 91
    .line 92
    invoke-virtual {v12}, Lyyds/ᛳᛵᲇᛴ;->ᛲᲈᲁ()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eq v4, v13, :cond_7

    .line 97
    .line 98
    iget v4, v12, Lyyds/ᛳᛵᲇᛴ;->ᛲᛴᛳᛲ:I

    .line 99
    .line 100
    iget v7, v12, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 101
    .line 102
    add-int/2addr v4, v7

    .line 103
    rem-int/2addr v4, v13

    .line 104
    aput-object v15, v14, v4

    .line 105
    .line 106
    add-int/lit8 v7, v7, 0x1

    .line 107
    .line 108
    iput v7, v12, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 109
    .line 110
    invoke-virtual {v12}, Lyyds/ᛳᛵᲇᛴ;->ᛲᲈᲁ()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-ne v4, v13, :cond_5

    .line 115
    .line 116
    iget v4, v12, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 117
    .line 118
    if-ge v4, v3, :cond_6

    .line 119
    .line 120
    shr-int/lit8 v4, v13, 0x1

    .line 121
    .line 122
    add-int/2addr v13, v4

    .line 123
    add-int/lit8 v13, v13, 0x1

    .line 124
    .line 125
    if-le v13, v3, :cond_3

    .line 126
    .line 127
    move v13, v3

    .line 128
    :cond_3
    iget v4, v12, Lyyds/ᛳᛵᲇᛴ;->ᛲᛴᛳᛲ:I

    .line 129
    .line 130
    if-nez v4, :cond_4

    .line 131
    .line 132
    invoke-static {v14, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    goto :goto_2

    .line 137
    :cond_4
    new-array v4, v13, [Ljava/lang/Object;

    .line 138
    .line 139
    invoke-virtual {v12, v4}, Lyyds/ᛳᛵᲇᛴ;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    :goto_2
    new-instance v7, Lyyds/ᛳᛵᲇᛴ;

    .line 144
    .line 145
    iget v12, v12, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 146
    .line 147
    invoke-direct {v7, v12, v4}, Lyyds/ᛳᛵᲇᛴ;-><init>(I[Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    move-object v12, v7

    .line 151
    :cond_5
    move/from16 v4, v16

    .line 152
    .line 153
    const/4 v7, 0x5

    .line 154
    goto :goto_1

    .line 155
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-direct {v3, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 158
    .line 159
    .line 160
    iput-object v1, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 161
    .line 162
    iput-object v12, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 163
    .line 164
    iput-object v11, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛴᛳᛲ:Ljava/util/Iterator;

    .line 165
    .line 166
    iput v10, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲇᲇᛱ:I

    .line 167
    .line 168
    iput v2, v0, Lyyds/ᲁᲀᛷᛴ;->ᛶᛷᛲᲁ:I

    .line 169
    .line 170
    iput v9, v0, Lyyds/ᲁᲀᛷᛴ;->ᛱᲈᲁ:I

    .line 171
    .line 172
    invoke-virtual {v1, v3, v0}, Lyyds/ᛸᛲᲇᛶ;->ᲀᛲᛳᲀ(Ljava/lang/Object;Lyyds/ᛱᛷᛸᛲ;)V

    .line 173
    .line 174
    .line 175
    return-object v6

    .line 176
    :cond_7
    const-string v0, "ring buffer is full"

    .line 177
    .line 178
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    return-object v5

    .line 182
    :cond_8
    move v4, v10

    .line 183
    move-object v9, v12

    .line 184
    :goto_3
    iget v7, v9, Lyyds/ᛳᛵᲇᛴ;->ᲇᲇᲇᛱ:I

    .line 185
    .line 186
    if-le v7, v3, :cond_9

    .line 187
    .line 188
    new-instance v3, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 191
    .line 192
    .line 193
    iput-object v1, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v9, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object v5, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛴᛳᛲ:Ljava/util/Iterator;

    .line 198
    .line 199
    iput v4, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲇᲇᛱ:I

    .line 200
    .line 201
    iput v2, v0, Lyyds/ᲁᲀᛷᛴ;->ᛶᛷᛲᲁ:I

    .line 202
    .line 203
    iput v8, v0, Lyyds/ᲁᲀᛷᛴ;->ᛱᲈᲁ:I

    .line 204
    .line 205
    invoke-virtual {v1, v3, v0}, Lyyds/ᛸᛲᲇᛶ;->ᲀᛲᛳᲀ(Ljava/lang/Object;Lyyds/ᛱᛷᛸᛲ;)V

    .line 206
    .line 207
    .line 208
    return-object v6

    .line 209
    :cond_9
    invoke-virtual {v9}, Lyyds/ᛲᛱᲁᛳ;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-nez v3, :cond_10

    .line 214
    .line 215
    iput-object v5, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object v5, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v5, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛴᛳᛲ:Ljava/util/Iterator;

    .line 220
    .line 221
    iput v4, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲇᲇᛱ:I

    .line 222
    .line 223
    iput v2, v0, Lyyds/ᲁᲀᛷᛴ;->ᛶᛷᛲᲁ:I

    .line 224
    .line 225
    const/4 v2, 0x5

    .line 226
    iput v2, v0, Lyyds/ᲁᲀᛷᛴ;->ᛱᲈᲁ:I

    .line 227
    .line 228
    invoke-virtual {v1, v9, v0}, Lyyds/ᛸᛲᲇᛶ;->ᲀᛲᛳᲀ(Ljava/lang/Object;Lyyds/ᛱᛷᛸᛲ;)V

    .line 229
    .line 230
    .line 231
    return-object v6

    .line 232
    :cond_a
    iget-object v0, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, Ljava/util/ArrayList;

    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :cond_b
    move/from16 v16, v4

    .line 239
    .line 240
    iget v2, v0, Lyyds/ᲁᲀᛷᛴ;->ᛶᛷᛲᲁ:I

    .line 241
    .line 242
    iget v4, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲇᲇᛱ:I

    .line 243
    .line 244
    iget-object v7, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛴᛳᛲ:Ljava/util/Iterator;

    .line 245
    .line 246
    iget-object v8, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v8, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-static/range {p1 .. p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    new-instance v8, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 256
    .line 257
    .line 258
    move-object v9, v8

    .line 259
    move-object v8, v7

    .line 260
    move v7, v4

    .line 261
    move v4, v2

    .line 262
    goto :goto_4

    .line 263
    :cond_c
    move/from16 v16, v4

    .line 264
    .line 265
    invoke-static/range {p1 .. p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    new-instance v8, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 271
    .line 272
    .line 273
    iget-object v7, v0, Lyyds/ᲁᲀᛷᛴ;->ᛷᲈᲈᲁ:Ljava/util/Iterator;

    .line 274
    .line 275
    const/4 v2, 0x0

    .line 276
    move v4, v2

    .line 277
    move-object v9, v8

    .line 278
    move-object v8, v7

    .line 279
    move v7, v3

    .line 280
    :cond_d
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    if-eqz v10, :cond_f

    .line 285
    .line 286
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v10

    .line 290
    if-lez v2, :cond_e

    .line 291
    .line 292
    add-int/lit8 v2, v2, -0x1

    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_e
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 299
    .line 300
    .line 301
    move-result v10

    .line 302
    if-ne v10, v3, :cond_d

    .line 303
    .line 304
    iput-object v1, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 305
    .line 306
    iput-object v9, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 307
    .line 308
    iput-object v8, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛴᛳᛲ:Ljava/util/Iterator;

    .line 309
    .line 310
    iput v7, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲇᲇᛱ:I

    .line 311
    .line 312
    iput v4, v0, Lyyds/ᲁᲀᛷᛴ;->ᛶᛷᛲᲁ:I

    .line 313
    .line 314
    move/from16 v10, v16

    .line 315
    .line 316
    iput v10, v0, Lyyds/ᲁᲀᛷᛴ;->ᛱᲈᲁ:I

    .line 317
    .line 318
    invoke-virtual {v1, v9, v0}, Lyyds/ᛸᛲᲇᛶ;->ᲀᛲᛳᲀ(Ljava/lang/Object;Lyyds/ᛱᛷᛸᛲ;)V

    .line 319
    .line 320
    .line 321
    return-object v6

    .line 322
    :cond_f
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-nez v2, :cond_10

    .line 327
    .line 328
    iput-object v5, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 329
    .line 330
    iput-object v5, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 331
    .line 332
    iput-object v5, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛴᛳᛲ:Ljava/util/Iterator;

    .line 333
    .line 334
    iput v7, v0, Lyyds/ᲁᲀᛷᛴ;->ᲇᲇᲇᛱ:I

    .line 335
    .line 336
    iput v4, v0, Lyyds/ᲁᲀᛷᛴ;->ᛶᛷᛲᲁ:I

    .line 337
    .line 338
    iput v3, v0, Lyyds/ᲁᲀᛷᛴ;->ᛱᲈᲁ:I

    .line 339
    .line 340
    invoke-virtual {v1, v9, v0}, Lyyds/ᛸᛲᲇᛶ;->ᲀᛲᛳᲀ(Ljava/lang/Object;Lyyds/ᛱᛷᛸᛲ;)V

    .line 341
    .line 342
    .line 343
    return-object v6

    .line 344
    :cond_10
    :goto_5
    sget-object v0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 345
    .line 346
    return-object v0
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᲁᲀᛷᛴ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲁᲀᛷᛴ;->ᛷᲈᲈᲁ:Ljava/util/Iterator;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lyyds/ᲁᲀᛷᛴ;-><init>(Ljava/util/Iterator;Lyyds/ᛲᛱᛶᛸ;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lyyds/ᲁᲀᛷᛴ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛸᛲᲇᛶ;

    .line 2
    .line 3
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lyyds/ᲁᲀᛷᛴ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyyds/ᲁᲀᛷᛴ;

    .line 10
    .line 11
    sget-object p1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lyyds/ᲁᲀᛷᛴ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
