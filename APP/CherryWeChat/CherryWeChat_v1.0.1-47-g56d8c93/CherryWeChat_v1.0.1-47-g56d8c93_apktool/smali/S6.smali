.class public LS6;
.super Landroid/widget/FrameLayout;
.source ""


# static fields
.field public static final f:[I

.field public static final g:Lm6;


# instance fields
.field public a:Z

.field public b:Z

.field public final c:Landroid/graphics/Rect;

.field public final d:Landroid/graphics/Rect;

.field public final e:LP3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const v0, 0x1010031

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LS6;->f:[I

    new-instance v0, Lm6;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lm6;-><init>(I)V

    sput-object v0, LS6;->g:Lm6;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

    const/4 v0, 0x0

    const v1, 0x550400c2

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, LS6;->c:Landroid/graphics/Rect;

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, LS6;->d:Landroid/graphics/Rect;

    new-instance v3, LP3;

    const/16 v4, 0xa

    invoke-direct {v3, v4, p0}, LP3;-><init>(ILjava/lang/Object;)V

    iput-object v3, p0, LS6;->e:LP3;

    sget-object v4, LNu;->a:[I

    const v5, 0x55120123

    invoke-virtual {p1, v0, v4, v1, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    const/4 v4, 0x3

    const/4 v5, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v6, LS6;->f:[I

    invoke-virtual {v1, v6}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    invoke-virtual {v1, v5, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    new-array v1, v4, [F

    invoke-static {v6, v1}, Landroid/graphics/Color;->colorToHSV(I[F)V

    aget v0, v1, v0

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x5506003c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x5506003b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    :goto_0
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    :goto_1
    const/4 v1, 0x0

    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    const/4 v6, 0x4

    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v6

    const/4 v7, 0x5

    invoke-virtual {p1, v7, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    const/4 v7, 0x7

    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, p0, LS6;->a:Z

    const/4 v7, 0x6

    const/4 v8, 0x1

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, p0, LS6;->b:Z

    const/16 v7, 0x8

    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    const/16 v9, 0xa

    invoke-virtual {p1, v9, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v9

    iput v9, v2, Landroid/graphics/Rect;->left:I

    const/16 v9, 0xc

    invoke-virtual {p1, v9, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v9

    iput v9, v2, Landroid/graphics/Rect;->top:I

    const/16 v9, 0xb

    invoke-virtual {p1, v9, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v9

    iput v9, v2, Landroid/graphics/Rect;->right:I

    const/16 v9, 0x9

    invoke-virtual {p1, v9, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v2, Landroid/graphics/Rect;->bottom:I

    cmpl-float v2, v6, v1

    if-lez v2, :cond_2

    move v1, v6

    :cond_2
    invoke-virtual {p1, v5, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    invoke-virtual {p1, v8, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p1, LNw;

    invoke-direct {p1, v0, v4}, LNw;-><init>(Landroid/content/res/ColorStateList;F)V

    iput-object p1, v3, LP3;->b:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v8}, Landroid/view/View;->setClipToOutline(Z)V

    invoke-virtual {p0, v6}, Landroid/view/View;->setElevation(F)V

    sget-object p1, LS6;->g:Lm6;

    invoke-virtual {p1, v3, v1}, Lm6;->n(LP3;F)V

    return-void
.end method

.method public static synthetic a(LS6;IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method


# virtual methods
.method public getCardBackgroundColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, LS6;->e:LP3;

    iget-object v0, v0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable;

    check-cast v0, LNw;

    iget-object v0, v0, LNw;->h:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getCardElevation()F
    .locals 1

    iget-object v0, p0, LS6;->e:LP3;

    iget-object v0, v0, LP3;->c:Ljava/lang/Object;

    check-cast v0, LS6;

    invoke-virtual {v0}, Landroid/view/View;->getElevation()F

    move-result v0

    return v0
.end method

.method public getContentPaddingBottom()I
    .locals 1

    iget-object v0, p0, LS6;->c:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    return v0
.end method

.method public getContentPaddingLeft()I
    .locals 1

    iget-object v0, p0, LS6;->c:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    return v0
.end method

.method public getContentPaddingRight()I
    .locals 1

    iget-object v0, p0, LS6;->c:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    return v0
.end method

.method public getContentPaddingTop()I
    .locals 1

    iget-object v0, p0, LS6;->c:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    return v0
.end method

.method public getMaxCardElevation()F
    .locals 1

    iget-object v0, p0, LS6;->e:LP3;

    iget-object v0, v0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable;

    check-cast v0, LNw;

    iget v0, v0, LNw;->e:F

    return v0
.end method

.method public getPreventCornerOverlap()Z
    .locals 1

    iget-boolean v0, p0, LS6;->b:Z

    return v0
.end method

.method public getRadius()F
    .locals 1

    iget-object v0, p0, LS6;->e:LP3;

    iget-object v0, v0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable;

    check-cast v0, LNw;

    iget v0, v0, LNw;->a:F

    return v0
.end method

.method public getUseCompatPadding()Z
    .locals 1

    iget-boolean v0, p0, LS6;->a:Z

    return v0
.end method

.method public final onMeasure(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public setCardBackgroundColor(I)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    .line 2
    iget-object v0, p0, LS6;->e:LP3;

    iget-object v0, v0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 3
    check-cast v0, LNw;

    if-nez p1, :cond_0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    :cond_0
    iput-object p1, v0, LNw;->h:Landroid/content/res/ColorStateList;

    .line 6
    iget-object v1, v0, LNw;->b:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v2

    iget-object v3, v0, LNw;->h:Landroid/content/res/ColorStateList;

    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public setCardBackgroundColor(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 8
    iget-object v0, p0, LS6;->e:LP3;

    .line 9
    iget-object v0, v0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 10
    check-cast v0, LNw;

    if-nez p1, :cond_0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    .line 12
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    :cond_0
    iput-object p1, v0, LNw;->h:Landroid/content/res/ColorStateList;

    .line 13
    iget-object v1, v0, LNw;->b:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v2

    iget-object v3, v0, LNw;->h:Landroid/content/res/ColorStateList;

    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 14
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public setCardElevation(F)V
    .locals 1

    iget-object v0, p0, LS6;->e:LP3;

    iget-object v0, v0, LP3;->c:Ljava/lang/Object;

    check-cast v0, LS6;

    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public setMaxCardElevation(F)V
    .locals 2

    sget-object v0, LS6;->g:Lm6;

    iget-object v1, p0, LS6;->e:LP3;

    invoke-virtual {v0, v1, p1}, Lm6;->n(LP3;F)V

    return-void
.end method

.method public setMinimumHeight(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    return-void
.end method

.method public setMinimumWidth(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setMinimumWidth(I)V

    return-void
.end method

.method public final setPadding(IIII)V
    .locals 0

    return-void
.end method

.method public final setPaddingRelative(IIII)V
    .locals 0

    return-void
.end method

.method public setPreventCornerOverlap(Z)V
    .locals 2

    iget-boolean v0, p0, LS6;->b:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, LS6;->b:Z

    iget-object p1, p0, LS6;->e:LP3;

    iget-object v0, p1, LP3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable;

    check-cast v0, LNw;

    iget v0, v0, LNw;->e:F

    sget-object v1, LS6;->g:Lm6;

    invoke-virtual {v1, p1, v0}, Lm6;->n(LP3;F)V

    :cond_0
    return-void
.end method

.method public setRadius(F)V
    .locals 2

    iget-object v0, p0, LS6;->e:LP3;

    iget-object v0, v0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable;

    check-cast v0, LNw;

    iget v1, v0, LNw;->a:F

    cmpl-float v1, p1, v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iput p1, v0, LNw;->a:F

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, LNw;->b(Landroid/graphics/Rect;)V

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public setUseCompatPadding(Z)V
    .locals 2

    iget-boolean v0, p0, LS6;->a:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, LS6;->a:Z

    iget-object p1, p0, LS6;->e:LP3;

    iget-object v0, p1, LP3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable;

    check-cast v0, LNw;

    iget v0, v0, LNw;->e:F

    sget-object v1, LS6;->g:Lm6;

    invoke-virtual {v1, p1, v0}, Lm6;->n(LP3;F)V

    :cond_0
    return-void
.end method
