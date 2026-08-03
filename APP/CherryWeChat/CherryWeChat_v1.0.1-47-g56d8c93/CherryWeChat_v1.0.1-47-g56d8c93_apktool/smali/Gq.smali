.class public final LGq;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/google/android/material/button/MaterialButton;

.field public b:LQx;

.field public c:Lcz;

.field public d:LPy;

.field public e:Lrl;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:Landroid/graphics/PorterDuff$Mode;

.field public m:Landroid/content/res/ColorStateList;

.field public n:Landroid/content/res/ColorStateList;

.field public o:Landroid/content/res/ColorStateList;

.field public p:LXq;

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Landroid/graphics/drawable/RippleDrawable;

.field public w:I


# direct methods
.method public constructor <init>(Lcom/google/android/material/button/MaterialButton;LQx;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LGq;->q:Z

    iput-boolean v0, p0, LGq;->r:Z

    iput-boolean v0, p0, LGq;->s:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, LGq;->u:Z

    iput-object p1, p0, LGq;->a:Lcom/google/android/material/button/MaterialButton;

    iput-object p2, p0, LGq;->b:LQx;

    return-void
.end method


# virtual methods
.method public final a(Z)LXq;
    .locals 2

    iget-object v0, p0, LGq;->v:Landroid/graphics/drawable/RippleDrawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LGq;->v:Landroid/graphics/drawable/RippleDrawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/InsetDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/DrawableWrapper;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/LayerDrawable;

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, LXq;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(II)V
    .locals 8

    iget-object v0, p0, LGq;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    iget v5, p0, LGq;->h:I

    iget v6, p0, LGq;->i:I

    iput p2, p0, LGq;->i:I

    iput p1, p0, LGq;->h:I

    iget-boolean v7, p0, LGq;->r:Z

    if-nez v7, :cond_0

    invoke-virtual {p0}, LGq;->c()V

    :cond_0
    add-int/2addr v2, p1

    sub-int/2addr v2, v5

    add-int/2addr v4, p2

    sub-int/2addr v4, v6

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    return-void
.end method

.method public final c()V
    .locals 12

    new-instance v0, LXq;

    iget-object v1, p0, LGq;->b:LQx;

    invoke-direct {v0, v1}, LXq;-><init>(LQx;)V

    iget-object v1, p0, LGq;->c:Lcz;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, LXq;->o(Lcz;)V

    :cond_0
    iget-object v1, p0, LGq;->d:LPy;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, LXq;->l(LPy;)V

    :cond_1
    iget-object v1, p0, LGq;->e:Lrl;

    if-eqz v1, :cond_2

    iput-object v1, v0, LXq;->D:Lrl;

    :cond_2
    iget-object v1, p0, LGq;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, LXq;->k(Landroid/content/Context;)V

    iget-object v2, p0, LGq;->m:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v2}, LXq;->setTintList(Landroid/content/res/ColorStateList;)V

    iget-object v2, p0, LGq;->l:Landroid/graphics/PorterDuff$Mode;

    if-eqz v2, :cond_3

    invoke-virtual {v0, v2}, LXq;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_3
    iget v2, p0, LGq;->k:I

    int-to-float v2, v2

    iget-object v3, p0, LGq;->n:Landroid/content/res/ColorStateList;

    iget-object v4, v0, LXq;->b:LVq;

    iput v2, v4, LVq;->k:F

    invoke-virtual {v0}, LXq;->invalidateSelf()V

    iget-object v2, v0, LXq;->b:LVq;

    iget-object v4, v2, LVq;->e:Landroid/content/res/ColorStateList;

    if-eq v4, v3, :cond_4

    iput-object v3, v2, LVq;->e:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v2

    invoke-virtual {v0, v2}, LXq;->onStateChange([I)Z

    :cond_4
    new-instance v2, LXq;

    iget-object v3, p0, LGq;->b:LQx;

    invoke-direct {v2, v3}, LXq;-><init>(LQx;)V

    iget-object v3, p0, LGq;->c:Lcz;

    if-eqz v3, :cond_5

    invoke-virtual {v2, v3}, LXq;->o(Lcz;)V

    :cond_5
    iget-object v3, p0, LGq;->d:LPy;

    if-eqz v3, :cond_6

    invoke-virtual {v2, v3}, LXq;->l(LPy;)V

    :cond_6
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, LXq;->setTint(I)V

    iget v4, p0, LGq;->k:I

    int-to-float v4, v4

    iget-boolean v5, p0, LGq;->q:Z

    if-eqz v5, :cond_7

    const v5, 0x55040149

    invoke-static {v1, v5}, LGu;->n(Landroid/view/View;I)I

    move-result v5

    goto :goto_0

    :cond_7
    move v5, v3

    :goto_0
    iget-object v6, v2, LXq;->b:LVq;

    iput v4, v6, LVq;->k:F

    invoke-virtual {v2}, LXq;->invalidateSelf()V

    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    iget-object v5, v2, LXq;->b:LVq;

    iget-object v6, v5, LVq;->e:Landroid/content/res/ColorStateList;

    if-eq v6, v4, :cond_8

    iput-object v4, v5, LVq;->e:Landroid/content/res/ColorStateList;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v4

    invoke-virtual {v2, v4}, LXq;->onStateChange([I)Z

    :cond_8
    new-instance v4, LXq;

    iget-object v5, p0, LGq;->b:LQx;

    invoke-direct {v4, v5}, LXq;-><init>(LQx;)V

    iput-object v4, p0, LGq;->p:LXq;

    iget-object v5, p0, LGq;->c:Lcz;

    if-eqz v5, :cond_9

    invoke-virtual {v4, v5}, LXq;->o(Lcz;)V

    :cond_9
    iget-object v4, p0, LGq;->d:LPy;

    if-eqz v4, :cond_a

    iget-object v5, p0, LGq;->p:LXq;

    invoke-virtual {v5, v4}, LXq;->l(LPy;)V

    :cond_a
    iget-object v4, p0, LGq;->p:LXq;

    const/4 v5, -0x1

    invoke-virtual {v4, v5}, LXq;->setTint(I)V

    new-instance v4, Landroid/graphics/drawable/RippleDrawable;

    iget-object v5, p0, LGq;->o:Landroid/content/res/ColorStateList;

    if-eqz v5, :cond_b

    goto :goto_1

    :cond_b
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    :goto_1
    new-instance v7, Landroid/graphics/drawable/LayerDrawable;

    const/4 v6, 0x2

    new-array v6, v6, [Landroid/graphics/drawable/Drawable;

    aput-object v2, v6, v3

    const/4 v2, 0x1

    aput-object v0, v6, v2

    invoke-direct {v7, v6}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    new-instance v6, Landroid/graphics/drawable/InsetDrawable;

    iget v8, p0, LGq;->f:I

    iget v9, p0, LGq;->h:I

    iget v10, p0, LGq;->g:I

    iget v11, p0, LGq;->i:I

    invoke-direct/range {v6 .. v11}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    iget-object v0, p0, LGq;->p:LXq;

    invoke-direct {v4, v5, v6, v0}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iput-object v4, p0, LGq;->v:Landroid/graphics/drawable/RippleDrawable;

    invoke-virtual {v1, v4}, Lcom/google/android/material/button/MaterialButton;->setInternalBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v3}, LGq;->a(Z)LXq;

    move-result-object v0

    if-eqz v0, :cond_c

    iget v2, p0, LGq;->w:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, LXq;->m(F)V

    invoke-virtual {v1}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_c
    return-void
.end method

.method public final d()V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LGq;->a(Z)LXq;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, LGq;->c:Lcz;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, LXq;->o(Lcz;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, LGq;->b:LQx;

    invoke-virtual {v0, v1}, LXq;->setShapeAppearanceModel(LQx;)V

    :goto_0
    iget-object v1, p0, LGq;->d:LPy;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, LXq;->l(LPy;)V

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LGq;->a(Z)LXq;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, p0, LGq;->c:Lcz;

    if-eqz v2, :cond_2

    invoke-virtual {v1, v2}, LXq;->o(Lcz;)V

    goto :goto_1

    :cond_2
    iget-object v2, p0, LGq;->b:LQx;

    invoke-virtual {v1, v2}, LXq;->setShapeAppearanceModel(LQx;)V

    :goto_1
    iget-object v2, p0, LGq;->d:LPy;

    if-eqz v2, :cond_3

    invoke-virtual {v1, v2}, LXq;->l(LPy;)V

    :cond_3
    iget-object v1, p0, LGq;->v:Landroid/graphics/drawable/RippleDrawable;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    move-result v1

    if-le v1, v0, :cond_5

    iget-object v1, p0, LGq;->v:Landroid/graphics/drawable/RippleDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    move-result v1

    const/4 v2, 0x2

    if-le v1, v2, :cond_4

    iget-object v0, p0, LGq;->v:Landroid/graphics/drawable/RippleDrawable;

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Lcy;

    goto :goto_2

    :cond_4
    iget-object v1, p0, LGq;->v:Landroid/graphics/drawable/RippleDrawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Lcy;

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_7

    iget-object v1, p0, LGq;->b:LQx;

    invoke-interface {v0, v1}, Lcy;->setShapeAppearanceModel(LQx;)V

    instance-of v1, v0, LXq;

    if-eqz v1, :cond_7

    check-cast v0, LXq;

    iget-object v1, p0, LGq;->c:Lcz;

    if-eqz v1, :cond_6

    invoke-virtual {v0, v1}, LXq;->o(Lcz;)V

    :cond_6
    iget-object v1, p0, LGq;->d:LPy;

    if-eqz v1, :cond_7

    invoke-virtual {v0, v1}, LXq;->l(LPy;)V

    :cond_7
    return-void
.end method

.method public final e()V
    .locals 6

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LGq;->a(Z)LXq;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, LGq;->a(Z)LXq;

    move-result-object v2

    if-eqz v1, :cond_2

    iget v3, p0, LGq;->k:I

    int-to-float v3, v3

    iget-object v4, p0, LGq;->n:Landroid/content/res/ColorStateList;

    iget-object v5, v1, LXq;->b:LVq;

    iput v3, v5, LVq;->k:F

    invoke-virtual {v1}, LXq;->invalidateSelf()V

    iget-object v3, v1, LXq;->b:LVq;

    iget-object v5, v3, LVq;->e:Landroid/content/res/ColorStateList;

    if-eq v5, v4, :cond_0

    iput-object v4, v3, LVq;->e:Landroid/content/res/ColorStateList;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v3

    invoke-virtual {v1, v3}, LXq;->onStateChange([I)Z

    :cond_0
    if-eqz v2, :cond_2

    iget v1, p0, LGq;->k:I

    int-to-float v1, v1

    iget-boolean v3, p0, LGq;->q:Z

    if-eqz v3, :cond_1

    iget-object v0, p0, LGq;->a:Lcom/google/android/material/button/MaterialButton;

    const v3, 0x55040149

    invoke-static {v0, v3}, LGu;->n(Landroid/view/View;I)I

    move-result v0

    :cond_1
    iget-object v3, v2, LXq;->b:LVq;

    iput v1, v3, LVq;->k:F

    invoke-virtual {v2}, LXq;->invalidateSelf()V

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iget-object v1, v2, LXq;->b:LVq;

    iget-object v3, v1, LVq;->e:Landroid/content/res/ColorStateList;

    if-eq v3, v0, :cond_2

    iput-object v0, v1, LVq;->e:Landroid/content/res/ColorStateList;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    invoke-virtual {v2, v0}, LXq;->onStateChange([I)Z

    :cond_2
    return-void
.end method
