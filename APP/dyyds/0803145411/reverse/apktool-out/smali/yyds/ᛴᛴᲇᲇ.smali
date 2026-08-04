.class public final Lyyds/ᛴᛴᲇᲇ;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:F

.field public final ᛲᲈᲁ:F

.field public final ᛵᛸᛸᛷ:Landroid/graphics/Paint;

.field public final ᲀᛲᛳᲀ:Landroid/graphics/Path;

.field public ᲇᲇᲇᛱ:Z

.field public final ᲇᲈᛵᛷ:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᛴᛴᲇᲇ;->ᛲᲈᲁ:F

    .line 5
    .line 6
    new-instance p1, Landroid/graphics/Paint;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    .line 13
    .line 14
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lyyds/ᛴᛴᲇᲇ;->ᛵᛸᛸᛷ:Landroid/graphics/Paint;

    .line 23
    .line 24
    new-instance p1, Landroid/graphics/Path;

    .line 25
    .line 26
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lyyds/ᛴᛴᲇᲇ;->ᲀᛲᛳᲀ:Landroid/graphics/Path;

    .line 30
    .line 31
    new-instance p1, Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lyyds/ᛴᛴᲇᲇ;->ᲇᲈᛵᛷ:Landroid/graphics/RectF;

    .line 37
    .line 38
    const/high16 p1, -0x40800000    # -1.0f

    .line 39
    .line 40
    iput p1, p0, Lyyds/ᛴᛴᲇᲇ;->ᛲᛴᛳᛲ:F

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide v1, -0x526b3e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    iget v1, v0, Lyyds/ᛴᛴᲇᲇ;->ᛲᛴᛳᛲ:F

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    cmpg-float v3, v1, v2

    .line 15
    .line 16
    if-ltz v3, :cond_2

    .line 17
    .line 18
    const/high16 v3, 0x3f800000    # 1.0f

    .line 19
    .line 20
    cmpl-float v1, v1, v3

    .line 21
    .line 22
    if-lez v1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    int-to-float v6, v1

    .line 35
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    int-to-float v7, v1

    .line 44
    cmpg-float v1, v6, v2

    .line 45
    .line 46
    if-lez v1, :cond_2

    .line 47
    .line 48
    cmpg-float v1, v7, v2

    .line 49
    .line 50
    if-gtz v1, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object v1, v0, Lyyds/ᛴᛴᲇᲇ;->ᲀᛲᛳᲀ:Landroid/graphics/Path;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 56
    .line 57
    .line 58
    iget-object v3, v0, Lyyds/ᛴᛴᲇᲇ;->ᲇᲈᛵᛷ:Landroid/graphics/RectF;

    .line 59
    .line 60
    invoke-virtual {v3, v2, v2, v6, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 61
    .line 62
    .line 63
    iget v2, v0, Lyyds/ᛴᛴᲇᲇ;->ᛲᲈᲁ:F

    .line 64
    .line 65
    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 66
    .line 67
    invoke-virtual {v1, v3, v2, v2, v4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 71
    .line 72
    .line 73
    move-object/from16 v3, p1

    .line 74
    .line 75
    invoke-virtual {v3, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 76
    .line 77
    .line 78
    const v1, 0x3ecccccd    # 0.4f

    .line 79
    .line 80
    .line 81
    mul-float/2addr v1, v6

    .line 82
    neg-float v2, v1

    .line 83
    const/high16 v4, 0x40000000    # 2.0f

    .line 84
    .line 85
    div-float/2addr v2, v4

    .line 86
    iget v5, v0, Lyyds/ᛴᛴᲇᲇ;->ᛲᛴᛳᛲ:F

    .line 87
    .line 88
    add-float v8, v6, v1

    .line 89
    .line 90
    mul-float/2addr v8, v5

    .line 91
    add-float/2addr v8, v2

    .line 92
    div-float/2addr v1, v4

    .line 93
    sub-float v10, v8, v1

    .line 94
    .line 95
    add-float v12, v8, v1

    .line 96
    .line 97
    new-instance v9, Landroid/graphics/LinearGradient;

    .line 98
    .line 99
    const v1, 0x66ffffff

    .line 100
    .line 101
    .line 102
    const v2, 0xffffff

    .line 103
    .line 104
    .line 105
    const v4, 0x33ffffff

    .line 106
    .line 107
    .line 108
    filled-new-array {v2, v4, v1, v4, v2}, [I

    .line 109
    .line 110
    .line 111
    move-result-object v14

    .line 112
    const/4 v1, 0x5

    .line 113
    new-array v15, v1, [F

    .line 114
    .line 115
    fill-array-data v15, :array_0

    .line 116
    .line 117
    .line 118
    sget-object v16, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 119
    .line 120
    const/4 v11, 0x0

    .line 121
    const/4 v13, 0x0

    .line 122
    invoke-direct/range {v9 .. v16}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 123
    .line 124
    .line 125
    iget-object v8, v0, Lyyds/ᛴᛴᲇᲇ;->ᛵᛸᛸᛷ:Landroid/graphics/Paint;

    .line 126
    .line 127
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 128
    .line 129
    .line 130
    const/16 v0, 0xff

    .line 131
    .line 132
    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 133
    .line 134
    .line 135
    const/4 v4, 0x0

    .line 136
    const/4 v5, 0x0

    .line 137
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 138
    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 145
    .line 146
    .line 147
    :cond_2
    :goto_0
    return-void

    .line 148
    nop

    .line 149
    :array_0
    .array-data 4
        0x0
        0x3e99999a    # 0.3f
        0x3f000000    # 0.5f
        0x3f333333    # 0.7f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x3

    .line 2
    return p0
.end method

.method public final setAlpha(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛴᲇᲇ;->ᛵᛸᛸᛷ:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛴᲇᲇ;->ᛵᛸᛸᛷ:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    return-void
.end method
