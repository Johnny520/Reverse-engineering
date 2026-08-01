.class public final synthetic Luv;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:I

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Luv;->ε:I

    iput-object p3, p0, Luv;->η:Ljava/lang/Object;

    iput p1, p0, Luv;->ζ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/Collection;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Luv;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Luv;->ζ:I

    .line 8
    .line 9
    iput-object p2, p0, Luv;->η:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Luv;->ε:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Luv;->η:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/Collection;

    .line 11
    .line 12
    move-object/from16 v2, p1

    .line 13
    .line 14
    check-cast v2, Ljava/util/List;

    .line 15
    .line 16
    iget v0, v0, Luv;->ζ:I

    .line 17
    .line 18
    invoke-interface {v2, v0, v1}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :pswitch_0
    iget-object v1, v0, Luv;->η:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Ld81;

    .line 30
    .line 31
    move-object/from16 v2, p1

    .line 32
    .line 33
    check-cast v2, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget v0, v0, Luv;->ζ:I

    .line 39
    .line 40
    if-ltz v0, :cond_0

    .line 41
    .line 42
    iget-object v3, v1, Ld81;->κ:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-ge v0, v3, :cond_0

    .line 49
    .line 50
    iget-object v3, v1, Ld81;->κ:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v3, v0, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    iget-object v0, v1, Ld81;->κ:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {v0}, Le81;->π(Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ld81;->γ()V

    .line 61
    .line 62
    .line 63
    :cond_0
    sget-object v0, Ls62;->α:Ls62;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_1
    iget-object v1, v0, Luv;->η:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Law;

    .line 69
    .line 70
    move-object/from16 v2, p1

    .line 71
    .line 72
    check-cast v2, Lcw;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v3, v1, Law;->τ:Lep0;

    .line 78
    .line 79
    iget-object v4, v1, Law;->Γ:Lyv;

    .line 80
    .line 81
    iget-object v5, v1, Law;->Κ:Lx91;

    .line 82
    .line 83
    invoke-virtual {v5}, Lx91;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    check-cast v5, Lmp0;

    .line 88
    .line 89
    iget-object v1, v1, Law;->χ:La80;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    if-nez v5, :cond_1

    .line 98
    .line 99
    goto/16 :goto_4

    .line 100
    .line 101
    :cond_1
    iget-object v6, v3, Lep0;->γ:Lx91;

    .line 102
    .line 103
    invoke-virtual {v6}, Lx91;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    check-cast v6, Lmp0;

    .line 108
    .line 109
    if-nez v6, :cond_2

    .line 110
    .line 111
    goto/16 :goto_4

    .line 112
    .line 113
    :cond_2
    const-wide/16 v7, 0x0

    .line 114
    .line 115
    :try_start_0
    invoke-interface {v6, v5, v7, v8}, Lmp0;->Ω(Lmp0;J)J

    .line 116
    .line 117
    .line 118
    move-result-wide v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    goto :goto_0

    .line 120
    :catch_0
    invoke-interface {v5, v7, v8}, Lmp0;->ι(J)J

    .line 121
    .line 122
    .line 123
    move-result-wide v9

    .line 124
    invoke-interface {v6, v7, v8}, Lmp0;->ι(J)J

    .line 125
    .line 126
    .line 127
    move-result-wide v5

    .line 128
    invoke-static {v9, v10, v5, v6}, Lo41;->β(JJ)J

    .line 129
    .line 130
    .line 131
    move-result-wide v5

    .line 132
    :goto_0
    iget-wide v9, v4, Lyv;->η:J

    .line 133
    .line 134
    invoke-interface {v2}, Lcw;->Β()Lm6;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    invoke-virtual {v11}, Lm6;->Ζ()J

    .line 139
    .line 140
    .line 141
    move-result-wide v12

    .line 142
    invoke-virtual {v11}, Lm6;->υ()Lde;

    .line 143
    .line 144
    .line 145
    move-result-object v14

    .line 146
    invoke-interface {v14}, Lde;->θ()V

    .line 147
    .line 148
    .line 149
    :try_start_1
    iget-object v14, v11, Lm6;->ζ:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v14, Ln;

    .line 152
    .line 153
    const/high16 p1, 0x3f800000    # 1.0f

    .line 154
    .line 155
    if-eqz v1, :cond_6

    .line 156
    .line 157
    const/16 v16, 0x0

    .line 158
    .line 159
    invoke-virtual {v3}, Lep0;->α()Ltn0;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    iget-object v7, v14, Ln;->ζ:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v7, Lm6;

    .line 166
    .line 167
    const-wide v17, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    cmp-long v8, v9, v17

    .line 173
    .line 174
    if-eqz v8, :cond_3

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_3
    invoke-virtual {v7}, Lm6;->Ζ()J

    .line 178
    .line 179
    .line 180
    move-result-wide v9

    .line 181
    :goto_1
    iput-wide v9, v15, Ltn0;->ε:J

    .line 182
    .line 183
    invoke-virtual {v4}, Lyv;->β()F

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    iput v7, v15, Ltn0;->ζ:F

    .line 188
    .line 189
    invoke-virtual {v4}, Lyv;->θ()F

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    iput v4, v15, Ltn0;->η:F

    .line 194
    .line 195
    invoke-interface {v1, v15}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    iget v1, v15, Ltn0;->θ:F

    .line 199
    .line 200
    iget v4, v15, Ltn0;->ι:F

    .line 201
    .line 202
    cmpg-float v7, v1, v16

    .line 203
    .line 204
    if-nez v7, :cond_4

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_4
    cmpg-float v7, v4, v16

    .line 208
    .line 209
    if-nez v7, :cond_5

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_5
    div-float v15, p1, v1

    .line 213
    .line 214
    div-float v1, p1, v4

    .line 215
    .line 216
    const-wide/16 v7, 0x0

    .line 217
    .line 218
    invoke-virtual {v14, v15, v1, v7, v8}, Ln;->Ε(FFJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :catchall_0
    move-exception v0

    .line 223
    goto :goto_5

    .line 224
    :cond_6
    const/16 v16, 0x0

    .line 225
    .line 226
    :goto_2
    const/4 v1, 0x1

    .line 227
    iget v0, v0, Luv;->ζ:I

    .line 228
    .line 229
    const-wide v7, 0xffffffffL

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    const/16 v4, 0x20

    .line 235
    .line 236
    if-le v0, v1, :cond_7

    .line 237
    .line 238
    int-to-float v0, v0

    .line 239
    div-float v15, p1, v0

    .line 240
    .line 241
    shr-long v9, v5, v4

    .line 242
    .line 243
    long-to-int v1, v9

    .line 244
    :try_start_2
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    mul-float/2addr v1, v15

    .line 249
    and-long v4, v5, v7

    .line 250
    .line 251
    long-to-int v4, v4

    .line 252
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    mul-float/2addr v4, v15

    .line 257
    const/high16 v5, 0x3f000000    # 0.5f

    .line 258
    .line 259
    mul-float v6, v1, v5

    .line 260
    .line 261
    float-to-double v6, v6

    .line 262
    invoke-static {v6, v7}, Ljava/lang/Math;->rint(D)D

    .line 263
    .line 264
    .line 265
    move-result-wide v6

    .line 266
    double-to-float v6, v6

    .line 267
    float-to-int v6, v6

    .line 268
    int-to-float v6, v6

    .line 269
    const/high16 v7, 0x40000000    # 2.0f

    .line 270
    .line 271
    mul-float/2addr v6, v7

    .line 272
    mul-float/2addr v5, v4

    .line 273
    float-to-double v8, v5

    .line 274
    invoke-static {v8, v9}, Ljava/lang/Math;->rint(D)D

    .line 275
    .line 276
    .line 277
    move-result-wide v8

    .line 278
    double-to-float v5, v8

    .line 279
    float-to-int v5, v5

    .line 280
    int-to-float v5, v5

    .line 281
    mul-float/2addr v5, v7

    .line 282
    sub-float/2addr v1, v6

    .line 283
    mul-float/2addr v1, v0

    .line 284
    iput v1, v3, Lep0;->δ:F

    .line 285
    .line 286
    sub-float/2addr v4, v5

    .line 287
    mul-float/2addr v4, v0

    .line 288
    iput v4, v3, Lep0;->ε:F

    .line 289
    .line 290
    neg-float v0, v6

    .line 291
    neg-float v1, v5

    .line 292
    invoke-virtual {v14, v0, v1}, Ln;->Η(FF)V

    .line 293
    .line 294
    .line 295
    const-wide/16 v7, 0x0

    .line 296
    .line 297
    invoke-virtual {v14, v15, v15, v7, v8}, Ln;->Ε(FFJ)V

    .line 298
    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_7
    move/from16 v0, v16

    .line 302
    .line 303
    iput v0, v3, Lep0;->δ:F

    .line 304
    .line 305
    iput v0, v3, Lep0;->ε:F

    .line 306
    .line 307
    shr-long v0, v5, v4

    .line 308
    .line 309
    long-to-int v0, v0

    .line 310
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    neg-float v0, v0

    .line 315
    and-long v4, v5, v7

    .line 316
    .line 317
    long-to-int v1, v4

    .line 318
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    neg-float v1, v1

    .line 323
    invoke-virtual {v14, v0, v1}, Ln;->Η(FF)V

    .line 324
    .line 325
    .line 326
    :goto_3
    iget-object v0, v3, Lep0;->α:Lwa0;

    .line 327
    .line 328
    invoke-static {v2, v0}, Lln0;->φ(Lcw;Lwa0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 329
    .line 330
    .line 331
    invoke-virtual {v11}, Lm6;->υ()Lde;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-interface {v0}, Lde;->ζ()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v11, v12, v13}, Lm6;->Υ(J)V

    .line 339
    .line 340
    .line 341
    :goto_4
    sget-object v0, Ls62;->α:Ls62;

    .line 342
    .line 343
    return-object v0

    .line 344
    :goto_5
    invoke-virtual {v11}, Lm6;->υ()Lde;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-interface {v1}, Lde;->ζ()V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v11, v12, v13}, Lm6;->Υ(J)V

    .line 352
    .line 353
    .line 354
    throw v0

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
