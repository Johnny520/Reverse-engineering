.class public final Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final synthetic μ:I


# instance fields
.field public final ε:Landroid/graphics/Paint;

.field public final ζ:Landroid/graphics/Paint;

.field public final η:Landroid/graphics/Paint;

.field public final θ:Landroid/graphics/Paint;

.field public final ι:Landroid/graphics/Path;

.field public κ:Ljava/util/List;

.field public λ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/app/Activity;II)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Landroid/graphics/Paint;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 14
    .line 15
    .line 16
    const/high16 p3, 0x3f800000    # 1.0f

    .line 17
    .line 18
    invoke-virtual {p0, p3}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 23
    .line 24
    .line 25
    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 26
    .line 27
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->ε:Landroid/graphics/Paint;

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const/4 v1, 0x2

    .line 49
    const/high16 v2, 0x41100000    # 9.0f

    .line 50
    .line 51
    invoke-static {v1, v2, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 56
    .line 57
    .line 58
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->ζ:Landroid/graphics/Paint;

    .line 64
    .line 65
    new-instance p1, Landroid/graphics/Paint;

    .line 66
    .line 67
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 68
    .line 69
    .line 70
    const/high16 v1, 0x40000000    # 2.0f

    .line 71
    .line 72
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 77
    .line 78
    .line 79
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 80
    .line 81
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 82
    .line 83
    .line 84
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 85
    .line 86
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->η:Landroid/graphics/Paint;

    .line 93
    .line 94
    new-instance p1, Landroid/graphics/Paint;

    .line 95
    .line 96
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->θ:Landroid/graphics/Paint;

    .line 103
    .line 104
    new-instance p1, Landroid/graphics/Path;

    .line 105
    .line 106
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->ι:Landroid/graphics/Path;

    .line 110
    .line 111
    sget-object p1, Ljz;->ε:Ljz;

    .line 112
    .line 113
    iput-object p1, p0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->κ:Ljava/util/List;

    .line 114
    .line 115
    iput-object p1, p0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->λ:Ljava/lang/Object;

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 118
    .line 119
    .line 120
    const/high16 p1, 0x43700000    # 240.0f

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    float-to-int p1, p1

    .line 127
    invoke-virtual {p0, p1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 128
    .line 129
    .line 130
    const/high16 p1, 0x433e0000    # 190.0f

    .line 131
    .line 132
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    float-to-int p1, p1

    .line 137
    invoke-virtual {p0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 138
    .line 139
    .line 140
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->κ:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_e

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    const/high16 v2, 0x42380000    # 46.0f

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-float/2addr v2, v1

    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    int-to-float v1, v1

    .line 36
    const/high16 v3, 0x41400000    # 12.0f

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    add-float v7, v3, v1

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    sub-int/2addr v1, v3

    .line 53
    int-to-float v1, v1

    .line 54
    const/high16 v3, 0x41000000    # 8.0f

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    sub-float v4, v1, v3

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    sub-int/2addr v1, v3

    .line 71
    int-to-float v1, v1

    .line 72
    const/high16 v3, 0x41e00000    # 28.0f

    .line 73
    .line 74
    invoke-virtual {v0, v3}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    sub-float v8, v1, v3

    .line 79
    .line 80
    sub-float v9, v4, v2

    .line 81
    .line 82
    sub-float v10, v8, v7

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    cmpg-float v3, v9, v1

    .line 86
    .line 87
    if-lez v3, :cond_12

    .line 88
    .line 89
    cmpg-float v1, v10, v1

    .line 90
    .line 91
    if-gtz v1, :cond_1

    .line 92
    .line 93
    goto/16 :goto_e

    .line 94
    .line 95
    :cond_1
    iget-object v1, v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->λ:Ljava/lang/Object;

    .line 96
    .line 97
    invoke-static {v1}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    new-instance v3, Lf71;

    .line 102
    .line 103
    const/16 v5, 0x16

    .line 104
    .line 105
    invoke-direct {v3, v5}, Lf71;-><init>(I)V

    .line 106
    .line 107
    .line 108
    new-instance v5, Lc40;

    .line 109
    .line 110
    sget-object v6, Lvs1;->ε:Lvs1;

    .line 111
    .line 112
    invoke-direct {v5, v1, v3, v6}, Lc40;-><init>(Lss1;La80;La80;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v5}, Lus1;->Β(Lss1;)Ljava/lang/Comparable;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Ljava/lang/Long;

    .line 120
    .line 121
    const-wide/16 v5, 0x1

    .line 122
    .line 123
    if-eqz v1, :cond_3

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 126
    .line 127
    .line 128
    move-result-wide v11

    .line 129
    cmp-long v1, v11, v5

    .line 130
    .line 131
    if-gez v1, :cond_2

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_2
    move-wide v5, v11

    .line 135
    :cond_3
    :goto_0
    move-wide v11, v5

    .line 136
    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    .line 137
    .line 138
    iget-object v13, v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->ζ:Landroid/graphics/Paint;

    .line 139
    .line 140
    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 141
    .line 142
    .line 143
    const/4 v15, 0x0

    .line 144
    :goto_1
    int-to-float v1, v15

    .line 145
    const/4 v3, 0x4

    .line 146
    int-to-float v5, v3

    .line 147
    div-float/2addr v1, v5

    .line 148
    mul-float/2addr v1, v10

    .line 149
    add-float/2addr v1, v7

    .line 150
    iget-object v6, v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->ε:Landroid/graphics/Paint;

    .line 151
    .line 152
    move v5, v1

    .line 153
    move v14, v3

    .line 154
    move v3, v1

    .line 155
    move-object/from16 v1, p1

    .line 156
    .line 157
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 158
    .line 159
    .line 160
    long-to-double v5, v11

    .line 161
    rsub-int/lit8 v14, v15, 0x4

    .line 162
    .line 163
    move/from16 v17, v2

    .line 164
    .line 165
    move/from16 v18, v3

    .line 166
    .line 167
    int-to-double v2, v14

    .line 168
    mul-double/2addr v2, v5

    .line 169
    move-wide/from16 v19, v2

    .line 170
    .line 171
    const/4 v14, 0x4

    .line 172
    int-to-double v2, v14

    .line 173
    div-double v2, v19, v2

    .line 174
    .line 175
    double-to-long v2, v2

    .line 176
    const-wide/32 v19, 0x5f5e100

    .line 177
    .line 178
    .line 179
    cmp-long v14, v2, v19

    .line 180
    .line 181
    move/from16 v19, v4

    .line 182
    .line 183
    const/4 v4, 0x1

    .line 184
    if-ltz v14, :cond_4

    .line 185
    .line 186
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 187
    .line 188
    .line 189
    move-result-object v14

    .line 190
    long-to-double v2, v2

    .line 191
    const-wide v20, 0x4197d78400000000L    # 1.0E8

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    div-double v2, v2, v20

    .line 197
    .line 198
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const-string v3, "%.1f\u4ebf"

    .line 211
    .line 212
    invoke-static {v14, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    goto :goto_2

    .line 217
    :cond_4
    const-wide/16 v20, 0x2710

    .line 218
    .line 219
    cmp-long v14, v2, v20

    .line 220
    .line 221
    if-ltz v14, :cond_5

    .line 222
    .line 223
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 224
    .line 225
    .line 226
    move-result-object v14

    .line 227
    long-to-double v2, v2

    .line 228
    const-wide v20, 0x40c3880000000000L    # 10000.0

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    div-double v2, v2, v20

    .line 234
    .line 235
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    const-string v3, "%.1f\u4e07"

    .line 248
    .line 249
    invoke-static {v14, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    goto :goto_2

    .line 254
    :cond_5
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    :goto_2
    const/high16 v3, 0x40e00000    # 7.0f

    .line 259
    .line 260
    invoke-virtual {v0, v3}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    sub-float v3, v17, v3

    .line 265
    .line 266
    const/high16 v14, 0x40400000    # 3.0f

    .line 267
    .line 268
    invoke-virtual {v0, v14}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 269
    .line 270
    .line 271
    move-result v14

    .line 272
    add-float v14, v14, v18

    .line 273
    .line 274
    invoke-virtual {v1, v2, v3, v14, v13}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 275
    .line 276
    .line 277
    const/4 v14, 0x4

    .line 278
    if-eq v15, v14, :cond_6

    .line 279
    .line 280
    add-int/lit8 v15, v15, 0x1

    .line 281
    .line 282
    move/from16 v2, v17

    .line 283
    .line 284
    move/from16 v4, v19

    .line 285
    .line 286
    goto/16 :goto_1

    .line 287
    .line 288
    :cond_6
    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 289
    .line 290
    invoke-virtual {v13, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 291
    .line 292
    .line 293
    iget-object v2, v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->κ:Ljava/util/List;

    .line 294
    .line 295
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    const/4 v3, 0x0

    .line 300
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v7

    .line 304
    const/4 v11, 0x0

    .line 305
    const/high16 v12, 0x40000000    # 2.0f

    .line 306
    .line 307
    if-eqz v7, :cond_9

    .line 308
    .line 309
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v7

    .line 313
    add-int/lit8 v14, v3, 0x1

    .line 314
    .line 315
    if-ltz v3, :cond_8

    .line 316
    .line 317
    check-cast v7, Ljava/lang/String;

    .line 318
    .line 319
    iget-object v11, v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->κ:Ljava/util/List;

    .line 320
    .line 321
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    if-ne v11, v4, :cond_7

    .line 326
    .line 327
    div-float v3, v9, v12

    .line 328
    .line 329
    :goto_4
    add-float v3, v3, v17

    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_7
    int-to-float v3, v3

    .line 333
    mul-float/2addr v3, v9

    .line 334
    iget-object v11, v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->κ:Ljava/util/List;

    .line 335
    .line 336
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 337
    .line 338
    .line 339
    move-result v11

    .line 340
    sub-int/2addr v11, v4

    .line 341
    int-to-float v11, v11

    .line 342
    div-float/2addr v3, v11

    .line 343
    goto :goto_4

    .line 344
    :goto_5
    const/high16 v11, 0x41900000    # 18.0f

    .line 345
    .line 346
    invoke-virtual {v0, v11}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 347
    .line 348
    .line 349
    move-result v11

    .line 350
    add-float/2addr v11, v8

    .line 351
    invoke-virtual {v1, v7, v3, v11, v13}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 352
    .line 353
    .line 354
    move v3, v14

    .line 355
    goto :goto_3

    .line 356
    :cond_8
    invoke-static {}, Lyh;->х()V

    .line 357
    .line 358
    .line 359
    throw v11

    .line 360
    :cond_9
    iget-object v2, v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->λ:Ljava/lang/Object;

    .line 361
    .line 362
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    if-eqz v3, :cond_12

    .line 371
    .line 372
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    check-cast v3, Lce1;

    .line 377
    .line 378
    iget-object v7, v3, Lce1;->γ:Ljava/util/List;

    .line 379
    .line 380
    iget v3, v3, Lce1;->β:I

    .line 381
    .line 382
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 383
    .line 384
    .line 385
    move-result v13

    .line 386
    if-nez v13, :cond_11

    .line 387
    .line 388
    iget-object v13, v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->ι:Landroid/graphics/Path;

    .line 389
    .line 390
    invoke-virtual {v13}, Landroid/graphics/Path;->reset()V

    .line 391
    .line 392
    .line 393
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v14

    .line 397
    const/4 v15, 0x0

    .line 398
    :goto_7
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v16

    .line 402
    if-eqz v16, :cond_d

    .line 403
    .line 404
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v16

    .line 408
    add-int/lit8 v18, v15, 0x1

    .line 409
    .line 410
    if-ltz v15, :cond_c

    .line 411
    .line 412
    check-cast v16, Ljava/lang/Number;

    .line 413
    .line 414
    move-object/from16 v19, v11

    .line 415
    .line 416
    move/from16 v20, v12

    .line 417
    .line 418
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->longValue()J

    .line 419
    .line 420
    .line 421
    move-result-wide v11

    .line 422
    move-object/from16 v16, v2

    .line 423
    .line 424
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    if-ne v2, v4, :cond_a

    .line 429
    .line 430
    div-float v2, v9, v20

    .line 431
    .line 432
    add-float v2, v2, v17

    .line 433
    .line 434
    move/from16 v22, v4

    .line 435
    .line 436
    goto :goto_8

    .line 437
    :cond_a
    int-to-float v2, v15

    .line 438
    mul-float/2addr v2, v9

    .line 439
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 440
    .line 441
    .line 442
    move-result v21

    .line 443
    move/from16 v22, v4

    .line 444
    .line 445
    add-int/lit8 v4, v21, -0x1

    .line 446
    .line 447
    int-to-float v4, v4

    .line 448
    div-float/2addr v2, v4

    .line 449
    add-float v2, v2, v17

    .line 450
    .line 451
    :goto_8
    long-to-double v11, v11

    .line 452
    div-double v23, v11, v5

    .line 453
    .line 454
    const-wide/16 v25, 0x0

    .line 455
    .line 456
    const-wide/high16 v27, 0x3ff0000000000000L    # 1.0

    .line 457
    .line 458
    invoke-static/range {v23 .. v28}, Lj81;->κ(DDD)D

    .line 459
    .line 460
    .line 461
    move-result-wide v11

    .line 462
    double-to-float v4, v11

    .line 463
    mul-float/2addr v4, v10

    .line 464
    sub-float v4, v8, v4

    .line 465
    .line 466
    if-nez v15, :cond_b

    .line 467
    .line 468
    invoke-virtual {v13, v2, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 469
    .line 470
    .line 471
    goto :goto_9

    .line 472
    :cond_b
    invoke-virtual {v13, v2, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 473
    .line 474
    .line 475
    :goto_9
    move-object/from16 v2, v16

    .line 476
    .line 477
    move/from16 v15, v18

    .line 478
    .line 479
    move-object/from16 v11, v19

    .line 480
    .line 481
    move/from16 v12, v20

    .line 482
    .line 483
    move/from16 v4, v22

    .line 484
    .line 485
    goto :goto_7

    .line 486
    :cond_c
    move-object/from16 v19, v11

    .line 487
    .line 488
    invoke-static {}, Lyh;->х()V

    .line 489
    .line 490
    .line 491
    throw v19

    .line 492
    :cond_d
    move-object/from16 v16, v2

    .line 493
    .line 494
    move/from16 v22, v4

    .line 495
    .line 496
    move-object/from16 v19, v11

    .line 497
    .line 498
    move/from16 v20, v12

    .line 499
    .line 500
    iget-object v2, v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->η:Landroid/graphics/Paint;

    .line 501
    .line 502
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v1, v13, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 506
    .line 507
    .line 508
    iget-object v2, v0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->θ:Landroid/graphics/Paint;

    .line 509
    .line 510
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 511
    .line 512
    .line 513
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    const/4 v4, 0x0

    .line 518
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 519
    .line 520
    .line 521
    move-result v11

    .line 522
    if-eqz v11, :cond_10

    .line 523
    .line 524
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v11

    .line 528
    add-int/lit8 v12, v4, 0x1

    .line 529
    .line 530
    if-ltz v4, :cond_f

    .line 531
    .line 532
    check-cast v11, Ljava/lang/Number;

    .line 533
    .line 534
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 535
    .line 536
    .line 537
    move-result-wide v13

    .line 538
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 539
    .line 540
    .line 541
    move-result v11

    .line 542
    move/from16 v15, v22

    .line 543
    .line 544
    if-ne v11, v15, :cond_e

    .line 545
    .line 546
    div-float v4, v9, v20

    .line 547
    .line 548
    :goto_b
    add-float v4, v4, v17

    .line 549
    .line 550
    goto :goto_c

    .line 551
    :cond_e
    int-to-float v4, v4

    .line 552
    mul-float/2addr v4, v9

    .line 553
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 554
    .line 555
    .line 556
    move-result v11

    .line 557
    sub-int/2addr v11, v15

    .line 558
    int-to-float v11, v11

    .line 559
    div-float/2addr v4, v11

    .line 560
    goto :goto_b

    .line 561
    :goto_c
    long-to-double v13, v13

    .line 562
    div-double v21, v13, v5

    .line 563
    .line 564
    const-wide/16 v23, 0x0

    .line 565
    .line 566
    const-wide/high16 v25, 0x3ff0000000000000L    # 1.0

    .line 567
    .line 568
    invoke-static/range {v21 .. v26}, Lj81;->κ(DDD)D

    .line 569
    .line 570
    .line 571
    move-result-wide v13

    .line 572
    double-to-float v11, v13

    .line 573
    mul-float/2addr v11, v10

    .line 574
    sub-float v11, v8, v11

    .line 575
    .line 576
    const v13, 0x40333333    # 2.8f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v0, v13}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 580
    .line 581
    .line 582
    move-result v13

    .line 583
    invoke-virtual {v1, v4, v11, v13, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 584
    .line 585
    .line 586
    move v4, v12

    .line 587
    move/from16 v22, v15

    .line 588
    .line 589
    goto :goto_a

    .line 590
    :cond_f
    invoke-static {}, Lyh;->х()V

    .line 591
    .line 592
    .line 593
    throw v19

    .line 594
    :cond_10
    move/from16 v15, v22

    .line 595
    .line 596
    goto :goto_d

    .line 597
    :cond_11
    move-object/from16 v16, v2

    .line 598
    .line 599
    move v15, v4

    .line 600
    move-object/from16 v19, v11

    .line 601
    .line 602
    move/from16 v20, v12

    .line 603
    .line 604
    :goto_d
    move v4, v15

    .line 605
    move-object/from16 v2, v16

    .line 606
    .line 607
    move-object/from16 v11, v19

    .line 608
    .line 609
    move/from16 v12, v20

    .line 610
    .line 611
    goto/16 :goto_6

    .line 612
    .line 613
    :cond_12
    :goto_e
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x43700000    # 240.0f

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    float-to-int v1, v1

    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/high16 v2, 0x433e0000    # 190.0f

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->α(F)F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    float-to-int v2, v2

    .line 27
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-static {v1, p2}, Landroid/view/View;->resolveSize(II)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final α(F)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    return p1
.end method

.method public final β(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-static {p1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->κ:Ljava/util/List;

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 p1, 0xa

    .line 10
    .line 11
    invoke-static {p2, p1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    check-cast p2, Lce1;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->κ:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    new-instance v2, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    :goto_1
    if-ge v3, v1, :cond_2

    .line 47
    .line 48
    iget-object v4, p2, Lce1;->γ:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v3, v4}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Ljava/lang/Long;

    .line 55
    .line 56
    const-wide/16 v5, 0x0

    .line 57
    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 61
    .line 62
    .line 63
    move-result-wide v7

    .line 64
    cmp-long v4, v7, v5

    .line 65
    .line 66
    if-gez v4, :cond_0

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_0
    move-wide v5, v7

    .line 70
    :cond_1
    :goto_2
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    iget-object v1, p2, Lce1;->α:Ljava/lang/String;

    .line 81
    .line 82
    iget p2, p2, Lce1;->β:I

    .line 83
    .line 84
    new-instance v3, Lce1;

    .line 85
    .line 86
    invoke-direct {v3, p2, v1, v2}, Lce1;-><init>(ILjava/lang/String;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    iput-object v0, p0, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->λ:Ljava/lang/Object;

    .line 94
    .line 95
    new-instance v5, Lwa;

    .line 96
    .line 97
    const/16 p1, 0x1b

    .line 98
    .line 99
    invoke-direct {v5, p0, p1, p3}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    const/16 v6, 0x1e

    .line 103
    .line 104
    const-string v1, "\uff1b"

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    const/4 v3, 0x0

    .line 108
    const/4 v4, 0x0

    .line 109
    invoke-static/range {v0 .. v6}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 117
    .line 118
    .line 119
    return-void
.end method
