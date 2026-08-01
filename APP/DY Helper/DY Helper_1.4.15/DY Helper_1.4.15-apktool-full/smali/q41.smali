.class public final Lq41;
.super Lq01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lqp0;


# instance fields
.field public τ:F

.field public υ:F

.field public φ:Z


# virtual methods
.method public final Φ(Ldw0;Lkx0;J)Lqx0;
    .locals 2

    .line 1
    invoke-interface {p2, p3, p4}, Lkx0;->ζ(J)Lch1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p3, p2, Lch1;->ε:I

    .line 6
    .line 7
    iget p4, p2, Lch1;->ζ:I

    .line 8
    .line 9
    new-instance v0, Lwa;

    .line 10
    .line 11
    const/16 v1, 0x16

    .line 12
    .line 13
    invoke-direct {v0, p0, v1, p2}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkz;->ε:Lkz;

    .line 17
    .line 18
    invoke-interface {p1, p3, p4, p0, v0}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final ф()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
