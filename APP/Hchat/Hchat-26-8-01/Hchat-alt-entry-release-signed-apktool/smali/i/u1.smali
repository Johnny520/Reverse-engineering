.class public final Li/u1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li/p1;
.implements Li0/a;
.implements Lu4/h;


# instance fields
.field public final g:I

.field public h:I

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IILfg/a;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput p1, p0, Li/u1;->g:I

    iput p2, p0, Li/u1;->h:I

    iput-object p3, p0, Li/u1;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(IILi/v;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Li/u1;->g:I

    .line 5
    .line 6
    iput p2, p0, Li/u1;->h:I

    .line 7
    .line 8
    new-instance v0, Lhb/c;

    .line 9
    .line 10
    new-instance v1, Li/b0;

    .line 11
    .line 12
    invoke-direct {v1, p1, p2, p3}, Li/b0;-><init>(IILi/v;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Lhb/c;-><init>(Li/z;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Li/u1;->i:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Li0/a;I)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li/u1;->i:Ljava/lang/Object;

    iput p2, p0, Li/u1;->g:I

    return-void
.end method

.method public constructor <init>([ZII)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Li/u1;->i:Ljava/lang/Object;

    iput p2, p0, Li/u1;->g:I

    iput p3, p0, Li/u1;->h:I

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li/u1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/a;

    .line 4
    .line 5
    iget v1, p0, Li/u1;->h:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget v1, p0, Li/u1;->g:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, v1

    .line 14
    invoke-interface {v0, p1, p2}, Li0/a;->c(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Li/u1;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Li/u1;->h:I

    .line 6
    .line 7
    iget-object v0, p0, Li/u1;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Li0/a;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Li0/a;->d(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public e(Lu4/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Li/u1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/a;

    .line 4
    .line 5
    invoke-interface {v0}, Li0/a;->f()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h(III)V
    .locals 2

    .line 1
    iget v0, p0, Li/u1;->h:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Li/u1;->g:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Li/u1;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Li0/a;

    .line 12
    .line 13
    add-int/2addr p1, v0

    .line 14
    add-int/2addr p2, v0

    .line 15
    invoke-interface {v1, p1, p2, p3}, Li0/a;->h(III)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public i(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Li/u1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/a;

    .line 4
    .line 5
    iget v1, p0, Li/u1;->h:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget v1, p0, Li/u1;->g:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, v1

    .line 14
    invoke-interface {v0, p1, p2}, Li0/a;->i(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public j(Lu4/j;)V
    .locals 0

    .line 1
    return-void
.end method

.method public k()V
    .locals 1

    .line 1
    iget v0, p0, Li/u1;->h:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, "OffsetApplier up called with no corresponding down"

    .line 7
    .line 8
    invoke-static {v0}, Li0/m;->a(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :goto_0
    iget v0, p0, Li/u1;->h:I

    .line 12
    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    iput v0, p0, Li/u1;->h:I

    .line 16
    .line 17
    iget-object v0, p0, Li/u1;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Li0/a;

    .line 20
    .line 21
    invoke-interface {v0}, Li0/a;->k()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public l(Lu4/u;)V
    .locals 0

    .line 1
    return-void
.end method

.method public m(Lu4/l;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lu4/i;->g:Lu4/r;

    .line 2
    .line 3
    iget v0, v0, Lu4/r;->a:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    iget-object v0, p1, Lu4/d;->k:Lv4/a;

    .line 9
    .line 10
    check-cast v0, Lv4/o;

    .line 11
    .line 12
    iget v0, v0, Lv4/s;->g:I

    .line 13
    .line 14
    iget-object v1, p0, Li/u1;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, [Z

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    aget-boolean v3, v1, v2

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget v3, p0, Li/u1;->g:I

    .line 24
    .line 25
    iget v4, p0, Li/u1;->h:I

    .line 26
    .line 27
    sub-int/2addr v3, v4

    .line 28
    add-int/2addr v3, v0

    .line 29
    iget-object p1, p1, Lu4/i;->i:Lu4/o;

    .line 30
    .line 31
    iget p1, p1, Lu4/o;->g:I

    .line 32
    .line 33
    if-ne v3, p1, :cond_0

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move p1, v2

    .line 38
    :goto_0
    aput-boolean p1, v1, v2

    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public n(JLi/q;Li/q;Li/q;)Li/q;
    .locals 7

    .line 1
    iget-object v0, p0, Li/u1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lhb/c;

    .line 5
    .line 6
    move-wide v2, p1

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move-object v6, p5

    .line 10
    invoke-virtual/range {v1 .. v6}, Lhb/c;->n(JLi/q;Li/q;Li/q;)Li/q;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public o(Lu4/m;)V
    .locals 0

    .line 1
    return-void
.end method

.method public p(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li/u1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/a;

    .line 4
    .line 5
    iget v1, p0, Li/u1;->h:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget v1, p0, Li/u1;->g:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, v1

    .line 14
    invoke-interface {v0, p1, p2}, Li0/a;->p(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public r()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Li/u1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/a;

    .line 4
    .line 5
    invoke-interface {v0}, Li0/a;->r()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public s()I
    .locals 1

    .line 1
    iget v0, p0, Li/u1;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public t(Lfg/p;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li/u1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/a;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Li0/a;->t(Lfg/p;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public u(Lu4/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public v()I
    .locals 1

    .line 1
    iget v0, p0, Li/u1;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public w(JLi/q;Li/q;Li/q;)Li/q;
    .locals 7

    .line 1
    iget-object v0, p0, Li/u1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lhb/c;

    .line 5
    .line 6
    move-wide v2, p1

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move-object v6, p5

    .line 10
    invoke-virtual/range {v1 .. v6}, Lhb/c;->w(JLi/q;Li/q;Li/q;)Li/q;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public x(Lu4/u;)V
    .locals 0

    .line 1
    return-void
.end method
