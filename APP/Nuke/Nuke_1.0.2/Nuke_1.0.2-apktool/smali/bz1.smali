.class public Lbz1;
.super Ljava/util/AbstractMap;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/util/Map;
.implements Ls41;


# instance fields
.field public h:Lzy1;

.field public i:Li51;

.field public j:Lh43;

.field public k:Ljava/lang/Object;

.field public l:I

.field public m:I


# direct methods
.method public constructor <init>(Lzy1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbz1;->h:Lzy1;

    .line 5
    .line 6
    new-instance v0, Li51;

    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    invoke-direct {v0, v1}, Li51;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lbz1;->i:Li51;

    .line 13
    .line 14
    iget-object v0, p1, Lzy1;->h:Lh43;

    .line 15
    .line 16
    iput-object v0, p0, Lbz1;->j:Lh43;

    .line 17
    .line 18
    iget p1, p1, Lzy1;->i:I

    .line 19
    .line 20
    iput p1, p0, Lbz1;->m:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a()Lzy1;
    .locals 3

    .line 1
    iget-object v0, p0, Lbz1;->j:Lh43;

    .line 2
    .line 3
    iget-object v1, p0, Lbz1;->h:Lzy1;

    .line 4
    .line 5
    iget-object v2, v1, Lzy1;->h:Lh43;

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Li51;

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-direct {v0, v1}, Li51;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lbz1;->i:Li51;

    .line 17
    .line 18
    new-instance v1, Lzy1;

    .line 19
    .line 20
    iget-object v0, p0, Lbz1;->j:Lh43;

    .line 21
    .line 22
    iget v2, p0, Lbz1;->m:I

    .line 23
    .line 24
    invoke-direct {v1, v0, v2}, Lzy1;-><init>(Lh43;I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iput-object v1, p0, Lbz1;->h:Lzy1;

    .line 28
    .line 29
    return-object v1
.end method

.method public bridge b()Lzy1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbz1;->a()Lzy1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final c(I)V
    .locals 0

    .line 1
    iput p1, p0, Lbz1;->m:I

    .line 2
    .line 3
    iget p1, p0, Lbz1;->l:I

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lbz1;->l:I

    .line 8
    .line 9
    return-void
.end method

.method public final clear()V
    .locals 1

    .line 1
    sget-object v0, Lh43;->e:Lh43;

    .line 2
    .line 3
    iput-object v0, p0, Lbz1;->j:Lh43;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lbz1;->c(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lbz1;->j:Lh43;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    invoke-virtual {p0, v1, v0, p1}, Lh43;->d(IILjava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, Ldz1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0}, Ldz1;-><init>(ILbz1;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, Lbz1;->j:Lh43;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    invoke-virtual {p0, v1, v0, p1}, Lh43;->g(IILjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, Ldz1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, p0}, Ldz1;-><init>(ILbz1;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lbz1;->k:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v1, p0, Lbz1;->j:Lh43;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    move v2, v0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    goto :goto_0

    .line 16
    :goto_1
    const/4 v5, 0x0

    .line 17
    move-object v6, p0

    .line 18
    move-object v3, p1

    .line 19
    move-object v4, p2

    .line 20
    invoke-virtual/range {v1 .. v6}, Lh43;->l(ILjava/lang/Object;Ljava/lang/Object;ILbz1;)Lh43;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iput-object p0, v6, Lbz1;->j:Lh43;

    .line 25
    .line 26
    iget-object p0, v6, Lbz1;->k:Ljava/lang/Object;

    .line 27
    .line 28
    return-object p0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 5

    .line 1
    instance-of v0, p1, Lzy1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lzy1;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    :goto_0
    if-nez v0, :cond_2

    .line 12
    .line 13
    instance-of v0, p1, Lbz1;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    move-object v0, p1

    .line 18
    check-cast v0, Lbz1;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object v0, v1

    .line 22
    :goto_1
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {v0}, Lbz1;->a()Lzy1;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move-object v1, v0

    .line 30
    :cond_3
    :goto_2
    if-eqz v1, :cond_5

    .line 31
    .line 32
    new-instance p1, Ld70;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput v0, p1, Ld70;->a:I

    .line 39
    .line 40
    iget v2, p0, Lbz1;->m:I

    .line 41
    .line 42
    iget-object v3, p0, Lbz1;->j:Lh43;

    .line 43
    .line 44
    iget-object v4, v1, Lzy1;->h:Lh43;

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v4, v0, p1, p0}, Lh43;->m(Lh43;ILd70;Lbz1;)Lh43;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lbz1;->j:Lh43;

    .line 54
    .line 55
    iget v0, v1, Lzy1;->i:I

    .line 56
    .line 57
    add-int/2addr v0, v2

    .line 58
    iget p1, p1, Ld70;->a:I

    .line 59
    .line 60
    sub-int/2addr v0, p1

    .line 61
    if-eq v2, v0, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lbz1;->c(I)V

    .line 64
    .line 65
    .line 66
    :cond_4
    return-void

    .line 67
    :cond_5
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lbz1;->k:Ljava/lang/Object;

    .line 36
    iget-object v0, p0, Lbz1;->j:Lh43;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1, p0}, Lh43;->n(ILjava/lang/Object;ILbz1;)Lh43;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lh43;->e:Lh43;

    :cond_1
    iput-object p1, p0, Lbz1;->j:Lh43;

    .line 37
    iget-object p0, p0, Lbz1;->k:Ljava/lang/Object;

    return-object p0
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    .line 1
    iget v0, p0, Lbz1;->m:I

    .line 2
    .line 3
    iget-object v1, p0, Lbz1;->j:Lh43;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v7

    .line 14
    :goto_0
    const/4 v5, 0x0

    .line 15
    move-object v6, p0

    .line 16
    move-object v3, p1

    .line 17
    move-object v4, p2

    .line 18
    invoke-virtual/range {v1 .. v6}, Lh43;->o(ILjava/lang/Object;Ljava/lang/Object;ILbz1;)Lh43;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    sget-object p0, Lh43;->e:Lh43;

    .line 25
    .line 26
    :cond_1
    iput-object p0, v6, Lbz1;->j:Lh43;

    .line 27
    .line 28
    iget p0, v6, Lbz1;->m:I

    .line 29
    .line 30
    if-eq v0, p0, :cond_2

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_2
    return v7
.end method

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, Lbz1;->m:I

    .line 2
    .line 3
    return p0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 1
    new-instance v0, Lgz1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lgz1;-><init>(Lbz1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
