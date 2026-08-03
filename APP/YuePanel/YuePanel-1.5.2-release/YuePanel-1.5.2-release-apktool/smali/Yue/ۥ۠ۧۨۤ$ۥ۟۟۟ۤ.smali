.class public LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/location/GpsStatus$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۨۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e4"
.end annotation


# instance fields
.field public final ۥ:Landroid/location/LocationManager;

.field public final ۥ۟:LYue/ۥۣ۠ۦ۟$ۥ;

.field public volatile ۥ۟۟:Ljava/util/concurrent/Executor;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/location/LocationManager;LYue/ۥۣ۠ۦ۟$ۥ;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "invalid null callback"

    invoke-static {v0, v1}, LYue/ۥۡۤۧ;->ۥ۟(ZLjava/lang/Object;)V

    iput-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ:Landroid/location/LocationManager;

    iput-object p2, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟:LYue/ۥۣ۠ۦ۟$ۥ;

    return-void
.end method

.method public static synthetic ۥ(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟۟۟۠(Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static synthetic ۥ۟(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟۟۟۟(Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static synthetic ۥ۟۟(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;Ljava/util/concurrent/Executor;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟۟۟ۡ(Ljava/util/concurrent/Executor;I)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟۟۟ۢ(Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟;)V

    return-void
.end method


# virtual methods
.method public onGpsStatusChanged(I)V
    .locals 3
    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟۟:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    if-eq p1, v1, :cond_4

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x4

    if-eq p1, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ:Landroid/location/LocationManager;

    invoke-virtual {p1, v2}, Landroid/location/LocationManager;->getGpsStatus(Landroid/location/GpsStatus;)Landroid/location/GpsStatus;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1}, LYue/ۥۣ۠ۦ۟;->ۥ۟۟۠(Landroid/location/GpsStatus;)LYue/ۥۣ۠ۦ۟;

    move-result-object p1

    new-instance v1, LYue/ۥ۠ۨ۟ۡ;

    invoke-direct {v1, p0, v0, p1}, LYue/ۥ۠ۨ۟ۡ;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ:Landroid/location/LocationManager;

    invoke-virtual {p1, v2}, Landroid/location/LocationManager;->getGpsStatus(Landroid/location/GpsStatus;)Landroid/location/GpsStatus;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/location/GpsStatus;->getTimeToFirstFix()I

    move-result p1

    new-instance v1, LYue/ۥ۠ۨ۟۠;

    invoke-direct {v1, p0, v0, p1}, LYue/ۥ۠ۨ۟۠;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;Ljava/util/concurrent/Executor;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_3
    new-instance p1, LYue/ۥ۠ۨ۟۟;

    invoke-direct {p1, p0, v0}, LYue/ۥ۠ۨ۟۟;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;Ljava/util/concurrent/Executor;)V

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_4
    new-instance p1, LYue/ۥ۠ۨ۟;

    invoke-direct {p1, p0, v0}, LYue/ۥ۠ۨ۟;-><init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;Ljava/util/concurrent/Executor;)V

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public final synthetic ۥ۟۟۟۟(Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟۟:Ljava/util/concurrent/Executor;

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟:LYue/ۥۣ۠ۦ۟$ۥ;

    invoke-virtual {p1}, LYue/ۥۣ۠ۦ۟$ۥ;->ۥ۟۟()V

    return-void
.end method

.method public final synthetic ۥ۟۟۟۠(Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟۟:Ljava/util/concurrent/Executor;

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟:LYue/ۥۣ۠ۦ۟$ۥ;

    invoke-virtual {p1}, LYue/ۥۣ۠ۦ۟$ۥ;->ۥ۟۟۟()V

    return-void
.end method

.method public final synthetic ۥ۟۟۟ۡ(Ljava/util/concurrent/Executor;I)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟۟:Ljava/util/concurrent/Executor;

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟:LYue/ۥۣ۠ۦ۟$ۥ;

    invoke-virtual {p1, p2}, LYue/ۥۣ۠ۦ۟$ۥ;->ۥ(I)V

    return-void
.end method

.method public final synthetic ۥ۟۟۟ۢ(Ljava/util/concurrent/Executor;LYue/ۥۣ۠ۦ۟;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟۟:Ljava/util/concurrent/Executor;

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟:LYue/ۥۣ۠ۦ۟$ۥ;

    invoke-virtual {p1, p2}, LYue/ۥۣ۠ۦ۟$ۥ;->ۥ۟(LYue/ۥۣ۠ۦ۟;)V

    return-void
.end method

.method public ۥۣ۟۟۟(Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟۟:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۨ(Z)V

    iput-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟۟:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public ۥ۟۟۟ۤ()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۤ;->ۥ۟۟:Ljava/util/concurrent/Executor;

    return-void
.end method
