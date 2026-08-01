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
    .locals 34

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
    check-cast v9, Lo40;

    .line 35
    .line 36
    if-nez v9, :cond_1

    .line 37
    .line 38
    :cond_0
    :goto_1
    move/from16 v26, v8

    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_1
    iget-object v11, v1, Lp2;->a:Lb40;

    .line 43
    .line 44
    const/4 v12, 0x0

    .line 45
    invoke-virtual {v11, v9, v12}, Lb40;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    check-cast v12, Ljava/lang/Long;

    .line 50
    .line 51
    if-nez v12, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v12

    .line 58
    cmp-long v12, v12, v5

    .line 59
    .line 60
    if-gez v12, :cond_0

    .line 61
    .line 62
    invoke-virtual {v11, v9}, Lb40;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :goto_2
    iget v11, v9, Lo40;->f:F

    .line 66
    .line 67
    iget-wide v12, v9, Lo40;->g:J

    .line 68
    .line 69
    const-wide/16 v14, 0x0

    .line 70
    .line 71
    cmp-long v14, v12, v14

    .line 72
    .line 73
    if-nez v14, :cond_3

    .line 74
    .line 75
    iput-wide v2, v9, Lo40;->g:J

    .line 76
    .line 77
    iget v10, v9, Lo40;->b:F

    .line 78
    .line 79
    invoke-virtual {v9, v10}, Lo40;->g(F)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    sub-long v17, v2, v12

    .line 84
    .line 85
    iput-wide v2, v9, Lo40;->g:J

    .line 86
    .line 87
    iget v12, v9, Lo40;->l:F

    .line 88
    .line 89
    const v13, 0x7f7fffff    # Float.MAX_VALUE

    .line 90
    .line 91
    .line 92
    cmpl-float v12, v12, v13

    .line 93
    .line 94
    if-eqz v12, :cond_4

    .line 95
    .line 96
    iget-object v12, v9, Lo40;->k:Lp40;

    .line 97
    .line 98
    iget-wide v14, v12, Lp40;->i:D

    .line 99
    .line 100
    iget v14, v9, Lo40;->b:F

    .line 101
    .line 102
    float-to-double v14, v14

    .line 103
    const/16 p1, 0x1

    .line 104
    .line 105
    iget v10, v9, Lo40;->a:F

    .line 106
    .line 107
    move/from16 v26, v8

    .line 108
    .line 109
    float-to-double v7, v10

    .line 110
    const-wide/16 v19, 0x2

    .line 111
    .line 112
    div-long v32, v17, v19

    .line 113
    .line 114
    move-wide/from16 v22, v7

    .line 115
    .line 116
    move-object/from16 v19, v12

    .line 117
    .line 118
    move-wide/from16 v20, v14

    .line 119
    .line 120
    move-wide/from16 v24, v32

    .line 121
    .line 122
    invoke-virtual/range {v19 .. v25}, Lp40;->c(DDJ)Lth;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    iget-object v8, v9, Lo40;->k:Lp40;

    .line 127
    .line 128
    iget v10, v9, Lo40;->l:F

    .line 129
    .line 130
    float-to-double v14, v10

    .line 131
    iput-wide v14, v8, Lp40;->i:D

    .line 132
    .line 133
    iput v13, v9, Lo40;->l:F

    .line 134
    .line 135
    iget v10, v7, Lth;->a:F

    .line 136
    .line 137
    float-to-double v14, v10

    .line 138
    iget v7, v7, Lth;->b:F

    .line 139
    .line 140
    move-wide/from16 v28, v14

    .line 141
    .line 142
    float-to-double v13, v7

    .line 143
    move-object/from16 v27, v8

    .line 144
    .line 145
    move-wide/from16 v30, v13

    .line 146
    .line 147
    invoke-virtual/range {v27 .. v33}, Lp40;->c(DDJ)Lth;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    iget v8, v7, Lth;->a:F

    .line 152
    .line 153
    iput v8, v9, Lo40;->b:F

    .line 154
    .line 155
    iget v7, v7, Lth;->b:F

    .line 156
    .line 157
    iput v7, v9, Lo40;->a:F

    .line 158
    .line 159
    const v10, 0x7f7fffff    # Float.MAX_VALUE

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_4
    move/from16 v26, v8

    .line 164
    .line 165
    const/16 p1, 0x1

    .line 166
    .line 167
    iget-object v12, v9, Lo40;->k:Lp40;

    .line 168
    .line 169
    iget v7, v9, Lo40;->b:F

    .line 170
    .line 171
    float-to-double v13, v7

    .line 172
    iget v7, v9, Lo40;->a:F

    .line 173
    .line 174
    float-to-double v7, v7

    .line 175
    move-wide v15, v7

    .line 176
    const v10, 0x7f7fffff    # Float.MAX_VALUE

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Lp40;->c(DDJ)Lth;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    iget v8, v7, Lth;->a:F

    .line 184
    .line 185
    iput v8, v9, Lo40;->b:F

    .line 186
    .line 187
    iget v7, v7, Lth;->b:F

    .line 188
    .line 189
    iput v7, v9, Lo40;->a:F

    .line 190
    .line 191
    :goto_3
    iget v7, v9, Lo40;->b:F

    .line 192
    .line 193
    invoke-static {v7, v11}, Ljava/lang/Math;->max(FF)F

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    iput v7, v9, Lo40;->b:F

    .line 198
    .line 199
    invoke-static {v7, v10}, Ljava/lang/Math;->min(FF)F

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    iput v7, v9, Lo40;->b:F

    .line 204
    .line 205
    iget v8, v9, Lo40;->a:F

    .line 206
    .line 207
    iget-object v12, v9, Lo40;->k:Lp40;

    .line 208
    .line 209
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    float-to-double v13, v8

    .line 217
    move v8, v11

    .line 218
    iget-wide v10, v12, Lp40;->e:D

    .line 219
    .line 220
    cmpg-double v10, v13, v10

    .line 221
    .line 222
    if-gez v10, :cond_5

    .line 223
    .line 224
    iget-wide v10, v12, Lp40;->i:D

    .line 225
    .line 226
    double-to-float v10, v10

    .line 227
    sub-float/2addr v7, v10

    .line 228
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    float-to-double v10, v7

    .line 233
    iget-wide v12, v12, Lp40;->d:D

    .line 234
    .line 235
    cmpg-double v7, v10, v12

    .line 236
    .line 237
    if-gez v7, :cond_5

    .line 238
    .line 239
    iget-object v7, v9, Lo40;->k:Lp40;

    .line 240
    .line 241
    iget-wide v10, v7, Lp40;->i:D

    .line 242
    .line 243
    double-to-float v7, v10

    .line 244
    iput v7, v9, Lo40;->b:F

    .line 245
    .line 246
    const/4 v7, 0x0

    .line 247
    iput v7, v9, Lo40;->a:F

    .line 248
    .line 249
    move/from16 v10, p1

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_5
    const/4 v10, 0x0

    .line 253
    :goto_4
    iget v7, v9, Lo40;->b:F

    .line 254
    .line 255
    const v15, 0x7f7fffff    # Float.MAX_VALUE

    .line 256
    .line 257
    .line 258
    invoke-static {v7, v15}, Ljava/lang/Math;->min(FF)F

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    iput v7, v9, Lo40;->b:F

    .line 263
    .line 264
    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    .line 265
    .line 266
    .line 267
    move-result v7

    .line 268
    iput v7, v9, Lo40;->b:F

    .line 269
    .line 270
    invoke-virtual {v9, v7}, Lo40;->g(F)V

    .line 271
    .line 272
    .line 273
    if-eqz v10, :cond_6

    .line 274
    .line 275
    const/4 v7, 0x0

    .line 276
    invoke-virtual {v9, v7}, Lo40;->d(Z)V

    .line 277
    .line 278
    .line 279
    :cond_6
    :goto_5
    add-int/lit8 v8, v26, 0x1

    .line 280
    .line 281
    goto/16 :goto_0

    .line 282
    .line 283
    :cond_7
    const/16 p1, 0x1

    .line 284
    .line 285
    iget-boolean v2, v1, Lp2;->e:Z

    .line 286
    .line 287
    if-eqz v2, :cond_a

    .line 288
    .line 289
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    add-int/lit8 v2, v2, -0x1

    .line 294
    .line 295
    :goto_6
    if-ltz v2, :cond_9

    .line 296
    .line 297
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    if-nez v3, :cond_8

    .line 302
    .line 303
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    :cond_8
    add-int/lit8 v2, v2, -0x1

    .line 307
    .line 308
    goto :goto_6

    .line 309
    :cond_9
    const/4 v7, 0x0

    .line 310
    iput-boolean v7, v1, Lp2;->e:Z

    .line 311
    .line 312
    :cond_a
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    if-lez v2, :cond_c

    .line 317
    .line 318
    iget-object v2, v1, Lp2;->d:Lr5;

    .line 319
    .line 320
    if-nez v2, :cond_b

    .line 321
    .line 322
    new-instance v2, Lr5;

    .line 323
    .line 324
    iget-object v3, v1, Lp2;->c:Ll0;

    .line 325
    .line 326
    invoke-direct {v2, v3}, Lr5;-><init>(Ll0;)V

    .line 327
    .line 328
    .line 329
    iput-object v2, v1, Lp2;->d:Lr5;

    .line 330
    .line 331
    :cond_b
    iget-object v1, v1, Lp2;->d:Lr5;

    .line 332
    .line 333
    iget-object v2, v1, Lr5;->c:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v2, Landroid/view/Choreographer;

    .line 336
    .line 337
    iget-object v1, v1, Lr5;->d:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v1, Lo2;

    .line 340
    .line 341
    invoke-virtual {v2, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 342
    .line 343
    .line 344
    :cond_c
    return-void
.end method
