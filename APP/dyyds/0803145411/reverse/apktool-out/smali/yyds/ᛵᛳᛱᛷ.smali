.class public final Lyyds/ᛵᛳᛱᛷ;
.super Landroid/view/View;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᛶᛳ:Landroid/animation/ValueAnimator;

.field public final ᛱᛳᲇ:Landroid/graphics/Paint;

.field public final ᛱᲈᲁ:F

.field public final ᛲᛲᲈᲈ:Landroid/graphics/Paint;

.field public ᛲᛳᛴᛸ:Ljava/lang/String;

.field public final ᛲᛳᛶᲁ:Landroid/graphics/RectF;

.field public final ᛲᛴᛳᛲ:F

.field public ᛲᛶᛱᲈ:F

.field public final ᛳᛸᛴᛶ:Landroid/graphics/Paint;

.field public final ᛳᲁᲁᲇ:Landroid/graphics/Paint;

.field public final ᛵᛶᛲᲀ:Lyyds/ᛱᛲᛶᛱ;

.field public ᛵᲀᛵᛸ:F

.field public final ᛵᲀᲈᛴ:[I

.field public final ᛶᛳᛶᛵ:F

.field public final ᛶᛷᛲᲁ:F

.field public final ᛶᛸᲀᲁ:Landroid/text/TextPaint;

.field public final ᛶᲈᛴᲈ:Landroid/graphics/Paint;

.field public final ᛷᛲᲈᛱ:I

.field public final ᛷᛵᲇᲀ:I

.field public ᛷᛸᲇᛶ:Z

.field public final ᛷᲈᲈᲁ:I

.field public ᛸᛸᛷᛱ:J

.field public final ᲀᛲᛱᛱ:Lyyds/ᛱᲁᛳᛵ;

.field public final ᲀᛲᛲᲇ:Landroid/graphics/Matrix;

.field public final ᲀᛲᛳᲀ:I

.field public ᲀᛴᲁᲈ:F

.field public final ᲇᛱᛲ:Landroid/graphics/Paint;

.field public final ᲇᲇᲇᛱ:F

.field public final ᲇᲈᛵᛷ:F

.field public ᲈᲀᛲᲀ:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    .line 1
    const-wide v0, -0x8d21e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0x78

    .line 13
    .line 14
    iput v0, p0, Lyyds/ᛵᛳᛱᛷ;->ᲀᛲᛳᲀ:I

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 25
    .line 26
    iput v0, p0, Lyyds/ᛵᛳᛱᛷ;->ᲇᲈᛵᛷ:F

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget v1, v1, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 37
    .line 38
    iput v1, p0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛴᛳᛲ:F

    .line 39
    .line 40
    const/high16 v2, 0x40c00000    # 6.0f

    .line 41
    .line 42
    mul-float/2addr v2, v0

    .line 43
    iput v2, p0, Lyyds/ᛵᛳᛱᛷ;->ᲇᲇᲇᛱ:F

    .line 44
    .line 45
    const/high16 v3, 0x41c00000    # 24.0f

    .line 46
    .line 47
    mul-float/2addr v3, v0

    .line 48
    iput v3, p0, Lyyds/ᛵᛳᛱᛷ;->ᛶᛷᛲᲁ:F

    .line 49
    .line 50
    const v0, 0x3f666666    # 0.9f

    .line 51
    .line 52
    .line 53
    mul-float/2addr v0, v2

    .line 54
    add-float/2addr v0, v3

    .line 55
    iput v0, p0, Lyyds/ᛵᛳᛱᛷ;->ᛱᲈᲁ:F

    .line 56
    .line 57
    new-instance v0, Landroid/graphics/RectF;

    .line 58
    .line 59
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛳᛶᲁ:Landroid/graphics/RectF;

    .line 63
    .line 64
    const v0, 0x66060087

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/content/Context;->getColor(I)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    iput v3, p0, Lyyds/ᛵᛳᛱᛷ;->ᛷᲈᲈᲁ:I

    .line 76
    .line 77
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    iput v3, p0, Lyyds/ᛵᛳᛱᛷ;->ᛷᛲᲈᛱ:I

    .line 82
    .line 83
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    iput v3, p0, Lyyds/ᛵᛳᛱᛷ;->ᛷᛵᲇᲀ:I

    .line 88
    .line 89
    new-instance v3, Landroid/graphics/Paint;

    .line 90
    .line 91
    const/4 v4, 0x1

    .line 92
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 93
    .line 94
    .line 95
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 96
    .line 97
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 98
    .line 99
    .line 100
    const v6, 0x6606009a

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v6}, Landroid/content/Context;->getColor(I)I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 108
    .line 109
    .line 110
    iput-object v3, p0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛲᲈᲈ:Landroid/graphics/Paint;

    .line 111
    .line 112
    new-instance v3, Landroid/graphics/Paint;

    .line 113
    .line 114
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 115
    .line 116
    .line 117
    sget-object v6, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 118
    .line 119
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 123
    .line 124
    .line 125
    sget-object v7, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 126
    .line 127
    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 128
    .line 129
    .line 130
    const v8, 0x66060075

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v8}, Landroid/content/Context;->getColor(I)I

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 138
    .line 139
    .line 140
    iput-object v3, p0, Lyyds/ᛵᛳᛱᛷ;->ᛱᛳᲇ:Landroid/graphics/Paint;

    .line 141
    .line 142
    new-instance v3, Landroid/graphics/Paint;

    .line 143
    .line 144
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 157
    .line 158
    .line 159
    iput-object v3, p0, Lyyds/ᛵᛳᛱᛷ;->ᛳᲁᲁᲇ:Landroid/graphics/Paint;

    .line 160
    .line 161
    new-instance v3, Landroid/graphics/Paint;

    .line 162
    .line 163
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 167
    .line 168
    .line 169
    iput-object v3, p0, Lyyds/ᛵᛳᛱᛷ;->ᲇᛱᛲ:Landroid/graphics/Paint;

    .line 170
    .line 171
    const v3, 0x4019999a    # 2.4f

    .line 172
    .line 173
    .line 174
    mul-float/2addr v2, v3

    .line 175
    iput v2, p0, Lyyds/ᛵᛳᛱᛷ;->ᛶᛳᛶᛵ:F

    .line 176
    .line 177
    new-instance v2, Lyyds/ᛵᲇᛵᲇ;

    .line 178
    .line 179
    const/4 v3, 0x7

    .line 180
    invoke-direct {v2, v3, p0}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    new-instance v3, Lyyds/ᛱᛲᛶᛱ;

    .line 184
    .line 185
    invoke-direct {v3, v2}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 186
    .line 187
    .line 188
    iput-object v3, p0, Lyyds/ᛵᛳᛱᛷ;->ᛵᛶᛲᲀ:Lyyds/ᛱᛲᛶᛱ;

    .line 189
    .line 190
    new-instance v2, Landroid/graphics/Matrix;

    .line 191
    .line 192
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 193
    .line 194
    .line 195
    iput-object v2, p0, Lyyds/ᛵᛳᛱᛷ;->ᲀᛲᛲᲇ:Landroid/graphics/Matrix;

    .line 196
    .line 197
    new-instance v2, Landroid/graphics/Paint;

    .line 198
    .line 199
    invoke-direct {v2, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 206
    .line 207
    .line 208
    iput-object v2, p0, Lyyds/ᛵᛳᛱᛷ;->ᛳᛸᛴᛶ:Landroid/graphics/Paint;

    .line 209
    .line 210
    new-instance v2, Landroid/graphics/Paint;

    .line 211
    .line 212
    invoke-direct {v2, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v7}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 219
    .line 220
    .line 221
    iput-object v2, p0, Lyyds/ᛵᛳᛱᛷ;->ᛶᲈᛴᲈ:Landroid/graphics/Paint;

    .line 222
    .line 223
    new-instance v2, Landroid/text/TextPaint;

    .line 224
    .line 225
    invoke-direct {v2, v4}, Landroid/text/TextPaint;-><init>(I)V

    .line 226
    .line 227
    .line 228
    const v3, 0x6606006a

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, v3}, Landroid/content/Context;->getColor(I)I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 236
    .line 237
    .line 238
    const/high16 v3, 0x41600000    # 14.0f

    .line 239
    .line 240
    mul-float/2addr v1, v3

    .line 241
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 242
    .line 243
    .line 244
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 245
    .line 246
    invoke-static {v1, v4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 251
    .line 252
    .line 253
    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 254
    .line 255
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 256
    .line 257
    .line 258
    iput-object v2, p0, Lyyds/ᛵᛳᛱᛷ;->ᛶᛸᲀᲁ:Landroid/text/TextPaint;

    .line 259
    .line 260
    const v1, 0x6606008c

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    int-to-float v1, v1

    .line 272
    const v2, 0x3ec28f5c    # 0.38f

    .line 273
    .line 274
    .line 275
    mul-float/2addr v1, v2

    .line 276
    const/4 v3, -0x1

    .line 277
    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    int-to-float v5, v5

    .line 282
    const v6, 0x3f1eb852    # 0.62f

    .line 283
    .line 284
    .line 285
    mul-float/2addr v5, v6

    .line 286
    add-float/2addr v5, v1

    .line 287
    float-to-int v1, v5

    .line 288
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    int-to-float v5, v5

    .line 293
    mul-float/2addr v5, v2

    .line 294
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    int-to-float v7, v7

    .line 299
    mul-float/2addr v7, v6

    .line 300
    add-float/2addr v7, v5

    .line 301
    float-to-int v5, v7

    .line 302
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 303
    .line 304
    .line 305
    move-result v7

    .line 306
    int-to-float v7, v7

    .line 307
    mul-float/2addr v7, v2

    .line 308
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    int-to-float v2, v2

    .line 313
    mul-float/2addr v2, v6

    .line 314
    add-float/2addr v2, v7

    .line 315
    float-to-int v2, v2

    .line 316
    invoke-static {v1, v5, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    filled-new-array {v0, v0, v0, p1, v1}, [I

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    iput-object p1, p0, Lyyds/ᛵᛳᛱᛷ;->ᛵᲀᲈᛴ:[I

    .line 325
    .line 326
    const-wide v0, -0x8d29e68a836eL

    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    iput-object p1, p0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛳᛴᛸ:Ljava/lang/String;

    .line 336
    .line 337
    iput-boolean v4, p0, Lyyds/ᛵᛳᛱᛷ;->ᛷᛸᲇᛶ:Z

    .line 338
    .line 339
    new-instance p1, Lyyds/ᛱᲁᛳᛵ;

    .line 340
    .line 341
    const/16 v0, 0x40

    .line 342
    .line 343
    invoke-direct {p1, v0}, Lyyds/ᛱᲁᛳᛵ;-><init>(I)V

    .line 344
    .line 345
    .line 346
    iput-object p1, p0, Lyyds/ᛵᛳᛱᛷ;->ᲀᛲᛱᛱ:Lyyds/ᛱᲁᛳᛵ;

    .line 347
    .line 348
    return-void
.end method

.method private final getGlowShader()Landroid/graphics/RadialGradient;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛳᛱᛷ;->ᛵᛶᛲᲀ:Lyyds/ᛱᛲᛶᛱ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/RadialGradient;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyyds/ᛵᛳᛱᛷ;->ᲇᲇᲇᛱ()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛳᛱᛷ;->ᛲᛴᛳᛲ()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide v2, -0x8d2fe68a836eL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    int-to-float v2, v2

    .line 18
    const/high16 v7, 0x40000000    # 2.0f

    .line 19
    .line 20
    div-float v8, v2, v7

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    int-to-float v2, v2

    .line 27
    div-float v9, v2, v7

    .line 28
    .line 29
    iget v2, v0, Lyyds/ᛵᛳᛱᛷ;->ᛱᲈᲁ:F

    .line 30
    .line 31
    iget-object v3, v0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛲᲈᲈ:Landroid/graphics/Paint;

    .line 32
    .line 33
    invoke-virtual {v1, v8, v9, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 34
    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    iget-object v6, v0, Lyyds/ᛵᛳᛱᛷ;->ᛱᛳᲇ:Landroid/graphics/Paint;

    .line 38
    .line 39
    iget-object v2, v0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛳᛶᲁ:Landroid/graphics/RectF;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    const/high16 v4, 0x43b40000    # 360.0f

    .line 43
    .line 44
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 45
    .line 46
    .line 47
    iget-boolean v1, v0, Lyyds/ᛵᛳᛱᛷ;->ᲈᲀᛲᲀ:Z

    .line 48
    .line 49
    iget-object v6, v0, Lyyds/ᛵᛳᛱᛷ;->ᛳᲁᲁᲇ:Landroid/graphics/Paint;

    .line 50
    .line 51
    const/4 v10, 0x0

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    iget v3, v0, Lyyds/ᛵᛳᛱᛷ;->ᛵᲀᛵᛸ:F

    .line 55
    .line 56
    const/high16 v4, 0x42c80000    # 100.0f

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    move-object/from16 v1, p1

    .line 60
    .line 61
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    iget v1, v0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛶᛱᲈ:F

    .line 66
    .line 67
    cmpl-float v3, v1, v10

    .line 68
    .line 69
    if-lez v3, :cond_1

    .line 70
    .line 71
    const/high16 v3, 0x43b40000    # 360.0f

    .line 72
    .line 73
    mul-float v4, v1, v3

    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    const/high16 v3, -0x3d4c0000    # -90.0f

    .line 77
    .line 78
    move-object/from16 v1, p1

    .line 79
    .line 80
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    move-object/from16 v1, p1

    .line 85
    .line 86
    :goto_0
    invoke-virtual {v0}, Lyyds/ᛵᛳᛱᛷ;->ᛵᛸᛸᛷ()[F

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const/4 v11, 0x0

    .line 91
    aget v3, v2, v11

    .line 92
    .line 93
    const/4 v4, 0x1

    .line 94
    aget v2, v2, v4

    .line 95
    .line 96
    iget-boolean v4, v0, Lyyds/ᛵᛳᛱᛷ;->ᲈᲀᛲᲀ:Z

    .line 97
    .line 98
    iget v12, v0, Lyyds/ᛵᛳᛱᛷ;->ᲇᲇᲇᛱ:F

    .line 99
    .line 100
    if-nez v4, :cond_2

    .line 101
    .line 102
    iget v4, v0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛶᛱᲈ:F

    .line 103
    .line 104
    cmpl-float v4, v4, v10

    .line 105
    .line 106
    if-lez v4, :cond_3

    .line 107
    .line 108
    :cond_2
    iget-object v4, v0, Lyyds/ᛵᛳᛱᛷ;->ᲀᛲᛲᲇ:Landroid/graphics/Matrix;

    .line 109
    .line 110
    invoke-virtual {v4, v3, v2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v0}, Lyyds/ᛵᛳᛱᛷ;->getGlowShader()Landroid/graphics/RadialGradient;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v5, v4}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 118
    .line 119
    .line 120
    invoke-direct {v0}, Lyyds/ᛵᛳᛱᛷ;->getGlowShader()Landroid/graphics/RadialGradient;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    iget-object v5, v0, Lyyds/ᛵᛳᛱᛷ;->ᲇᛱᛲ:Landroid/graphics/Paint;

    .line 125
    .line 126
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 127
    .line 128
    .line 129
    iget v4, v0, Lyyds/ᛵᛳᛱᛷ;->ᛶᛳᛶᛵ:F

    .line 130
    .line 131
    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    const v4, 0x3f19999a    # 0.6f

    .line 135
    .line 136
    .line 137
    mul-float/2addr v4, v12

    .line 138
    iget-object v5, v0, Lyyds/ᛵᛳᛱᛷ;->ᛳᛸᛴᛶ:Landroid/graphics/Paint;

    .line 139
    .line 140
    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 141
    .line 142
    .line 143
    :cond_3
    iget-object v2, v0, Lyyds/ᛵᛳᛱᛷ;->ᲀᛲᛱᛱ:Lyyds/ᛱᲁᛳᛵ;

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_4

    .line 154
    .line 155
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, Lyyds/ᛶᛸᲁ;

    .line 160
    .line 161
    iget v3, v2, Lyyds/ᛶᛸᲁ;->ᛲᛴᛳᛲ:F

    .line 162
    .line 163
    iget v4, v2, Lyyds/ᛶᛸᲁ;->ᲇᲇᲇᛱ:F

    .line 164
    .line 165
    div-float/2addr v3, v4

    .line 166
    const/high16 v5, 0x3f800000    # 1.0f

    .line 167
    .line 168
    invoke-static {v3, v10, v5}, Lyyds/ᛳᛵᲀ;->ᛵᛸᛸᛷ(FFF)F

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    iget v5, v2, Lyyds/ᛶᛸᲁ;->ᛲᛴᛳᛲ:F

    .line 173
    .line 174
    sub-float/2addr v4, v5

    .line 175
    iget v5, v2, Lyyds/ᛶᛸᲁ;->ᛷᲈᲈᲁ:F

    .line 176
    .line 177
    const/high16 v6, 0x41d00000    # 26.0f

    .line 178
    .line 179
    mul-float/2addr v4, v6

    .line 180
    add-float/2addr v4, v5

    .line 181
    float-to-double v4, v4

    .line 182
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 183
    .line 184
    .line 185
    move-result-wide v4

    .line 186
    double-to-float v4, v4

    .line 187
    const v5, 0x3ee66666    # 0.45f

    .line 188
    .line 189
    .line 190
    mul-float/2addr v4, v5

    .line 191
    const v5, 0x3f0ccccd    # 0.55f

    .line 192
    .line 193
    .line 194
    add-float/2addr v4, v5

    .line 195
    iget v5, v2, Lyyds/ᛶᛸᲁ;->ᛲᛳᛶᲁ:I

    .line 196
    .line 197
    iget-object v6, v0, Lyyds/ᛵᛳᛱᛷ;->ᛶᲈᛴᲈ:Landroid/graphics/Paint;

    .line 198
    .line 199
    invoke-virtual {v6, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 200
    .line 201
    .line 202
    mul-float/2addr v3, v4

    .line 203
    const/high16 v4, 0x436b0000    # 235.0f

    .line 204
    .line 205
    mul-float/2addr v3, v4

    .line 206
    float-to-int v3, v3

    .line 207
    const/16 v4, 0xff

    .line 208
    .line 209
    invoke-static {v3, v11, v4}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    invoke-virtual {v6, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 214
    .line 215
    .line 216
    iget v3, v2, Lyyds/ᛶᛸᲁ;->ᛱᲈᲁ:F

    .line 217
    .line 218
    invoke-virtual {v6, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 219
    .line 220
    .line 221
    iget v3, v2, Lyyds/ᛶᛸᲁ;->ᛲᲈᲁ:F

    .line 222
    .line 223
    move v4, v3

    .line 224
    iget v3, v2, Lyyds/ᛶᛸᲁ;->ᛵᛸᛸᛷ:F

    .line 225
    .line 226
    iget v5, v2, Lyyds/ᛶᛸᲁ;->ᲀᛲᛳᲀ:F

    .line 227
    .line 228
    const v14, 0x3d4ccccd    # 0.05f

    .line 229
    .line 230
    .line 231
    mul-float/2addr v5, v14

    .line 232
    sub-float v5, v4, v5

    .line 233
    .line 234
    iget v2, v2, Lyyds/ᛶᛸᲁ;->ᲇᲈᛵᛷ:F

    .line 235
    .line 236
    mul-float/2addr v2, v14

    .line 237
    sub-float v2, v3, v2

    .line 238
    .line 239
    move v15, v5

    .line 240
    move v5, v2

    .line 241
    move v2, v4

    .line 242
    move v4, v15

    .line 243
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 244
    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_4
    iget-object v2, v0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛳᛴᛸ:Ljava/lang/String;

    .line 248
    .line 249
    iget-boolean v3, v0, Lyyds/ᛵᛳᛱᛷ;->ᛷᛸᲇᛶ:Z

    .line 250
    .line 251
    iget-object v4, v0, Lyyds/ᛵᛳᛱᛷ;->ᛶᛸᲀᲁ:Landroid/text/TextPaint;

    .line 252
    .line 253
    if-nez v3, :cond_5

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_5
    const/high16 v3, 0x41600000    # 14.0f

    .line 257
    .line 258
    iget v5, v0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛴᛳᛲ:F

    .line 259
    .line 260
    mul-float/2addr v5, v3

    .line 261
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 262
    .line 263
    .line 264
    iget v3, v0, Lyyds/ᛵᛳᛱᛷ;->ᛶᛷᛲᲁ:F

    .line 265
    .line 266
    div-float/2addr v12, v7

    .line 267
    sub-float/2addr v3, v12

    .line 268
    const/high16 v6, 0x40400000    # 3.0f

    .line 269
    .line 270
    iget v12, v0, Lyyds/ᛵᛳᛱᛷ;->ᲇᲈᛵᛷ:F

    .line 271
    .line 272
    mul-float/2addr v12, v6

    .line 273
    sub-float/2addr v3, v12

    .line 274
    mul-float/2addr v3, v7

    .line 275
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    cmpl-float v6, v2, v3

    .line 280
    .line 281
    if-lez v6, :cond_6

    .line 282
    .line 283
    cmpl-float v6, v2, v10

    .line 284
    .line 285
    if-lez v6, :cond_6

    .line 286
    .line 287
    mul-float/2addr v5, v3

    .line 288
    div-float/2addr v5, v2

    .line 289
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 290
    .line 291
    .line 292
    :cond_6
    iput-boolean v11, v0, Lyyds/ᛵᛳᛱᛷ;->ᛷᛸᲇᛶ:Z

    .line 293
    .line 294
    :goto_2
    invoke-virtual {v4}, Landroid/graphics/Paint;->ascent()F

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    invoke-virtual {v4}, Landroid/graphics/Paint;->descent()F

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    add-float/2addr v3, v2

    .line 303
    div-float/2addr v3, v7

    .line 304
    sub-float/2addr v9, v3

    .line 305
    iget-object v0, v0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛳᛴᛸ:Ljava/lang/String;

    .line 306
    .line 307
    invoke-virtual {v1, v0, v8, v9, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 308
    .line 309
    .line 310
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    iget p1, p0, Lyyds/ᛵᛳᛱᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    int-to-float p1, p1

    .line 4
    iget p2, p0, Lyyds/ᛵᛳᛱᛷ;->ᲇᲈᛵᛷ:F

    .line 5
    .line 6
    mul-float/2addr p1, p2

    .line 7
    float-to-int p1, p1

    .line 8
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    int-to-float p1, p1

    .line 5
    const/high16 p3, 0x40000000    # 2.0f

    .line 6
    .line 7
    div-float/2addr p1, p3

    .line 8
    int-to-float p2, p2

    .line 9
    div-float/2addr p2, p3

    .line 10
    iget p3, p0, Lyyds/ᛵᛳᛱᛷ;->ᛶᛷᛲᲁ:F

    .line 11
    .line 12
    sub-float p4, p1, p3

    .line 13
    .line 14
    sub-float v0, p2, p3

    .line 15
    .line 16
    add-float/2addr p1, p3

    .line 17
    add-float/2addr p2, p3

    .line 18
    iget-object p3, p0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛳᛶᲁ:Landroid/graphics/RectF;

    .line 19
    .line 20
    invoke-virtual {p3, p4, v0, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Lyyds/ᛵᛳᛱᛷ;->ᛷᛸᲇᛶ:Z

    .line 25
    .line 26
    return-void
.end method

.method public final onVisibilityAggregated(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onVisibilityAggregated(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyyds/ᛵᛳᛱᛷ;->ᲇᲇᲇᛱ()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 2

    .line 1
    const-wide v0, -0x8d36e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lyyds/ᛵᛳᛱᛷ;->ᲇᲇᲇᛱ()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onWindowVisibilityChanged(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyyds/ᛵᛳᛱᛷ;->ᲇᲇᲇᛱ()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final ᛲᛴᛳᛲ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛳᛱᛷ;->ᛱᛳᛶᛳ:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lyyds/ᛵᛳᛱᛷ;->ᛱᛳᛶᛳ:Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᛵᛳᛱᛷ;->ᲀᛲᛱᛱ:Lyyds/ᛱᲁᛳᛵ;

    .line 12
    .line 13
    invoke-virtual {v0}, Lyyds/ᛱᲁᛳᛵ;->clear()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lyyds/ᛵᛳᛱᛷ;->ᲀᛴᲁᲈ:F

    .line 18
    .line 19
    return-void
.end method

.method public final ᛲᲈᲁ()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final ᛵᛸᛸᛷ()[F
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/high16 v1, 0x40000000    # 2.0f

    .line 7
    .line 8
    div-float/2addr v0, v1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    int-to-float v2, v2

    .line 14
    div-float/2addr v2, v1

    .line 15
    iget-boolean v1, p0, Lyyds/ᛵᛳᛱᛷ;->ᲈᲀᛲᲀ:Z

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lyyds/ᛵᛳᛱᛷ;->ᛵᲀᛵᛸ:F

    .line 20
    .line 21
    const/high16 v3, 0x42c80000    # 100.0f

    .line 22
    .line 23
    :goto_0
    add-float/2addr v1, v3

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget v1, p0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛶᛱᲈ:F

    .line 26
    .line 27
    const/high16 v3, 0x43b40000    # 360.0f

    .line 28
    .line 29
    mul-float/2addr v1, v3

    .line 30
    const/high16 v3, -0x3d4c0000    # -90.0f

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    float-to-double v3, v1

    .line 34
    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v5

    .line 42
    double-to-float v1, v5

    .line 43
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    double-to-float v3, v3

    .line 48
    iget p0, p0, Lyyds/ᛵᛳᛱᛷ;->ᛶᛷᛲᲁ:F

    .line 49
    .line 50
    mul-float v4, p0, v1

    .line 51
    .line 52
    add-float/2addr v4, v0

    .line 53
    mul-float/2addr p0, v3

    .line 54
    add-float/2addr p0, v2

    .line 55
    const/4 v0, 0x4

    .line 56
    new-array v0, v0, [F

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    aput v4, v0, v2

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    aput p0, v0, v2

    .line 63
    .line 64
    const/4 p0, 0x2

    .line 65
    aput v1, v0, p0

    .line 66
    .line 67
    const/4 p0, 0x3

    .line 68
    aput v3, v0, p0

    .line 69
    .line 70
    return-object v0
.end method

.method public final ᲀᛲᛳᲀ(FZ)V
    .locals 8

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v1, v0}, Lyyds/ᛳᛵᲀ;->ᛵᛸᛸᛷ(FFF)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    iget-boolean v0, p0, Lyyds/ᛵᛳᛱᛷ;->ᲈᲀᛲᲀ:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget v0, p0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛶᛱᲈ:F

    .line 15
    .line 16
    sub-float v0, p1, v0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v1

    .line 20
    :goto_0
    iput p1, p0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛶᛱᲈ:F

    .line 21
    .line 22
    iput-boolean p2, p0, Lyyds/ᛵᛳᛱᛷ;->ᲈᲀᛲᲀ:Z

    .line 23
    .line 24
    cmpl-float p1, v0, v1

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    if-lez p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-lez p1, :cond_1

    .line 34
    .line 35
    const/high16 p1, 0x435c0000    # 220.0f

    .line 36
    .line 37
    mul-float/2addr v0, p1

    .line 38
    float-to-int p1, v0

    .line 39
    const/4 v0, 0x0

    .line 40
    move v2, v0

    .line 41
    :goto_1
    if-ge v2, p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Lyyds/ᛵᛳᛱᛷ;->ᛵᛸᛸᛷ()[F

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    aget v4, v3, v0

    .line 48
    .line 49
    aget v5, v3, v1

    .line 50
    .line 51
    const/4 v6, 0x2

    .line 52
    aget v6, v3, v6

    .line 53
    .line 54
    const/4 v7, 0x3

    .line 55
    aget v3, v3, v7

    .line 56
    .line 57
    invoke-virtual {p0, v4, v5, v6, v3}, Lyyds/ᛵᛳᛱᛷ;->ᲇᲈᛵᛷ(FFFF)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    if-eqz p2, :cond_2

    .line 64
    .line 65
    const-wide p1, -0x8d2ce68a836eL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    iget p2, p0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛶᛱᲈ:F

    .line 81
    .line 82
    const/high16 v0, 0x42c80000    # 100.0f

    .line 83
    .line 84
    mul-float/2addr p2, v0

    .line 85
    float-to-int p2, p2

    .line 86
    const/16 v0, 0x25

    .line 87
    .line 88
    invoke-static {p1, p2, v0}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛲᲈᛱ(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    :goto_2
    iget-object p2, p0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛳᛴᛸ:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {p2, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-nez p2, :cond_3

    .line 99
    .line 100
    iput-object p1, p0, Lyyds/ᛵᛳᛱᛷ;->ᛲᛳᛴᛸ:Ljava/lang/String;

    .line 101
    .line 102
    iput-boolean v1, p0, Lyyds/ᛵᛳᛱᛷ;->ᛷᛸᲇᛶ:Z

    .line 103
    .line 104
    :cond_3
    invoke-virtual {p0}, Lyyds/ᛵᛳᛱᛷ;->ᲇᲇᲇᛱ()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final ᲇᲇᲇᛱ()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᛳᛱᛷ;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lyyds/ᛵᛳᛱᛷ;->ᛱᛳᛶᛳ:Landroid/animation/ValueAnimator;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛵᛳᛱᛷ;->ᛲᲈᲁ()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    iput-wide v2, p0, Lyyds/ᛵᛳᛱᛷ;->ᛸᛸᛷᛱ:J

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    new-array v0, v0, [F

    .line 34
    .line 35
    fill-array-data v0, :array_0

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-wide/16 v2, 0x10

    .line 43
    .line 44
    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 45
    .line 46
    .line 47
    const/4 v2, -0x1

    .line 48
    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 49
    .line 50
    .line 51
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    .line 52
    .line 53
    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Lyyds/ᲇᛲᛷᲀ;

    .line 60
    .line 61
    invoke-direct {v2, v1, p0}, Lyyds/ᲇᛲᛷᲀ;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Lyyds/ᛵᛳᛱᛷ;->ᛱᛳᛶᛳ:Landroid/animation/ValueAnimator;

    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-virtual {p0}, Lyyds/ᛵᛳᛱᛷ;->ᛲᛴᛳᛲ()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final ᲇᲈᛵᛷ(FFFF)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲇᛸᛴᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛳᛲᛷ;

    .line 4
    .line 5
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/high16 v3, 0x40000000    # 2.0f

    .line 10
    .line 11
    mul-float/2addr v2, v3

    .line 12
    const/high16 v3, 0x3f800000    # 1.0f

    .line 13
    .line 14
    sub-float/2addr v2, v3

    .line 15
    const v3, 0x3e8f5c29    # 0.28f

    .line 16
    .line 17
    .line 18
    mul-float/2addr v2, v3

    .line 19
    const v3, 0x3f0ccccd    # 0.55f

    .line 20
    .line 21
    .line 22
    mul-float v4, p3, v3

    .line 23
    .line 24
    mul-float v5, p4, v2

    .line 25
    .line 26
    sub-float/2addr v4, v5

    .line 27
    mul-float v3, v3, p4

    .line 28
    .line 29
    mul-float v2, v2, p3

    .line 30
    .line 31
    add-float/2addr v2, v3

    .line 32
    const v3, 0x3f59999a    # 0.85f

    .line 33
    .line 34
    .line 35
    sub-float/2addr v2, v3

    .line 36
    mul-float v3, v4, p3

    .line 37
    .line 38
    mul-float v5, v2, p4

    .line 39
    .line 40
    add-float/2addr v5, v3

    .line 41
    const v3, 0x3e3851ec    # 0.18f

    .line 42
    .line 43
    .line 44
    cmpg-float v6, v5, v3

    .line 45
    .line 46
    if-gez v6, :cond_0

    .line 47
    .line 48
    sub-float/2addr v3, v5

    .line 49
    mul-float v5, p3, v3

    .line 50
    .line 51
    add-float/2addr v4, v5

    .line 52
    mul-float v3, v3, p4

    .line 53
    .line 54
    add-float/2addr v2, v3

    .line 55
    :cond_0
    mul-float v3, v4, v4

    .line 56
    .line 57
    mul-float v5, v2, v2

    .line 58
    .line 59
    add-float/2addr v5, v3

    .line 60
    float-to-double v5, v5

    .line 61
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    double-to-float v3, v5

    .line 66
    const v5, 0x3a83126f    # 0.001f

    .line 67
    .line 68
    .line 69
    cmpg-float v6, v3, v5

    .line 70
    .line 71
    if-gez v6, :cond_1

    .line 72
    .line 73
    move v3, v5

    .line 74
    :cond_1
    div-float/2addr v4, v3

    .line 75
    div-float/2addr v2, v3

    .line 76
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    const/high16 v5, 0x42780000    # 62.0f

    .line 81
    .line 82
    mul-float/2addr v3, v5

    .line 83
    const/high16 v5, 0x41f00000    # 30.0f

    .line 84
    .line 85
    add-float/2addr v3, v5

    .line 86
    iget v5, v0, Lyyds/ᛵᛳᛱᛷ;->ᲇᲈᛵᛷ:F

    .line 87
    .line 88
    mul-float/2addr v3, v5

    .line 89
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    const v7, 0x3ecccccd    # 0.4f

    .line 94
    .line 95
    .line 96
    mul-float/2addr v6, v7

    .line 97
    const v7, 0x3eb33333    # 0.35f

    .line 98
    .line 99
    .line 100
    add-float v13, v6, v7

    .line 101
    .line 102
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    mul-float/2addr v7, v6

    .line 111
    const v6, 0x3fc00001    # 1.5000001f

    .line 112
    .line 113
    .line 114
    mul-float/2addr v7, v6

    .line 115
    const v6, 0x3f666666    # 0.9f

    .line 116
    .line 117
    .line 118
    add-float/2addr v7, v6

    .line 119
    mul-float v15, v7, v5

    .line 120
    .line 121
    new-instance v8, Lyyds/ᛶᛸᲁ;

    .line 122
    .line 123
    mul-float v11, v4, v3

    .line 124
    .line 125
    mul-float v12, v2, v3

    .line 126
    .line 127
    iget-object v2, v0, Lyyds/ᛵᛳᛱᛷ;->ᛵᲀᲈᛴ:[I

    .line 128
    .line 129
    array-length v3, v2

    .line 130
    sget-object v4, Lyyds/ᲇᛸᛴᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛷᛶᛲ;

    .line 131
    .line 132
    invoke-virtual {v4, v3}, Lyyds/ᛳᛷᛶᛲ;->ᛶᛷᛲᲁ(I)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    aget v17, v2, v3

    .line 137
    .line 138
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    const v2, 0x40c90fdb

    .line 143
    .line 144
    .line 145
    mul-float v18, v1, v2

    .line 146
    .line 147
    move v14, v13

    .line 148
    move/from16 v16, v15

    .line 149
    .line 150
    move/from16 v9, p1

    .line 151
    .line 152
    move/from16 v10, p2

    .line 153
    .line 154
    invoke-direct/range {v8 .. v18}, Lyyds/ᛶᛸᲁ;-><init>(FFFFFFFFIF)V

    .line 155
    .line 156
    .line 157
    iget-object v0, v0, Lyyds/ᛵᛳᛱᛷ;->ᲀᛲᛱᛱ:Lyyds/ᛱᲁᛳᛵ;

    .line 158
    .line 159
    invoke-virtual {v0, v8}, Lyyds/ᛱᲁᛳᛵ;->addLast(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iget v1, v0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 163
    .line 164
    const/16 v2, 0x78

    .line 165
    .line 166
    if-le v1, v2, :cond_2

    .line 167
    .line 168
    invoke-virtual {v0}, Lyyds/ᛱᲁᛳᛵ;->removeFirst()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    :cond_2
    return-void
.end method
