.class public final Lo2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic a:Lr5;


# direct methods
.method public constructor <init>(Lr5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo2;->a:Lr5;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lo2;->a:Lr5;

    .line 4
    .line 5
    iget-object v1, v1, Lr5;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ll0;

    .line 8
    .line 9
    iget-object v1, v1, Ll0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lp2;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    iget-object v4, v1, Lp2;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    const/4 v8, 0x0

    .line 24
    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v9

    .line 28
    if-ge v8, v9, :cond_7

    .line 29
    .line 30
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    check-cast v9, Lh40;

    .line 35
    .line 36
    if-nez v9, :cond_1

    .line 37
    .line 38
    :cond_0
    :goto_1
    move v15, v8

    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :cond_1
    iget-object v11, v1, Lp2;->a:Lu30;

    .line 42
    .line 43
    const/4 v12, 0x0

    .line 44
    invoke-virtual {v11, v9, v12}, Lu30;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v12

    .line 48
    check-cast v12, Ljava/lang/Long;

    .line 49
    .line 50
    if-nez v12, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v12

    .line 57
    cmp-long v12, v12, v5

    .line 58
    .line 59
    if-gez v12, :cond_0

    .line 60
    .line 61
    invoke-virtual {v11, v9}, Lu30;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :goto_2
    iget-wide v11, v9, Lh40;->f:J

    .line 65
    .line 66
    const-wide/16 v13, 0x0

    .line 67
    .line 68
    cmp-long v13, v11, v13

    .line 69
    .line 70
    if-nez v13, :cond_3

    .line 71
    .line 72
    iput-wide v2, v9, Lh40;->f:J

    .line 73
    .line 74
    iget v10, v9, Lh40;->b:F

    .line 75
    .line 76
    invoke-virtual {v9, v10}, Lh40;->g(F)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    sub-long v16, v2, v11

    .line 81
    .line 82
    iput-wide v2, v9, Lh40;->f:J

    .line 83
    .line 84
    iget v11, v9, Lh40;->k:F

    .line 85
    .line 86
    const v12, 0x7f7fffff    # Float.MAX_VALUE

    .line 87
    .line 88
    .line 89
    cmpl-float v11, v11, v12

    .line 90
    .line 91
    if-eqz v11, :cond_4

    .line 92
    .line 93
    iget-object v11, v9, Lh40;->j:Li40;

    .line 94
    .line 95
    iget-wide v13, v11, Li40;->i:D

    .line 96
    .line 97
    iget v13, v9, Lh40;->b:F

    .line 98
    .line 99
    float-to-double v13, v13

    .line 100
    iget v15, v9, Lh40;->a:F

    .line 101
    .line 102
    move-object/from16 v18, v11

    .line 103
    .line 104
    const/16 p1, 0x1

    .line 105
    .line 106
    float-to-double v10, v15

    .line 107
    const-wide/16 v19, 0x2

    .line 108
    .line 109
    div-long v23, v16, v19

    .line 110
    .line 111
    move-wide/from16 v21, v10

    .line 112
    .line 113
    move-wide/from16 v19, v13

    .line 114
    .line 115
    invoke-virtual/range {v18 .. v24}, Li40;->c(DDJ)Lrh;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    iget-object v11, v9, Lh40;->j:Li40;

    .line 120
    .line 121
    iget v13, v9, Lh40;->k:F

    .line 122
    .line 123
    float-to-double v13, v13

    .line 124
    iput-wide v13, v11, Li40;->i:D

    .line 125
    .line 126
    iput v12, v9, Lh40;->k:F

    .line 127
    .line 128
    iget v13, v10, Lrh;->a:F

    .line 129
    .line 130
    float-to-double v13, v13

    .line 131
    iget v10, v10, Lrh;->b:F

    .line 132
    .line 133
    move-wide v15, v13

    .line 134
    float-to-double v12, v10

    .line 135
    move-object/from16 v21, v11

    .line 136
    .line 137
    move-wide/from16 v26, v23

    .line 138
    .line 139
    move-wide/from16 v24, v12

    .line 140
    .line 141
    move-wide/from16 v22, v15

    .line 142
    .line 143
    invoke-virtual/range {v21 .. v27}, Li40;->c(DDJ)Lrh;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    iget v11, v10, Lrh;->a:F

    .line 148
    .line 149
    iput v11, v9, Lh40;->b:F

    .line 150
    .line 151
    iget v10, v10, Lrh;->b:F

    .line 152
    .line 153
    iput v10, v9, Lh40;->a:F

    .line 154
    .line 155
    const v10, 0x7f7fffff    # Float.MAX_VALUE

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_4
    const/16 p1, 0x1

    .line 160
    .line 161
    iget-object v11, v9, Lh40;->j:Li40;

    .line 162
    .line 163
    iget v10, v9, Lh40;->b:F

    .line 164
    .line 165
    float-to-double v12, v10

    .line 166
    iget v10, v9, Lh40;->a:F

    .line 167
    .line 168
    float-to-double v14, v10

    .line 169
    const v10, 0x7f7fffff    # Float.MAX_VALUE

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v11 .. v17}, Li40;->c(DDJ)Lrh;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    iget v12, v11, Lrh;->a:F

    .line 177
    .line 178
    iput v12, v9, Lh40;->b:F

    .line 179
    .line 180
    iget v11, v11, Lrh;->b:F

    .line 181
    .line 182
    iput v11, v9, Lh40;->a:F

    .line 183
    .line 184
    :goto_3
    iget v11, v9, Lh40;->b:F

    .line 185
    .line 186
    const v12, -0x800001

    .line 187
    .line 188
    .line 189
    invoke-static {v11, v12}, Ljava/lang/Math;->max(FF)F

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    iput v11, v9, Lh40;->b:F

    .line 194
    .line 195
    invoke-static {v11, v10}, Ljava/lang/Math;->min(FF)F

    .line 196
    .line 197
    .line 198
    move-result v11

    .line 199
    iput v11, v9, Lh40;->b:F

    .line 200
    .line 201
    iget v13, v9, Lh40;->a:F

    .line 202
    .line 203
    iget-object v14, v9, Lh40;->j:Li40;

    .line 204
    .line 205
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 209
    .line 210
    .line 211
    move-result v13

    .line 212
    move v15, v8

    .line 213
    float-to-double v7, v13

    .line 214
    iget-wide v12, v14, Li40;->e:D

    .line 215
    .line 216
    cmpg-double v7, v7, v12

    .line 217
    .line 218
    if-gez v7, :cond_5

    .line 219
    .line 220
    iget-wide v7, v14, Li40;->i:D

    .line 221
    .line 222
    double-to-float v7, v7

    .line 223
    sub-float/2addr v11, v7

    .line 224
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    float-to-double v7, v7

    .line 229
    iget-wide v11, v14, Li40;->d:D

    .line 230
    .line 231
    cmpg-double v7, v7, v11

    .line 232
    .line 233
    if-gez v7, :cond_5

    .line 234
    .line 235
    iget-object v7, v9, Lh40;->j:Li40;

    .line 236
    .line 237
    iget-wide v7, v7, Li40;->i:D

    .line 238
    .line 239
    double-to-float v7, v7

    .line 240
    iput v7, v9, Lh40;->b:F

    .line 241
    .line 242
    const/4 v7, 0x0

    .line 243
    iput v7, v9, Lh40;->a:F

    .line 244
    .line 245
    move/from16 v7, p1

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_5
    const/4 v7, 0x0

    .line 249
    :goto_4
    iget v8, v9, Lh40;->b:F

    .line 250
    .line 251
    invoke-static {v8, v10}, Ljava/lang/Math;->min(FF)F

    .line 252
    .line 253
    .line 254
    move-result v8

    .line 255
    iput v8, v9, Lh40;->b:F

    .line 256
    .line 257
    const v10, -0x800001

    .line 258
    .line 259
    .line 260
    invoke-static {v8, v10}, Ljava/lang/Math;->max(FF)F

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    iput v8, v9, Lh40;->b:F

    .line 265
    .line 266
    invoke-virtual {v9, v8}, Lh40;->g(F)V

    .line 267
    .line 268
    .line 269
    if-eqz v7, :cond_6

    .line 270
    .line 271
    const/4 v7, 0x0

    .line 272
    invoke-virtual {v9, v7}, Lh40;->d(Z)V

    .line 273
    .line 274
    .line 275
    :cond_6
    :goto_5
    add-int/lit8 v8, v15, 0x1

    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :cond_7
    const/16 p1, 0x1

    .line 280
    .line 281
    iget-boolean v2, v1, Lp2;->e:Z

    .line 282
    .line 283
    if-eqz v2, :cond_a

    .line 284
    .line 285
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    add-int/lit8 v2, v2, -0x1

    .line 290
    .line 291
    :goto_6
    if-ltz v2, :cond_9

    .line 292
    .line 293
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    if-nez v3, :cond_8

    .line 298
    .line 299
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    :cond_8
    add-int/lit8 v2, v2, -0x1

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :cond_9
    const/4 v7, 0x0

    .line 306
    iput-boolean v7, v1, Lp2;->e:Z

    .line 307
    .line 308
    :cond_a
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    if-lez v2, :cond_c

    .line 313
    .line 314
    iget-object v2, v1, Lp2;->d:Lr5;

    .line 315
    .line 316
    if-nez v2, :cond_b

    .line 317
    .line 318
    new-instance v2, Lr5;

    .line 319
    .line 320
    iget-object v3, v1, Lp2;->c:Ll0;

    .line 321
    .line 322
    invoke-direct {v2, v3}, Lr5;-><init>(Ll0;)V

    .line 323
    .line 324
    .line 325
    iput-object v2, v1, Lp2;->d:Lr5;

    .line 326
    .line 327
    :cond_b
    iget-object v1, v1, Lp2;->d:Lr5;

    .line 328
    .line 329
    iget-object v2, v1, Lr5;->c:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v2, Landroid/view/Choreographer;

    .line 332
    .line 333
    iget-object v1, v1, Lr5;->d:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v1, Lo2;

    .line 336
    .line 337
    invoke-virtual {v2, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 338
    .line 339
    .line 340
    :cond_c
    return-void
.end method
