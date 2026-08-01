.class public abstract Lnb1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final synthetic a:I


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
    new-array v0, v10, [Lr3;

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
    new-instance v12, Lr3;

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
    invoke-direct {v12, v5}, Lr3;-><init>(I)V

    .line 69
    .line 70
    .line 71
    sub-float/2addr v11, v13

    .line 72
    sub-float v13, v14, v15

    .line 73
    .line 74
    const/16 v4, 0x65

    .line 75
    .line 76
    new-array v5, v4, [F

    .line 77
    .line 78
    if-ne v1, v6, :cond_6

    .line 79
    .line 80
    :cond_5
    :goto_2
    move/from16 v20, v7

    .line 81
    .line 82
    move-object/from16 v21, v8

    .line 83
    .line 84
    move v7, v3

    .line 85
    goto/16 :goto_7

    .line 86
    .line 87
    :cond_6
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 88
    .line 89
    .line 90
    move-result v16

    .line 91
    const v17, 0x3a83126f    # 0.001f

    .line 92
    .line 93
    .line 94
    cmpg-float v16, v16, v17

    .line 95
    .line 96
    if-ltz v16, :cond_5

    .line 97
    .line 98
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 99
    .line 100
    .line 101
    move-result v16

    .line 102
    cmpg-float v16, v16, v17

    .line 103
    .line 104
    if-gez v16, :cond_7

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_7
    sub-float/2addr v15, v14

    .line 108
    sget-object v13, Lp30;->a:[F

    .line 109
    .line 110
    move v6, v7

    .line 111
    move/from16 v20, v6

    .line 112
    .line 113
    move-object/from16 v21, v8

    .line 114
    .line 115
    move/from16 v19, v15

    .line 116
    .line 117
    const/16 v17, 0x0

    .line 118
    .line 119
    const/16 v18, 0x0

    .line 120
    .line 121
    :goto_3
    int-to-double v7, v6

    .line 122
    const-wide v22, 0x4056800000000000L    # 90.0

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    mul-double v7, v7, v22

    .line 128
    .line 129
    div-double v7, v7, v22

    .line 130
    .line 131
    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    .line 132
    .line 133
    .line 134
    move-result-wide v7

    .line 135
    double-to-float v7, v7

    .line 136
    float-to-double v7, v7

    .line 137
    move/from16 v22, v15

    .line 138
    .line 139
    const/16 v23, 0x0

    .line 140
    .line 141
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 142
    .line 143
    .line 144
    move-result-wide v14

    .line 145
    double-to-float v14, v14

    .line 146
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 147
    .line 148
    .line 149
    move-result-wide v7

    .line 150
    double-to-float v7, v7

    .line 151
    mul-float/2addr v14, v11

    .line 152
    mul-float v15, v22, v7

    .line 153
    .line 154
    sub-float v7, v14, v18

    .line 155
    .line 156
    float-to-double v7, v7

    .line 157
    sub-float v3, v15, v19

    .line 158
    .line 159
    move-object/from16 v24, v5

    .line 160
    .line 161
    float-to-double v4, v3

    .line 162
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    .line 163
    .line 164
    .line 165
    move-result-wide v3

    .line 166
    double-to-float v3, v3

    .line 167
    add-float v17, v17, v3

    .line 168
    .line 169
    aput v17, v13, v6

    .line 170
    .line 171
    const/16 v3, 0x5a

    .line 172
    .line 173
    if-eq v6, v3, :cond_8

    .line 174
    .line 175
    add-int/lit8 v6, v6, 0x1

    .line 176
    .line 177
    move/from16 v18, v14

    .line 178
    .line 179
    move/from16 v19, v15

    .line 180
    .line 181
    move/from16 v15, v22

    .line 182
    .line 183
    move-object/from16 v5, v24

    .line 184
    .line 185
    const/4 v3, 0x0

    .line 186
    const/16 v4, 0x65

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_8
    move/from16 v4, v20

    .line 190
    .line 191
    :goto_4
    aget v5, v13, v4

    .line 192
    .line 193
    div-float v5, v5, v17

    .line 194
    .line 195
    aput v5, v13, v4

    .line 196
    .line 197
    if-eq v4, v3, :cond_9

    .line 198
    .line 199
    add-int/lit8 v4, v4, 0x1

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_9
    const/4 v3, 0x0

    .line 203
    const/16 v4, 0x65

    .line 204
    .line 205
    :goto_5
    if-ge v3, v4, :cond_c

    .line 206
    .line 207
    int-to-float v5, v3

    .line 208
    const/high16 v6, 0x42c80000    # 100.0f

    .line 209
    .line 210
    div-float/2addr v5, v6

    .line 211
    const/16 v6, 0x5b

    .line 212
    .line 213
    const/4 v7, 0x0

    .line 214
    invoke-static {v13, v7, v6, v5}, Ljava/util/Arrays;->binarySearch([FIIF)I

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    const/high16 v8, 0x42b40000    # 90.0f

    .line 219
    .line 220
    if-ltz v6, :cond_a

    .line 221
    .line 222
    int-to-float v5, v6

    .line 223
    div-float/2addr v5, v8

    .line 224
    aput v5, v24, v3

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_a
    const/4 v11, -0x1

    .line 228
    if-ne v6, v11, :cond_b

    .line 229
    .line 230
    aput v23, v24, v3

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_b
    neg-int v6, v6

    .line 234
    add-int/lit8 v11, v6, -0x2

    .line 235
    .line 236
    add-int/lit8 v6, v6, -0x1

    .line 237
    .line 238
    int-to-float v14, v11

    .line 239
    aget v11, v13, v11

    .line 240
    .line 241
    sub-float/2addr v5, v11

    .line 242
    aget v6, v13, v6

    .line 243
    .line 244
    sub-float/2addr v6, v11

    .line 245
    div-float/2addr v5, v6

    .line 246
    add-float/2addr v5, v14

    .line 247
    div-float/2addr v5, v8

    .line 248
    aput v5, v24, v3

    .line 249
    .line 250
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_c
    const/4 v7, 0x0

    .line 254
    goto :goto_8

    .line 255
    :goto_7
    float-to-double v3, v13

    .line 256
    float-to-double v5, v11

    .line 257
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    .line 258
    .line 259
    .line 260
    :goto_8
    aput-object v12, v0, v9

    .line 261
    .line 262
    add-int/lit8 v9, v9, 0x1

    .line 263
    .line 264
    move v3, v7

    .line 265
    move/from16 v7, v20

    .line 266
    .line 267
    move-object/from16 v8, v21

    .line 268
    .line 269
    const/4 v4, 0x5

    .line 270
    const/4 v5, 0x4

    .line 271
    const/4 v6, 0x3

    .line 272
    goto/16 :goto_1

    .line 273
    .line 274
    :cond_d
    return-void
.end method
