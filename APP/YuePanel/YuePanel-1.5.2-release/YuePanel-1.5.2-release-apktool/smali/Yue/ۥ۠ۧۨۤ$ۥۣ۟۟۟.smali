.class public LYue/ۥ۠ۧۨۤ$ۥۣ۟۟۟;
.super Landroid/location/GnssStatus$Callback;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1e
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۨۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e3"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۣ۠ۦ۟$ۥ;


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

    iput-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥۣ۟۟۟;->ۥ:LYue/ۥۣ۠ۦ۟$ۥ;

    return-void
.end method


# virtual methods
.method public onFirstFix(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥۣ۟۟۟;->ۥ:LYue/ۥۣ۠ۦ۟$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۦ۟$ۥ;->ۥ(I)V

    return-void
.end method

.method public onSatelliteStatusChanged(Landroid/location/GnssStatus;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥۣ۟۟۟;->ۥ:LYue/ۥۣ۠ۦ۟$ۥ;

    invoke-static {p1}, LYue/ۥۣ۠ۦ۟;->ۥ۟۟۟ۨ(Landroid/location/GnssStatus;)LYue/ۥۣ۠ۦ۟;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۦ۟$ۥ;->ۥ۟(LYue/ۥۣ۠ۦ۟;)V

    return-void
.end method

.method public onStarted()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥۣ۟۟۟;->ۥ:LYue/ۥۣ۠ۦ۟$ۥ;

    invoke-virtual {v0}, LYue/ۥۣ۠ۦ۟$ۥ;->ۥ۟۟()V

    return-void
.end method

.method public onStopped()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥۣ۟۟۟;->ۥ:LYue/ۥۣ۠ۦ۟$ۥ;

    invoke-virtual {v0}, LYue/ۥۣ۠ۦ۟$ۥ;->ۥ۟۟۟()V

    return-void
.end method
