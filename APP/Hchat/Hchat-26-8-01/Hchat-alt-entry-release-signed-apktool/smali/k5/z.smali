.class public final Lk5/z;
.super Li5/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final j:Lk5/u;

.field public final k:Lk5/o;

.field public final l:I

.field public final m:I

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:I

.field public r:I

.field public s:I

.field public t:I


# direct methods
.method public constructor <init>(Lk5/u;La5/a;Lk5/o;ILo5/c;Lo5/c;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lk5/z;->t:I

    .line 6
    .line 7
    iput-object p1, p0, Lk5/z;->j:Lk5/u;

    .line 8
    .line 9
    iput-object p3, p0, Lk5/z;->k:Lk5/o;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p2, p1}, La5/a;->o(Z)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    add-int/2addr p1, p4

    .line 17
    iput p1, p0, Lk5/z;->q:I

    .line 18
    .line 19
    const/4 p3, 0x0

    .line 20
    invoke-virtual {p2, p3}, La5/a;->o(Z)I

    .line 21
    .line 22
    .line 23
    move-result p4

    .line 24
    iput p4, p0, Lk5/z;->l:I

    .line 25
    .line 26
    invoke-virtual {p2, p3}, La5/a;->o(Z)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    iput p2, p0, Lk5/z;->m:I

    .line 31
    .line 32
    iput p7, p0, Lk5/z;->p:I

    .line 33
    .line 34
    invoke-interface {p5, p1}, Lo5/c;->seekTo(I)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    iput p2, p0, Lk5/z;->o:I

    .line 39
    .line 40
    invoke-interface {p6, p1}, Lo5/c;->seekTo(I)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iput p1, p0, Lk5/z;->n:I

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final f1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/z;->k:Lk5/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/o;->getType()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final g1()Ljava/util/List;
    .locals 4

    .line 1
    iget v0, p0, Lk5/z;->t:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    iget-object v2, p0, Lk5/z;->j:Lk5/u;

    .line 5
    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    iget-object v0, v2, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 9
    .line 10
    iget v1, p0, Lk5/z;->s:I

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget v1, p0, Lk5/z;->r:I

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v2, Lk5/u;->u:Lk5/p;

    .line 19
    .line 20
    iget v3, p0, Lk5/z;->q:I

    .line 21
    .line 22
    invoke-virtual {v1, v3}, Lk5/p;->b(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iput v1, p0, Lk5/z;->r:I

    .line 27
    .line 28
    :cond_0
    iget v1, p0, Lk5/z;->r:I

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x2

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->P(I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iget-object v3, v2, Lk5/u;->v:Lk5/p;

    .line 37
    .line 38
    invoke-virtual {v3, v1}, Lk5/p;->b(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iput v1, p0, Lk5/z;->s:I

    .line 43
    .line 44
    :cond_1
    iget v1, p0, Lk5/z;->s:I

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x8

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->N(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iput v0, p0, Lk5/z;->t:I

    .line 53
    .line 54
    :cond_2
    iget v0, p0, Lk5/z;->t:I

    .line 55
    .line 56
    if-lez v0, :cond_3

    .line 57
    .line 58
    iget-object v1, v2, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/lit8 v0, v0, 0x4

    .line 65
    .line 66
    new-instance v2, Lk5/y;

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-direct {v2, p0, v0, v1, v3}, Lk5/y;-><init>(Ljava/lang/Object;III)V

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_3
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 74
    .line 75
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lk5/z;->j:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->r:Lk5/s;

    .line 4
    .line 5
    iget-object v2, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 6
    .line 7
    iget v3, p0, Lk5/z;->r:I

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lk5/u;->u:Lk5/p;

    .line 12
    .line 13
    iget v3, p0, Lk5/z;->q:I

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Lk5/p;->b(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lk5/z;->r:I

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Lk5/z;->r:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x4

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {v1, v0}, Lk5/s;->b(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public final h1()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lk5/z;->j:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->s:Lk5/s;

    .line 4
    .line 5
    iget-object v2, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 6
    .line 7
    iget v3, p0, Lk5/z;->s:I

    .line 8
    .line 9
    if-nez v3, :cond_1

    .line 10
    .line 11
    iget v3, p0, Lk5/z;->r:I

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    iget-object v3, v0, Lk5/u;->u:Lk5/p;

    .line 16
    .line 17
    iget v4, p0, Lk5/z;->q:I

    .line 18
    .line 19
    invoke-virtual {v3, v4}, Lk5/p;->b(I)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iput v3, p0, Lk5/z;->r:I

    .line 24
    .line 25
    :cond_0
    iget v3, p0, Lk5/z;->r:I

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x2

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroidx/lifecycle/x;->P(I)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    iget-object v0, v0, Lk5/u;->v:Lk5/p;

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Lk5/p;->b(I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iput v0, p0, Lk5/z;->s:I

    .line 40
    .line 41
    :cond_1
    iget v0, p0, Lk5/z;->s:I

    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x4

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-virtual {v1, v0}, Lk5/s;->b(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method

.method public final i1()Lac/k;
    .locals 3

    .line 1
    iget v0, p0, Lk5/z;->m:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lac/k;

    .line 6
    .line 7
    iget-object v2, p0, Lk5/z;->j:Lk5/u;

    .line 8
    .line 9
    invoke-direct {v1, v2, p0, v0}, Lac/k;-><init>(Lk5/u;Lk5/z;I)V

    .line 10
    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return-object v0
.end method

.method public final j1()Ljava/util/List;
    .locals 4

    .line 1
    iget v0, p0, Lk5/z;->t:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lk5/z;->j:Lk5/u;

    .line 7
    .line 8
    iget-object v1, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 9
    .line 10
    iget v2, p0, Lk5/z;->s:I

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    iget v2, p0, Lk5/z;->r:I

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    iget-object v2, v0, Lk5/u;->u:Lk5/p;

    .line 19
    .line 20
    iget v3, p0, Lk5/z;->q:I

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Lk5/p;->b(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iput v2, p0, Lk5/z;->r:I

    .line 27
    .line 28
    :cond_0
    iget v2, p0, Lk5/z;->r:I

    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x2

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroidx/lifecycle/x;->P(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iget-object v0, v0, Lk5/u;->v:Lk5/p;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Lk5/p;->b(I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput v0, p0, Lk5/z;->s:I

    .line 43
    .line 44
    :cond_1
    iget v0, p0, Lk5/z;->s:I

    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x8

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iput v0, p0, Lk5/z;->t:I

    .line 53
    .line 54
    :cond_2
    iget v0, p0, Lk5/z;->t:I

    .line 55
    .line 56
    if-lez v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0}, Lk5/z;->g1()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, Lk5/x;

    .line 63
    .line 64
    invoke-direct {v1, p0, v0}, Lk5/x;-><init>(Lk5/z;Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 69
    .line 70
    return-object v0
.end method
