.class public final Lcom/example/dyhelper/hook/panel/StarIconView;
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
    .locals 14

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
    if-lez v3, :cond_5

    .line 21
    .line 22
    cmpg-float v2, v1, v2

    .line 23
    .line 24
    if-gtz v2, :cond_0

    .line 25
    .line 26
    goto/16 :goto_3

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
    div-float v3, v1, v3

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
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 70
    .line 71
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

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
    const v1, 0x3ecccccd    # 0.4f

    .line 86
    .line 87
    .line 88
    mul-float/2addr v0, v1

    .line 89
    mul-float/2addr v1, v0

    .line 90
    const/4 v2, 0x0

    .line 91
    :goto_0
    const/16 v5, 0xa

    .line 92
    .line 93
    if-ge v2, v5, :cond_4

    .line 94
    .line 95
    rem-int/lit8 v5, v2, 0x2

    .line 96
    .line 97
    if-nez v5, :cond_2

    .line 98
    .line 99
    move v5, v0

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move v5, v1

    .line 102
    :goto_1
    int-to-double v6, v2

    .line 103
    const-wide v8, 0x400921fb54442d18L    # Math.PI

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    mul-double/2addr v6, v8

    .line 109
    const/4 v8, 0x5

    .line 110
    int-to-double v8, v8

    .line 111
    div-double/2addr v6, v8

    .line 112
    const-wide v8, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    add-double/2addr v6, v8

    .line 118
    float-to-double v8, v4

    .line 119
    float-to-double v10, v5

    .line 120
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    .line 121
    .line 122
    .line 123
    move-result-wide v12

    .line 124
    mul-double/2addr v12, v10

    .line 125
    add-double/2addr v12, v8

    .line 126
    double-to-float v5, v12

    .line 127
    float-to-double v8, v3

    .line 128
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    mul-double/2addr v6, v10

    .line 133
    sub-double/2addr v8, v6

    .line 134
    double-to-float v6, v8

    .line 135
    if-nez v2, :cond_3

    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-virtual {v7, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_3
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-virtual {v7, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 150
    .line 151
    .line 152
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_4
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPaint()Landroid/graphics/Paint;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {p1, v0, p0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 171
    .line 172
    .line 173
    :cond_5
    :goto_3
    return-void
.end method
