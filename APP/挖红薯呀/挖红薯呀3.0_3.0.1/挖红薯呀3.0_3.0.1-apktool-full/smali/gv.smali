.class public final Lgv;
.super Lsm;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lvz0;
.implements Lnx;
.implements Lzi;
.implements Lmk0;
.implements Lh91;


# static fields
.field public static final z:Lr3;


# instance fields
.field public t:Lxg0;

.field public final u:Lf;

.field public v:Lru;

.field public w:Ly70;

.field public x:Lqj0;

.field public final y:Ldv;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr3;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lr3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lgv;->z:Lr3;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lxg0;Lf;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Lsm;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgv;->t:Lxg0;

    .line 5
    .line 6
    iput-object p2, p0, Lgv;->u:Lf;

    .line 7
    .line 8
    new-instance v0, Lfv;

    .line 9
    .line 10
    const-string v6, "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v1, 0x2

    .line 14
    const-class v3, Lgv;

    .line 15
    .line 16
    const-string v5, "onFocusStateChange"

    .line 17
    .line 18
    move-object v4, p0

    .line 19
    invoke-direct/range {v0 .. v6}, Lgx;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance p0, Ldv;

    .line 23
    .line 24
    const/16 p1, 0xa

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-direct {p0, p2, v0, p1}, Ldv;-><init>(ILww;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, p0}, Lsm;->w0(Lrm;)Lrm;

    .line 31
    .line 32
    .line 33
    iput-object p0, v4, Lgv;->y:Ldv;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final A0()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Loe0;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    iget-object v0, p0, Loe0;->d:Loe0;

    .line 6
    .line 7
    iget-boolean v0, v0, Loe0;->q:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "visitAncestors called on an unattached node"

    .line 12
    .line 13
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Loe0;->d:Loe0;

    .line 17
    .line 18
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 19
    .line 20
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    if-eqz p0, :cond_b

    .line 25
    .line 26
    iget-object v1, p0, Lb60;->I:Lmj0;

    .line 27
    .line 28
    iget-object v1, v1, Lmj0;->f:Loe0;

    .line 29
    .line 30
    iget v1, v1, Loe0;->g:I

    .line 31
    .line 32
    const/high16 v2, 0x40000

    .line 33
    .line 34
    and-int/2addr v1, v2

    .line 35
    const/4 v3, 0x0

    .line 36
    if-eqz v1, :cond_9

    .line 37
    .line 38
    :goto_1
    if-eqz v0, :cond_9

    .line 39
    .line 40
    iget v1, v0, Loe0;->f:I

    .line 41
    .line 42
    and-int/2addr v1, v2

    .line 43
    if-eqz v1, :cond_8

    .line 44
    .line 45
    move-object v1, v0

    .line 46
    move-object v4, v3

    .line 47
    :goto_2
    if-eqz v1, :cond_8

    .line 48
    .line 49
    instance-of v5, v1, Lh91;

    .line 50
    .line 51
    if-eqz v5, :cond_1

    .line 52
    .line 53
    check-cast v1, Lh91;

    .line 54
    .line 55
    invoke-interface {v1}, Lh91;->k()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sget-object v5, Lhv;->r:Lr3;

    .line 60
    .line 61
    if-eq v5, v1, :cond_b

    .line 62
    .line 63
    goto :goto_5

    .line 64
    :cond_1
    iget v5, v1, Loe0;->f:I

    .line 65
    .line 66
    and-int/2addr v5, v2

    .line 67
    if-eqz v5, :cond_7

    .line 68
    .line 69
    instance-of v5, v1, Lsm;

    .line 70
    .line 71
    if-eqz v5, :cond_7

    .line 72
    .line 73
    move-object v5, v1

    .line 74
    check-cast v5, Lsm;

    .line 75
    .line 76
    iget-object v5, v5, Lsm;->s:Loe0;

    .line 77
    .line 78
    const/4 v6, 0x0

    .line 79
    :goto_3
    const/4 v7, 0x1

    .line 80
    if-eqz v5, :cond_6

    .line 81
    .line 82
    iget v8, v5, Loe0;->f:I

    .line 83
    .line 84
    and-int/2addr v8, v2

    .line 85
    if-eqz v8, :cond_5

    .line 86
    .line 87
    add-int/lit8 v6, v6, 0x1

    .line 88
    .line 89
    if-ne v6, v7, :cond_2

    .line 90
    .line 91
    move-object v1, v5

    .line 92
    goto :goto_4

    .line 93
    :cond_2
    if-nez v4, :cond_3

    .line 94
    .line 95
    new-instance v4, Lsh0;

    .line 96
    .line 97
    const/16 v7, 0x10

    .line 98
    .line 99
    new-array v7, v7, [Loe0;

    .line 100
    .line 101
    invoke-direct {v4, v7}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-virtual {v4, v1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v1, v3

    .line 110
    :cond_4
    invoke-virtual {v4, v5}, Lsh0;->b(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    :goto_4
    iget-object v5, v5, Loe0;->i:Loe0;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    if-ne v6, v7, :cond_7

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_7
    :goto_5
    invoke-static {v4}, Lpf1;->f(Lsh0;)Loe0;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    goto :goto_2

    .line 124
    :cond_8
    iget-object v0, v0, Loe0;->h:Loe0;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_9
    invoke-virtual {p0}, Lb60;->v()Lb60;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-eqz p0, :cond_a

    .line 132
    .line 133
    iget-object v0, p0, Lb60;->I:Lmj0;

    .line 134
    .line 135
    if-eqz v0, :cond_a

    .line 136
    .line 137
    iget-object v0, v0, Lmj0;->e:Ld61;

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_a
    move-object v0, v3

    .line 141
    goto :goto_0

    .line 142
    :cond_b
    return-void
.end method

.method public final B0(Lxg0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lgv;->t:Lxg0;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lgv;->t:Lxg0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lgv;->v:Lru;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v2, Lsu;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Lsu;-><init>(Lru;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lxg0;->c(Lf30;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lgv;->v:Lru;

    .line 27
    .line 28
    iput-object p1, p0, Lgv;->t:Lxg0;

    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final S(Lf01;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lgv;->y:Ldv;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldv;->B0()Lcv;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcv;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget-object v1, Ld01;->a:[Lu40;

    .line 12
    .line 13
    sget-object v1, Lb01;->k:Le01;

    .line 14
    .line 15
    sget-object v2, Ld01;->a:[Lu40;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    aget-object v2, v2, v3

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v1, v0}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Ll3;

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v9, 0x2

    .line 31
    const/4 v3, 0x0

    .line 32
    const-class v5, Lgv;

    .line 33
    .line 34
    const-string v6, "requestFocus"

    .line 35
    .line 36
    const-string v7, "requestFocus()Z"

    .line 37
    .line 38
    move-object v4, p0

    .line 39
    invoke-direct/range {v2 .. v9}, Ll3;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lrz0;->v:Le01;

    .line 43
    .line 44
    new-instance v0, Lo0;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, v1, v2}, Lo0;-><init>(Ljava/lang/String;Lex;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, p0, v0}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final k()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lgv;->z:Lr3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final n(Lqj0;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lgv;->x:Lqj0;

    .line 2
    .line 3
    iget-object v0, p0, Lgv;->y:Ldv;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldv;->B0()Lcv;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcv;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Lqj0;->G0()Loe0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-boolean p1, p1, Loe0;->q:Z

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object p1, p0, Lgv;->x:Lqj0;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Lqj0;->G0()Loe0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-boolean p1, p1, Loe0;->q:Z

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lgv;->A0()V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void

    .line 40
    :cond_2
    invoke-virtual {p0}, Lgv;->A0()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final q0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lgv;->w:Ly70;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ly70;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lgv;->w:Ly70;

    .line 10
    .line 11
    return-void
.end method

.method public final z()V
    .locals 3

    .line 1
    new-instance v0, Lzt0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lc7;

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-direct {v1, v2, v0, p0}, Lc7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v1}, Lr60;->v(Loe0;Lhw;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lzt0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ly70;

    .line 18
    .line 19
    iget-object v1, p0, Lgv;->y:Ldv;

    .line 20
    .line 21
    invoke-virtual {v1}, Ldv;->B0()Lcv;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Lcv;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Lgv;->w:Ly70;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Ly70;->b()V

    .line 36
    .line 37
    .line 38
    :cond_0
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Ly70;->a()Ly70;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v0, 0x0

    .line 45
    :goto_0
    iput-object v0, p0, Lgv;->w:Ly70;

    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public final z0(Lxg0;Lf30;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Loe0;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Loe0;->k0()Lyk;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lhk;

    .line 10
    .line 11
    iget-object v0, v0, Lhk;->d:Lpk;

    .line 12
    .line 13
    sget-object v1, Ln2;->I:Ln2;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lpk;->l(Lok;)Lnk;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lc40;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v1, Lc;

    .line 25
    .line 26
    const/4 v2, 0x5

    .line 27
    invoke-direct {v1, v2, p1, p2}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Lc40;->r(Lsw;)Lpo;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    move-object v4, v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v4, v5

    .line 37
    :goto_0
    invoke-virtual {p0}, Loe0;->k0()Lyk;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v1, Li;

    .line 42
    .line 43
    const/4 v6, 0x6

    .line 44
    move-object v2, p1

    .line 45
    move-object v3, p2

    .line 46
    invoke-direct/range {v1 .. v6}, Li;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x3

    .line 50
    invoke-static {p0, v5, v1, p1}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    move-object v2, p1

    .line 55
    move-object v3, p2

    .line 56
    invoke-virtual {v2, v3}, Lxg0;->c(Lf30;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method
