.class public final Lo40;
.super Lpp;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public θ:Ly12;

.field public ι:Lum1;

.field public κ:Lzt;

.field public synthetic λ:Ljava/lang/Object;

.field public μ:I


# virtual methods
.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lo40;->λ:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lo40;->μ:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lo40;->μ:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1, p1, p0}, Lbd;->σ(Lf40;Le80;Lpp;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
