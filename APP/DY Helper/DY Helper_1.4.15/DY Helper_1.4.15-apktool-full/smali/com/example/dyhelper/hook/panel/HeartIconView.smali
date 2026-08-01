.class public final Lcom/example/dyhelper/hook/panel/HeartIconView;
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
    div-float v9, v0, v3

    .line 44
    .line 45
    div-float v6, v1, v3

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPaint()Landroid/graphics/Paint;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getIconColor()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPaint()Landroid/graphics/Paint;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPaint()Landroid/graphics/Paint;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    const v1, 0x3d23d70a    # 0.04f

    .line 86
    .line 87
    .line 88
    mul-float/2addr v0, v1

    .line 89
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    const/4 v2, 0x3

    .line 94
    int-to-float v2, v2

    .line 95
    mul-float/2addr v2, v0

    .line 96
    add-float v3, v6, v2

    .line 97
    .line 98
    invoke-virtual {v1, v9, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const/4 v1, 0x6

    .line 106
    int-to-float v1, v1

    .line 107
    mul-float/2addr v1, v0

    .line 108
    sub-float v5, v9, v1

    .line 109
    .line 110
    const/16 v7, 0x9

    .line 111
    .line 112
    int-to-float v7, v7

    .line 113
    mul-float/2addr v7, v0

    .line 114
    add-float v8, v7, v6

    .line 115
    .line 116
    const/16 v7, 0xc

    .line 117
    .line 118
    int-to-float v7, v7

    .line 119
    mul-float/2addr v0, v7

    .line 120
    sub-float v7, v9, v0

    .line 121
    .line 122
    sub-float v10, v6, v2

    .line 123
    .line 124
    move v11, v8

    .line 125
    move v8, v6

    .line 126
    move v6, v11

    .line 127
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 128
    .line 129
    .line 130
    move v11, v8

    .line 131
    move v8, v6

    .line 132
    move v6, v11

    .line 133
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    add-float v5, v9, v0

    .line 138
    .line 139
    add-float v7, v9, v1

    .line 140
    .line 141
    move v10, v3

    .line 142
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPaint()Landroid/graphics/Paint;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p1, v0, p0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 161
    .line 162
    .line 163
    :cond_2
    :goto_0
    return-void
.end method
