.class public Lyyds/ᛲᲀᛱᛷ;
.super Landroid/widget/Button;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:Lyyds/ᛲᛲᛴᛱ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-static {p1}, Lyyds/ᲈᲇᛸᛶ;->ᛲᲈᲁ(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1, p0}, Lyyds/ᲁᛶᛲᲁ;->ᛲᲈᲁ(Landroid/content/Context;Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lyyds/ᛵᲇᛸᲇ;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Lyyds/ᛵᲇᛸᲇ;-><init>(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lyyds/ᛲᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 20
    .line 21
    invoke-virtual {p1, p2, p3}, Lyyds/ᛵᲇᛸᲇ;->ᛷᛲᲈᛱ(Landroid/util/AttributeSet;I)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lyyds/ᛷᛲᛶᲁ;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lyyds/ᛷᛲᛶᲁ;-><init>(Landroid/widget/TextView;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lyyds/ᛲᲀᛱᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 30
    .line 31
    invoke-virtual {p1, p2, p3}, Lyyds/ᛷᛲᛶᲁ;->ᲇᲇᲇᛱ(Landroid/util/AttributeSet;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ()V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lyyds/ᛲᲀᛱᛷ;->getEmojiTextViewHelper()Lyyds/ᛲᛲᛴᛱ;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0, p2, p3}, Lyyds/ᛲᛲᛴᛱ;->ᛲᲈᲁ(Landroid/util/AttributeSet;I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private getEmojiTextViewHelper()Lyyds/ᛲᛲᛴᛱ;
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲀᛱᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᛴᛱ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lyyds/ᛲᛲᛴᛱ;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lyyds/ᛲᛲᛴᛱ;-><init>(Landroid/widget/TextView;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᛲᲀᛱᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛲᛴᛱ;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lyyds/ᛵᲇᛸᲇ;->ᛲᲈᲁ()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getAutoSizeTextType()I
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextType()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x1

    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛵᲇᛸᲇ;->ᛱᲈᲁ()Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛵᲇᛸᲇ;->ᛲᛳᛶᲁ()Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛷᛲᛶᲁ;->ᲇᲈᛵᛷ()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛷᛲᛶᲁ;->ᛲᛴᛳᛲ()Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const-class p0, Landroid/widget/Button;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    const-class p0, Landroid/widget/Button;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object p0, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setAllCaps(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lyyds/ᛲᲀᛱᛷ;->getEmojiTextViewHelper()Lyyds/ᛲᛲᛴᛱ;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lyyds/ᛲᛲᛴᛱ;->ᛵᛸᛸᛷ(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛵᲇᛸᲇ;->ᛲᛲᲈᲈ()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lyyds/ᛵᲇᛸᲇ;->ᛱᛳᲇ(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyyds/ᛲᲀᛱᛷ;->getEmojiTextViewHelper()Lyyds/ᛲᛲᛴᛱ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lyyds/ᛲᛲᛴᛱ;->ᲀᛲᛳᲀ(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lyyds/ᛲᲀᛱᛷ;->getEmojiTextViewHelper()Lyyds/ᛲᛲᛴᛱ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lyyds/ᛲᛲᛴᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛱᛴ;

    .line 6
    .line 7
    iget-object v0, v0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lyyds/ᛲᛸᲈᲈ;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lyyds/ᛲᛸᲈᲈ;->ᲇᲇᲇᛱ([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public setSupportAllCaps(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛲᲈᲁ:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lyyds/ᛵᲇᛸᲇ;->ᛳᛸᛴᛶ(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲇᛸᲇ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lyyds/ᛵᲇᛸᲇ;->ᛶᲈᛴᲈ(Landroid/graphics/PorterDuff$Mode;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛷᛲᛶᲁ;->ᛱᲈᲁ(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛷᛲᛶᲁ;->ᛲᛳᛶᲁ(Landroid/graphics/PorterDuff$Mode;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛲᲀᛱᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᛶᲁ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lyyds/ᛷᛲᛶᲁ;->ᛶᛷᛲᲁ(Landroid/content/Context;I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setTextSize(IF)V
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
