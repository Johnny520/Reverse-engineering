.class public final Lt50;
.super Lqj0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final V:Lw5;


# instance fields
.field public T:Lr50;

.field public U:Ls50;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lo30;->g()Lw5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-wide v1, Lff;->e:J

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lw5;->e(J)V

    .line 8
    .line 9
    .line 10
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iget-object v2, v0, Lw5;->a:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lw5;->j(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lt50;->V:Lw5;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lb60;Lr50;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lqj0;-><init>(Lb60;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lt50;->T:Lr50;

    .line 5
    .line 6
    iget-object p1, p1, Lb60;->l:Lb60;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Ls50;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Ls50;-><init>(Lt50;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v0

    .line 18
    :goto_0
    iput-object p1, p0, Lt50;->U:Ls50;

    .line 19
    .line 20
    check-cast p2, Loe0;

    .line 21
    .line 22
    iget-object p0, p2, Loe0;->d:Loe0;

    .line 23
    .line 24
    iget p0, p0, Loe0;->f:I

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
    invoke-static {}, Lxc;->d()V

    .line 32
    .line 33
    .line 34
    throw v0
.end method


# virtual methods
.method public final B0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt50;->U:Ls50;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ls50;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Ls50;-><init>(Lt50;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lt50;->U:Ls50;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final E0()Lac0;
    .locals 0

    .line 1
    iget-object p0, p0, Lt50;->U:Ls50;

    .line 2
    .line 3
    return-object p0
.end method

.method public final G0()Loe0;
    .locals 0

    .line 1
    iget-object p0, p0, Lt50;->T:Lr50;

    .line 2
    .line 3
    check-cast p0, Loe0;

    .line 4
    .line 5
    iget-object p0, p0, Loe0;->d:Loe0;

    .line 6
    .line 7
    return-object p0
.end method

.method public final I(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lt50;->T:Lr50;

    .line 2
    .line 3
    iget-object v1, p0, Lqj0;->s:Lqj0;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lr50;->G(Lyb0;Lsd0;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final O(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lt50;->T:Lr50;

    .line 2
    .line 3
    iget-object v1, p0, Lqj0;->s:Lqj0;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lr50;->d(Lyb0;Lsd0;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final R(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lt50;->T:Lr50;

    .line 2
    .line 3
    iget-object v1, p0, Lqj0;->s:Lqj0;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lr50;->s(Lyb0;Lsd0;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final W0(Lbd;Lvx;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lqj0;->s:Lqj0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lqj0;->z0(Lbd;Lvx;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lqj0;->r:Lb60;

    .line 10
    .line 11
    invoke-static {p2}, Le60;->a(Lb60;)Ldn0;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Lw3;

    .line 16
    .line 17
    invoke-virtual {p2}, Lw3;->getShowLayoutBounds()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, Lqj0;->s:Lqj0;

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget-wide v0, p0, Lxq0;->f:J

    .line 28
    .line 29
    iget-wide v2, p2, Lxq0;->f:J

    .line 30
    .line 31
    invoke-static {v0, v1, v2, v3}, Ld30;->a(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-wide v0, p2, Lqj0;->C:J

    .line 38
    .line 39
    const-wide/16 v2, 0x0

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, Lw20;->a(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    :cond_0
    iget-wide v0, p0, Lxq0;->f:J

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
    sget-object v7, Lt50;->V:Lw5;

    .line 74
    .line 75
    move-object v2, p1

    .line 76
    invoke-interface/range {v2 .. v7}, Lbd;->m(FFFFLw5;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void
.end method

.method public final X(JFLsw;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lqj0;->X0(JFLsw;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lyb0;->m:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lqj0;->S0()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lqj0;->s:Lqj0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-boolean p2, p0, Lyb0;->n:Z

    .line 18
    .line 19
    iput-boolean p2, p1, Lyb0;->n:Z

    .line 20
    .line 21
    invoke-virtual {p0}, Lqj0;->o0()Lyd0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Lyd0;->b()V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    iput-boolean p0, p1, Lyb0;->n:Z

    .line 30
    .line 31
    :goto_0
    return-void
.end method

.method public final c0(Lo2;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lt50;->U:Ls50;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p0, v0, Lac0;->w:Lch0;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lch0;->d(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lch0;->c:[I

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
    invoke-static {p0, p1}, Lu50;->d(Lyb0;Lo2;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method public final e(J)Lxq0;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lxq0;->a0(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lt50;->T:Lr50;

    .line 5
    .line 6
    iget-object v1, p0, Lqj0;->s:Lqj0;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0, v1, p1, p2}, Lr50;->Y(Lzd0;Lsd0;J)Lyd0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lqj0;->a1(Lyd0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lqj0;->R0()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public final f(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lt50;->T:Lr50;

    .line 2
    .line 3
    iget-object v1, p0, Lqj0;->s:Lqj0;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lr50;->i(Lyb0;Lsd0;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final f1(Lr50;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt50;->T:Lr50;

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
    check-cast v0, Loe0;

    .line 11
    .line 12
    iget-object v0, v0, Loe0;->d:Loe0;

    .line 13
    .line 14
    iget v0, v0, Loe0;->f:I

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
    invoke-static {}, Lxc;->d()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    :goto_0
    iput-object p1, p0, Lt50;->T:Lr50;

    .line 26
    .line 27
    return-void
.end method
