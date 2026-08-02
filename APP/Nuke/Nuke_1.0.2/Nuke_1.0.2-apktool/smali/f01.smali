.class public final Lf01;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lj61;
.implements Ld43;


# instance fields
.field public v:Lvd3;

.field public w:Lvd3;

.field public x:Lvd3;


# virtual methods
.method public final E0()V
    .locals 2

    .line 1
    new-instance v0, La01;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, La01;-><init>(Lf01;I)V

    .line 5
    .line 6
    .line 7
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 8
    .line 9
    invoke-static {p0, v1, v0}, Ltb3;->c(Lt60;Ljava/lang/Object;Lin0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lf01;->M0()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final F0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf01;->v:Lvd3;

    .line 2
    .line 3
    iput-object v0, p0, Lf01;->w:Lvd3;

    .line 4
    .line 5
    new-instance v0, La01;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, La01;-><init>(Lf01;I)V

    .line 9
    .line 10
    .line 11
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Ltb3;->e(Lth1;Ljava/lang/String;Lin0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final G0()V
    .locals 1

    .line 1
    sget-object v0, Ltl;->h:Lhj0;

    .line 2
    .line 3
    iput-object v0, p0, Lf01;->v:Lvd3;

    .line 4
    .line 5
    return-void
.end method

.method public final M0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf01;->v:Lvd3;

    .line 2
    .line 3
    iget-object v1, p0, Lf01;->x:Lvd3;

    .line 4
    .line 5
    new-instance v2, Lz73;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, Lz73;-><init>(Lvd3;Lvd3;)V

    .line 8
    .line 9
    .line 10
    iput-object v2, p0, Lf01;->w:Lvd3;

    .line 11
    .line 12
    new-instance v0, La01;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, La01;-><init>(Lf01;I)V

    .line 16
    .line 17
    .line 18
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 19
    .line 20
    invoke-static {p0, v1, v0}, Ltb3;->e(Lth1;Ljava/lang/String;Lin0;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Lgf1;->A(Lj61;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final e(Lpf1;Lif1;J)Lof1;
    .locals 6

    .line 1
    iget-object v0, p0, Lf01;->w:Lvd3;

    .line 2
    .line 3
    invoke-interface {p1}, Lm11;->getLayoutDirection()Ld61;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, p1, v1}, Lvd3;->a(Lpf1;Ld61;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lf01;->v:Lvd3;

    .line 12
    .line 13
    invoke-interface {p1}, Lm11;->getLayoutDirection()Ld61;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v1, p1, v2}, Lvd3;->a(Lpf1;Ld61;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    sub-int/2addr v0, v1

    .line 22
    iget-object v1, p0, Lf01;->w:Lvd3;

    .line 23
    .line 24
    invoke-interface {v1, p1}, Lvd3;->b(Lpf1;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iget-object v2, p0, Lf01;->v:Lvd3;

    .line 29
    .line 30
    invoke-interface {v2, p1}, Lvd3;->b(Lpf1;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    sub-int/2addr v1, v2

    .line 35
    iget-object v2, p0, Lf01;->w:Lvd3;

    .line 36
    .line 37
    invoke-interface {p1}, Lm11;->getLayoutDirection()Ld61;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v2, p1, v3}, Lvd3;->c(Lpf1;Ld61;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    iget-object v3, p0, Lf01;->v:Lvd3;

    .line 46
    .line 47
    invoke-interface {p1}, Lm11;->getLayoutDirection()Ld61;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {v3, p1, v4}, Lvd3;->c(Lpf1;Ld61;)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    sub-int/2addr v2, v3

    .line 56
    iget-object v3, p0, Lf01;->w:Lvd3;

    .line 57
    .line 58
    invoke-interface {v3, p1}, Lvd3;->d(Lpf1;)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iget-object p0, p0, Lf01;->v:Lvd3;

    .line 63
    .line 64
    invoke-interface {p0, p1}, Lvd3;->d(Lpf1;)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    sub-int/2addr v3, p0

    .line 69
    add-int/2addr v2, v0

    .line 70
    add-int/2addr v3, v1

    .line 71
    neg-int p0, v2

    .line 72
    neg-int v4, v3

    .line 73
    invoke-static {p0, v4, p3, p4}, Lgz;->i(IIJ)J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    invoke-interface {p2, v4, v5}, Lif1;->e(J)Lsz1;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iget p2, p0, Lsz1;->h:I

    .line 82
    .line 83
    add-int/2addr p2, v2

    .line 84
    invoke-static {p3, p4, p2}, Lgz;->g(JI)I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    iget v2, p0, Lsz1;->i:I

    .line 89
    .line 90
    add-int/2addr v2, v3

    .line 91
    invoke-static {p3, p4, v2}, Lgz;->f(JI)I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    new-instance p4, Le01;

    .line 96
    .line 97
    const/4 v2, 0x0

    .line 98
    invoke-direct {p4, v0, v1, v2, p0}, Le01;-><init>(IIILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Lce0;->h:Lce0;

    .line 102
    .line 103
    invoke-interface {p1, p2, p3, p0, p4}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0
.end method

.method public final r()Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p0, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 2
    .line 3
    return-object p0
.end method
