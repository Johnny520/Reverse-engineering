.class public Lg/w;
.super Landroid/widget/ImageButton;
.source "SourceFile"


# instance fields
.field public final a:Lg/n;

.field public final b:Lc0/r1;

.field public c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-static {p1}, Lg/B0;->a(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lg/w;->c:Z

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lg/A0;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lg/n;

    invoke-direct {p1, p0}, Lg/n;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lg/w;->a:Lg/n;

    invoke-virtual {p1, p2, p3}, Lg/n;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Lc0/r1;

    invoke-direct {p1, p0}, Lc0/r1;-><init>(Landroid/widget/ImageView;)V

    iput-object p1, p0, Lg/w;->b:Lc0/r1;

    invoke-virtual {p1, p2, p3}, Lc0/r1;->b(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, Lg/w;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg/n;->a()V

    :cond_0
    iget-object v0, p0, Lg/w;->b:Lc0/r1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lc0/r1;->a()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lg/w;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg/n;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lg/w;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg/n;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportImageTintList()Landroid/content/res/ColorStateList;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lg/w;->b:Lc0/r1;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lc0/r1;->c:Ljava/lang/Object;

    check-cast v1, Lg/C0;

    if-eqz v1, :cond_0

    iget-object v0, v1, Lg/C0;->a:Landroid/content/res/ColorStateList;

    :cond_0
    return-object v0
.end method

.method public getSupportImageTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lg/w;->b:Lc0/r1;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lc0/r1;->c:Ljava/lang/Object;

    check-cast v1, Lg/C0;

    if-eqz v1, :cond_0

    iget-object v0, v1, Lg/C0;->b:Landroid/graphics/PorterDuff$Mode;

    :cond_0
    return-object v0
.end method

.method public final hasOverlappingRendering()Z
    .locals 2

    iget-object v0, p0, Lg/w;->b:Lc0/r1;

    iget-object v0, v0, Lc0/r1;->b:Ljava/lang/Object;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/view/View;->hasOverlappingRendering()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lg/w;->a:Lg/n;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg/n;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lg/w;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg/n;->f(I)V

    :cond_0
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lg/w;->b:Lc0/r1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lc0/r1;->a()V

    :cond_0
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-object v0, p0, Lg/w;->b:Lc0/r1;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-boolean v1, p0, Lg/w;->c:Z

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v1

    iput v1, v0, Lc0/r1;->a:I

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lc0/r1;->a()V

    iget-boolean p1, p0, Lg/w;->c:Z

    if-nez p1, :cond_1

    iget-object p1, v0, Lc0/r1;->b:Ljava/lang/Object;

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget v0, v0, Lc0/r1;->a:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    :cond_1
    return-void
.end method

.method public setImageLevel(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageLevel(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg/w;->c:Z

    return-void
.end method

.method public setImageResource(I)V
    .locals 3

    iget-object v0, p0, Lg/w;->b:Lc0/r1;

    iget-object v1, v0, Lc0/r1;->b:Ljava/lang/Object;

    check-cast v1, Landroid/widget/ImageView;

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, p1}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lg/W;->a(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    invoke-virtual {v0}, Lc0/r1;->a()V

    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    iget-object p1, p0, Lg/w;->b:Lc0/r1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lc0/r1;->a()V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lg/w;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg/n;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lg/w;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg/n;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportImageTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, Lg/w;->b:Lc0/r1;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lc0/r1;->c:Ljava/lang/Object;

    check-cast v1, Lg/C0;

    if-nez v1, :cond_0

    new-instance v1, Lg/C0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lc0/r1;->c:Ljava/lang/Object;

    :cond_0
    iget-object v1, v0, Lc0/r1;->c:Ljava/lang/Object;

    check-cast v1, Lg/C0;

    iput-object p1, v1, Lg/C0;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v1, Lg/C0;->d:Z

    invoke-virtual {v0}, Lc0/r1;->a()V

    :cond_1
    return-void
.end method

.method public setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    iget-object v0, p0, Lg/w;->b:Lc0/r1;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lc0/r1;->c:Ljava/lang/Object;

    check-cast v1, Lg/C0;

    if-nez v1, :cond_0

    new-instance v1, Lg/C0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lc0/r1;->c:Ljava/lang/Object;

    :cond_0
    iget-object v1, v0, Lc0/r1;->c:Ljava/lang/Object;

    check-cast v1, Lg/C0;

    iput-object p1, v1, Lg/C0;->b:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v1, Lg/C0;->c:Z

    invoke-virtual {v0}, Lc0/r1;->a()V

    :cond_1
    return-void
.end method
