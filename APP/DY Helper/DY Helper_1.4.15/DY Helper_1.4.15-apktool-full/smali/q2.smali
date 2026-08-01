.class public final Lq2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:I

.field public β:Ljava/lang/Object;

.field public γ:Ljava/lang/Object;

.field public δ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/graphics/Paint;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2;->β:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 18
    iput p1, p0, Lq2;->α:I

    return-void
.end method

.method public constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq2;->δ:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance p1, Ld1;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    invoke-direct {p1, v0, p0}, Ld1;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lq2;->γ:Ljava/lang/Object;

    .line 13
    .line 14
    iput p2, p0, Lq2;->α:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public α(Landroid/view/View;I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lq2;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    invoke-virtual {p0, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->α(Landroid/view/View;I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    neg-int p0, p0

    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    sub-int p1, p0, p1

    .line 36
    .line 37
    invoke-static {p2, p0}, Ljava/lang/Math;->min(II)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0
.end method

.method public β(Landroid/view/View;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Lq2;->δ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-virtual {p0, p1, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->α(Landroid/view/View;I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    add-int/2addr p2, v0

    .line 17
    int-to-float p2, p2

    .line 18
    :goto_0
    int-to-float v0, v0

    .line 19
    div-float/2addr p2, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sub-int/2addr v1, p2

    .line 26
    int-to-float p2, v1

    .line 27
    goto :goto_0

    .line 28
    :goto_1
    invoke-virtual {p0, p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->μ(Landroid/view/View;F)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    cmpl-float p2, p2, v0

    .line 33
    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    const/4 p2, 0x4

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    const/4 p2, 0x0

    .line 39
    :goto_2
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public γ(F)V
    .locals 2

    .line 1
    iget-object p0, p0, Lq2;->β:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/high16 v0, 0x437f0000    # 255.0f

    .line 6
    .line 7
    mul-float/2addr p1, v0

    .line 8
    float-to-double v0, p1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->rint(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    double-to-float p1, v0

    .line 14
    float-to-int p1, p1

    .line 15
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public δ(I)V
    .locals 1

    .line 1
    iget v0, p0, Lq2;->α:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Lq2;->α:I

    .line 7
    .line 8
    iget-object p0, p0, Lq2;->β:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Landroid/graphics/Paint;

    .line 11
    .line 12
    invoke-static {p1}, Lxb;->в(I)Landroid/graphics/BlendMode;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setBlendMode(Landroid/graphics/BlendMode;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public ε(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lq2;->β:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lkn0;->Τ(J)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public ζ(Landroid/graphics/Shader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq2;->γ:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, Lq2;->β:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public η(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lq2;->β:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
