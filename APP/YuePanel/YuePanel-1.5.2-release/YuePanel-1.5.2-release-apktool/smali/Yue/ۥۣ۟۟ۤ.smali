.class public final LYue/ۥۣ۟۟ۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۟۟ۤ$ۥ۟۟;,
        LYue/ۥۣ۟۟ۤ$ۥ;,
        LYue/ۥۣ۟۟ۤ$ۥ۟۟۟۠;,
        LYue/ۥۣ۟۟ۤ$ۥ۟۟۟۟;,
        LYue/ۥۣ۟۟ۤ$ۥ۟۟۟;,
        LYue/ۥۣ۟۟ۤ$ۥ۟;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/view/accessibility/AccessibilityManager;LYue/ۥۣ۟۟ۤ$ۥ;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    new-instance v0, LYue/ۥۣ۟۟ۤ$ۥ۟۟;

    invoke-direct {v0, p1}, LYue/ۥۣ۟۟ۤ$ۥ۟۟;-><init>(LYue/ۥۣ۟۟ۤ$ۥ;)V

    invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟(Landroid/view/accessibility/AccessibilityManager;LYue/ۥۣ۟۟ۤ$ۥ۟۟۟۟;)Z
    .locals 1
    .param p0    # Landroid/view/accessibility/AccessibilityManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۟۟ۤ$ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    new-instance v0, LYue/ۥۣ۟۟ۤ$ۥ۟۟۟۠;

    invoke-direct {v0, p1}, LYue/ۥۣ۟۟ۤ$ۥ۟۟۟۠;-><init>(LYue/ۥۣ۟۟ۤ$ۥ۟۟۟۟;)V

    invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟(Landroid/view/accessibility/AccessibilityManager;I)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/accessibility/AccessibilityManager;",
            "I)",
            "Ljava/util/List<",
            "Landroid/accessibilityservice/AccessibilityServiceInfo;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟(Landroid/view/accessibility/AccessibilityManager;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/accessibility/AccessibilityManager;",
            ")",
            "Ljava/util/List<",
            "Landroid/accessibilityservice/AccessibilityServiceInfo;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityManager;->getInstalledAccessibilityServiceList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۟(Landroid/view/accessibility/AccessibilityManager;)Z
    .locals 2
    .param p0    # Landroid/view/accessibility/AccessibilityManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥۣ۟۟ۤ$ۥ۟۟۟;->ۥ(Landroid/view/accessibility/AccessibilityManager;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۥ۟۟۟۠(Landroid/view/accessibility/AccessibilityManager;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۡ(Landroid/view/accessibility/AccessibilityManager;LYue/ۥۣ۟۟ۤ$ۥ;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    new-instance v0, LYue/ۥۣ۟۟ۤ$ۥ۟۟;

    invoke-direct {v0, p1}, LYue/ۥۣ۟۟ۤ$ۥ۟۟;-><init>(LYue/ۥۣ۟۟ۤ$ۥ;)V

    invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۢ(Landroid/view/accessibility/AccessibilityManager;LYue/ۥۣ۟۟ۤ$ۥ۟۟۟۟;)Z
    .locals 1
    .param p0    # Landroid/view/accessibility/AccessibilityManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۟۟ۤ$ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    new-instance v0, LYue/ۥۣ۟۟ۤ$ۥ۟۟۟۠;

    invoke-direct {v0, p1}, LYue/ۥۣ۟۟ۤ$ۥ۟۟۟۠;-><init>(LYue/ۥۣ۟۟ۤ$ۥ۟۟۟۟;)V

    invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    move-result p0

    return p0
.end method
