.class public final Lni;
.super Lsi;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:Z

.field public d:Ljava/util/HashSet;

.field public final e:Ljava/util/LinkedHashSet;

.field public final f:Lgp0;

.field public final synthetic g:Lpi;


# direct methods
.method public constructor <init>(Lpi;JZZLx1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lni;->g:Lpi;

    .line 5
    .line 6
    iput-wide p2, p0, Lni;->a:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lni;->b:Z

    .line 9
    .line 10
    iput-boolean p5, p0, Lni;->c:Z

    .line 11
    .line 12
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lni;->e:Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    sget-object p1, Lfq0;->g:Lfq0;

    .line 20
    .line 21
    sget-object p2, Ln2;->R:Ln2;

    .line 22
    .line 23
    new-instance p3, Lgp0;

    .line 24
    .line 25
    invoke-direct {p3, p1, p2}, Lgp0;-><init>(Ljava/lang/Object;Ln2;)V

    .line 26
    .line 27
    .line 28
    iput-object p3, p0, Lni;->f:Lgp0;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(Lyi;Lww;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget-object p0, p0, Lpi;->b:Lsi;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lsi;->a(Lyi;Lww;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b(Lyi;Lj11;Lww;)Lkh0;
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget-object p0, p0, Lpi;->b:Lsi;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lsi;->b(Lyi;Lj11;Lww;)Lkh0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget v0, p0, Lpi;->A:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    iput v0, p0, Lpi;->A:I

    .line 8
    .line 9
    return-void
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget-object p0, p0, Lpi;->b:Lsi;

    .line 4
    .line 5
    invoke-virtual {p0}, Lsi;->d()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lni;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lni;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lni;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final h()Lri;
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget-object p0, p0, Lpi;->h:Lyi;

    .line 4
    .line 5
    return-object p0
.end method

.method public final i()Lfq0;
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->f:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lfq0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final j()Lpk;
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget-object p0, p0, Lpi;->b:Lsi;

    .line 4
    .line 5
    invoke-virtual {p0}, Lsi;->j()Lpk;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget-object p0, p0, Lpi;->b:Lsi;

    .line 4
    .line 5
    invoke-virtual {p0}, Lsi;->k()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final l(Lyi;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget-object v0, p0, Lpi;->b:Lsi;

    .line 4
    .line 5
    iget-object v1, p0, Lpi;->h:Lyi;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lsi;->l(Lyi;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lpi;->b:Lsi;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lsi;->l(Lyi;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final m(Lmg0;)Llg0;
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget-object p0, p0, Lpi;->b:Lsi;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lsi;->m(Lmg0;)Llg0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final n(Lyi;Lj11;Lkh0;)Lkh0;
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget-object p0, p0, Lpi;->b:Lsi;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lsi;->n(Lyi;Lj11;Lkh0;)Lkh0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final o(Ljava/util/Set;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lni;->d:Ljava/util/HashSet;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lni;->d:Ljava/util/HashSet;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final p(Lpi;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->e:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q(Lht0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget-object p0, p0, Lpi;->b:Lsi;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lsi;->q(Lht0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final r(Lyi;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget-object p0, p0, Lpi;->b:Lsi;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lsi;->r(Lyi;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final s(Li7;)Lyc;
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget-object p0, p0, Lpi;->b:Lsi;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lsi;->s(Li7;)Lyc;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final t()V
    .locals 1

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget v0, p0, Lpi;->A:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    iput v0, p0, Lpi;->A:I

    .line 8
    .line 9
    return-void
.end method

.method public final u(Lji;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lni;->d:Ljava/util/HashSet;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/util/Set;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-object v2, p1

    .line 25
    check-cast v2, Lpi;

    .line 26
    .line 27
    invoke-virtual {v2}, Lpi;->w()Lui;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object p0, p0, Lni;->e:Ljava/util/LinkedHashSet;

    .line 36
    .line 37
    instance-of v0, p0, Lp40;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    instance-of v0, p0, Lq40;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string p1, "kotlin.collections.MutableCollection"

    .line 47
    .line 48
    invoke-static {p0, p1}, Ls91;->Q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    throw p0

    .line 53
    :cond_2
    :goto_1
    invoke-interface {p0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final v(Lyi;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lni;->g:Lpi;

    .line 2
    .line 3
    iget-object p0, p0, Lpi;->b:Lsi;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lsi;->v(Lyi;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final w()V
    .locals 6

    .line 1
    iget-object v0, p0, Lni;->e:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    iget-object p0, p0, Lni;->d:Ljava/util/HashSet;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lpi;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Ljava/util/Set;

    .line 44
    .line 45
    invoke-virtual {v2}, Lpi;->w()Lui;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-interface {v4, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void
.end method
