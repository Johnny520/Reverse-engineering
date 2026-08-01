.class public abstract Lr52;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:J

.field public static final synthetic β:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/high16 v0, 0x3f000000    # 0.5f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-long v1, v1

    .line 8
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    int-to-long v3, v0

    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    shl-long v0, v1, v0

    .line 16
    .line 17
    const-wide v5, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long v2, v3, v5

    .line 23
    .line 24
    or-long/2addr v0, v2

    .line 25
    sput-wide v0, Lr52;->α:J

    .line 26
    .line 27
    return-void
.end method
