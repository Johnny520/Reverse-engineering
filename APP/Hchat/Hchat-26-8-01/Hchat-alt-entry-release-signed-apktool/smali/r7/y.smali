.class public final Lr7/y;
.super Lr7/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final S(Lr7/s;)I
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    return p1

    .line 5
    :cond_0
    iget v0, p0, Lk7/a;->g:I

    .line 6
    .line 7
    iget p1, p1, Lk7/a;->g:I

    .line 8
    .line 9
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final W()V
    .locals 0

    .line 1
    return-void
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lr7/s;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr7/y;->S(Lr7/s;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Lu7/d;

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lu7/d;

    .line 13
    .line 14
    iget v2, p0, Lk7/a;->g:I

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    iget-object v1, v1, Lu7/d;->t:Lr7/f;

    .line 21
    .line 22
    iget v1, v1, Lr7/f;->n:I

    .line 23
    .line 24
    add-int/2addr v2, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    :goto_0
    int-to-byte v1, v2

    .line 29
    invoke-static {v1}, Ly7/a;->n(B)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 v1, 0x3a

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lr7/r;->m:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method
