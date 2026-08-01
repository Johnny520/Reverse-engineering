.class final Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ε:I

.field public ζ:I

.field public η:Lf52;

.field public final θ:Landroid/graphics/Paint;


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
    iput p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;->ε:I

    .line 9
    .line 10
    const p1, -0xe67606

    .line 11
    .line 12
    .line 13
    iput p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;->ζ:I

    .line 14
    .line 15
    sget-object p1, Lf52;->ε:Lf52;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;->η:Lf52;

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
    iput-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;->θ:Landroid/graphics/Paint;

    .line 26
    .line 27
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
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    int-to-float v5, v0

    .line 9
    const/high16 v0, 0x40000000    # 2.0f

    .line 10
    .line 11
    div-float v6, v5, v0

    .line 12
    .line 13
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 14
    .line 15
    iget-object v8, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;->θ:Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    .line 19
    .line 20
    const v0, -0x191714

    .line 21
    .line 22
    .line 23
    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-float v4, v0

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    move v7, v6

    .line 34
    move-object v1, p1

    .line 35
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;->η:Lf52;

    .line 39
    .line 40
    sget-object v0, Lf52;->η:Lf52;

    .line 41
    .line 42
    if-ne p1, v0, :cond_0

    .line 43
    .line 44
    const p1, -0x1ab7b3

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;->ζ:I

    .line 49
    .line 50
    :goto_0
    invoke-virtual {v8, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;->η:Lf52;

    .line 54
    .line 55
    sget-object v0, Lf52;->ζ:Lf52;

    .line 56
    .line 57
    if-ne p1, v0, :cond_1

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    int-to-float p0, p0

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    iget p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;->ε:I

    .line 66
    .line 67
    if-ltz p1, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    iget p0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$ProgressLineView;->ε:I

    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    const/16 v2, 0x64

    .line 77
    .line 78
    invoke-static {p0, v0, v2}, Lj81;->μ(III)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    mul-int/2addr p0, p1

    .line 83
    int-to-float p0, p0

    .line 84
    const/high16 p1, 0x42c80000    # 100.0f

    .line 85
    .line 86
    div-float/2addr p0, p1

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    int-to-float p0, p0

    .line 93
    const p1, 0x3eb851ec    # 0.36f

    .line 94
    .line 95
    .line 96
    mul-float/2addr p0, p1

    .line 97
    :goto_1
    const/4 v3, 0x0

    .line 98
    invoke-static {v6, p0}, Ljava/lang/Math;->max(FF)F

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    const/4 v2, 0x0

    .line 103
    move v7, v6

    .line 104
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method
