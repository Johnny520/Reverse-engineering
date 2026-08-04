.class public final Lyyds/ᛷᛵᛵᲇ;
.super Landroid/graphics/drawable/Drawable;


# static fields
.field public static final synthetic ᛲᛶᛱᲈ:I


# instance fields
.field public ᛱᛳᲇ:F

.field public final ᛱᲈᲁ:Landroid/graphics/Path;

.field public final ᛲᛲᲈᲈ:F

.field public final ᛲᛳᛶᲁ:F

.field public final ᛲᛴᛳᛲ:Landroid/graphics/Paint;

.field public final ᛲᲈᲁ:F

.field public ᛳᛸᛴᛶ:Landroid/animation/ValueAnimator;

.field public ᛳᲁᲁᲇ:F

.field public ᛵᛶᛲᲀ:F

.field public final ᛵᛸᛸᛷ:Landroid/graphics/Paint;

.field public ᛵᲀᲈᛴ:Z

.field public ᛶᛳᛶᛵ:Z

.field public final ᛶᛷᛲᲁ:Landroid/graphics/Paint;

.field public ᛶᛸᲀᲁ:F

.field public ᛶᲈᛴᲈ:Landroid/animation/ValueAnimator;

.field public final ᛷᛲᲈᛱ:F

.field public final ᛷᛵᲇᲀ:F

.field public final ᛷᲈᲈᲁ:F

.field public ᲀᛲᛲᲇ:F

.field public final ᲀᛲᛳᲀ:Landroid/graphics/Paint;

.field public ᲇᛱᛲ:I

.field public final ᲇᲇᲇᛱ:Landroid/graphics/RectF;

.field public final ᲇᲈᛵᛷ:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x61

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 11

    .line 1
    const-wide v0, -0x3185be68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 21
    .line 22
    iput p1, p0, Lyyds/ᛷᛵᛵᲇ;->ᛲᲈᲁ:F

    .line 23
    .line 24
    new-instance v0, Landroid/graphics/Paint;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 28
    .line 29
    .line 30
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lyyds/ᛷᛵᛵᲇ;->ᛵᛸᛸᛷ:Landroid/graphics/Paint;

    .line 36
    .line 37
    new-instance v0, Landroid/graphics/Paint;

    .line 38
    .line 39
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 43
    .line 44
    .line 45
    const/4 v3, -0x1

    .line 46
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lyyds/ᛷᛵᛵᲇ;->ᲀᛲᛳᲀ:Landroid/graphics/Paint;

    .line 50
    .line 51
    new-instance v0, Landroid/graphics/Paint;

    .line 52
    .line 53
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 54
    .line 55
    .line 56
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 57
    .line 58
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 59
    .line 60
    .line 61
    sget-object v5, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 62
    .line 63
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lyyds/ᛷᛵᛵᲇ;->ᲇᲈᛵᛷ:Landroid/graphics/Paint;

    .line 67
    .line 68
    new-instance v0, Landroid/graphics/Paint;

    .line 69
    .line 70
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lyyds/ᛷᛵᛵᲇ;->ᛲᛴᛳᛲ:Landroid/graphics/Paint;

    .line 80
    .line 81
    new-instance v0, Landroid/graphics/RectF;

    .line 82
    .line 83
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, Lyyds/ᛷᛵᛵᲇ;->ᲇᲇᲇᛱ:Landroid/graphics/RectF;

    .line 87
    .line 88
    new-instance v0, Landroid/graphics/Paint;

    .line 89
    .line 90
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 97
    .line 98
    .line 99
    iput-object v0, p0, Lyyds/ᛷᛵᛵᲇ;->ᛶᛷᛲᲁ:Landroid/graphics/Paint;

    .line 100
    .line 101
    new-instance v4, Landroid/graphics/Path;

    .line 102
    .line 103
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 104
    .line 105
    .line 106
    const/high16 v0, -0x3f000000    # -8.0f

    .line 107
    .line 108
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 109
    .line 110
    invoke-virtual {v4, v2, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 111
    .line 112
    .line 113
    const/high16 v0, -0x3ec00000    # -12.0f

    .line 114
    .line 115
    const/4 v3, 0x0

    .line 116
    invoke-virtual {v4, v0, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x41000000    # 8.0f

    .line 120
    .line 121
    invoke-virtual {v4, v2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x40600000    # 3.5f

    .line 125
    .line 126
    invoke-virtual {v4, v2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 127
    .line 128
    .line 129
    const/high16 v9, 0x41400000    # 12.0f

    .line 130
    .line 131
    const/high16 v10, 0x41300000    # 11.0f

    .line 132
    .line 133
    const/high16 v5, 0x40a00000    # 5.0f

    .line 134
    .line 135
    const/high16 v6, 0x40600000    # 3.5f

    .line 136
    .line 137
    const/high16 v7, 0x41100000    # 9.0f

    .line 138
    .line 139
    const/high16 v8, 0x40c00000    # 6.0f

    .line 140
    .line 141
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 142
    .line 143
    .line 144
    const/high16 v9, -0x3fc00000    # -3.0f

    .line 145
    .line 146
    const/high16 v10, -0x3fa00000    # -3.5f

    .line 147
    .line 148
    const/high16 v5, 0x41300000    # 11.0f

    .line 149
    .line 150
    const/high16 v6, 0x40000000    # 2.0f

    .line 151
    .line 152
    const/high16 v7, 0x40c00000    # 6.0f

    .line 153
    .line 154
    const/high16 v8, -0x3fa00000    # -3.5f

    .line 155
    .line 156
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 160
    .line 161
    .line 162
    iput-object v4, p0, Lyyds/ᛷᛵᛵᲇ;->ᛱᲈᲁ:Landroid/graphics/Path;

    .line 163
    .line 164
    const/high16 v0, 0x42400000    # 48.0f

    .line 165
    .line 166
    mul-float/2addr v0, p1

    .line 167
    iput v0, p0, Lyyds/ᛷᛵᛵᲇ;->ᛲᛳᛶᲁ:F

    .line 168
    .line 169
    const/high16 v0, 0x41880000    # 17.0f

    .line 170
    .line 171
    mul-float/2addr v0, p1

    .line 172
    iput v0, p0, Lyyds/ᛷᛵᛵᲇ;->ᛷᲈᲈᲁ:F

    .line 173
    .line 174
    const/high16 v0, 0x41940000    # 18.5f

    .line 175
    .line 176
    mul-float/2addr v0, p1

    .line 177
    iput v0, p0, Lyyds/ᛷᛵᛵᲇ;->ᛷᛲᲈᛱ:F

    .line 178
    .line 179
    const/high16 v0, 0x41c00000    # 24.0f

    .line 180
    .line 181
    mul-float/2addr v0, p1

    .line 182
    iput v0, p0, Lyyds/ᛷᛵᛵᲇ;->ᛷᛵᲇᲀ:F

    .line 183
    .line 184
    const/high16 v0, 0x40800000    # 4.0f

    .line 185
    .line 186
    mul-float/2addr p1, v0

    .line 187
    iput p1, p0, Lyyds/ᛷᛵᛵᲇ;->ᛲᛲᲈᲈ:F

    .line 188
    .line 189
    const/high16 p1, 0x3f800000    # 1.0f

    .line 190
    .line 191
    iput p1, p0, Lyyds/ᛷᛵᛵᲇ;->ᛳᲁᲁᲇ:F

    .line 192
    .line 193
    iput v1, p0, Lyyds/ᛷᛵᛵᲇ;->ᲇᛱᛲ:I

    .line 194
    .line 195
    iput p1, p0, Lyyds/ᛷᛵᛵᲇ;->ᲀᛲᛲᲇ:F

    .line 196
    .line 197
    return-void
.end method

.method public static native ᛲᲈᲁ(IIF)I
.end method


# virtual methods
.method public final native draw(Landroid/graphics/Canvas;)V
.end method

.method public final native getOpacity()I
.end method

.method public final native setAlpha(I)V
.end method

.method public final native setColorFilter(Landroid/graphics/ColorFilter;)V
.end method

.method public final native ᛵᛸᛸᛷ()V
.end method

.method public final native ᲀᛲᛳᲀ(Landroid/graphics/Rect;FFZIIIIF)V
.end method
