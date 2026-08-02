.class public final Lam2;
.super Lu60;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lg51;
.implements Lon2;
.implements Lr12;
.implements Lwy0;
.implements Lgy;
.implements Luo0;


# instance fields
.field public A:Lbk1;

.field public B:Lvo0;

.field public C:Ljn;

.field public D:Lfc0;

.field public E:Z

.field public F:Z

.field public G:Lib0;

.field public H:Llb0;

.field public I:Lkb0;

.field public J:Ljb0;

.field public K:Ltl;

.field public L:Lhh1;

.field public M:J

.field public N:Lms0;

.field public O:Lvy0;

.field public P:J

.field public Q:Ls8;

.field public R:Ln50;

.field public final S:Ltm1;

.field public final T:Ln50;

.field public final U:Lim2;

.field public final V:Lox;

.field public final W:Lpl0;

.field public final X:Lg00;

.field public Y:Ls9;

.field public Z:Lyl2;

.field public a0:Lsi1;

.field public b0:Ld33;

.field public x:Lqv1;

.field public y:Lml2;

.field public z:Z


# direct methods
.method public constructor <init>(Ls8;Ln50;Lbk1;Lqv1;Lbm2;ZZ)V
    .locals 10

    .line 1
    move/from16 v9, p6

    .line 2
    .line 3
    sget-object v0, Lul2;->a:Lml2;

    .line 4
    .line 5
    invoke-direct {p0}, Lu60;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p4, p0, Lam2;->x:Lqv1;

    .line 9
    .line 10
    iput-object v0, p0, Lam2;->y:Lml2;

    .line 11
    .line 12
    iput-boolean v9, p0, Lam2;->z:Z

    .line 13
    .line 14
    iput-object p3, p0, Lam2;->A:Lbk1;

    .line 15
    .line 16
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide v0, p0, Lam2;->M:J

    .line 22
    .line 23
    const-wide/16 v0, 0x0

    .line 24
    .line 25
    iput-wide v0, p0, Lam2;->P:J

    .line 26
    .line 27
    iput-object p1, p0, Lam2;->Q:Ls8;

    .line 28
    .line 29
    iput-object p2, p0, Lam2;->R:Ln50;

    .line 30
    .line 31
    new-instance v6, Ltm1;

    .line 32
    .line 33
    invoke-direct {v6}, Ltm1;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v6, p0, Lam2;->S:Ltm1;

    .line 37
    .line 38
    new-instance v0, Ln50;

    .line 39
    .line 40
    sget-object v1, Lul2;->d:Lsl2;

    .line 41
    .line 42
    new-instance v2, Lhh1;

    .line 43
    .line 44
    invoke-direct {v2, v1}, Lhh1;-><init>(Le70;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Lr40;

    .line 48
    .line 49
    invoke-direct {v1, v2}, Lr40;-><init>(Lhh1;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1}, Ln50;-><init>(Lr40;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lam2;->T:Ln50;

    .line 56
    .line 57
    iget-object v2, p0, Lam2;->Q:Ls8;

    .line 58
    .line 59
    iget-object v1, p0, Lam2;->R:Ln50;

    .line 60
    .line 61
    if-nez v1, :cond_0

    .line 62
    .line 63
    move-object v3, v0

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move-object v3, v1

    .line 66
    :goto_0
    new-instance v0, Lim2;

    .line 67
    .line 68
    new-instance v8, Lwl2;

    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    invoke-direct {v8, p0, v1}, Lwl2;-><init>(Lam2;I)V

    .line 72
    .line 73
    .line 74
    move-object v7, p0

    .line 75
    move-object v4, p4

    .line 76
    move-object v1, p5

    .line 77
    move/from16 v5, p7

    .line 78
    .line 79
    invoke-direct/range {v0 .. v8}, Lim2;-><init>(Lbm2;Ls8;Ln50;Lqv1;ZLtm1;Lam2;Lwl2;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Lam2;->U:Lim2;

    .line 83
    .line 84
    new-instance v1, Lox;

    .line 85
    .line 86
    invoke-direct {v1, v0, v9}, Lox;-><init>(Lim2;Z)V

    .line 87
    .line 88
    .line 89
    iput-object v1, p0, Lam2;->V:Lox;

    .line 90
    .line 91
    new-instance v2, Lpl0;

    .line 92
    .line 93
    const/16 v3, 0xa

    .line 94
    .line 95
    const/4 v5, 0x2

    .line 96
    const/4 v8, 0x0

    .line 97
    invoke-direct {v2, v5, v8, v3}, Lpl0;-><init>(ILmn0;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v2}, Lu60;->M0(Lt60;)Lt60;

    .line 101
    .line 102
    .line 103
    iput-object v2, p0, Lam2;->W:Lpl0;

    .line 104
    .line 105
    new-instance v2, Lg00;

    .line 106
    .line 107
    new-instance v3, Lwl2;

    .line 108
    .line 109
    const/4 v5, 0x1

    .line 110
    invoke-direct {v3, p0, v5}, Lwl2;-><init>(Lam2;I)V

    .line 111
    .line 112
    .line 113
    move/from16 v5, p7

    .line 114
    .line 115
    invoke-direct {v2, p4, v0, v5, v3}, Lg00;-><init>(Lqv1;Lim2;ZLwl2;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v2}, Lu60;->M0(Lt60;)Lt60;

    .line 119
    .line 120
    .line 121
    iput-object v2, p0, Lam2;->X:Lg00;

    .line 122
    .line 123
    new-instance v0, Lxm1;

    .line 124
    .line 125
    invoke-direct {v0, v1, v6}, Lxm1;-><init>(Lqm1;Ltm1;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v0}, Lu60;->M0(Lt60;)Lt60;

    .line 129
    .line 130
    .line 131
    new-instance v0, Lsm;

    .line 132
    .line 133
    invoke-direct {v0}, Lth1;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object v2, v0, Lsm;->v:Lg00;

    .line 137
    .line 138
    invoke-virtual {p0, v0}, Lu60;->M0(Lt60;)Lt60;

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public static final P0(Lam2;Lu00;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lac0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lac0;

    .line 7
    .line 8
    iget v1, v0, Lac0;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lac0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lac0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lac0;-><init>(Lam2;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lac0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lac0;->m:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lam2;->D:Lfc0;

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    iget-object v1, p0, Lam2;->A:Lbk1;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    new-instance v4, Lec0;

    .line 57
    .line 58
    invoke-direct {v4, p1}, Lec0;-><init>(Lfc0;)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, Lac0;->m:I

    .line 62
    .line 63
    invoke-virtual {v1, v4, v0}, Lbk1;->a(Lj11;Lt00;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget-object v0, Lk20;->h:Lk20;

    .line 68
    .line 69
    if-ne p1, v0, :cond_3

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_3
    :goto_1
    iput-object v2, p0, Lam2;->D:Lfc0;

    .line 73
    .line 74
    :cond_4
    new-instance p1, Lpb0;

    .line 75
    .line 76
    const-wide/16 v0, 0x0

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-direct {p1, v0, v1, v3}, Lpb0;-><init>(JZ)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lam2;->S:Ltm1;

    .line 83
    .line 84
    invoke-virtual {v0}, Ltm1;->c()Lj20;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v1, La2;

    .line 89
    .line 90
    const/16 v3, 0x18

    .line 91
    .line 92
    invoke-direct {v1, p1, p0, v2, v3}, La2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 93
    .line 94
    .line 95
    const/4 p0, 0x3

    .line 96
    invoke-static {v0, v2, v1, p0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 97
    .line 98
    .line 99
    sget-object p0, La83;->a:La83;

    .line 100
    .line 101
    return-object p0
.end method

.method public static final Q0(Lam2;Lob0;Lu00;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lbc0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lbc0;

    .line 7
    .line 8
    iget v1, v0, Lbc0;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lbc0;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lbc0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lbc0;-><init>(Lam2;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lbc0;->m:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lbc0;->o:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lk20;->h:Lk20;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lbc0;->l:Lfc0;

    .line 40
    .line 41
    iget-object v0, v0, Lbc0;->k:Lob0;

    .line 42
    .line 43
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    iget-object p1, v0, Lbc0;->k:Lob0;

    .line 55
    .line 56
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Lam2;->D:Lfc0;

    .line 64
    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    iget-object v1, p0, Lam2;->A:Lbk1;

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    new-instance v5, Lec0;

    .line 72
    .line 73
    invoke-direct {v5, p2}, Lec0;-><init>(Lfc0;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, v0, Lbc0;->k:Lob0;

    .line 77
    .line 78
    iput v3, v0, Lbc0;->o:I

    .line 79
    .line 80
    invoke-virtual {v1, v5, v0}, Lbk1;->a(Lj11;Lt00;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-ne p2, v4, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    :goto_1
    new-instance p2, Lfc0;

    .line 88
    .line 89
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Lam2;->A:Lbk1;

    .line 93
    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    iput-object p1, v0, Lbc0;->k:Lob0;

    .line 97
    .line 98
    iput-object p2, v0, Lbc0;->l:Lfc0;

    .line 99
    .line 100
    iput v2, v0, Lbc0;->o:I

    .line 101
    .line 102
    invoke-virtual {v1, p2, v0}, Lbk1;->a(Lj11;Lt00;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-ne v0, v4, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v4

    .line 109
    :cond_5
    move-object v0, p1

    .line 110
    move-object p1, p2

    .line 111
    :goto_3
    move-object p2, p1

    .line 112
    move-object p1, v0

    .line 113
    :cond_6
    iput-object p2, p0, Lam2;->D:Lfc0;

    .line 114
    .line 115
    iget-wide p0, p1, Lob0;->a:J

    .line 116
    .line 117
    sget-object p0, La83;->a:La83;

    .line 118
    .line 119
    return-object p0
.end method

.method public static final R0(Lam2;Lpb0;Lu00;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lcc0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcc0;

    .line 7
    .line 8
    iget v1, v0, Lcc0;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcc0;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcc0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcc0;-><init>(Lam2;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcc0;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lcc0;->n:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p1, v0, Lcc0;->k:Lpb0;

    .line 36
    .line 37
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_2
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Lam2;->D:Lfc0;

    .line 51
    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    iget-object v1, p0, Lam2;->A:Lbk1;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    new-instance v4, Lgc0;

    .line 59
    .line 60
    invoke-direct {v4, p2}, Lgc0;-><init>(Lfc0;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, v0, Lcc0;->k:Lpb0;

    .line 64
    .line 65
    iput v3, v0, Lcc0;->n:I

    .line 66
    .line 67
    invoke-virtual {v1, v4, v0}, Lbk1;->a(Lj11;Lt00;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    sget-object v0, Lk20;->h:Lk20;

    .line 72
    .line 73
    if-ne p2, v0, :cond_3

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_3
    :goto_1
    iput-object v2, p0, Lam2;->D:Lfc0;

    .line 77
    .line 78
    :cond_4
    iget-object p2, p0, Lam2;->S:Ltm1;

    .line 79
    .line 80
    invoke-virtual {p2}, Ltm1;->c()Lj20;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    new-instance v0, La2;

    .line 85
    .line 86
    const/16 v1, 0x18

    .line 87
    .line 88
    invoke-direct {v0, p1, p0, v2, v1}, La2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 89
    .line 90
    .line 91
    const/4 p0, 0x3

    .line 92
    invoke-static {p2, v2, v0, p0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 93
    .line 94
    .line 95
    sget-object p0, La83;->a:La83;

    .line 96
    .line 97
    return-object p0
.end method

.method public static V0(Lam2;Lo12;JJI)V
    .locals 3

    .line 1
    and-int/lit8 p6, p6, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const-wide/16 p4, 0x0

    .line 6
    .line 7
    :cond_0
    iget-object p6, p0, Lam2;->I:Lkb0;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p6, :cond_1

    .line 11
    .line 12
    new-instance p6, Lkb0;

    .line 13
    .line 14
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, p6, Lkb0;->i:Lo12;

    .line 19
    .line 20
    const-wide v1, 0x7fffffffffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide v1, p6, Lkb0;->j:J

    .line 26
    .line 27
    iput-boolean v0, p6, Lkb0;->k:Z

    .line 28
    .line 29
    iput-object p6, p0, Lam2;->I:Lkb0;

    .line 30
    .line 31
    :cond_1
    iput-object p1, p6, Lkb0;->i:Lo12;

    .line 32
    .line 33
    iput-wide p2, p6, Lkb0;->j:J

    .line 34
    .line 35
    iget-object p1, p0, Lam2;->N:Lms0;

    .line 36
    .line 37
    iget-object p2, p0, Lam2;->x:Lqv1;

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    new-instance p1, Lms0;

    .line 42
    .line 43
    invoke-direct {p1, p2}, Lms0;-><init>(Lqv1;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lam2;->N:Lms0;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iput-object p2, p1, Lms0;->b:Ljava/lang/Object;

    .line 50
    .line 51
    iput-wide p4, p1, Lms0;->a:J

    .line 52
    .line 53
    :goto_0
    iput-boolean v0, p6, Lkb0;->k:Z

    .line 54
    .line 55
    iput-object p6, p0, Lam2;->K:Ltl;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final B0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final C()V
    .locals 2

    .line 1
    iget-object p0, p0, Lam2;->O:Lvy0;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lvy0;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lvy0;->a:Lam2;

    .line 9
    .line 10
    iget-boolean v1, v0, Lam2;->E:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object v1, Lmb0;->a:Lmb0;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lam2;->W0(Lqb0;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lvy0;->g:Lhh1;

    .line 21
    .line 22
    iget-object p0, p0, Lvy0;->k:Ldk;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput v0, p0, Ldk;->i:I

    .line 26
    .line 27
    iget-object p0, p0, Ldk;->j:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lck1;

    .line 30
    .line 31
    iput v0, p0, Lck1;->b:I

    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final E0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lth1;->u:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lr61;->F:Le70;

    .line 11
    .line 12
    iget-object v1, p0, Lam2;->T:Ln50;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v2, Lhh1;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Lhh1;-><init>(Le70;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lr40;

    .line 23
    .line 24
    invoke-direct {v0, v2}, Lr40;-><init>(Lhh1;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, v1, Ln50;->a:Lr40;

    .line 28
    .line 29
    :goto_0
    iget-object v0, p0, Lam2;->a0:Lsi1;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v1, v1, Lr61;->F:Le70;

    .line 38
    .line 39
    iput-object v1, v0, Lio1;->c:Le70;

    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lam2;->b0:Ld33;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iget-object p0, p0, Lr61;->F:Le70;

    .line 50
    .line 51
    iput-object p0, v0, Lio1;->c:Le70;

    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public final F0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lam2;->E:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lam2;->S0()V

    .line 5
    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lam2;->P:J

    .line 10
    .line 11
    iget-object v0, p0, Lam2;->B:Lvo0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lu60;->N0(Lt60;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lam2;->B:Lvo0;

    .line 20
    .line 21
    return-void
.end method

.method public final H(Le9;Li12;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, Le9;->i:I

    .line 8
    .line 9
    iget-object v1, v1, Le9;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v4, v0, Lam2;->B:Lvo0;

    .line 14
    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    new-instance v4, Lvo0;

    .line 18
    .line 19
    invoke-direct {v4, v0}, Lvo0;-><init>(Luo0;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v4}, Lu60;->M0(Lt60;)Lt60;

    .line 23
    .line 24
    .line 25
    iput-object v4, v0, Lam2;->B:Lvo0;

    .line 26
    .line 27
    :cond_0
    iget-boolean v4, v0, Lam2;->z:Z

    .line 28
    .line 29
    if-eqz v4, :cond_38

    .line 30
    .line 31
    iget-object v4, v0, Lam2;->O:Lvy0;

    .line 32
    .line 33
    if-nez v4, :cond_1

    .line 34
    .line 35
    new-instance v4, Lvy0;

    .line 36
    .line 37
    invoke-direct {v4, v0}, Lvy0;-><init>(Lam2;)V

    .line 38
    .line 39
    .line 40
    iput-object v4, v0, Lam2;->O:Lvy0;

    .line 41
    .line 42
    :cond_1
    iget-object v5, v0, Lam2;->O:Lvy0;

    .line 43
    .line 44
    if-eqz v5, :cond_38

    .line 45
    .line 46
    iget-object v0, v5, Lvy0;->a:Lam2;

    .line 47
    .line 48
    iget-object v4, v5, Lvy0;->f:Lp40;

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    if-nez v4, :cond_3

    .line 52
    .line 53
    iget-object v4, v5, Lvy0;->b:Lqy0;

    .line 54
    .line 55
    if-nez v4, :cond_2

    .line 56
    .line 57
    new-instance v4, Lqy0;

    .line 58
    .line 59
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    sget-object v6, Lpy0;->j:Lpy0;

    .line 63
    .line 64
    iput-object v6, v4, Lqy0;->n:Lpy0;

    .line 65
    .line 66
    iput-boolean v11, v4, Lqy0;->o:Z

    .line 67
    .line 68
    iput-object v4, v5, Lvy0;->b:Lqy0;

    .line 69
    .line 70
    :cond_2
    iput-object v4, v5, Lvy0;->f:Lp40;

    .line 71
    .line 72
    :cond_3
    iget-object v4, v5, Lvy0;->f:Lp40;

    .line 73
    .line 74
    if-eqz v4, :cond_37

    .line 75
    .line 76
    instance-of v6, v4, Lqy0;

    .line 77
    .line 78
    const-wide v12, 0x7fffffffffffffffL

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    const-wide/16 v14, 0x0

    .line 84
    .line 85
    sget-object v7, Li12;->h:Li12;

    .line 86
    .line 87
    const/4 v8, 0x1

    .line 88
    sget-object v9, Li12;->i:Li12;

    .line 89
    .line 90
    if-eqz v6, :cond_c

    .line 91
    .line 92
    check-cast v4, Lqy0;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_4

    .line 99
    .line 100
    goto/16 :goto_13

    .line 101
    .line 102
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    :goto_0
    if-ge v11, v6, :cond_6

    .line 107
    .line 108
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    check-cast v10, Loy0;

    .line 113
    .line 114
    invoke-static {v10}, Lci0;->y(Loy0;)Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-nez v10, :cond_5

    .line 119
    .line 120
    goto/16 :goto_13

    .line 121
    .line 122
    :cond_5
    add-int/lit8 v11, v11, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_6
    invoke-static {v1}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    move-object v6, v1

    .line 130
    check-cast v6, Loy0;

    .line 131
    .line 132
    iget-object v1, v4, Lqy0;->n:Lpy0;

    .line 133
    .line 134
    sget-object v10, Luy0;->a:[I

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    aget v1, v10, v1

    .line 141
    .line 142
    sget-object v10, Lpy0;->i:Lpy0;

    .line 143
    .line 144
    sget-object v11, Lpy0;->h:Lpy0;

    .line 145
    .line 146
    if-ne v1, v8, :cond_8

    .line 147
    .line 148
    invoke-virtual {v0}, Lam2;->b1()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_7

    .line 153
    .line 154
    move-object v0, v11

    .line 155
    goto :goto_1

    .line 156
    :cond_7
    move-object v0, v10

    .line 157
    goto :goto_1

    .line 158
    :cond_8
    iget-object v0, v4, Lqy0;->n:Lpy0;

    .line 159
    .line 160
    :goto_1
    iput-object v0, v4, Lqy0;->n:Lpy0;

    .line 161
    .line 162
    if-ne v2, v7, :cond_9

    .line 163
    .line 164
    if-ne v0, v10, :cond_9

    .line 165
    .line 166
    iput-boolean v8, v6, Loy0;->i:Z

    .line 167
    .line 168
    iput-boolean v8, v4, Lqy0;->o:Z

    .line 169
    .line 170
    :cond_9
    if-ne v2, v9, :cond_38

    .line 171
    .line 172
    if-ne v0, v11, :cond_a

    .line 173
    .line 174
    iget-wide v7, v6, Loy0;->a:J

    .line 175
    .line 176
    const-wide/16 v9, 0x0

    .line 177
    .line 178
    const/16 v11, 0xc

    .line 179
    .line 180
    invoke-static/range {v5 .. v11}, Lvy0;->c(Lvy0;Loy0;JJI)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_a
    iget-boolean v0, v4, Lqy0;->o:Z

    .line 185
    .line 186
    if-eqz v0, :cond_38

    .line 187
    .line 188
    new-instance v8, Lny0;

    .line 189
    .line 190
    invoke-direct {v8, v3}, Lny0;-><init>(I)V

    .line 191
    .line 192
    .line 193
    const-wide/16 v9, 0x0

    .line 194
    .line 195
    move-object v7, v6

    .line 196
    invoke-virtual/range {v5 .. v10}, Lvy0;->f(Loy0;Loy0;Lny0;J)V

    .line 197
    .line 198
    .line 199
    new-instance v0, Lny0;

    .line 200
    .line 201
    invoke-direct {v0, v3}, Lny0;-><init>(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5, v6, v0, v14, v15}, Lvy0;->e(Loy0;Lny0;J)V

    .line 205
    .line 206
    .line 207
    iget-wide v0, v6, Loy0;->a:J

    .line 208
    .line 209
    iget-object v2, v5, Lvy0;->c:Lty0;

    .line 210
    .line 211
    if-nez v2, :cond_b

    .line 212
    .line 213
    new-instance v2, Lty0;

    .line 214
    .line 215
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 216
    .line 217
    .line 218
    iput-wide v12, v2, Lty0;->n:J

    .line 219
    .line 220
    iput-object v2, v5, Lvy0;->c:Lty0;

    .line 221
    .line 222
    :cond_b
    iput-wide v0, v2, Lty0;->n:J

    .line 223
    .line 224
    iput-object v2, v5, Lvy0;->f:Lp40;

    .line 225
    .line 226
    return-void

    .line 227
    :cond_c
    instance-of v6, v4, Lsy0;

    .line 228
    .line 229
    sget-object v10, Li12;->j:Li12;

    .line 230
    .line 231
    const/16 v16, 0x0

    .line 232
    .line 233
    if-eqz v6, :cond_22

    .line 234
    .line 235
    check-cast v4, Lsy0;

    .line 236
    .line 237
    if-ne v2, v7, :cond_d

    .line 238
    .line 239
    goto/16 :goto_13

    .line 240
    .line 241
    :cond_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    move v7, v11

    .line 246
    :goto_2
    if-ge v7, v6, :cond_f

    .line 247
    .line 248
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    move-object v15, v14

    .line 253
    check-cast v15, Loy0;

    .line 254
    .line 255
    iget-wide v11, v15, Loy0;->a:J

    .line 256
    .line 257
    move-object v13, v9

    .line 258
    iget-wide v8, v4, Lsy0;->o:J

    .line 259
    .line 260
    invoke-static {v11, v12, v8, v9}, Lup0;->s(JJ)Z

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    if-eqz v8, :cond_e

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_e
    add-int/lit8 v7, v7, 0x1

    .line 268
    .line 269
    move-object v9, v13

    .line 270
    const/4 v8, 0x1

    .line 271
    const/4 v11, 0x0

    .line 272
    const-wide v12, 0x7fffffffffffffffL

    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_f
    move-object v13, v9

    .line 279
    move-object/from16 v14, v16

    .line 280
    .line 281
    :goto_3
    check-cast v14, Loy0;

    .line 282
    .line 283
    if-nez v14, :cond_13

    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    const/4 v7, 0x0

    .line 290
    :goto_4
    if-ge v7, v6, :cond_11

    .line 291
    .line 292
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    move-object v9, v8

    .line 297
    check-cast v9, Loy0;

    .line 298
    .line 299
    iget-boolean v9, v9, Loy0;->d:Z

    .line 300
    .line 301
    if-eqz v9, :cond_10

    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_10
    add-int/lit8 v7, v7, 0x1

    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_11
    move-object/from16 v8, v16

    .line 308
    .line 309
    :goto_5
    move-object v14, v8

    .line 310
    check-cast v14, Loy0;

    .line 311
    .line 312
    if-nez v14, :cond_12

    .line 313
    .line 314
    invoke-virtual {v5}, Lvy0;->a()V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :cond_12
    iget-wide v6, v14, Loy0;->a:J

    .line 319
    .line 320
    iput-wide v6, v4, Lsy0;->o:J

    .line 321
    .line 322
    :cond_13
    move-object v7, v14

    .line 323
    const-string v11, "AwaitTouchSlop.touchSlopDetector was not initialized"

    .line 324
    .line 325
    const-string v12, "AwaitTouchSlop.initialDown was not initialized"

    .line 326
    .line 327
    if-ne v2, v13, :cond_16

    .line 328
    .line 329
    iget-boolean v6, v7, Loy0;->i:Z

    .line 330
    .line 331
    if-nez v6, :cond_1c

    .line 332
    .line 333
    invoke-static {v7}, Lci0;->t(Loy0;)Z

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    if-eqz v6, :cond_18

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    const/4 v3, 0x0

    .line 344
    :goto_6
    if-ge v3, v0, :cond_15

    .line 345
    .line 346
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v6

    .line 350
    move-object v8, v6

    .line 351
    check-cast v8, Loy0;

    .line 352
    .line 353
    iget-boolean v8, v8, Loy0;->d:Z

    .line 354
    .line 355
    if-eqz v8, :cond_14

    .line 356
    .line 357
    move-object/from16 v16, v6

    .line 358
    .line 359
    goto :goto_7

    .line 360
    :cond_14
    add-int/lit8 v3, v3, 0x1

    .line 361
    .line 362
    goto :goto_6

    .line 363
    :cond_15
    :goto_7
    move-object/from16 v0, v16

    .line 364
    .line 365
    check-cast v0, Loy0;

    .line 366
    .line 367
    if-nez v0, :cond_17

    .line 368
    .line 369
    invoke-virtual {v5}, Lvy0;->a()V

    .line 370
    .line 371
    .line 372
    :cond_16
    :goto_8
    move-object v0, v10

    .line 373
    goto/16 :goto_9

    .line 374
    .line 375
    :cond_17
    iget-wide v0, v0, Loy0;->a:J

    .line 376
    .line 377
    iput-wide v0, v4, Lsy0;->o:J

    .line 378
    .line 379
    goto :goto_8

    .line 380
    :cond_18
    sget-object v1, Lly;->t:Ltu2;

    .line 381
    .line 382
    invoke-static {v0, v1}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    check-cast v1, Lza3;

    .line 387
    .line 388
    sget v6, Lyb0;->a:F

    .line 389
    .line 390
    invoke-interface {v1}, Lza3;->d()F

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    iget-object v6, v5, Lvy0;->i:Lms0;

    .line 395
    .line 396
    if-eqz v6, :cond_1b

    .line 397
    .line 398
    iget-object v0, v0, Lam2;->x:Lqv1;

    .line 399
    .line 400
    new-instance v8, Lny0;

    .line 401
    .line 402
    invoke-direct {v8, v3}, Lny0;-><init>(I)V

    .line 403
    .line 404
    .line 405
    const/4 v9, 0x1

    .line 406
    invoke-static {v7, v0, v8, v9}, Lci0;->S(Loy0;Lqv1;Lny0;Z)J

    .line 407
    .line 408
    .line 409
    move-result-wide v13

    .line 410
    invoke-virtual {v6, v13, v14, v1, v9}, Lms0;->a(JFZ)J

    .line 411
    .line 412
    .line 413
    move-result-wide v0

    .line 414
    const-wide v13, 0x7fffffff7fffffffL

    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    and-long/2addr v13, v0

    .line 420
    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    cmp-long v6, v13, v15

    .line 426
    .line 427
    if-eqz v6, :cond_1a

    .line 428
    .line 429
    iput-boolean v9, v7, Loy0;->i:Z

    .line 430
    .line 431
    iget-object v6, v4, Lsy0;->n:Loy0;

    .line 432
    .line 433
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    new-instance v8, Lny0;

    .line 437
    .line 438
    invoke-direct {v8, v3}, Lny0;-><init>(I)V

    .line 439
    .line 440
    .line 441
    move-wide/from16 v24, v0

    .line 442
    .line 443
    move-object v0, v10

    .line 444
    move-wide/from16 v9, v24

    .line 445
    .line 446
    invoke-virtual/range {v5 .. v10}, Lvy0;->f(Loy0;Loy0;Lny0;J)V

    .line 447
    .line 448
    .line 449
    new-instance v1, Lny0;

    .line 450
    .line 451
    invoke-direct {v1, v3}, Lny0;-><init>(I)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v5, v7, v1, v9, v10}, Lvy0;->e(Loy0;Lny0;J)V

    .line 455
    .line 456
    .line 457
    iget-wide v8, v7, Loy0;->a:J

    .line 458
    .line 459
    iget-object v1, v5, Lvy0;->c:Lty0;

    .line 460
    .line 461
    if-nez v1, :cond_19

    .line 462
    .line 463
    new-instance v1, Lty0;

    .line 464
    .line 465
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 466
    .line 467
    .line 468
    const-wide v13, 0x7fffffffffffffffL

    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    iput-wide v13, v1, Lty0;->n:J

    .line 474
    .line 475
    iput-object v1, v5, Lvy0;->c:Lty0;

    .line 476
    .line 477
    :cond_19
    iput-wide v8, v1, Lty0;->n:J

    .line 478
    .line 479
    iput-object v1, v5, Lvy0;->f:Lp40;

    .line 480
    .line 481
    goto :goto_9

    .line 482
    :cond_1a
    move-object v0, v10

    .line 483
    iput-boolean v9, v4, Lsy0;->p:Z

    .line 484
    .line 485
    goto :goto_9

    .line 486
    :cond_1b
    const-string v0, "Touch slop detector not initialized."

    .line 487
    .line 488
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    return-void

    .line 492
    :cond_1c
    move-object v0, v10

    .line 493
    iget-object v1, v4, Lsy0;->n:Loy0;

    .line 494
    .line 495
    if-eqz v1, :cond_1e

    .line 496
    .line 497
    iget-wide v8, v4, Lsy0;->o:J

    .line 498
    .line 499
    iget-object v3, v5, Lvy0;->i:Lms0;

    .line 500
    .line 501
    if-eqz v3, :cond_1d

    .line 502
    .line 503
    invoke-virtual {v5, v1, v8, v9, v3}, Lvy0;->b(Loy0;JLms0;)V

    .line 504
    .line 505
    .line 506
    goto :goto_9

    .line 507
    :cond_1d
    invoke-static {v11}, Ls;->j(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    return-void

    .line 511
    :cond_1e
    invoke-static {v12}, Ls;->j(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    return-void

    .line 515
    :goto_9
    if-ne v2, v0, :cond_38

    .line 516
    .line 517
    iget-boolean v0, v4, Lsy0;->p:Z

    .line 518
    .line 519
    if-eqz v0, :cond_38

    .line 520
    .line 521
    iget-boolean v0, v7, Loy0;->i:Z

    .line 522
    .line 523
    if-eqz v0, :cond_21

    .line 524
    .line 525
    iget-object v0, v4, Lsy0;->n:Loy0;

    .line 526
    .line 527
    if-eqz v0, :cond_20

    .line 528
    .line 529
    iget-wide v1, v4, Lsy0;->o:J

    .line 530
    .line 531
    iget-object v3, v5, Lvy0;->i:Lms0;

    .line 532
    .line 533
    if-eqz v3, :cond_1f

    .line 534
    .line 535
    invoke-virtual {v5, v0, v1, v2, v3}, Lvy0;->b(Loy0;JLms0;)V

    .line 536
    .line 537
    .line 538
    return-void

    .line 539
    :cond_1f
    invoke-static {v11}, Ls;->j(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    return-void

    .line 543
    :cond_20
    invoke-static {v12}, Ls;->j(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    return-void

    .line 547
    :cond_21
    const/4 v0, 0x0

    .line 548
    iput-boolean v0, v4, Lsy0;->p:Z

    .line 549
    .line 550
    return-void

    .line 551
    :cond_22
    move-object v13, v9

    .line 552
    move-object v6, v10

    .line 553
    instance-of v7, v4, Lry0;

    .line 554
    .line 555
    if-eqz v7, :cond_2a

    .line 556
    .line 557
    check-cast v4, Lry0;

    .line 558
    .line 559
    if-eq v2, v6, :cond_23

    .line 560
    .line 561
    goto/16 :goto_13

    .line 562
    .line 563
    :cond_23
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 564
    .line 565
    .line 566
    move-result v2

    .line 567
    const/4 v6, 0x0

    .line 568
    :goto_a
    if-ge v6, v2, :cond_25

    .line 569
    .line 570
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v7

    .line 574
    check-cast v7, Loy0;

    .line 575
    .line 576
    iget-boolean v7, v7, Loy0;->i:Z

    .line 577
    .line 578
    if-eqz v7, :cond_24

    .line 579
    .line 580
    const/4 v8, 0x0

    .line 581
    goto :goto_b

    .line 582
    :cond_24
    add-int/lit8 v6, v6, 0x1

    .line 583
    .line 584
    goto :goto_a

    .line 585
    :cond_25
    const/4 v8, 0x1

    .line 586
    :goto_b
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 587
    .line 588
    .line 589
    move-result v2

    .line 590
    const/4 v11, 0x0

    .line 591
    :goto_c
    if-ge v11, v2, :cond_29

    .line 592
    .line 593
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v6

    .line 597
    check-cast v6, Loy0;

    .line 598
    .line 599
    iget-boolean v6, v6, Loy0;->d:Z

    .line 600
    .line 601
    if-eqz v6, :cond_28

    .line 602
    .line 603
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    if-eqz v2, :cond_26

    .line 608
    .line 609
    goto :goto_d

    .line 610
    :cond_26
    if-eqz v8, :cond_38

    .line 611
    .line 612
    invoke-static {v1}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    check-cast v1, Loy0;

    .line 617
    .line 618
    iget-object v2, v0, Lam2;->x:Lqv1;

    .line 619
    .line 620
    new-instance v6, Lny0;

    .line 621
    .line 622
    invoke-direct {v6, v3}, Lny0;-><init>(I)V

    .line 623
    .line 624
    .line 625
    invoke-static {v1, v2, v6}, Lci0;->T(Loy0;Lqv1;Lny0;)J

    .line 626
    .line 627
    .line 628
    move-result-wide v1

    .line 629
    iget-object v6, v4, Lry0;->n:Loy0;

    .line 630
    .line 631
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    iget-object v0, v0, Lam2;->x:Lqv1;

    .line 635
    .line 636
    new-instance v7, Lny0;

    .line 637
    .line 638
    invoke-direct {v7, v3}, Lny0;-><init>(I)V

    .line 639
    .line 640
    .line 641
    invoke-static {v6, v0, v7}, Lci0;->T(Loy0;Lqv1;Lny0;)J

    .line 642
    .line 643
    .line 644
    move-result-wide v6

    .line 645
    invoke-static {v1, v2, v6, v7}, Lrs1;->d(JJ)J

    .line 646
    .line 647
    .line 648
    move-result-wide v9

    .line 649
    iget-object v6, v4, Lry0;->n:Loy0;

    .line 650
    .line 651
    if-eqz v6, :cond_27

    .line 652
    .line 653
    iget-wide v7, v4, Lry0;->o:J

    .line 654
    .line 655
    const/16 v11, 0x8

    .line 656
    .line 657
    invoke-static/range {v5 .. v11}, Lvy0;->c(Lvy0;Loy0;JJI)V

    .line 658
    .line 659
    .line 660
    return-void

    .line 661
    :cond_27
    const-string v0, "AwaitGesturePickup.initialDown was not initialized."

    .line 662
    .line 663
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    return-void

    .line 667
    :cond_28
    add-int/lit8 v11, v11, 0x1

    .line 668
    .line 669
    goto :goto_c

    .line 670
    :cond_29
    :goto_d
    invoke-virtual {v5}, Lvy0;->a()V

    .line 671
    .line 672
    .line 673
    return-void

    .line 674
    :cond_2a
    instance-of v6, v4, Lty0;

    .line 675
    .line 676
    if-eqz v6, :cond_36

    .line 677
    .line 678
    check-cast v4, Lty0;

    .line 679
    .line 680
    if-eq v2, v13, :cond_2b

    .line 681
    .line 682
    goto/16 :goto_13

    .line 683
    .line 684
    :cond_2b
    iget-wide v6, v4, Lty0;->n:J

    .line 685
    .line 686
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    const/4 v8, 0x0

    .line 691
    :goto_e
    if-ge v8, v2, :cond_2d

    .line 692
    .line 693
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v9

    .line 697
    move-object v10, v9

    .line 698
    check-cast v10, Loy0;

    .line 699
    .line 700
    iget-wide v10, v10, Loy0;->a:J

    .line 701
    .line 702
    invoke-static {v10, v11, v6, v7}, Lup0;->s(JJ)Z

    .line 703
    .line 704
    .line 705
    move-result v10

    .line 706
    if-eqz v10, :cond_2c

    .line 707
    .line 708
    goto :goto_f

    .line 709
    :cond_2c
    add-int/lit8 v8, v8, 0x1

    .line 710
    .line 711
    goto :goto_e

    .line 712
    :cond_2d
    move-object/from16 v9, v16

    .line 713
    .line 714
    :goto_f
    check-cast v9, Loy0;

    .line 715
    .line 716
    if-nez v9, :cond_2e

    .line 717
    .line 718
    goto/16 :goto_13

    .line 719
    .line 720
    :cond_2e
    invoke-static {v9}, Lci0;->t(Loy0;)Z

    .line 721
    .line 722
    .line 723
    move-result v2

    .line 724
    sget-object v6, Lmb0;->a:Lmb0;

    .line 725
    .line 726
    if-eqz v2, :cond_33

    .line 727
    .line 728
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 729
    .line 730
    .line 731
    move-result v2

    .line 732
    const/4 v7, 0x0

    .line 733
    :goto_10
    if-ge v7, v2, :cond_30

    .line 734
    .line 735
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v8

    .line 739
    move-object v10, v8

    .line 740
    check-cast v10, Loy0;

    .line 741
    .line 742
    iget-boolean v10, v10, Loy0;->d:Z

    .line 743
    .line 744
    if-eqz v10, :cond_2f

    .line 745
    .line 746
    move-object/from16 v16, v8

    .line 747
    .line 748
    goto :goto_11

    .line 749
    :cond_2f
    add-int/lit8 v7, v7, 0x1

    .line 750
    .line 751
    goto :goto_10

    .line 752
    :cond_30
    :goto_11
    move-object/from16 v1, v16

    .line 753
    .line 754
    check-cast v1, Loy0;

    .line 755
    .line 756
    if-nez v1, :cond_32

    .line 757
    .line 758
    iget-boolean v1, v9, Loy0;->i:Z

    .line 759
    .line 760
    if-nez v1, :cond_31

    .line 761
    .line 762
    invoke-static {v9}, Lci0;->t(Loy0;)Z

    .line 763
    .line 764
    .line 765
    move-result v1

    .line 766
    if-eqz v1, :cond_31

    .line 767
    .line 768
    new-instance v1, Lny0;

    .line 769
    .line 770
    invoke-direct {v1, v3}, Lny0;-><init>(I)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v5}, Lvy0;->d()Lhh1;

    .line 774
    .line 775
    .line 776
    move-result-object v17

    .line 777
    iget-object v2, v0, Lam2;->x:Lqv1;

    .line 778
    .line 779
    iget-object v3, v5, Lvy0;->j:Ldk;

    .line 780
    .line 781
    iget-wide v6, v5, Lvy0;->l:J

    .line 782
    .line 783
    move-object/from16 v20, v1

    .line 784
    .line 785
    move-object/from16 v19, v2

    .line 786
    .line 787
    move-object/from16 v21, v3

    .line 788
    .line 789
    move-wide/from16 v22, v6

    .line 790
    .line 791
    move-object/from16 v18, v9

    .line 792
    .line 793
    invoke-static/range {v17 .. v23}, Lci0;->s(Lhh1;Loy0;Lqv1;Lny0;Ldk;J)V

    .line 794
    .line 795
    .line 796
    sget-object v1, Lly;->t:Ltu2;

    .line 797
    .line 798
    invoke-static {v0, v1}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    check-cast v1, Lza3;

    .line 803
    .line 804
    invoke-interface {v1}, Lza3;->a()F

    .line 805
    .line 806
    .line 807
    move-result v1

    .line 808
    invoke-virtual {v5}, Lvy0;->d()Lhh1;

    .line 809
    .line 810
    .line 811
    move-result-object v2

    .line 812
    invoke-static {v1, v1}, Lea3;->a(FF)J

    .line 813
    .line 814
    .line 815
    move-result-wide v3

    .line 816
    invoke-virtual {v2, v3, v4}, Lhh1;->y(J)J

    .line 817
    .line 818
    .line 819
    move-result-wide v1

    .line 820
    invoke-virtual {v5}, Lvy0;->d()Lhh1;

    .line 821
    .line 822
    .line 823
    move-result-object v3

    .line 824
    iget-object v3, v3, Lhh1;->i:Ljava/lang/Object;

    .line 825
    .line 826
    check-cast v3, Lm60;

    .line 827
    .line 828
    iget-object v4, v3, Lm60;->a:Lbb2;

    .line 829
    .line 830
    iget-object v6, v4, Lbb2;->e:Ljava/lang/Object;

    .line 831
    .line 832
    check-cast v6, [Li40;

    .line 833
    .line 834
    invoke-static {v6}, Lmg;->k0([Ljava/lang/Object;)V

    .line 835
    .line 836
    .line 837
    const/4 v6, 0x0

    .line 838
    iput v6, v4, Lbb2;->c:I

    .line 839
    .line 840
    iget-object v4, v3, Lm60;->b:Lbb2;

    .line 841
    .line 842
    iget-object v7, v4, Lbb2;->e:Ljava/lang/Object;

    .line 843
    .line 844
    check-cast v7, [Li40;

    .line 845
    .line 846
    invoke-static {v7}, Lmg;->k0([Ljava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    iput v6, v4, Lbb2;->c:I

    .line 850
    .line 851
    iput-wide v14, v3, Lm60;->c:J

    .line 852
    .line 853
    new-instance v3, Lpb0;

    .line 854
    .line 855
    invoke-static {v1, v2}, Lp40;->Y(J)J

    .line 856
    .line 857
    .line 858
    move-result-wide v1

    .line 859
    const/4 v9, 0x1

    .line 860
    invoke-direct {v3, v1, v2, v9}, Lpb0;-><init>(JZ)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v0, v3}, Lam2;->W0(Lqb0;)V

    .line 864
    .line 865
    .line 866
    goto :goto_12

    .line 867
    :cond_31
    invoke-virtual {v0, v6}, Lam2;->W0(Lqb0;)V

    .line 868
    .line 869
    .line 870
    :goto_12
    invoke-virtual {v5}, Lvy0;->a()V

    .line 871
    .line 872
    .line 873
    return-void

    .line 874
    :cond_32
    iget-wide v0, v1, Loy0;->a:J

    .line 875
    .line 876
    iput-wide v0, v4, Lty0;->n:J

    .line 877
    .line 878
    return-void

    .line 879
    :cond_33
    iget-boolean v1, v9, Loy0;->i:Z

    .line 880
    .line 881
    if-eqz v1, :cond_34

    .line 882
    .line 883
    invoke-virtual {v0, v6}, Lam2;->W0(Lqb0;)V

    .line 884
    .line 885
    .line 886
    return-void

    .line 887
    :cond_34
    iget-object v1, v0, Lam2;->x:Lqv1;

    .line 888
    .line 889
    new-instance v2, Lny0;

    .line 890
    .line 891
    invoke-direct {v2, v3}, Lny0;-><init>(I)V

    .line 892
    .line 893
    .line 894
    const/4 v4, 0x1

    .line 895
    invoke-static {v9, v1, v2, v4}, Lci0;->S(Loy0;Lqv1;Lny0;Z)J

    .line 896
    .line 897
    .line 898
    move-result-wide v1

    .line 899
    invoke-static {v1, v2}, Lrs1;->c(J)F

    .line 900
    .line 901
    .line 902
    move-result v1

    .line 903
    const/4 v2, 0x0

    .line 904
    cmpg-float v1, v1, v2

    .line 905
    .line 906
    if-nez v1, :cond_35

    .line 907
    .line 908
    goto :goto_13

    .line 909
    :cond_35
    iget-object v0, v0, Lam2;->x:Lqv1;

    .line 910
    .line 911
    new-instance v1, Lny0;

    .line 912
    .line 913
    invoke-direct {v1, v3}, Lny0;-><init>(I)V

    .line 914
    .line 915
    .line 916
    const/4 v6, 0x0

    .line 917
    invoke-static {v9, v0, v1, v6}, Lci0;->S(Loy0;Lqv1;Lny0;Z)J

    .line 918
    .line 919
    .line 920
    move-result-wide v0

    .line 921
    new-instance v2, Lny0;

    .line 922
    .line 923
    invoke-direct {v2, v3}, Lny0;-><init>(I)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v5, v9, v2, v0, v1}, Lvy0;->e(Loy0;Lny0;J)V

    .line 927
    .line 928
    .line 929
    const/4 v4, 0x1

    .line 930
    iput-boolean v4, v9, Loy0;->i:Z

    .line 931
    .line 932
    return-void

    .line 933
    :cond_36
    invoke-static {}, Lc80;->s()V

    .line 934
    .line 935
    .line 936
    return-void

    .line 937
    :cond_37
    const-string v0, "currentDragState should not be null"

    .line 938
    .line 939
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 940
    .line 941
    .line 942
    :cond_38
    :goto_13
    return-void
.end method

.method public final J(Lh12;Li12;J)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    iget-object v10, v8, Lh12;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v11, 0x0

    .line 14
    move v2, v11

    .line 15
    :goto_0
    sget-object v12, Li12;->i:Li12;

    .line 16
    .line 17
    sget-object v13, Li12;->h:Li12;

    .line 18
    .line 19
    const/4 v7, 0x1

    .line 20
    if-ge v2, v1, :cond_3e

    .line 21
    .line 22
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lo12;

    .line 27
    .line 28
    iget-object v4, v0, Lam2;->y:Lml2;

    .line 29
    .line 30
    iget v3, v3, Lo12;->i:I

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    if-ne v3, v4, :cond_0

    .line 37
    .line 38
    move v3, v7

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    move v3, v11

    .line 41
    :goto_1
    if-nez v3, :cond_3d

    .line 42
    .line 43
    iput-boolean v7, v0, Lam2;->F:Z

    .line 44
    .line 45
    iget-object v1, v0, Lam2;->B:Lvo0;

    .line 46
    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    new-instance v1, Lvo0;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Lvo0;-><init>(Luo0;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lu60;->M0(Lt60;)Lt60;

    .line 55
    .line 56
    .line 57
    iput-object v1, v0, Lam2;->B:Lvo0;

    .line 58
    .line 59
    :cond_1
    iget-boolean v1, v0, Lam2;->z:Z

    .line 60
    .line 61
    if-eqz v1, :cond_3e

    .line 62
    .line 63
    iget-object v1, v0, Lam2;->K:Ltl;

    .line 64
    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    iget-object v1, v0, Lam2;->G:Lib0;

    .line 68
    .line 69
    if-nez v1, :cond_2

    .line 70
    .line 71
    new-instance v1, Lib0;

    .line 72
    .line 73
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    sget-object v2, Lhb0;->j:Lhb0;

    .line 77
    .line 78
    iput-object v2, v1, Lib0;->i:Lhb0;

    .line 79
    .line 80
    iput-boolean v11, v1, Lib0;->j:Z

    .line 81
    .line 82
    iput-object v1, v0, Lam2;->G:Lib0;

    .line 83
    .line 84
    :cond_2
    iput-object v1, v0, Lam2;->K:Ltl;

    .line 85
    .line 86
    :cond_3
    iget-object v1, v0, Lam2;->K:Ltl;

    .line 87
    .line 88
    if-eqz v1, :cond_3c

    .line 89
    .line 90
    instance-of v2, v1, Lib0;

    .line 91
    .line 92
    const-wide v3, 0x7fffffffffffffffL

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    const-wide/16 v5, 0x0

    .line 98
    .line 99
    if-eqz v2, :cond_c

    .line 100
    .line 101
    check-cast v1, Lib0;

    .line 102
    .line 103
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_4

    .line 108
    .line 109
    goto/16 :goto_19

    .line 110
    .line 111
    :cond_4
    invoke-static {v8, v11}, Lay2;->d(Lh12;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_5

    .line 116
    .line 117
    goto/16 :goto_19

    .line 118
    .line 119
    :cond_5
    invoke-static {v10}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Lo12;

    .line 124
    .line 125
    iget-object v15, v1, Lib0;->i:Lhb0;

    .line 126
    .line 127
    sget-object v16, Lzb0;->a:[I

    .line 128
    .line 129
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 130
    .line 131
    .line 132
    move-result v15

    .line 133
    aget v15, v16, v15

    .line 134
    .line 135
    sget-object v14, Lhb0;->i:Lhb0;

    .line 136
    .line 137
    sget-object v11, Lhb0;->h:Lhb0;

    .line 138
    .line 139
    if-ne v15, v7, :cond_7

    .line 140
    .line 141
    invoke-virtual {v0}, Lam2;->b1()Z

    .line 142
    .line 143
    .line 144
    move-result v15

    .line 145
    if-nez v15, :cond_6

    .line 146
    .line 147
    move-object v15, v11

    .line 148
    goto :goto_2

    .line 149
    :cond_6
    move-object v15, v14

    .line 150
    goto :goto_2

    .line 151
    :cond_7
    iget-object v15, v1, Lib0;->i:Lhb0;

    .line 152
    .line 153
    :goto_2
    iput-object v15, v1, Lib0;->i:Lhb0;

    .line 154
    .line 155
    if-ne v9, v13, :cond_8

    .line 156
    .line 157
    if-ne v15, v14, :cond_8

    .line 158
    .line 159
    invoke-virtual {v2}, Lo12;->a()V

    .line 160
    .line 161
    .line 162
    iput-boolean v7, v1, Lib0;->j:Z

    .line 163
    .line 164
    :cond_8
    if-ne v9, v12, :cond_b

    .line 165
    .line 166
    if-ne v15, v11, :cond_9

    .line 167
    .line 168
    move-object v1, v2

    .line 169
    iget-wide v2, v1, Lo12;->a:J

    .line 170
    .line 171
    const-wide/16 v4, 0x0

    .line 172
    .line 173
    const/16 v6, 0xc

    .line 174
    .line 175
    invoke-static/range {v0 .. v6}, Lam2;->V0(Lam2;Lo12;JJI)V

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_9
    move-object/from16 v20, v2

    .line 180
    .line 181
    move-object v2, v1

    .line 182
    move-object/from16 v1, v20

    .line 183
    .line 184
    iget-boolean v2, v2, Lib0;->j:Z

    .line 185
    .line 186
    if-eqz v2, :cond_b

    .line 187
    .line 188
    invoke-virtual {v0, v1, v1, v5, v6}, Lam2;->a1(Lo12;Lo12;J)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1, v5, v6}, Lam2;->Z0(Lo12;J)V

    .line 192
    .line 193
    .line 194
    iget-wide v1, v1, Lo12;->a:J

    .line 195
    .line 196
    iget-object v5, v0, Lam2;->H:Llb0;

    .line 197
    .line 198
    if-nez v5, :cond_a

    .line 199
    .line 200
    new-instance v5, Llb0;

    .line 201
    .line 202
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 203
    .line 204
    .line 205
    iput-wide v3, v5, Llb0;->i:J

    .line 206
    .line 207
    iput-object v5, v0, Lam2;->H:Llb0;

    .line 208
    .line 209
    :cond_a
    iput-wide v1, v5, Llb0;->i:J

    .line 210
    .line 211
    iput-object v5, v0, Lam2;->K:Ltl;

    .line 212
    .line 213
    :cond_b
    :goto_3
    const/4 v14, 0x0

    .line 214
    goto/16 :goto_1a

    .line 215
    .line 216
    :cond_c
    instance-of v2, v1, Lkb0;

    .line 217
    .line 218
    sget-object v11, Li12;->j:Li12;

    .line 219
    .line 220
    if-eqz v2, :cond_27

    .line 221
    .line 222
    check-cast v1, Lkb0;

    .line 223
    .line 224
    if-ne v9, v13, :cond_d

    .line 225
    .line 226
    :goto_4
    goto :goto_3

    .line 227
    :cond_d
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    const/4 v5, 0x0

    .line 232
    :goto_5
    if-ge v5, v2, :cond_f

    .line 233
    .line 234
    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    move-object v14, v6

    .line 239
    check-cast v14, Lo12;

    .line 240
    .line 241
    iget-wide v14, v14, Lo12;->a:J

    .line 242
    .line 243
    iget-wide v3, v1, Lkb0;->j:J

    .line 244
    .line 245
    invoke-static {v14, v15, v3, v4}, Lup0;->s(JJ)Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-eqz v3, :cond_e

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_e
    add-int/lit8 v5, v5, 0x1

    .line 253
    .line 254
    const-wide v3, 0x7fffffffffffffffL

    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_f
    const/4 v6, 0x0

    .line 261
    :goto_6
    check-cast v6, Lo12;

    .line 262
    .line 263
    if-nez v6, :cond_13

    .line 264
    .line 265
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    const/4 v3, 0x0

    .line 270
    :goto_7
    if-ge v3, v2, :cond_11

    .line 271
    .line 272
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    move-object v5, v4

    .line 277
    check-cast v5, Lo12;

    .line 278
    .line 279
    iget-boolean v5, v5, Lo12;->d:Z

    .line 280
    .line 281
    if-eqz v5, :cond_10

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_10
    add-int/lit8 v3, v3, 0x1

    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_11
    const/4 v4, 0x0

    .line 288
    :goto_8
    move-object v6, v4

    .line 289
    check-cast v6, Lo12;

    .line 290
    .line 291
    if-nez v6, :cond_12

    .line 292
    .line 293
    invoke-virtual {v0}, Lam2;->T0()V

    .line 294
    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_12
    iget-wide v2, v6, Lo12;->a:J

    .line 298
    .line 299
    iput-wide v2, v1, Lkb0;->j:J

    .line 300
    .line 301
    :cond_13
    const-string v2, "AwaitTouchSlop.touchSlopDetector was not initialized"

    .line 302
    .line 303
    const-string v3, "AwaitTouchSlop.initialDown was not initialized"

    .line 304
    .line 305
    if-ne v9, v12, :cond_23

    .line 306
    .line 307
    invoke-virtual {v6}, Lo12;->b()Z

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-nez v4, :cond_20

    .line 312
    .line 313
    invoke-static {v6}, Ltp0;->q(Lo12;)Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-eqz v4, :cond_17

    .line 318
    .line 319
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    const/4 v5, 0x0

    .line 324
    :goto_9
    if-ge v5, v4, :cond_15

    .line 325
    .line 326
    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v14

    .line 330
    move-object v15, v14

    .line 331
    check-cast v15, Lo12;

    .line 332
    .line 333
    iget-boolean v15, v15, Lo12;->d:Z

    .line 334
    .line 335
    if-eqz v15, :cond_14

    .line 336
    .line 337
    goto :goto_a

    .line 338
    :cond_14
    add-int/lit8 v5, v5, 0x1

    .line 339
    .line 340
    goto :goto_9

    .line 341
    :cond_15
    const/4 v14, 0x0

    .line 342
    :goto_a
    check-cast v14, Lo12;

    .line 343
    .line 344
    if-nez v14, :cond_16

    .line 345
    .line 346
    invoke-virtual {v0}, Lam2;->T0()V

    .line 347
    .line 348
    .line 349
    goto/16 :goto_f

    .line 350
    .line 351
    :cond_16
    iget-wide v4, v14, Lo12;->a:J

    .line 352
    .line 353
    iput-wide v4, v1, Lkb0;->j:J

    .line 354
    .line 355
    goto/16 :goto_f

    .line 356
    .line 357
    :cond_17
    sget-object v4, Lly;->t:Ltu2;

    .line 358
    .line 359
    invoke-static {v0, v4}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    check-cast v4, Lza3;

    .line 364
    .line 365
    iget v5, v6, Lo12;->i:I

    .line 366
    .line 367
    invoke-static {v4, v5}, Lyb0;->f(Lza3;I)F

    .line 368
    .line 369
    .line 370
    move-result v4

    .line 371
    iget-object v5, v0, Lam2;->N:Lms0;

    .line 372
    .line 373
    if-eqz v5, :cond_1f

    .line 374
    .line 375
    invoke-static {v6, v7}, Ltp0;->E(Lo12;Z)J

    .line 376
    .line 377
    .line 378
    move-result-wide v14

    .line 379
    invoke-virtual {v5, v14, v15, v4, v7}, Lms0;->a(JFZ)J

    .line 380
    .line 381
    .line 382
    move-result-wide v4

    .line 383
    const-wide v14, 0x7fffffff7fffffffL

    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    and-long/2addr v14, v4

    .line 389
    const-wide v18, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    cmp-long v14, v14, v18

    .line 395
    .line 396
    if-eqz v14, :cond_1e

    .line 397
    .line 398
    invoke-virtual {v0, v6}, Lam2;->f(Lo12;)Z

    .line 399
    .line 400
    .line 401
    move-result v14

    .line 402
    sget-object v15, Lvo0;->w:Lz8;

    .line 403
    .line 404
    invoke-static {v0, v15}, Ltb3;->a(Lu60;Ljava/lang/Object;)Ld43;

    .line 405
    .line 406
    .line 407
    move-result-object v15

    .line 408
    instance-of v7, v15, Lvo0;

    .line 409
    .line 410
    if-eqz v7, :cond_18

    .line 411
    .line 412
    move-object v7, v15

    .line 413
    check-cast v7, Lvo0;

    .line 414
    .line 415
    goto :goto_b

    .line 416
    :cond_18
    const/4 v7, 0x0

    .line 417
    :goto_b
    if-eqz v7, :cond_19

    .line 418
    .line 419
    iget-object v7, v7, Lvo0;->v:Luo0;

    .line 420
    .line 421
    goto :goto_c

    .line 422
    :cond_19
    const/4 v7, 0x0

    .line 423
    :goto_c
    if-eqz v7, :cond_1b

    .line 424
    .line 425
    invoke-interface {v7, v6}, Luo0;->f(Lo12;)Z

    .line 426
    .line 427
    .line 428
    move-result v7

    .line 429
    const/4 v15, 0x1

    .line 430
    if-ne v7, v15, :cond_1a

    .line 431
    .line 432
    move v7, v15

    .line 433
    goto :goto_e

    .line 434
    :cond_1a
    :goto_d
    const/4 v7, 0x0

    .line 435
    goto :goto_e

    .line 436
    :cond_1b
    const/4 v15, 0x1

    .line 437
    goto :goto_d

    .line 438
    :goto_e
    if-nez v14, :cond_1c

    .line 439
    .line 440
    if-eqz v7, :cond_1c

    .line 441
    .line 442
    iput-boolean v15, v1, Lkb0;->k:Z

    .line 443
    .line 444
    goto :goto_f

    .line 445
    :cond_1c
    invoke-virtual {v6}, Lo12;->a()V

    .line 446
    .line 447
    .line 448
    iget-object v7, v1, Lkb0;->i:Lo12;

    .line 449
    .line 450
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v7, v6, v4, v5}, Lam2;->a1(Lo12;Lo12;J)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0, v6, v4, v5}, Lam2;->Z0(Lo12;J)V

    .line 457
    .line 458
    .line 459
    iget-wide v4, v6, Lo12;->a:J

    .line 460
    .line 461
    iget-object v7, v0, Lam2;->H:Llb0;

    .line 462
    .line 463
    if-nez v7, :cond_1d

    .line 464
    .line 465
    new-instance v7, Llb0;

    .line 466
    .line 467
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 468
    .line 469
    .line 470
    const-wide v14, 0x7fffffffffffffffL

    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    iput-wide v14, v7, Llb0;->i:J

    .line 476
    .line 477
    iput-object v7, v0, Lam2;->H:Llb0;

    .line 478
    .line 479
    :cond_1d
    iput-wide v4, v7, Llb0;->i:J

    .line 480
    .line 481
    iput-object v7, v0, Lam2;->K:Ltl;

    .line 482
    .line 483
    goto :goto_f

    .line 484
    :cond_1e
    move v15, v7

    .line 485
    iput-boolean v15, v1, Lkb0;->k:Z

    .line 486
    .line 487
    goto :goto_f

    .line 488
    :cond_1f
    const-string v0, "Touch slop detector not initialized."

    .line 489
    .line 490
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    return-void

    .line 494
    :cond_20
    iget-object v4, v1, Lkb0;->i:Lo12;

    .line 495
    .line 496
    if-eqz v4, :cond_22

    .line 497
    .line 498
    iget-wide v14, v1, Lkb0;->j:J

    .line 499
    .line 500
    iget-object v5, v0, Lam2;->N:Lms0;

    .line 501
    .line 502
    if-eqz v5, :cond_21

    .line 503
    .line 504
    invoke-virtual {v0, v4, v14, v15, v5}, Lam2;->U0(Lo12;JLms0;)V

    .line 505
    .line 506
    .line 507
    goto :goto_f

    .line 508
    :cond_21
    invoke-static {v2}, Ls;->j(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    return-void

    .line 512
    :cond_22
    invoke-static {v3}, Ls;->j(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    return-void

    .line 516
    :cond_23
    :goto_f
    if-ne v9, v11, :cond_b

    .line 517
    .line 518
    iget-boolean v4, v1, Lkb0;->k:Z

    .line 519
    .line 520
    if-eqz v4, :cond_b

    .line 521
    .line 522
    invoke-virtual {v6}, Lo12;->b()Z

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    if-eqz v4, :cond_26

    .line 527
    .line 528
    iget-object v4, v1, Lkb0;->i:Lo12;

    .line 529
    .line 530
    if-eqz v4, :cond_25

    .line 531
    .line 532
    iget-wide v5, v1, Lkb0;->j:J

    .line 533
    .line 534
    iget-object v1, v0, Lam2;->N:Lms0;

    .line 535
    .line 536
    if-eqz v1, :cond_24

    .line 537
    .line 538
    invoke-virtual {v0, v4, v5, v6, v1}, Lam2;->U0(Lo12;JLms0;)V

    .line 539
    .line 540
    .line 541
    goto/16 :goto_3

    .line 542
    .line 543
    :cond_24
    invoke-static {v2}, Ls;->j(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    return-void

    .line 547
    :cond_25
    invoke-static {v3}, Ls;->j(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    return-void

    .line 551
    :cond_26
    const/4 v2, 0x0

    .line 552
    iput-boolean v2, v1, Lkb0;->k:Z

    .line 553
    .line 554
    move v14, v2

    .line 555
    goto/16 :goto_1a

    .line 556
    .line 557
    :cond_27
    instance-of v2, v1, Ljb0;

    .line 558
    .line 559
    if-eqz v2, :cond_2f

    .line 560
    .line 561
    check-cast v1, Ljb0;

    .line 562
    .line 563
    if-eq v9, v11, :cond_28

    .line 564
    .line 565
    goto/16 :goto_3

    .line 566
    .line 567
    :cond_28
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 568
    .line 569
    .line 570
    move-result v2

    .line 571
    const/4 v3, 0x0

    .line 572
    :goto_10
    if-ge v3, v2, :cond_2a

    .line 573
    .line 574
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    check-cast v4, Lo12;

    .line 579
    .line 580
    invoke-virtual {v4}, Lo12;->b()Z

    .line 581
    .line 582
    .line 583
    move-result v4

    .line 584
    if-eqz v4, :cond_29

    .line 585
    .line 586
    const/4 v2, 0x0

    .line 587
    goto :goto_11

    .line 588
    :cond_29
    add-int/lit8 v3, v3, 0x1

    .line 589
    .line 590
    goto :goto_10

    .line 591
    :cond_2a
    const/4 v2, 0x1

    .line 592
    :goto_11
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    const/4 v4, 0x0

    .line 597
    :goto_12
    if-ge v4, v3, :cond_2e

    .line 598
    .line 599
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v5

    .line 603
    check-cast v5, Lo12;

    .line 604
    .line 605
    iget-boolean v5, v5, Lo12;->d:Z

    .line 606
    .line 607
    if-eqz v5, :cond_2d

    .line 608
    .line 609
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 610
    .line 611
    .line 612
    move-result v3

    .line 613
    if-eqz v3, :cond_2b

    .line 614
    .line 615
    goto :goto_13

    .line 616
    :cond_2b
    if-eqz v2, :cond_b

    .line 617
    .line 618
    invoke-static {v10}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    check-cast v2, Lo12;

    .line 623
    .line 624
    iget-wide v2, v2, Lo12;->c:J

    .line 625
    .line 626
    iget-object v4, v1, Ljb0;->i:Lo12;

    .line 627
    .line 628
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    iget-wide v4, v4, Lo12;->c:J

    .line 632
    .line 633
    invoke-static {v2, v3, v4, v5}, Lrs1;->d(JJ)J

    .line 634
    .line 635
    .line 636
    move-result-wide v4

    .line 637
    iget-object v2, v1, Ljb0;->i:Lo12;

    .line 638
    .line 639
    if-eqz v2, :cond_2c

    .line 640
    .line 641
    move-object v6, v2

    .line 642
    iget-wide v2, v1, Ljb0;->j:J

    .line 643
    .line 644
    move-object v1, v6

    .line 645
    const/16 v6, 0x8

    .line 646
    .line 647
    invoke-static/range {v0 .. v6}, Lam2;->V0(Lam2;Lo12;JJI)V

    .line 648
    .line 649
    .line 650
    goto/16 :goto_3

    .line 651
    .line 652
    :cond_2c
    const-string v0, "AwaitGesturePickup.initialDown was not initialized."

    .line 653
    .line 654
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    return-void

    .line 658
    :cond_2d
    add-int/lit8 v4, v4, 0x1

    .line 659
    .line 660
    goto :goto_12

    .line 661
    :cond_2e
    :goto_13
    invoke-virtual {v0}, Lam2;->T0()V

    .line 662
    .line 663
    .line 664
    goto/16 :goto_3

    .line 665
    .line 666
    :cond_2f
    instance-of v2, v1, Llb0;

    .line 667
    .line 668
    if-eqz v2, :cond_3b

    .line 669
    .line 670
    check-cast v1, Llb0;

    .line 671
    .line 672
    if-eq v9, v12, :cond_30

    .line 673
    .line 674
    goto/16 :goto_3

    .line 675
    .line 676
    :cond_30
    iget-wide v2, v1, Llb0;->i:J

    .line 677
    .line 678
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 679
    .line 680
    .line 681
    move-result v4

    .line 682
    const/4 v7, 0x0

    .line 683
    :goto_14
    if-ge v7, v4, :cond_32

    .line 684
    .line 685
    invoke-interface {v10, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v11

    .line 689
    move-object v14, v11

    .line 690
    check-cast v14, Lo12;

    .line 691
    .line 692
    iget-wide v14, v14, Lo12;->a:J

    .line 693
    .line 694
    invoke-static {v14, v15, v2, v3}, Lup0;->s(JJ)Z

    .line 695
    .line 696
    .line 697
    move-result v14

    .line 698
    if-eqz v14, :cond_31

    .line 699
    .line 700
    goto :goto_15

    .line 701
    :cond_31
    add-int/lit8 v7, v7, 0x1

    .line 702
    .line 703
    goto :goto_14

    .line 704
    :cond_32
    const/4 v11, 0x0

    .line 705
    :goto_15
    check-cast v11, Lo12;

    .line 706
    .line 707
    if-nez v11, :cond_33

    .line 708
    .line 709
    goto/16 :goto_4

    .line 710
    .line 711
    :cond_33
    invoke-static {v11}, Ltp0;->q(Lo12;)Z

    .line 712
    .line 713
    .line 714
    move-result v2

    .line 715
    sget-object v3, Lmb0;->a:Lmb0;

    .line 716
    .line 717
    if-eqz v2, :cond_38

    .line 718
    .line 719
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 720
    .line 721
    .line 722
    move-result v2

    .line 723
    const/4 v4, 0x0

    .line 724
    :goto_16
    if-ge v4, v2, :cond_35

    .line 725
    .line 726
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v7

    .line 730
    move-object v14, v7

    .line 731
    check-cast v14, Lo12;

    .line 732
    .line 733
    iget-boolean v14, v14, Lo12;->d:Z

    .line 734
    .line 735
    if-eqz v14, :cond_34

    .line 736
    .line 737
    goto :goto_17

    .line 738
    :cond_34
    add-int/lit8 v4, v4, 0x1

    .line 739
    .line 740
    goto :goto_16

    .line 741
    :cond_35
    const/4 v7, 0x0

    .line 742
    :goto_17
    check-cast v7, Lo12;

    .line 743
    .line 744
    if-nez v7, :cond_37

    .line 745
    .line 746
    invoke-virtual {v11}, Lo12;->b()Z

    .line 747
    .line 748
    .line 749
    move-result v1

    .line 750
    if-nez v1, :cond_36

    .line 751
    .line 752
    invoke-static {v11}, Ltp0;->q(Lo12;)Z

    .line 753
    .line 754
    .line 755
    move-result v1

    .line 756
    if-eqz v1, :cond_36

    .line 757
    .line 758
    invoke-virtual {v0}, Lam2;->Y0()Lhh1;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    invoke-static {v1, v11, v5, v6}, Lga3;->a(Lhh1;Lo12;J)V

    .line 763
    .line 764
    .line 765
    sget-object v1, Lly;->t:Ltu2;

    .line 766
    .line 767
    invoke-static {v0, v1}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    check-cast v1, Lza3;

    .line 772
    .line 773
    invoke-interface {v1}, Lza3;->a()F

    .line 774
    .line 775
    .line 776
    move-result v1

    .line 777
    invoke-virtual {v0}, Lam2;->Y0()Lhh1;

    .line 778
    .line 779
    .line 780
    move-result-object v2

    .line 781
    invoke-static {v1, v1}, Lea3;->a(FF)J

    .line 782
    .line 783
    .line 784
    move-result-wide v3

    .line 785
    invoke-virtual {v2, v3, v4}, Lhh1;->y(J)J

    .line 786
    .line 787
    .line 788
    move-result-wide v1

    .line 789
    invoke-virtual {v0}, Lam2;->Y0()Lhh1;

    .line 790
    .line 791
    .line 792
    move-result-object v3

    .line 793
    iget-object v3, v3, Lhh1;->i:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v3, Lm60;

    .line 796
    .line 797
    iget-object v4, v3, Lm60;->a:Lbb2;

    .line 798
    .line 799
    iget-object v7, v4, Lbb2;->e:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast v7, [Li40;

    .line 802
    .line 803
    invoke-static {v7}, Lmg;->k0([Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    const/4 v7, 0x0

    .line 807
    iput v7, v4, Lbb2;->c:I

    .line 808
    .line 809
    iget-object v4, v3, Lm60;->b:Lbb2;

    .line 810
    .line 811
    iget-object v11, v4, Lbb2;->e:Ljava/lang/Object;

    .line 812
    .line 813
    check-cast v11, [Li40;

    .line 814
    .line 815
    invoke-static {v11}, Lmg;->k0([Ljava/lang/Object;)V

    .line 816
    .line 817
    .line 818
    iput v7, v4, Lbb2;->c:I

    .line 819
    .line 820
    iput-wide v5, v3, Lm60;->c:J

    .line 821
    .line 822
    invoke-virtual {v0}, Lam2;->X0()Lfq;

    .line 823
    .line 824
    .line 825
    move-result-object v3

    .line 826
    new-instance v4, Lpb0;

    .line 827
    .line 828
    invoke-static {v1, v2}, Lp40;->Y(J)J

    .line 829
    .line 830
    .line 831
    move-result-wide v1

    .line 832
    invoke-direct {v4, v1, v2, v7}, Lpb0;-><init>(JZ)V

    .line 833
    .line 834
    .line 835
    invoke-interface {v3, v4}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    iput-boolean v7, v0, Lam2;->F:Z

    .line 839
    .line 840
    goto :goto_18

    .line 841
    :cond_36
    invoke-virtual {v0}, Lam2;->X0()Lfq;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    invoke-interface {v1, v3}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    :goto_18
    invoke-virtual {v0}, Lam2;->T0()V

    .line 849
    .line 850
    .line 851
    goto/16 :goto_3

    .line 852
    .line 853
    :cond_37
    iget-wide v2, v7, Lo12;->a:J

    .line 854
    .line 855
    iput-wide v2, v1, Llb0;->i:J

    .line 856
    .line 857
    goto/16 :goto_3

    .line 858
    .line 859
    :cond_38
    invoke-virtual {v11}, Lo12;->b()Z

    .line 860
    .line 861
    .line 862
    move-result v1

    .line 863
    if-eqz v1, :cond_39

    .line 864
    .line 865
    invoke-virtual {v0}, Lam2;->X0()Lfq;

    .line 866
    .line 867
    .line 868
    move-result-object v1

    .line 869
    invoke-interface {v1, v3}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    goto/16 :goto_3

    .line 873
    .line 874
    :cond_39
    const/4 v15, 0x1

    .line 875
    invoke-static {v11, v15}, Ltp0;->E(Lo12;Z)J

    .line 876
    .line 877
    .line 878
    move-result-wide v1

    .line 879
    invoke-static {v1, v2}, Lrs1;->c(J)F

    .line 880
    .line 881
    .line 882
    move-result v1

    .line 883
    const/4 v2, 0x0

    .line 884
    cmpg-float v1, v1, v2

    .line 885
    .line 886
    if-nez v1, :cond_3a

    .line 887
    .line 888
    goto/16 :goto_3

    .line 889
    .line 890
    :cond_3a
    const/4 v14, 0x0

    .line 891
    invoke-static {v11, v14}, Ltp0;->E(Lo12;Z)J

    .line 892
    .line 893
    .line 894
    move-result-wide v1

    .line 895
    invoke-virtual {v0, v11, v1, v2}, Lam2;->Z0(Lo12;J)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v11}, Lo12;->a()V

    .line 899
    .line 900
    .line 901
    goto :goto_1a

    .line 902
    :cond_3b
    invoke-static {}, Lc80;->s()V

    .line 903
    .line 904
    .line 905
    return-void

    .line 906
    :cond_3c
    const-string v0, "currentDragState should not be null"

    .line 907
    .line 908
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 909
    .line 910
    .line 911
    return-void

    .line 912
    :cond_3d
    move v14, v11

    .line 913
    add-int/lit8 v2, v2, 0x1

    .line 914
    .line 915
    goto/16 :goto_0

    .line 916
    .line 917
    :cond_3e
    :goto_19
    move v14, v11

    .line 918
    :goto_1a
    iget-object v1, v0, Lam2;->B:Lvo0;

    .line 919
    .line 920
    if-nez v1, :cond_3f

    .line 921
    .line 922
    new-instance v1, Lvo0;

    .line 923
    .line 924
    invoke-direct {v1, v0}, Lvo0;-><init>(Luo0;)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v0, v1}, Lu60;->M0(Lt60;)Lt60;

    .line 928
    .line 929
    .line 930
    iput-object v1, v0, Lam2;->B:Lvo0;

    .line 931
    .line 932
    :cond_3f
    iget-boolean v1, v0, Lam2;->z:Z

    .line 933
    .line 934
    if-eqz v1, :cond_52

    .line 935
    .line 936
    iget-object v15, v0, Lam2;->U:Lim2;

    .line 937
    .line 938
    const/4 v1, 0x6

    .line 939
    if-ne v9, v13, :cond_41

    .line 940
    .line 941
    iget v2, v8, Lh12;->f:I

    .line 942
    .line 943
    if-ne v2, v1, :cond_41

    .line 944
    .line 945
    iget-object v2, v0, Lam2;->a0:Lsi1;

    .line 946
    .line 947
    if-nez v2, :cond_40

    .line 948
    .line 949
    new-instance v2, Lsi1;

    .line 950
    .line 951
    new-instance v3, Ln4;

    .line 952
    .line 953
    invoke-static {v0}, Ltp0;->H(Lt60;)Landroid/view/View;

    .line 954
    .line 955
    .line 956
    move-result-object v4

    .line 957
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 958
    .line 959
    .line 960
    move-result-object v4

    .line 961
    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 962
    .line 963
    .line 964
    move-result-object v4

    .line 965
    const/4 v5, 0x1

    .line 966
    invoke-direct {v3, v5, v4}, Ln4;-><init>(ILjava/lang/Object;)V

    .line 967
    .line 968
    .line 969
    new-instance v0, Ljw;

    .line 970
    .line 971
    const/4 v6, 0x4

    .line 972
    const/4 v7, 0x1

    .line 973
    move v4, v1

    .line 974
    const/4 v1, 0x2

    .line 975
    move-object v5, v3

    .line 976
    const-class v3, Lam2;

    .line 977
    .line 978
    move/from16 v16, v4

    .line 979
    .line 980
    const-string v4, "onWheelScrollStopped"

    .line 981
    .line 982
    move-object/from16 v17, v5

    .line 983
    .line 984
    const-string v5, "onWheelScrollStopped-TH1AsA0(J)V"

    .line 985
    .line 986
    move-object v14, v2

    .line 987
    move-object/from16 v11, v17

    .line 988
    .line 989
    move-object/from16 v2, p0

    .line 990
    .line 991
    move-object/from16 v17, v12

    .line 992
    .line 993
    move/from16 v12, v16

    .line 994
    .line 995
    invoke-direct/range {v0 .. v7}, Ljw;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 996
    .line 997
    .line 998
    move-object v1, v0

    .line 999
    move-object v0, v2

    .line 1000
    invoke-static {v0}, Lsp0;->c0(Lt60;)Lr61;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v2

    .line 1004
    iget-object v2, v2, Lr61;->F:Le70;

    .line 1005
    .line 1006
    invoke-direct {v14, v15, v11, v1, v2}, Lsi1;-><init>(Lim2;Ln4;Ljw;Le70;)V

    .line 1007
    .line 1008
    .line 1009
    iput-object v14, v0, Lam2;->a0:Lsi1;

    .line 1010
    .line 1011
    goto :goto_1b

    .line 1012
    :cond_40
    move-object/from16 v17, v12

    .line 1013
    .line 1014
    move v12, v1

    .line 1015
    :goto_1b
    iget-object v1, v0, Lam2;->a0:Lsi1;

    .line 1016
    .line 1017
    if-eqz v1, :cond_42

    .line 1018
    .line 1019
    invoke-virtual {v0}, Lth1;->A0()Lj20;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v2

    .line 1023
    iget-object v3, v1, Lsi1;->h:Lzt2;

    .line 1024
    .line 1025
    if-nez v3, :cond_42

    .line 1026
    .line 1027
    new-instance v3, La2;

    .line 1028
    .line 1029
    const/16 v4, 0x10

    .line 1030
    .line 1031
    const/4 v5, 0x0

    .line 1032
    invoke-direct {v3, v1, v5, v4}, La2;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 1033
    .line 1034
    .line 1035
    const/4 v4, 0x3

    .line 1036
    invoke-static {v2, v5, v3, v4}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v2

    .line 1040
    iput-object v2, v1, Lsi1;->h:Lzt2;

    .line 1041
    .line 1042
    goto :goto_1c

    .line 1043
    :cond_41
    move-object/from16 v17, v12

    .line 1044
    .line 1045
    move v12, v1

    .line 1046
    :cond_42
    :goto_1c
    iget-object v1, v0, Lam2;->a0:Lsi1;

    .line 1047
    .line 1048
    if-eqz v1, :cond_46

    .line 1049
    .line 1050
    iget v2, v8, Lh12;->f:I

    .line 1051
    .line 1052
    if-ne v2, v12, :cond_46

    .line 1053
    .line 1054
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 1055
    .line 1056
    .line 1057
    move-result v2

    .line 1058
    const/4 v3, 0x0

    .line 1059
    :goto_1d
    if-ge v3, v2, :cond_44

    .line 1060
    .line 1061
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v4

    .line 1065
    check-cast v4, Lo12;

    .line 1066
    .line 1067
    invoke-virtual {v4}, Lo12;->b()Z

    .line 1068
    .line 1069
    .line 1070
    move-result v4

    .line 1071
    if-eqz v4, :cond_43

    .line 1072
    .line 1073
    goto :goto_1e

    .line 1074
    :cond_43
    add-int/lit8 v3, v3, 0x1

    .line 1075
    .line 1076
    goto :goto_1d

    .line 1077
    :cond_44
    if-ne v9, v13, :cond_45

    .line 1078
    .line 1079
    iget-boolean v2, v1, Lio1;->d:Z

    .line 1080
    .line 1081
    if-eqz v2, :cond_45

    .line 1082
    .line 1083
    invoke-virtual {v1, v8}, Lsi1;->f(Lh12;)Z

    .line 1084
    .line 1085
    .line 1086
    invoke-static {v8}, Lio1;->a(Lh12;)V

    .line 1087
    .line 1088
    .line 1089
    :cond_45
    move-object/from16 v11, v17

    .line 1090
    .line 1091
    if-ne v9, v11, :cond_47

    .line 1092
    .line 1093
    iget-boolean v2, v1, Lio1;->d:Z

    .line 1094
    .line 1095
    if-nez v2, :cond_47

    .line 1096
    .line 1097
    invoke-virtual {v1, v8}, Lsi1;->f(Lh12;)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v1

    .line 1101
    if-eqz v1, :cond_47

    .line 1102
    .line 1103
    invoke-static {v8}, Lio1;->a(Lh12;)V

    .line 1104
    .line 1105
    .line 1106
    goto :goto_1f

    .line 1107
    :cond_46
    :goto_1e
    move-object/from16 v11, v17

    .line 1108
    .line 1109
    :cond_47
    :goto_1f
    const/16 v12, 0xc

    .line 1110
    .line 1111
    const/16 v14, 0xb

    .line 1112
    .line 1113
    const/16 v1, 0xa

    .line 1114
    .line 1115
    if-ne v9, v13, :cond_4b

    .line 1116
    .line 1117
    iget v2, v8, Lh12;->f:I

    .line 1118
    .line 1119
    if-ne v2, v1, :cond_48

    .line 1120
    .line 1121
    goto :goto_20

    .line 1122
    :cond_48
    if-ne v2, v14, :cond_49

    .line 1123
    .line 1124
    goto :goto_20

    .line 1125
    :cond_49
    if-ne v2, v12, :cond_4b

    .line 1126
    .line 1127
    :goto_20
    iget-object v2, v0, Lam2;->b0:Ld33;

    .line 1128
    .line 1129
    if-nez v2, :cond_4a

    .line 1130
    .line 1131
    new-instance v2, Ld33;

    .line 1132
    .line 1133
    new-instance v0, Ljw;

    .line 1134
    .line 1135
    const/4 v6, 0x4

    .line 1136
    const/4 v7, 0x2

    .line 1137
    move v3, v1

    .line 1138
    const/4 v1, 0x2

    .line 1139
    move v4, v3

    .line 1140
    const-class v3, Lam2;

    .line 1141
    .line 1142
    move v5, v4

    .line 1143
    const-string v4, "onTrackpadScrollStopped"

    .line 1144
    .line 1145
    move/from16 v17, v5

    .line 1146
    .line 1147
    const-string v5, "onTrackpadScrollStopped-TH1AsA0(J)V"

    .line 1148
    .line 1149
    move-object v12, v2

    .line 1150
    move/from16 v14, v17

    .line 1151
    .line 1152
    move-object/from16 v2, p0

    .line 1153
    .line 1154
    invoke-direct/range {v0 .. v7}, Ljw;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1155
    .line 1156
    .line 1157
    move-object v1, v0

    .line 1158
    move-object v0, v2

    .line 1159
    invoke-static {v0}, Lsp0;->c0(Lt60;)Lr61;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v2

    .line 1163
    iget-object v2, v2, Lr61;->F:Le70;

    .line 1164
    .line 1165
    invoke-direct {v12, v15, v1, v2}, Ld33;-><init>(Lim2;Ljw;Le70;)V

    .line 1166
    .line 1167
    .line 1168
    iput-object v12, v0, Lam2;->b0:Ld33;

    .line 1169
    .line 1170
    goto :goto_21

    .line 1171
    :cond_4a
    move v14, v1

    .line 1172
    :goto_21
    iget-object v1, v0, Lam2;->b0:Ld33;

    .line 1173
    .line 1174
    if-eqz v1, :cond_4c

    .line 1175
    .line 1176
    invoke-virtual {v0}, Lth1;->A0()Lj20;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v2

    .line 1180
    iget-object v3, v1, Ld33;->g:Lzt2;

    .line 1181
    .line 1182
    if-nez v3, :cond_4c

    .line 1183
    .line 1184
    new-instance v3, Lk9;

    .line 1185
    .line 1186
    const/4 v5, 0x0

    .line 1187
    invoke-direct {v3, v1, v5}, Lk9;-><init>(Ld33;Lt00;)V

    .line 1188
    .line 1189
    .line 1190
    const/4 v4, 0x3

    .line 1191
    invoke-static {v2, v5, v3, v4}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v2

    .line 1195
    iput-object v2, v1, Ld33;->g:Lzt2;

    .line 1196
    .line 1197
    goto :goto_22

    .line 1198
    :cond_4b
    move v14, v1

    .line 1199
    :cond_4c
    :goto_22
    iget-object v0, v0, Lam2;->b0:Ld33;

    .line 1200
    .line 1201
    if-eqz v0, :cond_52

    .line 1202
    .line 1203
    iget v1, v8, Lh12;->f:I

    .line 1204
    .line 1205
    if-ne v1, v14, :cond_4d

    .line 1206
    .line 1207
    goto :goto_23

    .line 1208
    :cond_4d
    const/16 v2, 0xb

    .line 1209
    .line 1210
    if-ne v1, v2, :cond_4e

    .line 1211
    .line 1212
    goto :goto_23

    .line 1213
    :cond_4e
    const/16 v2, 0xc

    .line 1214
    .line 1215
    if-ne v1, v2, :cond_52

    .line 1216
    .line 1217
    :goto_23
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 1218
    .line 1219
    .line 1220
    move-result v1

    .line 1221
    const/4 v2, 0x0

    .line 1222
    :goto_24
    if-ge v2, v1, :cond_50

    .line 1223
    .line 1224
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v3

    .line 1228
    check-cast v3, Lo12;

    .line 1229
    .line 1230
    invoke-virtual {v3}, Lo12;->b()Z

    .line 1231
    .line 1232
    .line 1233
    move-result v3

    .line 1234
    if-eqz v3, :cond_4f

    .line 1235
    .line 1236
    goto :goto_25

    .line 1237
    :cond_4f
    add-int/lit8 v2, v2, 0x1

    .line 1238
    .line 1239
    goto :goto_24

    .line 1240
    :cond_50
    if-ne v9, v13, :cond_51

    .line 1241
    .line 1242
    iget-boolean v1, v0, Lio1;->d:Z

    .line 1243
    .line 1244
    if-eqz v1, :cond_51

    .line 1245
    .line 1246
    invoke-virtual {v0, v8}, Ld33;->d(Lh12;)Z

    .line 1247
    .line 1248
    .line 1249
    invoke-static {v8}, Lio1;->a(Lh12;)V

    .line 1250
    .line 1251
    .line 1252
    :cond_51
    if-ne v9, v11, :cond_52

    .line 1253
    .line 1254
    iget-boolean v1, v0, Lio1;->d:Z

    .line 1255
    .line 1256
    if-nez v1, :cond_52

    .line 1257
    .line 1258
    invoke-virtual {v0, v8}, Ld33;->d(Lh12;)Z

    .line 1259
    .line 1260
    .line 1261
    move-result v0

    .line 1262
    if-eqz v0, :cond_52

    .line 1263
    .line 1264
    invoke-static {v8}, Lio1;->a(Lh12;)V

    .line 1265
    .line 1266
    .line 1267
    :cond_52
    :goto_25
    return-void
.end method

.method public final M(Loy0;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lci0;->y(Loy0;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-boolean p0, p0, Lam2;->z:Z

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final S0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lam2;->D:Lfc0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lam2;->A:Lbk1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Lec0;

    .line 10
    .line 11
    invoke-direct {v2, v0}, Lec0;-><init>(Lfc0;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lbk1;->b(Lj11;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lam2;->D:Lfc0;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final T0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lam2;->G:Lib0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lhb0;->j:Lhb0;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lib0;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v0, Lib0;->i:Lhb0;

    .line 14
    .line 15
    iput-boolean v1, v0, Lib0;->j:Z

    .line 16
    .line 17
    iput-object v0, p0, Lam2;->G:Lib0;

    .line 18
    .line 19
    :cond_0
    iput-object v2, v0, Lib0;->i:Lhb0;

    .line 20
    .line 21
    iput-boolean v1, v0, Lib0;->j:Z

    .line 22
    .line 23
    iput-object v0, p0, Lam2;->K:Ltl;

    .line 24
    .line 25
    return-void
.end method

.method public final U0(Lo12;JLms0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lam2;->J:Ljb0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljb0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Ljb0;->i:Lo12;

    .line 12
    .line 13
    const-wide v1, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v1, v0, Ljb0;->j:J

    .line 19
    .line 20
    iput-object v0, p0, Lam2;->J:Ljb0;

    .line 21
    .line 22
    :cond_0
    iput-object p1, v0, Ljb0;->i:Lo12;

    .line 23
    .line 24
    iput-wide p2, v0, Ljb0;->j:J

    .line 25
    .line 26
    const-wide/16 p1, 0x0

    .line 27
    .line 28
    iput-wide p1, p4, Lms0;->a:J

    .line 29
    .line 30
    iput-object v0, p0, Lam2;->K:Ltl;

    .line 31
    .line 32
    return-void
.end method

.method public final W0(Lqb0;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lob0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lam2;->E:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lam2;->E:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lam2;->c1()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lam2;->X0()Lfq;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0, p1}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final X(Landroid/view/KeyEvent;)Z
    .locals 10

    .line 1
    iget-boolean v0, p0, Lam2;->z:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    invoke-static {p1}, Lqp0;->z(Landroid/view/KeyEvent;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    sget-wide v4, Lb51;->D:J

    .line 11
    .line 12
    invoke-static {v2, v3, v4, v5}, Lb51;->a(JJ)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Lsp0;->f(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    sget-wide v4, Lb51;->C:J

    .line 27
    .line 28
    invoke-static {v2, v3, v4, v5}, Lb51;->a(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_5

    .line 33
    .line 34
    :cond_0
    invoke-static {p1}, Lqp0;->C(Landroid/view/KeyEvent;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v2, 0x2

    .line 39
    if-ne v0, v2, :cond_5

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_5

    .line 46
    .line 47
    iget-object v0, p0, Lam2;->U:Lim2;

    .line 48
    .line 49
    iget-object v0, v0, Lim2;->d:Lqv1;

    .line 50
    .line 51
    sget-object v2, Lqv1;->h:Lqv1;

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    if-ne v0, v2, :cond_1

    .line 55
    .line 56
    move v1, v3

    .line 57
    :cond_1
    const/4 v0, 0x0

    .line 58
    const/16 v2, 0x20

    .line 59
    .line 60
    const-wide v4, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    iget-object v6, p0, Lam2;->X:Lg00;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-virtual {v6}, Lg00;->N0()J

    .line 70
    .line 71
    .line 72
    move-result-wide v6

    .line 73
    and-long/2addr v6, v4

    .line 74
    long-to-int v1, v6

    .line 75
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    invoke-static {p1}, Lsp0;->f(I)J

    .line 80
    .line 81
    .line 82
    move-result-wide v6

    .line 83
    sget-wide v8, Lb51;->C:J

    .line 84
    .line 85
    invoke-static {v6, v7, v8, v9}, Lb51;->a(JJ)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    int-to-float p1, v1

    .line 92
    goto :goto_0

    .line 93
    :cond_2
    int-to-float p1, v1

    .line 94
    neg-float p1, p1

    .line 95
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    int-to-long v0, v0

    .line 100
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    int-to-long v6, p1

    .line 105
    shl-long/2addr v0, v2

    .line 106
    and-long/2addr v4, v6

    .line 107
    or-long/2addr v0, v4

    .line 108
    :goto_1
    move-wide v6, v0

    .line 109
    goto :goto_3

    .line 110
    :cond_3
    invoke-virtual {v6}, Lg00;->N0()J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    shr-long/2addr v6, v2

    .line 115
    long-to-int v1, v6

    .line 116
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-static {p1}, Lsp0;->f(I)J

    .line 121
    .line 122
    .line 123
    move-result-wide v6

    .line 124
    sget-wide v8, Lb51;->C:J

    .line 125
    .line 126
    invoke-static {v6, v7, v8, v9}, Lb51;->a(JJ)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    int-to-float p1, v1

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    int-to-float p1, v1

    .line 135
    neg-float p1, p1

    .line 136
    :goto_2
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    int-to-long v6, p1

    .line 141
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    int-to-long v0, p1

    .line 146
    shl-long/2addr v6, v2

    .line 147
    and-long/2addr v0, v4

    .line 148
    or-long/2addr v0, v6

    .line 149
    goto :goto_1

    .line 150
    :goto_3
    invoke-virtual {p0}, Lth1;->A0()Lj20;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance v4, Lyl2;

    .line 155
    .line 156
    const/4 v9, 0x0

    .line 157
    const/4 v8, 0x0

    .line 158
    move-object v5, p0

    .line 159
    invoke-direct/range {v4 .. v9}, Lyl2;-><init>(Lam2;JLt00;I)V

    .line 160
    .line 161
    .line 162
    const/4 p0, 0x3

    .line 163
    invoke-static {p1, v8, v4, p0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 164
    .line 165
    .line 166
    return v3

    .line 167
    :cond_5
    return v1
.end method

.method public final X0()Lfq;
    .locals 0

    .line 1
    iget-object p0, p0, Lam2;->C:Ljn;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Events channel not initialized."

    .line 7
    .line 8
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final Y0()Lhh1;
    .locals 0

    .line 1
    iget-object p0, p0, Lam2;->L:Lhh1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Velocity Tracker not initialized."

    .line 7
    .line 8
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final Z0(Lo12;J)V
    .locals 6

    .line 1
    iget-object v0, p0, Lth1;->h:Lth1;

    .line 2
    .line 3
    invoke-static {v0}, Lsp0;->b0(Lt60;)Lzn1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lzn1;->c(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-wide v2, p0, Lam2;->M:J

    .line 14
    .line 15
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3, v4, v5}, Lrs1;->b(JJ)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    iget-wide v2, p0, Lam2;->M:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, Lrs1;->b(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    iget-wide v2, p0, Lam2;->M:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, Lrs1;->d(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    iget-wide v4, p0, Lam2;->P:J

    .line 41
    .line 42
    invoke-static {v4, v5, v2, v3}, Lrs1;->e(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    iput-wide v2, p0, Lam2;->P:J

    .line 47
    .line 48
    :cond_0
    iput-wide v0, p0, Lam2;->M:J

    .line 49
    .line 50
    invoke-virtual {p0}, Lam2;->Y0()Lhh1;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-wide v1, p0, Lam2;->P:J

    .line 55
    .line 56
    invoke-static {v0, p1, v1, v2}, Lga3;->a(Lhh1;Lo12;J)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lam2;->X0()Lfq;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    new-instance p1, Lnb0;

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    invoke-direct {p1, p2, p3, v0}, Lnb0;-><init>(JZ)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p0, p1}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final a()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lam2;->m0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lth1;->u:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, Lr61;->F:Le70;

    .line 14
    .line 15
    iget-object v1, p0, Lam2;->T:Ln50;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v2, Lhh1;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Lhh1;-><init>(Le70;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lr40;

    .line 26
    .line 27
    invoke-direct {v0, v2}, Lr40;-><init>(Lhh1;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, v1, Ln50;->a:Lr40;

    .line 31
    .line 32
    :goto_0
    iget-object v0, p0, Lam2;->a0:Lsi1;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, Lr61;->F:Le70;

    .line 41
    .line 42
    iput-object v1, v0, Lio1;->c:Le70;

    .line 43
    .line 44
    :cond_1
    iget-object v0, p0, Lam2;->b0:Ld33;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-object p0, p0, Lr61;->F:Le70;

    .line 53
    .line 54
    iput-object p0, v0, Lio1;->c:Le70;

    .line 55
    .line 56
    :cond_2
    return-void
.end method

.method public final a1(Lo12;Lo12;J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lam2;->L:Lhh1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lhh1;

    .line 6
    .line 7
    const/16 v1, 0x1c

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lhh1;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lam2;->L:Lhh1;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lam2;->Y0()Lhh1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-wide/16 v1, 0x0

    .line 19
    .line 20
    invoke-static {v0, p1, v1, v2}, Lga3;->a(Lhh1;Lo12;J)V

    .line 21
    .line 22
    .line 23
    iget-wide v3, p2, Lo12;->c:J

    .line 24
    .line 25
    invoke-static {v3, v4, p3, p4}, Lrs1;->d(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p2

    .line 29
    iput-wide v1, p0, Lam2;->P:J

    .line 30
    .line 31
    iget-object p4, p0, Lam2;->y:Lml2;

    .line 32
    .line 33
    iget p1, p1, Lo12;->i:I

    .line 34
    .line 35
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const/4 p4, 0x2

    .line 39
    if-ne p1, p4, :cond_1

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 p1, 0x0

    .line 44
    :goto_0
    if-nez p1, :cond_4

    .line 45
    .line 46
    iget-boolean p1, p0, Lam2;->E:Z

    .line 47
    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    iget-object p1, p0, Lam2;->C:Ljn;

    .line 51
    .line 52
    if-nez p1, :cond_2

    .line 53
    .line 54
    const p1, 0x7fffffff

    .line 55
    .line 56
    .line 57
    const/4 p4, 0x6

    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-static {p1, p4, v0}, Lfg1;->a(IILhn;)Ljn;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lam2;->C:Ljn;

    .line 64
    .line 65
    :cond_2
    invoke-virtual {p0}, Lam2;->c1()V

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-static {p0}, Lsp0;->b0(Lt60;)Lzn1;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1, v1, v2}, Lzn1;->c(J)J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    iput-wide v0, p0, Lam2;->M:J

    .line 77
    .line 78
    invoke-virtual {p0}, Lam2;->X0()Lfq;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance p1, Lob0;

    .line 83
    .line 84
    invoke-direct {p1, p2, p3}, Lob0;-><init>(J)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p0, p1}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    :cond_4
    return-void
.end method

.method public final b1()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lam2;->U:Lim2;

    .line 2
    .line 3
    iget-object v0, p0, Lim2;->a:Lbm2;

    .line 4
    .line 5
    invoke-interface {v0}, Lbm2;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_8

    .line 10
    .line 11
    iget-object p0, p0, Lim2;->b:Ls8;

    .line 12
    .line 13
    if-eqz p0, :cond_7

    .line 14
    .line 15
    iget-object p0, p0, Ls8;->c:Ljd0;

    .line 16
    .line 17
    iget-object v0, p0, Ljd0;->d:Landroid/widget/EdgeEffect;

    .line 18
    .line 19
    const/16 v1, 0x1f

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    if-lt v3, v1, :cond_0

    .line 27
    .line 28
    invoke-static {v0}, Lne;->c(Landroid/widget/EdgeEffect;)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v0, v2

    .line 34
    :goto_0
    cmpg-float v0, v0, v2

    .line 35
    .line 36
    if-nez v0, :cond_8

    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Ljd0;->e:Landroid/widget/EdgeEffect;

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 43
    .line 44
    if-lt v3, v1, :cond_2

    .line 45
    .line 46
    invoke-static {v0}, Lne;->c(Landroid/widget/EdgeEffect;)F

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v0, v2

    .line 52
    :goto_1
    cmpg-float v0, v0, v2

    .line 53
    .line 54
    if-nez v0, :cond_8

    .line 55
    .line 56
    :cond_3
    iget-object v0, p0, Ljd0;->f:Landroid/widget/EdgeEffect;

    .line 57
    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    if-lt v3, v1, :cond_4

    .line 63
    .line 64
    invoke-static {v0}, Lne;->c(Landroid/widget/EdgeEffect;)F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    goto :goto_2

    .line 69
    :cond_4
    move v0, v2

    .line 70
    :goto_2
    cmpg-float v0, v0, v2

    .line 71
    .line 72
    if-nez v0, :cond_8

    .line 73
    .line 74
    :cond_5
    iget-object p0, p0, Ljd0;->g:Landroid/widget/EdgeEffect;

    .line 75
    .line 76
    if-eqz p0, :cond_7

    .line 77
    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 79
    .line 80
    if-lt v0, v1, :cond_6

    .line 81
    .line 82
    invoke-static {p0}, Lne;->c(Landroid/widget/EdgeEffect;)F

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    goto :goto_3

    .line 87
    :cond_6
    move p0, v2

    .line 88
    :goto_3
    cmpg-float p0, p0, v2

    .line 89
    .line 90
    if-nez p0, :cond_8

    .line 91
    .line 92
    :cond_7
    const/4 p0, 0x0

    .line 93
    return p0

    .line 94
    :cond_8
    const/4 p0, 0x1

    .line 95
    return p0
.end method

.method public final c1()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lam2;->E:Z

    .line 3
    .line 4
    iget-object v0, p0, Lam2;->C:Ljn;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const v0, 0x7fffffff

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    invoke-static {v0, v2, v1}, Lfg1;->a(IILhn;)Ljn;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lam2;->C:Ljn;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lth1;->A0()Lj20;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, Ldc0;

    .line 24
    .line 25
    invoke-direct {v2, p0, v1}, Ldc0;-><init>(Lam2;Lt00;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x3

    .line 29
    invoke-static {v0, v1, v2, p0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final d1(Ls8;Ln50;Lbk1;Lqv1;Lbm2;ZZ)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lam2;->z:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eq v0, p6, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lam2;->V:Lox;

    .line 8
    .line 9
    iput-boolean p6, v0, Lox;->h:Z

    .line 10
    .line 11
    move v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v2

    .line 14
    :goto_0
    if-nez p2, :cond_1

    .line 15
    .line 16
    iget-object v3, p0, Lam2;->T:Ln50;

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object v3, p2

    .line 20
    :goto_1
    iget-object v4, p0, Lam2;->U:Lim2;

    .line 21
    .line 22
    iget-object v5, v4, Lim2;->a:Lbm2;

    .line 23
    .line 24
    invoke-static {v5, p5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v5, :cond_2

    .line 29
    .line 30
    iput-object p5, v4, Lim2;->a:Lbm2;

    .line 31
    .line 32
    move p5, v1

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move p5, v2

    .line 35
    :goto_2
    iput-object p1, v4, Lim2;->b:Ls8;

    .line 36
    .line 37
    iget-object v5, v4, Lim2;->d:Lqv1;

    .line 38
    .line 39
    if-eq v5, p4, :cond_3

    .line 40
    .line 41
    iput-object p4, v4, Lim2;->d:Lqv1;

    .line 42
    .line 43
    move p5, v1

    .line 44
    :cond_3
    iget-boolean v5, v4, Lim2;->e:Z

    .line 45
    .line 46
    if-eq v5, p7, :cond_4

    .line 47
    .line 48
    iput-boolean p7, v4, Lim2;->e:Z

    .line 49
    .line 50
    move p5, v1

    .line 51
    :cond_4
    iput-object v3, v4, Lim2;->c:Ln50;

    .line 52
    .line 53
    iget-object v3, p0, Lam2;->S:Ltm1;

    .line 54
    .line 55
    iput-object v3, v4, Lim2;->f:Ltm1;

    .line 56
    .line 57
    iget-object v3, p0, Lam2;->X:Lg00;

    .line 58
    .line 59
    iput-object p4, v3, Lg00;->v:Lqv1;

    .line 60
    .line 61
    iput-boolean p7, v3, Lg00;->x:Z

    .line 62
    .line 63
    iput-object p1, p0, Lam2;->Q:Ls8;

    .line 64
    .line 65
    iput-object p2, p0, Lam2;->R:Ln50;

    .line 66
    .line 67
    sget-object p1, Lul2;->a:Lml2;

    .line 68
    .line 69
    iget-object p2, v4, Lim2;->d:Lqv1;

    .line 70
    .line 71
    sget-object p4, Lqv1;->h:Lqv1;

    .line 72
    .line 73
    if-ne p2, p4, :cond_5

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    sget-object p4, Lqv1;->i:Lqv1;

    .line 77
    .line 78
    :goto_3
    iput-object p1, p0, Lam2;->y:Lml2;

    .line 79
    .line 80
    iget-boolean p1, p0, Lam2;->z:Z

    .line 81
    .line 82
    const/4 p2, 0x0

    .line 83
    if-eq p1, p6, :cond_7

    .line 84
    .line 85
    iput-boolean p6, p0, Lam2;->z:Z

    .line 86
    .line 87
    if-nez p6, :cond_6

    .line 88
    .line 89
    invoke-virtual {p0}, Lam2;->S0()V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Lam2;->O:Lvy0;

    .line 93
    .line 94
    :cond_6
    move p5, v1

    .line 95
    :cond_7
    iget-object p1, p0, Lam2;->A:Lbk1;

    .line 96
    .line 97
    invoke-static {p1, p3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-nez p1, :cond_8

    .line 102
    .line 103
    invoke-virtual {p0}, Lam2;->S0()V

    .line 104
    .line 105
    .line 106
    iput-object p3, p0, Lam2;->A:Lbk1;

    .line 107
    .line 108
    :cond_8
    iget-object p1, p0, Lam2;->x:Lqv1;

    .line 109
    .line 110
    if-eq p1, p4, :cond_9

    .line 111
    .line 112
    iput-object p4, p0, Lam2;->x:Lqv1;

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_9
    move v1, p5

    .line 116
    :goto_4
    if-eqz v1, :cond_d

    .line 117
    .line 118
    iget-boolean p1, p0, Lam2;->F:Z

    .line 119
    .line 120
    sget-object p3, Lmb0;->a:Lmb0;

    .line 121
    .line 122
    if-eqz p1, :cond_b

    .line 123
    .line 124
    invoke-virtual {p0}, Lam2;->T0()V

    .line 125
    .line 126
    .line 127
    iget-boolean p1, p0, Lam2;->E:Z

    .line 128
    .line 129
    if-eqz p1, :cond_a

    .line 130
    .line 131
    invoke-virtual {p0}, Lam2;->X0()Lfq;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-interface {p1, p3}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    :cond_a
    iput-object p2, p0, Lam2;->L:Lhh1;

    .line 139
    .line 140
    :cond_b
    iget-object p1, p0, Lam2;->O:Lvy0;

    .line 141
    .line 142
    if-eqz p1, :cond_d

    .line 143
    .line 144
    invoke-virtual {p1}, Lvy0;->a()V

    .line 145
    .line 146
    .line 147
    iget-object p4, p1, Lvy0;->a:Lam2;

    .line 148
    .line 149
    iget-boolean p5, p4, Lam2;->E:Z

    .line 150
    .line 151
    if-eqz p5, :cond_c

    .line 152
    .line 153
    invoke-virtual {p4, p3}, Lam2;->W0(Lqb0;)V

    .line 154
    .line 155
    .line 156
    :cond_c
    iput-object p2, p1, Lvy0;->g:Lhh1;

    .line 157
    .line 158
    iget-object p1, p1, Lvy0;->k:Ldk;

    .line 159
    .line 160
    iput v2, p1, Ldk;->i:I

    .line 161
    .line 162
    iget-object p1, p1, Ldk;->j:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p1, Lck1;

    .line 165
    .line 166
    iput v2, p1, Lck1;->b:I

    .line 167
    .line 168
    :cond_d
    if-eqz v0, :cond_e

    .line 169
    .line 170
    iput-object p2, p0, Lam2;->Y:Ls9;

    .line 171
    .line 172
    iput-object p2, p0, Lam2;->Z:Lyl2;

    .line 173
    .line 174
    invoke-static {p0}, Lqp0;->E(Lon2;)V

    .line 175
    .line 176
    .line 177
    :cond_e
    return-void
.end method

.method public final f(Lo12;)Z
    .locals 8

    .line 1
    invoke-static {p1}, Ltp0;->o(Lo12;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean p0, p0, Lam2;->z:Z

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    invoke-static {p1}, Ltp0;->q(Lo12;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lam2;->N:Lms0;

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    new-instance v0, Lms0;

    .line 24
    .line 25
    iget-object v2, p0, Lam2;->x:Lqv1;

    .line 26
    .line 27
    invoke-direct {v0, v2}, Lms0;-><init>(Lqv1;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lam2;->N:Lms0;

    .line 31
    .line 32
    :cond_2
    sget-object v0, Lly;->t:Ltu2;

    .line 33
    .line 34
    invoke-static {p0, v0}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lza3;

    .line 39
    .line 40
    invoke-interface {v0}, Lza3;->d()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p1, v1}, Ltp0;->E(Lo12;Z)J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    iget-object p0, p0, Lam2;->N:Lms0;

    .line 49
    .line 50
    if-eqz p0, :cond_7

    .line 51
    .line 52
    invoke-virtual {p0, v2, v3, v0, v1}, Lms0;->a(JFZ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-static {v4, v5, v6, v7}, Lrs1;->b(JJ)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_6

    .line 66
    .line 67
    iget-wide v4, p0, Lms0;->a:J

    .line 68
    .line 69
    invoke-static {v4, v5, v2, v3}, Lrs1;->e(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    const/16 p1, 0x20

    .line 74
    .line 75
    shr-long v4, v2, p1

    .line 76
    .line 77
    long-to-int p1, v4

    .line 78
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    const-wide v4, 0xffffffffL

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    and-long/2addr v2, v4

    .line 92
    long-to-int v0, v2

    .line 93
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    float-to-double v2, v0

    .line 102
    float-to-double v4, p1

    .line 103
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    double-to-float p1, v2

    .line 108
    const/high16 v0, 0x43340000    # 180.0f

    .line 109
    .line 110
    mul-float/2addr p1, v0

    .line 111
    float-to-double v2, p1

    .line 112
    const-wide v4, 0x400921fb54442d18L    # Math.PI

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    div-double/2addr v2, v4

    .line 118
    iget-object p0, p0, Lms0;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p0, Lqv1;

    .line 121
    .line 122
    if-nez p0, :cond_3

    .line 123
    .line 124
    const/4 p0, -0x1

    .line 125
    goto :goto_0

    .line 126
    :cond_3
    sget-object p1, Ly23;->a:[I

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    aget p0, p1, p0

    .line 133
    .line 134
    :goto_0
    const/4 p1, 0x1

    .line 135
    const-wide/high16 v4, 0x403e000000000000L    # 30.0

    .line 136
    .line 137
    if-eq p0, p1, :cond_5

    .line 138
    .line 139
    const/4 v0, 0x2

    .line 140
    if-eq p0, v0, :cond_4

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_4
    cmpl-double p0, v2, v4

    .line 144
    .line 145
    if-lez p0, :cond_6

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_5
    cmpg-double p0, v2, v4

    .line 149
    .line 150
    if-gez p0, :cond_6

    .line 151
    .line 152
    :goto_1
    return p1

    .line 153
    :cond_6
    :goto_2
    return v1

    .line 154
    :cond_7
    const-string p0, "Touch slop detector not initialized."

    .line 155
    .line 156
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    return v1
.end method

.method public final k(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final l0(Lzn2;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lam2;->z:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lam2;->Y:Ls9;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lam2;->Z:Lyl2;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    new-instance v0, Ls9;

    .line 15
    .line 16
    const/16 v2, 0x11

    .line 17
    .line 18
    invoke-direct {v0, v2, p0}, Ls9;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lam2;->Y:Ls9;

    .line 22
    .line 23
    new-instance v0, Lyl2;

    .line 24
    .line 25
    invoke-direct {v0, p0, v1}, Lyl2;-><init>(Lam2;Lt00;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lam2;->Z:Lyl2;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lam2;->Y:Ls9;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    sget-object v2, Lxn2;->a:[Lv41;

    .line 35
    .line 36
    sget-object v2, Lkn2;->d:Lyn2;

    .line 37
    .line 38
    new-instance v3, Lq3;

    .line 39
    .line 40
    invoke-direct {v3, v1, v0}, Lq3;-><init>(Ljava/lang/String;Lun0;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v2, v3}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object p0, p0, Lam2;->Z:Lyl2;

    .line 47
    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    sget-object v0, Lxn2;->a:[Lv41;

    .line 51
    .line 52
    sget-object v0, Lkn2;->e:Lyn2;

    .line 53
    .line 54
    invoke-interface {p1, v0, p0}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    return-void
.end method

.method public final m0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lam2;->F:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lam2;->T0()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lam2;->E:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lam2;->X0()Lfq;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lmb0;->a:Lmb0;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lam2;->L:Lhh1;

    .line 23
    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lam2;->F:Z

    .line 26
    .line 27
    return-void
.end method
