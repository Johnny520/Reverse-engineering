.class public abstract LYue/ۥۣ۠ۦ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠ۦ۟$ۥ;,
        LYue/ۥۣ۠ۦ۟$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ:I = 0x0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation
.end field

.field public static final ۥ۟:I = 0x1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation
.end field

.field public static final ۥ۟۟:I = 0x2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟:I = 0x3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:I = 0x4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟۠:I = 0x5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟ۡ:I = 0x6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟ۢ:I = 0x7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ۟۟۟ۨ(Landroid/location/GnssStatus;)LYue/ۥۣ۠ۦ۟;
    .locals 1
    .param p0    # Landroid/location/GnssStatus;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x18
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۦ۠;

    invoke-direct {v0, p0}, LYue/ۥۣ۠ۦ۠;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ۥ۟۟۠(Landroid/location/GpsStatus;)LYue/ۥۣ۠ۦ۟;
    .locals 1
    .param p0    # Landroid/location/GpsStatus;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ReferencesDeprecated"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۧ۠;

    invoke-direct {v0, p0}, LYue/ۥۣ۠ۧ۠;-><init>(Landroid/location/GpsStatus;)V

    return-object v0
.end method


# virtual methods
.method public abstract ۥ(I)F
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۢۢۧ;
        from = 0.0
        to = 360.0
    .end annotation
.end method

.method public abstract ۥ۟(I)F
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۢۢۧ;
        from = 0.0
        to = 63.0
    .end annotation
.end method

.method public abstract ۥ۟۟(I)F
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۢۢۧ;
        from = 0.0
    .end annotation
.end method

.method public abstract ۥ۟۟۟(I)F
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۢۢۧ;
        from = 0.0
        to = 63.0
    .end annotation
.end method

.method public abstract ۥ۟۟۟۟(I)I
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
.end method

.method public abstract ۥ۟۟۟۠(I)F
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۢۢۧ;
        from = -90.0
        to = 90.0
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۡ()I
    .annotation build LYue/ۥ۠ۥۤ;
        from = 0x0L
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۢ(I)I
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۤ;
        from = 0x1L
        to = 0xc8L
    .end annotation
.end method

.method public abstract ۥۣ۟۟۟(I)Z
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
.end method

.method public abstract ۥ۟۟۟ۤ(I)Z
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
.end method

.method public abstract ۥ۟۟۟ۥ(I)Z
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
.end method

.method public abstract ۥ۟۟۟ۦ(I)Z
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
.end method

.method public abstract ۥ۟۟۟ۧ(I)Z
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
.end method
