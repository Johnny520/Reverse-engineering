.class public abstract Ldm;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lrk1;

.field public static final b:Lrk1;

.field public static final c:Lk8;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ldm;->c(Z)Lrk1;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Ldm;->a:Lrk1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Ldm;->c(Z)Lrk1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Ldm;->b:Lrk1;

    .line 14
    .line 15
    sget-object v0, Lk8;->d:Lk8;

    .line 16
    .line 17
    sput-object v0, Ldm;->c:Lk8;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(Luh1;Lpx;I)V
    .locals 7

    .line 1
    check-cast p1, Lgo0;

    .line 2
    .line 3
    const v0, -0xc96ce69

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    or-int/2addr v0, p2

    .line 20
    and-int/lit8 v2, v0, 0x3

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x1

    .line 24
    if-eq v2, v1, :cond_1

    .line 25
    .line 26
    move v1, v4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v1, v3

    .line 29
    :goto_1
    and-int/2addr v0, v4

    .line 30
    invoke-virtual {p1, v0, v1}, Lgo0;->O(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    iget-wide v0, p1, Lgo0;->T:J

    .line 37
    .line 38
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {p1, p0}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p1}, Lgo0;->l()Lyy1;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    sget-object v5, Lhx;->c:Lgx;

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v5, Lgx;->b:Ljy;

    .line 56
    .line 57
    invoke-virtual {p1}, Lgo0;->Z()V

    .line 58
    .line 59
    .line 60
    iget-boolean v6, p1, Lgo0;->S:Z

    .line 61
    .line 62
    if-eqz v6, :cond_2

    .line 63
    .line 64
    invoke-virtual {p1, v5}, Lgo0;->k(Lxm0;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-virtual {p1}, Lgo0;->i0()V

    .line 69
    .line 70
    .line 71
    :goto_2
    sget-object v5, Lgx;->e:Llc;

    .line 72
    .line 73
    sget-object v6, Ldm;->c:Lk8;

    .line 74
    .line 75
    invoke-static {p1, v5, v6}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object v5, Lgx;->d:Llc;

    .line 79
    .line 80
    invoke-static {p1, v5, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object v2, Lgx;->g:Lv6;

    .line 84
    .line 85
    invoke-static {p1, v2}, Lyf3;->b(Lpx;Lin0;)V

    .line 86
    .line 87
    .line 88
    sget-object v2, Lgx;->c:Llc;

    .line 89
    .line 90
    invoke-static {p1, v2, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sget-object v1, Lgx;->f:Llc;

    .line 98
    .line 99
    invoke-static {p1, v1, v0}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v4}, Lgo0;->p(Z)V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_3
    invoke-virtual {p1}, Lgo0;->R()V

    .line 107
    .line 108
    .line 109
    :goto_3
    invoke-virtual {p1}, Lgo0;->r()Lb62;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-eqz p1, :cond_4

    .line 114
    .line 115
    new-instance v0, Lcm;

    .line 116
    .line 117
    invoke-direct {v0, p0, p2, v3}, Lcm;-><init>(Luh1;II)V

    .line 118
    .line 119
    .line 120
    iput-object v0, p1, Lb62;->d:Lmn0;

    .line 121
    .line 122
    :cond_4
    return-void
.end method

.method public static final b(Lrz1;Lsz1;Lif1;Ld61;IILr5;)V
    .locals 7

    .line 1
    invoke-interface {p2}, Lif1;->i()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    instance-of v0, p2, Lbm;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p2, Lbm;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, 0x0

    .line 13
    :goto_0
    if-eqz p2, :cond_2

    .line 14
    .line 15
    iget-object p2, p2, Lbm;->v:Lrk;

    .line 16
    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object v0, p2

    .line 21
    goto :goto_2

    .line 22
    :cond_2
    :goto_1
    move-object v0, p6

    .line 23
    :goto_2
    iget p2, p1, Lsz1;->h:I

    .line 24
    .line 25
    iget p6, p1, Lsz1;->i:I

    .line 26
    .line 27
    int-to-long v1, p2

    .line 28
    const/16 p2, 0x20

    .line 29
    .line 30
    shl-long/2addr v1, p2

    .line 31
    int-to-long v3, p6

    .line 32
    const-wide v5, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v3, v5

    .line 38
    or-long/2addr v1, v3

    .line 39
    int-to-long v3, p4

    .line 40
    shl-long/2addr v3, p2

    .line 41
    int-to-long p4, p5

    .line 42
    and-long/2addr p4, v5

    .line 43
    or-long/2addr v3, p4

    .line 44
    move-object v5, p3

    .line 45
    invoke-interface/range {v0 .. v5}, Lr5;->a(JJLd61;)J

    .line 46
    .line 47
    .line 48
    move-result-wide p2

    .line 49
    invoke-static {p0, p1, p2, p3}, Lrz1;->h(Lrz1;Lsz1;J)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static final c(Z)Lrk1;
    .locals 3

    .line 1
    new-instance v0, Lrk1;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lrk1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lsn;->j:Lrk;

    .line 9
    .line 10
    new-instance v2, Lgm;

    .line 11
    .line 12
    invoke-direct {v2, v1, p0}, Lgm;-><init>(Lr5;Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, Lsn;->k:Lrk;

    .line 19
    .line 20
    new-instance v2, Lgm;

    .line 21
    .line 22
    invoke-direct {v2, v1, p0}, Lgm;-><init>(Lr5;Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, Lsn;->l:Lrk;

    .line 29
    .line 30
    new-instance v2, Lgm;

    .line 31
    .line 32
    invoke-direct {v2, v1, p0}, Lgm;-><init>(Lr5;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v1, Lsn;->m:Lrk;

    .line 39
    .line 40
    new-instance v2, Lgm;

    .line 41
    .line 42
    invoke-direct {v2, v1, p0}, Lgm;-><init>(Lr5;Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Lsn;->n:Lrk;

    .line 49
    .line 50
    new-instance v2, Lgm;

    .line 51
    .line 52
    invoke-direct {v2, v1, p0}, Lgm;-><init>(Lr5;Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lsn;->o:Lrk;

    .line 59
    .line 60
    new-instance v2, Lgm;

    .line 61
    .line 62
    invoke-direct {v2, v1, p0}, Lgm;-><init>(Lr5;Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object v1, Lsn;->p:Lrk;

    .line 69
    .line 70
    new-instance v2, Lgm;

    .line 71
    .line 72
    invoke-direct {v2, v1, p0}, Lgm;-><init>(Lr5;Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v2}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object v1, Lsn;->q:Lrk;

    .line 79
    .line 80
    new-instance v2, Lgm;

    .line 81
    .line 82
    invoke-direct {v2, v1, p0}, Lgm;-><init>(Lr5;Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object v1, Lsn;->r:Lrk;

    .line 89
    .line 90
    new-instance v2, Lgm;

    .line 91
    .line 92
    invoke-direct {v2, v1, p0}, Lgm;-><init>(Lr5;Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method

.method public static final d(Lr5;Z)Lnf1;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Ldm;->a:Lrk1;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Ldm;->b:Lrk1;

    .line 7
    .line 8
    :goto_0
    invoke-virtual {v0, p0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lnf1;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, Lgm;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, Lgm;-><init>(Lr5;Z)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-object v0
.end method
