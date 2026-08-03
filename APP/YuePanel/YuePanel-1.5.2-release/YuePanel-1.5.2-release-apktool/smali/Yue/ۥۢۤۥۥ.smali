.class public final LYue/ۥۢۤۥۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۤۥۥ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ:I = 0x0

.field public static final ۥ۟:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/view/ViewGroup;)I
    .locals 0
    .param p0    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutMode()I

    move-result p0

    return p0
.end method

.method public static ۥ۟(Landroid/view/ViewGroup;)I
    .locals 0
    .param p0    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۢۤۥۥ$ۥ;->ۥ(Landroid/view/ViewGroup;)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟(Landroid/view/ViewGroup;)Z
    .locals 0
    .param p0    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۢۤۥۥ$ۥ;->ۥ۟(Landroid/view/ViewGroup;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->onRequestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟۟(Landroid/view/ViewGroup;I)V
    .locals 0
    .param p0    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setLayoutMode(I)V

    return-void
.end method

.method public static ۥ۟۟۟۠(Landroid/view/ViewGroup;Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setMotionEventSplittingEnabled(Z)V

    return-void
.end method

.method public static ۥ۟۟۟ۡ(Landroid/view/ViewGroup;Z)V
    .locals 0
    .param p0    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥۢۤۥۥ$ۥ;->ۥ۟۟(Landroid/view/ViewGroup;Z)V

    return-void
.end method
