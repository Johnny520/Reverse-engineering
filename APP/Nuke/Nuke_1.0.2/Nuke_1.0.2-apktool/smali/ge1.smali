.class public final Lge1;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ldq0;
.implements Lmc0;
.implements Lon2;
.implements Los1;


# instance fields
.field public A:Le02;

.field public final B:Lnx1;

.field public C:Ln70;

.field public D:J

.field public E:Lh11;

.field public F:Ljn;

.field public v:Lgp1;

.field public w:Lf03;

.field public x:Lf02;

.field public y:Landroid/view/View;

.field public z:Le70;


# direct methods
.method public constructor <init>(Lgp1;Lf03;Lf02;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lth1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lge1;->v:Lgp1;

    .line 5
    .line 6
    iput-object p2, p0, Lge1;->w:Lf03;

    .line 7
    .line 8
    iput-object p3, p0, Lge1;->x:Lf02;

    .line 9
    .line 10
    sget-object p1, Lgd3;->C:Lgd3;

    .line 11
    .line 12
    new-instance p2, Lnx1;

    .line 13
    .line 14
    const/4 p3, 0x0

    .line 15
    invoke-direct {p2, p3, p1}, Lnx1;-><init>(Ljava/lang/Object;Lks2;)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Lge1;->B:Lnx1;

    .line 19
    .line 20
    const-wide p1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide p1, p0, Lge1;->D:J

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final E0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lge1;->L()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x7

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v1, v0, v2}, Lfg1;->a(IILhn;)Ljn;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lge1;->F:Ljn;

    .line 12
    .line 13
    invoke-virtual {p0}, Lth1;->A0()Lj20;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lh50;

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    invoke-direct {v1, p0, v2, v3}, Lh50;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    invoke-static {v0, v2, v1, p0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final F0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lge1;->A:Le02;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lg02;

    .line 6
    .line 7
    invoke-virtual {v0}, Lg02;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lge1;->A:Le02;

    .line 12
    .line 13
    return-void
.end method

.method public final L()V
    .locals 2

    .line 1
    new-instance v0, Lfe1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lfe1;-><init>(Lge1;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, Ls11;->S(Lth1;Lxm0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final M0()J
    .locals 2

    .line 1
    iget-object v0, p0, Lge1;->C:Ln70;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lfe1;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, p0, v1}, Lfe1;-><init>(Lge1;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lop0;->m(Lxm0;)Ln70;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lge1;->C:Ln70;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lge1;->C:Ln70;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Ln70;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lrs1;

    .line 26
    .line 27
    iget-wide v0, p0, Lrs1;->a:J

    .line 28
    .line 29
    return-wide v0

    .line 30
    :cond_1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    return-wide v0
.end method

.method public final N0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lge1;->A:Le02;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lg02;

    .line 6
    .line 7
    invoke-virtual {v0}, Lg02;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lge1;->y:Landroid/view/View;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Ltp0;->H(Lt60;)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    iput-object v0, p0, Lge1;->y:Landroid/view/View;

    .line 19
    .line 20
    iget-object v1, p0, Lge1;->z:Le70;

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v1, v1, Lr61;->F:Le70;

    .line 29
    .line 30
    :cond_2
    iput-object v1, p0, Lge1;->z:Le70;

    .line 31
    .line 32
    iget-object v2, p0, Lge1;->x:Lf02;

    .line 33
    .line 34
    invoke-interface {v2, v0, v1}, Lf02;->b(Landroid/view/View;Le70;)Le02;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lge1;->A:Le02;

    .line 39
    .line 40
    invoke-virtual {p0}, Lge1;->P0()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final O0()V
    .locals 8

    .line 1
    iget-object v0, p0, Lge1;->z:Le70;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lr61;->F:Le70;

    .line 10
    .line 11
    iput-object v0, p0, Lge1;->z:Le70;

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lge1;->v:Lgp1;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lgp1;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lrs1;

    .line 20
    .line 21
    iget-wide v0, v0, Lrs1;->a:J

    .line 22
    .line 23
    const-wide v2, 0x7fffffff7fffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long v4, v0, v2

    .line 29
    .line 30
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    cmp-long v4, v4, v6

    .line 36
    .line 37
    if-eqz v4, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, Lge1;->M0()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    and-long/2addr v2, v4

    .line 44
    cmp-long v2, v2, v6

    .line 45
    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0}, Lge1;->M0()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    invoke-static {v2, v3, v0, v1}, Lrs1;->e(JJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    iput-wide v0, p0, Lge1;->D:J

    .line 57
    .line 58
    iget-object v0, p0, Lge1;->A:Le02;

    .line 59
    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0}, Lge1;->N0()V

    .line 63
    .line 64
    .line 65
    :cond_1
    iget-object v0, p0, Lge1;->A:Le02;

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    iget-wide v1, p0, Lge1;->D:J

    .line 70
    .line 71
    invoke-interface {v0, v1, v2, v6, v7}, Le02;->a(JJ)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {p0}, Lge1;->P0()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    iput-wide v6, p0, Lge1;->D:J

    .line 79
    .line 80
    iget-object p0, p0, Lge1;->A:Le02;

    .line 81
    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    check-cast p0, Lg02;

    .line 85
    .line 86
    invoke-virtual {p0}, Lg02;->b()V

    .line 87
    .line 88
    .line 89
    :cond_4
    return-void
.end method

.method public final P(Lt61;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lt61;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lge1;->F:Ljn;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object p1, La83;->a:La83;

    .line 9
    .line 10
    invoke-interface {p0, p1}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final P0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lge1;->A:Le02;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Lge1;->z:Le70;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    check-cast v0, Lg02;

    .line 12
    .line 13
    invoke-virtual {v0}, Lg02;->c()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    iget-object v4, p0, Lge1;->E:Lh11;

    .line 18
    .line 19
    if-nez v4, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-wide v4, v4, Lh11;->a:J

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    :goto_1
    iget-object v2, p0, Lge1;->w:Lf03;

    .line 29
    .line 30
    invoke-virtual {v0}, Lg02;->c()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-static {v3, v4}, Ls11;->q0(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    invoke-interface {v1, v3, v4}, Le70;->y(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    new-instance v1, Lcb0;

    .line 43
    .line 44
    invoke-direct {v1, v3, v4}, Lcb0;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v1}, Lf03;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lg02;->c()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    new-instance v2, Lh11;

    .line 55
    .line 56
    invoke-direct {v2, v0, v1}, Lh11;-><init>(J)V

    .line 57
    .line 58
    .line 59
    iput-object v2, p0, Lge1;->E:Lh11;

    .line 60
    .line 61
    :cond_3
    return-void
.end method

.method public final l0(Lzn2;)V
    .locals 3

    .line 1
    sget-object v0, Lhe1;->a:Lyn2;

    .line 2
    .line 3
    new-instance v1, Lfe1;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, v2}, Lfe1;-><init>(Lge1;I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0, v1}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final w(Lzn1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lge1;->B:Lnx1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
