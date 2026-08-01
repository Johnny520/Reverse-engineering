.class public final Lrv;
.super Lpp;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public θ:Ld22;

.field public ι:La80;

.field public synthetic κ:Ljava/lang/Object;

.field public λ:I


# virtual methods
.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, Lrv;->κ:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lrv;->λ:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lrv;->λ:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    invoke-static {p1, v0, v1, p1, p0}, Lsv;->γ(Ld22;JLa80;Lq8;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
