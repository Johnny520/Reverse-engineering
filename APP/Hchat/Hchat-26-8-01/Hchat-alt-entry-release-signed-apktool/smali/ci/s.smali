.class public final Lci/s;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/h;
.implements Lx1/v;


# instance fields
.field public final u:Lci/p;


# direct methods
.method public constructor <init>(Lci/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lci/s;->u:Lci/p;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c1()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lci/s;->k1()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lci/q;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lci/q;-><init>(Lci/s;I)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lci/s;->u:Lci/p;

    .line 11
    .line 12
    iput-object v0, v1, Lci/p;->l:Lci/q;

    .line 13
    .line 14
    new-instance v0, Lci/r;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v0, p0, v2}, Lci/r;-><init>(Lci/s;I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, v1, Lci/p;->m:Lci/r;

    .line 21
    .line 22
    new-instance v0, Lci/r;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v0, p0, v2}, Lci/r;-><init>(Lci/s;I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, v1, Lci/p;->n:Lci/r;

    .line 29
    .line 30
    new-instance v0, Lci/r;

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    invoke-direct {v0, p0, v2}, Lci/r;-><init>(Lci/s;I)V

    .line 34
    .line 35
    .line 36
    iput-object v0, v1, Lci/p;->c:Lci/r;

    .line 37
    .line 38
    return-void
.end method

.method public final d1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lci/s;->u:Lci/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, v0, Lci/p;->l:Lci/q;

    .line 5
    .line 6
    iput-object v1, v0, Lci/p;->m:Lci/r;

    .line 7
    .line 8
    iput-object v1, v0, Lci/p;->n:Lci/r;

    .line 9
    .line 10
    iput-object v1, v0, Lci/p;->c:Lci/r;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Lci/p;->g(F)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lci/p;->h(F)V

    .line 17
    .line 18
    .line 19
    iput v1, v0, Lci/p;->d:F

    .line 20
    .line 21
    iput v1, v0, Lci/p;->e:F

    .line 22
    .line 23
    iget-object v0, v0, Lci/p;->n:Lci/r;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Lci/r;->invoke()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lci/z;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0}, Lci/z;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-virtual {v0, v1}, Lci/z;->b(Z)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public final j(Lv1/p0;Lv1/m0;J)Lv1/o0;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lci/s;->k1()V

    .line 5
    .line 6
    .line 7
    invoke-interface {p2, p3, p4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget p3, p2, Lv1/b1;->g:I

    .line 12
    .line 13
    iget p4, p2, Lv1/b1;->h:I

    .line 14
    .line 15
    new-instance v0, Lc9/i;

    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    invoke-direct {v0, p2, v1, p0}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object p2, Ltf/u;->g:Ltf/u;

    .line 22
    .line 23
    invoke-interface {p1, p3, p4, p2, v0}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public final k1()V
    .locals 4

    .line 1
    sget-object v0, Ly1/h1;->h:Li0/m2;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lu2/c;

    .line 8
    .line 9
    sget-object v1, Ly1/h1;->u:Li0/m2;

    .line 10
    .line 11
    invoke-static {p0, v1}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ly1/o2;

    .line 16
    .line 17
    check-cast v1, Ly1/v1;

    .line 18
    .line 19
    invoke-virtual {v1}, Ly1/v1;->a()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    invoke-static {v2, v3}, Lu2/h;->a(J)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-interface {v0, v2}, Lu2/c;->x0(F)F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, Lci/s;->u:Lci/p;

    .line 32
    .line 33
    iput v2, v3, Lci/p;->f:F

    .line 34
    .line 35
    invoke-virtual {v1}, Ly1/v1;->a()J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    invoke-static {v1, v2}, Lu2/h;->b(J)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-interface {v0, v1}, Lu2/c;->x0(F)F

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iput v0, v3, Lci/p;->g:F

    .line 48
    .line 49
    return-void
.end method
