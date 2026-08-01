.class public final Lhd;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lyr;


# instance fields
.field public ε:Lcd;

.field public ζ:Ln;


# virtual methods
.method public final β()F
    .locals 0

    .line 1
    iget-object p0, p0, Lhd;->ε:Lcd;

    .line 2
    .line 3
    invoke-interface {p0}, Lcd;->β()Lyr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lyr;->β()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final γ(La80;)Ln;
    .locals 3

    .line 1
    new-instance v0, Ln;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ln;-><init>(IZ)V

    .line 7
    .line 8
    .line 9
    iput-object p1, v0, Ln;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v0, p0, Lhd;->ζ:Ln;

    .line 12
    .line 13
    return-object v0
.end method

.method public final θ()F
    .locals 0

    .line 1
    iget-object p0, p0, Lhd;->ε:Lcd;

    .line 2
    .line 3
    invoke-interface {p0}, Lcd;->β()Lyr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lyr;->θ()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
