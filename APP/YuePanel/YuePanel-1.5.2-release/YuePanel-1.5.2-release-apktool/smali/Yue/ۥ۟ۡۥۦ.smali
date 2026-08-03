.class public final LYue/ۥ۟ۡۥۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۡۥۦ$ۥ;,
        LYue/ۥ۟ۡۥۦ$ۥ۟;
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

.method public static ۥ(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)I
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    invoke-static {p0}, LYue/ۥ۟ۡۥۦ$ۥ۟;->ۥ۟۟(Landroid/content/Context;)Landroid/app/AppOpsManager;

    move-result-object v0

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-static {v0, p2, v1, p3}, LYue/ۥ۟ۡۥۦ$ۥ۟;->ۥ(Landroid/app/AppOpsManager;Ljava/lang/String;ILjava/lang/String;)I

    move-result p3

    if-eqz p3, :cond_0

    return p3

    :cond_0
    invoke-static {p0}, LYue/ۥ۟ۡۥۦ$ۥ۟;->ۥ۟(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p2, p1, p0}, LYue/ۥ۟ۡۥۦ$ۥ۟;->ۥ(Landroid/app/AppOpsManager;Ljava/lang/String;ILjava/lang/String;)I

    move-result p0

    return p0

    :cond_1
    invoke-static {p0, p2, p3}, LYue/ۥ۟ۡۥۦ;->ۥ۟۟۟۟(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ۥ۟(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)I
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "appops"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AppOpsManager;

    invoke-virtual {p0, p1, p2, p3}, Landroid/app/AppOpsManager;->noteOp(Ljava/lang/String;ILjava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)I
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "appops"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AppOpsManager;

    invoke-virtual {p0, p1, p2, p3}, Landroid/app/AppOpsManager;->noteOpNoThrow(Ljava/lang/String;ILjava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-class v0, Landroid/app/AppOpsManager;

    invoke-static {p0, v0}, LYue/ۥ۟ۡۥۦ$ۥ;->ۥ(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AppOpsManager;

    invoke-static {p0, p1, p2}, LYue/ۥ۟ۡۥۦ$ۥ;->ۥ۟(Landroid/app/AppOpsManager;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟۟(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-class v0, Landroid/app/AppOpsManager;

    invoke-static {p0, v0}, LYue/ۥ۟ۡۥۦ$ۥ;->ۥ(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AppOpsManager;

    invoke-static {p0, p1, p2}, LYue/ۥ۟ۡۥۦ$ۥ;->ۥ۟۟(Landroid/app/AppOpsManager;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟۠(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {p0}, LYue/ۥ۟ۡۥۦ$ۥ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
