.class Lcom/google/android/material/timepicker/ClickActionDelegate;
.super LYue/ۥۣ۟۟ۢ;
.source "SourceFile"


# instance fields
.field private final clickAction:LYue/ۥ۟۟ۥۧ$ۥ;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2

    invoke-direct {p0}, LYue/ۥۣ۟۟ۢ;-><init>()V

    new-instance v0, LYue/ۥ۟۟ۥۧ$ۥ;

    const/16 v1, 0x10

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LYue/ۥ۟۟ۥۧ$ۥ;-><init>(ILjava/lang/CharSequence;)V

    iput-object v0, p0, Lcom/google/android/material/timepicker/ClickActionDelegate;->clickAction:LYue/ۥ۟۟ۥۧ$ۥ;

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V
    .locals 0

    invoke-super {p0, p1, p2}, LYue/ۥۣ۟۟ۢ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V

    iget-object p1, p0, Lcom/google/android/material/timepicker/ClickActionDelegate;->clickAction:LYue/ۥ۟۟ۥۧ$ۥ;

    invoke-virtual {p2, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟(LYue/ۥ۟۟ۥۧ$ۥ;)V

    return-void
.end method
