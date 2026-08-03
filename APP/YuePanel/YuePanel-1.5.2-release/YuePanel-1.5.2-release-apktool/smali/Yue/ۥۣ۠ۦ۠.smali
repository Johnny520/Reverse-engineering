.class public LYue/ۥۣ۠ۦ۠;
.super LYue/ۥۣ۠ۦ۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x18
.end annotation

.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠ۦ۠$ۥ;,
        LYue/ۥۣ۠ۦ۠$ۥ۟;
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۟:Landroid/location/GnssStatus;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, LYue/ۥۣ۠ۦ۟;-><init>()V

    check-cast p1, Landroid/location/GnssStatus;

    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/GnssStatus;

    iput-object p1, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LYue/ۥۣ۠ۦ۠;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LYue/ۥۣ۠ۦ۠;

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    iget-object p1, p1, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-virtual {v0, p1}, Landroid/location/GnssStatus;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-virtual {v0}, Landroid/location/GnssStatus;->hashCode()I

    move-result v0

    return v0
.end method

.method public ۥ(I)F
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-virtual {v0, p1}, Landroid/location/GnssStatus;->getAzimuthDegrees(I)F

    move-result p1

    return p1
.end method

.method public ۥ۟(I)F
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-static {v0, p1}, LYue/ۥۣ۠ۦ۠$ۥ۟;->ۥ(Landroid/location/GnssStatus;I)F

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public ۥ۟۟(I)F
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-static {v0, p1}, LYue/ۥۣ۠ۦ۠$ۥ;->ۥ(Landroid/location/GnssStatus;I)F

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟(I)F
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-virtual {v0, p1}, Landroid/location/GnssStatus;->getCn0DbHz(I)F

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۟(I)I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-virtual {v0, p1}, Landroid/location/GnssStatus;->getConstellationType(I)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۠(I)F
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-virtual {v0, p1}, Landroid/location/GnssStatus;->getElevationDegrees(I)F

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۡ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-virtual {v0}, Landroid/location/GnssStatus;->getSatelliteCount()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۢ(I)I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-virtual {v0, p1}, Landroid/location/GnssStatus;->getSvid(I)I

    move-result p1

    return p1
.end method

.method public ۥۣ۟۟۟(I)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-virtual {v0, p1}, Landroid/location/GnssStatus;->hasAlmanacData(I)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۤ(I)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-static {v0, p1}, LYue/ۥۣ۠ۦ۠$ۥ۟;->ۥ۟(Landroid/location/GnssStatus;I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟۟۟ۥ(I)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-static {v0, p1}, LYue/ۥۣ۠ۦ۠$ۥ;->ۥ۟(Landroid/location/GnssStatus;I)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۦ(I)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-virtual {v0, p1}, Landroid/location/GnssStatus;->hasEphemerisData(I)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۧ(I)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۦ۠;->ۥۣ۟۟۟:Landroid/location/GnssStatus;

    invoke-virtual {v0, p1}, Landroid/location/GnssStatus;->usedInFix(I)Z

    move-result p1

    return p1
.end method
