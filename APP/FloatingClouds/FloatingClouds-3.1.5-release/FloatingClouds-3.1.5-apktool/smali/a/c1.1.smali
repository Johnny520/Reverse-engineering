.class public La/c1;
.super Landroid/widget/ImageButton;
.source "SourceFile"


# instance fields
.field public final a:La/G0;

.field public final b:La/d1;

.field public c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget v0, Landroidx/appcompat/R$attr;->imageButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, La/c1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-static {p1}, La/lf;->a(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, La/c1;->c:Z

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, La/df;->a(Landroid/view/View;Landroid/content/Context;)V

    .line 5
    new-instance p1, La/G0;

    invoke-direct {p1, p0}, La/G0;-><init>(Landroid/view/View;)V

    iput-object p1, p0, La/c1;->a:La/G0;

    .line 6
    invoke-virtual {p1, p2, p3}, La/G0;->d(Landroid/util/AttributeSet;I)V

    .line 7
    new-instance p1, La/d1;

    invoke-direct {p1, p0}, La/d1;-><init>(Landroid/widget/ImageView;)V

    iput-object p1, p0, La/c1;->b:La/d1;

    .line 8
    invoke-virtual {p1, p2, p3}, La/d1;->b(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, La/c1;->a:La/G0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La/G0;->a()V

    :cond_0
    iget-object v0, p0, La/c1;->b:La/d1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, La/d1;->a()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, La/c1;->a:La/G0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La/G0;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, La/c1;->a:La/G0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La/G0;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportImageTintList()Landroid/content/res/ColorStateList;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, La/c1;->b:La/d1;

    if-eqz v1, :cond_0

    iget-object v1, v1, La/d1;->b:La/mf;

    if-eqz v1, :cond_0

    iget-object v0, v1, La/mf;->a:Landroid/content/res/ColorStateList;

    :cond_0
    return-object v0
.end method

.method public getSupportImageTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, La/c1;->b:La/d1;

    if-eqz v1, :cond_0

    iget-object v1, v1, La/d1;->b:La/mf;

    if-eqz v1, :cond_0

    iget-object v0, v1, La/mf;->b:Landroid/graphics/PorterDuff$Mode;

    :cond_0
    return-object v0
.end method

.method public final hasOverlappingRendering()Z
    .locals 1

    iget-object v0, p0, La/c1;->b:La/d1;

    iget-object v0, v0, La/d1;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/view/View;->hasOverlappingRendering()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, La/c1;->a:La/G0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, La/G0;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, La/c1;->a:La/G0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La/G0;->f(I)V

    :cond_0
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, La/c1;->b:La/d1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, La/d1;->a()V

    :cond_0
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-object v0, p0, La/c1;->b:La/d1;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-boolean v1, p0, La/c1;->c:Z

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v1

    iput v1, v0, La/d1;->c:I

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, La/d1;->a()V

    iget-boolean p1, p0, La/c1;->c:Z

    if-nez p1, :cond_1

    iget-object p1, v0, La/d1;->a:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget v0, v0, La/d1;->c:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    :cond_1
    return-void
.end method

.method public setImageLevel(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageLevel(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, La/c1;->c:Z

    return-void
.end method

.method public setImageResource(I)V
    .locals 3

    iget-object v0, p0, La/c1;->b:La/d1;

    iget-object v1, v0, La/d1;->a:Landroid/widget/ImageView;

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, p1}, La/w1;->A(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, La/x5;->a(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    invoke-virtual {v0}, La/d1;->a()V

    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    iget-object p1, p0, La/c1;->b:La/d1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, La/d1;->a()V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, La/c1;->a:La/G0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La/G0;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, La/c1;->a:La/G0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La/G0;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportImageTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, La/c1;->b:La/d1;

    if-eqz v0, :cond_1

    iget-object v1, v0, La/d1;->b:La/mf;

    if-nez v1, :cond_0

    new-instance v1, La/mf;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, La/d1;->b:La/mf;

    :cond_0
    iget-object v1, v0, La/d1;->b:La/mf;

    iput-object p1, v1, La/mf;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v1, La/mf;->d:Z

    invoke-virtual {v0}, La/d1;->a()V

    :cond_1
    return-void
.end method

.method public setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    iget-object v0, p0, La/c1;->b:La/d1;

    if-eqz v0, :cond_1

    iget-object v1, v0, La/d1;->b:La/mf;

    if-nez v1, :cond_0

    new-instance v1, La/mf;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, La/d1;->b:La/mf;

    :cond_0
    iget-object v1, v0, La/d1;->b:La/mf;

    iput-object p1, v1, La/mf;->b:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v1, La/mf;->c:Z

    invoke-virtual {v0}, La/d1;->a()V

    :cond_1
    return-void
.end method
