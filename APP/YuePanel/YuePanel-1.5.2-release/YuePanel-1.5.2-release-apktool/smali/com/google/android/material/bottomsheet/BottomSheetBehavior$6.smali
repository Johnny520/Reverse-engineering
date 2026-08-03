.class Lcom/google/android/material/bottomsheet/BottomSheetBehavior$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟۟ۦۤ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->createAccessibilityViewCommandForState(I)LYue/ۥ۟۟ۦۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

.field final synthetic val$state:I


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$6;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iput p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$6;->val$state:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public perform(Landroid/view/View;LYue/ۥ۟۟ۦۤ$ۥ;)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟۟ۦۤ$ۥ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$6;->this$0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$6;->val$state:I

    invoke-virtual {p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    const/4 p1, 0x1

    return p1
.end method
