.class public final La/Vd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/Vd$a;
    }
.end annotation


# instance fields
.field public a:La/w1;

.field public b:La/w1;

.field public c:La/w1;

.field public d:La/w1;

.field public e:La/w4;

.field public f:La/w4;

.field public g:La/w4;

.field public h:La/w4;

.field public i:La/H5;

.field public j:La/H5;

.field public k:La/H5;

.field public l:La/H5;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La/Ad;

    invoke-direct {v0}, La/Ad;-><init>()V

    iput-object v0, p0, La/Vd;->a:La/w1;

    new-instance v0, La/Ad;

    invoke-direct {v0}, La/Ad;-><init>()V

    iput-object v0, p0, La/Vd;->b:La/w1;

    new-instance v0, La/Ad;

    invoke-direct {v0}, La/Ad;-><init>()V

    iput-object v0, p0, La/Vd;->c:La/w1;

    new-instance v0, La/Ad;

    invoke-direct {v0}, La/Ad;-><init>()V

    iput-object v0, p0, La/Vd;->d:La/w1;

    new-instance v0, La/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/s;-><init>(F)V

    iput-object v0, p0, La/Vd;->e:La/w4;

    new-instance v0, La/s;

    invoke-direct {v0, v1}, La/s;-><init>(F)V

    iput-object v0, p0, La/Vd;->f:La/w4;

    new-instance v0, La/s;

    invoke-direct {v0, v1}, La/s;-><init>(F)V

    iput-object v0, p0, La/Vd;->g:La/w4;

    new-instance v0, La/s;

    invoke-direct {v0, v1}, La/s;-><init>(F)V

    iput-object v0, p0, La/Vd;->h:La/w4;

    new-instance v0, La/H5;

    invoke-direct {v0}, La/H5;-><init>()V

    iput-object v0, p0, La/Vd;->i:La/H5;

    new-instance v0, La/H5;

    invoke-direct {v0}, La/H5;-><init>()V

    iput-object v0, p0, La/Vd;->j:La/H5;

    new-instance v0, La/H5;

    invoke-direct {v0}, La/H5;-><init>()V

    iput-object v0, p0, La/Vd;->k:La/H5;

    new-instance v0, La/H5;

    invoke-direct {v0}, La/H5;-><init>()V

    iput-object v0, p0, La/Vd;->l:La/H5;

    return-void
.end method

.method public static a(Landroid/content/Context;IILa/s;)La/Vd$a;
    .locals 6

    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-direct {v0, p0, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    if-eqz p2, :cond_0

    new-instance p0, Landroid/view/ContextThemeWrapper;

    invoke-direct {p0, v0, p2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    move-object v0, p0

    :cond_0
    sget-object p0, Lcom/google/android/material/R$styleable;->ShapeAppearance:[I

    invoke-virtual {v0, p0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p0

    :try_start_0
    sget p1, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerFamily:I

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    sget p2, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerFamilyTopLeft:I

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    sget v0, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerFamilyTopRight:I

    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    sget v1, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerFamilyBottomRight:I

    invoke-virtual {p0, v1, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    sget v2, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerFamilyBottomLeft:I

    invoke-virtual {p0, v2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    sget v2, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerSize:I

    invoke-static {p0, v2, p3}, La/Vd;->c(Landroid/content/res/TypedArray;ILa/w4;)La/w4;

    move-result-object p3

    sget v2, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerSizeTopLeft:I

    invoke-static {p0, v2, p3}, La/Vd;->c(Landroid/content/res/TypedArray;ILa/w4;)La/w4;

    move-result-object v2

    sget v3, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerSizeTopRight:I

    invoke-static {p0, v3, p3}, La/Vd;->c(Landroid/content/res/TypedArray;ILa/w4;)La/w4;

    move-result-object v3

    sget v4, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerSizeBottomRight:I

    invoke-static {p0, v4, p3}, La/Vd;->c(Landroid/content/res/TypedArray;ILa/w4;)La/w4;

    move-result-object v4

    sget v5, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerSizeBottomLeft:I

    invoke-static {p0, v5, p3}, La/Vd;->c(Landroid/content/res/TypedArray;ILa/w4;)La/w4;

    move-result-object p3

    new-instance v5, La/Vd$a;

    invoke-direct {v5}, La/Vd$a;-><init>()V

    invoke-static {p2}, La/n9;->l(I)La/w1;

    move-result-object p2

    iput-object p2, v5, La/Vd$a;->a:La/w1;

    invoke-static {p2}, La/Vd$a;->b(La/w1;)F

    iput-object v2, v5, La/Vd$a;->e:La/w4;

    invoke-static {v0}, La/n9;->l(I)La/w1;

    move-result-object p2

    iput-object p2, v5, La/Vd$a;->b:La/w1;

    invoke-static {p2}, La/Vd$a;->b(La/w1;)F

    iput-object v3, v5, La/Vd$a;->f:La/w4;

    invoke-static {v1}, La/n9;->l(I)La/w1;

    move-result-object p2

    iput-object p2, v5, La/Vd$a;->c:La/w1;

    invoke-static {p2}, La/Vd$a;->b(La/w1;)F

    iput-object v4, v5, La/Vd$a;->g:La/w4;

    invoke-static {p1}, La/n9;->l(I)La/w1;

    move-result-object p1

    iput-object p1, v5, La/Vd$a;->d:La/w1;

    invoke-static {p1}, La/Vd$a;->b(La/w1;)F

    iput-object p3, v5, La/Vd$a;->h:La/w4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v5

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public static b(Landroid/content/Context;Landroid/util/AttributeSet;II)La/Vd$a;
    .locals 3

    new-instance v0, La/s;

    const/4 v1, 0x0

    int-to-float v2, v1

    invoke-direct {v0, v2}, La/s;-><init>(F)V

    sget-object v2, Lcom/google/android/material/R$styleable;->MaterialShape:[I

    invoke-virtual {p0, p1, v2, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lcom/google/android/material/R$styleable;->MaterialShape_shapeAppearance:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    sget p3, Lcom/google/android/material/R$styleable;->MaterialShape_shapeAppearanceOverlay:I

    invoke-virtual {p1, p3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {p0, p2, p3, v0}, La/Vd;->a(Landroid/content/Context;IILa/s;)La/Vd$a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/res/TypedArray;ILa/w4;)La/w4;
    .locals 2

    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    new-instance p2, La/s;

    iget p1, p1, Landroid/util/TypedValue;->data:I

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result p0

    int-to-float p0, p0

    invoke-direct {p2, p0}, La/s;-><init>(F)V

    return-object p2

    :cond_1
    const/4 p0, 0x6

    if-ne v0, p0, :cond_2

    new-instance p0, La/Xc;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, p2}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result p1

    invoke-direct {p0, p1}, La/Xc;-><init>(F)V

    return-object p0

    :cond_2
    :goto_0
    return-object p2
.end method


# virtual methods
.method public final d(Landroid/graphics/RectF;)Z
    .locals 5

    iget-object v0, p0, La/Vd;->l:La/H5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, La/H5;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, La/Vd;->j:La/H5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La/Vd;->i:La/H5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La/Vd;->k:La/H5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v1, p0, La/Vd;->e:La/w4;

    invoke-interface {v1, p1}, La/w4;->a(Landroid/graphics/RectF;)F

    move-result v1

    iget-object v4, p0, La/Vd;->f:La/w4;

    invoke-interface {v4, p1}, La/w4;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, La/Vd;->h:La/w4;

    invoke-interface {v4, p1}, La/w4;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, La/Vd;->g:La/w4;

    invoke-interface {v4, p1}, La/w4;->a(Landroid/graphics/RectF;)F

    move-result p1

    cmpl-float p1, p1, v1

    if-nez p1, :cond_1

    move p1, v3

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    iget-object v1, p0, La/Vd;->b:La/w1;

    instance-of v1, v1, La/Ad;

    if-eqz v1, :cond_2

    iget-object v1, p0, La/Vd;->a:La/w1;

    instance-of v1, v1, La/Ad;

    if-eqz v1, :cond_2

    iget-object v1, p0, La/Vd;->c:La/w1;

    instance-of v1, v1, La/Ad;

    if-eqz v1, :cond_2

    iget-object v1, p0, La/Vd;->d:La/w1;

    instance-of v1, v1, La/Ad;

    if-eqz v1, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    if-eqz v1, :cond_3

    return v3

    :cond_3
    return v2
.end method

.method public final e()La/Vd$a;
    .locals 3

    new-instance v0, La/Vd$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, La/Ad;

    invoke-direct {v1}, La/Ad;-><init>()V

    iput-object v1, v0, La/Vd$a;->a:La/w1;

    new-instance v1, La/Ad;

    invoke-direct {v1}, La/Ad;-><init>()V

    iput-object v1, v0, La/Vd$a;->b:La/w1;

    new-instance v1, La/Ad;

    invoke-direct {v1}, La/Ad;-><init>()V

    iput-object v1, v0, La/Vd$a;->c:La/w1;

    new-instance v1, La/Ad;

    invoke-direct {v1}, La/Ad;-><init>()V

    iput-object v1, v0, La/Vd$a;->d:La/w1;

    new-instance v1, La/s;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, La/s;-><init>(F)V

    iput-object v1, v0, La/Vd$a;->e:La/w4;

    new-instance v1, La/s;

    invoke-direct {v1, v2}, La/s;-><init>(F)V

    iput-object v1, v0, La/Vd$a;->f:La/w4;

    new-instance v1, La/s;

    invoke-direct {v1, v2}, La/s;-><init>(F)V

    iput-object v1, v0, La/Vd$a;->g:La/w4;

    new-instance v1, La/s;

    invoke-direct {v1, v2}, La/s;-><init>(F)V

    iput-object v1, v0, La/Vd$a;->h:La/w4;

    new-instance v1, La/H5;

    invoke-direct {v1}, La/H5;-><init>()V

    iput-object v1, v0, La/Vd$a;->i:La/H5;

    new-instance v1, La/H5;

    invoke-direct {v1}, La/H5;-><init>()V

    iput-object v1, v0, La/Vd$a;->j:La/H5;

    new-instance v1, La/H5;

    invoke-direct {v1}, La/H5;-><init>()V

    iput-object v1, v0, La/Vd$a;->k:La/H5;

    new-instance v1, La/H5;

    invoke-direct {v1}, La/H5;-><init>()V

    iget-object v1, p0, La/Vd;->a:La/w1;

    iput-object v1, v0, La/Vd$a;->a:La/w1;

    iget-object v1, p0, La/Vd;->b:La/w1;

    iput-object v1, v0, La/Vd$a;->b:La/w1;

    iget-object v1, p0, La/Vd;->c:La/w1;

    iput-object v1, v0, La/Vd$a;->c:La/w1;

    iget-object v1, p0, La/Vd;->d:La/w1;

    iput-object v1, v0, La/Vd$a;->d:La/w1;

    iget-object v1, p0, La/Vd;->e:La/w4;

    iput-object v1, v0, La/Vd$a;->e:La/w4;

    iget-object v1, p0, La/Vd;->f:La/w4;

    iput-object v1, v0, La/Vd$a;->f:La/w4;

    iget-object v1, p0, La/Vd;->g:La/w4;

    iput-object v1, v0, La/Vd$a;->g:La/w4;

    iget-object v1, p0, La/Vd;->h:La/w4;

    iput-object v1, v0, La/Vd$a;->h:La/w4;

    iget-object v1, p0, La/Vd;->i:La/H5;

    iput-object v1, v0, La/Vd$a;->i:La/H5;

    iget-object v1, p0, La/Vd;->j:La/H5;

    iput-object v1, v0, La/Vd$a;->j:La/H5;

    iget-object v1, p0, La/Vd;->k:La/H5;

    iput-object v1, v0, La/Vd$a;->k:La/H5;

    iget-object v1, p0, La/Vd;->l:La/H5;

    iput-object v1, v0, La/Vd$a;->l:La/H5;

    return-object v0
.end method
