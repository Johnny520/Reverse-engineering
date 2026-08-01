.class public final Lcom/example/dyhelper/ui/WatermarkView;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ε:Landroid/graphics/Paint;

.field public ζ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

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
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/example/dyhelper/ui/WatermarkView;->ε:Landroid/graphics/Paint;

    .line 32
    .line 33
    const-string p1, ""

    .line 34
    .line 35
    iput-object p1, p0, Lcom/example/dyhelper/ui/WatermarkView;->ζ:Ljava/lang/String;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/example/dyhelper/ui/WatermarkView;->ζ:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lez v0, :cond_8

    .line 26
    .line 27
    if-gtz v1, :cond_1

    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 40
    .line 41
    and-int/lit8 v2, v2, 0x30

    .line 42
    .line 43
    const/16 v3, 0x20

    .line 44
    .line 45
    const/16 v4, 0xff

    .line 46
    .line 47
    if-ne v2, v3, :cond_2

    .line 48
    .line 49
    const/16 v2, 0xa0

    .line 50
    .line 51
    invoke-static {v2, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/16 v2, 0xde

    .line 57
    .line 58
    invoke-static {v4, v4, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    :goto_0
    iget-object v3, p0, Lcom/example/dyhelper/ui/WatermarkView;->ε:Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 65
    .line 66
    .line 67
    const/high16 v2, 0x42400000    # 48.0f

    .line 68
    .line 69
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 70
    .line 71
    .line 72
    int-to-float v2, v0

    .line 73
    const v4, 0x3f51eb85    # 0.82f

    .line 74
    .line 75
    .line 76
    mul-float/2addr v4, v2

    .line 77
    const/high16 v5, 0x3f800000    # 1.0f

    .line 78
    .line 79
    cmpg-float v6, v4, v5

    .line 80
    .line 81
    if-gez v6, :cond_3

    .line 82
    .line 83
    move v4, v5

    .line 84
    :cond_3
    iget-object v5, p0, Lcom/example/dyhelper/ui/WatermarkView;->ζ:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    cmpl-float v6, v5, v4

    .line 91
    .line 92
    if-lez v6, :cond_5

    .line 93
    .line 94
    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    mul-float/2addr v6, v4

    .line 99
    div-float/2addr v6, v5

    .line 100
    const/high16 v4, 0x41600000    # 14.0f

    .line 101
    .line 102
    cmpg-float v5, v6, v4

    .line 103
    .line 104
    if-gez v5, :cond_4

    .line 105
    .line 106
    move v6, v4

    .line 107
    :cond_4
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 108
    .line 109
    .line 110
    :cond_5
    iget-object v4, p0, Lcom/example/dyhelper/ui/WatermarkView;->ζ:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    invoke-virtual {v3}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    iget v6, v5, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 121
    .line 122
    iget v5, v5, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 123
    .line 124
    sub-float/2addr v6, v5

    .line 125
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 126
    .line 127
    .line 128
    const/high16 v5, 0x42c80000    # 100.0f

    .line 129
    .line 130
    add-float/2addr v4, v5

    .line 131
    const/high16 v5, 0x42a00000    # 80.0f

    .line 132
    .line 133
    add-float/2addr v6, v5

    .line 134
    mul-int/2addr v0, v0

    .line 135
    mul-int v5, v1, v1

    .line 136
    .line 137
    add-int/2addr v5, v0

    .line 138
    int-to-double v7, v5

    .line 139
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 140
    .line 141
    .line 142
    move-result-wide v7

    .line 143
    double-to-float v0, v7

    .line 144
    div-float v5, v0, v6

    .line 145
    .line 146
    float-to-int v5, v5

    .line 147
    const/4 v7, 0x2

    .line 148
    add-int/2addr v5, v7

    .line 149
    div-float v8, v0, v4

    .line 150
    .line 151
    float-to-int v8, v8

    .line 152
    add-int/2addr v8, v7

    .line 153
    const/high16 v9, 0x40000000    # 2.0f

    .line 154
    .line 155
    div-float/2addr v2, v9

    .line 156
    int-to-float v1, v1

    .line 157
    div-float/2addr v1, v9

    .line 158
    const/high16 v9, -0x3e100000    # -30.0f

    .line 159
    .line 160
    invoke-virtual {p1, v9, v2, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 161
    .line 162
    .line 163
    neg-float v0, v0

    .line 164
    int-to-float v1, v7

    .line 165
    div-float/2addr v0, v1

    .line 166
    const/4 v1, 0x0

    .line 167
    move v2, v1

    .line 168
    :goto_1
    if-ge v2, v5, :cond_7

    .line 169
    .line 170
    move v7, v1

    .line 171
    :goto_2
    if-ge v7, v8, :cond_6

    .line 172
    .line 173
    int-to-float v9, v7

    .line 174
    mul-float/2addr v9, v4

    .line 175
    add-float/2addr v9, v0

    .line 176
    int-to-float v10, v2

    .line 177
    mul-float/2addr v10, v6

    .line 178
    add-float/2addr v10, v0

    .line 179
    iget-object v11, p0, Lcom/example/dyhelper/ui/WatermarkView;->ζ:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {p1, v11, v9, v10, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 182
    .line 183
    .line 184
    add-int/lit8 v7, v7, 0x1

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_7
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 191
    .line 192
    .line 193
    :cond_8
    :goto_3
    return-void
.end method

.method public final setWatermarkText(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/ui/WatermarkView;->ζ:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
