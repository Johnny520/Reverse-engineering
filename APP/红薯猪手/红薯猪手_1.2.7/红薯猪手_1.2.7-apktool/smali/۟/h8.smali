.class public final L۟/h8;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/h8$b;,
        L۟/h8$a;,
        L۟/h8$c;,
        L۟/h8$e;,
        L۟/h8$d;
    }
.end annotation


# instance fields
.field public ۥ:Z

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۠:F

.field public ۥ۟ۡ:Landroid/graphics/Paint;

.field public ۥ۟ۢ:F

.field public ۥۣ۟:Z

.field public ۥ۟ۤ:I

.field public ۥ۟ۥ:I

.field public ۥ۟ۦ:I

.field public ۥ۟ۧ:I

.field public ۥ۟ۨ:Landroid/graphics/PorterDuffXfermode;

.field public ۥ۠:F

.field public ۥ۠۟:L۟/h8$a;

.field public ۥ۠۠:L۟/h8$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    sget v2, L۟/ya;->ۥ۠۟:I

    .line 7
    .line 8
    const/16 v3, 0xff

    .line 9
    .line 10
    const/16 v4, 0xea

    .line 11
    .line 12
    invoke-static {v3, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/16 v5, 0x35

    .line 17
    .line 18
    const/16 v6, 0x28

    .line 19
    .line 20
    const/16 v7, 0x21

    .line 21
    .line 22
    invoke-static {v3, v5, v6, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    invoke-static {v3, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 39
    .line 40
    const/high16 v6, 0x40000000    # 2.0f

    .line 41
    .line 42
    mul-float/2addr p1, v6

    .line 43
    const/high16 v6, 0x3f000000    # 0.5f

    .line 44
    .line 45
    add-float/2addr p1, v6

    .line 46
    float-to-int p1, p1

    .line 47
    int-to-float p1, p1

    .line 48
    iput v2, p0, L۟/h8;->ۥ۟ۤ:I

    .line 49
    .line 50
    iput v4, p0, L۟/h8;->ۥ۟ۥ:I

    .line 51
    .line 52
    iput v5, p0, L۟/h8;->ۥ۟ۦ:I

    .line 53
    .line 54
    iput v3, p0, L۟/h8;->ۥ۟ۧ:I

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    iput-boolean v2, p0, L۟/h8;->ۥ:Z

    .line 58
    .line 59
    iput p1, p0, L۟/h8;->ۥ۠:F

    .line 60
    .line 61
    iput-boolean v1, p0, L۟/h8;->ۥۣ۟:Z

    .line 62
    .line 63
    new-instance p1, L۟/h8$b;

    .line 64
    .line 65
    invoke-direct {p1, p0}, L۟/h8$b;-><init>(L۟/h8;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, L۟/h8;->ۥ۠۟:L۟/h8$a;

    .line 69
    .line 70
    new-instance p1, Landroid/graphics/Paint;

    .line 71
    .line 72
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    .line 81
    .line 82
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 83
    .line 84
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    .line 88
    .line 89
    iget v1, p0, L۟/h8;->ۥ۟ۥ:I

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    .line 95
    .line 96
    iget v1, p0, L۟/h8;->ۥ۠:F

    .line 97
    .line 98
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    .line 102
    .line 103
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 104
    .line 105
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, L۟/h8;->ۥ۟ۡ:Landroid/graphics/Paint;

    .line 109
    .line 110
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 111
    .line 112
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v2, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 116
    .line 117
    .line 118
    new-instance p1, Landroid/graphics/PorterDuffXfermode;

    .line 119
    .line 120
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->XOR:Landroid/graphics/PorterDuff$Mode;

    .line 121
    .line 122
    invoke-direct {p1, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 123
    .line 124
    .line 125
    iput-object p1, p0, L۟/h8;->ۥ۟ۨ:Landroid/graphics/PorterDuffXfermode;

    .line 126
    .line 127
    new-instance p1, L۟/g8;

    .line 128
    .line 129
    invoke-direct {p1}, L۟/g8;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, p1}, L۟/h8;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget v0, p0, L۟/h8;->ۥ۟:I

    neg-int v0, v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    iget v0, p0, L۟/h8;->ۥ۟۟:I

    neg-int v0, v0

    int-to-float v0, v0

    div-float v4, v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v5, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v6, v0

    const/4 v7, 0x0

    const/16 v8, 0x1f

    move-object v2, p1

    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    move-result v0

    iget v2, p0, L۟/h8;->ۥ۟:I

    int-to-float v2, v2

    div-float/2addr v2, v1

    iget v3, p0, L۟/h8;->ۥ۟۟:I

    int-to-float v3, v3

    div-float/2addr v3, v1

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    iget-boolean v1, p0, L۟/h8;->ۥ:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, L۟/h8;->ۥ۠۟:L۟/h8$a;

    invoke-virtual {v1, p1}, L۟/h8$a;->ۥ(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, L۟/h8;->ۥ۠۟:L۟/h8$a;

    invoke-virtual {v1, p1}, L۟/h8$a;->ۥ۟۟(Landroid/graphics/Canvas;)V

    :goto_0
    iget-object v1, p0, L۟/h8;->ۥ۠۟:L۟/h8$a;

    invoke-virtual {v1, p1}, L۟/h8$a;->ۥ۟(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/high16 v1, -0x80000000

    .line 13
    .line 14
    const/high16 v2, 0x40000000    # 2.0f

    .line 15
    .line 16
    const/16 v3, 0x50

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move p1, v3

    .line 29
    :goto_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-ne v0, v2, :cond_2

    .line 38
    .line 39
    move v3, p2

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    if-ne v0, v1, :cond_3

    .line 42
    .line 43
    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    :cond_3
    :goto_1
    invoke-virtual {p0, p1, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, L۟/h8;->ۥ۟:I

    iput p2, p0, L۟/h8;->ۥ۟۟:I

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    const p3, 0x3f666666    # 0.9f

    mul-float/2addr p1, p3

    iput p1, p0, L۟/h8;->ۥ۟۠:F

    iget p1, p0, L۟/h8;->ۥ۟:I

    iget p3, p0, L۟/h8;->ۥ۟۟:I

    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, p2

    const p2, 0x3f4ccccd    # 0.8f

    mul-float/2addr p1, p2

    iput p1, p0, L۟/h8;->ۥ۟ۢ:F

    return-void
.end method

.method public setCircle(Z)V
    .locals 0

    iput-boolean p1, p0, L۟/h8;->ۥ:Z

    return-void
.end method

.method public setOnCheckedChangeListener(L۟/h8$d;)V
    .locals 0

    iput-object p1, p0, L۟/h8;->ۥ۠۠:L۟/h8$d;

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    new-instance v0, L۟/h8$e;

    invoke-direct {v0, p0, p1}, L۟/h8$e;-><init>(L۟/h8;Landroid/view/View$OnClickListener;)V

    invoke-super {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setStyle(I)V
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    new-instance p1, L۟/h8$b;

    invoke-direct {p1, p0}, L۟/h8$b;-><init>(L۟/h8;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    new-instance p1, L۟/h8$c;

    invoke-direct {p1, p0}, L۟/h8$c;-><init>(L۟/h8;)V

    :goto_0
    iput-object p1, p0, L۟/h8;->ۥ۠۟:L۟/h8$a;

    :cond_1
    return-void
.end method

.method public final ۥ(Z)V
    .locals 1

    iput-boolean p1, p0, L۟/h8;->ۥۣ۟:Z

    iget-object v0, p0, L۟/h8;->ۥ۠۠:L۟/h8$d;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, L۟/h8$d;->ۥ(Z)V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-void
.end method
