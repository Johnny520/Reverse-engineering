.class public abstract Lm72;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final synthetic α:I


# direct methods
.method static constructor <clinit>()V
    .locals 25

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    new-array v2, v0, [F

    .line 5
    .line 6
    new-array v3, v0, [F

    .line 7
    .line 8
    filled-new-array {v2, v3}, [[F

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    aget v1, v1, v3

    .line 14
    .line 15
    const/4 v4, 0x5

    .line 16
    const/4 v5, 0x4

    .line 17
    const/4 v6, 0x3

    .line 18
    const/4 v7, 0x1

    .line 19
    if-eqz v1, :cond_4

    .line 20
    .line 21
    if-eq v1, v7, :cond_0

    .line 22
    .line 23
    if-eq v1, v0, :cond_3

    .line 24
    .line 25
    if-eq v1, v6, :cond_3

    .line 26
    .line 27
    if-eq v1, v5, :cond_2

    .line 28
    .line 29
    if-eq v1, v4, :cond_1

    .line 30
    .line 31
    :cond_0
    move v1, v7

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v1, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move v1, v5

    .line 36
    goto :goto_0

    .line 37
    :cond_3
    move v1, v0

    .line 38
    goto :goto_0

    .line 39
    :cond_4
    move v1, v6

    .line 40
    :goto_0
    aget-object v8, v2, v3

    .line 41
    .line 42
    aget-object v2, v2, v7

    .line 43
    .line 44
    array-length v9, v8

    .line 45
    div-int/2addr v9, v0

    .line 46
    array-length v10, v8

    .line 47
    rem-int/2addr v10, v0

    .line 48
    add-int/2addr v10, v9

    .line 49
    new-array v0, v10, [Li2;

    .line 50
    .line 51
    move v9, v3

    .line 52
    :goto_1
    if-ge v9, v10, :cond_d

    .line 53
    .line 54
    mul-int/lit8 v11, v9, 0x2

    .line 55
    .line 56
    new-instance v12, Li2;

    .line 57
    .line 58
    aget v13, v8, v11

    .line 59
    .line 60
    add-int/lit8 v14, v11, 0x1

    .line 61
    .line 62
    aget v15, v8, v14

    .line 63
    .line 64
    aget v11, v2, v11

    .line 65
    .line 66
    aget v14, v2, v14

    .line 67
    .line 68
    const/4 v3, 0x4

    .line 69
    invoke-direct {v12, v3}, Li2;-><init>(I)V

    .line 70
    .line 71
    .line 72
    sub-float/2addr v11, v13

    .line 73
    sub-float v3, v14, v15

    .line 74
    .line 75
    const/16 v13, 0x65

    .line 76
    .line 77
    new-array v4, v13, [F

    .line 78
    .line 79
    if-ne v1, v6, :cond_6

    .line 80
    .line 81
    :cond_5
    :goto_2
    move-object/from16 v22, v0

    .line 82
    .line 83
    move/from16 v21, v1

    .line 84
    .line 85
    move/from16 v23, v7

    .line 86
    .line 87
    move-object/from16 v24, v8

    .line 88
    .line 89
    move/from16 v20, v9

    .line 90
    .line 91
    const/4 v7, 0x0

    .line 92
    goto/16 :goto_7

    .line 93
    .line 94
    :cond_6
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 95
    .line 96
    .line 97
    move-result v16

    .line 98
    const v17, 0x3a83126f    # 0.001f

    .line 99
    .line 100
    .line 101
    cmpg-float v16, v16, v17

    .line 102
    .line 103
    if-ltz v16, :cond_5

    .line 104
    .line 105
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 106
    .line 107
    .line 108
    move-result v16

    .line 109
    cmpg-float v16, v16, v17

    .line 110
    .line 111
    if-gez v16, :cond_7

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_7
    sub-float/2addr v15, v14

    .line 115
    sget-object v3, Lkn0;->α:[F

    .line 116
    .line 117
    const/16 v14, 0x5a

    .line 118
    .line 119
    int-to-float v5, v14

    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    move v6, v7

    .line 123
    move/from16 v20, v15

    .line 124
    .line 125
    move/from16 v18, v17

    .line 126
    .line 127
    move/from16 v19, v18

    .line 128
    .line 129
    :goto_3
    const-wide v21, 0x4056800000000000L    # 90.0

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    move/from16 v23, v7

    .line 135
    .line 136
    move-object/from16 v24, v8

    .line 137
    .line 138
    int-to-double v7, v6

    .line 139
    mul-double v7, v7, v21

    .line 140
    .line 141
    move-object/from16 v22, v0

    .line 142
    .line 143
    move/from16 v21, v1

    .line 144
    .line 145
    int-to-double v0, v14

    .line 146
    div-double/2addr v7, v0

    .line 147
    const-wide v0, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    mul-double/2addr v7, v0

    .line 153
    double-to-float v0, v7

    .line 154
    float-to-double v0, v0

    .line 155
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 156
    .line 157
    .line 158
    move-result-wide v7

    .line 159
    double-to-float v7, v7

    .line 160
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 161
    .line 162
    .line 163
    move-result-wide v0

    .line 164
    double-to-float v0, v0

    .line 165
    mul-float/2addr v7, v11

    .line 166
    mul-float/2addr v0, v15

    .line 167
    sub-float v1, v7, v19

    .line 168
    .line 169
    float-to-double v13, v1

    .line 170
    sub-float v1, v0, v20

    .line 171
    .line 172
    move/from16 v20, v9

    .line 173
    .line 174
    float-to-double v8, v1

    .line 175
    invoke-static {v13, v14, v8, v9}, Ljava/lang/Math;->hypot(DD)D

    .line 176
    .line 177
    .line 178
    move-result-wide v8

    .line 179
    double-to-float v1, v8

    .line 180
    add-float v18, v18, v1

    .line 181
    .line 182
    aput v18, v3, v6

    .line 183
    .line 184
    const/16 v1, 0x5a

    .line 185
    .line 186
    if-eq v6, v1, :cond_8

    .line 187
    .line 188
    add-int/lit8 v6, v6, 0x1

    .line 189
    .line 190
    move v14, v1

    .line 191
    move/from16 v19, v7

    .line 192
    .line 193
    move/from16 v9, v20

    .line 194
    .line 195
    move/from16 v1, v21

    .line 196
    .line 197
    move/from16 v7, v23

    .line 198
    .line 199
    move-object/from16 v8, v24

    .line 200
    .line 201
    const/16 v13, 0x65

    .line 202
    .line 203
    move/from16 v20, v0

    .line 204
    .line 205
    move-object/from16 v0, v22

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_8
    move/from16 v0, v23

    .line 209
    .line 210
    :goto_4
    aget v6, v3, v0

    .line 211
    .line 212
    div-float v6, v6, v18

    .line 213
    .line 214
    aput v6, v3, v0

    .line 215
    .line 216
    if-eq v0, v1, :cond_9

    .line 217
    .line 218
    add-int/lit8 v0, v0, 0x1

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_9
    const/4 v0, 0x0

    .line 222
    const/16 v8, 0x65

    .line 223
    .line 224
    :goto_5
    if-ge v0, v8, :cond_c

    .line 225
    .line 226
    int-to-float v1, v0

    .line 227
    const/high16 v6, 0x42c80000    # 100.0f

    .line 228
    .line 229
    div-float/2addr v1, v6

    .line 230
    const/16 v6, 0x5b

    .line 231
    .line 232
    const/4 v7, 0x0

    .line 233
    invoke-static {v3, v7, v6, v1}, Ljava/util/Arrays;->binarySearch([FIIF)I

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    if-ltz v6, :cond_a

    .line 238
    .line 239
    int-to-float v1, v6

    .line 240
    div-float/2addr v1, v5

    .line 241
    aput v1, v4, v0

    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_a
    const/4 v9, -0x1

    .line 245
    if-ne v6, v9, :cond_b

    .line 246
    .line 247
    aput v17, v4, v0

    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_b
    neg-int v6, v6

    .line 251
    add-int/lit8 v9, v6, -0x2

    .line 252
    .line 253
    add-int/lit8 v6, v6, -0x1

    .line 254
    .line 255
    int-to-float v11, v9

    .line 256
    aget v9, v3, v9

    .line 257
    .line 258
    sub-float/2addr v1, v9

    .line 259
    aget v6, v3, v6

    .line 260
    .line 261
    sub-float/2addr v6, v9

    .line 262
    div-float/2addr v1, v6

    .line 263
    add-float/2addr v1, v11

    .line 264
    div-float/2addr v1, v5

    .line 265
    aput v1, v4, v0

    .line 266
    .line 267
    :goto_6
    add-int/lit8 v0, v0, 0x1

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_c
    const/4 v7, 0x0

    .line 271
    goto :goto_8

    .line 272
    :goto_7
    float-to-double v0, v3

    .line 273
    float-to-double v3, v11

    .line 274
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->hypot(DD)D

    .line 275
    .line 276
    .line 277
    :goto_8
    aput-object v12, v22, v20

    .line 278
    .line 279
    add-int/lit8 v9, v20, 0x1

    .line 280
    .line 281
    move v3, v7

    .line 282
    move/from16 v1, v21

    .line 283
    .line 284
    move-object/from16 v0, v22

    .line 285
    .line 286
    move/from16 v7, v23

    .line 287
    .line 288
    move-object/from16 v8, v24

    .line 289
    .line 290
    const/4 v4, 0x5

    .line 291
    const/4 v5, 0x4

    .line 292
    const/4 v6, 0x3

    .line 293
    goto/16 :goto_1

    .line 294
    .line 295
    :cond_d
    return-void
.end method
