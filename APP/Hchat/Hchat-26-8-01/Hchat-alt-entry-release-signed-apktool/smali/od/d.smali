.class public final Lod/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:Ljava/lang/String;

.field public final h:Lqd/j;

.field public final i:Ljava/util/List;

.field public final j:Lod/a;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:I

.field public n:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lod/d;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lod/d;->n:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p1, p0, Lod/d;->j:Lod/a;

    .line 9
    .line 10
    iput-object p3, p0, Lod/d;->i:Ljava/util/List;

    .line 11
    .line 12
    iput-object p4, p0, Lod/d;->h:Lqd/j;

    .line 13
    .line 14
    invoke-static {p2, p3, p4}, Lod/d;->i(Ljava/lang/String;Ljava/util/List;Lqd/j;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iput-object p2, p0, Lod/d;->k:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p1}, Lod/a;->q()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    const-string p4, "."

    .line 25
    .line 26
    invoke-static {p3, p4, p2}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    iput-object p3, p0, Lod/d;->l:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iget-object p1, p1, Lod/a;->g:Lqd/j;

    .line 37
    .line 38
    iget p1, p1, Lqd/j;->a:I

    .line 39
    .line 40
    mul-int/lit8 p1, p1, 0x1f

    .line 41
    .line 42
    add-int/2addr p1, p2

    .line 43
    iput p1, p0, Lod/d;->m:I

    .line 44
    .line 45
    return-void
.end method

.method public static b(Lud/u;Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)Lod/d;
    .locals 1

    .line 1
    new-instance v0, Lod/d;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lod/d;-><init>(Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lud/u;->e:Lbe/k;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lbe/k;->o(Lod/d;)Lod/d;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static c(Lud/u;Lod/a;Ljava/lang/String;Lmc/a;)Lod/d;
    .locals 3

    .line 1
    invoke-interface {p3}, Lmc/a;->c()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lme/a;

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-direct {v1, v2}, Lme/a;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p3}, Lmc/a;->e()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-static {p3}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-static {p0, p1, p2, v0, p3}, Lod/d;->b(Lud/u;Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)Lod/d;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static d(Lud/u;Ljf/h;)Lod/d;
    .locals 6

    .line 1
    iget-object v0, p0, Lud/u;->e:Lbe/k;

    .line 2
    .line 3
    iget v1, p1, Ljf/h;->a:I

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v2, v0, Lbe/k;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    monitor-enter v2

    .line 12
    :try_start_0
    iget-object v3, v0, Lbe/k;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lod/d;

    .line 25
    .line 26
    monitor-exit v2

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    return-object v3

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw p0

    .line 33
    :cond_0
    invoke-virtual {p1}, Ljf/h;->a()V

    .line 34
    .line 35
    .line 36
    iget-object v2, p1, Ljf/h;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v2}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {p0, v2}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    iget-object v2, p1, Ljf/h;->d:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v2}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-object v3, p1, Ljf/h;->e:Ljava/util/List;

    .line 53
    .line 54
    new-instance v4, Lme/a;

    .line 55
    .line 56
    const/4 v5, 0x6

    .line 57
    invoke-direct {v4, v5}, Lme/a;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v3, v4}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    new-instance v4, Lod/d;

    .line 65
    .line 66
    iget-object p1, p1, Ljf/h;->b:Ljava/lang/String;

    .line 67
    .line 68
    invoke-direct {v4, p0, p1, v3, v2}, Lod/d;-><init>(Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v4}, Lbe/k;->o(Lod/d;)Lod/d;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    iget-object p1, v0, Lbe/k;->d:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, Ljava/util/HashMap;

    .line 80
    .line 81
    monitor-enter p1

    .line 82
    :try_start_1
    iget-object v0, v0, Lbe/k;->d:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Ljava/util/HashMap;

    .line 85
    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    monitor-exit p1

    .line 94
    return-object p0

    .line 95
    :catchall_1
    move-exception p0

    .line 96
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 97
    throw p0

    .line 98
    :cond_1
    return-object p0
.end method

.method public static i(Ljava/lang/String;Ljava/util/List;Lqd/j;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const/16 p0, 0x28

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lqd/j;

    .line 29
    .line 30
    invoke-static {p1}, Lfd/j;->b(Lqd/j;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/16 p0, 0x29

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    invoke-static {p2}, Lfd/j;->b(Lqd/j;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method


# virtual methods
.method public final a(Lod/d;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lod/d;->j:Lod/a;

    .line 2
    .line 3
    iget-object v1, p1, Lod/d;->j:Lod/a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lod/a;->b(Lod/a;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    iget-object v0, p0, Lod/d;->k:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p1, p1, Lod/d;->k:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lod/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lod/d;->a(Lod/d;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lod/d;->g:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "<clinit>"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lod/d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lod/d;

    .line 12
    .line 13
    iget-object v1, p0, Lod/d;->k:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lod/d;->k:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lod/d;->j:Lod/a;

    .line 24
    .line 25
    iget-object p1, p1, Lod/d;->j:Lod/a;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lod/a;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    return v0

    .line 34
    :cond_2
    return v2
.end method

.method public final f()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lod/d;->g:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "<init>"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final g(Lod/d;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lod/d;->i:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p1, Lod/d;->i:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lod/d;->g:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v1, p1, Lod/d;->g:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lod/d;->k:Ljava/lang/String;

    .line 26
    .line 27
    iget-object p1, p1, Lod/d;->k:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_0
    const/4 p1, 0x0

    .line 38
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lod/d;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public final j(ZZ)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lod/d;->n:Ljava/lang/String;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lod/d;->g:Ljava/lang/String;

    .line 7
    .line 8
    :goto_0
    if-eqz p2, :cond_1

    .line 9
    .line 10
    iget-object p2, p0, Lod/d;->h:Lqd/j;

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    const/4 p2, 0x0

    .line 14
    :goto_1
    iget-object v0, p0, Lod/d;->i:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {p1, v0, p2}, Lod/d;->i(Ljava/lang/String;Ljava/util/List;Lqd/j;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lod/d;->j:Lod/a;

    .line 2
    .line 3
    iget-object v0, v0, Lod/a;->j:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lod/d;->i:Ljava/util/List;

    .line 6
    .line 7
    const-string v2, ", "

    .line 8
    .line 9
    invoke-static {v1, v2}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lod/d;->h:Lqd/j;

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, "."

    .line 28
    .line 29
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lod/d;->g:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, "("

    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, "):"

    .line 46
    .line 47
    invoke-static {v3, v0, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
.end method
