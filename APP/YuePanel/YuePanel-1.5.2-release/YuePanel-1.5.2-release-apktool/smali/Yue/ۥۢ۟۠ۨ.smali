.class public final synthetic LYue/ۥۢ۟۠ۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ۥ:Lcom/google/android/material/sidesheet/SideSheetBehavior;

.field public final synthetic ۥ۟:Landroid/view/ViewGroup$MarginLayoutParams;

.field public final synthetic ۥ۟۟:I

.field public final synthetic ۥ۟۟۟:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;Landroid/view/ViewGroup$MarginLayoutParams;ILandroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢ۟۠ۨ;->ۥ:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iput-object p2, p0, LYue/ۥۢ۟۠ۨ;->ۥ۟:Landroid/view/ViewGroup$MarginLayoutParams;

    iput p3, p0, LYue/ۥۢ۟۠ۨ;->ۥ۟۟:I

    iput-object p4, p0, LYue/ۥۢ۟۠ۨ;->ۥ۟۟۟:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    iget-object v0, p0, LYue/ۥۢ۟۠ۨ;->ۥ:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v1, p0, LYue/ۥۢ۟۠ۨ;->ۥ۟:Landroid/view/ViewGroup$MarginLayoutParams;

    iget v2, p0, LYue/ۥۢ۟۠ۨ;->ۥ۟۟:I

    iget-object v3, p0, LYue/ۥۢ۟۠ۨ;->ۥ۟۟۟:Landroid/view/View;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->ۥ۟۟(Lcom/google/android/material/sidesheet/SideSheetBehavior;Landroid/view/ViewGroup$MarginLayoutParams;ILandroid/view/View;Landroid/animation/ValueAnimator;)V

    return-void
.end method
