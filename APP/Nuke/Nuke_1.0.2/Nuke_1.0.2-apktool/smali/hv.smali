.class public final Lhv;
.super Lr21;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ln60;


# virtual methods
.method public final g0(Lu00;)Ljava/lang/Object;
    .locals 2

    .line 1
    :cond_0
    sget-object v0, Lr21;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lcy0;

    .line 8
    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    instance-of p0, v0, Lov;

    .line 12
    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    invoke-static {v0}, Leu;->e0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    check-cast v0, Lov;

    .line 21
    .line 22
    iget-object p0, v0, Lov;->a:Ljava/lang/Throwable;

    .line 23
    .line 24
    throw p0

    .line 25
    :cond_2
    invoke-virtual {p0, v0}, Lr21;->c0(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ltz v0, :cond_0

    .line 30
    .line 31
    new-instance v0, Lo21;

    .line 32
    .line 33
    invoke-static {p1}, Lgf1;->z(Lt00;)Lt00;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {v0, p1, p0}, Lo21;-><init>(Lt00;Lhv;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lmp;->u()V

    .line 41
    .line 42
    .line 43
    new-instance p1, Lfa0;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    invoke-direct {p1, v1, v0}, Lfa0;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-static {p0, v1, p1}, Lxe1;->H(Lk21;ZLn21;)Lca0;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    new-instance p1, Lhp;

    .line 55
    .line 56
    invoke-direct {p1, v1, p0}, Lhp;-><init>(ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1}, Lmp;->x(Lko1;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lmp;->t()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    :goto_0
    return-object p0
.end method
