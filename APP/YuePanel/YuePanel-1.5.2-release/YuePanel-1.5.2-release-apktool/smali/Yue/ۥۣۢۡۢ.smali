.class public LYue/ۥۣۢۡۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public ۥ:LYue/ۥ۠ۥ۟ۨ;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation
.end field

.field public ۥ۟:LYue/ۥۡۦۦ۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e6\u06e6\u06df<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:Landroid/content/Context;

.field public ۥ۟۟۟:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۣۢۡۢ;->ۥ:LYue/ۥ۠ۥ۟ۨ;

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣۢۡۢ;->ۥ۟۟۟:Z

    iput-object p1, p0, LYue/ۥۣۢۡۢ;->ۥ۟۟:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    invoke-static {p2}, LYue/ۥ۠ۥ۟ۨ$ۥ۟;->ۥ۟۟۟ۡ(Landroid/os/IBinder;)LYue/ۥ۠ۥ۟ۨ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣۢۡۢ;->ۥ:LYue/ۥ۠ۥ۟ۨ;

    :try_start_0
    invoke-virtual {p0}, LYue/ۥۣۢۡۢ;->ۥ۟۟()LYue/ۥ۠ۥ۟ۧ;

    move-result-object p2

    invoke-interface {p1, p2}, LYue/ۥ۠ۥ۟ۨ;->ۥ۟۟(LYue/ۥ۠ۥ۟ۧ;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object p1, p0, LYue/ۥۣۢۡۢ;->ۥ۟:LYue/ۥۡۦۦ۟;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, LYue/ۥۡۦۦ۟;->ۥ۟۟۠۟(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۣۢۡۢ;->ۥ:LYue/ۥ۠ۥ۟ۨ;

    return-void
.end method

.method public ۥ(LYue/ۥۡۦۦ۟;)V
    .locals 2
    .param p1    # LYue/ۥۡۦۦ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e6\u06df<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣۢۡۢ;->ۥ۟۟۟:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣۢۡۢ;->ۥ۟۟۟:Z

    iput-object p1, p0, LYue/ۥۣۢۡۢ;->ۥ۟:LYue/ۥۡۦۦ۟;

    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LYue/ۥۣۢۡۢ;->ۥ۟۟:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۣۡۥۣ;->ۥ۟(Landroid/content/pm/PackageManager;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    iget-object v1, p0, LYue/ۥۣۢۡۢ;->ۥ۟۟:Landroid/content/Context;

    invoke-virtual {v1, p1, p0, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Each UnusedAppRestrictionsBackportServiceConnection can only be bound once."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟()V
    .locals 2

    iget-boolean v0, p0, LYue/ۥۣۢۡۢ;->ۥ۟۟۟:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣۢۡۢ;->ۥ۟۟۟:Z

    iget-object v0, p0, LYue/ۥۣۢۡۢ;->ۥ۟۟:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "bindService must be called before unbind"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟()LYue/ۥ۠ۥ۟ۧ;
    .locals 1

    new-instance v0, LYue/ۥۣۢۡۢ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۣۢۡۢ$ۥ;-><init>(LYue/ۥۣۢۡۢ;)V

    return-object v0
.end method
