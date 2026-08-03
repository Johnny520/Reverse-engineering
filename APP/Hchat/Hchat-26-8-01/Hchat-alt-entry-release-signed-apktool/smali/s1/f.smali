.class public abstract Ls1/f;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/e2;
.implements Lx1/w1;
.implements Lx1/h;


# instance fields
.field public u:Lx1/l;

.field public v:Ls1/a;

.field public w:Z


# direct methods
.method public constructor <init>(Ls1/a;Lx1/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ls1/f;->u:Lx1/l;

    .line 5
    .line 6
    iput-object p1, p0, Ls1/f;->v:Ls1/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final H()J
    .locals 5

    .line 1
    iget-object v0, p0, Ls1/f;->u:Lx1/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Lx1/f0;->E:Lu2/c;

    .line 10
    .line 11
    sget v2, Lx1/c2;->b:I

    .line 12
    .line 13
    iget v2, v0, Lx1/l;->a:F

    .line 14
    .line 15
    invoke-interface {v1, v2}, Lu2/c;->G0(F)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget v3, v0, Lx1/l;->b:F

    .line 20
    .line 21
    invoke-interface {v1, v3}, Lu2/c;->G0(F)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    iget v4, v0, Lx1/l;->c:F

    .line 26
    .line 27
    invoke-interface {v1, v4}, Lu2/c;->G0(F)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    iget v0, v0, Lx1/l;->d:F

    .line 32
    .line 33
    invoke-interface {v1, v0}, Lu2/c;->G0(F)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v2, v3, v4, v0}, Lx1/d1;->h(IIII)J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    return-wide v0

    .line 42
    :cond_0
    sget-wide v0, Lx1/c2;->a:J

    .line 43
    .line 44
    return-wide v0
.end method

.method public final P(Ls1/k;Ls1/l;J)V
    .locals 1

    .line 1
    sget-object p3, Ls1/l;->h:Ls1/l;

    .line 2
    .line 3
    if-ne p2, p3, :cond_2

    .line 4
    .line 5
    iget-object p2, p1, Ls1/k;->a:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    const/4 p4, 0x0

    .line 12
    :goto_0
    if-ge p4, p3, :cond_2

    .line 13
    .line 14
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ls1/t;

    .line 19
    .line 20
    iget v0, v0, Ls1/t;->i:I

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ls1/f;->n1(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget p1, p1, Ls1/k;->f:I

    .line 29
    .line 30
    const/4 p2, 0x4

    .line 31
    if-ne p1, p2, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Ls1/f;->w:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Ls1/f;->m1()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const/4 p2, 0x5

    .line 41
    if-ne p1, p2, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Ls1/f;->o1()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    add-int/lit8 p4, p4, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    return-void
.end method

.method public final b0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ls1/f;->o1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final d1()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ls1/f;->o1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final k1()V
    .locals 3

    .line 1
    new-instance v0, Lgg/u;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ls1/e;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {v1, v2}, Lgg/m;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v1}, Lx1/k;->A(Lx1/e2;Lfg/l;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ls1/f;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Ls1/f;->v:Ls1/a;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Ls1/f;->v:Ls1/a;

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0, v0}, Ls1/f;->l1(Ls1/q;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public abstract l1(Ls1/q;)V
.end method

.method public final m1()V
    .locals 2

    .line 1
    new-instance v0, Lgg/q;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lgg/q;->g:Z

    .line 8
    .line 9
    new-instance v1, Lb1/e;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Lb1/e;-><init>(Lgg/q;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v1}, Lx1/k;->B(Lx1/e2;Lfg/l;)V

    .line 15
    .line 16
    .line 17
    iget-boolean v0, v0, Lgg/q;->g:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Ls1/f;->k1()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public abstract n1(I)Z
.end method

.method public final o1()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ls1/f;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Ls1/f;->w:Z

    .line 7
    .line 8
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Lgg/u;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lr1/j;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v1, v0, v2}, Lr1/j;-><init>(Lgg/u;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v1}, Lx1/k;->A(Lx1/e2;Lfg/l;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ls1/f;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Ls1/f;->k1()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    invoke-virtual {p0, v0}, Ls1/f;->l1(Ls1/q;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method
