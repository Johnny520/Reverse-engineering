.class public final Lpd/l;
.super Lpd/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public q:Lod/d;

.field public r:I

.field public s:Lpd/b;

.field public t:Z

.field public u:Z


# virtual methods
.method public final O()Lud/p;
    .locals 4

    .line 1
    new-instance v0, Lpd/l;

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
    iget-object v2, p0, Lpd/n;->p:Lod/d;

    .line 10
    .line 11
    iget v3, p0, Lpd/n;->o:I

    .line 12
    .line 13
    invoke-direct {v0, v2, v3, v1}, Lpd/n;-><init>(Lod/d;II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lpd/l;->q:Lod/d;

    .line 20
    .line 21
    iput-object v1, v0, Lpd/l;->q:Lod/d;

    .line 22
    .line 23
    iget v1, p0, Lpd/l;->r:I

    .line 24
    .line 25
    iput v1, v0, Lpd/l;->r:I

    .line 26
    .line 27
    iget-object v1, p0, Lpd/l;->s:Lpd/b;

    .line 28
    .line 29
    iput-object v1, v0, Lpd/l;->s:Lpd/b;

    .line 30
    .line 31
    iget-boolean v1, p0, Lpd/l;->t:Z

    .line 32
    .line 33
    iput-boolean v1, v0, Lpd/l;->t:Z

    .line 34
    .line 35
    iget-boolean v1, p0, Lpd/l;->u:Z

    .line 36
    .line 37
    iput-boolean v1, v0, Lpd/l;->u:Z

    .line 38
    .line 39
    return-object v0
.end method

.method public final Y(Lud/p;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lpd/l;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-super {p0, p1}, Lpd/n;->Y(Lud/p;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, Lpd/l;

    .line 16
    .line 17
    iget v0, p0, Lpd/l;->r:I

    .line 18
    .line 19
    iget v1, p1, Lpd/l;->r:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lpd/l;->q:Lod/d;

    .line 24
    .line 25
    iget-object v1, p1, Lpd/l;->q:Lod/d;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lod/d;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Lpd/l;->s:Lpd/b;

    .line 34
    .line 35
    iget-object v1, p1, Lpd/l;->s:Lpd/b;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lud/p;->Y(Lud/p;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-boolean v0, p0, Lpd/l;->t:Z

    .line 44
    .line 45
    iget-boolean v1, p1, Lpd/l;->t:Z

    .line 46
    .line 47
    if-ne v0, v1, :cond_2

    .line 48
    .line 49
    iget-boolean v0, p0, Lpd/l;->u:Z

    .line 50
    .line 51
    iget-boolean p1, p1, Lpd/l;->u:Z

    .line 52
    .line 53
    if-ne v0, p1, :cond_2

    .line 54
    .line 55
    :goto_0
    const/4 p1, 0x1

    .line 56
    return p1

    .line 57
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 58
    return p1
.end method

.method public final j0()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final k0()Lqd/l;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

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
    invoke-static {v1}, Lxe/m;->d(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ": INVOKE_CUSTOM "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lud/p;->l:Lqd/r;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, " = "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0, v0}, Lud/p;->J(Ljava/lang/StringBuilder;)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lud/p;->K(Ljava/lang/StringBuilder;)V

    .line 36
    .line 37
    .line 38
    const-string v1, "\n handle type: "

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget v1, p0, Lpd/l;->r:I

    .line 44
    .line 45
    invoke-static {v1}, Lj8/b;->v(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, "\n lambda: "

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lpd/l;->q:Lod/d;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, "\n call insn: "

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lpd/l;->s:Lpd/b;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0
.end method
