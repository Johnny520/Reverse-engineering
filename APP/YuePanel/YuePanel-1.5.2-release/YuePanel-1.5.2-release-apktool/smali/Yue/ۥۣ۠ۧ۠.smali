.class public LYue/ۥۣ۠ۧ۠;
.super LYue/ۥۣ۠ۦ۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۨ:I = 0x0

.field public static final ۥ۟۟۠:I = 0x20

.field public static final ۥ۟۟۠۟:I = 0x21

.field public static final ۥ۟۟۠۠:I = 0x40

.field public static final ۥ۟۟۠ۡ:I = -0x57

.field public static final ۥ۟۟۠ۢ:I = 0x40

.field public static final ۥۣ۟۟۠:I = 0x18

.field public static final ۥ۟۟۠ۤ:I = 0xc1

.field public static final ۥ۟۟۠ۥ:I = 0xc8

.field public static final ۥ۟۟۠ۦ:I = 0xc8

.field public static final ۥ۟۟۠ۧ:I = 0x23


# instance fields
.field public final ۥۣ۟۟۟:Landroid/location/GpsStatus;

.field public ۥ۟۟۟ۤ:I
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "mWrapped"
    .end annotation
.end field

.field public ۥ۟۟۟ۥ:Ljava/util/Iterator;
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "mWrapped"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Landroid/location/GpsSatellite;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟ۦ:I
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "mWrapped"
    .end annotation
.end field

.field public ۥ۟۟۟ۧ:Landroid/location/GpsSatellite;
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "mWrapped"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/location/GpsStatus;)V
    .locals 1

    invoke-direct {p0}, LYue/ۥۣ۠ۦ۟;-><init>()V

    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/GpsStatus;

    iput-object p1, p0, LYue/ۥۣ۠ۧ۠;->ۥۣ۟۟۟:Landroid/location/GpsStatus;

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۤ:I

    invoke-virtual {p1}, Landroid/location/GpsStatus;->getSatellites()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۥ:Ljava/util/Iterator;

    iput v0, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۦ:I

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۧ:Landroid/location/GpsSatellite;

    return-void
.end method

.method public static ۥ۟۟۠۟(I)I
    .locals 2

    if-lez p0, :cond_0

    const/16 v0, 0x20

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/16 v0, 0x21

    const/16 v1, 0x40

    if-lt p0, v0, :cond_1

    if-gt p0, v1, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    if-le p0, v1, :cond_2

    const/16 v0, 0x58

    if-gt p0, v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const/16 v0, 0xc8

    if-le p0, v0, :cond_3

    const/16 v1, 0xeb

    if-gt p0, v1, :cond_3

    const/4 p0, 0x5

    return p0

    :cond_3
    const/16 v1, 0xc1

    if-lt p0, v1, :cond_4

    if-gt p0, v0, :cond_4

    const/4 p0, 0x4

    return p0

    :cond_4
    const/4 p0, 0x0

    return p0
.end method

.method public static ۥ۟۟۠ۡ(I)I
    .locals 2

    invoke-static {p0}, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۠۟(I)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit16 p0, p0, -0xc8

    goto :goto_0

    :cond_1
    add-int/lit8 p0, p0, -0x40

    goto :goto_0

    :cond_2
    add-int/lit8 p0, p0, 0x57

    :goto_0
    return p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LYue/ۥۣ۠ۧ۠;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LYue/ۥۣ۠ۧ۠;

    iget-object v0, p0, LYue/ۥۣ۠ۧ۠;->ۥۣ۟۟۟:Landroid/location/GpsStatus;

    iget-object p1, p1, LYue/ۥۣ۠ۧ۠;->ۥۣ۟۟۟:Landroid/location/GpsStatus;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۠ۧ۠;->ۥۣ۟۟۟:Landroid/location/GpsStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public ۥ(I)F
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۠۠(I)Landroid/location/GpsSatellite;

    move-result-object p1

    invoke-virtual {p1}, Landroid/location/GpsSatellite;->getAzimuth()F

    move-result p1

    return p1
.end method

.method public ۥ۟(I)F
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public ۥ۟۟(I)F
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public ۥ۟۟۟(I)F
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۠۠(I)Landroid/location/GpsSatellite;

    move-result-object p1

    invoke-virtual {p1}, Landroid/location/GpsSatellite;->getSnr()F

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۟(I)I
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۠۠(I)Landroid/location/GpsSatellite;

    move-result-object p1

    invoke-virtual {p1}, Landroid/location/GpsSatellite;->getPrn()I

    move-result p1

    invoke-static {p1}, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۠۟(I)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۠(I)F
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۠۠(I)Landroid/location/GpsSatellite;

    move-result-object p1

    invoke-virtual {p1}, Landroid/location/GpsSatellite;->getElevation()F

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۡ()I
    .locals 3

    iget-object v0, p0, LYue/ۥۣ۠ۧ۠;->ۥۣ۟۟۟:Landroid/location/GpsStatus;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۤ:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, LYue/ۥۣ۠ۧ۠;->ۥۣ۟۟۟:Landroid/location/GpsStatus;

    invoke-virtual {v1}, Landroid/location/GpsStatus;->getSatellites()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/location/GpsSatellite;

    iget v2, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۤ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۤ:I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget v1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۤ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۤ:I

    :cond_1
    iget v1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۤ:I

    monitor-exit v0

    return v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ۥ۟۟۟ۢ(I)I
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۠۠(I)Landroid/location/GpsSatellite;

    move-result-object p1

    invoke-virtual {p1}, Landroid/location/GpsSatellite;->getPrn()I

    move-result p1

    invoke-static {p1}, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۠ۡ(I)I

    move-result p1

    return p1
.end method

.method public ۥۣ۟۟۟(I)Z
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۠۠(I)Landroid/location/GpsSatellite;

    move-result-object p1

    invoke-virtual {p1}, Landroid/location/GpsSatellite;->hasAlmanac()Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۤ(I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟۟۟ۥ(I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟۟۟ۦ(I)Z
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۠۠(I)Landroid/location/GpsSatellite;

    move-result-object p1

    invoke-virtual {p1}, Landroid/location/GpsSatellite;->hasEphemeris()Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۧ(I)Z
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۠۠(I)Landroid/location/GpsSatellite;

    move-result-object p1

    invoke-virtual {p1}, Landroid/location/GpsSatellite;->usedInFix()Z

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۠۠(I)Landroid/location/GpsSatellite;
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۠ۧ۠;->ۥۣ۟۟۟:Landroid/location/GpsStatus;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۦ:I

    if-ge p1, v1, :cond_0

    iget-object v1, p0, LYue/ۥۣ۠ۧ۠;->ۥۣ۟۟۟:Landroid/location/GpsStatus;

    invoke-virtual {v1}, Landroid/location/GpsStatus;->getSatellites()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    iput-object v1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۥ:Ljava/util/Iterator;

    const/4 v1, -0x1

    iput v1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۦ:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget v1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۦ:I

    if-ge v1, p1, :cond_2

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۦ:I

    iget-object v1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۥ:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۧ:Landroid/location/GpsSatellite;

    goto :goto_1

    :cond_1
    iget-object v1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۥ:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/GpsSatellite;

    iput-object v1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۧ:Landroid/location/GpsSatellite;

    goto :goto_0

    :cond_2
    :goto_1
    iget-object p1, p0, LYue/ۥۣ۠ۧ۠;->ۥ۟۟۟ۧ:Landroid/location/GpsSatellite;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/GpsSatellite;

    return-object p1

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
