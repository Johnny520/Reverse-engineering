.class public final Lvs1;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lj61;


# instance fields
.field public v:F

.field public w:F

.field public x:Z


# virtual methods
.method public final B0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final e(Lpf1;Lif1;J)Lof1;
    .locals 2

    .line 1
    invoke-interface {p2, p3, p4}, Lif1;->e(J)Lsz1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p3, p2, Lsz1;->h:I

    .line 6
    .line 7
    iget p4, p2, Lsz1;->i:I

    .line 8
    .line 9
    new-instance v0, Ld2;

    .line 10
    .line 11
    const/16 v1, 0x18

    .line 12
    .line 13
    invoke-direct {v0, v1, p0, p2}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lce0;->h:Lce0;

    .line 17
    .line 18
    invoke-interface {p1, p3, p4, p0, v0}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
