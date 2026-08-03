.class public final La/t1;
.super Landroid/widget/ToggleButton;
.source "SourceFile"


# instance fields
.field public final a:La/G0;

.field public final b:La/p1;

.field public c:La/b1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x101004b

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, La/df;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, La/G0;

    invoke-direct {p1, p0}, La/G0;-><init>(Landroid/view/View;)V

    iput-object p1, p0, La/t1;->a:La/G0;

    invoke-virtual {p1, p2, v0}, La/G0;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, La/p1;

    invoke-direct {p1, p0}, La/p1;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, La/t1;->b:La/p1;

    invoke-virtual {p1, p2, v0}, La/p1;->f(Landroid/util/AttributeSet;I)V

    invoke-direct {p0}, La/t1;->getEmojiTextViewHelper()La/b1;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, La/b1;->b(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getEmojiTextViewHelper()La/b1;
    .locals 1

    iget-object v0, p0, La/t1;->c:La/b1;

    if-nez v0, :cond_0

    new-instance v0, La/b1;

    invoke-direct {v0, p0}, La/b1;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, La/t1;->c:La/b1;

    :cond_0
    iget-object v0, p0, La/t1;->c:La/b1;

    return-object v0
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/ToggleButton;->drawableStateChanged()V

    iget-object v0, p0, La/t1;->a:La/G0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La/G0;->a()V

    :cond_0
    iget-object v0, p0, La/t1;->b:La/p1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, La/p1;->b()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, La/t1;->a:La/G0;

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

    iget-object v0, p0, La/t1;->a:La/G0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La/G0;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, La/t1;->b:La/p1;

    invoke-virtual {v0}, La/p1;->d()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, La/t1;->b:La/p1;

    invoke-virtual {v0}, La/p1;->e()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, La/t1;->getEmojiTextViewHelper()La/b1;

    move-result-object v0

    invoke-virtual {v0, p1}, La/b1;->c(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ToggleButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, La/t1;->a:La/G0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, La/G0;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, La/t1;->a:La/G0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La/G0;->f(I)V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, La/t1;->b:La/p1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, La/p1;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, La/t1;->b:La/p1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, La/p1;->b()V

    :cond_0
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, La/t1;->getEmojiTextViewHelper()La/b1;

    move-result-object v0

    invoke-virtual {v0, p1}, La/b1;->d(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    invoke-direct {p0}, La/t1;->getEmojiTextViewHelper()La/b1;

    move-result-object v0

    invoke-virtual {v0, p1}, La/b1;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, La/t1;->a:La/G0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La/G0;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, La/t1;->a:La/G0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La/G0;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, La/t1;->b:La/p1;

    invoke-virtual {v0, p1}, La/p1;->i(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v0}, La/p1;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, La/t1;->b:La/p1;

    invoke-virtual {v0, p1}, La/p1;->j(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0}, La/p1;->b()V

    return-void
.end method
