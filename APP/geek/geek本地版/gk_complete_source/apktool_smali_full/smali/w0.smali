.class public final Lw0;
.super Landroid/graphics/drawable/Drawable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lw0;->a:I

    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 4
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    iput-object v0, p0, Lw0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/widget/ActionBarContainer;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lw0;->a:I

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    iput-object p1, p0, Lw0;->b:Ljava/lang/Object;

    return-void
.end method

.method private final a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(I)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    iget v0, p0, Lw0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "ZGKg9PPy\n"

    .line 7
    .line 8
    const-string v1, "BwPOgpKB8oI=\n"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    int-to-float v0, v0

    .line 26
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    int-to-float v1, v1

    .line 35
    const v2, 0x3e8f5c29    # 0.28f

    .line 36
    .line 37
    .line 38
    mul-float v4, v0, v2

    .line 39
    .line 40
    const v2, 0x3f051eb8    # 0.52f

    .line 41
    .line 42
    .line 43
    mul-float v5, v1, v2

    .line 44
    .line 45
    const v2, 0x3ee147ae    # 0.44f

    .line 46
    .line 47
    .line 48
    mul-float v6, v0, v2

    .line 49
    .line 50
    const v2, 0x3f2e147b    # 0.68f

    .line 51
    .line 52
    .line 53
    mul-float v7, v1, v2

    .line 54
    .line 55
    iget-object v2, p0, Lw0;->b:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v8, v2

    .line 58
    check-cast v8, Landroid/graphics/Paint;

    .line 59
    .line 60
    move-object v3, p1

    .line 61
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 62
    .line 63
    .line 64
    const/high16 p1, 0x3f400000    # 0.75f

    .line 65
    .line 66
    mul-float v9, v0, p1

    .line 67
    .line 68
    const p1, 0x3eb33333    # 0.35f

    .line 69
    .line 70
    .line 71
    mul-float v10, v1, p1

    .line 72
    .line 73
    move-object v11, v8

    .line 74
    move v8, v7

    .line 75
    move v7, v6

    .line 76
    move-object v6, v3

    .line 77
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_0
    move-object v3, p1

    .line 82
    iget-object p1, p0, Lw0;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, Landroidx/appcompat/widget/ActionBarContainer;

    .line 85
    .line 86
    iget-boolean v0, p1, Landroidx/appcompat/widget/ActionBarContainer;->g:Z

    .line 87
    .line 88
    if-eqz v0, :cond_0

    .line 89
    .line 90
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarContainer;->f:Landroid/graphics/drawable/Drawable;

    .line 91
    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    invoke-virtual {p1, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    iget-object v0, p1, Landroidx/appcompat/widget/ActionBarContainer;->d:Landroid/graphics/drawable/Drawable;

    .line 99
    .line 100
    if-eqz v0, :cond_1

    .line 101
    .line 102
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 103
    .line 104
    .line 105
    :cond_1
    iget-object v0, p1, Landroidx/appcompat/widget/ActionBarContainer;->e:Landroid/graphics/drawable/Drawable;

    .line 106
    .line 107
    if-eqz v0, :cond_2

    .line 108
    .line 109
    iget-boolean p1, p1, Landroidx/appcompat/widget/ActionBarContainer;->h:Z

    .line 110
    .line 111
    if-eqz p1, :cond_2

    .line 112
    .line 113
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 114
    .line 115
    .line 116
    :cond_2
    :goto_0
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getOpacity()I
    .locals 1

    .line 1
    iget v0, p0, Lw0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x3

    .line 7
    return v0

    .line 8
    :pswitch_0
    const/4 v0, 0x0

    .line 9
    return v0

    .line 10
    nop

    .line 11
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 2

    .line 1
    iget v0, p0, Lw0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, Lw0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroidx/appcompat/widget/ActionBarContainer;

    .line 13
    .line 14
    iget-boolean v1, v0, Landroidx/appcompat/widget/ActionBarContainer;->g:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v0, Landroidx/appcompat/widget/ActionBarContainer;->f:Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarContainer;->d:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarContainer;->d:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final setAlpha(I)V
    .locals 0

    .line 1
    iget p1, p0, Lw0;->a:I

    .line 2
    .line 3
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    iget p1, p0, Lw0;->a:I

    .line 2
    .line 3
    return-void
.end method
