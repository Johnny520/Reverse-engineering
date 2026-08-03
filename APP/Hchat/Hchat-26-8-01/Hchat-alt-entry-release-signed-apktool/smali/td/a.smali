.class public final Ltd/a;
.super Lpd/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final o:Lod/d;

.field public final p:I


# direct methods
.method public constructor <init>(Lod/d;I)V
    .locals 2

    .line 79
    iget-object v0, p1, Lod/d;->i:Ljava/util/List;

    .line 80
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 81
    sget-object v1, Lpd/k;->S:Lpd/k;

    invoke-direct {p0, v1, v0}, Lud/p;-><init>(Lpd/k;I)V

    .line 82
    iput-object p1, p0, Ltd/a;->o:Lod/d;

    .line 83
    iput p2, p0, Ltd/a;->p:I

    return-void
.end method

.method public constructor <init>(Lud/r;Lpd/n;Lod/d;)V
    .locals 3

    .line 1
    iget-object v0, p2, Lud/p;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    sget-object v2, Lpd/k;->S:Lpd/k;

    .line 10
    .line 11
    invoke-direct {p0, v2, v0}, Lud/p;-><init>(Lpd/k;I)V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, Ltd/a;->o:Lod/d;

    .line 15
    .line 16
    iget-object v0, p3, Lod/d;->j:Lod/a;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p2, v2}, Lud/p;->S(I)Lqd/l;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Lqd/l;->N()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    move p1, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v2, p1, Lud/r;->l:Lud/e;

    .line 32
    .line 33
    iget-object v2, v2, Lud/e;->m:Lod/a;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lod/a;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object p3, p3, Lod/d;->k:Ljava/lang/String;

    .line 44
    .line 45
    iget-object p1, p1, Lud/r;->k:Lod/d;

    .line 46
    .line 47
    iget-object p1, p1, Lod/d;->k:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    const/4 p1, 0x4

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const/4 p1, 0x3

    .line 58
    :goto_0
    iput p1, p0, Ltd/a;->p:I

    .line 59
    .line 60
    iget-object p1, p2, Lud/p;->m:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    :goto_1
    if-ge v1, p1, :cond_3

    .line 67
    .line 68
    invoke-virtual {p2, v1}, Lud/p;->S(I)Lqd/l;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-virtual {p0, p3}, Lud/p;->I(Lqd/l;)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    return-void
.end method


# virtual methods
.method public final O()Lud/p;
    .locals 3

    .line 1
    new-instance v0, Ltd/a;

    .line 2
    .line 3
    iget-object v1, p0, Ltd/a;->o:Lod/d;

    .line 4
    .line 5
    iget v2, p0, Ltd/a;->p:I

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ltd/a;-><init>(Lod/d;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 11
    .line 12
    .line 13
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
    instance-of v0, p1, Ltd/a;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-super {p0, p1}, Lud/p;->Y(Lud/p;)Z

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
    check-cast p1, Ltd/a;

    .line 16
    .line 17
    iget-object v0, p0, Ltd/a;->o:Lod/d;

    .line 18
    .line 19
    iget-object v1, p1, Ltd/a;->o:Lod/d;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lod/d;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget v0, p0, Ltd/a;->p:I

    .line 28
    .line 29
    iget p1, p1, Ltd/a;->p:I

    .line 30
    .line 31
    if-ne v0, p1, :cond_2

    .line 32
    .line 33
    :goto_0
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 36
    return p1
.end method

.method public final i0()Lod/d;
    .locals 1

    .line 1
    iget-object v0, p0, Ltd/a;->o:Lod/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j0()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final bridge synthetic k0()Lqd/l;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final l0()Z
    .locals 2

    .line 1
    iget v0, p0, Ltd/a;->p:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-super {p0}, Lud/p;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ltd/a;->o:Lod/d;

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x1

    .line 12
    iget v3, p0, Ltd/a;->p:I

    .line 13
    .line 14
    if-eq v3, v2, :cond_3

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v3, v2, :cond_2

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    if-eq v3, v2, :cond_1

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    if-eq v3, v2, :cond_0

    .line 24
    .line 25
    const-string v2, "null"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string v2, "SELF"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const-string v2, "THIS"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const-string v2, "SUPER"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    const-string v2, "CONSTRUCTOR"

    .line 38
    .line 39
    :goto_0
    const-string v3, " call: "

    .line 40
    .line 41
    const-string v4, " type: "

    .line 42
    .line 43
    invoke-static {v0, v3, v1, v4, v2}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method
