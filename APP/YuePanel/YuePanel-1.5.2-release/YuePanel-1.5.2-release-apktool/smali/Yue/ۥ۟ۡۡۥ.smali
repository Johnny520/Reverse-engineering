.class public LYue/ۥ۟ۡۡۥ;
.super Landroid/widget/EditText;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۡۥۧ;
.implements LYue/ۥۣۣۡۢ;
.implements LYue/ۥ۠۠ۥۨ;
.implements LYue/ۥۢۡۦ۟;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۡۡۥ$ۥ;
    }
.end annotation


# instance fields
.field private final mAppCompatEmojiEditTextHelper:LYue/ۥ۟ۡۡۦ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field private final mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

.field private final mDefaultOnReceiveContentListener:LYue/ۥۢۡۡۡ;

.field private mSuperCaller:LYue/ۥ۟ۡۡۥ$ۥ;
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
    invoke-direct {p0, p1, v0}, LYue/ۥ۟ۡۡۥ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۠۟ۧ:I

    invoke-direct {p0, p1, p2, v0}, LYue/ۥ۟ۡۡۥ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥۢۡۡۢ;->ۥ(Landroid/view/View;Landroid/content/Context;)V

    .line 5
    new-instance p1, LYue/ۥ۟ۡ۟۟;

    invoke-direct {p1, p0}, LYue/ۥ۟ۡ۟۟;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LYue/ۥ۟ۡۡۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    .line 6
    invoke-virtual {p1, p2, p3}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟۟(Landroid/util/AttributeSet;I)V

    .line 7
    new-instance p1, LYue/ۥۣ۟ۡۧ;

    invoke-direct {p1, p0}, LYue/ۥۣ۟ۡۧ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, LYue/ۥ۟ۡۡۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    .line 8
    invoke-virtual {p1, p2, p3}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۧ(Landroid/util/AttributeSet;I)V

    .line 9
    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    .line 10
    new-instance p1, LYue/ۥۣ۟ۡۦ;

    invoke-direct {p1, p0}, LYue/ۥۣ۟ۡۦ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, LYue/ۥ۟ۡۡۥ;->mTextClassifierHelper:LYue/ۥۣ۟ۡۦ;

    .line 11
    new-instance p1, LYue/ۥۢۡۡۡ;

    invoke-direct {p1}, LYue/ۥۢۡۡۡ;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۡۡۥ;->mDefaultOnReceiveContentListener:LYue/ۥۢۡۡۡ;

    .line 12
    new-instance p1, LYue/ۥ۟ۡۡۦ;

    invoke-direct {p1, p0}, LYue/ۥ۟ۡۡۦ;-><init>(Landroid/widget/EditText;)V

    iput-object p1, p0, LYue/ۥ۟ۡۡۥ;->mAppCompatEmojiEditTextHelper:LYue/ۥ۟ۡۡۦ;

    .line 13
    invoke-virtual {p1, p2, p3}, LYue/ۥ۟ۡۡۦ;->ۥ۟۟۟(Landroid/util/AttributeSet;I)V

    .line 14
    invoke-virtual {p0, p1}, LYue/ۥ۟ۡۡۥ;->initEmojiKeyListener(LYue/ۥ۟ۡۡۦ;)V

    return-void
.end method

.method public static synthetic access$001(LYue/ۥ۟ۡۡۥ;)Landroid/view/textclassifier/TextClassifier;
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$101(LYue/ۥ۟ۡۡۥ;Landroid/view/textclassifier/TextClassifier;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method private getSuperCaller()LYue/ۥ۟ۡۡۥ$ۥ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build LYue/ۥۣۢ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mSuperCaller:LYue/ۥ۟ۡۡۥ$ۥ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۡۡۥ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۡۡۥ$ۥ;-><init>(LYue/ۥ۟ۡۡۥ;)V

    iput-object v0, p0, LYue/ۥ۟ۡۡۥ;->mSuperCaller:LYue/ۥ۟ۡۡۥ$ۥ;

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mSuperCaller:LYue/ۥ۟ۡۡۥ$ۥ;

    return-object v0
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡ۟۟;->ۥ۟()V

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    :cond_1
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

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۥ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getText()Landroid/text/Editable;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 3
    invoke-super {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    invoke-super {p0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getText()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .line 1
    invoke-virtual {p0}, LYue/ۥ۟ۡۡۥ;->getText()Landroid/text/Editable;

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

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mTextClassifierHelper:LYue/ۥۣ۟ۡۦ;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LYue/ۥۣ۟ۡۦ;->ۥ()Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    invoke-direct {p0}, LYue/ۥ۟ۡۡۥ;->getSuperCaller()LYue/ۥ۟ۡۡۥ$ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟ۡۡۥ$ۥ;->ۥ()Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public initEmojiKeyListener(LYue/ۥ۟ۡۡۦ;)V
    .locals 5

    invoke-virtual {p0}, Landroid/widget/TextView;->getKeyListener()Landroid/text/method/KeyListener;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥ۟ۡۡۦ;->ۥ۟(Landroid/text/method/KeyListener;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-super {p0}, Landroid/view/View;->isFocusable()Z

    move-result v1

    invoke-super {p0}, Landroid/view/View;->isClickable()Z

    move-result v2

    invoke-super {p0}, Landroid/view/View;->isLongClickable()Z

    move-result v3

    invoke-super {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v4

    invoke-virtual {p1, v0}, LYue/ۥ۟ۡۡۦ;->ۥ(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    invoke-super {p0, v4}, Landroid/widget/TextView;->setRawInputType(I)V

    invoke-super {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    invoke-super {p0, v2}, Landroid/view/View;->setClickable(Z)V

    invoke-super {p0, v3}, Landroid/view/View;->setLongClickable(Z)V

    :cond_1
    return-void
.end method

.method public isEmojiCompatEnabled()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mAppCompatEmojiEditTextHelper:LYue/ۥ۟ۡۡۦ;

    invoke-virtual {v0}, LYue/ۥ۟ۡۡۦ;->ۥ۟۟()Z

    move-result v0

    return v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3
    .param p1    # Landroid/view/inputmethod/EditorInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۟ۡۡۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v1, p0, v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۡ(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    invoke-static {v0, p1, p0}, LYue/ۥ۟ۡۡۨ;->ۥ(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    if-eqz v0, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-gt v1, v2, :cond_0

    invoke-static {p0}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۤۢ(Landroid/view/View;)[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p1, v1}, LYue/ۥ۠۠ۤۨ;->ۥۣ۟۟۟(Landroid/view/inputmethod/EditorInfo;[Ljava/lang/String;)V

    invoke-static {p0, v0, p1}, LYue/ۥ۠ۥۢۥ;->ۥ۟۟۟(Landroid/view/View;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    :cond_0
    iget-object v1, p0, LYue/ۥ۟ۡۡۥ;->mAppCompatEmojiEditTextHelper:LYue/ۥ۟ۡۡۦ;

    invoke-virtual {v1, v0, p1}, LYue/ۥ۟ۡۡۦ;->ۥ۟۟۟۟(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

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

.method public onDragEvent(Landroid/view/DragEvent;)Z
    .locals 1

    invoke-static {p0, p1}, LYue/ۥۣ۟ۡ۟;->ۥ(Landroid/view/View;Landroid/view/DragEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onDragEvent(Landroid/view/DragEvent;)Z

    move-result p1

    return p1
.end method

.method public onReceiveContent(LYue/ۥۣ۟ۧۡ;)LYue/ۥۣ۟ۧۡ;
    .locals 1
    .param p1    # LYue/ۥۣ۟ۧۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mDefaultOnReceiveContentListener:LYue/ۥۢۡۡۡ;

    invoke-virtual {v0, p0, p1}, LYue/ۥۢۡۡۡ;->ۥ(Landroid/view/View;LYue/ۥۣ۟ۧۡ;)LYue/ۥۣ۟ۧۡ;

    move-result-object p1

    return-object p1
.end method

.method public onTextContextMenuItem(I)Z
    .locals 1

    invoke-static {p0, p1}, LYue/ۥۣ۟ۡ۟;->ۥ۟(Landroid/widget/TextView;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTextContextMenuItem(I)Z

    move-result p1

    return p1
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object p1, p0, LYue/ۥ۟ۡۡۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    iget-object p1, p0, LYue/ۥ۟ۡۡۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mAppCompatEmojiEditTextHelper:LYue/ۥ۟ۡۡۦ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۡۦ;->ۥ۟۟۟۠(Z)V

    return-void
.end method

.method public setKeyListener(Landroid/text/method/KeyListener;)V
    .locals 1
    .param p1    # Landroid/text/method/KeyListener;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mAppCompatEmojiEditTextHelper:LYue/ۥ۟ۡۡۦ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۡۦ;->ۥ(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

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

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mBackgroundTintHelper:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۦ(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, LYue/ۥ۟ۡۡۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۧ(Landroid/graphics/PorterDuff$Mode;)V

    iget-object p1, p0, LYue/ۥ۟ۡۡۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mTextHelper:LYue/ۥۣ۟ۡۧ;

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

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ;->mTextClassifierHelper:LYue/ۥۣ۟ۡۦ;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۦ;->ۥ۟(Landroid/view/textclassifier/TextClassifier;)V

    return-void

    :cond_1
    :goto_0
    invoke-direct {p0}, LYue/ۥ۟ۡۡۥ;->getSuperCaller()LYue/ۥ۟ۡۡۥ$ۥ;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۡۥ$ۥ;->ۥ۟(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method
