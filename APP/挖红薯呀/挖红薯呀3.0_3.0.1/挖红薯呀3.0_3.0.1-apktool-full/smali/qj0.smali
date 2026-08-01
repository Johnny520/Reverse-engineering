.class public abstract Lqj0;
.super Lyb0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsd0;
.implements Li50;
.implements Len0;


# static fields
.field public static final P:Lgv0;

.field public static final Q:Lf50;

.field public static final R:Lr3;

.field public static final S:Lr3;


# instance fields
.field public A:Lyd0;

.field public B:Lch0;

.field public C:J

.field public D:F

.field public E:Lih0;

.field public F:Lf50;

.field public G:Lx01;

.field public H:Z

.field public I:Z

.field public J:Lvx;

.field public K:Lbd;

.field public L:Lm4;

.field public final M:Lnj0;

.field public N:Z

.field public O:Lcn0;

.field public final r:Lb60;

.field public s:Lqj0;

.field public t:Lqj0;

.field public u:Z

.field public v:Z

.field public w:Lsw;

.field public x:Lym;

.field public y:Lk50;

.field public z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgv0;

    .line 2
    .line 3
    invoke-direct {v0}, Lgv0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqj0;->P:Lgv0;

    .line 7
    .line 8
    new-instance v0, Lf50;

    .line 9
    .line 10
    invoke-direct {v0}, Lf50;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lqj0;->Q:Lf50;

    .line 14
    .line 15
    new-instance v0, Lr3;

    .line 16
    .line 17
    const/16 v1, 0x1c

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lr3;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lqj0;->R:Lr3;

    .line 23
    .line 24
    new-instance v0, Lr3;

    .line 25
    .line 26
    const/16 v1, 0x1d

    .line 27
    .line 28
    invoke-direct {v0, v1}, Lr3;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lqj0;->S:Lr3;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Lb60;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lyb0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqj0;->r:Lb60;

    .line 5
    .line 6
    iget-object v0, p1, Lb60;->B:Lym;

    .line 7
    .line 8
    iput-object v0, p0, Lqj0;->x:Lym;

    .line 9
    .line 10
    iget-object p1, p1, Lb60;->C:Lk50;

    .line 11
    .line 12
    iput-object p1, p0, Lqj0;->y:Lk50;

    .line 13
    .line 14
    const p1, 0x3f4ccccd    # 0.8f

    .line 15
    .line 16
    .line 17
    iput p1, p0, Lqj0;->z:F

    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    iput-wide v0, p0, Lqj0;->C:J

    .line 22
    .line 23
    sget-object p1, Lpf1;->i:Lfz;

    .line 24
    .line 25
    iput-object p1, p0, Lqj0;->G:Lx01;

    .line 26
    .line 27
    new-instance p1, Lnj0;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-direct {p1, p0, v0}, Lnj0;-><init>(Lqj0;I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lqj0;->M:Lnj0;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final A(Li50;J)J
    .locals 3

    .line 1
    instance-of v0, p1, Lbc0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lbc0;

    .line 6
    .line 7
    iget-object v0, p1, Lbc0;->d:Lac0;

    .line 8
    .line 9
    iget-object v0, v0, Lac0;->r:Lqj0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lqj0;->Q0()V

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
    invoke-virtual {p1, p0, p2, p3}, Lbc0;->A(Li50;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    xor-long/2addr p0, v0

    .line 25
    return-wide p0

    .line 26
    :cond_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    check-cast v0, Lbc0;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, Lbc0;->d:Lac0;

    .line 36
    .line 37
    iget-object v0, v0, Lac0;->r:Lqj0;

    .line 38
    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-object v0, p1

    .line 45
    check-cast v0, Lqj0;

    .line 46
    .line 47
    :cond_3
    invoke-virtual {v0}, Lqj0;->Q0()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lqj0;->C0(Lqj0;)Lqj0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :goto_1
    if-eq v0, p1, :cond_6

    .line 55
    .line 56
    iget-object v1, v0, Lqj0;->O:Lcn0;

    .line 57
    .line 58
    if-eqz v1, :cond_5

    .line 59
    .line 60
    check-cast v1, Lxx;

    .line 61
    .line 62
    invoke-virtual {v1}, Lxx;->b()[F

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-boolean v1, v1, Lxx;->v:Z

    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-static {v2, p2, p3}, Lr60;->s([FJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide p2

    .line 75
    :cond_5
    :goto_2
    iget-wide v1, v0, Lqj0;->C:J

    .line 76
    .line 77
    invoke-static {p2, p3, v1, v2}, Li4;->y(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide p2

    .line 81
    iget-object v0, v0, Lqj0;->t:Lqj0;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_6
    invoke-virtual {p0, p1, p2, p3}, Lqj0;->w0(Lqj0;J)J

    .line 88
    .line 89
    .line 90
    move-result-wide p0

    .line 91
    return-wide p0
.end method

.method public final A0(Lbd;Lvx;)V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lqj0;->H0(I)Loe0;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lqj0;->W0(Lbd;Lvx;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v2, p0, Lqj0;->r:Lb60;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Le60;->a(Lb60;)Ldn0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lw3;

    .line 22
    .line 23
    invoke-virtual {v2}, Lw3;->getSharedDrawScope()Ld60;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-wide v4, p0, Lxq0;->f:J

    .line 28
    .line 29
    invoke-static {v4, v5}, Lo30;->C(J)J

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
    instance-of v4, v1, Ltq;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    move-object v8, v1

    .line 45
    check-cast v8, Ltq;

    .line 46
    .line 47
    move-object v7, p0

    .line 48
    move-object v4, p1

    .line 49
    move-object v9, p2

    .line 50
    invoke-virtual/range {v3 .. v9}, Ld60;->d(Lbd;JLqj0;Ltq;Lvx;)V

    .line 51
    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_1
    move-object v7, p0

    .line 55
    move-object v4, p1

    .line 56
    move-object v9, p2

    .line 57
    iget p0, v1, Loe0;->f:I

    .line 58
    .line 59
    and-int/2addr p0, v0

    .line 60
    if-eqz p0, :cond_7

    .line 61
    .line 62
    instance-of p0, v1, Lsm;

    .line 63
    .line 64
    if-eqz p0, :cond_7

    .line 65
    .line 66
    move-object p0, v1

    .line 67
    check-cast p0, Lsm;

    .line 68
    .line 69
    iget-object p0, p0, Lsm;->s:Loe0;

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    :goto_1
    const/4 p2, 0x1

    .line 73
    if-eqz p0, :cond_6

    .line 74
    .line 75
    iget v8, p0, Loe0;->f:I

    .line 76
    .line 77
    and-int/2addr v8, v0

    .line 78
    if-eqz v8, :cond_5

    .line 79
    .line 80
    add-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    if-ne p1, p2, :cond_2

    .line 83
    .line 84
    move-object v1, p0

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    if-nez v10, :cond_3

    .line 87
    .line 88
    new-instance v10, Lsh0;

    .line 89
    .line 90
    const/16 p2, 0x10

    .line 91
    .line 92
    new-array p2, p2, [Loe0;

    .line 93
    .line 94
    invoke-direct {v10, p2}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    if-eqz v1, :cond_4

    .line 98
    .line 99
    invoke-virtual {v10, v1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move-object v1, v2

    .line 103
    :cond_4
    invoke-virtual {v10, p0}, Lsh0;->b(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    :goto_2
    iget-object p0, p0, Loe0;->i:Loe0;

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_6
    if-ne p1, p2, :cond_7

    .line 110
    .line 111
    :goto_3
    move-object p1, v4

    .line 112
    move-object p0, v7

    .line 113
    move-object p2, v9

    .line 114
    goto :goto_0

    .line 115
    :cond_7
    :goto_4
    invoke-static {v10}, Lpf1;->f(Lsh0;)Loe0;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    goto :goto_3

    .line 120
    :cond_8
    return-void
.end method

.method public final B(Li50;Z)Lst0;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Loe0;->q:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-interface {p1}, Li50;->z()Z

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
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    instance-of v0, p1, Lbc0;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    move-object v0, p1

    .line 47
    check-cast v0, Lbc0;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v0, 0x0

    .line 51
    :goto_0
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v0, v0, Lbc0;->d:Lac0;

    .line 54
    .line 55
    iget-object v0, v0, Lac0;->r:Lqj0;

    .line 56
    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    :cond_3
    move-object v0, p1

    .line 60
    check-cast v0, Lqj0;

    .line 61
    .line 62
    :cond_4
    invoke-virtual {v0}, Lqj0;->Q0()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lqj0;->C0(Lqj0;)Lqj0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v2, p0, Lqj0;->E:Lih0;

    .line 70
    .line 71
    if-nez v2, :cond_5

    .line 72
    .line 73
    new-instance v2, Lih0;

    .line 74
    .line 75
    invoke-direct {v2}, Lih0;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v2, p0, Lqj0;->E:Lih0;

    .line 79
    .line 80
    :cond_5
    const/4 v3, 0x0

    .line 81
    iput v3, v2, Lih0;->a:F

    .line 82
    .line 83
    iput v3, v2, Lih0;->b:F

    .line 84
    .line 85
    invoke-interface {p1}, Li50;->G()J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    const/16 v5, 0x20

    .line 90
    .line 91
    shr-long/2addr v3, v5

    .line 92
    long-to-int v3, v3

    .line 93
    int-to-float v3, v3

    .line 94
    iput v3, v2, Lih0;->c:F

    .line 95
    .line 96
    invoke-interface {p1}, Li50;->G()J

    .line 97
    .line 98
    .line 99
    move-result-wide v3

    .line 100
    const-wide v5, 0xffffffffL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    and-long/2addr v3, v5

    .line 106
    long-to-int p1, v3

    .line 107
    int-to-float p1, p1

    .line 108
    iput p1, v2, Lih0;->d:F

    .line 109
    .line 110
    :goto_1
    if-eq v0, v1, :cond_7

    .line 111
    .line 112
    const/4 p1, 0x0

    .line 113
    invoke-virtual {v0, v2, p2, p1}, Lqj0;->Y0(Lih0;ZZ)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Lih0;->b()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_6

    .line 121
    .line 122
    sget-object p0, Lst0;->e:Lst0;

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_6
    iget-object v0, v0, Lqj0;->t:Lqj0;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_7
    invoke-virtual {p0, v1, v2, p2}, Lqj0;->v0(Lqj0;Lih0;Z)V

    .line 132
    .line 133
    .line 134
    new-instance p0, Lst0;

    .line 135
    .line 136
    iget p1, v2, Lih0;->a:F

    .line 137
    .line 138
    iget p2, v2, Lih0;->b:F

    .line 139
    .line 140
    iget v0, v2, Lih0;->c:F

    .line 141
    .line 142
    iget v1, v2, Lih0;->d:F

    .line 143
    .line 144
    invoke-direct {p0, p1, p2, v0, v1}, Lst0;-><init>(FFFF)V

    .line 145
    .line 146
    .line 147
    return-object p0
.end method

.method public abstract B0()V
.end method

.method public final C0(Lqj0;)Lqj0;
    .locals 5

    .line 1
    iget-object v0, p1, Lqj0;->r:Lb60;

    .line 2
    .line 3
    iget-object v1, p0, Lqj0;->r:Lb60;

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Lqj0;->G0()Loe0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v1, Loe0;->d:Loe0;

    .line 16
    .line 17
    iget-boolean v2, v2, Loe0;->q:Z

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const-string v2, "visitLocalAncestors called on an unattached node"

    .line 22
    .line 23
    invoke-static {v2}, Lw10;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v1, v1, Loe0;->d:Loe0;

    .line 27
    .line 28
    iget-object v1, v1, Loe0;->h:Loe0;

    .line 29
    .line 30
    :goto_0
    if-eqz v1, :cond_7

    .line 31
    .line 32
    iget v2, v1, Loe0;->f:I

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
    iget-object v1, v1, Loe0;->h:Loe0;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    iget v2, v0, Lb60;->s:I

    .line 45
    .line 46
    iget v3, v1, Lb60;->s:I

    .line 47
    .line 48
    if-le v2, v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0}, Lb60;->v()Lb60;

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
    iget v3, v2, Lb60;->s:I

    .line 60
    .line 61
    iget v4, v0, Lb60;->s:I

    .line 62
    .line 63
    if-le v3, v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v2}, Lb60;->v()Lb60;

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
    invoke-virtual {v0}, Lb60;->v()Lb60;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v2}, Lb60;->v()Lb60;

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
    const-string p0, "layouts are not part of the same hierarchy"

    .line 89
    .line 90
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    return-object p0

    .line 95
    :cond_6
    if-ne v2, v1, :cond_8

    .line 96
    .line 97
    :cond_7
    return-object p0

    .line 98
    :cond_8
    iget-object p0, p1, Lqj0;->r:Lb60;

    .line 99
    .line 100
    if-ne v0, p0, :cond_9

    .line 101
    .line 102
    :goto_4
    return-object p1

    .line 103
    :cond_9
    iget-object p0, v0, Lb60;->I:Lmj0;

    .line 104
    .line 105
    iget-object p0, p0, Lmj0;->c:Lc20;

    .line 106
    .line 107
    return-object p0
.end method

.method public final D0(J)J
    .locals 6

    .line 1
    iget-wide v0, p0, Lqj0;->C:J

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
    iget-object p0, p0, Lqj0;->O:Lcn0;

    .line 46
    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    check-cast p0, Lxx;

    .line 50
    .line 51
    invoke-virtual {p0}, Lxx;->a()[F

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    const-wide p0, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    return-wide p0

    .line 63
    :cond_0
    iget-boolean p0, p0, Lxx;->v:Z

    .line 64
    .line 65
    if-eqz p0, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {v0, p1, p2}, Lr60;->s([FJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    return-wide p0

    .line 73
    :cond_2
    :goto_0
    return-wide p1
.end method

.method public abstract E0()Lac0;
.end method

.method public final F0()J
    .locals 3

    .line 1
    iget-object v0, p0, Lqj0;->x:Lym;

    .line 2
    .line 3
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 4
    .line 5
    iget-object p0, p0, Lb60;->D:Lnc1;

    .line 6
    .line 7
    invoke-interface {p0}, Lnc1;->e()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-interface {v0, v1, v2}, Lym;->M(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method

.method public final G()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lxq0;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public abstract G0()Loe0;
.end method

.method public final H0(I)Loe0;
    .locals 2

    .line 1
    invoke-static {p1}, Lrj0;->f(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

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
    iget-object v1, v1, Loe0;->h:Loe0;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lqj0;->I0(Z)Loe0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_1
    if-eqz p0, :cond_3

    .line 22
    .line 23
    iget v0, p0, Loe0;->g:I

    .line 24
    .line 25
    and-int/2addr v0, p1

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget v0, p0, Loe0;->f:I

    .line 29
    .line 30
    and-int/2addr v0, p1

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    if-eq p0, v1, :cond_3

    .line 35
    .line 36
    iget-object p0, p0, Loe0;->i:Loe0;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public final I0(Z)Loe0;
    .locals 2

    .line 1
    iget-object v0, p0, Lqj0;->r:Lb60;

    .line 2
    .line 3
    iget-object v0, v0, Lb60;->I:Lmj0;

    .line 4
    .line 5
    iget-object v1, v0, Lmj0;->d:Lqj0;

    .line 6
    .line 7
    if-ne v1, p0, :cond_0

    .line 8
    .line 9
    iget-object p0, v0, Lmj0;->f:Loe0;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lqj0;->t:Lqj0;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    iget-object p0, p0, Loe0;->i:Loe0;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    if-eqz p0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_2
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public final J0(Loe0;Lr3;JLpy;IZ)V
    .locals 7

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
    invoke-virtual/range {v0 .. v6}, Lqj0;->M0(Lr3;JLpy;IZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget v0, p5, Lpy;->f:I

    .line 14
    .line 15
    iget-object v1, p5, Lpy;->d:Ldh0;

    .line 16
    .line 17
    add-int/lit8 v2, v0, 0x1

    .line 18
    .line 19
    iget v3, v1, Ldh0;->b:I

    .line 20
    .line 21
    invoke-virtual {p5, v2, v3}, Lpy;->b(II)V

    .line 22
    .line 23
    .line 24
    iget v2, p5, Lpy;->f:I

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    iput v2, p5, Lpy;->f:I

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ldh0;->a(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p5, Lpy;->e:Lyg0;

    .line 34
    .line 35
    const/high16 v2, -0x40800000    # -1.0f

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static {v2, p7, v3}, Lpf1;->c(FZZ)J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-virtual {v1, v2, v3}, Lyg0;->a(J)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Lr3;->e()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {p1, v1}, Lv50;->d(Lrm;I)Loe0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual/range {p0 .. p7}, Lqj0;->J0(Loe0;Lr3;JLpy;IZ)V

    .line 54
    .line 55
    .line 56
    iput v0, p5, Lpy;->f:I

    .line 57
    .line 58
    return-void
.end method

.method public final K0(Loe0;Lr3;JLpy;IZF)V
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
    invoke-virtual/range {v0 .. v6}, Lqj0;->M0(Lr3;JLpy;IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    move-object/from16 v4, p5

    .line 17
    .line 18
    iget v10, v4, Lpy;->f:I

    .line 19
    .line 20
    iget-object v0, v4, Lpy;->d:Ldh0;

    .line 21
    .line 22
    add-int/lit8 v1, v10, 0x1

    .line 23
    .line 24
    iget v2, v0, Ldh0;->b:I

    .line 25
    .line 26
    invoke-virtual {v4, v1, v2}, Lpy;->b(II)V

    .line 27
    .line 28
    .line 29
    iget v1, v4, Lpy;->f:I

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    iput v1, v4, Lpy;->f:I

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ldh0;->a(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v4, Lpy;->e:Lyg0;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    move/from16 v7, p7

    .line 42
    .line 43
    move/from16 v8, p8

    .line 44
    .line 45
    invoke-static {v8, v7, v1}, Lpf1;->c(FZZ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    invoke-virtual {v0, v1, v2}, Lyg0;->a(J)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Lr3;->e()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {p1, v0}, Lv50;->d(Lrm;I)Loe0;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const/4 v9, 0x1

    .line 61
    move-object v0, p0

    .line 62
    move-object v2, p2

    .line 63
    move/from16 v6, p6

    .line 64
    .line 65
    move-object v5, v4

    .line 66
    move-wide v3, p3

    .line 67
    invoke-virtual/range {v0 .. v9}, Lqj0;->V0(Loe0;Lr3;JLpy;IZFZ)V

    .line 68
    .line 69
    .line 70
    move-object v4, v5

    .line 71
    iput v10, v4, Lpy;->f:I

    .line 72
    .line 73
    return-void
.end method

.method public final L0(Lr3;JLpy;IZ)V
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
    invoke-virtual {p1}, Lr3;->e()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, v0}, Lqj0;->H0(I)Loe0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v3, v4}, Lqj0;->e1(J)Z

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
    invoke-virtual {p0}, Lqj0;->F0()J

    .line 31
    .line 32
    .line 33
    move-result-wide v12

    .line 34
    invoke-virtual {p0, v3, v4, v12, v13}, Lqj0;->y0(JJ)F

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
    iget v2, v5, Lpy;->f:I

    .line 46
    .line 47
    iget-object v7, v5, Lpy;->d:Ldh0;

    .line 48
    .line 49
    iget v7, v7, Ldh0;->b:I

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
    invoke-static {v0, v8, v8}, Lpf1;->c(FZZ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v7

    .line 59
    invoke-virtual {v5}, Lpy;->a()J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    invoke-static {v9, v10, v7, v8}, Lp30;->t(JJ)I

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
    invoke-virtual/range {v0 .. v8}, Lqj0;->K0(Loe0;Lr3;JLpy;IZF)V

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
    invoke-virtual/range {p0 .. p6}, Lqj0;->M0(Lr3;JLpy;IZ)V

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
    invoke-virtual {p0}, Lxq0;->U()I

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
    invoke-virtual {p0}, Lxq0;->S()I

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
    invoke-virtual/range {v0 .. v7}, Lqj0;->J0(Loe0;Lr3;JLpy;IZ)V

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
    invoke-virtual {p0}, Lqj0;->F0()J

    .line 154
    .line 155
    .line 156
    move-result-wide v12

    .line 157
    invoke-virtual {p0, v3, v4, v12, v13}, Lqj0;->y0(JJ)F

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
    iget v7, v5, Lpy;->f:I

    .line 172
    .line 173
    iget-object v9, v5, Lpy;->d:Ldh0;

    .line 174
    .line 175
    iget v9, v9, Ldh0;->b:I

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
    invoke-static {v2, v7, v8}, Lpf1;->c(FZZ)J

    .line 186
    .line 187
    .line 188
    move-result-wide v9

    .line 189
    invoke-virtual {v5}, Lpy;->a()J

    .line 190
    .line 191
    .line 192
    move-result-wide v12

    .line 193
    invoke-static {v12, v13, v9, v10}, Lp30;->t(JJ)I

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
    invoke-virtual/range {v0 .. v9}, Lqj0;->V0(Loe0;Lr3;JLpy;IZFZ)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public M0(Lr3;JLpy;IZ)V
    .locals 0

    .line 1
    iget-object p0, p0, Lqj0;->s:Lqj0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p2, p3}, Lqj0;->D0(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    invoke-virtual/range {p0 .. p6}, Lqj0;->L0(Lr3;JLpy;IZ)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final N0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lqj0;->O:Lcn0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lxx;

    .line 6
    .line 7
    invoke-virtual {v0}, Lxx;->c()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object p0, p0, Lqj0;->t:Lqj0;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lqj0;->N0()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final O0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lqj0;->O:Lcn0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lqj0;->z:F

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
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    iget-object p0, p0, Lqj0;->t:Lqj0;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lqj0;->O0()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final P0(J)J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Loe0;->q:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lqj0;->Q0()V

    .line 15
    .line 16
    .line 17
    :goto_0
    if-eqz p0, :cond_4

    .line 18
    .line 19
    iget-object v0, p0, Lqj0;->r:Lb60;

    .line 20
    .line 21
    iget-object v1, v0, Lb60;->I:Lmj0;

    .line 22
    .line 23
    iget-object v1, v1, Lmj0;->d:Lqj0;

    .line 24
    .line 25
    if-ne p0, v1, :cond_1

    .line 26
    .line 27
    iget-boolean v1, v0, Lb60;->f:Z

    .line 28
    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-static {v0}, Le60;->a(Lb60;)Ldn0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lw3;

    .line 36
    .line 37
    invoke-virtual {v1}, Lw3;->getRectManager()Lut0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1, v0}, Lut0;->b(Lb60;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    const-wide v2, 0x7fffffff7fffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1, v2, v3}, Lw20;->a(JJ)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_1

    .line 55
    .line 56
    invoke-static {p1, p2, v0, v1}, Li4;->y(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide p0

    .line 60
    return-wide p0

    .line 61
    :cond_1
    iget-object v0, p0, Lqj0;->O:Lcn0;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    check-cast v0, Lxx;

    .line 66
    .line 67
    invoke-virtual {v0}, Lxx;->b()[F

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-boolean v0, v0, Lxx;->v:Z

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-static {v1, p1, p2}, Lr60;->s([FJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide p1

    .line 80
    :cond_3
    :goto_1
    iget-wide v0, p0, Lqj0;->C:J

    .line 81
    .line 82
    invoke-static {p1, p2, v0, v1}, Li4;->y(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide p1

    .line 86
    iget-object p0, p0, Lqj0;->t:Lqj0;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    return-wide p1
.end method

.method public final Q0()V
    .locals 0

    .line 1
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 2
    .line 3
    iget-object p0, p0, Lb60;->J:Lf60;

    .line 4
    .line 5
    invoke-virtual {p0}, Lf60;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final R0()V
    .locals 13

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, Lrj0;->f(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, Lqj0;->I0(Z)Loe0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_c

    .line 12
    .line 13
    iget-object v2, v2, Loe0;->d:Loe0;

    .line 14
    .line 15
    iget v2, v2, Loe0;->g:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_c

    .line 19
    .line 20
    invoke-static {}, Lu50;->k()Ll21;

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
    invoke-virtual {v2}, Ll21;->e()Lsw;

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
    invoke-static {v2}, Lu50;->s(Ll21;)Ll21;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget-object v6, v6, Loe0;->h:Loe0;

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
    invoke-virtual {p0, v1}, Lqj0;->I0(Z)Loe0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_2
    if-eqz v1, :cond_b

    .line 62
    .line 63
    iget v7, v1, Loe0;->g:I

    .line 64
    .line 65
    and-int/2addr v7, v0

    .line 66
    if-eqz v7, :cond_b

    .line 67
    .line 68
    iget v7, v1, Loe0;->f:I

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
    instance-of v9, v7, Lg50;

    .line 78
    .line 79
    if-eqz v9, :cond_3

    .line 80
    .line 81
    check-cast v7, Lg50;

    .line 82
    .line 83
    iget-wide v9, p0, Lxq0;->f:J

    .line 84
    .line 85
    invoke-interface {v7, v9, v10}, Lg50;->l(J)V

    .line 86
    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_3
    iget v9, v7, Loe0;->f:I

    .line 90
    .line 91
    and-int/2addr v9, v0

    .line 92
    if-eqz v9, :cond_9

    .line 93
    .line 94
    instance-of v9, v7, Lsm;

    .line 95
    .line 96
    if-eqz v9, :cond_9

    .line 97
    .line 98
    move-object v9, v7

    .line 99
    check-cast v9, Lsm;

    .line 100
    .line 101
    iget-object v9, v9, Lsm;->s:Loe0;

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
    iget v12, v9, Loe0;->f:I

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
    new-instance v8, Lsh0;

    .line 121
    .line 122
    const/16 v11, 0x10

    .line 123
    .line 124
    new-array v11, v11, [Loe0;

    .line 125
    .line 126
    invoke-direct {v8, v11}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    if-eqz v7, :cond_6

    .line 130
    .line 131
    invoke-virtual {v8, v7}, Lsh0;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object v7, v3

    .line 135
    :cond_6
    invoke-virtual {v8, v9}, Lsh0;->b(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    :goto_5
    iget-object v9, v9, Loe0;->i:Loe0;

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
    invoke-static {v8}, Lpf1;->f(Lsh0;)Loe0;

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
    iget-object v1, v1, Loe0;->i:Loe0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_b
    :goto_7
    invoke-static {v2, v5, v4}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_8
    invoke-static {v2, v5, v4}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 159
    .line 160
    .line 161
    throw p0

    .line 162
    :cond_c
    return-void
.end method

.method public final S0()V
    .locals 10

    .line 1
    const/high16 v0, 0x400000

    .line 2
    .line 3
    invoke-static {v0}, Lrj0;->f(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

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
    iget-object v2, v2, Loe0;->h:Loe0;

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
    invoke-virtual {p0, v1}, Lqj0;->I0(Z)Loe0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_1
    if-eqz v1, :cond_a

    .line 25
    .line 26
    iget v3, v1, Loe0;->g:I

    .line 27
    .line 28
    and-int/2addr v3, v0

    .line 29
    if-eqz v3, :cond_a

    .line 30
    .line 31
    iget v3, v1, Loe0;->f:I

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
    instance-of v6, v4, Lg50;

    .line 42
    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    check-cast v4, Lg50;

    .line 46
    .line 47
    invoke-interface {v4, p0}, Lg50;->j(Li50;)V

    .line 48
    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_2
    iget v6, v4, Loe0;->f:I

    .line 52
    .line 53
    and-int/2addr v6, v0

    .line 54
    if-eqz v6, :cond_8

    .line 55
    .line 56
    instance-of v6, v4, Lsm;

    .line 57
    .line 58
    if-eqz v6, :cond_8

    .line 59
    .line 60
    move-object v6, v4

    .line 61
    check-cast v6, Lsm;

    .line 62
    .line 63
    iget-object v6, v6, Lsm;->s:Loe0;

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
    iget v9, v6, Loe0;->f:I

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
    new-instance v5, Lsh0;

    .line 83
    .line 84
    const/16 v8, 0x10

    .line 85
    .line 86
    new-array v8, v8, [Loe0;

    .line 87
    .line 88
    invoke-direct {v5, v8}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    if-eqz v4, :cond_5

    .line 92
    .line 93
    invoke-virtual {v5, v4}, Lsh0;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move-object v4, v3

    .line 97
    :cond_5
    invoke-virtual {v5, v6}, Lsh0;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_6
    :goto_4
    iget-object v6, v6, Loe0;->i:Loe0;

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
    invoke-static {v5}, Lpf1;->f(Lsh0;)Loe0;

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
    iget-object v1, v1, Loe0;->i:Loe0;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_a
    :goto_6
    return-void
.end method

.method public final T0()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lqj0;->u:Z

    .line 3
    .line 4
    iget-object v0, p0, Lqj0;->M:Lnj0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lnj0;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lqj0;->Z0()V

    .line 10
    .line 11
    .line 12
    iget-wide v0, p0, Lqj0;->C:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, Lw20;->a(JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 23
    .line 24
    invoke-virtual {p0}, Lb60;->N()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final U0()V
    .locals 9

    .line 1
    const/high16 v0, 0x100000

    .line 2
    .line 3
    invoke-static {v0}, Lrj0;->f(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, Lqj0;->I0(Z)Loe0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_9

    .line 12
    .line 13
    iget-object v2, v2, Loe0;->d:Loe0;

    .line 14
    .line 15
    iget v2, v2, Loe0;->g:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_9

    .line 19
    .line 20
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

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
    iget-object v2, v2, Loe0;->h:Loe0;

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto :goto_5

    .line 32
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lqj0;->I0(Z)Loe0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_1
    if-eqz p0, :cond_9

    .line 37
    .line 38
    iget v1, p0, Loe0;->g:I

    .line 39
    .line 40
    and-int/2addr v1, v0

    .line 41
    if-eqz v1, :cond_9

    .line 42
    .line 43
    iget v1, p0, Loe0;->f:I

    .line 44
    .line 45
    and-int/2addr v1, v0

    .line 46
    if-eqz v1, :cond_8

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    move-object v3, p0

    .line 50
    move-object v4, v1

    .line 51
    :goto_2
    if-eqz v3, :cond_8

    .line 52
    .line 53
    iget v5, v3, Loe0;->f:I

    .line 54
    .line 55
    and-int/2addr v5, v0

    .line 56
    if-eqz v5, :cond_7

    .line 57
    .line 58
    instance-of v5, v3, Lsm;

    .line 59
    .line 60
    if-eqz v5, :cond_7

    .line 61
    .line 62
    move-object v5, v3

    .line 63
    check-cast v5, Lsm;

    .line 64
    .line 65
    iget-object v5, v5, Lsm;->s:Loe0;

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    :goto_3
    const/4 v7, 0x1

    .line 69
    if-eqz v5, :cond_6

    .line 70
    .line 71
    iget v8, v5, Loe0;->f:I

    .line 72
    .line 73
    and-int/2addr v8, v0

    .line 74
    if-eqz v8, :cond_5

    .line 75
    .line 76
    add-int/lit8 v6, v6, 0x1

    .line 77
    .line 78
    if-ne v6, v7, :cond_2

    .line 79
    .line 80
    move-object v3, v5

    .line 81
    goto :goto_4

    .line 82
    :cond_2
    if-nez v4, :cond_3

    .line 83
    .line 84
    new-instance v4, Lsh0;

    .line 85
    .line 86
    const/16 v7, 0x10

    .line 87
    .line 88
    new-array v7, v7, [Loe0;

    .line 89
    .line 90
    invoke-direct {v4, v7}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    if-eqz v3, :cond_4

    .line 94
    .line 95
    invoke-virtual {v4, v3}, Lsh0;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-object v3, v1

    .line 99
    :cond_4
    invoke-virtual {v4, v5}, Lsh0;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_5
    :goto_4
    iget-object v5, v5, Loe0;->i:Loe0;

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_6
    if-ne v6, v7, :cond_7

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_7
    invoke-static {v4}, Lpf1;->f(Lsh0;)Loe0;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    goto :goto_2

    .line 113
    :cond_8
    if-eq p0, v2, :cond_9

    .line 114
    .line 115
    iget-object p0, p0, Loe0;->i:Loe0;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_9
    :goto_5
    return-void
.end method

.method public final V0(Loe0;Lr3;JLpy;IZFZ)V
    .locals 19

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object/from16 v0, p0

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    move-wide/from16 v2, p3

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    move/from16 v5, p6

    .line 12
    .line 13
    move/from16 v6, p7

    .line 14
    .line 15
    invoke-virtual/range {v0 .. v6}, Lqj0;->M0(Lr3;JLpy;IZ)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    move/from16 v7, p6

    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v10, 0x2

    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v12, 0x1

    .line 27
    const/4 v2, 0x3

    .line 28
    if-ne v7, v2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v3, 0x4

    .line 32
    if-ne v7, v3, :cond_10

    .line 33
    .line 34
    :goto_0
    move-object/from16 v3, p1

    .line 35
    .line 36
    move-object v4, v1

    .line 37
    :goto_1
    if-eqz v3, :cond_10

    .line 38
    .line 39
    instance-of v5, v3, Lqr0;

    .line 40
    .line 41
    if-eqz v5, :cond_9

    .line 42
    .line 43
    check-cast v3, Lqr0;

    .line 44
    .line 45
    sget v3, Li4;->t:I

    .line 46
    .line 47
    sget-wide v3, Li4;->s:J

    .line 48
    .line 49
    const/16 v3, 0x20

    .line 50
    .line 51
    shr-long v3, p3, v3

    .line 52
    .line 53
    long-to-int v3, v3

    .line 54
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    move-object/from16 v5, p0

    .line 59
    .line 60
    iget-object v6, v5, Lqj0;->r:Lb60;

    .line 61
    .line 62
    iget-object v8, v6, Lb60;->C:Lk50;

    .line 63
    .line 64
    const-wide/high16 v13, -0x8000000000000000L

    .line 65
    .line 66
    and-long v15, v13, v13

    .line 67
    .line 68
    const-wide/16 v17, 0x0

    .line 69
    .line 70
    cmp-long v9, v15, v17

    .line 71
    .line 72
    sget-object v15, Lk50;->d:Lk50;

    .line 73
    .line 74
    if-eqz v9, :cond_3

    .line 75
    .line 76
    if-ne v8, v15, :cond_2

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    invoke-static {v10, v13, v14}, Ljo0;->l(IJ)I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    goto :goto_3

    .line 84
    :cond_3
    :goto_2
    invoke-static {v11, v13, v14}, Ljo0;->l(IJ)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    :goto_3
    neg-int v8, v8

    .line 89
    int-to-float v8, v8

    .line 90
    cmpl-float v4, v4, v8

    .line 91
    .line 92
    if-ltz v4, :cond_10

    .line 93
    .line 94
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-virtual {v5}, Lxq0;->U()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    iget-object v6, v6, Lb60;->C:Lk50;

    .line 103
    .line 104
    if-eqz v9, :cond_5

    .line 105
    .line 106
    if-ne v6, v15, :cond_4

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    invoke-static {v11, v13, v14}, Ljo0;->l(IJ)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    goto :goto_5

    .line 114
    :cond_5
    :goto_4
    invoke-static {v10, v13, v14}, Ljo0;->l(IJ)I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    :goto_5
    add-int/2addr v4, v6

    .line 119
    int-to-float v4, v4

    .line 120
    cmpg-float v3, v3, v4

    .line 121
    .line 122
    if-gez v3, :cond_10

    .line 123
    .line 124
    const-wide v3, 0xffffffffL

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    and-long v3, p3, v3

    .line 130
    .line 131
    long-to-int v3, v3

    .line 132
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    invoke-static {v12, v13, v14}, Ljo0;->l(IJ)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    neg-int v6, v6

    .line 141
    int-to-float v6, v6

    .line 142
    cmpl-float v4, v4, v6

    .line 143
    .line 144
    if-ltz v4, :cond_10

    .line 145
    .line 146
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    invoke-virtual {v5}, Lxq0;->S()I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    invoke-static {v2, v13, v14}, Ljo0;->l(IJ)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    add-int/2addr v2, v4

    .line 159
    int-to-float v2, v2

    .line 160
    cmpg-float v2, v3, v2

    .line 161
    .line 162
    if-gez v2, :cond_10

    .line 163
    .line 164
    new-instance v0, Loj0;

    .line 165
    .line 166
    move-object/from16 v2, p1

    .line 167
    .line 168
    move-object/from16 v3, p2

    .line 169
    .line 170
    move-object/from16 v6, p5

    .line 171
    .line 172
    move/from16 v8, p7

    .line 173
    .line 174
    move/from16 v9, p8

    .line 175
    .line 176
    move/from16 v10, p9

    .line 177
    .line 178
    move-object v1, v5

    .line 179
    move-wide/from16 v4, p3

    .line 180
    .line 181
    invoke-direct/range {v0 .. v10}, Loj0;-><init>(Lqj0;Loe0;Lr3;JLpy;IZFZ)V

    .line 182
    .line 183
    .line 184
    move-object v5, v2

    .line 185
    iget-object v1, v6, Lpy;->e:Lyg0;

    .line 186
    .line 187
    iget-object v2, v6, Lpy;->d:Ldh0;

    .line 188
    .line 189
    iget v3, v6, Lpy;->f:I

    .line 190
    .line 191
    iget v4, v2, Ldh0;->b:I

    .line 192
    .line 193
    add-int/lit8 v7, v4, -0x1

    .line 194
    .line 195
    const/4 v9, 0x0

    .line 196
    if-ne v3, v7, :cond_6

    .line 197
    .line 198
    add-int/lit8 v7, v3, 0x1

    .line 199
    .line 200
    invoke-virtual {v6, v7, v4}, Lpy;->b(II)V

    .line 201
    .line 202
    .line 203
    iget v4, v6, Lpy;->f:I

    .line 204
    .line 205
    add-int/2addr v4, v12

    .line 206
    iput v4, v6, Lpy;->f:I

    .line 207
    .line 208
    invoke-virtual {v2, v5}, Ldh0;->a(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v9, v8, v12}, Lpf1;->c(FZZ)J

    .line 212
    .line 213
    .line 214
    move-result-wide v4

    .line 215
    invoke-virtual {v1, v4, v5}, Lyg0;->a(J)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Loj0;->invoke()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    iput v3, v6, Lpy;->f:I

    .line 222
    .line 223
    return-void

    .line 224
    :cond_6
    invoke-virtual {v6}, Lpy;->a()J

    .line 225
    .line 226
    .line 227
    move-result-wide v3

    .line 228
    iget v7, v6, Lpy;->f:I

    .line 229
    .line 230
    invoke-static {v3, v4}, Lp30;->L(J)Z

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    if-eqz v10, :cond_8

    .line 235
    .line 236
    iget v3, v2, Ldh0;->b:I

    .line 237
    .line 238
    add-int/lit8 v4, v3, -0x1

    .line 239
    .line 240
    iput v4, v6, Lpy;->f:I

    .line 241
    .line 242
    iget v10, v2, Ldh0;->b:I

    .line 243
    .line 244
    invoke-virtual {v6, v3, v10}, Lpy;->b(II)V

    .line 245
    .line 246
    .line 247
    iget v3, v6, Lpy;->f:I

    .line 248
    .line 249
    add-int/2addr v3, v12

    .line 250
    iput v3, v6, Lpy;->f:I

    .line 251
    .line 252
    invoke-virtual {v2, v5}, Ldh0;->a(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-static {v9, v8, v12}, Lpf1;->c(FZZ)J

    .line 256
    .line 257
    .line 258
    move-result-wide v2

    .line 259
    invoke-virtual {v1, v2, v3}, Lyg0;->a(J)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, Loj0;->invoke()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    iput v4, v6, Lpy;->f:I

    .line 266
    .line 267
    invoke-virtual {v6}, Lpy;->a()J

    .line 268
    .line 269
    .line 270
    move-result-wide v0

    .line 271
    invoke-static {v0, v1}, Lp30;->A(J)F

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    cmpg-float v0, v0, v9

    .line 276
    .line 277
    if-gez v0, :cond_7

    .line 278
    .line 279
    add-int/lit8 v0, v7, 0x1

    .line 280
    .line 281
    iget v1, v6, Lpy;->f:I

    .line 282
    .line 283
    add-int/2addr v1, v12

    .line 284
    invoke-virtual {v6, v0, v1}, Lpy;->b(II)V

    .line 285
    .line 286
    .line 287
    :cond_7
    iput v7, v6, Lpy;->f:I

    .line 288
    .line 289
    return-void

    .line 290
    :cond_8
    invoke-static {v3, v4}, Lp30;->A(J)F

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    cmpl-float v3, v3, v9

    .line 295
    .line 296
    if-lez v3, :cond_1a

    .line 297
    .line 298
    iget v3, v6, Lpy;->f:I

    .line 299
    .line 300
    add-int/lit8 v4, v3, 0x1

    .line 301
    .line 302
    iget v7, v2, Ldh0;->b:I

    .line 303
    .line 304
    invoke-virtual {v6, v4, v7}, Lpy;->b(II)V

    .line 305
    .line 306
    .line 307
    iget v4, v6, Lpy;->f:I

    .line 308
    .line 309
    add-int/2addr v4, v12

    .line 310
    iput v4, v6, Lpy;->f:I

    .line 311
    .line 312
    invoke-virtual {v2, v5}, Ldh0;->a(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    invoke-static {v9, v8, v12}, Lpf1;->c(FZZ)J

    .line 316
    .line 317
    .line 318
    move-result-wide v4

    .line 319
    invoke-virtual {v1, v4, v5}, Lyg0;->a(J)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0}, Loj0;->invoke()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    iput v3, v6, Lpy;->f:I

    .line 326
    .line 327
    return-void

    .line 328
    :cond_9
    move-object/from16 v5, p1

    .line 329
    .line 330
    move-object/from16 v6, p5

    .line 331
    .line 332
    move/from16 v8, p7

    .line 333
    .line 334
    iget v7, v3, Loe0;->f:I

    .line 335
    .line 336
    and-int/2addr v7, v0

    .line 337
    if-eqz v7, :cond_f

    .line 338
    .line 339
    instance-of v7, v3, Lsm;

    .line 340
    .line 341
    if-eqz v7, :cond_f

    .line 342
    .line 343
    move-object v7, v3

    .line 344
    check-cast v7, Lsm;

    .line 345
    .line 346
    iget-object v7, v7, Lsm;->s:Loe0;

    .line 347
    .line 348
    move v9, v11

    .line 349
    :goto_6
    if-eqz v7, :cond_e

    .line 350
    .line 351
    iget v13, v7, Loe0;->f:I

    .line 352
    .line 353
    and-int/2addr v13, v0

    .line 354
    if-eqz v13, :cond_d

    .line 355
    .line 356
    add-int/lit8 v9, v9, 0x1

    .line 357
    .line 358
    if-ne v9, v12, :cond_a

    .line 359
    .line 360
    move-object v3, v7

    .line 361
    goto :goto_7

    .line 362
    :cond_a
    if-nez v4, :cond_b

    .line 363
    .line 364
    new-instance v4, Lsh0;

    .line 365
    .line 366
    new-array v13, v0, [Loe0;

    .line 367
    .line 368
    invoke-direct {v4, v13}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_b
    if-eqz v3, :cond_c

    .line 372
    .line 373
    invoke-virtual {v4, v3}, Lsh0;->b(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    move-object v3, v1

    .line 377
    :cond_c
    invoke-virtual {v4, v7}, Lsh0;->b(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    :cond_d
    :goto_7
    iget-object v7, v7, Loe0;->i:Loe0;

    .line 381
    .line 382
    goto :goto_6

    .line 383
    :cond_e
    if-ne v9, v12, :cond_f

    .line 384
    .line 385
    :goto_8
    move/from16 v7, p6

    .line 386
    .line 387
    goto/16 :goto_1

    .line 388
    .line 389
    :cond_f
    invoke-static {v4}, Lpf1;->f(Lsh0;)Loe0;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    goto :goto_8

    .line 394
    :cond_10
    move-object/from16 v5, p1

    .line 395
    .line 396
    move-object/from16 v6, p5

    .line 397
    .line 398
    move/from16 v8, p7

    .line 399
    .line 400
    if-eqz p9, :cond_11

    .line 401
    .line 402
    invoke-virtual/range {p0 .. p8}, Lqj0;->K0(Loe0;Lr3;JLpy;IZF)V

    .line 403
    .line 404
    .line 405
    return-void

    .line 406
    :cond_11
    move-object/from16 v3, p2

    .line 407
    .line 408
    iget v2, v3, Lr3;->d:I

    .line 409
    .line 410
    packed-switch v2, :pswitch_data_0

    .line 411
    .line 412
    .line 413
    :cond_12
    move v0, v11

    .line 414
    goto :goto_c

    .line 415
    :pswitch_0
    move-object v4, v1

    .line 416
    move-object v2, v5

    .line 417
    :goto_9
    if-eqz v2, :cond_12

    .line 418
    .line 419
    instance-of v7, v2, Lqr0;

    .line 420
    .line 421
    if-eqz v7, :cond_13

    .line 422
    .line 423
    check-cast v2, Lqr0;

    .line 424
    .line 425
    invoke-interface {v2}, Lqr0;->e0()Z

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    if-eqz v2, :cond_19

    .line 430
    .line 431
    move v0, v12

    .line 432
    goto :goto_c

    .line 433
    :cond_13
    iget v7, v2, Loe0;->f:I

    .line 434
    .line 435
    and-int/2addr v7, v0

    .line 436
    if-eqz v7, :cond_19

    .line 437
    .line 438
    instance-of v7, v2, Lsm;

    .line 439
    .line 440
    if-eqz v7, :cond_19

    .line 441
    .line 442
    move-object v7, v2

    .line 443
    check-cast v7, Lsm;

    .line 444
    .line 445
    iget-object v7, v7, Lsm;->s:Loe0;

    .line 446
    .line 447
    move v9, v11

    .line 448
    :goto_a
    if-eqz v7, :cond_18

    .line 449
    .line 450
    iget v13, v7, Loe0;->f:I

    .line 451
    .line 452
    and-int/2addr v13, v0

    .line 453
    if-eqz v13, :cond_17

    .line 454
    .line 455
    add-int/lit8 v9, v9, 0x1

    .line 456
    .line 457
    if-ne v9, v12, :cond_14

    .line 458
    .line 459
    move-object v2, v7

    .line 460
    goto :goto_b

    .line 461
    :cond_14
    if-nez v4, :cond_15

    .line 462
    .line 463
    new-instance v4, Lsh0;

    .line 464
    .line 465
    new-array v13, v0, [Loe0;

    .line 466
    .line 467
    invoke-direct {v4, v13}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    :cond_15
    if-eqz v2, :cond_16

    .line 471
    .line 472
    invoke-virtual {v4, v2}, Lsh0;->b(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    move-object v2, v1

    .line 476
    :cond_16
    invoke-virtual {v4, v7}, Lsh0;->b(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    :cond_17
    :goto_b
    iget-object v7, v7, Loe0;->i:Loe0;

    .line 480
    .line 481
    goto :goto_a

    .line 482
    :cond_18
    if-ne v9, v12, :cond_19

    .line 483
    .line 484
    goto :goto_9

    .line 485
    :cond_19
    invoke-static {v4}, Lpf1;->f(Lsh0;)Loe0;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    goto :goto_9

    .line 490
    :goto_c
    if-eqz v0, :cond_21

    .line 491
    .line 492
    new-instance v0, Lpj0;

    .line 493
    .line 494
    move-object/from16 v1, p0

    .line 495
    .line 496
    move/from16 v7, p6

    .line 497
    .line 498
    move/from16 v9, p8

    .line 499
    .line 500
    move-object v2, v5

    .line 501
    move-wide/from16 v4, p3

    .line 502
    .line 503
    invoke-direct/range {v0 .. v9}, Lpj0;-><init>(Lqj0;Loe0;Lr3;JLpy;IZF)V

    .line 504
    .line 505
    .line 506
    iget-object v1, v6, Lpy;->e:Lyg0;

    .line 507
    .line 508
    iget-object v3, v6, Lpy;->d:Ldh0;

    .line 509
    .line 510
    iget v4, v6, Lpy;->f:I

    .line 511
    .line 512
    iget v5, v3, Ldh0;->b:I

    .line 513
    .line 514
    add-int/lit8 v7, v5, -0x1

    .line 515
    .line 516
    if-ne v4, v7, :cond_1e

    .line 517
    .line 518
    add-int/lit8 v7, v4, 0x1

    .line 519
    .line 520
    invoke-virtual {v6, v7, v5}, Lpy;->b(II)V

    .line 521
    .line 522
    .line 523
    iget v5, v6, Lpy;->f:I

    .line 524
    .line 525
    add-int/2addr v5, v12

    .line 526
    iput v5, v6, Lpy;->f:I

    .line 527
    .line 528
    invoke-virtual {v3, v2}, Ldh0;->a(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    invoke-static {v9, v8, v11}, Lpf1;->c(FZZ)J

    .line 532
    .line 533
    .line 534
    move-result-wide v8

    .line 535
    invoke-virtual {v1, v8, v9}, Lyg0;->a(J)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v0}, Lpj0;->invoke()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    iput v4, v6, Lpy;->f:I

    .line 542
    .line 543
    iget v0, v3, Ldh0;->b:I

    .line 544
    .line 545
    sub-int/2addr v0, v12

    .line 546
    if-eq v7, v0, :cond_1b

    .line 547
    .line 548
    invoke-virtual {v6}, Lpy;->a()J

    .line 549
    .line 550
    .line 551
    move-result-wide v4

    .line 552
    invoke-static {v4, v5}, Lp30;->L(J)Z

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    if-eqz v0, :cond_1a

    .line 557
    .line 558
    goto :goto_d

    .line 559
    :cond_1a
    return-void

    .line 560
    :cond_1b
    :goto_d
    iget v0, v6, Lpy;->f:I

    .line 561
    .line 562
    add-int/lit8 v2, v0, 0x1

    .line 563
    .line 564
    invoke-virtual {v3, v2}, Ldh0;->k(I)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    if-ltz v2, :cond_1d

    .line 568
    .line 569
    iget v3, v1, Lyg0;->b:I

    .line 570
    .line 571
    if-ge v2, v3, :cond_1d

    .line 572
    .line 573
    iget-object v4, v1, Lyg0;->a:[J

    .line 574
    .line 575
    aget-wide v5, v4, v2

    .line 576
    .line 577
    add-int/lit8 v5, v3, -0x1

    .line 578
    .line 579
    if-eq v2, v5, :cond_1c

    .line 580
    .line 581
    add-int/2addr v0, v10

    .line 582
    invoke-static {v4, v4, v2, v0, v3}, Lf9;->b0([J[JIII)V

    .line 583
    .line 584
    .line 585
    :cond_1c
    iget v0, v1, Lyg0;->b:I

    .line 586
    .line 587
    add-int/lit8 v0, v0, -0x1

    .line 588
    .line 589
    iput v0, v1, Lyg0;->b:I

    .line 590
    .line 591
    return-void

    .line 592
    :cond_1d
    const-string v0, "Index must be between 0 and size"

    .line 593
    .line 594
    invoke-static {v0}, Lxc;->f(Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    return-void

    .line 598
    :cond_1e
    invoke-virtual {v6}, Lpy;->a()J

    .line 599
    .line 600
    .line 601
    move-result-wide v4

    .line 602
    iget v7, v6, Lpy;->f:I

    .line 603
    .line 604
    iget v13, v3, Ldh0;->b:I

    .line 605
    .line 606
    add-int/lit8 v14, v13, -0x1

    .line 607
    .line 608
    iput v14, v6, Lpy;->f:I

    .line 609
    .line 610
    iget v15, v3, Ldh0;->b:I

    .line 611
    .line 612
    invoke-virtual {v6, v13, v15}, Lpy;->b(II)V

    .line 613
    .line 614
    .line 615
    iget v13, v6, Lpy;->f:I

    .line 616
    .line 617
    add-int/2addr v13, v12

    .line 618
    iput v13, v6, Lpy;->f:I

    .line 619
    .line 620
    invoke-virtual {v3, v2}, Ldh0;->a(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    invoke-static {v9, v8, v11}, Lpf1;->c(FZZ)J

    .line 624
    .line 625
    .line 626
    move-result-wide v8

    .line 627
    invoke-virtual {v1, v8, v9}, Lyg0;->a(J)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v0}, Lpj0;->invoke()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    iput v14, v6, Lpy;->f:I

    .line 634
    .line 635
    invoke-virtual {v6}, Lpy;->a()J

    .line 636
    .line 637
    .line 638
    move-result-wide v0

    .line 639
    iget v2, v6, Lpy;->f:I

    .line 640
    .line 641
    add-int/2addr v2, v12

    .line 642
    iget v8, v3, Ldh0;->b:I

    .line 643
    .line 644
    sub-int/2addr v8, v12

    .line 645
    if-ge v2, v8, :cond_20

    .line 646
    .line 647
    invoke-static {v4, v5, v0, v1}, Lp30;->t(JJ)I

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    if-lez v2, :cond_20

    .line 652
    .line 653
    add-int/lit8 v2, v7, 0x1

    .line 654
    .line 655
    invoke-static {v0, v1}, Lp30;->L(J)Z

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    iget v1, v6, Lpy;->f:I

    .line 660
    .line 661
    if-eqz v0, :cond_1f

    .line 662
    .line 663
    add-int/2addr v1, v10

    .line 664
    goto :goto_e

    .line 665
    :cond_1f
    add-int/2addr v1, v12

    .line 666
    :goto_e
    invoke-virtual {v6, v2, v1}, Lpy;->b(II)V

    .line 667
    .line 668
    .line 669
    goto :goto_f

    .line 670
    :cond_20
    iget v0, v6, Lpy;->f:I

    .line 671
    .line 672
    add-int/2addr v0, v12

    .line 673
    iget v1, v3, Ldh0;->b:I

    .line 674
    .line 675
    invoke-virtual {v6, v0, v1}, Lpy;->b(II)V

    .line 676
    .line 677
    .line 678
    :goto_f
    iput v7, v6, Lpy;->f:I

    .line 679
    .line 680
    return-void

    .line 681
    :cond_21
    move/from16 v9, p8

    .line 682
    .line 683
    move-object v2, v5

    .line 684
    invoke-virtual/range {p2 .. p2}, Lr3;->e()I

    .line 685
    .line 686
    .line 687
    move-result v0

    .line 688
    invoke-static {v2, v0}, Lv50;->d(Lrm;I)Loe0;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    const/4 v9, 0x0

    .line 693
    move-object/from16 v0, p0

    .line 694
    .line 695
    move-object/from16 v2, p2

    .line 696
    .line 697
    move-wide/from16 v3, p3

    .line 698
    .line 699
    move-object v5, v6

    .line 700
    move v7, v8

    .line 701
    move/from16 v6, p6

    .line 702
    .line 703
    move/from16 v8, p8

    .line 704
    .line 705
    invoke-virtual/range {v0 .. v9}, Lqj0;->V0(Loe0;Lr3;JLpy;IZFZ)V

    .line 706
    .line 707
    .line 708
    return-void

    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method

.method public abstract W0(Lbd;Lvx;)V
.end method

.method public final X0(JFLsw;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p4, v0}, Lqj0;->c1(Lsw;Z)V

    .line 3
    .line 4
    .line 5
    iget-wide v1, p0, Lqj0;->C:J

    .line 6
    .line 7
    invoke-static {v1, v2, p1, p2}, Lw20;->a(JJ)Z

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    iget-object v1, p0, Lqj0;->r:Lb60;

    .line 12
    .line 13
    if-nez p4, :cond_2

    .line 14
    .line 15
    invoke-static {v1}, Le60;->a(Lb60;)Ldn0;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    const/high16 v2, -0x3f800000    # -4.0f

    .line 20
    .line 21
    check-cast p4, Lw3;

    .line 22
    .line 23
    invoke-virtual {p4, v2}, Lw3;->I(F)V

    .line 24
    .line 25
    .line 26
    iput-wide p1, p0, Lqj0;->C:J

    .line 27
    .line 28
    iget-object p4, v1, Lb60;->J:Lf60;

    .line 29
    .line 30
    iget-object p4, p4, Lf60;->p:Lwd0;

    .line 31
    .line 32
    invoke-virtual {p4}, Lwd0;->e0()V

    .line 33
    .line 34
    .line 35
    iget-object p4, p0, Lqj0;->O:Lcn0;

    .line 36
    .line 37
    if-eqz p4, :cond_0

    .line 38
    .line 39
    check-cast p4, Lxx;

    .line 40
    .line 41
    invoke-virtual {p4, p1, p2}, Lxx;->d(J)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object p1, p0, Lqj0;->t:Lqj0;

    .line 46
    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1}, Lqj0;->N0()V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lb60;->N()V

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Lyb0;->s0(Lqj0;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, v1, Lb60;->r:Ldn0;

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    check-cast p1, Lw3;

    .line 63
    .line 64
    invoke-virtual {p1, v1}, Lw3;->v(Lb60;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iput p3, p0, Lqj0;->D:F

    .line 68
    .line 69
    iget-object p1, v1, Lb60;->I:Lmj0;

    .line 70
    .line 71
    iget-object p1, p1, Lmj0;->d:Lqj0;

    .line 72
    .line 73
    if-ne p0, p1, :cond_3

    .line 74
    .line 75
    invoke-static {v1}, Le60;->a(Lb60;)Ldn0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lw3;

    .line 80
    .line 81
    invoke-virtual {p1}, Lw3;->getRectManager()Lut0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1, v1, v0}, Lut0;->f(Lb60;Z)V

    .line 86
    .line 87
    .line 88
    :cond_3
    iget-boolean p1, p0, Lyb0;->n:Z

    .line 89
    .line 90
    if-nez p1, :cond_4

    .line 91
    .line 92
    invoke-virtual {p0}, Lqj0;->o0()Lyd0;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p0, p1}, Lyb0;->e0(Lyd0;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    return-void
.end method

.method public final Y0(Lih0;ZZ)V
    .locals 11

    .line 1
    iget-object v0, p0, Lqj0;->O:Lcn0;

    .line 2
    .line 3
    const-wide v1, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    iget-boolean v4, p0, Lqj0;->v:Z

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v4, :cond_2

    .line 16
    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lqj0;->F0()J

    .line 20
    .line 21
    .line 22
    move-result-wide p2

    .line 23
    shr-long v6, p2, v3

    .line 24
    .line 25
    long-to-int v4, v6

    .line 26
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/high16 v6, 0x40000000    # 2.0f

    .line 31
    .line 32
    div-float/2addr v4, v6

    .line 33
    and-long/2addr p2, v1

    .line 34
    long-to-int p2, p2

    .line 35
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    div-float/2addr p2, v6

    .line 40
    neg-float p3, v4

    .line 41
    neg-float v6, p2

    .line 42
    iget-wide v7, p0, Lxq0;->f:J

    .line 43
    .line 44
    shr-long v9, v7, v3

    .line 45
    .line 46
    long-to-int v9, v9

    .line 47
    int-to-float v9, v9

    .line 48
    add-float/2addr v9, v4

    .line 49
    and-long/2addr v7, v1

    .line 50
    long-to-int v4, v7

    .line 51
    int-to-float v4, v4

    .line 52
    add-float/2addr v4, p2

    .line 53
    invoke-virtual {p1, p3, v6, v9, v4}, Lih0;->a(FFFF)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    if-eqz p2, :cond_1

    .line 58
    .line 59
    iget-wide p2, p0, Lxq0;->f:J

    .line 60
    .line 61
    shr-long v6, p2, v3

    .line 62
    .line 63
    long-to-int v4, v6

    .line 64
    int-to-float v4, v4

    .line 65
    and-long/2addr p2, v1

    .line 66
    long-to-int p2, p2

    .line 67
    int-to-float p2, p2

    .line 68
    invoke-virtual {p1, v5, v5, v4, p2}, Lih0;->a(FFFF)V

    .line 69
    .line 70
    .line 71
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lih0;->b()Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-eqz p2, :cond_2

    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    check-cast v0, Lxx;

    .line 79
    .line 80
    invoke-virtual {v0}, Lxx;->b()[F

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    iget-boolean p3, v0, Lxx;->v:Z

    .line 85
    .line 86
    if-nez p3, :cond_4

    .line 87
    .line 88
    if-nez p2, :cond_3

    .line 89
    .line 90
    iput v5, p1, Lih0;->a:F

    .line 91
    .line 92
    iput v5, p1, Lih0;->b:F

    .line 93
    .line 94
    iput v5, p1, Lih0;->c:F

    .line 95
    .line 96
    iput v5, p1, Lih0;->d:F

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-static {p2, p1}, Lr60;->t([FLih0;)V

    .line 100
    .line 101
    .line 102
    :cond_4
    :goto_1
    iget-wide p2, p0, Lqj0;->C:J

    .line 103
    .line 104
    shr-long v3, p2, v3

    .line 105
    .line 106
    long-to-int p0, v3

    .line 107
    iget v0, p1, Lih0;->a:F

    .line 108
    .line 109
    int-to-float p0, p0

    .line 110
    add-float/2addr v0, p0

    .line 111
    iput v0, p1, Lih0;->a:F

    .line 112
    .line 113
    iget v0, p1, Lih0;->c:F

    .line 114
    .line 115
    add-float/2addr v0, p0

    .line 116
    iput v0, p1, Lih0;->c:F

    .line 117
    .line 118
    and-long/2addr p2, v1

    .line 119
    long-to-int p0, p2

    .line 120
    iget p2, p1, Lih0;->b:F

    .line 121
    .line 122
    int-to-float p0, p0

    .line 123
    add-float/2addr p2, p0

    .line 124
    iput p2, p1, Lih0;->b:F

    .line 125
    .line 126
    iget p2, p1, Lih0;->d:F

    .line 127
    .line 128
    add-float/2addr p2, p0

    .line 129
    iput p2, p1, Lih0;->d:F

    .line 130
    .line 131
    return-void
.end method

.method public final Z0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lqj0;->O:Lcn0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v0, v1}, Lqj0;->c1(Lsw;Z)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lb60;->W(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final a1(Lyd0;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lqj0;->A:Lyd0;

    .line 6
    .line 7
    if-eq v1, v2, :cond_18

    .line 8
    .line 9
    iput-object v1, v0, Lqj0;->A:Lyd0;

    .line 10
    .line 11
    iget-object v3, v0, Lqj0;->r:Lb60;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Lyd0;->e()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    invoke-interface {v2}, Lyd0;->e()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-ne v5, v6, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Lyd0;->c()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-interface {v2}, Lyd0;->c()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eq v5, v2, :cond_f

    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, Lyd0;->e()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-interface {v1}, Lyd0;->c()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    iget-object v6, v0, Lqj0;->O:Lcn0;

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
    check-cast v6, Lxx;

    .line 61
    .line 62
    invoke-virtual {v6, v10, v11}, Lxx;->e(J)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v3}, Lb60;->I()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    iget-object v6, v0, Lqj0;->t:Lqj0;

    .line 73
    .line 74
    if-eqz v6, :cond_2

    .line 75
    .line 76
    invoke-virtual {v6}, Lqj0;->N0()V

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
    invoke-virtual {v0, v5, v6}, Lxq0;->Y(J)V

    .line 86
    .line 87
    .line 88
    iget-object v2, v0, Lqj0;->w:Lsw;

    .line 89
    .line 90
    if-eqz v2, :cond_3

    .line 91
    .line 92
    invoke-virtual {v0, v4}, Lqj0;->d1(Z)V

    .line 93
    .line 94
    .line 95
    :cond_3
    const/4 v2, 0x4

    .line 96
    invoke-static {v2}, Lrj0;->f(I)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-virtual {v0}, Lqj0;->G0()Loe0;

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
    iget-object v6, v6, Loe0;->h:Loe0;

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
    invoke-virtual {v0, v5}, Lqj0;->I0(Z)Loe0;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    :goto_2
    if-eqz v5, :cond_e

    .line 118
    .line 119
    iget v7, v5, Loe0;->g:I

    .line 120
    .line 121
    and-int/2addr v7, v2

    .line 122
    if-eqz v7, :cond_e

    .line 123
    .line 124
    iget v7, v5, Loe0;->f:I

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
    instance-of v10, v8, Ltq;

    .line 135
    .line 136
    if-eqz v10, :cond_6

    .line 137
    .line 138
    check-cast v8, Ltq;

    .line 139
    .line 140
    invoke-interface {v8}, Ltq;->d0()V

    .line 141
    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_6
    iget v10, v8, Loe0;->f:I

    .line 145
    .line 146
    and-int/2addr v10, v2

    .line 147
    if-eqz v10, :cond_c

    .line 148
    .line 149
    instance-of v10, v8, Lsm;

    .line 150
    .line 151
    if-eqz v10, :cond_c

    .line 152
    .line 153
    move-object v10, v8

    .line 154
    check-cast v10, Lsm;

    .line 155
    .line 156
    iget-object v10, v10, Lsm;->s:Loe0;

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
    iget v13, v10, Loe0;->f:I

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
    new-instance v9, Lsh0;

    .line 176
    .line 177
    const/16 v12, 0x10

    .line 178
    .line 179
    new-array v12, v12, [Loe0;

    .line 180
    .line 181
    invoke-direct {v9, v12}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    if-eqz v8, :cond_9

    .line 185
    .line 186
    invoke-virtual {v9, v8}, Lsh0;->b(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object v8, v7

    .line 190
    :cond_9
    invoke-virtual {v9, v10}, Lsh0;->b(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_a
    :goto_5
    iget-object v10, v10, Loe0;->i:Loe0;

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
    invoke-static {v9}, Lpf1;->f(Lsh0;)Loe0;

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
    iget-object v5, v5, Loe0;->i:Loe0;

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_e
    :goto_7
    iget-object v2, v3, Lb60;->r:Ldn0;

    .line 210
    .line 211
    if-eqz v2, :cond_f

    .line 212
    .line 213
    check-cast v2, Lw3;

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Lw3;->v(Lb60;)V

    .line 216
    .line 217
    .line 218
    :cond_f
    iget-object v2, v0, Lqj0;->B:Lch0;

    .line 219
    .line 220
    if-eqz v2, :cond_10

    .line 221
    .line 222
    iget v2, v2, Lch0;->e:I

    .line 223
    .line 224
    if-eqz v2, :cond_10

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_10
    invoke-interface {v1}, Lyd0;->a()Ljava/util/Map;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-nez v2, :cond_18

    .line 236
    .line 237
    :goto_8
    iget-object v2, v0, Lqj0;->B:Lch0;

    .line 238
    .line 239
    invoke-interface {v1}, Lyd0;->a()Ljava/util/Map;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    if-nez v2, :cond_11

    .line 244
    .line 245
    goto :goto_b

    .line 246
    :cond_11
    iget v6, v2, Lch0;->e:I

    .line 247
    .line 248
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-eq v6, v7, :cond_12

    .line 253
    .line 254
    goto :goto_b

    .line 255
    :cond_12
    iget-object v6, v2, Lch0;->b:[Ljava/lang/Object;

    .line 256
    .line 257
    iget-object v7, v2, Lch0;->c:[I

    .line 258
    .line 259
    iget-object v2, v2, Lch0;->a:[J

    .line 260
    .line 261
    array-length v8, v2

    .line 262
    add-int/lit8 v8, v8, -0x2

    .line 263
    .line 264
    if-ltz v8, :cond_18

    .line 265
    .line 266
    move v9, v4

    .line 267
    :goto_9
    aget-wide v10, v2, v9

    .line 268
    .line 269
    not-long v12, v10

    .line 270
    const/4 v14, 0x7

    .line 271
    shl-long/2addr v12, v14

    .line 272
    and-long/2addr v12, v10

    .line 273
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    and-long/2addr v12, v14

    .line 279
    cmp-long v12, v12, v14

    .line 280
    .line 281
    if-eqz v12, :cond_17

    .line 282
    .line 283
    sub-int v12, v9, v8

    .line 284
    .line 285
    not-int v12, v12

    .line 286
    ushr-int/lit8 v12, v12, 0x1f

    .line 287
    .line 288
    const/16 v13, 0x8

    .line 289
    .line 290
    rsub-int/lit8 v12, v12, 0x8

    .line 291
    .line 292
    move v14, v4

    .line 293
    :goto_a
    if-ge v14, v12, :cond_16

    .line 294
    .line 295
    const-wide/16 v15, 0xff

    .line 296
    .line 297
    and-long/2addr v15, v10

    .line 298
    const-wide/16 v17, 0x80

    .line 299
    .line 300
    cmp-long v15, v15, v17

    .line 301
    .line 302
    if-gez v15, :cond_15

    .line 303
    .line 304
    shl-int/lit8 v15, v9, 0x3

    .line 305
    .line 306
    add-int/2addr v15, v14

    .line 307
    aget-object v16, v6, v15

    .line 308
    .line 309
    aget v15, v7, v15

    .line 310
    .line 311
    move-object/from16 v4, v16

    .line 312
    .line 313
    check-cast v4, Lo2;

    .line 314
    .line 315
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    check-cast v4, Ljava/lang/Integer;

    .line 320
    .line 321
    if-nez v4, :cond_13

    .line 322
    .line 323
    goto :goto_b

    .line 324
    :cond_13
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    if-eq v4, v15, :cond_15

    .line 329
    .line 330
    :goto_b
    iget-object v2, v3, Lb60;->J:Lf60;

    .line 331
    .line 332
    iget-object v2, v2, Lf60;->p:Lwd0;

    .line 333
    .line 334
    iget-object v2, v2, Lwd0;->z:Lc60;

    .line 335
    .line 336
    invoke-virtual {v2}, Lc60;->f()V

    .line 337
    .line 338
    .line 339
    iget-object v2, v0, Lqj0;->B:Lch0;

    .line 340
    .line 341
    if-nez v2, :cond_14

    .line 342
    .line 343
    sget-object v2, Ljk0;->a:Lch0;

    .line 344
    .line 345
    new-instance v2, Lch0;

    .line 346
    .line 347
    invoke-direct {v2}, Lch0;-><init>()V

    .line 348
    .line 349
    .line 350
    iput-object v2, v0, Lqj0;->B:Lch0;

    .line 351
    .line 352
    :cond_14
    invoke-virtual {v2}, Lch0;->a()V

    .line 353
    .line 354
    .line 355
    invoke-interface {v1}, Lyd0;->a()Ljava/util/Map;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    if-eqz v1, :cond_18

    .line 372
    .line 373
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    check-cast v1, Ljava/util/Map$Entry;

    .line 378
    .line 379
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    check-cast v1, Ljava/lang/Number;

    .line 388
    .line 389
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    invoke-virtual {v2, v1, v3}, Lch0;->g(ILjava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    goto :goto_c

    .line 397
    :cond_15
    shr-long/2addr v10, v13

    .line 398
    add-int/lit8 v14, v14, 0x1

    .line 399
    .line 400
    const/4 v4, 0x0

    .line 401
    goto :goto_a

    .line 402
    :cond_16
    if-ne v12, v13, :cond_18

    .line 403
    .line 404
    :cond_17
    if-eq v9, v8, :cond_18

    .line 405
    .line 406
    add-int/lit8 v9, v9, 0x1

    .line 407
    .line 408
    const/4 v4, 0x0

    .line 409
    goto/16 :goto_9

    .line 410
    .line 411
    :cond_18
    return-void
.end method

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 2
    .line 3
    iget-object p0, p0, Lb60;->B:Lym;

    .line 4
    .line 5
    invoke-interface {p0}, Lym;->b()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final b1()Lst0;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Loe0;->q:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-static {p0}, Lj50;->l(Li50;)Li50;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lqj0;->E:Lih0;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    new-instance v1, Lih0;

    .line 19
    .line 20
    invoke-direct {v1}, Lih0;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lqj0;->E:Lih0;

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Lqj0;->F0()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {p0, v2, v3}, Lqj0;->x0(J)J

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
    iput v5, v1, Lih0;->a:F

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
    iput v3, v1, Lih0;->b:F

    .line 58
    .line 59
    invoke-virtual {p0}, Lxq0;->U()I

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
    iput v4, v1, Lih0;->c:F

    .line 70
    .line 71
    invoke-virtual {p0}, Lxq0;->S()I

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
    iput v2, v1, Lih0;->d:F

    .line 82
    .line 83
    :goto_0
    if-eq p0, v0, :cond_3

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    const/4 v3, 0x1

    .line 87
    invoke-virtual {p0, v1, v2, v3}, Lqj0;->Y0(Lih0;ZZ)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Lih0;->b()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_2

    .line 95
    .line 96
    :goto_1
    sget-object p0, Lst0;->e:Lst0;

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_2
    iget-object p0, p0, Lqj0;->t:Lqj0;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    new-instance p0, Lst0;

    .line 106
    .line 107
    iget v0, v1, Lih0;->a:F

    .line 108
    .line 109
    iget v2, v1, Lih0;->b:F

    .line 110
    .line 111
    iget v3, v1, Lih0;->c:F

    .line 112
    .line 113
    iget v1, v1, Lih0;->d:F

    .line 114
    .line 115
    invoke-direct {p0, v0, v2, v3, v1}, Lst0;-><init>(FFFF)V

    .line 116
    .line 117
    .line 118
    return-object p0
.end method

.method public final c1(Lsw;Z)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lqj0;->r:Lb60;

    .line 4
    .line 5
    if-nez p2, :cond_1

    .line 6
    .line 7
    iget-object p2, p0, Lqj0;->w:Lsw;

    .line 8
    .line 9
    if-ne p2, p1, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lqj0;->x:Lym;

    .line 12
    .line 13
    iget-object v3, v2, Lb60;->B:Lym;

    .line 14
    .line 15
    invoke-static {p2, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iget-object p2, p0, Lqj0;->y:Lk50;

    .line 22
    .line 23
    iget-object v3, v2, Lb60;->C:Lk50;

    .line 24
    .line 25
    if-eq p2, v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move p2, v0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    move p2, v1

    .line 31
    :goto_1
    iget-object v3, v2, Lb60;->B:Lym;

    .line 32
    .line 33
    iput-object v3, p0, Lqj0;->x:Lym;

    .line 34
    .line 35
    iget-object v3, v2, Lb60;->C:Lk50;

    .line 36
    .line 37
    iput-object v3, p0, Lqj0;->y:Lk50;

    .line 38
    .line 39
    invoke-virtual {v2}, Lb60;->H()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object v9, p0, Lqj0;->M:Lnj0;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    if-eqz v3, :cond_d

    .line 47
    .line 48
    if-eqz p1, :cond_d

    .line 49
    .line 50
    iput-object p1, p0, Lqj0;->w:Lsw;

    .line 51
    .line 52
    iget-object p1, p0, Lqj0;->O:Lcn0;

    .line 53
    .line 54
    if-nez p1, :cond_b

    .line 55
    .line 56
    invoke-static {v2}, Le60;->a(Lb60;)Ldn0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object p2, p0, Lqj0;->L:Lm4;

    .line 61
    .line 62
    if-nez p2, :cond_2

    .line 63
    .line 64
    new-instance p2, Lnj0;

    .line 65
    .line 66
    invoke-direct {p2, p0, v0}, Lnj0;-><init>(Lqj0;I)V

    .line 67
    .line 68
    .line 69
    new-instance v3, Lm4;

    .line 70
    .line 71
    const/4 v5, 0x3

    .line 72
    invoke-direct {v3, v5, p0, p2}, Lm4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-object v3, p0, Lqj0;->L:Lm4;

    .line 76
    .line 77
    move-object v8, v3

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move-object v8, p2

    .line 80
    :goto_2
    move-object v7, p1

    .line 81
    check-cast v7, Lw3;

    .line 82
    .line 83
    iget-object p1, v7, Lw3;->w0:Ld;

    .line 84
    .line 85
    :cond_3
    iget-object p2, p1, Ld;->f:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/ref/ReferenceQueue;

    .line 88
    .line 89
    iget-object v3, p1, Ld;->e:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, Lsh0;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    if-eqz p2, :cond_4

    .line 98
    .line 99
    invoke-virtual {v3, p2}, Lsh0;->j(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :cond_4
    if-nez p2, :cond_3

    .line 103
    .line 104
    :cond_5
    iget p1, v3, Lsh0;->f:I

    .line 105
    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    add-int/lit8 p1, p1, -0x1

    .line 109
    .line 110
    invoke-virtual {v3, p1}, Lsh0;->k(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Ljava/lang/ref/Reference;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_6
    move-object p1, v4

    .line 124
    :goto_3
    check-cast p1, Lcn0;

    .line 125
    .line 126
    if-eqz p1, :cond_a

    .line 127
    .line 128
    move-object p2, p1

    .line 129
    check-cast p2, Lxx;

    .line 130
    .line 131
    iget-object v3, p2, Lxx;->e:Lux;

    .line 132
    .line 133
    if-eqz v3, :cond_9

    .line 134
    .line 135
    iget-object v5, p2, Lxx;->d:Lvx;

    .line 136
    .line 137
    iget-boolean v5, v5, Lvx;->s:Z

    .line 138
    .line 139
    if-nez v5, :cond_7

    .line 140
    .line 141
    const-string v5, "layer should have been released before reuse"

    .line 142
    .line 143
    invoke-static {v5}, Lw10;->a(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_7
    invoke-interface {v3}, Lux;->b()Lvx;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    iput-object v3, p2, Lxx;->d:Lvx;

    .line 151
    .line 152
    iput-boolean v0, p2, Lxx;->j:Z

    .line 153
    .line 154
    iput-object v8, p2, Lxx;->g:Lww;

    .line 155
    .line 156
    iput-object v9, p2, Lxx;->h:Lhw;

    .line 157
    .line 158
    iput-boolean v0, p2, Lxx;->t:Z

    .line 159
    .line 160
    iput-boolean v0, p2, Lxx;->u:Z

    .line 161
    .line 162
    iput-boolean v1, p2, Lxx;->v:Z

    .line 163
    .line 164
    iget-object v3, p2, Lxx;->k:[F

    .line 165
    .line 166
    invoke-static {v3}, Lr60;->A([F)V

    .line 167
    .line 168
    .line 169
    iget-object v3, p2, Lxx;->l:[F

    .line 170
    .line 171
    if-eqz v3, :cond_8

    .line 172
    .line 173
    invoke-static {v3}, Lr60;->A([F)V

    .line 174
    .line 175
    .line 176
    :cond_8
    sget-wide v5, Lt81;->a:J

    .line 177
    .line 178
    iput-wide v5, p2, Lxx;->r:J

    .line 179
    .line 180
    iput-boolean v0, p2, Lxx;->w:Z

    .line 181
    .line 182
    const-wide v5, 0x7fffffff7fffffffL

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    iput-wide v5, p2, Lxx;->i:J

    .line 188
    .line 189
    iput-object v4, p2, Lxx;->s:Lv50;

    .line 190
    .line 191
    iput v0, p2, Lxx;->q:I

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_9
    const-string p0, "currently reuse is only supported when we manage the layer lifecycle"

    .line 195
    .line 196
    invoke-static {p0}, Lt1;->g(Ljava/lang/String;)Lsg;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    throw p0

    .line 201
    :cond_a
    new-instance v4, Lxx;

    .line 202
    .line 203
    invoke-virtual {v7}, Lw3;->getGraphicsContext()Lux;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-interface {p1}, Lux;->b()Lvx;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-virtual {v7}, Lw3;->getGraphicsContext()Lux;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-direct/range {v4 .. v9}, Lxx;-><init>(Lvx;Lux;Lw3;Lww;Lhw;)V

    .line 216
    .line 217
    .line 218
    move-object p1, v4

    .line 219
    :goto_4
    iget-wide v3, p0, Lxq0;->f:J

    .line 220
    .line 221
    move-object p2, p1

    .line 222
    check-cast p2, Lxx;

    .line 223
    .line 224
    invoke-virtual {p2, v3, v4}, Lxx;->e(J)V

    .line 225
    .line 226
    .line 227
    iget-wide v3, p0, Lqj0;->C:J

    .line 228
    .line 229
    invoke-virtual {p2, v3, v4}, Lxx;->d(J)V

    .line 230
    .line 231
    .line 232
    iput-object p1, p0, Lqj0;->O:Lcn0;

    .line 233
    .line 234
    invoke-virtual {p0, v1}, Lqj0;->d1(Z)V

    .line 235
    .line 236
    .line 237
    iput-boolean v1, v2, Lb60;->M:Z

    .line 238
    .line 239
    invoke-virtual {v9}, Lnj0;->invoke()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_b
    if-eqz p2, :cond_c

    .line 244
    .line 245
    invoke-virtual {p0, v1}, Lqj0;->d1(Z)V

    .line 246
    .line 247
    .line 248
    :cond_c
    return-void

    .line 249
    :cond_d
    iput-object v4, p0, Lqj0;->w:Lsw;

    .line 250
    .line 251
    iget-object p1, p0, Lqj0;->O:Lcn0;

    .line 252
    .line 253
    if-eqz p1, :cond_12

    .line 254
    .line 255
    check-cast p1, Lxx;

    .line 256
    .line 257
    invoke-virtual {p1}, Lxx;->b()[F

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-static {p2}, Lw60;->z([F)Z

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    if-nez p2, :cond_e

    .line 266
    .line 267
    invoke-virtual {v2}, Lb60;->N()V

    .line 268
    .line 269
    .line 270
    :cond_e
    iput-object v4, p1, Lxx;->g:Lww;

    .line 271
    .line 272
    iput-object v4, p1, Lxx;->h:Lhw;

    .line 273
    .line 274
    iput-boolean v1, p1, Lxx;->j:Z

    .line 275
    .line 276
    invoke-virtual {p1, v0}, Lxx;->f(Z)V

    .line 277
    .line 278
    .line 279
    iget-object p2, p1, Lxx;->e:Lux;

    .line 280
    .line 281
    if-eqz p2, :cond_11

    .line 282
    .line 283
    iget-object v3, p1, Lxx;->d:Lvx;

    .line 284
    .line 285
    invoke-interface {p2, v3}, Lux;->a(Lvx;)V

    .line 286
    .line 287
    .line 288
    iget-object p2, p1, Lxx;->f:Lw3;

    .line 289
    .line 290
    iget-object v3, p2, Lw3;->w0:Ld;

    .line 291
    .line 292
    :cond_f
    iget-object v5, v3, Ld;->f:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v5, Ljava/lang/ref/ReferenceQueue;

    .line 295
    .line 296
    iget-object v6, v3, Ld;->e:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v6, Lsh0;

    .line 299
    .line 300
    invoke-virtual {v5}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    if-eqz v5, :cond_10

    .line 305
    .line 306
    invoke-virtual {v6, v5}, Lsh0;->j(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    :cond_10
    if-nez v5, :cond_f

    .line 310
    .line 311
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 312
    .line 313
    iget-object v3, v3, Ld;->f:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v3, Ljava/lang/ref/ReferenceQueue;

    .line 316
    .line 317
    invoke-direct {v5, p1, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v6, v5}, Lsh0;->b(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    iget-object p2, p2, Lw3;->G:Ldh0;

    .line 324
    .line 325
    invoke-virtual {p2, p1}, Ldh0;->j(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    :cond_11
    iput-boolean v1, v2, Lb60;->M:Z

    .line 329
    .line 330
    invoke-virtual {v9}, Lnj0;->invoke()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    iget-boolean p1, p1, Loe0;->q:Z

    .line 338
    .line 339
    if-eqz p1, :cond_12

    .line 340
    .line 341
    invoke-virtual {v2}, Lb60;->I()Z

    .line 342
    .line 343
    .line 344
    move-result p1

    .line 345
    if-eqz p1, :cond_12

    .line 346
    .line 347
    iget-object p1, v2, Lb60;->r:Ldn0;

    .line 348
    .line 349
    if-eqz p1, :cond_12

    .line 350
    .line 351
    check-cast p1, Lw3;

    .line 352
    .line 353
    invoke-virtual {p1, v2}, Lw3;->v(Lb60;)V

    .line 354
    .line 355
    .line 356
    :cond_12
    iput-object v4, p0, Lqj0;->O:Lcn0;

    .line 357
    .line 358
    iput-boolean v0, p0, Lqj0;->N:Z

    .line 359
    .line 360
    return-void
.end method

.method public final d(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Loe0;->q:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Lqj0;->P0(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 19
    .line 20
    invoke-static {p0}, Le60;->a(Lb60;)Ldn0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lw3;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Lw3;->r(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    return-wide p0
.end method

.method public final d1(Z)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lqj0;->O:Lcn0;

    .line 4
    .line 5
    iget-object v2, v0, Lqj0;->w:Lsw;

    .line 6
    .line 7
    if-eqz v1, :cond_35

    .line 8
    .line 9
    if-eqz v2, :cond_34

    .line 10
    .line 11
    sget-object v3, Lqj0;->P:Lgv0;

    .line 12
    .line 13
    invoke-virtual {v3}, Lgv0;->a()V

    .line 14
    .line 15
    .line 16
    iget-object v4, v0, Lqj0;->r:Lb60;

    .line 17
    .line 18
    iget-object v5, v4, Lb60;->B:Lym;

    .line 19
    .line 20
    iput-object v5, v3, Lgv0;->p:Lym;

    .line 21
    .line 22
    iget-object v5, v4, Lb60;->C:Lk50;

    .line 23
    .line 24
    iput-object v5, v3, Lgv0;->q:Lk50;

    .line 25
    .line 26
    iget-wide v5, v0, Lxq0;->f:J

    .line 27
    .line 28
    invoke-static {v5, v6}, Lo30;->C(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    iput-wide v5, v3, Lgv0;->o:J

    .line 33
    .line 34
    invoke-static {v4}, Le60;->a(Lb60;)Ldn0;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Lw3;

    .line 39
    .line 40
    invoke-virtual {v5}, Lw3;->getSnapshotObserver()Lfn0;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    sget-object v6, Lp3;->u:Lp3;

    .line 45
    .line 46
    new-instance v7, Lm3;

    .line 47
    .line 48
    const/16 v8, 0x8

    .line 49
    .line 50
    invoke-direct {v7, v8, v2, v0}, Lm3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v2, v5, Lfn0;->a:Le31;

    .line 54
    .line 55
    invoke-virtual {v2, v0, v6, v7}, Le31;->b(Ljava/lang/Object;Lsw;Lhw;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, v0, Lqj0;->F:Lf50;

    .line 59
    .line 60
    if-nez v2, :cond_0

    .line 61
    .line 62
    new-instance v2, Lf50;

    .line 63
    .line 64
    invoke-direct {v2}, Lf50;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v2, v0, Lqj0;->F:Lf50;

    .line 68
    .line 69
    :cond_0
    sget-object v5, Lqj0;->Q:Lf50;

    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget v6, v2, Lf50;->a:F

    .line 75
    .line 76
    iput v6, v5, Lf50;->a:F

    .line 77
    .line 78
    iget v6, v2, Lf50;->b:F

    .line 79
    .line 80
    iput v6, v5, Lf50;->b:F

    .line 81
    .line 82
    iget v6, v2, Lf50;->c:F

    .line 83
    .line 84
    iput v6, v5, Lf50;->c:F

    .line 85
    .line 86
    iget-wide v6, v2, Lf50;->d:J

    .line 87
    .line 88
    iput-wide v6, v5, Lf50;->d:J

    .line 89
    .line 90
    iget v6, v3, Lgv0;->e:F

    .line 91
    .line 92
    iput v6, v2, Lf50;->a:F

    .line 93
    .line 94
    iget v7, v3, Lgv0;->f:F

    .line 95
    .line 96
    iput v7, v2, Lf50;->b:F

    .line 97
    .line 98
    iget v7, v3, Lgv0;->k:F

    .line 99
    .line 100
    iput v7, v2, Lf50;->c:F

    .line 101
    .line 102
    iget-wide v7, v3, Lgv0;->l:J

    .line 103
    .line 104
    iput-wide v7, v2, Lf50;->d:J

    .line 105
    .line 106
    check-cast v1, Lxx;

    .line 107
    .line 108
    iget-object v9, v1, Lxx;->f:Lw3;

    .line 109
    .line 110
    iget v10, v3, Lgv0;->d:I

    .line 111
    .line 112
    iget v11, v1, Lxx;->q:I

    .line 113
    .line 114
    or-int/2addr v10, v11

    .line 115
    iget-object v11, v3, Lgv0;->q:Lk50;

    .line 116
    .line 117
    iput-object v11, v1, Lxx;->o:Lk50;

    .line 118
    .line 119
    iget-object v11, v3, Lgv0;->p:Lym;

    .line 120
    .line 121
    iput-object v11, v1, Lxx;->n:Lym;

    .line 122
    .line 123
    and-int/lit16 v11, v10, 0x1000

    .line 124
    .line 125
    if-eqz v11, :cond_1

    .line 126
    .line 127
    iput-wide v7, v1, Lxx;->r:J

    .line 128
    .line 129
    :cond_1
    and-int/lit8 v7, v10, 0x1

    .line 130
    .line 131
    if-eqz v7, :cond_3

    .line 132
    .line 133
    iget-object v7, v1, Lxx;->d:Lvx;

    .line 134
    .line 135
    iget-object v7, v7, Lvx;->a:Lzx;

    .line 136
    .line 137
    iget v8, v7, Lzx;->j:F

    .line 138
    .line 139
    cmpg-float v8, v8, v6

    .line 140
    .line 141
    if-nez v8, :cond_2

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_2
    iput v6, v7, Lzx;->j:F

    .line 145
    .line 146
    iget-object v7, v7, Lzx;->c:Landroid/graphics/RenderNode;

    .line 147
    .line 148
    invoke-virtual {v7, v6}, Landroid/graphics/RenderNode;->setScaleX(F)Z

    .line 149
    .line 150
    .line 151
    :cond_3
    :goto_0
    and-int/lit8 v6, v10, 0x2

    .line 152
    .line 153
    if-eqz v6, :cond_5

    .line 154
    .line 155
    iget-object v6, v1, Lxx;->d:Lvx;

    .line 156
    .line 157
    iget v7, v3, Lgv0;->f:F

    .line 158
    .line 159
    iget-object v6, v6, Lvx;->a:Lzx;

    .line 160
    .line 161
    iget v8, v6, Lzx;->k:F

    .line 162
    .line 163
    cmpg-float v8, v8, v7

    .line 164
    .line 165
    if-nez v8, :cond_4

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_4
    iput v7, v6, Lzx;->k:F

    .line 169
    .line 170
    iget-object v6, v6, Lzx;->c:Landroid/graphics/RenderNode;

    .line 171
    .line 172
    invoke-virtual {v6, v7}, Landroid/graphics/RenderNode;->setScaleY(F)Z

    .line 173
    .line 174
    .line 175
    :cond_5
    :goto_1
    and-int/lit8 v6, v10, 0x4

    .line 176
    .line 177
    if-eqz v6, :cond_7

    .line 178
    .line 179
    iget-object v6, v1, Lxx;->d:Lvx;

    .line 180
    .line 181
    iget v7, v3, Lgv0;->g:F

    .line 182
    .line 183
    iget-object v6, v6, Lvx;->a:Lzx;

    .line 184
    .line 185
    iget v8, v6, Lzx;->h:F

    .line 186
    .line 187
    cmpg-float v8, v8, v7

    .line 188
    .line 189
    if-nez v8, :cond_6

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_6
    iput v7, v6, Lzx;->h:F

    .line 193
    .line 194
    iget-object v6, v6, Lzx;->c:Landroid/graphics/RenderNode;

    .line 195
    .line 196
    invoke-virtual {v6, v7}, Landroid/graphics/RenderNode;->setAlpha(F)Z

    .line 197
    .line 198
    .line 199
    :cond_7
    :goto_2
    and-int/lit8 v6, v10, 0x8

    .line 200
    .line 201
    if-eqz v6, :cond_8

    .line 202
    .line 203
    iget-object v6, v1, Lxx;->d:Lvx;

    .line 204
    .line 205
    iget-object v6, v6, Lvx;->a:Lzx;

    .line 206
    .line 207
    :cond_8
    and-int/lit8 v6, v10, 0x10

    .line 208
    .line 209
    if-eqz v6, :cond_9

    .line 210
    .line 211
    iget-object v6, v1, Lxx;->d:Lvx;

    .line 212
    .line 213
    iget-object v6, v6, Lvx;->a:Lzx;

    .line 214
    .line 215
    :cond_9
    and-int/lit8 v6, v10, 0x20

    .line 216
    .line 217
    const/4 v7, 0x0

    .line 218
    const/4 v8, 0x1

    .line 219
    if-eqz v6, :cond_b

    .line 220
    .line 221
    iget-object v6, v1, Lxx;->d:Lvx;

    .line 222
    .line 223
    iget v12, v3, Lgv0;->h:F

    .line 224
    .line 225
    iget-object v13, v6, Lvx;->a:Lzx;

    .line 226
    .line 227
    iget v14, v13, Lzx;->l:F

    .line 228
    .line 229
    cmpg-float v14, v14, v12

    .line 230
    .line 231
    if-nez v14, :cond_a

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_a
    iput v12, v13, Lzx;->l:F

    .line 235
    .line 236
    iget-object v13, v13, Lzx;->c:Landroid/graphics/RenderNode;

    .line 237
    .line 238
    invoke-virtual {v13, v12}, Landroid/graphics/RenderNode;->setElevation(F)Z

    .line 239
    .line 240
    .line 241
    iput-boolean v8, v6, Lvx;->g:Z

    .line 242
    .line 243
    invoke-virtual {v6}, Lvx;->a()V

    .line 244
    .line 245
    .line 246
    :goto_3
    iget v6, v3, Lgv0;->h:F

    .line 247
    .line 248
    cmpl-float v6, v6, v7

    .line 249
    .line 250
    if-lez v6, :cond_b

    .line 251
    .line 252
    iget-boolean v6, v1, Lxx;->w:Z

    .line 253
    .line 254
    if-nez v6, :cond_b

    .line 255
    .line 256
    iget-object v6, v1, Lxx;->h:Lhw;

    .line 257
    .line 258
    if-eqz v6, :cond_b

    .line 259
    .line 260
    invoke-interface {v6}, Lhw;->invoke()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    :cond_b
    and-int/lit8 v6, v10, 0x40

    .line 264
    .line 265
    if-eqz v6, :cond_c

    .line 266
    .line 267
    iget-object v6, v1, Lxx;->d:Lvx;

    .line 268
    .line 269
    iget-wide v12, v3, Lgv0;->i:J

    .line 270
    .line 271
    iget-object v6, v6, Lvx;->a:Lzx;

    .line 272
    .line 273
    iget-wide v14, v6, Lzx;->m:J

    .line 274
    .line 275
    invoke-static {v12, v13, v14, v15}, Lff;->c(JJ)Z

    .line 276
    .line 277
    .line 278
    move-result v14

    .line 279
    if-nez v14, :cond_c

    .line 280
    .line 281
    iput-wide v12, v6, Lzx;->m:J

    .line 282
    .line 283
    iget-object v6, v6, Lzx;->c:Landroid/graphics/RenderNode;

    .line 284
    .line 285
    invoke-static {v12, v13}, Lp30;->W(J)I

    .line 286
    .line 287
    .line 288
    move-result v12

    .line 289
    invoke-virtual {v6, v12}, Landroid/graphics/RenderNode;->setAmbientShadowColor(I)Z

    .line 290
    .line 291
    .line 292
    :cond_c
    and-int/lit16 v6, v10, 0x80

    .line 293
    .line 294
    if-eqz v6, :cond_d

    .line 295
    .line 296
    iget-object v6, v1, Lxx;->d:Lvx;

    .line 297
    .line 298
    iget-wide v12, v3, Lgv0;->j:J

    .line 299
    .line 300
    iget-object v6, v6, Lvx;->a:Lzx;

    .line 301
    .line 302
    iget-wide v14, v6, Lzx;->n:J

    .line 303
    .line 304
    invoke-static {v12, v13, v14, v15}, Lff;->c(JJ)Z

    .line 305
    .line 306
    .line 307
    move-result v14

    .line 308
    if-nez v14, :cond_d

    .line 309
    .line 310
    iput-wide v12, v6, Lzx;->n:J

    .line 311
    .line 312
    iget-object v6, v6, Lzx;->c:Landroid/graphics/RenderNode;

    .line 313
    .line 314
    invoke-static {v12, v13}, Lp30;->W(J)I

    .line 315
    .line 316
    .line 317
    move-result v12

    .line 318
    invoke-virtual {v6, v12}, Landroid/graphics/RenderNode;->setSpotShadowColor(I)Z

    .line 319
    .line 320
    .line 321
    :cond_d
    and-int/lit16 v6, v10, 0x400

    .line 322
    .line 323
    if-eqz v6, :cond_e

    .line 324
    .line 325
    iget-object v6, v1, Lxx;->d:Lvx;

    .line 326
    .line 327
    iget-object v6, v6, Lvx;->a:Lzx;

    .line 328
    .line 329
    :cond_e
    and-int/lit16 v6, v10, 0x100

    .line 330
    .line 331
    if-eqz v6, :cond_f

    .line 332
    .line 333
    iget-object v6, v1, Lxx;->d:Lvx;

    .line 334
    .line 335
    iget-object v6, v6, Lvx;->a:Lzx;

    .line 336
    .line 337
    :cond_f
    and-int/lit16 v6, v10, 0x200

    .line 338
    .line 339
    if-eqz v6, :cond_10

    .line 340
    .line 341
    iget-object v6, v1, Lxx;->d:Lvx;

    .line 342
    .line 343
    iget-object v6, v6, Lvx;->a:Lzx;

    .line 344
    .line 345
    :cond_10
    and-int/lit16 v6, v10, 0x800

    .line 346
    .line 347
    if-eqz v6, :cond_12

    .line 348
    .line 349
    iget-object v6, v1, Lxx;->d:Lvx;

    .line 350
    .line 351
    iget v12, v3, Lgv0;->k:F

    .line 352
    .line 353
    iget-object v6, v6, Lvx;->a:Lzx;

    .line 354
    .line 355
    iget v13, v6, Lzx;->o:F

    .line 356
    .line 357
    cmpg-float v13, v13, v12

    .line 358
    .line 359
    if-nez v13, :cond_11

    .line 360
    .line 361
    goto :goto_4

    .line 362
    :cond_11
    iput v12, v6, Lzx;->o:F

    .line 363
    .line 364
    iget-object v6, v6, Lzx;->c:Landroid/graphics/RenderNode;

    .line 365
    .line 366
    invoke-virtual {v6, v12}, Landroid/graphics/RenderNode;->setCameraDistance(F)Z

    .line 367
    .line 368
    .line 369
    :cond_12
    :goto_4
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    const/16 v16, 0x20

    .line 375
    .line 376
    const/4 v6, 0x0

    .line 377
    const-wide v17, 0xffffffffL

    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    if-eqz v11, :cond_15

    .line 383
    .line 384
    iget-wide v12, v1, Lxx;->r:J

    .line 385
    .line 386
    sget-wide v19, Lt81;->a:J

    .line 387
    .line 388
    cmp-long v11, v12, v19

    .line 389
    .line 390
    if-nez v11, :cond_13

    .line 391
    .line 392
    move v11, v8

    .line 393
    goto :goto_5

    .line 394
    :cond_13
    move v11, v6

    .line 395
    :goto_5
    iget-object v7, v1, Lxx;->d:Lvx;

    .line 396
    .line 397
    if-eqz v11, :cond_14

    .line 398
    .line 399
    invoke-virtual {v7, v14, v15}, Lvx;->g(J)V

    .line 400
    .line 401
    .line 402
    goto :goto_6

    .line 403
    :cond_14
    shr-long v11, v12, v16

    .line 404
    .line 405
    long-to-int v11, v11

    .line 406
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 407
    .line 408
    .line 409
    move-result v11

    .line 410
    iget-wide v12, v1, Lxx;->i:J

    .line 411
    .line 412
    shr-long v12, v12, v16

    .line 413
    .line 414
    long-to-int v12, v12

    .line 415
    int-to-float v12, v12

    .line 416
    mul-float/2addr v11, v12

    .line 417
    iget-wide v12, v1, Lxx;->r:J

    .line 418
    .line 419
    and-long v12, v12, v17

    .line 420
    .line 421
    long-to-int v12, v12

    .line 422
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 423
    .line 424
    .line 425
    move-result v12

    .line 426
    iget-wide v14, v1, Lxx;->i:J

    .line 427
    .line 428
    and-long v13, v14, v17

    .line 429
    .line 430
    long-to-int v13, v13

    .line 431
    int-to-float v13, v13

    .line 432
    mul-float/2addr v12, v13

    .line 433
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 434
    .line 435
    .line 436
    move-result v11

    .line 437
    int-to-long v13, v11

    .line 438
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 439
    .line 440
    .line 441
    move-result v11

    .line 442
    int-to-long v11, v11

    .line 443
    shl-long v13, v13, v16

    .line 444
    .line 445
    and-long v11, v11, v17

    .line 446
    .line 447
    or-long/2addr v11, v13

    .line 448
    invoke-virtual {v7, v11, v12}, Lvx;->g(J)V

    .line 449
    .line 450
    .line 451
    :cond_15
    :goto_6
    and-int/lit16 v7, v10, 0x4000

    .line 452
    .line 453
    if-eqz v7, :cond_16

    .line 454
    .line 455
    iget-object v7, v1, Lxx;->d:Lvx;

    .line 456
    .line 457
    iget-boolean v11, v3, Lgv0;->n:Z

    .line 458
    .line 459
    iget-boolean v12, v7, Lvx;->w:Z

    .line 460
    .line 461
    if-eq v12, v11, :cond_16

    .line 462
    .line 463
    iput-boolean v11, v7, Lvx;->w:Z

    .line 464
    .line 465
    iput-boolean v8, v7, Lvx;->g:Z

    .line 466
    .line 467
    invoke-virtual {v7}, Lvx;->a()V

    .line 468
    .line 469
    .line 470
    :cond_16
    const/high16 v7, 0x20000

    .line 471
    .line 472
    and-int/2addr v7, v10

    .line 473
    if-eqz v7, :cond_17

    .line 474
    .line 475
    iget-object v7, v1, Lxx;->d:Lvx;

    .line 476
    .line 477
    iget-object v7, v7, Lvx;->a:Lzx;

    .line 478
    .line 479
    :cond_17
    const/high16 v7, 0x40000

    .line 480
    .line 481
    and-int/2addr v7, v10

    .line 482
    if-eqz v7, :cond_18

    .line 483
    .line 484
    iget-object v7, v1, Lxx;->d:Lvx;

    .line 485
    .line 486
    iget-object v7, v7, Lvx;->a:Lzx;

    .line 487
    .line 488
    :cond_18
    const/high16 v7, 0x80000

    .line 489
    .line 490
    and-int/2addr v7, v10

    .line 491
    if-eqz v7, :cond_1b

    .line 492
    .line 493
    iget-object v7, v1, Lxx;->d:Lvx;

    .line 494
    .line 495
    iget v11, v3, Lgv0;->r:I

    .line 496
    .line 497
    iget-object v7, v7, Lvx;->a:Lzx;

    .line 498
    .line 499
    iget v12, v7, Lzx;->i:I

    .line 500
    .line 501
    if-ne v12, v11, :cond_19

    .line 502
    .line 503
    goto :goto_7

    .line 504
    :cond_19
    iput v11, v7, Lzx;->i:I

    .line 505
    .line 506
    iget-object v12, v7, Lzx;->e:Landroid/graphics/Paint;

    .line 507
    .line 508
    if-nez v12, :cond_1a

    .line 509
    .line 510
    new-instance v12, Landroid/graphics/Paint;

    .line 511
    .line 512
    invoke-direct {v12}, Landroid/graphics/Paint;-><init>()V

    .line 513
    .line 514
    .line 515
    iput-object v12, v7, Lzx;->e:Landroid/graphics/Paint;

    .line 516
    .line 517
    :cond_1a
    invoke-static {v11}, Lo30;->B(I)Landroid/graphics/BlendMode;

    .line 518
    .line 519
    .line 520
    move-result-object v11

    .line 521
    invoke-virtual {v12, v11}, Landroid/graphics/Paint;->setBlendMode(Landroid/graphics/BlendMode;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v7}, Lzx;->c()V

    .line 525
    .line 526
    .line 527
    :cond_1b
    :goto_7
    const v7, 0x8000

    .line 528
    .line 529
    .line 530
    and-int/2addr v7, v10

    .line 531
    if-eqz v7, :cond_1d

    .line 532
    .line 533
    iget-object v7, v1, Lxx;->d:Lvx;

    .line 534
    .line 535
    iget-object v7, v7, Lvx;->a:Lzx;

    .line 536
    .line 537
    iget v11, v7, Lzx;->s:I

    .line 538
    .line 539
    if-nez v11, :cond_1c

    .line 540
    .line 541
    goto :goto_8

    .line 542
    :cond_1c
    iput v6, v7, Lzx;->s:I

    .line 543
    .line 544
    invoke-virtual {v7}, Lzx;->c()V

    .line 545
    .line 546
    .line 547
    :cond_1d
    :goto_8
    and-int/lit16 v7, v10, 0x1f1b

    .line 548
    .line 549
    if-eqz v7, :cond_1e

    .line 550
    .line 551
    iput-boolean v8, v1, Lxx;->t:Z

    .line 552
    .line 553
    iput-boolean v8, v1, Lxx;->u:Z

    .line 554
    .line 555
    :cond_1e
    iget-object v7, v1, Lxx;->s:Lv50;

    .line 556
    .line 557
    iget-object v11, v3, Lgv0;->s:Lv50;

    .line 558
    .line 559
    invoke-static {v7, v11}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v7

    .line 563
    if-nez v7, :cond_25

    .line 564
    .line 565
    iget-object v7, v3, Lgv0;->s:Lv50;

    .line 566
    .line 567
    iput-object v7, v1, Lxx;->s:Lv50;

    .line 568
    .line 569
    if-nez v7, :cond_1f

    .line 570
    .line 571
    move-object/from16 v27, v9

    .line 572
    .line 573
    goto/16 :goto_a

    .line 574
    .line 575
    :cond_1f
    iget-object v12, v1, Lxx;->d:Lvx;

    .line 576
    .line 577
    instance-of v13, v7, Lxm0;

    .line 578
    .line 579
    if-eqz v13, :cond_20

    .line 580
    .line 581
    move-object v13, v7

    .line 582
    check-cast v13, Lxm0;

    .line 583
    .line 584
    iget-object v13, v13, Lxm0;->a:Lst0;

    .line 585
    .line 586
    iget v14, v13, Lst0;->a:F

    .line 587
    .line 588
    iget v15, v13, Lst0;->b:F

    .line 589
    .line 590
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 591
    .line 592
    .line 593
    move-result v6

    .line 594
    move-object/from16 v27, v9

    .line 595
    .line 596
    int-to-long v8, v6

    .line 597
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 598
    .line 599
    .line 600
    move-result v6

    .line 601
    move-object/from16 v21, v12

    .line 602
    .line 603
    int-to-long v11, v6

    .line 604
    shl-long v8, v8, v16

    .line 605
    .line 606
    and-long v11, v11, v17

    .line 607
    .line 608
    or-long v22, v8, v11

    .line 609
    .line 610
    iget v6, v13, Lst0;->c:F

    .line 611
    .line 612
    sub-float/2addr v6, v14

    .line 613
    iget v8, v13, Lst0;->d:F

    .line 614
    .line 615
    sub-float/2addr v8, v15

    .line 616
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 617
    .line 618
    .line 619
    move-result v6

    .line 620
    int-to-long v11, v6

    .line 621
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 622
    .line 623
    .line 624
    move-result v6

    .line 625
    int-to-long v8, v6

    .line 626
    shl-long v11, v11, v16

    .line 627
    .line 628
    and-long v8, v8, v17

    .line 629
    .line 630
    or-long v24, v11, v8

    .line 631
    .line 632
    const/16 v26, 0x0

    .line 633
    .line 634
    invoke-virtual/range {v21 .. v26}, Lvx;->i(JJF)V

    .line 635
    .line 636
    .line 637
    goto/16 :goto_9

    .line 638
    .line 639
    :cond_20
    move-object/from16 v27, v9

    .line 640
    .line 641
    move-object v6, v12

    .line 642
    instance-of v8, v7, Lwm0;

    .line 643
    .line 644
    const-wide/16 v11, 0x0

    .line 645
    .line 646
    if-eqz v8, :cond_21

    .line 647
    .line 648
    move-object v8, v7

    .line 649
    check-cast v8, Lwm0;

    .line 650
    .line 651
    iget-object v8, v8, Lwm0;->a:Ld6;

    .line 652
    .line 653
    const/4 v9, 0x0

    .line 654
    iput-object v9, v6, Lvx;->k:Lv50;

    .line 655
    .line 656
    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    iput-wide v13, v6, Lvx;->i:J

    .line 662
    .line 663
    iput-wide v11, v6, Lvx;->h:J

    .line 664
    .line 665
    const/4 v9, 0x0

    .line 666
    iput v9, v6, Lvx;->j:F

    .line 667
    .line 668
    const/4 v9, 0x1

    .line 669
    iput-boolean v9, v6, Lvx;->g:Z

    .line 670
    .line 671
    const/4 v9, 0x0

    .line 672
    iput-boolean v9, v6, Lvx;->n:Z

    .line 673
    .line 674
    iput-object v8, v6, Lvx;->l:Ld6;

    .line 675
    .line 676
    invoke-virtual {v6}, Lvx;->a()V

    .line 677
    .line 678
    .line 679
    goto :goto_9

    .line 680
    :cond_21
    instance-of v8, v7, Lym0;

    .line 681
    .line 682
    if-eqz v8, :cond_24

    .line 683
    .line 684
    move-object v8, v7

    .line 685
    check-cast v8, Lym0;

    .line 686
    .line 687
    iget-object v9, v8, Lym0;->b:Ld6;

    .line 688
    .line 689
    if-eqz v9, :cond_22

    .line 690
    .line 691
    const/4 v13, 0x0

    .line 692
    iput-object v13, v6, Lvx;->k:Lv50;

    .line 693
    .line 694
    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    iput-wide v13, v6, Lvx;->i:J

    .line 700
    .line 701
    iput-wide v11, v6, Lvx;->h:J

    .line 702
    .line 703
    const/4 v8, 0x0

    .line 704
    iput v8, v6, Lvx;->j:F

    .line 705
    .line 706
    const/4 v8, 0x1

    .line 707
    iput-boolean v8, v6, Lvx;->g:Z

    .line 708
    .line 709
    const/4 v8, 0x0

    .line 710
    iput-boolean v8, v6, Lvx;->n:Z

    .line 711
    .line 712
    iput-object v9, v6, Lvx;->l:Ld6;

    .line 713
    .line 714
    invoke-virtual {v6}, Lvx;->a()V

    .line 715
    .line 716
    .line 717
    goto :goto_9

    .line 718
    :cond_22
    iget-object v8, v8, Lym0;->a:Lbw0;

    .line 719
    .line 720
    iget v9, v8, Lbw0;->b:F

    .line 721
    .line 722
    iget v11, v8, Lbw0;->a:F

    .line 723
    .line 724
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 725
    .line 726
    .line 727
    move-result v12

    .line 728
    int-to-long v12, v12

    .line 729
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 730
    .line 731
    .line 732
    move-result v14

    .line 733
    int-to-long v14, v14

    .line 734
    shl-long v12, v12, v16

    .line 735
    .line 736
    and-long v14, v14, v17

    .line 737
    .line 738
    or-long v22, v12, v14

    .line 739
    .line 740
    iget v12, v8, Lbw0;->c:F

    .line 741
    .line 742
    sub-float/2addr v12, v11

    .line 743
    iget v11, v8, Lbw0;->d:F

    .line 744
    .line 745
    sub-float/2addr v11, v9

    .line 746
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 747
    .line 748
    .line 749
    move-result v9

    .line 750
    int-to-long v12, v9

    .line 751
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 752
    .line 753
    .line 754
    move-result v9

    .line 755
    int-to-long v14, v9

    .line 756
    shl-long v11, v12, v16

    .line 757
    .line 758
    and-long v13, v14, v17

    .line 759
    .line 760
    or-long v24, v11, v13

    .line 761
    .line 762
    iget-wide v8, v8, Lbw0;->h:J

    .line 763
    .line 764
    shr-long v8, v8, v16

    .line 765
    .line 766
    long-to-int v8, v8

    .line 767
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 768
    .line 769
    .line 770
    move-result v26

    .line 771
    move-object/from16 v21, v6

    .line 772
    .line 773
    invoke-virtual/range {v21 .. v26}, Lvx;->i(JJF)V

    .line 774
    .line 775
    .line 776
    :goto_9
    instance-of v6, v7, Lwm0;

    .line 777
    .line 778
    if-eqz v6, :cond_23

    .line 779
    .line 780
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 781
    .line 782
    const/16 v7, 0x21

    .line 783
    .line 784
    if-ge v6, v7, :cond_23

    .line 785
    .line 786
    iget-object v6, v1, Lxx;->h:Lhw;

    .line 787
    .line 788
    if-eqz v6, :cond_23

    .line 789
    .line 790
    invoke-interface {v6}, Lhw;->invoke()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    :cond_23
    :goto_a
    const/4 v6, 0x1

    .line 794
    goto :goto_b

    .line 795
    :cond_24
    invoke-static {}, Lxc;->j()V

    .line 796
    .line 797
    .line 798
    return-void

    .line 799
    :cond_25
    move-object/from16 v27, v9

    .line 800
    .line 801
    const/4 v6, 0x0

    .line 802
    :goto_b
    iget v7, v3, Lgv0;->d:I

    .line 803
    .line 804
    iput v7, v1, Lxx;->q:I

    .line 805
    .line 806
    if-nez v10, :cond_26

    .line 807
    .line 808
    if-eqz v6, :cond_28

    .line 809
    .line 810
    :cond_26
    invoke-virtual/range {v27 .. v27}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    if-eqz v1, :cond_27

    .line 815
    .line 816
    move-object/from16 v6, v27

    .line 817
    .line 818
    invoke-interface {v1, v6, v6}, Landroid/view/ViewParent;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    .line 819
    .line 820
    .line 821
    goto :goto_c

    .line 822
    :cond_27
    move-object/from16 v6, v27

    .line 823
    .line 824
    :goto_c
    iget-boolean v1, v6, Lw3;->o:Z

    .line 825
    .line 826
    if-eqz v1, :cond_28

    .line 827
    .line 828
    const/4 v8, 0x0

    .line 829
    invoke-virtual {v6, v8}, Lw3;->I(F)V

    .line 830
    .line 831
    .line 832
    :cond_28
    iget-boolean v1, v0, Lqj0;->v:Z

    .line 833
    .line 834
    iget-boolean v6, v3, Lgv0;->n:Z

    .line 835
    .line 836
    iput-boolean v6, v0, Lqj0;->v:Z

    .line 837
    .line 838
    iget v3, v3, Lgv0;->g:F

    .line 839
    .line 840
    iput v3, v0, Lqj0;->z:F

    .line 841
    .line 842
    iget v3, v5, Lf50;->a:F

    .line 843
    .line 844
    iget v7, v2, Lf50;->a:F

    .line 845
    .line 846
    cmpg-float v3, v3, v7

    .line 847
    .line 848
    if-nez v3, :cond_29

    .line 849
    .line 850
    iget v3, v5, Lf50;->b:F

    .line 851
    .line 852
    iget v7, v2, Lf50;->b:F

    .line 853
    .line 854
    cmpg-float v3, v3, v7

    .line 855
    .line 856
    if-nez v3, :cond_29

    .line 857
    .line 858
    iget v3, v5, Lf50;->c:F

    .line 859
    .line 860
    iget v7, v2, Lf50;->c:F

    .line 861
    .line 862
    cmpg-float v3, v3, v7

    .line 863
    .line 864
    if-nez v3, :cond_29

    .line 865
    .line 866
    iget-wide v7, v5, Lf50;->d:J

    .line 867
    .line 868
    iget-wide v2, v2, Lf50;->d:J

    .line 869
    .line 870
    cmp-long v2, v7, v2

    .line 871
    .line 872
    if-nez v2, :cond_29

    .line 873
    .line 874
    const/4 v2, 0x1

    .line 875
    goto :goto_d

    .line 876
    :cond_29
    const/4 v2, 0x0

    .line 877
    :goto_d
    if-eqz p1, :cond_2b

    .line 878
    .line 879
    if-eqz v2, :cond_2a

    .line 880
    .line 881
    if-eq v1, v6, :cond_2b

    .line 882
    .line 883
    :cond_2a
    iget-object v1, v4, Lb60;->r:Ldn0;

    .line 884
    .line 885
    if-eqz v1, :cond_2b

    .line 886
    .line 887
    check-cast v1, Lw3;

    .line 888
    .line 889
    invoke-virtual {v1, v4}, Lw3;->v(Lb60;)V

    .line 890
    .line 891
    .line 892
    :cond_2b
    if-nez v2, :cond_36

    .line 893
    .line 894
    iget-object v1, v4, Lb60;->J:Lf60;

    .line 895
    .line 896
    iget v2, v1, Lf60;->l:I

    .line 897
    .line 898
    if-lez v2, :cond_2e

    .line 899
    .line 900
    iget-boolean v2, v1, Lf60;->k:Z

    .line 901
    .line 902
    if-nez v2, :cond_2c

    .line 903
    .line 904
    iget-boolean v2, v1, Lf60;->j:Z

    .line 905
    .line 906
    if-eqz v2, :cond_2d

    .line 907
    .line 908
    :cond_2c
    const/4 v8, 0x0

    .line 909
    invoke-virtual {v4, v8}, Lb60;->W(Z)V

    .line 910
    .line 911
    .line 912
    :cond_2d
    iget-object v1, v1, Lf60;->p:Lwd0;

    .line 913
    .line 914
    invoke-virtual {v1}, Lwd0;->e0()V

    .line 915
    .line 916
    .line 917
    :cond_2e
    invoke-virtual {v4}, Lb60;->N()V

    .line 918
    .line 919
    .line 920
    invoke-static {v4}, Le60;->a(Lb60;)Ldn0;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    check-cast v1, Lw3;

    .line 925
    .line 926
    invoke-virtual {v1}, Lw3;->getRectManager()Lut0;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    iget-object v3, v4, Lb60;->I:Lmj0;

    .line 931
    .line 932
    iget-object v3, v3, Lmj0;->d:Lqj0;

    .line 933
    .line 934
    if-ne v0, v3, :cond_2f

    .line 935
    .line 936
    const/4 v8, 0x0

    .line 937
    invoke-virtual {v2, v4, v8}, Lut0;->f(Lb60;Z)V

    .line 938
    .line 939
    .line 940
    goto :goto_f

    .line 941
    :cond_2f
    const/4 v8, 0x0

    .line 942
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v4}, Lb60;->I()Z

    .line 946
    .line 947
    .line 948
    move-result v0

    .line 949
    if-nez v0, :cond_30

    .line 950
    .line 951
    goto :goto_f

    .line 952
    :cond_30
    invoke-static {v4}, Lut0;->g(Lb60;)J

    .line 953
    .line 954
    .line 955
    move-result-wide v5

    .line 956
    const-wide v9, 0x7fffffff7fffffffL

    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    invoke-static {v5, v6, v9, v10}, Lw20;->a(JJ)Z

    .line 962
    .line 963
    .line 964
    move-result v0

    .line 965
    if-nez v0, :cond_32

    .line 966
    .line 967
    iput-wide v5, v4, Lb60;->i:J

    .line 968
    .line 969
    iput-boolean v8, v4, Lb60;->j:Z

    .line 970
    .line 971
    invoke-virtual {v4}, Lb60;->z()Lsh0;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    iget-object v3, v0, Lsh0;->d:[Ljava/lang/Object;

    .line 976
    .line 977
    iget v0, v0, Lsh0;->f:I

    .line 978
    .line 979
    move v9, v8

    .line 980
    :goto_e
    if-ge v9, v0, :cond_31

    .line 981
    .line 982
    aget-object v5, v3, v9

    .line 983
    .line 984
    check-cast v5, Lb60;

    .line 985
    .line 986
    invoke-virtual {v2, v5, v8}, Lut0;->f(Lb60;Z)V

    .line 987
    .line 988
    .line 989
    add-int/lit8 v9, v9, 0x1

    .line 990
    .line 991
    goto :goto_e

    .line 992
    :cond_31
    invoke-virtual {v2, v4}, Lut0;->e(Lb60;)V

    .line 993
    .line 994
    .line 995
    goto :goto_f

    .line 996
    :cond_32
    invoke-virtual {v2, v4}, Lut0;->d(Lb60;)V

    .line 997
    .line 998
    .line 999
    :goto_f
    iget v0, v4, Lb60;->Q:I

    .line 1000
    .line 1001
    if-lez v0, :cond_36

    .line 1002
    .line 1003
    iget-object v0, v1, Lw3;->V:Lud0;

    .line 1004
    .line 1005
    iget-object v0, v0, Lud0;->e:Ld;

    .line 1006
    .line 1007
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1008
    .line 1009
    .line 1010
    iget v2, v4, Lb60;->Q:I

    .line 1011
    .line 1012
    if-lez v2, :cond_33

    .line 1013
    .line 1014
    iget-object v0, v0, Ld;->e:Ljava/lang/Object;

    .line 1015
    .line 1016
    check-cast v0, Lsh0;

    .line 1017
    .line 1018
    invoke-virtual {v0, v4}, Lsh0;->b(Ljava/lang/Object;)V

    .line 1019
    .line 1020
    .line 1021
    const/4 v8, 0x1

    .line 1022
    iput-boolean v8, v4, Lb60;->P:Z

    .line 1023
    .line 1024
    :cond_33
    const/4 v9, 0x0

    .line 1025
    invoke-virtual {v1, v9}, Lw3;->C(Lb60;)V

    .line 1026
    .line 1027
    .line 1028
    return-void

    .line 1029
    :cond_34
    const-string v0, "updateLayerParameters requires a non-null layerBlock"

    .line 1030
    .line 1031
    invoke-static {v0}, Lt1;->g(Ljava/lang/String;)Lsg;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    throw v0

    .line 1036
    :cond_35
    if-nez v2, :cond_37

    .line 1037
    .line 1038
    :cond_36
    return-void

    .line 1039
    :cond_37
    const-string v0, "null layer with a non-null layerBlock"

    .line 1040
    .line 1041
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 1042
    .line 1043
    .line 1044
    return-void
.end method

.method public final e1(J)Z
    .locals 23

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
    iget-object v1, v0, Lqj0;->O:Lcn0;

    .line 30
    .line 31
    if-eqz v1, :cond_c

    .line 32
    .line 33
    iget-boolean v0, v0, Lqj0;->v:Z

    .line 34
    .line 35
    if-eqz v0, :cond_c

    .line 36
    .line 37
    check-cast v1, Lxx;

    .line 38
    .line 39
    const/16 v0, 0x20

    .line 40
    .line 41
    shr-long v4, p1, v0

    .line 42
    .line 43
    long-to-int v4, v4

    .line 44
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const-wide v6, 0xffffffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long v8, p1, v6

    .line 54
    .line 55
    long-to-int v4, v8

    .line 56
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iget-object v1, v1, Lxx;->d:Lvx;

    .line 61
    .line 62
    iget-boolean v8, v1, Lvx;->w:Z

    .line 63
    .line 64
    if-eqz v8, :cond_b

    .line 65
    .line 66
    invoke-virtual {v1}, Lvx;->d()Lv50;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    instance-of v8, v1, Lxm0;

    .line 71
    .line 72
    if-eqz v8, :cond_1

    .line 73
    .line 74
    check-cast v1, Lxm0;

    .line 75
    .line 76
    iget-object v0, v1, Lxm0;->a:Lst0;

    .line 77
    .line 78
    iget v1, v0, Lst0;->a:F

    .line 79
    .line 80
    cmpg-float v1, v1, v5

    .line 81
    .line 82
    if-gtz v1, :cond_0

    .line 83
    .line 84
    iget v1, v0, Lst0;->c:F

    .line 85
    .line 86
    cmpg-float v1, v5, v1

    .line 87
    .line 88
    if-gez v1, :cond_0

    .line 89
    .line 90
    iget v1, v0, Lst0;->b:F

    .line 91
    .line 92
    cmpg-float v1, v1, v4

    .line 93
    .line 94
    if-gtz v1, :cond_0

    .line 95
    .line 96
    iget v0, v0, Lst0;->d:F

    .line 97
    .line 98
    cmpg-float v0, v4, v0

    .line 99
    .line 100
    if-gez v0, :cond_0

    .line 101
    .line 102
    goto/16 :goto_2

    .line 103
    .line 104
    :cond_0
    const/16 v16, 0x0

    .line 105
    .line 106
    const/16 v17, 0x1

    .line 107
    .line 108
    goto/16 :goto_1

    .line 109
    .line 110
    :cond_1
    instance-of v8, v1, Lym0;

    .line 111
    .line 112
    if-eqz v8, :cond_9

    .line 113
    .line 114
    check-cast v1, Lym0;

    .line 115
    .line 116
    iget-object v1, v1, Lym0;->a:Lbw0;

    .line 117
    .line 118
    iget v8, v1, Lbw0;->c:F

    .line 119
    .line 120
    iget v9, v1, Lbw0;->b:F

    .line 121
    .line 122
    iget v10, v1, Lbw0;->d:F

    .line 123
    .line 124
    iget v11, v1, Lbw0;->a:F

    .line 125
    .line 126
    iget-wide v12, v1, Lbw0;->f:J

    .line 127
    .line 128
    iget-wide v14, v1, Lbw0;->h:J

    .line 129
    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    const/16 v17, 0x1

    .line 133
    .line 134
    iget-wide v2, v1, Lbw0;->g:J

    .line 135
    .line 136
    move-wide/from16 v18, v6

    .line 137
    .line 138
    iget-wide v6, v1, Lbw0;->e:J

    .line 139
    .line 140
    cmpg-float v20, v5, v11

    .line 141
    .line 142
    if-ltz v20, :cond_8

    .line 143
    .line 144
    cmpl-float v20, v5, v8

    .line 145
    .line 146
    if-gez v20, :cond_8

    .line 147
    .line 148
    cmpg-float v20, v4, v9

    .line 149
    .line 150
    if-ltz v20, :cond_8

    .line 151
    .line 152
    cmpl-float v20, v4, v10

    .line 153
    .line 154
    if-ltz v20, :cond_2

    .line 155
    .line 156
    goto/16 :goto_1

    .line 157
    .line 158
    :cond_2
    move/from16 p0, v0

    .line 159
    .line 160
    move-object/from16 v20, v1

    .line 161
    .line 162
    shr-long v0, v6, p0

    .line 163
    .line 164
    long-to-int v0, v0

    .line 165
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    move/from16 p1, v0

    .line 170
    .line 171
    move/from16 p2, v1

    .line 172
    .line 173
    shr-long v0, v12, p0

    .line 174
    .line 175
    long-to-int v0, v0

    .line 176
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    add-float v1, v1, p2

    .line 181
    .line 182
    sub-float v21, v8, v11

    .line 183
    .line 184
    cmpg-float v1, v1, v21

    .line 185
    .line 186
    if-gtz v1, :cond_7

    .line 187
    .line 188
    move/from16 v21, v0

    .line 189
    .line 190
    shr-long v0, v14, p0

    .line 191
    .line 192
    long-to-int v0, v0

    .line 193
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    move/from16 p2, v0

    .line 198
    .line 199
    move/from16 v22, v1

    .line 200
    .line 201
    shr-long v0, v2, p0

    .line 202
    .line 203
    long-to-int v0, v0

    .line 204
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    add-float v1, v1, v22

    .line 209
    .line 210
    sub-float v22, v8, v11

    .line 211
    .line 212
    cmpg-float v1, v1, v22

    .line 213
    .line 214
    if-gtz v1, :cond_7

    .line 215
    .line 216
    and-long v6, v6, v18

    .line 217
    .line 218
    long-to-int v1, v6

    .line 219
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    and-long v14, v14, v18

    .line 224
    .line 225
    long-to-int v7, v14

    .line 226
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 227
    .line 228
    .line 229
    move-result v14

    .line 230
    add-float/2addr v14, v6

    .line 231
    sub-float v6, v10, v9

    .line 232
    .line 233
    cmpg-float v6, v14, v6

    .line 234
    .line 235
    if-gtz v6, :cond_7

    .line 236
    .line 237
    and-long v12, v12, v18

    .line 238
    .line 239
    long-to-int v6, v12

    .line 240
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 241
    .line 242
    .line 243
    move-result v12

    .line 244
    and-long v2, v2, v18

    .line 245
    .line 246
    long-to-int v2, v2

    .line 247
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    add-float/2addr v3, v12

    .line 252
    sub-float v12, v10, v9

    .line 253
    .line 254
    cmpg-float v3, v3, v12

    .line 255
    .line 256
    if-gtz v3, :cond_7

    .line 257
    .line 258
    invoke-static/range {p1 .. p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    add-float/2addr v3, v11

    .line 263
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    add-float/2addr v1, v9

    .line 268
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 269
    .line 270
    .line 271
    move-result v12

    .line 272
    sub-float v12, v8, v12

    .line 273
    .line 274
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    add-float/2addr v6, v9

    .line 279
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    sub-float/2addr v8, v0

    .line 284
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    sub-float v0, v10, v0

    .line 289
    .line 290
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    sub-float/2addr v10, v2

    .line 295
    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    add-float v7, v2, v11

    .line 300
    .line 301
    cmpg-float v2, v5, v3

    .line 302
    .line 303
    if-gez v2, :cond_3

    .line 304
    .line 305
    cmpg-float v2, v4, v1

    .line 306
    .line 307
    if-gez v2, :cond_3

    .line 308
    .line 309
    move-object/from16 v2, v20

    .line 310
    .line 311
    iget-wide v9, v2, Lbw0;->e:J

    .line 312
    .line 313
    move v8, v1

    .line 314
    move v7, v3

    .line 315
    move v6, v4

    .line 316
    invoke-static/range {v5 .. v10}, Lg60;->q(FFFFJ)Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    goto/16 :goto_3

    .line 321
    .line 322
    :cond_3
    move v1, v7

    .line 323
    move v7, v8

    .line 324
    move-object/from16 v2, v20

    .line 325
    .line 326
    move v8, v6

    .line 327
    move v6, v4

    .line 328
    cmpg-float v3, v5, v1

    .line 329
    .line 330
    if-gez v3, :cond_4

    .line 331
    .line 332
    cmpl-float v3, v6, v10

    .line 333
    .line 334
    if-lez v3, :cond_4

    .line 335
    .line 336
    move v8, v10

    .line 337
    iget-wide v9, v2, Lbw0;->h:J

    .line 338
    .line 339
    move v7, v1

    .line 340
    invoke-static/range {v5 .. v10}, Lg60;->q(FFFFJ)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    goto :goto_3

    .line 345
    :cond_4
    move v3, v8

    .line 346
    cmpl-float v1, v5, v12

    .line 347
    .line 348
    if-lez v1, :cond_5

    .line 349
    .line 350
    cmpg-float v1, v6, v3

    .line 351
    .line 352
    if-gez v1, :cond_5

    .line 353
    .line 354
    iget-wide v9, v2, Lbw0;->f:J

    .line 355
    .line 356
    move v8, v3

    .line 357
    move v7, v12

    .line 358
    invoke-static/range {v5 .. v10}, Lg60;->q(FFFFJ)Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    goto :goto_3

    .line 363
    :cond_5
    cmpl-float v1, v5, v7

    .line 364
    .line 365
    if-lez v1, :cond_6

    .line 366
    .line 367
    cmpl-float v1, v6, v0

    .line 368
    .line 369
    if-lez v1, :cond_6

    .line 370
    .line 371
    iget-wide v9, v2, Lbw0;->g:J

    .line 372
    .line 373
    move v8, v0

    .line 374
    invoke-static/range {v5 .. v10}, Lg60;->q(FFFFJ)Z

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    goto :goto_3

    .line 379
    :cond_6
    :goto_0
    move/from16 v0, v17

    .line 380
    .line 381
    goto :goto_3

    .line 382
    :cond_7
    move v6, v4

    .line 383
    move-object/from16 v2, v20

    .line 384
    .line 385
    invoke-static {}, Lf6;->a()Ld6;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v0, v2}, Ld6;->b(Ld6;Lbw0;)V

    .line 390
    .line 391
    .line 392
    invoke-static {v5, v6, v0}, Lg60;->o(FFLd6;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    goto :goto_3

    .line 397
    :cond_8
    :goto_1
    move/from16 v0, v16

    .line 398
    .line 399
    goto :goto_3

    .line 400
    :cond_9
    move v6, v4

    .line 401
    const/16 v16, 0x0

    .line 402
    .line 403
    const/16 v17, 0x1

    .line 404
    .line 405
    instance-of v0, v1, Lwm0;

    .line 406
    .line 407
    if-eqz v0, :cond_a

    .line 408
    .line 409
    check-cast v1, Lwm0;

    .line 410
    .line 411
    iget-object v0, v1, Lwm0;->a:Ld6;

    .line 412
    .line 413
    invoke-static {v5, v6, v0}, Lg60;->o(FFLd6;)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    goto :goto_3

    .line 418
    :cond_a
    invoke-static {}, Lxc;->j()V

    .line 419
    .line 420
    .line 421
    return v16

    .line 422
    :cond_b
    :goto_2
    const/16 v16, 0x0

    .line 423
    .line 424
    const/16 v17, 0x1

    .line 425
    .line 426
    goto :goto_0

    .line 427
    :goto_3
    if-eqz v0, :cond_e

    .line 428
    .line 429
    goto :goto_4

    .line 430
    :cond_c
    const/16 v17, 0x1

    .line 431
    .line 432
    :goto_4
    return v17

    .line 433
    :cond_d
    const/16 v16, 0x0

    .line 434
    .line 435
    :cond_e
    return v16
.end method

.method public final getLayoutDirection()Lk50;
    .locals 0

    .line 1
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 2
    .line 3
    iget-object p0, p0, Lb60;->C:Lk50;

    .line 4
    .line 5
    return-object p0
.end method

.method public final h()F
    .locals 0

    .line 1
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 2
    .line 3
    iget-object p0, p0, Lb60;->B:Lym;

    .line 4
    .line 5
    invoke-interface {p0}, Lym;->h()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final i(J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lqj0;->P0(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 6
    .line 7
    invoke-static {p0}, Le60;->a(Lb60;)Ldn0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lw3;

    .line 12
    .line 13
    invoke-virtual {p0}, Lw3;->z()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lw3;->b0:[F

    .line 17
    .line 18
    invoke-static {p0, p1, p2}, Lr60;->s([FJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    return-wide p0
.end method

.method public final j()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lqj0;->r:Lb60;

    .line 2
    .line 3
    iget-object v1, v0, Lb60;->I:Lmj0;

    .line 4
    .line 5
    const/16 v2, 0x40

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lmj0;->d(I)Z

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
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 15
    .line 16
    .line 17
    iget-object p0, v0, Lb60;->I:Lmj0;

    .line 18
    .line 19
    iget-object p0, p0, Lmj0;->e:Ld61;

    .line 20
    .line 21
    move-object v0, v3

    .line 22
    :goto_0
    if-eqz p0, :cond_8

    .line 23
    .line 24
    iget v1, p0, Loe0;->f:I

    .line 25
    .line 26
    and-int/2addr v1, v2

    .line 27
    if-eqz v1, :cond_7

    .line 28
    .line 29
    move-object v1, p0

    .line 30
    move-object v4, v3

    .line 31
    :goto_1
    if-eqz v1, :cond_7

    .line 32
    .line 33
    instance-of v5, v1, Lhp0;

    .line 34
    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    check-cast v1, Lhp0;

    .line 38
    .line 39
    invoke-interface {v1, v0}, Lhp0;->c0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    goto :goto_4

    .line 44
    :cond_0
    iget v5, v1, Loe0;->f:I

    .line 45
    .line 46
    and-int/2addr v5, v2

    .line 47
    if-eqz v5, :cond_6

    .line 48
    .line 49
    instance-of v5, v1, Lsm;

    .line 50
    .line 51
    if-eqz v5, :cond_6

    .line 52
    .line 53
    move-object v5, v1

    .line 54
    check-cast v5, Lsm;

    .line 55
    .line 56
    iget-object v5, v5, Lsm;->s:Loe0;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    :goto_2
    const/4 v7, 0x1

    .line 60
    if-eqz v5, :cond_5

    .line 61
    .line 62
    iget v8, v5, Loe0;->f:I

    .line 63
    .line 64
    and-int/2addr v8, v2

    .line 65
    if-eqz v8, :cond_4

    .line 66
    .line 67
    add-int/lit8 v6, v6, 0x1

    .line 68
    .line 69
    if-ne v6, v7, :cond_1

    .line 70
    .line 71
    move-object v1, v5

    .line 72
    goto :goto_3

    .line 73
    :cond_1
    if-nez v4, :cond_2

    .line 74
    .line 75
    new-instance v4, Lsh0;

    .line 76
    .line 77
    const/16 v7, 0x10

    .line 78
    .line 79
    new-array v7, v7, [Loe0;

    .line 80
    .line 81
    invoke-direct {v4, v7}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    if-eqz v1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v4, v1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object v1, v3

    .line 90
    :cond_3
    invoke-virtual {v4, v5}, Lsh0;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_3
    iget-object v5, v5, Loe0;->i:Loe0;

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    if-ne v6, v7, :cond_6

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    :goto_4
    invoke-static {v4}, Lpf1;->f(Lsh0;)Loe0;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    goto :goto_1

    .line 104
    :cond_7
    iget-object p0, p0, Loe0;->h:Loe0;

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_8
    return-object v0

    .line 108
    :cond_9
    return-object v3
.end method

.method public final k()Li50;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Loe0;->q:Z

    .line 6
    .line 7
    iget-object v1, p0, Lqj0;->r:Lb60;

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
    invoke-virtual {v2}, Lb60;->H()Z

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
    iget-object v3, v2, Lb60;->N:Lpe0;

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
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Lb60;->v()Lb60;

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
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-virtual {p0}, Lqj0;->Q0()V

    .line 76
    .line 77
    .line 78
    iget-object p0, v1, Lb60;->I:Lmj0;

    .line 79
    .line 80
    iget-object p0, p0, Lmj0;->d:Lqj0;

    .line 81
    .line 82
    iget-object p0, p0, Lqj0;->t:Lqj0;

    .line 83
    .line 84
    return-object p0
.end method

.method public final k0()Lyb0;
    .locals 0

    .line 1
    iget-object p0, p0, Lqj0;->s:Lqj0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l0()Li50;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final m0()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lqj0;->A:Lyd0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final n0()Lb60;
    .locals 0

    .line 1
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o0()Lyd0;
    .locals 0

    .line 1
    iget-object p0, p0, Lqj0;->A:Lyd0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Asking for measurement result of unmeasured layout modifier"

    .line 7
    .line 8
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final p0()Lyb0;
    .locals 0

    .line 1
    iget-object p0, p0, Lqj0;->t:Lqj0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lqj0;->O:Lcn0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lqj0;->u:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lqj0;->r:Lb60;

    .line 10
    .line 11
    invoke-virtual {p0}, Lb60;->H()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final q0()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lqj0;->C:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final u0()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lqj0;->C:J

    .line 2
    .line 3
    iget v2, p0, Lqj0;->D:F

    .line 4
    .line 5
    iget-object v3, p0, Lqj0;->w:Lsw;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, v2, v3}, Lxq0;->X(JFLsw;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final v0(Lqj0;Lih0;Z)V
    .locals 5

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lqj0;->t:Lqj0;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lqj0;->v0(Lqj0;Lih0;Z)V

    .line 9
    .line 10
    .line 11
    :cond_1
    iget-wide v0, p0, Lqj0;->C:J

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
    iget v3, p2, Lih0;->a:F

    .line 19
    .line 20
    int-to-float v2, v2

    .line 21
    sub-float/2addr v3, v2

    .line 22
    iput v3, p2, Lih0;->a:F

    .line 23
    .line 24
    iget v3, p2, Lih0;->c:F

    .line 25
    .line 26
    sub-float/2addr v3, v2

    .line 27
    iput v3, p2, Lih0;->c:F

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
    iget v1, p2, Lih0;->b:F

    .line 37
    .line 38
    int-to-float v0, v0

    .line 39
    sub-float/2addr v1, v0

    .line 40
    iput v1, p2, Lih0;->b:F

    .line 41
    .line 42
    iget v1, p2, Lih0;->d:F

    .line 43
    .line 44
    sub-float/2addr v1, v0

    .line 45
    iput v1, p2, Lih0;->d:F

    .line 46
    .line 47
    iget-object v0, p0, Lqj0;->O:Lcn0;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    check-cast v0, Lxx;

    .line 52
    .line 53
    invoke-virtual {v0}, Lxx;->a()[F

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-boolean v0, v0, Lxx;->v:Z

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
    iput v4, p2, Lih0;->a:F

    .line 65
    .line 66
    iput v4, p2, Lih0;->b:F

    .line 67
    .line 68
    iput v4, p2, Lih0;->c:F

    .line 69
    .line 70
    iput v4, p2, Lih0;->d:F

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-static {v1, p2}, Lr60;->t([FLih0;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lqj0;->v:Z

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    if-eqz p3, :cond_4

    .line 81
    .line 82
    iget-wide v0, p0, Lxq0;->f:J

    .line 83
    .line 84
    shr-long p0, v0, p1

    .line 85
    .line 86
    long-to-int p0, p0

    .line 87
    int-to-float p0, p0

    .line 88
    and-long/2addr v0, v2

    .line 89
    long-to-int p1, v0

    .line 90
    int-to-float p1, p1

    .line 91
    invoke-virtual {p2, v4, v4, p0, p1}, Lih0;->a(FFFF)V

    .line 92
    .line 93
    .line 94
    :cond_4
    :goto_1
    return-void
.end method

.method public final w0(Lqj0;J)J
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-wide p2

    .line 4
    :cond_0
    iget-object v0, p0, Lqj0;->t:Lqj0;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1, v0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-virtual {v0, p1, p2, p3}, Lqj0;->w0(Lqj0;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-virtual {p0, p1, p2}, Lqj0;->D0(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3}, Lqj0;->D0(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
.end method

.method public final x(Li50;J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lqj0;->A(Li50;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public final x0(J)J
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
    invoke-virtual {p0}, Lxq0;->U()I

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
    invoke-virtual {p0}, Lxq0;->S()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    int-to-float p0, p0

    .line 32
    sub-float/2addr p1, p0

    .line 33
    const/high16 p0, 0x40000000    # 2.0f

    .line 34
    .line 35
    div-float/2addr v1, p0

    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-static {p2, v1}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    div-float/2addr p1, p0

    .line 42
    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    int-to-long p1, p1

    .line 51
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    int-to-long v4, p0

    .line 56
    shl-long p0, p1, v0

    .line 57
    .line 58
    and-long v0, v4, v2

    .line 59
    .line 60
    or-long/2addr p0, v0

    .line 61
    return-wide p0
.end method

.method public final y0(JJ)F
    .locals 8

    .line 1
    invoke-virtual {p0}, Lxq0;->U()I

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
    invoke-virtual {p0}, Lxq0;->S()I

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
    invoke-virtual {p0, p3, p4}, Lqj0;->x0(J)J

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
    invoke-virtual {p0}, Lxq0;->U()I

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
    neg-float p0, p1

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {p0}, Lxq0;->S()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    int-to-float p0, p0

    .line 101
    sub-float p0, p1, p0

    .line 102
    .line 103
    :goto_1
    invoke-static {v5, p0}, Ljava/lang/Math;->max(FF)F

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    int-to-long p1, p1

    .line 112
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    int-to-long v6, p0

    .line 117
    shl-long p0, p1, v1

    .line 118
    .line 119
    and-long/2addr v6, v3

    .line 120
    or-long/2addr p0, v6

    .line 121
    cmpl-float p2, v0, v5

    .line 122
    .line 123
    if-gtz p2, :cond_3

    .line 124
    .line 125
    cmpl-float p2, p3, v5

    .line 126
    .line 127
    if-lez p2, :cond_4

    .line 128
    .line 129
    :cond_3
    shr-long v5, p0, v1

    .line 130
    .line 131
    long-to-int p2, v5

    .line 132
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result p4

    .line 136
    cmpg-float p4, p4, v0

    .line 137
    .line 138
    if-gtz p4, :cond_4

    .line 139
    .line 140
    and-long/2addr p0, v3

    .line 141
    long-to-int p0, p0

    .line 142
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    cmpg-float p1, p1, p3

    .line 147
    .line 148
    if-gtz p1, :cond_4

    .line 149
    .line 150
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    mul-float/2addr p1, p1

    .line 159
    mul-float/2addr p0, p0

    .line 160
    add-float/2addr p0, p1

    .line 161
    return p0

    .line 162
    :cond_4
    return v2
.end method

.method public final z()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lqj0;->G0()Loe0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-boolean p0, p0, Loe0;->q:Z

    .line 6
    .line 7
    return p0
.end method

.method public final z0(Lbd;Lvx;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lqj0;->O:Lcn0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast v0, Lxx;

    .line 6
    .line 7
    iget-object p0, v0, Lxx;->p:Ldd;

    .line 8
    .line 9
    invoke-virtual {v0}, Lxx;->g()V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lxx;->d:Lvx;

    .line 13
    .line 14
    iget-object v1, v1, Lvx;->a:Lzx;

    .line 15
    .line 16
    iget v1, v1, Lzx;->l:F

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    cmpl-float v1, v1, v2

    .line 20
    .line 21
    if-lez v1, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    :goto_0
    iput-boolean v1, v0, Lxx;->w:Z

    .line 27
    .line 28
    iget-object v1, p0, Ldd;->e:Lo8;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Lo8;->n(Lbd;)V

    .line 31
    .line 32
    .line 33
    iput-object p2, v1, Lo8;->b:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object p1, v0, Lxx;->d:Lvx;

    .line 36
    .line 37
    invoke-static {p0, p1}, Ls91;->w(Luq;Lvx;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget-wide v0, p0, Lqj0;->C:J

    .line 42
    .line 43
    const/16 v2, 0x20

    .line 44
    .line 45
    shr-long v2, v0, v2

    .line 46
    .line 47
    long-to-int v2, v2

    .line 48
    int-to-float v2, v2

    .line 49
    const-wide v3, 0xffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr v0, v3

    .line 55
    long-to-int v0, v0

    .line 56
    int-to-float v0, v0

    .line 57
    invoke-interface {p1, v2, v0}, Lbd;->e(FF)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1, p2}, Lqj0;->A0(Lbd;Lvx;)V

    .line 61
    .line 62
    .line 63
    neg-float p0, v2

    .line 64
    neg-float p2, v0

    .line 65
    invoke-interface {p1, p0, p2}, Lbd;->e(FF)V

    .line 66
    .line 67
    .line 68
    return-void
.end method
