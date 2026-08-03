.class public final LYue/ۥ۠ۧۨ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(Landroid/location/Location;)D
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    return-wide v0
.end method

.method public static final ۥ۟(Landroid/location/Location;)D
    .locals 2
    .param p0    # Landroid/location/Location;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    return-wide v0
.end method
