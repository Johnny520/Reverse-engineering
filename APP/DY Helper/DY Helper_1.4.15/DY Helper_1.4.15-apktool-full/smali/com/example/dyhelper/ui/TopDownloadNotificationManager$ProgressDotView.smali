.class final Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ε:Z

.field public ζ:I

.field public η:I

.field public θ:Lf52;

.field public final ι:Landroid/graphics/Paint;

.field public final κ:Landroid/graphics/RectF;


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
    const/4 p1, -0x1

    .line 8
    iput p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->ζ:I

    .line 9
    .line 10
    const p1, -0xe67606

    .line 11
    .line 12
    .line 13
    iput p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->η:I

    .line 14
    .line 15
    sget-object p1, Lf52;->ε:Lf52;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->θ:Lf52;

    .line 18
    .line 19
    new-instance p1, Landroid/graphics/Paint;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->ι:Landroid/graphics/Paint;

    .line 26
    .line 27
    new-instance p1, Landroid/graphics/RectF;

    .line 28
    .line 29
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->κ:Landroid/graphics/RectF;

    .line 33
    .line 34
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
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    int-to-float v0, v0

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    int-to-float v1, v1

    .line 25
    const/high16 v2, 0x40000000    # 2.0f

    .line 26
    .line 27
    div-float/2addr v1, v2

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    int-to-float v3, v3

    .line 33
    div-float/2addr v3, v2

    .line 34
    iget-boolean v4, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->ε:Z

    .line 35
    .line 36
    const v5, 0x404ccccd    # 3.2f

    .line 37
    .line 38
    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    move v4, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const v4, 0x40333333    # 2.8f

    .line 44
    .line 45
    .line 46
    :goto_0
    sget-object v6, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v6, v4}, Lcom/example/dyhelper/ui/а;->β(Landroid/content/Context;F)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    int-to-float v4, v4

    .line 60
    div-float/2addr v0, v2

    .line 61
    sub-float/2addr v0, v4

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 70
    .line 71
    invoke-static {v2, v6}, Lcom/example/dyhelper/ui/а;->β(Landroid/content/Context;F)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    int-to-float v2, v2

    .line 76
    sub-float/2addr v0, v2

    .line 77
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 78
    .line 79
    iget-object v11, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->ι:Landroid/graphics/Paint;

    .line 80
    .line 81
    invoke-virtual {v11, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 82
    .line 83
    .line 84
    const/4 v6, -0x1

    .line 85
    invoke-virtual {v11, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v1, v3, v0, v11}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 89
    .line 90
    .line 91
    sget-object v6, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 92
    .line 93
    invoke-virtual {v11, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 94
    .line 95
    .line 96
    sget-object v6, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 97
    .line 98
    invoke-virtual {v11, v6}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 102
    .line 103
    .line 104
    const v4, -0x191714

    .line 105
    .line 106
    .line 107
    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 108
    .line 109
    .line 110
    sub-float v4, v1, v0

    .line 111
    .line 112
    sub-float v6, v3, v0

    .line 113
    .line 114
    add-float v7, v1, v0

    .line 115
    .line 116
    add-float/2addr v0, v3

    .line 117
    move v8, v7

    .line 118
    iget-object v7, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->κ:Landroid/graphics/RectF;

    .line 119
    .line 120
    invoke-virtual {v7, v4, v6, v8, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 121
    .line 122
    .line 123
    const/high16 v9, 0x43b40000    # 360.0f

    .line 124
    .line 125
    const/4 v10, 0x0

    .line 126
    const/4 v8, 0x0

    .line 127
    move-object v6, p1

    .line 128
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    iget-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->θ:Lf52;

    .line 132
    .line 133
    const v0, -0x1ab7b3

    .line 134
    .line 135
    .line 136
    sget-object v4, Lf52;->η:Lf52;

    .line 137
    .line 138
    if-ne p1, v4, :cond_1

    .line 139
    .line 140
    move p1, v0

    .line 141
    goto :goto_1

    .line 142
    :cond_1
    iget p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->η:I

    .line 143
    .line 144
    :goto_1
    invoke-virtual {v11, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 145
    .line 146
    .line 147
    iget-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->θ:Lf52;

    .line 148
    .line 149
    sget-object v8, Lf52;->ζ:Lf52;

    .line 150
    .line 151
    if-ne p1, v8, :cond_2

    .line 152
    .line 153
    const/high16 p1, 0x43b40000    # 360.0f

    .line 154
    .line 155
    :goto_2
    move v9, p1

    .line 156
    goto :goto_3

    .line 157
    :cond_2
    iget p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->ζ:I

    .line 158
    .line 159
    if-ltz p1, :cond_3

    .line 160
    .line 161
    const/4 v8, 0x0

    .line 162
    const/16 v9, 0x64

    .line 163
    .line 164
    invoke-static {p1, v8, v9}, Lj81;->μ(III)I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    int-to-float p1, p1

    .line 169
    const v8, 0x40666666    # 3.6f

    .line 170
    .line 171
    .line 172
    mul-float/2addr p1, v8

    .line 173
    goto :goto_2

    .line 174
    :cond_3
    const/high16 p1, 0x42b80000    # 92.0f

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :goto_3
    const/4 v8, 0x0

    .line 178
    const/4 v10, 0x0

    .line 179
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v11, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 183
    .line 184
    .line 185
    iget-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->θ:Lf52;

    .line 186
    .line 187
    if-ne p1, v4, :cond_4

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_4
    iget v0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->η:I

    .line 191
    .line 192
    :goto_4
    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 193
    .line 194
    .line 195
    iget-boolean p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressDotView;->ε:Z

    .line 196
    .line 197
    if-eqz p1, :cond_5

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_5
    const v5, 0x40266666    # 2.6f

    .line 201
    .line 202
    .line 203
    :goto_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {p0, v5}, Lcom/example/dyhelper/ui/а;->β(Landroid/content/Context;F)I

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    int-to-float p0, p0

    .line 215
    invoke-virtual {v6, v1, v3, p0, v11}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 216
    .line 217
    .line 218
    return-void
.end method
