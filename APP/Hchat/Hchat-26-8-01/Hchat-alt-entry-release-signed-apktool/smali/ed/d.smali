.class public final Led/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lud/m;
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:Lod/d;

.field public final h:Ljava/util/List;

.field public final i:Lqd/j;

.field public final j:Ljava/util/List;

.field public final k:Ljava/util/List;

.field public final l:I


# direct methods
.method public constructor <init>(Lod/d;Ljava/util/List;Lqd/j;Ljava/util/List;Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Led/d;->g:Lod/d;

    .line 5
    .line 6
    iput-object p2, p0, Led/d;->h:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Led/d;->i:Lqd/j;

    .line 9
    .line 10
    iput-object p4, p0, Led/d;->j:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Led/d;->k:Ljava/util/List;

    .line 13
    .line 14
    iput p6, p0, Led/d;->l:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Led/d;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Led/d;

    .line 2
    .line 3
    iget-object v0, p0, Led/d;->g:Lod/d;

    .line 4
    .line 5
    iget-object p1, p1, Led/d;->g:Lod/d;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lod/d;->a(Lod/d;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final d()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-super {p0}, Lud/m;->d()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, " (c)"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final e()Lqd/j;
    .locals 1

    .line 1
    iget-object v0, p0, Led/d;->i:Lqd/j;

    .line 2
    .line 3
    return-object v0
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
    instance-of v0, p1, Led/d;

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
    check-cast p1, Led/d;

    .line 12
    .line 13
    iget-object v0, p0, Led/d;->g:Lod/d;

    .line 14
    .line 15
    iget-object p1, p1, Led/d;->g:Lod/d;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lod/d;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Led/d;->j:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Led/d;->g:Lod/d;

    .line 2
    .line 3
    iget v0, v0, Lod/d;->m:I

    .line 4
    .line 5
    return v0
.end method

.method public final o()I
    .locals 1

    .line 1
    iget v0, p0, Led/d;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public final q()Lod/d;
    .locals 1

    .line 1
    iget-object v0, p0, Led/d;->g:Lod/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Led/d;->k:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ClspMth{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Led/d;->j:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {v1}, Lxe/s;->n(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const-string v3, ", "

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/16 v2, 0x3c

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v3}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, "> "

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v1, p0, Led/d;->g:Lod/d;

    .line 36
    .line 37
    iget-object v2, v1, Lod/d;->j:Lod/a;

    .line 38
    .line 39
    iget-object v2, v2, Lod/a;->j:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, v1, Lod/d;->g:Ljava/lang/String;

    .line 42
    .line 43
    new-instance v4, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v2, "."

    .line 52
    .line 53
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const/16 v1, 0x28

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Led/d;->h:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {v1, v3}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, "):"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Led/d;->i:Lqd/j;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Led/d;->v()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_1

    .line 95
    .line 96
    const-string v1, " VARARG"

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    :cond_1
    iget-object v1, p0, Led/d;->k:Ljava/util/List;

    .line 102
    .line 103
    invoke-static {v1}, Lxe/s;->n(Ljava/util/Collection;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_2

    .line 108
    .line 109
    const-string v2, " throws "

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-static {v1, v3}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    :cond_2
    const/16 v1, 0x7d

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    return-object v0
.end method

.method public final v()Z
    .locals 1

    .line 1
    iget v0, p0, Led/d;->l:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x80

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method
