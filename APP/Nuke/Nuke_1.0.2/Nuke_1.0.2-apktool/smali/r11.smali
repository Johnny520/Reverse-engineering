.class public final Lr11;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lj61;


# instance fields
.field public v:Lo11;

.field public w:Z


# virtual methods
.method public final D(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    invoke-interface {p2, p3}, Lif1;->X(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final U(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lr11;->v:Lo11;

    .line 2
    .line 3
    sget-object p1, Lo11;->h:Lo11;

    .line 4
    .line 5
    if-ne p0, p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p2, p3}, Lif1;->N(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-interface {p2, p3}, Lif1;->W(I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final e(Lpf1;Lif1;J)Lof1;
    .locals 3

    .line 1
    iget-object v0, p0, Lr11;->v:Lo11;

    .line 2
    .line 3
    sget-object v1, Lo11;->h:Lo11;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p3, p4}, Lfz;->g(J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-interface {p2, v0}, Lif1;->N(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p3, p4}, Lfz;->g(J)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-interface {p2, v0}, Lif1;->W(I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_0
    const/4 v1, 0x0

    .line 25
    if-gez v0, :cond_1

    .line 26
    .line 27
    move v0, v1

    .line 28
    :cond_1
    if-ltz v0, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const-string v2, "width must be >= 0"

    .line 32
    .line 33
    invoke-static {v2}, Lmz0;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_1
    const v2, 0x7fffffff

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v0, v1, v2}, Lgz;->h(IIII)J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    iget-boolean p0, p0, Lr11;->w:Z

    .line 44
    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    invoke-static {p3, p4, v0, v1}, Lgz;->e(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    :cond_3
    invoke-interface {p2, v0, v1}, Lif1;->e(J)Lsz1;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iget p2, p0, Lsz1;->h:I

    .line 56
    .line 57
    iget p3, p0, Lsz1;->i:I

    .line 58
    .line 59
    new-instance p4, Lpg;

    .line 60
    .line 61
    const/4 v0, 0x3

    .line 62
    invoke-direct {p4, p0, v0}, Lpg;-><init>(Lsz1;I)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lce0;->h:Lce0;

    .line 66
    .line 67
    invoke-interface {p1, p2, p3, p0, p4}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

.method public final g(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lr11;->v:Lo11;

    .line 2
    .line 3
    sget-object p1, Lo11;->h:Lo11;

    .line 4
    .line 5
    if-ne p0, p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p2, p3}, Lif1;->N(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-interface {p2, p3}, Lif1;->W(I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final p(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    invoke-interface {p2, p3}, Lif1;->f(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
