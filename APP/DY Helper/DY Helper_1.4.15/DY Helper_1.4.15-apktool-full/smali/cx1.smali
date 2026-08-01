.class public final Lcx1;
.super Lk02;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public γ:I


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Lk02;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcx1;->γ:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final α(Lk02;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lcx1;

    .line 5
    .line 6
    iget p1, p1, Lcx1;->γ:I

    .line 7
    .line 8
    iput p1, p0, Lcx1;->γ:I

    .line 9
    .line 10
    return-void
.end method

.method public final β(J)Lk02;
    .locals 1

    .line 1
    new-instance v0, Lcx1;

    .line 2
    .line 3
    iget p0, p0, Lcx1;->γ:I

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcx1;-><init>(IJ)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
