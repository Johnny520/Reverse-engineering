.class final Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ε:I

.field public final ζ:Landroid/graphics/Paint;

.field public final η:Landroid/graphics/Paint;

.field public final θ:Landroid/graphics/Path;

.field public final ι:Landroid/graphics/RectF;

.field public final κ:F

.field public final λ:I

.field public final μ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;ILxx;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    iput p2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->ε:I

    .line 8
    .line 9
    new-instance p2, Landroid/graphics/Paint;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->ζ:Landroid/graphics/Paint;

    .line 16
    .line 17
    new-instance p2, Landroid/graphics/Paint;

    .line 18
    .line 19
    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 23
    .line 24
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-float v0, v0

    .line 32
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p3, Lxx;->δ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->η:Landroid/graphics/Paint;

    .line 45
    .line 46
    new-instance p2, Landroid/graphics/Path;

    .line 47
    .line 48
    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->θ:Landroid/graphics/Path;

    .line 52
    .line 53
    new-instance p2, Landroid/graphics/RectF;

    .line 54
    .line 55
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->ι:Landroid/graphics/RectF;

    .line 59
    .line 60
    const/16 p2, 0xa

    .line 61
    .line 62
    invoke-static {p1, p2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    int-to-float p1, p1

    .line 67
    iput p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->κ:F

    .line 68
    .line 69
    iget-object p1, p3, Lxx;->γ:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iput p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->λ:I

    .line 76
    .line 77
    iget-object p1, p3, Lxx;->ε:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    iput p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->μ:I

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 7

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
    int-to-float v2, v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-float v3, v0

    .line 17
    const/4 v0, 0x0

    .line 18
    cmpg-float v1, v2, v0

    .line 19
    .line 20
    if-lez v1, :cond_1

    .line 21
    .line 22
    cmpg-float v0, v3, v0

    .line 23
    .line 24
    if-gtz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->θ:Landroid/graphics/Path;

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 34
    .line 35
    .line 36
    iget v5, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->λ:I

    .line 37
    .line 38
    iget v6, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->μ:I

    .line 39
    .line 40
    iget-object v4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->ζ:Landroid/graphics/Paint;

    .line 41
    .line 42
    move-object v1, p1

    .line 43
    invoke-static/range {v1 .. v6}, Lcom/example/dyhelper/ui/μ;->α(Landroid/graphics/Canvas;FFLandroid/graphics/Paint;II)V

    .line 44
    .line 45
    .line 46
    iget p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->ε:I

    .line 47
    .line 48
    invoke-virtual {v4, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 49
    .line 50
    .line 51
    move-object v6, v4

    .line 52
    move v4, v2

    .line 53
    const/4 v2, 0x0

    .line 54
    move v5, v3

    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 57
    .line 58
    .line 59
    move v2, v4

    .line 60
    move v3, v5

    .line 61
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->η:Landroid/graphics/Paint;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/high16 v4, 0x40000000    # 2.0f

    .line 71
    .line 72
    div-float/2addr v0, v4

    .line 73
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    div-float/2addr v5, v4

    .line 78
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    div-float/2addr v6, v4

    .line 83
    sub-float/2addr v2, v6

    .line 84
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    div-float/2addr v6, v4

    .line 89
    sub-float/2addr v3, v6

    .line 90
    iget-object v4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->ι:Landroid/graphics/RectF;

    .line 91
    .line 92
    invoke-virtual {v4, v0, v5, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 93
    .line 94
    .line 95
    iget p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->κ:F

    .line 96
    .line 97
    invoke-virtual {v1, v4, p0, p0, p1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    :goto_0
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->θ:Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    .line 7
    .line 8
    .line 9
    int-to-float p1, p1

    .line 10
    int-to-float p2, p2

    .line 11
    iget-object p4, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->ι:Landroid/graphics/RectF;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p4, v0, v0, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 15
    .line 16
    .line 17
    iget p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPreviewView;->κ:F

    .line 18
    .line 19
    sget-object p1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 20
    .line 21
    invoke-virtual {p3, p4, p0, p0, p1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
