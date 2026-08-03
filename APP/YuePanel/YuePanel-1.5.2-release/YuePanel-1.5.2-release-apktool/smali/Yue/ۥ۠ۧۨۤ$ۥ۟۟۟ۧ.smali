.class public LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۨۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e7"
.end annotation


# instance fields
.field public volatile ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public final ۥ۟:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;Ljava/util/concurrent/Executor;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    iput-object p2, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic ۥ(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic ۥ۟(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۧ(Ljava/lang/String;ILandroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic ۥ۟۟(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;Landroid/location/Location;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥۣ۟۟۟(Landroid/location/Location;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۤ(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟۟(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۥ(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟۠(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;I)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۢ(I)V

    return-void
.end method


# virtual methods
.method public onFlushComplete(I)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟:Ljava/util/concurrent/Executor;

    new-instance v1, LYue/ۥ۠ۨ۟ۦ;

    invoke-direct {v1, p0, p1}, LYue/ۥ۠ۨ۟ۦ;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 2
    .param p1    # Landroid/location/Location;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟:Ljava/util/concurrent/Executor;

    new-instance v1, LYue/ۥ۠ۨ۟ۥ;

    invoke-direct {v1, p0, p1}, LYue/ۥ۠ۨ۟ۥ;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;Landroid/location/Location;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onLocationChanged(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    .line 3
    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟:Ljava/util/concurrent/Executor;

    new-instance v1, LYue/ۥ۠ۨ۟ۤ;

    invoke-direct {v1, p0, p1}, LYue/ۥ۠ۨ۟ۤ;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟:Ljava/util/concurrent/Executor;

    new-instance v1, LYue/ۥۣ۠ۨ۟;

    invoke-direct {v1, p0, p1}, LYue/ۥۣ۠ۨ۟;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟:Ljava/util/concurrent/Executor;

    new-instance v1, LYue/ۥ۠ۨ۟ۢ;

    invoke-direct {v1, p0, p1}, LYue/ۥ۠ۨ۟ۢ;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ۟:Ljava/util/concurrent/Executor;

    new-instance v1, LYue/ۥ۠ۨ۟ۧ;

    invoke-direct {v1, p0, p1, p2, p3}, LYue/ۥ۠ۨ۟ۧ;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;Ljava/lang/String;ILandroid/os/Bundle;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ()LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    invoke-static {v0}, LYue/ۥۡۢۨ;->ۥ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    return-object v0
.end method

.method public final synthetic ۥ۟۟۟ۢ(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۠ۧۨ۠;

    invoke-interface {v0, p1}, LYue/ۥ۠ۧۨ۠;->onFlushComplete(I)V

    return-void
.end method

.method public final synthetic ۥۣ۟۟۟(Landroid/location/Location;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۠ۧۨ۠;

    invoke-interface {v0, p1}, Landroid/location/LocationListener;->onLocationChanged(Landroid/location/Location;)V

    return-void
.end method

.method public final synthetic ۥ۟۟۟ۤ(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۠ۧۨ۠;

    invoke-interface {v0, p1}, LYue/ۥ۠ۧۨ۠;->onLocationChanged(Ljava/util/List;)V

    return-void
.end method

.method public final synthetic ۥ۟۟۟ۥ(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۠ۧۨ۠;

    invoke-interface {v0, p1}, LYue/ۥ۠ۧۨ۠;->onProviderDisabled(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic ۥ۟۟۟ۦ(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۠ۧۨ۠;

    invoke-interface {v0, p1}, LYue/ۥ۠ۧۨ۠;->onProviderEnabled(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic ۥ۟۟۟ۧ(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۠ۧۨ۠;

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۧۨ۠;->onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V

    return-void
.end method

.method public ۥ۟۟۟ۨ()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۧ;->ۥ:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    return-void
.end method
