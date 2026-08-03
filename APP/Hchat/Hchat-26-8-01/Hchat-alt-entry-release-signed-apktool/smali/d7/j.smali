.class public abstract Ld7/j;
.super Lo7/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final m:Lr7/b;


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lo7/d;-><init>(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    new-instance p2, Lr7/h;

    .line 10
    .line 11
    invoke-direct {p2, p1}, Lr7/h;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p2, Lr7/f;

    .line 16
    .line 17
    invoke-direct {p2, p1}, Lr7/f;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iput-object p2, p0, Ld7/j;->m:Lr7/b;

    .line 21
    .line 22
    invoke-virtual {p0, p2}, Lo7/d;->P(Lk7/a;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lq7/b;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Ld7/j;->m:Lr7/b;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ld7/j;->Q()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    long-to-int v1, v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-gtz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Ld7/j;->R(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p0, v1}, Ld7/j;->R(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v1}, Lq7/b;->a(I)Lq7/b;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget-object v4, p0, Lo7/d;->k:[Lk7/a;

    .line 33
    .line 34
    :goto_0
    array-length v5, v4

    .line 35
    if-ge v2, v5, :cond_3

    .line 36
    .line 37
    aget-object v5, v4, v2

    .line 38
    .line 39
    if-ne v5, v0, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {v5, v3}, Lk7/a;->G(Lq7/b;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-virtual {p1, v1}, Lq7/b;->c(I)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final N()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lk7/c;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ld7/j;->m:Lr7/b;

    .line 6
    .line 7
    invoke-virtual {v1}, Lr7/b;->p()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    sub-int/2addr v0, v2

    .line 12
    int-to-long v2, v0

    .line 13
    instance-of v0, v1, Lr7/h;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    check-cast v1, Lr7/h;

    .line 18
    .line 19
    invoke-virtual {v1, v2, v3}, Lr7/h;->N(J)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    check-cast v1, Lr7/f;

    .line 24
    .line 25
    long-to-int v0, v2

    .line 26
    invoke-virtual {v1, v0}, Lr7/f;->k(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final Q()J
    .locals 2

    .line 1
    iget-object v0, p0, Ld7/j;->m:Lr7/b;

    .line 2
    .line 3
    instance-of v1, v0, Lr7/h;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lr7/h;

    .line 8
    .line 9
    iget-wide v0, v0, Lr7/h;->n:J

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    check-cast v0, Lr7/f;

    .line 13
    .line 14
    iget v0, v0, Lr7/f;->n:I

    .line 15
    .line 16
    int-to-long v0, v0

    .line 17
    return-wide v0
.end method

.method public R(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "size="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ld7/j;->m:Lr7/b;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
