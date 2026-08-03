.class public LYue/ۥ۟ۡۢۤ;
.super Landroid/widget/MultiAutoCompleteTextView;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۡۥۧ;
.implements LYue/ۥ۠۠ۥۨ;
.implements LYue/ۥۢۡۦ۟;


# static fields
.field public static final ۥ۟۟۠ۦ:[I


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۟ۡ۟۟;

.field public final ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۧ;

.field public final ۥ۟۟۠ۥ:LYue/ۥ۟ۡۡۦ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0x1010176

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۦ:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, LYue/ۥ۟ۡۢۤ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۢۦ:I

    invoke-direct {p0, p1, p2, v0}, LYue/ۥ۟ۡۢۤ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
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

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/MultiAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥۢۡۡۢ;->ۥ(Landroid/view/View;Landroid/content/Context;)V

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۦ:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۥ(Landroid/content/Context;Landroid/util/AttributeSet;[III)LYue/ۥۢۡۥۦ;

    move-result-object p1

    .line 6
    invoke-virtual {p1, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {p1, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟ۢ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    :cond_0
    invoke-virtual {p1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۧ()V

    .line 9
    new-instance p1, LYue/ۥ۟ۡ۟۟;

    invoke-direct {p1, p0}, LYue/ۥ۟ۡ۟۟;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LYue/ۥ۟ۡۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۟۟;

    .line 10
    invoke-virtual {p1, p2, p3}, LYue/ۥ۟ۡ۟۟;->ۥ۟۟۟۟(Landroid/util/AttributeSet;I)V

    .line 11
    new-instance p1, LYue/ۥۣ۟ۡۧ;

    invoke-direct {p1, p0}, LYue/ۥۣ۟ۡۧ;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۧ;

    .line 12
    invoke-virtual {p1, p2, p3}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۧ(Landroid/util/AttributeSet;I)V

    .line 13
    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    .line 14
    new-instance p1, LYue/ۥ۟ۡۡۦ;

    invoke-direct {p1, p0}, LYue/ۥ۟ۡۡۦ;-><init>(Landroid/widget/EditText;)V

    iput-object p1, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۡۡۦ;

    .line 15
    invoke-virtual {p1, p2, p3}, LYue/ۥ۟ۡۡۦ;->ۥ۟۟۟(Landroid/util/AttributeSet;I)V

    .line 16
    invoke-virtual {p0, p1}, LYue/ۥ۟ۡۢۤ;->ۥ(LYue/ۥ۟ۡۡۦ;)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟ۡ۟۟;->ۥ۟()V

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

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

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۧ;

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

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۥ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public isEmojiCompatEnabled()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۡۡۦ;

    invoke-virtual {v0}, LYue/ۥ۟ۡۡۦ;->ۥ۟۟()Z

    move-result v0

    return v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    invoke-super {p0, p1}, Landroid/view/View;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    invoke-static {v0, p1, p0}, LYue/ۥ۟ۡۡۨ;->ۥ(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۡۡۦ;

    invoke-virtual {v1, v0, p1}, LYue/ۥ۟ۡۡۦ;->ۥ۟۟۟۟(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۟۟;

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

    iget-object p1, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۧ;

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

    iget-object p1, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۧ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠۟()V

    :cond_0
    return-void
.end method

.method public setDropDownBackgroundResource(I)V
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۡۡۦ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۡۦ;->ۥ۟۟۟۠(Z)V

    return-void
.end method

.method public setKeyListener(Landroid/text/method/KeyListener;)V
    .locals 1
    .param p1    # Landroid/text/method/KeyListener;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۡۡۦ;

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

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۡ۟۟;

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

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۦ(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۧ;

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

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۧ(Landroid/graphics/PorterDuff$Mode;)V

    iget-object p1, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۧ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, LYue/ۥ۟ۡۢۤ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۡۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠۠(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public ۥ(LYue/ۥ۟ۡۡۦ;)V
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
