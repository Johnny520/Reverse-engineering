.class public final Lci/q0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:D

.field public final b:D


# direct methods
.method public constructor <init>(F)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, 0x401921fb54442d18L    # 6.283185307179586

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    float-to-double v2, p1

    .line 10
    div-double/2addr v0, v2

    .line 11
    mul-double v2, v0, v0

    .line 12
    .line 13
    iput-wide v2, p0, Lci/q0;->b:D

    .line 14
    .line 15
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 16
    .line 17
    const/high16 p1, 0x3f800000    # 1.0f

    .line 18
    .line 19
    float-to-double v4, p1

    .line 20
    mul-double/2addr v4, v2

    .line 21
    mul-double/2addr v4, v0

    .line 22
    iput-wide v4, p0, Lci/q0;->a:D

    .line 23
    .line 24
    return-void
.end method
