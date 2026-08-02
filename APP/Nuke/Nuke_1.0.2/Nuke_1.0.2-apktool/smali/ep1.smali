.class public final Lep1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lj20;

.field public final b:Lsc;

.field public c:J

.field public d:Lzt2;

.field public e:J

.field public f:Lfp1;

.field public g:F

.field public final h:Lnx1;

.field public final i:Lnx1;

.field public final j:Lnx1;

.field public final k:Lnx1;


# direct methods
.method public constructor <init>(Lj20;Z)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lep1;->a:Lj20;

    .line 8
    .line 9
    const/high16 p1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    move v0, p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    new-instance v1, Lsc;

    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v2, Lrg3;->n:Ln43;

    .line 23
    .line 24
    const v3, 0x3c23d70a    # 0.01f

    .line 25
    .line 26
    .line 27
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const/16 v4, 0x8

    .line 32
    .line 33
    invoke-direct {v1, v0, v2, v3, v4}, Lsc;-><init>(Ljava/lang/Object;Ln43;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lep1;->b:Lsc;

    .line 37
    .line 38
    const-wide/16 v0, 0x0

    .line 39
    .line 40
    iput-wide v0, p0, Lep1;->c:J

    .line 41
    .line 42
    iput p1, p0, Lep1;->g:F

    .line 43
    .line 44
    new-instance p1, Lrs1;

    .line 45
    .line 46
    invoke-direct {p1, v0, v1}, Lrs1;-><init>(J)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lep1;->h:Lnx1;

    .line 54
    .line 55
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lep1;->i:Lnx1;

    .line 64
    .line 65
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iput-object p2, p0, Lep1;->j:Lnx1;

    .line 72
    .line 73
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lep1;->k:Lnx1;

    .line 78
    .line 79
    return-void
.end method

.method public static final a(Lep1;JLu00;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p3, Lcp1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p3

    .line 9
    check-cast v0, Lcp1;

    .line 10
    .line 11
    iget v1, v0, Lcp1;->n:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lcp1;->n:I

    .line 21
    .line 22
    :goto_0
    move-object v5, v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    new-instance v0, Lcp1;

    .line 25
    .line 26
    invoke-direct {v0, p0, p3}, Lcp1;-><init>(Lep1;Lu00;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    iget-object p3, v5, Lcp1;->l:Ljava/lang/Object;

    .line 31
    .line 32
    iget v0, v5, Lcp1;->n:I

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    const/high16 v7, 0x3f800000    # 1.0f

    .line 36
    .line 37
    const/4 v8, 0x2

    .line 38
    const/4 v2, 0x1

    .line 39
    sget-object v9, Lk20;->h:Lk20;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    if-eq v0, v2, :cond_2

    .line 44
    .line 45
    if-ne v0, v8, :cond_1

    .line 46
    .line 47
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_2
    iget-wide p1, v5, Lcp1;->k:J

    .line 58
    .line 59
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object p3, v1

    .line 67
    iget-object v1, p0, Lep1;->b:Lsc;

    .line 68
    .line 69
    move v0, v2

    .line 70
    new-instance v2, Ljava/lang/Float;

    .line 71
    .line 72
    invoke-direct {v2, v7}, Ljava/lang/Float;-><init>(F)V

    .line 73
    .line 74
    .line 75
    const/high16 v3, 0x432a0000    # 170.0f

    .line 76
    .line 77
    const/4 v4, 0x4

    .line 78
    const v6, 0x3f2e147b    # 0.68f

    .line 79
    .line 80
    .line 81
    invoke-static {v6, v3, p3, v4}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    new-instance v4, Lbp1;

    .line 86
    .line 87
    invoke-direct {v4, p0, p1, p2}, Lbp1;-><init>(Lep1;J)V

    .line 88
    .line 89
    .line 90
    iput-wide p1, v5, Lcp1;->k:J

    .line 91
    .line 92
    iput v0, v5, Lcp1;->n:I

    .line 93
    .line 94
    const/4 v6, 0x4

    .line 95
    invoke-static/range {v1 .. v6}, Lsc;->c(Lsc;Ljava/lang/Object;Lhd;Lin0;Lu00;I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    if-ne p3, v9, :cond_4

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    :goto_2
    iget-object p3, p0, Lep1;->b:Lsc;

    .line 103
    .line 104
    new-instance v0, Ljava/lang/Float;

    .line 105
    .line 106
    invoke-direct {v0, v7}, Ljava/lang/Float;-><init>(F)V

    .line 107
    .line 108
    .line 109
    iput-wide p1, v5, Lcp1;->k:J

    .line 110
    .line 111
    iput v8, v5, Lcp1;->n:I

    .line 112
    .line 113
    invoke-virtual {p3, v5, v0}, Lsc;->e(Lt00;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-ne p1, v9, :cond_5

    .line 118
    .line 119
    :goto_3
    return-object v9

    .line 120
    :cond_5
    :goto_4
    const/4 p1, 0x0

    .line 121
    invoke-virtual {p0, p1}, Lep1;->f(Z)V

    .line 122
    .line 123
    .line 124
    sget-object p0, La83;->a:La83;

    .line 125
    .line 126
    return-object p0
.end method


# virtual methods
.method public final b(Lrs1;Lxm0;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lep1;->c()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Lep1;->f:Lfp1;

    .line 11
    .line 12
    sget-object v1, Lfp1;->i:Lfp1;

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-wide v2, p1, Lrs1;->a:J

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-wide v2, p0, Lep1;->c:J

    .line 23
    .line 24
    :goto_0
    new-instance p1, Lrs1;

    .line 25
    .line 26
    invoke-direct {p1, v2, v3}, Lrs1;-><init>(J)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lep1;->h:Lnx1;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Ldp1;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-direct {p1, p0, p2, v0, v2}, Ldp1;-><init>(Lep1;Lxm0;Lt00;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1, p1}, Lep1;->d(Lfp1;Lmn0;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_1
    return-void
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lep1;->i:Lnx1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final d(Lfp1;Lmn0;)V
    .locals 10

    .line 1
    iget-wide v0, p0, Lep1;->e:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    add-long v6, v0, v2

    .line 6
    .line 7
    iput-wide v6, p0, Lep1;->e:J

    .line 8
    .line 9
    iget-object v0, p0, Lep1;->d:Lzt2;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lr21;->c(Ljava/util/concurrent/CancellationException;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lep1;->f:Lfp1;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Lep1;->g(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lep1;->f(Z)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Ldp1;

    .line 27
    .line 28
    const/4 v9, 0x0

    .line 29
    move-object v8, p0

    .line 30
    move-object v5, p2

    .line 31
    invoke-direct/range {v4 .. v9}, Ldp1;-><init>(Lmn0;JLep1;Lt00;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x3

    .line 35
    iget-object p1, v8, Lep1;->a:Lj20;

    .line 36
    .line 37
    invoke-static {p1, v1, v4, p0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iput-object p0, v8, Lep1;->d:Lzt2;

    .line 42
    .line 43
    return-void
.end method

.method public final e(JLxm0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lep1;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lep1;->f:Lfp1;

    .line 8
    .line 9
    sget-object v1, Lfp1;->h:Lfp1;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iput-wide p1, p0, Lep1;->c:J

    .line 15
    .line 16
    new-instance v0, Lrs1;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lrs1;-><init>(J)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lep1;->h:Lnx1;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Ldp1;

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-direct {p1, p0, p3, p2, v0}, Ldp1;-><init>(Lep1;Lxm0;Lt00;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1, p1}, Lep1;->d(Lfp1;Lmn0;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public final f(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lep1;->k:Lnx1;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final g(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lep1;->j:Lnx1;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
