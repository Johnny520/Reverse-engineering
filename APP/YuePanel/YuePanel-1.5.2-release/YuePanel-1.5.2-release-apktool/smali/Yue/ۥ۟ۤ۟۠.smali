.class public LYue/ۥ۟ۤ۟۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۟ۤ۟;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x15
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥ۟ۤ۟ۢ;F)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟۠;->ۥ۟۟۠۟(LYue/ۥ۟ۤ۟ۢ;)LYue/ۥۡۧ۠;

    move-result-object p1

    invoke-virtual {p1, p2}, LYue/ۥۡۧ۠;->ۥ۟۟۟ۢ(F)V

    return-void
.end method

.method public ۥ۟(LYue/ۥ۟ۤ۟ۢ;)F
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟۠;->ۥ۟۟۠۟(LYue/ۥ۟ۤ۟ۢ;)LYue/ۥۡۧ۠;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۡۧ۠;->ۥ۟۟()F

    move-result p1

    return p1
.end method

.method public ۥ۟۟(LYue/ۥ۟ۤ۟ۢ;)F
    .locals 1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟۠;->ۥ۟۟۟ۧ(LYue/ۥ۟ۤ۟ۢ;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr p1, v0

    return p1
.end method

.method public ۥ۟۟۟(LYue/ۥ۟ۤ۟ۢ;)F
    .locals 0

    invoke-interface {p1}, LYue/ۥ۟ۤ۟ۢ;->ۥ۟۟۟۠()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getElevation()F

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۟ۤ۟ۢ;)V
    .locals 1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟۠;->ۥ۟(LYue/ۥ۟ۤ۟ۢ;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, LYue/ۥ۟ۤ۟۠;->ۥ۟۟۟ۡ(LYue/ۥ۟ۤ۟ۢ;F)V

    return-void
.end method

.method public ۥ۟۟۟۠(LYue/ۥ۟ۤ۟ۢ;)V
    .locals 4

    invoke-interface {p1}, LYue/ۥ۟ۤ۟ۢ;->ۥ۟۟۟()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0, v0, v0, v0}, LYue/ۥ۟ۤ۟ۢ;->setShadowPadding(IIII)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟۠;->ۥ۟(LYue/ۥ۟ۤ۟ۢ;)F

    move-result v0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟۠;->ۥ۟۟۟ۧ(LYue/ۥ۟ۤ۟ۢ;)F

    move-result v1

    invoke-interface {p1}, LYue/ۥ۟ۤ۟ۢ;->ۥ۟۟()Z

    move-result v2

    invoke-static {v0, v1, v2}, LYue/ۥۡۧ۠۟;->ۥ۟۟(FFZ)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-interface {p1}, LYue/ۥ۟ۤ۟ۢ;->ۥ۟۟()Z

    move-result v3

    invoke-static {v0, v1, v3}, LYue/ۥۡۧ۠۟;->ۥ۟۟۟(FFZ)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-interface {p1, v2, v0, v2, v0}, LYue/ۥ۟ۤ۟ۢ;->setShadowPadding(IIII)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥ۟ۤ۟ۢ;F)V
    .locals 3

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟۠;->ۥ۟۟۠۟(LYue/ۥ۟ۤ۟ۢ;)LYue/ۥۡۧ۠;

    move-result-object v0

    invoke-interface {p1}, LYue/ۥ۟ۤ۟ۢ;->ۥ۟۟۟()Z

    move-result v1

    invoke-interface {p1}, LYue/ۥ۟ۤ۟ۢ;->ۥ۟۟()Z

    move-result v2

    invoke-virtual {v0, p2, v1, v2}, LYue/ۥۡۧ۠;->ۥ۟۟۟ۡ(FZZ)V

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟۠;->ۥ۟۟۟۠(LYue/ۥ۟ۤ۟ۢ;)V

    return-void
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥ۟ۤ۟ۢ;Landroid/content/res/ColorStateList;)V
    .locals 0
    .param p2    # Landroid/content/res/ColorStateList;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟۠;->ۥ۟۟۠۟(LYue/ۥ۟ۤ۟ۢ;)LYue/ۥۡۧ۠;

    move-result-object p1

    invoke-virtual {p1, p2}, LYue/ۥۡۧ۠;->ۥ۟۟۟۠(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public ۥۣ۟۟۟(LYue/ۥ۟ۤ۟ۢ;)Landroid/content/res/ColorStateList;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟۠;->ۥ۟۟۠۟(LYue/ۥ۟ۤ۟ۢ;)LYue/ۥۡۧ۠;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۡۧ۠;->ۥ۟()Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۤ(LYue/ۥ۟ۤ۟ۢ;)V
    .locals 1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟۠;->ۥ۟(LYue/ۥ۟ۤ۟ۢ;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, LYue/ۥ۟ۤ۟۠;->ۥ۟۟۟ۡ(LYue/ۥ۟ۤ۟ۢ;F)V

    return-void
.end method

.method public ۥ۟۟۟ۥ(LYue/ۥ۟ۤ۟ۢ;)F
    .locals 1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟۠;->ۥ۟۟۟ۧ(LYue/ۥ۟ۤ۟ۢ;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr p1, v0

    return p1
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥ۟ۤ۟ۢ;Landroid/content/Context;Landroid/content/res/ColorStateList;FFF)V
    .locals 0

    new-instance p2, LYue/ۥۡۧ۠;

    invoke-direct {p2, p3, p4}, LYue/ۥۡۧ۠;-><init>(Landroid/content/res/ColorStateList;F)V

    invoke-interface {p1, p2}, LYue/ۥ۟ۤ۟ۢ;->ۥ۟(Landroid/graphics/drawable/Drawable;)V

    invoke-interface {p1}, LYue/ۥ۟ۤ۟ۢ;->ۥ۟۟۟۠()Landroid/view/View;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/view/View;->setClipToOutline(Z)V

    invoke-virtual {p2, p5}, Landroid/view/View;->setElevation(F)V

    invoke-virtual {p0, p1, p6}, LYue/ۥ۟ۤ۟۠;->ۥ۟۟۟ۡ(LYue/ۥ۟ۤ۟ۢ;F)V

    return-void
.end method

.method public ۥ۟۟۟ۧ(LYue/ۥ۟ۤ۟ۢ;)F
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۟۠;->ۥ۟۟۠۟(LYue/ۥ۟ۤ۟ۢ;)LYue/ۥۡۧ۠;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۡۧ۠;->ۥ۟۟۟()F

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۨ(LYue/ۥ۟ۤ۟ۢ;F)V
    .locals 0

    invoke-interface {p1}, LYue/ۥ۟ۤ۟ۢ;->ۥ۟۟۟۠()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public ۥ۟۟۠()V
    .locals 0

    return-void
.end method

.method public final ۥ۟۟۠۟(LYue/ۥ۟ۤ۟ۢ;)LYue/ۥۡۧ۠;
    .locals 0

    invoke-interface {p1}, LYue/ۥ۟ۤ۟ۢ;->ۥ۟۟۟۟()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, LYue/ۥۡۧ۠;

    return-object p1
.end method
