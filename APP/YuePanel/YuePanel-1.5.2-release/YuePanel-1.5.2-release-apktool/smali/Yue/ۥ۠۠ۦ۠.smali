.class public final LYue/ۥ۠۠ۦ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠۠ۦ۠$ۥ۟;,
        LYue/ۥ۠۠ۦ۠$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۠۠ۦ۠$ۥ۟;

.field public ۥ۟:I

.field public ۥ۟۟:I


# direct methods
.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 1
    .param p1    # Landroid/widget/EditText;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, LYue/ۥ۠۠ۦ۠;-><init>(Landroid/widget/EditText;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;Z)V
    .locals 1
    .param p1    # Landroid/widget/EditText;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    .line 3
    iput v0, p0, LYue/ۥ۠۠ۦ۠;->ۥ۟:I

    const/4 v0, 0x0

    .line 4
    iput v0, p0, LYue/ۥ۠۠ۦ۠;->ۥ۟۟:I

    .line 5
    const-string v0, "editText cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    new-instance v0, LYue/ۥ۠۠ۦ۠$ۥ;

    invoke-direct {v0, p1, p2}, LYue/ۥ۠۠ۦ۠$ۥ;-><init>(Landroid/widget/EditText;Z)V

    iput-object v0, p0, LYue/ۥ۠۠ۦ۠;->ۥ:LYue/ۥ۠۠ۦ۠$ۥ۟;

    return-void
.end method


# virtual methods
.method public ۥ()I
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget v0, p0, LYue/ۥ۠۠ۦ۠;->ۥ۟۟:I

    return v0
.end method

.method public ۥ۟(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1
    .param p1    # Landroid/text/method/KeyListener;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠۠ۦ۠;->ۥ:LYue/ۥ۠۠ۦ۠$ۥ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۦ۠$ۥ۟;->ۥ(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۠۠ۦ۠;->ۥ۟:I

    return v0
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۦ۠;->ۥ:LYue/ۥ۠۠ۦ۠$ۥ۟;

    invoke-virtual {v0}, LYue/ۥ۠۠ۦ۠$ۥ۟;->ۥ۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟۟(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1
    .param p1    # Landroid/view/inputmethod/InputConnection;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Landroid/view/inputmethod/EditorInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LYue/ۥ۠۠ۦ۠;->ۥ:LYue/ۥ۠۠ۦ۠$ۥ۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠۠ۦ۠$ۥ۟;->ۥ۟۟(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟۠(I)V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iput p1, p0, LYue/ۥ۠۠ۦ۠;->ۥ۟۟:I

    iget-object v0, p0, LYue/ۥ۠۠ۦ۠;->ۥ:LYue/ۥ۠۠ۦ۠$ۥ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۦ۠$ۥ۟;->ۥ۟۟۟(I)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۦ۠;->ۥ:LYue/ۥ۠۠ۦ۠$ۥ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۦ۠$ۥ۟;->ۥ۟۟۟۟(Z)V

    return-void
.end method

.method public ۥ۟۟۟ۢ(I)V
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param

    const-string v0, "maxEmojiCount should be greater than 0"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۤ(ILjava/lang/String;)I

    iput p1, p0, LYue/ۥ۠۠ۦ۠;->ۥ۟:I

    iget-object v0, p0, LYue/ۥ۠۠ۦ۠;->ۥ:LYue/ۥ۠۠ۦ۠$ۥ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠۠ۦ۠$ۥ۟;->ۥ۟۟۟۠(I)V

    return-void
.end method
