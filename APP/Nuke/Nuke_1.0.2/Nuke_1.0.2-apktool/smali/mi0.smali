.class public final Lmi0;
.super Lag1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# virtual methods
.method public final a(Lz70;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lz70;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb42;

    .line 4
    .line 5
    iget-object v1, p0, Lgx0;->i:Lr30;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lb42;->p(Lr30;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Lz70;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lb42;

    .line 13
    .line 14
    iget-object p0, p0, Lag1;->j:Lm30;

    .line 15
    .line 16
    iget-object v1, p0, Lm30;->i:Lo30;

    .line 17
    .line 18
    iget-object v1, v1, Lo30;->h:Lq30;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lb42;->o(Lq30;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, Lz70;->i:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lb42;

    .line 26
    .line 27
    check-cast p0, Lc30;

    .line 28
    .line 29
    invoke-virtual {p0}, Lc30;->a()Lo43;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p1, p0}, Lb42;->q(Lo43;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final b()Lg21;
    .locals 0

    .line 1
    sget-object p0, Lg21;->o:Lg21;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lz70;)I
    .locals 0

    .line 1
    iget-object p1, p1, Lz70;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lb42;

    .line 4
    .line 5
    iget-object p0, p0, Lag1;->j:Lm30;

    .line 6
    .line 7
    check-cast p0, Lc30;

    .line 8
    .line 9
    invoke-virtual {p0}, Lc30;->a()Lo43;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1, p0}, Lb42;->n(Lo43;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final i()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "type_idx"

    .line 2
    .line 3
    return-object p0
.end method
