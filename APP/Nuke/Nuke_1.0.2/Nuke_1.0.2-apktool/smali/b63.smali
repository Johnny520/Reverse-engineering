.class public final Lb63;
.super Lgx0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# virtual methods
.method public final a(Lz70;)V
    .locals 0

    .line 1
    iget-object p1, p1, Lz70;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lb42;

    .line 4
    .line 5
    iget-object p0, p0, Lgx0;->i:Lr30;

    .line 6
    .line 7
    invoke-virtual {p0}, Lr30;->g()Lq30;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p1, p0}, Lb42;->o(Lq30;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b()Lg21;
    .locals 0

    .line 1
    sget-object p0, Lg21;->m:Lg21;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()I
    .locals 0

    .line 1
    const/4 p0, 0x4

    .line 2
    return p0
.end method

.method public final d(Lz70;Lyn;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgx0;->i:Lr30;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr30;->g()Lq30;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p1, p1, Lz70;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lb42;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lb42;->l(Lq30;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p2}, Lyn;->d()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Liy0;->f()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 p0, 0x20

    .line 34
    .line 35
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lq30;->b()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p2, p0, v0}, Lyn;->c(Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lpp0;->K(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string v0, "  descriptor_idx: "

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const/4 v0, 0x4

    .line 64
    invoke-virtual {p2, p0, v0}, Lyn;->c(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-virtual {p2, p1}, Lyn;->j(I)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
