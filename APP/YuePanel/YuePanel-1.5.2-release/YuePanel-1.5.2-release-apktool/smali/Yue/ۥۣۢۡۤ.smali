.class public LYue/ۥۣۢۡۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۢۡۤ$ۥ۟۟;,
        LYue/ۥۣۢۡۤ$ۥ۟;,
        LYue/ۥۣۢۡۤ$ۥ;
    }
.end annotation


# static fields
.field public static ۥ:LYue/ۥۣۢۡۤ$ۥ۟۟;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ()V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const/4 v0, 0x0

    sput-object v0, LYue/ۥۣۢۡۤ;->ۥ:LYue/ۥۣۢۡۤ$ۥ۟۟;

    return-void
.end method

.method public static ۥ۟(LYue/ۥۣۢۡۤ$ۥ۟۟;)V
    .locals 0
    .param p0    # LYue/ۥۣۢۡۤ$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sput-object p0, LYue/ۥۣۢۡۤ;->ۥ:LYue/ۥۣۢۡۤ$ۥ۟۟;

    return-void
.end method

.method public static ۥ۟۟(Landroid/service/quicksettings/TileService;LYue/ۥۡۤ۟ۧ;)V
    .locals 2
    .param p0    # Landroid/service/quicksettings/TileService;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۤ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_1

    sget-object v0, LYue/ۥۣۢۡۤ;->ۥ:LYue/ۥۣۢۡۤ$ۥ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LYue/ۥۡۤ۟ۧ;->ۥ۟۟۟۠()Landroid/app/PendingIntent;

    move-result-object p0

    invoke-interface {v0, p0}, LYue/ۥۣۢۡۤ$ۥ۟۟;->ۥ۟(Landroid/app/PendingIntent;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LYue/ۥۡۤ۟ۧ;->ۥ۟۟۟۠()Landroid/app/PendingIntent;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥۣۢۡۤ$ۥ۟;->ۥ(Landroid/service/quicksettings/TileService;Landroid/app/PendingIntent;)V

    goto :goto_0

    :cond_1
    sget-object v0, LYue/ۥۣۢۡۤ;->ۥ:LYue/ۥۣۢۡۤ$ۥ۟۟;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LYue/ۥۡۤ۟ۧ;->ۥ۟۟۟()Landroid/content/Intent;

    move-result-object p0

    invoke-interface {v0, p0}, LYue/ۥۣۢۡۤ$ۥ۟۟;->ۥ(Landroid/content/Intent;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, LYue/ۥۡۤ۟ۧ;->ۥ۟۟۟()Landroid/content/Intent;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥۣۢۡۤ$ۥ;->ۥ(Landroid/service/quicksettings/TileService;Landroid/content/Intent;)V

    :goto_0
    return-void
.end method
