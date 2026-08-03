.class public final LYue/ۥۣۣ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۣ۟۟$ۥ;,
        LYue/ۥۣۣ۟۟$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ:I = 0x80
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟:I = 0x100
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟۟:I = 0x200
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟۟۟:I = 0x400
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:I = 0x800
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟۟۟۠:I = 0x1000
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۡ:I = 0x2000
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۢ:I = 0x4000

.field public static final ۥۣ۟۟۟:I = 0x8000

.field public static final ۥ۟۟۟ۤ:I = 0x10000

.field public static final ۥ۟۟۟ۥ:I = 0x20000

.field public static final ۥ۟۟۟ۦ:I = 0x40000

.field public static final ۥ۟۟۟ۧ:I = 0x80000

.field public static final ۥ۟۟۟ۨ:I = 0x100000

.field public static final ۥ۟۟۠:I = 0x200000

.field public static final ۥ۟۟۠۟:I = 0x400000

.field public static final ۥ۟۟۠۠:I = 0x800000

.field public static final ۥ۟۟۠ۡ:I = 0x1000000

.field public static final ۥ۟۟۠ۢ:I = 0x4000000

.field public static final ۥۣ۟۟۠:I = 0x0

.field public static final ۥ۟۟۠ۤ:I = 0x1

.field public static final ۥ۟۟۠ۥ:I = 0x2

.field public static final ۥ۟۟۠ۦ:I = 0x4

.field public static final ۥ۟۟۠ۧ:I = 0x8

.field public static final ۥ۟۟۠ۨ:I = 0x10

.field public static final ۥ۟۟ۡ:I = 0x20

.field public static final ۥ۟۟ۡ۟:I = 0x40

.field public static final ۥ۟۟ۡ۠:I = 0x80

.field public static final ۥ۟۟ۡۡ:I = 0x100

.field public static final ۥ۟۟ۡۢ:I = 0x200

.field public static final ۥۣ۟۟ۡ:I = 0x400

.field public static final ۥ۟۟ۡۤ:I = 0x800

.field public static final ۥ۟۟ۡۥ:I = 0x1000

.field public static final ۥ۟۟ۡۦ:I = -0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/view/accessibility/AccessibilityEvent;LYue/ۥ۟۟ۦۢ;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p1}, LYue/ۥ۟۟ۦۢ;->ۥ۟۟۟ۡ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityRecord;

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityEvent;->appendRecord(Landroid/view/accessibility/AccessibilityRecord;)V

    return-void
.end method

.method public static ۥ۟(Landroid/view/accessibility/AccessibilityEvent;)LYue/ۥ۟۟ۦۢ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, LYue/ۥ۟۟ۦۢ;

    invoke-direct {v0, p0}, LYue/ۥ۟۟ۦۢ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ۥ۟۟(Landroid/view/accessibility/AccessibilityEvent;)I
    .locals 0
    .param p0    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityEvent;->getAction()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟(Landroid/view/accessibility/AccessibilityEvent;)I
    .locals 0
    .param p0    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityEvent;->getContentChangeTypes()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟۟(Landroid/view/accessibility/AccessibilityEvent;)I
    .locals 0
    .param p0    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityEvent;->getMovementGranularity()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟۠(Landroid/view/accessibility/AccessibilityEvent;I)LYue/ۥ۟۟ۦۢ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, LYue/ۥ۟۟ۦۢ;

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityEvent;->getRecord(I)Landroid/view/accessibility/AccessibilityRecord;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥ۟۟ۦۢ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ۥ۟۟۟ۡ(Landroid/view/accessibility/AccessibilityEvent;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityEvent;->getRecordCount()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۢ(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2
    .param p0    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥۣۣ۟۟$ۥ;->ۥ(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۥۣ۟۟۟(Landroid/view/accessibility/AccessibilityEvent;Z)V
    .locals 2
    .param p0    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LYue/ۥۣۣ۟۟$ۥ;->ۥ۟(Landroid/view/accessibility/AccessibilityEvent;Z)V

    :cond_0
    return-void
.end method

.method public static ۥ۟۟۟ۤ(Landroid/view/accessibility/AccessibilityEvent;I)V
    .locals 0
    .param p0    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setAction(I)V

    return-void
.end method

.method public static ۥ۟۟۟ۥ(Landroid/view/accessibility/AccessibilityEvent;I)V
    .locals 0
    .param p0    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    return-void
.end method

.method public static ۥ۟۟۟ۦ(Landroid/view/accessibility/AccessibilityEvent;I)V
    .locals 0
    .param p0    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setMovementGranularity(I)V

    return-void
.end method
