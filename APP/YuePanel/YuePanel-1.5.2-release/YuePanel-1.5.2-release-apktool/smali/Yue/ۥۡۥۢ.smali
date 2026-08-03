.class public final synthetic LYue/ۥۡۥۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/profileinstaller/ProfileInstallerInitializer;

.field public final synthetic ۥ۟۟۠ۤ:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroidx/profileinstaller/ProfileInstallerInitializer;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۥۢ;->ۥۣ۟۟۠:Landroidx/profileinstaller/ProfileInstallerInitializer;

    iput-object p2, p0, LYue/ۥۡۥۢ;->ۥ۟۟۠ۤ:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LYue/ۥۡۥۢ;->ۥۣ۟۟۠:Landroidx/profileinstaller/ProfileInstallerInitializer;

    iget-object v1, p0, LYue/ۥۡۥۢ;->ۥ۟۟۠ۤ:Landroid/content/Context;

    invoke-static {v0, v1}, Landroidx/profileinstaller/ProfileInstallerInitializer;->ۥ(Landroidx/profileinstaller/ProfileInstallerInitializer;Landroid/content/Context;)V

    return-void
.end method
