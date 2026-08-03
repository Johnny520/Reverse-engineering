.class public final Lqe/n;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:Lud/u;

.field public h:Lqe/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lqe/n;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static i(Lp4/t;Lqe/d;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lqe/e;

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-interface {p1}, Lqe/d;->getType()Lqd/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lqd/j;->u:Lqd/h;

    .line 13
    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    return-void

    .line 18
    :cond_2
    :goto_1
    iget-object p0, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljava/util/LinkedHashSet;

    .line 21
    .line 22
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static j(Lud/r;)V
    .locals 5

    .line 1
    iget-object p0, p0, Lud/r;->D:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lqd/s;

    .line 18
    .line 19
    iget-object v1, v0, Lqd/s;->i:Lqd/r;

    .line 20
    .line 21
    iget-object v1, v1, Lmd/e;->g:Lmd/f;

    .line 22
    .line 23
    sget-object v2, Lmd/a;->N:Lmd/a;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, v0, Lqd/s;->i:Lqd/r;

    .line 32
    .line 33
    iget-object v1, v1, Lqd/l;->i:Lqd/j;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-object v1, v0, Lqd/s;->j:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lqd/r;

    .line 53
    .line 54
    iget-object v4, v3, Lmd/e;->g:Lmd/f;

    .line 55
    .line 56
    invoke-virtual {v4, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    iget-object v1, v3, Lqd/l;->i:Lqd/j;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    const/4 v1, 0x0

    .line 66
    :goto_1
    if-eqz v1, :cond_0

    .line 67
    .line 68
    iget-object v3, v0, Lqd/s;->i:Lqd/r;

    .line 69
    .line 70
    invoke-virtual {v3, v2}, Lmd/e;->w(Lmd/a;)V

    .line 71
    .line 72
    .line 73
    iget-object v2, v0, Lqd/s;->i:Lqd/r;

    .line 74
    .line 75
    iget-object v2, v2, Lqd/l;->i:Lqd/j;

    .line 76
    .line 77
    invoke-virtual {v2, v1}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_0

    .line 82
    .line 83
    iget-object v0, v0, Lqd/s;->i:Lqd/r;

    .line 84
    .line 85
    iput-object v1, v0, Lqd/l;->i:Lqd/j;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TypeInferenceVisitor"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lud/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqe/n;->g:Lud/u;

    .line 2
    .line 3
    iget-object p1, p1, Lud/u;->g:Lqe/x;

    .line 4
    .line 5
    iput-object p1, p0, Lqe/n;->h:Lqe/x;

    .line 6
    .line 7
    return-void
.end method

.method public final g(Lud/r;)V
    .locals 2

    .line 1
    iget-boolean v0, p1, Lud/r;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p1}, Lqe/n;->j(Lud/r;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lqe/n;->l(Lud/r;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lqe/n;->m(Lud/r;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/BootstrapMethodError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    move-exception v0

    .line 17
    goto :goto_0

    .line 18
    :catch_1
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    :catch_2
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :goto_0
    const-string v1, "Type inference failed"

    .line 23
    .line 24
    invoke-static {p1, v1, v0}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :goto_1
    new-instance v1, Laf/f;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v0, "Type inference failed with stack overflow"

    .line 38
    .line 39
    invoke-static {p1, v0, v1}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :goto_2
    return-void
.end method

.method public final k(Lud/r;Lqd/s;)V
    .locals 3

    .line 1
    iget-object v0, p2, Lqd/s;->l:Lp4/t;

    .line 2
    .line 3
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lme/a;

    .line 12
    .line 13
    const/16 v2, 0x9

    .line 14
    .line 15
    invoke-direct {v1, v2}, Lme/a;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, La7/b;

    .line 23
    .line 24
    const/16 v2, 0xb

    .line 25
    .line 26
    invoke-direct {v1, v2}, La7/b;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Lqe/n;->h:Lqe/x;

    .line 34
    .line 35
    iget-object v1, v1, Lqe/x;->c:Lqe/k;

    .line 36
    .line 37
    iget-object v1, v1, Lqe/k;->b:Lc9/a0;

    .line 38
    .line 39
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->max(Ljava/util/Comparator;)Ljava/util/Optional;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_0

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    invoke-virtual {v0}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lqd/j;

    .line 55
    .line 56
    iget-object v1, p0, Lqe/n;->h:Lqe/x;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget-object v2, Lqe/a0;->b:Lqe/a0;

    .line 62
    .line 63
    invoke-virtual {v1, p1, p2, v0, v2}, Lqe/x;->c(Lud/r;Lqd/s;Lqd/j;Lqe/a0;)I

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final l(Lud/r;)V
    .locals 2

    .line 1
    iget-object p1, p1, Lud/r;->D:Ljava/util/List;

    .line 2
    .line 3
    new-instance v0, Lae/g;

    .line 4
    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    invoke-direct {v0, p0, v1}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lae/e;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lae/e;-><init>(Lqe/n;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final m(Lud/r;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lud/r;->D:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Lqe/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p1, v2}, Lqe/m;-><init>(Lqe/n;Lud/r;I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lqe/m;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, p0, p1, v2}, Lqe/m;-><init>(Lqe/n;Lud/r;I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
