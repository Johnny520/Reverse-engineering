.class public final Lmw1;
.super Ldo1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public η:Ljava/lang/Object;

.field public θ:Ljava/util/Iterator;

.field public ι:I

.field public κ:I

.field public λ:I

.field public synthetic μ:Ljava/lang/Object;

.field public final synthetic ν:I

.field public final synthetic ξ:I

.field public final synthetic ο:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(IILjava/util/Iterator;Lop;)V
    .locals 0

    .line 1
    iput p1, p0, Lmw1;->ν:I

    .line 2
    .line 3
    iput p2, p0, Lmw1;->ξ:I

    .line 4
    .line 5
    iput-object p3, p0, Lmw1;->ο:Ljava/util/Iterator;

    .line 6
    .line 7
    invoke-direct {p0, p4}, Ldo1;-><init>(Lop;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lts1;

    .line 2
    .line 3
    check-cast p2, Lop;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lmw1;->η(Lop;Ljava/lang/Object;)Lop;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lmw1;

    .line 10
    .line 11
    sget-object p1, Ls62;->α:Ls62;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lmw1;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final η(Lop;Ljava/lang/Object;)Lop;
    .locals 3

    .line 1
    new-instance v0, Lmw1;

    .line 2
    .line 3
    iget v1, p0, Lmw1;->ξ:I

    .line 4
    .line 5
    iget-object v2, p0, Lmw1;->ο:Ljava/util/Iterator;

    .line 6
    .line 7
    iget p0, p0, Lmw1;->ν:I

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p1}, Lmw1;-><init>(IILjava/util/Iterator;Lop;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, v0, Lmw1;->μ:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lmw1;->μ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lts1;

    .line 6
    .line 7
    iget v2, v0, Lmw1;->λ:I

    .line 8
    .line 9
    const/4 v3, 0x5

    .line 10
    const/4 v4, 0x4

    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x2

    .line 13
    iget v7, v0, Lmw1;->ξ:I

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    iget v9, v0, Lmw1;->ν:I

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    sget-object v11, Lcq;->ε:Lcq;

    .line 20
    .line 21
    if-eqz v2, :cond_5

    .line 22
    .line 23
    if-eq v2, v8, :cond_4

    .line 24
    .line 25
    if-eq v2, v6, :cond_3

    .line 26
    .line 27
    if-eq v2, v5, :cond_2

    .line 28
    .line 29
    if-eq v2, v4, :cond_1

    .line 30
    .line 31
    if-ne v2, v3, :cond_0

    .line 32
    .line 33
    iget-object v0, v0, Lmw1;->η:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lro1;

    .line 36
    .line 37
    :goto_0
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_7

    .line 41
    .line 42
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_1
    const/4 v0, 0x0

    .line 48
    return-object v0

    .line 49
    :cond_1
    iget v2, v0, Lmw1;->κ:I

    .line 50
    .line 51
    iget v5, v0, Lmw1;->ι:I

    .line 52
    .line 53
    iget-object v6, v0, Lmw1;->η:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v6, Lro1;

    .line 56
    .line 57
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v7}, Lro1;->β(I)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :cond_2
    iget v2, v0, Lmw1;->κ:I

    .line 66
    .line 67
    iget v6, v0, Lmw1;->ι:I

    .line 68
    .line 69
    iget-object v12, v0, Lmw1;->θ:Ljava/util/Iterator;

    .line 70
    .line 71
    iget-object v13, v0, Lmw1;->η:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v13, Lro1;

    .line 74
    .line 75
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v13, v7}, Lro1;->β(I)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_3
    iget-object v0, v0, Lmw1;->η:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Ljava/util/ArrayList;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    iget v2, v0, Lmw1;->κ:I

    .line 89
    .line 90
    iget v3, v0, Lmw1;->ι:I

    .line 91
    .line 92
    iget-object v4, v0, Lmw1;->θ:Ljava/util/Iterator;

    .line 93
    .line 94
    iget-object v5, v0, Lmw1;->η:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v5, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v5, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 104
    .line 105
    .line 106
    move v12, v2

    .line 107
    goto :goto_3

    .line 108
    :cond_5
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    const/16 v2, 0x400

    .line 112
    .line 113
    if-le v9, v2, :cond_6

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    move v2, v9

    .line 117
    :goto_2
    sub-int v12, v7, v9

    .line 118
    .line 119
    iget-object v13, v0, Lmw1;->ο:Ljava/util/Iterator;

    .line 120
    .line 121
    const/4 v14, 0x0

    .line 122
    if-ltz v12, :cond_a

    .line 123
    .line 124
    new-instance v5, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 127
    .line 128
    .line 129
    move v3, v2

    .line 130
    move-object v4, v13

    .line 131
    move v2, v14

    .line 132
    :cond_7
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_9

    .line 137
    .line 138
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    if-lez v2, :cond_8

    .line 143
    .line 144
    add-int/lit8 v2, v2, -0x1

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_8
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-ne v7, v9, :cond_7

    .line 155
    .line 156
    iput-object v1, v0, Lmw1;->μ:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object v5, v0, Lmw1;->η:Ljava/lang/Object;

    .line 159
    .line 160
    iput-object v4, v0, Lmw1;->θ:Ljava/util/Iterator;

    .line 161
    .line 162
    iput v3, v0, Lmw1;->ι:I

    .line 163
    .line 164
    iput v12, v0, Lmw1;->κ:I

    .line 165
    .line 166
    iput v8, v0, Lmw1;->λ:I

    .line 167
    .line 168
    invoke-virtual {v1, v0, v5}, Lts1;->β(Lop;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    return-object v11

    .line 172
    :cond_9
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-nez v2, :cond_12

    .line 177
    .line 178
    iput-object v10, v0, Lmw1;->μ:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v10, v0, Lmw1;->η:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v10, v0, Lmw1;->θ:Ljava/util/Iterator;

    .line 183
    .line 184
    iput v3, v0, Lmw1;->ι:I

    .line 185
    .line 186
    iput v12, v0, Lmw1;->κ:I

    .line 187
    .line 188
    iput v6, v0, Lmw1;->λ:I

    .line 189
    .line 190
    invoke-virtual {v1, v0, v5}, Lts1;->β(Lop;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    return-object v11

    .line 194
    :cond_a
    new-instance v6, Lro1;

    .line 195
    .line 196
    new-array v15, v2, [Ljava/lang/Object;

    .line 197
    .line 198
    invoke-direct {v6, v14, v15}, Lro1;-><init>(I[Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    move-object/from16 v18, v6

    .line 202
    .line 203
    move v6, v2

    .line 204
    move v2, v12

    .line 205
    move-object v12, v13

    .line 206
    move-object/from16 v13, v18

    .line 207
    .line 208
    :goto_4
    iget v14, v13, Lro1;->ζ:I

    .line 209
    .line 210
    iget-object v15, v13, Lro1;->ε:[Ljava/lang/Object;

    .line 211
    .line 212
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v16

    .line 216
    if-eqz v16, :cond_10

    .line 217
    .line 218
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v16

    .line 222
    move/from16 v17, v8

    .line 223
    .line 224
    invoke-virtual {v13}, Lro1;->α()I

    .line 225
    .line 226
    .line 227
    move-result v8

    .line 228
    if-eq v8, v14, :cond_f

    .line 229
    .line 230
    iget v8, v13, Lro1;->η:I

    .line 231
    .line 232
    iget v3, v13, Lro1;->θ:I

    .line 233
    .line 234
    add-int/2addr v8, v3

    .line 235
    rem-int/2addr v8, v14

    .line 236
    aput-object v16, v15, v8

    .line 237
    .line 238
    add-int/lit8 v3, v3, 0x1

    .line 239
    .line 240
    iput v3, v13, Lro1;->θ:I

    .line 241
    .line 242
    invoke-virtual {v13}, Lro1;->α()I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-ne v3, v14, :cond_d

    .line 247
    .line 248
    iget v3, v13, Lro1;->θ:I

    .line 249
    .line 250
    if-ge v3, v9, :cond_e

    .line 251
    .line 252
    shr-int/lit8 v3, v14, 0x1

    .line 253
    .line 254
    add-int/2addr v14, v3

    .line 255
    add-int/lit8 v14, v14, 0x1

    .line 256
    .line 257
    if-le v14, v9, :cond_b

    .line 258
    .line 259
    move v14, v9

    .line 260
    :cond_b
    iget v3, v13, Lro1;->η:I

    .line 261
    .line 262
    if-nez v3, :cond_c

    .line 263
    .line 264
    invoke-static {v15, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    goto :goto_5

    .line 269
    :cond_c
    new-array v3, v14, [Ljava/lang/Object;

    .line 270
    .line 271
    invoke-virtual {v13, v3}, Lro1;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    :goto_5
    new-instance v8, Lro1;

    .line 276
    .line 277
    iget v13, v13, Lro1;->θ:I

    .line 278
    .line 279
    invoke-direct {v8, v13, v3}, Lro1;-><init>(I[Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    move-object v13, v8

    .line 283
    :cond_d
    move/from16 v8, v17

    .line 284
    .line 285
    const/4 v3, 0x5

    .line 286
    goto :goto_4

    .line 287
    :cond_e
    new-instance v3, Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-direct {v3, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 290
    .line 291
    .line 292
    iput-object v1, v0, Lmw1;->μ:Ljava/lang/Object;

    .line 293
    .line 294
    iput-object v13, v0, Lmw1;->η:Ljava/lang/Object;

    .line 295
    .line 296
    iput-object v12, v0, Lmw1;->θ:Ljava/util/Iterator;

    .line 297
    .line 298
    iput v6, v0, Lmw1;->ι:I

    .line 299
    .line 300
    iput v2, v0, Lmw1;->κ:I

    .line 301
    .line 302
    iput v5, v0, Lmw1;->λ:I

    .line 303
    .line 304
    invoke-virtual {v1, v0, v3}, Lts1;->β(Lop;Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    return-object v11

    .line 308
    :cond_f
    const-string v0, "ring buffer is full"

    .line 309
    .line 310
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    goto/16 :goto_1

    .line 314
    .line 315
    :cond_10
    move v5, v6

    .line 316
    move-object v6, v13

    .line 317
    :goto_6
    iget v3, v6, Lro1;->θ:I

    .line 318
    .line 319
    if-le v3, v7, :cond_11

    .line 320
    .line 321
    new-instance v3, Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 324
    .line 325
    .line 326
    iput-object v1, v0, Lmw1;->μ:Ljava/lang/Object;

    .line 327
    .line 328
    iput-object v6, v0, Lmw1;->η:Ljava/lang/Object;

    .line 329
    .line 330
    iput-object v10, v0, Lmw1;->θ:Ljava/util/Iterator;

    .line 331
    .line 332
    iput v5, v0, Lmw1;->ι:I

    .line 333
    .line 334
    iput v2, v0, Lmw1;->κ:I

    .line 335
    .line 336
    iput v4, v0, Lmw1;->λ:I

    .line 337
    .line 338
    invoke-virtual {v1, v0, v3}, Lts1;->β(Lop;Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    return-object v11

    .line 342
    :cond_11
    invoke-virtual {v6}, Lμ;->isEmpty()Z

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    if-nez v3, :cond_12

    .line 347
    .line 348
    iput-object v10, v0, Lmw1;->μ:Ljava/lang/Object;

    .line 349
    .line 350
    iput-object v10, v0, Lmw1;->η:Ljava/lang/Object;

    .line 351
    .line 352
    iput-object v10, v0, Lmw1;->θ:Ljava/util/Iterator;

    .line 353
    .line 354
    iput v5, v0, Lmw1;->ι:I

    .line 355
    .line 356
    iput v2, v0, Lmw1;->κ:I

    .line 357
    .line 358
    const/4 v2, 0x5

    .line 359
    iput v2, v0, Lmw1;->λ:I

    .line 360
    .line 361
    invoke-virtual {v1, v0, v6}, Lts1;->β(Lop;Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    return-object v11

    .line 365
    :cond_12
    :goto_7
    sget-object v0, Ls62;->α:Ls62;

    .line 366
    .line 367
    return-object v0
.end method
