.class public LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;
.super Landroid/location/GnssStatus$Callback;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x18
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۨۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e8"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۣ۠ۦ۟$ۥ;

.field public volatile ۥ۟:Ljava/util/concurrent/Executor;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۦ۟$ۥ;)V
    .locals 2

    invoke-direct {p0}, Landroid/location/GnssStatus$Callback;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "invalid null callback"

    invoke-static {v0, v1}, LYue/ۥۡۤۧ;->ۥ۟(ZLjava/lang/Object;)V

    iput-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ:LYue/ۥۣ۠ۦ۟$ۥ;

    return-void
.end method

.method public static synthetic ۥ(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟۟۟ۢ(Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static synthetic ۥ۟(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;Ljava/util/concurrent/Executor;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟۟۟۟(Ljava/util/concurrent/Executor;I)V

    return-void
.end method

.method public static synthetic ۥ۟۟(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟۟۟ۡ(Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;Ljava/util/concurrent/Executor;Landroid/location/GnssStatus;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟۟۟۠(Ljava/util/concurrent/Executor;Landroid/location/GnssStatus;)V

    return-void
.end method


# virtual methods
.method public onFirstFix(I)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, LYue/ۥ۠ۨ۟ۨ;

    invoke-direct {v1, p0, v0, p1}, LYue/ۥ۠ۨ۟ۨ;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;Ljava/util/concurrent/Executor;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onSatelliteStatusChanged(Landroid/location/GnssStatus;)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, LYue/ۥ۠ۨ۠;

    invoke-direct {v1, p0, v0, p1}, LYue/ۥ۠ۨ۠;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;Ljava/util/concurrent/Executor;Landroid/location/GnssStatus;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onStarted()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, LYue/ۥ۠ۨ۠۠;

    invoke-direct {v1, p0, v0}, LYue/ۥ۠ۨ۠۠;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;Ljava/util/concurrent/Executor;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onStopped()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, LYue/ۥ۠ۨ۠۟;

    invoke-direct {v1, p0, v0}, LYue/ۥ۠ۨ۠۟;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;Ljava/util/concurrent/Executor;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic ۥ۟۟۟۟(Ljava/util/concurrent/Executor;I)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/concurrent/Executor;

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ:LYue/ۥۣ۠ۦ۟$ۥ;

    invoke-virtual {p1, p2}, LYue/ۥۣ۠ۦ۟$ۥ;->ۥ(I)V

    return-void
.end method

.method public final synthetic ۥ۟۟۟۠(Ljava/util/concurrent/Executor;Landroid/location/GnssStatus;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/concurrent/Executor;

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ:LYue/ۥۣ۠ۦ۟$ۥ;

    invoke-static {p2}, LYue/ۥۣ۠ۦ۟;->ۥ۟۟۟ۨ(Landroid/location/GnssStatus;)LYue/ۥۣ۠ۦ۟;

    move-result-object p2

    invoke-virtual {p1, p2}, LYue/ۥۣ۠ۦ۟$ۥ;->ۥ۟(LYue/ۥۣ۠ۦ۟;)V

    return-void
.end method

.method public final synthetic ۥ۟۟۟ۡ(Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/concurrent/Executor;

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ:LYue/ۥۣ۠ۦ۟$ۥ;

    invoke-virtual {p1}, LYue/ۥۣ۠ۦ۟$ۥ;->ۥ۟۟()V

    return-void
.end method

.method public final synthetic ۥ۟۟۟ۢ(Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/concurrent/Executor;

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ:LYue/ۥۣ۠ۦ۟$ۥ;

    invoke-virtual {p1}, LYue/ۥۣ۠ۦ۟$ۥ;->ۥ۟۟۟()V

    return-void
.end method

.method public ۥۣ۟۟۟(Ljava/util/concurrent/Executor;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    const-string v3, "invalid null executor"

    invoke-static {v2, v3}, LYue/ۥۡۤۧ;->ۥ۟(ZLjava/lang/Object;)V

    iget-object v2, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/concurrent/Executor;

    if-nez v2, :cond_1

    move v0, v1

    :cond_1
    invoke-static {v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۨ(Z)V

    iput-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public ۥ۟۟۟ۤ()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/concurrent/Executor;

    return-void
.end method
