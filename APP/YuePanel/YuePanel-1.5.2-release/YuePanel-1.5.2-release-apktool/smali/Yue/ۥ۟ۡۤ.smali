.class public LYue/ۥ۟ۡۤ;
.super Landroid/widget/TextView;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۡۥۧ;
.implements LYue/ۥۢۡۦ۟;
.implements LYue/ۥ۟ۢۤ۟;
.implements LYue/ۥ۠۠ۥۨ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۡۤ$ۥ;,
        LYue/ۥ۟ۡۤ$ۥ۟۟۟;,
        LYue/ۥ۟ۡۤ$ۥ۟۟;,
        LYue/ۥ۟ۡۤ$ۥ۟;
    }
.end annotation


# instance fields
.field private final mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

.field private mEmojiTextViewHelper:LYue/ۥ۟ۡۡۧ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field private mIsSetTypefaceProcessing:Z

.field private mPrecomputedTextFuture:Ljava/util/concurrent/Future;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "LYue/\u06e5\u06e1\u06e4\u06e6\u06df;",
            ">;"
        }
    .end annotation
.end field

.field private mSuperCaller:LYue/ۥ۟ۡۤ$ۥ;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field private final mTextClassifierHelper:LYue/ۥۣ۟ۡۦ;

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
    invoke-direct {p0, p1, v0}, LYue/ۥ۟ۡۤ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    const v0, 0x1010084

    .line 2
    invoke-direct {p0, p1, p2, v0}, LYue/ۥ۟ۡۤ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, LYue/ۥ۟ۡۤ;->mIsSetTypefaceProcessing:Z

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, LYue/ۥ۟ۡۤ;->mSuperCaller:LYue/ۥ۟ۡۤ$ۥ;

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥۢۡۡۢ;->ۥ(Landroid/view/View;Landroid/content/Context;)V

    .line 7
    new-instance p1, LYue/ۥ۟ۡ۟۟;

    invoke-direct {p1, p0}, LYue/ۥ۟ۡ۟۟;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LYue/ۥ۟ۡۤ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    .line 8
    invoke-virtual {p1, p2, p3}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟۟(Landroid/util/AttributeSet;I)V

    .line 9
    new-instance p1, LYue/ۥۣ۟ۡۧ;

    invoke-direct {p1, p0}, LYue/ۥۣ۟ۡۧ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    .line 10
    invoke-virtual {p1, p2, p3}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۧ(Landroid/util/AttributeSet;I)V

    .line 11
    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    .line 12
    new-instance p1, LYue/ۥۣ۟ۡۦ;

    invoke-direct {p1, p0}, LYue/ۥۣ۟ۡۦ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, LYue/ۥ۟ۡۤ;->mTextClassifierHelper:LYue/ۥۣ۟ۡۦ;

    .line 13
    invoke-direct {p0}, LYue/ۥ۟ۡۤ;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

    move-result-object p1

    .line 14
    invoke-virtual {p1, p2, p3}, LYue/ۥ۟ۡۡۧ;->ۥ۟۟(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic access$001(LYue/ۥ۟ۡۤ;)I
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    move-result p0

    return p0
.end method

.method public static synthetic access$1001(LYue/ۥ۟ۡۤ;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    return-void
.end method

.method public static synthetic access$101(LYue/ۥ۟ۡۤ;)I
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    move-result p0

    return p0
.end method

.method public static synthetic access$1101(LYue/ۥ۟ۡۤ;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setLastBaselineToBottomHeight(I)V

    return-void
.end method

.method public static synthetic access$1201(LYue/ۥ۟ۡۤ;IF)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setLineHeight(IF)V

    return-void
.end method

.method public static synthetic access$201(LYue/ۥ۟ۡۤ;)I
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result p0

    return p0
.end method

.method public static synthetic access$301(LYue/ۥ۟ۡۤ;)[I
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$401(LYue/ۥ۟ۡۤ;)I
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextType()I

    move-result p0

    return p0
.end method

.method public static synthetic access$501(LYue/ۥ۟ۡۤ;)Landroid/view/textclassifier/TextClassifier;
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$601(LYue/ۥ۟ۡۤ;IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    return-void
.end method

.method public static synthetic access$701(LYue/ۥ۟ۡۤ;[II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    return-void
.end method

.method public static synthetic access$801(LYue/ۥ۟ۡۤ;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    return-void
.end method

.method public static synthetic access$901(LYue/ۥ۟ۡۤ;Landroid/view/textclassifier/TextClassifier;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method private getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mEmojiTextViewHelper:LYue/ۥ۟ۡۡۧ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۡۡۧ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۡۡۧ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LYue/ۥ۟ۡۤ;->mEmojiTextViewHelper:LYue/ۥ۟ۡۡۧ;

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mEmojiTextViewHelper:LYue/ۥ۟ۡۡۧ;

    return-object v0
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/TextView;->drawableStateChanged()V

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡ۟۟;->ۥ۟()V

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۟ۡۤ$ۥ;->getAutoSizeMaxTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۟ۡۤ$ۥ;->getAutoSizeMinTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۟ۡۤ$ۥ;->getAutoSizeStepGranularity()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۟ۡۤ$ۥ;->getAutoSizeTextAvailableSizes()[I

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۟ۡۤ$ۥ;->getAutoSizeTextType()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

.method public getFirstBaselineToTopHeight()I
    .locals 1

    invoke-static {p0}, LYue/ۥۢۡۡ۟;->ۥۣ۟۟۟(Landroid/widget/TextView;)I

    move-result v0

    return v0
.end method

.method public getLastBaselineToBottomHeight()I
    .locals 1

    invoke-static {p0}, LYue/ۥۢۡۡ۟;->ۥ۟۟۟ۤ(Landroid/widget/TextView;)I

    move-result v0

    return v0
.end method

.method public getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۦۥۣ;
        api = 0x1a
    .end annotation

    .annotation build LYue/ۥۣۢ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mSuperCaller:LYue/ۥ۟ۡۤ$ۥ;

    if-nez v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    new-instance v0, LYue/ۥ۟ۡۤ$ۥ۟۟۟;

    invoke-direct {v0, p0}, LYue/ۥ۟ۡۤ$ۥ۟۟۟;-><init>(LYue/ۥ۟ۡۤ;)V

    iput-object v0, p0, LYue/ۥ۟ۡۤ;->mSuperCaller:LYue/ۥ۟ۡۤ$ۥ;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    new-instance v0, LYue/ۥ۟ۡۤ$ۥ۟۟;

    invoke-direct {v0, p0}, LYue/ۥ۟ۡۤ$ۥ۟۟;-><init>(LYue/ۥ۟ۡۤ;)V

    iput-object v0, p0, LYue/ۥ۟ۡۤ;->mSuperCaller:LYue/ۥ۟ۡۤ$ۥ;

    goto :goto_0

    :cond_1
    new-instance v0, LYue/ۥ۟ۡۤ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥ۟ۡۤ$ۥ۟;-><init>(LYue/ۥ۟ۡۤ;)V

    iput-object v0, p0, LYue/ۥ۟ۡۤ;->mSuperCaller:LYue/ۥ۟ۡۤ$ۥ;

    :cond_2
    :goto_0
    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mSuperCaller:LYue/ۥ۟ۡۤ$ۥ;

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

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۥ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->ۥ۟۟()V

    invoke-super {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTextClassifier()Landroid/view/textclassifier/TextClassifier;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        api = 0x1a
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_1

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextClassifierHelper:LYue/ۥۣ۟ۡۦ;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LYue/ۥۣ۟ۡۦ;->ۥ()Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۟ۡۤ$ۥ;->ۥ()Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public getTextMetricsParamsCompat()LYue/ۥۡۤۦ۟$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p0}, LYue/ۥۢۡۡ۟;->ۥ۟۟۠(Landroid/widget/TextView;)LYue/ۥۡۤۦ۟$ۥ۟;

    move-result-object v0

    return-object v0
.end method

.method public isEmojiCompatEnabled()Z
    .locals 1

    invoke-direct {p0}, LYue/ۥ۟ۡۤ;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟ۡۡۧ;->ۥ۟()Z

    move-result v0

    return v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    invoke-super {p0, p1}, Landroid/widget/TextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v1, p0, v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۡ(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    invoke-static {v0, p1, p0}, LYue/ۥ۟ۡۡۨ;->ۥ(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public onDetachedFromWindow()V
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

.method public onLayout(ZIIII)V
    .locals 6

    invoke-super/range {p0 .. p5}, Landroid/widget/TextView;->onLayout(ZIIII)V

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

.method public onMeasure(II)V
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->ۥ۟۟()V

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object p1, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz p1, :cond_0

    sget-boolean p2, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    if-nez p2, :cond_0

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟()V

    :cond_0
    return-void
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, LYue/ۥ۟ۡۤ;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

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

    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, LYue/ۥ۟ۡۤ$ۥ;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۟ۡۤ$ۥ;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۟ۡۤ$ۥ;->setAutoSizeTextTypeWithDefaults(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟ۡ(I)V

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

    iget-object p1, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    iget-object p1, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠۟()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V
    .locals 2

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 5
    invoke-static {v0, p1}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 6
    invoke-static {v0, p2}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p3, :cond_2

    .line 7
    invoke-static {v0, p3}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-eqz p4, :cond_3

    .line 8
    invoke-static {v0, p4}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 9
    :cond_3
    invoke-virtual {p0, p1, p2, p3, v1}, LYue/ۥ۟ۡۤ;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 10
    iget-object p1, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz p1, :cond_4

    .line 11
    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠۟()V

    :cond_4
    return-void
.end method

.method public setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
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

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠۟()V

    :cond_0
    return-void
.end method

.method public setCompoundDrawablesWithIntrinsicBounds(IIII)V
    .locals 2

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 5
    invoke-static {v0, p1}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 6
    invoke-static {v0, p2}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p3, :cond_2

    .line 7
    invoke-static {v0, p3}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-eqz p4, :cond_3

    .line 8
    invoke-static {v0, p4}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 9
    :cond_3
    invoke-virtual {p0, p1, p2, p3, v1}, LYue/ۥ۟ۡۤ;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 10
    iget-object p1, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz p1, :cond_4

    .line 11
    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠۟()V

    :cond_4
    return-void
.end method

.method public setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
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

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz p1, :cond_0

    .line 3
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

    invoke-direct {p0}, LYue/ۥ۟ۡۤ;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

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

    invoke-direct {p0}, LYue/ۥ۟ۡۤ;->getEmojiTextViewHelper()LYue/ۥ۟ۡۡۧ;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۡۧ;->ۥ([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setFirstBaselineToTopHeight(I)V
    .locals 2
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation

        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۟ۡۤ$ۥ;->ۥ۟۟۟(I)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥۢۡۡ۟;->ۥ۟۟۠ۨ(Landroid/widget/TextView;I)V

    :goto_0
    return-void
.end method

.method public setLastBaselineToBottomHeight(I)V
    .locals 2
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation

        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۟ۡۤ$ۥ;->ۥ۟۟(I)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥۢۡۡ۟;->ۥ۟۟ۡ(Landroid/widget/TextView;I)V

    :goto_0
    return-void
.end method

.method public setLineHeight(I)V
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation

        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, LYue/ۥۢۡۡ۟;->ۥ۟۟ۡ۟(Landroid/widget/TextView;I)V

    return-void
.end method

.method public setLineHeight(IF)V
    .locals 2
    .param p2    # F
        .annotation build LYue/ۥ۠ۢۢۧ;
            from = 0.0
        .end annotation
    .end param

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۟ۡۤ$ۥ;->ۥ۟۟۟۟(IF)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥۢۡۡ۟;->ۥ۟۟ۡ۠(Landroid/widget/TextView;IF)V

    :goto_0
    return-void
.end method

.method public setPrecomputedText(LYue/ۥۡۤۦ۟;)V
    .locals 0
    .param p1    # LYue/ۥۡۤۦ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥۢۡۡ۟;->ۥ۟۟ۡۡ(Landroid/widget/TextView;LYue/ۥۡۤۦ۟;)V

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

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۦ(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۧ(Landroid/graphics/PorterDuff$Mode;)V

    iget-object p1, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠۠(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V
    .locals 2
    .param p1    # Landroid/view/textclassifier/TextClassifier;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        api = 0x1a
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_1

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextClassifierHelper:LYue/ۥۣ۟ۡۦ;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۦ;->ۥ۟(Landroid/view/textclassifier/TextClassifier;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, LYue/ۥ۟ۡۤ;->getSuperCaller()LYue/ۥ۟ۡۤ$ۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۟ۡۤ$ۥ;->ۥ۟(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method public setTextFuture(Ljava/util/concurrent/Future;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/Future;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "LYue/\u06e5\u06e1\u06e4\u06e6\u06df;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۡۤ;->mPrecomputedTextFuture:Ljava/util/concurrent/Future;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setTextMetricsParamsCompat(LYue/ۥۡۤۦ۟$ۥ۟;)V
    .locals 0
    .param p1    # LYue/ۥۡۤۦ۟$ۥ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥۢۡۡ۟;->ۥۣ۟۟ۡ(Landroid/widget/TextView;LYue/ۥۡۤۦ۟$ۥ۟;)V

    return-void
.end method

.method public setTextSize(IF)V
    .locals 1

    sget-boolean v0, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟ۡ۟(IF)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;I)V
    .locals 2
    .param p1    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-boolean v0, p0, LYue/ۥ۟ۡۤ;->mIsSetTypefaceProcessing:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    if-lez p2, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, LYue/ۥۣۢۢۨ;->ۥ۟(Landroid/content/Context;Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    iput-boolean v1, p0, LYue/ۥ۟ۡۤ;->mIsSetTypefaceProcessing:Z

    if-eqz v0, :cond_2

    move-object p1, v0

    :cond_2
    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, LYue/ۥ۟ۡۤ;->mIsSetTypefaceProcessing:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, LYue/ۥ۟ۡۤ;->mIsSetTypefaceProcessing:Z

    throw p1
.end method

.method public final ۥ۟۟()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۡۤ;->mPrecomputedTextFuture:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, LYue/ۥ۟ۡۤ;->mPrecomputedTextFuture:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۡۤۦ۟;

    invoke-static {p0, v0}, LYue/ۥۢۡۡ۟;->ۥ۟۟ۡۡ(Landroid/widget/TextView;LYue/ۥۡۤۦ۟;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
