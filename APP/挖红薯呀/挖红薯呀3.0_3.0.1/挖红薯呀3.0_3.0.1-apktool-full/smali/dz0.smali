.class public final Ldz0;
.super Lsm;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements La50;
.implements Lvz0;
.implements Lqr0;
.implements Lq10;
.implements Lzi;


# instance fields
.field public A:Z

.field public B:Lvp;

.field public C:Lyp;

.field public D:Lxp;

.field public E:Lwp;

.field public F:Li4;

.field public G:Lqb1;

.field public H:J

.field public I:Lq81;

.field public J:Lo10;

.field public K:J

.field public L:Lj5;

.field public M:Lyt;

.field public final N:Ly2;

.field public final O:Lsy0;

.field public final P:Lvl;

.field public final Q:Llz0;

.field public final R:Lyy0;

.field public final S:Ldv;

.field public final T:Lck;

.field public U:Lya;

.field public V:Lbz0;

.field public W:Lfn;

.field public t:Lum0;

.field public u:Lsx0;

.field public v:Z

.field public w:Lxg0;

.field public x:Lvb;

.field public y:Llq;

.field public z:Z


# direct methods
.method public constructor <init>(Lj5;Lkb;Lyt;Lxg0;Lum0;Lez0;ZZ)V
    .locals 10

    .line 1
    move/from16 v9, p7

    .line 2
    .line 3
    sget-object v0, Lwy0;->a:Lsx0;

    .line 4
    .line 5
    invoke-direct {p0}, Lsm;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p5, p0, Ldz0;->t:Lum0;

    .line 9
    .line 10
    iput-object v0, p0, Ldz0;->u:Lsx0;

    .line 11
    .line 12
    iput-boolean v9, p0, Ldz0;->v:Z

    .line 13
    .line 14
    iput-object p4, p0, Ldz0;->w:Lxg0;

    .line 15
    .line 16
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide v0, p0, Ldz0;->H:J

    .line 22
    .line 23
    const-wide/16 v0, 0x0

    .line 24
    .line 25
    iput-wide v0, p0, Ldz0;->K:J

    .line 26
    .line 27
    iput-object p1, p0, Ldz0;->L:Lj5;

    .line 28
    .line 29
    iput-object p3, p0, Ldz0;->M:Lyt;

    .line 30
    .line 31
    new-instance v6, Ly2;

    .line 32
    .line 33
    invoke-direct {v6}, Ly2;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v6, p0, Ldz0;->N:Ly2;

    .line 37
    .line 38
    new-instance v0, Lsy0;

    .line 39
    .line 40
    invoke-direct {v0}, Loe0;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-boolean v9, v0, Lsy0;->r:Z

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lsm;->w0(Lrm;)Lrm;

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Ldz0;->O:Lsy0;

    .line 49
    .line 50
    new-instance v0, Lvl;

    .line 51
    .line 52
    sget-object v1, Lwy0;->d:Lno0;

    .line 53
    .line 54
    new-instance v3, Lx1;

    .line 55
    .line 56
    invoke-direct {v3, v1}, Lx1;-><init>(Lym;)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Lml;

    .line 60
    .line 61
    invoke-direct {v1, v3}, Lml;-><init>(Lx1;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, v1}, Lvl;-><init>(Lml;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Ldz0;->P:Lvl;

    .line 68
    .line 69
    iget-object v2, p0, Ldz0;->L:Lj5;

    .line 70
    .line 71
    iget-object v1, p0, Ldz0;->M:Lyt;

    .line 72
    .line 73
    if-nez v1, :cond_0

    .line 74
    .line 75
    move-object v3, v0

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move-object v3, v1

    .line 78
    :goto_0
    new-instance v0, Llz0;

    .line 79
    .line 80
    new-instance v8, Lzy0;

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    invoke-direct {v8, p0, v1}, Lzy0;-><init>(Ldz0;I)V

    .line 84
    .line 85
    .line 86
    move-object v7, p0

    .line 87
    move-object v4, p5

    .line 88
    move-object/from16 v1, p6

    .line 89
    .line 90
    move/from16 v5, p8

    .line 91
    .line 92
    invoke-direct/range {v0 .. v8}, Llz0;-><init>(Lez0;Lj5;Lyt;Lum0;ZLy2;Ldz0;Lzy0;)V

    .line 93
    .line 94
    .line 95
    move-object v3, v0

    .line 96
    move-object v0, v6

    .line 97
    iput-object v3, p0, Ldz0;->Q:Llz0;

    .line 98
    .line 99
    new-instance v8, Lyy0;

    .line 100
    .line 101
    invoke-direct {v8, v3, v9}, Lyy0;-><init>(Llz0;Z)V

    .line 102
    .line 103
    .line 104
    iput-object v8, p0, Ldz0;->R:Lyy0;

    .line 105
    .line 106
    new-instance v1, Ldv;

    .line 107
    .line 108
    const/16 v2, 0xa

    .line 109
    .line 110
    const/4 v4, 0x2

    .line 111
    const/4 v5, 0x0

    .line 112
    invoke-direct {v1, v4, v5, v2}, Ldv;-><init>(ILww;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v1}, Lsm;->w0(Lrm;)Lrm;

    .line 116
    .line 117
    .line 118
    iput-object v1, p0, Ldz0;->S:Ldv;

    .line 119
    .line 120
    new-instance v1, Lck;

    .line 121
    .line 122
    new-instance v6, Lzy0;

    .line 123
    .line 124
    const/4 v2, 0x1

    .line 125
    invoke-direct {v6, p0, v2}, Lzy0;-><init>(Ldz0;I)V

    .line 126
    .line 127
    .line 128
    move-object v5, p2

    .line 129
    move-object v2, p5

    .line 130
    move/from16 v4, p8

    .line 131
    .line 132
    invoke-direct/range {v1 .. v6}, Lck;-><init>(Lum0;Llz0;ZLkb;Lzy0;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, v1}, Lsm;->w0(Lrm;)Lrm;

    .line 136
    .line 137
    .line 138
    iput-object v1, p0, Ldz0;->T:Lck;

    .line 139
    .line 140
    new-instance v2, Lgj0;

    .line 141
    .line 142
    invoke-direct {v2, v8, v0}, Lgj0;-><init>(Laj0;Ly2;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v2}, Lsm;->w0(Lrm;)Lrm;

    .line 146
    .line 147
    .line 148
    new-instance v0, Lhb;

    .line 149
    .line 150
    invoke-direct {v0}, Loe0;-><init>()V

    .line 151
    .line 152
    .line 153
    iput-object v1, v0, Lhb;->r:Lck;

    .line 154
    .line 155
    invoke-virtual {p0, v0}, Lsm;->w0(Lrm;)Lrm;

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public static final A0(Ldz0;Lbq;Ljk;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lhq;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lhq;

    .line 7
    .line 8
    iget v1, v0, Lhq;->k:I

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
    iput v1, v0, Lhq;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lhq;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lhq;-><init>(Ldz0;Ljk;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lhq;->i:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lhq;->k:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lzk;->d:Lzk;

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
    iget-object p1, v0, Lhq;->h:Llq;

    .line 40
    .line 41
    iget-object v0, v0, Lhq;->g:Lbq;

    .line 42
    .line 43
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    iget-object p1, v0, Lhq;->g:Lbq;

    .line 55
    .line 56
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Ldz0;->y:Llq;

    .line 64
    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    iget-object v1, p0, Ldz0;->w:Lxg0;

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    new-instance v5, Lkq;

    .line 72
    .line 73
    invoke-direct {v5, p2}, Lkq;-><init>(Llq;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, v0, Lhq;->g:Lbq;

    .line 77
    .line 78
    iput v3, v0, Lhq;->k:I

    .line 79
    .line 80
    invoke-virtual {v1, v5, v0}, Lxg0;->b(Lf30;Lik;)Ljava/lang/Object;

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
    new-instance p2, Llq;

    .line 88
    .line 89
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Ldz0;->w:Lxg0;

    .line 93
    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    iput-object p1, v0, Lhq;->g:Lbq;

    .line 97
    .line 98
    iput-object p2, v0, Lhq;->h:Llq;

    .line 99
    .line 100
    iput v2, v0, Lhq;->k:I

    .line 101
    .line 102
    invoke-virtual {v1, p2, v0}, Lxg0;->b(Lf30;Lik;)Ljava/lang/Object;

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
    iput-object p2, p0, Ldz0;->y:Llq;

    .line 114
    .line 115
    iget-wide p0, p1, Lbq;->a:J

    .line 116
    .line 117
    sget-object p0, Lna1;->a:Lna1;

    .line 118
    .line 119
    return-object p0
.end method

.method public static final B0(Ldz0;Lcq;Ljk;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Liq;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Liq;

    .line 7
    .line 8
    iget v1, v0, Liq;->j:I

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
    iput v1, v0, Liq;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Liq;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Liq;-><init>(Ldz0;Ljk;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Liq;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Liq;->j:I

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
    iget-object p1, v0, Liq;->g:Lcq;

    .line 36
    .line 37
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_2
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Ldz0;->y:Llq;

    .line 51
    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    iget-object v1, p0, Ldz0;->w:Lxg0;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    new-instance v4, Lmq;

    .line 59
    .line 60
    invoke-direct {v4, p2}, Lmq;-><init>(Llq;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, v0, Liq;->g:Lcq;

    .line 64
    .line 65
    iput v3, v0, Liq;->j:I

    .line 66
    .line 67
    invoke-virtual {v1, v4, v0}, Lxg0;->b(Lf30;Lik;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    sget-object v0, Lzk;->d:Lzk;

    .line 72
    .line 73
    if-ne p2, v0, :cond_3

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_3
    :goto_1
    iput-object v2, p0, Ldz0;->y:Llq;

    .line 77
    .line 78
    :cond_4
    iget-object p2, p0, Ldz0;->N:Ly2;

    .line 79
    .line 80
    iget-object p2, p2, Ly2;->f:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p2, Lhw;

    .line 83
    .line 84
    invoke-interface {p2}, Lhw;->invoke()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    check-cast p2, Lyk;

    .line 89
    .line 90
    if-eqz p2, :cond_5

    .line 91
    .line 92
    new-instance v0, Le;

    .line 93
    .line 94
    const/16 v1, 0xa

    .line 95
    .line 96
    invoke-direct {v0, p1, p0, v2, v1}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x3

    .line 100
    invoke-static {p2, v2, v0, p0}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 101
    .line 102
    .line 103
    sget-object p0, Lna1;->a:Lna1;

    .line 104
    .line 105
    return-object p0

    .line 106
    :cond_5
    const-string p0, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 107
    .line 108
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v2
.end method

.method public static F0(Ldz0;Lnr0;JJI)V
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
    iget-object p6, p0, Ldz0;->D:Lxp;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p6, :cond_1

    .line 11
    .line 12
    new-instance p6, Lxp;

    .line 13
    .line 14
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, p6, Lxp;->v:Lnr0;

    .line 19
    .line 20
    const-wide v1, 0x7fffffffffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide v1, p6, Lxp;->w:J

    .line 26
    .line 27
    iput-boolean v0, p6, Lxp;->x:Z

    .line 28
    .line 29
    iput-object p6, p0, Ldz0;->D:Lxp;

    .line 30
    .line 31
    :cond_1
    iput-object p1, p6, Lxp;->v:Lnr0;

    .line 32
    .line 33
    iput-wide p2, p6, Lxp;->w:J

    .line 34
    .line 35
    iget-object p1, p0, Ldz0;->I:Lq81;

    .line 36
    .line 37
    iget-object p2, p0, Ldz0;->t:Lum0;

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    new-instance p1, Lq81;

    .line 42
    .line 43
    invoke-direct {p1, p2}, Lq81;-><init>(Lum0;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Ldz0;->I:Lq81;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iput-object p2, p1, Lq81;->a:Lum0;

    .line 50
    .line 51
    iput-wide p4, p1, Lq81;->b:J

    .line 52
    .line 53
    :goto_0
    iput-boolean v0, p6, Lxp;->x:Z

    .line 54
    .line 55
    iput-object p6, p0, Ldz0;->F:Li4;

    .line 56
    .line 57
    return-void
.end method

.method public static final z0(Ldz0;Ljk;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lgq;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lgq;

    .line 7
    .line 8
    iget v1, v0, Lgq;->i:I

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
    iput v1, v0, Lgq;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lgq;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lgq;-><init>(Ldz0;Ljk;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lgq;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lgq;->i:I

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
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Ldz0;->y:Llq;

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    iget-object v1, p0, Ldz0;->w:Lxg0;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    new-instance v4, Lkq;

    .line 57
    .line 58
    invoke-direct {v4, p1}, Lkq;-><init>(Llq;)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, Lgq;->i:I

    .line 62
    .line 63
    invoke-virtual {v1, v4, v0}, Lxg0;->b(Lf30;Lik;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget-object v0, Lzk;->d:Lzk;

    .line 68
    .line 69
    if-ne p1, v0, :cond_3

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_3
    :goto_1
    iput-object v2, p0, Ldz0;->y:Llq;

    .line 73
    .line 74
    :cond_4
    new-instance p1, Lcq;

    .line 75
    .line 76
    const-wide/16 v0, 0x0

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-direct {p1, v0, v1, v3}, Lcq;-><init>(JZ)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Ldz0;->N:Ly2;

    .line 83
    .line 84
    iget-object v0, v0, Ly2;->f:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lhw;

    .line 87
    .line 88
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lyk;

    .line 93
    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    new-instance v1, Le;

    .line 97
    .line 98
    const/16 v3, 0xa

    .line 99
    .line 100
    invoke-direct {v1, p1, p0, v2, v3}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 101
    .line 102
    .line 103
    const/4 p0, 0x3

    .line 104
    invoke-static {v0, v2, v1, p0}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 105
    .line 106
    .line 107
    sget-object p0, Lna1;->a:Lna1;

    .line 108
    .line 109
    return-object p0

    .line 110
    :cond_5
    const-string p0, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 111
    .line 112
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-object v2
.end method


# virtual methods
.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldz0;->y:Llq;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Ldz0;->w:Lxg0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Lkq;

    .line 10
    .line 11
    invoke-direct {v2, v0}, Lkq;-><init>(Llq;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lxg0;->c(Lf30;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Ldz0;->y:Llq;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final D0()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldz0;->B:Lvp;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lup;->f:Lup;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lvp;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v0, Lvp;->v:Lup;

    .line 14
    .line 15
    iput-boolean v1, v0, Lvp;->w:Z

    .line 16
    .line 17
    iput-object v0, p0, Ldz0;->B:Lvp;

    .line 18
    .line 19
    :cond_0
    iput-object v2, v0, Lvp;->v:Lup;

    .line 20
    .line 21
    iput-boolean v1, v0, Lvp;->w:Z

    .line 22
    .line 23
    iput-object v0, p0, Ldz0;->F:Li4;

    .line 24
    .line 25
    return-void
.end method

.method public final E0(Lnr0;JLq81;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldz0;->E:Lwp;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lwp;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Lwp;->v:Lnr0;

    .line 12
    .line 13
    const-wide v1, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v1, v0, Lwp;->w:J

    .line 19
    .line 20
    iput-object v0, p0, Ldz0;->E:Lwp;

    .line 21
    .line 22
    :cond_0
    iput-object p1, v0, Lwp;->v:Lnr0;

    .line 23
    .line 24
    iput-wide p2, v0, Lwp;->w:J

    .line 25
    .line 26
    const-wide/16 p1, 0x0

    .line 27
    .line 28
    iput-wide p1, p4, Lq81;->b:J

    .line 29
    .line 30
    iput-object v0, p0, Ldz0;->F:Li4;

    .line 31
    .line 32
    return-void
.end method

.method public final G0(Ldq;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lbq;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Ldz0;->z:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Ldz0;->z:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Ldz0;->M0()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Ldz0;->H0()Lmd;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0, p1}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final H0()Lmd;
    .locals 0

    .line 1
    iget-object p0, p0, Ldz0;->x:Lvb;

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
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final I(Landroid/view/KeyEvent;)Z
    .locals 10

    .line 1
    iget-boolean v0, p0, Ldz0;->v:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    invoke-static {p1}, Lp30;->D(Landroid/view/KeyEvent;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    sget-wide v4, Ly40;->n:J

    .line 11
    .line 12
    invoke-static {v2, v3, v4, v5}, Ly40;->a(JJ)Z

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
    invoke-static {v0}, Lrd0;->c(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    sget-wide v4, Ly40;->m:J

    .line 27
    .line 28
    invoke-static {v2, v3, v4, v5}, Ly40;->a(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_5

    .line 33
    .line 34
    :cond_0
    invoke-static {p1}, Lp30;->G(Landroid/view/KeyEvent;)I

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
    iget-object v0, p0, Ldz0;->Q:Llz0;

    .line 48
    .line 49
    iget-object v0, v0, Llz0;->d:Lum0;

    .line 50
    .line 51
    sget-object v2, Lum0;->d:Lum0;

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
    iget-object v6, p0, Ldz0;->T:Lck;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    iget-wide v6, v6, Lck;->y:J

    .line 70
    .line 71
    and-long/2addr v6, v4

    .line 72
    long-to-int v1, v6

    .line 73
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-static {p1}, Lrd0;->c(I)J

    .line 78
    .line 79
    .line 80
    move-result-wide v6

    .line 81
    sget-wide v8, Ly40;->m:J

    .line 82
    .line 83
    invoke-static {v6, v7, v8, v9}, Ly40;->a(JJ)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    int-to-float p1, v1

    .line 90
    goto :goto_0

    .line 91
    :cond_2
    int-to-float p1, v1

    .line 92
    neg-float p1, p1

    .line 93
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    int-to-long v0, v0

    .line 98
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    int-to-long v6, p1

    .line 103
    shl-long/2addr v0, v2

    .line 104
    and-long/2addr v4, v6

    .line 105
    or-long/2addr v0, v4

    .line 106
    :goto_1
    move-wide v6, v0

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    iget-wide v6, v6, Lck;->y:J

    .line 109
    .line 110
    shr-long/2addr v6, v2

    .line 111
    long-to-int v1, v6

    .line 112
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    invoke-static {p1}, Lrd0;->c(I)J

    .line 117
    .line 118
    .line 119
    move-result-wide v6

    .line 120
    sget-wide v8, Ly40;->m:J

    .line 121
    .line 122
    invoke-static {v6, v7, v8, v9}, Ly40;->a(JJ)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_4

    .line 127
    .line 128
    int-to-float p1, v1

    .line 129
    goto :goto_2

    .line 130
    :cond_4
    int-to-float p1, v1

    .line 131
    neg-float p1, p1

    .line 132
    :goto_2
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    int-to-long v6, p1

    .line 137
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    int-to-long v0, p1

    .line 142
    shl-long/2addr v6, v2

    .line 143
    and-long/2addr v0, v4

    .line 144
    or-long/2addr v0, v6

    .line 145
    goto :goto_1

    .line 146
    :goto_3
    invoke-virtual {p0}, Loe0;->k0()Lyk;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance v4, Lbz0;

    .line 151
    .line 152
    const/4 v9, 0x0

    .line 153
    const/4 v8, 0x0

    .line 154
    move-object v5, p0

    .line 155
    invoke-direct/range {v4 .. v9}, Lbz0;-><init>(Ldz0;JLik;I)V

    .line 156
    .line 157
    .line 158
    const/4 p0, 0x3

    .line 159
    invoke-static {p1, v8, v4, p0}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 160
    .line 161
    .line 162
    return v3

    .line 163
    :cond_5
    return v1
.end method

.method public final I0()Lqb1;
    .locals 0

    .line 1
    iget-object p0, p0, Ldz0;->G:Lqb1;

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
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final J0(Lnr0;J)V
    .locals 6

    .line 1
    iget-object v0, p0, Loe0;->d:Loe0;

    .line 2
    .line 3
    invoke-static {v0}, Lpf1;->P(Lrm;)Lqj0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lqj0;->d(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-wide v2, p0, Ldz0;->H:J

    .line 14
    .line 15
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3, v4, v5}, Lok0;->b(JJ)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    iget-wide v2, p0, Ldz0;->H:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, Lok0;->b(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    iget-wide v2, p0, Ldz0;->H:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, Lok0;->d(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    iget-wide v4, p0, Ldz0;->K:J

    .line 41
    .line 42
    invoke-static {v4, v5, v2, v3}, Lok0;->e(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    iput-wide v2, p0, Ldz0;->K:J

    .line 47
    .line 48
    :cond_0
    iput-wide v0, p0, Ldz0;->H:J

    .line 49
    .line 50
    invoke-virtual {p0}, Ldz0;->I0()Lqb1;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-wide v1, p0, Ldz0;->K:J

    .line 55
    .line 56
    invoke-static {v0, p1, v1, v2}, Lr60;->f(Lqb1;Lnr0;J)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ldz0;->H0()Lmd;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    new-instance p1, Laq;

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    invoke-direct {p1, p2, p3, v0}, Laq;-><init>(JZ)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p0, p1}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final K0(Lnr0;Lnr0;J)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldz0;->G:Lqb1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lqb1;

    .line 6
    .line 7
    invoke-direct {v0}, Lqb1;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ldz0;->G:Lqb1;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Ldz0;->I0()Lqb1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    invoke-static {v0, p1, v1, v2}, Lr60;->f(Lqb1;Lnr0;J)V

    .line 19
    .line 20
    .line 21
    iget-wide v3, p2, Lnr0;->c:J

    .line 22
    .line 23
    invoke-static {v3, v4, p3, p4}, Lok0;->d(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide p2

    .line 27
    iput-wide v1, p0, Ldz0;->K:J

    .line 28
    .line 29
    iget-object p4, p0, Ldz0;->u:Lsx0;

    .line 30
    .line 31
    iget p1, p1, Lnr0;->i:I

    .line 32
    .line 33
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/4 p4, 0x2

    .line 37
    if-ne p1, p4, :cond_1

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    :goto_0
    if-nez p1, :cond_4

    .line 43
    .line 44
    iget-boolean p1, p0, Ldz0;->z:Z

    .line 45
    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    iget-object p1, p0, Ldz0;->x:Lvb;

    .line 49
    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    const p1, 0x7fffffff

    .line 53
    .line 54
    .line 55
    const/4 p4, 0x6

    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-static {p1, p4, v0}, Lo30;->e(IILtb;)Lvb;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, Ldz0;->x:Lvb;

    .line 62
    .line 63
    :cond_2
    invoke-virtual {p0}, Ldz0;->M0()V

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-static {p0}, Lpf1;->P(Lrm;)Lqj0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1, v1, v2}, Lqj0;->d(J)J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    iput-wide v0, p0, Ldz0;->H:J

    .line 75
    .line 76
    invoke-virtual {p0}, Ldz0;->H0()Lmd;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-instance p1, Lbq;

    .line 81
    .line 82
    invoke-direct {p1, p2, p3}, Lbq;-><init>(J)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p0, p1}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_4
    return-void
.end method

.method public final L0()Z
    .locals 4

    .line 1
    iget-object p0, p0, Ldz0;->Q:Llz0;

    .line 2
    .line 3
    iget-object v0, p0, Llz0;->a:Lez0;

    .line 4
    .line 5
    invoke-interface {v0}, Lez0;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_8

    .line 10
    .line 11
    iget-object p0, p0, Llz0;->b:Lj5;

    .line 12
    .line 13
    if-eqz p0, :cond_7

    .line 14
    .line 15
    iget-object p0, p0, Lj5;->c:Ler;

    .line 16
    .line 17
    iget-object v0, p0, Ler;->d:Landroid/widget/EdgeEffect;

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
    invoke-static {v0}, Lm8;->c(Landroid/widget/EdgeEffect;)F

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
    iget-object v0, p0, Ler;->e:Landroid/widget/EdgeEffect;

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
    invoke-static {v0}, Lm8;->c(Landroid/widget/EdgeEffect;)F

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
    iget-object v0, p0, Ler;->f:Landroid/widget/EdgeEffect;

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
    invoke-static {v0}, Lm8;->c(Landroid/widget/EdgeEffect;)F

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
    iget-object p0, p0, Ler;->g:Landroid/widget/EdgeEffect;

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
    invoke-static {p0}, Lm8;->c(Landroid/widget/EdgeEffect;)F

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

.method public final M0()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldz0;->z:Z

    .line 3
    .line 4
    iget-object v0, p0, Ldz0;->x:Lvb;

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
    invoke-static {v0, v2, v1}, Lo30;->e(IILtb;)Lvb;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ldz0;->x:Lvb;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Loe0;->k0()Lyk;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, Ljq;

    .line 24
    .line 25
    invoke-direct {v2, p0, v1}, Ljq;-><init>(Ldz0;Lik;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x3

    .line 29
    invoke-static {v0, v1, v2, p0}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final N0(Lj5;Lkb;Lyt;Lxg0;Lum0;Lez0;ZZ)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Ldz0;->v:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eq v0, p7, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ldz0;->R:Lyy0;

    .line 8
    .line 9
    iput-boolean p7, v0, Lyy0;->e:Z

    .line 10
    .line 11
    iget-object v0, p0, Ldz0;->O:Lsy0;

    .line 12
    .line 13
    iput-boolean p7, v0, Lsy0;->r:Z

    .line 14
    .line 15
    move v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    if-nez p3, :cond_1

    .line 19
    .line 20
    iget-object v3, p0, Ldz0;->P:Lvl;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object v3, p3

    .line 24
    :goto_1
    iget-object v4, p0, Ldz0;->Q:Llz0;

    .line 25
    .line 26
    iget-object v5, v4, Llz0;->a:Lez0;

    .line 27
    .line 28
    invoke-static {v5, p6}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    iput-object p6, v4, Llz0;->a:Lez0;

    .line 35
    .line 36
    move p6, v1

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move p6, v2

    .line 39
    :goto_2
    iput-object p1, v4, Llz0;->b:Lj5;

    .line 40
    .line 41
    iget-object v5, v4, Llz0;->d:Lum0;

    .line 42
    .line 43
    if-eq v5, p5, :cond_3

    .line 44
    .line 45
    iput-object p5, v4, Llz0;->d:Lum0;

    .line 46
    .line 47
    move p6, v1

    .line 48
    :cond_3
    iget-boolean v5, v4, Llz0;->e:Z

    .line 49
    .line 50
    if-eq v5, p8, :cond_4

    .line 51
    .line 52
    iput-boolean p8, v4, Llz0;->e:Z

    .line 53
    .line 54
    move p6, v1

    .line 55
    :cond_4
    iput-object v3, v4, Llz0;->c:Lyt;

    .line 56
    .line 57
    iget-object v3, p0, Ldz0;->N:Ly2;

    .line 58
    .line 59
    iput-object v3, v4, Llz0;->f:Ly2;

    .line 60
    .line 61
    iget-object v3, p0, Ldz0;->T:Lck;

    .line 62
    .line 63
    iput-object p5, v3, Lck;->r:Lum0;

    .line 64
    .line 65
    iput-boolean p8, v3, Lck;->t:Z

    .line 66
    .line 67
    iput-object p2, v3, Lck;->u:Lkb;

    .line 68
    .line 69
    iput-object p1, p0, Ldz0;->L:Lj5;

    .line 70
    .line 71
    iput-object p3, p0, Ldz0;->M:Lyt;

    .line 72
    .line 73
    sget-object p1, Lwy0;->a:Lsx0;

    .line 74
    .line 75
    iget-object p2, v4, Llz0;->d:Lum0;

    .line 76
    .line 77
    sget-object p3, Lum0;->d:Lum0;

    .line 78
    .line 79
    if-ne p2, p3, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    sget-object p3, Lum0;->e:Lum0;

    .line 83
    .line 84
    :goto_3
    iput-object p1, p0, Ldz0;->u:Lsx0;

    .line 85
    .line 86
    iget-boolean p1, p0, Ldz0;->v:Z

    .line 87
    .line 88
    const/4 p2, 0x0

    .line 89
    if-eq p1, p7, :cond_7

    .line 90
    .line 91
    iput-boolean p7, p0, Ldz0;->v:Z

    .line 92
    .line 93
    if-nez p7, :cond_6

    .line 94
    .line 95
    invoke-virtual {p0}, Ldz0;->C0()V

    .line 96
    .line 97
    .line 98
    iput-object p2, p0, Ldz0;->J:Lo10;

    .line 99
    .line 100
    :cond_6
    move p6, v1

    .line 101
    :cond_7
    iget-object p1, p0, Ldz0;->w:Lxg0;

    .line 102
    .line 103
    invoke-static {p1, p4}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_8

    .line 108
    .line 109
    invoke-virtual {p0}, Ldz0;->C0()V

    .line 110
    .line 111
    .line 112
    iput-object p4, p0, Ldz0;->w:Lxg0;

    .line 113
    .line 114
    :cond_8
    iget-object p1, p0, Ldz0;->t:Lum0;

    .line 115
    .line 116
    if-eq p1, p3, :cond_9

    .line 117
    .line 118
    iput-object p3, p0, Ldz0;->t:Lum0;

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_9
    move v1, p6

    .line 122
    :goto_4
    if-eqz v1, :cond_d

    .line 123
    .line 124
    iget-boolean p1, p0, Ldz0;->A:Z

    .line 125
    .line 126
    sget-object p3, Lzp;->a:Lzp;

    .line 127
    .line 128
    if-eqz p1, :cond_b

    .line 129
    .line 130
    invoke-virtual {p0}, Ldz0;->D0()V

    .line 131
    .line 132
    .line 133
    iget-boolean p1, p0, Ldz0;->z:Z

    .line 134
    .line 135
    if-eqz p1, :cond_a

    .line 136
    .line 137
    invoke-virtual {p0}, Ldz0;->H0()Lmd;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-interface {p1, p3}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_a
    iput-object p2, p0, Ldz0;->G:Lqb1;

    .line 145
    .line 146
    :cond_b
    iget-object p1, p0, Ldz0;->J:Lo10;

    .line 147
    .line 148
    if-eqz p1, :cond_d

    .line 149
    .line 150
    invoke-virtual {p1}, Lo10;->a()V

    .line 151
    .line 152
    .line 153
    iget-object p4, p1, Lo10;->a:Ldz0;

    .line 154
    .line 155
    iget-boolean p5, p4, Ldz0;->z:Z

    .line 156
    .line 157
    if-eqz p5, :cond_c

    .line 158
    .line 159
    invoke-virtual {p4, p3}, Ldz0;->G0(Ldq;)V

    .line 160
    .line 161
    .line 162
    :cond_c
    iput-object p2, p1, Lo10;->g:Lqb1;

    .line 163
    .line 164
    iget-object p1, p1, Lo10;->k:Lp10;

    .line 165
    .line 166
    iput v2, p1, Lp10;->a:I

    .line 167
    .line 168
    iget-object p1, p1, Lp10;->b:Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 171
    .line 172
    .line 173
    :cond_d
    if-eqz v0, :cond_e

    .line 174
    .line 175
    iput-object p2, p0, Ldz0;->U:Lya;

    .line 176
    .line 177
    iput-object p2, p0, Ldz0;->V:Lbz0;

    .line 178
    .line 179
    invoke-static {p0}, Lz60;->D(Lvz0;)V

    .line 180
    .line 181
    .line 182
    :cond_e
    return-void
.end method

.method public final S(Lf01;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ldz0;->v:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Ldz0;->U:Lya;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ldz0;->V:Lbz0;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    new-instance v0, Lya;

    .line 15
    .line 16
    const/4 v2, 0x7

    .line 17
    invoke-direct {v0, v2, p0}, Lya;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Ldz0;->U:Lya;

    .line 21
    .line 22
    new-instance v0, Lbz0;

    .line 23
    .line 24
    invoke-direct {v0, p0, v1}, Lbz0;-><init>(Ldz0;Lik;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Ldz0;->V:Lbz0;

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Ldz0;->U:Lya;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    sget-object v2, Ld01;->a:[Lu40;

    .line 34
    .line 35
    sget-object v2, Lrz0;->d:Le01;

    .line 36
    .line 37
    new-instance v3, Lo0;

    .line 38
    .line 39
    invoke-direct {v3, v1, v0}, Lo0;-><init>(Ljava/lang/String;Lex;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v2, v3}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object p0, p0, Ldz0;->V:Lbz0;

    .line 46
    .line 47
    if-eqz p0, :cond_3

    .line 48
    .line 49
    sget-object v0, Ld01;->a:[Lu40;

    .line 50
    .line 51
    sget-object v0, Lrz0;->e:Le01;

    .line 52
    .line 53
    invoke-interface {p1, v0, p0}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    return-void
.end method

.method public final U()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldz0;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Ldz0;->D0()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Ldz0;->z:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ldz0;->H0()Lmd;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lzp;->a:Lzp;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Ldz0;->G:Lqb1;

    .line 23
    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Ldz0;->A:Z

    .line 26
    .line 27
    return-void
.end method

.method public final a()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldz0;->U()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Loe0;->q:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, Lb60;->B:Lym;

    .line 14
    .line 15
    iget-object v1, p0, Ldz0;->P:Lvl;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v2, Lx1;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Lx1;-><init>(Lym;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lml;

    .line 26
    .line 27
    invoke-direct {v0, v2}, Lml;-><init>(Lx1;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, v1, Lvl;->a:Lml;

    .line 31
    .line 32
    :goto_0
    iget-object v0, p0, Ldz0;->W:Lfn;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p0, p0, Lb60;->B:Lym;

    .line 41
    .line 42
    iput-object p0, v0, Lfn;->e:Ljava/lang/Object;

    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public final l0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final o0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Loe0;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lb60;->B:Lym;

    .line 11
    .line 12
    iget-object v1, p0, Ldz0;->P:Lvl;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v2, Lx1;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Lx1;-><init>(Lym;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lml;

    .line 23
    .line 24
    invoke-direct {v0, v2}, Lml;-><init>(Lx1;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, v1, Lvl;->a:Lml;

    .line 28
    .line 29
    :goto_0
    iget-object v0, p0, Ldz0;->W:Lfn;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object p0, p0, Lb60;->B:Lym;

    .line 38
    .line 39
    iput-object p0, v0, Lfn;->e:Ljava/lang/Object;

    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final p0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ldz0;->z:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Ldz0;->C0()V

    .line 5
    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Ldz0;->K:J

    .line 10
    .line 11
    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    iget-object p0, p0, Ldz0;->J:Lo10;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lo10;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lo10;->a:Ldz0;

    .line 9
    .line 10
    iget-boolean v1, v0, Ldz0;->z:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object v1, Lzp;->a:Lzp;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ldz0;->G0(Ldq;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lo10;->g:Lqb1;

    .line 21
    .line 22
    iget-object p0, p0, Lo10;->k:Lp10;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput v0, p0, Lp10;->a:I

    .line 26
    .line 27
    iget-object p0, p0, Lp10;->b:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final u(Lu5;Ljr0;)V
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
    iget v3, v1, Lu5;->a:I

    .line 8
    .line 9
    iget-object v1, v1, Lu5;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-boolean v4, v0, Ldz0;->v:Z

    .line 14
    .line 15
    if-eqz v4, :cond_3c

    .line 16
    .line 17
    iget-object v4, v0, Ldz0;->J:Lo10;

    .line 18
    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    new-instance v4, Lo10;

    .line 22
    .line 23
    invoke-direct {v4, v0}, Lo10;-><init>(Ldz0;)V

    .line 24
    .line 25
    .line 26
    iput-object v4, v0, Ldz0;->J:Lo10;

    .line 27
    .line 28
    :cond_0
    iget-object v5, v0, Ldz0;->J:Lo10;

    .line 29
    .line 30
    if-eqz v5, :cond_3c

    .line 31
    .line 32
    iget-object v0, v5, Lo10;->a:Ldz0;

    .line 33
    .line 34
    iget-object v4, v5, Lo10;->f:Lrd0;

    .line 35
    .line 36
    const/4 v11, 0x0

    .line 37
    if-nez v4, :cond_2

    .line 38
    .line 39
    iget-object v4, v5, Lo10;->b:Lj10;

    .line 40
    .line 41
    if-nez v4, :cond_1

    .line 42
    .line 43
    new-instance v4, Lj10;

    .line 44
    .line 45
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    sget-object v6, Li10;->f:Li10;

    .line 49
    .line 50
    iput-object v6, v4, Lj10;->t:Li10;

    .line 51
    .line 52
    iput-boolean v11, v4, Lj10;->u:Z

    .line 53
    .line 54
    iput-object v4, v5, Lo10;->b:Lj10;

    .line 55
    .line 56
    :cond_1
    iput-object v4, v5, Lo10;->f:Lrd0;

    .line 57
    .line 58
    :cond_2
    iget-object v4, v5, Lo10;->f:Lrd0;

    .line 59
    .line 60
    if-eqz v4, :cond_3b

    .line 61
    .line 62
    instance-of v6, v4, Lj10;

    .line 63
    .line 64
    sget-object v7, Ljr0;->d:Ljr0;

    .line 65
    .line 66
    const/4 v8, 0x1

    .line 67
    const-wide/16 v14, 0x0

    .line 68
    .line 69
    sget-object v9, Ljr0;->e:Ljr0;

    .line 70
    .line 71
    if-eqz v6, :cond_b

    .line 72
    .line 73
    check-cast v4, Lj10;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_3

    .line 80
    .line 81
    goto/16 :goto_16

    .line 82
    .line 83
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    :goto_0
    if-ge v11, v6, :cond_5

    .line 88
    .line 89
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    check-cast v10, Lh10;

    .line 94
    .line 95
    iget-boolean v12, v10, Lh10;->h:Z

    .line 96
    .line 97
    if-nez v12, :cond_4

    .line 98
    .line 99
    iget-boolean v10, v10, Lh10;->d:Z

    .line 100
    .line 101
    if-eqz v10, :cond_4

    .line 102
    .line 103
    add-int/lit8 v11, v11, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    return-void

    .line 107
    :cond_5
    invoke-static {v1}, Lye;->J(Ljava/util/List;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    move-object v6, v1

    .line 112
    check-cast v6, Lh10;

    .line 113
    .line 114
    iget-object v1, v4, Lj10;->t:Li10;

    .line 115
    .line 116
    sget-object v10, Ln10;->a:[I

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    aget v1, v10, v1

    .line 123
    .line 124
    sget-object v10, Li10;->e:Li10;

    .line 125
    .line 126
    sget-object v11, Li10;->d:Li10;

    .line 127
    .line 128
    if-ne v1, v8, :cond_7

    .line 129
    .line 130
    invoke-virtual {v0}, Ldz0;->L0()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_6

    .line 135
    .line 136
    move-object v0, v11

    .line 137
    goto :goto_1

    .line 138
    :cond_6
    move-object v0, v10

    .line 139
    goto :goto_1

    .line 140
    :cond_7
    iget-object v0, v4, Lj10;->t:Li10;

    .line 141
    .line 142
    :goto_1
    iput-object v0, v4, Lj10;->t:Li10;

    .line 143
    .line 144
    if-ne v2, v7, :cond_8

    .line 145
    .line 146
    if-ne v0, v10, :cond_8

    .line 147
    .line 148
    iput-boolean v8, v6, Lh10;->i:Z

    .line 149
    .line 150
    iput-boolean v8, v4, Lj10;->u:Z

    .line 151
    .line 152
    :cond_8
    if-ne v2, v9, :cond_3c

    .line 153
    .line 154
    if-ne v0, v11, :cond_9

    .line 155
    .line 156
    iget-wide v7, v6, Lh10;->a:J

    .line 157
    .line 158
    const-wide/16 v9, 0x0

    .line 159
    .line 160
    const/16 v11, 0xc

    .line 161
    .line 162
    invoke-static/range {v5 .. v11}, Lo10;->c(Lo10;Lh10;JJI)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_9
    iget-boolean v0, v4, Lj10;->u:Z

    .line 167
    .line 168
    if-eqz v0, :cond_3c

    .line 169
    .line 170
    new-instance v8, Lg10;

    .line 171
    .line 172
    invoke-direct {v8, v3}, Lg10;-><init>(I)V

    .line 173
    .line 174
    .line 175
    const-wide/16 v9, 0x0

    .line 176
    .line 177
    move-object v7, v6

    .line 178
    invoke-virtual/range {v5 .. v10}, Lo10;->f(Lh10;Lh10;Lg10;J)V

    .line 179
    .line 180
    .line 181
    new-instance v0, Lg10;

    .line 182
    .line 183
    invoke-direct {v0, v3}, Lg10;-><init>(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5, v6, v0, v14, v15}, Lo10;->e(Lh10;Lg10;J)V

    .line 187
    .line 188
    .line 189
    iget-wide v0, v6, Lh10;->a:J

    .line 190
    .line 191
    iget-object v2, v5, Lo10;->c:Lm10;

    .line 192
    .line 193
    if-nez v2, :cond_a

    .line 194
    .line 195
    new-instance v2, Lm10;

    .line 196
    .line 197
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 198
    .line 199
    .line 200
    const-wide v3, 0x7fffffffffffffffL

    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    iput-wide v3, v2, Lm10;->t:J

    .line 206
    .line 207
    iput-object v2, v5, Lo10;->c:Lm10;

    .line 208
    .line 209
    :cond_a
    iput-wide v0, v2, Lm10;->t:J

    .line 210
    .line 211
    iput-object v2, v5, Lo10;->f:Lrd0;

    .line 212
    .line 213
    return-void

    .line 214
    :cond_b
    instance-of v6, v4, Ll10;

    .line 215
    .line 216
    sget-object v12, Ljr0;->f:Ljr0;

    .line 217
    .line 218
    if-eqz v6, :cond_25

    .line 219
    .line 220
    check-cast v4, Ll10;

    .line 221
    .line 222
    if-ne v2, v7, :cond_c

    .line 223
    .line 224
    goto/16 :goto_16

    .line 225
    .line 226
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    move v7, v11

    .line 231
    :goto_2
    if-ge v7, v6, :cond_e

    .line 232
    .line 233
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    move-object v15, v14

    .line 238
    check-cast v15, Lh10;

    .line 239
    .line 240
    move-object/from16 v17, v14

    .line 241
    .line 242
    iget-wide v13, v15, Lh10;->a:J

    .line 243
    .line 244
    const/16 v18, 0x0

    .line 245
    .line 246
    iget-wide v10, v4, Ll10;->u:J

    .line 247
    .line 248
    invoke-static {v13, v14, v10, v11}, Lz60;->s(JJ)Z

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    if-eqz v10, :cond_d

    .line 253
    .line 254
    move-object/from16 v14, v17

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_d
    add-int/lit8 v7, v7, 0x1

    .line 258
    .line 259
    const/4 v11, 0x0

    .line 260
    goto :goto_2

    .line 261
    :cond_e
    const/16 v18, 0x0

    .line 262
    .line 263
    const/4 v14, 0x0

    .line 264
    :goto_3
    check-cast v14, Lh10;

    .line 265
    .line 266
    if-nez v14, :cond_12

    .line 267
    .line 268
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    const/4 v7, 0x0

    .line 273
    :goto_4
    if-ge v7, v6, :cond_10

    .line 274
    .line 275
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v10

    .line 279
    move-object v11, v10

    .line 280
    check-cast v11, Lh10;

    .line 281
    .line 282
    iget-boolean v11, v11, Lh10;->d:Z

    .line 283
    .line 284
    if-eqz v11, :cond_f

    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_f
    add-int/lit8 v7, v7, 0x1

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_10
    const/4 v10, 0x0

    .line 291
    :goto_5
    move-object v14, v10

    .line 292
    check-cast v14, Lh10;

    .line 293
    .line 294
    if-nez v14, :cond_11

    .line 295
    .line 296
    invoke-virtual {v5}, Lo10;->a()V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :cond_11
    iget-wide v6, v14, Lh10;->a:J

    .line 301
    .line 302
    iput-wide v6, v4, Ll10;->u:J

    .line 303
    .line 304
    :cond_12
    move-object v7, v14

    .line 305
    const-string v11, "AwaitTouchSlop.touchSlopDetector was not initialized"

    .line 306
    .line 307
    const-string v13, "AwaitTouchSlop.initialDown was not initialized"

    .line 308
    .line 309
    if-ne v2, v9, :cond_21

    .line 310
    .line 311
    iget-boolean v6, v7, Lh10;->i:Z

    .line 312
    .line 313
    if-nez v6, :cond_1e

    .line 314
    .line 315
    invoke-static {v7}, Ls91;->g(Lh10;)Z

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    if-eqz v6, :cond_16

    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    const/4 v3, 0x0

    .line 326
    :goto_6
    if-ge v3, v0, :cond_14

    .line 327
    .line 328
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    move-object v8, v6

    .line 333
    check-cast v8, Lh10;

    .line 334
    .line 335
    iget-boolean v8, v8, Lh10;->d:Z

    .line 336
    .line 337
    if-eqz v8, :cond_13

    .line 338
    .line 339
    move-object/from16 v16, v6

    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_13
    add-int/lit8 v3, v3, 0x1

    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_14
    const/16 v16, 0x0

    .line 346
    .line 347
    :goto_7
    move-object/from16 v0, v16

    .line 348
    .line 349
    check-cast v0, Lh10;

    .line 350
    .line 351
    if-nez v0, :cond_15

    .line 352
    .line 353
    invoke-virtual {v5}, Lo10;->a()V

    .line 354
    .line 355
    .line 356
    goto/16 :goto_b

    .line 357
    .line 358
    :cond_15
    iget-wide v0, v0, Lh10;->a:J

    .line 359
    .line 360
    iput-wide v0, v4, Ll10;->u:J

    .line 361
    .line 362
    goto/16 :goto_b

    .line 363
    .line 364
    :cond_16
    sget-object v1, Ldj;->s:Lg41;

    .line 365
    .line 366
    invoke-static {v0, v1}, Lpf1;->r(Lzi;Lat0;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    check-cast v1, Lnc1;

    .line 371
    .line 372
    sget v6, Leq;->a:F

    .line 373
    .line 374
    invoke-interface {v1}, Lnc1;->d()F

    .line 375
    .line 376
    .line 377
    move-result v24

    .line 378
    iget-object v1, v5, Lo10;->i:Lq81;

    .line 379
    .line 380
    if-eqz v1, :cond_1d

    .line 381
    .line 382
    iget-object v6, v0, Ldz0;->t:Lum0;

    .line 383
    .line 384
    new-instance v9, Lg10;

    .line 385
    .line 386
    invoke-direct {v9, v3}, Lg10;-><init>(I)V

    .line 387
    .line 388
    .line 389
    invoke-static {v7, v6, v9}, Ls91;->K(Lh10;Lum0;Lg10;)J

    .line 390
    .line 391
    .line 392
    move-result-wide v20

    .line 393
    iget-object v0, v0, Ldz0;->t:Lum0;

    .line 394
    .line 395
    iget-wide v9, v7, Lh10;->g:J

    .line 396
    .line 397
    if-nez v0, :cond_18

    .line 398
    .line 399
    :cond_17
    :goto_8
    move-object/from16 v19, v1

    .line 400
    .line 401
    move-wide/from16 v22, v9

    .line 402
    .line 403
    goto :goto_a

    .line 404
    :cond_18
    const-wide v14, 0xffffffffL

    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    const/16 v6, 0x20

    .line 410
    .line 411
    if-ne v3, v8, :cond_19

    .line 412
    .line 413
    shr-long/2addr v9, v6

    .line 414
    long-to-int v9, v9

    .line 415
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 416
    .line 417
    .line 418
    move-result v9

    .line 419
    move/from16 v16, v6

    .line 420
    .line 421
    goto :goto_9

    .line 422
    :cond_19
    move/from16 v16, v6

    .line 423
    .line 424
    const/4 v6, 0x2

    .line 425
    if-ne v3, v6, :cond_17

    .line 426
    .line 427
    and-long/2addr v9, v14

    .line 428
    long-to-int v6, v9

    .line 429
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 430
    .line 431
    .line 432
    move-result v9

    .line 433
    :goto_9
    sget-object v6, Lum0;->e:Lum0;

    .line 434
    .line 435
    if-ne v0, v6, :cond_1a

    .line 436
    .line 437
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    int-to-long v9, v0

    .line 442
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    move-wide/from16 v22, v14

    .line 447
    .line 448
    int-to-long v14, v0

    .line 449
    shl-long v9, v9, v16

    .line 450
    .line 451
    and-long v14, v14, v22

    .line 452
    .line 453
    or-long/2addr v9, v14

    .line 454
    goto :goto_8

    .line 455
    :cond_1a
    move-wide/from16 v22, v14

    .line 456
    .line 457
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    int-to-long v14, v0

    .line 462
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    int-to-long v9, v0

    .line 467
    shl-long v14, v14, v16

    .line 468
    .line 469
    and-long v9, v9, v22

    .line 470
    .line 471
    or-long/2addr v9, v14

    .line 472
    goto :goto_8

    .line 473
    :goto_a
    invoke-virtual/range {v19 .. v24}, Lq81;->a(JJF)J

    .line 474
    .line 475
    .line 476
    move-result-wide v9

    .line 477
    const-wide v0, 0x7fffffff7fffffffL

    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    and-long/2addr v0, v9

    .line 483
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    cmp-long v0, v0, v14

    .line 489
    .line 490
    if-eqz v0, :cond_1c

    .line 491
    .line 492
    iput-boolean v8, v7, Lh10;->i:Z

    .line 493
    .line 494
    iget-object v6, v4, Ll10;->t:Lh10;

    .line 495
    .line 496
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    new-instance v8, Lg10;

    .line 500
    .line 501
    invoke-direct {v8, v3}, Lg10;-><init>(I)V

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v5 .. v10}, Lo10;->f(Lh10;Lh10;Lg10;J)V

    .line 505
    .line 506
    .line 507
    new-instance v0, Lg10;

    .line 508
    .line 509
    invoke-direct {v0, v3}, Lg10;-><init>(I)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v5, v7, v0, v9, v10}, Lo10;->e(Lh10;Lg10;J)V

    .line 513
    .line 514
    .line 515
    iget-wide v0, v7, Lh10;->a:J

    .line 516
    .line 517
    iget-object v3, v5, Lo10;->c:Lm10;

    .line 518
    .line 519
    if-nez v3, :cond_1b

    .line 520
    .line 521
    new-instance v3, Lm10;

    .line 522
    .line 523
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 524
    .line 525
    .line 526
    const-wide v8, 0x7fffffffffffffffL

    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    iput-wide v8, v3, Lm10;->t:J

    .line 532
    .line 533
    iput-object v3, v5, Lo10;->c:Lm10;

    .line 534
    .line 535
    :cond_1b
    iput-wide v0, v3, Lm10;->t:J

    .line 536
    .line 537
    iput-object v3, v5, Lo10;->f:Lrd0;

    .line 538
    .line 539
    goto :goto_b

    .line 540
    :cond_1c
    iput-boolean v8, v4, Ll10;->v:Z

    .line 541
    .line 542
    goto :goto_b

    .line 543
    :cond_1d
    const-string v0, "Touch slop detector not initialized."

    .line 544
    .line 545
    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    return-void

    .line 549
    :cond_1e
    iget-object v0, v4, Ll10;->t:Lh10;

    .line 550
    .line 551
    if-eqz v0, :cond_20

    .line 552
    .line 553
    iget-wide v8, v4, Ll10;->u:J

    .line 554
    .line 555
    iget-object v1, v5, Lo10;->i:Lq81;

    .line 556
    .line 557
    if-eqz v1, :cond_1f

    .line 558
    .line 559
    invoke-virtual {v5, v0, v8, v9, v1}, Lo10;->b(Lh10;JLq81;)V

    .line 560
    .line 561
    .line 562
    goto :goto_b

    .line 563
    :cond_1f
    invoke-static {v11}, Lxc;->l(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    return-void

    .line 567
    :cond_20
    invoke-static {v13}, Lxc;->l(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    return-void

    .line 571
    :cond_21
    :goto_b
    if-ne v2, v12, :cond_3c

    .line 572
    .line 573
    iget-boolean v0, v4, Ll10;->v:Z

    .line 574
    .line 575
    if-eqz v0, :cond_3c

    .line 576
    .line 577
    iget-boolean v0, v7, Lh10;->i:Z

    .line 578
    .line 579
    if-eqz v0, :cond_24

    .line 580
    .line 581
    iget-object v0, v4, Ll10;->t:Lh10;

    .line 582
    .line 583
    if-eqz v0, :cond_23

    .line 584
    .line 585
    iget-wide v1, v4, Ll10;->u:J

    .line 586
    .line 587
    iget-object v3, v5, Lo10;->i:Lq81;

    .line 588
    .line 589
    if-eqz v3, :cond_22

    .line 590
    .line 591
    invoke-virtual {v5, v0, v1, v2, v3}, Lo10;->b(Lh10;JLq81;)V

    .line 592
    .line 593
    .line 594
    return-void

    .line 595
    :cond_22
    invoke-static {v11}, Lxc;->l(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    return-void

    .line 599
    :cond_23
    invoke-static {v13}, Lxc;->l(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    return-void

    .line 603
    :cond_24
    const/4 v0, 0x0

    .line 604
    iput-boolean v0, v4, Ll10;->v:Z

    .line 605
    .line 606
    return-void

    .line 607
    :cond_25
    const/16 v18, 0x0

    .line 608
    .line 609
    instance-of v6, v4, Lk10;

    .line 610
    .line 611
    if-eqz v6, :cond_2d

    .line 612
    .line 613
    check-cast v4, Lk10;

    .line 614
    .line 615
    if-eq v2, v12, :cond_26

    .line 616
    .line 617
    goto/16 :goto_16

    .line 618
    .line 619
    :cond_26
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    const/4 v6, 0x0

    .line 624
    :goto_c
    if-ge v6, v2, :cond_28

    .line 625
    .line 626
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v7

    .line 630
    check-cast v7, Lh10;

    .line 631
    .line 632
    iget-boolean v7, v7, Lh10;->i:Z

    .line 633
    .line 634
    if-eqz v7, :cond_27

    .line 635
    .line 636
    const/4 v8, 0x0

    .line 637
    goto :goto_d

    .line 638
    :cond_27
    add-int/lit8 v6, v6, 0x1

    .line 639
    .line 640
    goto :goto_c

    .line 641
    :cond_28
    :goto_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    const/4 v11, 0x0

    .line 646
    :goto_e
    if-ge v11, v2, :cond_2c

    .line 647
    .line 648
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v6

    .line 652
    check-cast v6, Lh10;

    .line 653
    .line 654
    iget-boolean v6, v6, Lh10;->d:Z

    .line 655
    .line 656
    if-eqz v6, :cond_2b

    .line 657
    .line 658
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 659
    .line 660
    .line 661
    move-result v2

    .line 662
    if-eqz v2, :cond_29

    .line 663
    .line 664
    goto :goto_f

    .line 665
    :cond_29
    if-eqz v8, :cond_3c

    .line 666
    .line 667
    invoke-static {v1}, Lye;->J(Ljava/util/List;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    check-cast v1, Lh10;

    .line 672
    .line 673
    iget-object v2, v0, Ldz0;->t:Lum0;

    .line 674
    .line 675
    new-instance v6, Lg10;

    .line 676
    .line 677
    invoke-direct {v6, v3}, Lg10;-><init>(I)V

    .line 678
    .line 679
    .line 680
    invoke-static {v1, v2, v6}, Ls91;->K(Lh10;Lum0;Lg10;)J

    .line 681
    .line 682
    .line 683
    move-result-wide v1

    .line 684
    iget-object v6, v4, Lk10;->t:Lh10;

    .line 685
    .line 686
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    iget-object v0, v0, Ldz0;->t:Lum0;

    .line 690
    .line 691
    new-instance v7, Lg10;

    .line 692
    .line 693
    invoke-direct {v7, v3}, Lg10;-><init>(I)V

    .line 694
    .line 695
    .line 696
    invoke-static {v6, v0, v7}, Ls91;->K(Lh10;Lum0;Lg10;)J

    .line 697
    .line 698
    .line 699
    move-result-wide v6

    .line 700
    invoke-static {v1, v2, v6, v7}, Lok0;->d(JJ)J

    .line 701
    .line 702
    .line 703
    move-result-wide v9

    .line 704
    iget-object v6, v4, Lk10;->t:Lh10;

    .line 705
    .line 706
    if-eqz v6, :cond_2a

    .line 707
    .line 708
    iget-wide v7, v4, Lk10;->u:J

    .line 709
    .line 710
    const/16 v11, 0x8

    .line 711
    .line 712
    invoke-static/range {v5 .. v11}, Lo10;->c(Lo10;Lh10;JJI)V

    .line 713
    .line 714
    .line 715
    return-void

    .line 716
    :cond_2a
    const-string v0, "AwaitGesturePickup.initialDown was not initialized."

    .line 717
    .line 718
    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    return-void

    .line 722
    :cond_2b
    add-int/lit8 v11, v11, 0x1

    .line 723
    .line 724
    goto :goto_e

    .line 725
    :cond_2c
    :goto_f
    invoke-virtual {v5}, Lo10;->a()V

    .line 726
    .line 727
    .line 728
    return-void

    .line 729
    :cond_2d
    instance-of v6, v4, Lm10;

    .line 730
    .line 731
    if-eqz v6, :cond_3a

    .line 732
    .line 733
    check-cast v4, Lm10;

    .line 734
    .line 735
    if-eq v2, v9, :cond_2e

    .line 736
    .line 737
    goto/16 :goto_16

    .line 738
    .line 739
    :cond_2e
    iget-wide v6, v4, Lm10;->t:J

    .line 740
    .line 741
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 742
    .line 743
    .line 744
    move-result v2

    .line 745
    const/4 v9, 0x0

    .line 746
    :goto_10
    if-ge v9, v2, :cond_30

    .line 747
    .line 748
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v10

    .line 752
    move-object v11, v10

    .line 753
    check-cast v11, Lh10;

    .line 754
    .line 755
    iget-wide v11, v11, Lh10;->a:J

    .line 756
    .line 757
    invoke-static {v11, v12, v6, v7}, Lz60;->s(JJ)Z

    .line 758
    .line 759
    .line 760
    move-result v11

    .line 761
    if-eqz v11, :cond_2f

    .line 762
    .line 763
    goto :goto_11

    .line 764
    :cond_2f
    add-int/lit8 v9, v9, 0x1

    .line 765
    .line 766
    goto :goto_10

    .line 767
    :cond_30
    const/4 v10, 0x0

    .line 768
    :goto_11
    check-cast v10, Lh10;

    .line 769
    .line 770
    if-nez v10, :cond_31

    .line 771
    .line 772
    goto/16 :goto_16

    .line 773
    .line 774
    :cond_31
    invoke-static {v10}, Ls91;->g(Lh10;)Z

    .line 775
    .line 776
    .line 777
    move-result v2

    .line 778
    sget-object v6, Lzp;->a:Lzp;

    .line 779
    .line 780
    if-eqz v2, :cond_36

    .line 781
    .line 782
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 783
    .line 784
    .line 785
    move-result v2

    .line 786
    const/4 v7, 0x0

    .line 787
    :goto_12
    if-ge v7, v2, :cond_33

    .line 788
    .line 789
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v9

    .line 793
    move-object v11, v9

    .line 794
    check-cast v11, Lh10;

    .line 795
    .line 796
    iget-boolean v11, v11, Lh10;->d:Z

    .line 797
    .line 798
    if-eqz v11, :cond_32

    .line 799
    .line 800
    goto :goto_13

    .line 801
    :cond_32
    add-int/lit8 v7, v7, 0x1

    .line 802
    .line 803
    goto :goto_12

    .line 804
    :cond_33
    const/4 v9, 0x0

    .line 805
    :goto_13
    check-cast v9, Lh10;

    .line 806
    .line 807
    if-nez v9, :cond_35

    .line 808
    .line 809
    iget-boolean v1, v10, Lh10;->i:Z

    .line 810
    .line 811
    if-nez v1, :cond_34

    .line 812
    .line 813
    invoke-static {v10}, Ls91;->g(Lh10;)Z

    .line 814
    .line 815
    .line 816
    move-result v1

    .line 817
    if-eqz v1, :cond_34

    .line 818
    .line 819
    new-instance v1, Lg10;

    .line 820
    .line 821
    invoke-direct {v1, v3}, Lg10;-><init>(I)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v5}, Lo10;->d()Lqb1;

    .line 825
    .line 826
    .line 827
    move-result-object v19

    .line 828
    iget-object v2, v0, Ldz0;->t:Lum0;

    .line 829
    .line 830
    iget-object v3, v5, Lo10;->j:Lp10;

    .line 831
    .line 832
    iget-wide v6, v5, Lo10;->l:J

    .line 833
    .line 834
    move-object/from16 v22, v1

    .line 835
    .line 836
    move-object/from16 v21, v2

    .line 837
    .line 838
    move-object/from16 v23, v3

    .line 839
    .line 840
    move-wide/from16 v24, v6

    .line 841
    .line 842
    move-object/from16 v20, v10

    .line 843
    .line 844
    invoke-static/range {v19 .. v25}, Ls91;->f(Lqb1;Lh10;Lum0;Lg10;Lp10;J)V

    .line 845
    .line 846
    .line 847
    sget-object v1, Ldj;->s:Lg41;

    .line 848
    .line 849
    invoke-static {v0, v1}, Lpf1;->r(Lzi;Lat0;)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    check-cast v1, Lnc1;

    .line 854
    .line 855
    invoke-interface {v1}, Lnc1;->a()F

    .line 856
    .line 857
    .line 858
    move-result v1

    .line 859
    invoke-virtual {v5}, Lo10;->d()Lqb1;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    invoke-static {v1, v1}, Lg60;->b(FF)J

    .line 864
    .line 865
    .line 866
    move-result-wide v3

    .line 867
    invoke-virtual {v2, v3, v4}, Lqb1;->d(J)J

    .line 868
    .line 869
    .line 870
    move-result-wide v1

    .line 871
    invoke-virtual {v5}, Lo10;->d()Lqb1;

    .line 872
    .line 873
    .line 874
    move-result-object v3

    .line 875
    iget-object v3, v3, Lqb1;->d:Ljava/lang/Object;

    .line 876
    .line 877
    check-cast v3, Lpm;

    .line 878
    .line 879
    iget-object v4, v3, Lpm;->a:Ltb1;

    .line 880
    .line 881
    iget-object v6, v4, Ltb1;->d:[Lil;

    .line 882
    .line 883
    array-length v7, v6

    .line 884
    const/4 v9, 0x0

    .line 885
    const/4 v10, 0x0

    .line 886
    invoke-static {v6, v10, v7, v9}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 887
    .line 888
    .line 889
    iput v10, v4, Ltb1;->e:I

    .line 890
    .line 891
    iget-object v4, v3, Lpm;->b:Ltb1;

    .line 892
    .line 893
    iget-object v6, v4, Ltb1;->d:[Lil;

    .line 894
    .line 895
    array-length v7, v6

    .line 896
    invoke-static {v6, v10, v7, v9}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    iput v10, v4, Ltb1;->e:I

    .line 900
    .line 901
    iput-wide v14, v3, Lpm;->c:J

    .line 902
    .line 903
    new-instance v3, Lcq;

    .line 904
    .line 905
    invoke-static {v1, v2}, Loq;->a(J)J

    .line 906
    .line 907
    .line 908
    move-result-wide v1

    .line 909
    invoke-direct {v3, v1, v2, v8}, Lcq;-><init>(JZ)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v0, v3}, Ldz0;->G0(Ldq;)V

    .line 913
    .line 914
    .line 915
    goto :goto_14

    .line 916
    :cond_34
    invoke-virtual {v0, v6}, Ldz0;->G0(Ldq;)V

    .line 917
    .line 918
    .line 919
    :goto_14
    invoke-virtual {v5}, Lo10;->a()V

    .line 920
    .line 921
    .line 922
    return-void

    .line 923
    :cond_35
    iget-wide v0, v9, Lh10;->a:J

    .line 924
    .line 925
    iput-wide v0, v4, Lm10;->t:J

    .line 926
    .line 927
    return-void

    .line 928
    :cond_36
    iget-boolean v1, v10, Lh10;->i:Z

    .line 929
    .line 930
    if-eqz v1, :cond_37

    .line 931
    .line 932
    invoke-virtual {v0, v6}, Ldz0;->G0(Ldq;)V

    .line 933
    .line 934
    .line 935
    return-void

    .line 936
    :cond_37
    iget-object v1, v0, Ldz0;->t:Lum0;

    .line 937
    .line 938
    new-instance v2, Lg10;

    .line 939
    .line 940
    invoke-direct {v2, v3}, Lg10;-><init>(I)V

    .line 941
    .line 942
    .line 943
    invoke-static {v10, v1, v2}, Ls91;->L(Lh10;Lum0;Lg10;)J

    .line 944
    .line 945
    .line 946
    move-result-wide v6

    .line 947
    invoke-static {v10, v1, v2}, Ls91;->K(Lh10;Lum0;Lg10;)J

    .line 948
    .line 949
    .line 950
    move-result-wide v1

    .line 951
    invoke-static {v1, v2, v6, v7}, Lok0;->d(JJ)J

    .line 952
    .line 953
    .line 954
    move-result-wide v1

    .line 955
    invoke-static {v1, v2}, Lok0;->c(J)F

    .line 956
    .line 957
    .line 958
    move-result v1

    .line 959
    cmpg-float v1, v1, v18

    .line 960
    .line 961
    if-nez v1, :cond_38

    .line 962
    .line 963
    goto :goto_16

    .line 964
    :cond_38
    iget-object v0, v0, Ldz0;->t:Lum0;

    .line 965
    .line 966
    new-instance v1, Lg10;

    .line 967
    .line 968
    invoke-direct {v1, v3}, Lg10;-><init>(I)V

    .line 969
    .line 970
    .line 971
    invoke-static {v10, v0, v1}, Ls91;->L(Lh10;Lum0;Lg10;)J

    .line 972
    .line 973
    .line 974
    move-result-wide v6

    .line 975
    invoke-static {v10, v0, v1}, Ls91;->K(Lh10;Lum0;Lg10;)J

    .line 976
    .line 977
    .line 978
    move-result-wide v0

    .line 979
    invoke-static {v0, v1, v6, v7}, Lok0;->d(JJ)J

    .line 980
    .line 981
    .line 982
    move-result-wide v0

    .line 983
    iget-boolean v2, v10, Lh10;->i:Z

    .line 984
    .line 985
    if-eqz v2, :cond_39

    .line 986
    .line 987
    goto :goto_15

    .line 988
    :cond_39
    move-wide v14, v0

    .line 989
    :goto_15
    new-instance v0, Lg10;

    .line 990
    .line 991
    invoke-direct {v0, v3}, Lg10;-><init>(I)V

    .line 992
    .line 993
    .line 994
    invoke-virtual {v5, v10, v0, v14, v15}, Lo10;->e(Lh10;Lg10;J)V

    .line 995
    .line 996
    .line 997
    iput-boolean v8, v10, Lh10;->i:Z

    .line 998
    .line 999
    return-void

    .line 1000
    :cond_3a
    invoke-static {}, Lxc;->j()V

    .line 1001
    .line 1002
    .line 1003
    return-void

    .line 1004
    :cond_3b
    const-string v0, "currentDragState should not be null"

    .line 1005
    .line 1006
    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    .line 1007
    .line 1008
    .line 1009
    :cond_3c
    :goto_16
    return-void
.end method

.method public final x(Lir0;Ljr0;J)V
    .locals 24

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
    iget-object v10, v8, Lir0;->a:Ljava/util/List;

    .line 8
    .line 9
    iget-object v11, v8, Lir0;->a:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v12, 0x0

    .line 16
    move v2, v12

    .line 17
    :goto_0
    sget-object v13, Ljr0;->e:Ljr0;

    .line 18
    .line 19
    sget-object v14, Ljr0;->d:Ljr0;

    .line 20
    .line 21
    const/4 v7, 0x1

    .line 22
    if-ge v2, v1, :cond_39

    .line 23
    .line 24
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lnr0;

    .line 29
    .line 30
    iget-object v4, v0, Ldz0;->u:Lsx0;

    .line 31
    .line 32
    iget v3, v3, Lnr0;->i:I

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    if-ne v3, v4, :cond_0

    .line 39
    .line 40
    move v3, v7

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    move v3, v12

    .line 43
    :goto_1
    if-nez v3, :cond_38

    .line 44
    .line 45
    iput-boolean v7, v0, Ldz0;->A:Z

    .line 46
    .line 47
    iget-boolean v1, v0, Ldz0;->v:Z

    .line 48
    .line 49
    if-eqz v1, :cond_39

    .line 50
    .line 51
    iget-object v1, v0, Ldz0;->F:Li4;

    .line 52
    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    iget-object v1, v0, Ldz0;->B:Lvp;

    .line 56
    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    new-instance v1, Lvp;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    sget-object v2, Lup;->f:Lup;

    .line 65
    .line 66
    iput-object v2, v1, Lvp;->v:Lup;

    .line 67
    .line 68
    iput-boolean v12, v1, Lvp;->w:Z

    .line 69
    .line 70
    iput-object v1, v0, Ldz0;->B:Lvp;

    .line 71
    .line 72
    :cond_1
    iput-object v1, v0, Ldz0;->F:Li4;

    .line 73
    .line 74
    :cond_2
    iget-object v1, v0, Ldz0;->F:Li4;

    .line 75
    .line 76
    if-eqz v1, :cond_37

    .line 77
    .line 78
    instance-of v2, v1, Lvp;

    .line 79
    .line 80
    const-wide/16 v5, 0x0

    .line 81
    .line 82
    if-eqz v2, :cond_c

    .line 83
    .line 84
    check-cast v1, Lvp;

    .line 85
    .line 86
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_3

    .line 91
    .line 92
    goto/16 :goto_16

    .line 93
    .line 94
    :cond_3
    invoke-static {v8, v12}, Lm61;->d(Lir0;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_4

    .line 99
    .line 100
    goto/16 :goto_16

    .line 101
    .line 102
    :cond_4
    invoke-static {v10}, Lye;->J(Ljava/util/List;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Lnr0;

    .line 107
    .line 108
    iget-object v15, v1, Lvp;->v:Lup;

    .line 109
    .line 110
    sget-object v16, Lfq;->a:[I

    .line 111
    .line 112
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 113
    .line 114
    .line 115
    move-result v15

    .line 116
    aget v15, v16, v15

    .line 117
    .line 118
    sget-object v12, Lup;->e:Lup;

    .line 119
    .line 120
    sget-object v3, Lup;->d:Lup;

    .line 121
    .line 122
    if-ne v15, v7, :cond_6

    .line 123
    .line 124
    invoke-virtual {v0}, Ldz0;->L0()Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-nez v4, :cond_5

    .line 129
    .line 130
    move-object v4, v3

    .line 131
    goto :goto_2

    .line 132
    :cond_5
    move-object v4, v12

    .line 133
    goto :goto_2

    .line 134
    :cond_6
    iget-object v4, v1, Lvp;->v:Lup;

    .line 135
    .line 136
    :goto_2
    iput-object v4, v1, Lvp;->v:Lup;

    .line 137
    .line 138
    if-ne v9, v14, :cond_7

    .line 139
    .line 140
    if-ne v4, v12, :cond_7

    .line 141
    .line 142
    invoke-virtual {v2}, Lnr0;->a()V

    .line 143
    .line 144
    .line 145
    iput-boolean v7, v1, Lvp;->w:Z

    .line 146
    .line 147
    :cond_7
    if-ne v9, v13, :cond_a

    .line 148
    .line 149
    if-ne v4, v3, :cond_8

    .line 150
    .line 151
    move-object v1, v2

    .line 152
    iget-wide v2, v1, Lnr0;->a:J

    .line 153
    .line 154
    const-wide/16 v4, 0x0

    .line 155
    .line 156
    const/16 v6, 0xc

    .line 157
    .line 158
    invoke-static/range {v0 .. v6}, Ldz0;->F0(Ldz0;Lnr0;JJI)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_8
    move-object/from16 v23, v2

    .line 163
    .line 164
    move-object v2, v1

    .line 165
    move-object/from16 v1, v23

    .line 166
    .line 167
    iget-boolean v2, v2, Lvp;->w:Z

    .line 168
    .line 169
    if-eqz v2, :cond_a

    .line 170
    .line 171
    invoke-virtual {v0, v1, v1, v5, v6}, Ldz0;->K0(Lnr0;Lnr0;J)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v1, v5, v6}, Ldz0;->J0(Lnr0;J)V

    .line 175
    .line 176
    .line 177
    iget-wide v1, v1, Lnr0;->a:J

    .line 178
    .line 179
    iget-object v3, v0, Ldz0;->C:Lyp;

    .line 180
    .line 181
    if-nez v3, :cond_9

    .line 182
    .line 183
    new-instance v3, Lyp;

    .line 184
    .line 185
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 186
    .line 187
    .line 188
    const-wide v4, 0x7fffffffffffffffL

    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    iput-wide v4, v3, Lyp;->v:J

    .line 194
    .line 195
    iput-object v3, v0, Ldz0;->C:Lyp;

    .line 196
    .line 197
    :cond_9
    iput-wide v1, v3, Lyp;->v:J

    .line 198
    .line 199
    iput-object v3, v0, Ldz0;->F:Li4;

    .line 200
    .line 201
    :cond_a
    :goto_3
    move-object v15, v13

    .line 202
    :cond_b
    :goto_4
    const/4 v13, 0x0

    .line 203
    goto/16 :goto_17

    .line 204
    .line 205
    :cond_c
    instance-of v2, v1, Lxp;

    .line 206
    .line 207
    sget-object v3, Ljr0;->f:Ljr0;

    .line 208
    .line 209
    if-eqz v2, :cond_22

    .line 210
    .line 211
    check-cast v1, Lxp;

    .line 212
    .line 213
    if-ne v9, v14, :cond_d

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_d
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    const/4 v4, 0x0

    .line 221
    :goto_5
    if-ge v4, v2, :cond_f

    .line 222
    .line 223
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    move-object v6, v5

    .line 228
    check-cast v6, Lnr0;

    .line 229
    .line 230
    iget-wide v7, v6, Lnr0;->a:J

    .line 231
    .line 232
    move-object v15, v13

    .line 233
    iget-wide v12, v1, Lxp;->w:J

    .line 234
    .line 235
    invoke-static {v7, v8, v12, v13}, Lz60;->s(JJ)Z

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    if-eqz v7, :cond_e

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_e
    add-int/lit8 v4, v4, 0x1

    .line 243
    .line 244
    move-object/from16 v8, p1

    .line 245
    .line 246
    move-object v13, v15

    .line 247
    const/4 v7, 0x1

    .line 248
    goto :goto_5

    .line 249
    :cond_f
    move-object v15, v13

    .line 250
    const/4 v5, 0x0

    .line 251
    :goto_6
    check-cast v5, Lnr0;

    .line 252
    .line 253
    if-nez v5, :cond_13

    .line 254
    .line 255
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    const/4 v4, 0x0

    .line 260
    :goto_7
    if-ge v4, v2, :cond_11

    .line 261
    .line 262
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    move-object v7, v5

    .line 267
    check-cast v7, Lnr0;

    .line 268
    .line 269
    iget-boolean v7, v7, Lnr0;->d:Z

    .line 270
    .line 271
    if-eqz v7, :cond_10

    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_10
    add-int/lit8 v4, v4, 0x1

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_11
    const/4 v5, 0x0

    .line 278
    :goto_8
    check-cast v5, Lnr0;

    .line 279
    .line 280
    if-nez v5, :cond_12

    .line 281
    .line 282
    invoke-virtual {v0}, Ldz0;->D0()V

    .line 283
    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_12
    iget-wide v7, v5, Lnr0;->a:J

    .line 287
    .line 288
    iput-wide v7, v1, Lxp;->w:J

    .line 289
    .line 290
    :cond_13
    const-string v2, "AwaitTouchSlop.touchSlopDetector was not initialized"

    .line 291
    .line 292
    const-string v4, "AwaitTouchSlop.initialDown was not initialized"

    .line 293
    .line 294
    if-ne v9, v15, :cond_19

    .line 295
    .line 296
    invoke-virtual {v5}, Lnr0;->b()Z

    .line 297
    .line 298
    .line 299
    move-result v7

    .line 300
    if-nez v7, :cond_1c

    .line 301
    .line 302
    invoke-static {v5}, Lw60;->k(Lnr0;)Z

    .line 303
    .line 304
    .line 305
    move-result v7

    .line 306
    if-eqz v7, :cond_17

    .line 307
    .line 308
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 309
    .line 310
    .line 311
    move-result v7

    .line 312
    const/4 v8, 0x0

    .line 313
    :goto_9
    if-ge v8, v7, :cond_15

    .line 314
    .line 315
    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    move-object v13, v12

    .line 320
    check-cast v13, Lnr0;

    .line 321
    .line 322
    iget-boolean v13, v13, Lnr0;->d:Z

    .line 323
    .line 324
    if-eqz v13, :cond_14

    .line 325
    .line 326
    goto :goto_a

    .line 327
    :cond_14
    add-int/lit8 v8, v8, 0x1

    .line 328
    .line 329
    goto :goto_9

    .line 330
    :cond_15
    const/4 v12, 0x0

    .line 331
    :goto_a
    check-cast v12, Lnr0;

    .line 332
    .line 333
    if-nez v12, :cond_16

    .line 334
    .line 335
    invoke-virtual {v0}, Ldz0;->D0()V

    .line 336
    .line 337
    .line 338
    goto/16 :goto_c

    .line 339
    .line 340
    :cond_16
    iget-wide v7, v12, Lnr0;->a:J

    .line 341
    .line 342
    iput-wide v7, v1, Lxp;->w:J

    .line 343
    .line 344
    goto/16 :goto_c

    .line 345
    .line 346
    :cond_17
    sget-object v7, Ldj;->s:Lg41;

    .line 347
    .line 348
    invoke-static {v0, v7}, Lpf1;->r(Lzi;Lat0;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    check-cast v7, Lnc1;

    .line 353
    .line 354
    iget v8, v5, Lnr0;->i:I

    .line 355
    .line 356
    invoke-static {v7, v8}, Leq;->a(Lnc1;I)F

    .line 357
    .line 358
    .line 359
    move-result v22

    .line 360
    iget-object v7, v0, Ldz0;->I:Lq81;

    .line 361
    .line 362
    if-eqz v7, :cond_1b

    .line 363
    .line 364
    iget-wide v12, v5, Lnr0;->c:J

    .line 365
    .line 366
    move-object/from16 v17, v7

    .line 367
    .line 368
    iget-wide v6, v5, Lnr0;->g:J

    .line 369
    .line 370
    move-wide/from16 v20, v6

    .line 371
    .line 372
    move-wide/from16 v18, v12

    .line 373
    .line 374
    invoke-virtual/range {v17 .. v22}, Lq81;->a(JJF)J

    .line 375
    .line 376
    .line 377
    move-result-wide v6

    .line 378
    const-wide v12, 0x7fffffff7fffffffL

    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    and-long/2addr v12, v6

    .line 384
    const-wide v17, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    cmp-long v12, v12, v17

    .line 390
    .line 391
    if-eqz v12, :cond_1a

    .line 392
    .line 393
    invoke-virtual {v5}, Lnr0;->a()V

    .line 394
    .line 395
    .line 396
    iget-object v12, v1, Lxp;->v:Lnr0;

    .line 397
    .line 398
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v12, v5, v6, v7}, Ldz0;->K0(Lnr0;Lnr0;J)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0, v5, v6, v7}, Ldz0;->J0(Lnr0;J)V

    .line 405
    .line 406
    .line 407
    iget-wide v6, v5, Lnr0;->a:J

    .line 408
    .line 409
    iget-object v12, v0, Ldz0;->C:Lyp;

    .line 410
    .line 411
    if-nez v12, :cond_18

    .line 412
    .line 413
    new-instance v12, Lyp;

    .line 414
    .line 415
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 416
    .line 417
    .line 418
    const-wide v8, 0x7fffffffffffffffL

    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    iput-wide v8, v12, Lyp;->v:J

    .line 424
    .line 425
    iput-object v12, v0, Ldz0;->C:Lyp;

    .line 426
    .line 427
    :cond_18
    iput-wide v6, v12, Lyp;->v:J

    .line 428
    .line 429
    iput-object v12, v0, Ldz0;->F:Li4;

    .line 430
    .line 431
    :cond_19
    :goto_b
    move-object/from16 v9, p2

    .line 432
    .line 433
    goto :goto_c

    .line 434
    :cond_1a
    const/4 v12, 0x1

    .line 435
    iput-boolean v12, v1, Lxp;->x:Z

    .line 436
    .line 437
    goto :goto_b

    .line 438
    :cond_1b
    const-string v0, "Touch slop detector not initialized."

    .line 439
    .line 440
    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    return-void

    .line 444
    :cond_1c
    iget-object v6, v1, Lxp;->v:Lnr0;

    .line 445
    .line 446
    if-eqz v6, :cond_1e

    .line 447
    .line 448
    iget-wide v7, v1, Lxp;->w:J

    .line 449
    .line 450
    iget-object v9, v0, Ldz0;->I:Lq81;

    .line 451
    .line 452
    if-eqz v9, :cond_1d

    .line 453
    .line 454
    invoke-virtual {v0, v6, v7, v8, v9}, Ldz0;->E0(Lnr0;JLq81;)V

    .line 455
    .line 456
    .line 457
    goto :goto_b

    .line 458
    :cond_1d
    invoke-static {v2}, Lxc;->l(Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    return-void

    .line 462
    :cond_1e
    invoke-static {v4}, Lxc;->l(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :goto_c
    if-ne v9, v3, :cond_b

    .line 467
    .line 468
    iget-boolean v3, v1, Lxp;->x:Z

    .line 469
    .line 470
    if-eqz v3, :cond_b

    .line 471
    .line 472
    invoke-virtual {v5}, Lnr0;->b()Z

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    if-eqz v3, :cond_21

    .line 477
    .line 478
    iget-object v3, v1, Lxp;->v:Lnr0;

    .line 479
    .line 480
    if-eqz v3, :cond_20

    .line 481
    .line 482
    iget-wide v4, v1, Lxp;->w:J

    .line 483
    .line 484
    iget-object v1, v0, Ldz0;->I:Lq81;

    .line 485
    .line 486
    if-eqz v1, :cond_1f

    .line 487
    .line 488
    invoke-virtual {v0, v3, v4, v5, v1}, Ldz0;->E0(Lnr0;JLq81;)V

    .line 489
    .line 490
    .line 491
    goto/16 :goto_4

    .line 492
    .line 493
    :cond_1f
    invoke-static {v2}, Lxc;->l(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :cond_20
    invoke-static {v4}, Lxc;->l(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    return-void

    .line 501
    :cond_21
    const/4 v2, 0x0

    .line 502
    iput-boolean v2, v1, Lxp;->x:Z

    .line 503
    .line 504
    move v13, v2

    .line 505
    goto/16 :goto_17

    .line 506
    .line 507
    :cond_22
    move-object v15, v13

    .line 508
    instance-of v2, v1, Lwp;

    .line 509
    .line 510
    if-eqz v2, :cond_2a

    .line 511
    .line 512
    check-cast v1, Lwp;

    .line 513
    .line 514
    if-eq v9, v3, :cond_23

    .line 515
    .line 516
    goto/16 :goto_4

    .line 517
    .line 518
    :cond_23
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    const/4 v3, 0x0

    .line 523
    :goto_d
    if-ge v3, v2, :cond_25

    .line 524
    .line 525
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    check-cast v4, Lnr0;

    .line 530
    .line 531
    invoke-virtual {v4}, Lnr0;->b()Z

    .line 532
    .line 533
    .line 534
    move-result v4

    .line 535
    if-eqz v4, :cond_24

    .line 536
    .line 537
    const/4 v2, 0x0

    .line 538
    goto :goto_e

    .line 539
    :cond_24
    add-int/lit8 v3, v3, 0x1

    .line 540
    .line 541
    goto :goto_d

    .line 542
    :cond_25
    const/4 v2, 0x1

    .line 543
    :goto_e
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    const/4 v4, 0x0

    .line 548
    :goto_f
    if-ge v4, v3, :cond_29

    .line 549
    .line 550
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    check-cast v5, Lnr0;

    .line 555
    .line 556
    iget-boolean v5, v5, Lnr0;->d:Z

    .line 557
    .line 558
    if-eqz v5, :cond_28

    .line 559
    .line 560
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    if-eqz v3, :cond_26

    .line 565
    .line 566
    goto :goto_10

    .line 567
    :cond_26
    if-eqz v2, :cond_b

    .line 568
    .line 569
    invoke-static {v10}, Lye;->J(Ljava/util/List;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    check-cast v2, Lnr0;

    .line 574
    .line 575
    iget-wide v2, v2, Lnr0;->c:J

    .line 576
    .line 577
    iget-object v4, v1, Lwp;->v:Lnr0;

    .line 578
    .line 579
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    iget-wide v4, v4, Lnr0;->c:J

    .line 583
    .line 584
    invoke-static {v2, v3, v4, v5}, Lok0;->d(JJ)J

    .line 585
    .line 586
    .line 587
    move-result-wide v4

    .line 588
    iget-object v2, v1, Lwp;->v:Lnr0;

    .line 589
    .line 590
    if-eqz v2, :cond_27

    .line 591
    .line 592
    move-object v6, v2

    .line 593
    iget-wide v2, v1, Lwp;->w:J

    .line 594
    .line 595
    move-object v1, v6

    .line 596
    const/16 v6, 0x8

    .line 597
    .line 598
    invoke-static/range {v0 .. v6}, Ldz0;->F0(Ldz0;Lnr0;JJI)V

    .line 599
    .line 600
    .line 601
    goto/16 :goto_4

    .line 602
    .line 603
    :cond_27
    const-string v0, "AwaitGesturePickup.initialDown was not initialized."

    .line 604
    .line 605
    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    return-void

    .line 609
    :cond_28
    add-int/lit8 v4, v4, 0x1

    .line 610
    .line 611
    goto :goto_f

    .line 612
    :cond_29
    :goto_10
    invoke-virtual {v0}, Ldz0;->D0()V

    .line 613
    .line 614
    .line 615
    goto/16 :goto_4

    .line 616
    .line 617
    :cond_2a
    instance-of v2, v1, Lyp;

    .line 618
    .line 619
    if-eqz v2, :cond_36

    .line 620
    .line 621
    check-cast v1, Lyp;

    .line 622
    .line 623
    if-eq v9, v15, :cond_2b

    .line 624
    .line 625
    goto/16 :goto_4

    .line 626
    .line 627
    :cond_2b
    iget-wide v2, v1, Lyp;->v:J

    .line 628
    .line 629
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 630
    .line 631
    .line 632
    move-result v4

    .line 633
    const/4 v7, 0x0

    .line 634
    :goto_11
    if-ge v7, v4, :cond_2d

    .line 635
    .line 636
    invoke-interface {v10, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v8

    .line 640
    move-object v13, v8

    .line 641
    check-cast v13, Lnr0;

    .line 642
    .line 643
    iget-wide v12, v13, Lnr0;->a:J

    .line 644
    .line 645
    invoke-static {v12, v13, v2, v3}, Lz60;->s(JJ)Z

    .line 646
    .line 647
    .line 648
    move-result v12

    .line 649
    if-eqz v12, :cond_2c

    .line 650
    .line 651
    goto :goto_12

    .line 652
    :cond_2c
    add-int/lit8 v7, v7, 0x1

    .line 653
    .line 654
    goto :goto_11

    .line 655
    :cond_2d
    const/4 v8, 0x0

    .line 656
    :goto_12
    check-cast v8, Lnr0;

    .line 657
    .line 658
    if-nez v8, :cond_2e

    .line 659
    .line 660
    goto/16 :goto_4

    .line 661
    .line 662
    :cond_2e
    invoke-static {v8}, Lw60;->k(Lnr0;)Z

    .line 663
    .line 664
    .line 665
    move-result v2

    .line 666
    sget-object v3, Lzp;->a:Lzp;

    .line 667
    .line 668
    if-eqz v2, :cond_33

    .line 669
    .line 670
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 671
    .line 672
    .line 673
    move-result v2

    .line 674
    const/4 v4, 0x0

    .line 675
    :goto_13
    if-ge v4, v2, :cond_30

    .line 676
    .line 677
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v7

    .line 681
    move-object v12, v7

    .line 682
    check-cast v12, Lnr0;

    .line 683
    .line 684
    iget-boolean v12, v12, Lnr0;->d:Z

    .line 685
    .line 686
    if-eqz v12, :cond_2f

    .line 687
    .line 688
    goto :goto_14

    .line 689
    :cond_2f
    add-int/lit8 v4, v4, 0x1

    .line 690
    .line 691
    goto :goto_13

    .line 692
    :cond_30
    const/4 v7, 0x0

    .line 693
    :goto_14
    check-cast v7, Lnr0;

    .line 694
    .line 695
    if-nez v7, :cond_32

    .line 696
    .line 697
    invoke-virtual {v8}, Lnr0;->b()Z

    .line 698
    .line 699
    .line 700
    move-result v1

    .line 701
    if-nez v1, :cond_31

    .line 702
    .line 703
    invoke-static {v8}, Lw60;->k(Lnr0;)Z

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    if-eqz v1, :cond_31

    .line 708
    .line 709
    invoke-virtual {v0}, Ldz0;->I0()Lqb1;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    invoke-static {v1, v8, v5, v6}, Lr60;->f(Lqb1;Lnr0;J)V

    .line 714
    .line 715
    .line 716
    sget-object v1, Ldj;->s:Lg41;

    .line 717
    .line 718
    invoke-static {v0, v1}, Lpf1;->r(Lzi;Lat0;)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    check-cast v1, Lnc1;

    .line 723
    .line 724
    invoke-interface {v1}, Lnc1;->a()F

    .line 725
    .line 726
    .line 727
    move-result v1

    .line 728
    invoke-virtual {v0}, Ldz0;->I0()Lqb1;

    .line 729
    .line 730
    .line 731
    move-result-object v2

    .line 732
    invoke-static {v1, v1}, Lg60;->b(FF)J

    .line 733
    .line 734
    .line 735
    move-result-wide v3

    .line 736
    invoke-virtual {v2, v3, v4}, Lqb1;->d(J)J

    .line 737
    .line 738
    .line 739
    move-result-wide v1

    .line 740
    invoke-virtual {v0}, Ldz0;->I0()Lqb1;

    .line 741
    .line 742
    .line 743
    move-result-object v3

    .line 744
    iget-object v3, v3, Lqb1;->d:Ljava/lang/Object;

    .line 745
    .line 746
    check-cast v3, Lpm;

    .line 747
    .line 748
    iget-object v4, v3, Lpm;->a:Ltb1;

    .line 749
    .line 750
    iget-object v7, v4, Ltb1;->d:[Lil;

    .line 751
    .line 752
    array-length v8, v7

    .line 753
    const/4 v12, 0x0

    .line 754
    const/4 v13, 0x0

    .line 755
    invoke-static {v7, v13, v8, v12}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 756
    .line 757
    .line 758
    iput v13, v4, Ltb1;->e:I

    .line 759
    .line 760
    iget-object v4, v3, Lpm;->b:Ltb1;

    .line 761
    .line 762
    iget-object v7, v4, Ltb1;->d:[Lil;

    .line 763
    .line 764
    array-length v8, v7

    .line 765
    invoke-static {v7, v13, v8, v12}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    iput v13, v4, Ltb1;->e:I

    .line 769
    .line 770
    iput-wide v5, v3, Lpm;->c:J

    .line 771
    .line 772
    invoke-virtual {v0}, Ldz0;->H0()Lmd;

    .line 773
    .line 774
    .line 775
    move-result-object v3

    .line 776
    new-instance v4, Lcq;

    .line 777
    .line 778
    invoke-static {v1, v2}, Loq;->a(J)J

    .line 779
    .line 780
    .line 781
    move-result-wide v1

    .line 782
    invoke-direct {v4, v1, v2, v13}, Lcq;-><init>(JZ)V

    .line 783
    .line 784
    .line 785
    invoke-interface {v3, v4}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    iput-boolean v13, v0, Ldz0;->A:Z

    .line 789
    .line 790
    goto :goto_15

    .line 791
    :cond_31
    invoke-virtual {v0}, Ldz0;->H0()Lmd;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    invoke-interface {v1, v3}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    :goto_15
    invoke-virtual {v0}, Ldz0;->D0()V

    .line 799
    .line 800
    .line 801
    goto/16 :goto_4

    .line 802
    .line 803
    :cond_32
    iget-wide v2, v7, Lnr0;->a:J

    .line 804
    .line 805
    iput-wide v2, v1, Lyp;->v:J

    .line 806
    .line 807
    goto/16 :goto_4

    .line 808
    .line 809
    :cond_33
    invoke-virtual {v8}, Lnr0;->b()Z

    .line 810
    .line 811
    .line 812
    move-result v1

    .line 813
    if-eqz v1, :cond_34

    .line 814
    .line 815
    invoke-virtual {v0}, Ldz0;->H0()Lmd;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    invoke-interface {v1, v3}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    goto/16 :goto_4

    .line 823
    .line 824
    :cond_34
    const/4 v12, 0x1

    .line 825
    invoke-static {v8, v12}, Lw60;->E(Lnr0;Z)J

    .line 826
    .line 827
    .line 828
    move-result-wide v1

    .line 829
    invoke-static {v1, v2}, Lok0;->c(J)F

    .line 830
    .line 831
    .line 832
    move-result v1

    .line 833
    const/4 v2, 0x0

    .line 834
    cmpg-float v1, v1, v2

    .line 835
    .line 836
    if-nez v1, :cond_35

    .line 837
    .line 838
    goto/16 :goto_4

    .line 839
    .line 840
    :cond_35
    const/4 v13, 0x0

    .line 841
    invoke-static {v8, v13}, Lw60;->E(Lnr0;Z)J

    .line 842
    .line 843
    .line 844
    move-result-wide v1

    .line 845
    invoke-virtual {v0, v8, v1, v2}, Ldz0;->J0(Lnr0;J)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v8}, Lnr0;->a()V

    .line 849
    .line 850
    .line 851
    goto :goto_17

    .line 852
    :cond_36
    invoke-static {}, Lxc;->j()V

    .line 853
    .line 854
    .line 855
    return-void

    .line 856
    :cond_37
    const-string v0, "currentDragState should not be null"

    .line 857
    .line 858
    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    .line 859
    .line 860
    .line 861
    return-void

    .line 862
    :cond_38
    move v13, v12

    .line 863
    add-int/lit8 v2, v2, 0x1

    .line 864
    .line 865
    move-object/from16 v8, p1

    .line 866
    .line 867
    goto/16 :goto_0

    .line 868
    .line 869
    :cond_39
    :goto_16
    move-object v15, v13

    .line 870
    move v13, v12

    .line 871
    :goto_17
    iget-boolean v1, v0, Ldz0;->v:Z

    .line 872
    .line 873
    if-eqz v1, :cond_42

    .line 874
    .line 875
    const/4 v8, 0x6

    .line 876
    if-ne v9, v14, :cond_3d

    .line 877
    .line 878
    move-object/from16 v1, p1

    .line 879
    .line 880
    iget v2, v1, Lir0;->d:I

    .line 881
    .line 882
    if-ne v2, v8, :cond_3c

    .line 883
    .line 884
    iget-object v2, v0, Ldz0;->W:Lfn;

    .line 885
    .line 886
    if-nez v2, :cond_3b

    .line 887
    .line 888
    new-instance v2, Lfn;

    .line 889
    .line 890
    new-instance v3, Lx1;

    .line 891
    .line 892
    iget-object v4, v0, Loe0;->d:Loe0;

    .line 893
    .line 894
    iget-boolean v4, v4, Loe0;->q:Z

    .line 895
    .line 896
    if-nez v4, :cond_3a

    .line 897
    .line 898
    const-string v4, "Cannot get View because the Modifier node is not currently attached."

    .line 899
    .line 900
    invoke-static {v4}, Lw10;->b(Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    :cond_3a
    invoke-static {v0}, Lpf1;->Q(Lrm;)Lb60;

    .line 904
    .line 905
    .line 906
    move-result-object v4

    .line 907
    invoke-static {v4}, Le60;->a(Lb60;)Ldn0;

    .line 908
    .line 909
    .line 910
    move-result-object v4

    .line 911
    check-cast v4, Landroid/view/View;

    .line 912
    .line 913
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 914
    .line 915
    .line 916
    move-result-object v4

    .line 917
    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 918
    .line 919
    .line 920
    move-result-object v4

    .line 921
    const/4 v12, 0x1

    .line 922
    invoke-direct {v3, v12, v4}, Lx1;-><init>(ILjava/lang/Object;)V

    .line 923
    .line 924
    .line 925
    new-instance v0, Llh;

    .line 926
    .line 927
    const/4 v6, 0x4

    .line 928
    const/4 v7, 0x1

    .line 929
    const/4 v1, 0x2

    .line 930
    move-object v4, v3

    .line 931
    const-class v3, Ldz0;

    .line 932
    .line 933
    move-object v5, v4

    .line 934
    const-string v4, "onWheelScrollStopped"

    .line 935
    .line 936
    move-object v12, v5

    .line 937
    const-string v5, "onWheelScrollStopped-TH1AsA0(J)V"

    .line 938
    .line 939
    move-object v13, v2

    .line 940
    move-object v8, v12

    .line 941
    move-object/from16 v2, p0

    .line 942
    .line 943
    move-object/from16 v12, p1

    .line 944
    .line 945
    invoke-direct/range {v0 .. v7}, Llh;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 946
    .line 947
    .line 948
    move-object v1, v0

    .line 949
    move-object v0, v2

    .line 950
    invoke-static {v0}, Lpf1;->Q(Lrm;)Lb60;

    .line 951
    .line 952
    .line 953
    move-result-object v2

    .line 954
    iget-object v2, v2, Lb60;->B:Lym;

    .line 955
    .line 956
    iget-object v3, v0, Ldz0;->Q:Llz0;

    .line 957
    .line 958
    invoke-direct {v13, v3, v8, v1, v2}, Lfn;-><init>(Llz0;Lx1;Llh;Lym;)V

    .line 959
    .line 960
    .line 961
    iput-object v13, v0, Ldz0;->W:Lfn;

    .line 962
    .line 963
    goto :goto_18

    .line 964
    :cond_3b
    move-object v12, v1

    .line 965
    :goto_18
    iget-object v1, v0, Ldz0;->W:Lfn;

    .line 966
    .line 967
    if-eqz v1, :cond_3e

    .line 968
    .line 969
    invoke-virtual {v0}, Loe0;->k0()Lyk;

    .line 970
    .line 971
    .line 972
    move-result-object v2

    .line 973
    iget-object v3, v1, Lfn;->g:Ljava/lang/Object;

    .line 974
    .line 975
    check-cast v3, Lr31;

    .line 976
    .line 977
    if-nez v3, :cond_3e

    .line 978
    .line 979
    new-instance v3, Le;

    .line 980
    .line 981
    const/4 v4, 0x7

    .line 982
    const/4 v5, 0x0

    .line 983
    invoke-direct {v3, v1, v5, v4}, Le;-><init>(Ljava/lang/Object;Lik;I)V

    .line 984
    .line 985
    .line 986
    const/4 v4, 0x3

    .line 987
    invoke-static {v2, v5, v3, v4}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 988
    .line 989
    .line 990
    move-result-object v2

    .line 991
    iput-object v2, v1, Lfn;->g:Ljava/lang/Object;

    .line 992
    .line 993
    goto :goto_19

    .line 994
    :cond_3c
    move-object v12, v1

    .line 995
    goto :goto_19

    .line 996
    :cond_3d
    move-object/from16 v12, p1

    .line 997
    .line 998
    :cond_3e
    :goto_19
    iget-object v0, v0, Ldz0;->W:Lfn;

    .line 999
    .line 1000
    if-eqz v0, :cond_42

    .line 1001
    .line 1002
    iget v1, v12, Lir0;->d:I

    .line 1003
    .line 1004
    const/4 v2, 0x6

    .line 1005
    if-ne v1, v2, :cond_42

    .line 1006
    .line 1007
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 1008
    .line 1009
    .line 1010
    move-result v1

    .line 1011
    const/4 v2, 0x0

    .line 1012
    :goto_1a
    if-ge v2, v1, :cond_40

    .line 1013
    .line 1014
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v3

    .line 1018
    check-cast v3, Lnr0;

    .line 1019
    .line 1020
    invoke-virtual {v3}, Lnr0;->b()Z

    .line 1021
    .line 1022
    .line 1023
    move-result v3

    .line 1024
    if-eqz v3, :cond_3f

    .line 1025
    .line 1026
    goto :goto_1d

    .line 1027
    :cond_3f
    add-int/lit8 v2, v2, 0x1

    .line 1028
    .line 1029
    goto :goto_1a

    .line 1030
    :cond_40
    if-ne v9, v14, :cond_41

    .line 1031
    .line 1032
    iget-boolean v1, v0, Lfn;->a:Z

    .line 1033
    .line 1034
    if-eqz v1, :cond_41

    .line 1035
    .line 1036
    invoke-virtual {v0, v12}, Lfn;->d(Lir0;)Z

    .line 1037
    .line 1038
    .line 1039
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 1040
    .line 1041
    .line 1042
    move-result v1

    .line 1043
    const/4 v2, 0x0

    .line 1044
    :goto_1b
    if-ge v2, v1, :cond_41

    .line 1045
    .line 1046
    invoke-interface {v11, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v3

    .line 1050
    check-cast v3, Lnr0;

    .line 1051
    .line 1052
    invoke-virtual {v3}, Lnr0;->a()V

    .line 1053
    .line 1054
    .line 1055
    add-int/lit8 v2, v2, 0x1

    .line 1056
    .line 1057
    goto :goto_1b

    .line 1058
    :cond_41
    if-ne v9, v15, :cond_42

    .line 1059
    .line 1060
    iget-boolean v1, v0, Lfn;->a:Z

    .line 1061
    .line 1062
    if-nez v1, :cond_42

    .line 1063
    .line 1064
    invoke-virtual {v0, v12}, Lfn;->d(Lir0;)Z

    .line 1065
    .line 1066
    .line 1067
    move-result v0

    .line 1068
    if-eqz v0, :cond_42

    .line 1069
    .line 1070
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 1071
    .line 1072
    .line 1073
    move-result v0

    .line 1074
    const/4 v12, 0x0

    .line 1075
    :goto_1c
    if-ge v12, v0, :cond_42

    .line 1076
    .line 1077
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v1

    .line 1081
    check-cast v1, Lnr0;

    .line 1082
    .line 1083
    invoke-virtual {v1}, Lnr0;->a()V

    .line 1084
    .line 1085
    .line 1086
    add-int/lit8 v12, v12, 0x1

    .line 1087
    .line 1088
    goto :goto_1c

    .line 1089
    :cond_42
    :goto_1d
    return-void
.end method
