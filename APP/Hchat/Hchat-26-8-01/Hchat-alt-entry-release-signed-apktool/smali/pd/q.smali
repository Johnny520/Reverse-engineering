.class public final Lpd/q;
.super Lud/p;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final o:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    sget-object v0, Lpd/k;->X:Lpd/k;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lud/p;-><init>(Lpd/k;I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lpd/q;->o:Ljava/util/ArrayList;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final I(Lqd/l;)V
    .locals 1

    .line 1
    new-instance p1, Laf/g;

    .line 2
    .line 3
    const-string v0, "Direct addArg is forbidden for PHI insn, bindArg must be used"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final O()Lud/p;
    .locals 2

    .line 1
    new-instance v0, Lpd/q;

    .line 2
    .line 3
    iget-object v1, p0, Lud/p;->m:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Lpd/q;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final S(I)Lqd/l;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lud/p;->S(I)Lqd/l;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lqd/r;

    .line 6
    .line 7
    return-object p1
.end method

.method public final a0(I)Lqd/l;
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-super {p0, p1}, Lud/p;->a0(I)Lqd/l;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Lqd/r;

    .line 7
    .line 8
    iget-object v1, p0, Lpd/q;->o:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget-object p1, v0, Lqd/r;->m:Lqd/s;

    .line 14
    .line 15
    invoke-virtual {p1}, Lqd/s;->p()V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final b0(Lqd/l;Lqd/l;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lqd/r;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    instance-of v0, p2, Lqd/r;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Lud/p;->T(Lqd/l;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, -0x1

    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    return v1

    .line 19
    :cond_1
    move-object v1, p2

    .line 20
    check-cast v1, Lqd/r;

    .line 21
    .line 22
    iget-object v1, v1, Lqd/r;->m:Lqd/s;

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Lqd/s;->a(Lpd/q;)V

    .line 25
    .line 26
    .line 27
    invoke-super {p0, v0, p2}, Lud/p;->c0(ILqd/l;)V

    .line 28
    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    invoke-static {p2, p1}, Lxe/l;->i(Lud/r;Lqd/l;)V

    .line 32
    .line 33
    .line 34
    check-cast p1, Lqd/r;

    .line 35
    .line 36
    iget-object p1, p1, Lqd/r;->m:Lqd/s;

    .line 37
    .line 38
    invoke-virtual {p1}, Lqd/s;->p()V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    return p1

    .line 43
    :cond_2
    :goto_0
    return v1
.end method

.method public final c0(ILqd/l;)V
    .locals 0

    .line 1
    new-instance p1, Laf/g;

    .line 2
    .line 3
    const-string p2, "Direct setArg is forbidden for PHI insn, bindArg must be used"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final i0(Lqd/r;Lud/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lpd/q;->o:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-super {p0, p1}, Lud/p;->I(Lqd/l;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string p2, "Null bind block in PHI insn: "

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    const-string v0, "Duplicate predecessors in PHI insn: "

    .line 41
    .line 42
    const-string v1, ", "

    .line 43
    .line 44
    invoke-static {v0, p1, v1, p2}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final j0(I)Lqd/r;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lud/p;->S(I)Lqd/l;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lqd/r;

    .line 6
    .line 7
    return-object p1
.end method

.method public final k0(Lud/a;)Lqd/r;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lpd/q;->o:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-ne v1, p1, :cond_0

    .line 15
    .line 16
    invoke-super {p0, v0}, Lud/p;->S(I)Lqd/l;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lqd/r;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return-object p1
.end method

.method public final l0(Lqd/r;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lud/p;->T(Lqd/l;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lud/p;->a0(I)Lqd/l;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lqd/r;

    .line 14
    .line 15
    iget-object v1, p0, Lpd/q;->o:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object p1, v0, Lqd/r;->m:Lqd/s;

    .line 21
    .line 22
    invoke-virtual {p1}, Lqd/s;->p()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lud/p;->k()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lpd/q;->o:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lud/p;->M()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, " binds: "

    .line 16
    .line 17
    invoke-static {v0, v3, v1, v2}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method
