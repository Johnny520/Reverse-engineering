.class public final Lwd0;
.super Lxq0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsd0;
.implements Lt2;
.implements Lcg0;


# instance fields
.field public final A:Lsh0;

.field public B:Z

.field public C:Z

.field public D:J

.field public final E:Lvd0;

.field public final F:Lvd0;

.field public G:F

.field public H:Z

.field public I:Lsw;

.field public J:J

.field public K:F

.field public final L:Lvd0;

.field public M:Z

.field public final i:Lf60;

.field public j:Z

.field public k:I

.field public l:I

.field public m:Z

.field public n:Z

.field public o:Lz50;

.field public p:J

.field public q:Lsw;

.field public r:F

.field public s:Z

.field public t:Ljava/lang/Object;

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Z

.field public final z:Lc60;


# direct methods
.method public constructor <init>(Lf60;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lxq0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwd0;->i:Lf60;

    .line 5
    .line 6
    const p1, 0x7fffffff

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lwd0;->k:I

    .line 10
    .line 11
    iput p1, p0, Lwd0;->l:I

    .line 12
    .line 13
    sget-object p1, Lz50;->f:Lz50;

    .line 14
    .line 15
    iput-object p1, p0, Lwd0;->o:Lz50;

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    iput-wide v0, p0, Lwd0;->p:J

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lwd0;->s:Z

    .line 23
    .line 24
    new-instance v2, Lc60;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v2, p0, v3}, Lc60;-><init>(Lt2;I)V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Lwd0;->z:Lc60;

    .line 31
    .line 32
    new-instance v2, Lsh0;

    .line 33
    .line 34
    const/16 v4, 0x10

    .line 35
    .line 36
    new-array v4, v4, [Lwd0;

    .line 37
    .line 38
    invoke-direct {v2, v4}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, Lwd0;->A:Lsh0;

    .line 42
    .line 43
    iput-boolean p1, p0, Lwd0;->B:Z

    .line 44
    .line 45
    const/16 v2, 0xf

    .line 46
    .line 47
    invoke-static {v3, v3, v2}, Lqj;->b(III)J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    iput-wide v4, p0, Lwd0;->D:J

    .line 52
    .line 53
    new-instance v2, Lvd0;

    .line 54
    .line 55
    invoke-direct {v2, p0, p1}, Lvd0;-><init>(Lwd0;I)V

    .line 56
    .line 57
    .line 58
    iput-object v2, p0, Lwd0;->E:Lvd0;

    .line 59
    .line 60
    new-instance p1, Lvd0;

    .line 61
    .line 62
    invoke-direct {p1, p0, v3}, Lvd0;-><init>(Lwd0;I)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lwd0;->F:Lvd0;

    .line 66
    .line 67
    iput-wide v0, p0, Lwd0;->J:J

    .line 68
    .line 69
    new-instance p1, Lvd0;

    .line 70
    .line 71
    const/4 v0, 0x2

    .line 72
    invoke-direct {p1, p0, v0}, Lvd0;-><init>(Lwd0;I)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lwd0;->L:Lvd0;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final I(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object v1, v0, Lf60;->a:Lb60;

    .line 4
    .line 5
    invoke-static {v1}, Lg60;->p(Lb60;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Lf60;->q:Lec0;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lec0;->I(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lwd0;->g0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0, p1}, Lsd0;->I(I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final L()I
    .locals 0

    .line 1
    iget p0, p0, Lwd0;->l:I

    .line 2
    .line 3
    return p0
.end method

.method public final N()V
    .locals 2

    .line 1
    iget-object p0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object p0, p0, Lf60;->a:Lb60;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-static {p0, v0, v1}, Lb60;->X(Lb60;ZI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final O(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object v1, v0, Lf60;->a:Lb60;

    .line 4
    .line 5
    invoke-static {v1}, Lg60;->p(Lb60;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Lf60;->q:Lec0;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lec0;->O(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lwd0;->g0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0, p1}, Lsd0;->O(I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final R(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object v1, v0, Lf60;->a:Lb60;

    .line 4
    .line 5
    invoke-static {v1}, Lg60;->p(Lb60;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Lf60;->q:Lec0;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lec0;->R(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lwd0;->g0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0, p1}, Lsd0;->R(I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final S()I
    .locals 0

    .line 1
    iget-object p0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    invoke-virtual {p0}, Lf60;->a()Lqj0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lxq0;->S()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final U()I
    .locals 0

    .line 1
    iget-object p0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    invoke-virtual {p0}, Lf60;->a()Lqj0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lxq0;->U()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final X(JFLsw;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object v1, v0, Lf60;->a:Lb60;

    .line 4
    .line 5
    iget-object v2, v0, Lf60;->a:Lb60;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    :try_start_0
    iput-boolean v3, p0, Lwd0;->v:Z

    .line 9
    .line 10
    iget-wide v4, p0, Lwd0;->p:J

    .line 11
    .line 12
    invoke-static {p1, p2, v4, v5}, Lw20;->a(JJ)Z

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
    iget-boolean v4, p0, Lwd0;->M:Z

    .line 20
    .line 21
    if-eqz v4, :cond_3

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_0
    :goto_0
    iget-boolean v4, v0, Lf60;->k:Z

    .line 28
    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    iget-boolean v4, v0, Lf60;->j:Z

    .line 32
    .line 33
    if-nez v4, :cond_1

    .line 34
    .line 35
    iget-boolean v4, p0, Lwd0;->M:Z

    .line 36
    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    :cond_1
    iput-boolean v3, p0, Lwd0;->x:Z

    .line 40
    .line 41
    iput-boolean v5, p0, Lwd0;->M:Z

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, Lwd0;->e0()V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget-object v4, v0, Lf60;->q:Lec0;

    .line 47
    .line 48
    if-eqz v4, :cond_5

    .line 49
    .line 50
    iget-object v6, v4, Lec0;->i:Lf60;

    .line 51
    .line 52
    iget-object v4, v4, Lec0;->s:Lcc0;

    .line 53
    .line 54
    sget-object v7, Lcc0;->f:Lcc0;

    .line 55
    .line 56
    if-ne v4, v7, :cond_5

    .line 57
    .line 58
    iget-object v4, v6, Lf60;->a:Lb60;

    .line 59
    .line 60
    invoke-static {v4}, Lg60;->p(Lb60;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_4

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    iput-boolean v3, v6, Lf60;->c:Z

    .line 68
    .line 69
    :cond_5
    :goto_1
    iget-object v4, v0, Lf60;->q:Lec0;

    .line 70
    .line 71
    if-eqz v4, :cond_9

    .line 72
    .line 73
    invoke-virtual {v4}, Lec0;->b0()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-ne v4, v3, :cond_9

    .line 78
    .line 79
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    iget-object v3, v3, Lqj0;->t:Lqj0;

    .line 84
    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    iget-object v3, v3, Lyb0;->o:Lzb0;

    .line 88
    .line 89
    if-nez v3, :cond_7

    .line 90
    .line 91
    :cond_6
    invoke-static {v2}, Le60;->a(Lb60;)Ldn0;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lw3;

    .line 96
    .line 97
    invoke-virtual {v3}, Lw3;->getPlacementScope()Lwq0;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    :cond_7
    iget-object v4, v0, Lf60;->q:Lec0;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Lb60;->v()Lb60;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-eqz v2, :cond_8

    .line 111
    .line 112
    iget-object v2, v2, Lb60;->J:Lf60;

    .line 113
    .line 114
    iput v5, v2, Lf60;->h:I

    .line 115
    .line 116
    :cond_8
    const v2, 0x7fffffff

    .line 117
    .line 118
    .line 119
    iput v2, v4, Lec0;->l:I

    .line 120
    .line 121
    const/16 v2, 0x20

    .line 122
    .line 123
    shr-long v5, p1, v2

    .line 124
    .line 125
    long-to-int v2, v5

    .line 126
    const-wide v5, 0xffffffffL

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    and-long/2addr v5, p1

    .line 132
    long-to-int v5, v5

    .line 133
    invoke-static {v3, v4, v2, v5}, Lwq0;->i(Lwq0;Lxq0;II)V

    .line 134
    .line 135
    .line 136
    :cond_9
    iget-object v0, v0, Lf60;->q:Lec0;

    .line 137
    .line 138
    if-eqz v0, :cond_a

    .line 139
    .line 140
    iget-boolean v0, v0, Lec0;->n:Z

    .line 141
    .line 142
    if-nez v0, :cond_a

    .line 143
    .line 144
    const-string v0, "Error: Placement happened before lookahead."

    .line 145
    .line 146
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_a
    invoke-virtual {p0, p1, p2, p3, p4}, Lwd0;->l0(JFLsw;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :goto_2
    invoke-virtual {v1, p0}, Lb60;->a0(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    const/4 p0, 0x0

    .line 157
    throw p0
.end method

.method public final a()Lc60;
    .locals 0

    .line 1
    iget-object p0, p0, Lwd0;->z:Lc60;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b0()Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object v1, v0, Lf60;->a:Lb60;

    .line 4
    .line 5
    invoke-virtual {v1}, Lb60;->h0()V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lwd0;->B:Z

    .line 9
    .line 10
    iget-object v2, p0, Lwd0;->A:Lsh0;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, Lsh0;->f()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    iget-object v0, v0, Lf60;->a:Lb60;

    .line 20
    .line 21
    invoke-virtual {v0}, Lb60;->z()Lsh0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v3, v1, Lsh0;->d:[Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v1, Lsh0;->f:I

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
    check-cast v6, Lb60;

    .line 36
    .line 37
    iget v7, v2, Lsh0;->f:I

    .line 38
    .line 39
    if-gt v7, v5, :cond_1

    .line 40
    .line 41
    iget-object v6, v6, Lb60;->J:Lf60;

    .line 42
    .line 43
    iget-object v6, v6, Lf60;->p:Lwd0;

    .line 44
    .line 45
    invoke-virtual {v2, v6}, Lsh0;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v6, v6, Lb60;->J:Lf60;

    .line 50
    .line 51
    iget-object v6, v6, Lf60;->p:Lwd0;

    .line 52
    .line 53
    iget-object v7, v2, Lsh0;->d:[Ljava/lang/Object;

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
    invoke-virtual {v0}, Lb60;->n()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lph0;

    .line 67
    .line 68
    iget-object v0, v0, Lph0;->d:Lsh0;

    .line 69
    .line 70
    iget v0, v0, Lsh0;->f:I

    .line 71
    .line 72
    iget v1, v2, Lsh0;->f:I

    .line 73
    .line 74
    invoke-virtual {v2, v0, v1}, Lsh0;->l(II)V

    .line 75
    .line 76
    .line 77
    iput-boolean v4, p0, Lwd0;->B:Z

    .line 78
    .line 79
    invoke-virtual {v2}, Lsh0;->f()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method

.method public final c0()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lwd0;->u:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lwd0;->u:Z

    .line 5
    .line 6
    iget-object p0, p0, Lwd0;->i:Lf60;

    .line 7
    .line 8
    iget-object v2, p0, Lf60;->a:Lb60;

    .line 9
    .line 10
    iget-object v3, v2, Lb60;->I:Lmj0;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v3, Lmj0;->c:Lc20;

    .line 15
    .line 16
    invoke-virtual {v0}, Lqj0;->S0()V

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Le60;->a(Lb60;)Ldn0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lw3;

    .line 24
    .line 25
    invoke-virtual {v0}, Lw3;->getRectManager()Lut0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object p0, p0, Lf60;->a:Lb60;

    .line 30
    .line 31
    invoke-virtual {v0, p0, v1}, Lut0;->f(Lb60;Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lb60;->r()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    const/4 v0, 0x6

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    invoke-static {v2, v1, v0}, Lb60;->X(Lb60;ZI)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object p0, v2, Lb60;->J:Lf60;

    .line 46
    .line 47
    iget-boolean p0, p0, Lf60;->e:Z

    .line 48
    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    invoke-static {v2, v1, v0}, Lb60;->V(Lb60;ZI)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    iget-object p0, v3, Lmj0;->d:Lqj0;

    .line 55
    .line 56
    iget-object v0, v3, Lmj0;->c:Lc20;

    .line 57
    .line 58
    iget-object v0, v0, Lqj0;->s:Lqj0;

    .line 59
    .line 60
    :goto_1
    invoke-static {p0, v0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_3

    .line 65
    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    iget-boolean v1, p0, Lqj0;->N:Z

    .line 69
    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, Lqj0;->N0()V

    .line 73
    .line 74
    .line 75
    :cond_2
    iget-object p0, p0, Lqj0;->s:Lqj0;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-virtual {v2}, Lb60;->z()Lsh0;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget-object v0, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 83
    .line 84
    iget p0, p0, Lsh0;->f:I

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    :goto_2
    if-ge v1, p0, :cond_5

    .line 88
    .line 89
    aget-object v2, v0, v1

    .line 90
    .line 91
    check-cast v2, Lb60;

    .line 92
    .line 93
    invoke-virtual {v2}, Lb60;->w()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    const v4, 0x7fffffff

    .line 98
    .line 99
    .line 100
    if-eq v3, v4, :cond_4

    .line 101
    .line 102
    iget-object v3, v2, Lb60;->J:Lf60;

    .line 103
    .line 104
    iget-object v3, v3, Lf60;->p:Lwd0;

    .line 105
    .line 106
    invoke-virtual {v3}, Lwd0;->c0()V

    .line 107
    .line 108
    .line 109
    invoke-static {v2}, Lb60;->Y(Lb60;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    return-void
.end method

.method public final d0()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lwd0;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lwd0;->u:Z

    .line 7
    .line 8
    iget-object p0, p0, Lwd0;->i:Lf60;

    .line 9
    .line 10
    iget-object v1, p0, Lf60;->a:Lb60;

    .line 11
    .line 12
    iget-object p0, p0, Lf60;->a:Lb60;

    .line 13
    .line 14
    invoke-static {v1}, Le60;->a(Lb60;)Ldn0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lw3;

    .line 19
    .line 20
    invoke-virtual {v1}, Lw3;->getRectManager()Lut0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p0}, Lut0;->h(Lb60;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lb60;->I:Lmj0;

    .line 28
    .line 29
    iget-object v2, v1, Lmj0;->d:Lqj0;

    .line 30
    .line 31
    iget-object v1, v1, Lmj0;->c:Lc20;

    .line 32
    .line 33
    iget-object v1, v1, Lqj0;->s:Lqj0;

    .line 34
    .line 35
    :goto_0
    invoke-static {v2, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {v2}, Lqj0;->U0()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lqj0;->Z0()V

    .line 47
    .line 48
    .line 49
    iget-object v2, v2, Lqj0;->s:Lqj0;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p0}, Lb60;->z()Lsh0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    iget-object v1, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 57
    .line 58
    iget p0, p0, Lsh0;->f:I

    .line 59
    .line 60
    :goto_1
    if-ge v0, p0, :cond_1

    .line 61
    .line 62
    aget-object v2, v1, v0

    .line 63
    .line 64
    check-cast v2, Lb60;

    .line 65
    .line 66
    iget-object v2, v2, Lb60;->J:Lf60;

    .line 67
    .line 68
    iget-object v2, v2, Lf60;->p:Lwd0;

    .line 69
    .line 70
    invoke-virtual {v2}, Lwd0;->d0()V

    .line 71
    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    return-void
.end method

.method public final e(J)Lxq0;
    .locals 5

    .line 1
    iget-object v0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object v1, v0, Lf60;->a:Lb60;

    .line 4
    .line 5
    iget-object v2, v0, Lf60;->a:Lb60;

    .line 6
    .line 7
    iget-object v3, v1, Lb60;->F:Lz50;

    .line 8
    .line 9
    sget-object v4, Lz50;->f:Lz50;

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lb60;->e()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {v2}, Lg60;->p(Lb60;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Lf60;->q:Lec0;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iput-object v4, v0, Lec0;->m:Lz50;

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Lec0;->e(J)Lxq0;

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {v2}, Lb60;->v()Lb60;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_6

    .line 37
    .line 38
    iget-object v0, v0, Lb60;->J:Lf60;

    .line 39
    .line 40
    iget-object v1, p0, Lwd0;->o:Lz50;

    .line 41
    .line 42
    if-eq v1, v4, :cond_3

    .line 43
    .line 44
    iget-boolean v1, v2, Lb60;->H:Z

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
    invoke-static {v1}, Lw10;->b(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_0
    iget-object v1, v0, Lf60;->d:Lx50;

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
    sget-object v0, Lz50;->e:Lz50;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    const-string p0, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    .line 69
    .line 70
    iget-object p1, v0, Lf60;->d:Lx50;

    .line 71
    .line 72
    invoke-static {p1, p0}, Lxc;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return-object p0

    .line 77
    :cond_5
    sget-object v0, Lz50;->d:Lz50;

    .line 78
    .line 79
    :goto_1
    iput-object v0, p0, Lwd0;->o:Lz50;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_6
    iput-object v4, p0, Lwd0;->o:Lz50;

    .line 83
    .line 84
    :goto_2
    invoke-virtual {p0, p1, p2}, Lwd0;->m0(J)Z

    .line 85
    .line 86
    .line 87
    return-object p0
.end method

.method public final e0()V
    .locals 7

    .line 1
    iget-object p0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget v0, p0, Lf60;->l:I

    .line 4
    .line 5
    if-lez v0, :cond_2

    .line 6
    .line 7
    iget-object p0, p0, Lf60;->a:Lb60;

    .line 8
    .line 9
    invoke-virtual {p0}, Lb60;->z()Lsh0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object v0, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 14
    .line 15
    iget p0, p0, Lsh0;->f:I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    move v2, v1

    .line 19
    :goto_0
    if-ge v2, p0, :cond_2

    .line 20
    .line 21
    aget-object v3, v0, v2

    .line 22
    .line 23
    check-cast v3, Lb60;

    .line 24
    .line 25
    iget-object v4, v3, Lb60;->J:Lf60;

    .line 26
    .line 27
    iget-boolean v5, v4, Lf60;->j:Z

    .line 28
    .line 29
    iget-object v6, v4, Lf60;->p:Lwd0;

    .line 30
    .line 31
    if-nez v5, :cond_0

    .line 32
    .line 33
    iget-boolean v4, v4, Lf60;->k:Z

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    :cond_0
    iget-boolean v4, v6, Lwd0;->x:Z

    .line 38
    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v3, v1}, Lb60;->W(Z)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v6}, Lwd0;->e0()V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    return-void
.end method

.method public final f(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object v1, v0, Lf60;->a:Lb60;

    .line 4
    .line 5
    invoke-static {v1}, Lg60;->p(Lb60;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Lf60;->q:Lec0;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lec0;->f(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lwd0;->g0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0, p1}, Lsd0;->f(I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final g0()V
    .locals 3

    .line 1
    iget-object p0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object v0, p0, Lf60;->a:Lb60;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x7

    .line 7
    invoke-static {v0, v1, v2}, Lb60;->X(Lb60;ZI)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lf60;->a:Lb60;

    .line 11
    .line 12
    invoke-virtual {p0}, Lb60;->v()Lb60;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v1, p0, Lb60;->F:Lz50;

    .line 19
    .line 20
    sget-object v2, Lz50;->f:Lz50;

    .line 21
    .line 22
    if-ne v1, v2, :cond_2

    .line 23
    .line 24
    iget-object v1, v0, Lb60;->J:Lf60;

    .line 25
    .line 26
    iget-object v1, v1, Lf60;->d:Lx50;

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
    iget-object v0, v0, Lb60;->F:Lz50;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object v0, Lz50;->e:Lz50;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget-object v0, Lz50;->d:Lz50;

    .line 44
    .line 45
    :goto_0
    iput-object v0, p0, Lb60;->F:Lz50;

    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public final j()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lwd0;->t:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k0()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lwd0;->H:Z

    .line 3
    .line 4
    iget-object v1, p0, Lwd0;->i:Lf60;

    .line 5
    .line 6
    iget-object v2, v1, Lf60;->a:Lb60;

    .line 7
    .line 8
    invoke-virtual {v2}, Lb60;->v()Lb60;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p0}, Lwd0;->r()Lc20;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget v3, v3, Lqj0;->D:F

    .line 17
    .line 18
    iget-object v1, v1, Lf60;->a:Lb60;

    .line 19
    .line 20
    iget-object v4, v1, Lb60;->I:Lmj0;

    .line 21
    .line 22
    iget-object v5, v4, Lmj0;->d:Lqj0;

    .line 23
    .line 24
    iget-object v4, v4, Lmj0;->c:Lc20;

    .line 25
    .line 26
    :goto_0
    if-eq v5, v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast v5, Lt50;

    .line 32
    .line 33
    iget v6, v5, Lqj0;->D:F

    .line 34
    .line 35
    add-float/2addr v3, v6

    .line 36
    iget-object v5, v5, Lqj0;->s:Lqj0;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget v4, p0, Lwd0;->G:F

    .line 40
    .line 41
    cmpg-float v4, v3, v4

    .line 42
    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iput v3, p0, Lwd0;->G:F

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {v2}, Lb60;->O()V

    .line 51
    .line 52
    .line 53
    :cond_2
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, Lb60;->C()V

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lwd0;->r()Lc20;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-boolean v3, v3, Lyb0;->n:Z

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    if-nez v3, :cond_8

    .line 66
    .line 67
    iget-boolean v3, p0, Lwd0;->u:Z

    .line 68
    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    iget-object v5, p0, Lwd0;->z:Lc60;

    .line 72
    .line 73
    invoke-virtual {v5}, Lc60;->d()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    :cond_4
    invoke-virtual {p0}, Lwd0;->c0()V

    .line 80
    .line 81
    .line 82
    :cond_5
    if-nez v3, :cond_7

    .line 83
    .line 84
    if-eqz v2, :cond_6

    .line 85
    .line 86
    invoke-virtual {v2}, Lb60;->C()V

    .line 87
    .line 88
    .line 89
    :cond_6
    iget-boolean v1, p0, Lwd0;->j:Z

    .line 90
    .line 91
    if-eqz v1, :cond_8

    .line 92
    .line 93
    if-eqz v2, :cond_8

    .line 94
    .line 95
    invoke-virtual {v2, v4}, Lb60;->W(Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_7
    iget-object v1, v1, Lb60;->I:Lmj0;

    .line 100
    .line 101
    iget-object v1, v1, Lmj0;->c:Lc20;

    .line 102
    .line 103
    invoke-virtual {v1}, Lqj0;->S0()V

    .line 104
    .line 105
    .line 106
    :cond_8
    :goto_2
    if-eqz v2, :cond_a

    .line 107
    .line 108
    iget-object v1, v2, Lb60;->J:Lf60;

    .line 109
    .line 110
    iget-boolean v2, p0, Lwd0;->j:Z

    .line 111
    .line 112
    if-nez v2, :cond_b

    .line 113
    .line 114
    iget-object v2, v1, Lf60;->d:Lx50;

    .line 115
    .line 116
    sget-object v3, Lx50;->f:Lx50;

    .line 117
    .line 118
    if-ne v2, v3, :cond_b

    .line 119
    .line 120
    iget v2, p0, Lwd0;->l:I

    .line 121
    .line 122
    const v3, 0x7fffffff

    .line 123
    .line 124
    .line 125
    if-ne v2, v3, :cond_9

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_9
    const-string v2, "Place was called on a node which was placed already"

    .line 129
    .line 130
    invoke-static {v2}, Lw10;->b(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :goto_3
    iget v2, v1, Lf60;->i:I

    .line 134
    .line 135
    iput v2, p0, Lwd0;->l:I

    .line 136
    .line 137
    add-int/2addr v2, v0

    .line 138
    iput v2, v1, Lf60;->i:I

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_a
    iput v4, p0, Lwd0;->l:I

    .line 142
    .line 143
    :cond_b
    :goto_4
    invoke-virtual {p0}, Lwd0;->u()V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final l(Ls2;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object p0, p0, Lf60;->a:Lb60;

    .line 4
    .line 5
    invoke-virtual {p0}, Lb60;->z()Lsh0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object v0, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 10
    .line 11
    iget p0, p0, Lsh0;->f:I

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
    check-cast v2, Lb60;

    .line 19
    .line 20
    iget-object v2, v2, Lb60;->J:Lf60;

    .line 21
    .line 22
    iget-object v2, v2, Lf60;->p:Lwd0;

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Ls2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final l0(JFLsw;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object v1, v0, Lf60;->a:Lb60;

    .line 4
    .line 5
    iget-object v2, v0, Lf60;->a:Lb60;

    .line 6
    .line 7
    iget-boolean v1, v1, Lb60;->R:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v1, "place is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v1}, Lw10;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object v1, Lx50;->f:Lx50;

    .line 17
    .line 18
    iput-object v1, v0, Lf60;->d:Lx50;

    .line 19
    .line 20
    iput-wide p1, p0, Lwd0;->p:J

    .line 21
    .line 22
    iput p3, p0, Lwd0;->r:F

    .line 23
    .line 24
    iput-object p4, p0, Lwd0;->q:Lsw;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-boolean v1, p0, Lwd0;->H:Z

    .line 28
    .line 29
    invoke-static {v2}, Le60;->a(Lb60;)Ldn0;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-boolean v4, p0, Lwd0;->x:Z

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    iget-boolean v4, p0, Lwd0;->u:Z

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-wide v2, v1, Lxq0;->h:J

    .line 46
    .line 47
    invoke-static {p1, p2, v2, v3}, Lw20;->c(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    invoke-virtual {v1, p1, p2, p3, p4}, Lqj0;->X0(JFLsw;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lwd0;->k0()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v4, p0, Lwd0;->z:Lc60;

    .line 59
    .line 60
    iput-boolean v1, v4, Lc60;->e:Z

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lf60;->f(Z)V

    .line 63
    .line 64
    .line 65
    iput-object p4, p0, Lwd0;->I:Lsw;

    .line 66
    .line 67
    iput-wide p1, p0, Lwd0;->J:J

    .line 68
    .line 69
    iput p3, p0, Lwd0;->K:F

    .line 70
    .line 71
    check-cast v3, Lw3;

    .line 72
    .line 73
    invoke-virtual {v3}, Lw3;->getSnapshotObserver()Lfn0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object p2, p1, Lfn0;->f:Lp3;

    .line 78
    .line 79
    iget-object p1, p1, Lfn0;->a:Le31;

    .line 80
    .line 81
    iget-object p3, p0, Lwd0;->L:Lvd0;

    .line 82
    .line 83
    invoke-virtual {p1, v2, p2, p3}, Le31;->b(Ljava/lang/Object;Lsw;Lhw;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    sget-object p1, Lx50;->h:Lx50;

    .line 87
    .line 88
    iput-object p1, v0, Lf60;->d:Lx50;

    .line 89
    .line 90
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget-boolean p1, p1, Lyb0;->n:Z

    .line 95
    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    iget-boolean p1, v0, Lf60;->k:Z

    .line 99
    .line 100
    if-nez p1, :cond_2

    .line 101
    .line 102
    iget-boolean p1, v0, Lf60;->j:Z

    .line 103
    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    :cond_2
    invoke-virtual {p0}, Lwd0;->requestLayout()V

    .line 107
    .line 108
    .line 109
    :cond_3
    const/4 p1, 0x1

    .line 110
    iput-boolean p1, p0, Lwd0;->n:Z

    .line 111
    .line 112
    return-void
.end method

.method public final m0(J)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object v1, v0, Lf60;->a:Lb60;

    .line 4
    .line 5
    iget-object v2, v0, Lf60;->a:Lb60;

    .line 6
    .line 7
    :try_start_0
    iget-boolean v3, v1, Lb60;->R:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    const-string v3, "measure is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v3}, Lw10;->a(Ljava/lang/String;)V

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
    invoke-static {v2}, Le60;->a(Lb60;)Ldn0;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v2}, Lb60;->v()Lb60;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-boolean v5, v2, Lb60;->H:Z

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
    iget-boolean v4, v4, Lb60;->H:Z

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
    iput-boolean v4, v2, Lb60;->H:Z

    .line 45
    .line 46
    invoke-virtual {v2}, Lb60;->r()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_4

    .line 51
    .line 52
    iget-wide v4, p0, Lxq0;->g:J

    .line 53
    .line 54
    invoke-static {v4, v5, p1, p2}, Lpj;->b(JJ)Z

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
    check-cast v3, Lw3;

    .line 62
    .line 63
    invoke-virtual {v3, v2, v7}, Lw3;->k(Lb60;Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lb60;->Z()V

    .line 67
    .line 68
    .line 69
    return v7

    .line 70
    :cond_4
    :goto_3
    iget-object v3, p0, Lwd0;->z:Lc60;

    .line 71
    .line 72
    iput-boolean v7, v3, Lc60;->d:Z

    .line 73
    .line 74
    invoke-virtual {v2}, Lb60;->z()Lsh0;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-object v4, v3, Lsh0;->d:[Ljava/lang/Object;

    .line 79
    .line 80
    iget v3, v3, Lsh0;->f:I

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
    check-cast v8, Lb60;

    .line 88
    .line 89
    iget-object v8, v8, Lb60;->J:Lf60;

    .line 90
    .line 91
    iget-object v8, v8, Lf60;->p:Lwd0;

    .line 92
    .line 93
    iget-object v8, v8, Lwd0;->z:Lc60;

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
    iput-boolean v6, p0, Lwd0;->m:Z

    .line 102
    .line 103
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    iget-wide v3, v3, Lxq0;->f:J

    .line 108
    .line 109
    invoke-virtual {p0, p1, p2}, Lxq0;->a0(J)V

    .line 110
    .line 111
    .line 112
    iget-object v5, v0, Lf60;->d:Lx50;

    .line 113
    .line 114
    sget-object v8, Lx50;->h:Lx50;

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
    invoke-static {v5}, Lw10;->b(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :goto_5
    iput-wide p1, p0, Lwd0;->D:J

    .line 125
    .line 126
    sget-object p1, Lx50;->d:Lx50;

    .line 127
    .line 128
    iput-object p1, v0, Lf60;->d:Lx50;

    .line 129
    .line 130
    iput-boolean v7, p0, Lwd0;->w:Z

    .line 131
    .line 132
    invoke-static {v2}, Le60;->a(Lb60;)Ldn0;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    check-cast p2, Lw3;

    .line 137
    .line 138
    invoke-virtual {p2}, Lw3;->getSnapshotObserver()Lfn0;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    iget-object v5, p0, Lwd0;->E:Lvd0;

    .line 143
    .line 144
    iget-object v9, p2, Lfn0;->c:Lp3;

    .line 145
    .line 146
    iget-object p2, p2, Lfn0;->a:Le31;

    .line 147
    .line 148
    invoke-virtual {p2, v2, v9, v5}, Le31;->b(Ljava/lang/Object;Lsw;Lhw;)V

    .line 149
    .line 150
    .line 151
    iget-object p2, v0, Lf60;->d:Lx50;

    .line 152
    .line 153
    if-ne p2, p1, :cond_7

    .line 154
    .line 155
    iput-boolean v6, p0, Lwd0;->x:Z

    .line 156
    .line 157
    iput-boolean v6, p0, Lwd0;->y:Z

    .line 158
    .line 159
    iput-object v8, v0, Lf60;->d:Lx50;

    .line 160
    .line 161
    :cond_7
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iget-wide p1, p1, Lxq0;->f:J

    .line 166
    .line 167
    invoke-static {p1, p2, v3, v4}, Ld30;->a(JJ)Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-eqz p1, :cond_9

    .line 172
    .line 173
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iget p1, p1, Lxq0;->d:I

    .line 178
    .line 179
    iget p2, p0, Lxq0;->d:I

    .line 180
    .line 181
    if-ne p1, p2, :cond_9

    .line 182
    .line 183
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iget p1, p1, Lxq0;->e:I

    .line 188
    .line 189
    iget p2, p0, Lxq0;->e:I

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
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    iget p1, p1, Lxq0;->d:I

    .line 200
    .line 201
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    iget p2, p2, Lxq0;->e:I

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
    invoke-virtual {p0, p1, p2}, Lxq0;->Y(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    .line 221
    .line 222
    return v6

    .line 223
    :goto_7
    invoke-virtual {v1, p0}, Lb60;->a0(Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    const/4 p0, 0x0

    .line 227
    throw p0
.end method

.method public final n(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-boolean v1, v1, Lyb0;->l:Z

    .line 8
    .line 9
    if-eq p1, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lf60;->a()Lqj0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-boolean p1, v0, Lyb0;->l:Z

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lwd0;->M:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final r()Lc20;
    .locals 0

    .line 1
    iget-object p0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object p0, p0, Lf60;->a:Lb60;

    .line 4
    .line 5
    iget-object p0, p0, Lb60;->I:Lmj0;

    .line 6
    .line 7
    iget-object p0, p0, Lmj0;->c:Lc20;

    .line 8
    .line 9
    return-object p0
.end method

.method public final requestLayout()V
    .locals 1

    .line 1
    iget-object p0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object p0, p0, Lf60;->a:Lb60;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lb60;->W(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final s()Lt2;
    .locals 0

    .line 1
    iget-object p0, p0, Lwd0;->i:Lf60;

    .line 2
    .line 3
    iget-object p0, p0, Lf60;->a:Lb60;

    .line 4
    .line 5
    invoke-virtual {p0}, Lb60;->v()Lb60;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lb60;->J:Lf60;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lf60;->p:Lwd0;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public final u()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lwd0;->C:Z

    .line 3
    .line 4
    iget-object v0, p0, Lwd0;->z:Lc60;

    .line 5
    .line 6
    invoke-virtual {v0}, Lc60;->h()V

    .line 7
    .line 8
    .line 9
    iget-boolean v1, p0, Lwd0;->x:Z

    .line 10
    .line 11
    iget-object v2, p0, Lwd0;->i:Lf60;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v1, v2, Lf60;->a:Lb60;

    .line 17
    .line 18
    invoke-virtual {v1}, Lb60;->z()Lsh0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v4, v1, Lsh0;->d:[Ljava/lang/Object;

    .line 23
    .line 24
    iget v1, v1, Lsh0;->f:I

    .line 25
    .line 26
    move v5, v3

    .line 27
    :goto_0
    if-ge v5, v1, :cond_1

    .line 28
    .line 29
    aget-object v6, v4, v5

    .line 30
    .line 31
    check-cast v6, Lb60;

    .line 32
    .line 33
    invoke-virtual {v6}, Lb60;->r()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_0

    .line 38
    .line 39
    invoke-virtual {v6}, Lb60;->s()Lz50;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    sget-object v8, Lz50;->d:Lz50;

    .line 44
    .line 45
    if-ne v7, v8, :cond_0

    .line 46
    .line 47
    invoke-static {v6}, Lb60;->Q(Lb60;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    iget-object v6, v2, Lf60;->a:Lb60;

    .line 54
    .line 55
    const/4 v7, 0x7

    .line 56
    invoke-static {v6, v3, v7}, Lb60;->X(Lb60;ZI)V

    .line 57
    .line 58
    .line 59
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-boolean v1, p0, Lwd0;->y:Z

    .line 63
    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Lwd0;->r()Lc20;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-boolean v1, v1, Lyb0;->n:Z

    .line 71
    .line 72
    if-nez v1, :cond_3

    .line 73
    .line 74
    iget-boolean v1, p0, Lwd0;->x:Z

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    :cond_2
    iput-boolean v3, p0, Lwd0;->x:Z

    .line 79
    .line 80
    iget-object v1, v2, Lf60;->d:Lx50;

    .line 81
    .line 82
    sget-object v4, Lx50;->f:Lx50;

    .line 83
    .line 84
    iput-object v4, v2, Lf60;->d:Lx50;

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Lf60;->g(Z)V

    .line 87
    .line 88
    .line 89
    iget-object v4, v2, Lf60;->a:Lb60;

    .line 90
    .line 91
    invoke-static {v4}, Le60;->a(Lb60;)Ldn0;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, Lw3;

    .line 96
    .line 97
    invoke-virtual {v5}, Lw3;->getSnapshotObserver()Lfn0;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    iget-object v6, v5, Lfn0;->e:Lp3;

    .line 102
    .line 103
    iget-object v5, v5, Lfn0;->a:Le31;

    .line 104
    .line 105
    iget-object v7, p0, Lwd0;->F:Lvd0;

    .line 106
    .line 107
    invoke-virtual {v5, v4, v6, v7}, Le31;->b(Ljava/lang/Object;Lsw;Lhw;)V

    .line 108
    .line 109
    .line 110
    iput-object v1, v2, Lf60;->d:Lx50;

    .line 111
    .line 112
    iput-boolean v3, p0, Lwd0;->y:Z

    .line 113
    .line 114
    :cond_3
    iget-boolean v1, v0, Lc60;->b:Z

    .line 115
    .line 116
    if-eqz v1, :cond_4

    .line 117
    .line 118
    invoke-virtual {v0}, Lc60;->e()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_4

    .line 123
    .line 124
    invoke-virtual {v0}, Lc60;->g()V

    .line 125
    .line 126
    .line 127
    :cond_4
    iput-boolean v3, p0, Lwd0;->C:Z

    .line 128
    .line 129
    return-void
.end method
