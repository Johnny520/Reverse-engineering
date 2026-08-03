.class public final LYue/ۥۡ۠ۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡ۠ۦ$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/view/Menu;Z)V
    .locals 2
    .param p0    # Landroid/view/Menu;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    instance-of v0, p0, LYue/ۥۢ۠ۥۡ;

    if-eqz v0, :cond_0

    check-cast p0, LYue/ۥۢ۠ۥۡ;

    invoke-interface {p0, p1}, LYue/ۥۢ۠ۥۡ;->setGroupDividerEnabled(Z)V

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1}, LYue/ۥۡ۠ۦ$ۥ;->ۥ(Landroid/view/Menu;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۥ۟(Landroid/view/MenuItem;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-interface {p0, p1}, Landroid/view/MenuItem;->setShowAsAction(I)V

    return-void
.end method
