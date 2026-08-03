.class public final LYue/ۥۣۡۧۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/view/ScaleGestureDetector;)Z
    .locals 0
    .param p0    # Landroid/view/ScaleGestureDetector;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/view/ScaleGestureDetector;->isQuickScaleEnabled()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    check-cast p0, Landroid/view/ScaleGestureDetector;

    invoke-static {p0}, LYue/ۥۣۡۧۤ;->ۥ(Landroid/view/ScaleGestureDetector;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟(Landroid/view/ScaleGestureDetector;Z)V
    .locals 0
    .param p0    # Landroid/view/ScaleGestureDetector;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/view/ScaleGestureDetector;->setQuickScaleEnabled(Z)V

    return-void
.end method

.method public static ۥ۟۟۟(Ljava/lang/Object;Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    check-cast p0, Landroid/view/ScaleGestureDetector;

    invoke-static {p0, p1}, LYue/ۥۣۡۧۤ;->ۥ۟۟(Landroid/view/ScaleGestureDetector;Z)V

    return-void
.end method
