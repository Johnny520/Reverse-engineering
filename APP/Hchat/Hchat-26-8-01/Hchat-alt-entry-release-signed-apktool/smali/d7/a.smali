.class public final Ld7/a;
.super Ld7/l;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final N()V
    .locals 8

    .line 1
    iget-object v0, p0, Ld7/l;->o:Lo7/g;

    .line 2
    .line 3
    iget-object v0, v0, Lo7/g;->k:Lk7/a;

    .line 4
    .line 5
    check-cast v0, Ld7/n;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x18

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2}, Lr7/b;->M(IZ)V

    .line 14
    .line 15
    .line 16
    const/16 v3, 0x10

    .line 17
    .line 18
    sget-object v4, Ld7/n;->m:[B

    .line 19
    .line 20
    const/16 v5, 0x8

    .line 21
    .line 22
    invoke-virtual {v0, v4, v2, v5, v3}, Ld7/s;->P([BIII)V

    .line 23
    .line 24
    .line 25
    invoke-super {p0}, Ld7/l;->N()V

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Ld7/l;->m:Lr7/b;

    .line 29
    .line 30
    instance-of v4, v3, Lr7/h;

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    check-cast v3, Lr7/h;

    .line 35
    .line 36
    iget-wide v3, v3, Lr7/h;->n:J

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    check-cast v3, Lr7/f;

    .line 40
    .line 41
    iget v3, v3, Lr7/f;->n:I

    .line 42
    .line 43
    int-to-long v3, v3

    .line 44
    :goto_0
    invoke-virtual {v0}, Lr7/b;->p()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-ge v6, v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lr7/b;->M(IZ)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v0, v0, Lr7/b;->k:[B

    .line 54
    .line 55
    array-length v1, v0

    .line 56
    if-le v5, v1, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    :goto_1
    if-ge v2, v5, :cond_3

    .line 60
    .line 61
    const-wide/16 v6, 0xff

    .line 62
    .line 63
    and-long/2addr v6, v3

    .line 64
    long-to-int v1, v6

    .line 65
    int-to-byte v1, v1

    .line 66
    aput-byte v1, v0, v2

    .line 67
    .line 68
    ushr-long/2addr v3, v5

    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    :goto_2
    return-void
.end method

.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ld7/p;

    .line 2
    .line 3
    check-cast p2, Ld7/p;

    .line 4
    .line 5
    invoke-virtual {p1}, Ld7/p;->S()Ld7/o;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2}, Ld7/p;->S()Ld7/o;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget p1, p1, Ld7/o;->i:I

    .line 14
    .line 15
    iget p2, p2, Ld7/o;->i:I

    .line 16
    .line 17
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final n()Lk7/a;
    .locals 1

    .line 1
    new-instance v0, Ld7/p;

    .line 2
    .line 3
    invoke-direct {v0}, Ld7/p;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
