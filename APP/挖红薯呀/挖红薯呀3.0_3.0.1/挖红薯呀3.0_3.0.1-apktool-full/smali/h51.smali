.class public abstract Lh51;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lej;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lus0;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lej;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lej;-><init>(Lhw;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lh51;->a:Lej;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(Lpe0;Lx01;JJFFLmh;Lji;II)V
    .locals 1

    .line 1
    and-int/lit8 p10, p11, 0x2

    .line 2
    .line 3
    if-eqz p10, :cond_0

    .line 4
    .line 5
    sget-object p1, Lpf1;->i:Lfz;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p10, p11, 0x8

    .line 8
    .line 9
    if-eqz p10, :cond_1

    .line 10
    .line 11
    invoke-static {p2, p3, p9}, Lnf;->b(JLji;)J

    .line 12
    .line 13
    .line 14
    move-result-wide p4

    .line 15
    :cond_1
    and-int/lit8 p10, p11, 0x10

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    if-eqz p10, :cond_2

    .line 19
    .line 20
    move p6, v0

    .line 21
    :cond_2
    and-int/lit8 p10, p11, 0x20

    .line 22
    .line 23
    if-eqz p10, :cond_3

    .line 24
    .line 25
    move p7, v0

    .line 26
    :cond_3
    move-object p11, p9

    .line 27
    check-cast p11, Lpi;

    .line 28
    .line 29
    sget-object p9, Lh51;->a:Lej;

    .line 30
    .line 31
    invoke-virtual {p11, p9}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p10

    .line 35
    check-cast p10, Lnp;

    .line 36
    .line 37
    iget p10, p10, Lnp;->d:F

    .line 38
    .line 39
    add-float/2addr p10, p6

    .line 40
    sget-object p6, Lxj;->a:Lej;

    .line 41
    .line 42
    new-instance v0, Lff;

    .line 43
    .line 44
    invoke-direct {v0, p4, p5}, Lff;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p6, v0}, Lej;->a(Ljava/lang/Object;)Lct0;

    .line 48
    .line 49
    .line 50
    move-result-object p4

    .line 51
    new-instance p5, Lnp;

    .line 52
    .line 53
    invoke-direct {p5, p10}, Lnp;-><init>(F)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p9, p5}, Lej;->a(Ljava/lang/Object;)Lct0;

    .line 57
    .line 58
    .line 59
    move-result-object p5

    .line 60
    filled-new-array {p4, p5}, [Lct0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    move-wide p5, p2

    .line 65
    new-instance p2, Lf51;

    .line 66
    .line 67
    move p9, p7

    .line 68
    move p7, p10

    .line 69
    move-object p10, p8

    .line 70
    const/4 p8, 0x0

    .line 71
    move-object p3, p0

    .line 72
    move-object p4, p1

    .line 73
    invoke-direct/range {p2 .. p10}, Lf51;-><init>(Lpe0;Lx01;JFLrd0;FLmh;)V

    .line 74
    .line 75
    .line 76
    const p0, 0x1923bae6

    .line 77
    .line 78
    .line 79
    invoke-static {p0, p2, p11}, Lkl;->w(ILex;Lji;)Lmh;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const/16 p1, 0x38

    .line 84
    .line 85
    invoke-static {v0, p0, p11, p1}, Li4;->c([Lct0;Lww;Lji;I)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public static final b(Lpe0;Lx01;JLrd0;F)Lpe0;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p5, v0

    .line 3
    .line 4
    move v1, v0

    .line 5
    sget-object v0, Lme0;->a:Lme0;

    .line 6
    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    sget-wide v2, Lt81;->a:J

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    sget-wide v6, Lyx;->a:J

    .line 13
    .line 14
    move-wide v8, v6

    .line 15
    move-object v4, p1

    .line 16
    move v1, p5

    .line 17
    invoke-static/range {v0 .. v9}, Lp30;->I(Lpe0;FJLx01;ZJJ)Lpe0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v0

    .line 23
    :goto_0
    invoke-interface {p0, v1}, Lpe0;->c(Lpe0;)Lpe0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-nez p4, :cond_1

    .line 28
    .line 29
    invoke-interface {v1, v0}, Lpe0;->c(Lpe0;)Lpe0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0, p2, p3, p1}, Ls91;->l(Lpe0;JLx01;)Lpe0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const v1, 0x7e7ff

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p1, v1}, Lp30;->J(Lpe0;Lx01;I)Lpe0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    throw v0
.end method

.method public static final c(JFLpi;)J
    .locals 4

    .line 1
    sget-object v0, Lnf;->a:Lg41;

    .line 2
    .line 3
    invoke-virtual {p3, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Llf;

    .line 8
    .line 9
    sget-object v1, Lnf;->b:Lg41;

    .line 10
    .line 11
    invoke-virtual {p3, v1}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    check-cast p3, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    iget-wide v1, v0, Llf;->p:J

    .line 22
    .line 23
    invoke-static {p0, p1, v1, v2}, Lff;->c(JJ)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    if-eqz p3, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    invoke-static {p2, p0}, Lnp;->b(FF)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    return-wide v1

    .line 39
    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 40
    .line 41
    add-float/2addr p2, p0

    .line 42
    float-to-double p0, p2

    .line 43
    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide p0

    .line 47
    double-to-float p0, p0

    .line 48
    const/high16 p1, 0x40900000    # 4.5f

    .line 49
    .line 50
    mul-float/2addr p0, p1

    .line 51
    const/high16 p1, 0x40000000    # 2.0f

    .line 52
    .line 53
    add-float/2addr p0, p1

    .line 54
    const/high16 p1, 0x42c80000    # 100.0f

    .line 55
    .line 56
    div-float/2addr p0, p1

    .line 57
    iget-wide p1, v0, Llf;->t:J

    .line 58
    .line 59
    invoke-static {p0, p1, p2}, Lff;->b(FJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide p0

    .line 63
    invoke-static {p0, p1, v1, v2}, Lp30;->u(JJ)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    :cond_1
    return-wide p0
.end method
