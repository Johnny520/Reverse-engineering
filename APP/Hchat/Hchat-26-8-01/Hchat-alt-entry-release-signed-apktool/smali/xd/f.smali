.class public final Lxd/f;
.super Lxd/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lud/i;


# instance fields
.field public final k:Lxd/b;

.field public l:Ljava/util/Map;

.field public m:Lud/j;

.field public n:Lae/h;


# direct methods
.method public constructor <init>(Lud/n;Lxd/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lxd/a;-><init>(Lud/n;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 5
    .line 6
    iput-object p1, p0, Lxd/f;->l:Ljava/util/Map;

    .line 7
    .line 8
    iput-object p2, p0, Lxd/f;->k:Lxd/b;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Lfd/i;Lfc/f;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lfd/e;->b:Lud/r;

    .line 2
    .line 3
    const-string v1, "try {"

    .line 4
    .line 5
    invoke-virtual {p2, v1}, Lfc/f;->r(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lxd/f;->n:Lae/h;

    .line 9
    .line 10
    iget-object v1, v1, Lae/h;->i:Ljava/util/List;

    .line 11
    .line 12
    sget-object v2, Lxe/s;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    move-object v1, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x0

    .line 24
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_0
    check-cast v1, Lud/h;

    .line 29
    .line 30
    invoke-static {v1}, La/a;->W(Lud/h;)Lud/p;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {p2, v1}, Lic/a;->a(Lfc/f;Lud/p;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p2, v0, v1}, Ljd/c;->a(Lfc/f;Lnd/b0;Lmd/i;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lxd/f;->k:Lxd/b;

    .line 41
    .line 42
    invoke-virtual {p1, p2, v1}, Lfd/i;->v(Lfc/f;Lud/j;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lxd/f;->l:Ljava/util/Map;

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Ljava/util/Map$Entry;

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Lae/f;

    .line 72
    .line 73
    invoke-virtual {v2}, Lae/f;->c()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    if-eqz v3, :cond_1

    .line 80
    .line 81
    sget-object v3, Lfd/i;->h:Lmh/b;

    .line 82
    .line 83
    const-string v4, "Several \'all\' handlers in try/catch block in {}"

    .line 84
    .line 85
    invoke-interface {v3, v0, v4}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    move-object v3, v2

    .line 89
    goto :goto_1

    .line 90
    :cond_2
    invoke-virtual {p1, p2, v2}, Lfd/i;->s(Lfc/f;Lae/f;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    if-eqz v3, :cond_4

    .line 95
    .line 96
    invoke-virtual {p1, p2, v3}, Lfd/i;->s(Lfc/f;Lae/f;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    iget-object v0, p0, Lxd/f;->m:Lud/j;

    .line 100
    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    const-string v1, "} finally {"

    .line 104
    .line 105
    invoke-virtual {p2, v1}, Lfc/f;->r(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, p2, v0}, Lfd/i;->v(Lfc/f;Lud/j;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    invoke-virtual {p2}, Lfc/f;->q()V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lxd/f;->k:Lxd/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxd/b;->k()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Try: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lxd/f;->k:Lxd/b;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lxd/f;->l:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const-string v1, " catches: "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lxd/f;->l:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, ", "

    .line 33
    .line 34
    invoke-static {v1, v2}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v1, p0, Lxd/f;->m:Lud/j;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const-string v1, " finally: "

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lxd/f;->m:Lud/j;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0
.end method

.method public final u()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lxd/f;->l:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lxd/f;->k:Lxd/b;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lxd/f;->l:Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lxd/f;->m:Lud/j;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method
