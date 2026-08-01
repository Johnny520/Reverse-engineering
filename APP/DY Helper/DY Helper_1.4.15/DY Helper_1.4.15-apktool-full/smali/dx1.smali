.class public final Ldx1;
.super Lk02;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public γ:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lk02;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-wide p3, p0, Ldx1;->γ:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final α(Lk02;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ldx1;

    .line 5
    .line 6
    iget-wide v0, p1, Ldx1;->γ:J

    .line 7
    .line 8
    iput-wide v0, p0, Ldx1;->γ:J

    .line 9
    .line 10
    return-void
.end method

.method public final β(J)Lk02;
    .locals 3

    .line 1
    new-instance v0, Ldx1;

    .line 2
    .line 3
    iget-wide v1, p0, Ldx1;->γ:J

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, v1, v2}, Ldx1;-><init>(JJ)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
