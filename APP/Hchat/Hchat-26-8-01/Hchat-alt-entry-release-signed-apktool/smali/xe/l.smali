.class public final Lxe/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lxe/l;->b:Ljava/lang/Object;

    .line 18
    iput-object p2, p0, Lxe/l;->c:Ljava/lang/Object;

    .line 19
    iput-object p3, p0, Lxe/l;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lxe/l;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lud/r;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxe/l;->b:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lxe/l;->c:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public static d(Lud/r;Lud/p;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    sget-object v0, Lmd/a;->S:Lmd/a;

    .line 5
    .line 6
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {p0, p1}, Lxe/l;->j(Lud/r;Lud/p;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    iget-object v0, p0, Lud/r;->z:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {p0, p1, v0}, La/a;->S(Lud/r;Lud/p;Ljava/util/List;)Lud/a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-static {p0, p1}, Lxe/l;->j(Lud/r;Lud/p;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v0, p1}, Lxe/l;->g(Lud/r;Lud/a;Lud/p;)Z

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    sget-object v0, Lmd/a;->s:Lmd/a;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lmd/e;->w(Lmd/a;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v0, "Not found block with instruction: "

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static e(Ljava/util/List;Ljava/util/List;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lud/p;

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/4 v2, 0x0

    .line 31
    :goto_1
    if-ge v2, v1, :cond_1

    .line 32
    .line 33
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-ne v3, v0, :cond_2

    .line 38
    .line 39
    invoke-interface {p0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    :goto_2
    return-void
.end method

.method public static f(Lud/r;)V
    .locals 6

    .line 1
    new-instance v0, Lxe/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lxe/l;-><init>(Lud/r;I)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lud/r;->z:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lud/a;

    .line 24
    .line 25
    iget-object v2, v1, Lud/a;->l:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lud/p;

    .line 42
    .line 43
    sget-object v4, Lmd/a;->u:Lmd/a;

    .line 44
    .line 45
    iget-object v5, v3, Lmd/e;->g:Lmd/f;

    .line 46
    .line 47
    invoke-virtual {v5, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    iget-object v4, v0, Lxe/l;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v4, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iget-object v1, v1, Lud/a;->l:Ljava/util/ArrayList;

    .line 62
    .line 63
    iput-object v1, v0, Lxe/l;->a:Ljava/lang/Object;

    .line 64
    .line 65
    invoke-virtual {v0}, Lxe/l;->c()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    return-void
.end method

.method public static g(Lud/r;Lud/a;Lud/p;)Z
    .locals 2

    .line 1
    iget-object v0, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lud/p;

    .line 18
    .line 19
    if-ne v1, p2, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_1
    sget-object v0, Lmd/a;->S:Lmd/a;

    .line 27
    .line 28
    iget-object v1, p2, Lmd/e;->g:Lmd/f;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v1, "Failed to remove instruction: "

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p2, " from block: "

    .line 55
    .line 56
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0, p1}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    const/4 p0, 0x0

    .line 70
    return p0
.end method

.method public static h(Lud/r;Lud/p;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lqd/l;

    .line 18
    .line 19
    invoke-static {p0, v1}, Lxe/l;->i(Lud/r;Lqd/l;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p0, p1, Lud/p;->k:Lpd/k;

    .line 24
    .line 25
    sget-object v0, Lpd/k;->X:Lpd/k;

    .line 26
    .line 27
    if-ne p0, v0, :cond_2

    .line 28
    .line 29
    iget-object p0, p1, Lud/p;->m:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lqd/l;

    .line 46
    .line 47
    instance-of v1, v0, Lqd/r;

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    check-cast v0, Lqd/r;

    .line 52
    .line 53
    iget-object v0, v0, Lqd/r;->m:Lqd/s;

    .line 54
    .line 55
    invoke-virtual {v0}, Lqd/s;->p()V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    sget-object p0, Lmd/a;->u:Lmd/a;

    .line 60
    .line 61
    invoke-virtual {p1, p0}, Lmd/e;->w(Lmd/a;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lmd/a;->s:Lmd/a;

    .line 65
    .line 66
    invoke-virtual {p1, p0}, Lmd/e;->w(Lmd/a;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public static i(Lud/r;Lqd/l;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lqd/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lqd/r;

    .line 6
    .line 7
    iget-object p0, p1, Lqd/r;->m:Lqd/s;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lqd/s;->k(Lqd/r;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    instance-of v0, p1, Lqd/m;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p1, Lqd/m;

    .line 20
    .line 21
    iget-object p1, p1, Lqd/m;->l:Lud/p;

    .line 22
    .line 23
    invoke-static {p0, p1}, Lxe/l;->j(Lud/r;Lud/p;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public static j(Lud/r;Lud/p;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe/l;->h(Lud/r;Lud/p;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lxe/l;->l(Lud/r;Lud/p;)V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lmd/a;->s:Lmd/a;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lmd/e;->w(Lmd/a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static k(Lud/r;Ljava/util/List;)V
    .locals 2

    .line 1
    new-instance v0, Lce/d;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, p0, v1}, Lce/d;-><init>(Lud/r;I)V

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lce/d;

    .line 11
    .line 12
    const/4 v1, 0x7

    .line 13
    invoke-direct {v0, p0, v1}, Lce/d;-><init>(Lud/r;I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static l(Lud/r;Lud/p;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lud/p;->l:Lqd/r;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    if-eqz p0, :cond_7

    .line 8
    .line 9
    iget-object v0, v0, Lqd/r;->m:Lqd/s;

    .line 10
    .line 11
    if-eqz v0, :cond_7

    .line 12
    .line 13
    iget-object v2, v0, Lqd/s;->j:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v3, v0, Lqd/s;->i:Lqd/r;

    .line 16
    .line 17
    iget-object v3, v3, Lqd/l;->j:Lud/p;

    .line 18
    .line 19
    if-ne v3, p1, :cond_7

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    iget-object p0, p0, Lud/r;->D:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {p0, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_1
    new-instance v4, Lud/b;

    .line 35
    .line 36
    const/4 v5, 0x4

    .line 37
    invoke-direct {v4, v5}, Lud/b;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v4}, Lbe/h;->g(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_4

    .line 45
    .line 46
    new-instance v3, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lqd/r;

    .line 66
    .line 67
    iget-object v4, v3, Lqd/l;->j:Lud/p;

    .line 68
    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    check-cast v4, Lpd/q;

    .line 72
    .line 73
    invoke-virtual {v4, v3}, Lpd/q;->l0(Lqd/r;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    iget-object p0, p0, Lud/r;->D:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {p0, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    new-instance v4, Lud/b;

    .line 84
    .line 85
    const/4 v5, 0x5

    .line 86
    invoke-direct {v4, v5}, Lud/b;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v4}, Lbe/h;->g(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_6

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_5

    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Lqd/r;

    .line 110
    .line 111
    iput-object v1, v3, Lqd/r;->m:Lqd/s;

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_5
    iget-object p0, p0, Lud/r;->D:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {p0, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    new-instance p0, Laf/g;

    .line 121
    .line 122
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    new-instance v1, Lme/a;

    .line 131
    .line 132
    const/16 v2, 0x1b

    .line 133
    .line 134
    invoke-direct {v1, v2}, Lme/a;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-string v1, "\n  "

    .line 142
    .line 143
    invoke-static {v1}, Ljava/util/stream/Collectors;->joining(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Ljava/lang/String;

    .line 152
    .line 153
    const-string v1, ", still in use, count: "

    .line 154
    .line 155
    const-string v2, ", list:\n  "

    .line 156
    .line 157
    const-string v4, "Can\'t remove SSA var: "

    .line 158
    .line 159
    invoke-static {v3, v4, p1, v1, v2}, Leh/a;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw p0

    .line 174
    :cond_7
    :goto_2
    iput-object v1, p1, Lud/p;->l:Lqd/r;

    .line 175
    .line 176
    return-void
.end method


# virtual methods
.method public a(Lud/p;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxe/l;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lxe/l;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lud/r;

    .line 11
    .line 12
    invoke-static {v0, p1}, Lxe/l;->j(Lud/r;Lud/p;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/function/Function;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lxe/l;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-static {p1}, Lxe/s;->h(Ljava/util/Collection;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_0

    .line 12
    .line 13
    :cond_0
    new-instance v1, Lbc/j;

    .line 14
    .line 15
    const/16 v2, 0xe

    .line 16
    .line 17
    invoke-direct {v1, p2, v2}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v1}, Lbe/h;->K(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance v1, Lme/a;

    .line 29
    .line 30
    const/16 v2, 0x1c

    .line 31
    .line 32
    invoke-direct {v1, v2}, Lme/a;-><init>(I)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lme/a;

    .line 36
    .line 37
    const/16 v3, 0x1d

    .line 38
    .line 39
    invoke-direct {v2, v3}, Lme/a;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Ljava/util/stream/Collectors;->toMap(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {p2, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Ljava/util/Map;

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    new-instance p2, Lwb/kn;

    .line 63
    .line 64
    invoke-direct {p2, v0}, Lwb/kn;-><init>(Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    sget-object v1, Lxe/o;->g:Lxe/o;

    .line 68
    .line 69
    invoke-interface {p2, v1}, Ljava/util/Comparator;->thenComparing(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-interface {p1, p2}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 74
    .line 75
    .line 76
    new-instance p2, Ljava/util/IdentityHashMap;

    .line 77
    .line 78
    invoke-direct {p2}, Ljava/util/IdentityHashMap;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object p2, p0, Lxe/l;->c:Ljava/lang/Object;

    .line 82
    .line 83
    new-instance p2, Lae/g;

    .line 84
    .line 85
    const/16 v1, 0x15

    .line 86
    .line 87
    invoke-direct {p2, p0, v1}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, p2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 91
    .line 92
    .line 93
    new-instance p2, Lud/d;

    .line 94
    .line 95
    invoke-direct {p2, p0}, Lud/d;-><init>(Lxe/l;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, p2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    new-instance v0, Lme/a;

    .line 106
    .line 107
    const/16 v1, 0x1c

    .line 108
    .line 109
    invoke-direct {v0, v1}, Lme/a;-><init>(I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p2, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-static {}, Ljava/util/stream/Collectors;->toSet()Ljava/util/stream/Collector;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-interface {p2, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    check-cast p2, Ljava/util/Set;

    .line 125
    .line 126
    iput-object p2, p0, Lxe/l;->b:Ljava/lang/Object;

    .line 127
    .line 128
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-nez p2, :cond_1

    .line 137
    .line 138
    :goto_0
    return-void

    .line 139
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Lxe/p;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    const/4 p1, 0x0

    .line 149
    throw p1

    .line 150
    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    check-cast p1, Lxe/p;

    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    const/4 p1, 0x0

    .line 160
    throw p1
.end method

.method public c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lxe/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lud/r;

    .line 4
    .line 5
    iget-object v1, p0, Lxe/l;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v2, p0, Lxe/l;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Ljava/util/List;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lud/p;

    .line 37
    .line 38
    invoke-static {v0, v3}, Lxe/l;->d(Lud/r;Lud/p;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-static {v0, v1}, Lxe/l;->k(Lud/r;Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lxe/l;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/util/List;

    .line 48
    .line 49
    invoke-static {v0, v1}, Lxe/l;->e(Ljava/util/List;Ljava/util/List;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 53
    .line 54
    .line 55
    return-void
.end method
