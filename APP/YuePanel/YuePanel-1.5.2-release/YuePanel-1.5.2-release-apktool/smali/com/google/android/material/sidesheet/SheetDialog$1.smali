.class Lcom/google/android/material/sidesheet/SheetDialog$1;
.super LYue/ۥۣ۟۟ۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/sidesheet/SheetDialog;->wrapInSheet(ILandroid/view/View;Landroid/view/ViewGroup$LayoutParams;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/material/sidesheet/SheetDialog;


# direct methods
.method public constructor <init>(Lcom/google/android/material/sidesheet/SheetDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/sidesheet/SheetDialog$1;->this$0:Lcom/google/android/material/sidesheet/SheetDialog;

    invoke-direct {p0}, LYue/ۥۣ۟۟ۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V
    .locals 0
    .param p2    # LYue/ۥ۟۟ۥۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V

    iget-object p1, p0, Lcom/google/android/material/sidesheet/SheetDialog$1;->this$0:Lcom/google/android/material/sidesheet/SheetDialog;

    iget-boolean p1, p1, Lcom/google/android/material/sidesheet/SheetDialog;->cancelable:Z

    if-eqz p1, :cond_0

    const/high16 p1, 0x100000

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ(I)V

    const/4 p1, 0x1

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠۟ۥ(Z)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠۟ۥ(Z)V

    :goto_0
    return-void
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 2

    const/high16 v0, 0x100000

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/sidesheet/SheetDialog$1;->this$0:Lcom/google/android/material/sidesheet/SheetDialog;

    iget-boolean v1, v0, Lcom/google/android/material/sidesheet/SheetDialog;->cancelable:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/material/sidesheet/SheetDialog;->cancel()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, LYue/ۥۣ۟۟ۢ;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
