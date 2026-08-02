.class public final Lmf1;
.super Lsz1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lif1;
.implements Lw5;
.implements Lki1;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public final D:Ls61;

.field public final E:Lzk1;

.field public F:Z

.field public G:Z

.field public H:J

.field public final I:Llf1;

.field public final J:Llf1;

.field public K:F

.field public L:Z

.field public M:Lin0;

.field public N:J

.field public O:F

.field public final P:Llf1;

.field public Q:Z

.field public final m:Lv61;

.field public n:Z

.field public o:I

.field public p:I

.field public q:Z

.field public r:Z

.field public s:Lp61;

.field public t:J

.field public u:Lin0;

.field public v:F

.field public w:Z

.field public x:Ljava/lang/Object;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Lv61;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lsz1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmf1;->m:Lv61;

    .line 5
    .line 6
    const p1, 0x7fffffff

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lmf1;->o:I

    .line 10
    .line 11
    iput p1, p0, Lmf1;->p:I

    .line 12
    .line 13
    sget-object p1, Lp61;->j:Lp61;

    .line 14
    .line 15
    iput-object p1, p0, Lmf1;->s:Lp61;

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    iput-wide v0, p0, Lmf1;->t:J

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lmf1;->w:Z

    .line 23
    .line 24
    new-instance v2, Ls61;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v2, p0, v3}, Ls61;-><init>(Lw5;I)V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Lmf1;->D:Ls61;

    .line 31
    .line 32
    new-instance v2, Lzk1;

    .line 33
    .line 34
    const/16 v4, 0x10

    .line 35
    .line 36
    new-array v4, v4, [Lmf1;

    .line 37
    .line 38
    invoke-direct {v2, v4}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, Lmf1;->E:Lzk1;

    .line 42
    .line 43
    iput-boolean p1, p0, Lmf1;->F:Z

    .line 44
    .line 45
    const/16 v2, 0xf

    .line 46
    .line 47
    invoke-static {v3, v3, v3, v3, v2}, Lgz;->b(IIIII)J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    iput-wide v4, p0, Lmf1;->H:J

    .line 52
    .line 53
    new-instance v2, Llf1;

    .line 54
    .line 55
    invoke-direct {v2, p0, p1}, Llf1;-><init>(Lmf1;I)V

    .line 56
    .line 57
    .line 58
    iput-object v2, p0, Lmf1;->I:Llf1;

    .line 59
    .line 60
    new-instance p1, Llf1;

    .line 61
    .line 62
    invoke-direct {p1, p0, v3}, Llf1;-><init>(Lmf1;I)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lmf1;->J:Llf1;

    .line 66
    .line 67
    iput-wide v0, p0, Lmf1;->N:J

    .line 68
    .line 69
    new-instance p1, Llf1;

    .line 70
    .line 71
    const/4 v0, 0x2

    .line 72
    invoke-direct {p1, p0, v0}, Llf1;-><init>(Lmf1;I)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lmf1;->P:Llf1;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final N(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object v1, v0, Lv61;->a:Lr61;

    .line 4
    .line 5
    invoke-static {v1}, Lfg1;->z(Lr61;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Lv61;->q:Lqd1;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lqd1;->N(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lmf1;->o0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0, p1}, Lif1;->N(I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final P()I
    .locals 0

    .line 1
    iget p0, p0, Lmf1;->p:I

    .line 2
    .line 3
    return p0
.end method

.method public final U()V
    .locals 2

    .line 1
    iget-object p0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object p0, p0, Lv61;->a:Lr61;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-static {p0, v0, v1}, Lr61;->V(Lr61;ZI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final W(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object v1, v0, Lv61;->a:Lr61;

    .line 4
    .line 5
    invoke-static {v1}, Lfg1;->z(Lr61;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Lv61;->q:Lqd1;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lqd1;->W(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lmf1;->o0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0, p1}, Lif1;->W(I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final X(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object v1, v0, Lv61;->a:Lr61;

    .line 4
    .line 5
    invoke-static {v1}, Lfg1;->z(Lr61;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Lv61;->q:Lqd1;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lqd1;->X(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lmf1;->o0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0, p1}, Lif1;->X(I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final Z()I
    .locals 0

    .line 1
    iget-object p0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    invoke-virtual {p0}, Lv61;->a()Lzn1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lsz1;->Z()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final a()Ls61;
    .locals 0

    .line 1
    iget-object p0, p0, Lmf1;->D:Ls61;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b0()I
    .locals 0

    .line 1
    iget-object p0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    invoke-virtual {p0}, Lv61;->a()Lzn1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lsz1;->b0()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final e(J)Lsz1;
    .locals 5

    .line 1
    iget-object v0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object v1, v0, Lv61;->a:Lr61;

    .line 4
    .line 5
    iget-object v2, v0, Lv61;->a:Lr61;

    .line 6
    .line 7
    iget-object v3, v1, Lr61;->J:Lp61;

    .line 8
    .line 9
    sget-object v4, Lp61;->j:Lp61;

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lr61;->e()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {v2}, Lfg1;->z(Lr61;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Lv61;->q:Lqd1;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iput-object v4, v0, Lqd1;->q:Lp61;

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Lqd1;->e(J)Lsz1;

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {v2}, Lr61;->u()Lr61;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_6

    .line 37
    .line 38
    iget-object v0, v0, Lr61;->N:Lv61;

    .line 39
    .line 40
    iget-object v1, p0, Lmf1;->s:Lp61;

    .line 41
    .line 42
    if-eq v1, v4, :cond_3

    .line 43
    .line 44
    iget-boolean v1, v2, Lr61;->L:Z

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const-string v1, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    .line 50
    .line 51
    invoke-static {v1}, Lkz0;->b(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_0
    iget-object v1, v0, Lv61;->d:Ln61;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    const/4 v2, 0x2

    .line 63
    if-ne v1, v2, :cond_4

    .line 64
    .line 65
    sget-object v0, Lp61;->i:Lp61;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    const-string p0, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    .line 69
    .line 70
    iget-object p1, v0, Lv61;->d:Ln61;

    .line 71
    .line 72
    invoke-static {p0, p1}, Ls;->n(Ljava/lang/String;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return-object p0

    .line 77
    :cond_5
    sget-object v0, Lp61;->h:Lp61;

    .line 78
    .line 79
    :goto_1
    iput-object v0, p0, Lmf1;->s:Lp61;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_6
    iput-object v4, p0, Lmf1;->s:Lp61;

    .line 83
    .line 84
    :goto_2
    invoke-virtual {p0, p1, p2}, Lmf1;->t0(J)Z

    .line 85
    .line 86
    .line 87
    return-object p0
.end method

.method public final f(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object v1, v0, Lv61;->a:Lr61;

    .line 4
    .line 5
    invoke-static {v1}, Lfg1;->z(Lr61;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Lv61;->q:Lqd1;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lqd1;->f(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lmf1;->o0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0, p1}, Lif1;->f(I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final f0(JFLin0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object v1, v0, Lv61;->a:Lr61;

    .line 4
    .line 5
    iget-object v2, v0, Lv61;->a:Lr61;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    :try_start_0
    iput-boolean v3, p0, Lmf1;->z:Z

    .line 9
    .line 10
    iget-wide v4, p0, Lmf1;->t:J

    .line 11
    .line 12
    invoke-static {p1, p2, v4, v5}, Lz01;->a(JJ)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/4 v5, 0x0

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iget-object v4, p0, Lmf1;->u:Lin0;

    .line 20
    .line 21
    if-ne p4, v4, :cond_0

    .line 22
    .line 23
    iget-boolean v4, p0, Lmf1;->Q:Z

    .line 24
    .line 25
    if-eqz v4, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_0
    :goto_0
    iget-boolean v4, v0, Lv61;->k:Z

    .line 32
    .line 33
    if-nez v4, :cond_1

    .line 34
    .line 35
    iget-boolean v4, v0, Lv61;->j:Z

    .line 36
    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    iget-boolean v4, p0, Lmf1;->Q:Z

    .line 40
    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    :cond_1
    iput-boolean v3, p0, Lmf1;->B:Z

    .line 44
    .line 45
    iput-boolean v5, p0, Lmf1;->Q:Z

    .line 46
    .line 47
    :cond_2
    iget-object v4, v0, Lv61;->q:Lqd1;

    .line 48
    .line 49
    if-eqz v4, :cond_4

    .line 50
    .line 51
    iget-object v6, v4, Lqd1;->m:Lv61;

    .line 52
    .line 53
    iget-object v4, v4, Lqd1;->w:Lod1;

    .line 54
    .line 55
    sget-object v7, Lod1;->j:Lod1;

    .line 56
    .line 57
    if-ne v4, v7, :cond_4

    .line 58
    .line 59
    iget-object v4, v6, Lv61;->a:Lr61;

    .line 60
    .line 61
    invoke-static {v4}, Lfg1;->z(Lr61;)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    iput-boolean v3, v6, Lv61;->c:Z

    .line 69
    .line 70
    :cond_4
    :goto_1
    iget-object v4, v0, Lv61;->q:Lqd1;

    .line 71
    .line 72
    if-eqz v4, :cond_8

    .line 73
    .line 74
    invoke-virtual {v4}, Lqd1;->l0()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-ne v4, v3, :cond_8

    .line 79
    .line 80
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    iget-object v3, v3, Lzn1;->x:Lzn1;

    .line 85
    .line 86
    if-eqz v3, :cond_5

    .line 87
    .line 88
    iget-object v3, v3, Lkd1;->s:Lld1;

    .line 89
    .line 90
    if-nez v3, :cond_6

    .line 91
    .line 92
    :cond_5
    invoke-static {v2}, Lu61;->a(Lr61;)Lzv1;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Lb7;

    .line 97
    .line 98
    invoke-virtual {v3}, Lb7;->getPlacementScope()Lrz1;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    :cond_6
    iget-object v4, v0, Lv61;->q:Lqd1;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Lr61;->u()Lr61;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-eqz v2, :cond_7

    .line 112
    .line 113
    iget-object v2, v2, Lr61;->N:Lv61;

    .line 114
    .line 115
    iput v5, v2, Lv61;->h:I

    .line 116
    .line 117
    :cond_7
    const v2, 0x7fffffff

    .line 118
    .line 119
    .line 120
    iput v2, v4, Lqd1;->p:I

    .line 121
    .line 122
    const/16 v2, 0x20

    .line 123
    .line 124
    shr-long v5, p1, v2

    .line 125
    .line 126
    long-to-int v2, v5

    .line 127
    const-wide v5, 0xffffffffL

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    and-long/2addr v5, p1

    .line 133
    long-to-int v5, v5

    .line 134
    invoke-static {v3, v4, v2, v5}, Lrz1;->g(Lrz1;Lsz1;II)V

    .line 135
    .line 136
    .line 137
    :cond_8
    iget-object v0, v0, Lv61;->q:Lqd1;

    .line 138
    .line 139
    if-eqz v0, :cond_9

    .line 140
    .line 141
    iget-boolean v0, v0, Lqd1;->r:Z

    .line 142
    .line 143
    if-nez v0, :cond_9

    .line 144
    .line 145
    const-string v0, "Error: Placement happened before lookahead."

    .line 146
    .line 147
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    :cond_9
    invoke-virtual {p0, p1, p2, p3, p4}, Lmf1;->r0(JFLin0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :goto_2
    invoke-virtual {v1, p0}, Lr61;->Y(Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    const/4 p0, 0x0

    .line 158
    throw p0
.end method

.method public final i()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lmf1;->x:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k(Lv5;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object p0, p0, Lv61;->a:Lr61;

    .line 4
    .line 5
    invoke-virtual {p0}, Lr61;->y()Lzk1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object v0, p0, Lzk1;->h:[Ljava/lang/Object;

    .line 10
    .line 11
    iget p0, p0, Lzk1;->j:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, p0, :cond_0

    .line 15
    .line 16
    aget-object v2, v0, v1

    .line 17
    .line 18
    check-cast v2, Lr61;

    .line 19
    .line 20
    iget-object v2, v2, Lr61;->N:Lv61;

    .line 21
    .line 22
    iget-object v2, v2, Lv61;->p:Lmf1;

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Lv5;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public final l(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-boolean v1, v1, Lkd1;->p:Z

    .line 8
    .line 9
    if-eq p1, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-boolean p1, v0, Lkd1;->p:Z

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lmf1;->Q:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final l0()Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object v1, v0, Lv61;->a:Lr61;

    .line 4
    .line 5
    invoke-virtual {v1}, Lr61;->f0()V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lmf1;->F:Z

    .line 9
    .line 10
    iget-object v2, p0, Lmf1;->E:Lzk1;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, Lzk1;->f()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    iget-object v0, v0, Lv61;->a:Lr61;

    .line 20
    .line 21
    invoke-virtual {v0}, Lr61;->y()Lzk1;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v3, v1, Lzk1;->h:[Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v1, Lzk1;->j:I

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    move v5, v4

    .line 31
    :goto_0
    if-ge v5, v1, :cond_2

    .line 32
    .line 33
    aget-object v6, v3, v5

    .line 34
    .line 35
    check-cast v6, Lr61;

    .line 36
    .line 37
    iget v7, v2, Lzk1;->j:I

    .line 38
    .line 39
    if-gt v7, v5, :cond_1

    .line 40
    .line 41
    iget-object v6, v6, Lr61;->N:Lv61;

    .line 42
    .line 43
    iget-object v6, v6, Lv61;->p:Lmf1;

    .line 44
    .line 45
    invoke-virtual {v2, v6}, Lzk1;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v6, v6, Lr61;->N:Lv61;

    .line 50
    .line 51
    iget-object v6, v6, Lv61;->p:Lmf1;

    .line 52
    .line 53
    iget-object v7, v2, Lzk1;->h:[Ljava/lang/Object;

    .line 54
    .line 55
    aget-object v8, v7, v5

    .line 56
    .line 57
    aput-object v6, v7, v5

    .line 58
    .line 59
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-virtual {v0}, Lr61;->n()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljk1;

    .line 67
    .line 68
    iget-object v0, v0, Ljk1;->i:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lzk1;

    .line 71
    .line 72
    iget v0, v0, Lzk1;->j:I

    .line 73
    .line 74
    iget v1, v2, Lzk1;->j:I

    .line 75
    .line 76
    invoke-virtual {v2, v0, v1}, Lzk1;->l(II)V

    .line 77
    .line 78
    .line 79
    iput-boolean v4, p0, Lmf1;->F:Z

    .line 80
    .line 81
    invoke-virtual {v2}, Lzk1;->f()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method

.method public final m0()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lmf1;->y:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lmf1;->y:Z

    .line 5
    .line 6
    iget-object p0, p0, Lmf1;->m:Lv61;

    .line 7
    .line 8
    iget-object v2, p0, Lv61;->a:Lr61;

    .line 9
    .line 10
    iget-object v3, v2, Lr61;->M:Lvn1;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v3, Lvn1;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lqz0;

    .line 17
    .line 18
    invoke-virtual {v0}, Lzn1;->d1()V

    .line 19
    .line 20
    .line 21
    invoke-static {v2}, Lu61;->a(Lr61;)Lzv1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lb7;

    .line 26
    .line 27
    invoke-virtual {v0}, Lb7;->getRectManager()Lq62;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object p0, p0, Lv61;->a:Lr61;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Lq62;->f(Lr61;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lr61;->q()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    const/4 v0, 0x6

    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    invoke-static {v2, v1, v0}, Lr61;->V(Lr61;ZI)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object p0, v2, Lr61;->N:Lv61;

    .line 48
    .line 49
    iget-boolean p0, p0, Lv61;->e:Z

    .line 50
    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    invoke-static {v2, v1, v0}, Lr61;->T(Lr61;ZI)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    iget-object p0, v3, Lvn1;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Lzn1;

    .line 59
    .line 60
    iget-object v0, v3, Lvn1;->d:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lqz0;

    .line 63
    .line 64
    iget-object v0, v0, Lzn1;->w:Lzn1;

    .line 65
    .line 66
    :goto_1
    invoke-static {p0, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    iget-boolean v1, p0, Lzn1;->R:Z

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0}, Lzn1;->Z0()V

    .line 79
    .line 80
    .line 81
    :cond_2
    iget-object p0, p0, Lzn1;->w:Lzn1;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    invoke-virtual {v2}, Lr61;->y()Lzk1;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    iget-object v0, p0, Lzk1;->h:[Ljava/lang/Object;

    .line 89
    .line 90
    iget p0, p0, Lzk1;->j:I

    .line 91
    .line 92
    const/4 v1, 0x0

    .line 93
    :goto_2
    if-ge v1, p0, :cond_5

    .line 94
    .line 95
    aget-object v2, v0, v1

    .line 96
    .line 97
    check-cast v2, Lr61;

    .line 98
    .line 99
    invoke-virtual {v2}, Lr61;->v()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    const v4, 0x7fffffff

    .line 104
    .line 105
    .line 106
    if-eq v3, v4, :cond_4

    .line 107
    .line 108
    iget-object v3, v2, Lr61;->N:Lv61;

    .line 109
    .line 110
    iget-object v3, v3, Lv61;->p:Lmf1;

    .line 111
    .line 112
    invoke-virtual {v3}, Lmf1;->m0()V

    .line 113
    .line 114
    .line 115
    invoke-static {v2}, Lr61;->W(Lr61;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    return-void
.end method

.method public final n()Lqz0;
    .locals 0

    .line 1
    iget-object p0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object p0, p0, Lv61;->a:Lr61;

    .line 4
    .line 5
    iget-object p0, p0, Lr61;->M:Lvn1;

    .line 6
    .line 7
    iget-object p0, p0, Lvn1;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lqz0;

    .line 10
    .line 11
    return-object p0
.end method

.method public final n0()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lmf1;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lmf1;->y:Z

    .line 7
    .line 8
    iget-object p0, p0, Lmf1;->m:Lv61;

    .line 9
    .line 10
    iget-object v1, p0, Lv61;->a:Lr61;

    .line 11
    .line 12
    iget-object p0, p0, Lv61;->a:Lr61;

    .line 13
    .line 14
    invoke-static {v1}, Lu61;->a(Lr61;)Lzv1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lb7;

    .line 19
    .line 20
    invoke-virtual {v1}, Lb7;->getRectManager()Lq62;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p0}, Lq62;->g(Lr61;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lr61;->M:Lvn1;

    .line 28
    .line 29
    iget-object v2, v1, Lvn1;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lzn1;

    .line 32
    .line 33
    iget-object v1, v1, Lvn1;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Lqz0;

    .line 36
    .line 37
    iget-object v1, v1, Lzn1;->w:Lzn1;

    .line 38
    .line 39
    :goto_0
    invoke-static {v2, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_0

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v2}, Lzn1;->f1()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lzn1;->k1()V

    .line 51
    .line 52
    .line 53
    iget-object v2, v2, Lzn1;->w:Lzn1;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p0}, Lr61;->y()Lzk1;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    iget-object v1, p0, Lzk1;->h:[Ljava/lang/Object;

    .line 61
    .line 62
    iget p0, p0, Lzk1;->j:I

    .line 63
    .line 64
    :goto_1
    if-ge v0, p0, :cond_1

    .line 65
    .line 66
    aget-object v2, v1, v0

    .line 67
    .line 68
    check-cast v2, Lr61;

    .line 69
    .line 70
    iget-object v2, v2, Lr61;->N:Lv61;

    .line 71
    .line 72
    iget-object v2, v2, Lv61;->p:Lmf1;

    .line 73
    .line 74
    invoke-virtual {v2}, Lmf1;->n0()V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v0, v0, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    return-void
.end method

.method public final o0()V
    .locals 3

    .line 1
    iget-object p0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object v0, p0, Lv61;->a:Lr61;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x7

    .line 7
    invoke-static {v0, v1, v2}, Lr61;->V(Lr61;ZI)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lv61;->a:Lr61;

    .line 11
    .line 12
    invoke-virtual {p0}, Lr61;->u()Lr61;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v1, p0, Lr61;->J:Lp61;

    .line 19
    .line 20
    sget-object v2, Lp61;->j:Lp61;

    .line 21
    .line 22
    if-ne v1, v2, :cond_2

    .line 23
    .line 24
    iget-object v1, v0, Lr61;->N:Lv61;

    .line 25
    .line 26
    iget-object v1, v1, Lv61;->d:Ln61;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    if-eq v1, v2, :cond_0

    .line 36
    .line 37
    iget-object v0, v0, Lr61;->J:Lp61;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object v0, Lp61;->i:Lp61;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget-object v0, Lp61;->h:Lp61;

    .line 44
    .line 45
    :goto_0
    iput-object v0, p0, Lr61;->J:Lp61;

    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public final p()Lw5;
    .locals 0

    .line 1
    iget-object p0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object p0, p0, Lv61;->a:Lr61;

    .line 4
    .line 5
    invoke-virtual {p0}, Lr61;->u()Lr61;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lr61;->N:Lv61;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lv61;->p:Lmf1;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public final q()V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lmf1;->G:Z

    .line 3
    .line 4
    iget-object v0, p0, Lmf1;->D:Ls61;

    .line 5
    .line 6
    invoke-virtual {v0}, Ls61;->h()V

    .line 7
    .line 8
    .line 9
    iget-boolean v1, p0, Lmf1;->B:Z

    .line 10
    .line 11
    iget-object v2, p0, Lmf1;->m:Lv61;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    iget-object v1, v2, Lv61;->a:Lr61;

    .line 17
    .line 18
    invoke-virtual {v1}, Lr61;->y()Lzk1;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v4, v1, Lzk1;->h:[Ljava/lang/Object;

    .line 23
    .line 24
    iget v1, v1, Lzk1;->j:I

    .line 25
    .line 26
    move v5, v3

    .line 27
    :goto_0
    if-ge v5, v1, :cond_4

    .line 28
    .line 29
    aget-object v6, v4, v5

    .line 30
    .line 31
    check-cast v6, Lr61;

    .line 32
    .line 33
    invoke-virtual {v6}, Lr61;->q()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iget-object v8, v6, Lr61;->N:Lv61;

    .line 38
    .line 39
    if-eqz v7, :cond_3

    .line 40
    .line 41
    invoke-virtual {v6}, Lr61;->r()Lp61;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    sget-object v9, Lp61;->h:Lp61;

    .line 46
    .line 47
    if-ne v7, v9, :cond_3

    .line 48
    .line 49
    iget-object v7, v8, Lv61;->p:Lmf1;

    .line 50
    .line 51
    iget-boolean v9, v7, Lmf1;->q:Z

    .line 52
    .line 53
    if-eqz v9, :cond_0

    .line 54
    .line 55
    iget-wide v9, v7, Lsz1;->k:J

    .line 56
    .line 57
    new-instance v7, Lfz;

    .line 58
    .line 59
    invoke-direct {v7, v9, v10}, Lfz;-><init>(J)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    const/4 v7, 0x0

    .line 64
    :goto_1
    if-eqz v7, :cond_2

    .line 65
    .line 66
    iget-object v9, v6, Lr61;->J:Lp61;

    .line 67
    .line 68
    sget-object v10, Lp61;->j:Lp61;

    .line 69
    .line 70
    if-ne v9, v10, :cond_1

    .line 71
    .line 72
    invoke-virtual {v6}, Lr61;->e()V

    .line 73
    .line 74
    .line 75
    :cond_1
    iget-object v6, v8, Lv61;->p:Lmf1;

    .line 76
    .line 77
    iget-wide v7, v7, Lfz;->a:J

    .line 78
    .line 79
    invoke-virtual {v6, v7, v8}, Lmf1;->t0(J)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    move v6, v3

    .line 85
    :goto_2
    if-eqz v6, :cond_3

    .line 86
    .line 87
    iget-object v6, v2, Lv61;->a:Lr61;

    .line 88
    .line 89
    const/4 v7, 0x7

    .line 90
    invoke-static {v6, v3, v7}, Lr61;->V(Lr61;ZI)V

    .line 91
    .line 92
    .line 93
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    iget-boolean v1, p0, Lmf1;->C:Z

    .line 97
    .line 98
    if-nez v1, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0}, Lmf1;->n()Lqz0;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget-boolean v1, v1, Lkd1;->r:Z

    .line 105
    .line 106
    if-nez v1, :cond_6

    .line 107
    .line 108
    iget-boolean v1, p0, Lmf1;->B:Z

    .line 109
    .line 110
    if-eqz v1, :cond_6

    .line 111
    .line 112
    :cond_5
    iput-boolean v3, p0, Lmf1;->B:Z

    .line 113
    .line 114
    iget-object v1, v2, Lv61;->d:Ln61;

    .line 115
    .line 116
    sget-object v4, Ln61;->j:Ln61;

    .line 117
    .line 118
    iput-object v4, v2, Lv61;->d:Ln61;

    .line 119
    .line 120
    invoke-virtual {v2, v3}, Lv61;->g(Z)V

    .line 121
    .line 122
    .line 123
    iget-object v4, v2, Lv61;->a:Lr61;

    .line 124
    .line 125
    invoke-static {v4}, Lu61;->a(Lr61;)Lzv1;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    check-cast v5, Lb7;

    .line 130
    .line 131
    invoke-virtual {v5}, Lb7;->getSnapshotObserver()Lbw1;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    iget-object v6, v5, Lbw1;->e:Loq0;

    .line 136
    .line 137
    iget-object v5, v5, Lbw1;->a:Lts2;

    .line 138
    .line 139
    iget-object v7, p0, Lmf1;->J:Llf1;

    .line 140
    .line 141
    invoke-virtual {v5, v4, v6, v7}, Lts2;->c(Ljava/lang/Object;Lin0;Lxm0;)V

    .line 142
    .line 143
    .line 144
    iput-object v1, v2, Lv61;->d:Ln61;

    .line 145
    .line 146
    iput-boolean v3, p0, Lmf1;->C:Z

    .line 147
    .line 148
    :cond_6
    iget-boolean v1, v0, Ls61;->b:Z

    .line 149
    .line 150
    if-eqz v1, :cond_7

    .line 151
    .line 152
    invoke-virtual {v0}, Ls61;->e()Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_7

    .line 157
    .line 158
    invoke-virtual {v0}, Ls61;->g()V

    .line 159
    .line 160
    .line 161
    :cond_7
    iput-boolean v3, p0, Lmf1;->G:Z

    .line 162
    .line 163
    return-void
.end method

.method public final q0()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lmf1;->L:Z

    .line 3
    .line 4
    iget-object v1, p0, Lmf1;->m:Lv61;

    .line 5
    .line 6
    iget-object v2, v1, Lv61;->a:Lr61;

    .line 7
    .line 8
    invoke-virtual {v2}, Lr61;->u()Lr61;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p0}, Lmf1;->n()Lqz0;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget v3, v3, Lzn1;->H:F

    .line 17
    .line 18
    iget-object v1, v1, Lv61;->a:Lr61;

    .line 19
    .line 20
    iget-object v4, v1, Lr61;->M:Lvn1;

    .line 21
    .line 22
    iget-object v5, v4, Lvn1;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v5, Lzn1;

    .line 25
    .line 26
    iget-object v4, v4, Lvn1;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Lqz0;

    .line 29
    .line 30
    :goto_0
    if-eq v5, v4, :cond_0

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    check-cast v5, Ll61;

    .line 36
    .line 37
    iget v6, v5, Lzn1;->H:F

    .line 38
    .line 39
    add-float/2addr v3, v6

    .line 40
    iget-object v5, v5, Lzn1;->w:Lzn1;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget v4, p0, Lmf1;->K:F

    .line 44
    .line 45
    cmpg-float v4, v3, v4

    .line 46
    .line 47
    if-nez v4, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iput v3, p0, Lmf1;->K:F

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {v2}, Lr61;->O()V

    .line 55
    .line 56
    .line 57
    :cond_2
    if-eqz v2, :cond_3

    .line 58
    .line 59
    invoke-virtual {v2}, Lr61;->C()V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lmf1;->n()Lqz0;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iget-boolean v3, v3, Lkd1;->r:Z

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    if-nez v3, :cond_8

    .line 70
    .line 71
    iget-boolean v3, p0, Lmf1;->y:Z

    .line 72
    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    iget-object v5, p0, Lmf1;->D:Ls61;

    .line 76
    .line 77
    invoke-virtual {v5}, Ls61;->d()Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_5

    .line 82
    .line 83
    :cond_4
    invoke-virtual {p0}, Lmf1;->m0()V

    .line 84
    .line 85
    .line 86
    :cond_5
    if-nez v3, :cond_7

    .line 87
    .line 88
    if-eqz v2, :cond_6

    .line 89
    .line 90
    invoke-virtual {v2}, Lr61;->C()V

    .line 91
    .line 92
    .line 93
    :cond_6
    iget-boolean v1, p0, Lmf1;->n:Z

    .line 94
    .line 95
    if-eqz v1, :cond_8

    .line 96
    .line 97
    if-eqz v2, :cond_8

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Lr61;->U(Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_7
    iget-object v1, v1, Lr61;->M:Lvn1;

    .line 104
    .line 105
    iget-object v1, v1, Lvn1;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Lqz0;

    .line 108
    .line 109
    invoke-virtual {v1}, Lzn1;->d1()V

    .line 110
    .line 111
    .line 112
    :cond_8
    :goto_2
    if-eqz v2, :cond_a

    .line 113
    .line 114
    iget-object v1, v2, Lr61;->N:Lv61;

    .line 115
    .line 116
    iget-boolean v2, p0, Lmf1;->n:Z

    .line 117
    .line 118
    if-nez v2, :cond_b

    .line 119
    .line 120
    iget-object v2, v1, Lv61;->d:Ln61;

    .line 121
    .line 122
    sget-object v3, Ln61;->j:Ln61;

    .line 123
    .line 124
    if-ne v2, v3, :cond_b

    .line 125
    .line 126
    iget v2, p0, Lmf1;->p:I

    .line 127
    .line 128
    const v3, 0x7fffffff

    .line 129
    .line 130
    .line 131
    if-ne v2, v3, :cond_9

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_9
    const-string v2, "Place was called on a node which was placed already"

    .line 135
    .line 136
    invoke-static {v2}, Lkz0;->b(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :goto_3
    iget v2, v1, Lv61;->i:I

    .line 140
    .line 141
    iput v2, p0, Lmf1;->p:I

    .line 142
    .line 143
    add-int/2addr v2, v0

    .line 144
    iput v2, v1, Lv61;->i:I

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_a
    iput v4, p0, Lmf1;->p:I

    .line 148
    .line 149
    :cond_b
    :goto_4
    invoke-virtual {p0}, Lmf1;->q()V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public final r0(JFLin0;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object v1, v0, Lv61;->a:Lr61;

    .line 4
    .line 5
    iget-object v2, v0, Lv61;->a:Lr61;

    .line 6
    .line 7
    iget-boolean v1, v1, Lr61;->X:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v1, "place is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v1}, Lkz0;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object v1, Ln61;->j:Ln61;

    .line 17
    .line 18
    iput-object v1, v0, Lv61;->d:Ln61;

    .line 19
    .line 20
    iput-wide p1, p0, Lmf1;->t:J

    .line 21
    .line 22
    iput p3, p0, Lmf1;->v:F

    .line 23
    .line 24
    iput-object p4, p0, Lmf1;->u:Lin0;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-boolean v1, p0, Lmf1;->L:Z

    .line 28
    .line 29
    invoke-static {v2}, Lu61;->a(Lr61;)Lzv1;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-boolean v4, p0, Lmf1;->B:Z

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    iget-boolean v4, p0, Lmf1;->y:Z

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-wide v2, v1, Lsz1;->l:J

    .line 46
    .line 47
    invoke-static {p1, p2, v2, v3}, Lz01;->c(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    invoke-virtual {v1, p1, p2, p3, p4}, Lzn1;->i1(JFLin0;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lmf1;->q0()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v4, p0, Lmf1;->D:Ls61;

    .line 59
    .line 60
    iput-boolean v1, v4, Ls61;->e:Z

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lv61;->f(Z)V

    .line 63
    .line 64
    .line 65
    iput-object p4, p0, Lmf1;->M:Lin0;

    .line 66
    .line 67
    iput-wide p1, p0, Lmf1;->N:J

    .line 68
    .line 69
    iput p3, p0, Lmf1;->O:F

    .line 70
    .line 71
    check-cast v3, Lb7;

    .line 72
    .line 73
    invoke-virtual {v3}, Lb7;->getSnapshotObserver()Lbw1;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object p2, p1, Lbw1;->f:Loq0;

    .line 78
    .line 79
    iget-object p1, p1, Lbw1;->a:Lts2;

    .line 80
    .line 81
    iget-object p3, p0, Lmf1;->P:Llf1;

    .line 82
    .line 83
    invoke-virtual {p1, v2, p2, p3}, Lts2;->c(Ljava/lang/Object;Lin0;Lxm0;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    sget-object p1, Ln61;->l:Ln61;

    .line 87
    .line 88
    iput-object p1, v0, Lv61;->d:Ln61;

    .line 89
    .line 90
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget-boolean p1, p1, Lkd1;->r:Z

    .line 95
    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    iget-boolean p1, v0, Lv61;->k:Z

    .line 99
    .line 100
    if-nez p1, :cond_2

    .line 101
    .line 102
    iget-boolean p1, v0, Lv61;->j:Z

    .line 103
    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    :cond_2
    invoke-virtual {p0}, Lmf1;->requestLayout()V

    .line 107
    .line 108
    .line 109
    :cond_3
    const/4 p1, 0x1

    .line 110
    iput-boolean p1, p0, Lmf1;->r:Z

    .line 111
    .line 112
    return-void
.end method

.method public final requestLayout()V
    .locals 1

    .line 1
    iget-object p0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object p0, p0, Lv61;->a:Lr61;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lr61;->U(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final t0(J)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object v1, v0, Lv61;->a:Lr61;

    .line 4
    .line 5
    iget-object v2, v0, Lv61;->a:Lr61;

    .line 6
    .line 7
    :try_start_0
    iget-boolean v3, v1, Lr61;->X:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    const-string v3, "measure is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v3}, Lkz0;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-static {v2}, Lu61;->a(Lr61;)Lzv1;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v2}, Lr61;->u()Lr61;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-boolean v5, v2, Lr61;->L:Z

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    iget-boolean v4, v4, Lr61;->L:Z

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v4, v7

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    :goto_1
    move v4, v6

    .line 44
    :goto_2
    iput-boolean v4, v2, Lr61;->L:Z

    .line 45
    .line 46
    invoke-virtual {v2}, Lr61;->q()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_4

    .line 51
    .line 52
    iget-wide v4, p0, Lsz1;->k:J

    .line 53
    .line 54
    invoke-static {v4, v5, p1, p2}, Lfz;->b(JJ)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    check-cast v3, Lb7;

    .line 62
    .line 63
    invoke-virtual {v3, v2, v7}, Lb7;->l(Lr61;Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lr61;->X()V

    .line 67
    .line 68
    .line 69
    return v7

    .line 70
    :cond_4
    :goto_3
    iget-object v3, p0, Lmf1;->D:Ls61;

    .line 71
    .line 72
    iput-boolean v7, v3, Ls61;->d:Z

    .line 73
    .line 74
    invoke-virtual {v2}, Lr61;->y()Lzk1;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-object v4, v3, Lzk1;->h:[Ljava/lang/Object;

    .line 79
    .line 80
    iget v3, v3, Lzk1;->j:I

    .line 81
    .line 82
    move v5, v7

    .line 83
    :goto_4
    if-ge v5, v3, :cond_5

    .line 84
    .line 85
    aget-object v8, v4, v5

    .line 86
    .line 87
    check-cast v8, Lr61;

    .line 88
    .line 89
    iget-object v8, v8, Lr61;->N:Lv61;

    .line 90
    .line 91
    iget-object v8, v8, Lv61;->p:Lmf1;

    .line 92
    .line 93
    iget-object v8, v8, Lmf1;->D:Ls61;

    .line 94
    .line 95
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    add-int/lit8 v5, v5, 0x1

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_5
    iput-boolean v6, p0, Lmf1;->q:Z

    .line 102
    .line 103
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    iget-wide v3, v3, Lsz1;->j:J

    .line 108
    .line 109
    invoke-virtual {p0, p1, p2}, Lsz1;->k0(J)V

    .line 110
    .line 111
    .line 112
    iget-object v5, v0, Lv61;->d:Ln61;

    .line 113
    .line 114
    sget-object v8, Ln61;->l:Ln61;

    .line 115
    .line 116
    if-ne v5, v8, :cond_6

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_6
    const-string v5, "layout state is not idle before measure starts"

    .line 120
    .line 121
    invoke-static {v5}, Lkz0;->b(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :goto_5
    iput-wide p1, p0, Lmf1;->H:J

    .line 125
    .line 126
    sget-object p1, Ln61;->h:Ln61;

    .line 127
    .line 128
    iput-object p1, v0, Lv61;->d:Ln61;

    .line 129
    .line 130
    iput-boolean v7, p0, Lmf1;->A:Z

    .line 131
    .line 132
    invoke-static {v2}, Lu61;->a(Lr61;)Lzv1;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    check-cast p2, Lb7;

    .line 137
    .line 138
    invoke-virtual {p2}, Lb7;->getSnapshotObserver()Lbw1;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    iget-object v5, p0, Lmf1;->I:Llf1;

    .line 143
    .line 144
    iget-object v9, p2, Lbw1;->c:Loq0;

    .line 145
    .line 146
    iget-object p2, p2, Lbw1;->a:Lts2;

    .line 147
    .line 148
    invoke-virtual {p2, v2, v9, v5}, Lts2;->c(Ljava/lang/Object;Lin0;Lxm0;)V

    .line 149
    .line 150
    .line 151
    iget-object p2, v0, Lv61;->d:Ln61;

    .line 152
    .line 153
    if-ne p2, p1, :cond_7

    .line 154
    .line 155
    iput-boolean v6, p0, Lmf1;->B:Z

    .line 156
    .line 157
    iput-boolean v6, p0, Lmf1;->C:Z

    .line 158
    .line 159
    iput-object v8, v0, Lv61;->d:Ln61;

    .line 160
    .line 161
    :cond_7
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iget-wide p1, p1, Lsz1;->j:J

    .line 166
    .line 167
    invoke-static {p1, p2, v3, v4}, Lh11;->a(JJ)Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-eqz p1, :cond_9

    .line 172
    .line 173
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iget p1, p1, Lsz1;->h:I

    .line 178
    .line 179
    iget p2, p0, Lsz1;->h:I

    .line 180
    .line 181
    if-ne p1, p2, :cond_9

    .line 182
    .line 183
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iget p1, p1, Lsz1;->i:I

    .line 188
    .line 189
    iget p2, p0, Lsz1;->i:I

    .line 190
    .line 191
    if-eq p1, p2, :cond_8

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_8
    move v6, v7

    .line 195
    :cond_9
    :goto_6
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    iget p1, p1, Lsz1;->h:I

    .line 200
    .line 201
    invoke-virtual {v0}, Lv61;->a()Lzn1;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    iget p2, p2, Lsz1;->i:I

    .line 206
    .line 207
    int-to-long v2, p1

    .line 208
    const/16 p1, 0x20

    .line 209
    .line 210
    shl-long/2addr v2, p1

    .line 211
    int-to-long p1, p2

    .line 212
    const-wide v4, 0xffffffffL

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    and-long/2addr p1, v4

    .line 218
    or-long/2addr p1, v2

    .line 219
    invoke-virtual {p0, p1, p2}, Lsz1;->g0(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    .line 221
    .line 222
    return v6

    .line 223
    :goto_7
    invoke-virtual {v1, p0}, Lr61;->Y(Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    const/4 p0, 0x0

    .line 227
    throw p0
.end method

.method public final v0()V
    .locals 3

    .line 1
    iget-object p0, p0, Lmf1;->m:Lv61;

    .line 2
    .line 3
    iget-object v0, p0, Lv61;->a:Lr61;

    .line 4
    .line 5
    iget-object v1, p0, Lv61;->a:Lr61;

    .line 6
    .line 7
    invoke-virtual {v0}, Lr61;->I()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget p0, p0, Lv61;->l:I

    .line 14
    .line 15
    if-lez p0, :cond_2

    .line 16
    .line 17
    iget-object p0, v1, Lr61;->N:Lv61;

    .line 18
    .line 19
    iget-boolean v0, p0, Lv61;->j:Z

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-boolean v0, p0, Lv61;->k:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    :cond_0
    iget-object p0, p0, Lv61;->p:Lmf1;

    .line 29
    .line 30
    iget-boolean p0, p0, Lmf1;->B:Z

    .line 31
    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lr61;->U(Z)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v1}, Lr61;->y()Lzk1;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-object v0, p0, Lzk1;->h:[Ljava/lang/Object;

    .line 42
    .line 43
    iget p0, p0, Lzk1;->j:I

    .line 44
    .line 45
    :goto_0
    if-ge v2, p0, :cond_2

    .line 46
    .line 47
    aget-object v1, v0, v2

    .line 48
    .line 49
    check-cast v1, Lr61;

    .line 50
    .line 51
    iget-object v1, v1, Lr61;->N:Lv61;

    .line 52
    .line 53
    iget-object v1, v1, Lv61;->p:Lmf1;

    .line 54
    .line 55
    invoke-virtual {v1}, Lmf1;->v0()V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void
.end method
