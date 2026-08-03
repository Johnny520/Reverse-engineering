.class public LYue/ۥ۟ۡ۠۟;
.super Landroid/widget/CheckedTextView;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۡۥۨ;
.implements LYue/ۥۢۡۥۧ;
.implements LYue/ۥ۠۠ۥۨ;
.implements LYue/ۥۢۡۦ۟;


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۟ۡ۠۠;

.field public final ۥ۟۟۠ۤ:LYue/ۥ۟ۡ۟۟;

.field public final ۥ۟۟۠ۥ:LYue/ۥۣ۟ۡۧ;

.field public ۥ۟۟۠ۦ:LYue/ۥ۟ۡۡۧ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, LYue/ۥ۟ۡ۠۟;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۥۣ:I

    invoke-direct {p0, p1, p2, v0}, LYue/ۥ۟ۡ۠۟;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥۢۡۡۢ;->ۥ(Landroid/view/View;Landroid/content/Context;)V

    .line 5
    new-instance p1, LYue/ۥۣ۟ۡۧ;

    invoke-direct {p1, p0}, LYue/ۥۣ۟ۡۧ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۡۧ;

    .line 6
    invoke-virtual {p1, p2, p3}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۧ(Landroid/util/AttributeSet;I)V

    .line 7
    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    .line 8
    new-instance p1, LYue/ۥ۟ۡ۟۟;

    invoke-direct {p1, p0}, LYue/ۥ۟ۡ۟۟;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۡ۟۟;

    .line 9
    invoke-virtual {p1, p2, p3}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟۟(Landroid/util/AttributeSet;I)V

    .line 10
    new-instance p1, LYue/ۥ۟ۡ۠۠;

    invoke-direct {p1, p0}, LYue/ۥ۟ۡ۠۠;-><init>(Landroid/widget/CheckedTextView;)V

    iput-object p1, p0, LYue/ۥ۟ۡ۠۟;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۠۠;

    .line 11
    invoke-virtual {p1, p2, p3}, LYue/ۥ۟ۡ۠۠;->ۥ۟۟۟(Landroid/util/AttributeSet;I)V

    .line 12
    invoke-direct {p0}, LYue/ۥ۟ۡ۠۟;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

    move-result-object p1

    .line 13
    invoke-virtual {p1, p2, p3}, LYue/ۥ۟ۡۡۧ;->ۥ۟۟(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۡۧ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۡۡۧ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۡۡۧ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۡۧ;

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۡۡۧ;

    return-object v0
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/CheckedTextView;->drawableStateChanged()V

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥ۟ۡ۟۟;->ۥ۟()V

    :cond_1
    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۠۠;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LYue/ۥ۟ۡ۠۠;->ۥ()V

    :cond_2
    return-void
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۢۡۡ۟;->ۥ۟۟ۡۤ(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object v0

    return-object v0
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

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCheckMarkTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۠۠;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡ۠۠;->ۥ۟()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCheckMarkTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۠۠;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡ۠۠;->ۥ۟۟()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۥ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public isEmojiCompatEnabled()Z
    .locals 1

    invoke-direct {p0}, LYue/ۥ۟ۡ۠۟;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟ۡۡۧ;->ۥ۟()Z

    move-result v0

    return v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1
    .param p1    # Landroid/view/inputmethod/EditorInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    invoke-static {v0, p1, p0}, LYue/ۥ۟ۡۡۨ;->ۥ(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, LYue/ۥ۟ۡ۠۟;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۡۧ;->ۥ۟۟۟(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟ۡ(I)V

    :cond_0
    return-void
.end method

.method public setCheckMarkDrawable(I)V
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۡ۠۟;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, LYue/ۥ۟ۡ۠۟;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۠۠;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, LYue/ۥ۟ۡ۠۠;->ۥ۟۟۟۟()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۡۧ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠۟()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۡۧ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠۟()V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0
    .param p1    # Landroid/view/ActionMode$Callback;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥۢۡۡ۟;->ۥ۟۟ۡۥ(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, LYue/ۥ۟ۡ۠۟;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۡۧ;->ۥ۟۟۟۟(Z)V

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

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟ۤ(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCheckMarkTintList(Landroid/content/res/ColorStateList;)V
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

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۠۠;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡ۠۠;->ۥ۟۟۟۠(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportCheckMarkTintMode(Landroid/graphics/PorterDuff$Mode;)V
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

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۠۠;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡ۠۠;->ۥ۟۟۟ۡ(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
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

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۦ(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
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

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۧ(Landroid/graphics/PorterDuff$Mode;)V

    iget-object p1, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, LYue/ۥ۟ۡ۠۟;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠۠(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
