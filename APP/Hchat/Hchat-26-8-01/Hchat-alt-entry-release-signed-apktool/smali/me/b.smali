.class public final Lme/b;
.super Lf1/n0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lf1/n0;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lme/b;->h:Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lme/b;->i:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final l(Lud/r;Lud/h;Lud/n;)V
    .locals 2

    .line 1
    new-instance p1, Lme/e;

    .line 2
    .line 3
    invoke-direct {p1, p3, p2}, Lme/e;-><init>(Lud/n;Lud/h;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p3, Lzd/c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p3, Lzd/c;

    .line 11
    .line 12
    iget-object p3, p3, Lzd/c;->r:Lg4/a;

    .line 13
    .line 14
    instance-of v0, p3, Lzd/b;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p3, Lzd/b;

    .line 19
    .line 20
    iget-object v0, p3, Lzd/b;->a:Lud/p;

    .line 21
    .line 22
    invoke-virtual {p0, v0, p1}, Lme/b;->p(Lud/p;Lme/e;)V

    .line 23
    .line 24
    .line 25
    iget-object p3, p3, Lzd/b;->b:Lud/p;

    .line 26
    .line 27
    invoke-virtual {p0, p3, p1}, Lme/b;->p(Lud/p;Lme/e;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-interface {p2}, Lud/h;->g()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    const/4 v0, 0x0

    .line 39
    :goto_0
    if-ge v0, p3, :cond_1

    .line 40
    .line 41
    invoke-interface {p2}, Lud/h;->g()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lud/p;

    .line 50
    .line 51
    invoke-virtual {p0, v1, p1}, Lme/b;->p(Lud/p;Lme/e;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    return-void
.end method

.method public final p(Lud/p;Lme/e;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p1, Lud/p;->l:Lqd/r;

    .line 5
    .line 6
    iget-object v1, p0, Lme/b;->i:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    sget-object v2, Lmd/a;->s:Lmd/a;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v3, v0, Lmd/e;->g:Lmd/f;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    iget-object v0, v0, Lqd/r;->m:Lqd/s;

    .line 21
    .line 22
    new-instance v3, Lme/a;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-direct {v3, v4}, Lme/a;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, v0, v3}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lme/f;

    .line 33
    .line 34
    iget-object v0, v0, Lme/f;->b:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v0, p0, Lme/b;->h:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lud/p;->U(Ljava/util/Collection;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lqd/r;

    .line 62
    .line 63
    iget-object v3, v0, Lmd/e;->g:Lmd/f;

    .line 64
    .line 65
    invoke-virtual {v3, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_2

    .line 70
    .line 71
    iget-object v0, v0, Lqd/r;->m:Lqd/s;

    .line 72
    .line 73
    new-instance v3, Lme/a;

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    invoke-direct {v3, v4}, Lme/a;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v1, v0, v3}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Lme/f;

    .line 84
    .line 85
    iget-object v0, v0, Lme/f;->c:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    :goto_1
    return-void
.end method
