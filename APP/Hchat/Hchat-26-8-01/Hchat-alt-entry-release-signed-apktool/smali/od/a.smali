.class public final Lod/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:Lqd/j;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Lod/a;

.field public l:Lg8/h;


# direct methods
.method public constructor <init>(Lud/u;Lqd/j;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lod/a;->g:Lqd/j;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3}, Lod/a;->r(Lud/u;Lqd/j;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static d(Lud/u;Ljava/lang/String;)Lod/a;
    .locals 0

    .line 1
    invoke-static {p1}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0, p1}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static e(Lud/u;Lqd/j;)Lod/a;
    .locals 2

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    instance-of v0, p1, Lqd/a;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lqd/j;->k:Lqd/e;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1}, Lqd/j;->v()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    instance-of v0, p1, Lqd/c;

    .line 17
    .line 18
    if-nez v0, :cond_4

    .line 19
    .line 20
    invoke-virtual {p1}, Lqd/j;->t()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Lqd/j;->l()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_1
    :goto_0
    iget-object v0, p0, Lud/u;->e:Lbe/k;

    .line 35
    .line 36
    iget-object v0, v0, Lbe/k;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lod/a;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    iget-object v0, p0, Lud/u;->a:Lbc/g;

    .line 50
    .line 51
    iget-boolean v0, v0, Lbc/g;->v:Z

    .line 52
    .line 53
    new-instance v1, Lod/a;

    .line 54
    .line 55
    invoke-direct {v1, p0, p1, v0}, Lod/a;-><init>(Lud/u;Lqd/j;Z)V

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Lud/u;->e:Lbe/k;

    .line 59
    .line 60
    iget-object v0, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Ljava/util/HashMap;

    .line 63
    .line 64
    monitor-enter v0

    .line 65
    :try_start_0
    iget-object p0, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-virtual {p0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, Lod/a;

    .line 74
    .line 75
    if-nez p0, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    move-object v1, p0

    .line 79
    :goto_1
    monitor-exit v0

    .line 80
    return-object v1

    .line 81
    :catchall_0
    move-exception p0

    .line 82
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    throw p0

    .line 84
    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const-string p1, "Not class type: "

    .line 89
    .line 90
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :goto_2
    const/4 p0, 0x0

    .line 98
    return-object p0

    .line 99
    :cond_5
    const-string p0, "Null class type"

    .line 100
    .line 101
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;Lod/a;ZZ)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p2, :cond_4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/16 p0, 0x24

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 p0, 0x2e

    .line 9
    .line 10
    :goto_0
    if-eqz p3, :cond_2

    .line 11
    .line 12
    if-eqz p4, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2}, Lod/a;->j()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-virtual {p2}, Lod/a;->k()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    iget-object p2, p2, Lod/a;->k:Lod/a;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-static {p3, p4, p2, v0, v0}, Lod/a;->p(Ljava/lang/String;Ljava/lang/String;Lod/a;ZZ)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {p2}, Lod/a;->f()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    if-eqz p4, :cond_3

    .line 36
    .line 37
    invoke-virtual {p2}, Lod/a;->q()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    iget-object p2, p2, Lod/a;->j:Ljava/lang/String;

    .line 43
    .line 44
    :goto_1
    new-instance p3, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_5

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_5
    const-string p2, "."

    .line 71
    .line 72
    invoke-static {p0, p2, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lod/a;->j()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lod/a;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-static {p1}, Lxe/q;->g(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Lg8/h;

    .line 21
    .line 22
    invoke-direct {v1, v0, p1}, Lg8/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lod/a;->l()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    new-instance v1, Lg8/h;

    .line 39
    .line 40
    iget-object p1, p0, Lod/a;->h:Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {v1, v0, p1}, Lg8/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    if-eqz v1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lod/a;->c(Lg8/h;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    iput-object v1, p0, Lod/a;->l:Lg8/h;

    .line 51
    .line 52
    return-void
.end method

.method public final b(Lod/a;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lod/a;->g:Lqd/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqd/j;->l()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p1, p1, Lod/a;->g:Lqd/j;

    .line 8
    .line 9
    invoke-virtual {p1}, Lqd/j;->l()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final c(Lg8/h;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lod/a;->k:Lod/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lg8/h;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p1, Lg8/h;->b:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-static {v0, v1, v4, v2, v3}, Lod/a;->p(Ljava/lang/String;Ljava/lang/String;Lod/a;ZZ)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p1, Lg8/h;->d:Ljava/lang/String;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lod/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lod/a;->b(Lod/a;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lod/a;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Lod/a;

    .line 10
    .line 11
    iget-object p1, p1, Lod/a;->g:Lqd/j;

    .line 12
    .line 13
    iget-object v0, p0, Lod/a;->g:Lqd/j;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public final f()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lod/a;->l:Lg8/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Lg8/h;->d:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lod/a;->j()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, Lod/a;->k()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, p0, Lod/a;->k:Lod/a;

    .line 20
    .line 21
    invoke-static {v0, v3, v4, v2, v1}, Lod/a;->p(Ljava/lang/String;Ljava/lang/String;Lod/a;ZZ)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_0
    return-object v0

    .line 26
    :cond_1
    iget-object v0, p0, Lod/a;->k:Lod/a;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Lod/a;->n()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Lod/a;->j()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p0}, Lod/a;->k()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v4, p0, Lod/a;->k:Lod/a;

    .line 45
    .line 46
    invoke-static {v0, v3, v4, v2, v1}, Lod/a;->p(Ljava/lang/String;Ljava/lang/String;Lod/a;ZZ)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :cond_2
    iget-object v0, p0, Lod/a;->j:Ljava/lang/String;

    .line 52
    .line 53
    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lod/a;->j()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-char v1, Ljava/io/File;->separatorChar:C

    .line 6
    .line 7
    const/16 v2, 0x2e

    .line 8
    .line 9
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lod/a;->i()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/16 v4, 0x5f

    .line 18
    .line 19
    invoke-virtual {v3, v2, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lod/a;->g:Lqd/j;

    .line 2
    .line 3
    iget v0, v0, Lqd/j;->a:I

    .line 4
    .line 5
    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lod/a;->k:Lod/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lod/a;->k()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lod/a;->i()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Lod/a;->k()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "."

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lod/a;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lod/a;->k:Lod/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lod/a;->j()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lod/a;->l:Lg8/h;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lod/a;->l()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_1
    iget-object v0, v0, Lg8/h;->c:Ljava/lang/String;

    .line 24
    .line 25
    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/a;->l:Lg8/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lod/a;->h:Ljava/lang/String;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, v0, Lg8/h;->b:Ljava/lang/String;

    .line 9
    .line 10
    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/a;->k:Lod/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lod/a;->l()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lod/a;->i:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_1
    const-string v0, "Package is null for not inner class"

    .line 16
    .line 17
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public final m()Lod/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/a;->k:Lod/a;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lod/a;->m()Lod/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lod/a;->k:Lod/a;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    return-object v0
.end method

.method public final n()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lod/a;->l:Lg8/h;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Lg8/h;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Lod/a;->h:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    iget-object v0, p0, Lod/a;->k:Lod/a;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lod/a;->n()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lod/a;->k:Lod/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final q()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lod/a;->i:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lod/a;->h:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lod/a;->k:Lod/a;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    invoke-static {v0, v1, v2, v3, v4}, Lod/a;->p(Ljava/lang/String;Ljava/lang/String;Lod/a;ZZ)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final r(Lud/u;Lqd/j;Z)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Lqd/j;->l()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/16 v0, 0x2e

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    const-string v0, ""

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p2, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    add-int/2addr v0, v2

    .line 24
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    move-object v0, v1

    .line 29
    :goto_0
    const/4 v1, 0x0

    .line 30
    if-eqz p3, :cond_2

    .line 31
    .line 32
    const/16 p3, 0x24

    .line 33
    .line 34
    invoke-virtual {p2, p3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    if-lez p3, :cond_2

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    sub-int/2addr v4, v2

    .line 45
    if-eq p3, v4, :cond_2

    .line 46
    .line 47
    invoke-virtual {p2, v3, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const-string v5, "."

    .line 52
    .line 53
    invoke-static {v0, v5, v4}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_1

    .line 62
    .line 63
    invoke-virtual {p2, v3, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    :cond_1
    iput-object v1, p0, Lod/a;->i:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v4}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {p1, v4}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lod/a;->k:Lod/a;

    .line 78
    .line 79
    add-int/2addr p3, v2

    .line 80
    invoke-virtual {p2, p3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move v2, v3

    .line 86
    :goto_1
    if-nez v2, :cond_3

    .line 87
    .line 88
    iput-object v0, p0, Lod/a;->i:Ljava/lang/String;

    .line 89
    .line 90
    iput-object v1, p0, Lod/a;->k:Lod/a;

    .line 91
    .line 92
    :cond_3
    iput-object p2, p0, Lod/a;->h:Ljava/lang/String;

    .line 93
    .line 94
    iget-object p1, p0, Lod/a;->i:Ljava/lang/String;

    .line 95
    .line 96
    iget-object p3, p0, Lod/a;->k:Lod/a;

    .line 97
    .line 98
    invoke-static {p1, p2, p3, v3, v3}, Lod/a;->p(Ljava/lang/String;Ljava/lang/String;Lod/a;ZZ)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iput-object p1, p0, Lod/a;->j:Ljava/lang/String;

    .line 103
    .line 104
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/a;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
