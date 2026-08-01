.class public final Loa;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:F

.field public final synthetic ζ:F

.field public final synthetic η:I

.field public final synthetic θ:Z


# direct methods
.method public constructor <init>(FFIZ)V
    .locals 0

    .line 1
    iput p1, p0, Loa;->ε:F

    .line 2
    .line 3
    iput p2, p0, Loa;->ζ:F

    .line 4
    .line 5
    iput p3, p0, Loa;->η:I

    .line 6
    .line 7
    iput-boolean p4, p0, Loa;->θ:Z

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkn0;->ξ:Lpl1;

    .line 2
    .line 3
    check-cast p1, Lza0;

    .line 4
    .line 5
    iget v1, p0, Loa;->ε:F

    .line 6
    .line 7
    invoke-interface {p1}, Lyr;->β()F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    mul-float/2addr v2, v1

    .line 12
    iget v1, p0, Loa;->ζ:F

    .line 13
    .line 14
    invoke-interface {p1}, Lyr;->β()F

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    mul-float/2addr v3, v1

    .line 19
    const/4 v1, 0x0

    .line 20
    cmpl-float v4, v2, v1

    .line 21
    .line 22
    if-lez v4, :cond_0

    .line 23
    .line 24
    cmpl-float v1, v3, v1

    .line 25
    .line 26
    if-lez v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Lma;

    .line 29
    .line 30
    iget v4, p0, Loa;->η:I

    .line 31
    .line 32
    invoke-direct {v1, v2, v3, v4}, Lma;-><init>(FFI)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v1, 0x0

    .line 37
    :goto_0
    invoke-interface {p1, v1}, Lza0;->Σ(Lin;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1, v0}, Lza0;->π(Liv1;)V

    .line 41
    .line 42
    .line 43
    iget-boolean p0, p0, Loa;->θ:Z

    .line 44
    .line 45
    invoke-interface {p1, p0}, Lza0;->Κ(Z)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Ls62;->α:Ls62;

    .line 49
    .line 50
    return-object p0
.end method
