.class public abstract Lyf3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# direct methods
.method public static a(I)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x17

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x14

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x16

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x1e

    .line 18
    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x1d

    .line 22
    .line 23
    if-eq p0, v0, :cond_1

    .line 24
    .line 25
    const/16 v0, 0x18

    .line 26
    .line 27
    if-eq p0, v0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x15

    .line 30
    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public static final b(Lpx;Lin0;)V
    .locals 1

    .line 1
    new-instance v0, Lw1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lw1;-><init>(Lin0;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, Lgo0;

    .line 7
    .line 8
    sget-object p1, La83;->a:La83;

    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, Lgo0;->b(Lmn0;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final c(Lpx;Lmn0;Ljava/lang/Object;)V
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lgo0;

    .line 3
    .line 4
    iget-boolean v0, v0, Lgo0;->S:Z

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    check-cast v0, Lgo0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0, p2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    :goto_0
    check-cast p0, Lgo0;

    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Lgo0;->b(Lmn0;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
