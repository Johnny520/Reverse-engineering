.class public final Lm7/e;
.super Lr7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public p:Lm7/c;


# virtual methods
.method public final P()V
    .locals 3

    .line 1
    iget v0, p0, Lr7/a;->o:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-ltz v0, :cond_1

    .line 7
    .line 8
    const-class v2, Lm7/t;

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lm7/t;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v2, v2, Lm7/t;->w:Lm7/d;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, v1

    .line 22
    :goto_0
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Lo7/b;->Q(I)Lk7/a;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v1, v0

    .line 29
    check-cast v1, Lm7/c;

    .line 30
    .line 31
    :cond_1
    iput-object v1, p0, Lm7/e;->p:Lm7/c;

    .line 32
    .line 33
    return-void
.end method

.method public final Q(I)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-lt p1, v0, :cond_0

    .line 3
    .line 4
    const v0, 0xfffe

    .line 5
    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lr7/a;->k(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string v0, "Attribute position "

    .line 16
    .line 17
    const-string v1, " out of range, must be between -1 to 65534"

    .line 18
    .line 19
    invoke-static {p1, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lokio/a;->i(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm7/e;->p:Lm7/c;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v1, v0, Lk7/a;->i:Z

    .line 6
    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    iget-object v1, v0, Lr7/b;->k:[B

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    invoke-static {v1, v2}, Lk7/a;->s([BI)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-gez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v1, v0, Lk7/a;->h:Lk7/a;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget v0, v0, Lk7/a;->g:I

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lm7/e;->Q(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lm7/e;->p:Lm7/c;

    .line 32
    .line 33
    const/4 v0, -0x1

    .line 34
    invoke-virtual {p0, v0}, Lm7/e;->Q(I)V

    .line 35
    .line 36
    .line 37
    return-void
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
    iget v1, p0, Lr7/a;->o:I

    .line 7
    .line 8
    add-int/lit8 v1, v1, -0x1

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " ("

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lm7/e;->p:Lm7/c;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ")"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method
