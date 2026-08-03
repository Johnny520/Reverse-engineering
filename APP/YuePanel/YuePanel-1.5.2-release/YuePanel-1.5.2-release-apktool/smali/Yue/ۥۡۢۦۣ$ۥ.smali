.class public LYue/ۥۡۢۦۣ$ۥ;
.super LYue/ۥ۠ۥ۟ۢ$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۟:LYue/ۥۡۢۦۣ;


# direct methods
.method public constructor <init>(LYue/ۥۡۢۦۣ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۢۦۣ$ۥ;->ۥۣ۟۟۟:LYue/ۥۡۢۦۣ;

    invoke-direct {p0}, LYue/ۥ۠ۥ۟ۢ$ۥ۟;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LYue/ۥۡۢۦۣ$ۥ;->ۥۣ۟۟۟:LYue/ۥۡۢۦۣ;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-virtual {v0, v1, p1}, LYue/ۥۡۢۦۣ;->ۥ۟۟(ILjava/lang/String;)V

    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v0

    :try_start_0
    iget-object v2, p0, LYue/ۥۡۢۦۣ$ۥ;->ۥۣ۟۟۟:LYue/ۥۡۢۦۣ;

    invoke-virtual {v2, p1}, LYue/ۥۡۢۦۣ;->ۥ۟(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    throw p1
.end method

.method public ۥ۟۟۟(Ljava/lang/String;ILjava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦۣ$ۥ;->ۥۣ۟۟۟:LYue/ۥۡۢۦۣ;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-virtual {v0, v1, p1}, LYue/ۥۡۢۦۣ;->ۥ۟۟(ILjava/lang/String;)V

    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v0

    :try_start_0
    iget-object v2, p0, LYue/ۥۡۢۦۣ$ۥ;->ۥۣ۟۟۟:LYue/ۥۡۢۦۣ;

    invoke-virtual {v2, p1, p2, p3}, LYue/ۥۡۢۦۣ;->ۥ(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    throw p1
.end method

.method public ۥ۟۟۟۠(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦۣ$ۥ;->ۥۣ۟۟۟:LYue/ۥۡۢۦۣ;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-virtual {v0, v1, p1}, LYue/ۥۡۢۦۣ;->ۥ۟۟(ILjava/lang/String;)V

    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v0

    :try_start_0
    iget-object v2, p0, LYue/ۥۡۢۦۣ$ۥ;->ۥۣ۟۟۟:LYue/ۥۡۢۦۣ;

    invoke-virtual {v2, p1, p2, p3, p4}, LYue/ۥۡۢۦۣ;->ۥ۟۟۟(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    throw p1
.end method
