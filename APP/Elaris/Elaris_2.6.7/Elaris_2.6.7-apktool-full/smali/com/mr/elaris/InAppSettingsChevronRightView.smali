.class final Lcom/mr/elaris/InAppSettingsChevronRightView;
.super Landroid/view/View;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field private final paint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Paint;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/mr/elaris/InAppSettingsChevronRightView;->paint:Landroid/graphics/Paint;

    .line 13
    .line 14
    sget v1, Lcom/mr/elaris/InAppSettings;->SUB:I

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    .line 18
    .line 19
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 22
    .line 23
    .line 24
    const v1, 0x3fd33333    # 1.65f

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    int-to-float p1, p1

    .line 32
    const/high16 v1, 0x3f800000    # 1.0f

    .line 33
    .line 34
    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 39
    .line 40
    .line 41
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 49
    .line 50
    .line 51
    const-string p1, "ELARIS_SETTINGS_VIEW"

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 61
    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

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
    const v2, 0x3ec28f5c    # 0.38f

    .line 15
    .line 16
    .line 17
    mul-float v4, v0, v2

    .line 18
    .line 19
    const v2, 0x3f1eb852    # 0.62f

    .line 20
    .line 21
    .line 22
    mul-float v6, v0, v2

    .line 23
    .line 24
    const v0, 0x3e8f5c29    # 0.28f

    .line 25
    .line 26
    .line 27
    mul-float v5, v1, v0

    .line 28
    .line 29
    const/high16 v0, 0x3f000000    # 0.5f

    .line 30
    .line 31
    mul-float v7, v1, v0

    .line 32
    .line 33
    const v0, 0x3f3851ec    # 0.72f

    .line 34
    .line 35
    .line 36
    mul-float/2addr v1, v0

    .line 37
    iget-object v8, p0, Lcom/mr/elaris/InAppSettingsChevronRightView;->paint:Landroid/graphics/Paint;

    .line 38
    .line 39
    move-object v3, p1

    .line 40
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 41
    .line 42
    .line 43
    move v5, v7

    .line 44
    iget-object v8, p0, Lcom/mr/elaris/InAppSettingsChevronRightView;->paint:Landroid/graphics/Paint;

    .line 45
    .line 46
    move v7, v6

    .line 47
    move v6, v4

    .line 48
    move v4, v7

    .line 49
    move v7, v1

    .line 50
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
