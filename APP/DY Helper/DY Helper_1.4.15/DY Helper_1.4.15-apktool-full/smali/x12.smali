.class public final Lx12;
.super Lpp;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public θ:Lx3;

.field public ι:Ls22;

.field public κ:La80;

.field public λ:Lum1;

.field public synthetic μ:Ljava/lang/Object;

.field public ν:I


# virtual methods
.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iput-object p1, p0, Lx12;->μ:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lx12;->ν:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lx12;->ν:I

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x0

    .line 15
    move-object v5, p0

    .line 16
    invoke-static/range {v0 .. v5}, Lj81;->α(Lx3;Ls22;JLm3;Lpp;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
