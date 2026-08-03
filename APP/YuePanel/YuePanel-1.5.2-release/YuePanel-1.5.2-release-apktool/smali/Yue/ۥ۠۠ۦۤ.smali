.class public final LYue/ۥ۠۠ۦۤ;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x13
.end annotation

.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠۠ۦۤ$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:Landroid/widget/TextView;

.field public final ۥ۟:LYue/ۥ۠۠ۦۤ$ۥ;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/inputmethod/InputConnection;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/view/inputmethod/EditorInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    new-instance v0, LYue/ۥ۠۠ۦۤ$ۥ;

    invoke-direct {v0}, LYue/ۥ۠۠ۦۤ$ۥ;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, LYue/ۥ۠۠ۦۤ;-><init>(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;LYue/ۥ۠۠ۦۤ$ۥ;)V

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;LYue/ۥ۠۠ۦۤ$ۥ;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/inputmethod/InputConnection;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/view/inputmethod/EditorInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۠۠ۦۤ$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, v0}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 3
    iput-object p1, p0, LYue/ۥ۠۠ۦۤ;->ۥ:Landroid/widget/TextView;

    .line 4
    iput-object p4, p0, LYue/ۥ۠۠ۦۤ;->ۥ۟:LYue/ۥ۠۠ۦۤ$ۥ;

    .line 5
    invoke-virtual {p4, p3}, LYue/ۥ۠۠ۦۤ$ۥ;->ۥ۟(Landroid/view/inputmethod/EditorInfo;)V

    return-void
.end method


# virtual methods
.method public deleteSurroundingText(II)Z
    .locals 6

    iget-object v0, p0, LYue/ۥ۠۠ۦۤ;->ۥ۟:LYue/ۥ۠۠ۦۤ$ۥ;

    invoke-virtual {p0}, LYue/ۥ۠۠ۦۤ;->ۥ()Landroid/text/Editable;

    move-result-object v2

    const/4 v5, 0x0

    move-object v1, p0

    move v3, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠۠ۦۤ$ۥ;->ۥ(Landroid/view/inputmethod/InputConnection;Landroid/text/Editable;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public deleteSurroundingTextInCodePoints(II)Z
    .locals 6

    iget-object v0, p0, LYue/ۥ۠۠ۦۤ;->ۥ۟:LYue/ۥ۠۠ۦۤ$ۥ;

    invoke-virtual {p0}, LYue/ۥ۠۠ۦۤ;->ۥ()Landroid/text/Editable;

    move-result-object v2

    const/4 v5, 0x1

    move-object v1, p0

    move v3, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠۠ۦۤ$ۥ;->ۥ(Landroid/view/inputmethod/InputConnection;Landroid/text/Editable;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingTextInCodePoints(II)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final ۥ()Landroid/text/Editable;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۦۤ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method
