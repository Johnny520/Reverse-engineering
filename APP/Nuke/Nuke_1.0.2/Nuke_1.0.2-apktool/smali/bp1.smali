.class public final synthetic Lbp1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:J

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLx13;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lbp1;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lbp1;->i:J

    .line 8
    .line 9
    iput-object p3, p0, Lbp1;->j:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lep1;J)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lbp1;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbp1;->j:Ljava/lang/Object;

    iput-wide p2, p0, Lbp1;->i:J

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lbp1;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    iget-object v3, v0, Lbp1;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iget-wide v4, v0, Lbp1;->i:J

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v3, Lx13;

    .line 15
    .line 16
    move-object/from16 v6, p1

    .line 17
    .line 18
    check-cast v6, Lnc0;

    .line 19
    .line 20
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const/high16 v0, 0x41400000    # 12.0f

    .line 24
    .line 25
    invoke-interface {v6, v0}, Le70;->A(F)F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-interface {v6, v0}, Le70;->A(F)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    int-to-long v7, v1

    .line 38
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    int-to-long v0, v0

    .line 43
    const/16 v16, 0x20

    .line 44
    .line 45
    shl-long v7, v7, v16

    .line 46
    .line 47
    const-wide v17, 0xffffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long v0, v0, v17

    .line 53
    .line 54
    or-long v12, v7, v0

    .line 55
    .line 56
    sget-wide v0, Lju;->c:J

    .line 57
    .line 58
    new-instance v7, Lju;

    .line 59
    .line 60
    invoke-direct {v7, v0, v1}, Lju;-><init>(J)V

    .line 61
    .line 62
    .line 63
    new-instance v8, Lju;

    .line 64
    .line 65
    invoke-direct {v8, v4, v5}, Lju;-><init>(J)V

    .line 66
    .line 67
    .line 68
    filled-new-array {v7, v8}, [Lju;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {v4}, Leu;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {v4}, Lz8;->l(Ljava/util/List;)Lbb1;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    const/4 v14, 0x0

    .line 81
    const/16 v15, 0xf6

    .line 82
    .line 83
    const-wide/16 v8, 0x0

    .line 84
    .line 85
    const-wide/16 v10, 0x0

    .line 86
    .line 87
    invoke-static/range {v6 .. v15}, Lnc0;->s0(Lnc0;Lan;JJJLop0;I)V

    .line 88
    .line 89
    .line 90
    sget-wide v4, Lju;->f:J

    .line 91
    .line 92
    new-instance v7, Lju;

    .line 93
    .line 94
    invoke-direct {v7, v4, v5}, Lju;-><init>(J)V

    .line 95
    .line 96
    .line 97
    sget-wide v4, Lju;->b:J

    .line 98
    .line 99
    new-instance v8, Lju;

    .line 100
    .line 101
    invoke-direct {v8, v4, v5}, Lju;-><init>(J)V

    .line 102
    .line 103
    .line 104
    filled-new-array {v7, v8}, [Lju;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-static {v7}, Leu;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v20

    .line 112
    const/4 v7, 0x0

    .line 113
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    int-to-long v8, v8

    .line 118
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    int-to-long v10, v10

    .line 123
    shl-long v8, v8, v16

    .line 124
    .line 125
    and-long v10, v10, v17

    .line 126
    .line 127
    or-long v21, v8, v10

    .line 128
    .line 129
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    int-to-long v8, v8

    .line 134
    const/high16 v10, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 135
    .line 136
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    int-to-long v10, v10

    .line 141
    shl-long v8, v8, v16

    .line 142
    .line 143
    and-long v10, v10, v17

    .line 144
    .line 145
    or-long v23, v8, v10

    .line 146
    .line 147
    new-instance v19, Lbb1;

    .line 148
    .line 149
    invoke-direct/range {v19 .. v24}, Lbb1;-><init>(Ljava/util/List;JJ)V

    .line 150
    .line 151
    .line 152
    const-wide/16 v8, 0x0

    .line 153
    .line 154
    const-wide/16 v10, 0x0

    .line 155
    .line 156
    move-wide/from16 p0, v0

    .line 157
    .line 158
    move v0, v7

    .line 159
    move-object/from16 v7, v19

    .line 160
    .line 161
    invoke-static/range {v6 .. v15}, Lnc0;->s0(Lnc0;Lan;JJJLop0;I)V

    .line 162
    .line 163
    .line 164
    iget v1, v3, Lx13;->b:F

    .line 165
    .line 166
    const/high16 v7, 0x3f800000    # 1.0f

    .line 167
    .line 168
    invoke-static {v1, v0, v7}, Lci0;->C(FFF)F

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    invoke-interface {v6}, Lnc0;->d()J

    .line 173
    .line 174
    .line 175
    move-result-wide v8

    .line 176
    shr-long v8, v8, v16

    .line 177
    .line 178
    long-to-int v8, v8

    .line 179
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    mul-float/2addr v8, v1

    .line 184
    iget v1, v3, Lx13;->c:F

    .line 185
    .line 186
    invoke-static {v1, v0, v7}, Lci0;->C(FFF)F

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    sub-float/2addr v7, v0

    .line 191
    invoke-interface {v6}, Lnc0;->d()J

    .line 192
    .line 193
    .line 194
    move-result-wide v0

    .line 195
    and-long v0, v0, v17

    .line 196
    .line 197
    long-to-int v0, v0

    .line 198
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    mul-float/2addr v0, v7

    .line 203
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    int-to-long v7, v1

    .line 208
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    int-to-long v0, v0

    .line 213
    shl-long v7, v7, v16

    .line 214
    .line 215
    and-long v0, v0, v17

    .line 216
    .line 217
    or-long v10, v7, v0

    .line 218
    .line 219
    const v0, 0x3f147ae1    # 0.58f

    .line 220
    .line 221
    .line 222
    invoke-static {v0, v4, v5}, Lju;->b(FJ)J

    .line 223
    .line 224
    .line 225
    move-result-wide v7

    .line 226
    const/high16 v0, 0x41100000    # 9.0f

    .line 227
    .line 228
    invoke-interface {v6, v0}, Le70;->A(F)F

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    new-instance v12, Lxv2;

    .line 233
    .line 234
    const/high16 v0, 0x40400000    # 3.0f

    .line 235
    .line 236
    invoke-interface {v6, v0}, Le70;->A(F)F

    .line 237
    .line 238
    .line 239
    move-result v13

    .line 240
    const/16 v16, 0x0

    .line 241
    .line 242
    const/16 v17, 0x1e

    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    const/4 v15, 0x0

    .line 246
    invoke-direct/range {v12 .. v17}, Lxv2;-><init>(FFIII)V

    .line 247
    .line 248
    .line 249
    const/16 v13, 0x68

    .line 250
    .line 251
    invoke-static/range {v6 .. v13}, Lnc0;->O(Lnc0;JFJLxv2;I)V

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x41000000    # 8.0f

    .line 255
    .line 256
    invoke-interface {v6, v0}, Le70;->A(F)F

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    new-instance v12, Lxv2;

    .line 261
    .line 262
    const/high16 v0, 0x40000000    # 2.0f

    .line 263
    .line 264
    invoke-interface {v6, v0}, Le70;->A(F)F

    .line 265
    .line 266
    .line 267
    move-result v13

    .line 268
    invoke-direct/range {v12 .. v17}, Lxv2;-><init>(FFIII)V

    .line 269
    .line 270
    .line 271
    const/16 v13, 0x68

    .line 272
    .line 273
    move-wide/from16 v7, p0

    .line 274
    .line 275
    invoke-static/range {v6 .. v13}, Lnc0;->O(Lnc0;JFJLxv2;I)V

    .line 276
    .line 277
    .line 278
    return-object v2

    .line 279
    :pswitch_0
    check-cast v3, Lep1;

    .line 280
    .line 281
    move-object/from16 v0, p1

    .line 282
    .line 283
    check-cast v0, Lsc;

    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    iget-wide v6, v3, Lep1;->e:J

    .line 289
    .line 290
    cmp-long v1, v6, v4

    .line 291
    .line 292
    if-nez v1, :cond_0

    .line 293
    .line 294
    invoke-virtual {v0}, Lsc;->d()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    check-cast v0, Ljava/lang/Number;

    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    const v1, 0x3f7fbe77    # 0.999f

    .line 305
    .line 306
    .line 307
    cmpl-float v0, v0, v1

    .line 308
    .line 309
    if-ltz v0, :cond_0

    .line 310
    .line 311
    const/4 v0, 0x0

    .line 312
    invoke-virtual {v3, v0}, Lep1;->f(Z)V

    .line 313
    .line 314
    .line 315
    :cond_0
    return-object v2

    .line 316
    nop

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
