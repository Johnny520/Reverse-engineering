.class public LQ3;
.super Landroid/widget/RadioButton;
.source ""

# interfaces
.implements LlB;


# instance fields
.field public final a:Lj3;

.field public final b:Le3;

.field public final c:Ll4;

.field public d:LJ3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-static {p1}, LiB;->a(Landroid/content/Context;)V

    const v0, 0x55040417

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p0}, LYA;->a(Landroid/content/Context;Landroid/view/View;)V

    new-instance p1, Lj3;

    invoke-direct {p1, p0}, Lj3;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, LQ3;->a:Lj3;

    invoke-virtual {p1, p2, v0}, Lj3;->c(Landroid/util/AttributeSet;I)V

    new-instance p1, Le3;

    invoke-direct {p1, p0}, Le3;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LQ3;->b:Le3;

    invoke-virtual {p1, p2, v0}, Le3;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Ll4;

    invoke-direct {p1, p0}, Ll4;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, LQ3;->c:Ll4;

    invoke-virtual {p1, p2, v0}, Ll4;->f(Landroid/util/AttributeSet;I)V

    invoke-direct {p0}, LQ3;->getEmojiTextViewHelper()LJ3;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, LJ3;->b(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getEmojiTextViewHelper()LJ3;
    .locals 1

    iget-object v0, p0, LQ3;->d:LJ3;

    if-nez v0, :cond_0

    new-instance v0, LJ3;

    invoke-direct {v0, p0}, LJ3;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LQ3;->d:LJ3;

    :cond_0
    iget-object v0, p0, LQ3;->d:LJ3;

    return-object v0
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, LQ3;->b:Le3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le3;->a()V

    :cond_0
    iget-object v0, p0, LQ3;->c:Ll4;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll4;->b()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, LQ3;->b:Le3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le3;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, LQ3;->b:Le3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le3;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, LQ3;->a:Lj3;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lj3;->a:Landroid/content/res/ColorStateList;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportButtonTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, LQ3;->a:Lj3;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lj3;->b:Landroid/graphics/PorterDuff$Mode;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, LQ3;->c:Ll4;

    invoke-virtual {v0}, Ll4;->d()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, LQ3;->c:Ll4;

    invoke-virtual {v0}, Ll4;->e()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, LQ3;->getEmojiTextViewHelper()LJ3;

    move-result-object v0

    invoke-virtual {v0, p1}, LJ3;->c(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, LQ3;->b:Le3;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Le3;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, LQ3;->b:Le3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Le3;->f(I)V

    :cond_0
    return-void
.end method

.method public setButtonDrawable(I)V
    .locals 1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, LfG;->U(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, LQ3;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, LQ3;->a:Lj3;

    if-eqz p1, :cond_1

    .line 3
    iget-boolean v0, p1, Lj3;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p1, Lj3;->e:Z

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p1, Lj3;->e:Z

    .line 6
    invoke-virtual {p1}, Lj3;->a()V

    :cond_1
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, LQ3;->c:Ll4;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll4;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, LQ3;->c:Ll4;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll4;->b()V

    :cond_0
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, LQ3;->getEmojiTextViewHelper()LJ3;

    move-result-object v0

    invoke-virtual {v0, p1}, LJ3;->d(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    invoke-direct {p0}, LQ3;->getEmojiTextViewHelper()LJ3;

    move-result-object v0

    invoke-virtual {v0, p1}, LJ3;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, LQ3;->b:Le3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Le3;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, LQ3;->b:Le3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Le3;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, LQ3;->a:Lj3;

    if-eqz v0, :cond_0

    iput-object p1, v0, Lj3;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lj3;->c:Z

    invoke-virtual {v0}, Lj3;->a()V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, LQ3;->a:Lj3;

    if-eqz v0, :cond_0

    iput-object p1, v0, Lj3;->b:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lj3;->d:Z

    invoke-virtual {v0}, Lj3;->a()V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, LQ3;->c:Ll4;

    invoke-virtual {v0, p1}, Ll4;->i(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v0}, Ll4;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, LQ3;->c:Ll4;

    invoke-virtual {v0, p1}, Ll4;->j(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0}, Ll4;->b()V

    return-void
.end method
