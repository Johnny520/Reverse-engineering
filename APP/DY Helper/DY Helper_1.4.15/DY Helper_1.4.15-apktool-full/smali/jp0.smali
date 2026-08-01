.class public final Ljp0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:F

.field public β:F

.field public γ:F

.field public δ:F

.field public ε:F

.field public ζ:F

.field public η:F

.field public θ:F

.field public ι:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Ljp0;->α:F

    .line 7
    .line 8
    iput v0, p0, Ljp0;->β:F

    .line 9
    .line 10
    const/high16 v0, 0x41000000    # 8.0f

    .line 11
    .line 12
    iput v0, p0, Ljp0;->θ:F

    .line 13
    .line 14
    sget v0, Lr52;->β:I

    .line 15
    .line 16
    sget-wide v0, Lr52;->α:J

    .line 17
    .line 18
    iput-wide v0, p0, Ljp0;->ι:J

    .line 19
    .line 20
    return-void
.end method
