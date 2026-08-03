.class public Lg/K;
.super Landroid/widget/TextView;
.source "SourceFile"


# instance fields
.field public final a:Lg/n;

.field public final b:Lg/G;

.field public final c:LA/c;

.field public d:Lg/v;

.field public e:Z

.field public f:LD/d;

.field public g:Ljava/util/concurrent/Future;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010084

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lg/K;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 2
    invoke-static {p1}, Lg/B0;->a(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lg/K;->e:Z

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lg/K;->f:LD/d;

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lg/A0;->a(Landroid/view/View;Landroid/content/Context;)V

    .line 6
    new-instance p1, Lg/n;

    invoke-direct {p1, p0}, Lg/n;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lg/K;->a:Lg/n;

    .line 7
    invoke-virtual {p1, p2, p3}, Lg/n;->d(Landroid/util/AttributeSet;I)V

    .line 8
    new-instance p1, Lg/G;

    invoke-direct {p1, p0}, Lg/G;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lg/K;->b:Lg/G;

    .line 9
    invoke-virtual {p1, p2, p3}, Lg/G;->d(Landroid/util/AttributeSet;I)V

    .line 10
    invoke-virtual {p1}, Lg/G;->b()V

    .line 11
    new-instance p1, LA/c;

    const/16 v0, 0x9

    .line 12
    invoke-direct {p1, v0}, LA/c;-><init>(I)V

    .line 13
    iput-object p0, p1, LA/c;->b:Ljava/lang/Object;

    .line 14
    iput-object p1, p0, Lg/K;->c:LA/c;

    .line 15
    invoke-direct {p0}, Lg/K;->getEmojiTextViewHelper()Lg/v;

    move-result-object p1

    .line 16
    invoke-virtual {p1, p2, p3}, Lg/v;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic d(Lg/K;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    return-void
.end method

.method public static synthetic e(Lg/K;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setLastBaselineToBottomHeight(I)V

    return-void
.end method

.method public static synthetic f(Lg/K;IF)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setLineHeight(IF)V

    return-void
.end method

.method private getEmojiTextViewHelper()Lg/v;
    .locals 1

    iget-object v0, p0, Lg/K;->d:Lg/v;

    if-nez v0, :cond_0

    new-instance v0, Lg/v;

    invoke-direct {v0, p0}, Lg/v;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lg/K;->d:Lg/v;

    :cond_0
    iget-object v0, p0, Lg/K;->d:Lg/v;

    return-object v0
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/TextView;->drawableStateChanged()V

    iget-object v0, p0, Lg/K;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg/n;->a()V

    :cond_0
    iget-object v0, p0, Lg/K;->b:Lg/G;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lg/G;->b()V

    :cond_1
    return-void
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Lg/K;->g:Ljava/util/concurrent/Future;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Lg/K;->g:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LS/d;->i(Ljava/lang/Object;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_1

    throw v1

    :cond_1
    invoke-static {p0}, LA0/p;->y(Landroid/widget/TextView;)LB/d;

    throw v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .locals 1

    sget-boolean v0, Lg/Q0;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg/K;->getSuperCaller()Lg/H;

    move-result-object v0

    check-cast v0, LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, Lg/K;

    invoke-super {v0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lg/K;->b:Lg/G;

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

    invoke-virtual {p0}, Lg/K;->getSuperCaller()Lg/H;

    move-result-object v0

    check-cast v0, LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, Lg/K;

    invoke-super {v0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lg/K;->b:Lg/G;

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

    invoke-virtual {p0}, Lg/K;->getSuperCaller()Lg/H;

    move-result-object v0

    check-cast v0, LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, Lg/K;

    invoke-super {v0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lg/K;->b:Lg/G;

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

    invoke-virtual {p0}, Lg/K;->getSuperCaller()Lg/H;

    move-result-object v0

    check-cast v0, LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, Lg/K;

    invoke-super {v0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lg/K;->b:Lg/G;

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

    invoke-virtual {p0}, Lg/K;->getSuperCaller()Lg/H;

    move-result-object v0

    check-cast v0, LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, Lg/K;

    invoke-super {v0}, Landroid/widget/TextView;->getAutoSizeTextType()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Lg/K;->b:Lg/G;

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

.method public getFirstBaselineToTopHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getLastBaselineToBottomHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    add-int/2addr v0, v1

    return v0
.end method

.method public getSuperCaller()Lg/H;
    .locals 2

    iget-object v0, p0, Lg/K;->f:LD/d;

    if-nez v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    new-instance v0, Lg/J;

    invoke-direct {v0, p0}, Lg/J;-><init>(Lg/K;)V

    iput-object v0, p0, Lg/K;->f:LD/d;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    new-instance v0, Lg/I;

    invoke-direct {v0, p0}, Lg/I;-><init>(Lg/K;)V

    iput-object v0, p0, Lg/K;->f:LD/d;

    goto :goto_0

    :cond_1
    new-instance v0, LD/d;

    const/16 v1, 0x13

    invoke-direct {v0, v1, p0}, LD/d;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lg/K;->f:LD/d;

    :cond_2
    :goto_0
    iget-object v0, p0, Lg/K;->f:LD/d;

    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lg/K;->a:Lg/n;

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

    iget-object v0, p0, Lg/K;->a:Lg/n;

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

    iget-object v0, p0, Lg/K;->b:Lg/G;

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

    iget-object v0, p0, Lg/K;->b:Lg/G;

    iget-object v0, v0, Lg/G;->h:Lg/C0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lg/C0;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Lg/K;->g()V

    invoke-super {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTextClassifier()Landroid/view/textclassifier/TextClassifier;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lg/K;->c:LA/c;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, LA/c;->c:Ljava/lang/Object;

    check-cast v1, Landroid/view/textclassifier/TextClassifier;

    if-nez v1, :cond_1

    iget-object v0, v0, LA/c;->b:Ljava/lang/Object;

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lg/A;->a(Landroid/widget/TextView;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v1

    :cond_1
    return-object v1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lg/K;->getSuperCaller()Lg/H;

    move-result-object v0

    check-cast v0, LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, Lg/K;

    invoke-super {v0}, Landroid/widget/TextView;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public getTextMetricsParamsCompat()LB/d;
    .locals 1

    invoke-static {p0}, LA0/p;->y(Landroid/widget/TextView;)LB/d;

    move-result-object v0

    return-object v0
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    invoke-super {p0, p1}, Landroid/widget/TextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    iget-object v1, p0, Lg/K;->b:Lg/G;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v0, p1}, Lg/G;->f(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    invoke-static {v0, p1, p0}, Lf0/P;->L(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)V

    return-object v0
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    const/16 v1, 0x21

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->onCheckIsTextEditor()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0, p0}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/widget/TextView;->onLayout(ZIIII)V

    iget-object p1, p0, Lg/K;->b:Lg/G;

    if-eqz p1, :cond_0

    sget-boolean p2, Lg/Q0;->a:Z

    if-nez p2, :cond_0

    iget-object p1, p1, Lg/G;->i:Lg/P;

    invoke-virtual {p1}, Lg/P;->a()V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-virtual {p0}, Lg/K;->g()V

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object p1, p0, Lg/K;->b:Lg/G;

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

    invoke-direct {p0}, Lg/K;->getEmojiTextViewHelper()Lg/v;

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

    invoke-virtual {p0}, Lg/K;->getSuperCaller()Lg/H;

    move-result-object v0

    check-cast v0, LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, Lg/K;

    invoke-super {v0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg/K;->b:Lg/G;

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

    invoke-virtual {p0}, Lg/K;->getSuperCaller()Lg/H;

    move-result-object v0

    check-cast v0, LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, Lg/K;

    invoke-super {v0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg/K;->b:Lg/G;

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

    invoke-virtual {p0}, Lg/K;->getSuperCaller()Lg/H;

    move-result-object v0

    check-cast v0, LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, Lg/K;

    invoke-super {v0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg/K;->b:Lg/G;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lg/G;->i(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lg/K;->a:Lg/n;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg/n;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lg/K;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg/n;->f(I)V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lg/K;->b:Lg/G;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg/G;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lg/K;->b:Lg/G;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg/G;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V
    .locals 2

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 5
    invoke-static {v0, p1}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 6
    invoke-static {v0, p2}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p3, :cond_2

    .line 7
    invoke-static {v0, p3}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-eqz p4, :cond_3

    .line 8
    invoke-static {v0, p4}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 9
    :cond_3
    invoke-virtual {p0, p1, p2, p3, v1}, Lg/K;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 10
    iget-object p1, p0, Lg/K;->b:Lg/G;

    if-eqz p1, :cond_4

    .line 11
    invoke-virtual {p1}, Lg/G;->b()V

    :cond_4
    return-void
.end method

.method public final setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Lg/K;->b:Lg/G;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lg/G;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesWithIntrinsicBounds(IIII)V
    .locals 2

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 5
    invoke-static {v0, p1}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 6
    invoke-static {v0, p2}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p3, :cond_2

    .line 7
    invoke-static {v0, p3}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-eqz p4, :cond_3

    .line 8
    invoke-static {v0, p4}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 9
    :cond_3
    invoke-virtual {p0, p1, p2, p3, v1}, Lg/K;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 10
    iget-object p1, p0, Lg/K;->b:Lg/G;

    if-eqz p1, :cond_4

    .line 11
    invoke-virtual {p1}, Lg/G;->b()V

    :cond_4
    return-void
.end method

.method public final setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Lg/K;->b:Lg/G;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lg/G;->b()V

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

    invoke-direct {p0}, Lg/K;->getEmojiTextViewHelper()Lg/v;

    move-result-object v0

    iget-object v0, v0, Lg/v;->b:LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, LA0/p;

    invoke-virtual {v0, p1}, LA0/p;->R(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    invoke-direct {p0}, Lg/K;->getEmojiTextViewHelper()Lg/v;

    move-result-object v0

    iget-object v0, v0, Lg/v;->b:LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, LA0/p;

    invoke-virtual {v0, p1}, LA0/p;->w([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setFirstBaselineToTopHeight(I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lg/K;->getSuperCaller()Lg/H;

    move-result-object v0

    invoke-interface {v0, p1}, Lg/H;->d(I)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LA0/p;->S(Landroid/widget/TextView;I)V

    :goto_0
    return-void
.end method

.method public setLastBaselineToBottomHeight(I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lg/K;->getSuperCaller()Lg/H;

    move-result-object v0

    invoke-interface {v0, p1}, Lg/H;->v(I)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LA0/p;->U(Landroid/widget/TextView;I)V

    :goto_0
    return-void
.end method

.method public setLineHeight(I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LA0/p;->V(Landroid/widget/TextView;I)V

    return-void
.end method

.method public final setLineHeight(IF)V
    .locals 2

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lg/K;->getSuperCaller()Lg/H;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lg/H;->r(IF)V

    goto :goto_0

    :cond_0
    if-lt v0, v1, :cond_1

    .line 4
    invoke-static {p0, p1, p2}, LJ/q;->a(Landroid/widget/TextView;IF)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 6
    invoke-static {p1, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    .line 7
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {p0, p1}, LA0/p;->V(Landroid/widget/TextView;I)V

    :goto_0
    return-void
.end method

.method public setPrecomputedText(LB/e;)V
    .locals 2

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    throw v1

    :cond_0
    invoke-static {p0}, LA0/p;->y(Landroid/widget/TextView;)LB/d;

    throw v1
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lg/K;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg/n;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lg/K;->a:Lg/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg/n;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lg/K;->b:Lg/G;

    invoke-virtual {v0, p1}, Lg/G;->j(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v0}, Lg/G;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lg/K;->b:Lg/G;

    invoke-virtual {v0, p1}, Lg/G;->k(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0}, Lg/G;->b()V

    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Lg/K;->b:Lg/G;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lg/G;->e(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lg/K;->c:LA/c;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, v0, LA/c;->c:Ljava/lang/Object;

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lg/K;->getSuperCaller()Lg/H;

    move-result-object v0

    check-cast v0, LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, Lg/K;

    invoke-super {v0, p1}, Landroid/widget/TextView;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method public setTextFuture(Ljava/util/concurrent/Future;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "LB/e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lg/K;->g:Ljava/util/concurrent/Future;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setTextMetricsParamsCompat(LB/d;)V
    .locals 5

    iget-object v0, p1, LB/d;->b:Landroid/text/TextDirectionHeuristic;

    sget-object v1, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v3, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v3, :cond_1

    goto :goto_0

    :cond_1
    sget-object v4, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_2

    const/4 v2, 0x2

    goto :goto_0

    :cond_2
    sget-object v4, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_3

    const/4 v2, 0x3

    goto :goto_0

    :cond_3
    sget-object v4, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_4

    const/4 v2, 0x4

    goto :goto_0

    :cond_4
    sget-object v4, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_5

    const/4 v2, 0x5

    goto :goto_0

    :cond_5
    if-ne v0, v3, :cond_6

    const/4 v2, 0x6

    goto :goto_0

    :cond_6
    if-ne v0, v1, :cond_7

    const/4 v2, 0x7

    :cond_7
    :goto_0
    invoke-virtual {p0, v2}, Landroid/view/View;->setTextDirection(I)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    iget-object v1, p1, LB/d;->a:Landroid/text/TextPaint;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    iget v0, p1, LB/d;->c:I

    invoke-static {p0, v0}, LJ/n;->e(Landroid/widget/TextView;I)V

    iget p1, p1, LB/d;->d:I

    invoke-static {p0, p1}, LJ/n;->h(Landroid/widget/TextView;I)V

    return-void
.end method

.method public final setTextSize(IF)V
    .locals 2

    sget-boolean v0, Lg/Q0;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lg/K;->b:Lg/G;

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

.method public final setTypeface(Landroid/graphics/Typeface;I)V
    .locals 2

    iget-boolean v0, p0, Lg/K;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    if-lez p2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lv/g;->a:Lf0/P;

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Context cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lg/K;->e:Z

    if-eqz v0, :cond_3

    move-object p1, v0

    :cond_3
    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Lg/K;->e:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Lg/K;->e:Z

    throw p1
.end method
