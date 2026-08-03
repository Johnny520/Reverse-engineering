.class public abstract Lg/o;
.super Landroid/widget/Button;
.source "SourceFile"


# instance fields
.field public final a:Lg/n;

.field public final b:Lg/G;

.field public c:Lg/v;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-static {p1}, Lg/B0;->a(Landroid/content/Context;)V

    const v0, 0x7f0402cf

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lg/A0;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lg/n;

    invoke-direct {p1, p0}, Lg/n;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lg/o;->a:Lg/n;

    invoke-virtual {p1, p2, v0}, Lg/n;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Lg/G;

    invoke-direct {p1, p0}, Lg/G;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lg/o;->b:Lg/G;

    invoke-virtual {p1, p2, v0}, Lg/G;->d(Landroid/util/AttributeSet;I)V

    invoke-virtual {p1}, Lg/G;->b()V

    invoke-direct {p0}, Lg/o;->getEmojiTextViewHelper()Lg/v;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lg/v;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getEmojiTextViewHelper()Lg/v;
    .locals 1

    iget-object v0, p0, Lg/o;->c:Lg/v;

    if-nez v0, :cond_0

    new-instance v0, Lg/v;

    invoke-direct {v0, p0}, Lg/v;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lg/o;->c:Lg/v;

    :cond_0
    iget-object v0, p0, Lg/o;->c:Lg/v;

    return-object v0
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, Lg/o;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg/n;->a()V

    :cond_0
    iget-object v0, p0, Lg/o;->b:Lg/G;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lg/G;->b()V

    :cond_1
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .locals 1

    sget-boolean v0, Lg/Q0;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lg/o;->b:Lg/G;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lg/G;->i:Lg/P;

    iget v0, v0, Lg/P;->e:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    sget-boolean v0, Lg/Q0;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lg/o;->b:Lg/G;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lg/G;->i:Lg/P;

    iget v0, v0, Lg/P;->d:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    sget-boolean v0, Lg/Q0;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lg/o;->b:Lg/G;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lg/G;->i:Lg/P;

    iget v0, v0, Lg/P;->c:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .locals 1

    sget-boolean v0, Lg/Q0;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lg/o;->b:Lg/G;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lg/G;->i:Lg/P;

    iget-object v0, v0, Lg/P;->f:[I

    return-object v0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0
.end method

.method public getAutoSizeTextType()I
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    sget-boolean v0, Lg/Q0;->a:Z

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
    iget-object v0, p0, Lg/o;->b:Lg/G;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lg/G;->i:Lg/P;

    iget v0, v0, Lg/P;->a:I

    return v0

    :cond_2
    return v1
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 2

    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    instance-of v1, v0, LJ/r;

    if-eqz v1, :cond_0

    check-cast v0, LJ/r;

    iget-object v0, v0, LJ/r;->a:Landroid/view/ActionMode$Callback;

    :cond_0
    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lg/o;->a:Lg/n;

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

    iget-object v0, p0, Lg/o;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg/n;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lg/o;->b:Lg/G;

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

    iget-object v0, p0, Lg/o;->b:Lg/G;

    iget-object v0, v0, Lg/G;->h:Lg/C0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lg/C0;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
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
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    iget-object p1, p0, Lg/o;->b:Lg/G;

    if-eqz p1, :cond_0

    sget-boolean p2, Lg/Q0;->a:Z

    if-nez p2, :cond_0

    iget-object p1, p1, Lg/G;->i:Lg/P;

    invoke-virtual {p1}, Lg/P;->a()V

    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object p1, p0, Lg/o;->b:Lg/G;

    if-eqz p1, :cond_0

    sget-boolean p2, Lg/Q0;->a:Z

    if-nez p2, :cond_0

    iget-object p1, p1, Lg/G;->i:Lg/P;

    invoke-virtual {p1}, Lg/P;->f()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lg/P;->a()V

    :cond_0
    return-void
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, Lg/o;->getEmojiTextViewHelper()Lg/v;

    move-result-object v0

    iget-object v0, v0, Lg/v;->b:LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, LA0/p;

    invoke-virtual {v0, p1}, LA0/p;->Q(Z)V

    return-void
.end method

.method public final setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 1

    sget-boolean v0, Lg/Q0;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg/o;->b:Lg/G;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3, p4}, Lg/G;->g(IIII)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .locals 1

    sget-boolean v0, Lg/Q0;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg/o;->b:Lg/G;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Lg/G;->h([II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .locals 1

    sget-boolean v0, Lg/Q0;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg/o;->b:Lg/G;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lg/G;->i(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lg/o;->a:Lg/n;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg/n;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lg/o;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg/n;->f(I)V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-static {p1, p0}, LA0/p;->e0(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Lg/o;->getEmojiTextViewHelper()Lg/v;

    move-result-object v0

    iget-object v0, v0, Lg/v;->b:LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, LA0/p;

    invoke-virtual {v0, p1}, LA0/p;->R(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    invoke-direct {p0}, Lg/o;->getEmojiTextViewHelper()Lg/v;

    move-result-object v0

    iget-object v0, v0, Lg/v;->b:LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, LA0/p;

    invoke-virtual {v0, p1}, LA0/p;->w([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportAllCaps(Z)V
    .locals 1

    iget-object v0, p0, Lg/o;->b:Lg/G;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lg/G;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lg/o;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg/n;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lg/o;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg/n;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lg/o;->b:Lg/G;

    invoke-virtual {v0, p1}, Lg/G;->j(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v0}, Lg/G;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lg/o;->b:Lg/G;

    invoke-virtual {v0, p1}, Lg/G;->k(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0}, Lg/G;->b()V

    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Lg/o;->b:Lg/G;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lg/G;->e(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public final setTextSize(IF)V
    .locals 2

    sget-boolean v0, Lg/Q0;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lg/o;->b:Lg/G;

    if-eqz v1, :cond_1

    if-nez v0, :cond_1

    iget-object v0, v1, Lg/G;->i:Lg/P;

    invoke-virtual {v0}, Lg/P;->f()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p1, p2}, Lg/P;->g(IF)V

    :cond_1
    :goto_0
    return-void
.end method
