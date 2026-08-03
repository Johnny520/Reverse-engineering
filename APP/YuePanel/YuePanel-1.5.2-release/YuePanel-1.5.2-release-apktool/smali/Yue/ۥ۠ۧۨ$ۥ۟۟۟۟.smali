.class public LYue/ۥ۠ۧۨ$ۥ۟۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x22
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/location/Location;)F
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/location/Location;->getMslAltitudeAccuracyMeters()F

    move-result p0

    return p0
.end method

.method public static ۥ۟(Landroid/location/Location;)D
    .locals 2
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/location/Location;->getMslAltitudeMeters()D

    move-result-wide v0

    return-wide v0
.end method

.method public static ۥ۟۟(Landroid/location/Location;)Z
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/location/Location;->hasMslAltitude()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟(Landroid/location/Location;)Z
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/location/Location;->hasMslAltitudeAccuracy()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟۟(Landroid/location/Location;)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/location/Location;->removeMslAltitude()V

    return-void
.end method

.method public static ۥ۟۟۟۠(Landroid/location/Location;)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/location/Location;->removeMslAltitudeAccuracy()V

    return-void
.end method

.method public static ۥ۟۟۟ۡ(Landroid/location/Location;F)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/location/Location;->setMslAltitudeAccuracyMeters(F)V

    return-void
.end method

.method public static ۥ۟۟۟ۢ(Landroid/location/Location;D)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroid/location/Location;->setMslAltitudeMeters(D)V

    return-void
.end method
