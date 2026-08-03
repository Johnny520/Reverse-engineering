.class public final Lud/s;
.super Lnd/r;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lud/k;
.implements Lhc/c;
.implements Ljava/lang/Comparable;


# instance fields
.field public final k:Lud/u;

.field public final l:Lod/e;

.field public final m:Lud/s;

.field public final n:Ljava/util/ArrayList;

.field public final o:Ljava/util/ArrayList;

.field public p:Lod/e;


# direct methods
.method public constructor <init>(Lud/u;Lud/s;Lod/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lud/s;->n:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lud/s;->o:Ljava/util/ArrayList;

    .line 17
    .line 18
    iput-object p1, p0, Lud/s;->k:Lud/u;

    .line 19
    .line 20
    iput-object p2, p0, Lud/s;->m:Lud/s;

    .line 21
    .line 22
    iput-object p3, p0, Lud/s;->l:Lod/e;

    .line 23
    .line 24
    iput-object p3, p0, Lud/s;->p:Lod/e;

    .line 25
    .line 26
    return-void
.end method

.method public static I(Lud/u;Ljava/lang/String;)Lud/s;
    .locals 2

    .line 1
    iget-object v0, p0, Lud/u;->o:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lud/s;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {p0, p1}, Lod/e;->a(Lud/u;Ljava/lang/String;)Lod/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p1, Lod/e;->a:Lod/e;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, v0, Lod/e;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p0, v0}, Lud/s;->I(Lud/u;Ljava/lang/String;)Lud/s;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    new-instance v1, Lud/s;

    .line 29
    .line 30
    invoke-direct {v1, p0, v0, p1}, Lud/s;-><init>(Lud/u;Lud/s;Lod/e;)V

    .line 31
    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object p1, v0, Lud/s;->n:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object p1, p0, Lud/u;->o:Ljava/util/HashMap;

    .line 41
    .line 42
    iget-object v0, v1, Lud/s;->l:Lod/e;

    .line 43
    .line 44
    iget-object v0, v0, Lod/e;->b:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lud/u;->p:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    return-object v1
.end method


# virtual methods
.method public final J()V
    .locals 5

    .line 1
    iget-object v0, p0, Lud/s;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

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
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lud/s;

    .line 18
    .line 19
    iget-object v2, v1, Lud/s;->k:Lud/u;

    .line 20
    .line 21
    iget-object v3, v1, Lud/s;->m:Lud/s;

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    iget-object v3, v3, Lud/s;->p:Lod/e;

    .line 28
    .line 29
    :goto_1
    iget-object v4, v1, Lud/s;->p:Lod/e;

    .line 30
    .line 31
    iget-object v4, v4, Lod/e;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, v3, v4}, Lod/e;->b(Lud/u;Lod/e;Ljava/lang/String;)Lod/e;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iput-object v2, v1, Lud/s;->p:Lod/e;

    .line 38
    .line 39
    invoke-virtual {v1}, Lud/s;->J()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v0, p0, Lud/s;->o:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_5

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lud/e;

    .line 60
    .line 61
    iget-object v2, v1, Lud/e;->m:Lod/a;

    .line 62
    .line 63
    invoke-virtual {v2}, Lod/a;->o()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    iget-object v1, v1, Lud/e;->n:Lud/s;

    .line 71
    .line 72
    iget-object v1, v1, Lud/s;->p:Lod/e;

    .line 73
    .line 74
    iget-object v1, v1, Lod/e;->b:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v2}, Lod/a;->o()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_4

    .line 81
    .line 82
    invoke-virtual {v2}, Lod/a;->j()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-static {v3, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-nez v3, :cond_2

    .line 91
    .line 92
    new-instance v3, Lg8/h;

    .line 93
    .line 94
    invoke-virtual {v2}, Lod/a;->k()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-direct {v3, v1, v4}, Lg8/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v3}, Lod/a;->c(Lg8/h;)V

    .line 102
    .line 103
    .line 104
    iput-object v3, v2, Lod/a;->l:Lg8/h;

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const-string v1, "Can\'t change package for inner class: "

    .line 112
    .line 113
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_5
    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lud/s;

    .line 2
    .line 3
    iget-object v0, p0, Lud/s;->l:Lod/e;

    .line 4
    .line 5
    iget-object v0, v0, Lod/e;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p1, p1, Lud/s;->l:Lod/e;

    .line 8
    .line 9
    iget-object p1, p1, Lod/e;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
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
    instance-of v0, p1, Lud/s;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Lud/s;

    .line 12
    .line 13
    iget-object p1, p1, Lud/s;->l:Lod/e;

    .line 14
    .line 15
    iget-object v0, p0, Lud/s;->l:Lod/e;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lod/e;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lud/s;->l:Lod/e;

    .line 2
    .line 3
    iget-object v0, v0, Lod/e;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final j()I
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    return v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Lud/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/s;->k:Lud/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/s;->l:Lod/e;

    .line 2
    .line 3
    iget-object v0, v0, Lod/e;->b:Ljava/lang/String;

    .line 4
    .line 5
    return-object v0
.end method

.method public final typeName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "package"

    .line 2
    .line 3
    return-object v0
.end method
