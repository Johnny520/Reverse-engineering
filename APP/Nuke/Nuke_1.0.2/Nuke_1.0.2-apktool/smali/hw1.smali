.class public final Lhw1;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lj61;


# instance fields
.field public v:F

.field public w:F

.field public x:F

.field public y:F

.field public z:Z


# virtual methods
.method public final e(Lpf1;Lif1;J)Lof1;
    .locals 5

    .line 1
    iget v0, p0, Lhw1;->v:F

    .line 2
    .line 3
    invoke-interface {p1, v0}, Le70;->T(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lhw1;->x:F

    .line 8
    .line 9
    invoke-interface {p1, v1}, Le70;->T(F)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    iget v0, p0, Lhw1;->w:F

    .line 15
    .line 16
    invoke-interface {p1, v0}, Le70;->T(F)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v2, p0, Lhw1;->y:F

    .line 21
    .line 22
    invoke-interface {p1, v2}, Le70;->T(F)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v2, v0

    .line 27
    neg-int v0, v1

    .line 28
    neg-int v3, v2

    .line 29
    invoke-static {v0, v3, p3, p4}, Lgz;->i(IIJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    invoke-interface {p2, v3, v4}, Lif1;->e(J)Lsz1;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget v0, p2, Lsz1;->h:I

    .line 38
    .line 39
    add-int/2addr v0, v1

    .line 40
    invoke-static {p3, p4, v0}, Lgz;->g(JI)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v1, p2, Lsz1;->i:I

    .line 45
    .line 46
    add-int/2addr v1, v2

    .line 47
    invoke-static {p3, p4, v1}, Lgz;->f(JI)I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    new-instance p4, Ld2;

    .line 52
    .line 53
    const/16 v1, 0x1a

    .line 54
    .line 55
    invoke-direct {p4, v1, p0, p2}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lce0;->h:Lce0;

    .line 59
    .line 60
    invoke-interface {p1, v0, p3, p0, p4}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
