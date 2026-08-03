.class public abstract Lg/p;
.super Landroid/widget/CheckBox;
.source "SourceFile"


# instance fields
.field public final a:Lg/q;

.field public final b:Lg/n;

.field public final c:Lg/G;

.field public d:Lg/v;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9

    invoke-static {p1}, Lg/B0;->a(Landroid/content/Context;)V

    const v6, 0x7f0400c7

    invoke-direct {p0, p1, p2, v6}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lg/A0;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lg/q;

    invoke-direct {p1, p0}, Lg/q;-><init>(Landroid/widget/CompoundButton;)V

    iput-object p1, p0, Lg/p;->a:Lg/q;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v2, Lb/a;->j:[I

    const/4 v7, 0x0

    invoke-static {p1, p2, v2, v6, v7}, LJ0/d;->s(Landroid/content/Context;Landroid/util/AttributeSet;[III)LJ0/d;

    move-result-object p1

    iget-object v0, p1, LJ0/d;->c:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Landroid/content/res/TypedArray;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v0, p1, LJ0/d;->c:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/content/res/TypedArray;

    move-object v0, p0

    move-object v3, p2

    move v5, v6

    invoke-static/range {v0 .. v5}, LD/Q;->i(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {v8, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v8, v0, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :try_start_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg/p;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :catch_0
    :cond_0
    :try_start_2
    invoke-virtual {v8, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v8, v7, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg/p;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    :goto_0
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, LJ0/d;->h(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {p0, v0}, LJ/b;->c(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    :cond_2
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, -0x1

    invoke-virtual {v8, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lg/W;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    invoke-static {p0, v0}, LJ/b;->d(Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    invoke-virtual {p1}, LJ0/d;->u()V

    new-instance p1, Lg/n;

    invoke-direct {p1, p0}, Lg/n;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lg/p;->b:Lg/n;

    invoke-virtual {p1, p2, v6}, Lg/n;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Lg/G;

    invoke-direct {p1, p0}, Lg/G;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lg/p;->c:Lg/G;

    invoke-virtual {p1, p2, v6}, Lg/G;->d(Landroid/util/AttributeSet;I)V

    invoke-direct {p0}, Lg/p;->getEmojiTextViewHelper()Lg/v;

    move-result-object p1

    invoke-virtual {p1, p2, v6}, Lg/v;->a(Landroid/util/AttributeSet;I)V

    return-void

    :goto_1
    invoke-virtual {p1}, LJ0/d;->u()V

    throw p2
.end method

.method private getEmojiTextViewHelper()Lg/v;
    .locals 1

    iget-object v0, p0, Lg/p;->d:Lg/v;

    if-nez v0, :cond_0

    new-instance v0, Lg/v;

    invoke-direct {v0, p0}, Lg/v;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lg/p;->d:Lg/v;

    :cond_0
    iget-object v0, p0, Lg/p;->d:Lg/v;

    return-object v0
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, Lg/p;->b:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg/n;->a()V

    :cond_0
    iget-object v0, p0, Lg/p;->c:Lg/G;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lg/G;->b()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lg/p;->b:Lg/n;

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

    iget-object v0, p0, Lg/p;->b:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg/n;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lg/p;->a:Lg/q;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lg/q;->b:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportButtonTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lg/p;->a:Lg/q;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lg/q;->c:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lg/p;->c:Lg/G;

    iget-object v0, v0, Lg/G;->h:Lg/C0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lg/C0;->a:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lg/p;->c:Lg/G;

    iget-object v0, v0, Lg/G;->h:Lg/C0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lg/C0;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, Lg/p;->getEmojiTextViewHelper()Lg/v;

    move-result-object v0

    iget-object v0, v0, Lg/v;->b:LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, LA0/p;

    invoke-virtual {v0, p1}, LA0/p;->Q(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lg/p;->b:Lg/n;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg/n;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lg/p;->b:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg/n;->f(I)V

    :cond_0
    return-void
.end method

.method public setButtonDrawable(I)V
    .locals 1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg/p;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Lg/p;->a:Lg/q;

    if-eqz p1, :cond_1

    .line 3
    iget-boolean v0, p1, Lg/q;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p1, Lg/q;->f:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p1, Lg/q;->f:Z

    .line 6
    invoke-virtual {p1}, Lg/q;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lg/p;->c:Lg/G;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg/G;->b()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lg/p;->c:Lg/G;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg/G;->b()V

    :cond_0
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Lg/p;->getEmojiTextViewHelper()Lg/v;

    move-result-object v0

    iget-object v0, v0, Lg/v;->b:LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, LA0/p;

    invoke-virtual {v0, p1}, LA0/p;->R(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    invoke-direct {p0}, Lg/p;->getEmojiTextViewHelper()Lg/v;

    move-result-object v0

    iget-object v0, v0, Lg/v;->b:LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, LA0/p;

    invoke-virtual {v0, p1}, LA0/p;->w([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lg/p;->b:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg/n;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lg/p;->b:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg/n;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lg/p;->a:Lg/q;

    if-eqz v0, :cond_0

    iput-object p1, v0, Lg/q;->b:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lg/q;->d:Z

    invoke-virtual {v0}, Lg/q;->a()V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lg/p;->a:Lg/q;

    if-eqz v0, :cond_0

    iput-object p1, v0, Lg/q;->c:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lg/q;->e:Z

    invoke-virtual {v0}, Lg/q;->a()V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lg/p;->c:Lg/G;

    invoke-virtual {v0, p1}, Lg/G;->j(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v0}, Lg/G;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lg/p;->c:Lg/G;

    invoke-virtual {v0, p1}, Lg/G;->k(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0}, Lg/G;->b()V

    return-void
.end method
