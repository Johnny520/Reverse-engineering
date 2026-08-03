.class public abstract Lx1/i1;
.super Lx1/n0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/m0;
.implements Lv1/t;
.implements Lx1/s1;


# static fields
.field public static final T:Lf1/o0;

.field public static final U:Lx1/t;

.field public static final V:[F

.field public static final W:Lx1/c1;

.field public static final X:Lx1/d1;


# instance fields
.field public A:Lu2/c;

.field public B:Lu2/m;

.field public C:F

.field public D:Lv1/o0;

.field public E:Lf/b0;

.field public F:J

.field public G:F

.field public H:Le1/a;

.field public I:Lx1/t;

.field public J:Lf1/r0;

.field public K:Z

.field public L:Z

.field public M:Li1/b;

.field public N:Lf1/u;

.field public O:La1/g;

.field public final P:Lx1/f1;

.field public Q:Z

.field public R:Lx1/q1;

.field public S:Li1/b;

.field public final u:Lx1/f0;

.field public v:Lx1/i1;

.field public w:Lx1/i1;

.field public x:Z

.field public y:Z

.field public z:Lfg/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf1/o0;

    .line 2
    .line 3
    invoke-direct {v0}, Lf1/o0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx1/i1;->T:Lf1/o0;

    .line 7
    .line 8
    new-instance v0, Lx1/t;

    .line 9
    .line 10
    invoke-direct {v0}, Lx1/t;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lx1/i1;->U:Lx1/t;

    .line 14
    .line 15
    invoke-static {}, Lf1/i0;->a()[F

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lx1/i1;->V:[F

    .line 20
    .line 21
    new-instance v0, Lx1/c1;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lx1/i1;->W:Lx1/c1;

    .line 27
    .line 28
    new-instance v0, Lx1/d1;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lx1/i1;->X:Lx1/d1;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(Lx1/f0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lx1/n0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx1/i1;->u:Lx1/f0;

    .line 5
    .line 6
    iget-object v0, p1, Lx1/f0;->E:Lu2/c;

    .line 7
    .line 8
    iput-object v0, p0, Lx1/i1;->A:Lu2/c;

    .line 9
    .line 10
    iget-object p1, p1, Lx1/f0;->F:Lu2/m;

    .line 11
    .line 12
    iput-object p1, p0, Lx1/i1;->B:Lu2/m;

    .line 13
    .line 14
    const p1, 0x3f4ccccd    # 0.8f

    .line 15
    .line 16
    .line 17
    iput p1, p0, Lx1/i1;->C:F

    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    iput-wide v0, p0, Lx1/i1;->F:J

    .line 22
    .line 23
    sget-object p1, Lf1/c0;->b:Lf1/m0;

    .line 24
    .line 25
    iput-object p1, p0, Lx1/i1;->J:Lf1/r0;

    .line 26
    .line 27
    new-instance p1, Lx1/f1;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-direct {p1, p0, v0}, Lx1/f1;-><init>(Lx1/i1;I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lx1/i1;->P:Lx1/f1;

    .line 34
    .line 35
    return-void
.end method

.method public static M1(Lv1/t;)Lx1/i1;
    .locals 1

    .line 1
    instance-of v0, p0, Lv1/l0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lv1/l0;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, v0, Lv1/l0;->g:Lx1/o0;

    .line 13
    .line 14
    iget-object v0, v0, Lx1/o0;->u:Lx1/i1;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    return-object v0

    .line 20
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p0, Lx1/i1;

    .line 24
    .line 25
    return-object p0
.end method


# virtual methods
.method public final A1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/i1;->u:Lx1/f0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/f0;->M:Lx1/j0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lx1/j0;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public abstract B0(JFLi1/b;)V
.end method

.method public final B1()V
    .locals 13

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, Lx1/j1;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, Lx1/i1;->t1(Z)Ly0/n;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_c

    .line 12
    .line 13
    iget-object v2, v2, Ly0/n;->g:Ly0/n;

    .line 14
    .line 15
    iget v2, v2, Ly0/n;->j:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_c

    .line 19
    .line 20
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2}, Lw0/f;->e()Lfg/l;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v4, v3

    .line 33
    :goto_0
    invoke-static {v2}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget-object v6, v6, Ly0/n;->k:Ly0/n;

    .line 52
    .line 53
    if-nez v6, :cond_2

    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_2
    :goto_1
    invoke-virtual {p0, v1}, Lx1/i1;->t1(Z)Ly0/n;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_2
    if-eqz v1, :cond_b

    .line 62
    .line 63
    iget v7, v1, Ly0/n;->j:I

    .line 64
    .line 65
    and-int/2addr v7, v0

    .line 66
    if-eqz v7, :cond_b

    .line 67
    .line 68
    iget v7, v1, Ly0/n;->i:I

    .line 69
    .line 70
    and-int/2addr v7, v0

    .line 71
    if-eqz v7, :cond_a

    .line 72
    .line 73
    move-object v7, v1

    .line 74
    move-object v8, v3

    .line 75
    :goto_3
    if-eqz v7, :cond_a

    .line 76
    .line 77
    instance-of v9, v7, Lx1/w0;

    .line 78
    .line 79
    if-eqz v9, :cond_3

    .line 80
    .line 81
    check-cast v7, Lx1/w0;

    .line 82
    .line 83
    iget-wide v9, p0, Lv1/b1;->i:J

    .line 84
    .line 85
    invoke-interface {v7, v9, v10}, Lx1/w0;->e(J)V

    .line 86
    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_3
    iget v9, v7, Ly0/n;->i:I

    .line 90
    .line 91
    and-int/2addr v9, v0

    .line 92
    if-eqz v9, :cond_9

    .line 93
    .line 94
    instance-of v9, v7, Lx1/j;

    .line 95
    .line 96
    if-eqz v9, :cond_9

    .line 97
    .line 98
    move-object v9, v7

    .line 99
    check-cast v9, Lx1/j;

    .line 100
    .line 101
    iget-object v9, v9, Lx1/j;->v:Ly0/n;

    .line 102
    .line 103
    const/4 v10, 0x0

    .line 104
    :goto_4
    const/4 v11, 0x1

    .line 105
    if-eqz v9, :cond_8

    .line 106
    .line 107
    iget v12, v9, Ly0/n;->i:I

    .line 108
    .line 109
    and-int/2addr v12, v0

    .line 110
    if-eqz v12, :cond_7

    .line 111
    .line 112
    add-int/lit8 v10, v10, 0x1

    .line 113
    .line 114
    if-ne v10, v11, :cond_4

    .line 115
    .line 116
    move-object v7, v9

    .line 117
    goto :goto_5

    .line 118
    :cond_4
    if-nez v8, :cond_5

    .line 119
    .line 120
    new-instance v8, Lj0/b;

    .line 121
    .line 122
    const/16 v11, 0x10

    .line 123
    .line 124
    new-array v11, v11, [Ly0/n;

    .line 125
    .line 126
    invoke-direct {v8, v11}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    if-eqz v7, :cond_6

    .line 130
    .line 131
    invoke-virtual {v8, v7}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object v7, v3

    .line 135
    :cond_6
    invoke-virtual {v8, v9}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    :goto_5
    iget-object v9, v9, Ly0/n;->l:Ly0/n;

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_8
    if-ne v10, v11, :cond_9

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_9
    :goto_6
    invoke-static {v8}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    goto :goto_3

    .line 149
    :cond_a
    if-eq v1, v6, :cond_b

    .line 150
    .line 151
    iget-object v1, v1, Ly0/n;->l:Ly0/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_b
    :goto_7
    invoke-static {v2, v5, v4}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_8
    invoke-static {v2, v5, v4}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 159
    .line 160
    .line 161
    throw v0

    .line 162
    :cond_c
    return-void
.end method

.method public final C()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 6
    .line 7
    return v0
.end method

.method public final C1()V
    .locals 10

    .line 1
    const/high16 v0, 0x400000

    .line 2
    .line 3
    invoke-static {v0}, Lx1/j1;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v2, v2, Ly0/n;->k:Ly0/n;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lx1/i1;->t1(Z)Ly0/n;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_1
    if-eqz v1, :cond_a

    .line 25
    .line 26
    iget v3, v1, Ly0/n;->j:I

    .line 27
    .line 28
    and-int/2addr v3, v0

    .line 29
    if-eqz v3, :cond_a

    .line 30
    .line 31
    iget v3, v1, Ly0/n;->i:I

    .line 32
    .line 33
    and-int/2addr v3, v0

    .line 34
    if-eqz v3, :cond_9

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    move-object v4, v1

    .line 38
    move-object v5, v3

    .line 39
    :goto_2
    if-eqz v4, :cond_9

    .line 40
    .line 41
    instance-of v6, v4, Lx1/u;

    .line 42
    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    check-cast v4, Lx1/u;

    .line 46
    .line 47
    invoke-interface {v4, p0}, Lx1/u;->p0(Lv1/t;)V

    .line 48
    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_2
    iget v6, v4, Ly0/n;->i:I

    .line 52
    .line 53
    and-int/2addr v6, v0

    .line 54
    if-eqz v6, :cond_8

    .line 55
    .line 56
    instance-of v6, v4, Lx1/j;

    .line 57
    .line 58
    if-eqz v6, :cond_8

    .line 59
    .line 60
    move-object v6, v4

    .line 61
    check-cast v6, Lx1/j;

    .line 62
    .line 63
    iget-object v6, v6, Lx1/j;->v:Ly0/n;

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    :goto_3
    const/4 v8, 0x1

    .line 67
    if-eqz v6, :cond_7

    .line 68
    .line 69
    iget v9, v6, Ly0/n;->i:I

    .line 70
    .line 71
    and-int/2addr v9, v0

    .line 72
    if-eqz v9, :cond_6

    .line 73
    .line 74
    add-int/lit8 v7, v7, 0x1

    .line 75
    .line 76
    if-ne v7, v8, :cond_3

    .line 77
    .line 78
    move-object v4, v6

    .line 79
    goto :goto_4

    .line 80
    :cond_3
    if-nez v5, :cond_4

    .line 81
    .line 82
    new-instance v5, Lj0/b;

    .line 83
    .line 84
    const/16 v8, 0x10

    .line 85
    .line 86
    new-array v8, v8, [Ly0/n;

    .line 87
    .line 88
    invoke-direct {v5, v8}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    if-eqz v4, :cond_5

    .line 92
    .line 93
    invoke-virtual {v5, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move-object v4, v3

    .line 97
    :cond_5
    invoke-virtual {v5, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_6
    :goto_4
    iget-object v6, v6, Ly0/n;->l:Ly0/n;

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_7
    if-ne v7, v8, :cond_8

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_8
    :goto_5
    invoke-static {v5}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    goto :goto_2

    .line 111
    :cond_9
    if-eq v1, v2, :cond_a

    .line 112
    .line 113
    iget-object v1, v1, Ly0/n;->l:Ly0/n;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_a
    :goto_6
    return-void
.end method

.method public final D1()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lx1/i1;->x:Z

    .line 3
    .line 4
    iget-object v0, p0, Lx1/i1;->P:Lx1/f1;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx1/f1;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lx1/i1;->J1()V

    .line 10
    .line 11
    .line 12
    iget-wide v0, p0, Lx1/i1;->F:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, Lu2/j;->b(JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lx1/i1;->u:Lx1/f0;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lx1/f0;->N(Lx1/i1;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final E([F)V
    .locals 6

    .line 1
    iget-object v0, p0, Lx1/i1;->u:Lx1/f0;

    .line 2
    .line 3
    invoke-static {v0}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, Lv1/w;->h(Lv1/t;)Lv1/t;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lx1/i1;->M1(Lv1/t;)Lx1/i1;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v1, p1}, Lx1/i1;->P1(Lx1/i1;[F)V

    .line 16
    .line 17
    .line 18
    instance-of v2, v0, Ly1/t;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    check-cast v0, Ly1/t;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ly1/t;->v([F)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    invoke-virtual {v1, v2, v3}, Lx1/i1;->P(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide v2, 0x7fffffff7fffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v2, v0

    .line 40
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    cmp-long v2, v2, v4

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    const/16 v2, 0x20

    .line 50
    .line 51
    shr-long v2, v0, v2

    .line 52
    .line 53
    long-to-int v2, v2

    .line 54
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const-wide v3, 0xffffffffL

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    and-long/2addr v0, v3

    .line 64
    long-to-int v0, v0

    .line 65
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {p1, v2, v0}, Lf1/i0;->f([FFF)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
.end method

.method public final E1()V
    .locals 10

    .line 1
    const/high16 v0, 0x100000

    .line 2
    .line 3
    invoke-static {v0}, Lx1/j1;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, Lx1/i1;->t1(Z)Ly0/n;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_9

    .line 12
    .line 13
    iget-object v2, v2, Ly0/n;->g:Ly0/n;

    .line 14
    .line 15
    iget v2, v2, Ly0/n;->j:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_9

    .line 19
    .line 20
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v2, v2, Ly0/n;->k:Ly0/n;

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto :goto_5

    .line 32
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lx1/i1;->t1(Z)Ly0/n;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :goto_1
    if-eqz v1, :cond_9

    .line 37
    .line 38
    iget v3, v1, Ly0/n;->j:I

    .line 39
    .line 40
    and-int/2addr v3, v0

    .line 41
    if-eqz v3, :cond_9

    .line 42
    .line 43
    iget v3, v1, Ly0/n;->i:I

    .line 44
    .line 45
    and-int/2addr v3, v0

    .line 46
    if-eqz v3, :cond_8

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    move-object v4, v1

    .line 50
    move-object v5, v3

    .line 51
    :goto_2
    if-eqz v4, :cond_8

    .line 52
    .line 53
    iget v6, v4, Ly0/n;->i:I

    .line 54
    .line 55
    and-int/2addr v6, v0

    .line 56
    if-eqz v6, :cond_7

    .line 57
    .line 58
    instance-of v6, v4, Lx1/j;

    .line 59
    .line 60
    if-eqz v6, :cond_7

    .line 61
    .line 62
    move-object v6, v4

    .line 63
    check-cast v6, Lx1/j;

    .line 64
    .line 65
    iget-object v6, v6, Lx1/j;->v:Ly0/n;

    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    :goto_3
    const/4 v8, 0x1

    .line 69
    if-eqz v6, :cond_6

    .line 70
    .line 71
    iget v9, v6, Ly0/n;->i:I

    .line 72
    .line 73
    and-int/2addr v9, v0

    .line 74
    if-eqz v9, :cond_5

    .line 75
    .line 76
    add-int/lit8 v7, v7, 0x1

    .line 77
    .line 78
    if-ne v7, v8, :cond_2

    .line 79
    .line 80
    move-object v4, v6

    .line 81
    goto :goto_4

    .line 82
    :cond_2
    if-nez v5, :cond_3

    .line 83
    .line 84
    new-instance v5, Lj0/b;

    .line 85
    .line 86
    const/16 v8, 0x10

    .line 87
    .line 88
    new-array v8, v8, [Ly0/n;

    .line 89
    .line 90
    invoke-direct {v5, v8}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    if-eqz v4, :cond_4

    .line 94
    .line 95
    invoke-virtual {v5, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-object v4, v3

    .line 99
    :cond_4
    invoke-virtual {v5, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_5
    :goto_4
    iget-object v6, v6, Ly0/n;->l:Ly0/n;

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_6
    if-ne v7, v8, :cond_7

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_7
    invoke-static {v5}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    goto :goto_2

    .line 113
    :cond_8
    if-eq v1, v2, :cond_9

    .line 114
    .line 115
    iget-object v1, v1, Ly0/n;->l:Ly0/n;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_9
    :goto_5
    return-void
.end method

.method public final F()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lv1/b1;->i:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final F1(Ly0/n;Lx1/e1;JLx1/p;IZFZ)V
    .locals 16

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    if-nez v2, :cond_0

    .line 4
    .line 5
    move-object/from16 v3, p0

    .line 6
    .line 7
    move-object/from16 v4, p2

    .line 8
    .line 9
    move-wide/from16 v5, p3

    .line 10
    .line 11
    move-object/from16 v7, p5

    .line 12
    .line 13
    move/from16 v8, p6

    .line 14
    .line 15
    move/from16 v9, p7

    .line 16
    .line 17
    invoke-virtual/range {v3 .. v9}, Lx1/i1;->x1(Lx1/e1;JLx1/p;IZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    move-object/from16 v3, p2

    .line 22
    .line 23
    invoke-interface {v3, v2}, Lx1/e1;->b(Ly0/n;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-interface {v3}, Lx1/e1;->a()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v2, v0}, Lx1/k;->d(Lx1/i;I)Ly0/n;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object/from16 v0, p0

    .line 38
    .line 39
    move-object/from16 v5, p5

    .line 40
    .line 41
    move/from16 v6, p6

    .line 42
    .line 43
    move/from16 v7, p7

    .line 44
    .line 45
    move/from16 v8, p8

    .line 46
    .line 47
    move/from16 v9, p9

    .line 48
    .line 49
    move-object v2, v3

    .line 50
    move-wide/from16 v3, p3

    .line 51
    .line 52
    invoke-virtual/range {v0 .. v9}, Lx1/i1;->F1(Ly0/n;Lx1/e1;JLx1/p;IZFZ)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    move/from16 v6, p6

    .line 57
    .line 58
    const/4 v0, 0x3

    .line 59
    if-ne v6, v0, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/4 v1, 0x4

    .line 63
    if-ne v6, v1, :cond_12

    .line 64
    .line 65
    :goto_0
    const/4 v1, 0x0

    .line 66
    move-object v4, v1

    .line 67
    move-object v3, v2

    .line 68
    :goto_1
    if-eqz v3, :cond_12

    .line 69
    .line 70
    instance-of v5, v3, Lx1/w1;

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v11, 0x1

    .line 74
    if-eqz v5, :cond_b

    .line 75
    .line 76
    check-cast v3, Lx1/w1;

    .line 77
    .line 78
    invoke-interface {v3}, Lx1/w1;->H()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    const/16 v1, 0x20

    .line 83
    .line 84
    shr-long v8, p3, v1

    .line 85
    .line 86
    long-to-int v1, v8

    .line 87
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    move-object/from16 v8, p0

    .line 92
    .line 93
    iget-object v9, v8, Lx1/i1;->u:Lx1/f0;

    .line 94
    .line 95
    iget-object v10, v9, Lx1/f0;->F:Lu2/m;

    .line 96
    .line 97
    sget v12, Lx1/c2;->b:I

    .line 98
    .line 99
    const-wide/high16 v12, -0x8000000000000000L

    .line 100
    .line 101
    and-long/2addr v12, v3

    .line 102
    const-wide/16 v14, 0x0

    .line 103
    .line 104
    cmp-long v12, v12, v14

    .line 105
    .line 106
    const/4 v13, 0x2

    .line 107
    sget-object v14, Lu2/m;->g:Lu2/m;

    .line 108
    .line 109
    if-eqz v12, :cond_4

    .line 110
    .line 111
    if-ne v10, v14, :cond_3

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    invoke-static {v13, v3, v4}, Lx1/d1;->g(IJ)I

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    goto :goto_3

    .line 119
    :cond_4
    :goto_2
    invoke-static {v7, v3, v4}, Lx1/d1;->g(IJ)I

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    :goto_3
    neg-int v10, v10

    .line 124
    int-to-float v10, v10

    .line 125
    cmpl-float v5, v5, v10

    .line 126
    .line 127
    if-ltz v5, :cond_12

    .line 128
    .line 129
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    invoke-virtual {v8}, Lv1/b1;->w0()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    iget-object v9, v9, Lx1/f0;->F:Lu2/m;

    .line 138
    .line 139
    if-eqz v12, :cond_6

    .line 140
    .line 141
    if-ne v9, v14, :cond_5

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_5
    invoke-static {v7, v3, v4}, Lx1/d1;->g(IJ)I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    goto :goto_5

    .line 149
    :cond_6
    :goto_4
    invoke-static {v13, v3, v4}, Lx1/d1;->g(IJ)I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    :goto_5
    add-int/2addr v5, v7

    .line 154
    int-to-float v5, v5

    .line 155
    cmpg-float v1, v1, v5

    .line 156
    .line 157
    if-gez v1, :cond_12

    .line 158
    .line 159
    const-wide v9, 0xffffffffL

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    and-long v9, p3, v9

    .line 165
    .line 166
    long-to-int v1, v9

    .line 167
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    invoke-static {v11, v3, v4}, Lx1/d1;->g(IJ)I

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    neg-int v7, v7

    .line 176
    int-to-float v7, v7

    .line 177
    cmpl-float v5, v5, v7

    .line 178
    .line 179
    if-ltz v5, :cond_12

    .line 180
    .line 181
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    invoke-virtual {v8}, Lv1/b1;->r0()I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    invoke-static {v0, v3, v4}, Lx1/d1;->g(IJ)I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    add-int/2addr v0, v5

    .line 194
    int-to-float v0, v0

    .line 195
    cmpg-float v0, v1, v0

    .line 196
    .line 197
    if-gez v0, :cond_12

    .line 198
    .line 199
    new-instance v0, Lx1/g1;

    .line 200
    .line 201
    move-object/from16 v3, p2

    .line 202
    .line 203
    move-wide/from16 v4, p3

    .line 204
    .line 205
    move/from16 v9, p8

    .line 206
    .line 207
    move/from16 v10, p9

    .line 208
    .line 209
    move v7, v6

    .line 210
    move-object v1, v8

    .line 211
    move-object/from16 v6, p5

    .line 212
    .line 213
    move/from16 v8, p7

    .line 214
    .line 215
    invoke-direct/range {v0 .. v10}, Lx1/g1;-><init>(Lx1/i1;Ly0/n;Lx1/e1;JLx1/p;IZFZ)V

    .line 216
    .line 217
    .line 218
    iget-object v1, v6, Lx1/p;->h:Lf/y;

    .line 219
    .line 220
    iget-object v3, v6, Lx1/p;->g:Lf/f0;

    .line 221
    .line 222
    iget v4, v6, Lx1/p;->i:I

    .line 223
    .line 224
    iget v5, v3, Lf/f0;->b:I

    .line 225
    .line 226
    add-int/lit8 v7, v5, -0x1

    .line 227
    .line 228
    const/4 v9, 0x0

    .line 229
    if-ne v4, v7, :cond_7

    .line 230
    .line 231
    add-int/lit8 v7, v4, 0x1

    .line 232
    .line 233
    invoke-virtual {v6, v7, v5}, Lx1/p;->c(II)V

    .line 234
    .line 235
    .line 236
    iget v5, v6, Lx1/p;->i:I

    .line 237
    .line 238
    add-int/2addr v5, v11

    .line 239
    iput v5, v6, Lx1/p;->i:I

    .line 240
    .line 241
    invoke-virtual {v3, v2}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v9, v8, v11}, Lx1/k;->a(FZZ)J

    .line 245
    .line 246
    .line 247
    move-result-wide v2

    .line 248
    invoke-virtual {v1, v2, v3}, Lf/y;->a(J)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Lx1/g1;->invoke()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    iput v4, v6, Lx1/p;->i:I

    .line 255
    .line 256
    return-void

    .line 257
    :cond_7
    invoke-virtual {v6}, Lx1/p;->a()J

    .line 258
    .line 259
    .line 260
    move-result-wide v4

    .line 261
    iget v7, v6, Lx1/p;->i:I

    .line 262
    .line 263
    invoke-static {v4, v5}, Lx1/k;->o(J)Z

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    if-eqz v10, :cond_9

    .line 268
    .line 269
    iget v4, v3, Lf/f0;->b:I

    .line 270
    .line 271
    add-int/lit8 v5, v4, -0x1

    .line 272
    .line 273
    iput v5, v6, Lx1/p;->i:I

    .line 274
    .line 275
    iget v10, v3, Lf/f0;->b:I

    .line 276
    .line 277
    invoke-virtual {v6, v4, v10}, Lx1/p;->c(II)V

    .line 278
    .line 279
    .line 280
    iget v4, v6, Lx1/p;->i:I

    .line 281
    .line 282
    add-int/2addr v4, v11

    .line 283
    iput v4, v6, Lx1/p;->i:I

    .line 284
    .line 285
    invoke-virtual {v3, v2}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-static {v9, v8, v11}, Lx1/k;->a(FZZ)J

    .line 289
    .line 290
    .line 291
    move-result-wide v2

    .line 292
    invoke-virtual {v1, v2, v3}, Lf/y;->a(J)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Lx1/g1;->invoke()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    iput v5, v6, Lx1/p;->i:I

    .line 299
    .line 300
    invoke-virtual {v6}, Lx1/p;->a()J

    .line 301
    .line 302
    .line 303
    move-result-wide v0

    .line 304
    invoke-static {v0, v1}, Lx1/k;->k(J)F

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    cmpg-float v0, v0, v9

    .line 309
    .line 310
    if-gez v0, :cond_8

    .line 311
    .line 312
    add-int/lit8 v0, v7, 0x1

    .line 313
    .line 314
    iget v1, v6, Lx1/p;->i:I

    .line 315
    .line 316
    add-int/2addr v1, v11

    .line 317
    invoke-virtual {v6, v0, v1}, Lx1/p;->c(II)V

    .line 318
    .line 319
    .line 320
    :cond_8
    iput v7, v6, Lx1/p;->i:I

    .line 321
    .line 322
    return-void

    .line 323
    :cond_9
    invoke-static {v4, v5}, Lx1/k;->k(J)F

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    cmpl-float v4, v4, v9

    .line 328
    .line 329
    if-lez v4, :cond_a

    .line 330
    .line 331
    iget v4, v6, Lx1/p;->i:I

    .line 332
    .line 333
    add-int/lit8 v5, v4, 0x1

    .line 334
    .line 335
    iget v7, v3, Lf/f0;->b:I

    .line 336
    .line 337
    invoke-virtual {v6, v5, v7}, Lx1/p;->c(II)V

    .line 338
    .line 339
    .line 340
    iget v5, v6, Lx1/p;->i:I

    .line 341
    .line 342
    add-int/2addr v5, v11

    .line 343
    iput v5, v6, Lx1/p;->i:I

    .line 344
    .line 345
    invoke-virtual {v3, v2}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    invoke-static {v9, v8, v11}, Lx1/k;->a(FZZ)J

    .line 349
    .line 350
    .line 351
    move-result-wide v2

    .line 352
    invoke-virtual {v1, v2, v3}, Lf/y;->a(J)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Lx1/g1;->invoke()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    iput v4, v6, Lx1/p;->i:I

    .line 359
    .line 360
    :cond_a
    return-void

    .line 361
    :cond_b
    move-object/from16 v6, p5

    .line 362
    .line 363
    move/from16 v8, p7

    .line 364
    .line 365
    iget v5, v3, Ly0/n;->i:I

    .line 366
    .line 367
    const/16 v9, 0x10

    .line 368
    .line 369
    and-int/2addr v5, v9

    .line 370
    if-eqz v5, :cond_11

    .line 371
    .line 372
    instance-of v5, v3, Lx1/j;

    .line 373
    .line 374
    if-eqz v5, :cond_11

    .line 375
    .line 376
    move-object v5, v3

    .line 377
    check-cast v5, Lx1/j;

    .line 378
    .line 379
    iget-object v5, v5, Lx1/j;->v:Ly0/n;

    .line 380
    .line 381
    :goto_6
    if-eqz v5, :cond_10

    .line 382
    .line 383
    iget v10, v5, Ly0/n;->i:I

    .line 384
    .line 385
    and-int/2addr v10, v9

    .line 386
    if-eqz v10, :cond_f

    .line 387
    .line 388
    add-int/lit8 v7, v7, 0x1

    .line 389
    .line 390
    if-ne v7, v11, :cond_c

    .line 391
    .line 392
    move-object v3, v5

    .line 393
    goto :goto_7

    .line 394
    :cond_c
    if-nez v4, :cond_d

    .line 395
    .line 396
    new-instance v4, Lj0/b;

    .line 397
    .line 398
    new-array v10, v9, [Ly0/n;

    .line 399
    .line 400
    invoke-direct {v4, v10}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    :cond_d
    if-eqz v3, :cond_e

    .line 404
    .line 405
    invoke-virtual {v4, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    move-object v3, v1

    .line 409
    :cond_e
    invoke-virtual {v4, v5}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    :cond_f
    :goto_7
    iget-object v5, v5, Ly0/n;->l:Ly0/n;

    .line 413
    .line 414
    goto :goto_6

    .line 415
    :cond_10
    if-ne v7, v11, :cond_11

    .line 416
    .line 417
    :goto_8
    move/from16 v6, p6

    .line 418
    .line 419
    goto/16 :goto_1

    .line 420
    .line 421
    :cond_11
    invoke-static {v4}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    goto :goto_8

    .line 426
    :cond_12
    move-object/from16 v6, p5

    .line 427
    .line 428
    move/from16 v8, p7

    .line 429
    .line 430
    if-eqz p9, :cond_13

    .line 431
    .line 432
    invoke-virtual/range {p0 .. p8}, Lx1/i1;->v1(Ly0/n;Lx1/e1;JLx1/p;IZF)V

    .line 433
    .line 434
    .line 435
    return-void

    .line 436
    :cond_13
    invoke-virtual/range {p0 .. p8}, Lx1/i1;->L1(Ly0/n;Lx1/e1;JLx1/p;IZF)V

    .line 437
    .line 438
    .line 439
    return-void
.end method

.method public abstract G1(Lf1/u;Li1/b;)V
.end method

.method public final H1(JFLfg/l;Li1/b;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lx1/i1;->u:Lx1/f0;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz p5, :cond_3

    .line 6
    .line 7
    if-nez p4, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string p4, "both ways to create layers shouldn\'t be used together"

    .line 11
    .line 12
    invoke-static {p4}, Lu1/a;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    iget-object p4, p0, Lx1/i1;->S:Li1/b;

    .line 16
    .line 17
    if-eq p4, p5, :cond_1

    .line 18
    .line 19
    iput-object v2, p0, Lx1/i1;->S:Li1/b;

    .line 20
    .line 21
    invoke-virtual {p0, v2, v0}, Lx1/i1;->Q1(Lfg/l;Z)V

    .line 22
    .line 23
    .line 24
    iput-object p5, p0, Lx1/i1;->S:Li1/b;

    .line 25
    .line 26
    :cond_1
    iget-object p4, p0, Lx1/i1;->R:Lx1/q1;

    .line 27
    .line 28
    if-nez p4, :cond_5

    .line 29
    .line 30
    invoke-static {v1}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    iget-object v0, p0, Lx1/i1;->O:La1/g;

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    new-instance v0, Lx1/f1;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-direct {v0, p0, v2}, Lx1/f1;-><init>(Lx1/i1;I)V

    .line 42
    .line 43
    .line 44
    new-instance v2, La1/g;

    .line 45
    .line 46
    const/4 v3, 0x3

    .line 47
    invoke-direct {v2, p0, v3, v0}, La1/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-object v2, p0, Lx1/i1;->O:La1/g;

    .line 51
    .line 52
    move-object v0, v2

    .line 53
    :cond_2
    check-cast p4, Ly1/t;

    .line 54
    .line 55
    iget-object v2, p0, Lx1/i1;->P:Lx1/f1;

    .line 56
    .line 57
    invoke-virtual {p4, v0, v2, p5}, Ly1/t;->l(Lfg/p;Lx1/f1;Li1/b;)Lx1/q1;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    iget-wide v3, p0, Lv1/b1;->i:J

    .line 62
    .line 63
    move-object p5, p4

    .line 64
    check-cast p5, Ly1/o1;

    .line 65
    .line 66
    invoke-virtual {p5, v3, v4}, Ly1/o1;->e(J)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p5, p1, p2}, Ly1/o1;->d(J)V

    .line 70
    .line 71
    .line 72
    iput-object p4, p0, Lx1/i1;->R:Lx1/q1;

    .line 73
    .line 74
    const/4 p4, 0x1

    .line 75
    iput-boolean p4, v1, Lx1/f0;->P:Z

    .line 76
    .line 77
    invoke-virtual {v2}, Lx1/f1;->invoke()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    iget-object p5, p0, Lx1/i1;->S:Li1/b;

    .line 82
    .line 83
    if-eqz p5, :cond_4

    .line 84
    .line 85
    iput-object v2, p0, Lx1/i1;->S:Li1/b;

    .line 86
    .line 87
    invoke-virtual {p0, v2, v0}, Lx1/i1;->Q1(Lfg/l;Z)V

    .line 88
    .line 89
    .line 90
    :cond_4
    invoke-virtual {p0, p4, v0}, Lx1/i1;->Q1(Lfg/l;Z)V

    .line 91
    .line 92
    .line 93
    :cond_5
    :goto_1
    iget-wide p4, p0, Lx1/i1;->F:J

    .line 94
    .line 95
    invoke-static {p4, p5, p1, p2}, Lu2/j;->b(JJ)Z

    .line 96
    .line 97
    .line 98
    move-result p4

    .line 99
    if-nez p4, :cond_8

    .line 100
    .line 101
    invoke-static {v1}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 102
    .line 103
    .line 104
    move-result-object p4

    .line 105
    const/high16 p5, -0x3f800000    # -4.0f

    .line 106
    .line 107
    check-cast p4, Ly1/t;

    .line 108
    .line 109
    invoke-virtual {p4, p5}, Ly1/t;->P(F)V

    .line 110
    .line 111
    .line 112
    iput-wide p1, p0, Lx1/i1;->F:J

    .line 113
    .line 114
    iget-object p4, p0, Lx1/i1;->R:Lx1/q1;

    .line 115
    .line 116
    if-eqz p4, :cond_6

    .line 117
    .line 118
    check-cast p4, Ly1/o1;

    .line 119
    .line 120
    invoke-virtual {p4, p1, p2}, Ly1/o1;->d(J)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_6
    iget-object p1, p0, Lx1/i1;->w:Lx1/i1;

    .line 125
    .line 126
    if-eqz p1, :cond_7

    .line 127
    .line 128
    invoke-virtual {p1}, Lx1/i1;->y1()V

    .line 129
    .line 130
    .line 131
    :cond_7
    :goto_2
    invoke-virtual {v1, p0}, Lx1/f0;->N(Lx1/i1;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p0}, Lx1/n0;->d1(Lx1/i1;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, v1, Lx1/f0;->t:Lx1/r1;

    .line 138
    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    check-cast p1, Ly1/t;

    .line 142
    .line 143
    invoke-virtual {p1, v1}, Ly1/t;->B(Lx1/f0;)V

    .line 144
    .line 145
    .line 146
    :cond_8
    iput p3, p0, Lx1/i1;->G:F

    .line 147
    .line 148
    iget-object p1, v1, Lx1/f0;->L:Lx1/b1;

    .line 149
    .line 150
    iget-object p1, p1, Lx1/b1;->d:Lx1/i1;

    .line 151
    .line 152
    if-ne p0, p1, :cond_9

    .line 153
    .line 154
    invoke-static {v1}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Ly1/t;

    .line 159
    .line 160
    invoke-virtual {p1}, Ly1/t;->getRectManager()Lg2/b;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p1, v1}, Lg2/b;->f(Lx1/f0;)V

    .line 165
    .line 166
    .line 167
    :cond_9
    iget-boolean p1, p0, Lx1/n0;->q:Z

    .line 168
    .line 169
    if-nez p1, :cond_a

    .line 170
    .line 171
    invoke-virtual {p0}, Lx1/i1;->Z0()Lv1/o0;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p0, p1}, Lx1/n0;->N0(Lv1/o0;)V

    .line 176
    .line 177
    .line 178
    :cond_a
    return-void
.end method

.method public final I1(Le1/a;ZZ)V
    .locals 12

    .line 1
    iget-object v0, p0, Lx1/i1;->R:Lx1/q1;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_a

    .line 11
    .line 12
    iget-boolean v4, p0, Lx1/i1;->y:Z

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v4, :cond_8

    .line 16
    .line 17
    if-eqz p3, :cond_6

    .line 18
    .line 19
    invoke-virtual {p0}, Lx1/i1;->q1()J

    .line 20
    .line 21
    .line 22
    move-result-wide p2

    .line 23
    iget v4, p1, Le1/a;->a:F

    .line 24
    .line 25
    iget v6, p1, Le1/a;->b:F

    .line 26
    .line 27
    iget v7, p1, Le1/a;->c:F

    .line 28
    .line 29
    cmpg-float v7, v7, v5

    .line 30
    .line 31
    if-ltz v7, :cond_5

    .line 32
    .line 33
    iget-wide v7, p0, Lv1/b1;->i:J

    .line 34
    .line 35
    shr-long v9, v7, v1

    .line 36
    .line 37
    long-to-int v9, v9

    .line 38
    int-to-float v9, v9

    .line 39
    cmpl-float v9, v4, v9

    .line 40
    .line 41
    if-gtz v9, :cond_5

    .line 42
    .line 43
    iget v9, p1, Le1/a;->d:F

    .line 44
    .line 45
    cmpg-float v9, v9, v5

    .line 46
    .line 47
    if-ltz v9, :cond_5

    .line 48
    .line 49
    and-long/2addr v7, v2

    .line 50
    long-to-int v7, v7

    .line 51
    int-to-float v7, v7

    .line 52
    cmpl-float v7, v6, v7

    .line 53
    .line 54
    if-lez v7, :cond_0

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_0
    shr-long v7, p2, v1

    .line 58
    .line 59
    long-to-int v7, v7

    .line 60
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    and-long v8, p2, v2

    .line 65
    .line 66
    long-to-int v8, v8

    .line 67
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    iget v9, p1, Le1/a;->c:F

    .line 72
    .line 73
    iget v10, p1, Le1/a;->a:F

    .line 74
    .line 75
    sub-float/2addr v9, v10

    .line 76
    sub-float v9, v7, v9

    .line 77
    .line 78
    const/high16 v10, 0x40000000    # 2.0f

    .line 79
    .line 80
    div-float/2addr v9, v10

    .line 81
    cmpl-float v11, v9, v5

    .line 82
    .line 83
    if-lez v11, :cond_1

    .line 84
    .line 85
    sub-float/2addr v4, v9

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    neg-float v7, v7

    .line 88
    div-float/2addr v7, v10

    .line 89
    cmpg-float v9, v4, v7

    .line 90
    .line 91
    if-gez v9, :cond_2

    .line 92
    .line 93
    move v4, v7

    .line 94
    :cond_2
    :goto_0
    iget v7, p1, Le1/a;->d:F

    .line 95
    .line 96
    iget v9, p1, Le1/a;->b:F

    .line 97
    .line 98
    sub-float/2addr v7, v9

    .line 99
    sub-float v7, v8, v7

    .line 100
    .line 101
    div-float/2addr v7, v10

    .line 102
    cmpl-float v9, v7, v5

    .line 103
    .line 104
    if-lez v9, :cond_3

    .line 105
    .line 106
    sub-float/2addr v6, v7

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    neg-float v7, v8

    .line 109
    div-float/2addr v7, v10

    .line 110
    cmpg-float v8, v6, v7

    .line 111
    .line 112
    if-gez v8, :cond_4

    .line 113
    .line 114
    move v6, v7

    .line 115
    :cond_4
    :goto_1
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    int-to-long v7, v4

    .line 120
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    int-to-long v9, v4

    .line 125
    shl-long v6, v7, v1

    .line 126
    .line 127
    and-long v8, v9, v2

    .line 128
    .line 129
    or-long/2addr v6, v8

    .line 130
    goto :goto_3

    .line 131
    :cond_5
    :goto_2
    const-wide/16 v6, 0x0

    .line 132
    .line 133
    :goto_3
    shr-long v8, v6, v1

    .line 134
    .line 135
    long-to-int v4, v8

    .line 136
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    and-long/2addr v6, v2

    .line 141
    long-to-int v6, v6

    .line 142
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    iget-wide v7, p0, Lv1/b1;->i:J

    .line 147
    .line 148
    shr-long v9, v7, v1

    .line 149
    .line 150
    long-to-int v9, v9

    .line 151
    and-long/2addr v7, v2

    .line 152
    long-to-int v7, v7

    .line 153
    int-to-float v8, v9

    .line 154
    shr-long v9, p2, v1

    .line 155
    .line 156
    long-to-int v9, v9

    .line 157
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    add-float/2addr v10, v8

    .line 162
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    add-float/2addr v9, v4

    .line 167
    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    invoke-static {v10, v8}, Ljava/lang/Math;->min(FF)F

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    int-to-float v7, v7

    .line 176
    and-long/2addr p2, v2

    .line 177
    long-to-int p2, p2

    .line 178
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 179
    .line 180
    .line 181
    move-result p3

    .line 182
    add-float/2addr p3, v7

    .line 183
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    add-float/2addr p2, v6

    .line 188
    invoke-static {v7, p2}, Ljava/lang/Math;->max(FF)F

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    invoke-static {p3, p2}, Ljava/lang/Math;->min(FF)F

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    invoke-virtual {p1, v4, v6, v8, p2}, Le1/a;->a(FFFF)V

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_6
    if-eqz p2, :cond_7

    .line 201
    .line 202
    iget-wide p2, p0, Lv1/b1;->i:J

    .line 203
    .line 204
    shr-long v6, p2, v1

    .line 205
    .line 206
    long-to-int v4, v6

    .line 207
    int-to-float v4, v4

    .line 208
    and-long/2addr p2, v2

    .line 209
    long-to-int p2, p2

    .line 210
    int-to-float p2, p2

    .line 211
    invoke-virtual {p1, v5, v5, v4, p2}, Le1/a;->a(FFFF)V

    .line 212
    .line 213
    .line 214
    :cond_7
    :goto_4
    invoke-virtual {p1}, Le1/a;->b()Z

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    if-eqz p2, :cond_8

    .line 219
    .line 220
    return-void

    .line 221
    :cond_8
    check-cast v0, Ly1/o1;

    .line 222
    .line 223
    invoke-virtual {v0}, Ly1/o1;->b()[F

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    iget-boolean p3, v0, Ly1/o1;->y:Z

    .line 228
    .line 229
    if-nez p3, :cond_a

    .line 230
    .line 231
    if-nez p2, :cond_9

    .line 232
    .line 233
    iput v5, p1, Le1/a;->a:F

    .line 234
    .line 235
    iput v5, p1, Le1/a;->b:F

    .line 236
    .line 237
    iput v5, p1, Le1/a;->c:F

    .line 238
    .line 239
    iput v5, p1, Le1/a;->d:F

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_9
    invoke-static {p2, p1}, Lf1/i0;->c([FLe1/a;)V

    .line 243
    .line 244
    .line 245
    :cond_a
    :goto_5
    iget-wide p2, p0, Lx1/i1;->F:J

    .line 246
    .line 247
    shr-long v0, p2, v1

    .line 248
    .line 249
    long-to-int v0, v0

    .line 250
    iget v1, p1, Le1/a;->a:F

    .line 251
    .line 252
    int-to-float v0, v0

    .line 253
    add-float/2addr v1, v0

    .line 254
    iput v1, p1, Le1/a;->a:F

    .line 255
    .line 256
    iget v1, p1, Le1/a;->c:F

    .line 257
    .line 258
    add-float/2addr v1, v0

    .line 259
    iput v1, p1, Le1/a;->c:F

    .line 260
    .line 261
    and-long/2addr p2, v2

    .line 262
    long-to-int p2, p2

    .line 263
    iget p3, p1, Le1/a;->b:F

    .line 264
    .line 265
    int-to-float p2, p2

    .line 266
    add-float/2addr p3, p2

    .line 267
    iput p3, p1, Le1/a;->b:F

    .line 268
    .line 269
    iget p3, p1, Le1/a;->d:F

    .line 270
    .line 271
    add-float/2addr p3, p2

    .line 272
    iput p3, p1, Le1/a;->d:F

    .line 273
    .line 274
    return-void
.end method

.method public final J1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/i1;->R:Lx1/q1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lx1/i1;->S:Li1/b;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-object v1, p0, Lx1/i1;->S:Li1/b;

    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v1, v0}, Lx1/i1;->Q1(Lfg/l;Z)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lx1/i1;->u:Lx1/f0;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lx1/f0;->U(Z)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public final K1(Lv1/o0;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lx1/i1;->D:Lv1/o0;

    .line 6
    .line 7
    if-eq v1, v2, :cond_19

    .line 8
    .line 9
    iput-object v1, v0, Lx1/i1;->D:Lv1/o0;

    .line 10
    .line 11
    iget-object v3, v0, Lx1/i1;->u:Lx1/f0;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Lv1/o0;->h()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    invoke-interface {v2}, Lv1/o0;->h()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-ne v5, v6, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Lv1/o0;->g()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-interface {v2}, Lv1/o0;->g()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eq v5, v2, :cond_10

    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, Lv1/o0;->h()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-interface {v1}, Lv1/o0;->g()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    iget-object v6, v0, Lx1/i1;->R:Lx1/q1;

    .line 45
    .line 46
    const-wide v7, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    const/16 v9, 0x20

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    int-to-long v10, v2

    .line 56
    shl-long/2addr v10, v9

    .line 57
    int-to-long v12, v5

    .line 58
    and-long/2addr v12, v7

    .line 59
    or-long/2addr v10, v12

    .line 60
    check-cast v6, Ly1/o1;

    .line 61
    .line 62
    invoke-virtual {v6, v10, v11}, Ly1/o1;->e(J)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v3}, Lx1/f0;->H()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    iget-object v6, v0, Lx1/i1;->w:Lx1/i1;

    .line 73
    .line 74
    if-eqz v6, :cond_2

    .line 75
    .line 76
    invoke-virtual {v6}, Lx1/i1;->y1()V

    .line 77
    .line 78
    .line 79
    :cond_2
    :goto_0
    int-to-long v10, v2

    .line 80
    shl-long v9, v10, v9

    .line 81
    .line 82
    int-to-long v5, v5

    .line 83
    and-long/2addr v5, v7

    .line 84
    or-long/2addr v5, v9

    .line 85
    invoke-virtual {v0, v5, v6}, Lv1/b1;->C0(J)V

    .line 86
    .line 87
    .line 88
    iget-object v2, v0, Lx1/i1;->z:Lfg/l;

    .line 89
    .line 90
    if-eqz v2, :cond_3

    .line 91
    .line 92
    invoke-virtual {v0, v4}, Lx1/i1;->R1(Z)V

    .line 93
    .line 94
    .line 95
    :cond_3
    const/4 v2, 0x4

    .line 96
    invoke-static {v2}, Lx1/j1;->g(I)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-virtual {v0}, Lx1/i1;->r1()Ly0/n;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    if-eqz v5, :cond_4

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    iget-object v6, v6, Ly0/n;->k:Ly0/n;

    .line 108
    .line 109
    if-nez v6, :cond_5

    .line 110
    .line 111
    goto/16 :goto_7

    .line 112
    .line 113
    :cond_5
    :goto_1
    invoke-virtual {v0, v5}, Lx1/i1;->t1(Z)Ly0/n;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    :goto_2
    if-eqz v5, :cond_e

    .line 118
    .line 119
    iget v7, v5, Ly0/n;->j:I

    .line 120
    .line 121
    and-int/2addr v7, v2

    .line 122
    if-eqz v7, :cond_e

    .line 123
    .line 124
    iget v7, v5, Ly0/n;->i:I

    .line 125
    .line 126
    and-int/2addr v7, v2

    .line 127
    if-eqz v7, :cond_d

    .line 128
    .line 129
    const/4 v7, 0x0

    .line 130
    move-object v8, v5

    .line 131
    move-object v9, v7

    .line 132
    :goto_3
    if-eqz v8, :cond_d

    .line 133
    .line 134
    instance-of v10, v8, Lx1/m;

    .line 135
    .line 136
    if-eqz v10, :cond_6

    .line 137
    .line 138
    check-cast v8, Lx1/m;

    .line 139
    .line 140
    invoke-interface {v8}, Lx1/m;->g0()V

    .line 141
    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_6
    iget v10, v8, Ly0/n;->i:I

    .line 145
    .line 146
    and-int/2addr v10, v2

    .line 147
    if-eqz v10, :cond_c

    .line 148
    .line 149
    instance-of v10, v8, Lx1/j;

    .line 150
    .line 151
    if-eqz v10, :cond_c

    .line 152
    .line 153
    move-object v10, v8

    .line 154
    check-cast v10, Lx1/j;

    .line 155
    .line 156
    iget-object v10, v10, Lx1/j;->v:Ly0/n;

    .line 157
    .line 158
    move v11, v4

    .line 159
    :goto_4
    const/4 v12, 0x1

    .line 160
    if-eqz v10, :cond_b

    .line 161
    .line 162
    iget v13, v10, Ly0/n;->i:I

    .line 163
    .line 164
    and-int/2addr v13, v2

    .line 165
    if-eqz v13, :cond_a

    .line 166
    .line 167
    add-int/lit8 v11, v11, 0x1

    .line 168
    .line 169
    if-ne v11, v12, :cond_7

    .line 170
    .line 171
    move-object v8, v10

    .line 172
    goto :goto_5

    .line 173
    :cond_7
    if-nez v9, :cond_8

    .line 174
    .line 175
    new-instance v9, Lj0/b;

    .line 176
    .line 177
    const/16 v12, 0x10

    .line 178
    .line 179
    new-array v12, v12, [Ly0/n;

    .line 180
    .line 181
    invoke-direct {v9, v12}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    if-eqz v8, :cond_9

    .line 185
    .line 186
    invoke-virtual {v9, v8}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object v8, v7

    .line 190
    :cond_9
    invoke-virtual {v9, v10}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_a
    :goto_5
    iget-object v10, v10, Ly0/n;->l:Ly0/n;

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_b
    if-ne v11, v12, :cond_c

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_c
    :goto_6
    invoke-static {v9}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    goto :goto_3

    .line 204
    :cond_d
    if-eq v5, v6, :cond_e

    .line 205
    .line 206
    iget-object v5, v5, Ly0/n;->l:Ly0/n;

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_e
    :goto_7
    iget-object v2, v3, Lx1/f0;->t:Lx1/r1;

    .line 210
    .line 211
    if-eqz v2, :cond_f

    .line 212
    .line 213
    check-cast v2, Ly1/t;

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Ly1/t;->B(Lx1/f0;)V

    .line 216
    .line 217
    .line 218
    :cond_f
    invoke-virtual {v3, v0}, Lx1/f0;->N(Lx1/i1;)V

    .line 219
    .line 220
    .line 221
    :cond_10
    iget-object v2, v0, Lx1/i1;->E:Lf/b0;

    .line 222
    .line 223
    if-eqz v2, :cond_11

    .line 224
    .line 225
    iget v2, v2, Lf/b0;->e:I

    .line 226
    .line 227
    if-eqz v2, :cond_11

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_11
    invoke-interface {v1}, Lv1/o0;->e()Ljava/util/Map;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-nez v2, :cond_19

    .line 239
    .line 240
    :goto_8
    iget-object v2, v0, Lx1/i1;->E:Lf/b0;

    .line 241
    .line 242
    invoke-interface {v1}, Lv1/o0;->e()Ljava/util/Map;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    if-nez v2, :cond_12

    .line 247
    .line 248
    goto :goto_b

    .line 249
    :cond_12
    iget v6, v2, Lf/b0;->e:I

    .line 250
    .line 251
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-eq v6, v7, :cond_13

    .line 256
    .line 257
    goto :goto_b

    .line 258
    :cond_13
    iget-object v6, v2, Lf/b0;->b:[Ljava/lang/Object;

    .line 259
    .line 260
    iget-object v7, v2, Lf/b0;->c:[I

    .line 261
    .line 262
    iget-object v2, v2, Lf/b0;->a:[J

    .line 263
    .line 264
    array-length v8, v2

    .line 265
    add-int/lit8 v8, v8, -0x2

    .line 266
    .line 267
    if-ltz v8, :cond_19

    .line 268
    .line 269
    move v9, v4

    .line 270
    :goto_9
    aget-wide v10, v2, v9

    .line 271
    .line 272
    not-long v12, v10

    .line 273
    const/4 v14, 0x7

    .line 274
    shl-long/2addr v12, v14

    .line 275
    and-long/2addr v12, v10

    .line 276
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    and-long/2addr v12, v14

    .line 282
    cmp-long v12, v12, v14

    .line 283
    .line 284
    if-eqz v12, :cond_18

    .line 285
    .line 286
    sub-int v12, v9, v8

    .line 287
    .line 288
    not-int v12, v12

    .line 289
    ushr-int/lit8 v12, v12, 0x1f

    .line 290
    .line 291
    const/16 v13, 0x8

    .line 292
    .line 293
    rsub-int/lit8 v12, v12, 0x8

    .line 294
    .line 295
    move v14, v4

    .line 296
    :goto_a
    if-ge v14, v12, :cond_17

    .line 297
    .line 298
    const-wide/16 v15, 0xff

    .line 299
    .line 300
    and-long/2addr v15, v10

    .line 301
    const-wide/16 v17, 0x80

    .line 302
    .line 303
    cmp-long v15, v15, v17

    .line 304
    .line 305
    if-gez v15, :cond_16

    .line 306
    .line 307
    shl-int/lit8 v15, v9, 0x3

    .line 308
    .line 309
    add-int/2addr v15, v14

    .line 310
    aget-object v16, v6, v15

    .line 311
    .line 312
    aget v15, v7, v15

    .line 313
    .line 314
    move-object/from16 v4, v16

    .line 315
    .line 316
    check-cast v4, Lv1/j;

    .line 317
    .line 318
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    check-cast v4, Ljava/lang/Integer;

    .line 323
    .line 324
    if-nez v4, :cond_14

    .line 325
    .line 326
    goto :goto_b

    .line 327
    :cond_14
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    if-eq v4, v15, :cond_16

    .line 332
    .line 333
    :goto_b
    iget-object v2, v3, Lx1/f0;->M:Lx1/j0;

    .line 334
    .line 335
    iget-object v2, v2, Lx1/j0;->p:Lx1/v0;

    .line 336
    .line 337
    iget-object v2, v2, Lx1/v0;->D:Lx1/g0;

    .line 338
    .line 339
    invoke-virtual {v2}, Lx1/g0;->f()V

    .line 340
    .line 341
    .line 342
    iget-object v2, v0, Lx1/i1;->E:Lf/b0;

    .line 343
    .line 344
    if-nez v2, :cond_15

    .line 345
    .line 346
    sget-object v2, Lf/o0;->a:Lf/b0;

    .line 347
    .line 348
    new-instance v2, Lf/b0;

    .line 349
    .line 350
    invoke-direct {v2}, Lf/b0;-><init>()V

    .line 351
    .line 352
    .line 353
    iput-object v2, v0, Lx1/i1;->E:Lf/b0;

    .line 354
    .line 355
    :cond_15
    invoke-virtual {v2}, Lf/b0;->a()V

    .line 356
    .line 357
    .line 358
    invoke-interface {v1}, Lv1/o0;->e()Ljava/util/Map;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    if-eqz v3, :cond_19

    .line 375
    .line 376
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    check-cast v3, Ljava/util/Map$Entry;

    .line 381
    .line 382
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    check-cast v3, Ljava/lang/Number;

    .line 391
    .line 392
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    invoke-virtual {v2, v3, v4}, Lf/b0;->g(ILjava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    goto :goto_c

    .line 400
    :cond_16
    shr-long/2addr v10, v13

    .line 401
    add-int/lit8 v14, v14, 0x1

    .line 402
    .line 403
    const/4 v4, 0x0

    .line 404
    goto :goto_a

    .line 405
    :cond_17
    if-ne v12, v13, :cond_19

    .line 406
    .line 407
    :cond_18
    if-eq v9, v8, :cond_19

    .line 408
    .line 409
    add-int/lit8 v9, v9, 0x1

    .line 410
    .line 411
    const/4 v4, 0x0

    .line 412
    goto/16 :goto_9

    .line 413
    .line 414
    :cond_19
    return-void
.end method

.method public final L()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/i1;->R:Lx1/q1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lx1/i1;->x:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lx1/i1;->u:Lx1/f0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lx1/f0;->G()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final L1(Ly0/n;Lx1/e1;JLx1/p;IZF)V
    .locals 14

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    move-wide/from16 v2, p3

    .line 7
    .line 8
    move-object/from16 v4, p5

    .line 9
    .line 10
    move/from16 v5, p6

    .line 11
    .line 12
    move/from16 v6, p7

    .line 13
    .line 14
    invoke-virtual/range {v0 .. v6}, Lx1/i1;->x1(Lx1/e1;JLx1/p;IZ)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    move-object/from16 v2, p2

    .line 19
    .line 20
    invoke-interface {v2, p1}, Lx1/e1;->b(Ly0/n;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v2}, Lx1/e1;->a()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {p1, v0}, Lx1/k;->d(Lx1/i;I)Ly0/n;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    move-object v0, p0

    .line 35
    move-wide/from16 v3, p3

    .line 36
    .line 37
    move-object/from16 v5, p5

    .line 38
    .line 39
    move/from16 v6, p6

    .line 40
    .line 41
    move/from16 v7, p7

    .line 42
    .line 43
    move/from16 v8, p8

    .line 44
    .line 45
    invoke-virtual/range {v0 .. v8}, Lx1/i1;->L1(Ly0/n;Lx1/e1;JLx1/p;IZF)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    invoke-interface {v2, p1}, Lx1/e1;->f(Ly0/n;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_9

    .line 54
    .line 55
    new-instance v0, Lx1/h1;

    .line 56
    .line 57
    move-object v1, p0

    .line 58
    move-wide/from16 v4, p3

    .line 59
    .line 60
    move-object/from16 v6, p5

    .line 61
    .line 62
    move/from16 v7, p6

    .line 63
    .line 64
    move/from16 v8, p7

    .line 65
    .line 66
    move/from16 v9, p8

    .line 67
    .line 68
    move-object v3, v2

    .line 69
    move-object v2, p1

    .line 70
    invoke-direct/range {v0 .. v9}, Lx1/h1;-><init>(Lx1/i1;Ly0/n;Lx1/e1;JLx1/p;IZF)V

    .line 71
    .line 72
    .line 73
    move-object v5, v6

    .line 74
    move v7, v8

    .line 75
    move v8, v9

    .line 76
    iget-object v1, v5, Lx1/p;->h:Lf/y;

    .line 77
    .line 78
    iget-object v3, v5, Lx1/p;->g:Lf/f0;

    .line 79
    .line 80
    iget v4, v5, Lx1/p;->i:I

    .line 81
    .line 82
    iget v6, v3, Lf/f0;->b:I

    .line 83
    .line 84
    add-int/lit8 v9, v6, -0x1

    .line 85
    .line 86
    const/4 v10, 0x0

    .line 87
    if-ne v4, v9, :cond_6

    .line 88
    .line 89
    add-int/lit8 v9, v4, 0x1

    .line 90
    .line 91
    invoke-virtual {v5, v9, v6}, Lx1/p;->c(II)V

    .line 92
    .line 93
    .line 94
    iget v6, v5, Lx1/p;->i:I

    .line 95
    .line 96
    add-int/lit8 v6, v6, 0x1

    .line 97
    .line 98
    iput v6, v5, Lx1/p;->i:I

    .line 99
    .line 100
    invoke-virtual {v3, p1}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v8, v7, v10}, Lx1/k;->a(FZZ)J

    .line 104
    .line 105
    .line 106
    move-result-wide v6

    .line 107
    invoke-virtual {v1, v6, v7}, Lf/y;->a(J)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Lx1/h1;->invoke()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    iput v4, v5, Lx1/p;->i:I

    .line 114
    .line 115
    iget p1, v3, Lf/f0;->b:I

    .line 116
    .line 117
    add-int/lit8 p1, p1, -0x1

    .line 118
    .line 119
    if-eq v9, p1, :cond_3

    .line 120
    .line 121
    invoke-virtual {v5}, Lx1/p;->a()J

    .line 122
    .line 123
    .line 124
    move-result-wide v6

    .line 125
    invoke-static {v6, v7}, Lx1/k;->o(J)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_2

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_2
    return-void

    .line 133
    :cond_3
    :goto_0
    iget p1, v5, Lx1/p;->i:I

    .line 134
    .line 135
    add-int/lit8 v0, p1, 0x1

    .line 136
    .line 137
    invoke-virtual {v3, v0}, Lf/f0;->k(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    if-ltz v0, :cond_5

    .line 141
    .line 142
    iget v2, v1, Lf/y;->b:I

    .line 143
    .line 144
    if-ge v0, v2, :cond_5

    .line 145
    .line 146
    iget-object v3, v1, Lf/y;->a:[J

    .line 147
    .line 148
    aget-wide v4, v3, v0

    .line 149
    .line 150
    add-int/lit8 v4, v2, -0x1

    .line 151
    .line 152
    if-eq v0, v4, :cond_4

    .line 153
    .line 154
    add-int/lit8 p1, p1, 0x2

    .line 155
    .line 156
    invoke-static {v3, v3, v0, p1, v2}, Ltf/l;->q0([J[JIII)V

    .line 157
    .line 158
    .line 159
    :cond_4
    iget p1, v1, Lf/y;->b:I

    .line 160
    .line 161
    add-int/lit8 p1, p1, -0x1

    .line 162
    .line 163
    iput p1, v1, Lf/y;->b:I

    .line 164
    .line 165
    return-void

    .line 166
    :cond_5
    const-string p1, "Index must be between 0 and size"

    .line 167
    .line 168
    invoke-static {p1}, Lokio/a;->i(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_6
    invoke-virtual {v5}, Lx1/p;->a()J

    .line 173
    .line 174
    .line 175
    move-result-wide v11

    .line 176
    iget v4, v5, Lx1/p;->i:I

    .line 177
    .line 178
    iget v6, v3, Lf/f0;->b:I

    .line 179
    .line 180
    add-int/lit8 v9, v6, -0x1

    .line 181
    .line 182
    iput v9, v5, Lx1/p;->i:I

    .line 183
    .line 184
    iget v13, v3, Lf/f0;->b:I

    .line 185
    .line 186
    invoke-virtual {v5, v6, v13}, Lx1/p;->c(II)V

    .line 187
    .line 188
    .line 189
    iget v6, v5, Lx1/p;->i:I

    .line 190
    .line 191
    add-int/lit8 v6, v6, 0x1

    .line 192
    .line 193
    iput v6, v5, Lx1/p;->i:I

    .line 194
    .line 195
    invoke-virtual {v3, p1}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v8, v7, v10}, Lx1/k;->a(FZZ)J

    .line 199
    .line 200
    .line 201
    move-result-wide v6

    .line 202
    invoke-virtual {v1, v6, v7}, Lf/y;->a(J)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Lx1/h1;->invoke()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    iput v9, v5, Lx1/p;->i:I

    .line 209
    .line 210
    invoke-virtual {v5}, Lx1/p;->a()J

    .line 211
    .line 212
    .line 213
    move-result-wide v0

    .line 214
    iget p1, v5, Lx1/p;->i:I

    .line 215
    .line 216
    add-int/lit8 p1, p1, 0x1

    .line 217
    .line 218
    iget v2, v3, Lf/f0;->b:I

    .line 219
    .line 220
    add-int/lit8 v2, v2, -0x1

    .line 221
    .line 222
    if-ge p1, v2, :cond_8

    .line 223
    .line 224
    invoke-static {v11, v12, v0, v1}, Lx1/k;->g(JJ)I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-lez p1, :cond_8

    .line 229
    .line 230
    add-int/lit8 p1, v4, 0x1

    .line 231
    .line 232
    invoke-static {v0, v1}, Lx1/k;->o(J)Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    iget v1, v5, Lx1/p;->i:I

    .line 237
    .line 238
    if-eqz v0, :cond_7

    .line 239
    .line 240
    add-int/lit8 v1, v1, 0x2

    .line 241
    .line 242
    goto :goto_1

    .line 243
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 244
    .line 245
    :goto_1
    invoke-virtual {v5, p1, v1}, Lx1/p;->c(II)V

    .line 246
    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_8
    iget p1, v5, Lx1/p;->i:I

    .line 250
    .line 251
    add-int/lit8 p1, p1, 0x1

    .line 252
    .line 253
    iget v0, v3, Lf/f0;->b:I

    .line 254
    .line 255
    invoke-virtual {v5, p1, v0}, Lx1/p;->c(II)V

    .line 256
    .line 257
    .line 258
    :goto_2
    iput v4, v5, Lx1/p;->i:I

    .line 259
    .line 260
    return-void

    .line 261
    :cond_9
    move-object/from16 v5, p5

    .line 262
    .line 263
    move/from16 v7, p7

    .line 264
    .line 265
    move/from16 v8, p8

    .line 266
    .line 267
    invoke-interface/range {p2 .. p2}, Lx1/e1;->a()I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    invoke-static {p1, v0}, Lx1/k;->d(Lx1/i;I)Ly0/n;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    const/4 v9, 0x0

    .line 276
    move-object v0, p0

    .line 277
    move-object/from16 v2, p2

    .line 278
    .line 279
    move-wide/from16 v3, p3

    .line 280
    .line 281
    move/from16 v6, p6

    .line 282
    .line 283
    invoke-virtual/range {v0 .. v9}, Lx1/i1;->F1(Ly0/n;Lx1/e1;JLx1/p;IZFZ)V

    .line 284
    .line 285
    .line 286
    return-void
.end method

.method public final N1()Le1/c;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-static {p0}, Lv1/w;->h(Lv1/t;)Lv1/t;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lx1/i1;->H:Le1/a;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    new-instance v1, Le1/a;

    .line 19
    .line 20
    invoke-direct {v1}, Le1/a;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lx1/i1;->H:Le1/a;

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Lx1/i1;->q1()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {p0, v2, v3}, Lx1/i1;->i1(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const/16 v4, 0x20

    .line 34
    .line 35
    shr-long v4, v2, v4

    .line 36
    .line 37
    long-to-int v4, v4

    .line 38
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    neg-float v5, v5

    .line 43
    iput v5, v1, Le1/a;->a:F

    .line 44
    .line 45
    const-wide v5, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    and-long/2addr v2, v5

    .line 51
    long-to-int v2, v2

    .line 52
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    neg-float v3, v3

    .line 57
    iput v3, v1, Le1/a;->b:F

    .line 58
    .line 59
    invoke-virtual {p0}, Lv1/b1;->w0()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    int-to-float v3, v3

    .line 64
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    add-float/2addr v4, v3

    .line 69
    iput v4, v1, Le1/a;->c:F

    .line 70
    .line 71
    invoke-virtual {p0}, Lv1/b1;->r0()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    int-to-float v3, v3

    .line 76
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    add-float/2addr v2, v3

    .line 81
    iput v2, v1, Le1/a;->d:F

    .line 82
    .line 83
    move-object v2, p0

    .line 84
    :goto_0
    if-eq v2, v0, :cond_3

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    const/4 v4, 0x1

    .line 88
    invoke-virtual {v2, v1, v3, v4}, Lx1/i1;->I1(Le1/a;ZZ)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Le1/a;->b()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_2

    .line 96
    .line 97
    :goto_1
    sget-object v0, Le1/c;->e:Le1/c;

    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_2
    iget-object v2, v2, Lx1/i1;->w:Lx1/i1;

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    new-instance v0, Le1/c;

    .line 107
    .line 108
    iget v2, v1, Le1/a;->a:F

    .line 109
    .line 110
    iget v3, v1, Le1/a;->b:F

    .line 111
    .line 112
    iget v4, v1, Le1/a;->c:F

    .line 113
    .line 114
    iget v1, v1, Le1/a;->d:F

    .line 115
    .line 116
    invoke-direct {v0, v2, v3, v4, v1}, Le1/c;-><init>(FFFF)V

    .line 117
    .line 118
    .line 119
    return-object v0
.end method

.method public final O1(Lx1/i1;[F)V
    .locals 5

    .line 1
    invoke-static {p1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lx1/i1;->w:Lx1/i1;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lx1/i1;->O1(Lx1/i1;[F)V

    .line 13
    .line 14
    .line 15
    iget-wide v0, p0, Lx1/i1;->F:J

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    invoke-static {v0, v1, v2, v3}, Lu2/j;->b(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    sget-object p1, Lx1/i1;->V:[F

    .line 26
    .line 27
    invoke-static {p1}, Lf1/i0;->d([F)V

    .line 28
    .line 29
    .line 30
    iget-wide v0, p0, Lx1/i1;->F:J

    .line 31
    .line 32
    const/16 v2, 0x20

    .line 33
    .line 34
    shr-long v2, v0, v2

    .line 35
    .line 36
    long-to-int v2, v2

    .line 37
    int-to-float v2, v2

    .line 38
    neg-float v2, v2

    .line 39
    const-wide v3, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr v0, v3

    .line 45
    long-to-int v0, v0

    .line 46
    int-to-float v0, v0

    .line 47
    neg-float v0, v0

    .line 48
    invoke-static {p1, v2, v0}, Lf1/i0;->f([FFF)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2, p1}, Lf1/i0;->e([F[F)V

    .line 52
    .line 53
    .line 54
    :cond_0
    iget-object p1, p0, Lx1/i1;->R:Lx1/q1;

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    check-cast p1, Ly1/o1;

    .line 59
    .line 60
    invoke-virtual {p1}, Ly1/o1;->a()[F

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    invoke-static {p2, p1}, Lf1/i0;->e([F[F)V

    .line 67
    .line 68
    .line 69
    :cond_1
    return-void
.end method

.method public final P(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Lx1/i1;->m0(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    iget-object v0, p0, Lx1/i1;->u:Lx1/f0;

    .line 19
    .line 20
    invoke-static {v0}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ly1/t;

    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Ly1/t;->w(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    return-wide p1
.end method

.method public final P1(Lx1/i1;[F)V
    .locals 7

    .line 1
    move-object v0, p0

    .line 2
    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    iget-object v1, v0, Lx1/i1;->R:Lx1/q1;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v1, Ly1/o1;

    .line 13
    .line 14
    invoke-virtual {v1}, Ly1/o1;->b()[F

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {p2, v1}, Lf1/i0;->e([F[F)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-wide v1, v0, Lx1/i1;->F:J

    .line 22
    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    invoke-static {v1, v2, v3, v4}, Lu2/j;->b(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    sget-object v3, Lx1/i1;->V:[F

    .line 32
    .line 33
    invoke-static {v3}, Lf1/i0;->d([F)V

    .line 34
    .line 35
    .line 36
    const/16 v4, 0x20

    .line 37
    .line 38
    shr-long v4, v1, v4

    .line 39
    .line 40
    long-to-int v4, v4

    .line 41
    int-to-float v4, v4

    .line 42
    const-wide v5, 0xffffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v1, v5

    .line 48
    long-to-int v1, v1

    .line 49
    int-to-float v1, v1

    .line 50
    invoke-static {v3, v4, v1}, Lf1/i0;->f([FFF)V

    .line 51
    .line 52
    .line 53
    invoke-static {p2, v3}, Lf1/i0;->e([F[F)V

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-object v0, v0, Lx1/i1;->w:Lx1/i1;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    return-void
.end method

.method public final Q1(Lfg/l;Z)V
    .locals 8

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lx1/i1;->S:Li1/b;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "layerBlock can\'t be provided when explicitLayer is provided"

    .line 9
    .line 10
    invoke-static {v0}, Lu1/a;->a(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x1

    .line 15
    iget-object v2, p0, Lx1/i1;->u:Lx1/f0;

    .line 16
    .line 17
    if-nez p2, :cond_3

    .line 18
    .line 19
    iget-object p2, p0, Lx1/i1;->z:Lfg/l;

    .line 20
    .line 21
    if-ne p2, p1, :cond_3

    .line 22
    .line 23
    iget-object p2, p0, Lx1/i1;->A:Lu2/c;

    .line 24
    .line 25
    iget-object v3, v2, Lx1/f0;->E:Lu2/c;

    .line 26
    .line 27
    invoke-static {p2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_3

    .line 32
    .line 33
    iget-object p2, p0, Lx1/i1;->B:Lu2/m;

    .line 34
    .line 35
    iget-object v3, v2, Lx1/f0;->F:Lu2/m;

    .line 36
    .line 37
    if-eq p2, v3, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move p2, v0

    .line 41
    goto :goto_2

    .line 42
    :cond_3
    :goto_1
    move p2, v1

    .line 43
    :goto_2
    iget-object v3, v2, Lx1/f0;->E:Lu2/c;

    .line 44
    .line 45
    iput-object v3, p0, Lx1/i1;->A:Lu2/c;

    .line 46
    .line 47
    iget-object v3, v2, Lx1/f0;->F:Lu2/m;

    .line 48
    .line 49
    iput-object v3, p0, Lx1/i1;->B:Lu2/m;

    .line 50
    .line 51
    invoke-virtual {v2}, Lx1/f0;->G()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    iget-object v4, p0, Lx1/i1;->P:Lx1/f1;

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    if-eqz v3, :cond_7

    .line 59
    .line 60
    if-eqz p1, :cond_7

    .line 61
    .line 62
    iput-object p1, p0, Lx1/i1;->z:Lfg/l;

    .line 63
    .line 64
    iget-object p1, p0, Lx1/i1;->R:Lx1/q1;

    .line 65
    .line 66
    if-nez p1, :cond_5

    .line 67
    .line 68
    invoke-static {v2}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object p2, p0, Lx1/i1;->O:La1/g;

    .line 73
    .line 74
    if-nez p2, :cond_4

    .line 75
    .line 76
    new-instance p2, Lx1/f1;

    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    invoke-direct {p2, p0, v0}, Lx1/f1;-><init>(Lx1/i1;I)V

    .line 80
    .line 81
    .line 82
    new-instance v0, La1/g;

    .line 83
    .line 84
    const/4 v3, 0x3

    .line 85
    invoke-direct {v0, p0, v3, p2}, La1/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Lx1/i1;->O:La1/g;

    .line 89
    .line 90
    move-object p2, v0

    .line 91
    :cond_4
    check-cast p1, Ly1/t;

    .line 92
    .line 93
    invoke-virtual {p1, p2, v4, v5}, Ly1/t;->l(Lfg/p;Lx1/f1;Li1/b;)Lx1/q1;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget-wide v5, p0, Lv1/b1;->i:J

    .line 98
    .line 99
    move-object p2, p1

    .line 100
    check-cast p2, Ly1/o1;

    .line 101
    .line 102
    invoke-virtual {p2, v5, v6}, Ly1/o1;->e(J)V

    .line 103
    .line 104
    .line 105
    iget-wide v5, p0, Lx1/i1;->F:J

    .line 106
    .line 107
    invoke-virtual {p2, v5, v6}, Ly1/o1;->d(J)V

    .line 108
    .line 109
    .line 110
    iput-object p1, p0, Lx1/i1;->R:Lx1/q1;

    .line 111
    .line 112
    invoke-virtual {p0, v1}, Lx1/i1;->R1(Z)V

    .line 113
    .line 114
    .line 115
    iput-boolean v1, v2, Lx1/f0;->P:Z

    .line 116
    .line 117
    invoke-virtual {v4}, Lx1/f1;->invoke()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_5
    if-eqz p2, :cond_6

    .line 122
    .line 123
    invoke-virtual {p0, v1}, Lx1/i1;->R1(Z)V

    .line 124
    .line 125
    .line 126
    :cond_6
    return-void

    .line 127
    :cond_7
    iput-object v5, p0, Lx1/i1;->z:Lfg/l;

    .line 128
    .line 129
    iget-object p1, p0, Lx1/i1;->R:Lx1/q1;

    .line 130
    .line 131
    if-eqz p1, :cond_c

    .line 132
    .line 133
    check-cast p1, Ly1/o1;

    .line 134
    .line 135
    invoke-virtual {p1}, Ly1/o1;->b()[F

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-static {p2}, Lf1/c0;->o([F)Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-nez p2, :cond_8

    .line 144
    .line 145
    invoke-virtual {v2, p0}, Lx1/f0;->N(Lx1/i1;)V

    .line 146
    .line 147
    .line 148
    :cond_8
    iput-object v5, p1, Ly1/o1;->j:Lfg/p;

    .line 149
    .line 150
    iput-object v5, p1, Ly1/o1;->k:Lfg/a;

    .line 151
    .line 152
    iput-boolean v1, p1, Ly1/o1;->m:Z

    .line 153
    .line 154
    invoke-virtual {p1, v0}, Ly1/o1;->f(Z)V

    .line 155
    .line 156
    .line 157
    iget-object p2, p1, Ly1/o1;->h:Lf1/z;

    .line 158
    .line 159
    if-eqz p2, :cond_b

    .line 160
    .line 161
    iget-object v3, p1, Ly1/o1;->g:Li1/b;

    .line 162
    .line 163
    invoke-interface {p2, v3}, Lf1/z;->a(Li1/b;)V

    .line 164
    .line 165
    .line 166
    iget-object p2, p1, Ly1/o1;->i:Ly1/t;

    .line 167
    .line 168
    iget-object v3, p2, Ly1/t;->E0:Lp4/t;

    .line 169
    .line 170
    :cond_9
    iget-object v6, v3, Lp4/t;->i:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v6, Ljava/lang/ref/ReferenceQueue;

    .line 173
    .line 174
    iget-object v7, v3, Lp4/t;->h:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v7, Lj0/b;

    .line 177
    .line 178
    invoke-virtual {v6}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    if-eqz v6, :cond_a

    .line 183
    .line 184
    invoke-virtual {v7, v6}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    :cond_a
    if-nez v6, :cond_9

    .line 188
    .line 189
    new-instance v6, Ljava/lang/ref/WeakReference;

    .line 190
    .line 191
    iget-object v3, v3, Lp4/t;->i:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v3, Ljava/lang/ref/ReferenceQueue;

    .line 194
    .line 195
    invoke-direct {v6, p1, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v7, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iget-object p2, p2, Ly1/t;->K:Lf/f0;

    .line 202
    .line 203
    invoke-virtual {p2, p1}, Lf/f0;->j(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    :cond_b
    iput-object v5, p0, Lx1/i1;->R:Lx1/q1;

    .line 207
    .line 208
    iput-boolean v1, v2, Lx1/f0;->P:Z

    .line 209
    .line 210
    invoke-virtual {v4}, Lx1/f1;->invoke()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    iget-boolean p1, p1, Ly0/n;->t:Z

    .line 218
    .line 219
    if-eqz p1, :cond_c

    .line 220
    .line 221
    invoke-virtual {v2}, Lx1/f0;->H()Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-eqz p1, :cond_c

    .line 226
    .line 227
    iget-object p1, v2, Lx1/f0;->t:Lx1/r1;

    .line 228
    .line 229
    if-eqz p1, :cond_c

    .line 230
    .line 231
    check-cast p1, Ly1/t;

    .line 232
    .line 233
    invoke-virtual {p1, v2}, Ly1/t;->B(Lx1/f0;)V

    .line 234
    .line 235
    .line 236
    :cond_c
    iput-boolean v0, p0, Lx1/i1;->Q:Z

    .line 237
    .line 238
    return-void
.end method

.method public final R(J)J
    .locals 3

    .line 1
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p0}, Lv1/w;->h(Lv1/t;)Lv1/t;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lx1/i1;->u:Lx1/f0;

    .line 19
    .line 20
    invoke-static {v1}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ly1/t;

    .line 25
    .line 26
    invoke-virtual {v1}, Ly1/t;->F()V

    .line 27
    .line 28
    .line 29
    iget-object v1, v1, Ly1/t;->k0:[F

    .line 30
    .line 31
    invoke-static {p1, p2, v1}, Lf1/i0;->b(J[F)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    const-wide/16 v1, 0x0

    .line 36
    .line 37
    invoke-interface {v0, v1, v2}, Lv1/t;->m0(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-static {p1, p2, v1, v2}, Le1/b;->d(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    invoke-virtual {p0, v0, p1, p2}, Lx1/i1;->W(Lv1/t;J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    return-wide p1
.end method

.method public final R1(Z)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lx1/i1;->S:Li1/b;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_13

    .line 8
    .line 9
    :cond_0
    iget-object v1, v0, Lx1/i1;->R:Lx1/q1;

    .line 10
    .line 11
    iget-object v2, v0, Lx1/i1;->z:Lfg/l;

    .line 12
    .line 13
    if-eqz v1, :cond_38

    .line 14
    .line 15
    if-eqz v2, :cond_37

    .line 16
    .line 17
    sget-object v3, Lx1/i1;->T:Lf1/o0;

    .line 18
    .line 19
    invoke-virtual {v3}, Lf1/o0;->e()V

    .line 20
    .line 21
    .line 22
    iget-object v4, v0, Lx1/i1;->u:Lx1/f0;

    .line 23
    .line 24
    iget-object v5, v4, Lx1/f0;->E:Lu2/c;

    .line 25
    .line 26
    iput-object v5, v3, Lf1/o0;->w:Lu2/c;

    .line 27
    .line 28
    iget-object v5, v4, Lx1/f0;->F:Lu2/m;

    .line 29
    .line 30
    iput-object v5, v3, Lf1/o0;->x:Lu2/m;

    .line 31
    .line 32
    iget-wide v5, v0, Lv1/b1;->i:J

    .line 33
    .line 34
    invoke-static {v5, v6}, Lr9/e0;->q0(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    iput-wide v5, v3, Lf1/o0;->v:J

    .line 39
    .line 40
    invoke-static {v4}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Ly1/t;

    .line 45
    .line 46
    invoke-virtual {v5}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    sget-object v6, Lx1/d;->k:Lx1/d;

    .line 51
    .line 52
    new-instance v7, Lc1/b;

    .line 53
    .line 54
    const/4 v8, 0x5

    .line 55
    invoke-direct {v7, v2, v8, v0}, Lc1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, v5, Lx1/t1;->a:Lw0/s;

    .line 59
    .line 60
    invoke-virtual {v2, v0, v6, v7}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, Lx1/i1;->I:Lx1/t;

    .line 64
    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    new-instance v2, Lx1/t;

    .line 68
    .line 69
    invoke-direct {v2}, Lx1/t;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v2, v0, Lx1/i1;->I:Lx1/t;

    .line 73
    .line 74
    :cond_1
    sget-object v5, Lx1/i1;->U:Lx1/t;

    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget v6, v2, Lx1/t;->a:F

    .line 80
    .line 81
    iput v6, v5, Lx1/t;->a:F

    .line 82
    .line 83
    iget v6, v2, Lx1/t;->b:F

    .line 84
    .line 85
    iput v6, v5, Lx1/t;->b:F

    .line 86
    .line 87
    iget v6, v2, Lx1/t;->c:F

    .line 88
    .line 89
    iput v6, v5, Lx1/t;->c:F

    .line 90
    .line 91
    iget v6, v2, Lx1/t;->d:F

    .line 92
    .line 93
    iput v6, v5, Lx1/t;->d:F

    .line 94
    .line 95
    iget v6, v2, Lx1/t;->e:F

    .line 96
    .line 97
    iput v6, v5, Lx1/t;->e:F

    .line 98
    .line 99
    iget v6, v2, Lx1/t;->f:F

    .line 100
    .line 101
    iput v6, v5, Lx1/t;->f:F

    .line 102
    .line 103
    iget v6, v2, Lx1/t;->g:F

    .line 104
    .line 105
    iput v6, v5, Lx1/t;->g:F

    .line 106
    .line 107
    iget v6, v2, Lx1/t;->h:F

    .line 108
    .line 109
    iput v6, v5, Lx1/t;->h:F

    .line 110
    .line 111
    iget-wide v6, v2, Lx1/t;->i:J

    .line 112
    .line 113
    iput-wide v6, v5, Lx1/t;->i:J

    .line 114
    .line 115
    iget v6, v3, Lf1/o0;->h:F

    .line 116
    .line 117
    iput v6, v2, Lx1/t;->a:F

    .line 118
    .line 119
    iget v7, v3, Lf1/o0;->i:F

    .line 120
    .line 121
    iput v7, v2, Lx1/t;->b:F

    .line 122
    .line 123
    iget v7, v3, Lf1/o0;->k:F

    .line 124
    .line 125
    iput v7, v2, Lx1/t;->c:F

    .line 126
    .line 127
    iget v7, v3, Lf1/o0;->l:F

    .line 128
    .line 129
    iput v7, v2, Lx1/t;->d:F

    .line 130
    .line 131
    const/4 v7, 0x0

    .line 132
    iput v7, v2, Lx1/t;->e:F

    .line 133
    .line 134
    iput v7, v2, Lx1/t;->f:F

    .line 135
    .line 136
    iget v8, v3, Lf1/o0;->p:F

    .line 137
    .line 138
    iput v8, v2, Lx1/t;->g:F

    .line 139
    .line 140
    iget v8, v3, Lf1/o0;->q:F

    .line 141
    .line 142
    iput v8, v2, Lx1/t;->h:F

    .line 143
    .line 144
    iget-wide v8, v3, Lf1/o0;->r:J

    .line 145
    .line 146
    iput-wide v8, v2, Lx1/t;->i:J

    .line 147
    .line 148
    check-cast v1, Ly1/o1;

    .line 149
    .line 150
    iget-object v10, v1, Ly1/o1;->i:Ly1/t;

    .line 151
    .line 152
    iget v11, v3, Lf1/o0;->g:I

    .line 153
    .line 154
    iget v12, v1, Ly1/o1;->t:I

    .line 155
    .line 156
    or-int/2addr v11, v12

    .line 157
    iget-object v12, v3, Lf1/o0;->x:Lu2/m;

    .line 158
    .line 159
    iput-object v12, v1, Ly1/o1;->r:Lu2/m;

    .line 160
    .line 161
    iget-object v12, v3, Lf1/o0;->w:Lu2/c;

    .line 162
    .line 163
    iput-object v12, v1, Ly1/o1;->q:Lu2/c;

    .line 164
    .line 165
    and-int/lit16 v12, v11, 0x1000

    .line 166
    .line 167
    if-eqz v12, :cond_2

    .line 168
    .line 169
    iput-wide v8, v1, Ly1/o1;->u:J

    .line 170
    .line 171
    :cond_2
    and-int/lit8 v8, v11, 0x1

    .line 172
    .line 173
    if-eqz v8, :cond_4

    .line 174
    .line 175
    iget-object v8, v1, Ly1/o1;->g:Li1/b;

    .line 176
    .line 177
    iget-object v8, v8, Li1/b;->a:Li1/d;

    .line 178
    .line 179
    invoke-interface {v8}, Li1/d;->b()F

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    cmpg-float v9, v9, v6

    .line 184
    .line 185
    if-nez v9, :cond_3

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_3
    invoke-interface {v8, v6}, Li1/d;->q(F)V

    .line 189
    .line 190
    .line 191
    :cond_4
    :goto_0
    and-int/lit8 v6, v11, 0x2

    .line 192
    .line 193
    if-eqz v6, :cond_6

    .line 194
    .line 195
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 196
    .line 197
    iget v8, v3, Lf1/o0;->i:F

    .line 198
    .line 199
    iget-object v6, v6, Li1/b;->a:Li1/d;

    .line 200
    .line 201
    invoke-interface {v6}, Li1/d;->v()F

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    cmpg-float v9, v9, v8

    .line 206
    .line 207
    if-nez v9, :cond_5

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_5
    invoke-interface {v6, v8}, Li1/d;->i(F)V

    .line 211
    .line 212
    .line 213
    :cond_6
    :goto_1
    and-int/lit8 v6, v11, 0x4

    .line 214
    .line 215
    if-eqz v6, :cond_7

    .line 216
    .line 217
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 218
    .line 219
    iget v8, v3, Lf1/o0;->j:F

    .line 220
    .line 221
    invoke-virtual {v6, v8}, Li1/b;->f(F)V

    .line 222
    .line 223
    .line 224
    :cond_7
    and-int/lit8 v6, v11, 0x8

    .line 225
    .line 226
    if-eqz v6, :cond_9

    .line 227
    .line 228
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 229
    .line 230
    iget v8, v3, Lf1/o0;->k:F

    .line 231
    .line 232
    iget-object v6, v6, Li1/b;->a:Li1/d;

    .line 233
    .line 234
    invoke-interface {v6}, Li1/d;->H()F

    .line 235
    .line 236
    .line 237
    move-result v9

    .line 238
    cmpg-float v9, v9, v8

    .line 239
    .line 240
    if-nez v9, :cond_8

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_8
    invoke-interface {v6, v8}, Li1/d;->s(F)V

    .line 244
    .line 245
    .line 246
    :cond_9
    :goto_2
    and-int/lit8 v6, v11, 0x10

    .line 247
    .line 248
    if-eqz v6, :cond_b

    .line 249
    .line 250
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 251
    .line 252
    iget v8, v3, Lf1/o0;->l:F

    .line 253
    .line 254
    iget-object v6, v6, Li1/b;->a:Li1/d;

    .line 255
    .line 256
    invoke-interface {v6}, Li1/d;->E()F

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    cmpg-float v9, v9, v8

    .line 261
    .line 262
    if-nez v9, :cond_a

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_a
    invoke-interface {v6, v8}, Li1/d;->g(F)V

    .line 266
    .line 267
    .line 268
    :cond_b
    :goto_3
    and-int/lit8 v6, v11, 0x20

    .line 269
    .line 270
    const/4 v8, 0x1

    .line 271
    if-eqz v6, :cond_d

    .line 272
    .line 273
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 274
    .line 275
    iget v9, v3, Lf1/o0;->m:F

    .line 276
    .line 277
    iget-object v13, v6, Li1/b;->a:Li1/d;

    .line 278
    .line 279
    invoke-interface {v13}, Li1/d;->M()F

    .line 280
    .line 281
    .line 282
    move-result v14

    .line 283
    cmpg-float v14, v14, v9

    .line 284
    .line 285
    if-nez v14, :cond_c

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_c
    invoke-interface {v13, v9}, Li1/d;->c(F)V

    .line 289
    .line 290
    .line 291
    iput-boolean v8, v6, Li1/b;->g:Z

    .line 292
    .line 293
    invoke-virtual {v6}, Li1/b;->a()V

    .line 294
    .line 295
    .line 296
    :goto_4
    iget v6, v3, Lf1/o0;->m:F

    .line 297
    .line 298
    cmpl-float v6, v6, v7

    .line 299
    .line 300
    if-lez v6, :cond_d

    .line 301
    .line 302
    iget-boolean v6, v1, Ly1/o1;->z:Z

    .line 303
    .line 304
    if-nez v6, :cond_d

    .line 305
    .line 306
    iget-object v6, v1, Ly1/o1;->k:Lfg/a;

    .line 307
    .line 308
    if-eqz v6, :cond_d

    .line 309
    .line 310
    invoke-interface {v6}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    :cond_d
    and-int/lit8 v6, v11, 0x40

    .line 314
    .line 315
    if-eqz v6, :cond_e

    .line 316
    .line 317
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 318
    .line 319
    iget-wide v13, v3, Lf1/o0;->n:J

    .line 320
    .line 321
    iget-object v6, v6, Li1/b;->a:Li1/d;

    .line 322
    .line 323
    move v9, v7

    .line 324
    invoke-interface {v6}, Li1/d;->D()J

    .line 325
    .line 326
    .line 327
    move-result-wide v7

    .line 328
    invoke-static {v13, v14, v7, v8}, Lf1/w;->c(JJ)Z

    .line 329
    .line 330
    .line 331
    move-result v7

    .line 332
    if-nez v7, :cond_f

    .line 333
    .line 334
    invoke-interface {v6, v13, v14}, Li1/d;->p(J)V

    .line 335
    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_e
    move v9, v7

    .line 339
    :cond_f
    :goto_5
    and-int/lit16 v6, v11, 0x80

    .line 340
    .line 341
    if-eqz v6, :cond_10

    .line 342
    .line 343
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 344
    .line 345
    iget-wide v7, v3, Lf1/o0;->o:J

    .line 346
    .line 347
    iget-object v6, v6, Li1/b;->a:Li1/d;

    .line 348
    .line 349
    invoke-interface {v6}, Li1/d;->F()J

    .line 350
    .line 351
    .line 352
    move-result-wide v13

    .line 353
    invoke-static {v7, v8, v13, v14}, Lf1/w;->c(JJ)Z

    .line 354
    .line 355
    .line 356
    move-result v13

    .line 357
    if-nez v13, :cond_10

    .line 358
    .line 359
    invoke-interface {v6, v7, v8}, Li1/d;->t(J)V

    .line 360
    .line 361
    .line 362
    :cond_10
    and-int/lit16 v6, v11, 0x400

    .line 363
    .line 364
    if-eqz v6, :cond_12

    .line 365
    .line 366
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 367
    .line 368
    iget v7, v3, Lf1/o0;->p:F

    .line 369
    .line 370
    iget-object v6, v6, Li1/b;->a:Li1/d;

    .line 371
    .line 372
    invoke-interface {v6}, Li1/d;->B()F

    .line 373
    .line 374
    .line 375
    move-result v8

    .line 376
    cmpg-float v8, v8, v7

    .line 377
    .line 378
    if-nez v8, :cond_11

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_11
    invoke-interface {v6, v7}, Li1/d;->f(F)V

    .line 382
    .line 383
    .line 384
    :cond_12
    :goto_6
    and-int/lit16 v6, v11, 0x100

    .line 385
    .line 386
    if-eqz v6, :cond_14

    .line 387
    .line 388
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 389
    .line 390
    iget-object v6, v6, Li1/b;->a:Li1/d;

    .line 391
    .line 392
    invoke-interface {v6}, Li1/d;->I()F

    .line 393
    .line 394
    .line 395
    move-result v7

    .line 396
    cmpg-float v7, v7, v9

    .line 397
    .line 398
    if-nez v7, :cond_13

    .line 399
    .line 400
    goto :goto_7

    .line 401
    :cond_13
    invoke-interface {v6}, Li1/d;->l()V

    .line 402
    .line 403
    .line 404
    :cond_14
    :goto_7
    and-int/lit16 v6, v11, 0x200

    .line 405
    .line 406
    if-eqz v6, :cond_16

    .line 407
    .line 408
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 409
    .line 410
    iget-object v6, v6, Li1/b;->a:Li1/d;

    .line 411
    .line 412
    invoke-interface {v6}, Li1/d;->z()F

    .line 413
    .line 414
    .line 415
    move-result v7

    .line 416
    cmpg-float v7, v7, v9

    .line 417
    .line 418
    if-nez v7, :cond_15

    .line 419
    .line 420
    goto :goto_8

    .line 421
    :cond_15
    invoke-interface {v6}, Li1/d;->o()V

    .line 422
    .line 423
    .line 424
    :cond_16
    :goto_8
    and-int/lit16 v6, v11, 0x800

    .line 425
    .line 426
    if-eqz v6, :cond_18

    .line 427
    .line 428
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 429
    .line 430
    iget v7, v3, Lf1/o0;->q:F

    .line 431
    .line 432
    iget-object v6, v6, Li1/b;->a:Li1/d;

    .line 433
    .line 434
    invoke-interface {v6}, Li1/d;->G()F

    .line 435
    .line 436
    .line 437
    move-result v8

    .line 438
    cmpg-float v8, v8, v7

    .line 439
    .line 440
    if-nez v8, :cond_17

    .line 441
    .line 442
    goto :goto_9

    .line 443
    :cond_17
    invoke-interface {v6, v7}, Li1/d;->u(F)V

    .line 444
    .line 445
    .line 446
    :cond_18
    :goto_9
    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    if-eqz v12, :cond_1b

    .line 452
    .line 453
    const/16 v12, 0x20

    .line 454
    .line 455
    const-wide v16, 0xffffffffL

    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    iget-wide v6, v1, Ly1/o1;->u:J

    .line 461
    .line 462
    move-object v8, v10

    .line 463
    sget-wide v9, Lf1/u0;->b:J

    .line 464
    .line 465
    invoke-static {v6, v7, v9, v10}, Lf1/u0;->a(JJ)Z

    .line 466
    .line 467
    .line 468
    move-result v6

    .line 469
    iget-object v7, v1, Ly1/o1;->g:Li1/b;

    .line 470
    .line 471
    if-eqz v6, :cond_1a

    .line 472
    .line 473
    iget-wide v9, v7, Li1/b;->v:J

    .line 474
    .line 475
    invoke-static {v9, v10, v13, v14}, Le1/b;->b(JJ)Z

    .line 476
    .line 477
    .line 478
    move-result v6

    .line 479
    if-nez v6, :cond_19

    .line 480
    .line 481
    iput-wide v13, v7, Li1/b;->v:J

    .line 482
    .line 483
    iget-object v6, v7, Li1/b;->a:Li1/d;

    .line 484
    .line 485
    invoke-interface {v6, v13, v14}, Li1/d;->C(J)V

    .line 486
    .line 487
    .line 488
    :cond_19
    move v14, v11

    .line 489
    move/from16 v20, v12

    .line 490
    .line 491
    goto :goto_a

    .line 492
    :cond_1a
    iget-wide v9, v1, Ly1/o1;->u:J

    .line 493
    .line 494
    shr-long/2addr v9, v12

    .line 495
    long-to-int v6, v9

    .line 496
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    iget-wide v9, v1, Ly1/o1;->l:J

    .line 501
    .line 502
    shr-long/2addr v9, v12

    .line 503
    long-to-int v9, v9

    .line 504
    int-to-float v9, v9

    .line 505
    mul-float/2addr v6, v9

    .line 506
    iget-wide v9, v1, Ly1/o1;->u:J

    .line 507
    .line 508
    and-long v9, v9, v16

    .line 509
    .line 510
    long-to-int v9, v9

    .line 511
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 512
    .line 513
    .line 514
    move-result v9

    .line 515
    move v10, v12

    .line 516
    iget-wide v12, v1, Ly1/o1;->l:J

    .line 517
    .line 518
    and-long v12, v12, v16

    .line 519
    .line 520
    long-to-int v12, v12

    .line 521
    int-to-float v12, v12

    .line 522
    mul-float/2addr v9, v12

    .line 523
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 524
    .line 525
    .line 526
    move-result v6

    .line 527
    int-to-long v12, v6

    .line 528
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 529
    .line 530
    .line 531
    move-result v6

    .line 532
    move/from16 v20, v10

    .line 533
    .line 534
    move v14, v11

    .line 535
    int-to-long v10, v6

    .line 536
    shl-long v12, v12, v20

    .line 537
    .line 538
    and-long v9, v10, v16

    .line 539
    .line 540
    or-long/2addr v9, v12

    .line 541
    iget-wide v11, v7, Li1/b;->v:J

    .line 542
    .line 543
    invoke-static {v11, v12, v9, v10}, Le1/b;->b(JJ)Z

    .line 544
    .line 545
    .line 546
    move-result v6

    .line 547
    if-nez v6, :cond_1c

    .line 548
    .line 549
    iput-wide v9, v7, Li1/b;->v:J

    .line 550
    .line 551
    iget-object v6, v7, Li1/b;->a:Li1/d;

    .line 552
    .line 553
    invoke-interface {v6, v9, v10}, Li1/d;->C(J)V

    .line 554
    .line 555
    .line 556
    goto :goto_a

    .line 557
    :cond_1b
    move-object v8, v10

    .line 558
    move v14, v11

    .line 559
    const-wide v16, 0xffffffffL

    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    const/16 v20, 0x20

    .line 565
    .line 566
    :cond_1c
    :goto_a
    and-int/lit16 v6, v14, 0x4000

    .line 567
    .line 568
    if-eqz v6, :cond_1d

    .line 569
    .line 570
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 571
    .line 572
    iget-boolean v7, v3, Lf1/o0;->t:Z

    .line 573
    .line 574
    iget-boolean v9, v6, Li1/b;->w:Z

    .line 575
    .line 576
    if-eq v9, v7, :cond_1d

    .line 577
    .line 578
    iput-boolean v7, v6, Li1/b;->w:Z

    .line 579
    .line 580
    const/4 v15, 0x1

    .line 581
    iput-boolean v15, v6, Li1/b;->g:Z

    .line 582
    .line 583
    invoke-virtual {v6}, Li1/b;->a()V

    .line 584
    .line 585
    .line 586
    :cond_1d
    const/high16 v6, 0x20000

    .line 587
    .line 588
    and-int/2addr v6, v14

    .line 589
    const/4 v7, 0x0

    .line 590
    if-eqz v6, :cond_1e

    .line 591
    .line 592
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 593
    .line 594
    invoke-virtual {v6, v7}, Li1/b;->g(Lf1/n0;)V

    .line 595
    .line 596
    .line 597
    :cond_1e
    const/high16 v6, 0x40000

    .line 598
    .line 599
    and-int/2addr v6, v14

    .line 600
    if-eqz v6, :cond_1f

    .line 601
    .line 602
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 603
    .line 604
    iget-object v9, v3, Lf1/o0;->y:Lf1/n;

    .line 605
    .line 606
    iget-object v6, v6, Li1/b;->a:Li1/d;

    .line 607
    .line 608
    invoke-interface {v6}, Li1/d;->x()Lf1/n;

    .line 609
    .line 610
    .line 611
    move-result-object v10

    .line 612
    invoke-static {v10, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v10

    .line 616
    if-nez v10, :cond_1f

    .line 617
    .line 618
    invoke-interface {v6, v9}, Li1/d;->k(Lf1/n;)V

    .line 619
    .line 620
    .line 621
    :cond_1f
    const/high16 v6, 0x80000

    .line 622
    .line 623
    and-int/2addr v6, v14

    .line 624
    if-eqz v6, :cond_21

    .line 625
    .line 626
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 627
    .line 628
    iget v9, v3, Lf1/o0;->z:I

    .line 629
    .line 630
    iget-object v6, v6, Li1/b;->a:Li1/d;

    .line 631
    .line 632
    invoke-interface {v6}, Li1/d;->O()I

    .line 633
    .line 634
    .line 635
    move-result v10

    .line 636
    if-ne v10, v9, :cond_20

    .line 637
    .line 638
    goto :goto_b

    .line 639
    :cond_20
    invoke-interface {v6, v9}, Li1/d;->h(I)V

    .line 640
    .line 641
    .line 642
    :cond_21
    :goto_b
    const v6, 0x8000

    .line 643
    .line 644
    .line 645
    and-int/2addr v6, v14

    .line 646
    if-eqz v6, :cond_26

    .line 647
    .line 648
    iget-object v6, v1, Ly1/o1;->g:Li1/b;

    .line 649
    .line 650
    iget v9, v3, Lf1/o0;->u:I

    .line 651
    .line 652
    if-nez v9, :cond_22

    .line 653
    .line 654
    const/4 v11, 0x0

    .line 655
    goto :goto_c

    .line 656
    :cond_22
    const/4 v15, 0x1

    .line 657
    if-ne v9, v15, :cond_23

    .line 658
    .line 659
    const/4 v11, 0x1

    .line 660
    goto :goto_c

    .line 661
    :cond_23
    const/4 v11, 0x2

    .line 662
    if-ne v9, v11, :cond_25

    .line 663
    .line 664
    :goto_c
    iget-object v6, v6, Li1/b;->a:Li1/d;

    .line 665
    .line 666
    invoke-interface {v6}, Li1/d;->w()I

    .line 667
    .line 668
    .line 669
    move-result v9

    .line 670
    if-ne v9, v11, :cond_24

    .line 671
    .line 672
    goto :goto_d

    .line 673
    :cond_24
    invoke-interface {v6, v11}, Li1/d;->J(I)V

    .line 674
    .line 675
    .line 676
    goto :goto_d

    .line 677
    :cond_25
    const-string v1, "Not supported composition strategy"

    .line 678
    .line 679
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    return-void

    .line 683
    :cond_26
    :goto_d
    and-int/lit16 v6, v14, 0x1f1b

    .line 684
    .line 685
    if-eqz v6, :cond_27

    .line 686
    .line 687
    const/4 v15, 0x1

    .line 688
    iput-boolean v15, v1, Ly1/o1;->w:Z

    .line 689
    .line 690
    iput-boolean v15, v1, Ly1/o1;->x:Z

    .line 691
    .line 692
    :cond_27
    iget-object v6, v1, Ly1/o1;->v:Lf1/c0;

    .line 693
    .line 694
    iget-object v9, v3, Lf1/o0;->A:Lf1/c0;

    .line 695
    .line 696
    invoke-static {v6, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    move-result v6

    .line 700
    if-nez v6, :cond_2f

    .line 701
    .line 702
    iget-object v6, v3, Lf1/o0;->A:Lf1/c0;

    .line 703
    .line 704
    iput-object v6, v1, Ly1/o1;->v:Lf1/c0;

    .line 705
    .line 706
    if-nez v6, :cond_28

    .line 707
    .line 708
    move-object/from16 v27, v8

    .line 709
    .line 710
    goto/16 :goto_f

    .line 711
    .line 712
    :cond_28
    iget-object v9, v1, Ly1/o1;->g:Li1/b;

    .line 713
    .line 714
    instance-of v11, v6, Lf1/k0;

    .line 715
    .line 716
    if-eqz v11, :cond_29

    .line 717
    .line 718
    move-object v11, v6

    .line 719
    check-cast v11, Lf1/k0;

    .line 720
    .line 721
    iget-object v11, v11, Lf1/k0;->f:Le1/c;

    .line 722
    .line 723
    iget v12, v11, Le1/c;->a:F

    .line 724
    .line 725
    iget v13, v11, Le1/c;->b:F

    .line 726
    .line 727
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 728
    .line 729
    .line 730
    move-result v15

    .line 731
    move-object/from16 v27, v8

    .line 732
    .line 733
    int-to-long v7, v15

    .line 734
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 735
    .line 736
    .line 737
    move-result v15

    .line 738
    move-object/from16 v18, v11

    .line 739
    .line 740
    int-to-long v10, v15

    .line 741
    shl-long v7, v7, v20

    .line 742
    .line 743
    and-long v10, v10, v16

    .line 744
    .line 745
    or-long v23, v7, v10

    .line 746
    .line 747
    move-object/from16 v7, v18

    .line 748
    .line 749
    iget v8, v7, Le1/c;->c:F

    .line 750
    .line 751
    sub-float/2addr v8, v12

    .line 752
    iget v7, v7, Le1/c;->d:F

    .line 753
    .line 754
    sub-float/2addr v7, v13

    .line 755
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 756
    .line 757
    .line 758
    move-result v8

    .line 759
    int-to-long v10, v8

    .line 760
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 761
    .line 762
    .line 763
    move-result v7

    .line 764
    int-to-long v7, v7

    .line 765
    shl-long v10, v10, v20

    .line 766
    .line 767
    and-long v7, v7, v16

    .line 768
    .line 769
    or-long v25, v10, v7

    .line 770
    .line 771
    const/16 v22, 0x0

    .line 772
    .line 773
    move-object/from16 v21, v9

    .line 774
    .line 775
    invoke-virtual/range {v21 .. v26}, Li1/b;->h(FJJ)V

    .line 776
    .line 777
    .line 778
    goto/16 :goto_e

    .line 779
    .line 780
    :cond_29
    move-object/from16 v27, v8

    .line 781
    .line 782
    move-object v7, v9

    .line 783
    instance-of v8, v6, Lf1/j0;

    .line 784
    .line 785
    const-wide/16 v10, 0x0

    .line 786
    .line 787
    if-eqz v8, :cond_2a

    .line 788
    .line 789
    move-object v8, v6

    .line 790
    check-cast v8, Lf1/j0;

    .line 791
    .line 792
    iget-object v8, v8, Lf1/j0;->f:Lf1/j;

    .line 793
    .line 794
    const/4 v9, 0x0

    .line 795
    iput-object v9, v7, Li1/b;->k:Lf1/c0;

    .line 796
    .line 797
    const-wide v12, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    iput-wide v12, v7, Li1/b;->i:J

    .line 803
    .line 804
    iput-wide v10, v7, Li1/b;->h:J

    .line 805
    .line 806
    const/4 v9, 0x0

    .line 807
    iput v9, v7, Li1/b;->j:F

    .line 808
    .line 809
    const/4 v15, 0x1

    .line 810
    iput-boolean v15, v7, Li1/b;->g:Z

    .line 811
    .line 812
    const/4 v10, 0x0

    .line 813
    iput-boolean v10, v7, Li1/b;->n:Z

    .line 814
    .line 815
    iput-object v8, v7, Li1/b;->l:Lf1/j;

    .line 816
    .line 817
    invoke-virtual {v7}, Li1/b;->a()V

    .line 818
    .line 819
    .line 820
    goto :goto_e

    .line 821
    :cond_2a
    instance-of v8, v6, Lf1/l0;

    .line 822
    .line 823
    if-eqz v8, :cond_2e

    .line 824
    .line 825
    move-object v8, v6

    .line 826
    check-cast v8, Lf1/l0;

    .line 827
    .line 828
    iget-object v12, v8, Lf1/l0;->g:Lf1/j;

    .line 829
    .line 830
    if-eqz v12, :cond_2b

    .line 831
    .line 832
    const/4 v13, 0x0

    .line 833
    iput-object v13, v7, Li1/b;->k:Lf1/c0;

    .line 834
    .line 835
    const-wide v8, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    iput-wide v8, v7, Li1/b;->i:J

    .line 841
    .line 842
    iput-wide v10, v7, Li1/b;->h:J

    .line 843
    .line 844
    const/4 v9, 0x0

    .line 845
    iput v9, v7, Li1/b;->j:F

    .line 846
    .line 847
    const/4 v15, 0x1

    .line 848
    iput-boolean v15, v7, Li1/b;->g:Z

    .line 849
    .line 850
    const/4 v10, 0x0

    .line 851
    iput-boolean v10, v7, Li1/b;->n:Z

    .line 852
    .line 853
    iput-object v12, v7, Li1/b;->l:Lf1/j;

    .line 854
    .line 855
    invoke-virtual {v7}, Li1/b;->a()V

    .line 856
    .line 857
    .line 858
    goto :goto_e

    .line 859
    :cond_2b
    const/4 v10, 0x0

    .line 860
    iget-object v8, v8, Lf1/l0;->f:Le1/d;

    .line 861
    .line 862
    iget v11, v8, Le1/d;->b:F

    .line 863
    .line 864
    iget v12, v8, Le1/d;->a:F

    .line 865
    .line 866
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 867
    .line 868
    .line 869
    move-result v13

    .line 870
    int-to-long v9, v13

    .line 871
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 872
    .line 873
    .line 874
    move-result v13

    .line 875
    move-wide/from16 v18, v9

    .line 876
    .line 877
    int-to-long v9, v13

    .line 878
    shl-long v18, v18, v20

    .line 879
    .line 880
    and-long v9, v9, v16

    .line 881
    .line 882
    or-long v23, v18, v9

    .line 883
    .line 884
    iget v9, v8, Le1/d;->c:F

    .line 885
    .line 886
    sub-float/2addr v9, v12

    .line 887
    iget v10, v8, Le1/d;->d:F

    .line 888
    .line 889
    sub-float/2addr v10, v11

    .line 890
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 891
    .line 892
    .line 893
    move-result v9

    .line 894
    int-to-long v11, v9

    .line 895
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 896
    .line 897
    .line 898
    move-result v9

    .line 899
    int-to-long v9, v9

    .line 900
    shl-long v11, v11, v20

    .line 901
    .line 902
    and-long v9, v9, v16

    .line 903
    .line 904
    or-long v25, v11, v9

    .line 905
    .line 906
    iget-wide v8, v8, Le1/d;->h:J

    .line 907
    .line 908
    shr-long v8, v8, v20

    .line 909
    .line 910
    long-to-int v8, v8

    .line 911
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 912
    .line 913
    .line 914
    move-result v22

    .line 915
    move-object/from16 v21, v7

    .line 916
    .line 917
    invoke-virtual/range {v21 .. v26}, Li1/b;->h(FJJ)V

    .line 918
    .line 919
    .line 920
    :goto_e
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 921
    .line 922
    const/16 v8, 0x21

    .line 923
    .line 924
    if-ge v7, v8, :cond_2d

    .line 925
    .line 926
    instance-of v7, v6, Lf1/j0;

    .line 927
    .line 928
    if-nez v7, :cond_2c

    .line 929
    .line 930
    instance-of v7, v6, Lf1/l0;

    .line 931
    .line 932
    if-eqz v7, :cond_2d

    .line 933
    .line 934
    check-cast v6, Lf1/l0;

    .line 935
    .line 936
    iget-object v6, v6, Lf1/l0;->f:Le1/d;

    .line 937
    .line 938
    invoke-static {v6}, Lbe/h;->D(Le1/d;)Z

    .line 939
    .line 940
    .line 941
    move-result v6

    .line 942
    if-nez v6, :cond_2d

    .line 943
    .line 944
    :cond_2c
    iget-object v6, v1, Ly1/o1;->k:Lfg/a;

    .line 945
    .line 946
    if-eqz v6, :cond_2d

    .line 947
    .line 948
    invoke-interface {v6}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    :cond_2d
    :goto_f
    const/4 v6, 0x1

    .line 952
    goto :goto_10

    .line 953
    :cond_2e
    invoke-static {}, Lokio/a;->k()V

    .line 954
    .line 955
    .line 956
    return-void

    .line 957
    :cond_2f
    move-object/from16 v27, v8

    .line 958
    .line 959
    const/4 v6, 0x0

    .line 960
    :goto_10
    iget v7, v3, Lf1/o0;->g:I

    .line 961
    .line 962
    iput v7, v1, Ly1/o1;->t:I

    .line 963
    .line 964
    if-nez v14, :cond_30

    .line 965
    .line 966
    if-eqz v6, :cond_32

    .line 967
    .line 968
    :cond_30
    invoke-virtual/range {v27 .. v27}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 969
    .line 970
    .line 971
    move-result-object v1

    .line 972
    if-eqz v1, :cond_31

    .line 973
    .line 974
    move-object/from16 v8, v27

    .line 975
    .line 976
    invoke-interface {v1, v8, v8}, Landroid/view/ViewParent;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    .line 977
    .line 978
    .line 979
    goto :goto_11

    .line 980
    :cond_31
    move-object/from16 v8, v27

    .line 981
    .line 982
    :goto_11
    invoke-static {}, Ly1/t;->r()Z

    .line 983
    .line 984
    .line 985
    move-result v1

    .line 986
    if-eqz v1, :cond_32

    .line 987
    .line 988
    const/4 v9, 0x0

    .line 989
    invoke-virtual {v8, v9}, Ly1/t;->P(F)V

    .line 990
    .line 991
    .line 992
    :cond_32
    iget-boolean v1, v0, Lx1/i1;->y:Z

    .line 993
    .line 994
    iget-boolean v6, v3, Lf1/o0;->t:Z

    .line 995
    .line 996
    iput-boolean v6, v0, Lx1/i1;->y:Z

    .line 997
    .line 998
    iget v3, v3, Lf1/o0;->j:F

    .line 999
    .line 1000
    iput v3, v0, Lx1/i1;->C:F

    .line 1001
    .line 1002
    iget v3, v5, Lx1/t;->a:F

    .line 1003
    .line 1004
    iget v6, v2, Lx1/t;->a:F

    .line 1005
    .line 1006
    cmpg-float v3, v3, v6

    .line 1007
    .line 1008
    if-nez v3, :cond_33

    .line 1009
    .line 1010
    iget v3, v5, Lx1/t;->b:F

    .line 1011
    .line 1012
    iget v6, v2, Lx1/t;->b:F

    .line 1013
    .line 1014
    cmpg-float v3, v3, v6

    .line 1015
    .line 1016
    if-nez v3, :cond_33

    .line 1017
    .line 1018
    iget v3, v5, Lx1/t;->c:F

    .line 1019
    .line 1020
    iget v6, v2, Lx1/t;->c:F

    .line 1021
    .line 1022
    cmpg-float v3, v3, v6

    .line 1023
    .line 1024
    if-nez v3, :cond_33

    .line 1025
    .line 1026
    iget v3, v5, Lx1/t;->d:F

    .line 1027
    .line 1028
    iget v6, v2, Lx1/t;->d:F

    .line 1029
    .line 1030
    cmpg-float v3, v3, v6

    .line 1031
    .line 1032
    if-nez v3, :cond_33

    .line 1033
    .line 1034
    iget v3, v5, Lx1/t;->e:F

    .line 1035
    .line 1036
    iget v6, v2, Lx1/t;->e:F

    .line 1037
    .line 1038
    cmpg-float v3, v3, v6

    .line 1039
    .line 1040
    if-nez v3, :cond_33

    .line 1041
    .line 1042
    iget v3, v5, Lx1/t;->f:F

    .line 1043
    .line 1044
    iget v6, v2, Lx1/t;->f:F

    .line 1045
    .line 1046
    cmpg-float v3, v3, v6

    .line 1047
    .line 1048
    if-nez v3, :cond_33

    .line 1049
    .line 1050
    iget v3, v5, Lx1/t;->g:F

    .line 1051
    .line 1052
    iget v6, v2, Lx1/t;->g:F

    .line 1053
    .line 1054
    cmpg-float v3, v3, v6

    .line 1055
    .line 1056
    if-nez v3, :cond_33

    .line 1057
    .line 1058
    iget v3, v5, Lx1/t;->h:F

    .line 1059
    .line 1060
    iget v6, v2, Lx1/t;->h:F

    .line 1061
    .line 1062
    cmpg-float v3, v3, v6

    .line 1063
    .line 1064
    if-nez v3, :cond_33

    .line 1065
    .line 1066
    iget-wide v5, v5, Lx1/t;->i:J

    .line 1067
    .line 1068
    iget-wide v2, v2, Lx1/t;->i:J

    .line 1069
    .line 1070
    invoke-static {v5, v6, v2, v3}, Lf1/u0;->a(JJ)Z

    .line 1071
    .line 1072
    .line 1073
    move-result v2

    .line 1074
    if-eqz v2, :cond_33

    .line 1075
    .line 1076
    const/16 v28, 0x1

    .line 1077
    .line 1078
    goto :goto_12

    .line 1079
    :cond_33
    const/16 v28, 0x0

    .line 1080
    .line 1081
    :goto_12
    if-eqz p1, :cond_35

    .line 1082
    .line 1083
    if-eqz v28, :cond_34

    .line 1084
    .line 1085
    iget-boolean v2, v0, Lx1/i1;->y:Z

    .line 1086
    .line 1087
    if-eq v1, v2, :cond_35

    .line 1088
    .line 1089
    :cond_34
    iget-object v1, v4, Lx1/f0;->t:Lx1/r1;

    .line 1090
    .line 1091
    if-eqz v1, :cond_35

    .line 1092
    .line 1093
    check-cast v1, Ly1/t;

    .line 1094
    .line 1095
    invoke-virtual {v1, v4}, Ly1/t;->B(Lx1/f0;)V

    .line 1096
    .line 1097
    .line 1098
    :cond_35
    if-nez v28, :cond_39

    .line 1099
    .line 1100
    invoke-virtual {v4, v0}, Lx1/f0;->N(Lx1/i1;)V

    .line 1101
    .line 1102
    .line 1103
    iget v1, v4, Lx1/f0;->V:I

    .line 1104
    .line 1105
    if-lez v1, :cond_39

    .line 1106
    .line 1107
    invoke-static {v4}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v1

    .line 1111
    check-cast v1, Ly1/t;

    .line 1112
    .line 1113
    iget-object v2, v1, Ly1/t;->f0:Lx1/t0;

    .line 1114
    .line 1115
    iget-object v2, v2, Lx1/t0;->e:Lp4/t;

    .line 1116
    .line 1117
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1118
    .line 1119
    .line 1120
    iget v3, v4, Lx1/f0;->V:I

    .line 1121
    .line 1122
    if-lez v3, :cond_36

    .line 1123
    .line 1124
    iget-object v2, v2, Lp4/t;->h:Ljava/lang/Object;

    .line 1125
    .line 1126
    check-cast v2, Lj0/b;

    .line 1127
    .line 1128
    invoke-virtual {v2, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 1129
    .line 1130
    .line 1131
    const/4 v15, 0x1

    .line 1132
    iput-boolean v15, v4, Lx1/f0;->U:Z

    .line 1133
    .line 1134
    :cond_36
    const/4 v9, 0x0

    .line 1135
    invoke-virtual {v1, v9}, Ly1/t;->I(Lx1/f0;)V

    .line 1136
    .line 1137
    .line 1138
    return-void

    .line 1139
    :cond_37
    const-string v1, "updateLayerParameters requires a non-null layerBlock"

    .line 1140
    .line 1141
    invoke-static {v1}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v1

    .line 1145
    throw v1

    .line 1146
    :cond_38
    if-nez v2, :cond_3a

    .line 1147
    .line 1148
    :cond_39
    :goto_13
    return-void

    .line 1149
    :cond_3a
    const-string v1, "null layer with a non-null layerBlock"

    .line 1150
    .line 1151
    invoke-static {v1}, Lu1/a;->b(Ljava/lang/String;)V

    .line 1152
    .line 1153
    .line 1154
    return-void
.end method

.method public final S0()Lx1/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/i1;->v:Lx1/i1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final S1(J)Z
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide v1, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long v3, p1, v1

    .line 9
    .line 10
    xor-long/2addr v1, v3

    .line 11
    const-wide v3, 0x100000001L

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    sub-long/2addr v1, v3

    .line 17
    const-wide v3, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v1, v3

    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    cmp-long v1, v1, v3

    .line 26
    .line 27
    if-nez v1, :cond_d

    .line 28
    .line 29
    iget-object v1, v0, Lx1/i1;->R:Lx1/q1;

    .line 30
    .line 31
    if-eqz v1, :cond_c

    .line 32
    .line 33
    iget-boolean v4, v0, Lx1/i1;->y:Z

    .line 34
    .line 35
    if-eqz v4, :cond_c

    .line 36
    .line 37
    check-cast v1, Ly1/o1;

    .line 38
    .line 39
    const/16 v4, 0x20

    .line 40
    .line 41
    shr-long v5, p1, v4

    .line 42
    .line 43
    long-to-int v5, v5

    .line 44
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    const-wide v7, 0xffffffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long v9, p1, v7

    .line 54
    .line 55
    long-to-int v5, v9

    .line 56
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    iget-object v1, v1, Ly1/o1;->g:Li1/b;

    .line 61
    .line 62
    iget-boolean v9, v1, Li1/b;->w:Z

    .line 63
    .line 64
    if-eqz v9, :cond_b

    .line 65
    .line 66
    invoke-virtual {v1}, Li1/b;->d()Lf1/c0;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    instance-of v9, v1, Lf1/k0;

    .line 71
    .line 72
    if-eqz v9, :cond_1

    .line 73
    .line 74
    check-cast v1, Lf1/k0;

    .line 75
    .line 76
    iget-object v1, v1, Lf1/k0;->f:Le1/c;

    .line 77
    .line 78
    iget v4, v1, Le1/c;->a:F

    .line 79
    .line 80
    cmpg-float v4, v4, v6

    .line 81
    .line 82
    if-gtz v4, :cond_0

    .line 83
    .line 84
    iget v4, v1, Le1/c;->c:F

    .line 85
    .line 86
    cmpg-float v4, v6, v4

    .line 87
    .line 88
    if-gez v4, :cond_0

    .line 89
    .line 90
    iget v4, v1, Le1/c;->b:F

    .line 91
    .line 92
    cmpg-float v4, v4, v5

    .line 93
    .line 94
    if-gtz v4, :cond_0

    .line 95
    .line 96
    iget v1, v1, Le1/c;->d:F

    .line 97
    .line 98
    cmpg-float v1, v5, v1

    .line 99
    .line 100
    if-gez v1, :cond_0

    .line 101
    .line 102
    goto/16 :goto_2

    .line 103
    .line 104
    :cond_0
    const/4 v15, 0x0

    .line 105
    const/16 v16, 0x1

    .line 106
    .line 107
    goto/16 :goto_1

    .line 108
    .line 109
    :cond_1
    instance-of v9, v1, Lf1/l0;

    .line 110
    .line 111
    if-eqz v9, :cond_9

    .line 112
    .line 113
    check-cast v1, Lf1/l0;

    .line 114
    .line 115
    iget-object v1, v1, Lf1/l0;->f:Le1/d;

    .line 116
    .line 117
    iget v9, v1, Le1/d;->c:F

    .line 118
    .line 119
    iget v10, v1, Le1/d;->b:F

    .line 120
    .line 121
    iget v11, v1, Le1/d;->d:F

    .line 122
    .line 123
    iget v12, v1, Le1/d;->a:F

    .line 124
    .line 125
    iget-wide v13, v1, Le1/d;->f:J

    .line 126
    .line 127
    const/4 v15, 0x0

    .line 128
    const/16 v16, 0x1

    .line 129
    .line 130
    iget-wide v2, v1, Le1/d;->h:J

    .line 131
    .line 132
    move/from16 v17, v4

    .line 133
    .line 134
    move/from16 p1, v5

    .line 135
    .line 136
    iget-wide v4, v1, Le1/d;->g:J

    .line 137
    .line 138
    move-wide/from16 v18, v7

    .line 139
    .line 140
    iget-wide v7, v1, Le1/d;->e:J

    .line 141
    .line 142
    cmpg-float v20, v6, v12

    .line 143
    .line 144
    if-ltz v20, :cond_8

    .line 145
    .line 146
    cmpl-float v20, v6, v9

    .line 147
    .line 148
    if-gez v20, :cond_8

    .line 149
    .line 150
    cmpg-float v20, p1, v10

    .line 151
    .line 152
    if-ltz v20, :cond_8

    .line 153
    .line 154
    cmpl-float v20, p1, v11

    .line 155
    .line 156
    if-ltz v20, :cond_2

    .line 157
    .line 158
    goto/16 :goto_1

    .line 159
    .line 160
    :cond_2
    move-wide/from16 v21, v2

    .line 161
    .line 162
    shr-long v2, v7, v17

    .line 163
    .line 164
    long-to-int v2, v2

    .line 165
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    move/from16 v20, v2

    .line 170
    .line 171
    move/from16 p2, v3

    .line 172
    .line 173
    shr-long v2, v13, v17

    .line 174
    .line 175
    long-to-int v2, v2

    .line 176
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    add-float v3, v3, p2

    .line 181
    .line 182
    sub-float v23, v9, v12

    .line 183
    .line 184
    cmpg-float v3, v3, v23

    .line 185
    .line 186
    if-gtz v3, :cond_7

    .line 187
    .line 188
    move/from16 v23, v2

    .line 189
    .line 190
    shr-long v2, v21, v17

    .line 191
    .line 192
    long-to-int v2, v2

    .line 193
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    move/from16 p2, v2

    .line 198
    .line 199
    move/from16 v24, v3

    .line 200
    .line 201
    shr-long v2, v4, v17

    .line 202
    .line 203
    long-to-int v2, v2

    .line 204
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    add-float v3, v3, v24

    .line 209
    .line 210
    sub-float v17, v9, v12

    .line 211
    .line 212
    cmpg-float v3, v3, v17

    .line 213
    .line 214
    if-gtz v3, :cond_7

    .line 215
    .line 216
    and-long v7, v7, v18

    .line 217
    .line 218
    long-to-int v3, v7

    .line 219
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    move v8, v2

    .line 224
    move/from16 v17, v3

    .line 225
    .line 226
    and-long v2, v21, v18

    .line 227
    .line 228
    long-to-int v2, v2

    .line 229
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    add-float/2addr v3, v7

    .line 234
    sub-float v7, v11, v10

    .line 235
    .line 236
    cmpg-float v3, v3, v7

    .line 237
    .line 238
    if-gtz v3, :cond_7

    .line 239
    .line 240
    and-long v13, v13, v18

    .line 241
    .line 242
    long-to-int v3, v13

    .line 243
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    and-long v4, v4, v18

    .line 248
    .line 249
    long-to-int v4, v4

    .line 250
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    add-float/2addr v5, v7

    .line 255
    sub-float v7, v11, v10

    .line 256
    .line 257
    cmpg-float v5, v5, v7

    .line 258
    .line 259
    if-gtz v5, :cond_7

    .line 260
    .line 261
    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    add-float/2addr v5, v12

    .line 266
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    add-float/2addr v7, v10

    .line 271
    invoke-static/range {v23 .. v23}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 272
    .line 273
    .line 274
    move-result v13

    .line 275
    sub-float v13, v9, v13

    .line 276
    .line 277
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    add-float/2addr v3, v10

    .line 282
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    sub-float v8, v9, v8

    .line 287
    .line 288
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    sub-float v9, v11, v4

    .line 293
    .line 294
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    sub-float/2addr v11, v2

    .line 299
    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    add-float/2addr v2, v12

    .line 304
    cmpg-float v4, v6, v5

    .line 305
    .line 306
    if-gez v4, :cond_3

    .line 307
    .line 308
    cmpg-float v4, p1, v7

    .line 309
    .line 310
    if-gez v4, :cond_3

    .line 311
    .line 312
    iget-wide v10, v1, Le1/d;->e:J

    .line 313
    .line 314
    move v8, v5

    .line 315
    move v9, v7

    .line 316
    move/from16 v7, p1

    .line 317
    .line 318
    invoke-static/range {v6 .. v11}, Ly1/g0;->r(FFFFJ)Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    goto/16 :goto_3

    .line 323
    .line 324
    :cond_3
    move/from16 v7, p1

    .line 325
    .line 326
    cmpg-float v4, v6, v2

    .line 327
    .line 328
    if-gez v4, :cond_4

    .line 329
    .line 330
    cmpl-float v4, v7, v11

    .line 331
    .line 332
    if-lez v4, :cond_4

    .line 333
    .line 334
    move v9, v11

    .line 335
    iget-wide v10, v1, Le1/d;->h:J

    .line 336
    .line 337
    move v8, v2

    .line 338
    invoke-static/range {v6 .. v11}, Ly1/g0;->r(FFFFJ)Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    goto :goto_3

    .line 343
    :cond_4
    move v11, v9

    .line 344
    cmpl-float v2, v6, v13

    .line 345
    .line 346
    if-lez v2, :cond_5

    .line 347
    .line 348
    cmpg-float v2, v7, v3

    .line 349
    .line 350
    if-gez v2, :cond_5

    .line 351
    .line 352
    iget-wide v10, v1, Le1/d;->f:J

    .line 353
    .line 354
    move v9, v3

    .line 355
    move v8, v13

    .line 356
    invoke-static/range {v6 .. v11}, Ly1/g0;->r(FFFFJ)Z

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    goto :goto_3

    .line 361
    :cond_5
    cmpl-float v2, v6, v8

    .line 362
    .line 363
    if-lez v2, :cond_6

    .line 364
    .line 365
    cmpl-float v2, v7, v11

    .line 366
    .line 367
    if-lez v2, :cond_6

    .line 368
    .line 369
    move v9, v11

    .line 370
    iget-wide v10, v1, Le1/d;->g:J

    .line 371
    .line 372
    invoke-static/range {v6 .. v11}, Ly1/g0;->r(FFFFJ)Z

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    goto :goto_3

    .line 377
    :cond_6
    :goto_0
    move/from16 v1, v16

    .line 378
    .line 379
    goto :goto_3

    .line 380
    :cond_7
    move/from16 v7, p1

    .line 381
    .line 382
    invoke-static {}, Lf1/l;->a()Lf1/j;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    invoke-static {v2, v1}, Lf1/j;->c(Lf1/j;Le1/d;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v6, v7, v2}, Ly1/g0;->q(FFLf1/j;)Z

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    goto :goto_3

    .line 394
    :cond_8
    :goto_1
    move v1, v15

    .line 395
    goto :goto_3

    .line 396
    :cond_9
    move v7, v5

    .line 397
    const/4 v15, 0x0

    .line 398
    const/16 v16, 0x1

    .line 399
    .line 400
    instance-of v2, v1, Lf1/j0;

    .line 401
    .line 402
    if-eqz v2, :cond_a

    .line 403
    .line 404
    check-cast v1, Lf1/j0;

    .line 405
    .line 406
    iget-object v1, v1, Lf1/j0;->f:Lf1/j;

    .line 407
    .line 408
    invoke-static {v6, v7, v1}, Ly1/g0;->q(FFLf1/j;)Z

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    goto :goto_3

    .line 413
    :cond_a
    invoke-static {}, Lokio/a;->k()V

    .line 414
    .line 415
    .line 416
    const/4 v1, 0x0

    .line 417
    return v1

    .line 418
    :cond_b
    :goto_2
    const/4 v15, 0x0

    .line 419
    const/16 v16, 0x1

    .line 420
    .line 421
    goto :goto_0

    .line 422
    :goto_3
    if-eqz v1, :cond_e

    .line 423
    .line 424
    goto :goto_4

    .line 425
    :cond_c
    const/16 v16, 0x1

    .line 426
    .line 427
    :goto_4
    return v16

    .line 428
    :cond_d
    const/4 v15, 0x0

    .line 429
    :cond_e
    return v15
.end method

.method public final T0()Lv1/t;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final W(Lv1/t;J)J
    .locals 3

    .line 1
    instance-of v0, p1, Lv1/l0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lv1/l0;

    .line 6
    .line 7
    iget-object v0, p1, Lv1/l0;->g:Lx1/o0;

    .line 8
    .line 9
    iget-object v0, v0, Lx1/o0;->u:Lx1/i1;

    .line 10
    .line 11
    invoke-virtual {v0}, Lx1/i1;->A1()V

    .line 12
    .line 13
    .line 14
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    xor-long/2addr p2, v0

    .line 20
    invoke-virtual {p1, p0, p2, p3}, Lv1/l0;->W(Lv1/t;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    xor-long/2addr p1, v0

    .line 25
    return-wide p1

    .line 26
    :cond_0
    invoke-static {p1}, Lx1/i1;->M1(Lv1/t;)Lx1/i1;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lx1/i1;->A1()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lx1/i1;->n1(Lx1/i1;)Lx1/i1;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    if-eq p1, v0, :cond_3

    .line 38
    .line 39
    iget-object v1, p1, Lx1/i1;->R:Lx1/q1;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    check-cast v1, Ly1/o1;

    .line 44
    .line 45
    invoke-virtual {v1}, Ly1/o1;->b()[F

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-boolean v1, v1, Ly1/o1;->y:Z

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {p2, p3, v2}, Lf1/i0;->b(J[F)J

    .line 55
    .line 56
    .line 57
    move-result-wide p2

    .line 58
    :cond_2
    :goto_1
    iget-wide v1, p1, Lx1/i1;->F:J

    .line 59
    .line 60
    invoke-static {p2, p3, v1, v2}, Lig/a;->R(JJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide p2

    .line 64
    iget-object p1, p1, Lx1/i1;->w:Lx1/i1;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    invoke-virtual {p0, v0, p2, p3}, Lx1/i1;->h1(Lx1/i1;J)J

    .line 71
    .line 72
    .line 73
    move-result-wide p1

    .line 74
    return-wide p1
.end method

.method public final X()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lx1/i1;->u:Lx1/f0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/f0;->L:Lx1/b1;

    .line 4
    .line 5
    const/16 v2, 0x40

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lx1/b1;->d(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_9

    .line 13
    .line 14
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lx1/f0;->L:Lx1/b1;

    .line 18
    .line 19
    iget-object v1, v1, Lx1/b1;->e:Lx1/b2;

    .line 20
    .line 21
    move-object v4, v3

    .line 22
    :goto_0
    if-eqz v1, :cond_8

    .line 23
    .line 24
    iget v5, v1, Ly0/n;->i:I

    .line 25
    .line 26
    and-int/2addr v5, v2

    .line 27
    if-eqz v5, :cond_7

    .line 28
    .line 29
    move-object v5, v1

    .line 30
    move-object v6, v3

    .line 31
    :goto_1
    if-eqz v5, :cond_7

    .line 32
    .line 33
    instance-of v7, v5, Lx1/u1;

    .line 34
    .line 35
    if-eqz v7, :cond_0

    .line 36
    .line 37
    check-cast v5, Lx1/u1;

    .line 38
    .line 39
    iget-object v7, v0, Lx1/f0;->E:Lu2/c;

    .line 40
    .line 41
    invoke-interface {v5, v7, v4}, Lx1/u1;->R(Lu2/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    goto :goto_4

    .line 46
    :cond_0
    iget v7, v5, Ly0/n;->i:I

    .line 47
    .line 48
    and-int/2addr v7, v2

    .line 49
    if-eqz v7, :cond_6

    .line 50
    .line 51
    instance-of v7, v5, Lx1/j;

    .line 52
    .line 53
    if-eqz v7, :cond_6

    .line 54
    .line 55
    move-object v7, v5

    .line 56
    check-cast v7, Lx1/j;

    .line 57
    .line 58
    iget-object v7, v7, Lx1/j;->v:Ly0/n;

    .line 59
    .line 60
    const/4 v8, 0x0

    .line 61
    :goto_2
    const/4 v9, 0x1

    .line 62
    if-eqz v7, :cond_5

    .line 63
    .line 64
    iget v10, v7, Ly0/n;->i:I

    .line 65
    .line 66
    and-int/2addr v10, v2

    .line 67
    if-eqz v10, :cond_4

    .line 68
    .line 69
    add-int/lit8 v8, v8, 0x1

    .line 70
    .line 71
    if-ne v8, v9, :cond_1

    .line 72
    .line 73
    move-object v5, v7

    .line 74
    goto :goto_3

    .line 75
    :cond_1
    if-nez v6, :cond_2

    .line 76
    .line 77
    new-instance v6, Lj0/b;

    .line 78
    .line 79
    const/16 v9, 0x10

    .line 80
    .line 81
    new-array v9, v9, [Ly0/n;

    .line 82
    .line 83
    invoke-direct {v6, v9}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    if-eqz v5, :cond_3

    .line 87
    .line 88
    invoke-virtual {v6, v5}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object v5, v3

    .line 92
    :cond_3
    invoke-virtual {v6, v7}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    :goto_3
    iget-object v7, v7, Ly0/n;->l:Ly0/n;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    if-ne v8, v9, :cond_6

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_6
    :goto_4
    invoke-static {v6}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    goto :goto_1

    .line 106
    :cond_7
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_8
    return-object v4

    .line 110
    :cond_9
    return-object v3
.end method

.method public final X0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/i1;->D:Lv1/o0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final Y0()Lx1/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/i1;->u:Lx1/f0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Z0()Lv1/o0;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/i1;->D:Lv1/o0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "Asking for measurement result of unmeasured layout modifier"

    .line 7
    .line 8
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final a1()Lx1/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/i1;->w:Lx1/i1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b0()Lv1/t;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 6
    .line 7
    iget-object v1, p0, Lx1/i1;->u:Lx1/f0;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 14
    .line 15
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    move-object v2, v1

    .line 19
    :goto_0
    if-eqz v2, :cond_0

    .line 20
    .line 21
    const-string v3, "\n|"

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v3, " isAttached="

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lx1/f0;->G()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, " modifier="

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v3, v2, Lx1/f0;->Q:Ly0/o;

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v3, " tail="

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-virtual {p0}, Lx1/i1;->A1()V

    .line 76
    .line 77
    .line 78
    iget-object v0, v1, Lx1/f0;->L:Lx1/b1;

    .line 79
    .line 80
    iget-object v0, v0, Lx1/b1;->d:Lx1/i1;

    .line 81
    .line 82
    iget-object v0, v0, Lx1/i1;->w:Lx1/i1;

    .line 83
    .line 84
    return-object v0
.end method

.method public final b1()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lx1/i1;->F:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()F
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/i1;->u:Lx1/f0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/f0;->E:Lu2/c;

    .line 4
    .line 5
    invoke-interface {v0}, Lu2/c;->d()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final f1()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/i1;->S:Li1/b;

    .line 2
    .line 3
    iget-wide v1, p0, Lx1/i1;->F:J

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v3, p0, Lx1/i1;->G:F

    .line 8
    .line 9
    invoke-virtual {p0, v1, v2, v3, v0}, Lx1/i1;->B0(JFLi1/b;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget v0, p0, Lx1/i1;->G:F

    .line 14
    .line 15
    iget-object v3, p0, Lx1/i1;->z:Lfg/l;

    .line 16
    .line 17
    invoke-virtual {p0, v1, v2, v0, v3}, Lv1/b1;->A0(JFLfg/l;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final g0(Lv1/t;[F)V
    .locals 1

    .line 1
    invoke-static {p1}, Lx1/i1;->M1(Lv1/t;)Lx1/i1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lx1/i1;->A1()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lx1/i1;->n1(Lx1/i1;)Lx1/i1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p2}, Lf1/i0;->d([F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0, p2}, Lx1/i1;->P1(Lx1/i1;[F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0, p2}, Lx1/i1;->O1(Lx1/i1;[F)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final g1(Lx1/i1;Le1/a;Z)V
    .locals 7

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lx1/i1;->w:Lx1/i1;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lx1/i1;->g1(Lx1/i1;Le1/a;Z)V

    .line 9
    .line 10
    .line 11
    :cond_1
    iget-wide v0, p0, Lx1/i1;->F:J

    .line 12
    .line 13
    const/16 p1, 0x20

    .line 14
    .line 15
    shr-long v2, v0, p1

    .line 16
    .line 17
    long-to-int v2, v2

    .line 18
    iget v3, p2, Le1/a;->a:F

    .line 19
    .line 20
    int-to-float v2, v2

    .line 21
    sub-float/2addr v3, v2

    .line 22
    iput v3, p2, Le1/a;->a:F

    .line 23
    .line 24
    iget v3, p2, Le1/a;->c:F

    .line 25
    .line 26
    sub-float/2addr v3, v2

    .line 27
    iput v3, p2, Le1/a;->c:F

    .line 28
    .line 29
    const-wide v2, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v0, v2

    .line 35
    long-to-int v0, v0

    .line 36
    iget v1, p2, Le1/a;->b:F

    .line 37
    .line 38
    int-to-float v0, v0

    .line 39
    sub-float/2addr v1, v0

    .line 40
    iput v1, p2, Le1/a;->b:F

    .line 41
    .line 42
    iget v1, p2, Le1/a;->d:F

    .line 43
    .line 44
    sub-float/2addr v1, v0

    .line 45
    iput v1, p2, Le1/a;->d:F

    .line 46
    .line 47
    iget-object v0, p0, Lx1/i1;->R:Lx1/q1;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    check-cast v0, Ly1/o1;

    .line 52
    .line 53
    invoke-virtual {v0}, Ly1/o1;->a()[F

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-boolean v0, v0, Ly1/o1;->y:Z

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    if-nez v1, :cond_2

    .line 63
    .line 64
    iput v4, p2, Le1/a;->a:F

    .line 65
    .line 66
    iput v4, p2, Le1/a;->b:F

    .line 67
    .line 68
    iput v4, p2, Le1/a;->c:F

    .line 69
    .line 70
    iput v4, p2, Le1/a;->d:F

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-static {v1, p2}, Lf1/i0;->c([FLe1/a;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lx1/i1;->y:Z

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    if-eqz p3, :cond_4

    .line 81
    .line 82
    iget-wide v0, p0, Lv1/b1;->i:J

    .line 83
    .line 84
    shr-long v5, v0, p1

    .line 85
    .line 86
    long-to-int p1, v5

    .line 87
    int-to-float p1, p1

    .line 88
    and-long/2addr v0, v2

    .line 89
    long-to-int p3, v0

    .line 90
    int-to-float p3, p3

    .line 91
    invoke-virtual {p2, v4, v4, p1, p3}, Le1/a;->a(FFFF)V

    .line 92
    .line 93
    .line 94
    :cond_4
    :goto_1
    return-void
.end method

.method public final getLayoutDirection()Lu2/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/i1;->u:Lx1/f0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/f0;->F:Lu2/m;

    .line 4
    .line 5
    return-object v0
.end method

.method public final h1(Lx1/i1;J)J
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-wide p2

    .line 4
    :cond_0
    iget-object v0, p0, Lx1/i1;->w:Lx1/i1;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Lx1/i1;->h1(Lx1/i1;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-virtual {p0, p1, p2}, Lx1/i1;->o1(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    return-wide p1

    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3}, Lx1/i1;->o1(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    return-wide p1
.end method

.method public final i1(J)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0}, Lv1/b1;->w0()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    int-to-float v2, v2

    .line 15
    sub-float/2addr v1, v2

    .line 16
    const-wide v2, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr p1, v2

    .line 22
    long-to-int p1, p1

    .line 23
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0}, Lv1/b1;->r0()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    int-to-float p2, p2

    .line 32
    sub-float/2addr p1, p2

    .line 33
    const/high16 p2, 0x40000000    # 2.0f

    .line 34
    .line 35
    div-float/2addr v1, p2

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    div-float/2addr p1, p2

    .line 42
    invoke-static {v4, p1}, Ljava/lang/Math;->max(FF)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    int-to-long v4, p2

    .line 51
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    int-to-long p1, p1

    .line 56
    shl-long v0, v4, v0

    .line 57
    .line 58
    and-long/2addr p1, v2

    .line 59
    or-long/2addr p1, v0

    .line 60
    return-wide p1
.end method

.method public final j0(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lx1/i1;->u:Lx1/f0;

    .line 15
    .line 16
    invoke-static {v0}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ly1/t;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Ly1/t;->J(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    invoke-static {p0}, Lv1/w;->h(Lv1/t;)Lv1/t;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0, p1, p2}, Lx1/i1;->W(Lv1/t;J)J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    return-wide p1
.end method

.method public final j1(JJ)F
    .locals 8

    .line 1
    invoke-virtual {p0}, Lv1/b1;->w0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    shr-long v2, p3, v1

    .line 9
    .line 10
    long-to-int v2, v2

    .line 11
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    cmpl-float v0, v0, v2

    .line 16
    .line 17
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 18
    .line 19
    const-wide v3, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    if-ltz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lv1/b1;->r0()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-float v0, v0

    .line 31
    and-long v5, p3, v3

    .line 32
    .line 33
    long-to-int v5, v5

    .line 34
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    cmpl-float v0, v0, v5

    .line 39
    .line 40
    if-ltz v0, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    invoke-virtual {p0, p3, p4}, Lx1/i1;->i1(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide p3

    .line 47
    shr-long v5, p3, v1

    .line 48
    .line 49
    long-to-int v0, v5

    .line 50
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    and-long/2addr p3, v3

    .line 55
    long-to-int p3, p3

    .line 56
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    shr-long v5, p1, v1

    .line 61
    .line 62
    long-to-int p4, v5

    .line 63
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    const/4 v5, 0x0

    .line 68
    cmpg-float v6, p4, v5

    .line 69
    .line 70
    if-gez v6, :cond_1

    .line 71
    .line 72
    neg-float p4, p4

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p0}, Lv1/b1;->w0()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    int-to-float v6, v6

    .line 79
    sub-float/2addr p4, v6

    .line 80
    :goto_0
    invoke-static {v5, p4}, Ljava/lang/Math;->max(FF)F

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    and-long/2addr p1, v3

    .line 85
    long-to-int p1, p1

    .line 86
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    cmpg-float p2, p1, v5

    .line 91
    .line 92
    if-gez p2, :cond_2

    .line 93
    .line 94
    neg-float p1, p1

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {p0}, Lv1/b1;->r0()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    int-to-float p2, p2

    .line 101
    sub-float/2addr p1, p2

    .line 102
    :goto_1
    invoke-static {v5, p1}, Ljava/lang/Math;->max(FF)F

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    int-to-long v6, p2

    .line 111
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    int-to-long p1, p1

    .line 116
    shl-long/2addr v6, v1

    .line 117
    and-long/2addr p1, v3

    .line 118
    or-long/2addr p1, v6

    .line 119
    cmpl-float p4, v0, v5

    .line 120
    .line 121
    if-gtz p4, :cond_3

    .line 122
    .line 123
    cmpl-float p4, p3, v5

    .line 124
    .line 125
    if-lez p4, :cond_4

    .line 126
    .line 127
    :cond_3
    shr-long v5, p1, v1

    .line 128
    .line 129
    long-to-int p4, v5

    .line 130
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    cmpg-float v0, v1, v0

    .line 135
    .line 136
    if-gtz v0, :cond_4

    .line 137
    .line 138
    and-long/2addr p1, v3

    .line 139
    long-to-int p1, p1

    .line 140
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    cmpg-float p2, p2, p3

    .line 145
    .line 146
    if-gtz p2, :cond_4

    .line 147
    .line 148
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    mul-float/2addr p2, p2

    .line 157
    mul-float/2addr p1, p1

    .line 158
    add-float/2addr p1, p2

    .line 159
    return p1

    .line 160
    :cond_4
    return v2
.end method

.method public final k0(Lv1/t;Z)Le1/c;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-interface {p1}, Lv1/t;->C()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "LayoutCoordinates "

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, " is not attached!"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-static {p1}, Lx1/i1;->M1(Lv1/t;)Lx1/i1;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lx1/i1;->A1()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lx1/i1;->n1(Lx1/i1;)Lx1/i1;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v2, p0, Lx1/i1;->H:Le1/a;

    .line 54
    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    new-instance v2, Le1/a;

    .line 58
    .line 59
    invoke-direct {v2}, Le1/a;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v2, p0, Lx1/i1;->H:Le1/a;

    .line 63
    .line 64
    :cond_2
    const/4 v3, 0x0

    .line 65
    iput v3, v2, Le1/a;->a:F

    .line 66
    .line 67
    iput v3, v2, Le1/a;->b:F

    .line 68
    .line 69
    invoke-interface {p1}, Lv1/t;->F()J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    const/16 v5, 0x20

    .line 74
    .line 75
    shr-long/2addr v3, v5

    .line 76
    long-to-int v3, v3

    .line 77
    int-to-float v3, v3

    .line 78
    iput v3, v2, Le1/a;->c:F

    .line 79
    .line 80
    invoke-interface {p1}, Lv1/t;->F()J

    .line 81
    .line 82
    .line 83
    move-result-wide v3

    .line 84
    const-wide v5, 0xffffffffL

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long/2addr v3, v5

    .line 90
    long-to-int p1, v3

    .line 91
    int-to-float p1, p1

    .line 92
    iput p1, v2, Le1/a;->d:F

    .line 93
    .line 94
    :goto_0
    if-eq v0, v1, :cond_4

    .line 95
    .line 96
    const/4 p1, 0x0

    .line 97
    invoke-virtual {v0, v2, p2, p1}, Lx1/i1;->I1(Le1/a;ZZ)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Le1/a;->b()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    sget-object p1, Le1/c;->e:Le1/c;

    .line 107
    .line 108
    return-object p1

    .line 109
    :cond_3
    iget-object v0, v0, Lx1/i1;->w:Lx1/i1;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    invoke-virtual {p0, v1, v2, p2}, Lx1/i1;->g1(Lx1/i1;Le1/a;Z)V

    .line 116
    .line 117
    .line 118
    new-instance p1, Le1/c;

    .line 119
    .line 120
    iget p2, v2, Le1/a;->a:F

    .line 121
    .line 122
    iget v0, v2, Le1/a;->b:F

    .line 123
    .line 124
    iget v1, v2, Le1/a;->c:F

    .line 125
    .line 126
    iget v2, v2, Le1/a;->d:F

    .line 127
    .line 128
    invoke-direct {p1, p2, v0, v1, v2}, Le1/c;-><init>(FFFF)V

    .line 129
    .line 130
    .line 131
    return-object p1
.end method

.method public final k1(Lf1/u;Li1/b;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lx1/i1;->R:Lx1/q1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast v0, Ly1/o1;

    .line 6
    .line 7
    iget-object v1, v0, Ly1/o1;->s:Lh1/b;

    .line 8
    .line 9
    invoke-virtual {v0}, Ly1/o1;->g()V

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Ly1/o1;->g:Li1/b;

    .line 13
    .line 14
    iget-object v2, v2, Li1/b;->a:Li1/d;

    .line 15
    .line 16
    invoke-interface {v2}, Li1/d;->M()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    cmpl-float v2, v2, v3

    .line 22
    .line 23
    if-lez v2, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v2, 0x0

    .line 28
    :goto_0
    iput-boolean v2, v0, Ly1/o1;->z:Z

    .line 29
    .line 30
    iget-object v2, v1, Lh1/b;->h:Lb5/c;

    .line 31
    .line 32
    invoke-virtual {v2, p1}, Lb5/c;->P(Lf1/u;)V

    .line 33
    .line 34
    .line 35
    iput-object p2, v2, Lb5/c;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object p1, v0, Ly1/o1;->g:Li1/b;

    .line 38
    .line 39
    invoke-static {v1, p1}, Loh/h;->u(Lh1/d;Li1/b;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iget-wide v0, p0, Lx1/i1;->F:J

    .line 44
    .line 45
    const/16 v2, 0x20

    .line 46
    .line 47
    shr-long v2, v0, v2

    .line 48
    .line 49
    long-to-int v2, v2

    .line 50
    int-to-float v2, v2

    .line 51
    const-wide v3, 0xffffffffL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr v0, v3

    .line 57
    long-to-int v0, v0

    .line 58
    int-to-float v0, v0

    .line 59
    invoke-interface {p1, v2, v0}, Lf1/u;->m(FF)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1, p2}, Lx1/i1;->l1(Lf1/u;Li1/b;)V

    .line 63
    .line 64
    .line 65
    neg-float p2, v2

    .line 66
    neg-float v0, v0

    .line 67
    invoke-interface {p1, p2, v0}, Lf1/u;->m(FF)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final l1(Lf1/u;Li1/b;)V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lx1/i1;->s1(I)Ly0/n;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lx1/i1;->G1(Lf1/u;Li1/b;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v2, p0, Lx1/i1;->u:Lx1/f0;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ly1/t;

    .line 22
    .line 23
    invoke-virtual {v2}, Ly1/t;->getSharedDrawScope()Lx1/h0;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-wide v4, p0, Lv1/b1;->i:J

    .line 28
    .line 29
    invoke-static {v4, v5}, Lr9/e0;->q0(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    move-object v10, v2

    .line 38
    :goto_0
    if-eqz v1, :cond_8

    .line 39
    .line 40
    instance-of v4, v1, Lx1/m;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    move-object v8, v1

    .line 45
    check-cast v8, Lx1/m;

    .line 46
    .line 47
    move-object v7, p0

    .line 48
    move-object v4, p1

    .line 49
    move-object v9, p2

    .line 50
    invoke-virtual/range {v3 .. v9}, Lx1/h0;->j(Lf1/u;JLx1/i1;Lx1/m;Li1/b;)V

    .line 51
    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_1
    move-object v4, p1

    .line 55
    move-object v9, p2

    .line 56
    iget p1, v1, Ly0/n;->i:I

    .line 57
    .line 58
    and-int/2addr p1, v0

    .line 59
    if-eqz p1, :cond_7

    .line 60
    .line 61
    instance-of p1, v1, Lx1/j;

    .line 62
    .line 63
    if-eqz p1, :cond_7

    .line 64
    .line 65
    move-object p1, v1

    .line 66
    check-cast p1, Lx1/j;

    .line 67
    .line 68
    iget-object p1, p1, Lx1/j;->v:Ly0/n;

    .line 69
    .line 70
    const/4 p2, 0x0

    .line 71
    :goto_1
    const/4 v7, 0x1

    .line 72
    if-eqz p1, :cond_6

    .line 73
    .line 74
    iget v8, p1, Ly0/n;->i:I

    .line 75
    .line 76
    and-int/2addr v8, v0

    .line 77
    if-eqz v8, :cond_5

    .line 78
    .line 79
    add-int/lit8 p2, p2, 0x1

    .line 80
    .line 81
    if-ne p2, v7, :cond_2

    .line 82
    .line 83
    move-object v1, p1

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    if-nez v10, :cond_3

    .line 86
    .line 87
    new-instance v10, Lj0/b;

    .line 88
    .line 89
    const/16 v7, 0x10

    .line 90
    .line 91
    new-array v7, v7, [Ly0/n;

    .line 92
    .line 93
    invoke-direct {v10, v7}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    if-eqz v1, :cond_4

    .line 97
    .line 98
    invoke-virtual {v10, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    move-object v1, v2

    .line 102
    :cond_4
    invoke-virtual {v10, p1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_5
    :goto_2
    iget-object p1, p1, Ly0/n;->l:Ly0/n;

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_6
    if-ne p2, v7, :cond_7

    .line 109
    .line 110
    :goto_3
    move-object p1, v4

    .line 111
    move-object p2, v9

    .line 112
    goto :goto_0

    .line 113
    :cond_7
    :goto_4
    invoke-static {v10}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    goto :goto_3

    .line 118
    :cond_8
    return-void
.end method

.method public final m(J)J
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lx1/i1;->m0(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-object v0, p0, Lx1/i1;->u:Lx1/f0;

    .line 6
    .line 7
    invoke-static {v0}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ly1/t;

    .line 12
    .line 13
    invoke-virtual {v0}, Ly1/t;->F()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Ly1/t;->j0:[F

    .line 17
    .line 18
    invoke-static {p1, p2, v0}, Lf1/i0;->b(J[F)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    return-wide p1
.end method

.method public final m0(J)J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lx1/i1;->A1()V

    .line 15
    .line 16
    .line 17
    move-object v0, p0

    .line 18
    :goto_0
    if-eqz v0, :cond_4

    .line 19
    .line 20
    iget-object v1, v0, Lx1/i1;->u:Lx1/f0;

    .line 21
    .line 22
    iget-object v2, v1, Lx1/f0;->L:Lx1/b1;

    .line 23
    .line 24
    iget-object v2, v2, Lx1/b1;->d:Lx1/i1;

    .line 25
    .line 26
    if-ne v0, v2, :cond_1

    .line 27
    .line 28
    iget-boolean v2, v1, Lx1/f0;->i:Z

    .line 29
    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    invoke-static {v1}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ly1/t;

    .line 37
    .line 38
    invoke-virtual {v2}, Ly1/t;->getRectManager()Lg2/b;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2, v1}, Lg2/b;->b(Lx1/f0;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    const-wide v3, 0x7fffffff7fffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    invoke-static {v1, v2, v3, v4}, Lu2/j;->b(JJ)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_1

    .line 56
    .line 57
    invoke-static {p1, p2, v1, v2}, Lig/a;->R(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    return-wide p1

    .line 62
    :cond_1
    iget-object v1, v0, Lx1/i1;->R:Lx1/q1;

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    check-cast v1, Ly1/o1;

    .line 67
    .line 68
    invoke-virtual {v1}, Ly1/o1;->b()[F

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-boolean v1, v1, Ly1/o1;->y:Z

    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-static {p1, p2, v2}, Lf1/i0;->b(J[F)J

    .line 78
    .line 79
    .line 80
    move-result-wide p1

    .line 81
    :cond_3
    :goto_1
    iget-wide v1, v0, Lx1/i1;->F:J

    .line 82
    .line 83
    invoke-static {p1, p2, v1, v2}, Lig/a;->R(JJ)J

    .line 84
    .line 85
    .line 86
    move-result-wide p1

    .line 87
    iget-object v0, v0, Lx1/i1;->w:Lx1/i1;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    return-wide p1
.end method

.method public abstract m1()V
.end method

.method public final n1(Lx1/i1;)Lx1/i1;
    .locals 5

    .line 1
    iget-object v0, p1, Lx1/i1;->u:Lx1/f0;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/i1;->u:Lx1/f0;

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Lx1/i1;->r1()Ly0/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v1, Ly0/n;->g:Ly0/n;

    .line 16
    .line 17
    iget-boolean v2, v2, Ly0/n;->t:Z

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const-string v2, "visitLocalAncestors called on an unattached node"

    .line 22
    .line 23
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v1, v1, Ly0/n;->g:Ly0/n;

    .line 27
    .line 28
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 29
    .line 30
    :goto_0
    if-eqz v1, :cond_7

    .line 31
    .line 32
    iget v2, v1, Ly0/n;->i:I

    .line 33
    .line 34
    and-int/lit8 v2, v2, 0x2

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    if-ne v1, v0, :cond_1

    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_1
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    iget v2, v0, Lx1/f0;->v:I

    .line 45
    .line 46
    iget v3, v1, Lx1/f0;->v:I

    .line 47
    .line 48
    if-le v2, v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0}, Lx1/f0;->u()Lx1/f0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move-object v2, v1

    .line 59
    :goto_2
    iget v3, v2, Lx1/f0;->v:I

    .line 60
    .line 61
    iget v4, v0, Lx1/f0;->v:I

    .line 62
    .line 63
    if-le v3, v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    :goto_3
    if-eq v0, v2, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0}, Lx1/f0;->u()Lx1/f0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    const-string p1, "layouts are not part of the same hierarchy"

    .line 89
    .line 90
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    return-object p1

    .line 95
    :cond_6
    if-ne v2, v1, :cond_8

    .line 96
    .line 97
    :cond_7
    return-object p0

    .line 98
    :cond_8
    iget-object v1, p1, Lx1/i1;->u:Lx1/f0;

    .line 99
    .line 100
    if-ne v0, v1, :cond_9

    .line 101
    .line 102
    :goto_4
    return-object p1

    .line 103
    :cond_9
    iget-object p1, v0, Lx1/f0;->L:Lx1/b1;

    .line 104
    .line 105
    iget-object p1, p1, Lx1/b1;->c:Lx1/r;

    .line 106
    .line 107
    return-object p1
.end method

.method public final o1(J)J
    .locals 6

    .line 1
    iget-wide v0, p0, Lx1/i1;->F:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    shr-long v3, p1, v2

    .line 6
    .line 7
    long-to-int v3, v3

    .line 8
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    shr-long v4, v0, v2

    .line 13
    .line 14
    long-to-int v4, v4

    .line 15
    int-to-float v4, v4

    .line 16
    sub-float/2addr v3, v4

    .line 17
    const-wide v4, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr p1, v4

    .line 23
    long-to-int p1, p1

    .line 24
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-long/2addr v0, v4

    .line 29
    long-to-int p2, v0

    .line 30
    int-to-float p2, p2

    .line 31
    sub-float/2addr p1, p2

    .line 32
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    int-to-long v0, p2

    .line 37
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    int-to-long p1, p1

    .line 42
    shl-long/2addr v0, v2

    .line 43
    and-long/2addr p1, v4

    .line 44
    or-long/2addr p1, v0

    .line 45
    iget-object v0, p0, Lx1/i1;->R:Lx1/q1;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    check-cast v0, Ly1/o1;

    .line 50
    .line 51
    invoke-virtual {v0}, Ly1/o1;->a()[F

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-nez v1, :cond_0

    .line 56
    .line 57
    const-wide p1, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    return-wide p1

    .line 63
    :cond_0
    iget-boolean v0, v0, Ly1/o1;->y:Z

    .line 64
    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {p1, p2, v1}, Lf1/i0;->b(J[F)J

    .line 69
    .line 70
    .line 71
    move-result-wide p1

    .line 72
    :cond_2
    :goto_0
    return-wide p1
.end method

.method public abstract p1()Lx1/o0;
.end method

.method public final q0()F
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/i1;->u:Lx1/f0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/f0;->E:Lu2/c;

    .line 4
    .line 5
    invoke-interface {v0}, Lu2/c;->q0()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final q1()J
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/i1;->A:Lu2/c;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/i1;->u:Lx1/f0;

    .line 4
    .line 5
    iget-object v1, v1, Lx1/f0;->G:Ly1/l2;

    .line 6
    .line 7
    invoke-interface {v1}, Ly1/l2;->d()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-interface {v0, v1, v2}, Lu2/c;->L0(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method

.method public abstract r1()Ly0/n;
.end method

.method public final s1(I)Ly0/n;
    .locals 3

    .line 1
    invoke-static {p1}, Lx1/j1;->g(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lx1/i1;->r1()Ly0/n;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lx1/i1;->t1(Z)Ly0/n;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_1
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget v2, v0, Ly0/n;->j:I

    .line 24
    .line 25
    and-int/2addr v2, p1

    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    iget v2, v0, Ly0/n;->i:I

    .line 29
    .line 30
    and-int/2addr v2, p1

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_2
    if-eq v0, v1, :cond_3

    .line 35
    .line 36
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    :goto_2
    const/4 p1, 0x0

    .line 40
    return-object p1
.end method

.method public final t1(Z)Ly0/n;
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/i1;->u:Lx1/f0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/f0;->L:Lx1/b1;

    .line 4
    .line 5
    iget-object v1, v0, Lx1/b1;->d:Lx1/i1;

    .line 6
    .line 7
    if-ne v1, p0, :cond_0

    .line 8
    .line 9
    iget-object p1, v0, Lx1/b1;->f:Ly0/n;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v0, p0, Lx1/i1;->w:Lx1/i1;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Lx1/i1;->r1()Ly0/n;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object p1, p1, Ly0/n;->l:Ly0/n;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Lx1/i1;->r1()Ly0/n;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_2
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method public final u1(Ly0/n;Lx1/e1;JLx1/p;IZ)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object v4, p5

    .line 7
    move v5, p6

    .line 8
    move v6, p7

    .line 9
    invoke-virtual/range {v0 .. v6}, Lx1/i1;->x1(Lx1/e1;JLx1/p;IZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    move-object v2, p2

    .line 14
    move-wide v3, p3

    .line 15
    move-object v5, p5

    .line 16
    move v6, p6

    .line 17
    move v7, p7

    .line 18
    invoke-interface {v2, p1}, Lx1/e1;->b(Ly0/n;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    invoke-interface {v2}, Lx1/e1;->a()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-static {p1, p2}, Lx1/k;->d(Lx1/i;I)Ly0/n;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    move-object v0, p0

    .line 33
    invoke-virtual/range {v0 .. v7}, Lx1/i1;->u1(Ly0/n;Lx1/e1;JLx1/p;IZ)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget p2, v5, Lx1/p;->i:I

    .line 38
    .line 39
    iget-object p3, v5, Lx1/p;->g:Lf/f0;

    .line 40
    .line 41
    add-int/lit8 p4, p2, 0x1

    .line 42
    .line 43
    iget p5, p3, Lf/f0;->b:I

    .line 44
    .line 45
    invoke-virtual {v5, p4, p5}, Lx1/p;->c(II)V

    .line 46
    .line 47
    .line 48
    iget p4, v5, Lx1/p;->i:I

    .line 49
    .line 50
    add-int/lit8 p4, p4, 0x1

    .line 51
    .line 52
    iput p4, v5, Lx1/p;->i:I

    .line 53
    .line 54
    invoke-virtual {p3, p1}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p3, v5, Lx1/p;->h:Lf/y;

    .line 58
    .line 59
    const/high16 p4, -0x40800000    # -1.0f

    .line 60
    .line 61
    const/4 p5, 0x0

    .line 62
    invoke-static {p4, v7, p5}, Lx1/k;->a(FZZ)J

    .line 63
    .line 64
    .line 65
    move-result-wide p4

    .line 66
    invoke-virtual {p3, p4, p5}, Lf/y;->a(J)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v2}, Lx1/e1;->a()I

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    invoke-static {p1, p3}, Lx1/k;->d(Lx1/i;I)Ly0/n;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    move-object v0, p0

    .line 78
    invoke-virtual/range {v0 .. v7}, Lx1/i1;->u1(Ly0/n;Lx1/e1;JLx1/p;IZ)V

    .line 79
    .line 80
    .line 81
    iput p2, v5, Lx1/p;->i:I

    .line 82
    .line 83
    return-void
.end method

.method public final v1(Ly0/n;Lx1/e1;JLx1/p;IZF)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object/from16 v4, p5

    .line 7
    .line 8
    move/from16 v5, p6

    .line 9
    .line 10
    move/from16 v6, p7

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v6}, Lx1/i1;->x1(Lx1/e1;JLx1/p;IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-interface {p2, p1}, Lx1/e1;->b(Ly0/n;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Lx1/e1;->a()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {p1, v0}, Lx1/k;->d(Lx1/i;I)Ly0/n;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v0, p0

    .line 31
    move-object v2, p2

    .line 32
    move-wide v3, p3

    .line 33
    move-object/from16 v5, p5

    .line 34
    .line 35
    move/from16 v6, p6

    .line 36
    .line 37
    move/from16 v7, p7

    .line 38
    .line 39
    move/from16 v8, p8

    .line 40
    .line 41
    invoke-virtual/range {v0 .. v8}, Lx1/i1;->v1(Ly0/n;Lx1/e1;JLx1/p;IZF)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    move-object/from16 v5, p5

    .line 46
    .line 47
    iget v10, v5, Lx1/p;->i:I

    .line 48
    .line 49
    iget-object v0, v5, Lx1/p;->g:Lf/f0;

    .line 50
    .line 51
    add-int/lit8 v1, v10, 0x1

    .line 52
    .line 53
    iget v2, v0, Lf/f0;->b:I

    .line 54
    .line 55
    invoke-virtual {v5, v1, v2}, Lx1/p;->c(II)V

    .line 56
    .line 57
    .line 58
    iget v1, v5, Lx1/p;->i:I

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    iput v1, v5, Lx1/p;->i:I

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v5, Lx1/p;->h:Lf/y;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    move/from16 v7, p7

    .line 71
    .line 72
    move/from16 v8, p8

    .line 73
    .line 74
    invoke-static {v8, v7, v1}, Lx1/k;->a(FZZ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v1

    .line 78
    invoke-virtual {v0, v1, v2}, Lf/y;->a(J)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p2}, Lx1/e1;->a()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {p1, v0}, Lx1/k;->d(Lx1/i;I)Ly0/n;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const/4 v9, 0x1

    .line 90
    move-object v0, p0

    .line 91
    move-object v2, p2

    .line 92
    move-wide v3, p3

    .line 93
    move/from16 v6, p6

    .line 94
    .line 95
    invoke-virtual/range {v0 .. v9}, Lx1/i1;->F1(Ly0/n;Lx1/e1;JLx1/p;IZFZ)V

    .line 96
    .line 97
    .line 98
    iput v10, v5, Lx1/p;->i:I

    .line 99
    .line 100
    return-void
.end method

.method public final w(Lv1/t;J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lx1/i1;->W(Lv1/t;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
.end method

.method public final w1(Lx1/e1;JLx1/p;IZ)V
    .locals 14

    .line 1
    move-wide/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    move/from16 v6, p5

    .line 6
    .line 7
    invoke-interface {p1}, Lx1/e1;->a()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, v0}, Lx1/i1;->s1(I)Ly0/n;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v3, v4}, Lx1/i1;->S1(J)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/high16 v9, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 21
    .line 22
    const v10, 0x7fffffff

    .line 23
    .line 24
    .line 25
    const/4 v11, 0x1

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    if-ne v6, v11, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lx1/i1;->q1()J

    .line 31
    .line 32
    .line 33
    move-result-wide v12

    .line 34
    invoke-virtual {p0, v3, v4, v12, v13}, Lx1/i1;->j1(JJ)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    and-int/2addr v2, v10

    .line 43
    if-ge v2, v9, :cond_1

    .line 44
    .line 45
    iget v2, v5, Lx1/p;->i:I

    .line 46
    .line 47
    iget-object v7, v5, Lx1/p;->g:Lf/f0;

    .line 48
    .line 49
    iget v7, v7, Lf/f0;->b:I

    .line 50
    .line 51
    sub-int/2addr v7, v11

    .line 52
    if-ne v2, v7, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v0, v8, v8}, Lx1/k;->a(FZZ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v7

    .line 59
    invoke-virtual {v5}, Lx1/p;->a()J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    invoke-static {v9, v10, v7, v8}, Lx1/k;->g(JJ)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-lez v2, :cond_1

    .line 68
    .line 69
    :goto_0
    const/4 v7, 0x0

    .line 70
    move-object v2, p1

    .line 71
    move v8, v0

    .line 72
    move-object v0, p0

    .line 73
    invoke-virtual/range {v0 .. v8}, Lx1/i1;->v1(Ly0/n;Lx1/e1;JLx1/p;IZF)V

    .line 74
    .line 75
    .line 76
    :cond_1
    return-void

    .line 77
    :cond_2
    if-nez v1, :cond_3

    .line 78
    .line 79
    invoke-virtual/range {p0 .. p6}, Lx1/i1;->x1(Lx1/e1;JLx1/p;IZ)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    const/16 v0, 0x20

    .line 84
    .line 85
    shr-long v2, p2, v0

    .line 86
    .line 87
    long-to-int v0, v2

    .line 88
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    const-wide v2, 0xffffffffL

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    and-long v2, p2, v2

    .line 98
    .line 99
    long-to-int v2, v2

    .line 100
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v3, 0x0

    .line 105
    cmpl-float v4, v0, v3

    .line 106
    .line 107
    if-ltz v4, :cond_4

    .line 108
    .line 109
    cmpl-float v3, v2, v3

    .line 110
    .line 111
    if-ltz v3, :cond_4

    .line 112
    .line 113
    invoke-virtual {p0}, Lv1/b1;->w0()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    int-to-float v3, v3

    .line 118
    cmpg-float v0, v0, v3

    .line 119
    .line 120
    if-gez v0, :cond_4

    .line 121
    .line 122
    invoke-virtual {p0}, Lv1/b1;->r0()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    int-to-float v0, v0

    .line 127
    cmpg-float v0, v2, v0

    .line 128
    .line 129
    if-gez v0, :cond_4

    .line 130
    .line 131
    move-object v0, p0

    .line 132
    move-object v2, p1

    .line 133
    move-wide/from16 v3, p2

    .line 134
    .line 135
    move-object/from16 v5, p4

    .line 136
    .line 137
    move/from16 v6, p5

    .line 138
    .line 139
    move/from16 v7, p6

    .line 140
    .line 141
    invoke-virtual/range {v0 .. v7}, Lx1/i1;->u1(Ly0/n;Lx1/e1;JLx1/p;IZ)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_4
    move-wide/from16 v3, p2

    .line 146
    .line 147
    move-object/from16 v5, p4

    .line 148
    .line 149
    move/from16 v6, p5

    .line 150
    .line 151
    if-ne v6, v11, :cond_5

    .line 152
    .line 153
    invoke-virtual {p0}, Lx1/i1;->q1()J

    .line 154
    .line 155
    .line 156
    move-result-wide v12

    .line 157
    invoke-virtual {p0, v3, v4, v12, v13}, Lx1/i1;->j1(JJ)F

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    goto :goto_1

    .line 162
    :cond_5
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 163
    .line 164
    :goto_1
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    and-int/2addr v7, v10

    .line 169
    if-ge v7, v9, :cond_7

    .line 170
    .line 171
    iget v7, v5, Lx1/p;->i:I

    .line 172
    .line 173
    iget-object v9, v5, Lx1/p;->g:Lf/f0;

    .line 174
    .line 175
    iget v9, v9, Lf/f0;->b:I

    .line 176
    .line 177
    sub-int/2addr v9, v11

    .line 178
    if-ne v7, v9, :cond_6

    .line 179
    .line 180
    move/from16 v7, p6

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_6
    move/from16 v7, p6

    .line 184
    .line 185
    invoke-static {v2, v7, v8}, Lx1/k;->a(FZZ)J

    .line 186
    .line 187
    .line 188
    move-result-wide v9

    .line 189
    invoke-virtual {v5}, Lx1/p;->a()J

    .line 190
    .line 191
    .line 192
    move-result-wide v12

    .line 193
    invoke-static {v12, v13, v9, v10}, Lx1/k;->g(JJ)I

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-lez v9, :cond_8

    .line 198
    .line 199
    :goto_2
    move v9, v11

    .line 200
    :goto_3
    move-object v0, p0

    .line 201
    move v8, v2

    .line 202
    move-object v2, p1

    .line 203
    goto :goto_4

    .line 204
    :cond_7
    move/from16 v7, p6

    .line 205
    .line 206
    :cond_8
    move v9, v8

    .line 207
    goto :goto_3

    .line 208
    :goto_4
    invoke-virtual/range {v0 .. v9}, Lx1/i1;->F1(Ly0/n;Lx1/e1;JLx1/p;IZFZ)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public x1(Lx1/e1;JLx1/p;IZ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lx1/i1;->v:Lx1/i1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p2, p3}, Lx1/i1;->o1(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    move-object v1, p1

    .line 10
    move-object v4, p4

    .line 11
    move v5, p5

    .line 12
    move v6, p6

    .line 13
    invoke-virtual/range {v0 .. v6}, Lx1/i1;->w1(Lx1/e1;JLx1/p;IZ)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final y1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/i1;->R:Lx1/q1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Ly1/o1;

    .line 6
    .line 7
    invoke-virtual {v0}, Ly1/o1;->c()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lx1/i1;->w:Lx1/i1;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lx1/i1;->y1()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final z1()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/i1;->R:Lx1/q1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lx1/i1;->C:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, Lx1/i1;->w:Lx1/i1;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lx1/i1;->z1()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return v0
.end method
