.class final Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ε:Landroid/graphics/Paint;

.field public final ζ:Landroid/graphics/RectF;

.field public η:I

.field public θ:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg52;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    const/4 p2, 0x1

    .line 10
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;->ε:Landroid/graphics/Paint;

    .line 14
    .line 15
    new-instance p1, Landroid/graphics/RectF;

    .line 16
    .line 17
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;->ζ:Landroid/graphics/RectF;

    .line 21
    .line 22
    const/16 p1, 0xe1

    .line 23
    .line 24
    const/16 p2, 0xff

    .line 25
    .line 26
    invoke-static {p1, p2, p2, p2}, Landroid/graphics/Color;->argb(IIII)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iput p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;->η:I

    .line 31
    .line 32
    sget-object p1, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/high16 p2, 0x41c00000    # 24.0f

    .line 42
    .line 43
    invoke-static {p1, p2}, Lcom/example/dyhelper/ui/а;->β(Landroid/content/Context;F)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    int-to-float p1, p1

    .line 48
    iput p1, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;->θ:F

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    int-to-float v0, v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-float v1, v1

    .line 14
    iget-object v2, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;->ζ:Landroid/graphics/RectF;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v2, v3, v3, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;->ε:Landroid/graphics/Paint;

    .line 21
    .line 22
    const/16 v1, 0xff

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 25
    .line 26
    .line 27
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 30
    .line 31
    .line 32
    iget v3, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;->η:I

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    .line 36
    .line 37
    iget v3, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;->θ:F

    .line 38
    .line 39
    invoke-virtual {p1, v2, v3, v3, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 40
    .line 41
    .line 42
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 45
    .line 46
    .line 47
    sget-object v3, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const v4, 0x3f4ccccd    # 0.8f

    .line 57
    .line 58
    .line 59
    invoke-static {v3, v4}, Lcom/example/dyhelper/ui/а;->β(Landroid/content/Context;F)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    int-to-float v3, v3

    .line 64
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 65
    .line 66
    .line 67
    const/16 v3, 0x22

    .line 68
    .line 69
    invoke-static {v3, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/high16 v3, 0x40000000    # 2.0f

    .line 81
    .line 82
    div-float/2addr v1, v3

    .line 83
    invoke-virtual {v2, v1, v1}, Landroid/graphics/RectF;->inset(FF)V

    .line 84
    .line 85
    .line 86
    iget p0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$BackgroundLayerView;->θ:F

    .line 87
    .line 88
    invoke-virtual {p1, v2, p0, p0, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method
