.class public LYue/ۥ۟ۡ۟ۥ;
.super Landroid/widget/Button;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۡۥۧ;
.implements LYue/ۥ۟ۢۤ۟;
.implements LYue/ۥۢۡۦ۟;
.implements LYue/ۥ۠۠ۥۨ;


# instance fields
.field private mAppCompatEmojiTextHelper:LYue/ۥ۟ۡۡۧ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field private final mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

.field private final mTextHelper:LYue/ۥۣ۟ۡۧ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, LYue/ۥ۟ۡ۟ۥ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۤۦ:I

    invoke-direct {p0, p1, p2, v0}, LYue/ۥ۟ۡ۟ۥ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥۢۡۡۢ;->ۥ(Landroid/view/View;Landroid/content/Context;)V

    .line 5
    new-instance p1, LYue/ۥ۟ۡ۟۟;

    invoke-direct {p1, p0}, LYue/ۥ۟ۡ۟۟;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LYue/ۥ۟ۡ۟ۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    .line 6
    invoke-virtual {p1, p2, p3}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟۟(Landroid/util/AttributeSet;I)V

    .line 7
    new-instance p1, LYue/ۥۣ۟ۡۧ;

    invoke-direct {p1, p0}, LYue/ۥۣ۟ۡۧ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    .line 8
    invoke-virtual {p1, p2, p3}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۧ(Landroid/util/AttributeSet;I)V

    .line 9
    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    .line 10
    invoke-direct {p0}, LYue/ۥ۟ۡ۟ۥ;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

    move-result-object p1

    .line 11
    invoke-virtual {p1, p2, p3}, LYue/ۥ۟ۡۡۧ;->ۥ۟۟(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mAppCompatEmojiTextHelper:LYue/ۥ۟ۡۡۧ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۡۡۧ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۡۡۧ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mAppCompatEmojiTextHelper:LYue/ۥ۟ۡۡۧ;

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mAppCompatEmojiTextHelper:LYue/ۥ۟ۡۡۧ;

    return-object v0
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡ۟۟;->ۥ۟()V

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    :cond_1
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sget-boolean v0, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟۟()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sget-boolean v0, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟۠()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sget-boolean v0, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۡ()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sget-boolean v0, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۢ()[I

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0
.end method

.method public getAutoSizeTextType()I
    .locals 3
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    sget-boolean v0, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextType()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟()I

    move-result v0

    return v0

    :cond_2
    return v1
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

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟()Landroid/graphics/PorterDuff$Mode;

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

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۥ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public isEmojiCompatEnabled()Z
    .locals 1

    invoke-direct {p0}, LYue/ۥ۟ۡ۟ۥ;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟ۡۡۧ;->ۥ۟()Z

    move-result v0

    return v0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 6

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠(ZIIII)V

    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object p1, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz p1, :cond_0

    sget-boolean p2, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    if-nez p2, :cond_0

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟()V

    :cond_0
    return-void
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, LYue/ۥ۟ۡ۟ۥ;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۡۧ;->ۥ۟۟۟(Z)V

    return-void
.end method

.method public setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    sget-boolean v0, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3, p4}, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۠(IIII)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .locals 1
    .param p1    # [I
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    sget-boolean v0, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۤ([II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sget-boolean v0, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۥ(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟ۡ(I)V

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

    invoke-direct {p0}, LYue/ۥ۟ۡ۟ۥ;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۡۧ;->ۥ۟۟۟۟(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1
    .param p1    # [Landroid/text/InputFilter;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥ۟ۡ۟ۥ;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۡۧ;->ۥ([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportAllCaps(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۢ(Z)V

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

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟ۤ(Landroid/graphics/PorterDuff$Mode;)V

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

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۦ(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۧ(Landroid/graphics/PorterDuff$Mode;)V

    iget-object p1, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠۠(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public setTextSize(IF)V
    .locals 1

    sget-boolean v0, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡ۟ۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟ۡ۟(IF)V

    :cond_1
    :goto_0
    return-void
.end method
