.class public final Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;
.super Landroid/view/View;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子世兰楪苏哲:Z

.field public 飘花落叶言子世哲兰楪苏:Ljava/lang/Runnable;

.field public 飘花落叶言子世哲兰苏楪:L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰楪苏;

.field public 飘花落叶言子世哲楪兰苏:Landroid/animation/ValueAnimator;

.field public 飘花落叶言子世哲楪苏兰:I

.field public 飘花落叶言子世哲苏兰楪:Landroid/view/animation/Interpolator;

.field public 飘花落叶言子世哲苏楪兰:F

.field public 飘花落叶言子世楪兰哲苏:F

.field public 飘花落叶言子世楪兰苏哲:F

.field public 飘花落叶言子世楪哲兰苏:F

.field public 飘花落叶言子世楪哲苏兰:Z

.field public final 飘花落叶言子世楪苏兰哲:Landroid/graphics/Paint;

.field public 飘花落叶言子世楪苏哲兰:F

.field public 飘花落叶言子世苏兰哲楪:I

.field public 飘花落叶言子世苏兰楪哲:F

.field public 飘花落叶言子世苏哲兰楪:F

.field public 飘花落叶言子世苏哲楪兰:F

.field public 飘花落叶言子世苏楪兰哲:I

.field public 飘花落叶言子世苏楪哲兰:Landroid/graphics/RectF;

.field public 飘花落叶言子楪兰世哲苏:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

.field public 飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子楪兰哲世苏:F

.field public final 飘花落叶言子楪兰哲苏世:F

.field public 飘花落叶言子楪兰苏世哲:F

.field public 飘花落叶言子楪兰苏哲世:F

.field public final 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:I

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 16
    .line 17
    const/high16 v1, 0x40000000    # 2.0f

    .line 18
    .line 19
    mul-float/2addr v1, v0

    .line 20
    const/high16 v0, 0x3f000000    # 0.5f

    .line 21
    .line 22
    add-float/2addr v1, v0

    .line 23
    float-to-int v0, v1

    .line 24
    iput v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 25
    .line 26
    const/4 v0, -0x1

    .line 27
    iput v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:I

    .line 28
    .line 29
    const/high16 v0, 0x43340000    # 180.0f

    .line 30
    .line 31
    iput v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲世苏:F

    .line 32
    .line 33
    const/high16 v0, 0x42a00000    # 80.0f

    .line 34
    .line 35
    iput v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲苏世:F

    .line 36
    .line 37
    new-instance v0, Landroid/graphics/Paint;

    .line 38
    .line 39
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲:Landroid/graphics/Paint;

    .line 43
    .line 44
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲苏兰:Z

    .line 45
    .line 46
    const/high16 v0, 0x42c80000    # 100.0f

    .line 47
    .line 48
    iput v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰哲苏:F

    .line 49
    .line 50
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪兰哲:I

    .line 51
    .line 52
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏兰哲楪:I

    .line 53
    .line 54
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪苏兰:I

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲()V

    .line 57
    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public getColor()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    return p0
.end method

.method public getStatus()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    return p0
.end method

.method public getStrokeWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    return p0
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iput-boolean v1, v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 13
    .line 14
    :cond_1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v6, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲:Landroid/graphics/Paint;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroid/graphics/RectF;

    .line 10
    .line 11
    const v4, 0x43b68000    # 365.0f

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    move-object v1, p1

    .line 17
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    move-object v1, p1

    .line 22
    iget-boolean p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰楪苏哲:Z

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroid/graphics/RectF;

    .line 28
    .line 29
    const v4, 0x43b68000    # 365.0f

    .line 30
    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 35
    .line 36
    .line 37
    iput v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪兰哲:I

    .line 38
    .line 39
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 40
    .line 41
    invoke-virtual {p0, p1, v1}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(ILandroid/graphics/Canvas;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 46
    .line 47
    const/high16 v7, 0x43b40000    # 360.0f

    .line 48
    .line 49
    if-eqz p1, :cond_9

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, 0x1

    .line 53
    if-eq p1, v9, :cond_5

    .line 54
    .line 55
    if-eq p1, v0, :cond_5

    .line 56
    .line 57
    const/4 v0, 0x3

    .line 58
    if-eq p1, v0, :cond_5

    .line 59
    .line 60
    const/4 v0, 0x4

    .line 61
    if-eq p1, v0, :cond_2

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_2
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪兰哲:I

    .line 66
    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    if-eq p1, v9, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroid/graphics/RectF;

    .line 73
    .line 74
    const/high16 v4, 0x43b40000    # 360.0f

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    const/4 v3, 0x0

    .line 78
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 79
    .line 80
    .line 81
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 82
    .line 83
    invoke-virtual {p0, p1, v1}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(ILandroid/graphics/Canvas;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroid/graphics/RectF;

    .line 88
    .line 89
    iget v4, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏世哲:F

    .line 90
    .line 91
    const/4 v5, 0x0

    .line 92
    const/high16 v3, -0x3d4c0000    # -90.0f

    .line 93
    .line 94
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 95
    .line 96
    .line 97
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏世哲:F

    .line 98
    .line 99
    const v0, 0x43b68000    # 365.0f

    .line 100
    .line 101
    .line 102
    cmpl-float p1, p1, v0

    .line 103
    .line 104
    if-nez p1, :cond_8

    .line 105
    .line 106
    iput v9, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪兰哲:I

    .line 107
    .line 108
    iget-object p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰楪苏:Ljava/lang/Runnable;

    .line 109
    .line 110
    if-eqz p1, :cond_8

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 113
    .line 114
    .line 115
    iput-object v8, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰楪苏:Ljava/lang/Runnable;

    .line 116
    .line 117
    return-void

    .line 118
    :cond_5
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪兰哲:I

    .line 119
    .line 120
    if-eqz p1, :cond_7

    .line 121
    .line 122
    if-eq p1, v9, :cond_6

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_6
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroid/graphics/RectF;

    .line 126
    .line 127
    const/high16 v4, 0x43b40000    # 360.0f

    .line 128
    .line 129
    const/4 v5, 0x0

    .line 130
    const/4 v3, 0x0

    .line 131
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 135
    .line 136
    invoke-virtual {p0, p1, v1}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(ILandroid/graphics/Canvas;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_7
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲兰楪:F

    .line 141
    .line 142
    const/high16 v0, 0x40a00000    # 5.0f

    .line 143
    .line 144
    add-float v4, p1, v0

    .line 145
    .line 146
    iput v4, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲兰楪:F

    .line 147
    .line 148
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroid/graphics/RectF;

    .line 149
    .line 150
    iget v3, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲楪兰:F

    .line 151
    .line 152
    const/4 v5, 0x0

    .line 153
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 154
    .line 155
    .line 156
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲兰楪:F

    .line 157
    .line 158
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏兰楪哲:F

    .line 159
    .line 160
    sub-float/2addr v7, v0

    .line 161
    sub-float/2addr p1, v7

    .line 162
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲楪兰:F

    .line 163
    .line 164
    cmpl-float p1, p1, v0

    .line 165
    .line 166
    if-ltz p1, :cond_8

    .line 167
    .line 168
    iput v9, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪兰哲:I

    .line 169
    .line 170
    iget-object p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰楪苏:Ljava/lang/Runnable;

    .line 171
    .line 172
    if-eqz p1, :cond_8

    .line 173
    .line 174
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 175
    .line 176
    .line 177
    iput-object v8, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰楪苏:Ljava/lang/Runnable;

    .line 178
    .line 179
    :cond_8
    :goto_0
    return-void

    .line 180
    :cond_9
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏哲兰:F

    .line 181
    .line 182
    float-to-double v2, p1

    .line 183
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏哲世:F

    .line 184
    .line 185
    float-to-double v4, p1

    .line 186
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 187
    .line 188
    .line 189
    move-result-wide v4

    .line 190
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 191
    .line 192
    .line 193
    move-result-wide v4

    .line 194
    mul-double/2addr v4, v2

    .line 195
    double-to-float p1, v4

    .line 196
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏哲兰:F

    .line 197
    .line 198
    add-float/2addr p1, v0

    .line 199
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲苏世:F

    .line 200
    .line 201
    const/high16 v2, 0x40000000    # 2.0f

    .line 202
    .line 203
    div-float/2addr v0, v2

    .line 204
    add-float/2addr v0, p1

    .line 205
    iget v3, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏世哲:F

    .line 206
    .line 207
    sub-float p1, v3, v0

    .line 208
    .line 209
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲楪兰:F

    .line 210
    .line 211
    const/4 v2, 0x0

    .line 212
    cmpg-float v4, p1, v2

    .line 213
    .line 214
    if-gez v4, :cond_a

    .line 215
    .line 216
    add-float/2addr p1, v7

    .line 217
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲楪兰:F

    .line 218
    .line 219
    :cond_a
    iput v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲兰楪:F

    .line 220
    .line 221
    cmpg-float p1, v0, v2

    .line 222
    .line 223
    if-gez p1, :cond_b

    .line 224
    .line 225
    sub-float/2addr v7, v0

    .line 226
    goto :goto_1

    .line 227
    :cond_b
    move v7, v0

    .line 228
    :goto_1
    iput v7, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏兰楪哲:F

    .line 229
    .line 230
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroid/graphics/RectF;

    .line 231
    .line 232
    neg-float v4, v0

    .line 233
    const/4 v5, 0x0

    .line 234
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 235
    .line 236
    .line 237
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    int-to-float p1, p1

    .line 5
    const/high16 p3, 0x3f800000    # 1.0f

    .line 6
    .line 7
    mul-float/2addr p1, p3

    .line 8
    const/high16 p4, 0x40000000    # 2.0f

    .line 9
    .line 10
    div-float/2addr p1, p4

    .line 11
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲兰苏:F

    .line 12
    .line 13
    int-to-float p1, p2

    .line 14
    mul-float/2addr p1, p3

    .line 15
    div-float/2addr p1, p4

    .line 16
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰苏哲:F

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    div-int/lit8 p1, p1, 0x2

    .line 31
    .line 32
    iget p2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 33
    .line 34
    div-int/lit8 p2, p2, 0x2

    .line 35
    .line 36
    sub-int/2addr p1, p2

    .line 37
    int-to-float p1, p1

    .line 38
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰哲苏:F

    .line 39
    .line 40
    new-instance p1, Landroid/graphics/RectF;

    .line 41
    .line 42
    iget p2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲兰苏:F

    .line 43
    .line 44
    iget p3, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰哲苏:F

    .line 45
    .line 46
    sub-float p4, p2, p3

    .line 47
    .line 48
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰苏哲:F

    .line 49
    .line 50
    sub-float v1, v0, p3

    .line 51
    .line 52
    add-float/2addr p2, p3

    .line 53
    add-float/2addr v0, p3

    .line 54
    invoke-direct {p1, p4, v1, p2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroid/graphics/RectF;

    .line 58
    .line 59
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iput-boolean v1, v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 13
    .line 14
    :cond_1
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    if-eq v0, v2, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏世哲:F

    .line 21
    .line 22
    :cond_2
    iput-boolean v1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰楪苏哲:Z

    .line 23
    .line 24
    iput v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 25
    .line 26
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏世哲:F

    .line 27
    .line 28
    const v2, 0x43b68000    # 365.0f

    .line 29
    .line 30
    .line 31
    mul-float/2addr p1, v2

    .line 32
    invoke-static {v0, p1}, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(FF)Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 37
    .line 38
    const-wide/16 v2, 0x3e8

    .line 39
    .line 40
    iput-wide v2, p1, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:J

    .line 41
    .line 42
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 43
    .line 44
    const/high16 v2, 0x40000000    # 2.0f

    .line 45
    .line 46
    invoke-direct {v0, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p1, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroid/view/animation/Interpolator;

    .line 50
    .line 51
    iget-object p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 52
    .line 53
    iput v1, p1, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:I

    .line 54
    .line 55
    new-instance v0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世兰哲;

    .line 56
    .line 57
    invoke-direct {v0, p0, v1}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世兰哲;-><init>(Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;I)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p1, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世兰哲;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(ILandroid/view/animation/Interpolator;)V
    .locals 2

    .line 1
    iput-object p2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏兰楪:Landroid/view/animation/Interpolator;

    .line 2
    .line 3
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪兰哲:I

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲世兰;

    .line 10
    .line 11
    const/4 p2, 0x5

    .line 12
    invoke-direct {p1, p0, p2}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲世兰;-><init>(Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰楪苏:Ljava/lang/Runnable;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪兰苏:Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪兰苏:Landroid/animation/ValueAnimator;

    .line 27
    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏楪兰:F

    .line 30
    .line 31
    const/4 p1, 0x2

    .line 32
    new-array p2, p1, [F

    .line 33
    .line 34
    fill-array-data p2, :array_0

    .line 35
    .line 36
    .line 37
    invoke-static {p2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iput-object p2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪兰苏:Landroid/animation/ValueAnimator;

    .line 42
    .line 43
    const-wide/16 v0, 0x12c

    .line 44
    .line 45
    invoke-virtual {p2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 46
    .line 47
    .line 48
    iget-object p2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪兰苏:Landroid/animation/ValueAnimator;

    .line 49
    .line 50
    new-instance v0, Lcom/google/android/material/textfield/飘花落叶言子世楪苏哲兰;

    .line 51
    .line 52
    invoke-direct {v0, p0, p1}, Lcom/google/android/material/textfield/飘花落叶言子世楪苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪兰苏:Landroid/animation/ValueAnimator;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 8

    .line 1
    const-class v0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲苏兰:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲苏兰:Z

    .line 15
    .line 16
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲:Landroid/graphics/Paint;

    .line 22
    .line 23
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲:Landroid/graphics/Paint;

    .line 29
    .line 30
    iget v3, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:I

    .line 31
    .line 32
    int-to-float v3, v3

    .line 33
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲:Landroid/graphics/Paint;

    .line 37
    .line 38
    sget-object v3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲:Landroid/graphics/Paint;

    .line 44
    .line 45
    iget v3, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:I

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    const/16 v4, 0x1e

    .line 63
    .line 64
    if-lt v3, v4, :cond_1

    .line 65
    .line 66
    const-class v3, Landroid/view/WindowManager;

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Landroid/view/WindowManager;

    .line 73
    .line 74
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2}, Landroid/view/Display;->getMode()Landroid/view/Display$Mode;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2}, Landroid/view/Display$Mode;->getRefreshRate()F

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    const-string v3, "window"

    .line 88
    .line 89
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, Landroid/view/WindowManager;

    .line 94
    .line 95
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2}, Landroid/view/Display;->getRefreshRate()F

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    :goto_0
    const/4 v3, 0x0

    .line 104
    cmpl-float v4, v2, v3

    .line 105
    .line 106
    if-lez v4, :cond_2

    .line 107
    .line 108
    const-wide v4, 0x408f400000000000L    # 1000.0

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    float-to-double v6, v2

    .line 114
    div-double/2addr v4, v6

    .line 115
    double-to-long v4, v4

    .line 116
    goto :goto_1

    .line 117
    :cond_2
    const-wide/16 v4, 0x10

    .line 118
    .line 119
    :goto_1
    long-to-int v2, v4

    .line 120
    iget v4, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲世苏:F

    .line 121
    .line 122
    iget v5, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲苏世:F

    .line 123
    .line 124
    sub-float/2addr v4, v5

    .line 125
    const/high16 v5, 0x40000000    # 2.0f

    .line 126
    .line 127
    div-float/2addr v4, v5

    .line 128
    iput v4, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏哲兰:F

    .line 129
    .line 130
    const v4, 0x43b68000    # 365.0f

    .line 131
    .line 132
    .line 133
    invoke-static {v3, v4}, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(FF)Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    iput-object v5, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 138
    .line 139
    const-wide/16 v6, 0x3e8

    .line 140
    .line 141
    iput-wide v6, v5, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:J

    .line 142
    .line 143
    new-instance v6, Landroid/view/animation/LinearInterpolator;

    .line 144
    .line 145
    invoke-direct {v6}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 146
    .line 147
    .line 148
    iput-object v6, v5, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroid/view/animation/Interpolator;

    .line 149
    .line 150
    iget-object v5, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 151
    .line 152
    const/4 v6, -0x1

    .line 153
    iput v6, v5, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:I

    .line 154
    .line 155
    iput v2, v5, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲:I

    .line 156
    .line 157
    new-instance v7, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世兰哲;

    .line 158
    .line 159
    invoke-direct {v7, p0, v1}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世兰哲;-><init>(Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;I)V

    .line 160
    .line 161
    .line 162
    iput-object v7, v5, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世兰哲;

    .line 163
    .line 164
    invoke-static {v3, v4}, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(FF)Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iput-object v1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 169
    .line 170
    const-wide/16 v3, 0x5dc

    .line 171
    .line 172
    iput-wide v3, v1, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:J

    .line 173
    .line 174
    iput v2, v1, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲:I

    .line 175
    .line 176
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    .line 177
    .line 178
    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 179
    .line 180
    .line 181
    iput-object v2, v1, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroid/view/animation/Interpolator;

    .line 182
    .line 183
    iget-object v1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 184
    .line 185
    iput v6, v1, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:I

    .line 186
    .line 187
    new-instance v2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世兰哲;

    .line 188
    .line 189
    const/4 v3, 0x2

    .line 190
    invoke-direct {v2, p0, v3}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世兰哲;-><init>(Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;I)V

    .line 191
    .line 192
    .line 193
    iput-object v2, v1, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世兰哲;

    .line 194
    .line 195
    invoke-virtual {v1}, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 196
    .line 197
    .line 198
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 201
    .line 202
    .line 203
    :cond_3
    monitor-exit v0

    .line 204
    return-void

    .line 205
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(ILandroid/graphics/Canvas;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroid/view/animation/Interpolator;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏兰楪:Landroid/view/animation/Interpolator;

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    iput-object v2, v0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroid/view/animation/Interpolator;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰苏楪:L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰楪苏;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x3

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰楪苏;->run()V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰苏楪:L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰楪苏;

    .line 23
    .line 24
    sget-boolean v0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:Z

    .line 25
    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    if-eq p1, v2, :cond_3

    .line 29
    .line 30
    if-eq p1, v1, :cond_2

    .line 31
    .line 32
    if-eq p1, v3, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p0, v3}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 36
    .line 37
    .line 38
    new-instance v0, Landroid/os/Handler;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 45
    .line 46
    .line 47
    new-instance v4, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲世兰;

    .line 48
    .line 49
    invoke-direct {v4, p0, v2}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲世兰;-><init>(Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;I)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v5, 0x96

    .line 53
    .line 54
    invoke-virtual {v0, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    new-instance v0, Landroid/os/Handler;

    .line 59
    .line 60
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 65
    .line 66
    .line 67
    new-instance v4, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲世兰;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    invoke-direct {v4, p0, v5}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲世兰;-><init>(Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;I)V

    .line 71
    .line 72
    .line 73
    const-wide/16 v5, 0xf0

    .line 74
    .line 75
    invoke-virtual {v0, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-virtual {p0, v3}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 80
    .line 81
    .line 82
    :cond_4
    :goto_0
    const/high16 v0, 0x41200000    # 10.0f

    .line 83
    .line 84
    const/high16 v4, 0x40000000    # 2.0f

    .line 85
    .line 86
    iget-object v10, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲:Landroid/graphics/Paint;

    .line 87
    .line 88
    if-eq p1, v2, :cond_9

    .line 89
    .line 90
    if-eq p1, v1, :cond_7

    .line 91
    .line 92
    if-eq p1, v3, :cond_5

    .line 93
    .line 94
    return-void

    .line 95
    :cond_5
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰苏哲:F

    .line 96
    .line 97
    iget v1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰哲苏:F

    .line 98
    .line 99
    const/high16 v2, 0x40800000    # 4.0f

    .line 100
    .line 101
    mul-float/2addr v1, v2

    .line 102
    div-float/2addr v1, v0

    .line 103
    sub-float/2addr p1, v1

    .line 104
    float-to-int p1, p1

    .line 105
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲兰苏:F

    .line 106
    .line 107
    add-float/2addr v1, v0

    .line 108
    float-to-int v0, v1

    .line 109
    iget v1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏楪兰:F

    .line 110
    .line 111
    const/high16 v2, 0x3f000000    # 0.5f

    .line 112
    .line 113
    cmpg-float v3, v1, v2

    .line 114
    .line 115
    if-gez v3, :cond_6

    .line 116
    .line 117
    int-to-float v6, p1

    .line 118
    mul-float/2addr v1, v4

    .line 119
    sub-int/2addr v0, p1

    .line 120
    int-to-float p1, v0

    .line 121
    mul-float/2addr v1, p1

    .line 122
    add-float/2addr v1, v6

    .line 123
    float-to-int p1, v1

    .line 124
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏兰哲楪:I

    .line 125
    .line 126
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪苏兰:I

    .line 127
    .line 128
    int-to-float v8, p1

    .line 129
    move v7, v6

    .line 130
    move v9, v8

    .line 131
    move-object v5, p2

    .line 132
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_6
    move-object v5, p2

    .line 137
    int-to-float v6, p1

    .line 138
    mul-float/2addr v1, v4

    .line 139
    sub-int p1, v0, p1

    .line 140
    .line 141
    int-to-float p1, p1

    .line 142
    mul-float/2addr v1, p1

    .line 143
    add-float/2addr v1, v6

    .line 144
    float-to-int p2, v1

    .line 145
    iput p2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏兰哲楪:I

    .line 146
    .line 147
    iput p2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪苏兰:I

    .line 148
    .line 149
    int-to-float v8, v0

    .line 150
    move v7, v6

    .line 151
    move v9, v8

    .line 152
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 153
    .line 154
    .line 155
    iget p0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏楪兰:F

    .line 156
    .line 157
    sub-float/2addr p0, v2

    .line 158
    mul-float/2addr p0, v4

    .line 159
    mul-float/2addr p0, p1

    .line 160
    sub-float p1, v8, p0

    .line 161
    .line 162
    float-to-int p1, p1

    .line 163
    add-float/2addr p0, v6

    .line 164
    float-to-int p0, p0

    .line 165
    int-to-float p1, p1

    .line 166
    int-to-float v9, p0

    .line 167
    move v6, v8

    .line 168
    move v8, p1

    .line 169
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_7
    move-object v5, p2

    .line 174
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲兰苏:F

    .line 175
    .line 176
    float-to-int p1, p1

    .line 177
    iget p2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰苏哲:F

    .line 178
    .line 179
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰哲苏:F

    .line 180
    .line 181
    const/high16 v1, 0x3f800000    # 1.0f

    .line 182
    .line 183
    mul-float/2addr v1, v0

    .line 184
    div-float v3, v1, v4

    .line 185
    .line 186
    sub-float v3, p2, v3

    .line 187
    .line 188
    float-to-int v3, v3

    .line 189
    const/high16 v4, 0x41000000    # 8.0f

    .line 190
    .line 191
    div-float/2addr v1, v4

    .line 192
    add-float/2addr v1, p2

    .line 193
    float-to-int v1, v1

    .line 194
    const/high16 v4, 0x40400000    # 3.0f

    .line 195
    .line 196
    mul-float/2addr v0, v4

    .line 197
    const/high16 v4, 0x40e00000    # 7.0f

    .line 198
    .line 199
    div-float/2addr v0, v4

    .line 200
    add-float/2addr v0, p2

    .line 201
    float-to-int p2, v0

    .line 202
    iget p0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏楪兰:F

    .line 203
    .line 204
    const v0, 0x3f666666    # 0.9f

    .line 205
    .line 206
    .line 207
    cmpg-float v0, p0, v0

    .line 208
    .line 209
    if-gez v0, :cond_8

    .line 210
    .line 211
    int-to-float v6, p1

    .line 212
    int-to-float v7, v3

    .line 213
    sub-int/2addr v1, v3

    .line 214
    int-to-float p1, v1

    .line 215
    mul-float/2addr p1, p0

    .line 216
    add-float v9, p1, v7

    .line 217
    .line 218
    move v8, v6

    .line 219
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_8
    int-to-float v6, p1

    .line 224
    int-to-float v7, v3

    .line 225
    int-to-float v9, v1

    .line 226
    move v8, v6

    .line 227
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 228
    .line 229
    .line 230
    int-to-float v7, p2

    .line 231
    add-int/2addr p2, v2

    .line 232
    int-to-float v9, p2

    .line 233
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :cond_9
    move-object v5, p2

    .line 238
    iget p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰哲苏:F

    .line 239
    .line 240
    const/high16 p2, 0x41a00000    # 20.0f

    .line 241
    .line 242
    div-float p2, p1, p2

    .line 243
    .line 244
    float-to-int p2, p2

    .line 245
    iget v1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲兰苏:F

    .line 246
    .line 247
    div-float v0, p1, v0

    .line 248
    .line 249
    sub-float v0, v1, v0

    .line 250
    .line 251
    int-to-float p2, p2

    .line 252
    sub-float/2addr v0, p2

    .line 253
    float-to-int v0, v0

    .line 254
    div-float/2addr p1, v4

    .line 255
    sub-float v2, v1, p1

    .line 256
    .line 257
    float-to-int v2, v2

    .line 258
    iget v3, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰苏哲:F

    .line 259
    .line 260
    add-float/2addr v3, p2

    .line 261
    float-to-int p2, v3

    .line 262
    add-float/2addr p1, v1

    .line 263
    float-to-int p1, p1

    .line 264
    int-to-float v1, v2

    .line 265
    sub-int/2addr p1, v2

    .line 266
    int-to-float p1, p1

    .line 267
    iget v3, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏楪兰:F

    .line 268
    .line 269
    mul-float/2addr p1, v3

    .line 270
    add-float/2addr p1, v1

    .line 271
    float-to-int p1, p1

    .line 272
    new-instance v3, Landroid/graphics/Path;

    .line 273
    .line 274
    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    .line 275
    .line 276
    .line 277
    int-to-float v4, p2

    .line 278
    invoke-virtual {v3, v1, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 279
    .line 280
    .line 281
    if-ge p1, v0, :cond_a

    .line 282
    .line 283
    iput p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏兰哲楪:I

    .line 284
    .line 285
    sub-int v0, p1, v2

    .line 286
    .line 287
    add-int/2addr v0, p2

    .line 288
    iput v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪苏兰:I

    .line 289
    .line 290
    int-to-float p0, p1

    .line 291
    int-to-float p1, v0

    .line 292
    invoke-virtual {v3, p0, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 293
    .line 294
    .line 295
    goto :goto_1

    .line 296
    :cond_a
    iput v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏兰哲楪:I

    .line 297
    .line 298
    sub-int v1, v0, v2

    .line 299
    .line 300
    add-int/2addr v1, p2

    .line 301
    iput v1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪苏兰:I

    .line 302
    .line 303
    int-to-float p2, v0

    .line 304
    int-to-float v0, v1

    .line 305
    invoke-virtual {v3, p2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 306
    .line 307
    .line 308
    iget p2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪苏兰:I

    .line 309
    .line 310
    iget p0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏兰哲楪:I

    .line 311
    .line 312
    sub-int p0, p1, p0

    .line 313
    .line 314
    sub-int/2addr p2, p0

    .line 315
    int-to-float p0, p1

    .line 316
    int-to-float p1, p2

    .line 317
    invoke-virtual {v3, p0, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 318
    .line 319
    .line 320
    :goto_1
    invoke-virtual {v5, v3, v10}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 321
    .line 322
    .line 323
    return-void
.end method
