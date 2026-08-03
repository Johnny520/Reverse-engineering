.class public Lud/p;
.super Lnd/r;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Lpd/k;

.field public l:Lqd/r;

.field public final m:Ljava/util/List;

.field public n:I


# direct methods
.method public constructor <init>(Lpd/k;I)V
    .locals 1

    if-nez p2, :cond_0

    .line 32
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(I)V

    move-object p2, v0

    :goto_0
    invoke-direct {p0, p1, p2}, Lud/p;-><init>(Lpd/k;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lpd/k;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lud/p;->k:Lpd/k;

    .line 5
    .line 6
    iput-object p2, p0, Lud/p;->m:Ljava/util/List;

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lud/p;->n:I

    .line 10
    .line 11
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    check-cast p2, Lqd/l;

    .line 26
    .line 27
    invoke-virtual {p0, p2}, Lud/p;->L(Lqd/l;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method


# virtual methods
.method public I(Lqd/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lud/p;->L(Lqd/l;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final J(Ljava/lang/StringBuilder;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    const-string v1, ", "

    .line 12
    .line 13
    invoke-static {v0, v1}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/16 v4, 0x78

    .line 22
    .line 23
    if-ge v3, v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    return v2

    .line 29
    :cond_1
    const-string v1, "\n  "

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/16 v0, 0xa

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    return p1
.end method

.method public final K(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/f;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 15
    .line 16
    invoke-virtual {v0}, Lmd/f;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    :cond_0
    iget v0, p0, Lnd/r;->i:I

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const-string v0, " (LINE:"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget v0, p0, Lnd/r;->i:I

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 v0, 0x29

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final L(Lqd/l;)V
    .locals 1

    .line 1
    invoke-virtual {p1, p0}, Lqd/l;->V(Lud/p;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lqd/r;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, Lqd/r;

    .line 9
    .line 10
    iget-object v0, p1, Lqd/r;->m:Lqd/s;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lqd/s;->q(Lqd/r;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final M()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lud/p;->K(Ljava/lang/StringBuilder;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final N()Z
    .locals 5

    .line 1
    sget-object v0, Lmd/a;->s:Lmd/a;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lud/p;->k:Lpd/k;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lpd/k;->z:Lpd/k;

    .line 15
    .line 16
    if-ne v1, v0, :cond_3

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lqd/l;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    instance-of v4, v3, Lqd/m;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    check-cast v3, Lqd/m;

    .line 45
    .line 46
    iget-object v3, v3, Lqd/m;->l:Lud/p;

    .line 47
    .line 48
    invoke-virtual {v3}, Lud/p;->N()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    if-eq v0, v2, :cond_3

    .line 62
    .line 63
    const/4 v1, 0x2

    .line 64
    if-eq v0, v1, :cond_3

    .line 65
    .line 66
    const/4 v1, 0x3

    .line 67
    if-eq v0, v1, :cond_3

    .line 68
    .line 69
    const/4 v1, 0x4

    .line 70
    if-eq v0, v1, :cond_3

    .line 71
    .line 72
    const/4 v1, 0x6

    .line 73
    if-eq v0, v1, :cond_3

    .line 74
    .line 75
    const/16 v1, 0x8

    .line 76
    .line 77
    if-eq v0, v1, :cond_3

    .line 78
    .line 79
    const/16 v1, 0x17

    .line 80
    .line 81
    if-eq v0, v1, :cond_3

    .line 82
    .line 83
    const/16 v1, 0x19

    .line 84
    .line 85
    if-eq v0, v1, :cond_3

    .line 86
    .line 87
    const/16 v1, 0x1c

    .line 88
    .line 89
    if-eq v0, v1, :cond_3

    .line 90
    .line 91
    const/16 v1, 0x29

    .line 92
    .line 93
    if-eq v0, v1, :cond_3

    .line 94
    .line 95
    const/16 v1, 0xd

    .line 96
    .line 97
    if-eq v0, v1, :cond_3

    .line 98
    .line 99
    const/16 v1, 0xe

    .line 100
    .line 101
    if-eq v0, v1, :cond_3

    .line 102
    .line 103
    const/16 v1, 0x14

    .line 104
    .line 105
    if-eq v0, v1, :cond_3

    .line 106
    .line 107
    const/16 v1, 0x15

    .line 108
    .line 109
    if-eq v0, v1, :cond_3

    .line 110
    .line 111
    :goto_0
    const/4 v0, 0x0

    .line 112
    return v0

    .line 113
    :cond_3
    return v2
.end method

.method public O()Lud/p;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lud/p;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Lud/p;

    .line 10
    .line 11
    iget-object v1, p0, Lud/p;->m:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, Lud/p;->k:Lpd/k;

    .line 18
    .line 19
    invoke-direct {v0, v2, v1}, Lud/p;-><init>(Lpd/k;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "Copy method not implemented in insn class "

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    return-object v0
.end method

.method public final P(Lud/p;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lqd/l;

    .line 26
    .line 27
    invoke-virtual {v1}, Lqd/l;->H()Lqd/l;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p1, v1}, Lud/p;->I(Lqd/l;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p1, p0}, Lmd/e;->B(Lmd/e;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p0}, Lnd/r;->H(Lud/p;)V

    .line 39
    .line 40
    .line 41
    iget v0, p0, Lnd/r;->i:I

    .line 42
    .line 43
    iput v0, p1, Lnd/r;->i:I

    .line 44
    .line 45
    iget v0, p0, Lnd/r;->j:I

    .line 46
    .line 47
    iput v0, p1, Lnd/r;->j:I

    .line 48
    .line 49
    iget v0, p0, Lud/p;->n:I

    .line 50
    .line 51
    iput v0, p1, Lud/p;->n:I

    .line 52
    .line 53
    return-void
.end method

.method public final Q(Lud/r;)Lud/p;
    .locals 4

    .line 1
    iget-object v0, p0, Lud/p;->l:Lqd/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, v0, Lqd/r;->l:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    iget-object v3, v0, Lqd/l;->i:Lqd/j;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v3, v2}, Lqd/r;->d0(ILqd/j;Lqd/s;)Lqd/r;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Lud/r;->b0(Lqd/r;)Lqd/s;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lud/p;->O()Lud/p;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1, v0}, Lud/p;->d0(Lqd/r;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    const-string p1, "Result in null"

    .line 26
    .line 27
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return-object p1
.end method

.method public final R()Lud/p;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lud/p;->O()Lud/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lud/p;->l:Lqd/r;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v2, v1, Lqd/r;->m:Lqd/s;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lqd/r;->c0()Lqd/r;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lud/p;->d0(Lqd/r;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    const-string v0, "Can\'t copy if SSA var is set"

    .line 22
    .line 23
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    :cond_1
    return-object v0
.end method

.method public S(I)Lqd/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lqd/l;

    .line 8
    .line 9
    return-object p1
.end method

.method public final T(Lqd/l;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-ne p1, v3, :cond_0

    .line 15
    .line 16
    return v2

    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, -0x1

    .line 21
    return p1
.end method

.method public U(Ljava/util/Collection;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_2

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
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    instance-of v2, v1, Lqd/r;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    check-cast v1, Lqd/r;

    .line 27
    .line 28
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    instance-of v2, v1, Lqd/m;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    check-cast v1, Lqd/m;

    .line 37
    .line 38
    iget-object v1, v1, Lqd/m;->l:Lud/p;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Lud/p;->U(Ljava/util/Collection;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method public final V(Lud/p;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lud/p;->k:Lpd/k;

    .line 2
    .line 3
    sget-object v1, Lpd/k;->p:Lpd/k;

    .line 4
    .line 5
    sget-object v2, Lmd/b;->a:Lmd/b;

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget v0, p1, Lnd/r;->i:I

    .line 10
    .line 11
    iput v0, p0, Lnd/r;->i:I

    .line 12
    .line 13
    iget v0, p1, Lnd/r;->j:I

    .line 14
    .line 15
    iput v0, p0, Lnd/r;->j:I

    .line 16
    .line 17
    sget-object v0, Lmd/a;->m:Lmd/a;

    .line 18
    .line 19
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget v0, p1, Lud/p;->n:I

    .line 28
    .line 29
    iput v0, p0, Lud/p;->n:I

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Lmd/e;->E(Loc/a;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1, v2}, Lmd/e;->A(Lnd/r;Lmd/b;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    invoke-virtual {p0, p1, v2}, Lmd/e;->A(Lnd/r;Lmd/b;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-virtual {p0, p1, v2}, Lmd/e;->A(Lnd/r;Lmd/b;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lnd/r;->H(Lud/p;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final W()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lud/p;->k:Lpd/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v0, v2, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_0
    return v1
.end method

.method public final X(Lud/p;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lud/p;->Y(Lud/p;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lud/p;->l:Lqd/r;

    .line 11
    .line 12
    iget-object v1, p1, Lud/p;->l:Lqd/r;

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 21
    .line 22
    iget-object p1, p1, Lud/p;->m:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    :goto_0
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return p1
.end method

.method public Y(Lud/p;)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p1, Lud/p;->k:Lpd/k;

    .line 6
    .line 7
    iget-object p1, p1, Lud/p;->m:Ljava/util/List;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iget-object v3, p0, Lud/p;->k:Lpd/k;

    .line 11
    .line 12
    if-eq v3, v1, :cond_1

    .line 13
    .line 14
    return v2

    .line 15
    :cond_1
    iget-object v1, p0, Lud/p;->m:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eq v3, v4, :cond_2

    .line 26
    .line 27
    return v2

    .line 28
    :cond_2
    move v4, v2

    .line 29
    :goto_0
    if-ge v4, v3, :cond_5

    .line 30
    .line 31
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Lqd/l;

    .line 36
    .line 37
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, Lqd/l;

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    instance-of v7, v5, Lqd/m;

    .line 47
    .line 48
    if-eqz v7, :cond_4

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    instance-of v7, v6, Lqd/m;

    .line 54
    .line 55
    if-nez v7, :cond_3

    .line 56
    .line 57
    return v2

    .line 58
    :cond_3
    check-cast v5, Lqd/m;

    .line 59
    .line 60
    iget-object v5, v5, Lqd/m;->l:Lud/p;

    .line 61
    .line 62
    check-cast v6, Lqd/m;

    .line 63
    .line 64
    iget-object v6, v6, Lqd/m;->l:Lud/p;

    .line 65
    .line 66
    invoke-virtual {v5, v6}, Lud/p;->Y(Lud/p;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-nez v5, :cond_4

    .line 71
    .line 72
    return v2

    .line 73
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    return v0
.end method

.method public Z()V
    .locals 4

    .line 1
    iget-object v0, p0, Lud/p;->l:Lqd/r;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, v0, Lqd/r;->m:Lqd/s;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v2, v1, Lqd/s;->i:Lqd/r;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iput-object v0, v1, Lqd/s;->i:Lqd/r;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-eq v2, v0, :cond_2

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    iput-object v3, v2, Lqd/r;->m:Lqd/s;

    .line 20
    .line 21
    iput-object v0, v1, Lqd/s;->i:Lqd/r;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v0, v0, Lqd/l;->j:Lud/p;

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v2, "No SSA var for result arg: "

    .line 35
    .line 36
    const-string v3, " from "

    .line 37
    .line 38
    invoke-static {v2, v1, v3, v0}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    :goto_0
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lqd/l;

    .line 63
    .line 64
    instance-of v2, v1, Lqd/r;

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    check-cast v1, Lqd/r;

    .line 69
    .line 70
    iget-object v2, v1, Lqd/r;->m:Lqd/s;

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Lqd/s;->q(Lqd/r;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Lqd/s;->p()V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    instance-of v2, v1, Lqd/m;

    .line 80
    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    check-cast v1, Lqd/m;

    .line 84
    .line 85
    iget-object v1, v1, Lqd/m;->l:Lud/p;

    .line 86
    .line 87
    invoke-virtual {v1}, Lud/p;->Z()V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    return-void
.end method

.method public a0(I)Lqd/l;
    .locals 2

    .line 1
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lqd/l;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-static {p1, v1}, Lxe/l;->i(Lud/r;Lqd/l;)V

    .line 14
    .line 15
    .line 16
    return-object v1
.end method

.method public b0(Lqd/l;Lqd/l;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_2

    .line 10
    .line 11
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lqd/l;

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    if-ne v4, p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-static {p1, v4}, Lxe/l;->i(Lud/r;Lqd/l;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v3, p2}, Lud/p;->c0(ILqd/l;)V

    .line 25
    .line 26
    .line 27
    return v5

    .line 28
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    instance-of v6, v4, Lqd/m;

    .line 32
    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    check-cast v4, Lqd/m;

    .line 36
    .line 37
    iget-object v4, v4, Lqd/m;->l:Lud/p;

    .line 38
    .line 39
    invoke-virtual {v4, p1, p2}, Lud/p;->b0(Lqd/l;Lqd/l;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    return v5

    .line 46
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    return v2
.end method

.method public c0(ILqd/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lud/p;->L(Lqd/l;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final d0(Lqd/r;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lud/p;->l:Lqd/r;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iput-object p0, p1, Lqd/l;->j:Lud/p;

    .line 6
    .line 7
    iget-object v0, p1, Lqd/r;->m:Lqd/s;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v1, v0, Lqd/s;->i:Lqd/r;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iput-object p1, v0, Lqd/s;->i:Lqd/r;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    if-eq v1, p1, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-object v2, v1, Lqd/r;->m:Lqd/s;

    .line 22
    .line 23
    iput-object p1, v0, Lqd/s;->i:Lqd/r;

    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final e0(Lnd/n;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

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
    if-eqz v1, :cond_2

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
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    instance-of v2, v1, Lqd/m;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    check-cast v1, Lqd/m;

    .line 27
    .line 28
    iget-object v1, v1, Lqd/m;->l:Lud/p;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Lud/p;->e0(Lnd/n;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p1, v1}, Lnd/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    if-eqz v1, :cond_0

    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_2
    const/4 p1, 0x0

    .line 43
    return-object p1
.end method

.method public final f0(Lae/e;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

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
    if-eqz v1, :cond_1

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
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    instance-of v2, v1, Lqd/m;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    check-cast v1, Lqd/m;

    .line 27
    .line 28
    iget-object v1, v1, Lqd/m;->l:Lud/p;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Lud/p;->f0(Lae/e;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p1, v1}, Lae/e;->accept(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-void
.end method

.method public final g0(Lbe/m;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1, p0}, Lbe/m;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lqd/l;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    instance-of v2, v1, Lqd/m;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    check-cast v1, Lqd/m;

    .line 34
    .line 35
    iget-object v1, v1, Lqd/m;->l:Lud/p;

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Lud/p;->g0(Lbe/m;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    return-object p1
.end method

.method public h0(Ljava/util/function/Consumer;)V
    .locals 3

    .line 1
    invoke-interface {p1, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lqd/l;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    instance-of v2, v1, Lqd/m;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    check-cast v1, Lqd/m;

    .line 30
    .line 31
    iget-object v1, v1, Lqd/m;->l:Lud/p;

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Lud/p;->h0(Ljava/util/function/Consumer;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void
.end method

.method public final k()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lud/p;->n:I

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Lxe/m;->d(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ": "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v1, p0, Lud/p;->k:Lpd/k;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/16 v1, 0x20

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lud/p;->l:Lqd/r;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, " = "

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0, v0}, Lud/p;->J(Ljava/lang/StringBuilder;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lud/p;->k()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lud/p;->M()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method
