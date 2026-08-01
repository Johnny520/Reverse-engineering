.class public final Ljp0;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lr50;


# instance fields
.field public r:F

.field public s:Ldp0;


# virtual methods
.method public final Y(Lzd0;Lsd0;J)Lyd0;
    .locals 3

    .line 1
    iget-object v0, p0, Ljp0;->s:Ldp0;

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lw31;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eq v2, v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Lw31;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget p0, p0, Ljp0;->r:F

    .line 31
    .line 32
    mul-float/2addr v0, p0

    .line 33
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move p0, v1

    .line 39
    :goto_0
    if-eq p0, v1, :cond_1

    .line 40
    .line 41
    move v0, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-static {p3, p4}, Lpj;->j(J)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    :goto_1
    invoke-static {p3, p4}, Lpj;->i(J)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eq p0, v1, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-static {p3, p4}, Lpj;->h(J)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    :goto_2
    invoke-static {p3, p4}, Lpj;->g(J)I

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    invoke-static {v0, p0, v2, p3}, Lqj;->a(IIII)J

    .line 63
    .line 64
    .line 65
    move-result-wide p3

    .line 66
    invoke-interface {p2, p3, p4}, Lsd0;->e(J)Lxq0;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iget p2, p0, Lxq0;->d:I

    .line 71
    .line 72
    iget p3, p0, Lxq0;->e:I

    .line 73
    .line 74
    new-instance p4, Lx9;

    .line 75
    .line 76
    const/4 v0, 0x3

    .line 77
    invoke-direct {p4, p0, v0}, Lx9;-><init>(Lxq0;I)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Lis;->d:Lis;

    .line 81
    .line 82
    invoke-interface {p1, p2, p3, p0, p4}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method
