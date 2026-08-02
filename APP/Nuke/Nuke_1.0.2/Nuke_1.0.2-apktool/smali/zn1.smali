.class public abstract Lzn1;
.super Lkd1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lif1;
.implements Lc61;
.implements Law1;


# static fields
.field public static final T:Lca2;

.field public static final U:Lz51;

.field public static final V:[F

.field public static final W:Lwn1;

.field public static final X:Lj51;


# instance fields
.field public A:Lin0;

.field public B:Le70;

.field public C:Ld61;

.field public D:F

.field public E:Lof1;

.field public F:Lgk1;

.field public G:J

.field public H:F

.field public I:Lqk1;

.field public J:Lz51;

.field public K:Leq2;

.field public L:Z

.field public M:Z

.field public N:Lpq0;

.field public O:Lqp;

.field public P:Lv7;

.field public final Q:Lyn1;

.field public R:Z

.field public S:Lyv1;

.field public final v:Lr61;

.field public w:Lzn1;

.field public x:Lzn1;

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lca2;

    .line 2
    .line 3
    invoke-direct {v0}, Lca2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lzn1;->T:Lca2;

    .line 7
    .line 8
    new-instance v0, Lz51;

    .line 9
    .line 10
    invoke-direct {v0}, Lz51;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lzn1;->U:Lz51;

    .line 14
    .line 15
    invoke-static {}, Lhf1;->a()[F

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lzn1;->V:[F

    .line 20
    .line 21
    new-instance v0, Lwn1;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lzn1;->W:Lwn1;

    .line 27
    .line 28
    new-instance v0, Lj51;

    .line 29
    .line 30
    const/4 v1, 0x7

    .line 31
    invoke-direct {v0, v1}, Lj51;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lzn1;->X:Lj51;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(Lr61;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lkd1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzn1;->v:Lr61;

    .line 5
    .line 6
    iget-object v0, p1, Lr61;->F:Le70;

    .line 7
    .line 8
    iput-object v0, p0, Lzn1;->B:Le70;

    .line 9
    .line 10
    iget-object p1, p1, Lr61;->G:Ld61;

    .line 11
    .line 12
    iput-object p1, p0, Lzn1;->C:Ld61;

    .line 13
    .line 14
    const p1, 0x3f4ccccd    # 0.8f

    .line 15
    .line 16
    .line 17
    iput p1, p0, Lzn1;->D:F

    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    iput-wide v0, p0, Lzn1;->G:J

    .line 22
    .line 23
    sget-object p1, Lsp0;->h:Liu0;

    .line 24
    .line 25
    iput-object p1, p0, Lzn1;->K:Leq2;

    .line 26
    .line 27
    new-instance p1, Lyn1;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-direct {p1, p0, v0}, Lyn1;-><init>(Lzn1;I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lzn1;->Q:Lyn1;

    .line 34
    .line 35
    return-void
.end method

.method public static n1(Lc61;)Lzn1;
    .locals 1

    .line 1
    instance-of v0, p0, Lnd1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lnd1;

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
    iget-object v0, v0, Lnd1;->h:Lmd1;

    .line 13
    .line 14
    iget-object v0, v0, Lmd1;->v:Lzn1;

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
    check-cast p0, Lzn1;

    .line 24
    .line 25
    return-object p0
.end method


# virtual methods
.method public final A0()Lof1;
    .locals 0

    .line 1
    iget-object p0, p0, Lzn1;->E:Lof1;

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
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final B()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lzn1;->S:Lyv1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lzn1;->y:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lzn1;->v:Lr61;

    .line 10
    .line 11
    invoke-virtual {p0}, Lr61;->H()Z

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

.method public final B0()Lkd1;
    .locals 0

    .line 1
    iget-object p0, p0, Lzn1;->x:Lzn1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final C([F)V
    .locals 6

    .line 1
    iget-object v0, p0, Lzn1;->v:Lr61;

    .line 2
    .line 3
    invoke-static {v0}, Lu61;->a(Lr61;)Lzv1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, Ls11;->J(Lc61;)Lc61;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lzn1;->n1(Lc61;)Lzn1;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v1, p1}, Lzn1;->q1(Lzn1;[F)V

    .line 16
    .line 17
    .line 18
    instance-of p0, v0, Lb7;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    check-cast v0, Lb7;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lb7;->t([F)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    invoke-virtual {v1, v2, v3}, Lzn1;->c(J)J

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
    cmp-long p0, v2, v4

    .line 46
    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    const/16 p0, 0x20

    .line 50
    .line 51
    shr-long v2, v0, p0

    .line 52
    .line 53
    long-to-int p0, v2

    .line 54
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    const-wide v2, 0xffffffffL

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    and-long/2addr v0, v2

    .line 64
    long-to-int v0, v0

    .line 65
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {p1, p0, v0}, Lhf1;->f([FFF)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
.end method

.method public final C0()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lzn1;->G:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final D(Lc61;J)J
    .locals 3

    .line 1
    instance-of v0, p1, Lnd1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lnd1;

    .line 6
    .line 7
    iget-object v0, p1, Lnd1;->h:Lmd1;

    .line 8
    .line 9
    iget-object v0, v0, Lmd1;->v:Lzn1;

    .line 10
    .line 11
    invoke-virtual {v0}, Lzn1;->b1()V

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
    invoke-virtual {p1, p0, p2, p3}, Lnd1;->D(Lc61;J)J

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
    invoke-static {p1}, Lzn1;->n1(Lc61;)Lzn1;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lzn1;->b1()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lzn1;->O0(Lzn1;)Lzn1;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    if-eq p1, v0, :cond_3

    .line 38
    .line 39
    iget-object v1, p1, Lzn1;->S:Lyv1;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    check-cast v1, Lsq0;

    .line 44
    .line 45
    invoke-virtual {v1}, Lsq0;->b()[F

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-boolean v1, v1, Lsq0;->z:Z

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {p2, p3, v2}, Lhf1;->b(J[F)J

    .line 55
    .line 56
    .line 57
    move-result-wide p2

    .line 58
    :cond_2
    :goto_1
    iget-wide v1, p1, Lzn1;->G:J

    .line 59
    .line 60
    invoke-static {p2, p3, v1, v2}, Ltp0;->D(JJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide p2

    .line 64
    iget-object p1, p1, Lzn1;->x:Lzn1;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    invoke-virtual {p0, v0, p2, p3}, Lzn1;->I0(Lzn1;J)J

    .line 71
    .line 72
    .line 73
    move-result-wide p0

    .line 74
    return-wide p0
.end method

.method public final G0()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lzn1;->G:J

    .line 2
    .line 3
    iget v2, p0, Lzn1;->H:F

    .line 4
    .line 5
    iget-object v3, p0, Lzn1;->A:Lin0;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, v2, v3}, Lsz1;->f0(JFLin0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final H(Lc61;[F)V
    .locals 1

    .line 1
    invoke-static {p1}, Lzn1;->n1(Lc61;)Lzn1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lzn1;->b1()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lzn1;->O0(Lzn1;)Lzn1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p2}, Lhf1;->d([F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0, p2}, Lzn1;->q1(Lzn1;[F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0, p2}, Lzn1;->p1(Lzn1;[F)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final H0(Lzn1;Lqk1;Z)V
    .locals 5

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lzn1;->x:Lzn1;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lzn1;->H0(Lzn1;Lqk1;Z)V

    .line 9
    .line 10
    .line 11
    :cond_1
    iget-wide v0, p0, Lzn1;->G:J

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
    iget v3, p2, Lqk1;->a:F

    .line 19
    .line 20
    int-to-float v2, v2

    .line 21
    sub-float/2addr v3, v2

    .line 22
    iput v3, p2, Lqk1;->a:F

    .line 23
    .line 24
    iget v3, p2, Lqk1;->c:F

    .line 25
    .line 26
    sub-float/2addr v3, v2

    .line 27
    iput v3, p2, Lqk1;->c:F

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
    iget v1, p2, Lqk1;->b:F

    .line 37
    .line 38
    int-to-float v0, v0

    .line 39
    sub-float/2addr v1, v0

    .line 40
    iput v1, p2, Lqk1;->b:F

    .line 41
    .line 42
    iget v1, p2, Lqk1;->d:F

    .line 43
    .line 44
    sub-float/2addr v1, v0

    .line 45
    iput v1, p2, Lqk1;->d:F

    .line 46
    .line 47
    iget-object v0, p0, Lzn1;->S:Lyv1;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    check-cast v0, Lsq0;

    .line 52
    .line 53
    invoke-virtual {v0}, Lsq0;->a()[F

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-boolean v0, v0, Lsq0;->z:Z

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
    iput v4, p2, Lqk1;->a:F

    .line 65
    .line 66
    iput v4, p2, Lqk1;->b:F

    .line 67
    .line 68
    iput v4, p2, Lqk1;->c:F

    .line 69
    .line 70
    iput v4, p2, Lqk1;->d:F

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-static {v1, p2}, Lhf1;->c([FLqk1;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lzn1;->z:Z

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    if-eqz p3, :cond_4

    .line 81
    .line 82
    iget-wide v0, p0, Lsz1;->j:J

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
    invoke-virtual {p2, v4, v4, p0, p1}, Lqk1;->a(FFFF)V

    .line 92
    .line 93
    .line 94
    :cond_4
    :goto_1
    return-void
.end method

.method public final I0(Lzn1;J)J
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-wide p2

    .line 4
    :cond_0
    iget-object v0, p0, Lzn1;->x:Lzn1;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-virtual {v0, p1, p2, p3}, Lzn1;->I0(Lzn1;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-virtual {p0, p1, p2}, Lzn1;->P0(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3}, Lzn1;->P0(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
.end method

.method public final J(Lc61;Z)Lo62;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lth1;->u:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-interface {p1}, Lc61;->w()Z

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
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-static {p1}, Lzn1;->n1(Lc61;)Lzn1;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lzn1;->b1()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lzn1;->O0(Lzn1;)Lzn1;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v2, p0, Lzn1;->I:Lqk1;

    .line 54
    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    new-instance v2, Lqk1;

    .line 58
    .line 59
    invoke-direct {v2}, Lqk1;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v2, p0, Lzn1;->I:Lqk1;

    .line 63
    .line 64
    :cond_2
    const/4 v3, 0x0

    .line 65
    iput v3, v2, Lqk1;->a:F

    .line 66
    .line 67
    iput v3, v2, Lqk1;->b:F

    .line 68
    .line 69
    invoke-interface {p1}, Lc61;->L()J

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
    iput v3, v2, Lqk1;->c:F

    .line 79
    .line 80
    invoke-interface {p1}, Lc61;->L()J

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
    iput p1, v2, Lqk1;->d:F

    .line 93
    .line 94
    :goto_0
    if-eq v0, v1, :cond_4

    .line 95
    .line 96
    const/4 p1, 0x0

    .line 97
    invoke-virtual {v0, v2, p2, p1}, Lzn1;->j1(Lqk1;ZZ)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Lqk1;->b()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    sget-object p0, Lo62;->e:Lo62;

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_3
    iget-object v0, v0, Lzn1;->x:Lzn1;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    invoke-virtual {p0, v1, v2, p2}, Lzn1;->H0(Lzn1;Lqk1;Z)V

    .line 116
    .line 117
    .line 118
    new-instance p0, Lo62;

    .line 119
    .line 120
    iget p1, v2, Lqk1;->a:F

    .line 121
    .line 122
    iget p2, v2, Lqk1;->b:F

    .line 123
    .line 124
    iget v0, v2, Lqk1;->c:F

    .line 125
    .line 126
    iget v1, v2, Lqk1;->d:F

    .line 127
    .line 128
    invoke-direct {p0, p1, p2, v0, v1}, Lo62;-><init>(FFFF)V

    .line 129
    .line 130
    .line 131
    return-object p0
.end method

.method public final J0(J)J
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
    invoke-virtual {p0}, Lsz1;->b0()I

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
    invoke-virtual {p0}, Lsz1;->Z()I

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

.method public final K0(JJ)F
    .locals 8

    .line 1
    invoke-virtual {p0}, Lsz1;->b0()I

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
    invoke-virtual {p0}, Lsz1;->Z()I

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
    invoke-virtual {p0, p3, p4}, Lzn1;->J0(J)J

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
    invoke-virtual {p0}, Lsz1;->b0()I

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
    invoke-virtual {p0}, Lsz1;->Z()I

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

.method public final L()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lsz1;->j:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final L0(Lqp;Lpq0;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lzn1;->S:Lyv1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast v0, Lsq0;

    .line 6
    .line 7
    iget-object p0, v0, Lsq0;->t:Lsp;

    .line 8
    .line 9
    invoke-virtual {v0}, Lsq0;->g()V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lsq0;->h:Lpq0;

    .line 13
    .line 14
    iget-object v1, v1, Lpq0;->a:Lrq0;

    .line 15
    .line 16
    invoke-interface {v1}, Lrq0;->F()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    cmpl-float v1, v1, v2

    .line 22
    .line 23
    if-lez v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    :goto_0
    iput-boolean v1, v0, Lsq0;->A:Z

    .line 29
    .line 30
    iget-object v1, p0, Lsp;->i:Lb5;

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lb5;->B(Lqp;)V

    .line 33
    .line 34
    .line 35
    iput-object p2, v1, Lb5;->j:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object p1, v0, Lsq0;->h:Lpq0;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lxe1;->m(Lnc0;Lpq0;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iget-wide v0, p0, Lzn1;->G:J

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
    invoke-interface {p1, v2, v0}, Lqp;->g(FF)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1, p2}, Lzn1;->M0(Lqp;Lpq0;)V

    .line 63
    .line 64
    .line 65
    neg-float p0, v2

    .line 66
    neg-float p2, v0

    .line 67
    invoke-interface {p1, p0, p2}, Lqp;->g(FF)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final M(J)J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lth1;->u:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lzn1;->b1()V

    .line 15
    .line 16
    .line 17
    :goto_0
    if-eqz p0, :cond_4

    .line 18
    .line 19
    iget-object v0, p0, Lzn1;->v:Lr61;

    .line 20
    .line 21
    iget-object v1, v0, Lr61;->M:Lvn1;

    .line 22
    .line 23
    iget-object v1, v1, Lvn1;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lzn1;

    .line 26
    .line 27
    if-ne p0, v1, :cond_1

    .line 28
    .line 29
    iget-boolean v1, v0, Lr61;->j:Z

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    invoke-static {v0}, Lu61;->a(Lr61;)Lzv1;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lb7;

    .line 38
    .line 39
    invoke-virtual {v1}, Lb7;->getRectManager()Lq62;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, v0}, Lq62;->b(Lr61;)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    const-wide v2, 0x7fffffff7fffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, Lz01;->a(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    invoke-static {p1, p2, v0, v1}, Ltp0;->D(JJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide p0

    .line 62
    return-wide p0

    .line 63
    :cond_1
    iget-object v0, p0, Lzn1;->S:Lyv1;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    check-cast v0, Lsq0;

    .line 68
    .line 69
    invoke-virtual {v0}, Lsq0;->b()[F

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-boolean v0, v0, Lsq0;->z:Z

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-static {p1, p2, v1}, Lhf1;->b(J[F)J

    .line 79
    .line 80
    .line 81
    move-result-wide p1

    .line 82
    :cond_3
    :goto_1
    iget-wide v0, p0, Lzn1;->G:J

    .line 83
    .line 84
    invoke-static {p1, p2, v0, v1}, Ltp0;->D(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide p1

    .line 88
    iget-object p0, p0, Lzn1;->x:Lzn1;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    return-wide p1
.end method

.method public final M0(Lqp;Lpq0;)V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lzn1;->T0(I)Lth1;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lzn1;->h1(Lqp;Lpq0;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v2, p0, Lzn1;->v:Lr61;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Lu61;->a(Lr61;)Lzv1;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lb7;

    .line 22
    .line 23
    invoke-virtual {v2}, Lb7;->getSharedDrawScope()Lt61;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-wide v4, p0, Lsz1;->j:J

    .line 28
    .line 29
    invoke-static {v4, v5}, Ls11;->q0(J)J

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
    instance-of v4, v1, Lmc0;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    move-object v8, v1

    .line 45
    check-cast v8, Lmc0;

    .line 46
    .line 47
    move-object v7, p0

    .line 48
    move-object v4, p1

    .line 49
    move-object v9, p2

    .line 50
    invoke-virtual/range {v3 .. v9}, Lt61;->c(Lqp;JLzn1;Lmc0;Lpq0;)V

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
    iget p0, v1, Lth1;->j:I

    .line 58
    .line 59
    and-int/2addr p0, v0

    .line 60
    if-eqz p0, :cond_7

    .line 61
    .line 62
    instance-of p0, v1, Lu60;

    .line 63
    .line 64
    if-eqz p0, :cond_7

    .line 65
    .line 66
    move-object p0, v1

    .line 67
    check-cast p0, Lu60;

    .line 68
    .line 69
    iget-object p0, p0, Lu60;->w:Lth1;

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
    iget v8, p0, Lth1;->j:I

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
    new-instance v10, Lzk1;

    .line 89
    .line 90
    const/16 p2, 0x10

    .line 91
    .line 92
    new-array p2, p2, [Lth1;

    .line 93
    .line 94
    invoke-direct {v10, p2}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    if-eqz v1, :cond_4

    .line 98
    .line 99
    invoke-virtual {v10, v1}, Lzk1;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move-object v1, v2

    .line 103
    :cond_4
    invoke-virtual {v10, p0}, Lzk1;->b(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    :goto_2
    iget-object p0, p0, Lth1;->m:Lth1;

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
    invoke-static {v10}, Lsp0;->m(Lzk1;)Lth1;

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

.method public abstract N0()V
.end method

.method public final O0(Lzn1;)Lzn1;
    .locals 5

    .line 1
    iget-object v0, p1, Lzn1;->v:Lr61;

    .line 2
    .line 3
    iget-object v1, p0, Lzn1;->v:Lr61;

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Lzn1;->S0()Lth1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v1, Lth1;->h:Lth1;

    .line 16
    .line 17
    iget-boolean v2, v2, Lth1;->u:Z

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const-string v2, "visitLocalAncestors called on an unattached node"

    .line 22
    .line 23
    invoke-static {v2}, Lkz0;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v1, v1, Lth1;->h:Lth1;

    .line 27
    .line 28
    iget-object v1, v1, Lth1;->l:Lth1;

    .line 29
    .line 30
    :goto_0
    if-eqz v1, :cond_7

    .line 31
    .line 32
    iget v2, v1, Lth1;->j:I

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
    iget-object v1, v1, Lth1;->l:Lth1;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    iget v2, v0, Lr61;->w:I

    .line 45
    .line 46
    iget v3, v1, Lr61;->w:I

    .line 47
    .line 48
    if-le v2, v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0}, Lr61;->u()Lr61;

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
    iget v3, v2, Lr61;->w:I

    .line 60
    .line 61
    iget v4, v0, Lr61;->w:I

    .line 62
    .line 63
    if-le v3, v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v2}, Lr61;->u()Lr61;

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
    invoke-virtual {v0}, Lr61;->u()Lr61;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v2}, Lr61;->u()Lr61;

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
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

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
    iget-object p0, p1, Lzn1;->v:Lr61;

    .line 99
    .line 100
    if-ne v0, p0, :cond_9

    .line 101
    .line 102
    :goto_4
    return-object p1

    .line 103
    :cond_9
    iget-object p0, v0, Lr61;->M:Lvn1;

    .line 104
    .line 105
    iget-object p0, p0, Lvn1;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Lqz0;

    .line 108
    .line 109
    return-object p0
.end method

.method public final P0(J)J
    .locals 6

    .line 1
    iget-wide v0, p0, Lzn1;->G:J

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
    iget-object p0, p0, Lzn1;->S:Lyv1;

    .line 46
    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    check-cast p0, Lsq0;

    .line 50
    .line 51
    invoke-virtual {p0}, Lsq0;->a()[F

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
    iget-boolean p0, p0, Lsq0;->z:Z

    .line 64
    .line 65
    if-eqz p0, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {p1, p2, v0}, Lhf1;->b(J[F)J

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

.method public abstract Q0()Lmd1;
.end method

.method public final R0()J
    .locals 3

    .line 1
    iget-object v0, p0, Lzn1;->B:Le70;

    .line 2
    .line 3
    iget-object p0, p0, Lzn1;->v:Lr61;

    .line 4
    .line 5
    iget-object p0, p0, Lr61;->H:Lza3;

    .line 6
    .line 7
    invoke-interface {p0}, Lza3;->g()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-interface {v0, v1, v2}, Le70;->d0(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method

.method public abstract S0()Lth1;
.end method

.method public final T0(I)Lth1;
    .locals 2

    .line 1
    invoke-static {p1}, Lao1;->g(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

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
    iget-object v1, v1, Lth1;->l:Lth1;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lzn1;->U0(Z)Lth1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_1
    if-eqz p0, :cond_3

    .line 22
    .line 23
    iget v0, p0, Lth1;->k:I

    .line 24
    .line 25
    and-int/2addr v0, p1

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget v0, p0, Lth1;->j:I

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
    iget-object p0, p0, Lth1;->m:Lth1;

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

.method public final U0(Z)Lth1;
    .locals 2

    .line 1
    iget-object v0, p0, Lzn1;->v:Lr61;

    .line 2
    .line 3
    iget-object v0, v0, Lr61;->M:Lvn1;

    .line 4
    .line 5
    iget-object v1, v0, Lvn1;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lzn1;

    .line 8
    .line 9
    if-ne v1, p0, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Lvn1;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lth1;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object p0, p0, Lzn1;->x:Lzn1;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    iget-object p0, p0, Lth1;->m:Lth1;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public final V0(Lth1;Lxn1;JLxs0;IZ)V
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
    invoke-virtual/range {v0 .. v6}, Lzn1;->Y0(Lxn1;JLxs0;IZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-interface {p2, p1}, Lxn1;->i(Lth1;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p2}, Lxn1;->d()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1, v0}, Lp7;->h(Lt60;I)Lth1;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual/range {p0 .. p7}, Lzn1;->V0(Lth1;Lxn1;JLxs0;IZ)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget v0, p5, Lxs0;->j:I

    .line 32
    .line 33
    iget-object v1, p5, Lxs0;->h:Llk1;

    .line 34
    .line 35
    add-int/lit8 v2, v0, 0x1

    .line 36
    .line 37
    iget v3, v1, Llk1;->b:I

    .line 38
    .line 39
    invoke-virtual {p5, v2, v3}, Lxs0;->b(II)V

    .line 40
    .line 41
    .line 42
    iget v2, p5, Lxs0;->j:I

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    iput v2, p5, Lxs0;->j:I

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Llk1;->a(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p5, Lxs0;->i:Lck1;

    .line 52
    .line 53
    const/high16 v2, -0x40800000    # -1.0f

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-static {v2, p7, v3}, Lqp0;->a(FZZ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-virtual {v1, v2, v3}, Lck1;->a(J)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p2}, Lxn1;->d()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-static {p1, v1}, Lp7;->h(Lt60;I)Lth1;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual/range {p0 .. p7}, Lzn1;->V0(Lth1;Lxn1;JLxs0;IZ)V

    .line 72
    .line 73
    .line 74
    iput v0, p5, Lxs0;->j:I

    .line 75
    .line 76
    return-void
.end method

.method public final W0(Lth1;Lxn1;JLxs0;IZF)V
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
    invoke-virtual/range {v0 .. v6}, Lzn1;->Y0(Lxn1;JLxs0;IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-interface {p2, p1}, Lxn1;->i(Lth1;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Lxn1;->d()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {p1, v0}, Lp7;->h(Lt60;I)Lth1;

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
    invoke-virtual/range {v0 .. v8}, Lzn1;->W0(Lth1;Lxn1;JLxs0;IZF)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    move-object/from16 v5, p5

    .line 46
    .line 47
    iget v10, v5, Lxs0;->j:I

    .line 48
    .line 49
    iget-object v0, v5, Lxs0;->h:Llk1;

    .line 50
    .line 51
    add-int/lit8 v1, v10, 0x1

    .line 52
    .line 53
    iget v2, v0, Llk1;->b:I

    .line 54
    .line 55
    invoke-virtual {v5, v1, v2}, Lxs0;->b(II)V

    .line 56
    .line 57
    .line 58
    iget v1, v5, Lxs0;->j:I

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    iput v1, v5, Lxs0;->j:I

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Llk1;->a(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v5, Lxs0;->i:Lck1;

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
    invoke-static {v8, v7, v1}, Lqp0;->a(FZZ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v1

    .line 78
    invoke-virtual {v0, v1, v2}, Lck1;->a(J)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p2}, Lxn1;->d()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {p1, v0}, Lp7;->h(Lt60;I)Lth1;

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
    invoke-virtual/range {v0 .. v9}, Lzn1;->g1(Lth1;Lxn1;JLxs0;IZFZ)V

    .line 96
    .line 97
    .line 98
    iput v10, v5, Lxs0;->j:I

    .line 99
    .line 100
    return-void
.end method

.method public final X0(Lxn1;JLxs0;IZ)V
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
    invoke-interface {p1}, Lxn1;->d()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, v0}, Lzn1;->T0(I)Lth1;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v3, v4}, Lzn1;->t1(J)Z

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
    invoke-virtual {p0}, Lzn1;->R0()J

    .line 31
    .line 32
    .line 33
    move-result-wide v12

    .line 34
    invoke-virtual {p0, v3, v4, v12, v13}, Lzn1;->K0(JJ)F

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
    iget v2, v5, Lxs0;->j:I

    .line 46
    .line 47
    iget-object v7, v5, Lxs0;->h:Llk1;

    .line 48
    .line 49
    iget v7, v7, Llk1;->b:I

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
    invoke-static {v0, v8, v8}, Lqp0;->a(FZZ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v7

    .line 59
    invoke-virtual {v5}, Lxs0;->a()J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    invoke-static {v9, v10, v7, v8}, Lxe1;->k(JJ)I

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
    invoke-virtual/range {v0 .. v8}, Lzn1;->W0(Lth1;Lxn1;JLxs0;IZF)V

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
    invoke-virtual/range {p0 .. p6}, Lzn1;->Y0(Lxn1;JLxs0;IZ)V

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
    invoke-virtual {p0}, Lsz1;->b0()I

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
    invoke-virtual {p0}, Lsz1;->Z()I

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
    invoke-virtual/range {v0 .. v7}, Lzn1;->V0(Lth1;Lxn1;JLxs0;IZ)V

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
    invoke-virtual {p0}, Lzn1;->R0()J

    .line 154
    .line 155
    .line 156
    move-result-wide v12

    .line 157
    invoke-virtual {p0, v3, v4, v12, v13}, Lzn1;->K0(JJ)F

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
    iget v7, v5, Lxs0;->j:I

    .line 172
    .line 173
    iget-object v9, v5, Lxs0;->h:Llk1;

    .line 174
    .line 175
    iget v9, v9, Llk1;->b:I

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
    invoke-static {v2, v7, v8}, Lqp0;->a(FZZ)J

    .line 186
    .line 187
    .line 188
    move-result-wide v9

    .line 189
    invoke-virtual {v5}, Lxs0;->a()J

    .line 190
    .line 191
    .line 192
    move-result-wide v12

    .line 193
    invoke-static {v12, v13, v9, v10}, Lxe1;->k(JJ)I

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
    invoke-virtual/range {v0 .. v9}, Lzn1;->g1(Lth1;Lxn1;JLxs0;IZFZ)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public Y0(Lxn1;JLxs0;IZ)V
    .locals 0

    .line 1
    iget-object p0, p0, Lzn1;->w:Lzn1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p2, p3}, Lzn1;->P0(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    invoke-virtual/range {p0 .. p6}, Lzn1;->X0(Lxn1;JLxs0;IZ)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final Z0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lzn1;->S:Lyv1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lsq0;

    .line 6
    .line 7
    invoke-virtual {v0}, Lsq0;->c()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object p0, p0, Lzn1;->x:Lzn1;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lzn1;->Z0()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final a1()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lzn1;->S:Lyv1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lzn1;->D:F

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
    iget-object p0, p0, Lzn1;->x:Lzn1;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lzn1;->a1()Z

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

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Lzn1;->v:Lr61;

    .line 2
    .line 3
    iget-object p0, p0, Lr61;->F:Le70;

    .line 4
    .line 5
    invoke-interface {p0}, Le70;->b()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final b1()V
    .locals 0

    .line 1
    iget-object p0, p0, Lzn1;->v:Lr61;

    .line 2
    .line 3
    iget-object p0, p0, Lr61;->N:Lv61;

    .line 4
    .line 5
    invoke-virtual {p0}, Lv61;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lth1;->u:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Lzn1;->M(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    iget-object p0, p0, Lzn1;->v:Lr61;

    .line 19
    .line 20
    invoke-static {p0}, Lu61;->a(Lr61;)Lzv1;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lb7;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Lb7;->u(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    return-wide p0
.end method

.method public final c1()V
    .locals 13

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, Lao1;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, Lzn1;->U0(Z)Lth1;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_c

    .line 12
    .line 13
    iget-object v2, v2, Lth1;->h:Lth1;

    .line 14
    .line 15
    iget v2, v2, Lth1;->k:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_c

    .line 19
    .line 20
    invoke-static {}, Ltl;->B()Lvr2;

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
    invoke-virtual {v2}, Lvr2;->e()Lin0;

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
    invoke-static {v2}, Ltl;->K(Lvr2;)Lvr2;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

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
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget-object v6, v6, Lth1;->l:Lth1;

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
    invoke-virtual {p0, v1}, Lzn1;->U0(Z)Lth1;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_2
    if-eqz v1, :cond_b

    .line 62
    .line 63
    iget v7, v1, Lth1;->k:I

    .line 64
    .line 65
    and-int/2addr v7, v0

    .line 66
    if-eqz v7, :cond_b

    .line 67
    .line 68
    iget v7, v1, Lth1;->j:I

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
    instance-of v9, v7, Lqf1;

    .line 78
    .line 79
    if-eqz v9, :cond_3

    .line 80
    .line 81
    check-cast v7, Lqf1;

    .line 82
    .line 83
    iget-wide v9, p0, Lsz1;->j:J

    .line 84
    .line 85
    invoke-interface {v7, v9, v10}, Lqf1;->c(J)V

    .line 86
    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_3
    iget v9, v7, Lth1;->j:I

    .line 90
    .line 91
    and-int/2addr v9, v0

    .line 92
    if-eqz v9, :cond_9

    .line 93
    .line 94
    instance-of v9, v7, Lu60;

    .line 95
    .line 96
    if-eqz v9, :cond_9

    .line 97
    .line 98
    move-object v9, v7

    .line 99
    check-cast v9, Lu60;

    .line 100
    .line 101
    iget-object v9, v9, Lu60;->w:Lth1;

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
    iget v12, v9, Lth1;->j:I

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
    new-instance v8, Lzk1;

    .line 121
    .line 122
    const/16 v11, 0x10

    .line 123
    .line 124
    new-array v11, v11, [Lth1;

    .line 125
    .line 126
    invoke-direct {v8, v11}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    if-eqz v7, :cond_6

    .line 130
    .line 131
    invoke-virtual {v8, v7}, Lzk1;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object v7, v3

    .line 135
    :cond_6
    invoke-virtual {v8, v9}, Lzk1;->b(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    :goto_5
    iget-object v9, v9, Lth1;->m:Lth1;

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
    invoke-static {v8}, Lsp0;->m(Lzk1;)Lth1;

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
    iget-object v1, v1, Lth1;->m:Lth1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_b
    :goto_7
    invoke-static {v2, v5, v4}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_8
    invoke-static {v2, v5, v4}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 159
    .line 160
    .line 161
    throw p0

    .line 162
    :cond_c
    return-void
.end method

.method public final d1()V
    .locals 10

    .line 1
    const/high16 v0, 0x400000

    .line 2
    .line 3
    invoke-static {v0}, Lao1;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

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
    iget-object v2, v2, Lth1;->l:Lth1;

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
    invoke-virtual {p0, v1}, Lzn1;->U0(Z)Lth1;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_1
    if-eqz v1, :cond_a

    .line 25
    .line 26
    iget v3, v1, Lth1;->k:I

    .line 27
    .line 28
    and-int/2addr v3, v0

    .line 29
    if-eqz v3, :cond_a

    .line 30
    .line 31
    iget v3, v1, Lth1;->j:I

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
    instance-of v6, v4, La61;

    .line 42
    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    check-cast v4, La61;

    .line 46
    .line 47
    invoke-interface {v4, p0}, La61;->q(Lc61;)V

    .line 48
    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_2
    iget v6, v4, Lth1;->j:I

    .line 52
    .line 53
    and-int/2addr v6, v0

    .line 54
    if-eqz v6, :cond_8

    .line 55
    .line 56
    instance-of v6, v4, Lu60;

    .line 57
    .line 58
    if-eqz v6, :cond_8

    .line 59
    .line 60
    move-object v6, v4

    .line 61
    check-cast v6, Lu60;

    .line 62
    .line 63
    iget-object v6, v6, Lu60;->w:Lth1;

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
    iget v9, v6, Lth1;->j:I

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
    new-instance v5, Lzk1;

    .line 83
    .line 84
    const/16 v8, 0x10

    .line 85
    .line 86
    new-array v8, v8, [Lth1;

    .line 87
    .line 88
    invoke-direct {v5, v8}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    if-eqz v4, :cond_5

    .line 92
    .line 93
    invoke-virtual {v5, v4}, Lzk1;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move-object v4, v3

    .line 97
    :cond_5
    invoke-virtual {v5, v6}, Lzk1;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_6
    :goto_4
    iget-object v6, v6, Lth1;->m:Lth1;

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
    invoke-static {v5}, Lsp0;->m(Lzk1;)Lth1;

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
    iget-object v1, v1, Lth1;->m:Lth1;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_a
    :goto_6
    return-void
.end method

.method public final e1()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lzn1;->y:Z

    .line 3
    .line 4
    iget-object v0, p0, Lzn1;->Q:Lyn1;

    .line 5
    .line 6
    invoke-virtual {v0}, Lyn1;->a()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lzn1;->k1()V

    .line 10
    .line 11
    .line 12
    iget-wide v0, p0, Lzn1;->G:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, Lz01;->a(JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lzn1;->v:Lr61;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lr61;->N(Lzn1;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final f1()V
    .locals 9

    .line 1
    const/high16 v0, 0x100000

    .line 2
    .line 3
    invoke-static {v0}, Lao1;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, Lzn1;->U0(Z)Lth1;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_9

    .line 12
    .line 13
    iget-object v2, v2, Lth1;->h:Lth1;

    .line 14
    .line 15
    iget v2, v2, Lth1;->k:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_9

    .line 19
    .line 20
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

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
    iget-object v2, v2, Lth1;->l:Lth1;

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto :goto_5

    .line 32
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lzn1;->U0(Z)Lth1;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_1
    if-eqz p0, :cond_9

    .line 37
    .line 38
    iget v1, p0, Lth1;->k:I

    .line 39
    .line 40
    and-int/2addr v1, v0

    .line 41
    if-eqz v1, :cond_9

    .line 42
    .line 43
    iget v1, p0, Lth1;->j:I

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
    iget v5, v3, Lth1;->j:I

    .line 54
    .line 55
    and-int/2addr v5, v0

    .line 56
    if-eqz v5, :cond_7

    .line 57
    .line 58
    instance-of v5, v3, Lu60;

    .line 59
    .line 60
    if-eqz v5, :cond_7

    .line 61
    .line 62
    move-object v5, v3

    .line 63
    check-cast v5, Lu60;

    .line 64
    .line 65
    iget-object v5, v5, Lu60;->w:Lth1;

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
    iget v8, v5, Lth1;->j:I

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
    new-instance v4, Lzk1;

    .line 85
    .line 86
    const/16 v7, 0x10

    .line 87
    .line 88
    new-array v7, v7, [Lth1;

    .line 89
    .line 90
    invoke-direct {v4, v7}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    if-eqz v3, :cond_4

    .line 94
    .line 95
    invoke-virtual {v4, v3}, Lzk1;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-object v3, v1

    .line 99
    :cond_4
    invoke-virtual {v4, v5}, Lzk1;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_5
    :goto_4
    iget-object v5, v5, Lth1;->m:Lth1;

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
    invoke-static {v4}, Lsp0;->m(Lzk1;)Lth1;

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
    iget-object p0, p0, Lth1;->m:Lth1;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_9
    :goto_5
    return-void
.end method

.method public final g(J)J
    .locals 3

    .line 1
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lth1;->u:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p0}, Ls11;->J(Lc61;)Lc61;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lzn1;->v:Lr61;

    .line 19
    .line 20
    invoke-static {v1}, Lu61;->a(Lr61;)Lzv1;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lb7;

    .line 25
    .line 26
    invoke-virtual {v1}, Lb7;->D()V

    .line 27
    .line 28
    .line 29
    iget-object v1, v1, Lb7;->l0:[F

    .line 30
    .line 31
    invoke-static {p1, p2, v1}, Lhf1;->b(J[F)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    const-wide/16 v1, 0x0

    .line 36
    .line 37
    invoke-interface {v0, v1, v2}, Lc61;->M(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-static {p1, p2, v1, v2}, Lrs1;->d(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    invoke-virtual {p0, v0, p1, p2}, Lzn1;->D(Lc61;J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p0

    .line 49
    return-wide p0
.end method

.method public final g1(Lth1;Lxn1;JLxs0;IZFZ)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    move-wide/from16 v3, p3

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move/from16 v6, p6

    .line 14
    .line 15
    move/from16 v7, p7

    .line 16
    .line 17
    invoke-virtual/range {v1 .. v7}, Lzn1;->Y0(Lxn1;JLxs0;IZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    move-object/from16 v2, p2

    .line 22
    .line 23
    invoke-interface {v2, v0}, Lxn1;->i(Lth1;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, Lxn1;->d()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, v1}, Lp7;->h(Lt60;I)Lth1;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object/from16 v0, p0

    .line 38
    .line 39
    move-wide/from16 v3, p3

    .line 40
    .line 41
    move-object/from16 v5, p5

    .line 42
    .line 43
    move/from16 v6, p6

    .line 44
    .line 45
    move/from16 v7, p7

    .line 46
    .line 47
    move/from16 v8, p8

    .line 48
    .line 49
    move/from16 v9, p9

    .line 50
    .line 51
    invoke-virtual/range {v0 .. v9}, Lzn1;->g1(Lth1;Lxn1;JLxs0;IZFZ)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    move-object/from16 v5, p5

    .line 56
    .line 57
    move/from16 v6, p6

    .line 58
    .line 59
    move/from16 v7, p7

    .line 60
    .line 61
    const/4 v1, 0x3

    .line 62
    if-ne v6, v1, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 v2, 0x4

    .line 66
    if-ne v6, v2, :cond_12

    .line 67
    .line 68
    :goto_0
    const/4 v2, 0x0

    .line 69
    move-object v3, v0

    .line 70
    move-object v4, v2

    .line 71
    :goto_1
    if-eqz v3, :cond_12

    .line 72
    .line 73
    instance-of v8, v3, Lr12;

    .line 74
    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v10, 0x1

    .line 77
    if-eqz v8, :cond_b

    .line 78
    .line 79
    check-cast v3, Lr12;

    .line 80
    .line 81
    invoke-interface {v3}, Lr12;->s()J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    const/16 v4, 0x20

    .line 86
    .line 87
    shr-long v11, p3, v4

    .line 88
    .line 89
    long-to-int v4, v11

    .line 90
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    move-object/from16 v11, p0

    .line 95
    .line 96
    iget-object v12, v11, Lzn1;->v:Lr61;

    .line 97
    .line 98
    iget-object v13, v12, Lr61;->G:Ld61;

    .line 99
    .line 100
    sget v14, Lx23;->b:I

    .line 101
    .line 102
    const-wide/high16 v14, -0x8000000000000000L

    .line 103
    .line 104
    and-long/2addr v14, v2

    .line 105
    const-wide/16 v16, 0x0

    .line 106
    .line 107
    cmp-long v14, v14, v16

    .line 108
    .line 109
    sget-object v15, Ld61;->h:Ld61;

    .line 110
    .line 111
    const/4 v1, 0x2

    .line 112
    if-eqz v14, :cond_4

    .line 113
    .line 114
    if-ne v13, v15, :cond_3

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    invoke-static {v2, v3, v1}, Ljx2;->c(JI)I

    .line 118
    .line 119
    .line 120
    move-result v13

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    :goto_2
    invoke-static {v2, v3, v9}, Ljx2;->c(JI)I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    :goto_3
    neg-int v13, v13

    .line 127
    int-to-float v13, v13

    .line 128
    cmpl-float v8, v8, v13

    .line 129
    .line 130
    if-ltz v8, :cond_12

    .line 131
    .line 132
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    invoke-virtual {v11}, Lsz1;->b0()I

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    iget-object v12, v12, Lr61;->G:Ld61;

    .line 141
    .line 142
    if-eqz v14, :cond_6

    .line 143
    .line 144
    if-ne v12, v15, :cond_5

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_5
    invoke-static {v2, v3, v9}, Ljx2;->c(JI)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    goto :goto_5

    .line 152
    :cond_6
    :goto_4
    invoke-static {v2, v3, v1}, Ljx2;->c(JI)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    :goto_5
    add-int/2addr v8, v1

    .line 157
    int-to-float v1, v8

    .line 158
    cmpg-float v1, v4, v1

    .line 159
    .line 160
    if-gez v1, :cond_12

    .line 161
    .line 162
    const-wide v8, 0xffffffffL

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    and-long v8, p3, v8

    .line 168
    .line 169
    long-to-int v1, v8

    .line 170
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    sget v8, Lx23;->b:I

    .line 175
    .line 176
    invoke-static {v2, v3, v10}, Ljx2;->c(JI)I

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    neg-int v8, v8

    .line 181
    int-to-float v8, v8

    .line 182
    cmpl-float v4, v4, v8

    .line 183
    .line 184
    if-ltz v4, :cond_12

    .line 185
    .line 186
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-virtual {v11}, Lsz1;->Z()I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    const/4 v8, 0x3

    .line 195
    invoke-static {v2, v3, v8}, Ljx2;->c(JI)I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    add-int/2addr v2, v4

    .line 200
    int-to-float v2, v2

    .line 201
    cmpg-float v1, v1, v2

    .line 202
    .line 203
    if-gez v1, :cond_12

    .line 204
    .line 205
    iget-object v1, v5, Lxs0;->i:Lck1;

    .line 206
    .line 207
    iget-object v2, v5, Lxs0;->h:Llk1;

    .line 208
    .line 209
    iget v12, v5, Lxs0;->j:I

    .line 210
    .line 211
    iget v3, v2, Llk1;->b:I

    .line 212
    .line 213
    add-int/lit8 v4, v3, -0x1

    .line 214
    .line 215
    const/4 v13, 0x0

    .line 216
    if-ne v12, v4, :cond_7

    .line 217
    .line 218
    add-int/lit8 v4, v12, 0x1

    .line 219
    .line 220
    invoke-virtual {v5, v4, v3}, Lxs0;->b(II)V

    .line 221
    .line 222
    .line 223
    iget v3, v5, Lxs0;->j:I

    .line 224
    .line 225
    add-int/2addr v3, v10

    .line 226
    iput v3, v5, Lxs0;->j:I

    .line 227
    .line 228
    invoke-virtual {v2, v0}, Llk1;->a(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v13, v7, v10}, Lqp0;->a(FZZ)J

    .line 232
    .line 233
    .line 234
    move-result-wide v2

    .line 235
    invoke-virtual {v1, v2, v3}, Lck1;->a(J)V

    .line 236
    .line 237
    .line 238
    invoke-interface/range {p2 .. p2}, Lxn1;->d()I

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    invoke-static {v0, v1}, Lp7;->h(Lt60;I)Lth1;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    move-object/from16 v2, p2

    .line 247
    .line 248
    move-wide/from16 v3, p3

    .line 249
    .line 250
    move/from16 v8, p8

    .line 251
    .line 252
    move/from16 v9, p9

    .line 253
    .line 254
    move-object v0, v11

    .line 255
    invoke-virtual/range {v0 .. v9}, Lzn1;->g1(Lth1;Lxn1;JLxs0;IZFZ)V

    .line 256
    .line 257
    .line 258
    iput v12, v5, Lxs0;->j:I

    .line 259
    .line 260
    return-void

    .line 261
    :cond_7
    invoke-virtual {v5}, Lxs0;->a()J

    .line 262
    .line 263
    .line 264
    move-result-wide v3

    .line 265
    iget v11, v5, Lxs0;->j:I

    .line 266
    .line 267
    invoke-static {v3, v4}, Lxe1;->N(J)Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-eqz v6, :cond_9

    .line 272
    .line 273
    iget v3, v2, Llk1;->b:I

    .line 274
    .line 275
    add-int/lit8 v12, v3, -0x1

    .line 276
    .line 277
    iput v12, v5, Lxs0;->j:I

    .line 278
    .line 279
    iget v4, v2, Llk1;->b:I

    .line 280
    .line 281
    invoke-virtual {v5, v3, v4}, Lxs0;->b(II)V

    .line 282
    .line 283
    .line 284
    iget v3, v5, Lxs0;->j:I

    .line 285
    .line 286
    add-int/2addr v3, v10

    .line 287
    iput v3, v5, Lxs0;->j:I

    .line 288
    .line 289
    invoke-virtual {v2, v0}, Llk1;->a(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-static {v13, v7, v10}, Lqp0;->a(FZZ)J

    .line 293
    .line 294
    .line 295
    move-result-wide v2

    .line 296
    invoke-virtual {v1, v2, v3}, Lck1;->a(J)V

    .line 297
    .line 298
    .line 299
    invoke-interface/range {p2 .. p2}, Lxn1;->d()I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    invoke-static {v0, v1}, Lp7;->h(Lt60;I)Lth1;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    move-object/from16 v0, p0

    .line 308
    .line 309
    move-object/from16 v2, p2

    .line 310
    .line 311
    move-wide/from16 v3, p3

    .line 312
    .line 313
    move/from16 v6, p6

    .line 314
    .line 315
    move/from16 v8, p8

    .line 316
    .line 317
    move/from16 v9, p9

    .line 318
    .line 319
    invoke-virtual/range {v0 .. v9}, Lzn1;->g1(Lth1;Lxn1;JLxs0;IZFZ)V

    .line 320
    .line 321
    .line 322
    iput v12, v5, Lxs0;->j:I

    .line 323
    .line 324
    invoke-virtual {v5}, Lxs0;->a()J

    .line 325
    .line 326
    .line 327
    move-result-wide v0

    .line 328
    invoke-static {v0, v1}, Lxe1;->z(J)F

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    cmpg-float v0, v0, v13

    .line 333
    .line 334
    if-gez v0, :cond_8

    .line 335
    .line 336
    add-int/lit8 v0, v11, 0x1

    .line 337
    .line 338
    iget v1, v5, Lxs0;->j:I

    .line 339
    .line 340
    add-int/2addr v1, v10

    .line 341
    invoke-virtual {v5, v0, v1}, Lxs0;->b(II)V

    .line 342
    .line 343
    .line 344
    :cond_8
    iput v11, v5, Lxs0;->j:I

    .line 345
    .line 346
    return-void

    .line 347
    :cond_9
    invoke-static {v3, v4}, Lxe1;->z(J)F

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    cmpl-float v3, v3, v13

    .line 352
    .line 353
    if-lez v3, :cond_a

    .line 354
    .line 355
    iget v11, v5, Lxs0;->j:I

    .line 356
    .line 357
    add-int/lit8 v3, v11, 0x1

    .line 358
    .line 359
    iget v4, v2, Llk1;->b:I

    .line 360
    .line 361
    invoke-virtual {v5, v3, v4}, Lxs0;->b(II)V

    .line 362
    .line 363
    .line 364
    iget v3, v5, Lxs0;->j:I

    .line 365
    .line 366
    add-int/2addr v3, v10

    .line 367
    iput v3, v5, Lxs0;->j:I

    .line 368
    .line 369
    invoke-virtual {v2, v0}, Llk1;->a(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v13, v7, v10}, Lqp0;->a(FZZ)J

    .line 373
    .line 374
    .line 375
    move-result-wide v2

    .line 376
    invoke-virtual {v1, v2, v3}, Lck1;->a(J)V

    .line 377
    .line 378
    .line 379
    invoke-interface/range {p2 .. p2}, Lxn1;->d()I

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    invoke-static {v0, v1}, Lp7;->h(Lt60;I)Lth1;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    move-object/from16 v0, p0

    .line 388
    .line 389
    move-object/from16 v2, p2

    .line 390
    .line 391
    move-wide/from16 v3, p3

    .line 392
    .line 393
    move/from16 v6, p6

    .line 394
    .line 395
    move/from16 v8, p8

    .line 396
    .line 397
    move/from16 v9, p9

    .line 398
    .line 399
    invoke-virtual/range {v0 .. v9}, Lzn1;->g1(Lth1;Lxn1;JLxs0;IZFZ)V

    .line 400
    .line 401
    .line 402
    iput v11, v5, Lxs0;->j:I

    .line 403
    .line 404
    :cond_a
    return-void

    .line 405
    :cond_b
    move v8, v1

    .line 406
    iget v1, v3, Lth1;->j:I

    .line 407
    .line 408
    const/16 v6, 0x10

    .line 409
    .line 410
    and-int/2addr v1, v6

    .line 411
    if-eqz v1, :cond_11

    .line 412
    .line 413
    instance-of v1, v3, Lu60;

    .line 414
    .line 415
    if-eqz v1, :cond_11

    .line 416
    .line 417
    move-object v1, v3

    .line 418
    check-cast v1, Lu60;

    .line 419
    .line 420
    iget-object v1, v1, Lu60;->w:Lth1;

    .line 421
    .line 422
    :goto_6
    if-eqz v1, :cond_10

    .line 423
    .line 424
    iget v7, v1, Lth1;->j:I

    .line 425
    .line 426
    and-int/2addr v7, v6

    .line 427
    if-eqz v7, :cond_f

    .line 428
    .line 429
    add-int/lit8 v9, v9, 0x1

    .line 430
    .line 431
    if-ne v9, v10, :cond_c

    .line 432
    .line 433
    move-object v3, v1

    .line 434
    goto :goto_7

    .line 435
    :cond_c
    if-nez v4, :cond_d

    .line 436
    .line 437
    new-instance v4, Lzk1;

    .line 438
    .line 439
    new-array v7, v6, [Lth1;

    .line 440
    .line 441
    invoke-direct {v4, v7}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    :cond_d
    if-eqz v3, :cond_e

    .line 445
    .line 446
    invoke-virtual {v4, v3}, Lzk1;->b(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    move-object v3, v2

    .line 450
    :cond_e
    invoke-virtual {v4, v1}, Lzk1;->b(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    :cond_f
    :goto_7
    iget-object v1, v1, Lth1;->m:Lth1;

    .line 454
    .line 455
    goto :goto_6

    .line 456
    :cond_10
    if-ne v9, v10, :cond_11

    .line 457
    .line 458
    :goto_8
    move/from16 v6, p6

    .line 459
    .line 460
    move/from16 v7, p7

    .line 461
    .line 462
    move v1, v8

    .line 463
    goto/16 :goto_1

    .line 464
    .line 465
    :cond_11
    invoke-static {v4}, Lsp0;->m(Lzk1;)Lth1;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    goto :goto_8

    .line 470
    :cond_12
    if-eqz p9, :cond_13

    .line 471
    .line 472
    invoke-virtual/range {p0 .. p8}, Lzn1;->W0(Lth1;Lxn1;JLxs0;IZF)V

    .line 473
    .line 474
    .line 475
    return-void

    .line 476
    :cond_13
    invoke-virtual/range {p0 .. p8}, Lzn1;->m1(Lth1;Lxn1;JLxs0;IZF)V

    .line 477
    .line 478
    .line 479
    return-void
.end method

.method public final getLayoutDirection()Ld61;
    .locals 0

    .line 1
    iget-object p0, p0, Lzn1;->v:Lr61;

    .line 2
    .line 3
    iget-object p0, p0, Lr61;->G:Ld61;

    .line 4
    .line 5
    return-object p0
.end method

.method public final h(J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lzn1;->M(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-object p0, p0, Lzn1;->v:Lr61;

    .line 6
    .line 7
    invoke-static {p0}, Lu61;->a(Lr61;)Lzv1;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lb7;

    .line 12
    .line 13
    invoke-virtual {p0}, Lb7;->D()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lb7;->k0:[F

    .line 17
    .line 18
    invoke-static {p1, p2, p0}, Lhf1;->b(J[F)J

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    return-wide p0
.end method

.method public abstract h1(Lqp;Lpq0;)V
.end method

.method public final i()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lzn1;->v:Lr61;

    .line 2
    .line 3
    iget-object v1, v0, Lr61;->M:Lvn1;

    .line 4
    .line 5
    const/16 v2, 0x40

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lvn1;->m(I)Z

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
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 15
    .line 16
    .line 17
    iget-object p0, v0, Lr61;->M:Lvn1;

    .line 18
    .line 19
    iget-object p0, p0, Lvn1;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lqx2;

    .line 22
    .line 23
    move-object v0, v3

    .line 24
    :goto_0
    if-eqz p0, :cond_8

    .line 25
    .line 26
    iget v1, p0, Lth1;->j:I

    .line 27
    .line 28
    and-int/2addr v1, v2

    .line 29
    if-eqz v1, :cond_7

    .line 30
    .line 31
    move-object v1, p0

    .line 32
    move-object v4, v3

    .line 33
    :goto_1
    if-eqz v1, :cond_7

    .line 34
    .line 35
    instance-of v5, v1, Lox1;

    .line 36
    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    check-cast v1, Lox1;

    .line 40
    .line 41
    invoke-interface {v1, v0}, Lox1;->q0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_4

    .line 46
    :cond_0
    iget v5, v1, Lth1;->j:I

    .line 47
    .line 48
    and-int/2addr v5, v2

    .line 49
    if-eqz v5, :cond_6

    .line 50
    .line 51
    instance-of v5, v1, Lu60;

    .line 52
    .line 53
    if-eqz v5, :cond_6

    .line 54
    .line 55
    move-object v5, v1

    .line 56
    check-cast v5, Lu60;

    .line 57
    .line 58
    iget-object v5, v5, Lu60;->w:Lth1;

    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    :goto_2
    const/4 v7, 0x1

    .line 62
    if-eqz v5, :cond_5

    .line 63
    .line 64
    iget v8, v5, Lth1;->j:I

    .line 65
    .line 66
    and-int/2addr v8, v2

    .line 67
    if-eqz v8, :cond_4

    .line 68
    .line 69
    add-int/lit8 v6, v6, 0x1

    .line 70
    .line 71
    if-ne v6, v7, :cond_1

    .line 72
    .line 73
    move-object v1, v5

    .line 74
    goto :goto_3

    .line 75
    :cond_1
    if-nez v4, :cond_2

    .line 76
    .line 77
    new-instance v4, Lzk1;

    .line 78
    .line 79
    const/16 v7, 0x10

    .line 80
    .line 81
    new-array v7, v7, [Lth1;

    .line 82
    .line 83
    invoke-direct {v4, v7}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    if-eqz v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {v4, v1}, Lzk1;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object v1, v3

    .line 92
    :cond_3
    invoke-virtual {v4, v5}, Lzk1;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    :goto_3
    iget-object v5, v5, Lth1;->m:Lth1;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    if-ne v6, v7, :cond_6

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_6
    :goto_4
    invoke-static {v4}, Lsp0;->m(Lzk1;)Lth1;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    goto :goto_1

    .line 106
    :cond_7
    iget-object p0, p0, Lth1;->l:Lth1;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_8
    return-object v0

    .line 110
    :cond_9
    return-object v3
.end method

.method public final i1(JFLin0;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p4, v0}, Lzn1;->r1(Lin0;Z)V

    .line 3
    .line 4
    .line 5
    iget-wide v0, p0, Lzn1;->G:J

    .line 6
    .line 7
    invoke-static {v0, v1, p1, p2}, Lz01;->a(JJ)Z

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    iget-object v0, p0, Lzn1;->v:Lr61;

    .line 12
    .line 13
    if-nez p4, :cond_2

    .line 14
    .line 15
    invoke-static {v0}, Lu61;->a(Lr61;)Lzv1;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    const/high16 v1, -0x3f800000    # -4.0f

    .line 20
    .line 21
    check-cast p4, Lb7;

    .line 22
    .line 23
    invoke-virtual {p4, v1}, Lb7;->N(F)V

    .line 24
    .line 25
    .line 26
    iput-wide p1, p0, Lzn1;->G:J

    .line 27
    .line 28
    iget-object p4, p0, Lzn1;->S:Lyv1;

    .line 29
    .line 30
    if-eqz p4, :cond_0

    .line 31
    .line 32
    check-cast p4, Lsq0;

    .line 33
    .line 34
    invoke-virtual {p4, p1, p2}, Lsq0;->d(J)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, p0, Lzn1;->x:Lzn1;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1}, Lzn1;->Z0()V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    invoke-virtual {v0, p0}, Lr61;->N(Lzn1;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Lkd1;->E0(Lzn1;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, v0, Lr61;->u:Lzv1;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    check-cast p1, Lb7;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lb7;->z(Lr61;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iput p3, p0, Lzn1;->H:F

    .line 61
    .line 62
    iget-object p1, v0, Lr61;->M:Lvn1;

    .line 63
    .line 64
    iget-object p1, p1, Lvn1;->e:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lzn1;

    .line 67
    .line 68
    if-ne p0, p1, :cond_3

    .line 69
    .line 70
    invoke-static {v0}, Lu61;->a(Lr61;)Lzv1;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lb7;

    .line 75
    .line 76
    invoke-virtual {p1}, Lb7;->getRectManager()Lq62;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1, v0}, Lq62;->f(Lr61;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    iget-boolean p1, p0, Lkd1;->r:Z

    .line 84
    .line 85
    if-nez p1, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0}, Lzn1;->A0()Lof1;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p1}, Lkd1;->o0(Lof1;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    return-void
.end method

.method public final j()Lc61;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lth1;->u:Z

    .line 6
    .line 7
    iget-object v1, p0, Lzn1;->v:Lr61;

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
    invoke-virtual {v2}, Lr61;->H()Z

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
    iget-object v3, v2, Lr61;->R:Luh1;

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
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Lr61;->u()Lr61;

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
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-virtual {p0}, Lzn1;->b1()V

    .line 76
    .line 77
    .line 78
    iget-object p0, v1, Lr61;->M:Lvn1;

    .line 79
    .line 80
    iget-object p0, p0, Lvn1;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Lzn1;

    .line 83
    .line 84
    iget-object p0, p0, Lzn1;->x:Lzn1;

    .line 85
    .line 86
    return-object p0
.end method

.method public final j1(Lqk1;ZZ)V
    .locals 12

    .line 1
    iget-object v0, p0, Lzn1;->S:Lyv1;

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
    iget-boolean v4, p0, Lzn1;->z:Z

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
    invoke-virtual {p0}, Lzn1;->R0()J

    .line 20
    .line 21
    .line 22
    move-result-wide p2

    .line 23
    iget v4, p1, Lqk1;->a:F

    .line 24
    .line 25
    iget v6, p1, Lqk1;->b:F

    .line 26
    .line 27
    iget v7, p1, Lqk1;->c:F

    .line 28
    .line 29
    cmpg-float v7, v7, v5

    .line 30
    .line 31
    if-ltz v7, :cond_5

    .line 32
    .line 33
    iget-wide v7, p0, Lsz1;->j:J

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
    iget v9, p1, Lqk1;->d:F

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
    iget v9, p1, Lqk1;->c:F

    .line 72
    .line 73
    iget v10, p1, Lqk1;->a:F

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
    iget v7, p1, Lqk1;->d:F

    .line 95
    .line 96
    iget v9, p1, Lqk1;->b:F

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
    iget-wide v7, p0, Lsz1;->j:J

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
    invoke-virtual {p1, v4, v6, v8, p2}, Lqk1;->a(FFFF)V

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_6
    if-eqz p2, :cond_7

    .line 201
    .line 202
    iget-wide p2, p0, Lsz1;->j:J

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
    invoke-virtual {p1, v5, v5, v4, p2}, Lqk1;->a(FFFF)V

    .line 212
    .line 213
    .line 214
    :cond_7
    :goto_4
    invoke-virtual {p1}, Lqk1;->b()Z

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
    check-cast v0, Lsq0;

    .line 222
    .line 223
    invoke-virtual {v0}, Lsq0;->b()[F

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    iget-boolean p3, v0, Lsq0;->z:Z

    .line 228
    .line 229
    if-nez p3, :cond_a

    .line 230
    .line 231
    if-nez p2, :cond_9

    .line 232
    .line 233
    iput v5, p1, Lqk1;->a:F

    .line 234
    .line 235
    iput v5, p1, Lqk1;->b:F

    .line 236
    .line 237
    iput v5, p1, Lqk1;->c:F

    .line 238
    .line 239
    iput v5, p1, Lqk1;->d:F

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_9
    invoke-static {p2, p1}, Lhf1;->c([FLqk1;)V

    .line 243
    .line 244
    .line 245
    :cond_a
    :goto_5
    iget-wide p2, p0, Lzn1;->G:J

    .line 246
    .line 247
    shr-long v0, p2, v1

    .line 248
    .line 249
    long-to-int p0, v0

    .line 250
    iget v0, p1, Lqk1;->a:F

    .line 251
    .line 252
    int-to-float p0, p0

    .line 253
    add-float/2addr v0, p0

    .line 254
    iput v0, p1, Lqk1;->a:F

    .line 255
    .line 256
    iget v0, p1, Lqk1;->c:F

    .line 257
    .line 258
    add-float/2addr v0, p0

    .line 259
    iput v0, p1, Lqk1;->c:F

    .line 260
    .line 261
    and-long/2addr p2, v2

    .line 262
    long-to-int p0, p2

    .line 263
    iget p2, p1, Lqk1;->b:F

    .line 264
    .line 265
    int-to-float p0, p0

    .line 266
    add-float/2addr p2, p0

    .line 267
    iput p2, p1, Lqk1;->b:F

    .line 268
    .line 269
    iget p2, p1, Lqk1;->d:F

    .line 270
    .line 271
    add-float/2addr p2, p0

    .line 272
    iput p2, p1, Lqk1;->d:F

    .line 273
    .line 274
    return-void
.end method

.method public final k1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lzn1;->S:Lyv1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v0, v1}, Lzn1;->r1(Lin0;Z)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lzn1;->v:Lr61;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lr61;->U(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final l1(Lof1;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lzn1;->E:Lof1;

    .line 6
    .line 7
    if-eq v1, v2, :cond_19

    .line 8
    .line 9
    iput-object v1, v0, Lzn1;->E:Lof1;

    .line 10
    .line 11
    iget-object v3, v0, Lzn1;->v:Lr61;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Lof1;->e()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    invoke-interface {v2}, Lof1;->e()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-ne v5, v6, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Lof1;->c()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-interface {v2}, Lof1;->c()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eq v5, v2, :cond_10

    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, Lof1;->e()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-interface {v1}, Lof1;->c()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    iget-object v6, v0, Lzn1;->S:Lyv1;

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
    check-cast v6, Lsq0;

    .line 61
    .line 62
    invoke-virtual {v6, v10, v11}, Lsq0;->e(J)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v3}, Lr61;->I()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    iget-object v6, v0, Lzn1;->x:Lzn1;

    .line 73
    .line 74
    if-eqz v6, :cond_2

    .line 75
    .line 76
    invoke-virtual {v6}, Lzn1;->Z0()V

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
    invoke-virtual {v0, v5, v6}, Lsz1;->g0(J)V

    .line 86
    .line 87
    .line 88
    iget-object v2, v0, Lzn1;->A:Lin0;

    .line 89
    .line 90
    if-eqz v2, :cond_3

    .line 91
    .line 92
    invoke-virtual {v0, v4}, Lzn1;->s1(Z)V

    .line 93
    .line 94
    .line 95
    :cond_3
    const/4 v2, 0x4

    .line 96
    invoke-static {v2}, Lao1;->g(I)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-virtual {v0}, Lzn1;->S0()Lth1;

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
    iget-object v6, v6, Lth1;->l:Lth1;

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
    invoke-virtual {v0, v5}, Lzn1;->U0(Z)Lth1;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    :goto_2
    if-eqz v5, :cond_e

    .line 118
    .line 119
    iget v7, v5, Lth1;->k:I

    .line 120
    .line 121
    and-int/2addr v7, v2

    .line 122
    if-eqz v7, :cond_e

    .line 123
    .line 124
    iget v7, v5, Lth1;->j:I

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
    instance-of v10, v8, Lmc0;

    .line 135
    .line 136
    if-eqz v10, :cond_6

    .line 137
    .line 138
    check-cast v8, Lmc0;

    .line 139
    .line 140
    invoke-interface {v8}, Lmc0;->r0()V

    .line 141
    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_6
    iget v10, v8, Lth1;->j:I

    .line 145
    .line 146
    and-int/2addr v10, v2

    .line 147
    if-eqz v10, :cond_c

    .line 148
    .line 149
    instance-of v10, v8, Lu60;

    .line 150
    .line 151
    if-eqz v10, :cond_c

    .line 152
    .line 153
    move-object v10, v8

    .line 154
    check-cast v10, Lu60;

    .line 155
    .line 156
    iget-object v10, v10, Lu60;->w:Lth1;

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
    iget v13, v10, Lth1;->j:I

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
    new-instance v9, Lzk1;

    .line 176
    .line 177
    const/16 v12, 0x10

    .line 178
    .line 179
    new-array v12, v12, [Lth1;

    .line 180
    .line 181
    invoke-direct {v9, v12}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    if-eqz v8, :cond_9

    .line 185
    .line 186
    invoke-virtual {v9, v8}, Lzk1;->b(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object v8, v7

    .line 190
    :cond_9
    invoke-virtual {v9, v10}, Lzk1;->b(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_a
    :goto_5
    iget-object v10, v10, Lth1;->m:Lth1;

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
    invoke-static {v9}, Lsp0;->m(Lzk1;)Lth1;

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
    iget-object v5, v5, Lth1;->m:Lth1;

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_e
    :goto_7
    iget-object v2, v3, Lr61;->u:Lzv1;

    .line 210
    .line 211
    if-eqz v2, :cond_f

    .line 212
    .line 213
    check-cast v2, Lb7;

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Lb7;->z(Lr61;)V

    .line 216
    .line 217
    .line 218
    :cond_f
    invoke-virtual {v3, v0}, Lr61;->N(Lzn1;)V

    .line 219
    .line 220
    .line 221
    :cond_10
    iget-object v2, v0, Lzn1;->F:Lgk1;

    .line 222
    .line 223
    if-eqz v2, :cond_11

    .line 224
    .line 225
    iget v2, v2, Lgk1;->e:I

    .line 226
    .line 227
    if-eqz v2, :cond_11

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_11
    invoke-interface {v1}, Lof1;->a()Ljava/util/Map;

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
    iget-object v2, v0, Lzn1;->F:Lgk1;

    .line 241
    .line 242
    invoke-interface {v1}, Lof1;->a()Ljava/util/Map;

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
    iget v6, v2, Lgk1;->e:I

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
    iget-object v6, v2, Lgk1;->b:[Ljava/lang/Object;

    .line 259
    .line 260
    iget-object v7, v2, Lgk1;->c:[I

    .line 261
    .line 262
    iget-object v2, v2, Lgk1;->a:[J

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
    check-cast v4, Ldu0;

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
    iget-object v2, v3, Lr61;->N:Lv61;

    .line 334
    .line 335
    iget-object v2, v2, Lv61;->p:Lmf1;

    .line 336
    .line 337
    iget-object v2, v2, Lmf1;->D:Ls61;

    .line 338
    .line 339
    invoke-virtual {v2}, Ls61;->f()V

    .line 340
    .line 341
    .line 342
    iget-object v2, v0, Lzn1;->F:Lgk1;

    .line 343
    .line 344
    if-nez v2, :cond_15

    .line 345
    .line 346
    sget-object v2, Lhs1;->a:Lgk1;

    .line 347
    .line 348
    new-instance v2, Lgk1;

    .line 349
    .line 350
    invoke-direct {v2}, Lgk1;-><init>()V

    .line 351
    .line 352
    .line 353
    iput-object v2, v0, Lzn1;->F:Lgk1;

    .line 354
    .line 355
    :cond_15
    invoke-virtual {v2}, Lgk1;->a()V

    .line 356
    .line 357
    .line 358
    invoke-interface {v1}, Lof1;->a()Ljava/util/Map;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_19

    .line 375
    .line 376
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    check-cast v1, Ljava/util/Map$Entry;

    .line 381
    .line 382
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    check-cast v1, Ljava/lang/Number;

    .line 391
    .line 392
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    invoke-virtual {v2, v1, v3}, Lgk1;->g(ILjava/lang/Object;)V

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

.method public final m()F
    .locals 0

    .line 1
    iget-object p0, p0, Lzn1;->v:Lr61;

    .line 2
    .line 3
    iget-object p0, p0, Lr61;->F:Le70;

    .line 4
    .line 5
    invoke-interface {p0}, Le70;->m()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final m1(Lth1;Lxn1;JLxs0;IZF)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    move-wide/from16 v3, p3

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move/from16 v6, p6

    .line 14
    .line 15
    move/from16 v7, p7

    .line 16
    .line 17
    invoke-virtual/range {v1 .. v7}, Lzn1;->Y0(Lxn1;JLxs0;IZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    move-object/from16 v2, p2

    .line 22
    .line 23
    invoke-interface {v2, v0}, Lxn1;->i(Lth1;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, Lxn1;->d()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, v1}, Lp7;->h(Lt60;I)Lth1;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object/from16 v0, p0

    .line 38
    .line 39
    move-wide/from16 v3, p3

    .line 40
    .line 41
    move-object/from16 v5, p5

    .line 42
    .line 43
    move/from16 v6, p6

    .line 44
    .line 45
    move/from16 v7, p7

    .line 46
    .line 47
    move/from16 v8, p8

    .line 48
    .line 49
    invoke-virtual/range {v0 .. v8}, Lzn1;->m1(Lth1;Lxn1;JLxs0;IZF)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    move-object/from16 v5, p5

    .line 54
    .line 55
    move/from16 v7, p7

    .line 56
    .line 57
    move/from16 v8, p8

    .line 58
    .line 59
    invoke-interface {v2, v0}, Lxn1;->b(Lth1;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_9

    .line 64
    .line 65
    iget-object v10, v5, Lxs0;->i:Lck1;

    .line 66
    .line 67
    iget-object v11, v5, Lxs0;->h:Llk1;

    .line 68
    .line 69
    iget v12, v5, Lxs0;->j:I

    .line 70
    .line 71
    iget v1, v11, Llk1;->b:I

    .line 72
    .line 73
    add-int/lit8 v3, v1, -0x1

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    if-ne v12, v3, :cond_6

    .line 77
    .line 78
    add-int/lit8 v13, v12, 0x1

    .line 79
    .line 80
    invoke-virtual {v5, v13, v1}, Lxs0;->b(II)V

    .line 81
    .line 82
    .line 83
    iget v1, v5, Lxs0;->j:I

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    iput v1, v5, Lxs0;->j:I

    .line 88
    .line 89
    invoke-virtual {v11, v0}, Llk1;->a(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v8, v7, v4}, Lqp0;->a(FZZ)J

    .line 93
    .line 94
    .line 95
    move-result-wide v3

    .line 96
    invoke-virtual {v10, v3, v4}, Lck1;->a(J)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v2}, Lxn1;->d()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-static {v0, v1}, Lp7;->h(Lt60;I)Lth1;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const/4 v9, 0x0

    .line 108
    move-object/from16 v0, p0

    .line 109
    .line 110
    move-wide/from16 v3, p3

    .line 111
    .line 112
    move/from16 v6, p6

    .line 113
    .line 114
    invoke-virtual/range {v0 .. v9}, Lzn1;->g1(Lth1;Lxn1;JLxs0;IZFZ)V

    .line 115
    .line 116
    .line 117
    iput v12, v5, Lxs0;->j:I

    .line 118
    .line 119
    iget v0, v11, Llk1;->b:I

    .line 120
    .line 121
    add-int/lit8 v0, v0, -0x1

    .line 122
    .line 123
    if-eq v13, v0, :cond_3

    .line 124
    .line 125
    invoke-virtual {v5}, Lxs0;->a()J

    .line 126
    .line 127
    .line 128
    move-result-wide v0

    .line 129
    invoke-static {v0, v1}, Lxe1;->N(J)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_2

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_2
    return-void

    .line 137
    :cond_3
    :goto_0
    iget v0, v5, Lxs0;->j:I

    .line 138
    .line 139
    add-int/lit8 v1, v0, 0x1

    .line 140
    .line 141
    invoke-virtual {v11, v1}, Llk1;->k(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    if-ltz v1, :cond_5

    .line 145
    .line 146
    iget v2, v10, Lck1;->b:I

    .line 147
    .line 148
    if-ge v1, v2, :cond_5

    .line 149
    .line 150
    iget-object v3, v10, Lck1;->a:[J

    .line 151
    .line 152
    aget-wide v4, v3, v1

    .line 153
    .line 154
    add-int/lit8 v4, v2, -0x1

    .line 155
    .line 156
    if-eq v1, v4, :cond_4

    .line 157
    .line 158
    add-int/lit8 v0, v0, 0x2

    .line 159
    .line 160
    invoke-static {v3, v3, v1, v0, v2}, Lmg;->b0([J[JIII)V

    .line 161
    .line 162
    .line 163
    :cond_4
    iget v0, v10, Lck1;->b:I

    .line 164
    .line 165
    add-int/lit8 v0, v0, -0x1

    .line 166
    .line 167
    iput v0, v10, Lck1;->b:I

    .line 168
    .line 169
    return-void

    .line 170
    :cond_5
    const-string v0, "Index must be between 0 and size"

    .line 171
    .line 172
    invoke-static {v0}, Ls;->d(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_6
    invoke-virtual {v5}, Lxs0;->a()J

    .line 177
    .line 178
    .line 179
    move-result-wide v12

    .line 180
    iget v14, v5, Lxs0;->j:I

    .line 181
    .line 182
    iget v1, v11, Llk1;->b:I

    .line 183
    .line 184
    add-int/lit8 v15, v1, -0x1

    .line 185
    .line 186
    iput v15, v5, Lxs0;->j:I

    .line 187
    .line 188
    iget v2, v11, Llk1;->b:I

    .line 189
    .line 190
    invoke-virtual {v5, v1, v2}, Lxs0;->b(II)V

    .line 191
    .line 192
    .line 193
    iget v1, v5, Lxs0;->j:I

    .line 194
    .line 195
    add-int/lit8 v1, v1, 0x1

    .line 196
    .line 197
    iput v1, v5, Lxs0;->j:I

    .line 198
    .line 199
    invoke-virtual {v11, v0}, Llk1;->a(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v8, v7, v4}, Lqp0;->a(FZZ)J

    .line 203
    .line 204
    .line 205
    move-result-wide v1

    .line 206
    invoke-virtual {v10, v1, v2}, Lck1;->a(J)V

    .line 207
    .line 208
    .line 209
    invoke-interface/range {p2 .. p2}, Lxn1;->d()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    invoke-static {v0, v1}, Lp7;->h(Lt60;I)Lth1;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const/4 v9, 0x0

    .line 218
    move-object/from16 v0, p0

    .line 219
    .line 220
    move-object/from16 v2, p2

    .line 221
    .line 222
    move-wide/from16 v3, p3

    .line 223
    .line 224
    move/from16 v6, p6

    .line 225
    .line 226
    invoke-virtual/range {v0 .. v9}, Lzn1;->g1(Lth1;Lxn1;JLxs0;IZFZ)V

    .line 227
    .line 228
    .line 229
    iput v15, v5, Lxs0;->j:I

    .line 230
    .line 231
    invoke-virtual {v5}, Lxs0;->a()J

    .line 232
    .line 233
    .line 234
    move-result-wide v0

    .line 235
    iget v2, v5, Lxs0;->j:I

    .line 236
    .line 237
    add-int/lit8 v2, v2, 0x1

    .line 238
    .line 239
    iget v3, v11, Llk1;->b:I

    .line 240
    .line 241
    add-int/lit8 v3, v3, -0x1

    .line 242
    .line 243
    if-ge v2, v3, :cond_8

    .line 244
    .line 245
    invoke-static {v12, v13, v0, v1}, Lxe1;->k(JJ)I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-lez v2, :cond_8

    .line 250
    .line 251
    add-int/lit8 v2, v14, 0x1

    .line 252
    .line 253
    invoke-static {v0, v1}, Lxe1;->N(J)Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    iget v1, v5, Lxs0;->j:I

    .line 258
    .line 259
    if-eqz v0, :cond_7

    .line 260
    .line 261
    add-int/lit8 v1, v1, 0x2

    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 265
    .line 266
    :goto_1
    invoke-virtual {v5, v2, v1}, Lxs0;->b(II)V

    .line 267
    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_8
    iget v0, v5, Lxs0;->j:I

    .line 271
    .line 272
    add-int/lit8 v0, v0, 0x1

    .line 273
    .line 274
    iget v1, v11, Llk1;->b:I

    .line 275
    .line 276
    invoke-virtual {v5, v0, v1}, Lxs0;->b(II)V

    .line 277
    .line 278
    .line 279
    :goto_2
    iput v14, v5, Lxs0;->j:I

    .line 280
    .line 281
    return-void

    .line 282
    :cond_9
    invoke-interface/range {p2 .. p2}, Lxn1;->d()I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    invoke-static {v0, v1}, Lp7;->h(Lt60;I)Lth1;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    const/4 v9, 0x0

    .line 291
    move-object/from16 v0, p0

    .line 292
    .line 293
    move-object/from16 v2, p2

    .line 294
    .line 295
    move-wide/from16 v3, p3

    .line 296
    .line 297
    move/from16 v6, p6

    .line 298
    .line 299
    move/from16 v7, p7

    .line 300
    .line 301
    move/from16 v8, p8

    .line 302
    .line 303
    invoke-virtual/range {v0 .. v9}, Lzn1;->g1(Lth1;Lxn1;JLxs0;IZFZ)V

    .line 304
    .line 305
    .line 306
    return-void
.end method

.method public final o1()Lo62;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lth1;->u:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-static {p0}, Ls11;->J(Lc61;)Lc61;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lzn1;->I:Lqk1;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    new-instance v1, Lqk1;

    .line 19
    .line 20
    invoke-direct {v1}, Lqk1;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lzn1;->I:Lqk1;

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Lzn1;->R0()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {p0, v2, v3}, Lzn1;->J0(J)J

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
    iput v5, v1, Lqk1;->a:F

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
    iput v3, v1, Lqk1;->b:F

    .line 58
    .line 59
    invoke-virtual {p0}, Lsz1;->b0()I

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
    iput v4, v1, Lqk1;->c:F

    .line 70
    .line 71
    invoke-virtual {p0}, Lsz1;->Z()I

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
    iput v2, v1, Lqk1;->d:F

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
    invoke-virtual {p0, v1, v2, v3}, Lzn1;->j1(Lqk1;ZZ)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Lqk1;->b()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_2

    .line 95
    .line 96
    :goto_1
    sget-object p0, Lo62;->e:Lo62;

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_2
    iget-object p0, p0, Lzn1;->x:Lzn1;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    new-instance p0, Lo62;

    .line 106
    .line 107
    iget v0, v1, Lqk1;->a:F

    .line 108
    .line 109
    iget v2, v1, Lqk1;->b:F

    .line 110
    .line 111
    iget v3, v1, Lqk1;->c:F

    .line 112
    .line 113
    iget v1, v1, Lqk1;->d:F

    .line 114
    .line 115
    invoke-direct {p0, v0, v2, v3, v1}, Lo62;-><init>(FFFF)V

    .line 116
    .line 117
    .line 118
    return-object p0
.end method

.method public final p1(Lzn1;[F)V
    .locals 5

    .line 1
    invoke-static {p1, p0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lzn1;->x:Lzn1;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lzn1;->p1(Lzn1;[F)V

    .line 13
    .line 14
    .line 15
    iget-wide v0, p0, Lzn1;->G:J

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    invoke-static {v0, v1, v2, v3}, Lz01;->a(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    sget-object p1, Lzn1;->V:[F

    .line 26
    .line 27
    invoke-static {p1}, Lhf1;->d([F)V

    .line 28
    .line 29
    .line 30
    iget-wide v0, p0, Lzn1;->G:J

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
    invoke-static {p1, v2, v0}, Lhf1;->f([FFF)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2, p1}, Lhf1;->e([F[F)V

    .line 52
    .line 53
    .line 54
    :cond_0
    iget-object p0, p0, Lzn1;->S:Lyv1;

    .line 55
    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    check-cast p0, Lsq0;

    .line 59
    .line 60
    invoke-virtual {p0}, Lsq0;->a()[F

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    invoke-static {p2, p0}, Lhf1;->e([F[F)V

    .line 67
    .line 68
    .line 69
    :cond_1
    return-void
.end method

.method public final q1(Lzn1;[F)V
    .locals 6

    .line 1
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lzn1;->S:Lyv1;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast v0, Lsq0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lsq0;->b()[F

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p2, v0}, Lhf1;->e([F[F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-wide v0, p0, Lzn1;->G:J

    .line 21
    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, Lz01;->a(JJ)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    sget-object v2, Lzn1;->V:[F

    .line 31
    .line 32
    invoke-static {v2}, Lhf1;->d([F)V

    .line 33
    .line 34
    .line 35
    const/16 v3, 0x20

    .line 36
    .line 37
    shr-long v3, v0, v3

    .line 38
    .line 39
    long-to-int v3, v3

    .line 40
    int-to-float v3, v3

    .line 41
    const-wide v4, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v0, v4

    .line 47
    long-to-int v0, v0

    .line 48
    int-to-float v0, v0

    .line 49
    invoke-static {v2, v3, v0}, Lhf1;->f([FFF)V

    .line 50
    .line 51
    .line 52
    invoke-static {p2, v2}, Lhf1;->e([F[F)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object p0, p0, Lzn1;->x:Lzn1;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void
.end method

.method public final r(Lc61;J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lzn1;->D(Lc61;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public final r0()Lkd1;
    .locals 0

    .line 1
    iget-object p0, p0, Lzn1;->w:Lzn1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r1(Lin0;Z)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lzn1;->v:Lr61;

    .line 4
    .line 5
    if-nez p2, :cond_1

    .line 6
    .line 7
    iget-object p2, p0, Lzn1;->A:Lin0;

    .line 8
    .line 9
    if-ne p2, p1, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lzn1;->B:Le70;

    .line 12
    .line 13
    iget-object v3, v2, Lr61;->F:Le70;

    .line 14
    .line 15
    invoke-static {p2, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iget-object p2, p0, Lzn1;->C:Ld61;

    .line 22
    .line 23
    iget-object v3, v2, Lr61;->G:Ld61;

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
    iget-object v3, v2, Lr61;->F:Le70;

    .line 32
    .line 33
    iput-object v3, p0, Lzn1;->B:Le70;

    .line 34
    .line 35
    iget-object v3, v2, Lr61;->G:Ld61;

    .line 36
    .line 37
    iput-object v3, p0, Lzn1;->C:Ld61;

    .line 38
    .line 39
    invoke-virtual {v2}, Lr61;->H()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object v9, p0, Lzn1;->Q:Lyn1;

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
    iput-object p1, p0, Lzn1;->A:Lin0;

    .line 51
    .line 52
    iget-object p1, p0, Lzn1;->S:Lyv1;

    .line 53
    .line 54
    if-nez p1, :cond_b

    .line 55
    .line 56
    invoke-static {v2}, Lu61;->a(Lr61;)Lzv1;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object p2, p0, Lzn1;->P:Lv7;

    .line 61
    .line 62
    if-nez p2, :cond_2

    .line 63
    .line 64
    new-instance p2, Lyn1;

    .line 65
    .line 66
    invoke-direct {p2, p0, v0}, Lyn1;-><init>(Lzn1;I)V

    .line 67
    .line 68
    .line 69
    new-instance v3, Lv7;

    .line 70
    .line 71
    const/4 v5, 0x2

    .line 72
    invoke-direct {v3, v5, p0, p2}, Lv7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-object v3, p0, Lzn1;->P:Lv7;

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
    check-cast v7, Lb7;

    .line 82
    .line 83
    iget-object p1, v7, Lb7;->F0:Ldq1;

    .line 84
    .line 85
    :cond_3
    iget-object p2, p1, Ldq1;->j:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/ref/ReferenceQueue;

    .line 88
    .line 89
    iget-object v3, p1, Ldq1;->i:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, Lzk1;

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
    invoke-virtual {v3, p2}, Lzk1;->j(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :cond_4
    if-nez p2, :cond_3

    .line 103
    .line 104
    :cond_5
    iget p1, v3, Lzk1;->j:I

    .line 105
    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    add-int/lit8 p1, p1, -0x1

    .line 109
    .line 110
    invoke-virtual {v3, p1}, Lzk1;->k(I)Ljava/lang/Object;

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
    check-cast p1, Lyv1;

    .line 125
    .line 126
    if-eqz p1, :cond_a

    .line 127
    .line 128
    move-object p2, p1

    .line 129
    check-cast p2, Lsq0;

    .line 130
    .line 131
    iget-object v3, p2, Lsq0;->i:Lnq0;

    .line 132
    .line 133
    if-eqz v3, :cond_9

    .line 134
    .line 135
    iget-object v5, p2, Lsq0;->h:Lpq0;

    .line 136
    .line 137
    iget-boolean v5, v5, Lpq0;->s:Z

    .line 138
    .line 139
    if-nez v5, :cond_7

    .line 140
    .line 141
    const-string v5, "layer should have been released before reuse"

    .line 142
    .line 143
    invoke-static {v5}, Lkz0;->a(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_7
    invoke-interface {v3}, Lnq0;->b()Lpq0;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    iput-object v3, p2, Lsq0;->h:Lpq0;

    .line 151
    .line 152
    iput-boolean v0, p2, Lsq0;->n:Z

    .line 153
    .line 154
    iput-object v8, p2, Lsq0;->k:Lmn0;

    .line 155
    .line 156
    iput-object v9, p2, Lsq0;->l:Lxm0;

    .line 157
    .line 158
    iput-boolean v0, p2, Lsq0;->x:Z

    .line 159
    .line 160
    iput-boolean v0, p2, Lsq0;->y:Z

    .line 161
    .line 162
    iput-boolean v1, p2, Lsq0;->z:Z

    .line 163
    .line 164
    iget-object v3, p2, Lsq0;->o:[F

    .line 165
    .line 166
    invoke-static {v3}, Lhf1;->d([F)V

    .line 167
    .line 168
    .line 169
    iget-object v3, p2, Lsq0;->p:[F

    .line 170
    .line 171
    if-eqz v3, :cond_8

    .line 172
    .line 173
    invoke-static {v3}, Lhf1;->d([F)V

    .line 174
    .line 175
    .line 176
    :cond_8
    sget-wide v5, Lm33;->b:J

    .line 177
    .line 178
    iput-wide v5, p2, Lsq0;->v:J

    .line 179
    .line 180
    iput-boolean v0, p2, Lsq0;->A:Z

    .line 181
    .line 182
    const-wide v5, 0x7fffffff7fffffffL

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    iput-wide v5, p2, Lsq0;->m:J

    .line 188
    .line 189
    iput-object v4, p2, Lsq0;->w:Lte;

    .line 190
    .line 191
    iput v0, p2, Lsq0;->u:I

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_9
    const-string p0, "currently reuse is only supported when we manage the layer lifecycle"

    .line 195
    .line 196
    invoke-static {p0}, Lvi0;->e(Ljava/lang/String;)Lpv;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    throw p0

    .line 201
    :cond_a
    new-instance v4, Lsq0;

    .line 202
    .line 203
    invoke-virtual {v7}, Lb7;->getGraphicsContext()Lnq0;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-interface {p1}, Lnq0;->b()Lpq0;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-virtual {v7}, Lb7;->getGraphicsContext()Lnq0;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-direct/range {v4 .. v9}, Lsq0;-><init>(Lpq0;Lnq0;Lb7;Lmn0;Lxm0;)V

    .line 216
    .line 217
    .line 218
    move-object p1, v4

    .line 219
    :goto_4
    iget-wide v3, p0, Lsz1;->j:J

    .line 220
    .line 221
    move-object p2, p1

    .line 222
    check-cast p2, Lsq0;

    .line 223
    .line 224
    invoke-virtual {p2, v3, v4}, Lsq0;->e(J)V

    .line 225
    .line 226
    .line 227
    iget-wide v3, p0, Lzn1;->G:J

    .line 228
    .line 229
    invoke-virtual {p2, v3, v4}, Lsq0;->d(J)V

    .line 230
    .line 231
    .line 232
    iput-object p1, p0, Lzn1;->S:Lyv1;

    .line 233
    .line 234
    invoke-virtual {p0, v1}, Lzn1;->s1(Z)V

    .line 235
    .line 236
    .line 237
    iput-boolean v1, v2, Lr61;->Q:Z

    .line 238
    .line 239
    invoke-virtual {v9}, Lyn1;->a()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_b
    if-eqz p2, :cond_c

    .line 244
    .line 245
    invoke-virtual {p0, v1}, Lzn1;->s1(Z)V

    .line 246
    .line 247
    .line 248
    :cond_c
    return-void

    .line 249
    :cond_d
    iput-object v4, p0, Lzn1;->A:Lin0;

    .line 250
    .line 251
    iget-object p1, p0, Lzn1;->S:Lyv1;

    .line 252
    .line 253
    if-eqz p1, :cond_12

    .line 254
    .line 255
    check-cast p1, Lsq0;

    .line 256
    .line 257
    invoke-virtual {p1}, Lsq0;->b()[F

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-static {p2}, Lp7;->y([F)Z

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    if-nez p2, :cond_e

    .line 266
    .line 267
    invoke-virtual {v2, p0}, Lr61;->N(Lzn1;)V

    .line 268
    .line 269
    .line 270
    :cond_e
    iput-object v4, p1, Lsq0;->k:Lmn0;

    .line 271
    .line 272
    iput-object v4, p1, Lsq0;->l:Lxm0;

    .line 273
    .line 274
    iput-boolean v1, p1, Lsq0;->n:Z

    .line 275
    .line 276
    invoke-virtual {p1, v0}, Lsq0;->f(Z)V

    .line 277
    .line 278
    .line 279
    iget-object p2, p1, Lsq0;->i:Lnq0;

    .line 280
    .line 281
    if-eqz p2, :cond_11

    .line 282
    .line 283
    iget-object v3, p1, Lsq0;->h:Lpq0;

    .line 284
    .line 285
    invoke-interface {p2, v3}, Lnq0;->a(Lpq0;)V

    .line 286
    .line 287
    .line 288
    iget-object p2, p1, Lsq0;->j:Lb7;

    .line 289
    .line 290
    iget-object v3, p2, Lb7;->F0:Ldq1;

    .line 291
    .line 292
    :cond_f
    iget-object v5, v3, Ldq1;->j:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v5, Ljava/lang/ref/ReferenceQueue;

    .line 295
    .line 296
    iget-object v6, v3, Ldq1;->i:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v6, Lzk1;

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
    invoke-virtual {v6, v5}, Lzk1;->j(Ljava/lang/Object;)Z

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
    iget-object v3, v3, Ldq1;->j:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v3, Ljava/lang/ref/ReferenceQueue;

    .line 316
    .line 317
    invoke-direct {v5, p1, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v6, v5}, Lzk1;->b(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    iget-object p2, p2, Lb7;->L:Llk1;

    .line 324
    .line 325
    invoke-virtual {p2, p1}, Llk1;->j(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    :cond_11
    iput-object v4, p0, Lzn1;->S:Lyv1;

    .line 329
    .line 330
    iput-boolean v1, v2, Lr61;->Q:Z

    .line 331
    .line 332
    invoke-virtual {v9}, Lyn1;->a()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    iget-boolean p1, p1, Lth1;->u:Z

    .line 340
    .line 341
    if-eqz p1, :cond_12

    .line 342
    .line 343
    invoke-virtual {v2}, Lr61;->I()Z

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    if-eqz p1, :cond_12

    .line 348
    .line 349
    iget-object p1, v2, Lr61;->u:Lzv1;

    .line 350
    .line 351
    if-eqz p1, :cond_12

    .line 352
    .line 353
    check-cast p1, Lb7;

    .line 354
    .line 355
    invoke-virtual {p1, v2}, Lb7;->z(Lr61;)V

    .line 356
    .line 357
    .line 358
    :cond_12
    iput-boolean v0, p0, Lzn1;->R:Z

    .line 359
    .line 360
    return-void
.end method

.method public final s(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lth1;->u:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lzn1;->v:Lr61;

    .line 15
    .line 16
    invoke-static {v0}, Lu61;->a(Lr61;)Lzv1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lb7;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Lb7;->H(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    invoke-static {p0}, Ls11;->J(Lc61;)Lc61;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0, p1, p2}, Lzn1;->D(Lc61;J)J

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    return-wide p0
.end method

.method public final s1(Z)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lzn1;->S:Lyv1;

    .line 4
    .line 5
    iget-object v2, v0, Lzn1;->A:Lin0;

    .line 6
    .line 7
    if-eqz v1, :cond_33

    .line 8
    .line 9
    if-eqz v2, :cond_32

    .line 10
    .line 11
    sget-object v3, Lzn1;->T:Lca2;

    .line 12
    .line 13
    invoke-virtual {v3}, Lca2;->a()V

    .line 14
    .line 15
    .line 16
    iget-object v4, v0, Lzn1;->v:Lr61;

    .line 17
    .line 18
    iget-object v5, v4, Lr61;->F:Le70;

    .line 19
    .line 20
    iput-object v5, v3, Lca2;->x:Le70;

    .line 21
    .line 22
    iget-object v5, v4, Lr61;->G:Ld61;

    .line 23
    .line 24
    iput-object v5, v3, Lca2;->y:Ld61;

    .line 25
    .line 26
    iget-wide v5, v0, Lsz1;->j:J

    .line 27
    .line 28
    invoke-static {v5, v6}, Ls11;->q0(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    iput-wide v5, v3, Lca2;->w:J

    .line 33
    .line 34
    invoke-static {v4}, Lu61;->a(Lr61;)Lzv1;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Lb7;

    .line 39
    .line 40
    invoke-virtual {v5}, Lb7;->getSnapshotObserver()Lbw1;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    sget-object v6, Loq0;->n:Loq0;

    .line 45
    .line 46
    new-instance v7, Lt6;

    .line 47
    .line 48
    const/16 v8, 0x9

    .line 49
    .line 50
    invoke-direct {v7, v8, v2, v0}, Lt6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v2, v5, Lbw1;->a:Lts2;

    .line 54
    .line 55
    invoke-virtual {v2, v0, v6, v7}, Lts2;->c(Ljava/lang/Object;Lin0;Lxm0;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, v0, Lzn1;->J:Lz51;

    .line 59
    .line 60
    if-nez v2, :cond_0

    .line 61
    .line 62
    new-instance v2, Lz51;

    .line 63
    .line 64
    invoke-direct {v2}, Lz51;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v2, v0, Lzn1;->J:Lz51;

    .line 68
    .line 69
    :cond_0
    sget-object v5, Lzn1;->U:Lz51;

    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget v6, v2, Lz51;->a:F

    .line 75
    .line 76
    iput v6, v5, Lz51;->a:F

    .line 77
    .line 78
    iget v6, v2, Lz51;->b:F

    .line 79
    .line 80
    iput v6, v5, Lz51;->b:F

    .line 81
    .line 82
    iget v6, v2, Lz51;->c:F

    .line 83
    .line 84
    iput v6, v5, Lz51;->c:F

    .line 85
    .line 86
    iget v6, v2, Lz51;->d:F

    .line 87
    .line 88
    iput v6, v5, Lz51;->d:F

    .line 89
    .line 90
    iget v6, v2, Lz51;->e:F

    .line 91
    .line 92
    iput v6, v5, Lz51;->e:F

    .line 93
    .line 94
    iget v6, v2, Lz51;->f:F

    .line 95
    .line 96
    iput v6, v5, Lz51;->f:F

    .line 97
    .line 98
    iget v6, v2, Lz51;->g:F

    .line 99
    .line 100
    iput v6, v5, Lz51;->g:F

    .line 101
    .line 102
    iget-wide v6, v2, Lz51;->h:J

    .line 103
    .line 104
    iput-wide v6, v5, Lz51;->h:J

    .line 105
    .line 106
    iget v6, v3, Lca2;->i:F

    .line 107
    .line 108
    iput v6, v2, Lz51;->a:F

    .line 109
    .line 110
    iget v7, v3, Lca2;->j:F

    .line 111
    .line 112
    iput v7, v2, Lz51;->b:F

    .line 113
    .line 114
    iget v7, v3, Lca2;->l:F

    .line 115
    .line 116
    iput v7, v2, Lz51;->c:F

    .line 117
    .line 118
    iget v7, v3, Lca2;->p:F

    .line 119
    .line 120
    iput v7, v2, Lz51;->d:F

    .line 121
    .line 122
    iget v7, v3, Lca2;->q:F

    .line 123
    .line 124
    iput v7, v2, Lz51;->e:F

    .line 125
    .line 126
    iget v7, v3, Lca2;->r:F

    .line 127
    .line 128
    iput v7, v2, Lz51;->f:F

    .line 129
    .line 130
    iget v7, v3, Lca2;->s:F

    .line 131
    .line 132
    iput v7, v2, Lz51;->g:F

    .line 133
    .line 134
    iget-wide v7, v3, Lca2;->t:J

    .line 135
    .line 136
    iput-wide v7, v2, Lz51;->h:J

    .line 137
    .line 138
    check-cast v1, Lsq0;

    .line 139
    .line 140
    iget-object v9, v1, Lsq0;->j:Lb7;

    .line 141
    .line 142
    iget v10, v3, Lca2;->h:I

    .line 143
    .line 144
    iget v11, v1, Lsq0;->u:I

    .line 145
    .line 146
    or-int/2addr v10, v11

    .line 147
    iget-object v11, v3, Lca2;->y:Ld61;

    .line 148
    .line 149
    iput-object v11, v1, Lsq0;->s:Ld61;

    .line 150
    .line 151
    iget-object v11, v3, Lca2;->x:Le70;

    .line 152
    .line 153
    iput-object v11, v1, Lsq0;->r:Le70;

    .line 154
    .line 155
    and-int/lit16 v11, v10, 0x1000

    .line 156
    .line 157
    if-eqz v11, :cond_1

    .line 158
    .line 159
    iput-wide v7, v1, Lsq0;->v:J

    .line 160
    .line 161
    :cond_1
    and-int/lit8 v7, v10, 0x1

    .line 162
    .line 163
    if-eqz v7, :cond_3

    .line 164
    .line 165
    iget-object v7, v1, Lsq0;->h:Lpq0;

    .line 166
    .line 167
    iget-object v7, v7, Lpq0;->a:Lrq0;

    .line 168
    .line 169
    invoke-interface {v7}, Lrq0;->d()F

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    cmpg-float v8, v8, v6

    .line 174
    .line 175
    if-nez v8, :cond_2

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_2
    invoke-interface {v7, v6}, Lrq0;->m(F)V

    .line 179
    .line 180
    .line 181
    :cond_3
    :goto_0
    and-int/lit8 v6, v10, 0x2

    .line 182
    .line 183
    if-eqz v6, :cond_5

    .line 184
    .line 185
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 186
    .line 187
    iget v7, v3, Lca2;->j:F

    .line 188
    .line 189
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 190
    .line 191
    invoke-interface {v6}, Lrq0;->H()F

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    cmpg-float v8, v8, v7

    .line 196
    .line 197
    if-nez v8, :cond_4

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_4
    invoke-interface {v6, v7}, Lrq0;->A(F)V

    .line 201
    .line 202
    .line 203
    :cond_5
    :goto_1
    and-int/lit8 v6, v10, 0x4

    .line 204
    .line 205
    if-eqz v6, :cond_7

    .line 206
    .line 207
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 208
    .line 209
    iget v7, v3, Lca2;->k:F

    .line 210
    .line 211
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 212
    .line 213
    invoke-interface {v6}, Lrq0;->a()F

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    cmpg-float v8, v8, v7

    .line 218
    .line 219
    if-nez v8, :cond_6

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_6
    invoke-interface {v6, v7}, Lrq0;->c(F)V

    .line 223
    .line 224
    .line 225
    :cond_7
    :goto_2
    and-int/lit8 v6, v10, 0x8

    .line 226
    .line 227
    const/4 v7, 0x0

    .line 228
    if-eqz v6, :cond_9

    .line 229
    .line 230
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 231
    .line 232
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 233
    .line 234
    invoke-interface {v6}, Lrq0;->q()F

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    cmpg-float v8, v8, v7

    .line 239
    .line 240
    if-nez v8, :cond_8

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_8
    invoke-interface {v6}, Lrq0;->r()V

    .line 244
    .line 245
    .line 246
    :cond_9
    :goto_3
    and-int/lit8 v6, v10, 0x10

    .line 247
    .line 248
    if-eqz v6, :cond_b

    .line 249
    .line 250
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 251
    .line 252
    iget v8, v3, Lca2;->l:F

    .line 253
    .line 254
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 255
    .line 256
    invoke-interface {v6}, Lrq0;->f()F

    .line 257
    .line 258
    .line 259
    move-result v12

    .line 260
    cmpg-float v12, v12, v8

    .line 261
    .line 262
    if-nez v12, :cond_a

    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_a
    invoke-interface {v6, v8}, Lrq0;->h(F)V

    .line 266
    .line 267
    .line 268
    :cond_b
    :goto_4
    and-int/lit8 v6, v10, 0x20

    .line 269
    .line 270
    const/4 v8, 0x1

    .line 271
    if-eqz v6, :cond_d

    .line 272
    .line 273
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 274
    .line 275
    iget v12, v3, Lca2;->m:F

    .line 276
    .line 277
    iget-object v13, v6, Lpq0;->a:Lrq0;

    .line 278
    .line 279
    invoke-interface {v13}, Lrq0;->F()F

    .line 280
    .line 281
    .line 282
    move-result v14

    .line 283
    cmpg-float v14, v14, v12

    .line 284
    .line 285
    if-nez v14, :cond_c

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_c
    invoke-interface {v13, v12}, Lrq0;->e(F)V

    .line 289
    .line 290
    .line 291
    iput-boolean v8, v6, Lpq0;->g:Z

    .line 292
    .line 293
    invoke-virtual {v6}, Lpq0;->a()V

    .line 294
    .line 295
    .line 296
    :goto_5
    iget v6, v3, Lca2;->m:F

    .line 297
    .line 298
    cmpl-float v6, v6, v7

    .line 299
    .line 300
    if-lez v6, :cond_d

    .line 301
    .line 302
    iget-boolean v6, v1, Lsq0;->A:Z

    .line 303
    .line 304
    if-nez v6, :cond_d

    .line 305
    .line 306
    iget-object v6, v1, Lsq0;->l:Lxm0;

    .line 307
    .line 308
    if-eqz v6, :cond_d

    .line 309
    .line 310
    invoke-interface {v6}, Lxm0;->a()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    :cond_d
    and-int/lit8 v6, v10, 0x40

    .line 314
    .line 315
    if-eqz v6, :cond_e

    .line 316
    .line 317
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 318
    .line 319
    iget-wide v12, v3, Lca2;->n:J

    .line 320
    .line 321
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 322
    .line 323
    invoke-interface {v6}, Lrq0;->M()J

    .line 324
    .line 325
    .line 326
    move-result-wide v14

    .line 327
    invoke-static {v12, v13, v14, v15}, Lju;->c(JJ)Z

    .line 328
    .line 329
    .line 330
    move-result v14

    .line 331
    if-nez v14, :cond_e

    .line 332
    .line 333
    invoke-interface {v6, v12, v13}, Lrq0;->j(J)V

    .line 334
    .line 335
    .line 336
    :cond_e
    and-int/lit16 v6, v10, 0x80

    .line 337
    .line 338
    if-eqz v6, :cond_f

    .line 339
    .line 340
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 341
    .line 342
    iget-wide v12, v3, Lca2;->o:J

    .line 343
    .line 344
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 345
    .line 346
    invoke-interface {v6}, Lrq0;->i()J

    .line 347
    .line 348
    .line 349
    move-result-wide v14

    .line 350
    invoke-static {v12, v13, v14, v15}, Lju;->c(JJ)Z

    .line 351
    .line 352
    .line 353
    move-result v14

    .line 354
    if-nez v14, :cond_f

    .line 355
    .line 356
    invoke-interface {v6, v12, v13}, Lrq0;->z(J)V

    .line 357
    .line 358
    .line 359
    :cond_f
    and-int/lit16 v6, v10, 0x400

    .line 360
    .line 361
    if-eqz v6, :cond_11

    .line 362
    .line 363
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 364
    .line 365
    iget v12, v3, Lca2;->r:F

    .line 366
    .line 367
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 368
    .line 369
    invoke-interface {v6}, Lrq0;->J()F

    .line 370
    .line 371
    .line 372
    move-result v13

    .line 373
    cmpg-float v13, v13, v12

    .line 374
    .line 375
    if-nez v13, :cond_10

    .line 376
    .line 377
    goto :goto_6

    .line 378
    :cond_10
    invoke-interface {v6, v12}, Lrq0;->g(F)V

    .line 379
    .line 380
    .line 381
    :cond_11
    :goto_6
    and-int/lit16 v6, v10, 0x100

    .line 382
    .line 383
    if-eqz v6, :cond_13

    .line 384
    .line 385
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 386
    .line 387
    iget v12, v3, Lca2;->p:F

    .line 388
    .line 389
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 390
    .line 391
    invoke-interface {v6}, Lrq0;->v()F

    .line 392
    .line 393
    .line 394
    move-result v13

    .line 395
    cmpg-float v13, v13, v12

    .line 396
    .line 397
    if-nez v13, :cond_12

    .line 398
    .line 399
    goto :goto_7

    .line 400
    :cond_12
    invoke-interface {v6, v12}, Lrq0;->I(F)V

    .line 401
    .line 402
    .line 403
    :cond_13
    :goto_7
    and-int/lit16 v6, v10, 0x200

    .line 404
    .line 405
    if-eqz v6, :cond_15

    .line 406
    .line 407
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 408
    .line 409
    iget v12, v3, Lca2;->q:F

    .line 410
    .line 411
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 412
    .line 413
    invoke-interface {v6}, Lrq0;->D()F

    .line 414
    .line 415
    .line 416
    move-result v13

    .line 417
    cmpg-float v13, v13, v12

    .line 418
    .line 419
    if-nez v13, :cond_14

    .line 420
    .line 421
    goto :goto_8

    .line 422
    :cond_14
    invoke-interface {v6, v12}, Lrq0;->b(F)V

    .line 423
    .line 424
    .line 425
    :cond_15
    :goto_8
    and-int/lit16 v6, v10, 0x800

    .line 426
    .line 427
    if-eqz v6, :cond_17

    .line 428
    .line 429
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 430
    .line 431
    iget v12, v3, Lca2;->s:F

    .line 432
    .line 433
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 434
    .line 435
    invoke-interface {v6}, Lrq0;->o()F

    .line 436
    .line 437
    .line 438
    move-result v13

    .line 439
    cmpg-float v13, v13, v12

    .line 440
    .line 441
    if-nez v13, :cond_16

    .line 442
    .line 443
    goto :goto_9

    .line 444
    :cond_16
    invoke-interface {v6, v12}, Lrq0;->E(F)V

    .line 445
    .line 446
    .line 447
    :cond_17
    :goto_9
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    const-wide v16, 0xffffffffL

    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    if-eqz v11, :cond_19

    .line 458
    .line 459
    iget-wide v12, v1, Lsq0;->v:J

    .line 460
    .line 461
    const/16 v18, 0x20

    .line 462
    .line 463
    sget-wide v6, Lm33;->b:J

    .line 464
    .line 465
    invoke-static {v12, v13, v6, v7}, Lm33;->a(JJ)Z

    .line 466
    .line 467
    .line 468
    move-result v6

    .line 469
    iget-object v7, v1, Lsq0;->h:Lpq0;

    .line 470
    .line 471
    if-eqz v6, :cond_18

    .line 472
    .line 473
    iget-wide v12, v7, Lpq0;->v:J

    .line 474
    .line 475
    invoke-static {v12, v13, v14, v15}, Lrs1;->b(JJ)Z

    .line 476
    .line 477
    .line 478
    move-result v6

    .line 479
    if-nez v6, :cond_1a

    .line 480
    .line 481
    iput-wide v14, v7, Lpq0;->v:J

    .line 482
    .line 483
    iget-object v6, v7, Lpq0;->a:Lrq0;

    .line 484
    .line 485
    invoke-interface {v6, v14, v15}, Lrq0;->L(J)V

    .line 486
    .line 487
    .line 488
    goto :goto_a

    .line 489
    :cond_18
    iget-wide v12, v1, Lsq0;->v:J

    .line 490
    .line 491
    shr-long v12, v12, v18

    .line 492
    .line 493
    long-to-int v6, v12

    .line 494
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    iget-wide v12, v1, Lsq0;->m:J

    .line 499
    .line 500
    shr-long v12, v12, v18

    .line 501
    .line 502
    long-to-int v12, v12

    .line 503
    int-to-float v12, v12

    .line 504
    mul-float/2addr v6, v12

    .line 505
    iget-wide v12, v1, Lsq0;->v:J

    .line 506
    .line 507
    and-long v12, v12, v16

    .line 508
    .line 509
    long-to-int v12, v12

    .line 510
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 511
    .line 512
    .line 513
    move-result v12

    .line 514
    move/from16 v19, v12

    .line 515
    .line 516
    iget-wide v11, v1, Lsq0;->m:J

    .line 517
    .line 518
    and-long v11, v11, v16

    .line 519
    .line 520
    long-to-int v11, v11

    .line 521
    int-to-float v11, v11

    .line 522
    mul-float v12, v19, v11

    .line 523
    .line 524
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 525
    .line 526
    .line 527
    move-result v6

    .line 528
    int-to-long v13, v6

    .line 529
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 530
    .line 531
    .line 532
    move-result v6

    .line 533
    int-to-long v11, v6

    .line 534
    shl-long v13, v13, v18

    .line 535
    .line 536
    and-long v11, v11, v16

    .line 537
    .line 538
    or-long/2addr v11, v13

    .line 539
    iget-wide v13, v7, Lpq0;->v:J

    .line 540
    .line 541
    invoke-static {v13, v14, v11, v12}, Lrs1;->b(JJ)Z

    .line 542
    .line 543
    .line 544
    move-result v6

    .line 545
    if-nez v6, :cond_1a

    .line 546
    .line 547
    iput-wide v11, v7, Lpq0;->v:J

    .line 548
    .line 549
    iget-object v6, v7, Lpq0;->a:Lrq0;

    .line 550
    .line 551
    invoke-interface {v6, v11, v12}, Lrq0;->L(J)V

    .line 552
    .line 553
    .line 554
    goto :goto_a

    .line 555
    :cond_19
    const/16 v18, 0x20

    .line 556
    .line 557
    :cond_1a
    :goto_a
    and-int/lit16 v6, v10, 0x4000

    .line 558
    .line 559
    if-eqz v6, :cond_1b

    .line 560
    .line 561
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 562
    .line 563
    iget-boolean v7, v3, Lca2;->v:Z

    .line 564
    .line 565
    iget-boolean v11, v6, Lpq0;->w:Z

    .line 566
    .line 567
    if-eq v11, v7, :cond_1b

    .line 568
    .line 569
    iput-boolean v7, v6, Lpq0;->w:Z

    .line 570
    .line 571
    iput-boolean v8, v6, Lpq0;->g:Z

    .line 572
    .line 573
    invoke-virtual {v6}, Lpq0;->a()V

    .line 574
    .line 575
    .line 576
    :cond_1b
    const/high16 v6, 0x20000

    .line 577
    .line 578
    and-int/2addr v6, v10

    .line 579
    if-eqz v6, :cond_1c

    .line 580
    .line 581
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 582
    .line 583
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 584
    .line 585
    :cond_1c
    const/high16 v6, 0x40000

    .line 586
    .line 587
    and-int/2addr v6, v10

    .line 588
    const/4 v7, 0x0

    .line 589
    if-eqz v6, :cond_1d

    .line 590
    .line 591
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 592
    .line 593
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 594
    .line 595
    invoke-interface {v6}, Lrq0;->x()Lcl;

    .line 596
    .line 597
    .line 598
    move-result-object v11

    .line 599
    invoke-static {v11, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v11

    .line 603
    if-nez v11, :cond_1d

    .line 604
    .line 605
    invoke-interface {v6}, Lrq0;->l()V

    .line 606
    .line 607
    .line 608
    :cond_1d
    const/high16 v6, 0x80000

    .line 609
    .line 610
    and-int/2addr v6, v10

    .line 611
    if-eqz v6, :cond_1f

    .line 612
    .line 613
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 614
    .line 615
    iget v11, v3, Lca2;->z:I

    .line 616
    .line 617
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 618
    .line 619
    invoke-interface {v6}, Lrq0;->K()I

    .line 620
    .line 621
    .line 622
    move-result v12

    .line 623
    if-ne v12, v11, :cond_1e

    .line 624
    .line 625
    goto :goto_b

    .line 626
    :cond_1e
    invoke-interface {v6, v11}, Lrq0;->n(I)V

    .line 627
    .line 628
    .line 629
    :cond_1f
    :goto_b
    const v6, 0x8000

    .line 630
    .line 631
    .line 632
    and-int/2addr v6, v10

    .line 633
    const/4 v12, 0x0

    .line 634
    if-eqz v6, :cond_21

    .line 635
    .line 636
    iget-object v6, v1, Lsq0;->h:Lpq0;

    .line 637
    .line 638
    iget-object v6, v6, Lpq0;->a:Lrq0;

    .line 639
    .line 640
    invoke-interface {v6}, Lrq0;->u()I

    .line 641
    .line 642
    .line 643
    move-result v11

    .line 644
    if-nez v11, :cond_20

    .line 645
    .line 646
    goto :goto_c

    .line 647
    :cond_20
    invoke-interface {v6, v12}, Lrq0;->y(I)V

    .line 648
    .line 649
    .line 650
    :cond_21
    :goto_c
    and-int/lit16 v6, v10, 0x1f1b

    .line 651
    .line 652
    if-eqz v6, :cond_22

    .line 653
    .line 654
    iput-boolean v8, v1, Lsq0;->x:Z

    .line 655
    .line 656
    iput-boolean v8, v1, Lsq0;->y:Z

    .line 657
    .line 658
    :cond_22
    iget-object v6, v1, Lsq0;->w:Lte;

    .line 659
    .line 660
    iget-object v11, v3, Lca2;->A:Lte;

    .line 661
    .line 662
    invoke-static {v6, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v6

    .line 666
    if-nez v6, :cond_2a

    .line 667
    .line 668
    iget-object v6, v3, Lca2;->A:Lte;

    .line 669
    .line 670
    iput-object v6, v1, Lsq0;->w:Lte;

    .line 671
    .line 672
    if-nez v6, :cond_23

    .line 673
    .line 674
    move-object/from16 v27, v9

    .line 675
    .line 676
    goto/16 :goto_e

    .line 677
    .line 678
    :cond_23
    iget-object v11, v1, Lsq0;->h:Lpq0;

    .line 679
    .line 680
    instance-of v13, v6, Ltv1;

    .line 681
    .line 682
    if-eqz v13, :cond_24

    .line 683
    .line 684
    move-object v13, v6

    .line 685
    check-cast v13, Ltv1;

    .line 686
    .line 687
    iget-object v13, v13, Ltv1;->j:Lo62;

    .line 688
    .line 689
    iget v14, v13, Lo62;->a:F

    .line 690
    .line 691
    iget v15, v13, Lo62;->b:F

    .line 692
    .line 693
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 694
    .line 695
    .line 696
    move-result v12

    .line 697
    move-object/from16 v27, v9

    .line 698
    .line 699
    int-to-long v8, v12

    .line 700
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 701
    .line 702
    .line 703
    move-result v12

    .line 704
    move-wide/from16 v19, v8

    .line 705
    .line 706
    int-to-long v7, v12

    .line 707
    shl-long v19, v19, v18

    .line 708
    .line 709
    and-long v7, v7, v16

    .line 710
    .line 711
    or-long v22, v19, v7

    .line 712
    .line 713
    iget v7, v13, Lo62;->c:F

    .line 714
    .line 715
    sub-float/2addr v7, v14

    .line 716
    iget v8, v13, Lo62;->d:F

    .line 717
    .line 718
    sub-float/2addr v8, v15

    .line 719
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 720
    .line 721
    .line 722
    move-result v7

    .line 723
    int-to-long v12, v7

    .line 724
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 725
    .line 726
    .line 727
    move-result v7

    .line 728
    int-to-long v7, v7

    .line 729
    shl-long v12, v12, v18

    .line 730
    .line 731
    and-long v7, v7, v16

    .line 732
    .line 733
    or-long v24, v12, v7

    .line 734
    .line 735
    const/16 v26, 0x0

    .line 736
    .line 737
    move-object/from16 v21, v11

    .line 738
    .line 739
    invoke-virtual/range {v21 .. v26}, Lpq0;->e(JJF)V

    .line 740
    .line 741
    .line 742
    goto/16 :goto_d

    .line 743
    .line 744
    :cond_24
    move-object/from16 v27, v9

    .line 745
    .line 746
    move-object v7, v11

    .line 747
    instance-of v8, v6, Lsv1;

    .line 748
    .line 749
    const-wide/16 v12, 0x0

    .line 750
    .line 751
    if-eqz v8, :cond_25

    .line 752
    .line 753
    move-object v8, v6

    .line 754
    check-cast v8, Lsv1;

    .line 755
    .line 756
    iget-object v8, v8, Lsv1;->j:Ly9;

    .line 757
    .line 758
    const/4 v9, 0x0

    .line 759
    iput-object v9, v7, Lpq0;->k:Lte;

    .line 760
    .line 761
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    iput-wide v14, v7, Lpq0;->i:J

    .line 767
    .line 768
    iput-wide v12, v7, Lpq0;->h:J

    .line 769
    .line 770
    const/4 v11, 0x0

    .line 771
    iput v11, v7, Lpq0;->j:F

    .line 772
    .line 773
    const/4 v9, 0x1

    .line 774
    iput-boolean v9, v7, Lpq0;->g:Z

    .line 775
    .line 776
    const/4 v9, 0x0

    .line 777
    iput-boolean v9, v7, Lpq0;->n:Z

    .line 778
    .line 779
    iput-object v8, v7, Lpq0;->l:Ly9;

    .line 780
    .line 781
    invoke-virtual {v7}, Lpq0;->a()V

    .line 782
    .line 783
    .line 784
    goto :goto_d

    .line 785
    :cond_25
    instance-of v8, v6, Luv1;

    .line 786
    .line 787
    if-eqz v8, :cond_29

    .line 788
    .line 789
    move-object v8, v6

    .line 790
    check-cast v8, Luv1;

    .line 791
    .line 792
    iget-object v9, v8, Luv1;->k:Ly9;

    .line 793
    .line 794
    if-eqz v9, :cond_26

    .line 795
    .line 796
    const/4 v14, 0x0

    .line 797
    iput-object v14, v7, Lpq0;->k:Lte;

    .line 798
    .line 799
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    iput-wide v14, v7, Lpq0;->i:J

    .line 805
    .line 806
    iput-wide v12, v7, Lpq0;->h:J

    .line 807
    .line 808
    const/4 v11, 0x0

    .line 809
    iput v11, v7, Lpq0;->j:F

    .line 810
    .line 811
    const/4 v8, 0x1

    .line 812
    iput-boolean v8, v7, Lpq0;->g:Z

    .line 813
    .line 814
    const/4 v12, 0x0

    .line 815
    iput-boolean v12, v7, Lpq0;->n:Z

    .line 816
    .line 817
    iput-object v9, v7, Lpq0;->l:Ly9;

    .line 818
    .line 819
    invoke-virtual {v7}, Lpq0;->a()V

    .line 820
    .line 821
    .line 822
    goto :goto_d

    .line 823
    :cond_26
    const/4 v12, 0x0

    .line 824
    iget-object v8, v8, Luv1;->j:Ldb2;

    .line 825
    .line 826
    iget v9, v8, Ldb2;->b:F

    .line 827
    .line 828
    iget v13, v8, Ldb2;->a:F

    .line 829
    .line 830
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 831
    .line 832
    .line 833
    move-result v14

    .line 834
    int-to-long v14, v14

    .line 835
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 836
    .line 837
    .line 838
    move-result v11

    .line 839
    move/from16 v19, v13

    .line 840
    .line 841
    int-to-long v12, v11

    .line 842
    shl-long v14, v14, v18

    .line 843
    .line 844
    and-long v11, v12, v16

    .line 845
    .line 846
    or-long v22, v14, v11

    .line 847
    .line 848
    iget v11, v8, Ldb2;->c:F

    .line 849
    .line 850
    sub-float v11, v11, v19

    .line 851
    .line 852
    iget v12, v8, Ldb2;->d:F

    .line 853
    .line 854
    sub-float/2addr v12, v9

    .line 855
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 856
    .line 857
    .line 858
    move-result v9

    .line 859
    int-to-long v13, v9

    .line 860
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 861
    .line 862
    .line 863
    move-result v9

    .line 864
    int-to-long v11, v9

    .line 865
    shl-long v13, v13, v18

    .line 866
    .line 867
    and-long v11, v11, v16

    .line 868
    .line 869
    or-long v24, v13, v11

    .line 870
    .line 871
    iget-wide v8, v8, Ldb2;->h:J

    .line 872
    .line 873
    shr-long v8, v8, v18

    .line 874
    .line 875
    long-to-int v8, v8

    .line 876
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 877
    .line 878
    .line 879
    move-result v26

    .line 880
    move-object/from16 v21, v7

    .line 881
    .line 882
    invoke-virtual/range {v21 .. v26}, Lpq0;->e(JJF)V

    .line 883
    .line 884
    .line 885
    :goto_d
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 886
    .line 887
    const/16 v8, 0x21

    .line 888
    .line 889
    if-ge v7, v8, :cond_28

    .line 890
    .line 891
    instance-of v7, v6, Lsv1;

    .line 892
    .line 893
    if-nez v7, :cond_27

    .line 894
    .line 895
    instance-of v7, v6, Luv1;

    .line 896
    .line 897
    if-eqz v7, :cond_28

    .line 898
    .line 899
    check-cast v6, Luv1;

    .line 900
    .line 901
    iget-object v6, v6, Luv1;->j:Ldb2;

    .line 902
    .line 903
    invoke-static {v6}, Lp7;->z(Ldb2;)Z

    .line 904
    .line 905
    .line 906
    move-result v6

    .line 907
    if-nez v6, :cond_28

    .line 908
    .line 909
    :cond_27
    iget-object v6, v1, Lsq0;->l:Lxm0;

    .line 910
    .line 911
    if-eqz v6, :cond_28

    .line 912
    .line 913
    invoke-interface {v6}, Lxm0;->a()Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    :cond_28
    :goto_e
    const/4 v9, 0x1

    .line 917
    goto :goto_f

    .line 918
    :cond_29
    invoke-static {}, Lc80;->s()V

    .line 919
    .line 920
    .line 921
    return-void

    .line 922
    :cond_2a
    move-object/from16 v27, v9

    .line 923
    .line 924
    const/4 v9, 0x0

    .line 925
    :goto_f
    iget v6, v3, Lca2;->h:I

    .line 926
    .line 927
    iput v6, v1, Lsq0;->u:I

    .line 928
    .line 929
    if-nez v10, :cond_2b

    .line 930
    .line 931
    if-eqz v9, :cond_2d

    .line 932
    .line 933
    :cond_2b
    invoke-virtual/range {v27 .. v27}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    if-eqz v1, :cond_2c

    .line 938
    .line 939
    move-object/from16 v6, v27

    .line 940
    .line 941
    invoke-interface {v1, v6, v6}, Landroid/view/ViewParent;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    .line 942
    .line 943
    .line 944
    goto :goto_10

    .line 945
    :cond_2c
    move-object/from16 v6, v27

    .line 946
    .line 947
    :goto_10
    invoke-static {}, Lb7;->p()Z

    .line 948
    .line 949
    .line 950
    move-result v1

    .line 951
    if-eqz v1, :cond_2d

    .line 952
    .line 953
    const/4 v11, 0x0

    .line 954
    invoke-virtual {v6, v11}, Lb7;->N(F)V

    .line 955
    .line 956
    .line 957
    :cond_2d
    iget-boolean v1, v0, Lzn1;->z:Z

    .line 958
    .line 959
    iget-boolean v6, v3, Lca2;->v:Z

    .line 960
    .line 961
    iput-boolean v6, v0, Lzn1;->z:Z

    .line 962
    .line 963
    iget v3, v3, Lca2;->k:F

    .line 964
    .line 965
    iput v3, v0, Lzn1;->D:F

    .line 966
    .line 967
    iget v3, v5, Lz51;->a:F

    .line 968
    .line 969
    iget v6, v2, Lz51;->a:F

    .line 970
    .line 971
    cmpg-float v3, v3, v6

    .line 972
    .line 973
    if-nez v3, :cond_2e

    .line 974
    .line 975
    iget v3, v5, Lz51;->b:F

    .line 976
    .line 977
    iget v6, v2, Lz51;->b:F

    .line 978
    .line 979
    cmpg-float v3, v3, v6

    .line 980
    .line 981
    if-nez v3, :cond_2e

    .line 982
    .line 983
    iget v3, v5, Lz51;->c:F

    .line 984
    .line 985
    iget v6, v2, Lz51;->c:F

    .line 986
    .line 987
    cmpg-float v3, v3, v6

    .line 988
    .line 989
    if-nez v3, :cond_2e

    .line 990
    .line 991
    iget v3, v5, Lz51;->d:F

    .line 992
    .line 993
    iget v6, v2, Lz51;->d:F

    .line 994
    .line 995
    cmpg-float v3, v3, v6

    .line 996
    .line 997
    if-nez v3, :cond_2e

    .line 998
    .line 999
    iget v3, v5, Lz51;->e:F

    .line 1000
    .line 1001
    iget v6, v2, Lz51;->e:F

    .line 1002
    .line 1003
    cmpg-float v3, v3, v6

    .line 1004
    .line 1005
    if-nez v3, :cond_2e

    .line 1006
    .line 1007
    iget v3, v5, Lz51;->f:F

    .line 1008
    .line 1009
    iget v6, v2, Lz51;->f:F

    .line 1010
    .line 1011
    cmpg-float v3, v3, v6

    .line 1012
    .line 1013
    if-nez v3, :cond_2e

    .line 1014
    .line 1015
    iget v3, v5, Lz51;->g:F

    .line 1016
    .line 1017
    iget v6, v2, Lz51;->g:F

    .line 1018
    .line 1019
    cmpg-float v3, v3, v6

    .line 1020
    .line 1021
    if-nez v3, :cond_2e

    .line 1022
    .line 1023
    iget-wide v5, v5, Lz51;->h:J

    .line 1024
    .line 1025
    iget-wide v2, v2, Lz51;->h:J

    .line 1026
    .line 1027
    invoke-static {v5, v6, v2, v3}, Lm33;->a(JJ)Z

    .line 1028
    .line 1029
    .line 1030
    move-result v2

    .line 1031
    if-eqz v2, :cond_2e

    .line 1032
    .line 1033
    const/4 v12, 0x1

    .line 1034
    goto :goto_11

    .line 1035
    :cond_2e
    const/4 v12, 0x0

    .line 1036
    :goto_11
    if-eqz p1, :cond_30

    .line 1037
    .line 1038
    if-eqz v12, :cond_2f

    .line 1039
    .line 1040
    iget-boolean v2, v0, Lzn1;->z:Z

    .line 1041
    .line 1042
    if-eq v1, v2, :cond_30

    .line 1043
    .line 1044
    :cond_2f
    iget-object v1, v4, Lr61;->u:Lzv1;

    .line 1045
    .line 1046
    if-eqz v1, :cond_30

    .line 1047
    .line 1048
    check-cast v1, Lb7;

    .line 1049
    .line 1050
    invoke-virtual {v1, v4}, Lb7;->z(Lr61;)V

    .line 1051
    .line 1052
    .line 1053
    :cond_30
    if-nez v12, :cond_34

    .line 1054
    .line 1055
    invoke-virtual {v4, v0}, Lr61;->N(Lzn1;)V

    .line 1056
    .line 1057
    .line 1058
    iget v0, v4, Lr61;->W:I

    .line 1059
    .line 1060
    if-lez v0, :cond_34

    .line 1061
    .line 1062
    invoke-static {v4}, Lu61;->a(Lr61;)Lzv1;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    check-cast v0, Lb7;

    .line 1067
    .line 1068
    iget-object v1, v0, Lb7;->g0:Lkf1;

    .line 1069
    .line 1070
    iget-object v1, v1, Lkf1;->e:Ldq1;

    .line 1071
    .line 1072
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1073
    .line 1074
    .line 1075
    iget v2, v4, Lr61;->W:I

    .line 1076
    .line 1077
    if-lez v2, :cond_31

    .line 1078
    .line 1079
    iget-object v1, v1, Ldq1;->i:Ljava/lang/Object;

    .line 1080
    .line 1081
    check-cast v1, Lzk1;

    .line 1082
    .line 1083
    invoke-virtual {v1, v4}, Lzk1;->b(Ljava/lang/Object;)V

    .line 1084
    .line 1085
    .line 1086
    const/4 v8, 0x1

    .line 1087
    iput-boolean v8, v4, Lr61;->V:Z

    .line 1088
    .line 1089
    :cond_31
    const/4 v14, 0x0

    .line 1090
    invoke-virtual {v0, v14}, Lb7;->G(Lr61;)V

    .line 1091
    .line 1092
    .line 1093
    return-void

    .line 1094
    :cond_32
    const-string v0, "updateLayerParameters requires a non-null layerBlock"

    .line 1095
    .line 1096
    invoke-static {v0}, Lvi0;->e(Ljava/lang/String;)Lpv;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v0

    .line 1100
    throw v0

    .line 1101
    :cond_33
    if-nez v2, :cond_35

    .line 1102
    .line 1103
    :cond_34
    return-void

    .line 1104
    :cond_35
    const-string v0, "null layer with a non-null layerBlock"

    .line 1105
    .line 1106
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 1107
    .line 1108
    .line 1109
    return-void
.end method

.method public final t0()Lc61;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final t1(J)Z
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
    iget-object v1, v0, Lzn1;->S:Lyv1;

    .line 30
    .line 31
    if-eqz v1, :cond_c

    .line 32
    .line 33
    iget-boolean v0, v0, Lzn1;->z:Z

    .line 34
    .line 35
    if-eqz v0, :cond_c

    .line 36
    .line 37
    check-cast v1, Lsq0;

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
    iget-object v1, v1, Lsq0;->h:Lpq0;

    .line 61
    .line 62
    iget-boolean v8, v1, Lpq0;->w:Z

    .line 63
    .line 64
    if-eqz v8, :cond_b

    .line 65
    .line 66
    invoke-virtual {v1}, Lpq0;->d()Lte;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    instance-of v8, v1, Ltv1;

    .line 71
    .line 72
    if-eqz v8, :cond_1

    .line 73
    .line 74
    check-cast v1, Ltv1;

    .line 75
    .line 76
    iget-object v0, v1, Ltv1;->j:Lo62;

    .line 77
    .line 78
    iget v1, v0, Lo62;->a:F

    .line 79
    .line 80
    cmpg-float v1, v1, v5

    .line 81
    .line 82
    if-gtz v1, :cond_0

    .line 83
    .line 84
    iget v1, v0, Lo62;->c:F

    .line 85
    .line 86
    cmpg-float v1, v5, v1

    .line 87
    .line 88
    if-gez v1, :cond_0

    .line 89
    .line 90
    iget v1, v0, Lo62;->b:F

    .line 91
    .line 92
    cmpg-float v1, v1, v4

    .line 93
    .line 94
    if-gtz v1, :cond_0

    .line 95
    .line 96
    iget v0, v0, Lo62;->d:F

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
    instance-of v8, v1, Luv1;

    .line 111
    .line 112
    if-eqz v8, :cond_9

    .line 113
    .line 114
    check-cast v1, Luv1;

    .line 115
    .line 116
    iget-object v1, v1, Luv1;->j:Ldb2;

    .line 117
    .line 118
    iget v8, v1, Ldb2;->c:F

    .line 119
    .line 120
    iget v9, v1, Ldb2;->b:F

    .line 121
    .line 122
    iget v10, v1, Ldb2;->d:F

    .line 123
    .line 124
    iget v11, v1, Ldb2;->a:F

    .line 125
    .line 126
    iget-wide v12, v1, Ldb2;->f:J

    .line 127
    .line 128
    iget-wide v14, v1, Ldb2;->h:J

    .line 129
    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    const/16 v17, 0x1

    .line 133
    .line 134
    iget-wide v2, v1, Ldb2;->g:J

    .line 135
    .line 136
    move-wide/from16 v18, v6

    .line 137
    .line 138
    iget-wide v6, v1, Ldb2;->e:J

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
    iget-wide v9, v2, Ldb2;->e:J

    .line 312
    .line 313
    move v8, v1

    .line 314
    move v7, v3

    .line 315
    move v6, v4

    .line 316
    invoke-static/range {v5 .. v10}, Lxe1;->R(FFFFJ)Z

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
    iget-wide v9, v2, Ldb2;->h:J

    .line 338
    .line 339
    move v7, v1

    .line 340
    invoke-static/range {v5 .. v10}, Lxe1;->R(FFFFJ)Z

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
    iget-wide v9, v2, Ldb2;->f:J

    .line 355
    .line 356
    move v8, v3

    .line 357
    move v7, v12

    .line 358
    invoke-static/range {v5 .. v10}, Lxe1;->R(FFFFJ)Z

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
    iget-wide v9, v2, Ldb2;->g:J

    .line 372
    .line 373
    move v8, v0

    .line 374
    invoke-static/range {v5 .. v10}, Lxe1;->R(FFFFJ)Z

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
    invoke-static {}, Laa;->a()Ly9;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v0, v2}, Ly9;->b(Ly9;Ldb2;)V

    .line 390
    .line 391
    .line 392
    invoke-static {v5, v6, v0}, Lxe1;->P(FFLy9;)Z

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
    instance-of v0, v1, Lsv1;

    .line 406
    .line 407
    if-eqz v0, :cond_a

    .line 408
    .line 409
    check-cast v1, Lsv1;

    .line 410
    .line 411
    iget-object v0, v1, Lsv1;->j:Ly9;

    .line 412
    .line 413
    invoke-static {v5, v6, v0}, Lxe1;->P(FFLy9;)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    goto :goto_3

    .line 418
    :cond_a
    invoke-static {}, Lc80;->s()V

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

.method public final v0()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lzn1;->E:Lof1;

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

.method public final w()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-boolean p0, p0, Lth1;->u:Z

    .line 6
    .line 7
    return p0
.end method

.method public final w0()Lr61;
    .locals 0

    .line 1
    iget-object p0, p0, Lzn1;->v:Lr61;

    .line 2
    .line 3
    return-object p0
.end method
