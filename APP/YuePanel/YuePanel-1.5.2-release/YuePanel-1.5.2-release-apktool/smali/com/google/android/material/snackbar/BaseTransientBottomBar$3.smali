.class Lcom/google/android/material/snackbar/BaseTransientBottomBar$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۡۡۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/snackbar/BaseTransientBottomBar;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;Lcom/google/android/material/snackbar/ContentViewCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/material/snackbar/BaseTransientBottomBar;


# direct methods
.method public constructor <init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$3;->this$0:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;LYue/ۥۢۥۦ;)LYue/ۥۢۥۦ;
    .locals 1
    .param p2    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$3;->this$0:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    invoke-virtual {p2}, LYue/ۥۢۥۦ;->ۥ۟۟۠()I

    move-result v0

    invoke-static {p1, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->access$602(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)I

    iget-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$3;->this$0:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    invoke-virtual {p2}, LYue/ۥۢۥۦ;->ۥ۟۟۠۟()I

    move-result v0

    invoke-static {p1, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->access$702(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)I

    iget-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$3;->this$0:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    invoke-virtual {p2}, LYue/ۥۢۥۦ;->ۥ۟۟۠۠()I

    move-result v0

    invoke-static {p1, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->access$802(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)I

    iget-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$3;->this$0:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    invoke-static {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->access$900(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    return-object p2
.end method
