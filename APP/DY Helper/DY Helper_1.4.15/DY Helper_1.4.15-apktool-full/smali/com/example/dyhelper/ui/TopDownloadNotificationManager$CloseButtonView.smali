.class final Lcom/example/dyhelper/ui/TopDownloadNotificationManager$CloseButtonView;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ε:Landroid/graphics/Paint;


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
    const/4 v0, 0x1

    .line 10
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$CloseButtonView;->ε:Landroid/graphics/Paint;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 11

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
    div-float/2addr v0, v2

    .line 35
    sget-object v4, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {v4, v2}, Lcom/example/dyhelper/ui/а;->β(Landroid/content/Context;F)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    int-to-float v2, v2

    .line 49
    sub-float/2addr v0, v2

    .line 50
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 51
    .line 52
    iget-object v9, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$CloseButtonView;->ε:Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-virtual {v9, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    const/16 v4, 0x73

    .line 62
    .line 63
    const/16 v5, 0x66

    .line 64
    .line 65
    const/16 v6, 0x5f

    .line 66
    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    const/16 v2, 0x36

    .line 70
    .line 71
    invoke-static {v2, v6, v5, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/16 v2, 0x1e

    .line 77
    .line 78
    invoke-static {v2, v6, v5, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    :goto_0
    invoke-virtual {v9, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v1, v3, v0, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 86
    .line 87
    .line 88
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 89
    .line 90
    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const v2, 0x3fd9999a    # 1.7f

    .line 101
    .line 102
    .line 103
    invoke-static {v0, v2}, Lcom/example/dyhelper/ui/а;->β(Landroid/content/Context;F)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    int-to-float v0, v0

    .line 108
    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_1

    .line 116
    .line 117
    const/16 v0, 0xd2

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    const/16 v0, 0xa8

    .line 121
    .line 122
    :goto_1
    invoke-static {v0, v6, v5, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    const v0, 0x40933333    # 4.6f

    .line 137
    .line 138
    .line 139
    invoke-static {p0, v0}, Lcom/example/dyhelper/ui/а;->β(Landroid/content/Context;F)I

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    int-to-float p0, p0

    .line 144
    sub-float v5, v1, p0

    .line 145
    .line 146
    sub-float v6, v3, p0

    .line 147
    .line 148
    add-float v7, v1, p0

    .line 149
    .line 150
    add-float v8, v3, p0

    .line 151
    .line 152
    move-object v4, p1

    .line 153
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 154
    .line 155
    .line 156
    move v10, v7

    .line 157
    move v7, v5

    .line 158
    move v5, v10

    .line 159
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 160
    .line 161
    .line 162
    return-void
.end method
