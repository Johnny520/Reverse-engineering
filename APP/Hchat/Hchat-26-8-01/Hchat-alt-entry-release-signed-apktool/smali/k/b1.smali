.class public final Lk/b1;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/n;
.implements Lx1/m;
.implements Lx1/z1;
.implements Lx1/m1;


# instance fields
.field public final A:Li0/j1;

.field public B:Li0/x;

.field public C:J

.field public D:Lu2/l;

.field public E:Lsg/c;

.field public u:Lh0/g1;

.field public v:Lh0/h1;

.field public w:Lk/o1;

.field public x:Landroid/view/View;

.field public y:Lu2/c;

.field public z:Lk/n1;


# direct methods
.method public constructor <init>(Lh0/g1;Lh0/h1;Lk/o1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk/b1;->u:Lh0/g1;

    .line 5
    .line 6
    iput-object p2, p0, Lk/b1;->v:Lh0/h1;

    .line 7
    .line 8
    iput-object p3, p0, Lk/b1;->w:Lk/o1;

    .line 9
    .line 10
    sget-object p1, Li0/e;->j:Li0/e;

    .line 11
    .line 12
    new-instance p2, Li0/j1;

    .line 13
    .line 14
    const/4 p3, 0x0

    .line 15
    invoke-direct {p2, p3, p1}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Lk/b1;->A:Li0/j1;

    .line 19
    .line 20
    const-wide p1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide p1, p0, Lk/b1;->C:J

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final B(Lx1/h0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lx1/h0;->e()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lk/b1;->E:Lsg/c;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    new-instance v0, Lk/a1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lk/a1;-><init>(Lk/b1;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, Lx1/k;->r(Ly0/n;Lfg/a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final X0(Lf2/y;)V
    .locals 3

    .line 1
    sget-object v0, Lk/c1;->a:Lf2/x;

    .line 2
    .line 3
    new-instance v1, Lk/a1;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, v2}, Lk/a1;-><init>(Lk/b1;I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0, v1}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final c1()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lk/b1;->C0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x7

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v1, v0, v2}, Lsg/j;->a(IILsg/a;)Lsg/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lk/b1;->E:Lsg/c;

    .line 12
    .line 13
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lci/c;

    .line 18
    .line 19
    const/4 v3, 0x6

    .line 20
    invoke-direct {v1, p0, v2, v3}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-static {v0, v2, v1, v3}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final d1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk/b1;->z:Lk/n1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lk/p1;

    .line 6
    .line 7
    invoke-virtual {v0}, Lk/p1;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lk/b1;->z:Lk/n1;

    .line 12
    .line 13
    return-void
.end method

.method public final k1()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk/b1;->B:Li0/x;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lk/a1;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, p0, v1}, Lk/a1;-><init>(Lk/b1;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lk/b1;->B:Li0/x;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lk/b1;->B:Li0/x;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Li0/x;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Le1/b;

    .line 26
    .line 27
    iget-wide v0, v0, Le1/b;->a:J

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

.method public final l1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk/b1;->z:Lk/n1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lk/p1;

    .line 6
    .line 7
    invoke-virtual {v0}, Lk/p1;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lk/b1;->x:Landroid/view/View;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Lx1/k;->y(Lx1/i;)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    iput-object v0, p0, Lk/b1;->x:Landroid/view/View;

    .line 19
    .line 20
    iget-object v1, p0, Lk/b1;->y:Lu2/c;

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v1, v1, Lx1/f0;->E:Lu2/c;

    .line 29
    .line 30
    :cond_2
    iput-object v1, p0, Lk/b1;->y:Lu2/c;

    .line 31
    .line 32
    iget-object v2, p0, Lk/b1;->w:Lk/o1;

    .line 33
    .line 34
    invoke-interface {v2, v0, v1}, Lk/o1;->b(Landroid/view/View;Lu2/c;)Lk/n1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lk/b1;->z:Lk/n1;

    .line 39
    .line 40
    invoke-virtual {p0}, Lk/b1;->n1()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final m1()V
    .locals 8

    .line 1
    iget-object v0, p0, Lk/b1;->y:Lu2/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lx1/f0;->E:Lu2/c;

    .line 10
    .line 11
    iput-object v0, p0, Lk/b1;->y:Lu2/c;

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lk/b1;->u:Lh0/g1;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lh0/g1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Le1/b;

    .line 20
    .line 21
    iget-wide v0, v0, Le1/b;->a:J

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
    invoke-virtual {p0}, Lk/b1;->k1()J

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
    invoke-virtual {p0}, Lk/b1;->k1()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    invoke-static {v2, v3, v0, v1}, Le1/b;->e(JJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    iput-wide v0, p0, Lk/b1;->C:J

    .line 57
    .line 58
    iget-object v0, p0, Lk/b1;->z:Lk/n1;

    .line 59
    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0}, Lk/b1;->l1()V

    .line 63
    .line 64
    .line 65
    :cond_1
    iget-object v0, p0, Lk/b1;->z:Lk/n1;

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    iget-wide v1, p0, Lk/b1;->C:J

    .line 70
    .line 71
    invoke-interface {v0, v1, v2, v6, v7}, Lk/n1;->a(JJ)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {p0}, Lk/b1;->n1()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    iput-wide v6, p0, Lk/b1;->C:J

    .line 79
    .line 80
    iget-object v0, p0, Lk/b1;->z:Lk/n1;

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    check-cast v0, Lk/p1;

    .line 85
    .line 86
    invoke-virtual {v0}, Lk/p1;->b()V

    .line 87
    .line 88
    .line 89
    :cond_4
    return-void
.end method

.method public final n1()V
    .locals 6

    .line 1
    iget-object v0, p0, Lk/b1;->z:Lk/n1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Lk/b1;->y:Lu2/c;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    check-cast v0, Lk/p1;

    .line 12
    .line 13
    invoke-virtual {v0}, Lk/p1;->c()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    iget-object v4, p0, Lk/b1;->D:Lu2/l;

    .line 18
    .line 19
    if-nez v4, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-wide v4, v4, Lu2/l;->a:J

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    :goto_1
    iget-object v2, p0, Lk/b1;->v:Lh0/h1;

    .line 29
    .line 30
    invoke-virtual {v0}, Lk/p1;->c()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-static {v3, v4}, Lr9/e0;->q0(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    invoke-interface {v1, v3, v4}, Lu2/c;->K(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    new-instance v1, Lu2/h;

    .line 43
    .line 44
    invoke-direct {v1, v3, v4}, Lu2/h;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v1}, Lh0/h1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lk/p1;->c()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    new-instance v2, Lu2/l;

    .line 55
    .line 56
    invoke-direct {v2, v0, v1}, Lu2/l;-><init>(J)V

    .line 57
    .line 58
    .line 59
    iput-object v2, p0, Lk/b1;->D:Lu2/l;

    .line 60
    .line 61
    :cond_3
    return-void
.end method

.method public final w(Lx1/i1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk/b1;->A:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
