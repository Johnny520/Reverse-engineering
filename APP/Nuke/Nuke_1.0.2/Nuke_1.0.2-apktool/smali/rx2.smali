.class public final Lrx2;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lx22;

    .line 2
    .line 3
    check-cast p2, Lrs1;

    .line 4
    .line 5
    iget-wide p0, p2, Lrs1;->a:J

    .line 6
    .line 7
    check-cast p3, Lt00;

    .line 8
    .line 9
    new-instance p0, Lrx2;

    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, La83;->a:La83;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lrx2;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-object p1
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, La83;->a:La83;

    .line 5
    .line 6
    return-object p0
.end method
