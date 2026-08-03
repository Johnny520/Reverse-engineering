.class public LYue/ۥ۠۠ۦ۠$ۥ;
.super LYue/ۥ۠۠ۦ۠$ۥ۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x13
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠۠ۦ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroid/widget/EditText;

.field public final ۥ۟:LYue/ۥ۠۠ۧۢ;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Z)V
    .locals 1
    .param p1    # Landroid/widget/EditText;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥ۠۠ۦ۠$ۥ۟;-><init>()V

    iput-object p1, p0, LYue/ۥ۠۠ۦ۠$ۥ;->ۥ:Landroid/widget/EditText;

    new-instance v0, LYue/ۥ۠۠ۧۢ;

    invoke-direct {v0, p1, p2}, LYue/ۥ۠۠ۧۢ;-><init>(Landroid/widget/EditText;Z)V

    iput-object v0, p0, LYue/ۥ۠۠ۦ۠$ۥ;->ۥ۟:LYue/ۥ۠۠ۧۢ;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-static {}, LYue/ۥ۠۠ۦۡ;->getInstance()Landroid/text/Editable$Factory;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    return-void
.end method


# virtual methods
.method public ۥ(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1
    .param p1    # Landroid/text/method/KeyListener;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥ۠۠ۦۦ;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    if-eqz v0, :cond_2

    return-object p1

    :cond_2
    new-instance v0, LYue/ۥ۠۠ۦۦ;

    invoke-direct {v0, p1}, LYue/ۥ۠۠ۦۦ;-><init>(Landroid/text/method/KeyListener;)V

    return-object v0
.end method

.method public ۥ۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۦ۠$ۥ;->ۥ۟:LYue/ۥ۠۠ۧۢ;

    invoke-virtual {v0}, LYue/ۥ۠۠ۧۢ;->ۥ۟۟۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2
    .param p1    # Landroid/view/inputmethod/InputConnection;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/inputmethod/EditorInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥ۠۠ۦۤ;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, LYue/ۥ۠۠ۦۤ;

    iget-object v1, p0, LYue/ۥ۠۠ۦ۠$ۥ;->ۥ:Landroid/widget/EditText;

    invoke-direct {v0, v1, p1, p2}, LYue/ۥ۠۠ۦۤ;-><init>(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    return-object v0
.end method

.method public ۥ۟۟۟(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۦ۠$ۥ;->ۥ۟:LYue/ۥ۠۠ۧۢ;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۢ;->ۥ۟۟۟۠(I)V

    return-void
.end method

.method public ۥ۟۟۟۟(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۦ۠$ۥ;->ۥ۟:LYue/ۥ۠۠ۧۢ;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۢ;->ۥ۟۟۟ۡ(Z)V

    return-void
.end method

.method public ۥ۟۟۟۠(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۦ۠$ۥ;->ۥ۟:LYue/ۥ۠۠ۧۢ;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۧۢ;->ۥ۟۟۟ۢ(I)V

    return-void
.end method
