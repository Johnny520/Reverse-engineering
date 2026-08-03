.class Lcom/google/android/material/internal/CheckableImageButton$1;
.super LYue/ۥۣ۟۟ۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/internal/CheckableImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/material/internal/CheckableImageButton;


# direct methods
.method public constructor <init>(Lcom/google/android/material/internal/CheckableImageButton;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/internal/CheckableImageButton$1;->this$0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-direct {p0}, LYue/ۥۣ۟۟ۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    iget-object p1, p0, Lcom/google/android/material/internal/CheckableImageButton$1;->this$0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V
    .locals 0
    .param p2    # LYue/ۥ۟۟ۥۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V

    iget-object p1, p0, Lcom/google/android/material/internal/CheckableImageButton$1;->this$0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1}, Lcom/google/android/material/internal/CheckableImageButton;->isCheckable()Z

    move-result p1

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۨۧ(Z)V

    iget-object p1, p0, Lcom/google/android/material/internal/CheckableImageButton$1;->this$0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    move-result p1

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۨۨ(Z)V

    return-void
.end method
