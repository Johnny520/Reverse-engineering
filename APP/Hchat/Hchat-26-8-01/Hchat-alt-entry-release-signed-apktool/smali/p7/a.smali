.class public Lp7/a;
.super Lo7/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lq7/a;


# instance fields
.field public final m:Lr7/a;

.field public final n:Lr7/a;

.field public final o:Lr7/f;

.field public p:Ll7/j;

.field public final q:Lr7/c;


# direct methods
.method public constructor <init>(S)V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lo7/d;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lr7/a;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lr7/a;-><init>(S)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lp7/a;->m:Lr7/a;

    .line 11
    .line 12
    new-instance p1, Lr7/a;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {p1, v1, v2}, Lr7/a;-><init>(IZ)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lp7/a;->n:Lr7/a;

    .line 20
    .line 21
    new-instance v1, Lr7/f;

    .line 22
    .line 23
    invoke-direct {v1, v2}, Lr7/f;-><init>(Z)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lp7/a;->o:Lr7/f;

    .line 27
    .line 28
    new-instance v3, Lr7/c;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    invoke-direct {v3, v2, v4}, Lr7/c;-><init>(II)V

    .line 32
    .line 33
    .line 34
    iput-object v3, p0, Lp7/a;->q:Lr7/c;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lo7/d;->P(Lk7/a;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 43
    .line 44
    .line 45
    iput-object p0, v0, Lk7/a;->j:Lk7/a;

    .line 46
    .line 47
    iput-object p0, p1, Lk7/a;->j:Lk7/a;

    .line 48
    .line 49
    iput-object p0, v1, Lk7/a;->j:Lk7/a;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public B(Lq7/b;)V
    .locals 2

    .line 1
    iget v0, p1, Lq7/b;->k:I

    .line 2
    .line 3
    invoke-super {p0, p1}, Lk7/c;->B(Lq7/b;)V

    .line 4
    .line 5
    .line 6
    iget v1, p1, Lq7/b;->k:I

    .line 7
    .line 8
    sub-int/2addr v1, v0

    .line 9
    iget-object v0, p0, Lp7/a;->n:Lr7/a;

    .line 10
    .line 11
    iget v0, v0, Lr7/a;->o:I

    .line 12
    .line 13
    sub-int/2addr v0, v1

    .line 14
    iget-object v1, p0, Lp7/a;->q:Lr7/c;

    .line 15
    .line 16
    invoke-virtual {p0, v1, v0}, Lp7/a;->R(Lr7/c;I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Lr7/b;->k:[B

    .line 20
    .line 21
    array-length v0, v0

    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lk7/a;->G(Lq7/b;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final N()V
    .locals 0

    .line 1
    return-void
.end method

.method public final O()V
    .locals 0

    .line 1
    return-void
.end method

.method public final Q()I
    .locals 7

    .line 1
    iget-object v0, p0, Lp7/a;->m:Lr7/a;

    .line 2
    .line 3
    iget v0, v0, Lr7/a;->o:I

    .line 4
    .line 5
    int-to-short v0, v0

    .line 6
    const/16 v1, 0x12

    .line 7
    .line 8
    invoke-static {v1}, Lt3/c;->c(I)[I

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    array-length v2, v1

    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_0
    if-ge v4, v2, :cond_1

    .line 16
    .line 17
    aget v5, v1, v4

    .line 18
    .line 19
    invoke-static {v5}, Lj8/b;->c(I)S

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    if-ne v6, v0, :cond_0

    .line 24
    .line 25
    return v5

    .line 26
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return v3
.end method

.method public R(Lr7/c;I)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p1, Lk7/a;->h:Lk7/a;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lo7/d;->P(Lk7/a;)V

    .line 9
    .line 10
    .line 11
    :cond_1
    invoke-virtual {p1, p2}, Lr7/c;->Q(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public S(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final m(Lk7/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp7/a;->m:Lr7/a;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget p1, v0, Lr7/a;->o:I

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lp7/a;->n:Lr7/a;

    .line 9
    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    iget p1, v0, Lr7/a;->o:I

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lp7/a;->S(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    iget-object v1, p0, Lp7/a;->o:Lr7/f;

    .line 19
    .line 20
    if-ne p1, v1, :cond_2

    .line 21
    .line 22
    iget p1, v0, Lr7/a;->o:I

    .line 23
    .line 24
    iget v0, v1, Lr7/f;->n:I

    .line 25
    .line 26
    iget-object v1, p0, Lp7/a;->p:Ll7/j;

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    iget-object v1, v1, Ll7/j;->p:Lr7/b;

    .line 31
    .line 32
    check-cast v1, Lr7/c;

    .line 33
    .line 34
    sub-int/2addr v0, p1

    .line 35
    invoke-virtual {v1, v0}, Lr7/c;->Q(I)V

    .line 36
    .line 37
    .line 38
    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lp7/a;->m:Lr7/a;

    .line 2
    .line 3
    iget v0, v0, Lr7/a;->o:I

    .line 4
    .line 5
    int-to-short v0, v0

    .line 6
    const/16 v1, 0x12

    .line 7
    .line 8
    invoke-static {v1}, Lt3/c;->c(I)[I

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    array-length v2, v1

    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_0
    if-ge v4, v2, :cond_1

    .line 16
    .line 17
    aget v5, v1, v4

    .line 18
    .line 19
    invoke-static {v5}, Lj8/b;->c(I)S

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    if-ne v6, v0, :cond_0

    .line 24
    .line 25
    move v3, v5

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    invoke-static {v3}, Lj8/b;->b(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const-string v2, "Unknown type="

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Ly7/a;->o(S)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    :goto_2
    const-string v0, "{ValueHeader="

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lp7/a;->n:Lr7/a;

    .line 63
    .line 64
    iget v0, v0, Lr7/a;->o:I

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v0, ", Chunk="

    .line 70
    .line 71
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lp7/a;->o:Lr7/f;

    .line 75
    .line 76
    iget v0, v0, Lr7/f;->n:I

    .line 77
    .line 78
    const-string v2, "}"

    .line 79
    .line 80
    invoke-static {v1, v0, v2}, Lj8/b;->j(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    return-object v0
.end method
