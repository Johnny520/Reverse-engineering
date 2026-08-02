.class public final Ll61;
.super Lzn1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a0:Lq9;


# instance fields
.field public Y:Lj61;

.field public Z:Lk61;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lpp0;->i()Lq9;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lju;->h:I

    .line 6
    .line 7
    sget-wide v1, Lju;->e:J

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lq9;->k(J)V

    .line 10
    .line 11
    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lq9;->q(F)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lq9;->r(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ll61;->a0:Lq9;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lr61;Lj61;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lzn1;-><init>(Lr61;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ll61;->Y:Lj61;

    .line 5
    .line 6
    iget-object p1, p1, Lr61;->o:Lr61;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lk61;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lk61;-><init>(Ll61;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v0

    .line 18
    :goto_0
    iput-object p1, p0, Ll61;->Z:Lk61;

    .line 19
    .line 20
    check-cast p2, Lth1;

    .line 21
    .line 22
    iget-object p0, p2, Lth1;->h:Lth1;

    .line 23
    .line 24
    iget p0, p0, Lth1;->j:I

    .line 25
    .line 26
    and-int/lit16 p0, p0, 0x200

    .line 27
    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-static {}, Lc80;->g()V

    .line 32
    .line 33
    .line 34
    throw v0
.end method


# virtual methods
.method public final N(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Ll61;->Y:Lj61;

    .line 2
    .line 3
    iget-object v1, p0, Lzn1;->w:Lzn1;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lj61;->U(Lkd1;Lif1;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final N0()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll61;->Z:Lk61;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lk61;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lk61;-><init>(Ll61;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ll61;->Z:Lk61;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final Q0()Lmd1;
    .locals 0

    .line 1
    iget-object p0, p0, Ll61;->Z:Lk61;

    .line 2
    .line 3
    return-object p0
.end method

.method public final S0()Lth1;
    .locals 0

    .line 1
    iget-object p0, p0, Ll61;->Y:Lj61;

    .line 2
    .line 3
    check-cast p0, Lth1;

    .line 4
    .line 5
    iget-object p0, p0, Lth1;->h:Lth1;

    .line 6
    .line 7
    return-object p0
.end method

.method public final W(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Ll61;->Y:Lj61;

    .line 2
    .line 3
    iget-object v1, p0, Lzn1;->w:Lzn1;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lj61;->g(Lkd1;Lif1;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final X(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Ll61;->Y:Lj61;

    .line 2
    .line 3
    iget-object v1, p0, Lzn1;->w:Lzn1;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lj61;->D(Lkd1;Lif1;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final e(J)Lsz1;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lsz1;->k0(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ll61;->Y:Lj61;

    .line 5
    .line 6
    iget-object v1, p0, Lzn1;->w:Lzn1;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0, v1, p1, p2}, Lj61;->e(Lpf1;Lif1;J)Lof1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lzn1;->l1(Lof1;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lzn1;->c1()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public final f(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Ll61;->Y:Lj61;

    .line 2
    .line 3
    iget-object v1, p0, Lzn1;->w:Lzn1;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lj61;->p(Lkd1;Lif1;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final f0(JFLin0;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lzn1;->i1(JFLin0;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lkd1;->q:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lzn1;->d1()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lzn1;->w:Lzn1;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-boolean p2, p0, Lkd1;->r:Z

    .line 18
    .line 19
    iput-boolean p2, p1, Lkd1;->r:Z

    .line 20
    .line 21
    invoke-virtual {p0}, Lzn1;->A0()Lof1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Lof1;->b()V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    iput-boolean p0, p1, Lkd1;->r:Z

    .line 30
    .line 31
    :goto_0
    return-void
.end method

.method public final h1(Lqp;Lpq0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lzn1;->w:Lzn1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lzn1;->L0(Lqp;Lpq0;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lzn1;->v:Lr61;

    .line 10
    .line 11
    invoke-static {p2}, Lu61;->a(Lr61;)Lzv1;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Lb7;

    .line 16
    .line 17
    invoke-virtual {p2}, Lb7;->getShowLayoutBounds()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, Lzn1;->w:Lzn1;

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget-wide v0, p0, Lsz1;->j:J

    .line 28
    .line 29
    iget-wide v2, p2, Lsz1;->j:J

    .line 30
    .line 31
    invoke-static {v0, v1, v2, v3}, Lh11;->a(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-wide v0, p2, Lzn1;->G:J

    .line 38
    .line 39
    const-wide/16 v2, 0x0

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, Lz01;->a(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    :cond_0
    iget-wide v0, p0, Lsz1;->j:J

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
    int-to-float p0, p0

    .line 55
    const/high16 p2, 0x3f000000    # 0.5f

    .line 56
    .line 57
    sub-float v5, p0, p2

    .line 58
    .line 59
    const-wide v2, 0xffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long/2addr v0, v2

    .line 65
    long-to-int p0, v0

    .line 66
    int-to-float p0, p0

    .line 67
    sub-float v6, p0, p2

    .line 68
    .line 69
    const/high16 v3, 0x3f000000    # 0.5f

    .line 70
    .line 71
    const/high16 v4, 0x3f000000    # 0.5f

    .line 72
    .line 73
    sget-object v7, Ll61;->a0:Lq9;

    .line 74
    .line 75
    move-object v2, p1

    .line 76
    invoke-interface/range {v2 .. v7}, Lqp;->p(FFFFLq9;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void
.end method

.method public final m0(Ldu0;)I
    .locals 1

    .line 1
    iget-object v0, p0, Ll61;->Z:Lk61;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p0, v0, Lmd1;->A:Lgk1;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lgk1;->d(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lgk1;->c:[I

    .line 14
    .line 15
    aget p0, p0, p1

    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    const/high16 p0, -0x80000000

    .line 19
    .line 20
    return p0

    .line 21
    :cond_1
    invoke-static {p0, p1}, Lt11;->k(Lkd1;Ldu0;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method public final u1(Lj61;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll61;->Y:Lj61;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Lth1;

    .line 11
    .line 12
    iget-object v0, v0, Lth1;->h:Lth1;

    .line 13
    .line 14
    iget v0, v0, Lth1;->j:I

    .line 15
    .line 16
    and-int/lit16 v0, v0, 0x200

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lc80;->g()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    :goto_0
    iput-object p1, p0, Ll61;->Y:Lj61;

    .line 26
    .line 27
    return-void
.end method
