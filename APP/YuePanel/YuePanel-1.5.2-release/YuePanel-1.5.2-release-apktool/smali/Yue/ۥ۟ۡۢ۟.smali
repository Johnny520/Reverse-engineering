.class public LYue/ۥ۟ۡۢ۟;
.super Landroid/widget/ImageButton;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۡۥۧ;
.implements LYue/ۥۢۡۦ۠;


# instance fields
.field private final mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

.field private mHasLevel:Z

.field private final mImageHelper:LYue/ۥ۟ۡۢ۠;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, LYue/ۥ۟ۡۢ۟;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 2
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۠ۡۢ:I

    invoke-direct {p0, p1, p2, v0}, LYue/ۥ۟ۡۢ۟;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 3
    invoke-static {p1}, LYue/ۥۢۡۥۣ;->ۥ۟(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, LYue/ۥ۟ۡۢ۟;->mHasLevel:Z

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥۢۡۡۢ;->ۥ(Landroid/view/View;Landroid/content/Context;)V

    .line 6
    new-instance p1, LYue/ۥ۟ۡ۟۟;

    invoke-direct {p1, p0}, LYue/ۥ۟ۡ۟۟;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LYue/ۥ۟ۡۢ۟;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    .line 7
    invoke-virtual {p1, p2, p3}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟۟(Landroid/util/AttributeSet;I)V

    .line 8
    new-instance p1, LYue/ۥ۟ۡۢ۠;

    invoke-direct {p1, p0}, LYue/ۥ۟ۡۢ۠;-><init>(Landroid/widget/ImageView;)V

    iput-object p1, p0, LYue/ۥ۟ۡۢ۟;->mImageHelper:LYue/ۥ۟ۡۢ۠;

    .line 9
    invoke-virtual {p1, p2, p3}, LYue/ۥ۟ۡۢ۠;->ۥ۟۟۟ۡ(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡ۟۟;->ۥ۟()V

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mImageHelper:LYue/ۥ۟ۡۢ۠;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥ۟ۡۢ۠;->ۥ۟۟()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportImageTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mImageHelper:LYue/ۥ۟ۡۢ۠;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡۢ۠;->ۥ۟۟۟()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportImageTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mImageHelper:LYue/ۥ۟ۡۢ۠;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡۢ۠;->ۥ۟۟۟۟()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mImageHelper:LYue/ۥ۟ۡۢ۠;

    invoke-virtual {v0}, LYue/ۥ۟ۡۢ۠;->ۥ۟۟۟۠()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/view/View;->hasOverlappingRendering()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟۠(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟ۡ(I)V

    :cond_0
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, LYue/ۥ۟ۡۢ۟;->mImageHelper:LYue/ۥ۟ۡۢ۠;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥ۟ۡۢ۠;->ۥ۟۟()V

    :cond_0
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mImageHelper:LYue/ۥ۟ۡۢ۠;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-boolean v1, p0, LYue/ۥ۟ۡۢ۟;->mHasLevel:Z

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۢ۠;->ۥ۟۟۟ۢ(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, LYue/ۥ۟ۡۢ۟;->mImageHelper:LYue/ۥ۟ۡۢ۠;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LYue/ۥ۟ۡۢ۠;->ۥ۟۟()V

    iget-boolean p1, p0, LYue/ۥ۟ۡۢ۟;->mHasLevel:Z

    if-nez p1, :cond_1

    iget-object p1, p0, LYue/ۥ۟ۡۢ۟;->mImageHelper:LYue/ۥ۟ۡۢ۠;

    invoke-virtual {p1}, LYue/ۥ۟ۡۢ۠;->ۥ۟()V

    :cond_1
    return-void
.end method

.method public setImageLevel(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageLevel(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۟ۡۢ۟;->mHasLevel:Z

    return-void
.end method

.method public setImageResource(I)V
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mImageHelper:LYue/ۥ۟ۡۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۢ۠;->ۥۣ۟۟۟(I)V

    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    iget-object p1, p0, LYue/ۥ۟ۡۢ۟;->mImageHelper:LYue/ۥ۟ۡۢ۠;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥ۟ۡۢ۠;->ۥ۟۟()V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡ۟۟;->ۥۣ۟۟۟(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟ۤ(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportImageTintList(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mImageHelper:LYue/ۥ۟ۡۢ۠;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۢ۠;->ۥ۟۟۟ۥ(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۢ۟;->mImageHelper:LYue/ۥ۟ۡۢ۠;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۢ۠;->ۥ۟۟۟ۦ(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method
