.class public final Lqd/r;
.super Lqd/l;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lqd/o;


# instance fields
.field public final l:I

.field public m:Lqd/s;


# direct methods
.method public constructor <init>(ILqd/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lqd/l;->i:Lqd/j;

    .line 5
    .line 6
    iput p1, p0, Lqd/r;->l:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic H()Lqd/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqd/r;->c0()Lqd/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final I()Lqd/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/r;->m:Lqd/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lqd/s;->l:Lp4/t;

    .line 6
    .line 7
    iget-object v0, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lqd/j;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    sget-object v0, Lqd/j;->u:Lqd/h;

    .line 13
    .line 14
    return-object v0
.end method

.method public final P()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lqd/r;->m:Lqd/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lqd/s;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    sget-object v0, Lmd/a;->N:Lmd/a;

    .line 11
    .line 12
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final W(Lqd/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/r;->m:Lqd/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lqd/s;->n(Lqd/j;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "Can\'t change type for register without SSA variable: "

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final X()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "r"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lqd/r;->l:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lqd/r;->m:Lqd/s;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/16 v1, 0x76

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lqd/r;->m:Lqd/s;

    .line 23
    .line 24
    iget v1, v1, Lqd/s;->h:I

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public final c0()Lqd/r;
    .locals 3

    .line 1
    iget-object v0, p0, Lqd/l;->i:Lqd/j;

    .line 2
    .line 3
    iget-object v1, p0, Lqd/r;->m:Lqd/s;

    .line 4
    .line 5
    iget v2, p0, Lqd/r;->l:I

    .line 6
    .line 7
    invoke-virtual {p0, v2, v0, v1}, Lqd/r;->d0(ILqd/j;Lqd/s;)Lqd/r;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final d0(ILqd/j;Lqd/s;)Lqd/r;
    .locals 1

    .line 1
    new-instance v0, Lqd/r;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lqd/r;-><init>(ILqd/j;)V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    iput-object p3, v0, Lqd/r;->m:Lqd/s;

    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0, p0}, Lmd/e;->B(Lmd/e;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lqd/l;->j:Lud/p;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lqd/l;->V(Lud/p;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final e0(Lud/r;)Lqd/r;
    .locals 3

    .line 1
    iget-object v0, p0, Lqd/l;->i:Lqd/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lqd/r;->l:I

    .line 5
    .line 6
    invoke-virtual {p0, v2, v0, v1}, Lqd/r;->d0(ILqd/j;Lqd/s;)Lqd/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Lud/r;->b0(Lqd/r;)Lqd/s;

    .line 11
    .line 12
    .line 13
    return-object v0
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
    instance-of v1, p1, Lqd/r;

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
    check-cast p1, Lqd/r;

    .line 12
    .line 13
    iget v1, p0, Lqd/r;->l:I

    .line 14
    .line 15
    iget v3, p1, Lqd/r;->l:I

    .line 16
    .line 17
    if-ne v1, v3, :cond_2

    .line 18
    .line 19
    iget-object v1, p0, Lqd/r;->m:Lqd/s;

    .line 20
    .line 21
    iget-object p1, p1, Lqd/r;->m:Lqd/s;

    .line 22
    .line 23
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    return v0

    .line 30
    :cond_2
    return v2
.end method

.method public final f0()Lud/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/r;->m:Lqd/s;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v0, v0, Lqd/s;->i:Lqd/r;

    .line 8
    .line 9
    iget-object v0, v0, Lqd/l;->j:Lud/p;

    .line 10
    .line 11
    return-object v0
.end method

.method public final g0(Lqd/r;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/r;->m:Lqd/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqd/s;->b()Lqd/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p1, p1, Lqd/r;->m:Lqd/s;

    .line 8
    .line 9
    invoke-virtual {p1}, Lqd/s;->b()Lqd/k;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-ne v0, p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lmd/a;->K:Lmd/a;

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
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "super"

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lqd/l;->N()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string v0, "this"

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    iget-object v0, p0, Lqd/r;->m:Lqd/s;

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    return-object v0

    .line 29
    :cond_2
    invoke-virtual {v0}, Lqd/s;->e()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public final h0(Lqd/l;)Z
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
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of v1, p1, Lqd/r;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    return v2

    .line 14
    :cond_1
    check-cast p1, Lqd/r;

    .line 15
    .line 16
    iget v1, p0, Lqd/r;->l:I

    .line 17
    .line 18
    iget v3, p1, Lqd/r;->l:I

    .line 19
    .line 20
    if-ne v1, v3, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Lqd/r;->m:Lqd/s;

    .line 23
    .line 24
    iget-object p1, p1, Lqd/r;->m:Lqd/s;

    .line 25
    .line 26
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    return v0

    .line 33
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lqd/r;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public final p(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lqd/r;->m:Lqd/s;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object v1, v0, Lqd/s;->m:Lqd/k;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iput-object p1, v1, Lqd/k;->a:Ljava/lang/String;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "CodeVar not initialized for name set in SSAVar: "

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "(r"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lqd/r;->l:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lqd/r;->m:Lqd/s;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/16 v1, 0x76

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lqd/r;->m:Lqd/s;

    .line 23
    .line 24
    iget v1, v1, Lqd/s;->h:I

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0}, Lqd/r;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const-string v1, " \'"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lqd/r;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const/16 v1, 0x27

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object v1, p0, Lqd/r;->m:Lqd/s;

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, Lqd/r;->I()Lqd/j;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const/4 v1, 0x0

    .line 62
    :goto_0
    const/16 v2, 0x20

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object v3, p0, Lqd/l;->i:Lqd/j;

    .line 73
    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    invoke-virtual {v1, v3}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-nez v4, :cond_5

    .line 81
    .line 82
    invoke-virtual {v1}, Lqd/j;->w()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_5

    .line 87
    .line 88
    :cond_4
    const-string v1, " I:"

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    :cond_5
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 97
    .line 98
    invoke-virtual {v1}, Lmd/f;->f()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_6

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 108
    .line 109
    invoke-virtual {v1}, Lmd/f;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    :cond_6
    const/16 v1, 0x29

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0
.end method
