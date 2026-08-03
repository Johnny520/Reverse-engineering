.class public LYue/ۥ۠ۨ۠ۢ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1f
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۨ۠ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(LYue/ۥ۠ۨ۠ۢ;)Landroid/location/LocationRequest;
    .locals 3
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    new-instance v0, Landroid/location/LocationRequest$Builder;

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۢ;->ۥ۟()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Landroid/location/LocationRequest$Builder;-><init>(J)V

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟ۡ()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/location/LocationRequest$Builder;->setQuality(I)Landroid/location/LocationRequest$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۠()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/LocationRequest$Builder;->setMinUpdateIntervalMillis(J)Landroid/location/LocationRequest$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۢ;->ۥ()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/LocationRequest$Builder;->setDurationMillis(J)Landroid/location/LocationRequest$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/location/LocationRequest$Builder;->setMaxUpdates(I)Landroid/location/LocationRequest$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۟()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/location/LocationRequest$Builder;->setMinUpdateDistanceMeters(F)Landroid/location/LocationRequest$Builder;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/location/LocationRequest$Builder;->setMaxUpdateDelayMillis(J)Landroid/location/LocationRequest$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/location/LocationRequest$Builder;->build()Landroid/location/LocationRequest;

    move-result-object p0

    return-object p0
.end method
