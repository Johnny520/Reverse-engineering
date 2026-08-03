.class public final LYue/ۥۡۤ۠ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۤ۠ۡ$ۥ;,
        LYue/ۥۡۤ۠ۡ$ۥ۟۟;,
        LYue/ۥۡۤ۠ۡ$ۥ۟;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/content/pm/PermissionInfo;)I
    .locals 2
    .param p0    # Landroid/content/pm/PermissionInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥۡۤ۠ۡ$ۥ;->ۥ(Landroid/content/pm/PermissionInfo;)I

    move-result p0

    return p0

    :cond_0
    iget p0, p0, Landroid/content/pm/PermissionInfo;->protectionLevel:I

    and-int/lit8 p0, p0, 0xf

    return p0
.end method

.method public static ۥ۟(Landroid/content/pm/PermissionInfo;)I
    .locals 2
    .param p0    # Landroid/content/pm/PermissionInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥۡۤ۠ۡ$ۥ;->ۥ۟(Landroid/content/pm/PermissionInfo;)I

    move-result p0

    return p0

    :cond_0
    iget p0, p0, Landroid/content/pm/PermissionInfo;->protectionLevel:I

    and-int/lit8 p0, p0, -0x10

    return p0
.end method
