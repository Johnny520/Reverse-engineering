.class public final Lcom/example/dyhelper/hook/panel/CopyIconView;
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
    .locals 9

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
    sget-object v5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 70
    .line 71
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    const v1, 0x3f19999a    # 0.6f

    .line 79
    .line 80
    .line 81
    mul-float/2addr v0, v1

    .line 82
    const v1, 0x3e4ccccd    # 0.2f

    .line 83
    .line 84
    .line 85
    mul-float/2addr v1, v0

    .line 86
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const/4 v5, 0x2

    .line 98
    int-to-float v5, v5

    .line 99
    div-float/2addr v0, v5

    .line 100
    sub-float v5, v4, v0

    .line 101
    .line 102
    add-float v6, v5, v1

    .line 103
    .line 104
    sub-float v7, v3, v0

    .line 105
    .line 106
    invoke-virtual {v2, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    add-float/2addr v4, v0

    .line 114
    add-float v8, v4, v1

    .line 115
    .line 116
    invoke-virtual {v2, v8, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    add-float/2addr v3, v0

    .line 124
    invoke-virtual {v2, v8, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0, v6, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPaint()Landroid/graphics/Paint;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sub-float/2addr v7, v1

    .line 164
    invoke-virtual {v0, v5, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0, v4, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    sub-float/2addr v3, v1

    .line 179
    invoke-virtual {v0, v4, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0, v5, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPath()Landroid/graphics/Path;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/panel/BaseIconView;->getPaint()Landroid/graphics/Paint;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-virtual {p1, v0, p0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 205
    .line 206
    .line 207
    :cond_2
    :goto_0
    return-void
.end method
