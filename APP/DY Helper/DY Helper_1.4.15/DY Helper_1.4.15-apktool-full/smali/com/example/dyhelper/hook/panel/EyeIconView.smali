.class public final Lcom/example/dyhelper/hook/panel/EyeIconView;
.super Lcom/example/dyhelper/hook/panel/BaseIconView;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/panel/BaseIconView;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-float v0, v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    int-to-float v1, v1

    .line 17
    const/4 v2, 0x0

    .line 18
    cmpg-float v3, v0, v2

    .line 19
    .line 20
    if-lez v3, :cond_2

    .line 21
    .line 22
    cmpg-float v2, v1, v2

    .line 23
    .line 24
    if-gtz v2, :cond_0

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const v3, 0x3d99999a    # 0.075f

    .line 33
    .line 34
    .line 35
    mul-float/2addr v2, v3

    .line 36
    const/high16 v3, 0x40000000    # 2.0f

    .line 37
    .line 38
    cmpg-float v4, v2, v3

    .line 39
    .line 40
    if-gez v4, :cond_1

    .line 41
    .line 42
    move v2, v3

    .line 43
    :cond_1
    div-float v4, v0, v3

    .line 44
    .line 45
    div-float v11, v1, v3

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPaint()Landroid/graphics/Paint;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getIconColor()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPaint()Landroid/graphics/Paint;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPaint()Landroid/graphics/Paint;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    sget-object v5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 70
    .line 71
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 72
    .line 73
    .line 74
    const v2, 0x3f47ae14    # 0.78f

    .line 75
    .line 76
    .line 77
    mul-float/2addr v2, v0

    .line 78
    const v5, 0x3ee66666    # 0.45f

    .line 79
    .line 80
    .line 81
    mul-float/2addr v5, v1

    .line 82
    div-float v6, v2, v3

    .line 83
    .line 84
    sub-float v12, v4, v6

    .line 85
    .line 86
    add-float v10, v4, v6

    .line 87
    .line 88
    div-float/2addr v5, v3

    .line 89
    sub-float v7, v11, v5

    .line 90
    .line 91
    add-float v3, v11, v5

    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v5, v12, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    const v6, 0x3e6147ae    # 0.22f

    .line 112
    .line 113
    .line 114
    mul-float/2addr v2, v6

    .line 115
    add-float v6, v12, v2

    .line 116
    .line 117
    sub-float v8, v10, v2

    .line 118
    .line 119
    move v9, v7

    .line 120
    invoke-virtual/range {v5 .. v11}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    move v9, v3

    .line 128
    move v7, v8

    .line 129
    move v8, v6

    .line 130
    move v6, v7

    .line 131
    move v7, v3

    .line 132
    move v10, v12

    .line 133
    invoke-virtual/range {v5 .. v11}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPaint()Landroid/graphics/Paint;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPaint()Landroid/graphics/Paint;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 152
    .line 153
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    const v1, 0x3e051eb8    # 0.13f

    .line 161
    .line 162
    .line 163
    mul-float/2addr v0, v1

    .line 164
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPaint()Landroid/graphics/Paint;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p1, v4, v11, v0, p0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 169
    .line 170
    .line 171
    :cond_2
    :goto_0
    return-void
.end method
