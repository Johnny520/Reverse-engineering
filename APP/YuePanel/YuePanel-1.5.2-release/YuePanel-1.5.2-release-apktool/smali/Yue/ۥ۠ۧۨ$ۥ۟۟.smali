.class public LYue/ۥ۠ۧۨ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1d
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/location/Location;)V
    .locals 2
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/location/Location;->hasBearingAccuracy()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/location/Location;->getElapsedRealtimeUncertaintyNanos()D

    move-result-wide v0

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟;->ۥ(Landroid/location/Location;)V

    invoke-virtual {p0, v0, v1}, Landroid/location/Location;->setElapsedRealtimeUncertaintyNanos(D)V

    return-void
.end method

.method public static ۥ۟(Landroid/location/Location;)V
    .locals 2
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/location/Location;->hasSpeedAccuracy()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/location/Location;->getElapsedRealtimeUncertaintyNanos()D

    move-result-wide v0

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟;->ۥ۟(Landroid/location/Location;)V

    invoke-virtual {p0, v0, v1}, Landroid/location/Location;->setElapsedRealtimeUncertaintyNanos(D)V

    return-void
.end method

.method public static ۥ۟۟(Landroid/location/Location;)V
    .locals 2
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/location/Location;->hasVerticalAccuracy()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/location/Location;->getElapsedRealtimeUncertaintyNanos()D

    move-result-wide v0

    invoke-static {p0}, LYue/ۥ۠ۧۨ$ۥ۟;->ۥ۟۟(Landroid/location/Location;)V

    invoke-virtual {p0, v0, v1}, Landroid/location/Location;->setElapsedRealtimeUncertaintyNanos(D)V

    return-void
.end method
