.class public final LYue/ۥۣ۠ۧۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠ۧۢ$ۥ;,
        LYue/ۥۣ۠ۧۢ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ:I = 0x0

.field public static final ۥ۟:I = 0x1

.field public static final ۥ۟۟:I = 0x2

.field public static final ۥ۟۟۟:I = 0x3


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/content/Context;)I
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۟۠ۧۦ;
    .end annotation

    .annotation build LYue/ۥۣۡۤۡ;
        markerClass = {
            LYue/ۥۣۣ۟ۡ$ۥ۟;
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥۣ۠ۧۢ$ۥ;->ۥ(Landroid/content/Context;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۥ۟(Landroid/content/Context;I)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۟۠ۧۦ;
    .end annotation

    .annotation build LYue/ۥۣۡۤۡ;
        markerClass = {
            LYue/ۥۣۣ۟ۡ$ۥ۟;
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LYue/ۥۣ۠ۧۢ$ۥ;->ۥ۟۟(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
